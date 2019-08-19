package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.tva_inference;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_genlpreds_lookup extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup";
    public static String myFingerPrint = "bf7e71d12730d6fde394c40fa5b4faf3b65dcac27b912d2964e9e9d3ea624b63";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 4700L)
    private static SubLSymbol $unknown_hl_variable$;
    private static SubLSymbol $POS;
    private static SubLSymbol $REMOVAL_GENLPREDS_LOOKUP_POS;
    private static SubLList $list2;
    private static SubLSymbol $NEG;
    private static SubLSymbol $GROSSLY_INCOMPLETE;
    private static SubLSymbol $INCOMPLETE;
    private static SubLSymbol $REMOVAL_GENLPREDS_LOOKUP_NEG;
    private static SubLList $list7;
    private static SubLSymbol $GAF_ARG;
    private static SubLSymbol $GAF;
    private static SubLSymbol $PREDICATE_EXTENT;
    private static SubLSymbol $OVERLAP;
    private static SubLSymbol $sym12$_UNKNOWN_HL_VARIABLE_;
    private static SubLList $list13;
    private static SubLObject $$genlPreds;
    private static SubLSymbol $DEPTH;
    private static SubLSymbol $STACK;
    private static SubLSymbol $QUEUE;
    private static SubLSymbol $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static SubLSymbol $ERROR;
    private static SubLString $str20$_A_is_not_a__A;
    private static SubLSymbol $sym21$SBHL_TRUE_TV_P;
    private static SubLSymbol $CERROR;
    private static SubLString $str23$continue_anyway;
    private static SubLSymbol $WARN;
    private static SubLString $str25$_A_is_not_a_valid__sbhl_type_erro;
    private static SubLString $str26$_A_is_neither_SET_P_nor_LISTP_;
    private static SubLString $str27$attempting_to_bind_direction_link;
    private static SubLString $str28$Node__a_does_not_pass_sbhl_type_t;
    private static SubLSymbol $REMOVAL_GENLPREDS_PRED_INDEX_POS;
    private static SubLList $list30;
    private static SubLSymbol $REMOVAL_GENLPREDS_PRED_INDEX_NEG;
    private static SubLList $list32;
    private static SubLSymbol $REMOVAL_GENLINVERSE_LOOKUP_POS;
    private static SubLList $list34;
    private static SubLSymbol $REMOVAL_GENLINVERSE_LOOKUP_NEG;
    private static SubLList $list36;
    private static SubLSymbol $REMOVAL_GENLINVERSE_PRED_INDEX_POS;
    private static SubLList $list38;
    private static SubLSymbol $REMOVAL_GENLINVERSE_PRED_INDEX_NEG;
    private static SubLList $list40;
    private static SubLSymbol $sym41$INFERENCE_NEGATION_PREDICATE_;
    private static SubLSymbol $TRUE;
    private static SubLSymbol $REMOVAL_NEGATIONPREDS_LOOKUP;
    private static SubLList $list44;
    private static SubLObject $$negationPreds;
    private static SubLSymbol $NEGATIONPREDS;
    private static SubLSymbol $sym47$INFERENCE_NEGATION_INVERSE_;
    private static SubLSymbol $REMOVAL_NEGATIONINVERSE_LOOKUP;
    private static SubLList $list49;
    private static SubLObject $$negationInverse;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 800L)
    public static SubLObject removal_genlpreds_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        return num_best_genlpreds_gaf_lookup_index(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 1600L)
    public static SubLObject removal_genlpreds_lookup_pos_iterator(SubLObject asent) {
        return removal_genlpreds_lookup_iterator(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 2700L)
    public static SubLObject removal_genlpreds_lookup_neg_completeness(SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 2900L)
    public static SubLObject removal_genlpreds_lookup_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return num_best_genlpreds_gaf_lookup_index(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 3100L)
    public static SubLObject removal_genlpreds_lookup_neg_iterator(SubLObject asent) {
        return removal_genlpreds_lookup_iterator(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 4200L)
    public static SubLObject removal_genlpreds_lookup_iterator(SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject obfuscated_asent = obfuscate_predicate(asent);
        SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = control_vars.$inference_literal$.currentBinding(thread);
        SubLObject _prev_bind_3 = control_vars.$inference_sense$.currentBinding(thread);
        try {
            pred_relevance_macros.$relevant_pred_function$.bind(pred_relevance_macros.determine_inference_genl_or_spec_pred_relevance(sense), thread);
            control_vars.$inference_literal$.bind(asent, thread);
            control_vars.$inference_sense$.bind(sense, thread);
            SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, enumeration_types.sense_truth(sense), NIL);
            SubLObject pcase_var;
            SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                SubLObject argnum = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$1 = NIL;
                                        SubLObject token_var_$2 = NIL;
                                        while (NIL == done_var_$1) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                            SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(gaf));
                                            if (NIL != valid_$3) {
                                                SubLObject var;
                                                SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(gaf);
                                                if (NIL != var) {
                                                    result = cons(var, result);
                                                }
                                            }
                                            done_var_$1 = makeBoolean(NIL == valid_$3);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$2 = NIL;
                                        SubLObject token_var_$3 = NIL;
                                        while (NIL == done_var_$2) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                            SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(gaf));
                                            if (NIL != valid_$4) {
                                                SubLObject var;
                                                SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(gaf);
                                                if (NIL != var) {
                                                    result = cons(var, result);
                                                }
                                            }
                                            done_var_$2 = makeBoolean(NIL == valid_$4);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values2 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    }
                } else if (NIL != predicate) {
                    SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$3 = NIL;
                                    SubLObject token_var_$4 = NIL;
                                    while (NIL == done_var_$3) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(gaf));
                                        if (NIL != valid_$5) {
                                            SubLObject var;
                                            SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(gaf);
                                            if (NIL != var) {
                                                result = cons(var, result);
                                            }
                                        }
                                        done_var_$3 = makeBoolean(NIL == valid_$5);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values3 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                } else {
                    SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$4 = NIL;
                                    SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(gaf));
                                        if (NIL != valid_$6) {
                                            SubLObject var;
                                            SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(gaf);
                                            if (NIL != var) {
                                                result = cons(var, result);
                                            }
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values4 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                }
            } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    SubLObject str = NIL;
                    SubLObject _prev_bind_0_$8 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    SubLObject _prev_bind_1_$18 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    SubLObject _prev_bind_2_$19 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind(T, thread);
                        utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                        utilities_macros.noting_progress_preamble(str);
                        SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$5 = NIL;
                                    SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                        SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(gaf2));
                                        if (NIL != valid_$7) {
                                            SubLObject var2;
                                            SubLObject bindings_assertion2 = var2 = removal_genlpreds_gaf_iterator_internal(gaf2);
                                            if (NIL != var2) {
                                                result = cons(var2, result);
                                            }
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values5 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    } finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$19, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$18, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            } else if (pcase_var.eql($OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                SubLObject gaf3 = NIL;
                gaf3 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == enumeration_types.sense_truth(sense) || NIL != assertions_high.assertion_has_truth(gaf3, enumeration_types.sense_truth(sense))) {
                        SubLObject var3;
                        SubLObject bindings_assertion3 = var3 = removal_genlpreds_gaf_iterator_internal(gaf3);
                        if (NIL != var3) {
                            result = cons(var3, result);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf3 = cdolist_list_var.first();
                }
            } else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        } finally {
            control_vars.$inference_sense$.rebind(_prev_bind_3, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_2, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 4800L)
    public static SubLObject obfuscate_predicate(SubLObject asent) {
        return el_utilities.replace_formula_arg(ZERO_INTEGER, $unknown_hl_variable$.getGlobalValue(), asent);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5000L)
    public static SubLObject best_genlpreds_gaf_lookup_index(SubLObject asent, SubLObject sense) {
        return kb_indexing.best_gaf_lookup_index(obfuscate_predicate(asent), enumeration_types.sense_truth(sense), $list13);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5200L)
    public static SubLObject num_best_genlpreds_gaf_lookup_index(SubLObject asent, SubLObject sense) {
        return num_best_genlpreds_or_inverse_gaf_lookup_index(asent, sense, NIL);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5400L)
    public static SubLObject num_best_genlpreds_or_inverse_gaf_lookup_index(SubLObject asent, SubLObject sense, SubLObject inverse_modeP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject direction = (sense == $POS) ? sbhl_search_vars.get_sbhl_backward_search_direction() : sbhl_search_vars.get_sbhl_forward_search_direction();
        SubLObject pred = cycl_utilities.sentence_arg0(asent);
        SubLObject binary_predicate_modeP = kb_accessors.binary_predicateP(cycl_utilities.sentence_arg0(asent));
        SubLObject gaf_argnum = tva_inference.determine_term_argnums(asent).first();
        SubLObject v_term = cycl_utilities.sentence_arg(asent, gaf_argnum, UNPROVIDED);
        SubLObject num = ZERO_INTEGER;
        SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
        SubLObject node_var = pred;
        SubLObject deck_type = $QUEUE;
        SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject tv_var = NIL;
                SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str23$continue_anyway, $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else if (pcase_var.eql($WARN)) {
                            Errors.warn($str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P);
                        } else {
                            Errors.warn($str25$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str23$continue_anyway, $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P);
                        }
                    }
                    SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1_$26 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                            SubLObject _prev_bind_0_$26 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            SubLObject _prev_bind_1_$27 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            SubLObject _prev_bind_2_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(direction, thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(direction, module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    SubLObject node_var_$30 = node_and_predicate_mode.first();
                                    SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    SubLObject spec_pred = node_var_$30;
                                    SubLObject _prev_bind_0_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        SubLObject inverseP = predicate_mode;
                                        if (!pred.eql(spec_pred) && inverse_modeP.eql(inverseP)) {
                                            SubLObject spec_asent = el_utilities.replace_formula_arg(ZERO_INTEGER, spec_pred, asent);
                                            num = Numbers.add(num, kb_indexing.num_best_gaf_lookup_index(spec_asent, enumeration_types.sense_truth(sense), UNPROVIDED));
                                        }
                                        SubLObject cdolist_list_var;
                                        SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            SubLObject _prev_bind_0_$28 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                        (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                SubLObject node = function_terms.naut_to_nart(node_var_$30);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                    iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$35;
                                                                        for (iteration_state_$35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                iteration_state_$35); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next(iteration_state_$35)) {
                                                                            thread.resetMultipleValues();
                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$35);
                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object,
                                                                                                set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (NIL != csome_list_var) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                deck.deck_push(ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    } else {
                                                                                        Errors.error($str26$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$30, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$35);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$29, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str27$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$37;
                                                    SubLObject new_list = cdolist_list_var_$37 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                            ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$37.first();
                                                    while (NIL != cdolist_list_var_$37) {
                                                        SubLObject _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            SubLObject sol2;
                                                            SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (NIL != set.set_p(sol2)) {
                                                                SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2,
                                                                        set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                        deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                }
                                                            } else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                        deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            } else {
                                                                Errors.error($str26$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$31, thread);
                                                        }
                                                        cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                                        generating_fn = cdolist_list_var_$37.first();
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$28, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$28, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$27, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$29, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$27, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$26, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str28$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$26, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$25, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$24, thread);
                }
            } finally {
                SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return num;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 6200L)
    public static SubLObject removal_genlpreds_gaf_iterator_internal(SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            SubLObject assertion_asent = assertions_high.gaf_formula(assertion);
            SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertion_asent);
            SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(control_vars.$inference_literal$.getDynamicValue(thread));
            if (!ass_pred.eql(inf_pred)) {
                thread.resetMultipleValues();
                SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(control_vars.$inference_literal$.getDynamicValue(thread), assertion_asent, UNPROVIDED, UNPROVIDED);
                SubLObject gaf_asent = thread.secondMultipleValue();
                SubLObject unify_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return list(v_bindings, assertion);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 6800L)
    public static SubLObject removal_genlpreds_lookup_supports(SubLObject asent, SubLObject assertion, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertions_high.gaf_formula(assertion));
        SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject spec_pred = ($POS == sense) ? ass_pred : inf_pred;
        SubLObject genl_pred = ($POS == sense) ? inf_pred : ass_pred;
        SubLObject hl_support = removal_module_utilities.make_genl_preds_support(spec_pred, genl_pred);
        thread.resetMultipleValues();
        SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(asent, assertions_high.gaf_formula(assertion), T, T);
        SubLObject gaf_asent = thread.secondMultipleValue();
        SubLObject unify_justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return append(list(assertion, hl_support), unify_justification);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 7400L)
    public static SubLObject removal_genlpreds_pred_index_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        return num_best_genlpreds_gaf_lookup_index(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 8200L)
    public static SubLObject removal_genlpreds_pred_index_pos_iterator(SubLObject asent) {
        return removal_genlpreds_pred_index_iterator(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 9300L)
    public static SubLObject removal_genlpreds_pred_index_neg_completeness(SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 9500L)
    public static SubLObject removal_genlpreds_pred_index_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject genl_preds = inference_trampolines.inference_all_genl_predicates(predicate);
        SubLObject cost = ZERO_INTEGER;
        SubLObject cdolist_list_var = genl_preds;
        SubLObject genl_pred = NIL;
        genl_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cost = Numbers.add(cost, kb_indexing.num_predicate_extent_index(genl_pred, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            genl_pred = cdolist_list_var.first();
        }
        return cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 9900L)
    public static SubLObject removal_genlpreds_pred_index_neg_iterator(SubLObject asent) {
        return removal_genlpreds_pred_index_iterator(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 11100L)
    public static SubLObject removal_genlpreds_pred_index_iterator(SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding(thread);
        try {
            control_vars.$inference_literal$.bind(asent, thread);
            SubLObject index_predicates = NIL;
            if ($POS == sense) {
                index_predicates = inference_trampolines.inference_all_spec_predicates(predicate);
            } else {
                index_predicates = inference_trampolines.inference_all_genl_predicates(predicate);
            }
            SubLObject cdolist_list_var = index_predicates;
            SubLObject index_predicate = NIL;
            index_predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!index_predicate.eql(predicate)) {
                    SubLObject index_asent = el_utilities.replace_formula_arg(ZERO_INTEGER, index_predicate, asent);
                    SubLObject l_index = kb_indexing.best_gaf_lookup_index(index_asent, enumeration_types.sense_truth(sense), NIL);
                    SubLObject pcase_var;
                    SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                    if (pcase_var.eql($GAF_ARG)) {
                        thread.resetMultipleValues();
                        SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                        SubLObject argnum = thread.secondMultipleValue();
                        SubLObject predicate_$40 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != argnum) {
                            if (NIL != predicate_$40) {
                                SubLObject pred_var = predicate_$40;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                SubLObject done_var_$41 = NIL;
                                                SubLObject token_var_$42 = NIL;
                                                while (NIL == done_var_$41) {
                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                                                    SubLObject valid_$43 = makeBoolean(!token_var_$42.eql(assertion));
                                                    if (NIL != valid_$43) {
                                                        SubLObject var;
                                                        SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(assertion);
                                                        if (NIL != var) {
                                                            result = cons(var, result);
                                                        }
                                                    }
                                                    done_var_$41 = makeBoolean(NIL == valid_$43);
                                                }
                                            } finally {
                                                SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                    SubLObject _values = Values.getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values);
                                                } finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                }
                            } else {
                                SubLObject pred_var = NIL;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                                SubLObject done_var_$42 = NIL;
                                                SubLObject token_var_$43 = NIL;
                                                while (NIL == done_var_$42) {
                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                                    SubLObject valid_$44 = makeBoolean(!token_var_$43.eql(assertion));
                                                    if (NIL != valid_$44) {
                                                        SubLObject var;
                                                        SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(assertion);
                                                        if (NIL != var) {
                                                            result = cons(var, result);
                                                        }
                                                    }
                                                    done_var_$42 = makeBoolean(NIL == valid_$44);
                                                }
                                            } finally {
                                                SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                    SubLObject _values2 = Values.getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values2);
                                                } finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                }
                            }
                        } else if (NIL != predicate_$40) {
                            SubLObject pred_var = predicate_$40;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$43 = NIL;
                                            SubLObject token_var_$44 = NIL;
                                            while (NIL == done_var_$43) {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                                                SubLObject valid_$45 = makeBoolean(!token_var_$44.eql(assertion));
                                                if (NIL != valid_$45) {
                                                    SubLObject var;
                                                    SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(assertion);
                                                    if (NIL != var) {
                                                        result = cons(var, result);
                                                    }
                                                }
                                                done_var_$43 = makeBoolean(NIL == valid_$45);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values3 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values3);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            }
                        } else {
                            SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$44 = NIL;
                                            SubLObject token_var_$45 = NIL;
                                            while (NIL == done_var_$44) {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$45);
                                                SubLObject valid_$46 = makeBoolean(!token_var_$45.eql(assertion));
                                                if (NIL != valid_$46) {
                                                    SubLObject var;
                                                    SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal(assertion);
                                                    if (NIL != var) {
                                                        result = cons(var, result);
                                                    }
                                                }
                                                done_var_$44 = makeBoolean(NIL == valid_$46);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values4 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values4);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            }
                        }
                    } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                        SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                            SubLObject str = NIL;
                            SubLObject _prev_bind_0_$48 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                            SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                            SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                            SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                            SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$is_noting_progressP$.bind(T, thread);
                                utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                                utilities_macros.noting_progress_preamble(str);
                                SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                                SubLObject done_var2 = NIL;
                                SubLObject token_var2 = NIL;
                                while (NIL == done_var2) {
                                    SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (NIL != valid2) {
                                        utilities_macros.note_progress();
                                        SubLObject final_index_iterator2 = NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$45 = NIL;
                                            SubLObject token_var_$46 = NIL;
                                            while (NIL == done_var_$45) {
                                                SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$46);
                                                SubLObject valid_$47 = makeBoolean(!token_var_$46.eql(assertion2));
                                                if (NIL != valid_$47) {
                                                    SubLObject var2;
                                                    SubLObject bindings_assertion2 = var2 = removal_genlpreds_gaf_iterator_internal(assertion2);
                                                    if (NIL != var2) {
                                                        result = cons(var2, result);
                                                    }
                                                }
                                                done_var_$45 = makeBoolean(NIL == valid_$47);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values5 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                Values.restoreValuesFromVector(_values5);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                            }
                                        }
                                    }
                                    done_var2 = makeBoolean(NIL == valid2);
                                }
                                utilities_macros.noting_progress_postamble();
                            } finally {
                                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$48, thread);
                            }
                        }
                    } else if (pcase_var.eql($OVERLAP)) {
                        SubLObject cdolist_list_var_$62 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                        SubLObject assertion3 = NIL;
                        assertion3 = cdolist_list_var_$62.first();
                        while (NIL != cdolist_list_var_$62) {
                            if (NIL == enumeration_types.sense_truth(sense) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense))) {
                                SubLObject var3;
                                SubLObject bindings_assertion3 = var3 = removal_genlpreds_gaf_iterator_internal(assertion3);
                                if (NIL != var3) {
                                    result = cons(var3, result);
                                }
                            }
                            cdolist_list_var_$62 = cdolist_list_var_$62.rest();
                            assertion3 = cdolist_list_var_$62.first();
                        }
                    } else {
                        kb_mapping_macros.do_gli_method_error(l_index, method);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                index_predicate = cdolist_list_var.first();
            }
        } finally {
            control_vars.$inference_literal$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 11900L)
    public static SubLObject removal_genlinverse_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        return num_best_genlinverse_gaf_lookup_index(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 12700L)
    public static SubLObject removal_genlinverse_lookup_pos_iterator(SubLObject asent) {
        return removal_genlinverse_lookup_iterator(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 13900L)
    public static SubLObject removal_genlinverse_lookup_neg_completeness(SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 14000L)
    public static SubLObject removal_genlinverse_lookup_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return num_best_genlinverse_gaf_lookup_index(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 14200L)
    public static SubLObject removal_genlinverse_lookup_neg_iterator(SubLObject asent) {
        return removal_genlinverse_lookup_iterator(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 15400L)
    public static SubLObject removal_genlinverse_lookup_iterator(SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject obfuscated_asent = obfuscate_predicate(removal_modules_symmetry.symmetric_asent(asent));
        SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = control_vars.$inference_literal$.currentBinding(thread);
        SubLObject _prev_bind_3 = control_vars.$inference_sense$.currentBinding(thread);
        try {
            pred_relevance_macros.$relevant_pred_function$.bind(pred_relevance_macros.determine_inference_genl_or_spec_inverse_relevance(sense), thread);
            control_vars.$inference_literal$.bind(asent, thread);
            control_vars.$inference_sense$.bind(sense, thread);
            SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, enumeration_types.sense_truth(sense), NIL);
            SubLObject pcase_var;
            SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                SubLObject argnum = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$63 = NIL;
                                        SubLObject token_var_$64 = NIL;
                                        while (NIL == done_var_$63) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$64);
                                            SubLObject valid_$65 = makeBoolean(!token_var_$64.eql(gaf));
                                            if (NIL != valid_$65) {
                                                SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal(asent, gaf);
                                                if (NIL != bindings_assertion) {
                                                    result = cons(bindings_assertion, result);
                                                }
                                            }
                                            done_var_$63 = makeBoolean(NIL == valid_$65);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$64 = NIL;
                                        SubLObject token_var_$65 = NIL;
                                        while (NIL == done_var_$64) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$65);
                                            SubLObject valid_$66 = makeBoolean(!token_var_$65.eql(gaf));
                                            if (NIL != valid_$66) {
                                                SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal(asent, gaf);
                                                if (NIL != bindings_assertion) {
                                                    result = cons(bindings_assertion, result);
                                                }
                                            }
                                            done_var_$64 = makeBoolean(NIL == valid_$66);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values2 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    }
                } else if (NIL != predicate) {
                    SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$65 = NIL;
                                    SubLObject token_var_$66 = NIL;
                                    while (NIL == done_var_$65) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                        SubLObject valid_$67 = makeBoolean(!token_var_$66.eql(gaf));
                                        if (NIL != valid_$67) {
                                            SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal(asent, gaf);
                                            if (NIL != bindings_assertion) {
                                                result = cons(bindings_assertion, result);
                                            }
                                        }
                                        done_var_$65 = makeBoolean(NIL == valid_$67);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values3 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                } else {
                    SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$66 = NIL;
                                    SubLObject token_var_$67 = NIL;
                                    while (NIL == done_var_$66) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$67);
                                        SubLObject valid_$68 = makeBoolean(!token_var_$67.eql(gaf));
                                        if (NIL != valid_$68) {
                                            SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal(asent, gaf);
                                            if (NIL != bindings_assertion) {
                                                result = cons(bindings_assertion, result);
                                            }
                                        }
                                        done_var_$66 = makeBoolean(NIL == valid_$68);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values4 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                }
            } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    SubLObject str = NIL;
                    SubLObject _prev_bind_0_$70 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    SubLObject _prev_bind_1_$80 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    SubLObject _prev_bind_2_$81 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind(T, thread);
                        utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                        utilities_macros.noting_progress_preamble(str);
                        SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$67 = NIL;
                                    SubLObject token_var_$68 = NIL;
                                    while (NIL == done_var_$67) {
                                        SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$68);
                                        SubLObject valid_$69 = makeBoolean(!token_var_$68.eql(gaf2));
                                        if (NIL != valid_$69) {
                                            SubLObject bindings_assertion2 = removal_genlinverse_gaf_iterator_internal(asent, gaf2);
                                            if (NIL != bindings_assertion2) {
                                                result = cons(bindings_assertion2, result);
                                            }
                                        }
                                        done_var_$67 = makeBoolean(NIL == valid_$69);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values5 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    } finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$81, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$80, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$70, thread);
                    }
                }
            } else if (pcase_var.eql($OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                SubLObject gaf3 = NIL;
                gaf3 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == enumeration_types.sense_truth(sense) || NIL != assertions_high.assertion_has_truth(gaf3, enumeration_types.sense_truth(sense))) {
                        SubLObject bindings_assertion3 = removal_genlinverse_gaf_iterator_internal(asent, gaf3);
                        if (NIL != bindings_assertion3) {
                            result = cons(bindings_assertion3, result);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf3 = cdolist_list_var.first();
                }
            } else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        } finally {
            control_vars.$inference_sense$.rebind(_prev_bind_3, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_2, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 16000L)
    public static SubLObject best_genlinverse_gaf_lookup_index(SubLObject asent, SubLObject sense) {
        return kb_indexing.best_gaf_lookup_index(obfuscate_predicate(removal_modules_symmetry.symmetric_asent(asent)), enumeration_types.sense_truth(sense), $list13);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 16200L)
    public static SubLObject num_best_genlinverse_gaf_lookup_index(SubLObject asent, SubLObject sense) {
        return num_best_genlpreds_or_inverse_gaf_lookup_index(asent, sense, T);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 16300L)
    public static SubLObject removal_genlinverse_gaf_iterator_internal(SubLObject asent, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            SubLObject assertion_asent = assertions_high.gaf_formula(assertion);
            SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertion_asent);
            SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(asent);
            if (!ass_pred.eql(inf_pred)) {
                SubLObject symmetric_asent = removal_modules_symmetry.symmetric_asent(asent);
                thread.resetMultipleValues();
                SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(symmetric_asent, assertion_asent, T, T);
                SubLObject gaf_asent = thread.secondMultipleValue();
                SubLObject unify_justification = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != v_bindings) {
                    return list(v_bindings, assertion);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 17000L)
    public static SubLObject removal_genlinverse_lookup_supports(SubLObject asent, SubLObject assertion, SubLObject sense) {
        SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertions_high.gaf_formula(assertion));
        SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject spec_pred = ($POS == sense) ? ass_pred : inf_pred;
        SubLObject genl_pred = ($POS == sense) ? inf_pred : ass_pred;
        SubLObject hl_support = removal_module_utilities.make_genl_inverse_support(spec_pred, genl_pred);
        return list(assertion, hl_support);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 17400L)
    public static SubLObject removal_genlinverse_pred_index_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        return num_best_genlinverse_gaf_lookup_index(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 18100L)
    public static SubLObject removal_genlinverse_pred_index_pos_iterator(SubLObject asent) {
        return removal_genlinverse_pred_index_iterator(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 19300L)
    public static SubLObject removal_genlinverse_pred_index_neg_completeness(SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 19400L)
    public static SubLObject removal_genlinverse_pred_index_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject genl_preds = inference_trampolines.inference_all_genl_inverses(predicate);
        SubLObject cost = ZERO_INTEGER;
        SubLObject cdolist_list_var = genl_preds;
        SubLObject genl_pred = NIL;
        genl_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cost = Numbers.add(cost, kb_indexing.num_predicate_extent_index(genl_pred, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            genl_pred = cdolist_list_var.first();
        }
        return cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 19900L)
    public static SubLObject removal_genlinverse_pred_index_neg_iterator(SubLObject asent) {
        return removal_genlinverse_pred_index_iterator(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 21100L)
    public static SubLObject removal_genlinverse_pred_index_iterator(SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject index_predicates = NIL;
        if ($POS == sense) {
            index_predicates = inference_trampolines.inference_all_spec_inverses(predicate);
        } else {
            index_predicates = inference_trampolines.inference_all_genl_inverses(predicate);
        }
        SubLObject cdolist_list_var = index_predicates;
        SubLObject index_predicate = NIL;
        index_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!index_predicate.eql(predicate)) {
                SubLObject index_asent = el_utilities.replace_formula_arg(ZERO_INTEGER, index_predicate, asent);
                SubLObject l_index = kb_indexing.best_gaf_lookup_index(index_asent, enumeration_types.sense_truth(sense), NIL);
                SubLObject pcase_var;
                SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                if (pcase_var.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                    SubLObject argnum = thread.secondMultipleValue();
                    SubLObject predicate_$86 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != argnum) {
                        if (NIL != predicate_$86) {
                            SubLObject pred_var = predicate_$86;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$87 = NIL;
                                            SubLObject token_var_$88 = NIL;
                                            while (NIL == done_var_$87) {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$88);
                                                SubLObject valid_$89 = makeBoolean(!token_var_$88.eql(assertion));
                                                if (NIL != valid_$89) {
                                                    SubLObject var;
                                                    SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal(asent, assertion);
                                                    if (NIL != var) {
                                                        result = cons(var, result);
                                                    }
                                                }
                                                done_var_$87 = makeBoolean(NIL == valid_$89);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            }
                        } else {
                            SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$88 = NIL;
                                            SubLObject token_var_$89 = NIL;
                                            while (NIL == done_var_$88) {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$89);
                                                SubLObject valid_$90 = makeBoolean(!token_var_$89.eql(assertion));
                                                if (NIL != valid_$90) {
                                                    SubLObject var;
                                                    SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal(asent, assertion);
                                                    if (NIL != var) {
                                                        result = cons(var, result);
                                                    }
                                                }
                                                done_var_$88 = makeBoolean(NIL == valid_$90);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values2 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            }
                        }
                    } else if (NIL != predicate_$86) {
                        SubLObject pred_var = predicate_$86;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$89 = NIL;
                                        SubLObject token_var_$90 = NIL;
                                        while (NIL == done_var_$89) {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$90);
                                            SubLObject valid_$91 = makeBoolean(!token_var_$90.eql(assertion));
                                            if (NIL != valid_$91) {
                                                SubLObject var;
                                                SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal(asent, assertion);
                                                if (NIL != var) {
                                                    result = cons(var, result);
                                                }
                                            }
                                            done_var_$89 = makeBoolean(NIL == valid_$91);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values3 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values3);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$90 = NIL;
                                        SubLObject token_var_$91 = NIL;
                                        while (NIL == done_var_$90) {
                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$91);
                                            SubLObject valid_$92 = makeBoolean(!token_var_$91.eql(assertion));
                                            if (NIL != valid_$92) {
                                                SubLObject var;
                                                SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal(asent, assertion);
                                                if (NIL != var) {
                                                    result = cons(var, result);
                                                }
                                            }
                                            done_var_$90 = makeBoolean(NIL == valid_$92);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values4 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values4);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    }
                } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                    SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                        SubLObject str = NIL;
                        SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                        SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind(T, thread);
                            utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                            utilities_macros.noting_progress_preamble(str);
                            SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                            SubLObject done_var2 = NIL;
                            SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$91 = NIL;
                                        SubLObject token_var_$92 = NIL;
                                        while (NIL == done_var_$91) {
                                            SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$92);
                                            SubLObject valid_$93 = makeBoolean(!token_var_$92.eql(assertion2));
                                            if (NIL != valid_$93) {
                                                SubLObject var2;
                                                SubLObject bindings_assertion2 = var2 = removal_genlinverse_gaf_iterator_internal(asent, assertion2);
                                                if (NIL != var2) {
                                                    result = cons(var2, result);
                                                }
                                            }
                                            done_var_$91 = makeBoolean(NIL == valid_$93);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$102 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values5 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values5);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$102, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            }
                            utilities_macros.noting_progress_postamble();
                        } finally {
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
                } else if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var_$103 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject assertion3 = NIL;
                    assertion3 = cdolist_list_var_$103.first();
                    while (NIL != cdolist_list_var_$103) {
                        if (NIL == enumeration_types.sense_truth(sense) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense))) {
                            SubLObject var3;
                            SubLObject bindings_assertion3 = var3 = removal_genlinverse_gaf_iterator_internal(asent, assertion3);
                            if (NIL != var3) {
                                result = cons(var3, result);
                            }
                        }
                        cdolist_list_var_$103 = cdolist_list_var_$103.rest();
                        assertion3 = cdolist_list_var_$103.first();
                    }
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            index_predicate = cdolist_list_var.first();
        }
        if (NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 21900L)
    public static SubLObject removal_negationpreds_lookup_completeness(SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 22300L)
    public static SubLObject removal_negationpreds_lookup_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(asent)) {
            return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
        }
        return Numbers.multiply(TWO_INTEGER, removal_genlpreds_lookup_neg_cost(asent, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 22500L)
    public static SubLObject removal_negationpreds_lookup_iterator(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject obfuscated_asent = obfuscate_predicate(asent);
        SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding(thread);
        SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        try {
            control_vars.$inference_literal$.bind(asent, thread);
            pred_relevance_macros.$relevant_pred_function$.bind($sym41$INFERENCE_NEGATION_PREDICATE_, thread);
            SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, $TRUE, NIL);
            SubLObject pcase_var;
            SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                SubLObject argnum = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$104 = NIL;
                                        SubLObject token_var_$105 = NIL;
                                        while (NIL == done_var_$104) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$105);
                                            SubLObject valid_$106 = makeBoolean(!token_var_$105.eql(gaf));
                                            if (NIL != valid_$106) {
                                                SubLObject var;
                                                SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal(gaf);
                                                if (NIL != var) {
                                                    result = cons(var, result);
                                                }
                                            }
                                            done_var_$104 = makeBoolean(NIL == valid_$106);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$105 = NIL;
                                        SubLObject token_var_$106 = NIL;
                                        while (NIL == done_var_$105) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$106);
                                            SubLObject valid_$107 = makeBoolean(!token_var_$106.eql(gaf));
                                            if (NIL != valid_$107) {
                                                SubLObject var;
                                                SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal(gaf);
                                                if (NIL != var) {
                                                    result = cons(var, result);
                                                }
                                            }
                                            done_var_$105 = makeBoolean(NIL == valid_$107);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$108 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values2 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$108, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    }
                } else if (NIL != predicate) {
                    SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$106 = NIL;
                                    SubLObject token_var_$107 = NIL;
                                    while (NIL == done_var_$106) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$107);
                                        SubLObject valid_$108 = makeBoolean(!token_var_$107.eql(gaf));
                                        if (NIL != valid_$108) {
                                            SubLObject var;
                                            SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal(gaf);
                                            if (NIL != var) {
                                                result = cons(var, result);
                                            }
                                        }
                                        done_var_$106 = makeBoolean(NIL == valid_$108);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$109 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values3 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                } else {
                    SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$107 = NIL;
                                    SubLObject token_var_$108 = NIL;
                                    while (NIL == done_var_$107) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$108);
                                        SubLObject valid_$109 = makeBoolean(!token_var_$108.eql(gaf));
                                        if (NIL != valid_$109) {
                                            SubLObject var;
                                            SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal(gaf);
                                            if (NIL != var) {
                                                result = cons(var, result);
                                            }
                                        }
                                        done_var_$107 = makeBoolean(NIL == valid_$109);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values4 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$110, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                }
            } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    SubLObject str = NIL;
                    SubLObject _prev_bind_0_$111 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    SubLObject _prev_bind_1_$121 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind(T, thread);
                        utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                        utilities_macros.noting_progress_preamble(str);
                        SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$108 = NIL;
                                    SubLObject token_var_$109 = NIL;
                                    while (NIL == done_var_$108) {
                                        SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$109);
                                        SubLObject valid_$110 = makeBoolean(!token_var_$109.eql(gaf2));
                                        if (NIL != valid_$110) {
                                            SubLObject var2;
                                            SubLObject bindings_assertion2 = var2 = removal_negationpreds_gaf_iterator_internal(gaf2);
                                            if (NIL != var2) {
                                                result = cons(var2, result);
                                            }
                                        }
                                        done_var_$108 = makeBoolean(NIL == valid_$110);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values5 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    } finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$121, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$111, thread);
                    }
                }
            } else if (pcase_var.eql($OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                SubLObject gaf3 = NIL;
                gaf3 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != assertions_high.assertion_has_truth(gaf3, $TRUE)) {
                        SubLObject var3;
                        SubLObject bindings_assertion3 = var3 = removal_negationpreds_gaf_iterator_internal(gaf3);
                        if (NIL != var3) {
                            result = cons(var3, result);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf3 = cdolist_list_var.first();
                }
            } else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        } finally {
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 24000L)
    public static SubLObject removal_negationpreds_gaf_iterator_internal(SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            SubLObject assertion_asent = assertions_high.gaf_formula(assertion);
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(control_vars.$inference_literal$.getDynamicValue(thread), assertion_asent, T, T);
            SubLObject gaf_asent = thread.secondMultipleValue();
            SubLObject unify_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                return list(v_bindings, assertion);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 24500L)
    public static SubLObject removal_negationpreds_lookup_supports(SubLObject asent, SubLObject assertion) {
        SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertion);
        SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject hl_formula = backward_utilities.inference_make_commutative_asent($$negationPreds, list(inf_pred, ass_pred));
        SubLObject hl_support = arguments.make_hl_support($NEGATIONPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
        return list(assertion, hl_support);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 24900L)
    public static SubLObject removal_negationinverse_lookup_iterator(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject obfuscated_asent = obfuscate_predicate(removal_modules_symmetry.symmetric_asent(asent));
        SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding(thread);
        SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        try {
            control_vars.$inference_literal$.bind(asent, thread);
            pred_relevance_macros.$relevant_pred_function$.bind($sym47$INFERENCE_NEGATION_INVERSE_, thread);
            SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_asent, $TRUE, NIL);
            SubLObject pcase_var;
            SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
            if (pcase_var.eql($GAF_ARG)) {
                thread.resetMultipleValues();
                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                SubLObject argnum = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != predicate) {
                        SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$126 = NIL;
                                        SubLObject token_var_$127 = NIL;
                                        while (NIL == done_var_$126) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$127);
                                            SubLObject valid_$128 = makeBoolean(!token_var_$127.eql(gaf));
                                            if (NIL != valid_$128) {
                                                SubLObject var;
                                                SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal(gaf);
                                                if (NIL != var) {
                                                    result = cons(var, result);
                                                }
                                            }
                                            done_var_$126 = makeBoolean(NIL == valid_$128);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    } else {
                        SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$127 = NIL;
                                        SubLObject token_var_$128 = NIL;
                                        while (NIL == done_var_$127) {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$128);
                                            SubLObject valid_$129 = makeBoolean(!token_var_$128.eql(gaf));
                                            if (NIL != valid_$129) {
                                                SubLObject var;
                                                SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal(gaf);
                                                if (NIL != var) {
                                                    result = cons(var, result);
                                                }
                                            }
                                            done_var_$127 = makeBoolean(NIL == valid_$129);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$130 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values2 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$130, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        }
                    }
                } else if (NIL != predicate) {
                    SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$128 = NIL;
                                    SubLObject token_var_$129 = NIL;
                                    while (NIL == done_var_$128) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$129);
                                        SubLObject valid_$130 = makeBoolean(!token_var_$129.eql(gaf));
                                        if (NIL != valid_$130) {
                                            SubLObject var;
                                            SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal(gaf);
                                            if (NIL != var) {
                                                result = cons(var, result);
                                            }
                                        }
                                        done_var_$128 = makeBoolean(NIL == valid_$130);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values3 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                } else {
                    SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$129 = NIL;
                                    SubLObject token_var_$130 = NIL;
                                    while (NIL == done_var_$129) {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$130);
                                        SubLObject valid_$131 = makeBoolean(!token_var_$130.eql(gaf));
                                        if (NIL != valid_$131) {
                                            SubLObject var;
                                            SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal(gaf);
                                            if (NIL != var) {
                                                result = cons(var, result);
                                            }
                                        }
                                        done_var_$129 = makeBoolean(NIL == valid_$131);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$132 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values4 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$132, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    }
                }
            } else if (pcase_var.eql($PREDICATE_EXTENT)) {
                SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    SubLObject str = NIL;
                    SubLObject _prev_bind_0_$133 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    SubLObject _prev_bind_1_$143 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind(T, thread);
                        utilities_macros.$silent_progressP$.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                        utilities_macros.noting_progress_preamble(str);
                        SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$130 = NIL;
                                    SubLObject token_var_$131 = NIL;
                                    while (NIL == done_var_$130) {
                                        SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$131);
                                        SubLObject valid_$132 = makeBoolean(!token_var_$131.eql(gaf2));
                                        if (NIL != valid_$132) {
                                            SubLObject var2;
                                            SubLObject bindings_assertion2 = var2 = removal_negationinverse_gaf_iterator_internal(gaf2);
                                            if (NIL != var2) {
                                                result = cons(var2, result);
                                            }
                                        }
                                        done_var_$130 = makeBoolean(NIL == valid_$132);
                                    }
                                } finally {
                                    SubLObject _prev_bind_0_$134 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        SubLObject _values5 = Values.getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values5);
                                    } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$134, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        }
                        utilities_macros.noting_progress_postamble();
                    } finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$143, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$133, thread);
                    }
                }
            } else if (pcase_var.eql($OVERLAP)) {
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                SubLObject gaf3 = NIL;
                gaf3 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != assertions_high.assertion_has_truth(gaf3, $TRUE)) {
                        SubLObject var3;
                        SubLObject bindings_assertion3 = var3 = removal_negationinverse_gaf_iterator_internal(gaf3);
                        if (NIL != var3) {
                            result = cons(var3, result);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf3 = cdolist_list_var.first();
                }
            } else {
                kb_mapping_macros.do_gli_method_error(l_index, method);
            }
        } finally {
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            return iteration.new_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 27100L)
    public static SubLObject removal_negationinverse_gaf_iterator_internal(SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            SubLObject assertion_asent = assertions_high.gaf_formula(assertion);
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.gaf_asent_inverse_args_unify(control_vars.$inference_literal$.getDynamicValue(thread), assertion_asent, UNPROVIDED, UNPROVIDED);
            SubLObject gaf_asent = thread.secondMultipleValue();
            SubLObject unify_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                return list(v_bindings, assertion);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 27500L)
    public static SubLObject removal_negationinverse_lookup_supports(SubLObject asent, SubLObject assertion) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertion);
        SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject hl_formula = backward_utilities.inference_make_commutative_asent($$negationInverse, list(inf_pred, ass_pred));
        SubLObject hl_support = arguments.make_hl_support($NEGATIONPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject v_bindings = unification_utilities.gaf_asent_inverse_args_unify(asent, assertions_high.gaf_formula(assertion), T, T);
        SubLObject gaf_asent = thread.secondMultipleValue();
        SubLObject unify_justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return append(list(assertion, hl_support), unify_justification);
    }

    public static SubLObject declare_removal_modules_genlpreds_lookup_file() {
        declareFunction(myName, "removal_genlpreds_lookup_pos_cost", "REMOVAL-GENLPREDS-LOOKUP-POS-COST", 1, 1, false);
        new $removal_genlpreds_lookup_pos_cost$UnaryFunction();
        new $removal_genlpreds_lookup_pos_cost$BinaryFunction();
        declareFunction(myName, "removal_genlpreds_lookup_pos_iterator", "REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR", 1, 0, false);
        new $removal_genlpreds_lookup_pos_iterator$UnaryFunction();
        declareFunction(myName, "removal_genlpreds_lookup_neg_completeness", "REMOVAL-GENLPREDS-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        declareFunction(myName, "removal_genlpreds_lookup_neg_cost", "REMOVAL-GENLPREDS-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction(myName, "removal_genlpreds_lookup_neg_iterator", "REMOVAL-GENLPREDS-LOOKUP-NEG-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_genlpreds_lookup_iterator", "REMOVAL-GENLPREDS-LOOKUP-ITERATOR", 2, 0, false);
        declareFunction(myName, "obfuscate_predicate", "OBFUSCATE-PREDICATE", 1, 0, false);
        declareFunction(myName, "best_genlpreds_gaf_lookup_index", "BEST-GENLPREDS-GAF-LOOKUP-INDEX", 2, 0, false);
        declareFunction(myName, "num_best_genlpreds_gaf_lookup_index", "NUM-BEST-GENLPREDS-GAF-LOOKUP-INDEX", 2, 0, false);
        declareFunction(myName, "num_best_genlpreds_or_inverse_gaf_lookup_index", "NUM-BEST-GENLPREDS-OR-INVERSE-GAF-LOOKUP-INDEX", 3, 0, false);
        declareFunction(myName, "removal_genlpreds_gaf_iterator_internal", "REMOVAL-GENLPREDS-GAF-ITERATOR-INTERNAL", 1, 0, false);
        declareFunction(myName, "removal_genlpreds_lookup_supports", "REMOVAL-GENLPREDS-LOOKUP-SUPPORTS", 3, 0, false);
        declareFunction(myName, "removal_genlpreds_pred_index_pos_cost", "REMOVAL-GENLPREDS-PRED-INDEX-POS-COST", 1, 1, false);
        new $removal_genlpreds_pred_index_pos_cost$UnaryFunction();
        new $removal_genlpreds_pred_index_pos_cost$BinaryFunction();
        declareFunction(myName, "removal_genlpreds_pred_index_pos_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-POS-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_genlpreds_pred_index_neg_completeness", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-COMPLETENESS", 1, 0, false);
        declareFunction(myName, "removal_genlpreds_pred_index_neg_cost", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-COST", 1, 1, false);
        declareFunction(myName, "removal_genlpreds_pred_index_neg_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_genlpreds_pred_index_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-ITERATOR", 2, 0, false);
        declareFunction(myName, "removal_genlinverse_lookup_pos_cost", "REMOVAL-GENLINVERSE-LOOKUP-POS-COST", 1, 1, false);
        new $removal_genlinverse_lookup_pos_cost$UnaryFunction();
        new $removal_genlinverse_lookup_pos_cost$BinaryFunction();
        declareFunction(myName, "removal_genlinverse_lookup_pos_iterator", "REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR", 1, 0, false);
        new $removal_genlinverse_lookup_pos_iterator$UnaryFunction();
        declareFunction(myName, "removal_genlinverse_lookup_neg_completeness", "REMOVAL-GENLINVERSE-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        declareFunction(myName, "removal_genlinverse_lookup_neg_cost", "REMOVAL-GENLINVERSE-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction(myName, "removal_genlinverse_lookup_neg_iterator", "REMOVAL-GENLINVERSE-LOOKUP-NEG-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_genlinverse_lookup_iterator", "REMOVAL-GENLINVERSE-LOOKUP-ITERATOR", 2, 0, false);
        declareFunction(myName, "best_genlinverse_gaf_lookup_index", "BEST-GENLINVERSE-GAF-LOOKUP-INDEX", 2, 0, false);
        declareFunction(myName, "num_best_genlinverse_gaf_lookup_index", "NUM-BEST-GENLINVERSE-GAF-LOOKUP-INDEX", 2, 0, false);
        declareFunction(myName, "removal_genlinverse_gaf_iterator_internal", "REMOVAL-GENLINVERSE-GAF-ITERATOR-INTERNAL", 2, 0, false);
        declareFunction(myName, "removal_genlinverse_lookup_supports", "REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS", 3, 0, false);
        declareFunction(myName, "removal_genlinverse_pred_index_pos_cost", "REMOVAL-GENLINVERSE-PRED-INDEX-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_genlinverse_pred_index_pos_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-POS-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_genlinverse_pred_index_neg_completeness", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COMPLETENESS", 1, 0, false);
        declareFunction(myName, "removal_genlinverse_pred_index_neg_cost", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COST", 1, 1, false);
        declareFunction(myName, "removal_genlinverse_pred_index_neg_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_genlinverse_pred_index_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-ITERATOR", 2, 0, false);
        declareFunction(myName, "removal_negationpreds_lookup_completeness", "REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS", 1, 0, false);
        declareFunction(myName, "removal_negationpreds_lookup_cost", "REMOVAL-NEGATIONPREDS-LOOKUP-COST", 1, 1, false);
        declareFunction(myName, "removal_negationpreds_lookup_iterator", "REMOVAL-NEGATIONPREDS-LOOKUP-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_negationpreds_gaf_iterator_internal", "REMOVAL-NEGATIONPREDS-GAF-ITERATOR-INTERNAL", 1, 0, false);
        declareFunction(myName, "removal_negationpreds_lookup_supports", "REMOVAL-NEGATIONPREDS-LOOKUP-SUPPORTS", 2, 0, false);
        declareFunction(myName, "removal_negationinverse_lookup_iterator", "REMOVAL-NEGATIONINVERSE-LOOKUP-ITERATOR", 1, 0, false);
        declareFunction(myName, "removal_negationinverse_gaf_iterator_internal", "REMOVAL-NEGATIONINVERSE-GAF-ITERATOR-INTERNAL", 1, 0, false);
        declareFunction(myName, "removal_negationinverse_lookup_supports", "REMOVAL-NEGATIONINVERSE-LOOKUP-SUPPORTS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_genlpreds_lookup_file() {
        $unknown_hl_variable$ = deflexical("*UNKNOWN-HL-VARIABLE*", maybeDefault($sym12$_UNKNOWN_HL_VARIABLE_, $unknown_hl_variable$, () -> (variables.get_variable(ZERO_INTEGER))));
        return NIL;
    }

    public static SubLObject setup_removal_modules_genlpreds_lookup_file() {
        inference_modules.inference_removal_module($REMOVAL_GENLPREDS_LOOKUP_POS, $list2);
        inference_modules.inference_removal_module($REMOVAL_GENLPREDS_LOOKUP_NEG, $list7);
        subl_macro_promotions.declare_defglobal($sym12$_UNKNOWN_HL_VARIABLE_);
        inference_modules.inference_removal_module($REMOVAL_GENLPREDS_PRED_INDEX_POS, $list30);
        inference_modules.inference_removal_module($REMOVAL_GENLPREDS_PRED_INDEX_NEG, $list32);
        inference_modules.inference_removal_module($REMOVAL_GENLINVERSE_LOOKUP_POS, $list34);
        inference_modules.inference_removal_module($REMOVAL_GENLINVERSE_LOOKUP_NEG, $list36);
        inference_modules.inference_removal_module($REMOVAL_GENLINVERSE_PRED_INDEX_POS, $list38);
        inference_modules.inference_removal_module($REMOVAL_GENLINVERSE_PRED_INDEX_NEG, $list40);
        inference_modules.inference_removal_module($REMOVAL_NEGATIONPREDS_LOOKUP, $list44);
        inference_modules.inference_removal_module($REMOVAL_NEGATIONINVERSE_LOOKUP, $list49);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_genlpreds_lookup_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_genlpreds_lookup_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_genlpreds_lookup_file();
    }

    static {
        me = new removal_modules_genlpreds_lookup();
        $unknown_hl_variable$ = null;
        $POS = makeKeyword("POS");
        $REMOVAL_GENLPREDS_LOOKUP_POS = makeKeyword("REMOVAL-GENLPREDS-LOOKUP-POS");
        $list2 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")),
                        cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("POS")), makeKeyword("DOCUMENTATION"),
                makeString("(<predicate> ... <indexed-term> ... )\nusing true assertions using spec-preds of <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$geopoliticalSubdivision #$France #$CityOfParisFrance)") });
        $NEG = makeKeyword("NEG");
        $GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
        $INCOMPLETE = makeKeyword("INCOMPLETE");
        $REMOVAL_GENLPREDS_LOOKUP_NEG = makeKeyword("REMOVAL-GENLPREDS-LOOKUP-NEG");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")),
                        cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("NEG")), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> ... <indexed-term> ... ))\nusing false assertions using genl-preds of <predicate>") });
        $GAF_ARG = makeKeyword("GAF-ARG");
        $GAF = makeKeyword("GAF");
        $PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
        $OVERLAP = makeKeyword("OVERLAP");
        $sym12$_UNKNOWN_HL_VARIABLE_ = makeSymbol("*UNKNOWN-HL-VARIABLE*");
        $list13 = list(makeKeyword("PREDICATE-EXTENT"), makeKeyword("GAF-ARG"));
        $$genlPreds = makeConstSym(("genlPreds"));
        $DEPTH = makeKeyword("DEPTH");
        $STACK = makeKeyword("STACK");
        $QUEUE = makeKeyword("QUEUE");
        $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $ERROR = makeKeyword("ERROR");
        $str20$_A_is_not_a__A = makeString("~A is not a ~A");
        $sym21$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
        $CERROR = makeKeyword("CERROR");
        $str23$continue_anyway = makeString("continue anyway");
        $WARN = makeKeyword("WARN");
        $str25$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
        $str26$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");
        $str27$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str28$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $REMOVAL_GENLPREDS_PRED_INDEX_POS = makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-POS");
        $list30 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))),
                        cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-POS-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("POS")), makeKeyword("DOCUMENTATION"),
                makeString("(<predicate> <non-indexed-term> ... <non-indexed-term>)\nusing true assertions using spec-preds of <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$spatiallyIntersects ?WHAT ?WHAT-ELSE)") });
        $REMOVAL_GENLPREDS_PRED_INDEX_NEG = makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-NEG");
        $list32 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))),
                        cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-NEG-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("NEG")), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> <non-indexed-term> ... <non-indexed-term> ))\nusing false assertions using genl-preds of <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$spatiallyIntersects ?WHAT ?WHAT-ELSE))") });
        $REMOVAL_GENLINVERSE_LOOKUP_POS = makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-POS");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")),
                        cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("POS")), makeKeyword("DOCUMENTATION"),
                makeString("(<predicate> <indexed-term> <whatever>) and \n(<predicate> <whatever> <indexed-term>) \nusing true assertions using spec-inverses of <predicate>") });
        $REMOVAL_GENLINVERSE_LOOKUP_NEG = makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-NEG");
        $list36 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")),
                        cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("NEG")), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> <indexed-term> <whatever>)) and \n(#$not (<predicate> <whatever> <indexed-term>))\nusing false assertions using genl-inverses of <predicate>") });
        $REMOVAL_GENLINVERSE_PRED_INDEX_POS = makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-POS");
        $list38 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))),
                        cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-POS-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("POS")), makeKeyword("DOCUMENTATION"),
                makeString("(<predicate> <non-indexed-term> <non-indexed-term> )\nusing true assertions using spec-inverses of <predicate>") });
        $REMOVAL_GENLINVERSE_PRED_INDEX_NEG = makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-NEG");
        $list40 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))),
                        cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-NEG-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("NEG")), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> <non-indexed-term> <non-indexed-term> ))\nusing false assertions using genl-inverses of <predicate>") });
        $sym41$INFERENCE_NEGATION_PREDICATE_ = makeSymbol("INFERENCE-NEGATION-PREDICATE?");
        $TRUE = makeKeyword("TRUE");
        $REMOVAL_NEGATIONPREDS_LOOKUP = makeKeyword("REMOVAL-NEGATIONPREDS-LOOKUP");
        $list44 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")),
                        cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> ... <indexed-term> ... ))\nusing true assertions using negation-preds of <predicate>") });
        $$negationPreds = makeConstSym(("negationPreds"));
        $NEGATIONPREDS = makeKeyword("NEGATIONPREDS");
        $sym47$INFERENCE_NEGATION_INVERSE_ = makeSymbol("INFERENCE-NEGATION-INVERSE?");
        $REMOVAL_NEGATIONINVERSE_LOOKUP = makeKeyword("REMOVAL-NEGATIONINVERSE-LOOKUP");
        $list49 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")),
                        cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))),
                makeKeyword("COST"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONINVERSE-LOOKUP-ITERATOR"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONINVERSE-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"),
                makeString("(#$not (<predicate> ... <indexed-term> ... ))\n    using true assertions using negation-inverses of <predicate>") });
        $$negationInverse = makeConstSym(("negationInverse"));
    }

    public static class $removal_genlpreds_lookup_pos_cost$UnaryFunction extends UnaryFunction {
        public $removal_genlpreds_lookup_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_genlpreds_lookup_pos_cost(arg1, $removal_genlpreds_lookup_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_genlpreds_lookup_pos_cost$BinaryFunction extends BinaryFunction {
        public $removal_genlpreds_lookup_pos_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_genlpreds_lookup_pos_cost(arg1, arg2);
        }
    }

    public static class $removal_genlpreds_lookup_pos_iterator$UnaryFunction extends UnaryFunction {
        public $removal_genlpreds_lookup_pos_iterator$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_genlpreds_lookup_pos_iterator(arg1);
        }
    }

    public static class $removal_genlpreds_pred_index_pos_cost$UnaryFunction extends UnaryFunction {
        public $removal_genlpreds_pred_index_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-PRED-INDEX-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_genlpreds_pred_index_pos_cost(arg1, $removal_genlpreds_pred_index_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_genlpreds_pred_index_pos_cost$BinaryFunction extends BinaryFunction {
        public $removal_genlpreds_pred_index_pos_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLPREDS-PRED-INDEX-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_genlpreds_pred_index_pos_cost(arg1, arg2);
        }
    }

    public static class $removal_genlinverse_lookup_pos_cost$UnaryFunction extends UnaryFunction {
        public $removal_genlinverse_lookup_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLINVERSE-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_genlinverse_lookup_pos_cost(arg1, $removal_genlinverse_lookup_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_genlinverse_lookup_pos_cost$BinaryFunction extends BinaryFunction {
        public $removal_genlinverse_lookup_pos_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLINVERSE-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_genlinverse_lookup_pos_cost(arg1, arg2);
        }
    }

    public static class $removal_genlinverse_lookup_pos_iterator$UnaryFunction extends UnaryFunction {
        public $removal_genlinverse_lookup_pos_iterator$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_genlinverse_lookup_pos_iterator(arg1);
        }
    }
}
/*
 *
 * Total time: 2502 ms
 *
 */