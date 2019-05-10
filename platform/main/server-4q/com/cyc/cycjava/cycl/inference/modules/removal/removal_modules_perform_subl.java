package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_perform_subl
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_perform_subl";
  public static final String myFingerPrint = "5e3e6dd7a91752b7a6d3597d7c57eec664024986a5eb0a9b4b727a943f9adc68";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 1597L)
  public static SubLSymbol $perform_subl_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 2001L)
  private static SubLSymbol $default_perform_subl_pos_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 3013L)
  private static SubLSymbol $default_perform_subl_neg_cost$;
  private static final SubLSymbol $kw0$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym1$IGNORE_ERRORS_HANDLER;
  private static final SubLObject $const2$ExpandSubLFn;
  private static final SubLObject $const3$SubLQuoteFn;
  private static final SubLSymbol $sym4$_PERFORM_SUBL_DEFINING_MT_;
  private static final SubLObject $const5$UniversalVocabularyMt;
  private static final SubLObject $const6$performSubL;
  private static final SubLSymbol $kw7$POS;
  private static final SubLSymbol $kw8$NEG;
  private static final SubLSymbol $kw9$REMOVAL_PERFORM_SUBL_POS;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$REMOVAL_PERFORM_SUBL_NEG;
  private static final SubLList $list12;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 534L)
  public static SubLObject evaluate_subl_expression(final SubLObject subl_expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject subl = NIL;
    SubLObject successfulP = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw0$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym1$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject pcase_var = cycl_utilities.formula_operator( subl_expression );
          if( pcase_var.eql( $const2$ExpandSubLFn ) )
          {
            subl = cycl_utilities.formula_arg2( subl_expression, UNPROVIDED );
          }
          else if( pcase_var.eql( $const3$SubLQuoteFn ) )
          {
            subl = cycl_utilities.formula_arg1( subl_expression, UNPROVIDED );
          }
          result = eval_in_api.cyc_api_eval( subl );
          successfulP = T;
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw0$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return Values.values( result, successfulP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 1092L)
  public static SubLObject inference_perform_subl(final SubLObject subl_expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result = inference_evaluate_subl_expression( subl_expression );
    final SubLObject successfulP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return successfulP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-perform-subl.lisp", position = 1309L)
  public static SubLObject inference_evaluate_subl_expression(final SubLObject subl_expression)
  {
    if( NIL == inference_worker.currently_active_problem_store() || NIL != inference_datastructures_problem_store.problem_store_evaluate_subl_allowedP( inference_worker.currently_active_problem_store() ) )
    {
      return evaluate_subl_expression( subl_expression );
    }
    return Values.values( NIL, NIL );
  }

  public static SubLObject declare_removal_modules_perform_subl_file()
  {
    SubLFiles.declareFunction( me, "evaluate_subl_expression", "EVALUATE-SUBL-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_perform_subl", "INFERENCE-PERFORM-SUBL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_evaluate_subl_expression", "INFERENCE-EVALUATE-SUBL-EXPRESSION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_perform_subl_file()
  {
    $perform_subl_defining_mt$ = SubLFiles.deflexical( "*PERFORM-SUBL-DEFINING-MT*", maybeDefault( $sym4$_PERFORM_SUBL_DEFINING_MT_, $perform_subl_defining_mt$, $const5$UniversalVocabularyMt ) );
    $default_perform_subl_pos_cost$ = SubLFiles.defparameter( "*DEFAULT-PERFORM-SUBL-POS-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_perform_subl_neg_cost$ = SubLFiles.defparameter( "*DEFAULT-PERFORM-SUBL-NEG-COST*", $default_perform_subl_pos_cost$.getDynamicValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_perform_subl_file()
  {
    subl_macro_promotions.declare_defglobal( $sym4$_PERFORM_SUBL_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym4$_PERFORM_SUBL_DEFINING_MT_, $const6$performSubL );
    inference_modules.register_solely_specific_removal_module_predicate( $const6$performSubL );
    preference_modules.doomed_unless_all_args_bindable( $kw7$POS, $const6$performSubL );
    preference_modules.doomed_unless_all_args_bindable( $kw8$NEG, $const6$performSubL );
    inference_modules.inference_removal_module( $kw9$REMOVAL_PERFORM_SUBL_POS, $list10 );
    inference_modules.inference_removal_module( $kw11$REMOVAL_PERFORM_SUBL_NEG, $list12 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_perform_subl_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_perform_subl_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_perform_subl_file();
  }
  static
  {
    me = new removal_modules_perform_subl();
    $perform_subl_defining_mt$ = null;
    $default_perform_subl_pos_cost$ = null;
    $default_perform_subl_neg_cost$ = null;
    $kw0$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym1$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $const2$ExpandSubLFn = constant_handles.reader_make_constant_shell( makeString( "ExpandSubLFn" ) );
    $const3$SubLQuoteFn = constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) );
    $sym4$_PERFORM_SUBL_DEFINING_MT_ = makeSymbol( "*PERFORM-SUBL-DEFINING-MT*" );
    $const5$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const6$performSubL = constant_handles.reader_make_constant_shell( makeString( "performSubL" ) );
    $kw7$POS = makeKeyword( "POS" );
    $kw8$NEG = makeKeyword( "NEG" );
    $kw9$REMOVAL_PERFORM_SUBL_POS = makeKeyword( "REMOVAL-PERFORM-SUBL-POS" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "performSubL" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "performSubL" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
            "*DEFAULT-PERFORM-SUBL-POS-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "performSubL" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SUBL" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                    makeSymbol( "SUBL" ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-PERFORM-SUBL" ), makeKeyword( "INPUT" ) ), makeKeyword(
                        "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*PERFORM-SUBL-DEFINING-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword(
                            "DOCUMENTATION" ), makeString( "(#$performSubL <fully-bound>)\n     by evaluating the argument as a SubL expression and succeeding if the evaluation completed." ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$performSubL (#$ExpandSubLFn () (print :DONE)))  \n    or\n    (#$performSubL (#$SubLQuoteFn (print :DONE)))" )
    } );
    $kw11$REMOVAL_PERFORM_SUBL_NEG = makeKeyword( "REMOVAL-PERFORM-SUBL-NEG" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "performSubL" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "performSubL" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
            "*DEFAULT-PERFORM-SUBL-NEG-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "performSubL" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SUBL" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                    makeSymbol( "SUBL" ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                        "INFERENCE-PERFORM-SUBL" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*PERFORM-SUBL-DEFINING-MT*" ),
      makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$not (#$performSubL <fully-bound>))\n by evaluating the argument as a SubL expression and succeeding if the evaluation failed to complete." ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$not (#$performSubL (#$ExpandSubLFn () (/ 1 0)))) or\n    (#$not (#$performSubL (#$SubLQuoteFn (/ 1 0))))" )
    } );
  }
}
/*
 * 
 * Total time: 137 ms
 * 
 */