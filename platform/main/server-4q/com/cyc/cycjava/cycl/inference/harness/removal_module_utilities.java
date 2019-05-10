package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.inference.modules.forward_modules;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_module_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.removal_module_utilities";
  public static final String myFingerPrint = "bab082c2b86823f5fd6d3a14560488abd4ca75f913c17f579f3586d6aeb7d173";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 7276L)
  private static SubLSymbol $modules_require_negation_by_failure$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 9060L)
  private static SubLSymbol $completeness_minimization_required_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 9777L)
  private static SubLSymbol $new_terms_allowed_required_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 10720L)
  private static SubLSymbol $evaluate_subl_required_modules$;
  private static final SubLObject $const0$isa;
  private static final SubLSymbol $kw1$ISA;
  private static final SubLObject $const2$genlInverse;
  private static final SubLSymbol $kw3$GENLPREDS;
  private static final SubLObject $const4$genlPreds;
  private static final SubLSymbol $kw5$CODE;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$TRUE_MON;
  private static final SubLString $str8$______System__a_HL_module_statist;
  private static final SubLString $str9$__HL_Modules_____________________;
  private static final SubLString $str10$___Removal_Modules_______________;
  private static final SubLString $str11$___Meta_Removal_Modules__________;
  private static final SubLString $str12$___Conjunctive_Removal_Modules___;
  private static final SubLString $str13$___Transformation_Modules________;
  private static final SubLString $str14$___Meta_Transformation_Modules___;
  private static final SubLString $str15$___Structural_Modules____________;
  private static final SubLString $str16$___Meta_Structural_Modules_______;
  private static final SubLString $str17$___Forward_Modules_______________;
  private static final SubLString $str18$___Storage_Modules_______________;
  private static final SubLString $str19$___Evaluatable_Predicates________;
  private static final SubLString $str20$___Evaluatable_Functions_________;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$EMPTY_STRING_P;
  private static final SubLSymbol $kw23$POS;
  private static final SubLString $str24$pos;
  private static final SubLSymbol $kw25$NEG;
  private static final SubLString $str26$not;
  private static final SubLString $str27$neg;
  private static final SubLSymbol $kw28$NEW_TERMS_ALLOWED_;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLList $list33;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 778L)
  public static SubLObject negation_grossly_incompleteP(final SubLObject asent, final SubLObject sense)
  {
    return makeBoolean( NIL == variables.fully_bound_p( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 895L)
  public static SubLObject invert_removal_check_cost(final SubLObject check_cost)
  {
    final SubLObject inverted_check_cost = Numbers.subtract( ONE_INTEGER, check_cost );
    return Numbers.min( ONE_INTEGER, Numbers.max( ZERO_INTEGER, inverted_check_cost ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 1259L)
  public static SubLObject answer_to_singleton(final SubLObject v_answer)
  {
    return ConsesLow.list( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 1524L)
  public static SubLObject non_null_answer_to_singleton(final SubLObject v_answer)
  {
    return ( NIL != v_answer ) ? answer_to_singleton( v_answer ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 1761L)
  public static SubLObject invert_boolean_answer(final SubLObject v_answer)
  {
    return makeBoolean( NIL == v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 1886L)
  public static SubLObject additional_isa_support(final SubLObject v_object, final SubLObject collection)
  {
    final SubLObject hl_formula = ConsesLow.list( $const0$isa, v_object, collection );
    final SubLObject hl_support = arguments.make_hl_support( $kw1$ISA, hl_formula, UNPROVIDED, UNPROVIDED );
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2174L)
  public static SubLObject additional_isa_supports(final SubLObject v_object, final SubLObject collection)
  {
    return ConsesLow.list( additional_isa_support( v_object, collection ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2296L)
  public static SubLObject make_genl_inverse_support(final SubLObject spec_pred, final SubLObject genl_pred)
  {
    final SubLObject hl_formula = ConsesLow.list( $const2$genlInverse, spec_pred, genl_pred );
    final SubLObject hl_support = arguments.make_hl_support( $kw3$GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED );
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2504L)
  public static SubLObject additional_genl_inverse_supports(final SubLObject spec_pred, final SubLObject genl_pred)
  {
    if( !spec_pred.eql( genl_pred ) )
    {
      return ConsesLow.list( make_genl_inverse_support( spec_pred, genl_pred ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2682L)
  public static SubLObject make_genl_preds_support(final SubLObject spec_pred, final SubLObject genl_pred)
  {
    final SubLObject hl_formula = ConsesLow.list( $const4$genlPreds, spec_pred, genl_pred );
    final SubLObject hl_support = arguments.make_hl_support( $kw3$GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED );
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2885L)
  public static SubLObject additional_genl_preds_supports(final SubLObject spec_pred, final SubLObject genl_pred)
  {
    if( !spec_pred.eql( genl_pred ) )
    {
      return ConsesLow.list( make_genl_preds_support( spec_pred, genl_pred ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 3059L)
  public static SubLObject make_simplification_support()
  {
    return arguments.make_hl_support( $kw5$CODE, $list6, mt_vars.$equals_defining_mt$.getGlobalValue(), $kw7$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 3275L)
  public static SubLObject hl_module_count()
  {
    return Numbers.add( new SubLObject[] { inference_modules.removal_module_count(), inference_modules.meta_removal_module_count(), inference_modules.conjunctive_removal_module_count(), inference_modules
        .transformation_module_count(), inference_modules.meta_transformation_module_count(), inference_modules.structural_module_count(), inference_modules.meta_structural_module_count(), forward_modules
            .forward_module_count(), hl_storage_modules.hl_storage_module_count(), evaluation_defns.evaluatable_predicate_count(), evaluation_defns.evaluatable_function_count()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 3743L)
  public static SubLObject hl_module_statistics(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLObject removal_module_count = inference_modules.removal_module_count();
    final SubLObject meta_removal_module_count = inference_modules.meta_removal_module_count();
    final SubLObject conjunctive_removal_module_count = inference_modules.conjunctive_removal_module_count();
    final SubLObject transformation_module_count = inference_modules.transformation_module_count();
    final SubLObject meta_transformation_module_count = inference_modules.meta_transformation_module_count();
    final SubLObject structural_module_count = inference_modules.structural_module_count();
    final SubLObject meta_structural_module_count = inference_modules.meta_structural_module_count();
    final SubLObject forward_module_count = forward_modules.forward_module_count();
    final SubLObject hl_storage_module_count = hl_storage_modules.hl_storage_module_count();
    final SubLObject evaluatable_predicate_count = evaluation_defns.evaluatable_predicate_count();
    final SubLObject evaluatable_function_count = evaluation_defns.evaluatable_function_count();
    final SubLObject hl_module_count = Numbers.add( new SubLObject[] { removal_module_count, meta_removal_module_count, conjunctive_removal_module_count, transformation_module_count, meta_transformation_module_count,
      forward_module_count, hl_storage_module_count, evaluatable_predicate_count, evaluatable_function_count
    } );
    PrintLow.format( stream, $str8$______System__a_HL_module_statist, system_info.cyc_revision_string() );
    PrintLow.format( stream, $str9$__HL_Modules_____________________, hl_module_count );
    PrintLow.format( stream, $str10$___Removal_Modules_______________, removal_module_count );
    PrintLow.format( stream, $str11$___Meta_Removal_Modules__________, meta_removal_module_count );
    PrintLow.format( stream, $str12$___Conjunctive_Removal_Modules___, conjunctive_removal_module_count );
    PrintLow.format( stream, $str13$___Transformation_Modules________, transformation_module_count );
    PrintLow.format( stream, $str14$___Meta_Transformation_Modules___, meta_transformation_module_count );
    PrintLow.format( stream, $str15$___Structural_Modules____________, structural_module_count );
    PrintLow.format( stream, $str16$___Meta_Structural_Modules_______, meta_structural_module_count );
    PrintLow.format( stream, $str17$___Forward_Modules_______________, forward_module_count );
    PrintLow.format( stream, $str18$___Storage_Modules_______________, hl_storage_module_count );
    PrintLow.format( stream, $str19$___Evaluatable_Predicates________, evaluatable_predicate_count );
    PrintLow.format( stream, $str20$___Evaluatable_Functions_________, evaluatable_function_count );
    streams_high.terpri( stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 6034L)
  public static SubLObject determine_hl_module_name(final SubLObject string, final SubLObject sense)
  {
    final SubLObject break_list = ConsesLow.append( string_utilities.whitespace_chars(), $list21 );
    SubLObject substrings = Sequences.delete_if( $sym22$EMPTY_STRING_P, string_utilities.string_tokenize( string, break_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    if( sense.eql( $kw23$POS ) )
    {
      substrings = list_utilities.snoc( $str24$pos, substrings );
    }
    else if( sense.eql( $kw25$NEG ) )
    {
      if( NIL != string_utilities.substringP( $str26$not, substrings.first(), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED ) )
      {
        substrings = list_utilities.snoc( $str27$neg, substrings.rest() );
      }
      else
      {
        substrings = list_utilities.snoc( $str27$neg, substrings );
      }
    }
    return make_removal_module_name( substrings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 6736L)
  public static SubLObject make_removal_module_name(final SubLObject substrings)
  {
    final SubLObject string = Strings.string_upcase( string_utilities.bunge( substrings, Characters.CHAR_hyphen ), UNPROVIDED, UNPROVIDED );
    final SubLObject symbol = Symbols.gensym( string );
    final SubLObject keyword = Symbols.make_keyword( symbol );
    return keyword;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 7022L)
  public static SubLObject current_query_allows_new_termsP()
  {
    final SubLObject store = inference_worker.currently_active_problem_store();
    if( NIL != store )
    {
      return inference_datastructures_problem_store.problem_store_new_terms_allowedP( store );
    }
    return inference_trivial.current_query_property_lookup( $kw28$NEW_TERMS_ALLOWED_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 8918L)
  public static SubLObject module_requires_negation_by_failureP(final SubLObject module_name)
  {
    return list_utilities.member_eqP( module_name, $modules_require_negation_by_failure$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 9521L)
  public static SubLObject module_requires_completeness_minimization_for_supportP(final SubLObject module_name, final SubLObject hl_support)
  {
    SubLObject cdolist_list_var = $completeness_minimization_required_modules$.getGlobalValue();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject module = NIL;
      SubLObject support = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
      module = current.first();
      current = ( support = current.rest() );
      if( module_name.eql( module ) && hl_support.eql( support ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 10581L)
  public static SubLObject module_requires_new_terms_allowedP(final SubLObject module_name)
  {
    return list_utilities.member_eqP( module_name, $new_terms_allowed_required_modules$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 10912L)
  public static SubLObject module_requires_evaluate_sublP(final SubLObject module_name)
  {
    return list_utilities.member_eqP( module_name, $evaluate_subl_required_modules$.getGlobalValue() );
  }

  public static SubLObject declare_removal_module_utilities_file()
  {
    SubLFiles.declareFunction( me, "negation_grossly_incompleteP", "NEGATION-GROSSLY-INCOMPLETE?", 2, 0, false );
    SubLFiles.declareFunction( me, "invert_removal_check_cost", "INVERT-REMOVAL-CHECK-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_to_singleton", "ANSWER-TO-SINGLETON", 1, 0, false );
    SubLFiles.declareFunction( me, "non_null_answer_to_singleton", "NON-NULL-ANSWER-TO-SINGLETON", 1, 0, false );
    SubLFiles.declareFunction( me, "invert_boolean_answer", "INVERT-BOOLEAN-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "additional_isa_support", "ADDITIONAL-ISA-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "additional_isa_supports", "ADDITIONAL-ISA-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_genl_inverse_support", "MAKE-GENL-INVERSE-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "additional_genl_inverse_supports", "ADDITIONAL-GENL-INVERSE-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_genl_preds_support", "MAKE-GENL-PREDS-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "additional_genl_preds_supports", "ADDITIONAL-GENL-PREDS-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_simplification_support", "MAKE-SIMPLIFICATION-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_module_count", "HL-MODULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_module_statistics", "HL-MODULE-STATISTICS", 0, 1, false );
    SubLFiles.declareFunction( me, "determine_hl_module_name", "DETERMINE-HL-MODULE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "make_removal_module_name", "MAKE-REMOVAL-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "current_query_allows_new_termsP", "CURRENT-QUERY-ALLOWS-NEW-TERMS?", 0, 0, false );
    SubLFiles.declareFunction( me, "module_requires_negation_by_failureP", "MODULE-REQUIRES-NEGATION-BY-FAILURE?", 1, 0, false );
    SubLFiles.declareFunction( me, "module_requires_completeness_minimization_for_supportP", "MODULE-REQUIRES-COMPLETENESS-MINIMIZATION-FOR-SUPPORT?", 2, 0, false );
    SubLFiles.declareFunction( me, "module_requires_new_terms_allowedP", "MODULE-REQUIRES-NEW-TERMS-ALLOWED?", 1, 0, false );
    SubLFiles.declareFunction( me, "module_requires_evaluate_sublP", "MODULE-REQUIRES-EVALUATE-SUBL?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_module_utilities_file()
  {
    $modules_require_negation_by_failure$ = SubLFiles.deflexical( "*MODULES-REQUIRE-NEGATION-BY-FAILURE*", $list29 );
    $completeness_minimization_required_modules$ = SubLFiles.deflexical( "*COMPLETENESS-MINIMIZATION-REQUIRED-MODULES*", $list30 );
    $new_terms_allowed_required_modules$ = SubLFiles.deflexical( "*NEW-TERMS-ALLOWED-REQUIRED-MODULES*", $list32 );
    $evaluate_subl_required_modules$ = SubLFiles.deflexical( "*EVALUATE-SUBL-REQUIRED-MODULES*", $list33 );
    return NIL;
  }

  public static SubLObject setup_removal_module_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_module_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_module_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_module_utilities_file();
  }
  static
  {
    me = new removal_module_utilities();
    $modules_require_negation_by_failure$ = null;
    $completeness_minimization_required_modules$ = null;
    $new_terms_allowed_required_modules$ = null;
    $evaluate_subl_required_modules$ = null;
    $const0$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw1$ISA = makeKeyword( "ISA" );
    $const2$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $kw3$GENLPREDS = makeKeyword( "GENLPREDS" );
    $const4$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $kw5$CODE = makeKeyword( "CODE" );
    $list6 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?X" ), makeSymbol( "?X" ) );
    $kw7$TRUE_MON = makeKeyword( "TRUE-MON" );
    $str8$______System__a_HL_module_statist = makeString( "~%;;; System ~a HL module statistics" );
    $str9$__HL_Modules_____________________ = makeString( "~%HL Modules                   : ~6,' D" );
    $str10$___Removal_Modules_______________ = makeString( "~% Removal Modules             : ~6,' D" );
    $str11$___Meta_Removal_Modules__________ = makeString( "~% Meta-Removal Modules        : ~6,' D" );
    $str12$___Conjunctive_Removal_Modules___ = makeString( "~% Conjunctive Removal Modules : ~6,' D" );
    $str13$___Transformation_Modules________ = makeString( "~% Transformation Modules      : ~6,' D" );
    $str14$___Meta_Transformation_Modules___ = makeString( "~% Meta-Transformation Modules : ~6,' D" );
    $str15$___Structural_Modules____________ = makeString( "~% Structural Modules          : ~6,' D" );
    $str16$___Meta_Structural_Modules_______ = makeString( "~% Meta-Structural Modules     : ~6,' D" );
    $str17$___Forward_Modules_______________ = makeString( "~% Forward Modules             : ~6,' D" );
    $str18$___Storage_Modules_______________ = makeString( "~% Storage Modules             : ~6,' D" );
    $str19$___Evaluatable_Predicates________ = makeString( "~% Evaluatable Predicates      : ~6,' D" );
    $str20$___Evaluatable_Functions_________ = makeString( "~% Evaluatable Functions       : ~6,' D" );
    $list21 = ConsesLow.list( Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_less, Characters.CHAR_greater, makeString( "#$" ), Characters.CHAR_period );
    $sym22$EMPTY_STRING_P = makeSymbol( "EMPTY-STRING-P" );
    $kw23$POS = makeKeyword( "POS" );
    $str24$pos = makeString( "pos" );
    $kw25$NEG = makeKeyword( "NEG" );
    $str26$not = makeString( "not" );
    $str27$neg = makeString( "neg" );
    $kw28$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $list29 = ConsesLow.list( new SubLObject[] { makeKeyword( "REMOVAL-NOT-ISA-COLLECTION-CHECK" ), makeKeyword( "REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK" ), makeKeyword( "REMOVAL-NOT-CONCEPTUALLY-RELATED" ),
      makeKeyword( "REMOVAL-NOT-DISJOINTWITH-CHECK" ), makeKeyword( "REMOVAL-NOT-GENLINVERSE-CHECK" ), makeKeyword( "REMOVAL-NOT-GENLMT-CHECK" ), makeKeyword( "REMOVAL-NOT-GENLPREDS-CHECK" ), makeKeyword(
          "REMOVAL-NOT-SUPERSET" ), makeKeyword( "REMOVAL-MINIMIZE-EXTENT" ), makeKeyword( "REMOVAL-NOT-NEGATIONINVERSE-CHECK" ), makeKeyword( "REMOVAL-NOT-NEGATIONPREDS-CHECK" ), makeKeyword(
              "REMOVAL-NOT-STARTS-AFTER-STARTING-OF" ), makeKeyword( "REMOVAL-NOT-STARTS-AFTER-ENDING-OF" ), makeKeyword( "REMOVAL-NOT-ENDS-AFTER-STARTING-OF" ), makeKeyword( "REMOVAL-NOT-ENDS-AFTER-ENDING-OF" ),
      makeKeyword( "REMOVAL-NOT-TEMPORALLY-SUBSUMES" ), makeKeyword( "REMOVAL-NOT-DATE-OF-EVENT" ), makeKeyword( "REMOVAL-NOT-COTEMPORAL" ), makeKeyword( "REMOVAL-NOT-TEMPORALLY-INTERSECTS" ), makeKeyword(
          "REMOVAL-NOT-TEMPORALLY-DISJOINT" ), makeKeyword( "REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN" ), makeKeyword( "REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME" ), makeKeyword( "REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT" ),
      makeKeyword( "REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL" ), makeKeyword( "REMOVAL-NOT-TEMPORALLY-COORIGINATING" ), makeKeyword( "REMOVAL-NOT-TEMPORALLY-COTERMINAL" ), makeKeyword( "REMOVAL-NOT-CONTIGUOUS-AFTER" ),
      makeKeyword( "REMOVAL-NOT-STARTS-DURING" ), makeKeyword( "REMOVAL-NOT-ENDS-DURING" ), makeKeyword( "REMOVAL-NOT-STARTING-DATE" ), makeKeyword( "REMOVAL-NOT-ENDING-DATE" ), makeKeyword( "REMOVAL-NOT-BIRTH-DATE" ),
      makeKeyword( "REMOVAL-NOT-DATE-OF-DEATH" ), makeKeyword( "REMOVAL-NOT-TEMPORALLY-STARTED-BY" ), makeKeyword( "REMOVAL-NOT-TEMPORALLY-FINISHED-BY" ), makeKeyword( "REMOVAL-NOT-OVERLAPS-START" )
    } );
    $list30 = ConsesLow.list( ConsesLow.cons( makeKeyword( "REMOVAL-NOT-ISA-COLLECTION-CHECK" ), makeKeyword( "ISA" ) ), ConsesLow.cons( makeKeyword( "REMOVAL-ISA-DEFN-REJECT" ), makeKeyword( "ISA" ) ), ConsesLow.cons(
        makeKeyword( "REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK" ), makeKeyword( "ISA" ) ), ConsesLow.cons( makeKeyword( "REMOVAL-QUOTED-ISA-DEFN-REJECT" ), makeKeyword( "ISA" ) ), ConsesLow.cons( makeKeyword(
            "REMOVAL-COMPLETELY-DECIDABLE-NEG" ), makeKeyword( "MINIMIZE" ) ) );
    $list31 = ConsesLow.cons( makeSymbol( "MODULE" ), makeSymbol( "SUPPORT" ) );
    $list32 = ConsesLow.list( new SubLObject[] { makeKeyword( "REMOVAL-SKOLEMIZE-CREATE" ), makeKeyword( "REMOVAL-RELATION-ALL-EXISTS-UNIFY" ), makeKeyword( "REMOVAL-RELATION-EXISTS-ALL-UNIFY" ), makeKeyword(
        "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1" ), makeKeyword( "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2" ), makeKeyword( "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1" ), makeKeyword(
            "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2" ), makeKeyword( "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1" ), makeKeyword( "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2" ), makeKeyword(
                "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1" ), makeKeyword( "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2" )
    } );
    $list33 = ConsesLow.list( makeKeyword( "REMOVAL-PERFORM-SUBL-POS" ), makeKeyword( "REMOVAL-PERFORM-SUBL-NEG" ) );
  }
}
/*
 * 
 * Total time: 53 ms
 * 
 */