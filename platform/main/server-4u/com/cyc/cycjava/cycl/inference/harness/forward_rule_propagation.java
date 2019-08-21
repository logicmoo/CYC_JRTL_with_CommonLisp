package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg0;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.sefify;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$current_forward_problem_store$;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$noting_progress_delayed_mode_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$noting_progress_delayed_mode_string$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertions_interface;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_hl_support_handles;
import com.cyc.cycjava.cycl.kb_hl_supports_high;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class forward_rule_propagation extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new forward_rule_propagation();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.harness.forward_rule_propagation";


    // deflexical
    public static final SubLSymbol $forward_trigger_lazy_iteration_threshold$ = makeSymbol("*FORWARD-TRIGGER-LAZY-ITERATION-THRESHOLD*");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol $sym1$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");



    private static final SubLString $str3$Triggering_rule_against__A__S_sup = makeString("Triggering rule against ~A ~S support~:p: ~A");

    private static final SubLSymbol $sym4$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list5 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);





    private static final SubLString $str8$_A = makeString("~A");







    private static final SubLString $str12$time_to_use_a_real_query_iterator = makeString("time to use a real query iterator here");

    private static final SubLString $$$Determining_trigger_GAFs_for_ = makeString("Determining trigger GAFs for ");

    private static final SubLList $list14 = list(makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("RETURN"), makeKeyword("SUPPORTS"));



    private static final SubLSymbol FIRST_GAF_IN_SUPPORTS = makeSymbol("FIRST-GAF-IN-SUPPORTS");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");





    private static final SubLList $list20 = list(makeKeyword("BROWSABLE?"), T, makeKeyword("MAX-STEP"), FIVE_INTEGER, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ALLOWED-MODULES"), list(makeKeyword("NOT"), list(makeKeyword("OR"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL-CONJUNCTIVE")), $JOIN, makeKeyword("REMOVAL-PRED-UNBOUND"))));



    private static final SubLSymbol TACTIC_HL_MODULE_NAME = makeSymbol("TACTIC-HL-MODULE-NAME");



    private static final SubLString $str24$Can_t_determine_trigger_asent_for = makeString("Can't determine trigger asent for rule with split antecedent: ~S");

    private static final SubLString $str25$Can_t_determine_trigger_asent_for = makeString("Can't determine trigger asent for rule: ~S");

    private static final SubLString $str26$Can_t_create_inference_to_determi = makeString("Can't create inference to determine trigger asent for rule: ~S");



    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol $sym30$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLSymbol $sym31$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");





    private static final SubLList $list34 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("quotedIsa")));

    public static SubLObject forward_propagate_rule_via_trigger_gafs(final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        possibly_change_assertion_direction_to_forward_without_repropagation(rule);
        final SubLObject rule_string = format_cycl_expression.format_cycl_expression_to_string(assertions_high.assertion_ist_formula(rule), UNPROVIDED);
        final SubLObject before_dependents = assertions_high.assertion_dependent_count(rule);
        SubLObject sofar = ZERO_INTEGER;
        thread.resetMultipleValues();
        final SubLObject iterator = new_forward_rule_trigger_gaf_iterator(rule, propagation_mt);
        final SubLObject total = thread.secondMultipleValue();
        final SubLObject focal_asent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        assert NIL != subl_promotions.non_negative_integer_p(total) : "subl_promotions.non_negative_integer_p(total) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(total) " + total;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(format(NIL, $str3$Triggering_rule_against__A__S_sup, new SubLObject[]{ total, focal_asent, rule_string }));
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject trigger_gaf = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        SubLObject message_var = NIL;
                        final SubLObject was_appendingP = eval($sym4$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                        eval($list5);
                        try {
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        forward.repropagate_forward_gaf_wrt_rule(trigger_gaf, rule);
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                eval(list(CSETQ, $sym4$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                        if (message_var.isString()) {
                            Errors.warn($str8$_A, message_var);
                        }
                        sofar = add(sofar, ONE_INTEGER);
                        note_percent_progress(sofar, total);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        final SubLObject after_dependents = assertions_high.assertion_dependent_count(rule);
        final SubLObject new_dependents = subtract(after_dependents, before_dependents);
        return values(new_dependents, sofar);
    }

    public static SubLObject possibly_change_assertion_direction_to_forward_without_repropagation(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        if (NIL == assertions_high.forward_assertionP(assertion)) {
            assertions_interface.kb_set_assertion_direction(assertion, $FORWARD);
            return assertions_high.forward_assertionP(assertion);
        }
        return NIL;
    }

    public static SubLObject repropagate_trigger_gaf_against_rule(final SubLObject trigger_gaf, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = forward.$forward_inference_shares_same_problem_storeP$.currentBinding(thread);
        try {
            forward.$forward_inference_shares_same_problem_storeP$.bind(NIL, thread);
            final SubLObject environment = forward.get_forward_inference_environment();
            assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
            final SubLObject _prev_bind_0_$4 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $current_forward_problem_store$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                $current_forward_problem_store$.bind(NIL, thread);
                try {
                    result = forward.repropagate_forward_gaf_wrt_rule(trigger_gaf, rule);
                } finally {
                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        forward.clear_current_forward_problem_store();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                $current_forward_problem_store$.rebind(_prev_bind_2, thread);
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            forward.$forward_inference_shares_same_problem_storeP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject forward_rule_trigger_gafs(final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        thread.resetMultipleValues();
        final SubLObject focal_asent = forward_rule_trigger_asent(rule, propagation_mt);
        final SubLObject estimated_children = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != focal_asent) {
            return forward_rule_trigger_gafs_int(focal_asent, propagation_mt);
        }
        return NIL;
    }

    public static SubLObject new_forward_rule_trigger_gaf_iterator(final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        thread.resetMultipleValues();
        final SubLObject focal_asent = forward_rule_trigger_asent(rule, propagation_mt);
        final SubLObject estimated_children = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == focal_asent) {
            return iteration.new_list_iterator(NIL);
        }
        if ((!$forward_trigger_lazy_iteration_threshold$.getGlobalValue().isNumber()) || estimated_children.numLE($forward_trigger_lazy_iteration_threshold$.getGlobalValue())) {
            final SubLObject trigger_gafs = forward_rule_trigger_gafs_int(focal_asent, propagation_mt);
            return values(iteration.new_list_iterator(trigger_gafs), length(trigger_gafs), focal_asent);
        }
        return Errors.error($str12$time_to_use_a_real_query_iterator);
    }

    public static SubLObject forward_rule_trigger_gafs_int(final SubLObject focal_asent, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_result = NIL;
        SubLObject trigger_gafs = NIL;
        final SubLObject _prev_bind_0 = $noting_progress_delayed_mode_seconds$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $noting_progress_delayed_mode_string$.currentBinding(thread);
        try {
            $noting_progress_delayed_mode_seconds$.bind(TWO_INTEGER, thread);
            $noting_progress_delayed_mode_string$.bind(cconcatenate($$$Determining_trigger_GAFs_for_, format_nil.format_nil_s_no_copy(focal_asent)), thread);
            final SubLObject str = cconcatenate($$$Determining_trigger_GAFs_for_, format_nil.format_nil_s_no_copy(focal_asent));
            final SubLObject _prev_bind_0_$6 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_1_$7 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str);
                final SubLObject environment = forward.get_forward_inference_environment();
                assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
                final SubLObject _prev_bind_0_$7 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = $current_forward_problem_store$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                    $current_forward_problem_store$.bind(NIL, thread);
                    try {
                        final SubLObject overriding_query_properties = $list14;
                        final SubLObject query_properties = forward.forward_inference_query_properties(clauses.empty_clause(), overriding_query_properties);
                        query_result = inference_kernel.new_cyc_query(focal_asent, propagation_mt, query_properties);
                    } finally {
                        final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            forward.clear_current_forward_problem_store();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                } finally {
                    $current_forward_problem_store$.rebind(_prev_bind_1_$8, thread);
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$7, thread);
                }
                final SubLObject raw_trigger_gafs = remove_if(NULL, Mapping.mapcar(symbol_function(FIRST_GAF_IN_SUPPORTS), query_result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                trigger_gafs = assertion_utilities.sort_assertions(list_utilities.fast_delete_duplicates(raw_trigger_gafs, symbol_function(KBEQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_1_$7, thread);
                $progress_start_time$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            $noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
            $noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
        }
        return trigger_gafs;
    }

    public static SubLObject forward_rule_trigger_asent(final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject neg_lits = clauses.neg_lits(cnf);
        SubLObject trigger_asent = NIL;
        SubLObject estimated_children = NIL;
        if (NIL != neg_lits) {
            if (NIL != list_utilities.singletonP(neg_lits)) {
                trigger_asent = neg_lits.first();
                estimated_children = inference_utilities.literal_removal_cost(trigger_asent, $POS, propagation_mt, $ALL);
            } else {
                final SubLObject environment = forward.get_forward_inference_environment();
                assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
                final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $current_forward_problem_store$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                    $current_forward_problem_store$.bind(NIL, thread);
                    try {
                        final SubLObject query_dnf = clauses.make_dnf(NIL, obfuscate_non_trigger_literal_lits(neg_lits, rule, propagation_mt));
                        final SubLObject overriding_query_properties = $list20;
                        final SubLObject query_properties = forward.forward_inference_query_properties(clauses.empty_clause(), overriding_query_properties);
                        SubLObject inference = NIL;
                        try {
                            inference = nth_value_step_2(nth_value_step_1(TWO_INTEGER), inference_kernel.new_cyc_query_from_dnf(query_dnf, propagation_mt, NIL, query_properties));
                            if (NIL != inference) {
                                final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
                                final SubLObject root_problem = inference_datastructures_inference.inference_root_problem(inference);
                                final SubLObject executed_tactics = inference_datastructures_problem.problem_executed_tactics(root_problem);
                                final SubLObject join_ordered_tactic = find($JOIN_ORDERED, executed_tactics, symbol_function(EQ), symbol_function(TACTIC_HL_MODULE_NAME), UNPROVIDED, UNPROVIDED);
                                if (NIL != join_ordered_tactic) {
                                    final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_tactic_focal_problem(join_ordered_tactic);
                                    final SubLObject productivity = inference_worker.simple_problem_estimated_total_global_productivity(focal_problem, strategy);
                                    trigger_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(focal_problem);
                                    estimated_children = inference_datastructures_enumerated_types.number_of_children_for_productivity(productivity);
                                } else
                                    if (NIL != find($SPLIT, executed_tactics, symbol_function(EQ), symbol_function(TACTIC_HL_MODULE_NAME), UNPROVIDED, UNPROVIDED)) {
                                        Errors.warn($str24$Can_t_determine_trigger_asent_for, sefify(rule));
                                    } else {
                                        Errors.warn($str25$Can_t_determine_trigger_asent_for, sefify(rule));
                                    }

                            } else {
                                Errors.warn($str26$Can_t_create_inference_to_determi, sefify(rule));
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != inference) {
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            forward.clear_current_forward_problem_store();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                } finally {
                    $current_forward_problem_store$.rebind(_prev_bind_2, thread);
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return values(trigger_asent, estimated_children);
    }

    public static SubLObject obfuscate_non_trigger_literal_lits(final SubLObject lits, final SubLObject rule, final SubLObject propagation_mt) {
        final SubLObject non_trigger_literals = inference_worker_transformation.forward_rule_non_trigger_literals(rule, propagation_mt);
        SubLObject n = $int$100;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = lits;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == kb_utilities.kbeq($$evaluate, literal_predicate(lit, UNPROVIDED))) && ((NIL != kb_accessors.not_assertible_predicateP(literal_predicate(lit, UNPROVIDED), $$BaseKB)) || ((NIL != subl_promotions.memberP(lit, non_trigger_literals, symbol_function($sym30$EQUALS_EL_), UNPROVIDED)) && (NIL == variables.variable_p(literal_arg0(lit, UNPROVIDED)))))) {
                result = cons(replace_formula_arg(ZERO_INTEGER, variables.get_variable(n), lit), result);
                n = add(n, ONE_INTEGER);
            } else {
                result = cons(lit, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject forward_rule_initial_fanout(final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $$InferencePSC;
        }
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), forward_rule_trigger_asent(rule, propagation_mt));
    }

    public static SubLObject first_gaf_in_supports(final SubLObject supports) {
        SubLObject result = find_if(symbol_function($sym31$GAF_ASSERTION_), supports, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == result) && (NIL != list_utilities.singletonP(supports))) {
            final SubLObject justification = hl_supports.hl_justify(supports.first());
            if ((NIL != list_utilities.singletonP(justification)) && (NIL != assertions_high.gaf_assertionP(justification.first()))) {
                result = justification.first();
            }
        }
        if (NIL == result) {
            final SubLObject v_hl_supports = list_utilities.find_all_if(symbol_function(HL_SUPPORT_P), supports, UNPROVIDED);
            SubLObject isa_hl_supports = NIL;
            SubLObject cdolist_list_var = v_hl_supports;
            SubLObject hl_support = NIL;
            hl_support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($ISA == arguments.hl_support_module(hl_support)) {
                    isa_hl_supports = cons(hl_support, isa_hl_supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                hl_support = cdolist_list_var.first();
            } 
            if (NIL != list_utilities.singletonP(isa_hl_supports)) {
                final SubLObject isa_hl_support = isa_hl_supports.first();
                SubLObject isa_assertions = NIL;
                SubLObject cdolist_list_var2 = (NIL != kb_hl_support_handles.kb_hl_support_p(isa_hl_support)) ? kb_hl_supports_high.kb_hl_support_justification(isa_hl_support) : hl_supports.hl_justify(isa_hl_support);
                SubLObject support = NIL;
                support = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL != assertion_utilities.gaf_assertion_with_any_of_preds_p(support, $list34)) {
                        isa_assertions = cons(support, isa_assertions);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    support = cdolist_list_var2.first();
                } 
                if (NIL != list_utilities.singletonP(isa_assertions)) {
                    result = isa_assertions.first();
                }
            }
        }
        return result;
    }

    public static SubLObject declare_forward_rule_propagation_file() {
        declareFunction("forward_propagate_rule_via_trigger_gafs", "FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS", 1, 1, false);
        declareFunction("possibly_change_assertion_direction_to_forward_without_repropagation", "POSSIBLY-CHANGE-ASSERTION-DIRECTION-TO-FORWARD-WITHOUT-REPROPAGATION", 1, 0, false);
        declareFunction("repropagate_trigger_gaf_against_rule", "REPROPAGATE-TRIGGER-GAF-AGAINST-RULE", 2, 0, false);
        declareFunction("forward_rule_trigger_gafs", "FORWARD-RULE-TRIGGER-GAFS", 1, 1, false);
        declareFunction("new_forward_rule_trigger_gaf_iterator", "NEW-FORWARD-RULE-TRIGGER-GAF-ITERATOR", 1, 1, false);
        declareFunction("forward_rule_trigger_gafs_int", "FORWARD-RULE-TRIGGER-GAFS-INT", 2, 0, false);
        declareFunction("forward_rule_trigger_asent", "FORWARD-RULE-TRIGGER-ASENT", 1, 1, false);
        declareFunction("obfuscate_non_trigger_literal_lits", "OBFUSCATE-NON-TRIGGER-LITERAL-LITS", 3, 0, false);
        declareFunction("forward_rule_initial_fanout", "FORWARD-RULE-INITIAL-FANOUT", 1, 1, false);
        declareFunction("first_gaf_in_supports", "FIRST-GAF-IN-SUPPORTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_forward_rule_propagation_file() {
        deflexical("*FORWARD-TRIGGER-LAZY-ITERATION-THRESHOLD*", NIL);
        return NIL;
    }

    public static SubLObject setup_forward_rule_propagation_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_forward_rule_propagation_file();
    }

    @Override
    public void initializeVariables() {
        init_forward_rule_propagation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_forward_rule_propagation_file();
    }

    static {





































    }
}

/**
 * Total time: 265 ms
 */
