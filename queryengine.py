import psycopg2
from prettytable import PrettyTable

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
	records = executeQuery()
	printResults(records)

if __name__ == '__main__':
	main()