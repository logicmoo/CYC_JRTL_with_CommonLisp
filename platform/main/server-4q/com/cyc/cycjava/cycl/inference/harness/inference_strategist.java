/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.numeric_date_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.cycjava.cycl.inference.forward_propagate_assertions;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-STRATEGIST
 * source file: /cyc/top/cycl/inference/harness/inference-strategist.lisp
 * created:     2019/07/03 17:37:41
 */
public final class inference_strategist extends SubLTranslatedFile implements V12 {
    public static final SubLObject inference_all_explanatory_proof_supports(SubLObject inference, SubLObject proof) {
        {
            SubLObject all_subproofs = inference_datastructures_proof.all_proof_subproofs(proof);
            SubLObject non_explanatory_subproofs = inference_worker.inference_proof_non_explanatory_subproofs(inference, proof);
            SubLObject all_supports = NIL;
            SubLObject cdolist_list_var = all_subproofs;
            SubLObject subproof = NIL;
            for (subproof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof = cdolist_list_var.first()) {
                if (NIL == subl_promotions.memberP(subproof, non_explanatory_subproofs, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject supports = inference_datastructures_proof.proof_supports(subproof);
                        SubLObject cdolist_list_var_24 = supports;
                        SubLObject support = NIL;
                        for (support = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , support = cdolist_list_var_24.first()) {
                            {
                                SubLObject item_var = support;
                                if (NIL == member(item_var, all_supports, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    all_supports = cons(item_var, all_supports);
                                }
                            }
                        }
                    }
                }
            }
            all_supports = arguments.canonicalize_hl_justification(all_supports);
            return all_supports;
        }
    }

    public static final SubLFile me = new inference_strategist();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_strategist";


    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $recursive_queries_in_currently_active_problem_storeP$ = makeSymbol("*RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $within_inference_control_processP$ = makeSymbol("*WITHIN-INFERENCE-CONTROL-PROCESS?*");

    // defparameter
    /**
     * Temporary control variable; whether or not :MAX-TIME is enforced via
     * timeouts.
     */
    @LispMethod(comment = "Temporary control variable; whether or not :MAX-TIME is enforced via\r\ntimeouts.\ndefparameter\nTemporary control variable; whether or not :MAX-TIME is enforced via\ntimeouts.")
    private static final SubLSymbol $inference_max_time_timeout_enabledP$ = makeSymbol("*INFERENCE-MAX-TIME-TIMEOUT-ENABLED?*");

    // deflexical
    // The problem query that expresses a tautology.
    /**
     * The problem query that expresses a tautology.
     */
    @LispMethod(comment = "The problem query that expresses a tautology.\ndeflexical")
    private static final SubLSymbol $tautology_problem_query$ = makeSymbol("*TAUTOLOGY-PROBLEM-QUERY*");

    // deflexical
    // The problem query that expresses a contradiction.
    /**
     * The problem query that expresses a contradiction.
     */
    @LispMethod(comment = "The problem query that expresses a contradiction.\ndeflexical")
    private static final SubLSymbol $contradiction_problem_query$ = makeSymbol("*CONTRADICTION-PROBLEM-QUERY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $preparing_inferenceP$ = makeSymbol("*PREPARING-INFERENCE?*");

    // defvar
    /**
     * The strategy type to use unless there is a better one for a particular type
     * of inference.
     */
    @LispMethod(comment = "The strategy type to use unless there is a better one for a particular type\r\nof inference.\ndefvar\nThe strategy type to use unless there is a better one for a particular type\nof inference.")
    private static final SubLSymbol $default_strategy_type$ = makeSymbol("*DEFAULT-STRATEGY-TYPE*");

    // defvar
    /**
     * The strategy type that is best suited for removal-only zero-backchain asks
     * with no number or time cutoffs.
     */
    @LispMethod(comment = "The strategy type that is best suited for removal-only zero-backchain asks\r\nwith no number or time cutoffs.\ndefvar\nThe strategy type that is best suited for removal-only zero-backchain asks\nwith no number or time cutoffs.")
    private static final SubLSymbol $exhaustive_removal_strategy_type$ = makeSymbol("*EXHAUSTIVE-REMOVAL-STRATEGY-TYPE*");

    // defvar
    // The strategy type that is best suited for forward inference.
    /**
     * The strategy type that is best suited for forward inference.
     */
    @LispMethod(comment = "The strategy type that is best suited for forward inference.\ndefvar")
    private static final SubLSymbol $forward_strategy_type$ = makeSymbol("*FORWARD-STRATEGY-TYPE*");

    // defparameter
    /**
     * Once an inference has achieved this many proofs, we consider pruning
     * processed proofs.
     */
    @LispMethod(comment = "Once an inference has achieved this many proofs, we consider pruning\r\nprocessed proofs.\ndefparameter\nOnce an inference has achieved this many proofs, we consider pruning\nprocessed proofs.")
    public static final SubLSymbol $processed_proof_pruning_initial_threshold$ = makeSymbol("*PROCESSED-PROOF-PRUNING-INITIAL-THRESHOLD*");

    // defparameter
    /**
     * After the initial pruning threshold is met, we prune processed proofs again
     * every time we get this many new proofs.
     */
    @LispMethod(comment = "After the initial pruning threshold is met, we prune processed proofs again\r\nevery time we get this many new proofs.\ndefparameter\nAfter the initial pruning threshold is met, we prune processed proofs again\nevery time we get this many new proofs.")
    public static final SubLSymbol $processed_proof_pruning_frequency$ = makeSymbol("*PROCESSED-PROOF-PRUNING-FREQUENCY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $current_inference_answer_being_cached$ = makeSymbol("*CURRENT-INFERENCE-ANSWER-BEING-CACHED*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $current_inference_answer_justification_proof_being_cached$ = makeSymbol("*CURRENT-INFERENCE-ANSWER-JUSTIFICATION-PROOF-BEING-CACHED*");

    private static final SubLList $list1 = list(makeSymbol("SUSPEND-STATUS-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym2$ABORTED_P = makeUninternedSymbol("ABORTED-P");

    private static final SubLSymbol $INFERENCE_ABORT_TARGET = makeKeyword("INFERENCE-ABORT-TARGET");

    private static final SubLList $list6 = list(list(makeSymbol("*WITHIN-INFERENCE-CONTROL-PROCESS?*"), T));

    static private final SubLList $list9 = list(makeKeyword("ABORT"));

    private static final SubLList $list10 = list(list(makeSymbol("QUERY-ABORT")));

    private static final SubLString $$$Interruptor = makeString("Interruptor");

    private static final SubLSymbol QUERY_INTERRUPT_INT = makeSymbol("QUERY-INTERRUPT-INT");

    private static final SubLSymbol $sym14$ERROR_MESSAGE = makeUninternedSymbol("ERROR-MESSAGE");

    private static final SubLSymbol $inference_debugP$ = makeSymbol("*INFERENCE-DEBUG?*");

    private static final SubLSymbol WITH_INFERENCE_ERROR_HANDLING = makeSymbol("WITH-INFERENCE-ERROR-HANDLING");

    private static final SubLSymbol NEW_INFERENCE_ERROR_SUSPEND_STATUS = makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS");

    static private final SubLList $list22 = list(makeSymbol("FUNCTION"), makeSymbol("INFERENCE-ERROR-HANDLER"));

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

    // Definitions
    public static final SubLObject catch_inference_abort_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject suspend_status_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            suspend_status_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject aborted_p = $sym1$ABORTED_P;
                return list(CLET, list(aborted_p), list(CCATCH, $INFERENCE_ABORT_TARGET, aborted_p, listS(CLET, $list_alt5, append(body, NIL))), listS(PWHEN, aborted_p, listS(CSETQ, suspend_status_var, $list_alt8), $list_alt9));
            }
        }
    }

    // Definitions
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

    public static final SubLObject signal_inference_control_process_abort_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $within_inference_control_processP$.getDynamicValue(thread)) {
                sublisp_throw($INFERENCE_ABORT_TARGET, T);
            }
            return $NOT_ABORTED;
        }
    }

