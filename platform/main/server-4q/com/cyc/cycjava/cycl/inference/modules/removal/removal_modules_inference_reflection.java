package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_inference_reflection
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_inference_reflection";
  public static final String myFingerPrint = "d154c0ad6f108aa50c5b5a4a335dad5411c58557a9eb70841d2bf5b8f79263fa";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 1608L)
  private static SubLSymbol $problem_count_for_term_divisor$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 2480L)
  private static SubLSymbol $problem_store_term_to_problem_ratio$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 23992L)
  private static SubLSymbol $average_problem_query_term_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 28168L)
  private static SubLSymbol $default_transformation_proof_rule_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 29296L)
  private static SubLSymbol $default_transformation_proof_rule_lookup_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 30735L)
  private static SubLSymbol $default_transformation_proof_bindings_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 31975L)
  private static SubLSymbol $default_transformation_proof_bindings_lookup_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 33464L)
  private static SubLSymbol $default_inference_answer_bindings_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 34676L)
  private static SubLSymbol $default_inference_answer_bindings_lookup_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 35964L)
  private static SubLSymbol $default_inference_binding_var_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 37046L)
  private static SubLSymbol $default_inference_binding_var_lookup_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 38350L)
  private static SubLSymbol $default_inference_binding_value_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 39460L)
  private static SubLSymbol $default_inference_binding_value_lookup_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 40403L)
  private static SubLSymbol $supported_inference_reflection_predicates$;
  private static final SubLSymbol $sym0$PROBLEM_P;
  private static final SubLSymbol $sym1$PROBLEM_STORE_P;
  private static final SubLSymbol $kw2$SKIP;
  private static final SubLSymbol $sym3$_;
  private static final SubLSymbol $sym4$PROBLEM_SUID;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$STORE_ID;
  private static final SubLObject $const7$CycProblemStoreFn;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$PROBLEM_ID;
  private static final SubLObject $const10$CycProblemFn;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$LINK_ID;
  private static final SubLObject $const13$CycProblemLinkFn;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$PROOF_ID;
  private static final SubLObject $const16$CycProofFn;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$INFERENCE_ID;
  private static final SubLObject $const19$CycInferenceFn;
  private static final SubLObject $const20$Good_ProblemProvabilityStatus;
  private static final SubLSymbol $kw21$GOOD;
  private static final SubLObject $const22$Neutral_ProblemProvabilityStatus;
  private static final SubLSymbol $kw23$NEUTRAL;
  private static final SubLObject $const24$NoGood_ProblemProvabilityStatus;
  private static final SubLSymbol $kw25$NO_GOOD;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$VALUE;
  private static final SubLSymbol $sym28$EL_VAR;
  private static final SubLList $list29;
  private static final SubLObject $const30$ELInferenceBindingFn;
  private static final SubLObject $const31$cycProblemStoreProblemCount;
  private static final SubLSymbol $kw32$POS;
  private static final SubLSymbol $kw33$REMOVAL_PROBLEM_STORE_PROBLEM_COUNT_LOOKUP;
  private static final SubLList $list34;
  private static final SubLObject $const35$cycProblemStoreLinkCount;
  private static final SubLSymbol $kw36$REMOVAL_PROBLEM_STORE_LINK_COUNT_LOOKUP;
  private static final SubLList $list37;
  private static final SubLObject $const38$cycProblemStoreProofCount;
  private static final SubLSymbol $kw39$REMOVAL_PROBLEM_STORE_PROOF_COUNT_LOOKUP;
  private static final SubLList $list40;
  private static final SubLObject $const41$cycProblemStoreInferenceCount;
  private static final SubLSymbol $kw42$REMOVAL_PROBLEM_STORE_INFERENCE_COUNT_LOOKUP;
  private static final SubLList $list43;
  private static final SubLObject $const44$cycProblemStoreTerms;
  private static final SubLSymbol $kw45$NEG;
  private static final SubLSymbol $kw46$REMOVAL_PROBLEM_STORE_TERMS_CHECK_POS;
  private static final SubLList $list47;
  private static final SubLSymbol $kw48$REMOVAL_PROBLEM_STORE_TERMS_CHECK_NEG;
  private static final SubLList $list49;
  private static final SubLSymbol $kw50$REMOVAL_PROBLEM_STORE_TERMS_ARG2_UNIFY;
  private static final SubLList $list51;
  private static final SubLObject $const52$cycProblemStoreProblems;
  private static final SubLSymbol $kw53$REMOVAL_PROBLEM_STORE_PROBLEMS_ARG1_UNIFY;
  private static final SubLList $list54;
  private static final SubLSymbol $kw55$REMOVAL_PROBLEM_STORE_PROBLEMS_ARG2_UNIFY;
  private static final SubLList $list56;
  private static final SubLObject $const57$cycProblemQuerySentence;
  private static final SubLSymbol $kw58$REMOVAL_PROBLEM_QUERY_SENTENCE_ARG2_UNIFY;
  private static final SubLList $list59;
  private static final SubLObject $const60$cycProblemQueryTerms;
  private static final SubLSymbol $kw61$REMOVAL_PROBLEM_QUERY_TERMS_CHECK_POS;
  private static final SubLList $list62;
  private static final SubLSymbol $kw63$REMOVAL_PROBLEM_QUERY_TERMS_CHECK_NEG;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$TERM;
  private static final SubLSymbol $sym67$CYCL_STORE;
  private static final SubLSymbol $kw68$REMOVAL_PROBLEM_QUERY_TERMS_ARG1_UNIFY;
  private static final SubLList $list69;
  private static final SubLSymbol $kw70$REMOVAL_PROBLEM_QUERY_TERMS_ARG2_UNIFY;
  private static final SubLList $list71;
  private static final SubLObject $const72$cycProblemProvabilityStatus;
  private static final SubLSymbol $kw73$REMOVAL_PROBLEM_PROVABILITY_STATUS_CHECK_POS;
  private static final SubLList $list74;
  private static final SubLSymbol $kw75$REMOVAL_PROBLEM_PROVABILITY_STATUS_ARG2_UNIFY;
  private static final SubLList $list76;
  private static final SubLObject $const77$cycTransformationProofRule;
  private static final SubLSymbol $kw78$REMOVAL_TRANSFORMATION_PROOF_RULE_CHECK_POS;
  private static final SubLList $list79;
  private static final SubLSymbol $kw80$REMOVAL_TRANSFORMATION_PROOF_RULE_ARG2_UNIFY;
  private static final SubLList $list81;
  private static final SubLObject $const82$cycTransformationProofBindings;
  private static final SubLSymbol $kw83$REMOVAL_TRANSFORMATION_PROOF_BINDINGS_CHECK_POS;
  private static final SubLList $list84;
  private static final SubLSymbol $kw85$REMOVAL_TRANSFORMATION_PROOF_BINDINGS_ARG2_UNIFY;
  private static final SubLList $list86;
  private static final SubLObject $const87$inferenceAnswerBindings;
  private static final SubLObject $const88$CycInferenceAnswerFn;
  private static final SubLObject $const89$TheEmptySet;
  private static final SubLSymbol $kw90$REMOVAL_INFERENCE_ANSWER_BINDINGS_CHECK_POS;
  private static final SubLList $list91;
  private static final SubLSymbol $kw92$REMOVAL_INFERENCE_ANSWER_BINDINGS_ARG2_UNIFY;
  private static final SubLList $list93;
  private static final SubLObject $const94$inferenceBindingVar;
  private static final SubLSymbol $kw95$REMOVAL_INFERENCE_BINDING_VAR_CHECK_POS;
  private static final SubLList $list96;
  private static final SubLSymbol $kw97$REMOVAL_INFERENCE_BINDING_VAR_ARG2_UNIFY;
  private static final SubLList $list98;
  private static final SubLObject $const99$inferenceBindingValue;
  private static final SubLSymbol $kw100$REMOVAL_INFERENCE_BINDING_VALUE_CHECK_POS;
  private static final SubLList $list101;
  private static final SubLSymbol $kw102$REMOVAL_INFERENCE_BINDING_VALUE_ARG2_UNIFY;
  private static final SubLList $list103;
  private static final SubLList $list104;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 897L)
  public static SubLObject problem_query_mentions_termP(final SubLObject problem, final SubLObject v_term)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    final SubLObject formula = inference_datastructures_problem.problem_formula( problem );
    return removal_modules_asserted_formula.inference_term_formulas_find( v_term, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 1344L)
  public static SubLObject problem_query_terms(final SubLObject problem)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    final SubLObject formula = inference_datastructures_problem.problem_formula( problem );
    return removal_modules_asserted_formula.inference_term_formulas_gather( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 1828L)
  public static SubLObject problem_store_problems_mentioning_term_expected_count(final SubLObject store, final SubLObject v_term)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    return Numbers.max( ONE_INTEGER, Numbers.truncate( inference_datastructures_problem_store.problem_store_problem_count( store ), $problem_count_for_term_divisor$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 2065L)
  public static SubLObject problem_store_problems_mentioning_term_set(final SubLObject store, final SubLObject v_term)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    final SubLObject expected_count = problem_store_problems_mentioning_term_expected_count( store, v_term );
    final SubLObject problem_set = set.new_set( Symbols.symbol_function( EQL ), expected_count );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw2$SKIP ) )
    {
      final SubLObject idx_$1 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$1, $kw2$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$1 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw2$SKIP;
            }
            if( NIL != problem_query_mentions_termP( problem, v_term ) )
            {
              set.set_add( problem, problem_set );
            }
          }
        }
      }
      final SubLObject idx_$2 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$2 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$2 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != problem_query_mentions_termP( problem2, v_term ) )
            {
              set.set_add( problem2, problem_set );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return problem_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 2715L)
  public static SubLObject problem_store_term_expected_count(final SubLObject store)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    return Numbers.truncate( Numbers.multiply( $problem_store_term_to_problem_ratio$.getGlobalValue(), inference_datastructures_problem_store.problem_store_problem_count( store ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 2915L)
  public static SubLObject problem_store_term_set(final SubLObject store)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    final SubLObject expected_count = problem_store_term_expected_count( store );
    final SubLObject term_set = set.new_set( Symbols.symbol_function( EQUAL ), expected_count );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw2$SKIP ) )
    {
      final SubLObject idx_$3 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$3, $kw2$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$3 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        SubLObject cdolist_list_var;
        SubLObject terms;
        SubLObject v_term;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw2$SKIP;
            }
            terms = ( cdolist_list_var = problem_query_terms( problem ) );
            v_term = NIL;
            v_term = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              set.set_add( v_term, term_set );
              cdolist_list_var = cdolist_list_var.rest();
              v_term = cdolist_list_var.first();
            }
          }
        }
      }
      final SubLObject idx_$4 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$4 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$4 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            SubLObject cdolist_list_var2;
            final SubLObject terms2 = cdolist_list_var2 = problem_query_terms( problem2 );
            SubLObject v_term2 = NIL;
            v_term2 = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              set.set_add( v_term2, term_set );
              cdolist_list_var2 = cdolist_list_var2.rest();
              v_term2 = cdolist_list_var2.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return term_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 3294L)
  public static SubLObject new_problem_store_problem_iterator(final SubLObject store)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    SubLObject problems = NIL;
    final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw2$SKIP ) )
    {
      final SubLObject idx_$5 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$5, $kw2$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$5 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject problem;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          problem = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( problem ) )
            {
              problem = $kw2$SKIP;
            }
            problems = ConsesLow.cons( problem, problems );
          }
        }
      }
      final SubLObject idx_$6 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$6 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$6 );
        SubLObject id2 = NIL;
        SubLObject problem2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            problem2 = Hashtables.getEntryValue( cdohash_entry );
            problems = ConsesLow.cons( problem2, problems );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    problems = Sort.sort( problems, Symbols.symbol_function( $sym3$_ ), $sym4$PROBLEM_SUID );
    return iteration.new_list_iterator( problems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 3745L)
  public static SubLObject cycl_problem_store_encode(final SubLObject cycl_store)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list5;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( cycl_store, pattern );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject store_id = list_utilities.alist_lookup_without_values( v_bindings, $sym6$STORE_ID, UNPROVIDED, UNPROVIDED );
      return inference_datastructures_problem_store.find_problem_store_by_id( store_id );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 4226L)
  public static SubLObject cycl_problem_store_decode(final SubLObject store)
  {
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
    {
      final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
      return el_utilities.list_to_elf( ConsesLow.list( $const7$CycProblemStoreFn, store_id ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 4485L)
  public static SubLObject cycl_problem_encode(final SubLObject cycl_problem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list8;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( cycl_problem, pattern );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject problem_id = list_utilities.alist_lookup_without_values( v_bindings, $sym9$PROBLEM_ID, UNPROVIDED, UNPROVIDED );
      final SubLObject store_id = list_utilities.alist_lookup_without_values( v_bindings, $sym6$STORE_ID, UNPROVIDED, UNPROVIDED );
      return inference_datastructures_problem_store.find_problem_by_ids( store_id, problem_id );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 4843L)
  public static SubLObject cycl_problem_decode(final SubLObject problem)
  {
    if( NIL != inference_datastructures_problem.valid_problem_p( problem ) )
    {
      final SubLObject store = inference_datastructures_problem.problem_store( problem );
      if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
      {
        final SubLObject problem_id = inference_datastructures_problem.problem_suid( problem );
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
        return el_utilities.list_to_elf( ConsesLow.list( $const10$CycProblemFn, problem_id, ConsesLow.list( $const7$CycProblemStoreFn, store_id ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 5256L)
  public static SubLObject cycl_problem_link_encode(final SubLObject cycl_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list11;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( cycl_link, pattern );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject link_id = list_utilities.alist_lookup_without_values( v_bindings, $sym12$LINK_ID, UNPROVIDED, UNPROVIDED );
      final SubLObject store_id = list_utilities.alist_lookup_without_values( v_bindings, $sym6$STORE_ID, UNPROVIDED, UNPROVIDED );
      return inference_datastructures_problem_store.find_problem_link_by_ids( store_id, link_id );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 5623L)
  public static SubLObject cycl_problem_link_decode(final SubLObject link)
  {
    if( NIL != inference_datastructures_problem_link.valid_problem_link_p( link ) )
    {
      final SubLObject store = inference_datastructures_problem_link.problem_link_store( link );
      if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
      {
        final SubLObject link_id = inference_datastructures_problem_link.problem_link_suid( link );
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
        return el_utilities.list_to_elf( ConsesLow.list( $const13$CycProblemLinkFn, link_id, ConsesLow.list( $const7$CycProblemStoreFn, store_id ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 6046L)
  public static SubLObject cycl_proof_encode(final SubLObject cycl_proof)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list14;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( cycl_proof, pattern );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject proof_id = list_utilities.alist_lookup_without_values( v_bindings, $sym15$PROOF_ID, UNPROVIDED, UNPROVIDED );
      final SubLObject store_id = list_utilities.alist_lookup_without_values( v_bindings, $sym6$STORE_ID, UNPROVIDED, UNPROVIDED );
      return inference_datastructures_problem_store.find_proof_by_ids( store_id, proof_id );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 6384L)
  public static SubLObject cycl_proof_decode(final SubLObject proof)
  {
    if( NIL != inference_datastructures_proof.valid_proof_p( proof ) )
    {
      final SubLObject store = inference_datastructures_proof.proof_store( proof );
      if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
      {
        final SubLObject proof_id = inference_datastructures_proof.proof_suid( proof );
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
        return el_utilities.list_to_elf( ConsesLow.list( $const16$CycProofFn, proof_id, ConsesLow.list( $const7$CycProblemStoreFn, store_id ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 6771L)
  public static SubLObject cycl_inference_encode(final SubLObject cycl_inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list17;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( cycl_inference, pattern );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject inference_id = list_utilities.alist_lookup_without_values( v_bindings, $sym18$INFERENCE_ID, UNPROVIDED, UNPROVIDED );
      final SubLObject store_id = list_utilities.alist_lookup_without_values( v_bindings, $sym6$STORE_ID, UNPROVIDED, UNPROVIDED );
      return inference_datastructures_problem_store.find_inference_by_ids( store_id, inference_id );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 7149L)
  public static SubLObject cycl_inference_decode(final SubLObject inference)
  {
    if( NIL != inference_datastructures_inference.valid_inference_p( inference ) )
    {
      final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
      if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
      {
        final SubLObject inference_id = inference_datastructures_inference.inference_suid( inference );
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
        return el_utilities.list_to_elf( ConsesLow.list( $const19$CycInferenceFn, inference_id, ConsesLow.list( $const7$CycProblemStoreFn, store_id ) ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 7592L)
  public static SubLObject cycl_provability_status_encode(final SubLObject cycl_status)
  {
    if( cycl_status.eql( $const20$Good_ProblemProvabilityStatus ) )
    {
      return $kw21$GOOD;
    }
    if( cycl_status.eql( $const22$Neutral_ProblemProvabilityStatus ) )
    {
      return $kw23$NEUTRAL;
    }
    if( cycl_status.eql( $const24$NoGood_ProblemProvabilityStatus ) )
    {
      return $kw25$NO_GOOD;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 7977L)
  public static SubLObject cycl_provability_status_decode(final SubLObject status)
  {
    if( status.eql( $kw21$GOOD ) )
    {
      return $const20$Good_ProblemProvabilityStatus;
    }
    if( status.eql( $kw23$NEUTRAL ) )
    {
      return $const22$Neutral_ProblemProvabilityStatus;
    }
    if( status.eql( $kw25$NO_GOOD ) )
    {
      return $const24$NoGood_ProblemProvabilityStatus;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 8307L)
  public static SubLObject cycl_binding_encode(final SubLObject cycl_binding)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list26;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( cycl_binding, pattern );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject value = list_utilities.alist_lookup_without_values( v_bindings, $sym27$VALUE, UNPROVIDED, UNPROVIDED );
      final SubLObject el_var = list_utilities.alist_lookup_without_values( v_bindings, $sym28$EL_VAR, UNPROVIDED, UNPROVIDED );
      return bindings.make_variable_binding( el_var, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 8631L)
  public static SubLObject cycl_binding_decode(final SubLObject binding)
  {
    SubLObject el_var = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( binding, binding, $list29 );
    el_var = binding.first();
    final SubLObject current = value = binding.rest();
    return el_utilities.make_binary_formula( $const30$ELInferenceBindingFn, el_var, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 9282L)
  public static SubLObject removal_problem_store_problem_count(final SubLObject store)
  {
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
    {
      return inference_datastructures_problem_store.problem_store_problem_count( store );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 10399L)
  public static SubLObject removal_problem_store_link_count(final SubLObject store)
  {
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
    {
      return inference_datastructures_problem_store.problem_store_link_count( store );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 11494L)
  public static SubLObject removal_problem_store_proof_count(final SubLObject store)
  {
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
    {
      return inference_datastructures_problem_store.problem_store_proof_count( store );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 12618L)
  public static SubLObject removal_problem_store_inference_count(final SubLObject store)
  {
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
    {
      return inference_datastructures_problem_store.problem_store_inference_count( store );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 13795L)
  public static SubLObject removal_problem_store_terms_check(final SubLObject store, final SubLObject v_term)
  {
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
    {
      final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index( store );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw2$SKIP ) )
      {
        final SubLObject idx_$7 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$7, $kw2$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$7 );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject id;
          SubLObject problem;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            problem = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( problem ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( problem ) )
              {
                problem = $kw2$SKIP;
              }
              if( NIL != removal_problem_query_terms_check( problem, v_term ) )
              {
                return T;
              }
            }
          }
        }
        final SubLObject idx_$8 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$8 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$8 );
          SubLObject id2 = NIL;
          SubLObject problem2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              problem2 = Hashtables.getEntryValue( cdohash_entry );
              if( NIL != removal_problem_query_terms_check( problem2, v_term ) )
              {
                return T;
              }
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 15555L)
  public static SubLObject removal_problem_store_terms_arg2_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject store = cycl_problem_store_encode( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) );
    if( NIL != inference_datastructures_problem_store.problem_store_p( store ) )
    {
      return problem_store_term_expected_count( store );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 15872L)
  public static SubLObject removal_problem_store_terms(final SubLObject store)
  {
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
    {
      final SubLObject term_set = problem_store_term_set( store );
      return set.new_set_iterator( term_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 17094L)
  public static SubLObject removal_problem_store(final SubLObject problem)
  {
    if( NIL != inference_datastructures_problem.valid_problem_p( problem ) )
    {
      return inference_datastructures_problem.problem_store( problem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 17987L)
  public static SubLObject removal_problem_store_problems_arg2_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject store = cycl_problem_store_encode( cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED ) );
    if( NIL != inference_datastructures_problem_store.problem_store_p( store ) )
    {
      return inference_datastructures_problem_store.problem_store_problem_count( store );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 18304L)
  public static SubLObject removal_problem_store_problem_iterator(final SubLObject store)
  {
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
    {
      return new_problem_store_problem_iterator( store );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 19432L)
  public static SubLObject removal_problem_query(final SubLObject problem)
  {
    if( NIL != inference_datastructures_problem.valid_problem_p( problem ) )
    {
      return inference_datastructures_problem.problem_query( problem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 20605L)
  public static SubLObject removal_problem_query_terms_check(final SubLObject problem, final SubLObject v_term)
  {
    if( NIL != inference_datastructures_problem.valid_problem_p( problem ) )
    {
      return problem_query_mentions_termP( problem, v_term );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 22301L)
  public static SubLObject removal_problem_query_terms_arg1_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pattern = $list65;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( asent, pattern );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == success )
    {
      return NIL;
    }
    final SubLObject v_term = list_utilities.alist_lookup_without_values( v_bindings, $sym66$TERM, UNPROVIDED, UNPROVIDED );
    final SubLObject cycl_store = list_utilities.alist_lookup_without_values( v_bindings, $sym67$CYCL_STORE, UNPROVIDED, UNPROVIDED );
    final SubLObject store = cycl_problem_store_encode( cycl_store );
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
    {
      return problem_store_problems_mentioning_term_expected_count( store, v_term );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 22829L)
  public static SubLObject removal_problem_store_problems_mentioning_term(final SubLObject store, final SubLObject v_term)
  {
    if( NIL != inference_datastructures_problem_store.valid_problem_store_p( store ) )
    {
      final SubLObject problem_set = problem_store_problems_mentioning_term_set( store, v_term );
      return set.new_set_iterator( problem_set );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 24211L)
  public static SubLObject removal_problem_query_terms(final SubLObject problem)
  {
    if( NIL != inference_datastructures_problem.valid_problem_p( problem ) )
    {
      return problem_query_terms( problem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 25235L)
  public static SubLObject removal_problem_provability_status_check(final SubLObject problem, final SubLObject status)
  {
    if( NIL != inference_datastructures_problem.valid_problem_p( problem ) )
    {
      return Equality.eql( status, inference_datastructures_problem.problem_tactical_provability_status( problem ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 26265L)
  public static SubLObject removal_problem_provability_status(final SubLObject problem)
  {
    if( NIL != inference_datastructures_problem.valid_problem_p( problem ) )
    {
      return inference_datastructures_problem.problem_tactical_provability_status( problem );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 27975L)
  public static SubLObject removal_transformation_proof_rule(final SubLObject proof)
  {
    if( NIL != inference_datastructures_proof.valid_proof_p( proof ) && NIL != inference_worker_transformation.transformation_proof_p( proof ) )
    {
      return inference_worker_transformation.transformation_proof_rule_assertion( proof );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 28320L)
  public static SubLObject removal_transformation_proof_has_rule_p(final SubLObject proof, final SubLObject rule)
  {
    return Equality.eql( rule, removal_transformation_proof_rule( proof ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 30541L)
  public static SubLObject removal_transformation_proof_bindings(final SubLObject proof)
  {
    if( NIL != inference_datastructures_proof.valid_proof_p( proof ) && NIL != inference_worker_transformation.transformation_proof_p( proof ) )
    {
      return inference_worker_transformation.transformation_proof_el_bindings( proof );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 30895L)
  public static SubLObject removal_transformation_proof_has_binding_p(final SubLObject proof, final SubLObject binding)
  {
    return subl_promotions.memberP( binding, removal_transformation_proof_bindings( proof ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 33232L)
  public static SubLObject removal_inference_answer_bindings(final SubLObject cycl_inference_answer)
  {
    if( NIL != el_utilities.el_formula_with_operator_p( cycl_inference_answer, $const88$CycInferenceAnswerFn ) )
    {
      return cycl_utilities.nat_arg1( cycl_inference_answer, UNPROVIDED );
    }
    return $const89$TheEmptySet;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 33616L)
  public static SubLObject removal_inference_answer_has_binding_p(final SubLObject v_answer, final SubLObject binding)
  {
    return conses_high.member( binding, el_utilities.el_set_items( removal_inference_answer_bindings( v_answer ) ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 35829L)
  public static SubLObject removal_inference_binding_var(final SubLObject binding)
  {
    if( NIL != bindings.binding_p( binding ) )
    {
      return bindings.variable_binding_variable( binding );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 36108L)
  public static SubLObject removal_inference_binding_has_var_p(final SubLObject binding, final SubLObject var)
  {
    return Equality.eql( var, removal_inference_binding_var( binding ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 38216L)
  public static SubLObject removal_inference_binding_value(final SubLObject binding)
  {
    if( NIL != bindings.binding_p( binding ) )
    {
      return bindings.variable_binding_value( binding );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-inference-reflection.lisp", position = 38498L)
  public static SubLObject removal_inference_binding_has_value_p(final SubLObject binding, final SubLObject value)
  {
    return Equality.equal( value, removal_inference_binding_value( binding ) );
  }

  public static SubLObject declare_removal_modules_inference_reflection_file()
  {
    SubLFiles.declareFunction( me, "problem_query_mentions_termP", "PROBLEM-QUERY-MENTIONS-TERM?", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_query_terms", "PROBLEM-QUERY-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_problems_mentioning_term_expected_count", "PROBLEM-STORE-PROBLEMS-MENTIONING-TERM-EXPECTED-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_problems_mentioning_term_set", "PROBLEM-STORE-PROBLEMS-MENTIONING-TERM-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_store_term_expected_count", "PROBLEM-STORE-TERM-EXPECTED-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_term_set", "PROBLEM-STORE-TERM-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "new_problem_store_problem_iterator", "NEW-PROBLEM-STORE-PROBLEM-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_problem_store_encode", "CYCL-PROBLEM-STORE-ENCODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_problem_store_decode", "CYCL-PROBLEM-STORE-DECODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_problem_encode", "CYCL-PROBLEM-ENCODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_problem_decode", "CYCL-PROBLEM-DECODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_problem_link_encode", "CYCL-PROBLEM-LINK-ENCODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_problem_link_decode", "CYCL-PROBLEM-LINK-DECODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_proof_encode", "CYCL-PROOF-ENCODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_proof_decode", "CYCL-PROOF-DECODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_inference_encode", "CYCL-INFERENCE-ENCODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_inference_decode", "CYCL-INFERENCE-DECODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_provability_status_encode", "CYCL-PROVABILITY-STATUS-ENCODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_provability_status_decode", "CYCL-PROVABILITY-STATUS-DECODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_binding_encode", "CYCL-BINDING-ENCODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_binding_decode", "CYCL-BINDING-DECODE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_store_problem_count", "REMOVAL-PROBLEM-STORE-PROBLEM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_store_link_count", "REMOVAL-PROBLEM-STORE-LINK-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_store_proof_count", "REMOVAL-PROBLEM-STORE-PROOF-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_store_inference_count", "REMOVAL-PROBLEM-STORE-INFERENCE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_store_terms_check", "REMOVAL-PROBLEM-STORE-TERMS-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_store_terms_arg2_unify_cost", "REMOVAL-PROBLEM-STORE-TERMS-ARG2-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_problem_store_terms", "REMOVAL-PROBLEM-STORE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_store", "REMOVAL-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_store_problems_arg2_unify_cost", "REMOVAL-PROBLEM-STORE-PROBLEMS-ARG2-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_problem_store_problem_iterator", "REMOVAL-PROBLEM-STORE-PROBLEM-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_query", "REMOVAL-PROBLEM-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_query_terms_check", "REMOVAL-PROBLEM-QUERY-TERMS-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_query_terms_arg1_unify_cost", "REMOVAL-PROBLEM-QUERY-TERMS-ARG1-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_problem_store_problems_mentioning_term", "REMOVAL-PROBLEM-STORE-PROBLEMS-MENTIONING-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_query_terms", "REMOVAL-PROBLEM-QUERY-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_provability_status_check", "REMOVAL-PROBLEM-PROVABILITY-STATUS-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_problem_provability_status", "REMOVAL-PROBLEM-PROVABILITY-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_transformation_proof_rule", "REMOVAL-TRANSFORMATION-PROOF-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_transformation_proof_has_rule_p", "REMOVAL-TRANSFORMATION-PROOF-HAS-RULE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_transformation_proof_bindings", "REMOVAL-TRANSFORMATION-PROOF-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_transformation_proof_has_binding_p", "REMOVAL-TRANSFORMATION-PROOF-HAS-BINDING-P", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_inference_answer_bindings", "REMOVAL-INFERENCE-ANSWER-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_inference_answer_has_binding_p", "REMOVAL-INFERENCE-ANSWER-HAS-BINDING-P", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_inference_binding_var", "REMOVAL-INFERENCE-BINDING-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_inference_binding_has_var_p", "REMOVAL-INFERENCE-BINDING-HAS-VAR-P", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_inference_binding_value", "REMOVAL-INFERENCE-BINDING-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_inference_binding_has_value_p", "REMOVAL-INFERENCE-BINDING-HAS-VALUE-P", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_inference_reflection_file()
  {
    $problem_count_for_term_divisor$ = SubLFiles.deflexical( "*PROBLEM-COUNT-FOR-TERM-DIVISOR*", TEN_INTEGER );
    $problem_store_term_to_problem_ratio$ = SubLFiles.deflexical( "*PROBLEM-STORE-TERM-TO-PROBLEM-RATIO*", TWO_INTEGER );
    $average_problem_query_term_count$ = SubLFiles.deflexical( "*AVERAGE-PROBLEM-QUERY-TERM-COUNT*", FIVE_INTEGER );
    $default_transformation_proof_rule_check_cost$ = SubLFiles.defconstant( "*DEFAULT-TRANSFORMATION-PROOF-RULE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_transformation_proof_rule_lookup_cost$ = SubLFiles.defconstant( "*DEFAULT-TRANSFORMATION-PROOF-RULE-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_transformation_proof_bindings_check_cost$ = SubLFiles.defconstant( "*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_transformation_proof_bindings_lookup_cost$ = SubLFiles.defconstant( "*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_inference_answer_bindings_check_cost$ = SubLFiles.defconstant( "*DEFAULT-INFERENCE-ANSWER-BINDINGS-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_inference_answer_bindings_lookup_cost$ = SubLFiles.defconstant( "*DEFAULT-INFERENCE-ANSWER-BINDINGS-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_inference_binding_var_check_cost$ = SubLFiles.defconstant( "*DEFAULT-INFERENCE-BINDING-VAR-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_inference_binding_var_lookup_cost$ = SubLFiles.defconstant( "*DEFAULT-INFERENCE-BINDING-VAR-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_inference_binding_value_check_cost$ = SubLFiles.defconstant( "*DEFAULT-INFERENCE-BINDING-VALUE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_inference_binding_value_lookup_cost$ = SubLFiles.defconstant( "*DEFAULT-INFERENCE-BINDING-VALUE-LOOKUP-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $supported_inference_reflection_predicates$ = SubLFiles.deflexical( "*SUPPORTED-INFERENCE-REFLECTION-PREDICATES*", $list104 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_inference_reflection_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const31$cycProblemStoreProblemCount );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const31$cycProblemStoreProblemCount, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw33$REMOVAL_PROBLEM_STORE_PROBLEM_COUNT_LOOKUP, $list34 );
    inference_modules.register_solely_specific_removal_module_predicate( $const35$cycProblemStoreLinkCount );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const35$cycProblemStoreLinkCount, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw36$REMOVAL_PROBLEM_STORE_LINK_COUNT_LOOKUP, $list37 );
    inference_modules.register_solely_specific_removal_module_predicate( $const38$cycProblemStoreProofCount );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const38$cycProblemStoreProofCount, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw39$REMOVAL_PROBLEM_STORE_PROOF_COUNT_LOOKUP, $list40 );
    inference_modules.register_solely_specific_removal_module_predicate( $const41$cycProblemStoreInferenceCount );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const41$cycProblemStoreInferenceCount, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw42$REMOVAL_PROBLEM_STORE_INFERENCE_COUNT_LOOKUP, $list43 );
    inference_modules.register_solely_specific_removal_module_predicate( $const44$cycProblemStoreTerms );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const44$cycProblemStoreTerms, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw45$NEG, $const44$cycProblemStoreTerms );
    inference_modules.inference_removal_module( $kw46$REMOVAL_PROBLEM_STORE_TERMS_CHECK_POS, $list47 );
    inference_modules.inference_removal_module( $kw48$REMOVAL_PROBLEM_STORE_TERMS_CHECK_NEG, $list49 );
    inference_modules.inference_removal_module( $kw50$REMOVAL_PROBLEM_STORE_TERMS_ARG2_UNIFY, $list51 );
    inference_modules.register_solely_specific_removal_module_predicate( $const52$cycProblemStoreProblems );
    preference_modules.doomed_unless_either_arg_bindable( $kw32$POS, $const52$cycProblemStoreProblems );
    inference_modules.inference_removal_module( $kw53$REMOVAL_PROBLEM_STORE_PROBLEMS_ARG1_UNIFY, $list54 );
    inference_modules.inference_removal_module( $kw55$REMOVAL_PROBLEM_STORE_PROBLEMS_ARG2_UNIFY, $list56 );
    inference_modules.register_solely_specific_removal_module_predicate( $const57$cycProblemQuerySentence );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const57$cycProblemQuerySentence, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw58$REMOVAL_PROBLEM_QUERY_SENTENCE_ARG2_UNIFY, $list59 );
    inference_modules.register_solely_specific_removal_module_predicate( $const60$cycProblemQueryTerms );
    preference_modules.doomed_unless_either_arg_bindable( $kw32$POS, $const60$cycProblemQueryTerms );
    preference_modules.doomed_unless_all_args_bindable( $kw45$NEG, $const60$cycProblemQueryTerms );
    inference_modules.inference_removal_module( $kw61$REMOVAL_PROBLEM_QUERY_TERMS_CHECK_POS, $list62 );
    inference_modules.inference_removal_module( $kw63$REMOVAL_PROBLEM_QUERY_TERMS_CHECK_NEG, $list64 );
    inference_modules.inference_removal_module( $kw68$REMOVAL_PROBLEM_QUERY_TERMS_ARG1_UNIFY, $list69 );
    inference_modules.inference_removal_module( $kw70$REMOVAL_PROBLEM_QUERY_TERMS_ARG2_UNIFY, $list71 );
    inference_modules.register_solely_specific_removal_module_predicate( $const72$cycProblemProvabilityStatus );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const72$cycProblemProvabilityStatus, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw73$REMOVAL_PROBLEM_PROVABILITY_STATUS_CHECK_POS, $list74 );
    inference_modules.inference_removal_module( $kw75$REMOVAL_PROBLEM_PROVABILITY_STATUS_ARG2_UNIFY, $list76 );
    inference_modules.register_solely_specific_removal_module_predicate( $const77$cycTransformationProofRule );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const77$cycTransformationProofRule, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw78$REMOVAL_TRANSFORMATION_PROOF_RULE_CHECK_POS, $list79 );
    inference_modules.inference_removal_module( $kw80$REMOVAL_TRANSFORMATION_PROOF_RULE_ARG2_UNIFY, $list81 );
    inference_modules.register_solely_specific_removal_module_predicate( $const82$cycTransformationProofBindings );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const82$cycTransformationProofBindings, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw83$REMOVAL_TRANSFORMATION_PROOF_BINDINGS_CHECK_POS, $list84 );
    inference_modules.inference_removal_module( $kw85$REMOVAL_TRANSFORMATION_PROOF_BINDINGS_ARG2_UNIFY, $list86 );
    inference_modules.register_solely_specific_removal_module_predicate( $const87$inferenceAnswerBindings );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const87$inferenceAnswerBindings, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw90$REMOVAL_INFERENCE_ANSWER_BINDINGS_CHECK_POS, $list91 );
    inference_modules.inference_removal_module( $kw92$REMOVAL_INFERENCE_ANSWER_BINDINGS_ARG2_UNIFY, $list93 );
    inference_modules.register_solely_specific_removal_module_predicate( $const94$inferenceBindingVar );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const94$inferenceBindingVar, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw95$REMOVAL_INFERENCE_BINDING_VAR_CHECK_POS, $list96 );
    inference_modules.inference_removal_module( $kw97$REMOVAL_INFERENCE_BINDING_VAR_ARG2_UNIFY, $list98 );
    inference_modules.register_solely_specific_removal_module_predicate( $const99$inferenceBindingValue );
    preference_modules.doomed_unless_arg_bindable( $kw32$POS, $const99$inferenceBindingValue, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw100$REMOVAL_INFERENCE_BINDING_VALUE_CHECK_POS, $list101 );
    inference_modules.inference_removal_module( $kw102$REMOVAL_INFERENCE_BINDING_VALUE_ARG2_UNIFY, $list103 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_inference_reflection_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_inference_reflection_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_inference_reflection_file();
  }
  static
  {
    me = new removal_modules_inference_reflection();
    $problem_count_for_term_divisor$ = null;
    $problem_store_term_to_problem_ratio$ = null;
    $average_problem_query_term_count$ = null;
    $default_transformation_proof_rule_check_cost$ = null;
    $default_transformation_proof_rule_lookup_cost$ = null;
    $default_transformation_proof_bindings_check_cost$ = null;
    $default_transformation_proof_bindings_lookup_cost$ = null;
    $default_inference_answer_bindings_check_cost$ = null;
    $default_inference_answer_bindings_lookup_cost$ = null;
    $default_inference_binding_var_check_cost$ = null;
    $default_inference_binding_var_lookup_cost$ = null;
    $default_inference_binding_value_check_cost$ = null;
    $default_inference_binding_value_lookup_cost$ = null;
    $supported_inference_reflection_predicates$ = null;
    $sym0$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $sym1$PROBLEM_STORE_P = makeSymbol( "PROBLEM-STORE-P" );
    $kw2$SKIP = makeKeyword( "SKIP" );
    $sym3$_ = makeSymbol( "<" );
    $sym4$PROBLEM_SUID = makeSymbol( "PROBLEM-SUID" );
    $list5 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycProblemStoreFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "STORE-ID" ) ) );
    $sym6$STORE_ID = makeSymbol( "STORE-ID" );
    $const7$CycProblemStoreFn = constant_handles.reader_make_constant_shell( makeString( "CycProblemStoreFn" ) );
    $list8 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycProblemFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PROBLEM-ID" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "CycProblemStoreFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "STORE-ID" ) ) ) );
    $sym9$PROBLEM_ID = makeSymbol( "PROBLEM-ID" );
    $const10$CycProblemFn = constant_handles.reader_make_constant_shell( makeString( "CycProblemFn" ) );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycProblemLinkFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "LINK-ID" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "CycProblemStoreFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "STORE-ID" ) ) ) );
    $sym12$LINK_ID = makeSymbol( "LINK-ID" );
    $const13$CycProblemLinkFn = constant_handles.reader_make_constant_shell( makeString( "CycProblemLinkFn" ) );
    $list14 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycProofFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PROOF-ID" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "CycProblemStoreFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "STORE-ID" ) ) ) );
    $sym15$PROOF_ID = makeSymbol( "PROOF-ID" );
    $const16$CycProofFn = constant_handles.reader_make_constant_shell( makeString( "CycProofFn" ) );
    $list17 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycInferenceFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "INFERENCE-ID" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "CycProblemStoreFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "STORE-ID" ) ) ) );
    $sym18$INFERENCE_ID = makeSymbol( "INFERENCE-ID" );
    $const19$CycInferenceFn = constant_handles.reader_make_constant_shell( makeString( "CycInferenceFn" ) );
    $const20$Good_ProblemProvabilityStatus = constant_handles.reader_make_constant_shell( makeString( "Good-ProblemProvabilityStatus" ) );
    $kw21$GOOD = makeKeyword( "GOOD" );
    $const22$Neutral_ProblemProvabilityStatus = constant_handles.reader_make_constant_shell( makeString( "Neutral-ProblemProvabilityStatus" ) );
    $kw23$NEUTRAL = makeKeyword( "NEUTRAL" );
    $const24$NoGood_ProblemProvabilityStatus = constant_handles.reader_make_constant_shell( makeString( "NoGood-ProblemProvabilityStatus" ) );
    $kw25$NO_GOOD = makeKeyword( "NO-GOOD" );
    $list26 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "EL-VAR" ) ), ConsesLow.list( makeKeyword( "BIND" ),
        makeSymbol( "VALUE" ) ) );
    $sym27$VALUE = makeSymbol( "VALUE" );
    $sym28$EL_VAR = makeSymbol( "EL-VAR" );
    $list29 = ConsesLow.cons( makeSymbol( "EL-VAR" ), makeSymbol( "VALUE" ) );
    $const30$ELInferenceBindingFn = constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) );
    $const31$cycProblemStoreProblemCount = constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblemCount" ) );
    $kw32$POS = makeKeyword( "POS" );
    $kw33$REMOVAL_PROBLEM_STORE_PROBLEM_COUNT_LOOKUP = makeKeyword( "REMOVAL-PROBLEM-STORE-PROBLEM-COUNT-LOOKUP" );
    $list34 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblemCount" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblemCount" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
          "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "cycProblemStoreProblemCount" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STORE" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "CYCL-STORE" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-STORE-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                      "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                          "REMOVAL-PROBLEM-STORE-PROBLEM-COUNT" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "cycProblemStoreProblemCount" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ), makeKeyword( "INPUT" ) )
    } );
    $const35$cycProblemStoreLinkCount = constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreLinkCount" ) );
    $kw36$REMOVAL_PROBLEM_STORE_LINK_COUNT_LOOKUP = makeKeyword( "REMOVAL-PROBLEM-STORE-LINK-COUNT-LOOKUP" );
    $list37 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreLinkCount" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreLinkCount" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
          "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "cycProblemStoreLinkCount" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STORE" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "CYCL-STORE" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-STORE-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                      "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                          "REMOVAL-PROBLEM-STORE-LINK-COUNT" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "cycProblemStoreLinkCount" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ), makeKeyword( "INPUT" ) )
    } );
    $const38$cycProblemStoreProofCount = constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProofCount" ) );
    $kw39$REMOVAL_PROBLEM_STORE_PROOF_COUNT_LOOKUP = makeKeyword( "REMOVAL-PROBLEM-STORE-PROOF-COUNT-LOOKUP" );
    $list40 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProofCount" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProofCount" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
          "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "cycProblemStoreProofCount" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STORE" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "CYCL-STORE" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-STORE-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                      "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                          "REMOVAL-PROBLEM-STORE-PROOF-COUNT" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "cycProblemStoreProofCount" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ), makeKeyword( "INPUT" ) )
    } );
    $const41$cycProblemStoreInferenceCount = constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreInferenceCount" ) );
    $kw42$REMOVAL_PROBLEM_STORE_INFERENCE_COUNT_LOOKUP = makeKeyword( "REMOVAL-PROBLEM-STORE-INFERENCE-COUNT-LOOKUP" );
    $list43 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreInferenceCount" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreInferenceCount" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ),
      makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreInferenceCount" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STORE" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-STORE-ENCODE" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "REMOVAL-PROBLEM-STORE-INFERENCE-COUNT" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "cycProblemStoreInferenceCount" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ), makeKeyword( "INPUT" ) )
    } );
    $const44$cycProblemStoreTerms = constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) );
    $kw45$NEG = makeKeyword( "NEG" );
    $kw46$REMOVAL_PROBLEM_STORE_TERMS_CHECK_POS = makeKeyword( "REMOVAL-PROBLEM-STORE-TERMS-CHECK-POS" );
    $list47 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow
                .list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STORE" ) ),
                    ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                        makeSymbol( "TERM" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-STORE" ), makeSymbol( "TERM" ) ), ConsesLow.list(
                            ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-STORE-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ) ), ConsesLow.list( makeKeyword(
                                "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "STORE" ), makeSymbol( "TERM" ) ),
                                    ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PROBLEM-STORE-TERMS-CHECK" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STORE" ) ), ConsesLow.list( makeKeyword(
                                        "VALUE" ), makeSymbol( "TERM" ) ) ) )
    } );
    $kw48$REMOVAL_PROBLEM_STORE_TERMS_CHECK_NEG = makeKeyword( "REMOVAL-PROBLEM-STORE-TERMS-CHECK-NEG" );
    $list49 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), ConsesLow.list( makeSymbol( "INVERT-REMOVAL-CHECK-COST" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ) ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "CHECK" ), T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) ),
                    ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STORE" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                        makeSymbol( "CYCL-STORE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                            makeSymbol( "CYCL-STORE" ), makeSymbol( "TERM" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-STORE-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ),
                                makeSymbol( "CYCL-STORE" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow
                                    .list( makeSymbol( "STORE" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                        "REMOVAL-PROBLEM-STORE-TERMS-CHECK" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STORE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ) )
    } );
    $kw50$REMOVAL_PROBLEM_STORE_TERMS_ARG2_UNIFY = makeKeyword( "REMOVAL-PROBLEM-STORE-TERMS-ARG2-UNIFY" );
    $list51 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-PROBLEM-STORE-TERMS-ARG2-UNIFY-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
          .list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STORE" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-STORE-ENCODE" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PROBLEM-STORE-TERMS" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ), makeKeyword( "INPUT" ) )
    } );
    $const52$cycProblemStoreProblems = constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblems" ) );
    $kw53$REMOVAL_PROBLEM_STORE_PROBLEMS_ARG1_UNIFY = makeKeyword( "REMOVAL-PROBLEM-STORE-PROBLEMS-ARG1-UNIFY" );
    $list54 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblems" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblems" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
          "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "cycProblemStoreProblems" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-PROBLEM" ) ) ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "CYCL-PROBLEM" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                      "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PROBLEM-STORE" ),
                          makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-STORE-DECODE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                              "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblems" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword(
                                  "VALUE" ), makeSymbol( "CYCL-PROBLEM" ) ) )
    } );
    $kw55$REMOVAL_PROBLEM_STORE_PROBLEMS_ARG2_UNIFY = makeKeyword( "REMOVAL-PROBLEM-STORE-PROBLEMS-ARG2-UNIFY" );
    $list56 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblems" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblems" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "COST" ), makeSymbol( "REMOVAL-PROBLEM-STORE-PROBLEMS-ARG2-UNIFY-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
          "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblems" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STORE" ) ), makeKeyword(
              "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "CYCL-PROBLEM-STORE-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PROBLEM-STORE-PROBLEM-ITERATOR" ),
                      makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-DECODE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblems" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                              "CYCL-STORE" ) ), makeKeyword( "INPUT" ) )
    } );
    $const57$cycProblemQuerySentence = constant_handles.reader_make_constant_shell( makeString( "cycProblemQuerySentence" ) );
    $kw58$REMOVAL_PROBLEM_QUERY_SENTENCE_ARG2_UNIFY = makeKeyword( "REMOVAL-PROBLEM-QUERY-SENTENCE-ARG2-UNIFY" );
    $list59 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemQuerySentence" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQuerySentence" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
          "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "cycProblemQuerySentence" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-PROBLEM" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "CYCL-PROBLEM" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                      "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PROBLEM-QUERY" ),
                          makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "PROBLEM-QUERY-EL-FORMULA" ), makeKeyword( "INPUT" ) ), makeKeyword(
                              "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQuerySentence" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                  "CYCL-PROBLEM" ) ), makeKeyword( "INPUT" ) )
    } );
    $const60$cycProblemQueryTerms = constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) );
    $kw61$REMOVAL_PROBLEM_QUERY_TERMS_CHECK_POS = makeKeyword( "REMOVAL-PROBLEM-QUERY-TERMS-CHECK-POS" );
    $list62 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
                makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-PROBLEM" ) ),
                    ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROBLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                        makeSymbol( "TERM" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-PROBLEM" ), makeSymbol( "TERM" ) ), ConsesLow.list(
                            ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROBLEM" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                makeSymbol( "TERM" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "PROBLEM" ), makeSymbol( "TERM" ) ), ConsesLow.list(
                                    makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PROBLEM-QUERY-TERMS-CHECK" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "PROBLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                        makeSymbol( "TERM" ) ) ) )
    } );
    $kw63$REMOVAL_PROBLEM_QUERY_TERMS_CHECK_NEG = makeKeyword( "REMOVAL-PROBLEM-QUERY-TERMS-CHECK-NEG" );
    $list64 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), ConsesLow.list( makeSymbol( "INVERT-REMOVAL-CHECK-COST" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ) ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "CHECK" ), T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ),
                    ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-PROBLEM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                        makeSymbol( "CYCL-PROBLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                            makeSymbol( "CYCL-PROBLEM" ), makeSymbol( "TERM" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ),
                                makeSymbol( "CYCL-PROBLEM" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ),
                                    ConsesLow.list( makeSymbol( "PROBLEM" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ),
                                        makeSymbol( "REMOVAL-PROBLEM-QUERY-TERMS-CHECK" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "PROBLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                            "TERM" ) ) ) ) )
    } );
    $list65 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycProblemFn" ) ), makeKeyword(
        "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STORE" ) ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) );
    $sym66$TERM = makeSymbol( "TERM" );
    $sym67$CYCL_STORE = makeSymbol( "CYCL-STORE" );
    $kw68$REMOVAL_PROBLEM_QUERY_TERMS_ARG1_UNIFY = makeKeyword( "REMOVAL-PROBLEM-QUERY-TERMS-ARG1-UNIFY" );
    $list69 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "CycProblemFn" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-PROBLEM-QUERY-TERMS-ARG1-UNIFY-COST" ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "cycProblemQueryTerms" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycProblemFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "CYCL-STORE" ) ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-STORE" ), makeSymbol( "TERM" ) ), ConsesLow.list(
                      ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-STORE-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STORE" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                          makeSymbol( "TERM" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "STORE" ), makeSymbol( "TERM" ) ), ConsesLow.list(
                              makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PROBLEM-STORE-PROBLEMS-MENTIONING-TERM" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STORE" ) ), ConsesLow.list( makeKeyword(
                                  "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-DECODE" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ),
          makeSymbol( "TERM" ) ) )
    } );
    $kw70$REMOVAL_PROBLEM_QUERY_TERMS_ARG2_UNIFY = makeKeyword( "REMOVAL-PROBLEM-QUERY-TERMS-ARG2-UNIFY" );
    $list71 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*AVERAGE-PROBLEM-QUERY-TERM-COUNT*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-PROBLEM" ) ), makeKeyword(
                    "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROBLEM" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                        "CYCL-PROBLEM-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PROBLEM-QUERY-TERMS" ), makeKeyword(
                            "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ), ConsesLow.list( makeKeyword(
                                "VALUE" ), makeSymbol( "CYCL-PROBLEM" ) ), makeKeyword( "INPUT" ) )
    } );
    $const72$cycProblemProvabilityStatus = constant_handles.reader_make_constant_shell( makeString( "cycProblemProvabilityStatus" ) );
    $kw73$REMOVAL_PROBLEM_PROVABILITY_STATUS_CHECK_POS = makeKeyword( "REMOVAL-PROBLEM-PROVABILITY-STATUS-CHECK-POS" );
    $list74 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemProvabilityStatus" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemProvabilityStatus" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "CHECK" ), T, makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow
          .list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemProvabilityStatus" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "CYCL-PROBLEM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-STATUS" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROBLEM" ) ), ConsesLow.list(
                  makeKeyword( "VALUE" ), makeSymbol( "CYCL-STATUS" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-PROBLEM" ), makeSymbol(
                      "CYCL-STATUS" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROBLEM" ) ) ), ConsesLow
                          .list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROVABILITY-STATUS-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-STATUS" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "PROBLEM" ), makeSymbol( "STATUS" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-PROBLEM-PROVABILITY-STATUS-CHECK" ), ConsesLow
          .list( makeKeyword( "VALUE" ), makeSymbol( "PROBLEM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STATUS" ) ) ) )
    } );
    $kw75$REMOVAL_PROBLEM_PROVABILITY_STATUS_ARG2_UNIFY = makeKeyword( "REMOVAL-PROBLEM-PROVABILITY-STATUS-ARG2-UNIFY" );
    $list76 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycProblemProvabilityStatus" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemProvabilityStatus" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
          "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "cycProblemProvabilityStatus" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-PROBLEM" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "CYCL-PROBLEM" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROBLEM-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                      "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                          "REMOVAL-PROBLEM-PROVABILITY-STATUS" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROVABILITY-STATUS-DECODE" ),
                              makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycProblemProvabilityStatus" ) ), ConsesLow
                                  .list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROBLEM" ) ), makeKeyword( "INPUT" ) )
    } );
    $const77$cycTransformationProofRule = constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofRule" ) );
    $kw78$REMOVAL_TRANSFORMATION_PROOF_RULE_CHECK_POS = makeKeyword( "REMOVAL-TRANSFORMATION-PROOF-RULE-CHECK-POS" );
    $list79 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofRule" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofRule" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TRANSFORMATION-PROOF-RULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
          makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofRule" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-PROOF" ) ),
              ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-RULE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROOF" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                  makeSymbol( "CYCL-RULE" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-PROOF" ), makeSymbol( "CYCL-RULE" ) ), ConsesLow.list(
                      ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROOF-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROOF" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                          "CYCL-RULE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-PROOF" ), makeSymbol( "CYCL-RULE" ) ), ConsesLow.list(
                              makeKeyword( "CALL" ), makeSymbol( "REMOVAL-TRANSFORMATION-PROOF-HAS-RULE-P" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROOF" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                  makeSymbol( "CYCL-RULE" ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$cycTransformationProofRule <fully-bound> <fully-bound>)" )
    } );
    $kw80$REMOVAL_TRANSFORMATION_PROOF_RULE_ARG2_UNIFY = makeKeyword( "REMOVAL-TRANSFORMATION-PROOF-RULE-ARG2-UNIFY" );
    $list81 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofRule" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofRule" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TRANSFORMATION-PROOF-RULE-LOOKUP-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
          makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofRule" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-PROOF" ) ),
              makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROOF" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "CYCL-PROOF-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list(
                      makeKeyword( "CALL" ), makeSymbol( "REMOVAL-TRANSFORMATION-PROOF-RULE" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "cycTransformationProofRule" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROOF" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                              "DOCUMENTATION" ), makeString( "(#$cycTransformationProofRule <fully-bound> <not-fully-bound>)" )
    } );
    $const82$cycTransformationProofBindings = constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofBindings" ) );
    $kw83$REMOVAL_TRANSFORMATION_PROOF_BINDINGS_CHECK_POS = makeKeyword( "REMOVAL-TRANSFORMATION-PROOF-BINDINGS-CHECK-POS" );
    $list84 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofBindings" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofBindings" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow
          .list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofBindings" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "CYCL-PROOF" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-BINDING" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROOF" ) ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "CYCL-BINDING" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-PROOF" ), makeSymbol( "CYCL-BINDING" ) ),
                      ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-PROOF-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROOF" ) ) ), ConsesLow.list( makeKeyword(
                          "CALL" ), makeSymbol( "CYCL-BINDING-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword(
                              "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-PROOF" ), makeSymbol( "CYCL-BINDING" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-TRANSFORMATION-PROOF-HAS-BINDING-P" ),
                                  ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROOF" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ) ) ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$cycTransformationProofBindings <fully-bound> <fully-bound>)" )
    } );
    $kw85$REMOVAL_TRANSFORMATION_PROOF_BINDINGS_ARG2_UNIFY = makeKeyword( "REMOVAL-TRANSFORMATION-PROOF-BINDINGS-ARG2-UNIFY" );
    $list86 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofBindings" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofBindings" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TRANSFORMATION-PROOF-BINDINGS-LOOKUP-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow
          .list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofBindings" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "CYCL-PROOF" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROOF" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                  makeSymbol( "CYCL-PROOF-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-TRANSFORMATION-PROOF-BINDINGS" ),
                      makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cycTransformationProofBindings" ) ), ConsesLow.list(
                          makeKeyword( "VALUE" ), makeSymbol( "CYCL-PROOF" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-BINDING-DECODE" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$cycTransformationProofBindings <fully-bound> <not-fully-bound>)" )
    } );
    $const87$inferenceAnswerBindings = constant_handles.reader_make_constant_shell( makeString( "inferenceAnswerBindings" ) );
    $const88$CycInferenceAnswerFn = constant_handles.reader_make_constant_shell( makeString( "CycInferenceAnswerFn" ) );
    $const89$TheEmptySet = constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) );
    $kw90$REMOVAL_INFERENCE_ANSWER_BINDINGS_CHECK_POS = makeKeyword( "REMOVAL-INFERENCE-ANSWER-BINDINGS-CHECK-POS" );
    $list91 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "inferenceAnswerBindings" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceAnswerBindings" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
          "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-INFERENCE-ANSWER-BINDINGS-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
              makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceAnswerBindings" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                  "CYCL-INFERENCE-ANSWER" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-BINDING" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-INFERENCE-ANSWER" ) ),
                      ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                          "CYCL-INFERENCE-ANSWER" ), makeSymbol( "CYCL-BINDING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-INFERENCE-ANSWER" ) ), ConsesLow.list( makeKeyword(
                              "VALUE" ), makeSymbol( "CYCL-BINDING" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-INFERENCE-ANSWER" ),
                                  makeSymbol( "CYCL-BINDING" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-INFERENCE-ANSWER-HAS-BINDING-P" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                      "CYCL-INFERENCE-ANSWER" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                          "(#$inferenceAnswerBindings <fully-bound> <fully-bound>)" )
    } );
    $kw92$REMOVAL_INFERENCE_ANSWER_BINDINGS_ARG2_UNIFY = makeKeyword( "REMOVAL-INFERENCE-ANSWER-BINDINGS-ARG2-UNIFY" );
    $list93 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "inferenceAnswerBindings" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceAnswerBindings" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-INFERENCE-ANSWER-BINDINGS-LOOKUP-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
          makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceAnswerBindings" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-INFERENCE-ANSWER" ) ),
              makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-INFERENCE-ANSWER" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "EL-SET-ITEMS" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-INFERENCE-ANSWER-BINDINGS" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                      constant_handles.reader_make_constant_shell( makeString( "inferenceAnswerBindings" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-INFERENCE-ANSWER" ) ), makeKeyword( "INPUT" ) ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$inferenceAnswerBindings <fully-bound> <not-fully-bound>)" )
    } );
    $const94$inferenceBindingVar = constant_handles.reader_make_constant_shell( makeString( "inferenceBindingVar" ) );
    $kw95$REMOVAL_INFERENCE_BINDING_VAR_CHECK_POS = makeKeyword( "REMOVAL-INFERENCE-BINDING-VAR-CHECK-POS" );
    $list96 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "inferenceBindingVar" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceBindingVar" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-INFERENCE-BINDING-VAR-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceBindingVar" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-BINDING" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "CYCL-VAR" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "CYCL-VAR" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-BINDING" ), makeSymbol( "CYCL-VAR" ) ), ConsesLow.list(
                            ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CYCL-BINDING-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                makeSymbol( "CYCL-VAR" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-BINDING" ), makeSymbol( "CYCL-VAR" ) ),
                                    ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-INFERENCE-BINDING-HAS-VAR-P" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ), ConsesLow.list(
                                        makeKeyword( "VALUE" ), makeSymbol( "CYCL-VAR" ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$inferenceBindingVar <fully-bound> <fully-bound>)" )
    } );
    $kw97$REMOVAL_INFERENCE_BINDING_VAR_ARG2_UNIFY = makeKeyword( "REMOVAL-INFERENCE-BINDING-VAR-ARG2-UNIFY" );
    $list98 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "inferenceBindingVar" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceBindingVar" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-INFERENCE-BINDING-VAR-LOOKUP-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceBindingVar" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-BINDING" ) ), makeKeyword(
                    "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                        "CYCL-BINDING-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list(
                            makeKeyword( "CALL" ), makeSymbol( "REMOVAL-INFERENCE-BINDING-VAR" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "inferenceBindingVar" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                    "DOCUMENTATION" ), makeString( "(#$inferenceBindingVar <fully-bound> <not-fully-bound>)" )
    } );
    $const99$inferenceBindingValue = constant_handles.reader_make_constant_shell( makeString( "inferenceBindingValue" ) );
    $kw100$REMOVAL_INFERENCE_BINDING_VALUE_CHECK_POS = makeKeyword( "REMOVAL-INFERENCE-BINDING-VALUE-CHECK-POS" );
    $list101 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "inferenceBindingValue" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceBindingValue" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
          "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-INFERENCE-BINDING-VALUE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
              "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceBindingValue" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-BINDING" ) ), ConsesLow.list(
                  makeKeyword( "BIND" ), makeSymbol( "CYCL-VAR" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "CYCL-VAR" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-BINDING" ), makeSymbol( "CYCL-VAR" ) ), ConsesLow.list( ConsesLow
                          .list( makeKeyword( "CALL" ), makeSymbol( "CYCL-BINDING-ENCODE" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                              "CYCL-VAR" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "CYCL-BINDING" ), makeSymbol( "CYCL-VAR" ) ), ConsesLow.list(
                                  makeKeyword( "CALL" ), makeSymbol( "REMOVAL-INFERENCE-BINDING-HAS-VALUE-P" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ), ConsesLow.list( makeKeyword(
                                      "VALUE" ), makeSymbol( "CYCL-VAR" ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$inferenceBindingValue <fully-bound> <fully-bound>)" )
    } );
    $kw102$REMOVAL_INFERENCE_BINDING_VALUE_ARG2_UNIFY = makeKeyword( "REMOVAL-INFERENCE-BINDING-VALUE-ARG2-UNIFY" );
    $list103 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "inferenceBindingValue" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceBindingValue" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-INFERENCE-BINDING-VALUE-LOOKUP-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
          makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inferenceBindingValue" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-BINDING" ) ),
              makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "CYCL-BINDING-ENCODE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list(
                      makeKeyword( "CALL" ), makeSymbol( "REMOVAL-INFERENCE-BINDING-VALUE" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "inferenceBindingValue" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-BINDING" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                              "DOCUMENTATION" ), makeString( "(#$inferenceBindingValue <fully-bound> <not-fully-bound>)" )
    } );
    $list104 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProblemCount" ) ), constant_handles.reader_make_constant_shell( makeString(
        "cycProblemStoreLinkCount" ) ), constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreProofCount" ) ), constant_handles.reader_make_constant_shell( makeString(
            "cycProblemStoreInferenceCount" ) ), constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreTerms" ) ), constant_handles.reader_make_constant_shell( makeString(
                "cycProblemStoreProblems" ) ), constant_handles.reader_make_constant_shell( makeString( "cycProblemQuerySentence" ) ), constant_handles.reader_make_constant_shell( makeString( "cycProblemQueryTerms" ) ),
      constant_handles.reader_make_constant_shell( makeString( "cycProblemProvabilityStatus" ) )
    } );
  }
}
/*
 * 
 * Total time: 430 ms
 * 
 */