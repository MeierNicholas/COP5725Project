import psycopg2
import collections 
import operator
import nltk
from prettytable import PrettyTable
from antlr4 import *
import antlr4
from aiqlLexer import aiqlLexer
from aiqlParser import aiqlParser
from aiqlListener import aiqlListener
import sys


class extendedListener(aiqlListener):

	def enterAiql(self, ctx): 
		self.global_constraints = list()
		self.multievents = list()
		self.dependencies = list() 
		self.anomalies = list()
		self.entity = list()

		# flags for query types
		self.anomalyFlag = 0
		self.dependencyFlag = 0
		self.multieventFlag = 0 

		# flag for constraints 
		self.attr_cstrFlag = 0
		self.twindFlag = 0

		# Entity flags
		self.entityFlag = 0 

		# Dependency flags 
		self.forwardDependency = 0
		self.backwardDependency = 0
		self.opEdgeFwd = 0
		self.opEdgeBwd = 0 

		# Flags for return statement
		self.retStatement = 0
		self.outputResult = 0 	
		self.distinctResults = 0	
		self.countResults = 0

	def exitAiql(self, ctx):

		self.queries = list() 	# list of generated queries 

		# CONVERT EVERYTHING TO SQL 
		self.SELECT = "SELECT * " 
		self.FROM = "FROM " 
		self.WHERE = " WHERE "


		# query to network or host logs
		if (self.anomalyFlag == 1):
			self.FROM += "netlogs"
		else: 
			self.FROM += "hostlogs"

		print("DEPENDENCIES:", self.dependencies)

		# Add global constraints to WHERE clause 
		print(self.global_constraints)
		if len(self.global_constraints) != 0:
			
			size = range(len(self.global_constraints))
			for i in size:
				if self.global_constraints[i][0] == 'TIMEWINDOW':
					twindstr = "time BETWEEN "
					twindstr += self.global_constraints[i][1]
					twindstr += " AND "
					twindstr += self.global_constraints[i][2]
					self.WHERE += twindstr

					if i < len(self.global_constraints)-1:
						self.WHERE += " AND "
						
				else: 
					for word in self.global_constraints[i]:
						self.WHERE += word + " "
					if i < len(self.global_constraints)-1:
						self.WHERE += " AND "

			self.sfw = self.SELECT + self.FROM + self.WHERE

		else:
			self.sfw = self.SELECT + self.FROM 


		self.queries.append(self.sfw)

	# MULTIEVENT QUERY INSTANCE 
	def enterMultievent(self, ctx):
		self.multieventFlag = 1
		
	# DEPENDENCY QUERY INSTANCE 
	def enterDependency(self, ctx):
		self.dependencyFlag = 1
	
	# ANOMALY QUERY INSTANCE
	def enterAnomaly(self, ctx):
		self.anomalyFlag = 1

	# GLOBAL CONSTRAINT INSTANCE
	def enterGlobal_cstr(self, ctx):
		self.global_cstrFlag = 1 

	def exitGlobal_cstr(self, ctx):
		self.global_cstrFlag = 0


	# TIME WINDOW
	def enterTwind(self, ctx):
		self.twindFlag = 1 
		self.twind = list()
		self.twind.append("TIMEWINDOW")

	def exitTwind(self, ctx):
		if self.global_cstrFlag == 1:
			self.global_constraints.append(self.twind)
		self.twindFlag = 0


	def enterCstr(self, ctx):
		pass

	def exitCstr(self, ctx):
		pass


	def enterAttr_cstr(self, ctx):
		self.attr_cstrFlag = 1
		self.attr_cstr = list()


	def exitAttr_cstr(self, ctx):
		if self.global_cstrFlag == 1:
			self.global_constraints.append(self.attr_cstr)
		self.attr_cstrFlag = 0

	def enterEvt_patt(self, ctx):
		pass

	def exitEvt_patt(self, ctx):
		pass

	def enterEvt(self, ctx):
		pass

	def exitEvt(self, ctx):
		pass

	def enterRel(self, ctx):
		pass

	def exitRel(self, ctx):
		pass


	def enterAttr_rel(self, ctx):
		pass

	def exitAttr_rel(self, ctx):
		pass

	def enterTemp_rel(self, ctx):
		pass

	def exitTemp_rel(self, ctx):
		pass

	def enterEvt_rel(self, ctx):
		pass

	def exitEvt_rel(self, ctx):
		pass

	def enterEntity(self, ctx):
		self.entityFlag = 1			# To store the entity and id, append to the entity list and clear after adding to query type
		self.entity.append("ENTITY")

	def exitEntity(self, ctx):
		if self.dependencyFlag == 1:
			self.dependencies.append(self.entity)
		self.entityFlag =0 

	def enterEntity_type(self, ctx):
		if self.entityFlag == 1:
			self.entity.append(ctx.getText())

	def exitEntity_type(self, ctx):
		pass


	def enterOp_exp(self, ctx):
		pass

	# Handling return statements 
	def enterRet(self, ctx):
		self.retStatement = 1

		# Accounting for distinct results
		if "distinct" in ctx.getText():
			self.distinctResults = 1

		if "count" in ctx.getText():
			self.countResults = 1

	def exitRet(self, ctx):
		self.retStatement = 0

	def enterRes(self, ctx):
		if self.retStatement == 1:
			self.outputResult = 1
			# NOTE: The return statement can be a event, attribute, aggregate function of an attribute, or use HAVING 
			# the return attribute can also be renamed using "AS <newname>"

	def exitRes(self, ctx):
		pass

	def enterGroup_by(self, ctx):
		pass

	def exitGroup_by(self, ctx):
		pass

	def enterRet_filter(self, ctx):
		pass

	def exitRet_filter(self, ctx):
		pass

	def enterM_query(self, ctx):
		pass

	def exitM_query(self, ctx):
		pass

	def enterD_query(self, ctx):
		direction = ctx.getText()[0:7]
		if direction == 'forward':
			forwardDependency = 1
		else:
			backwardDependency = 1

	def exitD_query(self, ctx):
		pass

	def enterOp_edge(self, ctx):
		if ctx.getText()[0:2] == '->': 
			opEdgeFwd = 1
		elif ctx.getText()[0:2] -- '<-': 
			opEdgeBwd = 1

	def exitOp_edge(self, ctx):
		pass

	def enterEvt_id(self, ctx):
		if self.entityFlag == 1:
			self.entity.append(ctx.getText())

	def exitEvt_id(self, ctx):
		pass

	def enterRename_id(self, ctx):
		pass

	def exitRename_id(self, ctx):
		pass


	def enterDatetime(self, ctx):
		if self.twindFlag == 1:
			self.twind.append(ctx.getText())

	def exitDatetime(self, ctx):
		pass

	def enterAttr(self, ctx):
		if self.attr_cstrFlag == 1:
			self.attr_cstr.append(ctx.getText())

	def exitAttr(self, ctx):
		pass


	def enterVal(self, ctx):
		if self.attr_cstrFlag == 1:
			self.attr_cstr.append(ctx.getText())

	def exitVal(self, ctx):
		pass


	def enterOp(self, ctx):
		if self.attr_cstrFlag == 1: 
			self.attr_cstr.append(ctx.getText())

	def exitOp(self, ctx):
		pass

	def enterAgg_func(self, ctx):
		pass

	def exitAgg_func(self, ctx):
		pass

	def enterKeyword(self, ctx):
		self.keyword = ctx.getText()
		self.eventID = 0

		if (str(self.keyword)) == 'fail': 
			self.eventID = 4625
		elif (str(self.keyword)) == 'execute': 
			self.eventID = 4688
		elif (str(self.keyword)) == 'explicit': 
			self.eventID = 4648
		elif (str(self.keyword)) == 'priv': 
			self.eventID = 4672
		elif (str(self.keyword)) == 'shutdown': 
			self.eventID = 1100
		elif (str(self.keyword)) == 'connect': 
			self.eventID = 1

		if self.dependencyFlag == 1:
			self.dependencies.append("EventID = " + str(self.eventID))



