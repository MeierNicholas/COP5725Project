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
		T__38=39, T__39=40, T__40=41, T__41=42, INT=43, STRING=44, WS=45;
	public static final int
		RULE_aiql = 0, RULE_multievent = 1, RULE_dependency = 2, RULE_anomaly = 3, 
		RULE_global_cstr = 4, RULE_twind = 5, RULE_cstr = 6, RULE_attr_cstr = 7, 
		RULE_evt_patt = 8, RULE_evt = 9, RULE_rel = 10, RULE_attr_rel = 11, RULE_temp_rel = 12, 
		RULE_evt_rel = 13, RULE_entity = 14, RULE_entity_type = 15, RULE_op_exp = 16, 
		RULE_ret = 17, RULE_res = 18, RULE_group_by = 19, RULE_ret_filter = 20, 
		RULE_m_query = 21, RULE_d_query = 22, RULE_op_edge = 23, RULE_a_query = 24, 
		RULE_evt_id = 25, RULE_rename_id = 26, RULE_datetime = 27, RULE_attr = 28, 
		RULE_val = 29, RULE_op = 30, RULE_agg_func = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"aiql", "multievent", "dependency", "anomaly", "global_cstr", "twind", 
			"cstr", "attr_cstr", "evt_patt", "evt", "rel", "attr_rel", "temp_rel", 
			"evt_rel", "entity", "entity_type", "op_exp", "ret", "res", "group_by", 
			"ret_filter", "m_query", "d_query", "op_edge", "a_query", "evt_id", "rename_id", 
			"datetime", "attr", "val", "op", "agg_func"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'from'", "'to'", "'!'", "'not'", "'in'", "','", 
			"'as'", "'['", "']'", "'.'", "'before'", "'after'", "'within'", "'with'", 
			"'proc'", "'conn'", "'&&'", "'||'", "'ret'", "'count'", "'distinct'", 
			"'group by'", "'having'", "'sort by'", "'asc'", "'desc'", "'top'", "'forward'", 
			"'backward'", "':'", "'->'", "'<-'", "'null'", "'<'", "'>'", "'='", "'<='", 
			"'=>'", "'sum'", "'avg'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INT", "STRING", "WS"
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				multievent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				dependency();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
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
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__34) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(69);
				global_cstr();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				m_query();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 || _la==T__17 );
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__34) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(80);
				global_cstr();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(86);
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
		public A_queryContext a_query() {
			return getRuleContext(A_queryContext.class,0);
		}
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__34) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(88);
				global_cstr();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(94);
			a_query();
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
			case T__4:
			case T__34:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				cstr();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__0);
				setState(98);
				twind();
				setState(99);
				match(T__1);
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
			match(T__2);
			setState(104);
			datetime();
			setState(105);
			match(T__3);
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
				if (_la==T__4) {
					{
					setState(109);
					match(T__4);
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
				if (_la==T__5) {
					{
					setState(114);
					match(T__5);
					}
				}

				setState(117);
				match(T__6);
				setState(118);
				match(T__0);
				setState(119);
				val();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(120);
					match(T__7);
					setState(121);
					val();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__1);
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
			setState(131);
			attr();
			setState(132);
			op();
			setState(133);
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
			setState(135);
			entity();
			setState(136);
			op_exp(0);
			setState(137);
			entity();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(138);
				evt();
				}
			}

			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(141);
				match(T__0);
				setState(142);
				twind();
				setState(143);
				match(T__1);
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
			setState(147);
			match(T__8);
			setState(148);
			evt_id();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(149);
				match(T__9);
				setState(150);
				attr_cstr();
				setState(151);
				match(T__10);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				attr_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				evt_id();
				setState(160);
				match(T__11);
				setState(161);
				attr();
				setState(162);
				op();
				setState(163);
				evt_id();
				setState(164);
				match(T__11);
				setState(165);
				attr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				evt_id();
				setState(168);
				op();
				setState(169);
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
			setState(173);
			evt_id();
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(175);
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
			setState(177);
			match(T__15);
			setState(178);
			rel();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(179);
				match(T__7);
				setState(180);
				rel();
				}
				}
				setState(185);
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
			setState(186);
			entity_type();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(187);
				evt_id();
				}
			}

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(190);
				match(T__9);
				setState(191);
				attr_cstr();
				setState(192);
				match(T__10);
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
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
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
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
				{
				setState(199);
				op();
				}
				break;
			case T__4:
				{
				setState(200);
				match(T__4);
				setState(201);
				op_exp(3);
				}
				break;
			case T__0:
				{
				setState(202);
				match(T__0);
				setState(203);
				op_exp(0);
				setState(204);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_expContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_exp);
					setState(208);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(209);
					_la = _input.LA(1);
					if ( !(_la==T__18 || _la==T__19) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(210);
					op_exp(3);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			setState(216);
			match(T__20);
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(217);
				match(T__21);
				}
				break;
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(220);
				match(T__22);
				}
			}

			setState(223);
			res();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(224);
				match(T__7);
				setState(225);
				res();
				}
				}
				setState(230);
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
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				evt_id();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(232);
					match(T__11);
					setState(233);
					attr();
					}
				}

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				attr();
				}
				break;
			case T__21:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				agg_func();
				setState(238);
				match(T__0);
				setState(239);
				res();
				setState(240);
				match(T__1);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(T__8);
				setState(243);
				rename_id();
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
			setState(246);
			match(T__23);
			setState(247);
			res();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(248);
				match(T__7);
				setState(249);
				res();
				}
				}
				setState(254);
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
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(T__24);
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(256);
					res();
					}
					break;
				case 2:
					{
					setState(257);
					cstr();
					}
					break;
				}
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(T__25);
				setState(261);
				attr();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(262);
					match(T__7);
					setState(263);
					attr();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26 || _la==T__27) {
					{
					setState(269);
					_la = _input.LA(1);
					if ( !(_la==T__26 || _la==T__27) ) {
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
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(T__28);
				setState(273);
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
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				evt_patt();
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 || _la==T__17 );
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(281);
				evt_rel();
				}
			}

			setState(284);
			ret();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__28))) != 0)) {
				{
				setState(285);
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
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29 || _la==T__30) {
				{
				setState(288);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				match(T__31);
				}
			}

			setState(295); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(292);
					entity();
					setState(293);
					op_edge();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(297); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(299);
			entity();
			setState(300);
			ret();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__28))) != 0)) {
				{
				setState(301);
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
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__33) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(305);
			match(T__9);
			setState(306);
			op_exp(0);
			setState(307);
			match(T__10);
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

	public static class A_queryContext extends ParserRuleContext {
		public Evt_pattContext evt_patt() {
			return getRuleContext(Evt_pattContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public Evt_relContext evt_rel() {
			return getRuleContext(Evt_relContext.class,0);
		}
		public Ret_filterContext ret_filter() {
			return getRuleContext(Ret_filterContext.class,0);
		}
		public A_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).enterA_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aiqlListener ) ((aiqlListener)listener).exitA_query(this);
		}
	}

	public final A_queryContext a_query() throws RecognitionException {
		A_queryContext _localctx = new A_queryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_a_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			evt_patt();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(310);
				evt_rel();
				}
			}

			setState(313);
			ret();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__28))) != 0)) {
				{
				setState(314);
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

	public static class Evt_idContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(aiqlParser.INT, 0); }
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
		enterRule(_localctx, 50, RULE_evt_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		enterRule(_localctx, 52, RULE_rename_id);
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
		enterRule(_localctx, 54, RULE_datetime);
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
		enterRule(_localctx, 56, RULE_attr);
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
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << INT) | (1L << STRING))) != 0)) ) {
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
			setState(327);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
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
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\5\2F\n\2\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\6\3O\n\3\r\3"+
		"\16\3P\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\7\5\\\n\5\f\5\16\5_\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5"+
		"\bq\n\b\3\b\3\b\3\b\5\bv\n\b\3\b\3\b\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080"+
		"\13\b\3\b\3\b\5\b\u0084\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u008e"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u0094\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u009c\n\13\3\f\3\f\5\f\u00a0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00ae\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17"+
		"\u00b8\n\17\f\17\16\17\u00bb\13\17\3\20\3\20\5\20\u00bf\n\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00c5\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00d1\n\22\3\22\3\22\3\22\7\22\u00d6\n\22\f\22\16\22\u00d9"+
		"\13\22\3\23\3\23\5\23\u00dd\n\23\3\23\5\23\u00e0\n\23\3\23\3\23\3\23\7"+
		"\23\u00e5\n\23\f\23\16\23\u00e8\13\23\3\24\3\24\3\24\5\24\u00ed\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f7\n\24\3\25\3\25\3\25"+
		"\3\25\7\25\u00fd\n\25\f\25\16\25\u0100\13\25\3\26\3\26\3\26\5\26\u0105"+
		"\n\26\3\26\3\26\3\26\3\26\7\26\u010b\n\26\f\26\16\26\u010e\13\26\3\26"+
		"\5\26\u0111\n\26\3\26\3\26\5\26\u0115\n\26\3\27\6\27\u0118\n\27\r\27\16"+
		"\27\u0119\3\27\5\27\u011d\n\27\3\27\3\27\5\27\u0121\n\27\3\30\3\30\5\30"+
		"\u0125\n\30\3\30\3\30\3\30\6\30\u012a\n\30\r\30\16\30\u012b\3\30\3\30"+
		"\3\30\5\30\u0131\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u013a\n"+
		"\32\3\32\3\32\5\32\u013e\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3!\2\3\"\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@\2\13\3\2\17\21\3\2\23\24\3\2\25\26\3\2\35"+
		"\36\3\2 !\3\2#$\4\2%%-.\3\2&*\4\2\30\30+,\2\u0159\2E\3\2\2\2\4J\3\2\2"+
		"\2\6U\3\2\2\2\b]\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16\u0083\3\2\2\2\20\u0085"+
		"\3\2\2\2\22\u0089\3\2\2\2\24\u0095\3\2\2\2\26\u009f\3\2\2\2\30\u00ad\3"+
		"\2\2\2\32\u00af\3\2\2\2\34\u00b3\3\2\2\2\36\u00bc\3\2\2\2 \u00c6\3\2\2"+
		"\2\"\u00d0\3\2\2\2$\u00da\3\2\2\2&\u00f6\3\2\2\2(\u00f8\3\2\2\2*\u0114"+
		"\3\2\2\2,\u0117\3\2\2\2.\u0124\3\2\2\2\60\u0132\3\2\2\2\62\u0137\3\2\2"+
		"\2\64\u013f\3\2\2\2\66\u0141\3\2\2\28\u0143\3\2\2\2:\u0145\3\2\2\2<\u0147"+
		"\3\2\2\2>\u0149\3\2\2\2@\u014b\3\2\2\2BF\5\4\3\2CF\5\6\4\2DF\5\b\5\2E"+
		"B\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\3\3\2\2\2GI\5\n\6\2HG\3\2\2\2IL\3\2\2\2"+
		"JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MO\5,\27\2NM\3\2\2\2OP\3\2\2\2"+
		"PN\3\2\2\2PQ\3\2\2\2Q\5\3\2\2\2RT\5\n\6\2SR\3\2\2\2TW\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\5.\30\2Y\7\3\2\2\2Z\\\5\n\6\2[Z\3\2"+
		"\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\5\62\32\2a\t"+
		"\3\2\2\2bh\5\16\b\2cd\7\3\2\2de\5\f\7\2ef\7\4\2\2fh\3\2\2\2gb\3\2\2\2"+
		"gc\3\2\2\2h\13\3\2\2\2ij\7\5\2\2jk\58\35\2kl\7\6\2\2lm\58\35\2m\r\3\2"+
		"\2\2n\u0084\5\20\t\2oq\7\7\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2r\u0084\5"+
		"<\37\2su\5:\36\2tv\7\b\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\t\2\2xy\7"+
		"\3\2\2y~\5<\37\2z{\7\n\2\2{}\5<\37\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\4\2\2\u0082"+
		"\u0084\3\2\2\2\u0083n\3\2\2\2\u0083p\3\2\2\2\u0083s\3\2\2\2\u0084\17\3"+
		"\2\2\2\u0085\u0086\5:\36\2\u0086\u0087\5> \2\u0087\u0088\5<\37\2\u0088"+
		"\21\3\2\2\2\u0089\u008a\5\36\20\2\u008a\u008b\5\"\22\2\u008b\u008d\5\36"+
		"\20\2\u008c\u008e\5\24\13\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0093\3\2\2\2\u008f\u0090\7\3\2\2\u0090\u0091\5\f\7\2\u0091\u0092\7\4"+
		"\2\2\u0092\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\23\3\2\2\2\u0095\u0096\7\13\2\2\u0096\u009b\5\64\33\2\u0097\u0098\7\f"+
		"\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7\r\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009b\u009c\3\2\2\2\u009c\25\3\2\2\2\u009d\u00a0\5\30\r"+
		"\2\u009e\u00a0\5\32\16\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\27\3\2\2\2\u00a1\u00a2\5\64\33\2\u00a2\u00a3\7\16\2\2\u00a3\u00a4\5:"+
		"\36\2\u00a4\u00a5\5> \2\u00a5\u00a6\5\64\33\2\u00a6\u00a7\7\16\2\2\u00a7"+
		"\u00a8\5:\36\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\5\64\33\2\u00aa\u00ab\5"+
		"> \2\u00ab\u00ac\5\64\33\2\u00ac\u00ae\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ad"+
		"\u00a9\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0\5\64\33\2\u00b0\u00b1\t\2"+
		"\2\2\u00b1\u00b2\5\64\33\2\u00b2\33\3\2\2\2\u00b3\u00b4\7\22\2\2\u00b4"+
		"\u00b9\5\26\f\2\u00b5\u00b6\7\n\2\2\u00b6\u00b8\5\26\f\2\u00b7\u00b5\3"+
		"\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\35\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\5 \21\2\u00bd\u00bf\5\64\33"+
		"\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00c1"+
		"\7\f\2\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\7\r\2\2\u00c3\u00c5\3\2\2\2"+
		"\u00c4\u00c0\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\37\3\2\2\2\u00c6\u00c7"+
		"\t\3\2\2\u00c7!\3\2\2\2\u00c8\u00c9\b\22\1\2\u00c9\u00d1\5> \2\u00ca\u00cb"+
		"\7\7\2\2\u00cb\u00d1\5\"\22\5\u00cc\u00cd\7\3\2\2\u00cd\u00ce\5\"\22\2"+
		"\u00ce\u00cf\7\4\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00ca"+
		"\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\u00d7\3\2\2\2\u00d2\u00d3\f\4\2\2\u00d3"+
		"\u00d4\t\4\2\2\u00d4\u00d6\5\"\22\5\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8#\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00dc\7\27\2\2\u00db\u00dd\7\30\2\2\u00dc\u00db\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\7\31\2\2\u00df\u00de"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e6\5&\24\2\u00e2"+
		"\u00e3\7\n\2\2\u00e3\u00e5\5&\24\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7%\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ec\5\64\33\2\u00ea\u00eb\7\16\2\2\u00eb\u00ed\5:\36"+
		"\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f7\3\2\2\2\u00ee\u00f7"+
		"\5:\36\2\u00ef\u00f0\5@!\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2\5&\24\2\u00f2"+
		"\u00f3\7\4\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f5\7\13\2\2\u00f5\u00f7\5"+
		"\66\34\2\u00f6\u00e9\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\'\3\2\2\2\u00f8\u00f9\7\32\2\2\u00f9\u00fe\5&\24"+
		"\2\u00fa\u00fb\7\n\2\2\u00fb\u00fd\5&\24\2\u00fc\u00fa\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff)\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0104\7\33\2\2\u0102\u0105\5&\24\2\u0103\u0105\5"+
		"\16\b\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0115\3\2\2\2\u0106"+
		"\u0107\7\34\2\2\u0107\u010c\5:\36\2\u0108\u0109\7\n\2\2\u0109\u010b\5"+
		":\36\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\t\5"+
		"\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0115\3\2\2\2\u0112"+
		"\u0113\7\37\2\2\u0113\u0115\7-\2\2\u0114\u0101\3\2\2\2\u0114\u0106\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0115+\3\2\2\2\u0116\u0118\5\22\n\2\u0117\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011c\3\2\2\2\u011b\u011d\5\34\17\2\u011c\u011b\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\5$\23\2\u011f\u0121\5*\26\2\u0120"+
		"\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121-\3\2\2\2\u0122\u0123\t\6\2\2"+
		"\u0123\u0125\7\"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0129"+
		"\3\2\2\2\u0126\u0127\5\36\20\2\u0127\u0128\5\60\31\2\u0128\u012a\3\2\2"+
		"\2\u0129\u0126\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\5\36\20\2\u012e\u0130\5$\23\2"+
		"\u012f\u0131\5*\26\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131/\3"+
		"\2\2\2\u0132\u0133\t\7\2\2\u0133\u0134\7\f\2\2\u0134\u0135\5\"\22\2\u0135"+
		"\u0136\7\r\2\2\u0136\61\3\2\2\2\u0137\u0139\5\22\n\2\u0138\u013a\5\34"+
		"\17\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\5$\23\2\u013c\u013e\5*\26\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\63\3\2\2\2\u013f\u0140\7-\2\2\u0140\65\3\2\2\2\u0141\u0142"+
		"\7.\2\2\u0142\67\3\2\2\2\u0143\u0144\7-\2\2\u01449\3\2\2\2\u0145\u0146"+
		"\7.\2\2\u0146;\3\2\2\2\u0147\u0148\t\b\2\2\u0148=\3\2\2\2\u0149\u014a"+
		"\t\t\2\2\u014a?\3\2\2\2\u014b\u014c\t\n\2\2\u014cA\3\2\2\2(EJPU]gpu~\u0083"+
		"\u008d\u0093\u009b\u009f\u00ad\u00b9\u00be\u00c4\u00d0\u00d7\u00dc\u00df"+
		"\u00e6\u00ec\u00f6\u00fe\u0104\u010c\u0110\u0114\u0119\u011c\u0120\u0124"+
		"\u012b\u0130\u0139\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}