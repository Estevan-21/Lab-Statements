lexer grammar StatLexer;

@header{
package tcom.stat;
}

LPAR:'(';
RPAR:')';
LT  :'<';
GT  :'>';
NOT :'not';
IF  :'if';
THEN:'then';
ELSE:'else';
WHILE:'while';
DO:'do';
STOP:'stop';
VARA:'a';
VARB:'b';
WS: [ \n\t\r]+ -> skip;
