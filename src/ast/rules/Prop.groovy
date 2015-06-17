package ast.rules

import ast.codeGeneration.Register
import ast.visitor.ASTNode

abstract class Prop extends ASTNode {

    abstract String generateCode(Register register);

    String rValue = ""
}
