package ast.rules

import ast.codeGeneration.Register
import ast.visitor.ASTVisitor

class VarDecl extends Prop{
    IdDecl idDecl
    Expr expr =null

    String rValue =""

    @Override
    String toString() {
        return "(Var-def ${idDecl.toString()} (expr ${(expr.toString())}) )"
    }

    @Override
    void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }

    @Override
    String generateCode(Register register) {
        String res= ""
        return res
    }

}
