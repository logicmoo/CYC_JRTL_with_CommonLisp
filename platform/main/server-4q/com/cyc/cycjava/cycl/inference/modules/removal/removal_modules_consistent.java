package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.conflicts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_consistent
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_consistent";
  public static final String myFingerPrint = "62f538f66c6010f9351e7722e22ebf103ecdd3f36c1440fc3b3206ba8eb31281";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 1846L)
  private static SubLSymbol $default_removal_consistent_check_cost$;
  private static final SubLObject $const0$consistent;
  private static final SubLSymbol $kw1$BOTH;
  private static final SubLSymbol $kw2$CONSISTENT;
  private static final SubLSymbol $kw3$REMOVAL_CONSISTENT_POS;
  private static final SubLList $list4;
  private static final SubLFloat $float5$1_5;
  private static final SubLObject $const6$thereExists;
  private static final SubLSymbol $kw7$QUERY;
  private static final SubLSymbol $kw8$REMOVAL_CONSISTENT_NEG;
  private static final SubLList $list9;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 826L)
  public static SubLObject removal_consistent_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current_mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    final SubLObject formula = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject consistent = inference_consistent_check( formula, current_mt );
    if( NIL != consistent )
    {
      final SubLObject hl_support = arguments.make_hl_support( $kw2$CONSISTENT, asent, UNPROVIDED, UNPROVIDED );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 1934L)
  public static SubLObject inference_consistent_check(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hypothetical_mt = NIL;
    SubLObject hypothesized_bindings = NIL;
    SubLObject done = NIL;
    SubLObject v_answer = NIL;
    try
    {
      if( NIL == done )
      {
        final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding( thread );
        try
        {
          control_vars.$negation_by_failure$.bind( NIL, thread );
          final SubLObject positive_result = ask_utilities.inference_recursive_query( formula, mt, UNPROVIDED );
          if( NIL != list_utilities.sublisp_boolean( positive_result ) )
          {
            v_answer = T;
            done = T;
          }
        }
        finally
        {
          control_vars.$negation_by_failure$.rebind( _prev_bind_0, thread );
        }
      }
      if( NIL == done && NIL == list_utilities.tree_find( $const6$thereExists, formula, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject negated_formula = cycl_utilities.negate( formula );
        final SubLObject _prev_bind_2 = control_vars.$negation_by_failure$.currentBinding( thread );
        try
        {
          control_vars.$negation_by_failure$.bind( NIL, thread );
          final SubLObject negated_result = ask_utilities.inference_recursive_query( negated_formula, mt, UNPROVIDED );
          if( NIL != list_utilities.sublisp_boolean( negated_result ) )
          {
            inference_note_inconsistent_supports( formula, mt, conses_high.second( negated_result.first() ) );
            v_answer = NIL;
            done = T;
          }
        }
        finally
        {
          control_vars.$negation_by_failure$.rebind( _prev_bind_2, thread );
        }
      }
      if( NIL == done )
      {
        hypothetical_mt = prove.hypothesize_spec_mt( mt, UNPROVIDED );
        hypothesized_bindings = prove.fi_hypothesize_int( formula, hypothetical_mt, UNPROVIDED, UNPROVIDED );
        v_answer = list_utilities.sublisp_boolean( hypothesized_bindings );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != hypothesized_bindings && NIL == bindings.unification_success_token_p( hypothesized_bindings ) )
        {
          SubLObject cdolist_list_var = hypothesized_bindings;
          SubLObject binding = NIL;
          binding = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject hypothetical_term = bindings.variable_binding_value( binding );
            if( NIL != forts.fort_p( hypothetical_term ) )
            {
              fi.fi_kill_int( hypothetical_term );
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
          }
        }
        if( NIL != hypothetical_mt && NIL != forts.fort_p( hlmt.hlmt_monad_mt( hypothetical_mt ) ) )
        {
          fi.fi_kill_int( hlmt.hlmt_monad_mt( hypothetical_mt ) );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 3683L)
  public static SubLObject inference_note_inconsistent_supports(final SubLObject formula, final SubLObject mt, final SubLObject supports)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$record_inconsistent_support_sets$.getDynamicValue( thread ) )
    {
      final SubLObject support = arguments.make_hl_support( $kw7$QUERY, formula, mt, UNPROVIDED );
      conflicts.add_inconsistent_support_set( ConsesLow.cons( support, supports ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 3949L)
  public static SubLObject removal_consistent_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current_mt = mt_relevance_macros.$mt$.getDynamicValue( thread );
    final SubLObject formula = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject inconsistent = inference_inconsistent_check( formula, current_mt );
    if( NIL != inconsistent )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw2$CONSISTENT, cycl_utilities.negate( asent ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 4947L)
  public static SubLObject inference_inconsistent_check(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hypothetical_mt = NIL;
    SubLObject hypothesized_bindings = NIL;
    SubLObject done = NIL;
    SubLObject v_answer = NIL;
    try
    {
      if( NIL == done )
      {
        final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding( thread );
        final SubLObject _prev_bind_2 = control_vars.$cache_inference_results$.currentBinding( thread );
        try
        {
          control_vars.$negation_by_failure$.bind( NIL, thread );
          control_vars.$cache_inference_results$.bind( NIL, thread );
          final SubLObject positive_result = ask_utilities.inference_recursive_query( formula, mt, UNPROVIDED );
          if( NIL != list_utilities.sublisp_boolean( positive_result ) )
          {
            v_answer = NIL;
            done = T;
          }
        }
        finally
        {
          control_vars.$cache_inference_results$.rebind( _prev_bind_2, thread );
          control_vars.$negation_by_failure$.rebind( _prev_bind_0, thread );
        }
      }
      if( NIL == done && NIL == list_utilities.tree_find( $const6$thereExists, formula, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject negated_formula = cycl_utilities.negate( formula );
        final SubLObject _prev_bind_3 = control_vars.$negation_by_failure$.currentBinding( thread );
        final SubLObject _prev_bind_4 = control_vars.$cache_inference_results$.currentBinding( thread );
        try
        {
          control_vars.$negation_by_failure$.bind( NIL, thread );
          control_vars.$cache_inference_results$.bind( NIL, thread );
          final SubLObject negated_result = ask_utilities.inference_recursive_query( negated_formula, mt, UNPROVIDED );
          if( NIL != list_utilities.sublisp_boolean( negated_result ) )
          {
            inference_note_inconsistent_supports( formula, mt, conses_high.second( negated_result.first() ) );
            v_answer = T;
            done = T;
          }
        }
        finally
        {
          control_vars.$cache_inference_results$.rebind( _prev_bind_4, thread );
          control_vars.$negation_by_failure$.rebind( _prev_bind_3, thread );
        }
      }
      if( NIL == done )
      {
        hypothetical_mt = prove.hypothesize_spec_mt( mt, UNPROVIDED );
        hypothesized_bindings = prove.fi_hypothesize_int( formula, hypothetical_mt, UNPROVIDED, UNPROVIDED );
        v_answer = makeBoolean( NIL == list_utilities.sublisp_boolean( hypothesized_bindings ) );
      }
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != hypothesized_bindings && NIL == bindings.unification_success_token_p( hypothesized_bindings ) )
        {
          SubLObject cdolist_list_var = hypothesized_bindings;
          SubLObject binding = NIL;
          binding = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject hypothetical_term = bindings.variable_binding_value( binding );
            if( NIL != forts.fort_p( hypothetical_term ) )
            {
              fi.fi_kill_int( hypothetical_term );
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
          }
        }
        if( NIL != hypothetical_mt && NIL != forts.fort_p( hlmt.hlmt_monad_mt( hypothetical_mt ) ) )
        {
          fi.fi_kill_int( hlmt.hlmt_monad_mt( hypothetical_mt ) );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return v_answer;
  }

  public static SubLObject declare_removal_modules_consistent_file()
  {
    SubLFiles.declareFunction( me, "removal_consistent_pos_expand", "REMOVAL-CONSISTENT-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_consistent_check", "INFERENCE-CONSISTENT-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_note_inconsistent_supports", "INFERENCE-NOTE-INCONSISTENT-SUPPORTS", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_consistent_neg_expand", "REMOVAL-CONSISTENT-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_inconsistent_check", "INFERENCE-INCONSISTENT-CHECK", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_consistent_file()
  {
    $default_removal_consistent_check_cost$ = SubLFiles.deflexical( "*DEFAULT-REMOVAL-CONSISTENT-CHECK-COST*", $float5$1_5 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_consistent_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$consistent );
    preference_modules.doomed_unless_all_args_bindable( $kw1$BOTH, $const0$consistent );
    inference_modules.inference_removal_module( $kw3$REMOVAL_CONSISTENT_POS, $list4 );
    inference_modules.inference_removal_module( $kw8$REMOVAL_CONSISTENT_NEG, $list9 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_consistent_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_consistent_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_consistent_file();
  }
  static
  {
    me = new removal_modules_consistent();
    $default_removal_consistent_check_cost$ = null;
    $const0$consistent = constant_handles.reader_make_constant_shell( makeString( "consistent" ) );
    $kw1$BOTH = makeKeyword( "BOTH" );
    $kw2$CONSISTENT = makeKeyword( "CONSISTENT" );
    $kw3$REMOVAL_CONSISTENT_POS = makeKeyword( "REMOVAL-CONSISTENT-POS" );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "consistent" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "consistent" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "EL-FORMULA-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REMOVAL-CONSISTENT-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "EXPAND" ), makeSymbol( "REMOVAL-CONSISTENT-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$consistent <fully-bound>)\nby hypothesizing the formula and checking for lack of a contradiction" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$consistent (#$languagesSpokenHere #$Texas-State #$SpanishLanguage))" )
    } );
    $float5$1_5 = makeDouble( 1.5 );
    $const6$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $kw7$QUERY = makeKeyword( "QUERY" );
    $kw8$REMOVAL_CONSISTENT_NEG = makeKeyword( "REMOVAL-CONSISTENT-NEG" );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "consistent" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "consistent" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "EL-FORMULA-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REMOVAL-CONSISTENT-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "EXPAND" ), makeSymbol( "REMOVAL-CONSISTENT-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$not (#$consistent <fully-bound>))\nby hypothesizing the formula and checking for a contradiction" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$not (#$consistent (#$bordersOn #$Canada #$Canada)))" )
    } );
  }
}
/*
 * 
 * Total time: 79 ms
 * 
 */