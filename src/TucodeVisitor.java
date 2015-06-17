import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TucodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TucodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TucodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TucodeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(TucodeParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TucodeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#id_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_decl(TucodeParser.Id_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(TucodeParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#for_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_var_decl(TucodeParser.For_var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(TucodeParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#for_var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_var_assign(TucodeParser.For_var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(TucodeParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#type_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_int(TucodeParser.Type_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#type_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_char(TucodeParser.Type_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#type_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_bool(TucodeParser.Type_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#type_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_string(TucodeParser.Type_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(TucodeParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(TucodeParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#if_conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_conditional(TucodeParser.If_conditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(TucodeParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(TucodeParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(TucodeParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(TucodeParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TucodeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(TucodeParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#function_defined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_defined(TucodeParser.Function_definedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#length_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength_def(TucodeParser.Length_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#power_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower_def(TucodeParser.Power_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#println_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln_def(TucodeParser.Println_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#print_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_def(TucodeParser.Print_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#isPositive_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsPositive_def(TucodeParser.IsPositive_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#abs_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs_def(TucodeParser.Abs_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#uppercase_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUppercase_def(TucodeParser.Uppercase_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#lowercase_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowercase_def(TucodeParser.Lowercase_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#nod_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNod_def(TucodeParser.Nod_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#isEmpty_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsEmpty_def(TucodeParser.IsEmpty_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#toInt_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToInt_def(TucodeParser.ToInt_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#isDigit_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsDigit_def(TucodeParser.IsDigit_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#while_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_def(TucodeParser.While_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#dowhile_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile_def(TucodeParser.Dowhile_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#for_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_def(TucodeParser.For_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#loop_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_def(TucodeParser.Loop_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#user_function_defined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_function_defined(TucodeParser.User_function_definedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#main_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_def(TucodeParser.Main_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link TucodeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TucodeParser.ProgramContext ctx);
}