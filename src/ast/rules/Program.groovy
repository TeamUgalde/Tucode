package ast.rules

import ast.codeGeneration.Register
import ast.visitor.ASTNode
import ast.visitor.ASTVisitor

class Program extends ASTNode {
    MainDef mainDecl

    @Override
    void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }

    @Override
    String toString() {
        return "(program \n ${(mainDecl.toString())}))"
    }

    String generateCode(Register register){
        String d = "'\'"
        String programCode = ""
        programCode += "@s = internal constant [4 x i8] c"+"\"%d"+"\\0A\\00\""+"\n"
        programCode += "declare i32 @printf(i8* noalias nocapture, ...)\n"
        programCode += mainDecl.generateCode(register)
        return programCode
    }
}