package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class backward
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.backward";
  public static final String myFingerPrint = "7b3a06f44100f1e63f4d2d6fef6e95dbc8ccb36e4820f4b4f6d23749c8c1fbdd";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 712L)
  public static SubLSymbol $removal_add_node_method$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 913L)
  public static SubLSymbol $transformation_add_node_method$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1064L)
  public static SubLSymbol $transformation_early_removal_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1558L)
  private static SubLSymbol $inference_expand_new_children$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1905L)
  public static SubLSymbol $inference_expand_hl_module$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2250L)
  public static SubLSymbol $inference_expand_sense$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9753L)
  public static SubLSymbol $force_query_supports_in_forward_inferenceP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9959L)
  public static SubLSymbol $force_forward_mt_combos_computation_in_forward_inferenceP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10202L)
  public static SubLSymbol $debug_removal_add_node_helper_modify_supportsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13056L)
  private static SubLSymbol $removal_ask_query_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19613L)
  private static SubLSymbol $removal_ask_answers$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19784L)
  private static SubLSymbol $removal_ask_max_number$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19845L)
  private static SubLSymbol $removal_ask_disallows_indeterminate_termsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19927L)
  private static SubLSymbol $removal_ask_first_answer_elapsed_internal_real_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20017L)
  private static SubLSymbol $removal_ask_last_answer_elapsed_internal_real_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20106L)
  private static SubLSymbol $removal_ask_start_internal_real_time$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28832L)
  public static SubLSymbol $transformation_semantic_pruning_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29481L)
  private static SubLSymbol $forward_inference_pruning_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33322L)
  private static SubLSymbol $forward_asserted_sentence_pruning_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35668L)
  private static SubLSymbol $preds_with_assumed_extent$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41163L)
  private static SubLSymbol $literal_set_sense_table$;
  private static final SubLString $str0$The_legacy_harness_is_no_longer_s;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $sym2$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE;
  private static final SubLSymbol $sym3$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS;
  private static final SubLSymbol $sym4$REMOVAL_ASK_ADD_NODE;
  private static final SubLSymbol $sym5$SUPPORT_P;
  private static final SubLString $str6$Removing_invalid_support__S_from_;
  private static final SubLSymbol $sym7$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_;
  private static final SubLObject $const8$rewriteOf;
  private static final SubLSymbol $kw9$EQUALITY;
  private static final SubLSymbol $sym10$HAS_PREFERRED_REWRITE_TERM_;
  private static final SubLSymbol $sym11$PREFERRED_REWRITE_TERM;
  private static final SubLObject $const12$Now;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$OPAQUE;
  private static final SubLObject $const15$indexicalReferent;
  private static final SubLObject $const16$BaseKB;
  private static final SubLSymbol $sym17$ASSERTION_P;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$QUERY;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$REMOVAL_ASK;
  private static final SubLSymbol $kw23$TRUE;
  private static final SubLSymbol $sym24$CYCL_ATOMIC_SENTENCE_P;
  private static final SubLSymbol $sym25$PROPERTY_LIST_P;
  private static final SubLSymbol $sym26$REMOVAL_ASK_QUERY_PROPERTY_P;
  private static final SubLSymbol $sym27$FIRST;
  private static final SubLSymbol $sym28$SECOND;
  private static final SubLList $list29;
  private static final SubLSymbol $kw30$MAX_NUMBER;
  private static final SubLSymbol $kw31$ALLOWED_MODULES;
  private static final SubLSymbol $kw32$ALL;
  private static final SubLSymbol $kw33$EXHAUST_TOTAL;
  private static final SubLSymbol $sym34$_;
  private static final SubLSymbol $kw35$METRICS;
  private static final SubLSymbol $kw36$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw37$REMOVAL_ASK_DONE;
  private static final SubLList $list38;
  private static final SubLSymbol $kw39$ANSWER_COUNT;
  private static final SubLSymbol $kw40$TIME_TO_FIRST_ANSWER;
  private static final SubLSymbol $kw41$TIME_TO_LAST_ANSWER;
  private static final SubLSymbol $kw42$TOTAL_TIME;
  private static final SubLSymbol $kw43$TIME_PER_ANSWER;
  private static final SubLSymbol $kw44$LATENCY_IMPROVEMENT_FROM_ITERATIVITY;
  private static final SubLSymbol $kw45$COMPLETE_USER_TIME;
  private static final SubLSymbol $kw46$COMPLETE_SYSTEM_TIME;
  private static final SubLSymbol $kw47$COMPLETE_TOTAL_TIME;
  private static final SubLString $str48$removal_ask_cannot_handle_metric_;
  private static final SubLSymbol $kw49$REMOVAL;
  private static final SubLSymbol $kw50$IGNORE;
  private static final SubLSymbol $sym51$CLOSED_CONJUNCTIVE_CYCL_SENTENCE_P;
  private static final SubLSymbol $sym52$CYCL_LITERAL_P;
  private static final SubLSymbol $kw53$FALSE;
  private static final SubLSymbol $sym54$_TRANSFORMATION_SEMANTIC_PRUNING_ENABLED_;
  private static final SubLString $str55$Semantic_pruning_of_results_of_ba;
  private static final SubLString $str56$This_controls_whether_or_not_the_;
  private static final SubLList $list57;
  private static final SubLSymbol $kw58$LEGACY;
  private static final SubLSymbol $kw59$NONE;
  private static final SubLSymbol $kw60$TRIVIAL;
  private static final SubLSymbol $kw61$INFERENCE;
  private static final SubLString $str62$Unexpected_pruning_mode____S;
  private static final SubLList $list63;
  private static final SubLSymbol $kw64$TYPE;
  private static final SubLSymbol $kw65$SEMANTICALLY_INVALID_CLOSED_ASENT_VIA_QUERY;
  private static final SubLSymbol $kw66$POS_LIT;
  private static final SubLObject $const67$assertedSentence;
  private static final SubLSymbol $sym68$ATOMIC_SENTENCE_PREDICATE;
  private static final SubLSymbol $kw69$SEMANTICALLY_INVALID_ASSERTED_SENTENCE_ASENT;
  private static final SubLSymbol $kw70$ASENT;
  private static final SubLSymbol $kw71$SEMANTICALLY_INVALID_COMPLETE_EXTENT_ASSERTED_ASENT;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$INDEXED_TERM_P;
  private static final SubLObject $const74$isa;
  private static final SubLSymbol $kw75$SEMANTICALLY_INVALID_ISA_ASENT;
  private static final SubLObject $const76$genls;
  private static final SubLSymbol $kw77$SEMANTICALLY_INVALID_GENLS_ASENT;
  private static final SubLObject $const78$termOfUnit;
  private static final SubLSymbol $kw79$SYNTACTICALLY_INVALID_TERM_OF_UNIT;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$CLOSED_CONJUNCTIVE_REMOVAL_ASK;
  private static final SubLSymbol $kw82$TEST;
  private static final SubLSymbol $kw83$OWNER;
  private static final SubLSymbol $kw84$CLASSES;
  private static final SubLSymbol $kw85$KB;
  private static final SubLSymbol $kw86$TINY;
  private static final SubLSymbol $kw87$WORKING_;
  private static final SubLList $list88;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1659L)
  public static SubLObject inference_expand_new_children()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $inference_expand_new_children$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1750L)
  public static SubLObject add_to_inference_expand_new_children(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $inference_expand_new_children$.setDynamicValue( ConsesLow.cons( node, $inference_expand_new_children$.getDynamicValue( thread ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2049L)
  public static SubLObject inference_expand_hl_module()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $inference_expand_hl_module$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2390L)
  public static SubLObject inference_expand_sense()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $inference_expand_sense$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2469L)
  public static SubLObject transformation_add_node(final SubLObject rule_assertion, final SubLObject rule_pivot_asent, final SubLObject rule_pivot_sense, SubLObject v_bindings, SubLObject more_supports)
  {
    if( more_supports == UNPROVIDED )
    {
      more_supports = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == v_bindings )
    {
      v_bindings = bindings.unification_success_token();
    }
    final SubLObject no_trans_pos_lits = NIL;
    final SubLObject no_trans_neg_lits = NIL;
    thread.resetMultipleValues();
    final SubLObject new_pos_lits = transformation_rule_dependent_lits( rule_assertion, rule_pivot_asent, rule_pivot_sense );
    final SubLObject new_neg_lits = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != $transformation_add_node_method$.getDynamicValue( thread ) )
    {
      final SubLObject dependent_dnf = clauses.make_clause( ConsesLow.append( new_neg_lits, no_trans_neg_lits ), ConsesLow.append( new_pos_lits, no_trans_pos_lits ) );
      return Functions.funcall( $transformation_add_node_method$.getDynamicValue( thread ), rule_assertion, rule_pivot_asent, rule_pivot_sense, v_bindings, dependent_dnf, more_supports );
    }
    return Errors.error( $str0$The_legacy_harness_is_no_longer_s );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4075L)
  public static SubLObject transformation_rule_dependent_lits(final SubLObject rule, final SubLObject asent_from_rule, final SubLObject asent_sense)
  {
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    if( $kw1$POS == asent_sense )
    {
      return Values.values( clauses.neg_lits( cnf ), Sequences.remove( asent_from_rule, clauses.pos_lits( cnf ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return Values.values( Sequences.remove( asent_from_rule, clauses.neg_lits( cnf ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), clauses.pos_lits( cnf ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4427L)
  public static SubLObject removal_add_node(final SubLObject support, SubLObject v_bindings, SubLObject more_supports)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( more_supports == UNPROVIDED )
    {
      more_supports = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == v_bindings )
    {
      v_bindings = bindings.unification_success_token();
    }
    if( NIL == $removal_add_node_method$.getDynamicValue( thread ) )
    {
      Errors.error( $str0$The_legacy_harness_is_no_longer_s );
    }
    SubLObject supports = ConsesLow.cons( support, more_supports );
    supports = removal_add_node_helper_remove_bad_supports( supports );
    thread.resetMultipleValues();
    final SubLObject v_bindings_$1 = removal_add_node_helper_rewrite_dispreferred_terms( v_bindings, supports );
    final SubLObject supports_$2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    v_bindings = v_bindings_$1;
    supports = supports_$2;
    final SubLObject supports_list = removal_add_node_helper_modify_supports( v_bindings, supports );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = supports_list;
    SubLObject final_supports = NIL;
    final_supports = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = removal_add_node_funcall( $removal_add_node_method$.getDynamicValue( thread ), v_bindings, final_supports );
      cdolist_list_var = cdolist_list_var.rest();
      final_supports = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5427L)
  public static SubLObject removal_add_node_funcall(final SubLObject function, final SubLObject v_bindings, final SubLObject supports)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( function.eql( $sym2$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE ) )
    {
      return inference_worker_removal.handle_removal_add_node_for_output_generate( v_bindings, supports );
    }
    if( function.eql( $sym3$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS ) )
    {
      return inference_worker_removal.handle_removal_add_node_for_expand_results( v_bindings, supports );
    }
    if( function.eql( $sym4$REMOVAL_ASK_ADD_NODE ) )
    {
      return removal_ask_add_node( v_bindings, supports );
    }
    return Functions.funcall( $removal_add_node_method$.getDynamicValue( thread ), v_bindings, supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5926L)
  public static SubLObject removal_add_node_helper_remove_bad_supports(SubLObject supports)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.find_if_not( $sym5$SUPPORT_P, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL != control_vars.$inference_debugP$.getDynamicValue( thread ) )
      {
        SubLObject cdolist_list_var = list_utilities.find_all_if_not( $sym5$SUPPORT_P, supports, UNPROVIDED );
        SubLObject bad_support = NIL;
        bad_support = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          Errors.warn( $str6$Removing_invalid_support__S_from_, bad_support, inference_worker.currently_executing_tactic() );
          cdolist_list_var = cdolist_list_var.rest();
          bad_support = cdolist_list_var.first();
        }
      }
      supports = list_utilities.remove_if_not( $sym5$SUPPORT_P, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6402L)
  public static SubLObject removal_add_node_helper_rewrite_dispreferred_terms(SubLObject v_bindings, SubLObject supports)
  {
    SubLObject bindings_values = bindings.bindings_values( v_bindings );
    SubLObject dispreferred_terms = cycl_utilities.expression_gather( bindings_values, $sym7$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject rewrite_of_supports = NIL;
    if( NIL != dispreferred_terms )
    {
      SubLObject cdolist_list_var;
      dispreferred_terms = ( cdolist_list_var = terms_not_used_in_support_quoted_context( dispreferred_terms, supports ) );
      SubLObject dispreferred_term = NIL;
      dispreferred_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject preferred_term = equals.preferred_rewrite_term( dispreferred_term, UNPROVIDED );
        if( NIL != preferred_term )
        {
          final SubLObject rewrite_of_sentence = el_utilities.make_binary_formula( $const8$rewriteOf, preferred_term, dispreferred_term );
          SubLObject rewrite_of_support = czer_meta.find_visible_assertion_cycl( rewrite_of_sentence, UNPROVIDED );
          if( NIL == rewrite_of_support )
          {
            rewrite_of_support = arguments.make_hl_support( $kw9$EQUALITY, el_utilities.make_binary_formula( $const8$rewriteOf, preferred_term, dispreferred_term ), UNPROVIDED, UNPROVIDED );
          }
          rewrite_of_supports = ConsesLow.cons( rewrite_of_support, rewrite_of_supports );
        }
        cdolist_list_var = cdolist_list_var.rest();
        dispreferred_term = cdolist_list_var.first();
      }
      if( NIL != rewrite_of_supports )
      {
        bindings_values = cycl_utilities.expression_ntransform( bindings_values, $sym10$HAS_PREFERRED_REWRITE_TERM_, $sym11$PREFERRED_REWRITE_TERM, T, UNPROVIDED );
        v_bindings = bindings.make_variable_bindings( bindings.bindings_variables( v_bindings ), bindings_values );
        supports = ConsesLow.append( rewrite_of_supports, supports );
        supports = possibly_simplify_supports_to_single_deduced_assertion( v_bindings, supports );
      }
    }
    return subl_promotions.values2( v_bindings, supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7934L)
  public static SubLObject removal_add_node_helper_dereference_indexicals(SubLObject v_bindings, SubLObject supports)
  {
    if( NIL != kb_control_vars.date_kb_loaded_p() && NIL != cycl_utilities.expression_find( $const12$Now, v_bindings, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != terms_not_used_in_support_quoted_context( $list13,
        supports ) )
    {
      final SubLObject now = date_utilities.indexical_now();
      v_bindings = cycl_utilities.expression_subst( now, $const12$Now, v_bindings, UNPROVIDED, UNPROVIDED );
      supports = ConsesLow.cons( arguments.make_hl_support( $kw14$OPAQUE, el_utilities.make_binary_formula( $const15$indexicalReferent, $const12$Now, now ), $const16$BaseKB, UNPROVIDED ), supports );
    }
    return Values.values( v_bindings, supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8432L)
  public static SubLObject terms_not_used_in_support_quoted_context(final SubLObject terms, final SubLObject supports)
  {
    SubLObject terms_used_in_quoted_context = NIL;
    SubLObject cdolist_list_var = supports;
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject support_sentence = arguments.support_sentence( support );
      SubLObject cdolist_list_var_$3 = terms;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        SubLObject cdolist_list_var_$4 = list_utilities.all_positions( v_term, support_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject argnum = NIL;
        argnum = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          if( NIL != kb_accessors.quoted_argumentP( cycl_utilities.atomic_sentence_predicate( support_sentence ), argnum ) )
          {
            final SubLObject item_var = v_term;
            if( NIL == conses_high.member( item_var, terms_used_in_quoted_context, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              terms_used_in_quoted_context = ConsesLow.cons( item_var, terms_used_in_quoted_context );
            }
          }
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          argnum = cdolist_list_var_$4.first();
        }
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        v_term = cdolist_list_var_$3.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return conses_high.set_difference( terms, terms_used_in_quoted_context, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8991L)
  public static SubLObject possibly_simplify_supports_to_single_deduced_assertion(final SubLObject v_bindings, SubLObject supports)
  {
    SubLObject better_support_assertion_usedP = NIL;
    final SubLObject bound_problem_query = inference_czer.problem_query_formula( bindings.apply_bindings( v_bindings, inference_worker.currently_active_problem_query() ) );
    final SubLObject better_support_assertion_candidates = czer_meta.find_visible_assertions_cycl( bound_problem_query, UNPROVIDED );
    if( NIL == better_support_assertion_usedP )
    {
      SubLObject csome_list_var = better_support_assertion_candidates;
      SubLObject better_support_assertion = NIL;
      better_support_assertion = csome_list_var.first();
      while ( NIL == better_support_assertion_usedP && NIL != csome_list_var)
      {
        if( NIL != better_support_assertion && NIL != deductions_high.find_deduction( better_support_assertion, supports, UNPROVIDED ) )
        {
          better_support_assertion_usedP = T;
          supports = ConsesLow.list( better_support_assertion );
        }
        csome_list_var = csome_list_var.rest();
        better_support_assertion = csome_list_var.first();
      }
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10281L)
  public static SubLObject removal_add_node_helper_modify_supports(final SubLObject v_bindings, final SubLObject supports)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject supports_list = NIL;
    if( ( NIL != $force_query_supports_in_forward_inferenceP$.getDynamicValue( thread ) || NIL != $force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue( thread ) )
        && ( NIL != kb_control_vars.$within_forward_inferenceP$.getDynamicValue( thread ) || NIL != $debug_removal_add_node_helper_modify_supportsP$.getDynamicValue( thread ) )
        && ( NIL == $force_query_supports_in_forward_inferenceP$.getDynamicValue( thread ) || NIL != inference_worker.currently_active_problem() || NIL != $debug_removal_add_node_helper_modify_supportsP$.getDynamicValue(
            thread ) ) && NIL == hl_supports.$within_hl_justify_queryP$.getDynamicValue( thread ) && NIL != list_utilities.find_if_not( $sym17$ASSERTION_P, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject query_support_ist_sentence = ( NIL != $force_query_supports_in_forward_inferenceP$.getDynamicValue( thread ) ) ? ( ( NIL != inference_worker.currently_active_problem() ) ? inference_czer
          .problem_query_formula( bindings.apply_bindings( v_bindings, inference_worker.currently_active_problem_query() ) ) : arguments.support_sentence( supports.first() ) ) : NIL;
      final SubLObject query_support_sentence = ( NIL != el_utilities.ist_sentence_p( query_support_ist_sentence, UNPROVIDED ) ) ? el_utilities.designated_sentence( query_support_ist_sentence )
          : query_support_ist_sentence;
      final SubLObject all_mt_and_support_combinations = ( NIL != $force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue( thread ) ) ? forward.compute_all_mt_and_support_combinations( supports,
          UNPROVIDED ) : NIL;
      if( NIL != $force_query_supports_in_forward_inferenceP$.getDynamicValue( thread ) && NIL != $force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue( thread ) )
      {
        SubLObject cdolist_list_var = all_mt_and_support_combinations;
        SubLObject mts_and_supports = NIL;
        mts_and_supports = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = mts_and_supports;
          SubLObject mts = NIL;
          SubLObject ignored_supports = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
          mts = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
          ignored_supports = current.first();
          current = current.rest();
          if( NIL == current )
          {
            SubLObject cdolist_list_var_$5 = mts;
            SubLObject mt = NIL;
            mt = cdolist_list_var_$5.first();
            while ( NIL != cdolist_list_var_$5)
            {
              final SubLObject query_support = arguments.make_hl_support( $kw19$QUERY, query_support_sentence, mt, UNPROVIDED );
              supports_list = ConsesLow.cons( ConsesLow.list( query_support ), supports_list );
              cdolist_list_var_$5 = cdolist_list_var_$5.rest();
              mt = cdolist_list_var_$5.first();
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          mts_and_supports = cdolist_list_var.first();
        }
      }
      else if( NIL != $force_query_supports_in_forward_inferenceP$.getDynamicValue( thread ) )
      {
        final SubLObject query_support2 = arguments.make_hl_support( $kw19$QUERY, query_support_sentence, mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED );
        supports_list = ConsesLow.cons( ConsesLow.list( query_support2 ), supports_list );
      }
      else if( NIL != $force_forward_mt_combos_computation_in_forward_inferenceP$.getDynamicValue( thread ) )
      {
        SubLObject cdolist_list_var = all_mt_and_support_combinations;
        SubLObject mts_and_supports = NIL;
        mts_and_supports = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = mts_and_supports;
          SubLObject ignored_mts = NIL;
          SubLObject new_supports = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
          ignored_mts = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
          new_supports = current.first();
          current = current.rest();
          if( NIL == current )
          {
            supports_list = ConsesLow.cons( new_supports, supports_list );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          mts_and_supports = cdolist_list_var.first();
        }
      }
    }
    return ( NIL != supports_list ) ? supports_list : ConsesLow.list( supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13290L)
  public static SubLObject removal_ask_query_property_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $removal_ask_query_properties$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13465L)
  public static SubLObject removal_ask(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw23$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( asent, $sym24$CYCL_ATOMIC_SENTENCE_P );
    final SubLObject plist_var = query_properties;
    assert NIL != list_utilities.property_list_p( plist_var ) : plist_var;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != removal_ask_query_property_p( property ) : property;
    }
    if( NIL == mt )
    {
      mt = mt_vars.$default_ask_mt$.getGlobalValue();
    }
    SubLObject answers = NIL;
    SubLObject halt_reason = NIL;
    SubLObject metrics = NIL;
    final SubLObject _prev_bind_0 = $removal_add_node_method$.currentBinding( thread );
    final SubLObject _prev_bind_2 = inference_macros.$controlling_inferences$.currentBinding( thread );
    final SubLObject _prev_bind_3 = inference_macros.$controlling_strategy$.currentBinding( thread );
    try
    {
      $removal_add_node_method$.bind( $sym4$REMOVAL_ASK_ADD_NODE, thread );
      inference_macros.$controlling_inferences$.bind( ConsesLow.cons( NIL, inference_macros.$controlling_inferences$.getDynamicValue( thread ) ), thread );
      inference_macros.$controlling_strategy$.bind( NIL, thread );
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$7 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$8 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        thread.resetMultipleValues();
        final SubLObject answers_$9 = removal_ask_int( asent, truth, query_properties );
        final SubLObject halt_reason_$10 = thread.secondMultipleValue();
        final SubLObject metrics_$11 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        answers = answers_$9;
        halt_reason = halt_reason_$10;
        metrics = metrics_$11;
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$8, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$7, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$6, thread );
      }
    }
    finally
    {
      inference_macros.$controlling_strategy$.rebind( _prev_bind_3, thread );
      inference_macros.$controlling_inferences$.rebind( _prev_bind_2, thread );
      $removal_add_node_method$.rebind( _prev_bind_0, thread );
    }
    return Values.values( answers, halt_reason, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14507L)
  public static SubLObject el_removal_ask(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw23$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars( asent );
    return removal_ask( hl_asent, mt, truth, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14904L)
  public static SubLObject removal_ask_bindings(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw23$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject inference_answers = removal_ask( asent, mt, truth, query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    final SubLObject metrics = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject bindings_list = list_utilities.mapcar_unique( Symbols.symbol_function( $sym27$FIRST ), inference_answers, Symbols.symbol_function( EQUAL ) );
    return Values.values( bindings_list, halt_reason, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15561L)
  public static SubLObject el_removal_ask_bindings(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw23$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars( asent );
    return removal_ask_bindings( hl_asent, mt, truth, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15985L)
  public static SubLObject removal_ask_justifications(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw23$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject inference_answers = removal_ask( asent, mt, truth, query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    final SubLObject metrics = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject justifications = Mapping.mapcar( Symbols.symbol_function( $sym28$SECOND ), inference_answers );
    return Values.values( justifications, halt_reason, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16642L)
  public static SubLObject el_removal_ask_justifications(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw23$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars( asent );
    return removal_ask_justifications( hl_asent, mt, truth, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17084L)
  public static SubLObject removal_ask_template(final SubLObject template, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw23$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject inference_answers = removal_ask( asent, mt, truth, query_properties );
    SubLObject template_answers = NIL;
    SubLObject cdolist_list_var = inference_answers;
    SubLObject inference_answer = NIL;
    inference_answer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = inference_answer;
      SubLObject v_bindings = NIL;
      SubLObject supports = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      supports = current.first();
      current = current.rest();
      if( NIL == current )
      {
        template_answers = ConsesLow.cons( bindings.subst_bindings( v_bindings, template ), template_answers );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      inference_answer = cdolist_list_var.first();
    }
    return Sequences.nreverse( template_answers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17751L)
  public static SubLObject el_removal_ask_template(final SubLObject template, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw23$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject hl_template = variables.error_unless_canonicalize_default_el_vars( template );
    final SubLObject hl_asent = variables.error_unless_canonicalize_default_el_vars( asent );
    return removal_ask_template( hl_template, hl_asent, mt, truth, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18279L)
  public static SubLObject el_removal_ask_variable(final SubLObject var, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw23$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    SubLObject answers = el_removal_ask_template( var, asent, mt, truth, query_properties );
    answers = list_utilities.fast_delete_duplicates( answers, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18649L)
  public static SubLObject removal_ask_variable(final SubLObject variable_token, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw23$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject variable = variables.get_variable( ZERO_INTEGER );
    final SubLObject query_asent = cycl_utilities.expression_subst( variable, variable_token, asent, UNPROVIDED, UNPROVIDED );
    final SubLObject answers = removal_ask_hl_variable( variable, query_asent, mt, truth, query_properties );
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19177L)
  public static SubLObject removal_ask_hl_variable(final SubLObject hl_variable, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw23$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    SubLObject answers = removal_ask_template( hl_variable, asent, mt, truth, query_properties );
    answers = list_utilities.fast_delete_duplicates( answers, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20181L)
  public static SubLObject removal_ask_answer_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return dictionary_contents.dictionary_contents_size( $removal_ask_answers$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20284L)
  public static SubLObject removal_ask_add_node(final SubLObject v_bindings, final SubLObject supports)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $removal_ask_disallows_indeterminate_termsP$.getDynamicValue( thread ) && NIL != inference_strategist.some_answer_bindings_are_indeterminateP( v_bindings ) )
    {
      return NIL;
    }
    if( NIL != dictionary_contents.dictionary_contents_empty_p( $removal_ask_answers$.getDynamicValue( thread ) ) && NIL != $removal_ask_start_internal_real_time$.getDynamicValue( thread ) )
    {
      $removal_ask_first_answer_elapsed_internal_real_time$.setDynamicValue( numeric_date_utilities.elapsed_internal_real_time( $removal_ask_start_internal_real_time$.getDynamicValue( thread ), UNPROVIDED ), thread );
    }
    if( NIL != $removal_ask_start_internal_real_time$.getDynamicValue( thread ) )
    {
      $removal_ask_last_answer_elapsed_internal_real_time$.setDynamicValue( numeric_date_utilities.elapsed_internal_real_time( $removal_ask_start_internal_real_time$.getDynamicValue( thread ), UNPROVIDED ), thread );
    }
    $removal_ask_answers$.setDynamicValue( dictionary_utilities.dictionary_contents_push( $removal_ask_answers$.getDynamicValue( thread ), conses_high.copy_tree( v_bindings ), conses_high.copy_tree( supports ), Symbols
        .symbol_function( EQUAL ) ), thread );
    if( NIL != $removal_ask_max_number$.getDynamicValue( thread ) && removal_ask_answer_count().numGE( $removal_ask_max_number$.getDynamicValue( thread ) ) )
    {
      return note_removal_ask_done( $kw30$MAX_NUMBER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21376L)
  public static SubLObject removal_ask_int(final SubLObject asent, final SubLObject truth, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject plist_var = query_properties;
    assert NIL != list_utilities.property_list_p( plist_var ) : plist_var;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != removal_ask_query_property_p( property ) : property;
    }
    final SubLObject sense = enumeration_types.truth_sense( truth );
    final SubLObject allowed_modules_spec = conses_high.getf( query_properties, $kw31$ALLOWED_MODULES, $kw32$ALL );
    final SubLObject allowed_tactic_specs = removal_ask_tactic_specs( asent, sense, allowed_modules_spec );
    if( NIL != allowed_tactic_specs )
    {
      return removal_ask_expand( asent, sense, allowed_tactic_specs, query_properties );
    }
    return Values.values( NIL, $kw33$EXHAUST_TOTAL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21880L)
  public static SubLObject removal_ask_tactic_specs(final SubLObject asent, final SubLObject sense, final SubLObject allowed_modules_spec)
  {
    return inference_worker_removal.literal_removal_options( asent, sense, allowed_modules_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22025L)
  public static SubLObject removal_ask_expand(final SubLObject asent, final SubLObject sense, SubLObject tactic_specs, final SubLObject query_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answers = NIL;
    SubLObject halt_reason = NIL;
    SubLObject metric_values = NIL;
    tactic_specs = Sort.sort( conses_high.copy_list( tactic_specs ), Symbols.symbol_function( $sym34$_ ), Symbols.symbol_function( $sym28$SECOND ) );
    final SubLObject metrics = conses_high.getf( query_properties, $kw35$METRICS, NIL );
    final SubLObject _prev_bind_0 = $removal_ask_answers$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $removal_ask_max_number$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $removal_ask_disallows_indeterminate_termsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $removal_ask_start_internal_real_time$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $removal_ask_first_answer_elapsed_internal_real_time$.currentBinding( thread );
    final SubLObject _prev_bind_6 = $removal_ask_last_answer_elapsed_internal_real_time$.currentBinding( thread );
    try
    {
      $removal_ask_answers$.bind( dictionary_contents.new_dictionary_contents( ZERO_INTEGER, Symbols.symbol_function( EQUAL ) ), thread );
      $removal_ask_max_number$.bind( conses_high.getf( query_properties, $kw30$MAX_NUMBER, NIL ), thread );
      $removal_ask_disallows_indeterminate_termsP$.bind( makeBoolean( NIL == conses_high.getf( query_properties, $kw36$ALLOW_INDETERMINATE_RESULTS_, T ) ), thread );
      $removal_ask_start_internal_real_time$.bind( ( NIL != metrics ) ? Time.get_internal_real_time() : NIL, thread );
      $removal_ask_first_answer_elapsed_internal_real_time$.bind( NIL, thread );
      $removal_ask_last_answer_elapsed_internal_real_time$.bind( NIL, thread );
      if( NIL == halt_reason )
      {
        SubLObject csome_list_var = tactic_specs;
        SubLObject tactic_spec = NIL;
        tactic_spec = csome_list_var.first();
        while ( NIL == halt_reason && NIL != csome_list_var)
        {
          try
          {
            thread.throwStack.push( $kw37$REMOVAL_ASK_DONE );
            SubLObject current;
            final SubLObject datum = current = tactic_spec;
            SubLObject hl_module = NIL;
            SubLObject productivity = NIL;
            SubLObject completeness = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
            hl_module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
            productivity = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
            completeness = current.first();
            current = current.rest();
            if( NIL == current )
            {
              final SubLObject cost = inference_datastructures_enumerated_types.cost_for_productivity( productivity );
              final SubLObject _prev_bind_0_$12 = $inference_expand_hl_module$.currentBinding( thread );
              try
              {
                $inference_expand_hl_module$.bind( hl_module, thread );
                final SubLObject pattern = inference_modules.hl_module_expand_pattern( hl_module );
                final SubLObject expand_method = ( NIL != pattern ) ? NIL : inference_modules.hl_module_expand_func( hl_module );
                if( NIL == inference_hl_module_cost_too_expensive( hl_module, cost ) )
                {
                  final SubLObject _prev_bind_0_$13 = $inference_expand_sense$.currentBinding( thread );
                  try
                  {
                    $inference_expand_sense$.bind( sense, thread );
                    if( NIL != pattern )
                    {
                      formula_pattern_match.pattern_transform_formula( pattern, asent, UNPROVIDED );
                    }
                    else
                    {
                      Functions.funcall( expand_method, asent, sense );
                    }
                  }
                  finally
                  {
                    $inference_expand_sense$.rebind( _prev_bind_0_$13, thread );
                  }
                }
              }
              finally
              {
                $inference_expand_hl_module$.rebind( _prev_bind_0_$12, thread );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            halt_reason = Errors.handleThrowable( ccatch_env_var, $kw37$REMOVAL_ASK_DONE );
          }
          finally
          {
            thread.throwStack.pop();
          }
          csome_list_var = csome_list_var.rest();
          tactic_spec = csome_list_var.first();
        }
      }
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( $removal_ask_answers$.getDynamicValue( thread ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = justifications;
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == abnormal.abnormality_except_support_enabledP() || NIL == inference_worker_transformation.supports_contain_excepted_assertionP( justification, UNPROVIDED ) )
          {
            answers = ConsesLow.cons( ConsesLow.list( v_bindings, justification ), answers );
          }
          cdolist_list_var = cdolist_list_var.rest();
          justification = cdolist_list_var.first();
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      if( NIL == halt_reason )
      {
        halt_reason = $kw33$EXHAUST_TOTAL;
      }
      if( NIL != metrics )
      {
        metric_values = removal_ask_compute_metric_values( metrics );
      }
    }
    finally
    {
      $removal_ask_last_answer_elapsed_internal_real_time$.rebind( _prev_bind_6, thread );
      $removal_ask_first_answer_elapsed_internal_real_time$.rebind( _prev_bind_5, thread );
      $removal_ask_start_internal_real_time$.rebind( _prev_bind_4, thread );
      $removal_ask_disallows_indeterminate_termsP$.rebind( _prev_bind_3, thread );
      $removal_ask_max_number$.rebind( _prev_bind_2, thread );
      $removal_ask_answers$.rebind( _prev_bind_0, thread );
    }
    return Values.values( Sequences.nreverse( answers ), halt_reason, metric_values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24362L)
  public static SubLObject removal_ask_compute_metric_values(final SubLObject metrics)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject metric_values = conses_high.copy_list( metrics );
    final SubLObject time_to_first_answer = ( NIL != $removal_ask_first_answer_elapsed_internal_real_time$.getDynamicValue( thread ) ) ? numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(
        $removal_ask_first_answer_elapsed_internal_real_time$.getDynamicValue( thread ) ) : NIL;
    final SubLObject time_to_last_answer = ( NIL != $removal_ask_last_answer_elapsed_internal_real_time$.getDynamicValue( thread ) ) ? numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(
        $removal_ask_last_answer_elapsed_internal_real_time$.getDynamicValue( thread ) ) : NIL;
    final SubLObject total_time = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds( numeric_date_utilities.elapsed_internal_real_time( $removal_ask_start_internal_real_time$.getDynamicValue( thread ),
        UNPROVIDED ) );
    SubLObject cdolist_list_var = metrics;
    SubLObject metric = NIL;
    metric = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pcase_var = metric;
      if( pcase_var.eql( $kw39$ANSWER_COUNT ) )
      {
        final SubLObject answer_count = removal_ask_answer_count();
        metric_values = Sequences.nsubstitute( answer_count, $kw39$ANSWER_COUNT, metric_values, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw40$TIME_TO_FIRST_ANSWER ) )
      {
        metric_values = Sequences.nsubstitute( time_to_first_answer, $kw40$TIME_TO_FIRST_ANSWER, metric_values, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw41$TIME_TO_LAST_ANSWER ) )
      {
        metric_values = Sequences.nsubstitute( time_to_last_answer, $kw41$TIME_TO_LAST_ANSWER, metric_values, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw42$TOTAL_TIME ) )
      {
        metric_values = Sequences.nsubstitute( total_time, $kw42$TOTAL_TIME, metric_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw43$TIME_PER_ANSWER ) )
      {
        final SubLObject answer_count = removal_ask_answer_count();
        SubLObject time_per_answer = NIL;
        if( total_time.isNumber() && NIL != subl_promotions.positive_integer_p( answer_count ) )
        {
          time_per_answer = Numbers.divide( total_time, answer_count );
        }
        metric_values = Sequences.nsubstitute( time_per_answer, $kw43$TIME_PER_ANSWER, metric_values, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw44$LATENCY_IMPROVEMENT_FROM_ITERATIVITY ) )
      {
        final SubLObject latency_improvement_from_iterativity = list_utilities.safe_difference( total_time, time_to_first_answer );
        metric_values = Sequences.nsubstitute( latency_improvement_from_iterativity, $kw44$LATENCY_IMPROVEMENT_FROM_ITERATIVITY, metric_values, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED );
      }
      else if( !pcase_var.eql( $kw45$COMPLETE_USER_TIME ) && !pcase_var.eql( $kw46$COMPLETE_SYSTEM_TIME ) )
      {
        if( !pcase_var.eql( $kw47$COMPLETE_TOTAL_TIME ) )
        {
          Errors.warn( $str48$removal_ask_cannot_handle_metric_, metric );
          metric_values = Sequences.nsubstitute( NIL, metric, metric_values, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      metric = cdolist_list_var.first();
    }
    return metric_values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26478L)
  public static SubLObject note_removal_ask_done(final SubLObject halt_reason)
  {
    return Dynamic.sublisp_throw( $kw37$REMOVAL_ASK_DONE, halt_reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26581L)
  public static SubLObject inference_hl_module_cost_too_expensive(final SubLObject hl_module, final SubLObject cost)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var = inference_modules.hl_module_type( hl_module );
    if( pcase_var.eql( $kw49$REMOVAL ) )
    {
      return makeBoolean( NIL != control_vars.$removal_cost_cutoff$.getDynamicValue( thread ) && cost.numG( control_vars.$removal_cost_cutoff$.getDynamicValue( thread ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26877L)
  public static SubLObject closed_conjunctive_cycl_sentence_p(final SubLObject v_object)
  {
    if( NIL == el_utilities.groundP( v_object, UNPROVIDED ) )
    {
      return NIL;
    }
    return cycl_literal_or_conjunction_of_cycl_literals_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27232L)
  public static SubLObject cycl_literal_or_conjunction_of_cycl_literals_p(final SubLObject v_object)
  {
    if( NIL != cycl_grammar.cycl_literal_p( v_object ) )
    {
      return T;
    }
    if( NIL != el_utilities.el_conjunction_p( v_object ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( v_object, $kw50$IGNORE );
      SubLObject conjunct = NIL;
      conjunct = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == cycl_grammar.cycl_literal_p( conjunct ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        conjunct = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27596L)
  public static SubLObject closed_conjunctive_removal_ask(final SubLObject closed_sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    assert NIL != closed_conjunctive_cycl_sentence_p( closed_sentence ) : closed_sentence;
    if( NIL == mt )
    {
      mt = mt_vars.$default_ask_mt$.getGlobalValue();
    }
    if( NIL != el_utilities.el_conjunction_p( closed_sentence ) )
    {
      SubLObject falsifiedP = NIL;
      final SubLObject args = cycl_utilities.formula_args( closed_sentence, $kw50$IGNORE );
      SubLObject rest;
      SubLObject conjunct;
      for( rest = NIL, rest = args; NIL == falsifiedP && NIL != rest; rest = rest.rest() )
      {
        conjunct = rest.first();
        if( NIL == removal_ask_literal( conjunct, mt, query_properties ) )
        {
          falsifiedP = T;
        }
      }
      return makeBoolean( NIL == falsifiedP );
    }
    return list_utilities.sublisp_boolean( removal_ask_literal( closed_sentence, mt, query_properties ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28564L)
  public static SubLObject removal_ask_literal(final SubLObject literal, final SubLObject mt, final SubLObject query_properties)
  {
    assert NIL != cycl_grammar.cycl_literal_p( literal ) : literal;
    final SubLObject truth = ( NIL != el_utilities.el_negation_p( literal ) ) ? $kw53$FALSE : $kw23$TRUE;
    final SubLObject asent = el_utilities.literal_atomic_sentence( literal );
    return removal_ask( asent, mt, truth, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31010L)
  public static SubLObject semantically_valid_closed_asentsP(final SubLObject dnf, SubLObject mt, SubLObject justifyP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var = $forward_inference_pruning_mode$.getDynamicValue( thread );
    if( pcase_var.eql( $kw59$NONE ) )
    {
      return T;
    }
    if( pcase_var.eql( $kw58$LEGACY ) )
    {
      SubLObject current_validP = T;
      SubLObject current_reason = NIL;
      thread.resetMultipleValues();
      final SubLObject current_validP_$14 = semantically_valid_asserted_sentence_asents( dnf, mt, justifyP );
      final SubLObject current_reason_$15 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      current_validP = current_validP_$14;
      current_reason = current_reason_$15;
      if( NIL != current_validP )
      {
        thread.resetMultipleValues();
        final SubLObject current_validP_$15 = semantically_valid_complete_extent_asserted_asents( dnf, mt, justifyP );
        final SubLObject current_reason_$16 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        current_validP = current_validP_$15;
        current_reason = current_reason_$16;
        if( NIL != current_validP )
        {
          thread.resetMultipleValues();
          final SubLObject current_validP_$16 = semantically_valid_isa_asents( dnf, mt, justifyP );
          final SubLObject current_reason_$17 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          current_validP = current_validP_$16;
          current_reason = current_reason_$17;
          if( NIL != current_validP )
          {
            thread.resetMultipleValues();
            final SubLObject current_validP_$17 = semantically_valid_genls_asents( dnf, mt, justifyP );
            final SubLObject current_reason_$18 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            current_validP = current_validP_$17;
            current_reason = current_reason_$18;
          }
        }
      }
      if( NIL == justifyP )
      {
        return current_validP;
      }
      return Values.values( current_validP, ( NIL != current_validP ) ? NIL : current_reason );
    }
    else
    {
      if( pcase_var.eql( $kw60$TRIVIAL ) )
      {
        return semantically_valid_closed_asentsP_int( dnf, mt, NIL, justifyP );
      }
      if( pcase_var.eql( $kw61$INFERENCE ) )
      {
        return semantically_valid_closed_asentsP_int( dnf, mt, T, justifyP );
      }
      return Errors.error( $str62$Unexpected_pruning_mode____S, $forward_inference_pruning_mode$.getDynamicValue( thread ) );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32447L)
  public static SubLObject semantically_valid_closed_asentsP_int(final SubLObject dnf, final SubLObject mt, final SubLObject use_problem_storeP, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    final SubLObject invalidP = NIL;
    SubLObject reason = NIL;
    final SubLObject pos_lits = clauses.pos_lits( dnf );
    SubLObject invalidP_$22 = NIL;
    if( NIL == invalidP_$22 )
    {
      SubLObject csome_list_var = pos_lits;
      SubLObject pos_lit = NIL;
      pos_lit = csome_list_var.first();
      while ( NIL == invalidP_$22 && NIL != csome_list_var)
      {
        if( NIL != variables.fully_bound_p( pos_lit ) )
        {
          final SubLObject gaf_dnf = clause_utilities.make_gaf_dnf( pos_lit );
          final SubLObject overriding_query_properties = $list63;
          if( NIL != use_problem_storeP )
          {
            invalidP_$22 = makeBoolean( NIL == forward.new_forward_query_from_dnf( gaf_dnf, clauses.empty_clause(), mt, overriding_query_properties ) );
          }
          else
          {
            invalidP_$22 = makeBoolean( NIL == forward.new_cyc_trivial_forward_query_from_dnf( gaf_dnf, mt, NIL, overriding_query_properties ) );
          }
          if( NIL != invalidP_$22 && NIL != justifyP )
          {
            reason = ConsesLow.list( $kw64$TYPE, $kw65$SEMANTICALLY_INVALID_CLOSED_ASENT_VIA_QUERY, $kw66$POS_LIT, pos_lit );
          }
        }
        csome_list_var = csome_list_var.rest();
        pos_lit = csome_list_var.first();
      }
    }
    if( NIL == justifyP )
    {
      return makeBoolean( NIL == invalidP );
    }
    return Values.values( makeBoolean( NIL == invalidP ), ( NIL != invalidP ) ? reason : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33438L)
  public static SubLObject semantically_valid_asserted_sentence_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject invalidP = NIL;
    SubLObject reason = NIL;
    if( NIL != $forward_asserted_sentence_pruning_enabledP$.getDynamicValue( thread ) )
    {
      final SubLObject pos_lits = clauses.pos_lits( dnf );
      if( NIL != Sequences.find( $const67$assertedSentence, pos_lits, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym68$ATOMIC_SENTENCE_PREDICATE ), UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          if( NIL == invalidP )
          {
            SubLObject csome_list_var = pos_lits;
            SubLObject asent = NIL;
            asent = csome_list_var.first();
            while ( NIL == invalidP && NIL != csome_list_var)
            {
              if( $const67$assertedSentence.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) && NIL != semantically_invalid_asserted_sentence_asent( asent ) )
              {
                invalidP = T;
                if( NIL != justifyP )
                {
                  reason = ConsesLow.list( $kw64$TYPE, $kw69$SEMANTICALLY_INVALID_ASSERTED_SENTENCE_ASENT, $kw70$ASENT, asent );
                }
              }
              csome_list_var = csome_list_var.rest();
              asent = csome_list_var.first();
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
    }
    if( NIL == justifyP )
    {
      return makeBoolean( NIL == invalidP );
    }
    return Values.values( makeBoolean( NIL == invalidP ), ( NIL != invalidP ) ? reason : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34462L)
  public static SubLObject semantically_valid_complete_extent_asserted_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject invalidP = NIL;
    SubLObject reason = NIL;
    final SubLObject pos_lits = clauses.pos_lits( dnf );
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == invalidP )
      {
        SubLObject csome_list_var = pos_lits;
        SubLObject asent = NIL;
        asent = csome_list_var.first();
        while ( NIL == invalidP && NIL != csome_list_var)
        {
          final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
          if( NIL != forts.fort_p( pred ) && NIL != kb_accessors.complete_extent_assertedP( pred, UNPROVIDED ) && NIL != non_asserted_asentP( asent ) )
          {
            invalidP = T;
            if( NIL != justifyP )
            {
              reason = ConsesLow.list( $kw64$TYPE, $kw71$SEMANTICALLY_INVALID_COMPLETE_EXTENT_ASSERTED_ASENT, $kw70$ASENT, asent );
            }
          }
          csome_list_var = csome_list_var.rest();
          asent = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL == justifyP )
    {
      return makeBoolean( NIL == invalidP );
    }
    return Values.values( makeBoolean( NIL == invalidP ), ( NIL != invalidP ) ? reason : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35296L)
  public static SubLObject semantically_invalid_asserted_sentence_asent(final SubLObject asent)
  {
    final SubLObject sentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    return non_asserted_asentP( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35459L)
  public static SubLObject asent_only_has_pred_boundP(final SubLObject sentence)
  {
    if( NIL != variables.variable_p( sentence.first() ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( sentence, $kw50$IGNORE );
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == variables.variable_p( item ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35736L)
  public static SubLObject non_asserted_asentP(final SubLObject sentence)
  {
    if( NIL != el_utilities.el_formula_p( sentence ) )
    {
      if( NIL != asent_only_has_pred_boundP( sentence ) )
      {
        if( NIL != list_utilities.member_kbeqP( sentence.first(), $preds_with_assumed_extent$.getGlobalValue() ) )
        {
          return NIL;
        }
        if( NIL != subl_promotions.positive_integer_p( kb_indexing.num_predicate_extent_index( cycl_utilities.atomic_sentence_predicate( sentence ), UNPROVIDED ) ) && NIL != subl_promotions.positive_integer_p(
            kb_indexing.relevant_num_predicate_extent_index_with_cutoff( cycl_utilities.atomic_sentence_predicate( sentence ), ONE_INTEGER ) ) )
        {
          return NIL;
        }
      }
      if( NIL != non_asserted_asent_via_somewhere_cacheP( sentence ) )
      {
        return T;
      }
      if( NIL != non_asserted_asent_via_gaf_lookupP( sentence ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36482L)
  public static SubLObject non_asserted_asent_via_somewhere_cacheP(final SubLObject sentence)
  {
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( sentence );
    if( NIL != forts.fort_p( predicate ) && NIL != fort_types_interface.predicateP( predicate ) && NIL != somewhere_cache.somewhere_cached_pred_p( predicate ) )
    {
      final SubLObject argnum = somewhere_cache.some_pred_assertion_somewhere_argnum( predicate );
      final SubLObject arg = cycl_utilities.formula_arg( sentence, argnum, UNPROVIDED );
      if( NIL != forts.fort_p( arg ) && NIL == somewhere_cache.some_pred_assertion_somewhereP( predicate, arg, argnum, UNPROVIDED ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37026L)
  public static SubLObject non_asserted_asent_via_gaf_lookupP(final SubLObject sentence)
  {
    return makeBoolean( NIL != cycl_utilities.expression_find_if( $sym73$INDEXED_TERM_P, sentence, UNPROVIDED, UNPROVIDED ) && NIL == kb_indexing.asent_kb_lookup_in_any_mt( sentence,
        forward.$forward_inference_asserted_asent_fast_fail_cutoff$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37253L)
  public static SubLObject semantically_valid_isa_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    SubLObject invalidP = NIL;
    SubLObject reason = NIL;
    final SubLObject pos_lits = clauses.pos_lits( dnf );
    if( NIL != Sequences.find( $const74$isa, pos_lits, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym68$ATOMIC_SENTENCE_PREDICATE ), UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = pos_lits;
      SubLObject asent = NIL;
      asent = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( $const74$isa.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) )
        {
          final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
          final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
          if( NIL != forts.fort_p( arg1 ) && NIL != forts.fort_p( arg2 ) && NIL == at_defns.quiet_has_type_memoizedP( arg1, arg2, mt, UNPROVIDED ) )
          {
            invalidP = T;
            if( NIL != justifyP )
            {
              reason = ConsesLow.list( $kw64$TYPE, $kw75$SEMANTICALLY_INVALID_ISA_ASENT, $kw70$ASENT, asent );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        asent = cdolist_list_var.first();
      }
    }
    if( NIL == justifyP )
    {
      return makeBoolean( NIL == invalidP );
    }
    return Values.values( makeBoolean( NIL == invalidP ), ( NIL != invalidP ) ? reason : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38244L)
  public static SubLObject semantically_valid_genls_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    SubLObject invalidP = NIL;
    SubLObject reason = NIL;
    final SubLObject pos_lits = clauses.pos_lits( dnf );
    if( NIL != Sequences.find( $const76$genls, pos_lits, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym68$ATOMIC_SENTENCE_PREDICATE ), UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = pos_lits;
      SubLObject asent = NIL;
      asent = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( $const76$genls.eql( cycl_utilities.atomic_sentence_predicate( asent ) ) )
        {
          final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
          final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
          if( NIL != forts.fort_p( arg1 ) && NIL != forts.fort_p( arg2 ) && NIL == genls.genlsP( arg1, arg2, mt, UNPROVIDED ) )
          {
            invalidP = T;
            if( NIL != justifyP )
            {
              reason = ConsesLow.list( $kw64$TYPE, $kw77$SEMANTICALLY_INVALID_GENLS_ASENT, $kw70$ASENT, asent );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        asent = cdolist_list_var.first();
      }
    }
    if( NIL == justifyP )
    {
      return makeBoolean( NIL == invalidP );
    }
    return Values.values( makeBoolean( NIL == invalidP ), ( NIL != invalidP ) ? reason : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39261L)
  public static SubLObject semantically_valid_term_of_unit_asents(final SubLObject dnf, SubLObject mt, SubLObject justifyP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    return syntactically_valid_term_of_unit_asents( dnf, justifyP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39528L)
  public static SubLObject syntactically_valid_term_of_unit_asents(final SubLObject dnf, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    SubLObject cdolist_list_var = clauses.pos_lits( dnf );
    SubLObject asent = NIL;
    asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != cycl_utilities.atomic_sentence_with_pred_p( asent, $const78$termOfUnit ) && NIL == syntactically_valid_term_of_unit_asent( asent ) )
      {
        if( NIL != justifyP )
        {
          return Values.values( NIL, ConsesLow.list( $kw64$TYPE, $kw79$SYNTACTICALLY_INVALID_TERM_OF_UNIT, $kw70$ASENT, asent ) );
        }
        return NIL;
      }
      else
      {
        cdolist_list_var = cdolist_list_var.rest();
        asent = cdolist_list_var.first();
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40154L)
  public static SubLObject valid_term_of_unit_arg1(final SubLObject v_object)
  {
    return makeBoolean( NIL != variables.variable_p( v_object ) || NIL != cycl_grammar.cycl_nat_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40264L)
  public static SubLObject valid_term_of_unit_arg2(final SubLObject v_object)
  {
    return makeBoolean( NIL != variables.variable_p( v_object ) || NIL != narts_high.naut_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40370L)
  public static SubLObject valid_term_of_unit_args(final SubLObject arg1, final SubLObject arg2)
  {
    return makeBoolean( NIL != valid_term_of_unit_arg1( arg1 ) && NIL != valid_term_of_unit_arg2( arg2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40507L)
  public static SubLObject valid_term_of_unit_inter_args(final SubLObject arg1, final SubLObject arg2)
  {
    if( NIL != el_utilities.possibly_nat_p( arg1 ) && NIL != el_utilities.possibly_nat_p( arg2 ) )
    {
      final SubLObject arg1_functor = cycl_utilities.nat_functor( arg1 );
      final SubLObject arg2_functor = cycl_utilities.nat_functor( arg2 );
      if( NIL != forts.fort_p( arg1_functor ) && NIL != forts.fort_p( arg2_functor ) && !arg1_functor.eql( arg2_functor ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40856L)
  public static SubLObject syntactically_valid_term_of_unit_asent(final SubLObject tou_asent)
  {
    if( NIL != el_utilities.formula_arityE( tou_asent, TWO_INTEGER, UNPROVIDED ) )
    {
      final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( tou_asent, UNPROVIDED );
      final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( tou_asent, UNPROVIDED );
      return makeBoolean( NIL != valid_term_of_unit_args( arg1, arg2 ) && NIL != valid_term_of_unit_inter_args( arg1, arg2 ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41344L)
  public static SubLObject literal_set_sense(final SubLObject literal_set)
  {
    return conses_high.assoc( literal_set, $literal_set_sense_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41456L)
  public static SubLObject literal_set_without(final SubLObject literals, final SubLObject literal_num)
  {
    return list_utilities.remove_nth( literal_num, literals );
  }

  public static SubLObject declare_backward_file()
  {
    SubLFiles.declareFunction( me, "inference_expand_new_children", "INFERENCE-EXPAND-NEW-CHILDREN", 0, 0, false );
    SubLFiles.declareFunction( me, "add_to_inference_expand_new_children", "ADD-TO-INFERENCE-EXPAND-NEW-CHILDREN", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_expand_hl_module", "INFERENCE-EXPAND-HL-MODULE", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_expand_sense", "INFERENCE-EXPAND-SENSE", 0, 0, false );
    SubLFiles.declareFunction( me, "transformation_add_node", "TRANSFORMATION-ADD-NODE", 4, 1, false );
    SubLFiles.declareFunction( me, "transformation_rule_dependent_lits", "TRANSFORMATION-RULE-DEPENDENT-LITS", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_add_node", "REMOVAL-ADD-NODE", 1, 2, false );
    SubLFiles.declareFunction( me, "removal_add_node_funcall", "REMOVAL-ADD-NODE-FUNCALL", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_add_node_helper_remove_bad_supports", "REMOVAL-ADD-NODE-HELPER-REMOVE-BAD-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_add_node_helper_rewrite_dispreferred_terms", "REMOVAL-ADD-NODE-HELPER-REWRITE-DISPREFERRED-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_add_node_helper_dereference_indexicals", "REMOVAL-ADD-NODE-HELPER-DEREFERENCE-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "terms_not_used_in_support_quoted_context", "TERMS-NOT-USED-IN-SUPPORT-QUOTED-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_simplify_supports_to_single_deduced_assertion", "POSSIBLY-SIMPLIFY-SUPPORTS-TO-SINGLE-DEDUCED-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_add_node_helper_modify_supports", "REMOVAL-ADD-NODE-HELPER-MODIFY-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_ask_query_property_p", "REMOVAL-ASK-QUERY-PROPERTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_ask", "REMOVAL-ASK", 1, 3, false );
    SubLFiles.declareFunction( me, "el_removal_ask", "EL-REMOVAL-ASK", 1, 3, false );
    SubLFiles.declareFunction( me, "removal_ask_bindings", "REMOVAL-ASK-BINDINGS", 1, 3, false );
    SubLFiles.declareFunction( me, "el_removal_ask_bindings", "EL-REMOVAL-ASK-BINDINGS", 1, 3, false );
    SubLFiles.declareFunction( me, "removal_ask_justifications", "REMOVAL-ASK-JUSTIFICATIONS", 1, 3, false );
    SubLFiles.declareFunction( me, "el_removal_ask_justifications", "EL-REMOVAL-ASK-JUSTIFICATIONS", 1, 3, false );
    SubLFiles.declareFunction( me, "removal_ask_template", "REMOVAL-ASK-TEMPLATE", 2, 3, false );
    SubLFiles.declareFunction( me, "el_removal_ask_template", "EL-REMOVAL-ASK-TEMPLATE", 2, 3, false );
    SubLFiles.declareFunction( me, "el_removal_ask_variable", "EL-REMOVAL-ASK-VARIABLE", 2, 3, false );
    SubLFiles.declareFunction( me, "removal_ask_variable", "REMOVAL-ASK-VARIABLE", 2, 3, false );
    SubLFiles.declareFunction( me, "removal_ask_hl_variable", "REMOVAL-ASK-HL-VARIABLE", 2, 3, false );
    SubLFiles.declareFunction( me, "removal_ask_answer_count", "REMOVAL-ASK-ANSWER-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_ask_add_node", "REMOVAL-ASK-ADD-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_ask_int", "REMOVAL-ASK-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_ask_tactic_specs", "REMOVAL-ASK-TACTIC-SPECS", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_ask_expand", "REMOVAL-ASK-EXPAND", 4, 0, false );
    SubLFiles.declareFunction( me, "removal_ask_compute_metric_values", "REMOVAL-ASK-COMPUTE-METRIC-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "note_removal_ask_done", "NOTE-REMOVAL-ASK-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_hl_module_cost_too_expensive", "INFERENCE-HL-MODULE-COST-TOO-EXPENSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "closed_conjunctive_cycl_sentence_p", "CLOSED-CONJUNCTIVE-CYCL-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_literal_or_conjunction_of_cycl_literals_p", "CYCL-LITERAL-OR-CONJUNCTION-OF-CYCL-LITERALS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "closed_conjunctive_removal_ask", "CLOSED-CONJUNCTIVE-REMOVAL-ASK", 1, 2, false );
    SubLFiles.declareFunction( me, "removal_ask_literal", "REMOVAL-ASK-LITERAL", 3, 0, false );
    SubLFiles.declareFunction( me, "semantically_valid_closed_asentsP", "SEMANTICALLY-VALID-CLOSED-ASENTS?", 1, 2, false );
    SubLFiles.declareFunction( me, "semantically_valid_closed_asentsP_int", "SEMANTICALLY-VALID-CLOSED-ASENTS?-INT", 3, 1, false );
    SubLFiles.declareFunction( me, "semantically_valid_asserted_sentence_asents", "SEMANTICALLY-VALID-ASSERTED-SENTENCE-ASENTS", 1, 2, false );
    SubLFiles.declareFunction( me, "semantically_valid_complete_extent_asserted_asents", "SEMANTICALLY-VALID-COMPLETE-EXTENT-ASSERTED-ASENTS", 1, 2, false );
    SubLFiles.declareFunction( me, "semantically_invalid_asserted_sentence_asent", "SEMANTICALLY-INVALID-ASSERTED-SENTENCE-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "asent_only_has_pred_boundP", "ASENT-ONLY-HAS-PRED-BOUND?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_asserted_asentP", "NON-ASSERTED-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_asserted_asent_via_somewhere_cacheP", "NON-ASSERTED-ASENT-VIA-SOMEWHERE-CACHE?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_asserted_asent_via_gaf_lookupP", "NON-ASSERTED-ASENT-VIA-GAF-LOOKUP?", 1, 0, false );
    SubLFiles.declareFunction( me, "semantically_valid_isa_asents", "SEMANTICALLY-VALID-ISA-ASENTS", 1, 2, false );
    SubLFiles.declareFunction( me, "semantically_valid_genls_asents", "SEMANTICALLY-VALID-GENLS-ASENTS", 1, 2, false );
    SubLFiles.declareFunction( me, "semantically_valid_term_of_unit_asents", "SEMANTICALLY-VALID-TERM-OF-UNIT-ASENTS", 1, 2, false );
    SubLFiles.declareFunction( me, "syntactically_valid_term_of_unit_asents", "SYNTACTICALLY-VALID-TERM-OF-UNIT-ASENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "valid_term_of_unit_arg1", "VALID-TERM-OF-UNIT-ARG1", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_term_of_unit_arg2", "VALID-TERM-OF-UNIT-ARG2", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_term_of_unit_args", "VALID-TERM-OF-UNIT-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_term_of_unit_inter_args", "VALID-TERM-OF-UNIT-INTER-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "syntactically_valid_term_of_unit_asent", "SYNTACTICALLY-VALID-TERM-OF-UNIT-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_set_sense", "LITERAL-SET-SENSE", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_set_without", "LITERAL-SET-WITHOUT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_backward_file()
  {
    $removal_add_node_method$ = SubLFiles.defparameter( "*REMOVAL-ADD-NODE-METHOD*", NIL );
    $transformation_add_node_method$ = SubLFiles.defparameter( "*TRANSFORMATION-ADD-NODE-METHOD*", NIL );
    $transformation_early_removal_threshold$ = SubLFiles.defparameter( "*TRANSFORMATION-EARLY-REMOVAL-THRESHOLD*", EIGHT_INTEGER );
    $inference_expand_new_children$ = SubLFiles.defparameter( "*INFERENCE-EXPAND-NEW-CHILDREN*", NIL );
    $inference_expand_hl_module$ = SubLFiles.defparameter( "*INFERENCE-EXPAND-HL-MODULE*", NIL );
    $inference_expand_sense$ = SubLFiles.defparameter( "*INFERENCE-EXPAND-SENSE*", NIL );
    $force_query_supports_in_forward_inferenceP$ = SubLFiles.defparameter( "*FORCE-QUERY-SUPPORTS-IN-FORWARD-INFERENCE?*", NIL );
    $force_forward_mt_combos_computation_in_forward_inferenceP$ = SubLFiles.defparameter( "*FORCE-FORWARD-MT-COMBOS-COMPUTATION-IN-FORWARD-INFERENCE?*", NIL );
    $debug_removal_add_node_helper_modify_supportsP$ = SubLFiles.defparameter( "*DEBUG-REMOVAL-ADD-NODE-HELPER-MODIFY-SUPPORTS?*", NIL );
    $removal_ask_query_properties$ = SubLFiles.deflexical( "*REMOVAL-ASK-QUERY-PROPERTIES*", $list21 );
    $removal_ask_answers$ = SubLFiles.defparameter( "*REMOVAL-ASK-ANSWERS*", NIL );
    $removal_ask_max_number$ = SubLFiles.defparameter( "*REMOVAL-ASK-MAX-NUMBER*", NIL );
    $removal_ask_disallows_indeterminate_termsP$ = SubLFiles.defparameter( "*REMOVAL-ASK-DISALLOWS-INDETERMINATE-TERMS?*", NIL );
    $removal_ask_first_answer_elapsed_internal_real_time$ = SubLFiles.defparameter( "*REMOVAL-ASK-FIRST-ANSWER-ELAPSED-INTERNAL-REAL-TIME*", NIL );
    $removal_ask_last_answer_elapsed_internal_real_time$ = SubLFiles.defparameter( "*REMOVAL-ASK-LAST-ANSWER-ELAPSED-INTERNAL-REAL-TIME*", NIL );
    $removal_ask_start_internal_real_time$ = SubLFiles.defparameter( "*REMOVAL-ASK-START-INTERNAL-REAL-TIME*", NIL );
    $transformation_semantic_pruning_enabled$ = SubLFiles.defparameter( "*TRANSFORMATION-SEMANTIC-PRUNING-ENABLED*", NIL );
    $forward_inference_pruning_mode$ = SubLFiles.defvar( "*FORWARD-INFERENCE-PRUNING-MODE*", $kw58$LEGACY );
    $forward_asserted_sentence_pruning_enabledP$ = SubLFiles.defvar( "*FORWARD-ASSERTED-SENTENCE-PRUNING-ENABLED?*", T );
    $preds_with_assumed_extent$ = SubLFiles.defconstant( "*PREDS-WITH-ASSUMED-EXTENT*", $list72 );
    $literal_set_sense_table$ = SubLFiles.deflexical( "*LITERAL-SET-SENSE-TABLE*", $list80 );
    return NIL;
  }

  public static SubLObject setup_backward_file()
  {
    access_macros.register_external_symbol( $sym22$REMOVAL_ASK );
    utilities_macros.declare_control_parameter_internal( $sym54$_TRANSFORMATION_SEMANTIC_PRUNING_ENABLED_, $str55$Semantic_pruning_of_results_of_ba, $str56$This_controls_whether_or_not_the_, $list57 );
    generic_testing.define_test_case_table_int( $sym81$CLOSED_CONJUNCTIVE_REMOVAL_ASK, ConsesLow.list( new SubLObject[] { $kw82$TEST, NIL, $kw83$OWNER, NIL, $kw84$CLASSES, NIL, $kw85$KB, $kw86$TINY, $kw87$WORKING_, T
    } ), $list88 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_backward_file();
  }

  @Override
  public void initializeVariables()
  {
    init_backward_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_backward_file();
  }
  static
  {
    me = new backward();
    $removal_add_node_method$ = null;
    $transformation_add_node_method$ = null;
    $transformation_early_removal_threshold$ = null;
    $inference_expand_new_children$ = null;
    $inference_expand_hl_module$ = null;
    $inference_expand_sense$ = null;
    $force_query_supports_in_forward_inferenceP$ = null;
    $force_forward_mt_combos_computation_in_forward_inferenceP$ = null;
    $debug_removal_add_node_helper_modify_supportsP$ = null;
    $removal_ask_query_properties$ = null;
    $removal_ask_answers$ = null;
    $removal_ask_max_number$ = null;
    $removal_ask_disallows_indeterminate_termsP$ = null;
    $removal_ask_first_answer_elapsed_internal_real_time$ = null;
    $removal_ask_last_answer_elapsed_internal_real_time$ = null;
    $removal_ask_start_internal_real_time$ = null;
    $transformation_semantic_pruning_enabled$ = null;
    $forward_inference_pruning_mode$ = null;
    $forward_asserted_sentence_pruning_enabledP$ = null;
    $preds_with_assumed_extent$ = null;
    $literal_set_sense_table$ = null;
    $str0$The_legacy_harness_is_no_longer_s = makeString( "The legacy harness is no longer supported." );
    $kw1$POS = makeKeyword( "POS" );
    $sym2$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE = makeSymbol( "HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE" );
    $sym3$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS = makeSymbol( "HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS" );
    $sym4$REMOVAL_ASK_ADD_NODE = makeSymbol( "REMOVAL-ASK-ADD-NODE" );
    $sym5$SUPPORT_P = makeSymbol( "SUPPORT-P" );
    $str6$Removing_invalid_support__S_from_ = makeString( "Removing invalid support ~S from ~S result" );
    $sym7$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_ = makeSymbol( "SOME-SOURCE-REWRITE-OF-ASSERTIONS-SOMEWHERE?" );
    $const8$rewriteOf = constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) );
    $kw9$EQUALITY = makeKeyword( "EQUALITY" );
    $sym10$HAS_PREFERRED_REWRITE_TERM_ = makeSymbol( "HAS-PREFERRED-REWRITE-TERM?" );
    $sym11$PREFERRED_REWRITE_TERM = makeSymbol( "PREFERRED-REWRITE-TERM" );
    $const12$Now = constant_handles.reader_make_constant_shell( makeString( "Now" ) );
    $list13 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Now" ) ) );
    $kw14$OPAQUE = makeKeyword( "OPAQUE" );
    $const15$indexicalReferent = constant_handles.reader_make_constant_shell( makeString( "indexicalReferent" ) );
    $const16$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym17$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $list18 = ConsesLow.list( makeSymbol( "MTS" ), makeSymbol( "IGNORED-SUPPORTS" ) );
    $kw19$QUERY = makeKeyword( "QUERY" );
    $list20 = ConsesLow.list( makeSymbol( "IGNORED-MTS" ), makeSymbol( "NEW-SUPPORTS" ) );
    $list21 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), makeKeyword( "ALLOWED-MODULES" ), makeKeyword( "METRICS" ), makeKeyword( "ALLOW-ABNORMALITY-CHECKING?" ), makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ) );
    $sym22$REMOVAL_ASK = makeSymbol( "REMOVAL-ASK" );
    $kw23$TRUE = makeKeyword( "TRUE" );
    $sym24$CYCL_ATOMIC_SENTENCE_P = makeSymbol( "CYCL-ATOMIC-SENTENCE-P" );
    $sym25$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $sym26$REMOVAL_ASK_QUERY_PROPERTY_P = makeSymbol( "REMOVAL-ASK-QUERY-PROPERTY-P" );
    $sym27$FIRST = makeSymbol( "FIRST" );
    $sym28$SECOND = makeSymbol( "SECOND" );
    $list29 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "SUPPORTS" ) );
    $kw30$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw31$ALLOWED_MODULES = makeKeyword( "ALLOWED-MODULES" );
    $kw32$ALL = makeKeyword( "ALL" );
    $kw33$EXHAUST_TOTAL = makeKeyword( "EXHAUST-TOTAL" );
    $sym34$_ = makeSymbol( "<" );
    $kw35$METRICS = makeKeyword( "METRICS" );
    $kw36$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw37$REMOVAL_ASK_DONE = makeKeyword( "REMOVAL-ASK-DONE" );
    $list38 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "PRODUCTIVITY" ), makeSymbol( "COMPLETENESS" ) );
    $kw39$ANSWER_COUNT = makeKeyword( "ANSWER-COUNT" );
    $kw40$TIME_TO_FIRST_ANSWER = makeKeyword( "TIME-TO-FIRST-ANSWER" );
    $kw41$TIME_TO_LAST_ANSWER = makeKeyword( "TIME-TO-LAST-ANSWER" );
    $kw42$TOTAL_TIME = makeKeyword( "TOTAL-TIME" );
    $kw43$TIME_PER_ANSWER = makeKeyword( "TIME-PER-ANSWER" );
    $kw44$LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeKeyword( "LATENCY-IMPROVEMENT-FROM-ITERATIVITY" );
    $kw45$COMPLETE_USER_TIME = makeKeyword( "COMPLETE-USER-TIME" );
    $kw46$COMPLETE_SYSTEM_TIME = makeKeyword( "COMPLETE-SYSTEM-TIME" );
    $kw47$COMPLETE_TOTAL_TIME = makeKeyword( "COMPLETE-TOTAL-TIME" );
    $str48$removal_ask_cannot_handle_metric_ = makeString( "removal-ask cannot handle metric ~s, using NIL instead" );
    $kw49$REMOVAL = makeKeyword( "REMOVAL" );
    $kw50$IGNORE = makeKeyword( "IGNORE" );
    $sym51$CLOSED_CONJUNCTIVE_CYCL_SENTENCE_P = makeSymbol( "CLOSED-CONJUNCTIVE-CYCL-SENTENCE-P" );
    $sym52$CYCL_LITERAL_P = makeSymbol( "CYCL-LITERAL-P" );
    $kw53$FALSE = makeKeyword( "FALSE" );
    $sym54$_TRANSFORMATION_SEMANTIC_PRUNING_ENABLED_ = makeSymbol( "*TRANSFORMATION-SEMANTIC-PRUNING-ENABLED*" );
    $str55$Semantic_pruning_of_results_of_ba = makeString( "Semantic pruning of results of backchaining" );
    $str56$This_controls_whether_or_not_the_ = makeString(
        "This controls whether or not the intermediate results of backchaining\nare examined to see if they are provably unsatisfiable.  If so, these\nresults are pruned from the search.  This test takes time, but usually\nprovides substantial pruning of the search tree when backchaining." );
    $list57 = ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), T, makeString( "Yes" ) ), ConsesLow.list( makeKeyword( "VALUE" ), NIL, makeString( "No" ) ) );
    $kw58$LEGACY = makeKeyword( "LEGACY" );
    $kw59$NONE = makeKeyword( "NONE" );
    $kw60$TRIVIAL = makeKeyword( "TRIVIAL" );
    $kw61$INFERENCE = makeKeyword( "INFERENCE" );
    $str62$Unexpected_pruning_mode____S = makeString( "Unexpected pruning mode : ~S" );
    $list63 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $kw64$TYPE = makeKeyword( "TYPE" );
    $kw65$SEMANTICALLY_INVALID_CLOSED_ASENT_VIA_QUERY = makeKeyword( "SEMANTICALLY-INVALID-CLOSED-ASENT-VIA-QUERY" );
    $kw66$POS_LIT = makeKeyword( "POS-LIT" );
    $const67$assertedSentence = constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) );
    $sym68$ATOMIC_SENTENCE_PREDICATE = makeSymbol( "ATOMIC-SENTENCE-PREDICATE" );
    $kw69$SEMANTICALLY_INVALID_ASSERTED_SENTENCE_ASENT = makeKeyword( "SEMANTICALLY-INVALID-ASSERTED-SENTENCE-ASENT" );
    $kw70$ASENT = makeKeyword( "ASENT" );
    $kw71$SEMANTICALLY_INVALID_COMPLETE_EXTENT_ASSERTED_ASENT = makeKeyword( "SEMANTICALLY-INVALID-COMPLETE-EXTENT-ASSERTED-ASENT" );
    $list72 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $sym73$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $const74$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw75$SEMANTICALLY_INVALID_ISA_ASENT = makeKeyword( "SEMANTICALLY-INVALID-ISA-ASENT" );
    $const76$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw77$SEMANTICALLY_INVALID_GENLS_ASENT = makeKeyword( "SEMANTICALLY-INVALID-GENLS-ASENT" );
    $const78$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $kw79$SYNTACTICALLY_INVALID_TERM_OF_UNIT = makeKeyword( "SYNTACTICALLY-INVALID-TERM-OF-UNIT" );
    $list80 = ConsesLow.list( ConsesLow.cons( makeKeyword( "NO-POS" ), makeKeyword( "POS" ) ), ConsesLow.cons( makeKeyword( "NO-NEG" ), makeKeyword( "NEG" ) ), ConsesLow.cons( makeKeyword( "YES-POS" ), makeKeyword(
        "POS" ) ), ConsesLow.cons( makeKeyword( "YES-NEG" ), makeKeyword( "NEG" ) ) );
    $sym81$CLOSED_CONJUNCTIVE_REMOVAL_ASK = makeSymbol( "CLOSED-CONJUNCTIVE-REMOVAL-ASK" );
    $kw82$TEST = makeKeyword( "TEST" );
    $kw83$OWNER = makeKeyword( "OWNER" );
    $kw84$CLASSES = makeKeyword( "CLASSES" );
    $kw85$KB = makeKeyword( "KB" );
    $kw86$TINY = makeKeyword( "TINY" );
    $kw87$WORKING_ = makeKeyword( "WORKING?" );
    $list88 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ),
        T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
            constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ) ) ), NIL ), ConsesLow.list(
                    ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                        .reader_make_constant_shell( makeString( "Predicate" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                            constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list(
                                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                                    .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow
                                        .list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                                            .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ), T ) );
  }
}
/*
 * 
 * Total time: 568 ms
 * 
 */