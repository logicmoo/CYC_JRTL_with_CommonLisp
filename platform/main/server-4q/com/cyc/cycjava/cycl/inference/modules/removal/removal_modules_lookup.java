package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_lookup extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "2f1559201bb3ce65a5b5b2f0a14e34e3fc30af0dfd1577d5ce59048102611a35";
    private static SubLSymbol $POS;
    private static SubLSymbol $GAF_ARG;
    private static SubLSymbol $GAF;
    private static SubLSymbol $PREDICATE_EXTENT;
    private static SubLSymbol $OVERLAP;
    private static SubLSymbol $REMOVAL_LOOKUP_POS;
    private static SubLList $list6;
    private static SubLSymbol $NEG;
    private static SubLSymbol $GROSSLY_INCOMPLETE;
    private static SubLSymbol $INCOMPLETE;
    private static SubLSymbol $REMOVAL_LOOKUP_NEG;
    private static SubLList $list11;
    private static SubLSymbol $sym12$RELEVANT_MT_IS_EVERYTHING;
    private static SubLObject $$EverythingPSC;
    private static SubLSymbol $REMOVAL_PRED_UNBOUND;
    private static SubLList $list15;
    private static SubLSymbol $PRED_UNBOUND_POS;
    private static SubLList $list17;
    private static SubLSymbol $GROSSLY_DISPREFERRED;
    private static SubLSymbol $DISALLOWED;
    private static SubLSymbol $sym20$INDEXED_TERM_P;
    private static SubLSymbol $sym21$FORT_P;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 800L)
    public static SubLObject removal_lookup_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != variables.fully_bound_p(asent)) {
            return control_vars.$cheap_hl_module_check_cost$.getGlobalValue();
        }
        return inference_trampolines.inference_num_gaf_lookup_index(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 1500L)
    public static SubLObject removal_completely_asserted_asentP(SubLObject asent) {
        return makeBoolean(NIL != inference_completeness_utilities.inference_completely_asserted_asentP(asent, mt_relevance_macros.inference_relevant_mt()) && NIL == kb_utilities.at_least_partially_commutative_predicate_p(cycl_utilities.atomic_sentence_predicate(asent)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 1800L)
    public static SubLObject removal_lookup_pos_iterator(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, $POS);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$1 = NIL;
                                    SubLObject token_var_$2 = NIL;
                                    while (NIL == done_var_$1) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                        if (NIL != valid_$3 && NIL != backward_utilities.direction_is_relevant(assertion) && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$1 = makeBoolean(NIL == valid_$3);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$2 = NIL;
                                    SubLObject token_var_$3 = NIL;
                                    while (NIL == done_var_$2) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                        if (NIL != valid_$4 && NIL != backward_utilities.direction_is_relevant(assertion) && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$2 = makeBoolean(NIL == valid_$4);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                SubLObject done_var_$3 = NIL;
                                SubLObject token_var_$4 = NIL;
                                while (NIL == done_var_$3) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                    if (NIL != valid_$5 && NIL != backward_utilities.direction_is_relevant(assertion) && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                        result = cons(assertion, result);
                                    }
                                    done_var_$3 = makeBoolean(NIL == valid_$5);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                SubLObject done_var_$4 = NIL;
                                SubLObject token_var_$5 = NIL;
                                while (NIL == done_var_$4) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                    if (NIL != valid_$6 && NIL != backward_utilities.direction_is_relevant(assertion) && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                        result = cons(assertion, result);
                                    }
                                    done_var_$4 = makeBoolean(NIL == valid_$6);
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
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                SubLObject done_var_$5 = NIL;
                                SubLObject token_var_$6 = NIL;
                                while (NIL == done_var_$5) {
                                    SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                    SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion2));
                                    if (NIL != valid_$7 && NIL != backward_utilities.direction_is_relevant(assertion2) && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion2), UNPROVIDED, UNPROVIDED)) {
                                        result = cons(assertion2, result);
                                    }
                                    done_var_$5 = makeBoolean(NIL == valid_$7);
                                }
                            } finally {
                                SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values5 = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
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
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
            SubLObject assertion3 = NIL;
            assertion3 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == enumeration_types.sense_truth($POS) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS))) && NIL != backward_utilities.direction_is_relevant(assertion3)
                        && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion3), UNPROVIDED, UNPROVIDED)) {
                    result = cons(assertion3, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        } else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 2900L)
    public static SubLObject removal_lookup_neg_completeness(SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 3100L)
    public static SubLObject removal_lookup_neg_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return inference_trampolines.inference_num_gaf_lookup_index(asent, $NEG);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 3200L)
    public static SubLObject removal_lookup_neg_iterator(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, $NEG);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                    SubLObject done_var_$17 = NIL;
                                    SubLObject token_var_$18 = NIL;
                                    while (NIL == done_var_$17) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                        SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(assertion));
                                        if (NIL != valid_$19 && NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$17 = makeBoolean(NIL == valid_$19);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                    SubLObject done_var_$18 = NIL;
                                    SubLObject token_var_$19 = NIL;
                                    while (NIL == done_var_$18) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                        SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(assertion));
                                        if (NIL != valid_$20 && NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$18 = makeBoolean(NIL == valid_$20);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                SubLObject done_var_$19 = NIL;
                                SubLObject token_var_$20 = NIL;
                                while (NIL == done_var_$19) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                    SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(assertion));
                                    if (NIL != valid_$21 && NIL != backward_utilities.direction_is_relevant(assertion)) {
                                        result = cons(assertion, result);
                                    }
                                    done_var_$19 = makeBoolean(NIL == valid_$21);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                SubLObject done_var_$20 = NIL;
                                SubLObject token_var_$21 = NIL;
                                while (NIL == done_var_$20) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$21);
                                    SubLObject valid_$22 = makeBoolean(!token_var_$21.eql(assertion));
                                    if (NIL != valid_$22 && NIL != backward_utilities.direction_is_relevant(assertion)) {
                                        result = cons(assertion, result);
                                    }
                                    done_var_$20 = makeBoolean(NIL == valid_$22);
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
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($NEG), NIL);
                                SubLObject done_var_$21 = NIL;
                                SubLObject token_var_$22 = NIL;
                                while (NIL == done_var_$21) {
                                    SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$22);
                                    SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(assertion2));
                                    if (NIL != valid_$23 && NIL != backward_utilities.direction_is_relevant(assertion2)) {
                                        result = cons(assertion2, result);
                                    }
                                    done_var_$21 = makeBoolean(NIL == valid_$23);
                                }
                            } finally {
                                SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values5 = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
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
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
            SubLObject assertion3 = NIL;
            assertion3 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == enumeration_types.sense_truth($NEG) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($NEG))) && NIL != backward_utilities.direction_is_relevant(assertion3)) {
                    result = cons(assertion3, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        } else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 4200L)
    public static SubLObject removal_lookup_expand_internal(SubLObject assertion, SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, T, T);
            SubLObject gaf_asent = thread.secondMultipleValue();
            SubLObject unify_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                backward.removal_add_node(assertion, v_bindings, unify_justification);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 4700L)
    public static SubLObject removal_pred_unbound_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym12$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = inference_trampolines.inference_num_gaf_lookup_index(asent, $POS);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 5100L)
    public static SubLObject removal_pred_unbound_iterator(SubLObject asent) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, $POS);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$33 = NIL;
                                    SubLObject token_var_$34 = NIL;
                                    while (NIL == done_var_$33) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$34);
                                        SubLObject valid_$35 = makeBoolean(!token_var_$34.eql(assertion));
                                        if (NIL != valid_$35 && NIL != backward_utilities.direction_is_relevant(assertion) && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$33 = makeBoolean(NIL == valid_$35);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                    SubLObject done_var_$34 = NIL;
                                    SubLObject token_var_$35 = NIL;
                                    while (NIL == done_var_$34) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                        SubLObject valid_$36 = makeBoolean(!token_var_$35.eql(assertion));
                                        if (NIL != valid_$36 && NIL != backward_utilities.direction_is_relevant(assertion) && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                            result = cons(assertion, result);
                                        }
                                        done_var_$34 = makeBoolean(NIL == valid_$36);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                SubLObject done_var_$35 = NIL;
                                SubLObject token_var_$36 = NIL;
                                while (NIL == done_var_$35) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                    SubLObject valid_$37 = makeBoolean(!token_var_$36.eql(assertion));
                                    if (NIL != valid_$37 && NIL != backward_utilities.direction_is_relevant(assertion) && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                        result = cons(assertion, result);
                                    }
                                    done_var_$35 = makeBoolean(NIL == valid_$37);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth($POS), NIL);
                                SubLObject done_var_$36 = NIL;
                                SubLObject token_var_$37 = NIL;
                                while (NIL == done_var_$36) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$37);
                                    SubLObject valid_$38 = makeBoolean(!token_var_$37.eql(assertion));
                                    if (NIL != valid_$38 && NIL != backward_utilities.direction_is_relevant(assertion) && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED)) {
                                        result = cons(assertion, result);
                                    }
                                    done_var_$36 = makeBoolean(NIL == valid_$38);
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
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth($POS), NIL);
                                SubLObject done_var_$37 = NIL;
                                SubLObject token_var_$38 = NIL;
                                while (NIL == done_var_$37) {
                                    SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$38);
                                    SubLObject valid_$39 = makeBoolean(!token_var_$38.eql(assertion2));
                                    if (NIL != valid_$39 && NIL != backward_utilities.direction_is_relevant(assertion2) && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion2), UNPROVIDED, UNPROVIDED)) {
                                        result = cons(assertion2, result);
                                    }
                                    done_var_$37 = makeBoolean(NIL == valid_$39);
                                }
                            } finally {
                                SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values5 = Values.getValuesAsVector();
                                    if (NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
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
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
            SubLObject assertion3 = NIL;
            assertion3 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == enumeration_types.sense_truth($POS) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth($POS))) && NIL != backward_utilities.direction_is_relevant(assertion3)
                        && NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion3), UNPROVIDED, UNPROVIDED)) {
                    result = cons(assertion3, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        } else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        if (NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 6500L)
    public static SubLObject pred_unbound_pos_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        if (NIL != formula_contains_indexed_termP(asent, UNPROVIDED) && NIL == list_utilities.member_eqP(cycl_utilities.atomic_sentence_predicate(asent), bindable_vars)) {
            return $GROSSLY_DISPREFERRED;
        }
        return $DISALLOWED;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 6800L)
    public static SubLObject formula_contains_indexed_termP(SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find_if(Symbols.symbol_function($sym20$INDEXED_TERM_P), formula, penetrate_hl_structuresP, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 7100L)
    public static SubLObject formula_has_indexed_term_arg_p(SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function($sym20$INDEXED_TERM_P), cycl_utilities.formula_args(formula, seqvar_handling), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 7300L)
    public static SubLObject formula_has_fort_arg_p(SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function($sym21$FORT_P), cycl_utilities.formula_args(formula, seqvar_handling), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 7500L)
    public static SubLObject asent_has_fort_arg_p(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return formula_has_fort_arg_p(asent, seqvar_handling);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 7700L)
    public static SubLObject asent_has_indexed_term_arg_p(SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == UNPROVIDED) {
            seqvar_handling = NIL;
        }
        return formula_has_indexed_term_arg_p(asent, seqvar_handling);
    }

    public static SubLObject declare_removal_modules_lookup_file() {
        declareFunction("removal_lookup_pos_cost", "REMOVAL-LOOKUP-POS-COST", 1, 1, false);
        new $removal_lookup_pos_cost$UnaryFunction();
        new $removal_lookup_pos_cost$BinaryFunction();
        declareFunction("removal_completely_asserted_asentP", "REMOVAL-COMPLETELY-ASSERTED-ASENT?", 1, 0, false);
        new $removal_completely_asserted_asentP$UnaryFunction();
        declareFunction("removal_lookup_pos_iterator", "REMOVAL-LOOKUP-POS-ITERATOR", 1, 0, false);
        new $removal_lookup_pos_iterator$UnaryFunction();
        declareFunction("removal_lookup_neg_completeness", "REMOVAL-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        declareFunction("removal_lookup_neg_cost", "REMOVAL-LOOKUP-NEG-COST", 1, 1, false);
        declareFunction("removal_lookup_neg_iterator", "REMOVAL-LOOKUP-NEG-ITERATOR", 1, 0, false);
        declareFunction("removal_lookup_expand_internal", "REMOVAL-LOOKUP-EXPAND-INTERNAL", 2, 0, false);
        declareFunction("removal_pred_unbound_cost", "REMOVAL-PRED-UNBOUND-COST", 1, 1, false);
        declareFunction("removal_pred_unbound_iterator", "REMOVAL-PRED-UNBOUND-ITERATOR", 1, 0, false);
        declareFunction("pred_unbound_pos_preference", "PRED-UNBOUND-POS-PREFERENCE", 3, 0, false);
        declareFunction("formula_contains_indexed_termP", "FORMULA-CONTAINS-INDEXED-TERM?", 1, 1, false);
        declareFunction("formula_has_indexed_term_arg_p", "FORMULA-HAS-INDEXED-TERM-ARG-P", 1, 1, false);
        declareFunction("formula_has_fort_arg_p", "FORMULA-HAS-FORT-ARG-P", 1, 1, false);
        declareFunction("asent_has_fort_arg_p", "ASENT-HAS-FORT-ARG-P", 1, 1, false);
        declareFunction("asent_has_indexed_term_arg_p", "ASENT-HAS-INDEXED-TERM-ARG-P", 1, 1, false);
        new $asent_has_indexed_term_arg_p$UnaryFunction();
        new $asent_has_indexed_term_arg_p$BinaryFunction();
        return NIL;
    }

    public static SubLObject init_removal_modules_lookup_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_lookup_file() {
        inference_modules.inference_removal_module($REMOVAL_LOOKUP_POS, $list6);
        inference_modules.inference_removal_module($REMOVAL_LOOKUP_NEG, $list11);
        inference_modules.inference_removal_module($REMOVAL_PRED_UNBOUND, $list15);
        preference_modules.inference_preference_module($PRED_UNBOUND_POS, $list17);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_lookup_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_lookup_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_lookup_file();
    }

    static {
        me = new removal_modules_lookup();
        $POS = makeKeyword("POS");
        $GAF_ARG = makeKeyword("GAF-ARG");
        $GAF = makeKeyword("GAF");
        $PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
        $OVERLAP = makeKeyword("OVERLAP");
        $REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");
        $list6 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("REMOVAL-LOOKUP-POS-COST"), makeKeyword("COMPLETE-PATTERN"),
                list(makeKeyword("TEST"), makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"),
                makeString("(<fort> . <whatever>)\nusing true assertions and GAF indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$bordersOn #$UnitedStatesOfAmerica ?COUNTRY)\n (#$bordersOn #$UnitedStatesOfAmerica #$Canada)\n (#$resultIsa #$JuvenileFn #$JuvenileAnimal)") });
        $NEG = makeKeyword("NEG");
        $GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
        $INCOMPLETE = makeKeyword("INCOMPLETE");
        $REMOVAL_LOOKUP_NEG = makeKeyword("REMOVAL-LOOKUP-NEG");
        $list11 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("REMOVAL-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"),
                ConsesLow.list(makeKeyword("CALL"), makeSymbol("REMOVAL-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"),
                list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nusing false assertions and GAF indexing in the KB") });
        $sym12$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $$EverythingPSC = makeConstSym(("EverythingPSC"));
        $REMOVAL_PRED_UNBOUND = makeKeyword("REMOVAL-PRED-UNBOUND");
        $list15 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("FORMULA-CONTAINS-INDEXED-TERM?"))), makeKeyword("COST"), makeSymbol("REMOVAL-PRED-UNBOUND-COST"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-PRED-UNBOUND-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"),
                makeString("(<variable> ... <fort> ... )\nusing true assertions and GAF indexing on <fort>.\nThis is a last-resort if <variable> occurs elsewhere."), makeKeyword("EXAMPLE"), makeString("(?PREDICATE #$UnitedStatesOfAmerica #$Canada)") });
        $PRED_UNBOUND_POS = makeKeyword("PRED-UNBOUND-POS");
        $list17 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("PRED-UNBOUND-POS-PREFERENCE"));
        $GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
        $DISALLOWED = makeKeyword("DISALLOWED");
        $sym20$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
        $sym21$FORT_P = makeSymbol("FORT-P");
    }

    public static class $removal_lookup_pos_cost$UnaryFunction extends UnaryFunction {
        public $removal_lookup_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_lookup_pos_cost(arg1, $removal_lookup_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $removal_lookup_pos_cost$BinaryFunction extends BinaryFunction {
        public $removal_lookup_pos_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-LOOKUP-POS-COST"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return removal_lookup_pos_cost(arg1, arg2);
        }
    }

    public static class $removal_completely_asserted_asentP$UnaryFunction extends UnaryFunction {
        public $removal_completely_asserted_asentP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-COMPLETELY-ASSERTED-ASENT?"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_completely_asserted_asentP(arg1);
        }
    }

    public static class $removal_lookup_pos_iterator$UnaryFunction extends UnaryFunction {
        public $removal_lookup_pos_iterator$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-LOOKUP-POS-ITERATOR"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return removal_lookup_pos_iterator(arg1);
        }
    }

    public static class $asent_has_indexed_term_arg_p$UnaryFunction extends UnaryFunction {
        public $asent_has_indexed_term_arg_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASENT-HAS-INDEXED-TERM-ARG-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return asent_has_indexed_term_arg_p(arg1, $asent_has_indexed_term_arg_p$UnaryFunction.UNPROVIDED);
        }
    }

    public static class $asent_has_indexed_term_arg_p$BinaryFunction extends BinaryFunction {
        public $asent_has_indexed_term_arg_p$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASENT-HAS-INDEXED-TERM-ARG-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
            return asent_has_indexed_term_arg_p(arg1, arg2);
        }
    }
}
/*
 *
 * Total time: 754 ms
 *
 */