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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, INT=50, STRING=51, WS=52;
	public static final int
		RULE_aiql = 0, RULE_multievent = 1, RULE_dependency = 2, RULE_anomaly = 3, 
		RULE_global_cstr = 4, RULE_twind = 5, RULE_cstr = 6, RULE_attr_cstr = 7, 
		RULE_evt_patt = 8, RULE_evt = 9, RULE_rel = 10, RULE_attr_rel = 11, RULE_temp_rel = 12, 
		RULE_evt_rel = 13, RULE_entity = 14, RULE_entity_type = 15, RULE_op_exp = 16, 
		RULE_ret = 17, RULE_res = 18, RULE_group_by = 19, RULE_ret_filter = 20, 
		RULE_m_query = 21, RULE_d_query = 22, RULE_op_edge = 23, RULE_evt_id = 24, 
		RULE_rename_id = 25, RULE_datetime = 26, RULE_attr = 27, RULE_filename = 28, 
		RULE_val = 29, RULE_op = 30, RULE_agg_func = 31, RULE_keyword = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"aiql", "multievent", "dependency", "anomaly", "global_cstr", "twind", 
			"cstr", "attr_cstr", "evt_patt", "evt", "rel", "attr_rel", "temp_rel", 
			"evt_rel", "entity", "entity_type", "op_exp", "ret", "res", "group_by", 
			"ret_filter", "m_query", "d_query", "op_edge", "evt_id", "rename_id", 
			"datetime", "attr", "filename", "val", "op", "agg_func", "keyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'anomaly'", "'('", "')'", "'from'", "'to'", "'!'", "'not'", "'in'", 
			"','", "'as'", "'['", "']'", "'.'", "'before'", "'after'", "'within'", 
			"'with'", "'proc'", "'conn'", "'&&'", "'||'", "'ret'", "'count'", "'distinct'", 
			"'group by'", "'having'", "'sort by'", "'asc'", "'desc'", "'top'", "'forward'", 
			"'backward'", "':'", "'->'", "'<-'", "'null'", "'<'", "'>'", "'='", "'<='", 
			"'=>'", "'sum'", "'avg'", "'execute'", "'fail'", "'priv'", "'explicit'", 
			"'shutdown'", "'connect'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT", "STRING", "WS"
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
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				multievent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				dependency();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__35) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(71);
				global_cstr();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				m_query();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 || _la==T__18 );
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__35) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(82);
				global_cstr();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(88);
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
			setState(90);
			match(T__0);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				global_cstr();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__35) | (1L << INT) | (1L << STRING))) != 0) );
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__35:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				cstr();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__1);
				setState(98);
				twind();
				setState(99);
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
			setState(103);
			match(T__3);
			setState(104);
			datetime();
			setState(105);
			match(T__4);
			setState(106);
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
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
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
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				attr_cstr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(109);
					match(T__5);
					}
				}

				setState(112);
				val();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				attr();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(114);
					match(T__6);
					}
				}

				setState(117);
				match(T__7);
				setState(118);
				match(T__1);
				setState(119);
				val();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(120);
					match(T__8);
					setState(121);
					val();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__2);
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
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				attr();
				setState(132);
				op();
				setState(133);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
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
			setState(138);
			entity();
			setState(139);
			op_exp(0);
			setState(140);
			entity();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(141);
				evt();
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(144);
				match(T__1);
				setState(145);
				twind();
				setState(146);
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
			setState(150);
			match(T__9);
			setState(151);
			evt_id();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(152);
				match(T__10);
				setState(153);
				attr_cstr();
				setState(154);
				match(T__11);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				attr_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
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
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				evt_id();
				setState(163);
				match(T__12);
				setState(164);
				attr();
				setState(165);
				op();
				setState(166);
				evt_id();
				setState(167);
				match(T__12);
				setState(168);
				attr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				evt_id();
				setState(171);
				op();
				setState(172);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			evt_id();
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
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
			setState(180);
			match(T__16);
			setState(181);
			rel();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(182);
				match(T__8);
				setState(183);
				rel();
				}
				}
				setState(188);
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
			setState(189);
			entity_type();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(190);
				evt_id();
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(193);
				match(T__10);
				setState(194);
				attr_cstr();
				setState(195);
				match(T__11);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
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
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
				{
				setState(202);
				keyword();
				}
				break;
			case T__5:
				{
				setState(203);
				match(T__5);
				setState(204);
				op_exp(3);
				}
				break;
			case T__1:
				{
				setState(205);
				match(T__1);
				setState(206);
				op_exp(0);
				setState(207);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_expContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_exp);
					setState(211);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(212);
					_la = _input.LA(1);
					if ( !(_la==T__19 || _la==T__20) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(213);
					op_exp(3);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(219);
			match(T__21);
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(220);
				match(T__22);
				}
				break;
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(223);
				match(T__23);
				}
			}

			setState(226);
			res();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(227);
				match(T__8);
				setState(228);
				res();
				}
				}
				setState(233);
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
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				evt_id();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(235);
					match(T__12);
					setState(236);
					attr();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				attr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				agg_func();
				setState(241);
				match(T__1);
				setState(242);
				res();
				setState(243);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(T__9);
				setState(246);
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

	public static class Group_byContext extends ParserRuleContext {
		public List<ResContext> res() {
			return getRuleContexts(ResContext.class);
		}
		public ResContext res(int i) {
			return getRuleContext(ResContext.class,i);
		}
		public Group_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterGroup_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitGroup_by(this);
		}
	}

	public final Group_byContext group_by() throws RecognitionException {
		Group_byContext _localctx = new Group_byContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_group_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__24);
			setState(250);
			res();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(251);
				match(T__8);
				setState(252);
				res();
				}
				}
				setState(257);
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

	public static class Ret_filterContext extends ParserRuleContext {
		public ResContext res() {
			return getRuleContext(ResContext.class,0);
		}
		public CstrContext cstr() {
			return getRuleContext(CstrContext.class,0);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public TerminalNode INT() { return getToken(aiqlParser.INT, 0); }
		public Ret_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterRet_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitRet_filter(this);
		}
	}

	public final Ret_filterContext ret_filter() throws RecognitionException {
		Ret_filterContext _localctx = new Ret_filterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ret_filter);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__25);
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(259);
					res();
					}
					break;
				case 2:
					{
					setState(260);
					cstr();
					}
					break;
				}
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(T__26);
				setState(264);
				attr();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(265);
					match(T__8);
					setState(266);
					attr();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27 || _la==T__28) {
					{
					setState(272);
					_la = _input.LA(1);
					if ( !(_la==T__27 || _la==T__28) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(T__29);
				setState(276);
				match(INT);
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
		public Ret_filterContext ret_filter() {
			return getRuleContext(Ret_filterContext.class,0);
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
		enterRule(_localctx, 42, RULE_m_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				evt_patt();
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 || _la==T__18 );
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(284);
				evt_rel();
				}
			}

			setState(287);
			ret();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__29))) != 0)) {
				{
				setState(288);
				ret_filter();
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
		public Ret_filterContext ret_filter() {
			return getRuleContext(Ret_filterContext.class,0);
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
		enterRule(_localctx, 44, RULE_d_query);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==T__31) {
				{
				setState(291);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(292);
				match(T__32);
				}
			}

			setState(298); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(295);
					entity();
					setState(296);
					op_edge();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(300); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(302);
			entity();
			setState(303);
			ret();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__29))) != 0)) {
				{
				setState(304);
				ret_filter();
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
		enterRule(_localctx, 46, RULE_op_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(308);
			match(T__10);
			setState(309);
			op_exp(0);
			setState(310);
			match(T__11);
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
		enterRule(_localctx, 48, RULE_evt_id);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(312);
				match(STRING);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(313);
					match(INT);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
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
		enterRule(_localctx, 50, RULE_rename_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		enterRule(_localctx, 52, RULE_datetime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
		enterRule(_localctx, 54, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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
		enterRule(_localctx, 56, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(STRING);
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(326);
				match(T__12);
				setState(327);
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
		enterRule(_localctx, 58, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << INT) | (1L << STRING))) != 0)) ) {
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
		enterRule(_localctx, 60, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
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
		enterRule(_localctx, 62, RULE_agg_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0155\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\5\2H\n\2\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\6\3Q"+
		"\n\3\r\3\16\3R\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\5\3\5\6\5_\n\5\r"+
		"\5\16\5`\3\6\3\6\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b"+
		"q\n\b\3\b\3\b\3\b\5\bv\n\b\3\b\3\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080"+
		"\13\b\3\b\3\b\5\b\u0084\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n"+
		"\3\n\3\n\5\n\u0091\n\n\3\n\3\n\3\n\3\n\5\n\u0097\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u009f\n\13\3\f\3\f\5\f\u00a3\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b1\n\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\7\17\u00bb\n\17\f\17\16\17\u00be\13\17\3\20\3\20\5\20"+
		"\u00c2\n\20\3\20\3\20\3\20\3\20\5\20\u00c8\n\20\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d4\n\22\3\22\3\22\3\22\7\22\u00d9"+
		"\n\22\f\22\16\22\u00dc\13\22\3\23\3\23\5\23\u00e0\n\23\3\23\5\23\u00e3"+
		"\n\23\3\23\3\23\3\23\7\23\u00e8\n\23\f\23\16\23\u00eb\13\23\3\24\3\24"+
		"\3\24\5\24\u00f0\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fa"+
		"\n\24\3\25\3\25\3\25\3\25\7\25\u0100\n\25\f\25\16\25\u0103\13\25\3\26"+
		"\3\26\3\26\5\26\u0108\n\26\3\26\3\26\3\26\3\26\7\26\u010e\n\26\f\26\16"+
		"\26\u0111\13\26\3\26\5\26\u0114\n\26\3\26\3\26\5\26\u0118\n\26\3\27\6"+
		"\27\u011b\n\27\r\27\16\27\u011c\3\27\5\27\u0120\n\27\3\27\3\27\5\27\u0124"+
		"\n\27\3\30\3\30\5\30\u0128\n\30\3\30\3\30\3\30\6\30\u012d\n\30\r\30\16"+
		"\30\u012e\3\30\3\30\3\30\5\30\u0134\n\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\5\32\u013d\n\32\3\32\5\32\u0140\n\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\36\5\36\u014b\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2"+
		"\3\"#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@B\2\f\3\2\20\22\3\2\24\25\3\2\26\27\3\2\36\37\3\2!\"\3\2$%\4\2&&\64\65"+
		"\3\2\'+\4\2\31\31,-\3\2.\63\2\u0161\2G\3\2\2\2\4L\3\2\2\2\6W\3\2\2\2\b"+
		"\\\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16\u0083\3\2\2\2\20\u008a\3\2\2\2\22"+
		"\u008c\3\2\2\2\24\u0098\3\2\2\2\26\u00a2\3\2\2\2\30\u00b0\3\2\2\2\32\u00b2"+
		"\3\2\2\2\34\u00b6\3\2\2\2\36\u00bf\3\2\2\2 \u00c9\3\2\2\2\"\u00d3\3\2"+
		"\2\2$\u00dd\3\2\2\2&\u00f9\3\2\2\2(\u00fb\3\2\2\2*\u0117\3\2\2\2,\u011a"+
		"\3\2\2\2.\u0127\3\2\2\2\60\u0135\3\2\2\2\62\u013f\3\2\2\2\64\u0141\3\2"+
		"\2\2\66\u0143\3\2\2\28\u0145\3\2\2\2:\u0147\3\2\2\2<\u014c\3\2\2\2>\u014e"+
		"\3\2\2\2@\u0150\3\2\2\2B\u0152\3\2\2\2DH\5\4\3\2EH\5\6\4\2FH\5\b\5\2G"+
		"D\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\3\3\2\2\2IK\5\n\6\2JI\3\2\2\2KN\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2OQ\5,\27\2PO\3\2\2\2QR\3\2\2\2"+
		"RP\3\2\2\2RS\3\2\2\2S\5\3\2\2\2TV\5\n\6\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\5.\30\2[\7\3\2\2\2\\^\7\3\2\2]_\5\n"+
		"\6\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\t\3\2\2\2bh\5\16\b\2cd\7"+
		"\4\2\2de\5\f\7\2ef\7\5\2\2fh\3\2\2\2gb\3\2\2\2gc\3\2\2\2h\13\3\2\2\2i"+
		"j\7\6\2\2jk\5\66\34\2kl\7\7\2\2lm\5\66\34\2m\r\3\2\2\2n\u0084\5\20\t\2"+
		"oq\7\b\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2r\u0084\5<\37\2su\58\35\2tv\7"+
		"\t\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\n\2\2xy\7\4\2\2y~\5<\37\2z{\7"+
		"\13\2\2{}\5<\37\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\5\2\2\u0082\u0084\3\2\2\2"+
		"\u0083n\3\2\2\2\u0083p\3\2\2\2\u0083s\3\2\2\2\u0084\17\3\2\2\2\u0085\u0086"+
		"\58\35\2\u0086\u0087\5> \2\u0087\u0088\5<\37\2\u0088\u008b\3\2\2\2\u0089"+
		"\u008b\5:\36\2\u008a\u0085\3\2\2\2\u008a\u0089\3\2\2\2\u008b\21\3\2\2"+
		"\2\u008c\u008d\5\36\20\2\u008d\u008e\5\"\22\2\u008e\u0090\5\36\20\2\u008f"+
		"\u0091\5\24\13\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0096\3"+
		"\2\2\2\u0092\u0093\7\4\2\2\u0093\u0094\5\f\7\2\u0094\u0095\7\5\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0097\3\2\2\2\u0097\23\3\2\2"+
		"\2\u0098\u0099\7\f\2\2\u0099\u009e\5\62\32\2\u009a\u009b\7\r\2\2\u009b"+
		"\u009c\5\20\t\2\u009c\u009d\7\16\2\2\u009d\u009f\3\2\2\2\u009e\u009a\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\25\3\2\2\2\u00a0\u00a3\5\30\r\2\u00a1"+
		"\u00a3\5\32\16\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\27\3\2"+
		"\2\2\u00a4\u00a5\5\62\32\2\u00a5\u00a6\7\17\2\2\u00a6\u00a7\58\35\2\u00a7"+
		"\u00a8\5> \2\u00a8\u00a9\5\62\32\2\u00a9\u00aa\7\17\2\2\u00aa\u00ab\5"+
		"8\35\2\u00ab\u00b1\3\2\2\2\u00ac\u00ad\5\62\32\2\u00ad\u00ae\5> \2\u00ae"+
		"\u00af\5\62\32\2\u00af\u00b1\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0\u00ac\3"+
		"\2\2\2\u00b1\31\3\2\2\2\u00b2\u00b3\5\62\32\2\u00b3\u00b4\t\2\2\2\u00b4"+
		"\u00b5\5\62\32\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\23\2\2\u00b7\u00bc\5\26"+
		"\f\2\u00b8\u00b9\7\13\2\2\u00b9\u00bb\5\26\f\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\35\3\2\2"+
		"\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\5 \21\2\u00c0\u00c2\5\62\32\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c7\3\2\2\2\u00c3\u00c4\7\r"+
		"\2\2\u00c4\u00c5\5\20\t\2\u00c5\u00c6\7\16\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c3\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\37\3\2\2\2\u00c9\u00ca\t\3\2"+
		"\2\u00ca!\3\2\2\2\u00cb\u00cc\b\22\1\2\u00cc\u00d4\5B\"\2\u00cd\u00ce"+
		"\7\b\2\2\u00ce\u00d4\5\"\22\5\u00cf\u00d0\7\4\2\2\u00d0\u00d1\5\"\22\2"+
		"\u00d1\u00d2\7\5\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00cd"+
		"\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\f\4\2\2\u00d6"+
		"\u00d7\t\4\2\2\u00d7\u00d9\5\"\22\5\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db#\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\u00df\7\30\2\2\u00de\u00e0\7\31\2\2\u00df\u00de\3\2\2\2"+
		"\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3\7\32\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e9\5&\24\2\u00e5"+
		"\u00e6\7\13\2\2\u00e6\u00e8\5&\24\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3"+
		"\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea%\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ef\5\62\32\2\u00ed\u00ee\7\17\2\2\u00ee\u00f0\58\35"+
		"\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00fa\3\2\2\2\u00f1\u00fa"+
		"\58\35\2\u00f2\u00f3\5@!\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5\5&\24\2\u00f5"+
		"\u00f6\7\5\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f8\7\f\2\2\u00f8\u00fa\5\64"+
		"\33\2\u00f9\u00ec\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\'\3\2\2\2\u00fb\u00fc\7\33\2\2\u00fc\u0101\5&\24"+
		"\2\u00fd\u00fe\7\13\2\2\u00fe\u0100\5&\24\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102)\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0104\u0107\7\34\2\2\u0105\u0108\5&\24\2\u0106\u0108"+
		"\5\16\b\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u0118\3\2\2\2"+
		"\u0109\u010a\7\35\2\2\u010a\u010f\58\35\2\u010b\u010c\7\13\2\2\u010c\u010e"+
		"\58\35\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\t\5"+
		"\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0118\3\2\2\2\u0115"+
		"\u0116\7 \2\2\u0116\u0118\7\64\2\2\u0117\u0104\3\2\2\2\u0117\u0109\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118+\3\2\2\2\u0119\u011b\5\22\n\2\u011a\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u0120\5\34\17\2\u011f\u011e\3\2\2\2\u011f\u0120\3"+
		"\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\5$\23\2\u0122\u0124\5*\26\2\u0123"+
		"\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124-\3\2\2\2\u0125\u0126\t\6\2\2"+
		"\u0126\u0128\7#\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012c"+
		"\3\2\2\2\u0129\u012a\5\36\20\2\u012a\u012b\5\60\31\2\u012b\u012d\3\2\2"+
		"\2\u012c\u0129\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\5\36\20\2\u0131\u0133\5$\23\2"+
		"\u0132\u0134\5*\26\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134/\3"+
		"\2\2\2\u0135\u0136\t\7\2\2\u0136\u0137\7\r\2\2\u0137\u0138\5\"\22\2\u0138"+
		"\u0139\7\16\2\2\u0139\61\3\2\2\2\u013a\u013c\7\65\2\2\u013b\u013d\7\64"+
		"\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u0140\5:\36\2\u013f\u013a\3\2\2\2\u013f\u013e\3\2\2\2\u0140\63\3\2\2"+
		"\2\u0141\u0142\7\65\2\2\u0142\65\3\2\2\2\u0143\u0144\7\64\2\2\u0144\67"+
		"\3\2\2\2\u0145\u0146\7\65\2\2\u01469\3\2\2\2\u0147\u014a\7\65\2\2\u0148"+
		"\u0149\7\17\2\2\u0149\u014b\7\65\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3"+
		"\2\2\2\u014b;\3\2\2\2\u014c\u014d\t\b\2\2\u014d=\3\2\2\2\u014e\u014f\t"+
		"\t\2\2\u014f?\3\2\2\2\u0150\u0151\t\n\2\2\u0151A\3\2\2\2\u0152\u0153\t"+
		"\13\2\2\u0153C\3\2\2\2*GLRW`gpu~\u0083\u008a\u0090\u0096\u009e\u00a2\u00b0"+
		"\u00bc\u00c1\u00c7\u00d3\u00da\u00df\u00e2\u00e9\u00ef\u00f9\u0101\u0107"+
		"\u010f\u0113\u0117\u011c\u011f\u0123\u0127\u012e\u0133\u013c\u013f\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}