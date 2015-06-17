package ast.rules

import ast.enumerations.DataType
import ast.visitor.ASTNode
import ast.visitor.ASTVisitor
import org.antlr.v4.runtime.Token

class IdDecl extends ASTNode{
    Token token
    DataType dataType


    @Override
    void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }

    @Override
    String toString() {
        return "(type ${dataType}) (id ${token.text})"
    }
}
