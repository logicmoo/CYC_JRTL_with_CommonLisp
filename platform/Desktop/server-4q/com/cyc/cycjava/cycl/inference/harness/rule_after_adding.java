package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rule_after_adding
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.rule_after_adding";
  public static final String myFingerPrint = "0e7a823bd51bc74ba604db023a0bda43ca065e6a6a3b66988f6ceb31f65372a5";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 756L)
  public static SubLSymbol $rule_after_adding_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 959L)
  private static SubLSymbol $rule_after_addings_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1073L)
  private static SubLSymbol $rule_after_removings_hash$;
  private static final SubLSymbol $sym0$_RULE_AFTER_ADDINGS_HASH_;
  private static final SubLSymbol $sym1$_RULE_AFTER_REMOVINGS_HASH_;
  private static final SubLSymbol $sym2$ARGUMENT_P;
  private static final SubLSymbol $sym3$ASSERTION_P;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym6$IGNORE_ERRORS_HANDLER;
  private static final SubLInteger $int7$100;
  private static final SubLSymbol $sym8$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const9$EverythingPSC;
  private static final SubLObject $const10$ruleAfterAdding;
  private static final SubLSymbol $kw11$GAF;
  private static final SubLList $list12;
  private static final SubLObject $const13$ruleAfterRemoving;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$FORT_P;
  private static final SubLSymbol $kw16$TRUE;
  private static final SubLSymbol $sym17$PROPAGATE_RULE_AFTER_ADDING;
  private static final SubLSymbol $sym18$SYMBOLP;
  private static final SubLSymbol $sym19$HLMT_P;
  private static final SubLSymbol $sym20$RELEVANT_MT_IS_SPEC_MT;
  private static final SubLSymbol $kw21$RULE;
  private static final SubLSymbol $sym22$RELEVANT_MT_IS_GENL_MT;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1137L)
  public static SubLObject clear_rule_after_addings()
  {
    if( NIL != $rule_after_addings_hash$.getGlobalValue() )
    {
      Hashtables.clrhash( $rule_after_addings_hash$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1310L)
  public static SubLObject clear_rule_after_removings()
  {
    if( NIL != $rule_after_removings_hash$.getGlobalValue() )
    {
      Hashtables.clrhash( $rule_after_removings_hash$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1452L)
  public static SubLObject handle_rule_after_addings(final SubLObject argument, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != arguments.argument_p( argument ) : argument;
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == after_adding.$after_addings_disabledP$.getDynamicValue( thread ) && NIL != assertions_high.rule_assertionP( assertion ) )
    {
      final SubLObject cnf = assertions_high.assertion_cnf( assertion );
      SubLObject cdolist_list_var = clauses.neg_lits( cnf );
      SubLObject literal = NIL;
      literal = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        handle_rule_after_addings_int( argument, literal, assertion );
        cdolist_list_var = cdolist_list_var.rest();
        literal = cdolist_list_var.first();
      }
      cdolist_list_var = clauses.pos_lits( cnf );
      literal = NIL;
      literal = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        handle_rule_after_addings_int( argument, literal, assertion );
        cdolist_list_var = cdolist_list_var.rest();
        literal = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1958L)
  public static SubLObject handle_rule_after_addings_int(final SubLObject argument, final SubLObject literal, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = el_utilities.literal_arg( literal, ZERO_INTEGER, UNPROVIDED );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    if( NIL != forts.fort_p( pred ) )
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
        SubLObject cdolist_list_var = get_rule_after_addings( pred );
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = info;
          SubLObject fun = NIL;
          SubLObject fun_mt = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
          fun = current.first();
          current = ( fun_mt = current.rest() );
          if( fun.isFunctionSpec() && NIL != mt_relevance_macros.relevant_mtP( fun_mt ) )
          {
            SubLObject ignore_errors_tag = NIL;
            try
            {
              thread.throwStack.push( $kw5$IGNORE_ERRORS_TARGET );
              final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( Symbols.symbol_function( $sym6$IGNORE_ERRORS_HANDLER ), thread );
                try
                {
                  handle_rule_after_adding( fun, argument, literal, assertion );
                }
                catch( final Throwable catch_var )
                {
                  Errors.handleThrowable( catch_var, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0_$1, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw5$IGNORE_ERRORS_TARGET );
            }
            finally
            {
              thread.throwStack.pop();
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          info = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 2471L)
  public static SubLObject handle_rule_after_removings(final SubLObject argument, final SubLObject assertion)
  {
    assert NIL != arguments.argument_p( argument ) : argument;
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != assertions_high.rule_assertionP( assertion ) )
    {
      final SubLObject cnf = assertions_high.assertion_cnf( assertion );
      SubLObject cdolist_list_var = clauses.neg_lits( cnf );
      SubLObject literal = NIL;
      literal = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        handle_rule_after_removings_int( argument, literal, assertion );
        cdolist_list_var = cdolist_list_var.rest();
        literal = cdolist_list_var.first();
      }
      cdolist_list_var = clauses.pos_lits( cnf );
      literal = NIL;
      literal = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        handle_rule_after_removings_int( argument, literal, assertion );
        cdolist_list_var = cdolist_list_var.rest();
        literal = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 2904L)
  public static SubLObject handle_rule_after_removings_int(final SubLObject argument, final SubLObject literal, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pred = el_utilities.literal_arg( assertion, ZERO_INTEGER, UNPROVIDED );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    if( NIL != forts.fort_p( pred ) )
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
        SubLObject cdolist_list_var = get_rule_after_removings( pred );
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = info;
          SubLObject fun = NIL;
          SubLObject fun_mt = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
          fun = current.first();
          current = ( fun_mt = current.rest() );
          if( fun.isFunctionSpec() && NIL != mt_relevance_macros.relevant_mtP( fun_mt ) )
          {
            SubLObject ignore_errors_tag = NIL;
            try
            {
              thread.throwStack.push( $kw5$IGNORE_ERRORS_TARGET );
              final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( Symbols.symbol_function( $sym6$IGNORE_ERRORS_HANDLER ), thread );
                try
                {
                  handle_rule_after_removing( fun, argument, literal, assertion );
                }
                catch( final Throwable catch_var )
                {
                  Errors.handleThrowable( catch_var, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0_$2, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw5$IGNORE_ERRORS_TARGET );
            }
            finally
            {
              thread.throwStack.pop();
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          info = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 3431L)
  public static SubLObject get_rule_after_addings(final SubLObject pred)
  {
    if( NIL == $rule_after_addings_hash$.getGlobalValue() )
    {
      initialize_rule_after_addings_hash();
    }
    return Hashtables.gethash_without_values( pred, $rule_after_addings_hash$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 3640L)
  public static SubLObject get_rule_after_removings(final SubLObject pred)
  {
    if( NIL == $rule_after_removings_hash$.getGlobalValue() )
    {
      initialize_rule_after_removings_hash();
    }
    return Hashtables.gethash_without_values( pred, $rule_after_removings_hash$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 3843L)
  public static SubLObject handle_rule_after_adding(final SubLObject function, final SubLObject argument, final SubLObject literal, final SubLObject assertion)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
      Functions.funcall( function, argument, literal, assertion );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 4013L)
  public static SubLObject handle_rule_after_removing(final SubLObject function, final SubLObject argument, final SubLObject literal, final SubLObject assertion)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( control_vars.$hl_lock$.getGlobalValue() );
      Functions.funcall( function, argument, literal, assertion );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( control_vars.$hl_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 4185L)
  public static SubLObject rebuild_rule_after_adding_caches()
  {
    initialize_rule_after_addings_hash();
    initialize_rule_after_removings_hash();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 4389L)
  public static SubLObject initialize_rule_after_addings_hash()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $rule_after_addings_hash$.getGlobalValue() )
    {
      Hashtables.clrhash( $rule_after_addings_hash$.getGlobalValue() );
    }
    else
    {
      $rule_after_addings_hash$.setGlobalValue( Hashtables.make_hash_table( $int7$100, UNPROVIDED, UNPROVIDED ) );
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const9$EverythingPSC, thread );
      final SubLObject pred_var = $const10$ruleAfterAdding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$3 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$4 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw11$GAF, NIL, NIL );
                SubLObject done_var_$5 = NIL;
                final SubLObject token_var_$6 = NIL;
                while ( NIL == done_var_$5)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                  final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( ass ) );
                  if( NIL != valid_$7 )
                  {
                    final SubLObject formula = assertions_high.gaf_formula( ass );
                    SubLObject current;
                    final SubLObject datum = current = formula;
                    SubLObject rule_after_adding_pred = NIL;
                    SubLObject pred = NIL;
                    SubLObject v_rule_after_adding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
                    rule_after_adding_pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
                    pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
                    v_rule_after_adding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != forts.valid_fortP( pred ) )
                      {
                        v_rule_after_adding = el_utilities.cycl_subl_symbol_symbol( v_rule_after_adding );
                        final SubLObject item_var = ConsesLow.cons( v_rule_after_adding, assertions_high.assertion_mt( ass ) );
                        if( NIL == conses_high.member( item_var, Hashtables.gethash( pred, $rule_after_addings_hash$.getGlobalValue(), UNPROVIDED ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          Hashtables.sethash( pred, $rule_after_addings_hash$.getGlobalValue(), ConsesLow.cons( item_var, Hashtables.gethash( pred, $rule_after_addings_hash$.getGlobalValue(), UNPROVIDED ) ) );
                        }
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
                    }
                  }
                  done_var_$5 = makeBoolean( NIL == valid_$7 );
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
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$4, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$3, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 5056L)
  public static SubLObject initialize_rule_after_removings_hash()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$rule_after_removings_hash$.getGlobalValue().isHashtable() )
    {
      $rule_after_removings_hash$.setGlobalValue( Hashtables.make_hash_table( $int7$100, UNPROVIDED, UNPROVIDED ) );
    }
    else
    {
      Hashtables.clrhash( $rule_after_removings_hash$.getGlobalValue() );
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const9$EverythingPSC, thread );
      final SubLObject pred_var = $const13$ruleAfterRemoving;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$10 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw11$GAF, NIL, NIL );
                SubLObject done_var_$11 = NIL;
                final SubLObject token_var_$12 = NIL;
                while ( NIL == done_var_$11)
                {
                  final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$12 );
                  final SubLObject valid_$13 = makeBoolean( !token_var_$12.eql( ass ) );
                  if( NIL != valid_$13 )
                  {
                    final SubLObject formula = assertions_high.gaf_formula( ass );
                    SubLObject current;
                    final SubLObject datum = current = formula;
                    SubLObject rule_after_removing_pred = NIL;
                    SubLObject pred = NIL;
                    SubLObject rule_after_removing = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
                    rule_after_removing_pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
                    pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
                    rule_after_removing = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != forts.valid_fortP( pred ) )
                      {
                        rule_after_removing = el_utilities.cycl_subl_symbol_symbol( rule_after_removing );
                        final SubLObject item_var = ConsesLow.cons( rule_after_removing, assertions_high.assertion_mt( ass ) );
                        if( NIL == conses_high.member( item_var, Hashtables.gethash( pred, $rule_after_removings_hash$.getGlobalValue(), UNPROVIDED ), Symbols.symbol_function( EQL ), Symbols.symbol_function(
                            IDENTITY ) ) )
                        {
                          Hashtables.sethash( pred, $rule_after_removings_hash$.getGlobalValue(), ConsesLow.cons( item_var, Hashtables.gethash( pred, $rule_after_removings_hash$.getGlobalValue(), UNPROVIDED ) ) );
                        }
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
                    }
                  }
                  done_var_$11 = makeBoolean( NIL == valid_$13 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$10, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$9, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 5754L)
  public static SubLObject recache_rule_after_addings(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( predicate ) : predicate;
    if( NIL == $rule_after_addings_hash$.getGlobalValue() )
    {
      initialize_rule_after_addings_hash();
    }
    Hashtables.remhash( predicate, $rule_after_addings_hash$.getGlobalValue() );
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const9$EverythingPSC, thread );
      final SubLObject pred_var = $const10$ruleAfterAdding;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( predicate, NIL, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( predicate, NIL, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw11$GAF, NIL, NIL );
              SubLObject done_var_$15 = NIL;
              final SubLObject token_var_$16 = NIL;
              while ( NIL == done_var_$15)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$16 );
                final SubLObject valid_$17 = makeBoolean( !token_var_$16.eql( ass ) );
                if( NIL != valid_$17 && NIL != assertions_high.assertion_arguments( ass ) )
                {
                  final SubLObject v_rule_after_adding = el_utilities.cycl_subl_symbol_symbol( assertions_high.gaf_arg( ass, TWO_INTEGER ) );
                  final SubLObject item_var = ConsesLow.cons( v_rule_after_adding, assertions_high.assertion_mt( ass ) );
                  if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    ans = ConsesLow.cons( item_var, ans );
                  }
                }
                done_var_$15 = makeBoolean( NIL == valid_$17 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
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
    if( NIL != ans )
    {
      Hashtables.sethash( predicate, $rule_after_addings_hash$.getGlobalValue(), Sequences.nreverse( ans ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 6392L)
  public static SubLObject recache_rule_after_removings(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( predicate ) : predicate;
    if( NIL == $rule_after_removings_hash$.getGlobalValue() )
    {
      initialize_rule_after_removings_hash();
    }
    Hashtables.remhash( predicate, $rule_after_removings_hash$.getGlobalValue() );
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const9$EverythingPSC, thread );
      final SubLObject pred_var = $const13$ruleAfterRemoving;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( predicate, NIL, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( predicate, NIL, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw11$GAF, NIL, NIL );
              SubLObject done_var_$19 = NIL;
              final SubLObject token_var_$20 = NIL;
              while ( NIL == done_var_$19)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$20 );
                final SubLObject valid_$21 = makeBoolean( !token_var_$20.eql( ass ) );
                if( NIL != valid_$21 && NIL != assertions_high.assertion_arguments( ass ) )
                {
                  final SubLObject rule_after_removing = el_utilities.cycl_subl_symbol_symbol( assertions_high.gaf_arg( ass, TWO_INTEGER ) );
                  final SubLObject item_var = ConsesLow.cons( rule_after_removing, assertions_high.assertion_mt( ass ) );
                  if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    ans = ConsesLow.cons( item_var, ans );
                  }
                }
                done_var_$19 = makeBoolean( NIL == valid_$21 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
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
    if( NIL != ans )
    {
      Hashtables.sethash( predicate, $rule_after_removings_hash$.getGlobalValue(), Sequences.nreverse( ans ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 7006L)
  public static SubLObject propagate_rule_after_adding(final SubLObject argument, final SubLObject assertion)
  {
    assert NIL != arguments.argument_p( argument ) : argument;
    if( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != assertions_high.assertion_has_truth( assertion, $kw16$TRUE ) )
    {
      final SubLObject formula = assertions_high.gaf_formula( assertion );
      if( el_utilities.literal_arity( formula, UNPROVIDED ).numE( TWO_INTEGER ) )
      {
        final SubLObject predicate = el_utilities.literal_arg1( formula, UNPROVIDED );
        final SubLObject function = el_utilities.cycl_subl_symbol_symbol( el_utilities.literal_arg2( formula, UNPROVIDED ) );
        final SubLObject mt = assertions_high.assertion_mt( assertion );
        if( NIL != forts.fort_p( predicate ) && function.isSymbol() && NIL != Symbols.fboundp( function ) && function != $sym17$PROPAGATE_RULE_AFTER_ADDING )
        {
          repropagate_rule_after_adding( predicate, function, mt );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 7789L)
  public static SubLObject repropagate_rule_after_adding(final SubLObject predicate, final SubLObject function, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( predicate ) : predicate;
    assert NIL != Types.symbolp( function ) : function;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    if( NIL != Symbols.fboundp( function ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        control_vars.$mapping_target$.bind( function, thread );
        mt_relevance_macros.$relevant_mt_function$.bind( $sym20$RELEVANT_MT_IS_SPEC_MT, thread );
        mt_relevance_macros.$mt$.bind( mt, thread );
        if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( predicate, NIL, NIL ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( predicate, NIL, NIL );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw21$RULE, NIL, NIL );
                SubLObject done_var_$23 = NIL;
                final SubLObject token_var_$24 = NIL;
                while ( NIL == done_var_$23)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$24 );
                  final SubLObject valid_$25 = makeBoolean( !token_var_$24.eql( assertion ) );
                  if( NIL != valid_$25 )
                  {
                    repropagate_rule_after_adding_internal( assertion, predicate );
                  }
                  done_var_$23 = makeBoolean( NIL == valid_$25 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        control_vars.$mapping_target$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 8313L)
  public static SubLObject repropagate_rule_after_adding_internal(final SubLObject assertion, final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_arguments = assertions_high.assertion_arguments( assertion );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym22$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( assertions_high.assertion_mt( assertion ), thread );
      SubLObject cdolist_list_var = v_arguments;
      SubLObject argument = NIL;
      argument = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject ignore_errors_tag = NIL;
        try
        {
          thread.throwStack.push( $kw5$IGNORE_ERRORS_TARGET );
          final SubLObject _prev_bind_0_$27 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $sym6$IGNORE_ERRORS_HANDLER ), thread );
            try
            {
              SubLObject cdolist_list_var_$28 = gather_literals_with_pred( assertion, predicate );
              SubLObject literal = NIL;
              literal = cdolist_list_var_$28.first();
              while ( NIL != cdolist_list_var_$28)
              {
                handle_rule_after_adding( control_vars.$mapping_target$.getDynamicValue( thread ), argument, literal, assertion );
                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                literal = cdolist_list_var_$28.first();
              }
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$27, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw5$IGNORE_ERRORS_TARGET );
        }
        finally
        {
          thread.throwStack.pop();
        }
        cdolist_list_var = cdolist_list_var.rest();
        argument = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 8787L)
  public static SubLObject gather_literals_with_pred(final SubLObject assertion, final SubLObject pred)
  {
    SubLObject literals = NIL;
    final SubLObject v_arity = arity.arity( pred );
    final SubLObject cnf = assertions_high.assertion_cnf( assertion );
    SubLObject cdolist_list_var = clauses.pos_lits( cnf );
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( pred.eql( el_utilities.literal_arg( literal, ZERO_INTEGER, UNPROVIDED ) ) && NIL != el_utilities.formula_arityE( literal, v_arity, UNPROVIDED ) )
      {
        literals = ConsesLow.cons( literal, literals );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return literals;
  }

  public static SubLObject declare_rule_after_adding_file()
  {
    SubLFiles.declareFunction( me, "clear_rule_after_addings", "CLEAR-RULE-AFTER-ADDINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_rule_after_removings", "CLEAR-RULE-AFTER-REMOVINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "handle_rule_after_addings", "HANDLE-RULE-AFTER-ADDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_rule_after_addings_int", "HANDLE-RULE-AFTER-ADDINGS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "handle_rule_after_removings", "HANDLE-RULE-AFTER-REMOVINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_rule_after_removings_int", "HANDLE-RULE-AFTER-REMOVINGS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "get_rule_after_addings", "GET-RULE-AFTER-ADDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_rule_after_removings", "GET-RULE-AFTER-REMOVINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_rule_after_adding", "HANDLE-RULE-AFTER-ADDING", 4, 0, false );
    SubLFiles.declareFunction( me, "handle_rule_after_removing", "HANDLE-RULE-AFTER-REMOVING", 4, 0, false );
    SubLFiles.declareFunction( me, "rebuild_rule_after_adding_caches", "REBUILD-RULE-AFTER-ADDING-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_rule_after_addings_hash", "INITIALIZE-RULE-AFTER-ADDINGS-HASH", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_rule_after_removings_hash", "INITIALIZE-RULE-AFTER-REMOVINGS-HASH", 0, 0, false );
    SubLFiles.declareFunction( me, "recache_rule_after_addings", "RECACHE-RULE-AFTER-ADDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "recache_rule_after_removings", "RECACHE-RULE-AFTER-REMOVINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "propagate_rule_after_adding", "PROPAGATE-RULE-AFTER-ADDING", 2, 0, false );
    SubLFiles.declareFunction( me, "repropagate_rule_after_adding", "REPROPAGATE-RULE-AFTER-ADDING", 3, 0, false );
    SubLFiles.declareFunction( me, "repropagate_rule_after_adding_internal", "REPROPAGATE-RULE-AFTER-ADDING-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_literals_with_pred", "GATHER-LITERALS-WITH-PRED", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_rule_after_adding_file()
  {
    $rule_after_adding_predicates$ = SubLFiles.deflexical( "*RULE-AFTER-ADDING-PREDICATES*", NIL );
    $rule_after_addings_hash$ = SubLFiles.deflexical( "*RULE-AFTER-ADDINGS-HASH*", ( maybeDefault( $sym0$_RULE_AFTER_ADDINGS_HASH_, $rule_after_addings_hash$, NIL ) ) );
    $rule_after_removings_hash$ = SubLFiles.deflexical( "*RULE-AFTER-REMOVINGS-HASH*", ( maybeDefault( $sym1$_RULE_AFTER_REMOVINGS_HASH_, $rule_after_removings_hash$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_rule_after_adding_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_RULE_AFTER_ADDINGS_HASH_ );
    subl_macro_promotions.declare_defglobal( $sym1$_RULE_AFTER_REMOVINGS_HASH_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rule_after_adding_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rule_after_adding_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rule_after_adding_file();
  }
  static
  {
    me = new rule_after_adding();
    $rule_after_adding_predicates$ = null;
    $rule_after_addings_hash$ = null;
    $rule_after_removings_hash$ = null;
    $sym0$_RULE_AFTER_ADDINGS_HASH_ = makeSymbol( "*RULE-AFTER-ADDINGS-HASH*" );
    $sym1$_RULE_AFTER_REMOVINGS_HASH_ = makeSymbol( "*RULE-AFTER-REMOVINGS-HASH*" );
    $sym2$ARGUMENT_P = makeSymbol( "ARGUMENT-P" );
    $sym3$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $list4 = ConsesLow.cons( makeSymbol( "FUN" ), makeSymbol( "FUN-MT" ) );
    $kw5$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym6$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $int7$100 = makeInteger( 100 );
    $sym8$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const9$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const10$ruleAfterAdding = constant_handles.reader_make_constant_shell( makeString( "ruleAfterAdding" ) );
    $kw11$GAF = makeKeyword( "GAF" );
    $list12 = ConsesLow.list( makeSymbol( "RULE-AFTER-ADDING-PRED" ), makeSymbol( "PRED" ), makeSymbol( "RULE-AFTER-ADDING" ) );
    $const13$ruleAfterRemoving = constant_handles.reader_make_constant_shell( makeString( "ruleAfterRemoving" ) );
    $list14 = ConsesLow.list( makeSymbol( "RULE-AFTER-REMOVING-PRED" ), makeSymbol( "PRED" ), makeSymbol( "RULE-AFTER-REMOVING" ) );
    $sym15$FORT_P = makeSymbol( "FORT-P" );
    $kw16$TRUE = makeKeyword( "TRUE" );
    $sym17$PROPAGATE_RULE_AFTER_ADDING = makeSymbol( "PROPAGATE-RULE-AFTER-ADDING" );
    $sym18$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym19$HLMT_P = makeSymbol( "HLMT-P" );
    $sym20$RELEVANT_MT_IS_SPEC_MT = makeSymbol( "RELEVANT-MT-IS-SPEC-MT" );
    $kw21$RULE = makeKeyword( "RULE" );
    $sym22$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
  }
}
/*
 * 
 * Total time: 388 ms
 * 
 */