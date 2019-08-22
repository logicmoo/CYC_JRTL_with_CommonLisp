package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$agenda_display_fi_warnings$;
import static com.cyc.cycjava.cycl.control_vars.$last_agenda_error_explanatory_supports$;
import static com.cyc.cycjava.cycl.control_vars.$last_agenda_error_message$;
import static com.cyc.cycjava.cycl.control_vars.$last_agenda_op$;
import static com.cyc.cycjava.cycl.control_vars.$use_transcriptP$;
import static com.cyc.cycjava.cycl.control_vars.caught_up_on_master_transcript;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.control_vars.save_asked_queriesP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_background_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.all_processes;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_wait;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_whostate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.set_process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.time_has_arrivedP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.logicmoo.system.SystemCurrent;

import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class agenda extends SubLTranslatedFile {
    public static final SubLFile me = new agenda();

    public static final String myName = "com.cyc.cycjava.cycl.agenda";

    public static final String myFingerPrint = "33b62fc74ce6d070d3b0b5c900a15374294a736721ce77da481f2cbbe0c3a094";





    // defparameter
    private static final SubLSymbol $within_agenda$ = makeSymbol("*WITHIN-AGENDA*");

    // deflexical
    // The default package in which the agenda runs.
    private static final SubLSymbol $default_agenda_package$ = makeSymbol("*DEFAULT-AGENDA-PACKAGE*");

    // defparameter
    // The number of SBHL spaces to resource within an agenda process
    private static final SubLSymbol $agenda_resourcing_spaces$ = makeSymbol("*AGENDA-RESOURCING-SPACES*");

    // defconstant
    private static final SubLSymbol $agenda_process_name$ = makeSymbol("*AGENDA-PROCESS-NAME*");



    // deflexical
    private static final SubLSymbol $agenda_process_lock$ = makeSymbol("*AGENDA-PROCESS-LOCK*");

    // deflexical
    private static final SubLSymbol $agenda_error_modes$ = makeSymbol("*AGENDA-ERROR-MODES*");



    // defvar
    // The file used to log agenda errors when the agenda is in log mode.
    private static final SubLSymbol $agenda_log_file$ = makeSymbol("*AGENDA-LOG-FILE*");



    // deflexical
    // A lock to control access to *agenda-action-table*.
    private static final SubLSymbol $agenda_action_table_lock$ = makeSymbol("*AGENDA-ACTION-TABLE-LOCK*");

    // deflexical
    private static final SubLSymbol $transcript_queue_worry_size$ = makeSymbol("*TRANSCRIPT-QUEUE-WORRY-SIZE*");

    // deflexical
    private static final SubLSymbol $save_transcript_quantum$ = makeSymbol("*SAVE-TRANSCRIPT-QUANTUM*");



    // deflexical
    private static final SubLSymbol $worry_transmit_quantum$ = makeSymbol("*WORRY-TRANSMIT-QUANTUM*");

    // deflexical
    private static final SubLSymbol $worry_transmit_size$ = makeSymbol("*WORRY-TRANSMIT-SIZE*");



    // deflexical
    private static final SubLSymbol $normal_transmit_quantum$ = makeSymbol("*NORMAL-TRANSMIT-QUANTUM*");



    // deflexical
    private static final SubLSymbol $load_transcript_quantum$ = makeSymbol("*LOAD-TRANSCRIPT-QUANTUM*");



    // deflexical
    private static final SubLSymbol $last_receiving_remote_operationsP$ = makeSymbol("*LAST-RECEIVING-REMOTE-OPERATIONS?*");

    // deflexical
    // Whether to save recent experience into an experience transcript.
    public static final SubLSymbol $save_recent_experienceP$ = makeSymbol("*SAVE-RECENT-EXPERIENCE?*");

    // deflexical
    // 10 minutes
    private static final SubLSymbol $save_experience_transcript_quantum$ = makeSymbol("*SAVE-EXPERIENCE-TRANSCRIPT-QUANTUM*");



    // deflexical
    public static final SubLSymbol $auto_flush_logsP$ = makeSymbol("*AUTO-FLUSH-LOGS?*");

    // deflexical
    private static final SubLSymbol $auto_flush_logs_transcript_quantum$ = makeSymbol("*AUTO-FLUSH-LOGS-TRANSCRIPT-QUANTUM*");



    // deflexical
    // 1 minute
    private static final SubLSymbol $save_asked_queries_transcript_quantum$ = makeSymbol("*SAVE-ASKED-QUERIES-TRANSCRIPT-QUANTUM*");





    // deflexical
    // 2 minutes
    private static final SubLSymbol $sksi_monitor_global_resourcing_time_delta$ = makeSymbol("*SKSI-MONITOR-GLOBAL-RESOURCING-TIME-DELTA*");

    // deflexical
    private static final SubLSymbol $agenda_daily_gc_lock$ = makeSymbol("*AGENDA-DAILY-GC-LOCK*");







    // Internal Constants
    public static final SubLSymbol $agenda_should_quit$ = makeSymbol("*AGENDA-SHOULD-QUIT*");

    public static final SubLSymbol $restart_agenda_flag$ = makeSymbol("*RESTART-AGENDA-FLAG*");

    public static final SubLString $$$CYC = makeString("CYC");

    public static final SubLString $$$Idle = makeString("Idle");

    public static final SubLSymbol AGENDA_WORK_TO_DO = makeSymbol("AGENDA-WORK-TO-DO");

    public static final SubLString $$$Cyc_Agenda = makeString("Cyc Agenda");

    public static final SubLSymbol AGENDA_TOP_LEVEL = makeSymbol("AGENDA-TOP-LEVEL");

    public static final SubLSymbol $agenda_process$ = makeSymbol("*AGENDA-PROCESS*");

    public static final SubLSymbol AGENDA_RUNNING = makeSymbol("AGENDA-RUNNING");

    public static final SubLString $$$None = makeString("None");

    public static final SubLString $$$Agenda_Process_Lock = makeString("Agenda Process Lock");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLList $list13 = list(makeKeyword("IGNORE"), makeKeyword("HALT"), makeKeyword("DEBUG"), makeKeyword("LOG"));

    private static final SubLSymbol $agenda_error_mode$ = makeSymbol("*AGENDA-ERROR-MODE*");





    private static final SubLSymbol $agenda_action_table$ = makeSymbol("*AGENDA-ACTION-TABLE*");

    private static final SubLString $$$Agenda_Action_Table_Lock = makeString("Agenda Action Table Lock");





    private static final SubLSymbol $sym21$_ = makeSymbol("<");

    private static final SubLSymbol AGENDA_TASK_PRIORITY = makeSymbol("AGENDA-TASK-PRIORITY");



    private static final SubLSymbol $sym24$AGENDA_SHOULD_QUIT_ = makeSymbol("AGENDA-SHOULD-QUIT?");

    private static final SubLSymbol DO_NOTHING = makeSymbol("DO-NOTHING");

    private static final SubLSymbol $sym26$RESTART_AGENDA_FLAG_ = makeSymbol("RESTART-AGENDA-FLAG?");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLSymbol $next_save_transcript_time$ = makeSymbol("*NEXT-SAVE-TRANSCRIPT-TIME*");

    private static final SubLSymbol $sym29$SAVE_OPERATIONS_ = makeSymbol("SAVE-OPERATIONS?");

    private static final SubLSymbol SAVE_LOCAL_OPERATIONS = makeSymbol("SAVE-LOCAL-OPERATIONS");



    private static final SubLSymbol $next_worry_transmit_time$ = makeSymbol("*NEXT-WORRY-TRANSMIT-TIME*");

    private static final SubLSymbol $sym33$WORRY_TRANSMIT_OPERATIONS_ = makeSymbol("WORRY-TRANSMIT-OPERATIONS?");

    private static final SubLSymbol WORRY_TRANSMIT_OPERATIONS = makeSymbol("WORRY-TRANSMIT-OPERATIONS");

    private static final SubLSymbol RUN_ONE_AUXILIARY_OP = makeSymbol("RUN-ONE-AUXILIARY-OP");

    private static final SubLSymbol $sym36$RUN_AUXILIARY_OP_ = makeSymbol("RUN-AUXILIARY-OP?");

    private static final SubLSymbol RUN_ONE_AUXILIARY_OP_IN_AGENDA = makeSymbol("RUN-ONE-AUXILIARY-OP-IN-AGENDA");



    private static final SubLString $str39$_A = makeString("~A");

    private static final SubLSymbol $sym40$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list41 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLList $list42 = list(makeSymbol("ERROR"), makeSymbol("&OPTIONAL"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));



    private static final SubLString $$$Continue_the_agenda = makeString("Continue the agenda");

    private static final SubLString $str45$__Last_operation___S____ = makeString("~&Last operation: ~S~%  ");

    private static final SubLString $str46$FI_error___A = makeString("FI error: ~A");

    private static final SubLList $list47 = list(makeSymbol("WARNING"), makeSymbol("&OPTIONAL"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));



    private static final SubLString $str49$FI_warning___A = makeString("FI warning: ~A");







    private static final SubLSymbol AGENDA_THROW_ERROR_MESSAGE = makeSymbol("AGENDA-THROW-ERROR-MESSAGE");



    private static final SubLSymbol $sym55$RUN_LOCAL_OP_ = makeSymbol("RUN-LOCAL-OP?");

    private static final SubLSymbol RUN_ONE_LOCAL_OP_IN_AGENDA = makeSymbol("RUN-ONE-LOCAL-OP-IN-AGENDA");

    private static final SubLInteger $int$25 = makeInteger(25);



    private static final SubLString $str59$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str60$_s__ = makeString("~s~%");

    private static final SubLSymbol FI_TIMESTAMP_ASSERTION = makeSymbol("FI-TIMESTAMP-ASSERTION");

    private static final SubLObject $$Guest = reader_make_constant_shell(makeString("Guest"));

    private static final SubLList $list63 = list(NIL, NIL, NIL);

    private static final SubLInteger $int$120 = makeInteger(120);

    private static final SubLSymbol $next_normal_transmit_time$ = makeSymbol("*NEXT-NORMAL-TRANSMIT-TIME*");

    private static final SubLSymbol $sym66$NORMAL_TRANSMIT_OPERATIONS_ = makeSymbol("NORMAL-TRANSMIT-OPERATIONS?");

    private static final SubLSymbol NORMAL_TRANSMIT_OPERATIONS = makeSymbol("NORMAL-TRANSMIT-OPERATIONS");

    private static final SubLInteger $int$35 = makeInteger(35);

    private static final SubLSymbol RUN_ONE_REMOTE_OP = makeSymbol("RUN-ONE-REMOTE-OP");

    private static final SubLSymbol $sym70$RUN_REMOTE_OP_ = makeSymbol("RUN-REMOTE-OP?");

    private static final SubLSymbol RUN_ONE_REMOTE_OP_IN_AGENDA = makeSymbol("RUN-ONE-REMOTE-OP-IN-AGENDA");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLSymbol $next_load_transcript_time$ = makeSymbol("*NEXT-LOAD-TRANSCRIPT-TIME*");

    private static final SubLSymbol $sym74$_LAST_RECEIVING_REMOTE_OPERATIONS__ = makeSymbol("*LAST-RECEIVING-REMOTE-OPERATIONS?*");

    private static final SubLSymbol $sym75$LOAD_OPERATIONS_ = makeSymbol("LOAD-OPERATIONS?");

    private static final SubLSymbol LOAD_REMOTE_OPERATIONS = makeSymbol("LOAD-REMOTE-OPERATIONS");

    private static final SubLInteger $int$45 = makeInteger(45);

    private static final SubLSymbol $next_save_experience_transcript_time$ = makeSymbol("*NEXT-SAVE-EXPERIENCE-TRANSCRIPT-TIME*");

    private static final SubLSymbol $sym79$SAVE_EXPERIENCE_ = makeSymbol("SAVE-EXPERIENCE?");

    private static final SubLSymbol SAVE_LOCAL_EXPERIENCE = makeSymbol("SAVE-LOCAL-EXPERIENCE");

    private static final SubLSymbol $next_auto_flush_logs_transcript_time$ = makeSymbol("*NEXT-AUTO-FLUSH-LOGS-TRANSCRIPT-TIME*");

    private static final SubLSymbol $sym82$AUTO_FLUSH_LOGS_ = makeSymbol("AUTO-FLUSH-LOGS?");

    private static final SubLSymbol AUTO_FLUSH_LOGS = makeSymbol("AUTO-FLUSH-LOGS");

    private static final SubLSymbol $next_save_asked_queries_transcript_time$ = makeSymbol("*NEXT-SAVE-ASKED-QUERIES-TRANSCRIPT-TIME*");

    private static final SubLSymbol $sym85$AGENDA_SAVE_ASKED_QUERIES_ = makeSymbol("AGENDA-SAVE-ASKED-QUERIES?");

    private static final SubLSymbol SAVE_LOCAL_ASKED_QUERIES = makeSymbol("SAVE-LOCAL-ASKED-QUERIES");

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLSymbol $next_sksi_global_resourcing_monitor_time$ = makeSymbol("*NEXT-SKSI-GLOBAL-RESOURCING-MONITOR-TIME*");

    private static final SubLSymbol $sym89$MONITOR_SKSI_GLOBAL_RESOURCING_ = makeSymbol("MONITOR-SKSI-GLOBAL-RESOURCING?");

    private static final SubLSymbol MONITOR_SKSI_GLOBAL_RESOURCING = makeSymbol("MONITOR-SKSI-GLOBAL-RESOURCING");

    private static final SubLInteger $int$43 = makeInteger(43);

    private static final SubLString $$$Agenda_Daily_GC = makeString("Agenda Daily GC");

    private static final SubLSymbol $agenda_daily_gc_enabled$ = makeSymbol("*AGENDA-DAILY-GC-ENABLED*");

    private static final SubLSymbol $agenda_daily_gc_time_of_day$ = makeSymbol("*AGENDA-DAILY-GC-TIME-OF-DAY*");

    private static final SubLList $list95 = list(FOUR_INTEGER, ZERO_INTEGER, ZERO_INTEGER);

    private static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLString $str97$Hour_must_be_an_integer_in_the_ra = makeString("Hour must be an integer in the range 0 - 23");

    private static final SubLInteger $int$59 = makeInteger(59);

    private static final SubLString $str99$Minute_must_be_an_integer_in_the_ = makeString("Minute must be an integer in the range 0 - 59");

    private static final SubLString $str100$Second_must_be_an_integer_in_the_ = makeString("Second must be an integer in the range 0 - 59");

    private static final SubLSymbol $next_agenda_daily_gc_time$ = makeSymbol("*NEXT-AGENDA-DAILY-GC-TIME*");

    private static final SubLString $$$Doing_Agenda_Daily_GC_at_ = makeString("Doing Agenda Daily GC at ");

    private static final SubLSymbol AGENDA_DAILY_GC_READY_P = makeSymbol("AGENDA-DAILY-GC-READY-P");

    private static final SubLSymbol DO_AGENDA_DAILY_GC = makeSymbol("DO-AGENDA-DAILY-GC");

    private static final SubLList $list105 = list(makeSymbol("HOUR"), makeSymbol("MINUTE"), makeSymbol("SECOND"));

    public static SubLObject initialize_agenda() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        operation_communication.set_communication_mode(operation_communication.$startup_communication_mode$.getDynamicValue(thread));
        if ((NIL != system_parameters.$start_agenda_at_startupP$.getDynamicValue(thread)) && (NIL == agenda_running())) {
            start_agenda(TEN_INTEGER);
        }
        return T;
    }

    public static SubLObject within_agenda() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_agenda$.getDynamicValue(thread);
    }

    public static SubLObject agenda_form_to_show() {
        return encapsulation.unencapsulate_partial($last_agenda_op$.getGlobalValue());
    }

    public static SubLObject agenda_top_level() {
        final SubLObject retval = agenda_top_level0();
        return retval;
    }

    public static SubLObject agenda_top_level0() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        start_agenda_process();
        if (NIL != current_process_is_agenda()) {
            set_process_priority(agenda_process(), $process_background_priority$.getGlobalValue());
            try {
                agenda_startup_actions();
                $restart_agenda_flag$.setGlobalValue(NIL);
                final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                try {
                    $package$.bind($default_agenda_package$.getGlobalValue(), thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, $agenda_resourcing_spaces$.getDynamicValue(thread)), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        while (NIL == $agenda_should_quit$.getGlobalValue()) {
                            while ((NIL == $agenda_should_quit$.getGlobalValue()) && (NIL != agenda_work_to_do())) {
                                perform_one_agenda_action();
                            } 
                            process_wait($$$Idle, symbol_function(AGENDA_WORK_TO_DO));
                        } 
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$1, thread);
                    }
                } finally {
                    $package$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    process_utilities.current_process_clear_form();
                    clear_agenda_process();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        return NIL;
    }

    public static SubLObject start_agenda(SubLObject waitP) {
        if (waitP == UNPROVIDED) {
            waitP = NIL;
        }
        if (NIL != agenda_running()) {
            halt_agenda(UNPROVIDED);
        }
        $agenda_should_quit$.setGlobalValue(NIL);
        make_process($agenda_process_name$.getGlobalValue(), symbol_function(AGENDA_TOP_LEVEL));
        if (NIL != waitP) {
            wait_for_agenda_running(waitP);
        }
        return agenda_running();
    }

    public static SubLObject restart_agenda(SubLObject waitP) {
        if (waitP == UNPROVIDED) {
            waitP = NIL;
        }
        if (NIL != agenda_running()) {
            halt_agenda(TWENTY_INTEGER);
        }
        return start_agenda(waitP);
    }

    public static SubLObject halt_agenda(SubLObject waitP) {
        if (waitP == UNPROVIDED) {
            waitP = NIL;
        }
        $agenda_should_quit$.setGlobalValue(T);
        if ((NIL != agenda_running()) && (NIL != waitP)) {
            wait_for_agenda_not_running(waitP);
        }
        return NIL;
    }

    public static SubLObject abort_agenda() {
        $agenda_should_quit$.setGlobalValue(T);
        if (NIL != agenda_running()) {
            kill_process(agenda_process());
            clear_agenda_process();
            return T;
        }
        return NIL;
    }

    public static SubLObject abort_and_restart_agenda() {
        if (NIL != agenda_running()) {
            abort_agenda();
            return start_agenda(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject wait_for_agenda_running(SubLObject wait_time) {
        if (wait_time == UNPROVIDED) {
            wait_time = ONE_INTEGER;
        }
        final SubLObject time = numeric_date_utilities.time_from_now(wait_time);
        while ((NIL == agenda_running()) && (NIL == time_has_arrivedP(time))) {
            sleep(ONE_INTEGER);
        } 
        return agenda_running();
    }

    public static SubLObject wait_for_agenda_not_running(SubLObject wait_time) {
        if (wait_time == UNPROVIDED) {
            wait_time = ONE_INTEGER;
        }
        final SubLObject time = numeric_date_utilities.time_from_now(wait_time);
        while ((NIL != agenda_running()) && (NIL == time_has_arrivedP(time))) {
            sleep(ONE_INTEGER);
        } 
        return makeBoolean(NIL == agenda_running());
    }

    public static SubLObject ensure_agenda_running() {
        $agenda_should_quit$.setGlobalValue(NIL);
        if (NIL == agenda_running()) {
            start_agenda(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject agenda_process() {
        return $agenda_process$.getGlobalValue();
    }

    public static SubLObject agenda_running() {
        return valid_process_p(agenda_process());
    }

    public static SubLObject agenda_state() {
        if (NIL != agenda_running()) {
            return process_whostate(agenda_process());
        }
        return $$$None;
    }

    public static SubLObject current_process_is_agenda() {
        return eq(current_process(), agenda_process());
    }

    public static SubLObject agenda_idleP() {
        return makeBoolean((NIL != agenda_running()) && (NIL != process_utilities.process_idleP(agenda_process())));
    }

    public static SubLObject agenda_busyP() {
        return makeBoolean((NIL != agenda_running()) && (NIL != process_utilities.process_busyP(agenda_process())));
    }

    public static SubLObject start_agenda_process() {
        SubLObject release = NIL;
        try {
            release = seize_lock($agenda_process_lock$.getGlobalValue());
            if (NIL == $agenda_process$.getGlobalValue()) {
                $agenda_process$.setGlobalValue(current_process());
            }
        } finally {
            if (NIL != release) {
                release_lock($agenda_process_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject clear_agenda_process() {
        SubLObject release = NIL;
        try {
            release = seize_lock($agenda_process_lock$.getGlobalValue());
            $agenda_process$.setGlobalValue(NIL);
        } finally {
            if (NIL != release) {
                release_lock($agenda_process_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject kill_spurious_agenda_processes() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject spurious_agenda_processes = spurious_agenda_processes();
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = spurious_agenda_processes;
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        kill_process(process);
                        total = add(total, ONE_INTEGER);
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
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return total;
    }

    public static SubLObject spurious_agenda_processes() {
        SubLObject spurious_agenda_processes = NIL;
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($agenda_process_name$.getGlobalValue().equal(process_name(process)) && (!process.eql(agenda_process()))) {
                spurious_agenda_processes = cons(process, spurious_agenda_processes);
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return nreverse(spurious_agenda_processes);
    }

    public static SubLObject agenda_error_modes() {
        return $agenda_error_modes$.getGlobalValue();
    }

    public static SubLObject agenda_error_mode() {
        return $agenda_error_mode$.getGlobalValue();
    }

    public static SubLObject set_agenda_error_mode(final SubLObject mode) {
        if (NIL != subl_promotions.memberP(mode, $agenda_error_modes$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            $agenda_error_mode$.setGlobalValue(mode);
            return mode;
        }
        return NIL;
    }

    public static SubLObject agenda_logs_errorsP() {
        return eq(agenda_error_mode(), $LOG);
    }

    public static SubLObject set_agenda_log_file(final SubLObject file_path) {
        if (NIL != file_utilities.file_valid_for_writing_p(file_path)) {
            $agenda_log_file$.setDynamicValue(file_path);
            return file_path;
        }
        return NIL;
    }

    public static SubLObject get_agenda_log_file() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $agenda_log_file$.getDynamicValue(thread);
    }

    public static SubLObject clear_agenda_log_file() {
        $agenda_log_file$.setDynamicValue(NIL);
        return get_agenda_log_file();
    }

    public static SubLObject agenda_startup_actions() {
        if (NIL == transcript_utilities.local_transcript()) {
            transcript_utilities.new_local_transcript();
        }
        if (NIL == transcript_utilities.master_transcript()) {
            transcript_utilities.set_master_transcript(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject agenda_work_to_do() {
        SubLObject cdolist_list_var = agenda_tasks();
        SubLObject agenda_task = NIL;
        agenda_task = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject test = agenda_task_test(agenda_task);
            if ((NIL != fboundp(test)) && (NIL != funcall(test))) {
                final SubLObject action = agenda_task_action(agenda_task);
                if (NIL != fboundp(action)) {
                    return agenda_task;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            agenda_task = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject clear_agenda_halt_explanation() {
        $last_agenda_error_message$.setGlobalValue(NIL);
        $last_agenda_error_explanatory_supports$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject perform_one_agenda_action() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_agenda_halt_explanation();
        final SubLObject agenda_task = agenda_work_to_do();
        if (NIL != agenda_task) {
            final SubLObject action = agenda_task_action(agenda_task);
            final SubLObject _prev_bind_0 = $within_agenda$.currentBinding(thread);
            try {
                $within_agenda$.bind(T, thread);
                funcall(action);
            } catch (final Throwable e) {
                e.printStackTrace(SystemCurrent.err);
                Errors.handleError(e);
            } finally {
                $within_agenda$.rebind(_prev_bind_0, thread);
            }
        }
        return agenda_task;
    }

    public static SubLObject declare_agenda_task(final SubLObject test, final SubLObject action, final SubLObject priority) {
        assert NIL != symbolp(test) : "Types.symbolp(test) " + "CommonSymbols.NIL != Types.symbolp(test) " + test;
        assert NIL != symbolp(action) : "Types.symbolp(action) " + "CommonSymbols.NIL != Types.symbolp(action) " + action;
        assert NIL != numberp(priority) : "Types.numberp(priority) " + "CommonSymbols.NIL != Types.numberp(priority) " + priority;
        undeclare_agenda_task(test);
        SubLObject release = NIL;
        try {
            release = seize_lock($agenda_action_table_lock$.getGlobalValue());
            $agenda_action_table$.setGlobalValue(list_utilities.splice_into_sorted_list(list(test, action, priority), $agenda_action_table$.getGlobalValue(), symbol_function($sym21$_), symbol_function(AGENDA_TASK_PRIORITY)));
        } finally {
            if (NIL != release) {
                release_lock($agenda_action_table_lock$.getGlobalValue());
            }
        }
        return test;
    }

    public static SubLObject undeclare_agenda_task(final SubLObject test) {
        SubLObject release = NIL;
        try {
            release = seize_lock($agenda_action_table_lock$.getGlobalValue());
            $agenda_action_table$.setGlobalValue(delete(test, $agenda_action_table$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($agenda_action_table_lock$.getGlobalValue());
            }
        }
        return test;
    }

    public static SubLObject agenda_tasks() {
        return $agenda_action_table$.getGlobalValue();
    }

    public static SubLObject agenda_task_test(final SubLObject agenda_task) {
        return agenda_task.first();
    }

    public static SubLObject agenda_task_action(final SubLObject agenda_task) {
        return second(agenda_task);
    }

    public static SubLObject agenda_task_priority(final SubLObject agenda_task) {
        return third(agenda_task);
    }

    public static SubLObject agenda_should_quitP() {
        return $agenda_should_quit$.getGlobalValue();
    }

    public static SubLObject do_nothing() {
        return NIL;
    }

    public static SubLObject restart_agenda_flagP() {
        return $restart_agenda_flag$.getGlobalValue();
    }

    public static SubLObject save_operationsP() {
        return makeBoolean((NIL != operation_communication.saving_operationsP()) && ((((NIL != time_has_arrivedP($next_save_transcript_time$.getGlobalValue())) && (NIL == operation_queues.transcript_queue_empty())) && (NIL != operation_queues.local_queue_empty())) || operation_queues.transcript_queue_size().numG($transcript_queue_worry_size$.getGlobalValue())));
    }

    public static SubLObject save_local_operations() {
        $next_save_transcript_time$.setGlobalValue(numeric_date_utilities.time_from_now(add($save_transcript_quantum$.getGlobalValue(), random.random(TWENTY_INTEGER))));
        operation_communication.save_transcript_ops();
        return NIL;
    }

    public static SubLObject worry_transmit_operationsP() {
        return makeBoolean((NIL != operation_communication.allow_transmitting()) && (((NIL != time_has_arrivedP($next_worry_transmit_time$.getGlobalValue())) && (NIL == operation_queues.transmit_queue_empty())) || operation_queues.transmit_queue_size().numGE($worry_transmit_size$.getGlobalValue())));
    }

    public static SubLObject worry_transmit_operations() {
        $next_worry_transmit_time$.setGlobalValue(numeric_date_utilities.time_from_now(add($worry_transmit_quantum$.getGlobalValue(), random.random(TWENTY_INTEGER))));
        operation_communication.send_local_transcript();
        return NIL;
    }

    public static SubLObject run_auxiliary_opP() {
        return makeBoolean((NIL != operation_communication.process_auxiliary_operationsP()) && (NIL == operation_queues.auxiliary_queue_empty()));
    }

    public static SubLObject run_one_auxiliary_op_in_agenda() {
        return run_one_non_local_op_in_agenda(RUN_ONE_AUXILIARY_OP);
    }

    public static SubLObject run_one_non_local_op_in_agenda(final SubLObject run_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        final SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$fi_warning$.currentBinding(thread);
        try {
            fi.$fi_error$.bind(NIL, thread);
            fi.$fi_warning$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$2 = Errors.$continue_cerrorP$.currentBinding(thread);
            final SubLObject _prev_bind_1_$3 = api_control_vars.$use_local_queueP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $use_transcriptP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = operation_queues.$within_a_remote_opP$.currentBinding(thread);
            try {
                Errors.$continue_cerrorP$.bind(T, thread);
                api_control_vars.$use_local_queueP$.bind(NIL, thread);
                $use_transcriptP$.bind(NIL, thread);
                operation_queues.$within_a_remote_opP$.bind(T, thread);
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            funcall(run_method);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                operation_queues.$within_a_remote_opP$.rebind(_prev_bind_4, thread);
                $use_transcriptP$.rebind(_prev_bind_3, thread);
                api_control_vars.$use_local_queueP$.rebind(_prev_bind_1_$3, thread);
                Errors.$continue_cerrorP$.rebind(_prev_bind_0_$2, thread);
            }
            if (NIL == error_message) {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            handle_agenda_fi_error_state();
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            }
            if (NIL != error_message) {
                Errors.warn($str39$_A, error_message);
            }
        } finally {
            fi.$fi_warning$.rebind(_prev_bind_2, thread);
            fi.$fi_error$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject handle_agenda_fi_error_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject was_appendingP = eval($sym40$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
        eval($list41);
        try {
            if (NIL != fi.fi_error_signaledP()) {
                SubLObject current;
                final SubLObject datum = current = fi.fi_get_error_int();
                SubLObject error = NIL;
                destructuring_bind_must_consp(current, datum, $list42);
                error = current.first();
                current = current.rest();
                final SubLObject format_string = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list42);
                final SubLObject args;
                current = args = current.rest();
                apply(symbol_function(CERROR), $$$Continue_the_agenda, new SubLObject[]{ cconcatenate($str45$__Last_operation___S____, NIL != format_string ? format_string : format(NIL, $str46$FI_error___A, error)), agenda_form_to_show(), args });
                fi.reset_fi_error();
            } else
                if (((NIL != $agenda_display_fi_warnings$.getDynamicValue(thread)) && (NIL == Errors.$ignore_warnsP$.getDynamicValue(thread))) && (NIL != fi.fi_warning_signaledP())) {
                    SubLObject current;
                    final SubLObject datum = current = fi.fi_get_warning_int();
                    SubLObject warning = NIL;
                    destructuring_bind_must_consp(current, datum, $list47);
                    warning = current.first();
                    current = current.rest();
                    final SubLObject format_string = (current.isCons()) ? current.first() : NIL;
                    destructuring_bind_must_listp(current, datum, $list47);
                    final SubLObject args;
                    current = args = current.rest();
                    apply(symbol_function(WARN), cconcatenate($str45$__Last_operation___S____, NIL != format_string ? format_string : format(NIL, $str49$FI_warning___A, warning)), new SubLObject[]{ agenda_form_to_show(), args });
                    fi.reset_fi_warning();
                }

        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                eval(list(CSETQ, $sym40$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject run_local_opP() {
        return makeBoolean((NIL != operation_communication.process_local_operationsP()) && (NIL == operation_queues.local_queue_empty()));
    }

    public static SubLObject run_one_local_op_in_agenda() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        final SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi.$fi_warning$.currentBinding(thread);
        try {
            fi.$fi_error$.bind(NIL, thread);
            fi.$fi_warning$.bind(NIL, thread);
            SubLObject pcase_var = agenda_error_mode();
            if (pcase_var.eql($DEBUG)) {
                try {
                    thread.throwStack.push($AGENDA_ABORT);
                    final SubLObject _prev_bind_0_$6 = Errors.$error_abort_handler$.currentBinding(thread);
                    try {
                        Errors.$error_abort_handler$.bind(symbol_function(AGENDA_THROW_ERROR_MESSAGE), thread);
                        operation_queues.run_one_local_op();
                    } finally {
                        Errors.$error_abort_handler$.rebind(_prev_bind_0_$6, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $AGENDA_ABORT);
                } finally {
                    thread.throwStack.pop();
                }
            } else {
                final SubLObject _prev_bind_0_$7 = Errors.$continue_cerrorP$.currentBinding(thread);
                try {
                    Errors.$continue_cerrorP$.bind(T, thread);
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                operation_queues.run_one_local_op();
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                        }
                    } catch (final Throwable ccatch_env_var2) {
                        error_message = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                } finally {
                    Errors.$continue_cerrorP$.rebind(_prev_bind_0_$7, thread);
                }
            }
            pcase_var = agenda_error_mode();
            if (pcase_var.eql($IGNORE)) {
                if (NIL == error_message) {
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                handle_agenda_fi_error_state();
                            } catch (final Throwable catch_var2) {
                                Errors.handleThrowable(catch_var2, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                }
                if (NIL != error_message) {
                    Errors.warn($str39$_A, error_message);
                }
            } else
                if (pcase_var.eql($HALT)) {
                    if (NIL == error_message) {
                        try {
                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    handle_agenda_fi_error_state();
                                } catch (final Throwable catch_var2) {
                                    Errors.handleThrowable(catch_var2, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                    }
                    if (NIL != error_message) {
                        $last_agenda_error_message$.setGlobalValue(error_message);
                        halt_agenda(UNPROVIDED);
                    }
                } else
                    if (pcase_var.eql($DEBUG)) {
                        handle_agenda_fi_error_state();
                    } else
                        if (pcase_var.eql($LOG)) {
                            if (NIL == error_message) {
                                try {
                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            handle_agenda_fi_error_state();
                                        } catch (final Throwable catch_var2) {
                                            Errors.handleThrowable(catch_var2, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$11, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                } finally {
                                    thread.throwStack.pop();
                                }
                            }
                            if (NIL != error_message) {
                                log_agenda_error($last_agenda_op$.getGlobalValue());
                            }
                        }



        } finally {
            fi.$fi_warning$.rebind(_prev_bind_2, thread);
            fi.$fi_error$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject agenda_throw_error_message() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sublisp_throw($AGENDA_ABORT, Errors.$error_message$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject log_agenda_error(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timestamp = operation_queues.local_queue_peek();
        final SubLObject cyclist = operation_communication.the_cyclist();
        final SubLObject date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        if (NIL == timestamp_operation_p(timestamp)) {
            timestamp = construct_generic_timestamp_operation();
        }
        final SubLObject output_op = list(encapsulation.encapsulate(cyclist), cyc_image_id(), date, form);
        final SubLObject output_timestamp = list(encapsulation.encapsulate(cyclist), cyc_image_id(), date, timestamp);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text($agenda_log_file$.getDynamicValue(thread), $APPEND);
            if (!stream.isStream()) {
                Errors.error($str59$Unable_to_open__S, $agenda_log_file$.getDynamicValue(thread));
            }
            final SubLObject file = stream;
            format(file, $str60$_s__, output_op);
            format(file, $str60$_s__, output_timestamp);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject timestamp_operation_p(final SubLObject operation) {
        return makeBoolean(operation.isList() && (operation.first() == FI_TIMESTAMP_ASSERTION));
    }

    public static SubLObject construct_generic_timestamp_operation() {
        return listS(FI_TIMESTAMP_ASSERTION, encapsulation.encapsulate($$Guest), $list63);
    }

    public static SubLObject normal_transmit_operationsP() {
        return makeBoolean(((((NIL != time_has_arrivedP($next_normal_transmit_time$.getGlobalValue())) && (NIL == operation_queues.transmit_queue_empty())) && (NIL != operation_communication.allow_transmitting())) && (NIL != operation_queues.local_queue_empty())) && (NIL != operation_queues.transcript_queue_empty()));
    }

    public static SubLObject normal_transmit_operations() {
        $next_normal_transmit_time$.setGlobalValue(numeric_date_utilities.time_from_now(add($normal_transmit_quantum$.getGlobalValue(), random.random(TWENTY_INTEGER))));
        operation_communication.send_local_transcript();
        return NIL;
    }

    public static SubLObject run_remote_opP() {
        return operation_communication.remote_operation_to_runP();
    }

    public static SubLObject run_one_remote_op_in_agenda() {
        return run_one_non_local_op_in_agenda(RUN_ONE_REMOTE_OP);
    }

    public static SubLObject load_operationsP() {
        final SubLObject receiveP = operation_communication.receiving_remote_operationsP();
        if ((NIL != receiveP) && (NIL != $last_receiving_remote_operationsP$.getGlobalValue())) {
            return time_has_arrivedP($next_load_transcript_time$.getGlobalValue());
        }
        $last_receiving_remote_operationsP$.setGlobalValue(receiveP);
        return receiveP;
    }

    public static SubLObject load_remote_operations() {
        $next_load_transcript_time$.setGlobalValue(numeric_date_utilities.time_from_now(NIL == caught_up_on_master_transcript() ? ZERO_INTEGER : add($load_transcript_quantum$.getGlobalValue(), random.random(TWENTY_INTEGER))));
        operation_communication.load_transcript_exprs();
        return NIL;
    }

    public static SubLObject save_experienceP() {
        return makeBoolean((NIL != $save_recent_experienceP$.getGlobalValue()) && (NIL != time_has_arrivedP($next_save_experience_transcript_time$.getGlobalValue())));
    }

    public static SubLObject save_local_experience() {
        $next_save_experience_transcript_time$.setGlobalValue(numeric_date_utilities.time_from_now($save_experience_transcript_quantum$.getGlobalValue()));
        return inference_analysis.possibly_save_recent_experience();
    }

    public static SubLObject auto_flush_logsP() {
        return makeBoolean((NIL != $auto_flush_logsP$.getGlobalValue()) && (NIL != time_has_arrivedP($next_auto_flush_logs_transcript_time$.getGlobalValue())));
    }

    public static SubLObject auto_flush_logs() {
        $next_auto_flush_logs_transcript_time$.setGlobalValue(numeric_date_utilities.time_from_now($auto_flush_logs_transcript_quantum$.getGlobalValue()));
        return misc_utilities.flush_all_logs();
    }

    public static SubLObject agenda_save_asked_queriesP() {
        return makeBoolean((NIL != save_asked_queriesP()) && (NIL != time_has_arrivedP($next_save_asked_queries_transcript_time$.getGlobalValue())));
    }

    public static SubLObject save_local_asked_queries() {
        $next_save_asked_queries_transcript_time$.setGlobalValue(numeric_date_utilities.time_from_now($save_asked_queries_transcript_quantum$.getGlobalValue()));
        return inference_analysis.possibly_save_recent_asked_queries();
    }

    public static SubLObject monitor_sksi_global_resourcingP() {
        return makeBoolean(((NIL != sksi_sks_interaction.within_sksi_global_resourcingP()) && (NIL != sksi_sks_interaction.sksi_global_resourcing_initializedP())) && (NIL != time_has_arrivedP($next_sksi_global_resourcing_monitor_time$.getGlobalValue())));
    }

    public static SubLObject monitor_sksi_global_resourcing() {
        $next_sksi_global_resourcing_monitor_time$.setGlobalValue(numeric_date_utilities.time_from_now($sksi_monitor_global_resourcing_time_delta$.getGlobalValue()));
        return sksi_sks_interaction.sksi_possibly_reap_connections(UNPROVIDED);
    }

    public static SubLObject enable_agenda_daily_gc(final SubLObject hour, final SubLObject minute, final SubLObject second) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (((!hour.isInteger()) || (!ZERO_INTEGER.numLE(hour))) || (!hour.numLE($int$23)))) {
            Errors.error($str97$Hour_must_be_an_integer_in_the_ra);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (((!minute.isInteger()) || (!ZERO_INTEGER.numLE(minute))) || (!minute.numLE($int$59)))) {
            Errors.error($str99$Minute_must_be_an_integer_in_the_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (((!second.isInteger()) || (!ZERO_INTEGER.numLE(second))) || (!second.numLE($int$59)))) {
            Errors.error($str100$Second_must_be_an_integer_in_the_);
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($agenda_daily_gc_lock$.getGlobalValue());
            $agenda_daily_gc_time_of_day$.setGlobalValue(list(hour, minute, second));
            set_next_agenda_daily_gc_time();
            $agenda_daily_gc_enabled$.setGlobalValue(T);
        } finally {
            if (NIL != release) {
                release_lock($agenda_daily_gc_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject disable_agenda_daily_gc() {
        SubLObject release = NIL;
        try {
            release = seize_lock($agenda_daily_gc_lock$.getGlobalValue());
            $agenda_daily_gc_enabled$.setGlobalValue(NIL);
        } finally {
            if (NIL != release) {
                release_lock($agenda_daily_gc_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject agenda_daily_gc_ready_p() {
        return makeBoolean(((NIL != $agenda_daily_gc_enabled$.getGlobalValue()) && (NIL != $next_agenda_daily_gc_time$.getGlobalValue())) && (NIL != time_has_arrivedP($next_agenda_daily_gc_time$.getGlobalValue())));
    }

    public static SubLObject do_agenda_daily_gc() {
        final SubLObject message = cconcatenate($$$Doing_Agenda_Daily_GC_at_, format_nil.format_nil_a_no_copy(numeric_date_utilities.timestring(UNPROVIDED)));
        update_agenda_daily_gc_time();
        Storage.gc_full();
        return NIL;
    }

    public static SubLObject set_next_agenda_daily_gc_time() {
        SubLObject current;
        final SubLObject datum = current = $agenda_daily_gc_time_of_day$.getGlobalValue();
        SubLObject hour = NIL;
        SubLObject minute = NIL;
        SubLObject second = NIL;
        destructuring_bind_must_consp(current, datum, $list105);
        hour = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list105);
        minute = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list105);
        second = current.first();
        current = current.rest();
        if (NIL == current) {
            $next_agenda_daily_gc_time$.setGlobalValue(numeric_date_utilities.get_universal_time_within_next_day(second, minute, hour));
        } else {
            cdestructuring_bind_error(datum, $list105);
        }
        return NIL;
    }

    public static SubLObject update_agenda_daily_gc_time() {
        sleep(ONE_INTEGER);
        SubLObject release = NIL;
        try {
            release = seize_lock($agenda_daily_gc_lock$.getGlobalValue());
            set_next_agenda_daily_gc_time();
        } finally {
            if (NIL != release) {
                release_lock($agenda_daily_gc_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject declare_agenda_file() {
        declareFunction(me, "initialize_agenda", "INITIALIZE-AGENDA", 0, 0, false);
        declareFunction(me, "within_agenda", "WITHIN-AGENDA", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_form_to_show", "AGENDA-FORM-TO-SHOW", 0, 0, false);
        declareFunction(me, "agenda_top_level", "AGENDA-TOP-LEVEL", 0, 0, false);
        declareFunction(me, "start_agenda", "START-AGENDA", 0, 1, false);
        declareFunction(me, "restart_agenda", "RESTART-AGENDA", 0, 1, false);
        declareFunction(me, "halt_agenda", "HALT-AGENDA", 0, 1, false);
        declareFunction(me, "abort_agenda", "ABORT-AGENDA", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "abort_and_restart_agenda", "ABORT-AND-RESTART-AGENDA", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "wait_for_agenda_running", "WAIT-FOR-AGENDA-RUNNING", 0, 1, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "wait_for_agenda_not_running", "WAIT-FOR-AGENDA-NOT-RUNNING", 0, 1, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "ensure_agenda_running", "ENSURE-AGENDA-RUNNING", 0, 0, false);
        declareFunction(me, "agenda_process", "AGENDA-PROCESS", 0, 0, false);
        declareFunction(me, "agenda_running", "AGENDA-RUNNING", 0, 0, false);
        declareFunction(me, "agenda_state", "AGENDA-STATE", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "current_process_is_agenda", "CURRENT-PROCESS-IS-AGENDA", 0, 0, false);
        declareFunction(me, "agenda_idleP", "AGENDA-IDLE?", 0, 0, false);
        declareFunction(me, "agenda_busyP", "AGENDA-BUSY?", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "start_agenda_process", "START-AGENDA-PROCESS", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "clear_agenda_process", "CLEAR-AGENDA-PROCESS", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "kill_spurious_agenda_processes", "KILL-SPURIOUS-AGENDA-PROCESSES", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "spurious_agenda_processes", "SPURIOUS-AGENDA-PROCESSES", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_error_modes", "AGENDA-ERROR-MODES", 0, 0, false);
        declareFunction(me, "agenda_error_mode", "AGENDA-ERROR-MODE", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "set_agenda_error_mode", "SET-AGENDA-ERROR-MODE", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_logs_errorsP", "AGENDA-LOGS-ERRORS?", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "set_agenda_log_file", "SET-AGENDA-LOG-FILE", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "get_agenda_log_file", "GET-AGENDA-LOG-FILE", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "clear_agenda_log_file", "CLEAR-AGENDA-LOG-FILE", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_startup_actions", "AGENDA-STARTUP-ACTIONS", 0, 0, false);
        declareFunction(me, "agenda_work_to_do", "AGENDA-WORK-TO-DO", 0, 0, false);
        new agenda.$agenda_work_to_do$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "clear_agenda_halt_explanation", "CLEAR-AGENDA-HALT-EXPLANATION", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "perform_one_agenda_action", "PERFORM-ONE-AGENDA-ACTION", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "declare_agenda_task", "DECLARE-AGENDA-TASK", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "undeclare_agenda_task", "UNDECLARE-AGENDA-TASK", 1, 0, false);
        declareFunction(me, "agenda_tasks", "AGENDA-TASKS", 0, 0, false);
        declareFunction(me, "agenda_task_test", "AGENDA-TASK-TEST", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_task_action", "AGENDA-TASK-ACTION", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_task_priority", "AGENDA-TASK-PRIORITY", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_should_quitP", "AGENDA-SHOULD-QUIT?", 0, 0, false);
        new agenda.$agenda_should_quitP$ZeroArityFunction();
        declareFunction(me, "do_nothing", "DO-NOTHING", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "restart_agenda_flagP", "RESTART-AGENDA-FLAG?", 0, 0, false);
        new agenda.$restart_agenda_flagP$ZeroArityFunction();
        declareFunction(me, "save_operationsP", "SAVE-OPERATIONS?", 0, 0, false);
        new agenda.$save_operationsP$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "save_local_operations", "SAVE-LOCAL-OPERATIONS", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "worry_transmit_operationsP", "WORRY-TRANSMIT-OPERATIONS?", 0, 0, false);
        new agenda.$worry_transmit_operationsP$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "worry_transmit_operations", "WORRY-TRANSMIT-OPERATIONS", 0, 0, false);
        declareFunction(me, "run_auxiliary_opP", "RUN-AUXILIARY-OP?", 0, 0, false);
        new agenda.$run_auxiliary_opP$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "run_one_auxiliary_op_in_agenda", "RUN-ONE-AUXILIARY-OP-IN-AGENDA", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "run_one_non_local_op_in_agenda", "RUN-ONE-NON-LOCAL-OP-IN-AGENDA", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "handle_agenda_fi_error_state", "HANDLE-AGENDA-FI-ERROR-STATE", 0, 0, false);
        declareFunction(me, "run_local_opP", "RUN-LOCAL-OP?", 0, 0, false);
        new agenda.$run_local_opP$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "run_one_local_op_in_agenda", "RUN-ONE-LOCAL-OP-IN-AGENDA", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_throw_error_message", "AGENDA-THROW-ERROR-MESSAGE", 0, 0, false);
        declareFunction(me, "log_agenda_error", "LOG-AGENDA-ERROR", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "timestamp_operation_p", "TIMESTAMP-OPERATION-P", 1, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "construct_generic_timestamp_operation", "CONSTRUCT-GENERIC-TIMESTAMP-OPERATION", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "normal_transmit_operationsP", "NORMAL-TRANSMIT-OPERATIONS?", 0, 0, false);
        new agenda.$normal_transmit_operationsP$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "normal_transmit_operations", "NORMAL-TRANSMIT-OPERATIONS", 0, 0, false);
        declareFunction(me, "run_remote_opP", "RUN-REMOTE-OP?", 0, 0, false);
        new agenda.$run_remote_opP$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "run_one_remote_op_in_agenda", "RUN-ONE-REMOTE-OP-IN-AGENDA", 0, 0, false);
        declareFunction(me, "load_operationsP", "LOAD-OPERATIONS?", 0, 0, false);
        new agenda.$load_operationsP$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "load_remote_operations", "LOAD-REMOTE-OPERATIONS", 0, 0, false);
        declareFunction(me, "save_experienceP", "SAVE-EXPERIENCE?", 0, 0, false);
        new agenda.$save_experienceP$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "save_local_experience", "SAVE-LOCAL-EXPERIENCE", 0, 0, false);
        declareFunction(me, "auto_flush_logsP", "AUTO-FLUSH-LOGS?", 0, 0, false);
        declareFunction(me, "auto_flush_logs", "AUTO-FLUSH-LOGS", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_save_asked_queriesP", "AGENDA-SAVE-ASKED-QUERIES?", 0, 0, false);
        new agenda.$agenda_save_asked_queriesP$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "save_local_asked_queries", "SAVE-LOCAL-ASKED-QUERIES", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "monitor_sksi_global_resourcingP", "MONITOR-SKSI-GLOBAL-RESOURCING?", 0, 0, false);
        new agenda.$monitor_sksi_global_resourcingP$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "monitor_sksi_global_resourcing", "MONITOR-SKSI-GLOBAL-RESOURCING", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "enable_agenda_daily_gc", "ENABLE-AGENDA-DAILY-GC", 3, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "disable_agenda_daily_gc", "DISABLE-AGENDA-DAILY-GC", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "agenda_daily_gc_ready_p", "AGENDA-DAILY-GC-READY-P", 0, 0, false);
        new agenda.$agenda_daily_gc_ready_p$ZeroArityFunction();
        declareFunction("com.cyc.cycjava.cycl.agenda", "do_agenda_daily_gc", "DO-AGENDA-DAILY-GC", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "set_next_agenda_daily_gc_time", "SET-NEXT-AGENDA-DAILY-GC-TIME", 0, 0, false);
        declareFunction("com.cyc.cycjava.cycl.agenda", "update_agenda_daily_gc_time", "UPDATE-AGENDA-DAILY-GC-TIME", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_agenda_file() {
        deflexical("*AGENDA-SHOULD-QUIT*", NIL != boundp($agenda_should_quit$) ? $agenda_should_quit$.getGlobalValue() : NIL);
        deflexical("*RESTART-AGENDA-FLAG*", NIL != boundp($restart_agenda_flag$) ? $restart_agenda_flag$.getGlobalValue() : NIL);
        defparameter("*WITHIN-AGENDA*", NIL);
        deflexical("*DEFAULT-AGENDA-PACKAGE*", find_package($$$CYC));
        defparameter("*AGENDA-RESOURCING-SPACES*", TEN_INTEGER);
        defconstant("*AGENDA-PROCESS-NAME*", $$$Cyc_Agenda);
        deflexical("*AGENDA-PROCESS*", NIL != boundp($agenda_process$) ? $agenda_process$.getGlobalValue() : NIL);
        deflexical("*AGENDA-PROCESS-LOCK*", make_lock($$$Agenda_Process_Lock));
        deflexical("*AGENDA-ERROR-MODES*", $list13);
        deflexical("*AGENDA-ERROR-MODE*", NIL != boundp($agenda_error_mode$) ? $agenda_error_mode$.getGlobalValue() : $HALT);
        defvar("*AGENDA-LOG-FILE*", NIL);
        deflexical("*AGENDA-ACTION-TABLE*", NIL != boundp($agenda_action_table$) ? $agenda_action_table$.getGlobalValue() : NIL);
        deflexical("*AGENDA-ACTION-TABLE-LOCK*", make_lock($$$Agenda_Action_Table_Lock));
        deflexical("*TRANSCRIPT-QUEUE-WORRY-SIZE*", TWENTY_INTEGER);
        deflexical("*SAVE-TRANSCRIPT-QUANTUM*", $int$60);
        deflexical("*NEXT-SAVE-TRANSCRIPT-TIME*", NIL != boundp($next_save_transcript_time$) ? $next_save_transcript_time$.getGlobalValue() : get_universal_time());
        deflexical("*WORRY-TRANSMIT-QUANTUM*", multiply(TEN_INTEGER, $int$60));
        deflexical("*WORRY-TRANSMIT-SIZE*", $int$1000);
        deflexical("*NEXT-WORRY-TRANSMIT-TIME*", NIL != boundp($next_worry_transmit_time$) ? $next_worry_transmit_time$.getGlobalValue() : get_universal_time());
        deflexical("*NORMAL-TRANSMIT-QUANTUM*", $int$120);
        deflexical("*NEXT-NORMAL-TRANSMIT-TIME*", NIL != boundp($next_normal_transmit_time$) ? $next_normal_transmit_time$.getGlobalValue() : get_universal_time());
        deflexical("*LOAD-TRANSCRIPT-QUANTUM*", $int$120);
        deflexical("*NEXT-LOAD-TRANSCRIPT-TIME*", NIL != boundp($next_load_transcript_time$) ? $next_load_transcript_time$.getGlobalValue() : get_universal_time());
        deflexical("*LAST-RECEIVING-REMOTE-OPERATIONS?*", NIL != boundp($sym74$_LAST_RECEIVING_REMOTE_OPERATIONS__) ? $last_receiving_remote_operationsP$.getGlobalValue() : NIL);
        deflexical("*SAVE-RECENT-EXPERIENCE?*", T);
        deflexical("*SAVE-EXPERIENCE-TRANSCRIPT-QUANTUM*", multiply($int$60, TEN_INTEGER));
        deflexical("*NEXT-SAVE-EXPERIENCE-TRANSCRIPT-TIME*", NIL != boundp($next_save_experience_transcript_time$) ? $next_save_experience_transcript_time$.getGlobalValue() : get_universal_time());
        deflexical("*AUTO-FLUSH-LOGS?*", T);
        deflexical("*AUTO-FLUSH-LOGS-TRANSCRIPT-QUANTUM*", multiply($int$60, FIVE_INTEGER));
        deflexical("*NEXT-AUTO-FLUSH-LOGS-TRANSCRIPT-TIME*", NIL != boundp($next_auto_flush_logs_transcript_time$) ? $next_auto_flush_logs_transcript_time$.getGlobalValue() : get_universal_time());
        deflexical("*SAVE-ASKED-QUERIES-TRANSCRIPT-QUANTUM*", multiply($int$60, ONE_INTEGER));
        deflexical("*NEXT-SAVE-ASKED-QUERIES-TRANSCRIPT-TIME*", NIL != boundp($next_save_asked_queries_transcript_time$) ? $next_save_asked_queries_transcript_time$.getGlobalValue() : get_universal_time());
        deflexical("*NEXT-SKSI-GLOBAL-RESOURCING-MONITOR-TIME*", NIL != boundp($next_sksi_global_resourcing_monitor_time$) ? $next_sksi_global_resourcing_monitor_time$.getGlobalValue() : get_universal_time());
        deflexical("*SKSI-MONITOR-GLOBAL-RESOURCING-TIME-DELTA*", multiply($int$60, TWO_INTEGER));
        deflexical("*AGENDA-DAILY-GC-LOCK*", make_lock($$$Agenda_Daily_GC));
        deflexical("*AGENDA-DAILY-GC-ENABLED*", NIL != boundp($agenda_daily_gc_enabled$) ? $agenda_daily_gc_enabled$.getGlobalValue() : NIL);
        deflexical("*AGENDA-DAILY-GC-TIME-OF-DAY*", NIL != boundp($agenda_daily_gc_time_of_day$) ? $agenda_daily_gc_time_of_day$.getGlobalValue() : $list95);
        deflexical("*NEXT-AGENDA-DAILY-GC-TIME*", NIL != boundp($next_agenda_daily_gc_time$) ? $next_agenda_daily_gc_time$.getGlobalValue() : NIL);
        return NIL;
    }

    public static SubLObject setup_agenda_file() {
        declare_defglobal($agenda_should_quit$);
        declare_defglobal($restart_agenda_flag$);
        declare_defglobal($agenda_process$);
        register_external_symbol(AGENDA_RUNNING);
        declare_defglobal($agenda_error_mode$);
        declare_defglobal($agenda_action_table$);
        declare_agenda_task($sym24$AGENDA_SHOULD_QUIT_, DO_NOTHING, ZERO_INTEGER);
        declare_agenda_task($sym26$RESTART_AGENDA_FLAG_, DO_NOTHING, ZERO_INTEGER);
        declare_defglobal($next_save_transcript_time$);
        declare_agenda_task($sym29$SAVE_OPERATIONS_, SAVE_LOCAL_OPERATIONS, TEN_INTEGER);
        declare_defglobal($next_worry_transmit_time$);
        declare_agenda_task($sym33$WORRY_TRANSMIT_OPERATIONS_, WORRY_TRANSMIT_OPERATIONS, FIFTEEN_INTEGER);
        declare_agenda_task($sym36$RUN_AUXILIARY_OP_, RUN_ONE_AUXILIARY_OP_IN_AGENDA, TWENTY_INTEGER);
        declare_agenda_task($sym55$RUN_LOCAL_OP_, RUN_ONE_LOCAL_OP_IN_AGENDA, $int$25);
        declare_defglobal($next_normal_transmit_time$);
        declare_agenda_task($sym66$NORMAL_TRANSMIT_OPERATIONS_, NORMAL_TRANSMIT_OPERATIONS, $int$35);
        declare_agenda_task($sym70$RUN_REMOTE_OP_, RUN_ONE_REMOTE_OP_IN_AGENDA, $int$40);
        declare_defglobal($next_load_transcript_time$);
        declare_defglobal($sym74$_LAST_RECEIVING_REMOTE_OPERATIONS__);
        declare_agenda_task($sym75$LOAD_OPERATIONS_, LOAD_REMOTE_OPERATIONS, $int$45);
        declare_defglobal($next_save_experience_transcript_time$);
        declare_agenda_task($sym79$SAVE_EXPERIENCE_, SAVE_LOCAL_EXPERIENCE, $int$60);
        declare_defglobal($next_auto_flush_logs_transcript_time$);
        declare_agenda_task($sym82$AUTO_FLUSH_LOGS_, AUTO_FLUSH_LOGS, $int$60);
        declare_defglobal($next_save_asked_queries_transcript_time$);
        declare_agenda_task($sym85$AGENDA_SAVE_ASKED_QUERIES_, SAVE_LOCAL_ASKED_QUERIES, $int$30);
        declare_defglobal($next_sksi_global_resourcing_monitor_time$);
        declare_agenda_task($sym89$MONITOR_SKSI_GLOBAL_RESOURCING_, MONITOR_SKSI_GLOBAL_RESOURCING, $int$43);
        declare_defglobal($agenda_daily_gc_enabled$);
        declare_defglobal($agenda_daily_gc_time_of_day$);
        declare_defglobal($next_agenda_daily_gc_time$);
        declare_agenda_task(AGENDA_DAILY_GC_READY_P, DO_AGENDA_DAILY_GC, $int$1000);
        return NIL;
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

    

    public static final class $agenda_work_to_do$ZeroArityFunction extends ZeroArityFunction {
        public $agenda_work_to_do$ZeroArityFunction() {
            super(extractFunctionNamed("AGENDA-WORK-TO-DO"));
        }

        @Override
        public SubLObject processItem() {
            return agenda_work_to_do();
        }
    }

    public static final class $agenda_should_quitP$ZeroArityFunction extends ZeroArityFunction {
        public $agenda_should_quitP$ZeroArityFunction() {
            super(extractFunctionNamed("AGENDA-SHOULD-QUIT?"));
        }

        @Override
        public SubLObject processItem() {
            return agenda_should_quitP();
        }
    }

    public static final class $restart_agenda_flagP$ZeroArityFunction extends ZeroArityFunction {
        public $restart_agenda_flagP$ZeroArityFunction() {
            super(extractFunctionNamed("RESTART-AGENDA-FLAG?"));
        }

        @Override
        public SubLObject processItem() {
            return restart_agenda_flagP();
        }
    }

    public static final class $save_operationsP$ZeroArityFunction extends ZeroArityFunction {
        public $save_operationsP$ZeroArityFunction() {
            super(extractFunctionNamed("SAVE-OPERATIONS?"));
        }

        @Override
        public SubLObject processItem() {
            return save_operationsP();
        }
    }

    public static final class $worry_transmit_operationsP$ZeroArityFunction extends ZeroArityFunction {
        public $worry_transmit_operationsP$ZeroArityFunction() {
            super(extractFunctionNamed("WORRY-TRANSMIT-OPERATIONS?"));
        }

        @Override
        public SubLObject processItem() {
            return worry_transmit_operationsP();
        }
    }

    public static final class $run_auxiliary_opP$ZeroArityFunction extends ZeroArityFunction {
        public $run_auxiliary_opP$ZeroArityFunction() {
            super(extractFunctionNamed("RUN-AUXILIARY-OP?"));
        }

        @Override
        public SubLObject processItem() {
            return run_auxiliary_opP();
        }
    }

    public static final class $run_local_opP$ZeroArityFunction extends ZeroArityFunction {
        public $run_local_opP$ZeroArityFunction() {
            super(extractFunctionNamed("RUN-LOCAL-OP?"));
        }

        @Override
        public SubLObject processItem() {
            return run_local_opP();
        }
    }

    public static final class $normal_transmit_operationsP$ZeroArityFunction extends ZeroArityFunction {
        public $normal_transmit_operationsP$ZeroArityFunction() {
            super(extractFunctionNamed("NORMAL-TRANSMIT-OPERATIONS?"));
        }

        @Override
        public SubLObject processItem() {
            return normal_transmit_operationsP();
        }
    }

    public static final class $run_remote_opP$ZeroArityFunction extends ZeroArityFunction {
        public $run_remote_opP$ZeroArityFunction() {
            super(extractFunctionNamed("RUN-REMOTE-OP?"));
        }

        @Override
        public SubLObject processItem() {
            return run_remote_opP();
        }
    }

    public static final class $load_operationsP$ZeroArityFunction extends ZeroArityFunction {
        public $load_operationsP$ZeroArityFunction() {
            super(extractFunctionNamed("LOAD-OPERATIONS?"));
        }

        @Override
        public SubLObject processItem() {
            return load_operationsP();
        }
    }

    public static final class $save_experienceP$ZeroArityFunction extends ZeroArityFunction {
        public $save_experienceP$ZeroArityFunction() {
            super(extractFunctionNamed("SAVE-EXPERIENCE?"));
        }

        @Override
        public SubLObject processItem() {
            return save_experienceP();
        }
    }

    public static final class $agenda_save_asked_queriesP$ZeroArityFunction extends ZeroArityFunction {
        public $agenda_save_asked_queriesP$ZeroArityFunction() {
            super(extractFunctionNamed("AGENDA-SAVE-ASKED-QUERIES?"));
        }

        @Override
        public SubLObject processItem() {
            return agenda_save_asked_queriesP();
        }
    }

    public static final class $monitor_sksi_global_resourcingP$ZeroArityFunction extends ZeroArityFunction {
        public $monitor_sksi_global_resourcingP$ZeroArityFunction() {
            super(extractFunctionNamed("MONITOR-SKSI-GLOBAL-RESOURCING?"));
        }

        @Override
        public SubLObject processItem() {
            return monitor_sksi_global_resourcingP();
        }
    }

    public static final class $agenda_daily_gc_ready_p$ZeroArityFunction extends ZeroArityFunction {
        public $agenda_daily_gc_ready_p$ZeroArityFunction() {
            super(extractFunctionNamed("AGENDA-DAILY-GC-READY-P"));
        }

        @Override
        public SubLObject processItem() {
            return agenda_daily_gc_ready_p();
        }
    }
}

/**
 * Total time: 643 ms
 */
