package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mwp_rule
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.mwp_rule";
  public static final String myFingerPrint = "cf08c921bae47e5556ffec9aa39bb962b0ced5d6d21b3a99220c54f20e7d4539";
  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 3290L)
  private static SubLSymbol $mwp_rule_constraint_table_deriv$;
  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 3389L)
  private static SubLSymbol $mwp_rule_constraint_table_infl$;
  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 5079L)
  private static SubLSymbol $mwp_base_poses_for_reified_affix_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 5629L)
  private static SubLSymbol $mwp_rule_spec_table_deriv$;
  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 5733L)
  private static SubLSymbol $mwp_rule_spec_table_infl$;
  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7355L)
  private static SubLSymbol $mwp_sem_templates_for_reified_affix_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7774L)
  private static SubLSymbol $mwp_result_poses_for_reified_affix_caching_state$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$DERIV;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$PRED;
  private static final SubLSymbol $kw4$SEMX;
  private static final SubLSymbol $kw5$BASE_WORD_DENOT;
  private static final SubLSymbol $kw6$NON_WFF;
  private static final SubLSymbol $kw7$APPLY_AFFIX;
  private static final SubLSymbol $sym8$_MWP_RULE_CONSTRAINT_TABLE_DERIV_;
  private static final SubLInteger $int9$256;
  private static final SubLSymbol $sym10$_MWP_RULE_CONSTRAINT_TABLE_INFL_;
  private static final SubLSymbol $kw11$INFL;
  private static final SubLObject $const12$DerivationalAffix;
  private static final SubLString $str13$Getting_rule_constraints___;
  private static final SubLObject $const14$UnproductiveLexicalAffix;
  private static final SubLObject $const15$regularSuffix;
  private static final SubLSymbol $kw16$GAF;
  private static final SubLSymbol $kw17$POS;
  private static final SubLSymbol $sym18$MWP_BASE_POSES_FOR_REIFIED_AFFIX;
  private static final SubLSymbol $sym19$_POS;
  private static final SubLObject $const20$derivationalAffixBasePOS;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$_MWP_BASE_POSES_FOR_REIFIED_AFFIX_CACHING_STATE_;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$_MWP_RULE_SPEC_TABLE_DERIV_;
  private static final SubLSymbol $sym25$_MWP_RULE_SPEC_TABLE_INFL_;
  private static final SubLString $str26$Getting_rule_result_specs___;
  private static final SubLSymbol $sym27$MWP_SEM_TEMPLATES_FOR_REIFIED_AFFIX;
  private static final SubLSymbol $sym28$_SEMX;
  private static final SubLObject $const29$affixSemantics;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$_MWP_SEM_TEMPLATES_FOR_REIFIED_AFFIX_CACHING_STATE_;
  private static final SubLSymbol $sym32$MWP_RESULT_POSES_FOR_REIFIED_AFFIX;
  private static final SubLObject $const33$derivationalAffixResultPOS;
  private static final SubLSymbol $sym34$_MWP_RESULT_POSES_FOR_REIFIED_AFFIX_CACHING_STATE_;
  private static final SubLList $list35;

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 827L)
  public static SubLObject mwp_rule_p(final SubLObject obj)
  {
    return constant_handles.constant_p( obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 952L)
  public static SubLObject mwp_rule_from_constant(final SubLObject constant)
  {
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 1023L)
  public static SubLObject mwp_rule_constraints(final SubLObject rule, final SubLObject type)
  {
    return dictionary.dictionary_lookup( mwp_rule_constraint_table( type ), rule, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 1142L)
  public static SubLObject mwp_rule_result_specs(final SubLObject rule, final SubLObject type)
  {
    return dictionary.dictionary_lookup( mwp_rule_spec_table( type ), rule, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 1256L)
  public static SubLObject mwp_rule_constraint_table_init()
  {
    SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      do_mwp_rule_constraint_table_init( type );
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 1403L)
  public static SubLObject mwp_rule_spec_table_init()
  {
    SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      do_mwp_rule_spec_table_init( type );
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 1538L)
  public static SubLObject mwp_rule_apply(final SubLObject dpw, final SubLObject rule, final SubLObject type, final SubLObject affix_type)
  {
    SubLObject denot = NIL;
    SubLObject pred = NIL;
    SubLObject wu = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( dpw, dpw, $list0 );
    denot = dpw.first();
    SubLObject current = dpw.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, dpw, $list0 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, dpw, $list0 );
    wu = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject new_denot = NIL;
      SubLObject new_pred = NIL;
      final SubLObject new_wu = ( type == $kw1$DERIV ) ? lexicon_utilities.construct_word_unit( wu, rule, affix_type ) : wu;
      SubLObject cdolist_list_var = mwp_rule_result_specs( rule, type );
      SubLObject spec = NIL;
      spec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current_$2;
        final SubLObject datum_$1 = current_$2 = spec;
        SubLObject spec_type = NIL;
        SubLObject target = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list2 );
        spec_type = current_$2.first();
        current_$2 = current_$2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$1, $list2 );
        target = current_$2.first();
        current_$2 = current_$2.rest();
        if( NIL == current_$2 )
        {
          final SubLObject pcase_var = spec_type;
          if( pcase_var.eql( $kw3$PRED ) )
          {
            new_pred = target;
          }
          else if( pcase_var.eql( $kw4$SEMX ) )
          {
            if( NIL == mwp_wf_base_word_denotP( denot, target ) )
            {
              return $kw6$NON_WFF;
            }
            new_denot = conses_high.subst( denot, $kw5$BASE_WORD_DENOT, target, UNPROVIDED, UNPROVIDED );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$1, $list2 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        spec = cdolist_list_var.first();
      }
      if( NIL == new_pred )
      {
        new_pred = pred;
      }
      if( NIL == new_denot )
      {
        new_denot = ( type == $kw1$DERIV ) ? ConsesLow.list( $kw7$APPLY_AFFIX, rule, denot ) : denot;
        log_mwp_missing_affix_semx( rule, wu, operation_communication.the_cyclist(), numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED ) );
      }
      return ConsesLow.list( new_denot, new_pred, new_wu );
    }
    cdestructuring_bind.cdestructuring_bind_error( dpw, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 2578L)
  public static SubLObject mwp_wf_base_word_denotP(final SubLObject denot, final SubLObject target)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_bindings = ConsesLow.list( reader.bq_cons( $kw5$BASE_WORD_DENOT, denot ) );
    return makeBoolean( ( !lexicon_vars.$mwp_wff_filter_level$.getDynamicValue( thread ).isPositive() || NIL != rbp_wff.rbp_wf_template_argsP( target, v_bindings, ONE_INTEGER ) ) && ( !lexicon_vars.$mwp_wff_filter_level$
        .getDynamicValue( thread ).numG( ONE_INTEGER ) || NIL != rbp_wff.rbp_wf_template_argsP( target, v_bindings, TWO_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 2937L)
  public static SubLObject log_mwp_missing_affix_semx(final SubLObject affix, final SubLObject base_wu, final SubLObject cyclist, final SubLObject universal_date)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 3469L)
  public static SubLObject mwp_rule_constraint_table(final SubLObject type)
  {
    if( type.eql( $kw1$DERIV ) )
    {
      return $mwp_rule_constraint_table_deriv$.getGlobalValue();
    }
    if( type.eql( $kw11$INFL ) )
    {
      return $mwp_rule_constraint_table_infl$.getGlobalValue();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 3639L)
  public static SubLObject mwp_gather_rule_constraints_from_kb(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( type.eql( $kw1$DERIV ) )
    {
      SubLObject constraints = NIL;
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject reified_affixes = isa.all_fort_instances( $const12$DerivationalAffix, UNPROVIDED, UNPROVIDED );
        final SubLObject total = Sequences.length( reified_affixes );
        SubLObject so_far = ZERO_INTEGER;
        final SubLObject _prev_bind_0_$3 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_1_$4 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_2_$5 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( $str13$Getting_rule_constraints___ );
            SubLObject cdolist_list_var = reified_affixes;
            SubLObject reified_affix = NIL;
            reified_affix = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == isa.isaP( reified_affix, $const14$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED ) )
              {
                constraints = ConsesLow.cons( mwp_gather_rule_constraints_from_kb_for_derivational_affix( reified_affix ), constraints );
              }
              so_far = Numbers.add( so_far, ONE_INTEGER );
              utilities_macros.note_percent_progress( so_far, total );
              cdolist_list_var = cdolist_list_var.rest();
              reified_affix = cdolist_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$5, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$4, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$3, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      return constraints;
    }
    if( type.eql( $kw11$INFL ) )
    {
      SubLObject constraints = NIL;
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject pred_var = $const15$regularSuffix;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$5 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$5 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$6 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_9 = utilities_macros.$silent_progressP$.currentBinding( thread );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw16$GAF, NIL, NIL );
                  SubLObject done_var_$10 = NIL;
                  final SubLObject token_var_$11 = NIL;
                  while ( NIL == done_var_$10)
                  {
                    final SubLObject rule_as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$11 );
                    final SubLObject valid_$12 = makeBoolean( !token_var_$11.eql( rule_as ) );
                    if( NIL != valid_$12 )
                    {
                      final SubLObject rule = mwp_rule_from_constant( assertions_high.gaf_arg1( rule_as ) );
                      final SubLObject base_form = assertions_high.gaf_arg2( rule_as );
                      constraints = ConsesLow.cons( ConsesLow.list( rule, ConsesLow.list( ConsesLow.list( $kw3$PRED, base_form ) ) ), constraints );
                    }
                    done_var_$10 = makeBoolean( NIL == valid_$12 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_9, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$6, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$5, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$5, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      return constraints;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 4596L)
  public static SubLObject mwp_gather_rule_constraints_from_kb_for_derivational_affix(final SubLObject reified_affix)
  {
    final SubLObject rule = mwp_rule_from_constant( reified_affix );
    final SubLObject base_poses = mwp_base_poses_for_reified_affix( reified_affix, UNPROVIDED );
    SubLObject pos_constraints = NIL;
    SubLObject cdolist_list_var = base_poses;
    SubLObject base_pos = NIL;
    base_pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      pos_constraints = ConsesLow.cons( ConsesLow.list( $kw17$POS, base_pos ), pos_constraints );
      cdolist_list_var = cdolist_list_var.rest();
      base_pos = cdolist_list_var.first();
    }
    return ConsesLow.list( rule, pos_constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 5079L)
  public static SubLObject clear_mwp_base_poses_for_reified_affix()
  {
    final SubLObject cs = $mwp_base_poses_for_reified_affix_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 5079L)
  public static SubLObject remove_mwp_base_poses_for_reified_affix(final SubLObject reified_affix, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $mwp_base_poses_for_reified_affix_caching_state$.getGlobalValue(), ConsesLow.list( reified_affix, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 5079L)
  public static SubLObject mwp_base_poses_for_reified_affix_internal(final SubLObject reified_affix, final SubLObject mt)
  {
    return ask_utilities.ask_variable( $sym19$_POS, ConsesLow.listS( $const20$derivationalAffixBasePOS, reified_affix, $list21 ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 5079L)
  public static SubLObject mwp_base_poses_for_reified_affix(final SubLObject reified_affix, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $mwp_base_poses_for_reified_affix_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym18$MWP_BASE_POSES_FOR_REIFIED_AFFIX, $sym22$_MWP_BASE_POSES_FOR_REIFIED_AFFIX_CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( reified_affix, mt );
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
        if( reified_affix.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( mwp_base_poses_for_reified_affix_internal( reified_affix, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( reified_affix, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 5294L)
  public static SubLObject do_mwp_rule_constraint_table_init(final SubLObject type)
  {
    final SubLObject dict = mwp_rule_constraint_table( type );
    dictionary.clear_dictionary( dict );
    SubLObject cdolist_list_var = mwp_gather_rule_constraints_from_kb( type );
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject rule = NIL;
      SubLObject constraints = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      rule = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      constraints = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != constraints )
        {
          dictionary_utilities.dictionary_append( dict, rule, constraints );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return dict;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 5807L)
  public static SubLObject mwp_rule_spec_table(final SubLObject type)
  {
    if( type.eql( $kw1$DERIV ) )
    {
      return $mwp_rule_spec_table_deriv$.getGlobalValue();
    }
    if( type.eql( $kw11$INFL ) )
    {
      return $mwp_rule_spec_table_infl$.getGlobalValue();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 5959L)
  public static SubLObject mwp_gather_rule_result_specs_from_kb(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject specs = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( type.eql( $kw1$DERIV ) )
      {
        final SubLObject reified_affixes = isa.all_fort_instances( $const12$DerivationalAffix, UNPROVIDED, UNPROVIDED );
        final SubLObject total = Sequences.length( reified_affixes );
        SubLObject so_far = ZERO_INTEGER;
        final SubLObject _prev_bind_0_$14 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_1_$15 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_2_$16 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( $str26$Getting_rule_result_specs___ );
            SubLObject cdolist_list_var = reified_affixes;
            SubLObject reified_affix = NIL;
            reified_affix = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == isa.isaP( reified_affix, $const14$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED ) )
              {
                specs = ConsesLow.cons( mwp_rule_specs_for_derivational_affix( reified_affix ), specs );
              }
              so_far = Numbers.add( so_far, ONE_INTEGER );
              utilities_macros.note_percent_progress( so_far, total );
              cdolist_list_var = cdolist_list_var.rest();
              reified_affix = cdolist_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$16, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$15, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$14, thread );
        }
      }
      else if( type.eql( $kw11$INFL ) )
      {
        final SubLObject pred_var = $const15$regularSuffix;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$16 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$16 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$17 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_9 = utilities_macros.$silent_progressP$.currentBinding( thread );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw16$GAF, NIL, NIL );
                  SubLObject done_var_$21 = NIL;
                  final SubLObject token_var_$22 = NIL;
                  while ( NIL == done_var_$21)
                  {
                    final SubLObject rule_as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$22 );
                    final SubLObject valid_$23 = makeBoolean( !token_var_$22.eql( rule_as ) );
                    if( NIL != valid_$23 )
                    {
                      final SubLObject rule = mwp_rule_from_constant( assertions_high.gaf_arg1( rule_as ) );
                      final SubLObject derived_form = assertions_high.gaf_arg1( rule_as );
                      specs = ConsesLow.cons( ConsesLow.list( rule, ConsesLow.list( ConsesLow.list( $kw3$PRED, derived_form ) ) ), specs );
                    }
                    done_var_$21 = makeBoolean( NIL == valid_$23 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_9, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$17, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$16, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$16, thread );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return specs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 6691L)
  public static SubLObject mwp_rule_specs_for_derivational_affix(final SubLObject reified_affix)
  {
    final SubLObject rule = mwp_rule_from_constant( reified_affix );
    final SubLObject sem_templates = mwp_sem_templates_for_reified_affix( reified_affix, UNPROVIDED );
    final SubLObject result_pred = mwp_result_pred_for_reified_affix( reified_affix );
    SubLObject rule_specs = NIL;
    SubLObject cdolist_list_var = sem_templates;
    SubLObject sem_template = NIL;
    sem_template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rule_specs = ConsesLow.cons( ConsesLow.list( $kw4$SEMX, sem_template ), rule_specs );
      cdolist_list_var = cdolist_list_var.rest();
      sem_template = cdolist_list_var.first();
    }
    if( NIL != result_pred )
    {
      rule_specs = ConsesLow.cons( ConsesLow.list( $kw3$PRED, result_pred ), rule_specs );
    }
    return ConsesLow.list( rule, rule_specs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7355L)
  public static SubLObject clear_mwp_sem_templates_for_reified_affix()
  {
    final SubLObject cs = $mwp_sem_templates_for_reified_affix_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7355L)
  public static SubLObject remove_mwp_sem_templates_for_reified_affix(final SubLObject reified_affix, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $mwp_sem_templates_for_reified_affix_caching_state$.getGlobalValue(), ConsesLow.list( reified_affix, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7355L)
  public static SubLObject mwp_sem_templates_for_reified_affix_internal(final SubLObject reified_affix, final SubLObject mt)
  {
    return ask_utilities.ask_variable( $sym28$_SEMX, ConsesLow.listS( $const29$affixSemantics, reified_affix, $list30 ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7355L)
  public static SubLObject mwp_sem_templates_for_reified_affix(final SubLObject reified_affix, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $mwp_sem_templates_for_reified_affix_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym27$MWP_SEM_TEMPLATES_FOR_REIFIED_AFFIX, $sym31$_MWP_SEM_TEMPLATES_FOR_REIFIED_AFFIX_CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( reified_affix, mt );
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
        if( reified_affix.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( mwp_sem_templates_for_reified_affix_internal( reified_affix, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( reified_affix, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7560L)
  public static SubLObject mwp_result_pred_for_reified_affix(final SubLObject reified_affix)
  {
    SubLObject cdolist_list_var = mwp_result_poses_for_reified_affix( reified_affix, UNPROVIDED );
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred = morph_word.mwp_base_pred_of_pos( pos, UNPROVIDED );
      if( NIL != pred )
      {
        return pred;
      }
      cdolist_list_var = cdolist_list_var.rest();
      pos = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7774L)
  public static SubLObject clear_mwp_result_poses_for_reified_affix()
  {
    final SubLObject cs = $mwp_result_poses_for_reified_affix_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7774L)
  public static SubLObject remove_mwp_result_poses_for_reified_affix(final SubLObject reified_affix, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $mwp_result_poses_for_reified_affix_caching_state$.getGlobalValue(), ConsesLow.list( reified_affix, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7774L)
  public static SubLObject mwp_result_poses_for_reified_affix_internal(final SubLObject reified_affix, final SubLObject mt)
  {
    return ask_utilities.ask_variable( $sym19$_POS, ConsesLow.listS( $const33$derivationalAffixResultPOS, reified_affix, $list21 ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7774L)
  public static SubLObject mwp_result_poses_for_reified_affix(final SubLObject reified_affix, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $mwp_result_poses_for_reified_affix_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym32$MWP_RESULT_POSES_FOR_REIFIED_AFFIX, $sym34$_MWP_RESULT_POSES_FOR_REIFIED_AFFIX_CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( reified_affix, mt );
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
        if( reified_affix.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( mwp_result_poses_for_reified_affix_internal( reified_affix, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( reified_affix, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-rule.lisp", position = 7982L)
  public static SubLObject do_mwp_rule_spec_table_init(final SubLObject type)
  {
    final SubLObject dict = mwp_rule_spec_table( type );
    dictionary.clear_dictionary( dict );
    SubLObject cdolist_list_var = mwp_gather_rule_result_specs_from_kb( type );
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject rule = NIL;
      SubLObject specs = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
      rule = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
      specs = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != specs )
        {
          dictionary_utilities.dictionary_append( dict, rule, specs );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return dict;
  }

  public static SubLObject declare_mwp_rule_file()
  {
    SubLFiles.declareFunction( me, "mwp_rule_p", "MWP-RULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_rule_from_constant", "MWP-RULE-FROM-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_rule_constraints", "MWP-RULE-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_rule_result_specs", "MWP-RULE-RESULT-SPECS", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_rule_constraint_table_init", "MWP-RULE-CONSTRAINT-TABLE-INIT", 0, 0, false );
    SubLFiles.declareFunction( me, "mwp_rule_spec_table_init", "MWP-RULE-SPEC-TABLE-INIT", 0, 0, false );
    SubLFiles.declareFunction( me, "mwp_rule_apply", "MWP-RULE-APPLY", 4, 0, false );
    SubLFiles.declareFunction( me, "mwp_wf_base_word_denotP", "MWP-WF-BASE-WORD-DENOT?", 2, 0, false );
    SubLFiles.declareFunction( me, "log_mwp_missing_affix_semx", "LOG-MWP-MISSING-AFFIX-SEMX", 4, 0, false );
    SubLFiles.declareFunction( me, "mwp_rule_constraint_table", "MWP-RULE-CONSTRAINT-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_gather_rule_constraints_from_kb", "MWP-GATHER-RULE-CONSTRAINTS-FROM-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_gather_rule_constraints_from_kb_for_derivational_affix", "MWP-GATHER-RULE-CONSTRAINTS-FROM-KB-FOR-DERIVATIONAL-AFFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_mwp_base_poses_for_reified_affix", "CLEAR-MWP-BASE-POSES-FOR-REIFIED-AFFIX", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_mwp_base_poses_for_reified_affix", "REMOVE-MWP-BASE-POSES-FOR-REIFIED-AFFIX", 1, 1, false );
    SubLFiles.declareFunction( me, "mwp_base_poses_for_reified_affix_internal", "MWP-BASE-POSES-FOR-REIFIED-AFFIX-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_base_poses_for_reified_affix", "MWP-BASE-POSES-FOR-REIFIED-AFFIX", 1, 1, false );
    SubLFiles.declareFunction( me, "do_mwp_rule_constraint_table_init", "DO-MWP-RULE-CONSTRAINT-TABLE-INIT", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_rule_spec_table", "MWP-RULE-SPEC-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_gather_rule_result_specs_from_kb", "MWP-GATHER-RULE-RESULT-SPECS-FROM-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_rule_specs_for_derivational_affix", "MWP-RULE-SPECS-FOR-DERIVATIONAL-AFFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_mwp_sem_templates_for_reified_affix", "CLEAR-MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_mwp_sem_templates_for_reified_affix", "REMOVE-MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX", 1, 1, false );
    SubLFiles.declareFunction( me, "mwp_sem_templates_for_reified_affix_internal", "MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_sem_templates_for_reified_affix", "MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX", 1, 1, false );
    SubLFiles.declareFunction( me, "mwp_result_pred_for_reified_affix", "MWP-RESULT-PRED-FOR-REIFIED-AFFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_mwp_result_poses_for_reified_affix", "CLEAR-MWP-RESULT-POSES-FOR-REIFIED-AFFIX", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_mwp_result_poses_for_reified_affix", "REMOVE-MWP-RESULT-POSES-FOR-REIFIED-AFFIX", 1, 1, false );
    SubLFiles.declareFunction( me, "mwp_result_poses_for_reified_affix_internal", "MWP-RESULT-POSES-FOR-REIFIED-AFFIX-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_result_poses_for_reified_affix", "MWP-RESULT-POSES-FOR-REIFIED-AFFIX", 1, 1, false );
    SubLFiles.declareFunction( me, "do_mwp_rule_spec_table_init", "DO-MWP-RULE-SPEC-TABLE-INIT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_mwp_rule_file()
  {
    $mwp_rule_constraint_table_deriv$ = SubLFiles.deflexical( "*MWP-RULE-CONSTRAINT-TABLE-DERIV*", maybeDefault( $sym8$_MWP_RULE_CONSTRAINT_TABLE_DERIV_, $mwp_rule_constraint_table_deriv$, () -> ( dictionary
        .new_dictionary( Symbols.symbol_function( EQL ), $int9$256 ) ) ) );
    $mwp_rule_constraint_table_infl$ = SubLFiles.deflexical( "*MWP-RULE-CONSTRAINT-TABLE-INFL*", maybeDefault( $sym10$_MWP_RULE_CONSTRAINT_TABLE_INFL_, $mwp_rule_constraint_table_infl$, () -> ( dictionary.new_dictionary(
        Symbols.symbol_function( EQL ), $int9$256 ) ) ) );
    $mwp_base_poses_for_reified_affix_caching_state$ = SubLFiles.deflexical( "*MWP-BASE-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL );
    $mwp_rule_spec_table_deriv$ = SubLFiles.deflexical( "*MWP-RULE-SPEC-TABLE-DERIV*", maybeDefault( $sym24$_MWP_RULE_SPEC_TABLE_DERIV_, $mwp_rule_spec_table_deriv$, () -> ( dictionary.new_dictionary( Symbols
        .symbol_function( EQL ), $int9$256 ) ) ) );
    $mwp_rule_spec_table_infl$ = SubLFiles.deflexical( "*MWP-RULE-SPEC-TABLE-INFL*", maybeDefault( $sym25$_MWP_RULE_SPEC_TABLE_INFL_, $mwp_rule_spec_table_infl$, () -> ( dictionary.new_dictionary( Symbols
        .symbol_function( EQL ), $int9$256 ) ) ) );
    $mwp_sem_templates_for_reified_affix_caching_state$ = SubLFiles.deflexical( "*MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL );
    $mwp_result_poses_for_reified_affix_caching_state$ = SubLFiles.deflexical( "*MWP-RESULT-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_mwp_rule_file()
  {
    subl_macro_promotions.declare_defglobal( $sym8$_MWP_RULE_CONSTRAINT_TABLE_DERIV_ );
    subl_macro_promotions.declare_defglobal( $sym10$_MWP_RULE_CONSTRAINT_TABLE_INFL_ );
    memoization_state.note_globally_cached_function( $sym18$MWP_BASE_POSES_FOR_REIFIED_AFFIX );
    subl_macro_promotions.declare_defglobal( $sym24$_MWP_RULE_SPEC_TABLE_DERIV_ );
    subl_macro_promotions.declare_defglobal( $sym25$_MWP_RULE_SPEC_TABLE_INFL_ );
    memoization_state.note_globally_cached_function( $sym27$MWP_SEM_TEMPLATES_FOR_REIFIED_AFFIX );
    memoization_state.note_globally_cached_function( $sym32$MWP_RESULT_POSES_FOR_REIFIED_AFFIX );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_mwp_rule_file();
  }

  @Override
  public void initializeVariables()
  {
    init_mwp_rule_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_mwp_rule_file();
  }
  static
  {
    me = new mwp_rule();
    $mwp_rule_constraint_table_deriv$ = null;
    $mwp_rule_constraint_table_infl$ = null;
    $mwp_base_poses_for_reified_affix_caching_state$ = null;
    $mwp_rule_spec_table_deriv$ = null;
    $mwp_rule_spec_table_infl$ = null;
    $mwp_sem_templates_for_reified_affix_caching_state$ = null;
    $mwp_result_poses_for_reified_affix_caching_state$ = null;
    $list0 = ConsesLow.list( makeSymbol( "DENOT" ), makeSymbol( "PRED" ), makeSymbol( "WU" ) );
    $kw1$DERIV = makeKeyword( "DERIV" );
    $list2 = ConsesLow.list( makeSymbol( "SPEC-TYPE" ), makeSymbol( "TARGET" ) );
    $kw3$PRED = makeKeyword( "PRED" );
    $kw4$SEMX = makeKeyword( "SEMX" );
    $kw5$BASE_WORD_DENOT = makeKeyword( "BASE-WORD-DENOT" );
    $kw6$NON_WFF = makeKeyword( "NON-WFF" );
    $kw7$APPLY_AFFIX = makeKeyword( "APPLY-AFFIX" );
    $sym8$_MWP_RULE_CONSTRAINT_TABLE_DERIV_ = makeSymbol( "*MWP-RULE-CONSTRAINT-TABLE-DERIV*" );
    $int9$256 = makeInteger( 256 );
    $sym10$_MWP_RULE_CONSTRAINT_TABLE_INFL_ = makeSymbol( "*MWP-RULE-CONSTRAINT-TABLE-INFL*" );
    $kw11$INFL = makeKeyword( "INFL" );
    $const12$DerivationalAffix = constant_handles.reader_make_constant_shell( makeString( "DerivationalAffix" ) );
    $str13$Getting_rule_constraints___ = makeString( "Getting rule constraints..." );
    $const14$UnproductiveLexicalAffix = constant_handles.reader_make_constant_shell( makeString( "UnproductiveLexicalAffix" ) );
    $const15$regularSuffix = constant_handles.reader_make_constant_shell( makeString( "regularSuffix" ) );
    $kw16$GAF = makeKeyword( "GAF" );
    $kw17$POS = makeKeyword( "POS" );
    $sym18$MWP_BASE_POSES_FOR_REIFIED_AFFIX = makeSymbol( "MWP-BASE-POSES-FOR-REIFIED-AFFIX" );
    $sym19$_POS = makeSymbol( "?POS" );
    $const20$derivationalAffixBasePOS = constant_handles.reader_make_constant_shell( makeString( "derivationalAffixBasePOS" ) );
    $list21 = ConsesLow.list( makeSymbol( "?POS" ) );
    $sym22$_MWP_BASE_POSES_FOR_REIFIED_AFFIX_CACHING_STATE_ = makeSymbol( "*MWP-BASE-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*" );
    $list23 = ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "CONSTRAINTS" ) );
    $sym24$_MWP_RULE_SPEC_TABLE_DERIV_ = makeSymbol( "*MWP-RULE-SPEC-TABLE-DERIV*" );
    $sym25$_MWP_RULE_SPEC_TABLE_INFL_ = makeSymbol( "*MWP-RULE-SPEC-TABLE-INFL*" );
    $str26$Getting_rule_result_specs___ = makeString( "Getting rule result specs..." );
    $sym27$MWP_SEM_TEMPLATES_FOR_REIFIED_AFFIX = makeSymbol( "MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX" );
    $sym28$_SEMX = makeSymbol( "?SEMX" );
    $const29$affixSemantics = constant_handles.reader_make_constant_shell( makeString( "affixSemantics" ) );
    $list30 = ConsesLow.list( makeSymbol( "?SEMX" ) );
    $sym31$_MWP_SEM_TEMPLATES_FOR_REIFIED_AFFIX_CACHING_STATE_ = makeSymbol( "*MWP-SEM-TEMPLATES-FOR-REIFIED-AFFIX-CACHING-STATE*" );
    $sym32$MWP_RESULT_POSES_FOR_REIFIED_AFFIX = makeSymbol( "MWP-RESULT-POSES-FOR-REIFIED-AFFIX" );
    $const33$derivationalAffixResultPOS = constant_handles.reader_make_constant_shell( makeString( "derivationalAffixResultPOS" ) );
    $sym34$_MWP_RESULT_POSES_FOR_REIFIED_AFFIX_CACHING_STATE_ = makeSymbol( "*MWP-RESULT-POSES-FOR-REIFIED-AFFIX-CACHING-STATE*" );
    $list35 = ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "SPECS" ) );
  }
}
/*
 * 
 * Total time: 299 ms
 * 
 */