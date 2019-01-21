package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ke_tools extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.ke_tools";
    public static final String myFingerPrint = "615771f23dda87d5d6d3ebe9da3843ecf29c738d8d79e9ef2e74d9fd93f0faf0";
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 8768L)
    private static SubLSymbol $fort1_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 8810L)
    private static SubLSymbol $fort2_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 8851L)
    private static SubLSymbol $forts_candidate_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 23007L)
    private static SubLSymbol $cached_pred_args_isa_accessed_in_spacesP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 24103L)
    private static SubLSymbol $cached_pred_args_genls_accessed_in_spacesP_caching_state$;
    private static final SubLSymbol $kw0$BOGUS;
    private static final SubLSymbol $kw1$FREE;
    private static final SubLSymbol $kw2$ALL;
    private static final SubLSymbol $kw3$MIXED;
    private static final SubLSymbol $sym4$FORT_P;
    private static final SubLSymbol $kw5$FIGURATIVE;
    private static final SubLSymbol $kw6$LITERAL;
    private static final SubLSymbol $sym7$PREDS_FOR_PAIR;
    private static final SubLList $list8;
    private static final SubLString $str9$Return_a_list_of_the_predicates_r;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const13$EverythingPSC;
    private static final SubLObject $const14$genls;
    private static final SubLSymbol $sym15$GATHER_ACCESSED_ARG_ISA_OF_PREDS;
    private static final SubLObject $const16$genlPreds;
    private static final SubLInteger $int17$512;
    private static final SubLSymbol $sym18$GATHER_ARG_ISA_PREDS_OF_COLLECTION;
    private static final SubLSymbol $sym19$GATHER_ARG_ISA_PREDS_OF_COLLECTION_INT;
    private static final SubLObject $const20$argIsa;
    private static final SubLSymbol $kw21$TRUE;
    private static final SubLObject $const22$isa;
    private static final SubLSymbol $sym23$GATHER_COL_LEGAL_PREDS;
    private static final SubLSymbol $sym24$NEW_NOTE_PREDS_W_ACCESSED_ARG_CONSTRAINT;
    private static final SubLSymbol $sym25$GATHER_PREDS_CONSTRAINED_BY_SUPERIORS_OF_DEFN_ADMITTED;
    private static final SubLSymbol $sym26$GATHER_ACCESSED_ARG_CONSTRAINED_BY_PREDS;
    private static final SubLSymbol $sym27$UNRECORD_ALL_SUPERIORS_AS_UNSEARCHED_IGNORE_ARG2;
    private static final SubLSymbol $sym28$GATHER_PREDS_W_ACCESSED_ARG_CONSTRAINT;
    private static final SubLObject $const29$ArgIsaBinaryPredicate;
    private static final SubLObject $const30$ArgGenlBinaryPredicate;
    private static final SubLSymbol $sym31$CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES_;
    private static final SubLSymbol $sym32$_CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES__CACHING_STATE_;
    private static final SubLInteger $int33$4096;
    private static final SubLInteger $int34$2048;
    private static final SubLSymbol $sym35$CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES_;
    private static final SubLSymbol $sym36$_CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES__CACHING_STATE_;
    private static final SubLSymbol $sym37$NON_SEARCHED_ARG_;
    private static final SubLObject $const38$transitiveViaArg;
    private static final SubLObject $const39$transitiveViaArgInverse;
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 689L)
    public static SubLObject why_not_wff_assertion(final SubLObject assertion) {
        return wff.why_not_wff(fi.assertion_fi_formula(assertion, (SubLObject)ke_tools.UNPROVIDED), assertions_high.assertion_mt(assertion), (SubLObject)ke_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 1472L)
    public static SubLObject bogus_assertionP(final SubLObject assertion) {
        if (ke_tools.NIL != assertion_handles.assertion_p(assertion)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(ke_tools.$kw0$BOGUS.eql(assertions_low.assertion_formula_data(assertion)) || ke_tools.$kw0$BOGUS.eql(assertions_high.assertion_mt(assertion)));
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 1654L)
    public static SubLObject free_assertionP(final SubLObject assertion) {
        if (ke_tools.NIL != assertion_handles.assertion_p(assertion)) {
            return Equality.eql((SubLObject)ke_tools.$kw1$FREE, assertions_low.assertion_formula_data(assertion));
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 1783L)
    public static SubLObject preds_for_pair(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt, SubLObject mode) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.$kw2$ALL;
        }
        if (mode == ke_tools.UNPROVIDED) {
            mode = (SubLObject)ke_tools.$kw3$MIXED;
        }
        enforceType(fort_1, ke_tools.$sym4$FORT_P);
        enforceType(fort_2, ke_tools.$sym4$FORT_P);
        final SubLObject pcase_var = mode;
        if (pcase_var.eql((SubLObject)ke_tools.$kw5$FIGURATIVE)) {
            return preds_of_instances(fort_1, fort_2, mt);
        }
        if (pcase_var.eql((SubLObject)ke_tools.$kw6$LITERAL)) {
            return preds_of_constants(fort_1, fort_2, mt);
        }
        if (pcase_var.eql((SubLObject)ke_tools.$kw3$MIXED)) {
            return preds_of_referents(fort_1, fort_2, mt);
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 2595L)
    public static SubLObject preds_of_instances(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.$kw2$ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke_tools.NIL != forts.fort_p(col_1) : col_1;
        assert ke_tools.NIL != forts.fort_p(col_2) : col_2;
        SubLObject preds = (SubLObject)ke_tools.NIL;
        if (ke_tools.NIL != hlmt.hlmt_equal((SubLObject)ke_tools.$kw2$ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_tools.$sym12$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(ke_tools.$const13$EverythingPSC, thread);
                preds = preds_of_instances_int(col_1, col_2, (SubLObject)ke_tools.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (ke_tools.NIL != hlmt.hlmt_p(mt)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                preds = preds_of_instances_int(col_1, col_2, (SubLObject)ke_tools.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 3995L)
    public static SubLObject preds_of_instances_int(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = (SubLObject)ke_tools.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)ke_tools.NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$7 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)ke_tools.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), thread);
                                    preds = preds_of_instances_in_space_1(col_1, col_2);
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$7, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
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
                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$3, thread);
                            sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$2, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                if (ke_tools.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (ke_tools.NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.min_predicates(preds, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
        }
        if (ke_tools.NIL != sbhl_search_vars.$maximize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.max_predicates(preds, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 4516L)
    public static SubLObject preds_of_instances_in_space_1(final SubLObject col_1, final SubLObject col_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), col_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_instances_in_space_2(col_1, col_2);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$10, thread);
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), col_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 4920L)
    public static SubLObject preds_of_instances_in_space_2(final SubLObject col_1, final SubLObject col_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), col_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread), thread);
                    preds = preds_of_instances_in_spaces(col_1, col_2);
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$12, thread);
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), col_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 5325L)
    public static SubLObject preds_of_instances_in_spaces(final SubLObject col_1, final SubLObject col_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            SubLObject cdolist_list_var = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
            SubLObject ceiling = (SubLObject)ke_tools.NIL;
            ceiling = cdolist_list_var.first();
            while (ke_tools.NIL != cdolist_list_var) {
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), ceiling, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                ceiling = cdolist_list_var.first();
            }
            final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_result$.bind((SubLObject)ke_tools.NIL, thread);
                try {
                    genls.map_union_all_genls((SubLObject)ConsesLow.list(col_1, col_2), Symbols.symbol_function((SubLObject)ke_tools.$sym15$GATHER_ACCESSED_ARG_ISA_OF_PREDS), (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                }
                finally {
                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        preds = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            }
            finally {
                sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                clear_pred_args_constraints_accessed_in_spacesP();
                if (ke_tools.NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
                    SubLObject cdolist_list_var2 = preds;
                    SubLObject pred = (SubLObject)ke_tools.NIL;
                    pred = cdolist_list_var2.first();
                    while (ke_tools.NIL != cdolist_list_var2) {
                        sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const16$genlPreds), pred, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pred = cdolist_list_var2.first();
                    }
                }
                SubLObject cdolist_list_var2 = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
                SubLObject ceiling2 = (SubLObject)ke_tools.NIL;
                ceiling2 = cdolist_list_var2.first();
                while (ke_tools.NIL != cdolist_list_var2) {
                    sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), ceiling2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    ceiling2 = cdolist_list_var2.first();
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 6003L)
    public static SubLObject arg_isa_preds_of_collection_table(final SubLObject collection, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.$kw2$ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke_tools.NIL != forts.fort_p(collection) : collection;
        SubLObject preds = (SubLObject)ke_tools.NIL;
        if (ke_tools.NIL != hlmt.hlmt_equal((SubLObject)ke_tools.$kw2$ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_tools.$sym12$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(ke_tools.$const13$EverythingPSC, thread);
                preds = arg_isa_preds_of_collection_table_int(collection);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (ke_tools.NIL != hlmt.hlmt_p(mt)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                preds = arg_isa_preds_of_collection_table_int(collection);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
        }
        else if (ke_tools.NIL == mt) {
            preds = arg_isa_preds_of_collection_table_int(collection);
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 6659L)
    public static SubLObject arg_isa_preds_of_collection_table_int(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table = (SubLObject)ke_tools.NIL;
        final SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
        try {
            control_vars.$mapping_answer$.bind(Hashtables.make_hash_table((SubLObject)ke_tools.$int17$512, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), thread);
            final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    genls.map_all_genls(Symbols.symbol_function((SubLObject)ke_tools.$sym18$GATHER_ARG_ISA_PREDS_OF_COLLECTION), collection, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                }
                finally {
                    final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$14, thread);
            }
            table = control_vars.$mapping_answer$.getDynamicValue(thread);
        }
        finally {
            control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 6946L)
    public static SubLObject gather_arg_isa_preds_of_collection(final SubLObject collection) {
        kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)ke_tools.$sym19$GATHER_ARG_ISA_PREDS_OF_COLLECTION_INT), collection, (SubLObject)ke_tools.THREE_INTEGER, ke_tools.$const20$argIsa, (SubLObject)ke_tools.$kw21$TRUE, (SubLObject)ke_tools.UNPROVIDED);
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 7115L)
    public static SubLObject gather_arg_isa_preds_of_collection_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_tools.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject argnum = (SubLObject)((ke_tools.NIL != forts.fort_p(relation)) ? assertions_high.gaf_arg2(assertion) : ke_tools.NIL);
            final SubLObject collection = (SubLObject)(argnum.isInteger() ? assertions_high.gaf_arg3(assertion) : ke_tools.NIL);
            if (ke_tools.NIL != forts.fort_p(collection) && ke_tools.NIL != term.kb_predicateP(relation)) {
                hash_table_utilities.pushnew_hash(relation, argnum, control_vars.$mapping_answer$.getDynamicValue(thread), (SubLObject)ke_tools.UNPROVIDED);
            }
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 7527L)
    public static SubLObject legal_preds_of_forts_isa(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.$kw2$ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke_tools.NIL != forts.fort_p(fort_1) : fort_1;
        assert ke_tools.NIL != forts.fort_p(fort_2) : fort_2;
        SubLObject preds = (SubLObject)ke_tools.NIL;
        if (ke_tools.NIL != hlmt.hlmt_equal((SubLObject)ke_tools.$kw2$ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_tools.$sym12$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(ke_tools.$const13$EverythingPSC, thread);
                preds = legal_preds_of_forts_int(fort_1, fort_2);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (ke_tools.NIL != hlmt.hlmt_p(mt)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                preds = legal_preds_of_forts_int(fort_1, fort_2);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 8902L)
    public static SubLObject legal_preds_of_forts_int(final SubLObject fort1, final SubLObject fort2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$16 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$18 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$19 = ke_tools.$fort1_preds$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = ke_tools.$fort2_preds$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = ke_tools.$forts_candidate_preds$.currentBinding(thread);
                                try {
                                    ke_tools.$fort1_preds$.bind(Hashtables.make_hash_table((SubLObject)ke_tools.$int17$512, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), thread);
                                    ke_tools.$fort2_preds$.bind(Hashtables.make_hash_table((SubLObject)ke_tools.$int17$512, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), thread);
                                    ke_tools.$forts_candidate_preds$.bind(Hashtables.make_hash_table((SubLObject)ke_tools.$int17$512, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), thread);
                                    final SubLObject _prev_bind_0_$20 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            final SubLObject _prev_bind_0_$21 = sbhl_marking_vars.$sbhl_space_3$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space_3$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                final SubLObject _prev_bind_0_$22 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    try {
                                                        isa.map_all_isa(Symbols.symbol_function((SubLObject)ke_tools.$sym23$GATHER_COL_LEGAL_PREDS), fort1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                                                            final SubLObject _values = Values.getValuesAsVector();
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$22, thread);
                                                }
                                                final SubLObject _prev_bind_0_$24 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    try {
                                                        isa.map_all_isa(Symbols.symbol_function((SubLObject)ke_tools.$sym23$GATHER_COL_LEGAL_PREDS), fort2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                                                            final SubLObject _values2 = Values.getValuesAsVector();
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                            Values.restoreValuesFromVector(_values2);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$24, thread);
                                                }
                                            }
                                            finally {
                                                sbhl_marking_vars.$sbhl_space_3$.rebind(_prev_bind_0_$21, thread);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                                                final SubLObject _values3 = Values.getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                Values.restoreValuesFromVector(_values3);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$20, thread);
                                    }
                                    final SubLObject cdohash_table = ke_tools.$forts_candidate_preds$.getDynamicValue(thread);
                                    SubLObject candidate = (SubLObject)ke_tools.NIL;
                                    SubLObject value = (SubLObject)ke_tools.NIL;
                                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                    try {
                                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                            candidate = Hashtables.getEntryKey(cdohash_entry);
                                            value = Hashtables.getEntryValue(cdohash_entry);
                                            final SubLObject fort1_args = Hashtables.gethash(candidate, ke_tools.$fort1_preds$.getDynamicValue(thread), (SubLObject)ke_tools.UNPROVIDED);
                                            final SubLObject fort2_args = (SubLObject)((ke_tools.NIL != fort1_args) ? Hashtables.gethash(candidate, ke_tools.$fort2_preds$.getDynamicValue(thread), (SubLObject)ke_tools.UNPROVIDED) : ke_tools.NIL);
                                            final SubLObject deltaP = (SubLObject)((ke_tools.NIL != fort2_args) ? SubLObjectFactory.makeBoolean(ke_tools.NIL != conses_high.second(fort1_args) || ke_tools.NIL != conses_high.second(fort2_args) || !fort1_args.first().eql(fort2_args.first())) : ke_tools.NIL);
                                            if (ke_tools.NIL != deltaP) {
                                                preds = (SubLObject)ConsesLow.cons(candidate, preds);
                                            }
                                        }
                                    }
                                    finally {
                                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                                finally {
                                    ke_tools.$forts_candidate_preds$.rebind(_prev_bind_3, thread);
                                    ke_tools.$fort2_preds$.rebind(_prev_bind_2, thread);
                                    ke_tools.$fort1_preds$.rebind(_prev_bind_0_$19, thread);
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$17, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_$16, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                    final SubLObject _values5 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values5);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 10054L)
    public static SubLObject gather_col_legal_preds(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_tools.NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, sbhl_marking_vars.$sbhl_space_3$.getDynamicValue(thread))) {
            sbhl_marking_methods.sbhl_record_node(col, sbhl_marking_vars.$sbhl_space_3$.getDynamicValue(thread));
            kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)ke_tools.$sym24$NEW_NOTE_PREDS_W_ACCESSED_ARG_CONSTRAINT), col, (SubLObject)ke_tools.THREE_INTEGER, ke_tools.$const20$argIsa, (SubLObject)ke_tools.$kw21$TRUE, (SubLObject)ke_tools.UNPROVIDED);
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 10297L)
    public static SubLObject preds_of_forts(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.$kw2$ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke_tools.NIL != forts.fort_p(fort_1) : fort_1;
        assert ke_tools.NIL != forts.fort_p(fort_2) : fort_2;
        SubLObject preds = (SubLObject)ke_tools.NIL;
        if (ke_tools.NIL != hlmt.hlmt_equal((SubLObject)ke_tools.$kw2$ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_tools.$sym12$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(ke_tools.$const13$EverythingPSC, thread);
                preds = preds_of_forts_int(fort_1, fort_2);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (ke_tools.NIL != hlmt.hlmt_p(mt)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                preds = preds_of_forts_int(fort_1, fort_2);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 10872L)
    public static SubLObject preds_of_forts_int(final SubLObject fort1, final SubLObject fort2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$29 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$31 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$32 = ke_tools.$fort1_preds$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = ke_tools.$fort2_preds$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = ke_tools.$forts_candidate_preds$.currentBinding(thread);
                                try {
                                    ke_tools.$fort1_preds$.bind(Hashtables.make_hash_table((SubLObject)ke_tools.$int17$512, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), thread);
                                    ke_tools.$fort2_preds$.bind(Hashtables.make_hash_table((SubLObject)ke_tools.$int17$512, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), thread);
                                    ke_tools.$forts_candidate_preds$.bind(Hashtables.make_hash_table((SubLObject)ke_tools.$int17$512, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), thread);
                                    kb_mapping.map_predicate_extent_index(Symbols.symbol_function((SubLObject)ke_tools.$sym24$NEW_NOTE_PREDS_W_ACCESSED_ARG_CONSTRAINT), ke_tools.$const20$argIsa, (SubLObject)ke_tools.$kw21$TRUE, (SubLObject)ke_tools.UNPROVIDED);
                                    final SubLObject cdohash_table = ke_tools.$forts_candidate_preds$.getDynamicValue(thread);
                                    SubLObject candidate = (SubLObject)ke_tools.NIL;
                                    SubLObject value = (SubLObject)ke_tools.NIL;
                                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                    try {
                                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                            candidate = Hashtables.getEntryKey(cdohash_entry);
                                            value = Hashtables.getEntryValue(cdohash_entry);
                                            final SubLObject fort1_args = Hashtables.gethash(candidate, ke_tools.$fort1_preds$.getDynamicValue(thread), (SubLObject)ke_tools.UNPROVIDED);
                                            final SubLObject fort2_args = (SubLObject)((ke_tools.NIL != fort1_args) ? Hashtables.gethash(candidate, ke_tools.$fort2_preds$.getDynamicValue(thread), (SubLObject)ke_tools.UNPROVIDED) : ke_tools.NIL);
                                            final SubLObject deltaP = (SubLObject)((ke_tools.NIL != fort2_args) ? SubLObjectFactory.makeBoolean(ke_tools.NIL != conses_high.second(fort1_args) || ke_tools.NIL != conses_high.second(fort2_args) || !fort1_args.first().eql(fort2_args.first())) : ke_tools.NIL);
                                            if (ke_tools.NIL != deltaP) {
                                                preds = (SubLObject)ConsesLow.cons(candidate, preds);
                                            }
                                        }
                                    }
                                    finally {
                                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                                finally {
                                    ke_tools.$forts_candidate_preds$.rebind(_prev_bind_3, thread);
                                    ke_tools.$fort2_preds$.rebind(_prev_bind_2, thread);
                                    ke_tools.$fort1_preds$.rebind(_prev_bind_0_$32, thread);
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0_$31, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$30, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_$29, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 11887L)
    public static SubLObject new_note_preds_wXaccessed_arg_constraint(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_tools.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject argnum = (SubLObject)((ke_tools.NIL != forts.fort_p(relation)) ? assertions_high.gaf_arg2(assertion) : ke_tools.NIL);
            final SubLObject collection = (SubLObject)(argnum.isInteger() ? assertions_high.gaf_arg3(assertion) : ke_tools.NIL);
            SubLObject candidateP = (SubLObject)ke_tools.NIL;
            if (ke_tools.NIL != forts.fort_p(collection) && ke_tools.NIL != term.kb_predicateP(relation)) {
                if (ke_tools.NIL != sbhl_marking_methods.sbhl_recorded_node_p(collection, sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread))) {
                    hash_table_utilities.pushnew_hash(relation, argnum, ke_tools.$fort1_preds$.getDynamicValue(thread), (SubLObject)ke_tools.UNPROVIDED);
                    candidateP = (SubLObject)ke_tools.T;
                }
                if (ke_tools.NIL != sbhl_marking_vars.sbhl_table_p(sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread)) && ke_tools.NIL != sbhl_marking_methods.sbhl_recorded_node_p(collection, sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread))) {
                    hash_table_utilities.pushnew_hash(relation, argnum, ke_tools.$fort2_preds$.getDynamicValue(thread), (SubLObject)ke_tools.UNPROVIDED);
                    candidateP = (SubLObject)ke_tools.T;
                }
                if (ke_tools.NIL != candidateP) {
                    Hashtables.sethash(relation, ke_tools.$forts_candidate_preds$.getDynamicValue(thread), (SubLObject)ke_tools.T);
                }
            }
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 12648L)
    public static SubLObject preds_of_constants(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.$kw2$ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke_tools.NIL != forts.fort_p(fort_1) : fort_1;
        assert ke_tools.NIL != forts.fort_p(fort_2) : fort_2;
        SubLObject preds = (SubLObject)ke_tools.NIL;
        if (ke_tools.NIL != hlmt.hlmt_equal((SubLObject)ke_tools.$kw2$ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_tools.$sym12$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(ke_tools.$const13$EverythingPSC, thread);
                preds = preds_of_constants_int(fort_1, fort_2, (SubLObject)ke_tools.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (ke_tools.NIL != hlmt.hlmt_p(mt)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                preds = preds_of_constants_int(fort_1, fort_2, (SubLObject)ke_tools.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 13056L)
    public static SubLObject preds_of_constants_int(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = (SubLObject)ke_tools.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$36 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)ke_tools.NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$36 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$37 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$41 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)ke_tools.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), thread);
                                    preds = preds_of_constants_in_space_1(fort_1, fort_2);
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$41, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$38, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$37, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$37, thread);
                            sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$36, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$36, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$35, thread);
                }
            }
            finally {
                if (ke_tools.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (ke_tools.NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.min_predicates(preds, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
        }
        if (ke_tools.NIL != sbhl_search_vars.$maximize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.max_predicates(preds, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 13589L)
    public static SubLObject preds_of_constants_in_space_1(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_constants_in_space_2(fort_1, fort_2);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$44, thread);
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 13995L)
    public static SubLObject preds_of_constants_in_space_2(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_constants_in_space_3(fort_1, fort_2);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$46, thread);
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 14401L)
    public static SubLObject preds_of_constants_in_space_3(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_3$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_3$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_constants_in_space_4(fort_1, fort_2);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$48, thread);
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space_3$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 14811L)
    public static SubLObject preds_of_constants_in_space_4(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_4$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_4$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread), thread);
                    preds = preds_of_constants_in_spaces(fort_1, fort_2);
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$50, thread);
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space_4$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 15222L)
    public static SubLObject preds_of_constants_in_spaces(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = at_vars.$at_arg1$.currentBinding(thread);
            final SubLObject _prev_bind_2 = at_vars.$at_arg2$.currentBinding(thread);
            try {
                at_vars.$at_arg1$.bind(fort_1, thread);
                at_vars.$at_arg2$.bind(fort_2, thread);
                SubLObject cdolist_list_var = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
                SubLObject ceiling = (SubLObject)ke_tools.NIL;
                ceiling = cdolist_list_var.first();
                while (ke_tools.NIL != cdolist_list_var) {
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), ceiling, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    ceiling = cdolist_list_var.first();
                }
                final SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_result$.bind((SubLObject)ke_tools.NIL, thread);
                    try {
                        if (ke_tools.NIL != at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
                            at_defns.map_sufficient_defn_cols(Symbols.symbol_function((SubLObject)ke_tools.$sym25$GATHER_PREDS_CONSTRAINED_BY_SUPERIORS_OF_DEFN_ADMITTED));
                        }
                        genls.map_union_all_genls((SubLObject)ConsesLow.cons(fort_1, (SubLObject)ConsesLow.cons(fort_2, ConsesLow.nconc(isa.isa(fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), isa.isa(fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED)))), Symbols.symbol_function((SubLObject)ke_tools.$sym26$GATHER_ACCESSED_ARG_CONSTRAINED_BY_PREDS), (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            preds = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                        }
                    }
                }
                finally {
                    sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$51, thread);
                }
            }
            finally {
                at_vars.$at_arg2$.rebind(_prev_bind_2, thread);
                at_vars.$at_arg1$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                clear_pred_args_constraints_accessed_in_spacesP();
                if (ke_tools.NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
                    SubLObject cdolist_list_var2 = preds;
                    SubLObject pred = (SubLObject)ke_tools.NIL;
                    pred = cdolist_list_var2.first();
                    while (ke_tools.NIL != cdolist_list_var2) {
                        sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const16$genlPreds), pred, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pred = cdolist_list_var2.first();
                    }
                }
                SubLObject cdolist_list_var2 = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
                SubLObject ceiling2 = (SubLObject)ke_tools.NIL;
                ceiling2 = cdolist_list_var2.first();
                while (ke_tools.NIL != cdolist_list_var2) {
                    sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), ceiling2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    ceiling2 = cdolist_list_var2.first();
                }
                if (ke_tools.NIL != at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
                    final SubLObject _prev_bind_0_$53 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)ke_tools.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), thread);
                        at_defns.map_sufficient_defn_cols(Symbols.symbol_function((SubLObject)ke_tools.$sym27$UNRECORD_ALL_SUPERIORS_AS_UNSEARCHED_IGNORE_ARG2));
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_7, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$53, thread);
                    }
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 16282L)
    public static SubLObject preds_of_referents(final SubLObject fort_1, final SubLObject fort_2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert ke_tools.NIL != forts.fort_p(fort_1) : fort_1;
        assert ke_tools.NIL != forts.fort_p(fort_2) : fort_2;
        SubLObject preds = (SubLObject)ke_tools.NIL;
        if (ke_tools.NIL != hlmt.hlmt_equal((SubLObject)ke_tools.$kw2$ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)ke_tools.$sym12$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(ke_tools.$const13$EverythingPSC, thread);
                preds = preds_of_refererents_int(fort_1, fort_2, (SubLObject)ke_tools.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (ke_tools.NIL != hlmt.hlmt_p(mt)) {
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                preds = preds_of_refererents_int(fort_1, fort_2, (SubLObject)ke_tools.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 17220L)
    public static SubLObject preds_of_refererents_int(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = (SubLObject)ke_tools.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$54 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$55 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)ke_tools.NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$55 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$56 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$60 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)ke_tools.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), thread);
                                    preds = preds_of_refererents_in_space_1(fort_1, fort_2);
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$60, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$57, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$56, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$56, thread);
                            sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$55, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$55, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$54, thread);
                }
            }
            finally {
                if (ke_tools.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (ke_tools.NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.min_predicates(preds, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
        }
        if (ke_tools.NIL != sbhl_search_vars.$maximize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.max_predicates(preds, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 17728L)
    public static SubLObject preds_of_refererents_in_space_1(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$63 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_refererents_in_space_2(fort_1, fort_2);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$63, thread);
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 18298L)
    public static SubLObject preds_of_refererents_in_space_2(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$65 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_refererents_in_space_3(fort_1, fort_2);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$65, thread);
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const22$isa), fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 18868L)
    public static SubLObject preds_of_refererents_in_space_3(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_3$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_3$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_refererents_in_space_4(fort_1, fort_2);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$67, thread);
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space_3$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 19284L)
    public static SubLObject preds_of_refererents_in_space_4(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_4$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_4$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$69 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread), thread);
                    preds = preds_of_refererents_in_spaces(fort_1, fort_2);
                }
                finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$69, thread);
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space_4$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 19699L)
    public static SubLObject preds_of_refererents_in_spaces(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)ke_tools.NIL;
        try {
            final SubLObject _prev_bind_0 = at_vars.$at_arg1$.currentBinding(thread);
            final SubLObject _prev_bind_2 = at_vars.$at_arg2$.currentBinding(thread);
            try {
                at_vars.$at_arg1$.bind(fort_1, thread);
                at_vars.$at_arg2$.bind(fort_2, thread);
                SubLObject cdolist_list_var = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
                SubLObject ceiling = (SubLObject)ke_tools.NIL;
                ceiling = cdolist_list_var.first();
                while (ke_tools.NIL != cdolist_list_var) {
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), ceiling, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    ceiling = cdolist_list_var.first();
                }
                final SubLObject _prev_bind_0_$70 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_result$.bind((SubLObject)ke_tools.NIL, thread);
                    try {
                        if (ke_tools.NIL != at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
                            at_defns.map_sufficient_defn_cols(Symbols.symbol_function((SubLObject)ke_tools.$sym25$GATHER_PREDS_CONSTRAINED_BY_SUPERIORS_OF_DEFN_ADMITTED));
                        }
                        genls.map_union_all_genls((SubLObject)ConsesLow.cons(fort_1, (SubLObject)ConsesLow.cons(fort_2, ConsesLow.nconc(isa.isa(fort_1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), isa.isa(fort_2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED)))), Symbols.symbol_function((SubLObject)ke_tools.$sym26$GATHER_ACCESSED_ARG_CONSTRAINED_BY_PREDS), (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            preds = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                        }
                    }
                }
                finally {
                    sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$70, thread);
                }
            }
            finally {
                at_vars.$at_arg2$.rebind(_prev_bind_2, thread);
                at_vars.$at_arg1$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                clear_pred_args_constraints_accessed_in_spacesP();
                if (ke_tools.NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
                    SubLObject cdolist_list_var2 = preds;
                    SubLObject pred = (SubLObject)ke_tools.NIL;
                    pred = cdolist_list_var2.first();
                    while (ke_tools.NIL != cdolist_list_var2) {
                        sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const16$genlPreds), pred, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pred = cdolist_list_var2.first();
                    }
                }
                SubLObject cdolist_list_var2 = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
                SubLObject ceiling2 = (SubLObject)ke_tools.NIL;
                ceiling2 = cdolist_list_var2.first();
                while (ke_tools.NIL != cdolist_list_var2) {
                    sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), ceiling2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    ceiling2 = cdolist_list_var2.first();
                }
                if (ke_tools.NIL != at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
                    final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)ke_tools.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(ke_tools.$const14$genls), thread);
                        at_defns.map_sufficient_defn_cols(Symbols.symbol_function((SubLObject)ke_tools.$sym27$UNRECORD_ALL_SUPERIORS_AS_UNSEARCHED_IGNORE_ARG2));
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_7, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$72, thread);
                    }
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 20771L)
    public static SubLObject gather_preds_constrained_by_superiors_of_defn_admitted(final SubLObject col, final SubLObject defn_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_tools.NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, (SubLObject)ke_tools.UNPROVIDED)) {
            SubLObject admitsP = (SubLObject)ke_tools.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    admitsP = (SubLObject)SubLObjectFactory.makeBoolean(ke_tools.NIL != at_defns.sufficient_defns_admit_int(col, at_vars.$at_arg1$.getDynamicValue(thread), defn_assertions, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED) || ke_tools.NIL != at_defns.sufficient_defns_admit_int(col, at_vars.$at_arg2$.getDynamicValue(thread), defn_assertions, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED));
                }
                finally {
                    final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)ke_tools.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
            }
            if (ke_tools.NIL != admitsP) {
                genls.map_all_genls(Symbols.symbol_function((SubLObject)ke_tools.$sym26$GATHER_ACCESSED_ARG_CONSTRAINED_BY_PREDS), col, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
            }
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 21225L)
    public static SubLObject gather_accessed_arg_isa_of_preds(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = control_vars.$mapping_gather_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        try {
            control_vars.$mapping_gather_arg$.bind((SubLObject)ke_tools.ONE_INTEGER, thread);
            at_vars.$at_check_arg_isaP$.bind((SubLObject)ke_tools.T, thread);
            at_vars.$at_check_arg_genlsP$.bind((SubLObject)ke_tools.NIL, thread);
            SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts(ke_tools.$const29$ArgIsaBinaryPredicate);
            SubLObject arg_isa_pred = (SubLObject)ke_tools.NIL;
            arg_isa_pred = cdolist_list_var.first();
            while (ke_tools.NIL != cdolist_list_var) {
                kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)ke_tools.$sym28$GATHER_PREDS_W_ACCESSED_ARG_CONSTRAINT), col, (SubLObject)ke_tools.TWO_INTEGER, arg_isa_pred, (SubLObject)ke_tools.$kw21$TRUE, (SubLObject)ke_tools.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                arg_isa_pred = cdolist_list_var.first();
            }
        }
        finally {
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_3, thread);
            at_vars.$at_check_arg_isaP$.rebind(_prev_bind_2, thread);
            control_vars.$mapping_gather_arg$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 21546L)
    public static SubLObject gather_accessed_arg_constrained_by_preds(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = control_vars.$mapping_gather_arg$.currentBinding(thread);
        try {
            control_vars.$mapping_gather_arg$.bind((SubLObject)ke_tools.ONE_INTEGER, thread);
            final SubLObject _prev_bind_0_$74 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
            try {
                at_vars.$at_check_arg_isaP$.bind((SubLObject)ke_tools.T, thread);
                SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts(ke_tools.$const29$ArgIsaBinaryPredicate);
                SubLObject arg_isa_pred = (SubLObject)ke_tools.NIL;
                arg_isa_pred = cdolist_list_var.first();
                while (ke_tools.NIL != cdolist_list_var) {
                    kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)ke_tools.$sym28$GATHER_PREDS_W_ACCESSED_ARG_CONSTRAINT), col, (SubLObject)ke_tools.TWO_INTEGER, arg_isa_pred, (SubLObject)ke_tools.$kw21$TRUE, (SubLObject)ke_tools.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg_isa_pred = cdolist_list_var.first();
                }
            }
            finally {
                at_vars.$at_check_arg_isaP$.rebind(_prev_bind_0_$74, thread);
            }
            final SubLObject _prev_bind_0_$75 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
            try {
                at_vars.$at_check_arg_genlsP$.bind((SubLObject)ke_tools.T, thread);
                SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts(ke_tools.$const30$ArgGenlBinaryPredicate);
                SubLObject arg_genl_pred = (SubLObject)ke_tools.NIL;
                arg_genl_pred = cdolist_list_var.first();
                while (ke_tools.NIL != cdolist_list_var) {
                    kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)ke_tools.$sym28$GATHER_PREDS_W_ACCESSED_ARG_CONSTRAINT), col, (SubLObject)ke_tools.TWO_INTEGER, arg_genl_pred, (SubLObject)ke_tools.$kw21$TRUE, (SubLObject)ke_tools.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg_genl_pred = cdolist_list_var.first();
                }
            }
            finally {
                at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_0_$75, thread);
            }
        }
        finally {
            control_vars.$mapping_gather_arg$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 22078L)
    public static SubLObject gather_preds_wXaccessed_arg_constraint(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_tools.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject relation = assertions_high.gaf_arg(assertion, control_vars.$mapping_gather_arg$.getDynamicValue(thread));
            if (ke_tools.NIL != forts.fort_p(relation) && ke_tools.NIL == sbhl_marking_methods.sbhl_recorded_node_p(relation, (SubLObject)ke_tools.UNPROVIDED) && ke_tools.NIL != term.kb_predicateP(relation) && ke_tools.NIL != pred_args_constraints_accessed_in_spacesP(relation)) {
                sbhl_search_vars.$sbhl_result$.setDynamicValue((SubLObject)ConsesLow.cons(relation, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                if (ke_tools.NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module(ke_tools.$const16$genlPreds), relation, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
                }
            }
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 22586L)
    public static SubLObject clear_pred_args_constraints_accessed_in_spacesP() {
        clear_cached_pred_args_isa_accessed_in_spacesP();
        clear_cached_pred_args_genls_accessed_in_spacesP();
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 22763L)
    public static SubLObject pred_args_constraints_accessed_in_spacesP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((ke_tools.NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread) || ke_tools.NIL != cached_pred_args_isa_accessed_in_spacesP(pred)) && (ke_tools.NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread) || ke_tools.NIL != cached_pred_args_genls_accessed_in_spacesP(pred)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 23007L)
    public static SubLObject clear_cached_pred_args_isa_accessed_in_spacesP() {
        final SubLObject cs = ke_tools.$cached_pred_args_isa_accessed_in_spacesP_caching_state$.getGlobalValue();
        if (ke_tools.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 23007L)
    public static SubLObject remove_cached_pred_args_isa_accessed_in_spacesP(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args(ke_tools.$cached_pred_args_isa_accessed_in_spacesP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred), (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 23007L)
    public static SubLObject cached_pred_args_isa_accessed_in_spacesP_internal(final SubLObject pred) {
        return pred_args_isa_accessed_in_spacesP(pred, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 23007L)
    public static SubLObject cached_pred_args_isa_accessed_in_spacesP(final SubLObject pred) {
        SubLObject caching_state = ke_tools.$cached_pred_args_isa_accessed_in_spacesP_caching_state$.getGlobalValue();
        if (ke_tools.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)ke_tools.$sym31$CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES_, (SubLObject)ke_tools.$sym32$_CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES__CACHING_STATE_, (SubLObject)ke_tools.$int33$4096, (SubLObject)ke_tools.EQL, (SubLObject)ke_tools.ONE_INTEGER, (SubLObject)ke_tools.$int34$2048);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_pred_args_isa_accessed_in_spacesP_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)ke_tools.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 23153L)
    public static SubLObject pred_args_isa_accessed_in_spacesP(final SubLObject pred, SubLObject isa_space_1, SubLObject isa_space_2) {
        if (isa_space_1 == ke_tools.UNPROVIDED) {
            isa_space_1 = sbhl_marking_vars.$sbhl_space_1$.getDynamicValue();
        }
        if (isa_space_2 == ke_tools.UNPROVIDED) {
            isa_space_2 = sbhl_marking_vars.$sbhl_space_2$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_tools.NIL != arity.variable_arityP(pred)) {
            SubLObject failsP = (SubLObject)ke_tools.NIL;
            if (ke_tools.NIL == failsP) {
                SubLObject csome_list_var = kb_accessors.args_isa(pred, (SubLObject)ke_tools.UNPROVIDED);
                SubLObject args_isa = (SubLObject)ke_tools.NIL;
                args_isa = csome_list_var.first();
                while (ke_tools.NIL == failsP && ke_tools.NIL != csome_list_var) {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(isa_space_1, thread);
                        if (ke_tools.NIL == sbhl_marking_methods.sbhl_recorded_node_p(args_isa, (SubLObject)ke_tools.UNPROVIDED)) {
                            failsP = (SubLObject)ke_tools.T;
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
                    }
                    _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(isa_space_2, thread);
                        if (ke_tools.NIL == sbhl_marking_methods.sbhl_recorded_node_p(args_isa, (SubLObject)ke_tools.UNPROVIDED)) {
                            failsP = (SubLObject)ke_tools.T;
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    args_isa = csome_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(ke_tools.NIL == failsP);
        }
        SubLObject accessedP = (SubLObject)ke_tools.NIL;
        final SubLObject v_arity = arity.arity(pred);
        if (ke_tools.NIL != el_utilities.valid_arity_p(v_arity) && ke_tools.NIL == accessedP) {
            SubLObject csome_list_var2 = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject arg1 = (SubLObject)ke_tools.NIL;
            arg1 = csome_list_var2.first();
            while (ke_tools.NIL == accessedP && ke_tools.NIL != csome_list_var2) {
                if (arg1.numLE(v_arity)) {
                    final SubLObject _prev_bind_2 = at_vars.$at_arg$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(at_vars.$at_arg1$.getDynamicValue(thread), thread);
                        if (ke_tools.NIL != arg_accessed_in_spaceP(pred, kb_accessors.arg_isa_pred(arg1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), (SubLObject)ke_tools.ONE_INTEGER, (SubLObject)ke_tools.TWO_INTEGER, isa_space_1, (SubLObject)ke_tools.UNPROVIDED) && ke_tools.NIL == accessedP) {
                            SubLObject csome_list_var_$76 = czer_vars.$arg_positions$.getGlobalValue();
                            SubLObject arg2 = (SubLObject)ke_tools.NIL;
                            arg2 = csome_list_var_$76.first();
                            while (ke_tools.NIL == accessedP && ke_tools.NIL != csome_list_var_$76) {
                                if (arg2.numLE(v_arity) && !arg1.numE(arg2)) {
                                    final SubLObject _prev_bind_0_$77 = at_vars.$at_arg$.currentBinding(thread);
                                    try {
                                        at_vars.$at_arg$.bind(at_vars.$at_arg2$.getDynamicValue(thread), thread);
                                        accessedP = arg_accessed_in_spaceP(pred, kb_accessors.arg_isa_pred(arg2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), (SubLObject)ke_tools.ONE_INTEGER, (SubLObject)ke_tools.TWO_INTEGER, isa_space_2, (SubLObject)ke_tools.UNPROVIDED);
                                    }
                                    finally {
                                        at_vars.$at_arg$.rebind(_prev_bind_0_$77, thread);
                                    }
                                }
                                csome_list_var_$76 = csome_list_var_$76.rest();
                                arg2 = csome_list_var_$76.first();
                            }
                        }
                    }
                    finally {
                        at_vars.$at_arg$.rebind(_prev_bind_2, thread);
                    }
                }
                csome_list_var2 = csome_list_var2.rest();
                arg1 = csome_list_var2.first();
            }
        }
        return accessedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 24103L)
    public static SubLObject clear_cached_pred_args_genls_accessed_in_spacesP() {
        final SubLObject cs = ke_tools.$cached_pred_args_genls_accessed_in_spacesP_caching_state$.getGlobalValue();
        if (ke_tools.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 24103L)
    public static SubLObject remove_cached_pred_args_genls_accessed_in_spacesP(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args(ke_tools.$cached_pred_args_genls_accessed_in_spacesP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred), (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 24103L)
    public static SubLObject cached_pred_args_genls_accessed_in_spacesP_internal(final SubLObject pred) {
        return pred_args_genls_accessed_in_spacesP(pred, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 24103L)
    public static SubLObject cached_pred_args_genls_accessed_in_spacesP(final SubLObject pred) {
        SubLObject caching_state = ke_tools.$cached_pred_args_genls_accessed_in_spacesP_caching_state$.getGlobalValue();
        if (ke_tools.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)ke_tools.$sym35$CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES_, (SubLObject)ke_tools.$sym36$_CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES__CACHING_STATE_, (SubLObject)ke_tools.$int33$4096, (SubLObject)ke_tools.EQL, (SubLObject)ke_tools.ONE_INTEGER, (SubLObject)ke_tools.$int34$2048);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_pred_args_genls_accessed_in_spacesP_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)ke_tools.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 24253L)
    public static SubLObject pred_args_genls_accessed_in_spacesP(final SubLObject pred, SubLObject genls_space_1, SubLObject genls_space_2) {
        if (genls_space_1 == ke_tools.UNPROVIDED) {
            genls_space_1 = sbhl_marking_vars.$sbhl_space_3$.getDynamicValue();
        }
        if (genls_space_2 == ke_tools.UNPROVIDED) {
            genls_space_2 = sbhl_marking_vars.$sbhl_space_4$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_tools.NIL != arity.variable_arityP(pred)) {
            SubLObject failsP = (SubLObject)ke_tools.NIL;
            if (ke_tools.NIL == failsP) {
                SubLObject csome_list_var = kb_accessors.args_genl(pred, (SubLObject)ke_tools.UNPROVIDED);
                SubLObject args_genl = (SubLObject)ke_tools.NIL;
                args_genl = csome_list_var.first();
                while (ke_tools.NIL == failsP && ke_tools.NIL != csome_list_var) {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(genls_space_1, thread);
                        if (ke_tools.NIL == sbhl_marking_methods.sbhl_recorded_node_p(args_genl, (SubLObject)ke_tools.UNPROVIDED)) {
                            failsP = (SubLObject)ke_tools.T;
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
                    }
                    _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(genls_space_2, thread);
                        if (ke_tools.NIL == sbhl_marking_methods.sbhl_recorded_node_p(args_genl, (SubLObject)ke_tools.UNPROVIDED)) {
                            failsP = (SubLObject)ke_tools.T;
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    args_genl = csome_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(ke_tools.NIL == failsP);
        }
        SubLObject accessedP = (SubLObject)ke_tools.NIL;
        final SubLObject v_arity = arity.arity(pred);
        if (ke_tools.NIL != el_utilities.valid_arity_p(v_arity) && ke_tools.NIL == accessedP) {
            SubLObject csome_list_var2 = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject arg1 = (SubLObject)ke_tools.NIL;
            arg1 = csome_list_var2.first();
            while (ke_tools.NIL == accessedP && ke_tools.NIL != csome_list_var2) {
                if (arg1.numLE(v_arity)) {
                    final SubLObject _prev_bind_2 = at_vars.$at_arg$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(at_vars.$at_arg1$.getDynamicValue(thread), thread);
                        if (ke_tools.NIL != arg_accessed_in_spaceP(pred, kb_accessors.arg_genl_pred(arg1, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), (SubLObject)ke_tools.ONE_INTEGER, (SubLObject)ke_tools.TWO_INTEGER, genls_space_1, (SubLObject)ke_tools.UNPROVIDED) && ke_tools.NIL == accessedP) {
                            SubLObject csome_list_var_$78 = czer_vars.$arg_positions$.getGlobalValue();
                            SubLObject arg2 = (SubLObject)ke_tools.NIL;
                            arg2 = csome_list_var_$78.first();
                            while (ke_tools.NIL == accessedP && ke_tools.NIL != csome_list_var_$78) {
                                if (arg2.numLE(v_arity) && !arg1.numE(arg2)) {
                                    final SubLObject _prev_bind_0_$79 = at_vars.$at_arg$.currentBinding(thread);
                                    try {
                                        at_vars.$at_arg$.bind(at_vars.$at_arg2$.getDynamicValue(thread), thread);
                                        accessedP = arg_accessed_in_spaceP(pred, kb_accessors.arg_genl_pred(arg2, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED), (SubLObject)ke_tools.ONE_INTEGER, (SubLObject)ke_tools.TWO_INTEGER, genls_space_2, (SubLObject)ke_tools.UNPROVIDED);
                                    }
                                    finally {
                                        at_vars.$at_arg$.rebind(_prev_bind_0_$79, thread);
                                    }
                                }
                                csome_list_var_$78 = csome_list_var_$78.rest();
                                arg2 = csome_list_var_$78.first();
                            }
                        }
                    }
                    finally {
                        at_vars.$at_arg$.rebind(_prev_bind_2, thread);
                    }
                }
                csome_list_var2 = csome_list_var2.rest();
                arg1 = csome_list_var2.first();
            }
        }
        return accessedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 25224L)
    public static SubLObject arg_accessed_in_spaceP(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_arg, final SubLObject sbhl_table, SubLObject truth) {
        if (truth == ke_tools.UNPROVIDED) {
            truth = (SubLObject)ke_tools.$kw21$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failsP = (SubLObject)ke_tools.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$mapping_answer$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$mapping_gather_arg$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_table, thread);
            control_vars.$mapping_answer$.bind((SubLObject)ke_tools.NIL, thread);
            control_vars.$mapping_gather_arg$.bind(gather_arg, thread);
            kb_mapping.map_gaf_arg_index(Symbols.symbol_function((SubLObject)ke_tools.$sym37$NON_SEARCHED_ARG_), v_term, index_arg, pred, truth, (SubLObject)ke_tools.UNPROVIDED);
            failsP = control_vars.$mapping_answer$.getDynamicValue(thread);
        }
        finally {
            control_vars.$mapping_gather_arg$.rebind(_prev_bind_3, thread);
            control_vars.$mapping_answer$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(ke_tools.NIL == failsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 25568L)
    public static SubLObject non_searched_argP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ke_tools.NIL == sbhl_marking_methods.sbhl_recorded_node_p(assertions_high.gaf_arg(assertion, control_vars.$mapping_gather_arg$.getDynamicValue(thread)), (SubLObject)ke_tools.UNPROVIDED) && ke_tools.NIL == ((ke_tools.NIL != at_vars.$at_arg$.getDynamicValue(thread) && ke_tools.NIL != at_vars.$at_defns_availableP$.getDynamicValue(thread)) ? at_defns.defns_admitP(assertions_high.gaf_arg(assertion, control_vars.$mapping_gather_arg$.getDynamicValue(thread)), at_vars.$at_arg$.getDynamicValue(thread), (SubLObject)ke_tools.UNPROVIDED) : ke_tools.NIL)) {
            control_vars.$mapping_answer$.setDynamicValue((SubLObject)ke_tools.T, thread);
            utilities_macros.mapping_finished();
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 25873L)
    public static SubLObject weakest_args(final SubLObject predicate, final SubLObject argnum, final SubLObject args, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.NIL;
        }
        SubLObject result = args;
        SubLObject cdolist_list_var = transitive_via_arg_preds(predicate, argnum, mt);
        SubLObject transitive_pred = (SubLObject)ke_tools.NIL;
        transitive_pred = cdolist_list_var.first();
        while (ke_tools.NIL != cdolist_list_var) {
            result = superiors_wrt(transitive_pred, result, mt);
            cdolist_list_var = cdolist_list_var.rest();
            transitive_pred = cdolist_list_var.first();
        }
        cdolist_list_var = transitive_via_arg_inverses(predicate, argnum, mt);
        SubLObject transitive_inverse = (SubLObject)ke_tools.NIL;
        transitive_inverse = cdolist_list_var.first();
        while (ke_tools.NIL != cdolist_list_var) {
            result = inferiors_wrt(transitive_inverse, result, mt);
            cdolist_list_var = cdolist_list_var.rest();
            transitive_inverse = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 26717L)
    public static SubLObject strongest_args(final SubLObject predicate, final SubLObject argnum, final SubLObject args, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.NIL;
        }
        SubLObject result = args;
        SubLObject cdolist_list_var = transitive_via_arg_preds(predicate, argnum, mt);
        SubLObject transitive_pred = (SubLObject)ke_tools.NIL;
        transitive_pred = cdolist_list_var.first();
        while (ke_tools.NIL != cdolist_list_var) {
            result = inferiors_wrt(transitive_pred, result, mt);
            cdolist_list_var = cdolist_list_var.rest();
            transitive_pred = cdolist_list_var.first();
        }
        cdolist_list_var = transitive_via_arg_inverses(predicate, argnum, mt);
        SubLObject transitive_inverse = (SubLObject)ke_tools.NIL;
        transitive_inverse = cdolist_list_var.first();
        while (ke_tools.NIL != cdolist_list_var) {
            result = superiors_wrt(transitive_inverse, result, mt);
            cdolist_list_var = cdolist_list_var.rest();
            transitive_inverse = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 27413L)
    public static SubLObject subsumed_by_stronger_argsP(final SubLObject predicate, final SubLObject argnum, final SubLObject weak_args, final SubLObject strong_args, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.NIL;
        }
        final SubLObject unique_weak_args = list_utilities.fast_delete_duplicates(weak_args, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
        final SubLObject unique_strong_args = list_utilities.fast_delete_duplicates(strong_args, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
        final SubLObject unsubsumed_weak_args = list_utilities.fast_set_difference(unique_weak_args, unique_strong_args, (SubLObject)ke_tools.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(ke_tools.NIL == unsubsumed_weak_args || ke_tools.NIL == conses_high.subsetp(unsubsumed_weak_args, strongest_args(predicate, argnum, ConsesLow.append(unsubsumed_weak_args, unique_strong_args), mt), (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 28227L)
    public static SubLObject transitive_via_arg_preds(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.NIL;
        }
        return kb_mapping_utilities.pred_arg_values_in_relevant_mts(relation, ke_tools.$const38$transitiveViaArg, argnum, mt, (SubLObject)ke_tools.ONE_INTEGER, (SubLObject)ke_tools.THREE_INTEGER, (SubLObject)ke_tools.TWO_INTEGER, (SubLObject)ke_tools.$kw21$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 28385L)
    public static SubLObject transitive_via_arg_inverses(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.NIL;
        }
        return kb_mapping_utilities.pred_arg_values_in_relevant_mts(relation, ke_tools.$const39$transitiveViaArgInverse, argnum, mt, (SubLObject)ke_tools.ONE_INTEGER, (SubLObject)ke_tools.THREE_INTEGER, (SubLObject)ke_tools.TWO_INTEGER, (SubLObject)ke_tools.$kw21$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 28553L)
    public static SubLObject superiors_wrt(final SubLObject predicate, final SubLObject candidates, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.NIL;
        }
        if (ke_tools.NIL != sbhl_module_utilities.sbhl_predicate_p(predicate)) {
            final SubLObject result = sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module(predicate), candidates, mt, (SubLObject)ke_tools.UNPROVIDED, (SubLObject)ke_tools.UNPROVIDED);
            return result;
        }
        if (ke_tools.NIL != kb_accessors.transitive_predicateP(predicate)) {
            return gt_methods.gt_max_nodes(predicate, candidates, mt, (SubLObject)ke_tools.UNPROVIDED);
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/ke-tools.lisp", position = 29027L)
    public static SubLObject inferiors_wrt(final SubLObject predicate, final SubLObject candidates, SubLObject mt) {
        if (mt == ke_tools.UNPROVIDED) {
            mt = (SubLObject)ke_tools.NIL;
        }
        if (ke_tools.NIL != sbhl_module_utilities.sbhl_predicate_p(predicate)) {
            final SubLObject result = sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module(predicate), candidates, mt, (SubLObject)ke_tools.UNPROVIDED);
            return result;
        }
        if (ke_tools.NIL != kb_accessors.transitive_predicateP(predicate)) {
            return gt_methods.gt_min_nodes(predicate, candidates, mt);
        }
        return (SubLObject)ke_tools.NIL;
    }
    
    public static SubLObject declare_ke_tools_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "why_not_wff_assertion", "WHY-NOT-WFF-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "bogus_assertionP", "BOGUS-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "free_assertionP", "FREE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_for_pair", "PREDS-FOR-PAIR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_instances", "PREDS-OF-INSTANCES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_instances_int", "PREDS-OF-INSTANCES-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_instances_in_space_1", "PREDS-OF-INSTANCES-IN-SPACE-1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_instances_in_space_2", "PREDS-OF-INSTANCES-IN-SPACE-2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_instances_in_spaces", "PREDS-OF-INSTANCES-IN-SPACES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "arg_isa_preds_of_collection_table", "ARG-ISA-PREDS-OF-COLLECTION-TABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "arg_isa_preds_of_collection_table_int", "ARG-ISA-PREDS-OF-COLLECTION-TABLE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "gather_arg_isa_preds_of_collection", "GATHER-ARG-ISA-PREDS-OF-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "gather_arg_isa_preds_of_collection_int", "GATHER-ARG-ISA-PREDS-OF-COLLECTION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "legal_preds_of_forts_isa", "LEGAL-PREDS-OF-FORTS-ISA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "legal_preds_of_forts_int", "LEGAL-PREDS-OF-FORTS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "gather_col_legal_preds", "GATHER-COL-LEGAL-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_forts", "PREDS-OF-FORTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_forts_int", "PREDS-OF-FORTS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "new_note_preds_wXaccessed_arg_constraint", "NEW-NOTE-PREDS-W/ACCESSED-ARG-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_constants", "PREDS-OF-CONSTANTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_constants_int", "PREDS-OF-CONSTANTS-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_constants_in_space_1", "PREDS-OF-CONSTANTS-IN-SPACE-1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_constants_in_space_2", "PREDS-OF-CONSTANTS-IN-SPACE-2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_constants_in_space_3", "PREDS-OF-CONSTANTS-IN-SPACE-3", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_constants_in_space_4", "PREDS-OF-CONSTANTS-IN-SPACE-4", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_constants_in_spaces", "PREDS-OF-CONSTANTS-IN-SPACES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_referents", "PREDS-OF-REFERENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_refererents_int", "PREDS-OF-REFERERENTS-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_refererents_in_space_1", "PREDS-OF-REFERERENTS-IN-SPACE-1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_refererents_in_space_2", "PREDS-OF-REFERERENTS-IN-SPACE-2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_refererents_in_space_3", "PREDS-OF-REFERERENTS-IN-SPACE-3", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_refererents_in_space_4", "PREDS-OF-REFERERENTS-IN-SPACE-4", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "preds_of_refererents_in_spaces", "PREDS-OF-REFERERENTS-IN-SPACES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "gather_preds_constrained_by_superiors_of_defn_admitted", "GATHER-PREDS-CONSTRAINED-BY-SUPERIORS-OF-DEFN-ADMITTED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "gather_accessed_arg_isa_of_preds", "GATHER-ACCESSED-ARG-ISA-OF-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "gather_accessed_arg_constrained_by_preds", "GATHER-ACCESSED-ARG-CONSTRAINED-BY-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "gather_preds_wXaccessed_arg_constraint", "GATHER-PREDS-W/ACCESSED-ARG-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "clear_pred_args_constraints_accessed_in_spacesP", "CLEAR-PRED-ARGS-CONSTRAINTS-ACCESSED-IN-SPACES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "pred_args_constraints_accessed_in_spacesP", "PRED-ARGS-CONSTRAINTS-ACCESSED-IN-SPACES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "clear_cached_pred_args_isa_accessed_in_spacesP", "CLEAR-CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "remove_cached_pred_args_isa_accessed_in_spacesP", "REMOVE-CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "cached_pred_args_isa_accessed_in_spacesP_internal", "CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "cached_pred_args_isa_accessed_in_spacesP", "CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "pred_args_isa_accessed_in_spacesP", "PRED-ARGS-ISA-ACCESSED-IN-SPACES?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "clear_cached_pred_args_genls_accessed_in_spacesP", "CLEAR-CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "remove_cached_pred_args_genls_accessed_in_spacesP", "REMOVE-CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "cached_pred_args_genls_accessed_in_spacesP_internal", "CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "cached_pred_args_genls_accessed_in_spacesP", "CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "pred_args_genls_accessed_in_spacesP", "PRED-ARGS-GENLS-ACCESSED-IN-SPACES?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "arg_accessed_in_spaceP", "ARG-ACCESSED-IN-SPACE?", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "non_searched_argP", "NON-SEARCHED-ARG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "weakest_args", "WEAKEST-ARGS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "strongest_args", "STRONGEST-ARGS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "subsumed_by_stronger_argsP", "SUBSUMED-BY-STRONGER-ARGS?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "transitive_via_arg_preds", "TRANSITIVE-VIA-ARG-PREDS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "transitive_via_arg_inverses", "TRANSITIVE-VIA-ARG-INVERSES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "superiors_wrt", "SUPERIORS-WRT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.ke_tools", "inferiors_wrt", "INFERIORS-WRT", 2, 1, false);
        return (SubLObject)ke_tools.NIL;
    }
    
    public static SubLObject init_ke_tools_file() {
        ke_tools.$fort1_preds$ = SubLFiles.defparameter("*FORT1-PREDS*", (SubLObject)ke_tools.NIL);
        ke_tools.$fort2_preds$ = SubLFiles.defparameter("*FORT2-PREDS*", (SubLObject)ke_tools.NIL);
        ke_tools.$forts_candidate_preds$ = SubLFiles.defparameter("*FORTS-CANDIDATE-PREDS*", (SubLObject)ke_tools.NIL);
        ke_tools.$cached_pred_args_isa_accessed_in_spacesP_caching_state$ = SubLFiles.deflexical("*CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?-CACHING-STATE*", (SubLObject)ke_tools.NIL);
        ke_tools.$cached_pred_args_genls_accessed_in_spacesP_caching_state$ = SubLFiles.deflexical("*CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?-CACHING-STATE*", (SubLObject)ke_tools.NIL);
        return (SubLObject)ke_tools.NIL;
    }
    
    public static SubLObject setup_ke_tools_file() {
        utilities_macros.register_cyc_api_function((SubLObject)ke_tools.$sym7$PREDS_FOR_PAIR, (SubLObject)ke_tools.$list8, (SubLObject)ke_tools.$str9$Return_a_list_of_the_predicates_r, (SubLObject)ke_tools.$list10, (SubLObject)ke_tools.$list11);
        memoization_state.note_globally_cached_function((SubLObject)ke_tools.$sym31$CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES_);
        memoization_state.note_globally_cached_function((SubLObject)ke_tools.$sym35$CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES_);
        return (SubLObject)ke_tools.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_ke_tools_file();
    }
    
    @Override
	public void initializeVariables() {
        init_ke_tools_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_ke_tools_file();
    }
    
    static {
        me = (SubLFile)new ke_tools();
        ke_tools.$fort1_preds$ = null;
        ke_tools.$fort2_preds$ = null;
        ke_tools.$forts_candidate_preds$ = null;
        ke_tools.$cached_pred_args_isa_accessed_in_spacesP_caching_state$ = null;
        ke_tools.$cached_pred_args_genls_accessed_in_spacesP_caching_state$ = null;
        $kw0$BOGUS = SubLObjectFactory.makeKeyword("BOGUS");
        $kw1$FREE = SubLObjectFactory.makeKeyword("FREE");
        $kw2$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw3$MIXED = SubLObjectFactory.makeKeyword("MIXED");
        $sym4$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw5$FIGURATIVE = SubLObjectFactory.makeKeyword("FIGURATIVE");
        $kw6$LITERAL = SubLObjectFactory.makeKeyword("LITERAL");
        $sym7$PREDS_FOR_PAIR = SubLObjectFactory.makeSymbol("PREDS-FOR-PAIR");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-1"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MIXED")));
        $str9$Return_a_list_of_the_predicates_r = SubLObjectFactory.makeString("Return a list of the predicates relevant to relating FORT-1 and FORT-2.\nMODE may be :figurative (instances of collections), \n:literal (constants), or \n:mixed (referents).");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-1"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-2"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $sym12$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const13$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const14$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym15$GATHER_ACCESSED_ARG_ISA_OF_PREDS = SubLObjectFactory.makeSymbol("GATHER-ACCESSED-ARG-ISA-OF-PREDS");
        $const16$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $int17$512 = SubLObjectFactory.makeInteger(512);
        $sym18$GATHER_ARG_ISA_PREDS_OF_COLLECTION = SubLObjectFactory.makeSymbol("GATHER-ARG-ISA-PREDS-OF-COLLECTION");
        $sym19$GATHER_ARG_ISA_PREDS_OF_COLLECTION_INT = SubLObjectFactory.makeSymbol("GATHER-ARG-ISA-PREDS-OF-COLLECTION-INT");
        $const20$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $kw21$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const22$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym23$GATHER_COL_LEGAL_PREDS = SubLObjectFactory.makeSymbol("GATHER-COL-LEGAL-PREDS");
        $sym24$NEW_NOTE_PREDS_W_ACCESSED_ARG_CONSTRAINT = SubLObjectFactory.makeSymbol("NEW-NOTE-PREDS-W/ACCESSED-ARG-CONSTRAINT");
        $sym25$GATHER_PREDS_CONSTRAINED_BY_SUPERIORS_OF_DEFN_ADMITTED = SubLObjectFactory.makeSymbol("GATHER-PREDS-CONSTRAINED-BY-SUPERIORS-OF-DEFN-ADMITTED");
        $sym26$GATHER_ACCESSED_ARG_CONSTRAINED_BY_PREDS = SubLObjectFactory.makeSymbol("GATHER-ACCESSED-ARG-CONSTRAINED-BY-PREDS");
        $sym27$UNRECORD_ALL_SUPERIORS_AS_UNSEARCHED_IGNORE_ARG2 = SubLObjectFactory.makeSymbol("UNRECORD-ALL-SUPERIORS-AS-UNSEARCHED-IGNORE-ARG2");
        $sym28$GATHER_PREDS_W_ACCESSED_ARG_CONSTRAINT = SubLObjectFactory.makeSymbol("GATHER-PREDS-W/ACCESSED-ARG-CONSTRAINT");
        $const29$ArgIsaBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgIsaBinaryPredicate"));
        $const30$ArgGenlBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArgGenlBinaryPredicate"));
        $sym31$CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES_ = SubLObjectFactory.makeSymbol("CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?");
        $sym32$_CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?-CACHING-STATE*");
        $int33$4096 = SubLObjectFactory.makeInteger(4096);
        $int34$2048 = SubLObjectFactory.makeInteger(2048);
        $sym35$CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES_ = SubLObjectFactory.makeSymbol("CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?");
        $sym36$_CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?-CACHING-STATE*");
        $sym37$NON_SEARCHED_ARG_ = SubLObjectFactory.makeSymbol("NON-SEARCHED-ARG?");
        $const38$transitiveViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $const39$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
    }
}

/*

	Total time: 1175 ms
	
*/