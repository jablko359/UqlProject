grammar Uql;
queries: returnquery (NEWLINE returnquery)* ;
returnquery:  query RETURN tablearray sortexpression ENDTOKEN| query RETURN tablearray ENDTOKEN ;
query: expression | query LOGIC query | '('query')';
expression : STRING NUMERICOPERATOR NUMBER | STRINGKEYWORD STRINGOPERATOR STRING | NUMERICKEYWORD EQUALS NUMBER | STRINGKEYWORD EQUALS STRING |
             STRINGKEYWORD ARRAYOPERATOR stringarray | NUMERICKEYWORD ARRAYOPERATOR numericarray;
tablearray: STRINGKEYWORD(','STRINGKEYWORD)* | ALLSELECTOR;
numericarray: '['NUMBER(','NUMBER)*']';
stringarray: '['STRING(','STRING)*']';
sortexpression: SORT SORTDIRECTION 'by' STRINGKEYWORD | SORT WS* SORTDIRECTION WS* 'by' WS* NUMERICKEYWORD;


LOGIC : 'and' | 'or';
STRINGKEYWORD : 'Track' | 'Genre' | 'Media' | 'Album' | 'Artist' | 'Composer';
NUMERICKEYWORD : 'Time' | 'Size';
NUMERICOPERATOR: '<>' | '>=' | '<=' | '<' | '>';
STRINGOPERATOR : 'like' | 'not like';
RETURN : WS 'return' WS;
SORT : WS 'sort' WS;
SORTDIRECTION : 'ascending' | 'descending' ;
ARRAYOPERATOR : 'in' | 'not in';
ALLSELECTOR : '*';
ENDTOKEN: ';';
EQUALS : '=';
NUMBER : [0]([\.][0-9]*)? | [\.][0-9]+ | [1-9][0-9]*([\.][0-9]*)?;
STRING : '\''( ~'\'' | '\\\'')+'\'';
NEWLINE : '\n' | '\r\n';
WS : [ \t]+ -> skip;
//for recognition of necessary whitespaces
UNKNOWN : [a-zA-Z]+ | ['a-zA-Z]+;