package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.inference.harness.inference_strategic_heuristics;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class deep_inference_generator
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.deep_inference_generator";
  public static final String myFingerPrint = "e1ca6d41c15299b591eaf557e72e97eee0346e9dcf4abdda37a5e4d4ca4cdd0f";
  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 935L)
  private static SubLSymbol $deep_inference_gaf_table$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 1190L)
  private static SubLSymbol $deep_inference_recursion_stack$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 4997L)
  private static SubLSymbol $totally_uninteresting_haystack_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 5278L)
  private static SubLSymbol $somewhat_uninteresting_haystack_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 11382L)
  private static SubLSymbol $straw_seeking_query_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16969L)
  private static SubLSymbol $abduced_term_to_random_variable_caching_state$;
  private static final SubLSymbol $sym0$_DEEP_INFERENCE_GAF_TABLE_;
  private static final SubLInteger $int1$212;
  private static final SubLSymbol $kw2$UNINITIALIZED;
  private static final SubLString $str3$Looking_for_deeply_deduced_gafs;
  private static final SubLSymbol $sym4$STRINGP;
  private static final SubLSymbol $kw5$SKIP;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$RULE_ASSERTION_;
  private static final SubLSymbol $sym9$ASSERTION_MT;
  private static final SubLSymbol $sym10$POSITIVE_INTEGER_P;
  private static final SubLObject $const11$InferencePSC;
  private static final SubLSymbol $kw12$IGNORE;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$NONSTANDARD_TRANSFORMATION_ASENT_P;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$STANDARD_TRANSFORMATION_ASENT_P;
  private static final SubLSymbol $sym17$HL_SUPPORT_SENTENCE;
  private static final SubLSymbol $sym18$ABDUCED_TERM_P;
  private static final SubLSymbol $sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$MAKE_ISA_X_THING_ASENT;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$INFERENCE_ANSWER_JUSTIFICATION_USES_AT_LEAST_ONE_RULE_;
  private static final SubLSymbol $sym24$ABDUCTION_SUPPORT_P;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLString $str27$Failed_to_remove_conjunct;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$CONDITIONAL_SENTENCE_;
  private static final SubLSymbol $kw30$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw31$ALLOWED_RULES;
  private static final SubLSymbol $kw32$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLFloat $float33$0_95;
  private static final SubLSymbol $kw34$RETURN;
  private static final SubLSymbol $kw35$BINDINGS_AND_SUPPORTS;
  private static final SubLObject $const36$UniversalVocabularyMt;
  private static final SubLObject $const37$isa;
  private static final SubLList $list38;
  private static final SubLString $str39$_VAR;
  private static final SubLSymbol $sym40$_ABDUCED_TERM_TO_RANDOM_VARIABLE_CACHING_STATE_;
  private static final SubLSymbol $sym41$ISA_VAR_FORT_LIT_;

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 1262L)
  public static SubLObject generate_deep_inference(final SubLObject n)
  {
    if( n.isZero() )
    {
      final SubLObject gaf = assertions_high.random_gaf();
      return uncanonicalizer.assertion_el_ist_formula( gaf );
    }
    initialize_deep_inference_gaf_table( UNPROVIDED );
    final SubLObject gaf = hash_table_utilities.random_hash_table_key_with_value( $deep_inference_gaf_table$.getGlobalValue(), n, UNPROVIDED );
    if( NIL != gaf )
    {
      return uncanonicalizer.assertion_el_ist_formula( gaf );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 2585L)
  public static SubLObject initialize_deep_inference_gaf_table(SubLObject recomputeP)
  {
    if( recomputeP == UNPROVIDED )
    {
      recomputeP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $deep_inference_gaf_table$.getGlobalValue().isHashtable() && NIL == recomputeP )
    {
      return $deep_inference_gaf_table$.getGlobalValue();
    }
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str3$Looking_for_deeply_deduced_gafs;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$1 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$1, $kw5$SKIP ) )
        {
          final SubLObject idx_$2 = idx_$1;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$2, $kw5$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$2 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject ass;
            SubLObject _prev_bind_0_$3;
            SubLObject depth;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw5$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw5$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != assertions_high.gaf_assertionP( ass ) && NIL != assertions_high.deduced_assertionP( ass ) && NIL == assertions_high.asserted_assertionP( ass ) )
                {
                  _prev_bind_0_$3 = $deep_inference_recursion_stack$.currentBinding( thread );
                  try
                  {
                    $deep_inference_recursion_stack$.bind( NIL, thread );
                    depth = assertion_provability_depth( ass );
                    if( depth.isPositive() )
                    {
                      Hashtables.sethash( ass, $deep_inference_gaf_table$.getGlobalValue(), depth );
                    }
                  }
                  finally
                  {
                    $deep_inference_recursion_stack$.rebind( _prev_bind_0_$3, thread );
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$3 = idx_$1;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$3 ) || NIL == id_index.id_index_skip_tombstones_p( $kw5$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$3 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$3 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$3 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw5$SKIP ) ) ? NIL : $kw5$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw5$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != assertions_high.gaf_assertionP( ass2 ) && NIL != assertions_high.deduced_assertionP( ass2 ) && NIL == assertions_high.asserted_assertionP( ass2 ) )
                {
                  final SubLObject _prev_bind_0_$4 = $deep_inference_recursion_stack$.currentBinding( thread );
                  try
                  {
                    $deep_inference_recursion_stack$.bind( NIL, thread );
                    final SubLObject depth2 = assertion_provability_depth( ass2 );
                    if( depth2.isPositive() )
                    {
                      Hashtables.sethash( ass2, $deep_inference_gaf_table$.getGlobalValue(), depth2 );
                    }
                  }
                  finally
                  {
                    $deep_inference_recursion_stack$.rebind( _prev_bind_0_$4, thread );
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return $deep_inference_gaf_table$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 3245L)
  public static SubLObject assertion_provability_depth(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subl_promotions.memberP( assertion, $deep_inference_recursion_stack$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      return ZERO_INTEGER;
    }
    SubLObject depth = NIL;
    final SubLObject _prev_bind_0 = $deep_inference_recursion_stack$.currentBinding( thread );
    try
    {
      $deep_inference_recursion_stack$.bind( ConsesLow.cons( assertion, $deep_inference_recursion_stack$.getDynamicValue( thread ) ), thread );
      if( NIL != assertions_high.asserted_assertionP( assertion ) )
      {
        depth = ZERO_INTEGER;
      }
      else if( NIL == backward_rule_required_for_assertionP( assertion ) )
      {
        depth = ZERO_INTEGER;
      }
      else
      {
        SubLObject max_support_depth = ZERO_INTEGER;
        SubLObject cdolist_list_var = assertions_high.assertion_arguments( assertion );
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != deduction_handles.deduction_p( argument ) )
          {
            SubLObject cdolist_list_var_$7 = deductions_high.deduction_supports( argument );
            SubLObject support = NIL;
            support = cdolist_list_var_$7.first();
            while ( NIL != cdolist_list_var_$7)
            {
              if( NIL != assertions_high.gaf_assertionP( support ) )
              {
                final SubLObject recursive_depth = assertion_provability_depth( support );
                if( recursive_depth.numG( max_support_depth ) )
                {
                  max_support_depth = recursive_depth;
                }
              }
              cdolist_list_var_$7 = cdolist_list_var_$7.rest();
              support = cdolist_list_var_$7.first();
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          argument = cdolist_list_var.first();
        }
        depth = number_utilities.f_1X( max_support_depth );
      }
    }
    finally
    {
      $deep_inference_recursion_stack$.rebind( _prev_bind_0, thread );
    }
    return depth;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 4179L)
  public static SubLObject backward_rule_required_for_assertionP(final SubLObject assertion)
  {
    SubLObject deducible_via_backward_ruleP = NIL;
    SubLObject cdolist_list_var = assertions_high.assertion_arguments( assertion );
    SubLObject argument = NIL;
    argument = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == deduction_handles.deduction_p( argument ) || NIL == backward_rule_deductionP( argument ) )
      {
        return NIL;
      }
      deducible_via_backward_ruleP = T;
      cdolist_list_var = cdolist_list_var.rest();
      argument = cdolist_list_var.first();
    }
    return deducible_via_backward_ruleP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 4601L)
  public static SubLObject backward_rule_deductionP(final SubLObject deduction)
  {
    SubLObject backward_requiredP = NIL;
    SubLObject cdolist_list_var = deductions_high.deduction_supports( deduction );
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertions_high.backward_ruleP( support ) )
      {
        backward_requiredP = T;
      }
      else if( NIL != assertions_high.forward_ruleP( support ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return backward_requiredP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 5755L)
  public static SubLObject haystack_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.doubletonP( v_object ) && NIL != el_utilities.ist_sentence_p( v_object.first(), UNPROVIDED ) && conses_high.second( v_object ).isCons() && NIL != list_utilities
        .every_in_list( $sym8$RULE_ASSERTION_, conses_high.second( v_object ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 5950L)
  public static SubLObject interesting_haystack_p(final SubLObject haystack)
  {
    final SubLObject mts = Mapping.mapcar( $sym9$ASSERTION_MT, haystack_rules( haystack ) );
    if( NIL != list_utilities.intersectP( mts, $totally_uninteresting_haystack_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( haystack_size( haystack ).numGE( TWO_INTEGER ) && NIL != list_utilities.singletonP( Sequences.remove_duplicates( mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) && NIL != subl_promotions.memberP( mts
        .first(), $somewhat_uninteresting_haystack_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6414L)
  public static SubLObject haystack_query(final SubLObject haystack)
  {
    return haystack.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6482L)
  public static SubLObject haystack_rules(final SubLObject haystack)
  {
    return conses_high.second( haystack );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6551L)
  public static SubLObject haystack_size(final SubLObject haystack)
  {
    return Sequences.length( haystack_rules( haystack ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6636L)
  public static SubLObject straw_p(final SubLObject v_object)
  {
    return list_utilities.tripleP( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6765L)
  public static SubLObject generate_haystack(final SubLObject n)
  {
    assert NIL != subl_promotions.positive_integer_p( n ) : n;
    SubLObject haystack;
    for( haystack = NIL; NIL == haystack; haystack = generate_haystack_int( n ) )
    {
    }
    return fix_haystack_variables( collapse_haystack( haystack ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 6994L)
  public static SubLObject collapse_haystack(final SubLObject haystack)
  {
    final SubLObject rules = haystack_rules( haystack );
    final SubLObject rule_mts = Mapping.mapcar( $sym9$ASSERTION_MT, rules );
    final SubLObject mts = genl_mts.max_floor_mts( rule_mts, UNPROVIDED, UNPROVIDED );
    SubLObject mt = NIL;
    if( NIL != list_utilities.singletonP( mts ) )
    {
      mt = mts.first();
    }
    else
    {
      mt = $const11$InferencePSC;
    }
    final SubLObject old_ist_sentence = haystack_query( haystack );
    final SubLObject sentence = el_utilities.designated_sentence( old_ist_sentence );
    final SubLObject new_ist_sentence = el_utilities.make_ist_sentence( mt, sentence );
    final SubLObject new_haystack = ConsesLow.list( new_ist_sentence, rules );
    return new_haystack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 7528L)
  public static SubLObject fix_haystack_variables(final SubLObject haystack)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ist_query = haystack_query( haystack );
    final SubLObject implication = el_utilities.designated_sentence( ist_query );
    final SubLObject antecedent = cycl_utilities.sentence_arg1( implication, UNPROVIDED );
    final SubLObject rules = haystack_rules( haystack );
    SubLObject variable_map = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( antecedent, $kw12$IGNORE );
    SubLObject conjunct = NIL;
    conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$8 = rules;
      SubLObject rule = NIL;
      rule = cdolist_list_var_$8.first();
      while ( NIL != cdolist_list_var_$8)
      {
        SubLObject cdolist_list_var_$9 = clauses.neg_lits( assertions_high.assertion_cnf( rule ) );
        SubLObject rule_asent = NIL;
        rule_asent = cdolist_list_var_$9.first();
        while ( NIL != cdolist_list_var_$9)
        {
          thread.resetMultipleValues();
          final SubLObject hl_bindings = unification.unify( conjunct, rule_asent, UNPROVIDED, UNPROVIDED );
          final SubLObject hl_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != hl_bindings )
          {
            SubLObject cdolist_list_var_$10 = hl_bindings;
            SubLObject hl_binding = NIL;
            hl_binding = cdolist_list_var_$10.first();
            while ( NIL != cdolist_list_var_$10)
            {
              SubLObject current;
              final SubLObject datum = current = hl_binding;
              SubLObject rule_hl_var = NIL;
              SubLObject haystack_var = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
              rule_hl_var = current.first();
              current = ( haystack_var = current.rest() );
              if( NIL != cycl_grammar.hl_variable_p( rule_hl_var ) && NIL != cycl_grammar.el_variable_p( haystack_var ) && NIL == list_utilities.alist_lookup( variable_map, haystack_var, UNPROVIDED, UNPROVIDED ) )
              {
                final SubLObject rule_el_var = assertions_high.assertion_hl_variable_to_el( rule, rule_hl_var );
                if( NIL == list_utilities.alist_reverse_lookup( variable_map, rule_el_var, UNPROVIDED, UNPROVIDED ) )
                {
                  final SubLObject el_binding = bindings.make_variable_binding( haystack_var, rule_el_var );
                  variable_map = ConsesLow.cons( el_binding, variable_map );
                }
              }
              cdolist_list_var_$10 = cdolist_list_var_$10.rest();
              hl_binding = cdolist_list_var_$10.first();
            }
          }
          cdolist_list_var_$9 = cdolist_list_var_$9.rest();
          rule_asent = cdolist_list_var_$9.first();
        }
        SubLObject cdolist_list_var_$11 = clauses.pos_lits( assertions_high.assertion_cnf( rule ) );
        rule_asent = NIL;
        rule_asent = cdolist_list_var_$11.first();
        while ( NIL != cdolist_list_var_$11)
        {
          thread.resetMultipleValues();
          final SubLObject hl_bindings = unification.unify( conjunct, rule_asent, UNPROVIDED, UNPROVIDED );
          final SubLObject hl_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != hl_bindings )
          {
            SubLObject cdolist_list_var_$12 = hl_bindings;
            SubLObject hl_binding = NIL;
            hl_binding = cdolist_list_var_$12.first();
            while ( NIL != cdolist_list_var_$12)
            {
              SubLObject current;
              final SubLObject datum = current = hl_binding;
              SubLObject rule_hl_var = NIL;
              SubLObject haystack_var = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
              rule_hl_var = current.first();
              current = ( haystack_var = current.rest() );
              if( NIL != cycl_grammar.hl_variable_p( rule_hl_var ) && NIL != cycl_grammar.el_variable_p( haystack_var ) && NIL == list_utilities.alist_lookup( variable_map, haystack_var, UNPROVIDED, UNPROVIDED ) )
              {
                final SubLObject rule_el_var = assertions_high.assertion_hl_variable_to_el( rule, rule_hl_var );
                if( NIL == list_utilities.alist_reverse_lookup( variable_map, rule_el_var, UNPROVIDED, UNPROVIDED ) )
                {
                  final SubLObject el_binding = bindings.make_variable_binding( haystack_var, rule_el_var );
                  variable_map = ConsesLow.cons( el_binding, variable_map );
                }
              }
              cdolist_list_var_$12 = cdolist_list_var_$12.rest();
              hl_binding = cdolist_list_var_$12.first();
            }
          }
          cdolist_list_var_$11 = cdolist_list_var_$11.rest();
          rule_asent = cdolist_list_var_$11.first();
        }
        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
        rule = cdolist_list_var_$8.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      conjunct = cdolist_list_var.first();
    }
    final SubLObject new_query = cycl_utilities.expression_sublis( variable_map, ist_query, UNPROVIDED, UNPROVIDED );
    final SubLObject new_haystack = ConsesLow.list( new_query, rules );
    return new_haystack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 8697L)
  public static SubLObject generate_haystack_int(final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( n ) : n;
    SubLObject frustration = ZERO_INTEGER;
    SubLObject haystack = NIL;
    SubLObject straw = NIL;
    while ( !n.numE( haystack_size( haystack ) ))
    {
      thread.resetMultipleValues();
      final SubLObject new_haystack = grow_haystack( haystack, straw );
      final SubLObject new_straw = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != new_haystack )
      {
        if( NIL != interesting_haystack_p( new_haystack ) )
        {
          frustration = ZERO_INTEGER;
          haystack = new_haystack;
          straw = new_straw;
        }
        else
        {
          haystack = NIL;
          straw = NIL;
        }
      }
      else
      {
        frustration = Numbers.add( frustration, ONE_INTEGER );
      }
      if( NIL != abort_haystackP( haystack, frustration ) )
      {
        haystack = NIL;
        straw = NIL;
      }
    }
    return haystack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 9453L)
  public static SubLObject abort_haystackP(final SubLObject haystack, final SubLObject frustration)
  {
    return Numbers.numG( frustration, Numbers.multiply( FIVE_INTEGER, haystack_size( haystack ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 9707L)
  public static SubLObject grow_haystack(SubLObject haystack, final SubLObject straw)
  {
    final SubLObject needle = choose_next_needle( straw );
    if( NIL != needle )
    {
      final SubLObject next_straw = generate_straw_from_needle( needle );
      if( NIL != next_straw )
      {
        haystack = add_straw_to_haystack( haystack, needle, next_straw );
        if( NIL != verify_haystack( haystack, UNPROVIDED ) )
        {
          return Values.values( haystack, next_straw );
        }
      }
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 10217L)
  public static SubLObject choose_random_needle()
  {
    SubLObject needle;
    SubLObject neg_lit = null;
    for( needle = NIL; NIL == needle; needle = el_utilities.make_ist_sentence( $const11$InferencePSC, neg_lit ) )
    {
      final SubLObject rule = assertions_high.random_rule();
      SubLObject neg_lits = clauses.neg_lits( assertions_high.assertion_cnf( rule ) );
      neg_lits = Sequences.remove_if( $sym14$NONSTANDARD_TRANSFORMATION_ASENT_P, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != neg_lits )
      {
        neg_lit = cycl_utilities.hl_to_el( list_utilities.random_element( neg_lits ) );
      }
    }
    return needle;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 10617L)
  public static SubLObject choose_next_needle(final SubLObject straw)
  {
    if( NIL == straw )
    {
      return choose_random_needle();
    }
    SubLObject hypothetical_bindings = NIL;
    SubLObject abduced_supports = NIL;
    SubLObject rules = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( straw, straw, $list15 );
    hypothetical_bindings = straw.first();
    SubLObject current = straw.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, straw, $list15 );
    abduced_supports = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, straw, $list15 );
    rules = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject support_sentences = list_utilities.remove_if_not( $sym16$STANDARD_TRANSFORMATION_ASENT_P, Mapping.mapcar( $sym17$HL_SUPPORT_SENTENCE, abduced_supports ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
      SubLObject asent = list_utilities.random_element( support_sentences );
      if( NIL != asent )
      {
        asent = bindings.apply_bindings_backwards( hypothetical_bindings, asent );
        asent = cycl_utilities.expression_transform( asent, $sym18$ABDUCED_TERM_P, $sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE, UNPROVIDED, UNPROVIDED );
        final SubLObject next_needle = el_utilities.make_ist_sentence( $const11$InferencePSC, asent );
        return next_needle;
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( straw, $list15 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 11682L)
  public static SubLObject generate_straw_from_needle(final SubLObject needle)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject vars = el_utilities.sentence_free_variables( needle, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject neg_lits = Mapping.mapcar( $sym21$MAKE_ISA_X_THING_ASENT, vars );
    final SubLObject consequent = el_utilities.designated_sentence( needle );
    final SubLObject mt = $const11$InferencePSC;
    final SubLObject query = el_utilities.make_implication( el_utilities.make_conjunction( neg_lits ), consequent );
    SubLObject straw = NIL;
    thread.resetMultipleValues();
    final SubLObject bindings_and_hypothetical_bindings = inference_kernel.new_cyc_query( query, mt, $straw_seeking_query_properties$.getGlobalValue() );
    final SubLObject halt_reason = thread.secondMultipleValue();
    final SubLObject inference = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != bindings_and_hypothetical_bindings )
    {
      SubLObject current;
      final SubLObject datum = current = bindings_and_hypothetical_bindings;
      SubLObject result = NIL;
      SubLObject hypothetical_bindings = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
      result = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
      hypothetical_bindings = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != result )
        {
          final SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_id( inference, ZERO_INTEGER );
          final SubLObject rule_justifications = list_utilities.remove_if_not( $sym23$INFERENCE_ANSWER_JUSTIFICATION_USES_AT_LEAST_ONE_RULE_, inference_datastructures_inference.inference_answer_justifications(
              v_answer ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL != rule_justifications )
          {
            final SubLObject justification = list_utilities.random_element( rule_justifications );
            final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports( justification );
            final SubLObject rules = list_utilities.remove_if_not( $sym8$RULE_ASSERTION_, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            final SubLObject abduced_supports = list_utilities.remove_if_not( $sym24$ABDUCTION_SUPPORT_P, supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            straw = ConsesLow.list( hypothetical_bindings, abduced_supports, rules );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
      }
    }
    inference_datastructures_inference.destroy_inference_and_problem_store( inference );
    return straw;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 13026L)
  public static SubLObject add_straw_to_haystack(final SubLObject haystack, final SubLObject new_needle, final SubLObject new_straw)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hypothetical_bindings = NIL;
    SubLObject abduced_supports = NIL;
    SubLObject new_rules = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( new_straw, new_straw, $list25 );
    hypothetical_bindings = new_straw.first();
    SubLObject current = new_straw.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, new_straw, $list25 );
    abduced_supports = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, new_straw, $list25 );
    new_rules = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject new_conjuncts = Mapping.mapcar( $sym17$HL_SUPPORT_SENTENCE, abduced_supports );
      new_conjuncts = bindings.apply_bindings_backwards( hypothetical_bindings, new_conjuncts );
      new_conjuncts = cycl_utilities.expression_transform( new_conjuncts, $sym18$ABDUCED_TERM_P, $sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE, UNPROVIDED, UNPROVIDED );
      if( NIL == haystack )
      {
        final SubLObject consequent = el_utilities.designated_sentence( new_needle );
        final SubLObject mt = $const11$InferencePSC;
        final SubLObject implication = el_utilities.make_implication( el_utilities.make_conjunction( new_conjuncts ), consequent );
        return ConsesLow.list( el_utilities.make_ist_sentence( mt, implication ), new_rules );
      }
      SubLObject haystack_ist_sentence = NIL;
      SubLObject haystack_rules = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( haystack, haystack, $list26 );
      haystack_ist_sentence = haystack.first();
      SubLObject current_$14 = haystack.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$14, haystack, $list26 );
      haystack_rules = current_$14.first();
      current_$14 = current_$14.rest();
      if( NIL == current_$14 )
      {
        final SubLObject haystack_mt = el_utilities.designated_mt( haystack_ist_sentence );
        final SubLObject haystack_implication = el_utilities.designated_sentence( haystack_ist_sentence );
        final SubLObject haystack_consequent = cycl_utilities.formula_arg2( haystack_implication, UNPROVIDED );
        final SubLObject haystack_antecedent = cycl_utilities.formula_arg1( haystack_implication, UNPROVIDED );
        final SubLObject haystack_conjuncts = cycl_utilities.formula_args( haystack_antecedent, UNPROVIDED );
        final SubLObject new_asent = el_utilities.designated_sentence( new_needle );
        final SubLObject reduced_conjuncts = Sequences.remove( new_asent, haystack_conjuncts, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && haystack_conjuncts.equal( reduced_conjuncts ) )
        {
          Errors.error( $str27$Failed_to_remove_conjunct );
        }
        final SubLObject expanded_conjuncts = ConsesLow.append( reduced_conjuncts, new_conjuncts );
        final SubLObject expanded_implication = el_utilities.make_implication( simplifier.conjoin( expanded_conjuncts, UNPROVIDED ), haystack_consequent );
        return ConsesLow.list( el_utilities.make_ist_sentence( haystack_mt, expanded_implication ), ConsesLow.append( haystack_rules, new_rules ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( haystack, $list26 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( new_straw, $list25 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 14803L)
  public static SubLObject verify_haystack(final SubLObject haystack, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = NIL;
    }
    inference_strategic_heuristics.disable_strategic_heuristic_rule_historical_utility();
    if( NIL == haystack )
    {
      return NIL;
    }
    if( NIL != n && NIL == list_utilities.lengthE( haystack_rules( haystack ), n, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject verifiedP = NIL;
    SubLObject ist_sentence = NIL;
    SubLObject rules = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( haystack, haystack, $list28 );
    ist_sentence = haystack.first();
    SubLObject current = haystack.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, haystack, $list28 );
    rules = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject n_$15 = Sequences.length( rules );
      verifiedP = makeBoolean( NIL == inference_kernel.new_cyc_query( ist_sentence, NIL, ConsesLow.list( $kw29$CONDITIONAL_SENTENCE_, T, $kw30$MAX_TRANSFORMATION_DEPTH, number_utilities.f_1_( n_$15 ),
          $kw31$ALLOWED_RULES, rules ) ) && NIL == inference_kernel.new_cyc_query( ist_sentence, NIL, ConsesLow.list( $kw29$CONDITIONAL_SENTENCE_, T, $kw30$MAX_TRANSFORMATION_DEPTH, number_utilities.f_1_( n_$15 ) ) )
          && NIL != look_for_needle_in_haystack( haystack, T ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( haystack, $list28 );
    }
    return verifiedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 15520L)
  public static SubLObject look_for_needle_in_haystack(final SubLObject haystack, SubLObject cheatP)
  {
    if( cheatP == UNPROVIDED )
    {
      cheatP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    inference_strategic_heuristics.disable_strategic_heuristic_rule_historical_utility();
    SubLObject ist_sentence = NIL;
    SubLObject rules = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( haystack, haystack, $list28 );
    ist_sentence = haystack.first();
    SubLObject current = haystack.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, haystack, $list28 );
    rules = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject n = Sequences.length( rules );
      SubLObject query_properties = ConsesLow.list( $kw29$CONDITIONAL_SENTENCE_, T, $kw30$MAX_TRANSFORMATION_DEPTH, n, $kw32$PROBABLY_APPROXIMATELY_DONE, $float33$0_95, $kw34$RETURN, $kw35$BINDINGS_AND_SUPPORTS );
      SubLObject time = NIL;
      SubLObject result = NIL;
      SubLObject halt_reason = NIL;
      if( NIL != cheatP )
      {
        query_properties = conses_high.putf( query_properties, $kw31$ALLOWED_RULES, rules );
      }
      final SubLObject time_var = Time.get_internal_real_time();
      thread.resetMultipleValues();
      final SubLObject result_$16 = inference_kernel.new_cyc_query( ist_sentence, NIL, query_properties );
      final SubLObject halt_reason_$17 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$16;
      halt_reason = halt_reason_$17;
      time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
      return Values.values( ( NIL != result ) ? time : NIL, halt_reason );
    }
    cdestructuring_bind.cdestructuring_bind_error( haystack, $list28 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16223L)
  public static SubLObject nonstandard_transformation_asent_p(final SubLObject asent)
  {
    return makeBoolean( NIL == standard_transformation_asent_p( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16373L)
  public static SubLObject standard_transformation_asent_p(final SubLObject asent)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    return makeBoolean( NIL != forts.fort_p( pred ) && NIL != hl_supports.non_hl_predicate_p( pred ) && NIL == kb_accessors.backchain_forbiddenP( pred, $const36$UniversalVocabularyMt ) && NIL == relation_evaluation
        .evaluatable_predicateP( pred, $const36$UniversalVocabularyMt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16706L)
  public static SubLObject make_isa_x_thing_asent(final SubLObject x)
  {
    return ConsesLow.listS( $const37$isa, x, $list38 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16779L)
  public static SubLObject inference_answer_justification_uses_at_least_one_ruleP(final SubLObject justification)
  {
    return list_utilities.sublisp_boolean( Sequences.find_if( $sym8$RULE_ASSERTION_, inference_datastructures_inference.inference_answer_justification_supports( justification ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16969L)
  public static SubLObject clear_abduced_term_to_random_variable()
  {
    final SubLObject cs = $abduced_term_to_random_variable_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16969L)
  public static SubLObject remove_abduced_term_to_random_variable(final SubLObject abduced_term)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $abduced_term_to_random_variable_caching_state$.getGlobalValue(), ConsesLow.list( abduced_term ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16969L)
  public static SubLObject abduced_term_to_random_variable_internal(final SubLObject abduced_term)
  {
    return cycl_variables.make_el_var( Sequences.cconcatenate( $str39$_VAR, string_utilities.str( random.random( Numbers.$most_positive_fixnum$.getGlobalValue() ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 16969L)
  public static SubLObject abduced_term_to_random_variable(final SubLObject abduced_term)
  {
    SubLObject caching_state = $abduced_term_to_random_variable_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE, $sym40$_ABDUCED_TERM_TO_RANDOM_VARIABLE_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, abduced_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( abduced_term_to_random_variable_internal( abduced_term ) ) );
      memoization_state.caching_state_put( caching_state, abduced_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 17161L)
  public static SubLObject find_good_instantiated_haystack(final SubLObject haystacks)
  {
    SubLObject instantiated_haystack;
    SubLObject haystack;
    for( instantiated_haystack = NIL; NIL == instantiated_haystack; instantiated_haystack = instantiate_haystack_if_good( haystack ) )
    {
      haystack = list_utilities.random_element( haystacks );
    }
    return instantiated_haystack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 17616L)
  public static SubLObject instantiate_haystack_if_good(final SubLObject haystack)
  {
    final SubLObject instantiated_haystack = instantiate_haystack( haystack );
    if( NIL != look_for_needle_in_haystack( instantiated_haystack, T ) && NIL == look_for_needle_in_haystack( instantiated_haystack, NIL ) )
    {
      return instantiated_haystack;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 17913L)
  public static SubLObject instantiate_haystack(SubLObject haystack)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ist_query = haystack_query( haystack );
    final SubLObject mt = el_utilities.designated_mt( ist_query );
    final SubLObject implication = el_utilities.designated_sentence( ist_query );
    final SubLObject antecedent = cycl_utilities.sentence_arg1( implication, UNPROVIDED );
    final SubLObject isa_lits = list_utilities.remove_if_not( $sym41$ISA_VAR_FORT_LIT_, cycl_utilities.formula_args( antecedent, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject isa_dict = dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject cdolist_list_var = isa_lits;
    SubLObject isa_lit = NIL;
    isa_lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = cycl_utilities.formula_arg1( isa_lit, UNPROVIDED );
      final SubLObject col = cycl_utilities.formula_arg2( isa_lit, UNPROVIDED );
      dictionary_utilities.dictionary_push( isa_dict, var, col );
      cdolist_list_var = cdolist_list_var.rest();
      isa_lit = cdolist_list_var.first();
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( isa_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject cols = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject v_term = instantiate_haystack_var( cols, mt );
      if( NIL != v_term )
      {
        haystack = cycl_utilities.expression_subst( v_term, var2, haystack, UNPROVIDED, UNPROVIDED );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return haystack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 18779L)
  public static SubLObject instantiate_haystack_var(final SubLObject cols, final SubLObject mt)
  {
    return list_utilities.random_element( isa.union_all_instances( cols, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 18954L)
  public static SubLObject cripple_haystack(final SubLObject haystack)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject crippled_haystack = NIL;
    while ( NIL == crippled_haystack)
    {
      final SubLObject potentially_crippled_haystack = potentially_cripple_haystack( haystack );
      if( NIL != potentially_crippled_haystack && NIL == look_for_needle_in_haystack( potentially_crippled_haystack, T ) )
      {
        thread.resetMultipleValues();
        final SubLObject time = look_for_needle_in_haystack( potentially_crippled_haystack, NIL );
        final SubLObject halt_reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != time || $kw32$PROBABLY_APPROXIMATELY_DONE != halt_reason )
        {
          continue;
        }
        crippled_haystack = potentially_crippled_haystack;
      }
    }
    return crippled_haystack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/deep-inference-generator.lisp", position = 19791L)
  public static SubLObject potentially_cripple_haystack(final SubLObject haystack)
  {
    final SubLObject ist_query = haystack_query( haystack );
    final SubLObject rules = haystack_rules( haystack );
    final SubLObject mt = el_utilities.designated_mt( ist_query );
    final SubLObject implication = el_utilities.designated_sentence( ist_query );
    final SubLObject antecedent = cycl_utilities.sentence_arg1( implication, UNPROVIDED );
    final SubLObject consequent = cycl_utilities.sentence_arg2( implication, UNPROVIDED );
    final SubLObject conjuncts = cycl_utilities.formula_args( antecedent, UNPROVIDED );
    if( NIL == list_utilities.singletonP( conjuncts ) )
    {
      final SubLObject crippled_conjuncts = Sequences.remove( list_utilities.random_element( conjuncts ), conjuncts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject crippled_antecedent = simplifier.conjoin( crippled_conjuncts, UNPROVIDED );
      final SubLObject crippled_implication = el_utilities.make_implication( crippled_antecedent, consequent );
      final SubLObject crippled_ist_query = el_utilities.make_ist_sentence( mt, crippled_implication );
      return ConsesLow.list( crippled_ist_query, rules );
    }
    return NIL;
  }

  public static SubLObject declare_deep_inference_generator_file()
  {
    SubLFiles.declareFunction( me, "generate_deep_inference", "GENERATE-DEEP-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_deep_inference_gaf_table", "INITIALIZE-DEEP-INFERENCE-GAF-TABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "assertion_provability_depth", "ASSERTION-PROVABILITY-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "backward_rule_required_for_assertionP", "BACKWARD-RULE-REQUIRED-FOR-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "backward_rule_deductionP", "BACKWARD-RULE-DEDUCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "haystack_p", "HAYSTACK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "interesting_haystack_p", "INTERESTING-HAYSTACK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "haystack_query", "HAYSTACK-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "haystack_rules", "HAYSTACK-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "haystack_size", "HAYSTACK-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "straw_p", "STRAW-P", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_haystack", "GENERATE-HAYSTACK", 1, 0, false );
    SubLFiles.declareFunction( me, "collapse_haystack", "COLLAPSE-HAYSTACK", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_haystack_variables", "FIX-HAYSTACK-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_haystack_int", "GENERATE-HAYSTACK-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "abort_haystackP", "ABORT-HAYSTACK?", 2, 0, false );
    SubLFiles.declareFunction( me, "grow_haystack", "GROW-HAYSTACK", 2, 0, false );
    SubLFiles.declareFunction( me, "choose_random_needle", "CHOOSE-RANDOM-NEEDLE", 0, 0, false );
    SubLFiles.declareFunction( me, "choose_next_needle", "CHOOSE-NEXT-NEEDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_straw_from_needle", "GENERATE-STRAW-FROM-NEEDLE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_straw_to_haystack", "ADD-STRAW-TO-HAYSTACK", 3, 0, false );
    SubLFiles.declareFunction( me, "verify_haystack", "VERIFY-HAYSTACK", 1, 1, false );
    SubLFiles.declareFunction( me, "look_for_needle_in_haystack", "LOOK-FOR-NEEDLE-IN-HAYSTACK", 1, 1, false );
    SubLFiles.declareFunction( me, "nonstandard_transformation_asent_p", "NONSTANDARD-TRANSFORMATION-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "standard_transformation_asent_p", "STANDARD-TRANSFORMATION-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "make_isa_x_thing_asent", "MAKE-ISA-X-THING-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_uses_at_least_one_ruleP", "INFERENCE-ANSWER-JUSTIFICATION-USES-AT-LEAST-ONE-RULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_abduced_term_to_random_variable", "CLEAR-ABDUCED-TERM-TO-RANDOM-VARIABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_abduced_term_to_random_variable", "REMOVE-ABDUCED-TERM-TO-RANDOM-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "abduced_term_to_random_variable_internal", "ABDUCED-TERM-TO-RANDOM-VARIABLE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "abduced_term_to_random_variable", "ABDUCED-TERM-TO-RANDOM-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_good_instantiated_haystack", "FIND-GOOD-INSTANTIATED-HAYSTACK", 1, 0, false );
    SubLFiles.declareFunction( me, "instantiate_haystack_if_good", "INSTANTIATE-HAYSTACK-IF-GOOD", 1, 0, false );
    SubLFiles.declareFunction( me, "instantiate_haystack", "INSTANTIATE-HAYSTACK", 1, 0, false );
    SubLFiles.declareFunction( me, "instantiate_haystack_var", "INSTANTIATE-HAYSTACK-VAR", 2, 0, false );
    SubLFiles.declareFunction( me, "cripple_haystack", "CRIPPLE-HAYSTACK", 1, 0, false );
    SubLFiles.declareFunction( me, "potentially_cripple_haystack", "POTENTIALLY-CRIPPLE-HAYSTACK", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_deep_inference_generator_file()
  {
    $deep_inference_gaf_table$ = SubLFiles.deflexical( "*DEEP-INFERENCE-GAF-TABLE*", maybeDefault( $sym0$_DEEP_INFERENCE_GAF_TABLE_, $deep_inference_gaf_table$, () -> ( Hashtables.make_hash_table( $int1$212, UNPROVIDED,
        UNPROVIDED ) ) ) );
    $deep_inference_recursion_stack$ = SubLFiles.defparameter( "*DEEP-INFERENCE-RECURSION-STACK*", $kw2$UNINITIALIZED );
    $totally_uninteresting_haystack_mts$ = SubLFiles.deflexical( "*TOTALLY-UNINTERESTING-HAYSTACK-MTS*", $list6 );
    $somewhat_uninteresting_haystack_mts$ = SubLFiles.deflexical( "*SOMEWHAT-UNINTERESTING-HAYSTACK-MTS*", $list7 );
    $straw_seeking_query_properties$ = SubLFiles.deflexical( "*STRAW-SEEKING-QUERY-PROPERTIES*", $list20 );
    $abduced_term_to_random_variable_caching_state$ = SubLFiles.deflexical( "*ABDUCED-TERM-TO-RANDOM-VARIABLE-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_deep_inference_generator_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_DEEP_INFERENCE_GAF_TABLE_ );
    memoization_state.note_globally_cached_function( $sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_deep_inference_generator_file();
  }

  @Override
  public void initializeVariables()
  {
    init_deep_inference_generator_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_deep_inference_generator_file();
  }
  static
  {
    me = new deep_inference_generator();
    $deep_inference_gaf_table$ = null;
    $deep_inference_recursion_stack$ = null;
    $totally_uninteresting_haystack_mts$ = null;
    $somewhat_uninteresting_haystack_mts$ = null;
    $straw_seeking_query_properties$ = null;
    $abduced_term_to_random_variable_caching_state$ = null;
    $sym0$_DEEP_INFERENCE_GAF_TABLE_ = makeSymbol( "*DEEP-INFERENCE-GAF-TABLE*" );
    $int1$212 = makeInteger( 212 );
    $kw2$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str3$Looking_for_deeply_deduced_gafs = makeString( "Looking for deeply deduced gafs" );
    $sym4$STRINGP = makeSymbol( "STRINGP" );
    $kw5$SKIP = makeKeyword( "SKIP" );
    $list6 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "KleinTest2Mt" ) ), constant_handles.reader_make_constant_shell( makeString( "TMSLoopMt" ) ), constant_handles
        .reader_make_constant_shell( makeString( "EasyTMSLoopMt" ) ) );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DeonticReasoning-LogicMt" ) ), constant_handles.reader_make_constant_shell( makeString( "ReasoningWithTense-LogicMt" ) ),
        constant_handles.reader_make_constant_shell( makeString( "ReasoningWithTense-LogicMt-LinearTime" ) ), constant_handles.reader_make_constant_shell( makeString( "NecessityMt" ) ), constant_handles
            .reader_make_constant_shell( makeString( "ReasoningWithMultiFuture-LogicMt" ) ) );
    $sym8$RULE_ASSERTION_ = makeSymbol( "RULE-ASSERTION?" );
    $sym9$ASSERTION_MT = makeSymbol( "ASSERTION-MT" );
    $sym10$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $const11$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw12$IGNORE = makeKeyword( "IGNORE" );
    $list13 = ConsesLow.cons( makeSymbol( "RULE-HL-VAR" ), makeSymbol( "HAYSTACK-VAR" ) );
    $sym14$NONSTANDARD_TRANSFORMATION_ASENT_P = makeSymbol( "NONSTANDARD-TRANSFORMATION-ASENT-P" );
    $list15 = ConsesLow.list( makeSymbol( "HYPOTHETICAL-BINDINGS" ), makeSymbol( "ABDUCED-SUPPORTS" ), makeSymbol( "RULES" ) );
    $sym16$STANDARD_TRANSFORMATION_ASENT_P = makeSymbol( "STANDARD-TRANSFORMATION-ASENT-P" );
    $sym17$HL_SUPPORT_SENTENCE = makeSymbol( "HL-SUPPORT-SENTENCE" );
    $sym18$ABDUCED_TERM_P = makeSymbol( "ABDUCED-TERM-P" );
    $sym19$ABDUCED_TERM_TO_RANDOM_VARIABLE = makeSymbol( "ABDUCED-TERM-TO-RANDOM-VARIABLE" );
    $list20 = ConsesLow.list( new SubLObject[] { makeKeyword( "ABDUCTION-ALLOWED?" ), T, makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER, makeKeyword( "MAX-TIME" ), makeInteger( 30 ), makeKeyword( "BROWSABLE?" ),
      T, makeKeyword( "CONDITIONAL-SENTENCE?" ), T, makeKeyword( "RESULT-UNIQUENESS" ), makeKeyword( "PROOF" ), makeKeyword( "RETURN" ), makeKeyword( "BINDINGS-AND-HYPOTHETICAL-BINDINGS" )
    } );
    $sym21$MAKE_ISA_X_THING_ASENT = makeSymbol( "MAKE-ISA-X-THING-ASENT" );
    $list22 = ConsesLow.list( makeSymbol( "RESULT" ), makeSymbol( "HYPOTHETICAL-BINDINGS" ) );
    $sym23$INFERENCE_ANSWER_JUSTIFICATION_USES_AT_LEAST_ONE_RULE_ = makeSymbol( "INFERENCE-ANSWER-JUSTIFICATION-USES-AT-LEAST-ONE-RULE?" );
    $sym24$ABDUCTION_SUPPORT_P = makeSymbol( "ABDUCTION-SUPPORT-P" );
    $list25 = ConsesLow.list( makeSymbol( "HYPOTHETICAL-BINDINGS" ), makeSymbol( "ABDUCED-SUPPORTS" ), makeSymbol( "NEW-RULES" ) );
    $list26 = ConsesLow.list( makeSymbol( "HAYSTACK-IST-SENTENCE" ), makeSymbol( "HAYSTACK-RULES" ) );
    $str27$Failed_to_remove_conjunct = makeString( "Failed to remove conjunct" );
    $list28 = ConsesLow.list( makeSymbol( "IST-SENTENCE" ), makeSymbol( "RULES" ) );
    $kw29$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $kw30$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw31$ALLOWED_RULES = makeKeyword( "ALLOWED-RULES" );
    $kw32$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $float33$0_95 = makeDouble( 0.95 );
    $kw34$RETURN = makeKeyword( "RETURN" );
    $kw35$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $const36$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const37$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list38 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) );
    $str39$_VAR = makeString( "?VAR" );
    $sym40$_ABDUCED_TERM_TO_RANDOM_VARIABLE_CACHING_STATE_ = makeSymbol( "*ABDUCED-TERM-TO-RANDOM-VARIABLE-CACHING-STATE*" );
    $sym41$ISA_VAR_FORT_LIT_ = makeSymbol( "ISA-VAR-FORT-LIT?" );
  }
}
/*
 *
 * Total time: 235 ms
 *
 */