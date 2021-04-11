# input = n data queries, n event patterns, m event relations
# output: event ID tuples that satisfy all constraints

# event relationships are sorted based on the relationship type (process events and network events) and the sum of the involved event pattern's pruning scores
# main loop processes event relationships returned from the sorted list, executes data queries, and generates result tuples
# As the loop continues, new tuple sets are created and put into M, and old tuple sets are updated, filtered, or merged.
# after all event relationships, any unexecuted queries are executed and results are put into M
# merge tuples in M so all event patterns are mapped to the same tuple set that satisfy all constraints 

import collections 
import operator
import nltk
import psycopg2
from prettytable import PrettyTable

resultSet = set()

def printResults(records):
	x = PrettyTable()

	x.field_names = ["ID", "UserName", "EventID", "LogHost", "LogonID", "DomainName", "ParentProcessName", "ParentProcessID", "ProcessName", "Time",
				 "ProcessID", "LogonTypeDescription", "LogonType", "Source", "AuthenticationPackage", "Destination", "SubjectUserName",
				 "SubjectLogonID", "SubjectDomainName", "Status"]

	for i in records:
		i = list(i)
		x.add_row(i)

	print(x)

def executeQuery(queryString):
	conn = psycopg2.connect("dbname=projectdb user=postgres password=leoeatsbroccoli")
	cur = conn.cursor()

	#needs to execute whatever query argument was passed to the function
	cur.execute(queryString)

	records = cur.fetchall()

	for i in records:
		resultSet.add(i)

# pruning score function computed for every event based on the number of constraints specified 
def pruningScore(query):
	score = 0
	# based on the number of constraints specified 
	# we determine this to be the constraints after the WHERE in a SFW query 
	start = 0
	constraints = '' 
	queryTokens = nltk.word_tokenize(query)

	for word in queryTokens:
		if str(word) == 'WHERE':
			start = 1
			score += 1				# at least 1 constraint found
			continue
		if start == 1:
			constraints += str(word) + " "
			if str(word) == "AND" or str(word) == "OR":		# additional constraints
				score += 1
	return score 

M = dict() 
pruningScores = dict() 
executed = list()
# main scheduler 
def queryScheduler(queries):
	
	for query in queries:
		# caluclate pruning score 
		pruningScores[query] = pruningScore(query)
	sortedScores = dict(sorted(pruningScores.items(), key=lambda item: item[1], reverse=True)) 		# Sort queries based on scores

	# TO BE INTEGRATED WITH THE QUERY ENGINE CODE 
	for query in sortedScores:
		# change executeQuery function in QE to take in a query and return the results 
		# M[query] = executeQuery(str(query))					# map M that stores the mapping from the event pattern ID to the set of event ID tuples that its execution results belong to. 

		executeQuery(query)

		executed.append(query)

	print("Query returned " + str(len(resultSet)) + " unique log events")
	printResults(resultSet)

	return sortedScores

def main():
	testQueries = {"SELECT * FROM hostlogs WHERE processname='dllhost.exe';", "SELECT * FROM hostlogs WHERE processname='dllhost.exe' AND time=5334792;", "SELECT * FROM hostlogs WHERE processname='dllhost.exe' AND time=5334792 AND processid='0x1110';"}
	print("Initial Query Order: ", testQueries)
	print("Optimized Query Order: ", queryScheduler(testQueries))

if __name__ == '__main__':
	main()