/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/
package com.cyc.cycjava_1.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.api_control_vars;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.encapsulation;
import com.cyc.cycjava_1.cycl.fi;
import com.cyc.cycjava_1.cycl.file_utilities;
import com.cyc.cycjava_1.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.numeric_date_utilities;
import com.cyc.cycjava_1.cycl.operation_communication;
import com.cyc.cycjava_1.cycl.operation_queues;
import com.cyc.cycjava_1.cycl.process_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.system_parameters;
import com.cyc.cycjava_1.cycl.transcript_utilities;
import com.cyc.cycjava_1.cycl.utilities_macros;

public final class agenda
    extends
      SubLTranslatedFile
{
  //// Constructor
  private agenda()
  {}
  public static final SubLFile me = new agenda();
  public static final String myName = "com.cyc.cycjava_1.cycl.agenda";
  //// Definitions
  @SubL(source = "cycl/agenda.lisp", position = 799)
  private static SubLSymbol $agenda_should_quit$ = null;
  @SubL(source = "cycl/agenda.lisp", position = 846)
  private static SubLSymbol $restart_agenda_flag$ = null;

  /** Initialize the agenda. */
  @SubL(source = "cycl/agenda.lisp", position = 892)
  public static final SubLObject initialize_agenda()
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      operation_communication.set_communication_mode( system_parameters.$startup_communication_mode$.getDynamicValue( thread ) );
      if( ( ( NIL != system_parameters.$start_agenda_at_startupP$.getDynamicValue( thread ) ) && ( NIL == agenda_running() ) ) )
      {
        start_agenda( TEN_INTEGER );
      }
      return T;
    }
  }
  @SubL(source = "cycl/agenda.lisp", position = 1273)
  private static SubLSymbol $within_agenda$ = null;
  /** The default package in which the agenda runs. */
  @SubL(source = "cycl/agenda.lisp", position = 1549)
  private static SubLSymbol $default_agenda_package$ = null;
  /** The number of SBHL spaces to resource within an agenda process */
  @SubL(source = "cycl/agenda.lisp", position = 1675)
  private static SubLSymbol $agenda_resourcing_spaces$ = null;

  @SubL(source = "cycl/agenda.lisp", position = 1797)
  public static final SubLObject agenda_top_level()
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      start_agenda_process();
      if( ( NIL != current_process_is_agenda() ) )
      {
        Threads.set_process_priority( agenda_process(), Threads.$process_background_priority$.getGlobalValue() );
        try
        {
          agenda_startup_actions();
          $restart_agenda_flag$.setGlobalValue( NIL );
          {
            SubLObject _prev_bind_0 = Packages.$package$.currentBinding( thread );
            try
            {
              Packages.$package$.bind( $default_agenda_package$.getGlobalValue(), thread );
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
                {
                  SubLObject _prev_bind_0_1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
                  SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                  try
                  {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, $agenda_resourcing_spaces$.getDynamicValue( thread ) ), thread );
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
                    while ( ( NIL == $agenda_should_quit$.getGlobalValue() ))
                    {
                      while ( ( ( NIL == $agenda_should_quit$.getGlobalValue() ) && ( NIL != agenda_work_to_do() ) ))
                      {
                        perform_one_agenda_action();
                      }
                      Threads.process_wait( $str3$Idle, Symbols.symbol_function( $sym4$AGENDA_WORK_TO_DO ) );
                    }
                  }
                  finally
                  {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2, thread );
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1, thread );
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_1, thread );
                  }
                }
              }
            }
            finally
            {
              Packages.$package$.rebind( _prev_bind_0, thread );
            }
          }
        }
        finally
        {
          {
            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31522" );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/agenda.lisp", position = 2419)
  public static final SubLObject start_agenda(SubLObject waitP)
  {
    if( ( waitP == UNPROVIDED ) )
    {
      waitP = NIL;
    }
    if( ( NIL != agenda_running() ) )
    {
      Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31524" );
    }
    $agenda_should_quit$.setGlobalValue( NIL );
    Threads.make_process( $str5$Cyc_Agenda, Symbols.symbol_function( $sym6$AGENDA_TOP_LEVEL ) );
    if( ( NIL != waitP ) )
    {
      wait_for_agenda_running( waitP );
    }
    return agenda_running();
  }

  @SubL(source = "cycl/agenda.lisp", position = 3832)
  public static final SubLObject wait_for_agenda_running(SubLObject wait_time)
  {
    if( ( wait_time == UNPROVIDED ) )
    {
      wait_time = ONE_INTEGER;
    }
    {
      SubLObject time = numeric_date_utilities.time_from_now( wait_time );
      for( ; ( !( ( ( NIL != agenda_running() ) || ( NIL != Time.time_has_arrivedP( time ) ) ) ) ); )
      {
        Threads.sleep( ONE_INTEGER );
      }
    }
    return agenda_running();
  }
  @SubL(source = "cycl/agenda.lisp", position = 4571)
  private static SubLSymbol $agenda_process$ = null;

  @SubL(source = "cycl/agenda.lisp", position = 4881)
  public static final SubLObject agenda_process()
  {
    return $agenda_process$.getGlobalValue();
  }

  @SubL(source = "cycl/agenda.lisp", position = 4942)
  public static final SubLObject agenda_running()
  {
    return Threads.valid_process_p( agenda_process() );
  }

  @SubL(source = "cycl/agenda.lisp", position = 5149)
  public static final SubLObject current_process_is_agenda()
  {
    return Equality.eq( Threads.current_process(), agenda_process() );
  }
  @SubL(source = "cycl/agenda.lisp", position = 5469)
  private static SubLSymbol $agenda_process_lock$ = null;

  @SubL(source = "cycl/agenda.lisp", position = 5618)
  public static final SubLObject start_agenda_process()
  {
    {
      SubLObject lock = $agenda_process_lock$.getGlobalValue();
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        if( ( NIL == $agenda_process$.getGlobalValue() ) )
        {
          $agenda_process$.setGlobalValue( Threads.current_process() );
        }
      }
      finally
      {
        if( ( NIL != release ) )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return NIL;
  }
  @SubL(source = "cycl/agenda.lisp", position = 5990)
  private static SubLSymbol $agenda_error_modes$ = null;
  @SubL(source = "cycl/agenda.lisp", position = 6201)
  private static SubLSymbol $agenda_error_mode$ = null;
  /** The file used to log agenda errors when the agenda is in log mode. */
  @SubL(source = "cycl/agenda.lisp", position = 6536)
  private static SubLSymbol $agenda_log_file$ = null;

  /** Code which is run whenever the agenda is restarted */
  @SubL(source = "cycl/agenda.lisp", position = 6885)
  public static final SubLObject agenda_startup_actions()
  {
    if( ( NIL == transcript_utilities.local_transcript() ) )
    {
      transcript_utilities.new_local_transcript();
    }
    if( ( NIL == transcript_utilities.master_transcript() ) )
    {
      transcript_utilities.set_master_transcript( UNPROVIDED );
    }
    return NIL;
  }

  /** Returns NIL iff there is no agenda work to do */
  @SubL(source = "cycl/agenda.lisp", position = 7165)
  public static final SubLObject agenda_work_to_do()
  {
    {
      SubLObject cdolist_list_var = agenda_tasks();
      SubLObject agenda_task = NIL;
      for( agenda_task = cdolist_list_var.first(); ( NIL != cdolist_list_var ); cdolist_list_var = cdolist_list_var.rest(), agenda_task = cdolist_list_var.first() )
      {
        {
          SubLObject test = agenda_task_test( agenda_task );
          if( ( ( NIL != Symbols.fboundp( test ) ) && ( NIL != Functions.funcall( test ) ) ) )
          {
            {
              SubLObject action = agenda_task_action( agenda_task );
              if( ( NIL != Symbols.fboundp( action ) ) )
              {
                return agenda_task;
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  public static final class $agenda_work_to_do$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $agenda_work_to_do$ZeroArityFunction()
    {
      super( extractFunctionNamed( "AGENDA-WORK-TO-DO" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return agenda_work_to_do();
    }
  }

  /** Sets Agenda error messages and explanations to nil */
  @SubL(source = "cycl/agenda.lisp", position = 7517)
  public static final SubLObject clear_agenda_halt_explanation()
  {
    control_vars.$last_agenda_error_message$.setGlobalValue( NIL );
    control_vars.$last_agenda_error_explanatory_supports$.setGlobalValue( NIL );
    return NIL;
  }

  /** Performs one agenda action */
  @SubL(source = "cycl/agenda.lisp", position = 7732)
  public static final SubLObject perform_one_agenda_action()
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      clear_agenda_halt_explanation();
      {
        SubLObject agenda_task = agenda_work_to_do();
        if( ( NIL != agenda_task ) )
        {
          {
            SubLObject action = agenda_task_action( agenda_task );
            {
              SubLObject _prev_bind_0 = $within_agenda$.currentBinding( thread );
              try
              {
                $within_agenda$.bind( T, thread );
                Functions.funcall( action );
              }
              finally
              {
                $within_agenda$.rebind( _prev_bind_0, thread );
              }
            }
          }
        }
        return agenda_task;
      }
    }
  }
  @SubL(source = "cycl/agenda.lisp", position = 8042)
  private static SubLSymbol $agenda_action_table$ = null;
  /** A lock to control access to *agenda-action-table*. */
  @SubL(source = "cycl/agenda.lisp", position = 8258)
  private static SubLSymbol $agenda_action_table_lock$ = null;

  /**
   * Declare an agenda task which does ACTION whenever TEST is true. The task
   * priority is PRIORITY, larger numbers indicate lesser priority. TEST and
   * ACTION are functions of no arguments.
   */
  @SubL(source = "cycl/agenda.lisp", position = 8409)
  public static final SubLObject declare_agenda_task(SubLObject test, SubLObject action, SubLObject priority)
  {
    checkType( test, $sym17$SYMBOLP );
    checkType( action, $sym17$SYMBOLP );
    checkType( priority, $sym18$NUMBERP );
    undeclare_agenda_task( test );
    {
      SubLObject lock = $agenda_action_table_lock$.getGlobalValue();
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        $agenda_action_table$.setGlobalValue( list_utilities.splice_into_sorted_list( list( test, action, priority ), $agenda_action_table$.getGlobalValue(), Symbols.symbol_function( $sym19$_ ), Symbols.symbol_function(
            $sym20$AGENDA_TASK_PRIORITY ) ) );
      }
      finally
      {
        if( ( NIL != release ) )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return test;
  }

  /** UNDECLARE the agenda task associated with TEST. */
  @SubL(source = "cycl/agenda.lisp", position = 8995)
  public static final SubLObject undeclare_agenda_task(SubLObject test)
  {
    {
      SubLObject lock = $agenda_action_table_lock$.getGlobalValue();
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        $agenda_action_table$.setGlobalValue( Sequences.delete( test, $agenda_action_table$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym21$FIRST ), UNPROVIDED, UNPROVIDED,
            UNPROVIDED ) );
      }
      finally
      {
        if( ( NIL != release ) )
        {
          Locks.release_lock( lock );
        }
      }
    }
    return test;
  }

  @SubL(source = "cycl/agenda.lisp", position = 9243)
  public static final SubLObject agenda_tasks()
  {
    return $agenda_action_table$.getGlobalValue();
  }

  @SubL(source = "cycl/agenda.lisp", position = 9321)
  public static final SubLObject agenda_task_test(SubLObject agenda_task)
  {
    return agenda_task.first();
  }

  @SubL(source = "cycl/agenda.lisp", position = 9398)
  public static final SubLObject agenda_task_action(SubLObject agenda_task)
  {
    return conses_high.second( agenda_task );
  }

  @SubL(source = "cycl/agenda.lisp", position = 9478)
  public static final SubLObject agenda_task_priority(SubLObject agenda_task)
  {
    return conses_high.third( agenda_task );
  }

  @SubL(source = "cycl/agenda.lisp", position = 9559)
  public static final SubLObject agenda_should_quitP()
  {
    return $agenda_should_quit$.getGlobalValue();
  }

  public static final class $agenda_should_quitP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $agenda_should_quitP$ZeroArityFunction()
    {
      super( extractFunctionNamed( "AGENDA-SHOULD-QUIT?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return agenda_should_quitP();
    }
  }

  @SubL(source = "cycl/agenda.lisp", position = 9851)
  public static final SubLObject restart_agenda_flagP()
  {
    return $restart_agenda_flag$.getGlobalValue();
  }

  public static final class $restart_agenda_flagP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $restart_agenda_flagP$ZeroArityFunction()
    {
      super( extractFunctionNamed( "RESTART-AGENDA-FLAG?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return restart_agenda_flagP();
    }
  }
  @SubL(source = "cycl/agenda.lisp", position = 10055)
  private static SubLSymbol $transcript_queue_worry_size$ = null;
  @SubL(source = "cycl/agenda.lisp", position = 10171)
  private static SubLSymbol $save_transcript_quantum$ = null;
  @SubL(source = "cycl/agenda.lisp", position = 10261)
  private static SubLSymbol $next_save_transcript_time$ = null;

  @SubL(source = "cycl/agenda.lisp", position = 10330)
  public static final SubLObject save_operationsP()
  {
    return makeBoolean( ( ( NIL != operation_communication.saving_operationsP() ) && ( ( ( NIL != Time.time_has_arrivedP( $next_save_transcript_time$.getGlobalValue() ) ) && ( NIL == operation_queues
        .transcript_queue_empty() ) && ( NIL != operation_queues.local_queue_empty() ) ) || operation_queues.transcript_queue_size().numG( $transcript_queue_worry_size$.getGlobalValue() ) ) ) );
  }

  public static final class $save_operationsP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $save_operationsP$ZeroArityFunction()
    {
      super( extractFunctionNamed( "SAVE-OPERATIONS?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return save_operationsP();
    }
  }

  @SubL(source = "cycl/agenda.lisp", position = 10615)
  public static final SubLObject save_local_operations()
  {
    $next_save_transcript_time$.setGlobalValue( numeric_date_utilities.time_from_now( Numbers.add( $save_transcript_quantum$.getGlobalValue(), random.random( TWENTY_INTEGER ) ) ) );
    operation_communication.save_transcript_ops();
    return NIL;
  }
  @SubL(source = "cycl/agenda.lisp", position = 10911)
  private static SubLSymbol $worry_transmit_quantum$ = null;
  @SubL(source = "cycl/agenda.lisp", position = 11059)
  private static SubLSymbol $worry_transmit_size$ = null;
  @SubL(source = "cycl/agenda.lisp", position = 11107)
  private static SubLSymbol $next_worry_transmit_time$ = null;

  @SubL(source = "cycl/agenda.lisp", position = 11175)
  public static final SubLObject worry_transmit_operationsP()
  {
    return makeBoolean( ( ( NIL != operation_communication.allow_transmitting() ) && ( ( ( NIL != Time.time_has_arrivedP( $next_worry_transmit_time$.getGlobalValue() ) ) && ( NIL == operation_queues
        .transmit_queue_empty() ) ) || operation_queues.transmit_queue_size().numGE( $worry_transmit_size$.getGlobalValue() ) ) ) );
  }

  public static final class $worry_transmit_operationsP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $worry_transmit_operationsP$ZeroArityFunction()
    {
      super( extractFunctionNamed( "WORRY-TRANSMIT-OPERATIONS?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return worry_transmit_operationsP();
    }
  }

  @SubL(source = "cycl/agenda.lisp", position = 11927)
  public static final SubLObject run_auxiliary_opP()
  {
    return makeBoolean( ( ( NIL != operation_communication.process_auxiliary_operationsP() ) && ( NIL == operation_queues.auxiliary_queue_empty() ) ) );
  }

  public static final class $run_auxiliary_opP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $run_auxiliary_opP$ZeroArityFunction()
    {
      super( extractFunctionNamed( "RUN-AUXILIARY-OP?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return run_auxiliary_opP();
    }
  }

  @SubL(source = "cycl/agenda.lisp", position = 13855)
  public static final SubLObject run_local_opP()
  {
    return makeBoolean( ( ( NIL != operation_communication.process_local_operationsP() ) && ( NIL == operation_queues.local_queue_empty() ) ) );
  }

  public static final class $run_local_opP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $run_local_opP$ZeroArityFunction()
    {
      super( extractFunctionNamed( "RUN-LOCAL-OP?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return run_local_opP();
    }
  }
  @SubL(source = "cycl/agenda.lisp", position = 16274)
  private static SubLSymbol $normal_transmit_quantum$ = null;
  @SubL(source = "cycl/agenda.lisp", position = 16420)
  private static SubLSymbol $next_normal_transmit_time$ = null;

  @SubL(source = "cycl/agenda.lisp", position = 16489)
  public static final SubLObject normal_transmit_operationsP()
  {
    return makeBoolean( ( ( NIL != Time.time_has_arrivedP( $next_normal_transmit_time$.getGlobalValue() ) ) && ( NIL == operation_queues.transmit_queue_empty() ) && ( NIL != operation_communication.allow_transmitting() )
        && ( NIL != operation_queues.local_queue_empty() ) && ( NIL != operation_queues.transcript_queue_empty() ) ) );
  }

  public static final class $normal_transmit_operationsP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $normal_transmit_operationsP$ZeroArityFunction()
    {
      super( extractFunctionNamed( "NORMAL-TRANSMIT-OPERATIONS?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return normal_transmit_operationsP();
    }
  }

  @SubL(source = "cycl/agenda.lisp", position = 17157)
  public static final SubLObject run_remote_opP()
  {
    return operation_communication.remote_operation_to_runP();
  }

  public static final class $run_remote_opP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $run_remote_opP$ZeroArityFunction()
    {
      super( extractFunctionNamed( "RUN-REMOTE-OP?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return run_remote_opP();
    }
  }
  @SubL(source = "cycl/agenda.lisp", position = 17463)
  private static SubLSymbol $load_transcript_quantum$ = null;
  @SubL(source = "cycl/agenda.lisp", position = 17576)
  private static SubLSymbol $next_load_transcript_time$ = null;

  @SubL(source = "cycl/agenda.lisp", position = 17645)
  public static final SubLObject load_operationsP()
  {
    return makeBoolean( ( ( NIL != operation_communication.receiving_remote_operationsP() ) && ( NIL != Time.time_has_arrivedP( $next_load_transcript_time$.getGlobalValue() ) ) ) );
  }

  public static final class $load_operationsP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $load_operationsP$ZeroArityFunction()
    {
      super( extractFunctionNamed( "LOAD-OPERATIONS?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return load_operationsP();
    }
  }
  /** Whether to save recent experience into an experience transcript. */
  @SubL(source = "cycl/agenda.lisp", position = 18237)
  private static SubLSymbol $save_recent_experienceP$ = null;
  /** 10 minutes */
  @SubL(source = "cycl/agenda.lisp", position = 18435)
  private static SubLSymbol $save_experience_transcript_quantum$ = null;
  @SubL(source = "cycl/agenda.lisp", position = 18517)
  private static SubLSymbol $next_save_experience_transcript_time$ = null;

  @SubL(source = "cycl/agenda.lisp", position = 18597)
  public static final SubLObject save_experienceP()
  {
    return makeBoolean( ( ( NIL != $save_recent_experienceP$.getGlobalValue() ) && ( NIL != Time.time_has_arrivedP( $next_save_experience_transcript_time$.getGlobalValue() ) ) ) );
  }

  public static final class $save_experienceP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $save_experienceP$ZeroArityFunction()
    {
      super( extractFunctionNamed( "SAVE-EXPERIENCE?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return save_experienceP();
    }
  }

  @SubL(source = "cycl/agenda.lisp", position = 18741)
  public static final SubLObject save_local_experience()
  {
    $next_save_experience_transcript_time$.setGlobalValue( numeric_date_utilities.time_from_now( $save_experience_transcript_quantum$.getGlobalValue() ) );
    return inference_analysis.possibly_save_recent_experience();
  }
  /** 1 minute */
  @SubL(source = "cycl/agenda.lisp", position = 18995)
  private static SubLSymbol $save_asked_queries_transcript_quantum$ = null;
  @SubL(source = "cycl/agenda.lisp", position = 19144)
  private static SubLSymbol $next_save_asked_queries_transcript_time$ = null;

  @SubL(source = "cycl/agenda.lisp", position = 19227)
  public static final SubLObject agenda_save_asked_queriesP()
  {
    return makeBoolean( ( ( NIL != control_vars.save_asked_queriesP() ) && ( NIL != Time.time_has_arrivedP( $next_save_asked_queries_transcript_time$.getGlobalValue() ) ) ) );
  }

  public static final class $agenda_save_asked_queriesP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $agenda_save_asked_queriesP$ZeroArityFunction()
    {
      super( extractFunctionNamed( "AGENDA-SAVE-ASKED-QUERIES?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return agenda_save_asked_queriesP();
    }
  }
  @SubL(source = "cycl/agenda.lisp", position = 22276)
  private static SubLSymbol $agenda_daily_gc_lock$ = null;
  /** Do we perform a complete, daily once-a-day GC in the Cyc Agenda? */
  @SubL(source = "cycl/agenda.lisp", position = 22771)
  private static SubLSymbol $agenda_daily_gc_enabled$ = null;
  /**
   * Local time in form of (HH MM SS) at which a daily (gc) by the agenda is
   * invoked.
   */
  @SubL(source = "cycl/agenda.lisp", position = 22899)
  private static SubLSymbol $agenda_daily_gc_time_of_day$ = null;
  @SubL(source = "cycl/agenda.lisp", position = 23854)
  private static SubLSymbol $next_agenda_daily_gc_time$ = null;

  @SubL(source = "cycl/agenda.lisp", position = 23924)
  public static final SubLObject agenda_daily_gc_ready_p()
  {
    return makeBoolean( ( ( NIL != $agenda_daily_gc_enabled$.getGlobalValue() ) && ( NIL != $next_agenda_daily_gc_time$.getGlobalValue() ) && ( NIL != Time.time_has_arrivedP( $next_agenda_daily_gc_time$
        .getGlobalValue() ) ) ) );
  }

  public static final class $agenda_daily_gc_ready_p$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $agenda_daily_gc_ready_p$ZeroArityFunction()
    {
      super( extractFunctionNamed( "AGENDA-DAILY-GC-READY-P" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return agenda_daily_gc_ready_p();
    }
  }

  public static final SubLObject declare_agenda_file()
  {
    declareFunction( myName, "initialize_agenda", "INITIALIZE-AGENDA", 0, 0, false );
    declareFunction( myName, "within_agenda", "WITHIN-AGENDA", 0, 0, false );
    declareFunction( myName, "agenda_form_to_show", "AGENDA-FORM-TO-SHOW", 0, 0, false );
    declareFunction( myName, "agenda_top_level", "AGENDA-TOP-LEVEL", 0, 0, false );
    declareFunction( myName, "start_agenda", "START-AGENDA", 0, 1, false );
    declareFunction( myName, "restart_agenda", "RESTART-AGENDA", 0, 1, false );
    declareFunction( myName, "halt_agenda", "HALT-AGENDA", 0, 1, false );
    declareFunction( myName, "abort_agenda", "ABORT-AGENDA", 0, 0, false );
    declareFunction( myName, "abort_and_restart_agenda", "ABORT-AND-RESTART-AGENDA", 0, 0, false );
    declareFunction( myName, "wait_for_agenda_running", "WAIT-FOR-AGENDA-RUNNING", 0, 1, false );
    declareFunction( myName, "wait_for_agenda_not_running", "WAIT-FOR-AGENDA-NOT-RUNNING", 0, 1, false );
    declareFunction( myName, "ensure_agenda_running", "ENSURE-AGENDA-RUNNING", 0, 0, false );
    declareFunction( myName, "agenda_process", "AGENDA-PROCESS", 0, 0, false );
    declareFunction( myName, "agenda_running", "AGENDA-RUNNING", 0, 0, false );
    declareFunction( myName, "agenda_state", "AGENDA-STATE", 0, 0, false );
    declareFunction( myName, "current_process_is_agenda", "CURRENT-PROCESS-IS-AGENDA", 0, 0, false );
    declareFunction( myName, "agenda_idleP", "AGENDA-IDLE?", 0, 0, false );
    declareFunction( myName, "agenda_busyP", "AGENDA-BUSY?", 0, 0, false );
    declareFunction( myName, "start_agenda_process", "START-AGENDA-PROCESS", 0, 0, false );
    declareFunction( myName, "clear_agenda_process", "CLEAR-AGENDA-PROCESS", 0, 0, false );
    declareFunction( myName, "agenda_error_modes", "AGENDA-ERROR-MODES", 0, 0, false );
    declareFunction( myName, "agenda_error_mode", "AGENDA-ERROR-MODE", 0, 0, false );
    declareFunction( myName, "set_agenda_error_mode", "SET-AGENDA-ERROR-MODE", 1, 0, false );
    declareFunction( myName, "agenda_logs_errorsP", "AGENDA-LOGS-ERRORS?", 0, 0, false );
    declareFunction( myName, "set_agenda_log_file", "SET-AGENDA-LOG-FILE", 1, 0, false );
    declareFunction( myName, "get_agenda_log_file", "GET-AGENDA-LOG-FILE", 0, 0, false );
    declareFunction( myName, "agenda_startup_actions", "AGENDA-STARTUP-ACTIONS", 0, 0, false );
    declareFunction( myName, "agenda_work_to_do", "AGENDA-WORK-TO-DO", 0, 0, false );
    new $agenda_work_to_do$ZeroArityFunction();
    declareFunction( myName, "clear_agenda_halt_explanation", "CLEAR-AGENDA-HALT-EXPLANATION", 0, 0, false );
    declareFunction( myName, "perform_one_agenda_action", "PERFORM-ONE-AGENDA-ACTION", 0, 0, false );
    declareFunction( myName, "declare_agenda_task", "DECLARE-AGENDA-TASK", 3, 0, false );
    declareFunction( myName, "undeclare_agenda_task", "UNDECLARE-AGENDA-TASK", 1, 0, false );
    declareFunction( myName, "agenda_tasks", "AGENDA-TASKS", 0, 0, false );
    declareFunction( myName, "agenda_task_test", "AGENDA-TASK-TEST", 1, 0, false );
    declareFunction( myName, "agenda_task_action", "AGENDA-TASK-ACTION", 1, 0, false );
    declareFunction( myName, "agenda_task_priority", "AGENDA-TASK-PRIORITY", 1, 0, false );
    declareFunction( myName, "agenda_should_quitP", "AGENDA-SHOULD-QUIT?", 0, 0, false );
    new $agenda_should_quitP$ZeroArityFunction();
    declareFunction( myName, "do_nothing", "DO-NOTHING", 0, 0, false );
    declareFunction( myName, "restart_agenda_flagP", "RESTART-AGENDA-FLAG?", 0, 0, false );
    new $restart_agenda_flagP$ZeroArityFunction();
    declareFunction( myName, "save_operationsP", "SAVE-OPERATIONS?", 0, 0, false );
    new $save_operationsP$ZeroArityFunction();
    declareFunction( myName, "save_local_operations", "SAVE-LOCAL-OPERATIONS", 0, 0, false );
    declareFunction( myName, "worry_transmit_operationsP", "WORRY-TRANSMIT-OPERATIONS?", 0, 0, false );
    new $worry_transmit_operationsP$ZeroArityFunction();
    declareFunction( myName, "worry_transmit_operations", "WORRY-TRANSMIT-OPERATIONS", 0, 0, false );
    declareFunction( myName, "run_auxiliary_opP", "RUN-AUXILIARY-OP?", 0, 0, false );
    new $run_auxiliary_opP$ZeroArityFunction();
    declareFunction( myName, "run_one_auxiliary_op_in_agenda", "RUN-ONE-AUXILIARY-OP-IN-AGENDA", 0, 0, false );
    declareFunction( myName, "run_one_non_local_op_in_agenda", "RUN-ONE-NON-LOCAL-OP-IN-AGENDA", 1, 0, false );
    declareFunction( myName, "handle_agenda_fi_error_state", "HANDLE-AGENDA-FI-ERROR-STATE", 0, 0, false );
    declareFunction( myName, "run_local_opP", "RUN-LOCAL-OP?", 0, 0, false );
    new $run_local_opP$ZeroArityFunction();
    declareFunction( myName, "run_one_local_op_in_agenda", "RUN-ONE-LOCAL-OP-IN-AGENDA", 0, 0, false );
    declareFunction( myName, "agenda_throw_error_message", "AGENDA-THROW-ERROR-MESSAGE", 0, 0, false );
    declareFunction( myName, "log_agenda_error", "LOG-AGENDA-ERROR", 1, 0, false );
    declareFunction( myName, "timestamp_operation_p", "TIMESTAMP-OPERATION-P", 1, 0, false );
    declareFunction( myName, "construct_generic_timestamp_operation", "CONSTRUCT-GENERIC-TIMESTAMP-OPERATION", 0, 0, false );
    declareFunction( myName, "normal_transmit_operationsP", "NORMAL-TRANSMIT-OPERATIONS?", 0, 0, false );
    new $normal_transmit_operationsP$ZeroArityFunction();
    declareFunction( myName, "normal_transmit_operations", "NORMAL-TRANSMIT-OPERATIONS", 0, 0, false );
    declareFunction( myName, "run_remote_opP", "RUN-REMOTE-OP?", 0, 0, false );
    new $run_remote_opP$ZeroArityFunction();
    declareFunction( myName, "run_one_remote_op_in_agenda", "RUN-ONE-REMOTE-OP-IN-AGENDA", 0, 0, false );
    declareFunction( myName, "load_operationsP", "LOAD-OPERATIONS?", 0, 0, false );
    new $load_operationsP$ZeroArityFunction();
    declareFunction( myName, "load_remote_operations", "LOAD-REMOTE-OPERATIONS", 0, 0, false );
    declareFunction( myName, "save_experienceP", "SAVE-EXPERIENCE?", 0, 0, false );
    new $save_experienceP$ZeroArityFunction();
    declareFunction( myName, "save_local_experience", "SAVE-LOCAL-EXPERIENCE", 0, 0, false );
    declareFunction( myName, "agenda_save_asked_queriesP", "AGENDA-SAVE-ASKED-QUERIES?", 0, 0, false );
    new $agenda_save_asked_queriesP$ZeroArityFunction();
    declareFunction( myName, "save_local_asked_queries", "SAVE-LOCAL-ASKED-QUERIES", 0, 0, false );
    declareFunction( myName, "enable_agenda_daily_gc", "ENABLE-AGENDA-DAILY-GC", 3, 0, false );
    declareFunction( myName, "disable_agenda_daily_gc", "DISABLE-AGENDA-DAILY-GC", 0, 0, false );
    declareFunction( myName, "agenda_daily_gc_ready_p", "AGENDA-DAILY-GC-READY-P", 0, 0, false );
    new $agenda_daily_gc_ready_p$ZeroArityFunction();
    declareFunction( myName, "do_agenda_daily_gc", "DO-AGENDA-DAILY-GC", 0, 0, false );
    declareFunction( myName, "set_next_agenda_daily_gc_time", "SET-NEXT-AGENDA-DAILY-GC-TIME", 0, 0, false );
    declareFunction( myName, "update_agenda_daily_gc_time", "UPDATE-AGENDA-DAILY-GC-TIME", 0, 0, false );
    return NIL;
  }

  public static final SubLObject init_agenda_file()
  {
    $agenda_should_quit$ = deflexical( "*AGENDA-SHOULD-QUIT*", ( ( NIL != Symbols.boundp( $sym0$_AGENDA_SHOULD_QUIT_ ) ) ? ( (SubLObject) $agenda_should_quit$.getGlobalValue() ) : NIL ) );
    $restart_agenda_flag$ = deflexical( "*RESTART-AGENDA-FLAG*", ( ( NIL != Symbols.boundp( $sym1$_RESTART_AGENDA_FLAG_ ) ) ? ( (SubLObject) $restart_agenda_flag$.getGlobalValue() ) : NIL ) );
    $within_agenda$ = defparameter( "*WITHIN-AGENDA*", NIL );
    $default_agenda_package$ = deflexical( "*DEFAULT-AGENDA-PACKAGE*", Packages.find_package( $str2$CYC ) );
    $agenda_resourcing_spaces$ = defparameter( "*AGENDA-RESOURCING-SPACES*", TEN_INTEGER );
    $agenda_process$ = deflexical( "*AGENDA-PROCESS*", ( ( NIL != Symbols.boundp( $sym7$_AGENDA_PROCESS_ ) ) ? ( (SubLObject) $agenda_process$.getGlobalValue() ) : NIL ) );
    $agenda_process_lock$ = deflexical( "*AGENDA-PROCESS-LOCK*", Locks.make_lock( $str10$Agenda_Process_Lock ) );
    $agenda_error_modes$ = deflexical( "*AGENDA-ERROR-MODES*", $list11 );
    $agenda_error_mode$ = deflexical( "*AGENDA-ERROR-MODE*", ( ( NIL != Symbols.boundp( $sym12$_AGENDA_ERROR_MODE_ ) ) ? ( (SubLObject) $agenda_error_mode$.getGlobalValue() ) : $kw13$HALT ) );
    $agenda_log_file$ = defvar( "*AGENDA-LOG-FILE*", NIL );
    $agenda_action_table$ = deflexical( "*AGENDA-ACTION-TABLE*", ( ( NIL != Symbols.boundp( $sym15$_AGENDA_ACTION_TABLE_ ) ) ? ( (SubLObject) $agenda_action_table$.getGlobalValue() ) : NIL ) );
    $agenda_action_table_lock$ = deflexical( "*AGENDA-ACTION-TABLE-LOCK*", Locks.make_lock( $str16$Agenda_Action_Table_Lock ) );
    $transcript_queue_worry_size$ = deflexical( "*TRANSCRIPT-QUEUE-WORRY-SIZE*", TWENTY_INTEGER );
    $save_transcript_quantum$ = deflexical( "*SAVE-TRANSCRIPT-QUANTUM*", $int25$60 );
    $next_save_transcript_time$ = deflexical( "*NEXT-SAVE-TRANSCRIPT-TIME*", ( ( NIL != Symbols.boundp( $sym26$_NEXT_SAVE_TRANSCRIPT_TIME_ ) ) ? ( (SubLObject) $next_save_transcript_time$.getGlobalValue() )
        : Time.get_universal_time() ) );
    $worry_transmit_quantum$ = deflexical( "*WORRY-TRANSMIT-QUANTUM*", Numbers.multiply( TEN_INTEGER, $int25$60 ) );
    $worry_transmit_size$ = deflexical( "*WORRY-TRANSMIT-SIZE*", $int29$1000 );
    $next_worry_transmit_time$ = deflexical( "*NEXT-WORRY-TRANSMIT-TIME*", ( ( NIL != Symbols.boundp( $sym30$_NEXT_WORRY_TRANSMIT_TIME_ ) ) ? ( (SubLObject) $next_worry_transmit_time$.getGlobalValue() )
        : Time.get_universal_time() ) );
    $normal_transmit_quantum$ = deflexical( "*NORMAL-TRANSMIT-QUANTUM*", $int59$120 );
    $next_normal_transmit_time$ = deflexical( "*NEXT-NORMAL-TRANSMIT-TIME*", ( ( NIL != Symbols.boundp( $sym60$_NEXT_NORMAL_TRANSMIT_TIME_ ) ) ? ( (SubLObject) $next_normal_transmit_time$.getGlobalValue() )
        : Time.get_universal_time() ) );
    $load_transcript_quantum$ = deflexical( "*LOAD-TRANSCRIPT-QUANTUM*", $int59$120 );
    $next_load_transcript_time$ = deflexical( "*NEXT-LOAD-TRANSCRIPT-TIME*", ( ( NIL != Symbols.boundp( $sym68$_NEXT_LOAD_TRANSCRIPT_TIME_ ) ) ? ( (SubLObject) $next_load_transcript_time$.getGlobalValue() )
        : Time.get_universal_time() ) );
    $save_recent_experienceP$ = deflexical( "*SAVE-RECENT-EXPERIENCE?*", T );
    $save_experience_transcript_quantum$ = deflexical( "*SAVE-EXPERIENCE-TRANSCRIPT-QUANTUM*", Numbers.multiply( $int25$60, TEN_INTEGER ) );
    $next_save_experience_transcript_time$ = deflexical( "*NEXT-SAVE-EXPERIENCE-TRANSCRIPT-TIME*", ( ( NIL != Symbols.boundp( $sym72$_NEXT_SAVE_EXPERIENCE_TRANSCRIPT_TIME_ ) )
        ? ( (SubLObject) $next_save_experience_transcript_time$.getGlobalValue() )
        : Time.get_universal_time() ) );
    $save_asked_queries_transcript_quantum$ = deflexical( "*SAVE-ASKED-QUERIES-TRANSCRIPT-QUANTUM*", Numbers.multiply( $int25$60, ONE_INTEGER ) );
    $next_save_asked_queries_transcript_time$ = deflexical( "*NEXT-SAVE-ASKED-QUERIES-TRANSCRIPT-TIME*", ( ( NIL != Symbols.boundp( $sym75$_NEXT_SAVE_ASKED_QUERIES_TRANSCRIPT_TIME_ ) )
        ? ( (SubLObject) $next_save_asked_queries_transcript_time$.getGlobalValue() )
        : Time.get_universal_time() ) );
    $agenda_daily_gc_lock$ = deflexical( "*AGENDA-DAILY-GC-LOCK*", Locks.make_lock( $str79$Agenda_Daily_GC ) );
    $agenda_daily_gc_enabled$ = deflexical( "*AGENDA-DAILY-GC-ENABLED*", ( ( NIL != Symbols.boundp( $sym80$_AGENDA_DAILY_GC_ENABLED_ ) ) ? ( (SubLObject) $agenda_daily_gc_enabled$.getGlobalValue() ) : NIL ) );
    $agenda_daily_gc_time_of_day$ = deflexical( "*AGENDA-DAILY-GC-TIME-OF-DAY*", ( ( NIL != Symbols.boundp( $sym81$_AGENDA_DAILY_GC_TIME_OF_DAY_ ) ) ? ( (SubLObject) $agenda_daily_gc_time_of_day$.getGlobalValue() )
        : $list82 ) );
    $next_agenda_daily_gc_time$ = deflexical( "*NEXT-AGENDA-DAILY-GC-TIME*", ( ( NIL != Symbols.boundp( $sym88$_NEXT_AGENDA_DAILY_GC_TIME_ ) ) ? ( (SubLObject) $next_agenda_daily_gc_time$.getGlobalValue() ) : NIL ) );
    return NIL;
  }

  public static final SubLObject setup_agenda_file()
  {
    // CVS_ID("Id: agenda.lisp 127020 2009-02-04 00:44:47Z tbrussea ");
    subl_macro_promotions.declare_defglobal( $sym0$_AGENDA_SHOULD_QUIT_ );
    subl_macro_promotions.declare_defglobal( $sym1$_RESTART_AGENDA_FLAG_ );
    subl_macro_promotions.declare_defglobal( $sym7$_AGENDA_PROCESS_ );
    access_macros.register_external_symbol( $sym8$AGENDA_RUNNING );
    subl_macro_promotions.declare_defglobal( $sym12$_AGENDA_ERROR_MODE_ );
    subl_macro_promotions.declare_defglobal( $sym15$_AGENDA_ACTION_TABLE_ );
    declare_agenda_task( $sym22$AGENDA_SHOULD_QUIT_, $sym23$DO_NOTHING, ZERO_INTEGER );
    declare_agenda_task( $sym24$RESTART_AGENDA_FLAG_, $sym23$DO_NOTHING, ZERO_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym26$_NEXT_SAVE_TRANSCRIPT_TIME_ );
    declare_agenda_task( $sym27$SAVE_OPERATIONS_, $sym28$SAVE_LOCAL_OPERATIONS, TEN_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym30$_NEXT_WORRY_TRANSMIT_TIME_ );
    declare_agenda_task( $sym31$WORRY_TRANSMIT_OPERATIONS_, $sym32$WORRY_TRANSMIT_OPERATIONS, FIFTEEN_INTEGER );
    declare_agenda_task( $sym34$RUN_AUXILIARY_OP_, $sym35$RUN_ONE_AUXILIARY_OP_IN_AGENDA, TWENTY_INTEGER );
    declare_agenda_task( $sym50$RUN_LOCAL_OP_, $sym51$RUN_ONE_LOCAL_OP_IN_AGENDA, $int52$25 );
    subl_macro_promotions.declare_defglobal( $sym60$_NEXT_NORMAL_TRANSMIT_TIME_ );
    declare_agenda_task( $sym61$NORMAL_TRANSMIT_OPERATIONS_, $sym62$NORMAL_TRANSMIT_OPERATIONS, $int63$35 );
    declare_agenda_task( $sym65$RUN_REMOTE_OP_, $sym66$RUN_ONE_REMOTE_OP_IN_AGENDA, $int67$40 );
    subl_macro_promotions.declare_defglobal( $sym68$_NEXT_LOAD_TRANSCRIPT_TIME_ );
    declare_agenda_task( $sym69$LOAD_OPERATIONS_, $sym70$LOAD_REMOTE_OPERATIONS, $int71$45 );
    subl_macro_promotions.declare_defglobal( $sym72$_NEXT_SAVE_EXPERIENCE_TRANSCRIPT_TIME_ );
    declare_agenda_task( $sym73$SAVE_EXPERIENCE_, $sym74$SAVE_LOCAL_EXPERIENCE, $int25$60 );
    subl_macro_promotions.declare_defglobal( $sym75$_NEXT_SAVE_ASKED_QUERIES_TRANSCRIPT_TIME_ );
    declare_agenda_task( $sym76$AGENDA_SAVE_ASKED_QUERIES_, $sym77$SAVE_LOCAL_ASKED_QUERIES, $int78$30 );
    subl_macro_promotions.declare_defglobal( $sym80$_AGENDA_DAILY_GC_ENABLED_ );
    subl_macro_promotions.declare_defglobal( $sym81$_AGENDA_DAILY_GC_TIME_OF_DAY_ );
    subl_macro_promotions.declare_defglobal( $sym88$_NEXT_AGENDA_DAILY_GC_TIME_ );
    declare_agenda_task( $sym90$AGENDA_DAILY_GC_READY_P, $sym91$DO_AGENDA_DAILY_GC, $int29$1000 );
    return NIL;
  }
  //// Internal Constants
  public static final SubLSymbol $sym0$_AGENDA_SHOULD_QUIT_ = makeSymbol( "*AGENDA-SHOULD-QUIT*" );
  public static final SubLSymbol $sym1$_RESTART_AGENDA_FLAG_ = makeSymbol( "*RESTART-AGENDA-FLAG*" );
  public static final SubLString $str2$CYC = makeString( "CYC" );
  public static final SubLString $str3$Idle = makeString( "Idle" );
  public static final SubLSymbol $sym4$AGENDA_WORK_TO_DO = makeSymbol( "AGENDA-WORK-TO-DO" );
  public static final SubLString $str5$Cyc_Agenda = makeString( "Cyc Agenda" );
  public static final SubLSymbol $sym6$AGENDA_TOP_LEVEL = makeSymbol( "AGENDA-TOP-LEVEL" );
  public static final SubLSymbol $sym7$_AGENDA_PROCESS_ = makeSymbol( "*AGENDA-PROCESS*" );
  public static final SubLSymbol $sym8$AGENDA_RUNNING = makeSymbol( "AGENDA-RUNNING" );
  public static final SubLString $str9$None = makeString( "None" );
  public static final SubLString $str10$Agenda_Process_Lock = makeString( "Agenda Process Lock" );
  public static final SubLList $list11 = list( makeKeyword( "IGNORE" ), makeKeyword( "HALT" ), makeKeyword( "DEBUG" ), makeKeyword( "LOG" ) );
  public static final SubLSymbol $sym12$_AGENDA_ERROR_MODE_ = makeSymbol( "*AGENDA-ERROR-MODE*" );
  public static final SubLSymbol $kw13$HALT = makeKeyword( "HALT" );
  public static final SubLSymbol $kw14$LOG = makeKeyword( "LOG" );
  public static final SubLSymbol $sym15$_AGENDA_ACTION_TABLE_ = makeSymbol( "*AGENDA-ACTION-TABLE*" );
  public static final SubLString $str16$Agenda_Action_Table_Lock = makeString( "Agenda Action Table Lock" );
  public static final SubLSymbol $sym17$SYMBOLP = makeSymbol( "SYMBOLP" );
  public static final SubLSymbol $sym18$NUMBERP = makeSymbol( "NUMBERP" );
  public static final SubLSymbol $sym19$_ = makeSymbol( "<" );
  public static final SubLSymbol $sym20$AGENDA_TASK_PRIORITY = makeSymbol( "AGENDA-TASK-PRIORITY" );
  public static final SubLSymbol $sym21$FIRST = makeSymbol( "FIRST" );
  public static final SubLSymbol $sym22$AGENDA_SHOULD_QUIT_ = makeSymbol( "AGENDA-SHOULD-QUIT?" );
  public static final SubLSymbol $sym23$DO_NOTHING = makeSymbol( "DO-NOTHING" );
  public static final SubLSymbol $sym24$RESTART_AGENDA_FLAG_ = makeSymbol( "RESTART-AGENDA-FLAG?" );
  public static final SubLInteger $int25$60 = makeInteger( 60 );
  public static final SubLSymbol $sym26$_NEXT_SAVE_TRANSCRIPT_TIME_ = makeSymbol( "*NEXT-SAVE-TRANSCRIPT-TIME*" );
  public static final SubLSymbol $sym27$SAVE_OPERATIONS_ = makeSymbol( "SAVE-OPERATIONS?" );
  public static final SubLSymbol $sym28$SAVE_LOCAL_OPERATIONS = makeSymbol( "SAVE-LOCAL-OPERATIONS" );
  public static final SubLInteger $int29$1000 = makeInteger( 1000 );
  public static final SubLSymbol $sym30$_NEXT_WORRY_TRANSMIT_TIME_ = makeSymbol( "*NEXT-WORRY-TRANSMIT-TIME*" );
  public static final SubLSymbol $sym31$WORRY_TRANSMIT_OPERATIONS_ = makeSymbol( "WORRY-TRANSMIT-OPERATIONS?" );
  public static final SubLSymbol $sym32$WORRY_TRANSMIT_OPERATIONS = makeSymbol( "WORRY-TRANSMIT-OPERATIONS" );
  public static final SubLSymbol $sym33$RUN_ONE_AUXILIARY_OP = makeSymbol( "RUN-ONE-AUXILIARY-OP" );
  public static final SubLSymbol $sym34$RUN_AUXILIARY_OP_ = makeSymbol( "RUN-AUXILIARY-OP?" );
  public static final SubLSymbol $sym35$RUN_ONE_AUXILIARY_OP_IN_AGENDA = makeSymbol( "RUN-ONE-AUXILIARY-OP-IN-AGENDA" );
  public static final SubLSymbol $sym36$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
  public static final SubLString $str37$_A = makeString( "~A" );
  public static final SubLList $list38 = list( makeSymbol( "ERROR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "FORMAT-STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
  public static final SubLSymbol $sym39$CERROR = makeSymbol( "CERROR" );
  public static final SubLString $str40$Continue_the_agenda = makeString( "Continue the agenda" );
  public static final SubLString $str41$__Last_operation___S__ = makeString( "~%Last operation: ~S~%" );
  public static final SubLString $str42$FI_error___A = makeString( "FI error: ~A" );
  public static final SubLList $list43 = list( makeSymbol( "WARNING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "FORMAT-STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
  public static final SubLSymbol $sym44$WARN = makeSymbol( "WARN" );
  public static final SubLString $str45$FI_warning___A = makeString( "FI warning: ~A" );
  public static final SubLSymbol $kw46$DEBUG = makeKeyword( "DEBUG" );
  public static final SubLSymbol $kw47$AGENDA_ABORT = makeKeyword( "AGENDA-ABORT" );
  public static final SubLSymbol $sym48$AGENDA_THROW_ERROR_MESSAGE = makeSymbol( "AGENDA-THROW-ERROR-MESSAGE" );
  public static final SubLSymbol $kw49$IGNORE = makeKeyword( "IGNORE" );
  public static final SubLSymbol $sym50$RUN_LOCAL_OP_ = makeSymbol( "RUN-LOCAL-OP?" );
  public static final SubLSymbol $sym51$RUN_ONE_LOCAL_OP_IN_AGENDA = makeSymbol( "RUN-ONE-LOCAL-OP-IN-AGENDA" );
  public static final SubLInteger $int52$25 = makeInteger( 25 );
  public static final SubLSymbol $kw53$APPEND = makeKeyword( "APPEND" );
  public static final SubLString $str54$Unable_to_open__S = makeString( "Unable to open ~S" );
  public static final SubLString $str55$_s__ = makeString( "~s~%" );
  public static final SubLSymbol $sym56$FI_TIMESTAMP_ASSERTION = makeSymbol( "FI-TIMESTAMP-ASSERTION" );
  public static final SubLObject $const57$Guest = constant_handles.reader_make_constant_shell( makeString( "Guest" ) );
  public static final SubLList $list58 = list( NIL, NIL, NIL );
  public static final SubLInteger $int59$120 = makeInteger( 120 );
  public static final SubLSymbol $sym60$_NEXT_NORMAL_TRANSMIT_TIME_ = makeSymbol( "*NEXT-NORMAL-TRANSMIT-TIME*" );
  public static final SubLSymbol $sym61$NORMAL_TRANSMIT_OPERATIONS_ = makeSymbol( "NORMAL-TRANSMIT-OPERATIONS?" );
  public static final SubLSymbol $sym62$NORMAL_TRANSMIT_OPERATIONS = makeSymbol( "NORMAL-TRANSMIT-OPERATIONS" );
  public static final SubLInteger $int63$35 = makeInteger( 35 );
  public static final SubLSymbol $sym64$RUN_ONE_REMOTE_OP = makeSymbol( "RUN-ONE-REMOTE-OP" );
  public static final SubLSymbol $sym65$RUN_REMOTE_OP_ = makeSymbol( "RUN-REMOTE-OP?" );
  public static final SubLSymbol $sym66$RUN_ONE_REMOTE_OP_IN_AGENDA = makeSymbol( "RUN-ONE-REMOTE-OP-IN-AGENDA" );
  public static final SubLInteger $int67$40 = makeInteger( 40 );
  public static final SubLSymbol $sym68$_NEXT_LOAD_TRANSCRIPT_TIME_ = makeSymbol( "*NEXT-LOAD-TRANSCRIPT-TIME*" );
  public static final SubLSymbol $sym69$LOAD_OPERATIONS_ = makeSymbol( "LOAD-OPERATIONS?" );
  public static final SubLSymbol $sym70$LOAD_REMOTE_OPERATIONS = makeSymbol( "LOAD-REMOTE-OPERATIONS" );
  public static final SubLInteger $int71$45 = makeInteger( 45 );
  public static final SubLSymbol $sym72$_NEXT_SAVE_EXPERIENCE_TRANSCRIPT_TIME_ = makeSymbol( "*NEXT-SAVE-EXPERIENCE-TRANSCRIPT-TIME*" );
  public static final SubLSymbol $sym73$SAVE_EXPERIENCE_ = makeSymbol( "SAVE-EXPERIENCE?" );
  public static final SubLSymbol $sym74$SAVE_LOCAL_EXPERIENCE = makeSymbol( "SAVE-LOCAL-EXPERIENCE" );
  public static final SubLSymbol $sym75$_NEXT_SAVE_ASKED_QUERIES_TRANSCRIPT_TIME_ = makeSymbol( "*NEXT-SAVE-ASKED-QUERIES-TRANSCRIPT-TIME*" );
  public static final SubLSymbol $sym76$AGENDA_SAVE_ASKED_QUERIES_ = makeSymbol( "AGENDA-SAVE-ASKED-QUERIES?" );
  public static final SubLSymbol $sym77$SAVE_LOCAL_ASKED_QUERIES = makeSymbol( "SAVE-LOCAL-ASKED-QUERIES" );
  public static final SubLInteger $int78$30 = makeInteger( 30 );
  public static final SubLString $str79$Agenda_Daily_GC = makeString( "Agenda Daily GC" );
  public static final SubLSymbol $sym80$_AGENDA_DAILY_GC_ENABLED_ = makeSymbol( "*AGENDA-DAILY-GC-ENABLED*" );
  public static final SubLSymbol $sym81$_AGENDA_DAILY_GC_TIME_OF_DAY_ = makeSymbol( "*AGENDA-DAILY-GC-TIME-OF-DAY*" );
  public static final SubLList $list82 = list( FOUR_INTEGER, ZERO_INTEGER, ZERO_INTEGER );
  public static final SubLInteger $int83$23 = makeInteger( 23 );
  public static final SubLString $str84$Hour_must_be_an_integer_in_the_ra = makeString( "Hour must be an integer in the range 0 - 23" );
  public static final SubLInteger $int85$59 = makeInteger( 59 );
  public static final SubLString $str86$Minute_must_be_an_integer_in_the_ = makeString( "Minute must be an integer in the range 0 - 59" );
  public static final SubLString $str87$Second_must_be_an_integer_in_the_ = makeString( "Second must be an integer in the range 0 - 59" );
  public static final SubLSymbol $sym88$_NEXT_AGENDA_DAILY_GC_TIME_ = makeSymbol( "*NEXT-AGENDA-DAILY-GC-TIME*" );
  public static final SubLString $str89$Doing_Agenda_Daily_GC_at__A = makeString( "Doing Agenda Daily GC at ~A" );
  public static final SubLSymbol $sym90$AGENDA_DAILY_GC_READY_P = makeSymbol( "AGENDA-DAILY-GC-READY-P" );
  public static final SubLSymbol $sym91$DO_AGENDA_DAILY_GC = makeSymbol( "DO-AGENDA-DAILY-GC" );
  public static final SubLList $list92 = list( makeSymbol( "HOUR" ), makeSymbol( "MINUTE" ), makeSymbol( "SECOND" ) );

  //// Initializers
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
}