tokenList = []
resultSet = set()

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
def queryScheduler(queries, flag):
	
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
	printResults(resultSet, flag)

	return sortedScores

def generateQuery(tokens):
	select = "SELECT * "
	fromCondition = "FROM hostlogs "
	where = "WHERE "

	for i in range(0, len(tokens)):
		print(tokens[i])

		if str(tokens[i]) == "agentid":
			where += "domainname=" + tokens[i+2]

		if str(tokens[i]) == "from":
			where += " AND time BETWEEN " + tokens[i+1] + " AND " + tokens[i+3]

	query = select + fromCondition + where

	return query


def executeQuery(queryString):
	conn = psycopg2.connect("dbname=projectdb user=postgres password=leoeatsbroccoli")
	cur = conn.cursor()

	#needs to execute whatever query argument was passed to the function
	cur.execute(queryString)

	records = cur.fetchall()

	for i in records:
		resultSet.add(i)

def printResults(records, flag):
	x = PrettyTable()

	if flag==1:
		x.field_names = ["ID", "Time", "Duration", "SrcDevice", "DstDevice", "Protocol", "SrcPort", "DstPort", "SrcPackets", "DstPackets", "SrcBytes", "DstBytes"]
	else:
		x.field_names = ["ID", "UserName", "EventID", "LogHost", "LogonID", "DomainName", "ParentProcessName", "ParentProcessID", "ProcessName", "Time",
				 "ProcessID", "LogonTypeDescription", "LogonType", "Source", "AuthenticationPackage", "Destination", "SubjectUserName",
				 "SubjectLogonID", "SubjectDomainName", "Status"]

	for i in records:
		i = list(i)
		x.add_row(i)

	print(x)

def printNodes(tree):
	if tree.getText() == "<EOF>":
		return
	elif isinstance(tree, antlr4.tree.Tree.TerminalNode):
		print("{0}TOKEN='{1}'".format("  ", tree.getText()))
	else:
		for child in tree.children:
			printNodes(child)

def main():
	lexer = aiqlLexer(antlr4.StdinStream())
	stream = antlr4.CommonTokenStream(lexer)
	parser = aiqlParser(stream)
	tree = parser.aiql()
	#printNodes(tree)
	printer = extendedListener()	
	walker = ParseTreeWalker()
	walker.walk(printer, tree)

	print(printer.queries)

	# Schedule & Run generated queries 
	#queryScheduler(printer.queries, printer.anomalyFlag)	

	# testQueries = {"SELECT * FROM hostlogs WHERE processname='dllhost.exe';", "SELECT * FROM hostlogs WHERE processname='dllhost.exe' AND time=5334792;", "SELECT * FROM hostlogs WHERE processname='dllhost.exe' AND time=5334792 AND processid='0x1110';"}
	# print("Initial Query Order: ", testQueries)
	# print("Optimized Query Order: ", queryScheduler(testQueries))

#	records = executeQuery()
#	printResults(records, printer.anomalyFlag)

if __name__ == '__main__':
	main()