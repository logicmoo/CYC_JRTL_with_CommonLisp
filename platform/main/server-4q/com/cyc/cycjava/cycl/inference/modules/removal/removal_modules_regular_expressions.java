package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.regular_expression_utilities;
import com.cyc.cycjava.cycl.regular_expressions;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_regular_expressions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions";
  public static final String myFingerPrint = "fdb2f380e66a8821ff611aa2ca888c386f7a9488894f7861d7788024e017f286";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 1392L)
  public static SubLSymbol $regex_string_match_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 1472L)
  private static SubLSymbol $default_regex_string_match_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 5960L)
  public static SubLSymbol $regex_string_match_case_insensitive_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 6073L)
  private static SubLSymbol $default_regex_string_match_case_insensitive_cost$;
  private static final SubLObject $const0$regexStringMatch;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $sym2$_REGEX_STRING_MATCH_MT_;
  private static final SubLObject $const3$BaseKB;
  private static final SubLSymbol $kw4$REMOVAL_REGEX_STRING_MATCH_POS;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$REMOVAL_REGEX_STRING_MATCH_NEG;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$STRINGP;
  private static final SubLSymbol $kw9$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$REGEX_STRING_MATCH_WITH_BINDINGS;
  private static final SubLSymbol $kw12$OPAQUE;
  private static final SubLSymbol $kw13$TRUE_MON;
  private static final SubLObject $const14$regexStringMatch_CaseInsensitive;
  private static final SubLSymbol $sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_;
  private static final SubLSymbol $kw16$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS;
  private static final SubLList $list17;
  private static final SubLSymbol $kw18$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE;
  private static final SubLObject $const24$regexSubstringMatch;
  private static final SubLSymbol $kw25$META_REMOVAL_COMPLETELY_DECIDABLE_POS;
  private static final SubLSymbol $kw26$REMOVAL_COMPLETELY_DECIDABLE_NEG;
  private static final SubLSymbol $kw27$REMOVAL_REGEX_SUBSTRING_MATCH_POS;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$REMOVAL_REGEX_SUBSTRING_MATCH_ITERATOR;
  private static final SubLList $list30;
  private static final SubLList $list31;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 1708L)
  public static SubLObject removal_regex_string_match_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return regular_expressions.is_regular_expressions_support_availableP();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 3697L)
  public static SubLObject regex_string_match(final SubLObject regex_string, final SubLObject data_string)
  {
    assert NIL != Types.stringp( regex_string ) : regex_string;
    assert NIL != Types.stringp( data_string ) : data_string;
    return list_utilities.sublisp_boolean( regular_expression_utilities.offsets_of_regex_matches( regex_string, data_string, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 4758L)
  public static SubLObject regex_string_match_with_bindings(final SubLObject asent, final SubLObject sense)
  {
    return regex_string_match_with_bindings_int( asent, sense, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 4894L)
  public static SubLObject regex_string_match_with_bindings_int(final SubLObject asent, final SubLObject sense, final SubLObject regex_options)
  {
    final SubLObject pattern = cycl_utilities.formula_arg1( asent, UNPROVIDED );
    final SubLObject string = cycl_utilities.formula_arg2( asent, UNPROVIDED );
    final SubLObject match_var_count = Numbers.subtract( el_utilities.formula_arity( asent, UNPROVIDED ), TWO_INTEGER );
    final SubLObject matches = regular_expression_utilities.find_all_captured_matches_within_string_from_string( pattern, string, regex_options );
    final SubLObject result_sentence = el_utilities.make_formula( cycl_utilities.formula_arg0( asent ), ConsesLow.list( pattern, string ), UNPROVIDED );
    final SubLObject too_few_matchesP = NIL;
    SubLObject cdotimes_end_var;
    SubLObject n;
    SubLObject current_match;
    SubLObject current_result_sentence;
    for( cdotimes_end_var = Sequences.length( matches ), n = NIL, n = ZERO_INTEGER; n.numL( cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      current_match = ConsesLow.nth( n, matches );
      current_result_sentence = Sequences.cconcatenate( result_sentence, current_match );
      backward.removal_add_node( arguments.make_hl_support( $kw12$OPAQUE, current_result_sentence, $const3$BaseKB, $kw13$TRUE_MON ), unification_utilities.asent_unify( asent, current_result_sentence, T, UNPROVIDED ),
          UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 6360L)
  public static SubLObject removal_regex_string_match_case_insensitive_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return regular_expressions.is_regular_expressions_support_availableP();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 8679L)
  public static SubLObject regex_string_match_case_insensitive(final SubLObject regex_string, final SubLObject data_string)
  {
    assert NIL != Types.stringp( regex_string ) : regex_string;
    assert NIL != Types.stringp( data_string ) : data_string;
    return list_utilities.sublisp_boolean( regular_expression_utilities.offsets_of_regex_matches( regex_string, data_string, $list20, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 9943L)
  public static SubLObject regex_string_match_with_bindings_case_insensitive(final SubLObject asent, final SubLObject sense)
  {
    return regex_string_match_with_bindings_int( asent, sense, $list20 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 12021L)
  public static SubLObject removal_regex_substring_match_iterator(final SubLObject values)
  {
    return removal_regex_substring_match_iterator_int( values, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 12156L)
  public static SubLObject removal_regex_substring_match_iterator_int(final SubLObject values, SubLObject regex_options)
  {
    if( regex_options == UNPROVIDED )
    {
      regex_options = NIL;
    }
    SubLObject pattern = NIL;
    SubLObject data = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( values, values, $list30 );
    pattern = values.first();
    SubLObject current = values.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, values, $list30 );
    data = current.first();
    current = current.rest();
    final SubLObject index = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, values, $list30 );
    current = current.rest();
    final SubLObject span = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, values, $list30 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject matches = regular_expression_utilities.offsets_of_regex_matches( pattern, data, regex_options, UNPROVIDED );
      SubLObject results = NIL;
      SubLObject cdolist_list_var = matches;
      SubLObject match = NIL;
      match = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current_$2;
        final SubLObject datum_$1 = current_$2 = match;
        SubLObject the_start_index = NIL;
        SubLObject the_end_index = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list31 );
        the_start_index = current_$2.first();
        current_$2 = ( the_end_index = current_$2.rest() );
        final SubLObject the_span = Numbers.subtract( the_end_index, the_start_index );
        final SubLObject input_asent = el_utilities.make_formula( $const24$regexSubstringMatch, values, UNPROVIDED );
        final SubLObject answer_asent = el_utilities.make_formula( $const24$regexSubstringMatch, ConsesLow.list( pattern, data, the_start_index, the_span ), UNPROVIDED );
        final SubLObject v_bindings = unification_utilities.gaf_asent_unify( input_asent, answer_asent, UNPROVIDED, UNPROVIDED );
        if( NIL != v_bindings )
        {
          results = ConsesLow.cons( v_bindings, results );
        }
        cdolist_list_var = cdolist_list_var.rest();
        match = cdolist_list_var.first();
      }
      return iteration.new_list_iterator( results );
    }
    cdestructuring_bind.cdestructuring_bind_error( values, $list30 );
    return NIL;
  }

  public static SubLObject declare_removal_modules_regular_expressions_file()
  {
    SubLFiles.declareFunction( me, "removal_regex_string_match_required", "REMOVAL-REGEX-STRING-MATCH-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "regex_string_match", "REGEX-STRING-MATCH", 2, 0, false );
    SubLFiles.declareFunction( me, "regex_string_match_with_bindings", "REGEX-STRING-MATCH-WITH-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "regex_string_match_with_bindings_int", "REGEX-STRING-MATCH-WITH-BINDINGS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_regex_string_match_case_insensitive_required", "REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "regex_string_match_case_insensitive", "REGEX-STRING-MATCH-CASE-INSENSITIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "regex_string_match_with_bindings_case_insensitive", "REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_regex_substring_match_iterator", "REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_regex_substring_match_iterator_int", "REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR-INT", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_regular_expressions_file()
  {
    $regex_string_match_mt$ = SubLFiles.deflexical( "*REGEX-STRING-MATCH-MT*", maybeDefault( $sym2$_REGEX_STRING_MATCH_MT_, $regex_string_match_mt$, $const3$BaseKB ) );
    $default_regex_string_match_cost$ = SubLFiles.defparameter( "*DEFAULT-REGEX-STRING-MATCH-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $regex_string_match_case_insensitive_mt$ = SubLFiles.deflexical( "*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*", maybeDefault( $sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_, $regex_string_match_case_insensitive_mt$,
        $const3$BaseKB ) );
    $default_regex_string_match_case_insensitive_cost$ = SubLFiles.defparameter( "*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_regular_expressions_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$regexStringMatch );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$regexStringMatch, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$regexStringMatch, TWO_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym2$_REGEX_STRING_MATCH_MT_ );
    mt_vars.note_mt_var( $sym2$_REGEX_STRING_MATCH_MT_, $const0$regexStringMatch );
    inference_modules.inference_removal_module( $kw4$REMOVAL_REGEX_STRING_MATCH_POS, $list5 );
    inference_modules.inference_removal_module( $kw6$REMOVAL_REGEX_STRING_MATCH_NEG, $list7 );
    inference_modules.inference_removal_module( $kw9$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS, $list10 );
    utilities_macros.note_funcall_helper_function( $sym11$REGEX_STRING_MATCH_WITH_BINDINGS );
    inference_modules.register_solely_specific_removal_module_predicate( $const14$regexStringMatch_CaseInsensitive );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const14$regexStringMatch_CaseInsensitive, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const14$regexStringMatch_CaseInsensitive, TWO_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_ );
    mt_vars.note_mt_var( $sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_, $const14$regexStringMatch_CaseInsensitive );
    inference_modules.inference_removal_module( $kw16$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS, $list17 );
    inference_modules.inference_removal_module( $kw18$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG, $list19 );
    inference_modules.inference_removal_module( $kw21$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS, $list22 );
    utilities_macros.note_funcall_helper_function( $sym23$REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE );
    inference_modules.register_solely_specific_removal_module_predicate( $const24$regexSubstringMatch );
    inference_modules.inference_removal_module_use_meta_removal( $const24$regexSubstringMatch, $kw25$META_REMOVAL_COMPLETELY_DECIDABLE_POS );
    inference_modules.inference_removal_module_use_generic( $const24$regexSubstringMatch, $kw26$REMOVAL_COMPLETELY_DECIDABLE_NEG );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const24$regexSubstringMatch, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const24$regexSubstringMatch, TWO_INTEGER );
    inference_modules.inference_removal_module( $kw27$REMOVAL_REGEX_SUBSTRING_MATCH_POS, $list28 );
    utilities_macros.note_funcall_helper_function( $sym29$REMOVAL_REGEX_SUBSTRING_MATCH_ITERATOR );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_regular_expressions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_regular_expressions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_regular_expressions_file();
  }
  static
  {
    me = new removal_modules_regular_expressions();
    $regex_string_match_mt$ = null;
    $default_regex_string_match_cost$ = null;
    $regex_string_match_case_insensitive_mt$ = null;
    $default_regex_string_match_case_insensitive_cost$ = null;
    $const0$regexStringMatch = constant_handles.reader_make_constant_shell( makeString( "regexStringMatch" ) );
    $kw1$POS = makeKeyword( "POS" );
    $sym2$_REGEX_STRING_MATCH_MT_ = makeSymbol( "*REGEX-STRING-MATCH-MT*" );
    $const3$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $kw4$REMOVAL_REGEX_STRING_MATCH_POS = makeKeyword( "REMOVAL-REGEX-STRING-MATCH-POS" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "regexStringMatch" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regexStringMatch" ) ), makeKeyword( "STRING" ), makeKeyword( "STRING" ) ), makeKeyword( "REQUIRED" ), makeSymbol(
            "REMOVAL-REGEX-STRING-MATCH-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REGEX-STRING-MATCH-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ),
      T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regexStringMatch" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "REGULAR-EXPRESSION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "REGULAR-EXPRESSION" ) ),
              ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATA" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REGEX-STRING-MATCH" ), ConsesLow.list(
                  makeKeyword( "VALUE" ), makeSymbol( "REGULAR-EXPRESSION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATA" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword(
                      "SUPPORT-MT" ), makeSymbol( "*REGEX-STRING-MATCH-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$regexStringMatch <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$regexStringMatch \"[FD]og\" \"Dog\")" )
    } );
    $kw6$REMOVAL_REGEX_STRING_MATCH_NEG = makeKeyword( "REMOVAL-REGEX-STRING-MATCH-NEG" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "regexStringMatch" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regexStringMatch" ) ), makeKeyword( "STRING" ), makeKeyword( "STRING" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-REGEX-STRING-MATCH-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
          "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regexStringMatch" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "REGULAR-EXPRESSION" ) ), ConsesLow.list(
              makeKeyword( "BIND" ), makeSymbol( "DATA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "REGULAR-EXPRESSION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                  "DATA" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                      "REGEX-STRING-MATCH" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "REGULAR-EXPRESSION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATA" ) ) ) ), makeKeyword(
                          "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*REGEX-STRING-MATCH-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword(
                              "DOCUMENTATION" ), makeString(
                                  "(#$not (#$regexStringMatch <regular-expression string> <data string>))\n    when <data string> doesn't match the regular expression in <regular-expression string>" ), makeKeyword(
                                      "EXAMPLE" ), makeString( "(#$not (#$regexStringMatch \"[FD]og\" \"Log\"))" )
    } );
    $sym8$STRINGP = makeSymbol( "STRINGP" );
    $kw9$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS = makeKeyword( "REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-POS" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "regexStringMatch" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "regexStringMatch" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REGEX-STRING-MATCH-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REGEX-STRING-MATCH-WITH-BINDINGS" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) ),
      makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$regexStringMatch <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied to <data string>" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$regexStringMatch \"dog(.*)mice\" \"dogs hate mice\" \"s hate \")" )
    } );
    $sym11$REGEX_STRING_MATCH_WITH_BINDINGS = makeSymbol( "REGEX-STRING-MATCH-WITH-BINDINGS" );
    $kw12$OPAQUE = makeKeyword( "OPAQUE" );
    $kw13$TRUE_MON = makeKeyword( "TRUE-MON" );
    $const14$regexStringMatch_CaseInsensitive = constant_handles.reader_make_constant_shell( makeString( "regexStringMatch-CaseInsensitive" ) );
    $sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_ = makeSymbol( "*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*" );
    $kw16$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS = makeKeyword( "REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-POS" );
    $list17 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "regexStringMatch-CaseInsensitive" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regexStringMatch-CaseInsensitive" ) ), makeKeyword( "STRING" ), makeKeyword( "STRING" ) ), makeKeyword(
          "REQUIRED" ), makeSymbol( "REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*" ), makeKeyword(
              "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "regexStringMatch-CaseInsensitive" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "REGULAR-EXPRESSION" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                      makeSymbol( "DATA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "REGULAR-EXPRESSION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATA" ) ) ) ),
      makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REGEX-STRING-MATCH-CASE-INSENSITIVE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "REGULAR-EXPRESSION" ) ),
          ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATA" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*" ),
      makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Dog\")" )
    } );
    $kw18$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG = makeKeyword( "REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-NEG" );
    $list19 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "regexStringMatch-CaseInsensitive" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regexStringMatch-CaseInsensitive" ) ), makeKeyword( "STRING" ), makeKeyword( "STRING" ) ), makeKeyword(
          "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword(
              "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regexStringMatch-CaseInsensitive" ) ), ConsesLow.list(
                  makeKeyword( "BIND" ), makeSymbol( "REGULAR-EXPRESSION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATA" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "REGULAR-EXPRESSION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATA" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                          "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REGEX-STRING-MATCH-CASE-INSENSITIVE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                              "REGULAR-EXPRESSION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATA" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ),
      makeSymbol( "*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$not (#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>))\n    when <data string> doesn't match the regular expression in <regular-expression string>" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$not (#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Log\"))" )
    } );
    $list20 = ConsesLow.list( makeKeyword( "CASELESS" ) );
    $kw21$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS = makeKeyword( "REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE-POS" );
    $list22 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "regexStringMatch-CaseInsensitive" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "regexStringMatch-CaseInsensitive" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ),
          makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REGEX-STRING-MATCH-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE" ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), constant_handles.reader_make_constant_shell( makeString(
          "BaseKB" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied case-insensitively \n    to <data string>" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$regexStringMatch-CaseInsensitive \"Dog(.*)mice\" \"dogs hate mice\" \"s hate \")" )
    } );
    $sym23$REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE = makeSymbol( "REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE" );
    $const24$regexSubstringMatch = constant_handles.reader_make_constant_shell( makeString( "regexSubstringMatch" ) );
    $kw25$META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword( "META-REMOVAL-COMPLETELY-DECIDABLE-POS" );
    $kw26$REMOVAL_COMPLETELY_DECIDABLE_NEG = makeKeyword( "REMOVAL-COMPLETELY-DECIDABLE-NEG" );
    $kw27$REMOVAL_REGEX_SUBSTRING_MATCH_POS = makeKeyword( "REMOVAL-REGEX-SUBSTRING-MATCH-POS" );
    $list28 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "regexSubstringMatch" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regexSubstringMatch" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ),
            makeKeyword( "ANYTHING" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-REGEX-STRING-MATCH-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REGEX-STRING-MATCH-COST*" ), makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "regexSubstringMatch" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "REGULAR-EXPRESSION" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATA" ) ), ConsesLow.list( makeKeyword(
                        "BIND" ), makeSymbol( "INDEX" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SPAN" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "REGULAR-EXPRESSION" ) ),
                            ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "INDEX" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                "SPAN" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
          "BINDINGS" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow
              .list( constant_handles.reader_make_constant_shell( makeString( "regexSubstringMatch" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "REGULAR-EXPRESSION" ) ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "DATA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "INDEX" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SPAN" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ),
      makeKeyword( "OPAQUE" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*REGEX-STRING-MATCH-MT*" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$regexSubstringMatch <regular-expression string> <data string> <data index> <data span>)\n    when <data string> matches the regular expression in <regular-expression string> starting\n    at index and continuing for span characters" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$regexSubstringMatch \"[FD]og\" \"Dog\" 0 3)" )
    } );
    $sym29$REMOVAL_REGEX_SUBSTRING_MATCH_ITERATOR = makeSymbol( "REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR" );
    $list30 = ConsesLow.list( makeSymbol( "PATTERN" ), makeSymbol( "DATA" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INDEX" ), makeSymbol( "SPAN" ) );
    $list31 = ConsesLow.cons( makeSymbol( "THE-START-INDEX" ), makeSymbol( "THE-END-INDEX" ) );
  }
}
/*
 * 
 * Total time: 163 ms
 * 
 */