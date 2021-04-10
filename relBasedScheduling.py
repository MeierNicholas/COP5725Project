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
		M[query] = executeQuery(query)					# map M that stores the mapping from the event pattern ID to the set of event ID tuples that its execution results belong to. 
		executed.append(query)


	return sortedScores

def main():
	testQueries = {"SELECT test FROM table WHERE a = 5 AND b = 7", "SELECT test2 FROM table WHERE a = 3", "SELECT test3 FROM table WHERE a = 1 AND b = 9 AND c = 12"}
	print(queryScheduler(testQueries))

if __name__ == '__main__':
	main()