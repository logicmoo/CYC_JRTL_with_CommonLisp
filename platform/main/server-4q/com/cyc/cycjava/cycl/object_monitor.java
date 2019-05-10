package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class object_monitor
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.object_monitor";
  public static final String myFingerPrint = "be2f481145cdff76f4ce8ebb7c19afc6194b6e10bbe957f5eb3ebf06eac1f412";
  private static final SubLSymbol $sym0$OBJECT_MONITOR;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$TAB_STRING;
  private static final SubLSymbol $sym4$NESTING_DEPTH;
  private static final SubLSymbol $sym5$SUBJECTS;
  private static final SubLInteger $int6$4097;
  private static final SubLSymbol $sym7$INSTANCE_COUNT;
  private static final SubLSymbol $sym8$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_CLASS;
  private static final SubLSymbol $sym9$ISOLATED_P;
  private static final SubLSymbol $sym10$MONITORING_P;
  private static final SubLSymbol $sym11$INSTANCE_NUMBER;
  private static final SubLSymbol $sym12$STREAM;
  private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_INSTANCE;
  private static final SubLSymbol $sym14$INITIALIZE;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
  private static final SubLString $str17$____;
  private static final SubLSymbol $sym18$OBJECT_MONITOR_INITIALIZE_METHOD;
  private static final SubLSymbol $sym19$TAB_TO_DEPTH;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
  private static final SubLSymbol $sym22$OBJECT_MONITOR_TAB_TO_DEPTH_METHOD;
  private static final SubLSymbol $sym23$MONITOR_SET_SLOT;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
  private static final SubLString $str27$__;
  private static final SubLString $str28$_SET_SLOT__S__S__S_;
  private static final SubLSymbol $kw29$UNKNOWN_SLOT;
  private static final SubLSymbol $sym30$OBJECT_MONITOR_MONITOR_SET_SLOT_METHOD;
  private static final SubLSymbol $sym31$MONITOR_BEFORE_METHOD;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLString $str35$Entered____S__S___S;
  private static final SubLString $str36$Entered___S__S;
  private static final SubLString $str37$Arg___S____S;
  private static final SubLSymbol $sym38$OBJECT_MONITOR_MONITOR_BEFORE_METHOD_METHOD;
  private static final SubLSymbol $sym39$MONITOR_AFTER_METHOD;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLString $str42$Returning____S__S___S_____S;
  private static final SubLString $str43$Returning___S__S_____S;
  private static final SubLSymbol $sym44$OBJECT_MONITOR_MONITOR_AFTER_METHOD_METHOD;
  private static final SubLSymbol $sym45$MONITOR;
  private static final SubLList $list46;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
  private static final SubLSymbol $sym49$OBJECT_MONITOR_MONITOR_METHOD;
  private static final SubLSymbol $sym50$UNMONITOR;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
  private static final SubLSymbol $sym53$OBJECT_MONITOR_UNMONITOR_METHOD;
  private static final SubLSymbol $sym54$MONITOR_INSTANCE;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$OBJECT_MONITOR_MONITOR_INSTANCE_METHOD;
  private static final SubLSymbol $sym57$START_MONITORING;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
  private static final SubLSymbol $sym60$OBJECT_MONITOR_START_MONITORING_METHOD;
  private static final SubLSymbol $sym61$STOP_MONITORING;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
  private static final SubLSymbol $sym64$OBJECT_MONITOR_STOP_MONITORING_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject get_object_monitor_tab_string(final SubLObject v_object_monitor)
  {
    return classes.subloop_get_access_protected_instance_slot( v_object_monitor, FOUR_INTEGER, $sym3$TAB_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject set_object_monitor_tab_string(final SubLObject v_object_monitor, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_object_monitor, value, FOUR_INTEGER, $sym3$TAB_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject get_object_monitor_nesting_depth(final SubLObject v_object_monitor)
  {
    return classes.subloop_get_access_protected_instance_slot( v_object_monitor, THREE_INTEGER, $sym4$NESTING_DEPTH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject set_object_monitor_nesting_depth(final SubLObject v_object_monitor, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_object_monitor, value, THREE_INTEGER, $sym4$NESTING_DEPTH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject get_object_monitor_stream(final SubLObject v_object_monitor)
  {
    return classes.subloop_get_instance_slot( v_object_monitor, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject set_object_monitor_stream(final SubLObject v_object_monitor, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_object_monitor, value, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject get_object_monitor_subjects(final SubLObject v_object_monitor)
  {
    return classes.subloop_get_access_protected_instance_slot( v_object_monitor, ONE_INTEGER, $sym5$SUBJECTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject set_object_monitor_subjects(final SubLObject v_object_monitor, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_object_monitor, value, ONE_INTEGER, $sym5$SUBJECTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject get_object_monitor_monitoring_p(final SubLObject v_object_monitor)
  {
    return classes.ldb_test( $int6$4097, subloop_structures.instance_boolean_slots( v_object_monitor ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject set_object_monitor_monitoring_p(final SubLObject v_object_monitor, final SubLObject value)
  {
    subloop_structures._csetf_instance_boolean_slots( v_object_monitor, bytes.dpb( ( NIL != value ) ? ONE_INTEGER : ZERO_INTEGER, $int6$4097, subloop_structures.instance_boolean_slots( v_object_monitor ) ) );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject subloop_reserved_initialize_object_monitor_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject subloop_reserved_initialize_object_monitor_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$OBJECT_MONITOR, $sym10$MONITORING_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym11$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$OBJECT_MONITOR, $sym5$SUBJECTS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$OBJECT_MONITOR, $sym12$STREAM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$OBJECT_MONITOR, $sym4$NESTING_DEPTH, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$OBJECT_MONITOR, $sym3$TAB_STRING, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
  public static SubLObject object_monitor_p(final SubLObject v_object_monitor)
  {
    return classes.subloop_instanceof_class( v_object_monitor, $sym0$OBJECT_MONITOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 3675L)
  public static SubLObject object_monitor_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_object_monitor_method = NIL;
    SubLObject tab_string = get_object_monitor_tab_string( self );
    SubLObject nesting_depth = get_object_monitor_nesting_depth( self );
    SubLObject stream = get_object_monitor_stream( self );
    SubLObject subjects = get_object_monitor_subjects( self );
    SubLObject monitoring_p = get_object_monitor_monitoring_p( self );
    try
    {
      thread.throwStack.push( $sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
      try
      {
        object.object_initialize_method( self );
        monitoring_p = NIL;
        subjects = NIL;
        stream = T;
        nesting_depth = ZERO_INTEGER;
        tab_string = $str17$____;
        Dynamic.sublisp_throw( $sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_object_monitor_tab_string( self, tab_string );
          set_object_monitor_nesting_depth( self, nesting_depth );
          set_object_monitor_stream( self, stream );
          set_object_monitor_subjects( self, subjects );
          set_object_monitor_monitoring_p( self, monitoring_p );
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
      catch_var_for_object_monitor_method = Errors.handleThrowable( ccatch_env_var, $sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_object_monitor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 4116L)
  public static SubLObject object_monitor_tab_to_depth_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_object_monitor_method = NIL;
    final SubLObject tab_string = get_object_monitor_tab_string( self );
    final SubLObject nesting_depth = get_object_monitor_nesting_depth( self );
    final SubLObject stream = get_object_monitor_stream( self );
    try
    {
      thread.throwStack.push( $sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
      try
      {
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( nesting_depth ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          PrintLow.format( stream, tab_string );
        }
        Dynamic.sublisp_throw( $sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_object_monitor_tab_string( self, tab_string );
          set_object_monitor_nesting_depth( self, nesting_depth );
          set_object_monitor_stream( self, stream );
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
      catch_var_for_object_monitor_method = Errors.handleThrowable( ccatch_env_var, $sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_object_monitor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 4246L)
  public static SubLObject object_monitor_monitor_set_slot_method(final SubLObject self, final SubLObject target, final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_object_monitor_method = NIL;
    final SubLObject stream = get_object_monitor_stream( self );
    try
    {
      thread.throwStack.push( $sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
      try
      {
        PrintLow.format( stream, $str27$__ );
        object_monitor_tab_to_depth_method( self );
        PrintLow.format( stream, $str28$_SET_SLOT__S__S__S_, new SubLObject[] { target, ( NIL != slot_listeners.$active_slot_listener$.getDynamicValue( thread ) && NIL != subloop_structures.slot_listener_p(
            slot_listeners.$active_slot_listener$.getDynamicValue( thread ) ) ) ? subloop_structures.sl_slot_name( slot_listeners.$active_slot_listener$.getDynamicValue( thread ) ) : $kw29$UNKNOWN_SLOT, new_value
        } );
        Dynamic.sublisp_throw( $sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_object_monitor_stream( self, stream );
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
      catch_var_for_object_monitor_method = Errors.handleThrowable( ccatch_env_var, $sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_object_monitor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 4743L)
  public static SubLObject object_monitor_monitor_before_method_method(final SubLObject self, final SubLObject instance_or_class, final SubLObject owning_method_name, SubLObject args)
  {
    SubLObject nesting_depth = get_object_monitor_nesting_depth( self );
    final SubLObject stream = get_object_monitor_stream( self );
    PrintLow.format( stream, $str27$__ );
    object_monitor_tab_to_depth_method( self );
    SubLObject filtered_lambda_list = method_listeners.method_listeners_filtered_lambda_list( instance_or_class, owning_method_name );
    SubLObject current_var = NIL;
    SubLObject current_arg = NIL;
    if( NIL != subloop_structures.instance_p( instance_or_class ) )
    {
      final SubLObject class_of_instance = subloop_structures.instance_class( instance_or_class );
      PrintLow.format( stream, $str35$Entered____S__S___S, new SubLObject[] { owning_method_name, subloop_structures.class_name( class_of_instance ), ConsesLow.cons( instance_or_class, args )
      } );
    }
    else if( NIL != subloop_structures.class_p( instance_or_class ) )
    {
      PrintLow.format( stream, $str35$Entered____S__S___S, new SubLObject[] { owning_method_name, subloop_structures.class_name( instance_or_class ), args
      } );
    }
    else
    {
      PrintLow.format( stream, $str36$Entered___S__S, owning_method_name, ConsesLow.cons( owning_method_name, args ) );
    }
    while ( NIL != filtered_lambda_list && NIL != args)
    {
      PrintLow.format( stream, $str27$__ );
      object_monitor_tab_to_depth_method( self );
      current_var = filtered_lambda_list.first();
      current_arg = args.first();
      PrintLow.format( stream, $str37$Arg___S____S, current_var, current_arg );
      filtered_lambda_list = filtered_lambda_list.rest();
      args = args.rest();
    }
    nesting_depth = Numbers.add( nesting_depth, ONE_INTEGER );
    set_object_monitor_nesting_depth( self, nesting_depth );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 5904L)
  public static SubLObject object_monitor_monitor_after_method_method(final SubLObject self, final SubLObject instance_or_class, final SubLObject owning_method_name, final SubLObject args, final SubLObject result)
  {
    SubLObject nesting_depth = get_object_monitor_nesting_depth( self );
    final SubLObject stream = get_object_monitor_stream( self );
    nesting_depth = Numbers.subtract( nesting_depth, ONE_INTEGER );
    set_object_monitor_nesting_depth( self, nesting_depth );
    PrintLow.format( stream, $str27$__ );
    object_monitor_tab_to_depth_method( self );
    if( NIL != subloop_structures.instance_p( instance_or_class ) )
    {
      final SubLObject class_of_instance = subloop_structures.instance_class( instance_or_class );
      PrintLow.format( stream, $str42$Returning____S__S___S_____S, new SubLObject[] { owning_method_name, subloop_structures.class_name( class_of_instance ), ConsesLow.cons( instance_or_class, args ), result
      } );
    }
    else if( NIL != subloop_structures.class_p( instance_or_class ) )
    {
      PrintLow.format( stream, $str42$Returning____S__S___S_____S, new SubLObject[] { owning_method_name, subloop_structures.class_name( instance_or_class ), args, result
      } );
    }
    else
    {
      PrintLow.format( stream, $str43$Returning___S__S_____S, new SubLObject[] { owning_method_name, ConsesLow.cons( owning_method_name, args ), result
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 6635L)
  public static SubLObject object_monitor_monitor_method(final SubLObject self, final SubLObject target)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_object_monitor_method = NIL;
    SubLObject subjects = get_object_monitor_subjects( self );
    final SubLObject monitoring_p = get_object_monitor_monitoring_p( self );
    try
    {
      thread.throwStack.push( $sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( target ) )
        {
          if( NIL == conses_high.member( target, subjects, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            subjects = ConsesLow.cons( target, subjects );
          }
          if( NIL != monitoring_p )
          {
            object_monitor_monitor_instance_method( self, target );
          }
          Dynamic.sublisp_throw( $sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, T );
        }
        Dynamic.sublisp_throw( $sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_object_monitor_subjects( self, subjects );
          set_object_monitor_monitoring_p( self, monitoring_p );
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
      catch_var_for_object_monitor_method = Errors.handleThrowable( ccatch_env_var, $sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_object_monitor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 6903L)
  public static SubLObject object_monitor_unmonitor_method(final SubLObject self, final SubLObject target)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_object_monitor_method = NIL;
    SubLObject subjects = get_object_monitor_subjects( self );
    final SubLObject monitoring_p = get_object_monitor_monitoring_p( self );
    try
    {
      thread.throwStack.push( $sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
      try
      {
        if( NIL != conses_high.member( target, subjects, Symbols.symbol_function( EQ ), UNPROVIDED ) )
        {
          subjects = Sequences.delete( target, subjects, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL != monitoring_p )
          {
            object.object_remove_all_set_slot_listeners_method( self, target, UNPROVIDED );
          }
          Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, T );
        }
        Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_object_monitor_subjects( self, subjects );
          set_object_monitor_monitoring_p( self, monitoring_p );
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
      catch_var_for_object_monitor_method = Errors.handleThrowable( ccatch_env_var, $sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_object_monitor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 7352L)
  public static SubLObject object_monitor_monitor_instance_method(final SubLObject self, final SubLObject target)
  {
    SubLObject v_slots = NIL;
    SubLObject method_names = NIL;
    SubLObject cdolist_list_var;
    v_slots = ( cdolist_list_var = instances.instances_all_any_instance_slots( target ) );
    SubLObject slot = NIL;
    slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      object.object_add_set_slot_listener_method( self, target, slot, $sym23$MONITOR_SET_SLOT );
      cdolist_list_var = cdolist_list_var.rest();
      slot = cdolist_list_var.first();
    }
    method_names = ( cdolist_list_var = methods.methods_get_all_method_names( target ) );
    SubLObject method_name = NIL;
    method_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      object.object_add_class_wide_before_method_listener_method( self, target, method_name, $sym31$MONITOR_BEFORE_METHOD );
      object.object_add_class_wide_after_method_listener_method( self, target, method_name, $sym39$MONITOR_AFTER_METHOD );
      cdolist_list_var = cdolist_list_var.rest();
      method_name = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 7900L)
  public static SubLObject object_monitor_start_monitoring_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_object_monitor_method = NIL;
    final SubLObject subjects = get_object_monitor_subjects( self );
    SubLObject monitoring_p = get_object_monitor_monitoring_p( self );
    try
    {
      thread.throwStack.push( $sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
      try
      {
        SubLObject cdolist_list_var = subjects;
        SubLObject target = NIL;
        target = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          object_monitor_monitor_instance_method( self, target );
          cdolist_list_var = cdolist_list_var.rest();
          target = cdolist_list_var.first();
        }
        monitoring_p = T;
        Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_object_monitor_subjects( self, subjects );
          set_object_monitor_monitoring_p( self, monitoring_p );
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
      catch_var_for_object_monitor_method = Errors.handleThrowable( ccatch_env_var, $sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_object_monitor_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 8265L)
  public static SubLObject object_monitor_stop_monitoring_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_object_monitor_method = NIL;
    final SubLObject subjects = get_object_monitor_subjects( self );
    SubLObject monitoring_p = get_object_monitor_monitoring_p( self );
    try
    {
      thread.throwStack.push( $sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
      try
      {
        if( NIL != monitoring_p )
        {
          SubLObject cdolist_list_var = subjects;
          SubLObject target = NIL;
          target = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            object.object_remove_all_set_slot_listeners_method( self, target, UNPROVIDED );
            object.object_remove_all_class_wide_method_listeners_method( self, target, UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            target = cdolist_list_var.first();
          }
          monitoring_p = NIL;
        }
        Dynamic.sublisp_throw( $sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_object_monitor_subjects( self, subjects );
          set_object_monitor_monitoring_p( self, monitoring_p );
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
      catch_var_for_object_monitor_method = Errors.handleThrowable( ccatch_env_var, $sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_object_monitor_method;
  }

  public static SubLObject declare_object_monitor_file()
  {
    SubLFiles.declareFunction( me, "get_object_monitor_tab_string", "GET-OBJECT-MONITOR-TAB-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_object_monitor_tab_string", "SET-OBJECT-MONITOR-TAB-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_object_monitor_nesting_depth", "GET-OBJECT-MONITOR-NESTING-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "set_object_monitor_nesting_depth", "SET-OBJECT-MONITOR-NESTING-DEPTH", 2, 0, false );
    SubLFiles.declareFunction( me, "get_object_monitor_stream", "GET-OBJECT-MONITOR-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_object_monitor_stream", "SET-OBJECT-MONITOR-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_object_monitor_subjects", "GET-OBJECT-MONITOR-SUBJECTS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_object_monitor_subjects", "SET-OBJECT-MONITOR-SUBJECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_object_monitor_monitoring_p", "GET-OBJECT-MONITOR-MONITORING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_object_monitor_monitoring_p", "SET-OBJECT-MONITOR-MONITORING-P", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_object_monitor_class", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_object_monitor_instance", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "object_monitor_p", "OBJECT-MONITOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "object_monitor_initialize_method", "OBJECT-MONITOR-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_monitor_tab_to_depth_method", "OBJECT-MONITOR-TAB-TO-DEPTH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_monitor_monitor_set_slot_method", "OBJECT-MONITOR-MONITOR-SET-SLOT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "object_monitor_monitor_before_method_method", "OBJECT-MONITOR-MONITOR-BEFORE-METHOD-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "object_monitor_monitor_after_method_method", "OBJECT-MONITOR-MONITOR-AFTER-METHOD-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "object_monitor_monitor_method", "OBJECT-MONITOR-MONITOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "object_monitor_unmonitor_method", "OBJECT-MONITOR-UNMONITOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "object_monitor_monitor_instance_method", "OBJECT-MONITOR-MONITOR-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "object_monitor_start_monitoring_method", "OBJECT-MONITOR-START-MONITORING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "object_monitor_stop_monitoring_method", "OBJECT-MONITOR-STOP-MONITORING-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_object_monitor_file()
  {
    return NIL;
  }

  public static SubLObject setup_object_monitor_file()
  {
    classes.subloop_new_class( $sym0$OBJECT_MONITOR, $sym1$OBJECT, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$OBJECT_MONITOR, NIL );
    classes.subloop_note_class_initialization_function( $sym0$OBJECT_MONITOR, $sym8$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$OBJECT_MONITOR, $sym13$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_INSTANCE );
    subloop_reserved_initialize_object_monitor_class( $sym0$OBJECT_MONITOR );
    methods.methods_incorporate_instance_method( $sym14$INITIALIZE, $sym0$OBJECT_MONITOR, NIL, NIL, $list15 );
    methods.subloop_register_instance_method( $sym0$OBJECT_MONITOR, $sym14$INITIALIZE, $sym18$OBJECT_MONITOR_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym19$TAB_TO_DEPTH, $sym0$OBJECT_MONITOR, NIL, NIL, $list20 );
    methods.subloop_register_instance_method( $sym0$OBJECT_MONITOR, $sym19$TAB_TO_DEPTH, $sym22$OBJECT_MONITOR_TAB_TO_DEPTH_METHOD );
    methods.methods_incorporate_instance_method( $sym23$MONITOR_SET_SLOT, $sym0$OBJECT_MONITOR, NIL, $list24, $list25 );
    methods.subloop_register_instance_method( $sym0$OBJECT_MONITOR, $sym23$MONITOR_SET_SLOT, $sym30$OBJECT_MONITOR_MONITOR_SET_SLOT_METHOD );
    methods.methods_incorporate_instance_method( $sym31$MONITOR_BEFORE_METHOD, $sym0$OBJECT_MONITOR, $list32, $list33, $list34 );
    methods.subloop_register_instance_method( $sym0$OBJECT_MONITOR, $sym31$MONITOR_BEFORE_METHOD, $sym38$OBJECT_MONITOR_MONITOR_BEFORE_METHOD_METHOD );
    methods.methods_incorporate_instance_method( $sym39$MONITOR_AFTER_METHOD, $sym0$OBJECT_MONITOR, $list32, $list40, $list41 );
    methods.subloop_register_instance_method( $sym0$OBJECT_MONITOR, $sym39$MONITOR_AFTER_METHOD, $sym44$OBJECT_MONITOR_MONITOR_AFTER_METHOD_METHOD );
    methods.methods_incorporate_instance_method( $sym45$MONITOR, $sym0$OBJECT_MONITOR, NIL, $list46, $list47 );
    methods.subloop_register_instance_method( $sym0$OBJECT_MONITOR, $sym45$MONITOR, $sym49$OBJECT_MONITOR_MONITOR_METHOD );
    methods.methods_incorporate_instance_method( $sym50$UNMONITOR, $sym0$OBJECT_MONITOR, NIL, $list46, $list51 );
    methods.subloop_register_instance_method( $sym0$OBJECT_MONITOR, $sym50$UNMONITOR, $sym53$OBJECT_MONITOR_UNMONITOR_METHOD );
    methods.methods_incorporate_instance_method( $sym54$MONITOR_INSTANCE, $sym0$OBJECT_MONITOR, NIL, $list46, $list55 );
    methods.subloop_register_instance_method( $sym0$OBJECT_MONITOR, $sym54$MONITOR_INSTANCE, $sym56$OBJECT_MONITOR_MONITOR_INSTANCE_METHOD );
    methods.methods_incorporate_instance_method( $sym57$START_MONITORING, $sym0$OBJECT_MONITOR, NIL, NIL, $list58 );
    methods.subloop_register_instance_method( $sym0$OBJECT_MONITOR, $sym57$START_MONITORING, $sym60$OBJECT_MONITOR_START_MONITORING_METHOD );
    methods.methods_incorporate_instance_method( $sym61$STOP_MONITORING, $sym0$OBJECT_MONITOR, NIL, NIL, $list62 );
    methods.subloop_register_instance_method( $sym0$OBJECT_MONITOR, $sym61$STOP_MONITORING, $sym64$OBJECT_MONITOR_STOP_MONITORING_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_object_monitor_file();
  }

  @Override
  public void initializeVariables()
  {
    init_object_monitor_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_object_monitor_file();
  }
  static
  {
    me = new object_monitor();
    $sym0$OBJECT_MONITOR = makeSymbol( "OBJECT-MONITOR" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "MONITORING-P" ), makeKeyword( "INSTANCE" ), makeKeyword( "BOOLEAN" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "SUBJECTS" ),
        makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "STREAM" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "NESTING-DEPTH" ), makeKeyword(
            "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TAB-STRING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "TAB-TO-DEPTH" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                    makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MONITOR-SET-SLOT" ), ConsesLow.list( makeSymbol( "TARGET" ), makeSymbol( "NEW-VALUE" ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                        makeSymbol( "MONITOR-BEFORE-METHOD" ), ConsesLow.list( makeSymbol( "OWNING-METHOD-NAME" ), makeSymbol( "INSTANCE-OR-CLASS" ), makeSymbol( "ARGS" ) ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "MONITOR-AFTER-METHOD" ), ConsesLow.list( makeSymbol( "OWNING-METHOD-NAME" ), makeSymbol( "INSTANCE-OR-CLASS" ), makeSymbol( "ARGS" ), makeSymbol(
                                "RESULT" ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MONITOR" ), ConsesLow.list( makeSymbol( "TARGET" ) ) ), ConsesLow.list( makeSymbol(
                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "UNMONITOR" ), ConsesLow.list( makeSymbol( "TARGET" ) ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MONITOR-INSTANCE" ),
                                        ConsesLow.list( makeSymbol( "TARGET" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "START-MONITORING" ), NIL ), ConsesLow
                                            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "STOP-MONITORING" ), NIL )
    } );
    $sym3$TAB_STRING = makeSymbol( "TAB-STRING" );
    $sym4$NESTING_DEPTH = makeSymbol( "NESTING-DEPTH" );
    $sym5$SUBJECTS = makeSymbol( "SUBJECTS" );
    $int6$4097 = makeInteger( 4097 );
    $sym7$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym8$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-CLASS" );
    $sym9$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym10$MONITORING_P = makeSymbol( "MONITORING-P" );
    $sym11$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym12$STREAM = makeSymbol( "STREAM" );
    $sym13$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-INSTANCE" );
    $sym14$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MONITORING-P" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "SUBJECTS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STREAM" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NESTING-DEPTH" ), ZERO_INTEGER ), ConsesLow.list(
            makeSymbol( "CSETQ" ), makeSymbol( "TAB-STRING" ), makeString( "   |" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD" );
    $str17$____ = makeString( "   |" );
    $sym18$OBJECT_MONITOR_INITIALIZE_METHOD = makeSymbol( "OBJECT-MONITOR-INITIALIZE-METHOD" );
    $sym19$TAB_TO_DEPTH = makeSymbol( "TAB-TO-DEPTH" );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "I" ), makeSymbol( "NESTING-DEPTH" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeSymbol(
        "TAB-STRING" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD" );
    $sym22$OBJECT_MONITOR_TAB_TO_DEPTH_METHOD = makeSymbol( "OBJECT-MONITOR-TAB-TO-DEPTH-METHOD" );
    $sym23$MONITOR_SET_SLOT = makeSymbol( "MONITOR-SET-SLOT" );
    $list24 = ConsesLow.list( makeSymbol( "TARGET" ), makeSymbol( "NEW-VALUE" ) );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "~%" ) ), ConsesLow.list( makeSymbol( "TAB-TO-DEPTH" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
        "FORMAT" ), makeSymbol( "STREAM" ), makeString( "(SET-SLOT ~S ~S ~S)" ), makeSymbol( "TARGET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "*ACTIVE-SLOT-LISTENER*" ),
            ConsesLow.list( makeSymbol( "SLOT-LISTENER-P" ), makeSymbol( "*ACTIVE-SLOT-LISTENER*" ) ) ), ConsesLow.list( makeSymbol( "SL-SLOT-NAME" ), makeSymbol( "*ACTIVE-SLOT-LISTENER*" ) ), makeKeyword(
                "UNKNOWN-SLOT" ) ), makeSymbol( "NEW-VALUE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD" );
    $str27$__ = makeString( "~%" );
    $str28$_SET_SLOT__S__S__S_ = makeString( "(SET-SLOT ~S ~S ~S)" );
    $kw29$UNKNOWN_SLOT = makeKeyword( "UNKNOWN-SLOT" );
    $sym30$OBJECT_MONITOR_MONITOR_SET_SLOT_METHOD = makeSymbol( "OBJECT-MONITOR-MONITOR-SET-SLOT-METHOD" );
    $sym31$MONITOR_BEFORE_METHOD = makeSymbol( "MONITOR-BEFORE-METHOD" );
    $list32 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ) );
    $list33 = ConsesLow.list( makeSymbol( "INSTANCE-OR-CLASS" ), makeSymbol( "OWNING-METHOD-NAME" ), makeSymbol( "ARGS" ) );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "~%" ) ), ConsesLow.list( makeSymbol( "TAB-TO-DEPTH" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FILTERED-LAMBDA-LIST" ), ConsesLow.list( makeSymbol( "METHOD-LISTENERS-FILTERED-LAMBDA-LIST" ), makeSymbol( "INSTANCE-OR-CLASS" ), makeSymbol(
            "OWNING-METHOD-NAME" ) ) ), ConsesLow.list( makeSymbol( "CURRENT-VAR" ), NIL ), ConsesLow.list( makeSymbol( "CURRENT-ARG" ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list(
                makeSymbol( "INSTANCE-P" ), makeSymbol( "INSTANCE-OR-CLASS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-OF-INSTANCE" ), ConsesLow.list( makeSymbol(
                    "INSTANCE-CLASS" ), makeSymbol( "INSTANCE-OR-CLASS" ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "Entered: (~S ~S) ~S" ), makeSymbol( "OWNING-METHOD-NAME" ),
                        ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "CLASS-OF-INSTANCE" ) ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "INSTANCE-OR-CLASS" ), makeSymbol( "ARGS" ) ) ) ) ), ConsesLow
                            .list( ConsesLow.list( makeSymbol( "CLASS-P" ), makeSymbol( "INSTANCE-OR-CLASS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "Entered: (~S ~S) ~S" ),
                                makeSymbol( "OWNING-METHOD-NAME" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "INSTANCE-OR-CLASS" ) ), makeSymbol( "ARGS" ) ) ), ConsesLow.list( T, ConsesLow.list(
                                    makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "Entered: ~S ~S" ), makeSymbol( "OWNING-METHOD-NAME" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol(
                                        "OWNING-METHOD-NAME" ), makeSymbol( "ARGS" ) ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "FILTERED-LAMBDA-LIST" ), makeSymbol(
                                            "ARGS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "~%" ) ), ConsesLow.list( makeSymbol( "TAB-TO-DEPTH" ), makeSymbol( "SELF" ) ),
                                            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-VAR" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "FILTERED-LAMBDA-LIST" ) ), makeSymbol( "CURRENT-ARG" ),
                                                ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "ARGS" ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "Arg: ~S = ~S" ), makeSymbol(
                                                    "CURRENT-VAR" ), makeSymbol( "CURRENT-ARG" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FILTERED-LAMBDA-LIST" ), ConsesLow.list( makeSymbol( "CDR" ),
                                                        makeSymbol( "FILTERED-LAMBDA-LIST" ) ), makeSymbol( "ARGS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "ARGS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                            "CINC" ), makeSymbol( "NESTING-DEPTH" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str35$Entered____S__S___S = makeString( "Entered: (~S ~S) ~S" );
    $str36$Entered___S__S = makeString( "Entered: ~S ~S" );
    $str37$Arg___S____S = makeString( "Arg: ~S = ~S" );
    $sym38$OBJECT_MONITOR_MONITOR_BEFORE_METHOD_METHOD = makeSymbol( "OBJECT-MONITOR-MONITOR-BEFORE-METHOD-METHOD" );
    $sym39$MONITOR_AFTER_METHOD = makeSymbol( "MONITOR-AFTER-METHOD" );
    $list40 = ConsesLow.list( makeSymbol( "INSTANCE-OR-CLASS" ), makeSymbol( "OWNING-METHOD-NAME" ), makeSymbol( "ARGS" ), makeSymbol( "RESULT" ) );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDEC" ), makeSymbol( "NESTING-DEPTH" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "~%" ) ), ConsesLow.list( makeSymbol(
        "TAB-TO-DEPTH" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "INSTANCE-OR-CLASS" ) ), ConsesLow.list( makeSymbol(
            "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-OF-INSTANCE" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "INSTANCE-OR-CLASS" ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ),
                makeSymbol( "STREAM" ), makeString( "Returning: (~S ~S) ~S -> ~S" ), makeSymbol( "OWNING-METHOD-NAME" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "CLASS-OF-INSTANCE" ) ), ConsesLow.list(
                    makeSymbol( "CONS" ), makeSymbol( "INSTANCE-OR-CLASS" ), makeSymbol( "ARGS" ) ), makeSymbol( "RESULT" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-P" ), makeSymbol(
                        "INSTANCE-OR-CLASS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "Returning: (~S ~S) ~S -> ~S" ), makeSymbol( "OWNING-METHOD-NAME" ), ConsesLow.list(
                            makeSymbol( "CLASS-NAME" ), makeSymbol( "INSTANCE-OR-CLASS" ) ), makeSymbol( "ARGS" ), makeSymbol( "RESULT" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol(
                                "STREAM" ), makeString( "Returning: ~S ~S -> ~S" ), makeSymbol( "OWNING-METHOD-NAME" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "OWNING-METHOD-NAME" ), makeSymbol( "ARGS" ) ),
                                makeSymbol( "RESULT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str42$Returning____S__S___S_____S = makeString( "Returning: (~S ~S) ~S -> ~S" );
    $str43$Returning___S__S_____S = makeString( "Returning: ~S ~S -> ~S" );
    $sym44$OBJECT_MONITOR_MONITOR_AFTER_METHOD_METHOD = makeSymbol( "OBJECT-MONITOR-MONITOR-AFTER-METHOD-METHOD" );
    $sym45$MONITOR = makeSymbol( "MONITOR" );
    $list46 = ConsesLow.list( makeSymbol( "TARGET" ) );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "TARGET" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "TARGET" ), makeSymbol(
        "SUBJECTS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "MONITORING-P" ), ConsesLow.list( makeSymbol( "MONITOR-INSTANCE" ), makeSymbol( "SELF" ), makeSymbol( "TARGET" ) ) ), ConsesLow.list( makeSymbol(
            "RET" ), T ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD" );
    $sym49$OBJECT_MONITOR_MONITOR_METHOD = makeSymbol( "OBJECT-MONITOR-MONITOR-METHOD" );
    $sym50$UNMONITOR = makeSymbol( "UNMONITOR" );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "TARGET" ), makeSymbol( "SUBJECTS" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQ ) ), ConsesLow
        .list( makeSymbol( "CSETQ" ), makeSymbol( "SUBJECTS" ), ConsesLow.list( makeSymbol( "DELETE" ), makeSymbol( "TARGET" ), makeSymbol( "SUBJECTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
            "MONITORING-P" ), ConsesLow.list( makeSymbol( "REMOVE-ALL-SET-SLOT-LISTENERS" ), makeSymbol( "SELF" ), makeSymbol( "TARGET" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow.list( makeSymbol(
                "RET" ), NIL ) );
    $sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD" );
    $sym53$OBJECT_MONITOR_UNMONITOR_METHOD = makeSymbol( "OBJECT-MONITOR-UNMONITOR-METHOD" );
    $sym54$MONITOR_INSTANCE = makeSymbol( "MONITOR-INSTANCE" );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "SLOTS" ), makeSymbol( "METHOD-NAMES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SLOTS" ), ConsesLow.list(
        makeSymbol( "INSTANCES-ALL-ANY-INSTANCE-SLOTS" ), makeSymbol( "TARGET" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SLOT" ), makeSymbol( "SLOTS" ) ), ConsesLow.list( makeSymbol(
            "ADD-SET-SLOT-LISTENER" ), makeSymbol( "SELF" ), makeSymbol( "TARGET" ), makeSymbol( "SLOT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MONITOR-SET-SLOT" ) ) ) ), ConsesLow.list( makeSymbol(
                "CSETQ" ), makeSymbol( "METHOD-NAMES" ), ConsesLow.list( makeSymbol( "METHODS-GET-ALL-METHOD-NAMES" ), makeSymbol( "TARGET" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                    "METHOD-NAME" ), makeSymbol( "METHOD-NAMES" ) ), ConsesLow.list( makeSymbol( "ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER" ), makeSymbol( "SELF" ), makeSymbol( "TARGET" ), makeSymbol( "METHOD-NAME" ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MONITOR-BEFORE-METHOD" ) ) ), ConsesLow.list( makeSymbol( "ADD-CLASS-WIDE-AFTER-METHOD-LISTENER" ), makeSymbol( "SELF" ), makeSymbol(
                            "TARGET" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MONITOR-AFTER-METHOD" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym56$OBJECT_MONITOR_MONITOR_INSTANCE_METHOD = makeSymbol( "OBJECT-MONITOR-MONITOR-INSTANCE-METHOD" );
    $sym57$START_MONITORING = makeSymbol( "START-MONITORING" );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TARGET" ), makeSymbol( "SUBJECTS" ) ), ConsesLow.list( makeSymbol( "MONITOR-INSTANCE" ), makeSymbol( "SELF" ),
        makeSymbol( "TARGET" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MONITORING-P" ), T ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD" );
    $sym60$OBJECT_MONITOR_START_MONITORING_METHOD = makeSymbol( "OBJECT-MONITOR-START-MONITORING-METHOD" );
    $sym61$STOP_MONITORING = makeSymbol( "STOP-MONITORING" );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "MONITORING-P" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TARGET" ), makeSymbol( "SUBJECTS" ) ), ConsesLow
        .list( makeSymbol( "REMOVE-ALL-SET-SLOT-LISTENERS" ), makeSymbol( "SELF" ), makeSymbol( "TARGET" ) ), ConsesLow.list( makeSymbol( "REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS" ), makeSymbol( "SELF" ), makeSymbol(
            "TARGET" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MONITORING-P" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD" );
    $sym64$OBJECT_MONITOR_STOP_MONITORING_METHOD = makeSymbol( "OBJECT-MONITOR-STOP-MONITORING-METHOD" );
  }
}
/*
 * 
 * Total time: 324 ms
 * 
 */