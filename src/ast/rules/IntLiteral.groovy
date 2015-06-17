package ast.rules

import ast.codeGeneration.Register
import ast.enumerations.DataType
import ast.visitor.ASTVisitor
import org.antlr.v4.runtime.Token


class IntLiteral extends Literal {
    Token token
    DataType dataType = DataType.INTEGER

    @Override
    void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }

    @Override
    String toString() {
        return "(int-literal ${token.text})"
    }

    @Override
    String generateCode(Register registro) {
        rValue = "%IL"+registro.r++
        String r2 = "%r"+registro.r++
        String res = ";declaration IntLiteral\n"
        res += rValue+" = alloca i32\n"
        res += r2+" = add i32 "+token.getText()+", 0\n"
        res += "store i32 "+r2+", i32* "+rValue+"\n\n"
        return res
    }

}
