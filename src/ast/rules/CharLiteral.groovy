package ast.rules

import ast.codeGeneration.Register
import ast.enumerations.DataType
import ast.visitor.ASTVisitor
import org.antlr.v4.runtime.Token

class CharLiteral extends Literal{
    Token token
    DataType dataType = DataType.CHARACTER

    @Override
    void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }

    @Override
    String toString() {
        return "(char-literal ${token.text})"
    }

    @Override
    String generateCode(Register register) {
        String res = ""
        return res
    }
}
