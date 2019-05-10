package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;

import org.logicmoo.system.SystemCurrent;

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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

import ch.epfl.lamp.fjbg.Main;

public final class agenda
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.agenda";
  public static final String myFingerPrint = "33b62fc74ce6d070d3b0b5c900a15374294a736721ce77da481f2cbbe0c3a094";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 799L)
  private static SubLSymbol $agenda_should_quit$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 846L)
  private static SubLSymbol $restart_agenda_flag$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1273L)
  private static SubLSymbol $within_agenda$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1549L)
  private static SubLSymbol $default_agenda_package$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1675L)
  private static SubLSymbol $agenda_resourcing_spaces$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2454L)
  private static SubLSymbol $agenda_process_name$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4674L)
  private static SubLSymbol $agenda_process$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5572L)
  private static SubLSymbol $agenda_process_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7057L)
  private static SubLSymbol $agenda_error_modes$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7268L)
  private static SubLSymbol $agenda_error_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7603L)
  private static SubLSymbol $agenda_log_file$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9213L)
  private static SubLSymbol $agenda_action_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9429L)
  private static SubLSymbol $agenda_action_table_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11226L)
  private static SubLSymbol $transcript_queue_worry_size$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11342L)
  private static SubLSymbol $save_transcript_quantum$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11432L)
  private static SubLSymbol $next_save_transcript_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12082L)
  private static SubLSymbol $worry_transmit_quantum$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12230L)
  private static SubLSymbol $worry_transmit_size$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12278L)
  private static SubLSymbol $next_worry_transmit_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17585L)
  private static SubLSymbol $normal_transmit_quantum$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17731L)
  private static SubLSymbol $next_normal_transmit_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18774L)
  private static SubLSymbol $load_transcript_quantum$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18887L)
  private static SubLSymbol $next_load_transcript_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18956L)
  private static SubLSymbol $last_receiving_remote_operationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19804L)
  public static SubLSymbol $save_recent_experienceP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20001L)
  private static SubLSymbol $save_experience_transcript_quantum$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20083L)
  private static SubLSymbol $next_save_experience_transcript_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20561L)
  public static SubLSymbol $auto_flush_logsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20735L)
  private static SubLSymbol $auto_flush_logs_transcript_quantum$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20815L)
  private static SubLSymbol $next_auto_flush_logs_transcript_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21257L)
  private static SubLSymbol $save_asked_queries_transcript_quantum$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21407L)
  private static SubLSymbol $next_save_asked_queries_transcript_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21924L)
  private static SubLSymbol $next_sksi_global_resourcing_monitor_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21924L)
  private static SubLSymbol $sksi_monitor_global_resourcing_time_delta$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24539L)
  private static SubLSymbol $agenda_daily_gc_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25034L)
  private static SubLSymbol $agenda_daily_gc_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25162L)
  private static SubLSymbol $agenda_daily_gc_time_of_day$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26117L)
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

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 892L)
  public static SubLObject initialize_agenda()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    operation_communication.set_communication_mode( operation_communication.$startup_communication_mode$.getDynamicValue( thread ) );
    if( NIL != system_parameters.$start_agenda_at_startupP$.getDynamicValue( thread ) && NIL == agenda_running() )
    {
      start_agenda( TEN_INTEGER );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1317L)
  public static SubLObject within_agenda()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_agenda$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1375L)
  public static SubLObject agenda_form_to_show()
  {
    return encapsulation.unencapsulate_partial( control_vars.$last_agenda_op$.getGlobalValue() );
  }

  public static SubLObject agenda_top_level()
  {
    final SubLObject retval = agenda_top_level0();
    return retval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1797L)
  public static SubLObject agenda_top_level0()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    start_agenda_process();
    if( NIL != current_process_is_agenda() )
    {
      Threads.set_process_priority( agenda_process(), Threads.$process_background_priority$.getGlobalValue() );
      try
      {
        agenda_startup_actions();
        $restart_agenda_flag$.setGlobalValue( NIL );
        final SubLObject _prev_bind_0 = Packages.$package$.currentBinding( thread );
        try
        {
          Packages.$package$.bind( $default_agenda_package$.getGlobalValue(), thread );
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, $agenda_resourcing_spaces$.getDynamicValue( thread ) ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            while ( NIL == $agenda_should_quit$.getGlobalValue())
            {
              while ( NIL == $agenda_should_quit$.getGlobalValue() && NIL != agenda_work_to_do())
              {
                perform_one_agenda_action();
              }
              Threads.process_wait( $str3$Idle, Symbols.symbol_function( $sym4$AGENDA_WORK_TO_DO ) );
            }
          }
          finally
          {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$1, thread );
          }
        }
        finally
        {
          Packages.$package$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          process_utilities.current_process_clear_form();
          clear_agenda_process();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2512L)
  public static SubLObject start_agenda(SubLObject waitP)
  {
    if( waitP == UNPROVIDED )
    {
      waitP = NIL;
    }
    if( NIL != agenda_running() )
    {
      halt_agenda( UNPROVIDED );
    }
    $agenda_should_quit$.setGlobalValue( NIL );
    Threads.make_process( $agenda_process_name$.getGlobalValue(), Symbols.symbol_function( $sym6$AGENDA_TOP_LEVEL ) );
    if( NIL != waitP )
    {
      wait_for_agenda_running( waitP );
    }
    return agenda_running();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2868L)
  public static SubLObject restart_agenda(SubLObject waitP)
  {
    if( waitP == UNPROVIDED )
    {
      waitP = NIL;
    }
    if( NIL != agenda_running() )
    {
      halt_agenda( TWENTY_INTEGER );
    }
    return start_agenda( waitP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2995L)
  public static SubLObject halt_agenda(SubLObject waitP)
  {
    if( waitP == UNPROVIDED )
    {
      waitP = NIL;
    }
    $agenda_should_quit$.setGlobalValue( T );
    if( NIL != agenda_running() && NIL != waitP )
    {
      wait_for_agenda_not_running( waitP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3179L)
  public static SubLObject abort_agenda()
  {
    $agenda_should_quit$.setGlobalValue( T );
    if( NIL != agenda_running() )
    {
      Threads.kill_process( agenda_process() );
      clear_agenda_process();
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3760L)
  public static SubLObject abort_and_restart_agenda()
  {
    if( NIL != agenda_running() )
    {
      abort_agenda();
      return start_agenda( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3935L)
  public static SubLObject wait_for_agenda_running(SubLObject wait_time)
  {
    if( wait_time == UNPROVIDED )
    {
      wait_time = ONE_INTEGER;
    }
    final SubLObject time = numeric_date_utilities.time_from_now( wait_time );
    while ( NIL == agenda_running() && NIL == Time.time_has_arrivedP( time ))
    {
      Threads.sleep( ONE_INTEGER );
    }
    return agenda_running();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4160L)
  public static SubLObject wait_for_agenda_not_running(SubLObject wait_time)
  {
    if( wait_time == UNPROVIDED )
    {
      wait_time = ONE_INTEGER;
    }
    final SubLObject time = numeric_date_utilities.time_from_now( wait_time );
    while ( NIL != agenda_running() && NIL == Time.time_has_arrivedP( time ))
    {
      Threads.sleep( ONE_INTEGER );
    }
    return makeBoolean( NIL == agenda_running() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4403L)
  public static SubLObject ensure_agenda_running()
  {
    $agenda_should_quit$.setGlobalValue( NIL );
    if( NIL == agenda_running() )
    {
      start_agenda( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4984L)
  public static SubLObject agenda_process()
  {
    return $agenda_process$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5045L)
  public static SubLObject agenda_running()
  {
    return Threads.valid_process_p( agenda_process() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5125L)
  public static SubLObject agenda_state()
  {
    if( NIL != agenda_running() )
    {
      return Threads.process_whostate( agenda_process() );
    }
    return $str9$None;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5252L)
  public static SubLObject current_process_is_agenda()
  {
    return Equality.eq( Threads.current_process(), agenda_process() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5350L)
  public static SubLObject agenda_idleP()
  {
    return SubLObjectFactory.makeBoolean( NIL != agenda_running() && NIL != process_utilities.process_idleP( agenda_process() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5461L)
  public static SubLObject agenda_busyP()
  {
    return SubLObjectFactory.makeBoolean( NIL != agenda_running() && NIL != process_utilities.process_busyP( agenda_process() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5721L)
  public static SubLObject start_agenda_process()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $agenda_process_lock$.getGlobalValue() );
      if( NIL == $agenda_process$.getGlobalValue() )
      {
        $agenda_process$.setGlobalValue( Threads.current_process() );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $agenda_process_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5931L)
  public static SubLObject clear_agenda_process()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $agenda_process_lock$.getGlobalValue() );
      $agenda_process$.setGlobalValue( NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $agenda_process_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6093L)
  public static SubLObject kill_spurious_agenda_processes()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject spurious_agenda_processes = spurious_agenda_processes();
    SubLObject total = ZERO_INTEGER;
    SubLObject cdolist_list_var = spurious_agenda_processes;
    SubLObject process = NIL;
    process = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw11$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym12$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            Threads.kill_process( process );
            total = Numbers.add( total, ONE_INTEGER );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw11$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      cdolist_list_var = cdolist_list_var.rest();
      process = cdolist_list_var.first();
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6568L)
  public static SubLObject spurious_agenda_processes()
  {
    SubLObject spurious_agenda_processes = NIL;
    SubLObject cdolist_list_var = Threads.all_processes();
    SubLObject process = NIL;
    process = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $agenda_process_name$.getGlobalValue().equal( Threads.process_name( process ) ) && !process.eql( agenda_process() ) )
      {
        spurious_agenda_processes = ConsesLow.cons( process, spurious_agenda_processes );
      }
      cdolist_list_var = cdolist_list_var.rest();
      process = cdolist_list_var.first();
    }
    return Sequences.nreverse( spurious_agenda_processes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7207L)
  public static SubLObject agenda_error_modes()
  {
    return $agenda_error_modes$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7315L)
  public static SubLObject agenda_error_mode()
  {
    return $agenda_error_mode$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7381L)
  public static SubLObject set_agenda_error_mode(final SubLObject mode)
  {
    if( NIL != subl_promotions.memberP( mode, $agenda_error_modes$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      $agenda_error_mode$.setGlobalValue( mode );
      return mode;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7525L)
  public static SubLObject agenda_logs_errorsP()
  {
    return Equality.eq( agenda_error_mode(), $kw16$LOG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7712L)
  public static SubLObject set_agenda_log_file(final SubLObject file_path)
  {
    if( NIL != file_utilities.file_valid_for_writing_p( file_path ) )
    {
      $agenda_log_file$.setDynamicValue( file_path );
      return file_path;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7883L)
  public static SubLObject get_agenda_log_file()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $agenda_log_file$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7952L)
  public static SubLObject clear_agenda_log_file()
  {
    $agenda_log_file$.setDynamicValue( NIL );
    return get_agenda_log_file();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8059L)
  public static SubLObject agenda_startup_actions()
  {
    if( NIL == transcript_utilities.local_transcript() )
    {
      transcript_utilities.new_local_transcript();
    }
    if( NIL == transcript_utilities.master_transcript() )
    {
      transcript_utilities.set_master_transcript( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8336L)
  public static SubLObject agenda_work_to_do()
  {
    SubLObject cdolist_list_var = agenda_tasks();
    SubLObject agenda_task = NIL;
    agenda_task = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject test = agenda_task_test( agenda_task );
      if( NIL != Symbols.fboundp( test ) && NIL != Functions.funcall( test ) )
      {
        final SubLObject action = agenda_task_action( agenda_task );
        if( NIL != Symbols.fboundp( action ) )
        {
          return agenda_task;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      agenda_task = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8688L)
  public static SubLObject clear_agenda_halt_explanation()
  {
    control_vars.$last_agenda_error_message$.setGlobalValue( NIL );
    control_vars.$last_agenda_error_explanatory_supports$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8903L)
  public static SubLObject perform_one_agenda_action()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_agenda_halt_explanation();
    final SubLObject agenda_task = agenda_work_to_do();
    if( NIL != agenda_task )
    {
      final SubLObject action = agenda_task_action( agenda_task );
      final SubLObject _prev_bind_0 = $within_agenda$.currentBinding( thread );
      try
      {
        $within_agenda$.bind( T, thread );
        Functions.funcall( action );
      }
      catch( final Throwable e )
      {
        e.printStackTrace( SystemCurrent.err );
        Errors.handleError( e );
      }
      finally
      {
        $within_agenda$.rebind( _prev_bind_0, thread );
      }
    }
    return agenda_task;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9580L)
  public static SubLObject declare_agenda_task(final SubLObject test, final SubLObject action, final SubLObject priority)
  {
    assert NIL != Types.symbolp( test ) : test;
    assert NIL != Types.symbolp( action ) : action;
    assert NIL != Types.numberp( priority ) : priority;
    undeclare_agenda_task( test );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $agenda_action_table_lock$.getGlobalValue() );
      $agenda_action_table$.setGlobalValue( list_utilities.splice_into_sorted_list( ConsesLow.list( test, action, priority ), $agenda_action_table$.getGlobalValue(), Symbols.symbol_function( $sym21$_ ), Symbols
          .symbol_function( $sym22$AGENDA_TASK_PRIORITY ) ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $agenda_action_table_lock$.getGlobalValue() );
      }
    }
    return test;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10166L)
  public static SubLObject undeclare_agenda_task(final SubLObject test)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $agenda_action_table_lock$.getGlobalValue() );
      $agenda_action_table$.setGlobalValue( Sequences.delete( test, $agenda_action_table$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym23$FIRST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $agenda_action_table_lock$.getGlobalValue() );
      }
    }
    return test;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10414L)
  public static SubLObject agenda_tasks()
  {
    return $agenda_action_table$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10492L)
  public static SubLObject agenda_task_test(final SubLObject agenda_task)
  {
    return agenda_task.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10569L)
  public static SubLObject agenda_task_action(final SubLObject agenda_task)
  {
    return conses_high.second( agenda_task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10649L)
  public static SubLObject agenda_task_priority(final SubLObject agenda_task)
  {
    return conses_high.third( agenda_task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10730L)
  public static SubLObject agenda_should_quitP()
  {
    return $agenda_should_quit$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10920L)
  public static SubLObject do_nothing()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11022L)
  public static SubLObject restart_agenda_flagP()
  {
    return $restart_agenda_flag$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11501L)
  public static SubLObject save_operationsP()
  {
    return makeBoolean( NIL != operation_communication.saving_operationsP() && ( ( NIL != Time.time_has_arrivedP( $next_save_transcript_time$.getGlobalValue() ) && NIL == operation_queues.transcript_queue_empty()
        && NIL != operation_queues.local_queue_empty() ) || operation_queues.transcript_queue_size().numG( $transcript_queue_worry_size$.getGlobalValue() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11786L)
  public static SubLObject save_local_operations()
  {
    $next_save_transcript_time$.setGlobalValue( numeric_date_utilities.time_from_now( Numbers.add( $save_transcript_quantum$.getGlobalValue(), random.random( TWENTY_INTEGER ) ) ) );
    operation_communication.save_transcript_ops();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12346L)
  public static SubLObject worry_transmit_operationsP()
  {
    return makeBoolean( NIL != operation_communication.allow_transmitting() && ( ( NIL != Time.time_has_arrivedP( $next_worry_transmit_time$.getGlobalValue() ) && NIL == operation_queues.transmit_queue_empty() )
        || operation_queues.transmit_queue_size().numGE( $worry_transmit_size$.getGlobalValue() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12654L)
  public static SubLObject worry_transmit_operations()
  {
    $next_worry_transmit_time$.setGlobalValue( numeric_date_utilities.time_from_now( Numbers.add( $worry_transmit_quantum$.getGlobalValue(), random.random( TWENTY_INTEGER ) ) ) );
    operation_communication.send_local_transcript();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13098L)
  public static SubLObject run_auxiliary_opP()
  {
    return makeBoolean( NIL != operation_communication.process_auxiliary_operationsP() && NIL == operation_queues.auxiliary_queue_empty() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13285L)
  public static SubLObject run_one_auxiliary_op_in_agenda()
  {
    return run_one_non_local_op_in_agenda( $sym35$RUN_ONE_AUXILIARY_OP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13477L)
  public static SubLObject run_one_non_local_op_in_agenda(final SubLObject run_method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_message = NIL;
    final SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding( thread );
    final SubLObject _prev_bind_2 = fi.$fi_warning$.currentBinding( thread );
    try
    {
      fi.$fi_error$.bind( NIL, thread );
      fi.$fi_warning$.bind( NIL, thread );
      final SubLObject _prev_bind_0_$2 = Errors.$continue_cerrorP$.currentBinding( thread );
      final SubLObject _prev_bind_1_$3 = api_control_vars.$use_local_queueP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = control_vars.$use_transcriptP$.currentBinding( thread );
      final SubLObject _prev_bind_4 = operation_queues.$within_a_remote_opP$.currentBinding( thread );
      try
      {
        Errors.$continue_cerrorP$.bind( T, thread );
        api_control_vars.$use_local_queueP$.bind( NIL, thread );
        control_vars.$use_transcriptP$.bind( NIL, thread );
        operation_queues.$within_a_remote_opP$.bind( T, thread );
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym38$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              Functions.funcall( run_method );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$3, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        operation_queues.$within_a_remote_opP$.rebind( _prev_bind_4, thread );
        control_vars.$use_transcriptP$.rebind( _prev_bind_3, thread );
        api_control_vars.$use_local_queueP$.rebind( _prev_bind_1_$3, thread );
        Errors.$continue_cerrorP$.rebind( _prev_bind_0_$2, thread );
      }
      if( NIL == error_message )
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym38$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              handle_agenda_fi_error_state();
            }
            catch( final Throwable catch_var2 )
            {
              Errors.handleThrowable( catch_var2, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$4, thread );
          }
        }
        catch( final Throwable ccatch_env_var2 )
        {
          error_message = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      if( NIL != error_message )
      {
        Errors.warn( $str39$_A, error_message );
      }
    }
    finally
    {
      fi.$fi_warning$.rebind( _prev_bind_2, thread );
      fi.$fi_error$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14062L)
  public static SubLObject handle_agenda_fi_error_state()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject was_appendingP = Eval.eval( $sym40$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
    Eval.eval( $list41 );
    try
    {
      if( NIL != fi.fi_error_signaledP() )
      {
        SubLObject current;
        final SubLObject datum = current = fi.fi_get_error_int();
        SubLObject error = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
        error = current.first();
        current = current.rest();
        final SubLObject format_string = ( current.isCons() ? current.first() : NIL );
        cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list42 );
        final SubLObject args;
        current = ( args = current.rest() );
        Functions.apply( Symbols.symbol_function( $sym43$CERROR ), $str44$Continue_the_agenda, new SubLObject[] { Sequences.cconcatenate( $str45$__Last_operation___S____, ( NIL != format_string ) ? format_string
            : PrintLow.format( NIL, $str46$FI_error___A, error ) ), agenda_form_to_show(), args
        } );
        fi.reset_fi_error();
      }
      else if( NIL != control_vars.$agenda_display_fi_warnings$.getDynamicValue( thread ) && NIL == Errors.$ignore_warnsP$.getDynamicValue( thread ) && NIL != fi.fi_warning_signaledP() )
      {
        SubLObject current;
        final SubLObject datum = current = fi.fi_get_warning_int();
        SubLObject warning = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
        warning = current.first();
        current = current.rest();
        final SubLObject format_string = ( current.isCons() ? current.first() : NIL );
        cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list47 );
        final SubLObject args;
        current = ( args = current.rest() );
        Functions.apply( Symbols.symbol_function( $sym48$WARN ), Sequences.cconcatenate( $str45$__Last_operation___S____, ( NIL != format_string ) ? format_string
            : PrintLow.format( NIL, $str49$FI_warning___A, warning ) ), new SubLObject[]
            { agenda_form_to_show(), args
        } );
        fi.reset_fi_warning();
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        Eval.eval( ConsesLow.list( $sym50$CSETQ, $sym40$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15166L)
  public static SubLObject run_local_opP()
  {
    return makeBoolean( NIL != operation_communication.process_local_operationsP() && NIL == operation_queues.local_queue_empty() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15330L)
  public static SubLObject run_one_local_op_in_agenda()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_message = NIL;
    final SubLObject _prev_bind_0 = fi.$fi_error$.currentBinding( thread );
    final SubLObject _prev_bind_2 = fi.$fi_warning$.currentBinding( thread );
    try
    {
      fi.$fi_error$.bind( NIL, thread );
      fi.$fi_warning$.bind( NIL, thread );
      SubLObject pcase_var = agenda_error_mode();
      if( pcase_var.eql( $kw51$DEBUG ) )
      {
        try
        {
          thread.throwStack.push( $kw52$AGENDA_ABORT );
          final SubLObject _prev_bind_0_$6 = Errors.$error_abort_handler$.currentBinding( thread );
          try
          {
            Errors.$error_abort_handler$.bind( Symbols.symbol_function( $sym53$AGENDA_THROW_ERROR_MESSAGE ), thread );
            operation_queues.run_one_local_op();
          }
          finally
          {
            Errors.$error_abort_handler$.rebind( _prev_bind_0_$6, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          error_message = Errors.handleThrowable( ccatch_env_var, $kw52$AGENDA_ABORT );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      else
      {
        final SubLObject _prev_bind_0_$7 = Errors.$continue_cerrorP$.currentBinding( thread );
        try
        {
          Errors.$continue_cerrorP$.bind( T, thread );
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym38$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                operation_queues.run_one_local_op();
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$8, thread );
            }
          }
          catch( final Throwable ccatch_env_var2 )
          {
            error_message = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        finally
        {
          Errors.$continue_cerrorP$.rebind( _prev_bind_0_$7, thread );
        }
      }
      pcase_var = agenda_error_mode();
      if( pcase_var.eql( $kw54$IGNORE ) )
      {
        if( NIL == error_message )
        {
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym38$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                handle_agenda_fi_error_state();
              }
              catch( final Throwable catch_var2 )
              {
                Errors.handleThrowable( catch_var2, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$9, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        if( NIL != error_message )
        {
          Errors.warn( $str39$_A, error_message );
        }
      }
      else if( pcase_var.eql( $kw15$HALT ) )
      {
        if( NIL == error_message )
        {
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym38$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                handle_agenda_fi_error_state();
              }
              catch( final Throwable catch_var2 )
              {
                Errors.handleThrowable( catch_var2, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$10, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        if( NIL != error_message )
        {
          control_vars.$last_agenda_error_message$.setGlobalValue( error_message );
          halt_agenda( UNPROVIDED );
        }
      }
      else if( pcase_var.eql( $kw51$DEBUG ) )
      {
        handle_agenda_fi_error_state();
      }
      else if( pcase_var.eql( $kw16$LOG ) )
      {
        if( NIL == error_message )
        {
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym38$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                handle_agenda_fi_error_state();
              }
              catch( final Throwable catch_var2 )
              {
                Errors.handleThrowable( catch_var2, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$11, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        if( NIL != error_message )
        {
          log_agenda_error( control_vars.$last_agenda_op$.getGlobalValue() );
        }
      }
    }
    finally
    {
      fi.$fi_warning$.rebind( _prev_bind_2, thread );
      fi.$fi_error$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16597L)
  public static SubLObject agenda_throw_error_message()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Dynamic.sublisp_throw( $kw52$AGENDA_ABORT, Errors.$error_message$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16711L)
  public static SubLObject log_agenda_error(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject timestamp = operation_queues.local_queue_peek();
    final SubLObject cyclist = operation_communication.the_cyclist();
    final SubLObject date = numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED );
    if( NIL == timestamp_operation_p( timestamp ) )
    {
      timestamp = construct_generic_timestamp_operation();
    }
    final SubLObject output_op = ConsesLow.list( encapsulation.encapsulate( cyclist ), control_vars.cyc_image_id(), date, form );
    final SubLObject output_timestamp = ConsesLow.list( encapsulation.encapsulate( cyclist ), control_vars.cyc_image_id(), date, timestamp );
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( $agenda_log_file$.getDynamicValue( thread ), $kw58$APPEND );
      if( !stream.isStream() )
      {
        Errors.error( $str59$Unable_to_open__S, $agenda_log_file$.getDynamicValue( thread ) );
      }
      final SubLObject file = stream;
      PrintLow.format( file, $str60$_s__, output_op );
      PrintLow.format( file, $str60$_s__, output_timestamp );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17319L)
  public static SubLObject timestamp_operation_p(final SubLObject operation)
  {
    return makeBoolean( operation.isList() && operation.first() == $sym61$FI_TIMESTAMP_ASSERTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17457L)
  public static SubLObject construct_generic_timestamp_operation()
  {
    return ConsesLow.listS( $sym61$FI_TIMESTAMP_ASSERTION, encapsulation.encapsulate( $const62$Guest ), $list63 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17800L)
  public static SubLObject normal_transmit_operationsP()
  {
    return makeBoolean( NIL != Time.time_has_arrivedP( $next_normal_transmit_time$.getGlobalValue() ) && NIL == operation_queues.transmit_queue_empty() && NIL != operation_communication.allow_transmitting()
        && NIL != operation_queues.local_queue_empty() && NIL != operation_queues.transcript_queue_empty() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18146L)
  public static SubLObject normal_transmit_operations()
  {
    $next_normal_transmit_time$.setGlobalValue( numeric_date_utilities.time_from_now( Numbers.add( $normal_transmit_quantum$.getGlobalValue(), random.random( TWENTY_INTEGER ) ) ) );
    operation_communication.send_local_transcript();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18468L)
  public static SubLObject run_remote_opP()
  {
    return operation_communication.remote_operation_to_runP();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18594L)
  public static SubLObject run_one_remote_op_in_agenda()
  {
    return run_one_non_local_op_in_agenda( $sym69$RUN_ONE_REMOTE_OP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19016L)
  public static SubLObject load_operationsP()
  {
    final SubLObject receiveP = operation_communication.receiving_remote_operationsP();
    if( NIL != receiveP && NIL != $last_receiving_remote_operationsP$.getGlobalValue() )
    {
      return Time.time_has_arrivedP( $next_load_transcript_time$.getGlobalValue() );
    }
    $last_receiving_remote_operationsP$.setGlobalValue( receiveP );
    return receiveP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19344L)
  public static SubLObject load_remote_operations()
  {
    $next_load_transcript_time$.setGlobalValue( numeric_date_utilities.time_from_now( ( ( NIL == control_vars.caught_up_on_master_transcript() ) ? ZERO_INTEGER
        : Numbers.add( $load_transcript_quantum$.getGlobalValue(), random.random( TWENTY_INTEGER ) ) ) ) );
    operation_communication.load_transcript_exprs();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20163L)
  public static SubLObject save_experienceP()
  {
    return makeBoolean( NIL != $save_recent_experienceP$.getGlobalValue() && NIL != Time.time_has_arrivedP( $next_save_experience_transcript_time$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20307L)
  public static SubLObject save_local_experience()
  {
    $next_save_experience_transcript_time$.setGlobalValue( numeric_date_utilities.time_from_now( $save_experience_transcript_quantum$.getGlobalValue() ) );
    return inference_analysis.possibly_save_recent_experience();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20895L)
  public static SubLObject auto_flush_logsP()
  {
    return makeBoolean( NIL != $auto_flush_logsP$.getGlobalValue() && NIL != Time.time_has_arrivedP( $next_auto_flush_logs_transcript_time$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21032L)
  public static SubLObject auto_flush_logs()
  {
    $next_auto_flush_logs_transcript_time$.setGlobalValue( numeric_date_utilities.time_from_now( $auto_flush_logs_transcript_quantum$.getGlobalValue() ) );
    return misc_utilities.flush_all_logs();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21490L)
  public static SubLObject agenda_save_asked_queriesP()
  {
    return makeBoolean( NIL != control_vars.save_asked_queriesP() && NIL != Time.time_has_arrivedP( $next_save_asked_queries_transcript_time$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21645L)
  public static SubLObject save_local_asked_queries()
  {
    $next_save_asked_queries_transcript_time$.setGlobalValue( numeric_date_utilities.time_from_now( $save_asked_queries_transcript_quantum$.getGlobalValue() ) );
    return inference_analysis.possibly_save_recent_asked_queries();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21924L)
  public static SubLObject monitor_sksi_global_resourcingP()
  {
    return makeBoolean( NIL != sksi_sks_interaction.within_sksi_global_resourcingP() && NIL != sksi_sks_interaction.sksi_global_resourcing_initializedP() && NIL != Time.time_has_arrivedP(
        $next_sksi_global_resourcing_monitor_time$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21924L)
  public static SubLObject monitor_sksi_global_resourcing()
  {
    $next_sksi_global_resourcing_monitor_time$.setGlobalValue( numeric_date_utilities.time_from_now( $sksi_monitor_global_resourcing_time_delta$.getGlobalValue() ) );
    return sksi_sks_interaction.sksi_possibly_reap_connections( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25331L)
  public static SubLObject enable_agenda_daily_gc(final SubLObject hour, final SubLObject minute, final SubLObject second)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !hour.isInteger() || !ZERO_INTEGER.numLE( hour ) || !hour.numLE( $int96$23 ) ) )
    {
      Errors.error( $str97$Hour_must_be_an_integer_in_the_ra );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !minute.isInteger() || !ZERO_INTEGER.numLE( minute ) || !minute.numLE( $int98$59 ) ) )
    {
      Errors.error( $str99$Minute_must_be_an_integer_in_the_ );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !second.isInteger() || !ZERO_INTEGER.numLE( second ) || !second.numLE( $int98$59 ) ) )
    {
      Errors.error( $str100$Second_must_be_an_integer_in_the_ );
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $agenda_daily_gc_lock$.getGlobalValue() );
      $agenda_daily_gc_time_of_day$.setGlobalValue( ConsesLow.list( hour, minute, second ) );
      set_next_agenda_daily_gc_time();
      $agenda_daily_gc_enabled$.setGlobalValue( T );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $agenda_daily_gc_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25975L)
  public static SubLObject disable_agenda_daily_gc()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $agenda_daily_gc_lock$.getGlobalValue() );
      $agenda_daily_gc_enabled$.setGlobalValue( NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $agenda_daily_gc_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26187L)
  public static SubLObject agenda_daily_gc_ready_p()
  {
    return makeBoolean( NIL != $agenda_daily_gc_enabled$.getGlobalValue() && NIL != $next_agenda_daily_gc_time$.getGlobalValue() && NIL != Time.time_has_arrivedP( $next_agenda_daily_gc_time$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26361L)
  public static SubLObject do_agenda_daily_gc()
  {
    final SubLObject message = Sequences.cconcatenate( $str102$Doing_Agenda_Daily_GC_at_, format_nil.format_nil_a_no_copy( numeric_date_utilities.timestring( UNPROVIDED ) ) );
    update_agenda_daily_gc_time();
    Storage.gc_full();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26669L)
  public static SubLObject set_next_agenda_daily_gc_time()
  {
    SubLObject current;
    final SubLObject datum = current = $agenda_daily_gc_time_of_day$.getGlobalValue();
    SubLObject hour = NIL;
    SubLObject minute = NIL;
    SubLObject second = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    hour = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    minute = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    second = current.first();
    current = current.rest();
    if( NIL == current )
    {
      $next_agenda_daily_gc_time$.setGlobalValue( numeric_date_utilities.get_universal_time_within_next_day( second, minute, hour ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list105 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26921L)
  public static SubLObject update_agenda_daily_gc_time()
  {
    Threads.sleep( ONE_INTEGER );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $agenda_daily_gc_lock$.getGlobalValue() );
      set_next_agenda_daily_gc_time();
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $agenda_daily_gc_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  public static SubLObject declare_agenda_file()
  {
    SubLFiles.declareFunction( me, "initialize_agenda", "INITIALIZE-AGENDA", 0, 0, false );
    SubLFiles.declareFunction( me, "within_agenda", "WITHIN-AGENDA", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "agenda_form_to_show", "AGENDA-FORM-TO-SHOW", 0, 0, false );
    SubLFiles.declareFunction( me, "agenda_top_level", "AGENDA-TOP-LEVEL", 0, 0, false );
    SubLFiles.declareFunction( me, "start_agenda", "START-AGENDA", 0, 1, false );
    SubLFiles.declareFunction( me, "restart_agenda", "RESTART-AGENDA", 0, 1, false );
    SubLFiles.declareFunction( me, "halt_agenda", "HALT-AGENDA", 0, 1, false );
    SubLFiles.declareFunction( me, "abort_agenda", "ABORT-AGENDA", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "abort_and_restart_agenda", "ABORT-AND-RESTART-AGENDA", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "wait_for_agenda_running", "WAIT-FOR-AGENDA-RUNNING", 0, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "wait_for_agenda_not_running", "WAIT-FOR-AGENDA-NOT-RUNNING", 0, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "ensure_agenda_running", "ENSURE-AGENDA-RUNNING", 0, 0, false );
    SubLFiles.declareFunction( me, "agenda_process", "AGENDA-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( me, "agenda_running", "AGENDA-RUNNING", 0, 0, false );
    SubLFiles.declareFunction( me, "agenda_state", "AGENDA-STATE", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "current_process_is_agenda", "CURRENT-PROCESS-IS-AGENDA", 0, 0, false );
    SubLFiles.declareFunction( me, "agenda_idleP", "AGENDA-IDLE?", 0, 0, false );
    SubLFiles.declareFunction( me, "agenda_busyP", "AGENDA-BUSY?", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "start_agenda_process", "START-AGENDA-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "clear_agenda_process", "CLEAR-AGENDA-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "kill_spurious_agenda_processes", "KILL-SPURIOUS-AGENDA-PROCESSES", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "spurious_agenda_processes", "SPURIOUS-AGENDA-PROCESSES", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "agenda_error_modes", "AGENDA-ERROR-MODES", 0, 0, false );
    SubLFiles.declareFunction( me, "agenda_error_mode", "AGENDA-ERROR-MODE", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "set_agenda_error_mode", "SET-AGENDA-ERROR-MODE", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "agenda_logs_errorsP", "AGENDA-LOGS-ERRORS?", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "set_agenda_log_file", "SET-AGENDA-LOG-FILE", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "get_agenda_log_file", "GET-AGENDA-LOG-FILE", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "clear_agenda_log_file", "CLEAR-AGENDA-LOG-FILE", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "agenda_startup_actions", "AGENDA-STARTUP-ACTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "agenda_work_to_do", "AGENDA-WORK-TO-DO", 0, 0, false );
    new $agenda_work_to_do$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "clear_agenda_halt_explanation", "CLEAR-AGENDA-HALT-EXPLANATION", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "perform_one_agenda_action", "PERFORM-ONE-AGENDA-ACTION", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "declare_agenda_task", "DECLARE-AGENDA-TASK", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "undeclare_agenda_task", "UNDECLARE-AGENDA-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "agenda_tasks", "AGENDA-TASKS", 0, 0, false );
    SubLFiles.declareFunction( me, "agenda_task_test", "AGENDA-TASK-TEST", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "agenda_task_action", "AGENDA-TASK-ACTION", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "agenda_task_priority", "AGENDA-TASK-PRIORITY", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "agenda_should_quitP", "AGENDA-SHOULD-QUIT?", 0, 0, false );
    new $agenda_should_quitP$ZeroArityFunction();
    SubLFiles.declareFunction( me, "do_nothing", "DO-NOTHING", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "restart_agenda_flagP", "RESTART-AGENDA-FLAG?", 0, 0, false );
    new $restart_agenda_flagP$ZeroArityFunction();
    SubLFiles.declareFunction( me, "save_operationsP", "SAVE-OPERATIONS?", 0, 0, false );
    new $save_operationsP$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "save_local_operations", "SAVE-LOCAL-OPERATIONS", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "worry_transmit_operationsP", "WORRY-TRANSMIT-OPERATIONS?", 0, 0, false );
    new $worry_transmit_operationsP$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "worry_transmit_operations", "WORRY-TRANSMIT-OPERATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "run_auxiliary_opP", "RUN-AUXILIARY-OP?", 0, 0, false );
    new $run_auxiliary_opP$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "run_one_auxiliary_op_in_agenda", "RUN-ONE-AUXILIARY-OP-IN-AGENDA", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "run_one_non_local_op_in_agenda", "RUN-ONE-NON-LOCAL-OP-IN-AGENDA", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "handle_agenda_fi_error_state", "HANDLE-AGENDA-FI-ERROR-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "run_local_opP", "RUN-LOCAL-OP?", 0, 0, false );
    new $run_local_opP$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "run_one_local_op_in_agenda", "RUN-ONE-LOCAL-OP-IN-AGENDA", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "agenda_throw_error_message", "AGENDA-THROW-ERROR-MESSAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "log_agenda_error", "LOG-AGENDA-ERROR", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "timestamp_operation_p", "TIMESTAMP-OPERATION-P", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "construct_generic_timestamp_operation", "CONSTRUCT-GENERIC-TIMESTAMP-OPERATION", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "normal_transmit_operationsP", "NORMAL-TRANSMIT-OPERATIONS?", 0, 0, false );
    new $normal_transmit_operationsP$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "normal_transmit_operations", "NORMAL-TRANSMIT-OPERATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "run_remote_opP", "RUN-REMOTE-OP?", 0, 0, false );
    new $run_remote_opP$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "run_one_remote_op_in_agenda", "RUN-ONE-REMOTE-OP-IN-AGENDA", 0, 0, false );
    SubLFiles.declareFunction( me, "load_operationsP", "LOAD-OPERATIONS?", 0, 0, false );
    new $load_operationsP$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "load_remote_operations", "LOAD-REMOTE-OPERATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "save_experienceP", "SAVE-EXPERIENCE?", 0, 0, false );
    new $save_experienceP$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "save_local_experience", "SAVE-LOCAL-EXPERIENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "auto_flush_logsP", "AUTO-FLUSH-LOGS?", 0, 0, false );
    SubLFiles.declareFunction( me, "auto_flush_logs", "AUTO-FLUSH-LOGS", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "agenda_save_asked_queriesP", "AGENDA-SAVE-ASKED-QUERIES?", 0, 0, false );
    new $agenda_save_asked_queriesP$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "save_local_asked_queries", "SAVE-LOCAL-ASKED-QUERIES", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "monitor_sksi_global_resourcingP", "MONITOR-SKSI-GLOBAL-RESOURCING?", 0, 0, false );
    new $monitor_sksi_global_resourcingP$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "monitor_sksi_global_resourcing", "MONITOR-SKSI-GLOBAL-RESOURCING", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "enable_agenda_daily_gc", "ENABLE-AGENDA-DAILY-GC", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "disable_agenda_daily_gc", "DISABLE-AGENDA-DAILY-GC", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "agenda_daily_gc_ready_p", "AGENDA-DAILY-GC-READY-P", 0, 0, false );
    new $agenda_daily_gc_ready_p$ZeroArityFunction();
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "do_agenda_daily_gc", "DO-AGENDA-DAILY-GC", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "set_next_agenda_daily_gc_time", "SET-NEXT-AGENDA-DAILY-GC-TIME", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.agenda", "update_agenda_daily_gc_time", "UPDATE-AGENDA-DAILY-GC-TIME", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_agenda_file()
  {
    $agenda_should_quit$ = SubLFiles.deflexical( "*AGENDA-SHOULD-QUIT*", ( ( NIL != Symbols.boundp( $sym0$_AGENDA_SHOULD_QUIT_ ) ) ? $agenda_should_quit$.getGlobalValue() : NIL ) );
    $restart_agenda_flag$ = SubLFiles.deflexical( "*RESTART-AGENDA-FLAG*", ( ( NIL != Symbols.boundp( $sym1$_RESTART_AGENDA_FLAG_ ) ) ? $restart_agenda_flag$.getGlobalValue() : NIL ) );
    $within_agenda$ = SubLFiles.defparameter( "*WITHIN-AGENDA*", NIL );
    $default_agenda_package$ = SubLFiles.deflexical( "*DEFAULT-AGENDA-PACKAGE*", Packages.find_package( $str2$CYC ) );
    $agenda_resourcing_spaces$ = SubLFiles.defparameter( "*AGENDA-RESOURCING-SPACES*", TEN_INTEGER );
    $agenda_process_name$ = SubLFiles.defconstant( "*AGENDA-PROCESS-NAME*", $str5$Cyc_Agenda );
    $agenda_process$ = SubLFiles.deflexical( "*AGENDA-PROCESS*", ( ( NIL != Symbols.boundp( $sym7$_AGENDA_PROCESS_ ) ) ? $agenda_process$.getGlobalValue() : NIL ) );
    $agenda_process_lock$ = SubLFiles.deflexical( "*AGENDA-PROCESS-LOCK*", Locks.make_lock( $str10$Agenda_Process_Lock ) );
    $agenda_error_modes$ = SubLFiles.deflexical( "*AGENDA-ERROR-MODES*", $list13 );
    $agenda_error_mode$ = SubLFiles.deflexical( "*AGENDA-ERROR-MODE*", ( ( NIL != Symbols.boundp( $sym14$_AGENDA_ERROR_MODE_ ) ) ? $agenda_error_mode$.getGlobalValue() : $kw15$HALT ) );
    $agenda_log_file$ = SubLFiles.defvar( "*AGENDA-LOG-FILE*", NIL );
    $agenda_action_table$ = SubLFiles.deflexical( "*AGENDA-ACTION-TABLE*", ( ( NIL != Symbols.boundp( $sym17$_AGENDA_ACTION_TABLE_ ) ) ? $agenda_action_table$.getGlobalValue() : NIL ) );
    $agenda_action_table_lock$ = SubLFiles.deflexical( "*AGENDA-ACTION-TABLE-LOCK*", Locks.make_lock( $str18$Agenda_Action_Table_Lock ) );
    $transcript_queue_worry_size$ = SubLFiles.deflexical( "*TRANSCRIPT-QUEUE-WORRY-SIZE*", TWENTY_INTEGER );
    $save_transcript_quantum$ = SubLFiles.deflexical( "*SAVE-TRANSCRIPT-QUANTUM*", $int27$60 );
    $next_save_transcript_time$ = SubLFiles.deflexical( "*NEXT-SAVE-TRANSCRIPT-TIME*", ( NIL != Symbols.boundp( $sym28$_NEXT_SAVE_TRANSCRIPT_TIME_ ) ) ? $next_save_transcript_time$.getGlobalValue()
        : Time.get_universal_time() );
    $worry_transmit_quantum$ = SubLFiles.deflexical( "*WORRY-TRANSMIT-QUANTUM*", Numbers.multiply( TEN_INTEGER, $int27$60 ) );
    $worry_transmit_size$ = SubLFiles.deflexical( "*WORRY-TRANSMIT-SIZE*", $int31$1000 );
    $next_worry_transmit_time$ = SubLFiles.deflexical( "*NEXT-WORRY-TRANSMIT-TIME*", ( NIL != Symbols.boundp( $sym32$_NEXT_WORRY_TRANSMIT_TIME_ ) ) ? $next_worry_transmit_time$.getGlobalValue()
        : Time.get_universal_time() );
    $normal_transmit_quantum$ = SubLFiles.deflexical( "*NORMAL-TRANSMIT-QUANTUM*", $int64$120 );
    $next_normal_transmit_time$ = SubLFiles.deflexical( "*NEXT-NORMAL-TRANSMIT-TIME*", ( NIL != Symbols.boundp( $sym65$_NEXT_NORMAL_TRANSMIT_TIME_ ) ) ? $next_normal_transmit_time$.getGlobalValue()
        : Time.get_universal_time() );
    $load_transcript_quantum$ = SubLFiles.deflexical( "*LOAD-TRANSCRIPT-QUANTUM*", $int64$120 );
    $next_load_transcript_time$ = SubLFiles.deflexical( "*NEXT-LOAD-TRANSCRIPT-TIME*", ( NIL != Symbols.boundp( $sym73$_NEXT_LOAD_TRANSCRIPT_TIME_ ) ) ? $next_load_transcript_time$.getGlobalValue()
        : Time.get_universal_time() );
    $last_receiving_remote_operationsP$ = SubLFiles.deflexical( "*LAST-RECEIVING-REMOTE-OPERATIONS?*", ( ( NIL != Symbols.boundp( $sym74$_LAST_RECEIVING_REMOTE_OPERATIONS__ ) ) ? $last_receiving_remote_operationsP$
        .getGlobalValue() : NIL ) );
    $save_recent_experienceP$ = SubLFiles.deflexical( "*SAVE-RECENT-EXPERIENCE?*", T );
    $save_experience_transcript_quantum$ = SubLFiles.deflexical( "*SAVE-EXPERIENCE-TRANSCRIPT-QUANTUM*", Numbers.multiply( $int27$60, TEN_INTEGER ) );
    $next_save_experience_transcript_time$ = SubLFiles.deflexical( "*NEXT-SAVE-EXPERIENCE-TRANSCRIPT-TIME*", ( NIL != Symbols.boundp( $sym78$_NEXT_SAVE_EXPERIENCE_TRANSCRIPT_TIME_ ) )
        ? $next_save_experience_transcript_time$.getGlobalValue()
        : Time.get_universal_time() );
    $auto_flush_logsP$ = SubLFiles.deflexical( "*AUTO-FLUSH-LOGS?*", T );
    $auto_flush_logs_transcript_quantum$ = SubLFiles.deflexical( "*AUTO-FLUSH-LOGS-TRANSCRIPT-QUANTUM*", Numbers.multiply( $int27$60, FIVE_INTEGER ) );
    $next_auto_flush_logs_transcript_time$ = SubLFiles.deflexical( "*NEXT-AUTO-FLUSH-LOGS-TRANSCRIPT-TIME*", ( NIL != Symbols.boundp( $sym81$_NEXT_AUTO_FLUSH_LOGS_TRANSCRIPT_TIME_ ) )
        ? $next_auto_flush_logs_transcript_time$.getGlobalValue()
        : Time.get_universal_time() );
    $save_asked_queries_transcript_quantum$ = SubLFiles.deflexical( "*SAVE-ASKED-QUERIES-TRANSCRIPT-QUANTUM*", Numbers.multiply( $int27$60, ONE_INTEGER ) );
    $next_save_asked_queries_transcript_time$ = SubLFiles.deflexical( "*NEXT-SAVE-ASKED-QUERIES-TRANSCRIPT-TIME*", ( NIL != Symbols.boundp( $sym84$_NEXT_SAVE_ASKED_QUERIES_TRANSCRIPT_TIME_ ) )
        ? $next_save_asked_queries_transcript_time$.getGlobalValue()
        : Time.get_universal_time() );
    $next_sksi_global_resourcing_monitor_time$ = SubLFiles.deflexical( "*NEXT-SKSI-GLOBAL-RESOURCING-MONITOR-TIME*", ( NIL != Symbols.boundp( $sym88$_NEXT_SKSI_GLOBAL_RESOURCING_MONITOR_TIME_ ) )
        ? $next_sksi_global_resourcing_monitor_time$.getGlobalValue()
        : Time.get_universal_time() );
    $sksi_monitor_global_resourcing_time_delta$ = SubLFiles.deflexical( "*SKSI-MONITOR-GLOBAL-RESOURCING-TIME-DELTA*", Numbers.multiply( $int27$60, TWO_INTEGER ) );
    $agenda_daily_gc_lock$ = SubLFiles.deflexical( "*AGENDA-DAILY-GC-LOCK*", Locks.make_lock( $str92$Agenda_Daily_GC ) );
    $agenda_daily_gc_enabled$ = SubLFiles.deflexical( "*AGENDA-DAILY-GC-ENABLED*", ( ( NIL != Symbols.boundp( $sym93$_AGENDA_DAILY_GC_ENABLED_ ) ) ? $agenda_daily_gc_enabled$.getGlobalValue() : NIL ) );
    $agenda_daily_gc_time_of_day$ = SubLFiles.deflexical( "*AGENDA-DAILY-GC-TIME-OF-DAY*", ( ( NIL != Symbols.boundp( $sym94$_AGENDA_DAILY_GC_TIME_OF_DAY_ ) ) ? $agenda_daily_gc_time_of_day$.getGlobalValue()
        : $list95 ) );
    $next_agenda_daily_gc_time$ = SubLFiles.deflexical( "*NEXT-AGENDA-DAILY-GC-TIME*", ( ( NIL != Symbols.boundp( $sym101$_NEXT_AGENDA_DAILY_GC_TIME_ ) ) ? $next_agenda_daily_gc_time$.getGlobalValue() : NIL ) );
    return NIL;
  }

  public static SubLObject setup_agenda_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_AGENDA_SHOULD_QUIT_ );
    subl_macro_promotions.declare_defglobal( $sym1$_RESTART_AGENDA_FLAG_ );
    subl_macro_promotions.declare_defglobal( $sym7$_AGENDA_PROCESS_ );
    access_macros.register_external_symbol( $sym8$AGENDA_RUNNING );
    subl_macro_promotions.declare_defglobal( $sym14$_AGENDA_ERROR_MODE_ );
    subl_macro_promotions.declare_defglobal( $sym17$_AGENDA_ACTION_TABLE_ );
    declare_agenda_task( $sym24$AGENDA_SHOULD_QUIT_, $sym25$DO_NOTHING, ZERO_INTEGER );
    declare_agenda_task( $sym26$RESTART_AGENDA_FLAG_, $sym25$DO_NOTHING, ZERO_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym28$_NEXT_SAVE_TRANSCRIPT_TIME_ );
    declare_agenda_task( $sym29$SAVE_OPERATIONS_, $sym30$SAVE_LOCAL_OPERATIONS, TEN_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym32$_NEXT_WORRY_TRANSMIT_TIME_ );
    declare_agenda_task( $sym33$WORRY_TRANSMIT_OPERATIONS_, $sym34$WORRY_TRANSMIT_OPERATIONS, FIFTEEN_INTEGER );
    declare_agenda_task( $sym36$RUN_AUXILIARY_OP_, $sym37$RUN_ONE_AUXILIARY_OP_IN_AGENDA, TWENTY_INTEGER );
    declare_agenda_task( $sym55$RUN_LOCAL_OP_, $sym56$RUN_ONE_LOCAL_OP_IN_AGENDA, $int57$25 );
    subl_macro_promotions.declare_defglobal( $sym65$_NEXT_NORMAL_TRANSMIT_TIME_ );
    declare_agenda_task( $sym66$NORMAL_TRANSMIT_OPERATIONS_, $sym67$NORMAL_TRANSMIT_OPERATIONS, $int68$35 );
    declare_agenda_task( $sym70$RUN_REMOTE_OP_, $sym71$RUN_ONE_REMOTE_OP_IN_AGENDA, $int72$40 );
    subl_macro_promotions.declare_defglobal( $sym73$_NEXT_LOAD_TRANSCRIPT_TIME_ );
    subl_macro_promotions.declare_defglobal( $sym74$_LAST_RECEIVING_REMOTE_OPERATIONS__ );
    declare_agenda_task( $sym75$LOAD_OPERATIONS_, $sym76$LOAD_REMOTE_OPERATIONS, $int77$45 );
    subl_macro_promotions.declare_defglobal( $sym78$_NEXT_SAVE_EXPERIENCE_TRANSCRIPT_TIME_ );
    declare_agenda_task( $sym79$SAVE_EXPERIENCE_, $sym80$SAVE_LOCAL_EXPERIENCE, $int27$60 );
    subl_macro_promotions.declare_defglobal( $sym81$_NEXT_AUTO_FLUSH_LOGS_TRANSCRIPT_TIME_ );
    declare_agenda_task( $sym82$AUTO_FLUSH_LOGS_, $sym83$AUTO_FLUSH_LOGS, $int27$60 );
    subl_macro_promotions.declare_defglobal( $sym84$_NEXT_SAVE_ASKED_QUERIES_TRANSCRIPT_TIME_ );
    declare_agenda_task( $sym85$AGENDA_SAVE_ASKED_QUERIES_, $sym86$SAVE_LOCAL_ASKED_QUERIES, $int87$30 );
    subl_macro_promotions.declare_defglobal( $sym88$_NEXT_SKSI_GLOBAL_RESOURCING_MONITOR_TIME_ );
    declare_agenda_task( $sym89$MONITOR_SKSI_GLOBAL_RESOURCING_, $sym90$MONITOR_SKSI_GLOBAL_RESOURCING, $int91$43 );
    subl_macro_promotions.declare_defglobal( $sym93$_AGENDA_DAILY_GC_ENABLED_ );
    subl_macro_promotions.declare_defglobal( $sym94$_AGENDA_DAILY_GC_TIME_OF_DAY_ );
    subl_macro_promotions.declare_defglobal( $sym101$_NEXT_AGENDA_DAILY_GC_TIME_ );
    declare_agenda_task( $sym103$AGENDA_DAILY_GC_READY_P, $sym104$DO_AGENDA_DAILY_GC, $int31$1000 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_agenda_file();
  }

  @Override
  public void initializeVariables()
  {
    init_agenda_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_agenda_file();
  }
  static
  {
    me = new agenda();
    $agenda_should_quit$ = null;
    $restart_agenda_flag$ = null;
    $within_agenda$ = null;
    $default_agenda_package$ = null;
    $agenda_resourcing_spaces$ = null;
    $agenda_process_name$ = null;
    $agenda_process$ = null;
    $agenda_process_lock$ = null;
    $agenda_error_modes$ = null;
    $agenda_error_mode$ = null;
    $agenda_log_file$ = null;
    $agenda_action_table$ = null;
    $agenda_action_table_lock$ = null;
    $transcript_queue_worry_size$ = null;
    $save_transcript_quantum$ = null;
    $next_save_transcript_time$ = null;
    $worry_transmit_quantum$ = null;
    $worry_transmit_size$ = null;
    $next_worry_transmit_time$ = null;
    $normal_transmit_quantum$ = null;
    $next_normal_transmit_time$ = null;
    $load_transcript_quantum$ = null;
    $next_load_transcript_time$ = null;
    $last_receiving_remote_operationsP$ = null;
    $save_recent_experienceP$ = null;
    $save_experience_transcript_quantum$ = null;
    $next_save_experience_transcript_time$ = null;
    $auto_flush_logsP$ = null;
    $auto_flush_logs_transcript_quantum$ = null;
    $next_auto_flush_logs_transcript_time$ = null;
    $save_asked_queries_transcript_quantum$ = null;
    $next_save_asked_queries_transcript_time$ = null;
    $next_sksi_global_resourcing_monitor_time$ = null;
    $sksi_monitor_global_resourcing_time_delta$ = null;
    $agenda_daily_gc_lock$ = null;
    $agenda_daily_gc_enabled$ = null;
    $agenda_daily_gc_time_of_day$ = null;
    $next_agenda_daily_gc_time$ = null;
    $sym0$_AGENDA_SHOULD_QUIT_ = makeSymbol( "*AGENDA-SHOULD-QUIT*" );
    $sym1$_RESTART_AGENDA_FLAG_ = makeSymbol( "*RESTART-AGENDA-FLAG*" );
    $str2$CYC = makeString( "CYC" );
    $str3$Idle = makeString( "Idle" );
    $sym4$AGENDA_WORK_TO_DO = makeSymbol( "AGENDA-WORK-TO-DO" );
    $str5$Cyc_Agenda = makeString( "Cyc Agenda" );
    $sym6$AGENDA_TOP_LEVEL = makeSymbol( "AGENDA-TOP-LEVEL" );
    $sym7$_AGENDA_PROCESS_ = makeSymbol( "*AGENDA-PROCESS*" );
    $sym8$AGENDA_RUNNING = makeSymbol( "AGENDA-RUNNING" );
    $str9$None = makeString( "None" );
    $str10$Agenda_Process_Lock = makeString( "Agenda Process Lock" );
    $kw11$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym12$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $list13 = ConsesLow.list( makeKeyword( "IGNORE" ), SubLObjectFactory.makeKeyword( "HALT" ), makeKeyword( "DEBUG" ), makeKeyword( "LOG" ) );
    $sym14$_AGENDA_ERROR_MODE_ = makeSymbol( "*AGENDA-ERROR-MODE*" );
    $kw15$HALT = makeKeyword( "HALT" );
    $kw16$LOG = makeKeyword( "LOG" );
    $sym17$_AGENDA_ACTION_TABLE_ = makeSymbol( "*AGENDA-ACTION-TABLE*" );
    $str18$Agenda_Action_Table_Lock = makeString( "Agenda Action Table Lock" );
    $sym19$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym20$NUMBERP = makeSymbol( "NUMBERP" );
    $sym21$_ = makeSymbol( "<" );
    $sym22$AGENDA_TASK_PRIORITY = makeSymbol( "AGENDA-TASK-PRIORITY" );
    $sym23$FIRST = makeSymbol( "FIRST" );
    $sym24$AGENDA_SHOULD_QUIT_ = makeSymbol( "AGENDA-SHOULD-QUIT?" );
    $sym25$DO_NOTHING = makeSymbol( "DO-NOTHING" );
    $sym26$RESTART_AGENDA_FLAG_ = makeSymbol( "RESTART-AGENDA-FLAG?" );
    $int27$60 = makeInteger( 60 );
    $sym28$_NEXT_SAVE_TRANSCRIPT_TIME_ = makeSymbol( "*NEXT-SAVE-TRANSCRIPT-TIME*" );
    $sym29$SAVE_OPERATIONS_ = makeSymbol( "SAVE-OPERATIONS?" );
    $sym30$SAVE_LOCAL_OPERATIONS = makeSymbol( "SAVE-LOCAL-OPERATIONS" );
    $int31$1000 = makeInteger( 1000 );
    $sym32$_NEXT_WORRY_TRANSMIT_TIME_ = makeSymbol( "*NEXT-WORRY-TRANSMIT-TIME*" );
    $sym33$WORRY_TRANSMIT_OPERATIONS_ = makeSymbol( "WORRY-TRANSMIT-OPERATIONS?" );
    $sym34$WORRY_TRANSMIT_OPERATIONS = makeSymbol( "WORRY-TRANSMIT-OPERATIONS" );
    $sym35$RUN_ONE_AUXILIARY_OP = makeSymbol( "RUN-ONE-AUXILIARY-OP" );
    $sym36$RUN_AUXILIARY_OP_ = makeSymbol( "RUN-AUXILIARY-OP?" );
    $sym37$RUN_ONE_AUXILIARY_OP_IN_AGENDA = makeSymbol( "RUN-ONE-AUXILIARY-OP-IN-AGENDA" );
    $sym38$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str39$_A = makeString( "~A" );
    $sym40$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" );
    $list41 = ConsesLow.list( makeSymbol( "CSETQ" ), SubLObjectFactory.makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ), NIL );
    $list42 = ConsesLow.list( makeSymbol( "ERROR" ), SubLObjectFactory.makeSymbol( "&OPTIONAL" ), makeSymbol( "FORMAT-STRING" ), SubLObjectFactory.makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym43$CERROR = makeSymbol( "CERROR" );
    $str44$Continue_the_agenda = makeString( "Continue the agenda" );
    $str45$__Last_operation___S____ = makeString( "~&Last operation: ~S~%  " );
    $str46$FI_error___A = makeString( "FI error: ~A" );
    $list47 = ConsesLow.list( makeSymbol( "WARNING" ), SubLObjectFactory.makeSymbol( "&OPTIONAL" ), makeSymbol( "FORMAT-STRING" ), SubLObjectFactory.makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym48$WARN = makeSymbol( "WARN" );
    $str49$FI_warning___A = makeString( "FI warning: ~A" );
    $sym50$CSETQ = makeSymbol( "CSETQ" );
    $kw51$DEBUG = makeKeyword( "DEBUG" );
    $kw52$AGENDA_ABORT = makeKeyword( "AGENDA-ABORT" );
    $sym53$AGENDA_THROW_ERROR_MESSAGE = makeSymbol( "AGENDA-THROW-ERROR-MESSAGE" );
    $kw54$IGNORE = makeKeyword( "IGNORE" );
    $sym55$RUN_LOCAL_OP_ = makeSymbol( "RUN-LOCAL-OP?" );
    $sym56$RUN_ONE_LOCAL_OP_IN_AGENDA = makeSymbol( "RUN-ONE-LOCAL-OP-IN-AGENDA" );
    $int57$25 = makeInteger( 25 );
    $kw58$APPEND = makeKeyword( "APPEND" );
    $str59$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str60$_s__ = makeString( "~s~%" );
    $sym61$FI_TIMESTAMP_ASSERTION = makeSymbol( "FI-TIMESTAMP-ASSERTION" );
    $const62$Guest = constant_handles.reader_make_constant_shell( makeString( "Guest" ) );
    $list63 = ConsesLow.list( NIL, NIL, NIL );
    $int64$120 = makeInteger( 120 );
    $sym65$_NEXT_NORMAL_TRANSMIT_TIME_ = makeSymbol( "*NEXT-NORMAL-TRANSMIT-TIME*" );
    $sym66$NORMAL_TRANSMIT_OPERATIONS_ = makeSymbol( "NORMAL-TRANSMIT-OPERATIONS?" );
    $sym67$NORMAL_TRANSMIT_OPERATIONS = makeSymbol( "NORMAL-TRANSMIT-OPERATIONS" );
    $int68$35 = makeInteger( 35 );
    $sym69$RUN_ONE_REMOTE_OP = makeSymbol( "RUN-ONE-REMOTE-OP" );
    $sym70$RUN_REMOTE_OP_ = makeSymbol( "RUN-REMOTE-OP?" );
    $sym71$RUN_ONE_REMOTE_OP_IN_AGENDA = makeSymbol( "RUN-ONE-REMOTE-OP-IN-AGENDA" );
    $int72$40 = makeInteger( 40 );
    $sym73$_NEXT_LOAD_TRANSCRIPT_TIME_ = makeSymbol( "*NEXT-LOAD-TRANSCRIPT-TIME*" );
    $sym74$_LAST_RECEIVING_REMOTE_OPERATIONS__ = SubLObjectFactory.makeSymbol( "*LAST-RECEIVING-REMOTE-OPERATIONS?*" );
    $sym75$LOAD_OPERATIONS_ = makeSymbol( "LOAD-OPERATIONS?" );
    $sym76$LOAD_REMOTE_OPERATIONS = makeSymbol( "LOAD-REMOTE-OPERATIONS" );
    $int77$45 = makeInteger( 45 );
    $sym78$_NEXT_SAVE_EXPERIENCE_TRANSCRIPT_TIME_ = SubLObjectFactory.makeSymbol( "*NEXT-SAVE-EXPERIENCE-TRANSCRIPT-TIME*" );
    $sym79$SAVE_EXPERIENCE_ = makeSymbol( "SAVE-EXPERIENCE?" );
    $sym80$SAVE_LOCAL_EXPERIENCE = makeSymbol( "SAVE-LOCAL-EXPERIENCE" );
    $sym81$_NEXT_AUTO_FLUSH_LOGS_TRANSCRIPT_TIME_ = SubLObjectFactory.makeSymbol( "*NEXT-AUTO-FLUSH-LOGS-TRANSCRIPT-TIME*" );
    $sym82$AUTO_FLUSH_LOGS_ = makeSymbol( "AUTO-FLUSH-LOGS?" );
    $sym83$AUTO_FLUSH_LOGS = makeSymbol( "AUTO-FLUSH-LOGS" );
    $sym84$_NEXT_SAVE_ASKED_QUERIES_TRANSCRIPT_TIME_ = SubLObjectFactory.makeSymbol( "*NEXT-SAVE-ASKED-QUERIES-TRANSCRIPT-TIME*" );
    $sym85$AGENDA_SAVE_ASKED_QUERIES_ = makeSymbol( "AGENDA-SAVE-ASKED-QUERIES?" );
    $sym86$SAVE_LOCAL_ASKED_QUERIES = makeSymbol( "SAVE-LOCAL-ASKED-QUERIES" );
    $int87$30 = makeInteger( 30 );
    $sym88$_NEXT_SKSI_GLOBAL_RESOURCING_MONITOR_TIME_ = SubLObjectFactory.makeSymbol( "*NEXT-SKSI-GLOBAL-RESOURCING-MONITOR-TIME*" );
    $sym89$MONITOR_SKSI_GLOBAL_RESOURCING_ = makeSymbol( "MONITOR-SKSI-GLOBAL-RESOURCING?" );
    $sym90$MONITOR_SKSI_GLOBAL_RESOURCING = makeSymbol( "MONITOR-SKSI-GLOBAL-RESOURCING" );
    $int91$43 = makeInteger( 43 );
    $str92$Agenda_Daily_GC = makeString( "Agenda Daily GC" );
    $sym93$_AGENDA_DAILY_GC_ENABLED_ = makeSymbol( "*AGENDA-DAILY-GC-ENABLED*" );
    $sym94$_AGENDA_DAILY_GC_TIME_OF_DAY_ = makeSymbol( "*AGENDA-DAILY-GC-TIME-OF-DAY*" );
    $list95 = ConsesLow.list( FOUR_INTEGER, ZERO_INTEGER, ZERO_INTEGER );
    $int96$23 = makeInteger( 23 );
    $str97$Hour_must_be_an_integer_in_the_ra = SubLObjectFactory.makeString( "Hour must be an integer in the range 0 - 23" );
    $int98$59 = makeInteger( 59 );
    $str99$Minute_must_be_an_integer_in_the_ = SubLObjectFactory.makeString( "Minute must be an integer in the range 0 - 59" );
    $str100$Second_must_be_an_integer_in_the_ = SubLObjectFactory.makeString( "Second must be an integer in the range 0 - 59" );
    $sym101$_NEXT_AGENDA_DAILY_GC_TIME_ = makeSymbol( "*NEXT-AGENDA-DAILY-GC-TIME*" );
    $str102$Doing_Agenda_Daily_GC_at_ = makeString( "Doing Agenda Daily GC at " );
    $sym103$AGENDA_DAILY_GC_READY_P = makeSymbol( "AGENDA-DAILY-GC-READY-P" );
    $sym104$DO_AGENDA_DAILY_GC = makeSymbol( "DO-AGENDA-DAILY-GC" );
    $list105 = ConsesLow.list( makeSymbol( "HOUR" ), SubLObjectFactory.makeSymbol( "MINUTE" ), makeSymbol( "SECOND" ) );
  }

  public static final class $agenda_work_to_do$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $agenda_work_to_do$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AGENDA-WORK-TO-DO" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return agenda_work_to_do();
    }
  }

  public static final class $agenda_should_quitP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $agenda_should_quitP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AGENDA-SHOULD-QUIT?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return agenda_should_quitP();
    }
  }

  public static final class $restart_agenda_flagP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $restart_agenda_flagP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RESTART-AGENDA-FLAG?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return restart_agenda_flagP();
    }
  }

  public static final class $save_operationsP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $save_operationsP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SAVE-OPERATIONS?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return save_operationsP();
    }
  }

  public static final class $worry_transmit_operationsP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $worry_transmit_operationsP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "WORRY-TRANSMIT-OPERATIONS?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return worry_transmit_operationsP();
    }
  }

  public static final class $run_auxiliary_opP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $run_auxiliary_opP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RUN-AUXILIARY-OP?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return run_auxiliary_opP();
    }
  }

  public static final class $run_local_opP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $run_local_opP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RUN-LOCAL-OP?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return run_local_opP();
    }
  }

  public static final class $normal_transmit_operationsP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $normal_transmit_operationsP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NORMAL-TRANSMIT-OPERATIONS?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return normal_transmit_operationsP();
    }
  }

  public static final class $run_remote_opP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $run_remote_opP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RUN-REMOTE-OP?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return run_remote_opP();
    }
  }

  public static final class $load_operationsP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $load_operationsP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LOAD-OPERATIONS?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return load_operationsP();
    }
  }

  public static final class $save_experienceP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $save_experienceP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SAVE-EXPERIENCE?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return save_experienceP();
    }
  }

  public static final class $agenda_save_asked_queriesP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $agenda_save_asked_queriesP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AGENDA-SAVE-ASKED-QUERIES?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return agenda_save_asked_queriesP();
    }
  }

  public static final class $monitor_sksi_global_resourcingP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $monitor_sksi_global_resourcingP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "MONITOR-SKSI-GLOBAL-RESOURCING?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return monitor_sksi_global_resourcingP();
    }
  }

  public static final class $agenda_daily_gc_ready_p$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $agenda_daily_gc_ready_p$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AGENDA-DAILY-GC-READY-P" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return agenda_daily_gc_ready_p();
    }
  }
}
/*
 * 
 * Total time: 643 ms
 * 
 */