package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_reformulator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nl_reformulator";
    public static final String myFingerPrint = "fb8da7cdd1e6f4ba1062556291c8831ca9f19137fd16757ade0f77f84c9423f1";
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 980L)
    private static SubLSymbol $nl_reformulator_time$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 1155L)
    private static SubLSymbol $nl_reformulations_total$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 1251L)
    private static SubLSymbol $nl_reformulations_simplified$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 1360L)
    private static SubLSymbol $nl_ref_show_reformulationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 1950L)
    public static SubLSymbol $nl_reformulator_settings$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 5553L)
    private static SubLSymbol $nl_reformulate_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 6415L)
    private static SubLSymbol $nl_reformulate_daemon$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 7087L)
    private static SubLSymbol $within_nl_reformulate_daemon$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 10493L)
    private static SubLSymbol $nl_reformulate_int_cached_caching_state$;
    private static final SubLString $str0$__Spent__4_2F_seconds_reformulati;
    private static final SubLString $str1$__D_of__D_items_passed_through_th;
    private static final SubLSymbol $sym2$WITH_NEW_REFORMULATOR_MEMOIZATION_STATE;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$MEMOIZATION_STATE_P;
    private static final SubLSymbol $kw6$CLEAR_CACHES_;
    private static final SubLSymbol $kw7$FALSE;
    private static final SubLSymbol $sym8$NL_REFORMULATE;
    private static final SubLFloat $float9$1_1;
    private static final SubLSymbol $kw10$UNKNOWN;
    private static final SubLFloat $float11$0_001;
    private static final SubLSymbol $kw12$WORKING;
    private static final SubLFloat $float13$0_5;
    private static final SubLString $str14$Forcing_timeout_of_NL_reformulato;
    private static final SubLString $str15$Forcing_timeout_of_NL_reformulato;
    private static final SubLString $str16$Hard_timeout_of__S_seconds_reache;
    private static final SubLString $str17$Alloted_time_of__S_seconds_reache;
    private static final SubLString $str18$__Reformulated__S___to__S_in___3F;
    private static final SubLSymbol $sym19$_NL_REFORMULATE_QUEUE_;
    private static final SubLString $str20$NL_REFORMULATE_DAEMON_given_non_u;
    private static final SubLSymbol $kw21$QUEUED;
    private static final SubLSymbol $sym22$_NL_REFORMULATE_DAEMON_;
    private static final SubLString $str23$NL_Reformulator_Daemon_already_ha;
    private static final SubLString $str24$Run;
    private static final SubLSymbol $kw25$NL_REFORMULATE_DAEMON_QUIT;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLInteger $int28$1000;
    private static final SubLInteger $int29$24;
    private static final SubLInteger $int30$3600;
    private static final SubLSymbol $kw31$TIMED_OUT;
    private static final SubLSymbol $kw32$ERROR;
    private static final SubLString $str33$Aborting__S;
    private static final SubLString $str34$_S_didn_t_die_immediately_;
    private static final SubLString $str35$_S_didn_t_die_after_1_second__Att;
    private static final SubLString $str36$_S_still_didn_t_die_immediately_;
    private static final SubLString $str37$_S_didn_t_die_after_1_second_;
    private static final SubLString $str38$OK__Now_it_s_dead___S;
    private static final SubLString $str39$NL_Reformulate_Daemon;
    private static final SubLSymbol $sym40$NL_REFORMULATE_DAEMON_RUN;
    private static final SubLSymbol $sym41$NL_REFORMULATE_DAEMON_QUIT;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$_NL_REFORMULATOR_SETTINGS_;
    private static final SubLSymbol $sym44$NL_REF_REMOVE_MODULES;
    private static final SubLSymbol $kw45$IGNORE_RL_MODULES;
    private static final SubLSymbol $sym46$NL_REFORMULATE_INT_CACHED;
    private static final SubLSymbol $kw47$MAX_TIME;
    private static final SubLSymbol $sym48$LISTP;
    private static final SubLSymbol $sym49$_NL_REFORMULATE_INT_CACHED_CACHING_STATE_;
    private static final SubLInteger $int50$256;
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 1076L)
    public static SubLObject get_nl_reformulator_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return nl_reformulator.$nl_reformulator_time$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 1469L)
    public static SubLObject nl_ref_reset_metrics() {
        nl_reformulator.$nl_reformulator_time$.setDynamicValue((SubLObject)nl_reformulator.ZERO_INTEGER);
        nl_reformulator.$nl_reformulations_total$.setDynamicValue((SubLObject)nl_reformulator.ZERO_INTEGER);
        nl_reformulator.$nl_reformulations_simplified$.setDynamicValue((SubLObject)nl_reformulator.ZERO_INTEGER);
        return (SubLObject)nl_reformulator.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 1639L)
    public static SubLObject nl_ref_report_metrics(SubLObject stream) {
        if (stream == nl_reformulator.UNPROVIDED) {
            stream = StreamsLow.$debug_io$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(stream, (SubLObject)nl_reformulator.$str0$__Spent__4_2F_seconds_reformulati, nl_reformulator.$nl_reformulator_time$.getDynamicValue(thread));
        PrintLow.format(stream, (SubLObject)nl_reformulator.$str1$__D_of__D_items_passed_through_th, nl_reformulator.$nl_reformulations_simplified$.getDynamicValue(thread), nl_reformulator.$nl_reformulations_total$.getDynamicValue(thread));
        return (SubLObject)nl_reformulator.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 2001L)
    public static SubLObject memoizing_nl_reformulator(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)nl_reformulator.$sym2$WITH_NEW_REFORMULATOR_MEMOIZATION_STATE, (SubLObject)ConsesLow.listS((SubLObject)nl_reformulator.$sym3$CLET, (SubLObject)nl_reformulator.$list4, ConsesLow.append(body, (SubLObject)nl_reformulator.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 2313L)
    public static SubLObject nl_reformulate_cycls(final SubLObject cycls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reformulated_cycls = (SubLObject)nl_reformulator.NIL;
        final SubLObject v_memoization_state = memoization_state.new_memoization_state((SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED);
        assert nl_reformulator.NIL != memoization_state.memoization_state_p(v_memoization_state) : v_memoization_state;
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
                        nl_reformulator.$nl_reformulator_settings$.bind(add_or_change_nl_reformulator_settings((SubLObject)nl_reformulator.$kw6$CLEAR_CACHES_, (SubLObject)nl_reformulator.$kw7$FALSE), thread);
                        reformulated_cycls = Mapping.mapcar((SubLObject)nl_reformulator.$sym8$NL_REFORMULATE, cycls);
                    }
                    finally {
                        nl_reformulator.$nl_reformulator_settings$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_reformulator.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return reformulated_cycls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 2604L)
    public static SubLObject add_or_change_nl_reformulator_settings(final SubLObject dir, final SubLObject val) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject settings = nl_reformulator.$nl_reformulator_settings$.getDynamicValue(thread);
        final SubLObject pos = Sequences.position(dir, settings, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED);
        if (nl_reformulator.NIL != pos) {
            settings = list_utilities.nreplace_nth(number_utilities.f_1X(pos), val, settings);
        }
        else {
            settings = (SubLObject)ConsesLow.cons(val, settings);
            settings = (SubLObject)ConsesLow.cons(dir, settings);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 2989L)
    public static SubLObject nl_reformulate(final SubLObject cycl, SubLObject timeout) {
        if (timeout == nl_reformulator.UNPROVIDED) {
            timeout = parsing_macros.parsing_timeout_time_remaining();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        nl_reformulator.$nl_reformulations_total$.setDynamicValue(Numbers.add(nl_reformulator.$nl_reformulations_total$.getDynamicValue(thread), (SubLObject)nl_reformulator.ONE_INTEGER), thread);
        SubLObject parsing_timeout_timed_outP = (SubLObject)nl_reformulator.NIL;
        final SubLObject mt = parsing_vars.$parsing_domain_mt$.getDynamicValue(thread);
        final SubLObject settings = nl_reformulator.$nl_reformulator_settings$.getDynamicValue(thread);
        final SubLObject hard_timeout = (SubLObject)((nl_reformulator.NIL != timeout) ? number_utilities.maximum((SubLObject)ConsesLow.list(Numbers.multiply((SubLObject)nl_reformulator.$float9$1_1, timeout), Numbers.add((SubLObject)nl_reformulator.FIVE_INTEGER, timeout)), (SubLObject)nl_reformulator.UNPROVIDED) : nl_reformulator.NIL);
        SubLObject hard_timeout_reachedP = (SubLObject)nl_reformulator.NIL;
        SubLObject ans = el_utilities.copy_expression(cycl);
        SubLObject time = (SubLObject)nl_reformulator.ZERO_INTEGER;
        SubLObject timed_outP = (SubLObject)nl_reformulator.NIL;
        final SubLObject result = (SubLObject)ConsesLow.make_list((SubLObject)nl_reformulator.TWO_INTEGER, (SubLObject)nl_reformulator.$kw10$UNKNOWN);
        SubLObject sleep_time = (SubLObject)nl_reformulator.$float11$0_001;
        final SubLObject semaphore = Semaphores.new_semaphore(Threads.process_name(Threads.current_process()), (SubLObject)nl_reformulator.ZERO_INTEGER);
        nl_reformulate_enqueue(cycl, mt, settings, result, semaphore, timeout);
        Semaphores.semaphore_wait(semaphore);
        if (nl_reformulator.NIL != timeout) {
            final SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
            final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
            try {
                parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)nl_reformulator.ZERO_INTEGER, thread);
                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(timeout), thread);
                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                if (nl_reformulator.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                    if (nl_reformulator.NIL != hard_timeout) {
                        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                        try {
                            thread.throwStack.push(tag);
                            final SubLObject _prev_bind_0_$4 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)nl_reformulator.T, thread);
                                SubLObject timer = (SubLObject)nl_reformulator.NIL;
                                try {
                                    final SubLObject _prev_bind_0_$5 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                    try {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)nl_reformulator.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                        timer = subl_macro_promotions.with_timeout_start_timer(hard_timeout, tag);
                                        while (result.first() == nl_reformulator.$kw12$WORKING) {
                                            Threads.sleep(sleep_time);
                                            time = Numbers.add(time, sleep_time);
                                            if (sleep_time.numL((SubLObject)nl_reformulator.$float13$0_5)) {
                                                sleep_time = Numbers.multiply(sleep_time, (SubLObject)nl_reformulator.TWO_INTEGER);
                                            }
                                            if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                                Errors.warn((SubLObject)nl_reformulator.$str14$Forcing_timeout_of_NL_reformulato, nl_reformulate_daemon(), time);
                                                launch_or_restart_nl_reformulate_daemon();
                                                hard_timeout_reachedP = (SubLObject)nl_reformulator.T;
                                            }
                                        }
                                    }
                                    finally {
                                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_reformulator.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        subl_macro_promotions.with_timeout_stop_timer(timer);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            finally {
                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            hard_timeout_reachedP = Errors.handleThrowable(ccatch_env_var, tag);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                    }
                    else {
                        while (result.first() == nl_reformulator.$kw12$WORKING) {
                            Threads.sleep(sleep_time);
                            time = Numbers.add(time, sleep_time);
                            if (sleep_time.numL((SubLObject)nl_reformulator.$float13$0_5)) {
                                sleep_time = Numbers.multiply(sleep_time, (SubLObject)nl_reformulator.TWO_INTEGER);
                            }
                            if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                Errors.warn((SubLObject)nl_reformulator.$str14$Forcing_timeout_of_NL_reformulato, nl_reformulate_daemon(), time);
                                launch_or_restart_nl_reformulate_daemon();
                                hard_timeout_reachedP = (SubLObject)nl_reformulator.T;
                            }
                        }
                    }
                }
                parsing_timeout_timed_outP = parsing_macros.parsing_timeout_time_reachedP();
            }
            finally {
                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_3, thread);
                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_2, thread);
                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            if (nl_reformulator.NIL != hard_timeout) {
                final SubLObject tag2 = subl_macro_promotions.with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag2);
                    final SubLObject _prev_bind_4 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$within_with_timeout$.bind((SubLObject)nl_reformulator.T, thread);
                        SubLObject timer2 = (SubLObject)nl_reformulator.NIL;
                        try {
                            final SubLObject _prev_bind_0_$7 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)nl_reformulator.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer2 = subl_macro_promotions.with_timeout_start_timer(hard_timeout, tag2);
                                while (result.first() == nl_reformulator.$kw12$WORKING) {
                                    Threads.sleep(sleep_time);
                                    time = Numbers.add(time, sleep_time);
                                    if (sleep_time.numL((SubLObject)nl_reformulator.$float13$0_5)) {
                                        sleep_time = Numbers.multiply(sleep_time, (SubLObject)nl_reformulator.TWO_INTEGER);
                                    }
                                    if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                                        Errors.warn((SubLObject)nl_reformulator.$str14$Forcing_timeout_of_NL_reformulato, nl_reformulate_daemon(), time);
                                        launch_or_restart_nl_reformulate_daemon();
                                        hard_timeout_reachedP = (SubLObject)nl_reformulator.T;
                                    }
                                }
                            }
                            finally {
                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_reformulator.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                subl_macro_promotions.with_timeout_stop_timer(timer2);
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_4, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    hard_timeout_reachedP = Errors.handleThrowable(ccatch_env_var2, tag2);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            else {
                while (result.first() == nl_reformulator.$kw12$WORKING) {
                    Threads.sleep(sleep_time);
                    time = Numbers.add(time, sleep_time);
                    if (sleep_time.numL((SubLObject)nl_reformulator.$float13$0_5)) {
                        sleep_time = Numbers.multiply(sleep_time, (SubLObject)nl_reformulator.TWO_INTEGER);
                    }
                    if (hard_timeout.isNumber() && time.numG(hard_timeout)) {
                        Errors.warn((SubLObject)nl_reformulator.$str14$Forcing_timeout_of_NL_reformulato, nl_reformulate_daemon(), time);
                        launch_or_restart_nl_reformulate_daemon();
                        hard_timeout_reachedP = (SubLObject)nl_reformulator.T;
                    }
                }
            }
            parsing_timeout_timed_outP = (SubLObject)nl_reformulator.NIL;
        }
        if (nl_reformulator.NIL == hard_timeout_reachedP) {
            final SubLObject datum_evaluated_var = result;
            ans = datum_evaluated_var.first();
            timed_outP = conses_high.cadr(datum_evaluated_var);
        }
        else if (result.first() == nl_reformulator.$kw12$WORKING) {
            Errors.warn((SubLObject)nl_reformulator.$str15$Forcing_timeout_of_NL_reformulato, nl_reformulate_daemon());
            launch_or_restart_nl_reformulate_daemon();
        }
        if (nl_reformulator.NIL != parsing_timeout_timed_outP || nl_reformulator.NIL != hard_timeout_reachedP) {
            timed_outP = (SubLObject)nl_reformulator.T;
        }
        if (nl_reformulator.NIL != hard_timeout_reachedP) {
            Errors.warn((SubLObject)nl_reformulator.$str16$Hard_timeout_of__S_seconds_reache, hard_timeout, cycl, timeout);
            timed_outP = (SubLObject)nl_reformulator.T;
        }
        else if (nl_reformulator.NIL != parsing_macros.parsing_timeout_time_reachedP() && parsing_macros.parsing_timeout_time_passed_by().numG((SubLObject)nl_reformulator.ONE_INTEGER)) {
            Errors.warn((SubLObject)nl_reformulator.$str17$Alloted_time_of__S_seconds_reache, hard_timeout, cycl, timeout);
            timed_outP = (SubLObject)nl_reformulator.T;
        }
        if (nl_reformulator.NIL != timed_outP) {
            remove_nl_reformulate_int_cached(cycl, mt, settings, (SubLObject)nl_reformulator.UNPROVIDED);
        }
        nl_reformulator.$nl_reformulator_time$.setDynamicValue(Numbers.add(nl_reformulator.$nl_reformulator_time$.getDynamicValue(thread), time), thread);
        if (nl_reformulator.NIL != nl_reformulator.$nl_ref_show_reformulationsP$.getGlobalValue()) {
            PrintLow.format(StreamsLow.$debug_io$.getDynamicValue(thread), (SubLObject)nl_reformulator.$str18$__Reformulated__S___to__S_in___3F, new SubLObject[] { cycl, ans, time });
            streams_high.force_output(StreamsLow.$debug_io$.getDynamicValue(thread));
        }
        if (!ans.equal(cycl)) {
            nl_reformulator.$nl_reformulations_simplified$.setDynamicValue(Numbers.add(nl_reformulator.$nl_reformulations_simplified$.getDynamicValue(thread), (SubLObject)nl_reformulator.ONE_INTEGER), thread);
        }
        return Values.values(ans, timed_outP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 5638L)
    public static SubLObject nl_reformulate_enqueue(final SubLObject cycl, final SubLObject mt, final SubLObject settings, final SubLObject result, final SubLObject semaphore, SubLObject hard_timeout) {
        if (hard_timeout == nl_reformulator.UNPROVIDED) {
            hard_timeout = (SubLObject)nl_reformulator.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_reformulator.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && result.first() != nl_reformulator.$kw10$UNKNOWN) {
            Errors.error((SubLObject)nl_reformulator.$str20$NL_REFORMULATE_DAEMON_given_non_u, result);
        }
        if (nl_reformulator.NIL == queues.queue_p(nl_reformulator.$nl_reformulate_queue$.getGlobalValue())) {
            nl_reformulator.$nl_reformulate_queue$.setGlobalValue(queues.create_queue((SubLObject)nl_reformulator.UNPROVIDED));
        }
        queues.enqueue((SubLObject)ConsesLow.list(cycl, mt, settings, result, semaphore, hard_timeout), nl_reformulator.$nl_reformulate_queue$.getGlobalValue());
        nl_reformulate_daemon_maybe_warn_about_wait_time();
        ConsesLow.set_nth((SubLObject)nl_reformulator.ZERO_INTEGER, result, (SubLObject)nl_reformulator.$kw21$QUEUED);
        if (nl_reformulator.NIL != Threads.valid_process_p(nl_reformulate_daemon())) {
            Threads.process_unblock(nl_reformulate_daemon());
        }
        else {
            launch_or_restart_nl_reformulate_daemon();
        }
        return nl_reformulator.$nl_reformulate_queue$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 6285L)
    public static SubLObject nl_reformulate_dequeue() {
        if (nl_reformulator.NIL != queues.queue_p(nl_reformulator.$nl_reformulate_queue$.getGlobalValue())) {
            return queues.dequeue(nl_reformulator.$nl_reformulate_queue$.getGlobalValue());
        }
        return (SubLObject)nl_reformulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 6468L)
    public static SubLObject nl_reformulate_daemon() {
        return nl_reformulator.$nl_reformulate_daemon$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 6542L)
    public static SubLObject nl_reformulate_daemon_maybe_warn_about_wait_time() {
        if (nl_reformulator.NIL != nl_reformulate_daemon_busy_p()) {
            final SubLObject prior_request_count = queues.queue_size(nl_reformulator.$nl_reformulate_queue$.getGlobalValue());
            Errors.warn((SubLObject)nl_reformulator.$str23$NL_Reformulator_Daemon_already_ha, prior_request_count);
            streams_high.force_output((SubLObject)nl_reformulator.UNPROVIDED);
        }
        return (SubLObject)nl_reformulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 6923L)
    public static SubLObject nl_reformulate_daemon_busy_p() {
        return (SubLObject)SubLObjectFactory.makeBoolean(nl_reformulator.NIL != Types.processp(nl_reformulate_daemon()) && nl_reformulator.$str24$Run.equalp(Threads.process_whostate(nl_reformulate_daemon())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 7149L)
    public static SubLObject nl_reformulate_daemon_run() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var = (SubLObject)nl_reformulator.NIL;
        try {
            thread.throwStack.push(nl_reformulator.$kw25$NL_REFORMULATE_DAEMON_QUIT);
            final SubLObject _prev_bind_0 = nl_reformulator.$within_nl_reformulate_daemon$.currentBinding(thread);
            try {
                nl_reformulator.$within_nl_reformulate_daemon$.bind((SubLObject)nl_reformulator.T, thread);
                while (true) {
                    if (nl_reformulator.NIL != queues.queue_empty_p(nl_reformulator.$nl_reformulate_queue$.getGlobalValue())) {
                        Threads.process_block();
                    }
                    else {
                        SubLObject hard_timeout_reachedP = (SubLObject)nl_reformulator.NIL;
                        SubLObject soft_timeout_reachedP = (SubLObject)nl_reformulator.NIL;
                        SubLObject error_message = (SubLObject)nl_reformulator.NIL;
                        SubLObject soft_timeout = (SubLObject)nl_reformulator.NIL;
                        SubLObject current;
                        final SubLObject datum = current = nl_reformulate_dequeue();
                        SubLObject cycl = (SubLObject)nl_reformulator.NIL;
                        SubLObject mt = (SubLObject)nl_reformulator.NIL;
                        SubLObject settings = (SubLObject)nl_reformulator.NIL;
                        SubLObject result = (SubLObject)nl_reformulator.NIL;
                        SubLObject semaphore = (SubLObject)nl_reformulator.NIL;
                        SubLObject hard_timeout = (SubLObject)nl_reformulator.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_reformulator.$list26);
                        cycl = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_reformulator.$list26);
                        mt = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_reformulator.$list26);
                        settings = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_reformulator.$list26);
                        result = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_reformulator.$list26);
                        semaphore = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_reformulator.$list26);
                        hard_timeout = current.first();
                        current = current.rest();
                        if (nl_reformulator.NIL == current) {
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)nl_reformulator.$sym27$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        soft_timeout = ((nl_reformulator.NIL != hard_timeout) ? number_utilities.maximum((SubLObject)ConsesLow.list((SubLObject)nl_reformulator.ONE_INTEGER, number_utilities.f_1_(hard_timeout)), (SubLObject)nl_reformulator.UNPROVIDED) : Numbers.multiply((SubLObject)nl_reformulator.$int28$1000, (SubLObject)nl_reformulator.$int29$24, (SubLObject)nl_reformulator.$int30$3600));
                                        ConsesLow.set_nth((SubLObject)nl_reformulator.ZERO_INTEGER, result, (SubLObject)nl_reformulator.$kw12$WORKING);
                                        Semaphores.semaphore_signal(semaphore);
                                        if (nl_reformulator.NIL != hard_timeout) {
                                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                                            try {
                                                thread.throwStack.push(tag);
                                                final SubLObject _prev_bind_0_$10 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                                try {
                                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)nl_reformulator.T, thread);
                                                    SubLObject timer = (SubLObject)nl_reformulator.NIL;
                                                    try {
                                                        final SubLObject _prev_bind_0_$11 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                        try {
                                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)nl_reformulator.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                            timer = subl_macro_promotions.with_timeout_start_timer(hard_timeout, tag);
                                                            final SubLObject _prev_bind_0_$12 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                                            final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                                            try {
                                                                parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)nl_reformulator.ZERO_INTEGER, thread);
                                                                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(soft_timeout), thread);
                                                                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                                                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                                                if (nl_reformulator.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject reformulated = nl_reformulate_int_cached(cycl, mt, settings, (SubLObject)nl_reformulator.UNPROVIDED);
                                                                    final SubLObject timed_outP = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    ConsesLow.set_nth((SubLObject)nl_reformulator.ZERO_INTEGER, result, reformulated);
                                                                    ConsesLow.set_nth((SubLObject)nl_reformulator.ONE_INTEGER, result, timed_outP);
                                                                }
                                                                soft_timeout_reachedP = parsing_macros.parsing_timeout_time_reachedP();
                                                            }
                                                            finally {
                                                                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_3, thread);
                                                                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_2, thread);
                                                                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_$12, thread);
                                                            }
                                                        }
                                                        finally {
                                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$11, thread);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nl_reformulator.T, thread);
                                                            final SubLObject _values = Values.getValuesAsVector();
                                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$10, thread);
                                                }
                                            }
                                            catch (Throwable ccatch_env_var) {
                                                hard_timeout_reachedP = Errors.handleThrowable(ccatch_env_var, tag);
                                            }
                                            finally {
                                                thread.throwStack.pop();
                                            }
                                        }
                                        else {
                                            final SubLObject _prev_bind_0_$14 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                                            final SubLObject _prev_bind_4 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                                            final SubLObject _prev_bind_5 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                                            try {
                                                parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)nl_reformulator.ZERO_INTEGER, thread);
                                                parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(soft_timeout), thread);
                                                parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                                                parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                                                if (nl_reformulator.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject reformulated2 = nl_reformulate_int_cached(cycl, mt, settings, (SubLObject)nl_reformulator.UNPROVIDED);
                                                    final SubLObject timed_outP2 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    ConsesLow.set_nth((SubLObject)nl_reformulator.ZERO_INTEGER, result, reformulated2);
                                                    ConsesLow.set_nth((SubLObject)nl_reformulator.ONE_INTEGER, result, timed_outP2);
                                                }
                                                soft_timeout_reachedP = parsing_macros.parsing_timeout_time_reachedP();
                                            }
                                            finally {
                                                parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_5, thread);
                                                parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_4, thread);
                                                parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_0_$14, thread);
                                            }
                                        }
                                    }
                                    catch (Throwable catch_var_$15) {
                                        Errors.handleThrowable(catch_var_$15, (SubLObject)nl_reformulator.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var2) {
                                error_message = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (nl_reformulator.NIL != hard_timeout_reachedP || nl_reformulator.NIL != soft_timeout_reachedP) {
                                ConsesLow.set_nth((SubLObject)nl_reformulator.ZERO_INTEGER, result, (SubLObject)nl_reformulator.$kw31$TIMED_OUT);
                                ConsesLow.set_nth((SubLObject)nl_reformulator.ONE_INTEGER, result, (SubLObject)nl_reformulator.T);
                            }
                            else {
                                if (nl_reformulator.NIL == error_message) {
                                    continue;
                                }
                                ConsesLow.set_nth((SubLObject)nl_reformulator.ZERO_INTEGER, result, (SubLObject)nl_reformulator.$kw32$ERROR);
                                ConsesLow.set_nth((SubLObject)nl_reformulator.ONE_INTEGER, result, error_message);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nl_reformulator.$list26);
                        }
                    }
                }
            }
            finally {
                nl_reformulator.$within_nl_reformulate_daemon$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var3) {
            catch_var = Errors.handleThrowable(ccatch_env_var3, (SubLObject)nl_reformulator.$kw25$NL_REFORMULATE_DAEMON_QUIT);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)nl_reformulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 8429L)
    public static SubLObject launch_or_restart_nl_reformulate_daemon() {
        final SubLObject daemon = nl_reformulate_daemon();
        if (nl_reformulator.NIL != Threads.valid_process_p(daemon)) {
            Errors.warn((SubLObject)nl_reformulator.$str33$Aborting__S, daemon);
            abort_nl_reformulate_daemon(daemon);
            if (nl_reformulator.NIL != Threads.valid_process_p(daemon)) {
                Errors.warn((SubLObject)nl_reformulator.$str34$_S_didn_t_die_immediately_, daemon);
                Threads.sleep((SubLObject)nl_reformulator.ONE_INTEGER);
                if (nl_reformulator.NIL != Threads.valid_process_p(daemon)) {
                    Errors.warn((SubLObject)nl_reformulator.$str35$_S_didn_t_die_after_1_second__Att, daemon);
                    Threads.kill_process(daemon);
                    if (nl_reformulator.NIL != Threads.valid_process_p(daemon)) {
                        Errors.warn((SubLObject)nl_reformulator.$str36$_S_still_didn_t_die_immediately_, daemon);
                        Threads.sleep((SubLObject)nl_reformulator.ONE_INTEGER);
                        if (nl_reformulator.NIL != Threads.valid_process_p(daemon)) {
                            Errors.sublisp_break((SubLObject)nl_reformulator.$str37$_S_didn_t_die_after_1_second_, new SubLObject[] { daemon });
                        }
                        else {
                            PrintLow.format((SubLObject)nl_reformulator.T, (SubLObject)nl_reformulator.$str38$OK__Now_it_s_dead___S, daemon);
                        }
                    }
                }
            }
        }
        nl_reformulator.$nl_reformulate_daemon$.setGlobalValue(process_utilities.make_cyc_server_process_with_args((SubLObject)nl_reformulator.$str39$NL_Reformulate_Daemon, Symbols.symbol_function((SubLObject)nl_reformulator.$sym40$NL_REFORMULATE_DAEMON_RUN), (SubLObject)nl_reformulator.UNPROVIDED));
        return nl_reformulate_daemon();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 9275L)
    public static SubLObject nl_reformulate_daemon_quit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nl_reformulator.NIL != nl_reformulator.$within_nl_reformulate_daemon$.getDynamicValue(thread)) {
            Dynamic.sublisp_throw((SubLObject)nl_reformulator.$kw25$NL_REFORMULATE_DAEMON_QUIT, (SubLObject)nl_reformulator.NIL);
        }
        return (SubLObject)nl_reformulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 9467L)
    public static SubLObject abort_nl_reformulate_daemon(SubLObject process) {
        if (process == nl_reformulator.UNPROVIDED) {
            process = nl_reformulate_daemon();
        }
        return Threads.interrupt_process(process, Symbols.symbol_function((SubLObject)nl_reformulator.$sym41$NL_REFORMULATE_DAEMON_QUIT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 9624L)
    public static SubLObject clear_nl_reformulator_caches() {
        clear_nl_reformulate_int_cached();
        return (SubLObject)nl_reformulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 9752L)
    public static SubLObject skipping_nl_reformulator_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_modules = (SubLObject)nl_reformulator.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nl_reformulator.$list42);
        v_modules = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)nl_reformulator.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)nl_reformulator.$sym43$_NL_REFORMULATOR_SETTINGS_, (SubLObject)ConsesLow.list((SubLObject)nl_reformulator.$sym44$NL_REF_REMOVE_MODULES, v_modules))), ConsesLow.append(body, (SubLObject)nl_reformulator.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 9989L)
    public static SubLObject nl_ref_remove_modules(final SubLObject v_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dir = (SubLObject)nl_reformulator.$kw45$IGNORE_RL_MODULES;
        SubLObject settings = nl_reformulator.$nl_reformulator_settings$.getDynamicValue(thread);
        if (nl_reformulator.NIL != Sequences.find(dir, settings, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED)) {
            final SubLObject pos = Sequences.position(dir, settings, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED);
            final SubLObject current = ConsesLow.nth(number_utilities.f_1X(pos), settings);
            final SubLObject v_new = conses_high.union(v_modules, current, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED);
            settings = conses_high.subst(v_new, current, settings, Symbols.symbol_function((SubLObject)nl_reformulator.EQUAL), (SubLObject)nl_reformulator.UNPROVIDED);
        }
        else {
            settings = (SubLObject)ConsesLow.cons(v_modules, settings);
            settings = (SubLObject)ConsesLow.cons(dir, settings);
        }
        return settings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 10493L)
    public static SubLObject clear_nl_reformulate_int_cached() {
        final SubLObject cs = nl_reformulator.$nl_reformulate_int_cached_caching_state$.getGlobalValue();
        if (nl_reformulator.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)nl_reformulator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 10493L)
    public static SubLObject remove_nl_reformulate_int_cached(final SubLObject cycl, SubLObject mt, SubLObject settings, SubLObject evaluate_resultsP) {
        if (mt == nl_reformulator.UNPROVIDED) {
            mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
        }
        if (settings == nl_reformulator.UNPROVIDED) {
            settings = nl_reformulator.$nl_reformulator_settings$.getDynamicValue();
        }
        if (evaluate_resultsP == nl_reformulator.UNPROVIDED) {
            evaluate_resultsP = parsing_vars.$evaluate_nl_reformulator_resultsP$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(nl_reformulator.$nl_reformulate_int_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cycl, mt, settings, evaluate_resultsP), (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 10493L)
    public static SubLObject nl_reformulate_int_cached_internal(final SubLObject cycl, final SubLObject mt, final SubLObject settings, final SubLObject evaluate_resultsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time_remaining = parsing_macros.parsing_timeout_time_remaining();
        SubLObject timed_outP = Equality.eql((SubLObject)nl_reformulator.ZERO_INTEGER, time_remaining);
        SubLObject new_cycl = cycl;
        final SubLObject reformulator_settings = ConsesLow.append((SubLObject)ConsesLow.list((SubLObject)nl_reformulator.$kw47$MAX_TIME, time_remaining), settings);
        if (nl_reformulator.NIL == timed_outP) {
            final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
            try {
                wff_vars.$permit_keyword_variablesP$.bind((SubLObject)nl_reformulator.T, thread);
                if (nl_reformulator.NIL != list_utilities.proper_list_p(cycl) && nl_reformulator.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)nl_reformulator.$sym48$LISTP), cycl, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED, (SubLObject)nl_reformulator.UNPROVIDED)) {
                    SubLObject first_pass = (SubLObject)nl_reformulator.NIL;
                    if (nl_reformulator.NIL == timed_outP) {
                        SubLObject csome_list_var = cycl;
                        SubLObject item = (SubLObject)nl_reformulator.NIL;
                        item = csome_list_var.first();
                        while (nl_reformulator.NIL == timed_outP && nl_reformulator.NIL != csome_list_var) {
                            thread.resetMultipleValues();
                            final SubLObject new_item = nl_reformulate_int_cached(item, mt, settings, (SubLObject)nl_reformulator.UNPROVIDED);
                            final SubLObject timeP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (nl_reformulator.NIL != timeP) {
                                timed_outP = (SubLObject)nl_reformulator.T;
                            }
                            else {
                                first_pass = (SubLObject)ConsesLow.cons(new_item, first_pass);
                            }
                            csome_list_var = csome_list_var.rest();
                            item = csome_list_var.first();
                        }
                    }
                    if (nl_reformulator.NIL == timed_outP) {
                        thread.resetMultipleValues();
                        final SubLObject reformulated_cycl = reformulator_hub.reformulate_cycl(Sequences.nreverse(first_pass), mt, reformulator_settings);
                        final SubLObject justifications = thread.secondMultipleValue();
                        final SubLObject max_time = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        new_cycl = reformulated_cycl;
                        if (nl_reformulator.NIL != max_time) {
                            timed_outP = (SubLObject)nl_reformulator.T;
                        }
                    }
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject reformulated_cycl2 = reformulator_hub.reformulate_cycl(cycl, mt, reformulator_settings);
                    final SubLObject justifications2 = thread.secondMultipleValue();
                    final SubLObject max_time2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    new_cycl = reformulated_cycl2;
                    if (nl_reformulator.NIL != max_time2) {
                        timed_outP = (SubLObject)nl_reformulator.T;
                    }
                }
                if (nl_reformulator.NIL != evaluate_resultsP) {
                    thread.resetMultipleValues();
                    final SubLObject evaluated = relation_evaluation.cyc_evaluate(new_cycl);
                    final SubLObject evaluatedP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (nl_reformulator.NIL != evaluatedP) {
                        new_cycl = evaluated;
                    }
                }
            }
            finally {
                wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(new_cycl, timed_outP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-reformulator.lisp", position = 10493L)
    public static SubLObject nl_reformulate_int_cached(final SubLObject cycl, SubLObject mt, SubLObject settings, SubLObject evaluate_resultsP) {
        if (mt == nl_reformulator.UNPROVIDED) {
            mt = parsing_vars.$parsing_domain_mt$.getDynamicValue();
        }
        if (settings == nl_reformulator.UNPROVIDED) {
            settings = nl_reformulator.$nl_reformulator_settings$.getDynamicValue();
        }
        if (evaluate_resultsP == nl_reformulator.UNPROVIDED) {
            evaluate_resultsP = parsing_vars.$evaluate_nl_reformulator_resultsP$.getDynamicValue();
        }
        SubLObject caching_state = nl_reformulator.$nl_reformulate_int_cached_caching_state$.getGlobalValue();
        if (nl_reformulator.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)nl_reformulator.$sym46$NL_REFORMULATE_INT_CACHED, (SubLObject)nl_reformulator.$sym49$_NL_REFORMULATE_INT_CACHED_CACHING_STATE_, (SubLObject)nl_reformulator.$int50$256, (SubLObject)nl_reformulator.EQUAL, (SubLObject)nl_reformulator.FOUR_INTEGER, (SubLObject)nl_reformulator.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(cycl, mt, settings, evaluate_resultsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)nl_reformulator.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)nl_reformulator.NIL;
            collision = cdolist_list_var.first();
            while (nl_reformulator.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cycl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (settings.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (nl_reformulator.NIL != cached_args && nl_reformulator.NIL == cached_args.rest() && evaluate_resultsP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_reformulate_int_cached_internal(cycl, mt, settings, evaluate_resultsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cycl, mt, settings, evaluate_resultsP));
        return memoization_state.caching_results(results3);
    }
    
    public static SubLObject declare_nl_reformulator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "get_nl_reformulator_time", "GET-NL-REFORMULATOR-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_ref_reset_metrics", "NL-REF-RESET-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_ref_report_metrics", "NL-REF-REPORT-METRICS", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_reformulator", "memoizing_nl_reformulator", "MEMOIZING-NL-REFORMULATOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_reformulate_cycls", "NL-REFORMULATE-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "add_or_change_nl_reformulator_settings", "ADD-OR-CHANGE-NL-REFORMULATOR-SETTINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_reformulate", "NL-REFORMULATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_reformulate_enqueue", "NL-REFORMULATE-ENQUEUE", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_reformulate_dequeue", "NL-REFORMULATE-DEQUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_reformulate_daemon", "NL-REFORMULATE-DAEMON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_reformulate_daemon_maybe_warn_about_wait_time", "NL-REFORMULATE-DAEMON-MAYBE-WARN-ABOUT-WAIT-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_reformulate_daemon_busy_p", "NL-REFORMULATE-DAEMON-BUSY-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_reformulate_daemon_run", "NL-REFORMULATE-DAEMON-RUN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "launch_or_restart_nl_reformulate_daemon", "LAUNCH-OR-RESTART-NL-REFORMULATE-DAEMON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_reformulate_daemon_quit", "NL-REFORMULATE-DAEMON-QUIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "abort_nl_reformulate_daemon", "ABORT-NL-REFORMULATE-DAEMON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "clear_nl_reformulator_caches", "CLEAR-NL-REFORMULATOR-CACHES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_reformulator", "skipping_nl_reformulator_modules", "SKIPPING-NL-REFORMULATOR-MODULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_ref_remove_modules", "NL-REF-REMOVE-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "clear_nl_reformulate_int_cached", "CLEAR-NL-REFORMULATE-INT-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "remove_nl_reformulate_int_cached", "REMOVE-NL-REFORMULATE-INT-CACHED", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_reformulate_int_cached_internal", "NL-REFORMULATE-INT-CACHED-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_reformulator", "nl_reformulate_int_cached", "NL-REFORMULATE-INT-CACHED", 1, 3, false);
        return (SubLObject)nl_reformulator.NIL;
    }
    
    public static SubLObject init_nl_reformulator_file() {
        nl_reformulator.$nl_reformulator_time$ = SubLFiles.defparameter("*NL-REFORMULATOR-TIME*", (SubLObject)nl_reformulator.ZERO_INTEGER);
        nl_reformulator.$nl_reformulations_total$ = SubLFiles.defparameter("*NL-REFORMULATIONS-TOTAL*", (SubLObject)nl_reformulator.ZERO_INTEGER);
        nl_reformulator.$nl_reformulations_simplified$ = SubLFiles.defparameter("*NL-REFORMULATIONS-SIMPLIFIED*", (SubLObject)nl_reformulator.ZERO_INTEGER);
        nl_reformulator.$nl_ref_show_reformulationsP$ = SubLFiles.deflexical("*NL-REF-SHOW-REFORMULATIONS?*", (SubLObject)nl_reformulator.NIL);
        nl_reformulator.$nl_reformulator_settings$ = SubLFiles.defvar("*NL-REFORMULATOR-SETTINGS*", (SubLObject)nl_reformulator.NIL);
        nl_reformulator.$nl_reformulate_queue$ = SubLFiles.deflexical("*NL-REFORMULATE-QUEUE*", (SubLObject)((nl_reformulator.NIL != Symbols.boundp((SubLObject)nl_reformulator.$sym19$_NL_REFORMULATE_QUEUE_)) ? nl_reformulator.$nl_reformulate_queue$.getGlobalValue() : nl_reformulator.NIL));
        nl_reformulator.$nl_reformulate_daemon$ = SubLFiles.deflexical("*NL-REFORMULATE-DAEMON*", (SubLObject)((nl_reformulator.NIL != Symbols.boundp((SubLObject)nl_reformulator.$sym22$_NL_REFORMULATE_DAEMON_)) ? nl_reformulator.$nl_reformulate_daemon$.getGlobalValue() : nl_reformulator.NIL));
        nl_reformulator.$within_nl_reformulate_daemon$ = SubLFiles.defparameter("*WITHIN-NL-REFORMULATE-DAEMON*", (SubLObject)nl_reformulator.NIL);
        nl_reformulator.$nl_reformulate_int_cached_caching_state$ = SubLFiles.deflexical("*NL-REFORMULATE-INT-CACHED-CACHING-STATE*", (SubLObject)nl_reformulator.NIL);
        return (SubLObject)nl_reformulator.NIL;
    }
    
    public static SubLObject setup_nl_reformulator_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)nl_reformulator.$sym19$_NL_REFORMULATE_QUEUE_);
        subl_macro_promotions.declare_defglobal((SubLObject)nl_reformulator.$sym22$_NL_REFORMULATE_DAEMON_);
        memoization_state.note_globally_cached_function((SubLObject)nl_reformulator.$sym46$NL_REFORMULATE_INT_CACHED);
        return (SubLObject)nl_reformulator.NIL;
    }
    
    public void declareFunctions() {
        declare_nl_reformulator_file();
    }
    
    public void initializeVariables() {
        init_nl_reformulator_file();
    }
    
    public void runTopLevelForms() {
        setup_nl_reformulator_file();
    }
    
    static {
        me = (SubLFile)new nl_reformulator();
        nl_reformulator.$nl_reformulator_time$ = null;
        nl_reformulator.$nl_reformulations_total$ = null;
        nl_reformulator.$nl_reformulations_simplified$ = null;
        nl_reformulator.$nl_ref_show_reformulationsP$ = null;
        nl_reformulator.$nl_reformulator_settings$ = null;
        nl_reformulator.$nl_reformulate_queue$ = null;
        nl_reformulator.$nl_reformulate_daemon$ = null;
        nl_reformulator.$within_nl_reformulate_daemon$ = null;
        nl_reformulator.$nl_reformulate_int_cached_caching_state$ = null;
        $str0$__Spent__4_2F_seconds_reformulati = SubLObjectFactory.makeString("~&Spent ~4,2F seconds reformulating.");
        $str1$__D_of__D_items_passed_through_th = SubLObjectFactory.makeString(" ~D of ~D items passed through the Reformulator were simplified.~%");
        $sym2$WITH_NEW_REFORMULATOR_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-NEW-REFORMULATOR-MEMOIZATION-STATE");
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-REFORMULATOR-SETTINGS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-OR-CHANGE-NL-REFORMULATOR-SETTINGS"), (SubLObject)SubLObjectFactory.makeKeyword("CLEAR-CACHES?"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE"))));
        $sym5$MEMOIZATION_STATE_P = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-P");
        $kw6$CLEAR_CACHES_ = SubLObjectFactory.makeKeyword("CLEAR-CACHES?");
        $kw7$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $sym8$NL_REFORMULATE = SubLObjectFactory.makeSymbol("NL-REFORMULATE");
        $float9$1_1 = (SubLFloat)SubLObjectFactory.makeDouble(1.1);
        $kw10$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $float11$0_001 = (SubLFloat)SubLObjectFactory.makeDouble(0.001);
        $kw12$WORKING = SubLObjectFactory.makeKeyword("WORKING");
        $float13$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $str14$Forcing_timeout_of_NL_reformulato = SubLObjectFactory.makeString("Forcing timeout of NL reformulator daemon ~S after ~S seconds");
        $str15$Forcing_timeout_of_NL_reformulato = SubLObjectFactory.makeString("Forcing timeout of NL reformulator daemon ~S after hard timeout");
        $str16$Hard_timeout_of__S_seconds_reache = SubLObjectFactory.makeString("Hard timeout of ~S seconds reached in~% (NL-REFORMULATE ~S ~S)");
        $str17$Alloted_time_of__S_seconds_reache = SubLObjectFactory.makeString("Alloted time of ~S seconds reached in~% (NL-REFORMULATE ~S ~S)");
        $str18$__Reformulated__S___to__S_in___3F = SubLObjectFactory.makeString("~&Reformulated ~S~% to ~S in ~,3F seconds.~%");
        $sym19$_NL_REFORMULATE_QUEUE_ = SubLObjectFactory.makeSymbol("*NL-REFORMULATE-QUEUE*");
        $str20$NL_REFORMULATE_DAEMON_given_non_u = SubLObjectFactory.makeString("NL-REFORMULATE-DAEMON given non-unknown result: ~S");
        $kw21$QUEUED = SubLObjectFactory.makeKeyword("QUEUED");
        $sym22$_NL_REFORMULATE_DAEMON_ = SubLObjectFactory.makeSymbol("*NL-REFORMULATE-DAEMON*");
        $str23$NL_Reformulator_Daemon_already_ha = SubLObjectFactory.makeString("NL Reformulator Daemon already has ~S request(s) queued up. This may take a little while.");
        $str24$Run = SubLObjectFactory.makeString("Run");
        $kw25$NL_REFORMULATE_DAEMON_QUIT = SubLObjectFactory.makeKeyword("NL-REFORMULATE-DAEMON-QUIT");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("SETTINGS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("HARD-TIMEOUT"));
        $sym27$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $int28$1000 = SubLObjectFactory.makeInteger(1000);
        $int29$24 = SubLObjectFactory.makeInteger(24);
        $int30$3600 = SubLObjectFactory.makeInteger(3600);
        $kw31$TIMED_OUT = SubLObjectFactory.makeKeyword("TIMED-OUT");
        $kw32$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str33$Aborting__S = SubLObjectFactory.makeString("Aborting ~S");
        $str34$_S_didn_t_die_immediately_ = SubLObjectFactory.makeString("~S didn't die immediately.");
        $str35$_S_didn_t_die_after_1_second__Att = SubLObjectFactory.makeString("~S didn't die after 1 second. Attempting KILL-PROCESS...");
        $str36$_S_still_didn_t_die_immediately_ = SubLObjectFactory.makeString("~S still didn't die immediately.");
        $str37$_S_didn_t_die_after_1_second_ = SubLObjectFactory.makeString("~S didn't die after 1 second.");
        $str38$OK__Now_it_s_dead___S = SubLObjectFactory.makeString("OK. Now it's dead: ~S");
        $str39$NL_Reformulate_Daemon = SubLObjectFactory.makeString("NL Reformulate Daemon");
        $sym40$NL_REFORMULATE_DAEMON_RUN = SubLObjectFactory.makeSymbol("NL-REFORMULATE-DAEMON-RUN");
        $sym41$NL_REFORMULATE_DAEMON_QUIT = SubLObjectFactory.makeSymbol("NL-REFORMULATE-DAEMON-QUIT");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULES"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym43$_NL_REFORMULATOR_SETTINGS_ = SubLObjectFactory.makeSymbol("*NL-REFORMULATOR-SETTINGS*");
        $sym44$NL_REF_REMOVE_MODULES = SubLObjectFactory.makeSymbol("NL-REF-REMOVE-MODULES");
        $kw45$IGNORE_RL_MODULES = SubLObjectFactory.makeKeyword("IGNORE-RL-MODULES");
        $sym46$NL_REFORMULATE_INT_CACHED = SubLObjectFactory.makeSymbol("NL-REFORMULATE-INT-CACHED");
        $kw47$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $sym48$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym49$_NL_REFORMULATE_INT_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NL-REFORMULATE-INT-CACHED-CACHING-STATE*");
        $int50$256 = SubLObjectFactory.makeInteger(256);
    }
}

/*

	Total time: 403 ms
	
*/