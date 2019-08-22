package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class commander
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.commander";
  public static final String myFingerPrint = "fa71981f6520e974075d1d50f6c9b0cc464454eaae42b3de3a94da91c32b4b76";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 914L)
  public static SubLSymbol $commander_debug_level$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3561L)
  public static SubLSymbol $commander_pre_processors$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3937L)
  public static SubLSymbol $commander_processors$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4133L)
  public static SubLSymbol $commander_output_processors$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4357L)
  public static SubLSymbol $commander_end_session_functions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4634L)
  public static SubLSymbol $commander_cleanup_functions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7551L)
  private static SubLSymbol $commander_input_processor_threads$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7924L)
  private static SubLSymbol $commander_current_tasks$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8126L)
  private static SubLSymbol $commander_input_queues$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8321L)
  private static SubLSymbol $commander_input_queue_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8412L)
  private static SubLSymbol $commander_input_queue_semaphores$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8726L)
  private static SubLSymbol $commander_output_queues$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PWHEN;
  private static final SubLSymbol $sym2$__;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$WARN;
  private static final SubLSymbol $sym5$INTEGERP;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$COMMANDER_PICKUP_OUTPUT_DEFAULT;
  private static final SubLSymbol $kw12$SESSION;
  private static final SubLSymbol $kw13$SESSION_ID;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$KEYWORDP;
  private static final SubLSymbol $sym16$ENCODE_KEYWORD_AS_JSON_KEY;
  private static final SubLObject $const17$TheList;
  private static final SubLSymbol $sym18$_COMMANDER_INPUT_PROCESSOR_THREADS_;
  private static final SubLSymbol $sym19$_COMMANDER_CURRENT_TASKS_;
  private static final SubLSymbol $sym20$_COMMANDER_INPUT_QUEUES_;
  private static final SubLSymbol $sym21$_COMMANDER_INPUT_QUEUE_LOCK_;
  private static final SubLString $str22$commander_input_queue_lock;
  private static final SubLSymbol $sym23$_COMMANDER_INPUT_QUEUE_SEMAPHORES_;
  private static final SubLSymbol $sym24$_COMMANDER_OUTPUT_QUEUES_;
  private static final SubLSymbol $kw25$PROCESSOR;
  private static final SubLSymbol $kw26$TEST;
  private static final SubLList $list27;
  private static final SubLString $str28$Commander_Task_for__S_______S__;
  private static final SubLSymbol $sym29$COMMANDER_RECEIVE_UI_INPUT;
  private static final SubLSymbol $kw30$ACTION;
  private static final SubLString $str31$delete;
  private static final SubLSymbol $kw32$TYPE;
  private static final SubLString $str33$currentSession;
  private static final SubLSymbol $sym34$IPC_QUEUE_P;
  private static final SubLString $str35$input_semaphore_for_;
  private static final SubLSymbol $sym36$SEMAPHORE_P;
  private static final SubLString $str37$Commander_processor_for_session_;
  private static final SubLSymbol $sym38$COMMANDER_PROCESS_INPUT_LOOP;
  private static final SubLSymbol $kw39$DONE;
  private static final SubLSymbol $sym40$PICK_UP_UI_OUTPUT;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3224L)
  public static SubLObject commander_debug_level()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $commander_debug_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3301L)
  public static SubLObject commander_warn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    level = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    string = current.first();
    final SubLObject v_arguments;
    current = ( v_arguments = current.rest() );
    return ConsesLow.list( $sym1$PWHEN, ConsesLow.list( $sym2$__, $list3, level ), ConsesLow.listS( $sym4$WARN, string, ConsesLow.append( v_arguments, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3443L)
  public static SubLObject set_commander_debug_level(final SubLObject num)
  {
    assert NIL != Types.integerp( num ) : num;
    $commander_debug_level$.setDynamicValue( num );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4845L)
  public static SubLObject commander_get_processor_func(final SubLObject processor_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.alist_lookup( $commander_processors$.getDynamicValue( thread ), processor_name, EQUAL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4977L)
  public static SubLObject commander_get_pre_processor_func(final SubLObject processor_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.alist_lookup( $commander_pre_processors$.getDynamicValue( thread ), processor_name, EQUAL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5117L)
  public static SubLObject commander_get_output_processor_func(final SubLObject processor_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.alist_lookup( $commander_output_processors$.getDynamicValue( thread ), processor_name, EQUAL, $sym11$COMMANDER_PICKUP_OUTPUT_DEFAULT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5296L)
  public static SubLObject commander_get_end_session_func(final SubLObject processor_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.alist_lookup( $commander_end_session_functions$.getDynamicValue( thread ), processor_name, EQUAL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5442L)
  public static SubLObject commander_get_cleanup_func(final SubLObject processor_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.alist_lookup( $commander_cleanup_functions$.getDynamicValue( thread ), processor_name, EQUAL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5580L)
  public static SubLObject session_id_from_message(final SubLObject message)
  {
    return ( NIL != conses_high.getf( message, $kw12$SESSION, UNPROVIDED ) ) ? conses_high.getf( message, $kw12$SESSION, UNPROVIDED ) : conses_high.getf( message, $kw13$SESSION_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5767L)
  public static SubLObject get_query_results_with_substitutions(final SubLObject query_spec, final SubLObject subst_alist)
  {
    SubLObject sentence = kb_query.kbq_sentence( query_spec );
    final SubLObject mt = kb_query.kbq_mt( query_spec );
    final SubLObject props = inference_strategist.implicify_inference_mode_defaults( inference_parameters.explicify_inference_engine_query_property_defaults( kb_query.kbq_query_properties( query_spec ) ) );
    SubLObject cdolist_list_var = subst_alist;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject old = NIL;
      SubLObject v_new = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
      old = current.first();
      current = ( v_new = current.rest() );
      sentence = cycl_utilities.expression_subst( v_new, old, sentence, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return inference_kernel.new_cyc_query( sentence, mt, props );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6454L)
  public static SubLObject convert_keywords_to_json_keys(final SubLObject l)
  {
    return cycl_utilities.expression_transform( l, $sym15$KEYWORDP, $sym16$ENCODE_KEYWORD_AS_JSON_KEY, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6662L)
  public static SubLObject encode_json_key_as_keyword(final SubLObject str)
  {
    SubLObject keyword_chars = NIL;
    SubLObject end_var_$1;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject v_char;
    for( end_var = ( end_var_$1 = Sequences.length( str ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$1 ); char_num = number_utilities.f_1X( char_num ) )
    {
      v_char = Strings.sublisp_char( str, char_num );
      if( NIL != Characters.upper_case_p( v_char ) )
      {
        keyword_chars = ConsesLow.cons( Characters.CHAR_hyphen, keyword_chars );
      }
      keyword_chars = ConsesLow.cons( v_char, keyword_chars );
    }
    return cycl_variables.make_keyword_var( string_utilities.char_list_to_string( Sequences.nreverse( keyword_chars ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6939L)
  public static SubLObject encode_keyword_as_json_key(final SubLObject k)
  {
    SubLObject json_chars = NIL;
    SubLObject next_char_is_upper_caseP = NIL;
    final SubLObject string_var = Symbols.symbol_name( k );
    SubLObject end_var_$2;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject v_char;
    for( end_var = ( end_var_$2 = Sequences.length( string_var ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$2 ); char_num = number_utilities.f_1X( char_num ) )
    {
      v_char = Strings.sublisp_char( string_var, char_num );
      if( v_char.eql( Characters.CHAR_hyphen ) )
      {
        next_char_is_upper_caseP = T;
      }
      else if( NIL != next_char_is_upper_caseP )
      {
        json_chars = ConsesLow.cons( Characters.char_upcase( v_char ), json_chars );
        next_char_is_upper_caseP = NIL;
      }
      else
      {
        json_chars = ConsesLow.cons( Characters.char_downcase( v_char ), json_chars );
      }
    }
    return string_utilities.char_list_to_string( Sequences.nreverse( json_chars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7385L)
  public static SubLObject encode_for_plist_value(final SubLObject obj)
  {
    if( NIL == cycl_grammar.cycl_formula_p( obj ) || NIL == kb_utilities.kbeq( cycl_utilities.formula_arg0( obj ), $const17$TheList ) )
    {
      return obj;
    }
    return cycl_utilities.formula_args( obj, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8938L)
  public static SubLObject commander_note_thread_dead(final SubLObject session_id)
  {
    map_utilities.map_remove( $commander_input_processor_threads$.getGlobalValue(), session_id );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9157L)
  public static SubLObject commander_process_input_loop(final SubLObject session_id)
  {
    SubLObject doneP = NIL;
    while ( NIL == doneP)
    {
      final SubLObject queue = map_utilities.map_get( $commander_input_queues$.getGlobalValue(), session_id, NIL );
      final SubLObject message = process_utilities.ipc_dequeue( queue, UNPROVIDED );
      final SubLObject processor_name = list_utilities.plist_lookup( message, $kw25$PROCESSOR, UNPROVIDED );
      final SubLObject processor = commander_get_processor_func( processor_name );
      if( NIL != commander_end_session_message_p( message ) )
      {
        commander_end_session( session_id, message );
        commander_clean_up_after_session_ends( message );
        doneP = T;
      }
      else
      {
        commander_note_current_task( session_id, message );
        try
        {
          Functions.funcall( processor, session_id, message );
        }
        finally
        {
          final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
          try
          {
            Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
            final SubLObject _values = Values.getValuesAsVector();
            commander_note_task_complete( session_id, message );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
          }
        }
      }
    }
    commander_note_thread_dead( session_id );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9994L)
  public static SubLObject commander_testing_message_p(final SubLObject message)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( message ) && conses_high.getf( message, $kw26$TEST, UNPROVIDED ).equal( T ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10127L)
  public static SubLObject commander_note_current_task(final SubLObject session_id, final SubLObject message)
  {
    return map_utilities.map_put( $commander_current_tasks$.getGlobalValue(), session_id, message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10257L)
  public static SubLObject commander_note_task_complete(final SubLObject session_id, final SubLObject message)
  {
    return map_utilities.map_remove( $commander_current_tasks$.getGlobalValue(), session_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10402L)
  public static SubLObject display_current_commander_tasks()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject iterator = map_utilities.new_map_iterator( $commander_current_tasks$.getGlobalValue() );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        SubLObject current;
        final SubLObject datum = current = var;
        SubLObject session = NIL;
        SubLObject message = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
        session = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
        message = current.first();
        current = current.rest();
        if( NIL == current )
        {
          PrintLow.format( T, $str28$Commander_Task_for__S_______S__, session, message );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10575L)
  public static SubLObject commander_receive_ui_input(final SubLObject messages)
  {
    final SubLObject session_id = session_id_from_message( messages.first() );
    ensure_output_queue_for_session( session_id );
    SubLObject cdolist_list_var = messages;
    SubLObject message = NIL;
    message = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pre_processed_message = commander_preprocess_input( message );
      commander_enqueue_ui_input( session_id, pre_processed_message );
      cdolist_list_var = cdolist_list_var.rest();
      message = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11146L)
  public static SubLObject commander_preprocess_input(SubLObject message)
  {
    final SubLObject processor_name = conses_high.getf( message, $kw25$PROCESSOR, UNPROVIDED );
    final SubLObject preprocessor_func = commander_get_pre_processor_func( processor_name );
    if( NIL != preprocessor_func )
    {
      message = Functions.funcall( preprocessor_func, message );
    }
    return message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11434L)
  public static SubLObject commander_end_session_message_p(final SubLObject message)
  {
    return makeBoolean( conses_high.getf( message, $kw30$ACTION, UNPROVIDED ).equal( $str31$delete ) && conses_high.getf( message, $kw32$TYPE, UNPROVIDED ).equal( $str33$currentSession ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11603L)
  public static SubLObject commander_enqueue_ui_input(final SubLObject session_id, final SubLObject ui_input)
  {
    ensure_session_processing_ready( session_id );
    process_utilities.ipc_enqueue( ui_input, map_utilities.map_get( $commander_input_queues$.getGlobalValue(), session_id, UNPROVIDED ), UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11800L)
  public static SubLObject get_next_ui_input(final SubLObject session_id)
  {
    note_ui_input_in_process( session_id );
    final SubLObject ui_input = process_utilities.ipc_dequeue( map_utilities.map_get( $commander_input_queues$.getGlobalValue(), session_id, UNPROVIDED ), UNPROVIDED );
    return ui_input;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12090L)
  public static SubLObject is_ui_data_waitingP(final SubLObject session_id)
  {
    return Numbers.numG( process_utilities.ipc_current_queue_size( map_utilities.map_get( $commander_input_queues$.getGlobalValue(), session_id, UNPROVIDED ) ), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12304L)
  public static SubLObject is_ui_input_being_processedP(final SubLObject session_id)
  {
    return Numbers.numG( Semaphores.semaphore_current_count( map_utilities.map_get( $commander_input_queue_semaphores$.getGlobalValue(), session_id, UNPROVIDED ) ), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12460L)
  public static SubLObject note_ui_input_in_process(final SubLObject session_id)
  {
    Semaphores.semaphore_wait( map_utilities.map_get( $commander_input_queue_semaphores$.getGlobalValue(), session_id, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12623L)
  public static SubLObject note_ui_input_processed(final SubLObject session_id)
  {
    Semaphores.semaphore_signal( map_utilities.map_get( $commander_input_queue_semaphores$.getGlobalValue(), session_id, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12790L)
  public static SubLObject ensure_session_processing_ready(final SubLObject session_id)
  {
    map_utilities.map_put_unless( $commander_input_queues$.getGlobalValue(), session_id, process_utilities.new_ipc_queue( session_id ), $sym34$IPC_QUEUE_P );
    map_utilities.map_put_unless( $commander_input_queue_semaphores$.getGlobalValue(), session_id, Semaphores.new_semaphore( Sequences.cconcatenate( $str35$input_semaphore_for_, format_nil.format_nil_s_no_copy(
        session_id ) ), UNPROVIDED ), $sym36$SEMAPHORE_P );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $commander_input_queue_lock$.getGlobalValue() );
      if( NIL == Threads.valid_process_p( map_utilities.map_get( $commander_input_processor_threads$.getGlobalValue(), session_id, UNPROVIDED ) ) )
      {
        map_utilities.map_put( $commander_input_processor_threads$.getGlobalValue(), session_id, process_utilities.make_cyc_server_process_with_args( Sequences.cconcatenate( $str37$Commander_processor_for_session_,
            format_nil.format_nil_s_no_copy( session_id ) ), $sym38$COMMANDER_PROCESS_INPUT_LOOP, ConsesLow.list( session_id ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $commander_input_queue_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13492L)
  public static SubLObject remove_input_queue_for_session(final SubLObject session_id)
  {
    map_utilities.map_remove( $commander_input_queues$.getGlobalValue(), session_id );
    map_utilities.map_remove( $commander_input_queue_semaphores$.getGlobalValue(), session_id );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13679L)
  public static SubLObject clear_commander_queues()
  {
    $commander_output_queues$.setGlobalValue( dictionary_utilities.new_synchronized_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    $commander_input_queues$.setGlobalValue( dictionary_utilities.new_synchronized_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    $commander_input_queue_semaphores$.setGlobalValue( dictionary_utilities.new_synchronized_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    $commander_current_tasks$.setGlobalValue( dictionary_utilities.new_synchronized_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    if( NIL != dictionary_utilities.synchronized_dictionary_p( $commander_input_processor_threads$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = dictionary_utilities.synchronized_dictionary_values( $commander_input_processor_threads$.getGlobalValue() );
      SubLObject thread = NIL;
      thread = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != Threads.valid_process_p( thread ) )
        {
          Threads.kill_process( thread );
        }
        cdolist_list_var = cdolist_list_var.rest();
        thread = cdolist_list_var.first();
      }
    }
    $commander_input_processor_threads$.setGlobalValue( dictionary_utilities.new_synchronized_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    return $kw39$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14582L)
  public static SubLObject queue_output(final SubLObject session_id, final SubLObject output)
  {
    ensure_output_queue_for_session( session_id );
    final SubLObject queue = map_utilities.map_get( $commander_output_queues$.getGlobalValue(), session_id, NIL );
    process_utilities.ipc_enqueue( output, queue, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14852L)
  public static SubLObject queue_messages(final SubLObject session_id, final SubLObject output_list)
  {
    SubLObject cdolist_list_var = output_list;
    SubLObject message = NIL;
    message = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      queue_output( session_id, message );
      cdolist_list_var = cdolist_list_var.rest();
      message = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15041L)
  public static SubLObject pick_up_ui_output(final SubLObject session_id, SubLObject processor_name)
  {
    if( processor_name == UNPROVIDED )
    {
      processor_name = NIL;
    }
    ensure_output_queue_for_session( session_id );
    final SubLObject queue = map_utilities.map_get( $commander_output_queues$.getGlobalValue(), session_id, UNPROVIDED );
    final SubLObject output_processor = commander_get_output_processor_func( processor_name );
    final SubLObject message = Functions.funcall( output_processor, session_id, queue );
    if( NIL != commander_end_session_message_p( message ) )
    {
      commander_clean_up_after_session_ends( message );
    }
    return message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15665L)
  public static SubLObject commander_end_session(final SubLObject session_id, final SubLObject self_destruct_message)
  {
    final SubLObject queue = map_utilities.map_get( $commander_output_queues$.getGlobalValue(), session_id, UNPROVIDED );
    final SubLObject end_session_func = commander_get_end_session_func( conses_high.getf( self_destruct_message, $kw25$PROCESSOR, UNPROVIDED ) );
    process_utilities.ipc_drain( queue, UNPROVIDED );
    process_utilities.ipc_enqueue( self_destruct_message, queue, UNPROVIDED );
    Functions.funcall( end_session_func, session_id, self_destruct_message );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16211L)
  public static SubLObject commander_clean_up_after_session_ends(final SubLObject message)
  {
    final SubLObject session_id = session_id_from_message( message );
    final SubLObject cleanup_func = commander_get_cleanup_func( conses_high.getf( message, $kw25$PROCESSOR, UNPROVIDED ) );
    remove_output_queue_for_session( session_id );
    remove_input_queue_for_session( session_id );
    if( NIL != cleanup_func )
    {
      Functions.funcall( cleanup_func, message );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16707L)
  public static SubLObject ensure_output_queue_for_session(final SubLObject session_id)
  {
    map_utilities.map_put_unless( $commander_output_queues$.getGlobalValue(), session_id, process_utilities.new_ipc_queue( session_id ), $sym34$IPC_QUEUE_P );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16880L)
  public static SubLObject remove_output_queue_for_session(final SubLObject session_id)
  {
    map_utilities.map_remove( $commander_output_queues$.getGlobalValue(), session_id );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17007L)
  public static SubLObject commander_pickup_output_default(final SubLObject session_id, final SubLObject queue)
  {
    final SubLObject message = process_utilities.ipc_dequeue( queue, UNPROVIDED );
    return message;
  }

  public static SubLObject declare_commander_file()
  {
    SubLFiles.declareFunction( me, "commander_debug_level", "COMMANDER-DEBUG-LEVEL", 0, 0, false );
    SubLFiles.declareMacro( me, "commander_warn", "COMMANDER-WARN" );
    SubLFiles.declareFunction( me, "set_commander_debug_level", "SET-COMMANDER-DEBUG-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_get_processor_func", "COMMANDER-GET-PROCESSOR-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_get_pre_processor_func", "COMMANDER-GET-PRE-PROCESSOR-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_get_output_processor_func", "COMMANDER-GET-OUTPUT-PROCESSOR-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_get_end_session_func", "COMMANDER-GET-END-SESSION-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_get_cleanup_func", "COMMANDER-GET-CLEANUP-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "session_id_from_message", "SESSION-ID-FROM-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_query_results_with_substitutions", "GET-QUERY-RESULTS-WITH-SUBSTITUTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "convert_keywords_to_json_keys", "CONVERT-KEYWORDS-TO-JSON-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_json_key_as_keyword", "ENCODE-JSON-KEY-AS-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_keyword_as_json_key", "ENCODE-KEYWORD-AS-JSON-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_for_plist_value", "ENCODE-FOR-PLIST-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_note_thread_dead", "COMMANDER-NOTE-THREAD-DEAD", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_process_input_loop", "COMMANDER-PROCESS-INPUT-LOOP", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_testing_message_p", "COMMANDER-TESTING-MESSAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_note_current_task", "COMMANDER-NOTE-CURRENT-TASK", 2, 0, false );
    SubLFiles.declareFunction( me, "commander_note_task_complete", "COMMANDER-NOTE-TASK-COMPLETE", 2, 0, false );
    SubLFiles.declareFunction( me, "display_current_commander_tasks", "DISPLAY-CURRENT-COMMANDER-TASKS", 0, 0, false );
    SubLFiles.declareFunction( me, "commander_receive_ui_input", "COMMANDER-RECEIVE-UI-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_preprocess_input", "COMMANDER-PREPROCESS-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_end_session_message_p", "COMMANDER-END-SESSION-MESSAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_enqueue_ui_input", "COMMANDER-ENQUEUE-UI-INPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_next_ui_input", "GET-NEXT-UI-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "is_ui_data_waitingP", "IS-UI-DATA-WAITING?", 1, 0, false );
    SubLFiles.declareFunction( me, "is_ui_input_being_processedP", "IS-UI-INPUT-BEING-PROCESSED?", 1, 0, false );
    SubLFiles.declareFunction( me, "note_ui_input_in_process", "NOTE-UI-INPUT-IN-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "note_ui_input_processed", "NOTE-UI-INPUT-PROCESSED", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_session_processing_ready", "ENSURE-SESSION-PROCESSING-READY", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_input_queue_for_session", "REMOVE-INPUT-QUEUE-FOR-SESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_commander_queues", "CLEAR-COMMANDER-QUEUES", 0, 0, false );
    SubLFiles.declareFunction( me, "queue_output", "QUEUE-OUTPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "queue_messages", "QUEUE-MESSAGES", 2, 0, false );
    SubLFiles.declareFunction( me, "pick_up_ui_output", "PICK-UP-UI-OUTPUT", 1, 1, false );
    SubLFiles.declareFunction( me, "commander_end_session", "COMMANDER-END-SESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "commander_clean_up_after_session_ends", "COMMANDER-CLEAN-UP-AFTER-SESSION-ENDS", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_output_queue_for_session", "ENSURE-OUTPUT-QUEUE-FOR-SESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_output_queue_for_session", "REMOVE-OUTPUT-QUEUE-FOR-SESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "commander_pickup_output_default", "COMMANDER-PICKUP-OUTPUT-DEFAULT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_commander_file()
  {
    $commander_debug_level$ = SubLFiles.defparameter( "*COMMANDER-DEBUG-LEVEL*", ZERO_INTEGER );
    $commander_pre_processors$ = SubLFiles.defparameter( "*COMMANDER-PRE-PROCESSORS*", $list6 );
    $commander_processors$ = SubLFiles.defparameter( "*COMMANDER-PROCESSORS*", $list7 );
    $commander_output_processors$ = SubLFiles.defparameter( "*COMMANDER-OUTPUT-PROCESSORS*", $list8 );
    $commander_end_session_functions$ = SubLFiles.defparameter( "*COMMANDER-END-SESSION-FUNCTIONS*", $list9 );
    $commander_cleanup_functions$ = SubLFiles.defparameter( "*COMMANDER-CLEANUP-FUNCTIONS*", $list10 );
    $commander_input_processor_threads$ = SubLFiles.deflexical( "*COMMANDER-INPUT-PROCESSOR-THREADS*", maybeDefault( $sym18$_COMMANDER_INPUT_PROCESSOR_THREADS_, $commander_input_processor_threads$,
        () -> ( dictionary_utilities.new_synchronized_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $commander_current_tasks$ = SubLFiles.deflexical( "*COMMANDER-CURRENT-TASKS*", maybeDefault( $sym19$_COMMANDER_CURRENT_TASKS_, $commander_current_tasks$, () -> ( dictionary_utilities.new_synchronized_dictionary(
        Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $commander_input_queues$ = SubLFiles.deflexical( "*COMMANDER-INPUT-QUEUES*", maybeDefault( $sym20$_COMMANDER_INPUT_QUEUES_, $commander_input_queues$, () -> ( dictionary_utilities.new_synchronized_dictionary( Symbols
        .symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $commander_input_queue_lock$ = SubLFiles.deflexical( "*COMMANDER-INPUT-QUEUE-LOCK*", maybeDefault( $sym21$_COMMANDER_INPUT_QUEUE_LOCK_, $commander_input_queue_lock$, () -> ( Locks.make_lock(
        $str22$commander_input_queue_lock ) ) ) );
    $commander_input_queue_semaphores$ = SubLFiles.deflexical( "*COMMANDER-INPUT-QUEUE-SEMAPHORES*", maybeDefault( $sym23$_COMMANDER_INPUT_QUEUE_SEMAPHORES_, $commander_input_queue_semaphores$,
        () -> ( dictionary_utilities.new_synchronized_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $commander_output_queues$ = SubLFiles.deflexical( "*COMMANDER-OUTPUT-QUEUES*", maybeDefault( $sym24$_COMMANDER_OUTPUT_QUEUES_, $commander_output_queues$, () -> ( dictionary_utilities.new_synchronized_dictionary(
        Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_commander_file()
  {
    subl_macro_promotions.declare_defglobal( $sym18$_COMMANDER_INPUT_PROCESSOR_THREADS_ );
    subl_macro_promotions.declare_defglobal( $sym19$_COMMANDER_CURRENT_TASKS_ );
    subl_macro_promotions.declare_defglobal( $sym20$_COMMANDER_INPUT_QUEUES_ );
    subl_macro_promotions.declare_defglobal( $sym21$_COMMANDER_INPUT_QUEUE_LOCK_ );
    subl_macro_promotions.declare_defglobal( $sym23$_COMMANDER_INPUT_QUEUE_SEMAPHORES_ );
    subl_macro_promotions.declare_defglobal( $sym24$_COMMANDER_OUTPUT_QUEUES_ );
    access_macros.register_external_symbol( $sym29$COMMANDER_RECEIVE_UI_INPUT );
    access_macros.register_external_symbol( $sym40$PICK_UP_UI_OUTPUT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_commander_file();
  }

  @Override
  public void initializeVariables()
  {
    init_commander_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_commander_file();
  }
  static
  {
    me = new commander();
    $commander_debug_level$ = null;
    $commander_pre_processors$ = null;
    $commander_processors$ = null;
    $commander_output_processors$ = null;
    $commander_end_session_functions$ = null;
    $commander_cleanup_functions$ = null;
    $commander_input_processor_threads$ = null;
    $commander_current_tasks$ = null;
    $commander_input_queues$ = null;
    $commander_input_queue_lock$ = null;
    $commander_input_queue_semaphores$ = null;
    $commander_output_queues$ = null;
    $list0 = ConsesLow.list( makeSymbol( "LEVEL" ), makeSymbol( "STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGUMENTS" ) );
    $sym1$PWHEN = makeSymbol( "PWHEN" );
    $sym2$__ = makeSymbol( ">=" );
    $list3 = ConsesLow.list( makeSymbol( "COMMANDER-DEBUG-LEVEL" ) );
    $sym4$WARN = makeSymbol( "WARN" );
    $sym5$INTEGERP = makeSymbol( "INTEGERP" );
    $list6 = ConsesLow.list( ConsesLow.cons( makeString( "bella" ), makeSymbol( "BELLA-PRE-PROCESS-INPUT" ) ) );
    $list7 = ConsesLow.list( ConsesLow.cons( makeString( "bella" ), makeSymbol( "BELLA-PROCESS-INPUT" ) ) );
    $list8 = ConsesLow.list( ConsesLow.cons( makeString( "bella" ), makeSymbol( "BELLA-PICKUP-OUTPUT" ) ) );
    $list9 = ConsesLow.list( ConsesLow.cons( makeString( "bella" ), makeSymbol( "BELLA-END-SESSION" ) ) );
    $list10 = ConsesLow.list( ConsesLow.cons( makeString( "bella" ), makeSymbol( "BELLA-CLEANUP-AFTER-SESSION-ENDS" ) ) );
    $sym11$COMMANDER_PICKUP_OUTPUT_DEFAULT = makeSymbol( "COMMANDER-PICKUP-OUTPUT-DEFAULT" );
    $kw12$SESSION = makeKeyword( "SESSION" );
    $kw13$SESSION_ID = makeKeyword( "SESSION-ID" );
    $list14 = ConsesLow.cons( makeSymbol( "OLD" ), makeSymbol( "NEW" ) );
    $sym15$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym16$ENCODE_KEYWORD_AS_JSON_KEY = makeSymbol( "ENCODE-KEYWORD-AS-JSON-KEY" );
    $const17$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $sym18$_COMMANDER_INPUT_PROCESSOR_THREADS_ = makeSymbol( "*COMMANDER-INPUT-PROCESSOR-THREADS*" );
    $sym19$_COMMANDER_CURRENT_TASKS_ = makeSymbol( "*COMMANDER-CURRENT-TASKS*" );
    $sym20$_COMMANDER_INPUT_QUEUES_ = makeSymbol( "*COMMANDER-INPUT-QUEUES*" );
    $sym21$_COMMANDER_INPUT_QUEUE_LOCK_ = makeSymbol( "*COMMANDER-INPUT-QUEUE-LOCK*" );
    $str22$commander_input_queue_lock = makeString( "commander-input-queue-lock" );
    $sym23$_COMMANDER_INPUT_QUEUE_SEMAPHORES_ = makeSymbol( "*COMMANDER-INPUT-QUEUE-SEMAPHORES*" );
    $sym24$_COMMANDER_OUTPUT_QUEUES_ = makeSymbol( "*COMMANDER-OUTPUT-QUEUES*" );
    $kw25$PROCESSOR = makeKeyword( "PROCESSOR" );
    $kw26$TEST = makeKeyword( "TEST" );
    $list27 = ConsesLow.list( makeSymbol( "SESSION" ), makeSymbol( "MESSAGE" ) );
    $str28$Commander_Task_for__S_______S__ = makeString( "Commander Task for ~S~% -> ~S~%" );
    $sym29$COMMANDER_RECEIVE_UI_INPUT = makeSymbol( "COMMANDER-RECEIVE-UI-INPUT" );
    $kw30$ACTION = makeKeyword( "ACTION" );
    $str31$delete = makeString( "delete" );
    $kw32$TYPE = makeKeyword( "TYPE" );
    $str33$currentSession = makeString( "currentSession" );
    $sym34$IPC_QUEUE_P = makeSymbol( "IPC-QUEUE-P" );
    $str35$input_semaphore_for_ = makeString( "input semaphore for " );
    $sym36$SEMAPHORE_P = makeSymbol( "SEMAPHORE-P" );
    $str37$Commander_processor_for_session_ = makeString( "Commander processor for session " );
    $sym38$COMMANDER_PROCESS_INPUT_LOOP = makeSymbol( "COMMANDER-PROCESS-INPUT-LOOP" );
    $kw39$DONE = makeKeyword( "DONE" );
    $sym40$PICK_UP_UI_OUTPUT = makeSymbol( "PICK-UP-UI-OUTPUT" );
  }
}
/*
 * 
 * Total time: 229 ms
 * 
 */