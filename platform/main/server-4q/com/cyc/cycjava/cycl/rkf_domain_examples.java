package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_domain_examples
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_domain_examples";
  public static final String myFingerPrint = "9d305d8f794bfb83efad96c7540fc6b8576832d80266ae0f2d681dde667e5a1f";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26996L)
  private static SubLSymbol $rkf_min_arg_n_isa_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27258L)
  private static SubLSymbol $rkf_min_arg_n_genl_caching_state$;
  private static final SubLSymbol $sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED;
  private static final SubLObject $const1$keSalientSpecPredicate;
  private static final SubLSymbol $sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED;
  private static final SubLSymbol $kw3$NODE;
  private static final SubLSymbol $kw4$PREDICATE;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$SENTENCE;
  private static final SubLObject $const7$domainExamplePredSentences;
  private static final SubLList $list8;
  private static final SubLObject $const9$examplePredSentences;
  private static final SubLSymbol $kw10$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym11$IGNORE_ERRORS_HANDLER;
  private static final SubLObject $const12$argIsa;
  private static final SubLObject $const13$argGenl;
  private static final SubLObject $const14$SomeExampleFn;
  private static final SubLObject $const15$SomeExampleSpecFn;
  private static final SubLSymbol $sym16$RKF_GENERIC_EXAMPLE_P;
  private static final SubLSymbol $sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED;
  private static final SubLSymbol $sym18$MIN_ARITY_MEMOIZED;
  private static final SubLString $str19$_;
  private static final SubLSymbol $sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED;
  private static final SubLSymbol $kw21$ASCENDING;
  private static final SubLObject $const22$Collection;
  private static final SubLSymbol $sym23$_;
  private static final SubLSymbol $sym24$GENERALITY_ESTIMATE;
  private static final SubLSymbol $sym25$RELEVANT_MT_IS_GENL_MT;
  private static final SubLString $str26$identifying__S_matches;
  private static final SubLString $str27$cdolist;
  private static final SubLSymbol $kw28$GAF;
  private static final SubLSymbol $kw29$TRUE;
  private static final SubLString $str30$identifying_matches;
  private static final SubLSymbol $sym31$LISTP;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$THIRD;
  private static final SubLSymbol $sym34$SECOND;
  private static final SubLSymbol $sym35$RELATION_GENERALITY_ESTIMATE_;
  private static final SubLSymbol $sym36$FIRST;
  private static final SubLSymbol $sym37$GENERALITY_ESTIMATE_;
  private static final SubLSymbol $sym38$FOURTH;
  private static final SubLList $list39;
  private static final SubLString $str40$organizing_matches;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$RELATION_GENERALITY_ESTIMATE;
  private static final SubLString $str46$categorizing_predicates;
  private static final SubLString $str47$sorting_predicates;
  private static final SubLObject $const48$Relation;
  private static final SubLString $str49$Other_predicates;
  private static final SubLObject $const50$TypeTypeTernaryRuleMacroPredicate;
  private static final SubLObject $const51$TypeInstanceTernaryRuleMacroPredi;
  private static final SubLObject $const52$InstanceTypeTernaryRuleMacroPredi;
  private static final SubLSymbol $sym53$RKF_MIN_ARG_N_ISA;
  private static final SubLSymbol $sym54$_RKF_MIN_ARG_N_ISA_CACHING_STATE_;
  private static final SubLSymbol $sym55$RKF_MIN_ARG_N_GENL;
  private static final SubLSymbol $sym56$_RKF_MIN_ARG_N_GENL_CACHING_STATE_;
  private static final SubLSymbol $sym57$_;
  private static final SubLSymbol $sym58$NUM_PREDICATE_EXTENT_INDEX;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 940L)
  public static SubLObject rkf_salient_spec_predicateP(final SubLObject predicate, final SubLObject domain_mt)
  {
    return makeBoolean( NIL != forts.fort_p( predicate ) && NIL != fort_types_interface.predicateP( predicate ) && NIL == forts.invalid_fortP( predicate ) && NIL != rkf_salient_spec_predicate_memoized( predicate,
        domain_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 1367L)
  public static SubLObject rkf_salient_spec_predicate_memoized_internal(final SubLObject predicate, final SubLObject domain_mt)
  {
    return rkf_salient_spec_predicate_internal( predicate, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 1367L)
  public static SubLObject rkf_salient_spec_predicate_memoized(final SubLObject predicate, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_salient_spec_predicate_memoized_internal( predicate, domain_mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( predicate, domain_mt );
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
        if( predicate.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && domain_mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_salient_spec_predicate_memoized_internal( predicate, domain_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( predicate, domain_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 1528L)
  public static SubLObject rkf_salient_spec_predicate_internal(final SubLObject predicate, final SubLObject domain_mt)
  {
    return list_utilities.sublisp_boolean( backward.removal_ask( ConsesLow.list( $const1$keSalientSpecPredicate, predicate ), domain_mt, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 1685L)
  public static SubLObject rkf_build_spec_predicate_graph(final SubLObject predicates, final SubLObject domain_mt)
  {
    return rkf_build_spec_predicate_graph_memoized( predicates, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 2334L)
  public static SubLObject rkf_build_spec_predicate_graph_memoized_internal(final SubLObject predicates, final SubLObject domain_mt)
  {
    return rkf_build_spec_predicate_graph_internal( predicates, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 2334L)
  public static SubLObject rkf_build_spec_predicate_graph_memoized(final SubLObject predicates, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_build_spec_predicate_graph_memoized_internal( predicates, domain_mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( predicates, domain_mt );
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
        if( predicates.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && domain_mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_build_spec_predicate_graph_memoized_internal( predicates, domain_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( predicates, domain_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 2505L)
  public static SubLObject rkf_build_spec_predicate_graph_internal(final SubLObject predicates, final SubLObject domain_mt)
  {
    final SubLObject v_graph = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject orphans = NIL;
    SubLObject cdolist_list_var = predicates;
    SubLObject predicate = NIL;
    predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rkf_add_to_spec_predicate_graph( v_graph, predicate );
      if( NIL != rkf_salient_spec_predicateP( predicate, domain_mt ) )
      {
        final SubLObject superiors = genl_predicates.min_genl_predicates( predicate, domain_mt, UNPROVIDED );
        if( NIL == superiors )
        {
          orphans = ConsesLow.cons( predicate, orphans );
        }
        else
        {
          SubLObject cdolist_list_var_$1 = superiors;
          SubLObject superior = NIL;
          superior = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            rkf_extend_spec_predicate_graph_entry( v_graph, superior, predicate );
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            superior = cdolist_list_var_$1.first();
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      predicate = cdolist_list_var.first();
    }
    return Values.values( v_graph, orphans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 3103L)
  public static SubLObject rkf_interpret_spec_predicate_graph(final SubLObject predicates, final SubLObject v_graph, final SubLObject orphans, final SubLObject domain_mt)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = predicates;
    SubLObject predicate = NIL;
    predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == rkf_salient_spec_predicateP( predicate, domain_mt ) )
      {
        result = ConsesLow.cons( rkf_obtain_spec_predicate_sub_graph( v_graph, predicate ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      predicate = cdolist_list_var.first();
    }
    cdolist_list_var = Sequences.nreverse( orphans );
    SubLObject orphan = NIL;
    orphan = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( rkf_obtain_spec_predicate_sub_graph( v_graph, orphan ), result );
      cdolist_list_var = cdolist_list_var.rest();
      orphan = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 3915L)
  public static SubLObject rkf_add_to_spec_predicate_graph(final SubLObject v_graph, final SubLObject predicate)
  {
    if( NIL == dictionary.dictionary_lookup( v_graph, predicate, NIL ) )
    {
      dictionary.dictionary_enter( v_graph, predicate, set.new_set( UNPROVIDED, UNPROVIDED ) );
    }
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 4099L)
  public static SubLObject rkf_extend_spec_predicate_graph_entry(final SubLObject v_graph, final SubLObject superior, final SubLObject inferior)
  {
    rkf_add_to_spec_predicate_graph( v_graph, superior );
    final SubLObject subgraph = dictionary.dictionary_lookup( v_graph, superior, UNPROVIDED );
    set.set_add( inferior, subgraph );
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 4336L)
  public static SubLObject rkf_obtain_spec_predicate_sub_graph(final SubLObject v_graph, final SubLObject predicate)
  {
    final SubLObject subgraph = dictionary.dictionary_lookup( v_graph, predicate, UNPROVIDED );
    SubLObject sub_graph_expanded = NIL;
    if( NIL != set.set_emptyP( subgraph ) )
    {
      return ConsesLow.list( $kw3$NODE, predicate );
    }
    final SubLObject set_contents_var = set.do_set_internal( subgraph );
    SubLObject basis_object;
    SubLObject state;
    SubLObject pred;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      pred = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, pred ) )
      {
        sub_graph_expanded = ConsesLow.cons( rkf_obtain_spec_predicate_sub_graph( v_graph, pred ), sub_graph_expanded );
      }
    }
    return ConsesLow.list( $kw3$NODE, predicate, sub_graph_expanded );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 4721L)
  public static SubLObject rkf_count_spec_predicate_sub_graphs(final SubLObject v_graph)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( v_graph ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject predicate = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject subgraph = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == set.set_emptyP( subgraph ) )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 5097L)
  public static SubLObject rkf_domain_example_predicates(final SubLObject topic, final SubLObject domain_mt)
  {
    return rkf_domain_example_predicates_internal( topic, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 5368L)
  public static SubLObject rkf_predicate_example_sentence(final SubLObject predicate, final SubLObject domain_mt)
  {
    return rkf_all_predicate_example_sentences( predicate, domain_mt ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 5589L)
  public static SubLObject rkf_all_predicate_example_sentences(final SubLObject predicate, final SubLObject domain_mt)
  {
    SubLObject examples = rkf_all_predicate_specific_example_sentences( predicate, domain_mt );
    if( NIL == examples )
    {
      final SubLObject generic_example = rkf_predicate_generic_example_sentence( predicate, domain_mt );
      if( NIL != generic_example )
      {
        examples = ConsesLow.list( generic_example );
      }
    }
    return examples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 6043L)
  public static SubLObject rkf_all_predicate_specific_example_sentences(final SubLObject predicate, final SubLObject domain_mt)
  {
    return rkf_all_predicate_example_sentences_internal( predicate, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 6330L)
  public static SubLObject rkf_predicate_specific_example_sentence(final SubLObject predicate, final SubLObject domain_mt)
  {
    return rkf_all_predicate_specific_example_sentences( predicate, domain_mt ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 6597L)
  public static SubLObject rkf_predicate_generic_example_sentence(final SubLObject predicate, final SubLObject domain_mt)
  {
    return rkf_predicate_generic_example_sentence_internal( predicate, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 6855L)
  public static SubLObject rkf_domain_example_predicates_internal(final SubLObject topic, final SubLObject domain_mt)
  {
    final SubLObject predicates = backward.removal_ask_variable( $kw4$PREDICATE, $list5, domain_mt, UNPROVIDED, UNPROVIDED );
    SubLObject v_answer = NIL;
    SubLObject cdolist_list_var = predicates;
    SubLObject predicate = NIL;
    predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != fort_types_interface.predicateP( predicate ) )
      {
        v_answer = ConsesLow.cons( predicate, v_answer );
      }
      cdolist_list_var = cdolist_list_var.rest();
      predicate = cdolist_list_var.first();
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 7299L)
  public static SubLObject rkf_all_predicate_example_sentences_internal(final SubLObject predicate, final SubLObject domain_mt)
  {
    SubLObject candidate_sentences = backward.removal_ask_variable( $kw6$SENTENCE, ConsesLow.listS( $const7$domainExamplePredSentences, predicate, $list8 ), domain_mt, UNPROVIDED, UNPROVIDED );
    if( NIL == candidate_sentences )
    {
      candidate_sentences = backward.removal_ask_variable( $kw6$SENTENCE, ConsesLow.listS( $const9$examplePredSentences, predicate, $list8 ), domain_mt, UNPROVIDED, UNPROVIDED );
    }
    SubLObject example_sentences = NIL;
    SubLObject cdolist_list_var = candidate_sentences;
    SubLObject candidate_sentence = NIL;
    candidate_sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( predicate.eql( cycl_utilities.formula_operator( candidate_sentence ) ) )
      {
        example_sentences = ConsesLow.cons( candidate_sentence, example_sentences );
      }
      cdolist_list_var = cdolist_list_var.rest();
      candidate_sentence = cdolist_list_var.first();
    }
    return Sequences.nreverse( example_sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 8021L)
  public static SubLObject rkf_predicate_generic_example_sentence_internal(final SubLObject predicate, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject template = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw10$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym11$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          template = rkf_predicate_creator.generic_relation_template( predicate );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw10$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != template )
    {
      SubLObject cdotimes_end_var;
      SubLObject i;
      SubLObject arg;
      SubLObject collection;
      SubLObject constraint;
      SubLObject replacement;
      SubLObject pcase_var;
      for( cdotimes_end_var = el_utilities.formula_arity( template, UNPROVIDED ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        arg = Numbers.add( i, ONE_INTEGER );
        thread.resetMultipleValues();
        collection = relation_most_restricted_arg_constraint_memoized( predicate, arg, domain_mt );
        constraint = thread.secondMultipleValue();
        thread.resetMultipleValues();
        replacement = NIL;
        pcase_var = constraint;
        if( pcase_var.eql( $const12$argIsa ) )
        {
          replacement = rkf_generic_example_for_collection( collection );
        }
        else if( pcase_var.eql( $const13$argGenl ) )
        {
          replacement = rkf_generic_spec_for_collection( collection );
        }
        ConsesLow.set_nth( arg, template, replacement );
      }
    }
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 8821L)
  public static SubLObject rkf_generic_example_for_collection(final SubLObject collection)
  {
    if( NIL != el_utilities.specs_fn_naut_p( collection ) )
    {
      return rkf_generic_spec_for_collection( el_utilities.specs_fn_arg( collection ) );
    }
    return el_utilities.make_unary_formula( $const14$SomeExampleFn, collection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9068L)
  public static SubLObject rkf_generic_spec_for_collection(final SubLObject collection)
  {
    return el_utilities.make_unary_formula( $const15$SomeExampleSpecFn, collection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9193L)
  public static SubLObject rkf_generic_example_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != narts_high.naut_p( v_object ) && ( cycl_utilities.nat_functor( v_object ).eql( $const14$SomeExampleFn ) || cycl_utilities.nat_functor( v_object ).eql( $const15$SomeExampleSpecFn ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9379L)
  public static SubLObject rkf_generic_example_instance_level_p(final SubLObject generic_example)
  {
    assert NIL != rkf_generic_example_p( generic_example ) : generic_example;
    return Equality.eq( cycl_utilities.nat_functor( generic_example ), $const14$SomeExampleFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9566L)
  public static SubLObject relation_most_restricted_arg_constraint_memoized_internal(final SubLObject predicate, final SubLObject argnum, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    return relationship_generality_estimates.relation_most_restricted_arg_constraint( predicate, argnum, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9566L)
  public static SubLObject relation_most_restricted_arg_constraint_memoized(final SubLObject predicate, final SubLObject argnum, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return relation_most_restricted_arg_constraint_memoized_internal( predicate, argnum, domain_mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, THREE_INTEGER, NIL, EQL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( predicate, argnum, domain_mt );
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
        if( predicate.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( argnum.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && domain_mt.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( relation_most_restricted_arg_constraint_memoized_internal( predicate, argnum, domain_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( predicate, argnum, domain_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9855L)
  public static SubLObject min_arity_memoized_internal(final SubLObject relation)
  {
    return arity.min_arity( relation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9855L)
  public static SubLObject min_arity_memoized(final SubLObject relation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return min_arity_memoized_internal( relation );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym18$MIN_ARITY_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym18$MIN_ARITY_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym18$MIN_ARITY_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( min_arity_memoized_internal( relation ) ) );
      memoization_state.caching_state_put( caching_state, relation, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 9949L)
  public static SubLObject rkf_predicate_indicators(final SubLObject predicate, SubLObject generation_mt, SubLObject domain_mt)
  {
    if( generation_mt == UNPROVIDED )
    {
      generation_mt = NIL;
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject template = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw10$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym11$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          template = rkf_predicate_creator.generic_relation_template( predicate );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw10$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != template )
    {
      SubLObject generic_phrase = rkf_sentence_communicator.rkf_sentence_phrase( template, generation_mt, domain_mt, UNPROVIDED );
      SubLObject cdolist_list_var = cycl_utilities.formula_args( template, UNPROVIDED );
      SubLObject generic_arg = NIL;
      generic_arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject term_phrase = rkf_concept_communicator.rkf_term_phrase( generic_arg, generation_mt, domain_mt, UNPROVIDED, UNPROVIDED );
        generic_phrase = string_utilities.string_substitute( $str19$_, term_phrase, generic_phrase, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        generic_arg = cdolist_list_var.first();
      }
      final SubLObject tokens = rkf_concept_harvester.rkf_ch_raw_tokenization( generic_phrase );
      return tokens;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 10880L)
  public static SubLObject rkf_predicate_indicators_match_score(final SubLObject phrase, final SubLObject indicators)
  {
    final SubLObject phrase_tokens = rkf_ch_raw_tokenization_memoized( phrase );
    SubLObject score = ZERO_INTEGER;
    SubLObject cdolist_list_var = phrase_tokens;
    SubLObject phrase_token = NIL;
    phrase_token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Sequences.find( phrase_token, indicators, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        score = Numbers.add( score, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      phrase_token = cdolist_list_var.first();
    }
    return score;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 11165L)
  public static SubLObject rkf_ch_raw_tokenization_memoized_internal(final SubLObject string)
  {
    return rkf_concept_harvester.rkf_ch_raw_tokenization( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 11165L)
  public static SubLObject rkf_ch_raw_tokenization_memoized(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return rkf_ch_raw_tokenization_memoized_internal( string );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( rkf_ch_raw_tokenization_memoized_internal( string ) ) );
      memoization_state.caching_state_put( caching_state, string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 11285L)
  public static SubLObject rkf_predicate_suggestor_matches(final SubLObject v_term, final SubLObject domain_mt, SubLObject horizon)
  {
    if( horizon == UNPROVIDED )
    {
      horizon = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_isa = cardinality_estimates.sort_by_generality_estimate( isa.all_isa( v_term, domain_mt, UNPROVIDED ), $kw21$ASCENDING );
    SubLObject all_genls = ( NIL != subl_promotions.memberP( $const22$Collection, all_isa, UNPROVIDED, UNPROVIDED ) ) ? cardinality_estimates.sort_by_generality_estimate( genls.all_genls( v_term, domain_mt, UNPROVIDED ),
        $kw21$ASCENDING ) : NIL;
    if( NIL != horizon )
    {
      final SubLObject horizon_generality = cardinality_estimates.generality_estimate( horizon );
      all_isa = Sequences.delete( horizon_generality, all_isa, Symbols.symbol_function( $sym23$_ ), Symbols.symbol_function( $sym24$GENERALITY_ESTIMATE ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      all_genls = Sequences.delete( horizon_generality, all_genls, Symbols.symbol_function( $sym23$_ ), Symbols.symbol_function( $sym24$GENERALITY_ESTIMATE ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject matches = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym25$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( domain_mt, thread );
      if( NIL != all_isa )
      {
        final SubLObject constraint = $const12$argIsa;
        final SubLObject message = PrintLow.format( NIL, $str26$identifying__S_matches, constraint );
        final SubLObject list_var = all_isa;
        final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_note$.currentBinding( thread );
        final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_note$.bind( ( NIL != message ) ? message : $str27$cdolist, thread );
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
          utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
            SubLObject csome_list_var = list_var;
            SubLObject collection = NIL;
            collection = csome_list_var.first();
            while ( NIL != csome_list_var)
            {
              if( NIL != forts.fort_p( collection ) )
              {
                final SubLObject pred_var = constraint;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( collection, THREE_INTEGER, pred_var ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( collection, THREE_INTEGER, pred_var );
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw28$GAF, $kw29$TRUE, NIL );
                        SubLObject done_var_$4 = NIL;
                        final SubLObject token_var_$5 = NIL;
                        while ( NIL == done_var_$4)
                        {
                          final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                          final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( ass ) );
                          if( NIL != valid_$6 )
                          {
                            final SubLObject predicate = assertions_high.gaf_arg( ass, ONE_INTEGER );
                            final SubLObject argnum = assertions_high.gaf_arg( ass, TWO_INTEGER );
                            if( NIL != fort_types_interface.predicateP( predicate ) && NIL != at_admitted.admitted_argumentP( v_term, argnum, predicate, domain_mt ) )
                            {
                              thread.resetMultipleValues();
                              final SubLObject collection_$7 = relation_most_restricted_arg_constraint_memoized( predicate, argnum, domain_mt );
                              final SubLObject constraint_$8 = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              matches = ConsesLow.cons( ConsesLow.list( predicate, argnum, constraint_$8, collection_$7 ), matches );
                            }
                          }
                          done_var_$4 = makeBoolean( NIL == valid_$6 );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid );
                  }
                }
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              csome_list_var = csome_list_var.rest();
              collection = csome_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$3, thread );
          utilities_macros.$progress_note$.rebind( _prev_bind_0_$2, thread );
        }
      }
      if( NIL != all_genls )
      {
        final SubLObject constraint = $const13$argGenl;
        final SubLObject message = PrintLow.format( NIL, $str26$identifying__S_matches, constraint );
        final SubLObject list_var = all_genls;
        final SubLObject _prev_bind_0_$5 = utilities_macros.$progress_note$.currentBinding( thread );
        final SubLObject _prev_bind_1_$4 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_note$.bind( ( NIL != message ) ? message : $str27$cdolist, thread );
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
          utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
            SubLObject csome_list_var = list_var;
            SubLObject collection = NIL;
            collection = csome_list_var.first();
            while ( NIL != csome_list_var)
            {
              if( NIL != forts.fort_p( collection ) )
              {
                final SubLObject pred_var = constraint;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( collection, THREE_INTEGER, pred_var ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( collection, THREE_INTEGER, pred_var );
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw28$GAF, $kw29$TRUE, NIL );
                        SubLObject done_var_$5 = NIL;
                        final SubLObject token_var_$6 = NIL;
                        while ( NIL == done_var_$5)
                        {
                          final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                          final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( ass ) );
                          if( NIL != valid_$7 )
                          {
                            final SubLObject predicate = assertions_high.gaf_arg( ass, ONE_INTEGER );
                            final SubLObject argnum = assertions_high.gaf_arg( ass, TWO_INTEGER );
                            if( NIL != fort_types_interface.predicateP( predicate ) && NIL != at_admitted.admitted_argumentP( v_term, argnum, predicate, domain_mt ) )
                            {
                              thread.resetMultipleValues();
                              final SubLObject collection_$8 = relation_most_restricted_arg_constraint_memoized( predicate, argnum, domain_mt );
                              final SubLObject constraint_$9 = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              matches = ConsesLow.cons( ConsesLow.list( predicate, argnum, constraint_$9, collection_$8 ), matches );
                            }
                          }
                          done_var_$5 = makeBoolean( NIL == valid_$7 );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values3 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                          }
                          Values.restoreValuesFromVector( _values3 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid );
                  }
                }
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              csome_list_var = csome_list_var.rest();
              collection = csome_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values4 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values4 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$4, thread );
          utilities_macros.$progress_note$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    matches = list_utilities.fast_delete_duplicates( matches, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return matches;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 13908L)
  public static SubLObject rkf_predicate_selector_matches(final SubLObject v_term, final SubLObject domain_mt, final SubLObject predicates, SubLObject horizon)
  {
    if( horizon == UNPROVIDED )
    {
      horizon = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject horizon_generality_estimate = ( NIL != horizon ) ? cardinality_estimates.generality_estimate( horizon ) : NIL;
    SubLObject matches = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str30$identifying_matches, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( predicates ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = predicates;
        SubLObject predicate = NIL;
        predicate = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject v_arity = min_arity_memoized( predicate );
          if( NIL != v_arity )
          {
            SubLObject i;
            SubLObject argnum;
            SubLObject collection;
            SubLObject constraint;
            for( i = NIL, i = ZERO_INTEGER; i.numL( v_arity ); i = Numbers.add( i, ONE_INTEGER ) )
            {
              argnum = Numbers.add( ONE_INTEGER, i );
              if( NIL != at_admitted.admitted_argumentP( v_term, argnum, predicate, domain_mt ) )
              {
                thread.resetMultipleValues();
                collection = relation_most_restricted_arg_constraint_memoized( predicate, argnum, domain_mt );
                constraint = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL == horizon_generality_estimate || !cardinality_estimates.generality_estimate( collection ).numG( horizon_generality_estimate ) )
                {
                  matches = ConsesLow.cons( ConsesLow.list( predicate, argnum, constraint, collection ), matches );
                }
              }
            }
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          predicate = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return matches;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 15134L)
  public static SubLObject rkf_organize_predicate_matches_by_collection(SubLObject matches)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( matches ) : matches;
    matches = list_utilities.sort_via_position( matches, $list32, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym33$THIRD ) );
    matches = Sort.stable_sort( matches, Symbols.symbol_function( $sym23$_ ), Symbols.symbol_function( $sym34$SECOND ) );
    matches = Sort.stable_sort( matches, Symbols.symbol_function( $sym35$RELATION_GENERALITY_ESTIMATE_ ), Symbols.symbol_function( $sym36$FIRST ) );
    matches = Sort.stable_sort( matches, Symbols.symbol_function( $sym37$GENERALITY_ESTIMATE_ ), Symbols.symbol_function( $sym38$FOURTH ) );
    SubLObject last_match = $list39;
    SubLObject args = NIL;
    SubLObject preds = NIL;
    SubLObject cols = NIL;
    final SubLObject list_var = matches;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str40$organizing_matches, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject this_match = NIL;
        this_match = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = last_match;
          SubLObject last_pred = NIL;
          SubLObject last_arg = NIL;
          SubLObject last_constraint = NIL;
          SubLObject last_col = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
          last_pred = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
          last_arg = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
          last_constraint = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
          last_col = current.first();
          current = current.rest();
          if( NIL == current )
          {
            SubLObject current_$22;
            final SubLObject datum_$21 = current_$22 = this_match;
            SubLObject this_pred = NIL;
            SubLObject this_arg = NIL;
            SubLObject this_constraint = NIL;
            SubLObject this_col = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$22, datum_$21, $list42 );
            this_pred = current_$22.first();
            current_$22 = current_$22.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$22, datum_$21, $list42 );
            this_arg = current_$22.first();
            current_$22 = current_$22.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$22, datum_$21, $list42 );
            this_constraint = current_$22.first();
            current_$22 = current_$22.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$22, datum_$21, $list42 );
            this_col = current_$22.first();
            current_$22 = current_$22.rest();
            if( NIL == current_$22 )
            {
              if( last_col.equal( this_col ) )
              {
                if( last_pred.equal( this_pred ) )
                {
                  args = ConsesLow.cons( this_arg, args );
                }
                else
                {
                  args = Sequences.nreverse( args );
                  preds = ConsesLow.cons( ConsesLow.list( last_pred, args ), preds );
                  args = NIL;
                  args = ConsesLow.cons( this_arg, args );
                }
              }
              else
              {
                args = Sequences.nreverse( args );
                preds = ConsesLow.cons( ConsesLow.list( last_pred, args ), preds );
                args = NIL;
                preds = Sequences.nreverse( preds );
                cols = ConsesLow.cons( ConsesLow.list( last_col, preds ), cols );
                preds = NIL;
                args = ConsesLow.cons( this_arg, args );
              }
              last_match = this_match;
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$21, $list42 );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          this_match = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    SubLObject current2;
    final SubLObject datum2 = current2 = last_match;
    SubLObject last_pred2 = NIL;
    SubLObject last_arg2 = NIL;
    SubLObject last_constraint2 = NIL;
    SubLObject last_col2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list41 );
    last_pred2 = current2.first();
    current2 = current2.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list41 );
    last_arg2 = current2.first();
    current2 = current2.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list41 );
    last_constraint2 = current2.first();
    current2 = current2.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list41 );
    last_col2 = current2.first();
    current2 = current2.rest();
    if( NIL == current2 )
    {
      args = Sequences.nreverse( args );
      preds = ConsesLow.cons( ConsesLow.list( last_pred2, args ), preds );
      args = NIL;
      preds = Sequences.nreverse( preds );
      cols = ConsesLow.cons( ConsesLow.list( last_col2, preds ), cols );
      preds = NIL;
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum2, $list41 );
    }
    cols = Sequences.nreverse( cols );
    return cols.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 17573L)
  public static SubLObject rkf_organize_predicate_matches_by_mt(final SubLObject matches)
  {
    SubLObject predicates = NIL;
    SubLObject cdolist_list_var = matches;
    SubLObject match = NIL;
    match = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      predicates = ConsesLow.cons( match.first(), predicates );
      cdolist_list_var = cdolist_list_var.rest();
      match = cdolist_list_var.first();
    }
    predicates = list_utilities.fast_delete_duplicates( predicates, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return rkf_organize_predicates_by_mt( predicates );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 17848L)
  public static SubLObject rkf_organize_predicates_by_specificity_to_term(final SubLObject predicates, final SubLObject v_term, final SubLObject domain_mt)
  {
    final SubLObject matches = rkf_predicate_selector_matches( v_term, domain_mt, predicates, UNPROVIDED );
    final SubLObject match_sections = rkf_organize_predicate_matches_by_collection( matches );
    SubLObject v_answer = NIL;
    SubLObject cdolist_list_var = match_sections;
    SubLObject match_section = NIL;
    match_section = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = match_section;
      SubLObject collection = NIL;
      SubLObject match_predicate_sections = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
      collection = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
      match_predicate_sections = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject predicates_$24 = NIL;
        SubLObject cdolist_list_var_$25 = match_predicate_sections;
        SubLObject match_predicate_section = NIL;
        match_predicate_section = cdolist_list_var_$25.first();
        while ( NIL != cdolist_list_var_$25)
        {
          SubLObject current_$27;
          final SubLObject datum_$26 = current_$27 = match_predicate_section;
          SubLObject predicate = NIL;
          SubLObject argnum_list = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$27, datum_$26, $list44 );
          predicate = current_$27.first();
          current_$27 = current_$27.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$27, datum_$26, $list44 );
          argnum_list = current_$27.first();
          current_$27 = current_$27.rest();
          if( NIL == current_$27 )
          {
            predicates_$24 = ConsesLow.cons( predicate, predicates_$24 );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum_$26, $list44 );
          }
          cdolist_list_var_$25 = cdolist_list_var_$25.rest();
          match_predicate_section = cdolist_list_var_$25.first();
        }
        predicates_$24 = list_utilities.fast_delete_duplicates( predicates_$24, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        predicates_$24 = Sort.sort( predicates_$24, Symbols.symbol_function( $sym23$_ ), Symbols.symbol_function( $sym45$RELATION_GENERALITY_ESTIMATE ) );
        v_answer = ConsesLow.cons( ConsesLow.list( collection, predicates_$24 ), v_answer );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list43 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      match_section = cdolist_list_var.first();
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 19083L)
  public static SubLObject rkf_organize_predicates_by_specificity_of_args(final SubLObject predicates, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject answer_table = Hashtables.make_hash_table( Sequences.length( predicates ), UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str46$categorizing_predicates, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( predicates ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = predicates;
        SubLObject predicate = NIL;
        predicate = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject argnum = relationship_generality_estimates.relation_most_restricted_arg( predicate );
          thread.resetMultipleValues();
          final SubLObject collection = relation_most_restricted_arg_constraint_memoized( predicate, argnum, domain_mt );
          final SubLObject constraint = thread.secondMultipleValue();
          thread.resetMultipleValues();
          Hashtables.sethash( collection, answer_table, ConsesLow.cons( predicate, Hashtables.gethash( collection, answer_table, NIL ) ) );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          predicate = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    SubLObject v_answer = NIL;
    final SubLObject table_var = answer_table;
    final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str47$sorting_predicates, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject collection2 = NIL;
        SubLObject predicates_$29 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            collection2 = Hashtables.getEntryKey( cdohash_entry );
            predicates_$29 = Hashtables.getEntryValue( cdohash_entry );
            predicates_$29 = Sort.sort( predicates_$29, Symbols.symbol_function( $sym23$_ ), Symbols.symbol_function( $sym45$RELATION_GENERALITY_ESTIMATE ) );
            v_answer = ConsesLow.cons( ConsesLow.list( collection2, predicates_$29 ), v_answer );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_16, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_15, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_14, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_13, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_12, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_11, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_10, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_9, thread );
    }
    v_answer = Sort.sort( v_answer, Symbols.symbol_function( $sym37$GENERALITY_ESTIMATE_ ), Symbols.symbol_function( $sym36$FIRST ) );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 20185L)
  public static SubLObject rkf_organize_predicates_by_mt(final SubLObject predicates)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject answer_table = Hashtables.make_hash_table( Sequences.length( predicates ), UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str46$categorizing_predicates, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( predicates ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = predicates;
        SubLObject predicate = NIL;
        predicate = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject defining_mt = rkf_relation_defining_mts( predicate ).first();
          Hashtables.sethash( defining_mt, answer_table, ConsesLow.cons( predicate, Hashtables.gethash( defining_mt, answer_table, NIL ) ) );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          predicate = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    SubLObject v_answer = NIL;
    final SubLObject table_var = answer_table;
    final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str47$sorting_predicates, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject defining_mt = NIL;
        SubLObject predicates_$32 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            defining_mt = Hashtables.getEntryKey( cdohash_entry );
            predicates_$32 = Hashtables.getEntryValue( cdohash_entry );
            predicates_$32 = Sort.sort( predicates_$32, Symbols.symbol_function( $sym23$_ ), Symbols.symbol_function( $sym45$RELATION_GENERALITY_ESTIMATE ) );
            v_answer = ConsesLow.cons( ConsesLow.list( defining_mt, predicates_$32 ), v_answer );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_16, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_15, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_14, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_13, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_12, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_11, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_10, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_9, thread );
    }
    v_answer = Sort.sort( v_answer, Symbols.symbol_function( $sym37$GENERALITY_ESTIMATE_ ), Symbols.symbol_function( $sym36$FIRST ) );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 21115L)
  public static SubLObject rkf_relation_defining_mts(final SubLObject relation)
  {
    return isa.max_floor_mts_of_isa_paths( relation, $const48$Relation, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 21227L)
  public static SubLObject rkf_organize_predicates_by_similarity(final SubLObject predicates, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject answer_table = Hashtables.make_hash_table( Sequences.length( predicates ), UNPROVIDED, UNPROVIDED );
    SubLObject self_tops = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str46$categorizing_predicates, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( predicates ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = predicates;
        SubLObject predicate = NIL;
        predicate = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject genl_pred = rkf_ontology_utilities.rkf_predicate_tops( predicate, domain_mt ).first();
          if( predicate.eql( genl_pred ) )
          {
            self_tops = ConsesLow.cons( predicate, self_tops );
          }
          else
          {
            Hashtables.sethash( genl_pred, answer_table, ConsesLow.cons( predicate, Hashtables.gethash( genl_pred, answer_table, NIL ) ) );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          predicate = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    SubLObject v_answer = NIL;
    final SubLObject table_var = answer_table;
    final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str47$sorting_predicates, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Hashtables.hash_table_count( table_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject genl_pred = NIL;
        SubLObject predicates_$35 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table_var );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            genl_pred = Hashtables.getEntryKey( cdohash_entry );
            predicates_$35 = Hashtables.getEntryValue( cdohash_entry );
            predicates_$35 = Sort.sort( predicates_$35, Symbols.symbol_function( $sym23$_ ), Symbols.symbol_function( $sym45$RELATION_GENERALITY_ESTIMATE ) );
            v_answer = ConsesLow.cons( ConsesLow.list( genl_pred, predicates_$35 ), v_answer );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_16, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_15, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_14, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_13, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_12, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_11, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_10, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_9, thread );
    }
    v_answer = Sort.sort( v_answer, Symbols.symbol_function( $sym35$RELATION_GENERALITY_ESTIMATE_ ), Symbols.symbol_function( $sym36$FIRST ) );
    self_tops = Sort.sort( self_tops, Symbols.symbol_function( $sym23$_ ), Symbols.symbol_function( $sym45$RELATION_GENERALITY_ESTIMATE ) );
    final SubLObject section_key = $str49$Other_predicates;
    final SubLObject self_top_section = ConsesLow.list( section_key, self_tops );
    ConsesLow.rplacd( conses_high.last( v_answer, UNPROVIDED ), ConsesLow.list( self_top_section ) );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 22687L)
  public static SubLObject rkf_sentence_has_variations(final SubLObject sentence, final SubLObject domain_mt)
  {
    final SubLObject predicate = cycl_utilities.formula_operator( sentence );
    if( NIL != forts.fort_p( predicate ) && NIL != fort_types_interface.predicateP( predicate ) && NIL != arity.binaryP( predicate ) )
    {
      return makeBoolean( NIL != rkf_example_type_variation_for_arg( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), predicate, ONE_INTEGER, domain_mt ) || NIL != rkf_example_type_variation_for_arg( cycl_utilities
          .sentence_arg2( sentence, UNPROVIDED ), predicate, TWO_INTEGER, domain_mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 23373L)
  public static SubLObject rkf_sentence_variations(final SubLObject sentence, final SubLObject domain_mt)
  {
    return rkf_sentence_variations_internal( sentence, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 23563L)
  public static SubLObject rkf_sentence_variations_internal(final SubLObject sentence, final SubLObject domain_mt)
  {
    final SubLObject variations = ConsesLow.nconc( rkf_sentence_variations_type_type( sentence, domain_mt ), rkf_sentence_variations_type_instance( sentence, domain_mt ), rkf_sentence_variations_instance_type( sentence,
        domain_mt ) );
    return variations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 23888L)
  public static SubLObject rkf_sentence_variations_type_type(final SubLObject sentence, final SubLObject domain_mt)
  {
    final SubLObject predicate = cycl_utilities.formula_operator( sentence );
    final SubLObject arg_1_variation = rkf_example_type_variation_for_arg( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), predicate, ONE_INTEGER, domain_mt );
    final SubLObject arg_2_variation = rkf_example_type_variation_for_arg( cycl_utilities.sentence_arg2( sentence, UNPROVIDED ), predicate, TWO_INTEGER, domain_mt );
    if( NIL != arg_1_variation && NIL != arg_2_variation )
    {
      final SubLObject rule_macro_predicates = rkf_rule_macro_type_instances( $const50$TypeTypeTernaryRuleMacroPredicate, domain_mt );
      SubLObject variations = NIL;
      SubLObject cdolist_list_var = rule_macro_predicates;
      SubLObject rule_macro_predicate = NIL;
      rule_macro_predicate = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject variation = el_utilities.make_ternary_formula( rule_macro_predicate, predicate, arg_1_variation, arg_2_variation );
        variations = ConsesLow.cons( variation, variations );
        cdolist_list_var = cdolist_list_var.rest();
        rule_macro_predicate = cdolist_list_var.first();
      }
      variations = Sequences.nreverse( variations );
      return variations;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 24711L)
  public static SubLObject rkf_sentence_variations_type_instance(final SubLObject sentence, final SubLObject domain_mt)
  {
    final SubLObject predicate = cycl_utilities.formula_operator( sentence );
    final SubLObject arg_1_variation = rkf_example_type_variation_for_arg( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), predicate, ONE_INTEGER, domain_mt );
    final SubLObject arg_2_variation = rkf_example_instance_variation_for_arg( cycl_utilities.sentence_arg2( sentence, UNPROVIDED ), predicate, TWO_INTEGER, domain_mt );
    if( NIL != arg_1_variation && NIL != arg_2_variation )
    {
      final SubLObject rule_macro_predicates = rkf_rule_macro_type_instances( $const51$TypeInstanceTernaryRuleMacroPredi, domain_mt );
      SubLObject variations = NIL;
      SubLObject cdolist_list_var = rule_macro_predicates;
      SubLObject rule_macro_predicate = NIL;
      rule_macro_predicate = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject variation = el_utilities.make_ternary_formula( rule_macro_predicate, predicate, arg_1_variation, arg_2_variation );
        variations = ConsesLow.cons( variation, variations );
        cdolist_list_var = cdolist_list_var.rest();
        rule_macro_predicate = cdolist_list_var.first();
      }
      variations = Sequences.nreverse( variations );
      return variations;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 25546L)
  public static SubLObject rkf_sentence_variations_instance_type(final SubLObject sentence, final SubLObject domain_mt)
  {
    final SubLObject predicate = cycl_utilities.formula_operator( sentence );
    final SubLObject arg_1_variation = rkf_example_instance_variation_for_arg( cycl_utilities.sentence_arg1( sentence, UNPROVIDED ), predicate, ONE_INTEGER, domain_mt );
    final SubLObject arg_2_variation = rkf_example_type_variation_for_arg( cycl_utilities.sentence_arg2( sentence, UNPROVIDED ), predicate, TWO_INTEGER, domain_mt );
    if( NIL != arg_1_variation && NIL != arg_2_variation )
    {
      final SubLObject rule_macro_predicates = rkf_rule_macro_type_instances( $const52$InstanceTypeTernaryRuleMacroPredi, domain_mt );
      SubLObject variations = NIL;
      SubLObject cdolist_list_var = rule_macro_predicates;
      SubLObject rule_macro_predicate = NIL;
      rule_macro_predicate = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject variation = el_utilities.make_ternary_formula( rule_macro_predicate, predicate, arg_1_variation, arg_2_variation );
        variations = ConsesLow.cons( variation, variations );
        cdolist_list_var = cdolist_list_var.rest();
        rule_macro_predicate = cdolist_list_var.first();
      }
      variations = Sequences.nreverse( variations );
      return variations;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26381L)
  public static SubLObject rkf_example_instance_variation_for_arg(final SubLObject example, final SubLObject predicate, final SubLObject arg, final SubLObject domain_mt)
  {
    return example;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26569L)
  public static SubLObject rkf_example_type_variation_for_arg(final SubLObject example, final SubLObject predicate, final SubLObject arg, final SubLObject domain_mt)
  {
    if( NIL != isa.isa_in_any_mtP( example, $const22$Collection ) )
    {
      return NIL;
    }
    final SubLObject min_isas = rkf_ontology_utilities.rkf_min_isa( example, domain_mt );
    return min_isas.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26996L)
  public static SubLObject clear_rkf_min_arg_n_isa()
  {
    final SubLObject cs = $rkf_min_arg_n_isa_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26996L)
  public static SubLObject remove_rkf_min_arg_n_isa(final SubLObject relation, final SubLObject n, final SubLObject domain_mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rkf_min_arg_n_isa_caching_state$.getGlobalValue(), ConsesLow.list( relation, n, domain_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26996L)
  public static SubLObject rkf_min_arg_n_isa_internal(final SubLObject relation, final SubLObject n, final SubLObject domain_mt)
  {
    SubLObject constraints = kb_accessors.min_argn_isa( relation, n, domain_mt );
    constraints = cardinality_estimates.sort_by_generality_estimate( constraints, $kw21$ASCENDING );
    return constraints.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 26996L)
  public static SubLObject rkf_min_arg_n_isa(final SubLObject relation, final SubLObject n, final SubLObject domain_mt)
  {
    SubLObject caching_state = $rkf_min_arg_n_isa_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym53$RKF_MIN_ARG_N_ISA, $sym54$_RKF_MIN_ARG_N_ISA_CACHING_STATE_, NIL, EQL, THREE_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( relation, n, domain_mt );
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
          if( n.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && domain_mt.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rkf_min_arg_n_isa_internal( relation, n, domain_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( relation, n, domain_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27258L)
  public static SubLObject clear_rkf_min_arg_n_genl()
  {
    final SubLObject cs = $rkf_min_arg_n_genl_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27258L)
  public static SubLObject remove_rkf_min_arg_n_genl(final SubLObject relation, final SubLObject n, final SubLObject domain_mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rkf_min_arg_n_genl_caching_state$.getGlobalValue(), ConsesLow.list( relation, n, domain_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27258L)
  public static SubLObject rkf_min_arg_n_genl_internal(final SubLObject relation, final SubLObject n, final SubLObject domain_mt)
  {
    SubLObject constraints = kb_accessors.min_argn_genl( relation, n, domain_mt );
    constraints = cardinality_estimates.sort_by_generality_estimate( constraints, $kw21$ASCENDING );
    return constraints.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27258L)
  public static SubLObject rkf_min_arg_n_genl(final SubLObject relation, final SubLObject n, final SubLObject domain_mt)
  {
    SubLObject caching_state = $rkf_min_arg_n_genl_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym55$RKF_MIN_ARG_N_GENL, $sym56$_RKF_MIN_ARG_N_GENL_CACHING_STATE_, NIL, EQL, THREE_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( relation, n, domain_mt );
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
          if( n.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && domain_mt.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rkf_min_arg_n_genl_internal( relation, n, domain_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( relation, n, domain_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-domain-examples.lisp", position = 27506L)
  public static SubLObject rkf_rule_macro_type_instances(final SubLObject rule_macro_type, final SubLObject domain_mt)
  {
    SubLObject predicates = isa.all_fort_instances( rule_macro_type, domain_mt, UNPROVIDED );
    predicates = rkf_relevance_utilities.rkf_filter_irrelevant_terms( predicates, domain_mt );
    predicates = Sort.sort( predicates, Symbols.symbol_function( $sym57$_ ), Symbols.symbol_function( $sym58$NUM_PREDICATE_EXTENT_INDEX ) );
    return predicates;
  }

  public static SubLObject declare_rkf_domain_examples_file()
  {
    SubLFiles.declareFunction( me, "rkf_salient_spec_predicateP", "RKF-SALIENT-SPEC-PREDICATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_spec_predicate_memoized_internal", "RKF-SALIENT-SPEC-PREDICATE-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_spec_predicate_memoized", "RKF-SALIENT-SPEC-PREDICATE-MEMOIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_spec_predicate_internal", "RKF-SALIENT-SPEC-PREDICATE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_build_spec_predicate_graph", "RKF-BUILD-SPEC-PREDICATE-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_build_spec_predicate_graph_memoized_internal", "RKF-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_build_spec_predicate_graph_memoized", "RKF-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_build_spec_predicate_graph_internal", "RKF-BUILD-SPEC-PREDICATE-GRAPH-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_interpret_spec_predicate_graph", "RKF-INTERPRET-SPEC-PREDICATE-GRAPH", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_add_to_spec_predicate_graph", "RKF-ADD-TO-SPEC-PREDICATE-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_extend_spec_predicate_graph_entry", "RKF-EXTEND-SPEC-PREDICATE-GRAPH-ENTRY", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_obtain_spec_predicate_sub_graph", "RKF-OBTAIN-SPEC-PREDICATE-SUB-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_count_spec_predicate_sub_graphs", "RKF-COUNT-SPEC-PREDICATE-SUB-GRAPHS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_domain_example_predicates", "RKF-DOMAIN-EXAMPLE-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_predicate_example_sentence", "RKF-PREDICATE-EXAMPLE-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_all_predicate_example_sentences", "RKF-ALL-PREDICATE-EXAMPLE-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_all_predicate_specific_example_sentences", "RKF-ALL-PREDICATE-SPECIFIC-EXAMPLE-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_predicate_specific_example_sentence", "RKF-PREDICATE-SPECIFIC-EXAMPLE-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_predicate_generic_example_sentence", "RKF-PREDICATE-GENERIC-EXAMPLE-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_domain_example_predicates_internal", "RKF-DOMAIN-EXAMPLE-PREDICATES-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_all_predicate_example_sentences_internal", "RKF-ALL-PREDICATE-EXAMPLE-SENTENCES-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_predicate_generic_example_sentence_internal", "RKF-PREDICATE-GENERIC-EXAMPLE-SENTENCE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_generic_example_for_collection", "RKF-GENERIC-EXAMPLE-FOR-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_generic_spec_for_collection", "RKF-GENERIC-SPEC-FOR-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_generic_example_p", "RKF-GENERIC-EXAMPLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_generic_example_instance_level_p", "RKF-GENERIC-EXAMPLE-INSTANCE-LEVEL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "relation_most_restricted_arg_constraint_memoized_internal", "RELATION-MOST-RESTRICTED-ARG-CONSTRAINT-MEMOIZED-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "relation_most_restricted_arg_constraint_memoized", "RELATION-MOST-RESTRICTED-ARG-CONSTRAINT-MEMOIZED", 2, 1, false );
    SubLFiles.declareFunction( me, "min_arity_memoized_internal", "MIN-ARITY-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "min_arity_memoized", "MIN-ARITY-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_predicate_indicators", "RKF-PREDICATE-INDICATORS", 1, 2, false );
    SubLFiles.declareFunction( me, "rkf_predicate_indicators_match_score", "RKF-PREDICATE-INDICATORS-MATCH-SCORE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_raw_tokenization_memoized_internal", "RKF-CH-RAW-TOKENIZATION-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_raw_tokenization_memoized", "RKF-CH-RAW-TOKENIZATION-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_predicate_suggestor_matches", "RKF-PREDICATE-SUGGESTOR-MATCHES", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_predicate_selector_matches", "RKF-PREDICATE-SELECTOR-MATCHES", 3, 1, false );
    SubLFiles.declareFunction( me, "rkf_organize_predicate_matches_by_collection", "RKF-ORGANIZE-PREDICATE-MATCHES-BY-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_organize_predicate_matches_by_mt", "RKF-ORGANIZE-PREDICATE-MATCHES-BY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_organize_predicates_by_specificity_to_term", "RKF-ORGANIZE-PREDICATES-BY-SPECIFICITY-TO-TERM", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_organize_predicates_by_specificity_of_args", "RKF-ORGANIZE-PREDICATES-BY-SPECIFICITY-OF-ARGS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_organize_predicates_by_mt", "RKF-ORGANIZE-PREDICATES-BY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_relation_defining_mts", "RKF-RELATION-DEFINING-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_organize_predicates_by_similarity", "RKF-ORGANIZE-PREDICATES-BY-SIMILARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sentence_has_variations", "RKF-SENTENCE-HAS-VARIATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sentence_variations", "RKF-SENTENCE-VARIATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sentence_variations_internal", "RKF-SENTENCE-VARIATIONS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sentence_variations_type_type", "RKF-SENTENCE-VARIATIONS-TYPE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sentence_variations_type_instance", "RKF-SENTENCE-VARIATIONS-TYPE-INSTANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_sentence_variations_instance_type", "RKF-SENTENCE-VARIATIONS-INSTANCE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_example_instance_variation_for_arg", "RKF-EXAMPLE-INSTANCE-VARIATION-FOR-ARG", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_example_type_variation_for_arg", "RKF-EXAMPLE-TYPE-VARIATION-FOR-ARG", 4, 0, false );
    SubLFiles.declareFunction( me, "clear_rkf_min_arg_n_isa", "CLEAR-RKF-MIN-ARG-N-ISA", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rkf_min_arg_n_isa", "REMOVE-RKF-MIN-ARG-N-ISA", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_min_arg_n_isa_internal", "RKF-MIN-ARG-N-ISA-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_min_arg_n_isa", "RKF-MIN-ARG-N-ISA", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_rkf_min_arg_n_genl", "CLEAR-RKF-MIN-ARG-N-GENL", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rkf_min_arg_n_genl", "REMOVE-RKF-MIN-ARG-N-GENL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_min_arg_n_genl_internal", "RKF-MIN-ARG-N-GENL-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_min_arg_n_genl", "RKF-MIN-ARG-N-GENL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_rule_macro_type_instances", "RKF-RULE-MACRO-TYPE-INSTANCES", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_domain_examples_file()
  {
    $rkf_min_arg_n_isa_caching_state$ = SubLFiles.deflexical( "*RKF-MIN-ARG-N-ISA-CACHING-STATE*", NIL );
    $rkf_min_arg_n_genl_caching_state$ = SubLFiles.deflexical( "*RKF-MIN-ARG-N-GENL-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_rkf_domain_examples_file()
  {
    memoization_state.note_memoized_function( $sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED );
    memoization_state.note_memoized_function( $sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED );
    memoization_state.note_memoized_function( $sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED );
    memoization_state.note_memoized_function( $sym18$MIN_ARITY_MEMOIZED );
    memoization_state.note_memoized_function( $sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED );
    memoization_state.note_globally_cached_function( $sym53$RKF_MIN_ARG_N_ISA );
    memoization_state.note_globally_cached_function( $sym55$RKF_MIN_ARG_N_GENL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_domain_examples_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_domain_examples_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_domain_examples_file();
  }
  static
  {
    me = new rkf_domain_examples();
    $rkf_min_arg_n_isa_caching_state$ = null;
    $rkf_min_arg_n_genl_caching_state$ = null;
    $sym0$RKF_SALIENT_SPEC_PREDICATE_MEMOIZED = makeSymbol( "RKF-SALIENT-SPEC-PREDICATE-MEMOIZED" );
    $const1$keSalientSpecPredicate = constant_handles.reader_make_constant_shell( makeString( "keSalientSpecPredicate" ) );
    $sym2$RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED = makeSymbol( "RKF-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED" );
    $kw3$NODE = makeKeyword( "NODE" );
    $kw4$PREDICATE = makeKeyword( "PREDICATE" );
    $list5 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "keSalientPredicate" ) ), makeKeyword( "PREDICATE" ) );
    $kw6$SENTENCE = makeKeyword( "SENTENCE" );
    $const7$domainExamplePredSentences = constant_handles.reader_make_constant_shell( makeString( "domainExamplePredSentences" ) );
    $list8 = ConsesLow.list( makeKeyword( "SENTENCE" ) );
    $const9$examplePredSentences = constant_handles.reader_make_constant_shell( makeString( "examplePredSentences" ) );
    $kw10$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym11$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $const12$argIsa = constant_handles.reader_make_constant_shell( makeString( "argIsa" ) );
    $const13$argGenl = constant_handles.reader_make_constant_shell( makeString( "argGenl" ) );
    $const14$SomeExampleFn = constant_handles.reader_make_constant_shell( makeString( "SomeExampleFn" ) );
    $const15$SomeExampleSpecFn = constant_handles.reader_make_constant_shell( makeString( "SomeExampleSpecFn" ) );
    $sym16$RKF_GENERIC_EXAMPLE_P = makeSymbol( "RKF-GENERIC-EXAMPLE-P" );
    $sym17$RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED = makeSymbol( "RELATION-MOST-RESTRICTED-ARG-CONSTRAINT-MEMOIZED" );
    $sym18$MIN_ARITY_MEMOIZED = makeSymbol( "MIN-ARITY-MEMOIZED" );
    $str19$_ = makeString( " " );
    $sym20$RKF_CH_RAW_TOKENIZATION_MEMOIZED = makeSymbol( "RKF-CH-RAW-TOKENIZATION-MEMOIZED" );
    $kw21$ASCENDING = makeKeyword( "ASCENDING" );
    $const22$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $sym23$_ = makeSymbol( "<" );
    $sym24$GENERALITY_ESTIMATE = makeSymbol( "GENERALITY-ESTIMATE" );
    $sym25$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $str26$identifying__S_matches = makeString( "identifying ~S matches" );
    $str27$cdolist = makeString( "cdolist" );
    $kw28$GAF = makeKeyword( "GAF" );
    $kw29$TRUE = makeKeyword( "TRUE" );
    $str30$identifying_matches = makeString( "identifying matches" );
    $sym31$LISTP = makeSymbol( "LISTP" );
    $list32 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "argGenl" ) ) );
    $sym33$THIRD = makeSymbol( "THIRD" );
    $sym34$SECOND = makeSymbol( "SECOND" );
    $sym35$RELATION_GENERALITY_ESTIMATE_ = makeSymbol( "RELATION-GENERALITY-ESTIMATE<" );
    $sym36$FIRST = makeSymbol( "FIRST" );
    $sym37$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE<" );
    $sym38$FOURTH = makeSymbol( "FOURTH" );
    $list39 = ConsesLow.list( NIL, NIL, NIL, NIL );
    $str40$organizing_matches = makeString( "organizing matches" );
    $list41 = ConsesLow.list( makeSymbol( "LAST-PRED" ), makeSymbol( "LAST-ARG" ), makeSymbol( "LAST-CONSTRAINT" ), makeSymbol( "LAST-COL" ) );
    $list42 = ConsesLow.list( makeSymbol( "THIS-PRED" ), makeSymbol( "THIS-ARG" ), makeSymbol( "THIS-CONSTRAINT" ), makeSymbol( "THIS-COL" ) );
    $list43 = ConsesLow.list( makeSymbol( "COLLECTION" ), makeSymbol( "MATCH-PREDICATE-SECTIONS" ) );
    $list44 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "ARGNUM-LIST" ) );
    $sym45$RELATION_GENERALITY_ESTIMATE = makeSymbol( "RELATION-GENERALITY-ESTIMATE" );
    $str46$categorizing_predicates = makeString( "categorizing predicates" );
    $str47$sorting_predicates = makeString( "sorting predicates" );
    $const48$Relation = constant_handles.reader_make_constant_shell( makeString( "Relation" ) );
    $str49$Other_predicates = makeString( "Other predicates" );
    $const50$TypeTypeTernaryRuleMacroPredicate = constant_handles.reader_make_constant_shell( makeString( "TypeTypeTernaryRuleMacroPredicate" ) );
    $const51$TypeInstanceTernaryRuleMacroPredi = constant_handles.reader_make_constant_shell( makeString( "TypeInstanceTernaryRuleMacroPredicate" ) );
    $const52$InstanceTypeTernaryRuleMacroPredi = constant_handles.reader_make_constant_shell( makeString( "InstanceTypeTernaryRuleMacroPredicate" ) );
    $sym53$RKF_MIN_ARG_N_ISA = makeSymbol( "RKF-MIN-ARG-N-ISA" );
    $sym54$_RKF_MIN_ARG_N_ISA_CACHING_STATE_ = makeSymbol( "*RKF-MIN-ARG-N-ISA-CACHING-STATE*" );
    $sym55$RKF_MIN_ARG_N_GENL = makeSymbol( "RKF-MIN-ARG-N-GENL" );
    $sym56$_RKF_MIN_ARG_N_GENL_CACHING_STATE_ = makeSymbol( "*RKF-MIN-ARG-N-GENL-CACHING-STATE*" );
    $sym57$_ = makeSymbol( ">" );
    $sym58$NUM_PREDICATE_EXTENT_INDEX = makeSymbol( "NUM-PREDICATE-EXTENT-INDEX" );
  }
}
/*
 * 
 * Total time: 730 ms
 * 
 */