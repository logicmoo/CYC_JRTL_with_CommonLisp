/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.interrupt_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_block;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_unblock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_whostate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.processp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NL-REFORMULATOR
 * source file: /cyc/top/cycl/nl-reformulator.lisp
 * created:     2019/07/03 17:38:23
 */
public final class nl_reformulator extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @unknown -- Consider moving this and making it public.
     */
    @LispMethod(comment = "@unknown -- Consider moving this and making it public.")
    public static final SubLObject possibly_with_timeout(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject timeout = NIL;
                    SubLObject timed_outP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    timeout = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    timed_outP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PIF, timeout, list(WITH_TIMEOUT, list(timeout, timed_outP), bq_cons(PROGN, append(body, NIL))), bq_cons(PROGN, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt10);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLFile me = new nl_reformulator();

 public static final String myName = "com.cyc.cycjava.cycl.nl_reformulator";


    // defparameter
    @LispMethod(comment = "How much time did NPP spend reformulating?\ndefparameter")
    // Definitions
    /**
     * How much time did NPP spend reformulating?
     */
    private static final SubLSymbol $nl_reformulator_time$ = makeSymbol("*NL-REFORMULATOR-TIME*");

    // defparameter
    // How many reformulations were performed?
    /**
     * How many reformulations were performed?
     */
    @LispMethod(comment = "How many reformulations were performed?\ndefparameter")
    private static final SubLSymbol $nl_reformulations_total$ = makeSymbol("*NL-REFORMULATIONS-TOTAL*");

    // defparameter
    // How many reformulations simplified their input?
    /**
     * How many reformulations simplified their input?
     */
    @LispMethod(comment = "How many reformulations simplified their input?\ndefparameter")
    private static final SubLSymbol $nl_reformulations_simplified$ = makeSymbol("*NL-REFORMULATIONS-SIMPLIFIED*");

    // deflexical
    // Should we print out info on reformulation calls?
    /**
     * Should we print out info on reformulation calls?
     */
    @LispMethod(comment = "Should we print out info on reformulation calls?\ndeflexical")
    private static final SubLSymbol $nl_ref_show_reformulationsP$ = makeSymbol("*NL-REF-SHOW-REFORMULATIONS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $within_nl_reformulate_daemon$ = makeSymbol("*WITHIN-NL-REFORMULATE-DAEMON*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$__Spent__4_2F_seconds_reformulati = makeString("~&Spent ~4,2F seconds reformulating.");

    static private final SubLString $str1$__D_of__D_items_passed_through_th = makeString(" ~D of ~D items passed through the Reformulator were simplified.~%");

    private static final SubLSymbol WITH_NEW_REFORMULATOR_MEMOIZATION_STATE = makeSymbol("WITH-NEW-REFORMULATOR-MEMOIZATION-STATE");

    static private final SubLList $list4 = list(list(makeSymbol("*NL-REFORMULATOR-SETTINGS*"), list(makeSymbol("ADD-OR-CHANGE-NL-REFORMULATOR-SETTINGS"), makeKeyword("CLEAR-CACHES?"), makeKeyword("FALSE"))));

    private static final SubLSymbol $kw6$CLEAR_CACHES_ = makeKeyword("CLEAR-CACHES?");

    private static final SubLSymbol NL_REFORMULATE = makeSymbol("NL-REFORMULATE");

    private static final SubLFloat $float$1_1 = makeDouble(1.1);

    private static final SubLFloat $float$0_001 = makeDouble(0.001);

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLString $str14$Forcing_timeout_of_NL_reformulato = makeString("Forcing timeout of NL reformulator daemon ~S after ~S seconds");

    private static final SubLString $str15$Forcing_timeout_of_NL_reformulato = makeString("Forcing timeout of NL reformulator daemon ~S after hard timeout");

    private static final SubLString $str16$Hard_timeout_of__S_seconds_reache = makeString("Hard timeout of ~S seconds reached in~% (NL-REFORMULATE ~S ~S)");

    private static final SubLString $str17$Alloted_time_of__S_seconds_reache = makeString("Alloted time of ~S seconds reached in~% (NL-REFORMULATE ~S ~S)");

    private static final SubLString $str18$__Reformulated__S___to__S_in___3F = makeString("~&Reformulated ~S~% to ~S in ~,3F seconds.~%");

    private static final SubLSymbol $nl_reformulate_queue$ = makeSymbol("*NL-REFORMULATE-QUEUE*");

    private static final SubLString $str20$NL_REFORMULATE_DAEMON_given_non_u = makeString("NL-REFORMULATE-DAEMON given non-unknown result: ~S");

    private static final SubLSymbol $nl_reformulate_daemon$ = makeSymbol("*NL-REFORMULATE-DAEMON*");

    private static final SubLString $str23$NL_Reformulator_Daemon_already_ha = makeString("NL Reformulator Daemon already has ~S request(s) queued up. This may take a little while.");

    private static final SubLString $$$Run = makeString("Run");

    private static final SubLSymbol $NL_REFORMULATE_DAEMON_QUIT = makeKeyword("NL-REFORMULATE-DAEMON-QUIT");

    private static final SubLList $list26 = list(makeSymbol("CYCL"), makeSymbol("MT"), makeSymbol("SETTINGS"), makeSymbol("RESULT"), makeSymbol("SEMAPHORE"), makeSymbol("HARD-TIMEOUT"));



    private static final SubLInteger $int$3600 = makeInteger(3600);

    private static final SubLString $str33$Aborting__S = makeString("Aborting ~S");

    private static final SubLString $str34$_S_didn_t_die_immediately_ = makeString("~S didn't die immediately.");

    private static final SubLString $str35$_S_didn_t_die_after_1_second__Att = makeString("~S didn't die after 1 second. Attempting KILL-PROCESS...");

    private static final SubLString $str36$_S_still_didn_t_die_immediately_ = makeString("~S still didn't die immediately.");

    private static final SubLString $str37$_S_didn_t_die_after_1_second_ = makeString("~S didn't die after 1 second.");

    private static final SubLString $str38$OK__Now_it_s_dead___S = makeString("OK. Now it's dead: ~S");

    private static final SubLString $$$NL_Reformulate_Daemon = makeString("NL Reformulate Daemon");

    private static final SubLSymbol NL_REFORMULATE_DAEMON_RUN = makeSymbol("NL-REFORMULATE-DAEMON-RUN");

    private static final SubLSymbol NL_REFORMULATE_DAEMON_QUIT = makeSymbol("NL-REFORMULATE-DAEMON-QUIT");

    private static final SubLList $list42 = list(makeSymbol("MODULES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $nl_reformulator_settings$ = makeSymbol("*NL-REFORMULATOR-SETTINGS*");

    private static final SubLSymbol NL_REF_REMOVE_MODULES = makeSymbol("NL-REF-REMOVE-MODULES");

    private static final SubLSymbol $IGNORE_RL_MODULES = makeKeyword("IGNORE-RL-MODULES");

    private static final SubLSymbol NL_REFORMULATE_INT_CACHED = makeSymbol("NL-REFORMULATE-INT-CACHED");

    private static final SubLSymbol $nl_reformulate_int_cached_caching_state$ = makeSymbol("*NL-REFORMULATE-INT-CACHED-CACHING-STATE*");

    public static final SubLObject get_nl_reformulator_time_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $nl_reformulator_time$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_nl_reformulator_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return nl_reformulator.$nl_reformulator_time$.getDynamicValue(thread);
    }

    public static final SubLObject nl_ref_reset_metrics_alt() {
        $nl_reformulator_time$.setDynamicValue(ZERO_INTEGER);
        $nl_reformulations_total$.setDynamicValue(ZERO_INTEGER);
        $nl_reformulations_simplified$.setDynamicValue(ZERO_INTEGER);
        return ZERO_INTEGER;
    }

    public static SubLObject nl_ref_reset_metrics() {
        nl_reformulator.$nl_reformulator_time$.setDynamicValue(ZERO_INTEGER);
        nl_reformulator.$nl_reformulations_total$.setDynamicValue(ZERO_INTEGER);
        nl_reformulator.$nl_reformulations_simplified$.setDynamicValue(ZERO_INTEGER);
        return ZERO_INTEGER;
    }

    public static final SubLObject nl_ref_report_metrics_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$debug_io$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(stream, $str_alt0$__Spent__4_2F_seconds_reformulati, $nl_reformulator_time$.getDynamicValue(thread));
            format(stream, $str_alt1$__D_of__D_items_passed_through_th, $nl_reformulations_simplified$.getDynamicValue(thread), $nl_reformulations_total$.getDynamicValue(thread));
            return T;
        }
    }

    public static SubLObject nl_ref_report_metrics(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$debug_io$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(stream, nl_reformulator.$str0$__Spent__4_2F_seconds_reformulati, nl_reformulator.$nl_reformulator_time$.getDynamicValue(thread));
        format(stream, nl_reformulator.$str1$__D_of__D_items_passed_through_th, nl_reformulator.$nl_reformulations_simplified$.getDynamicValue(thread), nl_reformulator.$nl_reformulations_total$.getDynamicValue(thread));
        return T;
    }

    /**
     * Execute BODY clearing the reformulator only once at the beginning.
     */
    @LispMethod(comment = "Execute BODY clearing the reformulator only once at the beginning.")
    public static final SubLObject memoizing_nl_reformulator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_NEW_REFORMULATOR_MEMOIZATION_STATE, listS(CLET, $list_alt4, append(body, NIL)));
        }
    }

    /**
     * Execute BODY clearing the reformulator only once at the beginning.
     */
    @LispMethod(comment = "Execute BODY clearing the reformulator only once at the beginning.")
    public static SubLObject memoizing_nl_reformulator(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(nl_reformulator.WITH_NEW_REFORMULATOR_MEMOIZATION_STATE, listS(CLET, nl_reformulator.$list4, append(body, NIL)));
    }

    /**
     * Reformulate a list of related CycL expressions.
     *
     * @return LISTP; CYCLS reformulated.
     */
    @LispMethod(comment = "Reformulate a list of related CycL expressions.\r\n\r\n@return LISTP; CYCLS reformulated.")
    public static final SubLObject nl_reformulate_cycls_alt(SubLObject cycls) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject reformulated_cycls = NIL;
                SubLObject v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType(v_memoization_state, MEMOIZATION_STATE_P);
                {
                    SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
                    try {
                        reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
                        {
                            SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_1 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                        Errors.error($str_alt6$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject _prev_bind_0_2 = $nl_reformulator_settings$.currentBinding(thread);
                                                try {
                                                    $nl_reformulator_settings$.bind(com.cyc.cycjava.cycl.nl_reformulator.add_or_change_nl_reformulator_settings($kw7$CLEAR_CACHES_, $FALSE), thread);
                                                    reformulated_cycls = Mapping.mapcar(NL_REFORMULATE, cycls);
                                                } finally {
                                                    $nl_reformulator_settings$.rebind(_prev_bind_0_2, thread);
                                                }
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
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return reformulated_cycls;
            }
        }
    }

    /**
     * Reformulate a list of related CycL expressions.
     *
     * @return LISTP; CYCLS reformulated.
     */
    @LispMethod(comment = "Reformulate a list of related CycL expressions.\r\n\r\n@return LISTP; CYCLS reformulated.")
    public static SubLObject nl_reformulate_cycls(final SubLObject cycls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reformulated_cycls = NIL;
        final SubLObject v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "! memoization_state.memoization_state_p(v_memoization_state) " + ("memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) ") + v_memoization_state;
        final SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
        try {
            reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$2 = nl_reformulator.$nl_reformulator_settings$.currentBinding(thread);
                    try {
                        nl_reformulator.$nl_reformulator_settings$.bind(nl_reformulator.add_or_change_nl_reformulator_settings(nl_reformulator.$kw6$CLEAR_CACHES_, $FALSE), thread);
                        reformulated_cycls = Mapping.mapcar(nl_reformulator.NL_REFORMULATE, cycls);
                    } finally {
                        nl_reformulator.$nl_reformulator_settings$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return reformulated_cycls;
    }

    /**
     *
     *
     * @return LISTP of reformulator settings including exactly VAL as the value for DIR.
     */
    @LispMethod(comment = "@return LISTP of reformulator settings including exactly VAL as the value for DIR.")
    public static final SubLObject add_or_change_nl_reformulator_settings_alt(SubLObject dir, SubLObject val) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject settings = $nl_reformulator_settings$.getDynamicValue(thread);
                SubLObject pos = position(dir, settings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != pos) {
                    settings = list_utilities.nreplace_nth(number_utilities.f_1X(pos), val, settings);
                } else {
                    settings = cons(val, settings);
                    settings = cons(dir, settings);
                }
                return settings;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of reformulator settings including exactly VAL as the value for DIR.
     */
    @LispMethod(comment = "@return LISTP of reformulator settings including exactly VAL as the value for DIR.")
    public static SubLObject add_or_change_nl_reformulator_settings(final SubLObject dir, final SubLObject val) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject settings = nl_reformulator.$nl_reformulator_settings$.getDynamicValue(thread);
        final SubLObject pos = position(dir, settings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != pos) {
            settings = list_utilities.nreplace_nth(number_utilities.f_1X(pos), val, settings);
        } else {
            settings = cons(val, settings);
            settings = cons(dir, settings);
        }
        return settings;
    }

    /**
     * Try to simplify CYCL using the Cyc Reformulator
     */
    @LispMethod(comment = "Try to simplify CYCL using the Cyc Reformulator")
    public static final SubLObject nl_reformulate_alt(SubLObject cycl, SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = parsing_macros.parsing_timeout_time_remaining();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $nl_reformulations_total$.setDynamicValue(add($nl_reformulations_total$.getDynamicValue(thread), ONE_INTEGER), thread);
            {
                SubLObject parsing_timeout_timed_outP = NIL;
                SubLObject mt = parsing_vars.$parsing_domain_mt$.getDynamicValue(thread);
                SubLObject settings = $nl_reformulator_settings$.getDynamicValue(thread);
                SubLObject hard_timeout = (NIL != timeout) ? ((SubLObject) (number_utilities.maximum(list(multiply($float$1_1, timeout), add(FIVE_INTEGER, timeout)), UNPROVIDED))) : NIL;
                SubLObject hard_timeout_reachedP = NIL;
                SubLObject ans = copy_expression(cycl);
                SubLObject time = ZERO_INTEGER;
                SubLObject timed_outP = NIL;
                SubLObject result = make_list(TWO_INTEGER, $UNKNOWN);
                SubLObject sleep_time = $float$0_001;
                SubLObject semaphore = Semaphores.new_semaphore(process_name(current_process()), ZERO_INTEGER);
                com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_enqueue(cycl, mt, settings, result, semaphore, timeout);
                Semaphores.semaphore_wait(semaphore);
                if (NIL != timeout) {
                    {
                        SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                        SubLObject _prev_bind_1 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                        SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                        try {
                            parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(timeout), thread);
                            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                            if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                if (NIL != hard_timeout) {
                                    {
                                        SubLObject tag = with_timeout_make_tag();
                                        try {
                                            {
                                                SubLObject _prev_bind_0_4 = $within_with_timeout$.currentBinding(thread);
                                                try {
                                                    $within_with_timeout$.bind(T, thread);
                                                    {
                                                        SubLObject timer = NIL;
                                                        try {
                                                            {
                                                                SubLObject _prev_bind_0_5 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                try {
                                                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                    timer = with_timeout_start_timer(hard_timeout, tag);
                                                                    while (result.first() == $WORKING) {
                                                                        sleep(sleep_time);
                                                                        time = add(time, sleep_time);
                                                                        if (sleep_time.numL($float$0_5)) {
                                                                            sleep_time = multiply(sleep_time, TWO_INTEGER);
                                                                        }
                                                                        if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                                                            Errors.warn($str_alt19$Forcing_timeout_of_NL_reformulato, com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon(), time);
                                                                            com.cyc.cycjava.cycl.nl_reformulator.launch_or_restart_nl_reformulate_daemon();
                                                                            hard_timeout_reachedP = T;
                                                                        }
                                                                    } 
                                                                } finally {
                                                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_5, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    with_timeout_stop_timer(timer);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    $within_with_timeout$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            hard_timeout_reachedP = Errors.handleThrowable(ccatch_env_var, tag);
                                        }
                                    }
                                } else {
                                    while (result.first() == $WORKING) {
                                        sleep(sleep_time);
                                        time = add(time, sleep_time);
                                        if (sleep_time.numL($float$0_5)) {
                                            sleep_time = multiply(sleep_time, TWO_INTEGER);
                                        }
                                        if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                            Errors.warn($str_alt19$Forcing_timeout_of_NL_reformulato, com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon(), time);
                                            com.cyc.cycjava.cycl.nl_reformulator.launch_or_restart_nl_reformulate_daemon();
                                            hard_timeout_reachedP = T;
                                        }
                                    } 
                                }
                            }
                            parsing_timeout_timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                        } finally {
                            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2, thread);
                            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1, thread);
                            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (NIL != hard_timeout) {
                        {
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
                                                        timer = with_timeout_start_timer(hard_timeout, tag);
                                                        while (result.first() == $WORKING) {
                                                            sleep(sleep_time);
                                                            time = add(time, sleep_time);
                                                            if (sleep_time.numL($float$0_5)) {
                                                                sleep_time = multiply(sleep_time, TWO_INTEGER);
                                                            }
                                                            if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                                                Errors.warn($str_alt19$Forcing_timeout_of_NL_reformulato, com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon(), time);
                                                                com.cyc.cycjava.cycl.nl_reformulator.launch_or_restart_nl_reformulate_daemon();
                                                                hard_timeout_reachedP = T;
                                                            }
                                                        } 
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
                                hard_timeout_reachedP = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                        }
                    } else {
                        while (result.first() == $WORKING) {
                            sleep(sleep_time);
                            time = add(time, sleep_time);
                            if (sleep_time.numL($float$0_5)) {
                                sleep_time = multiply(sleep_time, TWO_INTEGER);
                            }
                            if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                Errors.warn($str_alt19$Forcing_timeout_of_NL_reformulato, com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon(), time);
                                com.cyc.cycjava.cycl.nl_reformulator.launch_or_restart_nl_reformulate_daemon();
                                hard_timeout_reachedP = T;
                            }
                        } 
                    }
                    parsing_timeout_timed_outP = NIL;
                }
                if (NIL == hard_timeout_reachedP) {
                    {
                        SubLObject datum_evaluated_var = result;
                        ans = datum_evaluated_var.first();
                        timed_outP = cadr(datum_evaluated_var);
                    }
                } else {
                    if (result.first() == $WORKING) {
                        Errors.warn($str_alt20$Forcing_timeout_of_NL_reformulato, com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon());
                        com.cyc.cycjava.cycl.nl_reformulator.launch_or_restart_nl_reformulate_daemon();
                    }
                }
                if ((NIL != parsing_timeout_timed_outP) || (NIL != hard_timeout_reachedP)) {
                    timed_outP = T;
                }
                if (NIL != hard_timeout_reachedP) {
                    Errors.warn($str_alt21$Hard_timeout_of__S_seconds_reache, hard_timeout, cycl, timeout);
                    timed_outP = T;
                } else {
                    if ((NIL != parsing_macros.parsing_timeout_time_reachedP()) && parsing_macros.parsing_timeout_time_passed_by().numG(ONE_INTEGER)) {
                        Errors.warn($str_alt22$Alloted_time_of__S_seconds_reache, hard_timeout, cycl, timeout);
                        timed_outP = T;
                    }
                }
                if (NIL != timed_outP) {
                    com.cyc.cycjava.cycl.nl_reformulator.remove_nl_reformulate_int_cached(cycl, mt, settings, UNPROVIDED);
                }
                $nl_reformulator_time$.setDynamicValue(add($nl_reformulator_time$.getDynamicValue(thread), time), thread);
                if (NIL != $nl_ref_show_reformulationsP$.getGlobalValue()) {
                    format(StreamsLow.$debug_io$.getDynamicValue(thread), $str_alt23$__Reformulated__S___to__S_in___3F, new SubLObject[]{ cycl, ans, time });
                    force_output(StreamsLow.$debug_io$.getDynamicValue(thread));
                }
                if (!ans.equal(cycl)) {
                    $nl_reformulations_simplified$.setDynamicValue(add($nl_reformulations_simplified$.getDynamicValue(thread), ONE_INTEGER), thread);
                }
                return values(ans, timed_outP);
            }
        }
    }

    /**
     * Try to simplify CYCL using the Cyc Reformulator
     */
    @LispMethod(comment = "Try to simplify CYCL using the Cyc Reformulator")
    public static SubLObject nl_reformulate(final SubLObject cycl, SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = parsing_macros.parsing_timeout_time_remaining();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        nl_reformulator.$nl_reformulations_total$.setDynamicValue(add(nl_reformulator.$nl_reformulations_total$.getDynamicValue(thread), ONE_INTEGER), thread);
        SubLObject parsing_timeout_timed_outP = NIL;
        final SubLObject mt = parsing_vars.$parsing_domain_mt$.getDynamicValue(thread);
        final SubLObject settings = nl_reformulator.$nl_reformulator_settings$.getDynamicValue(thread);
        final SubLObject hard_timeout = (NIL != timeout) ? number_utilities.maximum(list(multiply(nl_reformulator.$float$1_1, timeout), add(FIVE_INTEGER, timeout)), UNPROVIDED) : NIL;
        SubLObject hard_timeout_reachedP = NIL;
        SubLObject ans = copy_expression(cycl);
        SubLObject time = ZERO_INTEGER;
        SubLObject timed_outP = NIL;
        final SubLObject result = make_list(TWO_INTEGER, $UNKNOWN);
        SubLObject sleep_time = nl_reformulator.$float$0_001;
        final SubLObject semaphore = Semaphores.new_semaphore(process_name(current_process()), ZERO_INTEGER);
        nl_reformulator.nl_reformulate_enqueue(cycl, mt, settings, result, semaphore, timeout);
        Semaphores.semaphore_wait(semaphore);
        if (NIL != timeout) {
            final SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
            final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
            try {
                parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(timeout), thread);
                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                    if (NIL != hard_timeout) {
                        final SubLObject tag = with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$4 = $within_with_timeout$.currentBinding(thread);
                            try {
                                $within_with_timeout$.bind(T, thread);
                                SubLObject timer = NIL;
                                try {
                                    final SubLObject _prev_bind_0_$5 = $with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = with_timeout_start_timer(hard_timeout, tag);
                                        while (result.first() == $WORKING) {
                                            sleep(sleep_time);
                                            time = add(time, sleep_time);
                                            if (sleep_time.numL(nl_reformulator.$float$0_5)) {
                                                sleep_time = multiply(sleep_time, TWO_INTEGER);
                                            }
                                            if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                                Errors.warn(nl_reformulator.$str14$Forcing_timeout_of_NL_reformulato, nl_reformulator.nl_reformulate_daemon(), time);
                                                nl_reformulator.launch_or_restart_nl_reformulate_daemon();
                                                hard_timeout_reachedP = T;
                                            }
                                        } 
                                    } finally {
                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$5, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        with_timeout_stop_timer(timer);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            } finally {
                                $within_with_timeout$.rebind(_prev_bind_0_$4, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            hard_timeout_reachedP = Errors.handleThrowable(ccatch_env_var, tag);
                        } finally {
                            thread.throwStack.pop();
                        }
                    } else {
                        while (result.first() == $WORKING) {
                            sleep(sleep_time);
                            time = add(time, sleep_time);
                            if (sleep_time.numL(nl_reformulator.$float$0_5)) {
                                sleep_time = multiply(sleep_time, TWO_INTEGER);
                            }
                            if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                Errors.warn(nl_reformulator.$str14$Forcing_timeout_of_NL_reformulato, nl_reformulator.nl_reformulate_daemon(), time);
                                nl_reformulator.launch_or_restart_nl_reformulate_daemon();
                                hard_timeout_reachedP = T;
                            }
                        } 
                    }
                }
                parsing_timeout_timed_outP = parsing_macros.parsing_timeout_time_reachedP();
            } finally {
                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_3, thread);
                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_2, thread);
                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
            }
        } else {
            if (NIL != hard_timeout) {
                final SubLObject tag2 = with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag2);
                    final SubLObject _prev_bind_4 = $within_with_timeout$.currentBinding(thread);
                    try {
                        $within_with_timeout$.bind(T, thread);
                        SubLObject timer2 = NIL;
                        try {
                            final SubLObject _prev_bind_0_$7 = $with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer2 = with_timeout_start_timer(hard_timeout, tag2);
                                while (result.first() == $WORKING) {
                                    sleep(sleep_time);
                                    time = add(time, sleep_time);
                                    if (sleep_time.numL(nl_reformulator.$float$0_5)) {
                                        sleep_time = multiply(sleep_time, TWO_INTEGER);
                                    }
                                    if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                        Errors.warn(nl_reformulator.$str14$Forcing_timeout_of_NL_reformulato, nl_reformulator.nl_reformulate_daemon(), time);
                                        nl_reformulator.launch_or_restart_nl_reformulate_daemon();
                                        hard_timeout_reachedP = T;
                                    }
                                } 
                            } finally {
                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$7, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                with_timeout_stop_timer(timer2);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                    } finally {
                        $within_with_timeout$.rebind(_prev_bind_4, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    hard_timeout_reachedP = Errors.handleThrowable(ccatch_env_var2, tag2);
                } finally {
                    thread.throwStack.pop();
                }
            } else {
                while (result.first() == $WORKING) {
                    sleep(sleep_time);
                    time = add(time, sleep_time);
                    if (sleep_time.numL(nl_reformulator.$float$0_5)) {
                        sleep_time = multiply(sleep_time, TWO_INTEGER);
                    }
                    if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                        Errors.warn(nl_reformulator.$str14$Forcing_timeout_of_NL_reformulato, nl_reformulator.nl_reformulate_daemon(), time);
                        nl_reformulator.launch_or_restart_nl_reformulate_daemon();
                        hard_timeout_reachedP = T;
                    }
                } 
            }
            parsing_timeout_timed_outP = NIL;
        }
        if (NIL == hard_timeout_reachedP) {
            final SubLObject datum_evaluated_var = result;
            ans = datum_evaluated_var.first();
            timed_outP = cadr(datum_evaluated_var);
        } else
            if (result.first() == $WORKING) {
                Errors.warn(nl_reformulator.$str15$Forcing_timeout_of_NL_reformulato, nl_reformulator.nl_reformulate_daemon());
                nl_reformulator.launch_or_restart_nl_reformulate_daemon();
            }

        if ((NIL != parsing_timeout_timed_outP) || (NIL != hard_timeout_reachedP)) {
            timed_outP = T;
        }
        if (NIL != hard_timeout_reachedP) {
            Errors.warn(nl_reformulator.$str16$Hard_timeout_of__S_seconds_reache, hard_timeout, cycl, timeout);
            timed_outP = T;
        } else
            if ((NIL != parsing_macros.parsing_timeout_time_reachedP()) && parsing_macros.parsing_timeout_time_passed_by().numG(ONE_INTEGER)) {
                Errors.warn(nl_reformulator.$str17$Alloted_time_of__S_seconds_reache, hard_timeout, cycl, timeout);
                timed_outP = T;
            }

        if (NIL != timed_outP) {
            nl_reformulator.remove_nl_reformulate_int_cached(cycl, mt, settings, UNPROVIDED);
        }
        nl_reformulator.$nl_reformulator_time$.setDynamicValue(add(nl_reformulator.$nl_reformulator_time$.getDynamicValue(thread), time), thread);
        if (NIL != nl_reformulator.$nl_ref_show_reformulationsP$.getGlobalValue()) {
            format(StreamsLow.$debug_io$.getDynamicValue(thread), nl_reformulator.$str18$__Reformulated__S___to__S_in___3F, new SubLObject[]{ cycl, ans, time });
            force_output(StreamsLow.$debug_io$.getDynamicValue(thread));
        }
        if (!ans.equal(cycl)) {
            nl_reformulator.$nl_reformulations_simplified$.setDynamicValue(add(nl_reformulator.$nl_reformulations_simplified$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        return values(ans, timed_outP);
    }

    public static final SubLObject nl_reformulate_enqueue_alt(SubLObject cycl, SubLObject mt, SubLObject settings, SubLObject result, SubLObject semaphore, SubLObject hard_timeout) {
        if (hard_timeout == UNPROVIDED) {
            hard_timeout = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (result.first() != $UNKNOWN) {
                    Errors.error($str_alt25$NL_REFORMULATE_DAEMON_given_non_u, result);
                }
            }
            if (NIL == queues.queue_p($nl_reformulate_queue$.getGlobalValue())) {
                $nl_reformulate_queue$.setGlobalValue(queues.create_queue());
            }
            queues.enqueue(list(cycl, mt, settings, result, semaphore, hard_timeout), $nl_reformulate_queue$.getGlobalValue());
            com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon_maybe_warn_about_wait_time();
            set_nth(ZERO_INTEGER, result, $QUEUED);
            if (NIL != valid_process_p(com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon())) {
                process_unblock(com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon());
            } else {
                com.cyc.cycjava.cycl.nl_reformulator.launch_or_restart_nl_reformulate_daemon();
            }
            return $nl_reformulate_queue$.getGlobalValue();
        }
    }

    public static SubLObject nl_reformulate_enqueue(final SubLObject cycl, final SubLObject mt, final SubLObject settings, final SubLObject result, final SubLObject semaphore, SubLObject hard_timeout) {
        if (hard_timeout == UNPROVIDED) {
            hard_timeout = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (result.first() != $UNKNOWN)) {
            Errors.error(nl_reformulator.$str20$NL_REFORMULATE_DAEMON_given_non_u, result);
        }
        if (NIL == queues.queue_p(nl_reformulator.$nl_reformulate_queue$.getGlobalValue())) {
            nl_reformulator.$nl_reformulate_queue$.setGlobalValue(queues.create_queue(UNPROVIDED));
        }
        queues.enqueue(list(cycl, mt, settings, result, semaphore, hard_timeout), nl_reformulator.$nl_reformulate_queue$.getGlobalValue());
        nl_reformulator.nl_reformulate_daemon_maybe_warn_about_wait_time();
        set_nth(ZERO_INTEGER, result, $QUEUED);
        if (NIL != valid_process_p(nl_reformulator.nl_reformulate_daemon())) {
            process_unblock(nl_reformulator.nl_reformulate_daemon());
        } else {
            nl_reformulator.launch_or_restart_nl_reformulate_daemon();
        }
        return nl_reformulator.$nl_reformulate_queue$.getGlobalValue();
    }

    public static final SubLObject nl_reformulate_dequeue_alt() {
        if (NIL != queues.queue_p($nl_reformulate_queue$.getGlobalValue())) {
            return queues.dequeue($nl_reformulate_queue$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject nl_reformulate_dequeue() {
        if (NIL != queues.queue_p(nl_reformulator.$nl_reformulate_queue$.getGlobalValue())) {
            return queues.dequeue(nl_reformulator.$nl_reformulate_queue$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject nl_reformulate_daemon_alt() {
        return $nl_reformulate_daemon$.getGlobalValue();
    }

    public static SubLObject nl_reformulate_daemon() {
        return nl_reformulator.$nl_reformulate_daemon$.getGlobalValue();
    }

    public static final SubLObject nl_reformulate_daemon_maybe_warn_about_wait_time_alt() {
        if (NIL != com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon_busy_p()) {
            {
                SubLObject prior_request_count = queues.queue_size($nl_reformulate_queue$.getGlobalValue());
                Errors.warn($str_alt28$NL_Reformulator_Daemon_already_ha, prior_request_count);
                force_output(UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject nl_reformulate_daemon_maybe_warn_about_wait_time() {
        if (NIL != nl_reformulator.nl_reformulate_daemon_busy_p()) {
            final SubLObject prior_request_count = queues.queue_size(nl_reformulator.$nl_reformulate_queue$.getGlobalValue());
            Errors.warn(nl_reformulator.$str23$NL_Reformulator_Daemon_already_ha, prior_request_count);
            force_output(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject nl_reformulate_daemon_busy_p_alt() {
        return makeBoolean((NIL != processp(com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon())) && $$$Run.equalp(process_whostate(com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon())));
    }

    public static SubLObject nl_reformulate_daemon_busy_p() {
        return makeBoolean((NIL != processp(nl_reformulator.nl_reformulate_daemon())) && nl_reformulator.$$$Run.equalp(process_whostate(nl_reformulator.nl_reformulate_daemon())));
    }

    /**
     * What *NL-REFORMULATE-DAEMON* does.
     */
    @LispMethod(comment = "What *NL-REFORMULATE-DAEMON* does.")
    public static final SubLObject nl_reformulate_daemon_run_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = $within_nl_reformulate_daemon$.currentBinding(thread);
                        try {
                            $within_nl_reformulate_daemon$.bind(T, thread);
                            while (true) {
                                while (NIL != queues.queue_empty_p($nl_reformulate_queue$.getGlobalValue())) {
                                    process_block();
                                } 
                                {
                                    SubLObject hard_timeout_reachedP = NIL;
                                    SubLObject soft_timeout_reachedP = NIL;
                                    SubLObject soft_timeout = NIL;
                                    SubLObject datum = com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_dequeue();
                                    SubLObject current = datum;
                                    SubLObject cycl = NIL;
                                    SubLObject mt = NIL;
                                    SubLObject settings = NIL;
                                    SubLObject result = NIL;
                                    SubLObject semaphore = NIL;
                                    SubLObject hard_timeout = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt31);
                                    cycl = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt31);
                                    mt = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt31);
                                    settings = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt31);
                                    result = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt31);
                                    semaphore = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt31);
                                    hard_timeout = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        soft_timeout = (NIL != hard_timeout) ? ((SubLObject) (number_utilities.maximum(list(ONE_INTEGER, number_utilities.f_1_(hard_timeout)), UNPROVIDED))) : multiply($int$1000, $int$24, $int$3600);
                                        set_nth(ZERO_INTEGER, result, $WORKING);
                                        Semaphores.semaphore_signal(semaphore);
                                        if (NIL != hard_timeout) {
                                            {
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
                                                                            timer = with_timeout_start_timer(hard_timeout, tag);
                                                                            {
                                                                                SubLObject _prev_bind_0_11 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                                                                try {
                                                                                    parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                                                                    parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(soft_timeout), thread);
                                                                                    parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                                                                    parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                                                                    if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject reformulated = com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_int_cached(cycl, mt, settings, UNPROVIDED);
                                                                                            SubLObject timed_outP = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            set_nth(ZERO_INTEGER, result, reformulated);
                                                                                            set_nth(ONE_INTEGER, result, timed_outP);
                                                                                        }
                                                                                    }
                                                                                    soft_timeout_reachedP = parsing_macros.parsing_timeout_time_reachedP();
                                                                                } finally {
                                                                                    parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2, thread);
                                                                                    parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1, thread);
                                                                                    parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_11, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_10, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            with_timeout_stop_timer(timer);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            $within_with_timeout$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    hard_timeout_reachedP = Errors.handleThrowable(ccatch_env_var, tag);
                                                }
                                            }
                                        } else {
                                            {
                                                SubLObject _prev_bind_0_13 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                                try {
                                                    parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                                    parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(soft_timeout), thread);
                                                    parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                                    parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                                    if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject reformulated = com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_int_cached(cycl, mt, settings, UNPROVIDED);
                                                            SubLObject timed_outP = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            set_nth(ZERO_INTEGER, result, reformulated);
                                                            set_nth(ONE_INTEGER, result, timed_outP);
                                                        }
                                                    }
                                                    soft_timeout_reachedP = parsing_macros.parsing_timeout_time_reachedP();
                                                } finally {
                                                    parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_2, thread);
                                                    parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_1, thread);
                                                    parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_13, thread);
                                                }
                                            }
                                        }
                                        if ((NIL != hard_timeout_reachedP) || (NIL != soft_timeout_reachedP)) {
                                            set_nth(ZERO_INTEGER, result, $TIMED_OUT);
                                            set_nth(ONE_INTEGER, result, T);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt31);
                                    }
                                }
                            } 
                        } finally {
                            $within_nl_reformulate_daemon$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $NL_REFORMULATE_DAEMON_QUIT);
                }
            }
            return NIL;
        }
    }

    /**
     * What *NL-REFORMULATE-DAEMON* does.
     */
    @LispMethod(comment = "What *NL-REFORMULATE-DAEMON* does.")
    public static SubLObject nl_reformulate_daemon_run() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push(nl_reformulator.$NL_REFORMULATE_DAEMON_QUIT);
            final SubLObject _prev_bind_0 = nl_reformulator.$within_nl_reformulate_daemon$.currentBinding(thread);
            try {
                nl_reformulator.$within_nl_reformulate_daemon$.bind(T, thread);
                while (true) {
                    if (NIL != queues.queue_empty_p(nl_reformulator.$nl_reformulate_queue$.getGlobalValue())) {
                        process_block();
                    } else {
                        SubLObject hard_timeout_reachedP = NIL;
                        SubLObject soft_timeout_reachedP = NIL;
                        SubLObject error_message = NIL;
                        SubLObject soft_timeout = NIL;
                        SubLObject current;
                        final SubLObject datum = current = nl_reformulator.nl_reformulate_dequeue();
                        SubLObject cycl = NIL;
                        SubLObject mt = NIL;
                        SubLObject settings = NIL;
                        SubLObject result = NIL;
                        SubLObject semaphore = NIL;
                        SubLObject hard_timeout = NIL;
                        destructuring_bind_must_consp(current, datum, nl_reformulator.$list26);
                        cycl = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, nl_reformulator.$list26);
                        mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, nl_reformulator.$list26);
                        settings = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, nl_reformulator.$list26);
                        result = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, nl_reformulator.$list26);
                        semaphore = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, nl_reformulator.$list26);
                        hard_timeout = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        soft_timeout = (NIL != hard_timeout) ? number_utilities.maximum(list(ONE_INTEGER, number_utilities.f_1_(hard_timeout)), UNPROVIDED) : multiply($int$1000, nl_reformulator.$int$24, nl_reformulator.$int$3600);
                                        set_nth(ZERO_INTEGER, result, $WORKING);
                                        Semaphores.semaphore_signal(semaphore);
                                        if (NIL != hard_timeout) {
                                            final SubLObject tag = with_timeout_make_tag();
                                            try {
                                                thread.throwStack.push(tag);
                                                final SubLObject _prev_bind_0_$10 = $within_with_timeout$.currentBinding(thread);
                                                try {
                                                    $within_with_timeout$.bind(T, thread);
                                                    SubLObject timer = NIL;
                                                    try {
                                                        final SubLObject _prev_bind_0_$11 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                        try {
                                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                            timer = with_timeout_start_timer(hard_timeout, tag);
                                                            final SubLObject _prev_bind_0_$12 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                                            final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                                            try {
                                                                parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                                                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(soft_timeout), thread);
                                                                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                                                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                                                if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject reformulated = nl_reformulator.nl_reformulate_int_cached(cycl, mt, settings, UNPROVIDED);
                                                                    final SubLObject timed_outP = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    set_nth(ZERO_INTEGER, result, reformulated);
                                                                    set_nth(ONE_INTEGER, result, timed_outP);
                                                                }
                                                                soft_timeout_reachedP = parsing_macros.parsing_timeout_time_reachedP();
                                                            } finally {
                                                                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_3, thread);
                                                                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_2, thread);
                                                                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_$12, thread);
                                                            }
                                                        } finally {
                                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$11, thread);
                                                        }
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            with_timeout_stop_timer(timer);
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                                        }
                                                    }
                                                } finally {
                                                    $within_with_timeout$.rebind(_prev_bind_0_$10, thread);
                                                }
                                            } catch (final Throwable ccatch_env_var) {
                                                hard_timeout_reachedP = Errors.handleThrowable(ccatch_env_var, tag);
                                            } finally {
                                                thread.throwStack.pop();
                                            }
                                        } else {
                                            final SubLObject _prev_bind_0_$14 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                            final SubLObject _prev_bind_4 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                            final SubLObject _prev_bind_5 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                            try {
                                                parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                                                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(soft_timeout), thread);
                                                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                                if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject reformulated2 = nl_reformulator.nl_reformulate_int_cached(cycl, mt, settings, UNPROVIDED);
                                                    final SubLObject timed_outP2 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    set_nth(ZERO_INTEGER, result, reformulated2);
                                                    set_nth(ONE_INTEGER, result, timed_outP2);
                                                }
                                                soft_timeout_reachedP = parsing_macros.parsing_timeout_time_reachedP();
                                            } finally {
                                                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_5, thread);
                                                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_4, thread);
                                                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_$14, thread);
                                            }
                                        }
                                    } catch (final Throwable catch_var_$15) {
                                        Errors.handleThrowable(catch_var_$15, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                                }
                            } catch (final Throwable ccatch_env_var2) {
                                error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            if ((NIL != hard_timeout_reachedP) || (NIL != soft_timeout_reachedP)) {
                                set_nth(ZERO_INTEGER, result, $TIMED_OUT);
                                set_nth(ONE_INTEGER, result, T);
                            } else {
                                if (NIL == error_message) {
                                    continue;
                                }
                                set_nth(ZERO_INTEGER, result, $ERROR);
                                set_nth(ONE_INTEGER, result, error_message);
                            }
                        } else {
                            cdestructuring_bind_error(datum, nl_reformulator.$list26);
                        }
                    }
                } 
            } finally {
                nl_reformulator.$within_nl_reformulate_daemon$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var3) {
            catch_var = Errors.handleThrowable(ccatch_env_var3, nl_reformulator.$NL_REFORMULATE_DAEMON_QUIT);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static final SubLObject launch_or_restart_nl_reformulate_daemon_alt() {
        {
            SubLObject daemon = com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon();
            if (NIL != valid_process_p(daemon)) {
                Errors.warn($str_alt36$Aborting__S, daemon);
                com.cyc.cycjava.cycl.nl_reformulator.abort_nl_reformulate_daemon(daemon);
                if (NIL != valid_process_p(daemon)) {
                    Errors.warn($str_alt37$_S_didn_t_die_immediately_, daemon);
                    sleep(ONE_INTEGER);
                    if (NIL != valid_process_p(daemon)) {
                        Errors.warn($str_alt38$_S_didn_t_die_after_1_second__Att, daemon);
                        kill_process(daemon);
                        if (NIL != valid_process_p(daemon)) {
                            Errors.warn($str_alt39$_S_still_didn_t_die_immediately_, daemon);
                            sleep(ONE_INTEGER);
                            if (NIL != valid_process_p(daemon)) {
                                Errors.sublisp_break($str_alt40$_S_didn_t_die_after_1_second_, new SubLObject[]{ daemon });
                            } else {
                                format(T, $str_alt41$OK__Now_it_s_dead___S, daemon);
                            }
                        }
                    }
                }
            }
        }
        $nl_reformulate_daemon$.setGlobalValue(process_utilities.make_cyc_server_process_with_args($$$NL_Reformulate_Daemon, symbol_function(NL_REFORMULATE_DAEMON_RUN), UNPROVIDED));
        return com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon();
    }

    public static SubLObject launch_or_restart_nl_reformulate_daemon() {
        final SubLObject daemon = nl_reformulator.nl_reformulate_daemon();
        if (NIL != valid_process_p(daemon)) {
            Errors.warn(nl_reformulator.$str33$Aborting__S, daemon);
            nl_reformulator.abort_nl_reformulate_daemon(daemon);
            if (NIL != valid_process_p(daemon)) {
                Errors.warn(nl_reformulator.$str34$_S_didn_t_die_immediately_, daemon);
                sleep(ONE_INTEGER);
                if (NIL != valid_process_p(daemon)) {
                    Errors.warn(nl_reformulator.$str35$_S_didn_t_die_after_1_second__Att, daemon);
                    kill_process(daemon);
                    if (NIL != valid_process_p(daemon)) {
                        Errors.warn(nl_reformulator.$str36$_S_still_didn_t_die_immediately_, daemon);
                        sleep(ONE_INTEGER);
                        if (NIL != valid_process_p(daemon)) {
                            Errors.sublisp_break(nl_reformulator.$str37$_S_didn_t_die_after_1_second_, new SubLObject[]{ daemon });
                        } else {
                            format(T, nl_reformulator.$str38$OK__Now_it_s_dead___S, daemon);
                        }
                    }
                }
            }
        }
        nl_reformulator.$nl_reformulate_daemon$.setGlobalValue(process_utilities.make_cyc_server_process_with_args(nl_reformulator.$$$NL_Reformulate_Daemon, symbol_function(nl_reformulator.NL_REFORMULATE_DAEMON_RUN), UNPROVIDED));
        return nl_reformulator.nl_reformulate_daemon();
    }

    /**
     * Explicitly quit this NL Reformulate daemon
     */
    @LispMethod(comment = "Explicitly quit this NL Reformulate daemon")
    public static final SubLObject nl_reformulate_daemon_quit_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $within_nl_reformulate_daemon$.getDynamicValue(thread)) {
                sublisp_throw($NL_REFORMULATE_DAEMON_QUIT, NIL);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Explicitly quit this NL Reformulate daemon")
    public static SubLObject nl_reformulate_daemon_quit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nl_reformulator.$within_nl_reformulate_daemon$.getDynamicValue(thread)) {
            sublisp_throw(nl_reformulator.$NL_REFORMULATE_DAEMON_QUIT, NIL);
        }
        return NIL;
    }/**
     * Explicitly quit this NL Reformulate daemon
     */


    public static final SubLObject abort_nl_reformulate_daemon_alt(SubLObject process) {
        if (process == UNPROVIDED) {
            process = com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_daemon();
        }
        return interrupt_process(process, symbol_function(NL_REFORMULATE_DAEMON_QUIT));
    }

    public static SubLObject abort_nl_reformulate_daemon(SubLObject process) {
        if (process == UNPROVIDED) {
            process = nl_reformulator.nl_reformulate_daemon();
        }
        return interrupt_process(process, symbol_function(nl_reformulator.NL_REFORMULATE_DAEMON_QUIT));
    }

    public static final SubLObject clear_nl_reformulator_caches_alt() {
        com.cyc.cycjava.cycl.nl_reformulator.clear_nl_reformulate_int_cached();
        return NIL;
    }

    public static SubLObject clear_nl_reformulator_caches() {
        nl_reformulator.clear_nl_reformulate_int_cached();
        return NIL;
    }

    /**
     * Add MODULES to the list of currently ignored reformulator modules.
     */
    @LispMethod(comment = "Add MODULES to the list of currently ignored reformulator modules.")
    public static final SubLObject skipping_nl_reformulator_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_modules = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt45);
            v_modules = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($nl_reformulator_settings$, list(NL_REF_REMOVE_MODULES, v_modules))), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Add MODULES to the list of currently ignored reformulator modules.")
    public static SubLObject skipping_nl_reformulator_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_modules = NIL;
        destructuring_bind_must_consp(current, datum, nl_reformulator.$list42);
        v_modules = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list(nl_reformulator.$nl_reformulator_settings$, list(nl_reformulator.NL_REF_REMOVE_MODULES, v_modules))), append(body, NIL));
    }/**
     * Add MODULES to the list of currently ignored reformulator modules.
     */


    /**
     *
     *
     * @return LISTP *NL-REFORMULATOR-SETTINGS* plus the additional directive
    to skip MODULES.
     */
    @LispMethod(comment = "@return LISTP *NL-REFORMULATOR-SETTINGS* plus the additional directive\r\nto skip MODULES.")
    public static final SubLObject nl_ref_remove_modules_alt(SubLObject v_modules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dir = $IGNORE_RL_MODULES;
                SubLObject settings = $nl_reformulator_settings$.getDynamicValue(thread);
                if (NIL != find(dir, settings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject pos = position(dir, settings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject current = nth(number_utilities.f_1X(pos), settings);
                        SubLObject v_new = union(v_modules, current, UNPROVIDED, UNPROVIDED);
                        settings = subst(v_new, current, settings, symbol_function(EQUAL), UNPROVIDED);
                    }
                } else {
                    settings = cons(v_modules, settings);
                    settings = cons(dir, settings);
                }
                return settings;
            }
        }
    }

    /**
     *
     *
     * @return LISTP *NL-REFORMULATOR-SETTINGS* plus the additional directive
    to skip MODULES.
     */
    @LispMethod(comment = "@return LISTP *NL-REFORMULATOR-SETTINGS* plus the additional directive\r\nto skip MODULES.")
    public static SubLObject nl_ref_remove_modules(final SubLObject v_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dir = nl_reformulator.$IGNORE_RL_MODULES;
        SubLObject settings = nl_reformulator.$nl_reformulator_settings$.getDynamicValue(thread);
        if (NIL != find(dir, settings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject pos = position(dir, settings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject current = nth(number_utilities.f_1X(pos), settings);
            final SubLObject v_new = union(v_modules, current, UNPROVIDED, UNPROVIDED);
            settings = subst(v_new, current, settings, symbol_function(EQUAL), UNPROVIDED);
        } else {
            settings = cons(v_modules, settings);
            settings = cons(dir, settings);
        }
        return settings;
    }

    public static final SubLObject clear_nl_reformulate_int_cached_alt() {
        {
            SubLObject cs = $nl_reformulate_int_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_nl_reformulate_int_cached() {
        final SubLObject cs = nl_reformulator.$nl_reformulate_int_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_nl_reformulate_int_cached_alt(SubLObject cycl, SubLObject mt, SubLObject settings, SubLObject evaluate_resultsP) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
        }
        if (settings == UNPROVIDED) {
            settings = $nl_reformulator_settings$.getDynamicValue();
        }
        if (evaluate_resultsP == UNPROVIDED) {
            evaluate_resultsP = parsing_vars.$evaluate_nl_reformulator_resultsP$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($nl_reformulate_int_cached_caching_state$.getGlobalValue(), list(cycl, mt, settings, evaluate_resultsP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_nl_reformulate_int_cached(final SubLObject cycl, SubLObject mt, SubLObject settings, SubLObject evaluate_resultsP) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
        }
        if (settings == UNPROVIDED) {
            settings = nl_reformulator.$nl_reformulator_settings$.getDynamicValue();
        }
        if (evaluate_resultsP == UNPROVIDED) {
            evaluate_resultsP = parsing_vars.$evaluate_nl_reformulator_resultsP$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(nl_reformulator.$nl_reformulate_int_cached_caching_state$.getGlobalValue(), list(cycl, mt, settings, evaluate_resultsP), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Private cached implementation of NL-REFORMULATE
     */
    @LispMethod(comment = "Private cached implementation of NL-REFORMULATE")
    public static final SubLObject nl_reformulate_int_cached_internal_alt(SubLObject cycl, SubLObject mt, SubLObject settings, SubLObject evaluate_resultsP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time_remaining = parsing_macros.parsing_timeout_time_remaining();
                SubLObject timed_outP = eql(ZERO_INTEGER, time_remaining);
                SubLObject new_cycl = cycl;
                SubLObject reformulator_settings = append(list($MAX_TIME, time_remaining), settings);
                if (NIL == timed_outP) {
                    {
                        SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
                        try {
                            wff_vars.$permit_keyword_variablesP$.bind(T, thread);
                            if ((NIL != list_utilities.proper_list_p(cycl)) && (NIL != find_if(symbol_function(LISTP), cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                {
                                    SubLObject first_pass = NIL;
                                    if (NIL == timed_outP) {
                                        {
                                            SubLObject csome_list_var = cycl;
                                            SubLObject item = NIL;
                                            for (item = csome_list_var.first(); !((NIL != timed_outP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject new_item = com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_int_cached(item, mt, settings, UNPROVIDED);
                                                    SubLObject timeP = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != timeP) {
                                                        timed_outP = T;
                                                    } else {
                                                        first_pass = cons(new_item, first_pass);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == timed_outP) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject reformulated_cycl = reformulator_hub.reformulate_cycl(nreverse(first_pass), mt, reformulator_settings);
                                            SubLObject justifications = thread.secondMultipleValue();
                                            SubLObject max_time = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            new_cycl = reformulated_cycl;
                                            if (NIL != max_time) {
                                                timed_outP = T;
                                            }
                                        }
                                    }
                                }
                            } else {
                                thread.resetMultipleValues();
                                {
                                    SubLObject reformulated_cycl = reformulator_hub.reformulate_cycl(cycl, mt, reformulator_settings);
                                    SubLObject justifications = thread.secondMultipleValue();
                                    SubLObject max_time = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    new_cycl = reformulated_cycl;
                                    if (NIL != max_time) {
                                        timed_outP = T;
                                    }
                                }
                            }
                            if (NIL != evaluate_resultsP) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject evaluated = relation_evaluation.cyc_evaluate(new_cycl);
                                    SubLObject evaluatedP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != evaluatedP) {
                                        new_cycl = evaluated;
                                    }
                                }
                            }
                        } finally {
                            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return values(new_cycl, timed_outP);
            }
        }
    }

    @LispMethod(comment = "Private cached implementation of NL-REFORMULATE")
    public static SubLObject nl_reformulate_int_cached_internal(final SubLObject cycl, final SubLObject mt, final SubLObject settings, final SubLObject evaluate_resultsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time_remaining = parsing_macros.parsing_timeout_time_remaining();
        SubLObject timed_outP = eql(ZERO_INTEGER, time_remaining);
        SubLObject new_cycl = cycl;
        final SubLObject reformulator_settings = append(list($MAX_TIME, time_remaining), settings);
        if (NIL == timed_outP) {
            final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
            try {
                wff_vars.$permit_keyword_variablesP$.bind(T, thread);
                if ((NIL != list_utilities.proper_list_p(cycl)) && (NIL != find_if(symbol_function(LISTP), cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    SubLObject first_pass = NIL;
                    if (NIL == timed_outP) {
                        SubLObject csome_list_var = cycl;
                        SubLObject item = NIL;
                        item = csome_list_var.first();
                        while ((NIL == timed_outP) && (NIL != csome_list_var)) {
                            thread.resetMultipleValues();
                            final SubLObject new_item = nl_reformulator.nl_reformulate_int_cached(item, mt, settings, UNPROVIDED);
                            final SubLObject timeP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != timeP) {
                                timed_outP = T;
                            } else {
                                first_pass = cons(new_item, first_pass);
                            }
                            csome_list_var = csome_list_var.rest();
                            item = csome_list_var.first();
                        } 
                    }
                    if (NIL == timed_outP) {
                        thread.resetMultipleValues();
                        final SubLObject reformulated_cycl = reformulator_hub.reformulate_cycl(nreverse(first_pass), mt, reformulator_settings);
                        final SubLObject justifications = thread.secondMultipleValue();
                        final SubLObject max_time = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        new_cycl = reformulated_cycl;
                        if (NIL != max_time) {
                            timed_outP = T;
                        }
                    }
                } else {
                    thread.resetMultipleValues();
                    final SubLObject reformulated_cycl2 = reformulator_hub.reformulate_cycl(cycl, mt, reformulator_settings);
                    final SubLObject justifications2 = thread.secondMultipleValue();
                    final SubLObject max_time2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    new_cycl = reformulated_cycl2;
                    if (NIL != max_time2) {
                        timed_outP = T;
                    }
                }
                if (NIL != evaluate_resultsP) {
                    thread.resetMultipleValues();
                    final SubLObject evaluated = relation_evaluation.cyc_evaluate(new_cycl);
                    final SubLObject evaluatedP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != evaluatedP) {
                        new_cycl = evaluated;
                    }
                }
            } finally {
                wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
            }
        }
        return values(new_cycl, timed_outP);
    }/**
     * Private cached implementation of NL-REFORMULATE
     */


    public static final SubLObject nl_reformulate_int_cached_alt(SubLObject cycl, SubLObject mt, SubLObject settings, SubLObject evaluate_resultsP) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
        }
        if (settings == UNPROVIDED) {
            settings = $nl_reformulator_settings$.getDynamicValue();
        }
        if (evaluate_resultsP == UNPROVIDED) {
            evaluate_resultsP = parsing_vars.$evaluate_nl_reformulator_resultsP$.getDynamicValue();
        }
        {
            SubLObject caching_state = $nl_reformulate_int_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(NL_REFORMULATE_INT_CACHED, $nl_reformulate_int_cached_caching_state$, $int$256, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_4(cycl, mt, settings, evaluate_resultsP);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw54$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (cycl.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (mt.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (settings.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && evaluate_resultsP.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.nl_reformulator.nl_reformulate_int_cached_internal(cycl, mt, settings, evaluate_resultsP)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cycl, mt, settings, evaluate_resultsP));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject nl_reformulate_int_cached(final SubLObject cycl, SubLObject mt, SubLObject settings, SubLObject evaluate_resultsP) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
        }
        if (settings == UNPROVIDED) {
            settings = nl_reformulator.$nl_reformulator_settings$.getDynamicValue();
        }
        if (evaluate_resultsP == UNPROVIDED) {
            evaluate_resultsP = parsing_vars.$evaluate_nl_reformulator_resultsP$.getDynamicValue();
        }
        SubLObject caching_state = nl_reformulator.$nl_reformulate_int_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(nl_reformulator.NL_REFORMULATE_INT_CACHED, nl_reformulator.$nl_reformulate_int_cached_caching_state$, $int$256, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(cycl, mt, settings, evaluate_resultsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cycl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (settings.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && evaluate_resultsP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(nl_reformulator.nl_reformulate_int_cached_internal(cycl, mt, settings, evaluate_resultsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl, mt, settings, evaluate_resultsP));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject declare_nl_reformulator_file_alt() {
        declareFunction("get_nl_reformulator_time", "GET-NL-REFORMULATOR-TIME", 0, 0, false);
        declareFunction("nl_ref_reset_metrics", "NL-REF-RESET-METRICS", 0, 0, false);
        declareFunction("nl_ref_report_metrics", "NL-REF-REPORT-METRICS", 0, 1, false);
        declareMacro("memoizing_nl_reformulator", "MEMOIZING-NL-REFORMULATOR");
        declareFunction("nl_reformulate_cycls", "NL-REFORMULATE-CYCLS", 1, 0, false);
        declareFunction("add_or_change_nl_reformulator_settings", "ADD-OR-CHANGE-NL-REFORMULATOR-SETTINGS", 2, 0, false);
        declareMacro("possibly_with_timeout", "POSSIBLY-WITH-TIMEOUT");
        declareFunction("nl_reformulate", "NL-REFORMULATE", 1, 1, false);
        declareFunction("nl_reformulate_enqueue", "NL-REFORMULATE-ENQUEUE", 5, 1, false);
        declareFunction("nl_reformulate_dequeue", "NL-REFORMULATE-DEQUEUE", 0, 0, false);
        declareFunction("nl_reformulate_daemon", "NL-REFORMULATE-DAEMON", 0, 0, false);
        declareFunction("nl_reformulate_daemon_maybe_warn_about_wait_time", "NL-REFORMULATE-DAEMON-MAYBE-WARN-ABOUT-WAIT-TIME", 0, 0, false);
        declareFunction("nl_reformulate_daemon_busy_p", "NL-REFORMULATE-DAEMON-BUSY-P", 0, 0, false);
        declareFunction("nl_reformulate_daemon_run", "NL-REFORMULATE-DAEMON-RUN", 0, 0, false);
        declareFunction("launch_or_restart_nl_reformulate_daemon", "LAUNCH-OR-RESTART-NL-REFORMULATE-DAEMON", 0, 0, false);
        declareFunction("nl_reformulate_daemon_quit", "NL-REFORMULATE-DAEMON-QUIT", 0, 0, false);
        declareFunction("abort_nl_reformulate_daemon", "ABORT-NL-REFORMULATE-DAEMON", 0, 1, false);
        declareFunction("clear_nl_reformulator_caches", "CLEAR-NL-REFORMULATOR-CACHES", 0, 0, false);
        declareMacro("skipping_nl_reformulator_modules", "SKIPPING-NL-REFORMULATOR-MODULES");
        declareFunction("nl_ref_remove_modules", "NL-REF-REMOVE-MODULES", 1, 0, false);
        declareFunction("clear_nl_reformulate_int_cached", "CLEAR-NL-REFORMULATE-INT-CACHED", 0, 0, false);
        declareFunction("remove_nl_reformulate_int_cached", "REMOVE-NL-REFORMULATE-INT-CACHED", 1, 3, false);
        declareFunction("nl_reformulate_int_cached_internal", "NL-REFORMULATE-INT-CACHED-INTERNAL", 4, 0, false);
        declareFunction("nl_reformulate_int_cached", "NL-REFORMULATE-INT-CACHED", 1, 3, false);
        return NIL;
    }

    public static SubLObject declare_nl_reformulator_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("get_nl_reformulator_time", "GET-NL-REFORMULATOR-TIME", 0, 0, false);
            declareFunction("nl_ref_reset_metrics", "NL-REF-RESET-METRICS", 0, 0, false);
            declareFunction("nl_ref_report_metrics", "NL-REF-REPORT-METRICS", 0, 1, false);
            declareMacro("memoizing_nl_reformulator", "MEMOIZING-NL-REFORMULATOR");
            declareFunction("nl_reformulate_cycls", "NL-REFORMULATE-CYCLS", 1, 0, false);
            declareFunction("add_or_change_nl_reformulator_settings", "ADD-OR-CHANGE-NL-REFORMULATOR-SETTINGS", 2, 0, false);
            declareFunction("nl_reformulate", "NL-REFORMULATE", 1, 1, false);
            declareFunction("nl_reformulate_enqueue", "NL-REFORMULATE-ENQUEUE", 5, 1, false);
            declareFunction("nl_reformulate_dequeue", "NL-REFORMULATE-DEQUEUE", 0, 0, false);
            declareFunction("nl_reformulate_daemon", "NL-REFORMULATE-DAEMON", 0, 0, false);
            declareFunction("nl_reformulate_daemon_maybe_warn_about_wait_time", "NL-REFORMULATE-DAEMON-MAYBE-WARN-ABOUT-WAIT-TIME", 0, 0, false);
            declareFunction("nl_reformulate_daemon_busy_p", "NL-REFORMULATE-DAEMON-BUSY-P", 0, 0, false);
            declareFunction("nl_reformulate_daemon_run", "NL-REFORMULATE-DAEMON-RUN", 0, 0, false);
            declareFunction("launch_or_restart_nl_reformulate_daemon", "LAUNCH-OR-RESTART-NL-REFORMULATE-DAEMON", 0, 0, false);
            declareFunction("nl_reformulate_daemon_quit", "NL-REFORMULATE-DAEMON-QUIT", 0, 0, false);
            declareFunction("abort_nl_reformulate_daemon", "ABORT-NL-REFORMULATE-DAEMON", 0, 1, false);
            declareFunction("clear_nl_reformulator_caches", "CLEAR-NL-REFORMULATOR-CACHES", 0, 0, false);
            declareMacro("skipping_nl_reformulator_modules", "SKIPPING-NL-REFORMULATOR-MODULES");
            declareFunction("nl_ref_remove_modules", "NL-REF-REMOVE-MODULES", 1, 0, false);
            declareFunction("clear_nl_reformulate_int_cached", "CLEAR-NL-REFORMULATE-INT-CACHED", 0, 0, false);
            declareFunction("remove_nl_reformulate_int_cached", "REMOVE-NL-REFORMULATE-INT-CACHED", 1, 3, false);
            declareFunction("nl_reformulate_int_cached_internal", "NL-REFORMULATE-INT-CACHED-INTERNAL", 4, 0, false);
            declareFunction("nl_reformulate_int_cached", "NL-REFORMULATE-INT-CACHED", 1, 3, false);
        }
        if (SubLFiles.USE_V2) {
            declareMacro("possibly_with_timeout", "POSSIBLY-WITH-TIMEOUT");
        }
        return NIL;
    }

    public static SubLObject declare_nl_reformulator_file_Previous() {
        declareFunction("get_nl_reformulator_time", "GET-NL-REFORMULATOR-TIME", 0, 0, false);
        declareFunction("nl_ref_reset_metrics", "NL-REF-RESET-METRICS", 0, 0, false);
        declareFunction("nl_ref_report_metrics", "NL-REF-REPORT-METRICS", 0, 1, false);
        declareMacro("memoizing_nl_reformulator", "MEMOIZING-NL-REFORMULATOR");
        declareFunction("nl_reformulate_cycls", "NL-REFORMULATE-CYCLS", 1, 0, false);
        declareFunction("add_or_change_nl_reformulator_settings", "ADD-OR-CHANGE-NL-REFORMULATOR-SETTINGS", 2, 0, false);
        declareFunction("nl_reformulate", "NL-REFORMULATE", 1, 1, false);
        declareFunction("nl_reformulate_enqueue", "NL-REFORMULATE-ENQUEUE", 5, 1, false);
        declareFunction("nl_reformulate_dequeue", "NL-REFORMULATE-DEQUEUE", 0, 0, false);
        declareFunction("nl_reformulate_daemon", "NL-REFORMULATE-DAEMON", 0, 0, false);
        declareFunction("nl_reformulate_daemon_maybe_warn_about_wait_time", "NL-REFORMULATE-DAEMON-MAYBE-WARN-ABOUT-WAIT-TIME", 0, 0, false);
        declareFunction("nl_reformulate_daemon_busy_p", "NL-REFORMULATE-DAEMON-BUSY-P", 0, 0, false);
        declareFunction("nl_reformulate_daemon_run", "NL-REFORMULATE-DAEMON-RUN", 0, 0, false);
        declareFunction("launch_or_restart_nl_reformulate_daemon", "LAUNCH-OR-RESTART-NL-REFORMULATE-DAEMON", 0, 0, false);
        declareFunction("nl_reformulate_daemon_quit", "NL-REFORMULATE-DAEMON-QUIT", 0, 0, false);
        declareFunction("abort_nl_reformulate_daemon", "ABORT-NL-REFORMULATE-DAEMON", 0, 1, false);
        declareFunction("clear_nl_reformulator_caches", "CLEAR-NL-REFORMULATOR-CACHES", 0, 0, false);
        declareMacro("skipping_nl_reformulator_modules", "SKIPPING-NL-REFORMULATOR-MODULES");
        declareFunction("nl_ref_remove_modules", "NL-REF-REMOVE-MODULES", 1, 0, false);
        declareFunction("clear_nl_reformulate_int_cached", "CLEAR-NL-REFORMULATE-INT-CACHED", 0, 0, false);
        declareFunction("remove_nl_reformulate_int_cached", "REMOVE-NL-REFORMULATE-INT-CACHED", 1, 3, false);
        declareFunction("nl_reformulate_int_cached_internal", "NL-REFORMULATE-INT-CACHED-INTERNAL", 4, 0, false);
        declareFunction("nl_reformulate_int_cached", "NL-REFORMULATE-INT-CACHED", 1, 3, false);
        return NIL;
    }

    public static final SubLObject init_nl_reformulator_file_alt() {
        defparameter("*NL-REFORMULATOR-TIME*", ZERO_INTEGER);
        defparameter("*NL-REFORMULATIONS-TOTAL*", ZERO_INTEGER);
        defparameter("*NL-REFORMULATIONS-SIMPLIFIED*", ZERO_INTEGER);
        deflexical("*NL-REF-SHOW-REFORMULATIONS?*", NIL);
        defvar("*NL-REFORMULATOR-SETTINGS*", NIL);
        deflexical("*NL-REFORMULATE-QUEUE*", NIL != boundp($nl_reformulate_queue$) ? ((SubLObject) ($nl_reformulate_queue$.getGlobalValue())) : NIL);
        deflexical("*NL-REFORMULATE-DAEMON*", NIL != boundp($nl_reformulate_daemon$) ? ((SubLObject) ($nl_reformulate_daemon$.getGlobalValue())) : NIL);
        defparameter("*WITHIN-NL-REFORMULATE-DAEMON*", NIL);
        deflexical("*NL-REFORMULATE-INT-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_nl_reformulator_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*NL-REFORMULATOR-TIME*", ZERO_INTEGER);
            defparameter("*NL-REFORMULATIONS-TOTAL*", ZERO_INTEGER);
            defparameter("*NL-REFORMULATIONS-SIMPLIFIED*", ZERO_INTEGER);
            deflexical("*NL-REF-SHOW-REFORMULATIONS?*", NIL);
            defvar("*NL-REFORMULATOR-SETTINGS*", NIL);
            deflexical("*NL-REFORMULATE-QUEUE*", SubLTrampolineFile.maybeDefault(nl_reformulator.$nl_reformulate_queue$, nl_reformulator.$nl_reformulate_queue$, NIL));
            deflexical("*NL-REFORMULATE-DAEMON*", SubLTrampolineFile.maybeDefault(nl_reformulator.$nl_reformulate_daemon$, nl_reformulator.$nl_reformulate_daemon$, NIL));
            defparameter("*WITHIN-NL-REFORMULATE-DAEMON*", NIL);
            deflexical("*NL-REFORMULATE-INT-CACHED-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*NL-REFORMULATE-QUEUE*", NIL != boundp($nl_reformulate_queue$) ? ((SubLObject) ($nl_reformulate_queue$.getGlobalValue())) : NIL);
            deflexical("*NL-REFORMULATE-DAEMON*", NIL != boundp($nl_reformulate_daemon$) ? ((SubLObject) ($nl_reformulate_daemon$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_nl_reformulator_file_Previous() {
        defparameter("*NL-REFORMULATOR-TIME*", ZERO_INTEGER);
        defparameter("*NL-REFORMULATIONS-TOTAL*", ZERO_INTEGER);
        defparameter("*NL-REFORMULATIONS-SIMPLIFIED*", ZERO_INTEGER);
        deflexical("*NL-REF-SHOW-REFORMULATIONS?*", NIL);
        defvar("*NL-REFORMULATOR-SETTINGS*", NIL);
        deflexical("*NL-REFORMULATE-QUEUE*", SubLTrampolineFile.maybeDefault(nl_reformulator.$nl_reformulate_queue$, nl_reformulator.$nl_reformulate_queue$, NIL));
        deflexical("*NL-REFORMULATE-DAEMON*", SubLTrampolineFile.maybeDefault(nl_reformulator.$nl_reformulate_daemon$, nl_reformulator.$nl_reformulate_daemon$, NIL));
        defparameter("*WITHIN-NL-REFORMULATE-DAEMON*", NIL);
        deflexical("*NL-REFORMULATE-INT-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_nl_reformulator_file() {
        declare_defglobal(nl_reformulator.$nl_reformulate_queue$);
        declare_defglobal(nl_reformulator.$nl_reformulate_daemon$);
        memoization_state.note_globally_cached_function(nl_reformulator.NL_REFORMULATE_INT_CACHED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        nl_reformulator.declare_nl_reformulator_file();
    }

    @Override
    public void initializeVariables() {
        nl_reformulator.init_nl_reformulator_file();
    }

    @Override
    public void runTopLevelForms() {
        nl_reformulator.setup_nl_reformulator_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$__Spent__4_2F_seconds_reformulati = makeString("~&Spent ~4,2F seconds reformulating.");

    static private final SubLString $str_alt1$__D_of__D_items_passed_through_th = makeString(" ~D of ~D items passed through the Reformulator were simplified.~%");

    static private final SubLList $list_alt4 = list(list(makeSymbol("*NL-REFORMULATOR-SETTINGS*"), list(makeSymbol("ADD-OR-CHANGE-NL-REFORMULATOR-SETTINGS"), makeKeyword("CLEAR-CACHES?"), makeKeyword("FALSE"))));

    static private final SubLString $str_alt6$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    public static final SubLSymbol $kw7$CLEAR_CACHES_ = makeKeyword("CLEAR-CACHES?");

    static private final SubLList $list_alt10 = list(list(makeSymbol("TIMEOUT"), makeSymbol("TIMED-OUT?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt19$Forcing_timeout_of_NL_reformulato = makeString("Forcing timeout of NL reformulator daemon ~S after ~S seconds");

    static private final SubLString $str_alt20$Forcing_timeout_of_NL_reformulato = makeString("Forcing timeout of NL reformulator daemon ~S after hard timeout");

    static private final SubLString $str_alt21$Hard_timeout_of__S_seconds_reache = makeString("Hard timeout of ~S seconds reached in~% (NL-REFORMULATE ~S ~S)");

    static private final SubLString $str_alt22$Alloted_time_of__S_seconds_reache = makeString("Alloted time of ~S seconds reached in~% (NL-REFORMULATE ~S ~S)");

    static private final SubLString $str_alt23$__Reformulated__S___to__S_in___3F = makeString("~&Reformulated ~S~% to ~S in ~,3F seconds.~%");

    static private final SubLString $str_alt25$NL_REFORMULATE_DAEMON_given_non_u = makeString("NL-REFORMULATE-DAEMON given non-unknown result: ~S");

    static private final SubLString $str_alt28$NL_Reformulator_Daemon_already_ha = makeString("NL Reformulator Daemon already has ~S request(s) queued up. This may take a little while.");

    static private final SubLList $list_alt31 = list(makeSymbol("CYCL"), makeSymbol("MT"), makeSymbol("SETTINGS"), makeSymbol("RESULT"), makeSymbol("SEMAPHORE"), makeSymbol("HARD-TIMEOUT"));

    static private final SubLString $str_alt36$Aborting__S = makeString("Aborting ~S");

    static private final SubLString $str_alt37$_S_didn_t_die_immediately_ = makeString("~S didn't die immediately.");

    static private final SubLString $str_alt38$_S_didn_t_die_after_1_second__Att = makeString("~S didn't die after 1 second. Attempting KILL-PROCESS...");

    static private final SubLString $str_alt39$_S_still_didn_t_die_immediately_ = makeString("~S still didn't die immediately.");

    static private final SubLString $str_alt40$_S_didn_t_die_after_1_second_ = makeString("~S didn't die after 1 second.");

    static private final SubLString $str_alt41$OK__Now_it_s_dead___S = makeString("OK. Now it's dead: ~S");

    static private final SubLList $list_alt45 = list(makeSymbol("MODULES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $kw54$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 403 ms
 */
