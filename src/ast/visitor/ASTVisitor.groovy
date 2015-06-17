package ast.visitor

import ast.rules.BinaryExpr
import ast.rules.Block
import ast.rules.BoolLiteral
import ast.rules.CharLiteral
import ast.rules.IdDecl
import ast.rules.IdLiteral
import ast.rules.IntLiteral
import ast.rules.MainDef
import ast.rules.Program
import ast.rules.StringLiteral
import ast.rules.VarDecl

public interface ASTVisitor<T> {

    T visit(Program program)
    T visit(MainDef mainDef)
    T visit(Block block)

    //Expressions
    T visit(BinaryExpr binaryExpr)

    //Literals
    T visit(IntLiteral intLiteral)
    T visit(CharLiteral charLiteral)
    T visit(StringLiteral stringLiteral)
    T visit(BoolLiteral boolLiteral)
    T visit(IdLiteral idLiteral)

    //Declarations
    T visit(IdDecl idDecl)
    T visit(VarDecl varDeclaration)


}
