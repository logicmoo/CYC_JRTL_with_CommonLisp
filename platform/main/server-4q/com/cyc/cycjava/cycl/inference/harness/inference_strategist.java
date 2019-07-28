package com.cyc.cycjava.cycl.inference.harness;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.inference.forward_propagate_assertions;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.kb_access_metering;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$cached_ask_result_direction$;
import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.inference.harness.inference_strategist.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class inference_strategist extends SubLTranslatedFile {
    public static final SubLFile me = new inference_strategist();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_strategist";

    public static final String myFingerPrint = "ad9b6926f1de0f9205210dd73d2f938b63b877703e1aaacc06770c332271f009";

    // defvar
    public static final SubLSymbol $recursive_queries_in_currently_active_problem_storeP$ = makeSymbol("*RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?*");

    // defparameter
    public static final SubLSymbol $within_inference_control_processP$ = makeSymbol("*WITHIN-INFERENCE-CONTROL-PROCESS?*");

    // defparameter
    /**
     * Temporary control variable; whether or not :MAX-TIME is enforced via
     * timeouts.
     */
    private static final SubLSymbol $inference_max_time_timeout_enabledP$ = makeSymbol("*INFERENCE-MAX-TIME-TIMEOUT-ENABLED?*");

    // deflexical
    // The problem query that expresses a tautology.
    private static final SubLSymbol $tautology_problem_query$ = makeSymbol("*TAUTOLOGY-PROBLEM-QUERY*");

    // deflexical
    // The problem query that expresses a contradiction.
    private static final SubLSymbol $contradiction_problem_query$ = makeSymbol("*CONTRADICTION-PROBLEM-QUERY*");

    // defparameter
    private static final SubLSymbol $preparing_inferenceP$ = makeSymbol("*PREPARING-INFERENCE?*");

    // defvar
    /**
     * The strategy type to use unless there is a better one for a particular type
     * of inference.
     */
    private static final SubLSymbol $default_strategy_type$ = makeSymbol("*DEFAULT-STRATEGY-TYPE*");

    // defvar
    /**
     * The strategy type that is best suited for removal-only zero-backchain asks
     * with no number or time cutoffs.
     */
    private static final SubLSymbol $exhaustive_removal_strategy_type$ = makeSymbol("*EXHAUSTIVE-REMOVAL-STRATEGY-TYPE*");

    // defvar
    // The strategy type that is best suited for forward inference.
    private static final SubLSymbol $forward_strategy_type$ = makeSymbol("*FORWARD-STRATEGY-TYPE*");

    // defparameter
    /**
     * Once an inference has achieved this many proofs, we consider pruning
     * processed proofs.
     */
    public static final SubLSymbol $processed_proof_pruning_initial_threshold$ = makeSymbol("*PROCESSED-PROOF-PRUNING-INITIAL-THRESHOLD*");

    // defparameter
    /**
     * After the initial pruning threshold is met, we prune processed proofs again
     * every time we get this many new proofs.
     */
    public static final SubLSymbol $processed_proof_pruning_frequency$ = makeSymbol("*PROCESSED-PROOF-PRUNING-FREQUENCY*");

    // defparameter
    public static final SubLSymbol $current_inference_answer_being_cached$ = makeSymbol("*CURRENT-INFERENCE-ANSWER-BEING-CACHED*");

    // defparameter
    public static final SubLSymbol $current_inference_answer_justification_proof_being_cached$ = makeSymbol("*CURRENT-INFERENCE-ANSWER-JUSTIFICATION-PROOF-BEING-CACHED*");



    private static final SubLList $list1 = list(makeSymbol("SUSPEND-STATUS-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym2$ABORTED_P = makeUninternedSymbol("ABORTED-P");





    private static final SubLSymbol $INFERENCE_ABORT_TARGET = makeKeyword("INFERENCE-ABORT-TARGET");

    private static final SubLList $list6 = list(list(makeSymbol("*WITHIN-INFERENCE-CONTROL-PROCESS?*"), T));





    public static final SubLList $list9 = list(makeKeyword("ABORT"));

    private static final SubLList $list10 = list(list(makeSymbol("QUERY-ABORT")));



    private static final SubLString $$$Interruptor = makeString("Interruptor");

    private static final SubLSymbol QUERY_INTERRUPT_INT = makeSymbol("QUERY-INTERRUPT-INT");

    private static final SubLSymbol $sym14$ERROR_MESSAGE = makeUninternedSymbol("ERROR-MESSAGE");



    private static final SubLSymbol $sym16$_INFERENCE_DEBUG__ = makeSymbol("*INFERENCE-DEBUG?*");





    private static final SubLSymbol WITH_INFERENCE_ERROR_HANDLING = makeSymbol("WITH-INFERENCE-ERROR-HANDLING");

    private static final SubLSymbol NEW_INFERENCE_ERROR_SUSPEND_STATUS = makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS");



    public static final SubLList $list22 = list(makeSymbol("FUNCTION"), makeSymbol("INFERENCE-ERROR-HANDLER"));

    private static final SubLList $list23 = list(list(makeSymbol("HALT-REASON-VAR"), makeSymbol("TIMEOUT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym24$ABORT_MAX_TIME = makeUninternedSymbol("ABORT-MAX-TIME");

    private static final SubLSymbol $sym25$TIMED_OUT = makeUninternedSymbol("TIMED-OUT");





    private static final SubLList $list28 = list(makeKeyword("MAX-TIME"));









    private static final SubLInteger $int$_100 = makeInteger(-100);



    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS-AND-PRAGMATIC-SUPPORTS");





    private static final SubLSymbol NEW_INFERENCE_P = makeSymbol("NEW-INFERENCE-P");

    private static final SubLString $str40$can_t_handle_non_simplest_inferen = makeString("can't handle non-simplest inferences like ~a");



    private static final SubLSymbol SIMPLEST_INFERENCE_P = makeSymbol("SIMPLEST-INFERENCE-P");

    private static final SubLList $list43 = list(list(NIL, NIL));



    private static final SubLSymbol $NOT_AN_IMPLICATION = makeKeyword("NOT-AN-IMPLICATION");



    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));



    private static final SubLSymbol DNF_P = makeSymbol("DNF-P");



    private static final SubLString $str52$Time_to_support_disjunctive___pra = makeString("Time to support disjunctive #$pragmaticRequirements");



    private static final SubLString $str54$can_t_handle_non_simple_inference = makeString("can't handle non-simple inference seeding of strategies");

    private static final SubLSymbol CONTINUABLE_INFERENCE_P = makeSymbol("CONTINUABLE-INFERENCE-P");

    private static final SubLSymbol QUERY_DYNAMIC_PROPERTIES_P = makeSymbol("QUERY-DYNAMIC-PROPERTIES-P");



    private static final SubLSymbol INFERENCE_DYNAMIC_PROPERTIES_P = makeSymbol("INFERENCE-DYNAMIC-PROPERTIES-P");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    private static final SubLSymbol READY_INFERENCE_P = makeSymbol("READY-INFERENCE-P");

    private static final SubLString $$$Unhandled_inference_error = makeString("Unhandled inference error");



    private static final SubLSymbol INFERENCE_ERROR_HANDLER = makeSymbol("INFERENCE-ERROR-HANDLER");





    private static final SubLSymbol $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");







    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLSymbol INFERENCE_INTERRUPT_EXTERNAL = makeSymbol("INFERENCE-INTERRUPT-EXTERNAL");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol RUNNING_INFERENCE_P = makeSymbol("RUNNING-INFERENCE-P");

    private static final SubLString $str75$Inference_control_process_was_kil = makeString("Inference control process was killed while running.");



    private static final SubLSymbol SIGNAL_INFERENCE_CONTROL_PROCESS_ABORT = makeSymbol("SIGNAL-INFERENCE-CONTROL-PROCESS-ABORT");



    private static final SubLSymbol $MAX_PROOF_COUNT = makeKeyword("MAX-PROOF-COUNT");







    private static final SubLString $str83$Non_continuable_inference_should_ = makeString("Non-continuable inference should have been :exhaust-total instead of :exhaust");

    private static final SubLString $str84$Crazy_amount_of_problems___a__in_ = makeString("Crazy amount of problems (~a) in store ~a");





    private static final SubLList $list87 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    private static final SubLSymbol TERM_REQUIRES_HL_LANGUAGE = makeSymbol("TERM-REQUIRES-HL-LANGUAGE");



    private static final SubLSymbol VARIABLE_BINDING_VALUE = makeSymbol("VARIABLE-BINDING-VALUE");

    private static final SubLSymbol VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");

    private static final SubLString $str92$Expected_a_one_to_one_match_betwe = makeString("Expected a one-to-one match between EL and HL bindings, got ~a and ~a");

    private static final SubLInteger $int$600 = makeInteger(600);

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol ATOMIC_CLAUSES_P = makeSymbol("ATOMIC-CLAUSES-P");

    private static final SubLSymbol ATOMIC_CLAUSE_P = makeSymbol("ATOMIC-CLAUSE-P");





    private static final SubLList $list99 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    private static final SubLList $list100 = list(makeSymbol("TIME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym101$TIMER = makeUninternedSymbol("TIMER");



    private static final SubLSymbol WITH_QUERY_ABORT_TIMEOUT_START_TIMER = makeSymbol("WITH-QUERY-ABORT-TIMEOUT-START-TIMER");

    private static final SubLSymbol WITH_QUERY_ABORT_TIMEOUT_STOP_TIMER = makeSymbol("WITH-QUERY-ABORT-TIMEOUT-STOP-TIMER");

    private static final SubLSymbol WITH_QUERY_ABORT_TIMEOUT = makeSymbol("WITH-QUERY-ABORT-TIMEOUT");

    private static final SubLString $str106$WITH_QUERY_ABORT_TIMEOUT_client = makeString("WITH-QUERY-ABORT-TIMEOUT client");

    private static final SubLString $str107$WITH_QUERY_ABORT_TIMEOUT_timer = makeString("WITH-QUERY-ABORT-TIMEOUT timer");

    private static final SubLSymbol WITH_QUERY_ABORT_TIMEOUT_TIMER_THREAD = makeSymbol("WITH-QUERY-ABORT-TIMEOUT-TIMER-THREAD");

    private static final SubLSymbol QUERY_ABORT = makeSymbol("QUERY-ABORT");

    public static SubLObject catch_inference_abort(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject suspend_status_var = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        suspend_status_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject aborted_p = $sym2$ABORTED_P;
        return list(CLET, list(aborted_p), list(CCATCH, $INFERENCE_ABORT_TARGET, aborted_p, listS(CLET, $list6, append(body, NIL))), listS(PWHEN, aborted_p, listS(CSETQ, suspend_status_var, $list9), $list10));
    }

    public static SubLObject signal_inference_control_process_abort() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_inference_control_processP$.getDynamicValue(thread)) {
            sublisp_throw($INFERENCE_ABORT_TARGET, T);
        }
        return $NOT_ABORTED;
    }

    public static SubLObject query_abort() {
        abort_current_controlling_inference();
        signal_inference_control_process_abort();
        return $NOT_ABORTED;
    }

    public static SubLObject query_interrupt(SubLObject patience) {
        if (patience == UNPROVIDED) {
            patience = NIL;
        }
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference) {
            final SubLObject semaphore = Semaphores.new_semaphore($$$Interruptor, ZERO_INTEGER);
            subl_promotions.make_process_with_args($$$Interruptor, symbol_function(QUERY_INTERRUPT_INT), list(semaphore, inference, patience));
            Semaphores.semaphore_wait(semaphore);
            return T;
        }
        return NIL;
    }

    public static SubLObject query_interrupt_int(final SubLObject semaphore, final SubLObject inference, final SubLObject patience) {
        Semaphores.semaphore_signal(semaphore);
        return inference_interrupt(inference, patience);
    }

    public static SubLObject catch_inference_error(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject suspend_status_var = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        suspend_status_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject error_message = $sym14$ERROR_MESSAGE;
        return list(CLET, list(error_message), list(PIF, $sym16$_INFERENCE_DEBUG__, bq_cons(PROGN, append(body, NIL)), list(CCATCH, $INFERENCE_ERROR, error_message, bq_cons(WITH_INFERENCE_ERROR_HANDLING, append(body, NIL)))), list(PWHEN, error_message, list(CSETQ, suspend_status_var, list(NEW_INFERENCE_ERROR_SUSPEND_STATUS, error_message))));
    }

    public static SubLObject with_inference_error_handling(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_ERROR_HANDLER, $list22, append(body, NIL));
    }

    public static SubLObject inference_error_handler() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sublisp_throw($INFERENCE_ERROR, Errors.$error_message$.getDynamicValue(thread));
    }

    public static SubLObject with_inference_max_time_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject halt_reason_var = NIL;
        SubLObject timeout = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        halt_reason_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        timeout = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject abort_max_time = $sym24$ABORT_MAX_TIME;
            final SubLObject timed_out = $sym25$TIMED_OUT;
            return list(CLET, list(list(abort_max_time, timeout)), list(PCOND, list(abort_max_time, list(CLET, list(timed_out), listS(WITH_TIMEOUT, list(abort_max_time, timed_out), append(body, NIL)), list(PWHEN, timed_out, listS(CSETQ, halt_reason_var, $list28)))), bq_cons(T, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    public static SubLObject inference_abort_max_time(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $inference_max_time_timeout_enabledP$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL != inference_datastructures_inference.inference_continuableP(inference)) {
            return NIL;
        }
        if (NIL == inference_datastructures_inference.inference_problem_store_privateP(inference)) {
            return NIL;
        }
        return inference_datastructures_inference.inference_max_time(inference);
    }

    public static SubLObject explicify_inference_mode_defaults(final SubLObject query_properties) {
        final SubLObject inference_mode = inference_datastructures_enumerated_types.inference_properties_mode(query_properties);
        return list_utilities.merge_plist(inference_parameters.query_properties_for_inference_mode(inference_mode), query_properties);
    }

    public static SubLObject implicify_inference_mode_defaults(final SubLObject query_properties) {
        final SubLObject inference_mode = inference_datastructures_enumerated_types.inference_properties_mode(query_properties);
        if ($CUSTOM == inference_mode) {
            return query_properties;
        }
        SubLObject implicified_properties = NIL;
        final SubLObject inference_mode_determined_properties = inference_parameters.query_properties_for_inference_mode(inference_mode);
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject inference_mode_determined_value;
        for (remainder = NIL, remainder = query_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            inference_mode_determined_value = getf(inference_mode_determined_properties, property, $UNSPECIFIED);
            if (!value.equal(inference_mode_determined_value)) {
                implicified_properties = putf(implicified_properties, property, value);
            }
        }
        return implicified_properties;
    }

    public static SubLObject query_property_value(final SubLObject query_properties, final SubLObject property) {
        final SubLObject strengthened_properties = explicify_inference_mode_defaults(query_properties);
        final SubLObject v_default = inference_datastructures_enumerated_types.inference_engine_default_for_property(property);
        return getf(strengthened_properties, property, v_default);
    }

    public static SubLObject strengthen_query_properties_using_inference(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject problem_store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject problem_store_privateP = inference_datastructures_inference.inference_problem_store_privateP(inference);
        final SubLObject max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
        final SubLObject transformation_allowedP = inference_datastructures_problem_store.problem_store_transformation_allowedP(problem_store);
        final SubLObject continuableP = inference_datastructures_inference.inference_continuableP(inference);
        final SubLObject return_type = inference_datastructures_inference.inference_return_type(inference);
        if (NIL == transformation_allowedP) {
            inference_datastructures_inference.set_inference_max_transformation_depth(inference, ZERO_INTEGER);
        }
        if ($ALL != inference_datastructures_inference.inference_allowed_rules(inference)) {
            inference_datastructures_inference.set_inference_min_rule_utility(inference, $int$_100);
        }
        if (((NIL != inference_datastructures_problem_store.problem_store_newP(problem_store)) && (NIL != inference_datastructures_inference.inference_problem_store_private_wrt_dynamic_propertiesP(inference))) && max_transformation_depth.eql(ZERO_INTEGER)) {
            inference_datastructures_problem_store.set_problem_store_transformation_allowedP(problem_store, NIL);
        }
        final SubLObject pcase_var = return_type;
        if ((pcase_var.eql($SUPPORTS) || pcase_var.eql($BINDINGS_AND_SUPPORTS)) || pcase_var.eql($BINDINGS_AND_SUPPORTS_AND_PRAGMATIC_SUPPORTS)) {
            inference_datastructures_inference.set_inference_answer_language(inference, $HL);
        }
        if ((NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type)) && (NIL != list_utilities.simple_tree_findP($SUPPORTS, return_type))) {
            inference_datastructures_inference.set_inference_answer_language(inference, $HL);
        }
        if (NIL != inference_datastructures_problem_store.problem_store_newP(problem_store)) {
            if (NIL == problem_store_privateP) {
                inference_datastructures_problem_store.set_problem_store_add_restriction_layer_of_indirectionP(problem_store, T);
            }
            if (NIL != inference_datastructures_problem_store.problem_store_forwardP(problem_store)) {
            }
            final SubLObject hl_query = inference_datastructures_inference.inference_hl_query(inference);
            if ((((NIL != problem_store_privateP) && (NIL != inference_datastructures_problem_query.single_literal_problem_query_p(hl_query))) && max_transformation_depth.eql(ZERO_INTEGER)) && (NIL == continuableP)) {
                inference_datastructures_problem_store.set_problem_store_add_restriction_layer_of_indirectionP(problem_store, NIL);
            }
        }
        if (NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(problem_store)) {
            inference_datastructures_inference.set_inference_result_uniqueness_criterion(inference, $PROOF);
        }
        return NIL;
    }

    public static SubLObject inference_prepare(final SubLObject inference, final SubLObject disjunction_free_el_vars_policy, final SubLObject hypothesizeP) {
        assert NIL != inference_datastructures_inference.new_inference_p(inference) : "inference_datastructures_inference.new_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.new_inference_p(inference) " + inference;
        prepare_inference_hl_query(inference, disjunction_free_el_vars_policy, hypothesizeP);
        return inference_prepare_int(inference);
    }

    public static SubLObject inference_prepare_from_dnf(final SubLObject inference, final SubLObject dnf, final SubLObject scoped_vars) {
        assert NIL != inference_datastructures_inference.new_inference_p(inference) : "inference_datastructures_inference.new_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.new_inference_p(inference) " + inference;
        prepare_inference_hl_query_from_dnf(inference, dnf, scoped_vars);
        return inference_prepare_int(inference);
    }

    public static SubLObject inference_prepare_int(final SubLObject inference) {
        if (NIL != inference_datastructures_inference.new_inference_p(inference)) {
            if (NIL != inference_datastructures_inference.simplest_inference_p(inference)) {
                simplest_inference_prepare(inference);
            } else {
                Errors.error($str40$can_t_handle_non_simplest_inferen, inference);
            }
            inference_datastructures_inference.set_inference_status(inference, $PREPARED);
        }
        return inference;
    }

    public static SubLObject simplest_inference_prepare(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) " + inference;
        inference_worker.find_or_create_root_problem_and_link(inference);
        return NIL;
    }

    public static SubLObject simplest_inference_prepare_new(final SubLObject problem_store, final SubLObject el_query, final SubLObject mt, final SubLObject strategy_type, final SubLObject disjunction_free_el_vars_policy, final SubLObject hypothesizeP, final SubLObject non_explanatory_el_query, final SubLObject problem_store_privateP) {
        final SubLObject inference = inference_datastructures_inference.new_simplest_inference_of_type(problem_store, strategy_type);
        inference_datastructures_inference.set_inference_input_el_query(inference, el_query);
        inference_datastructures_inference.set_inference_input_mt(inference, mt);
        inference_datastructures_inference.set_inference_input_non_explanatory_el_query(inference, non_explanatory_el_query);
        inference_datastructures_inference.set_inference_problem_store_private(inference, problem_store_privateP);
        return inference_prepare(inference, disjunction_free_el_vars_policy, hypothesizeP);
    }

    public static SubLObject simplest_inference_prepare_new_from_dnf(final SubLObject problem_store, final SubLObject dnf, final SubLObject mt, final SubLObject strategy_type, final SubLObject scoped_vars, final SubLObject non_explanatory_el_query, final SubLObject problem_store_privateP) {
        final SubLObject inference = inference_datastructures_inference.new_simplest_inference_of_type(problem_store, strategy_type);
        inference_datastructures_inference.set_inference_input_mt(inference, mt);
        inference_datastructures_inference.set_inference_input_non_explanatory_el_query(inference, non_explanatory_el_query);
        inference_datastructures_inference.set_inference_problem_store_private(inference, problem_store_privateP);
        return inference_prepare_from_dnf(inference, dnf, scoped_vars);
    }

    public static SubLObject note_inference_tautology_justification(final SubLObject inference, final SubLObject tautology_justifications) {
        final SubLObject suspend_status = inference_datastructures_enumerated_types.new_inference_justification_status(tautology_justifications);
        if (NIL != tautology_justifications) {
            inference_datastructures_inference.set_inference_suspend_status(inference, suspend_status);
        }
        return inference;
    }

    public static SubLObject preparing_inferenceP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $preparing_inferenceP$.getDynamicValue(thread);
    }

    public static SubLObject prepare_inference_hl_query(final SubLObject inference, final SubLObject disjunction_free_el_vars_policy, final SubLObject hypothesizeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store_var;
        final SubLObject store = store_var = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = $preparing_inferenceP$.currentBinding(thread);
                        try {
                            $preparing_inferenceP$.bind(T, thread);
                            final SubLObject input_mt = inference_datastructures_inference.inference_input_mt(inference);
                            final SubLObject input_el_query = inference_datastructures_inference.inference_input_el_query(inference);
                            final SubLObject input_non_explanatory_el_query = inference_datastructures_inference.inference_input_non_explanatory_el_query(inference);
                            SubLObject mt = NIL;
                            SubLObject el_query = NIL;
                            SubLObject explanatory_el_query = NIL;
                            SubLObject hypothetical_bindings = NIL;
                            SubLObject tautology_justifications = NIL;
                            final SubLObject hypothesization_start_time = get_internal_real_time();
                            thread.resetMultipleValues();
                            final SubLObject mt_$3 = prepare_inference_hl_query_int(input_mt, input_el_query, input_non_explanatory_el_query, hypothesizeP);
                            final SubLObject el_query_$4 = thread.secondMultipleValue();
                            final SubLObject explanatory_el_query_$5 = thread.thirdMultipleValue();
                            final SubLObject hypothetical_bindings_$6 = thread.fourthMultipleValue();
                            final SubLObject tautology_justifications_$7 = thread.fifthMultipleValue();
                            thread.resetMultipleValues();
                            mt = mt_$3;
                            el_query = el_query_$4;
                            explanatory_el_query = explanatory_el_query_$5;
                            hypothetical_bindings = hypothetical_bindings_$6;
                            tautology_justifications = tautology_justifications_$7;
                            final SubLObject hypothesization_end_time = get_internal_real_time();
                            final SubLObject hypothesization_elapsed = numeric_date_utilities.elapsed_internal_real_time(hypothesization_start_time, hypothesization_end_time);
                            final SubLObject elapsed_seconds = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(hypothesization_elapsed);
                            inference_datastructures_inference.set_inference_hypothesization_time(inference, elapsed_seconds);
                            if ((NIL != mt) && (NIL == hlmt.hlmt_p(mt))) {
                                inference_datastructures_inference.set_inference_status(inference, $ILL_FORMED);
                            } else
                                if ($NOT_AN_IMPLICATION == el_query) {
                                    inference_datastructures_inference.set_inference_status(inference, $ILL_FORMED);
                                } else
                                    if ($TAUTOLOGY == el_query) {
                                        inference_datastructures_inference.set_inference_status(inference, $TAUTOLOGY);
                                        inference_datastructures_inference.set_inference_hl_query(inference, $tautology_problem_query$.getGlobalValue());
                                        note_inference_tautology_justification(inference, tautology_justifications);
                                    } else {
                                        inference_datastructures_inference.set_inference_mt(inference, mt);
                                        inference_datastructures_inference.set_inference_el_query(inference, el_query);
                                        inference_datastructures_inference.set_inference_hypothetical_bindings(inference, hypothetical_bindings);
                                    }


                            if (NIL != inference_datastructures_inference.new_inference_p(inference)) {
                                thread.resetMultipleValues();
                                final SubLObject czer_result = inference_czer.inference_canonicalize_ask_memoized(el_query, mt, disjunction_free_el_vars_policy);
                                final SubLObject el_bindings = thread.secondMultipleValue();
                                final SubLObject free_el_vars = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != inference_datastructures_problem_query.problem_query_p(czer_result)) {
                                    final SubLObject hl_query = czer_result;
                                    inference_datastructures_inference.set_inference_hl_query(inference, hl_query);
                                    inference_datastructures_inference.set_inference_el_bindings(inference, el_bindings);
                                    final SubLObject free_hl_vars = variables.sort_hl_variable_list(bindings.apply_bindings(el_bindings, free_el_vars));
                                    inference_datastructures_inference.set_inference_free_hl_vars(inference, free_hl_vars);
                                    if (NIL == input_non_explanatory_el_query) {
                                        inference_datastructures_inference.set_inference_explanatory_subquery(inference, $ALL);
                                        inference_datastructures_inference.set_inference_non_explanatory_subquery(inference, NIL);
                                    } else {
                                        thread.resetMultipleValues();
                                        final SubLObject explanatory_czer_result = inference_czer.inference_canonicalize_ask_memoized(explanatory_el_query, mt, disjunction_free_el_vars_policy);
                                        final SubLObject explanatory_el_bindings = thread.secondMultipleValue();
                                        final SubLObject explanatory_free_el_vars = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        final SubLObject explanatory_subquery = explanatory_czer_result;
                                        inference_datastructures_inference.set_inference_explanatory_subquery(inference, explanatory_subquery);
                                        thread.resetMultipleValues();
                                        final SubLObject non_explanatory_czer_result = inference_czer.inference_canonicalize_ask_memoized(input_non_explanatory_el_query, mt, disjunction_free_el_vars_policy);
                                        final SubLObject non_explanatory_el_bindings = thread.secondMultipleValue();
                                        final SubLObject non_explanatory_free_el_vars = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        final SubLObject non_explanatory_subquery = non_explanatory_czer_result;
                                        final SubLObject non_explanatory_hl_bindings = bindings.apply_bindings(non_explanatory_el_bindings, el_bindings);
                                        inference_datastructures_inference.set_inference_non_explanatory_subquery(inference, bindings.apply_bindings(non_explanatory_hl_bindings, non_explanatory_subquery));
                                    }
                                } else
                                    if ($$True.eql(czer_result)) {
                                        inference_datastructures_inference.set_inference_hl_query(inference, $tautology_problem_query$.getGlobalValue());
                                        inference_datastructures_inference.set_inference_status(inference, $TAUTOLOGY);
                                    } else
                                        if ($$False.eql(czer_result)) {
                                            inference_datastructures_inference.set_inference_hl_query(inference, $contradiction_problem_query$.getGlobalValue());
                                            inference_datastructures_inference.set_inference_status(inference, $CONTRADICTION);
                                        } else
                                            if ($ILL_FORMED == czer_result) {
                                                inference_datastructures_inference.set_inference_hl_query(inference, $contradiction_problem_query$.getGlobalValue());
                                                inference_datastructures_inference.set_inference_status(inference, $ILL_FORMED);
                                            }



                            }
                        } finally {
                            $preparing_inferenceP$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$1, thread);
                }
                inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return inference;
    }

    public static SubLObject prepare_inference_hl_query_int(SubLObject input_mt, SubLObject input_el_query, final SubLObject input_non_explanatory_el_query, final SubLObject hypothesizeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject input_el_query_$10 = czer_utilities.unwrap_if_ist_permissive(input_el_query, input_mt);
        final SubLObject input_mt_$11 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        input_el_query = input_el_query_$10;
        input_mt = input_mt_$11;
        SubLObject mt = NIL;
        SubLObject el_query = NIL;
        SubLObject explanatory_el_query = NIL;
        SubLObject hypothetical_bindings = NIL;
        SubLObject tautology_justifications = NIL;
        if (NIL == hypothesizeP) {
            if (NIL == input_non_explanatory_el_query) {
                mt = (NIL != input_mt) ? hlmt_czer.canonicalize_hlmt(input_mt) : NIL;
                el_query = input_el_query;
                explanatory_el_query = input_el_query;
                hypothetical_bindings = NIL;
                tautology_justifications = NIL;
            } else {
                mt = (NIL != input_mt) ? hlmt_czer.canonicalize_hlmt(input_mt) : NIL;
                el_query = make_conjunction(list(input_el_query, input_non_explanatory_el_query));
                explanatory_el_query = input_el_query;
                hypothetical_bindings = NIL;
                tautology_justifications = NIL;
            }
        } else {
            thread.resetMultipleValues();
            final SubLObject consequent = hypothesize_antecedent(input_el_query, input_mt);
            final SubLObject hypothetical_context = thread.secondMultipleValue();
            final SubLObject v_bindings = thread.thirdMultipleValue();
            final SubLObject failure_reasons = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            if (NIL == hypothetical_context) {
                mt = (NIL != input_mt) ? hlmt_czer.canonicalize_hlmt(input_mt) : NIL;
                el_query = $TAUTOLOGY;
                explanatory_el_query = NIL;
                hypothetical_bindings = NIL;
                tautology_justifications = failure_reasons;
            } else
                if (NIL == input_non_explanatory_el_query) {
                    mt = hypothetical_context;
                    el_query = consequent;
                    explanatory_el_query = consequent;
                    hypothetical_bindings = v_bindings;
                    tautology_justifications = NIL;
                } else {
                    mt = hypothetical_context;
                    el_query = make_conjunction(list(consequent, input_non_explanatory_el_query));
                    explanatory_el_query = consequent;
                    hypothetical_bindings = v_bindings;
                    tautology_justifications = NIL;
                }

        }
        return values(mt, el_query, explanatory_el_query, hypothetical_bindings, tautology_justifications);
    }

    public static SubLObject hypothesize_antecedent(SubLObject implication, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject return_consequent = $NOT_AN_IMPLICATION;
        SubLObject return_mt = mt;
        SubLObject return_bindings = NIL;
        SubLObject return_failure_reasons = NIL;
        implication = inference_possibly_simplify_conditional_sentence(implication);
        if (NIL != el_implication_p(implication)) {
            final SubLObject antecedent = cycl_utilities.formula_arg1(implication, UNPROVIDED);
            final SubLObject consequent = cycl_utilities.formula_arg2(implication, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject new_consequent = prove.new_prepare_for_proof(antecedent, consequent, mt);
            final SubLObject new_mt = thread.secondMultipleValue();
            final SubLObject v_bindings = thread.thirdMultipleValue();
            final SubLObject failure_reasons = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            return_consequent = new_consequent;
            return_mt = new_mt;
            return_bindings = v_bindings;
            return_failure_reasons = failure_reasons;
        }
        return values(return_consequent, return_mt, return_bindings, return_failure_reasons);
    }

    public static SubLObject inference_conditional_sentence_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_sentence_p(v_object)) && (NIL != el_implication_p(inference_possibly_simplify_conditional_sentence(v_object))));
    }

    public static SubLObject inference_possibly_simplify_conditional_sentence(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simplified_sentence = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$simplify_implicationP$.currentBinding(thread);
        try {
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            czer_vars.$simplify_implicationP$.bind(NIL, thread);
            simplified_sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
        } finally {
            czer_vars.$simplify_implicationP$.rebind(_prev_bind_2, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_0, thread);
        }
        return simplified_sentence;
    }

    public static SubLObject prepare_inference_hl_query_from_dnf(final SubLObject inference, final SubLObject input_dnf, final SubLObject scoped_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != clauses.dnf_p(input_dnf) : "clauses.dnf_p(input_dnf) " + "CommonSymbols.NIL != clauses.dnf_p(input_dnf) " + input_dnf;
        assert NIL != listp(scoped_vars) : "Types.listp(scoped_vars) " + "CommonSymbols.NIL != Types.listp(scoped_vars) " + scoped_vars;
        final SubLObject input_mt = inference_datastructures_inference.inference_input_mt(inference);
        final SubLObject input_non_explanatory_el_query = inference_datastructures_inference.inference_input_non_explanatory_el_query(inference);
        SubLObject full_dnf = input_dnf;
        inference_datastructures_inference.set_inference_mt(inference, input_mt);
        inference_datastructures_inference.set_inference_hypothetical_bindings(inference, NIL);
        if (NIL != input_non_explanatory_el_query) {
            final SubLObject non_explanatory_clauses = clausifier.dnf_operators_out(input_non_explanatory_el_query);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(non_explanatory_clauses))) {
                Errors.error($str52$Time_to_support_disjunctive___pra);
            }
            final SubLObject non_explanatory_dnf = non_explanatory_clauses.first();
            inference_datastructures_inference.set_inference_non_explanatory_subquery(inference, inference_czer.dnf_and_mt_to_hl_query(non_explanatory_dnf, input_mt));
            full_dnf = inference_worker_transformation.nmerge_dnf(copy_clause(input_dnf), non_explanatory_dnf);
        }
        inference_datastructures_inference.set_inference_el_query(inference, NIL);
        inference_datastructures_inference.set_inference_el_bindings(inference, NIL);
        if (NIL != clauses.empty_clauseP(full_dnf)) {
            inference_datastructures_inference.set_inference_hl_query(inference, $tautology_problem_query$.getGlobalValue());
            inference_datastructures_inference.set_inference_status(inference, $TAUTOLOGY);
        } else {
            final SubLObject hl_query = inference_czer.dnf_and_mt_to_hl_query(full_dnf, input_mt);
            inference_datastructures_inference.set_inference_hl_query(inference, hl_query);
            final SubLObject all_free_hl_vars = list_utilities.tree_gather(full_dnf, HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject free_hl_vars = variables.sort_hl_variable_list(list_utilities.fast_set_difference(all_free_hl_vars, scoped_vars, UNPROVIDED));
            inference_datastructures_inference.set_inference_free_hl_vars(inference, free_hl_vars);
            if (NIL == input_non_explanatory_el_query) {
                inference_datastructures_inference.set_inference_explanatory_subquery(inference, $ALL);
            } else {
                final SubLObject explanatory_subquery = inference_czer.dnf_and_mt_to_hl_query(input_dnf, input_mt);
                inference_datastructures_inference.set_inference_explanatory_subquery(inference, explanatory_subquery);
            }
        }
        return inference;
    }

    public static SubLObject inference_initial_relevant_strategies(final SubLObject inference) {
        if (NIL != inference_datastructures_inference.simplest_inference_p(inference)) {
            return inference_tactician.strategy_initial_relevant_strategies(inference_datastructures_inference.simplest_inference_strategy(inference));
        }
        Errors.error($str54$can_t_handle_non_simple_inference);
        return NIL;
    }

    public static SubLObject inference_update_dynamic_properties(final SubLObject inference, final SubLObject new_query_dynamic_properties) {
        assert NIL != inference_datastructures_inference.continuable_inference_p(inference) : "inference_datastructures_inference.continuable_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.continuable_inference_p(inference) " + inference;
        assert NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p(new_query_dynamic_properties) : "inference_datastructures_enumerated_types.query_dynamic_properties_p(new_query_dynamic_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p(new_query_dynamic_properties) " + new_query_dynamic_properties;
        if (NIL != query_dynamic_properties_have_strategically_interesting_extensionP(inference, new_query_dynamic_properties)) {
            assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) " + inference;
            final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
            inference_tactician.strategy_note_inference_dynamic_properties_updated(strategy);
        }
        final SubLObject new_inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(new_query_dynamic_properties);
        inference_set_dynamic_properties(inference, new_inference_dynamic_properties);
        final SubLObject set_var = inference_datastructures_inference.inference_relevant_problems(inference);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            problem = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, problem)) && (NIL != inference_datastructures_problem.valid_problem_p(problem))) {
                inference_datastructures_strategy.set_problem_recompute_thrown_away_wrt_all_relevant_strategies(problem);
                inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(problem);
                inference_datastructures_strategy.set_problem_recompute_set_aside_wrt_all_relevant_strategies(problem);
                inference_datastructures_strategy.set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies(problem);
            }
        }
        inference_datastructures_inference.set_inference_status(inference, $READY);
        return inference;
    }

    public static SubLObject query_dynamic_properties_have_strategically_interesting_extensionP(final SubLObject inference, final SubLObject new_query_dynamic_properties) {
        final SubLObject new_inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(new_query_dynamic_properties);
        final SubLObject old_max_proof_depth = inference_datastructures_inference.inference_max_proof_depth(inference);
        final SubLObject new_max_proof_depth = inference_datastructures_enumerated_types.inference_properties_max_proof_depth(new_inference_dynamic_properties);
        if (NIL != depth_cutoff_L(old_max_proof_depth, new_max_proof_depth)) {
            return T;
        }
        final SubLObject old_max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
        final SubLObject new_max_transformation_depth = inference_datastructures_enumerated_types.inference_properties_max_transformation_depth(new_inference_dynamic_properties);
        if (NIL != depth_cutoff_L(old_max_transformation_depth, new_max_transformation_depth)) {
            return T;
        }
        final SubLObject old_min_rule_utility = inference_datastructures_inference.inference_min_rule_utility(inference);
        final SubLObject new_min_rule_utility = inference_datastructures_enumerated_types.inference_properties_min_rule_utility(new_inference_dynamic_properties);
        if (old_min_rule_utility.numG(new_min_rule_utility)) {
            return T;
        }
        final SubLObject new_strategy_dynamic_properties = inference_datastructures_enumerated_types.extract_strategy_dynamic_properties(new_query_dynamic_properties);
        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        final SubLObject old_productivity_limit = inference_datastructures_strategy.strategy_productivity_limit(strategy);
        final SubLObject new_productivity_limit = inference_datastructures_enumerated_types.strategy_dynamic_properties_productivity_limit(new_strategy_dynamic_properties);
        if (NIL != inference_datastructures_enumerated_types.productivity_L(old_productivity_limit, new_productivity_limit)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject depth_cutoff_L(final SubLObject depth_cutoff_1, final SubLObject depth_cutoff_2) {
        if (!depth_cutoff_1.isInteger()) {
            return NIL;
        }
        if (depth_cutoff_2.isInteger()) {
            return numL(depth_cutoff_1, depth_cutoff_2);
        }
        return T;
    }

    public static SubLObject inference_set_dynamic_properties(final SubLObject inference, final SubLObject dynamic_properties) {
        assert NIL != inference_datastructures_enumerated_types.inference_dynamic_properties_p(dynamic_properties) : "inference_datastructures_enumerated_types.inference_dynamic_properties_p(dynamic_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.inference_dynamic_properties_p(dynamic_properties) " + dynamic_properties;
        final SubLObject return_type = inference_datastructures_enumerated_types.inference_properties_return_type(dynamic_properties);
        final SubLObject answer_language = inference_datastructures_enumerated_types.inference_properties_answer_language(dynamic_properties);
        final SubLObject cache_resultsP = inference_datastructures_enumerated_types.inference_properties_cache_inference_resultsP(dynamic_properties);
        final SubLObject browsableP = inference_datastructures_enumerated_types.inference_properties_browsableP(dynamic_properties);
        final SubLObject continuableP = inference_datastructures_enumerated_types.inference_properties_continuableP(dynamic_properties);
        final SubLObject blockP = inference_datastructures_enumerated_types.inference_properties_blockP(dynamic_properties);
        final SubLObject max_number = inference_datastructures_enumerated_types.inference_properties_max_number(dynamic_properties);
        final SubLObject max_time = inference_datastructures_enumerated_types.inference_properties_max_time(dynamic_properties);
        final SubLObject max_step = inference_datastructures_enumerated_types.inference_properties_max_step(dynamic_properties);
        final SubLObject inference_mode = inference_datastructures_enumerated_types.inference_properties_mode(dynamic_properties);
        final SubLObject forward_max_time = inference_datastructures_enumerated_types.inference_properties_forward_max_time(dynamic_properties);
        final SubLObject max_proof_depth = inference_strategist_max_proof_depth_from_properties(inference, dynamic_properties);
        final SubLObject max_trans_depth = inference_datastructures_enumerated_types.inference_properties_max_transformation_depth(dynamic_properties);
        final SubLObject min_rule_utility = inference_datastructures_enumerated_types.inference_properties_min_rule_utility(dynamic_properties);
        final SubLObject pad = inference_datastructures_enumerated_types.inference_properties_probably_approximately_done(dynamic_properties);
        final SubLObject metrics_template = inference_datastructures_enumerated_types.inference_properties_metrics(dynamic_properties);
        inference_datastructures_inference.set_inference_continuable(inference, continuableP);
        inference_datastructures_inference.set_inference_browsable(inference, browsableP);
        inference_datastructures_inference.set_inference_return_type(inference, return_type);
        inference_datastructures_inference.set_inference_answer_language(inference, answer_language);
        inference_datastructures_inference.set_inference_cache_results(inference, cache_resultsP);
        if (NIL != blockP) {
            inference_datastructures_inference.note_inference_blocking(inference);
        }
        inference_datastructures_inference.set_inference_max_number(inference, max_number);
        inference_datastructures_inference.set_inference_max_time(inference, max_time);
        inference_datastructures_inference.set_inference_max_step(inference, max_step);
        inference_datastructures_inference.set_inference_mode(inference, inference_mode);
        inference_datastructures_inference.set_inference_forward_max_time(inference, forward_max_time);
        inference_datastructures_inference.set_inference_max_proof_depth(inference, max_proof_depth);
        inference_datastructures_inference.set_inference_max_transformation_depth(inference, max_trans_depth);
        inference_datastructures_inference.set_inference_min_rule_utility(inference, min_rule_utility);
        inference_datastructures_inference.set_inference_probably_approximately_done(inference, pad);
        inference_datastructures_inference.set_inference_metrics_template(inference, metrics_template);
        return inference;
    }

    public static SubLObject inference_strategist_max_proof_depth_from_properties(final SubLObject inference, final SubLObject dynamic_properties) {
        SubLObject max_proof_depth = inference_datastructures_enumerated_types.inference_properties_max_proof_depth(dynamic_properties);
        final SubLObject inference_mode = inference_datastructures_enumerated_types.inference_properties_mode(dynamic_properties);
        if ($CUSTOM != inference_mode) {
            final SubLObject mode_default_max_proof_depth = getf(inference_parameters.query_properties_for_inference_mode(inference_mode), $MAX_PROOF_DEPTH, UNPROVIDED);
            if (max_proof_depth.eql(mode_default_max_proof_depth)) {
                final SubLObject literal_count = inference_datastructures_problem.problem_query_literal_count(inference_datastructures_inference.inference_hl_query(inference), UNPROVIDED);
                if (max_proof_depth.isInteger() && max_proof_depth.numL(literal_count)) {
                    max_proof_depth = literal_count;
                }
            }
        }
        return max_proof_depth;
    }

    public static SubLObject inference_run(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.ready_inference_p(inference) : "inference_datastructures_inference.ready_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.ready_inference_p(inference) " + inference;
        assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) " + inference;
        inference_analysis.possibly_enqueue_asked_query_from_inference(inference);
        inference_datastructures_inference.set_inference_control_process_to_me(inference);
        inference_datastructures_inference.initialize_inference_time_properties(inference);
        SubLObject suspend_status = inference_datastructures_enumerated_types.new_inference_error_suspend_status($$$Unhandled_inference_error);
        try {
            SubLObject aborted_p = NIL;
            try {
                thread.throwStack.push($INFERENCE_ABORT_TARGET);
                final SubLObject _prev_bind_0 = $within_inference_control_processP$.currentBinding(thread);
                try {
                    $within_inference_control_processP$.bind(T, thread);
                    SubLObject error_message = NIL;
                    if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                        inference_datastructures_inference.set_inference_status(inference, $RUNNING);
                        suspend_status = simplest_inference_run_handler(inference);
                    } else {
                        try {
                            thread.throwStack.push($INFERENCE_ERROR);
                            final SubLObject _prev_bind_0_$12 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(INFERENCE_ERROR_HANDLER), thread);
                                try {
                                    inference_datastructures_inference.set_inference_status(inference, $RUNNING);
                                    suspend_status = simplest_inference_run_handler(inference);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$12, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            error_message = Errors.handleThrowable(ccatch_env_var, $INFERENCE_ERROR);
                        } finally {
                            thread.throwStack.pop();
                        }
                    }
                    if (NIL != error_message) {
                        suspend_status = inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message);
                    }
                } finally {
                    $within_inference_control_processP$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                aborted_p = Errors.handleThrowable(ccatch_env_var2, $INFERENCE_ABORT_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != aborted_p) {
                suspend_status = $ABORT;
                query_abort();
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                    inference_suspend(inference, suspend_status);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return inference;
    }

    public static SubLObject inference_suspend(final SubLObject inference, final SubLObject suspend_status) {
        inference_datastructures_inference.finalize_inference_time_properties(inference);
        inference_datastructures_inference.set_inference_suspend_status(inference, suspend_status);
        inference_datastructures_inference.set_inference_status(inference, $SUSPENDED);
        inference_datastructures_inference.clear_inference_control_process(inference);
        return inference;
    }

    public static SubLObject inference_suspend_due_to_max_problem_count(final SubLObject inference) {
        return inference_suspend(inference, $MAX_PROBLEM_COUNT);
    }

    public static SubLObject inference_suspend_due_to_max_number(final SubLObject inference) {
        return inference_suspend(inference, $MAX_NUMBER);
    }

    public static SubLObject inference_suspend_due_to_max_time(final SubLObject inference) {
        return inference_suspend(inference, $MAX_TIME);
    }

    public static SubLObject inference_suspend_due_to_max_step(final SubLObject inference) {
        return inference_suspend(inference, $MAX_STEP);
    }

    public static SubLObject inference_suspend_due_to_pad(final SubLObject inference) {
        return inference_suspend(inference, $PROBABLY_APPROXIMATELY_DONE);
    }

    public static SubLObject inference_interrupt_external(final SubLObject inference, SubLObject patience) {
        if (patience == UNPROVIDED) {
            patience = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference) {
            return T;
        }
        if (NIL == inference_datastructures_inference.running_inference_p(inference)) {
            return T;
        }
        SubLObject successP = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    inference_interrupt(inference, patience);
                    successP = T;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return successP;
    }

    public static SubLObject inference_interrupt(final SubLObject inference, SubLObject patience) {
        if (patience == UNPROVIDED) {
            patience = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(inference, RUNNING_INFERENCE_P);
        if (NIL == valid_process_p(inference_datastructures_inference.inference_control_process(inference))) {
            final SubLObject error_message = $str75$Inference_control_process_was_kil;
            inference_suspend(inference, inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message));
            return inference;
        }
        if (NIL == patience) {
            return inference_interrupt_int(inference);
        }
        if (patience.isZero()) {
            return inference_abort_int(inference);
        }
        assert NIL != number_utilities.positive_number_p(patience) : "number_utilities.positive_number_p(patience) " + "CommonSymbols.NIL != number_utilities.positive_number_p(patience) " + patience;
        SubLObject my_patience_ran_out_p = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$13 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(patience, tag);
                        inference_interrupt_int(inference);
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$13, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            my_patience_ran_out_p = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != my_patience_ran_out_p) {
            inference_abort_int(inference);
        }
        return inference;
    }

    public static SubLObject inference_interrupt_int(final SubLObject inference) {
        inference_datastructures_inference.inference_signal_interrupt(inference);
        process_block();
        return inference;
    }

    public static SubLObject inference_abort(final SubLObject inference) {
        return inference_interrupt(inference, ZERO_INTEGER);
    }

    public static SubLObject inference_abort_after_delay(final SubLObject inference, SubLObject delay) {
        if (delay == UNPROVIDED) {
            delay = ZERO_INTEGER;
        }
        if (delay.isPositive()) {
            sleep(delay);
        }
        return inference_abort(inference);
    }

    public static SubLObject inference_abort_if_running(final SubLObject inference) {
        if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
            return inference_abort(inference);
        }
        return NIL;
    }

    public static SubLObject abort_current_controlling_inference() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
            return inference_abort(inference);
        }
        return NIL;
    }

    public static SubLObject inference_abort_int(final SubLObject inference) {
        try {
            final SubLObject control_process = inference_datastructures_inference.inference_control_process(inference);
            if (NIL != processp(control_process)) {
                interrupt_process(control_process, SIGNAL_INFERENCE_CONTROL_PROCESS_ABORT);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                inference_datastructures_inference.inference_handle_interrupts(inference);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return inference;
    }

    public static SubLObject wait_for_inference_to_unblock() {
        process_block();
        return NIL;
    }

    public static SubLObject signal_inference_to_unblock(final SubLObject inference) {
        final SubLObject process = inference_datastructures_inference.inference_control_process(inference);
        if (NIL != valid_process_p(process)) {
            process_unblock(process);
            return T;
        }
        return NIL;
    }

    public static SubLObject signal_inference_to_finish(final SubLObject inference) {
        if (NIL != inference_datastructures_inference.inference_p(inference)) {
            inference_datastructures_inference.clear_inference_blocking(inference);
            final SubLObject process = inference_datastructures_inference.inference_control_process(inference);
            if (NIL != valid_process_p(process)) {
                process_unblock(process);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject inference_max_number_reachedP(final SubLObject inference) {
        final SubLObject max_number = inference_datastructures_inference.inference_max_number(inference);
        if (NIL != max_number) {
            final SubLObject number = inference_datastructures_inference.inference_new_result_count(inference);
            if (number.numGE(max_number)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject inference_max_time_reachedP(final SubLObject inference) {
        final SubLObject end_time = inference_datastructures_inference.inference_end_internal_real_time(inference);
        if (NIL != end_time) {
            return internal_real_time_has_arrivedP(end_time);
        }
        return NIL;
    }

    public static SubLObject current_controlling_inference_max_time_reachedP() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        if ((NIL != inference) && (NIL != inference_max_time_reachedP(inference))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject current_controlling_inference_time_remaining() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        return NIL != inference ? inference_datastructures_inference.inference_remaining_time(inference, T) : NIL;
    }

    public static SubLObject inference_max_step_reachedP(final SubLObject inference) {
        final SubLObject max_step = inference_datastructures_inference.inference_max_step(inference);
        if (NIL != max_step) {
            final SubLObject step_count = inference_datastructures_inference.inference_step_count(inference);
            return numGE(step_count, max_step);
        }
        return NIL;
    }

    public static SubLObject inference_max_problem_count_reachedP(final SubLObject inference) {
        return inference_datastructures_problem_store.problem_store_max_problem_count_reachedP(inference_datastructures_inference.inference_problem_store(inference));
    }

    public static SubLObject inference_max_proof_count_reachedP(final SubLObject inference) {
        return inference_datastructures_problem_store.problem_store_max_proof_count_reachedP(inference_datastructures_inference.inference_problem_store(inference));
    }

    public static SubLObject inference_crazy_max_problem_count_reachedP(final SubLObject inference) {
        return inference_datastructures_problem_store.problem_store_crazy_max_problem_count_reachedP(inference_datastructures_inference.inference_problem_store(inference));
    }

    public static SubLObject inference_probably_approximately_doneP(final SubLObject inference) {
        if (inference_datastructures_inference.inference_answer_count(inference).isZero()) {
            final SubLObject end_time = inference_datastructures_inference.inference_pad_internal_real_time(inference);
            if (NIL != numeric_date_utilities.internal_real_time_p(end_time)) {
                return internal_real_time_has_arrivedP(end_time);
            }
        }
        return NIL;
    }

    public static SubLObject inference_halt_condition_reachedP(final SubLObject inference) {
        return inference_datastructures_enumerated_types.inference_halt_condition_p(inference_datastructures_inference.inference_suspend_status(inference));
    }

    public static SubLObject inference_determine_type_independent_result(final SubLObject inference) {
        if (NIL != inference_datastructures_inference.inference_interrupt_signaledP(inference)) {
            return $INTERRUPT;
        }
        if (NIL != inference_max_number_reachedP(inference)) {
            return $MAX_NUMBER;
        }
        if (NIL != inference_max_time_reachedP(inference)) {
            return $MAX_TIME;
        }
        if (NIL != inference_max_step_reachedP(inference)) {
            return $MAX_STEP;
        }
        if (NIL != inference_max_problem_count_reachedP(inference)) {
            return $MAX_PROBLEM_COUNT;
        }
        if (NIL != inference_max_proof_count_reachedP(inference)) {
            return $MAX_PROOF_COUNT;
        }
        if (NIL != inference_probably_approximately_doneP(inference)) {
            return $PROBABLY_APPROXIMATELY_DONE;
        }
        if (NIL != inference_halt_condition_reachedP(inference)) {
            return inference_datastructures_inference.inference_suspend_status(inference);
        }
        return NIL;
    }

    public static SubLObject strategy_type_from_sentence_and_static_properties(final SubLObject sentence, final SubLObject mt, final SubLObject static_properties) {
        return strategy_type_from_static_properties(static_properties);
    }

    public static SubLObject strategy_type_from_dnf_and_static_properties(final SubLObject dnf, final SubLObject mt, final SubLObject static_properties) {
        return strategy_type_from_static_properties(static_properties);
    }

    public static SubLObject strategy_type_from_static_properties(final SubLObject static_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != properties_indicate_forward_inferenceP(static_properties)) {
            return $forward_strategy_type$.getDynamicValue(thread);
        }
        if (NIL != inference_datastructures_enumerated_types.problem_store_properties_abduction_allowedP(static_properties)) {
            return abductive_tactician.$abductive_strategy_type$.getDynamicValue(thread);
        }
        if (NIL != inference_datastructures_enumerated_types.transformation_allowed_by_propertiesP(static_properties)) {
            return $default_strategy_type$.getDynamicValue(thread);
        }
        return $exhaustive_removal_strategy_type$.getDynamicValue(thread);
    }

    public static SubLObject properties_indicate_forward_inferenceP(final SubLObject static_properties) {
        final SubLObject store = inference_datastructures_enumerated_types.inference_properties_problem_store(static_properties);
        if ((NIL != store) && (NIL != inference_datastructures_problem_store.problem_store_forwardP(store))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject inference_permits_transformationP(final SubLObject inference) {
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        return makeBoolean((NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(store)) && (!ZERO_INTEGER.eql(inference_datastructures_inference.inference_max_transformation_depth(inference))));
    }

    public static SubLObject determine_best_strategy_type_for_inference(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != inference_datastructures_inference.abductive_inference_p(inference) ? abductive_tactician.$abductive_strategy_type$.getDynamicValue(thread) : $BALANCING;
    }

    public static SubLObject consider_switching_strategies(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) " + inference;
        final SubLObject best_strategy_type = determine_best_strategy_type_for_inference(inference);
        if (!best_strategy_type.eql(inference_datastructures_strategy.strategy_type(inference_datastructures_inference.simplest_inference_strategy(inference)))) {
            inference_switch_strategies(inference, best_strategy_type);
        }
        return inference;
    }

    public static SubLObject inference_switch_strategies(final SubLObject inference, final SubLObject new_strategy_type) {
        assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) " + inference;
        return inference;
    }

    public static SubLObject simplest_inference_run_handler(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) " + inference;
        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject timeout = inference_abort_max_time(inference);
        SubLObject result = NIL;
        final SubLObject gather_tick_dataP = inference_metrics.inference_should_gather_tick_indexed_progress_dataP(inference);
        final SubLObject initial_arete_assertions_touched = kb_access_metering.$arete_assertions_touched$.getDynamicValue(thread);
        final SubLObject initial_arete_constants_touched = kb_access_metering.$arete_constants_touched$.getDynamicValue(thread);
        final SubLObject initial_arete_narts_touched = kb_access_metering.$arete_narts_touched$.getDynamicValue(thread);
        final SubLObject initial_arete_log_last_kb_touchP = kb_access_metering.$arete_log_last_kb_touchP$.getDynamicValue(thread);
        final SubLObject initial_arete_log_kb_touchesP = kb_access_metering.$arete_log_kb_touchesP$.getDynamicValue(thread);
        SubLObject final_arete_assertions_touched = NIL;
        SubLObject final_arete_constants_touched = NIL;
        SubLObject final_arete_narts_touched = NIL;
        final SubLObject _prev_bind_0 = kb_access_metering.$arete_assertions_touched$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_access_metering.$arete_constants_touched$.currentBinding(thread);
        final SubLObject _prev_bind_3 = kb_access_metering.$arete_narts_touched$.currentBinding(thread);
        final SubLObject _prev_bind_4 = kb_access_metering.$arete_log_last_kb_touchP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = kb_access_metering.$arete_log_kb_touchesP$.currentBinding(thread);
        try {
            kb_access_metering.$arete_assertions_touched$.bind(NIL != gather_tick_dataP ? set.new_set(UNPROVIDED, UNPROVIDED) : initial_arete_assertions_touched, thread);
            kb_access_metering.$arete_constants_touched$.bind(NIL != gather_tick_dataP ? set.new_set(UNPROVIDED, UNPROVIDED) : initial_arete_constants_touched, thread);
            kb_access_metering.$arete_narts_touched$.bind(NIL != gather_tick_dataP ? set.new_set(UNPROVIDED, UNPROVIDED) : initial_arete_narts_touched, thread);
            kb_access_metering.$arete_log_last_kb_touchP$.bind(NIL != gather_tick_dataP ? T : initial_arete_log_last_kb_touchP, thread);
            kb_access_metering.$arete_log_kb_touchesP$.bind(NIL != gather_tick_dataP ? T : initial_arete_log_kb_touchesP, thread);
            final SubLObject abort_max_time = timeout;
            if (NIL != abort_max_time) {
                SubLObject timed_out = NIL;
                final SubLObject tag = with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$15 = $within_with_timeout$.currentBinding(thread);
                    try {
                        $within_with_timeout$.bind(T, thread);
                        SubLObject timer = NIL;
                        try {
                            final SubLObject _prev_bind_0_$16 = $with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = with_timeout_start_timer(abort_max_time, tag);
                                final SubLObject store_var = store;
                                final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
                                final SubLObject _prev_bind_0_$17 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                                        final SubLObject _prev_bind_0_$18 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$19 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$20 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                            try {
                                                final SubLObject _prev_bind_0_$19 = inference_datastructures_problem_store.$problem_store_modification_permittedP$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$20 = $recursive_queries_in_currently_active_problem_storeP$.currentBinding(thread);
                                                try {
                                                    inference_datastructures_problem_store.$problem_store_modification_permittedP$.bind(T, thread);
                                                    $recursive_queries_in_currently_active_problem_storeP$.bind(strategist_wants_recursive_queries_in_currently_active_problem_storeP(), thread);
                                                    inference_do_forward_propagation(inference);
                                                    SubLObject doneP;
                                                    SubLObject padP;
                                                    for (padP = doneP = NIL; NIL == doneP; doneP = makeBoolean((NIL != padP) || (NIL != simplest_inference_doneP(inference)))) {
                                                        possibly_wait_for_inference_to_unblock(inference);
                                                        inference_tactician.strategy_do_one_step(strategy);
                                                        simplest_inference_possibly_prune(inference);
                                                    }
                                                    inference_tactician.strategy_throw_away_uninteresting_set_asides(strategy);
                                                    result = simplest_inference_determine_result(inference, padP);
                                                    if ($INTERRUPT == result) {
                                                        inference_datastructures_inference.inference_handle_interrupts(inference);
                                                    }
                                                } finally {
                                                    $recursive_queries_in_currently_active_problem_storeP$.rebind(_prev_bind_1_$20, thread);
                                                    inference_datastructures_problem_store.$problem_store_modification_permittedP$.rebind(_prev_bind_0_$19, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2_$20, thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$19, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$18, thread);
                                        }
                                        inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                                    } finally {
                                        final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$17, thread);
                                }
                            } finally {
                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$16, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                with_timeout_stop_timer(timer);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                    } finally {
                        $within_with_timeout$.rebind(_prev_bind_0_$15, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != timed_out) {
                    result = $MAX_TIME;
                }
            } else {
                final SubLObject store_var2 = store;
                final SubLObject local_state2 = inference_datastructures_problem_store.problem_store_memoization_state(store_var2);
                final SubLObject _prev_bind_0_$23 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state2, thread);
                    final SubLObject original_memoization_process2 = memoization_state.memoization_state_original_process(local_state2);
                    try {
                        SubLObject space_var2 = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var2);
                        final SubLObject _prev_bind_0_$24 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$21 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$21 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var2, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                            try {
                                final SubLObject _prev_bind_0_$25 = inference_datastructures_problem_store.$problem_store_modification_permittedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$22 = $recursive_queries_in_currently_active_problem_storeP$.currentBinding(thread);
                                try {
                                    inference_datastructures_problem_store.$problem_store_modification_permittedP$.bind(T, thread);
                                    $recursive_queries_in_currently_active_problem_storeP$.bind(strategist_wants_recursive_queries_in_currently_active_problem_storeP(), thread);
                                    inference_do_forward_propagation(inference);
                                    SubLObject doneP2;
                                    SubLObject padP2;
                                    for (padP2 = doneP2 = NIL; NIL == doneP2; doneP2 = makeBoolean((NIL != padP2) || (NIL != simplest_inference_doneP(inference)))) {
                                        possibly_wait_for_inference_to_unblock(inference);
                                        inference_tactician.strategy_do_one_step(strategy);
                                        simplest_inference_possibly_prune(inference);
                                    }
                                    inference_tactician.strategy_throw_away_uninteresting_set_asides(strategy);
                                    result = simplest_inference_determine_result(inference, padP2);
                                    if ($INTERRUPT == result) {
                                        inference_datastructures_inference.inference_handle_interrupts(inference);
                                    }
                                } finally {
                                    $recursive_queries_in_currently_active_problem_storeP$.rebind(_prev_bind_1_$22, thread);
                                    inference_datastructures_problem_store.$problem_store_modification_permittedP$.rebind(_prev_bind_0_$25, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    space_var2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2_$21, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$21, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$24, thread);
                        }
                        inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var2, space_var2);
                    } finally {
                        final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values5 = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state2, original_memoization_process2);
                            restoreValuesFromVector(_values5);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$23, thread);
                }
            }
            final_arete_assertions_touched = kb_access_metering.$arete_assertions_touched$.getDynamicValue(thread);
            final_arete_constants_touched = kb_access_metering.$arete_constants_touched$.getDynamicValue(thread);
            final_arete_narts_touched = kb_access_metering.$arete_narts_touched$.getDynamicValue(thread);
        } finally {
            kb_access_metering.$arete_log_kb_touchesP$.rebind(_prev_bind_5, thread);
            kb_access_metering.$arete_log_last_kb_touchP$.rebind(_prev_bind_4, thread);
            kb_access_metering.$arete_narts_touched$.rebind(_prev_bind_3, thread);
            kb_access_metering.$arete_constants_touched$.rebind(_prev_bind_2, thread);
            kb_access_metering.$arete_assertions_touched$.rebind(_prev_bind_0, thread);
        }
        if (NIL != initial_arete_assertions_touched) {
            kb_access_metering.$arete_assertions_touched$.setDynamicValue(NIL != gather_tick_dataP ? set_utilities.set_nmerge(initial_arete_assertions_touched, final_arete_assertions_touched) : final_arete_assertions_touched, thread);
        }
        if (NIL != initial_arete_constants_touched) {
            kb_access_metering.$arete_constants_touched$.setDynamicValue(NIL != gather_tick_dataP ? set_utilities.set_nmerge(initial_arete_constants_touched, final_arete_constants_touched) : final_arete_constants_touched, thread);
        }
        if (NIL != initial_arete_narts_touched) {
            kb_access_metering.$arete_narts_touched$.setDynamicValue(NIL != gather_tick_dataP ? set_utilities.set_nmerge(initial_arete_narts_touched, final_arete_narts_touched) : final_arete_narts_touched, thread);
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($EXHAUST == result)) && (NIL == inference_datastructures_inference.inference_continuableP(inference))) {
            Errors.error($str83$Non_continuable_inference_should_);
        }
        return result;
    }

    public static SubLObject strategist_wants_recursive_queries_in_currently_active_problem_storeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != booleanp($recursive_queries_in_currently_active_problem_storeP$.getDynamicValue(thread))) {
            result = $recursive_queries_in_currently_active_problem_storeP$.getDynamicValue(thread);
        } else
            if (NIL != sksi_query_utilities.some_sksi_removal_module_registeredP()) {
                result = NIL;
            } else {
                result = T;
            }

        return result;
    }

    public static SubLObject inference_do_forward_propagation(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject forward_max_time = inference_datastructures_inference.inference_forward_max_time(inference);
        final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
        if (forward_max_time.isInteger() && forward_max_time.numG(ZERO_INTEGER)) {
            if (NIL == inference_datastructures_forward_propagate.forward_propagate_p(inference_datastructures_inference.inference_forward_propagate(inference))) {
                inference_datastructures_inference.set_inference_forward_propagate(inference, inference_datastructures_forward_propagate.new_forward_propagate(mt));
            }
            final SubLObject store_var;
            final SubLObject store = store_var = inference_datastructures_inference.inference_problem_store(inference);
            final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                    final SubLObject _prev_bind_0_$34 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                        try {
                            forward_propagate_assertions.inference_forward_propagate_mt(inference_datastructures_inference.inference_forward_propagate(inference), mt, NIL, forward_max_time, NIL);
                        } finally {
                            final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$34, thread);
                    }
                    inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                } finally {
                    final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject simplest_inference_doneP(final SubLObject inference) {
        if (NIL != simplest_inference_exhaustedP(inference)) {
            return T;
        }
        return list_utilities.sublisp_boolean(inference_determine_type_independent_result(inference));
    }

    public static SubLObject possibly_wait_for_inference_to_unblock(final SubLObject inference) {
        if (NIL != inference_datastructures_inference.inference_blockingP(inference)) {
            wait_for_inference_to_unblock();
            return T;
        }
        return NIL;
    }

    public static SubLObject simplest_inference_possibly_prune(final SubLObject inference) {
        if (((NIL != inference_max_problem_count_reachedP(inference)) || (NIL != inference_max_proof_count_reachedP(inference))) || (NIL != inference_prune_frequency_reachedP(inference))) {
            if (NIL != inference_crazy_max_problem_count_reachedP(inference)) {
                final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                Errors.error($str84$Crazy_amount_of_problems___a__in_, inference_datastructures_problem_store.problem_store_problem_count(store), store);
            }
            final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
            return inference_tactician.strategy_do_problem_store_prune(strategy);
        }
        return NIL;
    }

    public static SubLObject inference_prune_frequency_reachedP(final SubLObject inference) {
        return NIL;
    }

    public static SubLObject simplest_inference_determine_result(final SubLObject inference, final SubLObject padP) {
        if (NIL != padP) {
            return $PROBABLY_APPROXIMATELY_DONE;
        }
        final SubLObject result = inference_determine_type_independent_result(inference);
        if (NIL != result) {
            return result;
        }
        if (NIL == simplest_inference_exhaustedP(inference)) {
            return NIL;
        }
        if (NIL != simplest_inference_continuation_possibleP(inference)) {
            return $EXHAUST;
        }
        return $EXHAUST_TOTAL;
    }

    public static SubLObject simplest_inference_continuation_possibleP(final SubLObject inference) {
        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        return inference_tactician.strategy_continuation_possibleP(strategy);
    }

    public static SubLObject simplest_inference_exhaustedP(final SubLObject inference) {
        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        return inference_tactician.strategy_doneP(strategy);
    }

    public static SubLObject simplest_inference_totally_exhaustedP(final SubLObject inference) {
        return makeBoolean((NIL != simplest_inference_exhaustedP(inference)) && (NIL == simplest_inference_continuation_possibleP(inference)));
    }

    public static SubLObject inference_note_proof(final SubLObject inference, final SubLObject proof) {
        if (NIL == new_inference_answer_from_proof(inference, proof)) {
        }
        return NIL;
    }

    public static SubLObject inference_note_no_good(final SubLObject inference) {
        return NIL;
    }

    public static SubLObject new_inference_answer_from_proof(final SubLObject inference, final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        inference_worker.perform_lazy_proof_rejection(proof, inference);
        if (NIL != inference_datastructures_proof.proof_provenP(proof)) {
            final SubLObject answer_bindings = inference_answer_bindings_from_proof(proof, inference);
            if (NIL == inference_disallows_answer_from_bindingsP(inference, answer_bindings)) {
                SubLObject v_answer = NIL;
                if (NIL != inference_datastructures_inference.inference_compute_answer_justificationsP(inference)) {
                    thread.resetMultipleValues();
                    final SubLObject hl_justification = inference_all_explanatory_and_non_explanatory_proof_supports(inference, proof);
                    final SubLObject hl_pragmatic_supports = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject answer_justification = inference_datastructures_inference.find_or_create_inference_answer_justification(inference, answer_bindings, hl_justification, hl_pragmatic_supports);
                    v_answer = inference_datastructures_inference.inference_answer_justification_answer(answer_justification);
                    inference_datastructures_inference.add_inference_answer_justification_proof(answer_justification, proof);
                } else {
                    v_answer = inference_datastructures_inference.find_or_create_inference_answer(inference, answer_bindings);
                }
                perform_inference_answer_proof_analysis(v_answer, proof);
                inference_worker.possibly_note_proof_processed(proof);
                return v_answer;
            }
        }
        return NIL;
    }

    public static SubLObject inference_disallows_answer_from_bindingsP(final SubLObject inference, final SubLObject answer_bindings) {
        if ((NIL == inference_datastructures_inference.inference_allow_indeterminate_resultsP(inference)) && (NIL != some_answer_bindings_are_indeterminateP(answer_bindings))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject inference_disallows_answer_from_proofP(final SubLObject inference, final SubLObject proof) {
        final SubLObject answer_bindings = inference_answer_bindings_from_proof(proof, inference);
        return inference_disallows_answer_from_bindingsP(inference, answer_bindings);
    }

    public static SubLObject some_answer_bindings_are_indeterminateP(final SubLObject answer_bindings) {
        SubLObject cdolist_list_var = answer_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list87);
            variable = current.first();
            current = value = current.rest();
            if (NIL != inference_trampolines.inference_indeterminate_termP(value)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject some_answer_bindings_are_hlP(final SubLObject answer_bindings) {
        SubLObject cdolist_list_var = answer_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list87);
            variable = current.first();
            current = value = current.rest();
            if (NIL != cycl_utilities.expression_find_if(symbol_function(TERM_REQUIRES_HL_LANGUAGE), value, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject term_requires_hl_language(final SubLObject v_object) {
        return makeBoolean((NIL != nart_handles.nart_p(v_object)) || (NIL != assertion_handles.assertion_p(v_object)));
    }

    public static SubLObject inference_all_explanatory_and_non_explanatory_proof_supports(final SubLObject inference, final SubLObject proof) {
        final SubLObject all_subproofs = inference_datastructures_proof.all_proof_subproofs(proof);
        final SubLObject non_explanatory_subproofs = inference_worker.inference_proof_non_explanatory_subproofs(inference, proof);
        SubLObject explanatory_supports = NIL;
        SubLObject non_explanatory_supports = NIL;
        SubLObject cdolist_list_var = all_subproofs;
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject non_explanatoryP = subl_promotions.memberP(subproof, non_explanatory_subproofs, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var_$37;
            final SubLObject supports = cdolist_list_var_$37 = inference_datastructures_proof.proof_supports(subproof);
            SubLObject support = NIL;
            support = cdolist_list_var_$37.first();
            while (NIL != cdolist_list_var_$37) {
                if (NIL != non_explanatoryP) {
                    final SubLObject item_var = support;
                    if (NIL == member(item_var, non_explanatory_supports, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        non_explanatory_supports = cons(item_var, non_explanatory_supports);
                    }
                } else {
                    final SubLObject item_var = support;
                    if (NIL == member(item_var, explanatory_supports, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        explanatory_supports = cons(item_var, explanatory_supports);
                    }
                }
                cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                support = cdolist_list_var_$37.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        if (NIL != explanatory_supports) {
            explanatory_supports = arguments.canonicalize_hl_justification(explanatory_supports);
        }
        if (NIL != non_explanatory_supports) {
            non_explanatory_supports = arguments.canonicalize_hl_justification(non_explanatory_supports);
        }
        return values(explanatory_supports, non_explanatory_supports);
    }

    public static SubLObject inference_answer_bindings_from_proof(final SubLObject proof, final SubLObject inference) {
        final SubLObject all_hl_bindings = inference_hl_bindings_from_proof(proof, inference);
        final SubLObject hl_bindings = filter_out_uninteresting_bindings(all_hl_bindings, inference_datastructures_inference.inference_free_hl_vars(inference));
        final SubLObject all_el_bindings = inference_datastructures_inference.inference_el_bindings(inference);
        final SubLObject free_el_vars = inference_datastructures_inference.inference_free_el_vars(inference);
        final SubLObject el_bindings = filter_out_uninteresting_bindings(all_el_bindings, free_el_vars);
        final SubLObject disjunction_free_el_vars_policy = inference_datastructures_inference.inference_disjunction_free_el_vars_policy(inference);
        final SubLObject answer_bindings = (NIL != el_bindings) ? compose_el_answer_bindings(el_bindings, hl_bindings, free_el_vars, disjunction_free_el_vars_policy) : hl_bindings;
        return answer_bindings;
    }

    public static SubLObject filter_out_uninteresting_bindings(final SubLObject v_bindings, final SubLObject interesting_variables) {
        if (NIL != all_variables_in_bindings_interestingP(v_bindings, interesting_variables)) {
            return v_bindings;
        }
        SubLObject interesting_bindings = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list87);
            variable = current.first();
            current = value = current.rest();
            if (NIL != subl_promotions.memberP(variable, interesting_variables, UNPROVIDED, UNPROVIDED)) {
                interesting_bindings = cons(binding, interesting_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        interesting_bindings = nreverse(interesting_bindings);
        return interesting_bindings;
    }

    public static SubLObject all_variables_in_bindings_interestingP(final SubLObject v_bindings, final SubLObject interesting_variables) {
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject variable = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list87);
            variable = current.first();
            current = value = current.rest();
            if (NIL == list_utilities.member_eqP(variable, interesting_variables)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject compose_el_answer_bindings(final SubLObject el_bindings, final SubLObject hl_bindings, final SubLObject free_el_vars, final SubLObject free_el_vars_policy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($COMPUTE_UNION != free_el_vars_policy) {
            final SubLObject hl_vars1 = Mapping.mapcar(symbol_function(VARIABLE_BINDING_VALUE), el_bindings);
            final SubLObject hl_vars2 = Mapping.mapcar(symbol_function(VARIABLE_BINDING_VARIABLE), hl_bindings);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.sets_equalP(hl_vars1, hl_vars2, UNPROVIDED))) {
                Errors.error($str92$Expected_a_one_to_one_match_betwe, el_bindings, hl_bindings);
            }
        }
        SubLObject el_answer_bindings = bindings.compose_bindings(el_bindings, hl_bindings);
        el_answer_bindings = bindings.stable_sort_bindings(el_answer_bindings, free_el_vars);
        return el_answer_bindings;
    }

    public static SubLObject inference_hl_bindings_from_proof(final SubLObject proof, final SubLObject inference) {
        final SubLObject proof_hl_bindings = inference_datastructures_proof.proof_bindings(proof);
        final SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference);
        final SubLObject mapped_root_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(answer_link);
        final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_root_problem);
        final SubLObject hl_bindings = bindings.transfer_variable_map_to_bindings(variable_map, proof_hl_bindings);
        return hl_bindings;
    }

    public static SubLObject inference_processed_proof_pruning_initial_threshold_metP(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $processed_proof_pruning_initial_threshold$.getDynamicValue(thread)) && inference_datastructures_problem_store.problem_store_historical_proof_count(inference_datastructures_inference.inference_problem_store(inference)).numGE($processed_proof_pruning_initial_threshold$.getDynamicValue(thread)));
    }

    public static SubLObject inference_processed_proof_pruning_variable_threshold_metP(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $processed_proof_pruning_frequency$.getDynamicValue(thread)) && subtract(inference_datastructures_problem_store.problem_store_historical_proof_count(inference_datastructures_inference.inference_problem_store(inference)), inference_datastructures_inference.inference_proof_watermark(inference)).numGE($processed_proof_pruning_frequency$.getDynamicValue(thread)));
    }

    public static SubLObject inference_possibly_prune_processed_proofs(final SubLObject inference) {
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        SubLObject total_pruned = ZERO_INTEGER;
        if ((NIL != inference_datastructures_problem_store.problem_store_allows_proof_processingP(store)) && ((NIL != cyc_testing.testing_real_time_pruningP()) || ((NIL != inference_processed_proof_pruning_initial_threshold_metP(inference)) && (NIL != inference_processed_proof_pruning_variable_threshold_metP(inference))))) {
            inference_datastructures_inference.set_inference_proof_watermark(inference, inference_datastructures_problem_store.problem_store_historical_proof_count(store));
            final SubLObject prune_count = inference_worker.possibly_prune_processed_proofs(store);
            total_pruned = add(total_pruned, prune_count);
            if (prune_count.isPositive()) {
                total_pruned = add(total_pruned, inference_worker.prune_problem_store(store, NIL));
            }
        }
        return total_pruned;
    }

    public static SubLObject perform_inference_answer_proof_analysis(final SubLObject v_answer, final SubLObject proof) {
        final SubLObject subproofs = inference_datastructures_proof.all_proof_subproofs(proof);
        SubLObject rules = NIL;
        SubLObject cdolist_list_var = subproofs;
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_worker_transformation.generalized_transformation_proof_p(subproof)) {
                final SubLObject store = inference_datastructures_proof.proof_store(proof);
                final SubLObject item_var;
                final SubLObject rule = item_var = inference_worker_transformation.generalized_transformation_proof_rule_assertion(subproof);
                if (NIL == member(item_var, rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                    rules = cons(item_var, rules);
                }
                inference_datastructures_problem_store.problem_store_note_transformation_rule_success(store, rule);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        inference_analysis.note_inference_answer_proof_rules(rules);
        return NIL;
    }

    public static SubLObject cache_inference_answer(final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $current_inference_answer_being_cached$.currentBinding(thread);
        try {
            $current_inference_answer_being_cached$.bind(v_answer, thread);
            SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
            SubLObject justification = NIL;
            justification = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$38 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                SubLObject proof = NIL;
                proof = cdolist_list_var_$38.first();
                while (NIL != cdolist_list_var_$38) {
                    final SubLObject _prev_bind_0_$39 = $current_inference_answer_justification_proof_being_cached$.currentBinding(thread);
                    try {
                        $current_inference_answer_justification_proof_being_cached$.bind(proof, thread);
                        cache_proof(proof);
                    } finally {
                        $current_inference_answer_justification_proof_being_cached$.rebind(_prev_bind_0_$39, thread);
                    }
                    cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                    proof = cdolist_list_var_$38.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                justification = cdolist_list_var.first();
            } 
        } finally {
            $current_inference_answer_being_cached$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject cache_proof(final SubLObject proof) {
        cache_proof_supports(proof);
        return proof;
    }

    public static SubLObject cache_proof_supports(final SubLObject proof) {
        if ((NIL == inference_datastructures_proof.proof_has_subproofsP(proof)) && (NIL != list_utilities.lengthLE(inference_datastructures_proof.proof_direct_supports(proof), ONE_INTEGER, UNPROVIDED))) {
            final SubLObject supports = inference_datastructures_proof.proof_direct_supports(proof);
            return copy_list(supports);
        }
        SubLObject supports_copy = copy_list(inference_datastructures_proof.proof_direct_supports(proof));
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            supports_copy = nconc(cache_proof_supports(subproof), supports_copy);
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        } 
        supports_copy = nreverse(list_utilities.fast_delete_duplicates(supports_copy, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if ((NIL == inference_worker.structural_proof_p(proof)) && (NIL != list_utilities.lengthGE(supports_copy, TWO_INTEGER, UNPROVIDED))) {
            add_deduction_for_proof(proof, supports_copy);
        }
        return supports_copy;
    }

    public static SubLObject add_deduction_for_proof(final SubLObject proof, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = inference_worker.proof_proven_query(proof);
        assert NIL != clause_utilities.atomic_clauses_p(query) : "clause_utilities.atomic_clauses_p(query) " + "CommonSymbols.NIL != clause_utilities.atomic_clauses_p(query) " + query;
        final SubLObject clause = query.first();
        assert NIL != clauses.atomic_clause_p(clause) : "clauses.atomic_clause_p(clause) " + "CommonSymbols.NIL != clauses.atomic_clause_p(clause) " + clause;
        SubLObject truth = NIL;
        if (NIL != clause_utilities.pos_atomic_clause_p(clause)) {
            truth = $TRUE;
        } else {
            truth = $FALSE;
        }
        final SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(clause);
        SubLObject current;
        final SubLObject datum = current = contextualized_asent;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            final SubLObject deduction = hl_storage_modules.hl_add_deduction_for_gaf(asent, truth, mt, supports, $cached_ask_result_direction$.getDynamicValue(thread));
            final SubLObject redundantP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject assertion = (NIL != deduction_handles.deduction_p(deduction)) ? deductions_high.deduction_assertion(deduction) : NIL;
            if (NIL != assertion_handles.assertion_p(assertion)) {
                forward.queue_or_repropagate_forward_assertion(assertion);
            }
            return assertion;
        }
        cdestructuring_bind_error(datum, $list99);
        return NIL;
    }

    public static SubLObject with_query_abort_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject time = NIL;
        destructuring_bind_must_consp(current, datum, $list100);
        time = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject timer = $sym101$TIMER;
        return list(CLET, list(timer), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, timer, list(WITH_QUERY_ABORT_TIMEOUT_START_TIMER, time)), append(body, NIL)), list(WITH_QUERY_ABORT_TIMEOUT_STOP_TIMER, timer)));
    }

    public static SubLObject with_query_abort_timeout_start_timer(final SubLObject time) {
        if (NIL == time) {
            return NIL;
        }
        final SubLObject client_semaphore = Semaphores.new_semaphore($str106$WITH_QUERY_ABORT_TIMEOUT_client, ZERO_INTEGER);
        final SubLObject timer_semaphore = Semaphores.new_semaphore($str107$WITH_QUERY_ABORT_TIMEOUT_timer, ZERO_INTEGER);
        final SubLObject timer = subl_promotions.make_process_with_args($str107$WITH_QUERY_ABORT_TIMEOUT_timer, WITH_QUERY_ABORT_TIMEOUT_TIMER_THREAD, list(current_process(), time, client_semaphore, timer_semaphore));
        Semaphores.semaphore_signal(client_semaphore);
        Semaphores.semaphore_wait(timer_semaphore);
        return timer;
    }

    public static SubLObject with_query_abort_timeout_stop_timer(final SubLObject timer) {
        if (NIL != valid_process_p(timer)) {
            return kill_process(timer);
        }
        return NIL;
    }

    public static SubLObject with_query_abort_timeout_timer_thread(final SubLObject client, final SubLObject time, final SubLObject client_semaphore, final SubLObject timer_semaphore) {
        Semaphores.semaphore_signal(timer_semaphore);
        Semaphores.semaphore_wait(client_semaphore);
        sleep(time);
        with_query_abort_timeout_signal_query_abort_timeout(client);
        return NIL;
    }

    public static SubLObject with_query_abort_timeout_signal_query_abort_timeout(final SubLObject client) {
        if (NIL != valid_process_p(client)) {
            return interrupt_process(client, QUERY_ABORT);
        }
        return NIL;
    }

    public static SubLObject declare_inference_strategist_file() {
        declareMacro(me, "catch_inference_abort", "CATCH-INFERENCE-ABORT");
        declareFunction(me, "signal_inference_control_process_abort", "SIGNAL-INFERENCE-CONTROL-PROCESS-ABORT", 0, 0, false);
        declareFunction(me, "query_abort", "QUERY-ABORT", 0, 0, false);
        declareFunction(me, "query_interrupt", "QUERY-INTERRUPT", 0, 1, false);
        declareFunction(me, "query_interrupt_int", "QUERY-INTERRUPT-INT", 3, 0, false);
        declareMacro(me, "catch_inference_error", "CATCH-INFERENCE-ERROR");
        declareMacro(me, "with_inference_error_handling", "WITH-INFERENCE-ERROR-HANDLING");
        declareFunction(me, "inference_error_handler", "INFERENCE-ERROR-HANDLER", 0, 0, false);
        declareMacro(me, "with_inference_max_time_timeout", "WITH-INFERENCE-MAX-TIME-TIMEOUT");
        declareFunction(me, "inference_abort_max_time", "INFERENCE-ABORT-MAX-TIME", 1, 0, false);
        declareFunction(me, "explicify_inference_mode_defaults", "EXPLICIFY-INFERENCE-MODE-DEFAULTS", 1, 0, false);
        declareFunction(me, "implicify_inference_mode_defaults", "IMPLICIFY-INFERENCE-MODE-DEFAULTS", 1, 0, false);
        declareFunction(me, "query_property_value", "QUERY-PROPERTY-VALUE", 2, 0, false);
        declareFunction(me, "strengthen_query_properties_using_inference", "STRENGTHEN-QUERY-PROPERTIES-USING-INFERENCE", 1, 0, false);
        declareFunction(me, "inference_prepare", "INFERENCE-PREPARE", 3, 0, false);
        declareFunction(me, "inference_prepare_from_dnf", "INFERENCE-PREPARE-FROM-DNF", 3, 0, false);
        declareFunction(me, "inference_prepare_int", "INFERENCE-PREPARE-INT", 1, 0, false);
        declareFunction(me, "simplest_inference_prepare", "SIMPLEST-INFERENCE-PREPARE", 1, 0, false);
        declareFunction(me, "simplest_inference_prepare_new", "SIMPLEST-INFERENCE-PREPARE-NEW", 8, 0, false);
        declareFunction(me, "simplest_inference_prepare_new_from_dnf", "SIMPLEST-INFERENCE-PREPARE-NEW-FROM-DNF", 7, 0, false);
        declareFunction(me, "note_inference_tautology_justification", "NOTE-INFERENCE-TAUTOLOGY-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "preparing_inferenceP", "PREPARING-INFERENCE?", 0, 0, false);
        declareFunction(me, "prepare_inference_hl_query", "PREPARE-INFERENCE-HL-QUERY", 3, 0, false);
        declareFunction(me, "prepare_inference_hl_query_int", "PREPARE-INFERENCE-HL-QUERY-INT", 4, 0, false);
        declareFunction(me, "hypothesize_antecedent", "HYPOTHESIZE-ANTECEDENT", 2, 0, false);
        declareFunction(me, "inference_conditional_sentence_p", "INFERENCE-CONDITIONAL-SENTENCE-P", 1, 0, false);
        declareFunction(me, "inference_possibly_simplify_conditional_sentence", "INFERENCE-POSSIBLY-SIMPLIFY-CONDITIONAL-SENTENCE", 1, 0, false);
        declareFunction(me, "prepare_inference_hl_query_from_dnf", "PREPARE-INFERENCE-HL-QUERY-FROM-DNF", 3, 0, false);
        declareFunction(me, "inference_initial_relevant_strategies", "INFERENCE-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction(me, "inference_update_dynamic_properties", "INFERENCE-UPDATE-DYNAMIC-PROPERTIES", 2, 0, false);
        declareFunction(me, "query_dynamic_properties_have_strategically_interesting_extensionP", "QUERY-DYNAMIC-PROPERTIES-HAVE-STRATEGICALLY-INTERESTING-EXTENSION?", 2, 0, false);
        declareFunction(me, "depth_cutoff_L", "DEPTH-CUTOFF-<", 2, 0, false);
        declareFunction(me, "inference_set_dynamic_properties", "INFERENCE-SET-DYNAMIC-PROPERTIES", 2, 0, false);
        declareFunction(me, "inference_strategist_max_proof_depth_from_properties", "INFERENCE-STRATEGIST-MAX-PROOF-DEPTH-FROM-PROPERTIES", 2, 0, false);
        declareFunction(me, "inference_run", "INFERENCE-RUN", 1, 0, false);
        declareFunction(me, "inference_suspend", "INFERENCE-SUSPEND", 2, 0, false);
        declareFunction(me, "inference_suspend_due_to_max_problem_count", "INFERENCE-SUSPEND-DUE-TO-MAX-PROBLEM-COUNT", 1, 0, false);
        declareFunction(me, "inference_suspend_due_to_max_number", "INFERENCE-SUSPEND-DUE-TO-MAX-NUMBER", 1, 0, false);
        declareFunction(me, "inference_suspend_due_to_max_time", "INFERENCE-SUSPEND-DUE-TO-MAX-TIME", 1, 0, false);
        declareFunction(me, "inference_suspend_due_to_max_step", "INFERENCE-SUSPEND-DUE-TO-MAX-STEP", 1, 0, false);
        declareFunction(me, "inference_suspend_due_to_pad", "INFERENCE-SUSPEND-DUE-TO-PAD", 1, 0, false);
        declareFunction(me, "inference_interrupt_external", "INFERENCE-INTERRUPT-EXTERNAL", 1, 1, false);
        declareFunction(me, "inference_interrupt", "INFERENCE-INTERRUPT", 1, 1, false);
        declareFunction(me, "inference_interrupt_int", "INFERENCE-INTERRUPT-INT", 1, 0, false);
        declareFunction(me, "inference_abort", "INFERENCE-ABORT", 1, 0, false);
        declareFunction(me, "inference_abort_after_delay", "INFERENCE-ABORT-AFTER-DELAY", 1, 1, false);
        declareFunction(me, "inference_abort_if_running", "INFERENCE-ABORT-IF-RUNNING", 1, 0, false);
        declareFunction(me, "abort_current_controlling_inference", "ABORT-CURRENT-CONTROLLING-INFERENCE", 0, 0, false);
        declareFunction(me, "inference_abort_int", "INFERENCE-ABORT-INT", 1, 0, false);
        declareFunction(me, "wait_for_inference_to_unblock", "WAIT-FOR-INFERENCE-TO-UNBLOCK", 0, 0, false);
        declareFunction(me, "signal_inference_to_unblock", "SIGNAL-INFERENCE-TO-UNBLOCK", 1, 0, false);
        declareFunction(me, "signal_inference_to_finish", "SIGNAL-INFERENCE-TO-FINISH", 1, 0, false);
        declareFunction(me, "inference_max_number_reachedP", "INFERENCE-MAX-NUMBER-REACHED?", 1, 0, false);
        declareFunction(me, "inference_max_time_reachedP", "INFERENCE-MAX-TIME-REACHED?", 1, 0, false);
        declareFunction(me, "current_controlling_inference_max_time_reachedP", "CURRENT-CONTROLLING-INFERENCE-MAX-TIME-REACHED?", 0, 0, false);
        declareFunction(me, "current_controlling_inference_time_remaining", "CURRENT-CONTROLLING-INFERENCE-TIME-REMAINING", 0, 0, false);
        declareFunction(me, "inference_max_step_reachedP", "INFERENCE-MAX-STEP-REACHED?", 1, 0, false);
        declareFunction(me, "inference_max_problem_count_reachedP", "INFERENCE-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
        declareFunction(me, "inference_max_proof_count_reachedP", "INFERENCE-MAX-PROOF-COUNT-REACHED?", 1, 0, false);
        declareFunction(me, "inference_crazy_max_problem_count_reachedP", "INFERENCE-CRAZY-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
        declareFunction(me, "inference_probably_approximately_doneP", "INFERENCE-PROBABLY-APPROXIMATELY-DONE?", 1, 0, false);
        declareFunction(me, "inference_halt_condition_reachedP", "INFERENCE-HALT-CONDITION-REACHED?", 1, 0, false);
        declareFunction(me, "inference_determine_type_independent_result", "INFERENCE-DETERMINE-TYPE-INDEPENDENT-RESULT", 1, 0, false);
        declareFunction(me, "strategy_type_from_sentence_and_static_properties", "STRATEGY-TYPE-FROM-SENTENCE-AND-STATIC-PROPERTIES", 3, 0, false);
        declareFunction(me, "strategy_type_from_dnf_and_static_properties", "STRATEGY-TYPE-FROM-DNF-AND-STATIC-PROPERTIES", 3, 0, false);
        declareFunction(me, "strategy_type_from_static_properties", "STRATEGY-TYPE-FROM-STATIC-PROPERTIES", 1, 0, false);
        declareFunction(me, "properties_indicate_forward_inferenceP", "PROPERTIES-INDICATE-FORWARD-INFERENCE?", 1, 0, false);
        declareFunction(me, "inference_permits_transformationP", "INFERENCE-PERMITS-TRANSFORMATION?", 1, 0, false);
        declareFunction(me, "determine_best_strategy_type_for_inference", "DETERMINE-BEST-STRATEGY-TYPE-FOR-INFERENCE", 1, 0, false);
        declareFunction(me, "consider_switching_strategies", "CONSIDER-SWITCHING-STRATEGIES", 1, 0, false);
        declareFunction(me, "inference_switch_strategies", "INFERENCE-SWITCH-STRATEGIES", 2, 0, false);
        declareFunction(me, "simplest_inference_run_handler", "SIMPLEST-INFERENCE-RUN-HANDLER", 1, 0, false);
        declareFunction(me, "strategist_wants_recursive_queries_in_currently_active_problem_storeP", "STRATEGIST-WANTS-RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?", 0, 0, false);
        declareFunction(me, "inference_do_forward_propagation", "INFERENCE-DO-FORWARD-PROPAGATION", 1, 0, false);
        declareFunction(me, "simplest_inference_doneP", "SIMPLEST-INFERENCE-DONE?", 1, 0, false);
        declareFunction(me, "possibly_wait_for_inference_to_unblock", "POSSIBLY-WAIT-FOR-INFERENCE-TO-UNBLOCK", 1, 0, false);
        declareFunction(me, "simplest_inference_possibly_prune", "SIMPLEST-INFERENCE-POSSIBLY-PRUNE", 1, 0, false);
        declareFunction(me, "inference_prune_frequency_reachedP", "INFERENCE-PRUNE-FREQUENCY-REACHED?", 1, 0, false);
        declareFunction(me, "simplest_inference_determine_result", "SIMPLEST-INFERENCE-DETERMINE-RESULT", 2, 0, false);
        declareFunction(me, "simplest_inference_continuation_possibleP", "SIMPLEST-INFERENCE-CONTINUATION-POSSIBLE?", 1, 0, false);
        declareFunction(me, "simplest_inference_exhaustedP", "SIMPLEST-INFERENCE-EXHAUSTED?", 1, 0, false);
        declareFunction(me, "simplest_inference_totally_exhaustedP", "SIMPLEST-INFERENCE-TOTALLY-EXHAUSTED?", 1, 0, false);
        declareFunction(me, "inference_note_proof", "INFERENCE-NOTE-PROOF", 2, 0, false);
        declareFunction(me, "inference_note_no_good", "INFERENCE-NOTE-NO-GOOD", 1, 0, false);
        declareFunction(me, "new_inference_answer_from_proof", "NEW-INFERENCE-ANSWER-FROM-PROOF", 2, 0, false);
        declareFunction(me, "inference_disallows_answer_from_bindingsP", "INFERENCE-DISALLOWS-ANSWER-FROM-BINDINGS?", 2, 0, false);
        declareFunction(me, "inference_disallows_answer_from_proofP", "INFERENCE-DISALLOWS-ANSWER-FROM-PROOF?", 2, 0, false);
        declareFunction(me, "some_answer_bindings_are_indeterminateP", "SOME-ANSWER-BINDINGS-ARE-INDETERMINATE?", 1, 0, false);
        declareFunction(me, "some_answer_bindings_are_hlP", "SOME-ANSWER-BINDINGS-ARE-HL?", 1, 0, false);
        declareFunction(me, "term_requires_hl_language", "TERM-REQUIRES-HL-LANGUAGE", 1, 0, false);
        declareFunction(me, "inference_all_explanatory_and_non_explanatory_proof_supports", "INFERENCE-ALL-EXPLANATORY-AND-NON-EXPLANATORY-PROOF-SUPPORTS", 2, 0, false);
        declareFunction(me, "inference_answer_bindings_from_proof", "INFERENCE-ANSWER-BINDINGS-FROM-PROOF", 2, 0, false);
        declareFunction(me, "filter_out_uninteresting_bindings", "FILTER-OUT-UNINTERESTING-BINDINGS", 2, 0, false);
        declareFunction(me, "all_variables_in_bindings_interestingP", "ALL-VARIABLES-IN-BINDINGS-INTERESTING?", 2, 0, false);
        declareFunction(me, "compose_el_answer_bindings", "COMPOSE-EL-ANSWER-BINDINGS", 4, 0, false);
        declareFunction(me, "inference_hl_bindings_from_proof", "INFERENCE-HL-BINDINGS-FROM-PROOF", 2, 0, false);
        declareFunction(me, "inference_processed_proof_pruning_initial_threshold_metP", "INFERENCE-PROCESSED-PROOF-PRUNING-INITIAL-THRESHOLD-MET?", 1, 0, false);
        declareFunction(me, "inference_processed_proof_pruning_variable_threshold_metP", "INFERENCE-PROCESSED-PROOF-PRUNING-VARIABLE-THRESHOLD-MET?", 1, 0, false);
        declareFunction(me, "inference_possibly_prune_processed_proofs", "INFERENCE-POSSIBLY-PRUNE-PROCESSED-PROOFS", 1, 0, false);
        declareFunction(me, "perform_inference_answer_proof_analysis", "PERFORM-INFERENCE-ANSWER-PROOF-ANALYSIS", 2, 0, false);
        declareFunction(me, "cache_inference_answer", "CACHE-INFERENCE-ANSWER", 1, 0, false);
        declareFunction(me, "cache_proof", "CACHE-PROOF", 1, 0, false);
        declareFunction(me, "cache_proof_supports", "CACHE-PROOF-SUPPORTS", 1, 0, false);
        declareFunction(me, "add_deduction_for_proof", "ADD-DEDUCTION-FOR-PROOF", 2, 0, false);
        declareMacro(me, "with_query_abort_timeout", "WITH-QUERY-ABORT-TIMEOUT");
        declareFunction(me, "with_query_abort_timeout_start_timer", "WITH-QUERY-ABORT-TIMEOUT-START-TIMER", 1, 0, false);
        declareFunction(me, "with_query_abort_timeout_stop_timer", "WITH-QUERY-ABORT-TIMEOUT-STOP-TIMER", 1, 0, false);
        declareFunction(me, "with_query_abort_timeout_timer_thread", "WITH-QUERY-ABORT-TIMEOUT-TIMER-THREAD", 4, 0, false);
        declareFunction(me, "with_query_abort_timeout_signal_query_abort_timeout", "WITH-QUERY-ABORT-TIMEOUT-SIGNAL-QUERY-ABORT-TIMEOUT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_strategist_file() {
        defvar("*RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?*", $STRATEGIST_DECIDES);
        defparameter("*WITHIN-INFERENCE-CONTROL-PROCESS?*", NIL);
        defparameter("*INFERENCE-MAX-TIME-TIMEOUT-ENABLED?*", T);
        deflexical("*TAUTOLOGY-PROBLEM-QUERY*", $list43);
        deflexical("*CONTRADICTION-PROBLEM-QUERY*", NIL);
        defparameter("*PREPARING-INFERENCE?*", NIL);
        defvar("*DEFAULT-STRATEGY-TYPE*", $BALANCING);
        defvar("*EXHAUSTIVE-REMOVAL-STRATEGY-TYPE*", $REMOVAL);
        defvar("*FORWARD-STRATEGY-TYPE*", $REMOVAL);
        defparameter("*PROCESSED-PROOF-PRUNING-INITIAL-THRESHOLD*", $int$600);
        defparameter("*PROCESSED-PROOF-PRUNING-FREQUENCY*", $int$50);
        defparameter("*CURRENT-INFERENCE-ANSWER-BEING-CACHED*", NIL);
        defparameter("*CURRENT-INFERENCE-ANSWER-JUSTIFICATION-PROOF-BEING-CACHED*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_strategist_file() {
        note_funcall_helper_function(QUERY_INTERRUPT_INT);
        register_external_symbol(INFERENCE_INTERRUPT_EXTERNAL);
        register_macro_helper(WITH_QUERY_ABORT_TIMEOUT_START_TIMER, WITH_QUERY_ABORT_TIMEOUT);
        register_macro_helper(WITH_QUERY_ABORT_TIMEOUT_STOP_TIMER, WITH_QUERY_ABORT_TIMEOUT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_strategist_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_strategist_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_strategist_file();
    }

    static {




























































































































    }
}

/**
 * Total time: 799 ms
 */
