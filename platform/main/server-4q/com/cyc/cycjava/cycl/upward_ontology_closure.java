package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class upward_ontology_closure
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.upward_ontology_closure";
  public static final String myFingerPrint = "3d78083ff734c2be4a53b5413281c37e8d785f178ad04e99348bf812b9b29c87";
  @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 898L)
  private static SubLSymbol $upward_ontology_closure_trace$;
  private static final SubLSymbol $sym0$INFERENCE_P;
  private static final SubLSymbol $sym1$FORT_P;
  private static final SubLObject $const2$isa;
  private static final SubLSymbol $kw3$GAF;
  private static final SubLSymbol $kw4$TRUE;
  private static final SubLObject $const5$genls;
  private static final SubLSymbol $kw6$IGNORE;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLObject $const9$genlMt;
  private static final SubLString $str10$___S_via__S;
  private static final SubLString $str11$__seeding__S;
  private static final SubLList $list12;

  @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 958L)
  public static SubLObject upward_ontology_closure_wrt_inference(final SubLObject inference, SubLObject closure_mt, SubLObject traceP)
  {
    if( closure_mt == UNPROVIDED )
    {
      closure_mt = NIL;
    }
    if( traceP == UNPROVIDED )
    {
      traceP = NIL;
    }
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    final SubLObject seed_terms = inference_complete_vocabulary_wrt_answers( inference );
    if( NIL == closure_mt )
    {
      closure_mt = inference_datastructures_inference.inference_mt( inference );
    }
    return upward_ontology_closure( seed_terms, closure_mt, traceP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 1302L)
  public static SubLObject inference_complete_vocabulary_wrt_answers(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    final SubLObject query = inference_datastructures_inference.inference_el_query( inference );
    final SubLObject mt = inference_datastructures_inference.inference_mt( inference );
    thread.resetMultipleValues();
    final SubLObject backward_theory = inference_complete_backward_theory_for_answers( inference );
    final SubLObject intermediate_hl_supports = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject theory_vocab = cycl_utilities.expression_gather( backward_theory, Symbols.symbol_function( $sym1$FORT_P ), T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject hl_support_vocab = cycl_utilities.expression_gather( intermediate_hl_supports, Symbols.symbol_function( $sym1$FORT_P ), T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject query_vocab = cycl_utilities.expression_gather( query, Symbols.symbol_function( $sym1$FORT_P ), T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject mt_vocab = cycl_utilities.expression_gather( mt, Symbols.symbol_function( $sym1$FORT_P ), T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject vocab_set = set_utilities.construct_set_from_list( theory_vocab, Symbols.symbol_function( EQ ), UNPROVIDED );
    set_utilities.set_add_all( hl_support_vocab, vocab_set );
    set_utilities.set_add_all( query_vocab, vocab_set );
    set_utilities.set_add_all( mt_vocab, vocab_set );
    return set.set_element_list( vocab_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 2152L)
  public static SubLObject inference_complete_backward_theory_for_answers(final SubLObject inference)
  {
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    final SubLObject mt = inference_datastructures_inference.inference_mt( inference );
    final SubLObject explicit_supports = inference_datastructures_inference.inference_all_answer_supports( inference );
    return hl_supports.hl_justification_complete_backward_theory( explicit_supports, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 2448L)
  public static SubLObject upward_ontology_closure(final SubLObject seed_terms, SubLObject mt, SubLObject traceP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( traceP == UNPROVIDED )
    {
      traceP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject total_set = set.new_set( Symbols.symbol_function( EQUAL ), Sequences.length( seed_terms ) );
    final SubLObject unprocessed_queue = queues.create_queue( UNPROVIDED );
    final SubLObject _prev_bind_0 = $upward_ontology_closure_trace$.currentBinding( thread );
    try
    {
      $upward_ontology_closure_trace$.bind( traceP, thread );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        SubLObject cdolist_list_var = seed_terms;
        SubLObject seed_term = NIL;
        seed_term = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          upward_ontology_closure_possibly_add_new_term_via( seed_term, total_set, unprocessed_queue, NIL );
          cdolist_list_var = cdolist_list_var.rest();
          seed_term = cdolist_list_var.first();
        }
        while ( NIL == queues.queue_empty_p( unprocessed_queue ))
        {
          final SubLObject v_term = queues.dequeue( unprocessed_queue );
          SubLObject pred_var = $const2$isa;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw3$GAF, $kw4$TRUE, NIL );
                  SubLObject done_var_$2 = NIL;
                  final SubLObject token_var_$3 = NIL;
                  while ( NIL == done_var_$2)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$3 );
                    final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( gaf ) );
                    if( NIL != valid_$4 && NIL != assertions_high.asserted_assertionP( gaf ) )
                    {
                      final SubLObject other_term = assertions_high.gaf_arg2( gaf );
                      upward_ontology_closure_possibly_add_new_term_via( other_term, total_set, unprocessed_queue, v_term );
                    }
                    done_var_$2 = makeBoolean( NIL == valid_$4 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          if( NIL != forts.fort_p( v_term ) )
          {
            if( NIL != fort_types_interface.collectionP( v_term ) )
            {
              pred_var = $const5$genls;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var );
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while ( NIL == done_var)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                  final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid )
                  {
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw3$GAF, $kw4$TRUE, NIL );
                      SubLObject done_var_$3 = NIL;
                      final SubLObject token_var_$4 = NIL;
                      while ( NIL == done_var_$3)
                      {
                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                        final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( gaf ) );
                        if( NIL != valid_$5 && NIL != assertions_high.asserted_assertionP( gaf ) )
                        {
                          final SubLObject other_term = assertions_high.gaf_arg2( gaf );
                          upward_ontology_closure_possibly_add_new_term_via( other_term, total_set, unprocessed_queue, v_term );
                        }
                        done_var_$3 = makeBoolean( NIL == valid_$5 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if( NIL != final_index_iterator )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                        }
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid );
                }
              }
            }
            if( NIL != kb_accessors.relationP( v_term ) )
            {
              SubLObject cdolist_list_var2 = all_arg_constraint_preds();
              SubLObject arg_constraint_pred = NIL;
              arg_constraint_pred = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                final SubLObject pred_var2 = arg_constraint_pred;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var2 ) )
                {
                  final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var2 );
                  SubLObject done_var2 = NIL;
                  final SubLObject token_var2 = NIL;
                  while ( NIL == done_var2)
                  {
                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                    final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                    if( NIL != valid2 )
                    {
                      SubLObject final_index_iterator2 = NIL;
                      try
                      {
                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw3$GAF, $kw4$TRUE, NIL );
                        SubLObject done_var_$4 = NIL;
                        final SubLObject token_var_$5 = NIL;
                        while ( NIL == done_var_$4)
                        {
                          final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$5 );
                          final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( gaf2 ) );
                          if( NIL != valid_$6 && NIL != assertions_high.asserted_assertionP( gaf2 ) )
                          {
                            SubLObject argnum = ZERO_INTEGER;
                            SubLObject cdolist_list_var_$13;
                            final SubLObject args = cdolist_list_var_$13 = cycl_utilities.formula_args( assertions_high.gaf_formula( gaf2 ), $kw6$IGNORE );
                            SubLObject other_term2 = NIL;
                            other_term2 = cdolist_list_var_$13.first();
                            while ( NIL != cdolist_list_var_$13)
                            {
                              argnum = Numbers.add( argnum, ONE_INTEGER );
                              if( argnum.numG( ONE_INTEGER ) && NIL != forts.fort_p( other_term2 ) )
                              {
                                upward_ontology_closure_possibly_add_new_term_via( other_term2, total_set, unprocessed_queue, v_term );
                              }
                              cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                              other_term2 = cdolist_list_var_$13.first();
                            }
                          }
                          done_var_$4 = makeBoolean( NIL == valid_$6 );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values3 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator2 )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                          }
                          Values.restoreValuesFromVector( _values3 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                        }
                      }
                    }
                    done_var2 = makeBoolean( NIL == valid2 );
                  }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                arg_constraint_pred = cdolist_list_var2.first();
              }
            }
            if( NIL != fort_types_interface.predicateP( v_term ) )
            {
              SubLObject cdolist_list_var2 = $list7;
              SubLObject genl_predicate = NIL;
              genl_predicate = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                final SubLObject pred_var2 = genl_predicate;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var2 ) )
                {
                  final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var2 );
                  SubLObject done_var2 = NIL;
                  final SubLObject token_var2 = NIL;
                  while ( NIL == done_var2)
                  {
                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                    final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                    if( NIL != valid2 )
                    {
                      SubLObject final_index_iterator2 = NIL;
                      try
                      {
                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw3$GAF, $kw4$TRUE, NIL );
                        SubLObject done_var_$5 = NIL;
                        final SubLObject token_var_$6 = NIL;
                        while ( NIL == done_var_$5)
                        {
                          final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$6 );
                          final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( gaf2 ) );
                          if( NIL != valid_$7 && NIL != assertions_high.asserted_assertionP( gaf2 ) )
                          {
                            final SubLObject other_term3 = assertions_high.gaf_arg2( gaf2 );
                            upward_ontology_closure_possibly_add_new_term_via( other_term3, total_set, unprocessed_queue, v_term );
                          }
                          done_var_$5 = makeBoolean( NIL == valid_$7 );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values4 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator2 )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                          }
                          Values.restoreValuesFromVector( _values4 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                        }
                      }
                    }
                    done_var2 = makeBoolean( NIL == valid2 );
                  }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                genl_predicate = cdolist_list_var2.first();
              }
            }
            if( NIL != fort_types_interface.functionP( v_term ) )
            {
              SubLObject cdolist_list_var2 = $list8;
              SubLObject result_predicate = NIL;
              result_predicate = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                final SubLObject pred_var2 = result_predicate;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var2 ) )
                {
                  final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var2 );
                  SubLObject done_var2 = NIL;
                  final SubLObject token_var2 = NIL;
                  while ( NIL == done_var2)
                  {
                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                    final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                    if( NIL != valid2 )
                    {
                      SubLObject final_index_iterator2 = NIL;
                      try
                      {
                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw3$GAF, $kw4$TRUE, NIL );
                        SubLObject done_var_$6 = NIL;
                        final SubLObject token_var_$7 = NIL;
                        while ( NIL == done_var_$6)
                        {
                          final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$7 );
                          final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( gaf2 ) );
                          if( NIL != valid_$8 && NIL != assertions_high.asserted_assertionP( gaf2 ) )
                          {
                            final SubLObject other_term3 = assertions_high.gaf_arg2( gaf2 );
                            upward_ontology_closure_possibly_add_new_term_via( other_term3, total_set, unprocessed_queue, v_term );
                          }
                          done_var_$6 = makeBoolean( NIL == valid_$8 );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values5 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator2 )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                          }
                          Values.restoreValuesFromVector( _values5 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                        }
                      }
                    }
                    done_var2 = makeBoolean( NIL == valid2 );
                  }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                result_predicate = cdolist_list_var2.first();
              }
            }
            if( NIL == fort_types_interface.microtheory_p( v_term ) )
            {
              continue;
            }
            pred_var = $const9$genlMt;
            if( NIL == kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, ONE_INTEGER, pred_var ) )
            {
              continue;
            }
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, ONE_INTEGER, pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw3$GAF, $kw4$TRUE, NIL );
                  SubLObject done_var_$7 = NIL;
                  final SubLObject token_var_$8 = NIL;
                  while ( NIL == done_var_$7)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$8 );
                    final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( gaf ) );
                    if( NIL != valid_$9 && NIL != assertions_high.asserted_assertionP( gaf ) )
                    {
                      final SubLObject other_term = assertions_high.gaf_arg2( gaf );
                      upward_ontology_closure_possibly_add_new_term_via( other_term, total_set, unprocessed_queue, v_term );
                    }
                    done_var_$7 = makeBoolean( NIL == valid_$9 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values6 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values6 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      $upward_ontology_closure_trace$.rebind( _prev_bind_0, thread );
    }
    return total_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 6087L)
  public static SubLObject upward_ontology_closure_possibly_add_new_term_via(final SubLObject new_term, final SubLObject total_set, final SubLObject unprocessed_queue, final SubLObject source_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == set.set_memberP( new_term, total_set ) )
    {
      set.set_add( new_term, total_set );
      queues.enqueue( new_term, unprocessed_queue );
      if( NIL != $upward_ontology_closure_trace$.getDynamicValue( thread ) )
      {
        if( NIL != source_term )
        {
          format_nil.force_format( $upward_ontology_closure_trace$.getDynamicValue( thread ), $str10$___S_via__S, new_term, source_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          format_nil.force_format( $upward_ontology_closure_trace$.getDynamicValue( thread ), $str11$__seeding__S, new_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      return new_term;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/upward-ontology-closure.lisp", position = 6577L)
  public static SubLObject all_arg_constraint_preds()
  {
    return $list12;
  }

  public static SubLObject declare_upward_ontology_closure_file()
  {
    SubLFiles.declareFunction( me, "upward_ontology_closure_wrt_inference", "UPWARD-ONTOLOGY-CLOSURE-WRT-INFERENCE", 1, 2, false );
    SubLFiles.declareFunction( me, "inference_complete_vocabulary_wrt_answers", "INFERENCE-COMPLETE-VOCABULARY-WRT-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_complete_backward_theory_for_answers", "INFERENCE-COMPLETE-BACKWARD-THEORY-FOR-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "upward_ontology_closure", "UPWARD-ONTOLOGY-CLOSURE", 1, 2, false );
    SubLFiles.declareFunction( me, "upward_ontology_closure_possibly_add_new_term_via", "UPWARD-ONTOLOGY-CLOSURE-POSSIBLY-ADD-NEW-TERM-VIA", 4, 0, false );
    SubLFiles.declareFunction( me, "all_arg_constraint_preds", "ALL-ARG-CONSTRAINT-PREDS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_upward_ontology_closure_file()
  {
    $upward_ontology_closure_trace$ = SubLFiles.defparameter( "*UPWARD-ONTOLOGY-CLOSURE-TRACE*", NIL );
    return NIL;
  }

  public static SubLObject setup_upward_ontology_closure_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_upward_ontology_closure_file();
  }

  @Override
  public void initializeVariables()
  {
    init_upward_ontology_closure_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_upward_ontology_closure_file();
  }
  static
  {
    me = new upward_ontology_closure();
    $upward_ontology_closure_trace$ = null;
    $sym0$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $sym1$FORT_P = makeSymbol( "FORT-P" );
    $const2$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw3$GAF = makeKeyword( "GAF" );
    $kw4$TRUE = makeKeyword( "TRUE" );
    $const5$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw6$IGNORE = makeKeyword( "IGNORE" );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ) );
    $list8 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "resultIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "resultGenl" ) ) );
    $const9$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $str10$___S_via__S = makeString( "~%~S via ~S" );
    $str11$__seeding__S = makeString( "~%seeding ~S" );
    $list12 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg1Genl" ) ), constant_handles
        .reader_make_constant_shell( makeString( "arg2Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg2Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg3Isa" ) ),
      constant_handles.reader_make_constant_shell( makeString( "arg3Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg4Isa" ) ), constant_handles.reader_make_constant_shell( makeString(
          "arg4Genl" ) ), constant_handles.reader_make_constant_shell( makeString( "arg5Isa" ) ), constant_handles.reader_make_constant_shell( makeString( "arg5Genl" ) )
    } );
  }
}
/*
 * 
 * Total time: 805 ms
 * 
 */