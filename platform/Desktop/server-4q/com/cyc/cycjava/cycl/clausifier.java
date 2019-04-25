package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class clausifier
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.clausifier";
  public static final String myFingerPrint = "2a26a042856369a0884fd745608529436586d0f3e3ea3dcd653ed8f7d9756594";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1166L)
  public static SubLSymbol $canonical_variable_name_stem$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1903L)
  public static SubLSymbol $use_cnf_cacheP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2024L)
  private static SubLSymbol $newly_introduced_universals$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2155L)
  private static SubLSymbol $outermost_implication$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2501L)
  private static SubLSymbol $innermost_implication$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2644L)
  private static SubLSymbol $eliminate_existential_with_var_only_in_antecedentP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28132L)
  private static SubLSymbol $quantifier_info_list$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46377L)
  private static SubLSymbol $czer_bad_exponential_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55374L)
  private static SubLSymbol $clausifier_input_sentence$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55649L)
  private static SubLSymbol $clausifier_input_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65626L)
  private static SubLSymbol $cached_cnf_clausal_form_caching_state$;
  private static final SubLString $str0$el_var;
  private static final SubLSymbol $kw1$ERROR;
  private static final SubLSymbol $kw2$UNINITIALIZED;
  private static final SubLSymbol $sym3$DO_IMPLICATIONS_RECURSIVE;
  private static final SubLSymbol $sym4$DO_NEGATIONS_DESTRUCTIVE;
  private static final SubLSymbol $kw5$HELLO_YOU_SILLY_COMPILER;
  private static final SubLObject $const6$True;
  private static final SubLObject $const7$False;
  private static final SubLSymbol $kw8$REGULARIZE;
  private static final SubLString $str9$_s_is_not_a_quantified_sentence;
  private static final SubLSymbol $sym10$NEGATE_NEGATION;
  private static final SubLSymbol $sym11$NEGATE_FORMULA;
  private static final SubLObject $const12$DifferenceFn;
  private static final SubLString $str13$_s_contained_the_invalid_bound__D;
  private static final SubLObject $const14$PlusFn;
  private static final SubLSymbol $sym15$EL_FORMULA_P;
  private static final SubLInteger $int16$32;
  private static final SubLSymbol $sym17$CYC_VAR_;
  private static final SubLObject $const18$Quote;
  private static final SubLSymbol $sym19$RECURSIVELY_STANDARDIZE_VARIABLES;
  private static final SubLSymbol $sym20$EL_UNIQUIFY_STANDARDIZE;
  private static final SubLSymbol $sym21$EL_VAR_WITHOUT_QUOTE;
  private static final SubLSymbol $kw22$IGNORE;
  private static final SubLString $str23$_;
  private static final SubLSymbol $sym24$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P;
  private static final SubLSymbol $kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE;
  private static final SubLSymbol $kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE;
  private static final SubLSymbol $kw27$QUANTIFIED_SEQUENCE_VARIABLE;
  private static final SubLSymbol $sym28$EXISTENTIALS_OUT_INT;
  private static final SubLString $str29$Unexpected_sentence_type_in_exist;
  private static final SubLObject $const30$forAll;
  private static final SubLSymbol $kw31$NEITHER;
  private static final SubLSymbol $kw32$TERM;
  private static final SubLSymbol $kw33$SEQ;
  private static final SubLSymbol $kw34$BOTH;
  private static final SubLSymbol $kw35$UNDETERMINED;
  private static final SubLString $str36$Skolemizer_failed_to_classify_var;
  private static final SubLString $str37$skolem_constants_not_yet_supporte;
  private static final SubLObject $const38$thereExists;
  private static final SubLObject $const39$SkolemFunctionFn;
  private static final SubLObject $const40$SkolemFuncNFn;
  private static final SubLString $str41$make_skolem_fn_fn_doesn_t_know_ho;
  private static final SubLSymbol $kw42$ASSERT_ONLY;
  private static final SubLString $str43$Unexpected_value_for__forbid_quan;
  private static final SubLSymbol $sym44$UNIVERSALS_OUT;
  private static final SubLString $str45$Got_the_unexpected_sentence__S_in;
  private static final SubLSymbol $sym46$DISJUNCTIONS_IN;
  private static final SubLString $str47$Got_the_unexpected_sentence__S_in;
  private static final SubLSymbol $sym48$EL_CONJUNCTION_P;
  private static final SubLSymbol $kw49$BAD_EXPONENTIAL_DISJUNCTION;
  private static final SubLInteger $int50$200000;
  private static final SubLSymbol $sym51$FORMULA_ARITY;
  private static final SubLString $str52$_s_is_not_a_conjunction__so_it_is;
  private static final SubLString $str53$_s_is_not_a_disjunction__so__S_is;
  private static final SubLSymbol $sym54$CONJUNCTIONS_IN;
  private static final SubLString $str55$Got_the_unexpected_formula__S_in_;
  private static final SubLSymbol $sym56$EL_DISJUNCTION_P;
  private static final SubLSymbol $kw57$BAD_EXPONENTIAL_CONJUNCTION;
  private static final SubLString $str58$_s_is_not_a_disjunction__so_it_is;
  private static final SubLString $str59$_s_is_not_a_conjunction__so__S_is;
  private static final SubLSymbol $sym60$PACKAGE_XNF_CLAUSE;
  private static final SubLSymbol $sym61$FORMULA_ARG1;
  private static final SubLSymbol $sym62$EL_VAR_;
  private static final SubLSymbol $sym63$LEADING_UNIVERSAL_VARIABLES_1;
  private static final SubLSymbol $sym64$STRING_;
  private static final SubLSymbol $sym65$STR;
  private static final SubLObject $const66$and;
  private static final SubLSymbol $kw67$CNF;
  private static final SubLSymbol $kw68$DNF;
  private static final SubLSymbol $sym69$CACHED_CNF_CLAUSAL_FORM;
  private static final SubLSymbol $sym70$_CACHED_CNF_CLAUSAL_FORM_CACHING_STATE_;
  private static final SubLInteger $int71$48;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2776L)
  public static SubLObject do_implications(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $outermost_implication$.currentBinding( thread );
    try
    {
      $outermost_implication$.bind( sentence, thread );
      result = do_implications_recursive( sentence );
    }
    finally
    {
      $outermost_implication$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2962L)
  public static SubLObject do_implications_recursive(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_utilities.encapsulate_formulaP( sentence ) )
    {
      if( NIL != eliminate_existential_with_var_only_in_antecedentP( sentence, $innermost_implication$.getDynamicValue( thread ), $outermost_implication$.getDynamicValue( thread ) ) )
      {
        return do_implications_recursive( el_utilities.quantified_sub_sentence( sentence ) );
      }
      return czer_utilities.encapsulate_formula( sentence, UNPROVIDED );
    }
    else
    {
      if( NIL == el_utilities.el_formula_p( sentence ) )
      {
        return sentence;
      }
      final SubLObject seqvar = el_utilities.sequence_var( sentence, UNPROVIDED );
      final SubLObject sentence_$1 = ( NIL != seqvar ) ? el_utilities.strip_sequence_var( sentence ) : sentence;
      SubLObject result = NIL;
      if( NIL != el_utilities.el_implication_p( sentence_$1 ) && NIL != el_utilities.el_meets_pragmatic_requirement_p( cycl_utilities.sentence_arg2( sentence_$1, UNPROVIDED ) ) )
      {
        SubLObject disjunct_1 = NIL;
        final SubLObject _prev_bind_0 = $innermost_implication$.currentBinding( thread );
        try
        {
          $innermost_implication$.bind( sentence_$1, thread );
          final SubLObject _prev_bind_0_$2 = control_vars.$within_ask$.currentBinding( thread );
          try
          {
            control_vars.$within_ask$.bind( T, thread );
            disjunct_1 = el_utilities.make_negation( el_utilities.funcall_formula_arg( Symbols.symbol_function( $sym3$DO_IMPLICATIONS_RECURSIVE ), sentence_$1, ONE_INTEGER ) );
          }
          finally
          {
            control_vars.$within_ask$.rebind( _prev_bind_0_$2, thread );
          }
          result = el_utilities.make_disjunction( ConsesLow.list( disjunct_1, el_utilities.funcall_formula_arg( Symbols.symbol_function( $sym3$DO_IMPLICATIONS_RECURSIVE ), sentence_$1, TWO_INTEGER ) ) );
        }
        finally
        {
          $innermost_implication$.rebind( _prev_bind_0, thread );
        }
      }
      else if( NIL != el_utilities.el_implication_p( sentence_$1 ) )
      {
        SubLObject disjunct_1 = NIL;
        final SubLObject _prev_bind_0 = $innermost_implication$.currentBinding( thread );
        try
        {
          $innermost_implication$.bind( sentence_$1, thread );
          final SubLObject _prev_bind_0_$3 = at_vars.$within_disjunctionP$.currentBinding( thread );
          final SubLObject _prev_bind_2 = at_vars.$within_negated_disjunctionP$.currentBinding( thread );
          final SubLObject _prev_bind_3 = czer_vars.$within_negationP$.currentBinding( thread );
          try
          {
            at_vars.$within_disjunctionP$.bind( T, thread );
            at_vars.$within_negated_disjunctionP$.bind( czer_vars.$within_negationP$.getDynamicValue( thread ), thread );
            czer_vars.$within_negationP$.bind( makeBoolean( NIL == czer_vars.$within_negationP$.getDynamicValue( thread ) ), thread );
            disjunct_1 = el_utilities.make_negation( el_utilities.funcall_formula_arg( Symbols.symbol_function( $sym3$DO_IMPLICATIONS_RECURSIVE ), sentence_$1, ONE_INTEGER ) );
          }
          finally
          {
            czer_vars.$within_negationP$.rebind( _prev_bind_3, thread );
            at_vars.$within_negated_disjunctionP$.rebind( _prev_bind_2, thread );
            at_vars.$within_disjunctionP$.rebind( _prev_bind_0_$3, thread );
          }
          result = el_utilities.make_disjunction( ConsesLow.list( disjunct_1, el_utilities.funcall_formula_arg( Symbols.symbol_function( $sym3$DO_IMPLICATIONS_RECURSIVE ), sentence_$1, TWO_INTEGER ) ) );
        }
        finally
        {
          $innermost_implication$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        result = el_utilities.pass_through_if_logical_op_or_quantified( Symbols.symbol_function( $sym3$DO_IMPLICATIONS_RECURSIVE ), sentence_$1 );
      }
      if( NIL != seqvar )
      {
        return el_utilities.nadd_sequence_var_to_end( seqvar, result );
      }
      return result;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4779L)
  public static SubLObject eliminate_existential_with_var_only_in_antecedentP(final SubLObject existential, final SubLObject innermost_implication, final SubLObject outermost_implication)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $eliminate_existential_with_var_only_in_antecedentP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( innermost_implication.eql( outermost_implication ) && NIL != misc_utilities.initialized_p( innermost_implication ) && NIL != el_utilities.el_existential_p( existential ) && NIL == el_utilities.el_abnormal_p(
        cycl_utilities.formula_arg2( outermost_implication, UNPROVIDED ) ) )
    {
      final SubLObject var = el_utilities.quantified_var( existential );
      return Types.sublisp_null( cycl_utilities.expression_find( var, cycl_utilities.formula_arg2( innermost_implication, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5412L)
  public static SubLObject do_negations(final SubLObject sentence)
  {
    return do_negations_destructive( el_utilities.copy_formula( sentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5815L)
  public static SubLObject do_negations_destructive(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject seqvar = el_utilities.sequence_var( sentence, UNPROVIDED );
    final SubLObject sentence_$4 = ( NIL != seqvar ) ? el_utilities.strip_sequence_var( sentence ) : sentence;
    SubLObject result = NIL;
    if( NIL != czer_utilities.encapsulate_formulaP( sentence_$4 ) )
    {
      result = czer_utilities.encapsulate_formula( sentence_$4, UNPROVIDED );
    }
    else if( NIL == el_utilities.el_formula_p( sentence_$4 ) )
    {
      result = sentence_$4;
    }
    else if( NIL != czer_utilities.true_negated_varP( sentence_$4, UNPROVIDED ) )
    {
      result = lift_negation( sentence_$4 );
    }
    else if( NIL != czer_utilities.true_negated_formulaP( sentence_$4 ) )
    {
      if( NIL != czer_utilities.within_disjunctionP() )
      {
        result = lift_negation( sentence_$4 );
      }
      else
      {
        final SubLObject _prev_bind_0 = czer_vars.$encapsulate_var_formulaP$.currentBinding( thread );
        final SubLObject _prev_bind_2 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding( thread );
        try
        {
          czer_vars.$encapsulate_var_formulaP$.bind( NIL, thread );
          czer_vars.$encapsulate_intensional_formulaP$.bind( NIL, thread );
          result = el_utilities.make_unary_formula( cycl_utilities.formula_operator( sentence_$4 ), el_utilities.funcall_formula_arg( Symbols.symbol_function( $sym4$DO_NEGATIONS_DESTRUCTIVE ), sentence_$4,
              ONE_INTEGER ) );
        }
        finally
        {
          czer_vars.$encapsulate_intensional_formulaP$.rebind( _prev_bind_2, thread );
          czer_vars.$encapsulate_var_formulaP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else if( NIL != el_utilities.el_implication_p( sentence_$4 ) )
    {
      result = do_negations_destructive( do_implications( sentence_$4 ) );
    }
    else if( NIL != el_utilities.el_negation_p( sentence_$4 ) )
    {
      if( NIL != cycl_utilities.opaque_argP( sentence_$4, ONE_INTEGER ) )
      {
        result = sentence_$4;
      }
      else
      {
        SubLObject new_sentence = NIL;
        final SubLObject _prev_bind_3 = czer_vars.$within_negationP$.currentBinding( thread );
        try
        {
          czer_vars.$within_negationP$.bind( makeBoolean( NIL == czer_vars.$within_negationP$.getDynamicValue( thread ) ), thread );
          new_sentence = negation_in( sentence_$4 );
        }
        finally
        {
          czer_vars.$within_negationP$.rebind( _prev_bind_3, thread );
        }
        if( NIL != el_utilities.el_negation_p( new_sentence ) )
        {
          result = new_sentence;
        }
        else
        {
          result = do_negations_destructive( new_sentence );
        }
      }
    }
    else
    {
      result = el_utilities.pass_through_if_logical_op_or_quantified( Symbols.symbol_function( $sym4$DO_NEGATIONS_DESTRUCTIVE ), sentence_$4 );
    }
    if( NIL != seqvar )
    {
      return el_utilities.nadd_sequence_var_to_end( seqvar, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7665L)
  public static SubLObject negate_formula(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( sentence.eql( $const6$True ) )
    {
      return $const7$False;
    }
    if( sentence.eql( $const7$False ) )
    {
      return $const6$True;
    }
    if( NIL != czer_utilities.encapsulate_formulaP( sentence ) )
    {
      return negate_encapsulate_sentence( sentence );
    }
    if( NIL != el_utilities.el_conjunction_p( sentence ) )
    {
      return negate_conjunction( sentence );
    }
    if( NIL != el_utilities.el_disjunction_p( sentence ) )
    {
      return negate_disjunction_destructive( sentence );
    }
    if( NIL != el_utilities.el_negation_p( sentence ) )
    {
      SubLObject result = NIL;
      final SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding( thread );
      try
      {
        czer_vars.$within_negationP$.bind( makeBoolean( NIL == czer_vars.$within_negationP$.getDynamicValue( thread ) ), thread );
        result = negation_in( negate_negation( sentence ) );
      }
      finally
      {
        czer_vars.$within_negationP$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    if( NIL != el_utilities.cycl_universal_p( sentence ) )
    {
      return negate_universal( sentence );
    }
    if( NIL != el_utilities.el_existential_p( sentence ) )
    {
      return negate_existential( sentence );
    }
    if( NIL != el_utilities.el_existential_min_p( sentence ) )
    {
      return negate_existential_min( sentence );
    }
    if( NIL != el_utilities.el_existential_max_p( sentence ) )
    {
      return negate_existential_max( sentence );
    }
    if( NIL != el_utilities.el_existential_exact_p( sentence ) )
    {
      return negate_existential_exact( sentence );
    }
    if( NIL != czer_utilities.true_negated_varP( sentence, UNPROVIDED ) )
    {
      return lift_negation( sentence );
    }
    if( NIL != czer_utilities.true_negated_formulaP( sentence ) )
    {
      return negate_true_sentence( sentence );
    }
    if( NIL != el_utilities.el_implication_p( sentence ) )
    {
      return uncanonicalizer.implications_in( do_negations_destructive( do_implications( cycl_utilities.negate( sentence ) ) ) );
    }
    return el_utilities.make_negation( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10088L)
  public static SubLObject negation_in(final SubLObject sentence)
  {
    if( NIL == el_utilities.el_negation_p( sentence ) )
    {
      return sentence;
    }
    return negate_formula( cycl_utilities.formula_arg1( sentence, $kw8$REGULARIZE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11505L)
  public static SubLObject negate_quantified_sentence(final SubLObject sentence)
  {
    if( NIL != el_utilities.cycl_universal_p( sentence ) )
    {
      return negate_universal( sentence );
    }
    if( NIL != el_utilities.el_existential_p( sentence ) )
    {
      return negate_existential( sentence );
    }
    if( NIL != el_utilities.el_existential_min_p( sentence ) )
    {
      return negate_existential_min( sentence );
    }
    if( NIL != el_utilities.el_existential_max_p( sentence ) )
    {
      return negate_existential_max( sentence );
    }
    if( NIL != el_utilities.el_existential_exact_p( sentence ) )
    {
      return negate_existential_exact( sentence );
    }
    el_utilities.el_error( FOUR_INTEGER, $str9$_s_is_not_a_quantified_sentence, sentence, UNPROVIDED, UNPROVIDED );
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12064L)
  public static SubLObject negate_atomic(final SubLObject sentence)
  {
    return el_utilities.make_negation( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12250L)
  public static SubLObject negate_negation(final SubLObject negation)
  {
    return cycl_utilities.formula_arg1( negation, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12463L)
  public static SubLObject negate_negations(final SubLObject negations)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym10$NEGATE_NEGATION ), negations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12645L)
  public static SubLObject negate_conjunction(final SubLObject conjunction)
  {
    return simplifier.ndisjoin( Mapping.mapcar( Symbols.symbol_function( $sym11$NEGATE_FORMULA ), cycl_utilities.formula_args( conjunction, UNPROVIDED ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12984L)
  public static SubLObject negate_conjunction_destructive(final SubLObject conjunction)
  {
    return simplifier.ndisjoin( list_utilities.nmapcar( Symbols.symbol_function( $sym11$NEGATE_FORMULA ), cycl_utilities.formula_args( conjunction, UNPROVIDED ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13175L)
  public static SubLObject negate_disjunction_destructive(final SubLObject disjunction)
  {
    return simplifier.nconjoin( list_utilities.nmapcar( Symbols.symbol_function( $sym11$NEGATE_FORMULA ), cycl_utilities.formula_args( disjunction, UNPROVIDED ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13492L)
  public static SubLObject negate_universal(final SubLObject universal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject quantifier = el_utilities.unmake_binary_formula( universal );
    final SubLObject variable = thread.secondMultipleValue();
    final SubLObject subform = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return el_utilities.make_existential( variable, negate_formula( subform ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13909L)
  public static SubLObject negate_existential(final SubLObject existential)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject quantifier = el_utilities.unmake_binary_formula( existential );
    final SubLObject variable = thread.secondMultipleValue();
    final SubLObject subform = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return el_utilities.make_universal( variable, negate_formula( subform ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14334L)
  public static SubLObject negate_existential_min(final SubLObject existential_min)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject quantifier = el_utilities.unmake_ternary_formula( existential_min );
    final SubLObject number = thread.secondMultipleValue();
    final SubLObject variable = thread.thirdMultipleValue();
    final SubLObject subform = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( !number.isInteger() )
    {
      return el_utilities.make_existential_max( el_utilities.make_binary_formula( $const12$DifferenceFn, number, ONE_INTEGER ), variable, subform );
    }
    if( number.numE( ONE_INTEGER ) )
    {
      return el_utilities.make_universal( variable, negate_formula( subform ) );
    }
    if( number.numG( ONE_INTEGER ) )
    {
      return el_utilities.make_existential_max( Numbers.subtract( number, ONE_INTEGER ), variable, subform );
    }
    el_utilities.el_error( FOUR_INTEGER, $str13$_s_contained_the_invalid_bound__D, existential_min, number, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15179L)
  public static SubLObject negate_existential_max(final SubLObject existential_max)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject quantifier = el_utilities.unmake_ternary_formula( existential_max );
    final SubLObject number = thread.secondMultipleValue();
    final SubLObject variable = thread.thirdMultipleValue();
    final SubLObject subform = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( !number.isInteger() )
    {
      return el_utilities.make_existential_min( el_utilities.make_binary_formula( $const14$PlusFn, number, ONE_INTEGER ), variable, subform );
    }
    if( number.numG( ZERO_INTEGER ) )
    {
      return el_utilities.make_existential_min( Numbers.add( number, ONE_INTEGER ), variable, subform );
    }
    el_utilities.el_error( FOUR_INTEGER, $str13$_s_contained_the_invalid_bound__D, existential_max, number, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15936L)
  public static SubLObject negate_existential_exact(final SubLObject existential_exact)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject quantifier = el_utilities.unmake_ternary_formula( existential_exact );
    final SubLObject number = thread.secondMultipleValue();
    final SubLObject variable = thread.thirdMultipleValue();
    final SubLObject subform = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( !number.isInteger() )
    {
      return simplifier.ndisjoin( ConsesLow.list( el_utilities.make_existential_min( el_utilities.make_binary_formula( $const14$PlusFn, number, ONE_INTEGER ), variable, subform ), el_utilities.make_existential_max(
          el_utilities.make_binary_formula( $const12$DifferenceFn, number, ONE_INTEGER ), variable, subform ) ), UNPROVIDED );
    }
    if( number.numE( ONE_INTEGER ) )
    {
      return simplifier.ndisjoin( ConsesLow.list( el_utilities.make_universal( variable, negate_formula( subform ) ), el_utilities.make_existential_min( TWO_INTEGER, variable, subform ) ), UNPROVIDED );
    }
    if( number.numG( ONE_INTEGER ) )
    {
      return simplifier.ndisjoin( ConsesLow.list( el_utilities.make_existential_min( Numbers.add( number, ONE_INTEGER ), variable, subform ), el_utilities.make_existential_max( Numbers.subtract( number, ONE_INTEGER ),
          variable, subform ) ), UNPROVIDED );
    }
    el_utilities.el_error( FOUR_INTEGER, $str13$_s_contained_the_invalid_bound__D, existential_exact, number, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17137L)
  public static SubLObject negate_true_sentence(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sub_sentence = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$within_negationP$.currentBinding( thread );
    try
    {
      czer_vars.$encapsulate_intensional_formulaP$.bind( NIL, thread );
      czer_vars.$within_negationP$.bind( makeBoolean( NIL == czer_vars.$within_negationP$.getDynamicValue( thread ) ), thread );
      sub_sentence = do_negations_destructive( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ) );
    }
    finally
    {
      czer_vars.$within_negationP$.rebind( _prev_bind_2, thread );
      czer_vars.$encapsulate_intensional_formulaP$.rebind( _prev_bind_0, thread );
    }
    return negate_atomic( el_utilities.make_unary_formula( cycl_utilities.sentence_arg0( sentence ), sub_sentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17507L)
  public static SubLObject negate_encapsulate_sentence(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$within_ask$.getDynamicValue( thread ) && NIL != el_utilities.possibly_el_quantified_sentence_p( sentence ) )
    {
      return czer_utilities.make_intensional_lit( negate_quantified_sentence( sentence ) );
    }
    return negate_atomic( czer_utilities.encapsulate_formula( sentence, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17833L)
  public static SubLObject lift_negation(final SubLObject sentence)
  {
    if( NIL == el_utilities.el_unary_formula_p( sentence ) )
    {
      return sentence;
    }
    final SubLObject operator = cycl_utilities.sentence_arg0( sentence );
    final SubLObject sub_sentence = cycl_utilities.sentence_arg1( sentence, UNPROVIDED );
    if( NIL != czer_utilities.true_negated_varP( sentence, UNPROVIDED ) )
    {
      final SubLObject unnegated_arg = cycl_utilities.sentence_arg1( sub_sentence, UNPROVIDED );
      return negate_atomic( el_utilities.make_unary_formula( operator, unnegated_arg ) );
    }
    if( NIL != el_utilities.el_negation_p( sub_sentence ) )
    {
      final SubLObject unnegated_arg = do_negations_destructive( cycl_utilities.sentence_arg1( sub_sentence, UNPROVIDED ) );
      return negate_atomic( el_utilities.make_unary_formula( operator, unnegated_arg ) );
    }
    if( NIL != el_utilities.el_quantified_negation_p( sub_sentence ) )
    {
      final SubLObject unnegated_arg = negate_quantified_sentence( sub_sentence );
      return negate_atomic( el_utilities.make_unary_formula( operator, unnegated_arg ) );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18691L)
  public static SubLObject czer_explicitify_implicit_quantifiers(final SubLObject sentence)
  {
    if( NIL != assume_free_vars_are_existentially_boundP() )
    {
      return czer_explicitify_implicit_existential_quantifiers( sentence );
    }
    return czer_explicitify_implicit_universal_quantifiers( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19095L)
  public static SubLObject czer_explicitify_implicit_universal_quantifiers(SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var;
    final SubLObject free_vars = cdolist_list_var = el_utilities.sentence_free_variables( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sentence = el_utilities.make_universal( var, sentence );
      if( $newly_introduced_universals$.getDynamicValue( thread ).isList() )
      {
        $newly_introduced_universals$.setDynamicValue( ConsesLow.cons( var, $newly_introduced_universals$.getDynamicValue( thread ) ), thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19649L)
  public static SubLObject czer_explicitify_implicit_existential_quantifiers(final SubLObject sentence)
  {
    return el_utilities.explicitify_implicit_existential_quantifiers( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19903L)
  public static SubLObject assume_free_vars_are_existentially_boundP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return czer_vars.$assume_free_vars_are_existentially_boundP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20087L)
  public static SubLObject standardize_sentence_variables(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != el_utilities.el_formula_p( sentence ) : sentence;
    SubLObject v_return = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_3 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$canonicalize_variablesP$.bind( NIL, thread );
      czer_vars.$el_symbol_suffix_table$.bind( ( NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue( thread ) ) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue( thread )
          : Hashtables.make_hash_table( $int16$32, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( ( NIL != czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) ) ? czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) : NIL, thread );
      v_return = standardize_variables( conses_high.copy_tree( sentence ) );
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_3, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_2, thread );
      czer_vars.$canonicalize_variablesP$.rebind( _prev_bind_0, thread );
    }
    return v_return;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20789L)
  public static SubLObject standardize_variables(final SubLObject sentence)
  {
    if( NIL != el_utilities.groundP( sentence, UNPROVIDED ) )
    {
      return sentence;
    }
    final SubLObject seqvar = el_utilities.sequence_var( sentence, UNPROVIDED );
    final SubLObject sentence_$5 = ( NIL != seqvar ) ? el_utilities.strip_sequence_var( sentence ) : sentence;
    SubLObject result = NIL;
    czer_main.initialize_symbol_suffix_table( sentence_$5 );
    result = recursively_standardize_variables( sentence_$5 );
    result = czer_main.el_nununiquify_vars_int( result, T, UNPROVIDED );
    if( NIL != seqvar )
    {
      return el_utilities.nadd_sequence_var_to_end( seqvar, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21455L)
  public static SubLObject recursively_standardize_variables(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == el_utilities.el_formula_p( sentence ) )
    {
      return sentence;
    }
    if( NIL != cycl_grammar.fast_escape_quote_term_p( sentence ) || NIL != cycl_grammar.fast_quasi_quote_term_p( sentence ) )
    {
      SubLObject standardized = NIL;
      final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding( thread );
      try
      {
        czer_vars.$inside_quote$.bind( NIL, thread );
        standardized = el_utilities.make_unary_formula( cycl_utilities.formula_arg0( sentence ), recursively_standardize_variables( cycl_utilities.formula_arg1( sentence, UNPROVIDED ) ) );
      }
      finally
      {
        czer_vars.$inside_quote$.rebind( _prev_bind_0, thread );
      }
      return standardized;
    }
    if( NIL != cycl_grammar.fast_quote_term_p( sentence ) )
    {
      if( NIL == list_utilities.tree_find_if( $sym17$CYC_VAR_, sentence, UNPROVIDED ) )
      {
        return sentence;
      }
      SubLObject standardized = NIL;
      final SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding( thread );
      try
      {
        czer_vars.$inside_quote$.bind( T, thread );
        standardized = el_utilities.make_unary_formula( $const18$Quote, recursively_standardize_variables( cycl_utilities.formula_arg1( sentence, UNPROVIDED ) ) );
      }
      finally
      {
        czer_vars.$inside_quote$.rebind( _prev_bind_0, thread );
      }
      return standardized;
    }
    else
    {
      if( NIL != el_utilities.possibly_el_regularly_quantified_sentence_p( sentence ) )
      {
        thread.resetMultipleValues();
        final SubLObject quantifier = el_utilities.unmake_binary_formula( sentence );
        final SubLObject old_var = thread.secondMultipleValue();
        final SubLObject subform = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject standardized_subform = el_utilities.funcall_formula_arg( $sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence, TWO_INTEGER );
        final SubLObject new_var = el_uniquify_standardize( old_var );
        final SubLObject replace_old_var = el_var_without_quote( old_var );
        final SubLObject replace_new_var = el_var_without_quote( new_var );
        SubLObject standardized2 = NIL;
        remember_variable_rename( replace_old_var, replace_new_var );
        final SubLObject _prev_bind_2 = czer_vars.$canonicalize_variablesP$.currentBinding( thread );
        try
        {
          czer_vars.$canonicalize_variablesP$.bind( NIL, thread );
          standardized2 = el_utilities.make_binary_formula( quantifier, new_var, cycl_utilities.expression_nsubst_free_vars( replace_new_var, replace_old_var, standardized_subform, UNPROVIDED ) );
        }
        finally
        {
          czer_vars.$canonicalize_variablesP$.rebind( _prev_bind_2, thread );
        }
        return standardized2;
      }
      if( NIL != el_utilities.el_bounded_existential_p( sentence ) )
      {
        thread.resetMultipleValues();
        final SubLObject quantifier = el_utilities.unmake_ternary_formula( sentence );
        final SubLObject bound = thread.secondMultipleValue();
        final SubLObject old_var2 = thread.thirdMultipleValue();
        final SubLObject subform2 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject standardized_subform2 = el_utilities.funcall_formula_arg( $sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence, THREE_INTEGER );
        final SubLObject new_var2 = el_uniquify_standardize( old_var2 );
        final SubLObject replace_old_var2 = el_var_without_quote( old_var2 );
        final SubLObject replace_new_var2 = el_var_without_quote( new_var2 );
        SubLObject standardized3 = NIL;
        remember_variable_rename( replace_old_var2, replace_new_var2 );
        final SubLObject _prev_bind_3 = czer_vars.$canonicalize_variablesP$.currentBinding( thread );
        try
        {
          czer_vars.$canonicalize_variablesP$.bind( NIL, thread );
          standardized3 = el_utilities.make_ternary_formula( quantifier, bound, new_var2, cycl_utilities.expression_nsubst_free_vars( replace_new_var2, replace_old_var2, standardized_subform2, UNPROVIDED ) );
        }
        finally
        {
          czer_vars.$canonicalize_variablesP$.rebind( _prev_bind_3, thread );
        }
        return standardized3;
      }
      if( NIL != czer_trampolines.czer_scoping_formulaP( sentence ) )
      {
        final SubLObject scoped_vars = czer_trampolines.czer_scoped_vars( sentence );
        final SubLObject unique_vars = Mapping.mapcar( $sym20$EL_UNIQUIFY_STANDARDIZE, scoped_vars );
        final SubLObject scoping_args = czer_trampolines.czer_scoping_args( cycl_utilities.formula_operator( sentence ) );
        final SubLObject replace_scoped_vars = Mapping.mapcar( $sym21$EL_VAR_WITHOUT_QUOTE, scoped_vars );
        final SubLObject replace_unique_vars = Mapping.mapcar( $sym21$EL_VAR_WITHOUT_QUOTE, unique_vars );
        SubLObject new_sentence = NIL;
        final SubLObject terms = cycl_utilities.formula_terms( sentence, $kw22$IGNORE );
        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        arg = list_var.first();
        for( argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X( argnum ) )
        {
          if( NIL != subl_promotions.memberP( argnum, scoping_args, UNPROVIDED, UNPROVIDED ) )
          {
            new_sentence = ConsesLow.cons( arg, new_sentence );
          }
          else
          {
            new_sentence = ConsesLow.cons( el_utilities.funcall_formula_arg( $sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence, argnum ), new_sentence );
          }
        }
        remember_variables_rename( replace_scoped_vars, replace_unique_vars );
        return Sequences.nreverse( cycl_utilities.expression_sublis( conses_high.pairlis( replace_scoped_vars, replace_unique_vars, UNPROVIDED ), new_sentence, UNPROVIDED, UNPROVIDED ) );
      }
      return el_utilities.pass_through_if_relation_syntax( $sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25728L)
  public static SubLObject el_uniquify_standardize(final SubLObject var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_vars.$inside_quote$.getDynamicValue( thread ) )
    {
      return el_uniquify( var );
    }
    if( NIL != cycl_grammar.fast_escape_quote_term_p( var ) || NIL != cycl_grammar.fast_quasi_quote_term_p( var ) )
    {
      return el_utilities.make_unary_formula( cycl_utilities.formula_arg0( var ), el_uniquify( cycl_utilities.formula_arg1( var, UNPROVIDED ) ) );
    }
    return var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26017L)
  public static SubLObject el_var_without_quote(final SubLObject var)
  {
    if( NIL != cycl_grammar.fast_escape_quote_term_p( var ) || NIL != cycl_grammar.fast_quasi_quote_term_p( var ) )
    {
      return cycl_utilities.formula_arg1( var, UNPROVIDED );
    }
    return var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26191L)
  public static SubLObject remember_variable_rename(final SubLObject old_var, final SubLObject new_var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    czer_vars.$standardize_variables_memory$.setDynamicValue( ConsesLow.cons( ConsesLow.cons( old_var, new_var ), czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26995L)
  public static SubLObject remember_variables_rename(final SubLObject old_vars, final SubLObject new_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    czer_vars.$standardize_variables_memory$.setDynamicValue( ConsesLow.append( conses_high.pairlis( old_vars, new_vars, UNPROVIDED ), czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27316L)
  public static SubLObject el_uniquify(final SubLObject var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject integer = czer_main.extract_name_uniquifying_post_hyphen_integer( var );
    SubLObject symbol = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == symbol )
    {
      symbol = var;
    }
    if( NIL == integer )
    {
      integer = ZERO_INTEGER;
    }
    SubLObject n = Hashtables.gethash( symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue( thread ), UNPROVIDED );
    if( NIL == n )
    {
      n = MINUS_ONE_INTEGER;
    }
    n = Numbers.max( n, integer );
    n = Numbers.add( n, ONE_INTEGER );
    Hashtables.sethash( symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue( thread ), n );
    final SubLObject unique_string = n.isZero() ? format_nil.format_nil_a( cycl_variables.variable_name( symbol ) )
        : Sequences.cconcatenate( format_nil.format_nil_a_no_copy( cycl_variables.variable_name( symbol ) ), new SubLObject[]
        { $str23$_, format_nil.format_nil_a_no_copy( string_utilities.object_to_string( n ) )
        } );
    if( NIL != cycl_variables.keyword_varP( symbol ) )
    {
      return cycl_variables.make_keyword_var( unique_string );
    }
    return cycl_variables.make_el_var( unique_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28286L)
  public static SubLObject existentials_out(SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$turn_existentials_into_skolemsP$.getDynamicValue( thread ) )
    {
      if( NIL == list_utilities.tree_find_if( $sym24$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P, sentence, UNPROVIDED ) )
      {
        return sentence;
      }
      SubLObject error = NIL;
      try
      {
        thread.throwStack.push( $kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE );
        try
        {
          thread.throwStack.push( $kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE );
          try
          {
            thread.throwStack.push( $kw27$QUANTIFIED_SEQUENCE_VARIABLE );
            final SubLObject _prev_bind_0 = $quantifier_info_list$.currentBinding( thread );
            try
            {
              $quantifier_info_list$.bind( NIL, thread );
              sentence = existentials_out_int( sentence );
            }
            finally
            {
              $quantifier_info_list$.rebind( _prev_bind_0, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            error = Errors.handleThrowable( ccatch_env_var, $kw27$QUANTIFIED_SEQUENCE_VARIABLE );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          error = Errors.handleThrowable( ccatch_env_var, $kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error = Errors.handleThrowable( ccatch_env_var, $kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error )
      {
        if( NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue( thread ) )
        {
          wff.note_wff_violation( error );
        }
        return NIL;
      }
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28987L)
  public static SubLObject existentials_out_int(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = sentence;
    final SubLObject _prev_bind_0 = $quantifier_info_list$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$noting_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_vars.$noting_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_vars.$accumulating_wff_violationsP$.currentBinding( thread );
    try
    {
      $quantifier_info_list$.bind( $quantifier_info_list$.getDynamicValue( thread ), thread );
      at_vars.$noting_at_violationsP$.bind( NIL, thread );
      at_vars.$accumulating_at_violationsP$.bind( NIL, thread );
      wff_vars.$noting_wff_violationsP$.bind( NIL, thread );
      wff_vars.$accumulating_wff_violationsP$.bind( NIL, thread );
      if( NIL != el_utilities.cycl_universal_p( sentence ) )
      {
        thread.resetMultipleValues();
        final SubLObject quantifier = el_utilities.unmake_binary_formula( sentence );
        final SubLObject var = thread.secondMultipleValue();
        final SubLObject subform = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        $quantifier_info_list$.setDynamicValue( ConsesLow.cons( ConsesLow.list( quantifier, NIL, var, el_utilities.sentence_free_term_variables( subform, UNPROVIDED, UNPROVIDED ), el_utilities
            .sentence_free_sequence_variables( subform, UNPROVIDED, UNPROVIDED ) ), $quantifier_info_list$.getDynamicValue( thread ) ), thread );
        result = el_utilities.make_universal( var, el_utilities.funcall_formula_arg( Symbols.symbol_function( $sym28$EXISTENTIALS_OUT_INT ), sentence, TWO_INTEGER ) );
      }
      else if( NIL != el_utilities.el_existential_p( sentence ) )
      {
        thread.resetMultipleValues();
        final SubLObject quantifier = el_utilities.unmake_binary_formula( sentence );
        final SubLObject var = thread.secondMultipleValue();
        final SubLObject subform = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        $quantifier_info_list$.setDynamicValue( ConsesLow.cons( ConsesLow.list( quantifier, NIL, var, el_utilities.sentence_free_term_variables( subform, UNPROVIDED, UNPROVIDED ), el_utilities
            .sentence_free_sequence_variables( subform, UNPROVIDED, UNPROVIDED ) ), $quantifier_info_list$.getDynamicValue( thread ) ), thread );
        result = el_utilities.funcall_formula_arg( Symbols.symbol_function( $sym28$EXISTENTIALS_OUT_INT ), sentence, TWO_INTEGER );
      }
      else if( NIL != el_utilities.el_bounded_existential_p( sentence ) )
      {
        thread.resetMultipleValues();
        final SubLObject quantifier = el_utilities.unmake_ternary_formula( sentence );
        final SubLObject num = thread.secondMultipleValue();
        final SubLObject var2 = thread.thirdMultipleValue();
        final SubLObject subform2 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        $quantifier_info_list$.setDynamicValue( ConsesLow.cons( ConsesLow.list( quantifier, num, var2, el_utilities.sentence_free_term_variables( subform2, UNPROVIDED, UNPROVIDED ), el_utilities
            .sentence_free_sequence_variables( subform2, UNPROVIDED, UNPROVIDED ) ), $quantifier_info_list$.getDynamicValue( thread ) ), thread );
        result = el_utilities.funcall_formula_arg( Symbols.symbol_function( $sym28$EXISTENTIALS_OUT_INT ), sentence, THREE_INTEGER );
      }
      else if( NIL != el_utilities.el_logical_operator_formula_p( sentence ) )
      {
        result = el_utilities.pass_through_if_logical_op( Symbols.symbol_function( $sym28$EXISTENTIALS_OUT_INT ), sentence );
      }
      else if( NIL != control_vars.within_askP() && NIL != el_utilities.ist_sentence_p( sentence, UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject ist = el_utilities.unmake_binary_formula( sentence );
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject subsentence = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject canonical_subsentence = existentials_out_int( subsentence );
        result = skolemize_atomic_sentence( el_utilities.make_ist_sentence( mt, canonical_subsentence ), $quantifier_info_list$.getDynamicValue( thread ) );
      }
      else if( NIL != cycl_grammar.cycl_atomic_sentence_p( sentence ) )
      {
        result = skolemize_atomic_sentence( sentence, $quantifier_info_list$.getDynamicValue( thread ) );
      }
      else if( NIL != el_grammar.el_non_formula_sentence_p( sentence ) )
      {
        result = skolemize_atomic_sentence( sentence, $quantifier_info_list$.getDynamicValue( thread ) );
      }
      else
      {
        el_utilities.el_error( FOUR_INTEGER, $str29$Unexpected_sentence_type_in_exist, sentence, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      wff_vars.$accumulating_wff_violationsP$.rebind( _prev_bind_5, thread );
      wff_vars.$noting_wff_violationsP$.rebind( _prev_bind_4, thread );
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_3, thread );
      at_vars.$noting_at_violationsP$.rebind( _prev_bind_2, thread );
      $quantifier_info_list$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32025L)
  public static SubLObject skolemize_atomic_sentence(final SubLObject sentence, final SubLObject quantifier_info_list)
  {
    SubLObject result = sentence;
    SubLObject quantifier_info_list_in_scope = NIL;
    SubLObject curr_quant_info = NIL;
    SubLObject curr_quant = NIL;
    SubLObject curr_num = NIL;
    SubLObject curr_var = NIL;
    SubLObject curr_free_term_vars = NIL;
    SubLObject curr_free_sequence_vars = NIL;
    quantifier_info_list_in_scope = quantifier_info_list;
    curr_quant_info = quantifier_info_list_in_scope.first();
    curr_quant = curr_quant_info.first();
    curr_num = conses_high.second( curr_quant_info );
    curr_var = conses_high.third( curr_quant_info );
    curr_free_term_vars = conses_high.fourth( curr_quant_info );
    curr_free_sequence_vars = conses_high.fifth( curr_quant_info );
    while ( NIL != quantifier_info_list_in_scope)
    {
      if( NIL != el_utilities.cyc_const_general_existential_operator_p( curr_quant ) )
      {
        result = skolemize_variable( result, curr_quant, curr_num, curr_var, curr_free_term_vars, curr_free_sequence_vars, quantifier_info_list_in_scope );
      }
      quantifier_info_list_in_scope = quantifier_info_list_in_scope.rest();
      curr_quant_info = quantifier_info_list_in_scope.first();
      curr_quant = curr_quant_info.first();
      curr_num = conses_high.second( curr_quant_info );
      curr_var = conses_high.third( curr_quant_info );
      curr_free_term_vars = conses_high.fourth( curr_quant_info );
      curr_free_sequence_vars = conses_high.fifth( curr_quant_info );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34096L)
  public static SubLObject skolemize_variable(final SubLObject sentence, final SubLObject curr_quant, final SubLObject curr_num, final SubLObject curr_var, final SubLObject curr_free_term_vars,
      final SubLObject curr_free_sequence_vars, final SubLObject quantifier_info_list_in_scope)
  {
    if( NIL != drop_all_existentialsP() )
    {
      return sentence;
    }
    if( NIL != el_utilities.occurs_as_sequence_variableP( curr_var, sentence ) && NIL != forbid_quantified_sequence_variablesP() )
    {
      Dynamic.sublisp_throw( $kw27$QUANTIFIED_SEQUENCE_VARIABLE, ConsesLow.list( $kw27$QUANTIFIED_SEQUENCE_VARIABLE, curr_var, sentence ) );
    }
    else
    {
      SubLObject curr_dependent_term_vars = NIL;
      SubLObject curr_dependent_sequence_vars = NIL;
      SubLObject cdolist_list_var = quantifier_info_list_in_scope;
      SubLObject quant_info = NIL;
      quant_info = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject quant = quant_info.first();
        final SubLObject var = conses_high.third( quant_info );
        final SubLObject free_term_vars = conses_high.fourth( quant_info );
        final SubLObject free_sequence_vars = conses_high.fifth( quant_info );
        if( $const30$forAll.eql( quant ) )
        {
          final SubLObject pcase_var;
          final SubLObject var_status = pcase_var = determine_skolem_var_status( var, curr_free_term_vars, free_term_vars, curr_free_sequence_vars, free_sequence_vars );
          if( !pcase_var.eql( $kw31$NEITHER ) )
          {
            if( pcase_var.eql( $kw32$TERM ) )
            {
              curr_dependent_term_vars = ConsesLow.cons( var, curr_dependent_term_vars );
            }
            else if( pcase_var.eql( $kw33$SEQ ) )
            {
              curr_dependent_sequence_vars = ConsesLow.cons( var, curr_dependent_sequence_vars );
            }
            else if( pcase_var.eql( $kw34$BOTH ) )
            {
              Dynamic.sublisp_throw( $kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, ConsesLow.list( $kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE, var, curr_var, sentence ) );
            }
            else if( pcase_var.eql( $kw35$UNDETERMINED ) )
            {
              el_utilities.el_error( ONE_INTEGER, $str36$Skolemizer_failed_to_classify_var, var, sentence, UNPROVIDED );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        quant_info = cdolist_list_var.first();
      }
      if( Sequences.length( curr_dependent_sequence_vars ).numG( ONE_INTEGER ) )
      {
        Dynamic.sublisp_throw( $kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, ConsesLow.list( $kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, curr_var, curr_dependent_sequence_vars ) );
      }
      else
      {
        if( NIL != leave_skolem_constants_aloneP() && NIL == curr_dependent_term_vars && NIL == curr_dependent_sequence_vars )
        {
          return sentence;
        }
        return cycl_utilities.expression_nsubst_free_vars( make_skolem_fn_fn( curr_var, curr_dependent_term_vars, curr_quant, curr_num, curr_dependent_sequence_vars.first() ), curr_var, el_utilities.copy_expression(
            sentence ), Symbols.symbol_function( EQUAL ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37494L)
  public static SubLObject determine_skolem_var_status(final SubLObject var, final SubLObject subsent_free_term_vars, final SubLObject free_term_vars_in_scope, final SubLObject subsent_free_seqvars,
      final SubLObject free_seqvars_in_scope)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject var_status = $kw35$UNDETERMINED;
    if( NIL != conses_high.member( var, subsent_free_term_vars, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != subl_promotions.memberP( var, subsent_free_seqvars, UNPROVIDED, UNPROVIDED ) || NIL != conses_high.member( var, free_seqvars_in_scope, UNPROVIDED, UNPROVIDED ) )
      {
        var_status = $kw34$BOTH;
      }
      else
      {
        var_status = $kw32$TERM;
      }
    }
    else if( NIL != conses_high.member( var, subsent_free_seqvars, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != subl_promotions.memberP( var, free_term_vars_in_scope, UNPROVIDED, UNPROVIDED ) )
      {
        var_status = $kw34$BOTH;
      }
      else
      {
        var_status = $kw33$SEQ;
      }
    }
    else if( NIL != czer_vars.$minimal_skolem_arityP$.getDynamicValue( thread ) )
    {
      var_status = $kw31$NEITHER;
    }
    else if( NIL != conses_high.member( var, free_term_vars_in_scope, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != subl_promotions.memberP( var, free_seqvars_in_scope, UNPROVIDED, UNPROVIDED ) )
      {
        var_status = $kw34$BOTH;
      }
      else
      {
        var_status = $kw32$TERM;
      }
    }
    else if( NIL != conses_high.member( var, free_seqvars_in_scope, UNPROVIDED, UNPROVIDED ) )
    {
      var_status = $kw33$SEQ;
    }
    else
    {
      var_status = $kw31$NEITHER;
    }
    return var_status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38979L)
  public static SubLObject make_skolem_fn_fn(final SubLObject var, final SubLObject dependent_term_vars, final SubLObject quant, final SubLObject num, final SubLObject dependent_sequence_var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == dependent_term_vars && NIL == dependent_sequence_var && NIL != czer_vars.$use_skolem_constantsP$.getDynamicValue( thread ) )
    {
      Errors.warn( $str37$skolem_constants_not_yet_supporte );
      return NIL;
    }
    SubLObject result = NIL;
    if( $const38$thereExists.eql( quant ) )
    {
      result = el_utilities.make_ternary_formula( $const39$SkolemFunctionFn, dependent_term_vars, var, dependent_sequence_var );
    }
    else
    {
      if( NIL == kb_control_vars.quant_kb_loaded_p() || NIL == el_utilities.cyc_const_bounded_existential_operator_p( quant ) )
      {
        el_utilities.el_error( FOUR_INTEGER, $str41$make_skolem_fn_fn_doesn_t_know_ho, quant, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      result = el_utilities.make_quaternary_formula( $const40$SkolemFuncNFn, dependent_term_vars, var, dependent_sequence_var, el_math_utilities.quantified_interval( quant, num ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40274L)
  public static SubLObject drop_all_existentialsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( ( NIL != control_vars.$within_ask$.getDynamicValue( thread ) && NIL == czer_vars.$skolemize_during_asksP$.getDynamicValue( thread ) ) || NIL != czer_vars.$drop_all_existentialsP$.getDynamicValue(
        thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41173L)
  public static SubLObject leave_skolem_constants_aloneP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != drop_all_existentialsP() || NIL != czer_vars.$leave_skolem_constants_aloneP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41300L)
  public static SubLObject forbid_quantified_sequence_variablesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( T == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue( thread ) )
    {
      return T;
    }
    if( NIL == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( $kw42$ASSERT_ONLY == czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue( thread ) )
    {
      return control_vars.within_assertP();
    }
    return Errors.error( $str43$Unexpected_value_for__forbid_quan, czer_vars.$forbid_quantified_sequence_variablesP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41713L)
  public static SubLObject universals_out(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.cycl_universal_p( sentence ) )
    {
      final SubLObject result = el_utilities.funcall_formula_arg( $sym44$UNIVERSALS_OUT, sentence, el_utilities.quantified_sub_sentence_argnum( sentence ) );
      if( NIL != czer_vars.$implicitify_universalsP$.getDynamicValue( thread ) )
      {
        return result;
      }
      if( !$newly_introduced_universals$.getDynamicValue( thread ).isList() )
      {
        return result;
      }
      if( NIL != conses_high.member( el_utilities.quantified_var( sentence ), $newly_introduced_universals$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
      {
        return result;
      }
      return el_utilities.make_universal( el_utilities.quantified_var( sentence ), result );
    }
    else
    {
      if( NIL != el_utilities.el_conjunction_p( sentence ) || NIL != el_utilities.el_disjunction_p( sentence ) )
      {
        return el_utilities.pass_through_if_junction( $sym44$UNIVERSALS_OUT, sentence );
      }
      if( NIL != el_utilities.possibly_el_quantified_sentence_p( sentence ) || NIL != el_utilities.el_logical_operator_formula_p( sentence ) )
      {
        return sentence;
      }
      if( NIL != cycl_grammar.cycl_literal_p( sentence ) )
      {
        return sentence;
      }
      if( NIL != el_grammar.el_non_formula_sentence_p( sentence ) )
      {
        return sentence;
      }
      el_utilities.el_error( FOUR_INTEGER, $str45$Got_the_unexpected_sentence__S_in, sentence, UNPROVIDED, UNPROVIDED );
      return sentence;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43139L)
  public static SubLObject disjunctions_in(final SubLObject sentence)
  {
    if( NIL != bad_exponential_disjunctionP( sentence ) )
    {
      return handle_bad_exponential_disjunction( sentence );
    }
    return disjunctions_in_int( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43414L)
  public static SubLObject disjunctions_in_int(SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding( thread );
    try
    {
      at_vars.$noting_at_violationsP$.bind( NIL, thread );
      at_vars.$accumulating_at_violationsP$.bind( NIL, thread );
      wff_vars.$noting_wff_violationsP$.bind( NIL, thread );
      wff_vars.$accumulating_wff_violationsP$.bind( NIL, thread );
      if( NIL != el_utilities.el_conjunction_p( sentence ) )
      {
        result = el_utilities.nmap_formula_args( $sym46$DISJUNCTIONS_IN, sentence, UNPROVIDED );
      }
      else if( NIL != el_utilities.el_disjunction_p( sentence ) )
      {
        if( NIL != cycl_utilities.opaque_argP( sentence, ONE_INTEGER ) )
        {
          result = sentence;
        }
        else
        {
          sentence = el_utilities.nmap_formula_args( $sym46$DISJUNCTIONS_IN, sentence, UNPROVIDED );
          final SubLObject nested_conjunction = first_conjunction( cycl_utilities.formula_args( sentence, UNPROVIDED ) );
          if( NIL != nested_conjunction )
          {
            final SubLObject other_disjuncts = Sequences.delete( nested_conjunction, cycl_utilities.formula_args( sentence, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != other_disjuncts )
            {
              SubLObject new_conjuncts = NIL;
              SubLObject cdolist_list_var;
              final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( nested_conjunction, $kw22$IGNORE );
              SubLObject conjunct = NIL;
              conjunct = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject new_disjuncts = ConsesLow.cons( conjunct, other_disjuncts );
                new_conjuncts = ConsesLow.cons( simplifier.disjoin( new_disjuncts, UNPROVIDED ), new_conjuncts );
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
              }
              result = simplifier.nconjoin( list_utilities.nmapcar( $sym46$DISJUNCTIONS_IN, new_conjuncts ), UNPROVIDED );
            }
            else
            {
              result = nested_conjunction;
            }
          }
          else
          {
            result = sentence;
          }
        }
      }
      else if( NIL != el_utilities.possibly_el_quantified_sentence_p( sentence ) || NIL != el_utilities.el_logical_operator_formula_p( sentence ) )
      {
        result = sentence;
      }
      else if( NIL != el_grammar.el_literal_p( sentence ) )
      {
        result = sentence;
      }
      else if( NIL != el_grammar.el_non_formula_sentence_p( sentence ) )
      {
        result = sentence;
      }
      else
      {
        el_utilities.el_error( FOUR_INTEGER, $str47$Got_the_unexpected_sentence__S_in, sentence, UNPROVIDED, UNPROVIDED );
        result = sentence;
      }
    }
    finally
    {
      wff_vars.$accumulating_wff_violationsP$.rebind( _prev_bind_4, thread );
      wff_vars.$noting_wff_violationsP$.rebind( _prev_bind_3, thread );
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_2, thread );
      at_vars.$noting_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45766L)
  public static SubLObject first_conjunction(final SubLObject sentences)
  {
    return Sequences.find_if( Symbols.symbol_function( $sym48$EL_CONJUNCTION_P ), sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45920L)
  public static SubLObject bad_exponential_disjunctionP(final SubLObject sentence)
  {
    if( NIL != el_utilities.el_disjunction_p( sentence ) )
    {
      return bad_exponential_sentenceP( sentence, $sym48$EL_CONJUNCTION_P );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46205L)
  public static SubLObject handle_bad_exponential_disjunction(final SubLObject sentence)
  {
    return Dynamic.sublisp_throw( $kw49$BAD_EXPONENTIAL_DISJUNCTION, sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46542L)
  public static SubLObject bad_exponential_sentenceP(final SubLObject sentence, final SubLObject arg_test_func)
  {
    final SubLObject n = Sequences.count_if( arg_test_func, cycl_utilities.formula_args( sentence, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( n.numGE( FIVE_INTEGER ) )
    {
      final SubLObject problem_args = list_utilities.remove_if_not( arg_test_func, cycl_utilities.formula_args( sentence, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != problem_args )
      {
        final SubLObject k = average_arity( problem_args );
        if( k.numG( ONE_INTEGER ) )
        {
          final SubLObject kXn = Numbers.expt( k, n );
          if( kXn.numG( $czer_bad_exponential_threshold$.getGlobalValue() ) )
          {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47002L)
  public static SubLObject average_arity(final SubLObject formulas)
  {
    return number_utilities.average( formulas, $sym51$FORMULA_ARITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47087L)
  public static SubLObject force_into_cnf(SubLObject sentence)
  {
    if( NIL == el_utilities.el_conjunction_p( sentence ) )
    {
      sentence = el_utilities.make_conjunction( ConsesLow.list( sentence ) );
    }
    SubLObject new_args = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( sentence, $kw22$IGNORE );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.el_disjunction_p( arg ) )
      {
        new_args = ConsesLow.cons( arg, new_args );
      }
      else
      {
        new_args = ConsesLow.cons( el_utilities.make_disjunction( ConsesLow.list( arg ) ), new_args );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    new_args = Sequences.nreverse( new_args );
    return el_utilities.make_conjunction( new_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47807L)
  public static SubLObject cnf_operators_out(SubLObject sentence)
  {
    if( NIL == sentence || sentence.eql( $const6$True ) || sentence.eql( $const7$False ) )
    {
      return sentence;
    }
    if( NIL != cycl_variables.el_varP( sentence ) )
    {
      sentence = czer_utilities.encapsulate_formula( sentence, UNPROVIDED );
    }
    sentence = force_into_cnf( sentence );
    if( NIL == el_utilities.el_conjunction_p( sentence ) )
    {
      el_utilities.el_error( FOUR_INTEGER, $str52$_s_is_not_a_conjunction__so_it_is, sentence, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    SubLObject clause_list = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( sentence, $kw22$IGNORE );
    SubLObject conjunct = NIL;
    conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == el_utilities.el_disjunction_p( conjunct ) )
      {
        el_utilities.el_error( FOUR_INTEGER, $str53$_s_is_not_a_disjunction__so__S_is, conjunct, sentence, UNPROVIDED );
        return NIL;
      }
      clause_list = ConsesLow.cons( package_xnf_clause( cycl_utilities.formula_args( conjunct, UNPROVIDED ) ), clause_list );
      cdolist_list_var = cdolist_list_var.rest();
      conjunct = cdolist_list_var.first();
    }
    return Sequences.nreverse( clause_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49258L)
  public static SubLObject package_cnf_clause(final SubLObject clause)
  {
    return package_xnf_clause( clause );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49607L)
  public static SubLObject npackage_cnf_clause(final SubLObject clause)
  {
    return npackage_xnf_clause( clause );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49779L)
  public static SubLObject conjunctions_in(final SubLObject sentence)
  {
    if( NIL != bad_exponential_conjunctionP( sentence ) )
    {
      return handle_bad_exponential_conjunction( sentence );
    }
    return conjunctions_in_int( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50118L)
  public static SubLObject conjunctions_in_int(SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding( thread );
    try
    {
      at_vars.$noting_at_violationsP$.bind( NIL, thread );
      at_vars.$accumulating_at_violationsP$.bind( NIL, thread );
      wff_vars.$noting_wff_violationsP$.bind( NIL, thread );
      wff_vars.$accumulating_wff_violationsP$.bind( NIL, thread );
      if( NIL != el_utilities.el_disjunction_p( sentence ) )
      {
        result = el_utilities.nmap_formula_args( $sym54$CONJUNCTIONS_IN, sentence, UNPROVIDED );
      }
      else if( NIL != el_utilities.el_conjunction_p( sentence ) )
      {
        if( NIL != cycl_utilities.opaque_argP( sentence, ONE_INTEGER ) )
        {
          result = sentence;
        }
        else
        {
          sentence = el_utilities.nmap_formula_args( $sym54$CONJUNCTIONS_IN, sentence, UNPROVIDED );
          final SubLObject nested_disjunction = first_disjunction( cycl_utilities.formula_args( sentence, UNPROVIDED ) );
          if( NIL != nested_disjunction )
          {
            final SubLObject other_conjuncts = Sequences.delete( nested_disjunction, cycl_utilities.formula_args( sentence, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
                UNPROVIDED );
            if( NIL != other_conjuncts )
            {
              SubLObject new_disjuncts = NIL;
              SubLObject cdolist_list_var;
              final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( nested_disjunction, $kw22$IGNORE );
              SubLObject disjunct = NIL;
              disjunct = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject new_conjuncts = ConsesLow.cons( disjunct, other_conjuncts );
                new_disjuncts = ConsesLow.cons( simplifier.conjoin( new_conjuncts, UNPROVIDED ), new_disjuncts );
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
              }
              result = simplifier.ndisjoin( list_utilities.nmapcar( $sym54$CONJUNCTIONS_IN, new_disjuncts ), UNPROVIDED );
            }
            else
            {
              result = nested_disjunction;
            }
          }
          else
          {
            result = sentence;
          }
        }
      }
      else if( NIL != el_utilities.possibly_el_quantified_sentence_p( sentence ) || NIL != el_utilities.el_logical_operator_formula_p( sentence ) )
      {
        result = sentence;
      }
      else if( NIL != el_grammar.el_literal_p( sentence ) )
      {
        result = sentence;
      }
      else if( NIL != el_grammar.el_non_formula_sentence_p( sentence ) )
      {
        result = sentence;
      }
      else
      {
        el_utilities.el_error( FOUR_INTEGER, $str55$Got_the_unexpected_formula__S_in_, sentence, UNPROVIDED, UNPROVIDED );
        result = sentence;
      }
    }
    finally
    {
      wff_vars.$accumulating_wff_violationsP$.rebind( _prev_bind_4, thread );
      wff_vars.$noting_wff_violationsP$.rebind( _prev_bind_3, thread );
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_2, thread );
      at_vars.$noting_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52220L)
  public static SubLObject first_disjunction(final SubLObject sentences)
  {
    return Sequences.find_if( Symbols.symbol_function( $sym56$EL_DISJUNCTION_P ), sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52407L)
  public static SubLObject bad_exponential_conjunctionP(final SubLObject sentence)
  {
    if( NIL != el_utilities.el_conjunction_p( sentence ) )
    {
      return bad_exponential_sentenceP( sentence, $sym56$EL_DISJUNCTION_P );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52692L)
  public static SubLObject handle_bad_exponential_conjunction(final SubLObject sentence)
  {
    return Dynamic.sublisp_throw( $kw57$BAD_EXPONENTIAL_CONJUNCTION, sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52864L)
  public static SubLObject force_into_dnf(SubLObject sentence)
  {
    if( NIL == el_utilities.el_disjunction_p( sentence ) )
    {
      sentence = el_utilities.make_disjunction( ConsesLow.list( sentence ) );
    }
    SubLObject new_args = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( sentence, $kw22$IGNORE );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.el_conjunction_p( arg ) )
      {
        new_args = ConsesLow.cons( arg, new_args );
      }
      else
      {
        new_args = ConsesLow.cons( el_utilities.make_conjunction( ConsesLow.list( arg ) ), new_args );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return el_utilities.make_disjunction( new_args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53607L)
  public static SubLObject dnf_operators_out(SubLObject sentence)
  {
    if( NIL == sentence || sentence.eql( $const6$True ) || sentence.eql( $const7$False ) )
    {
      return sentence;
    }
    if( NIL != cycl_variables.el_varP( sentence ) )
    {
      sentence = czer_utilities.encapsulate_formula( sentence, UNPROVIDED );
    }
    sentence = force_into_dnf( sentence );
    if( NIL == el_utilities.el_disjunction_p( sentence ) )
    {
      el_utilities.el_error( FOUR_INTEGER, $str58$_s_is_not_a_disjunction__so_it_is, sentence, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    SubLObject clause_list = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( sentence, $kw22$IGNORE );
    SubLObject disjunct = NIL;
    disjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == el_utilities.el_conjunction_p( disjunct ) )
      {
        el_utilities.el_error( FOUR_INTEGER, $str59$_s_is_not_a_conjunction__so__S_is, disjunct, sentence, UNPROVIDED );
        return NIL;
      }
      clause_list = ConsesLow.cons( package_xnf_clause( cycl_utilities.formula_args( disjunct, UNPROVIDED ) ), clause_list );
      cdolist_list_var = cdolist_list_var.rest();
      disjunct = cdolist_list_var.first();
    }
    return Sequences.nreverse( clause_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55058L)
  public static SubLObject package_dnf_clause(final SubLObject clause)
  {
    return package_xnf_clause( clause );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55783L)
  public static SubLObject clausifier_input_sentence()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $clausifier_input_sentence$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55914L)
  public static SubLObject clausifier_input_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $clausifier_input_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56033L)
  public static SubLObject el_xnf(SubLObject sentence, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $clausifier_input_sentence$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $clausifier_input_mt$.currentBinding( thread );
    try
    {
      $clausifier_input_sentence$.bind( sentence, thread );
      $clausifier_input_mt$.bind( mt, thread );
      thread.resetMultipleValues();
      final SubLObject sentence_$6 = el_xnf_int( sentence, mt );
      final SubLObject mt_$7 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      sentence = sentence_$6;
      mt = mt_$7;
      thread.resetMultipleValues();
      final SubLObject sentence_$7 = postcanonicalizer.postcanonicalizations( sentence, mt );
      final SubLObject mt_$8 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      sentence = sentence_$7;
      mt = mt_$8;
    }
    finally
    {
      $clausifier_input_mt$.rebind( _prev_bind_2, thread );
      $clausifier_input_sentence$.rebind( _prev_bind_0, thread );
    }
    sentence = simplifier.simplify_cycl_sentence_syntax( sentence, UNPROVIDED );
    return Values.values( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56904L)
  public static SubLObject el_xnf_int(SubLObject sentence, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject sentence_$10 = precanonicalizer.precanonicalizations( sentence, mt );
    final SubLObject mt_$11 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    sentence = sentence_$10;
    mt = mt_$11;
    sentence = simplifier.simplify_cycl_sentence_syntax( sentence, UNPROVIDED );
    sentence = do_implications( sentence );
    sentence = simplifier.simplify_cycl_sentence_syntax( sentence, UNPROVIDED );
    sentence = do_negations_destructive( sentence );
    sentence = standardize_variables( sentence );
    final SubLObject _prev_bind_0 = $newly_introduced_universals$.currentBinding( thread );
    try
    {
      $newly_introduced_universals$.bind( NIL, thread );
      sentence = czer_explicitify_implicit_quantifiers( sentence );
      sentence = existentials_out( sentence );
      sentence = universals_out( sentence );
    }
    finally
    {
      $newly_introduced_universals$.rebind( _prev_bind_0, thread );
    }
    return Values.values( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57725L)
  public static SubLObject package_xnf_clauses(final SubLObject v_clauses)
  {
    if( $const6$True.eql( v_clauses ) )
    {
      return v_clauses;
    }
    if( $const7$False.eql( v_clauses ) )
    {
      return v_clauses;
    }
    return Mapping.mapcar( Symbols.symbol_function( $sym60$PACKAGE_XNF_CLAUSE ), v_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57943L)
  public static SubLObject package_xnf_clause(final SubLObject clause)
  {
    final SubLObject neg_lits = Mapping.mapcar( Symbols.symbol_function( $sym61$FORMULA_ARG1 ), el_utilities.el_negative_sentences( clause ) );
    final SubLObject pos_lits = el_utilities.el_positive_sentences( clause );
    return clauses.make_xnf( neg_lits, pos_lits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58362L)
  public static SubLObject npackage_xnf_clause(final SubLObject clause)
  {
    final SubLObject neg_lits = list_utilities.nmapcar( Symbols.symbol_function( $sym61$FORMULA_ARG1 ), el_utilities.el_negative_sentences( clause ) );
    final SubLObject pos_lits = el_utilities.el_positive_sentences( clause );
    return clauses.make_xnf( neg_lits, pos_lits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58625L)
  public static SubLObject canon_fast_gafP(final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject seqvar = el_utilities.sequence_var( sentence, UNPROVIDED );
    final SubLObject sentence_$12;
    final SubLObject tempformula = sentence_$12 = ( ( NIL != seqvar ) ? ConsesLow.append( el_utilities.strip_sequence_var( sentence ), ConsesLow.list( seqvar ) ) : sentence );
    return makeBoolean( NIL != el_utilities.el_formula_p( sentence_$12 ) && NIL == Sequences.find_if( Symbols.symbol_function( $sym15$EL_FORMULA_P ), sentence_$12, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == Sequences
        .find_if( Symbols.symbol_function( $sym62$EL_VAR_ ), sentence_$12, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != fort_types_interface.predicateP( cycl_utilities.formula_arg0( sentence_$12 ) )
        && NIL == precanonicalizer.precanonicalizationsP( sentence_$12, mt, T ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59047L)
  public static SubLObject el_cnf(SubLObject sentence, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$el_symbol_suffix_table$.bind( ( NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue( thread ) ) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue( thread )
          : Hashtables.make_hash_table( $int16$32, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( ( NIL != czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) ) ? czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) : NIL, thread );
      thread.resetMultipleValues();
      final SubLObject sentence_$13 = el_cnf_int( sentence, mt, NIL );
      final SubLObject mt_$14 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      sentence = sentence_$13;
      mt = mt_$14;
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0, thread );
    }
    return Values.values( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59636L)
  public static SubLObject el_cnf_destructive(final SubLObject sentence, final SubLObject mt)
  {
    return el_cnf_int( sentence, mt, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60079L)
  public static SubLObject el_cnf_int(SubLObject sentence, SubLObject mt, final SubLObject destructiveP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == destructiveP )
    {
      sentence = el_utilities.copy_sentence( sentence );
    }
    if( NIL != canon_fast_gafP( sentence, mt ) )
    {
      sentence = simplifier.simplify_cycl_literal_syntax( sentence, UNPROVIDED );
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject sentence_$15 = el_xnf( sentence, mt );
      final SubLObject mt_$16 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      sentence = sentence_$15;
      mt = mt_$16;
      if( NIL != wff_macros.within_wffP() )
      {
        sentence = disjunctions_in( sentence );
      }
      else
      {
        SubLObject error = NIL;
        try
        {
          thread.throwStack.push( $kw49$BAD_EXPONENTIAL_DISJUNCTION );
          sentence = disjunctions_in( sentence );
        }
        catch( final Throwable ccatch_env_var )
        {
          error = Errors.handleThrowable( ccatch_env_var, $kw49$BAD_EXPONENTIAL_DISJUNCTION );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != error )
        {
          sentence = NIL;
        }
      }
      sentence = simplifier.simplify_cycl_sentence_syntax( sentence, UNPROVIDED );
    }
    return Values.values( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60984L)
  public static SubLObject el_dnf(SubLObject sentence, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$el_symbol_suffix_table$.bind( ( NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue( thread ) ) ? czer_vars.$el_symbol_suffix_table$.getDynamicValue( thread )
          : Hashtables.make_hash_table( $int16$32, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( ( NIL != czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) ) ? czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) : NIL, thread );
      thread.resetMultipleValues();
      final SubLObject sentence_$17 = el_dnf_int( sentence, mt, NIL );
      final SubLObject mt_$18 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      sentence = sentence_$17;
      mt = mt_$18;
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0, thread );
    }
    return Values.values( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61431L)
  public static SubLObject el_dnf_destructive(final SubLObject sentence, final SubLObject mt)
  {
    return el_dnf_int( sentence, mt, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61874L)
  public static SubLObject el_dnf_int(SubLObject sentence, SubLObject mt, final SubLObject destructiveP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == destructiveP )
    {
      sentence = el_utilities.copy_sentence( sentence );
    }
    if( NIL != canon_fast_gafP( sentence, mt ) )
    {
      sentence = simplifier.simplify_cycl_literal_syntax( sentence, UNPROVIDED );
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject sentence_$19 = el_xnf( sentence, mt );
      final SubLObject mt_$20 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      sentence = sentence_$19;
      mt = mt_$20;
      if( NIL != wff_macros.within_wffP() )
      {
        sentence = conjunctions_in( sentence );
      }
      else
      {
        SubLObject error = NIL;
        try
        {
          thread.throwStack.push( $kw57$BAD_EXPONENTIAL_CONJUNCTION );
          sentence = conjunctions_in( sentence );
        }
        catch( final Throwable ccatch_env_var )
        {
          error = Errors.handleThrowable( ccatch_env_var, $kw57$BAD_EXPONENTIAL_CONJUNCTION );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != error )
        {
          sentence = NIL;
        }
      }
      sentence = simplifier.simplify_cycl_sentence_syntax( sentence, UNPROVIDED );
    }
    return Values.values( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62780L)
  public static SubLObject leading_universal_variables(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject copied_sentence = el_utilities.copy_sentence( sentence );
    final SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( NIL, thread );
      copied_sentence = precanonicalizer.precanonicalizations( copied_sentence, mt );
      copied_sentence = do_implications( copied_sentence );
      copied_sentence = do_negations_destructive( copied_sentence );
      copied_sentence = czer_explicitify_implicit_universal_quantifiers( copied_sentence );
      copied_sentence = standardize_variables( copied_sentence );
      copied_sentence = existentials_out( copied_sentence );
      copied_sentence = czer_main.el_nununiquify_vars( copied_sentence );
      copied_sentence = universals_out( copied_sentence );
      copied_sentence = leading_universal_variables_1( copied_sentence );
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63789L)
  public static SubLObject leading_universal_variables_1(final SubLObject sentence)
  {
    if( NIL == czer_utilities.encapsulate_formulaP( sentence ) )
    {
      if( !sentence.isAtom() )
      {
        if( NIL == el_utilities.el_negation_p( sentence ) )
        {
          if( NIL != el_utilities.el_conjunction_p( sentence ) || NIL != el_utilities.el_disjunction_p( sentence ) )
          {
            return list_utilities.mapappend( Symbols.symbol_function( $sym63$LEADING_UNIVERSAL_VARIABLES_1 ), cycl_utilities.formula_args( sentence, UNPROVIDED ) );
          }
          if( NIL != el_utilities.cycl_universal_p( sentence ) )
          {
            return ConsesLow.cons( el_utilities.quantified_var( sentence ), leading_universal_variables_1( el_utilities.quantified_sub_sentence( sentence ) ) );
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64226L)
  public static SubLObject sort_vars(final SubLObject vars)
  {
    return Sort.sort( conses_high.copy_list( vars ), Symbols.symbol_function( $sym64$STRING_ ), Symbols.symbol_function( $sym65$STR ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64339L)
  public static SubLObject distribute_conjunction(final SubLObject conjuncts, final SubLObject disjuncts, SubLObject conjunction_operator)
  {
    if( conjunction_operator == UNPROVIDED )
    {
      conjunction_operator = $const66$and;
    }
    if( conjuncts.isCons() && NIL != list_utilities.proper_list_p( disjuncts ) )
    {
      SubLObject ans = NIL;
      SubLObject cdolist_list_var = disjuncts;
      SubLObject disjunct = NIL;
      disjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ans = ConsesLow.cons( ConsesLow.listS( conjunction_operator, disjunct, conjuncts ), ans );
        cdolist_list_var = cdolist_list_var.rest();
        disjunct = cdolist_list_var.first();
      }
      return Sequences.nreverse( ans );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64861L)
  public static SubLObject clausal_form(final SubLObject sentence, final SubLObject mt, SubLObject form)
  {
    if( form == UNPROVIDED )
    {
      form = $kw67$CNF;
    }
    final SubLObject pcase_var = form;
    if( pcase_var.eql( $kw67$CNF ) )
    {
      return cnf_clausal_form( sentence, mt );
    }
    if( pcase_var.eql( $kw68$DNF ) )
    {
      return dnf_clausal_form( sentence, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65384L)
  public static SubLObject cnf_clausal_form(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $use_cnf_cacheP$.getDynamicValue( thread ) )
    {
      return cached_cnf_clausal_form( sentence, mt );
    }
    return cnf_clausal_form_int( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65626L)
  public static SubLObject clear_cached_cnf_clausal_form()
  {
    final SubLObject cs = $cached_cnf_clausal_form_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65626L)
  public static SubLObject remove_cached_cnf_clausal_form(final SubLObject sentence, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_cnf_clausal_form_caching_state$.getGlobalValue(), ConsesLow.list( sentence, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65626L)
  public static SubLObject cached_cnf_clausal_form_internal(final SubLObject sentence, final SubLObject mt)
  {
    return cnf_clausal_form_int( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65626L)
  public static SubLObject cached_cnf_clausal_form(final SubLObject sentence, final SubLObject mt)
  {
    SubLObject caching_state = $cached_cnf_clausal_form_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym69$CACHED_CNF_CLAUSAL_FORM, $sym70$_CACHED_CNF_CLAUSAL_FORM_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int71$48 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( sentence, mt );
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
        if( sentence.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_cnf_clausal_form_internal( sentence, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65903L)
  public static SubLObject cnf_clausal_form_int(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject cnf = el_cnf( sentence, mt );
    final SubLObject new_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( cnf_operators_out( cnf ), new_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 66071L)
  public static SubLObject dnf_clausal_form(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject dnf = el_dnf( sentence, mt );
    final SubLObject new_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( dnf_operators_out( dnf ), new_mt );
  }

  public static SubLObject declare_clausifier_file()
  {
    SubLFiles.declareFunction( me, "do_implications", "DO-IMPLICATIONS", 1, 0, false );
    new $do_implications$UnaryFunction();
    SubLFiles.declareFunction( me, "do_implications_recursive", "DO-IMPLICATIONS-RECURSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "eliminate_existential_with_var_only_in_antecedentP", "ELIMINATE-EXISTENTIAL-WITH-VAR-ONLY-IN-ANTECEDENT?", 3, 0, false );
    SubLFiles.declareFunction( me, "do_negations", "DO-NEGATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "do_negations_destructive", "DO-NEGATIONS-DESTRUCTIVE", 1, 0, false );
    new $do_negations_destructive$UnaryFunction();
    SubLFiles.declareFunction( me, "negate_formula", "NEGATE-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "negation_in", "NEGATION-IN", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_quantified_sentence", "NEGATE-QUANTIFIED-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_atomic", "NEGATE-ATOMIC", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_negation", "NEGATE-NEGATION", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_negations", "NEGATE-NEGATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_conjunction", "NEGATE-CONJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_conjunction_destructive", "NEGATE-CONJUNCTION-DESTRUCTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_disjunction_destructive", "NEGATE-DISJUNCTION-DESTRUCTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_universal", "NEGATE-UNIVERSAL", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_existential", "NEGATE-EXISTENTIAL", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_existential_min", "NEGATE-EXISTENTIAL-MIN", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_existential_max", "NEGATE-EXISTENTIAL-MAX", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_existential_exact", "NEGATE-EXISTENTIAL-EXACT", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_true_sentence", "NEGATE-TRUE-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "negate_encapsulate_sentence", "NEGATE-ENCAPSULATE-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "lift_negation", "LIFT-NEGATION", 1, 0, false );
    SubLFiles.declareFunction( me, "czer_explicitify_implicit_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-QUANTIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "czer_explicitify_implicit_universal_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-UNIVERSAL-QUANTIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "czer_explicitify_implicit_existential_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-EXISTENTIAL-QUANTIFIERS", 1, 0, false );
    SubLFiles.declareFunction( me, "assume_free_vars_are_existentially_boundP", "ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?", 0, 0, false );
    SubLFiles.declareFunction( me, "standardize_sentence_variables", "STANDARDIZE-SENTENCE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "standardize_variables", "STANDARDIZE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "recursively_standardize_variables", "RECURSIVELY-STANDARDIZE-VARIABLES", 1, 0, false );
    new $recursively_standardize_variables$UnaryFunction();
    SubLFiles.declareFunction( me, "el_uniquify_standardize", "EL-UNIQUIFY-STANDARDIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "el_var_without_quote", "EL-VAR-WITHOUT-QUOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "remember_variable_rename", "REMEMBER-VARIABLE-RENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "remember_variables_rename", "REMEMBER-VARIABLES-RENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "el_uniquify", "EL-UNIQUIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "existentials_out", "EXISTENTIALS-OUT", 1, 0, false );
    SubLFiles.declareFunction( me, "existentials_out_int", "EXISTENTIALS-OUT-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "skolemize_atomic_sentence", "SKOLEMIZE-ATOMIC-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "skolemize_variable", "SKOLEMIZE-VARIABLE", 7, 0, false );
    SubLFiles.declareFunction( me, "determine_skolem_var_status", "DETERMINE-SKOLEM-VAR-STATUS", 5, 0, false );
    SubLFiles.declareFunction( me, "make_skolem_fn_fn", "MAKE-SKOLEM-FN-FN", 5, 0, false );
    SubLFiles.declareFunction( me, "drop_all_existentialsP", "DROP-ALL-EXISTENTIALS?", 0, 0, false );
    SubLFiles.declareFunction( me, "leave_skolem_constants_aloneP", "LEAVE-SKOLEM-CONSTANTS-ALONE?", 0, 0, false );
    SubLFiles.declareFunction( me, "forbid_quantified_sequence_variablesP", "FORBID-QUANTIFIED-SEQUENCE-VARIABLES?", 0, 0, false );
    SubLFiles.declareFunction( me, "universals_out", "UNIVERSALS-OUT", 1, 0, false );
    new $universals_out$UnaryFunction();
    SubLFiles.declareFunction( me, "disjunctions_in", "DISJUNCTIONS-IN", 1, 0, false );
    SubLFiles.declareFunction( me, "disjunctions_in_int", "DISJUNCTIONS-IN-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "first_conjunction", "FIRST-CONJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "bad_exponential_disjunctionP", "BAD-EXPONENTIAL-DISJUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_bad_exponential_disjunction", "HANDLE-BAD-EXPONENTIAL-DISJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "bad_exponential_sentenceP", "BAD-EXPONENTIAL-SENTENCE?", 2, 0, false );
    SubLFiles.declareFunction( me, "average_arity", "AVERAGE-ARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "force_into_cnf", "FORCE-INTO-CNF", 1, 0, false );
    SubLFiles.declareFunction( me, "cnf_operators_out", "CNF-OPERATORS-OUT", 1, 0, false );
    SubLFiles.declareFunction( me, "package_cnf_clause", "PACKAGE-CNF-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "npackage_cnf_clause", "NPACKAGE-CNF-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "conjunctions_in", "CONJUNCTIONS-IN", 1, 0, false );
    new $conjunctions_in$UnaryFunction();
    SubLFiles.declareFunction( me, "conjunctions_in_int", "CONJUNCTIONS-IN-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "first_disjunction", "FIRST-DISJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "bad_exponential_conjunctionP", "BAD-EXPONENTIAL-CONJUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_bad_exponential_conjunction", "HANDLE-BAD-EXPONENTIAL-CONJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "force_into_dnf", "FORCE-INTO-DNF", 1, 0, false );
    SubLFiles.declareFunction( me, "dnf_operators_out", "DNF-OPERATORS-OUT", 1, 0, false );
    SubLFiles.declareFunction( me, "package_dnf_clause", "PACKAGE-DNF-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "clausifier_input_sentence", "CLAUSIFIER-INPUT-SENTENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "clausifier_input_mt", "CLAUSIFIER-INPUT-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "el_xnf", "EL-XNF", 2, 0, false );
    SubLFiles.declareFunction( me, "el_xnf_int", "EL-XNF-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "package_xnf_clauses", "PACKAGE-XNF-CLAUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "package_xnf_clause", "PACKAGE-XNF-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "npackage_xnf_clause", "NPACKAGE-XNF-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "canon_fast_gafP", "CANON-FAST-GAF?", 2, 0, false );
    SubLFiles.declareFunction( me, "el_cnf", "EL-CNF", 2, 0, false );
    SubLFiles.declareFunction( me, "el_cnf_destructive", "EL-CNF-DESTRUCTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "el_cnf_int", "EL-CNF-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "el_dnf", "EL-DNF", 2, 0, false );
    SubLFiles.declareFunction( me, "el_dnf_destructive", "EL-DNF-DESTRUCTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "el_dnf_int", "EL-DNF-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "leading_universal_variables", "LEADING-UNIVERSAL-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "leading_universal_variables_1", "LEADING-UNIVERSAL-VARIABLES-1", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_vars", "SORT-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "distribute_conjunction", "DISTRIBUTE-CONJUNCTION", 2, 1, false );
    SubLFiles.declareFunction( me, "clausal_form", "CLAUSAL-FORM", 2, 1, false );
    SubLFiles.declareFunction( me, "cnf_clausal_form", "CNF-CLAUSAL-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_cnf_clausal_form", "CLEAR-CACHED-CNF-CLAUSAL-FORM", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_cnf_clausal_form", "REMOVE-CACHED-CNF-CLAUSAL-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "cached_cnf_clausal_form_internal", "CACHED-CNF-CLAUSAL-FORM-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cached_cnf_clausal_form", "CACHED-CNF-CLAUSAL-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "cnf_clausal_form_int", "CNF-CLAUSAL-FORM-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "dnf_clausal_form", "DNF-CLAUSAL-FORM", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_clausifier_file()
  {
    $canonical_variable_name_stem$ = SubLFiles.defparameter( "*CANONICAL-VARIABLE-NAME-STEM*", $str0$el_var );
    $use_cnf_cacheP$ = SubLFiles.defparameter( "*USE-CNF-CACHE?*", T );
    $newly_introduced_universals$ = SubLFiles.defparameter( "*NEWLY-INTRODUCED-UNIVERSALS*", $kw1$ERROR );
    $outermost_implication$ = SubLFiles.defparameter( "*OUTERMOST-IMPLICATION*", $kw2$UNINITIALIZED );
    $innermost_implication$ = SubLFiles.defparameter( "*INNERMOST-IMPLICATION*", $kw2$UNINITIALIZED );
    $eliminate_existential_with_var_only_in_antecedentP$ = SubLFiles.defparameter( "*ELIMINATE-EXISTENTIAL-WITH-VAR-ONLY-IN-ANTECEDENT?*", T );
    $quantifier_info_list$ = SubLFiles.defparameter( "*QUANTIFIER-INFO-LIST*", NIL );
    $czer_bad_exponential_threshold$ = SubLFiles.deflexical( "*CZER-BAD-EXPONENTIAL-THRESHOLD*", $int50$200000 );
    $clausifier_input_sentence$ = SubLFiles.defparameter( "*CLAUSIFIER-INPUT-SENTENCE*", NIL );
    $clausifier_input_mt$ = SubLFiles.defparameter( "*CLAUSIFIER-INPUT-MT*", NIL );
    $cached_cnf_clausal_form_caching_state$ = SubLFiles.deflexical( "*CACHED-CNF-CLAUSAL-FORM-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_clausifier_file()
  {
    memoization_state.note_globally_cached_function( $sym69$CACHED_CNF_CLAUSAL_FORM );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_clausifier_file();
  }

  @Override
  public void initializeVariables()
  {
    init_clausifier_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_clausifier_file();
  }
  static
  {
    me = new clausifier();
    $canonical_variable_name_stem$ = null;
    $use_cnf_cacheP$ = null;
    $newly_introduced_universals$ = null;
    $outermost_implication$ = null;
    $innermost_implication$ = null;
    $eliminate_existential_with_var_only_in_antecedentP$ = null;
    $quantifier_info_list$ = null;
    $czer_bad_exponential_threshold$ = null;
    $clausifier_input_sentence$ = null;
    $clausifier_input_mt$ = null;
    $cached_cnf_clausal_form_caching_state$ = null;
    $str0$el_var = makeString( "el-var" );
    $kw1$ERROR = makeKeyword( "ERROR" );
    $kw2$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym3$DO_IMPLICATIONS_RECURSIVE = makeSymbol( "DO-IMPLICATIONS-RECURSIVE" );
    $sym4$DO_NEGATIONS_DESTRUCTIVE = makeSymbol( "DO-NEGATIONS-DESTRUCTIVE" );
    $kw5$HELLO_YOU_SILLY_COMPILER = makeKeyword( "HELLO-YOU-SILLY-COMPILER" );
    $const6$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $const7$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $kw8$REGULARIZE = makeKeyword( "REGULARIZE" );
    $str9$_s_is_not_a_quantified_sentence = makeString( "~s is not a quantified sentence" );
    $sym10$NEGATE_NEGATION = makeSymbol( "NEGATE-NEGATION" );
    $sym11$NEGATE_FORMULA = makeSymbol( "NEGATE-FORMULA" );
    $const12$DifferenceFn = constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) );
    $str13$_s_contained_the_invalid_bound__D = makeString( "~s contained the invalid bound ~D" );
    $const14$PlusFn = constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) );
    $sym15$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $int16$32 = makeInteger( 32 );
    $sym17$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $const18$Quote = constant_handles.reader_make_constant_shell( makeString( "Quote" ) );
    $sym19$RECURSIVELY_STANDARDIZE_VARIABLES = makeSymbol( "RECURSIVELY-STANDARDIZE-VARIABLES" );
    $sym20$EL_UNIQUIFY_STANDARDIZE = makeSymbol( "EL-UNIQUIFY-STANDARDIZE" );
    $sym21$EL_VAR_WITHOUT_QUOTE = makeSymbol( "EL-VAR-WITHOUT-QUOTE" );
    $kw22$IGNORE = makeKeyword( "IGNORE" );
    $str23$_ = makeString( "-" );
    $sym24$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P = makeSymbol( "CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P" );
    $kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword( "TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE" );
    $kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE = makeKeyword( "AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE" );
    $kw27$QUANTIFIED_SEQUENCE_VARIABLE = makeKeyword( "QUANTIFIED-SEQUENCE-VARIABLE" );
    $sym28$EXISTENTIALS_OUT_INT = makeSymbol( "EXISTENTIALS-OUT-INT" );
    $str29$Unexpected_sentence_type_in_exist = makeString( "Unexpected sentence type in existentials-out-int: ~S" );
    $const30$forAll = constant_handles.reader_make_constant_shell( makeString( "forAll" ) );
    $kw31$NEITHER = makeKeyword( "NEITHER" );
    $kw32$TERM = makeKeyword( "TERM" );
    $kw33$SEQ = makeKeyword( "SEQ" );
    $kw34$BOTH = makeKeyword( "BOTH" );
    $kw35$UNDETERMINED = makeKeyword( "UNDETERMINED" );
    $str36$Skolemizer_failed_to_classify_var = makeString( "Skolemizer failed to classify variable ~a in sentence ~a~%" );
    $str37$skolem_constants_not_yet_supporte = makeString( "skolem constants not yet supported" );
    $const38$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $const39$SkolemFunctionFn = constant_handles.reader_make_constant_shell( makeString( "SkolemFunctionFn" ) );
    $const40$SkolemFuncNFn = constant_handles.reader_make_constant_shell( makeString( "SkolemFuncNFn" ) );
    $str41$make_skolem_fn_fn_doesn_t_know_ho = makeString( "make-skolem-fn-fn doesn't know how to handle the quantifier ~S" );
    $kw42$ASSERT_ONLY = makeKeyword( "ASSERT-ONLY" );
    $str43$Unexpected_value_for__forbid_quan = makeString( "Unexpected value for *forbid-quantified-sequence-variables?*: ~s" );
    $sym44$UNIVERSALS_OUT = makeSymbol( "UNIVERSALS-OUT" );
    $str45$Got_the_unexpected_sentence__S_in = makeString( "Got the unexpected sentence ~S in universals-out." );
    $sym46$DISJUNCTIONS_IN = makeSymbol( "DISJUNCTIONS-IN" );
    $str47$Got_the_unexpected_sentence__S_in = makeString( "Got the unexpected sentence ~S in disjunctions-in." );
    $sym48$EL_CONJUNCTION_P = makeSymbol( "EL-CONJUNCTION-P" );
    $kw49$BAD_EXPONENTIAL_DISJUNCTION = makeKeyword( "BAD-EXPONENTIAL-DISJUNCTION" );
    $int50$200000 = makeInteger( 200000 );
    $sym51$FORMULA_ARITY = makeSymbol( "FORMULA-ARITY" );
    $str52$_s_is_not_a_conjunction__so_it_is = makeString( "~s is not a conjunction, so it is not a CNF sentence." );
    $str53$_s_is_not_a_disjunction__so__S_is = makeString( "~s is not a disjunction, so ~S is not a CNF sentence." );
    $sym54$CONJUNCTIONS_IN = makeSymbol( "CONJUNCTIONS-IN" );
    $str55$Got_the_unexpected_formula__S_in_ = makeString( "Got the unexpected formula ~S in conjunctions-in." );
    $sym56$EL_DISJUNCTION_P = makeSymbol( "EL-DISJUNCTION-P" );
    $kw57$BAD_EXPONENTIAL_CONJUNCTION = makeKeyword( "BAD-EXPONENTIAL-CONJUNCTION" );
    $str58$_s_is_not_a_disjunction__so_it_is = makeString( "~s is not a disjunction, so it is not a DNF sentence." );
    $str59$_s_is_not_a_conjunction__so__S_is = makeString( "~s is not a conjunction, so ~S is not a DNF sentence." );
    $sym60$PACKAGE_XNF_CLAUSE = makeSymbol( "PACKAGE-XNF-CLAUSE" );
    $sym61$FORMULA_ARG1 = makeSymbol( "FORMULA-ARG1" );
    $sym62$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym63$LEADING_UNIVERSAL_VARIABLES_1 = makeSymbol( "LEADING-UNIVERSAL-VARIABLES-1" );
    $sym64$STRING_ = makeSymbol( "STRING<" );
    $sym65$STR = makeSymbol( "STR" );
    $const66$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $kw67$CNF = makeKeyword( "CNF" );
    $kw68$DNF = makeKeyword( "DNF" );
    $sym69$CACHED_CNF_CLAUSAL_FORM = makeSymbol( "CACHED-CNF-CLAUSAL-FORM" );
    $sym70$_CACHED_CNF_CLAUSAL_FORM_CACHING_STATE_ = makeSymbol( "*CACHED-CNF-CLAUSAL-FORM-CACHING-STATE*" );
    $int71$48 = makeInteger( 48 );
  }

  public static final class $do_implications$UnaryFunction
      extends
        UnaryFunction
  {
    public $do_implications$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DO-IMPLICATIONS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return do_implications( arg1 );
    }
  }

  public static final class $do_negations_destructive$UnaryFunction
      extends
        UnaryFunction
  {
    public $do_negations_destructive$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DO-NEGATIONS-DESTRUCTIVE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return do_negations_destructive( arg1 );
    }
  }

  public static final class $recursively_standardize_variables$UnaryFunction
      extends
        UnaryFunction
  {
    public $recursively_standardize_variables$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RECURSIVELY-STANDARDIZE-VARIABLES" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return recursively_standardize_variables( arg1 );
    }
  }

  public static final class $universals_out$UnaryFunction
      extends
        UnaryFunction
  {
    public $universals_out$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "UNIVERSALS-OUT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return universals_out( arg1 );
    }
  }

  public static final class $conjunctions_in$UnaryFunction
      extends
        UnaryFunction
  {
    public $conjunctions_in$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CONJUNCTIONS-IN" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return conjunctions_in( arg1 );
    }
  }
}
/*
 * 
 * Total time: 510 ms
 * 
 */