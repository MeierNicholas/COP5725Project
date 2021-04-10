import psycopg2
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


	# MULTIEVENT QUERY INSTANCE 
	def enterMultievent(self, ctx):
		self.multieventFlag = 1
   
	def exitMultievent(self, ctx):
		self.multieventFlag = 0
		
	# DEPENDENCY QUERY INSTANCE 
	def enterDependency(self, ctx):
		self.dependencyFlag = 1
	
	def exitDependency(self, ctx):
		self.dependencyFlag = 0


	# ANOMALY QUERY INSTANCE
	def enterAnomaly(self, ctx):
		self.anomalyFlag = 1
	
	def exitAnomaly(self, ctx):
		self.anomalyFlag = 0 


	# GLOBAL CONSTRAINT INSTANCE
	def enterGlobal_cstr(self, ctx):
		self.global_cstrFlag = 1 

	def exitGlobal_cstr(self, ctx):
		self.global_cstrFlag = 0


	# TIME WINDOW
	def enterTwind(self, ctx):
		self.twindFlag = 1 

	def exitTwind(self, ctx):
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
		pass

	def exitEntity(self, ctx):
		pass

	def enterEntity_type(self, ctx):
		pass

	def exitEntity_type(self, ctx):
		pass


	def enterOp_exp(self, ctx):
		pass

	def exitOp_exp(self, ctx):
		pass


	def enterRet(self, ctx):
		pass

	def exitRet(self, ctx):
		pass

	def enterRes(self, ctx):
		pass

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
		pass

	def exitD_query(self, ctx):
		pass

	def enterOp_edge(self, ctx):
		pass

	def exitOp_edge(self, ctx):
		pass

	def enterA_query(self, ctx):
		pass

	def exitA_query(self, ctx):
		pass

	def enterEvt_id(self, ctx):
		pass

	def exitEvt_id(self, ctx):
		pass

	def enterRename_id(self, ctx):
		pass

	def exitRename_id(self, ctx):
		pass


	def enterDatetime(self, ctx):
		pass

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



tokenList = []

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


def executeQuery():
	conn = psycopg2.connect("dbname=projectdb user=postgres password=leoeatsbroccoli")
	cur = conn.cursor()

	#needs to execute whatever query argument was passed to the function
	cur.execute("SELECT * FROM hostlogs WHERE processname='dllhost.exe'")

	records = cur.fetchall()
	return records

def printResults(records):
	x = PrettyTable()

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
	printNodes(tree)
	printer = extendedListener()	
	walker = ParseTreeWalker()
	walker.walk(printer, tree)

	print(printer.global_constraints)

#	records = executeQuery()
#	printResults(records)

if __name__ == '__main__':
	main()