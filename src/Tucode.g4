grammar Tucode;

expression
    : element
    | expression ( OPERATOR_MULT | OPERATOR_DIV ) expression
    | expression (OPERATOR_ADD|OPERATOR_NEG) expression
    | expression(OPERATOR_GRT | OPERATOR_LOT | OPERATOR_GRE | OPERATOR_LOE | OPERATOR_EQU | OPERATOR_DIFF) expression
    | OPERATOR_NOT element
    | expression OPERATOR_AND expression
    | expression OPERATOR_OR expression
;

element
    : function_defined | literal
    ;

literal
    : INTEGER
    | CHARACTER
    | BOOLEAN
    | STRING
    | ID
    ;

id_decl: data_type ID ;


//Variable declarations

var_decl
    : id_decl OPERATOR_ASSIG expression DELIMITER
    ;


//Data types
data_type
    : (type_int | type_char | type_bool | type_string)
;

type_int: 'numero';
type_char: 'simbolo';
type_bool: 'booleano';
type_string: 'texto';


//Return
result
    : RETURN expression DELIMITER
;

sentence
    : var_decl
    | function_defined DELIMITER
    | function_def
    | if_conditional
    | result
    | while_def
    | dowhile_def
    | for_def
    | loop_def
;

//Conditionals
if_conditional
    : IF '(' expression ')' block (ELSE block)?
    ;


params
    : param (COMMA param )*
;

param
    : id_decl
    ;

arguments
    : argument (COMMA argument )*
;

argument
    : expression
    ;

//Block code
block
    : L_BRACE sentence* R_BRACE
;


//While cycle code

while_def
    :
    WHILE  '('expression')' block
    ;

//Do while cycle code

dowhile_def
    :
    DO block WHILE '('expression')'
    ;

for_def
    :
    FOR '(' var_decl expression ';' expression ')' block
    ;

loop_def
    :
    LOOP '(' expression ')' block
    ;

//Function definition
function_def
    : data_type DEF_FUNC ID  '(' params? ')' block
;

//Using a function already defined
function_defined
    : ID  '(' arguments? ')'
    ;

//Main function definition
main_def
    : type_int FUNC_MAIN  '(' ')' block
    ;

program
    : main_def
    ;

//Lexer Tokens//


OPERATOR_NOT
    :   '!'
    ;

OPERATOR_AND
    :   'y'
    ;

OPERATOR_OR
    :   'o'
    ;

OPERATOR_EQU
    :   '=='
    ;

OPERATOR_DIFF
    :   '!='
    ;

OPERATOR_GRT
    :   '>'
    ;

OPERATOR_LOT
    :   '<'
    ;

OPERATOR_GRE
    :   '<='
    ;

OPERATOR_LOE
    :   '>='
    ;

OPERATOR_NEG
    :   '-'
    ;


OPERATOR_MULT
    :   '*'
    ;

OPERATOR_DIV
    :   '/'
    ;

OPERATOR_ADD
    :   '+'
    ;

OPERATOR_SUB
    :   '-'
    ;

L_PARENTHESIS: '(';
R_PARENTHESIS: ')';
L_BRACE: '{';
R_BRACE: '}';
DELIMITER: ';';
COMMA: ',';
DEF_FUNC: 'definir';
FUNC_LEN: 'largo';
FUNC_PRINT: 'imprimir';
FUNC_PRINTLN: 'imprimirln';
FUNC_MAIN: 'comienzo';
FUNC_POW: 'potencia';
FUNC_ISPOSITIVE: 'esPositivo';
FUNC_ABS: 'absoluto';
FUNC_UPPERCASE: 'mayuscula';
FUNC_LOWERCASE: 'minuscula';
FUNC_NOD: 'cantidadDigitos';
FUNC_ISEMPTY: 'esVacio';
FUNC_TOINT: 'aEntero';
FUNC_ISDIGIT: 'esDigito';
RETURN: 'devolver';
IF: 'si';
ELSE: 'sino';
OPERATOR_ASSIG: '=';
fragment COMILLA: '\'';
ID: ([a-z]|[A-Z]) '_'? ([a-z]|[A-Z])*  ;
INLINE_COMMENT: '&&' (.)*? '\n' -> skip;
WS : [' '\t\r\n]+ -> skip ;
MULTILINE_COMMENT :   '&-' (.)*? '-&' -> skip;
WHILE: 'mientras';
FOR: 'para';
LOOP: 'repetir';
DO: 'hacer';

CHARACTER
    : '\''(.)'\''
    ;

STRING
    : '"'(.)*? '"'
    ;

INTEGER: [0] | OPERATOR_NEG? ( [1-9] [0-9]* );

BOOLEAN: ('verdadero'|'falso');