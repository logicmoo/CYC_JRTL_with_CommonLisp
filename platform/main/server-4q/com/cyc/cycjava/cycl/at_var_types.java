package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class at_var_types
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.at_var_types";
  public static final String myFingerPrint = "7e463a70ccb77251f173bacbef70f1bf0658e06985fbabda5ff194bcd0c92fbe";
  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 5280L)
  private static SubLSymbol $at_var_type_dnfs_int_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 7114L)
  private static SubLSymbol $at_true_sentence_negation_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 104160L)
  private static SubLSymbol $at_argn_int_cached_caching_state$;
  private static final SubLSymbol $sym0$__PRED_MUFFET_212;
  private static final SubLSymbol $sym1$EL_VAR_;
  private static final SubLSymbol $sym2$CYC_VAR_;
  private static final SubLSymbol $sym3$UNREIFIED_SKOLEM_TERM_;
  private static final SubLSymbol $kw4$BAD_EXPONENTIAL_CONJUNCTION;
  private static final SubLSymbol $sym5$AT_VAR_TYPE_DNFS_INT_CACHED;
  private static final SubLSymbol $sym6$SKOLEM_FUNCTION_VAR;
  private static final SubLSymbol $sym7$_AT_VAR_TYPE_DNFS_INT_CACHED_CACHING_STATE_;
  private static final SubLInteger $int8$1024;
  private static final SubLSymbol $kw9$BAD_EXPONENTIAL_DISJUNCTION;
  private static final SubLSymbol $sym10$AT_VAR_TYPES_CNFS_CLAUSIFY_INT;
  private static final SubLInteger $int11$100;
  private static final SubLSymbol $kw12$UNINITIALIZED;
  private static final SubLObject $const13$pragmaticRequirement;
  private static final SubLObject $const14$trueSentence;
  private static final SubLSymbol $sym15$OPAQUE_ARG_WRT_PRAGMATIC_REQUIREMENT_;
  private static final SubLSymbol $sym16$AT_NEGATED_;
  private static final SubLSymbol $sym17$AT_NEGATE;
  private static final SubLObject $const18$termChosen;
  private static final SubLObject $const19$and;
  private static final SubLSymbol $kw20$RECURSION_LIMIT_EXCEEDED;
  private static final SubLSymbol $kw21$INVALID_EXPANSION;
  private static final SubLObject $const22$isa;
  private static final SubLObject $const23$genls;
  private static final SubLObject $const24$quotedIsa;
  private static final SubLSymbol $sym25$_EXIT;
  private static final SubLSymbol $sym26$VARIABLE_P;
  private static final SubLSymbol $kw27$ISA;
  private static final SubLSymbol $kw28$QUOTED_ISA;
  private static final SubLSymbol $kw29$GENLS;
  private static final SubLSymbol $sym30$CNF_VARIABLE_ISA_CONSTRAINTS_INT;
  private static final SubLSymbol $sym31$CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT;
  private static final SubLSymbol $sym32$CNF_VARIABLE_GENL_CONSTRAINTS_INT;
  private static final SubLSymbol $sym33$CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2;
  private static final SubLSymbol $sym34$CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2;
  private static final SubLSymbol $kw35$IGNORE;
  private static final SubLSymbol $kw36$DISJOINT_ARG_ISA;
  private static final SubLSymbol $sym37$DNF_VARIABLE_ISA_CONSTRAINTS_INT;
  private static final SubLSymbol $sym38$ISA_VAR_VAR_LIT_;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$CONTEXTUALIZED_ISA_X_Y_LIT_;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLObject $const43$TruthFunction;
  private static final SubLObject $const44$Predicate;
  private static final SubLSymbol $sym45$_DUMMY;
  private static final SubLObject $const46$ListOfTypeFn;
  private static final SubLObject $const47$Thing;
  private static final SubLSymbol $kw48$REGULARIZE;
  private static final SubLObject $const49$ListOfSpecsFn;
  private static final SubLObject $const50$SpecsFn;
  private static final SubLSymbol $kw51$DNF;
  private static final SubLSymbol $kw52$CNF;
  private static final SubLObject $const53$Relation;
  private static final SubLSymbol $sym54$AT_MIN_COLS_MEMOIZED;
  private static final SubLSymbol $sym55$CYC_QUERY_;
  private static final SubLSymbol $sym56$GATHER_AT_DATA_ASSERTION;
  private static final SubLSymbol $sym57$ARGN_ISA;
  private static final SubLSymbol $sym58$ARGN_QUOTED_ISA;
  private static final SubLSymbol $sym59$ARGN_GENL;
  private static final SubLSymbol $sym60$INTER_ARG_ISA_INT;
  private static final SubLSymbol $sym61$INTER_ARG_GENL_INT;
  private static final SubLSymbol $sym62$INTER_ARG_ISA_FROM_TYPE_INT;
  private static final SubLSymbol $sym63$INTER_ARG_GENL_FROM_TYPE_INT;
  private static final SubLSymbol $sym64$AT_ARGN_INT_CACHED;
  private static final SubLSymbol $sym65$_AT_ARGN_INT_CACHED_CACHING_STATE_;
  private static final SubLSymbol $sym66$CLEAR_AT_ARGN_INT_CACHED;
  private static final SubLString $str67$got_an_unexpected_function__s_wit;
  private static final SubLSymbol $kw68$GAF;
  private static final SubLSymbol $kw69$TRUE;
  private static final SubLSymbol $sym70$FIRST;
  private static final SubLList $list71;
  private static final SubLString $str72$__at_var__a_test__arg__s__s__cons;
  private static final SubLSymbol $kw73$NOT_DISJOINT;
  private static final SubLSymbol $kw74$NEGLITS_SUBSUME_POSLITS;
  private static final SubLSymbol $kw75$DISJOINT_ARG_QUOTED_ISA;
  private static final SubLSymbol $kw76$DISJOINT_ARG_GENL;
  private static final SubLObject $const77$modalInArg;

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 970L)
  public static SubLObject term_var_types_ok_intP(final SubLObject v_term, final SubLObject mt)
  {
    return formula_var_types_ok_intP( el_utilities.make_unary_formula( $sym0$__PRED_MUFFET_212, v_term ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 2232L)
  public static SubLObject formula_var_types_ok_intP(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject cnfs = at_var_type_cnfs_int( formula, mt, T, T );
    final SubLObject new_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return makeBoolean( NIL != cnfs && NIL != independent_cnfs_variables_arg_constraints_okP( cnfs, new_mt, $sym1$EL_VAR_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 2494L)
  public static SubLObject inter_formula_var_types_okP(final SubLObject formula, final SubLObject mt)
  {
    return inter_formula_var_types_ok_intP( formula, mt, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 2674L)
  public static SubLObject inter_formula_var_types_ok_intP(final SubLObject formula, final SubLObject mt, final SubLObject assume_syntax_okP, final SubLObject catch_czer_errorsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject cnfs = at_var_type_cnfs_int( formula, mt, assume_syntax_okP, catch_czer_errorsP );
    final SubLObject new_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return makeBoolean( NIL != cnfs && NIL != inter_cnfs_variables_arg_constraints_okP( cnfs, new_mt, $sym1$EL_VAR_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 3186L)
  public static SubLObject independent_cnfs_variables_arg_constraints_okP(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject formula = wff_vars.unexpanded_formula();
    if( NIL != wff_vars.$validating_expansionP$.getDynamicValue( thread ) && NIL != el_utilities.genls_litP( formula ) && NIL != sdc.sdcP( cycl_utilities.formula_arg1( formula, UNPROVIDED ), cycl_utilities.formula_arg2(
        formula, UNPROVIDED ), UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding( thread );
      try
      {
        sdc.$ignoring_sdcP$.bind( T, thread );
        ans = independent_cnfs_variables_arg_constraints_okP_int( cnfs, mt, varP );
      }
      finally
      {
        sdc.$ignoring_sdcP$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      ans = independent_cnfs_variables_arg_constraints_okP_int( cnfs, mt, varP );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 3685L)
  public static SubLObject independent_cnfs_variables_arg_constraints_okP_int(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    SubLObject okP = T;
    SubLObject skolem_cnfs = NIL;
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = cnfs;
      SubLObject cnf = NIL;
      cnf = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        if( NIL != list_utilities.tree_find_if( $sym3$UNREIFIED_SKOLEM_TERM_, cnf, UNPROVIDED ) )
        {
          skolem_cnfs = ConsesLow.cons( cnf, skolem_cnfs );
        }
        else
        {
          okP = makeBoolean( NIL != cnf_variables_arg_constraints_okP( cnf, mt, varP ) && NIL != okP );
          doneP = at_utilities.at_finishedP( makeBoolean( NIL == okP ) );
        }
        csome_list_var = csome_list_var.rest();
        cnf = csome_list_var.first();
      }
    }
    if( NIL == doneP && NIL == doneP )
    {
      SubLObject csome_list_var = list_utilities.tree_gather( skolem_cnfs, $sym3$UNREIFIED_SKOLEM_TERM_, EQUAL, IDENTITY, NIL );
      SubLObject skolem = NIL;
      skolem = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        SubLObject cnfs_of_skolem = NIL;
        SubLObject cdolist_list_var = skolem_cnfs;
        SubLObject cnf2 = NIL;
        cnf2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != list_utilities.tree_find( skolem, cnf2, EQUAL, UNPROVIDED ) )
          {
            cnfs_of_skolem = ConsesLow.cons( cnf2, cnfs_of_skolem );
          }
          cdolist_list_var = cdolist_list_var.rest();
          cnf2 = cdolist_list_var.first();
        }
        if( NIL == doneP )
        {
          SubLObject csome_list_var_$1 = clause_utilities.group_clauses_having_common_neg_lits( cnfs_of_skolem, UNPROVIDED );
          SubLObject dependent_cnfs_of_skolem = NIL;
          dependent_cnfs_of_skolem = csome_list_var_$1.first();
          while ( NIL == doneP && NIL != csome_list_var_$1)
          {
            okP = makeBoolean( NIL != cnfs_variables_arg_constraints_okP( dependent_cnfs_of_skolem, mt, varP ) && NIL != okP );
            doneP = at_utilities.at_finishedP( makeBoolean( NIL == okP ) );
            csome_list_var_$1 = csome_list_var_$1.rest();
            dependent_cnfs_of_skolem = csome_list_var_$1.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        skolem = csome_list_var.first();
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 4553L)
  public static SubLObject at_var_type_dnfs(final SubLObject sentence, SubLObject mt, final SubLObject catch_czer_errorsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject dnfs = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = czer_vars.$simplify_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = czer_vars.$expand_el_relationsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = czer_vars.$encapsulate_var_formulaP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      czer_vars.$expand_el_relationsP$.bind( NIL, thread );
      czer_vars.$encapsulate_var_formulaP$.bind( NIL, thread );
      czer_vars.$encapsulate_intensional_formulaP$.bind( NIL, thread );
      SubLObject error = NIL;
      if( NIL != catch_czer_errorsP )
      {
        try
        {
          thread.throwStack.push( $kw4$BAD_EXPONENTIAL_CONJUNCTION );
          final SubLObject _prev_bind_0_$2 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
          try
          {
            czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
            czer_vars.$standardize_variables_memory$.bind( NIL, thread );
            thread.resetMultipleValues();
            final SubLObject dnfs_$4 = at_var_type_dnfs_int_cached( sentence, mt );
            final SubLObject mt_$5 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            dnfs = dnfs_$4;
            mt = mt_$5;
          }
          finally
          {
            czer_vars.$standardize_variables_memory$.rebind( _prev_bind_1_$3, thread );
            czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0_$2, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          error = Errors.handleThrowable( ccatch_env_var, $kw4$BAD_EXPONENTIAL_CONJUNCTION );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      else
      {
        final SubLObject _prev_bind_0_$3 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
        final SubLObject _prev_bind_1_$4 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
        try
        {
          czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
          czer_vars.$standardize_variables_memory$.bind( NIL, thread );
          thread.resetMultipleValues();
          final SubLObject dnfs_$5 = at_var_type_dnfs_int_cached( sentence, mt );
          final SubLObject mt_$6 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          dnfs = dnfs_$5;
          mt = mt_$6;
        }
        finally
        {
          czer_vars.$standardize_variables_memory$.rebind( _prev_bind_1_$4, thread );
          czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0_$3, thread );
        }
      }
      if( NIL != error )
      {
        at_utilities.note_at_violation( ConsesLow.list( $kw4$BAD_EXPONENTIAL_CONJUNCTION, sentence ) );
        dnfs = NIL;
      }
    }
    finally
    {
      czer_vars.$encapsulate_intensional_formulaP$.rebind( _prev_bind_6, thread );
      czer_vars.$encapsulate_var_formulaP$.rebind( _prev_bind_5, thread );
      czer_vars.$expand_el_relationsP$.rebind( _prev_bind_4, thread );
      czer_vars.$simplify_literalP$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Values.values( dnfs, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 5280L)
  public static SubLObject clear_at_var_type_dnfs_int_cached()
  {
    final SubLObject cs = $at_var_type_dnfs_int_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 5280L)
  public static SubLObject remove_at_var_type_dnfs_int_cached(final SubLObject sentence, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $at_var_type_dnfs_int_cached_caching_state$.getGlobalValue(), ConsesLow.list( sentence, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 5280L)
  public static SubLObject at_var_type_dnfs_int_cached_internal(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != wff.el_wff_syntaxP( sentence, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject dnfs = clausifier.dnf_clausal_form( sentence, mt );
      final SubLObject new_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( transform_list_utilities.transform( dnfs, $sym3$UNREIFIED_SKOLEM_TERM_, $sym6$SKOLEM_FUNCTION_VAR, UNPROVIDED ), new_mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 5280L)
  public static SubLObject at_var_type_dnfs_int_cached(final SubLObject sentence, final SubLObject mt)
  {
    SubLObject caching_state = $at_var_type_dnfs_int_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym5$AT_VAR_TYPE_DNFS_INT_CACHED, $sym7$_AT_VAR_TYPE_DNFS_INT_CACHED_CACHING_STATE_, $int8$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER );
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
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( at_var_type_dnfs_int_cached_internal( sentence, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 5604L)
  public static SubLObject at_var_type_cnfs(final SubLObject sentence, final SubLObject mt)
  {
    return at_var_type_cnfs_int( sentence, mt, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 5704L)
  public static SubLObject at_var_type_cnfs_int(final SubLObject sentence, SubLObject mt, final SubLObject assume_syntax_okP, final SubLObject catch_czer_errorsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cnfs = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$simplify_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$expand_el_relationsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = czer_vars.$encapsulate_var_formulaP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding( thread );
    try
    {
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      czer_vars.$expand_el_relationsP$.bind( NIL, thread );
      czer_vars.$encapsulate_var_formulaP$.bind( NIL, thread );
      czer_vars.$encapsulate_intensional_formulaP$.bind( NIL, thread );
      if( NIL != assume_syntax_okP || NIL != wff.el_wff_syntaxP( sentence, UNPROVIDED ) )
      {
        final SubLObject _prev_bind_0_$10 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_1_$11 = clausifier.$use_cnf_cacheP$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( ( NIL != fort_types_interface.mtP( mt ) ) ? mt : mt_relevance_macros.$mt$.getDynamicValue( thread ), thread );
          clausifier.$use_cnf_cacheP$.bind( NIL, thread );
          SubLObject error = NIL;
          if( NIL != catch_czer_errorsP )
          {
            try
            {
              thread.throwStack.push( $kw9$BAD_EXPONENTIAL_DISJUNCTION );
              thread.resetMultipleValues();
              final SubLObject cnfs_$12 = at_var_types_cnfs_clausify( sentence );
              final SubLObject mt_$13 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              cnfs = cnfs_$12;
              mt = mt_$13;
            }
            catch( final Throwable ccatch_env_var )
            {
              error = Errors.handleThrowable( ccatch_env_var, $kw9$BAD_EXPONENTIAL_DISJUNCTION );
            }
            finally
            {
              thread.throwStack.pop();
            }
          }
          else
          {
            thread.resetMultipleValues();
            final SubLObject cnfs_$13 = at_var_types_cnfs_clausify( sentence );
            final SubLObject mt_$14 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cnfs = cnfs_$13;
            mt = mt_$14;
          }
          if( NIL != error )
          {
            at_utilities.note_at_violation( ConsesLow.list( $kw9$BAD_EXPONENTIAL_DISJUNCTION, sentence ) );
            cnfs = NIL;
          }
        }
        finally
        {
          clausifier.$use_cnf_cacheP$.rebind( _prev_bind_1_$11, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0_$10, thread );
        }
      }
    }
    finally
    {
      czer_vars.$encapsulate_intensional_formulaP$.rebind( _prev_bind_4, thread );
      czer_vars.$encapsulate_var_formulaP$.rebind( _prev_bind_3, thread );
      czer_vars.$expand_el_relationsP$.rebind( _prev_bind_2, thread );
      czer_vars.$simplify_literalP$.rebind( _prev_bind_0, thread );
    }
    cnfs = at_var_type_repackage_cnfs( cnfs );
    return Values.values( cnfs, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 6439L)
  public static SubLObject at_var_types_cnfs_clausify(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject cnfs = at_var_types_cnfs_clausify_int( sentence );
    final SubLObject mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( conses_high.copy_tree( cnfs ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 6617L)
  public static SubLObject at_var_types_cnfs_clausify_int_internal(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cnfs = NIL;
    SubLObject mt = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject cnfs_$16 = clausifier.cnf_clausal_form( simplifier.simplify_cycl_sentence( simplifier.simplify_sequence_variables( at_transform_true_sentence_negation_preds( sentence, mt_relevance_macros.$mt$
          .getDynamicValue( thread ) ) ), UNPROVIDED ), mt_relevance_macros.$mt$.getDynamicValue( thread ) );
      final SubLObject mt_$17 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      cnfs = cnfs_$16;
      mt = mt_$17;
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0, thread );
    }
    return Values.values( cnfs, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 6617L)
  public static SubLObject at_var_types_cnfs_clausify_int(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return at_var_types_cnfs_clausify_int_internal( sentence );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym10$AT_VAR_TYPES_CNFS_CLAUSIFY_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym10$AT_VAR_TYPES_CNFS_CLAUSIFY_INT, ONE_INTEGER, $int11$100, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym10$AT_VAR_TYPES_CNFS_CLAUSIFY_INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sentence, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( at_var_types_cnfs_clausify_int_internal( sentence ) ) );
      memoization_state.caching_state_put( caching_state, sentence, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 7296L)
  public static SubLObject opaque_arg_wrt_pragmatic_requirementP(final SubLObject formula, final SubLObject argnum)
  {
    return makeBoolean( NIL != cycl_utilities.default_opaque_argP( formula, argnum ) || ( ONE_INTEGER.numE( argnum ) && NIL != el_utilities.el_formula_with_operator_p( formula, $const13$pragmaticRequirement ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 7642L)
  public static SubLObject at_transform_true_sentence_negation_preds(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $at_true_sentence_negation_preds$.currentBinding( thread );
    try
    {
      $at_true_sentence_negation_preds$.bind( set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      SubLObject cdolist_list_var = negation_predicate.all_negation_predicates_memoized( $const14$trueSentence, mt, UNPROVIDED );
      SubLObject negation_pred = NIL;
      negation_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        set.set_add( negation_pred, $at_true_sentence_negation_preds$.getDynamicValue( thread ) );
        cdolist_list_var = cdolist_list_var.rest();
        negation_pred = cdolist_list_var.first();
      }
      final SubLObject _prev_bind_0_$18 = cycl_utilities.$opaque_arg_function$.currentBinding( thread );
      try
      {
        cycl_utilities.$opaque_arg_function$.bind( $sym15$OPAQUE_ARG_WRT_PRAGMATIC_REQUIREMENT_, thread );
        result = cycl_utilities.expression_transform( sentence, $sym16$AT_NEGATED_, $sym17$AT_NEGATE, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        cycl_utilities.$opaque_arg_function$.rebind( _prev_bind_0_$18, thread );
      }
    }
    finally
    {
      $at_true_sentence_negation_preds$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 8247L)
  public static SubLObject at_negatedP(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject operator = cycl_utilities.formula_arg0( formula );
    if( NIL != forts.fort_p( operator ) )
    {
      return set.set_memberP( operator, $at_true_sentence_negation_preds$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 8431L)
  public static SubLObject at_negate(final SubLObject formula)
  {
    return simplifier.el_negate( el_utilities.implicitify_explicit_existential_quantifiers( cycl_utilities.formula_arg1( formula, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 8559L)
  public static SubLObject at_var_type_repackage_cnfs(final SubLObject cnfs)
  {
    SubLObject result = NIL;
    if( cnfs.isCons() )
    {
      SubLObject cdolist_list_var = cnfs;
      SubLObject cnf = NIL;
      cnf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject neg_lits = clauses.neg_lits( cnf );
        final SubLObject pos_lits = clauses.pos_lits( cnf );
        if( NIL != list_utilities.singletonP( pos_lits ) )
        {
          final SubLObject item_var = cnf;
          if( NIL == conses_high.member( item_var, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var, result );
          }
        }
        else if( NIL != pos_lits )
        {
          SubLObject cdolist_list_var_$19 = pos_lits;
          SubLObject pos_lit = NIL;
          pos_lit = cdolist_list_var_$19.first();
          while ( NIL != cdolist_list_var_$19)
          {
            final SubLObject item_var2 = clauses.make_cnf( neg_lits, ConsesLow.list( transform_list_utilities.transform( pos_lit, $sym3$UNREIFIED_SKOLEM_TERM_, $sym6$SKOLEM_FUNCTION_VAR, UNPROVIDED ) ) );
            if( NIL == conses_high.member( item_var2, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              result = ConsesLow.cons( item_var2, result );
            }
            cdolist_list_var_$19 = cdolist_list_var_$19.rest();
            pos_lit = cdolist_list_var_$19.first();
          }
        }
        else
        {
          final SubLObject item_var = clauses.make_cnf( neg_lits, NIL );
          if( NIL == conses_high.member( item_var, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var, result );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        cnf = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 9308L)
  public static SubLObject cnf_var_types_okP(final SubLObject cnf, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLObject neg_lits = clauses.neg_lits( cnf );
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    SubLObject okP = T;
    SubLObject doneP = NIL;
    if( NIL != pos_lits )
    {
      if( NIL == doneP )
      {
        SubLObject csome_list_var = pos_lits;
        SubLObject pos_lit = NIL;
        pos_lit = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          okP = makeBoolean( NIL != cnfs_variables_arg_constraints_okP( ConsesLow.list( clauses.make_cnf( neg_lits, ConsesLow.list( pos_lit ) ) ), mt, varP ) && NIL != okP );
          doneP = at_utilities.at_finishedP( makeBoolean( NIL == okP ) );
          csome_list_var = csome_list_var.rest();
          pos_lit = csome_list_var.first();
        }
      }
    }
    else
    {
      okP = makeBoolean( NIL != cnfs_variables_arg_constraints_okP( ConsesLow.list( clauses.make_cnf( neg_lits, ConsesLow.list( NIL ) ) ), mt, varP ) && NIL != okP );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 10639L)
  public static SubLObject inter_cnf_var_types_okP(final SubLObject cnf, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLObject neg_lits = clauses.neg_lits( cnf );
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    SubLObject okP = T;
    SubLObject doneP = NIL;
    if( NIL != pos_lits )
    {
      if( NIL == doneP )
      {
        SubLObject csome_list_var = pos_lits;
        SubLObject pos_lit = NIL;
        pos_lit = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          okP = makeBoolean( NIL != inter_cnfs_variables_arg_constraints_okP( ConsesLow.list( clauses.make_cnf( neg_lits, ConsesLow.list( pos_lit ) ) ), mt, varP ) && NIL != okP );
          doneP = at_utilities.at_finishedP( makeBoolean( NIL == okP ) );
          csome_list_var = csome_list_var.rest();
          pos_lit = csome_list_var.first();
        }
      }
    }
    else
    {
      okP = makeBoolean( NIL != inter_cnfs_variables_arg_constraints_okP( ConsesLow.list( clauses.make_cnf( neg_lits, ConsesLow.list( NIL ) ) ), mt, varP ) && NIL != okP );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 11243L)
  public static SubLObject query_var_types_okP(final SubLObject query, SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = T;
    SubLObject dnfs = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = czer_vars.$expand_el_relationsP$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( ( NIL != fort_types_interface.mtP( mt ) ) ? mt : mt_relevance_macros.$mt$.getDynamicValue( thread ), thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      czer_vars.$expand_el_relationsP$.bind( NIL, thread );
      SubLObject error = NIL;
      if( NIL != wff.el_wff_syntaxP( query, UNPROVIDED ) )
      {
        try
        {
          thread.throwStack.push( $kw4$BAD_EXPONENTIAL_CONJUNCTION );
          thread.resetMultipleValues();
          final SubLObject dnfs_$20 = clausifier.dnf_clausal_form( query, mt );
          final SubLObject mt_$21 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          dnfs = dnfs_$20;
          mt = mt_$21;
        }
        catch( final Throwable ccatch_env_var )
        {
          error = Errors.handleThrowable( ccatch_env_var, $kw4$BAD_EXPONENTIAL_CONJUNCTION );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != error )
        {
          okP = NIL;
          at_utilities.note_at_violation( ConsesLow.list( $kw4$BAD_EXPONENTIAL_CONJUNCTION, query ) );
        }
      }
    }
    finally
    {
      czer_vars.$expand_el_relationsP$.rebind( _prev_bind_3, thread );
      czer_vars.$simplify_literalP$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL == wff_vars.$wff_violations$.getDynamicValue( thread ) )
    {
      if( dnfs.isCons() )
      {
        SubLObject cdolist_list_var = dnfs;
        SubLObject dnf = NIL;
        dnf = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          okP = makeBoolean( NIL != dnfs_variables_arg_constraints_okP( ConsesLow.list( dnf ), mt, varP ) && NIL != okP );
          cdolist_list_var = cdolist_list_var.rest();
          dnf = cdolist_list_var.first();
        }
      }
      return okP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 11973L)
  public static SubLObject term_variables_arg_constraints(final SubLObject v_term, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    return formula_variables_arg_constraints( el_utilities.make_unary_formula( $const18$termChosen, v_term ), mt, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 12271L)
  public static SubLObject formula_variables_arg_constraints(final SubLObject formula, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == wff.check_wff_expansionP( formula ) )
    {
      return cnfs_variables_arg_constraints( at_var_type_cnfs( formula, mt ), mt, varP );
    }
    thread.resetMultipleValues();
    final SubLObject expansion = at_el_expand_all( formula, mt );
    final SubLObject mt_$22 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == expansion || formula.equal( expansion ) )
    {
      return cnfs_variables_arg_constraints( at_var_type_cnfs( formula, mt_$22 ), mt_$22, varP );
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = wff_vars.$unexpanded_formula$.currentBinding( thread );
    final SubLObject _prev_bind_2 = wff_vars.$validate_expansionsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = wff_vars.$validating_expansionP$.currentBinding( thread );
    try
    {
      wff_vars.$unexpanded_formula$.bind( formula, thread );
      wff_vars.$validate_expansionsP$.bind( NIL, thread );
      wff_vars.$validating_expansionP$.bind( T, thread );
      thread.resetMultipleValues();
      final SubLObject cnfs = at_var_type_cnfs( el_utilities.make_binary_formula( $const19$and, formula, expansion ), mt_$22 );
      final SubLObject new_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = inter_cnfs_variables_arg_constraints( cnfs, new_mt, UNPROVIDED );
    }
    finally
    {
      wff_vars.$validating_expansionP$.rebind( _prev_bind_3, thread );
      wff_vars.$validate_expansionsP$.rebind( _prev_bind_2, thread );
      wff_vars.$unexpanded_formula$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 13227L)
  public static SubLObject at_el_expand_all(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject expansion = NIL;
    SubLObject new_mt = NIL;
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( $kw20$RECURSION_LIMIT_EXCEEDED );
      try
      {
        thread.throwStack.push( $kw21$INVALID_EXPANSION );
        thread.resetMultipleValues();
        final SubLObject expansion_$23 = verbosifier.el_expand_all( formula, mt );
        final SubLObject new_mt_$24 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        expansion = expansion_$23;
        new_mt = new_mt_$24;
      }
      catch( final Throwable ccatch_env_var )
      {
        error = Errors.handleThrowable( ccatch_env_var, $kw21$INVALID_EXPANSION );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error = Errors.handleThrowable( ccatch_env_var, $kw20$RECURSION_LIMIT_EXCEEDED );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      return NIL;
    }
    return Values.values( expansion, new_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 13542L)
  public static SubLObject parse_constraint(final SubLObject cur_constraints, final SubLObject new_constraint)
  {
    SubLObject isa_constraints = NIL;
    SubLObject genls_constraints = NIL;
    SubLObject quoted_isa_constraints = NIL;
    if( NIL != cur_constraints )
    {
      isa_constraints = cur_constraints.first();
      genls_constraints = conses_high.cadr( cur_constraints );
      quoted_isa_constraints = conses_high.cddr( cur_constraints ).first();
    }
    final SubLObject pcase_var = new_constraint.first();
    if( pcase_var.eql( $const22$isa ) )
    {
      return ConsesLow.list( cardinality_estimates.sort_by_generality_estimate( conses_high.union( ConsesLow.list( cycl_utilities.formula_arg2( new_constraint, UNPROVIDED ) ), isa_constraints, UNPROVIDED, UNPROVIDED ),
          UNPROVIDED ), genls_constraints, quoted_isa_constraints );
    }
    if( pcase_var.eql( $const23$genls ) )
    {
      return ConsesLow.list( isa_constraints, cardinality_estimates.sort_by_generality_estimate( conses_high.union( ConsesLow.list( conses_high.third( new_constraint ) ), genls_constraints, UNPROVIDED, UNPROVIDED ),
          UNPROVIDED ), quoted_isa_constraints );
    }
    if( pcase_var.eql( $const24$quotedIsa ) )
    {
      return ConsesLow.list( isa_constraints, genls_constraints, cardinality_estimates.sort_by_generality_estimate( conses_high.union( ConsesLow.list( cycl_utilities.formula_arg2( new_constraint, UNPROVIDED ) ),
          quoted_isa_constraints, UNPROVIDED, UNPROVIDED ), UNPROVIDED ) );
    }
    return cur_constraints;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 14882L)
  public static SubLObject formula_variables_arg_constraints_dict(final SubLObject formula, final SubLObject mt, SubLObject varP, SubLObject free_variables_onlyP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    if( free_variables_onlyP == UNPROVIDED )
    {
      free_variables_onlyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = wff_vars.$wff_memoization_state$.currentBinding( thread );
    try
    {
      wff_vars.$wff_memoization_state$.bind( wff_macros.possibly_new_wff_memoization_state(), thread );
      final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$25 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == wff_macros.within_wffP() )
          {
            wff.reset_wff_state();
          }
          final SubLObject free_variables = el_utilities.literal_free_variables( formula, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject cur_variable = NIL;
          SubLObject cur_constraints = NIL;
          final SubLObject all_constraints = formula_variables_arg_constraints( formula, mt, varP );
          final SubLObject cur_dictionary = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
          if( all_constraints.first().eql( $const19$and ) )
          {
            SubLObject cdolist_list_var = all_constraints;
            SubLObject constraint = NIL;
            constraint = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( constraint.isList() )
              {
                cur_variable = cycl_utilities.formula_arg1( constraint, UNPROVIDED );
                if( NIL == free_variables_onlyP || ( NIL != free_variables_onlyP && NIL != subl_promotions.memberP( cur_variable, free_variables, EQUAL, UNPROVIDED ) ) )
                {
                  cur_constraints = dictionary.dictionary_lookup( cur_dictionary, cur_variable, UNPROVIDED );
                  cur_constraints = parse_constraint( cur_constraints, constraint );
                  dictionary.dictionary_enter( cur_dictionary, cur_variable, cur_constraints );
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              constraint = cdolist_list_var.first();
            }
          }
          else if( NIL != all_constraints )
          {
            cur_variable = conses_high.second( all_constraints );
            cur_constraints = dictionary.dictionary_lookup( cur_dictionary, cur_variable, UNPROVIDED );
            cur_constraints = parse_constraint( cur_constraints, all_constraints );
            dictionary.dictionary_enter( cur_dictionary, cur_variable, cur_constraints );
          }
          return cur_dictionary;
        }
        finally
        {
          final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$25, thread );
      }
    }
    finally
    {
      wff_vars.$wff_memoization_state$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 16759L)
  public static SubLObject inter_formula_variables_arg_constraints(final SubLObject formula, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject cnfs = at_var_type_cnfs( formula, mt );
    final SubLObject new_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return inter_cnfs_variables_arg_constraints( cnfs, new_mt, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 17286L)
  public static SubLObject independent_formula_variables_arg_constraints(final SubLObject formula, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject cnfs = at_var_type_cnfs( formula, mt );
    final SubLObject new_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return independent_cnfs_variables_arg_constraints( cnfs, new_mt, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 17760L)
  public static SubLObject old_formula_variables_arg_constraints(final SubLObject formula, SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cnfs = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = czer_vars.$expand_el_relationsP$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( ( NIL != fort_types_interface.mtP( mt ) ) ? mt : mt_relevance_macros.$mt$.getDynamicValue( thread ), thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      czer_vars.$expand_el_relationsP$.bind( NIL, thread );
      if( NIL != wff.el_wff_syntaxP( formula, UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject cnfs_$27 = clausifier.cnf_clausal_form( formula, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
        final SubLObject mt_$28 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        cnfs = cnfs_$27;
        mt = mt_$28;
      }
    }
    finally
    {
      czer_vars.$expand_el_relationsP$.rebind( _prev_bind_3, thread );
      czer_vars.$simplify_literalP$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return cnfs_variables_arg_constraints( cnfs, mt, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 18147L)
  public static SubLObject query_variables_arg_constraints(final SubLObject query, SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject dnfs = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = czer_vars.$expand_el_relationsP$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( ( NIL != fort_types_interface.mtP( mt ) ) ? mt : mt_relevance_macros.$mt$.getDynamicValue( thread ), thread );
      czer_vars.$simplify_literalP$.bind( NIL, thread );
      czer_vars.$expand_el_relationsP$.bind( NIL, thread );
      if( NIL != wff.el_wff_syntaxP( query, UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject dnfs_$29 = clausifier.dnf_clausal_form( query, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
        final SubLObject mt_$30 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        dnfs = dnfs_$29;
        mt = mt_$30;
      }
    }
    finally
    {
      czer_vars.$expand_el_relationsP$.rebind( _prev_bind_3, thread );
      czer_vars.$simplify_literalP$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return dnfs_variables_arg_constraints( dnfs, mt, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 18521L)
  public static SubLObject inter_query_variables_arg_constraints(final SubLObject query, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject dnfs = at_var_type_dnfs( query, mt, NIL );
    final SubLObject new_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return inter_dnfs_variables_arg_constraints( dnfs, new_mt, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 19098L)
  public static SubLObject cnfs_variables_arg_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = cnf_variables_arg_constraints( cnf, mt, varP );
      if( NIL != var )
      {
        result = ConsesLow.cons( var, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    if( NIL == result )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( result ) )
    {
      return result.first();
    }
    final SubLObject conjoined = simplifier.conjoin( Sequences.nreverse( result ), UNPROVIDED );
    try
    {
      return simplifier.simplify_cycl_conjunction( conjoined, varP );
    }
    catch( final Throwable t )
    {
      return conjoined;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 19601L)
  public static SubLObject independent_cnfs_variables_arg_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    SubLObject result = NIL;
    SubLObject skolem_cnfs = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.tree_find_if( $sym3$UNREIFIED_SKOLEM_TERM_, cnf, UNPROVIDED ) )
      {
        skolem_cnfs = ConsesLow.cons( cnf, skolem_cnfs );
      }
      else
      {
        final SubLObject var = cnf_variables_arg_constraints( cnf, mt, varP );
        if( NIL != var )
        {
          result = ConsesLow.cons( var, result );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    cdolist_list_var = list_utilities.tree_gather( skolem_cnfs, $sym3$UNREIFIED_SKOLEM_TERM_, EQUAL, IDENTITY, NIL );
    SubLObject skolem = NIL;
    skolem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cnfs_of_skolem = NIL;
      SubLObject cdolist_list_var_$31 = skolem_cnfs;
      SubLObject cnf2 = NIL;
      cnf2 = cdolist_list_var_$31.first();
      while ( NIL != cdolist_list_var_$31)
      {
        if( NIL != list_utilities.tree_find( skolem, cnf2, EQUAL, UNPROVIDED ) )
        {
          cnfs_of_skolem = ConsesLow.cons( cnf2, cnfs_of_skolem );
        }
        cdolist_list_var_$31 = cdolist_list_var_$31.rest();
        cnf2 = cdolist_list_var_$31.first();
      }
      SubLObject cdolist_list_var_$32 = clause_utilities.group_clauses_having_common_neg_lits( cnfs_of_skolem, UNPROVIDED );
      SubLObject dependent_cnfs_of_skolem = NIL;
      dependent_cnfs_of_skolem = cdolist_list_var_$32.first();
      while ( NIL != cdolist_list_var_$32)
      {
        final SubLObject var2 = cnfs_variables_arg_constraints( dependent_cnfs_of_skolem, mt, varP );
        if( NIL != var2 )
        {
          result = ConsesLow.cons( var2, result );
        }
        cdolist_list_var_$32 = cdolist_list_var_$32.rest();
        dependent_cnfs_of_skolem = cdolist_list_var_$32.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      skolem = cdolist_list_var.first();
    }
    if( NIL == result )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( result ) )
    {
      return result.first();
    }
    return simplifier.simplify_cycl_disjunction( simplifier.disjoin( Sequences.nreverse( result ), UNPROVIDED ), varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 20590L)
  public static SubLObject inter_cnfs_variables_arg_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLObject vars = Sequences.nreverse( list_utilities.tree_gather( cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject isa_table = Hashtables.make_hash_table( Sequences.length( vars ), UNPROVIDED, UNPROVIDED );
    final SubLObject genls_table = Hashtables.make_hash_table( Sequences.length( vars ), UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$33 = cnf_variables_isa_constraints( cnf, mt, varP );
      SubLObject var_isa_constraints = NIL;
      var_isa_constraints = cdolist_list_var_$33.first();
      while ( NIL != cdolist_list_var_$33)
      {
        final SubLObject var = var_isa_constraints.first();
        final SubLObject isa_constraints = var_isa_constraints.rest();
        Hashtables.sethash( var, isa_table, ConsesLow.append( isa_constraints, Hashtables.gethash( var, isa_table, UNPROVIDED ) ) );
        cdolist_list_var_$33 = cdolist_list_var_$33.rest();
        var_isa_constraints = cdolist_list_var_$33.first();
      }
      SubLObject cdolist_list_var_$34 = cnf_variables_genl_constraints( cnf, mt, varP );
      SubLObject var_genl_constraints = NIL;
      var_genl_constraints = cdolist_list_var_$34.first();
      while ( NIL != cdolist_list_var_$34)
      {
        final SubLObject var = var_genl_constraints.first();
        final SubLObject genls_constraints = var_genl_constraints.rest();
        Hashtables.sethash( var, genls_table, ConsesLow.append( genls_constraints, Hashtables.gethash( var, genls_table, UNPROVIDED ) ) );
        cdolist_list_var_$34 = cdolist_list_var_$34.rest();
        var_genl_constraints = cdolist_list_var_$34.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    SubLObject var2 = NIL;
    SubLObject isa_constraints2 = NIL;
    Iterator cdohash_iterator = Hashtables.getEntrySetIterator( isa_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        var2 = Hashtables.getEntryKey( cdohash_entry );
        isa_constraints2 = Hashtables.getEntryValue( cdohash_entry );
        SubLObject cdolist_list_var2 = at_min_cols( Sequences.remove_duplicates( isa_constraints2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), mt );
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          result = ConsesLow.cons( el_utilities.make_binary_formula( $const22$isa, var2, v_isa ), result );
          cdolist_list_var2 = cdolist_list_var2.rest();
          v_isa = cdolist_list_var2.first();
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    var2 = NIL;
    SubLObject genls_constraints2 = NIL;
    cdohash_iterator = Hashtables.getEntrySetIterator( genls_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        var2 = Hashtables.getEntryKey( cdohash_entry );
        genls_constraints2 = Hashtables.getEntryValue( cdohash_entry );
        SubLObject cdolist_list_var2 = at_min_cols( Sequences.remove_duplicates( genls_constraints2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), mt );
        SubLObject genl = NIL;
        genl = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          result = ConsesLow.cons( el_utilities.make_binary_formula( $const23$genls, var2, genl ), result );
          cdolist_list_var2 = cdolist_list_var2.rest();
          genl = cdolist_list_var2.first();
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    if( NIL == result )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( result ) )
    {
      return result.first();
    }
    return simplifier.simplify_cycl_conjunction( simplifier.conjoin( Sequences.nreverse( result ), UNPROVIDED ), varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 22027L)
  public static SubLObject inter_cnfs_variables_isa_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject vars = Sequences.nreverse( list_utilities.tree_gather( cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject isa_table = dictionary.new_dictionary( Symbols.symbol_function( EQL ), Sequences.length( vars ) );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$35 = cnf_variables_isa_constraints( cnf, mt, varP );
      SubLObject var_isa_constraints = NIL;
      var_isa_constraints = cdolist_list_var_$35.first();
      while ( NIL != cdolist_list_var_$35)
      {
        final SubLObject var = var_isa_constraints.first();
        final SubLObject isa_constraints = var_isa_constraints.rest();
        dictionary_utilities.dictionary_append( isa_table, var, isa_constraints );
        cdolist_list_var_$35 = cdolist_list_var_$35.rest();
        var_isa_constraints = cdolist_list_var_$35.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( isa_table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject isa_constraints2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject var_result = NIL;
      SubLObject cdolist_list_var2 = at_min_cols( isa_constraints2, mt );
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        var_result = ConsesLow.cons( v_isa, var_result );
        cdolist_list_var2 = cdolist_list_var2.rest();
        v_isa = cdolist_list_var2.first();
      }
      var_result = ConsesLow.cons( var2, var_result );
      result = ConsesLow.cons( var_result, result );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 22852L)
  public static SubLObject inter_cnfs_variables_quoted_isa_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject vars = Sequences.nreverse( list_utilities.tree_gather( cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject quoted_isa_table = dictionary.new_dictionary( Symbols.symbol_function( EQL ), Sequences.length( vars ) );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$36 = cnf_variables_quoted_isa_constraints( cnf, mt, varP );
      SubLObject var_quoted_isa_constraints = NIL;
      var_quoted_isa_constraints = cdolist_list_var_$36.first();
      while ( NIL != cdolist_list_var_$36)
      {
        final SubLObject var = var_quoted_isa_constraints.first();
        final SubLObject quoted_isa_constraints = var_quoted_isa_constraints.rest();
        dictionary_utilities.dictionary_append( quoted_isa_table, var, quoted_isa_constraints );
        cdolist_list_var_$36 = cdolist_list_var_$36.rest();
        var_quoted_isa_constraints = cdolist_list_var_$36.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( quoted_isa_table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject quoted_isa_constraints2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject var_result = NIL;
      SubLObject cdolist_list_var2 = at_min_cols( quoted_isa_constraints2, mt );
      SubLObject quoted_isa = NIL;
      quoted_isa = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        var_result = ConsesLow.cons( quoted_isa, var_result );
        cdolist_list_var2 = cdolist_list_var2.rest();
        quoted_isa = cdolist_list_var2.first();
      }
      var_result = ConsesLow.cons( var2, var_result );
      result = ConsesLow.cons( var_result, result );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 23781L)
  public static SubLObject inter_cnfs_variables_genl_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject vars = Sequences.nreverse( list_utilities.tree_gather( cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject genl_table = dictionary.new_dictionary( Symbols.symbol_function( EQL ), Sequences.length( vars ) );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$37 = cnf_variables_genl_constraints( cnf, mt, varP );
      SubLObject var_genl_constraints = NIL;
      var_genl_constraints = cdolist_list_var_$37.first();
      while ( NIL != cdolist_list_var_$37)
      {
        final SubLObject var = var_genl_constraints.first();
        final SubLObject genl_constraints = var_genl_constraints.rest();
        dictionary_utilities.dictionary_append( genl_table, var, genl_constraints );
        cdolist_list_var_$37 = cdolist_list_var_$37.rest();
        var_genl_constraints = cdolist_list_var_$37.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( genl_table ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject genl_constraints2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject var_result = NIL;
      SubLObject cdolist_list_var2 = at_min_cols( genl_constraints2, mt );
      SubLObject genl = NIL;
      genl = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        var_result = ConsesLow.cons( genl, var_result );
        cdolist_list_var2 = cdolist_list_var2.rest();
        genl = cdolist_list_var2.first();
      }
      var_result = ConsesLow.cons( var2, var_result );
      result = ConsesLow.cons( var_result, result );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 24622L)
  public static SubLObject hl_cnf_variables_arg_constraints(final SubLObject cnf, final SubLObject mt)
  {
    return cnf_variables_arg_constraints( cnf, mt, $sym26$VARIABLE_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 24743L)
  public static SubLObject cnf_variables_arg_constraints(final SubLObject cnf, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cnf_variables_isa_constraints( cnf, mt, varP );
    SubLObject var_isa_constraints = NIL;
    var_isa_constraints = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = var_isa_constraints.first();
      final SubLObject isa_constraints = var_isa_constraints.rest();
      SubLObject cdolist_list_var_$38 = Sequences.reverse( isa_constraints );
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var_$38.first();
      while ( NIL != cdolist_list_var_$38)
      {
        result = ConsesLow.cons( el_utilities.make_binary_formula( $const22$isa, var, v_isa ), result );
        cdolist_list_var_$38 = cdolist_list_var_$38.rest();
        v_isa = cdolist_list_var_$38.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      var_isa_constraints = cdolist_list_var.first();
    }
    cdolist_list_var = cnf_variables_quoted_isa_constraints( cnf, mt, varP );
    SubLObject var_quoted_isa_constraints = NIL;
    var_quoted_isa_constraints = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = var_quoted_isa_constraints.first();
      final SubLObject quoted_isa_constraints = var_quoted_isa_constraints.rest();
      SubLObject cdolist_list_var_$39 = Sequences.reverse( quoted_isa_constraints );
      SubLObject quoted_isa = NIL;
      quoted_isa = cdolist_list_var_$39.first();
      while ( NIL != cdolist_list_var_$39)
      {
        result = ConsesLow.cons( el_utilities.make_binary_formula( $const24$quotedIsa, var, quoted_isa ), result );
        cdolist_list_var_$39 = cdolist_list_var_$39.rest();
        quoted_isa = cdolist_list_var_$39.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      var_quoted_isa_constraints = cdolist_list_var.first();
    }
    cdolist_list_var = cnf_variables_genl_constraints( cnf, mt, varP );
    SubLObject var_genl_constraints = NIL;
    var_genl_constraints = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = var_genl_constraints.first();
      final SubLObject genl_constraints = var_genl_constraints.rest();
      SubLObject cdolist_list_var_$40 = Sequences.reverse( genl_constraints );
      SubLObject genl = NIL;
      genl = cdolist_list_var_$40.first();
      while ( NIL != cdolist_list_var_$40)
      {
        result = ConsesLow.cons( el_utilities.make_binary_formula( $const23$genls, var, genl ), result );
        cdolist_list_var_$40 = cdolist_list_var_$40.rest();
        genl = cdolist_list_var_$40.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      var_genl_constraints = cdolist_list_var.first();
    }
    if( NIL == result )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( result ) )
    {
      return result.first();
    }
    return simplifier.conjoin( Sequences.nreverse( result ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 25994L)
  public static SubLObject inter_cnfs_variables_arg_constraints_okP(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject formula = wff_vars.unexpanded_formula();
    if( NIL != wff_vars.$validating_expansionP$.getDynamicValue( thread ) && NIL != el_utilities.genls_litP( formula ) && NIL != sdc.sdcP( cycl_utilities.formula_arg1( formula, UNPROVIDED ), cycl_utilities.formula_arg2(
        formula, UNPROVIDED ), UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding( thread );
      try
      {
        sdc.$ignoring_sdcP$.bind( T, thread );
        ans = inter_cnfs_variables_arg_constraints_okP_int( cnfs, mt, varP );
      }
      finally
      {
        sdc.$ignoring_sdcP$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      ans = inter_cnfs_variables_arg_constraints_okP_int( cnfs, mt, varP );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 26473L)
  public static SubLObject inter_cnfs_variables_arg_constraints_okP_int(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLObject isa_constraints = inter_cnfs_variables_isa_constraints( cnfs, mt, varP );
    return makeBoolean( NIL != var_types_okP( isa_constraints, $kw27$ISA, mt ) && NIL != var_types_okP( inter_cnfs_variables_quoted_isa_constraints( cnfs, mt, varP ), $kw28$QUOTED_ISA, mt ) && NIL != var_types_okP(
        inter_cnfs_variables_genl_constraints( cnfs, mt, varP ), $kw29$GENLS, mt ) && NIL != cnfs_var_constraint_implications_okP( cnfs, isa_constraints, mt, varP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 26972L)
  public static SubLObject cnfs_variables_arg_constraints_okP(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLObject isa_constraints = cnfs_variables_isa_constraints( cnfs, mt, varP );
    return makeBoolean( NIL != var_types_okP( isa_constraints, $kw27$ISA, mt ) && NIL != var_types_okP( cnfs_variables_quoted_isa_constraints( cnfs, mt, varP ), $kw28$QUOTED_ISA, mt ) && NIL != var_types_okP(
        cnfs_variables_genl_constraints( cnfs, mt, varP ), $kw29$GENLS, mt ) && NIL != cnfs_var_constraint_implications_okP( cnfs, isa_constraints, mt, varP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 27443L)
  public static SubLObject cnf_variables_arg_constraints_okP(final SubLObject cnf, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLObject isa_constraints = cnf_variables_isa_constraints( cnf, mt, varP );
    return makeBoolean( NIL != var_types_okP( isa_constraints, $kw27$ISA, mt ) && NIL != var_types_okP( cnf_variables_quoted_isa_constraints( cnf, mt, varP ), $kw28$QUOTED_ISA, mt ) && NIL != var_types_okP(
        cnf_variables_genl_constraints( cnf, mt, varP ), $kw29$GENLS, mt ) && NIL != cnf_var_constraint_implications_okP( cnf, isa_constraints, mt, varP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 27904L)
  public static SubLObject var_isa_constraints_wrt_cnfs(final SubLObject var, final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    return conses_high.assoc( var, cnfs_variables_isa_constraints( cnfs, mt, varP ), UNPROVIDED, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 28094L)
  public static SubLObject var_genl_constraints_wrt_cnfs(final SubLObject var, final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    return conses_high.assoc( var, cnfs_variables_genl_constraints( cnfs, mt, varP ), UNPROVIDED, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 28286L)
  public static SubLObject cnfs_variables_isa_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym26$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var;
    final SubLObject vars = cdolist_list_var = Sequences.nreverse( list_utilities.tree_gather( cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cols = at_min_cols( cnfs_variable_isa_constraints( var, cnfs, mt ), mt );
      constraints = ConsesLow.cons( ConsesLow.cons( var, cols ), constraints );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    if( NIL != constraints && NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue( thread ) )
    {
      cdolist_list_var = vars;
      var = NIL;
      var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject cols = at_min_cols( cnfs_variable_inter_arg_isa_constraints( var, cnfs, constraints, mt ), mt );
        result = ConsesLow.cons( ConsesLow.cons( var, cols ), result );
        cdolist_list_var = cdolist_list_var.rest();
        var = cdolist_list_var.first();
      }
    }
    else
    {
      result = constraints;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 28891L)
  public static SubLObject cnfs_variables_quoted_isa_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym26$VARIABLE_P;
    }
    SubLObject result = NIL;
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var;
    final SubLObject vars = cdolist_list_var = Sequences.nreverse( list_utilities.tree_gather( cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cols = at_min_cols( cnfs_variable_quoted_isa_constraints( var, cnfs, mt ), mt );
      constraints = ConsesLow.cons( ConsesLow.cons( var, cols ), constraints );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    result = constraints;
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 29339L)
  public static SubLObject cnfs_variables_genl_constraints(final SubLObject cnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym26$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var;
    final SubLObject vars = cdolist_list_var = Sequences.nreverse( list_utilities.tree_gather( cnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cols = at_min_cols( cnfs_variable_genl_constraints( var, cnfs, mt ), mt );
      constraints = ConsesLow.cons( ConsesLow.cons( var, cols ), constraints );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    if( NIL != constraints && NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue( thread ) )
    {
      cdolist_list_var = vars;
      var = NIL;
      var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject cols = at_min_cols( cnfs_variable_inter_arg_genl_constraints( var, cnfs, constraints, mt ), mt );
        result = ConsesLow.cons( ConsesLow.cons( var, cols ), result );
        cdolist_list_var = cdolist_list_var.rest();
        var = cdolist_list_var.first();
      }
    }
    else
    {
      result = constraints;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 29912L)
  public static SubLObject cnfs_variable_isa_constraints(final SubLObject var, final SubLObject cnfs, final SubLObject mt)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.nconc( result, cnf_variable_isa_constraints( var, cnf, mt ) );
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 30193L)
  public static SubLObject cnfs_variable_quoted_isa_constraints(final SubLObject var, final SubLObject cnfs, final SubLObject mt)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.nconc( result, cnf_variable_quoted_isa_constraints( var, cnf, mt ) );
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 30460L)
  public static SubLObject cnfs_variable_genl_constraints(final SubLObject var, final SubLObject cnfs, final SubLObject mt)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.nconc( result, cnf_variable_genl_constraints( var, cnf, mt ) );
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 30713L)
  public static SubLObject cnf_variables_isa_constraints(final SubLObject cnf, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym26$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    if( NIL != pos_lits )
    {
      final SubLObject vars = Sequences.nreverse( list_utilities.tree_gather( cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      SubLObject result = NIL;
      SubLObject constraints = NIL;
      SubLObject cdolist_list_var = vars;
      SubLObject var = NIL;
      var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue( thread ) || NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          final SubLObject cols = at_min_cols( cnf_variable_isa_constraints( var, cnf, mt ), mt );
          constraints = ConsesLow.cons( ConsesLow.cons( var, cols ), constraints );
        }
        cdolist_list_var = cdolist_list_var.rest();
        var = cdolist_list_var.first();
      }
      if( NIL != constraints && NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue( thread ) )
      {
        cdolist_list_var = vars;
        var = NIL;
        var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject cols = at_min_cols( cnf_variable_inter_arg_isa_constraints( var, cnf, constraints, mt ), mt );
          result = ConsesLow.cons( ConsesLow.cons( var, cols ), result );
          cdolist_list_var = cdolist_list_var.rest();
          var = cdolist_list_var.first();
        }
      }
      else
      {
        result = constraints;
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 31728L)
  public static SubLObject cnf_variables_quoted_isa_constraints(final SubLObject cnf, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym26$VARIABLE_P;
    }
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    if( NIL != pos_lits )
    {
      final SubLObject vars = Sequences.nreverse( list_utilities.tree_gather( cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      SubLObject result = NIL;
      SubLObject constraints = NIL;
      SubLObject cdolist_list_var = vars;
      SubLObject var = NIL;
      var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
        }
        final SubLObject cols = at_min_cols( cnf_variable_quoted_isa_constraints( var, cnf, mt ), mt );
        constraints = ConsesLow.cons( ConsesLow.cons( var, cols ), constraints );
        cdolist_list_var = cdolist_list_var.rest();
        var = cdolist_list_var.first();
      }
      result = constraints;
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 32410L)
  public static SubLObject cnf_variables_genl_constraints(final SubLObject cnf, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym26$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    if( NIL != pos_lits )
    {
      final SubLObject vars = Sequences.nreverse( list_utilities.tree_gather( cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      SubLObject result = NIL;
      SubLObject constraints = NIL;
      SubLObject cdolist_list_var = vars;
      SubLObject var = NIL;
      var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue( thread ) || NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          final SubLObject cols = at_min_cols( cnf_variable_genl_constraints( var, cnf, mt ), mt );
          constraints = ConsesLow.cons( ConsesLow.cons( var, cols ), constraints );
        }
        cdolist_list_var = cdolist_list_var.rest();
        var = cdolist_list_var.first();
      }
      if( NIL != constraints && NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue( thread ) )
      {
        cdolist_list_var = vars;
        var = NIL;
        var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject cols = at_min_cols( cnf_variable_inter_arg_genl_constraints( var, cnf, constraints, mt ), mt );
          result = ConsesLow.cons( ConsesLow.cons( var, cols ), result );
          cdolist_list_var = cdolist_list_var.rest();
          var = cdolist_list_var.first();
        }
      }
      else
      {
        result = constraints;
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 33284L)
  public static SubLObject cnf_variable_isa_constraints(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    if( NIL != cycl_utilities.expression_find( var, cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return conses_high.copy_list( cnf_variable_isa_constraints_int( var, cnf, mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 33533L)
  public static SubLObject cnf_variable_isa_constraints_int_internal(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    SubLObject result = NIL;
    if( NIL != pos_lits )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
      try
      {
        at_vars.$at_arg$.bind( var, thread );
        final SubLObject neg_lits = clauses.neg_lits( cnf );
        final SubLObject free_vars = clause_utilities.clause_free_variables( cnf, cycl_variables.variable_predicate_fn( var ), UNPROVIDED );
        final SubLObject _prev_bind_0_$41 = at_vars.$within_disjunctionP$.currentBinding( thread );
        try
        {
          at_vars.$within_disjunctionP$.bind( makeBoolean( ( NIL != neg_lits && NIL != pos_lits ) || NIL != conses_high.second( neg_lits ) ), thread );
          if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
          {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              result = ConsesLow.nconc( result, cnf_neg_lit_variable_isa_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            cdolist_list_var = pos_lits;
            literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != el_utilities.mt_designating_literalP( literal ) )
              {
                final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
                final SubLObject mt_arg = el_utilities.designated_mt( literal );
                final SubLObject subformula = el_utilities.designated_sentence( literal );
                final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
                if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
                {
                  result = ConsesLow.nconc( result, formula_variable_isa_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
                }
              }
              result = ConsesLow.nconc( result, cnf_pos_lit_variable_isa_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            result = list_utilities.delete_duplicate_forts( result );
          }
        }
        finally
        {
          at_vars.$within_disjunctionP$.rebind( _prev_bind_0_$41, thread );
        }
      }
      finally
      {
        at_vars.$at_arg$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 33533L)
  public static SubLObject cnf_variable_isa_constraints_int(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return cnf_variable_isa_constraints_int_internal( var, cnf, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym30$CNF_VARIABLE_ISA_CONSTRAINTS_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym30$CNF_VARIABLE_ISA_CONSTRAINTS_INT, THREE_INTEGER, $int11$100, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym30$CNF_VARIABLE_ISA_CONSTRAINTS_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( var, cnf, mt );
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
        if( var.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( cnf.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( cnf_variable_isa_constraints_int_internal( var, cnf, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( var, cnf, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 34891L)
  public static SubLObject cnf_variable_quoted_isa_constraints(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    if( NIL != cycl_utilities.expression_find( var, cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return conses_high.copy_list( cnf_variable_quoted_isa_constraints_int( var, cnf, mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 35084L)
  public static SubLObject cnf_variable_quoted_isa_constraints_int_internal(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    SubLObject result = NIL;
    if( NIL != pos_lits )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
      try
      {
        at_vars.$at_arg$.bind( var, thread );
        final SubLObject neg_lits = clauses.neg_lits( cnf );
        final SubLObject free_vars = clause_utilities.clause_free_variables( cnf, cycl_variables.variable_predicate_fn( var ), UNPROVIDED );
        final SubLObject _prev_bind_0_$42 = at_vars.$within_disjunctionP$.currentBinding( thread );
        try
        {
          at_vars.$within_disjunctionP$.bind( makeBoolean( ( NIL != neg_lits && NIL != pos_lits ) || NIL != conses_high.second( neg_lits ) ), thread );
          if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
          {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              result = ConsesLow.nconc( result, cnf_neg_lit_variable_quoted_isa_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            cdolist_list_var = pos_lits;
            literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != el_utilities.mt_designating_literalP( literal ) )
              {
                final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
                final SubLObject mt_arg = el_utilities.designated_mt( literal );
                final SubLObject subformula = el_utilities.designated_sentence( literal );
                final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
                if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
                {
                  result = ConsesLow.nconc( result, formula_variable_quoted_isa_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
                }
              }
              result = ConsesLow.nconc( result, cnf_pos_lit_variable_quoted_isa_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            result = list_utilities.delete_duplicate_forts( result );
          }
        }
        finally
        {
          at_vars.$within_disjunctionP$.rebind( _prev_bind_0_$42, thread );
        }
      }
      finally
      {
        at_vars.$at_arg$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 35084L)
  public static SubLObject cnf_variable_quoted_isa_constraints_int(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return cnf_variable_quoted_isa_constraints_int_internal( var, cnf, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym31$CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym31$CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT, THREE_INTEGER, $int11$100, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym31$CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( var, cnf, mt );
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
        if( var.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( cnf.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( cnf_variable_quoted_isa_constraints_int_internal( var, cnf, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( var, cnf, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 36470L)
  public static SubLObject cnf_variable_genl_constraints(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    if( NIL != cycl_utilities.expression_find( var, cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return conses_high.copy_list( cnf_variable_genl_constraints_int( var, cnf, mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 36651L)
  public static SubLObject cnf_variable_genl_constraints_int_internal(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    SubLObject result = NIL;
    if( NIL != pos_lits )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
      try
      {
        at_vars.$at_arg$.bind( var, thread );
        final SubLObject neg_lits = clauses.neg_lits( cnf );
        final SubLObject free_vars = clause_utilities.clause_free_variables( cnf, cycl_variables.variable_predicate_fn( var ), UNPROVIDED );
        final SubLObject _prev_bind_0_$43 = at_vars.$within_disjunctionP$.currentBinding( thread );
        try
        {
          at_vars.$within_disjunctionP$.bind( makeBoolean( ( NIL != neg_lits && NIL != pos_lits ) || NIL != conses_high.second( neg_lits ) ), thread );
          if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
          {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              result = ConsesLow.nconc( result, cnf_neg_lit_variable_genl_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            cdolist_list_var = pos_lits;
            literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != el_utilities.mt_designating_literalP( literal ) )
              {
                final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
                final SubLObject mt_arg = el_utilities.designated_mt( literal );
                final SubLObject subformula = el_utilities.designated_sentence( literal );
                final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
                if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
                {
                  result = ConsesLow.nconc( result, formula_variable_genl_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, mt ) ) );
                }
              }
              result = ConsesLow.nconc( result, cnf_pos_lit_variable_genl_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            result = list_utilities.delete_duplicate_forts( result );
          }
        }
        finally
        {
          at_vars.$within_disjunctionP$.rebind( _prev_bind_0_$43, thread );
        }
      }
      finally
      {
        at_vars.$at_arg$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 36651L)
  public static SubLObject cnf_variable_genl_constraints_int(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return cnf_variable_genl_constraints_int_internal( var, cnf, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym32$CNF_VARIABLE_GENL_CONSTRAINTS_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym32$CNF_VARIABLE_GENL_CONSTRAINTS_INT, THREE_INTEGER, $int11$100, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym32$CNF_VARIABLE_GENL_CONSTRAINTS_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( var, cnf, mt );
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
        if( var.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( cnf.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( cnf_variable_genl_constraints_int_internal( var, cnf, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( var, cnf, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 38022L)
  public static SubLObject cnfs_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject cnfs, final SubLObject constraints, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == constraints && NIL != list_utilities.singletonP( cnfs ) && NIL != clause_utilities.atomic_clause_with_all_var_argsP( cnfs.first() ) )
    {
      return NIL;
    }
    SubLObject result = conses_high.assoc( var, constraints, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_var_isa$.currentBinding( thread );
    try
    {
      at_vars.$at_arg$.bind( var, thread );
      at_vars.$at_var_isa$.bind( constraints, thread );
      SubLObject cdolist_list_var = cnfs;
      SubLObject cnf = NIL;
      cnf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.nconc( result, cnf_variable_inter_arg_isa_constraints_int( var, cnf, mt ) );
        cdolist_list_var = cdolist_list_var.rest();
        cnf = cdolist_list_var.first();
      }
    }
    finally
    {
      at_vars.$at_var_isa$.rebind( _prev_bind_2, thread );
      at_vars.$at_arg$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 38748L)
  public static SubLObject cnfs_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject cnfs, final SubLObject constraints, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == constraints && NIL != list_utilities.singletonP( cnfs ) && NIL != clause_utilities.atomic_clause_with_all_var_argsP( cnfs.first() ) )
    {
      return NIL;
    }
    SubLObject result = conses_high.assoc( var, constraints, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_var_genl$.currentBinding( thread );
    try
    {
      at_vars.$at_arg$.bind( var, thread );
      at_vars.$at_var_genl$.bind( constraints, thread );
      SubLObject cdolist_list_var = cnfs;
      SubLObject cnf = NIL;
      cnf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.nconc( result, cnf_variable_inter_arg_genl_constraints_int( var, cnf, mt ) );
        cdolist_list_var = cdolist_list_var.rest();
        cnf = cdolist_list_var.first();
      }
    }
    finally
    {
      at_vars.$at_var_genl$.rebind( _prev_bind_2, thread );
      at_vars.$at_arg$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 39480L)
  public static SubLObject cnf_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject cnf, final SubLObject constraints, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = conses_high.assoc( var, constraints, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_var_isa$.currentBinding( thread );
    try
    {
      at_vars.$at_arg$.bind( var, thread );
      at_vars.$at_var_isa$.bind( constraints, thread );
      result = ConsesLow.nconc( result, cnf_variable_inter_arg_isa_constraints_int( var, cnf, mt ) );
    }
    finally
    {
      at_vars.$at_var_isa$.rebind( _prev_bind_2, thread );
      at_vars.$at_arg$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 39863L)
  public static SubLObject cnf_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject cnf, final SubLObject constraints, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = conses_high.assoc( var, constraints, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_var_genl$.currentBinding( thread );
    try
    {
      at_vars.$at_arg$.bind( var, thread );
      at_vars.$at_var_genl$.bind( constraints, thread );
      result = ConsesLow.nconc( result, cnf_variable_inter_arg_genl_constraints_int( var, cnf, mt ) );
    }
    finally
    {
      at_vars.$at_var_genl$.rebind( _prev_bind_2, thread );
      at_vars.$at_arg$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 40249L)
  public static SubLObject cnf_variable_inter_arg_isa_constraints_int(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    if( NIL != list_utilities.tree_find( var, cnf, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return conses_high.copy_list( cnf_variable_inter_arg_isa_constraints_int_2( var, cnf, mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 40454L)
  public static SubLObject cnf_variable_inter_arg_isa_constraints_int_2_internal(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != clause_utilities.atomic_clause_with_all_var_argsP( cnf ) && NIL == at_vars.$at_var_isa$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    SubLObject result = NIL;
    if( NIL != pos_lits )
    {
      final SubLObject neg_lits = clauses.neg_lits( cnf );
      final SubLObject free_vars = clause_utilities.clause_free_variables( cnf, cycl_variables.variable_predicate_fn( var ), UNPROVIDED );
      final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding( thread );
      try
      {
        at_vars.$within_disjunctionP$.bind( makeBoolean( ( NIL != neg_lits && NIL != pos_lits ) || NIL != conses_high.second( neg_lits ) ), thread );
        if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var = neg_lits;
          SubLObject literal = NIL;
          literal = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            result = ConsesLow.nconc( result, neg_lit_variable_inter_arg_isa_constraints( var, literal, mt ) );
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
          }
          cdolist_list_var = pos_lits;
          literal = NIL;
          literal = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != el_utilities.mt_designating_literalP( literal ) )
            {
              final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
              final SubLObject mt_arg = el_utilities.designated_mt( literal );
              final SubLObject subformula = el_utilities.designated_sentence( literal );
              final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
              if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
              {
                result = ConsesLow.nconc( result, formula_variable_inter_arg_isa_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
              }
            }
            result = ConsesLow.nconc( result, pos_lit_variable_inter_arg_isa_constraints( var, literal, mt ) );
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
          }
          result = list_utilities.delete_duplicate_forts( result );
        }
      }
      finally
      {
        at_vars.$within_disjunctionP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 40454L)
  public static SubLObject cnf_variable_inter_arg_isa_constraints_int_2(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return cnf_variable_inter_arg_isa_constraints_int_2_internal( var, cnf, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym33$CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym33$CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2, THREE_INTEGER, $int11$100, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym33$CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( var, cnf, mt );
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
        if( var.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( cnf.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( cnf_variable_inter_arg_isa_constraints_int_2_internal( var, cnf, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( var, cnf, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 42186L)
  public static SubLObject cnf_variable_inter_arg_genl_constraints_int(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    if( NIL != list_utilities.tree_find( var, cnf, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return conses_high.copy_list( cnf_variable_inter_arg_genl_constraints_int_2( var, cnf, mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 42393L)
  public static SubLObject cnf_variable_inter_arg_genl_constraints_int_2_internal(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != clause_utilities.atomic_clause_with_all_var_argsP( cnf ) && NIL == at_vars.$at_var_genl$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    SubLObject result = NIL;
    if( NIL != pos_lits )
    {
      final SubLObject neg_lits = clauses.neg_lits( cnf );
      final SubLObject free_vars = clause_utilities.clause_free_variables( cnf, cycl_variables.variable_predicate_fn( var ), UNPROVIDED );
      final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding( thread );
      try
      {
        at_vars.$within_disjunctionP$.bind( makeBoolean( ( NIL != neg_lits && NIL != pos_lits ) || NIL != conses_high.second( neg_lits ) ), thread );
        if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var = neg_lits;
          SubLObject literal = NIL;
          literal = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            result = ConsesLow.nconc( result, neg_lit_variable_inter_arg_genl_constraints( var, literal, mt ) );
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
          }
          cdolist_list_var = pos_lits;
          literal = NIL;
          literal = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != el_utilities.mt_designating_literalP( literal ) )
            {
              final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
              final SubLObject mt_arg = el_utilities.designated_mt( literal );
              final SubLObject subformula = el_utilities.designated_sentence( literal );
              final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
              if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
              {
                result = ConsesLow.nconc( result, formula_variable_inter_arg_genl_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
              }
            }
            result = ConsesLow.nconc( result, pos_lit_variable_inter_arg_genl_constraints( var, literal, mt ) );
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
          }
          result = list_utilities.delete_duplicate_forts( result );
        }
      }
      finally
      {
        at_vars.$within_disjunctionP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 42393L)
  public static SubLObject cnf_variable_inter_arg_genl_constraints_int_2(final SubLObject var, final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return cnf_variable_inter_arg_genl_constraints_int_2_internal( var, cnf, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym34$CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym34$CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2, THREE_INTEGER, $int11$100, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym34$CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( var, cnf, mt );
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
        if( var.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( cnf.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( cnf_variable_inter_arg_genl_constraints_int_2_internal( var, cnf, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( var, cnf, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 44135L)
  public static SubLObject cnfs_var_constraint_implications_okP(final SubLObject cnfs, final SubLObject isa_constraints, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    SubLObject cdolist_list_var = cnfs;
    SubLObject cnf = NIL;
    cnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == cnf_var_constraint_implications_okP( cnf, isa_constraints, mt, varP ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      cnf = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 44372L)
  public static SubLObject cnf_var_constraint_implications_okP(final SubLObject cnf, final SubLObject isa_constraints, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject badP = NIL;
    if( NIL != isa_constraints && NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue( thread ) && NIL == clause_utilities.atomic_clause_with_all_var_argsP( cnf ) )
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
        SubLObject rest;
        SubLObject asent;
        SubLObject pred;
        SubLObject genl_somethingP;
        SubLObject _prev_bind_0_$44;
        SubLObject _prev_bind_1_$45;
        SubLObject _prev_bind_2_$46;
        SubLObject ind_argnum;
        SubLObject args;
        SubLObject rest_$47;
        SubLObject ind_arg;
        SubLObject ind_arg_isas;
        SubLObject dep_argnum;
        SubLObject args_$48;
        SubLObject rest_$48;
        SubLObject dep_arg;
        SubLObject dep_constraints;
        SubLObject csome_list_var;
        SubLObject ind_arg_isa;
        SubLObject items_var;
        SubLObject vector_var;
        SubLObject backwardP_var;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject item;
        SubLObject cdolist_list_var;
        SubLObject item2;
        for( rest = NIL, rest = clauses.pos_lits( cnf ); NIL == badP && NIL != rest; rest = rest.rest() )
        {
          asent = rest.first();
          pred = cycl_utilities.atomic_sentence_predicate( asent );
          genl_somethingP = ( NIL != forts.fort_p( pred ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( pred, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( pred, UNPROVIDED, UNPROVIDED ) )
              : NIL;
          _prev_bind_0_$44 = at_vars.$at_reln$.currentBinding( thread );
          _prev_bind_1_$45 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
          _prev_bind_2_$46 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
          try
          {
            at_vars.$at_reln$.bind( pred, thread );
            at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
            at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
            ind_argnum = ZERO_INTEGER;
            args = cycl_utilities.formula_args( asent, $kw35$IGNORE );
            for( rest_$47 = NIL, rest_$47 = args; NIL == badP && NIL != rest_$47; rest_$47 = rest_$47.rest() )
            {
              ind_arg = rest_$47.first();
              ind_argnum = Numbers.add( ind_argnum, ONE_INTEGER );
              ind_arg_isas = list_utilities.alist_lookup( isa_constraints, ind_arg, UNPROVIDED, UNPROVIDED );
              if( NIL != ind_arg_isas )
              {
                dep_argnum = ZERO_INTEGER;
                args_$48 = cycl_utilities.formula_args( asent, $kw35$IGNORE );
                for( rest_$48 = NIL, rest_$48 = args_$48; NIL == badP && NIL != rest_$48; rest_$48 = rest_$48.rest() )
                {
                  dep_arg = rest_$48.first();
                  dep_argnum = Numbers.add( dep_argnum, ONE_INTEGER );
                  if( !ind_argnum.numE( dep_argnum ) && NIL != el_utilities.groundP( dep_arg, varP ) )
                  {
                    dep_constraints = NIL;
                    if( NIL == badP )
                    {
                      csome_list_var = ind_arg_isas;
                      ind_arg_isa = NIL;
                      ind_arg_isa = csome_list_var.first();
                      while ( NIL == badP && NIL != csome_list_var)
                      {
                        items_var = inter_arg_isa_from_type( pred, dep_argnum, ind_arg_isa, ind_argnum );
                        if( items_var.isVector() )
                        {
                          vector_var = items_var;
                          backwardP_var = NIL;
                          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                          {
                            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                            item = Vectors.aref( vector_var, element_num );
                            dep_constraints = ConsesLow.cons( item, dep_constraints );
                          }
                        }
                        else
                        {
                          cdolist_list_var = items_var;
                          item2 = NIL;
                          item2 = cdolist_list_var.first();
                          while ( NIL != cdolist_list_var)
                          {
                            dep_constraints = ConsesLow.cons( item2, dep_constraints );
                            cdolist_list_var = cdolist_list_var.rest();
                            item2 = cdolist_list_var.first();
                          }
                        }
                        csome_list_var = csome_list_var.rest();
                        ind_arg_isa = csome_list_var.first();
                      }
                    }
                    if( NIL != isa.not_isa_someP( dep_arg, dep_constraints, UNPROVIDED, UNPROVIDED ) )
                    {
                      at_utilities.note_at_violation( ConsesLow.list( $kw36$DISJOINT_ARG_ISA, dep_arg, ConsesLow.append( dep_constraints, isa.isa( dep_arg, UNPROVIDED, UNPROVIDED ) ), mt ) );
                      badP = T;
                    }
                  }
                }
              }
            }
          }
          finally
          {
            at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_2_$46, thread );
            at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$45, thread );
            at_vars.$at_reln$.rebind( _prev_bind_0_$44, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return makeBoolean( NIL == badP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 45853L)
  public static SubLObject dnfs_variables_arg_constraints(final SubLObject dnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = dnfs;
    SubLObject dnf = NIL;
    dnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = dnf_variables_arg_constraints( dnf, mt, varP );
      if( NIL != var )
      {
        result = ConsesLow.cons( var, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      dnf = cdolist_list_var.first();
    }
    if( NIL == result )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( result ) )
    {
      return result.first();
    }
    return simplifier.simplify_cycl_disjunction( simplifier.disjoin( Sequences.nreverse( result ), UNPROVIDED ), varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 46489L)
  public static SubLObject inter_dnfs_variables_arg_constraints(final SubLObject dnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    final SubLObject vars = Sequences.nreverse( list_utilities.tree_gather( dnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject isa_table = Hashtables.make_hash_table( Sequences.length( vars ), UNPROVIDED, UNPROVIDED );
    final SubLObject genls_table = Hashtables.make_hash_table( Sequences.length( vars ), UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = dnfs;
    SubLObject dnf = NIL;
    dnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$50 = dnf_variables_isa_constraints( dnf, mt, varP );
      SubLObject var_isa_constraints = NIL;
      var_isa_constraints = cdolist_list_var_$50.first();
      while ( NIL != cdolist_list_var_$50)
      {
        final SubLObject var = var_isa_constraints.first();
        final SubLObject isa_constraints = var_isa_constraints.rest();
        Hashtables.sethash( var, isa_table, ConsesLow.append( isa_constraints, Hashtables.gethash( var, isa_table, UNPROVIDED ) ) );
        cdolist_list_var_$50 = cdolist_list_var_$50.rest();
        var_isa_constraints = cdolist_list_var_$50.first();
      }
      SubLObject cdolist_list_var_$51 = dnf_variables_genl_constraints( dnf, mt, varP );
      SubLObject var_genl_constraints = NIL;
      var_genl_constraints = cdolist_list_var_$51.first();
      while ( NIL != cdolist_list_var_$51)
      {
        final SubLObject var = var_genl_constraints.first();
        final SubLObject genls_constraints = var_genl_constraints.rest();
        Hashtables.sethash( var, genls_table, ConsesLow.append( genls_constraints, Hashtables.gethash( var, genls_table, UNPROVIDED ) ) );
        cdolist_list_var_$51 = cdolist_list_var_$51.rest();
        var_genl_constraints = cdolist_list_var_$51.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      dnf = cdolist_list_var.first();
    }
    SubLObject var2 = NIL;
    SubLObject isa_constraints2 = NIL;
    Iterator cdohash_iterator = Hashtables.getEntrySetIterator( isa_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        var2 = Hashtables.getEntryKey( cdohash_entry );
        isa_constraints2 = Hashtables.getEntryValue( cdohash_entry );
        SubLObject cdolist_list_var2 = genls.max_cols( Sequences.remove_duplicates( isa_constraints2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), mt, UNPROVIDED );
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          result = ConsesLow.cons( el_utilities.make_binary_formula( $const22$isa, var2, v_isa ), result );
          cdolist_list_var2 = cdolist_list_var2.rest();
          v_isa = cdolist_list_var2.first();
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    var2 = NIL;
    SubLObject genls_constraints2 = NIL;
    cdohash_iterator = Hashtables.getEntrySetIterator( genls_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        var2 = Hashtables.getEntryKey( cdohash_entry );
        genls_constraints2 = Hashtables.getEntryValue( cdohash_entry );
        SubLObject cdolist_list_var2 = genls.max_cols( Sequences.remove_duplicates( genls_constraints2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), mt, UNPROVIDED );
        SubLObject genl = NIL;
        genl = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          result = ConsesLow.cons( el_utilities.make_binary_formula( $const23$genls, var2, genl ), result );
          cdolist_list_var2 = cdolist_list_var2.rest();
          genl = cdolist_list_var2.first();
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    if( NIL == result )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( result ) )
    {
      return result.first();
    }
    return simplifier.simplify_cycl_conjunction( simplifier.conjoin( Sequences.nreverse( result ), UNPROVIDED ), varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 47920L)
  public static SubLObject dnf_variables_arg_constraints(final SubLObject dnf, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = dnf_variables_isa_constraints( dnf, mt, varP );
    SubLObject var_isa_constraints = NIL;
    var_isa_constraints = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = var_isa_constraints.first();
      final SubLObject isa_constraints = var_isa_constraints.rest();
      SubLObject cdolist_list_var_$52 = Sequences.reverse( isa_constraints );
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var_$52.first();
      while ( NIL != cdolist_list_var_$52)
      {
        result = ConsesLow.cons( el_utilities.make_binary_formula( $const22$isa, var, v_isa ), result );
        cdolist_list_var_$52 = cdolist_list_var_$52.rest();
        v_isa = cdolist_list_var_$52.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      var_isa_constraints = cdolist_list_var.first();
    }
    cdolist_list_var = dnf_variables_genl_constraints( dnf, mt, varP );
    SubLObject var_genl_constraints = NIL;
    var_genl_constraints = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = var_genl_constraints.first();
      final SubLObject genl_constraints = var_genl_constraints.rest();
      SubLObject cdolist_list_var_$53 = Sequences.reverse( genl_constraints );
      SubLObject genl = NIL;
      genl = cdolist_list_var_$53.first();
      while ( NIL != cdolist_list_var_$53)
      {
        result = ConsesLow.cons( el_utilities.make_binary_formula( $const23$genls, var, genl ), result );
        cdolist_list_var_$53 = cdolist_list_var_$53.rest();
        genl = cdolist_list_var_$53.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      var_genl_constraints = cdolist_list_var.first();
    }
    if( NIL == result )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( result ) )
    {
      return result.first();
    }
    return simplifier.conjoin( Sequences.nreverse( result ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 48832L)
  public static SubLObject dnfs_variables_arg_constraints_okP(final SubLObject dnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    return makeBoolean( NIL != var_types_okP( dnfs_variables_isa_constraints( dnfs, mt, varP ), $kw27$ISA, mt ) && NIL != var_types_okP( dnfs_variables_genl_constraints( dnfs, mt, varP ), $kw29$GENLS, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 49117L)
  public static SubLObject dnfs_variables_isa_constraints(final SubLObject dnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym26$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var;
    final SubLObject vars = cdolist_list_var = Sequences.nreverse( list_utilities.tree_gather( dnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cols = at_min_cols( dnfs_variable_isa_constraints( var, dnfs, mt ), mt );
      constraints = ConsesLow.cons( ConsesLow.cons( var, cols ), constraints );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    if( NIL != constraints && NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue( thread ) )
    {
      cdolist_list_var = vars;
      var = NIL;
      var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject cols = at_min_cols( dnfs_variable_inter_arg_isa_constraints( var, dnfs, constraints, mt ), mt );
        result = ConsesLow.cons( ConsesLow.cons( var, cols ), result );
        cdolist_list_var = cdolist_list_var.rest();
        var = cdolist_list_var.first();
      }
    }
    else
    {
      result = constraints;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 49714L)
  public static SubLObject dnfs_variables_genl_constraints(final SubLObject dnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym26$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var;
    final SubLObject vars = cdolist_list_var = Sequences.nreverse( list_utilities.tree_gather( dnfs, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cols = at_min_cols( dnfs_variable_genl_constraints( var, dnfs, mt ), mt );
      constraints = ConsesLow.cons( ConsesLow.cons( var, cols ), constraints );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    if( NIL != constraints && NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue( thread ) )
    {
      cdolist_list_var = vars;
      var = NIL;
      var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject cols = at_min_cols( dnfs_variable_inter_arg_genl_constraints( var, dnfs, constraints, mt ), mt );
        result = ConsesLow.cons( ConsesLow.cons( var, cols ), result );
        cdolist_list_var = cdolist_list_var.rest();
        var = cdolist_list_var.first();
      }
    }
    else
    {
      result = constraints;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 50289L)
  public static SubLObject contextualized_dnf_variables_isa_constraint_tuples(final SubLObject dnf, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    SubLObject result = NIL;
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var;
    final SubLObject vars = cdolist_list_var = Sequences.nreverse( list_utilities.tree_gather( dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject items_var;
      final SubLObject tuples = items_var = contextualized_dnf_variable_isa_constraint_tuples( var, dnf );
      if( items_var.isVector() )
      {
        final SubLObject vector_var = items_var;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject item;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          item = Vectors.aref( vector_var, element_num );
          constraints = ConsesLow.cons( item, constraints );
        }
      }
      else
      {
        SubLObject cdolist_list_var_$54 = items_var;
        SubLObject item2 = NIL;
        item2 = cdolist_list_var_$54.first();
        while ( NIL != cdolist_list_var_$54)
        {
          constraints = ConsesLow.cons( item2, constraints );
          cdolist_list_var_$54 = cdolist_list_var_$54.rest();
          item2 = cdolist_list_var_$54.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    result = constraints;
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 51102L)
  public static SubLObject var_isa_constraints_wrt_dnfs(final SubLObject var, final SubLObject dnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    return conses_high.assoc( var, dnfs_variables_isa_constraints( dnfs, mt, varP ), UNPROVIDED, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 51276L)
  public static SubLObject var_genl_constraints_wrt_dnfs(final SubLObject var, final SubLObject dnfs, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym2$CYC_VAR_;
    }
    return conses_high.assoc( var, dnfs_variables_genl_constraints( dnfs, mt, varP ), UNPROVIDED, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 51452L)
  public static SubLObject dnfs_variable_isa_constraints(final SubLObject var, final SubLObject dnfs, final SubLObject mt)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = dnfs;
    SubLObject dnf = NIL;
    dnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.nconc( result, dnf_variable_isa_constraints( var, dnf, mt ) );
      cdolist_list_var = cdolist_list_var.rest();
      dnf = cdolist_list_var.first();
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 51703L)
  public static SubLObject dnfs_variable_quoted_isa_constraints(final SubLObject var, final SubLObject dnfs, final SubLObject mt)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = dnfs;
    SubLObject dnf = NIL;
    dnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.nconc( result, dnf_variable_quoted_isa_constraints( var, dnf, mt ) );
      cdolist_list_var = cdolist_list_var.rest();
      dnf = cdolist_list_var.first();
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 51968L)
  public static SubLObject dnfs_variable_genl_constraints(final SubLObject var, final SubLObject dnfs, final SubLObject mt)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = dnfs;
    SubLObject dnf = NIL;
    dnf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.nconc( result, dnf_variable_genl_constraints( var, dnf, mt ) );
      cdolist_list_var = cdolist_list_var.rest();
      dnf = cdolist_list_var.first();
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 52221L)
  public static SubLObject dnf_variables_isa_constraints(final SubLObject dnf, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym26$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var;
    final SubLObject vars = cdolist_list_var = Sequences.nreverse( list_utilities.tree_gather( dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cols = at_min_cols( dnf_variable_isa_constraints( var, dnf, mt ), mt );
      constraints = ConsesLow.cons( ConsesLow.cons( var, cols ), constraints );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    if( NIL != constraints && NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue( thread ) )
    {
      cdolist_list_var = vars;
      var = NIL;
      var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject cols = at_min_cols( dnf_variable_inter_arg_isa_constraints( var, dnf, constraints, mt ), mt );
        result = ConsesLow.cons( ConsesLow.cons( var, cols ), result );
        cdolist_list_var = cdolist_list_var.rest();
        var = cdolist_list_var.first();
      }
    }
    else
    {
      result = constraints;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 52809L)
  public static SubLObject dnf_variables_quoted_isa_constraints(final SubLObject dnf, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym26$VARIABLE_P;
    }
    SubLObject result = NIL;
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var;
    final SubLObject vars = cdolist_list_var = Sequences.nreverse( list_utilities.tree_gather( dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cols = at_min_cols( dnf_variable_quoted_isa_constraints( var, dnf, mt ), mt );
      constraints = ConsesLow.cons( ConsesLow.cons( var, cols ), constraints );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    result = constraints;
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 53252L)
  public static SubLObject dnf_variables_genl_constraints(final SubLObject dnf, final SubLObject mt, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym26$VARIABLE_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var;
    final SubLObject vars = cdolist_list_var = Sequences.nreverse( list_utilities.tree_gather( dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cols = at_min_cols( dnf_variable_genl_constraints( var, dnf, mt ), mt );
      constraints = ConsesLow.cons( ConsesLow.cons( var, cols ), constraints );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    if( NIL != constraints && NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue( thread ) )
    {
      cdolist_list_var = vars;
      var = NIL;
      var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject cols = at_min_cols( dnf_variable_inter_arg_genl_constraints( var, dnf, constraints, mt ), mt );
        result = ConsesLow.cons( ConsesLow.cons( var, cols ), result );
        cdolist_list_var = cdolist_list_var.rest();
        var = cdolist_list_var.first();
      }
    }
    else
    {
      result = constraints;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 53845L)
  public static SubLObject dnf_variable_isa_constraints(final SubLObject var, final SubLObject dnf, final SubLObject mt)
  {
    if( NIL != cycl_utilities.expression_find( var, dnf, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return conses_high.copy_list( dnf_variable_isa_constraints_int( var, dnf, mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 54024L)
  public static SubLObject dnf_variable_isa_constraints_int_internal(final SubLObject var, final SubLObject dnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lits = clauses.pos_lits( dnf );
    SubLObject result = NIL;
    if( NIL != pos_lits )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
      try
      {
        at_vars.$at_arg$.bind( var, thread );
        final SubLObject neg_lits = clauses.neg_lits( dnf );
        final SubLObject free_vars = clause_utilities.clause_free_variables( dnf, cycl_variables.variable_predicate_fn( var ), UNPROVIDED );
        final SubLObject _prev_bind_0_$55 = at_vars.$within_disjunctionP$.currentBinding( thread );
        try
        {
          at_vars.$within_disjunctionP$.bind( makeBoolean( ( NIL != neg_lits && NIL != pos_lits ) || NIL != conses_high.second( neg_lits ) || NIL != conses_high.second( pos_lits ) ), thread );
          if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
          {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              result = ConsesLow.nconc( result, dnf_neg_lit_variable_isa_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            cdolist_list_var = pos_lits;
            literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != el_utilities.mt_designating_literalP( literal ) )
              {
                final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
                final SubLObject mt_arg = el_utilities.designated_mt( literal );
                final SubLObject subformula = el_utilities.designated_sentence( literal );
                final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
                if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
                {
                  result = ConsesLow.nconc( result, formula_variable_isa_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
                }
              }
              result = ConsesLow.nconc( result, dnf_pos_lit_variable_isa_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            if( NIL != Sequences.find_if( $sym38$ISA_VAR_VAR_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              cdolist_list_var = list_utilities.remove_if_not( $sym38$ISA_VAR_VAR_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              SubLObject isa_x_y_asent = NIL;
              isa_x_y_asent = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject ins_var = cycl_utilities.atomic_sentence_arg1( isa_x_y_asent, UNPROVIDED );
                if( var.eql( ins_var ) )
                {
                  final SubLObject isa_col_var = cycl_utilities.atomic_sentence_arg2( isa_x_y_asent, UNPROVIDED );
                  SubLObject cdolist_list_var_$56 = pos_lits;
                  SubLObject genls_asent = NIL;
                  genls_asent = cdolist_list_var_$56.first();
                  while ( NIL != cdolist_list_var_$56)
                  {
                    if( NIL != el_utilities.genls_litP( genls_asent ) )
                    {
                      final SubLObject genls_col_var = cycl_utilities.atomic_sentence_arg1( genls_asent, UNPROVIDED );
                      if( isa_col_var.eql( genls_col_var ) )
                      {
                        final SubLObject col = cycl_utilities.atomic_sentence_arg2( genls_asent, UNPROVIDED );
                        if( NIL != forts.fort_p( col ) )
                        {
                          result = ConsesLow.cons( col, result );
                        }
                      }
                    }
                    cdolist_list_var_$56 = cdolist_list_var_$56.rest();
                    genls_asent = cdolist_list_var_$56.first();
                  }
                }
                cdolist_list_var = cdolist_list_var.rest();
                isa_x_y_asent = cdolist_list_var.first();
              }
            }
            result = list_utilities.delete_duplicate_forts( result );
          }
        }
        finally
        {
          at_vars.$within_disjunctionP$.rebind( _prev_bind_0_$55, thread );
        }
      }
      finally
      {
        at_vars.$at_arg$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 54024L)
  public static SubLObject dnf_variable_isa_constraints_int(final SubLObject var, final SubLObject dnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return dnf_variable_isa_constraints_int_internal( var, dnf, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym37$DNF_VARIABLE_ISA_CONSTRAINTS_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym37$DNF_VARIABLE_ISA_CONSTRAINTS_INT, THREE_INTEGER, $int11$100, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym37$DNF_VARIABLE_ISA_CONSTRAINTS_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( var, dnf, mt );
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
        if( var.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( dnf.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( dnf_variable_isa_constraints_int_internal( var, dnf, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( var, dnf, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 56161L)
  public static SubLObject contextualized_dnf_variable_isa_constraint_tuples(final SubLObject var, final SubLObject contextualized_dnf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lits = clauses.pos_lits( contextualized_dnf );
    final SubLObject dict = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL != pos_lits )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
      try
      {
        at_vars.$at_arg$.bind( var, thread );
        final SubLObject neg_lits = clauses.neg_lits( contextualized_dnf );
        final SubLObject free_vars = clause_utilities.clause_free_variables( contextualized_dnf, cycl_variables.variable_predicate_fn( var ), UNPROVIDED );
        final SubLObject _prev_bind_0_$57 = at_vars.$within_disjunctionP$.currentBinding( thread );
        try
        {
          at_vars.$within_disjunctionP$.bind( makeBoolean( ( NIL != neg_lits && NIL != pos_lits ) || NIL != conses_high.second( neg_lits ) || NIL != conses_high.second( pos_lits ) ), thread );
          if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
          {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject contextualized_literal = NIL;
            contextualized_literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = contextualized_literal;
              SubLObject mt = NIL;
              SubLObject asent = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
              asent = current.first();
              current = current.rest();
              if( NIL == current )
              {
                SubLObject cdolist_list_var_$58 = dnf_neg_lit_variable_isa_constraints( var, asent, mt );
                SubLObject col = NIL;
                col = cdolist_list_var_$58.first();
                while ( NIL != cdolist_list_var_$58)
                {
                  dictionary_utilities.dictionary_push( dict, mt, col );
                  cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                  col = cdolist_list_var_$58.first();
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              contextualized_literal = cdolist_list_var.first();
            }
            cdolist_list_var = pos_lits;
            contextualized_literal = NIL;
            contextualized_literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current;
              final SubLObject datum = current = contextualized_literal;
              SubLObject mt = NIL;
              SubLObject asent = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
              asent = current.first();
              current = current.rest();
              if( NIL == current )
              {
                SubLObject cdolist_list_var_$59 = dnf_pos_lit_variable_isa_constraints( var, asent, mt );
                SubLObject col = NIL;
                col = cdolist_list_var_$59.first();
                while ( NIL != cdolist_list_var_$59)
                {
                  dictionary_utilities.dictionary_push( dict, mt, col );
                  cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                  col = cdolist_list_var_$59.first();
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              contextualized_literal = cdolist_list_var.first();
            }
            if( NIL != Sequences.find_if( $sym40$CONTEXTUALIZED_ISA_X_Y_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              cdolist_list_var = list_utilities.remove_if_not( $sym40$CONTEXTUALIZED_ISA_X_Y_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              SubLObject isa_x_y_contextualized_asent = NIL;
              isa_x_y_contextualized_asent = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = isa_x_y_contextualized_asent;
                SubLObject isa_mt = NIL;
                SubLObject isa_x_y_asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                isa_mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
                isa_x_y_asent = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  final SubLObject ins_var = cycl_utilities.atomic_sentence_arg1( isa_x_y_asent, UNPROVIDED );
                  if( var.eql( ins_var ) )
                  {
                    final SubLObject isa_col_var = cycl_utilities.atomic_sentence_arg2( isa_x_y_asent, UNPROVIDED );
                    SubLObject cdolist_list_var_$60 = pos_lits;
                    SubLObject contextualized_literal2 = NIL;
                    contextualized_literal2 = cdolist_list_var_$60.first();
                    while ( NIL != cdolist_list_var_$60)
                    {
                      SubLObject current_$62;
                      final SubLObject datum_$61 = current_$62 = contextualized_literal2;
                      SubLObject genls_mt = NIL;
                      SubLObject genls_asent = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current_$62, datum_$61, $list42 );
                      genls_mt = current_$62.first();
                      current_$62 = current_$62.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current_$62, datum_$61, $list42 );
                      genls_asent = current_$62.first();
                      current_$62 = current_$62.rest();
                      if( NIL == current_$62 )
                      {
                        if( NIL != el_utilities.genls_litP( genls_asent ) )
                        {
                          final SubLObject genls_col_var = cycl_utilities.atomic_sentence_arg1( genls_asent, UNPROVIDED );
                          if( isa_col_var.eql( genls_col_var ) && NIL != hlmt.hlmt_equalP( isa_mt, genls_mt ) )
                          {
                            final SubLObject col2 = cycl_utilities.atomic_sentence_arg2( genls_asent, UNPROVIDED );
                            if( NIL != forts.fort_p( col2 ) )
                            {
                              dictionary_utilities.dictionary_push( dict, isa_mt, col2 );
                            }
                          }
                        }
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum_$61, $list42 );
                      }
                      cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                      contextualized_literal2 = cdolist_list_var_$60.first();
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                isa_x_y_contextualized_asent = cdolist_list_var.first();
              }
            }
          }
        }
        finally
        {
          at_vars.$within_disjunctionP$.rebind( _prev_bind_0_$57, thread );
        }
      }
      finally
      {
        at_vars.$at_arg$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject result = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject cols = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject minimized_cols = at_min_cols( cols, mt2 );
      result = ConsesLow.cons( ConsesLow.list( var, mt2, minimized_cols ), result );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 58610L)
  public static SubLObject contextualized_isa_x_y_litP(final SubLObject v_object)
  {
    if( NIL != inference_datastructures_problem_query.hl_contextualized_asent_p( v_object ) )
    {
      final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent( v_object );
      return el_utilities.isa_hl_var_hl_var_litP( asent );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 58810L)
  public static SubLObject dnf_variable_quoted_isa_constraints(final SubLObject var, final SubLObject dnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lits = clauses.pos_lits( dnf );
    SubLObject result = NIL;
    if( NIL != pos_lits )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
      try
      {
        at_vars.$at_arg$.bind( var, thread );
        final SubLObject neg_lits = clauses.neg_lits( dnf );
        final SubLObject free_vars = clause_utilities.clause_free_variables( dnf, cycl_variables.variable_predicate_fn( var ), UNPROVIDED );
        final SubLObject _prev_bind_0_$63 = at_vars.$within_disjunctionP$.currentBinding( thread );
        try
        {
          at_vars.$within_disjunctionP$.bind( makeBoolean( ( NIL != neg_lits && NIL != pos_lits ) || NIL != conses_high.second( neg_lits ) || NIL != conses_high.second( pos_lits ) ), thread );
          if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
          {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              result = ConsesLow.nconc( result, dnf_neg_lit_variable_quoted_isa_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            cdolist_list_var = pos_lits;
            literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != el_utilities.mt_designating_literalP( literal ) )
              {
                final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
                final SubLObject mt_arg = el_utilities.designated_mt( literal );
                final SubLObject subformula = el_utilities.designated_sentence( literal );
                final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
                if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
                {
                  result = ConsesLow.nconc( result, formula_variable_quoted_isa_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
                }
              }
              result = ConsesLow.nconc( result, dnf_pos_lit_variable_quoted_isa_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            result = list_utilities.delete_duplicate_forts( result );
          }
        }
        finally
        {
          at_vars.$within_disjunctionP$.rebind( _prev_bind_0_$63, thread );
        }
      }
      finally
      {
        at_vars.$at_arg$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 60219L)
  public static SubLObject dnf_variable_genl_constraints(final SubLObject var, final SubLObject dnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lits = clauses.pos_lits( dnf );
    SubLObject result = NIL;
    if( NIL != pos_lits )
    {
      final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
      try
      {
        at_vars.$at_arg$.bind( var, thread );
        final SubLObject neg_lits = clauses.neg_lits( dnf );
        final SubLObject free_vars = clause_utilities.clause_free_variables( dnf, cycl_variables.variable_predicate_fn( var ), UNPROVIDED );
        final SubLObject _prev_bind_0_$64 = at_vars.$within_disjunctionP$.currentBinding( thread );
        try
        {
          at_vars.$within_disjunctionP$.bind( makeBoolean( ( NIL != neg_lits && NIL != pos_lits ) || NIL != conses_high.second( neg_lits ) || NIL != conses_high.second( pos_lits ) ), thread );
          if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
          {
            SubLObject cdolist_list_var = neg_lits;
            SubLObject literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              result = ConsesLow.nconc( result, dnf_neg_lit_variable_genl_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            cdolist_list_var = pos_lits;
            literal = NIL;
            literal = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != el_utilities.mt_designating_literalP( literal ) )
              {
                final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
                final SubLObject mt_arg = el_utilities.designated_mt( literal );
                final SubLObject subformula = el_utilities.designated_sentence( literal );
                final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
                if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
                {
                  result = ConsesLow.nconc( result, formula_variable_genl_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, mt ) ) );
                }
              }
              result = ConsesLow.nconc( result, dnf_pos_lit_variable_genl_constraints( var, literal, mt ) );
              cdolist_list_var = cdolist_list_var.rest();
              literal = cdolist_list_var.first();
            }
            result = list_utilities.delete_duplicate_forts( result );
          }
        }
        finally
        {
          at_vars.$within_disjunctionP$.rebind( _prev_bind_0_$64, thread );
        }
      }
      finally
      {
        at_vars.$at_arg$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 61611L)
  public static SubLObject dnfs_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject dnfs, final SubLObject constraints, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = conses_high.assoc( var, constraints, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_var_isa$.currentBinding( thread );
    try
    {
      at_vars.$at_arg$.bind( var, thread );
      at_vars.$at_var_isa$.bind( constraints, thread );
      SubLObject cdolist_list_var = dnfs;
      SubLObject dnf = NIL;
      dnf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.nconc( result, dnf_variable_inter_arg_isa_constraints_int( var, dnf, mt ) );
        cdolist_list_var = cdolist_list_var.rest();
        dnf = cdolist_list_var.first();
      }
    }
    finally
    {
      at_vars.$at_var_isa$.rebind( _prev_bind_2, thread );
      at_vars.$at_arg$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 61987L)
  public static SubLObject dnfs_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject dnfs, final SubLObject constraints, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = conses_high.assoc( var, constraints, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_var_genl$.currentBinding( thread );
    try
    {
      at_vars.$at_arg$.bind( var, thread );
      at_vars.$at_var_genl$.bind( constraints, thread );
      SubLObject cdolist_list_var = dnfs;
      SubLObject dnf = NIL;
      dnf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.nconc( result, dnf_variable_inter_arg_genl_constraints_int( var, dnf, mt ) );
        cdolist_list_var = cdolist_list_var.rest();
        dnf = cdolist_list_var.first();
      }
    }
    finally
    {
      at_vars.$at_var_genl$.rebind( _prev_bind_2, thread );
      at_vars.$at_arg$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 62366L)
  public static SubLObject dnf_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject dnf, final SubLObject constraints, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = conses_high.assoc( var, constraints, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_var_isa$.currentBinding( thread );
    try
    {
      at_vars.$at_arg$.bind( var, thread );
      at_vars.$at_var_isa$.bind( constraints, thread );
      result = ConsesLow.nconc( result, dnf_variable_inter_arg_isa_constraints_int( var, dnf, mt ) );
    }
    finally
    {
      at_vars.$at_var_isa$.rebind( _prev_bind_2, thread );
      at_vars.$at_arg$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 62717L)
  public static SubLObject dnf_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject dnf, final SubLObject constraints, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = conses_high.assoc( var, constraints, UNPROVIDED, UNPROVIDED ).rest();
    final SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_var_genl$.currentBinding( thread );
    try
    {
      at_vars.$at_arg$.bind( var, thread );
      at_vars.$at_var_genl$.bind( constraints, thread );
      result = ConsesLow.nconc( result, dnf_variable_inter_arg_genl_constraints_int( var, dnf, mt ) );
    }
    finally
    {
      at_vars.$at_var_genl$.rebind( _prev_bind_2, thread );
      at_vars.$at_arg$.rebind( _prev_bind_0, thread );
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 63072L)
  public static SubLObject dnf_variable_inter_arg_isa_constraints_int(final SubLObject var, final SubLObject dnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lits = clauses.pos_lits( dnf );
    SubLObject result = NIL;
    if( NIL != pos_lits )
    {
      final SubLObject neg_lits = clauses.neg_lits( dnf );
      final SubLObject free_vars = clause_utilities.clause_free_variables( dnf, cycl_variables.variable_predicate_fn( var ), UNPROVIDED );
      final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding( thread );
      try
      {
        at_vars.$within_disjunctionP$.bind( makeBoolean( ( NIL != neg_lits && NIL != pos_lits ) || NIL != conses_high.second( neg_lits ) || NIL != conses_high.second( pos_lits ) || NIL != at_vars.$within_disjunctionP$
            .getDynamicValue( thread ) ), thread );
        if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var = neg_lits;
          SubLObject literal = NIL;
          literal = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            result = ConsesLow.nconc( result, neg_lit_variable_inter_arg_isa_constraints( var, literal, mt ) );
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
          }
          cdolist_list_var = pos_lits;
          literal = NIL;
          literal = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != el_utilities.mt_designating_literalP( literal ) )
            {
              final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
              final SubLObject mt_arg = el_utilities.designated_mt( literal );
              final SubLObject subformula = el_utilities.designated_sentence( literal );
              final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
              if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
              {
                result = ConsesLow.nconc( result, formula_variable_inter_arg_isa_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
              }
            }
            result = ConsesLow.nconc( result, neg_lit_variable_inter_arg_isa_constraints( var, literal, mt ) );
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
          }
          result = list_utilities.delete_duplicate_forts( result );
        }
      }
      finally
      {
        at_vars.$within_disjunctionP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 64558L)
  public static SubLObject dnf_variable_inter_arg_genl_constraints_int(final SubLObject var, final SubLObject dnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_lits = clauses.pos_lits( dnf );
    SubLObject result = NIL;
    if( NIL != pos_lits )
    {
      final SubLObject neg_lits = clauses.neg_lits( dnf );
      final SubLObject free_vars = clause_utilities.clause_free_variables( dnf, cycl_variables.variable_predicate_fn( var ), UNPROVIDED );
      final SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding( thread );
      try
      {
        at_vars.$within_disjunctionP$.bind( makeBoolean( ( NIL != neg_lits && NIL != pos_lits ) || NIL != conses_high.second( neg_lits ) || NIL != conses_high.second( pos_lits ) ), thread );
        if( NIL != list_utilities.tree_find( var, pos_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL == subl_promotions.memberP( var, free_vars, UNPROVIDED, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var = neg_lits;
          SubLObject literal = NIL;
          literal = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            result = ConsesLow.nconc( result, neg_lit_variable_inter_arg_genl_constraints( var, literal, mt ) );
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
          }
          cdolist_list_var = pos_lits;
          literal = NIL;
          literal = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != el_utilities.mt_designating_literalP( literal ) )
            {
              final SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
              final SubLObject mt_arg = el_utilities.designated_mt( literal );
              final SubLObject subformula = el_utilities.designated_sentence( literal );
              final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
              if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
              {
                result = ConsesLow.nconc( result, formula_variable_inter_arg_genl_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
              }
            }
            result = ConsesLow.nconc( result, neg_lit_variable_inter_arg_genl_constraints( var, literal, mt ) );
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
          }
          result = list_utilities.delete_duplicate_forts( result );
        }
      }
      finally
      {
        at_vars.$within_disjunctionP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 65967L)
  public static SubLObject cnf_neg_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    if( NIL != czer_utilities.within_disjunctionP() )
    {
      return neg_lit_variable_isa_constraints( var, literal, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 66242L)
  public static SubLObject cnf_neg_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    if( NIL != czer_utilities.within_disjunctionP() )
    {
      return neg_lit_variable_quoted_isa_constraints( var, literal, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 66472L)
  public static SubLObject cnf_neg_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    if( NIL != czer_utilities.within_disjunctionP() )
    {
      return neg_lit_variable_genl_constraints( var, literal, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 66691L)
  public static SubLObject cnf_pos_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    return neg_lit_variable_isa_constraints( var, literal, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 66873L)
  public static SubLObject cnf_pos_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    return neg_lit_variable_quoted_isa_constraints( var, literal, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 67069L)
  public static SubLObject cnf_pos_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    return neg_lit_variable_genl_constraints( var, literal, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 67254L)
  public static SubLObject dnf_neg_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    if( NIL != czer_utilities.within_disjunctionP() )
    {
      return pos_lit_variable_isa_constraints( var, literal, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 67476L)
  public static SubLObject dnf_neg_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    if( NIL != czer_utilities.within_disjunctionP() )
    {
      return pos_lit_variable_quoted_isa_constraints( var, literal, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 67712L)
  public static SubLObject dnf_neg_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    if( NIL != czer_utilities.within_disjunctionP() )
    {
      return pos_lit_variable_genl_constraints( var, literal, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 67937L)
  public static SubLObject dnf_pos_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    return neg_lit_variable_isa_constraints( var, literal, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 68119L)
  public static SubLObject dnf_pos_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    return neg_lit_variable_quoted_isa_constraints( var, literal, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 68315L)
  public static SubLObject dnf_pos_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    return neg_lit_variable_genl_constraints( var, literal, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 68500L)
  public static SubLObject vt_unskolemize_term(final SubLObject v_term)
  {
    if( NIL != term.unreified_skolem_termP( v_term ) )
    {
      return skolems.skolem_function_var( v_term );
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 68641L)
  public static SubLObject neg_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = pos_lit_variable_isa_constraints( var, literal, mt );
    if( NIL != at_vars.$at_include_isa_literal_constraints$.getDynamicValue( thread ) && NIL != el_utilities.isa_litP( literal ) )
    {
      final SubLObject arg1 = vt_unskolemize_term( el_utilities.literal_arg1( literal, UNPROVIDED ) );
      final SubLObject arg2 = cycl_utilities.reify_when_closed_naut( el_utilities.literal_arg2( literal, UNPROVIDED ) );
      if( var.eql( arg1 ) )
      {
        if( NIL != fort_types_interface.collectionP( arg2 ) )
        {
          result = ConsesLow.cons( arg2, result );
        }
        else if( NIL != term.first_order_nautP( arg2 ) )
        {
          if( NIL != el_utilities.groundP( arg2, UNPROVIDED ) )
          {
            result = ConsesLow.nconc( result, kb_accessors.result_genl_args( arg2, mt ) );
          }
          else
          {
            result = ConsesLow.nconc( result, kb_accessors.result_genl_via_arg_arg_genl( arg2, mt ) );
          }
        }
      }
    }
    else if( NIL != el_utilities.tou_litP( literal ) || NIL != el_utilities.evaluate_litP( literal, UNPROVIDED ) )
    {
      final SubLObject arg1 = vt_unskolemize_term( el_utilities.literal_arg1( literal, UNPROVIDED ) );
      if( var.eql( arg1 ) )
      {
        result = ConsesLow.nconc( result, kb_accessors.result_isa( cycl_utilities.nat_functor( el_utilities.literal_arg2( literal, UNPROVIDED ) ), mt ) );
      }
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 69736L)
  public static SubLObject neg_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = pos_lit_variable_quoted_isa_constraints( var, literal, mt );
    if( NIL != at_vars.$at_include_isa_literal_constraints$.getDynamicValue( thread ) && NIL != el_utilities.quoted_isa_litP( literal ) )
    {
      final SubLObject arg1 = vt_unskolemize_term( el_utilities.literal_arg1( literal, UNPROVIDED ) );
      final SubLObject arg2 = cycl_utilities.reify_when_closed_naut( el_utilities.literal_arg2( literal, UNPROVIDED ) );
      if( var.eql( arg1 ) )
      {
        if( NIL != fort_types_interface.collectionP( arg2 ) )
        {
          result = ConsesLow.cons( arg2, result );
        }
      }
    }
    else if( NIL != el_utilities.tou_litP( literal ) || NIL != el_utilities.evaluate_litP( literal, UNPROVIDED ) )
    {
      final SubLObject arg1 = vt_unskolemize_term( el_utilities.literal_arg1( literal, UNPROVIDED ) );
      if( var.eql( arg1 ) )
      {
        final SubLObject nat_functor = cycl_utilities.nat_functor( el_utilities.literal_arg2( literal, UNPROVIDED ) );
        final SubLObject evaluation_quoted_isas = kb_accessors.evaluation_result_quoted_isa( nat_functor, mt );
        final SubLObject quoted_isas = kb_accessors.result_quoted_isa( nat_functor, mt );
        result = ConsesLow.nconc( result, evaluation_quoted_isas, quoted_isas );
      }
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 70827L)
  public static SubLObject neg_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = pos_lit_variable_genl_constraints( var, literal, mt );
    if( NIL != at_vars.$at_include_genl_literal_constraints$.getDynamicValue( thread ) && NIL != el_utilities.genls_litP( literal ) )
    {
      final SubLObject arg1 = vt_unskolemize_term( el_utilities.literal_arg1( literal, UNPROVIDED ) );
      final SubLObject arg2 = cycl_utilities.reify_when_closed_naut( el_utilities.literal_arg2( literal, UNPROVIDED ) );
      if( var.eql( arg1 ) )
      {
        if( NIL != fort_types_interface.collectionP( arg2 ) )
        {
          result = ConsesLow.cons( arg2, result );
        }
        else if( NIL != term.first_order_nautP( arg2 ) )
        {
          result = ConsesLow.nconc( result, kb_accessors.result_genl( cycl_utilities.nat_functor( arg2 ), mt, UNPROVIDED ) );
        }
      }
    }
    else if( NIL != el_utilities.tou_litP( literal ) || NIL != el_utilities.evaluate_litP( literal, UNPROVIDED ) )
    {
      final SubLObject arg1 = vt_unskolemize_term( el_utilities.literal_arg1( literal, UNPROVIDED ) );
      if( var.eql( arg1 ) )
      {
        result = ConsesLow.nconc( result, kb_accessors.result_genl( cycl_utilities.nat_functor( el_utilities.literal_arg2( literal, UNPROVIDED ) ), mt, UNPROVIDED ) );
      }
    }
    result = list_utilities.delete_duplicate_forts( result );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 71793L)
  public static SubLObject pos_lit_variable_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    SubLObject result = NIL;
    if( NIL == forts.fort_p( predicate ) )
    {
      predicate = cycl_utilities.find_when_closed_naut( predicate );
    }
    final SubLObject scoping_args = ( NIL != forts.fort_p( predicate ) ) ? kb_accessors.scoping_args( predicate, mt ) : NIL;
    SubLObject argnum = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      final SubLObject genl_somethingP = ( NIL != forts.fort_p( predicate ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( predicate, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( predicate,
          UNPROVIDED, UNPROVIDED ) ) : NIL;
      final SubLObject _prev_bind_0_$65 = at_vars.$at_reln$.currentBinding( thread );
      final SubLObject _prev_bind_1_$66 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
      try
      {
        at_vars.$at_reln$.bind( predicate, thread );
        at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
        at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
        if( var.eql( vt_unskolemize_term( predicate ) ) )
        {
          SubLObject doneP = NIL;
          SubLObject has_sentence_argP = NIL;
          final SubLObject args = cycl_utilities.formula_args( literal, $kw35$IGNORE );
          SubLObject rest;
          SubLObject arg;
          for( rest = NIL, rest = args; NIL == doneP && NIL != rest; rest = rest.rest() )
          {
            arg = rest.first();
            if( NIL != term.sentenceP( arg, UNPROVIDED ) )
            {
              doneP = T;
              has_sentence_argP = T;
            }
          }
          if( NIL != has_sentence_argP )
          {
            result = ConsesLow.cons( $const43$TruthFunction, result );
          }
          else
          {
            result = ConsesLow.cons( $const44$Predicate, result );
          }
        }
        SubLObject cdolist_list_var = el_utilities.literal_args( literal, $kw48$REGULARIZE );
        SubLObject arg2 = NIL;
        arg2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          argnum = Numbers.add( argnum, ONE_INTEGER );
          if( NIL == subl_promotions.memberP( argnum, scoping_args, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL == cycl_grammar.fast_cycl_quoted_term_p( arg2 ) )
            {
              if( NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP( predicate, argnum, mt ) )
              {
                if( var.equal( arg2 ) )
                {
                  result = ConsesLow.nconc( result, at_argn_isa( predicate, argnum ) );
                }
                else if( NIL == modal_in_argP( predicate, argnum, mt ) )
                {
                  if( NIL != term.unreified_skolem_termP( arg2 ) )
                  {
                    if( var.eql( cycl_utilities.nat_arg2( arg2, UNPROVIDED ) ) )
                    {
                      result = at_argn_isa( predicate, argnum );
                    }
                    final SubLObject skolem_number = skolems.skolem_number( arg2 );
                    if( NIL != list_utilities.tree_find( var, skolem_number, UNPROVIDED, UNPROVIDED ) )
                    {
                      result = ConsesLow.nconc( result, relation_variable_isa_constraints( var, skolem_number, mt ) );
                    }
                  }
                  else if( NIL != czer_utilities.sentence_argP( predicate, argnum, mt ) )
                  {
                    if( NIL != czer_utilities.assertable_sentence_argP( predicate, argnum, mt ) )
                    {
                      if( NIL != el_utilities.mt_designating_literalP( literal ) )
                      {
                        final SubLObject mt_arg = el_utilities.designated_mt( literal );
                        final SubLObject subformula = el_utilities.designated_sentence( literal );
                        final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
                        if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
                        {
                          result = ConsesLow.nconc( result, formula_variable_isa_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
                        }
                      }
                      else
                      {
                        result = ConsesLow.nconc( result, formula_variable_isa_constraints( var, arg2, mt, at_arg_formula_type( predicate, argnum, mt ) ) );
                      }
                    }
                  }
                  else if( NIL == el_utilities.arg_types_prescribe_tacit_term_listP( predicate, argnum ) )
                  {
                    if( NIL != el_utilities.el_list_p( arg2 ) && NIL != el_utilities.el_formula_without_sequence_termP( arg2 ) && NIL != list_utilities.member_eqP( var, arg2 ) )
                    {
                      final SubLObject list_arg_replaced_literal = Sequences.substitute( $sym45$_DUMMY, arg2, literal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      SubLObject cdolist_list_var_$67;
                      final SubLObject arg_isa_constraints = cdolist_list_var_$67 = formula_variable_isa_constraints( $sym45$_DUMMY, list_arg_replaced_literal, mt, UNPROVIDED );
                      SubLObject arg_isa_constraint = NIL;
                      arg_isa_constraint = cdolist_list_var_$67.first();
                      while ( NIL != cdolist_list_var_$67)
                      {
                        if( NIL != cycl_grammar.cycl_nat_p( arg_isa_constraint ) )
                        {
                          final SubLObject func = cycl_utilities.nat_functor( arg_isa_constraint );
                          final SubLObject arg3 = cycl_utilities.nat_arg1( arg_isa_constraint, UNPROVIDED );
                          if( $const46$ListOfTypeFn.eql( func ) && NIL != forts.fort_p( arg3 ) )
                          {
                            result = ConsesLow.cons( arg3, result );
                          }
                        }
                        cdolist_list_var_$67 = cdolist_list_var_$67.rest();
                        arg_isa_constraint = cdolist_list_var_$67.first();
                      }
                      if( NIL == result )
                      {
                        result = ConsesLow.list( $const47$Thing );
                      }
                    }
                    else if( NIL != list_utilities.tree_find( var, arg2, EQUAL, UNPROVIDED ) )
                    {
                      final SubLObject items_var = relation_variable_isa_constraints( var, arg2, mt );
                      if( items_var.isVector() )
                      {
                        final SubLObject vector_var = items_var;
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject item;
                        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                        {
                          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                          item = Vectors.aref( vector_var, element_num );
                          result = ConsesLow.cons( item, result );
                        }
                      }
                      else
                      {
                        SubLObject cdolist_list_var_$68 = items_var;
                        SubLObject item2 = NIL;
                        item2 = cdolist_list_var_$68.first();
                        while ( NIL != cdolist_list_var_$68)
                        {
                          result = ConsesLow.cons( item2, result );
                          cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                          item2 = cdolist_list_var_$68.first();
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg2 = cdolist_list_var.first();
        }
        result = list_utilities.delete_duplicate_forts( result );
      }
      finally
      {
        at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_3, thread );
        at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$66, thread );
        at_vars.$at_reln$.rebind( _prev_bind_0_$65, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 75101L)
  public static SubLObject pos_lit_variable_quoted_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    SubLObject result = NIL;
    if( NIL == forts.fort_p( predicate ) )
    {
      predicate = cycl_utilities.find_when_closed_naut( predicate );
    }
    final SubLObject scoping_args = ( NIL != forts.fort_p( predicate ) ) ? kb_accessors.scoping_args( predicate, mt ) : NIL;
    SubLObject argnum = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      final SubLObject genl_somethingP = ( NIL != forts.fort_p( predicate ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( predicate, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( predicate,
          UNPROVIDED, UNPROVIDED ) ) : NIL;
      final SubLObject _prev_bind_0_$69 = at_vars.$at_reln$.currentBinding( thread );
      final SubLObject _prev_bind_1_$70 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
      try
      {
        at_vars.$at_reln$.bind( predicate, thread );
        at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
        at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
        SubLObject cdolist_list_var = el_utilities.literal_args( literal, $kw48$REGULARIZE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          argnum = Numbers.add( argnum, ONE_INTEGER );
          if( NIL == subl_promotions.memberP( argnum, scoping_args, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL == cycl_grammar.fast_cycl_quoted_term_p( arg ) )
            {
              if( NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP( predicate, argnum, mt ) )
              {
                if( var.equal( arg ) )
                {
                  result = ConsesLow.nconc( result, at_argn_quoted_isa( predicate, argnum ) );
                }
                else if( NIL == modal_in_argP( predicate, argnum, mt ) )
                {
                  if( NIL != term.unreified_skolem_termP( arg ) )
                  {
                    if( var.eql( cycl_utilities.nat_arg2( arg, UNPROVIDED ) ) )
                    {
                      result = at_argn_quoted_isa( predicate, argnum );
                    }
                    final SubLObject skolem_number = skolems.skolem_number( arg );
                    if( NIL != list_utilities.tree_find( var, skolem_number, UNPROVIDED, UNPROVIDED ) )
                    {
                      result = ConsesLow.nconc( result, relation_variable_quoted_isa_constraints( var, skolem_number, mt ) );
                    }
                  }
                  else if( NIL != czer_utilities.sentence_argP( predicate, argnum, mt ) )
                  {
                    if( NIL != czer_utilities.assertable_sentence_argP( predicate, argnum, mt ) )
                    {
                      if( NIL != el_utilities.mt_designating_literalP( literal ) )
                      {
                        final SubLObject mt_arg = el_utilities.designated_mt( literal );
                        final SubLObject subformula = el_utilities.designated_sentence( literal );
                        final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
                        if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
                        {
                          result = ConsesLow.nconc( result, formula_variable_quoted_isa_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
                        }
                      }
                      else
                      {
                        result = ConsesLow.nconc( result, formula_variable_quoted_isa_constraints( var, arg, mt, at_arg_formula_type( predicate, argnum, mt ) ) );
                      }
                    }
                  }
                  else if( NIL == el_utilities.arg_types_prescribe_tacit_term_listP( predicate, argnum ) )
                  {
                    if( NIL != list_utilities.tree_find( var, arg, EQUAL, UNPROVIDED ) )
                    {
                      result = ConsesLow.nconc( result, relation_variable_quoted_isa_constraints( var, arg, mt ) );
                    }
                  }
                }
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        result = list_utilities.delete_duplicate_forts( result );
      }
      finally
      {
        at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_3, thread );
        at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$70, thread );
        at_vars.$at_reln$.rebind( _prev_bind_0_$69, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 77323L)
  public static SubLObject pos_lit_variable_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    SubLObject result = NIL;
    if( NIL == forts.fort_p( predicate ) && NIL != term.closed_nautP( predicate, UNPROVIDED ) )
    {
      predicate = cycl_utilities.find_closed_naut( predicate );
    }
    final SubLObject scoping_args = ( NIL != forts.fort_p( predicate ) ) ? kb_accessors.scoping_args( predicate, mt ) : NIL;
    SubLObject argnum = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      final SubLObject genl_somethingP = ( NIL != forts.fort_p( predicate ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( predicate, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( predicate,
          UNPROVIDED, UNPROVIDED ) ) : NIL;
      final SubLObject _prev_bind_0_$71 = at_vars.$at_reln$.currentBinding( thread );
      final SubLObject _prev_bind_1_$72 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
      try
      {
        at_vars.$at_reln$.bind( predicate, thread );
        at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
        at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
        SubLObject cdolist_list_var = el_utilities.literal_args( literal, $kw48$REGULARIZE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          argnum = Numbers.add( argnum, ONE_INTEGER );
          if( NIL == subl_promotions.memberP( argnum, scoping_args, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL == cycl_grammar.fast_cycl_quoted_term_p( arg ) )
            {
              if( NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP( predicate, argnum, mt ) )
              {
                if( var.equal( arg ) )
                {
                  result = ConsesLow.nconc( result, at_argn_genl( predicate, argnum ) );
                }
                else if( NIL == modal_in_argP( predicate, argnum, mt ) )
                {
                  if( NIL != term.unreified_skolem_termP( arg ) )
                  {
                    if( var.eql( cycl_utilities.nat_arg2( arg, UNPROVIDED ) ) )
                    {
                      result = at_argn_genl( predicate, argnum );
                    }
                    final SubLObject skolem_number = skolems.skolem_number( arg );
                    if( NIL != list_utilities.tree_find( var, skolem_number, UNPROVIDED, UNPROVIDED ) )
                    {
                      result = ConsesLow.nconc( result, relation_variable_genl_constraints( var, skolem_number, mt ) );
                    }
                  }
                  else if( NIL != czer_utilities.sentence_argP( predicate, argnum, mt ) )
                  {
                    if( NIL != czer_utilities.assertable_sentence_argP( predicate, argnum, mt ) )
                    {
                      if( NIL != el_utilities.mt_designating_literalP( literal ) )
                      {
                        final SubLObject mt_arg = el_utilities.designated_mt( literal );
                        final SubLObject subformula = el_utilities.designated_sentence( literal );
                        final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
                        if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
                        {
                          result = ConsesLow.nconc( result, formula_variable_genl_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, argnum, mt ) ) );
                        }
                      }
                      else
                      {
                        result = ConsesLow.nconc( result, formula_variable_genl_constraints( var, arg, mt, at_arg_formula_type( predicate, argnum, mt ) ) );
                      }
                    }
                  }
                  else if( NIL == el_utilities.arg_types_prescribe_tacit_term_listP( predicate, argnum ) )
                  {
                    if( NIL != el_utilities.el_list_p( arg ) && NIL != el_utilities.el_formula_without_sequence_termP( arg ) && NIL != list_utilities.member_eqP( var, arg ) )
                    {
                      final SubLObject list_arg_replaced_literal = Sequences.substitute( $sym45$_DUMMY, arg, literal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      SubLObject cdolist_list_var_$73;
                      final SubLObject arg_isa_constraints = cdolist_list_var_$73 = formula_variable_isa_constraints( $sym45$_DUMMY, list_arg_replaced_literal, mt, UNPROVIDED );
                      SubLObject arg_isa_constraint = NIL;
                      arg_isa_constraint = cdolist_list_var_$73.first();
                      while ( NIL != cdolist_list_var_$73)
                      {
                        if( NIL != cycl_grammar.cycl_nat_p( arg_isa_constraint ) )
                        {
                          final SubLObject func = cycl_utilities.nat_functor( arg_isa_constraint );
                          final SubLObject arg2 = cycl_utilities.nat_arg1( arg_isa_constraint, UNPROVIDED );
                          if( $const49$ListOfSpecsFn.eql( func ) && NIL != forts.fort_p( arg2 ) )
                          {
                            result = ConsesLow.cons( arg2, result );
                          }
                          else if( $const46$ListOfTypeFn.eql( func ) && $const50$SpecsFn.eql( cycl_utilities.nat_functor( arg2 ) ) && NIL != forts.fort_p( cycl_utilities.nat_arg1( arg2, UNPROVIDED ) ) )
                          {
                            result = ConsesLow.cons( cycl_utilities.nat_arg1( arg2, UNPROVIDED ), result );
                          }
                        }
                        cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                        arg_isa_constraint = cdolist_list_var_$73.first();
                      }
                    }
                    else if( NIL != list_utilities.tree_find( var, arg, EQUAL, UNPROVIDED ) )
                    {
                      result = ConsesLow.nconc( result, relation_variable_genl_constraints( var, arg, mt ) );
                    }
                  }
                }
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        result = list_utilities.delete_duplicate_forts( result );
      }
      finally
      {
        at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_3, thread );
        at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$72, thread );
        at_vars.$at_reln$.rebind( _prev_bind_0_$71, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 80437L)
  public static SubLObject neg_lit_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    if( NIL != czer_utilities.within_disjunctionP() )
    {
      return pos_lit_variable_inter_arg_isa_constraints( var, literal, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 80617L)
  public static SubLObject neg_lit_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    if( NIL != czer_utilities.within_disjunctionP() )
    {
      return pos_lit_variable_inter_arg_genl_constraints( var, literal, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 80799L)
  public static SubLObject pos_lit_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    SubLObject result = NIL;
    if( NIL == forts.fort_p( predicate ) )
    {
      predicate = cycl_utilities.find_when_closed_naut( predicate );
    }
    final SubLObject v_arity = el_utilities.literal_arity( literal, UNPROVIDED );
    SubLObject argnum = ZERO_INTEGER;
    final SubLObject scoping_args = ( NIL != forts.fort_p( predicate ) ) ? kb_accessors.scoping_args( predicate, mt ) : NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      final SubLObject genl_somethingP = ( NIL != forts.fort_p( predicate ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( predicate, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( predicate,
          UNPROVIDED, UNPROVIDED ) ) : NIL;
      final SubLObject _prev_bind_0_$74 = at_vars.$at_reln$.currentBinding( thread );
      final SubLObject _prev_bind_1_$75 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
      try
      {
        at_vars.$at_reln$.bind( predicate, thread );
        at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
        at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
        SubLObject cdolist_list_var = el_utilities.literal_args( literal, $kw48$REGULARIZE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          argnum = Numbers.add( argnum, ONE_INTEGER );
          if( NIL == subl_promotions.memberP( argnum, scoping_args, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL == cycl_grammar.fast_cycl_quoted_term_p( arg ) )
            {
              if( NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP( predicate, argnum, mt ) )
              {
                if( var.equal( vt_unskolemize_term( arg ) ) )
                {
                  final SubLObject _prev_bind_0_$75 = at_vars.$at_profile_term$.currentBinding( thread );
                  try
                  {
                    at_vars.$at_profile_term$.bind( var.equal( at_vars.$at_profile_term$.getDynamicValue( thread ) ) ? at_vars.$at_profile_term$.getDynamicValue( thread ) : NIL, thread );
                    SubLObject index;
                    SubLObject ind_argnum;
                    SubLObject ind_arg;
                    SubLObject cdolist_list_var_$77;
                    SubLObject ind_type;
                    for( index = NIL, index = ZERO_INTEGER; index.numL( v_arity ); index = Numbers.add( index, ONE_INTEGER ) )
                    {
                      ind_argnum = Numbers.add( index, ONE_INTEGER );
                      if( !argnum.numE( ind_argnum ) )
                      {
                        ind_arg = el_utilities.literal_arg( literal, ind_argnum, UNPROVIDED );
                        if( NIL != ind_arg )
                        {
                          if( NIL != at_inter_arg_checkable_objectP( ind_arg ) )
                          {
                            result = ConsesLow.nconc( result, inter_arg_isa( predicate, argnum, ind_arg, ind_argnum ) );
                          }
                          else
                          {
                            cdolist_list_var_$77 = list_utilities.alist_lookup( at_vars.$at_var_isa$.getDynamicValue( thread ), ind_arg, UNPROVIDED, UNPROVIDED );
                            ind_type = NIL;
                            ind_type = cdolist_list_var_$77.first();
                            while ( NIL != cdolist_list_var_$77)
                            {
                              result = ConsesLow.nconc( result, inter_arg_isa_from_type( predicate, argnum, ind_type, ind_argnum ) );
                              cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                              ind_type = cdolist_list_var_$77.first();
                            }
                          }
                        }
                      }
                    }
                  }
                  finally
                  {
                    at_vars.$at_profile_term$.rebind( _prev_bind_0_$75, thread );
                  }
                }
                else if( NIL == modal_in_argP( predicate, argnum, mt ) )
                {
                  if( NIL == term.unreified_skolem_termP( arg ) )
                  {
                    if( NIL != czer_utilities.sentence_argP( predicate, argnum, mt ) )
                    {
                      if( NIL != czer_utilities.assertable_sentence_argP( predicate, argnum, mt ) )
                      {
                        if( NIL != el_utilities.mt_designating_literalP( literal ) )
                        {
                          final SubLObject mt_arg = el_utilities.designated_mt( literal );
                          final SubLObject subformula = el_utilities.designated_sentence( literal );
                          final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
                          if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
                          {
                            result = ConsesLow.nconc( result, formula_variable_inter_arg_isa_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
                          }
                        }
                        else
                        {
                          result = ConsesLow.nconc( result, formula_variable_inter_arg_isa_constraints( var, arg, mt, at_arg_formula_type( predicate, argnum, mt ) ) );
                        }
                      }
                    }
                    else if( NIL == el_utilities.arg_types_prescribe_tacit_term_listP( predicate, argnum ) )
                    {
                      if( NIL != list_utilities.tree_find( var, arg, EQUAL, UNPROVIDED ) )
                      {
                        result = ConsesLow.nconc( result, relation_variable_inter_arg_isa_constraints( var, arg, mt ) );
                      }
                    }
                  }
                }
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
      }
      finally
      {
        at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_3, thread );
        at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$75, thread );
        at_vars.$at_reln$.rebind( _prev_bind_0_$74, thread );
      }
      result = list_utilities.delete_duplicate_forts( result );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 83156L)
  public static SubLObject at_inter_arg_checkable_objectP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) || NIL != term.first_order_nautP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 83276L)
  public static SubLObject pos_lit_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject literal, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject predicate = el_utilities.literal_predicate( literal, UNPROVIDED );
    final SubLObject v_arity = el_utilities.literal_arity( literal, UNPROVIDED );
    SubLObject argnum = ZERO_INTEGER;
    SubLObject scoping_args = NIL;
    SubLObject result = NIL;
    if( NIL == forts.fort_p( predicate ) )
    {
      predicate = cycl_utilities.find_when_closed_naut( predicate );
    }
    scoping_args = ( NIL != forts.fort_p( predicate ) ) ? kb_accessors.scoping_args( predicate, mt ) : NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
      final SubLObject genl_somethingP = ( NIL != forts.fort_p( predicate ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( predicate, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( predicate,
          UNPROVIDED, UNPROVIDED ) ) : NIL;
      final SubLObject _prev_bind_0_$78 = at_vars.$at_reln$.currentBinding( thread );
      final SubLObject _prev_bind_1_$79 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
      try
      {
        at_vars.$at_reln$.bind( predicate, thread );
        at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
        at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
        SubLObject cdolist_list_var = el_utilities.literal_args( literal, $kw48$REGULARIZE );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          argnum = Numbers.add( argnum, ONE_INTEGER );
          if( NIL == subl_promotions.memberP( argnum, scoping_args, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL == cycl_grammar.fast_cycl_quoted_term_p( arg ) )
            {
              if( NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP( predicate, argnum, mt ) )
              {
                if( var.equal( vt_unskolemize_term( arg ) ) )
                {
                  final SubLObject _prev_bind_0_$79 = at_vars.$at_profile_term$.currentBinding( thread );
                  try
                  {
                    at_vars.$at_profile_term$.bind( var.equal( at_vars.$at_profile_term$.getDynamicValue( thread ) ) ? at_vars.$at_profile_term$.getDynamicValue( thread ) : NIL, thread );
                    SubLObject index;
                    SubLObject ind_argnum;
                    SubLObject ind_arg;
                    SubLObject cdolist_list_var_$81;
                    SubLObject ind_type;
                    for( index = NIL, index = ZERO_INTEGER; index.numL( v_arity ); index = Numbers.add( index, ONE_INTEGER ) )
                    {
                      ind_argnum = Numbers.add( index, ONE_INTEGER );
                      if( !argnum.numE( ind_argnum ) )
                      {
                        ind_arg = el_utilities.literal_arg( literal, ind_argnum, UNPROVIDED );
                        if( NIL != ind_arg )
                        {
                          if( NIL != forts.fort_p( ind_arg ) || NIL != term.first_order_nautP( ind_arg ) )
                          {
                            result = ConsesLow.nconc( result, inter_arg_genl( predicate, argnum, ind_arg, ind_argnum ) );
                          }
                          else
                          {
                            cdolist_list_var_$81 = conses_high.assoc( ind_arg, at_vars.$at_var_genl$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
                            ind_type = NIL;
                            ind_type = cdolist_list_var_$81.first();
                            while ( NIL != cdolist_list_var_$81)
                            {
                              result = ConsesLow.nconc( result, inter_arg_genl_from_type( predicate, argnum, ind_type, ind_argnum ) );
                              cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                              ind_type = cdolist_list_var_$81.first();
                            }
                          }
                        }
                      }
                    }
                  }
                  finally
                  {
                    at_vars.$at_profile_term$.rebind( _prev_bind_0_$79, thread );
                  }
                }
                else if( NIL == modal_in_argP( predicate, argnum, mt ) )
                {
                  if( NIL == term.unreified_skolem_termP( arg ) )
                  {
                    if( NIL != czer_utilities.sentence_argP( predicate, argnum, mt ) )
                    {
                      if( NIL != czer_utilities.assertable_sentence_argP( predicate, argnum, mt ) )
                      {
                        if( NIL != el_utilities.mt_designating_literalP( literal ) )
                        {
                          final SubLObject mt_arg = el_utilities.designated_mt( literal );
                          final SubLObject subformula = el_utilities.designated_sentence( literal );
                          final SubLObject lit_mt = ( NIL != fort_types_interface.mtP( mt_arg ) ) ? mt_arg : mt;
                          if( NIL == control_vars.within_askP() || NIL != fort_types_interface.mtP( mt_arg ) )
                          {
                            result = ConsesLow.nconc( result, formula_variable_inter_arg_genl_constraints( var, subformula, lit_mt, at_arg_formula_type( predicate, TWO_INTEGER, lit_mt ) ) );
                          }
                        }
                        else
                        {
                          result = ConsesLow.nconc( result, formula_variable_inter_arg_genl_constraints( var, arg, mt, at_arg_formula_type( predicate, argnum, mt ) ) );
                        }
                      }
                    }
                    else if( NIL == el_utilities.arg_types_prescribe_tacit_term_listP( predicate, argnum ) )
                    {
                      if( NIL != list_utilities.tree_find( var, arg, EQUAL, UNPROVIDED ) )
                      {
                        result = ConsesLow.nconc( result, relation_variable_inter_arg_genl_constraints( var, arg, mt ) );
                      }
                    }
                  }
                }
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        result = list_utilities.delete_duplicate_forts( result );
      }
      finally
      {
        at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_3, thread );
        at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$79, thread );
        at_vars.$at_reln$.rebind( _prev_bind_0_$78, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 85588L)
  public static SubLObject formula_variable_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt, SubLObject formula_type)
  {
    if( formula_type == UNPROVIDED )
    {
      formula_type = $kw51$DNF;
    }
    return formula_variable_arg_constraints( var, formula, $kw27$ISA, mt, formula_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 86010L)
  public static SubLObject formula_variable_quoted_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt, SubLObject formula_type)
  {
    if( formula_type == UNPROVIDED )
    {
      formula_type = $kw51$DNF;
    }
    return formula_variable_arg_constraints( var, formula, $kw28$QUOTED_ISA, mt, formula_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 86200L)
  public static SubLObject formula_variable_genl_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt, SubLObject formula_type)
  {
    if( formula_type == UNPROVIDED )
    {
      formula_type = $kw51$DNF;
    }
    return formula_variable_arg_constraints( var, formula, $kw29$GENLS, mt, formula_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 86379L)
  public static SubLObject formula_variable_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject constraint_type, final SubLObject mt, SubLObject formula_type)
  {
    if( formula_type == UNPROVIDED )
    {
      formula_type = $kw51$DNF;
    }
    final SubLObject pcase_var = formula_type;
    if( pcase_var.eql( $kw52$CNF ) )
    {
      return cnf_formula_variable_arg_constraints( var, formula, constraint_type, mt );
    }
    if( pcase_var.eql( $kw51$DNF ) )
    {
      return dnf_formula_variable_arg_constraints( var, formula, constraint_type, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 87141L)
  public static SubLObject cnf_formula_variable_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject type, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !formula.isAtom() )
    {
      thread.resetMultipleValues();
      final SubLObject cnfs = at_var_type_cnfs( formula, mt );
      final SubLObject new_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject constraints = NIL;
      if( type.eql( $kw27$ISA ) )
      {
        constraints = at_min_cols( cnfs_variable_isa_constraints( var, cnfs, new_mt ), new_mt );
      }
      else if( type.eql( $kw28$QUOTED_ISA ) )
      {
        constraints = at_min_cols( cnfs_variable_quoted_isa_constraints( var, cnfs, new_mt ), new_mt );
      }
      else if( type.eql( $kw29$GENLS ) )
      {
        constraints = at_min_cols( cnfs_variable_genl_constraints( var, cnfs, new_mt ), new_mt );
      }
      return constraints;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 87795L)
  public static SubLObject dnf_formula_variable_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject type, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !formula.isAtom() )
    {
      thread.resetMultipleValues();
      final SubLObject dnfs = at_var_type_dnfs( formula, mt, NIL );
      final SubLObject new_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject constraints = NIL;
      if( dnfs.isCons() )
      {
        if( type.eql( $kw27$ISA ) )
        {
          constraints = at_min_cols( dnfs_variable_isa_constraints( var, dnfs, new_mt ), new_mt );
        }
        else if( type.eql( $kw28$QUOTED_ISA ) )
        {
          constraints = at_min_cols( dnfs_variable_quoted_isa_constraints( var, dnfs, new_mt ), new_mt );
        }
        else if( type.eql( $kw29$GENLS ) )
        {
          constraints = at_min_cols( dnfs_variable_genl_constraints( var, dnfs, new_mt ), new_mt );
        }
        if( NIL != constraints )
        {
          if( NIL != list_utilities.singletonP( dnfs ) )
          {
            return constraints;
          }
          return genls.min_ceiling_cols( constraints, NIL, mt, UNPROVIDED );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 89083L)
  public static SubLObject formula_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt, SubLObject formula_type)
  {
    if( formula_type == UNPROVIDED )
    {
      formula_type = $kw51$DNF;
    }
    return formula_variable_inter_arg_constraints( var, formula, $kw27$ISA, mt, formula_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 89339L)
  public static SubLObject formula_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt, SubLObject formula_type)
  {
    if( formula_type == UNPROVIDED )
    {
      formula_type = $kw51$DNF;
    }
    return formula_variable_inter_arg_constraints( var, formula, $kw29$GENLS, mt, formula_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 89532L)
  public static SubLObject formula_variable_inter_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject constraint_type, final SubLObject mt, SubLObject formula_type)
  {
    if( formula_type == UNPROVIDED )
    {
      formula_type = $kw51$DNF;
    }
    final SubLObject pcase_var = formula_type;
    if( pcase_var.eql( $kw52$CNF ) )
    {
      return cnf_formula_variable_inter_arg_constraints( var, formula, constraint_type, mt );
    }
    if( pcase_var.eql( $kw51$DNF ) )
    {
      return dnf_formula_variable_inter_arg_constraints( var, formula, constraint_type, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 90310L)
  public static SubLObject cnf_formula_variable_inter_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject type, final SubLObject formula_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !formula.isAtom() )
    {
      thread.resetMultipleValues();
      final SubLObject cnfs = at_var_type_cnfs( formula, formula_mt );
      final SubLObject mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject var_constraints = NIL;
      SubLObject inter_arg_constraints = NIL;
      if( type.eql( $kw27$ISA ) )
      {
        final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding( thread );
        try
        {
          at_vars.$at_check_inter_arg_isaP$.bind( NIL, thread );
          var_constraints = cnfs_variables_isa_constraints( cnfs, mt, $sym2$CYC_VAR_ );
          inter_arg_constraints = at_min_cols( cnfs_variable_inter_arg_isa_constraints( var, cnfs, var_constraints, mt ), mt );
        }
        finally
        {
          at_vars.$at_check_inter_arg_isaP$.rebind( _prev_bind_0, thread );
        }
      }
      else if( type.eql( $kw29$GENLS ) )
      {
        final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_genlP$.currentBinding( thread );
        try
        {
          at_vars.$at_check_inter_arg_genlP$.bind( NIL, thread );
          var_constraints = cnfs_variables_genl_constraints( cnfs, mt, $sym2$CYC_VAR_ );
          inter_arg_constraints = at_min_cols( cnfs_variable_inter_arg_genl_constraints( var, cnfs, var_constraints, mt ), mt );
        }
        finally
        {
          at_vars.$at_check_inter_arg_genlP$.rebind( _prev_bind_0, thread );
        }
      }
      return inter_arg_constraints;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 91180L)
  public static SubLObject dnf_formula_variable_inter_arg_constraints(final SubLObject var, final SubLObject formula, final SubLObject type, final SubLObject formula_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !formula.isAtom() )
    {
      thread.resetMultipleValues();
      final SubLObject dnfs = at_var_type_dnfs( formula, formula_mt, NIL );
      final SubLObject mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject var_constraints = NIL;
      SubLObject inter_arg_constraints = NIL;
      if( dnfs.isCons() )
      {
        if( type.eql( $kw27$ISA ) )
        {
          final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding( thread );
          try
          {
            at_vars.$at_check_inter_arg_isaP$.bind( NIL, thread );
            var_constraints = dnfs_variables_isa_constraints( dnfs, mt, $sym2$CYC_VAR_ );
            inter_arg_constraints = at_min_cols( dnfs_variable_inter_arg_isa_constraints( var, dnfs, var_constraints, mt ), mt );
          }
          finally
          {
            at_vars.$at_check_inter_arg_isaP$.rebind( _prev_bind_0, thread );
          }
        }
        else if( type.eql( $kw29$GENLS ) )
        {
          final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_genlP$.currentBinding( thread );
          try
          {
            at_vars.$at_check_inter_arg_genlP$.bind( NIL, thread );
            var_constraints = dnfs_variables_genl_constraints( dnfs, mt, $sym2$CYC_VAR_ );
            inter_arg_constraints = at_min_cols( dnfs_variable_inter_arg_genl_constraints( var, dnfs, var_constraints, mt ), mt );
          }
          finally
          {
            at_vars.$at_check_inter_arg_genlP$.rebind( _prev_bind_0, thread );
          }
        }
        if( NIL != inter_arg_constraints )
        {
          if( NIL != list_utilities.singletonP( dnfs ) )
          {
            return inter_arg_constraints;
          }
          return genls.min_ceiling_cols( inter_arg_constraints, NIL, mt, UNPROVIDED );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 92263L)
  public static SubLObject relation_variable_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.relation_expressionP( formula ) )
    {
      SubLObject relation = cycl_utilities.formula_operator( formula );
      SubLObject scoping_args = NIL;
      SubLObject result = NIL;
      if( var.eql( relation ) )
      {
        result = ConsesLow.cons( $const53$Relation, result );
      }
      else if( !relation.isAtom() )
      {
        relation = narts_high.nart_substitute( relation );
      }
      scoping_args = ( NIL != forts.fort_p( relation ) ) ? kb_accessors.scoping_args( relation, mt ) : NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
        final SubLObject genl_somethingP = ( NIL != forts.fort_p( relation ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( relation, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( relation,
            UNPROVIDED, UNPROVIDED ) ) : NIL;
        final SubLObject _prev_bind_0_$82 = at_vars.$at_reln$.currentBinding( thread );
        final SubLObject _prev_bind_1_$83 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
        final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
        try
        {
          at_vars.$at_reln$.bind( relation, thread );
          at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          SubLObject argnum = ZERO_INTEGER;
          SubLObject cdolist_list_var;
          final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw48$REGULARIZE );
          SubLObject arg = NIL;
          arg = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            argnum = Numbers.add( argnum, ONE_INTEGER );
            if( NIL == subl_promotions.memberP( argnum, scoping_args, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP( relation, argnum, mt ) )
              {
                if( var.equal( arg ) )
                {
                  result = ConsesLow.nconc( result, at_argn_isa( relation, argnum ) );
                }
                else if( NIL == modal_in_argP( relation, argnum, mt ) )
                {
                  if( NIL != czer_utilities.sentence_argP( relation, argnum, mt ) )
                  {
                    if( NIL != czer_utilities.assertable_sentence_argP( relation, argnum, mt ) )
                    {
                      result = ConsesLow.nconc( result, formula_variable_isa_constraints( var, arg, mt, at_arg_formula_type( relation, argnum, mt ) ) );
                    }
                  }
                  else if( NIL == term.unreified_skolem_termP( arg ) )
                  {
                    if( NIL == el_utilities.arg_types_prescribe_tacit_term_listP( relation, argnum ) )
                    {
                      if( NIL != list_utilities.tree_find( var, arg, EQUAL, UNPROVIDED ) )
                      {
                        result = ConsesLow.nconc( result, relation_variable_isa_constraints( var, arg, mt ) );
                      }
                    }
                  }
                }
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
          }
          result = at_min_cols( list_utilities.delete_duplicate_forts( result ), mt );
        }
        finally
        {
          at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_3, thread );
          at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$83, thread );
          at_vars.$at_reln$.rebind( _prev_bind_0_$82, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 93675L)
  public static SubLObject relation_variable_quoted_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.relation_expressionP( formula ) )
    {
      SubLObject relation = cycl_utilities.formula_operator( formula );
      SubLObject scoping_args = NIL;
      SubLObject result = NIL;
      if( !relation.isAtom() )
      {
        relation = narts_high.nart_substitute( relation );
      }
      scoping_args = ( NIL != forts.fort_p( relation ) ) ? kb_accessors.scoping_args( relation, mt ) : NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
        final SubLObject genl_somethingP = ( NIL != forts.fort_p( relation ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( relation, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( relation,
            UNPROVIDED, UNPROVIDED ) ) : NIL;
        final SubLObject _prev_bind_0_$84 = at_vars.$at_reln$.currentBinding( thread );
        final SubLObject _prev_bind_1_$85 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
        final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
        try
        {
          at_vars.$at_reln$.bind( relation, thread );
          at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          SubLObject argnum = ZERO_INTEGER;
          SubLObject cdolist_list_var;
          final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw48$REGULARIZE );
          SubLObject arg = NIL;
          arg = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            argnum = Numbers.add( argnum, ONE_INTEGER );
            if( NIL == subl_promotions.memberP( argnum, scoping_args, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP( relation, argnum, mt ) )
              {
                if( var.equal( arg ) )
                {
                  result = ConsesLow.nconc( result, at_argn_quoted_isa( relation, argnum ) );
                }
                else if( NIL == modal_in_argP( relation, argnum, mt ) )
                {
                  if( NIL != czer_utilities.sentence_argP( relation, argnum, mt ) )
                  {
                    if( NIL != czer_utilities.assertable_sentence_argP( relation, argnum, mt ) )
                    {
                      result = ConsesLow.nconc( result, formula_variable_quoted_isa_constraints( var, arg, mt, at_arg_formula_type( relation, argnum, mt ) ) );
                    }
                  }
                  else if( NIL == term.unreified_skolem_termP( arg ) )
                  {
                    if( NIL == el_utilities.arg_types_prescribe_tacit_term_listP( relation, argnum ) )
                    {
                      if( NIL != list_utilities.tree_find( var, arg, EQUAL, UNPROVIDED ) )
                      {
                        result = ConsesLow.nconc( result, relation_variable_quoted_isa_constraints( var, arg, mt ) );
                      }
                    }
                  }
                }
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
          }
          result = at_min_cols( list_utilities.delete_duplicate_forts( result ), mt );
        }
        finally
        {
          at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_3, thread );
          at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$85, thread );
          at_vars.$at_reln$.rebind( _prev_bind_0_$84, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 94956L)
  public static SubLObject relation_variable_genl_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.relation_expressionP( formula ) )
    {
      SubLObject relation = cycl_utilities.formula_operator( formula );
      SubLObject argnum = ZERO_INTEGER;
      SubLObject scoping_args = NIL;
      SubLObject result = NIL;
      if( !relation.isAtom() )
      {
        relation = narts_high.nart_substitute( relation );
      }
      scoping_args = ( NIL != forts.fort_p( relation ) ) ? kb_accessors.scoping_args( relation, mt ) : NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
        final SubLObject genl_somethingP = ( NIL != forts.fort_p( relation ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( relation, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( relation,
            UNPROVIDED, UNPROVIDED ) ) : NIL;
        final SubLObject _prev_bind_0_$86 = at_vars.$at_reln$.currentBinding( thread );
        final SubLObject _prev_bind_1_$87 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
        final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
        try
        {
          at_vars.$at_reln$.bind( relation, thread );
          at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          SubLObject cdolist_list_var;
          final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw48$REGULARIZE );
          SubLObject arg = NIL;
          arg = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            argnum = Numbers.add( argnum, ONE_INTEGER );
            if( NIL == subl_promotions.memberP( argnum, scoping_args, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP( relation, argnum, mt ) )
              {
                if( var.equal( arg ) )
                {
                  result = ConsesLow.nconc( result, at_argn_genl( relation, argnum ) );
                }
                else if( NIL == modal_in_argP( relation, argnum, mt ) )
                {
                  if( NIL != czer_utilities.sentence_argP( relation, argnum, mt ) )
                  {
                    if( NIL != czer_utilities.assertable_sentence_argP( relation, argnum, mt ) )
                    {
                      result = ConsesLow.nconc( result, formula_variable_genl_constraints( var, arg, mt, at_arg_formula_type( relation, argnum, mt ) ) );
                    }
                  }
                  else if( NIL == term.unreified_skolem_termP( arg ) )
                  {
                    if( NIL == el_utilities.arg_types_prescribe_tacit_term_listP( relation, argnum ) )
                    {
                      if( NIL != list_utilities.tree_find( var, arg, EQUAL, UNPROVIDED ) )
                      {
                        result = ConsesLow.nconc( result, relation_variable_genl_constraints( var, arg, mt ) );
                      }
                    }
                  }
                }
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
          }
          result = at_min_cols( list_utilities.delete_duplicate_forts( result ), mt );
        }
        finally
        {
          at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_3, thread );
          at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$87, thread );
          at_vars.$at_reln$.rebind( _prev_bind_0_$86, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 96263L)
  public static SubLObject relation_variable_inter_arg_isa_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.function_termP( formula ) )
    {
      SubLObject relation = cycl_utilities.formula_operator( formula );
      final SubLObject v_arity = el_utilities.formula_arity( formula, UNPROVIDED );
      SubLObject argnum = ZERO_INTEGER;
      SubLObject scoping_args = NIL;
      SubLObject result = NIL;
      if( !relation.isAtom() )
      {
        relation = narts_high.nart_substitute( relation );
      }
      scoping_args = ( NIL != forts.fort_p( relation ) ) ? kb_accessors.scoping_args( relation, mt ) : NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
        final SubLObject genl_somethingP = ( NIL != forts.fort_p( relation ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( relation, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( relation,
            UNPROVIDED, UNPROVIDED ) ) : NIL;
        final SubLObject _prev_bind_0_$88 = at_vars.$at_reln$.currentBinding( thread );
        final SubLObject _prev_bind_1_$89 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
        final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
        try
        {
          at_vars.$at_reln$.bind( relation, thread );
          at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          SubLObject cdolist_list_var;
          final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw48$REGULARIZE );
          SubLObject arg = NIL;
          arg = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            argnum = Numbers.add( argnum, ONE_INTEGER );
            if( NIL == subl_promotions.memberP( argnum, scoping_args, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP( relation, argnum, mt ) )
              {
                if( var.equal( arg ) )
                {
                  SubLObject index;
                  SubLObject ind_argnum;
                  SubLObject ind_arg;
                  SubLObject cdolist_list_var_$90;
                  SubLObject ind_type;
                  for( index = NIL, index = ZERO_INTEGER; index.numL( v_arity ); index = Numbers.add( index, ONE_INTEGER ) )
                  {
                    ind_argnum = Numbers.add( index, ONE_INTEGER );
                    if( !argnum.numE( ind_argnum ) )
                    {
                      ind_arg = cycl_utilities.formula_arg( formula, ind_argnum, UNPROVIDED );
                      if( NIL != ind_arg )
                      {
                        if( NIL != forts.fort_p( ind_arg ) || NIL != term.first_order_nautP( ind_arg ) )
                        {
                          result = ConsesLow.nconc( result, inter_arg_isa( relation, argnum, ind_arg, ind_argnum ) );
                        }
                        else
                        {
                          cdolist_list_var_$90 = conses_high.assoc( ind_arg, at_vars.$at_var_isa$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
                          ind_type = NIL;
                          ind_type = cdolist_list_var_$90.first();
                          while ( NIL != cdolist_list_var_$90)
                          {
                            result = ConsesLow.nconc( result, inter_arg_isa_from_type( relation, argnum, ind_type, ind_argnum ) );
                            cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                            ind_type = cdolist_list_var_$90.first();
                          }
                        }
                      }
                    }
                  }
                }
                else if( NIL == modal_in_argP( relation, argnum, mt ) )
                {
                  if( NIL != czer_utilities.sentence_argP( relation, argnum, mt ) )
                  {
                    if( NIL != czer_utilities.assertable_sentence_argP( relation, argnum, mt ) )
                    {
                      result = ConsesLow.nconc( result, formula_variable_inter_arg_isa_constraints( var, arg, mt, at_arg_formula_type( relation, argnum, mt ) ) );
                    }
                  }
                  else if( NIL == term.unreified_skolem_termP( arg ) )
                  {
                    if( NIL == el_utilities.arg_types_prescribe_tacit_term_listP( relation, argnum ) )
                    {
                      if( NIL != list_utilities.tree_find( var, arg, EQUAL, UNPROVIDED ) )
                      {
                        result = ConsesLow.nconc( result, relation_variable_inter_arg_isa_constraints( var, arg, mt ) );
                      }
                    }
                  }
                }
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
          }
          result = at_min_cols( list_utilities.delete_duplicate_forts( result ), mt );
        }
        finally
        {
          at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_3, thread );
          at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$89, thread );
          at_vars.$at_reln$.rebind( _prev_bind_0_$88, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 98035L)
  public static SubLObject relation_variable_inter_arg_genl_constraints(final SubLObject var, final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.function_termP( formula ) )
    {
      SubLObject relation = cycl_utilities.formula_operator( formula );
      final SubLObject v_arity = el_utilities.formula_arity( formula, UNPROVIDED );
      SubLObject argnum = ZERO_INTEGER;
      SubLObject scoping_args = NIL;
      SubLObject result = NIL;
      if( !relation.isAtom() )
      {
        relation = narts_high.nart_substitute( relation );
      }
      scoping_args = ( NIL != forts.fort_p( relation ) ) ? kb_accessors.scoping_args( relation, mt ) : NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
        final SubLObject genl_somethingP = ( NIL != forts.fort_p( relation ) ) ? makeBoolean( NIL != genl_predicates.genl_predicates( relation, UNPROVIDED, UNPROVIDED ) || NIL != genl_predicates.genl_inverses( relation,
            UNPROVIDED, UNPROVIDED ) ) : NIL;
        final SubLObject _prev_bind_0_$91 = at_vars.$at_reln$.currentBinding( thread );
        final SubLObject _prev_bind_1_$92 = at_vars.$at_search_genl_predsP$.currentBinding( thread );
        final SubLObject _prev_bind_3 = at_vars.$at_search_genl_inversesP$.currentBinding( thread );
        try
        {
          at_vars.$at_reln$.bind( relation, thread );
          at_vars.$at_search_genl_predsP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_predsP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          at_vars.$at_search_genl_inversesP$.bind( makeBoolean( NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue( thread ) && NIL != genl_somethingP ), thread );
          SubLObject cdolist_list_var;
          final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw48$REGULARIZE );
          SubLObject arg = NIL;
          arg = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            argnum = Numbers.add( argnum, ONE_INTEGER );
            if( NIL == subl_promotions.memberP( argnum, scoping_args, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL == czer_utilities.relax_arg_type_constraints_for_variables_for_argP( relation, argnum, mt ) )
              {
                if( var.equal( arg ) )
                {
                  SubLObject index;
                  SubLObject ind_argnum;
                  SubLObject ind_arg;
                  SubLObject cdolist_list_var_$93;
                  SubLObject ind_type;
                  for( index = NIL, index = ZERO_INTEGER; index.numL( v_arity ); index = Numbers.add( index, ONE_INTEGER ) )
                  {
                    ind_argnum = Numbers.add( index, ONE_INTEGER );
                    if( !argnum.numE( ind_argnum ) )
                    {
                      ind_arg = cycl_utilities.formula_arg( formula, ind_argnum, UNPROVIDED );
                      if( NIL != ind_arg )
                      {
                        if( NIL != forts.fort_p( ind_arg ) || NIL != term.first_order_nautP( ind_arg ) )
                        {
                          result = ConsesLow.nconc( result, inter_arg_genl( relation, argnum, ind_arg, ind_argnum ) );
                        }
                        else
                        {
                          cdolist_list_var_$93 = conses_high.assoc( ind_arg, at_vars.$at_var_genl$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
                          ind_type = NIL;
                          ind_type = cdolist_list_var_$93.first();
                          while ( NIL != cdolist_list_var_$93)
                          {
                            result = ConsesLow.nconc( result, inter_arg_genl_from_type( relation, argnum, ind_type, ind_argnum ) );
                            cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                            ind_type = cdolist_list_var_$93.first();
                          }
                        }
                      }
                    }
                  }
                }
                else if( NIL == modal_in_argP( relation, argnum, mt ) )
                {
                  if( NIL != czer_utilities.sentence_argP( relation, argnum, mt ) )
                  {
                    if( NIL != czer_utilities.assertable_sentence_argP( relation, argnum, mt ) )
                    {
                      result = ConsesLow.nconc( result, formula_variable_inter_arg_genl_constraints( var, arg, mt, at_arg_formula_type( relation, argnum, mt ) ) );
                    }
                  }
                  else if( NIL == term.unreified_skolem_termP( arg ) )
                  {
                    if( NIL == el_utilities.arg_types_prescribe_tacit_term_listP( relation, argnum ) )
                    {
                      if( NIL != list_utilities.tree_find( var, arg, EQUAL, UNPROVIDED ) )
                      {
                        result = ConsesLow.nconc( result, relation_variable_inter_arg_genl_constraints( var, arg, mt ) );
                      }
                    }
                  }
                }
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
          }
          result = at_min_cols( list_utilities.delete_duplicate_forts( result ), mt );
        }
        finally
        {
          at_vars.$at_search_genl_inversesP$.rebind( _prev_bind_3, thread );
          at_vars.$at_search_genl_predsP$.rebind( _prev_bind_1_$92, thread );
          at_vars.$at_reln$.rebind( _prev_bind_0_$91, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 99813L)
  public static SubLObject at_min_cols(final SubLObject cols, final SubLObject mt)
  {
    if( NIL == cols )
    {
      return NIL;
    }
    return conses_high.copy_list( at_min_cols_memoized( kb_utilities.sort_terms( cols, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 100069L)
  public static SubLObject at_min_cols_memoized_internal(final SubLObject cols, final SubLObject mt)
  {
    return genls.min_cols( cols, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 100069L)
  public static SubLObject at_min_cols_memoized(final SubLObject cols, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return at_min_cols_memoized_internal( cols, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym54$AT_MIN_COLS_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym54$AT_MIN_COLS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym54$AT_MIN_COLS_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( cols, mt );
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
        if( cols.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( at_min_cols_memoized_internal( cols, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( cols, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 100181L)
  public static SubLObject query_argP(final SubLObject reln, final SubLObject argnum, final SubLObject mt)
  {
    if( argnum.isInteger() && argnum.numG( ZERO_INTEGER ) )
    {
      SubLObject queryP = NIL;
      if( NIL == queryP )
      {
        SubLObject csome_list_var;
        SubLObject collection;
        for( csome_list_var = kb_accessors.argn_isa( reln, argnum, mt ), collection = NIL, collection = csome_list_var.first(); NIL == queryP && NIL != csome_list_var; queryP = query_denoting_collectionP( collection,
            mt ), csome_list_var = csome_list_var.rest(), collection = csome_list_var.first() )
        {
        }
      }
      if( NIL == queryP )
      {
        SubLObject csome_list_var;
        SubLObject collection;
        for( csome_list_var = kb_accessors.argn_quoted_isa( reln, argnum, mt ), collection = NIL, collection = csome_list_var.first(); NIL == queryP && NIL != csome_list_var; queryP = query_denoting_collectionP(
            collection, mt ), csome_list_var = csome_list_var.rest(), collection = csome_list_var.first() )
        {
        }
      }
      return queryP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 100782L)
  public static SubLObject query_denoting_collectionP(final SubLObject collection, final SubLObject mt)
  {
    return subl_promotions.memberP( $sym55$CYC_QUERY_, kb_accessors.admitting_defns( collection, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 101064L)
  public static SubLObject at_arg_formula_type(final SubLObject reln, final SubLObject argnum, final SubLObject mt)
  {
    if( NIL != query_argP( reln, argnum, mt ) )
    {
      return $kw51$DNF;
    }
    if( NIL != term.mt_designating_relationP( reln ) )
    {
      return $kw52$CNF;
    }
    if( NIL != czer_utilities.sentence_argP( reln, argnum, mt ) )
    {
      return $kw51$DNF;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 101302L)
  public static SubLObject at_argn_isa(final SubLObject relation, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$mapping_assertion_bookkeeping_fn$.currentBinding( thread );
    try
    {
      at_vars.$at_constraint_type$.bind( $kw27$ISA, thread );
      control_vars.$mapping_assertion_bookkeeping_fn$.bind( $sym56$GATHER_AT_DATA_ASSERTION, thread );
      result = at_argn_int( relation, argnum, NIL, NIL, $sym57$ARGN_ISA, TWO_INTEGER );
    }
    finally
    {
      control_vars.$mapping_assertion_bookkeeping_fn$.rebind( _prev_bind_2, thread );
      at_vars.$at_constraint_type$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 101700L)
  public static SubLObject at_argn_quoted_isa(final SubLObject relation, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$mapping_assertion_bookkeeping_fn$.currentBinding( thread );
    try
    {
      at_vars.$at_constraint_type$.bind( $kw27$ISA, thread );
      control_vars.$mapping_assertion_bookkeeping_fn$.bind( $sym56$GATHER_AT_DATA_ASSERTION, thread );
      result = at_argn_int( relation, argnum, NIL, NIL, $sym58$ARGN_QUOTED_ISA, TWO_INTEGER );
    }
    finally
    {
      control_vars.$mapping_assertion_bookkeeping_fn$.rebind( _prev_bind_2, thread );
      at_vars.$at_constraint_type$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 102075L)
  public static SubLObject at_argn_genl(final SubLObject relation, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$mapping_assertion_bookkeeping_fn$.currentBinding( thread );
    try
    {
      at_vars.$at_constraint_type$.bind( $kw29$GENLS, thread );
      control_vars.$mapping_assertion_bookkeeping_fn$.bind( $sym56$GATHER_AT_DATA_ASSERTION, thread );
      result = at_argn_int( relation, argnum, NIL, NIL, $sym59$ARGN_GENL, TWO_INTEGER );
    }
    finally
    {
      control_vars.$mapping_assertion_bookkeeping_fn$.rebind( _prev_bind_2, thread );
      at_vars.$at_constraint_type$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 102440L)
  public static SubLObject inter_arg_isa(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum)
  {
    return at_argn_int( relation, argnum, ind_arg, ind_argnum, $sym60$INTER_ARG_ISA_INT, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 102686L)
  public static SubLObject inter_arg_genl(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum)
  {
    return at_argn_int( relation, argnum, ind_arg, ind_argnum, $sym61$INTER_ARG_GENL_INT, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 102934L)
  public static SubLObject inter_arg_isa_from_type(final SubLObject relation, final SubLObject argnum, final SubLObject ind_type, final SubLObject ind_argnum)
  {
    SubLObject result = NIL;
    if( NIL != term.el_fort_p( ind_type ) )
    {
      result = at_argn_int( relation, argnum, ind_type, ind_argnum, $sym62$INTER_ARG_ISA_FROM_TYPE_INT, FOUR_INTEGER );
    }
    else
    {
      result = NIL;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 103298L)
  public static SubLObject inter_arg_genl_from_type(final SubLObject relation, final SubLObject argnum, final SubLObject ind_type, final SubLObject ind_argnum)
  {
    SubLObject result = NIL;
    if( NIL != term.el_fort_p( ind_type ) )
    {
      result = at_argn_int( relation, argnum, ind_type, ind_argnum, $sym63$INTER_ARG_GENL_FROM_TYPE_INT, FOUR_INTEGER );
    }
    else
    {
      result = NIL;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 103664L)
  public static SubLObject at_argn_int(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject at_func, final SubLObject at_func_arity)
  {
    return conses_high.copy_list( at_argn_int_cached( relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_relevance_macros.mt_info( UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 104160L)
  public static SubLObject clear_at_argn_int_cached()
  {
    final SubLObject cs = $at_argn_int_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 104160L)
  public static SubLObject remove_at_argn_int_cached(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject at_func, final SubLObject at_func_arity,
      final SubLObject mt_info)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $at_argn_int_cached_caching_state$.getGlobalValue(), ConsesLow.list( relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 104160L)
  public static SubLObject at_argn_int_cached_internal(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject at_func, final SubLObject at_func_arity,
      final SubLObject mt_info)
  {
    if( NIL == arity.valid_relation_argnumP( relation, argnum ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    if( NIL != at_vars.at_searching_genl_predsP() || NIL != at_vars.at_searching_genl_inversesP() )
    {
      result = at_argn_int_funcall( at_func, at_func_arity, relation, argnum, ind_arg, ind_argnum );
      if( NIL != at_vars.at_searching_genl_predsP() )
      {
        SubLObject csome_list_var = genl_predicates.all_proper_genl_predicates( relation, NIL, NIL );
        SubLObject pred = NIL;
        pred = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          result = ConsesLow.nconc( result, at_argn_int_funcall( at_func, at_func_arity, pred, argnum, ind_arg, ind_argnum ) );
          csome_list_var = csome_list_var.rest();
          pred = csome_list_var.first();
        }
      }
      if( NIL != at_vars.at_searching_genl_inversesP() )
      {
        SubLObject csome_list_var = genl_predicates.all_proper_genl_inverses( relation, NIL, NIL );
        SubLObject inverse = NIL;
        inverse = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          result = ConsesLow.nconc( result, at_argn_int_funcall( at_func, at_func_arity, inverse, kb_accessors.inverse_argnum( argnum ), ind_arg, ind_argnum ) );
          csome_list_var = csome_list_var.rest();
          inverse = csome_list_var.first();
        }
      }
      result = list_utilities.delete_duplicate_forts( result );
    }
    else if( NIL != term.kb_relationP( relation ) )
    {
      result = at_argn_int_funcall( at_func, at_func_arity, relation, argnum, ind_arg, ind_argnum );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 104160L)
  public static SubLObject at_argn_int_cached(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject at_func, final SubLObject at_func_arity,
      final SubLObject mt_info)
  {
    SubLObject caching_state = $at_argn_int_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym64$AT_ARGN_INT_CACHED, $sym65$_AT_ARGN_INT_CACHED_CACHING_STATE_, $int8$1024, EQL, SEVEN_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym66$CLEAR_AT_ARGN_INT_CACHED );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_7( relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info );
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
        if( relation.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( argnum.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( ind_arg.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( ind_argnum.eql( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( at_func.eql( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( at_func_arity.eql( cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( NIL != cached_args && NIL == cached_args.rest() && mt_info.eql( cached_args.first() ) )
                    {
                      return memoization_state.caching_results( results2 );
                    }
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( at_argn_int_cached_internal( relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 105346L)
  public static SubLObject at_argn_int_funcall(final SubLObject at_func, final SubLObject at_func_arity, final SubLObject relation, final SubLObject arg, final SubLObject ind_arg, final SubLObject ind_argnum)
  {
    SubLObject result = NIL;
    if( at_func_arity.eql( TWO_INTEGER ) )
    {
      if( at_func.eql( $sym57$ARGN_ISA ) )
      {
        result = kb_accessors.argn_isa( relation, arg, UNPROVIDED );
      }
      else if( at_func.eql( $sym59$ARGN_GENL ) )
      {
        result = kb_accessors.argn_genl( relation, arg, UNPROVIDED );
      }
      else
      {
        result = Functions.funcall( at_func, relation, arg );
      }
    }
    else if( at_func_arity.eql( FOUR_INTEGER ) )
    {
      if( at_func.eql( $sym60$INTER_ARG_ISA_INT ) )
      {
        result = inter_arg_isa_int( relation, arg, ind_arg, ind_argnum );
      }
      else if( at_func.eql( $sym61$INTER_ARG_GENL_INT ) )
      {
        result = inter_arg_genl_int( relation, arg, ind_arg, ind_argnum );
      }
      else if( at_func.eql( $sym62$INTER_ARG_ISA_FROM_TYPE_INT ) )
      {
        result = inter_arg_isa_from_type_int( relation, arg, ind_arg, ind_argnum );
      }
      else if( at_func.eql( $sym63$INTER_ARG_GENL_FROM_TYPE_INT ) )
      {
        result = inter_arg_genl_from_type_int( relation, arg, ind_arg, ind_argnum );
      }
      else
      {
        result = Functions.funcall( at_func, relation, arg, ind_arg, ind_argnum );
      }
    }
    else
    {
      at_utilities.at_error( $str67$got_an_unexpected_function__s_wit, at_func, at_func_arity, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 105866L)
  public static SubLObject inter_arg_isa_int(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum)
  {
    final SubLObject at_pred = at_utilities.inter_arg_isa_pred( ind_argnum, argnum );
    if( NIL != at_pred )
    {
      return inter_arg_type_int( $kw27$ISA, relation, argnum, ind_arg, at_pred );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 106089L)
  public static SubLObject inter_arg_genl_int(final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject ind_argnum)
  {
    final SubLObject at_pred = at_utilities.inter_arg_genl_pred( ind_argnum, argnum );
    if( NIL != at_pred )
    {
      return inter_arg_type_int( $kw29$GENLS, relation, argnum, ind_arg, at_pred );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 106316L)
  public static SubLObject inter_arg_type_int(final SubLObject type, final SubLObject relation, final SubLObject argnum, final SubLObject ind_arg, final SubLObject at_pred)
  {
    SubLObject candidates = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( relation, ONE_INTEGER, at_pred ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( relation, ONE_INTEGER, at_pred );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw68$GAF, $kw69$TRUE, NIL );
            SubLObject done_var_$96 = NIL;
            final SubLObject token_var_$97 = NIL;
            while ( NIL == done_var_$96)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$97 );
              final SubLObject valid_$98 = makeBoolean( !token_var_$97.eql( assertion ) );
              if( NIL != valid_$98 )
              {
                final SubLObject ind_col = assertions_high.gaf_arg2( assertion );
                final SubLObject dep_col = assertions_high.gaf_arg3( assertion );
                candidates = ConsesLow.cons( ConsesLow.list( ind_col, dep_col, assertion ), candidates );
              }
              done_var_$96 = makeBoolean( NIL == valid_$98 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    if( NIL != candidates )
    {
      return inter_arg_type_verify_candidates( candidates, ind_arg, argnum, type );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 106772L)
  public static SubLObject inter_arg_type_verify_candidates(final SubLObject candidates, final SubLObject ind_arg, final SubLObject argnum, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject candidate_collections = Mapping.mapcar( Symbols.symbol_function( $sym70$FIRST ), candidates );
    final SubLObject actual_collections = ( type == $kw27$ISA ) ? isa.all_isa_among( ind_arg, candidate_collections, UNPROVIDED, UNPROVIDED )
        : genls.all_genls_among( ind_arg, candidate_collections, UNPROVIDED, UNPROVIDED );
    if( NIL != actual_collections )
    {
      SubLObject cdolist_list_var = candidates;
      SubLObject candidate = NIL;
      candidate = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = candidate;
        SubLObject ind_col = NIL;
        SubLObject dep_col = NIL;
        SubLObject assertion = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
        ind_col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
        dep_col = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
        assertion = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != subl_promotions.memberP( ind_col, actual_collections, UNPROVIDED, UNPROVIDED ) )
          {
            at_utilities.at_note( FIVE_INTEGER, $str72$__at_var__a_test__arg__s__s__cons, type, argnum, at_vars.$at_arg$.getDynamicValue( thread ), assertion, UNPROVIDED );
            final SubLObject _prev_bind_0 = at_vars.$at_constraint_gaf$.currentBinding( thread );
            try
            {
              at_vars.$at_constraint_gaf$.bind( assertion, thread );
              at_utilities.gather_at_data( assertion, dep_col, type, at_vars.$at_profile_term$.getDynamicValue( thread ) );
              result = ConsesLow.cons( dep_col, result );
            }
            finally
            {
              at_vars.$at_constraint_gaf$.rebind( _prev_bind_0, thread );
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        candidate = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 107631L)
  public static SubLObject inter_arg_isa_from_type_int(final SubLObject relation, final SubLObject argnum, final SubLObject ind_type, final SubLObject ind_argnum)
  {
    final SubLObject at_pred = at_utilities.inter_arg_isa_pred( ind_argnum, argnum );
    if( NIL != at_pred )
    {
      return inter_arg_type_int( $kw29$GENLS, relation, argnum, ind_type, at_pred );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 107962L)
  public static SubLObject inter_arg_genl_from_type_int(final SubLObject relation, final SubLObject argnum, final SubLObject ind_type, final SubLObject ind_argnum)
  {
    return inter_arg_genl_int( relation, argnum, ind_type, ind_argnum );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 108112L)
  public static SubLObject constraint_var_types_okP(final SubLObject var_types_pairs, SubLObject type, SubLObject mt)
  {
    if( type == UNPROVIDED )
    {
      type = $kw27$ISA;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return var_types_okP( var_types_pairs, type, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 108390L)
  public static SubLObject var_types_okP(final SubLObject var_types_pairs, SubLObject type, SubLObject mt)
  {
    if( type == UNPROVIDED )
    {
      type = $kw27$ISA;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var = at_vars.$at_var_types_standard$.getDynamicValue( thread );
    if( pcase_var.eql( $kw73$NOT_DISJOINT ) )
    {
      return var_types_not_disjointP( var_types_pairs, type, mt );
    }
    if( pcase_var.eql( $kw74$NEGLITS_SUBSUME_POSLITS ) )
    {
      return var_types_neglits_subsume_poslitsP( var_types_pairs, type, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 108673L)
  public static SubLObject var_types_not_disjointP(final SubLObject var_types_pairs, SubLObject type, SubLObject mt)
  {
    if( type == UNPROVIDED )
    {
      type = $kw27$ISA;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject doneP = NIL;
    SubLObject disjointP = NIL;
    SubLObject disjoint = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = var_types_pairs;
      SubLObject var_types = NIL;
      var_types = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        disjoint = disjoint_with.any_disjoint_collection_pair( var_types.rest(), mt );
        if( NIL != disjoint )
        {
          disjointP = T;
          doneP = at_utilities.at_finishedP( T );
          at_utilities.note_at_violation( var_type_disjoint_violation( type, var_types.first(), disjoint, mt ) );
        }
        csome_list_var = csome_list_var.rest();
        var_types = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == disjointP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 109093L)
  public static SubLObject var_type_disjoint_violation(final SubLObject type, final SubLObject col1, final SubLObject col2, final SubLObject mt)
  {
    SubLObject data = NIL;
    SubLObject module = NIL;
    if( type.eql( $kw27$ISA ) )
    {
      module = $kw36$DISJOINT_ARG_ISA;
    }
    else if( type.eql( $kw28$QUOTED_ISA ) )
    {
      module = $kw75$DISJOINT_ARG_QUOTED_ISA;
    }
    else if( type.eql( $kw29$GENLS ) )
    {
      module = $kw76$DISJOINT_ARG_GENL;
    }
    if( NIL == wff_vars.wff_violation_data_terseP() )
    {
      data = at_routines.wff_violation_verbose_data();
    }
    return ConsesLow.listS( module, col1, col2, mt, ConsesLow.append( data, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 109496L)
  public static SubLObject var_types_neglits_subsume_poslitsP(final SubLObject var_types_pairs, SubLObject type, SubLObject mt)
  {
    if( type == UNPROVIDED )
    {
      type = $kw27$ISA;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject doneP = NIL;
    SubLObject not_subsumedP = NIL;
    SubLObject not_subsumed = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = var_types_pairs;
      SubLObject var_types = NIL;
      var_types = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        not_subsumed = disjoint_with.any_disjoint_collection_pair( var_types.rest(), mt );
        if( NIL != not_subsumed )
        {
          not_subsumedP = T;
          doneP = at_utilities.at_finishedP( T );
          final SubLObject pcase_var = type;
          if( pcase_var.eql( $kw27$ISA ) )
          {
            at_utilities.note_at_violation( ConsesLow.list( $kw36$DISJOINT_ARG_ISA, var_types.first(), not_subsumed, mt ) );
          }
          else if( pcase_var.eql( $kw28$QUOTED_ISA ) )
          {
            at_utilities.note_at_violation( ConsesLow.list( $kw75$DISJOINT_ARG_QUOTED_ISA, var_types.first(), not_subsumed, mt ) );
          }
          else if( pcase_var.eql( $kw29$GENLS ) )
          {
            at_utilities.note_at_violation( ConsesLow.list( $kw76$DISJOINT_ARG_GENL, var_types.first(), not_subsumed, mt ) );
          }
        }
        csome_list_var = csome_list_var.rest();
        var_types = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == not_subsumedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/at-var-types.lisp", position = 110159L)
  public static SubLObject modal_in_argP(final SubLObject relation, final SubLObject index, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( relation ) )
    {
      return makeBoolean( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const77$modalInArg, relation, ONE_INTEGER, UNPROVIDED ) && NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts(
          $const77$modalInArg, relation, index, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  public static SubLObject declare_at_var_types_file()
  {
    SubLFiles.declareFunction( me, "term_var_types_ok_intP", "TERM-VAR-TYPES-OK-INT?", 2, 0, false );
    SubLFiles.declareFunction( me, "formula_var_types_ok_intP", "FORMULA-VAR-TYPES-OK-INT?", 2, 0, false );
    SubLFiles.declareFunction( me, "inter_formula_var_types_okP", "INTER-FORMULA-VAR-TYPES-OK?", 2, 0, false );
    SubLFiles.declareFunction( me, "inter_formula_var_types_ok_intP", "INTER-FORMULA-VAR-TYPES-OK-INT?", 4, 0, false );
    SubLFiles.declareFunction( me, "independent_cnfs_variables_arg_constraints_okP", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false );
    SubLFiles.declareFunction( me, "independent_cnfs_variables_arg_constraints_okP_int", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "at_var_type_dnfs", "AT-VAR-TYPE-DNFS", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_at_var_type_dnfs_int_cached", "CLEAR-AT-VAR-TYPE-DNFS-INT-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_at_var_type_dnfs_int_cached", "REMOVE-AT-VAR-TYPE-DNFS-INT-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "at_var_type_dnfs_int_cached_internal", "AT-VAR-TYPE-DNFS-INT-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "at_var_type_dnfs_int_cached", "AT-VAR-TYPE-DNFS-INT-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "at_var_type_cnfs", "AT-VAR-TYPE-CNFS", 2, 0, false );
    SubLFiles.declareFunction( me, "at_var_type_cnfs_int", "AT-VAR-TYPE-CNFS-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "at_var_types_cnfs_clausify", "AT-VAR-TYPES-CNFS-CLAUSIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "at_var_types_cnfs_clausify_int_internal", "AT-VAR-TYPES-CNFS-CLAUSIFY-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "at_var_types_cnfs_clausify_int", "AT-VAR-TYPES-CNFS-CLAUSIFY-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "opaque_arg_wrt_pragmatic_requirementP", "OPAQUE-ARG-WRT-PRAGMATIC-REQUIREMENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "at_transform_true_sentence_negation_preds", "AT-TRANSFORM-TRUE-SENTENCE-NEGATION-PREDS", 2, 0, false );
    SubLFiles.declareFunction( me, "at_negatedP", "AT-NEGATED?", 1, 0, false );
    SubLFiles.declareFunction( me, "at_negate", "AT-NEGATE", 1, 0, false );
    SubLFiles.declareFunction( me, "at_var_type_repackage_cnfs", "AT-VAR-TYPE-REPACKAGE-CNFS", 1, 0, false );
    SubLFiles.declareFunction( me, "cnf_var_types_okP", "CNF-VAR-TYPES-OK?", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_cnf_var_types_okP", "INTER-CNF-VAR-TYPES-OK?", 2, 1, false );
    SubLFiles.declareFunction( me, "query_var_types_okP", "QUERY-VAR-TYPES-OK?", 2, 1, false );
    SubLFiles.declareFunction( me, "term_variables_arg_constraints", "TERM-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_variables_arg_constraints", "FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "at_el_expand_all", "AT-EL-EXPAND-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_constraint", "PARSE-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "formula_variables_arg_constraints_dict", "FORMULA-VARIABLES-ARG-CONSTRAINTS-DICT", 2, 2, false );
    SubLFiles.declareFunction( me, "inter_formula_variables_arg_constraints", "INTER-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "independent_formula_variables_arg_constraints", "INDEPENDENT-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "old_formula_variables_arg_constraints", "OLD-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "query_variables_arg_constraints", "QUERY-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_query_variables_arg_constraints", "INTER-QUERY-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "cnfs_variables_arg_constraints", "CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "independent_cnfs_variables_arg_constraints", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_cnfs_variables_arg_constraints", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_cnfs_variables_isa_constraints", "INTER-CNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_cnfs_variables_quoted_isa_constraints", "INTER-CNFS-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_cnfs_variables_genl_constraints", "INTER-CNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "hl_cnf_variables_arg_constraints", "HL-CNF-VARIABLES-ARG-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "cnf_variables_arg_constraints", "CNF-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_cnfs_variables_arg_constraints_okP", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_cnfs_variables_arg_constraints_okP_int", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "cnfs_variables_arg_constraints_okP", "CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false );
    SubLFiles.declareFunction( me, "cnf_variables_arg_constraints_okP", "CNF-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false );
    SubLFiles.declareFunction( me, "var_isa_constraints_wrt_cnfs", "VAR-ISA-CONSTRAINTS-WRT-CNFS", 3, 1, false );
    SubLFiles.declareFunction( me, "var_genl_constraints_wrt_cnfs", "VAR-GENL-CONSTRAINTS-WRT-CNFS", 3, 1, false );
    SubLFiles.declareFunction( me, "cnfs_variables_isa_constraints", "CNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "cnfs_variables_quoted_isa_constraints", "CNFS-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "cnfs_variables_genl_constraints", "CNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "cnfs_variable_isa_constraints", "CNFS-VARIABLE-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cnfs_variable_quoted_isa_constraints", "CNFS-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cnfs_variable_genl_constraints", "CNFS-VARIABLE-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variables_isa_constraints", "CNF-VARIABLES-ISA-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "cnf_variables_quoted_isa_constraints", "CNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "cnf_variables_genl_constraints", "CNF-VARIABLES-GENL-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "cnf_variable_isa_constraints", "CNF-VARIABLE-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_isa_constraints_int_internal", "CNF-VARIABLE-ISA-CONSTRAINTS-INT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_isa_constraints_int", "CNF-VARIABLE-ISA-CONSTRAINTS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_quoted_isa_constraints", "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_quoted_isa_constraints_int_internal", "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS-INT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_quoted_isa_constraints_int", "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_genl_constraints", "CNF-VARIABLE-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_genl_constraints_int_internal", "CNF-VARIABLE-GENL-CONSTRAINTS-INT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_genl_constraints_int", "CNF-VARIABLE-GENL-CONSTRAINTS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "cnfs_variable_inter_arg_isa_constraints", "CNFS-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "cnfs_variable_inter_arg_genl_constraints", "CNFS-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_inter_arg_isa_constraints", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_inter_arg_genl_constraints", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_inter_arg_isa_constraints_int", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_inter_arg_isa_constraints_int_2_internal", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT-2-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_inter_arg_isa_constraints_int_2", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT-2", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_inter_arg_genl_constraints_int", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_inter_arg_genl_constraints_int_2_internal", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT-2-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_variable_inter_arg_genl_constraints_int_2", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT-2", 3, 0, false );
    SubLFiles.declareFunction( me, "cnfs_var_constraint_implications_okP", "CNFS-VAR-CONSTRAINT-IMPLICATIONS-OK?", 3, 1, false );
    SubLFiles.declareFunction( me, "cnf_var_constraint_implications_okP", "CNF-VAR-CONSTRAINT-IMPLICATIONS-OK?", 3, 1, false );
    SubLFiles.declareFunction( me, "dnfs_variables_arg_constraints", "DNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "inter_dnfs_variables_arg_constraints", "INTER-DNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "dnf_variables_arg_constraints", "DNF-VARIABLES-ARG-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "dnfs_variables_arg_constraints_okP", "DNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false );
    SubLFiles.declareFunction( me, "dnfs_variables_isa_constraints", "DNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "dnfs_variables_genl_constraints", "DNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "contextualized_dnf_variables_isa_constraint_tuples", "CONTEXTUALIZED-DNF-VARIABLES-ISA-CONSTRAINT-TUPLES", 1, 1, false );
    SubLFiles.declareFunction( me, "var_isa_constraints_wrt_dnfs", "VAR-ISA-CONSTRAINTS-WRT-DNFS", 3, 1, false );
    SubLFiles.declareFunction( me, "var_genl_constraints_wrt_dnfs", "VAR-GENL-CONSTRAINTS-WRT-DNFS", 3, 1, false );
    SubLFiles.declareFunction( me, "dnfs_variable_isa_constraints", "DNFS-VARIABLE-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnfs_variable_quoted_isa_constraints", "DNFS-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnfs_variable_genl_constraints", "DNFS-VARIABLE-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnf_variables_isa_constraints", "DNF-VARIABLES-ISA-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "dnf_variables_quoted_isa_constraints", "DNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "dnf_variables_genl_constraints", "DNF-VARIABLES-GENL-CONSTRAINTS", 2, 1, false );
    SubLFiles.declareFunction( me, "dnf_variable_isa_constraints", "DNF-VARIABLE-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnf_variable_isa_constraints_int_internal", "DNF-VARIABLE-ISA-CONSTRAINTS-INT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "dnf_variable_isa_constraints_int", "DNF-VARIABLE-ISA-CONSTRAINTS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "contextualized_dnf_variable_isa_constraint_tuples", "CONTEXTUALIZED-DNF-VARIABLE-ISA-CONSTRAINT-TUPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "contextualized_isa_x_y_litP", "CONTEXTUALIZED-ISA-X-Y-LIT?", 1, 0, false );
    new $contextualized_isa_x_y_litP$UnaryFunction();
    SubLFiles.declareFunction( me, "dnf_variable_quoted_isa_constraints", "DNF-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnf_variable_genl_constraints", "DNF-VARIABLE-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnfs_variable_inter_arg_isa_constraints", "DNFS-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "dnfs_variable_inter_arg_genl_constraints", "DNFS-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "dnf_variable_inter_arg_isa_constraints", "DNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "dnf_variable_inter_arg_genl_constraints", "DNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "dnf_variable_inter_arg_isa_constraints_int", "DNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "dnf_variable_inter_arg_genl_constraints_int", "DNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_neg_lit_variable_isa_constraints", "CNF-NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_neg_lit_variable_quoted_isa_constraints", "CNF-NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_neg_lit_variable_genl_constraints", "CNF-NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_pos_lit_variable_isa_constraints", "CNF-POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_pos_lit_variable_quoted_isa_constraints", "CNF-POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "cnf_pos_lit_variable_genl_constraints", "CNF-POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnf_neg_lit_variable_isa_constraints", "DNF-NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnf_neg_lit_variable_quoted_isa_constraints", "DNF-NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnf_neg_lit_variable_genl_constraints", "DNF-NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnf_pos_lit_variable_isa_constraints", "DNF-POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnf_pos_lit_variable_quoted_isa_constraints", "DNF-POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "dnf_pos_lit_variable_genl_constraints", "DNF-POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "vt_unskolemize_term", "VT-UNSKOLEMIZE-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "neg_lit_variable_isa_constraints", "NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "neg_lit_variable_quoted_isa_constraints", "NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "neg_lit_variable_genl_constraints", "NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "pos_lit_variable_isa_constraints", "POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "pos_lit_variable_quoted_isa_constraints", "POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "pos_lit_variable_genl_constraints", "POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "neg_lit_variable_inter_arg_isa_constraints", "NEG-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "neg_lit_variable_inter_arg_genl_constraints", "NEG-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "pos_lit_variable_inter_arg_isa_constraints", "POS-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "at_inter_arg_checkable_objectP", "AT-INTER-ARG-CHECKABLE-OBJECT?", 1, 0, false );
    SubLFiles.declareFunction( me, "pos_lit_variable_inter_arg_genl_constraints", "POS-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "formula_variable_isa_constraints", "FORMULA-VARIABLE-ISA-CONSTRAINTS", 3, 1, false );
    SubLFiles.declareFunction( me, "formula_variable_quoted_isa_constraints", "FORMULA-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 1, false );
    SubLFiles.declareFunction( me, "formula_variable_genl_constraints", "FORMULA-VARIABLE-GENL-CONSTRAINTS", 3, 1, false );
    SubLFiles.declareFunction( me, "formula_variable_arg_constraints", "FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 1, false );
    SubLFiles.declareFunction( me, "cnf_formula_variable_arg_constraints", "CNF-FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "dnf_formula_variable_arg_constraints", "DNF-FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "formula_variable_inter_arg_isa_constraints", "FORMULA-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 1, false );
    SubLFiles.declareFunction( me, "formula_variable_inter_arg_genl_constraints", "FORMULA-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 1, false );
    SubLFiles.declareFunction( me, "formula_variable_inter_arg_constraints", "FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 1, false );
    SubLFiles.declareFunction( me, "cnf_formula_variable_inter_arg_constraints", "CNF-FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "dnf_formula_variable_inter_arg_constraints", "DNF-FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 0, false );
    SubLFiles.declareFunction( me, "relation_variable_isa_constraints", "RELATION-VARIABLE-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "relation_variable_quoted_isa_constraints", "RELATION-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "relation_variable_genl_constraints", "RELATION-VARIABLE-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "relation_variable_inter_arg_isa_constraints", "RELATION-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "relation_variable_inter_arg_genl_constraints", "RELATION-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "at_min_cols", "AT-MIN-COLS", 2, 0, false );
    SubLFiles.declareFunction( me, "at_min_cols_memoized_internal", "AT-MIN-COLS-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "at_min_cols_memoized", "AT-MIN-COLS-MEMOIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "query_argP", "QUERY-ARG?", 3, 0, false );
    SubLFiles.declareFunction( me, "query_denoting_collectionP", "QUERY-DENOTING-COLLECTION?", 2, 0, false );
    SubLFiles.declareFunction( me, "at_arg_formula_type", "AT-ARG-FORMULA-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "at_argn_isa", "AT-ARGN-ISA", 2, 0, false );
    SubLFiles.declareFunction( me, "at_argn_quoted_isa", "AT-ARGN-QUOTED-ISA", 2, 0, false );
    SubLFiles.declareFunction( me, "at_argn_genl", "AT-ARGN-GENL", 2, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_isa", "INTER-ARG-ISA", 4, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_genl", "INTER-ARG-GENL", 4, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_isa_from_type", "INTER-ARG-ISA-FROM-TYPE", 4, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_genl_from_type", "INTER-ARG-GENL-FROM-TYPE", 4, 0, false );
    SubLFiles.declareFunction( me, "at_argn_int", "AT-ARGN-INT", 6, 0, false );
    SubLFiles.declareFunction( me, "clear_at_argn_int_cached", "CLEAR-AT-ARGN-INT-CACHED", 0, 0, false );
    new $clear_at_argn_int_cached$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_at_argn_int_cached", "REMOVE-AT-ARGN-INT-CACHED", 7, 0, false );
    SubLFiles.declareFunction( me, "at_argn_int_cached_internal", "AT-ARGN-INT-CACHED-INTERNAL", 7, 0, false );
    SubLFiles.declareFunction( me, "at_argn_int_cached", "AT-ARGN-INT-CACHED", 7, 0, false );
    SubLFiles.declareFunction( me, "at_argn_int_funcall", "AT-ARGN-INT-FUNCALL", 6, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_isa_int", "INTER-ARG-ISA-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_genl_int", "INTER-ARG-GENL-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_type_int", "INTER-ARG-TYPE-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_type_verify_candidates", "INTER-ARG-TYPE-VERIFY-CANDIDATES", 4, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_isa_from_type_int", "INTER-ARG-ISA-FROM-TYPE-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_genl_from_type_int", "INTER-ARG-GENL-FROM-TYPE-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "constraint_var_types_okP", "CONSTRAINT-VAR-TYPES-OK?", 1, 2, false );
    SubLFiles.declareFunction( me, "var_types_okP", "VAR-TYPES-OK?", 1, 2, false );
    SubLFiles.declareFunction( me, "var_types_not_disjointP", "VAR-TYPES-NOT-DISJOINT?", 1, 2, false );
    SubLFiles.declareFunction( me, "var_type_disjoint_violation", "VAR-TYPE-DISJOINT-VIOLATION", 4, 0, false );
    SubLFiles.declareFunction( me, "var_types_neglits_subsume_poslitsP", "VAR-TYPES-NEGLITS-SUBSUME-POSLITS?", 1, 2, false );
    SubLFiles.declareFunction( me, "modal_in_argP", "MODAL-IN-ARG?", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_at_var_types_file()
  {
    $at_var_type_dnfs_int_cached_caching_state$ = SubLFiles.deflexical( "*AT-VAR-TYPE-DNFS-INT-CACHED-CACHING-STATE*", NIL );
    $at_true_sentence_negation_preds$ = SubLFiles.defparameter( "*AT-TRUE-SENTENCE-NEGATION-PREDS*", $kw12$UNINITIALIZED );
    $at_argn_int_cached_caching_state$ = SubLFiles.deflexical( "*AT-ARGN-INT-CACHED-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_at_var_types_file()
  {
    memoization_state.note_globally_cached_function( $sym5$AT_VAR_TYPE_DNFS_INT_CACHED );
    memoization_state.note_memoized_function( $sym10$AT_VAR_TYPES_CNFS_CLAUSIFY_INT );
    memoization_state.note_memoized_function( $sym30$CNF_VARIABLE_ISA_CONSTRAINTS_INT );
    memoization_state.note_memoized_function( $sym31$CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT );
    memoization_state.note_memoized_function( $sym32$CNF_VARIABLE_GENL_CONSTRAINTS_INT );
    memoization_state.note_memoized_function( $sym33$CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2 );
    memoization_state.note_memoized_function( $sym34$CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2 );
    memoization_state.note_memoized_function( $sym37$DNF_VARIABLE_ISA_CONSTRAINTS_INT );
    memoization_state.note_memoized_function( $sym54$AT_MIN_COLS_MEMOIZED );
    memoization_state.note_globally_cached_function( $sym64$AT_ARGN_INT_CACHED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_at_var_types_file();
  }

  @Override
  public void initializeVariables()
  {
    init_at_var_types_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_at_var_types_file();
  }
  static
  {
    me = new at_var_types();
    $at_var_type_dnfs_int_cached_caching_state$ = null;
    $at_true_sentence_negation_preds$ = null;
    $at_argn_int_cached_caching_state$ = null;
    $sym0$__PRED_MUFFET_212 = makeSymbol( "??PRED-MUFFET-212" );
    $sym1$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym2$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $sym3$UNREIFIED_SKOLEM_TERM_ = makeSymbol( "UNREIFIED-SKOLEM-TERM?" );
    $kw4$BAD_EXPONENTIAL_CONJUNCTION = makeKeyword( "BAD-EXPONENTIAL-CONJUNCTION" );
    $sym5$AT_VAR_TYPE_DNFS_INT_CACHED = makeSymbol( "AT-VAR-TYPE-DNFS-INT-CACHED" );
    $sym6$SKOLEM_FUNCTION_VAR = makeSymbol( "SKOLEM-FUNCTION-VAR" );
    $sym7$_AT_VAR_TYPE_DNFS_INT_CACHED_CACHING_STATE_ = makeSymbol( "*AT-VAR-TYPE-DNFS-INT-CACHED-CACHING-STATE*" );
    $int8$1024 = makeInteger( 1024 );
    $kw9$BAD_EXPONENTIAL_DISJUNCTION = makeKeyword( "BAD-EXPONENTIAL-DISJUNCTION" );
    $sym10$AT_VAR_TYPES_CNFS_CLAUSIFY_INT = makeSymbol( "AT-VAR-TYPES-CNFS-CLAUSIFY-INT" );
    $int11$100 = makeInteger( 100 );
    $kw12$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $const13$pragmaticRequirement = constant_handles.reader_make_constant_shell( makeString( "pragmaticRequirement" ) );
    $const14$trueSentence = constant_handles.reader_make_constant_shell( makeString( "trueSentence" ) );
    $sym15$OPAQUE_ARG_WRT_PRAGMATIC_REQUIREMENT_ = makeSymbol( "OPAQUE-ARG-WRT-PRAGMATIC-REQUIREMENT?" );
    $sym16$AT_NEGATED_ = makeSymbol( "AT-NEGATED?" );
    $sym17$AT_NEGATE = makeSymbol( "AT-NEGATE" );
    $const18$termChosen = constant_handles.reader_make_constant_shell( makeString( "termChosen" ) );
    $const19$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $kw20$RECURSION_LIMIT_EXCEEDED = makeKeyword( "RECURSION-LIMIT-EXCEEDED" );
    $kw21$INVALID_EXPANSION = makeKeyword( "INVALID-EXPANSION" );
    $const22$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const23$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const24$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $sym25$_EXIT = makeSymbol( "%EXIT" );
    $sym26$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $kw27$ISA = makeKeyword( "ISA" );
    $kw28$QUOTED_ISA = makeKeyword( "QUOTED-ISA" );
    $kw29$GENLS = makeKeyword( "GENLS" );
    $sym30$CNF_VARIABLE_ISA_CONSTRAINTS_INT = makeSymbol( "CNF-VARIABLE-ISA-CONSTRAINTS-INT" );
    $sym31$CNF_VARIABLE_QUOTED_ISA_CONSTRAINTS_INT = makeSymbol( "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS-INT" );
    $sym32$CNF_VARIABLE_GENL_CONSTRAINTS_INT = makeSymbol( "CNF-VARIABLE-GENL-CONSTRAINTS-INT" );
    $sym33$CNF_VARIABLE_INTER_ARG_ISA_CONSTRAINTS_INT_2 = makeSymbol( "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT-2" );
    $sym34$CNF_VARIABLE_INTER_ARG_GENL_CONSTRAINTS_INT_2 = makeSymbol( "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT-2" );
    $kw35$IGNORE = makeKeyword( "IGNORE" );
    $kw36$DISJOINT_ARG_ISA = makeKeyword( "DISJOINT-ARG-ISA" );
    $sym37$DNF_VARIABLE_ISA_CONSTRAINTS_INT = makeSymbol( "DNF-VARIABLE-ISA-CONSTRAINTS-INT" );
    $sym38$ISA_VAR_VAR_LIT_ = makeSymbol( "ISA-VAR-VAR-LIT?" );
    $list39 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $sym40$CONTEXTUALIZED_ISA_X_Y_LIT_ = makeSymbol( "CONTEXTUALIZED-ISA-X-Y-LIT?" );
    $list41 = ConsesLow.list( makeSymbol( "ISA-MT" ), makeSymbol( "ISA-X-Y-ASENT" ) );
    $list42 = ConsesLow.list( makeSymbol( "GENLS-MT" ), makeSymbol( "GENLS-ASENT" ) );
    $const43$TruthFunction = constant_handles.reader_make_constant_shell( makeString( "TruthFunction" ) );
    $const44$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $sym45$_DUMMY = makeSymbol( "?DUMMY" );
    $const46$ListOfTypeFn = constant_handles.reader_make_constant_shell( makeString( "ListOfTypeFn" ) );
    $const47$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $kw48$REGULARIZE = makeKeyword( "REGULARIZE" );
    $const49$ListOfSpecsFn = constant_handles.reader_make_constant_shell( makeString( "ListOfSpecsFn" ) );
    $const50$SpecsFn = constant_handles.reader_make_constant_shell( makeString( "SpecsFn" ) );
    $kw51$DNF = makeKeyword( "DNF" );
    $kw52$CNF = makeKeyword( "CNF" );
    $const53$Relation = constant_handles.reader_make_constant_shell( makeString( "Relation" ) );
    $sym54$AT_MIN_COLS_MEMOIZED = makeSymbol( "AT-MIN-COLS-MEMOIZED" );
    $sym55$CYC_QUERY_ = makeSymbol( "CYC-QUERY?" );
    $sym56$GATHER_AT_DATA_ASSERTION = makeSymbol( "GATHER-AT-DATA-ASSERTION" );
    $sym57$ARGN_ISA = makeSymbol( "ARGN-ISA" );
    $sym58$ARGN_QUOTED_ISA = makeSymbol( "ARGN-QUOTED-ISA" );
    $sym59$ARGN_GENL = makeSymbol( "ARGN-GENL" );
    $sym60$INTER_ARG_ISA_INT = makeSymbol( "INTER-ARG-ISA-INT" );
    $sym61$INTER_ARG_GENL_INT = makeSymbol( "INTER-ARG-GENL-INT" );
    $sym62$INTER_ARG_ISA_FROM_TYPE_INT = makeSymbol( "INTER-ARG-ISA-FROM-TYPE-INT" );
    $sym63$INTER_ARG_GENL_FROM_TYPE_INT = makeSymbol( "INTER-ARG-GENL-FROM-TYPE-INT" );
    $sym64$AT_ARGN_INT_CACHED = makeSymbol( "AT-ARGN-INT-CACHED" );
    $sym65$_AT_ARGN_INT_CACHED_CACHING_STATE_ = makeSymbol( "*AT-ARGN-INT-CACHED-CACHING-STATE*" );
    $sym66$CLEAR_AT_ARGN_INT_CACHED = makeSymbol( "CLEAR-AT-ARGN-INT-CACHED" );
    $str67$got_an_unexpected_function__s_wit = makeString( "got an unexpected function ~s with arity ~s~%" );
    $kw68$GAF = makeKeyword( "GAF" );
    $kw69$TRUE = makeKeyword( "TRUE" );
    $sym70$FIRST = makeSymbol( "FIRST" );
    $list71 = ConsesLow.list( makeSymbol( "IND-COL" ), makeSymbol( "DEP-COL" ), makeSymbol( "ASSERTION" ) );
    $str72$__at_var__a_test__arg__s__s__cons = makeString( "~%at var ~a test: arg ~s ~s; constraint ~s" );
    $kw73$NOT_DISJOINT = makeKeyword( "NOT-DISJOINT" );
    $kw74$NEGLITS_SUBSUME_POSLITS = makeKeyword( "NEGLITS-SUBSUME-POSLITS" );
    $kw75$DISJOINT_ARG_QUOTED_ISA = makeKeyword( "DISJOINT-ARG-QUOTED-ISA" );
    $kw76$DISJOINT_ARG_GENL = makeKeyword( "DISJOINT-ARG-GENL" );
    $const77$modalInArg = constant_handles.reader_make_constant_shell( makeString( "modalInArg" ) );
  }

  public static final class $contextualized_isa_x_y_litP$UnaryFunction
      extends
        UnaryFunction
  {
    public $contextualized_isa_x_y_litP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CONTEXTUALIZED-ISA-X-Y-LIT?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return contextualized_isa_x_y_litP( arg1 );
    }
  }

  public static final class $clear_at_argn_int_cached$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_at_argn_int_cached$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-AT-ARGN-INT-CACHED" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_at_argn_int_cached();
    }
  }
}
/*
 * 
 * Total time: 1940 ms
 * 
 */