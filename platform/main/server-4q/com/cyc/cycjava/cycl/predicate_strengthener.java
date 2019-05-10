package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class predicate_strengthener
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.predicate_strengthener";
  public static final String myFingerPrint = "abffd47af93f2112688f60c74bd243c7887d34e0b834c056707dcb88e31fdcb8";
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 852L)
  private static SubLSymbol $strengthen_original_pred_awayP$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1108L)
  public static SubLSymbol $pred_strengthen_stop_at_first_specified_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1185L)
  public static SubLSymbol $pred_strengthening_max_literal_count$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1346L)
  public static SubLSymbol $max_pred_strengs$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 2647L)
  private static SubLSymbol $pred_strengthener_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 5554L)
  private static SubLSymbol $do_not_strengthen_isaP$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 12278L)
  private static SubLSymbol $reformulator_rules_to_use$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 13600L)
  private static SubLSymbol $reformulator_rules_to_ignore$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLSymbol $dtp_constraint$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 27823L)
  private static SubLSymbol $predstren_common_uninteresting$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 34899L)
  private static SubLSymbol $ps_suggested_inverses$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 35063L)
  private static SubLSymbol $ps_suggested_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 35149L)
  private static SubLSymbol $ps_typed_inverses$;
  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 35245L)
  private static SubLSymbol $ps_typed_preds$;
  private static final SubLSymbol $kw0$POSITIVE_INFINITY;
  private static final SubLSymbol $sym1$ATOMIC_SENTENCE_;
  private static final SubLSymbol $sym2$EL_FORMULA_P;
  private static final SubLSymbol $sym3$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS;
  private static final SubLSymbol $sym4$STRENGTHEN_PREDICATE_W_TYPED_LINKS_ONLY;
  private static final SubLObject $const5$isa;
  private static final SubLObject $const6$is_Underspecified;
  private static final SubLSymbol $sym7$NART_P;
  private static final SubLString $str8$PredStren__no_contracted_version_;
  private static final SubLObject $const9$genlInverse;
  private static final SubLSymbol $kw10$ANY;
  private static final SubLSymbol $sym11$RELEVANT_MT_IS_ANY_MT;
  private static final SubLObject $const12$InferencePSC;
  private static final SubLSymbol $sym13$PREDSTREN_EXPANDIBLE_RMP_;
  private static final SubLSymbol $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_;
  private static final SubLSymbol $sym15$PREDSTREN_EXPAND_FORMULA;
  private static final SubLSymbol $kw16$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym17$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym18$PREDSTREN_EXPAND_ONE_STEP;
  private static final SubLObject $const19$expansion;
  private static final SubLSymbol $sym20$_REFORMULATOR_RULES_TO_USE_;
  private static final SubLSymbol $sym21$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const22$EverythingPSC;
  private static final SubLObject $const23$SubcollectionRelationFunction;
  private static final SubLObject $const24$RuleMacroPredicate;
  private static final SubLSymbol $kw25$TRUE;
  private static final SubLSymbol $sym26$_REFORMULATOR_RULES_TO_IGNORE_;
  private static final SubLList $list27;
  private static final SubLObject $const28$IntermediateVocabularyMt;
  private static final SubLList $list29;
  private static final SubLSymbol $kw30$MAX_TIME;
  private static final SubLInteger $int31$30;
  private static final SubLSymbol $kw32$RECURSION_LIMIT;
  private static final SubLSymbol $kw33$FOCUS;
  private static final SubLObject $const34$ReformulatorRuleUnifier;
  private static final SubLSymbol $kw35$REFORMULATOR_RULES;
  private static final SubLSymbol $kw36$SKIP_ASSERTIONS;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLObject $const39$genls;
  private static final SubLObject $const40$and;
  private static final SubLObject $const41$genlPreds;
  private static final SubLList $list42;
  private static final SubLObject $const43$equals;
  private static final SubLObject $const44$Set_Mathematical;
  private static final SubLObject $const45$elementOf;
  private static final SubLSymbol $sym46$CONSTRAINT;
  private static final SubLSymbol $sym47$CONSTRAINT_P;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$PRINT_CONSTRAINT;
  private static final SubLSymbol $sym53$CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$CONSTRAINT_VARIABLE;
  private static final SubLSymbol $sym56$_CSETF_CONSTRAINT_VARIABLE;
  private static final SubLSymbol $sym57$CONSTRAINT_ISA_LIST;
  private static final SubLSymbol $sym58$_CSETF_CONSTRAINT_ISA_LIST;
  private static final SubLSymbol $sym59$CONSTRAINT_GENL_LIST;
  private static final SubLSymbol $sym60$_CSETF_CONSTRAINT_GENL_LIST;
  private static final SubLSymbol $kw61$VARIABLE;
  private static final SubLSymbol $kw62$ISA_LIST;
  private static final SubLSymbol $kw63$GENL_LIST;
  private static final SubLString $str64$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw65$BEGIN;
  private static final SubLSymbol $sym66$MAKE_CONSTRAINT;
  private static final SubLSymbol $kw67$SLOT;
  private static final SubLSymbol $kw68$END;
  private static final SubLSymbol $sym69$VISIT_DEFSTRUCT_OBJECT_CONSTRAINT_METHOD;
  private static final SubLString $str70$__Constraint___A_isa___A_genl___A;
  private static final SubLObject $const71$CollectionSubsetFn;
  private static final SubLObject $const72$TheSetOf;
  private static final SubLSymbol $sym73$COLLECTION_SUBSET_FN_NAUT_P;
  private static final SubLSymbol $sym74$FORMULA_ARG2;
  private static final SubLSymbol $sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS;
  private static final SubLSymbol $sym76$COLLECTION_SUBSET_FN_NART_P;
  private static final SubLSymbol $sym77$NART_EXPAND;
  private static final SubLObject $const78$typeGenls;
  private static final SubLObject $const79$or;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $kw82$EMPTY;
  private static final SubLString $str83$Non_binary_constraint_in_Predicat;
  private static final SubLSymbol $sym84$PREDSTREN_IDENTIFY_PREDICATE;
  private static final SubLList $list85;
  private static final SubLObject $const86$UnderspecifiedPredicate;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$_;
  private static final SubLSymbol $sym89$RELATION_GENERALITY_ESTIMATE;
  private static final SubLList $list90;
  private static final SubLObject $const91$SubLString;
  private static final SubLObject $const92$NegativeInteger;
  private static final SubLObject $const93$NonNegativeInteger;
  private static final SubLObject $const94$RealNumber;
  private static final SubLObject $const95$SubLKeyword;
  private static final SubLObject $const96$SubLListOrAtom;
  private static final SubLObject $const97$SubLList;
  private static final SubLObject $const98$SubLAtom;
  private static final SubLObject $const99$Thing;
  private static final SubLList $list100;
  private static final SubLSymbol $kw101$TYPED;
  private static final SubLSymbol $sym102$PCOND;
  private static final SubLSymbol $sym103$PRED_STRENG_MARKING_MODE;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$CPUSHNEW;
  private static final SubLList $list106;
  private static final SubLList $list107;
  private static final SubLList $list108;
  private static final SubLList $list109;
  private static final SubLList $list110;
  private static final SubLList $list111;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$PUNLESS;
  private static final SubLSymbol $sym114$MEMBER_;
  private static final SubLSymbol $sym115$CSETQ;
  private static final SubLSymbol $sym116$_PS_SUGGESTED_PREDS_;
  private static final SubLSymbol $sym117$SNOC;
  private static final SubLSymbol $sym118$_PS_SUGGESTED_INVERSES_;
  private static final SubLString $str119$Error_in_processing__A__result_co;
  private static final SubLSymbol $sym120$EQUALS_EL_;
  private static final SubLString $str121$_A___not_found_in_expected_result;
  private static final SubLSymbol $sym122$PASSES_PRED_STRENGTHENING_TEST;
  private static final SubLSymbol $kw123$TEST;
  private static final SubLSymbol $kw124$OWNER;
  private static final SubLSymbol $kw125$CLASSES;
  private static final SubLSymbol $kw126$KB;
  private static final SubLSymbol $kw127$FULL;
  private static final SubLSymbol $kw128$WORKING_;
  private static final SubLObject $list129;
  private static final SubLSymbol $sym130$PASSES_NARTY_PRED_STRENGTHENING_TEST;
  private static final SubLList $list131;

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1395L)
  public static SubLObject max_pred_strengs()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $max_pred_strengs$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1461L)
  public static SubLObject skip_pred_strengthening_for_formulaP(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subl_promotions.non_negative_integer_p( $pred_strengthening_max_literal_count$.getDynamicValue( thread ) ) && NIL != list_utilities.lengthG( cycl_utilities.expression_gather( formula,
        $sym1$ATOMIC_SENTENCE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $pred_strengthening_max_literal_count$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 1793L)
  public static SubLObject pred_strengthen_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints)
  {
    if( constraints == UNPROVIDED )
    {
      constraints = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != el_utilities.el_formula_p( formula ) : formula;
    SubLObject new_proposals = NIL;
    if( NIL == skip_pred_strengthening_for_formulaP( formula ) )
    {
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
      final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject _prev_bind_0_$1 = $strengthen_original_pred_awayP$.currentBinding( thread );
          try
          {
            $strengthen_original_pred_awayP$.bind( T, thread );
            final SubLObject proposals = formula_predicate_strengthen_with_constraints( formula, domain_mt, constraints );
            if( NIL != proposals )
            {
              new_proposals = expand_formula_with_stronger_predicates( formula, proposals, domain_mt );
            }
          }
          finally
          {
            $strengthen_original_pred_awayP$.rebind( _prev_bind_0_$1, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
      }
    }
    return new_proposals;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 2750L)
  public static SubLObject typed_pred_strengthen_formula(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints)
  {
    if( constraints == UNPROVIDED )
    {
      constraints = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $pred_strengthener_fn$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $strengthen_original_pred_awayP$.currentBinding( thread );
    try
    {
      $pred_strengthener_fn$.bind( $sym4$STRENGTHEN_PREDICATE_W_TYPED_LINKS_ONLY, thread );
      $strengthen_original_pred_awayP$.bind( T, thread );
      result = pred_strengthen_formula( formula, domain_mt, constraints );
    }
    finally
    {
      $strengthen_original_pred_awayP$.rebind( _prev_bind_2, thread );
      $pred_strengthener_fn$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 3375L)
  public static SubLObject typed_pred_strengthen_formula_unambiguously(final SubLObject formula, final SubLObject domain_mt, SubLObject constraints)
  {
    if( constraints == UNPROVIDED )
    {
      constraints = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $max_pred_strengs$.currentBinding( thread );
    try
    {
      $max_pred_strengs$.bind( ONE_INTEGER, thread );
      result = typed_pred_strengthen_formula( formula, domain_mt, constraints );
    }
    finally
    {
      $max_pred_strengs$.rebind( _prev_bind_0, thread );
    }
    if( NIL == result )
    {
      result = ConsesLow.list( formula );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 3704L)
  public static SubLObject formula_predicate_strengthen(final SubLObject formula, final SubLObject mt)
  {
    final SubLObject el_formula = predstren_expand_formula( formula, UNPROVIDED );
    final SubLObject constraint_sets = predstren_compute_constraints( el_formula, mt );
    final SubLObject predforms = predstren_collect_predicates( el_formula, mt );
    final SubLObject options = predstren_analyze_options( predforms, constraint_sets, mt );
    return options;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 4600L)
  public static SubLObject formula_predicate_strengthen_with_constraints(final SubLObject formula, final SubLObject mt, final SubLObject constraints)
  {
    SubLObject el_formula = predstren_expand_formula( formula, mt );
    SubLObject constraint_sets = NIL;
    SubLObject predforms = NIL;
    SubLObject options = NIL;
    el_formula = narts_high.nart_substitute( el_formula );
    if( NIL != constraints )
    {
      el_formula = predstren_extend_formula_from_constraints( el_formula, constraints );
    }
    constraint_sets = predstren_compute_constraints( el_formula, mt );
    if( NIL != constraints )
    {
      constraint_sets = predstren_extend_constraints_from_table( constraint_sets, constraints );
    }
    predforms = predstren_collect_predicates( el_formula, mt );
    options = predstren_analyze_options( predforms, constraint_sets, mt );
    return options;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 5803L)
  public static SubLObject strengthen_predicate_with_constraints(final SubLObject predicate, final SubLObject alist, final SubLObject mt, SubLObject strengthening_fn)
  {
    if( strengthening_fn == UNPROVIDED )
    {
      strengthening_fn = $pred_strengthener_fn$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( predicate.eql( $const5$isa ) && NIL != $do_not_strengthen_isaP$.getDynamicValue( thread ) )
    {
      return result;
    }
    if( predicate.eql( $const6$is_Underspecified ) )
    {
      result = predstren_handle_is_underspecified( predicate, alist, mt );
    }
    else
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        result = Functions.funcall( strengthening_fn, predicate, alist );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 6364L)
  public static SubLObject gather_subformula_pieces(final SubLObject sub_formula, final SubLObject formula)
  {
    return list_utilities.tree_find( sub_formula, formula, Symbols.symbol_function( EQUALP ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 6499L)
  public static SubLObject expand_formula_with_stronger_predicates(final SubLObject formula, final SubLObject suggestions, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject input_formula = conses_high.copy_tree( formula );
    if( NIL != cycl_utilities.expression_find_if( $sym7$NART_P, input_formula, UNPROVIDED, UNPROVIDED ) )
    {
      input_formula = narts_high.nart_expand( input_formula );
    }
    SubLObject work_stack = ConsesLow.list( input_formula );
    SubLObject runs = ZERO_INTEGER;
    SubLObject cdolist_list_var = suggestions;
    SubLObject suggestion = NIL;
    suggestion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sub_formula = suggestion.first();
      SubLObject cdolist_list_var_$3;
      final SubLObject replacements = cdolist_list_var_$3 = suggestion.rest();
      SubLObject replacement = NIL;
      replacement = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        final SubLObject pred_direction = replacement.first();
        final SubLObject predicates = conses_high.second( replacement );
        SubLObject temp_stack = NIL;
        runs = Numbers.add( runs, ONE_INTEGER );
        SubLObject cdolist_list_var_$4 = work_stack;
        SubLObject formula_$5 = NIL;
        formula_$5 = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          if( NIL != gather_subformula_pieces( sub_formula, formula_$5 ) )
          {
            SubLObject cdolist_list_var_$5 = predicates;
            SubLObject predicate = NIL;
            predicate = cdolist_list_var_$5.first();
            while ( NIL != cdolist_list_var_$5)
            {
              final SubLObject new_formula = predstren_substitute_stronger_predicates( predicate, pred_direction, sub_formula, formula_$5 );
              temp_stack = ConsesLow.cons( new_formula, temp_stack );
              cdolist_list_var_$5 = cdolist_list_var_$5.rest();
              predicate = cdolist_list_var_$5.first();
            }
          }
          else
          {
            SubLObject cdolist_list_var_$6;
            final SubLObject expandable_subformulas = cdolist_list_var_$6 = predstren_get_expandable_subformulas( formula_$5, UNPROVIDED );
            SubLObject expandable_subformula = NIL;
            expandable_subformula = cdolist_list_var_$6.first();
            while ( NIL != cdolist_list_var_$6)
            {
              final SubLObject expanded_subformula = predstren_expand_formula( expandable_subformula, UNPROVIDED );
              SubLObject new_sub_formula = NIL;
              SubLObject new_literal = NIL;
              SubLObject new_formula2 = NIL;
              if( NIL != gather_subformula_pieces( sub_formula, expanded_subformula ) )
              {
                SubLObject cdolist_list_var_$7 = predicates;
                SubLObject predicate2 = NIL;
                predicate2 = cdolist_list_var_$7.first();
                while ( NIL != cdolist_list_var_$7)
                {
                  new_sub_formula = predstren_substitute_stronger_predicates( predicate2, pred_direction, sub_formula, expanded_subformula );
                  new_literal = predstren_contract_formula( new_sub_formula, mt );
                  new_formula2 = cycl_utilities.formula_subst( new_literal, expandable_subformula, formula_$5, Symbols.symbol_function( EQUALP ), UNPROVIDED );
                  temp_stack = ConsesLow.cons( new_formula2, temp_stack );
                  cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                  predicate2 = cdolist_list_var_$7.first();
                }
              }
              cdolist_list_var_$6 = cdolist_list_var_$6.rest();
              expandable_subformula = cdolist_list_var_$6.first();
            }
          }
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          formula_$5 = cdolist_list_var_$4.first();
        }
        if( NIL != temp_stack && NIL != $strengthen_original_pred_awayP$.getDynamicValue( thread ) )
        {
          work_stack = NIL;
        }
        SubLObject cdolist_list_var_$8 = temp_stack;
        SubLObject newbe = NIL;
        newbe = cdolist_list_var_$8.first();
        while ( NIL != cdolist_list_var_$8)
        {
          final SubLObject item_var = newbe;
          if( NIL == conses_high.member( item_var, work_stack, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
          {
            work_stack = ConsesLow.cons( item_var, work_stack );
          }
          cdolist_list_var_$8 = cdolist_list_var_$8.rest();
          newbe = cdolist_list_var_$8.first();
        }
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        replacement = cdolist_list_var_$3.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      suggestion = cdolist_list_var.first();
    }
    SubLObject reformulated = NIL;
    SubLObject cdolist_list_var2 = work_stack;
    SubLObject formula_$6 = NIL;
    formula_$6 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject new_formula3 = predstren_contract_formula( formula_$6, mt );
      if( NIL != new_formula3 )
      {
        final SubLObject item_var2 = new_formula3;
        if( NIL == conses_high.member( item_var2, reformulated, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
        {
          reformulated = ConsesLow.cons( item_var2, reformulated );
        }
      }
      else
      {
        Errors.warn( $str8$PredStren__no_contracted_version_, formula_$6 );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      formula_$6 = cdolist_list_var2.first();
    }
    work_stack = reformulated;
    if( NIL == Numbers.oddp( runs ) )
    {
      work_stack = Sequences.nreverse( work_stack );
    }
    return work_stack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 9443L)
  public static SubLObject predstren_substitute_stronger_predicates(final SubLObject pred, final SubLObject direction, final SubLObject subformula, final SubLObject formula)
  {
    final SubLObject new_args = conses_high.copy_list( cycl_utilities.formula_args( subformula, UNPROVIDED ) );
    final SubLObject ordered_args = direction.eql( $const9$genlInverse ) ? Sequences.nreverse( new_args ) : new_args;
    final SubLObject new_subformula = el_utilities.make_formula( pred, ordered_args, UNPROVIDED );
    SubLObject new_formula = NIL;
    new_formula = cycl_utilities.expression_subst( new_subformula, subformula, formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    return new_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 10040L)
  public static SubLObject predstren_get_rmp_subformulas(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $kw10$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject found = NIL;
    if( mt == $kw10$ANY )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_ANY_MT, thread );
        mt_relevance_macros.$mt$.bind( $const12$InferencePSC, thread );
        found = cycl_utilities.formula_gather( formula, $sym13$PREDSTREN_EXPANDIBLE_RMP_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        found = cycl_utilities.formula_gather( formula, $sym13$PREDSTREN_EXPANDIBLE_RMP_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_5, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_3, thread );
      }
    }
    return found;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 10456L)
  public static SubLObject predstren_get_expandable_subformulas(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $kw10$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject found = NIL;
    if( mt == $kw10$ANY )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_ANY_MT, thread );
        mt_relevance_macros.$mt$.bind( $const12$InferencePSC, thread );
        found = cycl_utilities.formula_gather( formula, $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        found = cycl_utilities.formula_gather( formula, $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_5, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_3, thread );
      }
    }
    return found;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 10811L)
  public static SubLObject predstren_expand_formula_internal(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $kw10$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result;
    final SubLObject el_formula = result = cycl_utilities.hl_to_el( formula );
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw16$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym17$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          if( mt == $kw10$ANY )
          {
            final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_ANY_MT, thread );
              mt_relevance_macros.$mt$.bind( $const12$InferencePSC, thread );
              result = cycl_utilities.expression_transform( el_formula, $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, $sym18$PREDSTREN_EXPAND_ONE_STEP, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$11, thread );
            }
          }
          else
          {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
            final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              result = cycl_utilities.expression_transform( el_formula, $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_, $sym18$PREDSTREN_EXPAND_ONE_STEP, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_4, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$12, thread );
            }
          }
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw16$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return clausifier.standardize_sentence_variables( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 10811L)
  public static SubLObject predstren_expand_formula(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $kw10$ANY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return predstren_expand_formula_internal( formula, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym15$PREDSTREN_EXPAND_FORMULA, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym15$PREDSTREN_EXPAND_FORMULA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym15$PREDSTREN_EXPAND_FORMULA, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( formula, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( formula.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( predstren_expand_formula_internal( formula, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( formula, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 11591L)
  public static SubLObject predstren_expandible_expressionP(final SubLObject formula)
  {
    return makeBoolean( NIL != predstren_expandible_rmpP( formula ) || NIL != predstren_expandible_srfP( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 11744L)
  public static SubLObject predstren_expandible_rmpP(final SubLObject formula)
  {
    return makeBoolean( NIL != fort_types_interface.rule_macro_predicate_p( cycl_utilities.formula_operator( formula ) ) && NIL != fort_types_interface.predicate_p( cycl_utilities.formula_arg1( formula, UNPROVIDED ) )
        && NIL != kb_mapping_utilities.some_pred_value( cycl_utilities.formula_operator( formula ), $const19$expansion, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 11978L)
  public static SubLObject predstren_expandible_srfP(final SubLObject formula)
  {
    return makeBoolean( NIL != kb_accessors.subcollection_relation_function_expression_p( formula ) && NIL != kb_mapping_utilities.some_pred_value( cycl_utilities.nat_functor( formula ), $const19$expansion, UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 12160L)
  public static SubLObject predstren_expand_one_step(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return verbosifier.el_expansion_one_step( formula, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 12476L)
  public static SubLObject reformulator_rules_to_use()
  {
    if( NIL == $reformulator_rules_to_use$.getGlobalValue() )
    {
      initialize_reformulator_rules_to_use();
    }
    return $reformulator_rules_to_use$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 12642L)
  public static SubLObject initialize_reformulator_rules_to_use()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym21$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const22$EverythingPSC, thread );
      SubLObject cdolist_list_var;
      final SubLObject relevant_relations = cdolist_list_var = ConsesLow.append( isa.all_fort_instances( $const23$SubcollectionRelationFunction, UNPROVIDED, UNPROVIDED ), isa.all_fort_instances(
          $const24$RuleMacroPredicate, UNPROVIDED, UNPROVIDED ) );
      SubLObject rel = NIL;
      rel = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject expansion = kb_mapping_utilities.fpred_value_gaf( rel, $const19$expansion, ONE_INTEGER, $kw25$TRUE );
        if( NIL != assertion_handles.assertion_p( expansion ) )
        {
          final SubLObject reformulator_rule = reformulator_datastructures.find_reformulator_rule_for_rule_assertion( expansion );
          if( NIL != reformulator_rule_unifier_datastructures.reformulator_rule_p( reformulator_rule ) )
          {
            $reformulator_rules_to_use$.setGlobalValue( ConsesLow.cons( reformulator_rule, $reformulator_rules_to_use$.getGlobalValue() ) );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        rel = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $reformulator_rules_to_use$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 13658L)
  public static SubLObject reformulator_rules_to_ignore()
  {
    if( NIL == $reformulator_rules_to_ignore$.getGlobalValue() )
    {
      initialize_reformulator_rules_to_ignore();
    }
    return $reformulator_rules_to_ignore$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 13836L)
  public static SubLObject initialize_reformulator_rules_to_ignore()
  {
    SubLObject cdolist_list_var;
    final SubLObject rr_assertion_cycl_mt_pairs = cdolist_list_var = ConsesLow.list( ConsesLow.list( $list27, $const28$IntermediateVocabularyMt ) );
    SubLObject rr_assertion_cycl_mt_pair = NIL;
    rr_assertion_cycl_mt_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = rr_assertion_cycl_mt_pair;
      SubLObject cycl = NIL;
      SubLObject mt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      cycl = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      mt = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject rr_assertion = czer_meta.find_assertion_cycl( cycl, mt );
        if( NIL != assertion_handles.assertion_p( rr_assertion ) )
        {
          $reformulator_rules_to_ignore$.setGlobalValue( ConsesLow.cons( rr_assertion, $reformulator_rules_to_ignore$.getGlobalValue() ) );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      rr_assertion_cycl_mt_pair = cdolist_list_var.first();
    }
    return $reformulator_rules_to_ignore$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 14826L)
  public static SubLObject predstren_contract_formula(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return reformulator_hub.reformulate_cycl( formula, mt, ConsesLow.listS( $kw30$MAX_TIME, new SubLObject[] { $int31$30, $kw32$RECURSION_LIMIT, TEN_INTEGER, $kw33$FOCUS, $const34$ReformulatorRuleUnifier,
      $kw35$REFORMULATOR_RULES, reformulator_rules_to_use(), $kw36$SKIP_ASSERTIONS, reformulator_rules_to_ignore(), $list37
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 16255L)
  public static SubLObject predstren_extend_formula_from_constraints(final SubLObject el_formula, final SubLObject constraints)
  {
    SubLObject new_el_formula = NIL;
    if( NIL != constraints )
    {
      new_el_formula = ConsesLow.cons( el_formula, new_el_formula );
      SubLObject cdolist_list_var = constraints;
      SubLObject constraint = NIL;
      constraint = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = constraint;
        SubLObject v_term = NIL;
        SubLObject isas = NIL;
        SubLObject v_genls = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
        isas = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
        v_genls = current.first();
        current = current.rest();
        if( NIL == current )
        {
          SubLObject cdolist_list_var_$13 = isas;
          SubLObject v_isa = NIL;
          v_isa = cdolist_list_var_$13.first();
          while ( NIL != cdolist_list_var_$13)
          {
            new_el_formula = ConsesLow.cons( ConsesLow.list( $const5$isa, v_term, v_isa ), new_el_formula );
            cdolist_list_var_$13 = cdolist_list_var_$13.rest();
            v_isa = cdolist_list_var_$13.first();
          }
          SubLObject cdolist_list_var_$14 = v_genls;
          SubLObject genl = NIL;
          genl = cdolist_list_var_$14.first();
          while ( NIL != cdolist_list_var_$14)
          {
            new_el_formula = ConsesLow.cons( ConsesLow.list( $const39$genls, v_term, genl ), new_el_formula );
            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
            genl = cdolist_list_var_$14.first();
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        constraint = cdolist_list_var.first();
      }
      new_el_formula = ConsesLow.cons( $const40$and, new_el_formula );
      return new_el_formula;
    }
    return el_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 16805L)
  public static SubLObject predstren_handle_is_underspecified(final SubLObject predicate, final SubLObject alist, final SubLObject mt)
  {
    return predstren_interpret_is( alist, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 17172L)
  public static SubLObject predstren_interpret_is(final SubLObject alist, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1_isas = predstren_crack_alist( alist );
    final SubLObject arg1_genls = thread.secondMultipleValue();
    final SubLObject arg2_isas = thread.thirdMultipleValue();
    final SubLObject arg2_genls = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    SubLObject result = NIL;
    result = predstren_is_means_elementofP( arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt );
    if( NIL == result )
    {
      result = predstren_is_means_isaP( arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt );
    }
    if( NIL == result )
    {
      result = predstren_is_means_equalsP( arg1_isas, arg1_genls, arg2_isas, arg2_genls, mt );
    }
    if( NIL != result )
    {
      result = ConsesLow.list( ConsesLow.list( $const41$genlPreds, ConsesLow.list( result ) ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 17848L)
  public static SubLObject predstren_crack_alist(final SubLObject alist)
  {
    final SubLObject arg1_constraints = conses_high.second( conses_high.assoc( ONE_INTEGER, alist, UNPROVIDED, UNPROVIDED ) );
    final SubLObject arg2_constraints = conses_high.second( conses_high.assoc( TWO_INTEGER, alist, UNPROVIDED, UNPROVIDED ) );
    final SubLObject arg1_isas = conses_high.assoc( $const5$isa, arg1_constraints, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject arg2_isas = conses_high.assoc( $const5$isa, arg2_constraints, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject arg1_genls = conses_high.assoc( $const39$genls, arg1_constraints, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject arg2_genls = conses_high.assoc( $const39$genls, arg2_constraints, UNPROVIDED, UNPROVIDED ).rest();
    return Values.values( arg1_isas, arg1_genls, arg2_isas, arg2_genls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 18315L)
  public static SubLObject predstren_is_means_isaP(final SubLObject arg1_isas, final SubLObject arg1_genls, final SubLObject arg2_isas, final SubLObject arg2_genls, final SubLObject mt)
  {
    if( NIL == arg1_isas || NIL == arg2_genls )
    {
      return NIL;
    }
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = $list42;
      SubLObject v_class = NIL;
      v_class = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        if( NIL != genls.any_specP( v_class, arg1_isas, mt, UNPROVIDED ) && NIL != genls.any_specP( v_class, arg2_genls, mt, UNPROVIDED ) )
        {
          doneP = $const5$isa;
        }
        csome_list_var = csome_list_var.rest();
        v_class = csome_list_var.first();
      }
    }
    return doneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 18813L)
  public static SubLObject predstren_is_means_equalsP(final SubLObject arg1_isas, final SubLObject arg1_genls, final SubLObject arg2_isas, final SubLObject arg2_genls, final SubLObject mt)
  {
    if( NIL == arg1_isas || NIL == arg2_isas )
    {
      return NIL;
    }
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = $list42;
      SubLObject v_class = NIL;
      v_class = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        if( NIL != genls.any_specP( v_class, arg1_isas, mt, UNPROVIDED ) && NIL != genls.any_specP( v_class, arg2_isas, mt, UNPROVIDED ) )
        {
          doneP = $const43$equals;
        }
        csome_list_var = csome_list_var.rest();
        v_class = csome_list_var.first();
      }
    }
    return doneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19263L)
  public static SubLObject predstren_is_means_elementofP(final SubLObject arg1_isas, final SubLObject arg1_genls, final SubLObject arg2_isas, final SubLObject arg2_genls, final SubLObject mt)
  {
    if( NIL != genls.any_specP( $const44$Set_Mathematical, arg2_isas, mt, UNPROVIDED ) )
    {
      return $const45$elementOf;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19569L)
  public static SubLObject predstren_terms_tester(final SubLObject term_a, final SubLObject term_b, final SubLObject mt)
  {
    final SubLObject alist_a = constraint_from_fort_as_alist( term_a, mt );
    final SubLObject alist_b = constraint_from_fort_as_alist( term_b, mt );
    final SubLObject alist = ConsesLow.list( ConsesLow.list( ONE_INTEGER, alist_a ), ConsesLow.list( TWO_INTEGER, alist_b ) );
    return predstren_interpret_is( alist, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLObject constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_constraint( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLObject constraint_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $constraint_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLObject constraint_variable(final SubLObject v_object)
  {
    assert NIL != constraint_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLObject constraint_isa_list(final SubLObject v_object)
  {
    assert NIL != constraint_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLObject constraint_genl_list(final SubLObject v_object)
  {
    assert NIL != constraint_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLObject _csetf_constraint_variable(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != constraint_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLObject _csetf_constraint_isa_list(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != constraint_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLObject _csetf_constraint_genl_list(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != constraint_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLObject make_constraint(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $constraint_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw61$VARIABLE ) )
      {
        _csetf_constraint_variable( v_new, current_value );
      }
      else if( pcase_var.eql( $kw62$ISA_LIST ) )
      {
        _csetf_constraint_isa_list( v_new, current_value );
      }
      else if( pcase_var.eql( $kw63$GENL_LIST ) )
      {
        _csetf_constraint_genl_list( v_new, current_value );
      }
      else
      {
        Errors.error( $str64$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLObject visit_defstruct_constraint(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw65$BEGIN, $sym66$MAKE_CONSTRAINT, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw67$SLOT, $kw61$VARIABLE, constraint_variable( obj ) );
    Functions.funcall( visitor_fn, obj, $kw67$SLOT, $kw62$ISA_LIST, constraint_isa_list( obj ) );
    Functions.funcall( visitor_fn, obj, $kw67$SLOT, $kw63$GENL_LIST, constraint_genl_list( obj ) );
    Functions.funcall( visitor_fn, obj, $kw68$END, $sym66$MAKE_CONSTRAINT, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 19857L)
  public static SubLObject visit_defstruct_object_constraint_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_constraint( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 20024L)
  public static SubLObject new_constraint(final SubLObject variable)
  {
    final SubLObject constraint = make_constraint( UNPROVIDED );
    _csetf_constraint_variable( constraint, variable );
    return constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 20188L)
  public static SubLObject invalid_constraintP(final SubLObject constraint)
  {
    return Types.sublisp_null( constraint_isa_list( constraint ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 20290L)
  public static SubLObject print_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    assert NIL != constraint_p( v_object ) : v_object;
    PrintLow.format( stream, $str70$__Constraint___A_isa___A_genl___A, new SubLObject[] { constraint_variable( v_object ), constraint_isa_list( v_object ), constraint_genl_list( v_object )
    } );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 20590L)
  public static SubLObject constraint_as_alist(final SubLObject constraint)
  {
    final SubLObject isa_list = constraint_isa_list( constraint );
    final SubLObject genl_list = constraint_genl_list( constraint );
    return convert_isa_and_genl_list_to_alist( isa_list, genl_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 20820L)
  public static SubLObject convert_isa_and_genl_list_to_alist(final SubLObject isa_list, final SubLObject genl_list)
  {
    SubLObject isa_list_result = NIL;
    if( NIL != isa_list )
    {
      isa_list_result = ConsesLow.cons( $const5$isa, isa_list );
    }
    if( NIL == genl_list && NIL == isa_list_result )
    {
      return NIL;
    }
    if( NIL == genl_list )
    {
      return ConsesLow.list( isa_list_result );
    }
    return ConsesLow.list( isa_list_result, ConsesLow.cons( $const39$genls, genl_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 21193L)
  public static SubLObject collection_subset_fn_nat_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cycl_grammar.cycl_nat_p( v_object ) && cycl_utilities.nat_functor( v_object ).eql( $const71$CollectionSubsetFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 21337L)
  public static SubLObject collection_subset_fn_nart_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != nart_handles.nart_p( v_object ) && cycl_utilities.nat_functor( v_object ).eql( $const71$CollectionSubsetFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 21477L)
  public static SubLObject collection_subset_fn_naut_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != narts_high.naut_p( v_object ) && cycl_utilities.nat_functor( v_object ).eql( $const71$CollectionSubsetFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 21617L)
  public static SubLObject collection_subset_fn_nat_subset_formula(final SubLObject collection_subset_fn_nat)
  {
    final SubLObject subset = cycl_utilities.nat_arg2( collection_subset_fn_nat, UNPROVIDED );
    if( NIL != el_utilities.el_formula_with_operator_p( subset, $const72$TheSetOf ) )
    {
      return cycl_utilities.nat_arg2( subset, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 21859L)
  public static SubLObject predstren_get_inter_formula_variables_arg_constraints(final SubLObject el_formula, final SubLObject mt)
  {
    final SubLObject arg_constraint_formula = ( NIL != collection_subset_fn_nat_p( el_formula ) ) ? collection_subset_fn_nat_subset_formula( el_formula ) : el_formula;
    SubLObject constraint_formula = at_var_types.inter_formula_variables_arg_constraints( arg_constraint_formula, mt, UNPROVIDED );
    final SubLObject collection_subset_fn_naut_subformulas = cycl_utilities.expression_gather( el_formula, $sym73$COLLECTION_SUBSET_FN_NAUT_P, T, Symbols.symbol_function( EQUAL ), $sym74$FORMULA_ARG2, UNPROVIDED );
    final SubLObject new_formula = predstren_expand_collection_subset_fn_narts( el_formula );
    SubLObject additional_constraints = NIL;
    if( !el_formula.equal( new_formula ) )
    {
      constraint_formula = el_utilities.make_conjunction( ConsesLow.list( constraint_formula, at_var_types.inter_formula_variables_arg_constraints( new_formula, mt, UNPROVIDED ) ) );
    }
    SubLObject cdolist_list_var = collection_subset_fn_naut_subformulas;
    SubLObject subformula = NIL;
    subformula = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred = cycl_utilities.formula_operator( subformula );
      final SubLObject arg1 = cycl_utilities.formula_arg1( subformula, UNPROVIDED );
      final SubLObject arg2 = cycl_utilities.formula_arg2( subformula, UNPROVIDED );
      if( NIL != cycl_variables.el_varP( arg1 ) && pred.eql( $const5$isa ) )
      {
        SubLObject cdolist_list_var_$15;
        final SubLObject v_genls = cdolist_list_var_$15 = genls.min_genls( arg2, mt, UNPROVIDED );
        SubLObject genl = NIL;
        genl = cdolist_list_var_$15.first();
        while ( NIL != cdolist_list_var_$15)
        {
          additional_constraints = ConsesLow.cons( el_utilities.make_binary_formula( $const5$isa, arg1, genl ), additional_constraints );
          cdolist_list_var_$15 = cdolist_list_var_$15.rest();
          genl = cdolist_list_var_$15.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      subformula = cdolist_list_var.first();
    }
    if( NIL != additional_constraints )
    {
      constraint_formula = el_utilities.make_conjunction( ConsesLow.cons( constraint_formula, additional_constraints ) );
    }
    return constraint_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 23595L)
  public static SubLObject predstren_expand_collection_subset_fn_narts_internal(final SubLObject formula)
  {
    return cycl_utilities.expression_transform( formula, $sym76$COLLECTION_SUBSET_FN_NART_P, $sym77$NART_EXPAND, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 23595L)
  public static SubLObject predstren_expand_collection_subset_fn_narts(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return predstren_expand_collection_subset_fn_narts_internal( formula );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, formula, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( predstren_expand_collection_subset_fn_narts_internal( formula ) ) );
      memoization_state.caching_state_put( caching_state, formula, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 23786L)
  public static SubLObject predstren_compute_constraints(final SubLObject el_formula, final SubLObject mt)
  {
    SubLObject constraints = predstren_get_inter_formula_variables_arg_constraints( el_formula, mt );
    SubLObject result = NIL;
    if( NIL == constraints )
    {
      return NIL;
    }
    constraints = ConsesLow.append( constraints, predstren_get_typegenl_constraints( constraints ) );
    SubLObject cdolist_list_var = predstren_normalize_constraints( constraints );
    SubLObject v_set = NIL;
    v_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_constraint = predstren_restructure_constraints( v_set );
      if( NIL != new_constraint )
      {
        result = ConsesLow.cons( new_constraint, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_set = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 24413L)
  public static SubLObject predstren_get_typegenl_constraints(final SubLObject constraints)
  {
    if( !cycl_utilities.formula_operator( constraints ).eql( $const40$and ) )
    {
      return NIL;
    }
    final SubLObject constraint_list = cycl_utilities.formula_args( constraints, UNPROVIDED );
    SubLObject genls_constraints = NIL;
    SubLObject cdolist_list_var = constraint_list;
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $const5$isa.eql( cycl_utilities.formula_operator( constraint ) ) )
      {
        final SubLObject var = cycl_utilities.formula_arg1( constraint, UNPROVIDED );
        final SubLObject col = cycl_utilities.formula_arg2( constraint, UNPROVIDED );
        SubLObject isa_cols = genls.genls( col, UNPROVIDED, UNPROVIDED );
        SubLObject cdolist_list_var_$16;
        isa_cols = ( cdolist_list_var_$16 = ConsesLow.cons( col, isa_cols ) );
        SubLObject isa_col = NIL;
        isa_col = cdolist_list_var_$16.first();
        while ( NIL != cdolist_list_var_$16)
        {
          final SubLObject type_genls = kb_mapping_utilities.pred_values( isa_col, $const78$typeGenls, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL != type_genls )
          {
            SubLObject cdolist_list_var_$17 = type_genls;
            SubLObject type_genl = NIL;
            type_genl = cdolist_list_var_$17.first();
            while ( NIL != cdolist_list_var_$17)
            {
              final SubLObject item_var = ConsesLow.list( $const39$genls, var, type_genl );
              if( NIL == conses_high.member( item_var, genls_constraints, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                genls_constraints = ConsesLow.cons( item_var, genls_constraints );
              }
              cdolist_list_var_$17 = cdolist_list_var_$17.rest();
              type_genl = cdolist_list_var_$17.first();
            }
          }
          cdolist_list_var_$16 = cdolist_list_var_$16.rest();
          isa_col = cdolist_list_var_$16.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    return genls_constraints;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 25166L)
  public static SubLObject predstren_normalize_constraints(SubLObject constraints)
  {
    if( $const79$or.eql( constraints.first() ) )
    {
      constraints = constraints.rest();
    }
    if( !constraints.first().isList() )
    {
      constraints = ConsesLow.list( constraints );
    }
    if( !$const40$and.eql( constraints.first().first() ) )
    {
      constraints = ConsesLow.list( constraints );
    }
    return constraints;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 25644L)
  public static SubLObject predstren_restructure_constraints(final SubLObject v_set)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject seen = dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED );
    SubLObject constraints = NIL;
    SubLObject result = NIL;
    predstren_cache_constraints( v_set, seen );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( seen ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject value = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != invalid_constraintP( value ) )
      {
        result = T;
      }
      else
      {
        constraints = ConsesLow.cons( value, constraints );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return ( NIL != result ) ? NIL : constraints;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 26092L)
  public static SubLObject predstren_cache_constraints(final SubLObject v_set, final SubLObject seen)
  {
    SubLObject cdolist_list_var = v_set;
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !constraint.eql( $const40$and ) )
      {
        if( constraint.isList() && constraint.first().eql( $const40$and ) )
        {
          predstren_cache_constraints( constraint.rest(), seen );
        }
        else if( NIL != el_utilities.el_formula_p( constraint ) && NIL != el_utilities.formula_arityE( constraint, TWO_INTEGER, UNPROVIDED ) )
        {
          SubLObject current;
          final SubLObject datum = current = constraint;
          SubLObject functor = NIL;
          SubLObject var = NIL;
          SubLObject v_term = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
          functor = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
          var = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
          v_term = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL != subl_promotions.memberP( v_term, $list81, UNPROVIDED, UNPROVIDED ) )
            {
              predstren_extend_constraint_cache( seen, functor, var, $kw82$EMPTY );
            }
            else
            {
              predstren_extend_constraint_cache( seen, functor, var, v_term );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list80 );
          }
        }
        else
        {
          Errors.warn( $str83$Non_binary_constraint_in_Predicat, constraint );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    return seen;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 26771L)
  public static SubLObject predstren_extend_constraint_cache(final SubLObject v_cache, final SubLObject functor, final SubLObject var, final SubLObject constraint)
  {
    SubLObject old = dictionary.dictionary_lookup( v_cache, var, NIL );
    if( NIL == old )
    {
      old = new_constraint( var );
    }
    if( !constraint.eql( $kw82$EMPTY ) )
    {
      if( functor.eql( $const39$genls ) )
      {
        SubLObject genl_list = constraint_genl_list( old );
        if( NIL == conses_high.member( constraint, genl_list, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          genl_list = ConsesLow.cons( constraint, genl_list );
        }
        _csetf_constraint_genl_list( old, genl_list );
      }
      else if( functor.eql( $const5$isa ) )
      {
        SubLObject isa_list = constraint_isa_list( old );
        if( NIL == conses_high.member( constraint, isa_list, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          isa_list = ConsesLow.cons( constraint, isa_list );
        }
        _csetf_constraint_isa_list( old, isa_list );
      }
    }
    dictionary.dictionary_enter( v_cache, var, old );
    return v_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 27449L)
  public static SubLObject predstren_collect_predicates(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject el_formula = predstren_expand_collection_subset_fn_narts( formula );
    SubLObject occurrences = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      occurrences = list_utilities.tree_find_all_nested_if( $sym84$PREDSTREN_IDENTIFY_PREDICATE, el_formula, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return occurrences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 27909L)
  public static SubLObject predstren_identify_predicate(final SubLObject item)
  {
    if( NIL == el_utilities.el_formula_p( item ) )
    {
      return NIL;
    }
    final SubLObject functor = cycl_utilities.formula_operator( item );
    return makeBoolean( NIL != fort_types_interface.predicateP( functor ) && NIL == subl_promotions.memberP( functor, $predstren_common_uninteresting$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && ( NIL != isa.isaP(
        functor, $const86$UnderspecifiedPredicate, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.some_spec_pred_or_inverseP( functor, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 28286L)
  public static SubLObject predstren_analyze_options(final SubLObject predforms, SubLObject constraints, final SubLObject mt)
  {
    SubLObject replacements = NIL;
    if( NIL == constraints )
    {
      constraints = ConsesLow.list( NIL );
    }
    SubLObject cdolist_list_var = predforms;
    SubLObject predform = NIL;
    predform = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject result = predstren_analyze_one_option( predform, constraints, mt );
      if( NIL != result )
      {
        replacements = ConsesLow.cons( narts_high.nart_expand( ConsesLow.cons( predform, result ) ), replacements );
      }
      cdolist_list_var = cdolist_list_var.rest();
      predform = cdolist_list_var.first();
    }
    return replacements;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 28842L)
  public static SubLObject predstren_analyze_one_option(final SubLObject predform, final SubLObject constraint_sets, final SubLObject mt)
  {
    SubLObject results = NIL;
    final SubLObject predicate = cycl_utilities.formula_operator( predform );
    final SubLObject v_arguments = cycl_utilities.formula_args( predform, UNPROVIDED );
    SubLObject cdolist_list_var = constraint_sets;
    SubLObject constraint_set = NIL;
    constraint_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject alist = NIL;
      SubLObject preds = NIL;
      SubLObject list_var = NIL;
      SubLObject arg = NIL;
      SubLObject arg_index = NIL;
      list_var = v_arguments;
      arg = list_var.first();
      for( arg_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), arg_index = Numbers.add( ONE_INTEGER, arg_index ) )
      {
        SubLObject arg_desc = NIL;
        if( NIL != subl_promotions.memberP( arg, constraint_set, Symbols.symbol_function( EQUALP ), $sym55$CONSTRAINT_VARIABLE ) )
        {
          final SubLObject constraint = Sequences.find( arg, constraint_set, Symbols.symbol_function( EQUALP ), $sym55$CONSTRAINT_VARIABLE, UNPROVIDED, UNPROVIDED );
          arg_desc = constraint_as_alist( constraint );
        }
        else if( NIL != forts.fort_p( arg ) )
        {
          arg_desc = constraint_from_fort_as_alist( arg, mt );
        }
        else if( arg.isList() )
        {
          arg_desc = constraint_from_listy_as_alist( arg, mt );
        }
        else
        {
          arg_desc = constraint_from_object_as_alist( arg, mt );
        }
        alist = ConsesLow.cons( ConsesLow.list( Numbers.add( arg_index, ONE_INTEGER ), arg_desc ), alist );
      }
      SubLObject cdolist_list_var_$18;
      preds = ( cdolist_list_var_$18 = strengthen_predicate_with_constraints( predicate, alist, mt, UNPROVIDED ) );
      SubLObject result_set = NIL;
      result_set = cdolist_list_var_$18.first();
      while ( NIL != cdolist_list_var_$18)
      {
        SubLObject current;
        final SubLObject datum = current = result_set;
        SubLObject how = NIL;
        SubLObject predicates = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
        how = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
        predicates = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject sorted = predstren_sort_by_arg_specs( predicates, mt );
          results = ConsesLow.cons( ConsesLow.list( how, sorted ), results );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list87 );
        }
        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
        result_set = cdolist_list_var_$18.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint_set = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 30177L)
  public static SubLObject predstren_sort_by_arg_specs(final SubLObject predicates, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      results = Sort.sort( predicates, $sym88$_, $sym89$RELATION_GENERALITY_ESTIMATE );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 30401L)
  public static SubLObject constraint_from_fort_as_alist(final SubLObject fort, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject isa_list = isa.min_isa( fort, UNPROVIDED, UNPROVIDED );
      final SubLObject genl_list = genls.min_genls( fort, UNPROVIDED, UNPROVIDED );
      result = convert_isa_and_genl_list_to_alist( isa_list, genl_list );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 30815L)
  public static SubLObject constraint_from_listy_as_alist(final SubLObject listy, final SubLObject mt)
  {
    final SubLObject functor = cycl_utilities.formula_arg0( listy );
    SubLObject isa_list = NIL;
    SubLObject genl_list = NIL;
    if( NIL != fort_types_interface.functionP( functor ) )
    {
      isa_list = isa.min_isa( listy, mt, UNPROVIDED );
      genl_list = genls.min_genls( listy, mt, UNPROVIDED );
    }
    else if( NIL != forts.fort_p( functor ) )
    {
      isa_list = $list90;
      genl_list = NIL;
    }
    else
    {
      isa_list = min_isa_via_deffns( listy, mt );
      genl_list = NIL;
    }
    return convert_isa_and_genl_list_to_alist( isa_list, genl_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 31521L)
  public static SubLObject constraint_from_object_as_alist(final SubLObject v_object, final SubLObject mt)
  {
    final SubLObject isa_list = min_isa_via_deffns( v_object, mt );
    final SubLObject genl_list = NIL;
    return convert_isa_and_genl_list_to_alist( isa_list, genl_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 31729L)
  public static SubLObject min_isa_via_deffns(final SubLObject v_object, final SubLObject mt)
  {
    if( v_object.isString() )
    {
      return ConsesLow.list( $const91$SubLString );
    }
    if( v_object.isInteger() )
    {
      return ConsesLow.list( v_object.isNegative() ? $const92$NegativeInteger : $const93$NonNegativeInteger );
    }
    if( v_object.isDouble() )
    {
      return ConsesLow.list( $const94$RealNumber );
    }
    if( v_object.isKeyword() )
    {
      return ConsesLow.list( $const95$SubLKeyword );
    }
    if( NIL == v_object )
    {
      return ConsesLow.list( $const96$SubLListOrAtom );
    }
    if( v_object.isList() )
    {
      return ConsesLow.list( $const97$SubLList );
    }
    if( v_object.isAtom() )
    {
      return ConsesLow.list( $const98$SubLAtom );
    }
    return ConsesLow.list( $const99$Thing );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 32478L)
  public static SubLObject predstren_extend_constraints_from_table(final SubLObject constraint_sets, final SubLObject constraints)
  {
    if( NIL == constraint_sets )
    {
      return ConsesLow.list( predstren_augment_one_constraint_set( NIL, constraints ) );
    }
    SubLObject new_constraint_sets = NIL;
    SubLObject cdolist_list_var = constraint_sets;
    SubLObject constraint_set = NIL;
    constraint_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_constraint_set = predstren_augment_one_constraint_set( constraint_set, constraints );
      new_constraint_sets = ConsesLow.cons( new_constraint_set, new_constraint_sets );
      cdolist_list_var = cdolist_list_var.rest();
      constraint_set = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_constraint_sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 33217L)
  public static SubLObject predstren_augment_one_constraint_set(final SubLObject constraint_set, final SubLObject constraints)
  {
    SubLObject new_constraint_set = NIL;
    SubLObject cdolist_list_var = constraints;
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_term = constraint.first();
      final SubLObject isas = conses_high.second( constraint );
      final SubLObject v_genls = conses_high.third( constraint );
      final SubLObject existing = Sequences.find( v_term, constraint_set, EQL, $sym55$CONSTRAINT_VARIABLE, UNPROVIDED, UNPROVIDED );
      if( NIL != existing )
      {
        SubLObject old_isas = constraint_isa_list( existing );
        SubLObject old_genls = constraint_genl_list( existing );
        SubLObject cdolist_list_var_$19 = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var_$19.first();
        while ( NIL != cdolist_list_var_$19)
        {
          final SubLObject item_var = v_isa;
          if( NIL == conses_high.member( item_var, old_isas, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            old_isas = ConsesLow.cons( item_var, old_isas );
          }
          cdolist_list_var_$19 = cdolist_list_var_$19.rest();
          v_isa = cdolist_list_var_$19.first();
        }
        SubLObject cdolist_list_var_$20 = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var_$20.first();
        while ( NIL != cdolist_list_var_$20)
        {
          final SubLObject item_var = genl;
          if( NIL == conses_high.member( item_var, old_genls, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            old_genls = ConsesLow.cons( item_var, old_genls );
          }
          cdolist_list_var_$20 = cdolist_list_var_$20.rest();
          genl = cdolist_list_var_$20.first();
        }
        _csetf_constraint_isa_list( existing, old_isas );
        _csetf_constraint_genl_list( existing, old_genls );
      }
      else
      {
        final SubLObject new_one = new_constraint( v_term );
        _csetf_constraint_isa_list( new_one, isas );
        _csetf_constraint_genl_list( new_one, v_genls );
        new_constraint_set = ConsesLow.cons( new_one, new_constraint_set );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    return ConsesLow.append( new_constraint_set, constraint_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 34320L)
  public static SubLObject strengthen_predicate_wXnew_pred_strengthener(final SubLObject pred, final SubLObject alist)
  {
    return strengthen_predicate_wXtyped_and_minimal_suggestions( pred, alist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 35335L)
  public static SubLObject push_pred_wXmarkingXtype(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject pred = NIL;
    SubLObject marking = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    marking = current.first();
    current = current.rest();
    final SubLObject pred_type = current.isCons() ? current.first() : $kw101$TYPED;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list100 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list100 );
      return NIL;
    }
    if( pred_type == $kw101$TYPED )
    {
      return ConsesLow.list( $sym102$PCOND, ConsesLow.list( ConsesLow.listS( EQ, ConsesLow.list( $sym103$PRED_STRENG_MARKING_MODE, marking ), $list104 ), ConsesLow.listS( $sym105$CPUSHNEW, pred, $list106 ) ), ConsesLow
          .list( ConsesLow.listS( EQ, ConsesLow.list( $sym103$PRED_STRENG_MARKING_MODE, marking ), $list107 ), ConsesLow.listS( $sym105$CPUSHNEW, pred, $list108 ) ), ConsesLow.list( ConsesLow.listS( EQ, ConsesLow.list(
              $sym103$PRED_STRENG_MARKING_MODE, marking ), $list109 ), ConsesLow.listS( $sym105$CPUSHNEW, pred, $list106 ), ConsesLow.listS( $sym105$CPUSHNEW, pred, $list108 ) ) );
    }
    return ConsesLow.list( $sym102$PCOND, ConsesLow.list( ConsesLow.listS( EQ, ConsesLow.list( $sym103$PRED_STRENG_MARKING_MODE, marking ), $list104 ), ConsesLow.listS( $sym105$CPUSHNEW, pred, $list110 ) ), ConsesLow
        .list( ConsesLow.listS( EQ, ConsesLow.list( $sym103$PRED_STRENG_MARKING_MODE, marking ), $list107 ), ConsesLow.listS( $sym105$CPUSHNEW, pred, $list111 ) ), ConsesLow.list( ConsesLow.listS( EQ, ConsesLow.list(
            $sym103$PRED_STRENG_MARKING_MODE, marking ), $list109 ), ConsesLow.listS( $sym105$CPUSHNEW, pred, $list110 ), ConsesLow.listS( $sym105$CPUSHNEW, pred, $list111 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 36331L)
  public static SubLObject append_pred_wXmarking(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject pred = NIL;
    SubLObject marking = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
    marking = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym102$PCOND, ConsesLow.list( ConsesLow.listS( EQ, ConsesLow.list( $sym103$PRED_STRENG_MARKING_MODE, marking ), $list104 ), ConsesLow.list( $sym113$PUNLESS, ConsesLow.listS( $sym114$MEMBER_,
          pred, $list110 ), ConsesLow.list( $sym115$CSETQ, $sym116$_PS_SUGGESTED_PREDS_, ConsesLow.listS( $sym117$SNOC, pred, $list110 ) ) ) ), ConsesLow.list( ConsesLow.listS( EQ, ConsesLow.list(
              $sym103$PRED_STRENG_MARKING_MODE, marking ), $list107 ), ConsesLow.list( $sym113$PUNLESS, ConsesLow.listS( $sym114$MEMBER_, pred, $list111 ), ConsesLow.list( $sym115$CSETQ, $sym118$_PS_SUGGESTED_INVERSES_,
                  ConsesLow.listS( $sym117$SNOC, pred, $list111 ) ) ) ), ConsesLow.list( ConsesLow.listS( EQ, ConsesLow.list( $sym103$PRED_STRENG_MARKING_MODE, marking ), $list109 ), ConsesLow.list( $sym113$PUNLESS,
                      ConsesLow.listS( $sym114$MEMBER_, pred, $list111 ), ConsesLow.list( $sym115$CSETQ, $sym118$_PS_SUGGESTED_INVERSES_, ConsesLow.listS( $sym117$SNOC, pred, $list111 ) ) ), ConsesLow.list(
                          $sym113$PUNLESS, ConsesLow.listS( $sym114$MEMBER_, pred, $list110 ), ConsesLow.list( $sym115$CSETQ, $sym116$_PS_SUGGESTED_PREDS_, ConsesLow.listS( $sym117$SNOC, pred, $list110 ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list112 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 37156L)
  public static SubLObject strengthen_predicate_wXtyped_and_minimal_suggestions(final SubLObject predicate, final SubLObject alist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject max_suggested_links = NIL;
    final SubLObject _prev_bind_0 = $ps_typed_preds$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $ps_typed_inverses$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $ps_suggested_inverses$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $ps_suggested_preds$.currentBinding( thread );
    try
    {
      $ps_typed_preds$.bind( NIL, thread );
      $ps_typed_inverses$.bind( NIL, thread );
      $ps_suggested_inverses$.bind( NIL, thread );
      $ps_suggested_preds$.bind( NIL, thread );
      final SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds( predicate, alist, UNPROVIDED );
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( new_streng_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject marking = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( !pred.eql( predicate ) )
        {
          if( predicate_strengthener_internals.pred_streng_marking_suggested_count( marking ).eql( ZERO_INTEGER ) )
          {
            if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue() ) )
            {
              final SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_typed_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_typed_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_preds$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue() ) )
            {
              final SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_typed_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_typed_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_inverses$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue() ) )
            {
              SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_typed_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_typed_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_preds$.getDynamicValue( thread ) ), thread );
              }
              item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_typed_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_typed_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_inverses$.getDynamicValue( thread ) ), thread );
              }
            }
          }
          else if( NIL == max_suggested_links || predicate_strengthener_internals.pred_streng_marking_suggested_count( marking ).numL( max_suggested_links ) )
          {
            $ps_suggested_inverses$.setDynamicValue( NIL, thread );
            $ps_suggested_preds$.setDynamicValue( NIL, thread );
            max_suggested_links = predicate_strengthener_internals.pred_streng_marking_suggested_count( marking );
            if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue() ) )
            {
              final SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_preds$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue() ) )
            {
              final SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_inverses$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue() ) )
            {
              SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_preds$.getDynamicValue( thread ) ), thread );
              }
              item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_inverses$.getDynamicValue( thread ) ), thread );
              }
            }
          }
          else if( !predicate_strengthener_internals.pred_streng_marking_suggested_count( marking ).numG( max_suggested_links ) )
          {
            if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue() ) )
            {
              final SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_preds$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue() ) )
            {
              final SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_inverses$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue() ) )
            {
              SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_preds$.getDynamicValue( thread ) ), thread );
              }
              item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_inverses$.getDynamicValue( thread ) ), thread );
              }
            }
          }
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      if( NIL != $ps_typed_inverses$.getDynamicValue( thread ) || NIL != $ps_suggested_inverses$.getDynamicValue( thread ) )
      {
        result = ConsesLow.cons( ConsesLow.list( $const9$genlInverse, Sequences.cconcatenate( $ps_typed_inverses$.getDynamicValue( thread ), $ps_suggested_inverses$.getDynamicValue( thread ) ) ), result );
      }
      if( NIL != $ps_typed_preds$.getDynamicValue( thread ) || NIL != $ps_suggested_preds$.getDynamicValue( thread ) )
      {
        result = ConsesLow.cons( ConsesLow.list( $const41$genlPreds, Sequences.cconcatenate( $ps_typed_preds$.getDynamicValue( thread ), $ps_suggested_preds$.getDynamicValue( thread ) ) ), result );
      }
    }
    finally
    {
      $ps_suggested_preds$.rebind( _prev_bind_4, thread );
      $ps_suggested_inverses$.rebind( _prev_bind_3, thread );
      $ps_typed_inverses$.rebind( _prev_bind_2, thread );
      $ps_typed_preds$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 39027L)
  public static SubLObject strengthen_predicate_wXtyped_and_all_suggestions(final SubLObject predicate, final SubLObject alist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject max_suggested_links = NIL;
    final SubLObject _prev_bind_0 = $ps_typed_preds$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $ps_typed_inverses$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $ps_suggested_inverses$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $ps_suggested_preds$.currentBinding( thread );
    try
    {
      $ps_typed_preds$.bind( NIL, thread );
      $ps_typed_inverses$.bind( NIL, thread );
      $ps_suggested_inverses$.bind( NIL, thread );
      $ps_suggested_preds$.bind( NIL, thread );
      final SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds( predicate, alist, UNPROVIDED );
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( new_streng_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject marking = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( !pred.eql( predicate ) )
        {
          if( predicate_strengthener_internals.pred_streng_marking_suggested_count( marking ).eql( ZERO_INTEGER ) )
          {
            if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue() ) )
            {
              final SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_typed_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_typed_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_preds$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue() ) )
            {
              final SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_typed_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_typed_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_inverses$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue() ) )
            {
              SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_typed_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_typed_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_preds$.getDynamicValue( thread ) ), thread );
              }
              item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_typed_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_typed_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_inverses$.getDynamicValue( thread ) ), thread );
              }
            }
          }
          else if( NIL == max_suggested_links || predicate_strengthener_internals.pred_streng_marking_suggested_count( marking ).numL( max_suggested_links ) )
          {
            max_suggested_links = predicate_strengthener_internals.pred_streng_marking_suggested_count( marking );
            if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue() ) )
            {
              final SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_preds$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue() ) )
            {
              final SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_inverses$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue() ) )
            {
              SubLObject item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_preds$.getDynamicValue( thread ) ), thread );
              }
              item_var = pred;
              if( NIL == conses_high.member( item_var, $ps_suggested_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                $ps_suggested_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_inverses$.getDynamicValue( thread ) ), thread );
              }
            }
          }
          else if( predicate_strengthener_internals.pred_streng_marking_suggested_count( marking ).numG( max_suggested_links ) )
          {
            if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue() ) )
            {
              if( NIL == subl_promotions.memberP( pred, $ps_suggested_preds$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
              {
                $ps_suggested_preds$.setDynamicValue( list_utilities.snoc( pred, $ps_suggested_preds$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue() ) )
            {
              if( NIL == subl_promotions.memberP( pred, $ps_suggested_inverses$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
              {
                $ps_suggested_inverses$.setDynamicValue( list_utilities.snoc( pred, $ps_suggested_inverses$.getDynamicValue( thread ) ), thread );
              }
            }
            else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue() ) )
            {
              if( NIL == subl_promotions.memberP( pred, $ps_suggested_inverses$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
              {
                $ps_suggested_inverses$.setDynamicValue( list_utilities.snoc( pred, $ps_suggested_inverses$.getDynamicValue( thread ) ), thread );
              }
              if( NIL == subl_promotions.memberP( pred, $ps_suggested_preds$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
              {
                $ps_suggested_preds$.setDynamicValue( list_utilities.snoc( pred, $ps_suggested_preds$.getDynamicValue( thread ) ), thread );
              }
            }
          }
          else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue() ) )
          {
            final SubLObject item_var = pred;
            if( NIL == conses_high.member( item_var, $ps_suggested_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              $ps_suggested_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_preds$.getDynamicValue( thread ) ), thread );
            }
          }
          else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue() ) )
          {
            final SubLObject item_var = pred;
            if( NIL == conses_high.member( item_var, $ps_suggested_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              $ps_suggested_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_inverses$.getDynamicValue( thread ) ), thread );
            }
          }
          else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue() ) )
          {
            SubLObject item_var = pred;
            if( NIL == conses_high.member( item_var, $ps_suggested_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              $ps_suggested_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_preds$.getDynamicValue( thread ) ), thread );
            }
            item_var = pred;
            if( NIL == conses_high.member( item_var, $ps_suggested_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              $ps_suggested_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_suggested_inverses$.getDynamicValue( thread ) ), thread );
            }
          }
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      if( NIL != $ps_typed_inverses$.getDynamicValue( thread ) || NIL != $ps_suggested_inverses$.getDynamicValue( thread ) )
      {
        result = ConsesLow.cons( ConsesLow.list( $const9$genlInverse, Sequences.cconcatenate( $ps_typed_inverses$.getDynamicValue( thread ), $ps_suggested_inverses$.getDynamicValue( thread ) ) ), result );
      }
      if( NIL != $ps_typed_preds$.getDynamicValue( thread ) || NIL != $ps_suggested_preds$.getDynamicValue( thread ) )
      {
        result = ConsesLow.cons( ConsesLow.list( $const41$genlPreds, Sequences.cconcatenate( $ps_typed_preds$.getDynamicValue( thread ), $ps_suggested_preds$.getDynamicValue( thread ) ) ), result );
      }
    }
    finally
    {
      $ps_suggested_preds$.rebind( _prev_bind_4, thread );
      $ps_suggested_inverses$.rebind( _prev_bind_3, thread );
      $ps_typed_inverses$.rebind( _prev_bind_2, thread );
      $ps_typed_preds$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 40834L)
  public static SubLObject strengthen_predicate_wXtyped_links_only(final SubLObject predicate, final SubLObject alist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject new_streng_dict = predicate_strengthener_internals.strengthened_preds( predicate, alist, NIL );
    final SubLObject _prev_bind_0 = $ps_typed_inverses$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $ps_typed_preds$.currentBinding( thread );
    try
    {
      $ps_typed_inverses$.bind( NIL, thread );
      $ps_typed_preds$.bind( NIL, thread );
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( new_streng_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject marking = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( !pred.eql( predicate ) && predicate_strengthener_internals.pred_streng_marking_suggested_count( marking ).eql( ZERO_INTEGER ) )
        {
          if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue() ) )
          {
            final SubLObject item_var = pred;
            if( NIL == conses_high.member( item_var, $ps_typed_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              $ps_typed_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_preds$.getDynamicValue( thread ) ), thread );
            }
          }
          else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue() ) )
          {
            final SubLObject item_var = pred;
            if( NIL == conses_high.member( item_var, $ps_typed_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              $ps_typed_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_inverses$.getDynamicValue( thread ) ), thread );
            }
          }
          else if( predicate_strengthener_internals.pred_streng_marking_mode( marking ).eql( sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue() ) )
          {
            SubLObject item_var = pred;
            if( NIL == conses_high.member( item_var, $ps_typed_preds$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              $ps_typed_preds$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_preds$.getDynamicValue( thread ) ), thread );
            }
            item_var = pred;
            if( NIL == conses_high.member( item_var, $ps_typed_inverses$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              $ps_typed_inverses$.setDynamicValue( ConsesLow.cons( item_var, $ps_typed_inverses$.getDynamicValue( thread ) ), thread );
            }
          }
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      if( NIL != $ps_typed_inverses$.getDynamicValue( thread ) )
      {
        result = ConsesLow.cons( ConsesLow.list( $const9$genlInverse, $ps_typed_inverses$.getDynamicValue( thread ) ), result );
      }
      if( NIL != $ps_typed_preds$.getDynamicValue( thread ) )
      {
        result = ConsesLow.cons( ConsesLow.list( $const41$genlPreds, $ps_typed_preds$.getDynamicValue( thread ) ), result );
      }
    }
    finally
    {
      $ps_typed_preds$.rebind( _prev_bind_2, thread );
      $ps_typed_inverses$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 41801L)
  public static SubLObject passes_pred_strengthening_test(final SubLObject in_form, final SubLObject mt, final SubLObject out_forms)
  {
    final SubLObject strengthened_formulas = pred_strengthen_formula( in_form, mt, UNPROVIDED );
    if( NIL == list_utilities.lengthE( strengthened_formulas, Sequences.length( out_forms ), UNPROVIDED ) )
    {
      return PrintLow.format( NIL, $str119$Error_in_processing__A__result_co, new SubLObject[] { in_form, strengthened_formulas, out_forms
      } );
    }
    SubLObject cdolist_list_var = strengthened_formulas;
    SubLObject strengthened_formula = NIL;
    strengthened_formula = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( strengthened_formula, out_forms, $sym120$EQUALS_EL_, UNPROVIDED ) )
      {
        return PrintLow.format( NIL, $str121$_A___not_found_in_expected_result, strengthened_formula, in_form );
      }
      cdolist_list_var = cdolist_list_var.rest();
      strengthened_formula = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/predicate-strengthener.lisp", position = 41801L)
  public static SubLObject passes_narty_pred_strengthening_test(final SubLObject in_form, final SubLObject mt, final SubLObject out_forms)
  {
    final SubLObject strengthened_formulas = pred_strengthen_formula( narts_high.nart_substitute( in_form ), mt, UNPROVIDED );
    if( NIL == list_utilities.lengthE( strengthened_formulas, Sequences.length( out_forms ), UNPROVIDED ) )
    {
      return PrintLow.format( NIL, $str119$Error_in_processing__A__result_co, new SubLObject[] { in_form, strengthened_formulas, out_forms
      } );
    }
    SubLObject cdolist_list_var = strengthened_formulas;
    SubLObject strengthened_formula = NIL;
    strengthened_formula = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( strengthened_formula, out_forms, $sym120$EQUALS_EL_, UNPROVIDED ) )
      {
        return PrintLow.format( NIL, $str121$_A___not_found_in_expected_result, strengthened_formula, in_form );
      }
      cdolist_list_var = cdolist_list_var.rest();
      strengthened_formula = cdolist_list_var.first();
    }
    return T;
  }

  public static SubLObject declare_predicate_strengthener_file()
  {
    SubLFiles.declareFunction( me, "max_pred_strengs", "MAX-PRED-STRENGS", 0, 0, false );
    SubLFiles.declareFunction( me, "skip_pred_strengthening_for_formulaP", "SKIP-PRED-STRENGTHENING-FOR-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_strengthen_formula", "PRED-STRENGTHEN-FORMULA", 2, 1, false );
    SubLFiles.declareFunction( me, "typed_pred_strengthen_formula", "TYPED-PRED-STRENGTHEN-FORMULA", 2, 1, false );
    SubLFiles.declareFunction( me, "typed_pred_strengthen_formula_unambiguously", "TYPED-PRED-STRENGTHEN-FORMULA-UNAMBIGUOUSLY", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_predicate_strengthen", "FORMULA-PREDICATE-STRENGTHEN", 2, 0, false );
    SubLFiles.declareFunction( me, "formula_predicate_strengthen_with_constraints", "FORMULA-PREDICATE-STRENGTHEN-WITH-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "strengthen_predicate_with_constraints", "STRENGTHEN-PREDICATE-WITH-CONSTRAINTS", 3, 1, false );
    SubLFiles.declareFunction( me, "gather_subformula_pieces", "GATHER-SUBFORMULA-PIECES", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_formula_with_stronger_predicates", "EXPAND-FORMULA-WITH-STRONGER-PREDICATES", 2, 1, false );
    SubLFiles.declareFunction( me, "predstren_substitute_stronger_predicates", "PREDSTREN-SUBSTITUTE-STRONGER-PREDICATES", 4, 0, false );
    SubLFiles.declareFunction( me, "predstren_get_rmp_subformulas", "PREDSTREN-GET-RMP-SUBFORMULAS", 1, 1, false );
    SubLFiles.declareFunction( me, "predstren_get_expandable_subformulas", "PREDSTREN-GET-EXPANDABLE-SUBFORMULAS", 1, 1, false );
    SubLFiles.declareFunction( me, "predstren_expand_formula_internal", "PREDSTREN-EXPAND-FORMULA-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "predstren_expand_formula", "PREDSTREN-EXPAND-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "predstren_expandible_expressionP", "PREDSTREN-EXPANDIBLE-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "predstren_expandible_rmpP", "PREDSTREN-EXPANDIBLE-RMP?", 1, 0, false );
    SubLFiles.declareFunction( me, "predstren_expandible_srfP", "PREDSTREN-EXPANDIBLE-SRF?", 1, 0, false );
    SubLFiles.declareFunction( me, "predstren_expand_one_step", "PREDSTREN-EXPAND-ONE-STEP", 1, 1, false );
    SubLFiles.declareFunction( me, "reformulator_rules_to_use", "REFORMULATOR-RULES-TO-USE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_reformulator_rules_to_use", "INITIALIZE-REFORMULATOR-RULES-TO-USE", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rules_to_ignore", "REFORMULATOR-RULES-TO-IGNORE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_reformulator_rules_to_ignore", "INITIALIZE-REFORMULATOR-RULES-TO-IGNORE", 0, 0, false );
    SubLFiles.declareFunction( me, "predstren_contract_formula", "PREDSTREN-CONTRACT-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "predstren_extend_formula_from_constraints", "PREDSTREN-EXTEND-FORMULA-FROM-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "predstren_handle_is_underspecified", "PREDSTREN-HANDLE-IS-UNDERSPECIFIED", 3, 0, false );
    SubLFiles.declareFunction( me, "predstren_interpret_is", "PREDSTREN-INTERPRET-IS", 2, 0, false );
    SubLFiles.declareFunction( me, "predstren_crack_alist", "PREDSTREN-CRACK-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "predstren_is_means_isaP", "PREDSTREN-IS-MEANS-ISA?", 5, 0, false );
    SubLFiles.declareFunction( me, "predstren_is_means_equalsP", "PREDSTREN-IS-MEANS-EQUALS?", 5, 0, false );
    SubLFiles.declareFunction( me, "predstren_is_means_elementofP", "PREDSTREN-IS-MEANS-ELEMENTOF?", 5, 0, false );
    SubLFiles.declareFunction( me, "predstren_terms_tester", "PREDSTREN-TERMS-TESTER", 3, 0, false );
    SubLFiles.declareFunction( me, "constraint_print_function_trampoline", "CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "constraint_p", "CONSTRAINT-P", 1, 0, false );
    new $constraint_p$UnaryFunction();
    SubLFiles.declareFunction( me, "constraint_variable", "CONSTRAINT-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "constraint_isa_list", "CONSTRAINT-ISA-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "constraint_genl_list", "CONSTRAINT-GENL-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_constraint_variable", "_CSETF-CONSTRAINT-VARIABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_constraint_isa_list", "_CSETF-CONSTRAINT-ISA-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_constraint_genl_list", "_CSETF-CONSTRAINT-GENL-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_constraint", "MAKE-CONSTRAINT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_constraint", "VISIT-DEFSTRUCT-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_constraint_method", "VISIT-DEFSTRUCT-OBJECT-CONSTRAINT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_constraint", "NEW-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_constraintP", "INVALID-CONSTRAINT?", 1, 0, false );
    SubLFiles.declareFunction( me, "print_constraint", "PRINT-CONSTRAINT", 3, 0, false );
    SubLFiles.declareFunction( me, "constraint_as_alist", "CONSTRAINT-AS-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_isa_and_genl_list_to_alist", "CONVERT-ISA-AND-GENL-LIST-TO-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "collection_subset_fn_nat_p", "COLLECTION-SUBSET-FN-NAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_subset_fn_nart_p", "COLLECTION-SUBSET-FN-NART-P", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_subset_fn_naut_p", "COLLECTION-SUBSET-FN-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_subset_fn_nat_subset_formula", "COLLECTION-SUBSET-FN-NAT-SUBSET-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "predstren_get_inter_formula_variables_arg_constraints", "PREDSTREN-GET-INTER-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "predstren_expand_collection_subset_fn_narts_internal", "PREDSTREN-EXPAND-COLLECTION-SUBSET-FN-NARTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "predstren_expand_collection_subset_fn_narts", "PREDSTREN-EXPAND-COLLECTION-SUBSET-FN-NARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "predstren_compute_constraints", "PREDSTREN-COMPUTE-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "predstren_get_typegenl_constraints", "PREDSTREN-GET-TYPEGENL-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "predstren_normalize_constraints", "PREDSTREN-NORMALIZE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "predstren_restructure_constraints", "PREDSTREN-RESTRUCTURE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "predstren_cache_constraints", "PREDSTREN-CACHE-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "predstren_extend_constraint_cache", "PREDSTREN-EXTEND-CONSTRAINT-CACHE", 4, 0, false );
    SubLFiles.declareFunction( me, "predstren_collect_predicates", "PREDSTREN-COLLECT-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "predstren_identify_predicate", "PREDSTREN-IDENTIFY-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "predstren_analyze_options", "PREDSTREN-ANALYZE-OPTIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "predstren_analyze_one_option", "PREDSTREN-ANALYZE-ONE-OPTION", 3, 0, false );
    SubLFiles.declareFunction( me, "predstren_sort_by_arg_specs", "PREDSTREN-SORT-BY-ARG-SPECS", 2, 0, false );
    SubLFiles.declareFunction( me, "constraint_from_fort_as_alist", "CONSTRAINT-FROM-FORT-AS-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "constraint_from_listy_as_alist", "CONSTRAINT-FROM-LISTY-AS-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "constraint_from_object_as_alist", "CONSTRAINT-FROM-OBJECT-AS-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "min_isa_via_deffns", "MIN-ISA-VIA-DEFFNS", 2, 0, false );
    SubLFiles.declareFunction( me, "predstren_extend_constraints_from_table", "PREDSTREN-EXTEND-CONSTRAINTS-FROM-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "predstren_augment_one_constraint_set", "PREDSTREN-AUGMENT-ONE-CONSTRAINT-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "strengthen_predicate_wXnew_pred_strengthener", "STRENGTHEN-PREDICATE-W/NEW-PRED-STRENGTHENER", 2, 0, false );
    SubLFiles.declareMacro( me, "push_pred_wXmarkingXtype", "PUSH-PRED-W/MARKING&TYPE" );
    SubLFiles.declareMacro( me, "append_pred_wXmarking", "APPEND-PRED-W/MARKING" );
    SubLFiles.declareFunction( me, "strengthen_predicate_wXtyped_and_minimal_suggestions", "STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "strengthen_predicate_wXtyped_and_all_suggestions", "STRENGTHEN-PREDICATE-W/TYPED-AND-ALL-SUGGESTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "strengthen_predicate_wXtyped_links_only", "STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY", 2, 0, false );
    SubLFiles.declareFunction( me, "passes_pred_strengthening_test", "PASSES-PRED-STRENGTHENING-TEST", 3, 0, false );
    SubLFiles.declareFunction( me, "passes_narty_pred_strengthening_test", "PASSES-NARTY-PRED-STRENGTHENING-TEST", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_predicate_strengthener_file()
  {
    $strengthen_original_pred_awayP$ = SubLFiles.defparameter( "*STRENGTHEN-ORIGINAL-PRED-AWAY?*", NIL );
    $pred_strengthen_stop_at_first_specified_pred$ = SubLFiles.defparameter( "*PRED-STRENGTHEN-STOP-AT-FIRST-SPECIFIED-PRED*", NIL );
    $pred_strengthening_max_literal_count$ = SubLFiles.defparameter( "*PRED-STRENGTHENING-MAX-LITERAL-COUNT*", $kw0$POSITIVE_INFINITY );
    $max_pred_strengs$ = SubLFiles.defparameter( "*MAX-PRED-STRENGS*", NIL );
    $pred_strengthener_fn$ = SubLFiles.defparameter( "*PRED-STRENGTHENER-FN*", $sym3$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS );
    $do_not_strengthen_isaP$ = SubLFiles.defparameter( "*DO-NOT-STRENGTHEN-ISA?*", T );
    $reformulator_rules_to_use$ = SubLFiles.deflexical( "*REFORMULATOR-RULES-TO-USE*", ( maybeDefault( $sym20$_REFORMULATOR_RULES_TO_USE_, $reformulator_rules_to_use$, NIL ) ) );
    $reformulator_rules_to_ignore$ = SubLFiles.deflexical( "*REFORMULATOR-RULES-TO-IGNORE*", ( maybeDefault( $sym26$_REFORMULATOR_RULES_TO_IGNORE_, $reformulator_rules_to_ignore$, NIL ) ) );
    $dtp_constraint$ = SubLFiles.defconstant( "*DTP-CONSTRAINT*", $sym46$CONSTRAINT );
    $predstren_common_uninteresting$ = SubLFiles.deflexical( "*PREDSTREN-COMMON-UNINTERESTING*", $list85 );
    $ps_suggested_inverses$ = SubLFiles.defvar( "*PS-SUGGESTED-INVERSES*", NIL );
    $ps_suggested_preds$ = SubLFiles.defvar( "*PS-SUGGESTED-PREDS*", NIL );
    $ps_typed_inverses$ = SubLFiles.defvar( "*PS-TYPED-INVERSES*", NIL );
    $ps_typed_preds$ = SubLFiles.defvar( "*PS-TYPED-PREDS*", NIL );
    return NIL;
  }

  public static SubLObject setup_predicate_strengthener_file()
  {
    memoization_state.note_memoized_function( $sym15$PREDSTREN_EXPAND_FORMULA );
    subl_macro_promotions.declare_defglobal( $sym20$_REFORMULATOR_RULES_TO_USE_ );
    subl_macro_promotions.declare_defglobal( $sym26$_REFORMULATOR_RULES_TO_IGNORE_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_constraint$.getGlobalValue(), Symbols.symbol_function( $sym53$CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list54 );
    Structures.def_csetf( $sym55$CONSTRAINT_VARIABLE, $sym56$_CSETF_CONSTRAINT_VARIABLE );
    Structures.def_csetf( $sym57$CONSTRAINT_ISA_LIST, $sym58$_CSETF_CONSTRAINT_ISA_LIST );
    Structures.def_csetf( $sym59$CONSTRAINT_GENL_LIST, $sym60$_CSETF_CONSTRAINT_GENL_LIST );
    Equality.identity( $sym46$CONSTRAINT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_constraint$.getGlobalValue(), Symbols.symbol_function( $sym69$VISIT_DEFSTRUCT_OBJECT_CONSTRAINT_METHOD ) );
    memoization_state.note_memoized_function( $sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS );
    generic_testing.define_test_case_table_int( $sym122$PASSES_PRED_STRENGTHENING_TEST, ConsesLow.list( new SubLObject[] { $kw123$TEST, NIL, $kw124$OWNER, NIL, $kw125$CLASSES, NIL, $kw126$KB, $kw127$FULL,
      $kw128$WORKING_, NIL
    } ), $list129 );
    generic_testing.define_test_case_table_int( $sym130$PASSES_NARTY_PRED_STRENGTHENING_TEST, ConsesLow.list( new SubLObject[] { $kw123$TEST, NIL, $kw124$OWNER, NIL, $kw125$CLASSES, NIL, $kw126$KB, $kw127$FULL,
      $kw128$WORKING_, T
    } ), $list131 );
    return NIL;
  }

  private static SubLObject _constant_129_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Angola" ) ), constant_handles.reader_make_constant_shell( makeString( "Country" ) ) ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ), constant_handles.reader_make_constant_shell( makeString( "Angola" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "SouthWesternRegionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "ContinentOfAfrica" ) ) ) ) ), constant_handles.reader_make_constant_shell(
                    makeString( "RKFParsingMt" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Angola" ) ), constant_handles.reader_make_constant_shell( makeString( "Country" ) ) ), ConsesLow.list(
                            constant_handles.reader_make_constant_shell( makeString( "inRegion" ) ), constant_handles.reader_make_constant_shell( makeString( "Angola" ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "SouthWesternRegionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "ContinentOfAfrica" ) ) ) ) ), ConsesLow.list(
                                    constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                                        .reader_make_constant_shell( makeString( "Angola" ) ), constant_handles.reader_make_constant_shell( makeString( "Country" ) ) ), ConsesLow.list( constant_handles
                                            .reader_make_constant_shell( makeString( "objectFoundInLocation" ) ), constant_handles.reader_make_constant_shell( makeString( "Angola" ) ), ConsesLow.list( constant_handles
                                                .reader_make_constant_shell( makeString( "SouthWesternRegionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "ContinentOfAfrica" ) ) ) ) ) ) ), T ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), constant_handles.reader_make_constant_shell( makeString(
          "possessiveRelation" ) ), constant_handles.reader_make_constant_shell( makeString( "Lenat" ) ), constant_handles.reader_make_constant_shell( makeString( "PhDDegree" ) ) ), constant_handles
              .reader_make_constant_shell( makeString( "RKFParsingMt" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "hasIssuedTo" ) ), constant_handles.reader_make_constant_shell( makeString( "Lenat" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "PhDDegree" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ), constant_handles
                          .reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ), constant_handles.reader_make_constant_shell( makeString( "IntelligentAgent" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "AliceInWonderland-TheBook" ) ) ), constant_handles.reader_make_constant_shell( makeString( "RKFParsingMt" ) ), ConsesLow.list( ConsesLow.list(
                                  constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "characterInCW" ) ), constant_handles
                                      .reader_make_constant_shell( makeString( "IntelligentAgent" ) ), constant_handles.reader_make_constant_shell( makeString( "AliceInWonderland-TheBook" ) ) ) ) ), T ), ConsesLow.list(
                                          ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles
                                              .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "is-Underspecified" ) ), constant_handles
                                                  .reader_make_constant_shell( makeString( "BillClinton" ) ), makeSymbol( "?X" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                      makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "MaleAnimal" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                          makeString( "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "father" ) ), constant_handles.reader_make_constant_shell(
                                                              makeString( "Animal" ) ), makeSymbol( "?X" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "RKFParsingMt" ) ), ConsesLow.list( ConsesLow
                                                                  .list( constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                      "father" ) ), constant_handles.reader_make_constant_shell( makeString( "Animal" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                          "BillClinton" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                              "thereExists" ) ), makeSymbol( "?X" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                                                                  constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell(
                                                                                      makeString( "contains-Underspecified" ) ), constant_handles.reader_make_constant_shell( makeString( "Animal" ) ), makeSymbol(
                                                                                          "?X" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "is-Underspecified" ) ), constant_handles
                                                                                              .reader_make_constant_shell( makeString( "BillClinton" ) ), makeSymbol( "?X" ) ), ConsesLow.list( constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell(
                                                                                                      makeString( "MaleAnimal" ) ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "RKFParsingMt" ) ),
                                                                              ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?X" ), ConsesLow
                                                                                  .list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                      makeString( "equals" ) ), constant_handles.reader_make_constant_shell( makeString( "BillClinton" ) ), makeSymbol( "?X" ) ), ConsesLow
                                                                                          .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles
                                                                                              .reader_make_constant_shell( makeString( "MaleAnimal" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                  makeString( "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "in-ContGeneric" ) ),
                                                                                                  constant_handles.reader_make_constant_shell( makeString( "Animal" ) ), makeSymbol( "?X" ) ) ) ), ConsesLow.list(
                                                                                                      constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?X" ), ConsesLow.list(
                                                                                                          constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "equals" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                  makeString( "BillClinton" ) ), makeSymbol( "?X" ) ), ConsesLow.list( constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "MaleAnimal" ) ) ), ConsesLow.list( constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "relationExistsInstance" ) ), constant_handles
                                                                                                                                  .reader_make_constant_shell( makeString( "constituents" ) ), constant_handles
                                                                                                                                      .reader_make_constant_shell( makeString( "Animal" ) ), makeSymbol( "?X" ) ) ) ) ) ),
                                                                              T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                                                                                  .reader_make_constant_shell( makeString( "GeorgeWBush" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                      "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles
                                                                                          .reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ), constant_handles.reader_make_constant_shell(
                                                                                              makeString( "Texas-State" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), ConsesLow
                                                                                                  .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "GeorgeWBush" ) ), ConsesLow.list( constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "SubcollectionByRegionFn" ) ), constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                  makeString( "Texas-State" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                      makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWBush" ) ),
                                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                          "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                              "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "inRegion" ) ),
                                                                                                                          constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ) ) ) ), T ), ConsesLow
                                                                                                                              .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                  makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles
                                                                                                                                      .reader_make_constant_shell( makeString( "Person" ) ), constant_handles
                                                                                                                                          .reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ),
                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ),
                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), ConsesLow
                                                                                                                                      .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                          "SubcollectionByRegionFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                              makeString( "Person" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                  makeString( "Texas-State" ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                          "SubcollectionOfWithRelationToFn" ) ), constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "Person" ) ),
                                                                                                                                                      constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                          "inRegion" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                              makeString( "Texas-State" ) ) ) ) ), T ), ConsesLow.list(
                                                                                                                                                                  ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "relationExistsInstance" ) ), constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "in-UnderspecifiedContainer" ) ),
                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "SubcollectionOfWithRelationToFn" ) ),
                                                                                                                                                                          constant_handles.reader_make_constant_shell(
                                                                                                                                                                              makeString( "Person" ) ), constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "in-UnderspecifiedContainer" ) ),
                                                                                                                                                                          constant_handles.reader_make_constant_shell(
                                                                                                                                                                              makeString( "Texas-State" ) ) ),
                                                                                                                                                                      constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString( "Texas-State" ) ) ), constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "InferencePSC" ) ), ConsesLow.list(
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "relationExistsInstance" ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "inRegion" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "SubcollectionOfWithRelationToFn" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "Person" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "inRegion" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "Texas-State" ) ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "Texas-State" ) ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "relationExistsInstance" ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "inRegion" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "SubcollectionByRegionFn" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "Person" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "Texas-State" ) ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "Texas-State" ) ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "relationExistsInstance" ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "objectFoundInLocation" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "SubcollectionOfWithRelationToFn" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "Person" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "inRegion" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "Texas-State" ) ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "Texas-State" ) ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "relationExistsInstance" ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "objectFoundInLocation" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "SubcollectionByRegionFn" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "Person" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "Texas-State" ) ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "Texas-State" ) ) ) ) ),
                                                                                                                                                                  T ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                                                                      constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString( "relationAllExists" ) ),
                                                                                                                                                                      constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString( "contains-Underspecified" ) ),
                                                                                                                                                                      constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString( "Ribonucleotide" ) ), constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "Ribose" ) ) ), constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "RKFParsingMt" ) ),
                                                                                                                                                                      ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "relationAllExists" ) ), constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "constituents" ) ), constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "Ribonucleotide" ) ),
                                                                                                                                                                          constant_handles.reader_make_constant_shell(
                                                                                                                                                                              makeString( "Ribose" ) ) ), ConsesLow.list(
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString(
                                                                                                                                                                                              "relationAllExists" ) ),
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "in-ContGeneric" ) ),
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "Ribonucleotide" ) ),
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "Ribose" ) ) ) ) ),
                                                                                                                                                                      T )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_predicate_strengthener_file();
  }

  @Override
  public void initializeVariables()
  {
    init_predicate_strengthener_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_predicate_strengthener_file();
  }
  static
  {
    me = new predicate_strengthener();
    $strengthen_original_pred_awayP$ = null;
    $pred_strengthen_stop_at_first_specified_pred$ = null;
    $pred_strengthening_max_literal_count$ = null;
    $max_pred_strengs$ = null;
    $pred_strengthener_fn$ = null;
    $do_not_strengthen_isaP$ = null;
    $reformulator_rules_to_use$ = null;
    $reformulator_rules_to_ignore$ = null;
    $dtp_constraint$ = null;
    $predstren_common_uninteresting$ = null;
    $ps_suggested_inverses$ = null;
    $ps_suggested_preds$ = null;
    $ps_typed_inverses$ = null;
    $ps_typed_preds$ = null;
    $kw0$POSITIVE_INFINITY = makeKeyword( "POSITIVE-INFINITY" );
    $sym1$ATOMIC_SENTENCE_ = makeSymbol( "ATOMIC-SENTENCE?" );
    $sym2$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $sym3$STRENGTHEN_PREDICATE_W_TYPED_AND_MINIMAL_SUGGESTIONS = makeSymbol( "STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS" );
    $sym4$STRENGTHEN_PREDICATE_W_TYPED_LINKS_ONLY = makeSymbol( "STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY" );
    $const5$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const6$is_Underspecified = constant_handles.reader_make_constant_shell( makeString( "is-Underspecified" ) );
    $sym7$NART_P = makeSymbol( "NART-P" );
    $str8$PredStren__no_contracted_version_ = makeString( "PredStren: no contracted version for ~S~%" );
    $const9$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $kw10$ANY = makeKeyword( "ANY" );
    $sym11$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $const12$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym13$PREDSTREN_EXPANDIBLE_RMP_ = makeSymbol( "PREDSTREN-EXPANDIBLE-RMP?" );
    $sym14$PREDSTREN_EXPANDIBLE_EXPRESSION_ = makeSymbol( "PREDSTREN-EXPANDIBLE-EXPRESSION?" );
    $sym15$PREDSTREN_EXPAND_FORMULA = makeSymbol( "PREDSTREN-EXPAND-FORMULA" );
    $kw16$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym17$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym18$PREDSTREN_EXPAND_ONE_STEP = makeSymbol( "PREDSTREN-EXPAND-ONE-STEP" );
    $const19$expansion = constant_handles.reader_make_constant_shell( makeString( "expansion" ) );
    $sym20$_REFORMULATOR_RULES_TO_USE_ = makeSymbol( "*REFORMULATOR-RULES-TO-USE*" );
    $sym21$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const22$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const23$SubcollectionRelationFunction = constant_handles.reader_make_constant_shell( makeString( "SubcollectionRelationFunction" ) );
    $const24$RuleMacroPredicate = constant_handles.reader_make_constant_shell( makeString( "RuleMacroPredicate" ) );
    $kw25$TRUE = makeKeyword( "TRUE" );
    $sym26$_REFORMULATOR_RULES_TO_IGNORE_ = makeSymbol( "*REFORMULATOR-RULES-TO-IGNORE*" );
    $list27 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "reformulatorEquiv" ) ), ConsesLow.list( makeSymbol( "?PRED" ), makeSymbol( "?THING" ), makeSymbol( "?VAR" ), makeSymbol(
        "?ROLE" ) ), ConsesLow.list( makeSymbol( "?PRED" ), makeSymbol( "?THING" ), makeSymbol( "?VAR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycLVariableFn" ) ), makeSymbol(
            "?ROLE" ) ) ) );
    $const28$IntermediateVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "IntermediateVocabularyMt" ) );
    $list29 = ConsesLow.list( makeSymbol( "CYCL" ), makeSymbol( "MT" ) );
    $kw30$MAX_TIME = makeKeyword( "MAX-TIME" );
    $int31$30 = makeInteger( 30 );
    $kw32$RECURSION_LIMIT = makeKeyword( "RECURSION-LIMIT" );
    $kw33$FOCUS = makeKeyword( "FOCUS" );
    $const34$ReformulatorRuleUnifier = constant_handles.reader_make_constant_shell( makeString( "ReformulatorRuleUnifier" ) );
    $kw35$REFORMULATOR_RULES = makeKeyword( "REFORMULATOR-RULES" );
    $kw36$SKIP_ASSERTIONS = makeKeyword( "SKIP-ASSERTIONS" );
    $list37 = ConsesLow.list( makeKeyword( "WFF-ENFORCEMENT" ), makeKeyword( "NONE" ) );
    $list38 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "ISAS" ), makeSymbol( "GENLS" ) );
    $const39$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const40$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const41$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $list42 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Individual" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles
        .reader_make_constant_shell( makeString( "CollectionType" ) ), constant_handles.reader_make_constant_shell( makeString( "CollectionTypeType" ) ) );
    $const43$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $const44$Set_Mathematical = constant_handles.reader_make_constant_shell( makeString( "Set-Mathematical" ) );
    $const45$elementOf = constant_handles.reader_make_constant_shell( makeString( "elementOf" ) );
    $sym46$CONSTRAINT = makeSymbol( "CONSTRAINT" );
    $sym47$CONSTRAINT_P = makeSymbol( "CONSTRAINT-P" );
    $list48 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "ISA-LIST" ), makeSymbol( "GENL-LIST" ) );
    $list49 = ConsesLow.list( makeKeyword( "VARIABLE" ), makeKeyword( "ISA-LIST" ), makeKeyword( "GENL-LIST" ) );
    $list50 = ConsesLow.list( makeSymbol( "CONSTRAINT-VARIABLE" ), makeSymbol( "CONSTRAINT-ISA-LIST" ), makeSymbol( "CONSTRAINT-GENL-LIST" ) );
    $list51 = ConsesLow.list( makeSymbol( "_CSETF-CONSTRAINT-VARIABLE" ), makeSymbol( "_CSETF-CONSTRAINT-ISA-LIST" ), makeSymbol( "_CSETF-CONSTRAINT-GENL-LIST" ) );
    $sym52$PRINT_CONSTRAINT = makeSymbol( "PRINT-CONSTRAINT" );
    $sym53$CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE" );
    $list54 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CONSTRAINT-P" ) );
    $sym55$CONSTRAINT_VARIABLE = makeSymbol( "CONSTRAINT-VARIABLE" );
    $sym56$_CSETF_CONSTRAINT_VARIABLE = makeSymbol( "_CSETF-CONSTRAINT-VARIABLE" );
    $sym57$CONSTRAINT_ISA_LIST = makeSymbol( "CONSTRAINT-ISA-LIST" );
    $sym58$_CSETF_CONSTRAINT_ISA_LIST = makeSymbol( "_CSETF-CONSTRAINT-ISA-LIST" );
    $sym59$CONSTRAINT_GENL_LIST = makeSymbol( "CONSTRAINT-GENL-LIST" );
    $sym60$_CSETF_CONSTRAINT_GENL_LIST = makeSymbol( "_CSETF-CONSTRAINT-GENL-LIST" );
    $kw61$VARIABLE = makeKeyword( "VARIABLE" );
    $kw62$ISA_LIST = makeKeyword( "ISA-LIST" );
    $kw63$GENL_LIST = makeKeyword( "GENL-LIST" );
    $str64$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw65$BEGIN = makeKeyword( "BEGIN" );
    $sym66$MAKE_CONSTRAINT = makeSymbol( "MAKE-CONSTRAINT" );
    $kw67$SLOT = makeKeyword( "SLOT" );
    $kw68$END = makeKeyword( "END" );
    $sym69$VISIT_DEFSTRUCT_OBJECT_CONSTRAINT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CONSTRAINT-METHOD" );
    $str70$__Constraint___A_isa___A_genl___A = makeString( "#<Constraint: ~A isa: ~A genl: ~A> " );
    $const71$CollectionSubsetFn = constant_handles.reader_make_constant_shell( makeString( "CollectionSubsetFn" ) );
    $const72$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $sym73$COLLECTION_SUBSET_FN_NAUT_P = makeSymbol( "COLLECTION-SUBSET-FN-NAUT-P" );
    $sym74$FORMULA_ARG2 = makeSymbol( "FORMULA-ARG2" );
    $sym75$PREDSTREN_EXPAND_COLLECTION_SUBSET_FN_NARTS = makeSymbol( "PREDSTREN-EXPAND-COLLECTION-SUBSET-FN-NARTS" );
    $sym76$COLLECTION_SUBSET_FN_NART_P = makeSymbol( "COLLECTION-SUBSET-FN-NART-P" );
    $sym77$NART_EXPAND = makeSymbol( "NART-EXPAND" );
    $const78$typeGenls = constant_handles.reader_make_constant_shell( makeString( "typeGenls" ) );
    $const79$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $list80 = ConsesLow.list( makeSymbol( "FUNCTOR" ), makeSymbol( "VAR" ), makeSymbol( "TERM" ) );
    $list81 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycLVariable" ) ) );
    $kw82$EMPTY = makeKeyword( "EMPTY" );
    $str83$Non_binary_constraint_in_Predicat = makeString( "Non-binary constraint in Predicate Strengthener: ~S" );
    $sym84$PREDSTREN_IDENTIFY_PREDICATE = makeSymbol( "PREDSTREN-IDENTIFY-PREDICATE" );
    $list85 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ), constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ) );
    $const86$UnderspecifiedPredicate = constant_handles.reader_make_constant_shell( makeString( "UnderspecifiedPredicate" ) );
    $list87 = ConsesLow.list( makeSymbol( "HOW" ), makeSymbol( "PREDICATES" ) );
    $sym88$_ = makeSymbol( "<" );
    $sym89$RELATION_GENERALITY_ESTIMATE = makeSymbol( "RELATION-GENERALITY-ESTIMATE" );
    $list90 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycLSentence-Assertible" ) ) );
    $const91$SubLString = constant_handles.reader_make_constant_shell( makeString( "SubLString" ) );
    $const92$NegativeInteger = constant_handles.reader_make_constant_shell( makeString( "NegativeInteger" ) );
    $const93$NonNegativeInteger = constant_handles.reader_make_constant_shell( makeString( "NonNegativeInteger" ) );
    $const94$RealNumber = constant_handles.reader_make_constant_shell( makeString( "RealNumber" ) );
    $const95$SubLKeyword = constant_handles.reader_make_constant_shell( makeString( "SubLKeyword" ) );
    $const96$SubLListOrAtom = constant_handles.reader_make_constant_shell( makeString( "SubLListOrAtom" ) );
    $const97$SubLList = constant_handles.reader_make_constant_shell( makeString( "SubLList" ) );
    $const98$SubLAtom = constant_handles.reader_make_constant_shell( makeString( "SubLAtom" ) );
    $const99$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $list100 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "MARKING" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "PRED-TYPE" ), makeKeyword( "TYPED" ) ) );
    $kw101$TYPED = makeKeyword( "TYPED" );
    $sym102$PCOND = makeSymbol( "PCOND" );
    $sym103$PRED_STRENG_MARKING_MODE = makeSymbol( "PRED-STRENG-MARKING-MODE" );
    $list104 = ConsesLow.list( makeSymbol( "*SBHL-GENL-PREDS-MARKING*" ) );
    $sym105$CPUSHNEW = makeSymbol( "CPUSHNEW" );
    $list106 = ConsesLow.list( makeSymbol( "*PS-TYPED-PREDS*" ) );
    $list107 = ConsesLow.list( makeSymbol( "*SBHL-GENL-INVERSE-MARKING*" ) );
    $list108 = ConsesLow.list( makeSymbol( "*PS-TYPED-INVERSES*" ) );
    $list109 = ConsesLow.list( makeSymbol( "*SBHL-GENL-PREDS-AND-GENL-INVERSE-MARKING*" ) );
    $list110 = ConsesLow.list( makeSymbol( "*PS-SUGGESTED-PREDS*" ) );
    $list111 = ConsesLow.list( makeSymbol( "*PS-SUGGESTED-INVERSES*" ) );
    $list112 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "MARKING" ) );
    $sym113$PUNLESS = makeSymbol( "PUNLESS" );
    $sym114$MEMBER_ = makeSymbol( "MEMBER?" );
    $sym115$CSETQ = makeSymbol( "CSETQ" );
    $sym116$_PS_SUGGESTED_PREDS_ = makeSymbol( "*PS-SUGGESTED-PREDS*" );
    $sym117$SNOC = makeSymbol( "SNOC" );
    $sym118$_PS_SUGGESTED_INVERSES_ = makeSymbol( "*PS-SUGGESTED-INVERSES*" );
    $str119$Error_in_processing__A__result_co = makeString( "Error in processing ~A~%result count not equal to expected count ~%actual result: ~A~%Expected Result ~A~%" );
    $sym120$EQUALS_EL_ = makeSymbol( "EQUALS-EL?" );
    $str121$_A___not_found_in_expected_result = makeString( "~A~% not found in expected results for ~%~A~%" );
    $sym122$PASSES_PRED_STRENGTHENING_TEST = makeSymbol( "PASSES-PRED-STRENGTHENING-TEST" );
    $kw123$TEST = makeKeyword( "TEST" );
    $kw124$OWNER = makeKeyword( "OWNER" );
    $kw125$CLASSES = makeKeyword( "CLASSES" );
    $kw126$KB = makeKeyword( "KB" );
    $kw127$FULL = makeKeyword( "FULL" );
    $kw128$WORKING_ = makeKeyword( "WORKING?" );
    $list129 = _constant_129_initializer();
    $sym130$PASSES_NARTY_PRED_STRENGTHENING_TEST = makeSymbol( "PASSES-NARTY-PRED-STRENGTHENING-TEST" );
    $list131 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Angola" ) ), constant_handles.reader_make_constant_shell( makeString( "Country" ) ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ), constant_handles.reader_make_constant_shell( makeString( "Angola" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                makeString( "SouthWesternRegionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "ContinentOfAfrica" ) ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "RKFParsingMt" ) ),
        ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
            .reader_make_constant_shell( makeString( "Angola" ) ), constant_handles.reader_make_constant_shell( makeString( "Country" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "inRegion" ) ), constant_handles.reader_make_constant_shell( makeString( "Angola" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SouthWesternRegionFn" ) ), constant_handles
                    .reader_make_constant_shell( makeString( "ContinentOfAfrica" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Angola" ) ), constant_handles.reader_make_constant_shell( makeString( "Country" ) ) ),
                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "objectFoundInLocation" ) ), constant_handles.reader_make_constant_shell( makeString( "Angola" ) ), ConsesLow.list(
                            constant_handles.reader_make_constant_shell( makeString( "SouthWesternRegionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "ContinentOfAfrica" ) ) ) ) ) ) ), T ), ConsesLow
                                .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWBush" ) ),
                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ),
                                        constant_handles.reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ), constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ) ),
                                    constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                        constant_handles.reader_make_constant_shell( makeString( "GeorgeWBush" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionByRegionFn" ) ),
                                            constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ) ), ConsesLow.list(
                                                constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "GeorgeWBush" ) ), ConsesLow.list(
                                                    constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ),
                                                    constant_handles.reader_make_constant_shell( makeString( "inRegion" ) ), constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ) ) ) ), T ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString(
            "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ), constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ), constant_handles
                .reader_make_constant_shell( makeString( "InferencePSC" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionByRegionFn" ) ), constant_handles
                    .reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "inRegion" ) ),
                        constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "in-UnderspecifiedContainer" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString(
                                    "in-UnderspecifiedContainer" ) ), constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                        "Texas-State" ) ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                            makeString( "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "inRegion" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell(
                                                    makeString( "inRegion" ) ), constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                        "Texas-State" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) ), constant_handles
                                                            .reader_make_constant_shell( makeString( "inRegion" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubcollectionByRegionFn" ) ),
                                                                constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ),
                                                            constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "objectFoundInLocation" ) ), ConsesLow.list( constant_handles
                                                                    .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ),
                                                                    constant_handles.reader_make_constant_shell( makeString( "inRegion" ) ), constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ),
                                                                constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                    "relationExistsInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "objectFoundInLocation" ) ), ConsesLow.list( constant_handles
                                                                        .reader_make_constant_shell( makeString( "SubcollectionByRegionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ),
                                                                        constant_handles.reader_make_constant_shell( makeString( "Texas-State" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                            "Texas-State" ) ) ) ) ), T ) );
  }

  public static final class $constraint_native
      extends
        SubLStructNative
  {
    public SubLObject $variable;
    public SubLObject $isa_list;
    public SubLObject $genl_list;
    private static final SubLStructDeclNative structDecl;

    public $constraint_native()
    {
      this.$variable = CommonSymbols.NIL;
      this.$isa_list = CommonSymbols.NIL;
      this.$genl_list = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $constraint_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$variable;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$isa_list;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$genl_list;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$variable = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$isa_list = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$genl_list = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $constraint_native.class, $sym46$CONSTRAINT, $sym47$CONSTRAINT_P, $list48, $list49, new String[] { "$variable", "$isa_list", "$genl_list"
      }, $list50, $list51, $sym52$PRINT_CONSTRAINT );
    }
  }

  public static final class $constraint_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $constraint_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CONSTRAINT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return constraint_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 610 ms
 * 
 */