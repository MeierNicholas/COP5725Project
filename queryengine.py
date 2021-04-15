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
		self.eventPatterns = list()
		self.tempRel = dict()
		self.order = dict() 

		# flags for query types
		self.anomalyFlag = 0
		self.dependencyFlag = 0
		self.multieventFlag = 0 

		# flag for constraints 
		self.attr_cstrFlag = 0
		self.twindFlag = 0

		# Entity flags
		self.entityFlag = 0 
		self.m_queryFlag = 0

		#MultiEvent flags
		self.evtpattFlag = 0

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
		self.aggregateResult = '' 
		self.RES = '' 

		#extra flags
		self.equalsFlag = 0
		self.temporalFlag = 0

		self.previousWord = ''

		self.intColumns = ['id', 'eventid', 'time', 'duration', 'protocol', 'srcpackets', 'dstpackets']

	def exitAiql(self, ctx):

		self.queries = list() 	# list of generated queries 

		# print(self.firstEvent + " " + "before" + " " + self.secondEvent)
		# print(self.returnValue)
		if self.temporalFlag == 1:
			self.tempRel[self.firstEvent] = (self.multievents[0][0][2], self.multievents[0][2][2])
			self.tempRel[self.secondEvent] = (self.multievents[1][0][2], self.multievents[1][2][2])

		# CONVERT EVERYTHING TO SQL 
		self.SELECT = "SELECT * " 
		self.FROM = "FROM " 
		self.WHERE = " WHERE "

		# distinct, count, and aggregate returns
		if self.distinctResults == 1:
			self.SELECT = "SELECT DISTINCT *"
		if self.countResults == 1:
			self.SELECT = "SELECT COUNT(*)"
		if len(self.aggregateResult) != 0:
			#then we must aggregate results
			self.SELECT = "SELECT " + self.aggregateResult + "(*) " 

		# Keep track of event_ids and check here if the return value is an event ID or an attribute 


		# query to network or host logs
		if (self.anomalyFlag == 1):
			self.FROM += "netlogs"
		else: 
			self.FROM += "hostlogs"

		print('\n\n')

		# Add global constraints to WHERE clause 
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
						if self.equalsFlag == 1 and self.global_constraints[i][0] not in self.intColumns:
							self.WHERE += '\''
							self.WHERE += word
							self.WHERE += '\''
							self.equalsFlag = 0
							continue

						if word == "=":
							self.equalsFlag = 1

						self.WHERE += word + " "

					if i < len(self.global_constraints)-1:
						self.WHERE += " AND "

			self.sfw = self.SELECT + self.FROM + self.WHERE
			self.tempWHERE = self.WHERE
			if self.dependencyFlag != 1:
				self.queries.append(self.sfw)


		for i in range(0, len(self.multievents)):
			if self.multievents[i][1] == "execute":
				self.WHERE += " AND ParentProcessName=\'"
				self.WHERE += self.multievents[i][0][2]
				self.WHERE += '\' '
				self.WHERE += "AND ProcessName=\'"
				self.WHERE += self.multievents[i][2][2]
				self.WHERE += '\' '
			print("WHERE: ", self.WHERE)
			self.sfw = self.SELECT + self.FROM + self.WHERE	
			self.WHERE = self.tempWHERE

			self.queries.append(self.sfw)
		
	

		# Conversion for dependency queries
		if self.dependencyFlag == 1:
			entities = list()
			edges = list()
			for i in range(len(self.dependencies)):
				if self.dependencies[i][0] == 'ENTITY':
					entities.append([self.dependencies[i][1], self.dependencies[i][2]])
					if i < len(self.dependencies)-1:
						edges.append([self.dependencies[i][2], self.dependencies[i+1][0], self.dependencies[i+1][1], self.dependencies[i+2][2]])

			for edge in edges: 
				selectfrom = "SELECT * FROM hostlogs "
				if len(self.global_constraints) != 0:
					where = self.WHERE + " AND "
				else:
					where = "WHERE "

				# which way to read
				if edge[2] != '4688' and edge[2] != '4689':		# not a process operation 
					where += ("EventID = " + edge[2])
				else:
					if edge[1] == '<-':
						where += ("EventID = " + edge[2] + " AND ProcessName = \'" + edge[0] + "\'")
					elif edge[1] == '->':
						where += ("EventID = " + edge[2] + " AND ProcessName = \'" + edge[3] + "\'")

				fullQuery = selectfrom + where
				self.queries.append(fullQuery)

			# pass additional forward/backward key list to sort and join the output in scheduler
			# sort for proc list
			self.processes = list()
			for entity in entities:
				if entity[0] == 'proc':
					if entity[1] == self.RES:
						self.processes.append(entity[1] + '*')
					else:
						self.processes.append(entity[1])

			i = (len(self.processes))-1
			if (self.forwardDependency):
				for j in range(i):
					self.order[self.queries[j]] = self.processes[j]

			elif (self.backwardDependency):
				while i != 0:
					self.order[self.queries[i]] = self.processes[i]
					i -= 1
				self.order[self.queries[0]] = self.processes[0]
			

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
		#print(ctx.getText())
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
		# Updated and handled in ATTRIBUTE CONSTRAINT
		pass

	def enterAttr_cstr(self, ctx):
		self.attr_cstrFlag = 1
		self.attr_cstr = list()


	def exitAttr_cstr(self, ctx):
		if self.global_cstrFlag == 1:
			self.global_constraints.append(self.attr_cstr)
		self.attr_cstrFlag = 0

	def enterEvt_patt(self, ctx):
		self.evtpattFlag = 1
		self.evt_patt = list()

	def exitEvt_patt(self, ctx):
		self.multievents.append(self.evt_patt)
		self.evtpattFlag = 0

	def enterAttr_rel(self, ctx):
		pass

	def exitAttr_rel(self, ctx):
		pass

	def enterTemp_rel(self, ctx):
		self.temporalFlag = 1
		pass

	def exitTemp_rel(self, ctx):
		self.relationship = ctx.getText()
		self.start = self.relationship.find("before")
		self.firstEvent = self.relationship[0:self.start]
		self.secondEvent = self.relationship[self.start+6:]
		print(self.firstEvent + " " + "before" + " " + self.secondEvent)
		pass

	def enterEvt_rel(self, ctx):
		pass

	def exitEvt_rel(self, ctx):
		pass

	def enterEntity(self, ctx):
		self.entityFlag = 1			# To store the entity and id, append to the entity list and clear after adding to query type
		self.entity.append("ENTITY")
		#print(ctx.getText())

	def exitEntity(self, ctx):
		if self.dependencyFlag == 1:
			self.dependencies.append(self.entity)
		if self.multieventFlag == 1:
			self.evt_patt.append(self.entity)
		self.entityFlag =0
		self.entity = list() 

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

	def enterM_query(self, ctx):
		self.m_queryFlag = 1

	def exitM_query(self, ctx):
		self.m_queryFlag = 0

	def enterD_query(self, ctx):
		direction = ctx.getText()[0:7]
		if direction == 'forward':
			self.forwardDependency = 1
		else:
			self.backwardDependency = 1

	def exitD_query(self, ctx):
		pass

	def enterOp_edge(self, ctx):
		if ctx.getText()[0:2] == '->': 
			self.opEdgeFwd = 1
		elif ctx.getText()[0:2] == '<-': 
			self.opEdgeBwd = 1

	def exitOp_edge(self, ctx):
		self.opEdgeBwd = 0
		self.opEdgeFwd = 0

	def enterEvt_id(self, ctx):
		if self.entityFlag == 1:
			self.entity.append(ctx.getText())
		elif self.outputResult == 1:
			self.RES = ctx.getText()

	def exitEvt_id(self, ctx):
		self.returnValue = ctx.getText()
		pass

	def enterDatetime(self, ctx):
		if self.twindFlag == 1:
			self.twind.append(ctx.getText())

	def exitDatetime(self, ctx):
		pass

	def enterAttr(self, ctx):
		if self.attr_cstrFlag == 1:
			self.attr_cstr.append(ctx.getText())
		elif self.outputResult == 1:
			self.RES = ctx.getText()

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
		if self.outputResult == 1:
			self.aggregateResult = (ctx.getText())

	def exitAgg_func(self, ctx):
		pass

	def enterKeyword(self, ctx):
		self.keyword = ctx.getText()
		self.eventID = 0

		if (str(self.keyword)) == 'fail': 
			self.eventID = 4625
		elif (str(self.keyword)) == 'execute': 
			self.eventID = 4688
		elif (str(self.keyword)) == 'end':
			self.eventID = 4689
		elif (str(self.keyword)) == 'explicit': 
			self.eventID = 4648
		elif (str(self.keyword)) == 'priv': 
			self.eventID = 4672
		elif (str(self.keyword)) == 'shutdown': 
			self.eventID = 1100
		elif (str(self.keyword)) == 'connect': 
			self.eventID = 1

		if self.dependencyFlag == 1:
			if self.opEdgeFwd == 1: 
				self.dependencies.append(["->", str(self.eventID)])
			elif self.opEdgeBwd == 1:
				self.dependencies.append(["<-", str(self.eventID)])

		if self.multieventFlag == 1:
			self.evt_patt.append(str(self.keyword))



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
def queryScheduler(queries, flag, tempRel, order):	
	dependencyResults = [None] * len(order)

	for query in queries:
		# caluclate pruning score 
		pruningScores[query] = pruningScore(query)
	sortedScores = dict(sorted(pruningScores.items(), key=lambda item: item[1], reverse=True)) 		# Sort queries based on scores

	executedOrder = list()
	trueOrder = list()

	if len(order) != 0:
		for query in sortedScores:
			executedOrder.append(order[query])
		for key in order.keys():
			trueOrder.append(order[key])

	# TO BE INTEGRATED WITH THE QUERY ENGINE CODE 
	for query in sortedScores:
		# change executeQuery function in QE to take in a query and return the results 
		# M[query] = executeQuery(str(query))					# map M that stores the mapping from the event pattern ID to the set of event ID tuples that its execution results belong to. 

		executeQuery(query)

		# Filter result as it's executed
		if len(order) != 0:
			dependencyResults[trueOrder.index(order[query])] = resultSet

		executed.append(query)

	print("Query returned " + str(len(resultSet)) + " unique log events")

	if len(tempRel) != 0:
		listOne = list()
		listTwo = list()
		finalList = list()
		condition = True

		for i in resultSet:
			if i[6] == tempRel[list(tempRel.keys())[0]][0] and i[8] == tempRel[list(tempRel.keys())[0]][1]:
				listOne.append(i)
			if i[6] == tempRel[list(tempRel.keys())[1]][0] and i[8] == tempRel[list(tempRel.keys())[1]][1]:
				listTwo.append(i)

		for i in listOne:
			for j in listTwo:
				if int(i[9]) > int(j[9]):
					condition = False
			if condition == True:
				finalList.append(i)

		printResults(finalList, flag)
		return

	if len(order) != 0:
		filteredResult = list()
		i = len(order)-1
		while i != 0:
			if i > 0:
				for result in dependencyResults[i]:
					for result2 in dependencyResults[i-1]:
						if result[9] > result2[9]:
							if '*' in trueOrder[i]:
								filteredResult.append(result)
			i-=1
		printResults(filteredResult, flag)
		return

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


recordsList1 = list()
recordsList2 = list()


def executeQuery(queryString):
	conn = psycopg2.connect("dbname=postgres user=postgres password=leoeatsbroccoli")
	cur = conn.cursor()

	testlist = list()

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

	#print("WHAT: ",printer.tempRel)

	# Schedule & Run generated queries 
	queryScheduler(printer.queries, printer.anomalyFlag, printer.tempRel, printer.order)	

	# testQueries = {"SELECT * FROM hostlogs WHERE processname='dllhost.exe';", "SELECT * FROM hostlogs WHERE processname='dllhost.exe' AND time=5334792;", "SELECT * FROM hostlogs WHERE processname='dllhost.exe' AND time=5334792 AND processid='0x1110';"}
	# print("Initial Query Order: ", testQueries)
	# print("Optimized Query Order: ", queryScheduler(testQueries))

#	records = executeQuery()
	#printResults(resultSet, printer.anomalyFlag)

if __name__ == '__main__':
	main()