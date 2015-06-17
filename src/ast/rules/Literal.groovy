package ast.rules

import ast.enumerations.DataType

abstract class Literal extends Expr{
    DataType dataType;
}
