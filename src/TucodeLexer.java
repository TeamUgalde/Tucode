// Generated from Tucode.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TucodeLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "OPERATOR_NOT", "OPERATOR_AND", 
		"OPERATOR_OR", "OPERATOR_EQU", "OPERATOR_DIFF", "OPERATOR_GRT", "OPERATOR_LOT", 
		"OPERATOR_GRE", "OPERATOR_LOE", "OPERATOR_NEG", "OPERATOR_MULT", "OPERATOR_DIV", 
		"OPERATOR_ADD", "OPERATOR_SUB", "L_PARENTHESIS", "R_PARENTHESIS", "L_BRACE", 
		"R_BRACE", "DELIMITER", "COMMA", "DEF_FUNC", "FUNC_LEN", "FUNC_PRINT", 
		"FUNC_PRINTLN", "FUNC_MAIN", "FUNC_POW", "FUNC_ISPOSITIVE", "FUNC_ABS", 
		"FUNC_UPPERCASE", "FUNC_LOWERCASE", "FUNC_NOD", "FUNC_ISEMPTY", "FUNC_TOINT", 
		"FUNC_ISDIGIT", "RETURN", "IF", "ELSE", "OPERATOR_ASSIG", "COMILLA", "INLINE_COMMENT", 
		"WS", "MULTILINE_COMMENT", "WHILE", "FOR", "LOOP", "DO", "ID", "CHARACTER", 
		"STRING", "INTEGER", "BOOLEAN"
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


	public TucodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tucode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\29\u01cf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3.\3.\7.\u0165\n.\f.\16.\u0168\13.\3.\3.\3.\3.\3/\6/\u016f\n"+
		"/\r/\16/\u0170\3/\3/\3\60\3\60\3\60\3\60\7\60\u0179\n\60\f\60\16\60\u017c"+
		"\13\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\7\65\u01a1\n\65\f\65\16\65\u01a4"+
		"\13\65\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u01ac\n\67\f\67\16\67\u01af"+
		"\13\67\3\67\3\67\38\38\58\u01b5\n8\38\38\78\u01b9\n8\f8\168\u01bc\138"+
		"\58\u01be\n8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u01ce\n9\5\u0166"+
		"\u017a\u01ad\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[.]/_\60a\61c\62e\63"+
		"g\64i\65k\66m\67o8q9\3\2\b\6\2\13\13\17\17\"\"))\5\2C\\aac|\6\2\62;C\\"+
		"aac|\3\2\62\62\3\2\63;\3\2\62;\u01d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5z\3\2\2\2"+
		"\7\u0082\3\2\2\2\t\u008b\3\2\2\2\13\u0091\3\2\2\2\r\u0093\3\2\2\2\17\u0095"+
		"\3\2\2\2\21\u0097\3\2\2\2\23\u0099\3\2\2\2\25\u009c\3\2\2\2\27\u009f\3"+
		"\2\2\2\31\u00a1\3\2\2\2\33\u00a3\3\2\2\2\35\u00a6\3\2\2\2\37\u00a9\3\2"+
		"\2\2!\u00ab\3\2\2\2#\u00ad\3\2\2\2%\u00af\3\2\2\2\'\u00b1\3\2\2\2)\u00b3"+
		"\3\2\2\2+\u00b5\3\2\2\2-\u00b7\3\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2"+
		"\63\u00bd\3\2\2\2\65\u00bf\3\2\2\2\67\u00c7\3\2\2\29\u00cd\3\2\2\2;\u00d6"+
		"\3\2\2\2=\u00e1\3\2\2\2?\u00f1\3\2\2\2A\u00fa\3\2\2\2C\u0105\3\2\2\2E"+
		"\u010e\3\2\2\2G\u0118\3\2\2\2I\u0122\3\2\2\2K\u0132\3\2\2\2M\u013a\3\2"+
		"\2\2O\u0142\3\2\2\2Q\u014b\3\2\2\2S\u0154\3\2\2\2U\u0157\3\2\2\2W\u015c"+
		"\3\2\2\2Y\u015e\3\2\2\2[\u0160\3\2\2\2]\u016e\3\2\2\2_\u0174\3\2\2\2a"+
		"\u0182\3\2\2\2c\u018b\3\2\2\2e\u0190\3\2\2\2g\u0198\3\2\2\2i\u019e\3\2"+
		"\2\2k\u01a5\3\2\2\2m\u01a9\3\2\2\2o\u01bd\3\2\2\2q\u01cd\3\2\2\2st\7p"+
		"\2\2tu\7w\2\2uv\7o\2\2vw\7g\2\2wx\7t\2\2xy\7q\2\2y\4\3\2\2\2z{\7u\2\2"+
		"{|\7k\2\2|}\7o\2\2}~\7d\2\2~\177\7q\2\2\177\u0080\7n\2\2\u0080\u0081\7"+
		"q\2\2\u0081\6\3\2\2\2\u0082\u0083\7d\2\2\u0083\u0084\7q\2\2\u0084\u0085"+
		"\7q\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7q\2\2\u008a\b\3\2\2\2\u008b\u008c\7v\2\2\u008c"+
		"\u008d\7g\2\2\u008d\u008e\7z\2\2\u008e\u008f\7v\2\2\u008f\u0090\7q\2\2"+
		"\u0090\n\3\2\2\2\u0091\u0092\7=\2\2\u0092\f\3\2\2\2\u0093\u0094\7#\2\2"+
		"\u0094\16\3\2\2\2\u0095\u0096\7{\2\2\u0096\20\3\2\2\2\u0097\u0098\7q\2"+
		"\2\u0098\22\3\2\2\2\u0099\u009a\7?\2\2\u009a\u009b\7?\2\2\u009b\24\3\2"+
		"\2\2\u009c\u009d\7#\2\2\u009d\u009e\7?\2\2\u009e\26\3\2\2\2\u009f\u00a0"+
		"\7@\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\32\3\2\2\2\u00a3\u00a4"+
		"\7>\2\2\u00a4\u00a5\7?\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8\36\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa \3\2\2\2\u00ab\u00ac"+
		"\7,\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae$\3\2\2\2\u00af\u00b0"+
		"\7-\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7"+
		"*\2\2\u00b4*\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7}"+
		"\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7\177\2\2\u00ba\60\3\2\2\2\u00bb\u00bc"+
		"\7\f\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7.\2\2\u00be\64\3\2\2\2\u00bf\u00c0"+
		"\7f\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7p\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7t\2\2\u00c6\66\3\2\2\2\u00c7"+
		"\u00c8\7n\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7i\2\2"+
		"\u00cb\u00cc\7q\2\2\u00cc8\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7o\2"+
		"\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3"+
		"\7o\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7t\2\2\u00d5:\3\2\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7o\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7k\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7t\2\2"+
		"\u00de\u00df\7n\2\2\u00df\u00e0\7p\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7p\2"+
		"\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6"+
		"\7t\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7e\2\2\u00e9"+
		"\u00ea\7q\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7g\2\2"+
		"\u00ed\u00ee\7p\2\2\u00ee\u00ef\7|\2\2\u00ef\u00f0\7q\2\2\u00f0>\3\2\2"+
		"\2\u00f1\u00f2\7r\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5"+
		"\7g\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7k\2\2\u00f8"+
		"\u00f9\7c\2\2\u00f9@\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7u\2\2\u00fc"+
		"\u00fd\7R\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7k\2\2"+
		"\u0100\u0101\7v\2\2\u0101\u0102\7k\2\2\u0102\u0103\7x\2\2\u0103\u0104"+
		"\7q\2\2\u0104B\3\2\2\2\u0105\u0106\7c\2\2\u0106\u0107\7d\2\2\u0107\u0108"+
		"\7u\2\2\u0108\u0109\7q\2\2\u0109\u010a\7n\2\2\u010a\u010b\7w\2\2\u010b"+
		"\u010c\7v\2\2\u010c\u010d\7q\2\2\u010dD\3\2\2\2\u010e\u010f\7o\2\2\u010f"+
		"\u0110\7c\2\2\u0110\u0111\7{\2\2\u0111\u0112\7w\2\2\u0112\u0113\7u\2\2"+
		"\u0113\u0114\7e\2\2\u0114\u0115\7w\2\2\u0115\u0116\7n\2\2\u0116\u0117"+
		"\7c\2\2\u0117F\3\2\2\2\u0118\u0119\7o\2\2\u0119\u011a\7k\2\2\u011a\u011b"+
		"\7p\2\2\u011b\u011c\7w\2\2\u011c\u011d\7u\2\2\u011d\u011e\7e\2\2\u011e"+
		"\u011f\7w\2\2\u011f\u0120\7n\2\2\u0120\u0121\7c\2\2\u0121H\3\2\2\2\u0122"+
		"\u0123\7e\2\2\u0123\u0124\7c\2\2\u0124\u0125\7p\2\2\u0125\u0126\7v\2\2"+
		"\u0126\u0127\7k\2\2\u0127\u0128\7f\2\2\u0128\u0129\7c\2\2\u0129\u012a"+
		"\7f\2\2\u012a\u012b\7F\2\2\u012b\u012c\7k\2\2\u012c\u012d\7i\2\2\u012d"+
		"\u012e\7k\2\2\u012e\u012f\7v\2\2\u012f\u0130\7q\2\2\u0130\u0131\7u\2\2"+
		"\u0131J\3\2\2\2\u0132\u0133\7g\2\2\u0133\u0134\7u\2\2\u0134\u0135\7X\2"+
		"\2\u0135\u0136\7c\2\2\u0136\u0137\7e\2\2\u0137\u0138\7k\2\2\u0138\u0139"+
		"\7q\2\2\u0139L\3\2\2\2\u013a\u013b\7c\2\2\u013b\u013c\7G\2\2\u013c\u013d"+
		"\7p\2\2\u013d\u013e\7v\2\2\u013e\u013f\7g\2\2\u013f\u0140\7t\2\2\u0140"+
		"\u0141\7q\2\2\u0141N\3\2\2\2\u0142\u0143\7g\2\2\u0143\u0144\7u\2\2\u0144"+
		"\u0145\7F\2\2\u0145\u0146\7k\2\2\u0146\u0147\7i\2\2\u0147\u0148\7k\2\2"+
		"\u0148\u0149\7v\2\2\u0149\u014a\7q\2\2\u014aP\3\2\2\2\u014b\u014c\7f\2"+
		"\2\u014c\u014d\7g\2\2\u014d\u014e\7x\2\2\u014e\u014f\7q\2\2\u014f\u0150"+
		"\7n\2\2\u0150\u0151\7x\2\2\u0151\u0152\7g\2\2\u0152\u0153\7t\2\2\u0153"+
		"R\3\2\2\2\u0154\u0155\7u\2\2\u0155\u0156\7k\2\2\u0156T\3\2\2\2\u0157\u0158"+
		"\7u\2\2\u0158\u0159\7k\2\2\u0159\u015a\7p\2\2\u015a\u015b\7q\2\2\u015b"+
		"V\3\2\2\2\u015c\u015d\7?\2\2\u015dX\3\2\2\2\u015e\u015f\7)\2\2\u015fZ"+
		"\3\2\2\2\u0160\u0161\7(\2\2\u0161\u0162\7(\2\2\u0162\u0166\3\2\2\2\u0163"+
		"\u0165\13\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016a\7\f\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b.\2\2\u016c\\\3\2\2\2"+
		"\u016d\u016f\t\2\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b/\2\2\u0173"+
		"^\3\2\2\2\u0174\u0175\7(\2\2\u0175\u0176\7/\2\2\u0176\u017a\3\2\2\2\u0177"+
		"\u0179\13\2\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u017b\3"+
		"\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d"+
		"\u017e\7/\2\2\u017e\u017f\7(\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b\60"+
		"\2\2\u0181`\3\2\2\2\u0182\u0183\7o\2\2\u0183\u0184\7k\2\2\u0184\u0185"+
		"\7g\2\2\u0185\u0186\7p\2\2\u0186\u0187\7v\2\2\u0187\u0188\7t\2\2\u0188"+
		"\u0189\7c\2\2\u0189\u018a\7u\2\2\u018ab\3\2\2\2\u018b\u018c\7r\2\2\u018c"+
		"\u018d\7c\2\2\u018d\u018e\7t\2\2\u018e\u018f\7c\2\2\u018fd\3\2\2\2\u0190"+
		"\u0191\7t\2\2\u0191\u0192\7g\2\2\u0192\u0193\7r\2\2\u0193\u0194\7g\2\2"+
		"\u0194\u0195\7v\2\2\u0195\u0196\7k\2\2\u0196\u0197\7t\2\2\u0197f\3\2\2"+
		"\2\u0198\u0199\7j\2\2\u0199\u019a\7c\2\2\u019a\u019b\7e\2\2\u019b\u019c"+
		"\7g\2\2\u019c\u019d\7t\2\2\u019dh\3\2\2\2\u019e\u01a2\t\3\2\2\u019f\u01a1"+
		"\t\4\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3j\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7)\2\2\u01a6"+
		"\u01a7\13\2\2\2\u01a7\u01a8\7)\2\2\u01a8l\3\2\2\2\u01a9\u01ad\7$\2\2\u01aa"+
		"\u01ac\13\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ae\3"+
		"\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b1\7$\2\2\u01b1n\3\2\2\2\u01b2\u01be\t\5\2\2\u01b3\u01b5\5\37\20\2"+
		"\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01ba"+
		"\t\6\2\2\u01b7\u01b9\t\7\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bd\u01b2\3\2\2\2\u01bd\u01b4\3\2\2\2\u01bep\3\2\2\2\u01bf\u01c0"+
		"\7x\2\2\u01c0\u01c1\7g\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3\7f\2\2\u01c3"+
		"\u01c4\7c\2\2\u01c4\u01c5\7f\2\2\u01c5\u01c6\7g\2\2\u01c6\u01c7\7t\2\2"+
		"\u01c7\u01ce\7q\2\2\u01c8\u01c9\7h\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb"+
		"\7n\2\2\u01cb\u01cc\7u\2\2\u01cc\u01ce\7q\2\2\u01cd\u01bf\3\2\2\2\u01cd"+
		"\u01c8\3\2\2\2\u01cer\3\2\2\2\r\2\u0166\u0170\u017a\u01a0\u01a2\u01ad"+
		"\u01b4\u01ba\u01bd\u01cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}