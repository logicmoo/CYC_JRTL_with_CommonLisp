package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.queues;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_iterators
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.inference_iterators";
  public static final String myFingerPrint = "92163ba67342e07ce2eb1be3c49178831a957bc6d2dd2a8c6842a5e24edbd88e";
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 5760L)
  private static SubLSymbol $new_cyc_query_iterative_results$;
  private static final SubLSymbol $sym0$INFERENCE_P;
  private static final SubLSymbol $sym1$QUERY_DYNAMIC_PROPERTIES_P;
  private static final SubLSymbol $sym2$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym3$INFERENCE_ITERATOR_DONE;
  private static final SubLSymbol $sym4$INFERENCE_ITERATOR_NEXT;
  private static final SubLSymbol $sym5$INFERENCE_ITERATOR_FINALIZE;
  private static final SubLSymbol $kw6$CONTINUABLE_;
  private static final SubLSymbol $kw7$MAX_NUMBER;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$DONE;
  private static final SubLSymbol $kw10$UNDETERMINED;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$POSSIBLY_INFERENCE_SENTENCE_P;
  private static final SubLSymbol $sym14$POSSIBLY_MT_P;
  private static final SubLSymbol $sym15$PROPERTY_LIST_P;
  private static final SubLSymbol $sym16$QUERY_PROPERTY_P;
  private static final SubLSymbol $sym17$QUERY_ITERATOR_DONE;
  private static final SubLSymbol $sym18$QUERY_ITERATOR_NEXT;
  private static final SubLSymbol $sym19$QUERY_ITERATOR_FINALIZE;
  private static final SubLSymbol $kw20$PROBLEM_STORE;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$PRINT;
  private static final SubLSymbol $kw25$MAX_TIME;
  private static final SubLSymbol $kw26$EXHAUST;

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 986L)
  public static SubLObject new_inference_iterator(final SubLObject inference, SubLObject query_dynamic_properties, SubLObject inference_finalizer)
  {
    if( query_dynamic_properties == UNPROVIDED )
    {
      query_dynamic_properties = NIL;
    }
    if( inference_finalizer == UNPROVIDED )
    {
      inference_finalizer = NIL;
    }
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    assert NIL != inference_datastructures_enumerated_types.query_dynamic_properties_p( query_dynamic_properties ) : query_dynamic_properties;
    if( NIL != inference_finalizer && !assertionsDisabledInClass && NIL == Types.function_spec_p( inference_finalizer ) )
    {
      throw new AssertionError( inference_finalizer );
    }
    return iteration.new_iterator( make_inference_iterator_state( inference, query_dynamic_properties, inference_finalizer ), $sym3$INFERENCE_ITERATOR_DONE, $sym4$INFERENCE_ITERATOR_NEXT,
        $sym5$INFERENCE_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 1808L)
  public static SubLObject make_inference_iterator_state(final SubLObject inference, SubLObject query_dynamic_properties, final SubLObject inference_finalizer)
  {
    query_dynamic_properties = conses_high.putf( query_dynamic_properties, $kw6$CONTINUABLE_, T );
    query_dynamic_properties = conses_high.putf( query_dynamic_properties, $kw7$MAX_NUMBER, ONE_INTEGER );
    final SubLObject pending_queue = queues.create_queue( UNPROVIDED );
    return ConsesLow.list( pending_queue, inference, query_dynamic_properties, inference_finalizer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 2261L)
  public static SubLObject inference_iterator_done(final SubLObject state)
  {
    SubLObject pending_queue = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list8 );
    pending_queue = state.first();
    final SubLObject rest;
    final SubLObject current = rest = state.rest();
    return Equality.eq( $kw9$DONE, pending_queue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 2421L)
  public static SubLObject inference_iterator_next(final SubLObject state)
  {
    SubLObject next_item = $kw10$UNDETERMINED;
    SubLObject halted_early = NIL;
    SubLObject pending_queue = NIL;
    SubLObject inference = NIL;
    SubLObject query_dynamic_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list11 );
    pending_queue = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list11 );
    inference = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list11 );
    query_dynamic_properties = current.first();
    final SubLObject rest;
    current = ( rest = current.rest() );
    while ( $kw10$UNDETERMINED == next_item && ( NIL == queues.queue_empty_p( pending_queue ) || ( NIL != inference_datastructures_inference.continuable_inference_p( inference )
        && NIL == inference_datastructures_inference.exhausted_inference_p( inference ) ) ))
    {
      if( NIL == queues.queue_empty_p( pending_queue ) )
      {
        next_item = queues.dequeue( pending_queue );
      }
      else
      {
        SubLObject cdolist_list_var;
        final SubLObject new_results = cdolist_list_var = inference_kernel.continue_inference( inference, query_dynamic_properties );
        SubLObject new_result = NIL;
        new_result = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          queues.enqueue( new_result, pending_queue );
          cdolist_list_var = cdolist_list_var.rest();
          new_result = cdolist_list_var.first();
        }
      }
    }
    if( next_item == $kw10$UNDETERMINED )
    {
      halted_early = T;
      ConsesLow.set_nth( ZERO_INTEGER, state, $kw9$DONE );
    }
    return Values.values( next_item, state, halted_early );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 3240L)
  public static SubLObject inference_iterator_finalize(final SubLObject state)
  {
    SubLObject pending_queue = NIL;
    SubLObject inference = NIL;
    SubLObject query_dynamic_properties = NIL;
    SubLObject inference_finalizer = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list12 );
    pending_queue = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list12 );
    inference = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list12 );
    query_dynamic_properties = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list12 );
    inference_finalizer = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( inference_finalizer.isFunctionSpec() )
      {
        return Functions.funcall( inference_finalizer, inference );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list12 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 3549L)
  public static SubLObject new_query_iterator(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    assert NIL != el_utilities.possibly_inference_sentence_p( sentence ) : sentence;
    if( NIL != mt && !assertionsDisabledInClass && NIL == hlmt.possibly_mt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    final SubLObject plist_var = query_properties;
    assert NIL != list_utilities.property_list_p( plist_var ) : plist_var;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    return iteration.new_iterator( make_query_iterator_state( sentence, mt, query_properties ), $sym17$QUERY_ITERATOR_DONE, $sym18$QUERY_ITERATOR_NEXT, $sym19$QUERY_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 4132L)
  public static SubLObject make_query_iterator_state(final SubLObject sentence, final SubLObject mt, final SubLObject query_properties)
  {
    final SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties( query_properties );
    final SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties( query_properties );
    final SubLObject problem_store_providedP = inference_datastructures_problem_store.problem_store_p( conses_high.getf( query_static_properties, $kw20$PROBLEM_STORE, UNPROVIDED ) );
    final SubLObject inference = inference_kernel.new_continuable_inference( sentence, mt, query_static_properties );
    final SubLObject inference_iterator = new_inference_iterator( inference, query_dynamic_properties, UNPROVIDED );
    return ConsesLow.list( inference_iterator, inference, problem_store_providedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 4723L)
  public static SubLObject query_iterator_done(final SubLObject state)
  {
    SubLObject current_$1 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list21 );
    current_$1 = state.first();
    final SubLObject rest;
    final SubLObject current = rest = state.rest();
    return Equality.eq( $kw9$DONE, current_$1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 4867L)
  public static SubLObject query_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject inference_iterator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list22 );
    inference_iterator = state.first();
    final SubLObject rest;
    final SubLObject current = rest = state.rest();
    thread.resetMultipleValues();
    final SubLObject next = iteration.iteration_next( inference_iterator );
    final SubLObject valid = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == valid )
    {
      query_iterator_finalize( state );
      return Values.values( NIL, state, T );
    }
    return Values.values( next, state, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 5248L)
  public static SubLObject query_iterator_finalize(final SubLObject state)
  {
    SubLObject current_$2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list21 );
    current_$2 = state.first();
    final SubLObject rest;
    final SubLObject current = rest = state.rest();
    if( NIL != iteration.iterator_p( current_$2 ) )
    {
      SubLObject inference_iterator = NIL;
      SubLObject inference = NIL;
      SubLObject problem_store_providedP = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( state, state, $list23 );
      inference_iterator = state.first();
      SubLObject current_$3 = state.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$3, state, $list23 );
      inference = current_$3.first();
      current_$3 = current_$3.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$3, state, $list23 );
      problem_store_providedP = current_$3.first();
      current_$3 = current_$3.rest();
      if( NIL == current_$3 )
      {
        iteration.iteration_finalize( inference_iterator );
        if( NIL != problem_store_providedP )
        {
          inference_datastructures_inference.destroy_inference( inference );
        }
        else
        {
          inference_datastructures_inference.destroy_inference_and_problem_store( inference );
        }
        final SubLObject update = $kw9$DONE;
        ConsesLow.rplaca( state, update );
        ConsesLow.rplacd( state, NIL );
        return T;
      }
      cdestructuring_bind.cdestructuring_bind_error( state, $list23 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 5904L)
  public static SubLObject new_cyc_query_iterative(final SubLObject sentence, SubLObject mt, SubLObject query_properties, SubLObject result_handler)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    if( result_handler == UNPROVIDED )
    {
      result_handler = Symbols.symbol_function( $sym24$PRINT );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != el_utilities.possibly_inference_sentence_p( sentence ) : sentence;
    if( NIL != mt && !assertionsDisabledInClass && NIL == hlmt.possibly_mt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    final SubLObject plist_var = query_properties;
    assert NIL != list_utilities.property_list_p( plist_var ) : plist_var;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    assert NIL != Types.function_spec_p( result_handler ) : result_handler;
    final SubLObject max_number = conses_high.getf( query_properties, $kw7$MAX_NUMBER, NIL );
    final SubLObject max_time = conses_high.getf( query_properties, $kw25$MAX_TIME, NIL );
    query_properties = conses_high.copy_list( query_properties );
    query_properties = conses_high.putf( query_properties, $kw25$MAX_TIME, NIL );
    SubLObject timed_outP = NIL;
    SubLObject max_numberP = NIL;
    SubLObject results = NIL;
    final SubLObject query_iterator = new_query_iterator( sentence, mt, query_properties );
    final SubLObject _prev_bind_0 = $new_cyc_query_iterative_results$.currentBinding( thread );
    try
    {
      $new_cyc_query_iterative_results$.bind( NIL, thread );
      if( NIL != max_time )
      {
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try
        {
          thread.throwStack.push( tag );
          final SubLObject _prev_bind_0_$5 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$within_with_timeout$.bind( T, thread );
            SubLObject timer = NIL;
            try
            {
              final SubLObject _prev_bind_0_$6 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
              try
              {
                subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                timer = subl_macro_promotions.with_timeout_start_timer( max_time, tag );
                max_numberP = new_cyc_query_iterative_int( query_iterator, max_number, result_handler );
              }
              finally
              {
                subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$6, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                subl_macro_promotions.with_timeout_stop_timer( timer );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
              }
            }
          }
          finally
          {
            subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$5, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      else
      {
        max_numberP = new_cyc_query_iterative_int( query_iterator, max_number, result_handler );
      }
      results = Sequences.nreverse( $new_cyc_query_iterative_results$.getDynamicValue( thread ) );
    }
    finally
    {
      $new_cyc_query_iterative_results$.rebind( _prev_bind_0, thread );
    }
    final SubLObject suspend_status = ( NIL != timed_outP ) ? $kw25$MAX_TIME : ( ( NIL != max_numberP ) ? $kw7$MAX_NUMBER : $kw26$EXHAUST );
    return Values.values( results, suspend_status );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-iterators.lisp", position = 7587L)
  public static SubLObject new_cyc_query_iterative_int(final SubLObject query_iterator, final SubLObject max_number, final SubLObject result_handler)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answer_count = ZERO_INTEGER;
    SubLObject doneP = ( NIL != max_number ) ? Numbers.numGE( answer_count, max_number ) : NIL;
    try
    {
      SubLObject valid;
      for( SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean( NIL == valid || NIL != doneP ) )
      {
        thread.resetMultipleValues();
        final SubLObject result = iteration.iteration_next( query_iterator );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          answer_count = Numbers.add( answer_count, ONE_INTEGER );
          doneP = ( NIL != max_number ) ? Numbers.numGE( answer_count, max_number ) : NIL;
          Functions.funcall( result_handler, result );
          $new_cyc_query_iterative_results$.setDynamicValue( ConsesLow.cons( result, $new_cyc_query_iterative_results$.getDynamicValue( thread ) ), thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        iteration.iteration_finalize( query_iterator );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return doneP;
  }

  public static SubLObject declare_inference_iterators_file()
  {
    SubLFiles.declareFunction( me, "new_inference_iterator", "NEW-INFERENCE-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "make_inference_iterator_state", "MAKE-INFERENCE-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_iterator_done", "INFERENCE-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_iterator_next", "INFERENCE-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_iterator_finalize", "INFERENCE-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_query_iterator", "NEW-QUERY-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "make_query_iterator_state", "MAKE-QUERY-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "query_iterator_done", "QUERY-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "query_iterator_next", "QUERY-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "query_iterator_finalize", "QUERY-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cyc_query_iterative", "NEW-CYC-QUERY-ITERATIVE", 1, 3, false );
    SubLFiles.declareFunction( me, "new_cyc_query_iterative_int", "NEW-CYC-QUERY-ITERATIVE-INT", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_iterators_file()
  {
    $new_cyc_query_iterative_results$ = SubLFiles.defparameter( "*NEW-CYC-QUERY-ITERATIVE-RESULTS*", NIL );
    return NIL;
  }

  public static SubLObject setup_inference_iterators_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_iterators_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_iterators_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_iterators_file();
  }
  static
  {
    me = new inference_iterators();
    $new_cyc_query_iterative_results$ = null;
    $sym0$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $sym1$QUERY_DYNAMIC_PROPERTIES_P = makeSymbol( "QUERY-DYNAMIC-PROPERTIES-P" );
    $sym2$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym3$INFERENCE_ITERATOR_DONE = makeSymbol( "INFERENCE-ITERATOR-DONE" );
    $sym4$INFERENCE_ITERATOR_NEXT = makeSymbol( "INFERENCE-ITERATOR-NEXT" );
    $sym5$INFERENCE_ITERATOR_FINALIZE = makeSymbol( "INFERENCE-ITERATOR-FINALIZE" );
    $kw6$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw7$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $list8 = ConsesLow.list( makeSymbol( "PENDING-QUEUE" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) );
    $kw9$DONE = makeKeyword( "DONE" );
    $kw10$UNDETERMINED = makeKeyword( "UNDETERMINED" );
    $list11 = ConsesLow.list( makeSymbol( "PENDING-QUEUE" ), makeSymbol( "INFERENCE" ), makeSymbol( "QUERY-DYNAMIC-PROPERTIES" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) );
    $list12 = ConsesLow.list( makeSymbol( "PENDING-QUEUE" ), makeSymbol( "INFERENCE" ), makeSymbol( "QUERY-DYNAMIC-PROPERTIES" ), makeSymbol( "INFERENCE-FINALIZER" ) );
    $sym13$POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol( "POSSIBLY-INFERENCE-SENTENCE-P" );
    $sym14$POSSIBLY_MT_P = makeSymbol( "POSSIBLY-MT-P" );
    $sym15$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $sym16$QUERY_PROPERTY_P = makeSymbol( "QUERY-PROPERTY-P" );
    $sym17$QUERY_ITERATOR_DONE = makeSymbol( "QUERY-ITERATOR-DONE" );
    $sym18$QUERY_ITERATOR_NEXT = makeSymbol( "QUERY-ITERATOR-NEXT" );
    $sym19$QUERY_ITERATOR_FINALIZE = makeSymbol( "QUERY-ITERATOR-FINALIZE" );
    $kw20$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $list21 = ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) );
    $list22 = ConsesLow.list( makeSymbol( "INFERENCE-ITERATOR" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) );
    $list23 = ConsesLow.list( makeSymbol( "INFERENCE-ITERATOR" ), makeSymbol( "INFERENCE" ), makeSymbol( "PROBLEM-STORE-PROVIDED?" ) );
    $sym24$PRINT = makeSymbol( "PRINT" );
    $kw25$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw26$EXHAUST = makeKeyword( "EXHAUST" );
  }
}
/*
 *
 * Total time: 167 ms synthetic
 */