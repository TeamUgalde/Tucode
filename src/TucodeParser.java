// Generated from Tucode.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TucodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OPERATOR_NOT=6, OPERATOR_AND=7, 
		OPERATOR_OR=8, OPERATOR_EQU=9, OPERATOR_DIFF=10, OPERATOR_GRT=11, OPERATOR_LOT=12, 
		OPERATOR_GRE=13, OPERATOR_LOE=14, OPERATOR_NEG=15, OPERATOR_MULT=16, OPERATOR_DIV=17, 
		OPERATOR_ADD=18, OPERATOR_SUB=19, L_PARENTHESIS=20, R_PARENTHESIS=21, 
		L_BRACE=22, R_BRACE=23, DELIMITER=24, COMMA=25, DEF_FUNC=26, FUNC_LEN=27, 
		FUNC_PRINT=28, FUNC_PRINTLN=29, FUNC_MAIN=30, FUNC_POW=31, FUNC_ISPOSITIVE=32, 
		FUNC_ABS=33, FUNC_UPPERCASE=34, FUNC_LOWERCASE=35, FUNC_NOD=36, FUNC_ISEMPTY=37, 
		FUNC_TOINT=38, FUNC_ISDIGIT=39, RETURN=40, IF=41, ELSE=42, OPERATOR_ASSIG=43, 
		INLINE_COMMENT=44, WS=45, MULTILINE_COMMENT=46, WHILE=47, FOR=48, LOOP=49, 
		DO=50, ID=51, CHARACTER=52, STRING=53, INTEGER=54, BOOLEAN=55;
	public static final int
		RULE_expression = 0, RULE_element = 1, RULE_literal = 2, RULE_id_decl = 3, 
		RULE_var_decl = 4, RULE_for_var_decl = 5, RULE_var_assign = 6, RULE_for_var_assign = 7, 
		RULE_data_type = 8, RULE_type_int = 9, RULE_type_char = 10, RULE_type_bool = 11, 
		RULE_type_string = 12, RULE_result = 13, RULE_sentence = 14, RULE_if_conditional = 15, 
		RULE_params = 16, RULE_param = 17, RULE_arguments = 18, RULE_argument = 19, 
		RULE_block = 20, RULE_function_def = 21, RULE_function_defined = 22, RULE_length_def = 23, 
		RULE_power_def = 24, RULE_println_def = 25, RULE_print_def = 26, RULE_isPositive_def = 27, 
		RULE_abs_def = 28, RULE_uppercase_def = 29, RULE_lowercase_def = 30, RULE_nod_def = 31, 
		RULE_isEmpty_def = 32, RULE_toInt_def = 33, RULE_isDigit_def = 34, RULE_while_def = 35, 
		RULE_dowhile_def = 36, RULE_for_def = 37, RULE_loop_def = 38, RULE_user_function_defined = 39, 
		RULE_main_def = 40, RULE_program = 41;
	public static final String[] ruleNames = {
		"expression", "element", "literal", "id_decl", "var_decl", "for_var_decl", 
		"var_assign", "for_var_assign", "data_type", "type_int", "type_char", 
		"type_bool", "type_string", "result", "sentence", "if_conditional", "params", 
		"param", "arguments", "argument", "block", "function_def", "function_defined", 
		"length_def", "power_def", "println_def", "print_def", "isPositive_def", 
		"abs_def", "uppercase_def", "lowercase_def", "nod_def", "isEmpty_def", 
		"toInt_def", "isDigit_def", "while_def", "dowhile_def", "for_def", "loop_def", 
		"user_function_defined", "main_def", "program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'numero'", "'simbolo'", "'booleano'", "'texto'", "';'", "'!'", 
		"'y'", "'o'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", null, "'*'", 
		"'/'", "'+'", null, "'('", "')'", "'{'", "'}'", "'\n'", "','", "'definir'", 
		"'largo'", "'imprimir'", "'imprimirln'", "'numero comienzo'", "'potencia'", 
		"'esPositivo'", "'absoluto'", "'mayuscula'", "'minuscula'", "'cantidadDigitos'", 
		"'esVacio'", "'aEntero'", "'esDigito'", "'devolver'", "'si'", "'sino'", 
		"'='", null, null, null, "'mientras'", "'para'", "'repetir'", "'hacer'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "OPERATOR_NOT", "OPERATOR_AND", "OPERATOR_OR", 
		"OPERATOR_EQU", "OPERATOR_DIFF", "OPERATOR_GRT", "OPERATOR_LOT", "OPERATOR_GRE", 
		"OPERATOR_LOE", "OPERATOR_NEG", "OPERATOR_MULT", "OPERATOR_DIV", "OPERATOR_ADD", 
		"OPERATOR_SUB", "L_PARENTHESIS", "R_PARENTHESIS", "L_BRACE", "R_BRACE", 
		"DELIMITER", "COMMA", "DEF_FUNC", "FUNC_LEN", "FUNC_PRINT", "FUNC_PRINTLN", 
		"FUNC_MAIN", "FUNC_POW", "FUNC_ISPOSITIVE", "FUNC_ABS", "FUNC_UPPERCASE", 
		"FUNC_LOWERCASE", "FUNC_NOD", "FUNC_ISEMPTY", "FUNC_TOINT", "FUNC_ISDIGIT", 
		"RETURN", "IF", "ELSE", "OPERATOR_ASSIG", "INLINE_COMMENT", "WS", "MULTILINE_COMMENT", 
		"WHILE", "FOR", "LOOP", "DO", "ID", "CHARACTER", "STRING", "INTEGER", 
		"BOOLEAN"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Tucode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TucodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode OPERATOR_NOT() { return getToken(TucodeParser.OPERATOR_NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERATOR_MULT() { return getToken(TucodeParser.OPERATOR_MULT, 0); }
		public TerminalNode OPERATOR_DIV() { return getToken(TucodeParser.OPERATOR_DIV, 0); }
		public TerminalNode OPERATOR_ADD() { return getToken(TucodeParser.OPERATOR_ADD, 0); }
		public TerminalNode OPERATOR_NEG() { return getToken(TucodeParser.OPERATOR_NEG, 0); }
		public TerminalNode OPERATOR_GRT() { return getToken(TucodeParser.OPERATOR_GRT, 0); }
		public TerminalNode OPERATOR_LOT() { return getToken(TucodeParser.OPERATOR_LOT, 0); }
		public TerminalNode OPERATOR_GRE() { return getToken(TucodeParser.OPERATOR_GRE, 0); }
		public TerminalNode OPERATOR_LOE() { return getToken(TucodeParser.OPERATOR_LOE, 0); }
		public TerminalNode OPERATOR_EQU() { return getToken(TucodeParser.OPERATOR_EQU, 0); }
		public TerminalNode OPERATOR_DIFF() { return getToken(TucodeParser.OPERATOR_DIFF, 0); }
		public TerminalNode OPERATOR_AND() { return getToken(TucodeParser.OPERATOR_AND, 0); }
		public TerminalNode OPERATOR_OR() { return getToken(TucodeParser.OPERATOR_OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			switch (_input.LA(1)) {
			case FUNC_LEN:
			case FUNC_PRINT:
			case FUNC_PRINTLN:
			case FUNC_POW:
			case FUNC_ISPOSITIVE:
			case FUNC_ABS:
			case FUNC_UPPERCASE:
			case FUNC_LOWERCASE:
			case FUNC_NOD:
			case FUNC_ISEMPTY:
			case FUNC_TOINT:
			case FUNC_ISDIGIT:
			case ID:
			case CHARACTER:
			case STRING:
			case INTEGER:
			case BOOLEAN:
				{
				setState(85);
				element();
				}
				break;
			case OPERATOR_NOT:
				{
				setState(86);
				match(OPERATOR_NOT);
				setState(87);
				element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(91);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_MULT || _la==OPERATOR_DIV) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(92);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_NEG || _la==OPERATOR_ADD) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(95);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(97);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATOR_EQU) | (1L << OPERATOR_DIFF) | (1L << OPERATOR_GRT) | (1L << OPERATOR_LOT) | (1L << OPERATOR_GRE) | (1L << OPERATOR_LOE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(98);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(100);
						match(OPERATOR_AND);
						setState(101);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(103);
						match(OPERATOR_OR);
						setState(104);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public Function_definedContext function_defined() {
			return getRuleContext(Function_definedContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				function_defined();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TucodeParser.INTEGER, 0); }
		public TerminalNode CHARACTER() { return getToken(TucodeParser.CHARACTER, 0); }
		public TerminalNode BOOLEAN() { return getToken(TucodeParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(TucodeParser.STRING, 0); }
		public TerminalNode ID() { return getToken(TucodeParser.ID, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << CHARACTER) | (1L << STRING) | (1L << INTEGER) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(TucodeParser.ID, 0); }
		public Id_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterId_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitId_decl(this);
		}
	}

	public final Id_declContext id_decl() throws RecognitionException {
		Id_declContext _localctx = new Id_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			data_type();
			setState(117);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Id_declContext id_decl() {
			return getRuleContext(Id_declContext.class,0);
		}
		public TerminalNode OPERATOR_ASSIG() { return getToken(TucodeParser.OPERATOR_ASSIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			id_decl();
			setState(120);
			match(OPERATOR_ASSIG);
			setState(121);
			expression(0);
			setState(122);
			match(DELIMITER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_var_declContext extends ParserRuleContext {
		public Id_declContext id_decl() {
			return getRuleContext(Id_declContext.class,0);
		}
		public TerminalNode OPERATOR_ASSIG() { return getToken(TucodeParser.OPERATOR_ASSIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterFor_var_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitFor_var_decl(this);
		}
	}

	public final For_var_declContext for_var_decl() throws RecognitionException {
		For_var_declContext _localctx = new For_var_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			id_decl();
			setState(125);
			match(OPERATOR_ASSIG);
			setState(126);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TucodeParser.ID, 0); }
		public TerminalNode OPERATOR_ASSIG() { return getToken(TucodeParser.OPERATOR_ASSIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ID);
			setState(129);
			match(OPERATOR_ASSIG);
			setState(130);
			expression(0);
			setState(131);
			match(DELIMITER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_var_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TucodeParser.ID, 0); }
		public TerminalNode OPERATOR_ASSIG() { return getToken(TucodeParser.OPERATOR_ASSIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterFor_var_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitFor_var_assign(this);
		}
	}

	public final For_var_assignContext for_var_assign() throws RecognitionException {
		For_var_assignContext _localctx = new For_var_assignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ID);
			setState(134);
			match(OPERATOR_ASSIG);
			setState(135);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public Type_intContext type_int() {
			return getRuleContext(Type_intContext.class,0);
		}
		public Type_charContext type_char() {
			return getRuleContext(Type_charContext.class,0);
		}
		public Type_boolContext type_bool() {
			return getRuleContext(Type_boolContext.class,0);
		}
		public Type_stringContext type_string() {
			return getRuleContext(Type_stringContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(137);
				type_int();
				}
				break;
			case T__1:
				{
				setState(138);
				type_char();
				}
				break;
			case T__2:
				{
				setState(139);
				type_bool();
				}
				break;
			case T__3:
				{
				setState(140);
				type_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_intContext extends ParserRuleContext {
		public Type_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterType_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitType_int(this);
		}
	}

	public final Type_intContext type_int() throws RecognitionException {
		Type_intContext _localctx = new Type_intContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_charContext extends ParserRuleContext {
		public Type_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterType_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitType_char(this);
		}
	}

	public final Type_charContext type_char() throws RecognitionException {
		Type_charContext _localctx = new Type_charContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_boolContext extends ParserRuleContext {
		public Type_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterType_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitType_bool(this);
		}
	}

	public final Type_boolContext type_bool() throws RecognitionException {
		Type_boolContext _localctx = new Type_boolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_stringContext extends ParserRuleContext {
		public Type_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterType_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitType_string(this);
		}
	}

	public final Type_stringContext type_string() throws RecognitionException {
		Type_stringContext _localctx = new Type_stringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(TucodeParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(RETURN);
			setState(152);
			expression(0);
			setState(153);
			match(DELIMITER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public While_defContext while_def() {
			return getRuleContext(While_defContext.class,0);
		}
		public Dowhile_defContext dowhile_def() {
			return getRuleContext(Dowhile_defContext.class,0);
		}
		public For_defContext for_def() {
			return getRuleContext(For_defContext.class,0);
		}
		public Loop_defContext loop_def() {
			return getRuleContext(Loop_defContext.class,0);
		}
		public If_conditionalContext if_conditional() {
			return getRuleContext(If_conditionalContext.class,0);
		}
		public Function_definedContext function_defined() {
			return getRuleContext(Function_definedContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sentence);
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				var_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				while_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				dowhile_def();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				for_def();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				loop_def();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				if_conditional();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				function_defined();
				setState(163);
				match(DELIMITER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(165);
				result();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_conditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TucodeParser.IF, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TucodeParser.ELSE, 0); }
		public If_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterIf_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitIf_conditional(this);
		}
	}

	public final If_conditionalContext if_conditional() throws RecognitionException {
		If_conditionalContext _localctx = new If_conditionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF);
			setState(169);
			match(L_PARENTHESIS);
			setState(170);
			expression(0);
			setState(171);
			match(R_PARENTHESIS);
			setState(172);
			block();
			setState(175);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(173);
				match(ELSE);
				setState(174);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TucodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TucodeParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			param();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				param();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Id_declContext id_decl() {
			return getRuleContext(Id_declContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			id_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TucodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TucodeParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			argument();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				argument();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(TucodeParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(TucodeParser.R_BRACE, 0); }
		public List<TerminalNode> DELIMITER() { return getTokens(TucodeParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(TucodeParser.DELIMITER, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if (_la==DELIMITER) {
				{
				setState(197);
				match(DELIMITER);
				}
			}

			setState(200);
			match(L_BRACE);
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(201);
				match(DELIMITER);
				}
				break;
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << DELIMITER) | (1L << FUNC_LEN) | (1L << FUNC_PRINT) | (1L << FUNC_PRINTLN) | (1L << FUNC_POW) | (1L << FUNC_ISPOSITIVE) | (1L << FUNC_ABS) | (1L << FUNC_UPPERCASE) | (1L << FUNC_LOWERCASE) | (1L << FUNC_NOD) | (1L << FUNC_ISEMPTY) | (1L << FUNC_TOINT) | (1L << FUNC_ISDIGIT) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << LOOP) | (1L << DO) | (1L << ID))) != 0)) {
				{
				{
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DELIMITER) {
					{
					{
					setState(204);
					match(DELIMITER);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				sentence();
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(211);
						match(DELIMITER);
						}
						} 
					}
					setState(216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			match(R_BRACE);
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(223);
				match(DELIMITER);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode DEF_FUNC() { return getToken(TucodeParser.DEF_FUNC, 0); }
		public TerminalNode ID() { return getToken(TucodeParser.ID, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			data_type();
			setState(227);
			match(DEF_FUNC);
			setState(228);
			match(ID);
			setState(229);
			match(L_PARENTHESIS);
			setState(231);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				setState(230);
				params();
				}
			}

			setState(233);
			match(R_PARENTHESIS);
			setState(234);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definedContext extends ParserRuleContext {
		public Print_defContext print_def() {
			return getRuleContext(Print_defContext.class,0);
		}
		public Println_defContext println_def() {
			return getRuleContext(Println_defContext.class,0);
		}
		public Length_defContext length_def() {
			return getRuleContext(Length_defContext.class,0);
		}
		public Nod_defContext nod_def() {
			return getRuleContext(Nod_defContext.class,0);
		}
		public Lowercase_defContext lowercase_def() {
			return getRuleContext(Lowercase_defContext.class,0);
		}
		public Uppercase_defContext uppercase_def() {
			return getRuleContext(Uppercase_defContext.class,0);
		}
		public Abs_defContext abs_def() {
			return getRuleContext(Abs_defContext.class,0);
		}
		public IsPositive_defContext isPositive_def() {
			return getRuleContext(IsPositive_defContext.class,0);
		}
		public Power_defContext power_def() {
			return getRuleContext(Power_defContext.class,0);
		}
		public IsDigit_defContext isDigit_def() {
			return getRuleContext(IsDigit_defContext.class,0);
		}
		public IsEmpty_defContext isEmpty_def() {
			return getRuleContext(IsEmpty_defContext.class,0);
		}
		public ToInt_defContext toInt_def() {
			return getRuleContext(ToInt_defContext.class,0);
		}
		public User_function_definedContext user_function_defined() {
			return getRuleContext(User_function_definedContext.class,0);
		}
		public Function_definedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_defined; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterFunction_defined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitFunction_defined(this);
		}
	}

	public final Function_definedContext function_defined() throws RecognitionException {
		Function_definedContext _localctx = new Function_definedContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_defined);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case FUNC_PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				print_def();
				}
				break;
			case FUNC_PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				println_def();
				}
				break;
			case FUNC_LEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				length_def();
				}
				break;
			case FUNC_NOD:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				nod_def();
				}
				break;
			case FUNC_LOWERCASE:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				lowercase_def();
				}
				break;
			case FUNC_UPPERCASE:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				uppercase_def();
				}
				break;
			case FUNC_ABS:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				abs_def();
				}
				break;
			case FUNC_ISPOSITIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				isPositive_def();
				}
				break;
			case FUNC_POW:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				power_def();
				}
				break;
			case FUNC_ISDIGIT:
				enterOuterAlt(_localctx, 10);
				{
				setState(245);
				isDigit_def();
				}
				break;
			case FUNC_ISEMPTY:
				enterOuterAlt(_localctx, 11);
				{
				setState(246);
				isEmpty_def();
				}
				break;
			case FUNC_TOINT:
				enterOuterAlt(_localctx, 12);
				{
				setState(247);
				toInt_def();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 13);
				{
				setState(248);
				user_function_defined();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Length_defContext extends ParserRuleContext {
		public TerminalNode FUNC_LEN() { return getToken(TucodeParser.FUNC_LEN, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public Length_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterLength_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitLength_def(this);
		}
	}

	public final Length_defContext length_def() throws RecognitionException {
		Length_defContext _localctx = new Length_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_length_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(FUNC_LEN);
			setState(252);
			match(L_PARENTHESIS);
			setState(253);
			expression(0);
			setState(254);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Power_defContext extends ParserRuleContext {
		public TerminalNode FUNC_POW() { return getToken(TucodeParser.FUNC_POW, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public Power_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterPower_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitPower_def(this);
		}
	}

	public final Power_defContext power_def() throws RecognitionException {
		Power_defContext _localctx = new Power_defContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_power_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(FUNC_POW);
			setState(257);
			match(L_PARENTHESIS);
			setState(258);
			expression(0);
			setState(259);
			match(COMMA);
			setState(260);
			expression(0);
			setState(261);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Println_defContext extends ParserRuleContext {
		public TerminalNode FUNC_PRINTLN() { return getToken(TucodeParser.FUNC_PRINTLN, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public Println_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterPrintln_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitPrintln_def(this);
		}
	}

	public final Println_defContext println_def() throws RecognitionException {
		Println_defContext _localctx = new Println_defContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_println_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(FUNC_PRINTLN);
			setState(264);
			match(L_PARENTHESIS);
			setState(265);
			expression(0);
			setState(266);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_defContext extends ParserRuleContext {
		public TerminalNode FUNC_PRINT() { return getToken(TucodeParser.FUNC_PRINT, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public Print_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterPrint_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitPrint_def(this);
		}
	}

	public final Print_defContext print_def() throws RecognitionException {
		Print_defContext _localctx = new Print_defContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_print_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(FUNC_PRINT);
			setState(269);
			match(L_PARENTHESIS);
			setState(270);
			expression(0);
			setState(271);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsPositive_defContext extends ParserRuleContext {
		public TerminalNode FUNC_ISPOSITIVE() { return getToken(TucodeParser.FUNC_ISPOSITIVE, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public IsPositive_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isPositive_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterIsPositive_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitIsPositive_def(this);
		}
	}

	public final IsPositive_defContext isPositive_def() throws RecognitionException {
		IsPositive_defContext _localctx = new IsPositive_defContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_isPositive_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(FUNC_ISPOSITIVE);
			setState(274);
			match(L_PARENTHESIS);
			setState(275);
			expression(0);
			setState(276);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abs_defContext extends ParserRuleContext {
		public TerminalNode FUNC_ABS() { return getToken(TucodeParser.FUNC_ABS, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public Abs_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abs_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterAbs_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitAbs_def(this);
		}
	}

	public final Abs_defContext abs_def() throws RecognitionException {
		Abs_defContext _localctx = new Abs_defContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_abs_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(FUNC_ABS);
			setState(279);
			match(L_PARENTHESIS);
			setState(280);
			expression(0);
			setState(281);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Uppercase_defContext extends ParserRuleContext {
		public TerminalNode FUNC_UPPERCASE() { return getToken(TucodeParser.FUNC_UPPERCASE, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public Uppercase_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uppercase_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterUppercase_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitUppercase_def(this);
		}
	}

	public final Uppercase_defContext uppercase_def() throws RecognitionException {
		Uppercase_defContext _localctx = new Uppercase_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_uppercase_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(FUNC_UPPERCASE);
			setState(284);
			match(L_PARENTHESIS);
			setState(285);
			expression(0);
			setState(286);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lowercase_defContext extends ParserRuleContext {
		public TerminalNode FUNC_LOWERCASE() { return getToken(TucodeParser.FUNC_LOWERCASE, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public Lowercase_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowercase_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterLowercase_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitLowercase_def(this);
		}
	}

	public final Lowercase_defContext lowercase_def() throws RecognitionException {
		Lowercase_defContext _localctx = new Lowercase_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lowercase_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(FUNC_LOWERCASE);
			setState(289);
			match(L_PARENTHESIS);
			setState(290);
			expression(0);
			setState(291);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nod_defContext extends ParserRuleContext {
		public TerminalNode FUNC_NOD() { return getToken(TucodeParser.FUNC_NOD, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public Nod_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nod_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterNod_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitNod_def(this);
		}
	}

	public final Nod_defContext nod_def() throws RecognitionException {
		Nod_defContext _localctx = new Nod_defContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nod_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(FUNC_NOD);
			setState(294);
			match(L_PARENTHESIS);
			setState(295);
			expression(0);
			setState(296);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsEmpty_defContext extends ParserRuleContext {
		public TerminalNode FUNC_ISEMPTY() { return getToken(TucodeParser.FUNC_ISEMPTY, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public IsEmpty_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isEmpty_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterIsEmpty_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitIsEmpty_def(this);
		}
	}

	public final IsEmpty_defContext isEmpty_def() throws RecognitionException {
		IsEmpty_defContext _localctx = new IsEmpty_defContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_isEmpty_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(FUNC_ISEMPTY);
			setState(299);
			match(L_PARENTHESIS);
			setState(300);
			expression(0);
			setState(301);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToInt_defContext extends ParserRuleContext {
		public TerminalNode FUNC_TOINT() { return getToken(TucodeParser.FUNC_TOINT, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public ToInt_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toInt_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterToInt_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitToInt_def(this);
		}
	}

	public final ToInt_defContext toInt_def() throws RecognitionException {
		ToInt_defContext _localctx = new ToInt_defContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_toInt_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(FUNC_TOINT);
			setState(304);
			match(L_PARENTHESIS);
			setState(305);
			expression(0);
			setState(306);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsDigit_defContext extends ParserRuleContext {
		public TerminalNode FUNC_ISDIGIT() { return getToken(TucodeParser.FUNC_ISDIGIT, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public IsDigit_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isDigit_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterIsDigit_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitIsDigit_def(this);
		}
	}

	public final IsDigit_defContext isDigit_def() throws RecognitionException {
		IsDigit_defContext _localctx = new IsDigit_defContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_isDigit_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(FUNC_ISDIGIT);
			setState(309);
			match(L_PARENTHESIS);
			setState(310);
			expression(0);
			setState(311);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_defContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TucodeParser.WHILE, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterWhile_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitWhile_def(this);
		}
	}

	public final While_defContext while_def() throws RecognitionException {
		While_defContext _localctx = new While_defContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_while_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(WHILE);
			setState(314);
			match(L_PARENTHESIS);
			setState(315);
			expression(0);
			setState(316);
			match(R_PARENTHESIS);
			setState(317);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dowhile_defContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(TucodeParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(TucodeParser.WHILE, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
		public Dowhile_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterDowhile_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitDowhile_def(this);
		}
	}

	public final Dowhile_defContext dowhile_def() throws RecognitionException {
		Dowhile_defContext _localctx = new Dowhile_defContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_dowhile_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(DO);
			setState(320);
			block();
			setState(321);
			match(WHILE);
			setState(322);
			match(L_PARENTHESIS);
			setState(323);
			expression(0);
			setState(324);
			match(R_PARENTHESIS);
			setState(325);
			match(DELIMITER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_defContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TucodeParser.FOR, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<For_var_assignContext> for_var_assign() {
			return getRuleContexts(For_var_assignContext.class);
		}
		public For_var_assignContext for_var_assign(int i) {
			return getRuleContext(For_var_assignContext.class,i);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_var_declContext for_var_decl() {
			return getRuleContext(For_var_declContext.class,0);
		}
		public For_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterFor_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitFor_def(this);
		}
	}

	public final For_defContext for_def() throws RecognitionException {
		For_defContext _localctx = new For_defContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_for_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(FOR);
			setState(328);
			match(L_PARENTHESIS);
			setState(331);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				{
				setState(329);
				for_var_decl();
				}
				break;
			case ID:
				{
				setState(330);
				for_var_assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(333);
			match(T__4);
			setState(334);
			expression(0);
			setState(335);
			match(T__4);
			setState(336);
			for_var_assign();
			setState(337);
			match(R_PARENTHESIS);
			setState(338);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_defContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(TucodeParser.LOOP, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Loop_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterLoop_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitLoop_def(this);
		}
	}

	public final Loop_defContext loop_def() throws RecognitionException {
		Loop_defContext _localctx = new Loop_defContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_loop_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(LOOP);
			setState(341);
			match(L_PARENTHESIS);
			setState(342);
			expression(0);
			setState(343);
			match(R_PARENTHESIS);
			setState(344);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_function_definedContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TucodeParser.ID, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public User_function_definedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_function_defined; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterUser_function_defined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitUser_function_defined(this);
		}
	}

	public final User_function_definedContext user_function_defined() throws RecognitionException {
		User_function_definedContext _localctx = new User_function_definedContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_user_function_defined);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(ID);
			setState(347);
			match(L_PARENTHESIS);
			setState(349);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATOR_NOT) | (1L << FUNC_LEN) | (1L << FUNC_PRINT) | (1L << FUNC_PRINTLN) | (1L << FUNC_POW) | (1L << FUNC_ISPOSITIVE) | (1L << FUNC_ABS) | (1L << FUNC_UPPERCASE) | (1L << FUNC_LOWERCASE) | (1L << FUNC_NOD) | (1L << FUNC_ISEMPTY) | (1L << FUNC_TOINT) | (1L << FUNC_ISDIGIT) | (1L << ID) | (1L << CHARACTER) | (1L << STRING) | (1L << INTEGER) | (1L << BOOLEAN))) != 0)) {
				{
				setState(348);
				arguments();
				}
			}

			setState(351);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_defContext extends ParserRuleContext {
		public TerminalNode FUNC_MAIN() { return getToken(TucodeParser.FUNC_MAIN, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TucodeParser.L_PARENTHESIS, 0); }
		public TerminalNode R_PARENTHESIS() { return getToken(TucodeParser.R_PARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Main_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterMain_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitMain_def(this);
		}
	}

	public final Main_defContext main_def() throws RecognitionException {
		Main_defContext _localctx = new Main_defContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_main_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(FUNC_MAIN);
			setState(354);
			match(L_PARENTHESIS);
			setState(355);
			match(R_PARENTHESIS);
			setState(356);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Main_defContext main_def() {
			return getRuleContext(Main_defContext.class,0);
		}
		public List<TerminalNode> DELIMITER() { return getTokens(TucodeParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(TucodeParser.DELIMITER, i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					match(DELIMITER);
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				{
				setState(364);
				function_def();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITER) {
				{
				{
				setState(370);
				match(DELIMITER);
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			main_def();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELIMITER) {
				{
				{
				setState(377);
				match(DELIMITER);
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u0182\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\5\2[\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\3\3\3\5\3s\n\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b2"+
		"\n\21\3\22\3\22\3\22\7\22\u00b7\n\22\f\22\16\22\u00ba\13\22\3\23\3\23"+
		"\3\24\3\24\3\24\7\24\u00c1\n\24\f\24\16\24\u00c4\13\24\3\25\3\25\3\26"+
		"\5\26\u00c9\n\26\3\26\3\26\5\26\u00cd\n\26\3\26\7\26\u00d0\n\26\f\26\16"+
		"\26\u00d3\13\26\3\26\3\26\7\26\u00d7\n\26\f\26\16\26\u00da\13\26\7\26"+
		"\u00dc\n\26\f\26\16\26\u00df\13\26\3\26\3\26\5\26\u00e3\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u00ea\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fc\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\5\'\u014e\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\5)\u0160\n)\3)\3)\3*\3*\3*\3*\3*\3+\7+\u016a"+
		"\n+\f+\16+\u016d\13+\3+\7+\u0170\n+\f+\16+\u0173\13+\3+\7+\u0176\n+\f"+
		"+\16+\u0179\13+\3+\3+\7+\u017d\n+\f+\16+\u0180\13+\3+\2\3\2,\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\6"+
		"\3\2\22\23\4\2\21\21\24\24\3\2\13\20\3\2\659\u0185\2Z\3\2\2\2\4r\3\2\2"+
		"\2\6t\3\2\2\2\bv\3\2\2\2\ny\3\2\2\2\f~\3\2\2\2\16\u0082\3\2\2\2\20\u0087"+
		"\3\2\2\2\22\u008f\3\2\2\2\24\u0091\3\2\2\2\26\u0093\3\2\2\2\30\u0095\3"+
		"\2\2\2\32\u0097\3\2\2\2\34\u0099\3\2\2\2\36\u00a8\3\2\2\2 \u00aa\3\2\2"+
		"\2\"\u00b3\3\2\2\2$\u00bb\3\2\2\2&\u00bd\3\2\2\2(\u00c5\3\2\2\2*\u00c8"+
		"\3\2\2\2,\u00e4\3\2\2\2.\u00fb\3\2\2\2\60\u00fd\3\2\2\2\62\u0102\3\2\2"+
		"\2\64\u0109\3\2\2\2\66\u010e\3\2\2\28\u0113\3\2\2\2:\u0118\3\2\2\2<\u011d"+
		"\3\2\2\2>\u0122\3\2\2\2@\u0127\3\2\2\2B\u012c\3\2\2\2D\u0131\3\2\2\2F"+
		"\u0136\3\2\2\2H\u013b\3\2\2\2J\u0141\3\2\2\2L\u0149\3\2\2\2N\u0156\3\2"+
		"\2\2P\u015c\3\2\2\2R\u0163\3\2\2\2T\u016b\3\2\2\2VW\b\2\1\2W[\5\4\3\2"+
		"XY\7\b\2\2Y[\5\4\3\2ZV\3\2\2\2ZX\3\2\2\2[m\3\2\2\2\\]\f\b\2\2]^\t\2\2"+
		"\2^l\5\2\2\t_`\f\7\2\2`a\t\3\2\2al\5\2\2\bbc\f\6\2\2cd\t\4\2\2dl\5\2\2"+
		"\7ef\f\4\2\2fg\7\t\2\2gl\5\2\2\5hi\f\3\2\2ij\7\n\2\2jl\5\2\2\4k\\\3\2"+
		"\2\2k_\3\2\2\2kb\3\2\2\2ke\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2"+
		"\2\2n\3\3\2\2\2om\3\2\2\2ps\5.\30\2qs\5\6\4\2rp\3\2\2\2rq\3\2\2\2s\5\3"+
		"\2\2\2tu\t\5\2\2u\7\3\2\2\2vw\5\22\n\2wx\7\65\2\2x\t\3\2\2\2yz\5\b\5\2"+
		"z{\7-\2\2{|\5\2\2\2|}\7\32\2\2}\13\3\2\2\2~\177\5\b\5\2\177\u0080\7-\2"+
		"\2\u0080\u0081\5\2\2\2\u0081\r\3\2\2\2\u0082\u0083\7\65\2\2\u0083\u0084"+
		"\7-\2\2\u0084\u0085\5\2\2\2\u0085\u0086\7\32\2\2\u0086\17\3\2\2\2\u0087"+
		"\u0088\7\65\2\2\u0088\u0089\7-\2\2\u0089\u008a\5\2\2\2\u008a\21\3\2\2"+
		"\2\u008b\u0090\5\24\13\2\u008c\u0090\5\26\f\2\u008d\u0090\5\30\r\2\u008e"+
		"\u0090\5\32\16\2\u008f\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3"+
		"\2\2\2\u008f\u008e\3\2\2\2\u0090\23\3\2\2\2\u0091\u0092\7\3\2\2\u0092"+
		"\25\3\2\2\2\u0093\u0094\7\4\2\2\u0094\27\3\2\2\2\u0095\u0096\7\5\2\2\u0096"+
		"\31\3\2\2\2\u0097\u0098\7\6\2\2\u0098\33\3\2\2\2\u0099\u009a\7*\2\2\u009a"+
		"\u009b\5\2\2\2\u009b\u009c\7\32\2\2\u009c\35\3\2\2\2\u009d\u00a9\5\n\6"+
		"\2\u009e\u00a9\5\16\b\2\u009f\u00a9\5H%\2\u00a0\u00a9\5J&\2\u00a1\u00a9"+
		"\5L\'\2\u00a2\u00a9\5N(\2\u00a3\u00a9\5 \21\2\u00a4\u00a5\5.\30\2\u00a5"+
		"\u00a6\7\32\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\5\34\17\2\u00a8\u009d"+
		"\3\2\2\2\u00a8\u009e\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8"+
		"\u00a1\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\37\3\2\2\2\u00aa\u00ab\7+\2\2\u00ab\u00ac"+
		"\7\26\2\2\u00ac\u00ad\5\2\2\2\u00ad\u00ae\7\27\2\2\u00ae\u00b1\5*\26\2"+
		"\u00af\u00b0\7,\2\2\u00b0\u00b2\5*\26\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2!\3\2\2\2\u00b3\u00b8\5$\23\2\u00b4\u00b5\7\33\2\2\u00b5"+
		"\u00b7\5$\23\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9#\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc"+
		"\5\b\5\2\u00bc%\3\2\2\2\u00bd\u00c2\5(\25\2\u00be\u00bf\7\33\2\2\u00bf"+
		"\u00c1\5(\25\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\'\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6"+
		"\5\2\2\2\u00c6)\3\2\2\2\u00c7\u00c9\7\32\2\2\u00c8\u00c7\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\7\30\2\2\u00cb\u00cd\7"+
		"\32\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00dd\3\2\2\2\u00ce"+
		"\u00d0\7\32\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d8\5\36\20\2\u00d5\u00d7\7\32\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00d1\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e2\7\31\2\2\u00e1\u00e3\7\32\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3+\3\2\2\2\u00e4\u00e5\5\22\n\2\u00e5\u00e6\7\34\2\2\u00e6"+
		"\u00e7\7\65\2\2\u00e7\u00e9\7\26\2\2\u00e8\u00ea\5\"\22\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\27\2\2"+
		"\u00ec\u00ed\5*\26\2\u00ed-\3\2\2\2\u00ee\u00fc\5\66\34\2\u00ef\u00fc"+
		"\5\64\33\2\u00f0\u00fc\5\60\31\2\u00f1\u00fc\5@!\2\u00f2\u00fc\5> \2\u00f3"+
		"\u00fc\5<\37\2\u00f4\u00fc\5:\36\2\u00f5\u00fc\58\35\2\u00f6\u00fc\5\62"+
		"\32\2\u00f7\u00fc\5F$\2\u00f8\u00fc\5B\"\2\u00f9\u00fc\5D#\2\u00fa\u00fc"+
		"\5P)\2\u00fb\u00ee\3\2\2\2\u00fb\u00ef\3\2\2\2\u00fb\u00f0\3\2\2\2\u00fb"+
		"\u00f1\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f4\3\2"+
		"\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb"+
		"\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc/\3\2\2\2"+
		"\u00fd\u00fe\7\35\2\2\u00fe\u00ff\7\26\2\2\u00ff\u0100\5\2\2\2\u0100\u0101"+
		"\7\27\2\2\u0101\61\3\2\2\2\u0102\u0103\7!\2\2\u0103\u0104\7\26\2\2\u0104"+
		"\u0105\5\2\2\2\u0105\u0106\7\33\2\2\u0106\u0107\5\2\2\2\u0107\u0108\7"+
		"\27\2\2\u0108\63\3\2\2\2\u0109\u010a\7\37\2\2\u010a\u010b\7\26\2\2\u010b"+
		"\u010c\5\2\2\2\u010c\u010d\7\27\2\2\u010d\65\3\2\2\2\u010e\u010f\7\36"+
		"\2\2\u010f\u0110\7\26\2\2\u0110\u0111\5\2\2\2\u0111\u0112\7\27\2\2\u0112"+
		"\67\3\2\2\2\u0113\u0114\7\"\2\2\u0114\u0115\7\26\2\2\u0115\u0116\5\2\2"+
		"\2\u0116\u0117\7\27\2\2\u01179\3\2\2\2\u0118\u0119\7#\2\2\u0119\u011a"+
		"\7\26\2\2\u011a\u011b\5\2\2\2\u011b\u011c\7\27\2\2\u011c;\3\2\2\2\u011d"+
		"\u011e\7$\2\2\u011e\u011f\7\26\2\2\u011f\u0120\5\2\2\2\u0120\u0121\7\27"+
		"\2\2\u0121=\3\2\2\2\u0122\u0123\7%\2\2\u0123\u0124\7\26\2\2\u0124\u0125"+
		"\5\2\2\2\u0125\u0126\7\27\2\2\u0126?\3\2\2\2\u0127\u0128\7&\2\2\u0128"+
		"\u0129\7\26\2\2\u0129\u012a\5\2\2\2\u012a\u012b\7\27\2\2\u012bA\3\2\2"+
		"\2\u012c\u012d\7\'\2\2\u012d\u012e\7\26\2\2\u012e\u012f\5\2\2\2\u012f"+
		"\u0130\7\27\2\2\u0130C\3\2\2\2\u0131\u0132\7(\2\2\u0132\u0133\7\26\2\2"+
		"\u0133\u0134\5\2\2\2\u0134\u0135\7\27\2\2\u0135E\3\2\2\2\u0136\u0137\7"+
		")\2\2\u0137\u0138\7\26\2\2\u0138\u0139\5\2\2\2\u0139\u013a\7\27\2\2\u013a"+
		"G\3\2\2\2\u013b\u013c\7\61\2\2\u013c\u013d\7\26\2\2\u013d\u013e\5\2\2"+
		"\2\u013e\u013f\7\27\2\2\u013f\u0140\5*\26\2\u0140I\3\2\2\2\u0141\u0142"+
		"\7\64\2\2\u0142\u0143\5*\26\2\u0143\u0144\7\61\2\2\u0144\u0145\7\26\2"+
		"\2\u0145\u0146\5\2\2\2\u0146\u0147\7\27\2\2\u0147\u0148\7\32\2\2\u0148"+
		"K\3\2\2\2\u0149\u014a\7\62\2\2\u014a\u014d\7\26\2\2\u014b\u014e\5\f\7"+
		"\2\u014c\u014e\5\20\t\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\7\7\2\2\u0150\u0151\5\2\2\2\u0151\u0152\7\7"+
		"\2\2\u0152\u0153\5\20\t\2\u0153\u0154\7\27\2\2\u0154\u0155\5*\26\2\u0155"+
		"M\3\2\2\2\u0156\u0157\7\63\2\2\u0157\u0158\7\26\2\2\u0158\u0159\5\2\2"+
		"\2\u0159\u015a\7\27\2\2\u015a\u015b\5*\26\2\u015bO\3\2\2\2\u015c\u015d"+
		"\7\65\2\2\u015d\u015f\7\26\2\2\u015e\u0160\5&\24\2\u015f\u015e\3\2\2\2"+
		"\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7\27\2\2\u0162Q\3"+
		"\2\2\2\u0163\u0164\7 \2\2\u0164\u0165\7\26\2\2\u0165\u0166\7\27\2\2\u0166"+
		"\u0167\5*\26\2\u0167S\3\2\2\2\u0168\u016a\7\32\2\2\u0169\u0168\3\2\2\2"+
		"\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0171"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\5,\27\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0177\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0174\u0176\7\32\2\2\u0175\u0174\3\2\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u017a\u017e\5R*\2\u017b\u017d\7\32\2\2\u017c"+
		"\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017fU\3\2\2\2\u0180\u017e\3\2\2\2\31Zkmr\u008f\u00a8\u00b1\u00b8"+
		"\u00c2\u00c8\u00cc\u00d1\u00d8\u00dd\u00e2\u00e9\u00fb\u014d\u015f\u016b"+
		"\u0171\u0177\u017e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}