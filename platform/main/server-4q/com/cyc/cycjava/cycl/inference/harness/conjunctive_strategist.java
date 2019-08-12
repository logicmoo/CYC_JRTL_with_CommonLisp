package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class conjunctive_strategist extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new conjunctive_strategist();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.harness.conjunctive_strategist";


    // deflexical
    private static final SubLSymbol $conjunctive_strategist_properties$ = makeSymbol("*CONJUNCTIVE-STRATEGIST-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $conjunctive_strategist_removal_properties$ = makeSymbol("*CONJUNCTIVE-STRATEGIST-REMOVAL-PROPERTIES*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLString $str1$_S_was_not_a_conjunction = makeString("~S was not a conjunction");

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLList $list3 = cons(makeSymbol("FIRST-EL-VAR"), makeSymbol("REST-EL-VARS"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLString $str5$_S_was_not_a_conjunction_of_liter = makeString("~S was not a conjunction of literals");

    private static final SubLList $list6 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("EnglishMt")), list(reader_make_constant_shell(makeString("givenNames")), makeSymbol("?VAR0"), makeSymbol("?VAR1"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("prefixSubstring")), makeString("Ke"), makeSymbol("?VAR1"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("suffixSubstring")), makeString("n"), makeSymbol("?VAR1"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR0"), reader_make_constant_shell(makeString("HumanCyclist")))));

    private static final SubLList $list7 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR0"), reader_make_constant_shell(makeString("HumanCyclist")))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("EnglishMt")), list(reader_make_constant_shell(makeString("givenNames")), makeSymbol("?VAR0"), makeSymbol("?VAR1"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("prefixSubstring")), makeString("Ke"), makeSymbol("?VAR1"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("suffixSubstring")), makeString("n"), makeSymbol("?VAR1"))));

    private static final SubLString $str8$time_to_implement_ORDER_CONJUNCTI = makeString("time to implement ORDER-CONJUNCTIVE-CONTEXTUALIZED-HL-QUERY-WRT-REMOVAL");

    private static final SubLString $str9$ignoring_unhandled_properties____ = makeString("ignoring unhandled properties:~%~S");

    private static final SubLSymbol $INFERENCE_ABORT_TARGET = makeKeyword("INFERENCE-ABORT-TARGET");

    private static final SubLSymbol $QUERY_HALT = makeKeyword("QUERY-HALT");







    private static final SubLSymbol INFERENCE_ERROR_HANDLER = makeSymbol("INFERENCE-ERROR-HANDLER");



    private static final SubLList $list17 = list(makeSymbol("NEXT-LITERAL"), makeSymbol("&REST"), makeSymbol("REST-LITERALS"));



    private static final SubLList $list19 = list(makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("PRODUCTIVITY-LIMIT"));

    private static final SubLList $list20 = list(makeSymbol("IST"), makeSymbol("MT"), makeSymbol("HL-LITERAL"));

    private static final SubLSymbol CONTEXTUALIZE_CONJUNCTIVE_QUERY = makeSymbol("CONTEXTUALIZE-CONJUNCTIVE-QUERY");







    private static final SubLList $list25 = list(makeSymbol("CONJUNCTIVE-STRATEGIST"));







    private static final SubLList $list29 = list(list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("EnglishMt")), list(reader_make_constant_shell(makeString("givenNames")), makeSymbol("?CYCLIST"), makeSymbol("?NAME"))), list(reader_make_constant_shell(makeString("prefixSubstring")), makeString("Ke"), makeSymbol("?NAME")), list(reader_make_constant_shell(makeString("suffixSubstring")), makeString("n"), makeSymbol("?NAME")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?CYCLIST"), reader_make_constant_shell(makeString("HumanCyclist")))), reader_make_constant_shell(makeString("CyclistsMt"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("EnglishMt")), list(reader_make_constant_shell(makeString("givenNames")), makeSymbol("?CYCLIST"), makeSymbol("?NAME"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("prefixSubstring")), makeString("Ke"), makeSymbol("?NAME"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("suffixSubstring")), makeString("n"), makeSymbol("?NAME"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?CYCLIST"), reader_make_constant_shell(makeString("HumanCyclist")))))));

    private static final SubLSymbol TEST_CANONICALIZE_CONJUNCTIVE_CONTEXTUALIZED_QUERY = makeSymbol("TEST-CANONICALIZE-CONJUNCTIVE-CONTEXTUALIZED-QUERY");

    private static final SubLList $list31 = list(list(list(list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("EnglishMt")), list(reader_make_constant_shell(makeString("givenNames")), makeSymbol("?CYCLIST"), makeSymbol("?NAME"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("prefixSubstring")), makeString("Ke"), makeSymbol("?NAME"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("suffixSubstring")), makeString("n"), makeSymbol("?NAME"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?CYCLIST"), reader_make_constant_shell(makeString("HumanCyclist")))))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("EnglishMt")), list(reader_make_constant_shell(makeString("givenNames")), makeSymbol("?VAR0"), makeSymbol("?VAR1"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("prefixSubstring")), makeString("Ke"), makeSymbol("?VAR1"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("suffixSubstring")), makeString("n"), makeSymbol("?VAR1"))), list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?VAR0"), reader_make_constant_shell(makeString("HumanCyclist"))))), list(cons(makeSymbol("?VAR0"), makeSymbol("?CYCLIST")), cons(makeSymbol("?VAR1"), makeSymbol("?NAME"))), list(makeSymbol("?VAR0"), makeSymbol("?VAR1"))));

    public static SubLObject new_cyc_conjunctive_query(final SubLObject query, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject contextualized_query = contextualize_conjunctive_query(query, mt);
        return new_cyc_conjunctive_contextualized_query(contextualized_query, query_properties);
    }

    public static SubLObject new_cyc_ordered_conjunctive_query(final SubLObject ordered_query, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject ordered_contextualized_query = contextualize_conjunctive_query(ordered_query, mt);
        return new_cyc_ordered_conjunctive_contextualized_query(ordered_contextualized_query, query_properties);
    }

    public static SubLObject contextualize_conjunctive_query(final SubLObject query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BaseKB;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject closed_el_vars = el_unwrap_existentials(query);
        final SubLObject conjunction = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == el_conjunction_p(conjunction))) {
            Errors.error($str1$_S_was_not_a_conjunction, query);
        }
        final SubLObject el_literals = cycl_utilities.el_formula_args(conjunction, UNPROVIDED);
        SubLObject el_ist_literals = NIL;
        SubLObject cdolist_list_var = el_literals;
        SubLObject el_literal = NIL;
        el_literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject new_el_literal = czer_utilities.unwrap_if_ist(el_literal, mt, UNPROVIDED);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject el_ist_literal = make_binary_formula($$ist, new_mt, new_el_literal);
            el_ist_literals = cons(el_ist_literal, el_ist_literals);
            cdolist_list_var = cdolist_list_var.rest();
            el_literal = cdolist_list_var.first();
        } 
        final SubLObject el_ist_conjunction = make_conjunction(nreverse(el_ist_literals));
        return el_wrap_existentials(closed_el_vars, el_ist_conjunction);
    }

    public static SubLObject el_unwrap_existentials(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_existential_p(sentence)) {
            final SubLObject closed_el_var = cycl_utilities.el_formula_arg1(sentence, UNPROVIDED);
            final SubLObject subsentence = cycl_utilities.el_formula_arg2(sentence, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject closed_el_vars = el_unwrap_existentials(subsentence);
            final SubLObject unwrapped_sentence = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(cons(closed_el_var, closed_el_vars), unwrapped_sentence);
        }
        return values(NIL, sentence);
    }

    public static SubLObject el_wrap_existentials(final SubLObject closed_el_vars, final SubLObject sentence) {
        if (NIL != closed_el_vars) {
            SubLObject first_el_var = NIL;
            SubLObject rest_el_vars = NIL;
            destructuring_bind_must_consp(closed_el_vars, closed_el_vars, $list3);
            first_el_var = closed_el_vars.first();
            final SubLObject current = rest_el_vars = closed_el_vars.rest();
            final SubLObject wrapped_sentence = el_wrap_existentials(rest_el_vars, sentence);
            return make_binary_formula($$thereExists, first_el_var, wrapped_sentence);
        }
        return sentence;
    }

    public static SubLObject new_cyc_conjunctive_contextualized_query(final SubLObject query, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject hl_query = canonicalize_conjunctive_contextualized_query(query);
        final SubLObject hl_variable_map = thread.secondMultipleValue();
        final SubLObject free_hl_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject hl_results = new_cyc_conjunctive_contextualized_hl_query(hl_query, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject cycl_result = bindings.apply_bindings(hl_variable_map, hl_results);
        return values(cycl_result, halt_reason);
    }

    public static SubLObject new_cyc_ordered_conjunctive_contextualized_query(final SubLObject ordered_query, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject ordered_hl_query = canonicalize_conjunctive_contextualized_query(ordered_query);
        final SubLObject hl_variable_map = thread.secondMultipleValue();
        final SubLObject free_hl_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject hl_results = new_cyc_ordered_conjunctive_contextualized_hl_query(ordered_hl_query, query_properties);
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject cycl_result = bindings.apply_bindings(hl_variable_map, hl_results);
        return values(cycl_result, halt_reason);
    }

    public static SubLObject canonicalize_conjunctive_contextualized_query(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence_clauses = inference_czer.inference_canonicalize_ask_int(query, $$BaseKB, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
        final SubLObject el_variable_map = thread.secondMultipleValue();
        final SubLObject free_el_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(sentence_clauses))) {
            Errors.error($str5$_S_was_not_a_conjunction_of_liter, query);
        }
        final SubLObject el_conjunction = nth_value_step_2(nth_value_step_1(ONE_INTEGER), el_unwrap_existentials(query));
        SubLObject hl_conjunction = bindings.apply_bindings(el_variable_map, el_conjunction);
        final SubLObject hl_variable_map = bindings.invert_bindings(el_variable_map);
        final SubLObject free_hl_vars = bindings.apply_bindings(el_variable_map, free_el_vars);
        hl_conjunction = narts_high.nart_substitute(hl_conjunction);
        return values(hl_conjunction, hl_variable_map, free_hl_vars);
    }

    public static SubLObject new_cyc_conjunctive_contextualized_hl_query(final SubLObject hl_query, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject ordered_hl_query = order_conjunctive_contextualized_hl_query_wrt_removal(hl_query);
        return new_cyc_ordered_conjunctive_contextualized_hl_query(ordered_hl_query, query_properties);
    }

    public static SubLObject order_conjunctive_contextualized_hl_query_wrt_removal(final SubLObject hl_query) {
        if (hl_query.equal(variables.canonicalize_default_el_vars($list6))) {
            return variables.canonicalize_default_el_vars($list7);
        }
        return Errors.error($str8$time_to_implement_ORDER_CONJUNCTI);
    }

    public static SubLObject new_cyc_ordered_conjunctive_contextualized_hl_query(final SubLObject ordered_hl_query, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject strategist_properties = categorize_query_properties_wrt_conjunctive_strategist(query_properties);
        final SubLObject removal_properties = thread.secondMultipleValue();
        final SubLObject ignored_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != $inference_debugP$.getDynamicValue(thread)) && (NIL != ignored_properties)) {
            Errors.warn($str9$ignoring_unhandled_properties____, ignored_properties);
        }
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        final SubLObject metrics = NIL;
        final SubLObject max_time = inference_datastructures_enumerated_types.inference_properties_max_time(strategist_properties);
        final SubLObject max_number = inference_datastructures_enumerated_types.inference_properties_max_number(strategist_properties);
        final SubLObject productivity_limit = inference_datastructures_enumerated_types.strategy_dynamic_properties_productivity_limit(strategist_properties);
        final SubLObject hl_literals = cycl_utilities.el_formula_args(ordered_hl_query, UNPROVIDED);
        final SubLObject result_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject result_queue = queues.create_queue(UNPROVIDED);
        final SubLObject _prev_bind_0 = inference_trivial.$current_query_properties$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_worker.$currently_active_problem$.currentBinding(thread);
        final SubLObject _prev_bind_3 = inference_worker.$currently_executing_tactics$.currentBinding(thread);
        try {
            inference_trivial.$current_query_properties$.bind(query_properties, thread);
            inference_worker.$currently_active_problem$.bind(NIL, thread);
            inference_worker.$currently_executing_tactics$.bind(NIL, thread);
            SubLObject aborted_p = NIL;
            try {
                thread.throwStack.push($INFERENCE_ABORT_TARGET);
                final SubLObject _prev_bind_0_$1 = inference_strategist.$within_inference_control_processP$.currentBinding(thread);
                try {
                    inference_strategist.$within_inference_control_processP$.bind(T, thread);
                    SubLObject error_message = NIL;
                    if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                        try {
                            thread.throwStack.push($QUERY_HALT);
                            final SubLObject abort_max_time = max_time;
                            if (NIL != abort_max_time) {
                                SubLObject timed_out = NIL;
                                final SubLObject tag = with_timeout_make_tag();
                                try {
                                    thread.throwStack.push(tag);
                                    final SubLObject _prev_bind_0_$2 = $within_with_timeout$.currentBinding(thread);
                                    try {
                                        $within_with_timeout$.bind(T, thread);
                                        SubLObject timer = NIL;
                                        try {
                                            final SubLObject _prev_bind_0_$3 = $with_timeout_nesting_depth$.currentBinding(thread);
                                            try {
                                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                timer = with_timeout_start_timer(abort_max_time, tag);
                                                final SubLObject local_state;
                                                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                                                final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
                                                try {
                                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                    try {
                                                        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                                        final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$6 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$7 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                        final SubLObject _prev_bind_4 = $removal_cost_cutoff$.currentBinding(thread);
                                                        try {
                                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                            $removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                                            process_conjunctive_removal_hl_query_recursive(NIL, NIL, hl_literals, result_set, result_queue, ZERO_INTEGER, max_number, removal_properties);
                                                            halt_reason = $EXHAUST_TOTAL;
                                                        } finally {
                                                            $removal_cost_cutoff$.rebind(_prev_bind_4, thread);
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$7, thread);
                                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$6, thread);
                                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$5, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                                        }
                                                    }
                                                } finally {
                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
                                                }
                                            } finally {
                                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$3, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                with_timeout_stop_timer(timer);
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        }
                                    } finally {
                                        $within_with_timeout$.rebind(_prev_bind_0_$2, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (NIL != timed_out) {
                                    halt_reason = $MAX_TIME;
                                }
                            } else {
                                final SubLObject local_state2;
                                final SubLObject state2 = local_state2 = memoization_state.possibly_new_memoization_state();
                                final SubLObject _prev_bind_0_$8 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state2, thread);
                                    final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process(local_state2);
                                    try {
                                        final SubLObject already_resourcing_p2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                        final SubLObject _prev_bind_0_$9 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$7 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$8 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = $removal_cost_cutoff$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p2, SIX_INTEGER), thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p2), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                            $removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                            process_conjunctive_removal_hl_query_recursive(NIL, NIL, hl_literals, result_set, result_queue, ZERO_INTEGER, max_number, removal_properties);
                                            halt_reason = $EXHAUST_TOTAL;
                                        } finally {
                                            $removal_cost_cutoff$.rebind(_prev_bind_5, thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$8, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$7, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                        } catch (final Throwable ccatch_env_var2) {
                            halt_reason = Errors.handleThrowable(ccatch_env_var2, $QUERY_HALT);
                        } finally {
                            thread.throwStack.pop();
                        }
                    } else {
                        try {
                            thread.throwStack.push($INFERENCE_ERROR);
                            final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(INFERENCE_ERROR_HANDLER), thread);
                                try {
                                    try {
                                        thread.throwStack.push($QUERY_HALT);
                                        final SubLObject abort_max_time2 = max_time;
                                        if (NIL != abort_max_time2) {
                                            SubLObject timed_out2 = NIL;
                                            final SubLObject tag2 = with_timeout_make_tag();
                                            try {
                                                thread.throwStack.push(tag2);
                                                final SubLObject _prev_bind_0_$12 = $within_with_timeout$.currentBinding(thread);
                                                try {
                                                    $within_with_timeout$.bind(T, thread);
                                                    SubLObject timer2 = NIL;
                                                    try {
                                                        final SubLObject _prev_bind_0_$13 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                        try {
                                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                            timer2 = with_timeout_start_timer(abort_max_time2, tag2);
                                                            final SubLObject local_state3;
                                                            final SubLObject state3 = local_state3 = memoization_state.possibly_new_memoization_state();
                                                            final SubLObject _prev_bind_0_$14 = memoization_state.$memoization_state$.currentBinding(thread);
                                                            try {
                                                                memoization_state.$memoization_state$.bind(local_state3, thread);
                                                                final SubLObject original_memoization_process3 = memoization_state.memoization_state_original_process(local_state3);
                                                                try {
                                                                    final SubLObject already_resourcing_p3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                                                    final SubLObject _prev_bind_0_$15 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$8 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2_$9 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_6 = $removal_cost_cutoff$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p3, SIX_INTEGER), thread);
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p3), thread);
                                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                                        $removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                                                        process_conjunctive_removal_hl_query_recursive(NIL, NIL, hl_literals, result_set, result_queue, ZERO_INTEGER, max_number, removal_properties);
                                                                        halt_reason = $EXHAUST_TOTAL;
                                                                    } finally {
                                                                        $removal_cost_cutoff$.rebind(_prev_bind_6, thread);
                                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$9, thread);
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$8, thread);
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$15, thread);
                                                                    }
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values4 = getValuesAsVector();
                                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state3, original_memoization_process3);
                                                                        restoreValuesFromVector(_values4);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$14, thread);
                                                            }
                                                        } finally {
                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$13, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values5 = getValuesAsVector();
                                                            with_timeout_stop_timer(timer2);
                                                            restoreValuesFromVector(_values5);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                                        }
                                                    }
                                                } finally {
                                                    $within_with_timeout$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            } catch (final Throwable ccatch_env_var3) {
                                                timed_out2 = Errors.handleThrowable(ccatch_env_var3, tag2);
                                            } finally {
                                                thread.throwStack.pop();
                                            }
                                            if (NIL != timed_out2) {
                                                halt_reason = $MAX_TIME;
                                            }
                                        } else {
                                            final SubLObject local_state4;
                                            final SubLObject state4 = local_state4 = memoization_state.possibly_new_memoization_state();
                                            final SubLObject _prev_bind_0_$18 = memoization_state.$memoization_state$.currentBinding(thread);
                                            try {
                                                memoization_state.$memoization_state$.bind(local_state4, thread);
                                                final SubLObject original_memoization_process4 = memoization_state.memoization_state_original_process(local_state4);
                                                try {
                                                    final SubLObject already_resourcing_p4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                                    final SubLObject _prev_bind_0_$19 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$9 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$10 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                    final SubLObject _prev_bind_7 = $removal_cost_cutoff$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p4, SIX_INTEGER), thread);
                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p4), thread);
                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                        $removal_cost_cutoff$.bind(inference_datastructures_enumerated_types.removal_cost_cutoff_for_productivity(productivity_limit), thread);
                                                        process_conjunctive_removal_hl_query_recursive(NIL, NIL, hl_literals, result_set, result_queue, ZERO_INTEGER, max_number, removal_properties);
                                                        halt_reason = $EXHAUST_TOTAL;
                                                    } finally {
                                                        $removal_cost_cutoff$.rebind(_prev_bind_7, thread);
                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$10, thread);
                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$9, thread);
                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$19, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values6 = getValuesAsVector();
                                                        memoization_state.memoization_state_possibly_clear_original_process(local_state4, original_memoization_process4);
                                                        restoreValuesFromVector(_values6);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                                    }
                                                }
                                            } finally {
                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$18, thread);
                                            }
                                        }
                                    } catch (final Throwable ccatch_env_var4) {
                                        halt_reason = Errors.handleThrowable(ccatch_env_var4, $QUERY_HALT);
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$11, thread);
                            }
                        } catch (final Throwable ccatch_env_var2) {
                            error_message = Errors.handleThrowable(ccatch_env_var2, $INFERENCE_ERROR);
                        } finally {
                            thread.throwStack.pop();
                        }
                    }
                    if (NIL != error_message) {
                        halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message);
                    }
                } finally {
                    inference_strategist.$within_inference_control_processP$.rebind(_prev_bind_0_$1, thread);
                }
            } catch (final Throwable ccatch_env_var5) {
                aborted_p = Errors.handleThrowable(ccatch_env_var5, $INFERENCE_ABORT_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != aborted_p) {
                halt_reason = $ABORT;
                inference_strategist.query_abort();
            }
        } finally {
            inference_worker.$currently_executing_tactics$.rebind(_prev_bind_3, thread);
            inference_worker.$currently_active_problem$.rebind(_prev_bind_2, thread);
            inference_trivial.$current_query_properties$.rebind(_prev_bind_0, thread);
        }
        result = queues.queue_elements(result_queue);
        return values(result, halt_reason, metrics);
    }

    public static SubLObject process_conjunctive_removal_hl_query_recursive(final SubLObject new_bindings, final SubLObject old_bindings, final SubLObject hl_literals, final SubLObject result_set, final SubLObject result_queue, final SubLObject depth, SubLObject max_number, SubLObject query_properties) {
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        SubLObject next_literal = NIL;
        destructuring_bind_must_consp(hl_literals, hl_literals, $list17);
        next_literal = hl_literals.first();
        final SubLObject rest_literals;
        final SubLObject current = rest_literals = hl_literals.rest();
        final SubLObject situated_next_literal = bindings.apply_bindings(new_bindings, next_literal);
        final SubLObject situated_rest_literals = bindings.apply_bindings(new_bindings, rest_literals);
        SubLObject cdolist_list_var;
        final SubLObject next_literal_result = cdolist_list_var = conjunctive_removal_literal_result(situated_next_literal, query_properties);
        SubLObject next_bindings = NIL;
        next_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != bindings.unification_success_token_p(next_bindings)) {
                next_bindings = NIL;
            }
            final SubLObject extended_old_bindings = extend_bindings(new_bindings, old_bindings);
            if (NIL != rest_literals) {
                process_conjunctive_removal_hl_query_recursive(next_bindings, extended_old_bindings, situated_rest_literals, result_set, result_queue, number_utilities.f_1X(depth), max_number, query_properties);
            } else {
                SubLObject final_bindings = extend_bindings(next_bindings, extended_old_bindings);
                final_bindings = nreverse(copy_tree(final_bindings));
                if (NIL == set.set_memberP(final_bindings, result_set)) {
                    set.set_add(final_bindings, result_set);
                    queues.enqueue(final_bindings, result_queue);
                    if ((NIL != max_number) && queues.queue_size(result_queue).numGE(max_number)) {
                        sublisp_throw($QUERY_HALT, $MAX_NUMBER);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            next_bindings = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject categorize_query_properties_wrt_conjunctive_strategist(final SubLObject query_properties) {
        SubLObject strategist_properties = NIL;
        SubLObject removal_properties = NIL;
        SubLObject ignored_properties = NIL;
        SubLObject remainder;
        SubLObject query_property;
        SubLObject value;
        for (remainder = NIL, remainder = query_properties; NIL != remainder; remainder = cddr(remainder)) {
            query_property = remainder.first();
            value = cadr(remainder);
            if (NIL != list_utilities.member_eqP(query_property, $conjunctive_strategist_properties$.getGlobalValue())) {
                strategist_properties = putf(strategist_properties, query_property, value);
            } else
                if (NIL != list_utilities.member_eqP(query_property, $conjunctive_strategist_removal_properties$.getGlobalValue())) {
                    removal_properties = putf(removal_properties, query_property, value);
                } else {
                    ignored_properties = putf(ignored_properties, query_property, value);
                }

        }
        return values(strategist_properties, removal_properties, ignored_properties);
    }

    public static SubLObject conjunctive_removal_literal_result(final SubLObject situated_hl_literal, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ist = NIL;
        SubLObject mt = NIL;
        SubLObject hl_literal = NIL;
        destructuring_bind_must_consp(situated_hl_literal, situated_hl_literal, $list20);
        ist = situated_hl_literal.first();
        SubLObject current = situated_hl_literal.rest();
        destructuring_bind_must_consp(current, situated_hl_literal, $list20);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, situated_hl_literal, $list20);
        hl_literal = current.first();
        current = current.rest();
        if (NIL == current) {
            list_utilities.verify_operator(ist, $$ist);
            final SubLObject asent = literal_atomic_sentence(hl_literal);
            final SubLObject truth = literal_truth(hl_literal);
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
            try {
                cycl_grammar.$grammar_uses_kbP$.bind(NIL, thread);
                result = backward.removal_ask_bindings(asent, mt, truth, query_properties);
            } finally {
                cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        cdestructuring_bind_error(situated_hl_literal, $list20);
        return NIL;
    }

    public static SubLObject extend_bindings(SubLObject new_bindings, SubLObject old_bindings) {
        if (NIL != new_bindings) {
            new_bindings = copy_list(new_bindings);
            old_bindings = nextend_bindings(new_bindings, old_bindings);
        }
        return old_bindings;
    }

    public static SubLObject nextend_bindings(final SubLObject new_bindings, final SubLObject old_bindings) {
        return nconc(new_bindings, old_bindings);
    }

    public static SubLObject test_canonicalize_conjunctive_contextualized_query(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject hl_query = canonicalize_conjunctive_contextualized_query(query);
        final SubLObject hl_variable_map = thread.secondMultipleValue();
        final SubLObject free_hl_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(variables.uncanonicalize_hl_vars(hl_query), variables.uncanonicalize_hl_vars(hl_variable_map), variables.uncanonicalize_hl_vars(free_hl_vars));
    }

    public static SubLObject declare_conjunctive_strategist_file() {
        declareFunction("new_cyc_conjunctive_query", "NEW-CYC-CONJUNCTIVE-QUERY", 1, 2, false);
        declareFunction("new_cyc_ordered_conjunctive_query", "NEW-CYC-ORDERED-CONJUNCTIVE-QUERY", 1, 2, false);
        declareFunction("contextualize_conjunctive_query", "CONTEXTUALIZE-CONJUNCTIVE-QUERY", 1, 1, false);
        declareFunction("el_unwrap_existentials", "EL-UNWRAP-EXISTENTIALS", 1, 0, false);
        declareFunction("el_wrap_existentials", "EL-WRAP-EXISTENTIALS", 2, 0, false);
        declareFunction("new_cyc_conjunctive_contextualized_query", "NEW-CYC-CONJUNCTIVE-CONTEXTUALIZED-QUERY", 1, 1, false);
        declareFunction("new_cyc_ordered_conjunctive_contextualized_query", "NEW-CYC-ORDERED-CONJUNCTIVE-CONTEXTUALIZED-QUERY", 1, 1, false);
        declareFunction("canonicalize_conjunctive_contextualized_query", "CANONICALIZE-CONJUNCTIVE-CONTEXTUALIZED-QUERY", 1, 0, false);
        declareFunction("new_cyc_conjunctive_contextualized_hl_query", "NEW-CYC-CONJUNCTIVE-CONTEXTUALIZED-HL-QUERY", 1, 1, false);
        declareFunction("order_conjunctive_contextualized_hl_query_wrt_removal", "ORDER-CONJUNCTIVE-CONTEXTUALIZED-HL-QUERY-WRT-REMOVAL", 1, 0, false);
        declareFunction("new_cyc_ordered_conjunctive_contextualized_hl_query", "NEW-CYC-ORDERED-CONJUNCTIVE-CONTEXTUALIZED-HL-QUERY", 1, 1, false);
        declareFunction("process_conjunctive_removal_hl_query_recursive", "PROCESS-CONJUNCTIVE-REMOVAL-HL-QUERY-RECURSIVE", 6, 2, false);
        declareFunction("categorize_query_properties_wrt_conjunctive_strategist", "CATEGORIZE-QUERY-PROPERTIES-WRT-CONJUNCTIVE-STRATEGIST", 1, 0, false);
        declareFunction("conjunctive_removal_literal_result", "CONJUNCTIVE-REMOVAL-LITERAL-RESULT", 1, 1, false);
        declareFunction("extend_bindings", "EXTEND-BINDINGS", 2, 0, false);
        declareFunction("nextend_bindings", "NEXTEND-BINDINGS", 2, 0, false);
        declareFunction("test_canonicalize_conjunctive_contextualized_query", "TEST-CANONICALIZE-CONJUNCTIVE-CONTEXTUALIZED-QUERY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_conjunctive_strategist_file() {
        deflexical("*CONJUNCTIVE-STRATEGIST-PROPERTIES*", $list19);
        deflexical("*CONJUNCTIVE-STRATEGIST-REMOVAL-PROPERTIES*", NIL);
        return NIL;
    }

    public static SubLObject setup_conjunctive_strategist_file() {
        define_test_case_table_int(CONTEXTUALIZE_CONJUNCTIVE_QUERY, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list25, $KB, $FULL, $WORKING_, T }), $list29);
        define_test_case_table_int(TEST_CANONICALIZE_CONJUNCTIVE_CONTEXTUALIZED_QUERY, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list25, $KB, $FULL, $WORKING_, T }), $list31);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_conjunctive_strategist_file();
    }

    @Override
    public void initializeVariables() {
        init_conjunctive_strategist_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_conjunctive_strategist_file();
    }

    static {



































    }
}

/**
 * Total time: 683 ms
 */
