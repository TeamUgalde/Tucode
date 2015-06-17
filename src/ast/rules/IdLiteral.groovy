package ast.rules

import ast.codeGeneration.Register
import ast.enumerations.DataType
import ast.visitor.ASTVisitor
import org.antlr.v4.runtime.Token

class IdLiteral extends Literal {
    Token token
    DataType dataType

    @Override
    void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }

    @Override
    String toString() {
        return "(id-literal ${token.text})"
    }

    @Override
    String generateCode(Register register) {
        rValue = "%"+token.getText()+register.r++
        String res = "; idLiteral\n"
        res = rValue+" = load i32* " + "%"+token.getText()+"\n"
        return res
    }
}