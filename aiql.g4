grammar aiql;

aiql 			: multievent | dependency | anomaly; 

// Different types of queries 
multievent 		: (global_cstr)* (m_query)+;
dependency 		: (global_cstr)* (d_query);
anomaly 		: (global_cstr)* (a_query); 


// Global constraint 
global_cstr		: cstr | '(' twind ')';  		
twind 			: 'from' datetime 'to' datetime;	
datetime		: INT'/'INT'/'INT | INT; 					 

// Attribute constraints 		
cstr 			: attr_cstr 
				| '!'? val
				| attr 'not'? 'in' '(' val (',' val )* ')';
attr_cstr		: attr op val; 
attr 			: STRING; 

// Events & event attributes 
evt_patt 		: entity op_exp entity evt? ('(' twind ')')?;
evt 			: 'as' evt_id ('[' attr_cstr ']')?;

// Relationships 
rel 			: attr_rel | temp_rel;
attr_rel		: evt_id'.'attr op evt_id'.'attr
				| evt_id op evt_id;
temp_rel		: evt_id ('before' | 'after' | 'within') evt_id;
evt_rel			: 'with' rel (',' rel)*;

// Network or host logs 
entity			: entity_type evt_id? ('[' attr_cstr ']')?;		
entity_type		: 'net' | 'host';

// Logical expressions 
op_exp			: op
				| '!' op_exp
				| op_exp ( '&&' | '||' ) op_exp
				| '(' op_exp ')';

// Return values & filters 
ret 			: 'ret' 'count'? 'distinct'? res (',' res)*;
res				: evt_id('.'attr)?
				| agg_func'(' res ')'
				| 'as' rename_id;
group_by		: 'group by' res (',' res)*;
ret_filter			: 'having' (res | cstr)
				| 'sort by' attr (',' attr)* ('asc' | 'desc')?
				| 'top' INT; 

// Multievent query 
m_query 		: evt_patt + evt_rel? ret ret_filter?;

// Dependency query 
d_query 		: (('forward' | 'backward') ':')? (entity op_edge)+ entity ret ret_filter?;
op_edge			: ('->' | '<-') '[' op_exp ']';

// Anomaly query
a_query			: evt_patt evt_rel? ret ret_filter?;

// Event ids and naming conventions 
evt_id 			: INT; 
rename_id		: STRING;

// Values, operations, functions 
val				: STRING
				| INT
				| 'null'; 
op 				: '<' | '>' | '=' | '<=' | '=>'; 
agg_func 		: 'sum' | 'count' | 'avg'; 