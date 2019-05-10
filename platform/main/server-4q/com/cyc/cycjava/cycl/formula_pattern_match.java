package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class formula_pattern_match
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.formula_pattern_match";
  public static final String myFingerPrint = "07e6ae23b4e0c280d8329fb9ebdab7f38f4d2a62d3f7363dda4696fcc8f52257";
  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 2024L)
  private static SubLSymbol $pattern_matches_formula_atomic_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 2809L)
  private static SubLSymbol $pattern_matches_formula_methods$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD;
  private static final SubLSymbol $sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PATTERN_MATCHES_FORMULA;
  private static final SubLSymbol $kw8$TEST;
  private static final SubLSymbol $kw9$OWNER;
  private static final SubLSymbol $kw10$CLASSES;
  private static final SubLSymbol $kw11$KB;
  private static final SubLSymbol $kw12$TINY;
  private static final SubLSymbol $kw13$WORKING_;
  private static final SubLList $list14;

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 1171L)
  public static SubLObject pattern_matches_formula(final SubLObject pattern, final SubLObject formula)
  {
    return pattern_matches_formula_internal( pattern, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 1618L)
  public static SubLObject pattern_matches_formula_without_bindings(final SubLObject pattern, final SubLObject formula)
  {
    return pattern_matches_formula_without_bindings_internal( pattern, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 1864L)
  public static SubLObject formula_matches_pattern(final SubLObject formula, final SubLObject pattern)
  {
    return pattern_matches_formula_internal( pattern, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 3697L)
  public static SubLObject pattern_matches_formula_internal(final SubLObject pattern, final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject success = NIL;
    SubLObject v_bindings = NIL;
    final SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pattern_match.$pattern_matches_tree_methods$.currentBinding( thread );
    try
    {
      pattern_match.$pattern_matches_tree_atomic_methods$.bind( $pattern_matches_formula_atomic_methods$.getGlobalValue(), thread );
      pattern_match.$pattern_matches_tree_methods$.bind( $pattern_matches_formula_methods$.getGlobalValue(), thread );
      thread.resetMultipleValues();
      final SubLObject match_success = pattern_match.pattern_matches_tree( pattern, formula );
      final SubLObject match_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      success = match_success;
      v_bindings = match_bindings;
    }
    finally
    {
      pattern_match.$pattern_matches_tree_methods$.rebind( _prev_bind_2, thread );
      pattern_match.$pattern_matches_tree_atomic_methods$.rebind( _prev_bind_0, thread );
    }
    return subl_promotions.values2( success, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 4367L)
  public static SubLObject pattern_matches_formula_without_bindings_internal(final SubLObject pattern, final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject success = NIL;
    final SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pattern_match.$pattern_matches_tree_methods$.currentBinding( thread );
    try
    {
      pattern_match.$pattern_matches_tree_atomic_methods$.bind( $pattern_matches_formula_atomic_methods$.getGlobalValue(), thread );
      pattern_match.$pattern_matches_tree_methods$.bind( $pattern_matches_formula_methods$.getGlobalValue(), thread );
      success = pattern_match.pattern_matches_tree_without_bindings( pattern, formula );
    }
    finally
    {
      pattern_match.$pattern_matches_tree_methods$.rebind( _prev_bind_2, thread );
      pattern_match.$pattern_matches_tree_atomic_methods$.rebind( _prev_bind_0, thread );
    }
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 4935L)
  public static SubLObject pattern_matches_formula_isa_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list2 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list2 );
    collection = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, pattern, $list2 );
    current = current.rest();
    if( NIL == current )
    {
      return call_pattern_matches_formula_isa_method( formula, collection, mt );
    }
    cdestructuring_bind.cdestructuring_bind_error( pattern, $list2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 5197L)
  public static SubLObject call_pattern_matches_formula_isa_method(final SubLObject formula, final SubLObject collection, final SubLObject mt)
  {
    return at_defns.quiet_has_typeP( formula, collection, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 5374L)
  public static SubLObject pattern_matches_formula_isa_memoized_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list2 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list2 );
    collection = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, pattern, $list2 );
    current = current.rest();
    if( NIL == current )
    {
      return memoized_call_pattern_matches_formula_isa_method( formula, collection, mt, UNPROVIDED );
    }
    cdestructuring_bind.cdestructuring_bind_error( pattern, $list2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 5642L)
  public static SubLObject memoized_call_pattern_matches_formula_isa_method_internal(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    return call_pattern_matches_formula_isa_method( formula, collection, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 5642L)
  public static SubLObject memoized_call_pattern_matches_formula_isa_method(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_call_pattern_matches_formula_isa_method_internal( formula, collection, mt, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, FOUR_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( formula, collection, mt, mt_info );
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
          if( collection.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_call_pattern_matches_formula_isa_method_internal( formula, collection, mt, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( formula, collection, mt, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 5890L)
  public static SubLObject pattern_matches_formula_not_isa_disjoint_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list2 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list2 );
    collection = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, pattern, $list2 );
    current = current.rest();
    if( NIL == current )
    {
      return call_pattern_matches_formula_not_isa_disjoint_method( formula, collection, mt );
    }
    cdestructuring_bind.cdestructuring_bind_error( pattern, $list2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 6243L)
  public static SubLObject call_pattern_matches_formula_not_isa_disjoint_method(final SubLObject formula, final SubLObject collection, final SubLObject mt)
  {
    return makeBoolean( NIL == at_defns.quiet_not_has_typeP( formula, collection, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 6399L)
  public static SubLObject pattern_matches_formula_not_isa_disjoint_memoized_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list2 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list2 );
    collection = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, pattern, $list2 );
    current = current.rest();
    if( NIL == current )
    {
      return memoized_call_pattern_matches_formula_not_isa_disjoint_method( formula, collection, mt, UNPROVIDED );
    }
    cdestructuring_bind.cdestructuring_bind_error( pattern, $list2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 6768L)
  public static SubLObject memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    return call_pattern_matches_formula_not_isa_disjoint_method( formula, collection, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 6768L)
  public static SubLObject memoized_call_pattern_matches_formula_not_isa_disjoint_method(final SubLObject formula, final SubLObject collection, final SubLObject mt, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal( formula, collection, mt, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, FOUR_INTEGER, NIL,
          EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( formula, collection, mt, mt_info );
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
          if( collection.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal( formula, collection, mt, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( formula, collection, mt, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 7042L)
  public static SubLObject pattern_matches_formula_genls_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list2 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list2 );
    collection = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, pattern, $list2 );
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL != term.el_fort_p( formula ) && NIL != genls.genlsP( formula, collection, mt, UNPROVIDED ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( pattern, $list2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 7299L)
  public static SubLObject pattern_matches_formula_spec_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list2 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list2 );
    collection = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, pattern, $list2 );
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL != term.el_fort_p( formula ) && NIL != genls.specP( formula, collection, mt, UNPROVIDED ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( pattern, $list2 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 7551L)
  public static SubLObject pattern_matches_formula_nat_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject subpattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list5 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list5 );
    subpattern = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( pattern, $list5 );
      return NIL;
    }
    if( NIL != nart_handles.nart_p( formula ) )
    {
      return pattern_match.pattern_matches_tree_internal( subpattern, narts_high.nart_el_formula( formula ) );
    }
    return pattern_match.pattern_matches_tree_internal( subpattern, formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 7903L)
  public static SubLObject pattern_matches_formula_unify_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject subpattern = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list5 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list5 );
    subpattern = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return unification.unify_possible( subpattern, formula );
    }
    cdestructuring_bind.cdestructuring_bind_error( pattern, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 8114L)
  public static SubLObject pattern_matches_formula_genl_pred_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list6 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list6 );
    predicate = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, pattern, $list6 );
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL != forts.fort_p( formula ) && NIL != genl_predicates.genl_predicateP( formula, predicate, mt, UNPROVIDED ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( pattern, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 8401L)
  public static SubLObject pattern_matches_formula_genl_inverse_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list6 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list6 );
    predicate = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, pattern, $list6 );
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL != forts.fort_p( formula ) && NIL != genl_predicates.genl_inverseP( formula, predicate, mt, UNPROVIDED ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( pattern, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 8689L)
  public static SubLObject pattern_matches_formula_spec_pred_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list6 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list6 );
    predicate = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, pattern, $list6 );
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL != forts.fort_p( formula ) && NIL != genl_predicates.spec_predicateP( formula, predicate, mt, UNPROVIDED ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( pattern, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 8976L)
  public static SubLObject pattern_matches_formula_spec_inverse_method(final SubLObject pattern, final SubLObject formula)
  {
    SubLObject pattern_operator = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pattern, pattern, $list6 );
    pattern_operator = pattern.first();
    SubLObject current = pattern.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pattern, $list6 );
    predicate = current.first();
    current = current.rest();
    final SubLObject mt = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, pattern, $list6 );
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL != forts.fort_p( formula ) && NIL != genl_predicates.spec_inverseP( formula, predicate, mt, UNPROVIDED ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( pattern, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 9264L)
  public static SubLObject pattern_transform_formula(final SubLObject pattern, final SubLObject formula, SubLObject v_bindings)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    return pattern_transform_formula_internal( pattern, formula, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 9701L)
  public static SubLObject formula_transform_pattern(final SubLObject formula, final SubLObject pattern, SubLObject v_bindings)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    return pattern_transform_formula_internal( pattern, formula, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-pattern-match.lisp", position = 9907L)
  public static SubLObject pattern_transform_formula_internal(final SubLObject pattern, final SubLObject formula, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject answer_transform = NIL;
    SubLObject answer_bindings = NIL;
    final SubLObject _prev_bind_0 = pattern_match.$pattern_transform_match_method$.currentBinding( thread );
    try
    {
      pattern_match.$pattern_transform_match_method$.bind( $sym7$PATTERN_MATCHES_FORMULA, thread );
      thread.resetMultipleValues();
      final SubLObject sub_transform = pattern_match.pattern_transform_tree( pattern, formula, v_bindings );
      final SubLObject sub_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      answer_transform = sub_transform;
      answer_bindings = sub_bindings;
    }
    finally
    {
      pattern_match.$pattern_transform_match_method$.rebind( _prev_bind_0, thread );
    }
    return subl_promotions.values2( answer_transform, answer_bindings );
  }

  public static SubLObject declare_formula_pattern_match_file()
  {
    SubLFiles.declareFunction( me, "pattern_matches_formula", "PATTERN-MATCHES-FORMULA", 2, 0, false );
    new $pattern_matches_formula$BinaryFunction();
    SubLFiles.declareFunction( me, "pattern_matches_formula_without_bindings", "PATTERN-MATCHES-FORMULA-WITHOUT-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "formula_matches_pattern", "FORMULA-MATCHES-PATTERN", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_internal", "PATTERN-MATCHES-FORMULA-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_without_bindings_internal", "PATTERN-MATCHES-FORMULA-WITHOUT-BINDINGS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_isa_method", "PATTERN-MATCHES-FORMULA-ISA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "call_pattern_matches_formula_isa_method", "CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_isa_memoized_method", "PATTERN-MATCHES-FORMULA-ISA-MEMOIZED-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "memoized_call_pattern_matches_formula_isa_method_internal", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD-INTERNAL", 3, 1, false );
    SubLFiles.declareFunction( me, "memoized_call_pattern_matches_formula_isa_method", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_not_isa_disjoint_method", "PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "call_pattern_matches_formula_not_isa_disjoint_method", "CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_not_isa_disjoint_memoized_method", "PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-MEMOIZED-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD-INTERNAL", 3, 1, false );
    SubLFiles.declareFunction( me, "memoized_call_pattern_matches_formula_not_isa_disjoint_method", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 3, 1, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_genls_method", "PATTERN-MATCHES-FORMULA-GENLS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_spec_method", "PATTERN-MATCHES-FORMULA-SPEC-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_nat_method", "PATTERN-MATCHES-FORMULA-NAT-METHOD", 2, 0, false );
    new $pattern_matches_formula_nat_method$BinaryFunction();
    SubLFiles.declareFunction( me, "pattern_matches_formula_unify_method", "PATTERN-MATCHES-FORMULA-UNIFY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_genl_pred_method", "PATTERN-MATCHES-FORMULA-GENL-PRED-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_genl_inverse_method", "PATTERN-MATCHES-FORMULA-GENL-INVERSE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_spec_pred_method", "PATTERN-MATCHES-FORMULA-SPEC-PRED-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_matches_formula_spec_inverse_method", "PATTERN-MATCHES-FORMULA-SPEC-INVERSE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pattern_transform_formula", "PATTERN-TRANSFORM-FORMULA", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_transform_pattern", "FORMULA-TRANSFORM-PATTERN", 2, 1, false );
    SubLFiles.declareFunction( me, "pattern_transform_formula_internal", "PATTERN-TRANSFORM-FORMULA-INTERNAL", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_formula_pattern_match_file()
  {
    $pattern_matches_formula_atomic_methods$ = SubLFiles.deflexical( "*PATTERN-MATCHES-FORMULA-ATOMIC-METHODS*", $list0 );
    $pattern_matches_formula_methods$ = SubLFiles.deflexical( "*PATTERN-MATCHES-FORMULA-METHODS*", $list1 );
    return NIL;
  }

  public static SubLObject setup_formula_pattern_match_file()
  {
    memoization_state.note_memoized_function( $sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD );
    memoization_state.note_memoized_function( $sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD );
    generic_testing.define_test_case_table_int( $sym7$PATTERN_MATCHES_FORMULA, ConsesLow.list( new SubLObject[] { $kw8$TEST, NIL, $kw9$OWNER, NIL, $kw10$CLASSES, NIL, $kw11$KB, $kw12$TINY, $kw13$WORKING_, T
    } ), $list14 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_formula_pattern_match_file();
  }

  @Override
  public void initializeVariables()
  {
    init_formula_pattern_match_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_formula_pattern_match_file();
  }
  static
  {
    me = new formula_pattern_match();
    $pattern_matches_formula_atomic_methods$ = null;
    $pattern_matches_formula_methods$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "FULLY-BOUND" ), makeSymbol( "FULLY-BOUND-P" ) ), ConsesLow.list( makeKeyword( "NOT-FULLY-BOUND" ), makeSymbol( "NOT-FULLY-BOUND-P" ) ),
      ConsesLow.list( makeKeyword( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeKeyword( "INTEGER" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeKeyword( "FORT" ), makeSymbol( "FORT-P" ) ), ConsesLow
          .list( makeKeyword( "HLMT" ), makeSymbol( "HLMT-P" ) ), ConsesLow.list( makeKeyword( "CLOSED-HLMT" ), makeSymbol( "CLOSED-HLMT-P" ) ), ConsesLow.list( makeKeyword( "CONSTANT" ), makeSymbol( "CONSTANT-P" ) ),
      ConsesLow.list( makeKeyword( "NART" ), makeSymbol( "NART-P" ) ), ConsesLow.list( makeKeyword( "CLOSED-NAUT" ), makeSymbol( "CLOSED-NAUT?" ) ), ConsesLow.list( makeKeyword( "OPEN-NAUT" ), makeSymbol(
          "OPEN-NAUT?" ) ), ConsesLow.list( makeKeyword( "ASSERTION" ), makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( makeKeyword( "SENTENCE" ), makeSymbol( "CYCL-SENTENCE-P" ) ), ConsesLow.list( makeKeyword(
              "VARIABLE" ), makeSymbol( "VARIABLE-P" ) ), ConsesLow.list( makeKeyword( "EL-VARIABLE" ), makeSymbol( "EL-VARIABLE-P" ) ), ConsesLow.list( makeKeyword( "COLLECTION-FORT" ), makeSymbol( "COLLECTION-P" ) ),
      ConsesLow.list( makeKeyword( "PREDICATE-FORT" ), makeSymbol( "PREDICATE-P" ) ), ConsesLow.list( makeKeyword( "FUNCTOR-FORT" ), makeSymbol( "FUNCTOR-P" ) ), ConsesLow.list( makeKeyword( "MT-FORT" ), makeSymbol(
          "MICROTHEORY-P" ) )
    } );
    $list1 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "ISA" ), makeSymbol( "PATTERN-MATCHES-FORMULA-ISA-METHOD" ) ), ConsesLow.list( makeKeyword( "ISA-MEMOIZED" ), makeSymbol(
        "PATTERN-MATCHES-FORMULA-ISA-MEMOIZED-METHOD" ) ), ConsesLow.list( makeKeyword( "NOT-ISA-DISJOINT" ), makeSymbol( "PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD" ) ), ConsesLow.list( makeKeyword(
            "NOT-ISA-DISJOINT-MEMOIZED" ), makeSymbol( "PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-MEMOIZED-METHOD" ) ), ConsesLow.list( makeKeyword( "GENLS" ), makeSymbol( "PATTERN-MATCHES-FORMULA-GENLS-METHOD" ) ),
      ConsesLow.list( makeKeyword( "SPEC" ), makeSymbol( "PATTERN-MATCHES-FORMULA-SPEC-METHOD" ) ), ConsesLow.list( makeKeyword( "NAT" ), makeSymbol( "PATTERN-MATCHES-FORMULA-NAT-METHOD" ) ), ConsesLow.list( makeKeyword(
          "UNIFY" ), makeSymbol( "PATTERN-MATCHES-FORMULA-UNIFY-METHOD" ) ), ConsesLow.list( makeKeyword( "GENL-PRED" ), makeSymbol( "PATTERN-MATCHES-FORMULA-GENL-PRED-METHOD" ) ), ConsesLow.list( makeKeyword(
              "GENL-INVERSE" ), makeSymbol( "PATTERN-MATCHES-FORMULA-GENL-INVERSE-METHOD" ) ), ConsesLow.list( makeKeyword( "SPEC-PRED" ), makeSymbol( "PATTERN-MATCHES-FORMULA-SPEC-PRED-METHOD" ) ), ConsesLow.list(
                  makeKeyword( "SPEC-INVERSE" ), makeSymbol( "PATTERN-MATCHES-FORMULA-SPEC-INVERSE-METHOD" ) )
    } );
    $list2 = ConsesLow.list( makeSymbol( "PATTERN-OPERATOR" ), makeSymbol( "COLLECTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD = makeSymbol( "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD" );
    $sym4$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD = makeSymbol( "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD" );
    $list5 = ConsesLow.list( makeSymbol( "PATTERN-OPERATOR" ), makeSymbol( "SUBPATTERN" ) );
    $list6 = ConsesLow.list( makeSymbol( "PATTERN-OPERATOR" ), makeSymbol( "PREDICATE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT" ) );
    $sym7$PATTERN_MATCHES_FORMULA = makeSymbol( "PATTERN-MATCHES-FORMULA" );
    $kw8$TEST = makeKeyword( "TEST" );
    $kw9$OWNER = makeKeyword( "OWNER" );
    $kw10$CLASSES = makeKeyword( "CLASSES" );
    $kw11$KB = makeKeyword( "KB" );
    $kw12$TINY = makeKeyword( "TINY" );
    $kw13$WORKING_ = makeKeyword( "WORKING?" );
    $list14 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeKeyword( "ANYTHING" ), ONE_INTEGER ), T ), ConsesLow.list( ConsesLow.list( makeKeyword( "ANYTHING" ), makeString( "test" ) ), T ),
      ConsesLow.list( ConsesLow.list( makeKeyword( "ANYTHING" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ), T ), ConsesLow.list( ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "and" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ), T ), ConsesLow.list( ConsesLow.list(
                  makeKeyword( "NOTHING" ), ONE_INTEGER ), NIL ), ConsesLow.list( ConsesLow.list( makeKeyword( "NOTHING" ), makeString( "test" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeKeyword( "NOTHING" ),
                      constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ), NIL ), ConsesLow.list( ConsesLow.list( makeKeyword( "NOTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                          makeString( "and" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( makeKeyword( "NOTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "Thing" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                  makeKeyword( "TEST" ), makeSymbol( "STRINGP" ) ), makeString( "a" ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "STRINGP" ) ), makeString(
                                      "test" ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "STRINGP" ) ), makeString( "TEST" ) ), T ), ConsesLow.list( ConsesLow.list(
                                          ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "STRINGP" ) ), makeString( "" ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                                              "STRINGP" ) ), ONE_INTEGER ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "STRINGP" ) ), constant_handles
                                                  .reader_make_constant_shell( makeString( "Thing" ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "STRINGP" ) ), ConsesLow
                                                      .list( constant_handles.reader_make_constant_shell( makeString( "and" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ),
                                                          makeSymbol( "STRINGP" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
                                                              makeString( "Thing" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                  constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FULLY-BOUND-P" ) ), ConsesLow
                                                                      .list( makeKeyword( "TEST" ), makeSymbol( "FORT-P" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                          ONE_INTEGER, constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                              constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FULLY-BOUND-P" ) ),
                                                                              ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FORT-P" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                  "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) ), ONE_INTEGER, TWO_INTEGER ),
                                                                                  constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                      constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                                                                                          "FULLY-BOUND-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FORT-P" ) ) ), ConsesLow.list( constant_handles
                                                                                              .reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ),
                                                                                              constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                                                                  .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "TEST" ),
                                                                                                      makeSymbol( "FULLY-BOUND-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FORT-P" ) ) ), ConsesLow.list(
                                                                                                          constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
                                                                                                              makeString( "Thing" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                                                                                                                      "FULLY-BOUND-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FORT-P" ) ) ), ConsesLow
                                                                                                                          .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "Thing" ) ), constant_handles
                                                                                                                                  .reader_make_constant_shell( makeString( "Thing" ) ), constant_handles
                                                                                                                                      .reader_make_constant_shell( makeString( "Thing" ) ) ) ), NIL ), ConsesLow.list(
                                                                                                                                          ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                              makeString( "isa" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                                                                                                                                                  "FULLY-BOUND-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                                                                                                                                                      "FORT-P" ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString( "isa" ) ),
                                                                                                                                                          constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                              "Thing" ) ), makeInteger( 212 ) ) ), NIL ), ConsesLow.list(
                                                                                                                                                                  ConsesLow.list( ConsesLow.list( makeKeyword( "UNIFY" ),
                                                                                                                                                                      makeInteger( 212 ) ), makeInteger( 212 ) ), T ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "UNIFY" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ), makeInteger( 212 ) ), NIL )
    } );
  }

  public static final class $pattern_matches_formula$BinaryFunction
      extends
        BinaryFunction
  {
    public $pattern_matches_formula$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PATTERN-MATCHES-FORMULA" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return pattern_matches_formula( arg1, arg2 );
    }
  }

  public static final class $pattern_matches_formula_nat_method$BinaryFunction
      extends
        BinaryFunction
  {
    public $pattern_matches_formula_nat_method$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PATTERN-MATCHES-FORMULA-NAT-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return pattern_matches_formula_nat_method( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 217 ms
 * 
 */