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
		OPERATOR_LOE=13, OPERATOR_NEG=14, OPERATOR_POW=15, OPERATOR_MULT=16, OPERATOR_DIV=17, 
		OPERATOR_ADD=18, OPERATOR_SUB=19, L_PARENTHESIS=20, R_PARENTHESIS=21, 
		L_BRACE=22, R_BRACE=23, L_BRACKET=24, R_BRACKET=25, DELIMITER=26, COMMA=27, 
		DEF_FUNC=28, FUNC_LEN=29, FUNC_PRINT=30, FUNC_PRINTLN=31, FUNC_MAIN=32, 
		FUNC_POW=33, FUNC_ISPOSITIVE=34, FUNC_ABS=35, FUNC_UPPERCASE=36, FUNC_LOWERCASE=37, 
		FUNC_NOD=38, FUNC_ISEMPTY=39, FUNC_TOINT=40, FUNC_ISDIGIT=41, RETURN=42, 
		IF=43, ELSE=44, OPERATOR_ASSIG=45, ID=46, INLINE_COMMENT=47, WS=48, MULTILINE_COMMENT=49, 
		WHILE=50, FOR=51, LOOP=52, DO=53, CHARACTER=54, STRING=55, INTEGER=56, 
		BOOLEAN=57;
	public static final int
		RULE_expression = 0, RULE_element = 1, RULE_literal = 2, RULE_id_decl = 3, 
		RULE_func_call = 4, RULE_inputs = 5, RULE_input = 6, RULE_var_decl = 7, 
		RULE_data_type = 8, RULE_type_int = 9, RULE_type_char = 10, RULE_type_bool = 11, 
		RULE_type_string = 12, RULE_result = 13, RULE_sentence = 14, RULE_if_conditional = 15, 
		RULE_params = 16, RULE_param = 17, RULE_block = 18, RULE_while_def = 19, 
		RULE_dowhile_def = 20, RULE_for_def = 21, RULE_loop_def = 22, RULE_function_def = 23, 
		RULE_main_def = 24, RULE_length_def = 25, RULE_power_def = 26, RULE_println_def = 27, 
		RULE_print_def = 28, RULE_isPositive_def = 29, RULE_abs_def = 30, RULE_uppercase_def = 31, 
		RULE_lowercase_def = 32, RULE_nod_def = 33, RULE_isEmpty_def = 34, RULE_toInt_def = 35, 
		RULE_isDigit_def = 36, RULE_program = 37;
	public static final String[] ruleNames = {
		"expression", "element", "literal", "id_decl", "func_call", "inputs", 
		"input", "var_decl", "data_type", "type_int", "type_char", "type_bool", 
		"type_string", "result", "sentence", "if_conditional", "params", "param", 
		"block", "while_def", "dowhile_def", "for_def", "loop_def", "function_def", 
		"main_def", "length_def", "power_def", "println_def", "print_def", "isPositive_def", 
		"abs_def", "uppercase_def", "lowercase_def", "nod_def", "isEmpty_def", 
		"toInt_def", "isDigit_def", "program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'numero'", "'simbolo'", "'booleano'", "'texto'", "'!'", "'y'", 
		"'o'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", null, "'^'", "'*'", 
		"'/'", "'+'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'definir'", "'largo'", "'imprimir'", "'imprimirln'", "'comienzo'", "'potencia'", 
		"'esPositivo'", "'absoluto'", "'mayuscula'", "'minuscula'", "'cantidadDigitos'", 
		"'esVacio'", "'aEntero'", "'esDigito'", "'devolver'", "'si'", "'sino'", 
		"'='", null, null, null, null, "'mientras'", "'para'", "'repetir'", "'hacer'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "OPERATOR_NOT", "OPERATOR_AND", "OPERATOR_OR", 
		"OPERATOR_EQU", "OPERATOR_DIFF", "OPERATOR_GRT", "OPERATOR_LOT", "OPERATOR_GRE", 
		"OPERATOR_LOE", "OPERATOR_NEG", "OPERATOR_POW", "OPERATOR_MULT", "OPERATOR_DIV", 
		"OPERATOR_ADD", "OPERATOR_SUB", "L_PARENTHESIS", "R_PARENTHESIS", "L_BRACE", 
		"R_BRACE", "L_BRACKET", "R_BRACKET", "DELIMITER", "COMMA", "DEF_FUNC", 
		"FUNC_LEN", "FUNC_PRINT", "FUNC_PRINTLN", "FUNC_MAIN", "FUNC_POW", "FUNC_ISPOSITIVE", 
		"FUNC_ABS", "FUNC_UPPERCASE", "FUNC_LOWERCASE", "FUNC_NOD", "FUNC_ISEMPTY", 
		"FUNC_TOINT", "FUNC_ISDIGIT", "RETURN", "IF", "ELSE", "OPERATOR_ASSIG", 
		"ID", "INLINE_COMMENT", "WS", "MULTILINE_COMMENT", "WHILE", "FOR", "LOOP", 
		"DO", "CHARACTER", "STRING", "INTEGER", "BOOLEAN"
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
		public TerminalNode OPERATOR_NEG() { return getToken(TucodeParser.OPERATOR_NEG, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERATOR_NOT() { return getToken(TucodeParser.OPERATOR_NOT, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode OPERATOR_POW() { return getToken(TucodeParser.OPERATOR_POW, 0); }
		public TerminalNode OPERATOR_MULT() { return getToken(TucodeParser.OPERATOR_MULT, 0); }
		public TerminalNode OPERATOR_DIV() { return getToken(TucodeParser.OPERATOR_DIV, 0); }
		public TerminalNode OPERATOR_ADD() { return getToken(TucodeParser.OPERATOR_ADD, 0); }
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
			setState(82);
			switch (_input.LA(1)) {
			case OPERATOR_NEG:
				{
				setState(77);
				match(OPERATOR_NEG);
				setState(78);
				expression(8);
				}
				break;
			case OPERATOR_NOT:
				{
				setState(79);
				match(OPERATOR_NOT);
				setState(80);
				expression(3);
				}
				break;
			case L_PARENTHESIS:
			case ID:
			case CHARACTER:
			case STRING:
			case INTEGER:
			case BOOLEAN:
				{
				setState(81);
				element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(84);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(85);
						match(OPERATOR_POW);
						setState(86);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(88);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_MULT || _la==OPERATOR_DIV) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(89);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(91);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_NEG || _la==OPERATOR_ADD) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(92);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATOR_EQU) | (1L << OPERATOR_DIFF) | (1L << OPERATOR_GRT) | (1L << OPERATOR_LOT) | (1L << OPERATOR_GRE) | (1L << OPERATOR_LOE))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(95);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(97);
						match(OPERATOR_AND);
						setState(98);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(100);
						match(OPERATOR_OR);
						setState(101);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(106);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
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
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(L_PARENTHESIS);
				setState(108);
				expression(0);
				setState(109);
				match(R_PARENTHESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				func_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
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
			setState(115);
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
			setState(117);
			data_type();
			setState(118);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TucodeParser.ID, 0); }
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(121);
			match(L_PARENTHESIS);
			setState(123);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATOR_NOT) | (1L << OPERATOR_NEG) | (1L << L_PARENTHESIS) | (1L << ID) | (1L << CHARACTER) | (1L << STRING) | (1L << INTEGER) | (1L << BOOLEAN))) != 0)) {
				{
				setState(122);
				inputs();
				}
			}

			setState(125);
			match(R_PARENTHESIS);
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(126);
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

	public static class InputsContext extends ParserRuleContext {
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitInputs(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			input();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(130);
				match(COMMA);
				setState(131);
				input();
				}
				}
				setState(136);
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

	public static class InputContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TucodeListener ) ((TucodeListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
		enterRule(_localctx, 14, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			id_decl();
			setState(140);
			match(OPERATOR_ASSIG);
			setState(141);
			expression(0);
			setState(142);
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
		enterRule(_localctx, 16, RULE_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(144);
				type_int();
				}
				break;
			case T__1:
				{
				setState(145);
				type_char();
				}
				break;
			case T__2:
				{
				setState(146);
				type_bool();
				}
				break;
			case T__3:
				{
				setState(147);
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
			setState(150);
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
			setState(152);
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
			setState(154);
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
			setState(156);
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
			setState(158);
			match(RETURN);
			setState(159);
			expression(0);
			setState(160);
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
		public If_conditionalContext if_conditional() {
			return getRuleContext(If_conditionalContext.class,0);
		}
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
		public IsEmpty_defContext isEmpty_def() {
			return getRuleContext(IsEmpty_defContext.class,0);
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
		enterRule(_localctx, 28, RULE_sentence);
		try {
			setState(179);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				var_decl();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				if_conditional();
				}
				break;
			case FUNC_PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				print_def();
				}
				break;
			case FUNC_PRINTLN:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				println_def();
				}
				break;
			case FUNC_LEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				length_def();
				}
				break;
			case FUNC_NOD:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				nod_def();
				}
				break;
			case FUNC_LOWERCASE:
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				lowercase_def();
				}
				break;
			case FUNC_UPPERCASE:
				enterOuterAlt(_localctx, 8);
				{
				setState(169);
				uppercase_def();
				}
				break;
			case FUNC_ABS:
				enterOuterAlt(_localctx, 9);
				{
				setState(170);
				abs_def();
				}
				break;
			case FUNC_ISPOSITIVE:
				enterOuterAlt(_localctx, 10);
				{
				setState(171);
				isPositive_def();
				}
				break;
			case FUNC_POW:
				enterOuterAlt(_localctx, 11);
				{
				setState(172);
				power_def();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 12);
				{
				setState(173);
				result();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 13);
				{
				setState(174);
				while_def();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 14);
				{
				setState(175);
				dowhile_def();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 15);
				{
				setState(176);
				for_def();
				}
				break;
			case FUNC_ISEMPTY:
				enterOuterAlt(_localctx, 16);
				{
				setState(177);
				isEmpty_def();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 17);
				{
				setState(178);
				loop_def();
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
		enterRule(_localctx, 30, RULE_if_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IF);
			setState(182);
			match(L_PARENTHESIS);
			setState(183);
			expression(0);
			setState(184);
			match(R_PARENTHESIS);
			setState(185);
			block();
			setState(188);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(186);
				match(ELSE);
				setState(187);
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
			setState(190);
			param();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(191);
				match(COMMA);
				setState(192);
				param();
				}
				}
				setState(197);
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
			setState(198);
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
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(L_BRACE);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << FUNC_LEN) | (1L << FUNC_PRINT) | (1L << FUNC_PRINTLN) | (1L << FUNC_POW) | (1L << FUNC_ISPOSITIVE) | (1L << FUNC_ABS) | (1L << FUNC_UPPERCASE) | (1L << FUNC_LOWERCASE) | (1L << FUNC_NOD) | (1L << FUNC_ISEMPTY) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << LOOP) | (1L << DO))) != 0)) {
				{
				{
				setState(201);
				sentence();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
		enterRule(_localctx, 38, RULE_while_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(WHILE);
			setState(210);
			match(L_PARENTHESIS);
			setState(211);
			expression(0);
			setState(212);
			match(R_PARENTHESIS);
			setState(213);
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
		enterRule(_localctx, 40, RULE_dowhile_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(DO);
			setState(216);
			block();
			setState(217);
			match(WHILE);
			setState(218);
			match(L_PARENTHESIS);
			setState(219);
			expression(0);
			setState(220);
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
		enterRule(_localctx, 42, RULE_for_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(FOR);
			setState(223);
			match(L_PARENTHESIS);
			setState(224);
			expression(0);
			setState(225);
			match(DELIMITER);
			setState(226);
			expression(0);
			setState(227);
			match(DELIMITER);
			setState(228);
			expression(0);
			setState(229);
			match(R_PARENTHESIS);
			setState(230);
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
		enterRule(_localctx, 44, RULE_loop_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(LOOP);
			setState(233);
			match(L_PARENTHESIS);
			setState(234);
			expression(0);
			setState(235);
			match(R_PARENTHESIS);
			setState(236);
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
		public Id_declContext id_decl() {
			return getRuleContext(Id_declContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			data_type();
			setState(239);
			match(DEF_FUNC);
			setState(240);
			id_decl();
			setState(241);
			match(L_PARENTHESIS);
			setState(243);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				setState(242);
				params();
				}
			}

			setState(245);
			match(R_PARENTHESIS);
			setState(246);
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

	public static class Main_defContext extends ParserRuleContext {
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
			setState(248);
			match(FUNC_MAIN);
			setState(249);
			match(L_PARENTHESIS);
			setState(250);
			match(R_PARENTHESIS);
			setState(251);
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

	public static class Length_defContext extends ParserRuleContext {
		public TerminalNode FUNC_LEN() { return getToken(TucodeParser.FUNC_LEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
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
		enterRule(_localctx, 50, RULE_length_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(FUNC_LEN);
			setState(254);
			match(L_PARENTHESIS);
			setState(255);
			expression(0);
			setState(256);
			match(R_PARENTHESIS);
			setState(257);
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

	public static class Power_defContext extends ParserRuleContext {
		public TerminalNode FUNC_POW() { return getToken(TucodeParser.FUNC_POW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
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
		enterRule(_localctx, 52, RULE_power_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(FUNC_POW);
			setState(260);
			match(L_PARENTHESIS);
			setState(261);
			expression(0);
			setState(262);
			match(COMMA);
			setState(263);
			expression(0);
			setState(264);
			match(R_PARENTHESIS);
			setState(265);
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

	public static class Println_defContext extends ParserRuleContext {
		public TerminalNode FUNC_PRINTLN() { return getToken(TucodeParser.FUNC_PRINTLN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_println_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(FUNC_PRINTLN);
			setState(268);
			match(L_PARENTHESIS);
			setState(269);
			expression(0);
			setState(270);
			match(R_PARENTHESIS);
			setState(271);
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

	public static class Print_defContext extends ParserRuleContext {
		public TerminalNode FUNC_PRINT() { return getToken(TucodeParser.FUNC_PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
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
		enterRule(_localctx, 56, RULE_print_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(FUNC_PRINT);
			setState(274);
			match(L_PARENTHESIS);
			setState(275);
			expression(0);
			setState(276);
			match(R_PARENTHESIS);
			setState(277);
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

	public static class IsPositive_defContext extends ParserRuleContext {
		public TerminalNode FUNC_ISPOSITIVE() { return getToken(TucodeParser.FUNC_ISPOSITIVE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
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
		enterRule(_localctx, 58, RULE_isPositive_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(FUNC_ISPOSITIVE);
			setState(280);
			match(L_PARENTHESIS);
			setState(281);
			expression(0);
			setState(282);
			match(R_PARENTHESIS);
			setState(283);
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

	public static class Abs_defContext extends ParserRuleContext {
		public TerminalNode FUNC_ABS() { return getToken(TucodeParser.FUNC_ABS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
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
		enterRule(_localctx, 60, RULE_abs_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(FUNC_ABS);
			setState(286);
			match(L_PARENTHESIS);
			setState(287);
			expression(0);
			setState(288);
			match(R_PARENTHESIS);
			setState(289);
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

	public static class Uppercase_defContext extends ParserRuleContext {
		public TerminalNode FUNC_UPPERCASE() { return getToken(TucodeParser.FUNC_UPPERCASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
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
		enterRule(_localctx, 62, RULE_uppercase_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(FUNC_UPPERCASE);
			setState(292);
			match(L_PARENTHESIS);
			setState(293);
			expression(0);
			setState(294);
			match(R_PARENTHESIS);
			setState(295);
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

	public static class Lowercase_defContext extends ParserRuleContext {
		public TerminalNode FUNC_LOWERCASE() { return getToken(TucodeParser.FUNC_LOWERCASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
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
		enterRule(_localctx, 64, RULE_lowercase_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(FUNC_LOWERCASE);
			setState(298);
			match(L_PARENTHESIS);
			setState(299);
			expression(0);
			setState(300);
			match(R_PARENTHESIS);
			setState(301);
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

	public static class Nod_defContext extends ParserRuleContext {
		public TerminalNode FUNC_NOD() { return getToken(TucodeParser.FUNC_NOD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
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
		enterRule(_localctx, 66, RULE_nod_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(FUNC_NOD);
			setState(304);
			match(L_PARENTHESIS);
			setState(305);
			expression(0);
			setState(306);
			match(R_PARENTHESIS);
			setState(307);
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

	public static class IsEmpty_defContext extends ParserRuleContext {
		public TerminalNode FUNC_ISEMPTY() { return getToken(TucodeParser.FUNC_ISEMPTY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
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
		enterRule(_localctx, 68, RULE_isEmpty_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(FUNC_ISEMPTY);
			setState(310);
			match(L_PARENTHESIS);
			setState(311);
			expression(0);
			setState(312);
			match(R_PARENTHESIS);
			setState(313);
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

	public static class ToInt_defContext extends ParserRuleContext {
		public TerminalNode FUNC_TOINT() { return getToken(TucodeParser.FUNC_TOINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
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
		enterRule(_localctx, 70, RULE_toInt_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(FUNC_TOINT);
			setState(316);
			match(L_PARENTHESIS);
			setState(317);
			expression(0);
			setState(318);
			match(R_PARENTHESIS);
			setState(319);
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

	public static class IsDigit_defContext extends ParserRuleContext {
		public TerminalNode FUNC_ISDIGIT() { return getToken(TucodeParser.FUNC_ISDIGIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TucodeParser.DELIMITER, 0); }
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
		enterRule(_localctx, 72, RULE_isDigit_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(FUNC_ISDIGIT);
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
		enterRule(_localctx, 74, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u014c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2U\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2i\n\2\f\2\16\2l\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3t\n\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6~\n\6\3\6\3\6\5\6\u0082\n\6\3\7\3\7"+
		"\3\7\7\7\u0087\n\7\f\7\16\7\u008a\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\5\n\u0097\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b6\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00bf\n\21\3\22\3\22\3\22\7\22\u00c4\n\22\f\22\16\22\u00c7"+
		"\13\22\3\23\3\23\3\24\3\24\7\24\u00cd\n\24\f\24\16\24\u00d0\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u00f6\n\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\2\3\2(\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\6\3\2\22\23\4"+
		"\2\20\20\24\24\3\2\n\17\4\2\60\608;\u0149\2T\3\2\2\2\4s\3\2\2\2\6u\3\2"+
		"\2\2\bw\3\2\2\2\nz\3\2\2\2\f\u0083\3\2\2\2\16\u008b\3\2\2\2\20\u008d\3"+
		"\2\2\2\22\u0096\3\2\2\2\24\u0098\3\2\2\2\26\u009a\3\2\2\2\30\u009c\3\2"+
		"\2\2\32\u009e\3\2\2\2\34\u00a0\3\2\2\2\36\u00b5\3\2\2\2 \u00b7\3\2\2\2"+
		"\"\u00c0\3\2\2\2$\u00c8\3\2\2\2&\u00ca\3\2\2\2(\u00d3\3\2\2\2*\u00d9\3"+
		"\2\2\2,\u00e0\3\2\2\2.\u00ea\3\2\2\2\60\u00f0\3\2\2\2\62\u00fa\3\2\2\2"+
		"\64\u00ff\3\2\2\2\66\u0105\3\2\2\28\u010d\3\2\2\2:\u0113\3\2\2\2<\u0119"+
		"\3\2\2\2>\u011f\3\2\2\2@\u0125\3\2\2\2B\u012b\3\2\2\2D\u0131\3\2\2\2F"+
		"\u0137\3\2\2\2H\u013d\3\2\2\2J\u0143\3\2\2\2L\u0149\3\2\2\2NO\b\2\1\2"+
		"OP\7\20\2\2PU\5\2\2\nQR\7\7\2\2RU\5\2\2\5SU\5\4\3\2TN\3\2\2\2TQ\3\2\2"+
		"\2TS\3\2\2\2Uj\3\2\2\2VW\f\t\2\2WX\7\21\2\2Xi\5\2\2\tYZ\f\b\2\2Z[\t\2"+
		"\2\2[i\5\2\2\t\\]\f\7\2\2]^\t\3\2\2^i\5\2\2\b_`\f\6\2\2`a\t\4\2\2ai\5"+
		"\2\2\7bc\f\4\2\2cd\7\b\2\2di\5\2\2\5ef\f\3\2\2fg\7\t\2\2gi\5\2\2\4hV\3"+
		"\2\2\2hY\3\2\2\2h\\\3\2\2\2h_\3\2\2\2hb\3\2\2\2he\3\2\2\2il\3\2\2\2jh"+
		"\3\2\2\2jk\3\2\2\2k\3\3\2\2\2lj\3\2\2\2mn\7\26\2\2no\5\2\2\2op\7\27\2"+
		"\2pt\3\2\2\2qt\5\n\6\2rt\5\6\4\2sm\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\5\3\2"+
		"\2\2uv\t\5\2\2v\7\3\2\2\2wx\5\22\n\2xy\7\60\2\2y\t\3\2\2\2z{\7\60\2\2"+
		"{}\7\26\2\2|~\5\f\7\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0081\7\27"+
		"\2\2\u0080\u0082\7\34\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\13\3\2\2\2\u0083\u0088\5\16\b\2\u0084\u0085\7\35\2\2\u0085\u0087\5\16"+
		"\b\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\r\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\5\2\2\2"+
		"\u008c\17\3\2\2\2\u008d\u008e\5\b\5\2\u008e\u008f\7/\2\2\u008f\u0090\5"+
		"\2\2\2\u0090\u0091\7\34\2\2\u0091\21\3\2\2\2\u0092\u0097\5\24\13\2\u0093"+
		"\u0097\5\26\f\2\u0094\u0097\5\30\r\2\u0095\u0097\5\32\16\2\u0096\u0092"+
		"\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\23\3\2\2\2\u0098\u0099\7\3\2\2\u0099\25\3\2\2\2\u009a\u009b\7\4\2\2\u009b"+
		"\27\3\2\2\2\u009c\u009d\7\5\2\2\u009d\31\3\2\2\2\u009e\u009f\7\6\2\2\u009f"+
		"\33\3\2\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\5\2\2\2\u00a2\u00a3\7\34\2"+
		"\2\u00a3\35\3\2\2\2\u00a4\u00b6\5\20\t\2\u00a5\u00b6\5 \21\2\u00a6\u00b6"+
		"\5:\36\2\u00a7\u00b6\58\35\2\u00a8\u00b6\5\64\33\2\u00a9\u00b6\5D#\2\u00aa"+
		"\u00b6\5B\"\2\u00ab\u00b6\5@!\2\u00ac\u00b6\5> \2\u00ad\u00b6\5<\37\2"+
		"\u00ae\u00b6\5\66\34\2\u00af\u00b6\5\34\17\2\u00b0\u00b6\5(\25\2\u00b1"+
		"\u00b6\5*\26\2\u00b2\u00b6\5,\27\2\u00b3\u00b6\5F$\2\u00b4\u00b6\5.\30"+
		"\2\u00b5\u00a4\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5\u00a6\3\2\2\2\u00b5\u00a7"+
		"\3\2\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00aa\3\2\2\2\u00b5"+
		"\u00ab\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00ae\3\2"+
		"\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\37\3\2\2"+
		"\2\u00b7\u00b8\7-\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00ba\5\2\2\2\u00ba\u00bb"+
		"\7\27\2\2\u00bb\u00be\5&\24\2\u00bc\u00bd\7.\2\2\u00bd\u00bf\5&\24\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf!\3\2\2\2\u00c0\u00c5\5$\23\2"+
		"\u00c1\u00c2\7\35\2\2\u00c2\u00c4\5$\23\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6#\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\5\b\5\2\u00c9%\3\2\2\2\u00ca\u00ce\7\30\2\2"+
		"\u00cb\u00cd\5\36\20\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\7\31\2\2\u00d2\'\3\2\2\2\u00d3\u00d4\7\64\2\2\u00d4\u00d5\7\26"+
		"\2\2\u00d5\u00d6\5\2\2\2\u00d6\u00d7\7\27\2\2\u00d7\u00d8\5&\24\2\u00d8"+
		")\3\2\2\2\u00d9\u00da\7\67\2\2\u00da\u00db\5&\24\2\u00db\u00dc\7\64\2"+
		"\2\u00dc\u00dd\7\26\2\2\u00dd\u00de\5\2\2\2\u00de\u00df\7\27\2\2\u00df"+
		"+\3\2\2\2\u00e0\u00e1\7\65\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00e3\5\2\2"+
		"\2\u00e3\u00e4\7\34\2\2\u00e4\u00e5\5\2\2\2\u00e5\u00e6\7\34\2\2\u00e6"+
		"\u00e7\5\2\2\2\u00e7\u00e8\7\27\2\2\u00e8\u00e9\5&\24\2\u00e9-\3\2\2\2"+
		"\u00ea\u00eb\7\66\2\2\u00eb\u00ec\7\26\2\2\u00ec\u00ed\5\2\2\2\u00ed\u00ee"+
		"\7\27\2\2\u00ee\u00ef\5&\24\2\u00ef/\3\2\2\2\u00f0\u00f1\5\22\n\2\u00f1"+
		"\u00f2\7\36\2\2\u00f2\u00f3\5\b\5\2\u00f3\u00f5\7\26\2\2\u00f4\u00f6\5"+
		"\"\22\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\7\27\2\2\u00f8\u00f9\5&\24\2\u00f9\61\3\2\2\2\u00fa\u00fb\7\"\2"+
		"\2\u00fb\u00fc\7\26\2\2\u00fc\u00fd\7\27\2\2\u00fd\u00fe\5&\24\2\u00fe"+
		"\63\3\2\2\2\u00ff\u0100\7\37\2\2\u0100\u0101\7\26\2\2\u0101\u0102\5\2"+
		"\2\2\u0102\u0103\7\27\2\2\u0103\u0104\7\34\2\2\u0104\65\3\2\2\2\u0105"+
		"\u0106\7#\2\2\u0106\u0107\7\26\2\2\u0107\u0108\5\2\2\2\u0108\u0109\7\35"+
		"\2\2\u0109\u010a\5\2\2\2\u010a\u010b\7\27\2\2\u010b\u010c\7\34\2\2\u010c"+
		"\67\3\2\2\2\u010d\u010e\7!\2\2\u010e\u010f\7\26\2\2\u010f\u0110\5\2\2"+
		"\2\u0110\u0111\7\27\2\2\u0111\u0112\5&\24\2\u01129\3\2\2\2\u0113\u0114"+
		"\7 \2\2\u0114\u0115\7\26\2\2\u0115\u0116\5\2\2\2\u0116\u0117\7\27\2\2"+
		"\u0117\u0118\7\34\2\2\u0118;\3\2\2\2\u0119\u011a\7$\2\2\u011a\u011b\7"+
		"\26\2\2\u011b\u011c\5\2\2\2\u011c\u011d\7\27\2\2\u011d\u011e\7\34\2\2"+
		"\u011e=\3\2\2\2\u011f\u0120\7%\2\2\u0120\u0121\7\26\2\2\u0121\u0122\5"+
		"\2\2\2\u0122\u0123\7\27\2\2\u0123\u0124\7\34\2\2\u0124?\3\2\2\2\u0125"+
		"\u0126\7&\2\2\u0126\u0127\7\26\2\2\u0127\u0128\5\2\2\2\u0128\u0129\7\27"+
		"\2\2\u0129\u012a\7\34\2\2\u012aA\3\2\2\2\u012b\u012c\7\'\2\2\u012c\u012d"+
		"\7\26\2\2\u012d\u012e\5\2\2\2\u012e\u012f\7\27\2\2\u012f\u0130\7\34\2"+
		"\2\u0130C\3\2\2\2\u0131\u0132\7(\2\2\u0132\u0133\7\26\2\2\u0133\u0134"+
		"\5\2\2\2\u0134\u0135\7\27\2\2\u0135\u0136\7\34\2\2\u0136E\3\2\2\2\u0137"+
		"\u0138\7)\2\2\u0138\u0139\7\26\2\2\u0139\u013a\5\2\2\2\u013a\u013b\7\27"+
		"\2\2\u013b\u013c\7\34\2\2\u013cG\3\2\2\2\u013d\u013e\7*\2\2\u013e\u013f"+
		"\7\26\2\2\u013f\u0140\5\2\2\2\u0140\u0141\7\27\2\2\u0141\u0142\7\34\2"+
		"\2\u0142I\3\2\2\2\u0143\u0144\7+\2\2\u0144\u0145\7\26\2\2\u0145\u0146"+
		"\5\2\2\2\u0146\u0147\7\27\2\2\u0147\u0148\7\34\2\2\u0148K\3\2\2\2\u0149"+
		"\u014a\5\62\32\2\u014aM\3\2\2\2\17Thjs}\u0081\u0088\u0096\u00b5\u00be"+
		"\u00c5\u00ce\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}