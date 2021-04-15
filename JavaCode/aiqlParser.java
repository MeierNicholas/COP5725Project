// Generated from aiql.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aiqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT=38, STRING=39, 
		LETTER=40, WS=41;
	public static final int
		RULE_aiql = 0, RULE_multievent = 1, RULE_dependency = 2, RULE_anomaly = 3, 
		RULE_global_cstr = 4, RULE_twind = 5, RULE_cstr = 6, RULE_attr_cstr = 7, 
		RULE_evt_patt = 8, RULE_evt = 9, RULE_rel = 10, RULE_attr_rel = 11, RULE_temp_rel = 12, 
		RULE_evt_rel = 13, RULE_entity = 14, RULE_entity_type = 15, RULE_op_exp = 16, 
		RULE_ret = 17, RULE_res = 18, RULE_m_query = 19, RULE_d_query = 20, RULE_op_edge = 21, 
		RULE_evt_id = 22, RULE_rename_id = 23, RULE_datetime = 24, RULE_attr = 25, 
		RULE_filename = 26, RULE_val = 27, RULE_op = 28, RULE_agg_func = 29, RULE_keyword = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"aiql", "multievent", "dependency", "anomaly", "global_cstr", "twind", 
			"cstr", "attr_cstr", "evt_patt", "evt", "rel", "attr_rel", "temp_rel", 
			"evt_rel", "entity", "entity_type", "op_exp", "ret", "res", "m_query", 
			"d_query", "op_edge", "evt_id", "rename_id", "datetime", "attr", "filename", 
			"val", "op", "agg_func", "keyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'anomaly'", "'('", "')'", "'from'", "'to'", "'as'", "'['", "']'", 
			"'.'", "'before'", "'with'", "','", "'!'", "'&&'", "'||'", "'ret'", "'count'", 
			"'distinct'", "'forward'", "'backward'", "':'", "'->'", "'<-'", "'null'", 
			"'<'", "'>'", "'='", "'<='", "'=>'", "'sum'", "'avg'", "'execute'", "'fail'", 
			"'priv'", "'explicit'", "'shutdown'", "'connect'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT", "STRING", "LETTER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "aiql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public aiqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AiqlContext extends ParserRuleContext {
		public MultieventContext multievent() {
			return getRuleContext(MultieventContext.class,0);
		}
		public DependencyContext dependency() {
			return getRuleContext(DependencyContext.class,0);
		}
		public AnomalyContext anomaly() {
			return getRuleContext(AnomalyContext.class,0);
		}
		public AiqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aiql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterAiql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitAiql(this);
		}
	}

	public final AiqlContext aiql() throws RecognitionException {
		AiqlContext _localctx = new AiqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_aiql);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				multievent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				dependency();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				anomaly();
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

	public static class MultieventContext extends ParserRuleContext {
		public List<Global_cstrContext> global_cstr() {
			return getRuleContexts(Global_cstrContext.class);
		}
		public Global_cstrContext global_cstr(int i) {
			return getRuleContext(Global_cstrContext.class,i);
		}
		public List<M_queryContext> m_query() {
			return getRuleContexts(M_queryContext.class);
		}
		public M_queryContext m_query(int i) {
			return getRuleContext(M_queryContext.class,i);
		}
		public MultieventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multievent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterMultievent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitMultievent(this);
		}
	}

	public final MultieventContext multievent() throws RecognitionException {
		MultieventContext _localctx = new MultieventContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multievent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					global_cstr();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				m_query();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	public static class DependencyContext extends ParserRuleContext {
		public D_queryContext d_query() {
			return getRuleContext(D_queryContext.class,0);
		}
		public List<Global_cstrContext> global_cstr() {
			return getRuleContexts(Global_cstrContext.class);
		}
		public Global_cstrContext global_cstr(int i) {
			return getRuleContext(Global_cstrContext.class,i);
		}
		public DependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterDependency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitDependency(this);
		}
	}

	public final DependencyContext dependency() throws RecognitionException {
		DependencyContext _localctx = new DependencyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dependency);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					global_cstr();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			{
			setState(84);
			d_query();
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

	public static class AnomalyContext extends ParserRuleContext {
		public List<Global_cstrContext> global_cstr() {
			return getRuleContexts(Global_cstrContext.class);
		}
		public Global_cstrContext global_cstr(int i) {
			return getRuleContext(Global_cstrContext.class,i);
		}
		public AnomalyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anomaly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterAnomaly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitAnomaly(this);
		}
	}

	public final AnomalyContext anomaly() throws RecognitionException {
		AnomalyContext _localctx = new AnomalyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_anomaly);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__0);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				global_cstr();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==STRING );
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

	public static class Global_cstrContext extends ParserRuleContext {
		public CstrContext cstr() {
			return getRuleContext(CstrContext.class,0);
		}
		public TwindContext twind() {
			return getRuleContext(TwindContext.class,0);
		}
		public Global_cstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_cstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterGlobal_cstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitGlobal_cstr(this);
		}
	}

	public final Global_cstrContext global_cstr() throws RecognitionException {
		Global_cstrContext _localctx = new Global_cstrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global_cstr);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				cstr();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__1);
				setState(94);
				twind();
				setState(95);
				match(T__2);
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

	public static class TwindContext extends ParserRuleContext {
		public List<DatetimeContext> datetime() {
			return getRuleContexts(DatetimeContext.class);
		}
		public DatetimeContext datetime(int i) {
			return getRuleContext(DatetimeContext.class,i);
		}
		public TwindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterTwind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitTwind(this);
		}
	}

	public final TwindContext twind() throws RecognitionException {
		TwindContext _localctx = new TwindContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_twind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__3);
			setState(100);
			datetime();
			setState(101);
			match(T__4);
			setState(102);
			datetime();
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

	public static class CstrContext extends ParserRuleContext {
		public Attr_cstrContext attr_cstr() {
			return getRuleContext(Attr_cstrContext.class,0);
		}
		public CstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterCstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitCstr(this);
		}
	}

	public final CstrContext cstr() throws RecognitionException {
		CstrContext _localctx = new CstrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			attr_cstr();
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

	public static class Attr_cstrContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Attr_cstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_cstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterAttr_cstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitAttr_cstr(this);
		}
	}

	public final Attr_cstrContext attr_cstr() throws RecognitionException {
		Attr_cstrContext _localctx = new Attr_cstrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attr_cstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			attr();
			setState(107);
			op();
			setState(108);
			val();
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

	public static class Evt_pattContext extends ParserRuleContext {
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public Op_expContext op_exp() {
			return getRuleContext(Op_expContext.class,0);
		}
		public EvtContext evt() {
			return getRuleContext(EvtContext.class,0);
		}
		public TwindContext twind() {
			return getRuleContext(TwindContext.class,0);
		}
		public Evt_pattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evt_patt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterEvt_patt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitEvt_patt(this);
		}
	}

	public final Evt_pattContext evt_patt() throws RecognitionException {
		Evt_pattContext _localctx = new Evt_pattContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_evt_patt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			entity();
			setState(111);
			op_exp(0);
			setState(112);
			entity();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(113);
				evt();
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(116);
				match(T__1);
				setState(117);
				twind();
				setState(118);
				match(T__2);
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

	public static class EvtContext extends ParserRuleContext {
		public Evt_idContext evt_id() {
			return getRuleContext(Evt_idContext.class,0);
		}
		public Attr_cstrContext attr_cstr() {
			return getRuleContext(Attr_cstrContext.class,0);
		}
		public EvtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterEvt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitEvt(this);
		}
	}

	public final EvtContext evt() throws RecognitionException {
		EvtContext _localctx = new EvtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_evt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__5);
			setState(123);
			evt_id();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(124);
				match(T__6);
				setState(125);
				attr_cstr();
				setState(126);
				match(T__7);
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

	public static class RelContext extends ParserRuleContext {
		public Attr_relContext attr_rel() {
			return getRuleContext(Attr_relContext.class,0);
		}
		public Temp_relContext temp_rel() {
			return getRuleContext(Temp_relContext.class,0);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitRel(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rel);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				attr_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				temp_rel();
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

	public static class Attr_relContext extends ParserRuleContext {
		public List<Evt_idContext> evt_id() {
			return getRuleContexts(Evt_idContext.class);
		}
		public Evt_idContext evt_id(int i) {
			return getRuleContext(Evt_idContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public Attr_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterAttr_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitAttr_rel(this);
		}
	}

	public final Attr_relContext attr_rel() throws RecognitionException {
		Attr_relContext _localctx = new Attr_relContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attr_rel);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				evt_id();
				setState(135);
				match(T__8);
				setState(136);
				attr();
				setState(137);
				op();
				setState(138);
				evt_id();
				setState(139);
				match(T__8);
				setState(140);
				attr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				evt_id();
				setState(143);
				op();
				setState(144);
				evt_id();
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

	public static class Temp_relContext extends ParserRuleContext {
		public List<Evt_idContext> evt_id() {
			return getRuleContexts(Evt_idContext.class);
		}
		public Evt_idContext evt_id(int i) {
			return getRuleContext(Evt_idContext.class,i);
		}
		public Temp_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterTemp_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitTemp_rel(this);
		}
	}

	public final Temp_relContext temp_rel() throws RecognitionException {
		Temp_relContext _localctx = new Temp_relContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_temp_rel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			evt_id();
			setState(149);
			match(T__9);
			setState(150);
			evt_id();
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

	public static class Evt_relContext extends ParserRuleContext {
		public List<RelContext> rel() {
			return getRuleContexts(RelContext.class);
		}
		public RelContext rel(int i) {
			return getRuleContext(RelContext.class,i);
		}
		public Evt_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evt_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterEvt_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitEvt_rel(this);
		}
	}

	public final Evt_relContext evt_rel() throws RecognitionException {
		Evt_relContext _localctx = new Evt_relContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_evt_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__10);
			setState(153);
			rel();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(154);
				match(T__11);
				setState(155);
				rel();
				}
				}
				setState(160);
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

	public static class EntityContext extends ParserRuleContext {
		public Entity_typeContext entity_type() {
			return getRuleContext(Entity_typeContext.class,0);
		}
		public Evt_idContext evt_id() {
			return getRuleContext(Evt_idContext.class,0);
		}
		public Attr_cstrContext attr_cstr() {
			return getRuleContext(Attr_cstrContext.class,0);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitEntity(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			entity_type();
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(162);
				evt_id();
				}
				break;
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(165);
				match(T__6);
				setState(166);
				attr_cstr();
				setState(167);
				match(T__7);
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

	public static class Entity_typeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(aiqlParser.STRING, 0); }
		public Entity_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterEntity_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitEntity_type(this);
		}
	}

	public final Entity_typeContext entity_type() throws RecognitionException {
		Entity_typeContext _localctx = new Entity_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_entity_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(STRING);
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

	public static class Op_expContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public List<Op_expContext> op_exp() {
			return getRuleContexts(Op_expContext.class);
		}
		public Op_expContext op_exp(int i) {
			return getRuleContext(Op_expContext.class,i);
		}
		public Op_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterOp_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitOp_exp(this);
		}
	}

	public final Op_expContext op_exp() throws RecognitionException {
		return op_exp(0);
	}

	private Op_expContext op_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_expContext _localctx = new Op_expContext(_ctx, _parentState);
		Op_expContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_op_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
				{
				setState(174);
				keyword();
				}
				break;
			case T__12:
				{
				setState(175);
				match(T__12);
				setState(176);
				op_exp(3);
				}
				break;
			case T__1:
				{
				setState(177);
				match(T__1);
				setState(178);
				op_exp(0);
				setState(179);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_expContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_exp);
					setState(183);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(184);
					_la = _input.LA(1);
					if ( !(_la==T__13 || _la==T__14) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(185);
					op_exp(3);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class RetContext extends ParserRuleContext {
		public List<ResContext> res() {
			return getRuleContexts(ResContext.class);
		}
		public ResContext res(int i) {
			return getRuleContext(ResContext.class,i);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitRet(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__15);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(192);
				match(T__16);
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(195);
				match(T__17);
				}
			}

			setState(198);
			res();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(199);
				match(T__11);
				setState(200);
				res();
				}
				}
				setState(205);
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

	public static class ResContext extends ParserRuleContext {
		public Evt_idContext evt_id() {
			return getRuleContext(Evt_idContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public Agg_funcContext agg_func() {
			return getRuleContext(Agg_funcContext.class,0);
		}
		public ResContext res() {
			return getRuleContext(ResContext.class,0);
		}
		public Rename_idContext rename_id() {
			return getRuleContext(Rename_idContext.class,0);
		}
		public ResContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_res; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterRes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitRes(this);
		}
	}

	public final ResContext res() throws RecognitionException {
		ResContext _localctx = new ResContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_res);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				evt_id();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(207);
					match(T__8);
					setState(208);
					attr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				attr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				agg_func();
				setState(213);
				match(T__1);
				setState(214);
				res();
				setState(215);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(T__5);
				setState(218);
				rename_id();
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

	public static class M_queryContext extends ParserRuleContext {
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public List<Evt_pattContext> evt_patt() {
			return getRuleContexts(Evt_pattContext.class);
		}
		public Evt_pattContext evt_patt(int i) {
			return getRuleContext(Evt_pattContext.class,i);
		}
		public Evt_relContext evt_rel() {
			return getRuleContext(Evt_relContext.class,0);
		}
		public M_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterM_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitM_query(this);
		}
	}

	public final M_queryContext m_query() throws RecognitionException {
		M_queryContext _localctx = new M_queryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_m_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				evt_patt();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(226);
				evt_rel();
				}
			}

			setState(229);
			ret();
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

	public static class D_queryContext extends ParserRuleContext {
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public List<Op_edgeContext> op_edge() {
			return getRuleContexts(Op_edgeContext.class);
		}
		public Op_edgeContext op_edge(int i) {
			return getRuleContext(Op_edgeContext.class,i);
		}
		public D_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterD_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitD_query(this);
		}
	}

	public final D_queryContext d_query() throws RecognitionException {
		D_queryContext _localctx = new D_queryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_d_query);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18 || _la==T__19) {
				{
				setState(231);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				match(T__20);
				}
			}

			setState(238); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(235);
					entity();
					setState(236);
					op_edge();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(240); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(242);
			entity();
			setState(243);
			ret();
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

	public static class Op_edgeContext extends ParserRuleContext {
		public Op_expContext op_exp() {
			return getRuleContext(Op_expContext.class,0);
		}
		public Op_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterOp_edge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitOp_edge(this);
		}
	}

	public final Op_edgeContext op_edge() throws RecognitionException {
		Op_edgeContext _localctx = new Op_edgeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(246);
			match(T__6);
			setState(247);
			op_exp(0);
			setState(248);
			match(T__7);
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

	public static class Evt_idContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(aiqlParser.STRING, 0); }
		public TerminalNode INT() { return getToken(aiqlParser.INT, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Evt_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evt_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterEvt_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitEvt_id(this);
		}
	}

	public final Evt_idContext evt_id() throws RecognitionException {
		Evt_idContext _localctx = new Evt_idContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_evt_id);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(250);
				match(STRING);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(251);
					match(INT);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				filename();
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

	public static class Rename_idContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(aiqlParser.STRING, 0); }
		public Rename_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterRename_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitRename_id(this);
		}
	}

	public final Rename_idContext rename_id() throws RecognitionException {
		Rename_idContext _localctx = new Rename_idContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rename_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(STRING);
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

	public static class DatetimeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(aiqlParser.INT, 0); }
		public DatetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitDatetime(this);
		}
	}

	public final DatetimeContext datetime() throws RecognitionException {
		DatetimeContext _localctx = new DatetimeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_datetime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(INT);
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

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(aiqlParser.STRING, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(STRING);
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

	public static class FilenameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(aiqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(aiqlParser.STRING, i);
		}
		public TerminalNode INT() { return getToken(aiqlParser.INT, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitFilename(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_filename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(STRING);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(264);
				match(INT);
				}
			}

			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(267);
				match(T__8);
				setState(268);
				match(STRING);
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(aiqlParser.STRING, 0); }
		public TerminalNode INT() { return getToken(aiqlParser.INT, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_val);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(STRING);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(272);
					match(INT);
					}
				}

				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(INT);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(T__23);
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Agg_funcContext extends ParserRuleContext {
		public Agg_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agg_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterAgg_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitAgg_func(this);
		}
	}

	public final Agg_funcContext agg_func() throws RecognitionException {
		Agg_funcContext _localctx = new Agg_funcContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_agg_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return op_exp_sempred((Op_expContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean op_exp_sempred(Op_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0120\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\5\2D\n\2\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\6\3M\n\3\r\3\16\3N\3"+
		"\4\7\4R\n\4\f\4\16\4U\13\4\3\4\3\4\3\5\3\5\6\5[\n\5\r\5\16\5\\\3\6\3\6"+
		"\3\6\3\6\3\6\5\6d\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\5\nu\n\n\3\n\3\n\3\n\3\n\5\n{\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0083\n\13\3\f\3\f\5\f\u0087\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0095\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\7\17\u009f\n\17\f\17\16\17\u00a2\13\17\3\20\3\20\5\20\u00a6\n\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00ac\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00b8\n\22\3\22\3\22\3\22\7\22\u00bd\n\22\f\22\16"+
		"\22\u00c0\13\22\3\23\3\23\5\23\u00c4\n\23\3\23\5\23\u00c7\n\23\3\23\3"+
		"\23\3\23\7\23\u00cc\n\23\f\23\16\23\u00cf\13\23\3\24\3\24\3\24\5\24\u00d4"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00de\n\24\3\25\6\25"+
		"\u00e1\n\25\r\25\16\25\u00e2\3\25\5\25\u00e6\n\25\3\25\3\25\3\26\3\26"+
		"\5\26\u00ec\n\26\3\26\3\26\3\26\6\26\u00f1\n\26\r\26\16\26\u00f2\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00ff\n\30\3\30\5\30"+
		"\u0102\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\5\34\u010c\n\34\3"+
		"\34\3\34\5\34\u0110\n\34\3\35\3\35\5\35\u0114\n\35\3\35\3\35\5\35\u0118"+
		"\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \2\3\"!\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>\2\b\3\2\20\21\3\2\25\26\3\2\30\31\3"+
		"\2\33\37\3\2 !\3\2\"\'\2\u0124\2C\3\2\2\2\4H\3\2\2\2\6S\3\2\2\2\bX\3\2"+
		"\2\2\nc\3\2\2\2\fe\3\2\2\2\16j\3\2\2\2\20l\3\2\2\2\22p\3\2\2\2\24|\3\2"+
		"\2\2\26\u0086\3\2\2\2\30\u0094\3\2\2\2\32\u0096\3\2\2\2\34\u009a\3\2\2"+
		"\2\36\u00a3\3\2\2\2 \u00ad\3\2\2\2\"\u00b7\3\2\2\2$\u00c1\3\2\2\2&\u00dd"+
		"\3\2\2\2(\u00e0\3\2\2\2*\u00eb\3\2\2\2,\u00f7\3\2\2\2.\u0101\3\2\2\2\60"+
		"\u0103\3\2\2\2\62\u0105\3\2\2\2\64\u0107\3\2\2\2\66\u0109\3\2\2\28\u0117"+
		"\3\2\2\2:\u0119\3\2\2\2<\u011b\3\2\2\2>\u011d\3\2\2\2@D\5\4\3\2AD\5\6"+
		"\4\2BD\5\b\5\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\3\3\2\2\2EG\5\n\6\2FE\3"+
		"\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KM\5(\25\2LK\3"+
		"\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PR\5\n\6\2QP\3\2\2\2RU"+
		"\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\5*\26\2W\7\3\2\2\2"+
		"XZ\7\3\2\2Y[\5\n\6\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\t\3\2"+
		"\2\2^d\5\16\b\2_`\7\4\2\2`a\5\f\7\2ab\7\5\2\2bd\3\2\2\2c^\3\2\2\2c_\3"+
		"\2\2\2d\13\3\2\2\2ef\7\6\2\2fg\5\62\32\2gh\7\7\2\2hi\5\62\32\2i\r\3\2"+
		"\2\2jk\5\20\t\2k\17\3\2\2\2lm\5\64\33\2mn\5:\36\2no\58\35\2o\21\3\2\2"+
		"\2pq\5\36\20\2qr\5\"\22\2rt\5\36\20\2su\5\24\13\2ts\3\2\2\2tu\3\2\2\2"+
		"uz\3\2\2\2vw\7\4\2\2wx\5\f\7\2xy\7\5\2\2y{\3\2\2\2zv\3\2\2\2z{\3\2\2\2"+
		"{\23\3\2\2\2|}\7\b\2\2}\u0082\5.\30\2~\177\7\t\2\2\177\u0080\5\20\t\2"+
		"\u0080\u0081\7\n\2\2\u0081\u0083\3\2\2\2\u0082~\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\25\3\2\2\2\u0084\u0087\5\30\r\2\u0085\u0087\5\32\16\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\27\3\2\2\2\u0088\u0089\5.\30"+
		"\2\u0089\u008a\7\13\2\2\u008a\u008b\5\64\33\2\u008b\u008c\5:\36\2\u008c"+
		"\u008d\5.\30\2\u008d\u008e\7\13\2\2\u008e\u008f\5\64\33\2\u008f\u0095"+
		"\3\2\2\2\u0090\u0091\5.\30\2\u0091\u0092\5:\36\2\u0092\u0093\5.\30\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0088\3\2\2\2\u0094\u0090\3\2\2\2\u0095\31\3\2\2"+
		"\2\u0096\u0097\5.\30\2\u0097\u0098\7\f\2\2\u0098\u0099\5.\30\2\u0099\33"+
		"\3\2\2\2\u009a\u009b\7\r\2\2\u009b\u00a0\5\26\f\2\u009c\u009d\7\16\2\2"+
		"\u009d\u009f\5\26\f\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\35\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a5\5 \21\2\u00a4\u00a6\5.\30\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00ab\3\2\2\2\u00a7\u00a8\7\t\2\2\u00a8\u00a9\5\20\t\2\u00a9"+
		"\u00aa\7\n\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\37\3\2\2\2\u00ad\u00ae\7)\2\2\u00ae!\3\2\2\2\u00af\u00b0\b"+
		"\22\1\2\u00b0\u00b8\5> \2\u00b1\u00b2\7\17\2\2\u00b2\u00b8\5\"\22\5\u00b3"+
		"\u00b4\7\4\2\2\u00b4\u00b5\5\"\22\2\u00b5\u00b6\7\5\2\2\u00b6\u00b8\3"+
		"\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8"+
		"\u00be\3\2\2\2\u00b9\u00ba\f\4\2\2\u00ba\u00bb\t\2\2\2\u00bb\u00bd\5\""+
		"\22\5\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf#\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\7\22\2\2"+
		"\u00c2\u00c4\7\23\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00c7\7\24\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00cd\5&\24\2\u00c9\u00ca\7\16\2\2\u00ca\u00cc"+
		"\5&\24\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce%\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\5.\30\2"+
		"\u00d1\u00d2\7\13\2\2\u00d2\u00d4\5\64\33\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00de\3\2\2\2\u00d5\u00de\5\64\33\2\u00d6\u00d7\5"+
		"<\37\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9\5&\24\2\u00d9\u00da\7\5\2\2\u00da"+
		"\u00de\3\2\2\2\u00db\u00dc\7\b\2\2\u00dc\u00de\5\60\31\2\u00dd\u00d0\3"+
		"\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\'\3\2\2\2\u00df\u00e1\5\22\n\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2"+
		"\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e6"+
		"\5\34\17\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2"+
		"\u00e7\u00e8\5$\23\2\u00e8)\3\2\2\2\u00e9\u00ea\t\3\2\2\u00ea\u00ec\7"+
		"\27\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f0\3\2\2\2\u00ed"+
		"\u00ee\5\36\20\2\u00ee\u00ef\5,\27\2\u00ef\u00f1\3\2\2\2\u00f0\u00ed\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\5\36\20\2\u00f5\u00f6\5$\23\2\u00f6+\3\2\2"+
		"\2\u00f7\u00f8\t\4\2\2\u00f8\u00f9\7\t\2\2\u00f9\u00fa\5\"\22\2\u00fa"+
		"\u00fb\7\n\2\2\u00fb-\3\2\2\2\u00fc\u00fe\7)\2\2\u00fd\u00ff\7(\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u0102\5\66"+
		"\34\2\u0101\u00fc\3\2\2\2\u0101\u0100\3\2\2\2\u0102/\3\2\2\2\u0103\u0104"+
		"\7)\2\2\u0104\61\3\2\2\2\u0105\u0106\7(\2\2\u0106\63\3\2\2\2\u0107\u0108"+
		"\7)\2\2\u0108\65\3\2\2\2\u0109\u010b\7)\2\2\u010a\u010c\7(\2\2\u010b\u010a"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010e\7\13\2\2"+
		"\u010e\u0110\7)\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\67\3"+
		"\2\2\2\u0111\u0113\7)\2\2\u0112\u0114\7(\2\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0118\3\2\2\2\u0115\u0118\7(\2\2\u0116\u0118\7\32"+
		"\2\2\u0117\u0111\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"9\3\2\2\2\u0119\u011a\t\5\2\2\u011a;\3\2\2\2\u011b\u011c\t\6\2\2\u011c"+
		"=\3\2\2\2\u011d\u011e\t\7\2\2\u011e?\3\2\2\2!CHNS\\ctz\u0082\u0086\u0094"+
		"\u00a0\u00a5\u00ab\u00b7\u00be\u00c3\u00c6\u00cd\u00d3\u00dd\u00e2\u00e5"+
		"\u00eb\u00f2\u00fe\u0101\u010b\u010f\u0113\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}