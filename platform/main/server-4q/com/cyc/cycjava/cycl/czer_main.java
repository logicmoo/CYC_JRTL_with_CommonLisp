package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.inference.pragma_induction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class czer_main
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.czer_main";
  public static final String myFingerPrint = "f52eac3476d880a9951ae714906645a39c499adf83b8ea7c9dc5ad112b7cefdf";
  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 28699L)
  private static SubLSymbol $canonicalize_clause_sentence_terms_sense_lambda$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 34908L)
  private static SubLSymbol $never_commutative_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 53555L)
  public static SubLSymbol $tou_skolem_blist$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 68635L)
  private static SubLSymbol $nart_defining_rules_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 69849L)
  public static SubLSymbol $czer_create_nart_uses_nart_defining_rules_methodP$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 86566L)
  private static SubLSymbol $var_is_scoped_in_formula_var$;
  private static final SubLSymbol $sym0$EL_FORMULA_P;
  private static final SubLSymbol $sym1$EL_TO_HL;
  private static final SubLList $list2;
  private static final SubLString $str3$Translate_el_expression_FORMULA_i;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$EL_TO_HL_QUERY;
  private static final SubLString $str6$Translate_el_query_FORMULA_into_i;
  private static final SubLSymbol $sym7$CANONICALIZE_TERM;
  private static final SubLList $list8;
  private static final SubLString $str9$Converts_the_EL_term_TERM_to_its_;
  private static final SubLSymbol $sym10$CANONICALIZE_TERM_MEMOIZED_INT;
  private static final SubLSymbol $sym11$FORT_P;
  private static final SubLString $str12$czer_memoization_state;
  private static final SubLSymbol $sym13$CANON_WFF_;
  private static final SubLSymbol $kw14$CNF;
  private static final SubLSymbol $sym15$FAST_REIFIED_SKOLEM_;
  private static final SubLObject $const16$skolem;
  private static final SubLObject $const17$termDependsOn;
  private static final SubLObject $const18$UniversalVocabularyMt;
  private static final SubLSymbol $sym19$SKOLEM_FUNCTION_P;
  private static final SubLSymbol $sym20$CYCL_GENERALIZED_TENSED_LITERAL_P;
  private static final SubLSymbol $sym21$CANONICALIZE_WF_CYCL_INT_MEMOIZED;
  private static final SubLSymbol $sym22$CANONICALIZE_ASK_INT_MEMOIZED;
  private static final SubLSymbol $sym23$EL_WFF_SYNTAX_;
  private static final SubLSymbol $kw24$DNF;
  private static final SubLString $str25$Unknown_clausal_form__s;
  private static final SubLSymbol $sym26$CANONICALIZE_CLAUSE_QUOTED_TERMS;
  private static final SubLSymbol $sym27$ESCAPE_QUOTE_SYNTAX_P;
  private static final SubLSymbol $sym28$CYC_VAR_;
  private static final SubLSymbol $sym29$QUASI_QUOTE_SYNTAX_P;
  private static final SubLObject $const30$Quote;
  private static final SubLObject $const31$EscapeQuote;
  private static final SubLSymbol $sym32$FAST_ESCAPE_QUOTE_TERM_P;
  private static final SubLSymbol $sym33$FORMULA_ARG1;
  private static final SubLSymbol $sym34$CANONICALIZE_CLAUSE_SENTENCE_TERMS;
  private static final SubLSymbol $kw35$NEG;
  private static final SubLSymbol $sym36$CANONICALIZE_LITERAL_SENTENCE_TERMS;
  private static final SubLSymbol $kw37$POS;
  private static final SubLSymbol $sym38$EL_NEGATION_P;
  private static final SubLString $str39$Tried_to_canonicalize_the_formula;
  private static final SubLSymbol $sym40$CANONICALIZE_CLAUSE_COMMUTATIVE_TERMS_DESTRUCTIVE;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$CANONICALIZE_LITERAL_COMMUTATIVE_TERMS_DESTRUCTIVE;
  private static final SubLSymbol $sym43$COMMUTATIVE_TERMS_IN_ORDER_;
  private static final SubLSymbol $kw44$HELLO_YOU_SILLY_COMPILER;
  private static final SubLSymbol $kw45$IGNORE;
  private static final SubLSymbol $kw46$DUMMY;
  private static final SubLObject $const47$commutativeInArgsAndRest;
  private static final SubLSymbol $kw48$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST;
  private static final SubLSymbol $kw49$CYCLIC_COMMUTATIVE_IN_ARGS;
  private static final SubLSymbol $sym50$_;
  private static final SubLObject $const51$commutativeInArgs;
  private static final SubLSymbol $sym52$GAF_FORMULA;
  private static final SubLSymbol $sym53$EL_VAR_;
  private static final SubLSymbol $sym54$ATOM;
  private static final SubLString $str55$warning__trying_to_sort_the_varia;
  private static final SubLString $str56$warning__trying_to_string_sort_th;
  private static final SubLSymbol $kw57$UNINITIALIZED;
  private static final SubLSymbol $sym58$ADD_TERM_OF_UNIT_LITS_1;
  private static final SubLSymbol $sym59$STR;
  private static final SubLSymbol $sym60$EQUAL_WRT_SVM;
  private static final SubLObject $const61$ReifiableFunction;
  private static final SubLObject $const62$CycLReifiableDenotationalTerm;
  private static final SubLObject $const63$EvaluatableFunction;
  private static final SubLSymbol $sym64$_EXIT;
  private static final SubLSymbol $sym65$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
  private static final SubLString $str66$Tried_to_reify_functions_within__;
  private static final SubLSymbol $sym67$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym68$CLAUSE_TERMS_TO_REIFY;
  private static final SubLSymbol $sym69$TERM_RELATIONAL_COMPLEXITY;
  private static final SubLSymbol $kw70$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE;
  private static final SubLSymbol $kw71$TOO_MANY_SEQUENCE_VARS_IN_SCOPE_OF_SKOLEM;
  private static final SubLSymbol $sym72$_;
  private static final SubLSymbol $sym73$TERM_FUNCTIONAL_COMPLEXITY;
  private static final SubLSymbol $sym74$NART_DEFINING_RULES_CACHED;
  private static final SubLObject $const75$BaseKB;
  private static final SubLSymbol $kw76$FORWARD;
  private static final SubLSymbol $kw77$RULE;
  private static final SubLObject $const78$WFFConstraintPredicate;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$_NART_DEFINING_RULES_CACHED_CACHING_STATE_;
  private static final SubLSymbol $sym81$TL_FIND_OR_CREATE_NART;
  private static final SubLObject $const82$termOfUnit;
  private static final SubLList $list83;
  private static final SubLSymbol $kw84$TRUE;
  private static final SubLSymbol $kw85$MONOTONIC;
  private static final SubLString $str86$SORT_BY_ID_called_on_list_contain;
  private static final SubLSymbol $sym87$FORT_TYPE_AND_ID__;
  private static final SubLSymbol $sym88$LITERAL_QUANTIFIED_FN_TERMS;
  private static final SubLSymbol $sym89$NO_FREE_VARIABLES_;
  private static final SubLSymbol $sym90$LITERAL_TERMS_TO_REIFY;
  private static final SubLObject $const91$evaluate;
  private static final SubLObject $const92$ExpandSubLFn;
  private static final SubLObject $const93$SubLQuoteFn;
  private static final SubLSymbol $sym94$CANONICALIZE_CLAUSE_TRANSFORMABLE_NATS;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$CAR;
  private static final SubLList $list97;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$VAR_IS_SCOPED_IN_FORMULA_;
  private static final SubLSymbol $sym100$CLAUSES_IN_ORDER_;
  private static final SubLSymbol $sym101$SORT_CLAUSE_LITERALS;
  private static final SubLSymbol $sym102$NEGATE_ATOMIC;
  private static final SubLString $str103$most_constrained_literals_succeed;
  private static final SubLString $str104$fewest_arg_literals_succeeded_;
  private static final SubLString $str105$left_weighted_literals_succeeded_;
  private static final SubLString $str106$left_connected_literals_succeeded;
  private static final SubLString $str107$left_rooted_literals_succeeded_;
  private static final SubLString $str108$least_complex_literals_succeeded_;
  private static final SubLString $str109$penultimate_resort_literals_1_suc;
  private static final SubLString $str110$penultimate_resort_literals_2_suc;
  private static final SubLFloat $float111$0_1;
  private static final SubLSymbol $sym112$LIT__;
  private static final SubLString $str113$Got_a_fort_that_was_neither_a_nar;
  private static final SubLString $str114$_s_is_not_an_element_of__s;
  private static final SubLSymbol $sym115$CDR;
  private static final SubLInteger $int116$1000;
  private static final SubLInteger $int117$100;
  private static final SubLFloat $float118$0_9;
  private static final SubLInteger $int119$10000;
  private static final SubLSymbol $sym120$CANON_VAR_;
  private static final SubLSymbol $sym121$ASSERTION_P;
  private static final SubLString $str122$_s_treated_as_variable_in_rename_;
  private static final SubLSymbol $sym123$NOT_DIGIT_CHAR_P;
  private static final SubLSymbol $sym124$VARIABLE_P;
  private static final SubLSymbol $sym125$MIN;
  private static final SubLSymbol $sym126$LIST_STRUCTURE;
  private static final SubLSymbol $sym127$FALSE;
  private static final SubLSymbol $sym128$CONSTANT_EXTERNAL_ID__;
  private static final SubLSymbol $sym129$CONSTANT_P;

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 2135L)
  public static SubLObject el_to_hl(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( formula, $sym0$EL_FORMULA_P );
    return canonicalize_cycl( formula, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 2431L)
  public static SubLObject el_to_hl_query(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    enforceType( formula, $sym0$EL_FORMULA_P );
    return canonicalize_query( formula, mt, NIL, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 2645L)
  public static SubLObject el_to_hl_fast(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject result = NIL;
    result = canonicalize_cycl_int( formula, mt, NIL, NIL, T, NIL );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 2960L)
  public static SubLObject el_to_hl_really_fast(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return canonicalize_wf_cycl( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 3248L)
  public static SubLObject canonicalize_term(SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt, thread );
      if( NIL != precanonicalizer.precanonicalizationsP( v_term, mt, UNPROVIDED ) )
      {
        v_term = precanonicalizer.safe_precanonicalizations( v_term, mt );
      }
      if( NIL != el_utilities.el_formula_p( v_term ) )
      {
        v_term = el_utilities.copy_formula( v_term );
      }
      final SubLObject _prev_bind_0_$1 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
      final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
      try
      {
        czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
        czer_vars.$standardize_variables_memory$.bind( NIL, thread );
        v_term = simplifier.simplify_sequence_variables_1( v_term );
        if( NIL != czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue( thread ) )
        {
          v_term = canonicalize_relation_sentence_terms( v_term, mt );
        }
        v_term = canonicalize_term_commutative_terms( v_term );
        v_term = reify_relation_functions( v_term, makeBoolean( NIL == czer_vars.$recanonicalizing_candidate_natP$.getDynamicValue( thread ) ) );
      }
      finally
      {
        czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
        czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 4104L)
  public static SubLObject canonicalize_term_memoized(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return canonicalize_term_memoized_int( v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 4224L)
  public static SubLObject canonicalize_term_memoized_int_internal(final SubLObject v_term, final SubLObject mt)
  {
    return conses_high.copy_tree( canonicalize_term( v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 4224L)
  public static SubLObject canonicalize_term_memoized_int(final SubLObject v_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return canonicalize_term_memoized_int_internal( v_term, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym10$CANONICALIZE_TERM_MEMOIZED_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym10$CANONICALIZE_TERM_MEMOIZED_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym10$CANONICALIZE_TERM_MEMOIZED_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, mt );
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
        if( v_term.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( canonicalize_term_memoized_int_internal( v_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 4350L)
  public static SubLObject canonicalize_term_assert(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( T, thread );
      result = canonicalize_term( v_term, mt );
    }
    finally
    {
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 4745L)
  public static SubLObject coerce_to_fort(final SubLObject v_term)
  {
    final SubLObject fort = canonicalize_term( v_term, UNPROVIDED );
    assert NIL != forts.fort_p( fort ) : fort;
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 4951L)
  public static SubLObject canonicalize_gaf(final SubLObject gaf_asent, final SubLObject mt)
  {
    return canonicalize_assert_sentence( gaf_asent, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 5414L)
  public static SubLObject canonicalize_wf_gaf(final SubLObject gaf_asent, final SubLObject mt)
  {
    return canonicalize_wf_assert_sentence( gaf_asent, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 5907L)
  public static SubLObject ncanonicalize_cycl(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return canonicalize_cycl_int( formula, mt, NIL, T, T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 6078L)
  public static SubLObject canonicalize_cycl(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return canonicalize_cycl_int( sentence, mt, NIL, NIL, T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 6887L)
  public static SubLObject canonicalize_cycl_int(final SubLObject sentence, SubLObject mt, SubLObject testingP, SubLObject destructiveP, SubLObject unwrap_istP, SubLObject check_wffP)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( testingP == UNPROVIDED )
    {
      testingP = NIL;
    }
    if( destructiveP == UNPROVIDED )
    {
      destructiveP = NIL;
    }
    if( unwrap_istP == UNPROVIDED )
    {
      unwrap_istP = NIL;
    }
    if( check_wffP == UNPROVIDED )
    {
      check_wffP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == wff_vars.$within_wffP$.getDynamicValue( thread ) && NIL == czer_vars.$within_canonicalizerP$.getDynamicValue( thread ) )
    {
      clear_canon_caches();
    }
    SubLObject result = NIL;
    SubLObject subordinate_fi_opsP = NIL;
    SubLObject variables_memory = NIL;
    SubLObject wffP = makeBoolean( NIL == check_wffP );
    SubLObject copied_formula = NIL;
    mt = hlmt_czer.canonicalize_hlmt( mt );
    if( NIL != check_wffP && NIL == mt )
    {
      wffP = NIL;
    }
    final SubLObject _prev_bind_0 = czer_vars.$within_canonicalizerP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$czer_memoization_state$.currentBinding( thread );
    try
    {
      czer_vars.$within_canonicalizerP$.bind( T, thread );
      czer_vars.$czer_memoization_state$.bind( memoization_state.new_memoization_state( $str12$czer_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      final SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$2 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject mt_var = mt;
          final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          final SubLObject _prev_bind_4 = czer_vars.$subordinate_fi_opsP$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            czer_vars.$subordinate_fi_opsP$.bind( NIL, thread );
            copied_formula = ( ( NIL != destructiveP ) ? sentence : el_utilities.copy_formula( sentence ) );
            thread.resetMultipleValues();
            final SubLObject copied_formula_$5 = precanonicalizer.early_precanonicalizations( copied_formula, mt );
            final SubLObject mt_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            copied_formula = copied_formula_$5;
            mt = mt_$6;
            final SubLObject _prev_bind_0_$4 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
            final SubLObject _prev_bind_1_$5 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
            try
            {
              czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
              czer_vars.$standardize_variables_memory$.bind( NIL, thread );
              if( NIL != check_wffP )
              {
                final SubLObject _prev_bind_0_$5 = wff_utilities.$check_arityP$.currentBinding( thread );
                final SubLObject _prev_bind_1_$6 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
                try
                {
                  wff_utilities.$check_arityP$.bind( check_wff_arityP(), thread );
                  wff_utilities.$check_wff_semanticsP$.bind( check_wff_semanticsP( UNPROVIDED ), thread );
                  wffP = canon_wffP( copied_formula, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
                  if( NIL == wffP )
                  {
                    thread.resetMultipleValues();
                    final SubLObject simpler_formula = simplifier.try_to_simplify_non_wff_into_wff( copied_formula, Symbols.symbol_function( $sym13$CANON_WFF_ ), mt_relevance_macros.$mt$.getDynamicValue( thread ) );
                    final SubLObject is_it_wff_nowP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != is_it_wff_nowP )
                    {
                      wffP = T;
                      copied_formula = simpler_formula;
                    }
                  }
                }
                finally
                {
                  wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_1_$6, thread );
                  wff_utilities.$check_arityP$.rebind( _prev_bind_0_$5, thread );
                }
              }
              if( NIL != wffP )
              {
                result = copied_formula;
                SubLObject quiescedP = NIL;
                SubLObject count = ZERO_INTEGER;
                while ( NIL == quiescedP)
                {
                  thread.resetMultipleValues();
                  final SubLObject result_$11 = clausify_eliminating_ists( result, mt, $kw14$CNF, unwrap_istP );
                  final SubLObject mt_$7 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  result = result_$11;
                  mt = mt_$7;
                  result = clausifier.cnf_operators_out( result );
                  thread.resetMultipleValues();
                  final SubLObject result_$12 = canonicalize_clauses( result, mt );
                  final SubLObject mt_$8 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  result = result_$12;
                  mt = mt_$8;
                  if( count.numGE( czer_vars.$czer_quiescence_iteration_limit$.getDynamicValue( thread ) ) )
                  {
                    quiescedP = T;
                  }
                  else
                  {
                    quiescedP = czer_result_quiescedP( result, unwrap_istP );
                  }
                  if( NIL == quiescedP )
                  {
                    result = uncanonicalizer.cnf_intermediate_el_formula( czer_utilities.extract_el_clauses( result ) );
                  }
                  count = Numbers.add( count, ONE_INTEGER );
                }
                subordinate_fi_opsP = czer_vars.$subordinate_fi_opsP$.getDynamicValue( thread );
                if( NIL != testingP )
                {
                  variables_memory = czer_vars.$standardize_variables_memory$.getDynamicValue( thread );
                }
              }
            }
            finally
            {
              czer_vars.$standardize_variables_memory$.rebind( _prev_bind_1_$5, thread );
              czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0_$4, thread );
            }
          }
          finally
          {
            czer_vars.$subordinate_fi_opsP$.rebind( _prev_bind_4, thread );
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$4, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$3, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$2, thread );
      }
    }
    finally
    {
      czer_vars.$czer_memoization_state$.rebind( _prev_bind_2, thread );
      czer_vars.$within_canonicalizerP$.rebind( _prev_bind_0, thread );
    }
    if( NIL == unwrap_istP )
    {
      mt = NIL;
    }
    if( NIL != czer_vars.$clothe_naked_skolemsP$.getDynamicValue( thread ) )
    {
      clothe_naked_skolems( result );
    }
    return Values.values( result, subordinate_fi_opsP, variables_memory, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 9738L)
  public static SubLObject clothe_naked_skolems(final SubLObject czer_result)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cycl_utilities.expression_find_if( $sym15$FAST_REIFIED_SKOLEM_, czer_result, T, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = czer_vars.$clothe_naked_skolemsP$.currentBinding( thread );
      try
      {
        czer_vars.$clothe_naked_skolemsP$.bind( NIL, thread );
        final SubLObject v_forts = cycl_utilities.expression_forts( czer_result, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject cdolist_list_var = cycl_utilities.expression_gather( czer_result, $sym19$SKOLEM_FUNCTION_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject skf = NIL;
        skf = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == czer_meta.find_assertion_cycl( ConsesLow.list( $const16$skolem, skf ), UNPROVIDED ) )
          {
            SubLObject fake_defining_assertions = NIL;
            SubLObject cdolist_list_var_$16 = v_forts;
            SubLObject fort = NIL;
            fort = cdolist_list_var_$16.first();
            while ( NIL != cdolist_list_var_$16)
            {
              if( !fort.eql( skf ) )
              {
                fake_defining_assertions = ConsesLow.cons( ConsesLow.list( $const17$termDependsOn, skf, fort ), fake_defining_assertions );
              }
              cdolist_list_var_$16 = cdolist_list_var_$16.rest();
              fort = cdolist_list_var_$16.first();
            }
            fake_defining_assertions = simplifier.conjoin( fake_defining_assertions, UNPROVIDED );
            cyc_kernel.cyc_assert_wff( fake_defining_assertions, $const18$UniversalVocabularyMt, UNPROVIDED );
          }
          cdolist_list_var = cdolist_list_var.rest();
          skf = cdolist_list_var.first();
        }
      }
      finally
      {
        czer_vars.$clothe_naked_skolemsP$.rebind( _prev_bind_0, thread );
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 10705L)
  public static SubLObject czer_result_quiescedP(final SubLObject czer_result, final SubLObject caller_was_supposed_to_unwrap_istP)
  {
    if( NIL == caller_was_supposed_to_unwrap_istP )
    {
      return T;
    }
    if( NIL != cycl_grammar.cycl_truth_value_p( czer_result ) )
    {
      return T;
    }
    if( NIL != cycl_utilities.expression_find_if( $sym20$CYCL_GENERALIZED_TENSED_LITERAL_P, czer_result, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject ist_count = ZERO_INTEGER;
    SubLObject non_ist_count = ZERO_INTEGER;
    SubLObject cdolist_list_var = czer_utilities.extract_hl_clauses( czer_result );
    SubLObject clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$17 = clauses.neg_lits( clause );
      SubLObject asent = NIL;
      asent = cdolist_list_var_$17.first();
      while ( NIL != cdolist_list_var_$17)
      {
        final SubLObject unwrapped_asent = czer_utilities.unwrap_if_ist_permissive( asent, UNPROVIDED );
        if( NIL != el_utilities.el_conjunction_p( unwrapped_asent ) || NIL != el_utilities.el_existential_p( unwrapped_asent ) )
        {
          return NIL;
        }
        if( NIL != el_utilities.ist_sentence_p( asent, UNPROVIDED ) && NIL != hlmt.chlmt_p( el_utilities.designated_mt( asent ) ) )
        {
          ist_count = Numbers.add( ist_count, ONE_INTEGER );
        }
        else
        {
          non_ist_count = Numbers.add( non_ist_count, ONE_INTEGER );
        }
        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
        asent = cdolist_list_var_$17.first();
      }
      SubLObject cdolist_list_var_$18 = clauses.pos_lits( clause );
      asent = NIL;
      asent = cdolist_list_var_$18.first();
      while ( NIL != cdolist_list_var_$18)
      {
        final SubLObject unwrapped_asent = czer_utilities.unwrap_if_ist_permissive( asent, UNPROVIDED );
        if( NIL != el_utilities.el_conjunction_p( unwrapped_asent ) || NIL != el_utilities.el_existential_p( unwrapped_asent ) )
        {
          return NIL;
        }
        if( NIL != el_utilities.ist_sentence_p( asent, UNPROVIDED ) && NIL != hlmt.chlmt_p( el_utilities.designated_mt( asent ) ) )
        {
          ist_count = Numbers.add( ist_count, ONE_INTEGER );
        }
        else
        {
          non_ist_count = Numbers.add( non_ist_count, ONE_INTEGER );
        }
        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
        asent = cdolist_list_var_$18.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    if( ist_count.numGE( ONE_INTEGER ) && non_ist_count.numE( ZERO_INTEGER ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 11705L)
  public static SubLObject canonicalize_cycl_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result = canonicalize_cycl_int( sentence, mt, NIL, NIL, T, UNPROVIDED );
    final SubLObject dummy1 = thread.secondMultipleValue();
    final SubLObject dummy2 = thread.thirdMultipleValue();
    final SubLObject mt_$19 = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return Values.values( result, mt_$19 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 12428L)
  public static SubLObject canonicalize_cycl_test(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return canonicalize_cycl_int( formula, mt, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 12621L)
  public static SubLObject canonicalize_wf_cycl(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject result = NIL;
    result = canonicalize_cycl_int( sentence, mt, NIL, NIL, NIL, NIL );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 13057L)
  public static SubLObject canonicalize_wf_cycl_memoized(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return conses_high.copy_tree( canonicalize_wf_cycl_int_memoized( sentence, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 13203L)
  public static SubLObject canonicalize_wf_cycl_int_memoized_internal(final SubLObject sentence, final SubLObject mt)
  {
    return canonicalize_wf_cycl( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 13203L)
  public static SubLObject canonicalize_wf_cycl_int_memoized(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return canonicalize_wf_cycl_int_memoized_internal( sentence, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym21$CANONICALIZE_WF_CYCL_INT_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym21$CANONICALIZE_WF_CYCL_INT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym21$CANONICALIZE_WF_CYCL_INT_MEMOIZED, caching_state );
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( canonicalize_wf_cycl_int_memoized_internal( sentence, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 13330L)
  public static SubLObject canonicalize_wf_cycl_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result = canonicalize_cycl_int( sentence, mt, NIL, NIL, T, NIL );
    final SubLObject dummy1 = thread.secondMultipleValue();
    final SubLObject dummy2 = thread.thirdMultipleValue();
    final SubLObject mt_$20 = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return Values.values( result, mt_$20 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 13565L)
  public static SubLObject canonicalize_ask_memoized(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return conses_high.copy_tree( canonicalize_ask_int_memoized( sentence, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 13703L)
  public static SubLObject canonicalize_ask_int_memoized_internal(final SubLObject sentence, final SubLObject mt)
  {
    return canonicalize_ask( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 13703L)
  public static SubLObject canonicalize_ask_int_memoized(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return canonicalize_ask_int_memoized_internal( sentence, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym22$CANONICALIZE_ASK_INT_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym22$CANONICALIZE_ASK_INT_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym22$CANONICALIZE_ASK_INT_MEMOIZED, caching_state );
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( canonicalize_ask_int_memoized_internal( sentence, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 13822L)
  public static SubLObject canonicalize_ask(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_ask$.currentBinding( thread );
    try
    {
      control_vars.$within_ask$.bind( T, thread );
      result = remove_newly_introduced_variables_from_bindings( canonicalize_query( formula, mt, NIL, T ), formula );
    }
    finally
    {
      control_vars.$within_ask$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 14208L)
  public static SubLObject canonicalize_ask_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_ask$.currentBinding( thread );
    try
    {
      control_vars.$within_ask$.bind( T, thread );
      result = canonicalize_term( mt, mt_vars.$mt_mt$.getGlobalValue() );
      if( NIL != result )
      {
        result = hlmt_czer.canonicalize_hlmt( result );
      }
    }
    finally
    {
      control_vars.$within_ask$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 14493L)
  public static SubLObject canonicalize_ask_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_ask$.currentBinding( thread );
    try
    {
      control_vars.$within_ask$.bind( T, thread );
      thread.resetMultipleValues();
      final SubLObject result_$21 = canonicalize_query_sentence( sentence, mt );
      final SubLObject mt_$22 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$21;
      mt = mt_$22;
      result = remove_newly_introduced_variables_from_bindings( result, sentence );
    }
    finally
    {
      control_vars.$within_ask$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 14948L)
  public static SubLObject canonicalize_assert(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$within_ask$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( T, thread );
      control_vars.$within_ask$.bind( NIL, thread );
      result = canonicalize_cycl_int( formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      control_vars.$within_ask$.rebind( _prev_bind_2, thread );
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 15242L)
  public static SubLObject test_canonicalize_assert(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$clothe_naked_skolemsP$.currentBinding( thread );
    try
    {
      czer_vars.$clothe_naked_skolemsP$.bind( T, thread );
      result = canonicalize_assert( formula, mt );
    }
    finally
    {
      czer_vars.$clothe_naked_skolemsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 15482L)
  public static SubLObject canonicalize_assert_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$within_ask$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( T, thread );
      control_vars.$within_ask$.bind( NIL, thread );
      result = canonicalize_mt( mt );
    }
    finally
    {
      control_vars.$within_ask$.rebind( _prev_bind_2, thread );
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 15660L)
  public static SubLObject canonicalize_mt(SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_vars.$assume_hlmt_is_canonicalP$.getDynamicValue( thread ) )
    {
      mt = canonicalize_term( mt, mt_vars.$mt_mt$.getGlobalValue() );
      if( NIL != mt )
      {
        mt = hlmt_czer.canonicalize_hlmt( mt );
      }
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 16015L)
  public static SubLObject canonicalize_assert_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$within_ask$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( T, thread );
      control_vars.$within_ask$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject result_$23 = canonicalize_cycl_sentence( sentence, mt );
      final SubLObject mt_$24 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$23;
      mt = mt_$24;
    }
    finally
    {
      control_vars.$within_ask$.rebind( _prev_bind_2, thread );
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 16357L)
  public static SubLObject test_canonicalize_assert_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$clothe_naked_skolemsP$.currentBinding( thread );
    try
    {
      czer_vars.$clothe_naked_skolemsP$.bind( T, thread );
      thread.resetMultipleValues();
      final SubLObject result_$25 = canonicalize_assert_sentence( sentence, mt );
      final SubLObject mt_$26 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$25;
      mt = mt_$26;
    }
    finally
    {
      czer_vars.$clothe_naked_skolemsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 16649L)
  public static SubLObject canonicalize_wf_assert_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$within_ask$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( T, thread );
      control_vars.$within_ask$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject result_$27 = canonicalize_wf_cycl_sentence( sentence, mt );
      final SubLObject mt_$28 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$27;
      mt = mt_$28;
    }
    finally
    {
      control_vars.$within_ask$.rebind( _prev_bind_2, thread );
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 16997L)
  public static SubLObject canonicalize_unassert(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_unassert$.currentBinding( thread );
    try
    {
      control_vars.$within_unassert$.bind( T, thread );
      result = canonicalize_wf_cycl( formula, mt );
    }
    finally
    {
      control_vars.$within_unassert$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 17224L)
  public static SubLObject canonicalize_unassert_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_unassert$.currentBinding( thread );
    try
    {
      control_vars.$within_unassert$.bind( T, thread );
      thread.resetMultipleValues();
      final SubLObject result_$29 = canonicalize_wf_cycl_sentence( sentence, mt );
      final SubLObject mt_$30 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$29;
      mt = mt_$30;
    }
    finally
    {
      control_vars.$within_unassert$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 17503L)
  public static SubLObject ncanonicalize_query(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return canonicalize_query( formula, mt, T, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 17614L)
  public static SubLObject canonicalize_query(final SubLObject formula, SubLObject mt, SubLObject destructiveP, SubLObject unwrap_istP)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( destructiveP == UNPROVIDED )
    {
      destructiveP = NIL;
    }
    if( unwrap_istP == UNPROVIDED )
    {
      unwrap_istP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == wff_vars.$within_wffP$.getDynamicValue( thread ) && NIL == czer_vars.$within_canonicalizerP$.getDynamicValue( thread ) )
    {
      clear_canon_caches();
    }
    SubLObject result = NIL;
    SubLObject subordinate_fi_opsP = NIL;
    SubLObject copied_formula = NIL;
    mt = canonicalize_ask_mt( mt );
    final SubLObject _prev_bind_0 = czer_vars.$within_canonicalizerP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$czer_memoization_state$.currentBinding( thread );
    try
    {
      czer_vars.$within_canonicalizerP$.bind( T, thread );
      czer_vars.$czer_memoization_state$.bind( memoization_state.new_memoization_state( $str12$czer_memoization_state, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      final SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$31 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject _prev_bind_0_$32 = control_vars.$within_query$.currentBinding( thread );
          try
          {
            control_vars.$within_query$.bind( T, thread );
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_1_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            final SubLObject _prev_bind_4 = control_vars.$within_assert$.currentBinding( thread );
            final SubLObject _prev_bind_5 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
            final SubLObject _prev_bind_6 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
            final SubLObject _prev_bind_7 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
            final SubLObject _prev_bind_8 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
            final SubLObject _prev_bind_9 = wff_utilities.$check_var_typesP$.currentBinding( thread );
            final SubLObject _prev_bind_10 = czer_vars.$simplify_literalP$.currentBinding( thread );
            final SubLObject _prev_bind_11 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
            final SubLObject _prev_bind_12 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
            final SubLObject _prev_bind_13 = wff_vars.$validate_constantsP$.currentBinding( thread );
            final SubLObject _prev_bind_14 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
            final SubLObject _prev_bind_15 = czer_vars.$subordinate_fi_opsP$.currentBinding( thread );
            final SubLObject _prev_bind_16 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
            final SubLObject _prev_bind_17 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              control_vars.$within_assert$.bind( NIL, thread );
              wff_utilities.$check_arg_typesP$.bind( NIL, thread );
              at_vars.$at_check_arg_typesP$.bind( NIL, thread );
              wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
              wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
              wff_utilities.$check_var_typesP$.bind( NIL, thread );
              czer_vars.$simplify_literalP$.bind( NIL, thread );
              at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
              at_vars.$at_check_arg_formatP$.bind( NIL, thread );
              wff_vars.$validate_constantsP$.bind( NIL, thread );
              system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
              czer_vars.$subordinate_fi_opsP$.bind( NIL, thread );
              czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
              czer_vars.$standardize_variables_memory$.bind( NIL, thread );
              copied_formula = ( ( NIL != destructiveP ) ? formula : el_utilities.copy_formula( formula ) );
              thread.resetMultipleValues();
              final SubLObject copied_formula_$35 = precanonicalizer.early_precanonicalizations( copied_formula, mt );
              final SubLObject mt_$36 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              copied_formula = copied_formula_$35;
              mt = mt_$36;
              SubLObject wffP = wff.el_wff_syntaxP( copied_formula, UNPROVIDED );
              if( NIL == wffP )
              {
                thread.resetMultipleValues();
                final SubLObject simpler_formula = simplifier.try_to_simplify_non_wff_into_wff( copied_formula, Symbols.symbol_function( $sym23$EL_WFF_SYNTAX_ ), UNPROVIDED );
                final SubLObject is_it_wff_nowP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != is_it_wff_nowP )
                {
                  wffP = T;
                  copied_formula = simpler_formula;
                }
              }
              if( NIL != wffP )
              {
                result = copied_formula;
                SubLObject quiescedP = NIL;
                SubLObject count = ZERO_INTEGER;
                while ( NIL == quiescedP)
                {
                  thread.resetMultipleValues();
                  final SubLObject result_$37 = clausify_eliminating_ists( result, mt, $kw24$DNF, unwrap_istP );
                  final SubLObject mt_$37 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  result = result_$37;
                  mt = mt_$37;
                  result = clausifier.dnf_operators_out( result );
                  thread.resetMultipleValues();
                  final SubLObject result_$38 = canonicalize_query_clauses( result, mt );
                  final SubLObject mt_$38 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  result = result_$38;
                  mt = mt_$38;
                  if( count.numGE( czer_vars.$czer_quiescence_iteration_limit$.getDynamicValue( thread ) ) )
                  {
                    quiescedP = T;
                  }
                  else
                  {
                    quiescedP = czer_result_quiescedP( result, unwrap_istP );
                  }
                  if( NIL == quiescedP )
                  {
                    result = uncanonicalizer.dnf_intermediate_el_formula( czer_utilities.extract_el_clauses( result ) );
                  }
                  count = Numbers.add( count, ONE_INTEGER );
                }
                subordinate_fi_opsP = czer_vars.$subordinate_fi_opsP$.getDynamicValue( thread );
              }
            }
            finally
            {
              czer_vars.$standardize_variables_memory$.rebind( _prev_bind_17, thread );
              czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_16, thread );
              czer_vars.$subordinate_fi_opsP$.rebind( _prev_bind_15, thread );
              system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_14, thread );
              wff_vars.$validate_constantsP$.rebind( _prev_bind_13, thread );
              at_vars.$at_check_arg_formatP$.rebind( _prev_bind_12, thread );
              at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_11, thread );
              czer_vars.$simplify_literalP$.rebind( _prev_bind_10, thread );
              wff_utilities.$check_var_typesP$.rebind( _prev_bind_9, thread );
              wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_8, thread );
              wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_7, thread );
              at_vars.$at_check_arg_typesP$.rebind( _prev_bind_6, thread );
              wff_utilities.$check_arg_typesP$.rebind( _prev_bind_5, thread );
              control_vars.$within_assert$.rebind( _prev_bind_4, thread );
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$34, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$33, thread );
            }
          }
          finally
          {
            control_vars.$within_query$.rebind( _prev_bind_0_$32, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$31, thread );
      }
    }
    finally
    {
      czer_vars.$czer_memoization_state$.rebind( _prev_bind_2, thread );
      czer_vars.$within_canonicalizerP$.rebind( _prev_bind_0, thread );
    }
    if( NIL == unwrap_istP )
    {
      mt = NIL;
    }
    return Values.values( result, subordinate_fi_opsP, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 20104L)
  public static SubLObject canonicalize_query_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result = canonicalize_query( sentence, mt, NIL, T );
    final SubLObject dummy1 = thread.secondMultipleValue();
    final SubLObject mt_$42 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( result, mt_$42 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 20804L)
  public static SubLObject canonicalize_expression(final SubLObject expression, SubLObject mt, SubLObject destructiveP)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( destructiveP == UNPROVIDED )
    {
      destructiveP = NIL;
    }
    if( NIL != term.nautP( expression, UNPROVIDED ) )
    {
      return Values.values( canonicalize_term( expression, mt ), NIL );
    }
    if( NIL == cycl_variables.cyc_varP( expression ) && NIL != cycl_grammar.cycl_sentence_p( expression ) )
    {
      final SubLObject result = canonicalize_cycl_int( expression, mt, destructiveP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return Values.values( result, czer_utilities.list_of_clause_binding_list_pairs_p( result ) );
    }
    return Values.values( expression, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 21424L)
  public static SubLObject clausify_eliminating_ists(SubLObject sentence, SubLObject mt, final SubLObject clausal_form, final SubLObject unwrap_istP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != unwrap_istP )
    {
      thread.resetMultipleValues();
      final SubLObject sentence_$43 = czer_utilities.unwrap_if_ist_permissive_canonical( sentence, mt );
      final SubLObject mt_$44 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      sentence = sentence_$43;
      mt = mt_$44;
    }
    SubLObject ist_quiescenceP = NIL;
    while ( NIL == ist_quiescenceP)
    {
      sentence = simplifier.simplify_sequence_variables_1( sentence );
      if( clausal_form.eql( $kw14$CNF ) )
      {
        thread.resetMultipleValues();
        final SubLObject sentence_$44 = clausifier.el_cnf_destructive( sentence, mt );
        final SubLObject mt_$45 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$44;
        mt = mt_$45;
      }
      else if( clausal_form.eql( $kw24$DNF ) )
      {
        thread.resetMultipleValues();
        final SubLObject sentence_$45 = clausifier.el_dnf_destructive( sentence, mt );
        final SubLObject mt_$46 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$45;
        mt = mt_$46;
      }
      else
      {
        Errors.error( $str25$Unknown_clausal_form__s, clausal_form );
      }
      if( NIL == unwrap_istP )
      {
        ist_quiescenceP = T;
      }
      else
      {
        thread.resetMultipleValues();
        final SubLObject sub_sentence = czer_utilities.unwrap_if_ist_permissive_canonical( sentence, mt );
        final SubLObject sub_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( sentence.eql( sub_sentence ) && mt.eql( sub_mt ) )
        {
          ist_quiescenceP = T;
        }
        else
        {
          sentence = sub_sentence;
          mt = hlmt_czer.canonicalize_hlmt( sub_mt );
        }
      }
    }
    mt = hlmt_czer.canonicalize_hlmt( mt );
    return Values.values( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 22793L)
  public static SubLObject remove_newly_introduced_variables_from_bindings(final SubLObject clauses_and_more, final SubLObject original_formula)
  {
    if( clauses_and_more.isCons() && NIL != el_utilities.el_formula_p( original_formula ) )
    {
      SubLObject cdolist_list_var = clauses_and_more;
      SubLObject clause_and_more = NIL;
      clause_and_more = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject canon_free_vars = conses_high.third( clause_and_more );
        final SubLObject original_vars = el_utilities.referenced_variables( original_formula, UNPROVIDED );
        final SubLObject spurious_free_vars = list_utilities.fast_set_difference( canon_free_vars, original_vars, UNPROVIDED );
        if( NIL != spurious_free_vars )
        {
          final SubLObject corrected_free_vars = list_utilities.fast_set_difference( canon_free_vars, spurious_free_vars, UNPROVIDED );
          list_utilities.nreplace_nth( TWO_INTEGER, corrected_free_vars, clause_and_more );
        }
        cdolist_list_var = cdolist_list_var.rest();
        clause_and_more = cdolist_list_var.first();
      }
    }
    return clauses_and_more;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 23426L)
  public static SubLObject clear_canon_caches()
  {
    clausifier.clear_cached_cnf_clausal_form();
    czer_meta.clear_cached_find_assertions_cycl();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 23608L)
  public static SubLObject canon_wffP(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject wffP = NIL;
    final SubLObject _prev_bind_0 = wff_vars.$provide_wff_suggestionsP$.currentBinding( thread );
    try
    {
      wff_vars.$provide_wff_suggestionsP$.bind( NIL, thread );
      if( NIL != czer_vars.$recanonicalizingP$.getDynamicValue( thread ) )
      {
        wffP = wff.el_wff_syntaxP( formula, UNPROVIDED );
      }
      else
      {
        wffP = makeBoolean( NIL != wff_vars.wff_assertiveP() && NIL != wff.strictly_wff_in_all_spec_mtsP( formula, mt, UNPROVIDED ) );
        if( NIL == wffP )
        {
          clear_canon_caches();
          wffP = wff.el_wffP( formula, mt, UNPROVIDED );
        }
      }
    }
    finally
    {
      wff_vars.$provide_wff_suggestionsP$.rebind( _prev_bind_0, thread );
    }
    return wffP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 24230L)
  public static SubLObject check_wff_arityP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return wff_utilities.$check_arityP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 24310L)
  public static SubLObject check_wff_semanticsP(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != psc_queryP( mt ) ) ? NIL
        : makeBoolean( NIL != czer_vars.$must_enforce_semanticsP$.getDynamicValue( thread ) || ( NIL != wff_utilities.$check_wff_semanticsP$.getDynamicValue( thread ) && NIL != control_vars.$within_assert$
            .getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 24497L)
  public static SubLObject canonicalize_clauses_terms(SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$canonicalize_termsP$.getDynamicValue( thread ) )
    {
      v_clauses = canonicalize_clauses_quoted_terms( v_clauses );
      v_clauses = canonicalize_clauses_sentence_terms( v_clauses );
      v_clauses = canonicalize_clauses_commutative_terms_destructive( v_clauses );
      v_clauses = canonicalize_functions( v_clauses );
      v_clauses = canonicalize_clauses_transformable_nats( v_clauses );
      v_clauses = canonicalize_clauses_commutative_terms_destructive( v_clauses );
    }
    return v_clauses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 25545L)
  public static SubLObject canonicalize_clauses_quoted_terms(final SubLObject v_clauses)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym26$CANONICALIZE_CLAUSE_QUOTED_TERMS ), v_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 25717L)
  public static SubLObject canonicalize_clause_quoted_terms(final SubLObject clause)
  {
    return clauses.make_cnf( canonicalize_literals_quoted_terms( clauses.neg_lits( clause ) ), canonicalize_literals_quoted_terms( clauses.pos_lits( clause ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 25909L)
  public static SubLObject canonicalize_literals_quoted_terms(final SubLObject literals)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = Sequences.reverse( literals );
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( canonicalize_literal_quoted_terms_recursive( literal ), result );
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 26126L)
  public static SubLObject canonicalize_literal_quoted_terms_recursive(final SubLObject literal)
  {
    SubLObject result = literal;
    final SubLObject escapequote = list_utilities.tree_find_if( Symbols.symbol_function( $sym27$ESCAPE_QUOTE_SYNTAX_P ), result, UNPROVIDED );
    SubLObject escaped_form = NIL;
    if( NIL != escapequote && NIL == list_utilities.tree_find_if( Symbols.symbol_function( $sym28$CYC_VAR_ ), escapequote, UNPROVIDED ) )
    {
      escaped_form = cycl_utilities.formula_arg1( escapequote, UNPROVIDED );
      result = canonicalize_literal_quoted_terms_recursive( conses_high.subst( escaped_form, escapequote, result, UNPROVIDED, UNPROVIDED ) );
    }
    final SubLObject quasiquote = list_utilities.tree_find_if( Symbols.symbol_function( $sym29$QUASI_QUOTE_SYNTAX_P ), result, UNPROVIDED );
    SubLObject quote_form = NIL;
    if( NIL != quasiquote )
    {
      quote_form = ConsesLow.list( $const30$Quote, ConsesLow.list( $const31$EscapeQuote, cycl_utilities.formula_arg1( quasiquote, UNPROVIDED ) ) );
      result = canonicalize_literal_quoted_terms_recursive( conses_high.subst( quote_form, quasiquote, result, UNPROVIDED, UNPROVIDED ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 27129L)
  public static SubLObject canonicalize_quoted_term(final SubLObject v_term, SubLObject convert_el_vars_to_hlP)
  {
    if( convert_el_vars_to_hlP == UNPROVIDED )
    {
      convert_el_vars_to_hlP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    v_answer = canonicalize_literal_quoted_terms_recursive( v_term );
    if( NIL != v_answer && NIL != convert_el_vars_to_hlP )
    {
      v_answer = rename_clause_vars( v_answer, UNPROVIDED ).first();
      if( NIL != v_answer && cycl_utilities.formula_arg0( v_answer ).eql( $const30$Quote ) )
      {
        final SubLObject _prev_bind_0 = cycl_grammar.$within_quote_form$.currentBinding( thread );
        try
        {
          cycl_grammar.$within_quote_form$.bind( T, thread );
          v_answer = cycl_utilities.expression_transform( v_answer, Symbols.symbol_function( $sym32$FAST_ESCAPE_QUOTE_TERM_P ), Symbols.symbol_function( $sym33$FORMULA_ARG1 ), NIL, UNPROVIDED );
        }
        finally
        {
          cycl_grammar.$within_quote_form$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 27644L)
  public static SubLObject unquote_quoted_term(final SubLObject v_term, SubLObject convert_el_vars_to_hlP)
  {
    if( convert_el_vars_to_hlP == UNPROVIDED )
    {
      convert_el_vars_to_hlP = NIL;
    }
    if( NIL == cycl_grammar.cycl_quoted_term_p( v_term ) )
    {
      return v_term;
    }
    final SubLObject canonical_quoted_term = canonicalize_quoted_term( v_term, convert_el_vars_to_hlP );
    if( NIL != canonical_quoted_term )
    {
      return cycl_utilities.formula_arg1( canonical_quoted_term, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 28034L)
  public static SubLObject canonicalize_clauses_sentence_terms(final SubLObject v_clauses)
  {
    if( NIL != canonicalize_no_sentence_argsP() )
    {
      return v_clauses;
    }
    return list_utilities.nmapcar( Symbols.symbol_function( $sym34$CANONICALIZE_CLAUSE_SENTENCE_TERMS ), v_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 28542L)
  public static SubLObject canonicalize_no_sentence_argsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == czer_vars.$canonicalize_tensed_literalsP$.getDynamicValue( thread ) && NIL == czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 28779L)
  public static SubLObject canonicalize_clause_sentence_terms(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject neg_lits = NIL;
    SubLObject pos_lits = NIL;
    SubLObject _prev_bind_0 = $canonicalize_clause_sentence_terms_sense_lambda$.currentBinding( thread );
    try
    {
      $canonicalize_clause_sentence_terms_sense_lambda$.bind( $kw35$NEG, thread );
      neg_lits = list_utilities.nmapcar( Symbols.symbol_function( $sym36$CANONICALIZE_LITERAL_SENTENCE_TERMS ), clauses.neg_lits( clause ) );
    }
    finally
    {
      $canonicalize_clause_sentence_terms_sense_lambda$.rebind( _prev_bind_0, thread );
    }
    _prev_bind_0 = $canonicalize_clause_sentence_terms_sense_lambda$.currentBinding( thread );
    try
    {
      $canonicalize_clause_sentence_terms_sense_lambda$.bind( $kw37$POS, thread );
      pos_lits = list_utilities.nmapcar( Symbols.symbol_function( $sym36$CANONICALIZE_LITERAL_SENTENCE_TERMS ), clauses.pos_lits( clause ) );
    }
    finally
    {
      $canonicalize_clause_sentence_terms_sense_lambda$.rebind( _prev_bind_0, thread );
    }
    thread.resetMultipleValues();
    final SubLObject neg_lits_$49 = unnegate_and_flip_negated_lits( neg_lits, pos_lits );
    final SubLObject pos_lits_$50 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    neg_lits = neg_lits_$49;
    pos_lits = pos_lits_$50;
    return clauses.make_clause( neg_lits, pos_lits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 29664L)
  public static SubLObject unnegate_and_flip_negated_lits(SubLObject neg_lits, SubLObject pos_lits)
  {
    if( NIL != list_utilities.any_in_list( $sym38$EL_NEGATION_P, neg_lits, UNPROVIDED ) || NIL != list_utilities.any_in_list( $sym38$EL_NEGATION_P, pos_lits, UNPROVIDED ) )
    {
      SubLObject new_neg_lits = NIL;
      SubLObject new_pos_lits = NIL;
      SubLObject cdolist_list_var = pos_lits;
      SubLObject pos_lit = NIL;
      pos_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_utilities.el_negation_p( pos_lit ) )
        {
          new_neg_lits = ConsesLow.cons( cycl_utilities.negate( pos_lit ), new_neg_lits );
        }
        else
        {
          new_pos_lits = ConsesLow.cons( pos_lit, new_pos_lits );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pos_lit = cdolist_list_var.first();
      }
      cdolist_list_var = neg_lits;
      SubLObject neg_lit = NIL;
      neg_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_utilities.el_negation_p( neg_lit ) )
        {
          new_pos_lits = ConsesLow.cons( cycl_utilities.negate( neg_lit ), new_pos_lits );
        }
        else
        {
          new_neg_lits = ConsesLow.cons( neg_lit, new_neg_lits );
        }
        cdolist_list_var = cdolist_list_var.rest();
        neg_lit = cdolist_list_var.first();
      }
      neg_lits = Sequences.nreverse( new_neg_lits );
      pos_lits = Sequences.nreverse( new_pos_lits );
    }
    return Values.values( neg_lits, pos_lits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 30366L)
  public static SubLObject canonicalize_literal_sentence_terms(SubLObject literal, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$canonicalize_tensed_literalsP$.getDynamicValue( thread ) )
    {
      thread.resetMultipleValues();
      final SubLObject unwrapped_literal = czer_utilities.unwrap_if_ist_permissive( literal, mt );
      final SubLObject ist_mt = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != cycl_grammar.cycl_generalized_tensed_literal_p( unwrapped_literal ) )
      {
        final SubLObject sense = $canonicalize_clause_sentence_terms_sense_lambda$.getDynamicValue( thread );
        thread.resetMultipleValues();
        final SubLObject new_literal = hlmt_czer.tense_recursive_expander( unwrapped_literal, sense, ist_mt );
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != hlmt.hlmt_equalP( new_mt, mt ) )
        {
          literal = new_literal;
        }
        else
        {
          literal = el_utilities.make_ist_sentence( new_mt, new_literal );
        }
        if( sense == $kw35$NEG )
        {
          literal = cycl_utilities.negate( literal );
        }
      }
    }
    if( NIL != czer_vars.$canonicalize_all_sentence_argsP$.getDynamicValue( thread ) )
    {
      return canonicalize_relation_sentence_terms( literal, mt );
    }
    return literal;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 31687L)
  public static SubLObject canonicalize_function_sentence_terms(final SubLObject function, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return canonicalize_relation_sentence_terms( function, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 32091L)
  public static SubLObject canonicalize_relation_sentence_terms(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == el_utilities.relation_expressionP( relation ) )
    {
      el_utilities.el_error( TWO_INTEGER, $str39$Tried_to_canonicalize_the_formula, relation, UNPROVIDED, UNPROVIDED );
      return relation;
    }
    if( NIL != el_utilities.subl_escape_p( relation ) )
    {
      return relation;
    }
    final SubLObject seqvar = el_utilities.sequence_var( relation, UNPROVIDED );
    final SubLObject relation_$51 = ( NIL != seqvar ) ? el_utilities.strip_sequence_var( relation ) : relation;
    SubLObject result = NIL;
    final SubLObject reln = cycl_utilities.formula_arg0( relation_$51 );
    SubLObject argnum = ZERO_INTEGER;
    SubLObject cdolist_list_var = cycl_utilities.formula_terms( relation_$51, UNPROVIDED );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding( thread );
      try
      {
        wff_vars.$permit_keyword_variablesP$.bind( czer_utilities.arg_permits_keyword_variablesP( reln, argnum, UNPROVIDED ), thread );
        if( NIL != czer_utilities.canon_varP( v_term ) )
        {
          result = ConsesLow.cons( v_term, result );
        }
        else if( NIL != obsolete.natP( v_term, UNPROVIDED ) )
        {
          result = ConsesLow.cons( canonicalize_function_sentence_terms( v_term, mt ), result );
        }
        else if( NIL != term.sentenceP( v_term, UNPROVIDED ) )
        {
          result = ConsesLow.cons( uncanonicalizer.el_version( v_term, mt ), result );
        }
        else if( NIL != el_utilities.literalP( v_term ) )
        {
          result = ConsesLow.cons( canonicalize_literal_sentence_terms( v_term, mt ), result );
        }
        else
        {
          result = ConsesLow.cons( v_term, result );
        }
      }
      finally
      {
        wff_vars.$permit_keyword_variablesP$.rebind( _prev_bind_0, thread );
      }
      argnum = Numbers.add( argnum, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    result = Sequences.nreverse( result );
    if( NIL != seqvar )
    {
      return el_utilities.nadd_sequence_var_to_end( seqvar, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 33443L)
  public static SubLObject canonicalize_clauses_commutative_terms_destructive(final SubLObject v_clauses)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym40$CANONICALIZE_CLAUSE_COMMUTATIVE_TERMS_DESTRUCTIVE ), v_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 34081L)
  public static SubLObject canonicalize_clause_commutative_terms(final SubLObject clause)
  {
    return canonicalize_clause_commutative_terms_destructive( el_utilities.copy_clause( clause ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 34450L)
  public static SubLObject canonicalize_clause_commutative_terms_destructive(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( ( NIL == czer_vars.$canonicalize_gaf_commutative_termsP$.getDynamicValue( thread ) && NIL != clause_utilities.gaf_clauseP( clause ) ) || NIL != never_commutative_gaf_clauseP( clause ) )
    {
      return clause;
    }
    return clauses.make_cnf( canonicalize_literals_commutative_terms( clauses.neg_lits( clause ) ), canonicalize_literals_commutative_terms( clauses.pos_lits( clause ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 35177L)
  public static SubLObject never_commutative_gaf_clauseP(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != clause_utilities.pos_atomic_cnf_p( clause ) && NIL != conses_high.member( cycl_utilities.formula_operator( clause_utilities.gaf_cnf_literal( clause ) ), $never_commutative_predicates$
        .getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) && NIL == el_utilities.contains_subformula_p( clause_utilities.gaf_cnf_literal( clause ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 35427L)
  public static SubLObject canonicalize_literals_commutative_terms(final SubLObject literals)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym42$CANONICALIZE_LITERAL_COMMUTATIVE_TERMS_DESTRUCTIVE ), literals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 35749L)
  public static SubLObject canonicalize_literal_commutative_terms(final SubLObject literal)
  {
    return canonicalize_literal_commutative_terms_destructive( el_utilities.copy_formula( literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 36070L)
  public static SubLObject canonicalize_literal_commutative_terms_destructive(final SubLObject literal)
  {
    final SubLObject seqvar = el_utilities.sequence_var( literal, UNPROVIDED );
    final SubLObject literal_$52 = ( NIL != seqvar ) ? el_utilities.strip_sequence_var( literal ) : literal;
    SubLObject result = NIL;
    final SubLObject pred = el_utilities.literal_predicate( literal_$52, UNPROVIDED );
    final SubLObject dont_reorder_argnums = czer_utilities.dont_reorder_commutative_terms_for_args( pred, UNPROVIDED );
    final SubLObject args = canonicalize_terms_commutative_terms_without_reordering( el_utilities.literal_args( literal_$52, UNPROVIDED ), dont_reorder_argnums );
    if( NIL != fort_types_interface.commutative_relationP( pred ) )
    {
      result = el_utilities.make_el_literal( pred, order_commutative_terms( args ), UNPROVIDED );
    }
    else if( NIL != fort_types_interface.partially_commutative_relation_p( pred ) )
    {
      result = el_utilities.make_el_literal( pred, sort_partially_commutative_terms( pred, args, Symbols.symbol_function( $sym43$COMMUTATIVE_TERMS_IN_ORDER_ ) ), UNPROVIDED );
    }
    else
    {
      result = el_utilities.make_el_literal( pred, args, UNPROVIDED );
    }
    if( NIL != seqvar )
    {
      return el_utilities.nadd_sequence_var_to_end( seqvar, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 36899L)
  public static SubLObject canonicalize_literal_commutative_args(final SubLObject lit)
  {
    final SubLObject literal = el_utilities.copy_formula( lit );
    final SubLObject seqvar = el_utilities.sequence_var( literal, UNPROVIDED );
    final SubLObject tempformula = literal;
    final SubLObject literal_$53 = ( NIL != seqvar ) ? el_utilities.strip_sequence_var( tempformula ) : tempformula;
    SubLObject result = NIL;
    final SubLObject pred = el_utilities.literal_predicate( literal_$53, UNPROVIDED );
    final SubLObject args = el_utilities.literal_args( literal_$53, UNPROVIDED );
    if( NIL != fort_types_interface.commutative_relationP( pred ) )
    {
      result = el_utilities.make_el_literal( pred, order_commutative_terms( args ), UNPROVIDED );
    }
    else if( NIL != fort_types_interface.partially_commutative_relation_p( pred ) )
    {
      result = el_utilities.make_el_literal( pred, sort_partially_commutative_terms( pred, args, Symbols.symbol_function( $sym43$COMMUTATIVE_TERMS_IN_ORDER_ ) ), UNPROVIDED );
    }
    else
    {
      result = el_utilities.make_el_literal( pred, args, UNPROVIDED );
    }
    if( NIL != seqvar )
    {
      return el_utilities.nadd_sequence_var_to_end( seqvar, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 37520L)
  public static SubLObject order_commutative_terms(final SubLObject terms)
  {
    return Sort.sort( terms, Symbols.symbol_function( $sym43$COMMUTATIVE_TERMS_IN_ORDER_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 37652L)
  public static SubLObject canonicalize_terms_commutative_terms_without_reordering(final SubLObject terms, final SubLObject dont_reorder_argnums)
  {
    SubLObject canonicalized_terms = NIL;
    SubLObject list_var = NIL;
    SubLObject v_term = NIL;
    SubLObject argnum = NIL;
    list_var = terms;
    v_term = list_var.first();
    for( argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = Numbers.add( ONE_INTEGER, argnum ) )
    {
      if( NIL != subl_promotions.memberP( Numbers.add( argnum, ONE_INTEGER ), dont_reorder_argnums, UNPROVIDED, UNPROVIDED ) )
      {
        canonicalized_terms = ConsesLow.cons( v_term, canonicalized_terms );
      }
      else
      {
        canonicalized_terms = ConsesLow.cons( canonicalize_term_commutative_terms( v_term ), canonicalized_terms );
      }
    }
    return Sequences.nreverse( canonicalized_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 38219L)
  public static SubLObject canonicalize_term_commutative_terms(final SubLObject v_term)
  {
    if( NIL != el_utilities.subl_escape_p( v_term ) )
    {
      return v_term;
    }
    if( NIL != term.nautP( v_term, UNPROVIDED ) )
    {
      return canonicalize_nat_commutative_terms( v_term );
    }
    if( NIL != el_utilities.el_relation_expressionP( v_term ) )
    {
      return canonicalize_relation_commutative_terms_destructive( v_term );
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 38972L)
  public static SubLObject unary_function_commutes_with_its_argumentP(final SubLObject nat)
  {
    return makeBoolean( ONE_INTEGER.numE( cycl_utilities.nat_arity( nat, UNPROVIDED ) ) && ONE_INTEGER.numE( cycl_utilities.nat_arity( cycl_utilities.nat_arg1( nat, UNPROVIDED ), UNPROVIDED ) ) && NIL != czer_utilities
        .commuting_functionsP( cycl_utilities.nat_functor( nat ), cycl_utilities.nat_functor( cycl_utilities.nat_arg1( nat, UNPROVIDED ) ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 39193L)
  public static SubLObject canonicalize_commuting_function(final SubLObject nat)
  {
    final SubLObject outer_func = cycl_utilities.nat_functor( nat );
    final SubLObject inner_func = cycl_utilities.nat_functor( cycl_utilities.nat_arg1( nat, UNPROVIDED ) );
    if( NIL != commutative_terms_in_orderP( outer_func, inner_func ) )
    {
      return nat;
    }
    final SubLObject arg = cycl_utilities.nat_arg1( cycl_utilities.nat_arg1( nat, UNPROVIDED ), UNPROVIDED );
    return el_utilities.make_unary_nat_formula( inner_func, el_utilities.make_unary_nat_formula( outer_func, arg ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 39538L)
  public static SubLObject canonicalize_nat_commutative_terms(final SubLObject nat)
  {
    final SubLObject seqvar = el_utilities.sequence_var( nat, UNPROVIDED );
    final SubLObject nat_$54 = ( NIL != seqvar ) ? el_utilities.strip_sequence_var( nat ) : nat;
    SubLObject result = NIL;
    final SubLObject function = cycl_utilities.nat_functor( nat_$54 );
    final SubLObject dont_reorder_argnums = czer_utilities.dont_reorder_commutative_terms_for_args( function, UNPROVIDED );
    final SubLObject v_arguments = canonicalize_terms_commutative_terms_without_reordering( cycl_utilities.nat_args( nat_$54, UNPROVIDED ), dont_reorder_argnums );
    if( NIL != unary_function_commutes_with_its_argumentP( nat_$54 ) )
    {
      result = canonicalize_commuting_function( nat_$54 );
    }
    else if( NIL != kb_accessors.commutative_functionP( function ) )
    {
      result = el_utilities.make_nat_formula( function, Sort.sort( v_arguments, Symbols.symbol_function( $sym43$COMMUTATIVE_TERMS_IN_ORDER_ ), UNPROVIDED ) );
    }
    else if( NIL != fort_types_interface.partially_commutative_relation_p( function ) )
    {
      result = el_utilities.make_nat_formula( function, sort_partially_commutative_terms( function, v_arguments, Symbols.symbol_function( $sym43$COMMUTATIVE_TERMS_IN_ORDER_ ) ) );
    }
    else if( v_arguments.eql( cycl_utilities.nat_args( nat_$54, UNPROVIDED ) ) )
    {
      result = nat_$54;
    }
    else
    {
      result = el_utilities.make_nat_formula( function, v_arguments );
    }
    if( NIL != seqvar )
    {
      return el_utilities.nadd_sequence_var_to_end( seqvar, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 40700L)
  public static SubLObject canonicalize_relation_commutative_terms(final SubLObject relation_expression)
  {
    return canonicalize_relation_commutative_terms_destructive( el_utilities.copy_formula( relation_expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 41057L)
  public static SubLObject canonicalize_relation_commutative_terms_destructive(final SubLObject relation_expression)
  {
    final SubLObject relation = cycl_utilities.formula_operator( relation_expression );
    final SubLObject dont_reorder_argnums = czer_utilities.dont_reorder_commutative_terms_for_args( relation, UNPROVIDED );
    final SubLObject seqvar = el_utilities.sequence_var( relation_expression, UNPROVIDED );
    final SubLObject canonical_arguments = canonicalize_terms_commutative_terms_without_reordering( cycl_utilities.formula_args( relation_expression, $kw45$IGNORE ), dont_reorder_argnums );
    final SubLObject subcanonical_formula = el_utilities.make_el_formula( relation, canonical_arguments, seqvar );
    return sort_relation_commutative_terms( subcanonical_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 41700L)
  public static SubLObject sort_relation_commutative_terms(final SubLObject relation_expression)
  {
    final SubLObject seqvar = el_utilities.sequence_var( relation_expression, UNPROVIDED );
    final SubLObject relation_expression_$55 = ( NIL != seqvar ) ? el_utilities.strip_sequence_var( relation_expression ) : relation_expression;
    SubLObject result = NIL;
    final SubLObject relation = cycl_utilities.formula_operator( relation_expression_$55 );
    final SubLObject v_arguments = cycl_utilities.formula_args( relation_expression_$55, UNPROVIDED );
    if( NIL != fort_types_interface.commutative_relationP( relation ) )
    {
      result = el_utilities.make_el_formula( relation, Sort.sort( v_arguments, Symbols.symbol_function( $sym43$COMMUTATIVE_TERMS_IN_ORDER_ ), UNPROVIDED ), UNPROVIDED );
    }
    else if( NIL != fort_types_interface.partially_commutative_relation_p( relation ) )
    {
      result = el_utilities.make_el_formula( relation, sort_partially_commutative_terms( relation, v_arguments, Symbols.symbol_function( $sym43$COMMUTATIVE_TERMS_IN_ORDER_ ) ), UNPROVIDED );
    }
    else
    {
      result = relation_expression_$55;
    }
    if( NIL != seqvar )
    {
      return el_utilities.nadd_sequence_var_to_end( seqvar, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 42466L)
  public static SubLObject sort_partially_commutative_terms(final SubLObject relation, SubLObject terms, final SubLObject sort_fn)
  {
    SubLObject cdolist_list_var;
    final SubLObject commutative_argnums_set = cdolist_list_var = partially_commutative_argnums( relation, terms );
    SubLObject commutative_argnums = NIL;
    commutative_argnums = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject commutative_args = NIL;
      SubLObject cdotimes_end_var;
      SubLObject argnum;
      for( cdotimes_end_var = Sequences.length( terms ), argnum = NIL, argnum = ZERO_INTEGER; argnum.numL( cdotimes_end_var ); argnum = Numbers.add( argnum, ONE_INTEGER ) )
      {
        if( NIL != subl_promotions.memberP( Numbers.add( ONE_INTEGER, argnum ), commutative_argnums, UNPROVIDED, UNPROVIDED ) )
        {
          commutative_args = ConsesLow.cons( ConsesLow.nth( argnum, terms ), commutative_args );
        }
      }
      commutative_args = Sort.sort( commutative_args, sort_fn, UNPROVIDED );
      SubLObject commutative_argnum = NIL;
      SubLObject argnums = NIL;
      SubLObject argnum2 = NIL;
      commutative_argnum = ZERO_INTEGER;
      for( argnums = commutative_argnums, argnum2 = argnums.first(); NIL != argnum2; argnum2 = argnums.first() )
      {
        terms = list_utilities.nreplace_nth( Numbers.subtract( argnum2, ONE_INTEGER ), ConsesLow.nth( commutative_argnum, commutative_args ), terms );
        commutative_argnum = Numbers.add( ONE_INTEGER, commutative_argnum );
        argnums = argnums.rest();
      }
      cdolist_list_var = cdolist_list_var.rest();
      commutative_argnums = cdolist_list_var.first();
    }
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 43363L)
  public static SubLObject commutative_argnums(final SubLObject relation_expression)
  {
    final SubLObject relation = cycl_utilities.formula_operator( relation_expression );
    final SubLObject args = cycl_utilities.formula_args( relation_expression, $kw45$IGNORE );
    if( NIL != fort_types_interface.commutative_relationP( relation ) )
    {
      return ConsesLow.list( list_utilities.numlist( Sequences.length( args ), ONE_INTEGER ) );
    }
    if( NIL != fort_types_interface.partially_commutative_relation_p( relation ) )
    {
      return partially_commutative_argnums( relation, args );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 43838L)
  public static SubLObject ok_wrt_partial_commutativityP(final SubLObject relation_expression, final SubLObject mt, final SubLObject inhibit_cyclesP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = T;
    if( NIL != inhibit_cyclesP && NIL == el_utilities.relation_free_variables( relation_expression, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject relation = cycl_utilities.formula_arg1( relation_expression, UNPROVIDED );
      final SubLObject cia_args = cycl_utilities.formula_args( relation_expression, UNPROVIDED ).rest();
      final SubLObject max = list_utilities.safe_max( cia_args, UNPROVIDED );
      if( max.isInteger() )
      {
        SubLObject cia_formulas = cia_formulas( relation, mt );
        if( NIL == subl_promotions.memberP( relation_expression, cia_formulas, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          cia_formulas = ConsesLow.nconc( cia_formulas, ConsesLow.list( relation_expression ) );
        }
        thread.resetMultipleValues();
        final SubLObject foo = partially_commutative_argnums_int( ConsesLow.make_list( max, $kw46$DUMMY ), cia_formulas, inhibit_cyclesP );
        final SubLObject errors = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != errors )
        {
          okP = NIL;
          SubLObject cdolist_list_var = errors;
          SubLObject error = NIL;
          error = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            wff.note_wff_violation( error );
            cdolist_list_var = cdolist_list_var.rest();
            error = cdolist_list_var.first();
          }
        }
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 45448L)
  public static SubLObject partially_commutative_argnums(final SubLObject relation, final SubLObject args)
  {
    return partially_commutative_argnums_int( args, cia_formulas( relation, UNPROVIDED ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 46283L)
  public static SubLObject partially_commutative_argnums_int(final SubLObject args, final SubLObject cia_formulas, SubLObject inhibit_cyclesP)
  {
    if( inhibit_cyclesP == UNPROVIDED )
    {
      inhibit_cyclesP = NIL;
    }
    SubLObject error_condition = NIL;
    SubLObject cycleP = NIL;
    SubLObject accumulator = NIL;
    SubLObject cia_rest_formula = NIL;
    SubLObject assoc_list = NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cia_formulas;
    SubLObject cia_formula = NIL;
    cia_formula = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject modified_cia_formula = cia_formula;
      SubLObject commutative_argnums = NIL;
      if( $const47$commutativeInArgsAndRest.eql( cycl_utilities.formula_operator( cia_formula ) ) )
      {
        if( NIL != cia_rest_formula )
        {
          cycleP = T;
          if( NIL != inhibit_cyclesP )
          {
            error_condition = ConsesLow.cons( ConsesLow.list( $kw48$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST, cia_formula, cia_rest_formula ), error_condition );
          }
        }
        cia_rest_formula = cia_formula;
        modified_cia_formula = el_utilities.copy_formula( modified_cia_formula );
        final SubLObject highest_argnum = list_utilities.safe_max( cycl_utilities.formula_args( cia_formula, UNPROVIDED ).rest(), UNPROVIDED );
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject argnum;
        for( cdotimes_end_var = Sequences.length( args ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          argnum = Numbers.add( i, ONE_INTEGER );
          if( argnum.numG( highest_argnum ) )
          {
            modified_cia_formula = ConsesLow.nconc( modified_cia_formula, ConsesLow.list( argnum ) );
          }
        }
      }
      SubLObject cdolist_list_var_$57;
      final SubLObject args_$56 = cdolist_list_var_$57 = cycl_utilities.formula_args( modified_cia_formula, $kw45$IGNORE );
      SubLObject cia_arg = NIL;
      cia_arg = cdolist_list_var_$57.first();
      while ( NIL != cdolist_list_var_$57)
      {
        if( cia_arg.isInteger() )
        {
          if( NIL != subl_promotions.memberP( cia_arg, accumulator, UNPROVIDED, UNPROVIDED ) )
          {
            cycleP = T;
            if( NIL != inhibit_cyclesP )
            {
              error_condition = ConsesLow.cons( ConsesLow.list( $kw49$CYCLIC_COMMUTATIVE_IN_ARGS, cia_formula, cia_arg, conses_high.assoc( cia_arg, assoc_list, UNPROVIDED, UNPROVIDED ).rest() ), error_condition );
            }
          }
          if( NIL == subl_promotions.memberP( cia_arg, commutative_argnums, UNPROVIDED, UNPROVIDED ) )
          {
            commutative_argnums = ConsesLow.cons( cia_arg, commutative_argnums );
            accumulator = ConsesLow.cons( cia_arg, accumulator );
            assoc_list = ConsesLow.cons( ConsesLow.cons( cia_arg, cia_formula ), assoc_list );
          }
        }
        cdolist_list_var_$57 = cdolist_list_var_$57.rest();
        cia_arg = cdolist_list_var_$57.first();
      }
      if( NIL != commutative_argnums )
      {
        result = ConsesLow.cons( Sort.sort( commutative_argnums, Symbols.symbol_function( $sym50$_ ), UNPROVIDED ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cia_formula = cdolist_list_var.first();
    }
    if( NIL != cycleP )
    {
      result = list_utilities.union_of_intersecting_sorted_lists( result, UNPROVIDED, UNPROVIDED );
    }
    return Values.values( result, error_condition );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 48372L)
  public static SubLObject cia_formulas(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      final SubLObject cia_assertions = kb_mapping.gather_gaf_arg_index( relation, ONE_INTEGER, $const51$commutativeInArgs, UNPROVIDED, UNPROVIDED );
      final SubLObject cia_rest_assertions = kb_mapping.gather_gaf_arg_index( relation, ONE_INTEGER, $const47$commutativeInArgsAndRest, UNPROVIDED, UNPROVIDED );
      result = list_utilities.nmapcar( Symbols.symbol_function( $sym52$GAF_FORMULA ), ConsesLow.nconc( cia_assertions, cia_rest_assertions ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 48892L)
  public static SubLObject commutative_terms_in_orderP(final SubLObject term1, final SubLObject term2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_vars.$new_canonicalizerP$.getDynamicValue( thread ) )
    {
      return old_commutative_terms_in_orderP( term1, term2 );
    }
    if( NIL != cycl_utilities.hl_term_with_el_counterpart_p( term1 ) )
    {
      return commutative_terms_in_orderP( cycl_utilities.hl_to_el( term1 ), term2 );
    }
    if( NIL != cycl_utilities.hl_term_with_el_counterpart_p( term2 ) )
    {
      return commutative_terms_in_orderP( term1, cycl_utilities.hl_to_el( term2 ) );
    }
    if( term1.isAtom() )
    {
      if( term2.isAtom() )
      {
        return commutative_atoms_in_orderP( term1, term2 );
      }
      return T;
    }
    else
    {
      if( term2.isAtom() )
      {
        return NIL;
      }
      return commutative_formulas_in_orderP( term1, term2 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 49576L)
  public static SubLObject commutative_formulas_in_orderP(final SubLObject formula1, final SubLObject formula2)
  {
    final SubLObject var_num1 = list_utilities.tree_count_if( Symbols.symbol_function( $sym53$EL_VAR_ ), formula1, UNPROVIDED );
    final SubLObject var_num2 = list_utilities.tree_count_if( Symbols.symbol_function( $sym53$EL_VAR_ ), formula2, UNPROVIDED );
    if( var_num1.numL( var_num2 ) )
    {
      return T;
    }
    if( var_num1.numG( var_num2 ) )
    {
      return NIL;
    }
    final SubLObject atom_num1 = list_utilities.tree_count_if( Symbols.symbol_function( $sym54$ATOM ), formula1, UNPROVIDED );
    final SubLObject atom_num2 = list_utilities.tree_count_if( Symbols.symbol_function( $sym54$ATOM ), formula2, UNPROVIDED );
    if( atom_num1.numL( atom_num2 ) )
    {
      return T;
    }
    if( atom_num1.numG( atom_num2 ) )
    {
      return NIL;
    }
    if( cycl_utilities.formula_arg0( formula1 ).equal( cycl_utilities.formula_arg0( formula2 ) ) )
    {
      return commutative_terms_in_orderP( cycl_utilities.formula_args( formula1, UNPROVIDED ), cycl_utilities.formula_args( formula2, UNPROVIDED ) );
    }
    return commutative_terms_in_orderP( cycl_utilities.formula_arg0( formula1 ), cycl_utilities.formula_arg0( formula2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 50372L)
  public static SubLObject canonicalizer_constant_L(final SubLObject constant1, final SubLObject constant2)
  {
    return constants_high.constant_external_id_L( constant1, constant2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 50603L)
  public static SubLObject commutative_atoms_in_orderP(final SubLObject atom1, final SubLObject atom2)
  {
    if( NIL != nart_handles.nart_p( atom1 ) )
    {
      return commutative_terms_in_orderP( narts_high.nart_el_formula( atom1 ), atom2 );
    }
    if( NIL != nart_handles.nart_p( atom2 ) )
    {
      return commutative_terms_in_orderP( atom1, narts_high.nart_el_formula( atom2 ) );
    }
    if( NIL != cycl_variables.kb_varP( atom1 ) )
    {
      return commutative_terms_in_orderP( variables.default_el_var_for_hl_var( atom1 ), atom2 );
    }
    if( NIL != cycl_variables.kb_varP( atom2 ) )
    {
      return commutative_terms_in_orderP( atom1, variables.default_el_var_for_hl_var( atom2 ) );
    }
    if( NIL != constant_handles.constant_p( atom1 ) )
    {
      if( NIL != constant_handles.constant_p( atom2 ) )
      {
        return canonicalizer_constant_L( atom1, atom2 );
      }
      return T;
    }
    else
    {
      if( NIL != constant_handles.constant_p( atom2 ) )
      {
        return NIL;
      }
      if( NIL != cycl_variables.el_varP( atom1 ) )
      {
        if( NIL != cycl_variables.el_varP( atom2 ) )
        {
          el_utilities.el_error( FIVE_INTEGER, $str55$warning__trying_to_sort_the_varia, atom1, atom2, UNPROVIDED );
          return Strings.string_lessp( Symbols.symbol_name( atom1 ), Symbols.symbol_name( atom2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        return T;
      }
      else
      {
        if( NIL != cycl_variables.el_varP( atom2 ) )
        {
          return NIL;
        }
        if( atom1.isSymbol() )
        {
          if( atom2.isSymbol() )
          {
            return Strings.string_lessp( Symbols.symbol_name( atom1 ), Symbols.symbol_name( atom2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          return T;
        }
        else
        {
          if( atom2.isSymbol() )
          {
            return NIL;
          }
          if( atom1.isNumber() )
          {
            if( atom2.isNumber() )
            {
              return Numbers.numL( atom1, atom2 );
            }
            return T;
          }
          else
          {
            if( atom2.isNumber() )
            {
              return NIL;
            }
            if( atom1.isChar() )
            {
              if( atom2.isChar() )
              {
                return Characters.char_lessp( atom1, atom2 );
              }
              return T;
            }
            else
            {
              if( atom2.isChar() )
              {
                return NIL;
              }
              if( atom1.isString() )
              {
                if( atom2.isString() )
                {
                  return Strings.string_lessp( atom1, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                return T;
              }
              else
              {
                if( atom2.isString() )
                {
                  return NIL;
                }
                el_utilities.el_error( FIVE_INTEGER, $str56$warning__trying_to_string_sort_th, atom1, atom2, UNPROVIDED );
                return Strings.string_lessp( string_utilities.str( atom1 ), string_utilities.str( atom2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
          }
        }
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 53020L)
  public static SubLObject canon_term_L(final SubLObject term1, final SubLObject term2)
  {
    return commutative_terms_in_orderP( term1, term2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 53188L)
  public static SubLObject canonicalize_functions_in_clause(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$clause_el_var_names$.currentBinding( thread );
    try
    {
      czer_vars.$clause_el_var_names$.bind( clause_utilities.clause_free_variables( clause, UNPROVIDED, UNPROVIDED ), thread );
      result = add_term_of_unit_lits_1( reify_functions( ConsesLow.list( el_utilities.copy_clause( clause ) ), NIL ).first() );
    }
    finally
    {
      czer_vars.$clause_el_var_names$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 53726L)
  public static SubLObject canonicalize_functions(final SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_vars.$canonicalize_functionsP$.getDynamicValue( thread ) || ( NIL != list_utilities.singletonP( v_clauses ) && NIL != clause_utilities.pos_atomic_cnf_p( v_clauses.first() ) && NIL == el_utilities
        .contains_subformula_p( clause_utilities.gaf_cnf_literal( v_clauses.first() ) ) ) )
    {
      return v_clauses;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $tou_skolem_blist$.currentBinding( thread );
    try
    {
      $tou_skolem_blist$.bind( NIL, thread );
      result = add_term_of_unit_lits( reify_functions( v_clauses, T ) );
    }
    finally
    {
      $tou_skolem_blist$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 54454L)
  public static SubLObject add_term_of_unit_lits(final SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$clause_el_var_names$.currentBinding( thread );
    try
    {
      czer_vars.$clause_el_var_names$.bind( clauses_free_variables( v_clauses ), thread );
      result = ( ( NIL != czer_vars.$add_term_of_unit_litsP$.getDynamicValue( thread ) ) ? list_utilities.nmapcar( Symbols.symbol_function( $sym58$ADD_TERM_OF_UNIT_LITS_1 ), v_clauses ) : v_clauses );
    }
    finally
    {
      czer_vars.$clause_el_var_names$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 54778L)
  public static SubLObject clauses_free_variables(final SubLObject v_clauses)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_clauses;
    SubLObject clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$58 = list_utilities.nmapcar( Symbols.symbol_function( $sym59$STR ), clause_utilities.clause_free_variables( clause, Symbols.symbol_function( $sym53$EL_VAR_ ), UNPROVIDED ) );
      SubLObject var_name = NIL;
      var_name = cdolist_list_var_$58.first();
      while ( NIL != cdolist_list_var_$58)
      {
        final SubLObject item_var = var_name;
        if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          result = ConsesLow.cons( item_var, result );
        }
        cdolist_list_var_$58 = cdolist_list_var_$58.rest();
        var_name = cdolist_list_var_$58.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 55067L)
  public static SubLObject add_term_of_unit_lits_1(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.groundP( clause, Symbols.symbol_function( $sym53$EL_VAR_ ) ) )
    {
      return clause;
    }
    final SubLObject quantified_fn_terms = clause_quantified_fn_terms( clause );
    if( NIL != quantified_fn_terms )
    {
      thread.resetMultipleValues();
      SubLObject neg_lits = clause_utilities.unmake_clause( clause );
      SubLObject pos_lits = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject target_lits = ( NIL != control_vars.within_queryP() ) ? pos_lits : neg_lits;
      SubLObject cdolist_list_var = quantified_fn_terms;
      SubLObject fn_term = NIL;
      fn_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != reifiable_function_term_in_clauseP( fn_term, clause, UNPROVIDED ) )
        {
          if( NIL == czer_utilities.fn_tou_lit( fn_term, target_lits ) )
          {
            target_lits = list_utilities.nadd_to_end( czer_utilities.make_nart_var_tou_lit( fn_term ), target_lits );
          }
        }
        else if( NIL != evaluatable_function_term_in_clauseP( fn_term, clause, UNPROVIDED ) && NIL == czer_utilities.fn_evaluate_lit( fn_term, target_lits, Symbols.symbol_function( $sym60$EQUAL_WRT_SVM ) )
            && NIL != czer_utilities.fn_some_non_evaluatable_referenceP( fn_term, target_lits, Symbols.symbol_function( $sym60$EQUAL_WRT_SVM ) ) )
        {
          target_lits = list_utilities.nadd_to_end( czer_utilities.make_nart_var_evaluate_lit( fn_term ), target_lits );
        }
        cdolist_list_var = cdolist_list_var.rest();
        fn_term = cdolist_list_var.first();
      }
      if( NIL != control_vars.within_queryP() )
      {
        pos_lits = target_lits;
      }
      else
      {
        neg_lits = target_lits;
      }
      return ConsesLow.list( neg_lits, pos_lits );
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 56458L)
  public static SubLObject equal_wrt_svm(final SubLObject object_1, final SubLObject object_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( object_1.equal( object_2 ) || NIL != ( ( NIL != czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) ) ? Equality.equal( el_ununiquify_vars_int( object_1, UNPROVIDED, UNPROVIDED ),
        el_ununiquify_vars_int( object_2, UNPROVIDED, UNPROVIDED ) ) : NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 56870L)
  public static SubLObject reifiable_function_term_in_clauseP(final SubLObject fn_term, final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym53$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_formula_p( fn_term ) )
    {
      final SubLObject fn = cycl_utilities.nat_functor( fn_term );
      if( NIL != czer_utilities.reifiable_functorP( fn, UNPROVIDED ) )
      {
        return T;
      }
      if( NIL != Functions.funcall( varP, fn ) )
      {
        if( NIL != czer_vars.$control_2$.getDynamicValue( thread ) )
        {
          return genls.any_specP( $const61$ReifiableFunction, at_var_types.cnf_variable_isa_constraints( fn, clause, mt_relevance_macros.$mt$.getDynamicValue( thread ) ), UNPROVIDED, UNPROVIDED );
        }
        SubLObject result = genls.any_specP( $const61$ReifiableFunction, at_var_types.cnf_variable_isa_constraints( fn, clause, mt_relevance_macros.$mt$.getDynamicValue( thread ) ), UNPROVIDED, UNPROVIDED );
        if( NIL == result )
        {
          final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding( thread );
          final SubLObject _prev_bind_2 = at_vars.$noting_at_violationsP$.currentBinding( thread );
          try
          {
            wff_vars.$recognize_variablesP$.bind( NIL, thread );
            at_vars.$noting_at_violationsP$.bind( NIL, thread );
            result = genls.any_specP( $const62$CycLReifiableDenotationalTerm, at_utilities.term_requires_isa_in_clause( fn_term, clause, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            at_vars.$noting_at_violationsP$.rebind( _prev_bind_2, thread );
            wff_vars.$recognize_variablesP$.rebind( _prev_bind_0, thread );
          }
        }
        return result;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 57589L)
  public static SubLObject evaluatable_function_term_in_clauseP(final SubLObject fn_term, final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym53$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_formula_p( fn_term ) )
    {
      final SubLObject fn = cycl_utilities.nat_functor( fn_term );
      if( NIL != czer_utilities.evaluatable_function_symbolP( fn, UNPROVIDED ) )
      {
        return T;
      }
      if( NIL != Functions.funcall( varP, fn ) )
      {
        return genls.any_specP( $const63$EvaluatableFunction, at_var_types.cnf_variable_isa_constraints( fn, clause, mt_relevance_macros.$mt$.getDynamicValue( thread ) ), UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 57972L)
  public static SubLObject czer_create_nartP(final SubLObject nat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_create_nartsP() )
    {
      return NIL;
    }
    final SubLObject _prev_bind_0 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
    try
    {
      at_vars.$at_check_arg_typesP$.bind( T, thread );
      return wff.el_wftP( nat, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      at_vars.$at_check_arg_typesP$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 58337L)
  public static SubLObject czer_create_nartsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( ( NIL != control_vars.$within_assert$.getDynamicValue( thread ) && NIL == czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.getDynamicValue( thread ) )
        || ( NIL != czer_vars.$create_narts_regardless_of_whether_within_assertP$.getDynamicValue( thread ) && NIL == czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 58620L)
  public static SubLObject reify_relation_functions_in_mt_list(final SubLObject relation, final SubLObject mt_list, SubLObject reify_relationP)
  {
    if( reify_relationP == UNPROVIDED )
    {
      reify_relationP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym65$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_list, thread );
      result = reify_relation_functions( el_utilities.copy_formula( relation ), reify_relationP );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 59004L)
  public static SubLObject reify_relation_functions(SubLObject relation, SubLObject reify_relationP)
  {
    if( reify_relationP == UNPROVIDED )
    {
      reify_relationP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
    try
    {
      wff_utilities.$check_wff_semanticsP$.bind( T, thread );
      if( NIL != el_utilities.relation_expressionP( relation ) )
      {
        SubLObject functions = NIL;
        SubLObject cdolist_list_var = ConsesLow.cons( relation, relation_terms_to_reify( relation, UNPROVIDED ) );
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == el_utilities.subl_escape_p( relation ) )
          {
            if( !v_term.isAtom() )
            {
              if( NIL != czer_utilities.reifiable_function_termP( v_term, UNPROVIDED ) )
              {
                functions = ConsesLow.cons( v_term, functions );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_term = cdolist_list_var.first();
        }
        if( NIL != functions )
        {
          functions = Sequences.delete_duplicates( functions, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          relation = reify_relation_functions_in( functions, relation, reify_relationP );
        }
        return relation;
      }
      el_utilities.el_error( FOUR_INTEGER, $str66$Tried_to_reify_functions_within__, relation, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_0, thread );
    }
    return relation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 59955L)
  public static SubLObject reify_relation_functions_in(final SubLObject functions, SubLObject relation, final SubLObject reify_relationP)
  {
    SubLObject fns;
    SubLObject fn;
    for( fns = NIL, fn = NIL, fns = functions, fn = fns.first(); NIL != fn; fn = fns.first() )
    {
      relation = reify_relation_function_in( fn, relation, reify_relationP );
      fns = reify_function_in_fns( fn, fns.rest() );
    }
    return relation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 60351L)
  public static SubLObject reify_relation_function_in(final SubLObject fn_term, final SubLObject relation, final SubLObject reify_relationP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_create_nartP( fn_term ) )
    {
      return subst_canon_fn_in_relation( canonicalize_fn_term_if_reified_destructive( fn_term ), fn_term, relation, reify_relationP );
    }
    if( NIL != term.closed_fn_termP( fn_term ) )
    {
      return subst_canon_fn_in_relation( canonicalize_fn_term( fn_term ), fn_term, relation, reify_relationP );
    }
    if( NIL != czer_vars.$recanonicalizingP$.getDynamicValue( thread ) )
    {
      return subst_canon_fn_in_relation( canonicalize_fn_term_if_reified_destructive( fn_term ), fn_term, relation, reify_relationP );
    }
    return relation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 61024L)
  public static SubLObject reify_functions_in_mt(final SubLObject v_clauses, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym67$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      result = reify_functions( el_utilities.copy_clauses( v_clauses ), NIL );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 61286L)
  public static SubLObject reify_functions(SubLObject v_clauses, final SubLObject reify_skolemsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
    try
    {
      wff_utilities.$check_wff_semanticsP$.bind( T, thread );
      SubLObject v_skolems = NIL;
      SubLObject functions = NIL;
      SubLObject cdolist_list_var = list_utilities.mapnunion( Symbols.symbol_function( $sym68$CLAUSE_TERMS_TO_REIFY ), v_clauses, Symbols.symbol_function( EQUAL ) );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == el_utilities.subl_escape_p( v_term ) )
        {
          if( !v_term.isAtom() )
          {
            if( NIL != reify_skolemsP && NIL != term.skolem_fn_functionP( cycl_utilities.nat_functor( v_term ) ) )
            {
              v_skolems = ConsesLow.cons( v_term, v_skolems );
            }
            else if( NIL != czer_utilities.reifiable_function_termP( v_term, UNPROVIDED ) )
            {
              functions = ConsesLow.cons( v_term, functions );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
      if( NIL != functions )
      {
        functions = Sort.sort( functions, Symbols.symbol_function( $sym50$_ ), $sym69$TERM_RELATIONAL_COMPLEXITY );
        v_clauses = reify_functions_in( functions, v_clauses );
      }
      if( NIL != v_skolems )
      {
        SubLObject error = NIL;
        try
        {
          thread.throwStack.push( $kw70$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE );
          v_clauses = skolems.reify_skolems_in( v_skolems, v_clauses, mt_relevance_macros.$mt$.getDynamicValue( thread ), control_vars.$within_assert$.getDynamicValue( thread ) );
        }
        catch( final Throwable ccatch_env_var )
        {
          error = Errors.handleThrowable( ccatch_env_var, $kw70$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != error )
        {
          if( NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue( thread ) )
          {
            wff.note_wff_violation( ConsesLow.list( $kw71$TOO_MANY_SEQUENCE_VARS_IN_SCOPE_OF_SKOLEM, error ) );
          }
          return NIL;
        }
      }
      return v_clauses;
    }
    finally
    {
      wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 62313L)
  public static SubLObject reify_functions_in(final SubLObject functions, SubLObject v_clauses)
  {
    SubLObject fns;
    SubLObject fn;
    for( fns = NIL, fn = NIL, fns = functions, fn = fns.first(); NIL != fn; fn = fns.first() )
    {
      v_clauses = reify_function_in_destructive( fn, v_clauses );
      fns = reify_function_in_fns( fn, fns.rest() );
    }
    return v_clauses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 62615L)
  public static SubLObject reify_function_in_fns(final SubLObject fn_term, final SubLObject fns)
  {
    if( NIL == czer_create_nartP( fn_term ) )
    {
      return conses_high.subst( canonicalize_fn_term_if_reified_destructive( fn_term ), fn_term, fns, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    if( NIL == term.closed_fn_termP( fn_term ) )
    {
      return fns;
    }
    return conses_high.subst( canonicalize_fn_term( fn_term ), fn_term, fns, Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 63335L)
  public static SubLObject reify_function_in(final SubLObject fn_term, final SubLObject v_clauses)
  {
    return reify_function_in_destructive( el_utilities.copy_formula( fn_term ), el_utilities.copy_clauses( v_clauses ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 63505L)
  public static SubLObject reify_function_in_destructive(final SubLObject fn_term, final SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_create_nartP( fn_term ) )
    {
      return subst_canon_fn_in_clauses( canonicalize_fn_term_if_reified( fn_term ), fn_term, v_clauses );
    }
    if( NIL != term.closed_fn_termP( fn_term ) )
    {
      return subst_canon_fn_in_clauses( canonicalize_fn_term( fn_term ), fn_term, v_clauses );
    }
    if( NIL != czer_vars.$recanonicalizingP$.getDynamicValue( thread ) )
    {
      return subst_canon_fn_in_clauses( canonicalize_fn_term_if_reified( fn_term ), fn_term, v_clauses );
    }
    return v_clauses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 64168L)
  public static SubLObject canonicalize_fn_term_if_reified(final SubLObject fn_term)
  {
    return canonicalize_fn_term_if_reified_destructive( el_utilities.copy_formula( fn_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 64428L)
  public static SubLObject canonicalize_fn_term_if_reified_destructive(SubLObject fn_term)
  {
    SubLObject result = fn_term;
    if( NIL != list_utilities.proper_list_p( fn_term ) && NIL != fort_types_interface.reifiable_function_p( cycl_utilities.nat_functor( fn_term ) ) )
    {
      SubLObject cdolist_list_var = nested_fn_terms( fn_term );
      SubLObject nested_fn_term = NIL;
      nested_fn_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != czer_utilities.reifiable_function_termP( nested_fn_term, UNPROVIDED ) )
        {
          final SubLObject v_new = canonicalize_fn_term_if_reified_destructive( nested_fn_term );
          if( !v_new.equal( nested_fn_term ) )
          {
            fn_term = conses_high.nsubst( v_new, nested_fn_term, fn_term, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        nested_fn_term = cdolist_list_var.first();
      }
      if( NIL != term.closed_nautP( fn_term, UNPROVIDED ) )
      {
        final SubLObject nart = czer_utilities.el_find_nart( fn_term );
        if( NIL != nart )
        {
          result = nart;
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 65123L)
  public static SubLObject canonicalize_fn_term(final SubLObject fn_term)
  {
    return canonicalize_fn_term_int( fn_term, NIL, T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 65221L)
  public static SubLObject cyc_find_or_create_nart(final SubLObject naut, SubLObject assume_all_reifiableP)
  {
    if( assume_all_reifiableP == UNPROVIDED )
    {
      assume_all_reifiableP = NIL;
    }
    return canonicalize_fn_term_int( naut, T, T, assume_all_reifiableP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 65652L)
  public static SubLObject low_find_or_create_nart(final SubLObject naut)
  {
    core.ensure_bootstrapping_kb();
    return canonicalize_fn_term_int( naut, NIL, T, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 65779L)
  public static SubLObject canonicalize_fn_term_int(SubLObject fn_term, final SubLObject czeP, final SubLObject createP, SubLObject assume_all_reifiableP)
  {
    if( assume_all_reifiableP == UNPROVIDED )
    {
      assume_all_reifiableP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != nart_handles.nart_p( fn_term ) )
    {
      return fn_term;
    }
    if( NIL != assume_all_reifiableP )
    {
      core.ensure_bootstrapping_kb();
    }
    SubLObject replaced_nested_fn_termP = NIL;
    SubLObject cdolist_list_var = Sort.sort( nested_fn_terms( fn_term ), Symbols.symbol_function( $sym72$_ ), $sym73$TERM_FUNCTIONAL_COMPLEXITY );
    SubLObject nested_fn_term = NIL;
    nested_fn_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_new = canonicalize_fn_term_int( nested_fn_term, czeP, createP, assume_all_reifiableP );
      if( !v_new.equal( nested_fn_term ) )
      {
        replaced_nested_fn_termP = T;
        fn_term = conses_high.subst( v_new, nested_fn_term, fn_term, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      nested_fn_term = cdolist_list_var.first();
    }
    if( NIL != czeP || NIL != el_utilities.el_set_p( fn_term ) )
    {
      fn_term = canonicalize_naut( fn_term );
    }
    if( NIL != assume_all_reifiableP || NIL != czer_utilities.reifiable_function_termP( fn_term, UNPROVIDED ) )
    {
      final SubLObject fn_term_ununiquified = el_ununiquify_vars_int( fn_term, NIL, T );
      if( NIL != createP )
      {
        final SubLObject _prev_bind_0 = czer_vars.$fi_last_assertions_asserted$.currentBinding( thread );
        try
        {
          czer_vars.$fi_last_assertions_asserted$.bind( NIL, thread );
          return cyc_find_or_create_canonical_nart( fn_term_ununiquified );
        }
        finally
        {
          czer_vars.$fi_last_assertions_asserted$.rebind( _prev_bind_0, thread );
        }
      }
      final SubLObject nart = narts_high.nart_lookup( fn_term_ununiquified );
      return ( NIL != nart ) ? nart : fn_term;
    }
    return fn_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 68079L)
  public static SubLObject canonicalize_naut(final SubLObject naut)
  {
    return canonicalize_relation_commutative_terms( naut );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 68287L)
  public static SubLObject cyc_find_or_create_canonical_nart(final SubLObject canonical_naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject nart = narts_high.nart_lookup( canonical_naut );
    if( NIL == nart_handles.valid_nartP( nart, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = czer_vars.$within_canonicalizerP$.currentBinding( thread );
      try
      {
        wff_vars.$within_wffP$.bind( NIL, thread );
        czer_vars.$within_canonicalizerP$.bind( NIL, thread );
        if( NIL != nart_handles.nart_p( nart ) )
        {
          narts_high.cleanup_invalid_nart( canonical_naut );
        }
        nart = cyc_create_nart( canonical_naut );
      }
      finally
      {
        czer_vars.$within_canonicalizerP$.rebind( _prev_bind_2, thread );
        wff_vars.$within_wffP$.rebind( _prev_bind_0, thread );
      }
    }
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 68635L)
  public static SubLObject clear_nart_defining_rules_cached()
  {
    final SubLObject cs = $nart_defining_rules_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 68635L)
  public static SubLObject remove_nart_defining_rules_cached(SubLObject bootstrapping_kbP)
  {
    if( bootstrapping_kbP == UNPROVIDED )
    {
      bootstrapping_kbP = control_vars.$bootstrapping_kbP$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $nart_defining_rules_cached_caching_state$.getGlobalValue(), ConsesLow.list( bootstrapping_kbP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 68635L)
  public static SubLObject nart_defining_rules_cached_internal(final SubLObject bootstrapping_kbP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != bootstrapping_kbP )
    {
      return NIL;
    }
    SubLObject definitional_rules = NIL;
    SubLObject wff_rules = NIL;
    SubLObject fcp_rules = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym67$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( $const75$BaseKB, thread );
      SubLObject cdolist_list_var = $list79;
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( pred, $kw35$NEG, $kw76$FORWARD ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( pred, $kw35$NEG, $kw76$FORWARD );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw77$RULE, NIL, $kw76$FORWARD );
                SubLObject done_var_$59 = NIL;
                final SubLObject token_var_$60 = NIL;
                while ( NIL == done_var_$59)
                {
                  final SubLObject rule = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$60 );
                  final SubLObject valid_$61 = makeBoolean( !token_var_$60.eql( rule ) );
                  if( NIL != valid_$61 )
                  {
                    final SubLObject pos_lits = pragma_induction.rule_pos_lits( rule );
                    SubLObject rule_addedP = NIL;
                    if( NIL == rule_addedP )
                    {
                      SubLObject csome_list_var = Sequences.reverse( sbhl_module_utilities.get_sbhl_predicates() );
                      SubLObject v_term = NIL;
                      v_term = csome_list_var.first();
                      while ( NIL == rule_addedP && NIL != csome_list_var)
                      {
                        if( NIL != list_utilities.tree_find( v_term, pos_lits, UNPROVIDED, UNPROVIDED ) )
                        {
                          definitional_rules = ConsesLow.cons( rule, definitional_rules );
                          rule_addedP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                      }
                    }
                    if( NIL == rule_addedP )
                    {
                      SubLObject csome_list_var = isa.all_instances_in_all_mts( $const78$WFFConstraintPredicate );
                      SubLObject v_term = NIL;
                      v_term = csome_list_var.first();
                      while ( NIL == rule_addedP && NIL != csome_list_var)
                      {
                        if( NIL != list_utilities.tree_find( v_term, pos_lits, UNPROVIDED, UNPROVIDED ) )
                        {
                          wff_rules = ConsesLow.cons( rule, wff_rules );
                          rule_addedP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                      }
                    }
                    if( NIL == list_utilities.tree_find_if( $sym11$FORT_P, pos_lits, UNPROVIDED ) )
                    {
                      fcp_rules = ConsesLow.cons( rule, fcp_rules );
                      rule_addedP = T;
                    }
                  }
                  done_var_$59 = makeBoolean( NIL == valid_$61 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$62, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ConsesLow.append( definitional_rules, wff_rules, fcp_rules );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 68635L)
  public static SubLObject nart_defining_rules_cached(SubLObject bootstrapping_kbP)
  {
    if( bootstrapping_kbP == UNPROVIDED )
    {
      bootstrapping_kbP = control_vars.$bootstrapping_kbP$.getDynamicValue();
    }
    SubLObject caching_state = $nart_defining_rules_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym74$NART_DEFINING_RULES_CACHED, $sym80$_NART_DEFINING_RULES_CACHED_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, bootstrapping_kbP, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( nart_defining_rules_cached_internal( bootstrapping_kbP ) ) );
      memoization_state.caching_state_put( caching_state, bootstrapping_kbP, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 69929L)
  public static SubLObject cyc_create_nart(final SubLObject canonical_naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue( thread ) )
    {
      kb_control_vars.record_hl_transcript_operation( ConsesLow.list( $sym81$TL_FIND_OR_CREATE_NART, list_utilities.quotify( canonical_naut ) ) );
    }
    final SubLObject nart = narts_interface.kb_create_nart( canonical_naut );
    final SubLObject tou_assertion = function_terms.term_of_unit_assertion( nart );
    final SubLObject nart_defining_rules = nart_defining_rules_cached( UNPROVIDED );
    if( NIL == $czer_create_nart_uses_nart_defining_rules_methodP$.getDynamicValue( thread ) || NIL == nart_defining_rules || NIL == tou_assertion )
    {
      cyc_kernel.cyc_assert_wff( el_utilities.make_binary_formula( $const82$termOfUnit, nart, canonical_naut ), mt_vars.$tou_mt$.getGlobalValue(), $list83 );
    }
    else
    {
      assertions_interface.kb_create_asserted_argument( tou_assertion, $kw84$TRUE, $kw85$MONOTONIC );
      forward.forward_propagate_one_assertion_wrt_rules_and_queue_or_repropagate_assertibles( tou_assertion, nart_defining_rules, UNPROVIDED );
    }
    return nart;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 71248L)
  public static SubLObject new_canonicalize_fn_term(SubLObject fn_term)
  {
    SubLObject cdolist_list_var = new_nested_fn_terms( fn_term );
    SubLObject nested_fn_term = NIL;
    nested_fn_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term.function_termP( nested_fn_term ) )
      {
        final SubLObject v_new = new_canonicalize_fn_term( nested_fn_term );
        if( !v_new.equal( nested_fn_term ) )
        {
          fn_term = conses_high.subst( v_new, nested_fn_term, fn_term, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      nested_fn_term = cdolist_list_var.first();
    }
    if( NIL != czer_utilities.reifiable_function_termP( fn_term, UNPROVIDED ) )
    {
      return cyc_find_or_create_nart( fn_term, UNPROVIDED );
    }
    return fn_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 71800L)
  public static SubLObject new_nested_fn_terms(final SubLObject fn_term)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = fn_term;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term.function_termP( arg ) )
      {
        result = ConsesLow.cons( arg, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 71978L)
  public static SubLObject nested_fn_terms(final SubLObject fn_term)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = fn_term;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term.function_termP( arg ) )
      {
        result = ConsesLow.cons( arg, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 72232L)
  public static SubLObject all_nested_fn_terms(final SubLObject fn_term)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = fn_term;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term.function_termP( arg ) )
      {
        result = ConsesLow.cons( arg, result );
        SubLObject cdolist_list_var_$63 = nested_fn_terms( arg );
        SubLObject nested_fn_term = NIL;
        nested_fn_term = cdolist_list_var_$63.first();
        while ( NIL != cdolist_list_var_$63)
        {
          result = ConsesLow.cons( nested_fn_term, result );
          cdolist_list_var_$63 = cdolist_list_var_$63.rest();
          nested_fn_term = cdolist_list_var_$63.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 72483L)
  public static SubLObject fort_sort_by_type_and_id(final SubLObject v_forts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.every_in_list( Symbols.symbol_function( $sym11$FORT_P ), v_forts, UNPROVIDED ) )
    {
      Errors.error( $str86$SORT_BY_ID_called_on_list_contain );
    }
    return Sort.sort( conses_high.copy_list( v_forts ), Symbols.symbol_function( $sym87$FORT_TYPE_AND_ID__ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 72780L)
  public static SubLObject fort_type_and_id_L(final SubLObject fort_1, final SubLObject fort_2)
  {
    if( NIL != constant_handles.constant_p( fort_1 ) && NIL != constant_handles.constant_p( fort_2 ) )
    {
      return canonicalizer_constant_L( fort_1, fort_2 );
    }
    if( NIL != nart_handles.nart_p( fort_1 ) && NIL != nart_handles.nart_p( fort_2 ) )
    {
      return Numbers.numL( nart_handles.nart_id( fort_1 ), nart_handles.nart_id( fort_2 ) );
    }
    return constant_handles.constant_p( fort_1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 73064L)
  public static SubLObject clause_quantified_fn_terms(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$gathering_quantified_fn_termsP$.currentBinding( thread );
    try
    {
      czer_vars.$gathering_quantified_fn_termsP$.bind( T, thread );
      result = conses_high.union( literals_quantified_fn_terms( clauses.neg_lits( clause ) ), literals_quantified_fn_terms( clauses.pos_lits( clause ) ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    finally
    {
      czer_vars.$gathering_quantified_fn_termsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 73504L)
  public static SubLObject literals_quantified_fn_terms(final SubLObject literals)
  {
    return list_utilities.mapappend( Symbols.symbol_function( $sym88$LITERAL_QUANTIFIED_FN_TERMS ), literals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 73766L)
  public static SubLObject literal_quantified_fn_terms(final SubLObject literal)
  {
    return Sequences.delete_if( Symbols.symbol_function( $sym89$NO_FREE_VARIABLES_ ), literal_terms_to_reify( literal, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 74011L)
  public static SubLObject clause_terms_to_reify(final SubLObject clause)
  {
    return conses_high.nunion( list_utilities.mapunion( Symbols.symbol_function( $sym90$LITERAL_TERMS_TO_REIFY ), clauses.neg_lits( clause ), Symbols.symbol_function( EQUAL ) ), list_utilities.mapunion( Symbols
        .symbol_function( $sym90$LITERAL_TERMS_TO_REIFY ), clauses.pos_lits( clause ), Symbols.symbol_function( EQUAL ) ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 74257L)
  public static SubLObject literal_terms_to_reify(final SubLObject literal, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject result = relation_terms_to_reify( literal, mt );
    if( NIL != reify_termP( literal, mt ) && NIL == conses_high.member( literal, result, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      result = ConsesLow.cons( literal, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 74560L)
  public static SubLObject function_terms_to_reify(final SubLObject nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return relation_terms_to_reify( nat, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 74669L)
  public static SubLObject relation_terms_to_reify(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_formula_p( relation ) && NIL == guaranteed_nothing_to_reifyP( relation ) && NIL != el_utilities.el_relation_expressionP( relation ) )
    {
      SubLObject result = NIL;
      SubLObject pos = ZERO_INTEGER;
      final SubLObject reln = cycl_utilities.formula_arg0( relation );
      if( NIL == czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue( thread ) || !reln.eql( $const91$evaluate ) )
      {
        SubLObject cdolist_list_var = cycl_utilities.formula_terms( relation, UNPROVIDED );
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject arg_isa_pred = ( NIL != forts.fort_p( reln ) ) ? kb_accessors.arg_isa_pred( pos, reln, mt ) : NIL;
          final SubLObject _prev_bind_0 = wff_vars.$permit_generic_arg_variablesP$.currentBinding( thread );
          final SubLObject _prev_bind_2 = wff_vars.$permit_keyword_variablesP$.currentBinding( thread );
          try
          {
            wff_vars.$permit_generic_arg_variablesP$.bind( makeBoolean( NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue( thread ) || NIL != at_utilities.reln_permits_generic_arg_variablesP( reln,
                arg_isa_pred ) ), thread );
            wff_vars.$permit_keyword_variablesP$.bind( makeBoolean( NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue( thread ) || NIL != at_utilities.reln_permits_keyword_variablesP( reln, arg_isa_pred ) ),
                thread );
            if( NIL != reify_argP( v_term, reln, pos, mt ) )
            {
              result = ConsesLow.cons( v_term, result );
            }
            if( NIL == czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue( thread ) || NIL == el_utilities.scoping_relation_expressionP( v_term ) )
            {
              if( NIL == czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue( thread ) || NIL == czer_utilities.evaluatable_function_termP( v_term, mt ) )
              {
                if( NIL == dont_reify_arg_or_subtermsP( v_term, reln, pos, mt ) )
                {
                  if( NIL != term.nautP( v_term, UNPROVIDED ) )
                  {
                    result = list_utilities.ordered_union( result, relation_terms_to_reify( v_term, mt ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                  }
                  else if( NIL != term.sentenceP( v_term, UNPROVIDED ) )
                  {
                    result = list_utilities.ordered_union( result, relation_terms_to_reify( v_term, mt ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                  }
                  else if( NIL != el_utilities.literalP( v_term ) )
                  {
                    result = list_utilities.ordered_union( result, literal_terms_to_reify( v_term, mt ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                  }
                }
              }
            }
          }
          finally
          {
            wff_vars.$permit_keyword_variablesP$.rebind( _prev_bind_2, thread );
            wff_vars.$permit_generic_arg_variablesP$.rebind( _prev_bind_0, thread );
          }
          pos = Numbers.add( pos, ONE_INTEGER );
          cdolist_list_var = cdolist_list_var.rest();
          v_term = cdolist_list_var.first();
        }
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 76553L)
  public static SubLObject guaranteed_nothing_to_reifyP(final SubLObject formula)
  {
    return makeBoolean( NIL != cycl_grammar.fast_cycl_quoted_term_p( formula ) || NIL == el_utilities.contains_subformula_p( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 76918L)
  public static SubLObject reify_argP(final SubLObject v_term, final SubLObject pred, final SubLObject pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( v_term.isAtom() )
    {
      return NIL;
    }
    if( NIL != el_utilities.arg_types_prescribe_unreifiedP( pred, pos ) )
    {
      return NIL;
    }
    if( NIL != dont_reify_arg_or_subtermsP( v_term, pred, pos, mt ) )
    {
      return NIL;
    }
    return reify_termP( v_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 77224L)
  public static SubLObject dont_reify_arg_or_subtermsP(final SubLObject v_term, final SubLObject pred, final SubLObject pos, final SubLObject mt)
  {
    if( pred.eql( $const92$ExpandSubLFn ) )
    {
      return T;
    }
    if( pred.eql( $const93$SubLQuoteFn ) )
    {
      return T;
    }
    if( NIL != czer_utilities.leave_some_terms_at_el_for_argP( pred, pos, mt ) )
    {
      return T;
    }
    if( NIL == el_utilities.groundP( v_term, UNPROVIDED ) && NIL != czer_utilities.leave_variables_at_el_for_argP( pred, pos, mt ) && NIL == el_utilities.closedP( v_term, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 77777L)
  public static SubLObject reify_termP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( v_term.isAtom() )
    {
      return NIL;
    }
    if( NIL != term.unreified_skolem_termP( v_term ) )
    {
      return czer_vars.$reify_skolemsP$.getDynamicValue( thread );
    }
    if( NIL != czer_utilities.reifiable_function_termP( v_term, mt ) )
    {
      if( NIL != kb_control_vars.within_forward_inferenceP() )
      {
        return forward_inference_reifiable_function_termP( v_term, mt );
      }
      return T;
    }
    else
    {
      if( NIL != czer_utilities.evaluatable_function_termP( v_term, mt ) )
      {
        return T;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 78244L)
  public static SubLObject forward_inference_reifiable_function_termP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return forward_inference_reifiable_functionP( cycl_utilities.nat_functor( v_term ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 78397L)
  public static SubLObject forward_inference_reifiable_functionP(final SubLObject function, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule = forward.current_forward_inference_rule();
    return makeBoolean( NIL != control_vars.$prefer_forward_skolemization$.getDynamicValue( thread ) || NIL != kb_accessors.skolemize_forwardP( function, mt ) || ( NIL != rule && NIL != kb_accessors
        .forward_reification_ruleP( function, rule, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 78687L)
  public static SubLObject subst_canon_fn_in_clauses(final SubLObject new_fn, final SubLObject old_fn, final SubLObject v_clauses)
  {
    if( new_fn.equal( old_fn ) )
    {
      return v_clauses;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_clauses;
    SubLObject clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( subst_canon_fn_in_clause( new_fn, old_fn, clause ), result );
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 78953L)
  public static SubLObject subst_canon_fn_in_clause(final SubLObject new_fn, final SubLObject old_fn, final SubLObject clause)
  {
    SubLObject result_pos = NIL;
    SubLObject result_neg = NIL;
    SubLObject cdolist_list_var = clauses.pos_lits( clause );
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result_pos = ConsesLow.cons( subst_canon_fn_in_literal( new_fn, old_fn, lit ), result_pos );
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    cdolist_list_var = clauses.neg_lits( clause );
    lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result_neg = ConsesLow.cons( subst_canon_fn_in_literal( new_fn, old_fn, lit ), result_neg );
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    return ConsesLow.list( Sequences.nreverse( result_neg ), Sequences.nreverse( result_pos ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 79331L)
  public static SubLObject subst_canon_fn_in_relation(final SubLObject new_fn, final SubLObject old_fn, final SubLObject relation, SubLObject replace_entire_relationP)
  {
    if( replace_entire_relationP == UNPROVIDED )
    {
      replace_entire_relationP = NIL;
    }
    if( NIL != replace_entire_relationP && relation.equal( old_fn ) )
    {
      return new_fn;
    }
    final SubLObject reln = cycl_utilities.formula_arg0( relation );
    final SubLObject sequence_var = el_utilities.sequence_var( relation, UNPROVIDED );
    SubLObject pos = ZERO_INTEGER;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cycl_utilities.formula_terms( relation, UNPROVIDED );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == el_utilities.subl_escape_p( relation ) )
      {
        if( NIL == sequence_var || !v_term.equal( sequence_var ) )
        {
          if( v_term.equal( old_fn ) && NIL != reify_argP( v_term, reln, pos, UNPROVIDED ) )
          {
            result = ConsesLow.cons( new_fn, result );
          }
          else if( NIL != el_utilities.literalP( v_term ) )
          {
            result = ConsesLow.cons( subst_canon_fn_in_literal( new_fn, old_fn, v_term ), result );
          }
          else if( NIL != term.nautP( v_term, UNPROVIDED ) )
          {
            result = ConsesLow.cons( subst_canon_fn_in_nat( new_fn, old_fn, v_term ), result );
          }
          else if( NIL != term.sentenceP( v_term, UNPROVIDED ) && NIL != el_utilities.el_relation_expressionP( v_term ) )
          {
            result = ConsesLow.cons( subst_canon_fn_in_relation( new_fn, old_fn, v_term, UNPROVIDED ), result );
          }
          else
          {
            result = ConsesLow.cons( v_term, result );
          }
        }
      }
      pos = Numbers.add( pos, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    result = Sequences.nreverse( result );
    if( NIL != sequence_var )
    {
      result = el_utilities.nadd_sequence_var_to_end( sequence_var, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 80362L)
  public static SubLObject subst_canon_fn_in_literal(final SubLObject new_fn, final SubLObject old_fn, final SubLObject literal)
  {
    return subst_canon_fn_in_relation( new_fn, old_fn, literal, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 80489L)
  public static SubLObject subst_canon_fn_in_nat(final SubLObject new_fn, final SubLObject old_fn, final SubLObject nat)
  {
    final SubLObject functor = cycl_utilities.nat_functor( nat );
    final SubLObject sequence_var = el_utilities.sequence_var( nat, UNPROVIDED );
    SubLObject pos = ZERO_INTEGER;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cycl_utilities.formula_terms( nat, UNPROVIDED );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == sequence_var || !v_term.equal( sequence_var ) )
      {
        if( v_term.equal( old_fn ) && NIL != reify_argP( v_term, functor, pos, UNPROVIDED ) )
        {
          result = ConsesLow.cons( new_fn, result );
        }
        else if( NIL != el_utilities.literalP( v_term ) )
        {
          result = ConsesLow.cons( subst_canon_fn_in_literal( new_fn, old_fn, v_term ), result );
        }
        else if( NIL != term.nautP( v_term, UNPROVIDED ) )
        {
          result = ConsesLow.cons( subst_canon_fn_in_nat( new_fn, old_fn, v_term ), result );
        }
        else if( NIL != term.sentenceP( v_term, UNPROVIDED ) && NIL != el_utilities.el_relation_expressionP( v_term ) )
        {
          result = ConsesLow.cons( subst_canon_fn_in_relation( new_fn, old_fn, v_term, UNPROVIDED ), result );
        }
        else
        {
          result = ConsesLow.cons( v_term, result );
        }
      }
      pos = Numbers.add( pos, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    result = Sequences.nreverse( result );
    if( NIL != sequence_var )
    {
      result = el_utilities.nadd_sequence_var_to_end( sequence_var, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 81339L)
  public static SubLObject canonicalize_clauses_transformable_nats(final SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != czer_vars.$canonicalize_functionsP$.getDynamicValue( thread ) )
    {
      return list_utilities.nmapcar( Symbols.symbol_function( $sym94$CANONICALIZE_CLAUSE_TRANSFORMABLE_NATS ), v_clauses );
    }
    return v_clauses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 81694L)
  public static SubLObject canonicalize_clause_transformable_nats(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject termXnats = nat_atoms( clause );
    if( NIL != termXnats )
    {
      final SubLObject neg_lits = clauses.neg_lits( clause );
      final SubLObject pos_lits = clauses.pos_lits( clause );
      SubLObject result = NIL;
      final SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
      try
      {
        at_vars.$appraising_disjunctP$.bind( makeBoolean( NIL != at_vars.$appraising_disjunctP$.getDynamicValue( thread ) || ( NIL != neg_lits && NIL != pos_lits ) ), thread );
        czer_vars.$standardize_variables_memory$.bind( dwim_svm_wrt_scoping( czer_vars.$standardize_variables_memory$.getDynamicValue( thread ), neg_lits, pos_lits ), thread );
        result = clauses.make_cnf( canonicalize_literals_transformable_nats( termXnats, neg_lits ), canonicalize_literals_transformable_nats( termXnats, pos_lits ) );
      }
      finally
      {
        czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
        at_vars.$appraising_disjunctP$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 82431L)
  public static SubLObject nat_atoms(final SubLObject clause)
  {
    SubLObject termXnats = NIL;
    SubLObject cdolist_list_var = ( NIL != control_vars.within_queryP() ) ? clauses.pos_lits( clause ) : clauses.neg_lits( clause );
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != nat_transforming_litP( lit ) )
      {
        termXnats = ConsesLow.cons( el_utilities.literal_args( lit, UNPROVIDED ), termXnats );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    return Sequences.nreverse( termXnats );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 82678L)
  public static SubLObject canonicalize_literals_transformable_nats(final SubLObject termXnats, final SubLObject literals)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$appraising_disjunctP$.currentBinding( thread );
    try
    {
      at_vars.$appraising_disjunctP$.bind( makeBoolean( NIL != at_vars.$appraising_disjunctP$.getDynamicValue( thread ) || NIL == list_utilities.singletonP( literals ) ), thread );
      SubLObject cdolist_list_var = Sequences.reverse( literals );
      SubLObject literal = NIL;
      literal = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject arg1 = el_utilities.literal_arg1( literal, UNPROVIDED );
        SubLObject termXnats_undone;
        SubLObject termXnat;
        SubLObject current;
        SubLObject datum;
        SubLObject v_term;
        SubLObject nat;
        SubLObject new_literal;
        SubLObject cdolist_list_var_$64;
        SubLObject result_lit;
        for( termXnats_undone = NIL, termXnat = NIL, termXnats_undone = termXnats, termXnat = termXnats_undone.first(); NIL != termXnat; termXnat = termXnats_undone.first() )
        {
          datum = ( current = termXnat );
          v_term = NIL;
          nat = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
          v_term = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
          nat = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL == nat_transforming_litP( literal ) || ( !arg1.eql( v_term ) && NIL == subl_promotions.memberP( arg1, termXnats_undone, EQL, $sym96$CAR ) ) )
            {
              new_literal = conses_high.subst( v_term, nat, literal, Symbols.symbol_function( $sym60$EQUAL_WRT_SVM ), UNPROVIDED );
              if( NIL != czer_utilities.canon_varP( new_literal ) )
              {
                new_literal = czer_utilities.encapsulate_formula( new_literal, UNPROVIDED );
              }
              if( NIL != wff.el_wff_syntaxP( new_literal, UNPROVIDED ) && NIL != wff.semantically_wf_literalP( new_literal, UNPROVIDED ) && NIL == destructive_nat_transforming_litP( new_literal, literals )
                  && ( NIL != list_utilities.dotted_list_p( literal ) || NIL == list_utilities.dotted_list_p( new_literal ) ) )
              {
                termXnats_undone = conses_high.subst( v_term, nat, termXnats_undone, Symbols.symbol_function( EQUAL ), UNPROVIDED );
                literal = new_literal;
                cdolist_list_var_$64 = result;
                result_lit = NIL;
                result_lit = cdolist_list_var_$64.first();
                while ( NIL != cdolist_list_var_$64)
                {
                  if( NIL != nat_transforming_litP( result_lit ) )
                  {
                    conses_high.nsubst( v_term, nat, el_utilities.literal_arg2( result_lit, UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
                  }
                  cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                  result_lit = cdolist_list_var_$64.first();
                }
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list95 );
          }
          termXnats_undone = termXnats_undone.rest();
        }
        result = ConsesLow.cons( literal, result );
        cdolist_list_var = cdolist_list_var.rest();
        literal = cdolist_list_var.first();
      }
    }
    finally
    {
      at_vars.$appraising_disjunctP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 84383L)
  public static SubLObject nat_transforming_litP(final SubLObject literal)
  {
    return makeBoolean( NIL != el_utilities.tou_litP( literal ) || NIL != el_utilities.evaluate_litP( literal, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 84661L)
  public static SubLObject possibly_nat_transforming_litP(final SubLObject literal)
  {
    return cycl_utilities.atomic_sentence_with_any_of_preds_p( literal, $list97 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 84989L)
  public static SubLObject destructive_nat_transforming_litP(final SubLObject test_literal, final SubLObject literals)
  {
    if( NIL != cycl_utilities.atomic_sentence_with_any_of_preds_p( test_literal, $list97 ) )
    {
      SubLObject test_literal_copy = conses_high.copy_list( test_literal );
      SubLObject cdolist_list_var = literals;
      SubLObject literal = NIL;
      literal = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != cycl_utilities.atomic_sentence_with_any_of_preds_p( literal, $list97 ) )
        {
          test_literal_copy = list_utilities.find_and_nreplace( el_utilities.literal_arg1( literal, UNPROVIDED ), el_utilities.literal_arg2( literal, UNPROVIDED ), test_literal_copy, UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        literal = cdolist_list_var.first();
      }
      if( el_utilities.literal_arg1( test_literal_copy, UNPROVIDED ).equal( el_utilities.literal_arg2( test_literal_copy, UNPROVIDED ) ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 85825L)
  public static SubLObject dwim_svm_wrt_scoping(final SubLObject svm, final SubLObject neg_lits, final SubLObject pos_lits)
  {
    SubLObject dwimmed_svm = NIL;
    SubLObject cdolist_list_var = svm;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject old_var = NIL;
      SubLObject new_var = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
      old_var = current.first();
      current = ( new_var = current.rest() );
      SubLObject scopedP = NIL;
      if( NIL == scopedP )
      {
        SubLObject csome_list_var = neg_lits;
        SubLObject literal = NIL;
        literal = csome_list_var.first();
        while ( NIL == scopedP && NIL != csome_list_var)
        {
          if( NIL != var_is_scoped_in_literalP( new_var, literal ) )
          {
            scopedP = T;
          }
          csome_list_var = csome_list_var.rest();
          literal = csome_list_var.first();
        }
      }
      if( NIL == scopedP )
      {
        SubLObject csome_list_var = pos_lits;
        SubLObject literal = NIL;
        literal = csome_list_var.first();
        while ( NIL == scopedP && NIL != csome_list_var)
        {
          if( NIL != var_is_scoped_in_literalP( new_var, literal ) )
          {
            scopedP = T;
          }
          csome_list_var = csome_list_var.rest();
          literal = csome_list_var.first();
        }
      }
      if( NIL != scopedP )
      {
        dwimmed_svm = ConsesLow.cons( pair, dwimmed_svm );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return Sequences.nreverse( dwimmed_svm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 86677L)
  public static SubLObject var_is_scoped_in_literalP(final SubLObject var, final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject resultP = NIL;
    final SubLObject _prev_bind_0 = $var_is_scoped_in_formula_var$.currentBinding( thread );
    try
    {
      $var_is_scoped_in_formula_var$.bind( var, thread );
      resultP = list_utilities.sublisp_boolean( cycl_utilities.expression_find_if( $sym99$VAR_IS_SCOPED_IN_FORMULA_, literal, NIL, UNPROVIDED ) );
    }
    finally
    {
      $var_is_scoped_in_formula_var$.rebind( _prev_bind_0, thread );
    }
    return resultP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 86986L)
  public static SubLObject var_is_scoped_in_formulaP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == el_utilities.el_formula_p( v_object ) )
    {
      return NIL;
    }
    if( NIL != cycl_grammar.el_var_list_operator_p( cycl_utilities.formula_operator( v_object ) ) && NIL != subl_promotions.memberP( $var_is_scoped_in_formula_var$.getDynamicValue( thread ), cycl_utilities.formula_arg1(
        v_object, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    final SubLObject argnum = el_utilities.formula_position( $var_is_scoped_in_formula_var$.getDynamicValue( thread ), v_object, UNPROVIDED );
    return kb_accessors.scoping_argP( cycl_utilities.formula_operator( v_object ), argnum, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 87530L)
  public static SubLObject canonicalize_clauses_literals(final SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_vars.$canonicalize_literalsP$.getDynamicValue( thread ) )
    {
      return v_clauses;
    }
    final SubLObject sorted_clauses = sort_clauses_literals( v_clauses );
    if( NIL != czer_vars.$canonicalize_disjunction_as_enumerationP$.getDynamicValue( thread ) )
    {
      return canonicalize_disjunctions_as_enumerations( sorted_clauses );
    }
    return sorted_clauses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 88271L)
  public static SubLObject sort_clauses(final SubLObject v_clauses)
  {
    return Sort.sort( sort_clauses_literals( el_utilities.copy_clauses( v_clauses ) ), Symbols.symbol_function( $sym100$CLAUSES_IN_ORDER_ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 88517L)
  public static SubLObject clauses_in_orderP(final SubLObject clause_1, final SubLObject clause_2)
  {
    if( Sequences.length( clause_1 ).numL( Sequences.length( clause_2 ) ) )
    {
      return T;
    }
    return Strings.string_lessp( string_utilities.str( clause_1 ), string_utilities.str( clause_2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 88690L)
  public static SubLObject sort_clauses_literals(final SubLObject v_clauses)
  {
    return list_utilities.nmapcar( Symbols.symbol_function( $sym101$SORT_CLAUSE_LITERALS ), v_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 88789L)
  public static SubLObject sort_clause_literals(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    return sort_clause_literals_destructive( el_utilities.copy_clause( clause ), varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 89195L)
  public static SubLObject canonicalize_skolem_clause(SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = czer_vars.$canonicalize_functionsP$.currentBinding( thread );
    try
    {
      czer_vars.$canonicalize_functionsP$.bind( NIL, thread );
      clause = list_utilities.only_one( canonicalize_clauses_terms( ConsesLow.list( clause ) ) );
    }
    finally
    {
      czer_vars.$canonicalize_functionsP$.rebind( _prev_bind_0, thread );
    }
    return sort_clause_literals( clause, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 89434L)
  public static SubLObject sort_clause_literals_destructive(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$varP$.currentBinding( thread );
    try
    {
      czer_vars.$varP$.bind( varP, thread );
      thread.resetMultipleValues();
      final SubLObject neg_lits = clause_utilities.unmake_clause( clause );
      final SubLObject pos_lits = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = Sequences.cconcatenate( list_utilities.nmapcar( Symbols.symbol_function( $sym102$NEGATE_ATOMIC ), neg_lits ), pos_lits );
      result = sort_literals( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      result = evaluate_lits_at_rear( result );
      result = tou_lits_at_rear( result );
      result = clausifier.npackage_cnf_clause( result );
    }
    finally
    {
      czer_vars.$varP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 90048L)
  public static SubLObject tou_lits_at_rear(final SubLObject literals)
  {
    SubLObject front = NIL;
    SubLObject back = NIL;
    SubLObject cdolist_list_var = literals;
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.el_negation_p( lit ) && NIL != el_utilities.tou_litP( conses_high.second( lit ) ) )
      {
        back = ConsesLow.cons( lit, back );
      }
      else
      {
        front = ConsesLow.cons( lit, front );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    return ConsesLow.nconc( Sequences.nreverse( front ), Sequences.nreverse( back ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 90391L)
  public static SubLObject evaluate_lits_at_rear(final SubLObject literals)
  {
    SubLObject front = NIL;
    SubLObject back = NIL;
    SubLObject cdolist_list_var = literals;
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.el_negation_p( lit ) && NIL != el_utilities.evaluate_litP( conses_high.second( lit ), UNPROVIDED ) )
      {
        back = ConsesLow.cons( lit, back );
      }
      else
      {
        front = ConsesLow.cons( lit, front );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    return ConsesLow.nconc( Sequences.nreverse( front ), Sequences.nreverse( back ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 90741L)
  public static SubLObject sort_literals(final SubLObject literals, SubLObject bound_vars, SubLObject connected_vars, SubLObject already_sorted_literals, SubLObject originals)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( connected_vars == UNPROVIDED )
    {
      connected_vars = NIL;
    }
    if( already_sorted_literals == UNPROVIDED )
    {
      already_sorted_literals = NIL;
    }
    if( originals == UNPROVIDED )
    {
      originals = literals;
    }
    if( NIL == literals )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( literals ) )
    {
      return literals;
    }
    final SubLObject next_literal = pick_a_lit( literals, bound_vars, connected_vars, already_sorted_literals, originals );
    return ConsesLow.cons( next_literal, sort_literals( Sequences.remove( next_literal, literals, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), new_bound_vars( next_literal,
        bound_vars ), new_connected_vars( next_literal, bound_vars ), ConsesLow.cons( next_literal, already_sorted_literals ), originals ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 91310L)
  public static SubLObject pick_a_lit(final SubLObject literals, SubLObject bound_vars, SubLObject connected_vars, SubLObject already_sorted_literals, SubLObject originals)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( connected_vars == UNPROVIDED )
    {
      connected_vars = NIL;
    }
    if( already_sorted_literals == UNPROVIDED )
    {
      already_sorted_literals = NIL;
    }
    if( originals == UNPROVIDED )
    {
      originals = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject verboseP = NIL;
    results = most_constrained_literals( literals, bound_vars, UNPROVIDED );
    if( NIL != list_utilities.singletonP( results ) )
    {
      if( NIL != verboseP )
      {
        Errors.warn( $str103$most_constrained_literals_succeed );
      }
      return results.first();
    }
    results = fewest_arg_literals( results );
    if( NIL != list_utilities.singletonP( results ) )
    {
      if( NIL != verboseP )
      {
        Errors.warn( $str104$fewest_arg_literals_succeeded_ );
      }
      return results.first();
    }
    results = left_weighted_literals( results );
    if( NIL != list_utilities.singletonP( results ) )
    {
      if( NIL != verboseP )
      {
        Errors.warn( $str105$left_weighted_literals_succeeded_ );
      }
      return results.first();
    }
    results = left_connected_literals( results, connected_vars );
    if( NIL != list_utilities.singletonP( results ) )
    {
      if( NIL != verboseP )
      {
        Errors.warn( $str106$left_connected_literals_succeeded );
      }
      return results.first();
    }
    results = left_rooted_literals( results, originals );
    if( NIL != list_utilities.singletonP( results ) )
    {
      if( NIL != verboseP )
      {
        Errors.warn( $str107$left_rooted_literals_succeeded_ );
      }
      return results.first();
    }
    results = least_complex_literals( results, UNPROVIDED );
    if( NIL != list_utilities.singletonP( results ) )
    {
      if( NIL != verboseP )
      {
        Errors.warn( $str108$least_complex_literals_succeeded_ );
      }
      return results.first();
    }
    if( NIL == czer_vars.$new_canonicalizerP$.getDynamicValue( thread ) )
    {
      return old_last_resort_literal( results, literals, UNPROVIDED );
    }
    results = czer_graph.penultimate_resort_literals( results );
    if( NIL != list_utilities.singletonP( results ) )
    {
      if( NIL != verboseP )
      {
        Errors.warn( $str109$penultimate_resort_literals_1_suc );
      }
      return results.first();
    }
    results = czer_graph.penultimate_resort_literals( literals );
    if( NIL != list_utilities.singletonP( results ) )
    {
      if( NIL != verboseP )
      {
        Errors.warn( $str110$penultimate_resort_literals_2_suc );
      }
      return results.first();
    }
    return czer_graph.last_resort_literal( results, already_sorted_literals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 93178L)
  public static SubLObject new_bound_vars(final SubLObject literal, SubLObject bound_vars)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    final SubLObject vars = list_utilities.ordered_set_difference( el_utilities.literal_variables( literal, UNPROVIDED, UNPROVIDED ), bound_vars, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL != list_utilities.singletonP( vars ) )
    {
      return ConsesLow.append( bound_vars, vars );
    }
    return bound_vars;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 93412L)
  public static SubLObject new_connected_vars(final SubLObject literal, SubLObject connected_vars)
  {
    if( connected_vars == UNPROVIDED )
    {
      connected_vars = NIL;
    }
    return ConsesLow.nconc( list_utilities.ordered_set_difference( el_utilities.literal_variables( literal, UNPROVIDED, UNPROVIDED ), connected_vars, Symbols.symbol_function( EQUAL ), UNPROVIDED ), connected_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 93591L)
  public static SubLObject unbound_vars(final SubLObject vars, final SubLObject bound_vars)
  {
    SubLObject unbound = list_utilities.ordered_set_difference( vars, bound_vars, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = vars;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term.unreified_skolem_termP( var ) )
      {
        SubLObject unboundP = NIL;
        if( NIL == unboundP )
        {
          SubLObject csome_list_var = conses_high.second( var );
          SubLObject free_var = NIL;
          free_var = csome_list_var.first();
          while ( NIL == unboundP && NIL != csome_list_var)
          {
            if( NIL == subl_promotions.memberP( free_var, bound_vars, UNPROVIDED, UNPROVIDED ) )
            {
              unboundP = T;
            }
            csome_list_var = csome_list_var.rest();
            free_var = csome_list_var.first();
          }
        }
        if( NIL == unboundP )
        {
          unbound = Sequences.remove( var, unbound, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return unbound;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 93990L)
  public static SubLObject most_constrained_literals(final SubLObject literals, SubLObject bound_vars, SubLObject varP)
  {
    if( bound_vars == UNPROVIDED )
    {
      bound_vars = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    SubLObject ans = ConsesLow.list( literals.first() );
    SubLObject min = unbound_vars_score( el_utilities.literal_variables( ans.first(), varP, UNPROVIDED ), bound_vars );
    SubLObject score = NIL;
    SubLObject cdolist_list_var = literals.rest();
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      score = unbound_vars_score( el_utilities.literal_variables( literal, varP, UNPROVIDED ), bound_vars );
      if( score.numE( min ) )
      {
        ans = ConsesLow.cons( literal, ans );
      }
      else if( score.numL( min ) )
      {
        min = score;
        ans = ConsesLow.list( literal );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return Sequences.reverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 94471L)
  public static SubLObject unbound_vars_score(final SubLObject vars, final SubLObject bound_vars)
  {
    return Sequences.length( unbound_vars( vars, bound_vars ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 94574L)
  public static SubLObject temp_unbound_vars_score(final SubLObject vars, final SubLObject bound_vars)
  {
    return Numbers.add( Sequences.length( unbound_vars( vars, bound_vars ) ), Numbers.multiply( $float111$0_1, Sequences.length( conses_high.intersection( vars, bound_vars, UNPROVIDED, UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 94737L)
  public static SubLObject fewest_arg_literals(final SubLObject literals)
  {
    if( NIL != list_utilities.singletonP( literals ) )
    {
      return literals;
    }
    SubLObject ans = ConsesLow.list( literals.first() );
    SubLObject min = el_utilities.literal_arity( ans.first(), UNPROVIDED );
    SubLObject score = NIL;
    SubLObject cdolist_list_var = literals.rest();
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      score = el_utilities.literal_arity( literal, UNPROVIDED );
      if( score.numE( min ) )
      {
        ans = ConsesLow.cons( literal, ans );
      }
      else if( score.numL( min ) )
      {
        min = score;
        ans = ConsesLow.list( literal );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return Sequences.reverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 95141L)
  public static SubLObject left_weighted_literals(final SubLObject literals)
  {
    if( NIL != list_utilities.singletonP( literals ) )
    {
      return literals;
    }
    SubLObject ans = ConsesLow.list( literals.first() );
    SubLObject max = left_weighted_score( el_utilities.literal_args( literals.first(), UNPROVIDED ), UNPROVIDED );
    SubLObject score = NIL;
    SubLObject cdolist_list_var = literals.rest();
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      score = left_weighted_score( el_utilities.literal_args( literal, UNPROVIDED ), UNPROVIDED );
      if( score.numE( max ) )
      {
        ans = ConsesLow.cons( literal, ans );
      }
      else if( score.numG( max ) )
      {
        max = score;
        ans = ConsesLow.list( literal );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return Sequences.reverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 95595L)
  public static SubLObject left_weighted_score(final SubLObject symbols, SubLObject symbol)
  {
    if( symbol == UNPROVIDED )
    {
      symbol = symbols.first();
    }
    SubLObject score = ZERO_INTEGER;
    final SubLObject length = Sequences.length( symbols );
    final SubLObject weights = list_utilities.first_n( length, n_left_weighted_score_weights( length, TEN_INTEGER ) );
    SubLObject n;
    for( n = NIL, n = ZERO_INTEGER; n.numL( length ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      if( symbol.equal( ConsesLow.nth( n, symbols ) ) )
      {
        score = Numbers.add( score, ConsesLow.nth( Numbers.subtract( length, n, ONE_INTEGER ), weights ) );
      }
    }
    return score;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 95938L)
  public static SubLObject n_left_weighted_score_weights(final SubLObject n, SubLObject multiplier)
  {
    if( multiplier == UNPROVIDED )
    {
      multiplier = TEN_INTEGER;
    }
    SubLObject weights = NIL;
    SubLObject weight = ONE_INTEGER;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      weights = ConsesLow.cons( weight, weights );
      weight = Numbers.multiply( weight, multiplier );
    }
    return Sequences.nreverse( weights );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 96168L)
  public static SubLObject left_connected_literals(final SubLObject literals, SubLObject connected_vars)
  {
    if( connected_vars == UNPROVIDED )
    {
      connected_vars = NIL;
    }
    if( NIL != list_utilities.singletonP( literals ) )
    {
      return literals;
    }
    SubLObject ans = ConsesLow.list( literals.first() );
    SubLObject max = left_connected_score( el_utilities.literal_args( literals.first(), UNPROVIDED ), connected_vars );
    SubLObject score = NIL;
    SubLObject cdolist_list_var = literals.rest();
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      score = left_connected_score( el_utilities.literal_args( literal, UNPROVIDED ), connected_vars );
      if( score.numE( max ) )
      {
        ans = ConsesLow.cons( literal, ans );
      }
      else if( score.numG( max ) )
      {
        max = score;
        ans = ConsesLow.list( literal );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return Sequences.reverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 96682L)
  public static SubLObject left_connected_score(final SubLObject vars, final SubLObject connected_vars)
  {
    SubLObject score = ZERO_INTEGER;
    SubLObject psn = ZERO_INTEGER;
    SubLObject cdolist_list_var = Sequences.reverse( vars );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      psn = Numbers.add( psn, ONE_INTEGER );
      score = Numbers.add( score, Numbers.multiply( Sequences.length( conses_high.member( var, connected_vars, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ), psn ) );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return score;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 96912L)
  public static SubLObject left_rooted_literals(final SubLObject literals, SubLObject original)
  {
    if( original == UNPROVIDED )
    {
      original = literals;
    }
    return left_rooted_literals_int( default_lit_sort( literals ), default_lit_sort( original ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 97083L)
  public static SubLObject default_lit_sort(final SubLObject literals)
  {
    return Sort.stable_sort( conses_high.copy_list( literals ), Symbols.symbol_function( $sym112$LIT__ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 97180L)
  public static SubLObject lit_L(final SubLObject lit_1, final SubLObject lit_2)
  {
    if( NIL != el_utilities.el_negation_p( lit_1 ) && NIL == el_utilities.el_negation_p( lit_2 ) )
    {
      return T;
    }
    if( NIL == el_utilities.el_negation_p( lit_1 ) && NIL != el_utilities.el_negation_p( lit_2 ) )
    {
      return NIL;
    }
    if( !el_utilities.literal_arg0( lit_1, UNPROVIDED ).equal( el_utilities.literal_arg0( lit_2, UNPROVIDED ) ) )
    {
      return pred_L( el_utilities.literal_arg0( lit_1, UNPROVIDED ), el_utilities.literal_arg0( lit_2, UNPROVIDED ) );
    }
    return canon_term_L( el_utilities.literal_args( lit_1, UNPROVIDED ), el_utilities.literal_args( lit_2, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 97558L)
  public static SubLObject pred_L(final SubLObject pred_1, final SubLObject pred_2)
  {
    if( NIL == forts.fort_p( pred_1 ) || NIL == forts.fort_p( pred_2 ) )
    {
      return canon_term_L( pred_1, pred_2 );
    }
    final SubLObject pred_1_psn = Sequences.position( pred_1, czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject pred_2_psn = Sequences.position( pred_2, czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != pred_1_psn && NIL != pred_2_psn )
    {
      return Numbers.numG( pred_2_psn, pred_1_psn );
    }
    if( NIL != pred_1_psn )
    {
      return T;
    }
    if( NIL != pred_2_psn )
    {
      return NIL;
    }
    final SubLObject arity_1 = arity.arity( pred_1 );
    final SubLObject arity_2 = arity.arity( pred_2 );
    if( !arity_1.eql( arity_2 ) )
    {
      if( NIL != arity_1 && NIL != arity_2 )
      {
        return Numbers.numG( arity_2, arity_1 );
      }
      if( NIL != arity_1 )
      {
        return T;
      }
      if( NIL != arity_2 )
      {
        return NIL;
      }
    }
    if( NIL != constant_handles.constant_p( pred_1 ) && NIL != nart_handles.nart_p( pred_2 ) )
    {
      return T;
    }
    if( NIL != nart_handles.nart_p( pred_1 ) && NIL != constant_handles.constant_p( pred_2 ) )
    {
      return T;
    }
    if( NIL != constant_handles.constant_p( pred_1 ) && NIL != constant_handles.constant_p( pred_2 ) )
    {
      return canonicalizer_constant_L( pred_1, pred_2 );
    }
    if( NIL != nart_handles.nart_p( pred_1 ) && NIL != nart_handles.nart_p( pred_2 ) )
    {
      return canon_term_L( narts_high.nart_hl_formula( pred_1 ), narts_high.nart_hl_formula( pred_2 ) );
    }
    el_utilities.el_error( ONE_INTEGER, $str113$Got_a_fort_that_was_neither_a_nar, pred_1, pred_2, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 98692L)
  public static SubLObject left_rooted_literals_int(final SubLObject literals, SubLObject original)
  {
    if( original == UNPROVIDED )
    {
      original = literals;
    }
    if( NIL != list_utilities.singletonP( literals ) )
    {
      return literals;
    }
    SubLObject ans = ConsesLow.list( literals.first() );
    SubLObject max = left_rooted_score( literals.first(), original, UNPROVIDED );
    SubLObject score = NIL;
    SubLObject cdolist_list_var = literals.rest();
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      score = left_rooted_score( literal, original, UNPROVIDED );
      if( score.numE( max ) )
      {
        ans = ConsesLow.cons( literal, ans );
      }
      else if( score.numG( max ) )
      {
        max = score;
        ans = ConsesLow.list( literal );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return Sequences.reverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 99162L)
  public static SubLObject left_rooted_score(final SubLObject literal, final SubLObject literals, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( literal, literals, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      Errors.error( $str114$_s_is_not_an_element_of__s, literal, literals );
    }
    final SubLObject symbols = el_utilities.literal_args( literal, UNPROVIDED );
    SubLObject score = left_weighted_score( symbols, UNPROVIDED );
    final SubLObject rest = Sequences.remove( literal, literals, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject psn = ZERO_INTEGER;
    SubLObject out_scores = NIL;
    SubLObject out = NIL;
    SubLObject out_score = NIL;
    SubLObject lit_score = NIL;
    SubLObject connectedP = NIL;
    SubLObject unconnected = NIL;
    SubLObject cdolist_list_var = Sequences.remove_duplicates( symbols, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject symbol = NIL;
    symbol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      psn = Numbers.add( psn, ONE_INTEGER );
      SubLObject cdolist_list_var_$65 = rest;
      SubLObject lit = NIL;
      lit = cdolist_list_var_$65.first();
      while ( NIL != cdolist_list_var_$65)
      {
        connectedP = NIL;
        out = NIL;
        SubLObject cdolist_list_var_$66 = el_utilities.literal_args( lit, UNPROVIDED );
        SubLObject v_term = NIL;
        v_term = cdolist_list_var_$66.first();
        while ( NIL != cdolist_list_var_$66)
        {
          if( NIL != subl_promotions.memberP( v_term, symbols, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
          {
            connectedP = T;
          }
          else
          {
            final SubLObject item_var = v_term;
            if( NIL == conses_high.member( item_var, out, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              out = ConsesLow.cons( item_var, out );
            }
          }
          cdolist_list_var_$66 = cdolist_list_var_$66.rest();
          v_term = cdolist_list_var_$66.first();
        }
        if( NIL != connectedP )
        {
          lit_score = left_weighted_score( el_utilities.literal_args( lit, UNPROVIDED ), symbol );
          score = Numbers.add( score, Numbers.divide( lit_score, psn ) );
          if( NIL != out )
          {
            unconnected = ConsesLow.cons( lit, unconnected );
            SubLObject cdolist_list_var_$67 = out;
            v_term = NIL;
            v_term = cdolist_list_var_$67.first();
            while ( NIL != cdolist_list_var_$67)
            {
              out_score = conses_high.assoc( v_term, out_scores, Symbols.symbol_function( EQUAL ), UNPROVIDED ).rest();
              if( NIL != out_score )
              {
                ConsesLow.rplacd( conses_high.assoc( v_term, out_scores, Symbols.symbol_function( EQUAL ), UNPROVIDED ), Numbers.add( out_score, lit_score ) );
              }
              else
              {
                out_scores = ConsesLow.cons( ConsesLow.cons( v_term, lit_score ), out_scores );
              }
              cdolist_list_var_$67 = cdolist_list_var_$67.rest();
              v_term = cdolist_list_var_$67.first();
            }
          }
        }
        cdolist_list_var_$65 = cdolist_list_var_$65.rest();
        lit = cdolist_list_var_$65.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      symbol = cdolist_list_var.first();
    }
    final SubLObject root_term = max_scored_item( out_scores, Symbols.symbol_function( $sym115$CDR ), Symbols.symbol_function( $sym96$CAR ) );
    SubLObject root_lit = NIL;
    SubLObject max = ZERO_INTEGER;
    SubLObject cdolist_list_var2 = unconnected;
    SubLObject lit2 = NIL;
    lit2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      lit_score = left_weighted_score( cycl_utilities.formula_terms( lit2, UNPROVIDED ), root_term );
      if( lit_score.numG( max ) )
      {
        max = lit_score;
        root_lit = lit2;
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      lit2 = cdolist_list_var2.first();
    }
    if( NIL != root_lit )
    {
      score = Numbers.divide( Numbers.add( score, left_rooted_score( root_lit, rest, Numbers.multiply( depth, TEN_INTEGER ) ) ), depth );
    }
    return score;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 100579L)
  public static SubLObject max_scored_item(final SubLObject items, SubLObject score_key, SubLObject result_key)
  {
    if( score_key == UNPROVIDED )
    {
      score_key = Symbols.symbol_function( IDENTITY );
    }
    if( result_key == UNPROVIDED )
    {
      result_key = Symbols.symbol_function( IDENTITY );
    }
    SubLObject max = Numbers.$most_negative_fixnum$.getGlobalValue();
    SubLObject score = NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = items;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      score = Functions.funcall( score_key, item );
      if( score.numG( max ) )
      {
        max = score;
        result = Functions.funcall( result_key, item );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 100900L)
  public static SubLObject least_complex_literals(final SubLObject literals, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    if( NIL != list_utilities.singletonP( literals ) )
    {
      return literals;
    }
    final SubLObject first = literals.first();
    SubLObject ans = ConsesLow.list( first );
    SubLObject min = el_complexity_score( first, varP, UNPROVIDED );
    SubLObject cdolist_list_var = literals.rest();
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject score = el_complexity_score( literal, varP, UNPROVIDED );
      if( score.numE( min ) )
      {
        ans = ConsesLow.cons( literal, ans );
      }
      else if( score.numL( min ) )
      {
        min = score;
        ans = ConsesLow.list( literal );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return Sequences.reverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 101366L)
  public static SubLObject el_complexity_score(final SubLObject v_object, SubLObject varP, SubLObject factor)
  {
    if( varP == UNPROVIDED )
    {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    if( factor == UNPROVIDED )
    {
      factor = ONE_INTEGER;
    }
    if( NIL == v_object )
    {
      return ZERO_INTEGER;
    }
    if( NIL != constant_handles.constant_p( v_object ) )
    {
      return ONE_INTEGER;
    }
    if( NIL != Functions.funcall( varP, v_object ) )
    {
      return THREE_INTEGER;
    }
    if( NIL != nart_handles.nart_p( v_object ) )
    {
      return Numbers.add( FIVE_INTEGER, Numbers.divide( el_complexity_score( narts_high.nart_hl_formula( v_object ), varP, factor ), TWO_INTEGER ) );
    }
    if( v_object.isString() )
    {
      return Numbers.add( FOUR_INTEGER, Numbers.divide( Sequences.length( v_object ), TWO_INTEGER ) );
    }
    if( NIL != assertion_handles.assertion_p( v_object ) )
    {
      return Numbers.add( $int116$1000, el_complexity_score( fi.assertion_fi_formula( v_object, UNPROVIDED ), varP, factor ) );
    }
    if( v_object.isAtom() )
    {
      return TWO_INTEGER;
    }
    if( v_object.isCons() )
    {
      return Numbers.add( $int117$100, el_complexity_score( v_object.first(), varP, factor ), Numbers.multiply( factor, el_complexity_score( v_object.rest(), varP, Numbers.multiply( factor, $float118$0_9 ) ) ) );
    }
    return $int119$10000;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 102068L)
  public static SubLObject default_preference_lit(final SubLObject literals)
  {
    SubLObject ans = NIL;
    SubLObject min = Numbers.$most_positive_fixnum$.getGlobalValue();
    SubLObject cdolist_list_var = literals;
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject score = Sequences.position( el_utilities.literal_arg0( lit, UNPROVIDED ), czer_vars.$hl_pred_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != score )
      {
        if( min.numG( score ) )
        {
          min = score;
          ans = ConsesLow.list( lit );
        }
        else if( min.numE( score ) )
        {
          ans = ConsesLow.cons( lit, ans );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    if( NIL != list_utilities.singletonP( ans ) )
    {
      return ans.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 102471L)
  public static SubLObject canonicalize_disjunctions_as_enumerations(final SubLObject v_clauses)
  {
    return v_clauses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 102557L)
  public static SubLObject canonicalize_clauses_variables(final SubLObject v_clauses)
  {
    return rename_clauses_vars( v_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 102759L)
  public static SubLObject rename_clauses_vars(final SubLObject v_clauses)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_clauses;
    SubLObject clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( rename_clause_vars_int( clause, v_clauses, UNPROVIDED ), result );
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 102950L)
  public static SubLObject standardize_variable_memory_binding(final SubLObject var, final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject referenced_as_list = NIL;
    SubLObject ambiguousP = NIL;
    if( NIL == ambiguousP )
    {
      SubLObject csome_list_var = all_bindings( var, czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) );
      SubLObject binding = NIL;
      binding = csome_list_var.first();
      while ( NIL == ambiguousP && NIL != csome_list_var)
      {
        if( NIL != list_utilities.simple_tree_findP( binding, expression ) )
        {
          if( NIL != referenced_as_list || NIL != list_utilities.simple_tree_findP( var, expression ) )
          {
            ambiguousP = T;
          }
          referenced_as_list = ConsesLow.cons( binding, referenced_as_list );
        }
        csome_list_var = csome_list_var.rest();
        binding = csome_list_var.first();
      }
    }
    return Values.values( referenced_as_list, ambiguousP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 103376L)
  public static SubLObject el_nununiquifying_blist_wrt(final SubLObject expression, SubLObject updateP, SubLObject forceP)
  {
    if( updateP == UNPROVIDED )
    {
      updateP = NIL;
    }
    if( forceP == UNPROVIDED )
    {
      forceP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject blist = NIL;
    SubLObject cdolist_list_var = list_utilities.fast_delete_duplicates( Mapping.mapcar( Symbols.symbol_function( $sym96$CAR ), czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject referenced_as_list = standardize_variable_memory_binding( var, expression );
      final SubLObject ambiguousP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( ( NIL != forceP || NIL == ambiguousP ) && NIL != referenced_as_list )
      {
        SubLObject cdolist_list_var_$68 = referenced_as_list;
        SubLObject referenced_as = NIL;
        referenced_as = cdolist_list_var_$68.first();
        while ( NIL != cdolist_list_var_$68)
        {
          blist = ConsesLow.cons( ConsesLow.cons( referenced_as, var ), blist );
          if( NIL != updateP )
          {
            czer_vars.$standardize_variables_memory$.setDynamicValue( conses_high.nsubst( var, referenced_as, czer_vars.$standardize_variables_memory$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), thread );
          }
          cdolist_list_var_$68 = cdolist_list_var_$68.rest();
          referenced_as = cdolist_list_var_$68.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return blist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 103990L)
  public static SubLObject el_nununiquify_vars_wrt_int(final SubLObject expression_1, final SubLObject expression_2, SubLObject updateP, SubLObject forceP)
  {
    if( updateP == UNPROVIDED )
    {
      updateP = NIL;
    }
    if( forceP == UNPROVIDED )
    {
      forceP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject blist = el_nununiquifying_blist_wrt( expression_2, updateP, forceP );
    if( NIL != blist )
    {
      final SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding( thread );
      try
      {
        czer_vars.$canonicalize_variablesP$.bind( NIL, thread );
        cycl_utilities.expression_nsublis_free_vars( blist, expression_1, UNPROVIDED );
      }
      finally
      {
        czer_vars.$canonicalize_variablesP$.rebind( _prev_bind_0, thread );
      }
    }
    return expression_1;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 104305L)
  public static SubLObject el_nununiquify_vars_wrt(final SubLObject expression_1, final SubLObject expression_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( NIL, thread );
      result = el_nununiquify_vars_wrt_int( expression_1, expression_2, NIL, UNPROVIDED );
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 104630L)
  public static SubLObject el_nununiquify_vars_int(final SubLObject expression, SubLObject updateP, SubLObject forceP)
  {
    if( updateP == UNPROVIDED )
    {
      updateP = NIL;
    }
    if( forceP == UNPROVIDED )
    {
      forceP = NIL;
    }
    return el_nununiquify_vars_wrt_int( expression, expression, updateP, forceP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 104922L)
  public static SubLObject el_ununiquify_vars_int(final SubLObject expression, SubLObject updateP, SubLObject forceP)
  {
    if( updateP == UNPROVIDED )
    {
      updateP = NIL;
    }
    if( forceP == UNPROVIDED )
    {
      forceP = NIL;
    }
    return el_nununiquify_vars_int( el_utilities.copy_expression( expression ), updateP, forceP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 105139L)
  public static SubLObject el_nununiquify_vars(final SubLObject expression)
  {
    return el_nununiquify_vars_int( expression, NIL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 105284L)
  public static SubLObject uniquify(final SubLObject var)
  {
    return Symbols.gentemp( string_utilities.str( var ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 105381L)
  public static SubLObject rename_clauses_vars_safe(final SubLObject v_clauses)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( NIL, thread );
      return rename_clauses_vars( v_clauses );
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 105572L)
  public static SubLObject rename_clause_vars(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$standardize_variables_memory$.currentBinding( thread );
    try
    {
      czer_vars.$el_symbol_suffix_table$.bind( Hashtables.make_hash_table( FOUR_INTEGER, Symbols.symbol_function( EQL ), UNPROVIDED ), thread );
      czer_vars.$standardize_variables_memory$.bind( NIL, thread );
      result = rename_single_clause_vars_int( el_utilities.copy_clause( clause ), varP );
    }
    finally
    {
      czer_vars.$standardize_variables_memory$.rebind( _prev_bind_2, thread );
      czer_vars.$el_symbol_suffix_table$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 105971L)
  public static SubLObject rename_single_clause_vars_int(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = NIL;
    }
    return rename_clause_vars_int( clause, clause, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 106097L)
  public static SubLObject rename_clause_vars_int(SubLObject clause, final SubLObject environment, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject blist = NIL;
    SubLObject free_vars = NIL;
    SubLObject closed_vars = NIL;
    clause = el_nununiquify_vars_wrt_int( clause, environment, T, UNPROVIDED );
    if( NIL != czer_vars.$canonicalize_variablesP$.getDynamicValue( thread ) )
    {
      SubLObject meta_blist = NIL;
      SubLObject old = NIL;
      SubLObject v_new = NIL;
      SubLObject count = ZERO_INTEGER;
      final SubLObject v_variables = ( NIL != varP ) ? clause_el_variables( clause, varP ) : clause_el_variables( clause, Symbols.symbol_function( $sym120$CANON_VAR_ ) );
      if( NIL != v_variables )
      {
        closed_vars = lookup_closed_vars_from_standardize_variables_memory();
        free_vars = list_utilities.fast_set_difference( v_variables, closed_vars, UNPROVIDED );
        SubLObject cdolist_list_var = cycl_utilities.formula_gather( clause, Symbols.symbol_function( $sym121$ASSERTION_P ), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$69 = assertions_high.assertion_el_variables( assertion );
          SubLObject var = NIL;
          var = cdolist_list_var_$69.first();
          while ( NIL != cdolist_list_var_$69)
          {
            if( NIL != subl_promotions.memberP( var, v_variables, UNPROVIDED, UNPROVIDED ) )
            {
              blist = ConsesLow.cons( ConsesLow.cons( var, czer_utilities.get_nth_canonical_variable( count, UNPROVIDED ) ), blist );
              count = Numbers.add( count, ONE_INTEGER );
            }
            cdolist_list_var_$69 = cdolist_list_var_$69.rest();
            var = cdolist_list_var_$69.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          assertion = cdolist_list_var.first();
        }
        cdolist_list_var = v_variables;
        SubLObject var2 = NIL;
        var2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == conses_high.assoc( var2, blist, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL != term.unreified_skolem_termP( var2 ) )
            {
              el_utilities.el_error( TWO_INTEGER, $str122$_s_treated_as_variable_in_rename_, var2, UNPROVIDED, UNPROVIDED );
              v_new = conses_high.last( var2, UNPROVIDED ).first();
              old = conses_high.rassoc( v_new, czer_vars.$standardize_variables_memory$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ).first();
              if( NIL != old )
              {
                blist = ConsesLow.cons( ConsesLow.cons( v_new, czer_utilities.get_nth_canonical_variable( count, UNPROVIDED ) ), blist );
                meta_blist = ConsesLow.cons( ConsesLow.cons( v_new, old ), meta_blist );
                count = Numbers.add( count, ONE_INTEGER );
              }
            }
            else
            {
              blist = ConsesLow.cons( ConsesLow.cons( var2, czer_utilities.get_nth_canonical_variable( count, UNPROVIDED ) ), blist );
              count = Numbers.add( count, ONE_INTEGER );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          var2 = cdolist_list_var.first();
        }
        clause = cycl_utilities.expression_nsublis_free_vars( blist, clause, UNPROVIDED );
        blist = Sequences.nreverse( conses_high.sublis( meta_blist, blist, UNPROVIDED, UNPROVIDED ) );
      }
    }
    if( NIL != control_vars.$within_ask$.getDynamicValue( thread ) )
    {
      return ConsesLow.list( clause, blist, blist_vars_among( blist, blist_vars_among( blist, free_vars ) ) );
    }
    return ConsesLow.list( clause, blist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 108038L)
  public static SubLObject lookup_closed_vars_from_standardize_variables_memory()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Mapping.mapcar( Symbols.symbol_function( $sym115$CDR ), czer_vars.$standardize_variables_memory$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 108166L)
  public static SubLObject blist_vars_among(final SubLObject blist, final SubLObject vars)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = blist;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( binding.first(), vars, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( binding.first(), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 108363L)
  public static SubLObject blist_vars_not_among(final SubLObject blist, final SubLObject vars)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = blist;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( binding.first(), vars, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( binding.first(), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 108566L)
  public static SubLObject all_bindings(final SubLObject symbol, final SubLObject v_bindings)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( symbol.eql( binding.first() ) )
      {
        result = ConsesLow.cons( binding.rest(), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 108765L)
  public static SubLObject clause_el_variables(final SubLObject clause, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym53$EL_VAR_ );
    }
    if( NIL == list_utilities.tree_find_if( varP, clause, UNPROVIDED ) )
    {
      return NIL;
    }
    return clause_utilities.clause_free_variables( clause, varP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 108960L)
  public static SubLObject initialize_symbol_suffix_table(final SubLObject formula)
  {
    SubLObject cdolist_list_var = cycl_utilities.expression_gather( formula, Symbols.symbol_function( $sym53$EL_VAR_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject el_var = NIL;
    el_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      initialize_suffix_table_for_var( el_var );
      cdolist_list_var = cdolist_list_var.rest();
      el_var = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 109436L)
  public static SubLObject initialize_suffix_table_for_var(final SubLObject el_var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject integer = extract_name_uniquifying_post_hyphen_integer( el_var );
    final SubLObject symbol = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( integer.isInteger() && symbol.isSymbol() && integer.numGE( ZERO_INTEGER ) )
    {
      final SubLObject n = Hashtables.gethash( symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue( thread ), UNPROVIDED );
      if( !n.isInteger() || integer.numG( n ) )
      {
        Hashtables.sethash( symbol, czer_vars.$el_symbol_suffix_table$.getDynamicValue( thread ), integer );
        return integer;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 109863L)
  public static SubLObject extract_name_uniquifying_post_hyphen_integer(final SubLObject symbol)
  {
    if( symbol.isSymbol() )
    {
      SubLObject string;
      SubLObject hyphen;
      SubLObject next;
      SubLObject end;
      for( string = Symbols.symbol_name( symbol ), hyphen = NIL, next = NIL, end = NIL, hyphen = string_utilities.char_position( Characters.CHAR_hyphen, string, UNPROVIDED ), next = hyphen.isInteger() ? Numbers.add(
          ONE_INTEGER, hyphen ) : NIL, end = next.isInteger() ? string_utilities.char_type_position( Symbols.symbol_function( $sym123$NOT_DIGIT_CHAR_P ), string, next, UNPROVIDED ) : NIL; NIL != next
              && ( NIL == list_utilities.lengthG( string, next, UNPROVIDED ) || NIL == Characters.digit_char_p( Vectors.aref( string, next ), UNPROVIDED ) || NIL != end ); next = hyphen.isInteger() ? Numbers.add(
                  ONE_INTEGER, hyphen ) : NIL, end = next.isInteger() ? string_utilities.char_type_position( Symbols.symbol_function( $sym123$NOT_DIGIT_CHAR_P ), string, next, UNPROVIDED ) : NIL )
      {
        hyphen = string_utilities.char_position( Characters.CHAR_hyphen, string, next );
      }
      if( next.isInteger() )
      {
        final SubLObject integer = reader.read_from_string( string_utilities.substring( string, next, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( integer.isInteger() )
        {
          return Values.values( integer, Packages.intern( string_utilities.substring( string, ZERO_INTEGER, hyphen ), UNPROVIDED ) );
        }
      }
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 110717L)
  public static SubLObject canonicalize_clauses(final SubLObject v_clauses, final SubLObject mt)
  {
    return canonicalize_clauses_int( v_clauses, mt, T, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 110857L)
  public static SubLObject canonicalize_query_clauses(SubLObject v_clauses, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_clauses_$70 = canonicalize_clauses_int( v_clauses, mt, NIL, NIL );
    final SubLObject mt_$71 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    v_clauses = v_clauses_$70;
    mt = mt_$71;
    thread.resetMultipleValues();
    final SubLObject v_clauses_$71 = equals.possibly_subst_preferred_rewrite_terms( v_clauses, mt );
    final SubLObject mt_$72 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    v_clauses = v_clauses_$71;
    mt = mt_$72;
    return Values.values( v_clauses, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 111348L)
  public static SubLObject canonicalize_clauses_int(SubLObject v_clauses, SubLObject mt, final SubLObject check_fast_clausesP, final SubLObject canonicalize_wrt_rule_macrosP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == cycl_grammar.cycl_truth_value_p( v_clauses ) )
      {
        if( NIL != check_fast_clausesP && NIL != canon_fast_clausesP( v_clauses ) )
        {
          v_clauses = ConsesLow.list( v_clauses );
        }
        else
        {
          if( NIL != canonicalize_wrt_rule_macrosP )
          {
            v_clauses = rule_macros.canonicalize_clauses_wrt_rule_macros( v_clauses );
          }
          v_clauses = czer_meta.canonicalize_meta_clauses( v_clauses );
          v_clauses = canonicalize_clauses_terms( v_clauses );
          v_clauses = canonicalize_clauses_literals( v_clauses );
          v_clauses = canonicalize_clauses_variables( v_clauses );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    thread.resetMultipleValues();
    final SubLObject v_clauses_$74 = unwrap_clauses_if_ist_permissive( v_clauses, mt );
    final SubLObject mt_$75 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    v_clauses = v_clauses_$74;
    mt = mt_$75;
    thread.resetMultipleValues();
    final SubLObject v_clauses_$75 = lift_clauses_if_decontextualized( v_clauses, mt );
    final SubLObject mt_$76 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    v_clauses = v_clauses_$75;
    mt = mt_$76;
    thread.resetMultipleValues();
    final SubLObject v_clauses_$76 = clauses_syntactic_wff_check( v_clauses, mt );
    final SubLObject mt_$77 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    v_clauses = v_clauses_$76;
    mt = mt_$77;
    return Values.values( v_clauses, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 112408L)
  public static SubLObject canon_fast_clausesP(final SubLObject v_clauses)
  {
    if( NIL != list_utilities.singletonP( v_clauses ) )
    {
      final SubLObject clause = v_clauses.first();
      if( NIL != clause_utilities.pos_atomic_cnf_p( clause ) )
      {
        final SubLObject lit = clauses.pos_lits( clause ).first();
        return makeBoolean( NIL != subl_promotions.memberP( cycl_utilities.formula_operator( lit ), $list41, UNPROVIDED, UNPROVIDED ) && NIL != el_utilities.groundP( lit, Symbols.symbol_function( $sym53$EL_VAR_ ) )
            && NIL == el_utilities.contains_subformula_p( lit ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 112746L)
  public static SubLObject unwrap_clauses_if_ist_permissive(final SubLObject v_clauses, final SubLObject input_mt)
  {
    return Values.values( v_clauses, input_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 113374L)
  public static SubLObject lift_clauses_if_decontextualized(final SubLObject czer_clauses, SubLObject mt)
  {
    final SubLObject v_clauses = czer_utilities.extract_hl_clauses( czer_clauses );
    if( NIL == clause_utilities.atomic_clauses_p( v_clauses ) && NIL != czer_utilities.generalized_ist_clauses_p( v_clauses ) )
    {
      mt = $const18$UniversalVocabularyMt;
    }
    return Values.values( czer_clauses, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 113854L)
  public static SubLObject clauses_syntactic_wff_check(final SubLObject v_clauses, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == v_clauses || NIL != cycl_grammar.cycl_truth_value_p( v_clauses ) )
    {
      return Values.values( v_clauses, mt );
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = cycl_grammar.$grammar_uses_kbP$.currentBinding( thread );
    try
    {
      cycl_grammar.$grammar_uses_kbP$.bind( NIL, thread );
      SubLObject cdolist_list_var = v_clauses;
      SubLObject clause_binding_list_pair = NIL;
      clause_binding_list_pair = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject clause = clause_binding_list_pair.first();
        SubLObject syntactically_ill_formedP;
        SubLObject rest;
        SubLObject asent;
        for( syntactically_ill_formedP = NIL, rest = NIL, rest = clauses.neg_lits( clause ); NIL == syntactically_ill_formedP && NIL != rest; rest = rest.rest() )
        {
          asent = rest.first();
          if( NIL == cycl_grammar.cycl_sentence_p( asent ) )
          {
            syntactically_ill_formedP = T;
          }
        }
        for( rest = NIL, rest = clauses.pos_lits( clause ); NIL == syntactically_ill_formedP && NIL != rest; rest = rest.rest() )
        {
          asent = rest.first();
          if( NIL == cycl_grammar.cycl_sentence_p( asent ) )
          {
            syntactically_ill_formedP = T;
          }
        }
        if( NIL == syntactically_ill_formedP )
        {
          result = ConsesLow.cons( clause_binding_list_pair, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        clause_binding_list_pair = cdolist_list_var.first();
      }
    }
    finally
    {
      cycl_grammar.$grammar_uses_kbP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( Sequences.nreverse( result ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 114621L)
  public static SubLObject psc_queryP(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return makeBoolean( NIL != control_vars.within_queryP() && NIL != psc.pscP( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 115102L)
  public static SubLObject canonicalizer_problemP(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    thread.resetMultipleValues();
    final SubLObject el_formula = uncanonicalizer.assertion_el_formula( assertion );
    final SubLObject el_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return makeBoolean( NIL == list_utilities.member_eqP( assertion, fi.sentence_assertions( el_formula, el_mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 115415L)
  public static SubLObject tl_canonicalizer_problemP(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    return makeBoolean( NIL == subl_promotions.memberP( assertion, ke.find_assertions_via_tl( canon_tl.assertion_tl_formula( assertion ), assertions_high.assertion_mt( assertion ) ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 115721L)
  public static SubLObject terms_reorder_equalP(SubLObject term1, SubLObject term2)
  {
    if( NIL != el_utilities.el_formula_p( term1 ) )
    {
      term1 = el_utilities.copy_formula( term1 );
    }
    if( NIL != el_utilities.el_formula_p( term2 ) )
    {
      term2 = el_utilities.copy_formula( term2 );
    }
    return Equality.equal( canonicalize_term_commutative_terms( term1 ), canonicalize_term_commutative_terms( term2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 116101L)
  public static SubLObject cnfs_reorder_tou_equalP(final SubLObject cnf1, final SubLObject cnf2, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym124$VARIABLE_P );
    }
    return Equality.equal( rename_clause_vars( sort_clause_literals( canonicalize_clause_commutative_terms( canonicalize_clause_transformable_nats( canonicalize_clause_commutative_terms( el_utilities.copy_clause(
        cnf1 ) ) ) ), varP ), UNPROVIDED ).first(), rename_clause_vars( sort_clause_literals( canonicalize_clause_commutative_terms( canonicalize_clause_transformable_nats( canonicalize_clause_commutative_terms(
            el_utilities.copy_clause( cnf2 ) ) ) ), varP ), UNPROVIDED ).first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 116732L)
  public static SubLObject unique_arity_literal(final SubLObject literals)
  {
    SubLObject singleton_literals = NIL;
    SubLObject singleton_arities = NIL;
    SubLObject doubleton_arities = NIL;
    SubLObject cdolist_list_var = literals;
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_arity = el_utilities.literal_arity( literal, UNPROVIDED );
      if( NIL == subl_promotions.memberP( v_arity, doubleton_arities, UNPROVIDED, UNPROVIDED ) )
      {
        if( NIL != subl_promotions.memberP( v_arity, singleton_arities, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject pos = Sequences.position( v_arity, singleton_arities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          singleton_arities = list_utilities.delete_nth( pos, singleton_arities );
          singleton_literals = list_utilities.delete_nth( pos, singleton_literals );
          doubleton_arities = ConsesLow.cons( v_arity, doubleton_arities );
        }
        else
        {
          singleton_arities = ConsesLow.cons( v_arity, singleton_arities );
          singleton_literals = ConsesLow.cons( literal, singleton_literals );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    if( NIL != singleton_arities )
    {
      return ConsesLow.nth( Sequences.position( Functions.apply( Symbols.symbol_function( $sym125$MIN ), singleton_arities ), singleton_arities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), singleton_literals );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 117656L)
  public static SubLObject unique_list_structure_literal(final SubLObject literals)
  {
    final SubLObject list_structures = Mapping.mapcar( Symbols.symbol_function( $sym126$LIST_STRUCTURE ), literals );
    SubLObject singleton_list_structures = NIL;
    SubLObject doubleton_list_structures = NIL;
    SubLObject cdolist_list_var = list_structures;
    SubLObject list_structure = NIL;
    list_structure = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( list_structure, doubleton_list_structures, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        if( NIL != subl_promotions.memberP( list_structure, singleton_list_structures, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          singleton_list_structures = Sequences.delete( list_structure, singleton_list_structures, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          doubleton_list_structures = ConsesLow.cons( list_structure, doubleton_list_structures );
        }
        else
        {
          singleton_list_structures = ConsesLow.cons( list_structure, singleton_list_structures );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      list_structure = cdolist_list_var.first();
    }
    if( NIL != singleton_list_structures )
    {
      return ConsesLow.nth( Sequences.position( list_utilities.list_structure_min( singleton_list_structures ), list_structures, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), literals );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 118555L)
  public static SubLObject old_last_resort_literal(final SubLObject literals, SubLObject candidates, SubLObject varP)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    final SubLObject literal = default_preference_lit( literals );
    if( NIL != literal )
    {
      return literal;
    }
    return alphabetically_minimal_literal( literals, candidates, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 118896L)
  public static SubLObject alphabetically_minimal_literal(final SubLObject literals, SubLObject candidates, SubLObject varP)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    if( NIL != list_utilities.singletonP( literals ) )
    {
      return literals.first();
    }
    return new_alphabetically_minimal_literal_int( literals, candidates, varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 119128L)
  public static SubLObject new_alphabetically_minimal_literal_int(final SubLObject literals, SubLObject candidates, SubLObject varP)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = literals;
    }
    if( varP == UNPROVIDED )
    {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    SubLObject ans = ConsesLow.list( literals.first() );
    SubLObject ans_string = string_utilities.str( el_utilities.formula_non_var_symbols( ans.first(), varP ) );
    SubLObject cdolist_list_var = literals.rest();
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lit_string = string_utilities.str( el_utilities.formula_non_var_symbols( literal, varP ) );
      if( NIL != Strings.stringL( lit_string, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        ans_string = lit_string;
        ans = ConsesLow.list( literal );
      }
      else if( NIL != Strings.stringE( lit_string, ans_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        ans = ConsesLow.cons( literal, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    if( NIL != list_utilities.singletonP( ans ) )
    {
      return ans.first();
    }
    final SubLObject candidates_1 = last_resort_min_literals( list_utilities.ordered_set_difference( literals, ans, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    if( NIL != list_utilities.singletonP( candidates_1 ) )
    {
      return candidates_1.first();
    }
    final SubLObject candidates_2 = last_resort_min_literals( list_utilities.ordered_set_difference( candidates, literals, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    if( NIL != list_utilities.singletonP( candidates_2 ) )
    {
      return candidates_2.first();
    }
    final SubLObject candidates_3 = last_resort_min_literals( candidates );
    if( NIL != list_utilities.singletonP( candidates_3 ) )
    {
      return candidates_3.first();
    }
    final SubLObject length_0 = ( NIL != ans ) ? Sequences.length( ans ) : Numbers.$most_positive_fixnum$.getGlobalValue();
    final SubLObject length_2 = ( NIL != candidates_1 ) ? Sequences.length( candidates_1 ) : Numbers.$most_positive_fixnum$.getGlobalValue();
    final SubLObject length_3 = ( NIL != candidates_2 ) ? Sequences.length( candidates_2 ) : Numbers.$most_positive_fixnum$.getGlobalValue();
    final SubLObject length_4 = ( NIL != candidates_3 ) ? Sequences.length( candidates_3 ) : Numbers.$most_positive_fixnum$.getGlobalValue();
    final SubLObject min = Numbers.min( length_0, new SubLObject[] { length_2, length_3, length_4
    } );
    if( min.numE( length_0 ) )
    {
      return new_alphabetically_minimal_literal_int_2( default_lit_sort( ans ), varP );
    }
    if( min.numE( length_2 ) )
    {
      return new_alphabetically_minimal_literal_int_2( default_lit_sort( candidates_1 ), varP );
    }
    if( min.numE( length_3 ) )
    {
      return new_alphabetically_minimal_literal_int_2( default_lit_sort( candidates_2 ), varP );
    }
    if( min.numE( length_4 ) )
    {
      return new_alphabetically_minimal_literal_int_2( default_lit_sort( candidates_3 ), varP );
    }
    return new_alphabetically_minimal_literal_int_2( default_lit_sort( literals ), varP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 121070L)
  public static SubLObject new_alphabetically_minimal_literal_int_2(final SubLObject literals, SubLObject varP)
  {
    if( varP == UNPROVIDED )
    {
      varP = czer_vars.$varP$.getDynamicValue();
    }
    if( NIL != list_utilities.tree_find_if( varP, literals, UNPROVIDED ) )
    {
      return new_alphabetically_minimal_literal_int( literals, literals, Symbols.symbol_function( $sym127$FALSE ) );
    }
    return literals.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 121311L)
  public static SubLObject old_commutative_terms_in_orderP(final SubLObject term1, final SubLObject term2)
  {
    if( term1.isAtom() )
    {
      if( term2.isAtom() )
      {
        return old_commutative_atoms_in_orderP( term1, term2 );
      }
      return T;
    }
    else
    {
      if( term2.isAtom() )
      {
        return NIL;
      }
      return old_commutative_conses_in_orderP( term1, term2 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 121666L)
  public static SubLObject old_commutative_atoms_in_orderP(final SubLObject atom1, final SubLObject atom2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == czer_vars.$control_3$.getDynamicValue( thread ) && atom1.equal( atom2 ) )
    {
      return T;
    }
    if( NIL != constant_handles.constant_p( atom1 ) )
    {
      if( NIL != constant_handles.constant_p( atom2 ) )
      {
        return canonicalizer_constant_L( atom1, atom2 );
      }
      return T;
    }
    else
    {
      if( NIL != constant_handles.constant_p( atom2 ) )
      {
        return NIL;
      }
      if( NIL != nart_handles.nart_p( atom1 ) )
      {
        if( NIL != nart_handles.nart_p( atom2 ) )
        {
          return Numbers.numL( nart_handles.nart_id( atom1 ), nart_handles.nart_id( atom2 ) );
        }
        return T;
      }
      else
      {
        if( NIL != nart_handles.nart_p( atom2 ) )
        {
          return NIL;
        }
        if( NIL != cycl_variables.el_varP( atom1 ) )
        {
          if( NIL != cycl_variables.el_varP( atom2 ) )
          {
            return Strings.string_lessp( Symbols.symbol_name( atom1 ), Symbols.symbol_name( atom2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          return T;
        }
        else
        {
          if( NIL != cycl_variables.el_varP( atom2 ) )
          {
            return NIL;
          }
          if( NIL != cycl_variables.kb_varP( atom1 ) )
          {
            if( NIL != cycl_variables.kb_varP( atom2 ) )
            {
              return Numbers.numL( variables.variable_id( atom1 ), variables.variable_id( atom2 ) );
            }
            return T;
          }
          else
          {
            if( NIL != cycl_variables.kb_varP( atom1 ) )
            {
              return NIL;
            }
            if( atom1.isSymbol() )
            {
              if( atom2.isSymbol() )
              {
                return Strings.string_lessp( Symbols.symbol_name( atom1 ), Symbols.symbol_name( atom2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              return T;
            }
            else
            {
              if( atom2.isSymbol() )
              {
                return NIL;
              }
              if( atom1.isNumber() )
              {
                if( atom2.isNumber() )
                {
                  return Numbers.numL( atom1, atom2 );
                }
                return T;
              }
              else
              {
                if( atom2.isNumber() )
                {
                  return NIL;
                }
                if( atom1.isChar() )
                {
                  if( atom2.isChar() )
                  {
                    return Characters.char_lessp( atom1, atom2 );
                  }
                  return T;
                }
                else
                {
                  if( atom2.isChar() )
                  {
                    return NIL;
                  }
                  if( atom1.isString() )
                  {
                    if( atom2.isString() )
                    {
                      return Strings.string_lessp( atom1, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    return T;
                  }
                  else
                  {
                    if( atom2.isString() )
                    {
                      return NIL;
                    }
                    return Strings.string_lessp( string_utilities.str( atom1 ), string_utilities.str( atom2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 124126L)
  public static SubLObject old_commutative_conses_in_orderP(final SubLObject cons1, final SubLObject cons2)
  {
    final SubLObject var_num1 = list_utilities.tree_count_if( Symbols.symbol_function( $sym53$EL_VAR_ ), cons1, UNPROVIDED );
    final SubLObject var_num2 = list_utilities.tree_count_if( Symbols.symbol_function( $sym53$EL_VAR_ ), cons2, UNPROVIDED );
    if( var_num1.numL( var_num2 ) )
    {
      return T;
    }
    if( var_num1.numG( var_num2 ) )
    {
      return NIL;
    }
    final SubLObject atom_num1 = list_utilities.tree_count_if( Symbols.symbol_function( $sym54$ATOM ), cons1, UNPROVIDED );
    final SubLObject atom_num2 = list_utilities.tree_count_if( Symbols.symbol_function( $sym54$ATOM ), cons2, UNPROVIDED );
    if( atom_num1.numL( atom_num2 ) )
    {
      return T;
    }
    if( atom_num1.numG( atom_num2 ) )
    {
      return NIL;
    }
    if( !cons1.first().equal( cons2.first() ) && NIL != commutative_terms_in_orderP( cons1.first(), cons2.first() ) )
    {
      return T;
    }
    if( !cons1.first().equal( cons2.first() ) && NIL != commutative_terms_in_orderP( cons2.first(), cons1.first() ) )
    {
      return NIL;
    }
    return commutative_terms_in_orderP( cons1.rest(), cons2.rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 125638L)
  public static SubLObject last_resort_min_literals(final SubLObject literals)
  {
    SubLObject selected;
    SubLObject remaining;
    for( selected = NIL, remaining = NIL, selected = last_resort_min_literals_int( literals ), remaining = list_utilities.ordered_set_difference( literals, selected, Symbols.symbol_function( EQUAL ),
        UNPROVIDED ); NIL == list_utilities.singletonP( selected ) && NIL != remaining; selected = last_resort_min_literals_int( remaining ), remaining = list_utilities.ordered_set_difference( remaining, selected,
            Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
    }
    if( NIL != selected )
    {
      return selected;
    }
    if( NIL != remaining )
    {
      return remaining;
    }
    if( NIL != literals )
    {
      return literals;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 126069L)
  public static SubLObject last_resort_min_literals_int(final SubLObject literals)
  {
    if( NIL == literals )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( literals ) )
    {
      return literals;
    }
    final SubLObject min_candidates = last_resort_min_literals_min( literals );
    if( NIL != list_utilities.singletonP( min_candidates ) )
    {
      return min_candidates;
    }
    final SubLObject max_candidates = last_resort_min_literals_max( literals );
    if( NIL != list_utilities.singletonP( max_candidates ) )
    {
      return max_candidates;
    }
    if( Sequences.length( min_candidates ).numLE( Sequences.length( max_candidates ) ) )
    {
      return min_candidates;
    }
    return max_candidates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 126589L)
  public static SubLObject last_resort_min_literals_min(final SubLObject literals)
  {
    SubLObject result = ConsesLow.list( literals.first() );
    SubLObject value = last_resort_min_literals_fn( result.first() );
    SubLObject cdolist_list_var = literals.rest();
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lit_value = last_resort_min_literals_fn( literal );
      if( lit_value.numL( value ) )
      {
        value = lit_value;
        result = ConsesLow.list( literal );
      }
      else if( lit_value.numE( value ) )
      {
        result = ConsesLow.cons( literal, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 127006L)
  public static SubLObject constant_median(final SubLObject constants)
  {
    return list_utilities.parametrized_median( constants, Symbols.symbol_function( $sym128$CONSTANT_EXTERNAL_ID__ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 127192L)
  public static SubLObject ugly_thing_L(final SubLObject ugly1, final SubLObject ugly2)
  {
    if( ugly1.eql( Numbers.$most_positive_fixnum$.getGlobalValue() ) )
    {
      return NIL;
    }
    if( ugly2.eql( Numbers.$most_positive_fixnum$.getGlobalValue() ) )
    {
      return T;
    }
    return constants_high.constant_external_id_L( ugly1, ugly2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 127523L)
  public static SubLObject ugly_thing_G(final SubLObject ugly1, final SubLObject ugly2)
  {
    return makeBoolean( NIL == ugly_thing_L( ugly1, ugly2 ) && !ugly1.equal( ugly2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 127725L)
  public static SubLObject last_resort_min_literals_max(final SubLObject literals)
  {
    SubLObject result = ConsesLow.list( literals.first() );
    SubLObject value = last_resort_min_literals_fn( result.first() );
    SubLObject cdolist_list_var = literals.rest();
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lit_value = last_resort_min_literals_fn( literal );
      if( NIL != ugly_thing_G( lit_value, value ) )
      {
        value = lit_value;
        result = ConsesLow.list( literal );
      }
      else if( lit_value.equal( value ) )
      {
        result = ConsesLow.cons( literal, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-main.lisp", position = 128155L)
  public static SubLObject last_resort_min_literals_fn(final SubLObject lit)
  {
    final SubLObject constants = cycl_utilities.expression_gather( lit, Symbols.symbol_function( $sym129$CONSTANT_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject value = constant_median( constants );
    if( NIL != constants_high.constant_external_id_p( value ) )
    {
      return value;
    }
    return Numbers.$most_positive_fixnum$.getGlobalValue();
  }

  public static SubLObject declare_czer_main_file()
  {
    SubLFiles.declareFunction( me, "el_to_hl", "EL-TO-HL", 1, 1, false );
    SubLFiles.declareFunction( me, "el_to_hl_query", "EL-TO-HL-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "el_to_hl_fast", "EL-TO-HL-FAST", 1, 1, false );
    SubLFiles.declareFunction( me, "el_to_hl_really_fast", "EL-TO-HL-REALLY-FAST", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_term", "CANONICALIZE-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_term_memoized", "CANONICALIZE-TERM-MEMOIZED", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_term_memoized_int_internal", "CANONICALIZE-TERM-MEMOIZED-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_term_memoized_int", "CANONICALIZE-TERM-MEMOIZED-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_term_assert", "CANONICALIZE-TERM-ASSERT", 1, 1, false );
    SubLFiles.declareFunction( me, "coerce_to_fort", "COERCE-TO-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_gaf", "CANONICALIZE-GAF", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_wf_gaf", "CANONICALIZE-WF-GAF", 2, 0, false );
    SubLFiles.declareFunction( me, "ncanonicalize_cycl", "NCANONICALIZE-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_cycl", "CANONICALIZE-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_cycl_int", "CANONICALIZE-CYCL-INT", 1, 5, false );
    SubLFiles.declareFunction( me, "clothe_naked_skolems", "CLOTHE-NAKED-SKOLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "czer_result_quiescedP", "CZER-RESULT-QUIESCED?", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_cycl_sentence", "CANONICALIZE-CYCL-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_cycl_test", "CANONICALIZE-CYCL-TEST", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_wf_cycl", "CANONICALIZE-WF-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_wf_cycl_memoized", "CANONICALIZE-WF-CYCL-MEMOIZED", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_wf_cycl_int_memoized_internal", "CANONICALIZE-WF-CYCL-INT-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_wf_cycl_int_memoized", "CANONICALIZE-WF-CYCL-INT-MEMOIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_wf_cycl_sentence", "CANONICALIZE-WF-CYCL-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_ask_memoized", "CANONICALIZE-ASK-MEMOIZED", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_ask_int_memoized_internal", "CANONICALIZE-ASK-INT-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_ask_int_memoized", "CANONICALIZE-ASK-INT-MEMOIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_ask", "CANONICALIZE-ASK", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_ask_mt", "CANONICALIZE-ASK-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_ask_sentence", "CANONICALIZE-ASK-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_assert", "CANONICALIZE-ASSERT", 1, 1, false );
    SubLFiles.declareFunction( me, "test_canonicalize_assert", "TEST-CANONICALIZE-ASSERT", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_assert_mt", "CANONICALIZE-ASSERT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_mt", "CANONICALIZE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_assert_sentence", "CANONICALIZE-ASSERT-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "test_canonicalize_assert_sentence", "TEST-CANONICALIZE-ASSERT-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_wf_assert_sentence", "CANONICALIZE-WF-ASSERT-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_unassert", "CANONICALIZE-UNASSERT", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_unassert_sentence", "CANONICALIZE-UNASSERT-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "ncanonicalize_query", "NCANONICALIZE-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_query", "CANONICALIZE-QUERY", 1, 3, false );
    SubLFiles.declareFunction( me, "canonicalize_query_sentence", "CANONICALIZE-QUERY-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_expression", "CANONICALIZE-EXPRESSION", 1, 2, false );
    SubLFiles.declareFunction( me, "clausify_eliminating_ists", "CLAUSIFY-ELIMINATING-ISTS", 4, 0, false );
    SubLFiles.declareFunction( me, "remove_newly_introduced_variables_from_bindings", "REMOVE-NEWLY-INTRODUCED-VARIABLES-FROM-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_canon_caches", "CLEAR-CANON-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "canon_wffP", "CANON-WFF?", 1, 1, false );
    SubLFiles.declareFunction( me, "check_wff_arityP", "CHECK-WFF-ARITY?", 0, 0, false );
    SubLFiles.declareFunction( me, "check_wff_semanticsP", "CHECK-WFF-SEMANTICS?", 0, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_clauses_terms", "CANONICALIZE-CLAUSES-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_clauses_quoted_terms", "CANONICALIZE-CLAUSES-QUOTED-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_clause_quoted_terms", "CANONICALIZE-CLAUSE-QUOTED-TERMS", 1, 0, false );
    new $canonicalize_clause_quoted_terms$UnaryFunction();
    SubLFiles.declareFunction( me, "canonicalize_literals_quoted_terms", "CANONICALIZE-LITERALS-QUOTED-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_literal_quoted_terms_recursive", "CANONICALIZE-LITERAL-QUOTED-TERMS-RECURSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_quoted_term", "CANONICALIZE-QUOTED-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "unquote_quoted_term", "UNQUOTE-QUOTED-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_clauses_sentence_terms", "CANONICALIZE-CLAUSES-SENTENCE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_no_sentence_argsP", "CANONICALIZE-NO-SENTENCE-ARGS?", 0, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_clause_sentence_terms", "CANONICALIZE-CLAUSE-SENTENCE-TERMS", 1, 0, false );
    new $canonicalize_clause_sentence_terms$UnaryFunction();
    SubLFiles.declareFunction( me, "unnegate_and_flip_negated_lits", "UNNEGATE-AND-FLIP-NEGATED-LITS", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_literal_sentence_terms", "CANONICALIZE-LITERAL-SENTENCE-TERMS", 1, 1, false );
    new $canonicalize_literal_sentence_terms$UnaryFunction();
    new $canonicalize_literal_sentence_terms$BinaryFunction();
    SubLFiles.declareFunction( me, "canonicalize_function_sentence_terms", "CANONICALIZE-FUNCTION-SENTENCE-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_relation_sentence_terms", "CANONICALIZE-RELATION-SENTENCE-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_clauses_commutative_terms_destructive", "CANONICALIZE-CLAUSES-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_clause_commutative_terms", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_clause_commutative_terms_destructive", "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false );
    new $canonicalize_clause_commutative_terms_destructive$UnaryFunction();
    SubLFiles.declareFunction( me, "never_commutative_gaf_clauseP", "NEVER-COMMUTATIVE-GAF-CLAUSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_literals_commutative_terms", "CANONICALIZE-LITERALS-COMMUTATIVE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_literal_commutative_terms", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_literal_commutative_terms_destructive", "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false );
    new $canonicalize_literal_commutative_terms_destructive$UnaryFunction();
    SubLFiles.declareFunction( me, "canonicalize_literal_commutative_args", "CANONICALIZE-LITERAL-COMMUTATIVE-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "order_commutative_terms", "ORDER-COMMUTATIVE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_terms_commutative_terms_without_reordering", "CANONICALIZE-TERMS-COMMUTATIVE-TERMS-WITHOUT-REORDERING", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_term_commutative_terms", "CANONICALIZE-TERM-COMMUTATIVE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "unary_function_commutes_with_its_argumentP", "UNARY-FUNCTION-COMMUTES-WITH-ITS-ARGUMENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_commuting_function", "CANONICALIZE-COMMUTING-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_nat_commutative_terms", "CANONICALIZE-NAT-COMMUTATIVE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_relation_commutative_terms", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_relation_commutative_terms_destructive", "CANONICALIZE-RELATION-COMMUTATIVE-TERMS-DESTRUCTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_relation_commutative_terms", "SORT-RELATION-COMMUTATIVE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_partially_commutative_terms", "SORT-PARTIALLY-COMMUTATIVE-TERMS", 3, 0, false );
    SubLFiles.declareFunction( me, "commutative_argnums", "COMMUTATIVE-ARGNUMS", 1, 0, false );
    SubLFiles.declareFunction( me, "ok_wrt_partial_commutativityP", "OK-WRT-PARTIAL-COMMUTATIVITY?", 3, 0, false );
    SubLFiles.declareFunction( me, "partially_commutative_argnums", "PARTIALLY-COMMUTATIVE-ARGNUMS", 2, 0, false );
    SubLFiles.declareFunction( me, "partially_commutative_argnums_int", "PARTIALLY-COMMUTATIVE-ARGNUMS-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "cia_formulas", "CIA-FORMULAS", 1, 1, false );
    SubLFiles.declareFunction( me, "commutative_terms_in_orderP", "COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false );
    new $commutative_terms_in_orderP$BinaryFunction();
    SubLFiles.declareFunction( me, "commutative_formulas_in_orderP", "COMMUTATIVE-FORMULAS-IN-ORDER?", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalizer_constant_L", "CANONICALIZER-CONSTANT-<", 2, 0, false );
    SubLFiles.declareFunction( me, "commutative_atoms_in_orderP", "COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false );
    SubLFiles.declareFunction( me, "canon_term_L", "CANON-TERM-<", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_functions_in_clause", "CANONICALIZE-FUNCTIONS-IN-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_functions", "CANONICALIZE-FUNCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_term_of_unit_lits", "ADD-TERM-OF-UNIT-LITS", 1, 0, false );
    SubLFiles.declareFunction( me, "clauses_free_variables", "CLAUSES-FREE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "add_term_of_unit_lits_1", "ADD-TERM-OF-UNIT-LITS-1", 1, 0, false );
    SubLFiles.declareFunction( me, "equal_wrt_svm", "EQUAL-WRT-SVM", 2, 0, false );
    SubLFiles.declareFunction( me, "reifiable_function_term_in_clauseP", "REIFIABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false );
    SubLFiles.declareFunction( me, "evaluatable_function_term_in_clauseP", "EVALUATABLE-FUNCTION-TERM-IN-CLAUSE?", 2, 1, false );
    SubLFiles.declareFunction( me, "czer_create_nartP", "CZER-CREATE-NART?", 1, 0, false );
    SubLFiles.declareFunction( me, "czer_create_nartsP", "CZER-CREATE-NARTS?", 0, 0, false );
    SubLFiles.declareFunction( me, "reify_relation_functions_in_mt_list", "REIFY-RELATION-FUNCTIONS-IN-MT-LIST", 2, 1, false );
    SubLFiles.declareFunction( me, "reify_relation_functions", "REIFY-RELATION-FUNCTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "reify_relation_functions_in", "REIFY-RELATION-FUNCTIONS-IN", 3, 0, false );
    SubLFiles.declareFunction( me, "reify_relation_function_in", "REIFY-RELATION-FUNCTION-IN", 3, 0, false );
    SubLFiles.declareFunction( me, "reify_functions_in_mt", "REIFY-FUNCTIONS-IN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "reify_functions", "REIFY-FUNCTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "reify_functions_in", "REIFY-FUNCTIONS-IN", 2, 0, false );
    SubLFiles.declareFunction( me, "reify_function_in_fns", "REIFY-FUNCTION-IN-FNS", 2, 0, false );
    SubLFiles.declareFunction( me, "reify_function_in", "REIFY-FUNCTION-IN", 2, 0, false );
    SubLFiles.declareFunction( me, "reify_function_in_destructive", "REIFY-FUNCTION-IN-DESTRUCTIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_fn_term_if_reified", "CANONICALIZE-FN-TERM-IF-REIFIED", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_fn_term_if_reified_destructive", "CANONICALIZE-FN-TERM-IF-REIFIED-DESTRUCTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_fn_term", "CANONICALIZE-FN-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_find_or_create_nart", "CYC-FIND-OR-CREATE-NART", 1, 1, false );
    SubLFiles.declareFunction( me, "low_find_or_create_nart", "LOW-FIND-OR-CREATE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_fn_term_int", "CANONICALIZE-FN-TERM-INT", 3, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_naut", "CANONICALIZE-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_find_or_create_canonical_nart", "CYC-FIND-OR-CREATE-CANONICAL-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_nart_defining_rules_cached", "CLEAR-NART-DEFINING-RULES-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_nart_defining_rules_cached", "REMOVE-NART-DEFINING-RULES-CACHED", 0, 1, false );
    SubLFiles.declareFunction( me, "nart_defining_rules_cached_internal", "NART-DEFINING-RULES-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_defining_rules_cached", "NART-DEFINING-RULES-CACHED", 0, 1, false );
    SubLFiles.declareFunction( me, "cyc_create_nart", "CYC-CREATE-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "new_canonicalize_fn_term", "NEW-CANONICALIZE-FN-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "new_nested_fn_terms", "NEW-NESTED-FN-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "nested_fn_terms", "NESTED-FN-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "all_nested_fn_terms", "ALL-NESTED-FN-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_sort_by_type_and_id", "FORT-SORT-BY-TYPE-AND-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_type_and_id_L", "FORT-TYPE-AND-ID-<", 2, 0, false );
    SubLFiles.declareFunction( me, "clause_quantified_fn_terms", "CLAUSE-QUANTIFIED-FN-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "literals_quantified_fn_terms", "LITERALS-QUANTIFIED-FN-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_quantified_fn_terms", "LITERAL-QUANTIFIED-FN-TERMS", 1, 0, false );
    new $literal_quantified_fn_terms$UnaryFunction();
    SubLFiles.declareFunction( me, "clause_terms_to_reify", "CLAUSE-TERMS-TO-REIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_terms_to_reify", "LITERAL-TERMS-TO-REIFY", 1, 1, false );
    new $literal_terms_to_reify$UnaryFunction();
    new $literal_terms_to_reify$BinaryFunction();
    SubLFiles.declareFunction( me, "function_terms_to_reify", "FUNCTION-TERMS-TO-REIFY", 1, 1, false );
    SubLFiles.declareFunction( me, "relation_terms_to_reify", "RELATION-TERMS-TO-REIFY", 1, 1, false );
    SubLFiles.declareFunction( me, "guaranteed_nothing_to_reifyP", "GUARANTEED-NOTHING-TO-REIFY?", 1, 0, false );
    SubLFiles.declareFunction( me, "reify_argP", "REIFY-ARG?", 3, 1, false );
    SubLFiles.declareFunction( me, "dont_reify_arg_or_subtermsP", "DONT-REIFY-ARG-OR-SUBTERMS?", 4, 0, false );
    SubLFiles.declareFunction( me, "reify_termP", "REIFY-TERM?", 1, 1, false );
    SubLFiles.declareFunction( me, "forward_inference_reifiable_function_termP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION-TERM?", 1, 1, false );
    SubLFiles.declareFunction( me, "forward_inference_reifiable_functionP", "FORWARD-INFERENCE-REIFIABLE-FUNCTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "subst_canon_fn_in_clauses", "SUBST-CANON-FN-IN-CLAUSES", 3, 0, false );
    SubLFiles.declareFunction( me, "subst_canon_fn_in_clause", "SUBST-CANON-FN-IN-CLAUSE", 3, 0, false );
    SubLFiles.declareFunction( me, "subst_canon_fn_in_relation", "SUBST-CANON-FN-IN-RELATION", 3, 1, false );
    SubLFiles.declareFunction( me, "subst_canon_fn_in_literal", "SUBST-CANON-FN-IN-LITERAL", 3, 0, false );
    SubLFiles.declareFunction( me, "subst_canon_fn_in_nat", "SUBST-CANON-FN-IN-NAT", 3, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_clauses_transformable_nats", "CANONICALIZE-CLAUSES-TRANSFORMABLE-NATS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_clause_transformable_nats", "CANONICALIZE-CLAUSE-TRANSFORMABLE-NATS", 1, 0, false );
    SubLFiles.declareFunction( me, "nat_atoms", "NAT-ATOMS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_literals_transformable_nats", "CANONICALIZE-LITERALS-TRANSFORMABLE-NATS", 2, 0, false );
    SubLFiles.declareFunction( me, "nat_transforming_litP", "NAT-TRANSFORMING-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_nat_transforming_litP", "POSSIBLY-NAT-TRANSFORMING-LIT?", 1, 0, false );
    SubLFiles.declareFunction( me, "destructive_nat_transforming_litP", "DESTRUCTIVE-NAT-TRANSFORMING-LIT?", 2, 0, false );
    SubLFiles.declareFunction( me, "dwim_svm_wrt_scoping", "DWIM-SVM-WRT-SCOPING", 3, 0, false );
    SubLFiles.declareFunction( me, "var_is_scoped_in_literalP", "VAR-IS-SCOPED-IN-LITERAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "var_is_scoped_in_formulaP", "VAR-IS-SCOPED-IN-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_clauses_literals", "CANONICALIZE-CLAUSES-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_clauses", "SORT-CLAUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "clauses_in_orderP", "CLAUSES-IN-ORDER?", 2, 0, false );
    SubLFiles.declareFunction( me, "sort_clauses_literals", "SORT-CLAUSES-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_clause_literals", "SORT-CLAUSE-LITERALS", 1, 1, false );
    new $sort_clause_literals$UnaryFunction();
    new $sort_clause_literals$BinaryFunction();
    SubLFiles.declareFunction( me, "canonicalize_skolem_clause", "CANONICALIZE-SKOLEM-CLAUSE", 1, 1, false );
    SubLFiles.declareFunction( me, "sort_clause_literals_destructive", "SORT-CLAUSE-LITERALS-DESTRUCTIVE", 1, 1, false );
    SubLFiles.declareFunction( me, "tou_lits_at_rear", "TOU-LITS-AT-REAR", 1, 0, false );
    SubLFiles.declareFunction( me, "evaluate_lits_at_rear", "EVALUATE-LITS-AT-REAR", 1, 0, false );
    SubLFiles.declareFunction( me, "sort_literals", "SORT-LITERALS", 1, 4, false );
    SubLFiles.declareFunction( me, "pick_a_lit", "PICK-A-LIT", 1, 4, false );
    SubLFiles.declareFunction( me, "new_bound_vars", "NEW-BOUND-VARS", 1, 1, false );
    SubLFiles.declareFunction( me, "new_connected_vars", "NEW-CONNECTED-VARS", 1, 1, false );
    SubLFiles.declareFunction( me, "unbound_vars", "UNBOUND-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "most_constrained_literals", "MOST-CONSTRAINED-LITERALS", 1, 2, false );
    SubLFiles.declareFunction( me, "unbound_vars_score", "UNBOUND-VARS-SCORE", 2, 0, false );
    SubLFiles.declareFunction( me, "temp_unbound_vars_score", "TEMP-UNBOUND-VARS-SCORE", 2, 0, false );
    SubLFiles.declareFunction( me, "fewest_arg_literals", "FEWEST-ARG-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "left_weighted_literals", "LEFT-WEIGHTED-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "left_weighted_score", "LEFT-WEIGHTED-SCORE", 1, 1, false );
    SubLFiles.declareFunction( me, "n_left_weighted_score_weights", "N-LEFT-WEIGHTED-SCORE-WEIGHTS", 1, 1, false );
    SubLFiles.declareFunction( me, "left_connected_literals", "LEFT-CONNECTED-LITERALS", 1, 1, false );
    SubLFiles.declareFunction( me, "left_connected_score", "LEFT-CONNECTED-SCORE", 2, 0, false );
    SubLFiles.declareFunction( me, "left_rooted_literals", "LEFT-ROOTED-LITERALS", 1, 1, false );
    SubLFiles.declareFunction( me, "default_lit_sort", "DEFAULT-LIT-SORT", 1, 0, false );
    SubLFiles.declareFunction( me, "lit_L", "LIT-<", 2, 0, false );
    new $lit_L$BinaryFunction();
    SubLFiles.declareFunction( me, "pred_L", "PRED-<", 2, 0, false );
    SubLFiles.declareFunction( me, "left_rooted_literals_int", "LEFT-ROOTED-LITERALS-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "left_rooted_score", "LEFT-ROOTED-SCORE", 2, 1, false );
    SubLFiles.declareFunction( me, "max_scored_item", "MAX-SCORED-ITEM", 1, 2, false );
    SubLFiles.declareFunction( me, "least_complex_literals", "LEAST-COMPLEX-LITERALS", 1, 1, false );
    SubLFiles.declareFunction( me, "el_complexity_score", "EL-COMPLEXITY-SCORE", 1, 2, false );
    SubLFiles.declareFunction( me, "default_preference_lit", "DEFAULT-PREFERENCE-LIT", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_disjunctions_as_enumerations", "CANONICALIZE-DISJUNCTIONS-AS-ENUMERATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_clauses_variables", "CANONICALIZE-CLAUSES-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "rename_clauses_vars", "RENAME-CLAUSES-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "standardize_variable_memory_binding", "STANDARDIZE-VARIABLE-MEMORY-BINDING", 2, 0, false );
    SubLFiles.declareFunction( me, "el_nununiquifying_blist_wrt", "EL-NUNUNIQUIFYING-BLIST-WRT", 1, 2, false );
    SubLFiles.declareFunction( me, "el_nununiquify_vars_wrt_int", "EL-NUNUNIQUIFY-VARS-WRT-INT", 2, 2, false );
    SubLFiles.declareFunction( me, "el_nununiquify_vars_wrt", "EL-NUNUNIQUIFY-VARS-WRT", 2, 0, false );
    SubLFiles.declareFunction( me, "el_nununiquify_vars_int", "EL-NUNUNIQUIFY-VARS-INT", 1, 2, false );
    SubLFiles.declareFunction( me, "el_ununiquify_vars_int", "EL-UNUNIQUIFY-VARS-INT", 1, 2, false );
    SubLFiles.declareFunction( me, "el_nununiquify_vars", "EL-NUNUNIQUIFY-VARS", 1, 0, false );
    SubLFiles.declareFunction( me, "uniquify", "UNIQUIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "rename_clauses_vars_safe", "RENAME-CLAUSES-VARS-SAFE", 1, 0, false );
    SubLFiles.declareFunction( me, "rename_clause_vars", "RENAME-CLAUSE-VARS", 1, 1, false );
    SubLFiles.declareFunction( me, "rename_single_clause_vars_int", "RENAME-SINGLE-CLAUSE-VARS-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "rename_clause_vars_int", "RENAME-CLAUSE-VARS-INT", 2, 1, false );
    new $rename_clause_vars_int$BinaryFunction();
    SubLFiles.declareFunction( me, "lookup_closed_vars_from_standardize_variables_memory", "LOOKUP-CLOSED-VARS-FROM-STANDARDIZE-VARIABLES-MEMORY", 0, 0, false );
    SubLFiles.declareFunction( me, "blist_vars_among", "BLIST-VARS-AMONG", 2, 0, false );
    SubLFiles.declareFunction( me, "blist_vars_not_among", "BLIST-VARS-NOT-AMONG", 2, 0, false );
    SubLFiles.declareFunction( me, "all_bindings", "ALL-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "clause_el_variables", "CLAUSE-EL-VARIABLES", 1, 1, false );
    SubLFiles.declareFunction( me, "initialize_symbol_suffix_table", "INITIALIZE-SYMBOL-SUFFIX-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_suffix_table_for_var", "INITIALIZE-SUFFIX-TABLE-FOR-VAR", 1, 0, false );
    new $initialize_suffix_table_for_var$UnaryFunction();
    SubLFiles.declareFunction( me, "extract_name_uniquifying_post_hyphen_integer", "EXTRACT-NAME-UNIQUIFYING-POST-HYPHEN-INTEGER", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_clauses", "CANONICALIZE-CLAUSES", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_query_clauses", "CANONICALIZE-QUERY-CLAUSES", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_clauses_int", "CANONICALIZE-CLAUSES-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "canon_fast_clausesP", "CANON-FAST-CLAUSES?", 1, 0, false );
    SubLFiles.declareFunction( me, "unwrap_clauses_if_ist_permissive", "UNWRAP-CLAUSES-IF-IST-PERMISSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "lift_clauses_if_decontextualized", "LIFT-CLAUSES-IF-DECONTEXTUALIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "clauses_syntactic_wff_check", "CLAUSES-SYNTACTIC-WFF-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "psc_queryP", "PSC-QUERY?", 0, 1, false );
    SubLFiles.declareFunction( me, "canonicalizer_problemP", "CANONICALIZER-PROBLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "tl_canonicalizer_problemP", "TL-CANONICALIZER-PROBLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "terms_reorder_equalP", "TERMS-REORDER-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "cnfs_reorder_tou_equalP", "CNFS-REORDER-TOU-EQUAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "unique_arity_literal", "UNIQUE-ARITY-LITERAL", 1, 0, false );
    SubLFiles.declareFunction( me, "unique_list_structure_literal", "UNIQUE-LIST-STRUCTURE-LITERAL", 1, 0, false );
    SubLFiles.declareFunction( me, "old_last_resort_literal", "OLD-LAST-RESORT-LITERAL", 1, 2, false );
    SubLFiles.declareFunction( me, "alphabetically_minimal_literal", "ALPHABETICALLY-MINIMAL-LITERAL", 1, 2, false );
    SubLFiles.declareFunction( me, "new_alphabetically_minimal_literal_int", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT", 1, 2, false );
    SubLFiles.declareFunction( me, "new_alphabetically_minimal_literal_int_2", "NEW-ALPHABETICALLY-MINIMAL-LITERAL-INT-2", 1, 1, false );
    SubLFiles.declareFunction( me, "old_commutative_terms_in_orderP", "OLD-COMMUTATIVE-TERMS-IN-ORDER?", 2, 0, false );
    SubLFiles.declareFunction( me, "old_commutative_atoms_in_orderP", "OLD-COMMUTATIVE-ATOMS-IN-ORDER?", 2, 0, false );
    SubLFiles.declareFunction( me, "old_commutative_conses_in_orderP", "OLD-COMMUTATIVE-CONSES-IN-ORDER?", 2, 0, false );
    SubLFiles.declareFunction( me, "last_resort_min_literals", "LAST-RESORT-MIN-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "last_resort_min_literals_int", "LAST-RESORT-MIN-LITERALS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "last_resort_min_literals_min", "LAST-RESORT-MIN-LITERALS-MIN", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_median", "CONSTANT-MEDIAN", 1, 0, false );
    SubLFiles.declareFunction( me, "ugly_thing_L", "UGLY-THING-<", 2, 0, false );
    SubLFiles.declareFunction( me, "ugly_thing_G", "UGLY-THING->", 2, 0, false );
    SubLFiles.declareFunction( me, "last_resort_min_literals_max", "LAST-RESORT-MIN-LITERALS-MAX", 1, 0, false );
    SubLFiles.declareFunction( me, "last_resort_min_literals_fn", "LAST-RESORT-MIN-LITERALS-FN", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_czer_main_file()
  {
    $canonicalize_clause_sentence_terms_sense_lambda$ = SubLFiles.defparameter( "*CANONICALIZE-CLAUSE-SENTENCE-TERMS-SENSE-LAMBDA*", NIL );
    $never_commutative_predicates$ = SubLFiles.defparameter( "*NEVER-COMMUTATIVE-PREDICATES*", $list41 );
    $tou_skolem_blist$ = SubLFiles.defparameter( "*TOU-SKOLEM-BLIST*", $kw57$UNINITIALIZED );
    $nart_defining_rules_cached_caching_state$ = SubLFiles.deflexical( "*NART-DEFINING-RULES-CACHED-CACHING-STATE*", NIL );
    $czer_create_nart_uses_nart_defining_rules_methodP$ = SubLFiles.defparameter( "*CZER-CREATE-NART-USES-NART-DEFINING-RULES-METHOD?*", T );
    $var_is_scoped_in_formula_var$ = SubLFiles.defparameter( "*VAR-IS-SCOPED-IN-FORMULA-VAR*", $kw57$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_czer_main_file()
  {
    utilities_macros.register_cyc_api_function( $sym1$EL_TO_HL, $list2, $str3$Translate_el_expression_FORMULA_i, $list4, NIL );
    utilities_macros.register_cyc_api_function( $sym5$EL_TO_HL_QUERY, $list2, $str6$Translate_el_query_FORMULA_into_i, $list4, NIL );
    utilities_macros.register_cyc_api_function( $sym7$CANONICALIZE_TERM, $list8, $str9$Converts_the_EL_term_TERM_to_its_, NIL, NIL );
    memoization_state.note_memoized_function( $sym10$CANONICALIZE_TERM_MEMOIZED_INT );
    memoization_state.note_memoized_function( $sym21$CANONICALIZE_WF_CYCL_INT_MEMOIZED );
    memoization_state.note_memoized_function( $sym22$CANONICALIZE_ASK_INT_MEMOIZED );
    memoization_state.note_globally_cached_function( $sym74$NART_DEFINING_RULES_CACHED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_czer_main_file();
  }

  @Override
  public void initializeVariables()
  {
    init_czer_main_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_czer_main_file();
  }
  static
  {
    me = new czer_main();
    $canonicalize_clause_sentence_terms_sense_lambda$ = null;
    $never_commutative_predicates$ = null;
    $tou_skolem_blist$ = null;
    $nart_defining_rules_cached_caching_state$ = null;
    $czer_create_nart_uses_nart_defining_rules_methodP$ = null;
    $var_is_scoped_in_formula_var$ = null;
    $sym0$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $sym1$EL_TO_HL = makeSymbol( "EL-TO-HL" );
    $list2 = ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $str3$Translate_el_expression_FORMULA_i = makeString( "Translate el expression FORMULA into its equivalent canonical hl expressions" );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "EL-FORMULA-P" ) ) );
    $sym5$EL_TO_HL_QUERY = makeSymbol( "EL-TO-HL-QUERY" );
    $str6$Translate_el_query_FORMULA_into_i = makeString( "Translate el query FORMULA into its equivalent hl expressions" );
    $sym7$CANONICALIZE_TERM = makeSymbol( "CANONICALIZE-TERM" );
    $list8 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "*MT*" ) ) );
    $str9$Converts_the_EL_term_TERM_to_its_ = makeString( "Converts the EL term TERM to its canonical HL representation.\n   @return HL term" );
    $sym10$CANONICALIZE_TERM_MEMOIZED_INT = makeSymbol( "CANONICALIZE-TERM-MEMOIZED-INT" );
    $sym11$FORT_P = makeSymbol( "FORT-P" );
    $str12$czer_memoization_state = makeString( "czer memoization state" );
    $sym13$CANON_WFF_ = makeSymbol( "CANON-WFF?" );
    $kw14$CNF = makeKeyword( "CNF" );
    $sym15$FAST_REIFIED_SKOLEM_ = makeSymbol( "FAST-REIFIED-SKOLEM?" );
    $const16$skolem = constant_handles.reader_make_constant_shell( makeString( "skolem" ) );
    $const17$termDependsOn = constant_handles.reader_make_constant_shell( makeString( "termDependsOn" ) );
    $const18$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $sym19$SKOLEM_FUNCTION_P = makeSymbol( "SKOLEM-FUNCTION-P" );
    $sym20$CYCL_GENERALIZED_TENSED_LITERAL_P = makeSymbol( "CYCL-GENERALIZED-TENSED-LITERAL-P" );
    $sym21$CANONICALIZE_WF_CYCL_INT_MEMOIZED = makeSymbol( "CANONICALIZE-WF-CYCL-INT-MEMOIZED" );
    $sym22$CANONICALIZE_ASK_INT_MEMOIZED = makeSymbol( "CANONICALIZE-ASK-INT-MEMOIZED" );
    $sym23$EL_WFF_SYNTAX_ = makeSymbol( "EL-WFF-SYNTAX?" );
    $kw24$DNF = makeKeyword( "DNF" );
    $str25$Unknown_clausal_form__s = makeString( "Unknown clausal form ~s" );
    $sym26$CANONICALIZE_CLAUSE_QUOTED_TERMS = makeSymbol( "CANONICALIZE-CLAUSE-QUOTED-TERMS" );
    $sym27$ESCAPE_QUOTE_SYNTAX_P = makeSymbol( "ESCAPE-QUOTE-SYNTAX-P" );
    $sym28$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $sym29$QUASI_QUOTE_SYNTAX_P = makeSymbol( "QUASI-QUOTE-SYNTAX-P" );
    $const30$Quote = constant_handles.reader_make_constant_shell( makeString( "Quote" ) );
    $const31$EscapeQuote = constant_handles.reader_make_constant_shell( makeString( "EscapeQuote" ) );
    $sym32$FAST_ESCAPE_QUOTE_TERM_P = makeSymbol( "FAST-ESCAPE-QUOTE-TERM-P" );
    $sym33$FORMULA_ARG1 = makeSymbol( "FORMULA-ARG1" );
    $sym34$CANONICALIZE_CLAUSE_SENTENCE_TERMS = makeSymbol( "CANONICALIZE-CLAUSE-SENTENCE-TERMS" );
    $kw35$NEG = makeKeyword( "NEG" );
    $sym36$CANONICALIZE_LITERAL_SENTENCE_TERMS = makeSymbol( "CANONICALIZE-LITERAL-SENTENCE-TERMS" );
    $kw37$POS = makeKeyword( "POS" );
    $sym38$EL_NEGATION_P = makeSymbol( "EL-NEGATION-P" );
    $str39$Tried_to_canonicalize_the_formula = makeString( "Tried to canonicalize the formula terms of ~A, but it did not have the syntax of an EL relation." );
    $sym40$CANONICALIZE_CLAUSE_COMMUTATIVE_TERMS_DESTRUCTIVE = makeSymbol( "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE" );
    $list41 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $sym42$CANONICALIZE_LITERAL_COMMUTATIVE_TERMS_DESTRUCTIVE = makeSymbol( "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE" );
    $sym43$COMMUTATIVE_TERMS_IN_ORDER_ = makeSymbol( "COMMUTATIVE-TERMS-IN-ORDER?" );
    $kw44$HELLO_YOU_SILLY_COMPILER = makeKeyword( "HELLO-YOU-SILLY-COMPILER" );
    $kw45$IGNORE = makeKeyword( "IGNORE" );
    $kw46$DUMMY = makeKeyword( "DUMMY" );
    $const47$commutativeInArgsAndRest = constant_handles.reader_make_constant_shell( makeString( "commutativeInArgsAndRest" ) );
    $kw48$TOO_MANY_COMMUTATIVE_IN_ARGS_AND_REST = makeKeyword( "TOO-MANY-COMMUTATIVE-IN-ARGS-AND-REST" );
    $kw49$CYCLIC_COMMUTATIVE_IN_ARGS = makeKeyword( "CYCLIC-COMMUTATIVE-IN-ARGS" );
    $sym50$_ = makeSymbol( "<" );
    $const51$commutativeInArgs = constant_handles.reader_make_constant_shell( makeString( "commutativeInArgs" ) );
    $sym52$GAF_FORMULA = makeSymbol( "GAF-FORMULA" );
    $sym53$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym54$ATOM = makeSymbol( "ATOM" );
    $str55$warning__trying_to_sort_the_varia = makeString( "warning: trying to sort the variables ~A and ~A~%" );
    $str56$warning__trying_to_string_sort_th = makeString( "warning: trying to string-sort the atoms ~A and ~A~%" );
    $kw57$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym58$ADD_TERM_OF_UNIT_LITS_1 = makeSymbol( "ADD-TERM-OF-UNIT-LITS-1" );
    $sym59$STR = makeSymbol( "STR" );
    $sym60$EQUAL_WRT_SVM = makeSymbol( "EQUAL-WRT-SVM" );
    $const61$ReifiableFunction = constant_handles.reader_make_constant_shell( makeString( "ReifiableFunction" ) );
    $const62$CycLReifiableDenotationalTerm = constant_handles.reader_make_constant_shell( makeString( "CycLReifiableDenotationalTerm" ) );
    $const63$EvaluatableFunction = constant_handles.reader_make_constant_shell( makeString( "EvaluatableFunction" ) );
    $sym64$_EXIT = makeSymbol( "%EXIT" );
    $sym65$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" );
    $str66$Tried_to_reify_functions_within__ = makeString( "Tried to reify functions within ~A, but it was not a relation expression." );
    $sym67$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym68$CLAUSE_TERMS_TO_REIFY = makeSymbol( "CLAUSE-TERMS-TO-REIFY" );
    $sym69$TERM_RELATIONAL_COMPLEXITY = makeSymbol( "TERM-RELATIONAL-COMPLEXITY" );
    $kw70$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword( "TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE" );
    $kw71$TOO_MANY_SEQUENCE_VARS_IN_SCOPE_OF_SKOLEM = makeKeyword( "TOO-MANY-SEQUENCE-VARS-IN-SCOPE-OF-SKOLEM" );
    $sym72$_ = makeSymbol( ">" );
    $sym73$TERM_FUNCTIONAL_COMPLEXITY = makeSymbol( "TERM-FUNCTIONAL-COMPLEXITY" );
    $sym74$NART_DEFINING_RULES_CACHED = makeSymbol( "NART-DEFINING-RULES-CACHED" );
    $const75$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $kw76$FORWARD = makeKeyword( "FORWARD" );
    $kw77$RULE = makeKeyword( "RULE" );
    $const78$WFFConstraintPredicate = constant_handles.reader_make_constant_shell( makeString( "WFFConstraintPredicate" ) );
    $list79 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "natFunction" ) ), constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) ) );
    $sym80$_NART_DEFINING_RULES_CACHED_CACHING_STATE_ = makeSymbol( "*NART-DEFINING-RULES-CACHED-CACHING-STATE*" );
    $sym81$TL_FIND_OR_CREATE_NART = makeSymbol( "TL-FIND-OR-CREATE-NART" );
    $const82$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $list83 = ConsesLow.list( makeKeyword( "STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DIRECTION" ), makeKeyword( "FORWARD" ) );
    $kw84$TRUE = makeKeyword( "TRUE" );
    $kw85$MONOTONIC = makeKeyword( "MONOTONIC" );
    $str86$SORT_BY_ID_called_on_list_contain = makeString( "SORT-BY-ID called on list containing non-forts" );
    $sym87$FORT_TYPE_AND_ID__ = makeSymbol( "FORT-TYPE-AND-ID-<" );
    $sym88$LITERAL_QUANTIFIED_FN_TERMS = makeSymbol( "LITERAL-QUANTIFIED-FN-TERMS" );
    $sym89$NO_FREE_VARIABLES_ = makeSymbol( "NO-FREE-VARIABLES?" );
    $sym90$LITERAL_TERMS_TO_REIFY = makeSymbol( "LITERAL-TERMS-TO-REIFY" );
    $const91$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $const92$ExpandSubLFn = constant_handles.reader_make_constant_shell( makeString( "ExpandSubLFn" ) );
    $const93$SubLQuoteFn = constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) );
    $sym94$CANONICALIZE_CLAUSE_TRANSFORMABLE_NATS = makeSymbol( "CANONICALIZE-CLAUSE-TRANSFORMABLE-NATS" );
    $list95 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "NAT" ) );
    $sym96$CAR = makeSymbol( "CAR" );
    $list97 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) ), constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ) );
    $list98 = ConsesLow.cons( makeSymbol( "OLD-VAR" ), makeSymbol( "NEW-VAR" ) );
    $sym99$VAR_IS_SCOPED_IN_FORMULA_ = makeSymbol( "VAR-IS-SCOPED-IN-FORMULA?" );
    $sym100$CLAUSES_IN_ORDER_ = makeSymbol( "CLAUSES-IN-ORDER?" );
    $sym101$SORT_CLAUSE_LITERALS = makeSymbol( "SORT-CLAUSE-LITERALS" );
    $sym102$NEGATE_ATOMIC = makeSymbol( "NEGATE-ATOMIC" );
    $str103$most_constrained_literals_succeed = makeString( "most-constrained-literals succeeded!" );
    $str104$fewest_arg_literals_succeeded_ = makeString( "fewest-arg-literals succeeded!" );
    $str105$left_weighted_literals_succeeded_ = makeString( "left-weighted-literals succeeded!" );
    $str106$left_connected_literals_succeeded = makeString( "left-connected-literals succeeded!" );
    $str107$left_rooted_literals_succeeded_ = makeString( "left-rooted-literals succeeded!" );
    $str108$least_complex_literals_succeeded_ = makeString( "least-complex-literals succeeded!" );
    $str109$penultimate_resort_literals_1_suc = makeString( "penultimate-resort-literals-1 succeeded!" );
    $str110$penultimate_resort_literals_2_suc = makeString( "penultimate-resort-literals-2 succeeded!" );
    $float111$0_1 = makeDouble( 0.1 );
    $sym112$LIT__ = makeSymbol( "LIT-<" );
    $str113$Got_a_fort_that_was_neither_a_nar = makeString( "Got a fort that was neither a nart nor a constant.  It was one of these: ~a or ~a" );
    $str114$_s_is_not_an_element_of__s = makeString( "~s is not an element of ~s" );
    $sym115$CDR = makeSymbol( "CDR" );
    $int116$1000 = makeInteger( 1000 );
    $int117$100 = makeInteger( 100 );
    $float118$0_9 = makeDouble( 0.9 );
    $int119$10000 = makeInteger( 10000 );
    $sym120$CANON_VAR_ = makeSymbol( "CANON-VAR?" );
    $sym121$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $str122$_s_treated_as_variable_in_rename_ = makeString( "~s treated as variable in rename-clause-vars" );
    $sym123$NOT_DIGIT_CHAR_P = makeSymbol( "NOT-DIGIT-CHAR-P" );
    $sym124$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym125$MIN = makeSymbol( "MIN" );
    $sym126$LIST_STRUCTURE = makeSymbol( "LIST-STRUCTURE" );
    $sym127$FALSE = makeSymbol( "FALSE" );
    $sym128$CONSTANT_EXTERNAL_ID__ = makeSymbol( "CONSTANT-EXTERNAL-ID-<" );
    $sym129$CONSTANT_P = makeSymbol( "CONSTANT-P" );
  }

  public static final class $canonicalize_clause_quoted_terms$UnaryFunction
      extends
        UnaryFunction
  {
    public $canonicalize_clause_quoted_terms$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CANONICALIZE-CLAUSE-QUOTED-TERMS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return canonicalize_clause_quoted_terms( arg1 );
    }
  }

  public static final class $canonicalize_clause_sentence_terms$UnaryFunction
      extends
        UnaryFunction
  {
    public $canonicalize_clause_sentence_terms$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CANONICALIZE-CLAUSE-SENTENCE-TERMS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return canonicalize_clause_sentence_terms( arg1 );
    }
  }

  public static final class $canonicalize_literal_sentence_terms$UnaryFunction
      extends
        UnaryFunction
  {
    public $canonicalize_literal_sentence_terms$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CANONICALIZE-LITERAL-SENTENCE-TERMS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return canonicalize_literal_sentence_terms( arg1, $canonicalize_literal_sentence_terms$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $canonicalize_literal_sentence_terms$BinaryFunction
      extends
        BinaryFunction
  {
    public $canonicalize_literal_sentence_terms$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CANONICALIZE-LITERAL-SENTENCE-TERMS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return canonicalize_literal_sentence_terms( arg1, arg2 );
    }
  }

  public static final class $canonicalize_clause_commutative_terms_destructive$UnaryFunction
      extends
        UnaryFunction
  {
    public $canonicalize_clause_commutative_terms_destructive$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CANONICALIZE-CLAUSE-COMMUTATIVE-TERMS-DESTRUCTIVE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return canonicalize_clause_commutative_terms_destructive( arg1 );
    }
  }

  public static final class $canonicalize_literal_commutative_terms_destructive$UnaryFunction
      extends
        UnaryFunction
  {
    public $canonicalize_literal_commutative_terms_destructive$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CANONICALIZE-LITERAL-COMMUTATIVE-TERMS-DESTRUCTIVE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return canonicalize_literal_commutative_terms_destructive( arg1 );
    }
  }

  public static final class $commutative_terms_in_orderP$BinaryFunction
      extends
        BinaryFunction
  {
    public $commutative_terms_in_orderP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "COMMUTATIVE-TERMS-IN-ORDER?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return commutative_terms_in_orderP( arg1, arg2 );
    }
  }

  public static final class $literal_quantified_fn_terms$UnaryFunction
      extends
        UnaryFunction
  {
    public $literal_quantified_fn_terms$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LITERAL-QUANTIFIED-FN-TERMS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return literal_quantified_fn_terms( arg1 );
    }
  }

  public static final class $literal_terms_to_reify$UnaryFunction
      extends
        UnaryFunction
  {
    public $literal_terms_to_reify$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LITERAL-TERMS-TO-REIFY" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return literal_terms_to_reify( arg1, $literal_terms_to_reify$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $literal_terms_to_reify$BinaryFunction
      extends
        BinaryFunction
  {
    public $literal_terms_to_reify$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LITERAL-TERMS-TO-REIFY" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return literal_terms_to_reify( arg1, arg2 );
    }
  }

  public static final class $sort_clause_literals$UnaryFunction
      extends
        UnaryFunction
  {
    public $sort_clause_literals$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SORT-CLAUSE-LITERALS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sort_clause_literals( arg1, $sort_clause_literals$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $sort_clause_literals$BinaryFunction
      extends
        BinaryFunction
  {
    public $sort_clause_literals$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SORT-CLAUSE-LITERALS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return sort_clause_literals( arg1, arg2 );
    }
  }

  public static final class $lit_L$BinaryFunction
      extends
        BinaryFunction
  {
    public $lit_L$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LIT-<" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return lit_L( arg1, arg2 );
    }
  }

  public static final class $rename_clause_vars_int$BinaryFunction
      extends
        BinaryFunction
  {
    public $rename_clause_vars_int$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RENAME-CLAUSE-VARS-INT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return rename_clause_vars_int( arg1, arg2, $rename_clause_vars_int$BinaryFunction.UNPROVIDED );
    }
  }

  public static final class $initialize_suffix_table_for_var$UnaryFunction
      extends
        UnaryFunction
  {
    public $initialize_suffix_table_for_var$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INITIALIZE-SUFFIX-TABLE-FOR-VAR" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return initialize_suffix_table_for_var( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1590 ms
 * 
 */