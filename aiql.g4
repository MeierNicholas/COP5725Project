grammar aiql;

aiql 			: multievent | dependency | anomaly; 

// Different types of queries 
multievent 		: (global_cstr)* (m_query)+;
dependency 		: (global_cstr)* (d_query);
anomaly 		: 'anomaly' (global_cstr)+; 


// Global constraint 
global_cstr		: cstr | '(' twind ')';  		
twind 			: 'from' datetime 'to' datetime;	

// Attribute constraints 		
cstr 			: attr_cstr;
attr_cstr		: attr op val; 

// Events & event attributes 
evt_patt 		: entity op_exp entity evt? ('(' twind ')')?;
evt 			: 'as' evt_id ('[' attr_cstr ']')?;

// Relationships 
rel 			: attr_rel | temp_rel;
attr_rel		: evt_id'.'attr op evt_id'.'attr
				| evt_id op evt_id;
temp_rel		: evt_id 'before' evt_id;
evt_rel			: 'with' rel (',' rel)*;

// Network or host logs 
entity			: entity_type evt_id? ('[' attr_cstr ']')?;		
entity_type		: STRING;							// specify process or connection

// Logical expressions 
op_exp			: keyword
				| '!' op_exp
				| op_exp ( '&&' | '||' ) op_exp
				| '(' op_exp ')';

// Return values & filters 
ret 			: 'ret' 'count'? 'distinct'? res (',' res)*;
res				: evt_id('.'attr)?
				| attr
				| agg_func'(' res ')'
				| 'as' rename_id;

// Multievent query 
m_query 		: evt_patt+ evt_rel? ret;

// Dependency query 
d_query 		: (('forward' | 'backward') ':')? (entity op_edge)+ entity ret;
op_edge			: ('->' | '<-') '[' op_exp ']';


// Variables
evt_id 			: (STRING (INT)?) | filename; 
rename_id		: STRING;
datetime		: INT; 		
attr 			: STRING; 			 


// Values, operations, functions 
INT	: '0' | '0'..'9'+;
STRING			: LETTER+;
LETTER			: 'a'..'z' | 'A'..'Z';
filename 		: STRING ('.' STRING)?;
WS : [ \t\r\n]+ -> skip ;
val				: STRING(INT)?
				| INT
				| 'null'; 
op 				: '<' | '>' | '=' | '<=' | '=>'; 
agg_func 		: 'sum' | 'avg'; 
keyword 		: 'execute' | 'fail' | 'priv' | 'explicit' | 'shutdown' | 'connect'; 
