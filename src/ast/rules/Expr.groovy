package ast.rules

import ast.codeGeneration.Register
import ast.enumerations.DataType
import ast.visitor.ASTNode

abstract class Expr extends ASTNode {

    String rValue = ""
    DataType dataType

    abstract String generateCode(Register register)
}
