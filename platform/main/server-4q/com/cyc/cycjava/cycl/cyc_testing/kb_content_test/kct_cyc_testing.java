package com.cyc.cycjava.cycl.cyc_testing.kb_content_test;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.cycjava.cycl.inference.kbq_query_run;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kct_cyc_testing
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing";
  public static final String myFingerPrint = "b99531f535b5ed50bd2b5865f41dae5e7da6902f11faab58a4875f01953c40ed";
  private static final SubLSymbol $kw0$FULL;
  private static final SubLObject $const1$Now;
  private static final SubLObject $const2$Null_TimeParameter;
  private static final SubLObject $const3$testResponsibleCyclist;
  private static final SubLSymbol $sym4$FORT_P;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$KCT_TEST_SPEC_PERMISSIVE_P;
  private static final SubLObject $const7$testResponsibleProject;
  private static final SubLObject $const8$CycorpBusinessDatabaseMt;
  private static final SubLObject $const9$OngoingStatus;
  private static final SubLObject $const10$KBContentRegressionTest;
  private static final SubLObject $const11$KBContentPostBuildTest;
  private static final SubLSymbol $kw12$BROWSABLE_;
  private static final SubLSymbol $kw13$BLOCK_;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$VERBOSE;
  private static final SubLSymbol $kw16$KCT;
  private static final SubLSymbol $kw17$SUCCESS;
  private static final SubLSymbol $kw18$REGRESSION_SUCCESS;
  private static final SubLSymbol $kw19$NON_REGRESSION_SUCCESS;
  private static final SubLSymbol $kw20$FAILURE;
  private static final SubLSymbol $kw21$REGRESSION_FAILURE;
  private static final SubLSymbol $kw22$NON_REGRESSION_FAILURE;
  private static final SubLObject $const23$KBContentTest_FullySpecified;
  private static final SubLSymbol $sym24$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const25$EverythingPSC;
  private static final SubLObject $const26$isa;
  private static final SubLSymbol $kw27$BREADTH;
  private static final SubLSymbol $kw28$QUEUE;
  private static final SubLSymbol $kw29$STACK;
  private static final SubLSymbol $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw31$ERROR;
  private static final SubLString $str32$_A_is_not_a__A;
  private static final SubLSymbol $sym33$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw34$CERROR;
  private static final SubLString $str35$continue_anyway;
  private static final SubLSymbol $kw36$WARN;
  private static final SubLString $str37$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str38$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str39$attempting_to_bind_direction_link;
  private static final SubLList $list40;
  private static final SubLString $str41$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLObject $const42$HLPrototypicalTerm;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 865L)
  public static SubLObject kct_test_spec_name(final SubLObject test_spec)
  {
    return test_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 931L)
  public static SubLObject kct_test_spec_kb(final SubLObject test_spec)
  {
    return $kw0$FULL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 1012L)
  public static SubLObject kct_test_spec_owner(final SubLObject test_spec)
  {
    final SubLObject v_hlmt = hlmt.new_temporal_hlmt( kct_variables.kct_mt(), $const1$Now, $const2$Null_TimeParameter );
    final SubLObject cyclist = kb_mapping_utilities.fpred_value_in_relevant_mts( test_spec, $const3$testResponsibleCyclist, v_hlmt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != cyclist )
    {
      final SubLObject username = kb_accessors.local_email_address_text( cyclist );
      return username;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 1314L)
  public static SubLObject kcts_owned_by(final SubLObject cyclist)
  {
    assert NIL != forts.fort_p( cyclist ) : cyclist;
    final SubLObject mt = $list5;
    return list_utilities.remove_if_not( $sym6$KCT_TEST_SPEC_PERMISSIVE_P, kb_mapping_utilities.pred_values_in_relevant_mts( cyclist, $const3$testResponsibleCyclist, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 1691L)
  public static SubLObject kct_test_spec_project(final SubLObject test_spec)
  {
    final SubLObject v_hlmt = hlmt.new_temporal_hlmt( kct_variables.kct_mt(), $const1$Now, $const2$Null_TimeParameter );
    final SubLObject project = kb_mapping_utilities.fpred_value_in_relevant_mts( test_spec, $const7$testResponsibleProject, v_hlmt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return project;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 1916L)
  public static SubLObject project_currentP(final SubLObject project)
  {
    final SubLObject v_hlmt = hlmt.new_temporal_hlmt( $const8$CycorpBusinessDatabaseMt, $const1$Now, $const2$Null_TimeParameter );
    return isa.isaP( project, $const9$OngoingStatus, v_hlmt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 2120L)
  public static SubLObject kct_test_spec_workingP(final SubLObject test_spec)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 2308L)
  public static SubLObject kct_test_spec_mentions_invalid_constantP(final SubLObject test_spec)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 2429L)
  public static SubLObject kct_test_spec_invalid_constants(final SubLObject test_spec)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 2541L)
  public static SubLObject kct_test_spec_comment(final SubLObject test_spec)
  {
    return kb_accessors.comment( test_spec, kct_variables.kct_mt() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 2629L)
  public static SubLObject kb_content_regression_testP(final SubLObject test_spec)
  {
    return makeBoolean( NIL != forts.fort_p( test_spec ) && NIL != isa.isaP( test_spec, $const10$KBContentRegressionTest, kct_variables.kct_mt(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 2778L)
  public static SubLObject kb_content_post_build_testP(final SubLObject test_spec)
  {
    return makeBoolean( NIL != forts.fort_p( test_spec ) && NIL != isa.isaP( test_spec, $const11$KBContentPostBuildTest, kct_variables.kct_mt(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 2926L)
  public static SubLObject kct_run_test_as_cyc_test(final SubLObject test_spec, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cyc_test_run = NIL;
    SubLObject overriding_query_properties = NIL;
    if( NIL != browsableP )
    {
      overriding_query_properties = conses_high.putf( overriding_query_properties, $kw12$BROWSABLE_, T );
    }
    if( NIL != blockP )
    {
      overriding_query_properties = conses_high.putf( overriding_query_properties, $kw13$BLOCK_, T );
    }
    final SubLObject _prev_bind_0 = control_vars.$kbq_run_query_auto_destroy_enabledP$.currentBinding( thread );
    try
    {
      control_vars.$kbq_run_query_auto_destroy_enabledP$.bind( ( NIL != browsableP ) ? NIL : control_vars.$kbq_run_query_auto_destroy_enabledP$.getDynamicValue( thread ), thread );
      final SubLObject kct_test_run = kbq_query_run.kct_run_test( test_spec, $list14, kbq_query_run.$kbq_outlier_timeout$.getDynamicValue( thread ), overriding_query_properties, T, UNPROVIDED );
      print_kct_test_run_details( kct_test_run, stream, output_format, verbosity );
      cyc_test_run = kct_test_run_to_cyc_test_run( kct_test_run );
      cyc_testing.print_cyc_test_run_summary( cyc_test_run, stream, output_format, verbosity );
    }
    finally
    {
      control_vars.$kbq_run_query_auto_destroy_enabledP$.rebind( _prev_bind_0, thread );
    }
    return cyc_test_run;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 3790L)
  public static SubLObject print_kct_test_run_details(final SubLObject kct_test_run, final SubLObject stream, final SubLObject output_format, final SubLObject verbosity)
  {
    if( verbosity == $kw15$VERBOSE )
    {
      print_high.print( kct_test_run, stream );
      streams_high.terpri( stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 4006L)
  public static SubLObject kct_test_set_run_to_cyc_test_runs(final SubLObject test_set_run)
  {
    return kct_test_set_run_to_cyc_test_runs_int( test_set_run, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 4137L)
  public static SubLObject kct_regression_test_set_run_to_cyc_test_runs(final SubLObject test_set_run)
  {
    return kct_test_set_run_to_cyc_test_runs_int( test_set_run, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 4428L)
  public static SubLObject kct_test_set_run_to_cyc_test_runs_int(final SubLObject test_set_run, final SubLObject regression_tests_onlyP)
  {
    SubLObject cyc_test_runs = NIL;
    SubLObject cdolist_list_var;
    final SubLObject kct_test_runs = cdolist_list_var = kbq_query_run.kct_test_set_run_test_runs( test_set_run );
    SubLObject kct_test_run = NIL;
    kct_test_run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cyc_test_run = kct_test_run_to_cyc_test_run_int( kct_test_run, regression_tests_onlyP );
      cyc_test_runs = ConsesLow.cons( cyc_test_run, cyc_test_runs );
      cdolist_list_var = cdolist_list_var.rest();
      kct_test_run = cdolist_list_var.first();
    }
    return Sequences.nreverse( cyc_test_runs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 4837L)
  public static SubLObject kct_test_run_to_cyc_test_run(final SubLObject kct_test_run)
  {
    return kct_test_run_to_cyc_test_run_int( kct_test_run, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 4958L)
  public static SubLObject kct_test_run_to_cyc_test_run_int(final SubLObject kct_test_run, final SubLObject regression_tests_onlyP)
  {
    final SubLObject type = $kw16$KCT;
    final SubLObject name = kbq_query_run.kct_test_run_test( kct_test_run );
    SubLObject result = kbq_query_run.kct_test_run_status( kct_test_run );
    final SubLObject query_run = kbq_query_run.kct_test_run_query_run( kct_test_run );
    final SubLObject time = kbq_query_run.kbq_query_run_total_time( query_run );
    if( NIL != regression_tests_onlyP )
    {
      final SubLObject pcase_var = result;
      if( pcase_var.eql( $kw17$SUCCESS ) )
      {
        if( NIL != kb_content_regression_testP( name ) )
        {
          result = $kw18$REGRESSION_SUCCESS;
        }
        else
        {
          result = $kw19$NON_REGRESSION_SUCCESS;
        }
      }
      else if( pcase_var.eql( $kw20$FAILURE ) )
      {
        if( NIL != kb_content_regression_testP( name ) )
        {
          result = $kw21$REGRESSION_FAILURE;
        }
        else
        {
          result = $kw22$NON_REGRESSION_FAILURE;
        }
      }
    }
    return cyc_testing.new_cyc_test_run( type, name, result, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 5667L)
  public static SubLObject load_all_kb_content_tests()
  {
    return load_kb_content_tests_int( $const23$KBContentTest_FullySpecified );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 5950L)
  public static SubLObject load_all_kb_content_regression_tests()
  {
    return load_kb_content_tests_int( $const10$KBContentRegressionTest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 6163L)
  public static SubLObject load_all_kb_content_post_build_tests()
  {
    return load_kb_content_tests_int( $const11$KBContentPostBuildTest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 6375L)
  public static SubLObject load_kb_content_tests_int(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym24$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const25$EverythingPSC, thread );
      final SubLObject _prev_bind_0_$1 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      final SubLObject _prev_bind_1_$2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const26$isa ), thread );
        sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          SubLObject node_var_$3 = col;
          final SubLObject deck_type = $kw29$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = NIL;
              final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw31$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw34$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw36$WARN ) )
                  {
                    Errors.warn( $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str37$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str35$continue_anyway, $str32$_A_is_not_a__A, tv_var, $sym33$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const26$isa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const26$isa ) ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const26$isa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const26$isa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( col, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const26$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$3, UNPROVIDED );
                      while ( NIL != node_var_$3)
                      {
                        final SubLObject tt_node_var = node_var_$3;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const26$isa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$6 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const26$isa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        SubLObject iteration_state_$15;
                                        for( iteration_state_$15 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$15 ); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next( iteration_state_$15 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$15 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject test_spec;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  test_spec = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, test_spec ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test_spec,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( test_spec, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( test_spec ) && NIL != define_kct( test_spec ) )
                                                    {
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject test_spec2 = NIL;
                                                test_spec2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test_spec2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( test_spec2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( test_spec2 ) && NIL != define_kct( test_spec2 ) )
                                                    {
                                                      count = Numbers.add( count, ONE_INTEGER );
                                                    }
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  test_spec2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$8, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$15 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$7, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                SubLObject instance_tuple = NIL;
                                instance_tuple = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  SubLObject current;
                                  final SubLObject datum = current = instance_tuple;
                                  SubLObject link_node = NIL;
                                  SubLObject mt2 = NIL;
                                  SubLObject tv2 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
                                  mt2 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
                                  tv2 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                    {
                                      final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                            final SubLObject sol;
                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject test_spec;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                test_spec = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, test_spec ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test_spec,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( test_spec, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( test_spec ) && NIL != define_kct( test_spec ) )
                                                  {
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$19 = sol;
                                              SubLObject test_spec2 = NIL;
                                              test_spec2 = csome_list_var_$19.first();
                                              while ( NIL != csome_list_var_$19)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test_spec2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( test_spec2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( test_spec2 ) && NIL != define_kct( test_spec2 ) )
                                                  {
                                                    count = Numbers.add( count, ONE_INTEGER );
                                                  }
                                                }
                                                csome_list_var_$19 = csome_list_var_$19.rest();
                                                test_spec2 = csome_list_var_$19.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$10, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$9, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list40 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$20;
                              final SubLObject new_list = cdolist_list_var_$20 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const26$isa ) ), sbhl_search_vars.$sbhl_tv$
                                      .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const26$isa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$20.first();
                              while ( NIL != cdolist_list_var_$20)
                              {
                                final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject test_spec3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      test_spec3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, test_spec3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test_spec3,
                                          sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( test_spec3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( test_spec3 ) && NIL != define_kct( test_spec3 ) )
                                        {
                                          count = Numbers.add( count, ONE_INTEGER );
                                        }
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject test_spec4 = NIL;
                                    test_spec4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test_spec4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( test_spec4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( test_spec4 ) && NIL != define_kct( test_spec4 ) )
                                        {
                                          count = Numbers.add( count, ONE_INTEGER );
                                        }
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      test_spec4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$11, thread );
                                }
                                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                                generating_fn = cdolist_list_var_$20.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$6, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$6, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const26$isa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$3 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                            {
                              final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link2 )
                              {
                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links2 )
                                {
                                  SubLObject iteration_state2;
                                  for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                    {
                                      final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                        SubLObject iteration_state_$16;
                                        for( iteration_state_$16 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$16 ); iteration_state_$16 = dictionary_contents.do_dictionary_contents_next( iteration_state_$16 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$16 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol3 = link_nodes4;
                                              if( NIL != set.set_p( sol3 ) )
                                              {
                                                final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                SubLObject basis_object3;
                                                SubLObject state3;
                                                SubLObject node_vars_link_node;
                                                for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                    set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol3.isList() )
                                              {
                                                SubLObject csome_list_var4 = sol3;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var4.first();
                                                while ( NIL != csome_list_var4)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var4 = csome_list_var4.rest();
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$14, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$16 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$13, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$21;
                              final SubLObject new_list2 = cdolist_list_var_$21 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$21.first();
                              while ( NIL != cdolist_list_var_$21)
                              {
                                final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                  final SubLObject sol4;
                                  final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                  if( NIL != set.set_p( sol4 ) )
                                  {
                                    final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                    SubLObject basis_object4;
                                    SubLObject state4;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                        set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol4.isList() )
                                  {
                                    SubLObject csome_list_var5 = sol4;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var5.first();
                                    while ( NIL != csome_list_var5)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var5 = csome_list_var5.rest();
                                      node_vars_link_node4 = csome_list_var5.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str38$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$15, thread );
                                }
                                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                generating_fn2 = cdolist_list_var_$21.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$7, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$12, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$3 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$11, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$5, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$5, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str41$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                        UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$4, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$4, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$3, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$3, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$2, thread );
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 6575L)
  public static SubLObject define_kct(final SubLObject test_spec)
  {
    return ( NIL != isa.quoted_isa_in_any_mtP( test_spec, $const42$HLPrototypicalTerm ) ) ? NIL : kct_test_spec_to_cyc_test( test_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-cyc-testing.lisp", position = 6799L)
  public static SubLObject kct_test_spec_to_cyc_test(final SubLObject test_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject name = kct_test_spec_name( test_spec );
    return cyc_testing.new_cyc_test( cyc_testing.$cyc_test_filename$.getDynamicValue( thread ), name );
  }

  public static SubLObject declare_kct_cyc_testing_file()
  {
    SubLFiles.declareFunction( me, "kct_test_spec_name", "KCT-TEST-SPEC-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_spec_kb", "KCT-TEST-SPEC-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_spec_owner", "KCT-TEST-SPEC-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "kcts_owned_by", "KCTS-OWNED-BY", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_spec_project", "KCT-TEST-SPEC-PROJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "project_currentP", "PROJECT-CURRENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_spec_workingP", "KCT-TEST-SPEC-WORKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_spec_mentions_invalid_constantP", "KCT-TEST-SPEC-MENTIONS-INVALID-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_spec_invalid_constants", "KCT-TEST-SPEC-INVALID-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_spec_comment", "KCT-TEST-SPEC-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_content_regression_testP", "KB-CONTENT-REGRESSION-TEST?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_content_post_build_testP", "KB-CONTENT-POST-BUILD-TEST?", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_run_test_as_cyc_test", "KCT-RUN-TEST-AS-CYC-TEST", 6, 0, false );
    SubLFiles.declareFunction( me, "print_kct_test_run_details", "PRINT-KCT-TEST-RUN-DETAILS", 4, 0, false );
    SubLFiles.declareFunction( me, "kct_test_set_run_to_cyc_test_runs", "KCT-TEST-SET-RUN-TO-CYC-TEST-RUNS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_regression_test_set_run_to_cyc_test_runs", "KCT-REGRESSION-TEST-SET-RUN-TO-CYC-TEST-RUNS", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_set_run_to_cyc_test_runs_int", "KCT-TEST-SET-RUN-TO-CYC-TEST-RUNS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_test_run_to_cyc_test_run", "KCT-TEST-RUN-TO-CYC-TEST-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_run_to_cyc_test_run_int", "KCT-TEST-RUN-TO-CYC-TEST-RUN-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "load_all_kb_content_tests", "LOAD-ALL-KB-CONTENT-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "load_all_kb_content_regression_tests", "LOAD-ALL-KB-CONTENT-REGRESSION-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "load_all_kb_content_post_build_tests", "LOAD-ALL-KB-CONTENT-POST-BUILD-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "load_kb_content_tests_int", "LOAD-KB-CONTENT-TESTS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "define_kct", "DEFINE-KCT", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_spec_to_cyc_test", "KCT-TEST-SPEC-TO-CYC-TEST", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_kct_cyc_testing_file()
  {
    return NIL;
  }

  public static SubLObject setup_kct_cyc_testing_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kct_cyc_testing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kct_cyc_testing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kct_cyc_testing_file();
  }
  static
  {
    me = new kct_cyc_testing();
    $kw0$FULL = makeKeyword( "FULL" );
    $const1$Now = constant_handles.reader_make_constant_shell( makeString( "Now" ) );
    $const2$Null_TimeParameter = constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) );
    $const3$testResponsibleCyclist = constant_handles.reader_make_constant_shell( makeString( "testResponsibleCyclist" ) );
    $sym4$FORT_P = makeSymbol( "FORT-P" );
    $list5 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), constant_handles.reader_make_constant_shell( makeString( "TestVocabularyMt" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ) );
    $sym6$KCT_TEST_SPEC_PERMISSIVE_P = makeSymbol( "KCT-TEST-SPEC-PERMISSIVE-P" );
    $const7$testResponsibleProject = constant_handles.reader_make_constant_shell( makeString( "testResponsibleProject" ) );
    $const8$CycorpBusinessDatabaseMt = constant_handles.reader_make_constant_shell( makeString( "CycorpBusinessDatabaseMt" ) );
    $const9$OngoingStatus = constant_handles.reader_make_constant_shell( makeString( "OngoingStatus" ) );
    $const10$KBContentRegressionTest = constant_handles.reader_make_constant_shell( makeString( "KBContentRegressionTest" ) );
    $const11$KBContentPostBuildTest = constant_handles.reader_make_constant_shell( makeString( "KBContentPostBuildTest" ) );
    $kw12$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $kw13$BLOCK_ = makeKeyword( "BLOCK?" );
    $list14 = ConsesLow.list( makeKeyword( "TOTAL-TIME" ) );
    $kw15$VERBOSE = makeKeyword( "VERBOSE" );
    $kw16$KCT = makeKeyword( "KCT" );
    $kw17$SUCCESS = makeKeyword( "SUCCESS" );
    $kw18$REGRESSION_SUCCESS = makeKeyword( "REGRESSION-SUCCESS" );
    $kw19$NON_REGRESSION_SUCCESS = makeKeyword( "NON-REGRESSION-SUCCESS" );
    $kw20$FAILURE = makeKeyword( "FAILURE" );
    $kw21$REGRESSION_FAILURE = makeKeyword( "REGRESSION-FAILURE" );
    $kw22$NON_REGRESSION_FAILURE = makeKeyword( "NON-REGRESSION-FAILURE" );
    $const23$KBContentTest_FullySpecified = constant_handles.reader_make_constant_shell( makeString( "KBContentTest-FullySpecified" ) );
    $sym24$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const25$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const26$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw27$BREADTH = makeKeyword( "BREADTH" );
    $kw28$QUEUE = makeKeyword( "QUEUE" );
    $kw29$STACK = makeKeyword( "STACK" );
    $sym30$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw31$ERROR = makeKeyword( "ERROR" );
    $str32$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym33$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw34$CERROR = makeKeyword( "CERROR" );
    $str35$continue_anyway = makeString( "continue anyway" );
    $kw36$WARN = makeKeyword( "WARN" );
    $str37$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str38$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str39$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list40 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str41$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $const42$HLPrototypicalTerm = constant_handles.reader_make_constant_shell( makeString( "HLPrototypicalTerm" ) );
  }
}
/*
 * 
 * Total time: 1099 ms
 * 
 */