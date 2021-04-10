import psycopg2
from prettytable import PrettyTable
from antlr4 import *
import antlr4
from aiqlLexer import aiqlLexer
from aiqlParser import aiqlParser
from aiqlListener import aiqlListener
import sys

class extendedListener(aiqlListener):
	def enterAttr_cstr(self, ctx):
		print(ctx.op())

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
	# lexer = aiqlLexer(antlr4.StdinStream())
	# stream = antlr4.CommonTokenStream(lexer)
	# parser = aiqlParser(stream)
	# tree = parser.aiql()
	# printNodes(tree)
	# printer = extendedListener()	
	# walker = ParseTreeWalker()
	# walker.walk(printer, tree)


	records = executeQuery()
	printResults(records)

if __name__ == '__main__':
	main()