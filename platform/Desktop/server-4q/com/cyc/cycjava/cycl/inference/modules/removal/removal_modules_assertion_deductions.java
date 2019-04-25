package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_assertion_deductions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_deductions";
  public static final String myFingerPrint = "03c499ba240103d689589f8e1d1b4ac7dce1aee28fe6aa62c83840ac71f6620d";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-deductions.lisp", position = 1275L)
  private static SubLSymbol $default_assertion_deductions_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-deductions.lisp", position = 3290L)
  private static SubLSymbol $average_assertion_deduction_count$;
  private static final SubLObject $const0$assertionDeductions;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLObject $const3$CycDeductionDatastructureFn;
  private static final SubLSymbol $kw4$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG;
  private static final SubLList $list7;
  private static final SubLFloat $float8$0_3;
  private static final SubLSymbol $kw9$REMOVAL_ASSERTION_DEDUCTION_UNIFY;
  private static final SubLList $list10;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-deductions.lisp", position = 848L)
  public static SubLObject assertion_deduction_terms(final SubLObject assertion)
  {
    final SubLObject argument_list = assertions_high.assertion_arguments( assertion );
    SubLObject argument_term_list = NIL;
    SubLObject cdolist_list_var = argument_list;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != deduction_handles.deduction_p( arg ) )
      {
        final SubLObject d_id = deduction_handles.deduction_id( arg );
        final SubLObject d_term = ConsesLow.list( $const3$CycDeductionDatastructureFn, d_id );
        argument_term_list = ConsesLow.cons( d_term, argument_term_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return argument_term_list;
  }

  public static SubLObject declare_removal_modules_assertion_deductions_file()
  {
    SubLFiles.declareFunction( me, "assertion_deduction_terms", "ASSERTION-DEDUCTION-TERMS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_assertion_deductions_file()
  {
    $default_assertion_deductions_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $average_assertion_deduction_count$ = SubLFiles.deflexical( "*AVERAGE-ASSERTION-DEDUCTION-COUNT*", $float8$0_3 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_assertion_deductions_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$assertionDeductions );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$assertionDeductions, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$assertionDeductions );
    inference_modules.inference_removal_module( $kw4$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS, $list5 );
    inference_modules.inference_removal_module( $kw6$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG, $list7 );
    inference_modules.inference_removal_module( $kw9$REMOVAL_ASSERTION_DEDUCTION_UNIFY, $list10 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_assertion_deductions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_assertion_deductions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_assertion_deductions_file();
  }
  static
  {
    me = new removal_modules_assertion_deductions();
    $default_assertion_deductions_check_cost$ = null;
    $average_assertion_deduction_count$ = null;
    $const0$assertionDeductions = constant_handles.reader_make_constant_shell( makeString( "assertionDeductions" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $const3$CycDeductionDatastructureFn = constant_handles.reader_make_constant_shell( makeString( "CycDeductionDatastructureFn" ) );
    $kw4$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-DEDUCTIONS-CHECK-POS" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionDeductions" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionDeductions" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionDeductions" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "DEDUCTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "DEDUCTION" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "DEDUCTION" ) ), ConsesLow.list(
                            makeKeyword( "CALL" ), makeSymbol( "ASSERTION-DEDUCTION-TERM?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                "DEDUCTION" ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionDeductions <assertion> <fully-bound-p>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                    "(#$assertionDeductions  \n     (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     (#$CycDeductionDatastructureFn 403530))" )
    } );
    $kw6$REMOVAL_ASSERTION_DEDUCTIONS_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-DEDUCTIONS-CHECK-NEG" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionDeductions" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionDeductions" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-DEDUCTIONS-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionDeductions" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "DEDUCTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "DEDUCTION" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "DEDUCTION" ) ), ConsesLow.list(
                            makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-DEDUCTION-TERM?" ), ConsesLow.list( makeKeyword( "VALUE" ),
                                makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DEDUCTION" ) ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                    "(#$not (#$assertionDeductions <assertion> <fully-bound-p>))" ), makeKeyword( "EXAMPLE" ), makeString(
                                        "(#$not #$assertionDeductions\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     (#$CycDeductionDatastructureFn 403530))" )
    } );
    $float8$0_3 = makeDouble( 0.3 );
    $kw9$REMOVAL_ASSERTION_DEDUCTION_UNIFY = makeKeyword( "REMOVAL-ASSERTION-DEDUCTION-UNIFY" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionDeductions" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionDeductions" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*AVERAGE-ASSERTION-DEDUCTION-COUNT*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionDeductions" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ), makeKeyword(
                    "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                        "ASSERTION-DEDUCTION-TERMS" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "assertionDeductions" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                "(#$assertionDeductions <assertion> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                    "(#$assertionDeductions\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing))\n      ?DED)" )
    } );
  }
}
/*
 * 
 * Total time: 83 ms
 * 
 */