package ast.rules

import ast.codeGeneration.Register
import ast.enumerations.DataType
import ast.visitor.ASTVisitor
import org.antlr.v4.runtime.Token


class StringLiteral extends Literal {

    Token token
    DataType dataType = DataType.STRING

    String rValue = ""

    @Override
    void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }

    @Override
    String toString() {
        return "(string-literal ${token.text})"
    }

    String generateCode(Register register){
        String res=";generation of StringLiteral\n"
        String r1 ="%S"+ (register.r++)
        int sizeString = token.toString().length()
        rValue = "%S"+ (register.r++)
        res += r1 +"= alloca [ "+(sizeString+2)+" x i8 ] \n"//+token.getText()+"\0A\00"+"\n"
        res += rValue +"= getelementptr [ "+(sizeString+2)+" x i8 ]* "+token.getText()+", i64 0, i64 0\n"
        return res
    }
}
