/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.control_vars.$allow_forward_skolemization$;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.dequeue_forward_propagate_assertion_from_old_queue;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.enqueue_forward_propagate_assertions_to_new_queue;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.forward_propagate_new_queue;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.forward_propagate_old_queue;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.new_forward_propagate;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.swap_forward_propagate_queues;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.cycjava.cycl.utilities_macros.$current_forward_problem_store$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.time_has_arrivedP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FORWARD-PROPAGATE-ASSERTIONS
 * source file: /cyc/top/cycl/inference/forward-propagate-assertions.lisp
 * created:     2019/07/03 17:37:48
 */
public final class forward_propagate_assertions extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new forward_propagate_assertions();

 public static final String myName = "com.cyc.cycjava.cycl.inference.forward_propagate_assertions";


    // defparameter
    // Definitions
    /**
     * Level at which we no longer allow forward skolemization during forward
     * propagation of assertions.
     */
    @LispMethod(comment = "Level at which we no longer allow forward skolemization during forward\r\npropagation of assertions.\ndefparameter\nLevel at which we no longer allow forward skolemization during forward\npropagation of assertions.")
    public static final SubLSymbol $forward_propagate_assertions_skolem_depth$ = makeSymbol("*FORWARD-PROPAGATE-ASSERTIONS-SKOLEM-DEPTH*");

    static private final SubLString $str3$ASSERTIONS_was_not_a_list_of_asse = makeString("ASSERTIONS was not a list of assertions");

    private static final SubLSymbol FORWARD_PROPAGATE_P = makeSymbol("FORWARD-PROPAGATE-P");



    private static final SubLSymbol $sym9$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLSymbol $ASSERTION_FORWARD_PROPAGATION = makeKeyword("ASSERTION-FORWARD-PROPAGATION");

    private static final SubLString $str13$_____Level__S = makeString("~%;; Level ~S");

    private static final SubLString $str14$__ERROR_from__S_____a = makeString("~%ERROR from ~S~%  ~a");

    private static final SubLSymbol $sym19$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    private static final SubLString $str20$Seed_GAF__a_is_not_visible_from_s = makeString("Seed GAF ~a is not visible from specified mt ~a");

    private static final SubLString $str22$Specified_rule__a_is_not_visible_ = makeString("Specified rule ~a is not visible from specified mt ~a");

    private static final SubLSymbol $sym23$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol HL_ASSERTIBLE_P = makeSymbol("HL-ASSERTIBLE-P");

    private static final SubLSymbol DEDUCTION_SPEC_P = makeSymbol("DEDUCTION-SPEC-P");

    /**
     * Forward propagate every assertion in SOURCE-MT into TARGET-MT.
     * If NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.
     * If TIME is non-nil, quit after TIME seconds.
     * If DEPTH is non-nil, only conclude forward DEPTH steps of inference.
     * Return 2 values:
     * (a) the number of new assertions added.
     * (b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST
     */
    @LispMethod(comment = "Forward propagate every assertion in SOURCE-MT into TARGET-MT.\r\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\r\nIf TIME is non-nil, quit after TIME seconds.\r\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\r\nReturn 2 values:\r\n(a) the number of new assertions added.\r\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST\nForward propagate every assertion in SOURCE-MT into TARGET-MT.\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\nIf TIME is non-nil, quit after TIME seconds.\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\nReturn 2 values:\n(a) the number of new assertions added.\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST")
    public static final SubLObject forward_propagate_mt_alt(SubLObject source_mt, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (target_mt == UNPROVIDED) {
            target_mt = source_mt;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(source_mt, HLMT_P);
            SubLTrampolineFile.checkType(target_mt, HLMT_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $current_forward_problem_store$.currentBinding(thread);
                    try {
                        kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
                        $current_forward_problem_store$.bind(NIL, thread);
                        try {
                            result = com.cyc.cycjava.cycl.inference.forward_propagate_assertions.forward_propagate_assertions_in_mt_internal(kb_mapping.gather_mt_index(source_mt), target_mt, number, time, depth);
                        } finally {
                            {
                                SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    forward.clear_current_forward_problem_store();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        $current_forward_problem_store$.rebind(_prev_bind_1, thread);
                        kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Forward propagate every assertion in SOURCE-MT into TARGET-MT.
     * If NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.
     * If TIME is non-nil, quit after TIME seconds.
     * If DEPTH is non-nil, only conclude forward DEPTH steps of inference.
     * Return 2 values:
     * (a) the number of new assertions added.
     * (b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST
     */
    @LispMethod(comment = "Forward propagate every assertion in SOURCE-MT into TARGET-MT.\r\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\r\nIf TIME is non-nil, quit after TIME seconds.\r\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\r\nReturn 2 values:\r\n(a) the number of new assertions added.\r\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST\nForward propagate every assertion in SOURCE-MT into TARGET-MT.\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\nIf TIME is non-nil, quit after TIME seconds.\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\nReturn 2 values:\n(a) the number of new assertions added.\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST")
    public static SubLObject forward_propagate_mt(final SubLObject source_mt, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (target_mt == UNPROVIDED) {
            target_mt = source_mt;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(source_mt) : "! hlmt.hlmt_p(source_mt) " + ("hlmt.hlmt_p(source_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(source_mt) ") + source_mt;
        assert NIL != hlmt.hlmt_p(target_mt) : "! hlmt.hlmt_p(target_mt) " + ("hlmt.hlmt_p(target_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(target_mt) ") + target_mt;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
            $current_forward_problem_store$.bind(NIL, thread);
            try {
                result = forward_propagate_assertions_in_mt_internal(kb_mapping.gather_mt_index(source_mt), target_mt, number, time, depth);
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Forward propagate every assertion in ASSERTIONS in TARGET-MT.
     * If NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.
     * If TIME is non-nil, quit after TIME seconds.
     * If DEPTH is non-nil, only conclude forward DEPTH steps of inference.
     * Return 2 values:
     * (a) the number of new assertions added.
     * (b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST
     */
    @LispMethod(comment = "Forward propagate every assertion in ASSERTIONS in TARGET-MT.\r\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\r\nIf TIME is non-nil, quit after TIME seconds.\r\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\r\nReturn 2 values:\r\n(a) the number of new assertions added.\r\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST\nForward propagate every assertion in ASSERTIONS in TARGET-MT.\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\nIf TIME is non-nil, quit after TIME seconds.\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\nReturn 2 values:\n(a) the number of new assertions added.\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST")
    public static final SubLObject forward_propagate_assertions_in_mt_alt(SubLObject assertions, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertions, LISTP);
            SubLTrampolineFile.checkType(target_mt, HLMT_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == list_utilities.every_in_list(symbol_function(ASSERTION_P), assertions, UNPROVIDED)) {
                    Errors.error($str_alt3$ASSERTIONS_was_not_a_list_of_asse);
                }
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $current_forward_problem_store$.currentBinding(thread);
                    try {
                        kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
                        $current_forward_problem_store$.bind(NIL, thread);
                        try {
                            result = com.cyc.cycjava.cycl.inference.forward_propagate_assertions.forward_propagate_assertions_in_mt_internal(assertions, target_mt, number, time, depth);
                        } finally {
                            {
                                SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    forward.clear_current_forward_problem_store();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        }
                    } finally {
                        $current_forward_problem_store$.rebind(_prev_bind_1, thread);
                        kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Forward propagate every assertion in ASSERTIONS in TARGET-MT.
     * If NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.
     * If TIME is non-nil, quit after TIME seconds.
     * If DEPTH is non-nil, only conclude forward DEPTH steps of inference.
     * Return 2 values:
     * (a) the number of new assertions added.
     * (b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST
     */
    @LispMethod(comment = "Forward propagate every assertion in ASSERTIONS in TARGET-MT.\r\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\r\nIf TIME is non-nil, quit after TIME seconds.\r\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\r\nReturn 2 values:\r\n(a) the number of new assertions added.\r\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST\nForward propagate every assertion in ASSERTIONS in TARGET-MT.\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\nIf TIME is non-nil, quit after TIME seconds.\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\nReturn 2 values:\n(a) the number of new assertions added.\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST")
    public static SubLObject forward_propagate_assertions_in_mt(final SubLObject assertions, final SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(assertions) : "! listp(assertions) " + ("Types.listp(assertions) " + "CommonSymbols.NIL != Types.listp(assertions) ") + assertions;
        assert NIL != hlmt.hlmt_p(target_mt) : "! hlmt.hlmt_p(target_mt) " + ("hlmt.hlmt_p(target_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(target_mt) ") + target_mt;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.every_in_list(symbol_function(ASSERTION_P), assertions, UNPROVIDED))) {
            Errors.error($str3$ASSERTIONS_was_not_a_list_of_asse);
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
            $current_forward_problem_store$.bind(NIL, thread);
            try {
                result = forward_propagate_assertions_in_mt_internal(assertions, target_mt, number, time, depth);
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            $current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Forward propagate ASSERTION in TARGET-MT.
     * If NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.
     * If TIME is non-nil, quit after TIME seconds.
     * If DEPTH is non-nil, only conclude forward DEPTH steps of inference.
     * Return 2 values:
     * (a) the number of new assertions added.
     * (b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST
     */
    @LispMethod(comment = "Forward propagate ASSERTION in TARGET-MT.\r\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\r\nIf TIME is non-nil, quit after TIME seconds.\r\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\r\nReturn 2 values:\r\n(a) the number of new assertions added.\r\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST\nForward propagate ASSERTION in TARGET-MT.\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\nIf TIME is non-nil, quit after TIME seconds.\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\nReturn 2 values:\n(a) the number of new assertions added.\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST")
    public static final SubLObject forward_propagate_assertion_in_mt_alt(SubLObject assertion, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            SubLTrampolineFile.checkType(target_mt, HLMT_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $current_forward_problem_store$.currentBinding(thread);
                    try {
                        kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
                        $current_forward_problem_store$.bind(NIL, thread);
                        try {
                            result = com.cyc.cycjava.cycl.inference.forward_propagate_assertions.forward_propagate_assertions_in_mt_internal(list(assertion), target_mt, number, time, depth);
                        } finally {
                            {
                                SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    forward.clear_current_forward_problem_store();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                }
                            }
                        }
                    } finally {
                        $current_forward_problem_store$.rebind(_prev_bind_1, thread);
                        kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Forward propagate ASSERTION in TARGET-MT.
     * If NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.
     * If TIME is non-nil, quit after TIME seconds.
     * If DEPTH is non-nil, only conclude forward DEPTH steps of inference.
     * Return 2 values:
     * (a) the number of new assertions added.
     * (b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST
     */
    @LispMethod(comment = "Forward propagate ASSERTION in TARGET-MT.\r\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\r\nIf TIME is non-nil, quit after TIME seconds.\r\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\r\nReturn 2 values:\r\n(a) the number of new assertions added.\r\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST\nForward propagate ASSERTION in TARGET-MT.\nIf NUMBER is non-nil, quit when there are NUMBER assertions in TARGET-MT.\nIf TIME is non-nil, quit after TIME seconds.\nIf DEPTH is non-nil, only conclude forward DEPTH steps of inference.\nReturn 2 values:\n(a) the number of new assertions added.\n(b) the reason propagation halted -- one of :NUMBER :TIME :DEPTH :EXHAUST")
    public static SubLObject forward_propagate_assertion_in_mt(final SubLObject assertion, final SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != hlmt.hlmt_p(target_mt) : "! hlmt.hlmt_p(target_mt) " + ("hlmt.hlmt_p(target_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(target_mt) ") + target_mt;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
            $current_forward_problem_store$.bind(NIL, thread);
            try {
                result = forward_propagate_assertions_in_mt_internal(list(assertion), target_mt, number, time, depth);
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            $current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject inference_forward_propagate_mt_alt(SubLObject forward_propagate, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forward_propagate) {
                SubLTrampolineFile.checkType(forward_propagate, FORWARD_PROPAGATE_P);
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $current_forward_problem_store$.currentBinding(thread);
                    try {
                        kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
                        $current_forward_problem_store$.bind(NIL, thread);
                        try {
                            result = com.cyc.cycjava.cycl.inference.forward_propagate_assertions.forward_propagate_assertions_from_struct(forward_propagate, target_mt, number, time.isInteger() ? ((SubLObject) (numeric_date_utilities.time_from_now(time))) : NIL, depth);
                        } finally {
                            {
                                SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    forward.clear_current_forward_problem_store();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                        }
                    } finally {
                        $current_forward_problem_store$.rebind(_prev_bind_1, thread);
                        kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject inference_forward_propagate_mt(final SubLObject forward_propagate, final SubLObject target_mt, final SubLObject number, final SubLObject time, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != forward_propagate) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate))) {
            throw new AssertionError(forward_propagate);
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
            $current_forward_problem_store$.bind(NIL, thread);
            try {
                result = forward_propagate_assertions_from_struct(forward_propagate, target_mt, number, time.isInteger() ? numeric_date_utilities.time_from_now(time) : NIL, depth);
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            $current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject forward_propagate_assertion_against_rules_in_mt_alt(SubLObject assertion, SubLObject rules, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        return com.cyc.cycjava.cycl.inference.forward_propagate_assertions.forward_propagate_assertions_against_rules_in_mt(list(assertion), rules, target_mt, number, time, depth);
    }

    public static SubLObject forward_propagate_assertion_against_rules_in_mt(final SubLObject assertion, final SubLObject rules, final SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        return forward_propagate_assertions_against_rules_in_mt(list(assertion), rules, target_mt, number, time, depth);
    }

    public static final SubLObject forward_propagate_assertions_against_rules_in_mt_alt(SubLObject assertions, SubLObject rules, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject suspend_status = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject this_total = com.cyc.cycjava.cycl.inference.forward_propagate_assertions.forward_propagate_assertions_in_mt_internal(assertions, target_mt, number, time, depth);
                            SubLObject this_suspend_status = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            total = add(total, this_total);
                        }
                    } finally {
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(total, suspend_status);
            }
        }
    }

    public static SubLObject forward_propagate_assertions_against_rules_in_mt(final SubLObject assertions, final SubLObject rules, final SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject suspend_status = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
            thread.resetMultipleValues();
            final SubLObject this_total = forward_propagate_assertions_in_mt_internal(assertions, target_mt, number, time, depth);
            final SubLObject this_suspend_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            total = add(total, this_total);
        } finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return values(total, suspend_status);
    }

    public static SubLObject forward_consequences_of_assertion(final SubLObject assertion, SubLObject propagation_mt, SubLObject max_time) {
        if (propagation_mt == UNPROVIDED) {
            propagation_mt = $$InferencePSC;
        }
        if (max_time == UNPROVIDED) {
            max_time = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject halt_reason = $ERROR;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind(T, thread);
            SubLObject timed_outP = NIL;
            if (NIL != max_time) {
                final SubLObject tag = with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$5 = $within_with_timeout$.currentBinding(thread);
                    try {
                        $within_with_timeout$.bind(T, thread);
                        SubLObject timer = NIL;
                        try {
                            final SubLObject _prev_bind_0_$6 = $with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = with_timeout_start_timer(max_time, tag);
                                result = forward.forward_propagate_assertion_int(assertion, propagation_mt, NIL);
                            } finally {
                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$6, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                with_timeout_stop_timer(timer);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                    } finally {
                        $within_with_timeout$.rebind(_prev_bind_0_$5, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                } finally {
                    thread.throwStack.pop();
                }
            } else {
                result = forward.forward_propagate_assertion_int(assertion, propagation_mt, NIL);
            }
            halt_reason = (NIL != timed_outP) ? $MAX_TIME : $EXHAUST_TOTAL;
        } finally {
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return values(result, halt_reason);
    }

    public static final SubLObject forward_propagate_assertions_in_mt_internal_alt(SubLObject assertions, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        assertions = list_utilities.sort_via_test(copy_list(assertions), symbol_function($sym5$RULE_ASSERTION_), UNPROVIDED);
        {
            SubLObject before_count = kb_indexing.num_mt_index(target_mt);
            SubLObject time_cutoff = (time.isInteger()) ? ((SubLObject) (numeric_date_utilities.time_from_now(time))) : NIL;
            SubLObject forward_propagate = new_forward_propagate(UNPROVIDED);
            SubLObject reason = NIL;
            enqueue_forward_propagate_assertions_to_new_queue(forward_propagate, assertions);
            com.cyc.cycjava.cycl.inference.forward_propagate_assertions.forward_propagate_assertions_from_struct(forward_propagate, target_mt, number, time_cutoff, depth);
            return values(subtract(kb_indexing.num_mt_index(target_mt), before_count), reason);
        }
    }

    public static SubLObject forward_propagate_assertions_in_mt_internal(SubLObject assertions, final SubLObject target_mt, final SubLObject number, final SubLObject time, final SubLObject depth) {
        assertions = list_utilities.sort_via_test(copy_list(assertions), symbol_function($sym9$RULE_ASSERTION_), UNPROVIDED);
        final SubLObject before_count = kb_indexing.num_mt_index(target_mt);
        final SubLObject time_cutoff = (time.isInteger()) ? numeric_date_utilities.time_from_now(time) : NIL;
        final SubLObject forward_propagate = inference_datastructures_forward_propagate.new_forward_propagate(UNPROVIDED);
        final SubLObject reason = NIL;
        inference_datastructures_forward_propagate.enqueue_forward_propagate_assertions_to_new_queue(forward_propagate, assertions);
        forward_propagate_assertions_from_struct(forward_propagate, target_mt, number, time_cutoff, depth);
        return values(subtract(kb_indexing.num_mt_index(target_mt), before_count), reason);
    }

    public static final SubLObject forward_propagate_assertions_from_struct_alt(SubLObject forward_propagate, SubLObject target_mt, SubLObject number, SubLObject time_cutoff, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject reason = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(target_mt, thread);
                            {
                                SubLObject level = ZERO_INTEGER;
                                SubLObject before_count = kb_indexing.num_mt_index(target_mt);
                                while ((NIL == queues.queue_empty_p(forward_propagate_new_queue(forward_propagate))) || (NIL == queues.queue_empty_p(forward_propagate_old_queue(forward_propagate)))) {
                                    if (depth.isInteger() && level.numGE(depth)) {
                                        sublisp_throw($ASSERTION_FORWARD_PROPAGATION, $DEPTH);
                                    }
                                    if (NIL != queues.queue_empty_p(forward_propagate_old_queue(forward_propagate))) {
                                        swap_forward_propagate_queues(forward_propagate);
                                    }
                                    SubLTrampolineFile.checkType(forward_propagate_new_queue(forward_propagate), QUEUE_P);
                                    {
                                        SubLObject _prev_bind_0_5 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                                        try {
                                            kb_control_vars.$forward_inference_environment$.bind(forward_propagate_new_queue(forward_propagate), thread);
                                            if (NIL != forward.$tracing_forward_inference$.getDynamicValue(thread)) {
                                                format(T, $str_alt9$_____Level__S, add(level, ONE_INTEGER));
                                            }
                                            {
                                                SubLObject _prev_bind_0_6 = $allow_forward_skolemization$.currentBinding(thread);
                                                try {
                                                    $allow_forward_skolemization$.bind(makeBoolean((NIL != $allow_forward_skolemization$.getDynamicValue(thread)) && level.numL($forward_propagate_assertions_skolem_depth$.getDynamicValue(thread))), thread);
                                                    while (NIL == queues.queue_empty_p(forward_propagate_old_queue(forward_propagate))) {
                                                        {
                                                            SubLObject assertion = dequeue_forward_propagate_assertion_from_old_queue(forward_propagate);
                                                            SubLObject error_message = NIL;
                                                            forward.forward_propagate_assertion(assertion, target_mt);
                                                            if ((NIL != error_message) && (NIL != forward.$tracing_forward_inference$.getDynamicValue(thread))) {
                                                                format(T, $str_alt10$__ERROR_from__S_____a, assertion, error_message);
                                                            }
                                                            if (number.isInteger() && subtract(kb_indexing.num_mt_index(target_mt), before_count).numGE(number)) {
                                                                sublisp_throw($ASSERTION_FORWARD_PROPAGATION, $NUMBER);
                                                            }
                                                            if ((NIL != time_cutoff) && (NIL != time_has_arrivedP(time_cutoff))) {
                                                                sublisp_throw($ASSERTION_FORWARD_PROPAGATION, $TIME);
                                                            }
                                                        }
                                                    } 
                                                } finally {
                                                    $allow_forward_skolemization$.rebind(_prev_bind_0_6, thread);
                                                }
                                            }
                                        } finally {
                                            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_5, thread);
                                        }
                                    }
                                    level = add(level, ONE_INTEGER);
                                } 
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                    reason = $EXHAUST;
                } catch (Throwable ccatch_env_var) {
                    reason = Errors.handleThrowable(ccatch_env_var, $ASSERTION_FORWARD_PROPAGATION);
                }
                return reason;
            }
        }
    }

    public static SubLObject forward_propagate_assertions_from_struct(final SubLObject forward_propagate, final SubLObject target_mt, final SubLObject number, final SubLObject time_cutoff, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = NIL;
        try {
            thread.throwStack.push($ASSERTION_FORWARD_PROPAGATION);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(target_mt, thread);
                SubLObject level = ZERO_INTEGER;
                final SubLObject before_count = kb_indexing.num_mt_index(target_mt);
                while ((NIL == queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate))) || (NIL == queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_old_queue(forward_propagate)))) {
                    if (depth.isInteger() && level.numGE(depth)) {
                        sublisp_throw($ASSERTION_FORWARD_PROPAGATION, $DEPTH);
                    }
                    if (NIL != queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_old_queue(forward_propagate))) {
                        inference_datastructures_forward_propagate.swap_forward_propagate_queues(forward_propagate);
                    }
                    assert NIL != queues.queue_p(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate)) : "! queues.queue_p(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate)) " + ("queues.queue_p(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate)) " + "CommonSymbols.NIL != queues.queue_p(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate)) ") + inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate);
                    final SubLObject _prev_bind_0_$8 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_environment$.bind(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate), thread);
                        if (NIL != forward.$tracing_forward_inference$.getDynamicValue(thread)) {
                            format(T, $str13$_____Level__S, add(level, ONE_INTEGER));
                        }
                        final SubLObject _prev_bind_0_$9 = $allow_forward_skolemization$.currentBinding(thread);
                        try {
                            $allow_forward_skolemization$.bind(makeBoolean((NIL != $allow_forward_skolemization$.getDynamicValue(thread)) && level.numL($forward_propagate_assertions_skolem_depth$.getDynamicValue(thread))), thread);
                            while (NIL == queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_old_queue(forward_propagate))) {
                                final SubLObject assertion = inference_datastructures_forward_propagate.dequeue_forward_propagate_assertion_from_old_queue(forward_propagate);
                                final SubLObject error_message = NIL;
                                forward.forward_propagate_assertion(assertion, target_mt);
                                if ((NIL != error_message) && (NIL != forward.$tracing_forward_inference$.getDynamicValue(thread))) {
                                    format(T, $str14$__ERROR_from__S_____a, assertion, error_message);
                                }
                                if (number.isInteger() && subtract(kb_indexing.num_mt_index(target_mt), before_count).numGE(number)) {
                                    sublisp_throw($ASSERTION_FORWARD_PROPAGATION, $NUMBER);
                                }
                                if ((NIL != time_cutoff) && (NIL != time_has_arrivedP(time_cutoff))) {
                                    sublisp_throw($ASSERTION_FORWARD_PROPAGATION, $TIME);
                                }
                            } 
                        } finally {
                            $allow_forward_skolemization$.rebind(_prev_bind_0_$9, thread);
                        }
                    } finally {
                        kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$8, thread);
                    }
                    level = add(level, ONE_INTEGER);
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            reason = $EXHAUST;
        } catch (final Throwable ccatch_env_var) {
            reason = Errors.handleThrowable(ccatch_env_var, $ASSERTION_FORWARD_PROPAGATION);
        } finally {
            thread.throwStack.pop();
        }
        return reason;
    }

    static private final SubLString $str_alt3$ASSERTIONS_was_not_a_list_of_asse = makeString("ASSERTIONS was not a list of assertions");

    static private final SubLSymbol $sym5$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    public static SubLObject generate_consequences(final SubLObject seed_gaf, SubLObject rules, SubLObject mt, SubLObject max_time) {
        if (rules == UNPROVIDED) {
            rules = $ALL;
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (max_time == UNPROVIDED) {
            max_time = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            assert NIL != assertions_high.gaf_assertionP(seed_gaf) : "! assertions_high.gaf_assertionP(seed_gaf) " + ("assertions_high.gaf_assertionP(seed_gaf) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(seed_gaf) ") + seed_gaf;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(seed_gaf)))) {
                Errors.error($str20$Seed_GAF__a_is_not_visible_from_s, seed_gaf, mt);
            }
            if ($ALL != rules) {
                final SubLObject list_var = rules;
                assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                elem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    assert NIL != assertions_high.rule_assertionP(elem) : "! assertions_high.rule_assertionP(elem) " + ("assertions_high.rule_assertionP(elem) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(elem) ") + elem;
                    cdolist_list_var = cdolist_list_var.rest();
                    elem = cdolist_list_var.first();
                } 
                SubLObject cdolist_list_var2 = rules;
                SubLObject rule = NIL;
                rule = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(rule)))) {
                        Errors.error($str22$Specified_rule__a_is_not_visible_, rule, mt);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    rule = cdolist_list_var2.first();
                } 
            }
            SubLObject queryables = NIL;
            SubLObject halt_reason = NIL;
            SubLObject consequences = NIL;
            final SubLObject _prev_bind_0_$10 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                thread.resetMultipleValues();
                final SubLObject consequences_$11 = forward_consequences_of_assertion(seed_gaf, mt, max_time);
                final SubLObject halt_reason_$12 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                consequences = consequences_$11;
                halt_reason = halt_reason_$12;
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$10, thread);
            }
            SubLObject cdolist_list_var3 = consequences;
            SubLObject assertible = NIL;
            assertible = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                queryables = cons(hl_assertible_to_queryable(assertible), queryables);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertible = cdolist_list_var3.first();
            } 
            return values(queryables, halt_reason);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    static private final SubLString $str_alt9$_____Level__S = makeString("~%;; Level ~S");

    static private final SubLString $str_alt10$__ERROR_from__S_____a = makeString("~%ERROR from ~S~%  ~a");

    public static SubLObject hl_assertible_to_queryable(final SubLObject assertible) {
        assert NIL != hl_storage_modules.hl_assertible_p(assertible) : "! hl_storage_modules.hl_assertible_p(assertible) " + ("hl_storage_modules.hl_assertible_p(assertible) " + "CommonSymbols.NIL != hl_storage_modules.hl_assertible_p(assertible) ") + assertible;
        final SubLObject argument_spec = hl_storage_modules.hl_assertible_argument_spec(assertible);
        final SubLObject hl_assertion_spec_var_$13;
        final SubLObject hl_assertion_spec_var = hl_assertion_spec_var_$13 = hl_storage_modules.hl_assertible_hl_assertion_spec(assertible);
        final SubLObject cnf = hl_storage_modules.hl_assertion_spec_cnf(hl_assertion_spec_var_$13);
        final SubLObject mt = hl_storage_modules.hl_assertion_spec_mt(hl_assertion_spec_var_$13);
        assert NIL != deductions_high.deduction_spec_p(argument_spec) : "! deductions_high.deduction_spec_p(argument_spec) " + ("deductions_high.deduction_spec_p(argument_spec) " + "CommonSymbols.NIL != deductions_high.deduction_spec_p(argument_spec) ") + argument_spec;
        final SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
        final SubLObject query_el_formula = uncanonicalizer.cnf_el_formula(cnf, mt, UNPROVIDED);
        final SubLObject queryable = list(query_el_formula, mt, supports);
        return queryable;
    }

    public static SubLObject declare_forward_propagate_assertions_file() {
        declareFunction("forward_propagate_mt", "FORWARD-PROPAGATE-MT", 1, 4, false);
        declareFunction("forward_propagate_assertions_in_mt", "FORWARD-PROPAGATE-ASSERTIONS-IN-MT", 2, 3, false);
        declareFunction("forward_propagate_assertion_in_mt", "FORWARD-PROPAGATE-ASSERTION-IN-MT", 2, 3, false);
        declareFunction("inference_forward_propagate_mt", "INFERENCE-FORWARD-PROPAGATE-MT", 5, 0, false);
        declareFunction("forward_propagate_assertion_against_rules_in_mt", "FORWARD-PROPAGATE-ASSERTION-AGAINST-RULES-IN-MT", 3, 3, false);
        declareFunction("forward_propagate_assertions_against_rules_in_mt", "FORWARD-PROPAGATE-ASSERTIONS-AGAINST-RULES-IN-MT", 3, 3, false);
        declareFunction("forward_consequences_of_assertion", "FORWARD-CONSEQUENCES-OF-ASSERTION", 1, 2, false);
        declareFunction("forward_propagate_assertions_in_mt_internal", "FORWARD-PROPAGATE-ASSERTIONS-IN-MT-INTERNAL", 5, 0, false);
        declareFunction("forward_propagate_assertions_from_struct", "FORWARD-PROPAGATE-ASSERTIONS-FROM-STRUCT", 5, 0, false);
        declareFunction("generate_consequences", "GENERATE-CONSEQUENCES", 1, 3, false);
        declareFunction("hl_assertible_to_queryable", "HL-ASSERTIBLE-TO-QUERYABLE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_forward_propagate_assertions_file() {
        defparameter("*FORWARD-PROPAGATE-ASSERTIONS-SKOLEM-DEPTH*", ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_forward_propagate_assertions_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_forward_propagate_assertions_file();
    }

    @Override
    public void initializeVariables() {
        init_forward_propagate_assertions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_forward_propagate_assertions_file();
    }

    static {
    }
}

/**
 * Total time: 175 ms synthetic
 */
