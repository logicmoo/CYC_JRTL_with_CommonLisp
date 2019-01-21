package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class agenda extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.agenda";
    public static final String myFingerPrint = "33b62fc74ce6d070d3b0b5c900a15374294a736721ce77da481f2cbbe0c3a094";
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 799L)
    private static SubLSymbol $agenda_should_quit$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 846L)
    private static SubLSymbol $restart_agenda_flag$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 1273L)
    private static SubLSymbol $within_agenda$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 1549L)
    private static SubLSymbol $default_agenda_package$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 1675L)
    private static SubLSymbol $agenda_resourcing_spaces$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 2454L)
    private static SubLSymbol $agenda_process_name$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 4674L)
    private static SubLSymbol $agenda_process$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 5572L)
    private static SubLSymbol $agenda_process_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 7057L)
    private static SubLSymbol $agenda_error_modes$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 7268L)
    private static SubLSymbol $agenda_error_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 7603L)
    private static SubLSymbol $agenda_log_file$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 9213L)
    private static SubLSymbol $agenda_action_table$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 9429L)
    private static SubLSymbol $agenda_action_table_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 11226L)
    private static SubLSymbol $transcript_queue_worry_size$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 11342L)
    private static SubLSymbol $save_transcript_quantum$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 11432L)
    private static SubLSymbol $next_save_transcript_time$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 12082L)
    private static SubLSymbol $worry_transmit_quantum$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 12230L)
    private static SubLSymbol $worry_transmit_size$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 12278L)
    private static SubLSymbol $next_worry_transmit_time$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 17585L)
    private static SubLSymbol $normal_transmit_quantum$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 17731L)
    private static SubLSymbol $next_normal_transmit_time$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 18774L)
    private static SubLSymbol $load_transcript_quantum$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 18887L)
    private static SubLSymbol $next_load_transcript_time$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 18956L)
    private static SubLSymbol $last_receiving_remote_operationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 19804L)
    public static SubLSymbol $save_recent_experienceP$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 20001L)
    private static SubLSymbol $save_experience_transcript_quantum$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 20083L)
    private static SubLSymbol $next_save_experience_transcript_time$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 20561L)
    public static SubLSymbol $auto_flush_logsP$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 20735L)
    private static SubLSymbol $auto_flush_logs_transcript_quantum$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 20815L)
    private static SubLSymbol $next_auto_flush_logs_transcript_time$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 21257L)
    private static SubLSymbol $save_asked_queries_transcript_quantum$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 21407L)
    private static SubLSymbol $next_save_asked_queries_transcript_time$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 21924L)
    private static SubLSymbol $next_sksi_global_resourcing_monitor_time$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 21924L)
    private static SubLSymbol $sksi_monitor_global_resourcing_time_delta$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 24539L)
    private static SubLSymbol $agenda_daily_gc_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 25034L)
    private static SubLSymbol $agenda_daily_gc_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 25162L)
    private static SubLSymbol $agenda_daily_gc_time_of_day$;
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 26117L)
    private static SubLSymbol $next_agenda_daily_gc_time$;
    private static final SubLSymbol $sym0$_AGENDA_SHOULD_QUIT_;
    private static final SubLSymbol $sym1$_RESTART_AGENDA_FLAG_;
    private static final SubLString $str2$CYC;
    private static final SubLString $str3$Idle;
    private static final SubLSymbol $sym4$AGENDA_WORK_TO_DO;
    private static final SubLString $str5$Cyc_Agenda;
    private static final SubLSymbol $sym6$AGENDA_TOP_LEVEL;
    private static final SubLSymbol $sym7$_AGENDA_PROCESS_;
    private static final SubLSymbol $sym8$AGENDA_RUNNING;
    private static final SubLString $str9$None;
    private static final SubLString $str10$Agenda_Process_Lock;
    private static final SubLSymbol $kw11$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym12$IGNORE_ERRORS_HANDLER;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$_AGENDA_ERROR_MODE_;
    private static final SubLSymbol $kw15$HALT;
    private static final SubLSymbol $kw16$LOG;
    private static final SubLSymbol $sym17$_AGENDA_ACTION_TABLE_;
    private static final SubLString $str18$Agenda_Action_Table_Lock;
    private static final SubLSymbol $sym19$SYMBOLP;
    private static final SubLSymbol $sym20$NUMBERP;
    private static final SubLSymbol $sym21$_;
    private static final SubLSymbol $sym22$AGENDA_TASK_PRIORITY;
    private static final SubLSymbol $sym23$FIRST;
    private static final SubLSymbol $sym24$AGENDA_SHOULD_QUIT_;
    private static final SubLSymbol $sym25$DO_NOTHING;
    private static final SubLSymbol $sym26$RESTART_AGENDA_FLAG_;
    private static final SubLInteger $int27$60;
    private static final SubLSymbol $sym28$_NEXT_SAVE_TRANSCRIPT_TIME_;
    private static final SubLSymbol $sym29$SAVE_OPERATIONS_;
    private static final SubLSymbol $sym30$SAVE_LOCAL_OPERATIONS;
    private static final SubLInteger $int31$1000;
    private static final SubLSymbol $sym32$_NEXT_WORRY_TRANSMIT_TIME_;
    private static final SubLSymbol $sym33$WORRY_TRANSMIT_OPERATIONS_;
    private static final SubLSymbol $sym34$WORRY_TRANSMIT_OPERATIONS;
    private static final SubLSymbol $sym35$RUN_ONE_AUXILIARY_OP;
    private static final SubLSymbol $sym36$RUN_AUXILIARY_OP_;
    private static final SubLSymbol $sym37$RUN_ONE_AUXILIARY_OP_IN_AGENDA;
    private static final SubLSymbol $sym38$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str39$_A;
    private static final SubLSymbol $sym40$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$CERROR;
    private static final SubLString $str44$Continue_the_agenda;
    private static final SubLString $str45$__Last_operation___S____;
    private static final SubLString $str46$FI_error___A;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$WARN;
    private static final SubLString $str49$FI_warning___A;
    private static final SubLSymbol $sym50$CSETQ;
    private static final SubLSymbol $kw51$DEBUG;
    private static final SubLSymbol $kw52$AGENDA_ABORT;
    private static final SubLSymbol $sym53$AGENDA_THROW_ERROR_MESSAGE;
    private static final SubLSymbol $kw54$IGNORE;
    private static final SubLSymbol $sym55$RUN_LOCAL_OP_;
    private static final SubLSymbol $sym56$RUN_ONE_LOCAL_OP_IN_AGENDA;
    private static final SubLInteger $int57$25;
    private static final SubLSymbol $kw58$APPEND;
    private static final SubLString $str59$Unable_to_open__S;
    private static final SubLString $str60$_s__;
    private static final SubLSymbol $sym61$FI_TIMESTAMP_ASSERTION;
    private static final SubLObject $const62$Guest;
    private static final SubLList $list63;
    private static final SubLInteger $int64$120;
    private static final SubLSymbol $sym65$_NEXT_NORMAL_TRANSMIT_TIME_;
    private static final SubLSymbol $sym66$NORMAL_TRANSMIT_OPERATIONS_;
    private static final SubLSymbol $sym67$NORMAL_TRANSMIT_OPERATIONS;
    private static final SubLInteger $int68$35;
    private static final SubLSymbol $sym69$RUN_ONE_REMOTE_OP;
    private static final SubLSymbol $sym70$RUN_REMOTE_OP_;
    private static final SubLSymbol $sym71$RUN_ONE_REMOTE_OP_IN_AGENDA;
    private static final SubLInteger $int72$40;
    private static final SubLSymbol $sym73$_NEXT_LOAD_TRANSCRIPT_TIME_;
    private static final SubLSymbol $sym74$_LAST_RECEIVING_REMOTE_OPERATIONS__;
    private static final SubLSymbol $sym75$LOAD_OPERATIONS_;
    private static final SubLSymbol $sym76$LOAD_REMOTE_OPERATIONS;
    private static final SubLInteger $int77$45;
    private static final SubLSymbol $sym78$_NEXT_SAVE_EXPERIENCE_TRANSCRIPT_TIME_;
    private static final SubLSymbol $sym79$SAVE_EXPERIENCE_;
    private static final SubLSymbol $sym80$SAVE_LOCAL_EXPERIENCE;
    private static final SubLSymbol $sym81$_NEXT_AUTO_FLUSH_LOGS_TRANSCRIPT_TIME_;
    private static final SubLSymbol $sym82$AUTO_FLUSH_LOGS_;
    private static final SubLSymbol $sym83$AUTO_FLUSH_LOGS;
    private static final SubLSymbol $sym84$_NEXT_SAVE_ASKED_QUERIES_TRANSCRIPT_TIME_;
    private static final SubLSymbol $sym85$AGENDA_SAVE_ASKED_QUERIES_;
    private static final SubLSymbol $sym86$SAVE_LOCAL_ASKED_QUERIES;
    private static final SubLInteger $int87$30;
    private static final SubLSymbol $sym88$_NEXT_SKSI_GLOBAL_RESOURCING_MONITOR_TIME_;
    private static final SubLSymbol $sym89$MONITOR_SKSI_GLOBAL_RESOURCING_;
    private static final SubLSymbol $sym90$MONITOR_SKSI_GLOBAL_RESOURCING;
    private static final SubLInteger $int91$43;
    private static final SubLString $str92$Agenda_Daily_GC;
    private static final SubLSymbol $sym93$_AGENDA_DAILY_GC_ENABLED_;
    private static final SubLSymbol $sym94$_AGENDA_DAILY_GC_TIME_OF_DAY_;
    private static final SubLList $list95;
    private static final SubLInteger $int96$23;
    private static final SubLString $str97$Hour_must_be_an_integer_in_the_ra;
    private static final SubLInteger $int98$59;
    private static final SubLString $str99$Minute_must_be_an_integer_in_the_;
    private static final SubLString $str100$Second_must_be_an_integer_in_the_;
    private static final SubLSymbol $sym101$_NEXT_AGENDA_DAILY_GC_TIME_;
    private static final SubLString $str102$Doing_Agenda_Daily_GC_at_;
    private static final SubLSymbol $sym103$AGENDA_DAILY_GC_READY_P;
    private static final SubLSymbol $sym104$DO_AGENDA_DAILY_GC;
    private static final SubLList $list105;
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 892L)
    public static SubLObject initialize_agenda() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        operation_communication.set_communication_mode(operation_communication.$startup_communication_mode$.getDynamicValue(thread));
        if (agenda.NIL != system_parameters.$start_agenda_at_startupP$.getDynamicValue(thread) && agenda.NIL == agenda_running()) {
            start_agenda((SubLObject)agenda.TEN_INTEGER);
        }
        return (SubLObject)agenda.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 1317L)
    public static SubLObject within_agenda() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return agenda.$within_agenda$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 1375L)
    public static SubLObject agenda_form_to_show() {
        return encapsulation.unencapsulate_partial(control_vars.$last_agenda_op$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 1797L)
    public static SubLObject agenda_top_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        start_agenda_process();
        if (agenda.NIL != current_process_is_agenda()) {
            Threads.set_process_priority(agenda_process(), Threads.$process_background_priority$.getGlobalValue());
            try {
                agenda_startup_actions();
                agenda.$restart_agenda_flag$.setGlobalValue((SubLObject)agenda.NIL);
                final SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
                try {
                    Packages.$package$.bind(agenda.$default_agenda_package$.getGlobalValue(), thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, agenda.$agenda_resourcing_spaces$.getDynamicValue(thread)), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)agenda.T, thread);
                        while (agenda.NIL == agenda.$agenda_should_quit$.getGlobalValue()) {
                            while (agenda.NIL == agenda.$agenda_should_quit$.getGlobalValue() && agenda.NIL != agenda_work_to_do()) {
                                perform_one_agenda_action();
                            }
                            Threads.process_wait((SubLObject)agenda.$str3$Idle, Symbols.symbol_function((SubLObject)agenda.$sym4$AGENDA_WORK_TO_DO));
                        }
                    }
                    finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                finally {
                    Packages.$package$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)agenda.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    process_utilities.current_process_clear_form();
                    clear_agenda_process();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 2512L)
    public static SubLObject start_agenda(SubLObject waitP) {
        if (waitP == agenda.UNPROVIDED) {
            waitP = (SubLObject)agenda.NIL;
        }
        if (agenda.NIL != agenda_running()) {
            halt_agenda((SubLObject)agenda.UNPROVIDED);
        }
        agenda.$agenda_should_quit$.setGlobalValue((SubLObject)agenda.NIL);
        Threads.make_process(agenda.$agenda_process_name$.getGlobalValue(), Symbols.symbol_function((SubLObject)agenda.$sym6$AGENDA_TOP_LEVEL));
        if (agenda.NIL != waitP) {
            wait_for_agenda_running(waitP);
        }
        return agenda_running();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 2868L)
    public static SubLObject restart_agenda(SubLObject waitP) {
        if (waitP == agenda.UNPROVIDED) {
            waitP = (SubLObject)agenda.NIL;
        }
        if (agenda.NIL != agenda_running()) {
            halt_agenda((SubLObject)agenda.TWENTY_INTEGER);
        }
        return start_agenda(waitP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 2995L)
    public static SubLObject halt_agenda(SubLObject waitP) {
        if (waitP == agenda.UNPROVIDED) {
            waitP = (SubLObject)agenda.NIL;
        }
        agenda.$agenda_should_quit$.setGlobalValue((SubLObject)agenda.T);
        if (agenda.NIL != agenda_running() && agenda.NIL != waitP) {
            wait_for_agenda_not_running(waitP);
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 3179L)
    public static SubLObject abort_agenda() {
        agenda.$agenda_should_quit$.setGlobalValue((SubLObject)agenda.T);
        if (agenda.NIL != agenda_running()) {
            Threads.kill_process(agenda_process());
            clear_agenda_process();
            return (SubLObject)agenda.T;
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 3760L)
    public static SubLObject abort_and_restart_agenda() {
        if (agenda.NIL != agenda_running()) {
            abort_agenda();
            return start_agenda((SubLObject)agenda.UNPROVIDED);
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 3935L)
    public static SubLObject wait_for_agenda_running(SubLObject wait_time) {
        if (wait_time == agenda.UNPROVIDED) {
            wait_time = (SubLObject)agenda.ONE_INTEGER;
        }
        final SubLObject time = numeric_date_utilities.time_from_now(wait_time);
        while (agenda.NIL == agenda_running() && agenda.NIL == Time.time_has_arrivedP(time)) {
            Threads.sleep((SubLObject)agenda.ONE_INTEGER);
        }
        return agenda_running();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 4160L)
    public static SubLObject wait_for_agenda_not_running(SubLObject wait_time) {
        if (wait_time == agenda.UNPROVIDED) {
            wait_time = (SubLObject)agenda.ONE_INTEGER;
        }
        final SubLObject time = numeric_date_utilities.time_from_now(wait_time);
        while (agenda.NIL != agenda_running() && agenda.NIL == Time.time_has_arrivedP(time)) {
            Threads.sleep((SubLObject)agenda.ONE_INTEGER);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL == agenda_running());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 4403L)
    public static SubLObject ensure_agenda_running() {
        agenda.$agenda_should_quit$.setGlobalValue((SubLObject)agenda.NIL);
        if (agenda.NIL == agenda_running()) {
            start_agenda((SubLObject)agenda.UNPROVIDED);
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 4984L)
    public static SubLObject agenda_process() {
        return agenda.$agenda_process$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 5045L)
    public static SubLObject agenda_running() {
        return Threads.valid_process_p(agenda_process());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 5125L)
    public static SubLObject agenda_state() {
        if (agenda.NIL != agenda_running()) {
            return Threads.process_whostate(agenda_process());
        }
        return (SubLObject)agenda.$str9$None;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 5252L)
    public static SubLObject current_process_is_agenda() {
        return Equality.eq(Threads.current_process(), agenda_process());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 5350L)
    public static SubLObject agenda_idleP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != agenda_running() && agenda.NIL != process_utilities.process_idleP(agenda_process()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 5461L)
    public static SubLObject agenda_busyP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != agenda_running() && agenda.NIL != process_utilities.process_busyP(agenda_process()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 5721L)
    public static SubLObject start_agenda_process() {
        SubLObject release = (SubLObject)agenda.NIL;
        try {
            release = Locks.seize_lock(agenda.$agenda_process_lock$.getGlobalValue());
            if (agenda.NIL == agenda.$agenda_process$.getGlobalValue()) {
                agenda.$agenda_process$.setGlobalValue(Threads.current_process());
            }
        }
        finally {
            if (agenda.NIL != release) {
                Locks.release_lock(agenda.$agenda_process_lock$.getGlobalValue());
            }
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 5931L)
    public static SubLObject clear_agenda_process() {
        SubLObject release = (SubLObject)agenda.NIL;
        try {
            release = Locks.seize_lock(agenda.$agenda_process_lock$.getGlobalValue());
            agenda.$agenda_process$.setGlobalValue((SubLObject)agenda.NIL);
        }
        finally {
            if (agenda.NIL != release) {
                Locks.release_lock(agenda.$agenda_process_lock$.getGlobalValue());
            }
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 6093L)
    public static SubLObject kill_spurious_agenda_processes() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spurious_agenda_processes = spurious_agenda_processes();
        SubLObject total = (SubLObject)agenda.ZERO_INTEGER;
        SubLObject cdolist_list_var = spurious_agenda_processes;
        SubLObject process = (SubLObject)agenda.NIL;
        process = cdolist_list_var.first();
        while (agenda.NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = (SubLObject)agenda.NIL;
            try {
                thread.throwStack.push(agenda.$kw11$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)agenda.$sym12$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        Threads.kill_process(process);
                        total = Numbers.add(total, (SubLObject)agenda.ONE_INTEGER);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)agenda.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)agenda.$kw11$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 6568L)
    public static SubLObject spurious_agenda_processes() {
        SubLObject spurious_agenda_processes = (SubLObject)agenda.NIL;
        SubLObject cdolist_list_var = Threads.all_processes();
        SubLObject process = (SubLObject)agenda.NIL;
        process = cdolist_list_var.first();
        while (agenda.NIL != cdolist_list_var) {
            if (agenda.$agenda_process_name$.getGlobalValue().equal(Threads.process_name(process)) && !process.eql(agenda_process())) {
                spurious_agenda_processes = (SubLObject)ConsesLow.cons(process, spurious_agenda_processes);
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        }
        return Sequences.nreverse(spurious_agenda_processes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 7207L)
    public static SubLObject agenda_error_modes() {
        return agenda.$agenda_error_modes$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 7315L)
    public static SubLObject agenda_error_mode() {
        return agenda.$agenda_error_mode$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 7381L)
    public static SubLObject set_agenda_error_mode(final SubLObject mode) {
        if (agenda.NIL != subl_promotions.memberP(mode, agenda.$agenda_error_modes$.getGlobalValue(), (SubLObject)agenda.UNPROVIDED, (SubLObject)agenda.UNPROVIDED)) {
            agenda.$agenda_error_mode$.setGlobalValue(mode);
            return mode;
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 7525L)
    public static SubLObject agenda_logs_errorsP() {
        return Equality.eq(agenda_error_mode(), (SubLObject)agenda.$kw16$LOG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 7712L)
    public static SubLObject set_agenda_log_file(final SubLObject file_path) {
        if (agenda.NIL != file_utilities.file_valid_for_writing_p(file_path)) {
            agenda.$agenda_log_file$.setDynamicValue(file_path);
            return file_path;
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 7883L)
    public static SubLObject get_agenda_log_file() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return agenda.$agenda_log_file$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 7952L)
    public static SubLObject clear_agenda_log_file() {
        agenda.$agenda_log_file$.setDynamicValue((SubLObject)agenda.NIL);
        return get_agenda_log_file();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 8059L)
    public static SubLObject agenda_startup_actions() {
        if (agenda.NIL == transcript_utilities.local_transcript()) {
            transcript_utilities.new_local_transcript();
        }
        if (agenda.NIL == transcript_utilities.master_transcript()) {
            transcript_utilities.set_master_transcript((SubLObject)agenda.UNPROVIDED);
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 8336L)
    public static SubLObject agenda_work_to_do() {
        SubLObject cdolist_list_var = agenda_tasks();
        SubLObject agenda_task = (SubLObject)agenda.NIL;
        agenda_task = cdolist_list_var.first();
        while (agenda.NIL != cdolist_list_var) {
            final SubLObject test = agenda_task_test(agenda_task);
            if (agenda.NIL != Symbols.fboundp(test) && agenda.NIL != Functions.funcall(test)) {
                final SubLObject action = agenda_task_action(agenda_task);
                if (agenda.NIL != Symbols.fboundp(action)) {
                    return agenda_task;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            agenda_task = cdolist_list_var.first();
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 8688L)
    public static SubLObject clear_agenda_halt_explanation() {
        control_vars.$last_agenda_error_message$.setGlobalValue((SubLObject)agenda.NIL);
        control_vars.$last_agenda_error_explanatory_supports$.setGlobalValue((SubLObject)agenda.NIL);
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 8903L)
    public static SubLObject perform_one_agenda_action() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_agenda_halt_explanation();
        final SubLObject agenda_task = agenda_work_to_do();
        if (agenda.NIL != agenda_task) {
            final SubLObject action = agenda_task_action(agenda_task);
            final SubLObject _prev_bind_0 = agenda.$within_agenda$.currentBinding(thread);
            try {
                agenda.$within_agenda$.bind((SubLObject)agenda.T, thread);
                Functions.funcall(action);
            }
            finally {
                agenda.$within_agenda$.rebind(_prev_bind_0, thread);
            }
        }
        return agenda_task;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 9580L)
    public static SubLObject declare_agenda_task(final SubLObject test, final SubLObject action, final SubLObject priority) {
        assert agenda.NIL != Types.symbolp(test) : test;
        assert agenda.NIL != Types.symbolp(action) : action;
        assert agenda.NIL != Types.numberp(priority) : priority;
        undeclare_agenda_task(test);
        SubLObject release = (SubLObject)agenda.NIL;
        try {
            release = Locks.seize_lock(agenda.$agenda_action_table_lock$.getGlobalValue());
            agenda.$agenda_action_table$.setGlobalValue(list_utilities.splice_into_sorted_list((SubLObject)ConsesLow.list(test, action, priority), agenda.$agenda_action_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)agenda.$sym21$_), Symbols.symbol_function((SubLObject)agenda.$sym22$AGENDA_TASK_PRIORITY)));
        }
        finally {
            if (agenda.NIL != release) {
                Locks.release_lock(agenda.$agenda_action_table_lock$.getGlobalValue());
            }
        }
        return test;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 10166L)
    public static SubLObject undeclare_agenda_task(final SubLObject test) {
        SubLObject release = (SubLObject)agenda.NIL;
        try {
            release = Locks.seize_lock(agenda.$agenda_action_table_lock$.getGlobalValue());
            agenda.$agenda_action_table$.setGlobalValue(Sequences.delete(test, agenda.$agenda_action_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)agenda.EQL), Symbols.symbol_function((SubLObject)agenda.$sym23$FIRST), (SubLObject)agenda.UNPROVIDED, (SubLObject)agenda.UNPROVIDED, (SubLObject)agenda.UNPROVIDED));
        }
        finally {
            if (agenda.NIL != release) {
                Locks.release_lock(agenda.$agenda_action_table_lock$.getGlobalValue());
            }
        }
        return test;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 10414L)
    public static SubLObject agenda_tasks() {
        return agenda.$agenda_action_table$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 10492L)
    public static SubLObject agenda_task_test(final SubLObject agenda_task) {
        return agenda_task.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 10569L)
    public static SubLObject agenda_task_action(final SubLObject agenda_task) {
        return conses_high.second(agenda_task);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 10649L)
    public static SubLObject agenda_task_priority(final SubLObject agenda_task) {
        return conses_high.third(agenda_task);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 10730L)
    public static SubLObject agenda_should_quitP() {
        return agenda.$agenda_should_quit$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 10920L)
    public static SubLObject do_nothing() {
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 11022L)
    public static SubLObject restart_agenda_flagP() {
        return agenda.$restart_agenda_flag$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 11501L)
    public static SubLObject save_operationsP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != operation_communication.saving_operationsP() && ((agenda.NIL != Time.time_has_arrivedP(agenda.$next_save_transcript_time$.getGlobalValue()) && agenda.NIL == operation_queues.transcript_queue_empty() && agenda.NIL != operation_queues.local_queue_empty()) || operation_queues.transcript_queue_size().numG(agenda.$transcript_queue_worry_size$.getGlobalValue())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 11786L)
    public static SubLObject save_local_operations() {
        agenda.$next_save_transcript_time$.setGlobalValue(numeric_date_utilities.time_from_now(Numbers.add(agenda.$save_transcript_quantum$.getGlobalValue(), random.random((SubLObject)agenda.TWENTY_INTEGER))));
        operation_communication.save_transcript_ops();
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 12346L)
    public static SubLObject worry_transmit_operationsP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != operation_communication.allow_transmitting() && ((agenda.NIL != Time.time_has_arrivedP(agenda.$next_worry_transmit_time$.getGlobalValue()) && agenda.NIL == operation_queues.transmit_queue_empty()) || operation_queues.transmit_queue_size().numGE(agenda.$worry_transmit_size$.getGlobalValue())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 12654L)
    public static SubLObject worry_transmit_operations() {
        agenda.$next_worry_transmit_time$.setGlobalValue(numeric_date_utilities.time_from_now(Numbers.add(agenda.$worry_transmit_quantum$.getGlobalValue(), random.random((SubLObject)agenda.TWENTY_INTEGER))));
        operation_communication.send_local_transcript();
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 13098L)
    public static SubLObject run_auxiliary_opP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != operation_communication.process_auxiliary_operationsP() && agenda.NIL == operation_queues.auxiliary_queue_empty());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 13285L)
    public static SubLObject run_one_auxiliary_op_in_agenda() {
        return run_one_non_local_op_in_agenda((SubLObject)agenda.$sym35$RUN_ONE_AUXILIARY_OP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 13477L)
    public static SubLObject run_one_non_local_op_in_agenda(final SubLObject run_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)agenda.NIL;
        final SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$fi_warning$.currentBinding(thread);
        try {
            fi.$fi_error$.bind((SubLObject)agenda.NIL, thread);
            fi.$fi_warning$.bind((SubLObject)agenda.NIL, thread);
            final SubLObject _prev_bind_0_$2 = Errors.$continue_cerrorP$.currentBinding(thread);
            final SubLObject _prev_bind_1_$3 = api_control_vars.$use_local_queueP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = control_vars.$use_transcriptP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = operation_queues.$within_a_remote_opP$.currentBinding(thread);
            try {
                Errors.$continue_cerrorP$.bind((SubLObject)agenda.T, thread);
                api_control_vars.$use_local_queueP$.bind((SubLObject)agenda.NIL, thread);
                control_vars.$use_transcriptP$.bind((SubLObject)agenda.NIL, thread);
                operation_queues.$within_a_remote_opP$.bind((SubLObject)agenda.T, thread);
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)agenda.$sym38$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            Functions.funcall(run_method);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)agenda.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                operation_queues.$within_a_remote_opP$.rebind(_prev_bind_4, thread);
                control_vars.$use_transcriptP$.rebind(_prev_bind_3, thread);
                api_control_vars.$use_local_queueP$.rebind(_prev_bind_1_$3, thread);
                Errors.$continue_cerrorP$.rebind(_prev_bind_0_$2, thread);
            }
            if (agenda.NIL == error_message) {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)agenda.$sym38$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            handle_agenda_fi_error_state();
                        }
                        catch (Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, (SubLObject)agenda.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    error_message = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            if (agenda.NIL != error_message) {
                Errors.warn((SubLObject)agenda.$str39$_A, error_message);
            }
        }
        finally {
            fi.$fi_warning$.rebind(_prev_bind_2, thread);
            fi.$fi_error$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 14062L)
    public static SubLObject handle_agenda_fi_error_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject was_appendingP = Eval.eval((SubLObject)agenda.$sym40$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
        Eval.eval((SubLObject)agenda.$list41);
        try {
            if (agenda.NIL != fi.fi_error_signaledP()) {
                SubLObject current;
                final SubLObject datum = current = fi.fi_get_error_int();
                SubLObject error = (SubLObject)agenda.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)agenda.$list42);
                error = current.first();
                current = current.rest();
                final SubLObject format_string = (SubLObject)(current.isCons() ? current.first() : agenda.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)agenda.$list42);
                final SubLObject args;
                current = (args = current.rest());
                Functions.apply(Symbols.symbol_function((SubLObject)agenda.$sym43$CERROR), (SubLObject)agenda.$str44$Continue_the_agenda, new SubLObject[] { Sequences.cconcatenate((SubLObject)agenda.$str45$__Last_operation___S____, (agenda.NIL != format_string) ? format_string : PrintLow.format((SubLObject)agenda.NIL, (SubLObject)agenda.$str46$FI_error___A, error)), agenda_form_to_show(), args });
                fi.reset_fi_error();
            }
            else if (agenda.NIL != control_vars.$agenda_display_fi_warnings$.getDynamicValue(thread) && agenda.NIL == Errors.$ignore_warnsP$.getDynamicValue(thread) && agenda.NIL != fi.fi_warning_signaledP()) {
                SubLObject current;
                final SubLObject datum = current = fi.fi_get_warning_int();
                SubLObject warning = (SubLObject)agenda.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)agenda.$list47);
                warning = current.first();
                current = current.rest();
                final SubLObject format_string = (SubLObject)(current.isCons() ? current.first() : agenda.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)agenda.$list47);
                final SubLObject args;
                current = (args = current.rest());
                Functions.apply(Symbols.symbol_function((SubLObject)agenda.$sym48$WARN), Sequences.cconcatenate((SubLObject)agenda.$str45$__Last_operation___S____, (agenda.NIL != format_string) ? format_string : PrintLow.format((SubLObject)agenda.NIL, (SubLObject)agenda.$str49$FI_warning___A, warning)), new SubLObject[] { agenda_form_to_show(), args });
                fi.reset_fi_warning();
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)agenda.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                Eval.eval((SubLObject)ConsesLow.list((SubLObject)agenda.$sym50$CSETQ, (SubLObject)agenda.$sym40$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 15166L)
    public static SubLObject run_local_opP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != operation_communication.process_local_operationsP() && agenda.NIL == operation_queues.local_queue_empty());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 15330L)
    public static SubLObject run_one_local_op_in_agenda() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)agenda.NIL;
        final SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$fi_warning$.currentBinding(thread);
        try {
            fi.$fi_error$.bind((SubLObject)agenda.NIL, thread);
            fi.$fi_warning$.bind((SubLObject)agenda.NIL, thread);
            SubLObject pcase_var = agenda_error_mode();
            if (pcase_var.eql((SubLObject)agenda.$kw51$DEBUG)) {
                try {
                    thread.throwStack.push(agenda.$kw52$AGENDA_ABORT);
                    final SubLObject _prev_bind_0_$6 = Errors.$error_abort_handler$.currentBinding(thread);
                    try {
                        Errors.$error_abort_handler$.bind(Symbols.symbol_function((SubLObject)agenda.$sym53$AGENDA_THROW_ERROR_MESSAGE), thread);
                        operation_queues.run_one_local_op();
                    }
                    finally {
                        Errors.$error_abort_handler$.rebind(_prev_bind_0_$6, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, (SubLObject)agenda.$kw52$AGENDA_ABORT);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            else {
                final SubLObject _prev_bind_0_$7 = Errors.$continue_cerrorP$.currentBinding(thread);
                try {
                    Errors.$continue_cerrorP$.bind((SubLObject)agenda.T, thread);
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)agenda.$sym38$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                operation_queues.run_one_local_op();
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)agenda.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var2) {
                        error_message = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                finally {
                    Errors.$continue_cerrorP$.rebind(_prev_bind_0_$7, thread);
                }
            }
            pcase_var = agenda_error_mode();
            if (pcase_var.eql((SubLObject)agenda.$kw54$IGNORE)) {
                if (agenda.NIL == error_message) {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)agenda.$sym38$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                handle_agenda_fi_error_state();
                            }
                            catch (Throwable catch_var2) {
                                Errors.handleThrowable(catch_var2, (SubLObject)agenda.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                if (agenda.NIL != error_message) {
                    Errors.warn((SubLObject)agenda.$str39$_A, error_message);
                }
            }
            else if (pcase_var.eql((SubLObject)agenda.$kw15$HALT)) {
                if (agenda.NIL == error_message) {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)agenda.$sym38$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                handle_agenda_fi_error_state();
                            }
                            catch (Throwable catch_var2) {
                                Errors.handleThrowable(catch_var2, (SubLObject)agenda.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                if (agenda.NIL != error_message) {
                    control_vars.$last_agenda_error_message$.setGlobalValue(error_message);
                    halt_agenda((SubLObject)agenda.UNPROVIDED);
                }
            }
            else if (pcase_var.eql((SubLObject)agenda.$kw51$DEBUG)) {
                handle_agenda_fi_error_state();
            }
            else if (pcase_var.eql((SubLObject)agenda.$kw16$LOG)) {
                if (agenda.NIL == error_message) {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)agenda.$sym38$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                handle_agenda_fi_error_state();
                            }
                            catch (Throwable catch_var2) {
                                Errors.handleThrowable(catch_var2, (SubLObject)agenda.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                if (agenda.NIL != error_message) {
                    log_agenda_error(control_vars.$last_agenda_op$.getGlobalValue());
                }
            }
        }
        finally {
            fi.$fi_warning$.rebind(_prev_bind_2, thread);
            fi.$fi_error$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 16597L)
    public static SubLObject agenda_throw_error_message() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Dynamic.sublisp_throw((SubLObject)agenda.$kw52$AGENDA_ABORT, Errors.$error_message$.getDynamicValue(thread));
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 16711L)
    public static SubLObject log_agenda_error(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timestamp = operation_queues.local_queue_peek();
        final SubLObject cyclist = operation_communication.the_cyclist();
        final SubLObject date = numeric_date_utilities.get_universal_date((SubLObject)agenda.UNPROVIDED, (SubLObject)agenda.UNPROVIDED);
        if (agenda.NIL == timestamp_operation_p(timestamp)) {
            timestamp = construct_generic_timestamp_operation();
        }
        final SubLObject output_op = (SubLObject)ConsesLow.list(encapsulation.encapsulate(cyclist), control_vars.cyc_image_id(), date, form);
        final SubLObject output_timestamp = (SubLObject)ConsesLow.list(encapsulation.encapsulate(cyclist), control_vars.cyc_image_id(), date, timestamp);
        SubLObject stream = (SubLObject)agenda.NIL;
        try {
            stream = compatibility.open_text(agenda.$agenda_log_file$.getDynamicValue(thread), (SubLObject)agenda.$kw58$APPEND);
            if (!stream.isStream()) {
                Errors.error((SubLObject)agenda.$str59$Unable_to_open__S, agenda.$agenda_log_file$.getDynamicValue(thread));
            }
            final SubLObject file = stream;
            PrintLow.format(file, (SubLObject)agenda.$str60$_s__, output_op);
            PrintLow.format(file, (SubLObject)agenda.$str60$_s__, output_timestamp);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)agenda.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)agenda.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 17319L)
    public static SubLObject timestamp_operation_p(final SubLObject operation) {
        return (SubLObject)SubLObjectFactory.makeBoolean(operation.isList() && operation.first() == agenda.$sym61$FI_TIMESTAMP_ASSERTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 17457L)
    public static SubLObject construct_generic_timestamp_operation() {
        return (SubLObject)ConsesLow.listS((SubLObject)agenda.$sym61$FI_TIMESTAMP_ASSERTION, encapsulation.encapsulate(agenda.$const62$Guest), (SubLObject)agenda.$list63);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 17800L)
    public static SubLObject normal_transmit_operationsP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != Time.time_has_arrivedP(agenda.$next_normal_transmit_time$.getGlobalValue()) && agenda.NIL == operation_queues.transmit_queue_empty() && agenda.NIL != operation_communication.allow_transmitting() && agenda.NIL != operation_queues.local_queue_empty() && agenda.NIL != operation_queues.transcript_queue_empty());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 18146L)
    public static SubLObject normal_transmit_operations() {
        agenda.$next_normal_transmit_time$.setGlobalValue(numeric_date_utilities.time_from_now(Numbers.add(agenda.$normal_transmit_quantum$.getGlobalValue(), random.random((SubLObject)agenda.TWENTY_INTEGER))));
        operation_communication.send_local_transcript();
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 18468L)
    public static SubLObject run_remote_opP() {
        return operation_communication.remote_operation_to_runP();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 18594L)
    public static SubLObject run_one_remote_op_in_agenda() {
        return run_one_non_local_op_in_agenda((SubLObject)agenda.$sym69$RUN_ONE_REMOTE_OP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 19016L)
    public static SubLObject load_operationsP() {
        final SubLObject receiveP = operation_communication.receiving_remote_operationsP();
        if (agenda.NIL != receiveP && agenda.NIL != agenda.$last_receiving_remote_operationsP$.getGlobalValue()) {
            return Time.time_has_arrivedP(agenda.$next_load_transcript_time$.getGlobalValue());
        }
        agenda.$last_receiving_remote_operationsP$.setGlobalValue(receiveP);
        return receiveP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 19344L)
    public static SubLObject load_remote_operations() {
        agenda.$next_load_transcript_time$.setGlobalValue(numeric_date_utilities.time_from_now((SubLObject)((agenda.NIL == control_vars.caught_up_on_master_transcript()) ? agenda.ZERO_INTEGER : Numbers.add(agenda.$load_transcript_quantum$.getGlobalValue(), random.random((SubLObject)agenda.TWENTY_INTEGER)))));
        operation_communication.load_transcript_exprs();
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 20163L)
    public static SubLObject save_experienceP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != agenda.$save_recent_experienceP$.getGlobalValue() && agenda.NIL != Time.time_has_arrivedP(agenda.$next_save_experience_transcript_time$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 20307L)
    public static SubLObject save_local_experience() {
        agenda.$next_save_experience_transcript_time$.setGlobalValue(numeric_date_utilities.time_from_now(agenda.$save_experience_transcript_quantum$.getGlobalValue()));
        return inference_analysis.possibly_save_recent_experience();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 20895L)
    public static SubLObject auto_flush_logsP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != agenda.$auto_flush_logsP$.getGlobalValue() && agenda.NIL != Time.time_has_arrivedP(agenda.$next_auto_flush_logs_transcript_time$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 21032L)
    public static SubLObject auto_flush_logs() {
        agenda.$next_auto_flush_logs_transcript_time$.setGlobalValue(numeric_date_utilities.time_from_now(agenda.$auto_flush_logs_transcript_quantum$.getGlobalValue()));
        return misc_utilities.flush_all_logs();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 21490L)
    public static SubLObject agenda_save_asked_queriesP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != control_vars.save_asked_queriesP() && agenda.NIL != Time.time_has_arrivedP(agenda.$next_save_asked_queries_transcript_time$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 21645L)
    public static SubLObject save_local_asked_queries() {
        agenda.$next_save_asked_queries_transcript_time$.setGlobalValue(numeric_date_utilities.time_from_now(agenda.$save_asked_queries_transcript_quantum$.getGlobalValue()));
        return inference_analysis.possibly_save_recent_asked_queries();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 21924L)
    public static SubLObject monitor_sksi_global_resourcingP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != sksi_sks_interaction.within_sksi_global_resourcingP() && agenda.NIL != sksi_sks_interaction.sksi_global_resourcing_initializedP() && agenda.NIL != Time.time_has_arrivedP(agenda.$next_sksi_global_resourcing_monitor_time$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 21924L)
    public static SubLObject monitor_sksi_global_resourcing() {
        agenda.$next_sksi_global_resourcing_monitor_time$.setGlobalValue(numeric_date_utilities.time_from_now(agenda.$sksi_monitor_global_resourcing_time_delta$.getGlobalValue()));
        return sksi_sks_interaction.sksi_possibly_reap_connections((SubLObject)agenda.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 25331L)
    public static SubLObject enable_agenda_daily_gc(final SubLObject hour, final SubLObject minute, final SubLObject second) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (agenda.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!hour.isInteger() || !agenda.ZERO_INTEGER.numLE(hour) || !hour.numLE((SubLObject)agenda.$int96$23))) {
            Errors.error((SubLObject)agenda.$str97$Hour_must_be_an_integer_in_the_ra);
        }
        if (agenda.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!minute.isInteger() || !agenda.ZERO_INTEGER.numLE(minute) || !minute.numLE((SubLObject)agenda.$int98$59))) {
            Errors.error((SubLObject)agenda.$str99$Minute_must_be_an_integer_in_the_);
        }
        if (agenda.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!second.isInteger() || !agenda.ZERO_INTEGER.numLE(second) || !second.numLE((SubLObject)agenda.$int98$59))) {
            Errors.error((SubLObject)agenda.$str100$Second_must_be_an_integer_in_the_);
        }
        SubLObject release = (SubLObject)agenda.NIL;
        try {
            release = Locks.seize_lock(agenda.$agenda_daily_gc_lock$.getGlobalValue());
            agenda.$agenda_daily_gc_time_of_day$.setGlobalValue((SubLObject)ConsesLow.list(hour, minute, second));
            set_next_agenda_daily_gc_time();
            agenda.$agenda_daily_gc_enabled$.setGlobalValue((SubLObject)agenda.T);
        }
        finally {
            if (agenda.NIL != release) {
                Locks.release_lock(agenda.$agenda_daily_gc_lock$.getGlobalValue());
            }
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 25975L)
    public static SubLObject disable_agenda_daily_gc() {
        SubLObject release = (SubLObject)agenda.NIL;
        try {
            release = Locks.seize_lock(agenda.$agenda_daily_gc_lock$.getGlobalValue());
            agenda.$agenda_daily_gc_enabled$.setGlobalValue((SubLObject)agenda.NIL);
        }
        finally {
            if (agenda.NIL != release) {
                Locks.release_lock(agenda.$agenda_daily_gc_lock$.getGlobalValue());
            }
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 26187L)
    public static SubLObject agenda_daily_gc_ready_p() {
        return (SubLObject)SubLObjectFactory.makeBoolean(agenda.NIL != agenda.$agenda_daily_gc_enabled$.getGlobalValue() && agenda.NIL != agenda.$next_agenda_daily_gc_time$.getGlobalValue() && agenda.NIL != Time.time_has_arrivedP(agenda.$next_agenda_daily_gc_time$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 26361L)
    public static SubLObject do_agenda_daily_gc() {
        final SubLObject message = Sequences.cconcatenate((SubLObject)agenda.$str102$Doing_Agenda_Daily_GC_at_, format_nil.format_nil_a_no_copy(numeric_date_utilities.timestring((SubLObject)agenda.UNPROVIDED)));
        update_agenda_daily_gc_time();
        Storage.gc_full();
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 26669L)
    public static SubLObject set_next_agenda_daily_gc_time() {
        SubLObject current;
        final SubLObject datum = current = agenda.$agenda_daily_gc_time_of_day$.getGlobalValue();
        SubLObject hour = (SubLObject)agenda.NIL;
        SubLObject minute = (SubLObject)agenda.NIL;
        SubLObject second = (SubLObject)agenda.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)agenda.$list105);
        hour = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)agenda.$list105);
        minute = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)agenda.$list105);
        second = current.first();
        current = current.rest();
        if (agenda.NIL == current) {
            agenda.$next_agenda_daily_gc_time$.setGlobalValue(numeric_date_utilities.get_universal_time_within_next_day(second, minute, hour));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)agenda.$list105);
        }
        return (SubLObject)agenda.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/agenda.lisp", position = 26921L)
    public static SubLObject update_agenda_daily_gc_time() {
        Threads.sleep((SubLObject)agenda.ONE_INTEGER);
        SubLObject release = (SubLObject)agenda.NIL;
        try {
            release = Locks.seize_lock(agenda.$agenda_daily_gc_lock$.getGlobalValue());
            set_next_agenda_daily_gc_time();
        }
        finally {
            if (agenda.NIL != release) {
                Locks.release_lock(agenda.$agenda_daily_gc_lock$.getGlobalValue());
            }
        }
        return (SubLObject)agenda.NIL;
    }
    
    public static SubLObject declare_agenda_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "initialize_agenda", "INITIALIZE-AGENDA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "within_agenda", "WITHIN-AGENDA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_form_to_show", "AGENDA-FORM-TO-SHOW", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_top_level", "AGENDA-TOP-LEVEL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "start_agenda", "START-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "restart_agenda", "RESTART-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "halt_agenda", "HALT-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "abort_agenda", "ABORT-AGENDA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "abort_and_restart_agenda", "ABORT-AND-RESTART-AGENDA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "wait_for_agenda_running", "WAIT-FOR-AGENDA-RUNNING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "wait_for_agenda_not_running", "WAIT-FOR-AGENDA-NOT-RUNNING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "ensure_agenda_running", "ENSURE-AGENDA-RUNNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_process", "AGENDA-PROCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_running", "AGENDA-RUNNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_state", "AGENDA-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "current_process_is_agenda", "CURRENT-PROCESS-IS-AGENDA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_idleP", "AGENDA-IDLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_busyP", "AGENDA-BUSY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "start_agenda_process", "START-AGENDA-PROCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "clear_agenda_process", "CLEAR-AGENDA-PROCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "kill_spurious_agenda_processes", "KILL-SPURIOUS-AGENDA-PROCESSES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "spurious_agenda_processes", "SPURIOUS-AGENDA-PROCESSES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_error_modes", "AGENDA-ERROR-MODES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_error_mode", "AGENDA-ERROR-MODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "set_agenda_error_mode", "SET-AGENDA-ERROR-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_logs_errorsP", "AGENDA-LOGS-ERRORS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "set_agenda_log_file", "SET-AGENDA-LOG-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "get_agenda_log_file", "GET-AGENDA-LOG-FILE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "clear_agenda_log_file", "CLEAR-AGENDA-LOG-FILE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_startup_actions", "AGENDA-STARTUP-ACTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_work_to_do", "AGENDA-WORK-TO-DO", 0, 0, false);
        new $agenda_work_to_do$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "clear_agenda_halt_explanation", "CLEAR-AGENDA-HALT-EXPLANATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "perform_one_agenda_action", "PERFORM-ONE-AGENDA-ACTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "declare_agenda_task", "DECLARE-AGENDA-TASK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "undeclare_agenda_task", "UNDECLARE-AGENDA-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_tasks", "AGENDA-TASKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_task_test", "AGENDA-TASK-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_task_action", "AGENDA-TASK-ACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_task_priority", "AGENDA-TASK-PRIORITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_should_quitP", "AGENDA-SHOULD-QUIT?", 0, 0, false);
        new $agenda_should_quitP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "do_nothing", "DO-NOTHING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "restart_agenda_flagP", "RESTART-AGENDA-FLAG?", 0, 0, false);
        new $restart_agenda_flagP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "save_operationsP", "SAVE-OPERATIONS?", 0, 0, false);
        new $save_operationsP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "save_local_operations", "SAVE-LOCAL-OPERATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "worry_transmit_operationsP", "WORRY-TRANSMIT-OPERATIONS?", 0, 0, false);
        new $worry_transmit_operationsP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "worry_transmit_operations", "WORRY-TRANSMIT-OPERATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "run_auxiliary_opP", "RUN-AUXILIARY-OP?", 0, 0, false);
        new $run_auxiliary_opP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "run_one_auxiliary_op_in_agenda", "RUN-ONE-AUXILIARY-OP-IN-AGENDA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "run_one_non_local_op_in_agenda", "RUN-ONE-NON-LOCAL-OP-IN-AGENDA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "handle_agenda_fi_error_state", "HANDLE-AGENDA-FI-ERROR-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "run_local_opP", "RUN-LOCAL-OP?", 0, 0, false);
        new $run_local_opP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "run_one_local_op_in_agenda", "RUN-ONE-LOCAL-OP-IN-AGENDA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_throw_error_message", "AGENDA-THROW-ERROR-MESSAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "log_agenda_error", "LOG-AGENDA-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "timestamp_operation_p", "TIMESTAMP-OPERATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "construct_generic_timestamp_operation", "CONSTRUCT-GENERIC-TIMESTAMP-OPERATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "normal_transmit_operationsP", "NORMAL-TRANSMIT-OPERATIONS?", 0, 0, false);
        new $normal_transmit_operationsP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "normal_transmit_operations", "NORMAL-TRANSMIT-OPERATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "run_remote_opP", "RUN-REMOTE-OP?", 0, 0, false);
        new $run_remote_opP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "run_one_remote_op_in_agenda", "RUN-ONE-REMOTE-OP-IN-AGENDA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "load_operationsP", "LOAD-OPERATIONS?", 0, 0, false);
        new $load_operationsP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "load_remote_operations", "LOAD-REMOTE-OPERATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "save_experienceP", "SAVE-EXPERIENCE?", 0, 0, false);
        new $save_experienceP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "save_local_experience", "SAVE-LOCAL-EXPERIENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "auto_flush_logsP", "AUTO-FLUSH-LOGS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "auto_flush_logs", "AUTO-FLUSH-LOGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_save_asked_queriesP", "AGENDA-SAVE-ASKED-QUERIES?", 0, 0, false);
        new $agenda_save_asked_queriesP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "save_local_asked_queries", "SAVE-LOCAL-ASKED-QUERIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "monitor_sksi_global_resourcingP", "MONITOR-SKSI-GLOBAL-RESOURCING?", 0, 0, false);
        new $monitor_sksi_global_resourcingP$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "monitor_sksi_global_resourcing", "MONITOR-SKSI-GLOBAL-RESOURCING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "enable_agenda_daily_gc", "ENABLE-AGENDA-DAILY-GC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "disable_agenda_daily_gc", "DISABLE-AGENDA-DAILY-GC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_daily_gc_ready_p", "AGENDA-DAILY-GC-READY-P", 0, 0, false);
        new $agenda_daily_gc_ready_p$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "do_agenda_daily_gc", "DO-AGENDA-DAILY-GC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "set_next_agenda_daily_gc_time", "SET-NEXT-AGENDA-DAILY-GC-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.agenda", "update_agenda_daily_gc_time", "UPDATE-AGENDA-DAILY-GC-TIME", 0, 0, false);
        return (SubLObject)agenda.NIL;
    }
    
    public static SubLObject init_agenda_file() {
        agenda.$agenda_should_quit$ = SubLFiles.deflexical("*AGENDA-SHOULD-QUIT*", (SubLObject)((agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym0$_AGENDA_SHOULD_QUIT_)) ? agenda.$agenda_should_quit$.getGlobalValue() : agenda.NIL));
        agenda.$restart_agenda_flag$ = SubLFiles.deflexical("*RESTART-AGENDA-FLAG*", (SubLObject)((agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym1$_RESTART_AGENDA_FLAG_)) ? agenda.$restart_agenda_flag$.getGlobalValue() : agenda.NIL));
        agenda.$within_agenda$ = SubLFiles.defparameter("*WITHIN-AGENDA*", (SubLObject)agenda.NIL);
        agenda.$default_agenda_package$ = SubLFiles.deflexical("*DEFAULT-AGENDA-PACKAGE*", Packages.find_package((SubLObject)agenda.$str2$CYC));
        agenda.$agenda_resourcing_spaces$ = SubLFiles.defparameter("*AGENDA-RESOURCING-SPACES*", (SubLObject)agenda.TEN_INTEGER);
        agenda.$agenda_process_name$ = SubLFiles.defconstant("*AGENDA-PROCESS-NAME*", (SubLObject)agenda.$str5$Cyc_Agenda);
        agenda.$agenda_process$ = SubLFiles.deflexical("*AGENDA-PROCESS*", (SubLObject)((agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym7$_AGENDA_PROCESS_)) ? agenda.$agenda_process$.getGlobalValue() : agenda.NIL));
        agenda.$agenda_process_lock$ = SubLFiles.deflexical("*AGENDA-PROCESS-LOCK*", Locks.make_lock((SubLObject)agenda.$str10$Agenda_Process_Lock));
        agenda.$agenda_error_modes$ = SubLFiles.deflexical("*AGENDA-ERROR-MODES*", (SubLObject)agenda.$list13);
        agenda.$agenda_error_mode$ = SubLFiles.deflexical("*AGENDA-ERROR-MODE*", (SubLObject)((agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym14$_AGENDA_ERROR_MODE_)) ? agenda.$agenda_error_mode$.getGlobalValue() : agenda.$kw15$HALT));
        agenda.$agenda_log_file$ = SubLFiles.defvar("*AGENDA-LOG-FILE*", (SubLObject)agenda.NIL);
        agenda.$agenda_action_table$ = SubLFiles.deflexical("*AGENDA-ACTION-TABLE*", (SubLObject)((agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym17$_AGENDA_ACTION_TABLE_)) ? agenda.$agenda_action_table$.getGlobalValue() : agenda.NIL));
        agenda.$agenda_action_table_lock$ = SubLFiles.deflexical("*AGENDA-ACTION-TABLE-LOCK*", Locks.make_lock((SubLObject)agenda.$str18$Agenda_Action_Table_Lock));
        agenda.$transcript_queue_worry_size$ = SubLFiles.deflexical("*TRANSCRIPT-QUEUE-WORRY-SIZE*", (SubLObject)agenda.TWENTY_INTEGER);
        agenda.$save_transcript_quantum$ = SubLFiles.deflexical("*SAVE-TRANSCRIPT-QUANTUM*", (SubLObject)agenda.$int27$60);
        agenda.$next_save_transcript_time$ = SubLFiles.deflexical("*NEXT-SAVE-TRANSCRIPT-TIME*", (agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym28$_NEXT_SAVE_TRANSCRIPT_TIME_)) ? agenda.$next_save_transcript_time$.getGlobalValue() : Time.get_universal_time());
        agenda.$worry_transmit_quantum$ = SubLFiles.deflexical("*WORRY-TRANSMIT-QUANTUM*", Numbers.multiply((SubLObject)agenda.TEN_INTEGER, (SubLObject)agenda.$int27$60));
        agenda.$worry_transmit_size$ = SubLFiles.deflexical("*WORRY-TRANSMIT-SIZE*", (SubLObject)agenda.$int31$1000);
        agenda.$next_worry_transmit_time$ = SubLFiles.deflexical("*NEXT-WORRY-TRANSMIT-TIME*", (agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym32$_NEXT_WORRY_TRANSMIT_TIME_)) ? agenda.$next_worry_transmit_time$.getGlobalValue() : Time.get_universal_time());
        agenda.$normal_transmit_quantum$ = SubLFiles.deflexical("*NORMAL-TRANSMIT-QUANTUM*", (SubLObject)agenda.$int64$120);
        agenda.$next_normal_transmit_time$ = SubLFiles.deflexical("*NEXT-NORMAL-TRANSMIT-TIME*", (agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym65$_NEXT_NORMAL_TRANSMIT_TIME_)) ? agenda.$next_normal_transmit_time$.getGlobalValue() : Time.get_universal_time());
        agenda.$load_transcript_quantum$ = SubLFiles.deflexical("*LOAD-TRANSCRIPT-QUANTUM*", (SubLObject)agenda.$int64$120);
        agenda.$next_load_transcript_time$ = SubLFiles.deflexical("*NEXT-LOAD-TRANSCRIPT-TIME*", (agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym73$_NEXT_LOAD_TRANSCRIPT_TIME_)) ? agenda.$next_load_transcript_time$.getGlobalValue() : Time.get_universal_time());
        agenda.$last_receiving_remote_operationsP$ = SubLFiles.deflexical("*LAST-RECEIVING-REMOTE-OPERATIONS?*", (SubLObject)((agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym74$_LAST_RECEIVING_REMOTE_OPERATIONS__)) ? agenda.$last_receiving_remote_operationsP$.getGlobalValue() : agenda.NIL));
        agenda.$save_recent_experienceP$ = SubLFiles.deflexical("*SAVE-RECENT-EXPERIENCE?*", (SubLObject)agenda.T);
        agenda.$save_experience_transcript_quantum$ = SubLFiles.deflexical("*SAVE-EXPERIENCE-TRANSCRIPT-QUANTUM*", Numbers.multiply((SubLObject)agenda.$int27$60, (SubLObject)agenda.TEN_INTEGER));
        agenda.$next_save_experience_transcript_time$ = SubLFiles.deflexical("*NEXT-SAVE-EXPERIENCE-TRANSCRIPT-TIME*", (agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym78$_NEXT_SAVE_EXPERIENCE_TRANSCRIPT_TIME_)) ? agenda.$next_save_experience_transcript_time$.getGlobalValue() : Time.get_universal_time());
        agenda.$auto_flush_logsP$ = SubLFiles.deflexical("*AUTO-FLUSH-LOGS?*", (SubLObject)agenda.T);
        agenda.$auto_flush_logs_transcript_quantum$ = SubLFiles.deflexical("*AUTO-FLUSH-LOGS-TRANSCRIPT-QUANTUM*", Numbers.multiply((SubLObject)agenda.$int27$60, (SubLObject)agenda.FIVE_INTEGER));
        agenda.$next_auto_flush_logs_transcript_time$ = SubLFiles.deflexical("*NEXT-AUTO-FLUSH-LOGS-TRANSCRIPT-TIME*", (agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym81$_NEXT_AUTO_FLUSH_LOGS_TRANSCRIPT_TIME_)) ? agenda.$next_auto_flush_logs_transcript_time$.getGlobalValue() : Time.get_universal_time());
        agenda.$save_asked_queries_transcript_quantum$ = SubLFiles.deflexical("*SAVE-ASKED-QUERIES-TRANSCRIPT-QUANTUM*", Numbers.multiply((SubLObject)agenda.$int27$60, (SubLObject)agenda.ONE_INTEGER));
        agenda.$next_save_asked_queries_transcript_time$ = SubLFiles.deflexical("*NEXT-SAVE-ASKED-QUERIES-TRANSCRIPT-TIME*", (agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym84$_NEXT_SAVE_ASKED_QUERIES_TRANSCRIPT_TIME_)) ? agenda.$next_save_asked_queries_transcript_time$.getGlobalValue() : Time.get_universal_time());
        agenda.$next_sksi_global_resourcing_monitor_time$ = SubLFiles.deflexical("*NEXT-SKSI-GLOBAL-RESOURCING-MONITOR-TIME*", (agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym88$_NEXT_SKSI_GLOBAL_RESOURCING_MONITOR_TIME_)) ? agenda.$next_sksi_global_resourcing_monitor_time$.getGlobalValue() : Time.get_universal_time());
        agenda.$sksi_monitor_global_resourcing_time_delta$ = SubLFiles.deflexical("*SKSI-MONITOR-GLOBAL-RESOURCING-TIME-DELTA*", Numbers.multiply((SubLObject)agenda.$int27$60, (SubLObject)agenda.TWO_INTEGER));
        agenda.$agenda_daily_gc_lock$ = SubLFiles.deflexical("*AGENDA-DAILY-GC-LOCK*", Locks.make_lock((SubLObject)agenda.$str92$Agenda_Daily_GC));
        agenda.$agenda_daily_gc_enabled$ = SubLFiles.deflexical("*AGENDA-DAILY-GC-ENABLED*", (SubLObject)((agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym93$_AGENDA_DAILY_GC_ENABLED_)) ? agenda.$agenda_daily_gc_enabled$.getGlobalValue() : agenda.NIL));
        agenda.$agenda_daily_gc_time_of_day$ = SubLFiles.deflexical("*AGENDA-DAILY-GC-TIME-OF-DAY*", (SubLObject)((agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym94$_AGENDA_DAILY_GC_TIME_OF_DAY_)) ? agenda.$agenda_daily_gc_time_of_day$.getGlobalValue() : agenda.$list95));
        agenda.$next_agenda_daily_gc_time$ = SubLFiles.deflexical("*NEXT-AGENDA-DAILY-GC-TIME*", (SubLObject)((agenda.NIL != Symbols.boundp((SubLObject)agenda.$sym101$_NEXT_AGENDA_DAILY_GC_TIME_)) ? agenda.$next_agenda_daily_gc_time$.getGlobalValue() : agenda.NIL));
        return (SubLObject)agenda.NIL;
    }
    
    public static SubLObject setup_agenda_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym0$_AGENDA_SHOULD_QUIT_);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym1$_RESTART_AGENDA_FLAG_);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym7$_AGENDA_PROCESS_);
        access_macros.register_external_symbol((SubLObject)agenda.$sym8$AGENDA_RUNNING);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym14$_AGENDA_ERROR_MODE_);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym17$_AGENDA_ACTION_TABLE_);
        declare_agenda_task((SubLObject)agenda.$sym24$AGENDA_SHOULD_QUIT_, (SubLObject)agenda.$sym25$DO_NOTHING, (SubLObject)agenda.ZERO_INTEGER);
        declare_agenda_task((SubLObject)agenda.$sym26$RESTART_AGENDA_FLAG_, (SubLObject)agenda.$sym25$DO_NOTHING, (SubLObject)agenda.ZERO_INTEGER);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym28$_NEXT_SAVE_TRANSCRIPT_TIME_);
        declare_agenda_task((SubLObject)agenda.$sym29$SAVE_OPERATIONS_, (SubLObject)agenda.$sym30$SAVE_LOCAL_OPERATIONS, (SubLObject)agenda.TEN_INTEGER);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym32$_NEXT_WORRY_TRANSMIT_TIME_);
        declare_agenda_task((SubLObject)agenda.$sym33$WORRY_TRANSMIT_OPERATIONS_, (SubLObject)agenda.$sym34$WORRY_TRANSMIT_OPERATIONS, (SubLObject)agenda.FIFTEEN_INTEGER);
        declare_agenda_task((SubLObject)agenda.$sym36$RUN_AUXILIARY_OP_, (SubLObject)agenda.$sym37$RUN_ONE_AUXILIARY_OP_IN_AGENDA, (SubLObject)agenda.TWENTY_INTEGER);
        declare_agenda_task((SubLObject)agenda.$sym55$RUN_LOCAL_OP_, (SubLObject)agenda.$sym56$RUN_ONE_LOCAL_OP_IN_AGENDA, (SubLObject)agenda.$int57$25);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym65$_NEXT_NORMAL_TRANSMIT_TIME_);
        declare_agenda_task((SubLObject)agenda.$sym66$NORMAL_TRANSMIT_OPERATIONS_, (SubLObject)agenda.$sym67$NORMAL_TRANSMIT_OPERATIONS, (SubLObject)agenda.$int68$35);
        declare_agenda_task((SubLObject)agenda.$sym70$RUN_REMOTE_OP_, (SubLObject)agenda.$sym71$RUN_ONE_REMOTE_OP_IN_AGENDA, (SubLObject)agenda.$int72$40);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym73$_NEXT_LOAD_TRANSCRIPT_TIME_);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym74$_LAST_RECEIVING_REMOTE_OPERATIONS__);
        declare_agenda_task((SubLObject)agenda.$sym75$LOAD_OPERATIONS_, (SubLObject)agenda.$sym76$LOAD_REMOTE_OPERATIONS, (SubLObject)agenda.$int77$45);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym78$_NEXT_SAVE_EXPERIENCE_TRANSCRIPT_TIME_);
        declare_agenda_task((SubLObject)agenda.$sym79$SAVE_EXPERIENCE_, (SubLObject)agenda.$sym80$SAVE_LOCAL_EXPERIENCE, (SubLObject)agenda.$int27$60);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym81$_NEXT_AUTO_FLUSH_LOGS_TRANSCRIPT_TIME_);
        declare_agenda_task((SubLObject)agenda.$sym82$AUTO_FLUSH_LOGS_, (SubLObject)agenda.$sym83$AUTO_FLUSH_LOGS, (SubLObject)agenda.$int27$60);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym84$_NEXT_SAVE_ASKED_QUERIES_TRANSCRIPT_TIME_);
        declare_agenda_task((SubLObject)agenda.$sym85$AGENDA_SAVE_ASKED_QUERIES_, (SubLObject)agenda.$sym86$SAVE_LOCAL_ASKED_QUERIES, (SubLObject)agenda.$int87$30);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym88$_NEXT_SKSI_GLOBAL_RESOURCING_MONITOR_TIME_);
        declare_agenda_task((SubLObject)agenda.$sym89$MONITOR_SKSI_GLOBAL_RESOURCING_, (SubLObject)agenda.$sym90$MONITOR_SKSI_GLOBAL_RESOURCING, (SubLObject)agenda.$int91$43);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym93$_AGENDA_DAILY_GC_ENABLED_);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym94$_AGENDA_DAILY_GC_TIME_OF_DAY_);
        subl_macro_promotions.declare_defglobal((SubLObject)agenda.$sym101$_NEXT_AGENDA_DAILY_GC_TIME_);
        declare_agenda_task((SubLObject)agenda.$sym103$AGENDA_DAILY_GC_READY_P, (SubLObject)agenda.$sym104$DO_AGENDA_DAILY_GC, (SubLObject)agenda.$int31$1000);
        return (SubLObject)agenda.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_agenda_file();
    }
    
    @Override
	public void initializeVariables() {
        init_agenda_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_agenda_file();
    }
    
    static {
        me = (SubLFile)new agenda();
        agenda.$agenda_should_quit$ = null;
        agenda.$restart_agenda_flag$ = null;
        agenda.$within_agenda$ = null;
        agenda.$default_agenda_package$ = null;
        agenda.$agenda_resourcing_spaces$ = null;
        agenda.$agenda_process_name$ = null;
        agenda.$agenda_process$ = null;
        agenda.$agenda_process_lock$ = null;
        agenda.$agenda_error_modes$ = null;
        agenda.$agenda_error_mode$ = null;
        agenda.$agenda_log_file$ = null;
        agenda.$agenda_action_table$ = null;
        agenda.$agenda_action_table_lock$ = null;
        agenda.$transcript_queue_worry_size$ = null;
        agenda.$save_transcript_quantum$ = null;
        agenda.$next_save_transcript_time$ = null;
        agenda.$worry_transmit_quantum$ = null;
        agenda.$worry_transmit_size$ = null;
        agenda.$next_worry_transmit_time$ = null;
        agenda.$normal_transmit_quantum$ = null;
        agenda.$next_normal_transmit_time$ = null;
        agenda.$load_transcript_quantum$ = null;
        agenda.$next_load_transcript_time$ = null;
        agenda.$last_receiving_remote_operationsP$ = null;
        agenda.$save_recent_experienceP$ = null;
        agenda.$save_experience_transcript_quantum$ = null;
        agenda.$next_save_experience_transcript_time$ = null;
        agenda.$auto_flush_logsP$ = null;
        agenda.$auto_flush_logs_transcript_quantum$ = null;
        agenda.$next_auto_flush_logs_transcript_time$ = null;
        agenda.$save_asked_queries_transcript_quantum$ = null;
        agenda.$next_save_asked_queries_transcript_time$ = null;
        agenda.$next_sksi_global_resourcing_monitor_time$ = null;
        agenda.$sksi_monitor_global_resourcing_time_delta$ = null;
        agenda.$agenda_daily_gc_lock$ = null;
        agenda.$agenda_daily_gc_enabled$ = null;
        agenda.$agenda_daily_gc_time_of_day$ = null;
        agenda.$next_agenda_daily_gc_time$ = null;
        $sym0$_AGENDA_SHOULD_QUIT_ = SubLObjectFactory.makeSymbol("*AGENDA-SHOULD-QUIT*");
        $sym1$_RESTART_AGENDA_FLAG_ = SubLObjectFactory.makeSymbol("*RESTART-AGENDA-FLAG*");
        $str2$CYC = SubLObjectFactory.makeString("CYC");
        $str3$Idle = SubLObjectFactory.makeString("Idle");
        $sym4$AGENDA_WORK_TO_DO = SubLObjectFactory.makeSymbol("AGENDA-WORK-TO-DO");
        $str5$Cyc_Agenda = SubLObjectFactory.makeString("Cyc Agenda");
        $sym6$AGENDA_TOP_LEVEL = SubLObjectFactory.makeSymbol("AGENDA-TOP-LEVEL");
        $sym7$_AGENDA_PROCESS_ = SubLObjectFactory.makeSymbol("*AGENDA-PROCESS*");
        $sym8$AGENDA_RUNNING = SubLObjectFactory.makeSymbol("AGENDA-RUNNING");
        $str9$None = SubLObjectFactory.makeString("None");
        $str10$Agenda_Process_Lock = SubLObjectFactory.makeString("Agenda Process Lock");
        $kw11$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym12$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IGNORE"), (SubLObject)SubLObjectFactory.makeKeyword("HALT"), (SubLObject)SubLObjectFactory.makeKeyword("DEBUG"), (SubLObject)SubLObjectFactory.makeKeyword("LOG"));
        $sym14$_AGENDA_ERROR_MODE_ = SubLObjectFactory.makeSymbol("*AGENDA-ERROR-MODE*");
        $kw15$HALT = SubLObjectFactory.makeKeyword("HALT");
        $kw16$LOG = SubLObjectFactory.makeKeyword("LOG");
        $sym17$_AGENDA_ACTION_TABLE_ = SubLObjectFactory.makeSymbol("*AGENDA-ACTION-TABLE*");
        $str18$Agenda_Action_Table_Lock = SubLObjectFactory.makeString("Agenda Action Table Lock");
        $sym19$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym20$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $sym21$_ = SubLObjectFactory.makeSymbol("<");
        $sym22$AGENDA_TASK_PRIORITY = SubLObjectFactory.makeSymbol("AGENDA-TASK-PRIORITY");
        $sym23$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym24$AGENDA_SHOULD_QUIT_ = SubLObjectFactory.makeSymbol("AGENDA-SHOULD-QUIT?");
        $sym25$DO_NOTHING = SubLObjectFactory.makeSymbol("DO-NOTHING");
        $sym26$RESTART_AGENDA_FLAG_ = SubLObjectFactory.makeSymbol("RESTART-AGENDA-FLAG?");
        $int27$60 = SubLObjectFactory.makeInteger(60);
        $sym28$_NEXT_SAVE_TRANSCRIPT_TIME_ = SubLObjectFactory.makeSymbol("*NEXT-SAVE-TRANSCRIPT-TIME*");
        $sym29$SAVE_OPERATIONS_ = SubLObjectFactory.makeSymbol("SAVE-OPERATIONS?");
        $sym30$SAVE_LOCAL_OPERATIONS = SubLObjectFactory.makeSymbol("SAVE-LOCAL-OPERATIONS");
        $int31$1000 = SubLObjectFactory.makeInteger(1000);
        $sym32$_NEXT_WORRY_TRANSMIT_TIME_ = SubLObjectFactory.makeSymbol("*NEXT-WORRY-TRANSMIT-TIME*");
        $sym33$WORRY_TRANSMIT_OPERATIONS_ = SubLObjectFactory.makeSymbol("WORRY-TRANSMIT-OPERATIONS?");
        $sym34$WORRY_TRANSMIT_OPERATIONS = SubLObjectFactory.makeSymbol("WORRY-TRANSMIT-OPERATIONS");
        $sym35$RUN_ONE_AUXILIARY_OP = SubLObjectFactory.makeSymbol("RUN-ONE-AUXILIARY-OP");
        $sym36$RUN_AUXILIARY_OP_ = SubLObjectFactory.makeSymbol("RUN-AUXILIARY-OP?");
        $sym37$RUN_ONE_AUXILIARY_OP_IN_AGENDA = SubLObjectFactory.makeSymbol("RUN-ONE-AUXILIARY-OP-IN-AGENDA");
        $sym38$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str39$_A = SubLObjectFactory.makeString("~A");
        $sym40$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)agenda.NIL);
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym43$CERROR = SubLObjectFactory.makeSymbol("CERROR");
        $str44$Continue_the_agenda = SubLObjectFactory.makeString("Continue the agenda");
        $str45$__Last_operation___S____ = SubLObjectFactory.makeString("~&Last operation: ~S~%  ");
        $str46$FI_error___A = SubLObjectFactory.makeString("FI error: ~A");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARNING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym48$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str49$FI_warning___A = SubLObjectFactory.makeString("FI warning: ~A");
        $sym50$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $kw51$DEBUG = SubLObjectFactory.makeKeyword("DEBUG");
        $kw52$AGENDA_ABORT = SubLObjectFactory.makeKeyword("AGENDA-ABORT");
        $sym53$AGENDA_THROW_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("AGENDA-THROW-ERROR-MESSAGE");
        $kw54$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym55$RUN_LOCAL_OP_ = SubLObjectFactory.makeSymbol("RUN-LOCAL-OP?");
        $sym56$RUN_ONE_LOCAL_OP_IN_AGENDA = SubLObjectFactory.makeSymbol("RUN-ONE-LOCAL-OP-IN-AGENDA");
        $int57$25 = SubLObjectFactory.makeInteger(25);
        $kw58$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str59$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str60$_s__ = SubLObjectFactory.makeString("~s~%");
        $sym61$FI_TIMESTAMP_ASSERTION = SubLObjectFactory.makeSymbol("FI-TIMESTAMP-ASSERTION");
        $const62$Guest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Guest"));
        $list63 = ConsesLow.list((SubLObject)agenda.NIL, (SubLObject)agenda.NIL, (SubLObject)agenda.NIL);
        $int64$120 = SubLObjectFactory.makeInteger(120);
        $sym65$_NEXT_NORMAL_TRANSMIT_TIME_ = SubLObjectFactory.makeSymbol("*NEXT-NORMAL-TRANSMIT-TIME*");
        $sym66$NORMAL_TRANSMIT_OPERATIONS_ = SubLObjectFactory.makeSymbol("NORMAL-TRANSMIT-OPERATIONS?");
        $sym67$NORMAL_TRANSMIT_OPERATIONS = SubLObjectFactory.makeSymbol("NORMAL-TRANSMIT-OPERATIONS");
        $int68$35 = SubLObjectFactory.makeInteger(35);
        $sym69$RUN_ONE_REMOTE_OP = SubLObjectFactory.makeSymbol("RUN-ONE-REMOTE-OP");
        $sym70$RUN_REMOTE_OP_ = SubLObjectFactory.makeSymbol("RUN-REMOTE-OP?");
        $sym71$RUN_ONE_REMOTE_OP_IN_AGENDA = SubLObjectFactory.makeSymbol("RUN-ONE-REMOTE-OP-IN-AGENDA");
        $int72$40 = SubLObjectFactory.makeInteger(40);
        $sym73$_NEXT_LOAD_TRANSCRIPT_TIME_ = SubLObjectFactory.makeSymbol("*NEXT-LOAD-TRANSCRIPT-TIME*");
        $sym74$_LAST_RECEIVING_REMOTE_OPERATIONS__ = SubLObjectFactory.makeSymbol("*LAST-RECEIVING-REMOTE-OPERATIONS?*");
        $sym75$LOAD_OPERATIONS_ = SubLObjectFactory.makeSymbol("LOAD-OPERATIONS?");
        $sym76$LOAD_REMOTE_OPERATIONS = SubLObjectFactory.makeSymbol("LOAD-REMOTE-OPERATIONS");
        $int77$45 = SubLObjectFactory.makeInteger(45);
        $sym78$_NEXT_SAVE_EXPERIENCE_TRANSCRIPT_TIME_ = SubLObjectFactory.makeSymbol("*NEXT-SAVE-EXPERIENCE-TRANSCRIPT-TIME*");
        $sym79$SAVE_EXPERIENCE_ = SubLObjectFactory.makeSymbol("SAVE-EXPERIENCE?");
        $sym80$SAVE_LOCAL_EXPERIENCE = SubLObjectFactory.makeSymbol("SAVE-LOCAL-EXPERIENCE");
        $sym81$_NEXT_AUTO_FLUSH_LOGS_TRANSCRIPT_TIME_ = SubLObjectFactory.makeSymbol("*NEXT-AUTO-FLUSH-LOGS-TRANSCRIPT-TIME*");
        $sym82$AUTO_FLUSH_LOGS_ = SubLObjectFactory.makeSymbol("AUTO-FLUSH-LOGS?");
        $sym83$AUTO_FLUSH_LOGS = SubLObjectFactory.makeSymbol("AUTO-FLUSH-LOGS");
        $sym84$_NEXT_SAVE_ASKED_QUERIES_TRANSCRIPT_TIME_ = SubLObjectFactory.makeSymbol("*NEXT-SAVE-ASKED-QUERIES-TRANSCRIPT-TIME*");
        $sym85$AGENDA_SAVE_ASKED_QUERIES_ = SubLObjectFactory.makeSymbol("AGENDA-SAVE-ASKED-QUERIES?");
        $sym86$SAVE_LOCAL_ASKED_QUERIES = SubLObjectFactory.makeSymbol("SAVE-LOCAL-ASKED-QUERIES");
        $int87$30 = SubLObjectFactory.makeInteger(30);
        $sym88$_NEXT_SKSI_GLOBAL_RESOURCING_MONITOR_TIME_ = SubLObjectFactory.makeSymbol("*NEXT-SKSI-GLOBAL-RESOURCING-MONITOR-TIME*");
        $sym89$MONITOR_SKSI_GLOBAL_RESOURCING_ = SubLObjectFactory.makeSymbol("MONITOR-SKSI-GLOBAL-RESOURCING?");
        $sym90$MONITOR_SKSI_GLOBAL_RESOURCING = SubLObjectFactory.makeSymbol("MONITOR-SKSI-GLOBAL-RESOURCING");
        $int91$43 = SubLObjectFactory.makeInteger(43);
        $str92$Agenda_Daily_GC = SubLObjectFactory.makeString("Agenda Daily GC");
        $sym93$_AGENDA_DAILY_GC_ENABLED_ = SubLObjectFactory.makeSymbol("*AGENDA-DAILY-GC-ENABLED*");
        $sym94$_AGENDA_DAILY_GC_TIME_OF_DAY_ = SubLObjectFactory.makeSymbol("*AGENDA-DAILY-GC-TIME-OF-DAY*");
        $list95 = ConsesLow.list((SubLObject)agenda.FOUR_INTEGER, (SubLObject)agenda.ZERO_INTEGER, (SubLObject)agenda.ZERO_INTEGER);
        $int96$23 = SubLObjectFactory.makeInteger(23);
        $str97$Hour_must_be_an_integer_in_the_ra = SubLObjectFactory.makeString("Hour must be an integer in the range 0 - 23");
        $int98$59 = SubLObjectFactory.makeInteger(59);
        $str99$Minute_must_be_an_integer_in_the_ = SubLObjectFactory.makeString("Minute must be an integer in the range 0 - 59");
        $str100$Second_must_be_an_integer_in_the_ = SubLObjectFactory.makeString("Second must be an integer in the range 0 - 59");
        $sym101$_NEXT_AGENDA_DAILY_GC_TIME_ = SubLObjectFactory.makeSymbol("*NEXT-AGENDA-DAILY-GC-TIME*");
        $str102$Doing_Agenda_Daily_GC_at_ = SubLObjectFactory.makeString("Doing Agenda Daily GC at ");
        $sym103$AGENDA_DAILY_GC_READY_P = SubLObjectFactory.makeSymbol("AGENDA-DAILY-GC-READY-P");
        $sym104$DO_AGENDA_DAILY_GC = SubLObjectFactory.makeSymbol("DO-AGENDA-DAILY-GC");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HOUR"), (SubLObject)SubLObjectFactory.makeSymbol("MINUTE"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"));
    }
    
    public static final class $agenda_work_to_do$ZeroArityFunction extends ZeroArityFunction
    {
        public $agenda_work_to_do$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AGENDA-WORK-TO-DO"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.agenda_work_to_do();
        }
    }
    
    public static final class $agenda_should_quitP$ZeroArityFunction extends ZeroArityFunction
    {
        public $agenda_should_quitP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AGENDA-SHOULD-QUIT?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.agenda_should_quitP();
        }
    }
    
    public static final class $restart_agenda_flagP$ZeroArityFunction extends ZeroArityFunction
    {
        public $restart_agenda_flagP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RESTART-AGENDA-FLAG?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.restart_agenda_flagP();
        }
    }
    
    public static final class $save_operationsP$ZeroArityFunction extends ZeroArityFunction
    {
        public $save_operationsP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SAVE-OPERATIONS?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.save_operationsP();
        }
    }
    
    public static final class $worry_transmit_operationsP$ZeroArityFunction extends ZeroArityFunction
    {
        public $worry_transmit_operationsP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("WORRY-TRANSMIT-OPERATIONS?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.worry_transmit_operationsP();
        }
    }
    
    public static final class $run_auxiliary_opP$ZeroArityFunction extends ZeroArityFunction
    {
        public $run_auxiliary_opP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RUN-AUXILIARY-OP?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.run_auxiliary_opP();
        }
    }
    
    public static final class $run_local_opP$ZeroArityFunction extends ZeroArityFunction
    {
        public $run_local_opP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RUN-LOCAL-OP?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.run_local_opP();
        }
    }
    
    public static final class $normal_transmit_operationsP$ZeroArityFunction extends ZeroArityFunction
    {
        public $normal_transmit_operationsP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NORMAL-TRANSMIT-OPERATIONS?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.normal_transmit_operationsP();
        }
    }
    
    public static final class $run_remote_opP$ZeroArityFunction extends ZeroArityFunction
    {
        public $run_remote_opP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RUN-REMOTE-OP?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.run_remote_opP();
        }
    }
    
    public static final class $load_operationsP$ZeroArityFunction extends ZeroArityFunction
    {
        public $load_operationsP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("LOAD-OPERATIONS?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.load_operationsP();
        }
    }
    
    public static final class $save_experienceP$ZeroArityFunction extends ZeroArityFunction
    {
        public $save_experienceP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SAVE-EXPERIENCE?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.save_experienceP();
        }
    }
    
    public static final class $agenda_save_asked_queriesP$ZeroArityFunction extends ZeroArityFunction
    {
        public $agenda_save_asked_queriesP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AGENDA-SAVE-ASKED-QUERIES?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.agenda_save_asked_queriesP();
        }
    }
    
    public static final class $monitor_sksi_global_resourcingP$ZeroArityFunction extends ZeroArityFunction
    {
        public $monitor_sksi_global_resourcingP$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MONITOR-SKSI-GLOBAL-RESOURCING?"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.monitor_sksi_global_resourcingP();
        }
    }
    
    public static final class $agenda_daily_gc_ready_p$ZeroArityFunction extends ZeroArityFunction
    {
        public $agenda_daily_gc_ready_p$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AGENDA-DAILY-GC-READY-P"));
        }
        
        @Override
		public SubLObject processItem() {
            return agenda.agenda_daily_gc_ready_p();
        }
    }
}

/*

	Total time: 643 ms
	
*/