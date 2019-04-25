package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_term_strings
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_term_strings";
  public static final String myFingerPrint = "efd131bd0a0ae7a325638a5a4585b292477ff7ba1762dc53f7ed032ef4d1421b";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4050L)
  public static SubLSymbol $term_strings_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4256L)
  private static SubLSymbol $term_strings_check_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4339L)
  private static SubLSymbol $term_strings_unify_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 5300L)
  private static SubLSymbol $expected_number_of_terms_per_string$;
  private static final SubLObject $const0$termStrings;
  private static final SubLSymbol $kw1$TERMSTRINGS_X_Y_POS;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$REMOVAL_TERM_STRINGS_CHECK_POS;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$REMOVAL_TERM_STRINGS_CHECK_NEG;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$ALL;
  private static final SubLSymbol $sym8$_TERM_STRINGS_DEFINING_MT_;
  private static final SubLObject $const9$BaseKB;
  private static final SubLSymbol $kw10$OPAQUE;
  private static final SubLSymbol $kw11$TRUE_MON;
  private static final SubLSymbol $kw12$REMOVAL_TERM_STRINGS_UNIFY;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$REMOVAL_TERM_STRINGS_LOOKUP;
  private static final SubLList $list15;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 1200L)
  public static SubLObject removal_term_strings_check_pos_output_check(final SubLObject v_term, final SubLObject string)
  {
    return makeBoolean( NIL != list_utilities.member_equalP( string, inference_strings_for_term( v_term, UNPROVIDED, UNPROVIDED ) ) || NIL != list_utilities.member_equalP( v_term, inference_terms_for_string(
        string ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 2069L)
  public static SubLObject removal_term_strings_check_neg_output_check(final SubLObject v_term, final SubLObject string)
  {
    return makeBoolean( NIL == removal_term_strings_check_pos_output_check( v_term, string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 3527L)
  public static SubLObject inference_strings_for_term(final SubLObject v_term, SubLObject nl_preds, SubLObject lexical_onlyP)
  {
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $kw7$ALL;
    }
    if( lexical_onlyP == UNPROVIDED )
    {
      lexical_onlyP = NIL;
    }
    return pph_methods_lexicon.inference_strings_for_term_int( v_term, nl_preds, lexical_onlyP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 3825L)
  public static SubLObject inference_terms_for_string(final SubLObject string)
  {
    return lexicon_accessors.all_parsing_denots_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4120L)
  public static SubLObject make_term_strings_hl_support(final SubLObject formula)
  {
    return arguments.make_hl_support( $kw10$OPAQUE, formula, $term_strings_defining_mt$.getGlobalValue(), $kw11$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 4493L)
  public static SubLObject removal_term_strings_unify_output_generate(final SubLObject v_term)
  {
    return iteration.new_list_iterator( inference_strings_for_term( v_term, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-term-strings.lisp", position = 5461L)
  public static SubLObject removal_term_strings_lookup_output_generate(final SubLObject string)
  {
    return iteration.new_list_iterator( inference_terms_for_string( string ) );
  }

  public static SubLObject declare_removal_modules_term_strings_file()
  {
    SubLFiles.declareFunction( me, "removal_term_strings_check_pos_output_check", "REMOVAL-TERM-STRINGS-CHECK-POS-OUTPUT-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_term_strings_check_neg_output_check", "REMOVAL-TERM-STRINGS-CHECK-NEG-OUTPUT-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_strings_for_term", "INFERENCE-STRINGS-FOR-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "inference_terms_for_string", "INFERENCE-TERMS-FOR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "make_term_strings_hl_support", "MAKE-TERM-STRINGS-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_term_strings_unify_output_generate", "REMOVAL-TERM-STRINGS-UNIFY-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_term_strings_lookup_output_generate", "REMOVAL-TERM-STRINGS-LOOKUP-OUTPUT-GENERATE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_term_strings_file()
  {
    $term_strings_defining_mt$ = SubLFiles.deflexical( "*TERM-STRINGS-DEFINING-MT*", maybeDefault( $sym8$_TERM_STRINGS_DEFINING_MT_, $term_strings_defining_mt$, $const9$BaseKB ) );
    $term_strings_check_default_cost$ = SubLFiles.deflexical( "*TERM-STRINGS-CHECK-DEFAULT-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $term_strings_unify_default_cost$ = SubLFiles.deflexical( "*TERM-STRINGS-UNIFY-DEFAULT-COST*", ONE_INTEGER );
    $expected_number_of_terms_per_string$ = SubLFiles.deflexical( "*EXPECTED-NUMBER-OF-TERMS-PER-STRING*", ONE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_term_strings_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$termStrings );
    preference_modules.inference_preference_module( $kw1$TERMSTRINGS_X_Y_POS, $list2 );
    inference_modules.inference_removal_module( $kw3$REMOVAL_TERM_STRINGS_CHECK_POS, $list4 );
    inference_modules.inference_removal_module( $kw5$REMOVAL_TERM_STRINGS_CHECK_NEG, $list6 );
    subl_macro_promotions.declare_defglobal( $sym8$_TERM_STRINGS_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym8$_TERM_STRINGS_DEFINING_MT_, $const0$termStrings );
    inference_modules.inference_removal_module( $kw12$REMOVAL_TERM_STRINGS_UNIFY, $list13 );
    inference_modules.inference_removal_module( $kw14$REMOVAL_TERM_STRINGS_LOOKUP, $list15 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_term_strings_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_term_strings_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_term_strings_file();
  }
  static
  {
    me = new removal_modules_term_strings();
    $term_strings_defining_mt$ = null;
    $term_strings_check_default_cost$ = null;
    $term_strings_unify_default_cost$ = null;
    $expected_number_of_terms_per_string$ = null;
    $const0$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $kw1$TERMSTRINGS_X_Y_POS = makeKeyword( "TERMSTRINGS-X-Y-POS" );
    $list2 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw3$REMOVAL_TERM_STRINGS_CHECK_POS = makeKeyword( "REMOVAL-TERM-STRINGS-CHECK-POS" );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*TERM-STRINGS-CHECK-DEFAULT-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "termStrings" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                  "TERM" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-TERM-STRINGS-CHECK-POS-OUTPUT-CHECK" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ),
                      ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TERM-PHRASES" ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$termStrings <fully-bound-p> <stringp>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$termStrings #$Dog \"Dog\")" )
    } );
    $kw5$REMOVAL_TERM_STRINGS_CHECK_NEG = makeKeyword( "REMOVAL-TERM-STRINGS-CHECK-NEG" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*TERM-STRINGS-CHECK-DEFAULT-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "termStrings" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                  "TERM" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-TERM-STRINGS-CHECK-NEG-OUTPUT-CHECK" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ),
                      ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ) ), makeKeyword( "SUPPORT" ), makeKeyword( "TERM-PHRASES" ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$not (#$termStrings <fully-bound-p> <stringp>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$termStrings #$Dog \"Cat\"))" )
    } );
    $kw7$ALL = makeKeyword( "ALL" );
    $sym8$_TERM_STRINGS_DEFINING_MT_ = makeSymbol( "*TERM-STRINGS-DEFINING-MT*" );
    $const9$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $kw10$OPAQUE = makeKeyword( "OPAQUE" );
    $kw11$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw12$REMOVAL_TERM_STRINGS_UNIFY = makeKeyword( "REMOVAL-TERM-STRINGS-UNIFY" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "VARIABLE" ) ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*TERM-STRINGS-UNIFY-DEFAULT-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "TERM" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-TERM-STRINGS-UNIFY-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                  "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ), makeKeyword(
                      "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TERM-PHRASES" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$termStrings <fully-bound-p> <variable-p>)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$termStrings #$Dog ?STRING)" )
    } );
    $kw14$REMOVAL_TERM_STRINGS_LOOKUP = makeKeyword( "REMOVAL-TERM-STRINGS-LOOKUP" );
    $list15 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*EXPECTED-NUMBER-OF-TERMS-PER-STRING*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "termStrings" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ), makeKeyword(
              "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-TERM-STRINGS-LOOKUP-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termStrings" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ), makeKeyword(
          "SUPPORT-MODULE" ), makeKeyword( "TERM-PHRASES" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$termStrings <not-fully-bound-p> <stringp>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$termStrings ?TERM \"Dog\")" )
    } );
  }
}
/*
 * 
 * Total time: 40 ms
 * 
 */