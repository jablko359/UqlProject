// Generated from D:/szko³a/4rok/Kompilator/UqlProject/ANTLR\Uql.g4 by ANTLR 4.5.1

    package gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, LOGIC=5, STRINGKEYWORD=6, NUMERICKEYWORD=7, 
		NUMERICOPERATOR=8, STRINGOPERATOR=9, RETURN=10, SORT=11, SORTDIRECTION=12, 
		ARRAYOPERATOR=13, ALLSELECTOR=14, ENDTOKEN=15, EQUALS=16, LEFTBRACKET=17, 
		RIGHTBRACKET=18, NUMBER=19, STRING=20, NEWLINE=21, WS=22, UNKNOWN=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "LOGIC", "STRINGKEYWORD", "NUMERICKEYWORD", 
		"NUMERICOPERATOR", "STRINGOPERATOR", "RETURN", "SORT", "SORTDIRECTION", 
		"ARRAYOPERATOR", "ALLSELECTOR", "ENDTOKEN", "EQUALS", "LEFTBRACKET", "RIGHTBRACKET", 
		"NUMBER", "STRING", "NEWLINE", "WS", "UNKNOWN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'['", "']'", "'by'", null, null, null, null, null, null, 
		null, null, null, "'*'", "';'", "'='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "LOGIC", "STRINGKEYWORD", "NUMERICKEYWORD", 
		"NUMERICOPERATOR", "STRINGOPERATOR", "RETURN", "SORT", "SORTDIRECTION", 
		"ARRAYOPERATOR", "ALLSELECTOR", "ENDTOKEN", "EQUALS", "LEFTBRACKET", "RIGHTBRACKET", 
		"NUMBER", "STRING", "NEWLINE", "WS", "UNKNOWN"
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


	    int count = 0;

	    public int getCount(){
	        return count;
	    }


	public UqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Uql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4:
			LOGIC_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LOGIC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			count++;
			break;
		case 1:
			count++;
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0109\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6D\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0089\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b0\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00ba\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\7\24\u00c9\n\24\f\24\16\24\u00cc\13\24\5\24"+
		"\u00ce\n\24\3\24\3\24\6\24\u00d2\n\24\r\24\16\24\u00d3\3\24\3\24\7\24"+
		"\u00d8\n\24\f\24\16\24\u00db\13\24\3\24\3\24\7\24\u00df\n\24\f\24\16\24"+
		"\u00e2\13\24\5\24\u00e4\n\24\5\24\u00e6\n\24\3\25\3\25\3\25\3\25\6\25"+
		"\u00ec\n\25\r\25\16\25\u00ed\3\25\3\25\3\26\3\26\3\26\5\26\u00f5\n\26"+
		"\3\27\6\27\u00f8\n\27\r\27\16\27\u00f9\3\27\3\27\3\30\6\30\u00ff\n\30"+
		"\r\30\16\30\u0100\3\30\6\30\u0104\n\30\r\30\16\30\u0105\5\30\u0108\n\30"+
		"\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\13\4\2>>@@\3\2\62\62"+
		"\4\2\60\60^^\3\2\62;\3\2\63;\3\2))\4\2\13\13\"\"\4\2C\\c|\5\2))C\\c|\u0124"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\13C\3\2\2\2\rg"+
		"\3\2\2\2\17q\3\2\2\2\21z\3\2\2\2\23\u0088\3\2\2\2\25\u008a\3\2\2\2\27"+
		"\u0094\3\2\2\2\31\u00af\3\2\2\2\33\u00b9\3\2\2\2\35\u00bb\3\2\2\2\37\u00bd"+
		"\3\2\2\2!\u00bf\3\2\2\2#\u00c1\3\2\2\2%\u00c3\3\2\2\2\'\u00e5\3\2\2\2"+
		")\u00e7\3\2\2\2+\u00f4\3\2\2\2-\u00f7\3\2\2\2/\u0107\3\2\2\2\61\62\7."+
		"\2\2\62\4\3\2\2\2\63\64\7]\2\2\64\6\3\2\2\2\65\66\7_\2\2\66\b\3\2\2\2"+
		"\678\7d\2\289\7{\2\29\n\3\2\2\2:;\7c\2\2;<\7p\2\2<=\7f\2\2=>\3\2\2\2>"+
		"D\b\6\2\2?@\7q\2\2@A\7t\2\2AB\3\2\2\2BD\b\6\3\2C:\3\2\2\2C?\3\2\2\2D\f"+
		"\3\2\2\2EF\7V\2\2FG\7t\2\2GH\7c\2\2HI\7e\2\2Ih\7m\2\2JK\7I\2\2KL\7g\2"+
		"\2LM\7p\2\2MN\7t\2\2Nh\7g\2\2OP\7O\2\2PQ\7g\2\2QR\7f\2\2RS\7k\2\2Sh\7"+
		"c\2\2TU\7C\2\2UV\7n\2\2VW\7d\2\2WX\7w\2\2Xh\7o\2\2YZ\7C\2\2Z[\7t\2\2["+
		"\\\7v\2\2\\]\7k\2\2]^\7u\2\2^h\7v\2\2_`\7E\2\2`a\7q\2\2ab\7o\2\2bc\7r"+
		"\2\2cd\7q\2\2de\7u\2\2ef\7g\2\2fh\7t\2\2gE\3\2\2\2gJ\3\2\2\2gO\3\2\2\2"+
		"gT\3\2\2\2gY\3\2\2\2g_\3\2\2\2h\16\3\2\2\2ij\7V\2\2jk\7k\2\2kl\7o\2\2"+
		"lr\7g\2\2mn\7U\2\2no\7k\2\2op\7|\2\2pr\7g\2\2qi\3\2\2\2qm\3\2\2\2r\20"+
		"\3\2\2\2st\7>\2\2t{\7@\2\2uv\7@\2\2v{\7?\2\2wx\7>\2\2x{\7?\2\2y{\t\2\2"+
		"\2zs\3\2\2\2zu\3\2\2\2zw\3\2\2\2zy\3\2\2\2{\22\3\2\2\2|}\7n\2\2}~\7k\2"+
		"\2~\177\7m\2\2\177\u0089\7g\2\2\u0080\u0081\7p\2\2\u0081\u0082\7q\2\2"+
		"\u0082\u0083\7v\2\2\u0083\u0084\7\"\2\2\u0084\u0085\7n\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7m\2\2\u0087\u0089\7g\2\2\u0088|\3\2\2\2\u0088\u0080"+
		"\3\2\2\2\u0089\24\3\2\2\2\u008a\u008b\5-\27\2\u008b\u008c\7t\2\2\u008c"+
		"\u008d\7g\2\2\u008d\u008e\7v\2\2\u008e\u008f\7w\2\2\u008f\u0090\7t\2\2"+
		"\u0090\u0091\7p\2\2\u0091\u0092\3\2\2\2\u0092\u0093\5-\27\2\u0093\26\3"+
		"\2\2\2\u0094\u0095\5-\27\2\u0095\u0096\7u\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7v\2\2\u0099\u009a\3\2\2\2\u009a\u009b\5-\27"+
		"\2\u009b\30\3\2\2\2\u009c\u009d\7c\2\2\u009d\u009e\7u\2\2\u009e\u009f"+
		"\7e\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7f\2\2\u00a2"+
		"\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00b0\7i\2\2\u00a5\u00a6\7f\2\2"+
		"\u00a6\u00a7\7g\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa"+
		"\7g\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00b0\7i\2\2\u00af\u009c\3\2\2\2\u00af\u00a5\3\2\2"+
		"\2\u00b0\32\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00ba\7p\2\2\u00b3\u00b4"+
		"\7p\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7\"\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00ba\7p\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b3\3\2\2"+
		"\2\u00ba\34\3\2\2\2\u00bb\u00bc\7,\2\2\u00bc\36\3\2\2\2\u00bd\u00be\7"+
		"=\2\2\u00be \3\2\2\2\u00bf\u00c0\7?\2\2\u00c0\"\3\2\2\2\u00c1\u00c2\7"+
		"*\2\2\u00c2$\3\2\2\2\u00c3\u00c4\7+\2\2\u00c4&\3\2\2\2\u00c5\u00cd\t\3"+
		"\2\2\u00c6\u00ca\t\4\2\2\u00c7\u00c9\t\5\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00e6\3\2\2\2\u00cf\u00d1\t\4\2\2\u00d0\u00d2\t\5\2\2\u00d1\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00e6\3\2\2\2\u00d5\u00d9\t\6\2\2\u00d6\u00d8\t\5\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00e3\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e0\t\4\2\2\u00dd\u00df\t\5"+
		"\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00dc\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00c5\3\2\2\2\u00e5"+
		"\u00cf\3\2\2\2\u00e5\u00d5\3\2\2\2\u00e6(\3\2\2\2\u00e7\u00eb\7)\2\2\u00e8"+
		"\u00ec\n\7\2\2\u00e9\u00ea\7^\2\2\u00ea\u00ec\7)\2\2\u00eb\u00e8\3\2\2"+
		"\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7)\2\2\u00f0*\3\2\2\2\u00f1\u00f5"+
		"\7\f\2\2\u00f2\u00f3\7\17\2\2\u00f3\u00f5\7\f\2\2\u00f4\u00f1\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5,\3\2\2\2\u00f6\u00f8\t\b\2\2\u00f7\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\b\27\4\2\u00fc.\3\2\2\2\u00fd\u00ff\t\t\2\2"+
		"\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0108\3\2\2\2\u0102\u0104\t\n\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u00fe\3\2\2\2\u0107\u0103\3\2\2\2\u0108\60\3\2\2\2\30\2Cgq"+
		"z\u0088\u00af\u00b9\u00ca\u00cd\u00d3\u00d9\u00e0\u00e3\u00e5\u00eb\u00ed"+
		"\u00f4\u00f9\u0100\u0105\u0107\5\3\6\2\3\6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}