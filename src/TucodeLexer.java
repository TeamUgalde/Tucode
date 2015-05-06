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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "OPERATOR_NOT", "OPERATOR_AND", "OPERATOR_OR", 
		"OPERATOR_EQU", "OPERATOR_DIFF", "OPERATOR_GRT", "OPERATOR_LOT", "OPERATOR_GRE", 
		"OPERATOR_LOE", "OPERATOR_NEG", "OPERATOR_POW", "OPERATOR_MULT", "OPERATOR_DIV", 
		"OPERATOR_ADD", "OPERATOR_SUB", "L_PARENTHESIS", "R_PARENTHESIS", "L_BRACE", 
		"R_BRACE", "L_BRACKET", "R_BRACKET", "DELIMITER", "COMMA", "DEF_FUNC", 
		"FUNC_LEN", "FUNC_PRINT", "FUNC_PRINTLN", "FUNC_MAIN", "FUNC_POW", "FUNC_ISPOSITIVE", 
		"FUNC_ABS", "FUNC_UPPERCASE", "FUNC_LOWERCASE", "FUNC_NOD", "FUNC_ISEMPTY", 
		"FUNC_TOINT", "FUNC_ISDIGIT", "RETURN", "IF", "ELSE", "OPERATOR_ASSIG", 
		"COMILLA", "ID", "INLINE_COMMENT", "WS", "MULTILINE_COMMENT", "WHILE", 
		"FOR", "LOOP", "DO", "CHARACTER", "STRING", "INTEGER", "BOOLEAN"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2;\u01d5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\5\60\u0163\n\60\3\60\5\60\u0166"+
		"\n\60\3\60\7\60\u0169\n\60\f\60\16\60\u016c\13\60\3\61\3\61\3\61\3\61"+
		"\7\61\u0172\n\61\f\61\16\61\u0175\13\61\3\61\3\61\3\61\3\61\3\62\6\62"+
		"\u017c\n\62\r\62\16\62\u017d\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0186"+
		"\n\63\f\63\16\63\u0189\13\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\39\3"+
		"9\79\u01b2\n9\f9\169\u01b5\139\39\39\3:\3:\5:\u01bb\n:\3:\3:\7:\u01bf"+
		"\n:\f:\16:\u01c2\13:\5:\u01c4\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\5;\u01d4\n;\5\u0173\u0187\u01b3\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\2_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;\3\2\7\4\2C\\c|\6\2\13"+
		"\f\17\17\"\"))\3\2\62\62\3\2\63;\3\2\62;\u01dd\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\3w\3\2\2\2\5~\3\2\2\2\7\u0086\3\2\2\2\t\u008f\3\2\2\2\13\u0095"+
		"\3\2\2\2\r\u0097\3\2\2\2\17\u0099\3\2\2\2\21\u009b\3\2\2\2\23\u009e\3"+
		"\2\2\2\25\u00a1\3\2\2\2\27\u00a3\3\2\2\2\31\u00a5\3\2\2\2\33\u00a8\3\2"+
		"\2\2\35\u00ab\3\2\2\2\37\u00ad\3\2\2\2!\u00af\3\2\2\2#\u00b1\3\2\2\2%"+
		"\u00b3\3\2\2\2\'\u00b5\3\2\2\2)\u00b7\3\2\2\2+\u00b9\3\2\2\2-\u00bb\3"+
		"\2\2\2/\u00bd\3\2\2\2\61\u00bf\3\2\2\2\63\u00c1\3\2\2\2\65\u00c3\3\2\2"+
		"\2\67\u00c5\3\2\2\29\u00c7\3\2\2\2;\u00cf\3\2\2\2=\u00d5\3\2\2\2?\u00de"+
		"\3\2\2\2A\u00e9\3\2\2\2C\u00f2\3\2\2\2E\u00fb\3\2\2\2G\u0106\3\2\2\2I"+
		"\u010f\3\2\2\2K\u0119\3\2\2\2M\u0123\3\2\2\2O\u0133\3\2\2\2Q\u013b\3\2"+
		"\2\2S\u0143\3\2\2\2U\u014c\3\2\2\2W\u0155\3\2\2\2Y\u0158\3\2\2\2[\u015d"+
		"\3\2\2\2]\u015f\3\2\2\2_\u0162\3\2\2\2a\u016d\3\2\2\2c\u017b\3\2\2\2e"+
		"\u0181\3\2\2\2g\u018f\3\2\2\2i\u0198\3\2\2\2k\u019d\3\2\2\2m\u01a5\3\2"+
		"\2\2o\u01ab\3\2\2\2q\u01af\3\2\2\2s\u01c3\3\2\2\2u\u01d3\3\2\2\2wx\7p"+
		"\2\2xy\7w\2\2yz\7o\2\2z{\7g\2\2{|\7t\2\2|}\7q\2\2}\4\3\2\2\2~\177\7u\2"+
		"\2\177\u0080\7k\2\2\u0080\u0081\7o\2\2\u0081\u0082\7d\2\2\u0082\u0083"+
		"\7q\2\2\u0083\u0084\7n\2\2\u0084\u0085\7q\2\2\u0085\6\3\2\2\2\u0086\u0087"+
		"\7d\2\2\u0087\u0088\7q\2\2\u0088\u0089\7q\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7c\2\2\u008c\u008d\7p\2\2\u008d\u008e\7q\2\2"+
		"\u008e\b\3\2\2\2\u008f\u0090\7v\2\2\u0090\u0091\7g\2\2\u0091\u0092\7z"+
		"\2\2\u0092\u0093\7v\2\2\u0093\u0094\7q\2\2\u0094\n\3\2\2\2\u0095\u0096"+
		"\7#\2\2\u0096\f\3\2\2\2\u0097\u0098\7{\2\2\u0098\16\3\2\2\2\u0099\u009a"+
		"\7q\2\2\u009a\20\3\2\2\2\u009b\u009c\7?\2\2\u009c\u009d\7?\2\2\u009d\22"+
		"\3\2\2\2\u009e\u009f\7#\2\2\u009f\u00a0\7?\2\2\u00a0\24\3\2\2\2\u00a1"+
		"\u00a2\7@\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\30\3\2\2\2\u00a5"+
		"\u00a6\7>\2\2\u00a6\u00a7\7?\2\2\u00a7\32\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9"+
		"\u00aa\7?\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\36\3\2\2\2\u00ad"+
		"\u00ae\7`\2\2\u00ae \3\2\2\2\u00af\u00b0\7,\2\2\u00b0\"\3\2\2\2\u00b1"+
		"\u00b2\7\61\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4&\3\2\2\2\u00b5"+
		"\u00b6\7/\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8*\3\2\2\2\u00b9\u00ba"+
		"\7+\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7}\2\2\u00bc.\3\2\2\2\u00bd\u00be\7"+
		"\177\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7]\2\2\u00c0\62\3\2\2\2\u00c1\u00c2"+
		"\7_\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7=\2\2\u00c4\66\3\2\2\2\u00c5\u00c6"+
		"\7.\2\2\u00c68\3\2\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7t\2\2\u00ce:\3\2\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7c\2\2\u00d1"+
		"\u00d2\7t\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4\7q\2\2\u00d4<\3\2\2\2\u00d5"+
		"\u00d6\7k\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9\7t\2\2"+
		"\u00d9\u00da\7k\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd>\3\2\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1"+
		"\7r\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7o\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7p\2\2"+
		"\u00e8@\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7o\2"+
		"\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0"+
		"\7|\2\2\u00f0\u00f1\7q\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4"+
		"\7q\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7p\2\2\u00f7"+
		"\u00f8\7e\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7c\2\2\u00faD\3\2\2\2\u00fb"+
		"\u00fc\7g\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7R\2\2\u00fe\u00ff\7q\2\2"+
		"\u00ff\u0100\7u\2\2\u0100\u0101\7k\2\2\u0101\u0102\7v\2\2\u0102\u0103"+
		"\7k\2\2\u0103\u0104\7x\2\2\u0104\u0105\7q\2\2\u0105F\3\2\2\2\u0106\u0107"+
		"\7c\2\2\u0107\u0108\7d\2\2\u0108\u0109\7u\2\2\u0109\u010a\7q\2\2\u010a"+
		"\u010b\7n\2\2\u010b\u010c\7w\2\2\u010c\u010d\7v\2\2\u010d\u010e\7q\2\2"+
		"\u010eH\3\2\2\2\u010f\u0110\7o\2\2\u0110\u0111\7c\2\2\u0111\u0112\7{\2"+
		"\2\u0112\u0113\7w\2\2\u0113\u0114\7u\2\2\u0114\u0115\7e\2\2\u0115\u0116"+
		"\7w\2\2\u0116\u0117\7n\2\2\u0117\u0118\7c\2\2\u0118J\3\2\2\2\u0119\u011a"+
		"\7o\2\2\u011a\u011b\7k\2\2\u011b\u011c\7p\2\2\u011c\u011d\7w\2\2\u011d"+
		"\u011e\7u\2\2\u011e\u011f\7e\2\2\u011f\u0120\7w\2\2\u0120\u0121\7n\2\2"+
		"\u0121\u0122\7c\2\2\u0122L\3\2\2\2\u0123\u0124\7e\2\2\u0124\u0125\7c\2"+
		"\2\u0125\u0126\7p\2\2\u0126\u0127\7v\2\2\u0127\u0128\7k\2\2\u0128\u0129"+
		"\7f\2\2\u0129\u012a\7c\2\2\u012a\u012b\7f\2\2\u012b\u012c\7F\2\2\u012c"+
		"\u012d\7k\2\2\u012d\u012e\7i\2\2\u012e\u012f\7k\2\2\u012f\u0130\7v\2\2"+
		"\u0130\u0131\7q\2\2\u0131\u0132\7u\2\2\u0132N\3\2\2\2\u0133\u0134\7g\2"+
		"\2\u0134\u0135\7u\2\2\u0135\u0136\7X\2\2\u0136\u0137\7c\2\2\u0137\u0138"+
		"\7e\2\2\u0138\u0139\7k\2\2\u0139\u013a\7q\2\2\u013aP\3\2\2\2\u013b\u013c"+
		"\7c\2\2\u013c\u013d\7G\2\2\u013d\u013e\7p\2\2\u013e\u013f\7v\2\2\u013f"+
		"\u0140\7g\2\2\u0140\u0141\7t\2\2\u0141\u0142\7q\2\2\u0142R\3\2\2\2\u0143"+
		"\u0144\7g\2\2\u0144\u0145\7u\2\2\u0145\u0146\7F\2\2\u0146\u0147\7k\2\2"+
		"\u0147\u0148\7i\2\2\u0148\u0149\7k\2\2\u0149\u014a\7v\2\2\u014a\u014b"+
		"\7q\2\2\u014bT\3\2\2\2\u014c\u014d\7f\2\2\u014d\u014e\7g\2\2\u014e\u014f"+
		"\7x\2\2\u014f\u0150\7q\2\2\u0150\u0151\7n\2\2\u0151\u0152\7x\2\2\u0152"+
		"\u0153\7g\2\2\u0153\u0154\7t\2\2\u0154V\3\2\2\2\u0155\u0156\7u\2\2\u0156"+
		"\u0157\7k\2\2\u0157X\3\2\2\2\u0158\u0159\7u\2\2\u0159\u015a\7k\2\2\u015a"+
		"\u015b\7p\2\2\u015b\u015c\7q\2\2\u015cZ\3\2\2\2\u015d\u015e\7?\2\2\u015e"+
		"\\\3\2\2\2\u015f\u0160\7)\2\2\u0160^\3\2\2\2\u0161\u0163\t\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0166\7a\2\2\u0165\u0164\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u016a\3\2\2\2\u0167\u0169\t\2\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b`\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7(\2\2\u016e\u016f"+
		"\7(\2\2\u016f\u0173\3\2\2\2\u0170\u0172\13\2\2\2\u0171\u0170\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0176\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7\f\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\b\61\2\2\u0179b\3\2\2\2\u017a\u017c\t\3\2\2\u017b\u017a\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0180\b\62\2\2\u0180d\3\2\2\2\u0181\u0182\7(\2\2\u0182"+
		"\u0183\7/\2\2\u0183\u0187\3\2\2\2\u0184\u0186\13\2\2\2\u0185\u0184\3\2"+
		"\2\2\u0186\u0189\3\2\2\2\u0187\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188"+
		"\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7/\2\2\u018b\u018c\7(\2"+
		"\2\u018c\u018d\3\2\2\2\u018d\u018e\b\63\2\2\u018ef\3\2\2\2\u018f\u0190"+
		"\7o\2\2\u0190\u0191\7k\2\2\u0191\u0192\7g\2\2\u0192\u0193\7p\2\2\u0193"+
		"\u0194\7v\2\2\u0194\u0195\7t\2\2\u0195\u0196\7c\2\2\u0196\u0197\7u\2\2"+
		"\u0197h\3\2\2\2\u0198\u0199\7r\2\2\u0199\u019a\7c\2\2\u019a\u019b\7t\2"+
		"\2\u019b\u019c\7c\2\2\u019cj\3\2\2\2\u019d\u019e\7t\2\2\u019e\u019f\7"+
		"g\2\2\u019f\u01a0\7r\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2\7v\2\2\u01a2\u01a3"+
		"\7k\2\2\u01a3\u01a4\7t\2\2\u01a4l\3\2\2\2\u01a5\u01a6\7j\2\2\u01a6\u01a7"+
		"\7c\2\2\u01a7\u01a8\7e\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7t\2\2\u01aa"+
		"n\3\2\2\2\u01ab\u01ac\7)\2\2\u01ac\u01ad\13\2\2\2\u01ad\u01ae\7)\2\2\u01ae"+
		"p\3\2\2\2\u01af\u01b3\7$\2\2\u01b0\u01b2\13\2\2\2\u01b1\u01b0\3\2\2\2"+
		"\u01b2\u01b5\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b6"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\7$\2\2\u01b7r\3\2\2\2\u01b8\u01c4"+
		"\t\4\2\2\u01b9\u01bb\5\35\17\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2"+
		"\u01bb\u01bc\3\2\2\2\u01bc\u01c0\t\5\2\2\u01bd\u01bf\t\6\2\2\u01be\u01bd"+
		"\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01b8\3\2\2\2\u01c3\u01ba\3\2"+
		"\2\2\u01c4t\3\2\2\2\u01c5\u01c6\7x\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8"+
		"\7t\2\2\u01c8\u01c9\7f\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7f\2\2\u01cb"+
		"\u01cc\7g\2\2\u01cc\u01cd\7t\2\2\u01cd\u01d4\7q\2\2\u01ce\u01cf\7h\2\2"+
		"\u01cf\u01d0\7c\2\2\u01d0\u01d1\7n\2\2\u01d1\u01d2\7u\2\2\u01d2\u01d4"+
		"\7q\2\2\u01d3\u01c5\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d4v\3\2\2\2\17\2\u0162"+
		"\u0165\u0168\u016a\u0173\u017d\u0187\u01b3\u01ba\u01c0\u01c3\u01d3\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}