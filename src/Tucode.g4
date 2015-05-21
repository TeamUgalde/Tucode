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

for_var_decl
    : id_decl OPERATOR_ASSIG expression
    ;

var_assign
    : ID OPERATOR_ASSIG expression DELIMITER
    ;

for_var_assign
    : ID OPERATOR_ASSIG expression
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
    | var_assign
    | while_def
    | dowhile_def
    | for_def
    | loop_def
    | if_conditional
    | function_defined DELIMITER
    | result

;

//Conditionals
if_conditional
    : IF L_PARENTHESIS expression R_PARENTHESIS block (ELSE block)?
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
    : DELIMITER? L_BRACE DELIMITER? (DELIMITER* sentence DELIMITER*)*  R_BRACE DELIMITER?
;

//Function definition
function_def
    : data_type DEF_FUNC ID  L_PARENTHESIS params? R_PARENTHESIS block
;

//Using a function already defined
function_defined
    : print_def
    | println_def
    | length_def
    | nod_def
    | lowercase_def
    | uppercase_def
    | abs_def
    | isPositive_def
    | power_def
    | isDigit_def
    | isEmpty_def
    | toInt_def
    | user_function_defined
    ;

//Predefined functions

//Length function definition
length_def
    : FUNC_LEN L_PARENTHESIS expression R_PARENTHESIS
;

//Power function definition
power_def
    : FUNC_POW  L_PARENTHESIS expression',' expression R_PARENTHESIS
;

//Println function definition
println_def
    : FUNC_PRINTLN  L_PARENTHESIS expression R_PARENTHESIS
;

// Print function definition
print_def
    : FUNC_PRINT L_PARENTHESIS expression R_PARENTHESIS
;

//isPositive function definition
isPositive_def
    : FUNC_ISPOSITIVE  L_PARENTHESIS expression R_PARENTHESIS
;

//Absolute function definition
abs_def
    : FUNC_ABS  L_PARENTHESIS expression R_PARENTHESIS
;

//Uppercase function definition
uppercase_def
    : FUNC_UPPERCASE  L_PARENTHESIS expression R_PARENTHESIS
;

//Lowercase function definition
lowercase_def
    : FUNC_LOWERCASE  L_PARENTHESIS expression R_PARENTHESIS
;

//NOD function definition
nod_def
    : FUNC_NOD  L_PARENTHESIS expression R_PARENTHESIS
;

//IsEmpty function definition
isEmpty_def
    : FUNC_ISEMPTY  L_PARENTHESIS expression R_PARENTHESIS
;

//toInt function definition
toInt_def
    : FUNC_TOINT  L_PARENTHESIS expression R_PARENTHESIS
;

//isDigit function definition
isDigit_def
    : FUNC_ISDIGIT  L_PARENTHESIS expression R_PARENTHESIS
;


//While cycle code

while_def
    :
    WHILE  L_PARENTHESIS expression R_PARENTHESIS block
    ;

//Do while cycle code

dowhile_def
    :
    DO block WHILE L_PARENTHESIS expression R_PARENTHESIS DELIMITER
    ;

for_def
    :
    FOR L_PARENTHESIS (for_var_decl | for_var_assign) ';' expression ';' for_var_assign R_PARENTHESIS block
    ;

loop_def
    :
    LOOP L_PARENTHESIS expression R_PARENTHESIS block
    ;

//User function defined.

user_function_defined
    : ID  L_PARENTHESIS arguments? R_PARENTHESIS
    ;

//Main function definition
main_def
    : FUNC_MAIN  L_PARENTHESIS R_PARENTHESIS block
    ;

program
    : DELIMITER* function_def* DELIMITER* main_def DELIMITER*
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
DELIMITER: '\n';
COMMA: ',';
DEF_FUNC: 'definir';
FUNC_LEN: 'largo';
FUNC_PRINT: 'imprimir';
FUNC_PRINTLN: 'imprimirln';
FUNC_MAIN: 'numero comienzo';
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
INLINE_COMMENT: '&&' (.)*? '\n' -> skip;
WS : [' '\t\r]+ -> skip ;
MULTILINE_COMMENT :   '&-' (.)*? '-&' -> skip;
WHILE: 'mientras';
FOR: 'para';
LOOP: 'repetir';
DO: 'hacer';
ID: [a-zA-Z_] ( [a-zA-Z_] | [0-9] )*;

CHARACTER
    : '\''(.)'\''
    ;

STRING
    : '"'(.)*? '"'
    ;

INTEGER: [0] | OPERATOR_NEG? ( [1-9] [0-9]* );

BOOLEAN: ('verdadero'|'falso');