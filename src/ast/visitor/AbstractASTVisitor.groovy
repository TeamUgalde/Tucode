

package ast.visitor

import ast.rules.*


class AbstractASTVisitor implements ASTVisitor {

   @Override
   visit(Program program) {
       program.mainDecl.accept(this)
   }

   @Override
   visit(Block block) {
       block.props.each {it.accept(this)}
   }

    @Override
    Object visit(MainDef mainDef) {
        return null
    }

    @Override
   visit(IdDecl idDecl) {}

    @Override
   visit(BinaryExpr binaryExpr) {
       binaryExpr.leftOperand.accept(this)
       binaryExpr.rightOperand.accept(this)
   }


   @Override
   visit(IntLiteral intLiteral) {

   }

   @Override
   visit(CharLiteral charLiteral) {

   }

    @Override
    visit(StringLiteral stringLiteral) {

    }

    @Override
   visit(BoolLiteral boolLiteral) {

   }

   @Override
   visit(IdLiteral idLiteral) {

   }

   @Override
   visit(VarDecl varDeclaration) {
       varDeclaration.idLiteral.accept(this)
       varDeclaration.expr.accept(this)
   }

}