    public static SubLObject signal_inference_control_process_abort() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_inference_control_processP$.getDynamicValue(thread)) {
            sublisp_throw($INFERENCE_ABORT_TARGET, T);
        }
        return $NOT_ABORTED;
    }

    /**
     * Abort the current query, if any.
     */
    @LispMethod(comment = "Abort the current query, if any.")
    public static final SubLObject query_abort_alt() {
        com.cyc.cycjava.cycl.inference.harness.inference_strategist.abort_current_controlling_inference();
        com.cyc.cycjava.cycl.inference.harness.inference_strategist.signal_inference_control_process_abort();
        return $NOT_ABORTED;
    }

    /**
     * Abort the current query, if any.
     */
    @LispMethod(comment = "Abort the current query, if any.")
    public static SubLObject query_abort() {
        abort_current_controlling_inference();
        signal_inference_control_process_abort();
        return $NOT_ABORTED;
    }

    /**
     * Interrupt the current query, if any.
     */
    @LispMethod(comment = "Interrupt the current query, if any.")
    public static final SubLObject query_interrupt_alt(SubLObject patience) {
        if (patience == UNPROVIDED) {
            patience = NIL;
        }
        {
            SubLObject inference = inference_macros.current_controlling_inference();
            if (NIL != inference) {
                {
                    SubLObject semaphore = Semaphores.new_semaphore($$$Interruptor, ZERO_INTEGER);
                    subl_promotions.make_process_with_args($$$Interruptor, symbol_function(QUERY_INTERRUPT_INT), list(semaphore, inference, patience));
                    Semaphores.semaphore_wait(semaphore);
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     * Interrupt the current query, if any.
     */
    @LispMethod(comment = "Interrupt the current query, if any.")
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

    public static final SubLObject query_interrupt_int_alt(SubLObject semaphore, SubLObject inference, SubLObject patience) {
        Semaphores.semaphore_signal(semaphore);
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_interrupt(inference, patience);
    }

    public static SubLObject query_interrupt_int(final SubLObject semaphore, final SubLObject inference, final SubLObject patience) {
        Semaphores.semaphore_signal(semaphore);
        return inference_interrupt(inference, patience);
    }

    public static final SubLObject catch_inference_error_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject suspend_status_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            suspend_status_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject error_message = $sym13$ERROR_MESSAGE;
                return list(CLET, list(error_message), list(PIF, $inference_debugP$, bq_cons(PROGN, append(body, NIL)), list(CCATCH, $INFERENCE_ERROR, error_message, bq_cons(WITH_INFERENCE_ERROR_HANDLING, append(body, NIL)))), list(PWHEN, error_message, list(CSETQ, suspend_status_var, list(NEW_INFERENCE_ERROR_SUSPEND_STATUS, error_message))));
            }
        }
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
        return list(CLET, list(error_message), list(PIF, $inference_debugP$, bq_cons(PROGN, append(body, NIL)), list(CCATCH, $INFERENCE_ERROR, error_message, bq_cons(WITH_INFERENCE_ERROR_HANDLING, append(body, NIL)))), list(PWHEN, error_message, list(CSETQ, suspend_status_var, list(NEW_INFERENCE_ERROR_SUSPEND_STATUS, error_message))));
    }

    public static final SubLObject with_inference_error_handling_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_ERROR_HANDLER, $list_alt21, append(body, NIL));
        }
    }

    public static SubLObject with_inference_error_handling(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_ERROR_HANDLER, $list22, append(body, NIL));
    }

    public static final SubLObject inference_error_handler_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return sublisp_throw($INFERENCE_ERROR, Errors.$error_message$.getDynamicValue(thread));
        }
    }

    public static SubLObject inference_error_handler() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sublisp_throw($INFERENCE_ERROR, Errors.$error_message$.getDynamicValue(thread));
    }

    /**
     * Evaluate BODY with a :MAX-TIME of TIMEOUT.
     * If the MAX-TIME was reached, HALT-REASON-VAR is set to :MAX-TIME.
     */
    @LispMethod(comment = "Evaluate BODY with a :MAX-TIME of TIMEOUT.\r\nIf the MAX-TIME was reached, HALT-REASON-VAR is set to :MAX-TIME.\nEvaluate BODY with a :MAX-TIME of TIMEOUT.\nIf the MAX-TIME was reached, HALT-REASON-VAR is set to :MAX-TIME.")
    public static final SubLObject with_inference_max_time_timeout_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject halt_reason_var = NIL;
                    SubLObject timeout = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    halt_reason_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt22);
                    timeout = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject abort_max_time = $sym23$ABORT_MAX_TIME;
                            SubLObject timed_out = $sym24$TIMED_OUT;
                            return list(CLET, list(list(abort_max_time, timeout)), list(PCOND, list(abort_max_time, list(CLET, list(timed_out), listS(WITH_TIMEOUT, list(abort_max_time, timed_out), append(body, NIL)), list(PWHEN, timed_out, listS(CSETQ, halt_reason_var, $list_alt27)))), bq_cons(T, append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt22);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Evaluate BODY with a :MAX-TIME of TIMEOUT.
     * If the MAX-TIME was reached, HALT-REASON-VAR is set to :MAX-TIME.
     */
    @LispMethod(comment = "Evaluate BODY with a :MAX-TIME of TIMEOUT.\r\nIf the MAX-TIME was reached, HALT-REASON-VAR is set to :MAX-TIME.\nEvaluate BODY with a :MAX-TIME of TIMEOUT.\nIf the MAX-TIME was reached, HALT-REASON-VAR is set to :MAX-TIME.")
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

    /**
     * Aborting might leave the inference and its problem store in an inconsistent state.
     * Hence, if the inference is continuable or if its problem store might be shared,
     * we avoid triggering a hard abort when it runs out of time.
     */
    @LispMethod(comment = "Aborting might leave the inference and its problem store in an inconsistent state.\r\nHence, if the inference is continuable or if its problem store might be shared,\r\nwe avoid triggering a hard abort when it runs out of time.\nAborting might leave the inference and its problem store in an inconsistent state.\nHence, if the inference is continuable or if its problem store might be shared,\nwe avoid triggering a hard abort when it runs out of time.")
    public static final SubLObject inference_abort_max_time_alt(SubLObject inference) {
        {
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
    }

    /**
     * Aborting might leave the inference and its problem store in an inconsistent state.
     * Hence, if the inference is continuable or if its problem store might be shared,
     * we avoid triggering a hard abort when it runs out of time.
     */
    @LispMethod(comment = "Aborting might leave the inference and its problem store in an inconsistent state.\r\nHence, if the inference is continuable or if its problem store might be shared,\r\nwe avoid triggering a hard abort when it runs out of time.\nAborting might leave the inference and its problem store in an inconsistent state.\nHence, if the inference is continuable or if its problem store might be shared,\nwe avoid triggering a hard abort when it runs out of time.")
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

    /**
     * Uses the :inference-mode property in QUERY-PROPERTIES to fill in values for other
     * query properties, but only if they were not already explicitly specified.
     */
    @LispMethod(comment = "Uses the :inference-mode property in QUERY-PROPERTIES to fill in values for other\r\nquery properties, but only if they were not already explicitly specified.\nUses the :inference-mode property in QUERY-PROPERTIES to fill in values for other\nquery properties, but only if they were not already explicitly specified.")
    public static final SubLObject explicify_inference_mode_defaults_alt(SubLObject query_properties) {
        {
            SubLObject inference_mode = inference_datastructures_enumerated_types.inference_properties_mode(query_properties);
            return list_utilities.merge_plist(inference_parameters.query_properties_for_inference_mode(inference_mode), query_properties);
        }
    }

    /**
     * Uses the :inference-mode property in QUERY-PROPERTIES to fill in values for other
     * query properties, but only if they were not already explicitly specified.
     */
    @LispMethod(comment = "Uses the :inference-mode property in QUERY-PROPERTIES to fill in values for other\r\nquery properties, but only if they were not already explicitly specified.\nUses the :inference-mode property in QUERY-PROPERTIES to fill in values for other\nquery properties, but only if they were not already explicitly specified.")
    public static SubLObject explicify_inference_mode_defaults(final SubLObject query_properties) {
        final SubLObject inference_mode = inference_datastructures_enumerated_types.inference_properties_mode(query_properties);
        return list_utilities.merge_plist(inference_parameters.query_properties_for_inference_mode(inference_mode), query_properties);
    }

    /**
     * Removes any parameters that are redundant given the defaults of the inference mode
     * specified in QUERY-PROPERTIES.
     */
    @LispMethod(comment = "Removes any parameters that are redundant given the defaults of the inference mode\r\nspecified in QUERY-PROPERTIES.\nRemoves any parameters that are redundant given the defaults of the inference mode\nspecified in QUERY-PROPERTIES.")
    public static final SubLObject implicify_inference_mode_defaults_alt(SubLObject query_properties) {
        {
            SubLObject inference_mode = inference_datastructures_enumerated_types.inference_properties_mode(query_properties);
            if ($CUSTOM == inference_mode) {
                return query_properties;
            } else {
                {
                    SubLObject implicified_properties = NIL;
                    SubLObject inference_mode_determined_properties = inference_parameters.query_properties_for_inference_mode(inference_mode);
                    SubLObject remainder = NIL;
                    for (remainder = query_properties; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLObject inference_mode_determined_value = getf(inference_mode_determined_properties, property, $UNSPECIFIED);
                            if (!value.equal(inference_mode_determined_value)) {
                                implicified_properties = putf(implicified_properties, property, value);
                            }
                        }
                    }
                    return implicified_properties;
                }
            }
        }
    }

    /**
     * Removes any parameters that are redundant given the defaults of the inference mode
     * specified in QUERY-PROPERTIES.
     */
    @LispMethod(comment = "Removes any parameters that are redundant given the defaults of the inference mode\r\nspecified in QUERY-PROPERTIES.\nRemoves any parameters that are redundant given the defaults of the inference mode\nspecified in QUERY-PROPERTIES.")
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

    /**
     * Gets the value of PROPERTY from QUERY-PROPERTIES.  Does some strengthening
     * and interpolation of defaults.
     */
    @LispMethod(comment = "Gets the value of PROPERTY from QUERY-PROPERTIES.  Does some strengthening\r\nand interpolation of defaults.\nGets the value of PROPERTY from QUERY-PROPERTIES.  Does some strengthening\nand interpolation of defaults.")
    public static final SubLObject query_property_value_alt(SubLObject query_properties, SubLObject property) {
        {
            SubLObject strengthened_properties = com.cyc.cycjava.cycl.inference.harness.inference_strategist.explicify_inference_mode_defaults(query_properties);
            SubLObject v_default = inference_datastructures_enumerated_types.inference_engine_default_for_property(property);
            return getf(strengthened_properties, property, v_default);
        }
    }

    /**
     * Gets the value of PROPERTY from QUERY-PROPERTIES.  Does some strengthening
     * and interpolation of defaults.
     */
    @LispMethod(comment = "Gets the value of PROPERTY from QUERY-PROPERTIES.  Does some strengthening\r\nand interpolation of defaults.\nGets the value of PROPERTY from QUERY-PROPERTIES.  Does some strengthening\nand interpolation of defaults.")
    public static SubLObject query_property_value(final SubLObject query_properties, final SubLObject property) {
        final SubLObject strengthened_properties = explicify_inference_mode_defaults(query_properties);
        final SubLObject v_default = inference_datastructures_enumerated_types.inference_engine_default_for_property(property);
        return getf(strengthened_properties, property, v_default);
    }

    /**
     * Strengthens the properties of INFERENCE.
     *
     * @unknown The inference should be in the preparation stage.
    But as it requires the dynamic properties to be set beforehand (to access it through the inference),
    this check has to be made before calling this function.
     */
    @LispMethod(comment = "Strengthens the properties of INFERENCE.\r\n\r\n@unknown The inference should be in the preparation stage.\r\nBut as it requires the dynamic properties to be set beforehand (to access it through the inference),\r\nthis check has to be made before calling this function.")
    public static final SubLObject strengthen_query_properties_using_inference_alt(SubLObject inference) {
        SubLTrampolineFile.checkType(inference, INFERENCE_P);
        {
            SubLObject problem_store = inference_datastructures_inference.inference_problem_store(inference);
            SubLObject problem_store_privateP = inference_datastructures_inference.inference_problem_store_privateP(inference);
            SubLObject max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
            SubLObject transformation_allowedP = inference_datastructures_problem_store.problem_store_transformation_allowedP(problem_store);
            SubLObject continuableP = inference_datastructures_inference.inference_continuableP(inference);
            SubLObject return_type = inference_datastructures_inference.inference_return_type(inference);
            if (NIL == transformation_allowedP) {
                inference_datastructures_inference.set_inference_max_transformation_depth(inference, ZERO_INTEGER);
            }
            if (NIL != inference_datastructures_problem_store.problem_store_newP(problem_store)) {
                if ((NIL != inference_datastructures_inference.inference_problem_store_private_wrt_dynamic_propertiesP(inference)) && max_transformation_depth.eql(ZERO_INTEGER)) {
                    inference_datastructures_problem_store.set_problem_store_transformation_allowedP(problem_store, NIL);
                }
            }
            {
                SubLObject pcase_var = return_type;
                if (pcase_var.eql($SUPPORTS) || pcase_var.eql($BINDINGS_AND_SUPPORTS)) {
                    inference_datastructures_inference.set_inference_answer_language(inference, $HL);
                }
                if ((NIL != inference_datastructures_enumerated_types.inference_template_return_type_p(return_type)) && (NIL != list_utilities.simple_tree_findP($SUPPORTS, return_type))) {
                    inference_datastructures_inference.set_inference_answer_language(inference, $HL);
                }
            }
            if (NIL != inference_datastructures_problem_store.problem_store_newP(problem_store)) {
                if (NIL == problem_store_privateP) {
                    inference_datastructures_problem_store.set_problem_store_add_restriction_layer_of_indirectionP(problem_store, T);
                }
                if (NIL != inference_datastructures_problem_store.problem_store_forwardP(problem_store)) {
                }
                {
                    SubLObject hl_query = inference_datastructures_inference.inference_hl_query(inference);
                    if ((NIL != problem_store_privateP) && (NIL != inference_datastructures_problem_query.single_literal_problem_query_p(hl_query))) {
                        if (max_transformation_depth.eql(ZERO_INTEGER) && (NIL == continuableP)) {
                            inference_datastructures_problem_store.set_problem_store_add_restriction_layer_of_indirectionP(problem_store, NIL);
                        }
                    }
                }
            }
            if (NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(problem_store)) {
                inference_datastructures_inference.set_inference_result_uniqueness_criterion(inference, $PROOF);
            }
        }
        return NIL;
    }

    /**
     * Strengthens the properties of INFERENCE.
     *
     * @unknown The inference should be in the preparation stage.
    But as it requires the dynamic properties to be set beforehand (to access it through the inference),
    this check has to be made before calling this function.
     */
    @LispMethod(comment = "Strengthens the properties of INFERENCE.\r\n\r\n@unknown The inference should be in the preparation stage.\r\nBut as it requires the dynamic properties to be set beforehand (to access it through the inference),\r\nthis check has to be made before calling this function.")
    public static SubLObject strengthen_query_properties_using_inference(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
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

    /**
     * Turns a :new inference into a :prepared inference.
     * Canonicalizes the input MT, EL-QUERY, and NON-EXPLANATORY-QUERY (if any) of inference into
     * HL-QUERY and EXPLANATORY-HL-QUERY and additional resulting bookkeeping.
     * Returns a :prepared INFERENCE if all goes well during canonicalization,
     * otherwise returns #$True, #$False, or NIL.
     */
    @LispMethod(comment = "Turns a :new inference into a :prepared inference.\r\nCanonicalizes the input MT, EL-QUERY, and NON-EXPLANATORY-QUERY (if any) of inference into\r\nHL-QUERY and EXPLANATORY-HL-QUERY and additional resulting bookkeeping.\r\nReturns a :prepared INFERENCE if all goes well during canonicalization,\r\notherwise returns #$True, #$False, or NIL.\nTurns a :new inference into a :prepared inference.\nCanonicalizes the input MT, EL-QUERY, and NON-EXPLANATORY-QUERY (if any) of inference into\nHL-QUERY and EXPLANATORY-HL-QUERY and additional resulting bookkeeping.\nReturns a :prepared INFERENCE if all goes well during canonicalization,\notherwise returns #$True, #$False, or NIL.")
    public static final SubLObject inference_prepare_alt(SubLObject inference, SubLObject disjunction_free_el_vars_policy, SubLObject hypothesizeP) {
        SubLTrampolineFile.checkType(inference, NEW_INFERENCE_P);
        com.cyc.cycjava.cycl.inference.harness.inference_strategist.prepare_inference_hl_query(inference, disjunction_free_el_vars_policy, hypothesizeP);
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_prepare_int(inference);
    }

    /**
     * Turns a :new inference into a :prepared inference.
     * Canonicalizes the input MT, EL-QUERY, and NON-EXPLANATORY-QUERY (if any) of inference into
     * HL-QUERY and EXPLANATORY-HL-QUERY and additional resulting bookkeeping.
     * Returns a :prepared INFERENCE if all goes well during canonicalization,
     * otherwise returns #$True, #$False, or NIL.
     */
    @LispMethod(comment = "Turns a :new inference into a :prepared inference.\r\nCanonicalizes the input MT, EL-QUERY, and NON-EXPLANATORY-QUERY (if any) of inference into\r\nHL-QUERY and EXPLANATORY-HL-QUERY and additional resulting bookkeeping.\r\nReturns a :prepared INFERENCE if all goes well during canonicalization,\r\notherwise returns #$True, #$False, or NIL.\nTurns a :new inference into a :prepared inference.\nCanonicalizes the input MT, EL-QUERY, and NON-EXPLANATORY-QUERY (if any) of inference into\nHL-QUERY and EXPLANATORY-HL-QUERY and additional resulting bookkeeping.\nReturns a :prepared INFERENCE if all goes well during canonicalization,\notherwise returns #$True, #$False, or NIL.")
    public static SubLObject inference_prepare(final SubLObject inference, final SubLObject disjunction_free_el_vars_policy, final SubLObject hypothesizeP) {
        assert NIL != inference_datastructures_inference.new_inference_p(inference) : "! inference_datastructures_inference.new_inference_p(inference) " + ("inference_datastructures_inference.new_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.new_inference_p(inference) ") + inference;
        prepare_inference_hl_query(inference, disjunction_free_el_vars_policy, hypothesizeP);
        return inference_prepare_int(inference);
    }

    public static final SubLObject inference_prepare_from_dnf_alt(SubLObject inference, SubLObject dnf, SubLObject scoped_vars) {
        SubLTrampolineFile.checkType(inference, NEW_INFERENCE_P);
        com.cyc.cycjava.cycl.inference.harness.inference_strategist.prepare_inference_hl_query_from_dnf(inference, dnf, scoped_vars);
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_prepare_int(inference);
    }

    public static SubLObject inference_prepare_from_dnf(final SubLObject inference, final SubLObject dnf, final SubLObject scoped_vars) {
        assert NIL != inference_datastructures_inference.new_inference_p(inference) : "! inference_datastructures_inference.new_inference_p(inference) " + ("inference_datastructures_inference.new_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.new_inference_p(inference) ") + inference;
        prepare_inference_hl_query_from_dnf(inference, dnf, scoped_vars);
        return inference_prepare_int(inference);
    }

    public static final SubLObject inference_prepare_int_alt(SubLObject inference) {
        if (NIL != inference_datastructures_inference.new_inference_p(inference)) {
            if (NIL != inference_datastructures_inference.simplest_inference_p(inference)) {
                com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_prepare(inference);
            } else {
                Errors.error($str_alt36$can_t_handle_non_simplest_inferen, inference);
            }
            inference_datastructures_inference.set_inference_status(inference, $PREPARED);
        }
        return inference;
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

    /**
     * Virtual subclass constructor for simplest-inference-p
     */
    @LispMethod(comment = "Virtual subclass constructor for simplest-inference-p")
    public static final SubLObject simplest_inference_prepare_alt(SubLObject inference) {
        SubLTrampolineFile.checkType(inference, SIMPLEST_INFERENCE_P);
        inference_worker.find_or_create_root_problem_and_link(inference);
        return NIL;
    }

    /**
     * Virtual subclass constructor for simplest-inference-p
     */
    @LispMethod(comment = "Virtual subclass constructor for simplest-inference-p")
    public static SubLObject simplest_inference_prepare(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "! inference_datastructures_inference.simplest_inference_p(inference) " + ("inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) ") + inference;
        inference_worker.find_or_create_root_problem_and_link(inference);
        return NIL;
    }

    /**
     * Creates a new inference object and gets it into the :prepared state.
     */
    @LispMethod(comment = "Creates a new inference object and gets it into the :prepared state.")
    public static final SubLObject simplest_inference_prepare_new_alt(SubLObject problem_store, SubLObject el_query, SubLObject mt, SubLObject strategy_type, SubLObject disjunction_free_el_vars_policy, SubLObject hypothesizeP, SubLObject non_explanatory_el_query, SubLObject problem_store_privateP) {
        {
            SubLObject inference = inference_datastructures_inference.new_simplest_inference_of_type(problem_store, strategy_type);
            inference_datastructures_inference.set_inference_input_el_query(inference, el_query);
            inference_datastructures_inference.set_inference_input_mt(inference, mt);
            inference_datastructures_inference.set_inference_input_non_explanatory_el_query(inference, non_explanatory_el_query);
            inference_datastructures_inference.set_inference_problem_store_private(inference, problem_store_privateP);
            return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_prepare(inference, disjunction_free_el_vars_policy, hypothesizeP);
        }
    }

    /**
     * Creates a new inference object and gets it into the :prepared state.
     */
    @LispMethod(comment = "Creates a new inference object and gets it into the :prepared state.")
    public static SubLObject simplest_inference_prepare_new(final SubLObject problem_store, final SubLObject el_query, final SubLObject mt, final SubLObject strategy_type, final SubLObject disjunction_free_el_vars_policy, final SubLObject hypothesizeP, final SubLObject non_explanatory_el_query, final SubLObject problem_store_privateP) {
        final SubLObject inference = inference_datastructures_inference.new_simplest_inference_of_type(problem_store, strategy_type);
        inference_datastructures_inference.set_inference_input_el_query(inference, el_query);
        inference_datastructures_inference.set_inference_input_mt(inference, mt);
        inference_datastructures_inference.set_inference_input_non_explanatory_el_query(inference, non_explanatory_el_query);
        inference_datastructures_inference.set_inference_problem_store_private(inference, problem_store_privateP);
        return inference_prepare(inference, disjunction_free_el_vars_policy, hypothesizeP);
    }

    public static final SubLObject simplest_inference_prepare_new_from_dnf_alt(SubLObject problem_store, SubLObject dnf, SubLObject mt, SubLObject strategy_type, SubLObject scoped_vars, SubLObject non_explanatory_el_query, SubLObject problem_store_privateP) {
        {
            SubLObject inference = inference_datastructures_inference.new_simplest_inference_of_type(problem_store, strategy_type);
            inference_datastructures_inference.set_inference_input_mt(inference, mt);
            inference_datastructures_inference.set_inference_input_non_explanatory_el_query(inference, non_explanatory_el_query);
            inference_datastructures_inference.set_inference_problem_store_private(inference, problem_store_privateP);
            return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_prepare_from_dnf(inference, dnf, scoped_vars);
        }
    }

    public static SubLObject simplest_inference_prepare_new_from_dnf(final SubLObject problem_store, final SubLObject dnf, final SubLObject mt, final SubLObject strategy_type, final SubLObject scoped_vars, final SubLObject non_explanatory_el_query, final SubLObject problem_store_privateP) {
        final SubLObject inference = inference_datastructures_inference.new_simplest_inference_of_type(problem_store, strategy_type);
        inference_datastructures_inference.set_inference_input_mt(inference, mt);
        inference_datastructures_inference.set_inference_input_non_explanatory_el_query(inference, non_explanatory_el_query);
        inference_datastructures_inference.set_inference_problem_store_private(inference, problem_store_privateP);
        return inference_prepare_from_dnf(inference, dnf, scoped_vars);
    }

    public static final SubLObject note_inference_tautology_justification_alt(SubLObject inference, SubLObject tautology_justifications) {
        {
            SubLObject suspend_status = inference_datastructures_enumerated_types.new_inference_justification_status(tautology_justifications);
            if (NIL != tautology_justifications) {
                inference_datastructures_inference.set_inference_suspend_status(inference, suspend_status);
            }
            return inference;
        }
    }

    public static SubLObject note_inference_tautology_justification(final SubLObject inference, final SubLObject tautology_justifications) {
        final SubLObject suspend_status = inference_datastructures_enumerated_types.new_inference_justification_status(tautology_justifications);
        if (NIL != tautology_justifications) {
            inference_datastructures_inference.set_inference_suspend_status(inference, suspend_status);
        }
        return inference;
    }

    public static final SubLObject preparing_inferenceP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $preparing_inferenceP$.getDynamicValue(thread);
        }
    }

    public static SubLObject preparing_inferenceP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $preparing_inferenceP$.getDynamicValue(thread);
    }

    /**
     * Modifies and returns INFERENCE.
     * If all goes well, sets INFERENCE's hl-query to a canonicalized version of
     * its EL query.  If there is a problem during canonicalization, it does not
     * set the hl-query, but instead changes the status of INFERENCE
     * from :new to either :tautology, :contradiction, or :ill-formed.
     */
    @LispMethod(comment = "Modifies and returns INFERENCE.\r\nIf all goes well, sets INFERENCE\'s hl-query to a canonicalized version of\r\nits EL query.  If there is a problem during canonicalization, it does not\r\nset the hl-query, but instead changes the status of INFERENCE\r\nfrom :new to either :tautology, :contradiction, or :ill-formed.\nModifies and returns INFERENCE.\nIf all goes well, sets INFERENCE\'s hl-query to a canonicalized version of\nits EL query.  If there is a problem during canonicalization, it does not\nset the hl-query, but instead changes the status of INFERENCE\nfrom :new to either :tautology, :contradiction, or :ill-formed.")
    public static final SubLObject prepare_inference_hl_query_alt(SubLObject inference, SubLObject disjunction_free_el_vars_policy, SubLObject hypothesizeP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                SubLObject store_var = store;
                SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt40$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                                    {
                                        SubLObject _prev_bind_0_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                            {
                                                SubLObject _prev_bind_0_2 = $preparing_inferenceP$.currentBinding(thread);
                                                try {
                                                    $preparing_inferenceP$.bind(T, thread);
                                                    {
                                                        SubLObject input_mt = inference_datastructures_inference.inference_input_mt(inference);
                                                        SubLObject input_el_query = inference_datastructures_inference.inference_input_el_query(inference);
                                                        SubLObject input_non_explanatory_el_query = inference_datastructures_inference.inference_input_non_explanatory_el_query(inference);
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject mt = com.cyc.cycjava.cycl.inference.harness.inference_strategist.prepare_inference_hl_query_int(input_mt, input_el_query, input_non_explanatory_el_query, hypothesizeP);
                                                            SubLObject el_query = thread.secondMultipleValue();
                                                            SubLObject explanatory_el_query = thread.thirdMultipleValue();
                                                            SubLObject hypothetical_bindings = thread.fourthMultipleValue();
                                                            SubLObject tautology_justifications = thread.fifthMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if ((NIL != mt) && (NIL == hlmt.hlmt_p(mt))) {
                                                                inference_datastructures_inference.set_inference_status(inference, $ILL_FORMED);
                                                            } else {
                                                                if ($NOT_AN_IMPLICATION == el_query) {
                                                                    inference_datastructures_inference.set_inference_status(inference, $ILL_FORMED);
                                                                } else {
                                                                    if ($TAUTOLOGY == el_query) {
                                                                        inference_datastructures_inference.set_inference_status(inference, $TAUTOLOGY);
                                                                        inference_datastructures_inference.set_inference_hl_query(inference, $tautology_problem_query$.getGlobalValue());
                                                                        com.cyc.cycjava.cycl.inference.harness.inference_strategist.note_inference_tautology_justification(inference, tautology_justifications);
                                                                    } else {
                                                                        inference_datastructures_inference.set_inference_mt(inference, mt);
                                                                        inference_datastructures_inference.set_inference_el_query(inference, el_query);
                                                                        inference_datastructures_inference.set_inference_hypothetical_bindings(inference, hypothetical_bindings);
                                                                    }
                                                                }
                                                            }
                                                            if (NIL != inference_datastructures_inference.new_inference_p(inference)) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject czer_result = inference_czer.inference_canonicalize_ask_memoized(el_query, mt, disjunction_free_el_vars_policy);
                                                                    SubLObject el_bindings = thread.secondMultipleValue();
                                                                    SubLObject free_el_vars = thread.thirdMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != inference_datastructures_problem_query.problem_query_p(czer_result)) {
                                                                        {
                                                                            SubLObject hl_query = czer_result;
                                                                            inference_datastructures_inference.set_inference_hl_query(inference, hl_query);
                                                                            inference_datastructures_inference.set_inference_el_bindings(inference, el_bindings);
                                                                            {
                                                                                SubLObject free_hl_vars = bindings.apply_bindings(el_bindings, free_el_vars);
                                                                                inference_datastructures_inference.set_inference_free_hl_vars(inference, free_hl_vars);
                                                                            }
                                                                            if (NIL == input_non_explanatory_el_query) {
                                                                                inference_datastructures_inference.set_inference_explanatory_subquery(inference, $ALL);
                                                                                inference_datastructures_inference.set_inference_non_explanatory_subquery(inference, NIL);
                                                                            } else {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject explanatory_czer_result = inference_czer.inference_canonicalize_ask_memoized(explanatory_el_query, mt, disjunction_free_el_vars_policy);
                                                                                    SubLObject explanatory_el_bindings = thread.secondMultipleValue();
                                                                                    SubLObject explanatory_free_el_vars = thread.thirdMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject explanatory_subquery = explanatory_czer_result;
                                                                                        inference_datastructures_inference.set_inference_explanatory_subquery(inference, explanatory_subquery);
                                                                                    }
                                                                                }
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject non_explanatory_czer_result = inference_czer.inference_canonicalize_ask_memoized(input_non_explanatory_el_query, mt, disjunction_free_el_vars_policy);
                                                                                    SubLObject non_explanatory_el_bindings = thread.secondMultipleValue();
                                                                                    SubLObject non_explanatory_free_el_vars = thread.thirdMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject non_explanatory_subquery = non_explanatory_czer_result;
                                                                                        SubLObject non_explanatory_hl_bindings = bindings.apply_bindings(non_explanatory_el_bindings, el_bindings);
                                                                                        inference_datastructures_inference.set_inference_non_explanatory_subquery(inference, bindings.apply_bindings(non_explanatory_hl_bindings, non_explanatory_subquery));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if ($$True == czer_result) {
                                                                            inference_datastructures_inference.set_inference_hl_query(inference, $tautology_problem_query$.getGlobalValue());
                                                                            inference_datastructures_inference.set_inference_status(inference, $TAUTOLOGY);
                                                                        } else {
                                                                            if ($$False == czer_result) {
                                                                                inference_datastructures_inference.set_inference_hl_query(inference, $contradiction_problem_query$.getGlobalValue());
                                                                                inference_datastructures_inference.set_inference_status(inference, $CONTRADICTION);
                                                                            } else {
                                                                                if ($ILL_FORMED == czer_result) {
                                                                                    inference_datastructures_inference.set_inference_hl_query(inference, $contradiction_problem_query$.getGlobalValue());
                                                                                    inference_datastructures_inference.set_inference_status(inference, $ILL_FORMED);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    $preparing_inferenceP$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                            space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                        } finally {
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                    inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return inference;
        }
    }

    /**
     * Modifies and returns INFERENCE.
     * If all goes well, sets INFERENCE's hl-query to a canonicalized version of
     * its EL query.  If there is a problem during canonicalization, it does not
     * set the hl-query, but instead changes the status of INFERENCE
     * from :new to either :tautology, :contradiction, or :ill-formed.
     */
    @LispMethod(comment = "Modifies and returns INFERENCE.\r\nIf all goes well, sets INFERENCE\'s hl-query to a canonicalized version of\r\nits EL query.  If there is a problem during canonicalization, it does not\r\nset the hl-query, but instead changes the status of INFERENCE\r\nfrom :new to either :tautology, :contradiction, or :ill-formed.\nModifies and returns INFERENCE.\nIf all goes well, sets INFERENCE\'s hl-query to a canonicalized version of\nits EL query.  If there is a problem during canonicalization, it does not\nset the hl-query, but instead changes the status of INFERENCE\nfrom :new to either :tautology, :contradiction, or :ill-formed.")
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

    /**
     * Given INPUT-MT, INPUT-EL-QUERY, INPUT-NON-EXPLANATORY-EL-QUERY and HYPOTHESIZE? for some inference,
     * determine the MT, EL-QUERY, EXPLANATORY-EL-QUERY and HYPOTHETICAL-BINDINGS to use.
     *
     * @return 1 the mt (nil or possibly-mt-p)
     * @return 2 the el-query (:TAUTOLOGY or possibly-inference-sentence-p)
     * @return 3 the explanatory-el-query (nil or possibly-inference-sentence-p)
     * @return 4 the hypothetical-bindings (nil or bindings-p)
     */
    @LispMethod(comment = "Given INPUT-MT, INPUT-EL-QUERY, INPUT-NON-EXPLANATORY-EL-QUERY and HYPOTHESIZE? for some inference,\r\ndetermine the MT, EL-QUERY, EXPLANATORY-EL-QUERY and HYPOTHETICAL-BINDINGS to use.\r\n\r\n@return 1 the mt (nil or possibly-mt-p)\r\n@return 2 the el-query (:TAUTOLOGY or possibly-inference-sentence-p)\r\n@return 3 the explanatory-el-query (nil or possibly-inference-sentence-p)\r\n@return 4 the hypothetical-bindings (nil or bindings-p)\nGiven INPUT-MT, INPUT-EL-QUERY, INPUT-NON-EXPLANATORY-EL-QUERY and HYPOTHESIZE? for some inference,\ndetermine the MT, EL-QUERY, EXPLANATORY-EL-QUERY and HYPOTHETICAL-BINDINGS to use.")
    public static final SubLObject prepare_inference_hl_query_int_alt(SubLObject input_mt, SubLObject input_el_query, SubLObject input_non_explanatory_el_query, SubLObject hypothesizeP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject input_el_query_4 = czer_utilities.unwrap_if_ist_permissive(input_el_query, input_mt);
                SubLObject input_mt_5 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                input_el_query = input_el_query_4;
                input_mt = input_mt_5;
            }
            {
                SubLObject mt = NIL;
                SubLObject el_query = NIL;
                SubLObject explanatory_el_query = NIL;
                SubLObject hypothetical_bindings = NIL;
                SubLObject tautology_justifications = NIL;
                if (NIL == hypothesizeP) {
                    if (NIL == input_non_explanatory_el_query) {
                        mt = (NIL != input_mt) ? ((SubLObject) (hlmt_czer.canonicalize_hlmt(input_mt))) : NIL;
                        el_query = input_el_query;
                        explanatory_el_query = input_el_query;
                        hypothetical_bindings = NIL;
                        tautology_justifications = NIL;
                    } else {
                        mt = (NIL != input_mt) ? ((SubLObject) (hlmt_czer.canonicalize_hlmt(input_mt))) : NIL;
                        el_query = make_conjunction(list(input_el_query, input_non_explanatory_el_query));
                        explanatory_el_query = input_el_query;
                        hypothetical_bindings = NIL;
                        tautology_justifications = NIL;
                    }
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject consequent = com.cyc.cycjava.cycl.inference.harness.inference_strategist.hypothesize_antecedent(input_el_query, input_mt);
                        SubLObject hypothetical_context = thread.secondMultipleValue();
                        SubLObject v_bindings = thread.thirdMultipleValue();
                        SubLObject failure_reasons = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == hypothetical_context) {
                            mt = (NIL != input_mt) ? ((SubLObject) (hlmt_czer.canonicalize_hlmt(input_mt))) : NIL;
                            el_query = $TAUTOLOGY;
                            explanatory_el_query = NIL;
                            hypothetical_bindings = NIL;
                            tautology_justifications = failure_reasons;
                        } else {
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
                    }
                }
                return values(mt, el_query, explanatory_el_query, hypothetical_bindings, tautology_justifications);
            }
        }
    }

    /**
     * Given INPUT-MT, INPUT-EL-QUERY, INPUT-NON-EXPLANATORY-EL-QUERY and HYPOTHESIZE? for some inference,
     * determine the MT, EL-QUERY, EXPLANATORY-EL-QUERY and HYPOTHETICAL-BINDINGS to use.
     *
     * @return 1 the mt (nil or possibly-mt-p)
     * @return 2 the el-query (:TAUTOLOGY or possibly-inference-sentence-p)
     * @return 3 the explanatory-el-query (nil or possibly-inference-sentence-p)
     * @return 4 the hypothetical-bindings (nil or bindings-p)
     */
    @LispMethod(comment = "Given INPUT-MT, INPUT-EL-QUERY, INPUT-NON-EXPLANATORY-EL-QUERY and HYPOTHESIZE? for some inference,\r\ndetermine the MT, EL-QUERY, EXPLANATORY-EL-QUERY and HYPOTHETICAL-BINDINGS to use.\r\n\r\n@return 1 the mt (nil or possibly-mt-p)\r\n@return 2 the el-query (:TAUTOLOGY or possibly-inference-sentence-p)\r\n@return 3 the explanatory-el-query (nil or possibly-inference-sentence-p)\r\n@return 4 the hypothetical-bindings (nil or bindings-p)\nGiven INPUT-MT, INPUT-EL-QUERY, INPUT-NON-EXPLANATORY-EL-QUERY and HYPOTHESIZE? for some inference,\ndetermine the MT, EL-QUERY, EXPLANATORY-EL-QUERY and HYPOTHETICAL-BINDINGS to use.")
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

    /**
     *
     *
     * @return 0 the substituted consequent
     * @return 1 the new mt
     * @return 2 bindings for hypothetically instantiated variables
     */
    @LispMethod(comment = "@return 0 the substituted consequent\r\n@return 1 the new mt\r\n@return 2 bindings for hypothetically instantiated variables")
    public static final SubLObject hypothesize_antecedent_alt(SubLObject implication, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject return_consequent = $NOT_AN_IMPLICATION;
                SubLObject return_mt = mt;
                SubLObject return_bindings = NIL;
                SubLObject return_failure_reasons = NIL;
                implication = com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_possibly_simplify_conditional_sentence(implication);
                if (NIL != el_implication_p(implication)) {
                    {
                        SubLObject antecedent = cycl_utilities.formula_arg1(implication, UNPROVIDED);
                        SubLObject consequent = cycl_utilities.formula_arg2(implication, UNPROVIDED);
                        thread.resetMultipleValues();
                        {
                            SubLObject new_consequent = prove.new_prepare_for_proof(antecedent, consequent, mt);
                            SubLObject new_mt = thread.secondMultipleValue();
                            SubLObject v_bindings = thread.thirdMultipleValue();
                            SubLObject failure_reasons = thread.fourthMultipleValue();
                            thread.resetMultipleValues();
                            return_consequent = new_consequent;
                            return_mt = new_mt;
                            return_bindings = v_bindings;
                            return_failure_reasons = failure_reasons;
                        }
                    }
                }
                return values(return_consequent, return_mt, return_bindings, return_failure_reasons);
            }
        }
    }

    /**
     *
     *
     * @return 0 the substituted consequent
     * @return 1 the new mt
     * @return 2 bindings for hypothetically instantiated variables
     */
    @LispMethod(comment = "@return 0 the substituted consequent\r\n@return 1 the new mt\r\n@return 2 bindings for hypothetically instantiated variables")
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

    public static final SubLObject inference_conditional_sentence_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != el_grammar.el_sentence_p(v_object)) && (NIL != el_implication_p(com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_possibly_simplify_conditional_sentence(v_object))));
    }

    public static SubLObject inference_conditional_sentence_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_sentence_p(v_object)) && (NIL != el_implication_p(inference_possibly_simplify_conditional_sentence(v_object))));
    }

    public static final SubLObject inference_possibly_simplify_conditional_sentence_alt(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject simplified_sentence = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$simplify_implicationP$.currentBinding(thread);
                    try {
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        czer_vars.$simplify_implicationP$.bind(NIL, thread);
                        simplified_sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
                    } finally {
                        czer_vars.$simplify_implicationP$.rebind(_prev_bind_1, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_0, thread);
                    }
                }
                return simplified_sentence;
            }
        }
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

    public static final SubLObject prepare_inference_hl_query_from_dnf_alt(SubLObject inference, SubLObject input_dnf, SubLObject scoped_vars) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(input_dnf, DNF_P);
            SubLTrampolineFile.checkType(scoped_vars, LISTP);
            {
                SubLObject input_mt = inference_datastructures_inference.inference_input_mt(inference);
                SubLObject input_non_explanatory_el_query = inference_datastructures_inference.inference_input_non_explanatory_el_query(inference);
                SubLObject explanatory_dnf = input_dnf;
                SubLObject full_dnf = explanatory_dnf;
                inference_datastructures_inference.set_inference_mt(inference, input_mt);
                inference_datastructures_inference.set_inference_hypothetical_bindings(inference, NIL);
                if (NIL != input_non_explanatory_el_query) {
                    {
                        SubLObject non_explanatory_clauses = clausifier.dnf_operators_out(input_non_explanatory_el_query);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == list_utilities.singletonP(non_explanatory_clauses)) {
                                Errors.error($str_alt50$Time_to_support_disjunctive___pra);
                            }
                        }
                        {
                            SubLObject non_explanatory_dnf = non_explanatory_clauses.first();
                            inference_datastructures_inference.set_inference_non_explanatory_subquery(inference, inference_czer.dnf_and_mt_to_hl_query(non_explanatory_dnf, input_mt));
                            full_dnf = inference_worker_transformation.nmerge_dnf(copy_clause(explanatory_dnf), non_explanatory_dnf);
                        }
                    }
                }
                inference_datastructures_inference.set_inference_el_query(inference, NIL);
                inference_datastructures_inference.set_inference_el_bindings(inference, NIL);
                if (NIL != clauses.empty_clauseP(full_dnf)) {
                    inference_datastructures_inference.set_inference_hl_query(inference, $tautology_problem_query$.getGlobalValue());
                    inference_datastructures_inference.set_inference_status(inference, $TAUTOLOGY);
                } else {
                    {
                        SubLObject hl_query = inference_czer.dnf_and_mt_to_hl_query(full_dnf, input_mt);
                        inference_datastructures_inference.set_inference_hl_query(inference, hl_query);
                        {
                            SubLObject all_free_hl_vars = list_utilities.tree_gather(full_dnf, HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject free_hl_vars = list_utilities.fast_set_difference(all_free_hl_vars, scoped_vars, UNPROVIDED);
                            inference_datastructures_inference.set_inference_free_hl_vars(inference, free_hl_vars);
                        }
                        if (NIL == input_non_explanatory_el_query) {
                            inference_datastructures_inference.set_inference_explanatory_subquery(inference, $ALL);
                        } else {
                            {
                                SubLObject explanatory_subquery = inference_czer.dnf_and_mt_to_hl_query(explanatory_dnf, input_mt);
                                inference_datastructures_inference.set_inference_explanatory_subquery(inference, explanatory_subquery);
                            }
                        }
                    }
                }
            }
            return inference;
        }
    }

    public static SubLObject prepare_inference_hl_query_from_dnf(final SubLObject inference, final SubLObject input_dnf, final SubLObject scoped_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != clauses.dnf_p(input_dnf) : "! clauses.dnf_p(input_dnf) " + ("clauses.dnf_p(input_dnf) " + "CommonSymbols.NIL != clauses.dnf_p(input_dnf) ") + input_dnf;
        assert NIL != listp(scoped_vars) : "! listp(scoped_vars) " + ("Types.listp(scoped_vars) " + "CommonSymbols.NIL != Types.listp(scoped_vars) ") + scoped_vars;
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

    /**
     *
     *
     * @return listp; a list of strategies in which the root problem of INFERENCE should be
    initially active.
     */
    @LispMethod(comment = "@return listp; a list of strategies in which the root problem of INFERENCE should be\r\ninitially active.")
    public static final SubLObject inference_initial_relevant_strategies_alt(SubLObject inference) {
        if (NIL != inference_datastructures_inference.simplest_inference_p(inference)) {
            return inference_tactician.strategy_initial_relevant_strategies(inference_datastructures_inference.simplest_inference_strategy(inference));
        } else {
            Errors.error($str_alt52$can_t_handle_non_simple_inference);
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; a list of strategies in which the root problem of INFERENCE should be
    initially active.
     */
    @LispMethod(comment = "@return listp; a list of strategies in which the root problem of INFERENCE should be\r\ninitially active.")
    public static SubLObject inference_initial_relevant_strategies(final SubLObject inference) {
        if (NIL != inference_datastructures_inference.simplest_inference_p(inference)) {
            return inference_tactician.strategy_initial_relevant_strategies(inference_datastructures_inference.simplest_inference_strategy(inference));
        }
        Errors.error($str54$can_t_handle_non_simple_inference);
        return NIL;
    }

    public static final SubLObject inference_update_dynamic_properties_alt(SubLObject inference, SubLObject new_query_dynamic_properties) {
        SubLTrampolineFile.checkType(inference, CONTINUABLE_INFERENCE_P);
        SubLTrampolineFile.checkType(new_query_dynamic_properties, QUERY_DYNAMIC_PROPERTIES_P);
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.query_dynamic_properties_have_strategically_interesting_extensionP(inference, new_query_dynamic_properties)) {
            SubLTrampolineFile.checkType(inference, SIMPLEST_INFERENCE_P);
            {
                SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
                inference_tactician.strategy_note_inference_dynamic_properties_updated(strategy);
            }
        }
        {
            SubLObject new_inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(new_query_dynamic_properties);
            com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_set_dynamic_properties(inference, new_inference_dynamic_properties);
        }
        {
            SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_relevant_problems(inference));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject problem = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, problem)) {
                        if (NIL != inference_datastructures_problem.valid_problem_p(problem)) {
                            inference_datastructures_strategy.set_problem_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(problem);
                            inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(problem);
                            inference_datastructures_strategy.set_problem_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations(problem);
                            inference_datastructures_strategy.set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations(problem);
                        }
                    }
                }
            }
        }
        inference_datastructures_inference.set_inference_status(inference, $READY);
        return inference;
    }

    public static SubLObject inference_update_dynamic_properties(final SubLObject inference, final SubLObject new_query_dynamic_properties) {
        assert NIL != inference_datastructures_inference.continuable_inference_p(inference) : "! inference_datastructures_inference.continuable_inference_p(inference) " + ("inference_datastructures_inference.continuable_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.continuable_inference_p(inference) ") + inference;
        assert NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p(new_query_dynamic_properties) : "! inference_datastructures_enumerated_types.query_dynamic_properties_p(new_query_dynamic_properties) " + ("inference_datastructures_enumerated_types.query_dynamic_properties_p(new_query_dynamic_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p(new_query_dynamic_properties) ") + new_query_dynamic_properties;
        if (NIL != query_dynamic_properties_have_strategically_interesting_extensionP(inference, new_query_dynamic_properties)) {
            assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "! inference_datastructures_inference.simplest_inference_p(inference) " + ("inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) ") + inference;
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

    public static final SubLObject query_dynamic_properties_have_strategically_interesting_extensionP_alt(SubLObject inference, SubLObject new_query_dynamic_properties) {
        {
            SubLObject new_inference_dynamic_properties = inference_datastructures_enumerated_types.extract_inference_dynamic_properties(new_query_dynamic_properties);
            SubLObject old_max_proof_depth = inference_datastructures_inference.inference_max_proof_depth(inference);
            SubLObject new_max_proof_depth = inference_datastructures_enumerated_types.inference_properties_max_proof_depth(new_inference_dynamic_properties);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.depth_cutoff_L(old_max_proof_depth, new_max_proof_depth)) {
                return T;
            }
            {
                SubLObject old_max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
                SubLObject new_max_transformation_depth = inference_datastructures_enumerated_types.inference_properties_max_transformation_depth(new_inference_dynamic_properties);
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.depth_cutoff_L(old_max_transformation_depth, new_max_transformation_depth)) {
                    return T;
                }
            }
        }
        {
            SubLObject new_strategy_dynamic_properties = inference_datastructures_enumerated_types.extract_strategy_dynamic_properties(new_query_dynamic_properties);
            SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
            SubLObject old_productivity_limit = inference_datastructures_strategy.strategy_productivity_limit(strategy);
            SubLObject new_productivity_limit = inference_datastructures_enumerated_types.strategy_dynamic_properties_productivity_limit(new_strategy_dynamic_properties);
            if (NIL != inference_datastructures_enumerated_types.productivity_L(old_productivity_limit, new_productivity_limit)) {
                return T;
            }
        }
        return NIL;
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

    public static final SubLObject depth_cutoff_L_alt(SubLObject depth_cutoff_1, SubLObject depth_cutoff_2) {
        if (depth_cutoff_1.isInteger()) {
            if (depth_cutoff_2.isInteger()) {
                return numL(depth_cutoff_1, depth_cutoff_2);
            } else {
                return T;
            }
        } else {
            return NIL;
        }
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

    public static final SubLObject inference_set_dynamic_properties_alt(SubLObject inference, SubLObject dynamic_properties) {
        SubLTrampolineFile.checkType(dynamic_properties, INFERENCE_DYNAMIC_PROPERTIES_P);
        {
            SubLObject return_type = inference_datastructures_enumerated_types.inference_properties_return_type(dynamic_properties);
            SubLObject answer_language = inference_datastructures_enumerated_types.inference_properties_answer_language(dynamic_properties);
            SubLObject cache_resultsP = inference_datastructures_enumerated_types.inference_properties_cache_inference_resultsP(dynamic_properties);
            SubLObject browsableP = inference_datastructures_enumerated_types.inference_properties_browsableP(dynamic_properties);
            SubLObject continuableP = inference_datastructures_enumerated_types.inference_properties_continuableP(dynamic_properties);
            SubLObject blockP = inference_datastructures_enumerated_types.inference_properties_blockP(dynamic_properties);
            SubLObject max_number = inference_datastructures_enumerated_types.inference_properties_max_number(dynamic_properties);
            SubLObject max_time = inference_datastructures_enumerated_types.inference_properties_max_time(dynamic_properties);
            SubLObject max_step = inference_datastructures_enumerated_types.inference_properties_max_step(dynamic_properties);
            SubLObject inference_mode = inference_datastructures_enumerated_types.inference_properties_mode(dynamic_properties);
            SubLObject forward_max_time = inference_datastructures_enumerated_types.inference_properties_forward_max_time(dynamic_properties);
            SubLObject max_proof_depth = inference_datastructures_enumerated_types.inference_properties_max_proof_depth(dynamic_properties);
            SubLObject max_trans_depth = inference_datastructures_enumerated_types.inference_properties_max_transformation_depth(dynamic_properties);
            SubLObject pad = inference_datastructures_enumerated_types.inference_properties_probably_approximately_done(dynamic_properties);
            SubLObject metrics_template = inference_datastructures_enumerated_types.inference_properties_metrics(dynamic_properties);
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
            inference_datastructures_inference.set_inference_probably_approximately_done(inference, pad);
            inference_datastructures_inference.set_inference_metrics_template(inference, metrics_template);
        }
        return inference;
    }

    public static SubLObject inference_set_dynamic_properties(final SubLObject inference, final SubLObject dynamic_properties) {
        assert NIL != inference_datastructures_enumerated_types.inference_dynamic_properties_p(dynamic_properties) : "! inference_datastructures_enumerated_types.inference_dynamic_properties_p(dynamic_properties) " + ("inference_datastructures_enumerated_types.inference_dynamic_properties_p(dynamic_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.inference_dynamic_properties_p(dynamic_properties) ") + dynamic_properties;
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

    public static final SubLObject inference_run_alt(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(inference, READY_INFERENCE_P);
            SubLTrampolineFile.checkType(inference, SIMPLEST_INFERENCE_P);
            inference_analysis.possibly_enqueue_asked_query_from_inference(inference);
            inference_datastructures_inference.set_inference_control_process_to_me(inference);
            inference_datastructures_inference.initialize_inference_time_properties(inference);
            {
                SubLObject suspend_status = $UNINITIALIZED;
                SubLObject aborted_p = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = $within_inference_control_processP$.currentBinding(thread);
                        try {
                            $within_inference_control_processP$.bind(T, thread);
                            {
                                SubLObject error_message = NIL;
                                if (NIL != $inference_debugP$.getDynamicValue(thread)) {
                                    inference_datastructures_inference.set_inference_status(inference, $RUNNING);
                                    suspend_status = com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_run_handler(inference);
                                } else {
                                    try {
                                        {
                                            SubLObject _prev_bind_0_6 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(symbol_function(INFERENCE_ERROR_HANDLER), thread);
                                                try {
                                                    inference_datastructures_inference.set_inference_status(inference, $RUNNING);
                                                    suspend_status = com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_run_handler(inference);
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, $INFERENCE_ERROR);
                                    }
                                }
                                if (NIL != error_message) {
                                    suspend_status = inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message);
                                }
                            }
                        } finally {
                            $within_inference_control_processP$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    aborted_p = Errors.handleThrowable(ccatch_env_var, $INFERENCE_ABORT_TARGET);
                }
                if (NIL != aborted_p) {
                    suspend_status = $ABORT;
                    com.cyc.cycjava.cycl.inference.harness.inference_strategist.query_abort();
                }
                if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                    com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_suspend(inference, suspend_status);
                }
                return inference;
            }
        }
    }

    public static SubLObject inference_run(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.ready_inference_p(inference) : "! inference_datastructures_inference.ready_inference_p(inference) " + ("inference_datastructures_inference.ready_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.ready_inference_p(inference) ") + inference;
        assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "! inference_datastructures_inference.simplest_inference_p(inference) " + ("inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) ") + inference;
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

    /**
     * Notes that INFERENCE is suspended.
     */
    @LispMethod(comment = "Notes that INFERENCE is suspended.")
    public static final SubLObject inference_suspend_alt(SubLObject inference, SubLObject suspend_status) {
        inference_datastructures_inference.finalize_inference_time_properties(inference);
        inference_datastructures_inference.set_inference_suspend_status(inference, suspend_status);
        inference_datastructures_inference.set_inference_status(inference, $SUSPENDED);
        inference_datastructures_inference.clear_inference_control_process(inference);
        return inference;
    }

    /**
     * Notes that INFERENCE is suspended.
     */
    @LispMethod(comment = "Notes that INFERENCE is suspended.")
    public static SubLObject inference_suspend(final SubLObject inference, final SubLObject suspend_status) {
        inference_datastructures_inference.finalize_inference_time_properties(inference);
        inference_datastructures_inference.set_inference_suspend_status(inference, suspend_status);
        inference_datastructures_inference.set_inference_status(inference, $SUSPENDED);
        inference_datastructures_inference.clear_inference_control_process(inference);
        return inference;
    }

    public static final SubLObject inference_suspend_due_to_max_problem_count_alt(SubLObject inference) {
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_suspend(inference, $MAX_PROBLEM_COUNT);
    }

    public static SubLObject inference_suspend_due_to_max_problem_count(final SubLObject inference) {
        return inference_suspend(inference, $MAX_PROBLEM_COUNT);
    }

    public static final SubLObject inference_suspend_due_to_max_number_alt(SubLObject inference) {
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_suspend(inference, $MAX_NUMBER);
    }

    public static SubLObject inference_suspend_due_to_max_number(final SubLObject inference) {
        return inference_suspend(inference, $MAX_NUMBER);
    }

    public static final SubLObject inference_suspend_due_to_max_time_alt(SubLObject inference) {
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_suspend(inference, $MAX_TIME);
    }

    public static SubLObject inference_suspend_due_to_max_time(final SubLObject inference) {
        return inference_suspend(inference, $MAX_TIME);
    }

    public static final SubLObject inference_suspend_due_to_max_step_alt(SubLObject inference) {
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_suspend(inference, $MAX_STEP);
    }

    public static SubLObject inference_suspend_due_to_max_step(final SubLObject inference) {
        return inference_suspend(inference, $MAX_STEP);
    }

    public static final SubLObject inference_suspend_due_to_pad_alt(SubLObject inference) {
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_suspend(inference, $PROBABLY_APPROXIMATELY_DONE);
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

    /**
     *
     *
     * @param PATIENCE
     * 		nil or non-negative-number-p.
     * 		nil means infinite patience, 0 means no patience.
     * 		Tries to gracefully interrupt INFERENCE.  Gives up after PATIENCE
     * 		seconds and forcefully aborts it instead.
     */
    @LispMethod(comment = "@param PATIENCE\r\n\t\tnil or non-negative-number-p.\r\n\t\tnil means infinite patience, 0 means no patience.\r\n\t\tTries to gracefully interrupt INFERENCE.  Gives up after PATIENCE\r\n\t\tseconds and forcefully aborts it instead.")
    public static final SubLObject inference_interrupt_alt(SubLObject inference, SubLObject patience) {
        if (patience == UNPROVIDED) {
            patience = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.enforceType(inference, RUNNING_INFERENCE_P);
            if (NIL == valid_process_p(inference_datastructures_inference.inference_control_process(inference))) {
                {
                    SubLObject error_message = $str_alt69$Inference_control_process_was_kil;
                    com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_suspend(inference, inference_datastructures_enumerated_types.new_inference_error_suspend_status(error_message));
                    return inference;
                }
            }
            if (NIL == patience) {
                return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_interrupt_int(inference);
            } else {
                if (patience.isZero()) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_abort_int(inference);
                } else {
                    SubLTrampolineFile.checkType(patience, POSITIVE_NUMBER_P);
                    {
                        SubLObject my_patience_ran_out_p = NIL;
                        SubLObject tag = with_timeout_make_tag();
                        try {
                            {
                                SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    {
                                        SubLObject timer = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0_7 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                try {
                                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                    timer = with_timeout_start_timer(patience, tag);
                                                    com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_interrupt_int(inference);
                                                } finally {
                                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_7, thread);
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    with_timeout_stop_timer(timer);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            my_patience_ran_out_p = Errors.handleThrowable(ccatch_env_var, tag);
                        }
                        if (NIL != my_patience_ran_out_p) {
                            com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_abort_int(inference);
                        }
                    }
                    return inference;
                }
            }
        }
    }

    /**
     *
     *
     * @param PATIENCE
     * 		nil or non-negative-number-p.
     * 		nil means infinite patience, 0 means no patience.
     * 		Tries to gracefully interrupt INFERENCE.  Gives up after PATIENCE
     * 		seconds and forcefully aborts it instead.
     */
    @LispMethod(comment = "@param PATIENCE\r\n\t\tnil or non-negative-number-p.\r\n\t\tnil means infinite patience, 0 means no patience.\r\n\t\tTries to gracefully interrupt INFERENCE.  Gives up after PATIENCE\r\n\t\tseconds and forcefully aborts it instead.")
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
        assert NIL != number_utilities.positive_number_p(patience) : "! number_utilities.positive_number_p(patience) " + ("number_utilities.positive_number_p(patience) " + "CommonSymbols.NIL != number_utilities.positive_number_p(patience) ") + patience;
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

    /**
     * Wait forever for INFERENCE to interrupt itself gracefully.
     */
    @LispMethod(comment = "Wait forever for INFERENCE to interrupt itself gracefully.")
    public static final SubLObject inference_interrupt_int_alt(SubLObject inference) {
        inference_datastructures_inference.inference_signal_interrupt(inference);
        process_block();
        return inference;
    }

    /**
     * Wait forever for INFERENCE to interrupt itself gracefully.
     */
    @LispMethod(comment = "Wait forever for INFERENCE to interrupt itself gracefully.")
    public static SubLObject inference_interrupt_int(final SubLObject inference) {
        inference_datastructures_inference.inference_signal_interrupt(inference);
        process_block();
        return inference;
    }

    /**
     * Immediately forcefully aborts INFERENCE.
     */
    @LispMethod(comment = "Immediately forcefully aborts INFERENCE.")
    public static final SubLObject inference_abort_alt(SubLObject inference) {
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_interrupt(inference, ZERO_INTEGER);
    }

    /**
     * Immediately forcefully aborts INFERENCE.
     */
    @LispMethod(comment = "Immediately forcefully aborts INFERENCE.")
    public static SubLObject inference_abort(final SubLObject inference) {
        return inference_interrupt(inference, ZERO_INTEGER);
    }

    /**
     * Forcibly aborts INFERENCE after DELAY seconds of delay.
     */
    @LispMethod(comment = "Forcibly aborts INFERENCE after DELAY seconds of delay.")
    public static final SubLObject inference_abort_after_delay_alt(SubLObject inference, SubLObject delay) {
        if (delay == UNPROVIDED) {
            delay = ZERO_INTEGER;
        }
        if (delay.isPositive()) {
            sleep(delay);
        }
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_abort(inference);
    }

    /**
     * Forcibly aborts INFERENCE after DELAY seconds of delay.
     */
    @LispMethod(comment = "Forcibly aborts INFERENCE after DELAY seconds of delay.")
    public static SubLObject inference_abort_after_delay(final SubLObject inference, SubLObject delay) {
        if (delay == UNPROVIDED) {
            delay = ZERO_INTEGER;
        }
        if (delay.isPositive()) {
            sleep(delay);
        }
        return inference_abort(inference);
    }

    /**
     * Immediately forcefully aborts INFERENCE if it is currently running.
     */
    @LispMethod(comment = "Immediately forcefully aborts INFERENCE if it is currently running.")
    public static final SubLObject inference_abort_if_running_alt(SubLObject inference) {
        if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
            return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_abort(inference);
        }
        return NIL;
    }

    /**
     * Immediately forcefully aborts INFERENCE if it is currently running.
     */
    @LispMethod(comment = "Immediately forcefully aborts INFERENCE if it is currently running.")
    public static SubLObject inference_abort_if_running(final SubLObject inference) {
        if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
            return inference_abort(inference);
        }
        return NIL;
    }

    /**
     * Immediately forcefully abort the current controlling inference.
     */
    @LispMethod(comment = "Immediately forcefully abort the current controlling inference.")
    public static final SubLObject abort_current_controlling_inference_alt() {
        {
            SubLObject inference = inference_macros.current_controlling_inference();
            if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_abort(inference);
            }
        }
        return NIL;
    }

    /**
     * Immediately forcefully abort the current controlling inference.
     */
    @LispMethod(comment = "Immediately forcefully abort the current controlling inference.")
    public static SubLObject abort_current_controlling_inference() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
            return inference_abort(inference);
        }
        return NIL;
    }

    public static final SubLObject inference_abort_int_alt(SubLObject inference) {
        try {
            {
                SubLObject control_process = inference_datastructures_inference.inference_control_process(inference);
                if (NIL != processp(control_process)) {
                    interrupt_process(control_process, SIGNAL_INFERENCE_CONTROL_PROCESS_ABORT);
                }
            }
        } finally {
            {
                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    inference_datastructures_inference.inference_handle_interrupts(inference);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return inference;
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

    public static final SubLObject wait_for_inference_to_unblock_alt() {
        process_block();
        return NIL;
    }

    public static SubLObject wait_for_inference_to_unblock() {
        process_block();
        return NIL;
    }

    public static final SubLObject signal_inference_to_unblock_alt(SubLObject inference) {
        {
            SubLObject process = inference_datastructures_inference.inference_control_process(inference);
            if (NIL != valid_process_p(process)) {
                process_unblock(process);
                return T;
            }
        }
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

    public static final SubLObject signal_inference_to_finish_alt(SubLObject inference) {
        if (NIL != inference_datastructures_inference.inference_p(inference)) {
            inference_datastructures_inference.clear_inference_blocking(inference);
            {
                SubLObject process = inference_datastructures_inference.inference_control_process(inference);
                if (NIL != valid_process_p(process)) {
                    process_unblock(process);
                    return T;
                }
            }
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

    public static final SubLObject inference_max_number_reachedP_alt(SubLObject inference) {
        {
            SubLObject max_number = inference_datastructures_inference.inference_max_number(inference);
            if (NIL != max_number) {
                {
                    SubLObject number = inference_datastructures_inference.inference_new_result_count(inference);
                    if (number.numGE(max_number)) {
                        return T;
                    }
                }
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

    public static final SubLObject inference_max_time_reachedP_alt(SubLObject inference) {
        {
            SubLObject end_time = inference_datastructures_inference.inference_end_internal_real_time(inference);
            if (NIL != end_time) {
                return internal_real_time_has_arrivedP(end_time);
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

    public static final SubLObject current_controlling_inference_max_time_reachedP_alt() {
        {
            SubLObject inference = inference_macros.current_controlling_inference();
            if (NIL != inference) {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_max_time_reachedP(inference)) {
                    return T;
                }
            }
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

    public static final SubLObject current_controlling_inference_time_remaining_alt() {
        {
            SubLObject inference = inference_macros.current_controlling_inference();
            return NIL != inference ? ((SubLObject) (inference_datastructures_inference.inference_remaining_time(inference, T))) : NIL;
        }
    }

    public static SubLObject current_controlling_inference_time_remaining() {
        final SubLObject inference = inference_macros.current_controlling_inference();
        return NIL != inference ? inference_datastructures_inference.inference_remaining_time(inference, T) : NIL;
    }

    public static final SubLObject inference_max_step_reachedP_alt(SubLObject inference) {
        {
            SubLObject max_step = inference_datastructures_inference.inference_max_step(inference);
            if (NIL != max_step) {
                {
                    SubLObject step_count = inference_datastructures_inference.inference_step_count(inference);
                    return numGE(step_count, max_step);
                }
            }
        }
        return NIL;
    }

    public static SubLObject inference_max_step_reachedP(final SubLObject inference) {
        final SubLObject max_step = inference_datastructures_inference.inference_max_step(inference);
        if (NIL != max_step) {
            final SubLObject step_count = inference_datastructures_inference.inference_step_count(inference);
            return numGE(step_count, max_step);
        }
        return NIL;
    }

    public static final SubLObject inference_max_problem_count_reachedP_alt(SubLObject inference) {
        return inference_datastructures_problem_store.problem_store_max_problem_count_reachedP(inference_datastructures_inference.inference_problem_store(inference));
    }

    public static SubLObject inference_max_problem_count_reachedP(final SubLObject inference) {
        return inference_datastructures_problem_store.problem_store_max_problem_count_reachedP(inference_datastructures_inference.inference_problem_store(inference));
    }

    public static final SubLObject inference_max_proof_count_reachedP_alt(SubLObject inference) {
        return inference_datastructures_problem_store.problem_store_max_proof_count_reachedP(inference_datastructures_inference.inference_problem_store(inference));
    }

    public static SubLObject inference_max_proof_count_reachedP(final SubLObject inference) {
        return inference_datastructures_problem_store.problem_store_max_proof_count_reachedP(inference_datastructures_inference.inference_problem_store(inference));
    }

    public static final SubLObject inference_crazy_max_problem_count_reachedP_alt(SubLObject inference) {
        return inference_datastructures_problem_store.problem_store_crazy_max_problem_count_reachedP(inference_datastructures_inference.inference_problem_store(inference));
    }

    public static SubLObject inference_crazy_max_problem_count_reachedP(final SubLObject inference) {
        return inference_datastructures_problem_store.problem_store_crazy_max_problem_count_reachedP(inference_datastructures_inference.inference_problem_store(inference));
    }

    public static final SubLObject inference_probably_approximately_doneP_alt(SubLObject inference) {
        if (NIL != probably_approximately_done.pad_metrics_enabledP()) {
            return NIL;
        }
        if (inference_datastructures_inference.inference_answer_count(inference).isZero()) {
            {
                SubLObject end_time = inference_datastructures_inference.inference_pad_internal_real_time(inference);
                if (NIL != internal_real_time_p(end_time)) {
                    return internal_real_time_has_arrivedP(end_time);
                }
            }
        }
        return NIL;
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

    /**
     * Halt conditions are noted by overloading the suspend-status while the inference is still running.
     */
    @LispMethod(comment = "Halt conditions are noted by overloading the suspend-status while the inference is still running.")
    public static final SubLObject inference_halt_condition_reachedP_alt(SubLObject inference) {
        return inference_datastructures_enumerated_types.inference_halt_condition_p(inference_datastructures_inference.inference_suspend_status(inference));
    }

    /**
     * Halt conditions are noted by overloading the suspend-status while the inference is still running.
     */
    @LispMethod(comment = "Halt conditions are noted by overloading the suspend-status while the inference is still running.")
    public static SubLObject inference_halt_condition_reachedP(final SubLObject inference) {
        return inference_datastructures_enumerated_types.inference_halt_condition_p(inference_datastructures_inference.inference_suspend_status(inference));
    }

    /**
     *
     *
     * @return nil or inference-suspend-status-p
    Handles the inference-type-independent results; those that can be
    determined without knowing the type of INFERENCE.
    a NIL return value means that a type-independent result
    cannot be determined.
     */
    @LispMethod(comment = "@return nil or inference-suspend-status-p\r\nHandles the inference-type-independent results; those that can be\r\ndetermined without knowing the type of INFERENCE.\r\na NIL return value means that a type-independent result\r\ncannot be determined.")
    public static final SubLObject inference_determine_type_independent_result_alt(SubLObject inference) {
        if (NIL != inference_datastructures_inference.inference_interrupt_signaledP(inference)) {
            return $INTERRUPT;
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_max_number_reachedP(inference)) {
                return $MAX_NUMBER;
            } else {
                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_max_time_reachedP(inference)) {
                    return $MAX_TIME;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_max_step_reachedP(inference)) {
                        return $MAX_STEP;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_max_problem_count_reachedP(inference)) {
                            return $MAX_PROBLEM_COUNT;
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_max_proof_count_reachedP(inference)) {
                                return $MAX_PROOF_COUNT;
                            } else {
                                if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_probably_approximately_doneP(inference)) {
                                    return $PROBABLY_APPROXIMATELY_DONE;
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_halt_condition_reachedP(inference)) {
                                        return inference_datastructures_inference.inference_suspend_status(inference);
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return nil or inference-suspend-status-p
    Handles the inference-type-independent results; those that can be
    determined without knowing the type of INFERENCE.
    a NIL return value means that a type-independent result
    cannot be determined.
     */
    @LispMethod(comment = "@return nil or inference-suspend-status-p\r\nHandles the inference-type-independent results; those that can be\r\ndetermined without knowing the type of INFERENCE.\r\na NIL return value means that a type-independent result\r\ncannot be determined.")
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

    public static final SubLObject strategy_type_from_sentence_and_static_properties_alt(SubLObject sentence, SubLObject mt, SubLObject static_properties) {
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.strategy_type_from_static_properties(static_properties);
    }

    public static SubLObject strategy_type_from_sentence_and_static_properties(final SubLObject sentence, final SubLObject mt, final SubLObject static_properties) {
        return strategy_type_from_static_properties(static_properties);
    }

    public static final SubLObject strategy_type_from_dnf_and_static_properties_alt(SubLObject dnf, SubLObject mt, SubLObject static_properties) {
        return com.cyc.cycjava.cycl.inference.harness.inference_strategist.strategy_type_from_static_properties(static_properties);
    }

    public static SubLObject strategy_type_from_dnf_and_static_properties(final SubLObject dnf, final SubLObject mt, final SubLObject static_properties) {
        return strategy_type_from_static_properties(static_properties);
    }

    public static final SubLObject strategy_type_from_static_properties_alt(SubLObject static_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.properties_indicate_forward_inferenceP(static_properties)) {
                return $forward_strategy_type$.getDynamicValue(thread);
            } else {
                if (NIL != inference_datastructures_enumerated_types.balancing_tactician_enabledP()) {
                    return NIL != inference_datastructures_enumerated_types.problem_store_properties_abduction_allowedP(static_properties) ? ((SubLObject) (inference_abduction_utilities.$abductive_strategy_type$.getDynamicValue(thread))) : $BALANCING;
                } else {
                    if (NIL != inference_datastructures_enumerated_types.problem_store_properties_abduction_allowedP(static_properties)) {
                        return inference_abduction_utilities.$abductive_strategy_type$.getDynamicValue(thread);
                    } else {
                        if (NIL != inference_datastructures_enumerated_types.transformation_allowed_by_propertiesP(static_properties)) {
                            return $default_strategy_type$.getDynamicValue(thread);
                        } else {
                            return $exhaustive_removal_strategy_type$.getDynamicValue(thread);
                        }
                    }
                }
            }
        }
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

    public static final SubLObject properties_indicate_forward_inferenceP_alt(SubLObject static_properties) {
        {
            SubLObject store = inference_datastructures_enumerated_types.inference_properties_problem_store(static_properties);
            if ((NIL != store) && (NIL != inference_datastructures_problem_store.problem_store_forwardP(store))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject properties_indicate_forward_inferenceP(final SubLObject static_properties) {
        final SubLObject store = inference_datastructures_enumerated_types.inference_properties_problem_store(static_properties);
        if ((NIL != store) && (NIL != inference_datastructures_problem_store.problem_store_forwardP(store))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject inference_permits_transformationP_alt(SubLObject inference) {
        {
            SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            return makeBoolean((NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(store)) && (!ZERO_INTEGER.eql(inference_datastructures_inference.inference_max_transformation_depth(inference))));
        }
    }

    public static SubLObject inference_permits_transformationP(final SubLObject inference) {
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        return makeBoolean((NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(store)) && (!ZERO_INTEGER.eql(inference_datastructures_inference.inference_max_transformation_depth(inference))));
    }

    public static final SubLObject determine_best_strategy_type_for_inference_alt(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != inference_datastructures_enumerated_types.balancing_tactician_enabledP()) {
                return NIL != inference_datastructures_inference.abductive_inference_p(inference) ? ((SubLObject) (inference_abduction_utilities.$abductive_strategy_type$.getDynamicValue(thread))) : $BALANCING;
            }
            if (NIL != inference_datastructures_inference.forward_inference_p(inference)) {
                return $forward_strategy_type$.getDynamicValue(thread);
            } else {
                if (NIL != inference_datastructures_inference.abductive_inference_p(inference)) {
                    return inference_abduction_utilities.$abductive_strategy_type$.getDynamicValue(thread);
                } else {
                    if ((((NIL == com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_permits_transformationP(inference)) && (NIL == inference_datastructures_inference.inference_max_number(inference))) && (NIL == inference_datastructures_inference.inference_max_time(inference))) && (NIL == inference_datastructures_inference.inference_max_step(inference))) {
                        return $exhaustive_removal_strategy_type$.getDynamicValue(thread);
                    } else {
                        return $default_strategy_type$.getDynamicValue(thread);
                    }
                }
            }
        }
    }

    public static SubLObject determine_best_strategy_type_for_inference(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != inference_datastructures_inference.abductive_inference_p(inference) ? abductive_tactician.$abductive_strategy_type$.getDynamicValue(thread) : $BALANCING;
    }

    public static final SubLObject consider_switching_strategies_alt(SubLObject inference) {
        SubLTrampolineFile.checkType(inference, SIMPLEST_INFERENCE_P);
        {
            SubLObject best_strategy_type = com.cyc.cycjava.cycl.inference.harness.inference_strategist.determine_best_strategy_type_for_inference(inference);
            if (best_strategy_type != inference_datastructures_strategy.strategy_type(inference_datastructures_inference.simplest_inference_strategy(inference))) {
                com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_switch_strategies(inference, best_strategy_type);
            }
        }
        return inference;
    }

    public static SubLObject consider_switching_strategies(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "! inference_datastructures_inference.simplest_inference_p(inference) " + ("inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) ") + inference;
        final SubLObject best_strategy_type = determine_best_strategy_type_for_inference(inference);
        if (!best_strategy_type.eql(inference_datastructures_strategy.strategy_type(inference_datastructures_inference.simplest_inference_strategy(inference)))) {
            inference_switch_strategies(inference, best_strategy_type);
        }
        return inference;
    }

    /**
     * Causes INFERENCE to switch from its existing strategy to a new strategy of
     * NEW-STRATEGY-TYPE.  Destroys the old strategy after the switch.
     */
    @LispMethod(comment = "Causes INFERENCE to switch from its existing strategy to a new strategy of\r\nNEW-STRATEGY-TYPE.  Destroys the old strategy after the switch.\nCauses INFERENCE to switch from its existing strategy to a new strategy of\nNEW-STRATEGY-TYPE.  Destroys the old strategy after the switch.")
    public static final SubLObject inference_switch_strategies_alt(SubLObject inference, SubLObject new_strategy_type) {
        SubLTrampolineFile.checkType(inference, SIMPLEST_INFERENCE_P);
        return inference;
    }

    /**
     * Causes INFERENCE to switch from its existing strategy to a new strategy of
     * NEW-STRATEGY-TYPE.  Destroys the old strategy after the switch.
     */
    @LispMethod(comment = "Causes INFERENCE to switch from its existing strategy to a new strategy of\r\nNEW-STRATEGY-TYPE.  Destroys the old strategy after the switch.\nCauses INFERENCE to switch from its existing strategy to a new strategy of\nNEW-STRATEGY-TYPE.  Destroys the old strategy after the switch.")
    public static SubLObject inference_switch_strategies(final SubLObject inference, final SubLObject new_strategy_type) {
        assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "! inference_datastructures_inference.simplest_inference_p(inference) " + ("inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) ") + inference;
        return inference;
    }

    /**
     * A meta-strategy which just tells the strategy to
     * do a bunch of steps in this thread, i.e. handle lots of :do-one-step events,
     * optionally block, possibly perform a problem store prune,
     * and halt when done (e.g. resource constraints exhausted)
     *
     * @return inference-suspend-status-p; the halt-reason.
     */
    @LispMethod(comment = "A meta-strategy which just tells the strategy to\r\ndo a bunch of steps in this thread, i.e. handle lots of :do-one-step events,\r\noptionally block, possibly perform a problem store prune,\r\nand halt when done (e.g. resource constraints exhausted)\r\n\r\n@return inference-suspend-status-p; the halt-reason.\nA meta-strategy which just tells the strategy to\ndo a bunch of steps in this thread, i.e. handle lots of :do-one-step events,\noptionally block, possibly perform a problem store prune,\nand halt when done (e.g. resource constraints exhausted)")
    public static final SubLObject simplest_inference_run_handler_alt(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(inference, SIMPLEST_INFERENCE_P);
            {
                SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
                SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                SubLObject timeout = com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_abort_max_time(inference);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = inference_macros.$pad_gathering_metricsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = inference_macros.$pad_metrics_data$.currentBinding(thread);
                    try {
                        inference_macros.$pad_gathering_metricsP$.bind(probably_approximately_done.pad_metrics_enabledP(), thread);
                        inference_macros.$pad_metrics_data$.bind(NIL != inference_macros.$pad_gathering_metricsP$.getDynamicValue(thread) ? ((SubLObject) (list(probably_approximately_done.new_pad_metrics_data()))) : NIL, thread);
                        {
                            SubLObject abort_max_time = timeout;
                            if (NIL != abort_max_time) {
                                {
                                    SubLObject timed_out = NIL;
                                    SubLObject tag = with_timeout_make_tag();
                                    try {
                                        {
                                            SubLObject _prev_bind_0_9 = $within_with_timeout$.currentBinding(thread);
                                            try {
                                                $within_with_timeout$.bind(T, thread);
                                                {
                                                    SubLObject timer = NIL;
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_10 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                            try {
                                                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                timer = with_timeout_start_timer(abort_max_time, tag);
                                                                {
                                                                    SubLObject store_var = store;
                                                                    SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
                                                                    {
                                                                        SubLObject _prev_bind_0_11 = memoization_state.$memoization_state$.currentBinding(thread);
                                                                        try {
                                                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                                                            {
                                                                                SubLObject original_memoization_process = NIL;
                                                                                if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                                    {
                                                                                        SubLObject current_proc = current_process();
                                                                                        if (NIL == original_memoization_process) {
                                                                                            memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                                        } else {
                                                                                            if (original_memoization_process != current_proc) {
                                                                                                Errors.error($str_alt40$Invalid_attempt_to_reuse_memoizat);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    {
                                                                                        SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_12 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_13 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                                                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_14 = inference_datastructures_problem_store.$problem_store_modification_permittedP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        inference_datastructures_problem_store.$problem_store_modification_permittedP$.bind(T, thread);
                                                                                                        com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_do_forward_propagation(inference);
                                                                                                        {
                                                                                                            SubLObject padP = NIL;
                                                                                                            SubLObject doneP = padP;
                                                                                                            while (NIL == doneP) {
                                                                                                                com.cyc.cycjava.cycl.inference.harness.inference_strategist.possibly_wait_for_inference_to_unblock(inference);
                                                                                                                inference_tactician.strategy_do_one_step(strategy);
                                                                                                                padP = probably_approximately_done.possibly_update_pad_metrics(inference);
                                                                                                                if (ONE_INTEGER.numE(inference_datastructures_inference.inference_probably_approximately_done(inference))) {
                                                                                                                    padP = NIL;
                                                                                                                }
                                                                                                                com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_possibly_prune(inference);
                                                                                                                doneP = makeBoolean((NIL != padP) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_doneP(inference)));
                                                                                                            } 
                                                                                                            inference_tactician.strategy_throw_away_uninteresting_set_asides(strategy);
                                                                                                            result = com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_determine_result(inference, padP);
                                                                                                            if ($INTERRUPT == result) {
                                                                                                                inference_datastructures_inference.inference_handle_interrupts(inference);
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        inference_datastructures_problem_store.$problem_store_modification_permittedP$.rebind(_prev_bind_0_14, thread);
                                                                                                    }
                                                                                                }
                                                                                                space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                                                                            } finally {
                                                                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                                                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_13, thread);
                                                                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_12, thread);
                                                                                            }
                                                                                        }
                                                                                        inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                                                                                    }
                                                                                } finally {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                            }
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_11, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_10, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                with_timeout_stop_timer(timer);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                $within_with_timeout$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                                    }
                                    if (NIL != timed_out) {
                                        result = $MAX_TIME;
                                    }
                                }
                            } else {
                                {
                                    SubLObject store_var = store;
                                    SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
                                    {
                                        SubLObject _prev_bind_0_17 = memoization_state.$memoization_state$.currentBinding(thread);
                                        try {
                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                            {
                                                SubLObject original_memoization_process = NIL;
                                                if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                    {
                                                        SubLObject current_proc = current_process();
                                                        if (NIL == original_memoization_process) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                        } else {
                                                            if (original_memoization_process != current_proc) {
                                                                Errors.error($str_alt40$Invalid_attempt_to_reuse_memoizat);
                                                            }
                                                        }
                                                    }
                                                }
                                                try {
                                                    {
                                                        SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                                                        {
                                                            SubLObject _prev_bind_0_18 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_19 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                            try {
                                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                                                {
                                                                    SubLObject _prev_bind_0_20 = inference_datastructures_problem_store.$problem_store_modification_permittedP$.currentBinding(thread);
                                                                    try {
                                                                        inference_datastructures_problem_store.$problem_store_modification_permittedP$.bind(T, thread);
                                                                        com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_do_forward_propagation(inference);
                                                                        {
                                                                            SubLObject padP = NIL;
                                                                            SubLObject doneP = padP;
                                                                            while (NIL == doneP) {
                                                                                com.cyc.cycjava.cycl.inference.harness.inference_strategist.possibly_wait_for_inference_to_unblock(inference);
                                                                                inference_tactician.strategy_do_one_step(strategy);
                                                                                padP = probably_approximately_done.possibly_update_pad_metrics(inference);
                                                                                if (ONE_INTEGER.numE(inference_datastructures_inference.inference_probably_approximately_done(inference))) {
                                                                                    padP = NIL;
                                                                                }
                                                                                com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_possibly_prune(inference);
                                                                                doneP = makeBoolean((NIL != padP) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_doneP(inference)));
                                                                            } 
                                                                            inference_tactician.strategy_throw_away_uninteresting_set_asides(strategy);
                                                                            result = com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_determine_result(inference, padP);
                                                                            if ($INTERRUPT == result) {
                                                                                inference_datastructures_inference.inference_handle_interrupts(inference);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        inference_datastructures_problem_store.$problem_store_modification_permittedP$.rebind(_prev_bind_0_20, thread);
                                                                    }
                                                                }
                                                                space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                                            } finally {
                                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_19, thread);
                                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_18, thread);
                                                            }
                                                        }
                                                        inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                }
                            }
                            probably_approximately_done.pad_finish_gathering_metrics(inference);
                        }
                    } finally {
                        inference_macros.$pad_metrics_data$.rebind(_prev_bind_1, thread);
                        inference_macros.$pad_gathering_metricsP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!(($EXHAUST != result) || (NIL != inference_datastructures_inference.inference_continuableP(inference)))) {
                        Errors.error($str_alt78$Non_continuable_inference_should_);
                    }
                }
                return result;
            }
        }
    }

    /**
     * A meta-strategy which just tells the strategy to
     * do a bunch of steps in this thread, i.e. handle lots of :do-one-step events,
     * optionally block, possibly perform a problem store prune,
     * and halt when done (e.g. resource constraints exhausted)
     *
     * @return inference-suspend-status-p; the halt-reason.
     */
    @LispMethod(comment = "A meta-strategy which just tells the strategy to\r\ndo a bunch of steps in this thread, i.e. handle lots of :do-one-step events,\r\noptionally block, possibly perform a problem store prune,\r\nand halt when done (e.g. resource constraints exhausted)\r\n\r\n@return inference-suspend-status-p; the halt-reason.\nA meta-strategy which just tells the strategy to\ndo a bunch of steps in this thread, i.e. handle lots of :do-one-step events,\noptionally block, possibly perform a problem store prune,\nand halt when done (e.g. resource constraints exhausted)")
    public static SubLObject simplest_inference_run_handler(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.simplest_inference_p(inference) : "! inference_datastructures_inference.simplest_inference_p(inference) " + ("inference_datastructures_inference.simplest_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.simplest_inference_p(inference) ") + inference;
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

    public static final SubLObject inference_do_forward_propagation_alt(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject forward_max_time = inference_datastructures_inference.inference_forward_max_time(inference);
                SubLObject mt = inference_datastructures_inference.inference_mt(inference);
                if (forward_max_time.isInteger() && forward_max_time.numG(ZERO_INTEGER)) {
                    if (NIL == inference_datastructures_forward_propagate.forward_propagate_p(inference_datastructures_inference.inference_forward_propagate(inference))) {
                        inference_datastructures_inference.set_inference_forward_propagate(inference, inference_datastructures_forward_propagate.new_forward_propagate(mt));
                    }
                    {
                        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                        SubLObject store_var = store;
                        SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store_var);
                        {
                            SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                {
                                    SubLObject original_memoization_process = NIL;
                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                        {
                                            SubLObject current_proc = current_process();
                                            if (NIL == original_memoization_process) {
                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                            } else {
                                                if (original_memoization_process != current_proc) {
                                                    Errors.error($str_alt40$Invalid_attempt_to_reuse_memoizat);
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        {
                                            SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store_var);
                                            {
                                                SubLObject _prev_bind_0_22 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                                    forward_propagate_assertions.inference_forward_propagate_mt(inference_datastructures_inference.inference_forward_propagate(inference), mt, NIL, forward_max_time, NIL);
                                                    space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                                } finally {
                                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_22, thread);
                                                }
                                            }
                                            inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store_var, space_var);
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_23, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject simplest_inference_doneP_alt(SubLObject inference) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_exhaustedP(inference)) {
            return T;
        } else {
            return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_determine_type_independent_result(inference));
        }
    }

    public static SubLObject simplest_inference_doneP(final SubLObject inference) {
        if (NIL != simplest_inference_exhaustedP(inference)) {
            return T;
        }
        return list_utilities.sublisp_boolean(inference_determine_type_independent_result(inference));
    }

    public static final SubLObject possibly_wait_for_inference_to_unblock_alt(SubLObject inference) {
        if (NIL != inference_datastructures_inference.inference_blockingP(inference)) {
            com.cyc.cycjava.cycl.inference.harness.inference_strategist.wait_for_inference_to_unblock();
            return T;
        }
        return NIL;
    }

    public static SubLObject possibly_wait_for_inference_to_unblock(final SubLObject inference) {
        if (NIL != inference_datastructures_inference.inference_blockingP(inference)) {
            wait_for_inference_to_unblock();
            return T;
        }
        return NIL;
    }

    public static final SubLObject simplest_inference_possibly_prune_alt(SubLObject inference) {
        if (((NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_max_problem_count_reachedP(inference)) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_max_proof_count_reachedP(inference))) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_prune_frequency_reachedP(inference))) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_crazy_max_problem_count_reachedP(inference)) {
                {
                    SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                    Errors.error($str_alt79$Crazy_amount_of_problems___a__in_, inference_datastructures_problem_store.problem_store_problem_count(store), store);
                }
            }
            {
                SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
                return inference_tactician.strategy_do_problem_store_prune(strategy);
            }
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

    public static final SubLObject inference_prune_frequency_reachedP_alt(SubLObject inference) {
        return NIL;
    }

    public static SubLObject inference_prune_frequency_reachedP(final SubLObject inference) {
        return NIL;
    }

    /**
     *
     *
     * @return nil or inference-suspend-status-p,
    nil indicates it's not time to suspend yet (still more work to do)
     */
    @LispMethod(comment = "@return nil or inference-suspend-status-p,\r\nnil indicates it\'s not time to suspend yet (still more work to do)")
    public static final SubLObject simplest_inference_determine_result_alt(SubLObject inference, SubLObject padP) {
        if (NIL != padP) {
            return $PROBABLY_APPROXIMATELY_DONE;
        }
        {
            SubLObject result = com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_determine_type_independent_result(inference);
            if (NIL != result) {
                return result;
            }
        }
        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_exhaustedP(inference)) {
            return NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_continuation_possibleP(inference)) {
            return $EXHAUST;
        } else {
            return $EXHAUST_TOTAL;
        }
    }

    /**
     *
     *
     * @return nil or inference-suspend-status-p,
    nil indicates it's not time to suspend yet (still more work to do)
     */
    @LispMethod(comment = "@return nil or inference-suspend-status-p,\r\nnil indicates it\'s not time to suspend yet (still more work to do)")
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

    public static final SubLObject simplest_inference_continuation_possibleP_alt(SubLObject inference) {
        {
            SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
            return inference_tactician.strategy_continuation_possibleP(strategy);
        }
    }

    public static SubLObject simplest_inference_continuation_possibleP(final SubLObject inference) {
        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        return inference_tactician.strategy_continuation_possibleP(strategy);
    }

    public static final SubLObject simplest_inference_exhaustedP_alt(SubLObject inference) {
        {
            SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
            return inference_tactician.strategy_doneP(strategy);
        }
    }

    public static SubLObject simplest_inference_exhaustedP(final SubLObject inference) {
        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        return inference_tactician.strategy_doneP(strategy);
    }

    public static final SubLObject simplest_inference_totally_exhaustedP_alt(SubLObject inference) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_exhaustedP(inference)) && (NIL == com.cyc.cycjava.cycl.inference.harness.inference_strategist.simplest_inference_continuation_possibleP(inference)));
    }

    public static SubLObject simplest_inference_totally_exhaustedP(final SubLObject inference) {
        return makeBoolean((NIL != simplest_inference_exhaustedP(inference)) && (NIL == simplest_inference_continuation_possibleP(inference)));
    }

    public static final SubLObject inference_note_proof_alt(SubLObject inference, SubLObject proof) {
        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_strategist.new_inference_answer_from_proof(inference, proof)) {
        }
        return NIL;
    }

    public static SubLObject inference_note_proof(final SubLObject inference, final SubLObject proof) {
        if (NIL == new_inference_answer_from_proof(inference, proof)) {
        }
        return NIL;
    }

    public static final SubLObject inference_note_no_good_alt(SubLObject inference) {
        return NIL;
    }

    public static SubLObject inference_note_no_good(final SubLObject inference) {
        return NIL;
    }

    /**
     *
     *
     * @return inference-answer-p or NIL
     */
    @LispMethod(comment = "@return inference-answer-p or NIL")
    public static final SubLObject new_inference_answer_from_proof_alt(SubLObject inference, SubLObject proof) {
        SubLTrampolineFile.checkType(inference, INFERENCE_P);
        SubLTrampolineFile.checkType(proof, PROOF_P);
        inference_worker.perform_lazy_proof_rejection(proof, inference);
        if (NIL != inference_datastructures_proof.proof_provenP(proof)) {
            {
                SubLObject answer_bindings = com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_answer_bindings_from_proof(proof, inference);
                if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_disallows_answer_from_bindingsP(inference, answer_bindings)) {
                    {
                        SubLObject v_answer = NIL;
                        if (NIL != inference_datastructures_inference.inference_compute_answer_justificationsP(inference)) {
                            {
                                SubLObject hl_justification = com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_all_explanatory_proof_supports(inference, proof);
                                SubLObject answer_justification = inference_datastructures_inference.find_or_create_inference_answer_justification(inference, answer_bindings, hl_justification);
                                v_answer = inference_datastructures_inference.inference_answer_justification_answer(answer_justification);
                                inference_datastructures_inference.add_inference_answer_justification_proof(answer_justification, proof);
                            }
                        } else {
                            v_answer = inference_datastructures_inference.find_or_create_inference_answer(inference, answer_bindings);
                        }
                        com.cyc.cycjava.cycl.inference.harness.inference_strategist.perform_inference_answer_proof_analysis(v_answer, proof);
                        inference_worker.possibly_note_proof_processed(proof);
                        return v_answer;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return inference-answer-p or NIL
     */
    @LispMethod(comment = "@return inference-answer-p or NIL")
    public static SubLObject new_inference_answer_from_proof(final SubLObject inference, final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
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

    public static final SubLObject inference_disallows_answer_from_bindingsP_alt(SubLObject inference, SubLObject answer_bindings) {
        if (NIL == inference_datastructures_inference.inference_allow_indeterminate_resultsP(inference)) {
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.some_answer_bindings_are_indeterminateP(answer_bindings)) {
                return T;
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

    public static final SubLObject inference_disallows_answer_from_proofP_alt(SubLObject inference, SubLObject proof) {
        {
            SubLObject answer_bindings = com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_answer_bindings_from_proof(proof, inference);
            return com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_disallows_answer_from_bindingsP(inference, answer_bindings);
        }
    }

    public static SubLObject inference_disallows_answer_from_proofP(final SubLObject inference, final SubLObject proof) {
        final SubLObject answer_bindings = inference_answer_bindings_from_proof(proof, inference);
        return inference_disallows_answer_from_bindingsP(inference, answer_bindings);
    }

    public static final SubLObject some_answer_bindings_are_indeterminateP_alt(SubLObject answer_bindings) {
        {
            SubLObject cdolist_list_var = answer_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject datum = binding;
                    SubLObject current = datum;
                    SubLObject variable = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt82);
                    variable = current.first();
                    current = current.rest();
                    value = current;
                    if (NIL != inference_trampolines.inference_indeterminate_termP(value)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject some_answer_bindings_are_hlP_alt(SubLObject answer_bindings) {
        {
            SubLObject cdolist_list_var = answer_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject datum = binding;
                    SubLObject current = datum;
                    SubLObject variable = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt82);
                    variable = current.first();
                    current = current.rest();
                    value = current;
                    if (NIL != cycl_utilities.expression_find_if(symbol_function(TERM_REQUIRES_HL_LANGUAGE), value, UNPROVIDED, UNPROVIDED)) {
                        return T;
                    }
                }
            }
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

    public static final SubLObject term_requires_hl_language_alt(SubLObject v_object) {
        return makeBoolean((NIL != nart_handles.nart_p(v_object)) || (NIL != assertion_handles.assertion_p(v_object)));
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

    /**
     *
     *
     * @return bindings which map INFERENCE's EL variables -> answers
     */
    @LispMethod(comment = "@return bindings which map INFERENCE\'s EL variables -> answers")
    public static final SubLObject inference_answer_bindings_from_proof_alt(SubLObject proof, SubLObject inference) {
        {
            SubLObject all_hl_bindings = com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_hl_bindings_from_proof(proof, inference);
            SubLObject hl_bindings = com.cyc.cycjava.cycl.inference.harness.inference_strategist.filter_out_uninteresting_bindings(all_hl_bindings, inference_datastructures_inference.inference_free_hl_vars(inference));
            SubLObject all_el_bindings = inference_datastructures_inference.inference_el_bindings(inference);
            SubLObject free_el_vars = inference_datastructures_inference.inference_free_el_vars(inference);
            SubLObject el_bindings = com.cyc.cycjava.cycl.inference.harness.inference_strategist.filter_out_uninteresting_bindings(all_el_bindings, free_el_vars);
            SubLObject disjunction_free_el_vars_policy = inference_datastructures_inference.inference_disjunction_free_el_vars_policy(inference);
            SubLObject answer_bindings = (NIL != el_bindings) ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_strategist.compose_el_answer_bindings(el_bindings, hl_bindings, free_el_vars, disjunction_free_el_vars_policy))) : hl_bindings;
            return answer_bindings;
        }
    }

    /**
     *
     *
     * @return bindings which map INFERENCE's EL variables -> answers
     */
    @LispMethod(comment = "@return bindings which map INFERENCE\'s EL variables -> answers")
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

    public static final SubLObject filter_out_uninteresting_bindings_alt(SubLObject v_bindings, SubLObject interesting_variables) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.all_variables_in_bindings_interestingP(v_bindings, interesting_variables)) {
            return v_bindings;
        } else {
            {
                SubLObject interesting_bindings = NIL;
                SubLObject cdolist_list_var = v_bindings;
                SubLObject binding = NIL;
                for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                    {
                        SubLObject datum = binding;
                        SubLObject current = datum;
                        SubLObject variable = NIL;
                        SubLObject value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt82);
                        variable = current.first();
                        current = current.rest();
                        value = current;
                        if (NIL != subl_promotions.memberP(variable, interesting_variables, UNPROVIDED, UNPROVIDED)) {
                            interesting_bindings = cons(binding, interesting_bindings);
                        }
                    }
                }
                interesting_bindings = nreverse(interesting_bindings);
                return interesting_bindings;
            }
        }
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

    public static final SubLObject all_variables_in_bindings_interestingP_alt(SubLObject v_bindings, SubLObject interesting_variables) {
        {
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                {
                    SubLObject datum = binding;
                    SubLObject current = datum;
                    SubLObject variable = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt82);
                    variable = current.first();
                    current = current.rest();
                    value = current;
                    if (NIL == subl_promotions.memberP(variable, interesting_variables, UNPROVIDED, UNPROVIDED)) {
                        return NIL;
                    }
                }
            }
        }
        return T;
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

    /**
     *
     *
     * @param EL-BINDINGS;
     * 		EL variables -> HL variables
     * @param HL-BINDINGS;
     * 		HL variables -> answers
     * @param FREE-EL-VARS;
     * 		free EL variables in display preference order
     * @param FREE-EL-VARS-POLICY;
     * 		the policy for handling free el variables in disjunctions
     * @return bindings-p; EL variables -> answers.
    Signals an error if the range of EL-BINDINGS and the domain of HL-BINDINGS are not
    consistent under FREE-EL-VARS-POLICY.
     */
    @LispMethod(comment = "@param EL-BINDINGS;\r\n\t\tEL variables -> HL variables\r\n@param HL-BINDINGS;\r\n\t\tHL variables -> answers\r\n@param FREE-EL-VARS;\r\n\t\tfree EL variables in display preference order\r\n@param FREE-EL-VARS-POLICY;\r\n\t\tthe policy for handling free el variables in disjunctions\r\n@return bindings-p; EL variables -> answers.\r\nSignals an error if the range of EL-BINDINGS and the domain of HL-BINDINGS are not\r\nconsistent under FREE-EL-VARS-POLICY.")
    public static final SubLObject compose_el_answer_bindings_alt(SubLObject el_bindings, SubLObject hl_bindings, SubLObject free_el_vars, SubLObject free_el_vars_policy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($COMPUTE_UNION != free_el_vars_policy) {
                {
                    SubLObject hl_vars1 = Mapping.mapcar(symbol_function(VARIABLE_BINDING_VALUE), el_bindings);
                    SubLObject hl_vars2 = Mapping.mapcar(symbol_function(VARIABLE_BINDING_VARIABLE), hl_bindings);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == list_utilities.sets_equalP(hl_vars1, hl_vars2, UNPROVIDED)) {
                            Errors.error($str_alt87$Expected_a_one_to_one_match_betwe, el_bindings, hl_bindings);
                        }
                    }
                }
            }
            {
                SubLObject el_answer_bindings = bindings.compose_bindings(el_bindings, hl_bindings);
                el_answer_bindings = bindings.stable_sort_bindings(el_answer_bindings, free_el_vars);
                return el_answer_bindings;
            }
        }
    }

    /**
     *
     *
     * @param EL-BINDINGS;
     * 		EL variables -> HL variables
     * @param HL-BINDINGS;
     * 		HL variables -> answers
     * @param FREE-EL-VARS;
     * 		free EL variables in display preference order
     * @param FREE-EL-VARS-POLICY;
     * 		the policy for handling free el variables in disjunctions
     * @return bindings-p; EL variables -> answers.
    Signals an error if the range of EL-BINDINGS and the domain of HL-BINDINGS are not
    consistent under FREE-EL-VARS-POLICY.
     */
    @LispMethod(comment = "@param EL-BINDINGS;\r\n\t\tEL variables -> HL variables\r\n@param HL-BINDINGS;\r\n\t\tHL variables -> answers\r\n@param FREE-EL-VARS;\r\n\t\tfree EL variables in display preference order\r\n@param FREE-EL-VARS-POLICY;\r\n\t\tthe policy for handling free el variables in disjunctions\r\n@return bindings-p; EL variables -> answers.\r\nSignals an error if the range of EL-BINDINGS and the domain of HL-BINDINGS are not\r\nconsistent under FREE-EL-VARS-POLICY.")
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

    /**
     *
     *
     * @return bindings which map INFERENCE's variables -> answers
     */
    @LispMethod(comment = "@return bindings which map INFERENCE\'s variables -> answers")
    public static final SubLObject inference_hl_bindings_from_proof_alt(SubLObject proof, SubLObject inference) {
        {
            SubLObject proof_hl_bindings = inference_datastructures_proof.proof_bindings(proof);
            SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference);
            SubLObject mapped_root_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(answer_link);
            SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_root_problem);
            SubLObject hl_bindings = bindings.transfer_variable_map_to_bindings(variable_map, proof_hl_bindings);
            return hl_bindings;
        }
    }

    /**
     *
     *
     * @return bindings which map INFERENCE's variables -> answers
     */
    @LispMethod(comment = "@return bindings which map INFERENCE\'s variables -> answers")
    public static SubLObject inference_hl_bindings_from_proof(final SubLObject proof, final SubLObject inference) {
        final SubLObject proof_hl_bindings = inference_datastructures_proof.proof_bindings(proof);
        final SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference);
        final SubLObject mapped_root_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(answer_link);
        final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_root_problem);
        final SubLObject hl_bindings = bindings.transfer_variable_map_to_bindings(variable_map, proof_hl_bindings);
        return hl_bindings;
    }

    public static final SubLObject inference_processed_proof_pruning_initial_threshold_metP_alt(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $processed_proof_pruning_initial_threshold$.getDynamicValue(thread)) && inference_datastructures_problem_store.problem_store_historical_proof_count(inference_datastructures_inference.inference_problem_store(inference)).numGE($processed_proof_pruning_initial_threshold$.getDynamicValue(thread)));
        }
    }

    public static SubLObject inference_processed_proof_pruning_initial_threshold_metP(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $processed_proof_pruning_initial_threshold$.getDynamicValue(thread)) && inference_datastructures_problem_store.problem_store_historical_proof_count(inference_datastructures_inference.inference_problem_store(inference)).numGE($processed_proof_pruning_initial_threshold$.getDynamicValue(thread)));
    }

    public static final SubLObject inference_processed_proof_pruning_variable_threshold_metP_alt(SubLObject inference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $processed_proof_pruning_frequency$.getDynamicValue(thread)) && subtract(inference_datastructures_problem_store.problem_store_historical_proof_count(inference_datastructures_inference.inference_problem_store(inference)), inference_datastructures_inference.inference_proof_watermark(inference)).numGE($processed_proof_pruning_frequency$.getDynamicValue(thread)));
        }
    }

    public static SubLObject inference_processed_proof_pruning_variable_threshold_metP(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $processed_proof_pruning_frequency$.getDynamicValue(thread)) && subtract(inference_datastructures_problem_store.problem_store_historical_proof_count(inference_datastructures_inference.inference_problem_store(inference)), inference_datastructures_inference.inference_proof_watermark(inference)).numGE($processed_proof_pruning_frequency$.getDynamicValue(thread)));
    }

    public static final SubLObject inference_possibly_prune_processed_proofs_alt(SubLObject inference) {
        {
            SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            SubLObject total_pruned = ZERO_INTEGER;
            if (NIL != inference_datastructures_problem_store.problem_store_allows_proof_processingP(store)) {
                if ((NIL != cyc_testing.testing_real_time_pruningP()) || ((NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_processed_proof_pruning_initial_threshold_metP(inference)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_strategist.inference_processed_proof_pruning_variable_threshold_metP(inference)))) {
                    inference_datastructures_inference.set_inference_proof_watermark(inference, inference_datastructures_problem_store.problem_store_historical_proof_count(store));
                    if (NIL != inference_datastructures_enumerated_types.balancing_tactician_enabledP()) {
                        {
                            SubLObject prune_count = inference_worker.possibly_prune_processed_proofs(store);
                            total_pruned = add(total_pruned, prune_count);
                            if (prune_count.isPositive()) {
                                total_pruned = add(total_pruned, inference_worker.prune_problem_store(store, NIL));
                            }
                        }
                    } else {
                        total_pruned = add(total_pruned, inference_worker.possibly_prune_processed_problems(store));
                    }
                }
            }
            return total_pruned;
        }
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

    public static final SubLObject perform_inference_answer_proof_analysis_alt(SubLObject v_answer, SubLObject proof) {
        {
            SubLObject subproofs = inference_datastructures_proof.all_proof_subproofs(proof);
            SubLObject rules = NIL;
            SubLObject cdolist_list_var = subproofs;
            SubLObject subproof = NIL;
            for (subproof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof = cdolist_list_var.first()) {
                if (NIL != inference_worker_transformation.generalized_transformation_proof_p(subproof)) {
                    {
                        SubLObject store = inference_datastructures_proof.proof_store(proof);
                        SubLObject rule = inference_worker_transformation.generalized_transformation_proof_rule_assertion(subproof);
                        SubLObject item_var = rule;
                        if (NIL == member(item_var, rules, symbol_function(EQ), symbol_function(IDENTITY))) {
                            rules = cons(item_var, rules);
                        }
                        inference_datastructures_problem_store.problem_store_note_transformation_rule_success(store, rule);
                    }
                }
            }
            inference_analysis.note_inference_answer_proof_rules(rules);
        }
        return NIL;
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

    public static final SubLObject cache_inference_answer_alt(SubLObject v_answer) {
        {
            SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
            SubLObject justification = NIL;
            for (justification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , justification = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_25 = inference_datastructures_inference.inference_answer_justification_proofs(justification);
                    SubLObject proof = NIL;
                    for (proof = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , proof = cdolist_list_var_25.first()) {
                        com.cyc.cycjava.cycl.inference.harness.inference_strategist.cache_proof(proof);
                    }
                }
            }
        }
        return v_answer;
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

    public static final SubLObject cache_proof_alt(SubLObject proof) {
        com.cyc.cycjava.cycl.inference.harness.inference_strategist.cache_proof_supports(proof);
        return proof;
    }

    public static SubLObject cache_proof(final SubLObject proof) {
        cache_proof_supports(proof);
        return proof;
    }

    /**
     *
     *
     * @return listp; the supports cached in the KB for PROOF.
    If the appropriate supports do not yet exist, it will create
    them and then return them.
    Result is destructible at the top level.
     */
    @LispMethod(comment = "@return listp; the supports cached in the KB for PROOF.\r\nIf the appropriate supports do not yet exist, it will create\r\nthem and then return them.\r\nResult is destructible at the top level.")
    public static final SubLObject cache_proof_supports_alt(SubLObject proof) {
        if ((NIL == inference_datastructures_proof.proof_has_subproofsP(proof)) && (NIL != list_utilities.lengthLE(inference_datastructures_proof.proof_direct_supports(proof), ONE_INTEGER, UNPROVIDED))) {
            {
                SubLObject supports = inference_datastructures_proof.proof_direct_supports(proof);
                return copy_list(supports);
            }
        } else {
            {
                SubLObject supports_copy = copy_list(inference_datastructures_proof.proof_direct_supports(proof));
                SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
                SubLObject subproof = NIL;
                for (subproof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof = cdolist_list_var.first()) {
                    supports_copy = nconc(com.cyc.cycjava.cycl.inference.harness.inference_strategist.cache_proof_supports(subproof), supports_copy);
                }
                supports_copy = nreverse(list_utilities.fast_delete_duplicates(supports_copy, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if ((NIL == inference_worker.structural_proof_p(proof)) && (NIL != list_utilities.lengthGE(supports_copy, TWO_INTEGER, UNPROVIDED))) {
                    com.cyc.cycjava.cycl.inference.harness.inference_strategist.add_deduction_for_proof(proof, supports_copy);
                }
                return supports_copy;
            }
        }
    }

    /**
     *
     *
     * @return listp; the supports cached in the KB for PROOF.
    If the appropriate supports do not yet exist, it will create
    them and then return them.
    Result is destructible at the top level.
     */
    @LispMethod(comment = "@return listp; the supports cached in the KB for PROOF.\r\nIf the appropriate supports do not yet exist, it will create\r\nthem and then return them.\r\nResult is destructible at the top level.")
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

    /**
     *
     *
     * @return nil or assertion-p
     */
    @LispMethod(comment = "@return nil or assertion-p")
    public static final SubLObject add_deduction_for_proof_alt(SubLObject proof, SubLObject supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query = inference_worker.proof_proven_query(proof);
                SubLTrampolineFile.checkType(query, ATOMIC_CLAUSES_P);
                {
                    SubLObject clause = query.first();
                    SubLTrampolineFile.checkType(clause, ATOMIC_CLAUSE_P);
                    {
                        SubLObject truth = NIL;
                        if (NIL != clause_utilities.pos_atomic_clause_p(clause)) {
                            truth = $TRUE;
                        } else {
                            truth = $FALSE;
                        }
                        {
                            SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(clause);
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt94);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt94);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject deduction = hl_storage_modules.hl_add_deduction_for_gaf(asent, truth, mt, supports, $cached_ask_result_direction$.getDynamicValue(thread));
                                    SubLObject redundantP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject assertion = (NIL != deduction_handles.deduction_p(deduction)) ? ((SubLObject) (deductions_high.deduction_assertion(deduction))) : NIL;
                                        return assertion;
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt94);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return nil or assertion-p
     */
    @LispMethod(comment = "@return nil or assertion-p")
    public static SubLObject add_deduction_for_proof(final SubLObject proof, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = inference_worker.proof_proven_query(proof);
        assert NIL != clause_utilities.atomic_clauses_p(query) : "! clause_utilities.atomic_clauses_p(query) " + ("clause_utilities.atomic_clauses_p(query) " + "CommonSymbols.NIL != clause_utilities.atomic_clauses_p(query) ") + query;
        final SubLObject clause = query.first();
        assert NIL != clauses.atomic_clause_p(clause) : "! clauses.atomic_clause_p(clause) " + ("clauses.atomic_clause_p(clause) " + "CommonSymbols.NIL != clauses.atomic_clause_p(clause) ") + clause;
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

    /**
     * Attempt to evaluate BODY.
     * When TIME is non-NIL, if the evaluation does not complete after TIME seconds,
     * abort this thread via QUERY-ABORT.
     *
     * @param TIME
     * 		nil or numberp
     */
    @LispMethod(comment = "Attempt to evaluate BODY.\r\nWhen TIME is non-NIL, if the evaluation does not complete after TIME seconds,\r\nabort this thread via QUERY-ABORT.\r\n\r\n@param TIME\r\n\t\tnil or numberp\nAttempt to evaluate BODY.\nWhen TIME is non-NIL, if the evaluation does not complete after TIME seconds,\nabort this thread via QUERY-ABORT.")
    public static final SubLObject with_query_abort_timeout_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject time = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt95);
            time = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject timer = $sym96$TIMER;
                return list(CLET, list(timer), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, timer, list(WITH_QUERY_ABORT_TIMEOUT_START_TIMER, time)), append(body, NIL)), list(WITH_QUERY_ABORT_TIMEOUT_STOP_TIMER, timer)));
            }
        }
    }

    @LispMethod(comment = "Attempt to evaluate BODY.\r\nWhen TIME is non-NIL, if the evaluation does not complete after TIME seconds,\r\nabort this thread via QUERY-ABORT.\r\n\r\n@param TIME\r\n\t\tnil or numberp\nAttempt to evaluate BODY.\nWhen TIME is non-NIL, if the evaluation does not complete after TIME seconds,\nabort this thread via QUERY-ABORT.")
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
    }/**
     * Attempt to evaluate BODY.
     * When TIME is non-NIL, if the evaluation does not complete after TIME seconds,
     * abort this thread via QUERY-ABORT.
     *
     * @param TIME
     * 		nil or numberp
     */


    /**
     * Start a new timer process that will interrupt the current process by
     * throwing to TAG after TIME seconds.
     */
    @LispMethod(comment = "Start a new timer process that will interrupt the current process by\r\nthrowing to TAG after TIME seconds.\nStart a new timer process that will interrupt the current process by\nthrowing to TAG after TIME seconds.")
    public static final SubLObject with_query_abort_timeout_start_timer_alt(SubLObject time) {
        if (NIL == time) {
            return NIL;
        }
        {
            SubLObject client_semaphore = Semaphores.new_semaphore($str_alt101$WITH_QUERY_ABORT_TIMEOUT_client, ZERO_INTEGER);
            SubLObject timer_semaphore = Semaphores.new_semaphore($str_alt102$WITH_QUERY_ABORT_TIMEOUT_timer, ZERO_INTEGER);
            SubLObject timer = subl_promotions.make_process_with_args($str_alt102$WITH_QUERY_ABORT_TIMEOUT_timer, WITH_QUERY_ABORT_TIMEOUT_TIMER_THREAD, list(current_process(), time, client_semaphore, timer_semaphore));
            Semaphores.semaphore_signal(client_semaphore);
            Semaphores.semaphore_wait(timer_semaphore);
            return timer;
        }
    }

    @LispMethod(comment = "Start a new timer process that will interrupt the current process by\r\nthrowing to TAG after TIME seconds.\nStart a new timer process that will interrupt the current process by\nthrowing to TAG after TIME seconds.")
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
    }/**
     * Start a new timer process that will interrupt the current process by
     * throwing to TAG after TIME seconds.
     */


    /**
     * Stop the TIMER process, which is no longer needed.
     */
    @LispMethod(comment = "Stop the TIMER process, which is no longer needed.")
    public static final SubLObject with_query_abort_timeout_stop_timer_alt(SubLObject timer) {
        if (NIL != valid_process_p(timer)) {
            return kill_process(timer);
        }
        return NIL;
    }

    @LispMethod(comment = "Stop the TIMER process, which is no longer needed.")
    public static SubLObject with_query_abort_timeout_stop_timer(final SubLObject timer) {
        if (NIL != valid_process_p(timer)) {
            return kill_process(timer);
        }
        return NIL;
    }/**
     * Stop the TIMER process, which is no longer needed.
     */


    /**
     * Signal a query-abort-timeout to TAG in CLIENT process after TIME seconds.
     */
    @LispMethod(comment = "Signal a query-abort-timeout to TAG in CLIENT process after TIME seconds.")
    public static final SubLObject with_query_abort_timeout_timer_thread_alt(SubLObject client, SubLObject time, SubLObject client_semaphore, SubLObject timer_semaphore) {
        Semaphores.semaphore_signal(timer_semaphore);
        Semaphores.semaphore_wait(client_semaphore);
        sleep(time);
        com.cyc.cycjava.cycl.inference.harness.inference_strategist.with_query_abort_timeout_signal_query_abort_timeout(client);
        return NIL;
    }

    @LispMethod(comment = "Signal a query-abort-timeout to TAG in CLIENT process after TIME seconds.")
    public static SubLObject with_query_abort_timeout_timer_thread(final SubLObject client, final SubLObject time, final SubLObject client_semaphore, final SubLObject timer_semaphore) {
        Semaphores.semaphore_signal(timer_semaphore);
        Semaphores.semaphore_wait(client_semaphore);
        sleep(time);
        with_query_abort_timeout_signal_query_abort_timeout(client);
        return NIL;
    }/**
     * Signal a query-abort-timeout to TAG in CLIENT process after TIME seconds.
     */


    public static final SubLObject with_query_abort_timeout_signal_query_abort_timeout_alt(SubLObject client) {
        if (NIL != valid_process_p(client)) {
            return interrupt_process(client, QUERY_ABORT);
        }
        return NIL;
    }

    public static SubLObject with_query_abort_timeout_signal_query_abort_timeout(final SubLObject client) {
        if (NIL != valid_process_p(client)) {
            return interrupt_process(client, QUERY_ABORT);
        }
        return NIL;
    }

    public static final SubLObject declare_inference_strategist_file_alt() {
        declareMacro("catch_inference_abort", "CATCH-INFERENCE-ABORT");
        declareFunction("signal_inference_control_process_abort", "SIGNAL-INFERENCE-CONTROL-PROCESS-ABORT", 0, 0, false);
        declareFunction("query_abort", "QUERY-ABORT", 0, 0, false);
        declareFunction("query_interrupt", "QUERY-INTERRUPT", 0, 1, false);
        declareFunction("query_interrupt_int", "QUERY-INTERRUPT-INT", 3, 0, false);
        declareMacro("catch_inference_error", "CATCH-INFERENCE-ERROR");
        declareMacro("with_inference_error_handling", "WITH-INFERENCE-ERROR-HANDLING");
        declareFunction("inference_error_handler", "INFERENCE-ERROR-HANDLER", 0, 0, false);
        declareMacro("with_inference_max_time_timeout", "WITH-INFERENCE-MAX-TIME-TIMEOUT");
        declareFunction("inference_abort_max_time", "INFERENCE-ABORT-MAX-TIME", 1, 0, false);
        declareFunction("explicify_inference_mode_defaults", "EXPLICIFY-INFERENCE-MODE-DEFAULTS", 1, 0, false);
        declareFunction("implicify_inference_mode_defaults", "IMPLICIFY-INFERENCE-MODE-DEFAULTS", 1, 0, false);
        declareFunction("query_property_value", "QUERY-PROPERTY-VALUE", 2, 0, false);
        declareFunction("strengthen_query_properties_using_inference", "STRENGTHEN-QUERY-PROPERTIES-USING-INFERENCE", 1, 0, false);
        declareFunction("inference_prepare", "INFERENCE-PREPARE", 3, 0, false);
        declareFunction("inference_prepare_from_dnf", "INFERENCE-PREPARE-FROM-DNF", 3, 0, false);
        declareFunction("inference_prepare_int", "INFERENCE-PREPARE-INT", 1, 0, false);
        declareFunction("simplest_inference_prepare", "SIMPLEST-INFERENCE-PREPARE", 1, 0, false);
        declareFunction("simplest_inference_prepare_new", "SIMPLEST-INFERENCE-PREPARE-NEW", 8, 0, false);
        declareFunction("simplest_inference_prepare_new_from_dnf", "SIMPLEST-INFERENCE-PREPARE-NEW-FROM-DNF", 7, 0, false);
        declareFunction("note_inference_tautology_justification", "NOTE-INFERENCE-TAUTOLOGY-JUSTIFICATION", 2, 0, false);
        declareFunction("preparing_inferenceP", "PREPARING-INFERENCE?", 0, 0, false);
        declareFunction("prepare_inference_hl_query", "PREPARE-INFERENCE-HL-QUERY", 3, 0, false);
        declareFunction("prepare_inference_hl_query_int", "PREPARE-INFERENCE-HL-QUERY-INT", 4, 0, false);
        declareFunction("hypothesize_antecedent", "HYPOTHESIZE-ANTECEDENT", 2, 0, false);
        declareFunction("inference_conditional_sentence_p", "INFERENCE-CONDITIONAL-SENTENCE-P", 1, 0, false);
        declareFunction("inference_possibly_simplify_conditional_sentence", "INFERENCE-POSSIBLY-SIMPLIFY-CONDITIONAL-SENTENCE", 1, 0, false);
        declareFunction("prepare_inference_hl_query_from_dnf", "PREPARE-INFERENCE-HL-QUERY-FROM-DNF", 3, 0, false);
        declareFunction("inference_initial_relevant_strategies", "INFERENCE-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction("inference_update_dynamic_properties", "INFERENCE-UPDATE-DYNAMIC-PROPERTIES", 2, 0, false);
        declareFunction("query_dynamic_properties_have_strategically_interesting_extensionP", "QUERY-DYNAMIC-PROPERTIES-HAVE-STRATEGICALLY-INTERESTING-EXTENSION?", 2, 0, false);
        declareFunction("depth_cutoff_L", "DEPTH-CUTOFF-<", 2, 0, false);
        declareFunction("inference_set_dynamic_properties", "INFERENCE-SET-DYNAMIC-PROPERTIES", 2, 0, false);
        declareFunction("inference_run", "INFERENCE-RUN", 1, 0, false);
        declareFunction("inference_suspend", "INFERENCE-SUSPEND", 2, 0, false);
        declareFunction("inference_suspend_due_to_max_problem_count", "INFERENCE-SUSPEND-DUE-TO-MAX-PROBLEM-COUNT", 1, 0, false);
        declareFunction("inference_suspend_due_to_max_number", "INFERENCE-SUSPEND-DUE-TO-MAX-NUMBER", 1, 0, false);
        declareFunction("inference_suspend_due_to_max_time", "INFERENCE-SUSPEND-DUE-TO-MAX-TIME", 1, 0, false);
        declareFunction("inference_suspend_due_to_max_step", "INFERENCE-SUSPEND-DUE-TO-MAX-STEP", 1, 0, false);
        declareFunction("inference_suspend_due_to_pad", "INFERENCE-SUSPEND-DUE-TO-PAD", 1, 0, false);
        declareFunction("inference_interrupt", "INFERENCE-INTERRUPT", 1, 1, false);
        declareFunction("inference_interrupt_int", "INFERENCE-INTERRUPT-INT", 1, 0, false);
        declareFunction("inference_abort", "INFERENCE-ABORT", 1, 0, false);
        declareFunction("inference_abort_after_delay", "INFERENCE-ABORT-AFTER-DELAY", 1, 1, false);
        declareFunction("inference_abort_if_running", "INFERENCE-ABORT-IF-RUNNING", 1, 0, false);
        declareFunction("abort_current_controlling_inference", "ABORT-CURRENT-CONTROLLING-INFERENCE", 0, 0, false);
        declareFunction("inference_abort_int", "INFERENCE-ABORT-INT", 1, 0, false);
        declareFunction("wait_for_inference_to_unblock", "WAIT-FOR-INFERENCE-TO-UNBLOCK", 0, 0, false);
        declareFunction("signal_inference_to_unblock", "SIGNAL-INFERENCE-TO-UNBLOCK", 1, 0, false);
        declareFunction("signal_inference_to_finish", "SIGNAL-INFERENCE-TO-FINISH", 1, 0, false);
        declareFunction("inference_max_number_reachedP", "INFERENCE-MAX-NUMBER-REACHED?", 1, 0, false);
        declareFunction("inference_max_time_reachedP", "INFERENCE-MAX-TIME-REACHED?", 1, 0, false);
        declareFunction("current_controlling_inference_max_time_reachedP", "CURRENT-CONTROLLING-INFERENCE-MAX-TIME-REACHED?", 0, 0, false);
        declareFunction("current_controlling_inference_time_remaining", "CURRENT-CONTROLLING-INFERENCE-TIME-REMAINING", 0, 0, false);
        declareFunction("inference_max_step_reachedP", "INFERENCE-MAX-STEP-REACHED?", 1, 0, false);
        declareFunction("inference_max_problem_count_reachedP", "INFERENCE-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
        declareFunction("inference_max_proof_count_reachedP", "INFERENCE-MAX-PROOF-COUNT-REACHED?", 1, 0, false);
        declareFunction("inference_crazy_max_problem_count_reachedP", "INFERENCE-CRAZY-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
        declareFunction("inference_probably_approximately_doneP", "INFERENCE-PROBABLY-APPROXIMATELY-DONE?", 1, 0, false);
        declareFunction("inference_halt_condition_reachedP", "INFERENCE-HALT-CONDITION-REACHED?", 1, 0, false);
        declareFunction("inference_determine_type_independent_result", "INFERENCE-DETERMINE-TYPE-INDEPENDENT-RESULT", 1, 0, false);
        declareFunction("strategy_type_from_sentence_and_static_properties", "STRATEGY-TYPE-FROM-SENTENCE-AND-STATIC-PROPERTIES", 3, 0, false);
        declareFunction("strategy_type_from_dnf_and_static_properties", "STRATEGY-TYPE-FROM-DNF-AND-STATIC-PROPERTIES", 3, 0, false);
        declareFunction("strategy_type_from_static_properties", "STRATEGY-TYPE-FROM-STATIC-PROPERTIES", 1, 0, false);
        declareFunction("properties_indicate_forward_inferenceP", "PROPERTIES-INDICATE-FORWARD-INFERENCE?", 1, 0, false);
        declareFunction("inference_permits_transformationP", "INFERENCE-PERMITS-TRANSFORMATION?", 1, 0, false);
        declareFunction("determine_best_strategy_type_for_inference", "DETERMINE-BEST-STRATEGY-TYPE-FOR-INFERENCE", 1, 0, false);
        declareFunction("consider_switching_strategies", "CONSIDER-SWITCHING-STRATEGIES", 1, 0, false);
        declareFunction("inference_switch_strategies", "INFERENCE-SWITCH-STRATEGIES", 2, 0, false);
        declareFunction("simplest_inference_run_handler", "SIMPLEST-INFERENCE-RUN-HANDLER", 1, 0, false);
        declareFunction("inference_do_forward_propagation", "INFERENCE-DO-FORWARD-PROPAGATION", 1, 0, false);
        declareFunction("simplest_inference_doneP", "SIMPLEST-INFERENCE-DONE?", 1, 0, false);
        declareFunction("possibly_wait_for_inference_to_unblock", "POSSIBLY-WAIT-FOR-INFERENCE-TO-UNBLOCK", 1, 0, false);
        declareFunction("simplest_inference_possibly_prune", "SIMPLEST-INFERENCE-POSSIBLY-PRUNE", 1, 0, false);
        declareFunction("inference_prune_frequency_reachedP", "INFERENCE-PRUNE-FREQUENCY-REACHED?", 1, 0, false);
        declareFunction("simplest_inference_determine_result", "SIMPLEST-INFERENCE-DETERMINE-RESULT", 2, 0, false);
        declareFunction("simplest_inference_continuation_possibleP", "SIMPLEST-INFERENCE-CONTINUATION-POSSIBLE?", 1, 0, false);
        declareFunction("simplest_inference_exhaustedP", "SIMPLEST-INFERENCE-EXHAUSTED?", 1, 0, false);
        declareFunction("simplest_inference_totally_exhaustedP", "SIMPLEST-INFERENCE-TOTALLY-EXHAUSTED?", 1, 0, false);
        declareFunction("inference_note_proof", "INFERENCE-NOTE-PROOF", 2, 0, false);
        declareFunction("inference_note_no_good", "INFERENCE-NOTE-NO-GOOD", 1, 0, false);
        declareFunction("new_inference_answer_from_proof", "NEW-INFERENCE-ANSWER-FROM-PROOF", 2, 0, false);
        declareFunction("inference_disallows_answer_from_bindingsP", "INFERENCE-DISALLOWS-ANSWER-FROM-BINDINGS?", 2, 0, false);
        declareFunction("inference_disallows_answer_from_proofP", "INFERENCE-DISALLOWS-ANSWER-FROM-PROOF?", 2, 0, false);
        declareFunction("some_answer_bindings_are_indeterminateP", "SOME-ANSWER-BINDINGS-ARE-INDETERMINATE?", 1, 0, false);
        declareFunction("some_answer_bindings_are_hlP", "SOME-ANSWER-BINDINGS-ARE-HL?", 1, 0, false);
        declareFunction("term_requires_hl_language", "TERM-REQUIRES-HL-LANGUAGE", 1, 0, false);
        declareFunction("inference_all_explanatory_proof_supports", "INFERENCE-ALL-EXPLANATORY-PROOF-SUPPORTS", 2, 0, false);
        declareFunction("inference_answer_bindings_from_proof", "INFERENCE-ANSWER-BINDINGS-FROM-PROOF", 2, 0, false);
        declareFunction("filter_out_uninteresting_bindings", "FILTER-OUT-UNINTERESTING-BINDINGS", 2, 0, false);
        declareFunction("all_variables_in_bindings_interestingP", "ALL-VARIABLES-IN-BINDINGS-INTERESTING?", 2, 0, false);
        declareFunction("compose_el_answer_bindings", "COMPOSE-EL-ANSWER-BINDINGS", 4, 0, false);
        declareFunction("inference_hl_bindings_from_proof", "INFERENCE-HL-BINDINGS-FROM-PROOF", 2, 0, false);
        declareFunction("inference_processed_proof_pruning_initial_threshold_metP", "INFERENCE-PROCESSED-PROOF-PRUNING-INITIAL-THRESHOLD-MET?", 1, 0, false);
        declareFunction("inference_processed_proof_pruning_variable_threshold_metP", "INFERENCE-PROCESSED-PROOF-PRUNING-VARIABLE-THRESHOLD-MET?", 1, 0, false);
        declareFunction("inference_possibly_prune_processed_proofs", "INFERENCE-POSSIBLY-PRUNE-PROCESSED-PROOFS", 1, 0, false);
        declareFunction("perform_inference_answer_proof_analysis", "PERFORM-INFERENCE-ANSWER-PROOF-ANALYSIS", 2, 0, false);
        declareFunction("cache_inference_answer", "CACHE-INFERENCE-ANSWER", 1, 0, false);
        declareFunction("cache_proof", "CACHE-PROOF", 1, 0, false);
        declareFunction("cache_proof_supports", "CACHE-PROOF-SUPPORTS", 1, 0, false);
        declareFunction("add_deduction_for_proof", "ADD-DEDUCTION-FOR-PROOF", 2, 0, false);
        declareMacro("with_query_abort_timeout", "WITH-QUERY-ABORT-TIMEOUT");
        declareFunction("with_query_abort_timeout_start_timer", "WITH-QUERY-ABORT-TIMEOUT-START-TIMER", 1, 0, false);
        declareFunction("with_query_abort_timeout_stop_timer", "WITH-QUERY-ABORT-TIMEOUT-STOP-TIMER", 1, 0, false);
        declareFunction("with_query_abort_timeout_timer_thread", "WITH-QUERY-ABORT-TIMEOUT-TIMER-THREAD", 4, 0, false);
        declareFunction("with_query_abort_timeout_signal_query_abort_timeout", "WITH-QUERY-ABORT-TIMEOUT-SIGNAL-QUERY-ABORT-TIMEOUT", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_strategist_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("catch_inference_abort", "CATCH-INFERENCE-ABORT");
            declareFunction("signal_inference_control_process_abort", "SIGNAL-INFERENCE-CONTROL-PROCESS-ABORT", 0, 0, false);
            declareFunction("query_abort", "QUERY-ABORT", 0, 0, false);
            declareFunction("query_interrupt", "QUERY-INTERRUPT", 0, 1, false);
            declareFunction("query_interrupt_int", "QUERY-INTERRUPT-INT", 3, 0, false);
            declareMacro("catch_inference_error", "CATCH-INFERENCE-ERROR");
            declareMacro("with_inference_error_handling", "WITH-INFERENCE-ERROR-HANDLING");
            declareFunction("inference_error_handler", "INFERENCE-ERROR-HANDLER", 0, 0, false);
            declareMacro("with_inference_max_time_timeout", "WITH-INFERENCE-MAX-TIME-TIMEOUT");
            declareFunction("inference_abort_max_time", "INFERENCE-ABORT-MAX-TIME", 1, 0, false);
            declareFunction("explicify_inference_mode_defaults", "EXPLICIFY-INFERENCE-MODE-DEFAULTS", 1, 0, false);
            declareFunction("implicify_inference_mode_defaults", "IMPLICIFY-INFERENCE-MODE-DEFAULTS", 1, 0, false);
            declareFunction("query_property_value", "QUERY-PROPERTY-VALUE", 2, 0, false);
            declareFunction("strengthen_query_properties_using_inference", "STRENGTHEN-QUERY-PROPERTIES-USING-INFERENCE", 1, 0, false);
            declareFunction("inference_prepare", "INFERENCE-PREPARE", 3, 0, false);
            declareFunction("inference_prepare_from_dnf", "INFERENCE-PREPARE-FROM-DNF", 3, 0, false);
            declareFunction("inference_prepare_int", "INFERENCE-PREPARE-INT", 1, 0, false);
            declareFunction("simplest_inference_prepare", "SIMPLEST-INFERENCE-PREPARE", 1, 0, false);
            declareFunction("simplest_inference_prepare_new", "SIMPLEST-INFERENCE-PREPARE-NEW", 8, 0, false);
            declareFunction("simplest_inference_prepare_new_from_dnf", "SIMPLEST-INFERENCE-PREPARE-NEW-FROM-DNF", 7, 0, false);
            declareFunction("note_inference_tautology_justification", "NOTE-INFERENCE-TAUTOLOGY-JUSTIFICATION", 2, 0, false);
            declareFunction("preparing_inferenceP", "PREPARING-INFERENCE?", 0, 0, false);
            declareFunction("prepare_inference_hl_query", "PREPARE-INFERENCE-HL-QUERY", 3, 0, false);
            declareFunction("prepare_inference_hl_query_int", "PREPARE-INFERENCE-HL-QUERY-INT", 4, 0, false);
            declareFunction("hypothesize_antecedent", "HYPOTHESIZE-ANTECEDENT", 2, 0, false);
            declareFunction("inference_conditional_sentence_p", "INFERENCE-CONDITIONAL-SENTENCE-P", 1, 0, false);
            declareFunction("inference_possibly_simplify_conditional_sentence", "INFERENCE-POSSIBLY-SIMPLIFY-CONDITIONAL-SENTENCE", 1, 0, false);
            declareFunction("prepare_inference_hl_query_from_dnf", "PREPARE-INFERENCE-HL-QUERY-FROM-DNF", 3, 0, false);
            declareFunction("inference_initial_relevant_strategies", "INFERENCE-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
            declareFunction("inference_update_dynamic_properties", "INFERENCE-UPDATE-DYNAMIC-PROPERTIES", 2, 0, false);
            declareFunction("query_dynamic_properties_have_strategically_interesting_extensionP", "QUERY-DYNAMIC-PROPERTIES-HAVE-STRATEGICALLY-INTERESTING-EXTENSION?", 2, 0, false);
            declareFunction("depth_cutoff_L", "DEPTH-CUTOFF-<", 2, 0, false);
            declareFunction("inference_set_dynamic_properties", "INFERENCE-SET-DYNAMIC-PROPERTIES", 2, 0, false);
            declareFunction("inference_strategist_max_proof_depth_from_properties", "INFERENCE-STRATEGIST-MAX-PROOF-DEPTH-FROM-PROPERTIES", 2, 0, false);
            declareFunction("inference_run", "INFERENCE-RUN", 1, 0, false);
            declareFunction("inference_suspend", "INFERENCE-SUSPEND", 2, 0, false);
            declareFunction("inference_suspend_due_to_max_problem_count", "INFERENCE-SUSPEND-DUE-TO-MAX-PROBLEM-COUNT", 1, 0, false);
            declareFunction("inference_suspend_due_to_max_number", "INFERENCE-SUSPEND-DUE-TO-MAX-NUMBER", 1, 0, false);
            declareFunction("inference_suspend_due_to_max_time", "INFERENCE-SUSPEND-DUE-TO-MAX-TIME", 1, 0, false);
            declareFunction("inference_suspend_due_to_max_step", "INFERENCE-SUSPEND-DUE-TO-MAX-STEP", 1, 0, false);
            declareFunction("inference_suspend_due_to_pad", "INFERENCE-SUSPEND-DUE-TO-PAD", 1, 0, false);
            declareFunction("inference_interrupt_external", "INFERENCE-INTERRUPT-EXTERNAL", 1, 1, false);
            declareFunction("inference_interrupt", "INFERENCE-INTERRUPT", 1, 1, false);
            declareFunction("inference_interrupt_int", "INFERENCE-INTERRUPT-INT", 1, 0, false);
            declareFunction("inference_abort", "INFERENCE-ABORT", 1, 0, false);
            declareFunction("inference_abort_after_delay", "INFERENCE-ABORT-AFTER-DELAY", 1, 1, false);
            declareFunction("inference_abort_if_running", "INFERENCE-ABORT-IF-RUNNING", 1, 0, false);
            declareFunction("abort_current_controlling_inference", "ABORT-CURRENT-CONTROLLING-INFERENCE", 0, 0, false);
            declareFunction("inference_abort_int", "INFERENCE-ABORT-INT", 1, 0, false);
            declareFunction("wait_for_inference_to_unblock", "WAIT-FOR-INFERENCE-TO-UNBLOCK", 0, 0, false);
            declareFunction("signal_inference_to_unblock", "SIGNAL-INFERENCE-TO-UNBLOCK", 1, 0, false);
            declareFunction("signal_inference_to_finish", "SIGNAL-INFERENCE-TO-FINISH", 1, 0, false);
            declareFunction("inference_max_number_reachedP", "INFERENCE-MAX-NUMBER-REACHED?", 1, 0, false);
            declareFunction("inference_max_time_reachedP", "INFERENCE-MAX-TIME-REACHED?", 1, 0, false);
            declareFunction("current_controlling_inference_max_time_reachedP", "CURRENT-CONTROLLING-INFERENCE-MAX-TIME-REACHED?", 0, 0, false);
            declareFunction("current_controlling_inference_time_remaining", "CURRENT-CONTROLLING-INFERENCE-TIME-REMAINING", 0, 0, false);
            declareFunction("inference_max_step_reachedP", "INFERENCE-MAX-STEP-REACHED?", 1, 0, false);
            declareFunction("inference_max_problem_count_reachedP", "INFERENCE-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
            declareFunction("inference_max_proof_count_reachedP", "INFERENCE-MAX-PROOF-COUNT-REACHED?", 1, 0, false);
            declareFunction("inference_crazy_max_problem_count_reachedP", "INFERENCE-CRAZY-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
            declareFunction("inference_probably_approximately_doneP", "INFERENCE-PROBABLY-APPROXIMATELY-DONE?", 1, 0, false);
            declareFunction("inference_halt_condition_reachedP", "INFERENCE-HALT-CONDITION-REACHED?", 1, 0, false);
            declareFunction("inference_determine_type_independent_result", "INFERENCE-DETERMINE-TYPE-INDEPENDENT-RESULT", 1, 0, false);
            declareFunction("strategy_type_from_sentence_and_static_properties", "STRATEGY-TYPE-FROM-SENTENCE-AND-STATIC-PROPERTIES", 3, 0, false);
            declareFunction("strategy_type_from_dnf_and_static_properties", "STRATEGY-TYPE-FROM-DNF-AND-STATIC-PROPERTIES", 3, 0, false);
            declareFunction("strategy_type_from_static_properties", "STRATEGY-TYPE-FROM-STATIC-PROPERTIES", 1, 0, false);
            declareFunction("properties_indicate_forward_inferenceP", "PROPERTIES-INDICATE-FORWARD-INFERENCE?", 1, 0, false);
            declareFunction("inference_permits_transformationP", "INFERENCE-PERMITS-TRANSFORMATION?", 1, 0, false);
            declareFunction("determine_best_strategy_type_for_inference", "DETERMINE-BEST-STRATEGY-TYPE-FOR-INFERENCE", 1, 0, false);
            declareFunction("consider_switching_strategies", "CONSIDER-SWITCHING-STRATEGIES", 1, 0, false);
            declareFunction("inference_switch_strategies", "INFERENCE-SWITCH-STRATEGIES", 2, 0, false);
            declareFunction("simplest_inference_run_handler", "SIMPLEST-INFERENCE-RUN-HANDLER", 1, 0, false);
            declareFunction("strategist_wants_recursive_queries_in_currently_active_problem_storeP", "STRATEGIST-WANTS-RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?", 0, 0, false);
            declareFunction("inference_do_forward_propagation", "INFERENCE-DO-FORWARD-PROPAGATION", 1, 0, false);
            declareFunction("simplest_inference_doneP", "SIMPLEST-INFERENCE-DONE?", 1, 0, false);
            declareFunction("possibly_wait_for_inference_to_unblock", "POSSIBLY-WAIT-FOR-INFERENCE-TO-UNBLOCK", 1, 0, false);
            declareFunction("simplest_inference_possibly_prune", "SIMPLEST-INFERENCE-POSSIBLY-PRUNE", 1, 0, false);
            declareFunction("inference_prune_frequency_reachedP", "INFERENCE-PRUNE-FREQUENCY-REACHED?", 1, 0, false);
            declareFunction("simplest_inference_determine_result", "SIMPLEST-INFERENCE-DETERMINE-RESULT", 2, 0, false);
            declareFunction("simplest_inference_continuation_possibleP", "SIMPLEST-INFERENCE-CONTINUATION-POSSIBLE?", 1, 0, false);
            declareFunction("simplest_inference_exhaustedP", "SIMPLEST-INFERENCE-EXHAUSTED?", 1, 0, false);
            declareFunction("simplest_inference_totally_exhaustedP", "SIMPLEST-INFERENCE-TOTALLY-EXHAUSTED?", 1, 0, false);
            declareFunction("inference_note_proof", "INFERENCE-NOTE-PROOF", 2, 0, false);
            declareFunction("inference_note_no_good", "INFERENCE-NOTE-NO-GOOD", 1, 0, false);
            declareFunction("new_inference_answer_from_proof", "NEW-INFERENCE-ANSWER-FROM-PROOF", 2, 0, false);
            declareFunction("inference_disallows_answer_from_bindingsP", "INFERENCE-DISALLOWS-ANSWER-FROM-BINDINGS?", 2, 0, false);
            declareFunction("inference_disallows_answer_from_proofP", "INFERENCE-DISALLOWS-ANSWER-FROM-PROOF?", 2, 0, false);
            declareFunction("some_answer_bindings_are_indeterminateP", "SOME-ANSWER-BINDINGS-ARE-INDETERMINATE?", 1, 0, false);
            declareFunction("some_answer_bindings_are_hlP", "SOME-ANSWER-BINDINGS-ARE-HL?", 1, 0, false);
            declareFunction("term_requires_hl_language", "TERM-REQUIRES-HL-LANGUAGE", 1, 0, false);
            declareFunction("inference_all_explanatory_and_non_explanatory_proof_supports", "INFERENCE-ALL-EXPLANATORY-AND-NON-EXPLANATORY-PROOF-SUPPORTS", 2, 0, false);
            declareFunction("inference_answer_bindings_from_proof", "INFERENCE-ANSWER-BINDINGS-FROM-PROOF", 2, 0, false);
            declareFunction("filter_out_uninteresting_bindings", "FILTER-OUT-UNINTERESTING-BINDINGS", 2, 0, false);
            declareFunction("all_variables_in_bindings_interestingP", "ALL-VARIABLES-IN-BINDINGS-INTERESTING?", 2, 0, false);
            declareFunction("compose_el_answer_bindings", "COMPOSE-EL-ANSWER-BINDINGS", 4, 0, false);
            declareFunction("inference_hl_bindings_from_proof", "INFERENCE-HL-BINDINGS-FROM-PROOF", 2, 0, false);
            declareFunction("inference_processed_proof_pruning_initial_threshold_metP", "INFERENCE-PROCESSED-PROOF-PRUNING-INITIAL-THRESHOLD-MET?", 1, 0, false);
            declareFunction("inference_processed_proof_pruning_variable_threshold_metP", "INFERENCE-PROCESSED-PROOF-PRUNING-VARIABLE-THRESHOLD-MET?", 1, 0, false);
            declareFunction("inference_possibly_prune_processed_proofs", "INFERENCE-POSSIBLY-PRUNE-PROCESSED-PROOFS", 1, 0, false);
            declareFunction("perform_inference_answer_proof_analysis", "PERFORM-INFERENCE-ANSWER-PROOF-ANALYSIS", 2, 0, false);
            declareFunction("cache_inference_answer", "CACHE-INFERENCE-ANSWER", 1, 0, false);
            declareFunction("cache_proof", "CACHE-PROOF", 1, 0, false);
            declareFunction("cache_proof_supports", "CACHE-PROOF-SUPPORTS", 1, 0, false);
            declareFunction("add_deduction_for_proof", "ADD-DEDUCTION-FOR-PROOF", 2, 0, false);
            declareMacro("with_query_abort_timeout", "WITH-QUERY-ABORT-TIMEOUT");
            declareFunction("with_query_abort_timeout_start_timer", "WITH-QUERY-ABORT-TIMEOUT-START-TIMER", 1, 0, false);
            declareFunction("with_query_abort_timeout_stop_timer", "WITH-QUERY-ABORT-TIMEOUT-STOP-TIMER", 1, 0, false);
            declareFunction("with_query_abort_timeout_timer_thread", "WITH-QUERY-ABORT-TIMEOUT-TIMER-THREAD", 4, 0, false);
            declareFunction("with_query_abort_timeout_signal_query_abort_timeout", "WITH-QUERY-ABORT-TIMEOUT-SIGNAL-QUERY-ABORT-TIMEOUT", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("inference_all_explanatory_proof_supports", "INFERENCE-ALL-EXPLANATORY-PROOF-SUPPORTS", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_strategist_file_Previous() {
        declareMacro("catch_inference_abort", "CATCH-INFERENCE-ABORT");
        declareFunction("signal_inference_control_process_abort", "SIGNAL-INFERENCE-CONTROL-PROCESS-ABORT", 0, 0, false);
        declareFunction("query_abort", "QUERY-ABORT", 0, 0, false);
        declareFunction("query_interrupt", "QUERY-INTERRUPT", 0, 1, false);
        declareFunction("query_interrupt_int", "QUERY-INTERRUPT-INT", 3, 0, false);
        declareMacro("catch_inference_error", "CATCH-INFERENCE-ERROR");
        declareMacro("with_inference_error_handling", "WITH-INFERENCE-ERROR-HANDLING");
        declareFunction("inference_error_handler", "INFERENCE-ERROR-HANDLER", 0, 0, false);
        declareMacro("with_inference_max_time_timeout", "WITH-INFERENCE-MAX-TIME-TIMEOUT");
        declareFunction("inference_abort_max_time", "INFERENCE-ABORT-MAX-TIME", 1, 0, false);
        declareFunction("explicify_inference_mode_defaults", "EXPLICIFY-INFERENCE-MODE-DEFAULTS", 1, 0, false);
        declareFunction("implicify_inference_mode_defaults", "IMPLICIFY-INFERENCE-MODE-DEFAULTS", 1, 0, false);
        declareFunction("query_property_value", "QUERY-PROPERTY-VALUE", 2, 0, false);
        declareFunction("strengthen_query_properties_using_inference", "STRENGTHEN-QUERY-PROPERTIES-USING-INFERENCE", 1, 0, false);
        declareFunction("inference_prepare", "INFERENCE-PREPARE", 3, 0, false);
        declareFunction("inference_prepare_from_dnf", "INFERENCE-PREPARE-FROM-DNF", 3, 0, false);
        declareFunction("inference_prepare_int", "INFERENCE-PREPARE-INT", 1, 0, false);
        declareFunction("simplest_inference_prepare", "SIMPLEST-INFERENCE-PREPARE", 1, 0, false);
        declareFunction("simplest_inference_prepare_new", "SIMPLEST-INFERENCE-PREPARE-NEW", 8, 0, false);
        declareFunction("simplest_inference_prepare_new_from_dnf", "SIMPLEST-INFERENCE-PREPARE-NEW-FROM-DNF", 7, 0, false);
        declareFunction("note_inference_tautology_justification", "NOTE-INFERENCE-TAUTOLOGY-JUSTIFICATION", 2, 0, false);
        declareFunction("preparing_inferenceP", "PREPARING-INFERENCE?", 0, 0, false);
        declareFunction("prepare_inference_hl_query", "PREPARE-INFERENCE-HL-QUERY", 3, 0, false);
        declareFunction("prepare_inference_hl_query_int", "PREPARE-INFERENCE-HL-QUERY-INT", 4, 0, false);
        declareFunction("hypothesize_antecedent", "HYPOTHESIZE-ANTECEDENT", 2, 0, false);
        declareFunction("inference_conditional_sentence_p", "INFERENCE-CONDITIONAL-SENTENCE-P", 1, 0, false);
        declareFunction("inference_possibly_simplify_conditional_sentence", "INFERENCE-POSSIBLY-SIMPLIFY-CONDITIONAL-SENTENCE", 1, 0, false);
        declareFunction("prepare_inference_hl_query_from_dnf", "PREPARE-INFERENCE-HL-QUERY-FROM-DNF", 3, 0, false);
        declareFunction("inference_initial_relevant_strategies", "INFERENCE-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
        declareFunction("inference_update_dynamic_properties", "INFERENCE-UPDATE-DYNAMIC-PROPERTIES", 2, 0, false);
        declareFunction("query_dynamic_properties_have_strategically_interesting_extensionP", "QUERY-DYNAMIC-PROPERTIES-HAVE-STRATEGICALLY-INTERESTING-EXTENSION?", 2, 0, false);
        declareFunction("depth_cutoff_L", "DEPTH-CUTOFF-<", 2, 0, false);
        declareFunction("inference_set_dynamic_properties", "INFERENCE-SET-DYNAMIC-PROPERTIES", 2, 0, false);
        declareFunction("inference_strategist_max_proof_depth_from_properties", "INFERENCE-STRATEGIST-MAX-PROOF-DEPTH-FROM-PROPERTIES", 2, 0, false);
        declareFunction("inference_run", "INFERENCE-RUN", 1, 0, false);
        declareFunction("inference_suspend", "INFERENCE-SUSPEND", 2, 0, false);
        declareFunction("inference_suspend_due_to_max_problem_count", "INFERENCE-SUSPEND-DUE-TO-MAX-PROBLEM-COUNT", 1, 0, false);
        declareFunction("inference_suspend_due_to_max_number", "INFERENCE-SUSPEND-DUE-TO-MAX-NUMBER", 1, 0, false);
        declareFunction("inference_suspend_due_to_max_time", "INFERENCE-SUSPEND-DUE-TO-MAX-TIME", 1, 0, false);
        declareFunction("inference_suspend_due_to_max_step", "INFERENCE-SUSPEND-DUE-TO-MAX-STEP", 1, 0, false);
        declareFunction("inference_suspend_due_to_pad", "INFERENCE-SUSPEND-DUE-TO-PAD", 1, 0, false);
        declareFunction("inference_interrupt_external", "INFERENCE-INTERRUPT-EXTERNAL", 1, 1, false);
        declareFunction("inference_interrupt", "INFERENCE-INTERRUPT", 1, 1, false);
        declareFunction("inference_interrupt_int", "INFERENCE-INTERRUPT-INT", 1, 0, false);
        declareFunction("inference_abort", "INFERENCE-ABORT", 1, 0, false);
        declareFunction("inference_abort_after_delay", "INFERENCE-ABORT-AFTER-DELAY", 1, 1, false);
        declareFunction("inference_abort_if_running", "INFERENCE-ABORT-IF-RUNNING", 1, 0, false);
        declareFunction("abort_current_controlling_inference", "ABORT-CURRENT-CONTROLLING-INFERENCE", 0, 0, false);
        declareFunction("inference_abort_int", "INFERENCE-ABORT-INT", 1, 0, false);
        declareFunction("wait_for_inference_to_unblock", "WAIT-FOR-INFERENCE-TO-UNBLOCK", 0, 0, false);
        declareFunction("signal_inference_to_unblock", "SIGNAL-INFERENCE-TO-UNBLOCK", 1, 0, false);
        declareFunction("signal_inference_to_finish", "SIGNAL-INFERENCE-TO-FINISH", 1, 0, false);
        declareFunction("inference_max_number_reachedP", "INFERENCE-MAX-NUMBER-REACHED?", 1, 0, false);
        declareFunction("inference_max_time_reachedP", "INFERENCE-MAX-TIME-REACHED?", 1, 0, false);
        declareFunction("current_controlling_inference_max_time_reachedP", "CURRENT-CONTROLLING-INFERENCE-MAX-TIME-REACHED?", 0, 0, false);
        declareFunction("current_controlling_inference_time_remaining", "CURRENT-CONTROLLING-INFERENCE-TIME-REMAINING", 0, 0, false);
        declareFunction("inference_max_step_reachedP", "INFERENCE-MAX-STEP-REACHED?", 1, 0, false);
        declareFunction("inference_max_problem_count_reachedP", "INFERENCE-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
        declareFunction("inference_max_proof_count_reachedP", "INFERENCE-MAX-PROOF-COUNT-REACHED?", 1, 0, false);
        declareFunction("inference_crazy_max_problem_count_reachedP", "INFERENCE-CRAZY-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
        declareFunction("inference_probably_approximately_doneP", "INFERENCE-PROBABLY-APPROXIMATELY-DONE?", 1, 0, false);
        declareFunction("inference_halt_condition_reachedP", "INFERENCE-HALT-CONDITION-REACHED?", 1, 0, false);
        declareFunction("inference_determine_type_independent_result", "INFERENCE-DETERMINE-TYPE-INDEPENDENT-RESULT", 1, 0, false);
        declareFunction("strategy_type_from_sentence_and_static_properties", "STRATEGY-TYPE-FROM-SENTENCE-AND-STATIC-PROPERTIES", 3, 0, false);
        declareFunction("strategy_type_from_dnf_and_static_properties", "STRATEGY-TYPE-FROM-DNF-AND-STATIC-PROPERTIES", 3, 0, false);
        declareFunction("strategy_type_from_static_properties", "STRATEGY-TYPE-FROM-STATIC-PROPERTIES", 1, 0, false);
        declareFunction("properties_indicate_forward_inferenceP", "PROPERTIES-INDICATE-FORWARD-INFERENCE?", 1, 0, false);
        declareFunction("inference_permits_transformationP", "INFERENCE-PERMITS-TRANSFORMATION?", 1, 0, false);
        declareFunction("determine_best_strategy_type_for_inference", "DETERMINE-BEST-STRATEGY-TYPE-FOR-INFERENCE", 1, 0, false);
        declareFunction("consider_switching_strategies", "CONSIDER-SWITCHING-STRATEGIES", 1, 0, false);
        declareFunction("inference_switch_strategies", "INFERENCE-SWITCH-STRATEGIES", 2, 0, false);
        declareFunction("simplest_inference_run_handler", "SIMPLEST-INFERENCE-RUN-HANDLER", 1, 0, false);
        declareFunction("strategist_wants_recursive_queries_in_currently_active_problem_storeP", "STRATEGIST-WANTS-RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?", 0, 0, false);
        declareFunction("inference_do_forward_propagation", "INFERENCE-DO-FORWARD-PROPAGATION", 1, 0, false);
        declareFunction("simplest_inference_doneP", "SIMPLEST-INFERENCE-DONE?", 1, 0, false);
        declareFunction("possibly_wait_for_inference_to_unblock", "POSSIBLY-WAIT-FOR-INFERENCE-TO-UNBLOCK", 1, 0, false);
        declareFunction("simplest_inference_possibly_prune", "SIMPLEST-INFERENCE-POSSIBLY-PRUNE", 1, 0, false);
        declareFunction("inference_prune_frequency_reachedP", "INFERENCE-PRUNE-FREQUENCY-REACHED?", 1, 0, false);
        declareFunction("simplest_inference_determine_result", "SIMPLEST-INFERENCE-DETERMINE-RESULT", 2, 0, false);
        declareFunction("simplest_inference_continuation_possibleP", "SIMPLEST-INFERENCE-CONTINUATION-POSSIBLE?", 1, 0, false);
        declareFunction("simplest_inference_exhaustedP", "SIMPLEST-INFERENCE-EXHAUSTED?", 1, 0, false);
        declareFunction("simplest_inference_totally_exhaustedP", "SIMPLEST-INFERENCE-TOTALLY-EXHAUSTED?", 1, 0, false);
        declareFunction("inference_note_proof", "INFERENCE-NOTE-PROOF", 2, 0, false);
        declareFunction("inference_note_no_good", "INFERENCE-NOTE-NO-GOOD", 1, 0, false);
        declareFunction("new_inference_answer_from_proof", "NEW-INFERENCE-ANSWER-FROM-PROOF", 2, 0, false);
        declareFunction("inference_disallows_answer_from_bindingsP", "INFERENCE-DISALLOWS-ANSWER-FROM-BINDINGS?", 2, 0, false);
        declareFunction("inference_disallows_answer_from_proofP", "INFERENCE-DISALLOWS-ANSWER-FROM-PROOF?", 2, 0, false);
        declareFunction("some_answer_bindings_are_indeterminateP", "SOME-ANSWER-BINDINGS-ARE-INDETERMINATE?", 1, 0, false);
        declareFunction("some_answer_bindings_are_hlP", "SOME-ANSWER-BINDINGS-ARE-HL?", 1, 0, false);
        declareFunction("term_requires_hl_language", "TERM-REQUIRES-HL-LANGUAGE", 1, 0, false);
        declareFunction("inference_all_explanatory_and_non_explanatory_proof_supports", "INFERENCE-ALL-EXPLANATORY-AND-NON-EXPLANATORY-PROOF-SUPPORTS", 2, 0, false);
        declareFunction("inference_answer_bindings_from_proof", "INFERENCE-ANSWER-BINDINGS-FROM-PROOF", 2, 0, false);
        declareFunction("filter_out_uninteresting_bindings", "FILTER-OUT-UNINTERESTING-BINDINGS", 2, 0, false);
        declareFunction("all_variables_in_bindings_interestingP", "ALL-VARIABLES-IN-BINDINGS-INTERESTING?", 2, 0, false);
        declareFunction("compose_el_answer_bindings", "COMPOSE-EL-ANSWER-BINDINGS", 4, 0, false);
        declareFunction("inference_hl_bindings_from_proof", "INFERENCE-HL-BINDINGS-FROM-PROOF", 2, 0, false);
        declareFunction("inference_processed_proof_pruning_initial_threshold_metP", "INFERENCE-PROCESSED-PROOF-PRUNING-INITIAL-THRESHOLD-MET?", 1, 0, false);
        declareFunction("inference_processed_proof_pruning_variable_threshold_metP", "INFERENCE-PROCESSED-PROOF-PRUNING-VARIABLE-THRESHOLD-MET?", 1, 0, false);
        declareFunction("inference_possibly_prune_processed_proofs", "INFERENCE-POSSIBLY-PRUNE-PROCESSED-PROOFS", 1, 0, false);
        declareFunction("perform_inference_answer_proof_analysis", "PERFORM-INFERENCE-ANSWER-PROOF-ANALYSIS", 2, 0, false);
        declareFunction("cache_inference_answer", "CACHE-INFERENCE-ANSWER", 1, 0, false);
        declareFunction("cache_proof", "CACHE-PROOF", 1, 0, false);
        declareFunction("cache_proof_supports", "CACHE-PROOF-SUPPORTS", 1, 0, false);
        declareFunction("add_deduction_for_proof", "ADD-DEDUCTION-FOR-PROOF", 2, 0, false);
        declareMacro("with_query_abort_timeout", "WITH-QUERY-ABORT-TIMEOUT");
        declareFunction("with_query_abort_timeout_start_timer", "WITH-QUERY-ABORT-TIMEOUT-START-TIMER", 1, 0, false);
        declareFunction("with_query_abort_timeout_stop_timer", "WITH-QUERY-ABORT-TIMEOUT-STOP-TIMER", 1, 0, false);
        declareFunction("with_query_abort_timeout_timer_thread", "WITH-QUERY-ABORT-TIMEOUT-TIMER-THREAD", 4, 0, false);
        declareFunction("with_query_abort_timeout_signal_query_abort_timeout", "WITH-QUERY-ABORT-TIMEOUT-SIGNAL-QUERY-ABORT-TIMEOUT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_inference_strategist_file_alt() {
        defparameter("*WITHIN-INFERENCE-CONTROL-PROCESS?*", NIL);
        defparameter("*INFERENCE-MAX-TIME-TIMEOUT-ENABLED?*", T);
        deflexical("*TAUTOLOGY-PROBLEM-QUERY*", $list_alt39);
        deflexical("*CONTRADICTION-PROBLEM-QUERY*", NIL);
        defparameter("*PREPARING-INFERENCE?*", NIL);
        defvar("*DEFAULT-STRATEGY-TYPE*", $HEURISTIC_BALANCED);
        defvar("*EXHAUSTIVE-REMOVAL-STRATEGY-TYPE*", $REMOVAL);
        defvar("*FORWARD-STRATEGY-TYPE*", $REMOVAL);
        defparameter("*PROCESSED-PROOF-PRUNING-INITIAL-THRESHOLD*", $int$200);
        defparameter("*PROCESSED-PROOF-PRUNING-FREQUENCY*", $int$50);
        return NIL;
    }

    public static SubLObject init_inference_strategist_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            deflexical("*TAUTOLOGY-PROBLEM-QUERY*", $list_alt39);
            defvar("*DEFAULT-STRATEGY-TYPE*", $HEURISTIC_BALANCED);
            defparameter("*PROCESSED-PROOF-PRUNING-INITIAL-THRESHOLD*", $int$200);
        }
        return NIL;
    }

    public static SubLObject init_inference_strategist_file_Previous() {
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("SUSPEND-STATUS-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym1$ABORTED_P = makeUninternedSymbol("ABORTED-P");

    static private final SubLList $list_alt5 = list(list(makeSymbol("*WITHIN-INFERENCE-CONTROL-PROCESS?*"), T));

    static private final SubLList $list_alt8 = list(makeKeyword("ABORT"));

    static private final SubLList $list_alt9 = list(list(makeSymbol("QUERY-ABORT")));

    static private final SubLSymbol $sym13$ERROR_MESSAGE = makeUninternedSymbol("ERROR-MESSAGE");


    static private final SubLList $list_alt21 = list(makeSymbol("FUNCTION"), makeSymbol("INFERENCE-ERROR-HANDLER"));

    static private final SubLList $list_alt22 = list(list(makeSymbol("HALT-REASON-VAR"), makeSymbol("TIMEOUT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym23$ABORT_MAX_TIME = makeUninternedSymbol("ABORT-MAX-TIME");

    static private final SubLSymbol $sym24$TIMED_OUT = makeUninternedSymbol("TIMED-OUT");

    static private final SubLList $list_alt27 = list(makeKeyword("MAX-TIME"));

    static private final SubLString $str_alt36$can_t_handle_non_simplest_inferen = makeString("can't handle non-simplest inferences like ~a");

    static private final SubLList $list_alt39 = list(list(NIL, NIL));

    static private final SubLString $str_alt40$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt50$Time_to_support_disjunctive___pra = makeString("Time to support disjunctive #$pragmaticRequirements");

    static private final SubLString $str_alt52$can_t_handle_non_simple_inference = makeString("can't handle non-simple inference seeding of strategies");

    static private final SubLString $str_alt69$Inference_control_process_was_kil = makeString("Inference control process was killed while running.");

    private static final SubLSymbol $HEURISTIC_BALANCED = makeKeyword("HEURISTIC-BALANCED");

    static private final SubLString $str_alt78$Non_continuable_inference_should_ = makeString("Non-continuable inference should have been :exhaust-total instead of :exhaust");

    static private final SubLString $str_alt79$Crazy_amount_of_problems___a__in_ = makeString("Crazy amount of problems (~a) in store ~a");

    static private final SubLList $list_alt82 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    static private final SubLString $str_alt87$Expected_a_one_to_one_match_betwe = makeString("Expected a one-to-one match between EL and HL bindings, got ~a and ~a");

    public static final SubLInteger $int$200 = makeInteger(200);

    static private final SubLList $list_alt94 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLList $list_alt95 = list(makeSymbol("TIME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym96$TIMER = makeUninternedSymbol("TIMER");

    static private final SubLString $str_alt101$WITH_QUERY_ABORT_TIMEOUT_client = makeString("WITH-QUERY-ABORT-TIMEOUT client");

    static private final SubLString $str_alt102$WITH_QUERY_ABORT_TIMEOUT_timer = makeString("WITH-QUERY-ABORT-TIMEOUT timer");
}

/**
 * Total time: 799 ms
 */
