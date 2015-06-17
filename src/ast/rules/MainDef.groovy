package ast.rules

import ast.codeGeneration.Register
import ast.visitor.ASTNode
import ast.visitor.ASTVisitor

class MainDef extends ASTNode {
    Block block

    @Override
    String toString() {
        return "(main \n ${(block.toString())} )"
    }

    @Override
    void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }

    String generateCode(Register register){
        String res = "define i32 @main ( ){\n"
        res += block.generateCode(register)
        res += "%ps = getelementptr [4 x i8]* @s, i64 0, i64 0\n"
        res += "%m0 = add i32 5, 0\n"
        res += "%m1 = call i32(i32)* @f(i32 %m0)\n"
        res += "call i32 (i8*, ...)* @printf(i8* %ps, i32 %m1)\n"
        res += "}\n"
        return res
    }
}
