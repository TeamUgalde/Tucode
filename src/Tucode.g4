grammar Tucode;

expression
    : element
    | OPERATOR_NEG expression
    | <assoc=right> expression OPERATOR_POW expression
    | expression ( OPERATOR_MULT | OPERATOR_DIV ) expression
    | expression (OPERATOR_ADD|OPERATOR_NEG) expression
    | expression(OPERATOR_GRT | OPERATOR_LOT | OPERATOR_GRE | OPERATOR_LOE | OPERATOR_EQU | OPERATOR_DIFF) expression
    | OPERATOR_NOT expression
    | expression OPERATOR_AND expression
    | expression OPERATOR_OR expression
;

element
    : '(' expression ')'
    | func_call
    | literal
    ;

literal
    : INTEGER
    | CHARACTER
    | BOOLEAN
    | STRING
    | ID
    ;

id_decl: data_type ID ;

//call a function
func_call
    : ID '(' inputs? ')' (DELIMITER)?
;

inputs
    : input  (',' input)*
;

input
    : expression
    ;


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
    | if_conditional
    | print_def
    | println_def
    | length_def
    | nod_def
    | lowercase_def
    | uppercase_def
    | abs_def
    | isPositive_def
    | power_def
    | result
    | while_def
    | dowhile_def
    | for_def
    | isEmpty_def
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
    FOR '(' expression ';' expression ';' expression ')' block
    ;

loop_def
    :
    LOOP '(' expression ')' block
    ;

//Function definition
function_def
    : data_type DEF_FUNC id_decl  '(' params? ')' block
;


//Main function definition
main_def
    : FUNC_MAIN  '(' ')' block
;

//Length function definition
length_def
    : FUNC_LEN '(' expression ')' DELIMITER
;

//Power function definition
power_def
    : FUNC_POW  '(' expression',' expression ')' DELIMITER
;

//Println function definition
println_def
    : FUNC_PRINTLN  '(' expression ')' block
;

// Print function definition
print_def
    : FUNC_PRINT '(' expression ')' DELIMITER
;

//isPositive function definition
isPositive_def
    : FUNC_ISPOSITIVE  '(' expression ')' DELIMITER
;

//Absolute function definition
abs_def
    : FUNC_ABS  '(' expression ')' DELIMITER
;

//Uppercase function definition
uppercase_def
    : FUNC_UPPERCASE  '(' expression ')' DELIMITER
;

//Lowercase function definition
lowercase_def
    : FUNC_LOWERCASE  '(' expression ')' DELIMITER
;

//NOD function definition
nod_def
    : FUNC_NOD  '(' expression ')' DELIMITER
;

//IsEmpty function definition
isEmpty_def
    : FUNC_ISEMPTY  '(' expression ')' DELIMITER
;

//toInt function definition
toInt_def
    : FUNC_TOINT  '(' expression ')' DELIMITER
;

//isDigit function definition
isDigit_def
    : FUNC_ISDIGIT  '(' expression ')' DELIMITER
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

OPERATOR_POW
    :   '^'
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
L_BRACKET: '[';
R_BRACKET: ']';
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
ID: [a-z] '_'? [a-z]*;
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