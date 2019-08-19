package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_denotes extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes";
    public static String myFingerPrint = "98a64ca3dab6338fb1b2bf952ba73ce04c95926ef9b62684609f631e557f4a8f";
    private static SubLObject $$means;
    private static SubLSymbol $REMOVAL_NON_WFF_CHECK_NEG;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $MEANS_UNIFY_ARG1_POS;
    private static SubLList $list5;
    private static SubLSymbol $MEANS_UNIFY_ARG1_NEG;
    private static SubLList $list7;
    private static SubLSymbol $REMOVAL_MEANS_CHECK_POS;
    private static SubLList $list9;
    private static SubLSymbol $OPAQUE;
    private static SubLList $list11;
    private static SubLObject $$expresses;
    private static SubLObject $$denotes;
    private static SubLObject $$QuasiQuote;
    private static SubLObject $$Quote;
    private static SubLSymbol $GAF_ARG;
    private static SubLSymbol $GAF;
    private static SubLSymbol $PREDICATE_EXTENT;
    private static SubLSymbol $OVERLAP;
    private static SubLSymbol $REMOVAL_MEANS_UNIFY_ARG1_POS;
    private static SubLList $list21;
    private static SubLSymbol $REMOVAL_MEANS_UNIFY_ARG2_POS;
    private static SubLList $list23;
    private static SubLSymbol $REMOVAL_MEANS_NEG;
    private static SubLList $list25;
    private static SubLObject $$CycLTerm;
    private static SubLObject $$CycLDenotationalTerm;
    private static SubLObject $$CycLSentence;
    private static SubLSymbol $DENOTES_UNIFY_ARG1_POS;
    private static SubLList $list30;
    private static SubLSymbol $DENOTES_UNIFY_ARG1_NEG;
    private static SubLList $list32;
    private static SubLSymbol $REMOVAL_DENOTES_CHECK_POS;
    private static SubLList $list34;
    private static SubLSymbol $REMOVAL_DENOTES_UNIFY_ARG1_POS;
    private static SubLList $list36;
    private static SubLSymbol $REMOVAL_DENOTES_UNIFY_ARG2_POS;
    private static SubLList $list38;
    private static SubLSymbol $REMOVAL_DENOTES_NEG;
    private static SubLList $list40;
    private static SubLSymbol $EXPRESSES_UNIFY_ARG1_POS;
    private static SubLList $list42;
    private static SubLSymbol $EXPRESSES_UNIFY_ARG1_NEG;
    private static SubLList $list44;
    private static SubLSymbol $REMOVAL_EXPRESSES_CHECK_POS;
    private static SubLList $list46;
    private static SubLSymbol $REMOVAL_EXPRESSES_UNIFY_ARG1_POS;
    private static SubLList $list48;
    private static SubLSymbol $REMOVAL_EXPRESSES_UNIFY_ARG2_POS;
    private static SubLList $list50;
    private static SubLSymbol $REMOVAL_EXPRESSES_NEG;
    private static SubLList $list52;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 2000L)
    public static SubLObject make_means_support(SubLObject asent) {
        return arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 2100L)
    public static SubLObject removal_means_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return control_vars.$hl_module_check_cost$.getDynamicValue(thread);
        }
        return removal_means_lookup_cost(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 2400L)
    public static SubLObject removal_means_lookup_cost(SubLObject asent, SubLObject sense) {
        SubLObject cost = inference_trampolines.inference_num_gaf_lookup_index(asent, sense);
        if ($$means.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject cdolist_list_var = $list11;
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cost = Numbers.add(cost, inference_trampolines.inference_num_gaf_lookup_index(list(spec_pred, arg1, arg2), sense));
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            }
        }
        return cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 2800L)
    public static SubLObject removal_means_correct_arg2(SubLObject pred, SubLObject arg2) {
        if (pred.eql($$means)) {
            return cycl_grammar.cycl_term_p(arg2);
        }
        if (pred.eql($$expresses)) {
            return cycl_grammar.cycl_sentence_p(arg2);
        }
        if (pred.eql($$denotes)) {
            return cycl_grammar.cycl_denotational_term_p(arg2);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 3000L)
    public static SubLObject removal_means_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL == removal_means_correct_arg2(pred, arg2)) {
            return NIL;
        }
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return removal_means_check_pos_quoted_expand(pred, arg1, arg2, NIL);
        }
        return removal_means_check_lookup_expand(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 3500L)
    public static SubLObject removal_means_check_pos_quoted_expand(SubLObject pred, SubLObject arg1, SubLObject arg2, SubLObject use_quasiquoteP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_term = (NIL != variables.variable_p(arg1)) ? arg1 : czer_main.canonicalize_quoted_term(arg1, T);
        SubLObject quoted_term = (NIL != use_quasiquoteP) ? list($$QuasiQuote, arg2) : list($$Quote, arg2);
        thread.resetMultipleValues();
        SubLObject v_bindings = unification_utilities.term_unify(canon_term, quoted_term, T, T);
        SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject unified_term = bindings.subst_bindings(v_bindings, canon_term);
            SubLObject unified_asent = list(pred, unified_term, arg2);
            return backward.removal_add_node(make_means_support(unified_asent), v_bindings, unify_justification);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 4100L)
    public static SubLObject removal_means_check_lookup_expand(SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, sense);
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
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                        if (NIL != valid_$3) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                    SubLObject done_var_$2 = NIL;
                                    SubLObject token_var_$3 = NIL;
                                    while (NIL == done_var_$2) {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                        if (NIL != valid_$4) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                SubLObject done_var_$3 = NIL;
                                SubLObject token_var_$4 = NIL;
                                while (NIL == done_var_$3) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                    if (NIL != valid_$5) {
                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, enumeration_types.sense_truth(sense), NIL);
                                SubLObject done_var_$4 = NIL;
                                SubLObject token_var_$5 = NIL;
                                while (NIL == done_var_$4) {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                    if (NIL != valid_$6) {
                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
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
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                SubLObject done_var_$5 = NIL;
                                SubLObject token_var_$6 = NIL;
                                while (NIL == done_var_$5) {
                                    SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                    SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion2));
                                    if (NIL != valid_$7) {
                                        removal_modules_lookup.removal_lookup_expand_internal(assertion2, asent);
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
                if (NIL == enumeration_types.sense_truth(sense) || NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense))) {
                    removal_modules_lookup.removal_lookup_expand_internal(assertion3, asent);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        } else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        if ($$means.eql(pred)) {
            arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            SubLObject cdolist_list_var = $list11;
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject spec_asent = list(spec_pred, arg1, arg2);
                SubLObject l_index2 = inference_trampolines.inference_gaf_lookup_index(spec_asent, sense);
                SubLObject pcase_var2;
                SubLObject method2 = pcase_var2 = kb_mapping_macros.do_gli_extract_method(l_index2);
                if (pcase_var2.eql($GAF_ARG)) {
                    thread.resetMultipleValues();
                    SubLObject v_term2 = kb_mapping_macros.do_gli_vga_extract_keys(l_index2);
                    SubLObject argnum2 = thread.secondMultipleValue();
                    SubLObject predicate2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != argnum2) {
                        if (NIL != predicate2) {
                            SubLObject pred_var3 = predicate2;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum2, pred_var3)) {
                                SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum2, pred_var3);
                                SubLObject done_var2 = NIL;
                                SubLObject token_var2 = NIL;
                                while (NIL == done_var2) {
                                    SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (NIL != valid2) {
                                        SubLObject final_index_iterator2 = NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$6 = NIL;
                                            SubLObject token_var_$7 = NIL;
                                            while (NIL == done_var_$6) {
                                                SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$7);
                                                SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(assertion2));
                                                if (NIL != valid_$8) {
                                                    removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                                }
                                                done_var_$6 = makeBoolean(NIL == valid_$8);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values6 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                Values.restoreValuesFromVector(_values6);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_13, thread);
                                            }
                                        }
                                    }
                                    done_var2 = makeBoolean(NIL == valid2);
                                }
                            }
                        } else {
                            SubLObject pred_var3 = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum2, pred_var3)) {
                                SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum2, pred_var3);
                                SubLObject done_var2 = NIL;
                                SubLObject token_var2 = NIL;
                                while (NIL == done_var2) {
                                    SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (NIL != valid2) {
                                        SubLObject final_index_iterator2 = NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                            SubLObject done_var_$7 = NIL;
                                            SubLObject token_var_$8 = NIL;
                                            while (NIL == done_var_$7) {
                                                SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$8);
                                                SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(assertion2));
                                                if (NIL != valid_$9) {
                                                    removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                                }
                                                done_var_$7 = makeBoolean(NIL == valid_$9);
                                            }
                                        } finally {
                                            SubLObject _prev_bind_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                SubLObject _values7 = Values.getValuesAsVector();
                                                if (NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                Values.restoreValuesFromVector(_values7);
                                            } finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_14, thread);
                                            }
                                        }
                                    }
                                    done_var2 = makeBoolean(NIL == valid2);
                                }
                            }
                        }
                    } else if (NIL != predicate2) {
                        SubLObject pred_var3 = predicate2;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, NIL, pred_var3)) {
                            SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, NIL, pred_var3);
                            SubLObject done_var2 = NIL;
                            SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$8 = NIL;
                                        SubLObject token_var_$9 = NIL;
                                        while (NIL == done_var_$8) {
                                            SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$9);
                                            SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(assertion2));
                                            if (NIL != valid_$10) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                            }
                                            done_var_$8 = makeBoolean(NIL == valid_$10);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values8 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values8);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_15, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            }
                        }
                    } else {
                        SubLObject pred_var3 = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, NIL, pred_var3)) {
                            SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, NIL, pred_var3);
                            SubLObject done_var2 = NIL;
                            SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$9 = NIL;
                                        SubLObject token_var_$10 = NIL;
                                        while (NIL == done_var_$9) {
                                            SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$10);
                                            SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(assertion2));
                                            if (NIL != valid_$11) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                            }
                                            done_var_$9 = makeBoolean(NIL == valid_$11);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values9 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values9);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_16, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            }
                        }
                    }
                } else if (pcase_var2.eql($PREDICATE_EXTENT)) {
                    SubLObject pred_var4 = kb_mapping_macros.do_gli_vpe_extract_key(l_index2);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var4)) {
                        SubLObject str2 = NIL;
                        SubLObject _prev_bind_17 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        SubLObject _prev_bind_18 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        SubLObject _prev_bind_19 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        SubLObject _prev_bind_20 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        SubLObject _prev_bind_21 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        SubLObject _prev_bind_22 = utilities_macros.$progress_count$.currentBinding(thread);
                        SubLObject _prev_bind_23 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        SubLObject _prev_bind_24 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind(T, thread);
                            utilities_macros.$silent_progressP$.bind((NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
                            utilities_macros.noting_progress_preamble(str2);
                            SubLObject iterator_var3 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var4);
                            SubLObject done_var3 = NIL;
                            SubLObject token_var3 = NIL;
                            while (NIL == done_var3) {
                                SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                                SubLObject valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                                if (NIL != valid3) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator3 = NIL;
                                    try {
                                        final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, $GAF, enumeration_types.sense_truth(sense), NIL);
                                        SubLObject done_var_$10 = NIL;
                                        SubLObject token_var_$11 = NIL;
                                        while (NIL == done_var_$10) {
                                            SubLObject assertion4 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$11);
                                            SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(assertion4));
                                            if (NIL != valid_$12) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion4, spec_asent);
                                            }
                                            done_var_$10 = makeBoolean(NIL == valid_$12);
                                        }
                                    } finally {
                                        SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            SubLObject _values10 = Values.getValuesAsVector();
                                            if (NIL != final_index_iterator3) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                            }
                                            Values.restoreValuesFromVector(_values10);
                                        } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                        }
                                    }
                                }
                                done_var3 = makeBoolean(NIL == valid3);
                            }
                            utilities_macros.noting_progress_postamble();
                        } finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_24, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_23, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_22, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_21, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_20, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_19, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_18, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_17, thread);
                        }
                    }
                } else if (pcase_var2.eql($OVERLAP)) {
                    SubLObject cdolist_list_var_$33 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index2), UNPROVIDED);
                    SubLObject assertion5 = NIL;
                    assertion5 = cdolist_list_var_$33.first();
                    while (NIL != cdolist_list_var_$33) {
                        if (NIL == enumeration_types.sense_truth(sense) || NIL != assertions_high.assertion_has_truth(assertion5, enumeration_types.sense_truth(sense))) {
                            removal_modules_lookup.removal_lookup_expand_internal(assertion5, spec_asent);
                        }
                        cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                        assertion5 = cdolist_list_var_$33.first();
                    }
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index2, method2);
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 5500L)
    public static SubLObject removal_means_unify_arg1_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return ONE_INTEGER;
        }
        return Numbers.add(ONE_INTEGER, removal_means_lookup_cost(asent, $POS));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 5800L)
    public static SubLObject removal_means_unify_arg1_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL == removal_means_correct_arg2(pred, arg2)) {
            return NIL;
        }
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            removal_means_check_pos_quoted_expand(pred, arg1, arg2, NIL);
        } else {
            if (NIL != variables.variable_p(arg1)) {
                removal_means_check_pos_quoted_expand(pred, arg1, arg2, NIL);
            } else {
                removal_means_check_pos_quoted_expand(pred, arg1, arg2, T);
            }
            removal_means_check_lookup_expand(asent, $POS);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 6900L)
    public static SubLObject removal_means_unify_arg2_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return removal_means_unify_arg2_pos_quoted_expand(pred, arg1, arg2);
        }
        return removal_means_check_lookup_expand(asent, $POS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 7300L)
    public static SubLObject removal_means_unify_arg2_pos_quoted_expand(SubLObject pred, SubLObject arg1, SubLObject arg2) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unquoted_term = cycl_utilities.formula_arg1(czer_main.canonicalize_quoted_term(arg1, UNPROVIDED), UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject v_bindings = unification_utilities.term_unify(unquoted_term, arg2, T, T);
        SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            SubLObject unified_term = bindings.subst_bindings(v_bindings, arg2);
            SubLObject unified_asent = NIL;
            if (NIL != removal_means_correct_arg2(pred, unified_term)) {
                unified_asent = list(pred, arg1, unified_term);
                return backward.removal_add_node(make_means_support(unified_asent), v_bindings, unify_justification);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 8600L)
    public static SubLObject removal_means_arg1_isaP(SubLObject pred, SubLObject arg1) {
        if (pred.eql($$means)) {
            return isa.isaP(arg1, $$CycLTerm, UNPROVIDED, UNPROVIDED);
        }
        if (pred.eql($$denotes)) {
            return isa.isaP(arg1, $$CycLDenotationalTerm, UNPROVIDED, UNPROVIDED);
        }
        if (pred.eql($$expresses)) {
            return isa.isaP(arg1, $$CycLSentence, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 8800L)
    public static SubLObject removal_means_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != variables.fully_bound_p(arg1) && NIL == removal_means_correct_arg2(pred, arg2)) {
            return backward.removal_add_node(make_means_support(cycl_utilities.negate(asent)), NIL, UNPROVIDED);
        }
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return removal_means_neg_quoted_expand(asent, arg1, arg2);
        }
        if (NIL != removal_means_arg1_isaP(pred, arg1)) {
            return removal_means_check_lookup_expand(asent, $NEG);
        }
        return backward.removal_add_node(make_means_support(cycl_utilities.negate(asent)), NIL, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 9500L)
    public static SubLObject removal_means_neg_quoted_expand(SubLObject asent, SubLObject arg1, SubLObject arg2) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject canon_term = czer_main.canonicalize_quoted_term(arg1, UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject v_bindings = unification_utilities.term_unify(canon_term, list($$Quote, arg2), UNPROVIDED, UNPROVIDED);
        SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == v_bindings) {
            return backward.removal_add_node(make_means_support(cycl_utilities.negate(asent)), NIL, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 11100L)
    public static SubLObject removal_denotes_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_check_pos_cost(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 11200L)
    public static SubLObject removal_denotes_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_check_pos_expand(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 12000L)
    public static SubLObject removal_denotes_unify_arg1_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg1_pos_cost(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 12100L)
    public static SubLObject removal_denotes_unify_arg1_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg1_pos_expand(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 12700L)
    public static SubLObject removal_denotes_unify_arg2_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg2_pos_expand(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 13400L)
    public static SubLObject removal_denotes_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_neg_expand(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 14900L)
    public static SubLObject removal_expresses_check_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_check_pos_cost(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 15000L)
    public static SubLObject removal_expresses_check_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_check_pos_expand(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 15900L)
    public static SubLObject removal_expresses_unify_arg1_pos_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg1_pos_cost(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 16000L)
    public static SubLObject removal_expresses_unify_arg1_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg1_pos_expand(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 16700L)
    public static SubLObject removal_expresses_unify_arg2_pos_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_unify_arg2_pos_expand(asent, sense);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 17400L)
    public static SubLObject removal_expresses_neg_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return removal_means_neg_expand(asent, sense);
    }

    public static SubLObject declare_removal_modules_denotes_file() {
        declareFunction(myName, "make_means_support", "MAKE-MEANS-SUPPORT", 1, 0, false);
        declareFunction(myName, "removal_means_check_pos_cost", "REMOVAL-MEANS-CHECK-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_means_lookup_cost", "REMOVAL-MEANS-LOOKUP-COST", 2, 0, false);
        declareFunction(myName, "removal_means_correct_arg2", "REMOVAL-MEANS-CORRECT-ARG2", 2, 0, false);
        declareFunction(myName, "removal_means_check_pos_expand", "REMOVAL-MEANS-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_means_check_pos_quoted_expand", "REMOVAL-MEANS-CHECK-POS-QUOTED-EXPAND", 4, 0, false);
        declareFunction(myName, "removal_means_check_lookup_expand", "REMOVAL-MEANS-CHECK-LOOKUP-EXPAND", 2, 0, false);
        declareFunction(myName, "removal_means_unify_arg1_pos_cost", "REMOVAL-MEANS-UNIFY-ARG1-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_means_unify_arg1_pos_expand", "REMOVAL-MEANS-UNIFY-ARG1-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_means_unify_arg2_pos_expand", "REMOVAL-MEANS-UNIFY-ARG2-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_means_unify_arg2_pos_quoted_expand", "REMOVAL-MEANS-UNIFY-ARG2-POS-QUOTED-EXPAND", 3, 0, false);
        declareFunction(myName, "removal_means_arg1_isaP", "REMOVAL-MEANS-ARG1-ISA?", 2, 0, false);
        declareFunction(myName, "removal_means_neg_expand", "REMOVAL-MEANS-NEG-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_means_neg_quoted_expand", "REMOVAL-MEANS-NEG-QUOTED-EXPAND", 3, 0, false);
        declareFunction(myName, "removal_denotes_check_pos_cost", "REMOVAL-DENOTES-CHECK-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_denotes_check_pos_expand", "REMOVAL-DENOTES-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_denotes_unify_arg1_pos_cost", "REMOVAL-DENOTES-UNIFY-ARG1-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_denotes_unify_arg1_pos_expand", "REMOVAL-DENOTES-UNIFY-ARG1-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_denotes_unify_arg2_pos_expand", "REMOVAL-DENOTES-UNIFY-ARG2-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_denotes_neg_expand", "REMOVAL-DENOTES-NEG-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_expresses_check_pos_cost", "REMOVAL-EXPRESSES-CHECK-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_expresses_check_pos_expand", "REMOVAL-EXPRESSES-CHECK-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_expresses_unify_arg1_pos_cost", "REMOVAL-EXPRESSES-UNIFY-ARG1-POS-COST", 1, 1, false);
        declareFunction(myName, "removal_expresses_unify_arg1_pos_expand", "REMOVAL-EXPRESSES-UNIFY-ARG1-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_expresses_unify_arg2_pos_expand", "REMOVAL-EXPRESSES-UNIFY-ARG2-POS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_expresses_neg_expand", "REMOVAL-EXPRESSES-NEG-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_denotes_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_denotes_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$means);
        inference_modules.inference_removal_module_dont_use_universal($$means, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$means);
        preference_modules.doomed_unless_arg_bindable($NEG, $$means, TWO_INTEGER);
        preference_modules.inference_preference_module($MEANS_UNIFY_ARG1_POS, $list5);
        preference_modules.inference_preference_module($MEANS_UNIFY_ARG1_NEG, $list7);
        inference_modules.inference_removal_module($REMOVAL_MEANS_CHECK_POS, $list9);
        inference_modules.inference_removal_module($REMOVAL_MEANS_UNIFY_ARG1_POS, $list21);
        inference_modules.inference_removal_module($REMOVAL_MEANS_UNIFY_ARG2_POS, $list23);
        inference_modules.inference_removal_module($REMOVAL_MEANS_NEG, $list25);
        inference_modules.register_solely_specific_removal_module_predicate($$denotes);
        inference_modules.inference_removal_module_dont_use_universal($$denotes, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$denotes);
        preference_modules.doomed_unless_arg_bindable($NEG, $$denotes, TWO_INTEGER);
        preference_modules.inference_preference_module($DENOTES_UNIFY_ARG1_POS, $list30);
        preference_modules.inference_preference_module($DENOTES_UNIFY_ARG1_NEG, $list32);
        inference_modules.inference_removal_module($REMOVAL_DENOTES_CHECK_POS, $list34);
        inference_modules.inference_removal_module($REMOVAL_DENOTES_UNIFY_ARG1_POS, $list36);
        inference_modules.inference_removal_module($REMOVAL_DENOTES_UNIFY_ARG2_POS, $list38);
        inference_modules.inference_removal_module($REMOVAL_DENOTES_NEG, $list40);
        inference_modules.register_solely_specific_removal_module_predicate($$expresses);
        inference_modules.inference_removal_module_dont_use_universal($$expresses, $REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$expresses);
        preference_modules.doomed_unless_arg_bindable($NEG, $$expresses, TWO_INTEGER);
        preference_modules.inference_preference_module($EXPRESSES_UNIFY_ARG1_POS, $list42);
        preference_modules.inference_preference_module($EXPRESSES_UNIFY_ARG1_NEG, $list44);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSES_CHECK_POS, $list46);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSES_UNIFY_ARG1_POS, $list48);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSES_UNIFY_ARG2_POS, $list50);
        inference_modules.inference_removal_module($REMOVAL_EXPRESSES_NEG, $list52);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_denotes_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_denotes_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_denotes_file();
    }

    static {
        me = new removal_modules_denotes();
        $$means = makeConstSym(("means"));
        $REMOVAL_NON_WFF_CHECK_NEG = makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $MEANS_UNIFY_ARG1_POS = makeKeyword("MEANS-UNIFY-ARG1-POS");
        $list5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("means")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("means")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("DISPREFERRED"));
        $MEANS_UNIFY_ARG1_NEG = makeKeyword("MEANS-UNIFY-ARG1-NEG");
        $list7 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("means")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("means")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("DISPREFERRED"));
        $REMOVAL_MEANS_CHECK_POS = makeKeyword("REMOVAL-MEANS-CHECK-POS");
        $list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("means")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("means")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MEANS-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MEANS-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$means <fully-bound quoted term> <fully-bound>)"),
                makeKeyword("EXAMPLE"), makeString("(#$means (#$Quote #$Dog) #$Dog)\n(#$means #$MyFavoriteConstant #$Dog)\n(#$means (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n(#$means #$MyFavoriteSentence (#$isa #$Muffet #$Dog))") });
        $OPAQUE = makeKeyword("OPAQUE");
        $list11 = list(makeConstSym(("denotes")), makeConstSym(("expresses")));
        $$expresses = makeConstSym(("expresses"));
        $$denotes = makeConstSym(("denotes"));
        $$QuasiQuote = makeConstSym(("QuasiQuote"));
        $$Quote = makeConstSym(("Quote"));
        $GAF_ARG = makeKeyword("GAF-ARG");
        $GAF = makeKeyword("GAF");
        $PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
        $OVERLAP = makeKeyword("OVERLAP");
        $REMOVAL_MEANS_UNIFY_ARG1_POS = makeKeyword("REMOVAL-MEANS-UNIFY-ARG1-POS");
        $list21 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("means")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("means")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-MEANS-UNIFY-ARG1-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MEANS-UNIFY-ARG1-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$means <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$means <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), makeKeyword("EXAMPLE"), makeString(
                        "(#$means ?X #$Dog)\n    from assertion (#$denotes #$MyFavoriteConstant #$Dog)\n(#$means ?X (#$isa #$Muffet #$Dog))\n    from assertion (#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))\n(#$means ?X #$Dog)\n    as (#$denotes (#$Quote #$Dog) #$Dog)\n(#$means ?X (#$isa #$Muffet #$Dog))\n    as (#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n") });
        $REMOVAL_MEANS_UNIFY_ARG2_POS = makeKeyword("REMOVAL-MEANS-UNIFY-ARG2-POS");
        $list23 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("means")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("means")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MEANS-UNIFY-ARG2-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$means <fully-bound quoted-term> <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$means (#$Quote #$Dog) ?X)\n(#$means #$MyFavoriteConstant ?X)\n(#$means (#$Quote (#$isa #$Muffet #$Dog)) ?X)\n(#$means #$MyFavoriteSentence ?X)") });
        $REMOVAL_MEANS_NEG = makeKeyword("REMOVAL-MEANS-NEG");
        $list25 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("means")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("means")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER,
                makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MEANS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$means <anything> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString(
                        "(#$not (#$means #$Cat #$Dog))\n(#$not (#$means (#$Quote ?X) #$Dog))\n(#$not (#$means (#$Quote (#$EscapeQuote #$Cat)) #$Dog))\n(#$not (#$means #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$isa #$Muffet #$Cat) (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$Quote ?X) (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$Quote (#$EscapeQuote (#$isa #$Muffet #$Cat))) (#$isa #$Muffet #$Dog)))") });
        $$CycLTerm = makeConstSym(("CycLTerm"));
        $$CycLDenotationalTerm = makeConstSym(("CycLDenotationalTerm"));
        $$CycLSentence = makeConstSym(("CycLSentence"));
        $DENOTES_UNIFY_ARG1_POS = makeKeyword("DENOTES-UNIFY-ARG1-POS");
        $list30 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("denotes")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("denotes")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("DISPREFERRED"));
        $DENOTES_UNIFY_ARG1_NEG = makeKeyword("DENOTES-UNIFY-ARG1-NEG");
        $list32 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("denotes")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("denotes")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("DISPREFERRED"));
        $REMOVAL_DENOTES_CHECK_POS = makeKeyword("REMOVAL-DENOTES-CHECK-POS");
        $list34 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("denotes")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("denotes")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-DENOTES-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DENOTES-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$denotes <fully-bound quoted term> <fully-bound>)"),
                makeKeyword("EXAMPLE"), makeString("(#$denotes (#$Quote #$Dog) #$Dog)\n(#$denotes #$MyFavoriteConstant #$Dog)") });
        $REMOVAL_DENOTES_UNIFY_ARG1_POS = makeKeyword("REMOVAL-DENOTES-UNIFY-ARG1-POS");
        $list36 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("denotes")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("denotes")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-DENOTES-UNIFY-ARG1-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DENOTES-UNIFY-ARG1-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$denotes <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$denotes <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$denotes ?X #$Dog)\n    from assertion (#$denotes #$MyFavoriteConstant #$Dog)\n\n    (#$denotes ?X #$Dog)\n    as (#$denotes (#$Quote #$Dog) #$Dog)") });
        $REMOVAL_DENOTES_UNIFY_ARG2_POS = makeKeyword("REMOVAL-DENOTES-UNIFY-ARG2-POS");
        $list38 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("denotes")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("denotes")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DENOTES-UNIFY-ARG2-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$denotes <fully-bound quoted-term> <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$denotes (#$Quote #$Dog) ?X)\n    (#$denotes #$MyFavoriteConstant ?X)") });
        $REMOVAL_DENOTES_NEG = makeKeyword("REMOVAL-DENOTES-NEG");
        $list40 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("denotes")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("denotes")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER,
                makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DENOTES-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$denotes <anything> <fully-bound>))"), makeKeyword("EXAMPLE"),
                makeString("(#$not (#$denotes #$Cat #$Dog))\n(#$not (#$denotes #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$denotes (#$Quote ?X) #$Dog))\n(#$not (#$denotes (#$Quote (#$EscapeQuote #$Cat)) #$Dog))") });
        $EXPRESSES_UNIFY_ARG1_POS = makeKeyword("EXPRESSES-UNIFY-ARG1-POS");
        $list42 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("expresses")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("expresses")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("DISPREFERRED"));
        $EXPRESSES_UNIFY_ARG1_NEG = makeKeyword("EXPRESSES-UNIFY-ARG1-NEG");
        $list44 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("expresses")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("expresses")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("DISPREFERRED"));
        $REMOVAL_EXPRESSES_CHECK_POS = makeKeyword("REMOVAL-EXPRESSES-CHECK-POS");
        $list46 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("expresses")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("expresses")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-EXPRESSES-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSES-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expresses <fully-bound quoted term> <fully-bound>)"),
                makeKeyword("EXAMPLE"), makeString("(#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n(#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))") });
        $REMOVAL_EXPRESSES_UNIFY_ARG1_POS = makeKeyword("REMOVAL-EXPRESSES-UNIFY-ARG1-POS");
        $list48 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("expresses")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("expresses")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-EXPRESSES-UNIFY-ARG1-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSES-UNIFY-ARG1-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
                makeString("(#$expresses <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$expresses <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$expresses ?X (#$isa #$Muffet #$Dog))\n    from assertion (#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))\n\n(#$expresses ?X (#$isa #$Muffet #$Dog))\n    as (#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))") });
        $REMOVAL_EXPRESSES_UNIFY_ARG2_POS = makeKeyword("REMOVAL-EXPRESSES-UNIFY-ARG2-POS");
        $list50 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("expresses")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("expresses")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSES-UNIFY-ARG2-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$expresses <fully-bound quoted-term> <fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$expresses (#$Quote (#$isa #$Muffet #$Dog)) ?X)\n(#$expresses #$MyFavoriteSentence ?X)") });
        $REMOVAL_EXPRESSES_NEG = makeKeyword("REMOVAL-EXPRESSES-NEG");
        $list52 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("expresses")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("expresses")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"),
                ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXPRESSES-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$expresses <anything> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString(
                        "(#$not (#$expresses #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$isa #$Muffet #$Cat) (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$Quote ?X) (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$Quote (#$EscapeQuote (#$isa #$Muffet #$Cat))) (#$isa #$Muffet #$Dog)))") });
    }
}
/*
 *
 * Total time: 1134 ms
 *
 */