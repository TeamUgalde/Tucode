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
		T__0=1, T__1=2, T__2=3, T__3=4, OPERATOR_NOT=5, OPERATOR_AND=6, OPERATOR_OR=7, 
		OPERATOR_EQU=8, OPERATOR_DIFF=9, OPERATOR_GRT=10, OPERATOR_LOT=11, OPERATOR_GRE=12, 
		OPERATOR_LOE=13, OPERATOR_NEG=14, OPERATOR_MULT=15, OPERATOR_DIV=16, OPERATOR_ADD=17, 
		OPERATOR_SUB=18, L_PARENTHESIS=19, R_PARENTHESIS=20, L_BRACE=21, R_BRACE=22, 
		DELIMITER=23, COMMA=24, DEF_FUNC=25, FUNC_LEN=26, FUNC_PRINT=27, FUNC_PRINTLN=28, 
		FUNC_MAIN=29, FUNC_POW=30, FUNC_ISPOSITIVE=31, FUNC_ABS=32, FUNC_UPPERCASE=33, 
		FUNC_LOWERCASE=34, FUNC_NOD=35, FUNC_ISEMPTY=36, FUNC_TOINT=37, FUNC_ISDIGIT=38, 
		RETURN=39, IF=40, ELSE=41, OPERATOR_ASSIG=42, ID=43, INLINE_COMMENT=44, 
		WS=45, MULTILINE_COMMENT=46, WHILE=47, FOR=48, LOOP=49, DO=50, CHARACTER=51, 
		STRING=52, INTEGER=53, BOOLEAN=54;
	public static final int
		RULE_expression = 0, RULE_element = 1, RULE_literal = 2, RULE_id_decl = 3, 
		RULE_var_decl = 4, RULE_data_type = 5, RULE_type_int = 6, RULE_type_char = 7, 
		RULE_type_bool = 8, RULE_type_string = 9, RULE_result = 10, RULE_sentence = 11, 
		RULE_if_conditional = 12, RULE_params = 13, RULE_param = 14, RULE_arguments = 15, 
		RULE_argument = 16, RULE_block = 17, RULE_while_def = 18, RULE_dowhile_def = 19, 
		RULE_for_def = 20, RULE_loop_def = 21, RULE_function_def = 22, RULE_function_defined = 23, 
		RULE_main_def = 24, RULE_program = 25;
	public static final String[] ruleNames = {
		"expression", "element", "literal", "id_decl", "var_decl", "data_type", 
		"type_int", "type_char", "type_bool", "type_string", "result", "sentence", 
		"if_conditional", "params", "param", "arguments", "argument", "block", 
		"while_def", "dowhile_def", "for_def", "loop_def", "function_def", "function_defined", 
		"main_def", "program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'numero'", "'simbolo'", "'booleano'", "'texto'", "'!'", "'y'", 
		"'o'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", null, "'*'", "'/'", 
		"'+'", null, "'('", "')'", "'{'", "'}'", "';'", "','", "'definir'", "'largo'", 
		"'imprimir'", "'imprimirln'", "'comienzo'", "'potencia'", "'esPositivo'", 
		"'absoluto'", "'mayuscula'", "'minuscula'", "'cantidadDigitos'", "'esVacio'", 
		"'aEntero'", "'esDigito'", "'devolver'", "'si'", "'sino'", "'='", null, 
		null, null, null, "'mientras'", "'para'", "'repetir'", "'hacer'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "OPERATOR_NOT", "OPERATOR_AND", "OPERATOR_OR", 
		"OPERATOR_EQU", "OPERATOR_DIFF", "OPERATOR_GRT", "OPERATOR_LOT", "OPERATOR_GRE", 
		"OPERATOR_LOE", "OPERATOR_NEG", "OPERATOR_MULT", "OPERATOR_DIV", "OPERATOR_ADD", 
		"OPERATOR_SUB", "L_PARENTHESIS", "R_PARENTHESIS", "L_BRACE", "R_BRACE", 
		"DELIMITER", "COMMA", "DEF_FUNC", "FUNC_LEN", "FUNC_PRINT", "FUNC_PRINTLN", 
		"FUNC_MAIN", "FUNC_POW", "FUNC_ISPOSITIVE", "FUNC_ABS", "FUNC_UPPERCASE", 
		"FUNC_LOWERCASE", "FUNC_NOD", "FUNC_ISEMPTY", "FUNC_TOINT", "FUNC_ISDIGIT", 
		"RETURN", "IF", "ELSE", "OPERATOR_ASSIG", "ID", "INLINE_COMMENT", "WS", 
		"MULTILINE_COMMENT", "WHILE", "FOR", "LOOP", "DO", "CHARACTER", "STRING", 
		"INTEGER", "BOOLEAN"
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
			setState(56);
			switch (_input.LA(1)) {
			case ID:
			case CHARACTER:
			case STRING:
			case INTEGER:
			case BOOLEAN:
				{
				setState(53);
				element();
				}
				break;
			case OPERATOR_NOT:
				{
				setState(54);
				match(OPERATOR_NOT);
				setState(55);
				element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(58);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(59);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_MULT || _la==OPERATOR_DIV) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(60);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(61);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(62);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_NEG || _la==OPERATOR_ADD) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(63);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(64);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(65);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATOR_EQU) | (1L << OPERATOR_DIFF) | (1L << OPERATOR_GRT) | (1L << OPERATOR_LOT) | (1L << OPERATOR_GRE) | (1L << OPERATOR_LOE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(66);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(67);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(68);
						match(OPERATOR_AND);
						setState(69);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(71);
						match(OPERATOR_OR);
						setState(72);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(77);
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
		public TerminalNode ID() { return getToken(TucodeParser.ID, 0); }
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
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				function_defined();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(ID);
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
			setState(83);
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
			setState(85);
			data_type();
			setState(86);
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
			setState(88);
			id_decl();
			setState(89);
			match(OPERATOR_ASSIG);
			setState(90);
			expression(0);
			setState(91);
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
		enterRule(_localctx, 10, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(93);
				type_int();
				}
				break;
			case T__1:
				{
				setState(94);
				type_char();
				}
				break;
			case T__2:
				{
				setState(95);
				type_bool();
				}
				break;
			case T__3:
				{
				setState(96);
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
		enterRule(_localctx, 12, RULE_type_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		enterRule(_localctx, 14, RULE_type_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		enterRule(_localctx, 16, RULE_type_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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
		enterRule(_localctx, 18, RULE_type_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 20, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(RETURN);
			setState(108);
			expression(0);
			setState(109);
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
		public Function_definedContext function_defined() {
			return getRuleContext(Function_definedContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public If_conditionalContext if_conditional() {
			return getRuleContext(If_conditionalContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
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
		enterRule(_localctx, 22, RULE_sentence);
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				function_defined();
				setState(113);
				match(DELIMITER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				function_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				if_conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				result();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				while_def();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				dowhile_def();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(120);
				for_def();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(121);
				loop_def();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_if_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IF);
			setState(125);
			match(L_PARENTHESIS);
			setState(126);
			expression(0);
			setState(127);
			match(R_PARENTHESIS);
			setState(128);
			block();
			setState(131);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(129);
				match(ELSE);
				setState(130);
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
		enterRule(_localctx, 26, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			param();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				param();
				}
				}
				setState(140);
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
		enterRule(_localctx, 28, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			argument();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				argument();
				}
				}
				setState(150);
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
		enterRule(_localctx, 32, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(L_BRACE);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << RETURN) | (1L << IF) | (1L << ID) | (1L << WHILE) | (1L << FOR) | (1L << LOOP) | (1L << DO))) != 0)) {
				{
				{
				setState(154);
				sentence();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(R_BRACE);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_while_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WHILE);
			setState(163);
			match(L_PARENTHESIS);
			setState(164);
			expression(0);
			setState(165);
			match(R_PARENTHESIS);
			setState(166);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_dowhile_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(DO);
			setState(169);
			block();
			setState(170);
			match(WHILE);
			setState(171);
			match(L_PARENTHESIS);
			setState(172);
			expression(0);
			setState(173);
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

	public static class For_defContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TucodeParser.FOR, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 40, RULE_for_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(FOR);
			setState(176);
			match(L_PARENTHESIS);
			setState(177);
			var_decl();
			setState(178);
			expression(0);
			setState(179);
			match(DELIMITER);
			setState(180);
			expression(0);
			setState(181);
			match(R_PARENTHESIS);
			setState(182);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_loop_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(LOOP);
			setState(185);
			match(L_PARENTHESIS);
			setState(186);
			expression(0);
			setState(187);
			match(R_PARENTHESIS);
			setState(188);
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

	public static class Function_defContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode DEF_FUNC() { return getToken(TucodeParser.DEF_FUNC, 0); }
		public TerminalNode ID() { return getToken(TucodeParser.ID, 0); }
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
		enterRule(_localctx, 44, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			data_type();
			setState(191);
			match(DEF_FUNC);
			setState(192);
			match(ID);
			setState(193);
			match(L_PARENTHESIS);
			setState(195);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				setState(194);
				params();
				}
			}

			setState(197);
			match(R_PARENTHESIS);
			setState(198);
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
		public TerminalNode ID() { return getToken(TucodeParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
		enterRule(_localctx, 46, RULE_function_defined);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
			setState(201);
			match(L_PARENTHESIS);
			setState(203);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATOR_NOT) | (1L << ID) | (1L << CHARACTER) | (1L << STRING) | (1L << INTEGER) | (1L << BOOLEAN))) != 0)) {
				{
				setState(202);
				arguments();
				}
			}

			setState(205);
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
		public Type_intContext type_int() {
			return getRuleContext(Type_intContext.class,0);
		}
		public TerminalNode FUNC_MAIN() { return getToken(TucodeParser.FUNC_MAIN, 0); }
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
		enterRule(_localctx, 48, RULE_main_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			type_int();
			setState(208);
			match(FUNC_MAIN);
			setState(209);
			match(L_PARENTHESIS);
			setState(210);
			match(R_PARENTHESIS);
			setState(211);
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
		enterRule(_localctx, 50, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			main_def();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\5\2;\n\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\3\3\3\3"+
		"\3\5\3T\n\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5"+
		"\7d\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0086\n\16\3\17\3\17\3\17\7\17\u008b\n\17\f\17\16\17\u008e"+
		"\13\17\3\20\3\20\3\21\3\21\3\21\7\21\u0095\n\21\f\21\16\21\u0098\13\21"+
		"\3\22\3\22\3\23\3\23\7\23\u009e\n\23\f\23\16\23\u00a1\13\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00c6\n\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\5\31\u00ce\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\2\3\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\6"+
		"\3\2\21\22\4\2\20\20\23\23\3\2\n\17\4\2--\658\u00d8\2:\3\2\2\2\4S\3\2"+
		"\2\2\6U\3\2\2\2\bW\3\2\2\2\nZ\3\2\2\2\fc\3\2\2\2\16e\3\2\2\2\20g\3\2\2"+
		"\2\22i\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30|\3\2\2\2\32~\3\2\2\2\34\u0087"+
		"\3\2\2\2\36\u008f\3\2\2\2 \u0091\3\2\2\2\"\u0099\3\2\2\2$\u009b\3\2\2"+
		"\2&\u00a4\3\2\2\2(\u00aa\3\2\2\2*\u00b1\3\2\2\2,\u00ba\3\2\2\2.\u00c0"+
		"\3\2\2\2\60\u00ca\3\2\2\2\62\u00d1\3\2\2\2\64\u00d7\3\2\2\2\66\67\b\2"+
		"\1\2\67;\5\4\3\289\7\7\2\29;\5\4\3\2:\66\3\2\2\2:8\3\2\2\2;M\3\2\2\2<"+
		"=\f\b\2\2=>\t\2\2\2>L\5\2\2\t?@\f\7\2\2@A\t\3\2\2AL\5\2\2\bBC\f\6\2\2"+
		"CD\t\4\2\2DL\5\2\2\7EF\f\4\2\2FG\7\b\2\2GL\5\2\2\5HI\f\3\2\2IJ\7\t\2\2"+
		"JL\5\2\2\4K<\3\2\2\2K?\3\2\2\2KB\3\2\2\2KE\3\2\2\2KH\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2N\3\3\2\2\2OM\3\2\2\2PT\5\60\31\2QT\5\6\4\2RT\7-\2"+
		"\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\5\3\2\2\2UV\t\5\2\2V\7\3\2\2\2WX\5\f"+
		"\7\2XY\7-\2\2Y\t\3\2\2\2Z[\5\b\5\2[\\\7,\2\2\\]\5\2\2\2]^\7\31\2\2^\13"+
		"\3\2\2\2_d\5\16\b\2`d\5\20\t\2ad\5\22\n\2bd\5\24\13\2c_\3\2\2\2c`\3\2"+
		"\2\2ca\3\2\2\2cb\3\2\2\2d\r\3\2\2\2ef\7\3\2\2f\17\3\2\2\2gh\7\4\2\2h\21"+
		"\3\2\2\2ij\7\5\2\2j\23\3\2\2\2kl\7\6\2\2l\25\3\2\2\2mn\7)\2\2no\5\2\2"+
		"\2op\7\31\2\2p\27\3\2\2\2q}\5\n\6\2rs\5\60\31\2st\7\31\2\2t}\3\2\2\2u"+
		"}\5.\30\2v}\5\32\16\2w}\5\26\f\2x}\5&\24\2y}\5(\25\2z}\5*\26\2{}\5,\27"+
		"\2|q\3\2\2\2|r\3\2\2\2|u\3\2\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2"+
		"\2|z\3\2\2\2|{\3\2\2\2}\31\3\2\2\2~\177\7*\2\2\177\u0080\7\25\2\2\u0080"+
		"\u0081\5\2\2\2\u0081\u0082\7\26\2\2\u0082\u0085\5$\23\2\u0083\u0084\7"+
		"+\2\2\u0084\u0086\5$\23\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\33\3\2\2\2\u0087\u008c\5\36\20\2\u0088\u0089\7\32\2\2\u0089\u008b\5\36"+
		"\20\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\35\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5\b\5"+
		"\2\u0090\37\3\2\2\2\u0091\u0096\5\"\22\2\u0092\u0093\7\32\2\2\u0093\u0095"+
		"\5\"\22\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097!\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\5"+
		"\2\2\2\u009a#\3\2\2\2\u009b\u009f\7\27\2\2\u009c\u009e\5\30\r\2\u009d"+
		"\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3"+
		"%\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7\25\2\2\u00a6\u00a7\5\2\2"+
		"\2\u00a7\u00a8\7\26\2\2\u00a8\u00a9\5$\23\2\u00a9\'\3\2\2\2\u00aa\u00ab"+
		"\7\64\2\2\u00ab\u00ac\5$\23\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae\7\25\2"+
		"\2\u00ae\u00af\5\2\2\2\u00af\u00b0\7\26\2\2\u00b0)\3\2\2\2\u00b1\u00b2"+
		"\7\62\2\2\u00b2\u00b3\7\25\2\2\u00b3\u00b4\5\n\6\2\u00b4\u00b5\5\2\2\2"+
		"\u00b5\u00b6\7\31\2\2\u00b6\u00b7\5\2\2\2\u00b7\u00b8\7\26\2\2\u00b8\u00b9"+
		"\5$\23\2\u00b9+\3\2\2\2\u00ba\u00bb\7\63\2\2\u00bb\u00bc\7\25\2\2\u00bc"+
		"\u00bd\5\2\2\2\u00bd\u00be\7\26\2\2\u00be\u00bf\5$\23\2\u00bf-\3\2\2\2"+
		"\u00c0\u00c1\5\f\7\2\u00c1\u00c2\7\33\2\2\u00c2\u00c3\7-\2\2\u00c3\u00c5"+
		"\7\25\2\2\u00c4\u00c6\5\34\17\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2"+
		"\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\26\2\2\u00c8\u00c9\5$\23\2\u00c9"+
		"/\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb\u00cd\7\25\2\2\u00cc\u00ce\5 \21\2"+
		"\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\7\26\2\2\u00d0\61\3\2\2\2\u00d1\u00d2\5\16\b\2\u00d2\u00d3\7\37\2\2\u00d3"+
		"\u00d4\7\25\2\2\u00d4\u00d5\7\26\2\2\u00d5\u00d6\5$\23\2\u00d6\63\3\2"+
		"\2\2\u00d7\u00d8\5\62\32\2\u00d8\65\3\2\2\2\16:KMSc|\u0085\u008c\u0096"+
		"\u009f\u00c5\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}