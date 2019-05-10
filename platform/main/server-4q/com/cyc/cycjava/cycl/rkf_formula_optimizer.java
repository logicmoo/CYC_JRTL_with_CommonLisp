package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_formula_optimizer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_formula_optimizer";
  public static final String myFingerPrint = "9bcbd17bd85c564c5e2a36dd7843280300206abb00755d937a84c77d51a6bd11";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 967L)
  public static SubLSymbol $rkf_reformulator_replace_pronounsP$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2322L)
  public static SubLSymbol $rkf_sharpen_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2435L)
  public static SubLSymbol $rkf_return_multiple_quantificationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 10272L)
  public static SubLSymbol $rkf_late_pronoun_substitutionP$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 10335L)
  private static SubLSymbol $rkf_meaning_of_you$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 10500L)
  private static SubLSymbol $rkf_meaning_of_me$;
  private static final SubLSymbol $sym0$EL_FORMULA_P;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$QUESTION;
  private static final SubLSymbol $kw3$ASSERTION;
  private static final SubLSymbol $kw4$DECLARATIVE;
  private static final SubLString $str5$Optimizing_internal_representatio;
  private static final SubLSymbol $sym6$RKF_REFORMULATOR_SENTENCES_EQUAL_;
  private static final SubLObject $const7$PronounFn;
  private static final SubLSymbol $sym8$REPLACE_PRONOUNS_IN_CYCL;
  private static final SubLObject $const9$CycProgram;
  private static final SubLSymbol $sym10$SECOND_PERSON_PRONOUN_;
  private static final SubLSymbol $sym11$REPLACE_WITH_YOU;
  private static final SubLSymbol $sym12$FIRST_PERSON_PRONOUN_;
  private static final SubLSymbol $sym13$REPLACE_WITH_ME;
  private static final SubLObject $const14$SecondPerson_NLAttr;
  private static final SubLObject $const15$FirstPerson_NLAttr;
  private static final SubLString $str16$return_multiple_reformulations;
  private static final SubLString $str17$rkf_formula_optimizer_test_suite;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 1144L)
  public static SubLObject rkf_optimize_assert_formula(final SubLObject assert_formula, final SubLObject domain_mt)
  {
    assert NIL != el_utilities.el_formula_p( assert_formula ) : assert_formula;
    final SubLObject except_whenP = rkf_exception_formulaP( assert_formula );
    return ( NIL != except_whenP ) ? reformulator_utilities.reformulate_cycl_exception_rules( assert_formula, domain_mt, UNPROVIDED ) : reformulator_hub.reformulate_cycl( assert_formula, domain_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 1538L)
  public static SubLObject rkf_optimize_query_formula(final SubLObject query_formula, final SubLObject domain_mt)
  {
    assert NIL != el_utilities.el_formula_p( query_formula ) : query_formula;
    return reformulator_hub.reformulate_cycl( query_formula, domain_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 1894L)
  public static SubLObject rkf_optimize_formula(final SubLObject formula, final SubLObject domain_mt)
  {
    assert NIL != el_utilities.el_formula_p( formula ) : formula;
    return reformulator_hub.reformulate_cycl( formula, domain_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2075L)
  public static SubLObject rkf_exception_formulaP(final SubLObject formula)
  {
    SubLObject exceptionP = NIL;
    if( NIL == exceptionP )
    {
      SubLObject csome_list_var;
      SubLObject exception_term;
      for( csome_list_var = $list1, exception_term = NIL, exception_term = csome_list_var.first(); NIL == exceptionP && NIL != csome_list_var; exceptionP = cycl_utilities.expression_find( exception_term, formula,
          UNPROVIDED, UNPROVIDED, UNPROVIDED ), csome_list_var = csome_list_var.rest(), exception_term = csome_list_var.first() )
      {
      }
    }
    return exceptionP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2584L)
  public static SubLObject rkf_reformulate_query_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints)
  {
    if( constraints == UNPROVIDED )
    {
      constraints = NIL;
    }
    return rkf_reformulate_into_many( formula, domain_mt, T, $kw2$QUESTION, constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2754L)
  public static SubLObject rkf_reformulate_assert_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints)
  {
    if( constraints == UNPROVIDED )
    {
      constraints = NIL;
    }
    return rkf_reformulate_and_sharpen_into_many( formula, domain_mt, $kw3$ASSERTION, constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 2936L)
  public static SubLObject rkf_reformulate_and_sharpen_into_many(final SubLObject assert_formula, final SubLObject domain_mt, SubLObject force, SubLObject constraints)
  {
    if( force == UNPROVIDED )
    {
      force = $kw4$DECLARATIVE;
    }
    if( constraints == UNPROVIDED )
    {
      constraints = NIL;
    }
    rkf_mumbler.rkf_mumble( $str5$Optimizing_internal_representatio, UNPROVIDED );
    return rkf_reformulate_into_many( assert_formula, domain_mt, T, force, constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 3217L)
  public static SubLObject rkf_reformulate_before_strengthening_old_qp(SubLObject formula, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    formula = reformulator_utilities_nl.reformulate_cycl_the_coordination_set_removal( formula, domain_mt );
    formula = reformulator_utilities_nl.reformulate_cycl_quantopt( formula, domain_mt, UNPROVIDED );
    if( NIL != reformulator_utilities_nl.try_process_reformulator_for_quantunifyP( formula ) )
    {
      formula = reformulator_utilities_nl.reformulate_cycl_quantunify( formula, domain_mt, UNPROVIDED );
    }
    if( NIL != reformulator_utilities_nl.try_process_reformulator_for_vppproc_stateP( formula ) )
    {
      formula = reformulator_utilities_nl.reformulate_cycl_vppproc_state( formula, domain_mt, UNPROVIDED );
    }
    formula = reformulator_utilities_nl.reformulate_cycl_quantproc_rules( formula, domain_mt, UNPROVIDED );
    formula = reformulator_utilities_nl.reformulate_cycl_quantproc( formula, domain_mt, UNPROVIDED );
    if( NIL != reformulator_utilities_nl.try_process_reformulator_for_vppproc_nonstateP( formula ) )
    {
      formula = reformulator_utilities_nl.reformulate_cycl_vppproc_nonstate( formula, domain_mt, UNPROVIDED );
    }
    formula = reformulator_utilities_nl.reformulate_cycl_subcollproc( formula, domain_mt, UNPROVIDED );
    formula = reformulator_utilities_nl.reformulate_cycl_quantproc( formula, domain_mt, UNPROVIDED );
    if( NIL != $rkf_reformulator_replace_pronounsP$.getDynamicValue( thread ) && NIL != $rkf_late_pronoun_substitutionP$.getDynamicValue( thread ) )
    {
      formula = replace_pronouns_in_cycl( formula );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 4769L)
  public static SubLObject rkf_reformulate_before_strengthening_qp_3(SubLObject formula, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject formulas = NIL;
    formula = reformulator_utilities_nl.reformulate_cycl_the_coordination_set_removal( formula, domain_mt );
    formula = reformulator_utilities_nl.reformulate_cycl_quantopt_3( formula, domain_mt, UNPROVIDED );
    if( NIL != reformulator_utilities_nl.try_process_reformulator_for_quantunify_3P( formula ) )
    {
      formula = reformulator_utilities_nl.reformulate_cycl_quantunify_3( formula, domain_mt, UNPROVIDED );
    }
    if( NIL != reformulator_utilities_nl.try_process_reformulator_for_vppproc_stateP( formula ) )
    {
      formula = reformulator_utilities_nl.reformulate_cycl_vppproc_state( formula, domain_mt, UNPROVIDED );
    }
    if( NIL != $rkf_return_multiple_quantificationsP$.getDynamicValue( thread ) && NIL != el_utilities.el_formula_p( formula ) )
    {
      formulas = reformulator_module_quantifier_processing_3.quantproc_3_el_formula_permutations( formula );
    }
    else
    {
      formulas = ConsesLow.list( formula );
    }
    formulas = reformulator_utilities_nl.reformulate_cycls_quantproc_3_rules( formulas, domain_mt, UNPROVIDED );
    formulas = reformulator_utilities_nl.reformulate_cycls_quantproc_3( formulas, domain_mt, UNPROVIDED );
    formulas = reformulator_utilities_nl.try_to_reformulate_cycls_vppproc_nonstate( formulas, domain_mt, UNPROVIDED );
    formulas = reformulator_utilities_nl.reformulate_cycl_subcollproc( formulas, domain_mt, UNPROVIDED );
    formulas = reformulator_utilities_nl.reformulate_cycls_quantproc_3( formulas, domain_mt, UNPROVIDED );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( domain_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      formulas = Sequences.remove_duplicates( formulas, Symbols.symbol_function( $sym6$RKF_REFORMULATOR_SENTENCES_EQUAL_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL != $rkf_reformulator_replace_pronounsP$.getDynamicValue( thread ) && NIL != $rkf_late_pronoun_substitutionP$.getDynamicValue( thread ) )
    {
      formulas = replace_pronouns_in_cycls( formulas );
    }
    formulas = reformulator_utilities.reformulate_cycls( formulas, domain_mt, UNPROVIDED );
    return formulas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 6897L)
  public static SubLObject rkf_reformulate_before_strengthening(final SubLObject formula, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == parsing_vars.$use_ternary_np_tagsP$.getDynamicValue( thread ) )
    {
      return rkf_reformulate_before_strengthening_old_qp( ConsesLow.list( formula ), domain_mt );
    }
    return rkf_reformulate_before_strengthening_qp_3( formula, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 7324L)
  public static SubLObject rkf_tersify(final SubLObject formula, final SubLObject domain_mt)
  {
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 7611L)
  public static SubLObject rkf_reformulate_into_many(final SubLObject formula, final SubLObject domain_mt, SubLObject strengthenP, SubLObject force, SubLObject constraints)
  {
    if( strengthenP == UNPROVIDED )
    {
      strengthenP = NIL;
    }
    if( force == UNPROVIDED )
    {
      force = $kw3$ASSERTION;
    }
    if( constraints == UNPROVIDED )
    {
      constraints = NIL;
    }
    SubLObject new_cycl = NIL;
    SubLObject improvements = NIL;
    final SubLObject drt_result = T;
    SubLObject formulas = NIL;
    SubLObject shifted_cycl = NIL;
    formulas = rkf_reformulate_before_strengthening( formula, domain_mt );
    if( force == $kw2$QUESTION )
    {
      formulas = reformulator_utilities.reformulate_query_cycls( formulas, domain_mt, UNPROVIDED );
    }
    SubLObject cdolist_list_var = formulas;
    SubLObject formula_$1 = NIL;
    formula_$1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != strengthenP )
      {
        improvements = Sequences.cconcatenate( improvements, predicate_strengthener.pred_strengthen_formula( formula_$1, domain_mt, constraints ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      formula_$1 = cdolist_list_var.first();
    }
    if( NIL == improvements )
    {
      improvements = formulas;
    }
    SubLObject reformed_results = NIL;
    SubLObject cdolist_list_var2 = improvements;
    SubLObject formula_$2 = NIL;
    formula_$2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      new_cycl = reformulator_hub.reformulate_cycl( formula_$2, domain_mt, UNPROVIDED );
      if( NIL != new_cycl )
      {
        reformed_results = ConsesLow.cons( new_cycl, reformed_results );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      formula_$2 = cdolist_list_var2.first();
    }
    if( NIL != reformed_results )
    {
      improvements = reformed_results;
    }
    cdolist_list_var = improvements;
    SubLObject cycl_option = NIL;
    cycl_option = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.el_formula_p( cycl_option ) )
      {
        final SubLObject uniform = rkf_optimize_assert_formula( cycl_option, domain_mt );
        final SubLObject shifted = reformulator_utilities_nl.reformulate_cycl_typeshift( uniform, domain_mt, UNPROVIDED );
        if( NIL != shifted )
        {
          shifted_cycl = ConsesLow.cons( shifted, shifted_cycl );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      cycl_option = cdolist_list_var.first();
    }
    return shifted_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 9425L)
  public static SubLObject expression_contains_pronounP(final SubLObject expression)
  {
    return list_utilities.sublisp_boolean( cycl_utilities.expression_find( $const7$PronounFn, expression, T, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 9548L)
  public static SubLObject formula_list_p(final SubLObject formulas)
  {
    return makeBoolean( formulas.isList() && NIL != list_utilities.every_in_list( $sym0$EL_FORMULA_P, formulas, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 9729L)
  public static SubLObject replace_pronouns_in_cycls(final SubLObject formulas)
  {
    return Mapping.mapcar( $sym8$REPLACE_PRONOUNS_IN_CYCL, formulas );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 9847L)
  public static SubLObject replace_pronouns_in_cycl(SubLObject formula)
  {
    formula = replace_first_person_pronouns_in_cycl( formula, operation_communication.the_cyclist() );
    formula = replace_second_person_pronouns_in_cycl( formula, $const9$CycProgram );
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 10665L)
  public static SubLObject replace_second_person_pronouns_in_cycl(SubLObject formula, final SubLObject meaning_of_you)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == second_person_pronounP( meaning_of_you ) )
    {
      final SubLObject _prev_bind_0 = $rkf_meaning_of_you$.currentBinding( thread );
      try
      {
        $rkf_meaning_of_you$.bind( meaning_of_you, thread );
        formula = cycl_utilities.expression_transform( formula, $sym10$SECOND_PERSON_PRONOUN_, $sym11$REPLACE_WITH_YOU, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        $rkf_meaning_of_you$.rebind( _prev_bind_0, thread );
      }
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 10963L)
  public static SubLObject replace_first_person_pronouns_in_cycl(SubLObject formula, final SubLObject meaning_of_me)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == first_person_pronounP( meaning_of_me ) )
    {
      final SubLObject _prev_bind_0 = $rkf_meaning_of_me$.currentBinding( thread );
      try
      {
        $rkf_meaning_of_me$.bind( meaning_of_me, thread );
        formula = cycl_utilities.expression_transform( formula, $sym12$FIRST_PERSON_PRONOUN_, $sym13$REPLACE_WITH_ME, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        $rkf_meaning_of_me$.rebind( _prev_bind_0, thread );
      }
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 11372L)
  public static SubLObject second_person_pronounP(final SubLObject v_object)
  {
    return makeBoolean( cycl_utilities.formula_arg0( v_object ).eql( $const7$PronounFn ) && cycl_utilities.formula_arg1( v_object, UNPROVIDED ).eql( $const14$SecondPerson_NLAttr ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 11532L)
  public static SubLObject first_person_pronounP(final SubLObject v_object)
  {
    return makeBoolean( cycl_utilities.formula_arg0( v_object ).eql( $const7$PronounFn ) && cycl_utilities.formula_arg1( v_object, UNPROVIDED ).eql( $const15$FirstPerson_NLAttr ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 11689L)
  public static SubLObject replace_with_you(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $rkf_meaning_of_you$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 11774L)
  public static SubLObject replace_with_me(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $rkf_meaning_of_me$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-formula-optimizer.lisp", position = 11857L)
  public static SubLObject rkf_reformulator_sentences_equalP(final SubLObject term_1, final SubLObject term_2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return czer_utilities.el_expression_equalP( term_1, term_2, mt, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_rkf_formula_optimizer_file()
  {
    SubLFiles.declareFunction( me, "rkf_optimize_assert_formula", "RKF-OPTIMIZE-ASSERT-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_optimize_query_formula", "RKF-OPTIMIZE-QUERY-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_optimize_formula", "RKF-OPTIMIZE-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_exception_formulaP", "RKF-EXCEPTION-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_reformulate_query_formula", "RKF-REFORMULATE-QUERY-FORMULA", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_reformulate_assert_formula", "RKF-REFORMULATE-ASSERT-FORMULA", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_reformulate_and_sharpen_into_many", "RKF-REFORMULATE-AND-SHARPEN-INTO-MANY", 2, 2, false );
    SubLFiles.declareFunction( me, "rkf_reformulate_before_strengthening_old_qp", "RKF-REFORMULATE-BEFORE-STRENGTHENING-OLD-QP", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_reformulate_before_strengthening_qp_3", "RKF-REFORMULATE-BEFORE-STRENGTHENING-QP-3", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_reformulate_before_strengthening", "RKF-REFORMULATE-BEFORE-STRENGTHENING", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_tersify", "RKF-TERSIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_reformulate_into_many", "RKF-REFORMULATE-INTO-MANY", 2, 3, false );
    SubLFiles.declareFunction( me, "expression_contains_pronounP", "EXPRESSION-CONTAINS-PRONOUN?", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_list_p", "FORMULA-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_pronouns_in_cycls", "REPLACE-PRONOUNS-IN-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_pronouns_in_cycl", "REPLACE-PRONOUNS-IN-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_second_person_pronouns_in_cycl", "REPLACE-SECOND-PERSON-PRONOUNS-IN-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "replace_first_person_pronouns_in_cycl", "REPLACE-FIRST-PERSON-PRONOUNS-IN-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "second_person_pronounP", "SECOND-PERSON-PRONOUN?", 1, 0, false );
    SubLFiles.declareFunction( me, "first_person_pronounP", "FIRST-PERSON-PRONOUN?", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_with_you", "REPLACE-WITH-YOU", 1, 0, false );
    SubLFiles.declareFunction( me, "replace_with_me", "REPLACE-WITH-ME", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_reformulator_sentences_equalP", "RKF-REFORMULATOR-SENTENCES-EQUAL?", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_rkf_formula_optimizer_file()
  {
    $rkf_reformulator_replace_pronounsP$ = SubLFiles.defparameter( "*RKF-REFORMULATOR-REPLACE-PRONOUNS?*", T );
    $rkf_sharpen_preds$ = SubLFiles.defparameter( "*RKF-SHARPEN-PREDS*", T );
    $rkf_return_multiple_quantificationsP$ = SubLFiles.defparameter( "*RKF-RETURN-MULTIPLE-QUANTIFICATIONS?*", T );
    $rkf_late_pronoun_substitutionP$ = SubLFiles.defparameter( "*RKF-LATE-PRONOUN-SUBSTITUTION?*", NIL );
    $rkf_meaning_of_you$ = SubLFiles.defparameter( "*RKF-MEANING-OF-YOU*", $const9$CycProgram );
    $rkf_meaning_of_me$ = SubLFiles.defparameter( "*RKF-MEANING-OF-ME*", NIL );
    return NIL;
  }

  public static SubLObject setup_rkf_formula_optimizer_file()
  {
    sunit_external.define_test_category( $str16$return_multiple_reformulations, UNPROVIDED );
    sunit_external.define_test_suite( $str17$rkf_formula_optimizer_test_suite, ConsesLow.list( $str16$return_multiple_reformulations ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_formula_optimizer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_formula_optimizer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_formula_optimizer_file();
  }
  static
  {
    me = new rkf_formula_optimizer();
    $rkf_reformulator_replace_pronounsP$ = null;
    $rkf_sharpen_preds$ = null;
    $rkf_return_multiple_quantificationsP$ = null;
    $rkf_late_pronoun_substitutionP$ = null;
    $rkf_meaning_of_you$ = null;
    $rkf_meaning_of_me$ = null;
    $sym0$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "exceptWhen" ) ), constant_handles.reader_make_constant_shell( makeString( "exceptFor" ) ), constant_handles
        .reader_make_constant_shell( makeString( "abnormal" ) ) );
    $kw2$QUESTION = makeKeyword( "QUESTION" );
    $kw3$ASSERTION = makeKeyword( "ASSERTION" );
    $kw4$DECLARATIVE = makeKeyword( "DECLARATIVE" );
    $str5$Optimizing_internal_representatio = makeString( "Optimizing internal representation of knowledge." );
    $sym6$RKF_REFORMULATOR_SENTENCES_EQUAL_ = makeSymbol( "RKF-REFORMULATOR-SENTENCES-EQUAL?" );
    $const7$PronounFn = constant_handles.reader_make_constant_shell( makeString( "PronounFn" ) );
    $sym8$REPLACE_PRONOUNS_IN_CYCL = makeSymbol( "REPLACE-PRONOUNS-IN-CYCL" );
    $const9$CycProgram = constant_handles.reader_make_constant_shell( makeString( "CycProgram" ) );
    $sym10$SECOND_PERSON_PRONOUN_ = makeSymbol( "SECOND-PERSON-PRONOUN?" );
    $sym11$REPLACE_WITH_YOU = makeSymbol( "REPLACE-WITH-YOU" );
    $sym12$FIRST_PERSON_PRONOUN_ = makeSymbol( "FIRST-PERSON-PRONOUN?" );
    $sym13$REPLACE_WITH_ME = makeSymbol( "REPLACE-WITH-ME" );
    $const14$SecondPerson_NLAttr = constant_handles.reader_make_constant_shell( makeString( "SecondPerson-NLAttr" ) );
    $const15$FirstPerson_NLAttr = constant_handles.reader_make_constant_shell( makeString( "FirstPerson-NLAttr" ) );
    $str16$return_multiple_reformulations = makeString( "return multiple reformulations" );
    $str17$rkf_formula_optimizer_test_suite = makeString( "rkf-formula-optimizer-test-suite" );
  }
}
/*
 * 
 * Total time: 74 ms
 * 
 */