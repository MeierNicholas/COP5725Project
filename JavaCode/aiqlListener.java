// Generated from aiql.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link aiqlParser}.
 */
public interface aiqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link aiqlParser#aiql}.
	 * @param ctx the parse tree
	 */
	void enterAiql(aiqlParser.AiqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#aiql}.
	 * @param ctx the parse tree
	 */
	void exitAiql(aiqlParser.AiqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#multievent}.
	 * @param ctx the parse tree
	 */
	void enterMultievent(aiqlParser.MultieventContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#multievent}.
	 * @param ctx the parse tree
	 */
	void exitMultievent(aiqlParser.MultieventContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#dependency}.
	 * @param ctx the parse tree
	 */
	void enterDependency(aiqlParser.DependencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#dependency}.
	 * @param ctx the parse tree
	 */
	void exitDependency(aiqlParser.DependencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#anomaly}.
	 * @param ctx the parse tree
	 */
	void enterAnomaly(aiqlParser.AnomalyContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#anomaly}.
	 * @param ctx the parse tree
	 */
	void exitAnomaly(aiqlParser.AnomalyContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#global_cstr}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_cstr(aiqlParser.Global_cstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#global_cstr}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_cstr(aiqlParser.Global_cstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#twind}.
	 * @param ctx the parse tree
	 */
	void enterTwind(aiqlParser.TwindContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#twind}.
	 * @param ctx the parse tree
	 */
	void exitTwind(aiqlParser.TwindContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#cstr}.
	 * @param ctx the parse tree
	 */
	void enterCstr(aiqlParser.CstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#cstr}.
	 * @param ctx the parse tree
	 */
	void exitCstr(aiqlParser.CstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#attr_cstr}.
	 * @param ctx the parse tree
	 */
	void enterAttr_cstr(aiqlParser.Attr_cstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#attr_cstr}.
	 * @param ctx the parse tree
	 */
	void exitAttr_cstr(aiqlParser.Attr_cstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#evt_patt}.
	 * @param ctx the parse tree
	 */
	void enterEvt_patt(aiqlParser.Evt_pattContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#evt_patt}.
	 * @param ctx the parse tree
	 */
	void exitEvt_patt(aiqlParser.Evt_pattContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(aiqlParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(aiqlParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#attr_rel}.
	 * @param ctx the parse tree
	 */
	void enterAttr_rel(aiqlParser.Attr_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#attr_rel}.
	 * @param ctx the parse tree
	 */
	void exitAttr_rel(aiqlParser.Attr_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#temp_rel}.
	 * @param ctx the parse tree
	 */
	void enterTemp_rel(aiqlParser.Temp_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#temp_rel}.
	 * @param ctx the parse tree
	 */
	void exitTemp_rel(aiqlParser.Temp_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#evt_rel}.
	 * @param ctx the parse tree
	 */
	void enterEvt_rel(aiqlParser.Evt_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#evt_rel}.
	 * @param ctx the parse tree
	 */
	void exitEvt_rel(aiqlParser.Evt_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#evt}.
	 * @param ctx the parse tree
	 */
	void enterEvt(aiqlParser.EvtContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#evt}.
	 * @param ctx the parse tree
	 */
	void exitEvt(aiqlParser.EvtContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(aiqlParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(aiqlParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#entity_type}.
	 * @param ctx the parse tree
	 */
	void enterEntity_type(aiqlParser.Entity_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#entity_type}.
	 * @param ctx the parse tree
	 */
	void exitEntity_type(aiqlParser.Entity_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#op_exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_exp(aiqlParser.Op_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#op_exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_exp(aiqlParser.Op_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(aiqlParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(aiqlParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#res}.
	 * @param ctx the parse tree
	 */
	void enterRes(aiqlParser.ResContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#res}.
	 * @param ctx the parse tree
	 */
	void exitRes(aiqlParser.ResContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#m_query}.
	 * @param ctx the parse tree
	 */
	void enterM_query(aiqlParser.M_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#m_query}.
	 * @param ctx the parse tree
	 */
	void exitM_query(aiqlParser.M_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#d_query}.
	 * @param ctx the parse tree
	 */
	void enterD_query(aiqlParser.D_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#d_query}.
	 * @param ctx the parse tree
	 */
	void exitD_query(aiqlParser.D_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#op_edge}.
	 * @param ctx the parse tree
	 */
	void enterOp_edge(aiqlParser.Op_edgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#op_edge}.
	 * @param ctx the parse tree
	 */
	void exitOp_edge(aiqlParser.Op_edgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#evt_id}.
	 * @param ctx the parse tree
	 */
	void enterEvt_id(aiqlParser.Evt_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#evt_id}.
	 * @param ctx the parse tree
	 */
	void exitEvt_id(aiqlParser.Evt_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#datetime}.
	 * @param ctx the parse tree
	 */
	void enterDatetime(aiqlParser.DatetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#datetime}.
	 * @param ctx the parse tree
	 */
	void exitDatetime(aiqlParser.DatetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(aiqlParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(aiqlParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(aiqlParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(aiqlParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(aiqlParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(aiqlParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(aiqlParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(aiqlParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#agg_func}.
	 * @param ctx the parse tree
	 */
	void enterAgg_func(aiqlParser.Agg_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#agg_func}.
	 * @param ctx the parse tree
	 */
	void exitAgg_func(aiqlParser.Agg_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link aiqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(aiqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link aiqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(aiqlParser.KeywordContext ctx);
}