import ast.enumerations.DataType
import ast.rules.*
import ast.visitor.ASTNode
import org.antlr.v4.runtime.misc.NotNull
import org.antlr.v4.runtime.tree.TerminalNode

import java.beans.Expression

class ASTBuilder extends TucodeBaseVisitor<ASTNode> {
    @Override
    ASTNode visitProgram(@NotNull TucodeParser.ProgramContext ctx) {
    }


    @Override
    ASTNode visitBlock(@NotNull TucodeParser.BlockContext ctx) {
    }

    @Override
    ASTNode visitSentence(@NotNull TucodeParser.SentenceContext ctx) {
    }

    @Override
    ASTNode visitVar_decl(@NotNull TucodeParser.Var_declContext ctx){
    }
    @Override
    ASTNode visitId_decl(@NotNull TucodeParser.Id_declContext ctx){
    }

    @Override
    ASTNode visitType_int(@NotNull TucodeParser.Type_intContext ctx) {
    }
    @Override
    ASTNode visitType_char(@NotNull TucodeParser.Type_charContext ctx) {
    }
    @Override
    ASTNode visitType_string(@NotNull TucodeParser.Type_stringContext ctx) {
    }
    @Override
    ASTNode visitType_bool(@NotNull TucodeParser.Type_boolContext ctx) {
    }
    @Override
    ASTNode visitMain_def(@NotNull TucodeParser.Main_defContext ctx) {
    }
    @Override
    ASTNode visitLiteral(@NotNull TucodeParser.LiteralContext ctx) {
    }
    @Override
    ASTNode visitExpression(@NotNull TucodeParser.ExpressionContext ctx) {
    }

    @Override
    ASTNode visitElement(@NotNull @NotNull TucodeParser.ElementContext ctx) {
    }

}
