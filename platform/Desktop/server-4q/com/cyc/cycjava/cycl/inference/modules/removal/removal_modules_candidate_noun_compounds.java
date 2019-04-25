package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.candidate_nc_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_candidate_noun_compounds
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_candidate_noun_compounds";
  public static final String myFingerPrint = "b7ca3125e41cb2428aedd0ce9d723cff01061af2d56e2a3909dc49b9d111e75b";
  private static final SubLObject $const0$datedCandidateNCTestHasResults;
  private static final SubLSymbol $kw1$DATED_CNC_TEST_FOR_NCR_UNIFY_ARGS_2_AND_3;
  private static final SubLList $list2;
  private static final SubLObject $const3$aggregateCNCScoreForRuleWithThres;
  private static final SubLSymbol $kw4$AGGREGATE_NC_SCORE_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$AGGREGATE_NC_SCORE_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4;
  private static final SubLList $list7;
  private static final SubLObject $const8$aggregateCNCResultForRuleWithThre;
  private static final SubLSymbol $kw9$AGGREGATE_NC_RESULT_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$AGGREGATE_NC_RESULT_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$DATED_CNC_TEST_FOR_NCR_REQUIRE_ARG1_FULLY_BOUND;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_2_FULLY_BOUND;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_3_FULLY_BOUND;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$IMAGE_INDEPENDENT_CFASL;
  private static final SubLSymbol $sym20$CONTAINS_INVALID_FORT_;
  private static final SubLSymbol $sym21$CONTAINS_SERVER_ERROR_;
  private static final SubLObject $const22$Google_SearchEngine;
  private static final SubLSymbol $kw23$GOOGLE;
  private static final SubLObject $const24$Yahoo_SearchEngine;
  private static final SubLSymbol $kw25$YAHOO;
  private static final SubLSymbol $kw26$SERVER_ERROR;
  private static final SubLString $str27$The_head_denot_for__S_is_an_inval;
  private static final SubLString $str28$The_modifier_denot_for__S_is_an_i;
  private static final SubLInteger $int29$15552000;
  private static final SubLSymbol $sym30$EMPTY_CNC_TEST_;
  private static final SubLString $str31$_;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 8502L)
  public static SubLObject check_dated_cnc_test_for_rule(final SubLObject rule, final SubLObject date, final SubLObject result, final SubLObject engine)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule_el = cycl_utilities.hl_to_el( rule );
    final SubLObject value = ConsesLow.list( date, result );
    final SubLObject key = ConsesLow.list( rule_el, engine );
    final SubLObject tests = candidate_nc_utilities.cnc_get_from_fht( key, candidate_nc_utilities.$scored_ncr_table$.getDynamicValue( thread ) );
    return subl_promotions.memberP( value, tests, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 8813L)
  public static SubLObject get_cnc_test_results_and_dates(final SubLObject rule, final SubLObject engine)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule_el = cycl_utilities.hl_to_el( rule );
    final SubLObject key = ConsesLow.list( rule_el, engine );
    final SubLObject tests = remove_empty_cnc_tests( candidate_nc_utilities.cnc_get_from_fht( key, candidate_nc_utilities.$scored_ncr_table$.getDynamicValue( thread ) ) );
    return tests;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 9037L)
  public static SubLObject get_aggregate_cnc_score_w_thresholds(final SubLObject rule, final SubLObject compound_threshold, final SubLObject component_threshold, final SubLObject engine)
  {
    return ConsesLow.list( conses_high.second( evaluate_aggregate_cnc_results_w_thresholds( rule, compound_threshold, component_threshold, engine ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 9267L)
  public static SubLObject get_aggregate_score_for_all_w_thresholds(final SubLObject compound_threshold, final SubLObject component_threshold, final SubLObject engine)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject covered_rules = NIL;
    SubLObject results = NIL;
    SubLObject fht = NIL;
    try
    {
      fht = file_hash_table.open_file_hash_table_read_only( candidate_nc_utilities.$scored_ncr_table$.getDynamicValue( thread ), EQUAL, $kw19$IMAGE_INDEPENDENT_CFASL );
      SubLObject continuation = NIL;
      SubLObject next;
      for( SubLObject completeP = NIL; NIL == completeP; completeP = Types.sublisp_null( next ) )
      {
        thread.resetMultipleValues();
        final SubLObject the_key = file_hash_table.get_file_hash_table_any( fht, continuation, NIL );
        final SubLObject the_value = thread.secondMultipleValue();
        next = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != next )
        {
          final SubLObject key = the_key;
          final SubLObject value = the_value;
          covered_rules = ConsesLow.cons( key.first(), covered_rules );
        }
        continuation = next;
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != file_hash_table.file_hash_table_p( fht ) )
        {
          file_hash_table.finalize_file_hash_table( fht );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject cdolist_list_var = covered_rules;
    SubLObject rule = NIL;
    rule = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject score = get_aggregate_cnc_score_w_thresholds( rule, compound_threshold, component_threshold, engine );
      if( NIL != score.first() )
      {
        results = ConsesLow.cons( ConsesLow.cons( rule, score ), results );
      }
      cdolist_list_var = cdolist_list_var.rest();
      rule = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 9857L)
  public static SubLObject get_aggregate_results_for_all_w_thresholds(final SubLObject compound_threshold, final SubLObject component_threshold, final SubLObject engine)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject covered_rules = NIL;
    SubLObject results = NIL;
    SubLObject fht = NIL;
    try
    {
      fht = file_hash_table.open_file_hash_table_read_only( candidate_nc_utilities.$scored_ncr_table$.getDynamicValue( thread ), EQUAL, $kw19$IMAGE_INDEPENDENT_CFASL );
      SubLObject continuation = NIL;
      SubLObject next;
      for( SubLObject completeP = NIL; NIL == completeP; completeP = Types.sublisp_null( next ) )
      {
        thread.resetMultipleValues();
        final SubLObject the_key = file_hash_table.get_file_hash_table_any( fht, continuation, NIL );
        final SubLObject the_value = thread.secondMultipleValue();
        next = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != next )
        {
          final SubLObject key = the_key;
          final SubLObject value = the_value;
          covered_rules = ConsesLow.cons( key.first(), covered_rules );
        }
        continuation = next;
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != file_hash_table.file_hash_table_p( fht ) )
        {
          file_hash_table.finalize_file_hash_table( fht );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject cdolist_list_var = covered_rules;
    SubLObject rule = NIL;
    rule = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject eval_result = evaluate_aggregate_cnc_results_w_thresholds( rule, compound_threshold, component_threshold, engine );
      if( NIL != eval_result.first() )
      {
        results = ConsesLow.cons( ConsesLow.list( rule, eval_result ), results );
      }
      cdolist_list_var = cdolist_list_var.rest();
      rule = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 10470L)
  public static SubLObject get_aggregate_cnc_results_w_thresholds(final SubLObject rule, final SubLObject threshold1, final SubLObject threshold2, final SubLObject engine)
  {
    final SubLObject v_answer = evaluate_aggregate_cnc_results_w_thresholds( rule, threshold1, threshold2, engine );
    return removal_module_utilities.non_null_answer_to_singleton( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 10711L)
  public static SubLObject remove_errors_from_cnc_test_results(final SubLObject test_results_list)
  {
    return Sequences.delete_if( $sym20$CONTAINS_INVALID_FORT_, Sequences.delete_if( $sym21$CONTAINS_SERVER_ERROR_, test_results_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 10883L)
  public static SubLObject get_search_engine_keyword(final SubLObject engine)
  {
    final SubLObject engine_keyword = engine.equal( $const22$Google_SearchEngine ) ? $kw23$GOOGLE : ( engine.equal( $const24$Yahoo_SearchEngine ) ? $kw25$YAHOO : engine );
    return engine_keyword;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 11190L)
  public static SubLObject contains_server_errorP(final SubLObject test_item)
  {
    return cycl_utilities.expression_find( $kw26$SERVER_ERROR, test_item, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 11293L)
  public static SubLObject contains_invalid_fortP(final SubLObject test_item)
  {
    final SubLObject mod_denot = conses_high.fourth( test_item );
    final SubLObject head_denot = conses_high.fifth( test_item );
    SubLObject result = NIL;
    if( NIL != forts.invalid_fortP( mod_denot ) )
    {
      Errors.warn( $str27$The_head_denot_for__S_is_an_inval, test_item );
      result = T;
    }
    if( NIL != forts.invalid_fortP( head_denot ) )
    {
      Errors.warn( $str28$The_modifier_denot_for__S_is_an_i, test_item );
      result = T;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 11718L)
  public static SubLObject evaluate_aggregate_cnc_results_w_thresholds(final SubLObject rule, final SubLObject compound_threshold, final SubLObject component_threshold, final SubLObject engine)
  {
    final SubLObject aggregate_result = aggregate_cnc_results_for_rule( rule, engine, UNPROVIDED );
    final SubLObject score_tuple = candidate_nc_utilities.evaluate_cnc_results_w_thresholds( aggregate_result, compound_threshold, component_threshold );
    return score_tuple;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 12045L)
  public static SubLObject aggregate_cnc_results_for_rule(final SubLObject rule, final SubLObject engine, SubLObject cutoff_date)
  {
    if( cutoff_date == UNPROVIDED )
    {
      cutoff_date = Numbers.subtract( Time.get_universal_time(), $int29$15552000 );
    }
    final SubLObject stored_results = get_cnc_test_results_and_dates( rule, engine );
    SubLObject earliest_date = NIL;
    SubLObject aggregate_data = NIL;
    SubLObject cdolist_list_var = stored_results;
    SubLObject test = NIL;
    test = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject date = test.first();
      final SubLObject data = conses_high.second( test );
      if( date.numGE( cutoff_date ) )
      {
        aggregate_data = ConsesLow.append( data, aggregate_data );
        if( NIL == earliest_date )
        {
          earliest_date = date;
        }
        if( date.numL( earliest_date ) )
        {
          earliest_date = date;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      test = cdolist_list_var.first();
    }
    aggregate_data = Sequences.remove_duplicates( aggregate_data, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ConsesLow.list( earliest_date, aggregate_data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 12702L)
  public static SubLObject empty_cnc_testP(final SubLObject test_item)
  {
    return Types.sublisp_null( list_utilities.sublisp_boolean( conses_high.second( test_item ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 12792L)
  public static SubLObject remove_empty_cnc_tests(final SubLObject test_list)
  {
    return Sequences.delete_if( $sym30$EMPTY_CNC_TEST_, test_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 12892L)
  public static SubLObject cyclify_cnc_date_string(final SubLObject date_string)
  {
    return date_utilities.universal_time_to_cycl_date( string_utilities.remove_substring( date_string, $str31$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 13024L)
  public static SubLObject candidate_nc_test_verify_general(final SubLObject asent, final SubLObject mt)
  {
    final SubLObject rule = cycl_utilities.formula_arg1( asent, UNPROVIDED );
    final SubLObject date = cycl_utilities.formula_arg2( asent, UNPROVIDED );
    final SubLObject result = cycl_utilities.formula_arg3( asent, UNPROVIDED );
    final SubLObject engine = cycl_utilities.formula_arg4( asent, UNPROVIDED );
    return check_dated_cnc_test_for_rule( rule, date, result, engine );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-candidate-noun-compounds.lisp", position = 13388L)
  public static SubLObject candidate_nc_test_justify_general(final SubLObject asent, final SubLObject mt)
  {
    final SubLObject supports = NIL;
    return supports;
  }

  public static SubLObject declare_removal_modules_candidate_noun_compounds_file()
  {
    SubLFiles.declareFunction( me, "check_dated_cnc_test_for_rule", "CHECK-DATED-CNC-TEST-FOR-RULE", 4, 0, false );
    SubLFiles.declareFunction( me, "get_cnc_test_results_and_dates", "GET-CNC-TEST-RESULTS-AND-DATES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_aggregate_cnc_score_w_thresholds", "GET-AGGREGATE-CNC-SCORE-W-THRESHOLDS", 4, 0, false );
    SubLFiles.declareFunction( me, "get_aggregate_score_for_all_w_thresholds", "GET-AGGREGATE-SCORE-FOR-ALL-W-THRESHOLDS", 3, 0, false );
    SubLFiles.declareFunction( me, "get_aggregate_results_for_all_w_thresholds", "GET-AGGREGATE-RESULTS-FOR-ALL-W-THRESHOLDS", 3, 0, false );
    SubLFiles.declareFunction( me, "get_aggregate_cnc_results_w_thresholds", "GET-AGGREGATE-CNC-RESULTS-W-THRESHOLDS", 4, 0, false );
    SubLFiles.declareFunction( me, "remove_errors_from_cnc_test_results", "REMOVE-ERRORS-FROM-CNC-TEST-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_search_engine_keyword", "GET-SEARCH-ENGINE-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "contains_server_errorP", "CONTAINS-SERVER-ERROR?", 1, 0, false );
    SubLFiles.declareFunction( me, "contains_invalid_fortP", "CONTAINS-INVALID-FORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluate_aggregate_cnc_results_w_thresholds", "EVALUATE-AGGREGATE-CNC-RESULTS-W-THRESHOLDS", 4, 0, false );
    SubLFiles.declareFunction( me, "aggregate_cnc_results_for_rule", "AGGREGATE-CNC-RESULTS-FOR-RULE", 2, 1, false );
    SubLFiles.declareFunction( me, "empty_cnc_testP", "EMPTY-CNC-TEST?", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_empty_cnc_tests", "REMOVE-EMPTY-CNC-TESTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclify_cnc_date_string", "CYCLIFY-CNC-DATE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "candidate_nc_test_verify_general", "CANDIDATE-NC-TEST-VERIFY-GENERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "candidate_nc_test_justify_general", "CANDIDATE-NC-TEST-JUSTIFY-GENERAL", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_candidate_noun_compounds_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_candidate_noun_compounds_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$datedCandidateNCTestHasResults );
    inference_modules.inference_removal_module( $kw1$DATED_CNC_TEST_FOR_NCR_UNIFY_ARGS_2_AND_3, $list2 );
    inference_modules.register_solely_specific_removal_module_predicate( $const3$aggregateCNCScoreForRuleWithThres );
    inference_modules.inference_removal_module( $kw4$AGGREGATE_NC_SCORE_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4, $list5 );
    inference_modules.inference_removal_module( $kw6$AGGREGATE_NC_SCORE_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4, $list7 );
    inference_modules.register_solely_specific_removal_module_predicate( $const8$aggregateCNCResultForRuleWithThre );
    inference_modules.inference_removal_module( $kw9$AGGREGATE_NC_RESULT_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4, $list10 );
    inference_modules.inference_removal_module( $kw11$AGGREGATE_NC_RESULT_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4, $list12 );
    preference_modules.inference_preference_module( $kw13$DATED_CNC_TEST_FOR_NCR_REQUIRE_ARG1_FULLY_BOUND, $list14 );
    preference_modules.inference_preference_module( $kw15$AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_2_FULLY_BOUND, $list16 );
    preference_modules.inference_preference_module( $kw17$AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_3_FULLY_BOUND, $list18 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_candidate_noun_compounds_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_candidate_noun_compounds_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_candidate_noun_compounds_file();
  }
  static
  {
    me = new removal_modules_candidate_noun_compounds();
    $const0$datedCandidateNCTestHasResults = constant_handles.reader_make_constant_shell( makeString( "datedCandidateNCTestHasResults" ) );
    $kw1$DATED_CNC_TEST_FOR_NCR_UNIFY_ARGS_2_AND_3 = makeKeyword( "DATED-CNC-TEST-FOR-NCR-UNIFY-ARGS-2-AND-3" );
    $list2 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "datedCandidateNCTestHasResults" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "datedCandidateNCTestHasResults" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ),
          makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ),
      ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "datedCandidateNCTestHasResults" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
          "RULE" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ENGINE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "RULE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "GET-CNC-TEST-RESULTS-AND-DATES" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RULE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GET-SEARCH-ENGINE-KEYWORD" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "DATE" ), makeSymbol(
                          "RESULT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "datedCandidateNCTestHasResults" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RULE" ) ),
                              ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCLIFY-CNC-DATE-STRING" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( makeKeyword( "CALL" ),
                                  makeSymbol( "MAKE-EL-LIST-RECURSIVELY" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVE-ERRORS-FROM-CNC-TEST-RESULTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                      "RESULT" ) ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CANDIDATE-NC-TESTS" ), makeKeyword(
                                          "DOCUMENTATION" ), makeString( "(#$datedCandidateNCTestHasResults <rule> <not-fully-bound> <not-fully-bound> <search-engine>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                              "(#$datedCandidateNCTestHasResults #$TofuStew-NCR ?DATE ?RESULT #$Google-SearchEngine)" )
    } );
    $const3$aggregateCNCScoreForRuleWithThres = constant_handles.reader_make_constant_shell( makeString( "aggregateCNCScoreForRuleWithThresholds" ) );
    $kw4$AGGREGATE_NC_SCORE_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4 = makeKeyword( "AGGREGATE-NC-SCORE-FOR-RULES-W-THRESHOLDS-UNIFY-ARGS-1-AND-4" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "aggregateCNCScoreForRuleWithThresholds" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "aggregateCNCScoreForRuleWithThresholds" ) ), makeKeyword(
            "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "aggregateCNCScoreForRuleWithThresholds" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                        "THRESHOLD2" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ENGINE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                            "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD2" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ) ), makeKeyword(
                                "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GET-AGGREGATE-SCORE-FOR-ALL-W-THRESHOLDS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                    "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GET-SEARCH-ENGINE-KEYWORD" ), ConsesLow
                                        .list( makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                                            "RULE" ), makeSymbol( "SCORE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "aggregateCNCScoreForRuleWithThresholds" ) ), ConsesLow.list(
                                                makeKeyword( "VALUE" ), makeSymbol( "RULE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                                    "THRESHOLD2" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SCORE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ) ), makeKeyword(
                                                        "SUPPORT-MODULE" ), makeKeyword( "CANDIDATE-NC-TESTS" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                            "(#$aggregateCNCScoreForRuleWithThresholds <not-fully-bound> <threshold1> <threshold2> <not-fully-bound> <search-engine>)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$aggregateCNCScoreForRuleWithThresholds ?RULE 1 100 ?SCORE #$Google-SearchEngine)" )
    } );
    $kw6$AGGREGATE_NC_SCORE_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4 = makeKeyword( "AGGREGATE-NC-SCORE-FOR-RULE-W-THRESHOLDS-UNIFY-ARG4" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "aggregateCNCScoreForRuleWithThresholds" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "aggregateCNCScoreForRuleWithThresholds" ) ), makeKeyword(
            "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "aggregateCNCScoreForRuleWithThresholds" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "RULE" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list(
                        makeKeyword( "BIND" ), makeSymbol( "THRESHOLD2" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ENGINE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword(
                            "VALUE" ), makeSymbol( "RULE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD2" ) ), ConsesLow.list(
                                makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GET-AGGREGATE-CNC-SCORE-W-THRESHOLDS" ),
                                    ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RULE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                        makeSymbol( "THRESHOLD2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GET-SEARCH-ENGINE-KEYWORD" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                            "ENGINE" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                "aggregateCNCScoreForRuleWithThresholds" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RULE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                                    "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD2" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                                        "ENGINE" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CANDIDATE-NC-TESTS" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                            "(#$aggregateCNCScoreForRuleWithThresholds <rule> <threshold1> <threshold2> <not-fully-bound> <search-engine>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                                                "(#$aggregateCNCScoreForRuleWithThresholds #$TofuStew-NCR 1 100 ?SCORE #$Yahoo-SearchEngine)" )
    } );
    $const8$aggregateCNCResultForRuleWithThre = constant_handles.reader_make_constant_shell( makeString( "aggregateCNCResultForRuleWithThresholds" ) );
    $kw9$AGGREGATE_NC_RESULT_FOR_RULES_W_THRESHOLDS_UNIFY_ARGS_1_AND_4 = makeKeyword( "AGGREGATE-NC-RESULT-FOR-RULES-W-THRESHOLDS-UNIFY-ARGS-1-AND-4" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "aggregateCNCResultForRuleWithThresholds" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "aggregateCNCResultForRuleWithThresholds" ) ),
            makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER,
      makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "aggregateCNCResultForRuleWithThresholds" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "THRESHOLD2" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ENGINE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD1" ) ),
                  ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD2" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list(
                      makeKeyword( "CALL" ), makeSymbol( "GET-AGGREGATE-RESULTS-FOR-ALL-W-THRESHOLDS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                          makeSymbol( "THRESHOLD2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GET-SEARCH-ENGINE-KEYWORD" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ) ), makeKeyword(
                              "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "RESULT" ) ), ConsesLow.list( constant_handles
                                  .reader_make_constant_shell( makeString( "aggregateCNCResultForRuleWithThresholds" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RULE" ) ), ConsesLow.list( makeKeyword(
                                      "VALUE" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                          "MAKE-EL-LIST-RECURSIVELY" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ) ),
      makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CANDIDATE-NC-TESTS" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$aggregateCNCResultForRuleWithThresholds <not-fully-bound> <threshold1> <threshold2> <not-fully-bound> <search-engine>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$aggregateCNCResultForRuleWithThresholds ?RULE 1 100 ?RESULT #$Google-SearchEngine)" )
    } );
    $kw11$AGGREGATE_NC_RESULT_FOR_RULE_W_THRESHOLDS_UNIFY_ARG4 = makeKeyword( "AGGREGATE-NC-RESULT-FOR-RULE-W-THRESHOLDS-UNIFY-ARG4" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "aggregateCNCResultForRuleWithThresholds" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "aggregateCNCResultForRuleWithThresholds" ) ),
            makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER,
      makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "aggregateCNCResultForRuleWithThresholds" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "RULE" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list( makeKeyword(
              "BIND" ), makeSymbol( "THRESHOLD2" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ENGINE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                  "RULE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD2" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                      makeSymbol( "ENGINE" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "GET-AGGREGATE-CNC-RESULTS-W-THRESHOLDS" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "RULE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD2" ) ), ConsesLow.list(
                              makeKeyword( "CALL" ), makeSymbol( "GET-SEARCH-ENGINE-KEYWORD" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow
                                  .list( constant_handles.reader_make_constant_shell( makeString( "aggregateCNCResultForRuleWithThresholds" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RULE" ) ), ConsesLow
                                      .list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THRESHOLD2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                          "MAKE-EL-LIST-RECURSIVELY" ), makeKeyword( "INPUT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ENGINE" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword(
                                              "CANDIDATE-NC-TESTS" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                  "(#$aggregateCNCResultForRuleWithThresholds <rule> <threshold1> <threshold2> <not-fully-bound> <search-engine>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                                      "(#$aggregateCNCResultForRuleWithThresholds #$TofuStew-NCR 1 100 ?RESULT #$Yahoo-SearchEngine)" )
    } );
    $kw13$DATED_CNC_TEST_FOR_NCR_REQUIRE_ARG1_FULLY_BOUND = makeKeyword( "DATED-CNC-TEST-FOR-NCR-REQUIRE-ARG1-FULLY-BOUND" );
    $list14 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "datedCandidateNCTestHasResults" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "DISALLOWED" ) );
    $kw15$AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_2_FULLY_BOUND = makeKeyword( "AGGREGATE-NCSCORE-FOR-RULE-W-THRESHOLDS-REQUIRE-ARG-2-FULLY-BOUND" );
    $list16 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "aggregateCNCScoreForRuleWithThresholds" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "DISALLOWED" ) );
    $kw17$AGGREGATE_NCSCORE_FOR_RULE_W_THRESHOLDS_REQUIRE_ARG_3_FULLY_BOUND = makeKeyword( "AGGREGATE-NCSCORE-FOR-RULE-W-THRESHOLDS-REQUIRE-ARG-3-FULLY-BOUND" );
    $list18 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "aggregateCNCScoreForRuleWithThresholds" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "DISALLOWED" ) );
    $kw19$IMAGE_INDEPENDENT_CFASL = makeKeyword( "IMAGE-INDEPENDENT-CFASL" );
    $sym20$CONTAINS_INVALID_FORT_ = makeSymbol( "CONTAINS-INVALID-FORT?" );
    $sym21$CONTAINS_SERVER_ERROR_ = makeSymbol( "CONTAINS-SERVER-ERROR?" );
    $const22$Google_SearchEngine = constant_handles.reader_make_constant_shell( makeString( "Google-SearchEngine" ) );
    $kw23$GOOGLE = makeKeyword( "GOOGLE" );
    $const24$Yahoo_SearchEngine = constant_handles.reader_make_constant_shell( makeString( "Yahoo-SearchEngine" ) );
    $kw25$YAHOO = makeKeyword( "YAHOO" );
    $kw26$SERVER_ERROR = makeKeyword( "SERVER-ERROR" );
    $str27$The_head_denot_for__S_is_an_inval = makeString( "The head denot for ~S is an invalid fort.~%" );
    $str28$The_modifier_denot_for__S_is_an_i = makeString( "The modifier denot for ~S is an invalid fort.~%" );
    $int29$15552000 = makeInteger( 15552000 );
    $sym30$EMPTY_CNC_TEST_ = makeSymbol( "EMPTY-CNC-TEST?" );
    $str31$_ = makeString( "-" );
  }
}
/*
 * 
 * Total time: 111 ms
 * 
 */