// Generated from D:/szko³a/4rok/Kompilator/java\Uql.g4 by ANTLR 4.5.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, LOGIC=7, STRINGKEYWORD=8, 
		NUMERICKEYWORD=9, NUMERICOPERATOR=10, STRINGOPERATOR=11, RETURN=12, SORT=13, 
		SORTDIRECTION=14, ARRAYOPERATOR=15, ALLSELECTOR=16, ENDTOKEN=17, EQUALS=18, 
		NUMBER=19, STRING=20, NEWLINE=21, WS=22, UNKNOWN=23;
	public static final int
		RULE_queries = 0, RULE_returnquery = 1, RULE_query = 2, RULE_expression = 3, 
		RULE_tablearray = 4, RULE_numericarray = 5, RULE_stringarray = 6, RULE_sortexpression = 7;
	public static final String[] ruleNames = {
		"queries", "returnquery", "query", "expression", "tablearray", "numericarray", 
		"stringarray", "sortexpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'['", "']'", "'by'", null, null, null, null, 
		null, null, null, null, null, "'*'", "';'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "LOGIC", "STRINGKEYWORD", "NUMERICKEYWORD", 
		"NUMERICOPERATOR", "STRINGOPERATOR", "RETURN", "SORT", "SORTDIRECTION", 
		"ARRAYOPERATOR", "ALLSELECTOR", "ENDTOKEN", "EQUALS", "NUMBER", "STRING", 
		"NEWLINE", "WS", "UNKNOWN"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UqlVisitor ) return ((UqlVisitor<? extends T>)visitor).visitQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueriesContext queries() throws RecognitionException {
		QueriesContext _localctx = new QueriesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			returnquery();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(17);
				match(NEWLINE);
				setState(18);
				returnquery();
				}
				}
				setState(23);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UqlVisitor ) return ((UqlVisitor<? extends T>)visitor).visitReturnquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnqueryContext returnquery() throws RecognitionException {
		ReturnqueryContext _localctx = new ReturnqueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_returnquery);
		try {
			setState(35);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				query(0);
				setState(25);
				match(RETURN);
				setState(26);
				tablearray();
				setState(27);
				sortexpression();
				setState(28);
				match(ENDTOKEN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				query(0);
				setState(31);
				match(RETURN);
				setState(32);
				tablearray();
				setState(33);
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
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public TerminalNode LOGIC() { return getToken(UqlParser.LOGIC, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UqlVisitor ) return ((UqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
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
			setState(43);
			switch (_input.LA(1)) {
			case STRINGKEYWORD:
			case NUMERICKEYWORD:
			case STRING:
				{
				setState(38);
				expression();
				}
				break;
			case T__0:
				{
				setState(39);
				match(T__0);
				setState(40);
				query(0);
				setState(41);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
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
					setState(45);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(46);
					match(LOGIC);
					setState(47);
					query(3);
					}
					} 
				}
				setState(52);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UqlParser.STRING, 0); }
		public TerminalNode NUMERICOPERATOR() { return getToken(UqlParser.NUMERICOPERATOR, 0); }
		public TerminalNode NUMBER() { return getToken(UqlParser.NUMBER, 0); }
		public TerminalNode STRINGKEYWORD() { return getToken(UqlParser.STRINGKEYWORD, 0); }
		public TerminalNode STRINGOPERATOR() { return getToken(UqlParser.STRINGOPERATOR, 0); }
		public TerminalNode NUMERICKEYWORD() { return getToken(UqlParser.NUMERICKEYWORD, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UqlVisitor ) return ((UqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(STRING);
				setState(54);
				match(NUMERICOPERATOR);
				setState(55);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(STRINGKEYWORD);
				setState(57);
				match(STRINGOPERATOR);
				setState(58);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(NUMERICKEYWORD);
				setState(60);
				match(EQUALS);
				setState(61);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				match(STRINGKEYWORD);
				setState(63);
				match(EQUALS);
				setState(64);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(STRINGKEYWORD);
				setState(66);
				match(ARRAYOPERATOR);
				setState(67);
				stringarray();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				match(NUMERICKEYWORD);
				setState(69);
				match(ARRAYOPERATOR);
				setState(70);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UqlVisitor ) return ((UqlVisitor<? extends T>)visitor).visitTablearray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablearrayContext tablearray() throws RecognitionException {
		TablearrayContext _localctx = new TablearrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tablearray);
		int _la;
		try {
			setState(82);
			switch (_input.LA(1)) {
			case STRINGKEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(STRINGKEYWORD);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(74);
					match(T__2);
					setState(75);
					match(STRINGKEYWORD);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ALLSELECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(ALLSELECTOR);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UqlVisitor ) return ((UqlVisitor<? extends T>)visitor).visitNumericarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericarrayContext numericarray() throws RecognitionException {
		NumericarrayContext _localctx = new NumericarrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numericarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__3);
			setState(85);
			match(NUMBER);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(86);
				match(T__2);
				setState(87);
				match(NUMBER);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__4);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UqlVisitor ) return ((UqlVisitor<? extends T>)visitor).visitStringarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringarrayContext stringarray() throws RecognitionException {
		StringarrayContext _localctx = new StringarrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__3);
			setState(96);
			match(STRING);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(97);
				match(T__2);
				setState(98);
				match(STRING);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__4);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UqlVisitor ) return ((UqlVisitor<? extends T>)visitor).visitSortexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortexpressionContext sortexpression() throws RecognitionException {
		SortexpressionContext _localctx = new SortexpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sortexpression);
		int _la;
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(SORT);
				setState(107);
				match(SORTDIRECTION);
				setState(108);
				match(T__5);
				setState(109);
				match(STRINGKEYWORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(SORT);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(111);
					match(WS);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(SORTDIRECTION);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(118);
					match(WS);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(T__5);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(125);
					match(WS);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7"+
		"\2\26\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\4\3\4\3\4\7\4\63\n\4\f\4"+
		"\16\4\66\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\7\6O\n\6\f\6\16\6R\13\6\3\6\5\6"+
		"U\n\6\3\7\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\ts\n\t\f\t"+
		"\16\tv\13\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\7\t\u0081\n\t\f\t"+
		"\16\t\u0084\13\t\3\t\5\t\u0087\n\t\3\t\2\3\6\n\2\4\6\b\n\f\16\20\2\2\u0091"+
		"\2\22\3\2\2\2\4%\3\2\2\2\6-\3\2\2\2\bI\3\2\2\2\nT\3\2\2\2\fV\3\2\2\2\16"+
		"a\3\2\2\2\20\u0086\3\2\2\2\22\27\5\4\3\2\23\24\7\27\2\2\24\26\5\4\3\2"+
		"\25\23\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2"+
		"\31\27\3\2\2\2\32\33\5\6\4\2\33\34\7\16\2\2\34\35\5\n\6\2\35\36\5\20\t"+
		"\2\36\37\7\23\2\2\37&\3\2\2\2 !\5\6\4\2!\"\7\16\2\2\"#\5\n\6\2#$\7\23"+
		"\2\2$&\3\2\2\2%\32\3\2\2\2% \3\2\2\2&\5\3\2\2\2\'(\b\4\1\2(.\5\b\5\2)"+
		"*\7\3\2\2*+\5\6\4\2+,\7\4\2\2,.\3\2\2\2-\'\3\2\2\2-)\3\2\2\2.\64\3\2\2"+
		"\2/\60\f\4\2\2\60\61\7\t\2\2\61\63\5\6\4\5\62/\3\2\2\2\63\66\3\2\2\2\64"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2\66\64\3\2\2\2\678\7\26\2\289\7"+
		"\f\2\29J\7\25\2\2:;\7\n\2\2;<\7\r\2\2<J\7\26\2\2=>\7\13\2\2>?\7\24\2\2"+
		"?J\7\25\2\2@A\7\n\2\2AB\7\24\2\2BJ\7\26\2\2CD\7\n\2\2DE\7\21\2\2EJ\5\16"+
		"\b\2FG\7\13\2\2GH\7\21\2\2HJ\5\f\7\2I\67\3\2\2\2I:\3\2\2\2I=\3\2\2\2I"+
		"@\3\2\2\2IC\3\2\2\2IF\3\2\2\2J\t\3\2\2\2KP\7\n\2\2LM\7\5\2\2MO\7\n\2\2"+
		"NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QU\3\2\2\2RP\3\2\2\2SU\7\22\2"+
		"\2TK\3\2\2\2TS\3\2\2\2U\13\3\2\2\2VW\7\6\2\2W\\\7\25\2\2XY\7\5\2\2Y[\7"+
		"\25\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2"+
		"_`\7\7\2\2`\r\3\2\2\2ab\7\6\2\2bg\7\26\2\2cd\7\5\2\2df\7\26\2\2ec\3\2"+
		"\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\7\2\2k\17\3"+
		"\2\2\2lm\7\17\2\2mn\7\20\2\2no\7\b\2\2o\u0087\7\n\2\2pt\7\17\2\2qs\7\30"+
		"\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2w{\7\20"+
		"\2\2xz\7\30\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3"+
		"\2\2\2~\u0082\7\b\2\2\177\u0081\7\30\2\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0087\7\13\2\2\u0086l\3\2\2\2\u0086p\3\2\2\2\u0087"+
		"\21\3\2\2\2\17\27%-\64IPT\\gt{\u0082\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}