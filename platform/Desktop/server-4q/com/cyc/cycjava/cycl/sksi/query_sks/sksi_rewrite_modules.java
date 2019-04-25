package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_rewrite;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_rewrite_modules
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_rewrite_modules";
  public static final String myFingerPrint = "b80ce26e7403cfe7c5f4b4150acedafe9125e95ced393b6196e97a768db312b4";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 895L)
  private static SubLSymbol $isa_genls_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 1065L)
  private static SubLSymbol $genl_preds_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 1349L)
  private static SubLSymbol $genl_inverse_rule$;
  private static final SubLSymbol $kw0$UNINITIALIZED;
  private static final SubLSymbol $sym1$_ISA_GENLS_RULE_;
  private static final SubLSymbol $sym2$_ISA_GENLS_RULE__INITIALIZER;
  private static final SubLList $list3;
  private static final SubLObject $const4$BaseKB;
  private static final SubLSymbol $sym5$_GENL_PREDS_RULE_;
  private static final SubLSymbol $sym6$_GENL_PREDS_RULE__INITIALIZER;
  private static final SubLList $list7;
  private static final SubLObject $const8$UniversalVocabularyMt;
  private static final SubLSymbol $sym9$_GENL_INVERSE_RULE_;
  private static final SubLSymbol $sym10$_GENL_INVERSE_RULE__INITIALIZER;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$SKSI_ISA_REWRITE_CHECK;
  private static final SubLList $list13;
  private static final SubLObject $const14$isa;
  private static final SubLSymbol $kw15$POS;
  private static final SubLSymbol $kw16$GENLS;
  private static final SubLObject $const17$genls;
  private static final SubLSymbol $kw18$SKSI_ISA_REWRITE_GENERATE;
  private static final SubLList $list19;
  private static final SubLSymbol $kw20$SKSI_GENLPREDS_REWRITE;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$GENLPREDS;
  private static final SubLObject $const23$genlPreds;
  private static final SubLSymbol $kw24$SKSI_GENLINVERSE_REWRITE;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P;
  private static final SubLSymbol $sym27$SENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_PRED_;
  private static final SubLObject $const28$genlInverse;
  private static final SubLSymbol $sym29$FIRST;
  private static final SubLList $list30;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 895L)
  public static SubLObject isa_genls_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list3, $const4$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 1065L)
  public static SubLObject genl_preds_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list7, $const8$UniversalVocabularyMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 1349L)
  public static SubLObject genl_inverse_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list11, $const4$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 2518L)
  public static SubLObject sksi_isa_rewrite_check_applicability_fn(final SubLObject asent)
  {
    if( NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP() )
    {
      return NIL;
    }
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return makeBoolean( NIL != sksi_removal_module_generation.isa_sks_term_to_cycl_term_mt_relevantP() && NIL != sksi_removal_module_generation.any_sks_term_spec_to_cycl_term_in_relevant_mtP( arg2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 2825L)
  public static SubLObject sksi_isa_rewrite_check_cost_fn(final SubLObject asent)
  {
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return Sequences.length( sksi_removal_module_generation.all_sksi_relevant_rewrite_specs_for_term( arg2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 2998L)
  public static SubLObject sksi_isa_rewrite_check_expand_fn(final SubLObject asent)
  {
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject new_arg2s = cdolist_list_var = sksi_removal_module_generation.all_sksi_relevant_rewrite_specs_for_term( arg2 );
    SubLObject new_arg2 = NIL;
    new_arg2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_asent = ConsesLow.list( $const14$isa, arg1, new_arg2 );
      final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( new_asent, $kw15$POS, inference_worker_rewrite.current_rewrite_mt() );
      final SubLObject supports = ConsesLow.list( arguments.make_hl_support( $kw16$GENLS, ConsesLow.list( $const17$genls, new_arg2, arg2 ), UNPROVIDED, UNPROVIDED ) );
      inference_worker_rewrite.rewrite_add_link( query, supports );
      cdolist_list_var = cdolist_list_var.rest();
      new_arg2 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 4805L)
  public static SubLObject sksi_isa_rewrite_generate_applicability_fn(final SubLObject asent)
  {
    if( NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP() )
    {
      return NIL;
    }
    return sksi_removal_module_generation.isa_sks_term_to_cycl_term_mt_relevantP();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 5014L)
  public static SubLObject sksi_isa_rewrite_generate_cost_fn(final SubLObject asent)
  {
    return Sequences.length( sksi_removal_module_generation.all_sksi_relevant_rewrite_isas() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 5143L)
  public static SubLObject sksi_isa_rewrite_generate_expand_fn(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject isas = cdolist_list_var = sksi_removal_module_generation.all_sksi_relevant_rewrite_isas();
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_asent = ConsesLow.list( $const14$isa, arg1, v_isa );
      final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( new_asent, $kw15$POS, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
      inference_worker_rewrite.restriction_rewrite_add_link( query, NIL );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 5503L)
  public static SubLObject sksi_isa_rewrite_generate_closure(final SubLObject asent)
  {
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject v_genls = Sequences.remove( arg2, genls.all_genls( arg2, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_genls;
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_query = ConsesLow.list( $const14$isa, arg1, genl );
      final SubLObject support = arguments.make_hl_support( $kw16$GENLS, ConsesLow.list( $const17$genls, arg2, genl ), UNPROVIDED, UNPROVIDED );
      final SubLObject supports = ConsesLow.list( support );
      result = ConsesLow.cons( ConsesLow.list( new_query, supports ), result );
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 6754L)
  public static SubLObject sksi_genlpreds_rewrite_applicability_fn(final SubLObject asent)
  {
    if( NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP() )
    {
      return NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    return makeBoolean( NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_mt_relevantP() && NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_spec_predP( pred ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 7056L)
  public static SubLObject sksi_genlpreds_rewrite_cost_fn(final SubLObject asent)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    return Sequences.length( sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_preds_for_pred( pred ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 7239L)
  public static SubLObject sksi_genlpreds_rewrite_expand_fn(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject args = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject spec_preds = cdolist_list_var = sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_preds_for_pred( pred );
    SubLObject spec_pred = NIL;
    spec_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject asent_$1 = el_utilities.make_el_formula( spec_pred, args, UNPROVIDED );
      if( NIL != wff.el_wffP( asent_$1, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( asent_$1, $kw15$POS, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
        final SubLObject supports = ConsesLow.list( arguments.make_hl_support( $kw22$GENLPREDS, ConsesLow.list( $const23$genlPreds, spec_pred, pred ), UNPROVIDED, UNPROVIDED ) );
        inference_worker_rewrite.rewrite_add_link( query, supports );
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_pred = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 8658L)
  public static SubLObject sksi_genlinverse_rewrite_applicability_fn(final SubLObject asent)
  {
    if( NIL == sksi_macros.sksi_slrm_genl_pred_and_genls_reasoning_onP() )
    {
      return NIL;
    }
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    return makeBoolean( NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_mt_relevantP() && ( NIL != sksi_removal_module_generation.any_sksi_meaning_sentence_spec_inverseP( pred )
        || NIL != sentence_contains_subsentence_with_commutative_meaning_sentence_predP( asent ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 9151L)
  public static SubLObject sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal(final SubLObject asent)
  {
    return cycl_utilities.expression_find_if( $sym27$SENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_PRED_, asent, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 9151L)
  public static SubLObject sentence_contains_subsentence_with_commutative_meaning_sentence_predP(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal( asent );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, ONE_INTEGER, NIL,
          EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, asent, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal( asent ) ) );
      memoization_state.caching_state_put( caching_state, asent, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 9368L)
  public static SubLObject sentence_with_commutative_meaning_sentence_predP(final SubLObject v_object)
  {
    return makeBoolean( NIL != cycl_grammar.cycl_sentence_p( v_object ) && NIL != fort_types_interface.isa_commutative_predicateP( cycl_utilities.formula_operator( v_object ), UNPROVIDED )
        && NIL != sksi_removal_module_generation.meaning_sentence_predP( cycl_utilities.formula_operator( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 9602L)
  public static SubLObject sksi_genlinverse_rewrite_cost_fn(final SubLObject asent)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject cost = Sequences.length( sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_inverses_for_pred( pred ) );
    if( NIL != sentence_contains_subsentence_with_commutative_meaning_sentence_predP( asent ) )
    {
      cost = Numbers.add( cost, Sequences.length( sksi_infrastructure_utilities.formula_commutative_permutations_memoized( asent, T, UNPROVIDED ) ) );
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-rewrite-modules.lisp", position = 9974L)
  public static SubLObject sksi_genlinverse_rewrite_expand_fn(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject args = ConsesLow.list( arg2, arg1 );
    final SubLObject spec_invs = sksi_removal_module_generation.all_sksi_relevant_rewrite_spec_inverses_for_pred( pred );
    SubLObject rewrite_queries = NIL;
    SubLObject cdolist_list_var = spec_invs;
    SubLObject spec_inv = NIL;
    spec_inv = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject new_asent = el_utilities.make_el_formula( spec_inv, args, UNPROVIDED );
      if( NIL != wff.el_wffP( new_asent, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject query = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( new_asent, $kw15$POS, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
        final SubLObject supports = ConsesLow.list( arguments.make_hl_support( $kw22$GENLPREDS, ConsesLow.list( $const28$genlInverse, spec_inv, pred ), UNPROVIDED, UNPROVIDED ) );
        rewrite_queries = ConsesLow.cons( ConsesLow.list( query, supports ), rewrite_queries );
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec_inv = cdolist_list_var.first();
    }
    final SubLObject commutative_pred = cycl_utilities.formula_operator( sentence_contains_subsentence_with_commutative_meaning_sentence_predP( asent ) );
    if( NIL != commutative_pred )
    {
      SubLObject cdolist_list_var2;
      final SubLObject commutative_permutations = cdolist_list_var2 = sksi_infrastructure_utilities.formula_commutative_permutations_memoized( asent, T, UNPROVIDED );
      SubLObject perm = NIL;
      perm = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( NIL != wff.el_wffP( perm, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject query2 = inference_datastructures_problem_query.asent_sense_and_mt_to_problem_query( perm, $kw15$POS, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
          final SubLObject supports2 = ConsesLow.list( arguments.make_hl_support( $kw22$GENLPREDS, ConsesLow.list( $const28$genlInverse, commutative_pred, commutative_pred ), UNPROVIDED, UNPROVIDED ) );
          rewrite_queries = ConsesLow.cons( ConsesLow.list( query2, supports2 ), rewrite_queries );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        perm = cdolist_list_var2.first();
      }
    }
    rewrite_queries = ( cdolist_list_var = list_utilities.fast_delete_duplicates( rewrite_queries, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym29$FIRST ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject query_supports_pair = NIL;
    query_supports_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = query_supports_pair;
      SubLObject query2 = NIL;
      SubLObject supports2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
      query2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
      supports2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        inference_worker_rewrite.rewrite_add_link( query2, supports2 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list30 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      query_supports_pair = cdolist_list_var.first();
    }
    return NIL;
  }

  public static SubLObject declare_sksi_rewrite_modules_file()
  {
    SubLFiles.declareFunction( me, "isa_genls_ruleX_initializer", "*ISA-GENLS-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "genl_preds_ruleX_initializer", "*GENL-PREDS-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "genl_inverse_ruleX_initializer", "*GENL-INVERSE-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_isa_rewrite_check_applicability_fn", "SKSI-ISA-REWRITE-CHECK-APPLICABILITY-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_isa_rewrite_check_cost_fn", "SKSI-ISA-REWRITE-CHECK-COST-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_isa_rewrite_check_expand_fn", "SKSI-ISA-REWRITE-CHECK-EXPAND-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_isa_rewrite_generate_applicability_fn", "SKSI-ISA-REWRITE-GENERATE-APPLICABILITY-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_isa_rewrite_generate_cost_fn", "SKSI-ISA-REWRITE-GENERATE-COST-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_isa_rewrite_generate_expand_fn", "SKSI-ISA-REWRITE-GENERATE-EXPAND-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_isa_rewrite_generate_closure", "SKSI-ISA-REWRITE-GENERATE-CLOSURE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_genlpreds_rewrite_applicability_fn", "SKSI-GENLPREDS-REWRITE-APPLICABILITY-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_genlpreds_rewrite_cost_fn", "SKSI-GENLPREDS-REWRITE-COST-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_genlpreds_rewrite_expand_fn", "SKSI-GENLPREDS-REWRITE-EXPAND-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_genlinverse_rewrite_applicability_fn", "SKSI-GENLINVERSE-REWRITE-APPLICABILITY-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_contains_subsentence_with_commutative_meaning_sentence_predP_internal", "SENTENCE-CONTAINS-SUBSENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_contains_subsentence_with_commutative_meaning_sentence_predP", "SENTENCE-CONTAINS-SUBSENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_with_commutative_meaning_sentence_predP", "SENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_genlinverse_rewrite_cost_fn", "SKSI-GENLINVERSE-REWRITE-COST-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_genlinverse_rewrite_expand_fn", "SKSI-GENLINVERSE-REWRITE-EXPAND-FN", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_rewrite_modules_file()
  {
    $isa_genls_rule$ = SubLFiles.defvar( "*ISA-GENLS-RULE*", $kw0$UNINITIALIZED );
    $genl_preds_rule$ = SubLFiles.defvar( "*GENL-PREDS-RULE*", $kw0$UNINITIALIZED );
    $genl_inverse_rule$ = SubLFiles.defvar( "*GENL-INVERSE-RULE*", $kw0$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_sksi_rewrite_modules_file()
  {
    utilities_macros.register_kb_variable_initialization( $sym1$_ISA_GENLS_RULE_, $sym2$_ISA_GENLS_RULE__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym5$_GENL_PREDS_RULE_, $sym6$_GENL_PREDS_RULE__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym9$_GENL_INVERSE_RULE_, $sym10$_GENL_INVERSE_RULE__INITIALIZER );
    inference_modules.inference_rewrite_module( $kw12$SKSI_ISA_REWRITE_CHECK, $list13 );
    inference_modules.inference_rewrite_module( $kw18$SKSI_ISA_REWRITE_GENERATE, $list19 );
    inference_modules.inference_rewrite_module( $kw20$SKSI_GENLPREDS_REWRITE, $list21 );
    inference_modules.inference_rewrite_module( $kw24$SKSI_GENLINVERSE_REWRITE, $list25 );
    memoization_state.note_memoized_function( $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_rewrite_modules_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_rewrite_modules_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_rewrite_modules_file();
  }
  static
  {
    me = new sksi_rewrite_modules();
    $isa_genls_rule$ = null;
    $genl_preds_rule$ = null;
    $genl_inverse_rule$ = null;
    $kw0$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym1$_ISA_GENLS_RULE_ = makeSymbol( "*ISA-GENLS-RULE*" );
    $sym2$_ISA_GENLS_RULE__INITIALIZER = makeSymbol( "*ISA-GENLS-RULE*-INITIALIZER" );
    $list3 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "transitiveViaArg" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
        .reader_make_constant_shell( makeString( "genls" ) ), TWO_INTEGER );
    $const4$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym5$_GENL_PREDS_RULE_ = makeSymbol( "*GENL-PREDS-RULE*" );
    $sym6$_GENL_PREDS_RULE__INITIALIZER = makeSymbol( "*GENL-PREDS-RULE*-INITIALIZER" );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "genlPreds" ) ), makeSymbol( "?SPEC" ), makeSymbol( "?GENL" ) ), ConsesLow.cons( makeSymbol( "?SPEC" ), makeSymbol( "?ARGS" ) ) ), ConsesLow.cons( makeSymbol( "?GENL" ),
            makeSymbol( "?ARGS" ) ) );
    $const8$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $sym9$_GENL_INVERSE_RULE_ = makeSymbol( "*GENL-INVERSE-RULE*" );
    $sym10$_GENL_INVERSE_RULE__INITIALIZER = makeSymbol( "*GENL-INVERSE-RULE*-INITIALIZER" );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "genlInverse" ) ), makeSymbol( "?SPEC-INV" ), makeSymbol( "?GENL" ) ), ConsesLow.list( makeSymbol( "?SPEC-INV" ), makeSymbol( "?ARG1" ), makeSymbol( "?ARG2" ) ) ),
        ConsesLow.list( makeSymbol( "?GENL" ), makeSymbol( "?ARG2" ), makeSymbol( "?ARG1" ) ) );
    $kw12$SKSI_ISA_REWRITE_CHECK = makeKeyword( "SKSI-ISA-REWRITE-CHECK" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "MODULE-SUBTYPE" ), makeKeyword( "SKSI" ), makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "SKSI-ISA-REWRITE-CHECK-APPLICABILITY-FN" ), makeKeyword(
            "COST" ), makeSymbol( "SKSI-ISA-REWRITE-CHECK-COST-FN" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "SKSI-ISA-REWRITE-CHECK-EXPAND-FN" ), makeKeyword(
                "REWRITE-SUPPORT" ), makeSymbol( "*ISA-GENLS-RULE*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "Rewrites #$isa literals into new #$isa literals which can be handled by SKSI lookup modules,\n    where the new arg2 is a spec of the old arg2.  This module implements the isa/genls rule\n    for all SKSI modules, where we want to check an isa relationship." ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$isa ?X #$GeographicalRegion) \n    --->\n    (#$isa ?X #$Country) \n    when we have a (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) meaning sentence." )
    } );
    $const14$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw15$POS = makeKeyword( "POS" );
    $kw16$GENLS = makeKeyword( "GENLS" );
    $const17$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw18$SKSI_ISA_REWRITE_GENERATE = makeKeyword( "SKSI-ISA-REWRITE-GENERATE" );
    $list19 = ConsesLow.list( new SubLObject[] { makeKeyword( "MODULE-SUBTYPE" ), makeKeyword( "SKSI" ), makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "VARIABLE" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "SKSI-ISA-REWRITE-GENERATE-APPLICABILITY-FN" ), makeKeyword(
            "COST" ), makeSymbol( "SKSI-ISA-REWRITE-GENERATE-COST-FN" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "SKSI-ISA-REWRITE-GENERATE-EXPAND-FN" ),
      makeKeyword( "REWRITE-CLOSURE" ), makeSymbol( "SKSI-ISA-REWRITE-GENERATE-CLOSURE" ), makeKeyword( "REWRITE-SUPPORT" ), makeSymbol( "*ISA-GENLS-RULE*" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "Rewrites #$isa literals into new #$isa literals which can be handled by SKSI lookup modules,\n    where the new arg2 appears in the arg2 position of an SKSI #$isa meaning sentence.  This \n    module implements the isa/genls rule for all SKSI modules, where we want to generate #$isa \n    relationships." ),
      makeKeyword( "EXAMPLE" ), makeString(
          "(#$isa (#$SchemaObjectFn <SCHEMA>) ?X) \n    ---> (restriction)\n    when we have a (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) meaning sentence, then\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$Country) \n    ---> (rewrites)\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$GeographicalRegion) \n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$SpatialThing) ...\n    (#$isa (#$SchemaObjectFn <SCHEMA>) #$Thing)" )
    } );
    $kw20$SKSI_GENLPREDS_REWRITE = makeKeyword( "SKSI-GENLPREDS-REWRITE" );
    $list21 = ConsesLow.list( new SubLObject[] { makeKeyword( "MODULE-SUBTYPE" ), makeKeyword( "SKSI" ), makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.cons( makeKeyword(
        "FORT" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "SKSI-GENLPREDS-REWRITE-APPLICABILITY-FN" ), makeKeyword( "COST" ), makeSymbol( "SKSI-GENLPREDS-REWRITE-COST-FN" ), makeKeyword(
            "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "SKSI-GENLPREDS-REWRITE-EXPAND-FN" ), makeKeyword( "REWRITE-SUPPORT" ), makeSymbol( "*GENL-PREDS-RULE*" ), makeKeyword(
                "DOCUMENTATION" ), makeString(
                    "Rewrites literals into new literals which can be handled by SKSI lookup modules,\n    where the new literals have predicates which are SKSI meaning sentence predicates,\n    and are spec-preds of the original literal predicate. This module implements \n    the genlPreds rule for all SKSI modules." ),
      makeKeyword( "EXAMPLE" ), makeString( "1.\n    (#$isa ?X ?Y)\n    --->\n    (#$ethnicity ?X ?Y)" )
    } );
    $kw22$GENLPREDS = makeKeyword( "GENLPREDS" );
    $const23$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $kw24$SKSI_GENLINVERSE_REWRITE = makeKeyword( "SKSI-GENLINVERSE-REWRITE" );
    $list25 = ConsesLow.list( new SubLObject[] { makeKeyword( "MODULE-SUBTYPE" ), makeKeyword( "SKSI" ), makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword(
        "FORT" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "SKSI-GENLINVERSE-REWRITE-APPLICABILITY-FN" ), makeKeyword( "COST" ), makeSymbol(
            "SKSI-GENLINVERSE-REWRITE-COST-FN" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "SKSI-GENLINVERSE-REWRITE-EXPAND-FN" ), makeKeyword( "REWRITE-SUPPORT" ),
      makeSymbol( "*GENL-INVERSE-RULE*" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "Rewrites literals into new literals which can be handled by SKSI lookup modules,\n    where the new literals have predicates which are SKSI meaning sentence predicates,\n    and are spec-inverses of the original literal predicate. This module implements \n    the genlInverse rule for all SKSI modules." ),
      makeKeyword( "EXAMPLE" ), makeString( "1.\n    (#$signifies ?STR ?PERS)\n    --->\n    (#$nameString ?PERS ?STR)\n   " )
    } );
    $sym26$SENTENCE_CONTAINS_SUBSENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_P = makeSymbol( "SENTENCE-CONTAINS-SUBSENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?" );
    $sym27$SENTENCE_WITH_COMMUTATIVE_MEANING_SENTENCE_PRED_ = makeSymbol( "SENTENCE-WITH-COMMUTATIVE-MEANING-SENTENCE-PRED?" );
    $const28$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $sym29$FIRST = makeSymbol( "FIRST" );
    $list30 = ConsesLow.list( makeSymbol( "QUERY" ), makeSymbol( "SUPPORTS" ) );
  }
}
/*
 * 
 * Total time: 231 ms
 * 
 */