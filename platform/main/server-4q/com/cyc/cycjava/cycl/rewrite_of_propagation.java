package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rewrite_of_propagation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rewrite_of_propagation";
  public static final String myFingerPrint = "ab5cf4a3c23bdb2a2a8a5cdb91b57033abce1b23bdb7796647fe449e6525e74d";
  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 1025L)
  public static SubLSymbol $enable_rewrite_of_propagationP$;
  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2103L)
  private static SubLSymbol $propagate_rewrite_of_source_term$;
  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2180L)
  private static SubLSymbol $propagate_rewrite_of_target_term$;
  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2242L)
  private static SubLSymbol $propagate_rewrite_of_assertion$;
  private static final SubLObject $const0$rewriteOf;
  private static final SubLSymbol $kw1$TRUE;
  private static final SubLSymbol $sym2$REWRITE_OF_AFTER_ADDING;
  private static final SubLSymbol $sym3$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const4$EverythingPSC;
  private static final SubLSymbol $sym5$PROPAGATE_REWRITE_OF_ASSERTION;
  private static final SubLSymbol $sym6$FORT_WITH_SOME_SOURCE_REWRITE_OF_ASSERTIONS;
  private static final SubLSymbol $kw7$GAF;
  private static final SubLSymbol $sym8$ASSERTION_P;
  private static final SubLSymbol $sym9$FORT_P;
  private static final SubLSymbol $kw10$PROPAGATE_REWRITE_OF_CNF;
  private static final SubLSymbol $sym11$OPAQUE_ARG_WRT_QUOTING_;
  private static final SubLSymbol $sym12$_EXIT;
  private static final SubLObject $const13$isa;

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 1306L)
  public static SubLObject rewrite_of_after_adding(final SubLObject argument, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    equality_store.decache_some_equality_assertions_somewhere( argument, assertion );
    if( NIL != $enable_rewrite_of_propagationP$.getDynamicValue( thread ) && NIL != assertion_utilities.gaf_assertion_with_pred_p( assertion, $const0$rewriteOf ) && NIL != assertions_high.assertion_has_truth( assertion,
        $kw1$TRUE ) )
    {
      final SubLObject asent = assertions_high.gaf_formula( assertion );
      if( NIL != el_utilities.formula_arityE( asent, TWO_INTEGER, UNPROVIDED ) )
      {
        final SubLObject source = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
        final SubLObject target = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
        if( NIL != forts.fort_p( target ) && NIL != forts.fort_p( source ) && !target.equal( source ) )
        {
          rewrite_of_after_adding_internal( source, target, assertion );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2304L)
  public static SubLObject rewrite_of_after_adding_internal(SubLObject source, final SubLObject target, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $propagate_rewrite_of_source_term$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $propagate_rewrite_of_target_term$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $propagate_rewrite_of_assertion$.currentBinding( thread );
    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      $propagate_rewrite_of_source_term$.bind( source, thread );
      $propagate_rewrite_of_target_term$.bind( target, thread );
      $propagate_rewrite_of_assertion$.bind( assertion, thread );
      mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
      kb_mapping.map_term( $sym5$PROPAGATE_REWRITE_OF_ASSERTION, source );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_5, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_4, thread );
      $propagate_rewrite_of_assertion$.rebind( _prev_bind_3, thread );
      $propagate_rewrite_of_target_term$.rebind( _prev_bind_2, thread );
      $propagate_rewrite_of_source_term$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 2616L)
  public static SubLObject propagate_rewrite_of_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject source = $propagate_rewrite_of_source_term$.getDynamicValue( thread );
    final SubLObject target = $propagate_rewrite_of_target_term$.getDynamicValue( thread );
    final SubLObject rewrite_of_assertion = $propagate_rewrite_of_assertion$.getDynamicValue( thread );
    if( !assertion.eql( $propagate_rewrite_of_assertion$.getDynamicValue( thread ) ) )
    {
      propagate_assertion_via_rewrite_of( assertion, source, target, rewrite_of_assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 3032L)
  public static SubLObject perform_rewrite_of_propagation(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $enable_rewrite_of_propagationP$.getDynamicValue( thread ) )
    {
      final SubLObject forts_with_rewrite_of = cycl_utilities.expression_gather( assertion, $sym6$FORT_WITH_SOME_SOURCE_REWRITE_OF_ASSERTIONS, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != forts_with_rewrite_of )
      {
        SubLObject cdolist_list_var = forts_with_rewrite_of;
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          perform_rewrite_of_propagation_internal( fort, assertion );
          cdolist_list_var = cdolist_list_var.rest();
          fort = cdolist_list_var.first();
        }
      }
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 3632L)
  public static SubLObject perform_rewrite_of_propagation_internal(SubLObject source, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym3$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const4$EverythingPSC, thread );
      final SubLObject pred_var = $const0$rewriteOf;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( source, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( source, TWO_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw7$GAF, $kw1$TRUE, NIL );
              SubLObject done_var_$1 = NIL;
              final SubLObject token_var_$2 = NIL;
              while ( NIL == done_var_$1)
              {
                final SubLObject rewrite_of_assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( rewrite_of_assertion ) );
                if( NIL != valid_$3 )
                {
                  final SubLObject target = assertions_high.gaf_arg1( rewrite_of_assertion );
                  if( NIL != forts.fort_p( target ) && !source.equal( target ) && !rewrite_of_assertion.eql( assertion ) )
                  {
                    propagate_assertion_via_rewrite_of( assertion, source, target, rewrite_of_assertion );
                  }
                }
                done_var_$1 = makeBoolean( NIL == valid_$3 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 4110L)
  public static SubLObject fort_with_some_source_rewrite_of_assertions(final SubLObject fort)
  {
    return equality_store.some_source_rewrite_of_assertions_somewhereP( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 4239L)
  public static SubLObject propagate_assertion_via_rewrite_of(final SubLObject assertion, SubLObject source, final SubLObject target, final SubLObject rewrite_of_assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    assert NIL != forts.fort_p( source ) : source;
    assert NIL != forts.fort_p( target ) : target;
    assert NIL != assertion_handles.assertion_p( rewrite_of_assertion ) : rewrite_of_assertion;
    final SubLObject assertion_cnf = assertion_utilities.assertion_cnf_with_el_vars_only( assertion );
    if( NIL != should_propagate_rewrite_of_cnf( assertion_cnf, source, target ) )
    {
      final SubLObject new_assertion_cnf = propagate_rewrite_of_cnf( assertion_cnf, source, target );
      if( !new_assertion_cnf.equal( assertion_cnf ) )
      {
        final SubLObject new_el_formula = clauses.cnf_formula( new_assertion_cnf, assertions_high.assertion_truth( assertion ) );
        final SubLObject direction = assertions_high.assertion_direction( assertion );
        final SubLObject el_supports = ConsesLow.list( assertion, rewrite_of_assertion );
        final SubLObject source_mt = assertions_high.assertion_mt( assertion );
        final SubLObject rewrite_of_mt = assertions_high.assertion_mt( rewrite_of_assertion );
        final SubLObject new_mt = determine_propagate_rewrite_of_mt( source_mt, rewrite_of_mt );
        if( NIL != new_mt )
        {
          fi.fi_add_argument_int( new_el_formula, new_mt, el_supports, direction, UNPROVIDED );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 5467L)
  public static SubLObject should_propagate_rewrite_of_cnf(final SubLObject assertion_cnf, SubLObject source, final SubLObject target)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject something_to_propagate = NIL;
    try
    {
      thread.throwStack.push( $kw10$PROPAGATE_REWRITE_OF_CNF );
      propagate_rewrite_of_cnf_internal( assertion_cnf, source, target, T );
    }
    catch( final Throwable ccatch_env_var )
    {
      something_to_propagate = Errors.handleThrowable( ccatch_env_var, $kw10$PROPAGATE_REWRITE_OF_CNF );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return something_to_propagate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 5748L)
  public static SubLObject note_should_propagate_rewrite_of_cnf()
  {
    Dynamic.sublisp_throw( $kw10$PROPAGATE_REWRITE_OF_CNF, T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 5856L)
  public static SubLObject propagate_rewrite_of_cnf(final SubLObject assertion_cnf, SubLObject source, final SubLObject target)
  {
    return propagate_rewrite_of_cnf_internal( assertion_cnf, source, target, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 6005L)
  public static SubLObject propagate_rewrite_of_cnf_internal(final SubLObject assertion_cnf, SubLObject source, final SubLObject target, final SubLObject check)
  {
    final SubLObject neg_lits = clauses.neg_lits( assertion_cnf );
    final SubLObject pos_lits = clauses.pos_lits( assertion_cnf );
    SubLObject new_neg_lits = NIL;
    SubLObject new_pos_lits = NIL;
    if( NIL != cycl_utilities.expression_list_find( source, neg_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = neg_lits;
      SubLObject neg_lit = NIL;
      neg_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject literal = propagate_rewrite_of_atomic_sentence( neg_lit, source, target, check );
        if( NIL == check )
        {
          new_neg_lits = ConsesLow.cons( literal, new_neg_lits );
        }
        cdolist_list_var = cdolist_list_var.rest();
        neg_lit = cdolist_list_var.first();
      }
      if( NIL == check )
      {
        new_neg_lits = Sequences.nreverse( new_neg_lits );
      }
    }
    else if( NIL == check )
    {
      new_neg_lits = neg_lits;
    }
    if( NIL != cycl_utilities.expression_list_find( source, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = pos_lits;
      SubLObject pos_lit = NIL;
      pos_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject literal = propagate_rewrite_of_atomic_sentence( pos_lit, source, target, check );
        if( NIL == check )
        {
          new_pos_lits = ConsesLow.cons( literal, new_pos_lits );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pos_lit = cdolist_list_var.first();
      }
      if( NIL == check )
      {
        new_pos_lits = Sequences.nreverse( new_pos_lits );
      }
    }
    else if( NIL == check )
    {
      new_pos_lits = pos_lits;
    }
    if( NIL != check )
    {
      return NIL;
    }
    return clauses.make_cnf( new_neg_lits, new_pos_lits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 7025L)
  public static SubLObject propagate_rewrite_of_atomic_sentence(final SubLObject asent, SubLObject source, final SubLObject target, final SubLObject check)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding( thread );
    try
    {
      cycl_utilities.$opaque_arg_function$.bind( $sym11$OPAQUE_ARG_WRT_QUOTING_, thread );
      if( NIL == cycl_utilities.expression_find( source, asent, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return asent;
      }
      final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
      if( NIL == forts.fort_p( predicate ) )
      {
        return asent;
      }
      if( predicate.eql( $const13$isa ) && NIL != check )
      {
        note_should_propagate_rewrite_of_cnf();
        return cycl_utilities.expression_subst( target, source, asent, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
      if( NIL == kb_accessors.some_opaque_argumentP( predicate ) )
      {
        if( NIL != check )
        {
          note_should_propagate_rewrite_of_cnf();
        }
        return cycl_utilities.expression_subst( target, source, asent, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
      final SubLObject sentence_args = cycl_utilities.sentence_args( asent, UNPROVIDED );
      SubLObject arg_index = ZERO_INTEGER;
      SubLObject subst_args = NIL;
      SubLObject cdolist_list_var = sentence_args;
      SubLObject sentence_arg = NIL;
      sentence_arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        arg_index = Numbers.add( arg_index, ONE_INTEGER );
        if( NIL != cycl_utilities.expression_find( source, sentence_arg, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == kb_accessors.opaque_argumentP( predicate, arg_index ) )
        {
          if( NIL != check )
          {
            note_should_propagate_rewrite_of_cnf();
          }
          subst_args = ConsesLow.cons( arg_index, subst_args );
        }
        cdolist_list_var = cdolist_list_var.rest();
        sentence_arg = cdolist_list_var.first();
      }
      if( NIL == subst_args )
      {
        return asent;
      }
      final SubLObject new_asent = el_utilities.copy_expression( asent );
      SubLObject cdolist_list_var2 = subst_args;
      SubLObject subst_arg = NIL;
      subst_arg = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject old_arg = cycl_utilities.sentence_arg( new_asent, subst_arg, UNPROVIDED );
        ConsesLow.set_nth( subst_arg, new_asent, cycl_utilities.expression_nsubst( target, source, old_arg, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
        cdolist_list_var2 = cdolist_list_var2.rest();
        subst_arg = cdolist_list_var2.first();
      }
      return new_asent;
    }
    finally
    {
      cycl_utilities.$opaque_arg_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/rewrite-of-propagation.lisp", position = 9394L)
  public static SubLObject determine_propagate_rewrite_of_mt(final SubLObject source_mt, final SubLObject rewrite_of_mt)
  {
    if( NIL != genl_mts.genl_mtP( source_mt, rewrite_of_mt, UNPROVIDED, UNPROVIDED ) )
    {
      return source_mt;
    }
    if( NIL != genl_mts.genl_mtP( rewrite_of_mt, source_mt, UNPROVIDED, UNPROVIDED ) )
    {
      return rewrite_of_mt;
    }
    return NIL;
  }

  public static SubLObject declare_rewrite_of_propagation_file()
  {
    SubLFiles.declareFunction( me, "rewrite_of_after_adding", "REWRITE-OF-AFTER-ADDING", 2, 0, false );
    SubLFiles.declareFunction( me, "rewrite_of_after_adding_internal", "REWRITE-OF-AFTER-ADDING-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "propagate_rewrite_of_assertion", "PROPAGATE-REWRITE-OF-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "perform_rewrite_of_propagation", "PERFORM-REWRITE-OF-PROPAGATION", 1, 0, false );
    SubLFiles.declareFunction( me, "perform_rewrite_of_propagation_internal", "PERFORM-REWRITE-OF-PROPAGATION-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "fort_with_some_source_rewrite_of_assertions", "FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS", 1, 0, false );
    new $fort_with_some_source_rewrite_of_assertions$UnaryFunction();
    SubLFiles.declareFunction( me, "propagate_assertion_via_rewrite_of", "PROPAGATE-ASSERTION-VIA-REWRITE-OF", 4, 0, false );
    SubLFiles.declareFunction( me, "should_propagate_rewrite_of_cnf", "SHOULD-PROPAGATE-REWRITE-OF-CNF", 3, 0, false );
    SubLFiles.declareFunction( me, "note_should_propagate_rewrite_of_cnf", "NOTE-SHOULD-PROPAGATE-REWRITE-OF-CNF", 0, 0, false );
    SubLFiles.declareFunction( me, "propagate_rewrite_of_cnf", "PROPAGATE-REWRITE-OF-CNF", 3, 0, false );
    SubLFiles.declareFunction( me, "propagate_rewrite_of_cnf_internal", "PROPAGATE-REWRITE-OF-CNF-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "propagate_rewrite_of_atomic_sentence", "PROPAGATE-REWRITE-OF-ATOMIC-SENTENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "determine_propagate_rewrite_of_mt", "DETERMINE-PROPAGATE-REWRITE-OF-MT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_rewrite_of_propagation_file()
  {
    $enable_rewrite_of_propagationP$ = SubLFiles.defparameter( "*ENABLE-REWRITE-OF-PROPAGATION?*", T );
    $propagate_rewrite_of_source_term$ = SubLFiles.defparameter( "*PROPAGATE-REWRITE-OF-SOURCE-TERM*", NIL );
    $propagate_rewrite_of_target_term$ = SubLFiles.defparameter( "*PROPAGATE-REWRITE-OF-TARGET-TERM*", NIL );
    $propagate_rewrite_of_assertion$ = SubLFiles.defparameter( "*PROPAGATE-REWRITE-OF-ASSERTION*", NIL );
    return NIL;
  }

  public static SubLObject setup_rewrite_of_propagation_file()
  {
    utilities_macros.register_kb_function( $sym2$REWRITE_OF_AFTER_ADDING );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rewrite_of_propagation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rewrite_of_propagation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rewrite_of_propagation_file();
  }
  static
  {
    me = new rewrite_of_propagation();
    $enable_rewrite_of_propagationP$ = null;
    $propagate_rewrite_of_source_term$ = null;
    $propagate_rewrite_of_target_term$ = null;
    $propagate_rewrite_of_assertion$ = null;
    $const0$rewriteOf = constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) );
    $kw1$TRUE = makeKeyword( "TRUE" );
    $sym2$REWRITE_OF_AFTER_ADDING = makeSymbol( "REWRITE-OF-AFTER-ADDING" );
    $sym3$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const4$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym5$PROPAGATE_REWRITE_OF_ASSERTION = makeSymbol( "PROPAGATE-REWRITE-OF-ASSERTION" );
    $sym6$FORT_WITH_SOME_SOURCE_REWRITE_OF_ASSERTIONS = makeSymbol( "FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS" );
    $kw7$GAF = makeKeyword( "GAF" );
    $sym8$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym9$FORT_P = makeSymbol( "FORT-P" );
    $kw10$PROPAGATE_REWRITE_OF_CNF = makeKeyword( "PROPAGATE-REWRITE-OF-CNF" );
    $sym11$OPAQUE_ARG_WRT_QUOTING_ = makeSymbol( "OPAQUE-ARG-WRT-QUOTING?" );
    $sym12$_EXIT = makeSymbol( "%EXIT" );
    $const13$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
  }

  public static final class $fort_with_some_source_rewrite_of_assertions$UnaryFunction
      extends
        UnaryFunction
  {
    public $fort_with_some_source_rewrite_of_assertions$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORT-WITH-SOME-SOURCE-REWRITE-OF-ASSERTIONS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return fort_with_some_source_rewrite_of_assertions( arg1 );
    }
  }
}
/*
 * 
 * Total time: 180 ms
 * 
 */