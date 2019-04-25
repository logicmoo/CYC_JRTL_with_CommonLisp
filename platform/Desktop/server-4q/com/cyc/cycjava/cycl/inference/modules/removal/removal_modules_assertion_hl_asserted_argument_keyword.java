package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_assertion_hl_asserted_argument_keyword
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_hl_asserted_argument_keyword";
  public static final String myFingerPrint = "edee9dfa29f4050f2566e2b05414ac0817cad25cf66391acf6dbf9c5fe1fb7b4";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-hl-asserted-argument-keyword.lisp", position = 1749L)
  private static SubLSymbol $default_assertion_hl_asserted_argument_keyword_check_cost$;
  private static final SubLObject $const0$assertionHLAssertedArgumentKeywor;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLObject $const3$ExpandSubLFn;
  private static final SubLObject $const4$subLIdentifier;
  private static final SubLSymbol $kw5$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_POS;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_NEG;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_UNIFY;
  private static final SubLList $list10;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-assertion-hl-asserted-argument-keyword.lisp", position = 923L)
  public static SubLObject assertion_keyword_terms(final SubLObject assertion)
  {
    final SubLObject argument_list = assertions_high.assertion_arguments( assertion );
    SubLObject keyword_term_list = NIL;
    SubLObject cdolist_list_var = argument_list;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != arguments.asserted_argument_p( arg ) )
      {
        final SubLObject expand_subl_misc_asses = kb_mapping.gather_other_index( $const3$ExpandSubLFn );
        SubLObject keyword_func = NIL;
        SubLObject keyword_term = NIL;
        SubLObject keyword_inside_func = NIL;
        SubLObject cdolist_list_var_$1 = expand_subl_misc_asses;
        SubLObject ass = NIL;
        ass = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          if( cycl_utilities.formula_operator( ass ).eql( $const4$subLIdentifier ) )
          {
            keyword_func = cycl_utilities.formula_arg2( ass, UNPROVIDED );
            keyword_inside_func = cycl_utilities.formula_arg2( keyword_func, UNPROVIDED );
            if( keyword_inside_func.eql( arg ) )
            {
              keyword_term = cycl_utilities.formula_arg1( ass, UNPROVIDED );
              keyword_term_list = ConsesLow.cons( keyword_term, keyword_term_list );
            }
          }
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          ass = cdolist_list_var_$1.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return keyword_term_list;
  }

  public static SubLObject declare_removal_modules_assertion_hl_asserted_argument_keyword_file()
  {
    SubLFiles.declareFunction( me, "assertion_keyword_terms", "ASSERTION-KEYWORD-TERMS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_assertion_hl_asserted_argument_keyword_file()
  {
    $default_assertion_hl_asserted_argument_keyword_check_cost$ = SubLFiles.defparameter( "*DEFAULT-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_assertion_hl_asserted_argument_keyword_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$assertionHLAssertedArgumentKeywor );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$assertionHLAssertedArgumentKeywor, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$assertionHLAssertedArgumentKeywor );
    inference_modules.inference_removal_module( $kw5$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_POS, $list6 );
    inference_modules.inference_removal_module( $kw7$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_NEG, $list8 );
    inference_modules.inference_removal_module( $kw9$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_UNIFY, $list10 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_assertion_hl_asserted_argument_keyword_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_assertion_hl_asserted_argument_keyword_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_assertion_hl_asserted_argument_keyword_file();
  }
  static
  {
    me = new removal_modules_assertion_hl_asserted_argument_keyword();
    $default_assertion_hl_asserted_argument_keyword_check_cost$ = null;
    $const0$assertionHLAssertedArgumentKeywor = constant_handles.reader_make_constant_shell( makeString( "assertionHLAssertedArgumentKeyword" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $const3$ExpandSubLFn = constant_handles.reader_make_constant_shell( makeString( "ExpandSubLFn" ) );
    $const4$subLIdentifier = constant_handles.reader_make_constant_shell( makeString( "subLIdentifier" ) );
    $kw5$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_POS = makeKeyword( "REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-POS" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionHLAssertedArgumentKeyword" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionHLAssertedArgumentKeyword" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ),
      ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionHLAssertedArgumentKeyword" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
          "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "KEYWORD" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "KEYWORD" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "KEYWORD" ) ), ConsesLow.list(
                  makeKeyword( "CALL" ), makeSymbol( "ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "KEYWORD" ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionHLAssertedArgumentKeyword <assertion> <fully-bound-p>)" ), makeKeyword( "EXAMPLE" ), makeString(
                          "(#$assertionHLAssertedArgumentKeyword  \n     (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n     #$AssertedTrueMonotonic)" )
    } );
    $kw7$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_CHECK_NEG = makeKeyword( "REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-NEG" );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionHLAssertedArgumentKeyword" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionHLAssertedArgumentKeyword" ) ), makeKeyword( "ASSERTION" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ),
      ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionHLAssertedArgumentKeyword" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
          "ASSERTION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "KEYWORD" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "KEYWORD" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "KEYWORD" ) ), ConsesLow.list(
                  makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD?" ), ConsesLow.list( makeKeyword( "VALUE" ),
                      makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "KEYWORD" ) ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$not (#$assertionHLAssertedArgumentKeyword <assertion> <fully-bound-p>))" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$not #$assertionHLAssertedArgumentKeyword\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing)) \n      #$AssertedTrueMonotonic)" )
    } );
    $kw9$REMOVAL_ASSERTION_HL_ASSERTED_ARGUMENT_KEYWORD_UNIFY = makeKeyword( "REMOVAL-ASSERTION-HL-ASSERTED-ARGUMENT-KEYWORD-UNIFY" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "assertionHLAssertedArgumentKeyword" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionHLAssertedArgumentKeyword" ) ), makeKeyword(
            "ASSERTION" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow
                .list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionHLAssertedArgumentKeyword" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                    "ASSERTION" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                        makeSymbol( "ASSERTION-ARGUMENT-TERMS" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "assertionHLAssertedArgumentKeyword" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                "(#$assertionHLAssertedArgumentKeyword <assertion> <not fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                    "(#$assertionHLAssertedArgumentKeyword\n      (#$ist #$UniversalVocabularyMt (#$arg1Isa #$isa #$Thing))\n      ?KEYWORD)" )
    } );
  }
}
/*
 * 
 * Total time: 81 ms
 * 
 */