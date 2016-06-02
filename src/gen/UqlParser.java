// Generated from C:/Users/Mudzo/Documents/UqlProject/ANTLR\Uql.g4 by ANTLR 4.5.1

    package gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, LOGIC=5, STRINGKEYWORD=6, NUMERICKEYWORD=7, 
		NUMERICOPERATOR=8, STRINGOPERATOR=9, RETURN=10, SORT=11, SORTDIRECTION=12, 
		ARRAYOPERATOR=13, ALLSELECTOR=14, ENDTOKEN=15, EQUALS=16, LEFTBRACKET=17, 
		RIGHTBRACKET=18, NUMBER=19, STRING=20, NEWLINE=21, WS=22, UNKNOWN=23;
	public static final int
		RULE_queries = 0, RULE_returnquery = 1, RULE_query = 2, RULE_logic = 3, 
		RULE_expression = 4, RULE_tablearray = 5, RULE_numericarray = 6, RULE_stringarray = 7, 
		RULE_sortexpression = 8;
	public static final String[] ruleNames = {
		"queries", "returnquery", "query", "logic", "expression", "tablearray", 
		"numericarray", "stringarray", "sortexpression"
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

	@Override
	public String getGrammarFileName() { return "Uql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueriesContext extends ParserRuleContext {
		public List<ReturnqueryContext> returnquery() {
			return getRuleContexts(ReturnqueryContext.class);
		}
		public ReturnqueryContext returnquery(int i) {
			return getRuleContext(ReturnqueryContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(UqlParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(UqlParser.NEWLINE, i);
		}
		public QueriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).enterQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).exitQueries(this);
		}
	}

	public final QueriesContext queries() throws RecognitionException {
		QueriesContext _localctx = new QueriesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			returnquery();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(19);
				match(NEWLINE);
				setState(20);
				returnquery();
				}
				}
				setState(25);
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

	public static class ReturnqueryContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(UqlParser.RETURN, 0); }
		public TablearrayContext tablearray() {
			return getRuleContext(TablearrayContext.class,0);
		}
		public SortexpressionContext sortexpression() {
			return getRuleContext(SortexpressionContext.class,0);
		}
		public TerminalNode ENDTOKEN() { return getToken(UqlParser.ENDTOKEN, 0); }
		public ReturnqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).enterReturnquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).exitReturnquery(this);
		}
	}

	public final ReturnqueryContext returnquery() throws RecognitionException {
		ReturnqueryContext _localctx = new ReturnqueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_returnquery);
		try {
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				query(0);
				setState(27);
				match(RETURN);
				setState(28);
				tablearray();
				setState(29);
				sortexpression();
				setState(30);
				match(ENDTOKEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				query(0);
				setState(33);
				match(RETURN);
				setState(34);
				tablearray();
				setState(35);
				match(ENDTOKEN);
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

	public static class QueryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LEFTBRACKET() { return getToken(UqlParser.LEFTBRACKET, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(UqlParser.RIGHTBRACKET, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		return query(0);
	}

	private QueryContext query(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryContext _localctx = new QueryContext(_ctx, _parentState);
		QueryContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_query, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			switch (_input.LA(1)) {
			case STRINGKEYWORD:
			case NUMERICKEYWORD:
				{
				setState(40);
				expression();
				}
				break;
			case LEFTBRACKET:
				{
				setState(41);
				match(LEFTBRACKET);
				setState(42);
				query(0);
				setState(43);
				match(RIGHTBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new QueryContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_query);
					setState(47);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(48);
					logic();
					setState(49);
					query(3);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode LOGIC() { return getToken(UqlParser.LOGIC, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).exitLogic(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(LOGIC);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NUMERICKEYWORD() { return getToken(UqlParser.NUMERICKEYWORD, 0); }
		public TerminalNode NUMERICOPERATOR() { return getToken(UqlParser.NUMERICOPERATOR, 0); }
		public TerminalNode NUMBER() { return getToken(UqlParser.NUMBER, 0); }
		public TerminalNode STRINGKEYWORD() { return getToken(UqlParser.STRINGKEYWORD, 0); }
		public TerminalNode STRINGOPERATOR() { return getToken(UqlParser.STRINGOPERATOR, 0); }
		public TerminalNode STRING() { return getToken(UqlParser.STRING, 0); }
		public TerminalNode EQUALS() { return getToken(UqlParser.EQUALS, 0); }
		public TerminalNode ARRAYOPERATOR() { return getToken(UqlParser.ARRAYOPERATOR, 0); }
		public StringarrayContext stringarray() {
			return getRuleContext(StringarrayContext.class,0);
		}
		public NumericarrayContext numericarray() {
			return getRuleContext(NumericarrayContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(NUMERICKEYWORD);
				setState(59);
				match(NUMERICOPERATOR);
				setState(60);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(STRINGKEYWORD);
				setState(62);
				match(STRINGOPERATOR);
				setState(63);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(NUMERICKEYWORD);
				setState(65);
				match(EQUALS);
				setState(66);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(STRINGKEYWORD);
				setState(68);
				match(EQUALS);
				setState(69);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				match(STRINGKEYWORD);
				setState(71);
				match(ARRAYOPERATOR);
				setState(72);
				stringarray();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				match(NUMERICKEYWORD);
				setState(74);
				match(ARRAYOPERATOR);
				setState(75);
				numericarray();
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

	public static class TablearrayContext extends ParserRuleContext {
		public List<TerminalNode> STRINGKEYWORD() { return getTokens(UqlParser.STRINGKEYWORD); }
		public TerminalNode STRINGKEYWORD(int i) {
			return getToken(UqlParser.STRINGKEYWORD, i);
		}
		public TerminalNode ALLSELECTOR() { return getToken(UqlParser.ALLSELECTOR, 0); }
		public List<TerminalNode> NUMERICKEYWORD() { return getTokens(UqlParser.NUMERICKEYWORD); }
		public TerminalNode NUMERICKEYWORD(int i) {
			return getToken(UqlParser.NUMERICKEYWORD, i);
		}
		public TablearrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablearray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).enterTablearray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).exitTablearray(this);
		}
	}

	public final TablearrayContext tablearray() throws RecognitionException {
		TablearrayContext _localctx = new TablearrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tablearray);
		int _la;
		try {
			setState(95);
			switch (_input.LA(1)) {
			case STRINGKEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(STRINGKEYWORD);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(79);
					match(T__0);
					setState(80);
					match(STRINGKEYWORD);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ALLSELECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(ALLSELECTOR);
				}
				break;
			case NUMERICKEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(NUMERICKEYWORD);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(88);
					match(T__0);
					setState(89);
					match(NUMERICKEYWORD);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class NumericarrayContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(UqlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(UqlParser.NUMBER, i);
		}
		public NumericarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).enterNumericarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).exitNumericarray(this);
		}
	}

	public final NumericarrayContext numericarray() throws RecognitionException {
		NumericarrayContext _localctx = new NumericarrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numericarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__1);
			setState(98);
			match(NUMBER);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(99);
				match(T__0);
				setState(100);
				match(NUMBER);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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

	public static class StringarrayContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(UqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(UqlParser.STRING, i);
		}
		public StringarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).enterStringarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).exitStringarray(this);
		}
	}

	public final StringarrayContext stringarray() throws RecognitionException {
		StringarrayContext _localctx = new StringarrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stringarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__1);
			setState(109);
			match(STRING);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(110);
				match(T__0);
				setState(111);
				match(STRING);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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

	public static class SortexpressionContext extends ParserRuleContext {
		public TerminalNode SORT() { return getToken(UqlParser.SORT, 0); }
		public TerminalNode SORTDIRECTION() { return getToken(UqlParser.SORTDIRECTION, 0); }
		public TerminalNode STRINGKEYWORD() { return getToken(UqlParser.STRINGKEYWORD, 0); }
		public TerminalNode NUMERICKEYWORD() { return getToken(UqlParser.NUMERICKEYWORD, 0); }
		public List<TerminalNode> WS() { return getTokens(UqlParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(UqlParser.WS, i);
		}
		public SortexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).enterSortexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UqlListener ) ((UqlListener)listener).exitSortexpression(this);
		}
	}

	public final SortexpressionContext sortexpression() throws RecognitionException {
		SortexpressionContext _localctx = new SortexpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sortexpression);
		int _la;
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(SORT);
				setState(120);
				match(SORTDIRECTION);
				setState(121);
				match(T__3);
				setState(122);
				match(STRINGKEYWORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(SORT);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(124);
					match(WS);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(SORTDIRECTION);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(131);
					match(WS);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__3);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(138);
					match(WS);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(NUMERICKEYWORD);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return query_sempred((QueryContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean query_sempred(QueryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\4\7"+
		"\4\66\n\4\f\4\16\49\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\7\7T\n\7\f\7\16"+
		"\7W\13\7\3\7\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\5\7b\n\7\3\b\3\b\3\b"+
		"\3\b\7\bh\n\b\f\b\16\bk\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\ts\n\t\f\t\16\t"+
		"v\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13"+
		"\n\3\n\3\n\7\n\u0087\n\n\f\n\16\n\u008a\13\n\3\n\3\n\7\n\u008e\n\n\f\n"+
		"\16\n\u0091\13\n\3\n\5\n\u0094\n\n\3\n\2\3\6\13\2\4\6\b\n\f\16\20\22\2"+
		"\2\u009f\2\24\3\2\2\2\4\'\3\2\2\2\6/\3\2\2\2\b:\3\2\2\2\nN\3\2\2\2\fa"+
		"\3\2\2\2\16c\3\2\2\2\20n\3\2\2\2\22\u0093\3\2\2\2\24\31\5\4\3\2\25\26"+
		"\7\27\2\2\26\30\5\4\3\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32"+
		"\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2\34\35\5\6\4\2\35\36\7\f\2\2\36\37"+
		"\5\f\7\2\37 \5\22\n\2 !\7\21\2\2!(\3\2\2\2\"#\5\6\4\2#$\7\f\2\2$%\5\f"+
		"\7\2%&\7\21\2\2&(\3\2\2\2\'\34\3\2\2\2\'\"\3\2\2\2(\5\3\2\2\2)*\b\4\1"+
		"\2*\60\5\n\6\2+,\7\23\2\2,-\5\6\4\2-.\7\24\2\2.\60\3\2\2\2/)\3\2\2\2/"+
		"+\3\2\2\2\60\67\3\2\2\2\61\62\f\4\2\2\62\63\5\b\5\2\63\64\5\6\4\5\64\66"+
		"\3\2\2\2\65\61\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2"+
		"\29\67\3\2\2\2:;\7\7\2\2;\t\3\2\2\2<=\7\t\2\2=>\7\n\2\2>O\7\25\2\2?@\7"+
		"\b\2\2@A\7\13\2\2AO\7\26\2\2BC\7\t\2\2CD\7\22\2\2DO\7\25\2\2EF\7\b\2\2"+
		"FG\7\22\2\2GO\7\26\2\2HI\7\b\2\2IJ\7\17\2\2JO\5\20\t\2KL\7\t\2\2LM\7\17"+
		"\2\2MO\5\16\b\2N<\3\2\2\2N?\3\2\2\2NB\3\2\2\2NE\3\2\2\2NH\3\2\2\2NK\3"+
		"\2\2\2O\13\3\2\2\2PU\7\b\2\2QR\7\3\2\2RT\7\b\2\2SQ\3\2\2\2TW\3\2\2\2U"+
		"S\3\2\2\2UV\3\2\2\2Vb\3\2\2\2WU\3\2\2\2Xb\7\20\2\2Y^\7\t\2\2Z[\7\3\2\2"+
		"[]\7\t\2\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2"+
		"\2aP\3\2\2\2aX\3\2\2\2aY\3\2\2\2b\r\3\2\2\2cd\7\4\2\2di\7\25\2\2ef\7\3"+
		"\2\2fh\7\25\2\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3"+
		"\2\2\2lm\7\5\2\2m\17\3\2\2\2no\7\4\2\2ot\7\26\2\2pq\7\3\2\2qs\7\26\2\2"+
		"rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\5\2\2"+
		"x\21\3\2\2\2yz\7\r\2\2z{\7\16\2\2{|\7\6\2\2|\u0094\7\b\2\2}\u0081\7\r"+
		"\2\2~\u0080\7\30\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0088"+
		"\7\16\2\2\u0085\u0087\7\30\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008f\7\6\2\2\u008c\u008e\7\30\2\2\u008d\u008c\3\2\2\2"+
		"\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7\t\2\2\u0093y\3\2\2\2\u0093"+
		"}\3\2\2\2\u0094\23\3\2\2\2\20\31\'/\67NU^ait\u0081\u0088\u008f\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}