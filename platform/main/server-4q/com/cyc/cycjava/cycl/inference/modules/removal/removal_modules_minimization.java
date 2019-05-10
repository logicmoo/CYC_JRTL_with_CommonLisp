package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.harness.inference_trivial;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_minimization
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization";
  public static final String myFingerPrint = "4293429246dc9867d2d3d53382ff592b8783e3e55eb5227f53673eda04121a30";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 2689L)
  private static SubLSymbol $default_minimize_extent_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 4104L)
  private static SubLSymbol $default_completely_decidable_neg_cost$;
  private static final SubLObject $const0$unknownSentence;
  private static final SubLSymbol $kw1$MINIMIZE;
  private static final SubLSymbol $kw2$TRUE_DEF;
  private static final SubLSymbol $kw3$COMPLETENESS_MINIMIZATION_ALLOWED_;
  private static final SubLSymbol $kw4$UNKNOWN;
  private static final SubLFloat $float5$1_5;
  private static final SubLObject $const6$minimizeExtent;
  private static final SubLSymbol $kw7$GAF;
  private static final SubLSymbol $kw8$TRUE;
  private static final SubLSymbol $kw9$REMOVAL_MINIMIZE_EXTENT;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$REMOVAL_COMPLETELY_DECIDABLE_NEG;
  private static final SubLList $list12;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 926L)
  public static SubLObject make_minimization_support(final SubLObject minimized_sentence, final SubLObject mt)
  {
    final SubLObject sentence = el_utilities.make_unary_formula( $const0$unknownSentence, minimized_sentence );
    return arguments.make_hl_support( $kw1$MINIMIZE, sentence, mt, $kw2$TRUE_DEF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 1196L)
  public static SubLObject removal_completeness_minimization_allowedP()
  {
    final SubLObject store = inference_worker.currently_active_problem_store();
    if( NIL != store )
    {
      return inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP( store );
    }
    return inference_trivial.current_query_property_lookup( $kw3$COMPLETENESS_MINIMIZATION_ALLOWED_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 1471L)
  public static SubLObject removal_unprovable_negation(final SubLObject asent, final SubLObject mt, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != backward_utilities.direction_is_relevant( assertion ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$complete_extent_minimization$.currentBinding( thread );
      final SubLObject _prev_bind_3 = inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.currentBinding( thread );
      try
      {
        control_vars.$negation_by_failure$.bind( NIL, thread );
        control_vars.$complete_extent_minimization$.bind( NIL, thread );
        inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.bind( NIL, thread );
        if( $kw4$UNKNOWN == ask_utilities.inference_literal_truth( asent, mt ) )
        {
          final SubLObject hl_support = make_minimization_support( asent, mt );
          final SubLObject more_supports = ConsesLow.list( assertion );
          backward.removal_add_node( hl_support, NIL, more_supports );
        }
      }
      finally
      {
        inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.rebind( _prev_bind_3, thread );
        control_vars.$complete_extent_minimization$.rebind( _prev_bind_2, thread );
        control_vars.$negation_by_failure$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 2307L)
  public static SubLObject removal_minimize_extent_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL != inference_completeness_utilities.inference_minimize_extentP( cycl_utilities.atomic_sentence_predicate( asent ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 2756L)
  public static SubLObject removal_minimize_extent_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject pred_var = $const6$minimizeExtent;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( predicate, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( predicate, ONE_INTEGER, pred_var );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw7$GAF, $kw8$TRUE, NIL );
            SubLObject done_var_$1 = NIL;
            final SubLObject token_var_$2 = NIL;
            while ( NIL == done_var_$1)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
              final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
              if( NIL != valid_$3 )
              {
                removal_unprovable_negation( asent, mt_relevance_macros.inference_relevant_mt(), assertion );
              }
              done_var_$1 = makeBoolean( NIL == valid_$3 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 3652L)
  public static SubLObject removal_completely_decidable_neg_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return makeBoolean( NIL != removal_completeness_minimization_allowedP() && NIL != inference_completeness_utilities.inference_completely_decidable_asentP( asent, mt_relevance_macros.inference_relevant_mt() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 4180L)
  public static SubLObject removal_completely_decidable_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject cdolist_list_var;
    final SubLObject complete_extent_assertions = cdolist_list_var = inference_completeness_utilities.inference_completely_decidable_asent_gafs( asent, mt_relevance_macros.inference_relevant_mt() );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      removal_unprovable_negation( asent, mt_relevance_macros.inference_relevant_mt(), assertion );
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_minimization_file()
  {
    SubLFiles.declareFunction( me, "make_minimization_support", "MAKE-MINIMIZATION-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_completeness_minimization_allowedP", "REMOVAL-COMPLETENESS-MINIMIZATION-ALLOWED?", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_unprovable_negation", "REMOVAL-UNPROVABLE-NEGATION", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_minimize_extent_required", "REMOVAL-MINIMIZE-EXTENT-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_minimize_extent_expand", "REMOVAL-MINIMIZE-EXTENT-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_completely_decidable_neg_required", "REMOVAL-COMPLETELY-DECIDABLE-NEG-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_completely_decidable_neg_expand", "REMOVAL-COMPLETELY-DECIDABLE-NEG-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_minimization_file()
  {
    $default_minimize_extent_cost$ = SubLFiles.defparameter( "*DEFAULT-MINIMIZE-EXTENT-COST*", $float5$1_5 );
    $default_completely_decidable_neg_cost$ = SubLFiles.defparameter( "*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*", $float5$1_5 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_minimization_file()
  {
    inference_modules.inference_removal_module( $kw9$REMOVAL_MINIMIZE_EXTENT, $list10 );
    inference_modules.inference_removal_module( $kw11$REMOVAL_COMPLETELY_DECIDABLE_NEG, $list12 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_minimization_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_minimization_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_minimization_file();
  }
  static
  {
    me = new removal_modules_minimization();
    $default_minimize_extent_cost$ = null;
    $default_completely_decidable_neg_cost$ = null;
    $const0$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $kw1$MINIMIZE = makeKeyword( "MINIMIZE" );
    $kw2$TRUE_DEF = makeKeyword( "TRUE-DEF" );
    $kw3$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword( "COMPLETENESS-MINIMIZATION-ALLOWED?" );
    $kw4$UNKNOWN = makeKeyword( "UNKNOWN" );
    $float5$1_5 = makeDouble( 1.5 );
    $const6$minimizeExtent = constant_handles.reader_make_constant_shell( makeString( "minimizeExtent" ) );
    $kw7$GAF = makeKeyword( "GAF" );
    $kw8$TRUE = makeKeyword( "TRUE" );
    $kw9$REMOVAL_MINIMIZE_EXTENT = makeKeyword( "REMOVAL-MINIMIZE-EXTENT" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.cons( makeKeyword( "FORT" ), makeKeyword(
        "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-MINIMIZE-EXTENT-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-MINIMIZE-EXTENT-COST*" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-MINIMIZE-EXTENT-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$not (<predicate> . <fully bound>))\n    from (#$minimizeExtent <predicate>)\n    when negation-by-failure is enabled" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$not (#$citizens #$AbrahamLincoln #$France))\n    from (#$minimizeExtent #$citizens)" )
    } );
    $kw11$REMOVAL_COMPLETELY_DECIDABLE_NEG = makeKeyword( "REMOVAL-COMPLETELY-DECIDABLE-NEG" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.cons( makeKeyword( "FORT" ), makeKeyword(
        "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-COMPLETELY-DECIDABLE-NEG-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*" ), makeKeyword(
            "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-COMPLETELY-DECIDABLE-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$not (<predicate> . <fully bound>))\n    from (#$completeExtentDecidable <predicate>)\n    or   (#$completeExtentDecidableForValueInArg <predicate> <fort> <argnum>" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$not (#$bordersOn #$Canada #$France))\n    from (#$completeExtentDecidable #$bordersOn)" )
    } );
  }
}
/*
 * 
 * Total time: 46 ms
 * 
 */