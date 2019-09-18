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
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class nl_reformulator extends SubLTranslatedFile {
    public static final SubLFile me = new nl_reformulator();

    public static final String myName = "com.cyc.cycjava.cycl.nl_reformulator";

    public static final String myFingerPrint = "fb8da7cdd1e6f4ba1062556291c8831ca9f19137fd16757ade0f77f84c9423f1";

    // defparameter
    private static final SubLSymbol $nl_reformulator_time$ = makeSymbol("*NL-REFORMULATOR-TIME*");

    // defparameter
    // How many reformulations were performed?
    private static final SubLSymbol $nl_reformulations_total$ = makeSymbol("*NL-REFORMULATIONS-TOTAL*");

    // defparameter
    // How many reformulations simplified their input?
    private static final SubLSymbol $nl_reformulations_simplified$ = makeSymbol("*NL-REFORMULATIONS-SIMPLIFIED*");

    // deflexical
    // Should we print out info on reformulation calls?
    private static final SubLSymbol $nl_ref_show_reformulationsP$ = makeSymbol("*NL-REF-SHOW-REFORMULATIONS?*");







    // defparameter
    private static final SubLSymbol $within_nl_reformulate_daemon$ = makeSymbol("*WITHIN-NL-REFORMULATE-DAEMON*");



    // Internal Constants
    public static final SubLString $str0$__Spent__4_2F_seconds_reformulati = makeString("~&Spent ~4,2F seconds reformulating.");

    public static final SubLString $str1$__D_of__D_items_passed_through_th = makeString(" ~D of ~D items passed through the Reformulator were simplified.~%");

    public static final SubLSymbol WITH_NEW_REFORMULATOR_MEMOIZATION_STATE = makeSymbol("WITH-NEW-REFORMULATOR-MEMOIZATION-STATE");



    public static final SubLList $list4 = list(list(makeSymbol("*NL-REFORMULATOR-SETTINGS*"), list(makeSymbol("ADD-OR-CHANGE-NL-REFORMULATOR-SETTINGS"), makeKeyword("CLEAR-CACHES?"), makeKeyword("FALSE"))));



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





    private static final SubLInteger $int$24 = makeInteger(24);

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



    public static SubLObject get_nl_reformulator_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $nl_reformulator_time$.getDynamicValue(thread);
    }

    public static SubLObject nl_ref_reset_metrics() {
        $nl_reformulator_time$.setDynamicValue(ZERO_INTEGER);
        $nl_reformulations_total$.setDynamicValue(ZERO_INTEGER);
        $nl_reformulations_simplified$.setDynamicValue(ZERO_INTEGER);
        return ZERO_INTEGER;
    }

    public static SubLObject nl_ref_report_metrics(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$debug_io$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(stream, $str0$__Spent__4_2F_seconds_reformulati, $nl_reformulator_time$.getDynamicValue(thread));
        format(stream, $str1$__D_of__D_items_passed_through_th, $nl_reformulations_simplified$.getDynamicValue(thread), $nl_reformulations_total$.getDynamicValue(thread));
        return T;
    }

    public static SubLObject memoizing_nl_reformulator(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_REFORMULATOR_MEMOIZATION_STATE, listS(CLET, $list4, append(body, NIL)));
    }

    public static SubLObject nl_reformulate_cycls(final SubLObject cycls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reformulated_cycls = NIL;
        final SubLObject v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) " + v_memoization_state;
        final SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
        try {
            reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$2 = $nl_reformulator_settings$.currentBinding(thread);
                    try {
                        $nl_reformulator_settings$.bind(add_or_change_nl_reformulator_settings($kw6$CLEAR_CACHES_, $FALSE), thread);
                        reformulated_cycls = Mapping.mapcar(NL_REFORMULATE, cycls);
                    } finally {
                        $nl_reformulator_settings$.rebind(_prev_bind_0_$2, thread);
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

    public static SubLObject add_or_change_nl_reformulator_settings(final SubLObject dir, final SubLObject val) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject settings = $nl_reformulator_settings$.getDynamicValue(thread);
        final SubLObject pos = position(dir, settings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != pos) {
            settings = list_utilities.nreplace_nth(number_utilities.f_1X(pos), val, settings);
        } else {
            settings = cons(val, settings);
            settings = cons(dir, settings);
        }
        return settings;
    }

    public static SubLObject nl_reformulate(final SubLObject cycl, SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = parsing_macros.parsing_timeout_time_remaining();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $nl_reformulations_total$.setDynamicValue(add($nl_reformulations_total$.getDynamicValue(thread), ONE_INTEGER), thread);
        SubLObject parsing_timeout_timed_outP = NIL;
        final SubLObject mt = parsing_vars.$parsing_domain_mt$.getDynamicValue(thread);
        final SubLObject settings = $nl_reformulator_settings$.getDynamicValue(thread);
        final SubLObject hard_timeout = (NIL != timeout) ? number_utilities.maximum(list(multiply($float$1_1, timeout), add(FIVE_INTEGER, timeout)), UNPROVIDED) : NIL;
        SubLObject hard_timeout_reachedP = NIL;
        SubLObject ans = copy_expression(cycl);
        SubLObject time = ZERO_INTEGER;
        SubLObject timed_outP = NIL;
        final SubLObject result = make_list(TWO_INTEGER, $UNKNOWN);
        SubLObject sleep_time = $float$0_001;
        final SubLObject semaphore = Semaphores.new_semaphore(process_name(current_process()), ZERO_INTEGER);
        nl_reformulate_enqueue(cycl, mt, settings, result, semaphore, timeout);
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
                                            if (sleep_time.numL($float$0_5)) {
                                                sleep_time = multiply(sleep_time, TWO_INTEGER);
                                            }
                                            if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                                Errors.warn($str14$Forcing_timeout_of_NL_reformulato, nl_reformulate_daemon(), time);
                                                launch_or_restart_nl_reformulate_daemon();
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
                            if (sleep_time.numL($float$0_5)) {
                                sleep_time = multiply(sleep_time, TWO_INTEGER);
                            }
                            if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                Errors.warn($str14$Forcing_timeout_of_NL_reformulato, nl_reformulate_daemon(), time);
                                launch_or_restart_nl_reformulate_daemon();
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
                                    if (sleep_time.numL($float$0_5)) {
                                        sleep_time = multiply(sleep_time, TWO_INTEGER);
                                    }
                                    if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                        Errors.warn($str14$Forcing_timeout_of_NL_reformulato, nl_reformulate_daemon(), time);
                                        launch_or_restart_nl_reformulate_daemon();
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
                    if (sleep_time.numL($float$0_5)) {
                        sleep_time = multiply(sleep_time, TWO_INTEGER);
                    }
                    if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                        Errors.warn($str14$Forcing_timeout_of_NL_reformulato, nl_reformulate_daemon(), time);
                        launch_or_restart_nl_reformulate_daemon();
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
                Errors.warn($str15$Forcing_timeout_of_NL_reformulato, nl_reformulate_daemon());
                launch_or_restart_nl_reformulate_daemon();
            }

        if ((NIL != parsing_timeout_timed_outP) || (NIL != hard_timeout_reachedP)) {
            timed_outP = T;
        }
        if (NIL != hard_timeout_reachedP) {
            Errors.warn($str16$Hard_timeout_of__S_seconds_reache, hard_timeout, cycl, timeout);
            timed_outP = T;
        } else
            if ((NIL != parsing_macros.parsing_timeout_time_reachedP()) && parsing_macros.parsing_timeout_time_passed_by().numG(ONE_INTEGER)) {
                Errors.warn($str17$Alloted_time_of__S_seconds_reache, hard_timeout, cycl, timeout);
                timed_outP = T;
            }

        if (NIL != timed_outP) {
            remove_nl_reformulate_int_cached(cycl, mt, settings, UNPROVIDED);
        }
        $nl_reformulator_time$.setDynamicValue(add($nl_reformulator_time$.getDynamicValue(thread), time), thread);
        if (NIL != $nl_ref_show_reformulationsP$.getGlobalValue()) {
            format(StreamsLow.$debug_io$.getDynamicValue(thread), $str18$__Reformulated__S___to__S_in___3F, new SubLObject[]{ cycl, ans, time });
            force_output(StreamsLow.$debug_io$.getDynamicValue(thread));
        }
        if (!ans.equal(cycl)) {
            $nl_reformulations_simplified$.setDynamicValue(add($nl_reformulations_simplified$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        return values(ans, timed_outP);
    }

    public static SubLObject nl_reformulate_enqueue(final SubLObject cycl, final SubLObject mt, final SubLObject settings, final SubLObject result, final SubLObject semaphore, SubLObject hard_timeout) {
        if (hard_timeout == UNPROVIDED) {
            hard_timeout = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (result.first() != $UNKNOWN)) {
            Errors.error($str20$NL_REFORMULATE_DAEMON_given_non_u, result);
        }
        if (NIL == queues.queue_p($nl_reformulate_queue$.getGlobalValue())) {
            $nl_reformulate_queue$.setGlobalValue(queues.create_queue(UNPROVIDED));
        }
        queues.enqueue(list(cycl, mt, settings, result, semaphore, hard_timeout), $nl_reformulate_queue$.getGlobalValue());
        nl_reformulate_daemon_maybe_warn_about_wait_time();
        set_nth(ZERO_INTEGER, result, $QUEUED);
        if (NIL != valid_process_p(nl_reformulate_daemon())) {
            process_unblock(nl_reformulate_daemon());
        } else {
            launch_or_restart_nl_reformulate_daemon();
        }
        return $nl_reformulate_queue$.getGlobalValue();
    }

    public static SubLObject nl_reformulate_dequeue() {
        if (NIL != queues.queue_p($nl_reformulate_queue$.getGlobalValue())) {
            return queues.dequeue($nl_reformulate_queue$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject nl_reformulate_daemon() {
        return $nl_reformulate_daemon$.getGlobalValue();
    }

    public static SubLObject nl_reformulate_daemon_maybe_warn_about_wait_time() {
        if (NIL != nl_reformulate_daemon_busy_p()) {
            final SubLObject prior_request_count = queues.queue_size($nl_reformulate_queue$.getGlobalValue());
            Errors.warn($str23$NL_Reformulator_Daemon_already_ha, prior_request_count);
            force_output(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject nl_reformulate_daemon_busy_p() {
        return makeBoolean((NIL != processp(nl_reformulate_daemon())) && $$$Run.equalp(process_whostate(nl_reformulate_daemon())));
    }

    public static SubLObject nl_reformulate_daemon_run() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($NL_REFORMULATE_DAEMON_QUIT);
            final SubLObject _prev_bind_0 = $within_nl_reformulate_daemon$.currentBinding(thread);
            try {
                $within_nl_reformulate_daemon$.bind(T, thread);
                while (true) {
                    if (NIL != queues.queue_empty_p($nl_reformulate_queue$.getGlobalValue())) {
                        process_block();
                    } else {
                        SubLObject hard_timeout_reachedP = NIL;
                        SubLObject soft_timeout_reachedP = NIL;
                        SubLObject error_message = NIL;
                        SubLObject soft_timeout = NIL;
                        SubLObject current;
                        final SubLObject datum = current = nl_reformulate_dequeue();
                        SubLObject cycl = NIL;
                        SubLObject mt = NIL;
                        SubLObject settings = NIL;
                        SubLObject result = NIL;
                        SubLObject semaphore = NIL;
                        SubLObject hard_timeout = NIL;
                        destructuring_bind_must_consp(current, datum, $list26);
                        cycl = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list26);
                        mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list26);
                        settings = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list26);
                        result = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list26);
                        semaphore = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list26);
                        hard_timeout = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        soft_timeout = (NIL != hard_timeout) ? number_utilities.maximum(list(ONE_INTEGER, number_utilities.f_1_(hard_timeout)), UNPROVIDED) : multiply($int$1000, $int$24, $int$3600);
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
                                                                    final SubLObject reformulated = nl_reformulate_int_cached(cycl, mt, settings, UNPROVIDED);
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
                                                    final SubLObject reformulated2 = nl_reformulate_int_cached(cycl, mt, settings, UNPROVIDED);
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
                            cdestructuring_bind_error(datum, $list26);
                        }
                    }
                } 
            } finally {
                $within_nl_reformulate_daemon$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var3) {
            catch_var = Errors.handleThrowable(ccatch_env_var3, $NL_REFORMULATE_DAEMON_QUIT);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject launch_or_restart_nl_reformulate_daemon() {
        final SubLObject daemon = nl_reformulate_daemon();
        if (NIL != valid_process_p(daemon)) {
            Errors.warn($str33$Aborting__S, daemon);
            abort_nl_reformulate_daemon(daemon);
            if (NIL != valid_process_p(daemon)) {
                Errors.warn($str34$_S_didn_t_die_immediately_, daemon);
                sleep(ONE_INTEGER);
                if (NIL != valid_process_p(daemon)) {
                    Errors.warn($str35$_S_didn_t_die_after_1_second__Att, daemon);
                    kill_process(daemon);
                    if (NIL != valid_process_p(daemon)) {
                        Errors.warn($str36$_S_still_didn_t_die_immediately_, daemon);
                        sleep(ONE_INTEGER);
                        if (NIL != valid_process_p(daemon)) {
                            Errors.sublisp_break($str37$_S_didn_t_die_after_1_second_, new SubLObject[]{ daemon });
                        } else {
                            format(T, $str38$OK__Now_it_s_dead___S, daemon);
                        }
                    }
                }
            }
        }
        $nl_reformulate_daemon$.setGlobalValue(process_utilities.make_cyc_server_process_with_args($$$NL_Reformulate_Daemon, symbol_function(NL_REFORMULATE_DAEMON_RUN), UNPROVIDED));
        return nl_reformulate_daemon();
    }

    public static SubLObject nl_reformulate_daemon_quit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_nl_reformulate_daemon$.getDynamicValue(thread)) {
            sublisp_throw($NL_REFORMULATE_DAEMON_QUIT, NIL);
        }
        return NIL;
    }

    public static SubLObject abort_nl_reformulate_daemon(SubLObject process) {
        if (process == UNPROVIDED) {
            process = nl_reformulate_daemon();
        }
        return interrupt_process(process, symbol_function(NL_REFORMULATE_DAEMON_QUIT));
    }

    public static SubLObject clear_nl_reformulator_caches() {
        clear_nl_reformulate_int_cached();
        return NIL;
    }

    public static SubLObject skipping_nl_reformulator_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_modules = NIL;
        destructuring_bind_must_consp(current, datum, $list42);
        v_modules = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($nl_reformulator_settings$, list(NL_REF_REMOVE_MODULES, v_modules))), append(body, NIL));
    }

    public static SubLObject nl_ref_remove_modules(final SubLObject v_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dir = $IGNORE_RL_MODULES;
        SubLObject settings = $nl_reformulator_settings$.getDynamicValue(thread);
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

    public static SubLObject clear_nl_reformulate_int_cached() {
        final SubLObject cs = $nl_reformulate_int_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_nl_reformulate_int_cached(final SubLObject cycl, SubLObject mt, SubLObject settings, SubLObject evaluate_resultsP) {
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
                            final SubLObject new_item = nl_reformulate_int_cached(item, mt, settings, UNPROVIDED);
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
    }

    public static SubLObject nl_reformulate_int_cached(final SubLObject cycl, SubLObject mt, SubLObject settings, SubLObject evaluate_resultsP) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
        }
        if (settings == UNPROVIDED) {
            settings = $nl_reformulator_settings$.getDynamicValue();
        }
        if (evaluate_resultsP == UNPROVIDED) {
            evaluate_resultsP = parsing_vars.$evaluate_nl_reformulator_resultsP$.getDynamicValue();
        }
        SubLObject caching_state = $nl_reformulate_int_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NL_REFORMULATE_INT_CACHED, $nl_reformulate_int_cached_caching_state$, $int$256, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
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
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(nl_reformulate_int_cached_internal(cycl, mt, settings, evaluate_resultsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl, mt, settings, evaluate_resultsP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject declare_nl_reformulator_file() {
        declareFunction(me, "get_nl_reformulator_time", "GET-NL-REFORMULATOR-TIME", 0, 0, false);
        declareFunction(me, "nl_ref_reset_metrics", "NL-REF-RESET-METRICS", 0, 0, false);
        declareFunction(me, "nl_ref_report_metrics", "NL-REF-REPORT-METRICS", 0, 1, false);
        declareMacro(me, "memoizing_nl_reformulator", "MEMOIZING-NL-REFORMULATOR");
        declareFunction(me, "nl_reformulate_cycls", "NL-REFORMULATE-CYCLS", 1, 0, false);
        declareFunction(me, "add_or_change_nl_reformulator_settings", "ADD-OR-CHANGE-NL-REFORMULATOR-SETTINGS", 2, 0, false);
        declareFunction(me, "nl_reformulate", "NL-REFORMULATE", 1, 1, false);
        declareFunction(me, "nl_reformulate_enqueue", "NL-REFORMULATE-ENQUEUE", 5, 1, false);
        declareFunction(me, "nl_reformulate_dequeue", "NL-REFORMULATE-DEQUEUE", 0, 0, false);
        declareFunction(me, "nl_reformulate_daemon", "NL-REFORMULATE-DAEMON", 0, 0, false);
        declareFunction(me, "nl_reformulate_daemon_maybe_warn_about_wait_time", "NL-REFORMULATE-DAEMON-MAYBE-WARN-ABOUT-WAIT-TIME", 0, 0, false);
        declareFunction(me, "nl_reformulate_daemon_busy_p", "NL-REFORMULATE-DAEMON-BUSY-P", 0, 0, false);
        declareFunction(me, "nl_reformulate_daemon_run", "NL-REFORMULATE-DAEMON-RUN", 0, 0, false);
        declareFunction(me, "launch_or_restart_nl_reformulate_daemon", "LAUNCH-OR-RESTART-NL-REFORMULATE-DAEMON", 0, 0, false);
        declareFunction(me, "nl_reformulate_daemon_quit", "NL-REFORMULATE-DAEMON-QUIT", 0, 0, false);
        declareFunction(me, "abort_nl_reformulate_daemon", "ABORT-NL-REFORMULATE-DAEMON", 0, 1, false);
        declareFunction(me, "clear_nl_reformulator_caches", "CLEAR-NL-REFORMULATOR-CACHES", 0, 0, false);
        declareMacro(me, "skipping_nl_reformulator_modules", "SKIPPING-NL-REFORMULATOR-MODULES");
        declareFunction(me, "nl_ref_remove_modules", "NL-REF-REMOVE-MODULES", 1, 0, false);
        declareFunction(me, "clear_nl_reformulate_int_cached", "CLEAR-NL-REFORMULATE-INT-CACHED", 0, 0, false);
        declareFunction(me, "remove_nl_reformulate_int_cached", "REMOVE-NL-REFORMULATE-INT-CACHED", 1, 3, false);
        declareFunction(me, "nl_reformulate_int_cached_internal", "NL-REFORMULATE-INT-CACHED-INTERNAL", 4, 0, false);
        declareFunction(me, "nl_reformulate_int_cached", "NL-REFORMULATE-INT-CACHED", 1, 3, false);
        return NIL;
    }

    public static SubLObject init_nl_reformulator_file() {
        defparameter("*NL-REFORMULATOR-TIME*", ZERO_INTEGER);
        defparameter("*NL-REFORMULATIONS-TOTAL*", ZERO_INTEGER);
        defparameter("*NL-REFORMULATIONS-SIMPLIFIED*", ZERO_INTEGER);
        deflexical("*NL-REF-SHOW-REFORMULATIONS?*", NIL);
        defvar("*NL-REFORMULATOR-SETTINGS*", NIL);
        deflexical("*NL-REFORMULATE-QUEUE*", SubLSystemTrampolineFile.maybeDefault($nl_reformulate_queue$, $nl_reformulate_queue$, NIL));
        deflexical("*NL-REFORMULATE-DAEMON*", SubLSystemTrampolineFile.maybeDefault($nl_reformulate_daemon$, $nl_reformulate_daemon$, NIL));
        defparameter("*WITHIN-NL-REFORMULATE-DAEMON*", NIL);
        deflexical("*NL-REFORMULATE-INT-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_nl_reformulator_file() {
        declare_defglobal($nl_reformulate_queue$);
        declare_defglobal($nl_reformulate_daemon$);
        memoization_state.note_globally_cached_function(NL_REFORMULATE_INT_CACHED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nl_reformulator_file();
    }

    @Override
    public void initializeVariables() {
        init_nl_reformulator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nl_reformulator_file();
    }

    
}

/**
 * Total time: 403 ms
 */
