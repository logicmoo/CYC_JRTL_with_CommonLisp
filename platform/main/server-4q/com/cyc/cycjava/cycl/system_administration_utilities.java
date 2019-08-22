package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class system_administration_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.system_administration_utilities";
  public static final String myFingerPrint = "ebd281d28d7edf39d1af7206105af26665534f073f7ef77eb8fc66c25c716a04";
  @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2731L)
  private static SubLSymbol $get_process_id_in_jrtl_caching_state$;
  private static final SubLSymbol $sym0$PROCESSES_WITH_SUBSTRING;
  private static final SubLSymbol $sym1$KILL_PROCESSES_WITH_SUBSTRING;
  private static final SubLSymbol $sym2$KILL_PROCESS;
  private static final SubLSymbol $sym3$NON_NEGATIVE_INTEGER_P;
  private static final SubLString $str4$jstack;
  private static final SubLSymbol $sym5$GET_PROCESS_ID_IN_JRTL;
  private static final SubLString $str6$readlink;
  private static final SubLList $list7;
  private static final SubLString $str8$ps;
  private static final SubLString $str9$_o;
  private static final SubLString $str10$ppid_;
  private static final SubLSymbol $sym11$_GET_PROCESS_ID_IN_JRTL_CACHING_STATE_;

  @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 1001L)
  public static SubLObject processes_with_substring(final SubLObject string)
  {
    SubLObject processes = NIL;
    SubLObject cdolist_list_var = Threads.all_processes();
    SubLObject proc = NIL;
    proc = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != string_utilities.substringP( string, Threads.process_name( proc ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        processes = ConsesLow.cons( proc, processes );
      }
      cdolist_list_var = cdolist_list_var.rest();
      proc = cdolist_list_var.first();
    }
    return Sequences.nreverse( processes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 1349L)
  public static SubLObject kill_processes_with_substring(final SubLObject string)
  {
    final SubLObject processes = processes_with_substring( string );
    Mapping.mapc( $sym2$KILL_PROCESS, processes, EMPTY_SUBL_OBJECT_ARRAY );
    return processes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 1589L)
  public static SubLObject jstack_trace(SubLObject pid)
  {
    if( pid == UNPROVIDED )
    {
      pid = NIL;
    }
    if( NIL == pid )
    {
      pid = get_process_id_in_jrtl();
    }
    assert NIL != subl_promotions.non_negative_integer_p( pid ) : pid;
    return os_process_utilities.os_process_evaluation_output_strings( $str4$jstack, ConsesLow.list( format_nil.format_nil_s( pid ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2510L)
  public static SubLObject print_jstack_trace(SubLObject pid, SubLObject stream)
  {
    if( pid == UNPROVIDED )
    {
      pid = NIL;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    SubLObject list_var = NIL;
    SubLObject line = NIL;
    SubLObject index = NIL;
    list_var = jstack_trace( UNPROVIDED );
    line = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), line = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      if( !index.isZero() )
      {
        streams_high.terpri( stream );
      }
      streams_high.write_string( line, stream, UNPROVIDED, UNPROVIDED );
    }
    return pid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2731L)
  public static SubLObject clear_get_process_id_in_jrtl()
  {
    final SubLObject cs = $get_process_id_in_jrtl_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2731L)
  public static SubLObject remove_get_process_id_in_jrtl()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_process_id_in_jrtl_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2731L)
  public static SubLObject get_process_id_in_jrtl_internal()
  {
    final SubLObject self_pid_string = os_process_utilities.os_process_evaluation_output_strings( $str6$readlink, $list7, UNPROVIDED, UNPROVIDED ).first();
    if( NIL != number_utilities.number_string_p( self_pid_string ) )
    {
      final SubLObject ps_strings = os_process_utilities.os_process_evaluation_output_strings( $str8$ps, ConsesLow.list( $str9$_o, Sequences.cconcatenate( $str10$ppid_, format_nil.format_nil_a_no_copy(
          self_pid_string ) ) ), UNPROVIDED, UNPROVIDED );
      final SubLObject jvm_pid_string = string_utilities.trim_whitespace( Sequences.nreverse( ps_strings ).first() );
      if( NIL != number_utilities.number_string_p( jvm_pid_string ) )
      {
        return Values.values( reader.parse_integer( jvm_pid_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-administration-utilities.lisp", position = 2731L)
  public static SubLObject get_process_id_in_jrtl()
  {
    SubLObject caching_state = $get_process_id_in_jrtl_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym5$GET_PROCESS_ID_IN_JRTL, $sym11$_GET_PROCESS_ID_IN_JRTL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_process_id_in_jrtl_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_system_administration_utilities_file()
  {
    SubLFiles.declareFunction( me, "processes_with_substring", "PROCESSES-WITH-SUBSTRING", 1, 0, false );
    SubLFiles.declareFunction( me, "kill_processes_with_substring", "KILL-PROCESSES-WITH-SUBSTRING", 1, 0, false );
    SubLFiles.declareFunction( me, "jstack_trace", "JSTACK-TRACE", 0, 1, false );
    SubLFiles.declareFunction( me, "print_jstack_trace", "PRINT-JSTACK-TRACE", 0, 2, false );
    SubLFiles.declareFunction( me, "clear_get_process_id_in_jrtl", "CLEAR-GET-PROCESS-ID-IN-JRTL", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_process_id_in_jrtl", "REMOVE-GET-PROCESS-ID-IN-JRTL", 0, 0, false );
    SubLFiles.declareFunction( me, "get_process_id_in_jrtl_internal", "GET-PROCESS-ID-IN-JRTL-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "get_process_id_in_jrtl", "GET-PROCESS-ID-IN-JRTL", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_system_administration_utilities_file()
  {
    $get_process_id_in_jrtl_caching_state$ = SubLFiles.deflexical( "*GET-PROCESS-ID-IN-JRTL-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_system_administration_utilities_file()
  {
    access_macros.register_external_symbol( $sym0$PROCESSES_WITH_SUBSTRING );
    access_macros.register_external_symbol( $sym1$KILL_PROCESSES_WITH_SUBSTRING );
    memoization_state.note_globally_cached_function( $sym5$GET_PROCESS_ID_IN_JRTL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_system_administration_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_system_administration_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_system_administration_utilities_file();
  }
  static
  {
    me = new system_administration_utilities();
    $get_process_id_in_jrtl_caching_state$ = null;
    $sym0$PROCESSES_WITH_SUBSTRING = makeSymbol( "PROCESSES-WITH-SUBSTRING" );
    $sym1$KILL_PROCESSES_WITH_SUBSTRING = makeSymbol( "KILL-PROCESSES-WITH-SUBSTRING" );
    $sym2$KILL_PROCESS = makeSymbol( "KILL-PROCESS" );
    $sym3$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str4$jstack = makeString( "jstack" );
    $sym5$GET_PROCESS_ID_IN_JRTL = makeSymbol( "GET-PROCESS-ID-IN-JRTL" );
    $str6$readlink = makeString( "readlink" );
    $list7 = ConsesLow.list( makeString( "/proc/self" ) );
    $str8$ps = makeString( "ps" );
    $str9$_o = makeString( "-o" );
    $str10$ppid_ = makeString( "ppid=" );
    $sym11$_GET_PROCESS_ID_IN_JRTL_CACHING_STATE_ = makeSymbol( "*GET-PROCESS-ID-IN-JRTL-CACHING-STATE*" );
  }
}
/*
 * 
 * Total time: 67 ms
 * 
 */