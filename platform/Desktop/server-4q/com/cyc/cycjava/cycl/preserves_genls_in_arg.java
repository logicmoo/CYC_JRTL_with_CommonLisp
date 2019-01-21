package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class preserves_genls_in_arg extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.preserves_genls_in_arg";
    public static final String myFingerPrint = "f1652732e5ae4c3b2bb0bd8c461faf6b590c7dc63e2069125a0b8047ea3db2d1";
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 613L)
    private static SubLSymbol $pgia_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1518L)
    private static SubLSymbol $pgia_gaf$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1556L)
    private static SubLSymbol $pgia_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1594L)
    private static SubLSymbol $pgia_done$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1633L)
    private static SubLSymbol $pgia_nat$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1671L)
    private static SubLSymbol $pgia_nat_fort$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1714L)
    private static SubLSymbol $pgia_col$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1752L)
    private static SubLSymbol $pgia_genl$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1791L)
    private static SubLSymbol $pgia_genl_nat$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1834L)
    private static SubLSymbol $pgia_genl_nats$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1878L)
    private static SubLSymbol $pgia_spec$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1917L)
    private static SubLSymbol $pgia_spec_nat$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 1960L)
    private static SubLSymbol $pgia_spec_nats$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2004L)
    private static SubLSymbol $candidate_pgia_genls$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2054L)
    private static SubLSymbol $candidate_pgia_specs$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2104L)
    private static SubLSymbol $consider_current_pgiaP$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2156L)
    private static SubLSymbol $current_pgia_genls$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2204L)
    private static SubLSymbol $current_pgia_specs$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2252L)
    public static SubLSymbol $pgia_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2290L)
    private static SubLSymbol $pgia_rule$;
    private static final SubLSymbol $sym0$_PGIA_MT_;
    private static final SubLObject $const1$BaseKB;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym4$PGIA_AFTER_ADDING_PGIA_1;
    private static final SubLSymbol $sym5$PGIA_AFTER_ADDING_PGIA;
    private static final SubLSymbol $sym6$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const7$EverythingPSC;
    private static final SubLSymbol $sym8$PGIA_AFTER_ADDING_PGIA_2;
    private static final SubLSymbol $sym9$SBHL_UNRECORDED_NODE_P;
    private static final SubLSymbol $sym10$PGIA_AFTER_ADDING_PGIA_3;
    private static final SubLObject $const11$genls;
    private static final SubLSymbol $sym12$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $sym13$NOT_EQ;
    private static final SubLObject $const14$isa;
    private static final SubLObject $const15$Collection;
    private static final SubLSymbol $sym16$PGIA_AFTER_ADDING_ISA_1;
    private static final SubLObject $const17$preservesGenlsInArg;
    private static final SubLSymbol $kw18$TRUE;
    private static final SubLSymbol $sym19$PGIA_AFTER_ADDING_ISA;
    private static final SubLSymbol $sym20$PGIA_AFTER_ADDING_ISA_2;
    private static final SubLSymbol $sym21$PGIA_AFTER_REMOVING_GENLS_1;
    private static final SubLSymbol $sym22$PGIA_AFTER_REMOVING_GENLS;
    private static final SubLSymbol $kw23$GENLS;
    private static final SubLString $str24$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str25$attempting_to_bind_direction_link;
    private static final SubLSymbol $kw26$SPECS;
    private static final SubLSymbol $sym27$RECOMPUTE_FUNCTOR_PGIA_1;
    private static final SubLSymbol $sym28$RECOMPUTE_NAT_PGIA_1;
    private static final SubLSymbol $sym29$GATHER_PGIA;
    private static final SubLSymbol $kw30$CODE;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$DEFAULT;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLList $list40;
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 2651L)
    public static SubLObject pgia_after_adding_pgia(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != control_vars.$pgia_activeP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
            try {
                sbhl_link_vars.$added_source$.bind(argument, thread);
                if (preserves_genls_in_arg.NIL != assertion_utilities.true_assertionP(assertion)) {
                    final SubLObject pgia_mt = assertions_high.assertion_mt(assertion);
                    final SubLObject _prev_bind_0_$1 = preserves_genls_in_arg.$pgia_fn$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = preserves_genls_in_arg.$pgia_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = preserves_genls_in_arg.$pgia_gaf$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        preserves_genls_in_arg.$pgia_fn$.bind(assertions_high.gaf_arg1(assertion), thread);
                        preserves_genls_in_arg.$pgia_arg$.bind(assertions_high.gaf_arg2(assertion), thread);
                        preserves_genls_in_arg.$pgia_gaf$.bind(assertion, thread);
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym3$RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(pgia_mt, thread);
                        if (arity.arity(preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread)).numGE(preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread)) || preserves_genls_in_arg.NIL != arity.variable_arityP(preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread))) {
                            kb_mapping.map_function_extent_index(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym4$PGIA_AFTER_ADDING_PGIA_1), preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                        preserves_genls_in_arg.$pgia_gaf$.rebind(_prev_bind_3, thread);
                        preserves_genls_in_arg.$pgia_arg$.rebind(_prev_bind_2, thread);
                        preserves_genls_in_arg.$pgia_fn$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            }
            finally {
                sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 3257L)
    public static SubLObject pgia_after_adding_pgia_1(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != function_terms.tou_assertionP(assertion)) {
            final SubLObject _prev_bind_0 = preserves_genls_in_arg.$pgia_nat_fort$.currentBinding(thread);
            final SubLObject _prev_bind_2 = preserves_genls_in_arg.$pgia_nat$.currentBinding(thread);
            final SubLObject _prev_bind_3 = preserves_genls_in_arg.$pgia_col$.currentBinding(thread);
            final SubLObject _prev_bind_4 = preserves_genls_in_arg.$current_pgia_genls$.currentBinding(thread);
            final SubLObject _prev_bind_5 = preserves_genls_in_arg.$candidate_pgia_genls$.currentBinding(thread);
            try {
                preserves_genls_in_arg.$pgia_nat_fort$.bind(assertions_high.gaf_arg1(assertion), thread);
                preserves_genls_in_arg.$pgia_nat$.bind(assertions_high.gaf_arg2(assertion), thread);
                preserves_genls_in_arg.$pgia_col$.bind(cycl_utilities.nat_arg(preserves_genls_in_arg.$pgia_nat$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED), thread);
                preserves_genls_in_arg.$current_pgia_genls$.bind(current_pgia_genls(preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread)), thread);
                preserves_genls_in_arg.$candidate_pgia_genls$.bind((SubLObject)preserves_genls_in_arg.NIL, thread);
                if (preserves_genls_in_arg.NIL != preserves_genls_in_arg.$pgia_col$.getDynamicValue(thread)) {
                    final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind(preserves_genls_in_arg.$const7$EverythingPSC, thread);
                                genls.map_all_genls_if(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym8$PGIA_AFTER_ADDING_PGIA_2), (SubLObject)preserves_genls_in_arg.$sym9$SBHL_UNRECORDED_NODE_P, preserves_genls_in_arg.$pgia_col$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                            }
                            finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$4, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)preserves_genls_in_arg.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$2, thread);
                    }
                    assert_candidate_pgia_genls();
                }
            }
            finally {
                preserves_genls_in_arg.$candidate_pgia_genls$.rebind(_prev_bind_5, thread);
                preserves_genls_in_arg.$current_pgia_genls$.rebind(_prev_bind_4, thread);
                preserves_genls_in_arg.$pgia_col$.rebind(_prev_bind_3, thread);
                preserves_genls_in_arg.$pgia_nat$.rebind(_prev_bind_2, thread);
                preserves_genls_in_arg.$pgia_nat_fort$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 3941L)
    public static SubLObject pgia_after_adding_pgia_2(final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!preserves_genls_in_arg.$pgia_col$.getDynamicValue(thread).eql(genl)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym3$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                map_tous_of_fn_arg(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym10$PGIA_AFTER_ADDING_PGIA_3), genl, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread));
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 4189L)
    public static SubLObject pgia_after_adding_pgia_3(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != assertion_handles.assertion_p(assertion) && preserves_genls_in_arg.NIL != function_terms.tou_assertionP(assertion) && !preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread).eql(assertions_high.gaf_arg1(assertion))) {
            final SubLObject genl_nat_fort = assertions_high.gaf_arg1(assertion);
            final SubLObject genl_col = cycl_utilities.nat_arg(genl_nat_fort, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
            final SubLObject gaf = (SubLObject)ConsesLow.list(preserves_genls_in_arg.$const11$genls, preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), genl_nat_fort);
            if (preserves_genls_in_arg.NIL != genl_col) {
                SubLObject cdolist_list_var = pgia_true_in_mts(preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), genl_nat_fort, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread));
                SubLObject mt = (SubLObject)preserves_genls_in_arg.NIL;
                mt = cdolist_list_var.first();
                while (preserves_genls_in_arg.NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym12$RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        if (preserves_genls_in_arg.NIL == genls.genlsP(preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), genl_nat_fort, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                            preserves_genls_in_arg.$candidate_pgia_genls$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(gaf, genl_col, mt), preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread)), thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mt = cdolist_list_var.first();
                }
            }
            sbhl_marking_methods.sbhl_record_proper_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls), genl_col, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 5184L)
    public static SubLObject pgia_after_adding_isa(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != control_vars.$pgia_activeP$.getDynamicValue(thread) && preserves_genls_in_arg.NIL == subl_promotions.memberP(argument, assertions_high.assertion_arguments(assertion), (SubLObject)preserves_genls_in_arg.$sym13$NOT_EQ, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
            try {
                sbhl_link_vars.$added_source$.bind(argument, thread);
                if (preserves_genls_in_arg.NIL != assertion_utilities.true_assertionP(assertion)) {
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject nat_fort = assertions_high.gaf_arg1(assertion);
                    final SubLObject col_type = assertions_high.gaf_arg2(assertion);
                    final SubLObject nat = function_terms.term_of_unit(nat_fort);
                    SubLObject redundantP = sbhl_links.any_sbhl_links_p(nat_fort, preserves_genls_in_arg.$const14$isa);
                    if (preserves_genls_in_arg.NIL == redundantP) {
                        final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(preserves_genls_in_arg.$const7$EverythingPSC, thread);
                            redundantP = subl_promotions.memberP(col_type, isa.isa(nat_fort, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED), (SubLObject)preserves_genls_in_arg.$sym13$NOT_EQ, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$6, thread);
                        }
                        if (preserves_genls_in_arg.NIL == redundantP && preserves_genls_in_arg.NIL != nat && preserves_genls_in_arg.NIL != genls.genlsP(col_type, preserves_genls_in_arg.$const15$Collection, mt, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                            final SubLObject _prev_bind_0_$7 = preserves_genls_in_arg.$pgia_fn$.currentBinding(thread);
                            _prev_bind_2 = preserves_genls_in_arg.$pgia_nat_fort$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = preserves_genls_in_arg.$pgia_nat$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                preserves_genls_in_arg.$pgia_fn$.bind(cycl_utilities.nat_functor(nat), thread);
                                preserves_genls_in_arg.$pgia_nat_fort$.bind(nat_fort, thread);
                                preserves_genls_in_arg.$pgia_nat$.bind(nat, thread);
                                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind(preserves_genls_in_arg.$const7$EverythingPSC, thread);
                                kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym16$PGIA_AFTER_ADDING_ISA_1), preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.ONE_INTEGER, preserves_genls_in_arg.$const17$preservesGenlsInArg, (SubLObject)preserves_genls_in_arg.$kw18$TRUE, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                            }
                            finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                                preserves_genls_in_arg.$pgia_nat$.rebind(_prev_bind_3, thread);
                                preserves_genls_in_arg.$pgia_nat_fort$.rebind(_prev_bind_2, thread);
                                preserves_genls_in_arg.$pgia_fn$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                    }
                }
            }
            finally {
                sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 6183L)
    public static SubLObject pgia_after_adding_isa_1(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject _prev_bind_0 = preserves_genls_in_arg.$pgia_arg$.currentBinding(thread);
            try {
                preserves_genls_in_arg.$pgia_arg$.bind(assertions_high.gaf_arg2(assertion), thread);
                if (preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread).isInteger()) {
                    final SubLObject _prev_bind_0_$8 = preserves_genls_in_arg.$pgia_col$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = preserves_genls_in_arg.$pgia_gaf$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = preserves_genls_in_arg.$candidate_pgia_genls$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = preserves_genls_in_arg.$candidate_pgia_specs$.currentBinding(thread);
                    try {
                        preserves_genls_in_arg.$pgia_col$.bind(cycl_utilities.nat_arg(preserves_genls_in_arg.$pgia_nat$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED), thread);
                        preserves_genls_in_arg.$pgia_gaf$.bind(assertion, thread);
                        preserves_genls_in_arg.$candidate_pgia_genls$.bind((SubLObject)preserves_genls_in_arg.NIL, thread);
                        preserves_genls_in_arg.$candidate_pgia_specs$.bind((SubLObject)preserves_genls_in_arg.NIL, thread);
                        if (preserves_genls_in_arg.NIL != fort_types_interface.collectionP(preserves_genls_in_arg.$pgia_col$.getDynamicValue(thread))) {
                            kb_mapping.map_function_extent_index(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym20$PGIA_AFTER_ADDING_ISA_2), preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread));
                        }
                        assert_candidate_pgia_genls();
                        assert_candidate_pgia_specs();
                    }
                    finally {
                        preserves_genls_in_arg.$candidate_pgia_specs$.rebind(_prev_bind_4, thread);
                        preserves_genls_in_arg.$candidate_pgia_genls$.rebind(_prev_bind_3, thread);
                        preserves_genls_in_arg.$pgia_gaf$.rebind(_prev_bind_2, thread);
                        preserves_genls_in_arg.$pgia_col$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            }
            finally {
                preserves_genls_in_arg.$pgia_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 6723L)
    public static SubLObject pgia_after_adding_isa_2(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != function_terms.tou_assertionP(assertion)) {
            final SubLObject nat_constant_2 = assertions_high.gaf_arg1(assertion);
            final SubLObject nat_2 = assertions_high.gaf_arg2(assertion);
            final SubLObject col_2 = cycl_utilities.nat_arg(nat_2, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
            if (!preserves_genls_in_arg.$pgia_col$.getDynamicValue(thread).eql(col_2)) {
                if (preserves_genls_in_arg.NIL != genls.genlP(preserves_genls_in_arg.$pgia_col$.getDynamicValue(thread), col_2, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                    SubLObject cdolist_list_var = pgia_true_in_mts(preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), nat_constant_2, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread));
                    SubLObject mt = (SubLObject)preserves_genls_in_arg.NIL;
                    mt = cdolist_list_var.first();
                    while (preserves_genls_in_arg.NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym12$RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            if (preserves_genls_in_arg.NIL == genls.genlP(preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), nat_constant_2, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                                preserves_genls_in_arg.$candidate_pgia_genls$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(preserves_genls_in_arg.$const11$genls, preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), nat_constant_2), col_2, mt), preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread)), thread);
                            }
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mt = cdolist_list_var.first();
                    }
                }
                if (preserves_genls_in_arg.NIL != genls.genlP(col_2, preserves_genls_in_arg.$pgia_col$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                    SubLObject cdolist_list_var = pgia_true_in_mts(nat_constant_2, preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread));
                    SubLObject mt = (SubLObject)preserves_genls_in_arg.NIL;
                    mt = cdolist_list_var.first();
                    while (preserves_genls_in_arg.NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym12$RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            if (preserves_genls_in_arg.NIL == genls.genlsP(nat_constant_2, preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                                preserves_genls_in_arg.$candidate_pgia_specs$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(preserves_genls_in_arg.$const11$genls, nat_constant_2, preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread)), col_2, mt), preserves_genls_in_arg.$candidate_pgia_specs$.getDynamicValue(thread)), thread);
                            }
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mt = cdolist_list_var.first();
                    }
                }
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 7559L)
    public static SubLObject pgia_after_removing_genls(final SubLObject deduction, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != control_vars.$pgia_activeP$.getDynamicValue(thread) && preserves_genls_in_arg.NIL != pgia_deductionP(deduction, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
            final SubLObject axiom = assertions_high.gaf_formula(assertion);
            final SubLObject truth = assertions_high.assertion_truth(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject _prev_bind_0 = preserves_genls_in_arg.$pgia_spec$.currentBinding(thread);
            final SubLObject _prev_bind_2 = preserves_genls_in_arg.$pgia_genl$.currentBinding(thread);
            try {
                preserves_genls_in_arg.$pgia_spec$.bind(conses_high.second(axiom), thread);
                preserves_genls_in_arg.$pgia_genl$.bind(conses_high.third(axiom), thread);
                if (preserves_genls_in_arg.NIL == kb_accessors.assertion_still_thereP(assertion, truth)) {
                    final SubLObject _prev_bind_0_$9 = preserves_genls_in_arg.$pgia_spec_nat$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$10 = preserves_genls_in_arg.$pgia_genl_nat$.currentBinding(thread);
                    try {
                        preserves_genls_in_arg.$pgia_spec_nat$.bind(function_terms.term_of_unit(preserves_genls_in_arg.$pgia_spec$.getDynamicValue(thread)), thread);
                        preserves_genls_in_arg.$pgia_genl_nat$.bind(function_terms.term_of_unit(preserves_genls_in_arg.$pgia_genl$.getDynamicValue(thread)), thread);
                        if (preserves_genls_in_arg.NIL != preserves_genls_in_arg.$pgia_spec_nat$.getDynamicValue(thread) && preserves_genls_in_arg.NIL != preserves_genls_in_arg.$pgia_genl_nat$.getDynamicValue(thread)) {
                            final SubLObject _prev_bind_0_$10 = preserves_genls_in_arg.$pgia_fn$.currentBinding(thread);
                            try {
                                preserves_genls_in_arg.$pgia_fn$.bind(cycl_utilities.nat_functor(preserves_genls_in_arg.$pgia_spec_nat$.getDynamicValue(thread)), thread);
                                if (preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(preserves_genls_in_arg.$pgia_genl_nat$.getDynamicValue(thread)))) {
                                    final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym3$RELEVANT_MT_IS_GENL_MT, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym21$PGIA_AFTER_REMOVING_GENLS_1), preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.ONE_INTEGER, preserves_genls_in_arg.$const17$preservesGenlsInArg, (SubLObject)preserves_genls_in_arg.$kw18$TRUE, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                    }
                                    finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$11, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            }
                            finally {
                                preserves_genls_in_arg.$pgia_fn$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                    }
                    finally {
                        preserves_genls_in_arg.$pgia_genl_nat$.rebind(_prev_bind_1_$10, thread);
                        preserves_genls_in_arg.$pgia_spec_nat$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
            finally {
                preserves_genls_in_arg.$pgia_genl$.rebind(_prev_bind_2, thread);
                preserves_genls_in_arg.$pgia_spec$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 9086L)
    public static SubLObject pgia_after_removing_genls_1(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != assertion_handles.assertion_p(assertion) && preserves_genls_in_arg.NIL == tms.tms_assertion_being_removedP(assertion)) {
            final SubLObject _prev_bind_0 = preserves_genls_in_arg.$pgia_arg$.currentBinding(thread);
            final SubLObject _prev_bind_2 = preserves_genls_in_arg.$pgia_gaf$.currentBinding(thread);
            final SubLObject _prev_bind_3 = preserves_genls_in_arg.$candidate_pgia_genls$.currentBinding(thread);
            final SubLObject _prev_bind_4 = preserves_genls_in_arg.$candidate_pgia_specs$.currentBinding(thread);
            try {
                preserves_genls_in_arg.$pgia_arg$.bind(assertions_high.gaf_arg2(assertion), thread);
                preserves_genls_in_arg.$pgia_gaf$.bind(assertion, thread);
                preserves_genls_in_arg.$candidate_pgia_genls$.bind((SubLObject)preserves_genls_in_arg.NIL, thread);
                preserves_genls_in_arg.$candidate_pgia_specs$.bind((SubLObject)preserves_genls_in_arg.NIL, thread);
                if (preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread).isInteger()) {
                    final SubLObject _prev_bind_0_$14 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$15 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(preserves_genls_in_arg.$const7$EverythingPSC, thread);
                        final SubLObject spec_col = cycl_utilities.nat_arg(preserves_genls_in_arg.$pgia_spec_nat$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind((preserves_genls_in_arg.NIL != sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls)) ? sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject node = function_terms.naut_to_nart(preserves_genls_in_arg.$pgia_genl$.getDynamicValue(thread));
                            if (preserves_genls_in_arg.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls));
                                if (preserves_genls_in_arg.NIL != d_link) {
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls)), sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls));
                                    if (preserves_genls_in_arg.NIL != mt_links) {
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); preserves_genls_in_arg.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (preserves_genls_in_arg.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                    SubLObject iteration_state_$18;
                                                    for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); preserves_genls_in_arg.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (preserves_genls_in_arg.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                            final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                final SubLObject sol = link_nodes;
                                                                if (preserves_genls_in_arg.NIL != set.set_p(sol)) {
                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                    SubLObject basis_object;
                                                                    SubLObject state;
                                                                    SubLObject grand_pa;
                                                                    SubLObject grand_pa_nat;
                                                                    SubLObject grand_pa_col;
                                                                    SubLObject candidate_pgia;
                                                                    SubLObject item_var;
                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)preserves_genls_in_arg.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); preserves_genls_in_arg.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                        grand_pa = set_contents.do_set_contents_next(basis_object, state);
                                                                        if (preserves_genls_in_arg.NIL != set_contents.do_set_contents_element_validP(state, grand_pa)) {
                                                                            grand_pa_nat = function_terms.term_of_unit(grand_pa);
                                                                            if (preserves_genls_in_arg.NIL != grand_pa_nat && preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_pa_nat))) {
                                                                                grand_pa_col = cycl_utilities.nat_arg(grand_pa_nat, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                                                candidate_pgia = candidate_pgia(spec_col, grand_pa_col, preserves_genls_in_arg.$pgia_spec$.getDynamicValue(thread), grand_pa, (SubLObject)preserves_genls_in_arg.$kw23$GENLS, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                                                if (preserves_genls_in_arg.NIL != candidate_pgia) {
                                                                                    item_var = candidate_pgia;
                                                                                    if (preserves_genls_in_arg.NIL == conses_high.member(item_var, preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQUAL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                                                                                        preserves_genls_in_arg.$candidate_pgia_genls$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread)), thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol.isList()) {
                                                                    SubLObject csome_list_var = sol;
                                                                    SubLObject grand_pa2 = (SubLObject)preserves_genls_in_arg.NIL;
                                                                    grand_pa2 = csome_list_var.first();
                                                                    while (preserves_genls_in_arg.NIL != csome_list_var) {
                                                                        final SubLObject grand_pa_nat2 = function_terms.term_of_unit(grand_pa2);
                                                                        if (preserves_genls_in_arg.NIL != grand_pa_nat2 && preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_pa_nat2))) {
                                                                            final SubLObject grand_pa_col2 = cycl_utilities.nat_arg(grand_pa_nat2, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                                            final SubLObject candidate_pgia2 = candidate_pgia(spec_col, grand_pa_col2, preserves_genls_in_arg.$pgia_spec$.getDynamicValue(thread), grand_pa2, (SubLObject)preserves_genls_in_arg.$kw23$GENLS, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                                            if (preserves_genls_in_arg.NIL != candidate_pgia2) {
                                                                                final SubLObject item_var2 = candidate_pgia2;
                                                                                if (preserves_genls_in_arg.NIL == conses_high.member(item_var2, preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQUAL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                                                                                    preserves_genls_in_arg.$candidate_pgia_genls$.setDynamicValue((SubLObject)ConsesLow.cons(item_var2, preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread)), thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        csome_list_var = csome_list_var.rest();
                                                                        grand_pa2 = csome_list_var.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)preserves_genls_in_arg.$str24$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$17, thread);
                                                            }
                                                        }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                                                }
                                                finally {
                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$16, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_error((SubLObject)preserves_genls_in_arg.FIVE_INTEGER, (SubLObject)preserves_genls_in_arg.$str25$attempting_to_bind_direction_link, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                }
                            }
                            else if (preserves_genls_in_arg.NIL != obsolete.cnat_p(node, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                                SubLObject cdolist_list_var;
                                final SubLObject new_list = cdolist_list_var = ((preserves_genls_in_arg.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls)));
                                SubLObject generating_fn = (SubLObject)preserves_genls_in_arg.NIL;
                                generating_fn = cdolist_list_var.first();
                                while (preserves_genls_in_arg.NIL != cdolist_list_var) {
                                    final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                        final SubLObject sol2;
                                        final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                        if (preserves_genls_in_arg.NIL != set.set_p(sol2)) {
                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject grand_pa3;
                                            SubLObject grand_pa_nat3;
                                            SubLObject grand_pa_col3;
                                            SubLObject candidate_pgia3;
                                            SubLObject item_var3;
                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)preserves_genls_in_arg.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); preserves_genls_in_arg.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                grand_pa3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                if (preserves_genls_in_arg.NIL != set_contents.do_set_contents_element_validP(state2, grand_pa3)) {
                                                    grand_pa_nat3 = function_terms.term_of_unit(grand_pa3);
                                                    if (preserves_genls_in_arg.NIL != grand_pa_nat3 && preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_pa_nat3))) {
                                                        grand_pa_col3 = cycl_utilities.nat_arg(grand_pa_nat3, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                        candidate_pgia3 = candidate_pgia(spec_col, grand_pa_col3, preserves_genls_in_arg.$pgia_spec$.getDynamicValue(thread), grand_pa3, (SubLObject)preserves_genls_in_arg.$kw23$GENLS, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                        if (preserves_genls_in_arg.NIL != candidate_pgia3) {
                                                            item_var3 = candidate_pgia3;
                                                            if (preserves_genls_in_arg.NIL == conses_high.member(item_var3, preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQUAL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                                                                preserves_genls_in_arg.$candidate_pgia_genls$.setDynamicValue((SubLObject)ConsesLow.cons(item_var3, preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else if (sol2.isList()) {
                                            SubLObject csome_list_var2 = sol2;
                                            SubLObject grand_pa4 = (SubLObject)preserves_genls_in_arg.NIL;
                                            grand_pa4 = csome_list_var2.first();
                                            while (preserves_genls_in_arg.NIL != csome_list_var2) {
                                                final SubLObject grand_pa_nat4 = function_terms.term_of_unit(grand_pa4);
                                                if (preserves_genls_in_arg.NIL != grand_pa_nat4 && preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_pa_nat4))) {
                                                    final SubLObject grand_pa_col4 = cycl_utilities.nat_arg(grand_pa_nat4, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                    final SubLObject candidate_pgia4 = candidate_pgia(spec_col, grand_pa_col4, preserves_genls_in_arg.$pgia_spec$.getDynamicValue(thread), grand_pa4, (SubLObject)preserves_genls_in_arg.$kw23$GENLS, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                    if (preserves_genls_in_arg.NIL != candidate_pgia4) {
                                                        final SubLObject item_var4 = candidate_pgia4;
                                                        if (preserves_genls_in_arg.NIL == conses_high.member(item_var4, preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQUAL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                                                            preserves_genls_in_arg.$candidate_pgia_genls$.setDynamicValue((SubLObject)ConsesLow.cons(item_var4, preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread)), thread);
                                                        }
                                                    }
                                                }
                                                csome_list_var2 = csome_list_var2.rest();
                                                grand_pa4 = csome_list_var2.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)preserves_genls_in_arg.$str24$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                        }
                                    }
                                    finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$18, thread);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    generating_fn = cdolist_list_var.first();
                                }
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$15, thread);
                        }
                        final SubLObject genl_col = cycl_utilities.nat_arg(preserves_genls_in_arg.$pgia_genl_nat$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind((preserves_genls_in_arg.NIL != sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls)) ? sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject node2 = function_terms.naut_to_nart(preserves_genls_in_arg.$pgia_spec$.getDynamicValue(thread));
                            if (preserves_genls_in_arg.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls));
                                if (preserves_genls_in_arg.NIL != d_link2) {
                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls)), sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls));
                                    if (preserves_genls_in_arg.NIL != mt_links2) {
                                        SubLObject iteration_state2;
                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); preserves_genls_in_arg.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (preserves_genls_in_arg.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                final SubLObject _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                    SubLObject iteration_state_$19;
                                                    for (iteration_state_$19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); preserves_genls_in_arg.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$19); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next(iteration_state_$19)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$19);
                                                        final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (preserves_genls_in_arg.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                            final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                final SubLObject sol3 = link_nodes3;
                                                                if (preserves_genls_in_arg.NIL != set.set_p(sol3)) {
                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                    SubLObject basis_object3;
                                                                    SubLObject state3;
                                                                    SubLObject grand_kid;
                                                                    SubLObject grand_kid_nat;
                                                                    SubLObject grand_kid_col;
                                                                    SubLObject candidate_pgia5;
                                                                    SubLObject item_var5;
                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)preserves_genls_in_arg.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); preserves_genls_in_arg.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                        grand_kid = set_contents.do_set_contents_next(basis_object3, state3);
                                                                        if (preserves_genls_in_arg.NIL != set_contents.do_set_contents_element_validP(state3, grand_kid)) {
                                                                            grand_kid_nat = function_terms.term_of_unit(grand_kid);
                                                                            if (preserves_genls_in_arg.NIL != grand_kid_nat && preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_kid_nat))) {
                                                                                grand_kid_col = cycl_utilities.nat_arg(grand_kid_nat, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                                                candidate_pgia5 = candidate_pgia(grand_kid_col, genl_col, grand_kid, preserves_genls_in_arg.$pgia_genl$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.$kw26$SPECS, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                                                if (preserves_genls_in_arg.NIL != candidate_pgia5) {
                                                                                    item_var5 = candidate_pgia5;
                                                                                    if (preserves_genls_in_arg.NIL == conses_high.member(item_var5, preserves_genls_in_arg.$candidate_pgia_specs$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQUAL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                                                                                        preserves_genls_in_arg.$candidate_pgia_specs$.setDynamicValue((SubLObject)ConsesLow.cons(item_var5, preserves_genls_in_arg.$candidate_pgia_specs$.getDynamicValue(thread)), thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol3.isList()) {
                                                                    SubLObject csome_list_var3 = sol3;
                                                                    SubLObject grand_kid2 = (SubLObject)preserves_genls_in_arg.NIL;
                                                                    grand_kid2 = csome_list_var3.first();
                                                                    while (preserves_genls_in_arg.NIL != csome_list_var3) {
                                                                        final SubLObject grand_kid_nat2 = function_terms.term_of_unit(grand_kid2);
                                                                        if (preserves_genls_in_arg.NIL != grand_kid_nat2 && preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_kid_nat2))) {
                                                                            final SubLObject grand_kid_col2 = cycl_utilities.nat_arg(grand_kid_nat2, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                                            final SubLObject candidate_pgia6 = candidate_pgia(grand_kid_col2, genl_col, grand_kid2, preserves_genls_in_arg.$pgia_genl$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.$kw26$SPECS, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                                            if (preserves_genls_in_arg.NIL != candidate_pgia6) {
                                                                                final SubLObject item_var6 = candidate_pgia6;
                                                                                if (preserves_genls_in_arg.NIL == conses_high.member(item_var6, preserves_genls_in_arg.$candidate_pgia_specs$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQUAL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                                                                                    preserves_genls_in_arg.$candidate_pgia_specs$.setDynamicValue((SubLObject)ConsesLow.cons(item_var6, preserves_genls_in_arg.$candidate_pgia_specs$.getDynamicValue(thread)), thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                        grand_kid2 = csome_list_var3.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)preserves_genls_in_arg.$str24$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$21, thread);
                                                            }
                                                        }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$19);
                                                }
                                                finally {
                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_error((SubLObject)preserves_genls_in_arg.FIVE_INTEGER, (SubLObject)preserves_genls_in_arg.$str25$attempting_to_bind_direction_link, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                }
                            }
                            else if (preserves_genls_in_arg.NIL != obsolete.cnat_p(node2, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                                SubLObject cdolist_list_var2;
                                final SubLObject new_list2 = cdolist_list_var2 = ((preserves_genls_in_arg.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(preserves_genls_in_arg.$const11$genls)));
                                SubLObject generating_fn2 = (SubLObject)preserves_genls_in_arg.NIL;
                                generating_fn2 = cdolist_list_var2.first();
                                while (preserves_genls_in_arg.NIL != cdolist_list_var2) {
                                    final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                        final SubLObject sol4;
                                        final SubLObject link_nodes4 = sol4 = Functions.funcall(generating_fn2, node2);
                                        if (preserves_genls_in_arg.NIL != set.set_p(sol4)) {
                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                            SubLObject basis_object4;
                                            SubLObject state4;
                                            SubLObject grand_kid3;
                                            SubLObject grand_kid_nat3;
                                            SubLObject grand_kid_col3;
                                            SubLObject candidate_pgia7;
                                            SubLObject item_var7;
                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)preserves_genls_in_arg.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); preserves_genls_in_arg.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                grand_kid3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                if (preserves_genls_in_arg.NIL != set_contents.do_set_contents_element_validP(state4, grand_kid3)) {
                                                    grand_kid_nat3 = function_terms.term_of_unit(grand_kid3);
                                                    if (preserves_genls_in_arg.NIL != grand_kid_nat3 && preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_kid_nat3))) {
                                                        grand_kid_col3 = cycl_utilities.nat_arg(grand_kid_nat3, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                        candidate_pgia7 = candidate_pgia(grand_kid_col3, genl_col, grand_kid3, preserves_genls_in_arg.$pgia_genl$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.$kw26$SPECS, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                        if (preserves_genls_in_arg.NIL != candidate_pgia7) {
                                                            item_var7 = candidate_pgia7;
                                                            if (preserves_genls_in_arg.NIL == conses_high.member(item_var7, preserves_genls_in_arg.$candidate_pgia_specs$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQUAL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                                                                preserves_genls_in_arg.$candidate_pgia_specs$.setDynamicValue((SubLObject)ConsesLow.cons(item_var7, preserves_genls_in_arg.$candidate_pgia_specs$.getDynamicValue(thread)), thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else if (sol4.isList()) {
                                            SubLObject csome_list_var4 = sol4;
                                            SubLObject grand_kid4 = (SubLObject)preserves_genls_in_arg.NIL;
                                            grand_kid4 = csome_list_var4.first();
                                            while (preserves_genls_in_arg.NIL != csome_list_var4) {
                                                final SubLObject grand_kid_nat4 = function_terms.term_of_unit(grand_kid4);
                                                if (preserves_genls_in_arg.NIL != grand_kid_nat4 && preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread).eql(cycl_utilities.nat_functor(grand_kid_nat4))) {
                                                    final SubLObject grand_kid_col4 = cycl_utilities.nat_arg(grand_kid_nat4, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                    final SubLObject candidate_pgia8 = candidate_pgia(grand_kid_col4, genl_col, grand_kid4, preserves_genls_in_arg.$pgia_genl$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.$kw26$SPECS, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                                                    if (preserves_genls_in_arg.NIL != candidate_pgia8) {
                                                        final SubLObject item_var8 = candidate_pgia8;
                                                        if (preserves_genls_in_arg.NIL == conses_high.member(item_var8, preserves_genls_in_arg.$candidate_pgia_specs$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQUAL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                                                            preserves_genls_in_arg.$candidate_pgia_specs$.setDynamicValue((SubLObject)ConsesLow.cons(item_var8, preserves_genls_in_arg.$candidate_pgia_specs$.getDynamicValue(thread)), thread);
                                                        }
                                                    }
                                                }
                                                csome_list_var4 = csome_list_var4.rest();
                                                grand_kid4 = csome_list_var4.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)preserves_genls_in_arg.$str24$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                        }
                                    }
                                    finally {
                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$22, thread);
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    generating_fn2 = cdolist_list_var2.first();
                                }
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$15, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$14, thread);
                    }
                }
                final SubLObject _prev_bind_0_$23 = preserves_genls_in_arg.$pgia_col$.currentBinding(thread);
                try {
                    preserves_genls_in_arg.$pgia_col$.bind(cycl_utilities.nat_arg(preserves_genls_in_arg.$pgia_spec_nat$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED), thread);
                    assert_candidate_pgia_genls();
                }
                finally {
                    preserves_genls_in_arg.$pgia_col$.rebind(_prev_bind_0_$23, thread);
                }
                final SubLObject _prev_bind_0_$24 = preserves_genls_in_arg.$pgia_col$.currentBinding(thread);
                try {
                    preserves_genls_in_arg.$pgia_col$.bind(cycl_utilities.nat_arg(preserves_genls_in_arg.$pgia_genl_nat$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED), thread);
                    assert_candidate_pgia_specs();
                }
                finally {
                    preserves_genls_in_arg.$pgia_col$.rebind(_prev_bind_0_$24, thread);
                }
            }
            finally {
                preserves_genls_in_arg.$candidate_pgia_specs$.rebind(_prev_bind_4, thread);
                preserves_genls_in_arg.$candidate_pgia_genls$.rebind(_prev_bind_3, thread);
                preserves_genls_in_arg.$pgia_gaf$.rebind(_prev_bind_2, thread);
                preserves_genls_in_arg.$pgia_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 10907L)
    public static SubLObject candidate_pgia(final SubLObject spec_col, final SubLObject genl_col, final SubLObject spec_nat_constant, final SubLObject genl_nat_constant, final SubLObject rel, SubLObject arg) {
        if (arg == preserves_genls_in_arg.UNPROVIDED) {
            arg = preserves_genls_in_arg.$pgia_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candidate = (SubLObject)preserves_genls_in_arg.NIL;
        if (preserves_genls_in_arg.NIL != genls.genlsP(spec_col, genl_col, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
            SubLObject cdolist_list_var = pgia_true_in_mts(spec_nat_constant, genl_nat_constant, arg);
            SubLObject mt = (SubLObject)preserves_genls_in_arg.NIL;
            mt = cdolist_list_var.first();
            while (preserves_genls_in_arg.NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym12$RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject gaf = (SubLObject)ConsesLow.list(preserves_genls_in_arg.$const11$genls, spec_nat_constant, genl_nat_constant);
                    SubLObject support_col = (SubLObject)preserves_genls_in_arg.NIL;
                    if (rel.eql((SubLObject)preserves_genls_in_arg.$kw23$GENLS)) {
                        support_col = genl_col;
                    }
                    else if (rel.eql((SubLObject)preserves_genls_in_arg.$kw26$SPECS)) {
                        support_col = spec_col;
                    }
                    if (preserves_genls_in_arg.NIL != support_col) {
                        candidate = (SubLObject)ConsesLow.list(gaf, support_col, mt);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        return candidate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 11471L)
    public static SubLObject pgia_true_in_mts(final SubLObject spec_nat_constant, final SubLObject genl_nat_constant, final SubLObject arg) {
        final SubLObject spec_nat = function_terms.term_of_unit(spec_nat_constant);
        final SubLObject genl_nat = function_terms.term_of_unit(genl_nat_constant);
        final SubLObject pgai_mts = kb_indexing.gaf_mts((SubLObject)ConsesLow.list(preserves_genls_in_arg.$const17$preservesGenlsInArg, cycl_utilities.nat_functor(spec_nat), arg));
        final SubLObject genls_mts = genls.min_mts_of_genls_paths(cycl_utilities.nat_arg(spec_nat, arg, (SubLObject)preserves_genls_in_arg.UNPROVIDED), cycl_utilities.nat_arg(genl_nat, arg, (SubLObject)preserves_genls_in_arg.UNPROVIDED), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
        SubLObject mt_sets = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject mts = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject cdolist_list_var = pgai_mts;
        SubLObject pgai_mt = (SubLObject)preserves_genls_in_arg.NIL;
        pgai_mt = cdolist_list_var.first();
        while (preserves_genls_in_arg.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$28 = genls_mts;
            SubLObject genls_mt_set = (SubLObject)preserves_genls_in_arg.NIL;
            genls_mt_set = cdolist_list_var_$28.first();
            while (preserves_genls_in_arg.NIL != cdolist_list_var_$28) {
                final SubLObject item_var = pgai_mt;
                if (preserves_genls_in_arg.NIL == conses_high.member(item_var, genls_mt_set, Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                    genls_mt_set = (SubLObject)ConsesLow.cons(item_var, genls_mt_set);
                }
                mt_sets = (SubLObject)ConsesLow.cons(genls_mt_set, mt_sets);
                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                genls_mt_set = cdolist_list_var_$28.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pgai_mt = cdolist_list_var.first();
        }
        mts = genl_mts.max_floor_mts_from_mt_sets(mt_sets);
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 12070L)
    public static SubLObject recompute_functor_pgia(final SubLObject functor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != control_vars.$pgia_activeP$.getDynamicValue(thread)) {
            if (preserves_genls_in_arg.NIL != term.hl_ground_nautP(functor)) {
                return recompute_functor_pgia(narts_high.find_nart(functor));
            }
            if (preserves_genls_in_arg.NIL != forts.fort_p(functor)) {
                final SubLObject _prev_bind_0 = preserves_genls_in_arg.$pgia_fn$.currentBinding(thread);
                final SubLObject _prev_bind_2 = preserves_genls_in_arg.$consider_current_pgiaP$.currentBinding(thread);
                try {
                    preserves_genls_in_arg.$pgia_fn$.bind(functor, thread);
                    preserves_genls_in_arg.$consider_current_pgiaP$.bind((SubLObject)preserves_genls_in_arg.T, thread);
                    kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym27$RECOMPUTE_FUNCTOR_PGIA_1), preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.ONE_INTEGER, preserves_genls_in_arg.$const17$preservesGenlsInArg, (SubLObject)preserves_genls_in_arg.$kw18$TRUE, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                }
                finally {
                    preserves_genls_in_arg.$consider_current_pgiaP$.rebind(_prev_bind_2, thread);
                    preserves_genls_in_arg.$pgia_fn$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 12765L)
    public static SubLObject recompute_functor_pgia_1(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject _prev_bind_0 = preserves_genls_in_arg.$pgia_gaf$.currentBinding(thread);
            final SubLObject _prev_bind_2 = preserves_genls_in_arg.$pgia_arg$.currentBinding(thread);
            try {
                preserves_genls_in_arg.$pgia_gaf$.bind(assertion, thread);
                preserves_genls_in_arg.$pgia_arg$.bind(assertions_high.gaf_arg2(assertion), thread);
                if (preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread).isInteger()) {
                    final SubLObject pgia_mt = assertions_high.assertion_mt(assertion);
                    final SubLObject _prev_bind_0_$29 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$30 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)preserves_genls_in_arg.$sym3$RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(pgia_mt, thread);
                        if (arity.arity(preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread)).numGE(preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread)) || preserves_genls_in_arg.NIL != arity.variable_arityP(preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread))) {
                            kb_mapping.map_function_extent_index(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym4$PGIA_AFTER_ADDING_PGIA_1), preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$30, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$29, thread);
                    }
                }
            }
            finally {
                preserves_genls_in_arg.$pgia_arg$.rebind(_prev_bind_2, thread);
                preserves_genls_in_arg.$pgia_gaf$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 13201L)
    public static SubLObject recompute_nat_pgia(final SubLObject nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != control_vars.$pgia_activeP$.getDynamicValue(thread)) {
            if (preserves_genls_in_arg.NIL != term.hl_ground_nautP(nat)) {
                return recompute_nat_pgia(narts_high.find_nart(nat));
            }
            if (preserves_genls_in_arg.NIL != forts.fort_p(nat)) {
                final SubLObject _prev_bind_0 = preserves_genls_in_arg.$pgia_nat_fort$.currentBinding(thread);
                final SubLObject _prev_bind_2 = preserves_genls_in_arg.$pgia_nat$.currentBinding(thread);
                final SubLObject _prev_bind_3 = preserves_genls_in_arg.$pgia_fn$.currentBinding(thread);
                final SubLObject _prev_bind_4 = preserves_genls_in_arg.$consider_current_pgiaP$.currentBinding(thread);
                try {
                    preserves_genls_in_arg.$pgia_nat_fort$.bind(nat, thread);
                    preserves_genls_in_arg.$pgia_nat$.bind(function_terms.term_of_unit(nat), thread);
                    preserves_genls_in_arg.$pgia_fn$.bind(cycl_utilities.nat_functor(preserves_genls_in_arg.$pgia_nat$.getDynamicValue(thread)), thread);
                    preserves_genls_in_arg.$consider_current_pgiaP$.bind((SubLObject)preserves_genls_in_arg.T, thread);
                    kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym28$RECOMPUTE_NAT_PGIA_1), preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.ONE_INTEGER, preserves_genls_in_arg.$const17$preservesGenlsInArg, (SubLObject)preserves_genls_in_arg.$kw18$TRUE, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                }
                finally {
                    preserves_genls_in_arg.$consider_current_pgiaP$.rebind(_prev_bind_4, thread);
                    preserves_genls_in_arg.$pgia_fn$.rebind(_prev_bind_3, thread);
                    preserves_genls_in_arg.$pgia_nat$.rebind(_prev_bind_2, thread);
                    preserves_genls_in_arg.$pgia_nat_fort$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 13833L)
    public static SubLObject recompute_nat_pgia_1(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject _prev_bind_0 = preserves_genls_in_arg.$pgia_arg$.currentBinding(thread);
            try {
                preserves_genls_in_arg.$pgia_arg$.bind(assertions_high.gaf_arg2(assertion), thread);
                if (preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread).isInteger()) {
                    final SubLObject _prev_bind_0_$31 = preserves_genls_in_arg.$pgia_col$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = preserves_genls_in_arg.$pgia_gaf$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = preserves_genls_in_arg.$current_pgia_genls$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = preserves_genls_in_arg.$current_pgia_specs$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = preserves_genls_in_arg.$candidate_pgia_genls$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = preserves_genls_in_arg.$candidate_pgia_specs$.currentBinding(thread);
                    try {
                        preserves_genls_in_arg.$pgia_col$.bind(cycl_utilities.nat_arg(preserves_genls_in_arg.$pgia_nat$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED), thread);
                        preserves_genls_in_arg.$pgia_gaf$.bind(assertion, thread);
                        preserves_genls_in_arg.$current_pgia_genls$.bind(current_pgia_genls(preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread)), thread);
                        preserves_genls_in_arg.$current_pgia_specs$.bind(current_pgia_specs(preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread)), thread);
                        preserves_genls_in_arg.$candidate_pgia_genls$.bind((SubLObject)preserves_genls_in_arg.NIL, thread);
                        preserves_genls_in_arg.$candidate_pgia_specs$.bind((SubLObject)preserves_genls_in_arg.NIL, thread);
                        kb_mapping.map_function_extent_index(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym20$PGIA_AFTER_ADDING_ISA_2), preserves_genls_in_arg.$pgia_fn$.getDynamicValue(thread));
                        assert_candidate_pgia_genls();
                        assert_candidate_pgia_specs();
                    }
                    finally {
                        preserves_genls_in_arg.$candidate_pgia_specs$.rebind(_prev_bind_6, thread);
                        preserves_genls_in_arg.$candidate_pgia_genls$.rebind(_prev_bind_5, thread);
                        preserves_genls_in_arg.$current_pgia_specs$.rebind(_prev_bind_4, thread);
                        preserves_genls_in_arg.$current_pgia_genls$.rebind(_prev_bind_3, thread);
                        preserves_genls_in_arg.$pgia_gaf$.rebind(_prev_bind_2, thread);
                        preserves_genls_in_arg.$pgia_col$.rebind(_prev_bind_0_$31, thread);
                    }
                }
            }
            finally {
                preserves_genls_in_arg.$pgia_arg$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 14452L)
    public static SubLObject current_pgia_specs(final SubLObject nat_constant, final SubLObject arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != preserves_genls_in_arg.$consider_current_pgiaP$.getDynamicValue(thread)) {
            SubLObject specs = (SubLObject)preserves_genls_in_arg.NIL;
            final SubLObject _prev_bind_0 = control_vars.$mapping_gather_arg$.currentBinding(thread);
            final SubLObject _prev_bind_2 = preserves_genls_in_arg.$pgia_arg$.currentBinding(thread);
            final SubLObject _prev_bind_3 = control_vars.$mapping_answer$.currentBinding(thread);
            try {
                control_vars.$mapping_gather_arg$.bind((SubLObject)preserves_genls_in_arg.ONE_INTEGER, thread);
                preserves_genls_in_arg.$pgia_arg$.bind(arg, thread);
                control_vars.$mapping_answer$.bind((SubLObject)preserves_genls_in_arg.NIL, thread);
                kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym29$GATHER_PGIA), nat_constant, (SubLObject)preserves_genls_in_arg.TWO_INTEGER, preserves_genls_in_arg.$const11$genls, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                specs = control_vars.$mapping_answer$.getDynamicValue(thread);
            }
            finally {
                control_vars.$mapping_answer$.rebind(_prev_bind_3, thread);
                preserves_genls_in_arg.$pgia_arg$.rebind(_prev_bind_2, thread);
                control_vars.$mapping_gather_arg$.rebind(_prev_bind_0, thread);
            }
            return specs;
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 14744L)
    public static SubLObject current_pgia_genls(final SubLObject nat_constant, final SubLObject arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != preserves_genls_in_arg.$consider_current_pgiaP$.getDynamicValue(thread)) {
            SubLObject v_genls = (SubLObject)preserves_genls_in_arg.NIL;
            final SubLObject _prev_bind_0 = control_vars.$mapping_gather_arg$.currentBinding(thread);
            final SubLObject _prev_bind_2 = preserves_genls_in_arg.$pgia_arg$.currentBinding(thread);
            final SubLObject _prev_bind_3 = control_vars.$mapping_answer$.currentBinding(thread);
            try {
                control_vars.$mapping_gather_arg$.bind((SubLObject)preserves_genls_in_arg.TWO_INTEGER, thread);
                preserves_genls_in_arg.$pgia_arg$.bind(arg, thread);
                control_vars.$mapping_answer$.bind((SubLObject)preserves_genls_in_arg.NIL, thread);
                kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)preserves_genls_in_arg.$sym29$GATHER_PGIA), nat_constant, (SubLObject)preserves_genls_in_arg.ONE_INTEGER, preserves_genls_in_arg.$const11$genls, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                v_genls = control_vars.$mapping_answer$.getDynamicValue(thread);
            }
            finally {
                control_vars.$mapping_answer$.rebind(_prev_bind_3, thread);
                preserves_genls_in_arg.$pgia_arg$.rebind(_prev_bind_2, thread);
                control_vars.$mapping_gather_arg$.rebind(_prev_bind_0, thread);
            }
            return v_genls;
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 15036L)
    public static SubLObject gather_pgia(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (preserves_genls_in_arg.NIL != pgia_assertionP(assertion, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread))) {
            final SubLObject pgia_nat = assertions_high.gaf_arg(assertion, control_vars.$mapping_gather_arg$.getDynamicValue(thread));
            final SubLObject pgia_col = cycl_utilities.nat_arg(pgia_nat, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
            control_vars.$mapping_answer$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pgia_nat, pgia_col, assertions_high.assertion_mt(assertion)), control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 15331L)
    public static SubLObject pgia_assertionP(final SubLObject assertion, SubLObject arg) {
        if (arg == preserves_genls_in_arg.UNPROVIDED) {
            arg = (SubLObject)preserves_genls_in_arg.NIL;
        }
        SubLObject pgiaP = (SubLObject)preserves_genls_in_arg.NIL;
        if (preserves_genls_in_arg.NIL == pgiaP) {
            SubLObject csome_list_var;
            SubLObject argument;
            for (csome_list_var = assertions_high.assertion_arguments(assertion), argument = (SubLObject)preserves_genls_in_arg.NIL, argument = csome_list_var.first(); preserves_genls_in_arg.NIL == pgiaP && preserves_genls_in_arg.NIL != csome_list_var; pgiaP = pgia_deductionP(argument, arg), csome_list_var = csome_list_var.rest(), argument = csome_list_var.first()) {}
        }
        return pgiaP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 15578L)
    public static SubLObject pgia_supportP(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(support.isCons() && support.first() == preserves_genls_in_arg.$kw30$CODE && conses_high.second(support).equal(preserves_genls_in_arg.$pgia_rule$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 15727L)
    public static SubLObject pgia_deductionP(final SubLObject deduction, SubLObject arg) {
        if (arg == preserves_genls_in_arg.UNPROVIDED) {
            arg = (SubLObject)preserves_genls_in_arg.NIL;
        }
        if (preserves_genls_in_arg.NIL != deduction_handles.deduction_p(deduction)) {
            SubLObject pgiaP = (SubLObject)preserves_genls_in_arg.NIL;
            SubLObject arg_okP = Types.sublisp_null(arg);
            if (preserves_genls_in_arg.NIL == pgiaP) {
                SubLObject csome_list_var;
                SubLObject support;
                for (csome_list_var = deductions_high.deduction_supports(deduction), support = (SubLObject)preserves_genls_in_arg.NIL, support = csome_list_var.first(); preserves_genls_in_arg.NIL == pgiaP && preserves_genls_in_arg.NIL != csome_list_var; pgiaP = pgia_supportP(support), csome_list_var = csome_list_var.rest(), support = csome_list_var.first()) {}
            }
            if (preserves_genls_in_arg.NIL != pgiaP) {
                SubLObject doneP = arg_okP;
                if (preserves_genls_in_arg.NIL == doneP) {
                    SubLObject csome_list_var2 = deductions_high.deduction_supports(deduction);
                    SubLObject support2 = (SubLObject)preserves_genls_in_arg.NIL;
                    support2 = csome_list_var2.first();
                    while (preserves_genls_in_arg.NIL == doneP && preserves_genls_in_arg.NIL != csome_list_var2) {
                        if (preserves_genls_in_arg.NIL != assertions_high.gaf_assertionP(support2) && preserves_genls_in_arg.$const17$preservesGenlsInArg.eql(assertions_high.gaf_arg0(support2))) {
                            arg_okP = Equality.eq(arg, assertions_high.gaf_arg2(support2));
                            doneP = (SubLObject)preserves_genls_in_arg.T;
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        support2 = csome_list_var2.first();
                    }
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(preserves_genls_in_arg.NIL != pgiaP && preserves_genls_in_arg.NIL != arg_okP);
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 16261L)
    public static SubLObject assert_candidate_pgia_genls() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pgia_genls = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject new_pgia_genls = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject pgia_mts = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject mt_genls = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject cdolist_list_var = preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread);
        SubLObject candidate = (SubLObject)preserves_genls_in_arg.NIL;
        candidate = cdolist_list_var.first();
        while (preserves_genls_in_arg.NIL != cdolist_list_var) {
            if (preserves_genls_in_arg.NIL == known_pgiaP(candidate, preserves_genls_in_arg.$current_pgia_genls$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.$kw23$GENLS)) {
                final SubLObject item_var = conses_high.second(candidate);
                if (preserves_genls_in_arg.NIL == conses_high.member(item_var, new_pgia_genls, Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                    new_pgia_genls = (SubLObject)ConsesLow.cons(item_var, new_pgia_genls);
                }
            }
            SubLObject item_var = conses_high.second(candidate);
            if (preserves_genls_in_arg.NIL == conses_high.member(item_var, pgia_genls, Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                pgia_genls = (SubLObject)ConsesLow.cons(item_var, pgia_genls);
            }
            item_var = conses_high.third(candidate);
            if (preserves_genls_in_arg.NIL == conses_high.member(item_var, pgia_mts, Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                pgia_mts = (SubLObject)ConsesLow.cons(item_var, pgia_mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        cdolist_list_var = preserves_genls_in_arg.$current_pgia_genls$.getDynamicValue(thread);
        SubLObject current = (SubLObject)preserves_genls_in_arg.NIL;
        current = cdolist_list_var.first();
        while (preserves_genls_in_arg.NIL != cdolist_list_var) {
            SubLObject item_var = conses_high.second(current);
            if (preserves_genls_in_arg.NIL == conses_high.member(item_var, pgia_genls, Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                pgia_genls = (SubLObject)ConsesLow.cons(item_var, pgia_genls);
            }
            item_var = conses_high.third(current);
            if (preserves_genls_in_arg.NIL == conses_high.member(item_var, pgia_mts, Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                pgia_mts = (SubLObject)ConsesLow.cons(item_var, pgia_mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            current = cdolist_list_var.first();
        }
        cdolist_list_var = pgia_mts;
        SubLObject pgia_mt = (SubLObject)preserves_genls_in_arg.NIL;
        pgia_mt = cdolist_list_var.first();
        while (preserves_genls_in_arg.NIL != cdolist_list_var) {
            mt_genls = genls.min_cols(pgia_genls, pgia_mt, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
            SubLObject cdolist_list_var_$32 = preserves_genls_in_arg.$candidate_pgia_genls$.getDynamicValue(thread);
            SubLObject candidate2 = (SubLObject)preserves_genls_in_arg.NIL;
            candidate2 = cdolist_list_var_$32.first();
            while (preserves_genls_in_arg.NIL != cdolist_list_var_$32) {
                SubLObject current2;
                final SubLObject datum = current2 = candidate2;
                SubLObject gaf = (SubLObject)preserves_genls_in_arg.NIL;
                SubLObject genl_col = (SubLObject)preserves_genls_in_arg.NIL;
                SubLObject mt = (SubLObject)preserves_genls_in_arg.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, (SubLObject)preserves_genls_in_arg.$list31);
                gaf = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, (SubLObject)preserves_genls_in_arg.$list31);
                genl_col = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, (SubLObject)preserves_genls_in_arg.$list31);
                mt = current2.first();
                current2 = current2.rest();
                if (preserves_genls_in_arg.NIL == current2) {
                    if (pgia_mt.eql(mt) && preserves_genls_in_arg.NIL != subl_promotions.memberP(genl_col, mt_genls, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED) && preserves_genls_in_arg.NIL != subl_promotions.memberP(genl_col, new_pgia_genls, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                        fi.fi_add_argument_int(gaf, mt, (SubLObject)ConsesLow.list(preserves_genls_in_arg.$pgia_gaf$.getDynamicValue(thread), (SubLObject)ConsesLow.listS((SubLObject)preserves_genls_in_arg.$kw23$GENLS, (SubLObject)ConsesLow.list(preserves_genls_in_arg.$const11$genls, preserves_genls_in_arg.$pgia_col$.getDynamicValue(thread), genl_col), mt, (SubLObject)preserves_genls_in_arg.$list32), fi.make_el_support((SubLObject)preserves_genls_in_arg.$kw30$CODE, conses_high.copy_tree(preserves_genls_in_arg.$pgia_rule$.getDynamicValue(thread)), preserves_genls_in_arg.$pgia_mt$.getGlobalValue(), (SubLObject)preserves_genls_in_arg.$kw33$DEFAULT)), (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)preserves_genls_in_arg.$list31);
                }
                cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                candidate2 = cdolist_list_var_$32.first();
            }
            SubLObject cdolist_list_var_$33 = preserves_genls_in_arg.$current_pgia_genls$.getDynamicValue(thread);
            SubLObject current3 = (SubLObject)preserves_genls_in_arg.NIL;
            current3 = cdolist_list_var_$33.first();
            while (preserves_genls_in_arg.NIL != cdolist_list_var_$33) {
                SubLObject current_$34;
                final SubLObject datum = current_$34 = current3;
                SubLObject genl_nat = (SubLObject)preserves_genls_in_arg.NIL;
                SubLObject genl_col = (SubLObject)preserves_genls_in_arg.NIL;
                SubLObject mt = (SubLObject)preserves_genls_in_arg.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$34, datum, (SubLObject)preserves_genls_in_arg.$list34);
                genl_nat = current_$34.first();
                current_$34 = current_$34.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$34, datum, (SubLObject)preserves_genls_in_arg.$list34);
                genl_col = current_$34.first();
                current_$34 = current_$34.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$34, datum, (SubLObject)preserves_genls_in_arg.$list34);
                mt = current_$34.first();
                current_$34 = current_$34.rest();
                if (preserves_genls_in_arg.NIL == current_$34) {
                    if (pgia_mt.eql(mt) && preserves_genls_in_arg.NIL == subl_promotions.memberP(genl_col, mt_genls, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                        final SubLObject _prev_bind_0 = control_vars.$pgia_activeP$.currentBinding(thread);
                        try {
                            control_vars.$pgia_activeP$.bind((SubLObject)preserves_genls_in_arg.NIL, thread);
                            final SubLObject gaf2 = (SubLObject)ConsesLow.list(preserves_genls_in_arg.$const11$genls, preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread), genl_nat);
                            fi.fi_remove_argument_int(gaf2, mt, (SubLObject)ConsesLow.list(preserves_genls_in_arg.$pgia_gaf$.getDynamicValue(thread), (SubLObject)ConsesLow.listS((SubLObject)preserves_genls_in_arg.$kw23$GENLS, (SubLObject)ConsesLow.list(preserves_genls_in_arg.$const11$genls, preserves_genls_in_arg.$pgia_col$.getDynamicValue(thread), genl_col), mt, (SubLObject)preserves_genls_in_arg.$list32), fi.make_el_support((SubLObject)preserves_genls_in_arg.$kw30$CODE, conses_high.copy_tree(preserves_genls_in_arg.$pgia_rule$.getDynamicValue(thread)), preserves_genls_in_arg.$pgia_mt$.getGlobalValue(), (SubLObject)preserves_genls_in_arg.$kw33$DEFAULT)), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                        }
                        finally {
                            control_vars.$pgia_activeP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)preserves_genls_in_arg.$list34);
                }
                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                current3 = cdolist_list_var_$33.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pgia_mt = cdolist_list_var.first();
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 17971L)
    public static SubLObject assert_candidate_pgia_specs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pgia_specs = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject new_pgia_specs = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject pgia_mts = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject mt_specs = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject cdolist_list_var = preserves_genls_in_arg.$candidate_pgia_specs$.getDynamicValue(thread);
        SubLObject candidate = (SubLObject)preserves_genls_in_arg.NIL;
        candidate = cdolist_list_var.first();
        while (preserves_genls_in_arg.NIL != cdolist_list_var) {
            if (preserves_genls_in_arg.NIL == known_pgiaP(candidate, preserves_genls_in_arg.$current_pgia_specs$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.$kw26$SPECS)) {
                final SubLObject item_var = conses_high.second(candidate);
                if (preserves_genls_in_arg.NIL == conses_high.member(item_var, new_pgia_specs, Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                    new_pgia_specs = (SubLObject)ConsesLow.cons(item_var, new_pgia_specs);
                }
            }
            SubLObject item_var = conses_high.second(candidate);
            if (preserves_genls_in_arg.NIL == conses_high.member(item_var, pgia_specs, Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                pgia_specs = (SubLObject)ConsesLow.cons(item_var, pgia_specs);
            }
            item_var = conses_high.third(candidate);
            if (preserves_genls_in_arg.NIL == conses_high.member(item_var, pgia_mts, Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                pgia_mts = (SubLObject)ConsesLow.cons(item_var, pgia_mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        cdolist_list_var = preserves_genls_in_arg.$current_pgia_specs$.getDynamicValue(thread);
        SubLObject current = (SubLObject)preserves_genls_in_arg.NIL;
        current = cdolist_list_var.first();
        while (preserves_genls_in_arg.NIL != cdolist_list_var) {
            SubLObject item_var = conses_high.second(current);
            if (preserves_genls_in_arg.NIL == conses_high.member(item_var, pgia_specs, Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                pgia_specs = (SubLObject)ConsesLow.cons(item_var, pgia_specs);
            }
            item_var = conses_high.third(current);
            if (preserves_genls_in_arg.NIL == conses_high.member(item_var, pgia_mts, Symbols.symbol_function((SubLObject)preserves_genls_in_arg.EQL), Symbols.symbol_function((SubLObject)preserves_genls_in_arg.IDENTITY))) {
                pgia_mts = (SubLObject)ConsesLow.cons(item_var, pgia_mts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            current = cdolist_list_var.first();
        }
        cdolist_list_var = pgia_mts;
        SubLObject pgia_mt = (SubLObject)preserves_genls_in_arg.NIL;
        pgia_mt = cdolist_list_var.first();
        while (preserves_genls_in_arg.NIL != cdolist_list_var) {
            mt_specs = genls.max_cols(pgia_specs, pgia_mt, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
            SubLObject cdolist_list_var_$35 = preserves_genls_in_arg.$candidate_pgia_specs$.getDynamicValue(thread);
            SubLObject candidate2 = (SubLObject)preserves_genls_in_arg.NIL;
            candidate2 = cdolist_list_var_$35.first();
            while (preserves_genls_in_arg.NIL != cdolist_list_var_$35) {
                SubLObject current2;
                final SubLObject datum = current2 = candidate2;
                SubLObject gaf = (SubLObject)preserves_genls_in_arg.NIL;
                SubLObject spec_col = (SubLObject)preserves_genls_in_arg.NIL;
                SubLObject mt = (SubLObject)preserves_genls_in_arg.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, (SubLObject)preserves_genls_in_arg.$list35);
                gaf = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, (SubLObject)preserves_genls_in_arg.$list35);
                spec_col = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum, (SubLObject)preserves_genls_in_arg.$list35);
                mt = current2.first();
                current2 = current2.rest();
                if (preserves_genls_in_arg.NIL == current2) {
                    if (pgia_mt.eql(mt) && preserves_genls_in_arg.NIL != subl_promotions.memberP(spec_col, mt_specs, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED) && preserves_genls_in_arg.NIL != subl_promotions.memberP(spec_col, new_pgia_specs, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                        fi.fi_add_argument_int(gaf, mt, (SubLObject)ConsesLow.list(preserves_genls_in_arg.$pgia_gaf$.getDynamicValue(thread), (SubLObject)ConsesLow.listS((SubLObject)preserves_genls_in_arg.$kw23$GENLS, (SubLObject)ConsesLow.list(preserves_genls_in_arg.$const11$genls, spec_col, preserves_genls_in_arg.$pgia_col$.getDynamicValue(thread)), mt, (SubLObject)preserves_genls_in_arg.$list32), fi.make_el_support((SubLObject)preserves_genls_in_arg.$kw30$CODE, conses_high.copy_tree(preserves_genls_in_arg.$pgia_rule$.getDynamicValue(thread)), preserves_genls_in_arg.$pgia_mt$.getGlobalValue(), (SubLObject)preserves_genls_in_arg.$kw33$DEFAULT)), (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)preserves_genls_in_arg.$list35);
                }
                cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                candidate2 = cdolist_list_var_$35.first();
            }
            SubLObject cdolist_list_var_$36 = preserves_genls_in_arg.$current_pgia_specs$.getDynamicValue(thread);
            SubLObject current3 = (SubLObject)preserves_genls_in_arg.NIL;
            current3 = cdolist_list_var_$36.first();
            while (preserves_genls_in_arg.NIL != cdolist_list_var_$36) {
                SubLObject current_$37;
                final SubLObject datum = current_$37 = current3;
                SubLObject spec_nat = (SubLObject)preserves_genls_in_arg.NIL;
                SubLObject spec_col = (SubLObject)preserves_genls_in_arg.NIL;
                SubLObject mt = (SubLObject)preserves_genls_in_arg.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$37, datum, (SubLObject)preserves_genls_in_arg.$list36);
                spec_nat = current_$37.first();
                current_$37 = current_$37.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$37, datum, (SubLObject)preserves_genls_in_arg.$list36);
                spec_col = current_$37.first();
                current_$37 = current_$37.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$37, datum, (SubLObject)preserves_genls_in_arg.$list36);
                mt = current_$37.first();
                current_$37 = current_$37.rest();
                if (preserves_genls_in_arg.NIL == current_$37) {
                    if (pgia_mt.eql(mt) && preserves_genls_in_arg.NIL == subl_promotions.memberP(spec_col, mt_specs, (SubLObject)preserves_genls_in_arg.UNPROVIDED, (SubLObject)preserves_genls_in_arg.UNPROVIDED)) {
                        final SubLObject _prev_bind_0 = control_vars.$pgia_activeP$.currentBinding(thread);
                        try {
                            control_vars.$pgia_activeP$.bind((SubLObject)preserves_genls_in_arg.NIL, thread);
                            final SubLObject gaf2 = (SubLObject)ConsesLow.list(preserves_genls_in_arg.$const11$genls, spec_nat, preserves_genls_in_arg.$pgia_nat_fort$.getDynamicValue(thread));
                            fi.fi_remove_argument_int(gaf2, mt, (SubLObject)ConsesLow.list(preserves_genls_in_arg.$pgia_gaf$.getDynamicValue(thread), (SubLObject)ConsesLow.listS((SubLObject)preserves_genls_in_arg.$kw23$GENLS, (SubLObject)ConsesLow.list(preserves_genls_in_arg.$const11$genls, cycl_utilities.nat_arg(spec_nat, preserves_genls_in_arg.$pgia_arg$.getDynamicValue(thread), (SubLObject)preserves_genls_in_arg.UNPROVIDED), preserves_genls_in_arg.$pgia_col$.getDynamicValue(thread)), mt, (SubLObject)preserves_genls_in_arg.$list32), fi.make_el_support((SubLObject)preserves_genls_in_arg.$kw30$CODE, conses_high.copy_tree(preserves_genls_in_arg.$pgia_rule$.getDynamicValue(thread)), preserves_genls_in_arg.$pgia_mt$.getGlobalValue(), (SubLObject)preserves_genls_in_arg.$kw33$DEFAULT)), (SubLObject)preserves_genls_in_arg.UNPROVIDED);
                        }
                        finally {
                            control_vars.$pgia_activeP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)preserves_genls_in_arg.$list36);
                }
                cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                current3 = cdolist_list_var_$36.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pgia_mt = cdolist_list_var.first();
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 19702L)
    public static SubLObject known_pgiaP(final SubLObject candidate, final SubLObject asserted, final SubLObject rel) {
        if (preserves_genls_in_arg.NIL != asserted) {
            SubLObject foundP = (SubLObject)preserves_genls_in_arg.NIL;
            SubLObject gaf = (SubLObject)preserves_genls_in_arg.NIL;
            SubLObject col = (SubLObject)preserves_genls_in_arg.NIL;
            SubLObject mt = (SubLObject)preserves_genls_in_arg.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(candidate, candidate, (SubLObject)preserves_genls_in_arg.$list37);
            gaf = candidate.first();
            SubLObject current = candidate.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, candidate, (SubLObject)preserves_genls_in_arg.$list37);
            col = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, candidate, (SubLObject)preserves_genls_in_arg.$list37);
            mt = current.first();
            current = current.rest();
            if (preserves_genls_in_arg.NIL == current) {
                SubLObject current_$39;
                final SubLObject datum_$38 = current_$39 = gaf;
                SubLObject pred = (SubLObject)preserves_genls_in_arg.NIL;
                SubLObject spec = (SubLObject)preserves_genls_in_arg.NIL;
                SubLObject genl = (SubLObject)preserves_genls_in_arg.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$39, datum_$38, (SubLObject)preserves_genls_in_arg.$list38);
                pred = current_$39.first();
                current_$39 = current_$39.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$39, datum_$38, (SubLObject)preserves_genls_in_arg.$list38);
                spec = current_$39.first();
                current_$39 = current_$39.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$39, datum_$38, (SubLObject)preserves_genls_in_arg.$list38);
                genl = current_$39.first();
                current_$39 = current_$39.rest();
                if (preserves_genls_in_arg.NIL == current_$39) {
                    if (preserves_genls_in_arg.NIL == foundP) {
                        SubLObject csome_list_var = asserted;
                        SubLObject natXcolXmt = (SubLObject)preserves_genls_in_arg.NIL;
                        natXcolXmt = csome_list_var.first();
                        while (preserves_genls_in_arg.NIL == foundP && preserves_genls_in_arg.NIL != csome_list_var) {
                            SubLObject current_$40;
                            final SubLObject datum_$39 = current_$40 = natXcolXmt;
                            SubLObject known_nat = (SubLObject)preserves_genls_in_arg.NIL;
                            SubLObject known_col = (SubLObject)preserves_genls_in_arg.NIL;
                            SubLObject known_mt = (SubLObject)preserves_genls_in_arg.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$40, datum_$39, (SubLObject)preserves_genls_in_arg.$list39);
                            known_nat = current_$40.first();
                            current_$40 = current_$40.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$40, datum_$39, (SubLObject)preserves_genls_in_arg.$list39);
                            known_col = current_$40.first();
                            current_$40 = current_$40.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$40, datum_$39, (SubLObject)preserves_genls_in_arg.$list39);
                            known_mt = current_$40.first();
                            current_$40 = current_$40.rest();
                            if (preserves_genls_in_arg.NIL == current_$40) {
                                if (mt.eql(known_mt)) {
                                    if (rel.eql((SubLObject)preserves_genls_in_arg.$kw23$GENLS)) {
                                        foundP = Equality.eq(spec, known_nat);
                                    }
                                    else if (rel.eql((SubLObject)preserves_genls_in_arg.$kw26$SPECS)) {
                                        foundP = Equality.eq(genl, known_nat);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$39, (SubLObject)preserves_genls_in_arg.$list39);
                            }
                            csome_list_var = csome_list_var.rest();
                            natXcolXmt = csome_list_var.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$38, (SubLObject)preserves_genls_in_arg.$list38);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(candidate, (SubLObject)preserves_genls_in_arg.$list37);
            }
            return foundP;
        }
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 20218L)
    public static SubLObject candidate_pgiaP(final SubLObject asserted, final SubLObject candidates, final SubLObject rel) {
        SubLObject foundP = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject known_nat = (SubLObject)preserves_genls_in_arg.NIL;
        SubLObject known_mt = (SubLObject)preserves_genls_in_arg.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(asserted, asserted, (SubLObject)preserves_genls_in_arg.$list40);
        known_nat = asserted.first();
        SubLObject current = asserted.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, asserted, (SubLObject)preserves_genls_in_arg.$list40);
        known_mt = current.first();
        current = current.rest();
        if (preserves_genls_in_arg.NIL == current) {
            if (preserves_genls_in_arg.NIL == foundP) {
                SubLObject csome_list_var = candidates;
                SubLObject candidate = (SubLObject)preserves_genls_in_arg.NIL;
                candidate = csome_list_var.first();
                while (preserves_genls_in_arg.NIL == foundP && preserves_genls_in_arg.NIL != csome_list_var) {
                    SubLObject current_$43;
                    final SubLObject datum_$42 = current_$43 = candidate;
                    SubLObject gaf = (SubLObject)preserves_genls_in_arg.NIL;
                    SubLObject col = (SubLObject)preserves_genls_in_arg.NIL;
                    SubLObject mt = (SubLObject)preserves_genls_in_arg.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$43, datum_$42, (SubLObject)preserves_genls_in_arg.$list37);
                    gaf = current_$43.first();
                    current_$43 = current_$43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$43, datum_$42, (SubLObject)preserves_genls_in_arg.$list37);
                    col = current_$43.first();
                    current_$43 = current_$43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$43, datum_$42, (SubLObject)preserves_genls_in_arg.$list37);
                    mt = current_$43.first();
                    current_$43 = current_$43.rest();
                    if (preserves_genls_in_arg.NIL == current_$43) {
                        if (mt.eql(known_mt)) {
                            SubLObject current_$44;
                            final SubLObject datum_$43 = current_$44 = gaf;
                            SubLObject pred = (SubLObject)preserves_genls_in_arg.NIL;
                            SubLObject spec = (SubLObject)preserves_genls_in_arg.NIL;
                            SubLObject genl = (SubLObject)preserves_genls_in_arg.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$44, datum_$43, (SubLObject)preserves_genls_in_arg.$list38);
                            pred = current_$44.first();
                            current_$44 = current_$44.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$44, datum_$43, (SubLObject)preserves_genls_in_arg.$list38);
                            spec = current_$44.first();
                            current_$44 = current_$44.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$44, datum_$43, (SubLObject)preserves_genls_in_arg.$list38);
                            genl = current_$44.first();
                            current_$44 = current_$44.rest();
                            if (preserves_genls_in_arg.NIL == current_$44) {
                                if (rel.eql((SubLObject)preserves_genls_in_arg.$kw23$GENLS)) {
                                    foundP = Equality.eq(spec, known_nat);
                                }
                                else if (rel.eql((SubLObject)preserves_genls_in_arg.$kw26$SPECS)) {
                                    foundP = Equality.eq(genl, known_nat);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$43, (SubLObject)preserves_genls_in_arg.$list38);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$42, (SubLObject)preserves_genls_in_arg.$list37);
                    }
                    csome_list_var = csome_list_var.rest();
                    candidate = csome_list_var.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(asserted, (SubLObject)preserves_genls_in_arg.$list40);
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/preserves-genls-in-arg.lisp", position = 20683L)
    public static SubLObject map_tous_of_fn_arg(final SubLObject function, final SubLObject v_term, final SubLObject arg, final SubLObject nat_fn) {
        return kb_mapping.map_nart_arg_index(function, v_term, arg, nat_fn);
    }
    
    public static SubLObject declare_preserves_genls_in_arg_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_after_adding_pgia", "PGIA-AFTER-ADDING-PGIA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_after_adding_pgia_1", "PGIA-AFTER-ADDING-PGIA-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_after_adding_pgia_2", "PGIA-AFTER-ADDING-PGIA-2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_after_adding_pgia_3", "PGIA-AFTER-ADDING-PGIA-3", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_after_adding_isa", "PGIA-AFTER-ADDING-ISA", 2, 0, false);
        new $pgia_after_adding_isa$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_after_adding_isa_1", "PGIA-AFTER-ADDING-ISA-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_after_adding_isa_2", "PGIA-AFTER-ADDING-ISA-2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_after_removing_genls", "PGIA-AFTER-REMOVING-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_after_removing_genls_1", "PGIA-AFTER-REMOVING-GENLS-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "candidate_pgia", "CANDIDATE-PGIA", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_true_in_mts", "PGIA-TRUE-IN-MTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "recompute_functor_pgia", "RECOMPUTE-FUNCTOR-PGIA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "recompute_functor_pgia_1", "RECOMPUTE-FUNCTOR-PGIA-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "recompute_nat_pgia", "RECOMPUTE-NAT-PGIA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "recompute_nat_pgia_1", "RECOMPUTE-NAT-PGIA-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "current_pgia_specs", "CURRENT-PGIA-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "current_pgia_genls", "CURRENT-PGIA-GENLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "gather_pgia", "GATHER-PGIA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_assertionP", "PGIA-ASSERTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_supportP", "PGIA-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "pgia_deductionP", "PGIA-DEDUCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "assert_candidate_pgia_genls", "ASSERT-CANDIDATE-PGIA-GENLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "assert_candidate_pgia_specs", "ASSERT-CANDIDATE-PGIA-SPECS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "known_pgiaP", "KNOWN-PGIA?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "candidate_pgiaP", "CANDIDATE-PGIA?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.preserves_genls_in_arg", "map_tous_of_fn_arg", "MAP-TOUS-OF-FN-ARG", 4, 0, false);
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    public static SubLObject init_preserves_genls_in_arg_file() {
        preserves_genls_in_arg.$pgia_fn$ = SubLFiles.defparameter("*PGIA-FN*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_gaf$ = SubLFiles.defparameter("*PGIA-GAF*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_arg$ = SubLFiles.defparameter("*PGIA-ARG*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_done$ = SubLFiles.defparameter("*PGIA-DONE*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_nat$ = SubLFiles.defparameter("*PGIA-NAT*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_nat_fort$ = SubLFiles.defparameter("*PGIA-NAT-FORT*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_col$ = SubLFiles.defparameter("*PGIA-COL*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_genl$ = SubLFiles.defparameter("*PGIA-GENL*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_genl_nat$ = SubLFiles.defparameter("*PGIA-GENL-NAT*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_genl_nats$ = SubLFiles.defparameter("*PGIA-GENL-NATS*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_spec$ = SubLFiles.defparameter("*PGIA-SPEC*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_spec_nat$ = SubLFiles.defparameter("*PGIA-SPEC-NAT*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_spec_nats$ = SubLFiles.defparameter("*PGIA-SPEC-NATS*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$candidate_pgia_genls$ = SubLFiles.defparameter("*CANDIDATE-PGIA-GENLS*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$candidate_pgia_specs$ = SubLFiles.defparameter("*CANDIDATE-PGIA-SPECS*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$consider_current_pgiaP$ = SubLFiles.defparameter("*CONSIDER-CURRENT-PGIA?*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$current_pgia_genls$ = SubLFiles.defparameter("*CURRENT-PGIA-GENLS*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$current_pgia_specs$ = SubLFiles.defparameter("*CURRENT-PGIA-SPECS*", (SubLObject)preserves_genls_in_arg.NIL);
        preserves_genls_in_arg.$pgia_mt$ = SubLFiles.deflexical("*PGIA-MT*", (preserves_genls_in_arg.NIL != Symbols.boundp((SubLObject)preserves_genls_in_arg.$sym0$_PGIA_MT_)) ? preserves_genls_in_arg.$pgia_mt$.getGlobalValue() : preserves_genls_in_arg.$const1$BaseKB);
        preserves_genls_in_arg.$pgia_rule$ = SubLFiles.defparameter("*PGIA-RULE*", (SubLObject)preserves_genls_in_arg.$list2);
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    public static SubLObject setup_preserves_genls_in_arg_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)preserves_genls_in_arg.$sym0$_PGIA_MT_);
        mt_vars.note_mt_var((SubLObject)preserves_genls_in_arg.$sym0$_PGIA_MT_, (SubLObject)preserves_genls_in_arg.NIL);
        utilities_macros.register_kb_function((SubLObject)preserves_genls_in_arg.$sym5$PGIA_AFTER_ADDING_PGIA);
        utilities_macros.register_kb_function((SubLObject)preserves_genls_in_arg.$sym19$PGIA_AFTER_ADDING_ISA);
        utilities_macros.register_kb_function((SubLObject)preserves_genls_in_arg.$sym22$PGIA_AFTER_REMOVING_GENLS);
        return (SubLObject)preserves_genls_in_arg.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_preserves_genls_in_arg_file();
    }
    
    @Override
	public void initializeVariables() {
        init_preserves_genls_in_arg_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_preserves_genls_in_arg_file();
    }
    
    static {
        me = (SubLFile)new preserves_genls_in_arg();
        preserves_genls_in_arg.$pgia_fn$ = null;
        preserves_genls_in_arg.$pgia_gaf$ = null;
        preserves_genls_in_arg.$pgia_arg$ = null;
        preserves_genls_in_arg.$pgia_done$ = null;
        preserves_genls_in_arg.$pgia_nat$ = null;
        preserves_genls_in_arg.$pgia_nat_fort$ = null;
        preserves_genls_in_arg.$pgia_col$ = null;
        preserves_genls_in_arg.$pgia_genl$ = null;
        preserves_genls_in_arg.$pgia_genl_nat$ = null;
        preserves_genls_in_arg.$pgia_genl_nats$ = null;
        preserves_genls_in_arg.$pgia_spec$ = null;
        preserves_genls_in_arg.$pgia_spec_nat$ = null;
        preserves_genls_in_arg.$pgia_spec_nats$ = null;
        preserves_genls_in_arg.$candidate_pgia_genls$ = null;
        preserves_genls_in_arg.$candidate_pgia_specs$ = null;
        preserves_genls_in_arg.$consider_current_pgiaP$ = null;
        preserves_genls_in_arg.$current_pgia_genls$ = null;
        preserves_genls_in_arg.$current_pgia_specs$ = null;
        preserves_genls_in_arg.$pgia_mt$ = null;
        preserves_genls_in_arg.$pgia_rule$ = null;
        $sym0$_PGIA_MT_ = SubLObjectFactory.makeSymbol("*PGIA-MT*");
        $const1$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $list2 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preservesGenlsInArg")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)preserves_genls_in_arg.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT-1")), (SubLObject)SubLObjectFactory.makeSymbol("?ARG")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)preserves_genls_in_arg.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT-1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)preserves_genls_in_arg.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("?NAT-2"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-1"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)SubLObjectFactory.makeSymbol("?ARG"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)SubLObjectFactory.makeSymbol("?ARG"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-2")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-1"), (SubLObject)SubLObjectFactory.makeSymbol("?NAT-2")));
        $sym3$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym4$PGIA_AFTER_ADDING_PGIA_1 = SubLObjectFactory.makeSymbol("PGIA-AFTER-ADDING-PGIA-1");
        $sym5$PGIA_AFTER_ADDING_PGIA = SubLObjectFactory.makeSymbol("PGIA-AFTER-ADDING-PGIA");
        $sym6$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const7$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym8$PGIA_AFTER_ADDING_PGIA_2 = SubLObjectFactory.makeSymbol("PGIA-AFTER-ADDING-PGIA-2");
        $sym9$SBHL_UNRECORDED_NODE_P = SubLObjectFactory.makeSymbol("SBHL-UNRECORDED-NODE-P");
        $sym10$PGIA_AFTER_ADDING_PGIA_3 = SubLObjectFactory.makeSymbol("PGIA-AFTER-ADDING-PGIA-3");
        $const11$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym12$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $sym13$NOT_EQ = SubLObjectFactory.makeSymbol("NOT-EQ");
        $const14$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const15$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym16$PGIA_AFTER_ADDING_ISA_1 = SubLObjectFactory.makeSymbol("PGIA-AFTER-ADDING-ISA-1");
        $const17$preservesGenlsInArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preservesGenlsInArg"));
        $kw18$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym19$PGIA_AFTER_ADDING_ISA = SubLObjectFactory.makeSymbol("PGIA-AFTER-ADDING-ISA");
        $sym20$PGIA_AFTER_ADDING_ISA_2 = SubLObjectFactory.makeSymbol("PGIA-AFTER-ADDING-ISA-2");
        $sym21$PGIA_AFTER_REMOVING_GENLS_1 = SubLObjectFactory.makeSymbol("PGIA-AFTER-REMOVING-GENLS-1");
        $sym22$PGIA_AFTER_REMOVING_GENLS = SubLObjectFactory.makeSymbol("PGIA-AFTER-REMOVING-GENLS");
        $kw23$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $str24$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str25$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $kw26$SPECS = SubLObjectFactory.makeKeyword("SPECS");
        $sym27$RECOMPUTE_FUNCTOR_PGIA_1 = SubLObjectFactory.makeSymbol("RECOMPUTE-FUNCTOR-PGIA-1");
        $sym28$RECOMPUTE_NAT_PGIA_1 = SubLObjectFactory.makeSymbol("RECOMPUTE-NAT-PGIA-1");
        $sym29$GATHER_PGIA = SubLObjectFactory.makeSymbol("GATHER-PGIA");
        $kw30$CODE = SubLObjectFactory.makeKeyword("CODE");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-COL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"));
        $kw33$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-NAT"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-COL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-COL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-NAT"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-COL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF"), (SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GENL"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KNOWN-NAT"), (SubLObject)SubLObjectFactory.makeSymbol("KNOWN-COL"), (SubLObject)SubLObjectFactory.makeSymbol("KNOWN-MT"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KNOWN-NAT"), (SubLObject)SubLObjectFactory.makeSymbol("KNOWN-MT"));
    }
    
    public static final class $pgia_after_adding_isa$BinaryFunction extends BinaryFunction
    {
        public $pgia_after_adding_isa$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PGIA-AFTER-ADDING-ISA"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return preserves_genls_in_arg.pgia_after_adding_isa(arg1, arg2);
        }
    }
}

/*

	Total time: 840 ms
	
*/