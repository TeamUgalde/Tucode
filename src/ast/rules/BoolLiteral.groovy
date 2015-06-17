package ast.rules

import ast.codeGeneration.Register
import ast.enumerations.DataType
import ast.visitor.ASTVisitor
import org.antlr.v4.runtime.Token

class BoolLiteral extends Literal {
    Token token
    DataType dataType = DataType.BOOLEAN

    @Override
    void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }

    @Override
    String toString() {
        return "(bool-literal ${token.text})"
    }

    @Override
    String generateCode(Register register) {
        String res = "; declaration BoolLiteral\n"
        rValue = "@bool"+register.r++
        if(token.getText().equalsIgnoreCase("verdadero")){
            res += rValue+" = icmp eq i32 1, 1\n"
        }
        else{
            res += rValue+" = icmp eq i32 1, 2\n"

        }
        return res
    }
}
