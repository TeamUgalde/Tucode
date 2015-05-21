// Generated from Tucode.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TucodeParser}.
 */
public interface TucodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TucodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TucodeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TucodeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(TucodeParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(TucodeParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TucodeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TucodeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#id_decl}.
	 * @param ctx the parse tree
	 */
	void enterId_decl(TucodeParser.Id_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#id_decl}.
	 * @param ctx the parse tree
	 */
	void exitId_decl(TucodeParser.Id_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(TucodeParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(TucodeParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(TucodeParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(TucodeParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#type_int}.
	 * @param ctx the parse tree
	 */
	void enterType_int(TucodeParser.Type_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#type_int}.
	 * @param ctx the parse tree
	 */
	void exitType_int(TucodeParser.Type_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#type_char}.
	 * @param ctx the parse tree
	 */
	void enterType_char(TucodeParser.Type_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#type_char}.
	 * @param ctx the parse tree
	 */
	void exitType_char(TucodeParser.Type_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#type_bool}.
	 * @param ctx the parse tree
	 */
	void enterType_bool(TucodeParser.Type_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#type_bool}.
	 * @param ctx the parse tree
	 */
	void exitType_bool(TucodeParser.Type_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#type_string}.
	 * @param ctx the parse tree
	 */
	void enterType_string(TucodeParser.Type_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#type_string}.
	 * @param ctx the parse tree
	 */
	void exitType_string(TucodeParser.Type_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(TucodeParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(TucodeParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(TucodeParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(TucodeParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void enterIf_conditional(TucodeParser.If_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#if_conditional}.
	 * @param ctx the parse tree
	 */
	void exitIf_conditional(TucodeParser.If_conditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(TucodeParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(TucodeParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(TucodeParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(TucodeParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TucodeParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TucodeParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(TucodeParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(TucodeParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TucodeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TucodeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#while_def}.
	 * @param ctx the parse tree
	 */
	void enterWhile_def(TucodeParser.While_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#while_def}.
	 * @param ctx the parse tree
	 */
	void exitWhile_def(TucodeParser.While_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#dowhile_def}.
	 * @param ctx the parse tree
	 */
	void enterDowhile_def(TucodeParser.Dowhile_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#dowhile_def}.
	 * @param ctx the parse tree
	 */
	void exitDowhile_def(TucodeParser.Dowhile_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#for_def}.
	 * @param ctx the parse tree
	 */
	void enterFor_def(TucodeParser.For_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#for_def}.
	 * @param ctx the parse tree
	 */
	void exitFor_def(TucodeParser.For_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#loop_def}.
	 * @param ctx the parse tree
	 */
	void enterLoop_def(TucodeParser.Loop_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#loop_def}.
	 * @param ctx the parse tree
	 */
	void exitLoop_def(TucodeParser.Loop_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(TucodeParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(TucodeParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#function_defined}.
	 * @param ctx the parse tree
	 */
	void enterFunction_defined(TucodeParser.Function_definedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#function_defined}.
	 * @param ctx the parse tree
	 */
	void exitFunction_defined(TucodeParser.Function_definedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#main_def}.
	 * @param ctx the parse tree
	 */
	void enterMain_def(TucodeParser.Main_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#main_def}.
	 * @param ctx the parse tree
	 */
	void exitMain_def(TucodeParser.Main_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link TucodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TucodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TucodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TucodeParser.ProgramContext ctx);
}