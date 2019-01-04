package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_mapping_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_mapping_utilities";
    public static final String myFingerPrint = "a23968c0642ea6c612fd92deccc9090219a0e1b8d9d695003bcaf830fa877712";
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 35312L)
    private static SubLSymbol $use_optimized_pred_arg_values_fixed_arityP$;
    private static final SubLSymbol $kw0$TRUE;
    private static final SubLSymbol $sym1$INDEXED_TERM_P;
    private static final SubLSymbol $sym2$FORT_P;
    private static final SubLSymbol $sym3$INTEGERP;
    private static final SubLSymbol $sym4$TRUTH_P;
    private static final SubLSymbol $kw5$GAF;
    private static final SubLSymbol $sym6$SOME_PRED_VALUE;
    private static final SubLList $list7;
    private static final SubLString $str8$Find_the_first_gaf_assertion_such;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$HLMT_P;
    private static final SubLSymbol $sym12$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $sym13$SOME_PRED_VALUE_IN_MT;
    private static final SubLList $list14;
    private static final SubLString $str15$Find_the_first_gaf_assertion_such;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$LISTP;
    private static final SubLSymbol $sym18$RELEVANT_MT_IS_IN_LIST;
    private static final SubLSymbol $sym19$SOME_PRED_VALUE_IN_MTS;
    private static final SubLList $list20;
    private static final SubLString $str21$Find_the_first_gaf_assertion_such;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const24$EverythingPSC;
    private static final SubLSymbol $sym25$SOME_PRED_VALUE_IN_ANY_MT;
    private static final SubLString $str26$Find_the_first_gaf_assertion_such;
    private static final SubLSymbol $sym27$SOME_PRED_VALUE_IN_RELEVANT_MTS;
    private static final SubLList $list28;
    private static final SubLString $str29$If_MT_is_NIL__behaves_like_SOME_P;
    private static final SubLSymbol $sym30$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym31$FPRED_VALUE;
    private static final SubLList $list32;
    private static final SubLString $str33$Find_the_first_gaf_assertion_such;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$FPRED_VALUE_IN_MT;
    private static final SubLList $list37;
    private static final SubLString $str38$Find_the_first_gaf_assertion_such;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$FPRED_VALUE_IN_MTS;
    private static final SubLList $list41;
    private static final SubLString $str42$Find_the_first_gaf_assertion_such;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$FPRED_VALUE_IN_ANY_MT;
    private static final SubLString $str45$Find_the_first_gaf_assertion_such;
    private static final SubLSymbol $sym46$FPRED_VALUE_IN_RELEVANT_MTS;
    private static final SubLList $list47;
    private static final SubLString $str48$If_MT_is_NIL__behaves_like_FPRED_;
    private static final SubLSymbol $sym49$PRED_VALUES;
    private static final SubLString $str50$Find_all_gaf_assertions_such_that;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$PRED_VALUES_IN_MT;
    private static final SubLString $str53$Find_all_gaf_assertions_such_that;
    private static final SubLSymbol $sym54$PRED_VALUES_IN_MTS;
    private static final SubLString $str55$Find_all_gaf_assertions_such_that;
    private static final SubLSymbol $sym56$PRED_VALUES_IN_ANY_MT;
    private static final SubLString $str57$Find_all_gaf_assertions_such_that;
    private static final SubLSymbol $sym58$PRED_VALUES_IN_RELEVANT_MTS;
    private static final SubLString $str59$If_MT_is_NIL__behaves_like_PRED_V;
    private static final SubLSymbol $sym60$PRED_REFS;
    private static final SubLList $list61;
    private static final SubLString $str62$Find_all_gaf_assertions_such_that;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$PRED_REFS_IN_MT;
    private static final SubLList $list65;
    private static final SubLString $str66$Find_all_gaf_assertions_such_that;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$PRED_REFS_IN_MTS;
    private static final SubLList $list69;
    private static final SubLString $str70$Find_all_gaf_assertions_such_that;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$PRED_REFS_IN_ANY_MT;
    private static final SubLString $str73$Find_all_gaf_assertions_such_that;
    private static final SubLSymbol $sym74$PRED_REFS_IN_RELEVANT_MTS;
    private static final SubLList $list75;
    private static final SubLString $str76$If_MT_is_NIL__behaves_like_PRED_R;
    private static final SubLSymbol $sym77$HL_TERM_P;
    private static final SubLSymbol $sym78$PRED_U_V_HOLDS;
    private static final SubLList $list79;
    private static final SubLString $str80$Find_the_first_gaf_assertion_such;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$PRED_U_V_HOLDS_IN_MT;
    private static final SubLList $list83;
    private static final SubLString $str84$Find_the_first_gaf_assertion_such;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$PRED_U_V_HOLDS_IN_MTS;
    private static final SubLList $list87;
    private static final SubLString $str88$Find_the_first_gaf_assertion_such;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$PRED_U_V_HOLDS_IN_ANY_MT;
    private static final SubLString $str91$Find_the_first_gaf_assertion_such;
    private static final SubLSymbol $sym92$PRED_U_V_HOLDS_IN_RELEVANT_MTS;
    private static final SubLList $list93;
    private static final SubLString $str94$If_MT_is_NIL__behaves_like_PRED_U;
    private static final SubLSymbol $sym95$CONSP;
    private static final SubLSymbol $kw96$GAF_ARG;
    private static final SubLSymbol $kw97$PREDICATE_EXTENT;
    private static final SubLSymbol $kw98$OVERLAP;
    private static final SubLString $str99$_S_is_not_a_valid_arg_position_li;
    private static final SubLSymbol $sym100$PRED_VALUE_TUPLES;
    private static final SubLList $list101;
    private static final SubLString $str102$Find_all_gaf_assertions_such_that;
    private static final SubLList $list103;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$PRED_VALUE_TUPLES_IN_MT;
    private static final SubLList $list106;
    private static final SubLString $str107$Find_all_gaf_assertions_such_that;
    private static final SubLList $list108;
    private static final SubLSymbol $sym109$PRED_VALUE_TUPLES_IN_MTS;
    private static final SubLList $list110;
    private static final SubLString $str111$Find_all_gaf_assertions_such_that;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$PRED_VALUE_TUPLES_IN_ANY_MT;
    private static final SubLString $str114$Find_all_gaf_assertions_such_that;
    private static final SubLSymbol $sym115$PRED_VALUE_TUPLES_IN_RELEVANT_MTS;
    private static final SubLList $list116;
    private static final SubLString $str117$If_MT_is_NIL__behaves_like_PRED_V;
    private static final SubLSymbol $sym118$_EXIT;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 1393L)
    public static SubLObject some_pred_value(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
            SubLObject done_var = v_answer;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$1 = v_answer;
                        final SubLObject token_var_$2 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$1) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$3) {
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = (SubLObject)kb_mapping_utilities.T;
                            }
                            done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$3 || kb_mapping_utilities.NIL != v_answer);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != v_answer);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 2263L)
    public static SubLObject some_pred_value_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(mt, kb_mapping_utilities.$sym11$HLMT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym12$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = some_pred_value(v_term, pred, index_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 2913L)
    public static SubLObject some_pred_value_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(mts, kb_mapping_utilities.$sym17$LISTP);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym18$RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = some_pred_value(v_term, pred, index_arg, truth);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 3592L)
    public static SubLObject some_pred_value_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = some_pred_value(v_term, pred, index_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 4243L)
    public static SubLObject some_pred_value_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = some_pred_value(v_term, pred, index_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 4692L)
    public static SubLObject some_pred_value_if(final SubLObject v_term, final SubLObject pred, final SubLObject test, SubLObject index_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_mapping_utilities.NIL != kb_indexing_datastructures.indexed_term_p(v_term) : v_term;
        assert kb_mapping_utilities.NIL != forts.fort_p(pred) : pred;
        assert kb_mapping_utilities.NIL != Types.function_spec_p(test) : test;
        assert kb_mapping_utilities.NIL != Types.integerp(index_arg) : index_arg;
        assert kb_mapping_utilities.NIL != enumeration_types.truth_p(truth) : truth;
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
            SubLObject done_var = v_answer;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$4 = v_answer;
                        final SubLObject token_var_$5 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$4) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                            final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$6 && kb_mapping_utilities.NIL != Functions.funcall(test, assertion)) {
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = (SubLObject)kb_mapping_utilities.T;
                            }
                            done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$6 || kb_mapping_utilities.NIL != v_answer);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != v_answer);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 5752L)
    public static SubLObject fpred_value_gaf(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth) {
        if (index_argnum == kb_mapping_utilities.UNPROVIDED) {
            index_argnum = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_argnum, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_argnum, pred);
            SubLObject done_var = v_answer;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$7 = v_answer;
                        final SubLObject token_var_$8 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$7) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                            final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$9) {
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = assertion;
                            }
                            done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$9 || kb_mapping_utilities.NIL != v_answer);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != v_answer);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 6497L)
    public static SubLObject fpred_value_gaf_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_argnum, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (index_argnum == kb_mapping_utilities.UNPROVIDED) {
            index_argnum = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = fpred_value_gaf(v_term, pred, index_argnum, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 6817L)
    public static SubLObject fpred_value_gaf_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth) {
        if (index_argnum == kb_mapping_utilities.UNPROVIDED) {
            index_argnum = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = fpred_value_gaf(v_term, pred, index_argnum, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 7090L)
    public static SubLObject fpred_value(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        final SubLObject assertion = fpred_value_gaf(v_term, pred, index_arg, truth);
        if (kb_mapping_utilities.NIL != assertion) {
            return assertions_high.gaf_arg(assertion, gather_arg);
        }
        return (SubLObject)kb_mapping_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 7851L)
    public static SubLObject fpred_value_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(mt, kb_mapping_utilities.$sym11$HLMT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym12$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = fpred_value(v_term, pred, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 8587L)
    public static SubLObject fpred_value_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(mts, kb_mapping_utilities.$sym17$LISTP);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym18$RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = fpred_value(v_term, pred, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 9352L)
    public static SubLObject fpred_value_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = fpred_value(v_term, pred, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 10089L)
    public static SubLObject fpred_value_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = fpred_value(v_term, pred, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 10577L)
    public static SubLObject pred_value_gafs(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth) {
        if (index_argnum == kb_mapping_utilities.UNPROVIDED) {
            index_argnum = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_argnum, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_argnum, pred);
            SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$10 = (SubLObject)kb_mapping_utilities.NIL;
                        final SubLObject token_var_$11 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$10) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                            final SubLObject valid_$12 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$11.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$12) {
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                            }
                            done_var_$10 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$12);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
            }
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 11317L)
    public static SubLObject pred_value_gafs_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_argnum, SubLObject truth) {
        if (index_argnum == kb_mapping_utilities.UNPROVIDED) {
            index_argnum = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym12$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_value_gafs(v_term, pred, index_argnum, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 12020L)
    public static SubLObject pred_value_gafs_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_argnum, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (index_argnum == kb_mapping_utilities.UNPROVIDED) {
            index_argnum = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_value_gafs(v_term, pred, index_argnum, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 12534L)
    public static SubLObject pred_value_gafs_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_argnum, SubLObject truth) {
        if (index_argnum == kb_mapping_utilities.UNPROVIDED) {
            index_argnum = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = pred_value_gafs(v_term, pred, index_argnum, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 13229L)
    public static SubLObject pred_values(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject values = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
            SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$13 = (SubLObject)kb_mapping_utilities.NIL;
                        final SubLObject token_var_$14 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$13) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$14);
                            final SubLObject valid_$15 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$14.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$15) {
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                final SubLObject value = assertions_high.gaf_arg(assertion, gather_arg);
                                values = (SubLObject)ConsesLow.cons(value, values);
                            }
                            done_var_$13 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$15);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
            }
        }
        if (kb_mapping_utilities.NIL != control_vars.$mapping_equality_test$.getDynamicValue(thread)) {
            values = list_utilities.fast_delete_duplicates(values, control_vars.$mapping_equality_test$.getDynamicValue(thread), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        return values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 14253L)
    public static SubLObject pred_values_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(mt, kb_mapping_utilities.$sym11$HLMT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym12$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_values(v_term, pred, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 14964L)
    public static SubLObject pred_values_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(mts, kb_mapping_utilities.$sym17$LISTP);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym18$RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_values(v_term, pred, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 15704L)
    public static SubLObject pred_values_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = pred_values(v_term, pred, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 16416L)
    public static SubLObject pred_values_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_values(v_term, pred, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 16905L)
    public static SubLObject pred_refs(final SubLObject pred, SubLObject gather_arg, SubLObject truth) {
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        SubLObject answer_already_calculated = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL == control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
            answer_already_calculated = (SubLObject)kb_mapping_utilities.T;
            if (kb_mapping_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred) && kb_mapping_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                final SubLObject str = (SubLObject)kb_mapping_utilities.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((kb_mapping_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_mapping_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                    SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
                    final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                    while (kb_mapping_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_mapping_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                                SubLObject done_var_$17 = (SubLObject)kb_mapping_utilities.NIL;
                                final SubLObject token_var_$18 = (SubLObject)kb_mapping_utilities.NIL;
                                while (kb_mapping_utilities.NIL == done_var_$17) {
                                    final SubLObject assertion_var = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                    final SubLObject valid_$19 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$18.eql(assertion_var));
                                    if (kb_mapping_utilities.NIL != valid_$19) {
                                        final SubLObject v_term = assertions_high.gaf_arg(assertion_var, gather_arg);
                                        v_answer = (SubLObject)ConsesLow.cons(v_term, v_answer);
                                    }
                                    done_var_$17 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$19);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (kb_mapping_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if (kb_mapping_utilities.NIL == answer_already_calculated && kb_mapping_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
            final SubLObject str2 = (SubLObject)kb_mapping_utilities.NIL;
            final SubLObject _prev_bind_9 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_13 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_15 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_16 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((kb_mapping_utilities.NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_mapping_utilities.T), thread);
                utilities_macros.noting_progress_preamble(str2);
                final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                SubLObject done_var2 = (SubLObject)kb_mapping_utilities.NIL;
                final SubLObject token_var2 = (SubLObject)kb_mapping_utilities.NIL;
                while (kb_mapping_utilities.NIL == done_var2) {
                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                    if (kb_mapping_utilities.NIL != valid2) {
                        utilities_macros.note_progress();
                        SubLObject final_index_iterator2 = (SubLObject)kb_mapping_utilities.NIL;
                        try {
                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                            SubLObject done_var_$18 = (SubLObject)kb_mapping_utilities.NIL;
                            final SubLObject token_var_$19 = (SubLObject)kb_mapping_utilities.NIL;
                            while (kb_mapping_utilities.NIL == done_var_$18) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$19);
                                final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(assertion));
                                if (kb_mapping_utilities.NIL != valid_$20) {
                                    if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                        Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                    }
                                    v_answer = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion, gather_arg), v_answer);
                                }
                                done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$20);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (kb_mapping_utilities.NIL != final_index_iterator2) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                    }
                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid2);
                }
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_16, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_15, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_14, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_13, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_12, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_11, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_10, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_9, thread);
            }
        }
        if (kb_mapping_utilities.NIL != control_vars.$mapping_equality_test$.getDynamicValue(thread)) {
            v_answer = list_utilities.fast_delete_duplicates(v_answer, control_vars.$mapping_equality_test$.getDynamicValue(thread), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 18081L)
    public static SubLObject pred_refs_in_mt(final SubLObject pred, final SubLObject mt, SubLObject gather_arg, SubLObject truth) {
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(mt, kb_mapping_utilities.$sym11$HLMT_P);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym12$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_refs(pred, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 18662L)
    public static SubLObject pred_refs_in_mts(final SubLObject pred, final SubLObject mts, SubLObject gather_arg, SubLObject truth) {
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(mts, kb_mapping_utilities.$sym17$LISTP);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym18$RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_refs(pred, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 19272L)
    public static SubLObject pred_refs_in_any_mt(final SubLObject pred, SubLObject gather_arg, SubLObject truth) {
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = pred_refs(pred, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 19854L)
    public static SubLObject pred_refs_in_relevant_mts(final SubLObject pred, SubLObject mt, SubLObject gather_arg, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(gather_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_refs(pred, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 20258L)
    public static SubLObject pred_u_v_holds_gafs(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(u, u_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(u, u_arg, pred);
            SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$25 = (SubLObject)kb_mapping_utilities.NIL;
                        final SubLObject token_var_$26 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$25) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                            final SubLObject valid_$27 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$26.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$27 && kb_mapping_utilities.NIL != Functions.funcall(control_vars.$mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, v_arg), v)) {
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                            }
                            done_var_$25 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$27);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
            }
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 21103L)
    public static SubLObject pred_u_v_holds_tuples(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject gather_args, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(u, u_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(u, u_arg, pred);
            SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$28 = (SubLObject)kb_mapping_utilities.NIL;
                        final SubLObject token_var_$29 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$28) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                            final SubLObject valid_$30 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$29.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$30 && kb_mapping_utilities.NIL != Functions.funcall(control_vars.$mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, v_arg), v)) {
                                SubLObject tuple = (SubLObject)kb_mapping_utilities.NIL;
                                SubLObject cdolist_list_var = gather_args;
                                SubLObject arg = (SubLObject)kb_mapping_utilities.NIL;
                                arg = cdolist_list_var.first();
                                while (kb_mapping_utilities.NIL != cdolist_list_var) {
                                    tuple = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion, arg), tuple);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                }
                                tuple = Sequences.nreverse(tuple);
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = (SubLObject)ConsesLow.cons(tuple, v_answer);
                            }
                            done_var_$28 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$30);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
            }
        }
        if (kb_mapping_utilities.NIL != control_vars.$mapping_equality_test$.getDynamicValue(thread)) {
            v_answer = list_utilities.fast_delete_duplicates(v_answer, control_vars.$mapping_equality_test$.getDynamicValue(thread), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 22481L)
    public static SubLObject pred_u_v_w_holds_tuples(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject w, final SubLObject gather_args, SubLObject u_arg, SubLObject v_arg, SubLObject w_arg, SubLObject truth) {
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (w_arg == kb_mapping_utilities.UNPROVIDED) {
            w_arg = (SubLObject)kb_mapping_utilities.THREE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(u, u_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(u, u_arg, pred);
            SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$31 = (SubLObject)kb_mapping_utilities.NIL;
                        final SubLObject token_var_$32 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$31) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                            final SubLObject valid_$33 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$32.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$33 && kb_mapping_utilities.NIL != Functions.funcall(control_vars.$mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, v_arg), v) && kb_mapping_utilities.NIL != Functions.funcall(control_vars.$mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, w_arg), w)) {
                                SubLObject tuple = (SubLObject)kb_mapping_utilities.NIL;
                                SubLObject cdolist_list_var = gather_args;
                                SubLObject arg = (SubLObject)kb_mapping_utilities.NIL;
                                arg = cdolist_list_var.first();
                                while (kb_mapping_utilities.NIL != cdolist_list_var) {
                                    tuple = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion, arg), tuple);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                }
                                tuple = Sequences.nreverse(tuple);
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = (SubLObject)ConsesLow.cons(tuple, v_answer);
                            }
                            done_var_$31 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$33);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
            }
        }
        if (kb_mapping_utilities.NIL != control_vars.$mapping_equality_test$.getDynamicValue(thread)) {
            v_answer = list_utilities.fast_delete_duplicates(v_answer, control_vars.$mapping_equality_test$.getDynamicValue(thread), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 24060L)
    public static SubLObject fpred_u_v_holds_gaf(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(u, u_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(u, u_arg, pred);
            SubLObject done_var = v_answer;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$34 = v_answer;
                        final SubLObject token_var_$35 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$34) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                            final SubLObject valid_$36 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$35.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$36 && kb_mapping_utilities.NIL != Functions.funcall(control_vars.$mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, v_arg), v)) {
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = assertion;
                            }
                            done_var_$34 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$36 || kb_mapping_utilities.NIL != v_answer);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != v_answer);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 24862L)
    public static SubLObject pred_u_v_holds_gafs_in_relevant_mts(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            assertions = pred_u_v_holds_gafs(pred, u, v, u_arg, v_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 25218L)
    public static SubLObject fpred_u_v_holds_gaf_in_relevant_mts(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            assertion = fpred_u_v_holds_gaf(pred, u, v, u_arg, v_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 25572L)
    public static SubLObject pred_u_v_holds_gafs_in_any_mt(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = pred_u_v_holds_gafs(pred, u, v, u_arg, v_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 26119L)
    public static SubLObject fpred_u_v_holds_gaf_in_any_mt(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = fpred_u_v_holds_gaf(pred, u, v, u_arg, v_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 26681L)
    public static SubLObject pred_u_v_holds(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(u, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(v, kb_mapping_utilities.$sym77$HL_TERM_P);
        enforceType(u_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(v_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(u, u_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(u, u_arg, pred);
            SubLObject done_var = v_answer;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$37 = v_answer;
                        final SubLObject token_var_$38 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$37) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$38);
                            final SubLObject valid_$39 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$38.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$39 && kb_mapping_utilities.NIL != Functions.funcall(control_vars.$mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, v_arg), v)) {
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = (SubLObject)kb_mapping_utilities.T;
                            }
                            done_var_$37 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$39 || kb_mapping_utilities.NIL != v_answer);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != v_answer);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 27618L)
    public static SubLObject pred_u_v_holds_in_mt(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(u, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(v, kb_mapping_utilities.$sym77$HL_TERM_P);
        enforceType(mt, kb_mapping_utilities.$sym11$HLMT_P);
        enforceType(u_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(v_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym12$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_u_v_holds(pred, u, v, u_arg, v_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 28331L)
    public static SubLObject pred_u_v_holds_in_mts(final SubLObject pred, final SubLObject u, final SubLObject v, final SubLObject mts, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(u, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(v, kb_mapping_utilities.$sym77$HL_TERM_P);
        enforceType(mts, kb_mapping_utilities.$sym17$LISTP);
        enforceType(u_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(v_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym18$RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_u_v_holds(pred, u, v, u_arg, v_arg, truth);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 29073L)
    public static SubLObject pred_u_v_holds_in_any_mt(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(u, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(v, kb_mapping_utilities.$sym77$HL_TERM_P);
        enforceType(u_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(v_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = pred_u_v_holds(pred, u, v, u_arg, v_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 29787L)
    public static SubLObject pred_u_v_holds_in_relevant_mts(final SubLObject pred, final SubLObject u, final SubLObject v, SubLObject mt, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (u_arg == kb_mapping_utilities.UNPROVIDED) {
            u_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (v_arg == kb_mapping_utilities.UNPROVIDED) {
            v_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(u, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(v, kb_mapping_utilities.$sym77$HL_TERM_P);
        enforceType(u_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(v_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_u_v_holds(pred, u, v, u_arg, v_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 30262L)
    public static SubLObject tuple_holds(final SubLObject tuple, SubLObject index_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_mapping_utilities.NIL != Types.consp(tuple) : tuple;
        assert kb_mapping_utilities.NIL != Types.integerp(index_arg) : index_arg;
        assert kb_mapping_utilities.NIL != enumeration_types.truth_p(truth) : truth;
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(tuple);
        final SubLObject index_term = cycl_utilities.atomic_sentence_arg(tuple, index_arg, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        assert kb_mapping_utilities.NIL != forts.fort_p(pred) : pred;
        assert kb_mapping_utilities.NIL != kb_indexing_datastructures.indexed_term_p(index_term) : index_term;
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject pred_var = pred;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(index_term, index_arg, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(index_term, index_arg, pred_var);
            SubLObject done_var = v_answer;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$40 = v_answer;
                        final SubLObject token_var_$41 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$40) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                            final SubLObject valid_$42 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$41.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$42 && assertions_high.gaf_formula(assertion).equal(tuple)) {
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = (SubLObject)kb_mapping_utilities.T;
                            }
                            done_var_$40 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$42 || kb_mapping_utilities.NIL != v_answer);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != v_answer);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 31344L)
    public static SubLObject tuple_holds_in_mt(final SubLObject tuple, final SubLObject mt, SubLObject index_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_mapping_utilities.NIL != hlmt.hlmt_p(mt) : mt;
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym12$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = tuple_holds(tuple, index_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 31898L)
    public static SubLObject tuple_holds_in_mts(final SubLObject tuple, final SubLObject mts, SubLObject index_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_mapping_utilities.NIL != Types.listp(mts) : mts;
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym18$RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = tuple_holds(tuple, index_arg, truth);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 32481L)
    public static SubLObject tuple_holds_in_any_mt(final SubLObject tuple, SubLObject index_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = tuple_holds(tuple, index_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 33023L)
    public static SubLObject tuple_holds_in_relevant_mts(final SubLObject tuple, SubLObject mt, SubLObject index_arg, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = tuple_holds(tuple, index_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 33320L)
    public static SubLObject pred_values_mentioning(final SubLObject v_term, final SubLObject pred, final SubLObject item, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_mapping_utilities.NIL != kb_indexing_datastructures.indexed_term_p(v_term) : v_term;
        assert kb_mapping_utilities.NIL != forts.fort_p(pred) : pred;
        assert kb_mapping_utilities.NIL != term.hl_term_p(item) : item;
        assert kb_mapping_utilities.NIL != Types.integerp(index_arg) : index_arg;
        assert kb_mapping_utilities.NIL != Types.integerp(gather_arg) : gather_arg;
        assert kb_mapping_utilities.NIL != enumeration_types.truth_p(truth) : truth;
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
            SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$43 = (SubLObject)kb_mapping_utilities.NIL;
                        final SubLObject token_var_$44 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$43) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                            final SubLObject valid_$45 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$44.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$45) {
                                final SubLObject arg = assertions_high.gaf_arg(assertion, gather_arg);
                                if (kb_mapping_utilities.NIL != list_utilities.tree_find(item, arg, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                                    if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                        Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                    }
                                    v_answer = (SubLObject)ConsesLow.cons(arg, v_answer);
                                }
                            }
                            done_var_$43 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$45);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
            }
        }
        if (kb_mapping_utilities.NIL != control_vars.$mapping_equality_test$.getDynamicValue(thread)) {
            v_answer = list_utilities.fast_delete_duplicates(v_answer, control_vars.$mapping_equality_test$.getDynamicValue(thread), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 34193L)
    public static SubLObject pred_values_mentioning_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject item, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_mapping_utilities.NIL != hlmt.hlmt_p(mt) : mt;
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym12$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_values_mentioning(v_term, pred, item, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 34482L)
    public static SubLObject pred_values_mentioning_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject item, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_mapping_utilities.NIL != Types.listp(mts) : mts;
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym18$RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_values_mentioning(v_term, pred, item, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 34774L)
    public static SubLObject pred_values_mentioning_in_any_mt(final SubLObject v_term, final SubLObject pred, final SubLObject item, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = pred_values_mentioning(v_term, pred, item, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 35036L)
    public static SubLObject pred_values_mentioning_in_relevant_mts(final SubLObject v_term, final SubLObject pred, final SubLObject item, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (index_arg == kb_mapping_utilities.UNPROVIDED) {
            index_arg = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (gather_arg == kb_mapping_utilities.UNPROVIDED) {
            gather_arg = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_values_mentioning(v_term, pred, item, index_arg, gather_arg, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 35441L)
    public static SubLObject fpred_arg_value(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth) {
        if (term_psn == kb_mapping_utilities.UNPROVIDED) {
            term_psn = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (arg_psn == kb_mapping_utilities.UNPROVIDED) {
            arg_psn = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (gather_psn == kb_mapping_utilities.UNPROVIDED) {
            gather_psn = (SubLObject)kb_mapping_utilities.THREE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        return pred_arg_values(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, (SubLObject)kb_mapping_utilities.ONE_INTEGER).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 35638L)
    public static SubLObject pred_arg_values(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth, SubLObject number) {
        if (term_psn == kb_mapping_utilities.UNPROVIDED) {
            term_psn = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (arg_psn == kb_mapping_utilities.UNPROVIDED) {
            arg_psn = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (gather_psn == kb_mapping_utilities.UNPROVIDED) {
            gather_psn = (SubLObject)kb_mapping_utilities.THREE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        if (number == kb_mapping_utilities.UNPROVIDED) {
            number = (SubLObject)kb_mapping_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_mapping_utilities.NIL != kb_indexing_datastructures.indexed_term_p(v_term) : v_term;
        assert kb_mapping_utilities.NIL != forts.fort_p(pred) : pred;
        assert kb_mapping_utilities.NIL != Types.integerp(term_psn) : term_psn;
        assert kb_mapping_utilities.NIL != Types.integerp(arg_psn) : arg_psn;
        assert kb_mapping_utilities.NIL != Types.integerp(gather_psn) : gather_psn;
        assert kb_mapping_utilities.NIL != enumeration_types.truth_p(truth) : truth;
        return (kb_mapping_utilities.NIL != kb_mapping_utilities.$use_optimized_pred_arg_values_fixed_arityP$.getDynamicValue(thread) && kb_mapping_utilities.NIL != arity.arity(pred)) ? pred_arg_values_fixed_arity(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, number) : pred_arg_values_int(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 36211L)
    public static SubLObject pred_arg_values_int(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth, SubLObject number) {
        if (term_psn == kb_mapping_utilities.UNPROVIDED) {
            term_psn = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (arg_psn == kb_mapping_utilities.UNPROVIDED) {
            arg_psn = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (gather_psn == kb_mapping_utilities.UNPROVIDED) {
            gather_psn = (SubLObject)kb_mapping_utilities.THREE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        if (number == kb_mapping_utilities.UNPROVIDED) {
            number = (SubLObject)kb_mapping_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_count = (SubLObject)kb_mapping_utilities.ZERO_INTEGER;
        SubLObject result = (SubLObject)kb_mapping_utilities.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, term_psn, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, term_psn, pred);
            SubLObject done_var = doneP;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$46 = doneP;
                        final SubLObject token_var_$47 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$46) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                            final SubLObject valid_$48 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$47.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$48 && arg.equalp(assertions_high.gaf_arg(assertion, arg_psn))) {
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion, gather_psn), result);
                                result_count = Numbers.add(result_count, (SubLObject)kb_mapping_utilities.ONE_INTEGER);
                                doneP = (SubLObject)SubLObjectFactory.makeBoolean(number.isNumber() && result_count.numGE(number));
                            }
                            done_var_$46 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$48 || kb_mapping_utilities.NIL != doneP);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != doneP);
            }
        }
        if (kb_mapping_utilities.NIL != control_vars.$mapping_equality_test$.getDynamicValue(thread)) {
            result = list_utilities.fast_delete_duplicates(result, control_vars.$mapping_equality_test$.getDynamicValue(thread), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 36956L)
    public static SubLObject pred_arg_values_fixed_arity(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth, SubLObject number) {
        if (term_psn == kb_mapping_utilities.UNPROVIDED) {
            term_psn = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (arg_psn == kb_mapping_utilities.UNPROVIDED) {
            arg_psn = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (gather_psn == kb_mapping_utilities.UNPROVIDED) {
            gather_psn = (SubLObject)kb_mapping_utilities.THREE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        if (number == kb_mapping_utilities.UNPROVIDED) {
            number = (SubLObject)kb_mapping_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arity = arity.arity(pred);
        SubLObject result_count = (SubLObject)kb_mapping_utilities.ZERO_INTEGER;
        SubLObject result = (SubLObject)kb_mapping_utilities.NIL;
        SubLObject doneP = (SubLObject)kb_mapping_utilities.NIL;
        SubLObject asent = (SubLObject)kb_mapping_utilities.NIL;
        SubLObject variable_num = (SubLObject)kb_mapping_utilities.ZERO_INTEGER;
        asent = (SubLObject)ConsesLow.cons(pred, asent);
        SubLObject end_var;
        SubLObject n;
        for (end_var = Numbers.add(v_arity, (SubLObject)kb_mapping_utilities.ONE_INTEGER), n = (SubLObject)kb_mapping_utilities.NIL, n = (SubLObject)kb_mapping_utilities.ONE_INTEGER; !n.numGE(end_var); n = number_utilities.f_1X(n)) {
            if (n.eql(term_psn)) {
                asent = (SubLObject)ConsesLow.cons(v_term, asent);
            }
            else if (n.eql(arg_psn)) {
                asent = (SubLObject)ConsesLow.cons(arg, asent);
            }
            else {
                asent = (SubLObject)ConsesLow.cons(variables.get_variable(variable_num), asent);
                variable_num = Numbers.add(variable_num, (SubLObject)kb_mapping_utilities.ONE_INTEGER);
            }
        }
        asent = Sequences.nreverse(asent);
        final SubLObject l_index = kb_indexing.best_gaf_lookup_index(asent, truth, (SubLObject)kb_mapping_utilities.NIL);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)kb_mapping_utilities.$kw96$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term_$49 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (kb_mapping_utilities.NIL != argnum) {
                if (kb_mapping_utilities.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$49, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$49, argnum, pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (kb_mapping_utilities.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                                    SubLObject done_var_$50 = doneP;
                                    final SubLObject token_var_$51 = (SubLObject)kb_mapping_utilities.NIL;
                                    while (kb_mapping_utilities.NIL == done_var_$50) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$51);
                                        final SubLObject valid_$52 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$51.eql(assertion));
                                        if (kb_mapping_utilities.NIL != valid_$52 && kb_mapping_utilities.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                                            if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                                Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                            }
                                            result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion, gather_psn), result);
                                            result_count = Numbers.add(result_count, (SubLObject)kb_mapping_utilities.ONE_INTEGER);
                                            doneP = (SubLObject)SubLObjectFactory.makeBoolean(number.isNumber() && result_count.numGE(number));
                                        }
                                        done_var_$50 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$52 || kb_mapping_utilities.NIL != doneP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (kb_mapping_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != doneP);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)kb_mapping_utilities.NIL;
                    if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$49, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$49, argnum, pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (kb_mapping_utilities.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                                    SubLObject done_var_$51 = doneP;
                                    final SubLObject token_var_$52 = (SubLObject)kb_mapping_utilities.NIL;
                                    while (kb_mapping_utilities.NIL == done_var_$51) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$52);
                                        final SubLObject valid_$53 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$52.eql(assertion));
                                        if (kb_mapping_utilities.NIL != valid_$53 && kb_mapping_utilities.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                                            if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                                Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                            }
                                            result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion, gather_psn), result);
                                            result_count = Numbers.add(result_count, (SubLObject)kb_mapping_utilities.ONE_INTEGER);
                                            doneP = (SubLObject)SubLObjectFactory.makeBoolean(number.isNumber() && result_count.numGE(number));
                                        }
                                        done_var_$51 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$53 || kb_mapping_utilities.NIL != doneP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (kb_mapping_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != doneP);
                        }
                    }
                }
            }
            else if (kb_mapping_utilities.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$49, (SubLObject)kb_mapping_utilities.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$49, (SubLObject)kb_mapping_utilities.NIL, pred_var);
                    SubLObject done_var = doneP;
                    final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                    while (kb_mapping_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_mapping_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                                SubLObject done_var_$52 = doneP;
                                final SubLObject token_var_$53 = (SubLObject)kb_mapping_utilities.NIL;
                                while (kb_mapping_utilities.NIL == done_var_$52) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$53);
                                    final SubLObject valid_$54 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$53.eql(assertion));
                                    if (kb_mapping_utilities.NIL != valid_$54 && kb_mapping_utilities.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                                        if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                            Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                        }
                                        result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion, gather_psn), result);
                                        result_count = Numbers.add(result_count, (SubLObject)kb_mapping_utilities.ONE_INTEGER);
                                        doneP = (SubLObject)SubLObjectFactory.makeBoolean(number.isNumber() && result_count.numGE(number));
                                    }
                                    done_var_$52 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$54 || kb_mapping_utilities.NIL != doneP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (kb_mapping_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != doneP);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)kb_mapping_utilities.NIL;
                if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$49, (SubLObject)kb_mapping_utilities.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$49, (SubLObject)kb_mapping_utilities.NIL, pred_var);
                    SubLObject done_var = doneP;
                    final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                    while (kb_mapping_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_mapping_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                                SubLObject done_var_$53 = doneP;
                                final SubLObject token_var_$54 = (SubLObject)kb_mapping_utilities.NIL;
                                while (kb_mapping_utilities.NIL == done_var_$53) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$54);
                                    final SubLObject valid_$55 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$54.eql(assertion));
                                    if (kb_mapping_utilities.NIL != valid_$55 && kb_mapping_utilities.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                                        if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                            Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                        }
                                        result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion, gather_psn), result);
                                        result_count = Numbers.add(result_count, (SubLObject)kb_mapping_utilities.ONE_INTEGER);
                                        doneP = (SubLObject)SubLObjectFactory.makeBoolean(number.isNumber() && result_count.numGE(number));
                                    }
                                    done_var_$53 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$55 || kb_mapping_utilities.NIL != doneP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (kb_mapping_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != doneP);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)kb_mapping_utilities.$kw97$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (kb_mapping_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)kb_mapping_utilities.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((kb_mapping_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_mapping_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = doneP;
                    final SubLObject token_var2 = (SubLObject)kb_mapping_utilities.NIL;
                    while (kb_mapping_utilities.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (kb_mapping_utilities.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)kb_mapping_utilities.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                                SubLObject done_var_$54 = doneP;
                                final SubLObject token_var_$55 = (SubLObject)kb_mapping_utilities.NIL;
                                while (kb_mapping_utilities.NIL == done_var_$54) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$55);
                                    final SubLObject valid_$56 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$55.eql(assertion2));
                                    if (kb_mapping_utilities.NIL != valid_$56 && kb_mapping_utilities.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion2), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                                        if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                            Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion2);
                                        }
                                        result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion2, gather_psn), result);
                                        result_count = Numbers.add(result_count, (SubLObject)kb_mapping_utilities.ONE_INTEGER);
                                        doneP = (SubLObject)SubLObjectFactory.makeBoolean(number.isNumber() && result_count.numGE(number));
                                    }
                                    done_var_$54 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$56 || kb_mapping_utilities.NIL != doneP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (kb_mapping_utilities.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid2 || kb_mapping_utilities.NIL != doneP);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)kb_mapping_utilities.$kw98$OVERLAP)) {
            SubLObject rest;
            SubLObject assertion3;
            for (rest = (SubLObject)kb_mapping_utilities.NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)kb_mapping_utilities.UNPROVIDED); kb_mapping_utilities.NIL == doneP && kb_mapping_utilities.NIL != rest; rest = rest.rest()) {
                assertion3 = rest.first();
                if ((kb_mapping_utilities.NIL == truth || kb_mapping_utilities.NIL != assertions_high.assertion_has_truth(assertion3, truth)) && kb_mapping_utilities.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion3), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                    if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                        Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion3);
                    }
                    result = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion3, gather_psn), result);
                    result_count = Numbers.add(result_count, (SubLObject)kb_mapping_utilities.ONE_INTEGER);
                    doneP = (SubLObject)SubLObjectFactory.makeBoolean(number.isNumber() && result_count.numGE(number));
                }
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        if (kb_mapping_utilities.NIL != control_vars.$mapping_equality_test$.getDynamicValue(thread)) {
            result = list_utilities.fast_delete_duplicates(result, control_vars.$mapping_equality_test$.getDynamicValue(thread), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 37988L)
    public static SubLObject pred_arg_values_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject arg, final SubLObject mt, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth) {
        if (term_psn == kb_mapping_utilities.UNPROVIDED) {
            term_psn = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (arg_psn == kb_mapping_utilities.UNPROVIDED) {
            arg_psn = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (gather_psn == kb_mapping_utilities.UNPROVIDED) {
            gather_psn = (SubLObject)kb_mapping_utilities.THREE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_mapping_utilities.NIL != hlmt.hlmt_p(mt) : mt;
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym12$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_arg_values(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 38279L)
    public static SubLObject pred_arg_values_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject arg, final SubLObject mts, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth) {
        if (term_psn == kb_mapping_utilities.UNPROVIDED) {
            term_psn = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (arg_psn == kb_mapping_utilities.UNPROVIDED) {
            arg_psn = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (gather_psn == kb_mapping_utilities.UNPROVIDED) {
            gather_psn = (SubLObject)kb_mapping_utilities.THREE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_mapping_utilities.NIL != Types.listp(mts) : mts;
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym18$RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_arg_values(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 38574L)
    public static SubLObject pred_arg_values_in_any_mt(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth) {
        if (term_psn == kb_mapping_utilities.UNPROVIDED) {
            term_psn = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (arg_psn == kb_mapping_utilities.UNPROVIDED) {
            arg_psn = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (gather_psn == kb_mapping_utilities.UNPROVIDED) {
            gather_psn = (SubLObject)kb_mapping_utilities.THREE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = pred_arg_values(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 38839L)
    public static SubLObject pred_arg_values_in_relevant_mts(final SubLObject v_term, final SubLObject pred, final SubLObject arg, SubLObject mt, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (term_psn == kb_mapping_utilities.UNPROVIDED) {
            term_psn = (SubLObject)kb_mapping_utilities.ONE_INTEGER;
        }
        if (arg_psn == kb_mapping_utilities.UNPROVIDED) {
            arg_psn = (SubLObject)kb_mapping_utilities.TWO_INTEGER;
        }
        if (gather_psn == kb_mapping_utilities.UNPROVIDED) {
            gather_psn = (SubLObject)kb_mapping_utilities.THREE_INTEGER;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_arg_values(v_term, pred, arg, term_psn, arg_psn, gather_psn, truth, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 39117L)
    public static SubLObject pred_value_tuples(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, SubLObject truth) {
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_args, kb_mapping_utilities.$sym17$LISTP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        if (kb_mapping_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kb_mapping_utilities.NIL == list_utilities.every_in_list(Symbols.symbol_function((SubLObject)kb_mapping_utilities.$sym3$INTEGERP), gather_args, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
            Errors.error((SubLObject)kb_mapping_utilities.$str99$_S_is_not_a_valid_arg_position_li);
        }
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred);
            SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
            final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
            while (kb_mapping_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (kb_mapping_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, truth, (SubLObject)kb_mapping_utilities.NIL);
                        SubLObject done_var_$66 = (SubLObject)kb_mapping_utilities.NIL;
                        final SubLObject token_var_$67 = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var_$66) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$67);
                            final SubLObject valid_$68 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$67.eql(assertion));
                            if (kb_mapping_utilities.NIL != valid_$68) {
                                SubLObject tuple = (SubLObject)kb_mapping_utilities.NIL;
                                SubLObject cdolist_list_var = gather_args;
                                SubLObject arg = (SubLObject)kb_mapping_utilities.NIL;
                                arg = cdolist_list_var.first();
                                while (kb_mapping_utilities.NIL != cdolist_list_var) {
                                    tuple = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(assertion, arg), tuple);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    arg = cdolist_list_var.first();
                                }
                                tuple = Sequences.nreverse(tuple);
                                if (kb_mapping_utilities.NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread)) {
                                    Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                v_answer = (SubLObject)ConsesLow.cons(tuple, v_answer);
                            }
                            done_var_$66 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$68);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (kb_mapping_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
            }
        }
        if (kb_mapping_utilities.NIL != control_vars.$mapping_equality_test$.getDynamicValue(thread)) {
            v_answer = list_utilities.fast_delete_duplicates(v_answer, control_vars.$mapping_equality_test$.getDynamicValue(thread), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 40357L)
    public static SubLObject pred_value_tuples_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, final SubLObject mt, SubLObject truth) {
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_args, kb_mapping_utilities.$sym17$LISTP);
        enforceType(mt, kb_mapping_utilities.$sym11$HLMT_P);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym12$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            v_answer = pred_value_tuples(v_term, pred, index_arg, gather_args, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 41078L)
    public static SubLObject pred_value_tuples_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, final SubLObject mts, SubLObject truth) {
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_args, kb_mapping_utilities.$sym17$LISTP);
        enforceType(mts, kb_mapping_utilities.$sym17$LISTP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym18$RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            v_answer = pred_value_tuples(v_term, pred, index_arg, gather_args, truth);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 41832L)
    public static SubLObject pred_value_tuples_in_any_mt(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, SubLObject truth) {
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_args, kb_mapping_utilities.$sym17$LISTP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_mapping_utilities.$sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_mapping_utilities.$const24$EverythingPSC, thread);
            v_answer = pred_value_tuples(v_term, pred, index_arg, gather_args, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 42554L)
    public static SubLObject pred_value_tuples_in_relevant_mts(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_args, SubLObject mt, SubLObject truth) {
        if (mt == kb_mapping_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_mapping_utilities.NIL;
        }
        if (truth == kb_mapping_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_mapping_utilities.$kw0$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(v_term, kb_mapping_utilities.$sym1$INDEXED_TERM_P);
        enforceType(pred, kb_mapping_utilities.$sym2$FORT_P);
        enforceType(index_arg, kb_mapping_utilities.$sym3$INTEGERP);
        enforceType(gather_args, kb_mapping_utilities.$sym17$LISTP);
        enforceType(truth, kb_mapping_utilities.$sym4$TRUTH_P);
        SubLObject v_answer = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = pred_value_tuples(v_term, pred, index_arg, gather_args, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 43055L)
    public static SubLObject gaf_truth_known(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject truth = (SubLObject)kb_mapping_utilities.NIL;
        final SubLObject l_index = kb_indexing.best_gaf_lookup_index(gaf, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)kb_mapping_utilities.$kw96$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (kb_mapping_utilities.NIL != argnum) {
                if (kb_mapping_utilities.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = truth;
                        final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (kb_mapping_utilities.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
                                    SubLObject done_var_$69 = truth;
                                    final SubLObject token_var_$70 = (SubLObject)kb_mapping_utilities.NIL;
                                    while (kb_mapping_utilities.NIL == done_var_$69) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$70);
                                        final SubLObject valid_$71 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$70.eql(assertion));
                                        if (kb_mapping_utilities.NIL != valid_$71 && kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                                            truth = assertions_high.assertion_truth(assertion);
                                        }
                                        done_var_$69 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$71 || kb_mapping_utilities.NIL != truth);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (kb_mapping_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != truth);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)kb_mapping_utilities.NIL;
                    if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = truth;
                        final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (kb_mapping_utilities.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
                                    SubLObject done_var_$70 = truth;
                                    final SubLObject token_var_$71 = (SubLObject)kb_mapping_utilities.NIL;
                                    while (kb_mapping_utilities.NIL == done_var_$70) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$71);
                                        final SubLObject valid_$72 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$71.eql(assertion));
                                        if (kb_mapping_utilities.NIL != valid_$72 && kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                                            truth = assertions_high.assertion_truth(assertion);
                                        }
                                        done_var_$70 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$72 || kb_mapping_utilities.NIL != truth);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (kb_mapping_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != truth);
                        }
                    }
                }
            }
            else if (kb_mapping_utilities.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)kb_mapping_utilities.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_utilities.NIL, pred_var);
                    SubLObject done_var = truth;
                    final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                    while (kb_mapping_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_mapping_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
                                SubLObject done_var_$71 = truth;
                                final SubLObject token_var_$72 = (SubLObject)kb_mapping_utilities.NIL;
                                while (kb_mapping_utilities.NIL == done_var_$71) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$72);
                                    final SubLObject valid_$73 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$72.eql(assertion));
                                    if (kb_mapping_utilities.NIL != valid_$73 && kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                                        truth = assertions_high.assertion_truth(assertion);
                                    }
                                    done_var_$71 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$73 || kb_mapping_utilities.NIL != truth);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (kb_mapping_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != truth);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)kb_mapping_utilities.NIL;
                if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)kb_mapping_utilities.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_utilities.NIL, pred_var);
                    SubLObject done_var = truth;
                    final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                    while (kb_mapping_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_mapping_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
                                SubLObject done_var_$72 = truth;
                                final SubLObject token_var_$73 = (SubLObject)kb_mapping_utilities.NIL;
                                while (kb_mapping_utilities.NIL == done_var_$72) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$73);
                                    final SubLObject valid_$74 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$73.eql(assertion));
                                    if (kb_mapping_utilities.NIL != valid_$74 && kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                                        truth = assertions_high.assertion_truth(assertion);
                                    }
                                    done_var_$72 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$74 || kb_mapping_utilities.NIL != truth);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (kb_mapping_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid || kb_mapping_utilities.NIL != truth);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)kb_mapping_utilities.$kw97$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (kb_mapping_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)kb_mapping_utilities.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((kb_mapping_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_mapping_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = truth;
                    final SubLObject token_var2 = (SubLObject)kb_mapping_utilities.NIL;
                    while (kb_mapping_utilities.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (kb_mapping_utilities.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)kb_mapping_utilities.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)kb_mapping_utilities.$kw5$GAF, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
                                SubLObject done_var_$73 = truth;
                                final SubLObject token_var_$74 = (SubLObject)kb_mapping_utilities.NIL;
                                while (kb_mapping_utilities.NIL == done_var_$73) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$74);
                                    final SubLObject valid_$75 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$74.eql(assertion2));
                                    if (kb_mapping_utilities.NIL != valid_$75 && kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion2), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                                        truth = assertions_high.assertion_truth(assertion2);
                                    }
                                    done_var_$73 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$75 || kb_mapping_utilities.NIL != truth);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (kb_mapping_utilities.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid2 || kb_mapping_utilities.NIL != truth);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)kb_mapping_utilities.$kw98$OVERLAP)) {
            SubLObject rest;
            SubLObject assertion3;
            for (rest = (SubLObject)kb_mapping_utilities.NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)kb_mapping_utilities.UNPROVIDED); kb_mapping_utilities.NIL == truth && kb_mapping_utilities.NIL != rest; rest = rest.rest()) {
                assertion3 = rest.first();
                if (kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf, assertions_high.gaf_formula(assertion3), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED)) {
                    truth = assertions_high.assertion_truth(assertion3);
                }
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        return truth;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-mapping-utilities.lisp", position = 43343L)
    public static SubLObject gaf_trueP(final SubLObject gaf_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject l_index = kb_indexing.best_gaf_lookup_index(gaf_formula, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)kb_mapping_utilities.$kw96$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (kb_mapping_utilities.NIL != argnum) {
                if (kb_mapping_utilities.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
                        final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (kb_mapping_utilities.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
                                    SubLObject done_var_$85 = (SubLObject)kb_mapping_utilities.NIL;
                                    final SubLObject token_var_$86 = (SubLObject)kb_mapping_utilities.NIL;
                                    while (kb_mapping_utilities.NIL == done_var_$85) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$86);
                                        final SubLObject valid_$87 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$86.eql(assertion));
                                        if (kb_mapping_utilities.NIL != valid_$87 && kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED) && kb_mapping_utilities.$kw0$TRUE == assertions_high.assertion_truth(assertion)) {
                                            return (SubLObject)kb_mapping_utilities.T;
                                        }
                                        done_var_$85 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$87);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (kb_mapping_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)kb_mapping_utilities.NIL;
                    if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
                        final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                        while (kb_mapping_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (kb_mapping_utilities.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
                                    SubLObject done_var_$86 = (SubLObject)kb_mapping_utilities.NIL;
                                    final SubLObject token_var_$87 = (SubLObject)kb_mapping_utilities.NIL;
                                    while (kb_mapping_utilities.NIL == done_var_$86) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$87);
                                        final SubLObject valid_$88 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$87.eql(assertion));
                                        if (kb_mapping_utilities.NIL != valid_$88 && kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED) && kb_mapping_utilities.$kw0$TRUE == assertions_high.assertion_truth(assertion)) {
                                            return (SubLObject)kb_mapping_utilities.T;
                                        }
                                        done_var_$86 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$88);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (kb_mapping_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
                        }
                    }
                }
            }
            else if (kb_mapping_utilities.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)kb_mapping_utilities.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_utilities.NIL, pred_var);
                    SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
                    final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                    while (kb_mapping_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_mapping_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
                                SubLObject done_var_$87 = (SubLObject)kb_mapping_utilities.NIL;
                                final SubLObject token_var_$88 = (SubLObject)kb_mapping_utilities.NIL;
                                while (kb_mapping_utilities.NIL == done_var_$87) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$88);
                                    final SubLObject valid_$89 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$88.eql(assertion));
                                    if (kb_mapping_utilities.NIL != valid_$89 && kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED) && kb_mapping_utilities.$kw0$TRUE == assertions_high.assertion_truth(assertion)) {
                                        return (SubLObject)kb_mapping_utilities.T;
                                    }
                                    done_var_$87 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$89);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (kb_mapping_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)kb_mapping_utilities.NIL;
                if (kb_mapping_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)kb_mapping_utilities.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)kb_mapping_utilities.NIL, pred_var);
                    SubLObject done_var = (SubLObject)kb_mapping_utilities.NIL;
                    final SubLObject token_var = (SubLObject)kb_mapping_utilities.NIL;
                    while (kb_mapping_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_mapping_utilities.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)kb_mapping_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_mapping_utilities.$kw5$GAF, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
                                SubLObject done_var_$88 = (SubLObject)kb_mapping_utilities.NIL;
                                final SubLObject token_var_$89 = (SubLObject)kb_mapping_utilities.NIL;
                                while (kb_mapping_utilities.NIL == done_var_$88) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$89);
                                    final SubLObject valid_$90 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$89.eql(assertion));
                                    if (kb_mapping_utilities.NIL != valid_$90 && kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED) && kb_mapping_utilities.$kw0$TRUE == assertions_high.assertion_truth(assertion)) {
                                        return (SubLObject)kb_mapping_utilities.T;
                                    }
                                    done_var_$88 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$90);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (kb_mapping_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)kb_mapping_utilities.$kw97$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (kb_mapping_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)kb_mapping_utilities.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)kb_mapping_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((kb_mapping_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_mapping_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)kb_mapping_utilities.NIL;
                    final SubLObject token_var2 = (SubLObject)kb_mapping_utilities.NIL;
                    while (kb_mapping_utilities.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (kb_mapping_utilities.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)kb_mapping_utilities.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)kb_mapping_utilities.$kw5$GAF, (SubLObject)kb_mapping_utilities.NIL, (SubLObject)kb_mapping_utilities.NIL);
                                SubLObject done_var_$89 = (SubLObject)kb_mapping_utilities.NIL;
                                final SubLObject token_var_$90 = (SubLObject)kb_mapping_utilities.NIL;
                                while (kb_mapping_utilities.NIL == done_var_$89) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$90);
                                    final SubLObject valid_$91 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$90.eql(assertion2));
                                    if (kb_mapping_utilities.NIL != valid_$91 && kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion2), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED) && kb_mapping_utilities.$kw0$TRUE == assertions_high.assertion_truth(assertion2)) {
                                        return (SubLObject)kb_mapping_utilities.T;
                                    }
                                    done_var_$89 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid_$91);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$100 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_mapping_utilities.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (kb_mapping_utilities.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(kb_mapping_utilities.NIL == valid2);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)kb_mapping_utilities.$kw98$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)kb_mapping_utilities.UNPROVIDED);
            SubLObject assertion3 = (SubLObject)kb_mapping_utilities.NIL;
            assertion3 = cdolist_list_var.first();
            while (kb_mapping_utilities.NIL != cdolist_list_var) {
                if (kb_mapping_utilities.NIL != unification_utilities.asent_unify(gaf_formula, assertions_high.gaf_formula(assertion3), (SubLObject)kb_mapping_utilities.UNPROVIDED, (SubLObject)kb_mapping_utilities.UNPROVIDED) && kb_mapping_utilities.$kw0$TRUE == assertions_high.assertion_truth(assertion3)) {
                    return (SubLObject)kb_mapping_utilities.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        return (SubLObject)kb_mapping_utilities.NIL;
    }
    
    public static SubLObject declare_kb_mapping_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "some_pred_value", "SOME-PRED-VALUE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "some_pred_value_in_mt", "SOME-PRED-VALUE-IN-MT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "some_pred_value_in_mts", "SOME-PRED-VALUE-IN-MTS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "some_pred_value_in_any_mt", "SOME-PRED-VALUE-IN-ANY-MT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "some_pred_value_in_relevant_mts", "SOME-PRED-VALUE-IN-RELEVANT-MTS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "some_pred_value_if", "SOME-PRED-VALUE-IF", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_value_gaf", "FPRED-VALUE-GAF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_value_gaf_in_relevant_mts", "FPRED-VALUE-GAF-IN-RELEVANT-MTS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_value_gaf_in_any_mt", "FPRED-VALUE-GAF-IN-ANY-MT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_value", "FPRED-VALUE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_value_in_mt", "FPRED-VALUE-IN-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_value_in_mts", "FPRED-VALUE-IN-MTS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_value_in_any_mt", "FPRED-VALUE-IN-ANY-MT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_value_in_relevant_mts", "FPRED-VALUE-IN-RELEVANT-MTS", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_value_gafs", "PRED-VALUE-GAFS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_value_gafs_in_mt", "PRED-VALUE-GAFS-IN-MT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_value_gafs_in_relevant_mts", "PRED-VALUE-GAFS-IN-RELEVANT-MTS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_value_gafs_in_any_mt", "PRED-VALUE-GAFS-IN-ANY-MT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_values", "PRED-VALUES", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_values_in_mt", "PRED-VALUES-IN-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_values_in_mts", "PRED-VALUES-IN-MTS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_values_in_any_mt", "PRED-VALUES-IN-ANY-MT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_values_in_relevant_mts", "PRED-VALUES-IN-RELEVANT-MTS", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_refs", "PRED-REFS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_refs_in_mt", "PRED-REFS-IN-MT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_refs_in_mts", "PRED-REFS-IN-MTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_refs_in_any_mt", "PRED-REFS-IN-ANY-MT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_refs_in_relevant_mts", "PRED-REFS-IN-RELEVANT-MTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_u_v_holds_gafs", "PRED-U-V-HOLDS-GAFS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_u_v_holds_tuples", "PRED-U-V-HOLDS-TUPLES", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_u_v_w_holds_tuples", "PRED-U-V-W-HOLDS-TUPLES", 5, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_u_v_holds_gaf", "FPRED-U-V-HOLDS-GAF", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_u_v_holds_gafs_in_relevant_mts", "PRED-U-V-HOLDS-GAFS-IN-RELEVANT-MTS", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_u_v_holds_gaf_in_relevant_mts", "FPRED-U-V-HOLDS-GAF-IN-RELEVANT-MTS", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_u_v_holds_gafs_in_any_mt", "PRED-U-V-HOLDS-GAFS-IN-ANY-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_u_v_holds_gaf_in_any_mt", "FPRED-U-V-HOLDS-GAF-IN-ANY-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_u_v_holds", "PRED-U-V-HOLDS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_u_v_holds_in_mt", "PRED-U-V-HOLDS-IN-MT", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_u_v_holds_in_mts", "PRED-U-V-HOLDS-IN-MTS", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_u_v_holds_in_any_mt", "PRED-U-V-HOLDS-IN-ANY-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_u_v_holds_in_relevant_mts", "PRED-U-V-HOLDS-IN-RELEVANT-MTS", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "tuple_holds", "TUPLE-HOLDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "tuple_holds_in_mt", "TUPLE-HOLDS-IN-MT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "tuple_holds_in_mts", "TUPLE-HOLDS-IN-MTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "tuple_holds_in_any_mt", "TUPLE-HOLDS-IN-ANY-MT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "tuple_holds_in_relevant_mts", "TUPLE-HOLDS-IN-RELEVANT-MTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_values_mentioning", "PRED-VALUES-MENTIONING", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_values_mentioning_in_mt", "PRED-VALUES-MENTIONING-IN-MT", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_values_mentioning_in_mts", "PRED-VALUES-MENTIONING-IN-MTS", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_values_mentioning_in_any_mt", "PRED-VALUES-MENTIONING-IN-ANY-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_values_mentioning_in_relevant_mts", "PRED-VALUES-MENTIONING-IN-RELEVANT-MTS", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "fpred_arg_value", "FPRED-ARG-VALUE", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_arg_values", "PRED-ARG-VALUES", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_arg_values_int", "PRED-ARG-VALUES-INT", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_arg_values_fixed_arity", "PRED-ARG-VALUES-FIXED-ARITY", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_arg_values_in_mt", "PRED-ARG-VALUES-IN-MT", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_arg_values_in_mts", "PRED-ARG-VALUES-IN-MTS", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_arg_values_in_any_mt", "PRED-ARG-VALUES-IN-ANY-MT", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_arg_values_in_relevant_mts", "PRED-ARG-VALUES-IN-RELEVANT-MTS", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_value_tuples", "PRED-VALUE-TUPLES", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_value_tuples_in_mt", "PRED-VALUE-TUPLES-IN-MT", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_value_tuples_in_mts", "PRED-VALUE-TUPLES-IN-MTS", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_value_tuples_in_any_mt", "PRED-VALUE-TUPLES-IN-ANY-MT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "pred_value_tuples_in_relevant_mts", "PRED-VALUE-TUPLES-IN-RELEVANT-MTS", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "gaf_truth_known", "GAF-TRUTH-KNOWN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_mapping_utilities", "gaf_trueP", "GAF-TRUE?", 1, 0, false);
        return (SubLObject)kb_mapping_utilities.NIL;
    }
    
    public static SubLObject init_kb_mapping_utilities_file() {
        kb_mapping_utilities.$use_optimized_pred_arg_values_fixed_arityP$ = SubLFiles.defparameter("*USE-OPTIMIZED-PRED-ARG-VALUES-FIXED-ARITY?*", (SubLObject)kb_mapping_utilities.T);
        return (SubLObject)kb_mapping_utilities.NIL;
    }
    
    public static SubLObject setup_kb_mapping_utilities_file() {
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym6$SOME_PRED_VALUE, (SubLObject)kb_mapping_utilities.$list7, (SubLObject)kb_mapping_utilities.$str8$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list9, (SubLObject)kb_mapping_utilities.$list10);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym13$SOME_PRED_VALUE_IN_MT, (SubLObject)kb_mapping_utilities.$list14, (SubLObject)kb_mapping_utilities.$str15$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list16, (SubLObject)kb_mapping_utilities.$list10);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym19$SOME_PRED_VALUE_IN_MTS, (SubLObject)kb_mapping_utilities.$list20, (SubLObject)kb_mapping_utilities.$str21$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list22, (SubLObject)kb_mapping_utilities.$list10);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym25$SOME_PRED_VALUE_IN_ANY_MT, (SubLObject)kb_mapping_utilities.$list7, (SubLObject)kb_mapping_utilities.$str26$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list9, (SubLObject)kb_mapping_utilities.$list10);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym27$SOME_PRED_VALUE_IN_RELEVANT_MTS, (SubLObject)kb_mapping_utilities.$list28, (SubLObject)kb_mapping_utilities.$str29$If_MT_is_NIL__behaves_like_SOME_P, (SubLObject)kb_mapping_utilities.$list9, (SubLObject)kb_mapping_utilities.$list10);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym31$FPRED_VALUE, (SubLObject)kb_mapping_utilities.$list32, (SubLObject)kb_mapping_utilities.$str33$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list34, (SubLObject)kb_mapping_utilities.$list35);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym36$FPRED_VALUE_IN_MT, (SubLObject)kb_mapping_utilities.$list37, (SubLObject)kb_mapping_utilities.$str38$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list39, (SubLObject)kb_mapping_utilities.$list35);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym40$FPRED_VALUE_IN_MTS, (SubLObject)kb_mapping_utilities.$list41, (SubLObject)kb_mapping_utilities.$str42$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list43, (SubLObject)kb_mapping_utilities.$list35);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym44$FPRED_VALUE_IN_ANY_MT, (SubLObject)kb_mapping_utilities.$list32, (SubLObject)kb_mapping_utilities.$str45$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list34, (SubLObject)kb_mapping_utilities.$list35);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym46$FPRED_VALUE_IN_RELEVANT_MTS, (SubLObject)kb_mapping_utilities.$list47, (SubLObject)kb_mapping_utilities.$str48$If_MT_is_NIL__behaves_like_FPRED_, (SubLObject)kb_mapping_utilities.$list34, (SubLObject)kb_mapping_utilities.$list35);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym49$PRED_VALUES, (SubLObject)kb_mapping_utilities.$list32, (SubLObject)kb_mapping_utilities.$str50$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list34, (SubLObject)kb_mapping_utilities.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym52$PRED_VALUES_IN_MT, (SubLObject)kb_mapping_utilities.$list37, (SubLObject)kb_mapping_utilities.$str53$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list39, (SubLObject)kb_mapping_utilities.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym54$PRED_VALUES_IN_MTS, (SubLObject)kb_mapping_utilities.$list41, (SubLObject)kb_mapping_utilities.$str55$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list43, (SubLObject)kb_mapping_utilities.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym56$PRED_VALUES_IN_ANY_MT, (SubLObject)kb_mapping_utilities.$list32, (SubLObject)kb_mapping_utilities.$str57$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list34, (SubLObject)kb_mapping_utilities.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym58$PRED_VALUES_IN_RELEVANT_MTS, (SubLObject)kb_mapping_utilities.$list47, (SubLObject)kb_mapping_utilities.$str59$If_MT_is_NIL__behaves_like_PRED_V, (SubLObject)kb_mapping_utilities.$list34, (SubLObject)kb_mapping_utilities.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym60$PRED_REFS, (SubLObject)kb_mapping_utilities.$list61, (SubLObject)kb_mapping_utilities.$str62$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list63, (SubLObject)kb_mapping_utilities.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym64$PRED_REFS_IN_MT, (SubLObject)kb_mapping_utilities.$list65, (SubLObject)kb_mapping_utilities.$str66$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list67, (SubLObject)kb_mapping_utilities.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym68$PRED_REFS_IN_MTS, (SubLObject)kb_mapping_utilities.$list69, (SubLObject)kb_mapping_utilities.$str70$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list71, (SubLObject)kb_mapping_utilities.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym72$PRED_REFS_IN_ANY_MT, (SubLObject)kb_mapping_utilities.$list61, (SubLObject)kb_mapping_utilities.$str73$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list63, (SubLObject)kb_mapping_utilities.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym74$PRED_REFS_IN_RELEVANT_MTS, (SubLObject)kb_mapping_utilities.$list75, (SubLObject)kb_mapping_utilities.$str76$If_MT_is_NIL__behaves_like_PRED_R, (SubLObject)kb_mapping_utilities.$list63, (SubLObject)kb_mapping_utilities.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym78$PRED_U_V_HOLDS, (SubLObject)kb_mapping_utilities.$list79, (SubLObject)kb_mapping_utilities.$str80$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list81, (SubLObject)kb_mapping_utilities.$list10);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym82$PRED_U_V_HOLDS_IN_MT, (SubLObject)kb_mapping_utilities.$list83, (SubLObject)kb_mapping_utilities.$str84$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list85, (SubLObject)kb_mapping_utilities.$list10);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym86$PRED_U_V_HOLDS_IN_MTS, (SubLObject)kb_mapping_utilities.$list87, (SubLObject)kb_mapping_utilities.$str88$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list89, (SubLObject)kb_mapping_utilities.$list10);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym90$PRED_U_V_HOLDS_IN_ANY_MT, (SubLObject)kb_mapping_utilities.$list79, (SubLObject)kb_mapping_utilities.$str91$Find_the_first_gaf_assertion_such, (SubLObject)kb_mapping_utilities.$list81, (SubLObject)kb_mapping_utilities.$list10);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym92$PRED_U_V_HOLDS_IN_RELEVANT_MTS, (SubLObject)kb_mapping_utilities.$list93, (SubLObject)kb_mapping_utilities.$str94$If_MT_is_NIL__behaves_like_PRED_U, (SubLObject)kb_mapping_utilities.$list81, (SubLObject)kb_mapping_utilities.$list10);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym100$PRED_VALUE_TUPLES, (SubLObject)kb_mapping_utilities.$list101, (SubLObject)kb_mapping_utilities.$str102$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list103, (SubLObject)kb_mapping_utilities.$list104);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym105$PRED_VALUE_TUPLES_IN_MT, (SubLObject)kb_mapping_utilities.$list106, (SubLObject)kb_mapping_utilities.$str107$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list108, (SubLObject)kb_mapping_utilities.$list104);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym109$PRED_VALUE_TUPLES_IN_MTS, (SubLObject)kb_mapping_utilities.$list110, (SubLObject)kb_mapping_utilities.$str111$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list112, (SubLObject)kb_mapping_utilities.$list104);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym113$PRED_VALUE_TUPLES_IN_ANY_MT, (SubLObject)kb_mapping_utilities.$list101, (SubLObject)kb_mapping_utilities.$str114$Find_all_gaf_assertions_such_that, (SubLObject)kb_mapping_utilities.$list103, (SubLObject)kb_mapping_utilities.$list104);
        utilities_macros.register_cyc_api_function((SubLObject)kb_mapping_utilities.$sym115$PRED_VALUE_TUPLES_IN_RELEVANT_MTS, (SubLObject)kb_mapping_utilities.$list116, (SubLObject)kb_mapping_utilities.$str117$If_MT_is_NIL__behaves_like_PRED_V, (SubLObject)kb_mapping_utilities.$list103, (SubLObject)kb_mapping_utilities.$list104);
        return (SubLObject)kb_mapping_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_kb_mapping_utilities_file();
    }
    
    public void initializeVariables() {
        init_kb_mapping_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_kb_mapping_utilities_file();
    }
    
    static {
        me = (SubLFile)new kb_mapping_utilities();
        kb_mapping_utilities.$use_optimized_pred_arg_values_fixed_arityP$ = null;
        $kw0$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym1$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym2$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym3$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym4$TRUTH_P = SubLObjectFactory.makeSymbol("TRUTH-P");
        $kw5$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym6$SOME_PRED_VALUE = SubLObjectFactory.makeSymbol("SOME-PRED-VALUE");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str8$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym11$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym12$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $sym13$SOME_PRED_VALUE_IN_MT = SubLObjectFactory.makeSymbol("SOME-PRED-VALUE-IN-MT");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str15$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym17$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym18$RELEVANT_MT_IS_IN_LIST = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-IN-LIST");
        $sym19$SOME_PRED_VALUE_IN_MTS = SubLObjectFactory.makeSymbol("SOME-PRED-VALUE-IN-MTS");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str21$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym23$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const24$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym25$SOME_PRED_VALUE_IN_ANY_MT = SubLObjectFactory.makeSymbol("SOME-PRED-VALUE-IN-ANY-MT");
        $str26$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $sym27$SOME_PRED_VALUE_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("SOME-PRED-VALUE-IN-RELEVANT-MTS");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str29$If_MT_is_NIL__behaves_like_SOME_P = SubLObjectFactory.makeString("If MT is NIL, behaves like SOME-PRED-VALUE.  Otherwise, behaves like SOME-PRED-VALUE-IN-MT");
        $sym30$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym31$FPRED_VALUE = SubLObjectFactory.makeSymbol("FPRED-VALUE");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)kb_mapping_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str33$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")));
        $sym36$FPRED_VALUE_IN_MT = SubLObjectFactory.makeSymbol("FPRED-VALUE-IN-MT");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)kb_mapping_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str38$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym40$FPRED_VALUE_IN_MTS = SubLObjectFactory.makeSymbol("FPRED-VALUE-IN-MTS");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)kb_mapping_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str42$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym44$FPRED_VALUE_IN_ANY_MT = SubLObjectFactory.makeSymbol("FPRED-VALUE-IN-ANY-MT");
        $str45$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
        $sym46$FPRED_VALUE_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("FPRED-VALUE-IN-RELEVANT-MTS");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)kb_mapping_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str48$If_MT_is_NIL__behaves_like_FPRED_ = SubLObjectFactory.makeString("If MT is NIL, behaves like FPRED-VALUE.  Otherwise, looks in all genlMts of MT.");
        $sym49$PRED_VALUES = SubLObjectFactory.makeSymbol("PRED-VALUES");
        $str50$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")));
        $sym52$PRED_VALUES_IN_MT = SubLObjectFactory.makeSymbol("PRED-VALUES-IN-MT");
        $str53$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $sym54$PRED_VALUES_IN_MTS = SubLObjectFactory.makeSymbol("PRED-VALUES-IN-MTS");
        $str55$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $sym56$PRED_VALUES_IN_ANY_MT = SubLObjectFactory.makeSymbol("PRED-VALUES-IN-ANY-MT");
        $str57$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $sym58$PRED_VALUES_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("PRED-VALUES-IN-RELEVANT-MTS");
        $str59$If_MT_is_NIL__behaves_like_PRED_V = SubLObjectFactory.makeString("If MT is NIL, behaves like PRED-VALUES.  Otherwise, behaves like PRED-VALUES-IN-MT");
        $sym60$PRED_REFS = SubLObjectFactory.makeSymbol("PRED-REFS");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str62$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym64$PRED_REFS_IN_MT = SubLObjectFactory.makeSymbol("PRED-REFS-IN-MT");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str66$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym68$PRED_REFS_IN_MTS = SubLObjectFactory.makeSymbol("PRED-REFS-IN-MTS");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str70$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym72$PRED_REFS_IN_ANY_MT = SubLObjectFactory.makeSymbol("PRED-REFS-IN-ANY-MT");
        $str73$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $sym74$PRED_REFS_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("PRED-REFS-IN-RELEVANT-MTS");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str76$If_MT_is_NIL__behaves_like_PRED_R = SubLObjectFactory.makeString("If MT is NIL, behaves like PRED-REFS.  Otherwise, behaves like PRED-REFS-IN-MT");
        $sym77$HL_TERM_P = SubLObjectFactory.makeSymbol("HL-TERM-P");
        $sym78$PRED_U_V_HOLDS = SubLObjectFactory.makeSymbol("PRED-U-V-HOLDS");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("U"), (SubLObject)SubLObjectFactory.makeSymbol("V"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("U-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V-ARG"), (SubLObject)kb_mapping_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str80$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("U"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("U-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym82$PRED_U_V_HOLDS_IN_MT = SubLObjectFactory.makeSymbol("PRED-U-V-HOLDS-IN-MT");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("U"), (SubLObject)SubLObjectFactory.makeSymbol("V"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("U-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V-ARG"), (SubLObject)kb_mapping_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str84$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("U"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("U-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym86$PRED_U_V_HOLDS_IN_MTS = SubLObjectFactory.makeSymbol("PRED-U-V-HOLDS-IN-MTS");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("U"), (SubLObject)SubLObjectFactory.makeSymbol("V"), (SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("U-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V-ARG"), (SubLObject)kb_mapping_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str88$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("U"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("U-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym90$PRED_U_V_HOLDS_IN_ANY_MT = SubLObjectFactory.makeSymbol("PRED-U-V-HOLDS-IN-ANY-MT");
        $str91$Find_the_first_gaf_assertion_such = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $sym92$PRED_U_V_HOLDS_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("PRED-U-V-HOLDS-IN-RELEVANT-MTS");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("U"), (SubLObject)SubLObjectFactory.makeSymbol("V"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("U-ARG"), (SubLObject)kb_mapping_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V-ARG"), (SubLObject)kb_mapping_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str94$If_MT_is_NIL__behaves_like_PRED_U = SubLObjectFactory.makeString("If MT is NIL, behaves like PRED-U-V-HOLDS.  Otherwise, behaves like PRED-U-V-HOLDS-IN-MT");
        $sym95$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $kw96$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw97$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw98$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $str99$_S_is_not_a_valid_arg_position_li = SubLObjectFactory.makeString("~S is not a valid arg-position list");
        $sym100$PRED_VALUE_TUPLES = SubLObjectFactory.makeSymbol("PRED-VALUE-TUPLES");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str102$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
        $list103 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $list104 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym105$PRED_VALUE_TUPLES_IN_MT = SubLObjectFactory.makeSymbol("PRED-VALUE-TUPLES-IN-MT");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str107$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
        $list108 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym109$PRED_VALUE_TUPLES_IN_MTS = SubLObjectFactory.makeSymbol("PRED-VALUE-TUPLES-IN-MTS");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str111$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
        $list112 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $sym113$PRED_VALUE_TUPLES_IN_ANY_MT = SubLObjectFactory.makeSymbol("PRED-VALUE-TUPLES-IN-ANY-MT");
        $str114$Find_all_gaf_assertions_such_that = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be from any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
        $sym115$PRED_VALUE_TUPLES_IN_RELEVANT_MTS = SubLObjectFactory.makeSymbol("PRED-VALUE-TUPLES-IN-RELEVANT-MTS");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str117$If_MT_is_NIL__behaves_like_PRED_V = SubLObjectFactory.makeString("If MT is NIL, behaves like PRED-VALUE-TUPLES.  Otherwise, behaves like PRED-VALUE-TUPLES-IN-MT");
        $sym118$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
    }
}

/*

	Total time: 2061 ms
	
*/