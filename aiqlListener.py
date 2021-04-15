# Generated from aiql.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .aiqlParser import aiqlParser
else:
    from aiqlParser import aiqlParser

# This class defines a complete listener for a parse tree produced by aiqlParser.
class aiqlListener(ParseTreeListener):

    # Enter a parse tree produced by aiqlParser#aiql.
    def enterAiql(self, ctx:aiqlParser.AiqlContext):
        pass

    # Exit a parse tree produced by aiqlParser#aiql.
    def exitAiql(self, ctx:aiqlParser.AiqlContext):
        pass


    # Enter a parse tree produced by aiqlParser#multievent.
    def enterMultievent(self, ctx:aiqlParser.MultieventContext):
        pass

    # Exit a parse tree produced by aiqlParser#multievent.
    def exitMultievent(self, ctx:aiqlParser.MultieventContext):
        pass


    # Enter a parse tree produced by aiqlParser#dependency.
    def enterDependency(self, ctx:aiqlParser.DependencyContext):
        pass

    # Exit a parse tree produced by aiqlParser#dependency.
    def exitDependency(self, ctx:aiqlParser.DependencyContext):
        pass


    # Enter a parse tree produced by aiqlParser#anomaly.
    def enterAnomaly(self, ctx:aiqlParser.AnomalyContext):
        pass

    # Exit a parse tree produced by aiqlParser#anomaly.
    def exitAnomaly(self, ctx:aiqlParser.AnomalyContext):
        pass


    # Enter a parse tree produced by aiqlParser#global_cstr.
    def enterGlobal_cstr(self, ctx:aiqlParser.Global_cstrContext):
        pass

    # Exit a parse tree produced by aiqlParser#global_cstr.
    def exitGlobal_cstr(self, ctx:aiqlParser.Global_cstrContext):
        pass


    # Enter a parse tree produced by aiqlParser#twind.
    def enterTwind(self, ctx:aiqlParser.TwindContext):
        pass

    # Exit a parse tree produced by aiqlParser#twind.
    def exitTwind(self, ctx:aiqlParser.TwindContext):
        pass


    # Enter a parse tree produced by aiqlParser#cstr.
    def enterCstr(self, ctx:aiqlParser.CstrContext):
        pass

    # Exit a parse tree produced by aiqlParser#cstr.
    def exitCstr(self, ctx:aiqlParser.CstrContext):
        pass


    # Enter a parse tree produced by aiqlParser#attr_cstr.
    def enterAttr_cstr(self, ctx:aiqlParser.Attr_cstrContext):
        pass

    # Exit a parse tree produced by aiqlParser#attr_cstr.
    def exitAttr_cstr(self, ctx:aiqlParser.Attr_cstrContext):
        pass


    # Enter a parse tree produced by aiqlParser#evt_patt.
    def enterEvt_patt(self, ctx:aiqlParser.Evt_pattContext):
        pass

    # Exit a parse tree produced by aiqlParser#evt_patt.
    def exitEvt_patt(self, ctx:aiqlParser.Evt_pattContext):
        pass


    # Enter a parse tree produced by aiqlParser#rel.
    def enterRel(self, ctx:aiqlParser.RelContext):
        pass

    # Exit a parse tree produced by aiqlParser#rel.
    def exitRel(self, ctx:aiqlParser.RelContext):
        pass


    # Enter a parse tree produced by aiqlParser#attr_rel.
    def enterAttr_rel(self, ctx:aiqlParser.Attr_relContext):
        pass

    # Exit a parse tree produced by aiqlParser#attr_rel.
    def exitAttr_rel(self, ctx:aiqlParser.Attr_relContext):
        pass


    # Enter a parse tree produced by aiqlParser#temp_rel.
    def enterTemp_rel(self, ctx:aiqlParser.Temp_relContext):
        pass

    # Exit a parse tree produced by aiqlParser#temp_rel.
    def exitTemp_rel(self, ctx:aiqlParser.Temp_relContext):
        pass


    # Enter a parse tree produced by aiqlParser#evt_rel.
    def enterEvt_rel(self, ctx:aiqlParser.Evt_relContext):
        pass

    # Exit a parse tree produced by aiqlParser#evt_rel.
    def exitEvt_rel(self, ctx:aiqlParser.Evt_relContext):
        pass


    # Enter a parse tree produced by aiqlParser#evt.
    def enterEvt(self, ctx:aiqlParser.EvtContext):
        pass

    # Exit a parse tree produced by aiqlParser#evt.
    def exitEvt(self, ctx:aiqlParser.EvtContext):
        pass


    # Enter a parse tree produced by aiqlParser#entity.
    def enterEntity(self, ctx:aiqlParser.EntityContext):
        pass

    # Exit a parse tree produced by aiqlParser#entity.
    def exitEntity(self, ctx:aiqlParser.EntityContext):
        pass


    # Enter a parse tree produced by aiqlParser#entity_type.
    def enterEntity_type(self, ctx:aiqlParser.Entity_typeContext):
        pass

    # Exit a parse tree produced by aiqlParser#entity_type.
    def exitEntity_type(self, ctx:aiqlParser.Entity_typeContext):
        pass


    # Enter a parse tree produced by aiqlParser#op_exp.
    def enterOp_exp(self, ctx:aiqlParser.Op_expContext):
        pass

    # Exit a parse tree produced by aiqlParser#op_exp.
    def exitOp_exp(self, ctx:aiqlParser.Op_expContext):
        pass


    # Enter a parse tree produced by aiqlParser#ret.
    def enterRet(self, ctx:aiqlParser.RetContext):
        pass

    # Exit a parse tree produced by aiqlParser#ret.
    def exitRet(self, ctx:aiqlParser.RetContext):
        pass


    # Enter a parse tree produced by aiqlParser#res.
    def enterRes(self, ctx:aiqlParser.ResContext):
        pass

    # Exit a parse tree produced by aiqlParser#res.
    def exitRes(self, ctx:aiqlParser.ResContext):
        pass


    # Enter a parse tree produced by aiqlParser#m_query.
    def enterM_query(self, ctx:aiqlParser.M_queryContext):
        pass

    # Exit a parse tree produced by aiqlParser#m_query.
    def exitM_query(self, ctx:aiqlParser.M_queryContext):
        pass


    # Enter a parse tree produced by aiqlParser#d_query.
    def enterD_query(self, ctx:aiqlParser.D_queryContext):
        pass

    # Exit a parse tree produced by aiqlParser#d_query.
    def exitD_query(self, ctx:aiqlParser.D_queryContext):
        pass


    # Enter a parse tree produced by aiqlParser#op_edge.
    def enterOp_edge(self, ctx:aiqlParser.Op_edgeContext):
        pass

    # Exit a parse tree produced by aiqlParser#op_edge.
    def exitOp_edge(self, ctx:aiqlParser.Op_edgeContext):
        pass


    # Enter a parse tree produced by aiqlParser#evt_id.
    def enterEvt_id(self, ctx:aiqlParser.Evt_idContext):
        pass

    # Exit a parse tree produced by aiqlParser#evt_id.
    def exitEvt_id(self, ctx:aiqlParser.Evt_idContext):
        pass


    # Enter a parse tree produced by aiqlParser#datetime.
    def enterDatetime(self, ctx:aiqlParser.DatetimeContext):
        pass

    # Exit a parse tree produced by aiqlParser#datetime.
    def exitDatetime(self, ctx:aiqlParser.DatetimeContext):
        pass


    # Enter a parse tree produced by aiqlParser#attr.
    def enterAttr(self, ctx:aiqlParser.AttrContext):
        pass

    # Exit a parse tree produced by aiqlParser#attr.
    def exitAttr(self, ctx:aiqlParser.AttrContext):
        pass


    # Enter a parse tree produced by aiqlParser#filename.
    def enterFilename(self, ctx:aiqlParser.FilenameContext):
        pass

    # Exit a parse tree produced by aiqlParser#filename.
    def exitFilename(self, ctx:aiqlParser.FilenameContext):
        pass


    # Enter a parse tree produced by aiqlParser#val.
    def enterVal(self, ctx:aiqlParser.ValContext):
        pass

    # Exit a parse tree produced by aiqlParser#val.
    def exitVal(self, ctx:aiqlParser.ValContext):
        pass


    # Enter a parse tree produced by aiqlParser#op.
    def enterOp(self, ctx:aiqlParser.OpContext):
        pass

    # Exit a parse tree produced by aiqlParser#op.
    def exitOp(self, ctx:aiqlParser.OpContext):
        pass


    # Enter a parse tree produced by aiqlParser#agg_func.
    def enterAgg_func(self, ctx:aiqlParser.Agg_funcContext):
        pass

    # Exit a parse tree produced by aiqlParser#agg_func.
    def exitAgg_func(self, ctx:aiqlParser.Agg_funcContext):
        pass


    # Enter a parse tree produced by aiqlParser#keyword.
    def enterKeyword(self, ctx:aiqlParser.KeywordContext):
        pass

    # Exit a parse tree produced by aiqlParser#keyword.
    def exitKeyword(self, ctx:aiqlParser.KeywordContext):
        pass



del aiqlParser