package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_processes
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subloop_processes";
  public static final String myFingerPrint = "e32cc7706d0aa095621e86dddf209d69e4606b4b79dee6d5c7ccc497ee6aa9b2";
  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
  private static SubLSymbol $valid_subloop_process_status_types$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$SUBLOOP_PROCESS_STATUS_TYPE;
  private static final SubLString $str2$_S___S_is_not_a_member_of_the__S_;
  private static final SubLSymbol $sym3$ENCODE_SUBLOOP_PROCESS_STATUS_TYPE;
  private static final SubLString $str4$_S___S_is_not_a_valid_encoding_of;
  private static final SubLSymbol $sym5$DECODE_SUBLOOP_PROCESS_STATUS_TYPE;
  private static final SubLString $str6$_S___S_was_expected_to_be_a_membe;
  private static final SubLSymbol $sym7$SUBLOOP_PROCESS_STATUS_TYPE_P;
  private static final SubLSymbol $sym8$SUBLOOP_PROCESS;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$BASIC_SUBLOOP_PROCESS;
  private static final SubLSymbol $sym11$OBJECT;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$OWNER;
  private static final SubLSymbol $sym15$INSTANCE_COUNT;
  private static final SubLSymbol $sym16$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_CLASS;
  private static final SubLSymbol $sym17$ISOLATED_P;
  private static final SubLSymbol $sym18$INSTANCE_NUMBER;
  private static final SubLSymbol $sym19$NAME;
  private static final SubLSymbol $sym20$PRIORITY;
  private static final SubLSymbol $sym21$STATUS;
  private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_INSTANCE;
  private static final SubLSymbol $sym23$INITIALIZE;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD;
  private static final SubLSymbol $kw27$UNKNOWN;
  private static final SubLSymbol $sym28$BASIC_SUBLOOP_PROCESS_INITIALIZE_METHOD;
  private static final SubLSymbol $sym29$PRINT;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD;
  private static final SubLString $str34$__BASIC_SUBLOOP_PROCESS___S___S_;
  private static final SubLSymbol $sym35$BASIC_SUBLOOP_PROCESS_PRINT_METHOD;
  private static final SubLSymbol $sym36$GET_NAME;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$BASIC_SUBLOOP_PROCESS_GET_NAME_METHOD;
  private static final SubLSymbol $sym40$SET_NAME;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD;
  private static final SubLString $str44$_SET_NAME__S____S_is_not_a_valid_;
  private static final SubLSymbol $sym45$BASIC_SUBLOOP_PROCESS_SET_NAME_METHOD;
  private static final SubLSymbol $sym46$GET_PRIORITY;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$BASIC_SUBLOOP_PROCESS_GET_PRIORITY_METHOD;
  private static final SubLSymbol $sym49$SET_PRIORITY;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD;
  private static final SubLString $str53$_SET_PRIORITY__S____S_is_not_a_va;
  private static final SubLSymbol $sym54$BASIC_SUBLOOP_PROCESS_SET_PRIORITY_METHOD;
  private static final SubLSymbol $sym55$GET_STATUS;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$BASIC_SUBLOOP_PROCESS_GET_STATUS_METHOD;
  private static final SubLSymbol $sym58$RUN;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLSymbol $kw61$ERROR;
  private static final SubLSymbol $kw62$ACTIVE;
  private static final SubLSymbol $sym63$RUN_INTERNAL;
  private static final SubLSymbol $kw64$TERMINATED;
  private static final SubLSymbol $kw65$KILLED;
  private static final SubLSymbol $kw66$DEAD;
  private static final SubLSymbol $kw67$SUSPENDED;
  private static final SubLSymbol $sym68$BASIC_SUBLOOP_PROCESS_RUN_METHOD;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$BASIC_SUBLOOP_PROCESS_RUN_INTERNAL_METHOD;
  private static final SubLSymbol $sym72$SUSPEND;
  private static final SubLList $list73;
  private static final SubLSymbol $sym74$BASIC_SUBLOOP_PROCESS_SUSPEND_METHOD;
  private static final SubLSymbol $sym75$KILL;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$BASIC_SUBLOOP_PROCESS_KILL_METHOD;
  private static final SubLSymbol $sym78$GET_OWNER;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$BASIC_SUBLOOP_PROCESS_GET_OWNER_METHOD;
  private static final SubLSymbol $sym81$SET_OWNER;
  private static final SubLList $list82;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD;
  private static final SubLString $str85$_SET_OWNER__S____S_is_not_an_inst;
  private static final SubLSymbol $sym86$BASIC_SUBLOOP_PROCESS_SET_OWNER_METHOD;
  private static final SubLSymbol $sym87$NOTHING_TO_DO_;
  private static final SubLSymbol $sym88$BASIC_SUBLOOP_PROCESS_NOTHING_TO_DO__METHOD;
  private static final SubLSymbol $sym89$ENQUEUE_NOTIFY;
  private static final SubLList $list90;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$BASIC_SUBLOOP_PROCESS_ENQUEUE_NOTIFY_METHOD;
  private static final SubLSymbol $sym93$DEQUEUE_NOTIFY;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$BASIC_SUBLOOP_PROCESS_DEQUEUE_NOTIFY_METHOD;
  private static final SubLSymbol $sym96$REMOVE_NOTIFY;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$BASIC_SUBLOOP_PROCESS_REMOVE_NOTIFY_METHOD;
  private static final SubLSymbol $sym99$MULTI_TASK_SCHEDULER;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$BASIC_MULTI_TASK_SCHEDULER;
  private static final SubLList $list102;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$PROCESS_QUEUE;
  private static final SubLSymbol $sym105$TRANSFER_QUEUE;
  private static final SubLSymbol $sym106$TRACE_P;
  private static final SubLInteger $int107$4098;
  private static final SubLSymbol $sym108$HALTED_P;
  private static final SubLInteger $int109$4097;
  private static final SubLSymbol $sym110$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_CLASS;
  private static final SubLSymbol $sym111$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_INSTANCE;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
  private static final SubLSymbol $sym114$BASIC_DOUBLY_LINKED_QUEUE;
  private static final SubLSymbol $sym115$BASIC_MULTI_TASK_SCHEDULER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym116$HALT;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
  private static final SubLSymbol $sym119$BASIC_MULTI_TASK_SCHEDULER_HALT_METHOD;
  private static final SubLSymbol $sym120$START;
  private static final SubLList $list121;
  private static final SubLSymbol $sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
  private static final SubLSymbol $sym123$BASIC_MULTI_TASK_SCHEDULER_START_METHOD;
  private static final SubLSymbol $sym124$ADD_TASK;
  private static final SubLList $list125;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
  private static final SubLString $str128$_ADD_TASK__S____S_is_not_a_SubLOO;
  private static final SubLSymbol $sym129$BASIC_MULTI_TASK_SCHEDULER_ADD_TASK_METHOD;
  private static final SubLSymbol $sym130$KILL_TASK;
  private static final SubLList $list131;
  private static final SubLString $str132$_KILL_TASK__S____S_is_not_a_SubLO;
  private static final SubLSymbol $sym133$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_METHOD;
  private static final SubLSymbol $sym134$KILL_TASK_BY_NAME;
  private static final SubLList $list135;
  private static final SubLList $list136;
  private static final SubLSymbol $sym137$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_BY_NAME_METHOD;
  private static final SubLSymbol $sym138$INTERRUPT_TASK;
  private static final SubLList $list139;
  private static final SubLString $str140$_INTERRUPT_TASK__S____S_is_not_a_;
  private static final SubLSymbol $sym141$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_METHOD;
  private static final SubLSymbol $sym142$INTERRUPT_TASK_BY_NAME;
  private static final SubLList $list143;
  private static final SubLSymbol $sym144$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_BY_NAME_METHOD;
  private static final SubLSymbol $sym145$GET_ALL_TASKS;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$BASIC_MULTI_TASK_SCHEDULER_GET_ALL_TASKS_METHOD;
  private static final SubLSymbol $sym148$KILL_ALL_TASKS;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$BASIC_MULTI_TASK_SCHEDULER_KILL_ALL_TASKS_METHOD;
  private static final SubLList $list151;
  private static final SubLList $list152;
  private static final SubLString $str153$_RUN__S____S_is_not_a_valid_expir;
  private static final SubLSymbol $sym154$PERFORM_TRACE;
  private static final SubLList $list155;
  private static final SubLSymbol $sym156$ON_NOTHING_TO_DO;
  private static final SubLSymbol $sym157$BASIC_MULTI_TASK_SCHEDULER_RUN_METHOD;
  private static final SubLSymbol $sym158$GET_TRACE_MODE;
  private static final SubLList $list159;
  private static final SubLSymbol $sym160$BASIC_MULTI_TASK_SCHEDULER_GET_TRACE_MODE_METHOD;
  private static final SubLSymbol $sym161$SET_TRACE_MODE;
  private static final SubLList $list162;
  private static final SubLList $list163;
  private static final SubLSymbol $sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
  private static final SubLSymbol $sym165$BASIC_MULTI_TASK_SCHEDULER_SET_TRACE_MODE_METHOD;
  private static final SubLList $list166;
  private static final SubLList $list167;
  private static final SubLSymbol $sym168$BASIC_MULTI_TASK_SCHEDULER_PERFORM_TRACE_METHOD;
  private static final SubLList $list169;
  private static final SubLSymbol $sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD;
  private static final SubLSymbol $sym171$BASIC_MULTI_TASK_SCHEDULER_NOTHING_TO_DO__METHOD;
  private static final SubLSymbol $sym172$BASIC_MULTI_TASK_SCHEDULER_ON_NOTHING_TO_DO_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
  public static SubLObject valid_subloop_process_status_types()
  {
    return $valid_subloop_process_status_types$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
  public static SubLObject subloop_process_status_type_p(final SubLObject v_object)
  {
    return ( NIL != conses_high.member( v_object, $valid_subloop_process_status_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
  public static SubLObject encode_subloop_process_status_type(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos = Sequences.position( value, $valid_subloop_process_status_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == pos )
    {
      Errors.error( $str2$_S___S_is_not_a_member_of_the__S_, $sym3$ENCODE_SUBLOOP_PROCESS_STATUS_TYPE, value, $sym1$SUBLOOP_PROCESS_STATUS_TYPE );
    }
    return pos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
  public static SubLObject decode_subloop_process_status_type(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject element = ConsesLow.nth( value, $valid_subloop_process_status_types$.getGlobalValue() );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == element )
    {
      Errors.error( $str4$_S___S_is_not_a_valid_encoding_of, $sym5$DECODE_SUBLOOP_PROCESS_STATUS_TYPE, value, $sym1$SUBLOOP_PROCESS_STATUS_TYPE );
    }
    return element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
  public static SubLObject subloop_process_status_type_less_p(final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_process_status_type_p( value1 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$SUBLOOP_PROCESS_STATUS_TYPE_P, value1, $sym1$SUBLOOP_PROCESS_STATUS_TYPE );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_process_status_type_p( value2 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$SUBLOOP_PROCESS_STATUS_TYPE_P, value2, $sym1$SUBLOOP_PROCESS_STATUS_TYPE );
    }
    SubLObject cdolist_list_var = $valid_subloop_process_status_types$.getGlobalValue();
    SubLObject value3 = NIL;
    value3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( value3.eql( value1 ) )
      {
        return makeBoolean( !value3.eql( value2 ) );
      }
      if( value3.eql( value2 ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      value3 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 849L)
  public static SubLObject subloop_process_status_type_greater_p(final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_process_status_type_p( value1 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$SUBLOOP_PROCESS_STATUS_TYPE_P, value1, $sym1$SUBLOOP_PROCESS_STATUS_TYPE );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_process_status_type_p( value2 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$SUBLOOP_PROCESS_STATUS_TYPE_P, value2, $sym1$SUBLOOP_PROCESS_STATUS_TYPE );
    }
    SubLObject cdolist_list_var = $valid_subloop_process_status_types$.getGlobalValue();
    SubLObject value3 = NIL;
    value3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( value3.eql( value2 ) )
      {
        return makeBoolean( !value3.eql( value1 ) );
      }
      if( value3.eql( value1 ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      value3 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 942L)
  public static SubLObject subloop_process_p(final SubLObject subloop_process)
  {
    return interfaces.subloop_instanceof_interface( subloop_process, $sym8$SUBLOOP_PROCESS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
  public static SubLObject get_basic_subloop_process_owner(final SubLObject basic_subloop_process)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_subloop_process, FOUR_INTEGER, $sym14$OWNER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
  public static SubLObject set_basic_subloop_process_owner(final SubLObject basic_subloop_process, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_subloop_process, value, FOUR_INTEGER, $sym14$OWNER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
  public static SubLObject get_basic_subloop_process_status(final SubLObject basic_subloop_process)
  {
    return classes.subloop_get_instance_slot( basic_subloop_process, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
  public static SubLObject set_basic_subloop_process_status(final SubLObject basic_subloop_process, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( basic_subloop_process, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
  public static SubLObject get_basic_subloop_process_priority(final SubLObject basic_subloop_process)
  {
    return classes.subloop_get_instance_slot( basic_subloop_process, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
  public static SubLObject set_basic_subloop_process_priority(final SubLObject basic_subloop_process, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( basic_subloop_process, value, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
  public static SubLObject get_basic_subloop_process_name(final SubLObject basic_subloop_process)
  {
    return classes.subloop_get_instance_slot( basic_subloop_process, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
  public static SubLObject set_basic_subloop_process_name(final SubLObject basic_subloop_process, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( basic_subloop_process, value, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
  public static SubLObject subloop_reserved_initialize_basic_subloop_process_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym15$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
  public static SubLObject subloop_reserved_initialize_basic_subloop_process_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym17$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym18$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$BASIC_SUBLOOP_PROCESS, $sym19$NAME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$BASIC_SUBLOOP_PROCESS, $sym20$PRIORITY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$BASIC_SUBLOOP_PROCESS, $sym21$STATUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$BASIC_SUBLOOP_PROCESS, $sym14$OWNER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 1556L)
  public static SubLObject basic_subloop_process_p(final SubLObject basic_subloop_process)
  {
    return classes.subloop_instanceof_class( basic_subloop_process, $sym10$BASIC_SUBLOOP_PROCESS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 2749L)
  public static SubLObject basic_subloop_process_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_subloop_process_method = NIL;
    SubLObject status = get_basic_subloop_process_status( self );
    SubLObject priority = get_basic_subloop_process_priority( self );
    SubLObject name = get_basic_subloop_process_name( self );
    try
    {
      thread.throwStack.push( $sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD );
      try
      {
        object.object_initialize_method( self );
        name = NIL;
        priority = ZERO_INTEGER;
        status = $kw27$UNKNOWN;
        Dynamic.sublisp_throw( $sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_subloop_process_status( self, status );
          set_basic_subloop_process_priority( self, priority );
          set_basic_subloop_process_name( self, name );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_subloop_process_method = Errors.handleThrowable( ccatch_env_var, $sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_subloop_process_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 2921L)
  public static SubLObject basic_subloop_process_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_subloop_process_method = NIL;
    final SubLObject status = get_basic_subloop_process_status( self );
    final SubLObject name = get_basic_subloop_process_name( self );
    try
    {
      thread.throwStack.push( $sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD );
      try
      {
        PrintLow.format( stream, $str34$__BASIC_SUBLOOP_PROCESS___S___S_, name, status );
        Dynamic.sublisp_throw( $sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_subloop_process_status( self, status );
          set_basic_subloop_process_name( self, name );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_subloop_process_method = Errors.handleThrowable( ccatch_env_var, $sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_subloop_process_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3092L)
  public static SubLObject basic_subloop_process_get_name_method(final SubLObject self)
  {
    final SubLObject name = get_basic_subloop_process_name( self );
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3183L)
  public static SubLObject basic_subloop_process_set_name_method(final SubLObject self, final SubLObject new_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_subloop_process_method = NIL;
    SubLObject name = get_basic_subloop_process_name( self );
    try
    {
      thread.throwStack.push( $sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != new_name && !new_name.isString() )
        {
          Errors.error( $str44$_SET_NAME__S____S_is_not_a_valid_, self, new_name );
        }
        name = new_name;
        Dynamic.sublisp_throw( $sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_name );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_subloop_process_name( self, name );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_subloop_process_method = Errors.handleThrowable( ccatch_env_var, $sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_subloop_process_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3443L)
  public static SubLObject basic_subloop_process_get_priority_method(final SubLObject self)
  {
    final SubLObject priority = get_basic_subloop_process_priority( self );
    return priority;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3542L)
  public static SubLObject basic_subloop_process_set_priority_method(final SubLObject self, final SubLObject new_priority)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_subloop_process_method = NIL;
    SubLObject priority = get_basic_subloop_process_priority( self );
    try
    {
      thread.throwStack.push( $sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !new_priority.isInteger() || !new_priority.numGE( ZERO_INTEGER ) ) )
        {
          Errors.error( $str53$_SET_PRIORITY__S____S_is_not_a_va, self, new_priority );
        }
        priority = new_priority;
        Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_priority );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_subloop_process_priority( self, priority );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_subloop_process_method = Errors.handleThrowable( ccatch_env_var, $sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_subloop_process_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3851L)
  public static SubLObject basic_subloop_process_get_status_method(final SubLObject self)
  {
    final SubLObject status = get_basic_subloop_process_status( self );
    return status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 3946L)
  public static SubLObject basic_subloop_process_run_method(final SubLObject self)
  {
    SubLObject result = $kw61$ERROR;
    try
    {
      set_basic_subloop_process_status( self, $kw62$ACTIVE );
      result = methods.funcall_instance_method_with_0_args( self, $sym63$RUN_INTERNAL );
      if( result == $kw64$TERMINATED || result == $kw65$KILLED || result == $kw61$ERROR )
      {
        set_basic_subloop_process_status( self, $kw66$DEAD );
      }
      else
      {
        set_basic_subloop_process_status( self, $kw67$SUSPENDED );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        set_basic_subloop_process_status( self, $kw61$ERROR );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 4530L)
  public static SubLObject basic_subloop_process_run_internal_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 4655L)
  public static SubLObject basic_subloop_process_suspend_method(final SubLObject self)
  {
    final SubLObject pcase_var;
    final SubLObject status = pcase_var = get_basic_subloop_process_status( self );
    if( pcase_var.eql( $kw66$DEAD ) )
    {
      return status;
    }
    set_basic_subloop_process_status( self, $kw67$SUSPENDED );
    final SubLObject owner = get_basic_subloop_process_owner( self );
    if( NIL != owner )
    {
      subloop_queues.basic_doubly_linked_queue_remove_method( owner, self );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 5163L)
  public static SubLObject basic_subloop_process_kill_method(final SubLObject self)
  {
    set_basic_subloop_process_status( self, $kw65$KILLED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 5381L)
  public static SubLObject basic_subloop_process_get_owner_method(final SubLObject self)
  {
    final SubLObject owner = get_basic_subloop_process_owner( self );
    return owner;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 5474L)
  public static SubLObject basic_subloop_process_set_owner_method(final SubLObject self, final SubLObject new_scheduler)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_subloop_process_method = NIL;
    SubLObject owner = get_basic_subloop_process_owner( self );
    try
    {
      thread.throwStack.push( $sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != new_scheduler && NIL == multi_task_scheduler_p( new_scheduler ) )
        {
          Errors.error( $str85$_SET_OWNER__S____S_is_not_an_inst, self, new_scheduler );
        }
        owner = new_scheduler;
        Dynamic.sublisp_throw( $sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD, new_scheduler );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_subloop_process_owner( self, owner );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_subloop_process_method = Errors.handleThrowable( ccatch_env_var, $sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_subloop_process_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 5780L)
  public static SubLObject basic_subloop_process_nothing_to_doP_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 5883L)
  public static SubLObject basic_subloop_process_enqueue_notify_method(final SubLObject self, final SubLObject queue)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 6011L)
  public static SubLObject basic_subloop_process_dequeue_notify_method(final SubLObject self, final SubLObject queue)
  {
    final SubLObject status = get_basic_subloop_process_status( self );
    if( status == $kw66$DEAD )
    {
      return NIL;
    }
    final SubLObject result = basic_subloop_process_run_method( self );
    if( result == $kw64$TERMINATED || result == $kw65$KILLED || result == $kw61$ERROR )
    {
      basic_subloop_process_kill_method( self );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 6446L)
  public static SubLObject basic_subloop_process_remove_notify_method(final SubLObject self, final SubLObject queue)
  {
    basic_subloop_process_kill_method( self );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 6566L)
  public static SubLObject multi_task_scheduler_p(final SubLObject multi_task_scheduler)
  {
    return interfaces.subloop_instanceof_interface( multi_task_scheduler, $sym99$MULTI_TASK_SCHEDULER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
  public static SubLObject get_basic_multi_task_scheduler_process_queue(final SubLObject basic_multi_task_scheduler)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_multi_task_scheduler, TWO_INTEGER, $sym104$PROCESS_QUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
  public static SubLObject set_basic_multi_task_scheduler_process_queue(final SubLObject basic_multi_task_scheduler, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_multi_task_scheduler, value, TWO_INTEGER, $sym104$PROCESS_QUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
  public static SubLObject get_basic_multi_task_scheduler_transfer_queue(final SubLObject basic_multi_task_scheduler)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_multi_task_scheduler, ONE_INTEGER, $sym105$TRANSFER_QUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
  public static SubLObject set_basic_multi_task_scheduler_transfer_queue(final SubLObject basic_multi_task_scheduler, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_multi_task_scheduler, value, ONE_INTEGER, $sym105$TRANSFER_QUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
  public static SubLObject get_basic_multi_task_scheduler_trace_p(final SubLObject basic_multi_task_scheduler)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_multi_task_scheduler );
    final SubLObject slot = slots.slot_assoc( $sym106$TRACE_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_multi_task_scheduler, slot );
    return classes.ldb_test( $int107$4098, subloop_structures.instance_boolean_slots( basic_multi_task_scheduler ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
  public static SubLObject set_basic_multi_task_scheduler_trace_p(final SubLObject basic_multi_task_scheduler, final SubLObject value)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_multi_task_scheduler );
    final SubLObject slot = slots.slot_assoc( $sym106$TRACE_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_multi_task_scheduler, slot );
    subloop_structures._csetf_instance_boolean_slots( basic_multi_task_scheduler, bytes.dpb( ( NIL != value ) ? ONE_INTEGER : ZERO_INTEGER, $int107$4098, subloop_structures.instance_boolean_slots(
        basic_multi_task_scheduler ) ) );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
  public static SubLObject get_basic_multi_task_scheduler_halted_p(final SubLObject basic_multi_task_scheduler)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_multi_task_scheduler );
    final SubLObject slot = slots.slot_assoc( $sym108$HALTED_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_multi_task_scheduler, slot );
    return classes.ldb_test( $int109$4097, subloop_structures.instance_boolean_slots( basic_multi_task_scheduler ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
  public static SubLObject set_basic_multi_task_scheduler_halted_p(final SubLObject basic_multi_task_scheduler, final SubLObject value)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_multi_task_scheduler );
    final SubLObject slot = slots.slot_assoc( $sym108$HALTED_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_multi_task_scheduler, slot );
    subloop_structures._csetf_instance_boolean_slots( basic_multi_task_scheduler, bytes.dpb( ( NIL != value ) ? ONE_INTEGER : ZERO_INTEGER, $int109$4097, subloop_structures.instance_boolean_slots(
        basic_multi_task_scheduler ) ) );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
  public static SubLObject subloop_reserved_initialize_basic_multi_task_scheduler_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym15$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
  public static SubLObject subloop_reserved_initialize_basic_multi_task_scheduler_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym17$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym108$HALTED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym106$TRACE_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym18$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym105$TRANSFER_QUEUE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym104$PROCESS_QUEUE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 7359L)
  public static SubLObject basic_multi_task_scheduler_p(final SubLObject basic_multi_task_scheduler)
  {
    return classes.subloop_instanceof_class( basic_multi_task_scheduler, $sym101$BASIC_MULTI_TASK_SCHEDULER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 8576L)
  public static SubLObject basic_multi_task_scheduler_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
    SubLObject process_queue = get_basic_multi_task_scheduler_process_queue( self );
    SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue( self );
    SubLObject trace_p = get_basic_multi_task_scheduler_trace_p( self );
    SubLObject halted_p = get_basic_multi_task_scheduler_halted_p( self );
    try
    {
      thread.throwStack.push( $sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
      try
      {
        object.object_initialize_method( self );
        transfer_queue = object.new_class_instance( $sym114$BASIC_DOUBLY_LINKED_QUEUE );
        subloop_queues.basic_doubly_linked_queue_set_passive_method( transfer_queue, T );
        process_queue = object.new_class_instance( $sym114$BASIC_DOUBLY_LINKED_QUEUE );
        halted_p = T;
        trace_p = NIL;
        Dynamic.sublisp_throw( $sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_multi_task_scheduler_process_queue( self, process_queue );
          set_basic_multi_task_scheduler_transfer_queue( self, transfer_queue );
          set_basic_multi_task_scheduler_trace_p( self, trace_p );
          set_basic_multi_task_scheduler_halted_p( self, halted_p );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable( ccatch_env_var, $sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_multi_task_scheduler_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 8949L)
  public static SubLObject basic_multi_task_scheduler_halt_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
    SubLObject halted_p = get_basic_multi_task_scheduler_halted_p( self );
    try
    {
      thread.throwStack.push( $sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
      try
      {
        halted_p = T;
        Dynamic.sublisp_throw( $sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_multi_task_scheduler_halted_p( self, halted_p );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable( ccatch_env_var, $sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_multi_task_scheduler_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 9048L)
  public static SubLObject basic_multi_task_scheduler_start_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
    SubLObject halted_p = get_basic_multi_task_scheduler_halted_p( self );
    try
    {
      thread.throwStack.push( $sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
      try
      {
        halted_p = NIL;
        basic_multi_task_scheduler_run_method( self, UNPROVIDED );
        Dynamic.sublisp_throw( $sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_multi_task_scheduler_halted_p( self, halted_p );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable( ccatch_env_var, $sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_multi_task_scheduler_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 9163L)
  public static SubLObject basic_multi_task_scheduler_add_task_method(final SubLObject self, final SubLObject subloop_process)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
    final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue( self );
    try
    {
      thread.throwStack.push( $sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_process_p( subloop_process ) )
        {
          Errors.error( $str128$_ADD_TASK__S____S_is_not_a_SubLOO, self, subloop_process );
        }
        subloop_queues.basic_doubly_linked_queue_enqueue_method( process_queue, subloop_process );
        Dynamic.sublisp_throw( $sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, subloop_process );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_multi_task_scheduler_process_queue( self, process_queue );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable( ccatch_env_var, $sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_multi_task_scheduler_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 9478L)
  public static SubLObject basic_multi_task_scheduler_kill_task_method(final SubLObject self, final SubLObject subloop_process)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue( self );
    final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue( self );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_process_p( subloop_process ) )
    {
      Errors.error( $str132$_KILL_TASK__S____S_is_not_a_SubLO, self, subloop_process );
    }
    if( NIL != subloop_queues.basic_doubly_linked_queue_enqueued_p_method( process_queue, subloop_process ) )
    {
      subloop_queues.basic_doubly_linked_queue_remove_method( process_queue, subloop_process );
      return subloop_process;
    }
    subloop_queues.basic_doubly_linked_queue_remove_method( transfer_queue, subloop_process );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 10000L)
  public static SubLObject basic_multi_task_scheduler_kill_task_by_name_method(final SubLObject self, final SubLObject subloop_process_name)
  {
    final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue( self );
    final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue( self );
    final SubLObject key = methods.resolve_method( $sym36$GET_NAME, $sym10$BASIC_SUBLOOP_PROCESS );
    SubLObject task = subloop_queues.basic_doubly_linked_queue_find_method( process_queue, subloop_process_name, Symbols.symbol_function( EQUAL ), key );
    if( NIL != task )
    {
      subloop_queues.basic_doubly_linked_queue_remove_method( process_queue, subloop_process_name );
      return task;
    }
    task = subloop_queues.basic_doubly_linked_queue_find_method( transfer_queue, subloop_process_name, Symbols.symbol_function( EQUAL ), key );
    if( NIL != task )
    {
      subloop_queues.basic_doubly_linked_queue_remove_method( transfer_queue, task );
      return task;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 10665L)
  public static SubLObject basic_multi_task_scheduler_interrupt_task_method(final SubLObject self, final SubLObject subloop_process)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue( self );
    final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue( self );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_process_p( subloop_process ) )
    {
      Errors.error( $str140$_INTERRUPT_TASK__S____S_is_not_a_, self, subloop_process );
    }
    if( NIL != subloop_queues.basic_doubly_linked_queue_enqueued_p_method( process_queue, subloop_process ) )
    {
      subloop_queues.basic_doubly_linked_queue_remove_method( process_queue, subloop_process );
      subloop_queues.basic_doubly_linked_queue_enqueue_method( transfer_queue, subloop_process );
      return subloop_process;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 11200L)
  public static SubLObject basic_multi_task_scheduler_interrupt_task_by_name_method(final SubLObject self, final SubLObject subloop_process_name)
  {
    final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue( self );
    final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue( self );
    final SubLObject key = methods.resolve_method( $sym36$GET_NAME, $sym10$BASIC_SUBLOOP_PROCESS );
    final SubLObject task = subloop_queues.basic_doubly_linked_queue_find_method( process_queue, subloop_process_name, Symbols.symbol_function( EQUAL ), key );
    if( NIL != task )
    {
      subloop_queues.basic_doubly_linked_queue_remove_method( process_queue, task );
      subloop_queues.basic_doubly_linked_queue_enqueue_method( transfer_queue, task );
      return task;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 11702L)
  public static SubLObject basic_multi_task_scheduler_get_all_tasks_method(final SubLObject self)
  {
    final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue( self );
    final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue( self );
    return ConsesLow.nconc( subloop_queues.basic_doubly_linked_queue_get_contents_method( process_queue ), subloop_queues.basic_doubly_linked_queue_get_contents_method( transfer_queue ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 11956L)
  public static SubLObject basic_multi_task_scheduler_kill_all_tasks_method(final SubLObject self)
  {
    SubLObject cdolist_list_var;
    final SubLObject all_tasks = cdolist_list_var = basic_multi_task_scheduler_get_all_tasks_method( self );
    SubLObject task = NIL;
    task = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      basic_multi_task_scheduler_kill_task_method( self, task );
      cdolist_list_var = cdolist_list_var.rest();
      task = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 12160L)
  public static SubLObject basic_multi_task_scheduler_run_method(final SubLObject self, SubLObject expiration_delta)
  {
    if( expiration_delta == UNPROVIDED )
    {
      expiration_delta = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != expiration_delta && !expiration_delta.isInteger() && !expiration_delta.numGE( ZERO_INTEGER ) )
    {
      Errors.error( $str153$_RUN__S____S_is_not_a_valid_expir, self, expiration_delta );
    }
    set_basic_multi_task_scheduler_halted_p( self, NIL );
    final SubLObject transfer_queue = get_basic_multi_task_scheduler_transfer_queue( self );
    final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue( self );
    SubLObject current_process = NIL;
    if( NIL != expiration_delta )
    {
      final SubLObject start_time = Time.get_universal_time();
      final SubLObject stop_time = Numbers.add( start_time, expiration_delta );
      set_basic_multi_task_scheduler_halted_p( self, Numbers.numGE( stop_time, Time.get_universal_time() ) );
      while ( NIL == get_basic_multi_task_scheduler_halted_p( self ) && NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method( process_queue ))
      {
        current_process = subloop_queues.basic_doubly_linked_queue_dequeue_method( process_queue );
        if( NIL != get_basic_multi_task_scheduler_trace_p( self ) )
        {
          methods.funcall_instance_method_with_1_args( self, $sym154$PERFORM_TRACE, current_process );
        }
        if( NIL == conses_high.member( get_basic_subloop_process_status( current_process ), $list155, UNPROVIDED, UNPROVIDED ) )
        {
          subloop_queues.basic_doubly_linked_queue_enqueue_method( process_queue, current_process );
        }
        set_basic_multi_task_scheduler_halted_p( self, Numbers.numGE( stop_time, Time.get_universal_time() ) );
        if( NIL != basic_multi_task_scheduler_nothing_to_doP_method( self ) )
        {
          methods.funcall_instance_method_with_0_args( self, $sym156$ON_NOTHING_TO_DO );
        }
      }
    }
    else
    {
      while ( NIL == get_basic_multi_task_scheduler_halted_p( self ) && NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method( process_queue ))
      {
        current_process = subloop_queues.basic_doubly_linked_queue_dequeue_method( process_queue );
        if( NIL != get_basic_multi_task_scheduler_trace_p( self ) )
        {
          methods.funcall_instance_method_with_1_args( self, $sym154$PERFORM_TRACE, current_process );
        }
        if( NIL == conses_high.member( get_basic_subloop_process_status( current_process ), $list155, UNPROVIDED, UNPROVIDED ) )
        {
          subloop_queues.basic_doubly_linked_queue_enqueue_method( process_queue, current_process );
        }
        if( NIL != basic_multi_task_scheduler_nothing_to_doP_method( self ) )
        {
          methods.funcall_instance_method_with_0_args( self, $sym156$ON_NOTHING_TO_DO );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 14582L)
  public static SubLObject basic_multi_task_scheduler_get_trace_mode_method(final SubLObject self)
  {
    final SubLObject trace_p = get_basic_multi_task_scheduler_trace_p( self );
    return trace_p;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 14687L)
  public static SubLObject basic_multi_task_scheduler_set_trace_mode_method(final SubLObject self, final SubLObject new_trace_mode)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
    SubLObject trace_p = get_basic_multi_task_scheduler_trace_p( self );
    try
    {
      thread.throwStack.push( $sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
      try
      {
        trace_p = new_trace_mode;
        Dynamic.sublisp_throw( $sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, new_trace_mode );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_multi_task_scheduler_trace_p( self, trace_p );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable( ccatch_env_var, $sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_multi_task_scheduler_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 14835L)
  public static SubLObject basic_multi_task_scheduler_perform_trace_method(final SubLObject self, final SubLObject process)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 15001L)
  public static SubLObject basic_multi_task_scheduler_nothing_to_doP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_multi_task_scheduler_method = NIL;
    final SubLObject process_queue = get_basic_multi_task_scheduler_process_queue( self );
    try
    {
      thread.throwStack.push( $sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
      try
      {
        SubLObject cdolist_list_var;
        final SubLObject queue_contents = cdolist_list_var = subloop_queues.basic_doubly_linked_queue_get_contents_method( process_queue );
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == methods.funcall_instance_method_with_0_args( process, $sym87$NOTHING_TO_DO_ ) )
          {
            Dynamic.sublisp_throw( $sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, NIL );
          }
          cdolist_list_var = cdolist_list_var.rest();
          process = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_multi_task_scheduler_process_queue( self, process_queue );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_multi_task_scheduler_method = Errors.handleThrowable( ccatch_env_var, $sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_multi_task_scheduler_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-processes.lisp", position = 15308L)
  public static SubLObject basic_multi_task_scheduler_on_nothing_to_do_method(final SubLObject self)
  {
    return NIL;
  }

  public static SubLObject declare_subloop_processes_file()
  {
    SubLFiles.declareFunction( me, "valid_subloop_process_status_types", "VALID-SUBLOOP-PROCESS-STATUS-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "subloop_process_status_type_p", "SUBLOOP-PROCESS-STATUS-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_subloop_process_status_type", "ENCODE-SUBLOOP-PROCESS-STATUS-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_subloop_process_status_type", "DECODE-SUBLOOP-PROCESS-STATUS-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_process_status_type_less_p", "SUBLOOP-PROCESS-STATUS-TYPE-LESS-P", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_process_status_type_greater_p", "SUBLOOP-PROCESS-STATUS-TYPE-GREATER-P", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_process_p", "SUBLOOP-PROCESS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_subloop_process_owner", "GET-BASIC-SUBLOOP-PROCESS-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_subloop_process_owner", "SET-BASIC-SUBLOOP-PROCESS-OWNER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_subloop_process_status", "GET-BASIC-SUBLOOP-PROCESS-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_subloop_process_status", "SET-BASIC-SUBLOOP-PROCESS-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_subloop_process_priority", "GET-BASIC-SUBLOOP-PROCESS-PRIORITY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_subloop_process_priority", "SET-BASIC-SUBLOOP-PROCESS-PRIORITY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_subloop_process_name", "GET-BASIC-SUBLOOP-PROCESS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_subloop_process_name", "SET-BASIC-SUBLOOP-PROCESS-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_subloop_process_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_subloop_process_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_p", "BASIC-SUBLOOP-PROCESS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_initialize_method", "BASIC-SUBLOOP-PROCESS-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_print_method", "BASIC-SUBLOOP-PROCESS-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_get_name_method", "BASIC-SUBLOOP-PROCESS-GET-NAME-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_set_name_method", "BASIC-SUBLOOP-PROCESS-SET-NAME-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_get_priority_method", "BASIC-SUBLOOP-PROCESS-GET-PRIORITY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_set_priority_method", "BASIC-SUBLOOP-PROCESS-SET-PRIORITY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_get_status_method", "BASIC-SUBLOOP-PROCESS-GET-STATUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_run_method", "BASIC-SUBLOOP-PROCESS-RUN-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_run_internal_method", "BASIC-SUBLOOP-PROCESS-RUN-INTERNAL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_suspend_method", "BASIC-SUBLOOP-PROCESS-SUSPEND-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_kill_method", "BASIC-SUBLOOP-PROCESS-KILL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_get_owner_method", "BASIC-SUBLOOP-PROCESS-GET-OWNER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_set_owner_method", "BASIC-SUBLOOP-PROCESS-SET-OWNER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_nothing_to_doP_method", "BASIC-SUBLOOP-PROCESS-NOTHING-TO-DO?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_enqueue_notify_method", "BASIC-SUBLOOP-PROCESS-ENQUEUE-NOTIFY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_dequeue_notify_method", "BASIC-SUBLOOP-PROCESS-DEQUEUE-NOTIFY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_subloop_process_remove_notify_method", "BASIC-SUBLOOP-PROCESS-REMOVE-NOTIFY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "multi_task_scheduler_p", "MULTI-TASK-SCHEDULER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_multi_task_scheduler_process_queue", "GET-BASIC-MULTI-TASK-SCHEDULER-PROCESS-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_multi_task_scheduler_process_queue", "SET-BASIC-MULTI-TASK-SCHEDULER-PROCESS-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_multi_task_scheduler_transfer_queue", "GET-BASIC-MULTI-TASK-SCHEDULER-TRANSFER-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_multi_task_scheduler_transfer_queue", "SET-BASIC-MULTI-TASK-SCHEDULER-TRANSFER-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_multi_task_scheduler_trace_p", "GET-BASIC-MULTI-TASK-SCHEDULER-TRACE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_multi_task_scheduler_trace_p", "SET-BASIC-MULTI-TASK-SCHEDULER-TRACE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_multi_task_scheduler_halted_p", "GET-BASIC-MULTI-TASK-SCHEDULER-HALTED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_multi_task_scheduler_halted_p", "SET-BASIC-MULTI-TASK-SCHEDULER-HALTED-P", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_multi_task_scheduler_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_multi_task_scheduler_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_p", "BASIC-MULTI-TASK-SCHEDULER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_initialize_method", "BASIC-MULTI-TASK-SCHEDULER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_halt_method", "BASIC-MULTI-TASK-SCHEDULER-HALT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_start_method", "BASIC-MULTI-TASK-SCHEDULER-START-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_add_task_method", "BASIC-MULTI-TASK-SCHEDULER-ADD-TASK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_kill_task_method", "BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_kill_task_by_name_method", "BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-BY-NAME-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_interrupt_task_method", "BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_interrupt_task_by_name_method", "BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-BY-NAME-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_get_all_tasks_method", "BASIC-MULTI-TASK-SCHEDULER-GET-ALL-TASKS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_kill_all_tasks_method", "BASIC-MULTI-TASK-SCHEDULER-KILL-ALL-TASKS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_run_method", "BASIC-MULTI-TASK-SCHEDULER-RUN-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_get_trace_mode_method", "BASIC-MULTI-TASK-SCHEDULER-GET-TRACE-MODE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_set_trace_mode_method", "BASIC-MULTI-TASK-SCHEDULER-SET-TRACE-MODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_perform_trace_method", "BASIC-MULTI-TASK-SCHEDULER-PERFORM-TRACE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_nothing_to_doP_method", "BASIC-MULTI-TASK-SCHEDULER-NOTHING-TO-DO?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_multi_task_scheduler_on_nothing_to_do_method", "BASIC-MULTI-TASK-SCHEDULER-ON-NOTHING-TO-DO-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_subloop_processes_file()
  {
    $valid_subloop_process_status_types$ = SubLFiles.defconstant( "*VALID-SUBLOOP-PROCESS-STATUS-TYPES*", $list0 );
    return NIL;
  }

  public static SubLObject setup_subloop_processes_file()
  {
    enumerations.enumerations_incorporate_definition( $sym1$SUBLOOP_PROCESS_STATUS_TYPE, $list0 );
    interfaces.new_interface( $sym8$SUBLOOP_PROCESS, NIL, NIL, $list9 );
    classes.subloop_new_class( $sym10$BASIC_SUBLOOP_PROCESS, $sym11$OBJECT, $list12, NIL, $list13 );
    classes.class_set_implements_slot_listeners( $sym10$BASIC_SUBLOOP_PROCESS, NIL );
    classes.subloop_note_class_initialization_function( $sym10$BASIC_SUBLOOP_PROCESS, $sym16$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_CLASS );
    classes.subloop_note_instance_initialization_function( $sym10$BASIC_SUBLOOP_PROCESS, $sym22$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_INSTANCE );
    subloop_reserved_initialize_basic_subloop_process_class( $sym10$BASIC_SUBLOOP_PROCESS );
    methods.methods_incorporate_instance_method( $sym23$INITIALIZE, $sym10$BASIC_SUBLOOP_PROCESS, $list24, NIL, $list25 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym23$INITIALIZE, $sym28$BASIC_SUBLOOP_PROCESS_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym29$PRINT, $sym10$BASIC_SUBLOOP_PROCESS, $list30, $list31, $list32 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym29$PRINT, $sym35$BASIC_SUBLOOP_PROCESS_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym36$GET_NAME, $sym10$BASIC_SUBLOOP_PROCESS, $list37, NIL, $list38 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym36$GET_NAME, $sym39$BASIC_SUBLOOP_PROCESS_GET_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym40$SET_NAME, $sym10$BASIC_SUBLOOP_PROCESS, $list30, $list41, $list42 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym40$SET_NAME, $sym45$BASIC_SUBLOOP_PROCESS_SET_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym46$GET_PRIORITY, $sym10$BASIC_SUBLOOP_PROCESS, $list37, NIL, $list47 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym46$GET_PRIORITY, $sym48$BASIC_SUBLOOP_PROCESS_GET_PRIORITY_METHOD );
    methods.methods_incorporate_instance_method( $sym49$SET_PRIORITY, $sym10$BASIC_SUBLOOP_PROCESS, $list30, $list50, $list51 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym49$SET_PRIORITY, $sym54$BASIC_SUBLOOP_PROCESS_SET_PRIORITY_METHOD );
    methods.methods_incorporate_instance_method( $sym55$GET_STATUS, $sym10$BASIC_SUBLOOP_PROCESS, $list37, NIL, $list56 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym55$GET_STATUS, $sym57$BASIC_SUBLOOP_PROCESS_GET_STATUS_METHOD );
    methods.methods_incorporate_instance_method( $sym58$RUN, $sym10$BASIC_SUBLOOP_PROCESS, $list59, NIL, $list60 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym58$RUN, $sym68$BASIC_SUBLOOP_PROCESS_RUN_METHOD );
    methods.methods_incorporate_instance_method( $sym63$RUN_INTERNAL, $sym10$BASIC_SUBLOOP_PROCESS, $list69, NIL, $list70 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym63$RUN_INTERNAL, $sym71$BASIC_SUBLOOP_PROCESS_RUN_INTERNAL_METHOD );
    methods.methods_incorporate_instance_method( $sym72$SUSPEND, $sym10$BASIC_SUBLOOP_PROCESS, $list59, NIL, $list73 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym72$SUSPEND, $sym74$BASIC_SUBLOOP_PROCESS_SUSPEND_METHOD );
    methods.methods_incorporate_instance_method( $sym75$KILL, $sym10$BASIC_SUBLOOP_PROCESS, $list59, NIL, $list76 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym75$KILL, $sym77$BASIC_SUBLOOP_PROCESS_KILL_METHOD );
    methods.methods_incorporate_instance_method( $sym78$GET_OWNER, $sym10$BASIC_SUBLOOP_PROCESS, $list37, NIL, $list79 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym78$GET_OWNER, $sym80$BASIC_SUBLOOP_PROCESS_GET_OWNER_METHOD );
    methods.methods_incorporate_instance_method( $sym81$SET_OWNER, $sym10$BASIC_SUBLOOP_PROCESS, $list30, $list82, $list83 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym81$SET_OWNER, $sym86$BASIC_SUBLOOP_PROCESS_SET_OWNER_METHOD );
    methods.methods_incorporate_instance_method( $sym87$NOTHING_TO_DO_, $sym10$BASIC_SUBLOOP_PROCESS, $list30, NIL, $list70 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym87$NOTHING_TO_DO_, $sym88$BASIC_SUBLOOP_PROCESS_NOTHING_TO_DO__METHOD );
    methods.methods_incorporate_instance_method( $sym89$ENQUEUE_NOTIFY, $sym10$BASIC_SUBLOOP_PROCESS, $list59, $list90, $list91 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym89$ENQUEUE_NOTIFY, $sym92$BASIC_SUBLOOP_PROCESS_ENQUEUE_NOTIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym93$DEQUEUE_NOTIFY, $sym10$BASIC_SUBLOOP_PROCESS, $list59, $list90, $list94 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym93$DEQUEUE_NOTIFY, $sym95$BASIC_SUBLOOP_PROCESS_DEQUEUE_NOTIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym96$REMOVE_NOTIFY, $sym10$BASIC_SUBLOOP_PROCESS, $list30, $list90, $list97 );
    methods.subloop_register_instance_method( $sym10$BASIC_SUBLOOP_PROCESS, $sym96$REMOVE_NOTIFY, $sym98$BASIC_SUBLOOP_PROCESS_REMOVE_NOTIFY_METHOD );
    interfaces.new_interface( $sym99$MULTI_TASK_SCHEDULER, NIL, NIL, $list100 );
    classes.subloop_new_class( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym11$OBJECT, $list102, NIL, $list103 );
    classes.class_set_implements_slot_listeners( $sym101$BASIC_MULTI_TASK_SCHEDULER, NIL );
    classes.subloop_note_class_initialization_function( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym110$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym111$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_INSTANCE );
    subloop_reserved_initialize_basic_multi_task_scheduler_class( $sym101$BASIC_MULTI_TASK_SCHEDULER );
    methods.methods_incorporate_instance_method( $sym23$INITIALIZE, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list24, NIL, $list112 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym23$INITIALIZE, $sym115$BASIC_MULTI_TASK_SCHEDULER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym116$HALT, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list30, NIL, $list117 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym116$HALT, $sym119$BASIC_MULTI_TASK_SCHEDULER_HALT_METHOD );
    methods.methods_incorporate_instance_method( $sym120$START, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list30, NIL, $list121 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym120$START, $sym123$BASIC_MULTI_TASK_SCHEDULER_START_METHOD );
    methods.methods_incorporate_instance_method( $sym124$ADD_TASK, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list30, $list125, $list126 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym124$ADD_TASK, $sym129$BASIC_MULTI_TASK_SCHEDULER_ADD_TASK_METHOD );
    methods.methods_incorporate_instance_method( $sym130$KILL_TASK, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list37, $list125, $list131 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym130$KILL_TASK, $sym133$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_METHOD );
    methods.methods_incorporate_instance_method( $sym134$KILL_TASK_BY_NAME, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list37, $list135, $list136 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym134$KILL_TASK_BY_NAME, $sym137$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_BY_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym138$INTERRUPT_TASK, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list37, $list125, $list139 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym138$INTERRUPT_TASK, $sym141$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_METHOD );
    methods.methods_incorporate_instance_method( $sym142$INTERRUPT_TASK_BY_NAME, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list37, $list135, $list143 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym142$INTERRUPT_TASK_BY_NAME, $sym144$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_BY_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym145$GET_ALL_TASKS, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list37, NIL, $list146 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym145$GET_ALL_TASKS, $sym147$BASIC_MULTI_TASK_SCHEDULER_GET_ALL_TASKS_METHOD );
    methods.methods_incorporate_instance_method( $sym148$KILL_ALL_TASKS, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list37, NIL, $list149 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym148$KILL_ALL_TASKS, $sym150$BASIC_MULTI_TASK_SCHEDULER_KILL_ALL_TASKS_METHOD );
    methods.methods_incorporate_instance_method( $sym58$RUN, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list59, $list151, $list152 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym58$RUN, $sym157$BASIC_MULTI_TASK_SCHEDULER_RUN_METHOD );
    methods.methods_incorporate_instance_method( $sym158$GET_TRACE_MODE, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list37, NIL, $list159 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym158$GET_TRACE_MODE, $sym160$BASIC_MULTI_TASK_SCHEDULER_GET_TRACE_MODE_METHOD );
    methods.methods_incorporate_instance_method( $sym161$SET_TRACE_MODE, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list30, $list162, $list163 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym161$SET_TRACE_MODE, $sym165$BASIC_MULTI_TASK_SCHEDULER_SET_TRACE_MODE_METHOD );
    methods.methods_incorporate_instance_method( $sym154$PERFORM_TRACE, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list30, $list166, $list167 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym154$PERFORM_TRACE, $sym168$BASIC_MULTI_TASK_SCHEDULER_PERFORM_TRACE_METHOD );
    methods.methods_incorporate_instance_method( $sym87$NOTHING_TO_DO_, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list30, NIL, $list169 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym87$NOTHING_TO_DO_, $sym171$BASIC_MULTI_TASK_SCHEDULER_NOTHING_TO_DO__METHOD );
    methods.methods_incorporate_instance_method( $sym156$ON_NOTHING_TO_DO, $sym101$BASIC_MULTI_TASK_SCHEDULER, $list30, NIL, $list70 );
    methods.subloop_register_instance_method( $sym101$BASIC_MULTI_TASK_SCHEDULER, $sym156$ON_NOTHING_TO_DO, $sym172$BASIC_MULTI_TASK_SCHEDULER_ON_NOTHING_TO_DO_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subloop_processes_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subloop_processes_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subloop_processes_file();
  }
  static
  {
    me = new subloop_processes();
    $valid_subloop_process_status_types$ = null;
    $list0 = ConsesLow.list( makeKeyword( "UNKNOWN" ), makeKeyword( "ACTIVE" ), makeKeyword( "SUSPENDED" ), makeKeyword( "DEAD" ) );
    $sym1$SUBLOOP_PROCESS_STATUS_TYPE = makeSymbol( "SUBLOOP-PROCESS-STATUS-TYPE" );
    $str2$_S___S_is_not_a_member_of_the__S_ = makeString( "~S: ~S is not a member of the ~S enumeration." );
    $sym3$ENCODE_SUBLOOP_PROCESS_STATUS_TYPE = makeSymbol( "ENCODE-SUBLOOP-PROCESS-STATUS-TYPE" );
    $str4$_S___S_is_not_a_valid_encoding_of = makeString( "~S: ~S is not a valid encoding of the ~S enumeration." );
    $sym5$DECODE_SUBLOOP_PROCESS_STATUS_TYPE = makeSymbol( "DECODE-SUBLOOP-PROCESS-STATUS-TYPE" );
    $str6$_S___S_was_expected_to_be_a_membe = makeString( "~S: ~S was expected to be a member of the enumeration ~S." );
    $sym7$SUBLOOP_PROCESS_STATUS_TYPE_P = makeSymbol( "SUBLOOP-PROCESS-STATUS-TYPE-P" );
    $sym8$SUBLOOP_PROCESS = makeSymbol( "SUBLOOP-PROCESS" );
    $list9 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NAME" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "SET-NAME" ), ConsesLow.list( makeSymbol( "NEW-NAME" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PRIORITY" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PRIORITY" ), ConsesLow.list( makeSymbol( "NEW-PRIORITY" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "GET-STATUS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RUN" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "RUN-INTERNAL" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SUSPEND" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "KILL" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OWNER" ), NIL, makeKeyword(
          "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-OWNER" ), ConsesLow.list( makeSymbol( "NEW-SCHEDULER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "NOTHING-TO-DO?" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym10$BASIC_SUBLOOP_PROCESS = makeSymbol( "BASIC-SUBLOOP-PROCESS" );
    $sym11$OBJECT = makeSymbol( "OBJECT" );
    $list12 = ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS" ), makeSymbol( "QUEUE-ELEMENT-INTERFACE" ) );
    $list13 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "NAME" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PRIORITY" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "STATUS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "OWNER" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ),
                ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NAME" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-NAME" ), ConsesLow.list( makeSymbol( "NEW-NAME" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "GET-PRIORITY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PRIORITY" ), ConsesLow.list( makeSymbol( "NEW-PRIORITY" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-STATUS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RUN" ), NIL, makeKeyword(
          "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RUN-INTERNAL" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SUSPEND" ),
              NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "KILL" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                  "GET-OWNER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-OWNER" ), ConsesLow.list( makeSymbol( "NEW-SCHEDULER" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NOTHING-TO-DO?" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUE-NOTIFY" ), ConsesLow
          .list( makeSymbol( "QUEUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEQUEUE-NOTIFY" ), ConsesLow.list( makeSymbol( "QUEUE" ) ), makeKeyword(
              "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE-NOTIFY" ), ConsesLow.list( makeSymbol( "QUEUE" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym14$OWNER = makeSymbol( "OWNER" );
    $sym15$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym16$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-CLASS" );
    $sym17$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym18$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym19$NAME = makeSymbol( "NAME" );
    $sym20$PRIORITY = makeSymbol( "PRIORITY" );
    $sym21$STATUS = makeSymbol( "STATUS" );
    $sym22$SUBLOOP_RESERVED_INITIALIZE_BASIC_SUBLOOP_PROCESS_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-SUBLOOP-PROCESS-INSTANCE" );
    $sym23$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list24 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NAME" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "PRIORITY" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STATUS" ), makeKeyword( "UNKNOWN" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym26$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD" );
    $kw27$UNKNOWN = makeKeyword( "UNKNOWN" );
    $sym28$BASIC_SUBLOOP_PROCESS_INITIALIZE_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-INITIALIZE-METHOD" );
    $sym29$PRINT = makeSymbol( "PRINT" );
    $list30 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list31 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<BASIC-SUBLOOP-PROCESS: ~S, ~S>" ), makeSymbol(
        "NAME" ), makeSymbol( "STATUS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym33$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD" );
    $str34$__BASIC_SUBLOOP_PROCESS___S___S_ = makeString( "#<BASIC-SUBLOOP-PROCESS: ~S, ~S>" );
    $sym35$BASIC_SUBLOOP_PROCESS_PRINT_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-PRINT-METHOD" );
    $sym36$GET_NAME = makeSymbol( "GET-NAME" );
    $list37 = ConsesLow.list( makeKeyword( "READ-ONLY" ), makeKeyword( "PUBLIC" ) );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NAME" ) ) );
    $sym39$BASIC_SUBLOOP_PROCESS_GET_NAME_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-GET-NAME-METHOD" );
    $sym40$SET_NAME = makeSymbol( "SET-NAME" );
    $list41 = ConsesLow.list( makeSymbol( "NEW-NAME" ) );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NEW-NAME" ) ), ConsesLow.list( makeSymbol( "STRINGP" ),
        makeSymbol( "NEW-NAME" ) ) ), makeString( "(SET-NAME ~S): ~S is not a valid name.  A string or NIL was expected." ), makeSymbol( "SELF" ), makeSymbol( "NEW-NAME" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
            makeSymbol( "NAME" ), makeSymbol( "NEW-NAME" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-NAME" ) ) );
    $sym43$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD" );
    $str44$_SET_NAME__S____S_is_not_a_valid_ = makeString( "(SET-NAME ~S): ~S is not a valid name.  A string or NIL was expected." );
    $sym45$BASIC_SUBLOOP_PROCESS_SET_NAME_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-SET-NAME-METHOD" );
    $sym46$GET_PRIORITY = makeSymbol( "GET-PRIORITY" );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PRIORITY" ) ) );
    $sym48$BASIC_SUBLOOP_PROCESS_GET_PRIORITY_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-GET-PRIORITY-METHOD" );
    $sym49$SET_PRIORITY = makeSymbol( "SET-PRIORITY" );
    $list50 = ConsesLow.list( makeSymbol( "NEW-PRIORITY" ) );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "INTEGERP" ), makeSymbol( "NEW-PRIORITY" ) ), ConsesLow.list( makeSymbol( ">=" ),
        makeSymbol( "NEW-PRIORITY" ), ZERO_INTEGER ) ), makeString( "(SET-PRIORITY ~S): ~S is not a valid priority.  A non negative integer was expected." ), makeSymbol( "SELF" ), makeSymbol( "NEW-PRIORITY" ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRIORITY" ), makeSymbol( "NEW-PRIORITY" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-PRIORITY" ) ) );
    $sym52$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD" );
    $str53$_SET_PRIORITY__S____S_is_not_a_va = makeString( "(SET-PRIORITY ~S): ~S is not a valid priority.  A non negative integer was expected." );
    $sym54$BASIC_SUBLOOP_PROCESS_SET_PRIORITY_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-SET-PRIORITY-METHOD" );
    $sym55$GET_STATUS = makeSymbol( "GET-STATUS" );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "STATUS" ) ) );
    $sym57$BASIC_SUBLOOP_PROCESS_GET_STATUS_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-GET-STATUS-METHOD" );
    $sym58$RUN = makeSymbol( "RUN" );
    $list59 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PUBLIC" ) );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), makeKeyword( "ERROR" ) ) ), ConsesLow.list( makeSymbol( "CUNWIND-PROTECT" ), ConsesLow.list(
        makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "INLINE-SET-SLOT" ), ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol( "BASIC-SUBLOOP-PROCESS" ) ), makeSymbol( "SELF" ), makeKeyword( "ACTIVE" ) ), ConsesLow
            .list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RUN-INTERNAL" ) ) ) ),
        ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( EQ, makeSymbol( "RESULT" ), makeKeyword( "TERMINATED" ) ), ConsesLow.list( EQ, makeSymbol( "RESULT" ), makeKeyword(
            "KILLED" ) ), ConsesLow.list( EQ, makeSymbol( "RESULT" ), makeKeyword( "ERROR" ) ) ), ConsesLow.list( makeSymbol( "INLINE-SET-SLOT" ), ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol(
                "BASIC-SUBLOOP-PROCESS" ) ), makeSymbol( "SELF" ), makeKeyword( "DEAD" ) ), ConsesLow.list( makeSymbol( "INLINE-SET-SLOT" ), ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol(
                    "BASIC-SUBLOOP-PROCESS" ) ), makeSymbol( "SELF" ), makeKeyword( "SUSPENDED" ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-SET-SLOT" ), ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol(
                        "BASIC-SUBLOOP-PROCESS" ) ), makeSymbol( "SELF" ), makeKeyword( "ERROR" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $kw61$ERROR = makeKeyword( "ERROR" );
    $kw62$ACTIVE = makeKeyword( "ACTIVE" );
    $sym63$RUN_INTERNAL = makeSymbol( "RUN-INTERNAL" );
    $kw64$TERMINATED = makeKeyword( "TERMINATED" );
    $kw65$KILLED = makeKeyword( "KILLED" );
    $kw66$DEAD = makeKeyword( "DEAD" );
    $kw67$SUSPENDED = makeKeyword( "SUSPENDED" );
    $sym68$BASIC_SUBLOOP_PROCESS_RUN_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-RUN-METHOD" );
    $list69 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PROTECTED" ) );
    $list70 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym71$BASIC_SUBLOOP_PROCESS_RUN_INTERNAL_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-RUN-INTERNAL-METHOD" );
    $sym72$SUSPEND = makeSymbol( "SUSPEND" );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STATUS" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "STATUS" ),
        makeSymbol( "BASIC-SUBLOOP-PROCESS" ) ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "STATUS" ), ConsesLow.list( makeKeyword( "DEAD" ), ConsesLow.list( makeSymbol( "RET" ),
            makeSymbol( "STATUS" ) ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-SET-SLOT" ), ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol( "BASIC-SUBLOOP-PROCESS" ) ), makeSymbol( "SELF" ), makeKeyword(
                "SUSPENDED" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OWNER" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "OWNER" ),
                    makeSymbol( "BASIC-SUBLOOP-PROCESS" ) ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "OWNER" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                        makeSymbol( "REMOVE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "OWNER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym74$BASIC_SUBLOOP_PROCESS_SUSPEND_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-SUSPEND-METHOD" );
    $sym75$KILL = makeSymbol( "KILL" );
    $list76 = ConsesLow.list( ConsesLow.list( makeSymbol( "INLINE-SET-SLOT" ), ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol( "BASIC-SUBLOOP-PROCESS" ) ), makeSymbol( "SELF" ), makeKeyword( "KILLED" ) ), ConsesLow
        .list( makeSymbol( "RET" ), NIL ) );
    $sym77$BASIC_SUBLOOP_PROCESS_KILL_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-KILL-METHOD" );
    $sym78$GET_OWNER = makeSymbol( "GET-OWNER" );
    $list79 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OWNER" ) ) );
    $sym80$BASIC_SUBLOOP_PROCESS_GET_OWNER_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-GET-OWNER-METHOD" );
    $sym81$SET_OWNER = makeSymbol( "SET-OWNER" );
    $list82 = ConsesLow.list( makeSymbol( "NEW-SCHEDULER" ) );
    $list83 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NEW-SCHEDULER" ) ), ConsesLow.list( makeSymbol(
        "MULTI-TASK-SCHEDULER-P" ), makeSymbol( "NEW-SCHEDULER" ) ) ), makeString( "(SET-OWNER ~S): ~S is not an instance of MULTI-TASK-SCHEDULER." ), makeSymbol( "SELF" ), makeSymbol( "NEW-SCHEDULER" ) ), ConsesLow
            .list( makeSymbol( "CSETQ" ), makeSymbol( "OWNER" ), makeSymbol( "NEW-SCHEDULER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-SCHEDULER" ) ) );
    $sym84$OUTER_CATCH_FOR_BASIC_SUBLOOP_PROCESS_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SUBLOOP-PROCESS-METHOD" );
    $str85$_SET_OWNER__S____S_is_not_an_inst = makeString( "(SET-OWNER ~S): ~S is not an instance of MULTI-TASK-SCHEDULER." );
    $sym86$BASIC_SUBLOOP_PROCESS_SET_OWNER_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-SET-OWNER-METHOD" );
    $sym87$NOTHING_TO_DO_ = makeSymbol( "NOTHING-TO-DO?" );
    $sym88$BASIC_SUBLOOP_PROCESS_NOTHING_TO_DO__METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-NOTHING-TO-DO?-METHOD" );
    $sym89$ENQUEUE_NOTIFY = makeSymbol( "ENQUEUE-NOTIFY" );
    $list90 = ConsesLow.list( makeSymbol( "QUEUE" ) );
    $list91 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "QUEUE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym92$BASIC_SUBLOOP_PROCESS_ENQUEUE_NOTIFY_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-ENQUEUE-NOTIFY-METHOD" );
    $sym93$DEQUEUE_NOTIFY = makeSymbol( "DEQUEUE-NOTIFY" );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "QUEUE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STATUS" ), ConsesLow.list( makeSymbol(
        "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol( "BASIC-SUBLOOP-PROCESS" ) ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol( "STATUS" ),
            makeKeyword( "DEAD" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "RUN" ),
                makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( EQ, makeSymbol( "RESULT" ), makeKeyword( "TERMINATED" ) ), ConsesLow.list( EQ,
                    makeSymbol( "RESULT" ), makeKeyword( "KILLED" ) ), ConsesLow.list( EQ, makeSymbol( "RESULT" ), makeKeyword( "ERROR" ) ) ), ConsesLow.list( makeSymbol( "KILL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
                        .list( makeSymbol( "RET" ), NIL ) );
    $sym95$BASIC_SUBLOOP_PROCESS_DEQUEUE_NOTIFY_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-DEQUEUE-NOTIFY-METHOD" );
    $sym96$REMOVE_NOTIFY = makeSymbol( "REMOVE-NOTIFY" );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "QUEUE" ) ), ConsesLow.list( makeSymbol( "KILL" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym98$BASIC_SUBLOOP_PROCESS_REMOVE_NOTIFY_METHOD = makeSymbol( "BASIC-SUBLOOP-PROCESS-REMOVE-NOTIFY-METHOD" );
    $sym99$MULTI_TASK_SCHEDULER = makeSymbol( "MULTI-TASK-SCHEDULER" );
    $list100 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-TASK" ), ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow
        .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "KILL-TASK" ), ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "KILL-TASK-BY-NAME" ), ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS-NAME" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INTERRUPT-TASK" ),
                ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INTERRUPT-TASK-BY-NAME" ), ConsesLow.list( makeSymbol(
                    "SUBLOOP-PROCESS-NAME" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ALL-TASKS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "KILL-ALL-TASKS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RUN" ), ConsesLow.list( makeSymbol(
                            "&OPTIONAL" ), ConsesLow.list( makeSymbol( "EXPIRATION-DELTA" ), NIL ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TRACE-MODE" ), NIL,
                                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-TRACE-MODE" ), ConsesLow.list( makeSymbol( "NEW-TRACE-MODE" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PERFORM-TRACE" ), ConsesLow.list( makeSymbol( "PROCESS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "NOTHING-TO-DO?" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym101$BASIC_MULTI_TASK_SCHEDULER = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER" );
    $list102 = ConsesLow.list( makeSymbol( "MULTI-TASK-SCHEDULER" ) );
    $list103 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "TRANSFER-QUEUE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PROCESS-QUEUE" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "HALTED-P" ), makeKeyword( "BOOLEAN" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TRACE-P" ),
            makeKeyword( "BOOLEAN" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow
                .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HALT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "START" ), NIL, makeKeyword(
                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-TASK" ), ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "KILL-TASK" ), ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "KILL-TASK-BY-NAME" ), ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS-NAME" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INTERRUPT-TASK" ),
                                ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INTERRUPT-TASK-BY-NAME" ), ConsesLow.list(
                                    makeSymbol( "SUBLOOP-PROCESS-NAME" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ALL-TASKS" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "KILL-ALL-TASKS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RUN" ), ConsesLow.list(
          makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "EXPIRATION-DELTA" ), NIL ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TRACE-MODE" ), NIL,
              makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-TRACE-MODE" ), ConsesLow.list( makeSymbol( "NEW-TRACE-MODE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                  makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PERFORM-TRACE" ), ConsesLow.list( makeSymbol( "PROCESS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                      "NOTHING-TO-DO?" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-NOTHING-TO-DO" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym104$PROCESS_QUEUE = makeSymbol( "PROCESS-QUEUE" );
    $sym105$TRANSFER_QUEUE = makeSymbol( "TRANSFER-QUEUE" );
    $sym106$TRACE_P = makeSymbol( "TRACE-P" );
    $int107$4098 = makeInteger( 4098 );
    $sym108$HALTED_P = makeSymbol( "HALTED-P" );
    $int109$4097 = makeInteger( 4097 );
    $sym110$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-CLASS" );
    $sym111$SUBLOOP_RESERVED_INITIALIZE_BASIC_MULTI_TASK_SCHEDULER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-MULTI-TASK-SCHEDULER-INSTANCE" );
    $list112 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TRANSFER-QUEUE" ), ConsesLow.list( makeSymbol(
        "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-PASSIVE" ),
            makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "TRANSFER-QUEUE" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROCESS-QUEUE" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ),
                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "HALTED-P" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ),
                    makeSymbol( "TRACE-P" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym113$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD" );
    $sym114$BASIC_DOUBLY_LINKED_QUEUE = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" );
    $sym115$BASIC_MULTI_TASK_SCHEDULER_INITIALIZE_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-INITIALIZE-METHOD" );
    $sym116$HALT = makeSymbol( "HALT" );
    $list117 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "HALTED-P" ), T ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym118$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD" );
    $sym119$BASIC_MULTI_TASK_SCHEDULER_HALT_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-HALT-METHOD" );
    $sym120$START = makeSymbol( "START" );
    $list121 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "HALTED-P" ), NIL ), ConsesLow.list( makeSymbol( "RUN" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym122$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD" );
    $sym123$BASIC_MULTI_TASK_SCHEDULER_START_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-START-METHOD" );
    $sym124$ADD_TASK = makeSymbol( "ADD-TASK" );
    $list125 = ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS" ) );
    $list126 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS-P" ), makeSymbol( "SUBLOOP-PROCESS" ) ), makeString( "(ADD-TASK ~S): ~S is not a SubLOOP process." ),
        makeSymbol( "SELF" ), makeSymbol( "SUBLOOP-PROCESS" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ENQUEUE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol(
            "PROCESS-QUEUE" ), makeSymbol( "SUBLOOP-PROCESS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SUBLOOP-PROCESS" ) ) );
    $sym127$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD" );
    $str128$_ADD_TASK__S____S_is_not_a_SubLOO = makeString( "(ADD-TASK ~S): ~S is not a SubLOOP process." );
    $sym129$BASIC_MULTI_TASK_SCHEDULER_ADD_TASK_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-ADD-TASK-METHOD" );
    $sym130$KILL_TASK = makeSymbol( "KILL-TASK" );
    $list131 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS-P" ), makeSymbol( "SUBLOOP-PROCESS" ) ), makeString( "(KILL-TASK ~S): ~S is not a SubLOOP process." ),
        makeSymbol( "SELF" ), makeSymbol( "SUBLOOP-PROCESS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ENQUEUED-P" ), makeSymbol(
            "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ), makeSymbol( "SUBLOOP-PROCESS" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "REMOVE" ), makeSymbol(
                "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ), makeSymbol( "SUBLOOP-PROCESS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SUBLOOP-PROCESS" ) ) ), ConsesLow.list( makeSymbol(
                    "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "REMOVE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "TRANSFER-QUEUE" ), makeSymbol( "SUBLOOP-PROCESS" ) ), ConsesLow.list( makeSymbol(
                        "RET" ), NIL ) );
    $str132$_KILL_TASK__S____S_is_not_a_SubLO = makeString( "(KILL-TASK ~S): ~S is not a SubLOOP process." );
    $sym133$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-METHOD" );
    $sym134$KILL_TASK_BY_NAME = makeSymbol( "KILL-TASK-BY-NAME" );
    $list135 = ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS-NAME" ) );
    $list136 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), ConsesLow.list( makeSymbol( "RESOLVE-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-NAME" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-SUBLOOP-PROCESS" ) ) ) ), ConsesLow.list( makeSymbol( "TASK" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
            "FIND" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ), makeSymbol( "SUBLOOP-PROCESS-NAME" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ), makeSymbol( "KEY" ) ) ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TASK" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "REMOVE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol(
            "PROCESS-QUEUE" ), makeSymbol( "SUBLOOP-PROCESS-NAME" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASK" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASK" ), ConsesLow.list(
                makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "FIND" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "TRANSFER-QUEUE" ), makeSymbol( "SUBLOOP-PROCESS-NAME" ), ConsesLow.list(
                    makeSymbol( "FUNCTION" ), EQUAL ), makeSymbol( "KEY" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TASK" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                        "REMOVE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "TRANSFER-QUEUE" ), makeSymbol( "TASK" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASK" ) ) ), ConsesLow.list(
                            makeSymbol( "RET" ), NIL ) ) );
    $sym137$BASIC_MULTI_TASK_SCHEDULER_KILL_TASK_BY_NAME_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-KILL-TASK-BY-NAME-METHOD" );
    $sym138$INTERRUPT_TASK = makeSymbol( "INTERRUPT-TASK" );
    $list139 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SUBLOOP-PROCESS-P" ), makeSymbol( "SUBLOOP-PROCESS" ) ), makeString(
        "(INTERRUPT-TASK ~S): ~S is not a SubLOOP process." ), makeSymbol( "SELF" ), makeSymbol( "SUBLOOP-PROCESS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow
            .list( makeSymbol( "ENQUEUED-P" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ), makeSymbol( "SUBLOOP-PROCESS" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                makeSymbol( "REMOVE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ), makeSymbol( "SUBLOOP-PROCESS" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                    makeSymbol( "ENQUEUE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "TRANSFER-QUEUE" ), makeSymbol( "SUBLOOP-PROCESS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                        "SUBLOOP-PROCESS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str140$_INTERRUPT_TASK__S____S_is_not_a_ = makeString( "(INTERRUPT-TASK ~S): ~S is not a SubLOOP process." );
    $sym141$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-METHOD" );
    $sym142$INTERRUPT_TASK_BY_NAME = makeSymbol( "INTERRUPT-TASK-BY-NAME" );
    $list143 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), ConsesLow.list( makeSymbol( "RESOLVE-METHOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "GET-NAME" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-SUBLOOP-PROCESS" ) ) ) ), ConsesLow.list( makeSymbol( "TASK" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
            "FIND" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ), makeSymbol( "SUBLOOP-PROCESS-NAME" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ), makeSymbol( "KEY" ) ) ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TASK" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "REMOVE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol(
            "PROCESS-QUEUE" ), makeSymbol( "TASK" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ENQUEUE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "TRANSFER-QUEUE" ),
                makeSymbol( "TASK" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASK" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym144$BASIC_MULTI_TASK_SCHEDULER_INTERRUPT_TASK_BY_NAME_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-INTERRUPT-TASK-BY-NAME-METHOD" );
    $sym145$GET_ALL_TASKS = makeSymbol( "GET-ALL-TASKS" );
    $list146 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NCONC" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol(
        "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ),
            makeSymbol( "TRANSFER-QUEUE" ) ) ) ) );
    $sym147$BASIC_MULTI_TASK_SCHEDULER_GET_ALL_TASKS_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-GET-ALL-TASKS-METHOD" );
    $sym148$KILL_ALL_TASKS = makeSymbol( "KILL-ALL-TASKS" );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALL-TASKS" ), ConsesLow.list( makeSymbol( "GET-ALL-TASKS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
        makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "ALL-TASKS" ) ), ConsesLow.list( makeSymbol( "KILL-TASK" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ) ) ) ), ConsesLow.list( makeSymbol(
            "RET" ), NIL ) );
    $sym150$BASIC_MULTI_TASK_SCHEDULER_KILL_ALL_TASKS_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-KILL-ALL-TASKS-METHOD" );
    $list151 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "EXPIRATION-DELTA" ), NIL ) );
    $list152 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "EXPIRATION-DELTA" ) ), ConsesLow.list( makeSymbol( "CAND" ),
        ConsesLow.list( makeSymbol( "INTEGERP" ), makeSymbol( "EXPIRATION-DELTA" ) ) ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "EXPIRATION-DELTA" ), ZERO_INTEGER ) ), makeString(
            "(RUN ~S): ~S is not a valid expiration-delta.  NIL or a non negative integer was expected." ), makeSymbol( "SELF" ), makeSymbol( "EXPIRATION-DELTA" ) ), ConsesLow.list( makeSymbol( "INLINE-SET-SLOT" ),
                ConsesLow.list( makeSymbol( "HALTED-P" ), makeSymbol( "BASIC-MULTI-TASK-SCHEDULER" ) ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                    "TRANSFER-QUEUE" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "TRANSFER-QUEUE" ), makeSymbol( "BASIC-MULTI-TASK-SCHEDULER" ) ), makeSymbol( "SELF" ) ) ), ConsesLow
                        .list( makeSymbol( "PROCESS-QUEUE" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "PROCESS-QUEUE" ), makeSymbol( "BASIC-MULTI-TASK-SCHEDULER" ) ), makeSymbol(
                            "SELF" ) ) ), makeSymbol( "CURRENT-PROCESS" ) ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "TRANSFER-QUEUE" ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol(
                                "EXPIRATION-DELTA" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "START-TIME" ), ConsesLow.list( makeSymbol( "GET-UNIVERSAL-TIME" ) ) ), ConsesLow
                                    .list( makeSymbol( "STOP-TIME" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "START-TIME" ), makeSymbol( "EXPIRATION-DELTA" ) ) ) ), ConsesLow.list( makeSymbol(
                                        "INLINE-SET-SLOT" ), ConsesLow.list( makeSymbol( "HALTED-P" ), makeSymbol( "BASIC-MULTI-TASK-SCHEDULER" ) ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol(
                                            "STOP-TIME" ), ConsesLow.list( makeSymbol( "GET-UNIVERSAL-TIME" ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
                                                makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "HALTED-P" ), makeSymbol( "BASIC-MULTI-TASK-SCHEDULER" ) ), makeSymbol(
                                                    "SELF" ) ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "EMPTY-P" ), makeSymbol(
                                                        "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-PROCESS" ), ConsesLow.list(
                                                            makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "DEQUEUE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ) ) ),
                                                ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "TRACE-P" ), makeSymbol(
                                                    "BASIC-MULTI-TASK-SCHEDULER" ) ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                                        "QUOTE" ), makeSymbol( "PERFORM-TRACE" ) ), makeSymbol( "CURRENT-PROCESS" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER" ),
                                                            ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol( "BASIC-SUBLOOP-PROCESS" ) ), makeSymbol(
                                                                "CURRENT-PROCESS" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "DEAD" ), makeKeyword( "KILLED" ), makeKeyword(
                                                                    "TERMINATED" ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ENQUEUE" ), makeSymbol(
                                                                        "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ), makeSymbol( "CURRENT-PROCESS" ) ) ), ConsesLow.list( makeSymbol(
                                                                            "INLINE-SET-SLOT" ), ConsesLow.list( makeSymbol( "HALTED-P" ), makeSymbol( "BASIC-MULTI-TASK-SCHEDULER" ) ), makeSymbol( "SELF" ), ConsesLow
                                                                                .list( makeSymbol( ">=" ), makeSymbol( "STOP-TIME" ), ConsesLow.list( makeSymbol( "GET-UNIVERSAL-TIME" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                    "PWHEN" ), ConsesLow.list( makeSymbol( "NOTHING-TO-DO?" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
                                                                                        "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                            "ON-NOTHING-TO-DO" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
                                                                                                makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "HALTED-P" ), makeSymbol(
                                                                                                    "BASIC-MULTI-TASK-SCHEDULER" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list(
                                                                                                        makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "EMPTY-P" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ),
                                                                                                        makeSymbol( "PROCESS-QUEUE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-PROCESS" ),
                                                                                                            ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "DEQUEUE" ), makeSymbol(
                                                                                                                "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                                                                                                    ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "TRACE-P" ), makeSymbol(
                                                                                                                        "BASIC-MULTI-TASK-SCHEDULER" ) ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
                                                                                                                            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                                                makeSymbol( "PERFORM-TRACE" ) ), makeSymbol( "CURRENT-PROCESS" ) ) ), ConsesLow.list(
                                                                                                                                    makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list(
                                                                                                                                        makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "STATUS" ), makeSymbol(
                                                                                                                                            "BASIC-SUBLOOP-PROCESS" ) ), makeSymbol( "CURRENT-PROCESS" ) ), ConsesLow.list(
                                                                                                                                                makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "DEAD" ), makeKeyword(
                                                                                                                                                    "KILLED" ), makeKeyword( "TERMINATED" ) ) ) ), ConsesLow.list(
                                                                                                                                                        makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                                                                                                                                                            "ENQUEUE" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ),
                                                                                                                                                        makeSymbol( "PROCESS-QUEUE" ), makeSymbol( "CURRENT-PROCESS" ) ) ),
                                                                                                ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NOTHING-TO-DO?" ), makeSymbol( "SELF" ) ), ConsesLow
                                                                                                    .list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                        "ON-NOTHING-TO-DO" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str153$_RUN__S____S_is_not_a_valid_expir = makeString( "(RUN ~S): ~S is not a valid expiration-delta.  NIL or a non negative integer was expected." );
    $sym154$PERFORM_TRACE = makeSymbol( "PERFORM-TRACE" );
    $list155 = ConsesLow.list( makeKeyword( "DEAD" ), makeKeyword( "KILLED" ), makeKeyword( "TERMINATED" ) );
    $sym156$ON_NOTHING_TO_DO = makeSymbol( "ON-NOTHING-TO-DO" );
    $sym157$BASIC_MULTI_TASK_SCHEDULER_RUN_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-RUN-METHOD" );
    $sym158$GET_TRACE_MODE = makeSymbol( "GET-TRACE-MODE" );
    $list159 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TRACE-P" ) ) );
    $sym160$BASIC_MULTI_TASK_SCHEDULER_GET_TRACE_MODE_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-GET-TRACE-MODE-METHOD" );
    $sym161$SET_TRACE_MODE = makeSymbol( "SET-TRACE-MODE" );
    $list162 = ConsesLow.list( makeSymbol( "NEW-TRACE-MODE" ) );
    $list163 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TRACE-P" ), makeSymbol( "NEW-TRACE-MODE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-TRACE-MODE" ) ) );
    $sym164$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD" );
    $sym165$BASIC_MULTI_TASK_SCHEDULER_SET_TRACE_MODE_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-SET-TRACE-MODE-METHOD" );
    $list166 = ConsesLow.list( makeSymbol( "PROCESS" ) );
    $list167 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "PROCESS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym168$BASIC_MULTI_TASK_SCHEDULER_PERFORM_TRACE_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-PERFORM-TRACE-METHOD" );
    $list169 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUEUE-CONTENTS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
        "GET-CONTENTS" ), makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" ) ), makeSymbol( "PROCESS-QUEUE" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PROCESS" ), makeSymbol(
            "QUEUE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROCESS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "NOTHING-TO-DO?" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym170$OUTER_CATCH_FOR_BASIC_MULTI_TASK_SCHEDULER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-MULTI-TASK-SCHEDULER-METHOD" );
    $sym171$BASIC_MULTI_TASK_SCHEDULER_NOTHING_TO_DO__METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-NOTHING-TO-DO?-METHOD" );
    $sym172$BASIC_MULTI_TASK_SCHEDULER_ON_NOTHING_TO_DO_METHOD = makeSymbol( "BASIC-MULTI-TASK-SCHEDULER-ON-NOTHING-TO-DO-METHOD" );
  }
}
/*
 * 
 * Total time: 566 ms
 * 
 */