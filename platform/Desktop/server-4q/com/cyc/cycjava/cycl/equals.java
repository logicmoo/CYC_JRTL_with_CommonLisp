package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class equals
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.equals";
  public static final String myFingerPrint = "3a53b0d8f2e543b36e4e0b27c43615087ccf9c52a11807459c4484ab581fb799";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6384L)
  private static SubLSymbol $preferred_rewrite_term_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6759L)
  public static SubLSymbol $preferred_rewrite_term_max_recursion_depth$;
  private static final SubLObject $const0$equals;
  private static final SubLSymbol $kw1$REFLEXIVE;
  private static final SubLObject $const2$InferencePSC;
  private static final SubLSymbol $sym3$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_;
  private static final SubLSymbol $sym4$OPAQUE_ARG_WRT_QUOTING_;
  private static final SubLObject $const5$BaseKB;
  private static final SubLSymbol $sym6$HAS_PREFERRED_REWRITE_TERM_;
  private static final SubLSymbol $sym7$PREFERRED_REWRITE_TERM;
  private static final SubLSymbol $sym8$_PREFERRED_REWRITE_TERM_CACHING_STATE_;
  private static final SubLInteger $int9$128;
  private static final SubLSymbol $sym10$CLEAR_PREFERRED_REWRITE_TERM;
  private static final SubLSymbol $kw11$MAX_RECURSION_DEPTH_REACHED;
  private static final SubLObject $const12$rewriteOf;
  private static final SubLSymbol $kw13$PREFERRED_TERM_NOT_FOUND;
  private static final SubLSymbol $kw14$TOO_MANY_PREFERRED_TERMS_FOUND;
  private static final SubLSymbol $kw15$REWRITE_CYCLE_DETECTED;
  private static final SubLSymbol $sym16$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym17$FORT_P;
  private static final SubLObject $const18$different;
  private static final SubLSymbol $kw19$TRUE;
  private static final SubLSymbol $kw20$FALSE;
  private static final SubLSymbol $kw21$OPAQUE;
  private static final SubLSymbol $kw22$ISA;
  private static final SubLObject $const23$isa;
  private static final SubLSymbol $kw24$DISJOINTWITH;
  private static final SubLObject $const25$disjointWith;
  private static final SubLObject $const26$TermExemptFromUniqueNamesAssumpti;
  private static final SubLSymbol $kw27$IGNORE;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 710L)
  public static SubLObject all_equals(final SubLObject obj, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return ghl_search_methods.ghl_closure( $const0$equals, obj, ghl_search_vars.ghl_forward_direction(), mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 879L)
  public static SubLObject equalsP(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( obj1.equal( obj2 ) )
    {
      return T;
    }
    if( NIL != forts.fort_p( obj1 ) )
    {
      if( NIL != forts.fort_p( obj2 ) )
      {
        return equal_fortsP( obj1, obj2, mt, tv );
      }
      return equal_fortP( obj1, obj2, mt, tv );
    }
    else
    {
      if( NIL != forts.fort_p( obj2 ) )
      {
        return equal_fortP( obj2, obj1, mt, tv );
      }
      return equal_nautP( obj1, obj2, mt, tv );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1210L)
  public static SubLObject why_equals(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( obj1.equal( obj2 ) )
    {
      return ConsesLow.list( arguments.make_hl_support( $kw1$REFLEXIVE, el_utilities.make_binary_formula( $const0$equals, obj1, obj2 ), mt_vars.$equals_defining_mt$.getGlobalValue(), UNPROVIDED ) );
    }
    if( NIL != forts.fort_p( obj1 ) )
    {
      return ghl_search_methods.why_gt_predicate_relation_p( $const0$equals, obj1, obj2, mt, tv );
    }
    if( NIL != forts.fort_p( obj2 ) )
    {
      return ghl_search_methods.why_gt_predicate_relation_p( $const0$equals, obj2, obj1, mt, tv );
    }
    return ghl_search_methods.why_gt_predicate_relation_p( $const0$equals, obj1, obj2, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1637L)
  public static SubLObject not_equalsP(final SubLObject obj1, final SubLObject obj2, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    return makeBoolean( NIL == equalsP( obj1, obj2, mt, tv ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1735L)
  public static SubLObject equal_fortP(final SubLObject fort, final SubLObject non_fort, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != control_vars.$perform_equals_unification$.getDynamicValue( thread ) && NIL == cycl_grammar.meta_variable_p( non_fort ) && NIL != equality_store.some_equality_assertionsP( fort, UNPROVIDED ) )
    {
      ans = ghl_search_methods.gt_predicate_relation_p( $const0$equals, fort, non_fort, mt, tv, UNPROVIDED );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2208L)
  public static SubLObject equal_fortsP(final SubLObject fort1, final SubLObject fort2, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != control_vars.$perform_equals_unification$.getDynamicValue( thread ) && NIL != equality_store.some_equality_assertions_somewhereP( fort1 ) && NIL != equality_store.some_equality_assertions_somewhereP(
        fort2 ) && NIL != equality_store.some_equality_assertionsP( fort1, UNPROVIDED ) && NIL != equality_store.some_equality_assertionsP( fort2, UNPROVIDED ) )
    {
      ans = ghl_search_methods.gt_predicate_relation_p( $const0$equals, fort1, fort2, mt, tv, UNPROVIDED );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2793L)
  public static SubLObject equal_nautP(final SubLObject naut1, final SubLObject naut2, SubLObject mt, SubLObject tv)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != el_utilities.evaluatable_el_expressionP( naut1 ) && NIL != el_utilities.evaluatable_el_expressionP( naut2 ) )
    {
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        final SubLObject naut1_evaluated = relation_evaluation.cyc_evaluate( naut1 );
        final SubLObject naut2_evaluated = relation_evaluation.cyc_evaluate( naut2 );
        if( NIL != naut1_evaluated && NIL != naut2_evaluated )
        {
          result = Equality.equal( naut1_evaluated, naut2_evaluated );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL == result && NIL != list_utilities.non_dotted_list_p( naut1 ) && NIL != list_utilities.non_dotted_list_p( naut2 ) && NIL != list_utilities.same_length_p( naut1, naut2 ) )
    {
      SubLObject syntactically_differentP = NIL;
      if( NIL == syntactically_differentP )
      {
        SubLObject naut1_arg = NIL;
        SubLObject naut1_arg_$1 = NIL;
        SubLObject naut2_arg = NIL;
        SubLObject naut2_arg_$2 = NIL;
        naut1_arg = naut1;
        naut1_arg_$1 = naut1_arg.first();
        naut2_arg = naut2;
        naut2_arg_$2 = naut2_arg.first();
        while ( NIL == syntactically_differentP && ( NIL != naut2_arg || NIL != naut1_arg ))
        {
          if( NIL == equalsP( naut1_arg_$1, naut2_arg_$2, UNPROVIDED, UNPROVIDED ) )
          {
            syntactically_differentP = T;
          }
          naut1_arg = naut1_arg.rest();
          naut1_arg_$1 = naut1_arg.first();
          naut2_arg = naut2_arg.rest();
          naut2_arg_$2 = naut2_arg.first();
        }
      }
      result = makeBoolean( NIL == syntactically_differentP );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3713L)
  public static SubLObject max_floor_mts_where_equals(SubLObject source, final SubLObject target)
  {
    if( NIL != equal_everywhereP( source, target ) )
    {
      return ConsesLow.list( mt_vars.$equals_defining_mt$.getGlobalValue() );
    }
    if( NIL != forts.fort_p( source ) )
    {
      return max_floor_mts_where_equals_fort( source, target );
    }
    if( NIL != forts.fort_p( target ) )
    {
      return max_floor_mts_where_equals_fort( target, source );
    }
    return max_floor_mts_where_equals_non_forts( source, target );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4172L)
  public static SubLObject max_floor_mts_where_equals_fort(final SubLObject source_fort, final SubLObject target)
  {
    return ghl_search_methods.gt_max_floor_mts_of_predicate_paths( $const0$equals, source_fort, target, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4317L)
  public static SubLObject max_floor_mts_where_equals_non_forts(SubLObject source, final SubLObject target)
  {
    return ( NIL != equal_somewhereP( source, target ) ) ? $const2$InferencePSC : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4794L)
  public static SubLObject equal_everywhereP(final SubLObject term1, final SubLObject term2)
  {
    return equalsP( term1, term2, mt_vars.$equals_defining_mt$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4894L)
  public static SubLObject equal_somewhereP(final SubLObject term1, final SubLObject term2)
  {
    return equalsP( term1, term2, $const2$InferencePSC, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4987L)
  public static SubLObject possibly_subst_preferred_rewrite_terms(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != preferred_rewrite_terms_subst_applicableP( formula, mt ) )
    {
      return preferred_rewrite_terms_subst_apply( formula, mt );
    }
    return Values.values( formula, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5345L)
  public static SubLObject preferred_rewrite_terms_subst_applicableP(final SubLObject sentence, final SubLObject mt)
  {
    return makeBoolean( NIL != control_vars.within_queryP() && ( NIL != cycl_utilities.expression_find_if( $sym3$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_, sentence, UNPROVIDED, UNPROVIDED ) || NIL != cycl_utilities
        .expression_find_if( $sym3$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_, mt, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5631L)
  public static SubLObject preferred_rewrite_terms_subst_apply(SubLObject sentence, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding( thread );
    try
    {
      cycl_utilities.$opaque_arg_function$.bind( $sym4$OPAQUE_ARG_WRT_QUOTING_, thread );
      SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const5$BaseKB );
      final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding( thread );
      SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        mt = cycl_utilities.expression_ntransform( mt, $sym6$HAS_PREFERRED_REWRITE_TERM_, $sym7$PREFERRED_REWRITE_TERM, T, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$3, thread );
      }
      mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding( thread );
      _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        sentence = cycl_utilities.expression_ntransform( sentence, $sym6$HAS_PREFERRED_REWRITE_TERM_, $sym7$PREFERRED_REWRITE_TERM, T, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$4, thread );
      }
    }
    finally
    {
      cycl_utilities.$opaque_arg_function$.rebind( _prev_bind_0, thread );
    }
    return Values.values( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6072L)
  public static SubLObject has_preferred_rewrite_termP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != equality_store.some_source_rewrite_of_assertions_somewhereP( v_term ) )
    {
      final SubLObject preferred_term = preferred_rewrite_term( v_term, mt );
      if( NIL != preferred_term && !preferred_term.equal( v_term ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6384L)
  public static SubLObject clear_preferred_rewrite_term()
  {
    final SubLObject cs = $preferred_rewrite_term_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6384L)
  public static SubLObject remove_preferred_rewrite_term(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $preferred_rewrite_term_caching_state$.getGlobalValue(), ConsesLow.list( v_term, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6384L)
  public static SubLObject preferred_rewrite_term_internal(final SubLObject v_term, final SubLObject mt)
  {
    final SubLObject preferred_term = preferred_rewrite_term_int( v_term, mt, UNPROVIDED, UNPROVIDED );
    final SubLObject result = ( NIL != kb_utilities.kbeq( v_term, preferred_term ) ) ? NIL : preferred_term;
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6384L)
  public static SubLObject preferred_rewrite_term(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject caching_state = $preferred_rewrite_term_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym7$PREFERRED_REWRITE_TERM, $sym8$_PREFERRED_REWRITE_TERM_CACHING_STATE_, $int9$128, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym10$CLEAR_PREFERRED_REWRITE_TERM );
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
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( preferred_rewrite_term_internal( v_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6832L)
  public static SubLObject preferred_rewrite_term_int(final SubLObject v_term, final SubLObject mt, SubLObject depth, SubLObject candidate_terms)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    if( candidate_terms == UNPROVIDED )
    {
      candidate_terms = NIL;
    }
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
      if( depth.numG( $preferred_rewrite_term_max_recursion_depth$.getDynamicValue( thread ) ) )
      {
        result = $kw11$MAX_RECURSION_DEPTH_REACHED;
      }
      else if( NIL != equality_store.some_source_rewrite_of_assertions_somewhereP( v_term ) )
      {
        final SubLObject preferred_terms = kb_mapping_utilities.pred_values( v_term, $const12$rewriteOf, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
        if( NIL == preferred_terms )
        {
          result = $kw13$PREFERRED_TERM_NOT_FOUND;
        }
        else if( NIL == list_utilities.singletonP( preferred_terms ) )
        {
          result = $kw14$TOO_MANY_PREFERRED_TERMS_FOUND;
        }
        else
        {
          final SubLObject preferred_term = preferred_terms.first();
          if( NIL != list_utilities.member_kbeqP( preferred_term, candidate_terms ) )
          {
            result = $kw15$REWRITE_CYCLE_DETECTED;
          }
          else
          {
            result = preferred_rewrite_term_int( preferred_term, mt, Numbers.add( ONE_INTEGER, depth ), ConsesLow.cons( preferred_term, candidate_terms ) );
          }
        }
      }
      else
      {
        result = v_term;
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    result = ( ( NIL != forts.fort_p( result ) || depth.numG( ZERO_INTEGER ) ) ? result : v_term );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7961L)
  public static SubLObject direct_rewrite_ofP(final SubLObject simple_fort, final SubLObject complex_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != narts_high.naut_p( complex_term ) )
    {
      return list_utilities.member_equalP( complex_term, kb_mapping_utilities.pred_values( simple_fort, $const12$rewriteOf, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return makeBoolean( NIL != equality_store.some_source_rewrite_of_assertions_somewhereP( complex_term ) && NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const12$rewriteOf, simple_fort, complex_term, mt,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8462L)
  public static SubLObject any_direct_rewrite_ofP(final SubLObject simple_forts, final SubLObject complex_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject v_answer = NIL;
    if( NIL == v_answer )
    {
      SubLObject csome_list_var = simple_forts;
      SubLObject simple_fort = NIL;
      simple_fort = csome_list_var.first();
      while ( NIL == v_answer && NIL != csome_list_var)
      {
        if( NIL != direct_rewrite_ofP( simple_fort, complex_term, mt ) )
        {
          v_answer = T;
        }
        csome_list_var = csome_list_var.rest();
        simple_fort = csome_list_var.first();
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8846L)
  public static SubLObject simplest_forts_wrt_rewrite(final SubLObject v_forts, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != list_utilities.non_dotted_list_p( v_forts ) : v_forts;
    SubLObject cdolist_list_var = v_forts;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != forts.fort_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject simplest_forts = v_forts;
    cdolist_list_var = v_forts;
    SubLObject fort = NIL;
    fort = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != any_direct_rewrite_ofP( v_forts, fort, mt ) )
      {
        simplest_forts = Sequences.remove( fort, simplest_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      fort = cdolist_list_var.first();
    }
    return simplest_forts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9367L)
  public static SubLObject differentP(final SubLObject objects, SubLObject unknown_value)
  {
    if( unknown_value == UNPROVIDED )
    {
      unknown_value = NIL;
    }
    SubLObject result = T;
    SubLObject failureP = NIL;
    SubLObject v_object = NIL;
    SubLObject other_objects = NIL;
    v_object = objects.first();
    for( other_objects = objects.rest(); NIL == failureP && NIL != other_objects; other_objects = other_objects.rest() )
    {
      if( NIL == failureP )
      {
        SubLObject csome_list_var = other_objects;
        SubLObject other_object = NIL;
        other_object = csome_list_var.first();
        while ( NIL == failureP && NIL != csome_list_var)
        {
          final SubLObject different = differentP_binary( v_object, other_object, unknown_value );
          if( different.eql( unknown_value ) )
          {
            failureP = T;
            result = unknown_value;
          }
          else if( NIL == different )
          {
            failureP = T;
            result = NIL;
          }
          csome_list_var = csome_list_var.rest();
          other_object = csome_list_var.first();
        }
      }
      v_object = other_objects.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9980L)
  public static SubLObject differentP_binary(final SubLObject obj1, final SubLObject obj2, SubLObject unknown_value)
  {
    if( unknown_value == UNPROVIDED )
    {
      unknown_value = NIL;
    }
    if( NIL != unification_utilities.term_unify( obj1, obj2, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != cycl_grammar.subl_strict_atomic_term_p( obj1 ) && NIL != cycl_grammar.subl_strict_atomic_term_p( obj2 ) )
    {
      return T;
    }
    if( NIL != unique_names_assumption_applicable_to_termP( obj1 ) && NIL != unique_names_assumption_applicable_to_termP( obj2 ) )
    {
      return T;
    }
    if( NIL != asserted_differentP( obj1, obj2 ) )
    {
      return T;
    }
    if( NIL != different_by_disjointnessP( obj1, obj2 ) )
    {
      return T;
    }
    return unknown_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10615L)
  public static SubLObject asserted_differentP(final SubLObject obj1, final SubLObject obj2)
  {
    return list_utilities.sublisp_boolean( find_different_assertion( obj1, obj2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10719L)
  public static SubLObject find_different_assertion(final SubLObject obj1, final SubLObject obj2)
  {
    SubLObject different_assertion;
    SubLObject rest;
    SubLObject assertion;
    SubLObject predicate;
    SubLObject args;
    for( different_assertion = NIL, rest = NIL, rest = virtual_indexing.gather_overlap_index( ConsesLow.list( $const18$different, obj1, obj2 ), UNPROVIDED ); NIL == different_assertion && NIL != rest; rest = rest
        .rest() )
    {
      assertion = rest.first();
      if( NIL != assertions_high.assertion_has_truth( assertion, $kw19$TRUE ) && NIL != assertions_high.gaf_assertionP( assertion ) )
      {
        predicate = assertions_high.gaf_predicate( assertion );
        args = assertions_high.gaf_args( assertion );
        if( $const18$different.eql( predicate ) && NIL != list_utilities.member_equalP( obj1, args ) && NIL != list_utilities.member_equalP( obj2, Sequences.remove( obj1, args, Symbols.symbol_function( EQUAL ),
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
        {
          different_assertion = assertion;
        }
      }
    }
    for( rest = NIL, rest = virtual_indexing.gather_overlap_index( ConsesLow.list( $const0$equals, obj1, obj2 ), UNPROVIDED ); NIL == different_assertion && NIL != rest; rest = rest.rest() )
    {
      assertion = rest.first();
      if( NIL != assertions_high.assertion_has_truth( assertion, $kw20$FALSE ) && NIL != assertions_high.gaf_assertionP( assertion ) )
      {
        predicate = assertions_high.gaf_predicate( assertion );
        args = assertions_high.gaf_args( assertion );
        if( $const0$equals.eql( predicate ) && NIL != list_utilities.member_equalP( obj1, args ) && NIL != list_utilities.member_equalP( obj2, Sequences.remove( obj1, args, Symbols.symbol_function( EQUAL ), UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
        {
          different_assertion = assertion;
        }
      }
    }
    return different_assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12162L)
  public static SubLObject different_by_disjointnessP(final SubLObject obj1, final SubLObject obj2)
  {
    if( NIL != cycl_grammar.cycl_represented_term_p( obj1 ) && NIL != cycl_grammar.cycl_represented_term_p( obj2 ) )
    {
      return disjoint_with.instances_of_disjoint_collectionsP( obj1, obj2, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != cycl_grammar.cycl_represented_term_p( obj1 ) )
    {
      return different_by_disjointnessP_rep_unrep( obj1, obj2 );
    }
    if( NIL != cycl_grammar.cycl_represented_term_p( obj2 ) )
    {
      return different_by_disjointnessP_rep_unrep( obj2, obj1 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12562L)
  public static SubLObject different_by_disjointnessP_rep_unrep(final SubLObject rep_term, final SubLObject unrep_term)
  {
    SubLObject differentP = NIL;
    if( NIL == differentP )
    {
      SubLObject csome_list_var = isa.min_isa( rep_term, UNPROVIDED, UNPROVIDED );
      SubLObject col = NIL;
      col = csome_list_var.first();
      while ( NIL == differentP && NIL != csome_list_var)
      {
        if( NIL != at_defns.quiet_not_has_typeP( unrep_term, col, UNPROVIDED ) )
        {
          differentP = T;
        }
        if( NIL == differentP )
        {
          SubLObject csome_list_var_$5 = disjoint_with.max_all_disjoint_with( col, UNPROVIDED, UNPROVIDED );
          SubLObject disj_col = NIL;
          disj_col = csome_list_var_$5.first();
          while ( NIL == differentP && NIL != csome_list_var_$5)
          {
            if( NIL != at_defns.quiet_has_typeP( unrep_term, disj_col, UNPROVIDED ) )
            {
              differentP = T;
            }
            csome_list_var_$5 = csome_list_var_$5.rest();
            disj_col = csome_list_var_$5.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        col = csome_list_var.first();
      }
    }
    return differentP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12992L)
  public static SubLObject why_different(final SubLObject objects)
  {
    SubLObject justification = NIL;
    SubLObject failureP = NIL;
    SubLObject v_object = NIL;
    SubLObject other_objects = NIL;
    v_object = objects.first();
    for( other_objects = objects.rest(); NIL == failureP && NIL != other_objects; other_objects = other_objects.rest() )
    {
      if( NIL == failureP )
      {
        SubLObject csome_list_var = other_objects;
        SubLObject other_object = NIL;
        other_object = csome_list_var.first();
        while ( NIL == failureP && NIL != csome_list_var)
        {
          final SubLObject binary_justification = why_different_binary( v_object, other_object );
          if( NIL != binary_justification )
          {
            justification = ConsesLow.nconc( justification, binary_justification );
          }
          else
          {
            justification = NIL;
            failureP = T;
          }
          csome_list_var = csome_list_var.rest();
          other_object = csome_list_var.first();
        }
      }
      v_object = other_objects.first();
    }
    return list_utilities.fast_delete_duplicates( justification, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13569L)
  public static SubLObject why_different_binary(final SubLObject obj1, final SubLObject obj2)
  {
    if( NIL != unification_utilities.term_unify( obj1, obj2, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != cycl_grammar.subl_strict_atomic_term_p( obj1 ) && NIL != cycl_grammar.subl_strict_atomic_term_p( obj2 ) )
    {
      final SubLObject support = arguments.make_hl_support( $kw21$OPAQUE, el_utilities.make_binary_formula( $const18$different, obj1, obj2 ), UNPROVIDED, UNPROVIDED );
      return ConsesLow.list( support );
    }
    if( NIL != unique_names_assumption_applicable_to_termP( obj1 ) && NIL != unique_names_assumption_applicable_to_termP( obj2 ) )
    {
      final SubLObject support = arguments.make_hl_support( $kw21$OPAQUE, el_utilities.make_binary_formula( $const18$different, obj1, obj2 ), UNPROVIDED, UNPROVIDED );
      return ConsesLow.list( support );
    }
    if( NIL != asserted_differentP( obj1, obj2 ) )
    {
      return why_asserted_different( obj1, obj2 );
    }
    if( NIL != different_by_disjointnessP( obj1, obj2 ) )
    {
      return why_different_by_disjointness( obj1, obj2 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14460L)
  public static SubLObject why_asserted_different(final SubLObject obj1, final SubLObject obj2)
  {
    return ConsesLow.list( find_different_assertion( obj1, obj2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14564L)
  public static SubLObject why_different_by_disjointness(final SubLObject obj1, final SubLObject obj2)
  {
    if( NIL != cycl_grammar.cycl_represented_term_p( obj1 ) && NIL != cycl_grammar.cycl_represented_term_p( obj2 ) )
    {
      return disjoint_with.why_instances_of_disjoint_collections( obj1, obj2, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != cycl_grammar.cycl_represented_term_p( obj1 ) )
    {
      return why_different_by_disjointness_rep_unrep( obj1, obj2 );
    }
    if( NIL != cycl_grammar.cycl_represented_term_p( obj2 ) )
    {
      return why_different_by_disjointness_rep_unrep( obj2, obj1 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14976L)
  public static SubLObject why_different_by_disjointness_rep_unrep(final SubLObject rep_term, final SubLObject unrep_term)
  {
    SubLObject justification = NIL;
    if( NIL == justification )
    {
      SubLObject csome_list_var = isa.min_isa( rep_term, UNPROVIDED, UNPROVIDED );
      SubLObject col = NIL;
      col = csome_list_var.first();
      while ( NIL == justification && NIL != csome_list_var)
      {
        if( NIL != at_defns.quiet_not_has_typeP( unrep_term, col, UNPROVIDED ) )
        {
          final SubLObject support1 = arguments.make_hl_support( $kw22$ISA, el_utilities.make_binary_formula( $const23$isa, rep_term, col ), UNPROVIDED, UNPROVIDED );
          final SubLObject support2 = arguments.make_hl_support( $kw22$ISA, el_utilities.make_negation( el_utilities.make_binary_formula( $const23$isa, unrep_term, col ) ), UNPROVIDED, UNPROVIDED );
          justification = ConsesLow.list( support1, support2 );
        }
        if( NIL == justification )
        {
          SubLObject csome_list_var_$6 = disjoint_with.max_all_disjoint_with( col, UNPROVIDED, UNPROVIDED );
          SubLObject disj_col = NIL;
          disj_col = csome_list_var_$6.first();
          while ( NIL == justification && NIL != csome_list_var_$6)
          {
            if( NIL != at_defns.quiet_has_typeP( unrep_term, disj_col, UNPROVIDED ) )
            {
              final SubLObject support3 = arguments.make_hl_support( $kw22$ISA, el_utilities.make_binary_formula( $const23$isa, rep_term, col ), UNPROVIDED, UNPROVIDED );
              final SubLObject support4 = arguments.make_hl_support( $kw22$ISA, el_utilities.make_binary_formula( $const23$isa, unrep_term, disj_col ), UNPROVIDED, UNPROVIDED );
              final SubLObject support5 = arguments.make_hl_support( $kw24$DISJOINTWITH, el_utilities.make_binary_formula( $const25$disjointWith, col, disj_col ), UNPROVIDED, UNPROVIDED );
              justification = ConsesLow.list( support3, support4, support5 );
            }
            csome_list_var_$6 = csome_list_var_$6.rest();
            disj_col = csome_list_var_$6.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        col = csome_list_var.first();
      }
    }
    return justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15941L)
  public static SubLObject unique_names_assumption_applicable_to_termP(final SubLObject v_term)
  {
    if( NIL != constant_handles.valid_constantP( $const26$TermExemptFromUniqueNamesAssumpti, UNPROVIDED ) )
    {
      return makeBoolean( NIL == kb_accessors.term_exempt_from_unique_names_assumptionP( v_term ) );
    }
    return makeBoolean( NIL == inference_trampolines.inference_indeterminate_termP( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16355L)
  public static SubLObject unique_names_assumption_applicable_to_all_argsP(final SubLObject formula)
  {
    SubLObject failureP = NIL;
    final SubLObject args = cycl_utilities.formula_args( formula, $kw27$IGNORE );
    SubLObject rest;
    SubLObject arg;
    for( rest = NIL, rest = args; NIL == failureP && NIL != rest; rest = rest.rest() )
    {
      arg = rest.first();
      if( NIL == unique_names_assumption_applicable_to_termP( arg ) )
      {
        failureP = T;
      }
    }
    return makeBoolean( NIL == failureP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16692L)
  public static SubLObject unique_names_assumption_applicable_to_all_args_exceptP(final SubLObject formula, final SubLObject argnum)
  {
    SubLObject failureP = NIL;
    SubLObject n = ZERO_INTEGER;
    final SubLObject args = cycl_utilities.formula_args( formula, $kw27$IGNORE );
    SubLObject rest;
    SubLObject arg;
    for( rest = NIL, rest = args; NIL == failureP && NIL != rest; rest = rest.rest() )
    {
      arg = rest.first();
      n = Numbers.add( n, ONE_INTEGER );
      if( !n.eql( argnum ) && NIL == unique_names_assumption_applicable_to_termP( arg ) )
      {
        failureP = T;
      }
    }
    return makeBoolean( NIL == failureP );
  }

  public static SubLObject declare_equals_file()
  {
    SubLFiles.declareFunction( me, "all_equals", "ALL-EQUALS", 1, 2, false );
    SubLFiles.declareFunction( me, "equalsP", "EQUALS?", 2, 2, false );
    SubLFiles.declareFunction( me, "why_equals", "WHY-EQUALS", 2, 2, false );
    SubLFiles.declareFunction( me, "not_equalsP", "NOT-EQUALS?", 2, 2, false );
    SubLFiles.declareFunction( me, "equal_fortP", "EQUAL-FORT?", 2, 2, false );
    SubLFiles.declareFunction( me, "equal_fortsP", "EQUAL-FORTS?", 2, 2, false );
    SubLFiles.declareFunction( me, "equal_nautP", "EQUAL-NAUT?", 2, 2, false );
    SubLFiles.declareFunction( me, "max_floor_mts_where_equals", "MAX-FLOOR-MTS-WHERE-EQUALS", 2, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_where_equals_fort", "MAX-FLOOR-MTS-WHERE-EQUALS-FORT", 2, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_where_equals_non_forts", "MAX-FLOOR-MTS-WHERE-EQUALS-NON-FORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "equal_everywhereP", "EQUAL-EVERYWHERE?", 2, 0, false );
    SubLFiles.declareFunction( me, "equal_somewhereP", "EQUAL-SOMEWHERE?", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_subst_preferred_rewrite_terms", "POSSIBLY-SUBST-PREFERRED-REWRITE-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "preferred_rewrite_terms_subst_applicableP", "PREFERRED-REWRITE-TERMS-SUBST-APPLICABLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "preferred_rewrite_terms_subst_apply", "PREFERRED-REWRITE-TERMS-SUBST-APPLY", 2, 0, false );
    SubLFiles.declareFunction( me, "has_preferred_rewrite_termP", "HAS-PREFERRED-REWRITE-TERM?", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_preferred_rewrite_term", "CLEAR-PREFERRED-REWRITE-TERM", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_preferred_rewrite_term", "REMOVE-PREFERRED-REWRITE-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "preferred_rewrite_term_internal", "PREFERRED-REWRITE-TERM-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "preferred_rewrite_term", "PREFERRED-REWRITE-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "preferred_rewrite_term_int", "PREFERRED-REWRITE-TERM-INT", 2, 2, false );
    SubLFiles.declareFunction( me, "direct_rewrite_ofP", "DIRECT-REWRITE-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "any_direct_rewrite_ofP", "ANY-DIRECT-REWRITE-OF?", 2, 1, false );
    SubLFiles.declareFunction( me, "simplest_forts_wrt_rewrite", "SIMPLEST-FORTS-WRT-REWRITE", 1, 1, false );
    SubLFiles.declareFunction( me, "differentP", "DIFFERENT?", 1, 1, false );
    SubLFiles.declareFunction( me, "differentP_binary", "DIFFERENT?-BINARY", 2, 1, false );
    SubLFiles.declareFunction( me, "asserted_differentP", "ASSERTED-DIFFERENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "find_different_assertion", "FIND-DIFFERENT-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "different_by_disjointnessP", "DIFFERENT-BY-DISJOINTNESS?", 2, 0, false );
    SubLFiles.declareFunction( me, "different_by_disjointnessP_rep_unrep", "DIFFERENT-BY-DISJOINTNESS?-REP-UNREP", 2, 0, false );
    SubLFiles.declareFunction( me, "why_different", "WHY-DIFFERENT", 1, 0, false );
    SubLFiles.declareFunction( me, "why_different_binary", "WHY-DIFFERENT-BINARY", 2, 0, false );
    SubLFiles.declareFunction( me, "why_asserted_different", "WHY-ASSERTED-DIFFERENT", 2, 0, false );
    SubLFiles.declareFunction( me, "why_different_by_disjointness", "WHY-DIFFERENT-BY-DISJOINTNESS", 2, 0, false );
    SubLFiles.declareFunction( me, "why_different_by_disjointness_rep_unrep", "WHY-DIFFERENT-BY-DISJOINTNESS-REP-UNREP", 2, 0, false );
    SubLFiles.declareFunction( me, "unique_names_assumption_applicable_to_termP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "unique_names_assumption_applicable_to_all_argsP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-ALL-ARGS?", 1, 0, false );
    SubLFiles.declareFunction( me, "unique_names_assumption_applicable_to_all_args_exceptP", "UNIQUE-NAMES-ASSUMPTION-APPLICABLE-TO-ALL-ARGS-EXCEPT?", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_equals_file()
  {
    $preferred_rewrite_term_caching_state$ = SubLFiles.deflexical( "*PREFERRED-REWRITE-TERM-CACHING-STATE*", NIL );
    $preferred_rewrite_term_max_recursion_depth$ = SubLFiles.defparameter( "*PREFERRED-REWRITE-TERM-MAX-RECURSION-DEPTH*", SEVEN_INTEGER );
    return NIL;
  }

  public static SubLObject setup_equals_file()
  {
    memoization_state.note_globally_cached_function( $sym7$PREFERRED_REWRITE_TERM );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_equals_file();
  }

  @Override
  public void initializeVariables()
  {
    init_equals_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_equals_file();
  }
  static
  {
    me = new equals();
    $preferred_rewrite_term_caching_state$ = null;
    $preferred_rewrite_term_max_recursion_depth$ = null;
    $const0$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $kw1$REFLEXIVE = makeKeyword( "REFLEXIVE" );
    $const2$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym3$SOME_SOURCE_REWRITE_OF_ASSERTIONS_SOMEWHERE_ = makeSymbol( "SOME-SOURCE-REWRITE-OF-ASSERTIONS-SOMEWHERE?" );
    $sym4$OPAQUE_ARG_WRT_QUOTING_ = makeSymbol( "OPAQUE-ARG-WRT-QUOTING?" );
    $const5$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym6$HAS_PREFERRED_REWRITE_TERM_ = makeSymbol( "HAS-PREFERRED-REWRITE-TERM?" );
    $sym7$PREFERRED_REWRITE_TERM = makeSymbol( "PREFERRED-REWRITE-TERM" );
    $sym8$_PREFERRED_REWRITE_TERM_CACHING_STATE_ = makeSymbol( "*PREFERRED-REWRITE-TERM-CACHING-STATE*" );
    $int9$128 = makeInteger( 128 );
    $sym10$CLEAR_PREFERRED_REWRITE_TERM = makeSymbol( "CLEAR-PREFERRED-REWRITE-TERM" );
    $kw11$MAX_RECURSION_DEPTH_REACHED = makeKeyword( "MAX-RECURSION-DEPTH-REACHED" );
    $const12$rewriteOf = constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) );
    $kw13$PREFERRED_TERM_NOT_FOUND = makeKeyword( "PREFERRED-TERM-NOT-FOUND" );
    $kw14$TOO_MANY_PREFERRED_TERMS_FOUND = makeKeyword( "TOO-MANY-PREFERRED-TERMS-FOUND" );
    $kw15$REWRITE_CYCLE_DETECTED = makeKeyword( "REWRITE-CYCLE-DETECTED" );
    $sym16$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym17$FORT_P = makeSymbol( "FORT-P" );
    $const18$different = constant_handles.reader_make_constant_shell( makeString( "different" ) );
    $kw19$TRUE = makeKeyword( "TRUE" );
    $kw20$FALSE = makeKeyword( "FALSE" );
    $kw21$OPAQUE = makeKeyword( "OPAQUE" );
    $kw22$ISA = makeKeyword( "ISA" );
    $const23$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw24$DISJOINTWITH = makeKeyword( "DISJOINTWITH" );
    $const25$disjointWith = constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) );
    $const26$TermExemptFromUniqueNamesAssumpti = constant_handles.reader_make_constant_shell( makeString( "TermExemptFromUniqueNamesAssumption" ) );
    $kw27$IGNORE = makeKeyword( "IGNORE" );
  }
}
/*
 * 
 * Total time: 283 ms
 * 
 */