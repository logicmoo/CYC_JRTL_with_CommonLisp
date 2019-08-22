package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_gaf_components
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_gaf_components";
  public static final String myFingerPrint = "98334943796ae4eab3b164d5942753e90ade80e29d5c74c11d0740604b1550bd";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 836L)
  private static SubLSymbol $default_gaf_predicate_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 968L)
  public static SubLSymbol $gaf_predicate_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 1040L)
  private static SubLSymbol $gaf_predicate_code_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 8713L)
  private static SubLSymbol $default_gaf_argument_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 8806L)
  public static SubLSymbol $gaf_argument_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 8876L)
  private static SubLSymbol $gaf_argument_code_rule$;
  private static final SubLObject $const0$gafPredicate;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $sym2$_GAF_PREDICATE_DEFINING_MT_;
  private static final SubLObject $const3$BaseKB;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$CODE;
  private static final SubLSymbol $kw6$TRUE_MON;
  private static final SubLSymbol $kw7$REMOVAL_GAF_PREDICATE_PRUNE_ON_GAF_POS;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$REMOVAL_GAF_PREDICATE_PRUNE_ON_PREDICATE_POS;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$REMOVAL_GAF_PREDICATE_CHECK_POS;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$REMOVAL_GAF_PREDICATE_BOUND_UNBOUND_POS;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$REMOVAL_GAF_PREDICATE_UNBOUND_BOUND_POS;
  private static final SubLList $list16;
  private static final SubLObject $const17$gafArgument;
  private static final SubLSymbol $sym18$_GAF_ARGUMENT_DEFINING_MT_;
  private static final SubLList $list19;
  private static final SubLSymbol $kw20$REMOVAL_GAF_ARGUMENT_PRUNE_POS;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$REMOVAL_GAF_ARGUMENT_CHECK_POS;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$REMOVAL_GAF_ARGUMENT_BOUND_BOUND_UNBOUND_POS;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$REMOVAL_GAF_ARGUMENT_BOUND_UNBOUND_UNBOUND_POS;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$IGNORE;
  private static final SubLSymbol $kw29$REMOVAL_GAF_ARGUMENT_UNBOUND_BOUND_BOUND_POS;
  private static final SubLList $list30;
  private static final SubLSymbol $kw31$GAF;
  private static final SubLSymbol $kw32$REMOVAL_GAF_ARGUMENT_UNBOUND_UNBOUND_BOUND_POS;
  private static final SubLList $list33;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 1237L)
  public static SubLObject make_gaf_predicate_code_rule_support()
  {
    return arguments.make_hl_support( $kw5$CODE, $gaf_predicate_code_rule$.getGlobalValue(), $gaf_predicate_defining_mt$.getGlobalValue(), $kw6$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 6635L)
  public static SubLObject removal_gaf_predicate_bound_unbound_cost(final SubLObject asent)
  {
    final SubLObject formula = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    return kb_indexing.count_all_gafs( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 8315L)
  public static SubLObject removal_gaf_predicate_unbound_bound_cost(final SubLObject asent)
  {
    final SubLObject pred = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    return kb_indexing.relevant_num_predicate_extent_index( pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 9065L)
  public static SubLObject make_gaf_argument_code_rule_support()
  {
    return arguments.make_hl_support( $kw5$CODE, $gaf_argument_code_rule$.getGlobalValue(), $gaf_argument_defining_mt$.getGlobalValue(), $kw6$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 14090L)
  public static SubLObject removal_gaf_argument_bound_bound_unbound_cost(final SubLObject asent)
  {
    final SubLObject formula = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject argnum = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != el_utilities.formula_has_arg_position_p( formula, ConsesLow.list( argnum ) ) )
    {
      return kb_indexing.count_all_gafs( formula );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 16330L)
  public static SubLObject removal_gaf_argument_bound_unbound_unbound_cost(final SubLObject asent)
  {
    final SubLObject formula = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    if( NIL != variables.variable_p( v_term ) )
    {
      return Numbers.multiply( kb_indexing.count_all_gafs( formula ), Sequences.length( formula ) );
    }
    if( NIL == el_utilities.term_occurs_as_formula_argument( v_term, formula ) && NIL == removal_modules_formula_arg_n.formula_has_operatorP( formula, v_term ) )
    {
      return ZERO_INTEGER;
    }
    return kb_indexing.count_all_gafs( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 17517L)
  public static SubLObject term_arg_pos_for_formula(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_bindings = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt_relevance_macros.current_mt_relevance_mt() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject terms = cycl_utilities.formula_terms( formula, $kw28$IGNORE );
      SubLObject list_var = NIL;
      SubLObject term_var = NIL;
      SubLObject argnum = NIL;
      list_var = terms;
      term_var = list_var.first();
      for( argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), term_var = list_var.first(), argnum = number_utilities.f_1X( argnum ) )
      {
        v_bindings = ConsesLow.cons( ConsesLow.list( argnum, term_var ), v_bindings );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 18784L)
  public static SubLObject removal_gaf_argument_unbound_unbound_bound_cost(final SubLObject asent)
  {
    final SubLObject fort = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject argnum = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != variables.variable_p( argnum ) )
    {
      return kb_indexing.relevant_num_gaf_arg_index( fort, UNPROVIDED, UNPROVIDED );
    }
    if( argnum.isZero() )
    {
      return kb_indexing.relevant_num_predicate_extent_index( fort );
    }
    return kb_indexing.relevant_num_gaf_arg_index( fort, argnum, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 19357L)
  public static SubLObject get_gafs_with_term_argnum(final SubLObject v_term, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject gafs = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt_relevance_macros.current_mt_relevance_mt() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( argnum.isZero() )
      {
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( v_term ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
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
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( v_term );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw31$GAF, NIL, NIL );
                  SubLObject done_var_$4 = NIL;
                  final SubLObject token_var_$5 = NIL;
                  while ( NIL == done_var_$4)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                    final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( ass ) );
                    if( NIL != valid_$6 )
                    {
                      gafs = ConsesLow.cons( assertions_high.gaf_el_formula( ass ), gafs );
                    }
                    done_var_$4 = makeBoolean( NIL == valid_$6 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
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
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$3, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$2, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$1, thread );
          }
        }
      }
      else
      {
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
        {
          final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
          SubLObject done_var2 = NIL;
          final SubLObject token_var2 = NIL;
          while ( NIL == done_var2)
          {
            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
            final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
            if( NIL != valid2 )
            {
              SubLObject final_index_iterator2 = NIL;
              try
              {
                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw31$GAF, NIL, NIL );
                SubLObject done_var_$5 = NIL;
                final SubLObject token_var_$6 = NIL;
                while ( NIL == done_var_$5)
                {
                  final SubLObject ass2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$6 );
                  final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( ass2 ) );
                  if( NIL != valid_$7 )
                  {
                    gafs = ConsesLow.cons( assertions_high.gaf_el_formula( ass2 ), gafs );
                  }
                  done_var_$5 = makeBoolean( NIL == valid_$7 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator2 )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
                }
              }
            }
            done_var2 = makeBoolean( NIL == valid2 );
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
    return gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-gaf-components.lisp", position = 20993L)
  public static SubLObject get_gaf_argnum_tuple_with_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject gafs = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt_relevance_macros.current_mt_relevance_mt() );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pred_var = NIL;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, NIL, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, NIL, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw31$GAF, NIL, NIL );
              SubLObject done_var_$12 = NIL;
              final SubLObject token_var_$13 = NIL;
              while ( NIL == done_var_$12)
              {
                final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$13 );
                final SubLObject valid_$14 = makeBoolean( !token_var_$13.eql( ass ) );
                if( NIL != valid_$14 )
                {
                  final SubLObject terms = cycl_utilities.formula_terms( ass, $kw28$IGNORE );
                  SubLObject list_var = NIL;
                  SubLObject term_var = NIL;
                  SubLObject argnum = NIL;
                  list_var = terms;
                  term_var = list_var.first();
                  for( argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), term_var = list_var.first(), argnum = number_utilities.f_1X( argnum ) )
                  {
                    if( v_term.eql( term_var ) )
                    {
                      gafs = ConsesLow.cons( ConsesLow.list( assertions_high.gaf_el_formula( ass ), argnum ), gafs );
                    }
                  }
                }
                done_var_$12 = makeBoolean( NIL == valid_$14 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return gafs;
  }

  public static SubLObject declare_removal_modules_gaf_components_file()
  {
    SubLFiles.declareFunction( me, "make_gaf_predicate_code_rule_support", "MAKE-GAF-PREDICATE-CODE-RULE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_gaf_predicate_bound_unbound_cost", "REMOVAL-GAF-PREDICATE-BOUND-UNBOUND-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_gaf_predicate_unbound_bound_cost", "REMOVAL-GAF-PREDICATE-UNBOUND-BOUND-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "make_gaf_argument_code_rule_support", "MAKE-GAF-ARGUMENT-CODE-RULE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "removal_gaf_argument_bound_bound_unbound_cost", "REMOVAL-GAF-ARGUMENT-BOUND-BOUND-UNBOUND-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_gaf_argument_bound_unbound_unbound_cost", "REMOVAL-GAF-ARGUMENT-BOUND-UNBOUND-UNBOUND-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "term_arg_pos_for_formula", "TERM-ARG-POS-FOR-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_gaf_argument_unbound_unbound_bound_cost", "REMOVAL-GAF-ARGUMENT-UNBOUND-UNBOUND-BOUND-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "get_gafs_with_term_argnum", "GET-GAFS-WITH-TERM-ARGNUM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_gaf_argnum_tuple_with_term", "GET-GAF-ARGNUM-TUPLE-WITH-TERM", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_gaf_components_file()
  {
    $default_gaf_predicate_check_cost$ = SubLFiles.deflexical( "*DEFAULT-GAF-PREDICATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $gaf_predicate_defining_mt$ = SubLFiles.deflexical( "*GAF-PREDICATE-DEFINING-MT*", maybeDefault( $sym2$_GAF_PREDICATE_DEFINING_MT_, $gaf_predicate_defining_mt$, $const3$BaseKB ) );
    $gaf_predicate_code_rule$ = SubLFiles.deflexical( "*GAF-PREDICATE-CODE-RULE*", $list4 );
    $default_gaf_argument_check_cost$ = SubLFiles.deflexical( "*DEFAULT-GAF-ARGUMENT-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $gaf_argument_defining_mt$ = SubLFiles.deflexical( "*GAF-ARGUMENT-DEFINING-MT*", maybeDefault( $sym18$_GAF_ARGUMENT_DEFINING_MT_, $gaf_argument_defining_mt$, $const3$BaseKB ) );
    $gaf_argument_code_rule$ = SubLFiles.deflexical( "*GAF-ARGUMENT-CODE-RULE*", $list19 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_gaf_components_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$gafPredicate );
    preference_modules.doomed_unless_either_arg_bindable( $kw1$POS, $const0$gafPredicate );
    subl_macro_promotions.declare_defglobal( $sym2$_GAF_PREDICATE_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym2$_GAF_PREDICATE_DEFINING_MT_, $const0$gafPredicate );
    inference_modules.inference_removal_pruning_module( $kw7$REMOVAL_GAF_PREDICATE_PRUNE_ON_GAF_POS, $list8 );
    inference_modules.inference_removal_pruning_module( $kw9$REMOVAL_GAF_PREDICATE_PRUNE_ON_PREDICATE_POS, $list10 );
    inference_modules.inference_removal_module( $kw11$REMOVAL_GAF_PREDICATE_CHECK_POS, $list12 );
    inference_modules.inference_removal_module( $kw13$REMOVAL_GAF_PREDICATE_BOUND_UNBOUND_POS, $list14 );
    inference_modules.inference_removal_module( $kw15$REMOVAL_GAF_PREDICATE_UNBOUND_BOUND_POS, $list16 );
    inference_modules.register_solely_specific_removal_module_predicate( $const17$gafArgument );
    subl_macro_promotions.declare_defglobal( $sym18$_GAF_ARGUMENT_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym18$_GAF_ARGUMENT_DEFINING_MT_, $const17$gafArgument );
    inference_modules.inference_removal_pruning_module( $kw20$REMOVAL_GAF_ARGUMENT_PRUNE_POS, $list21 );
    inference_modules.inference_removal_module( $kw22$REMOVAL_GAF_ARGUMENT_CHECK_POS, $list23 );
    inference_modules.inference_removal_module( $kw24$REMOVAL_GAF_ARGUMENT_BOUND_BOUND_UNBOUND_POS, $list25 );
    inference_modules.inference_removal_module( $kw26$REMOVAL_GAF_ARGUMENT_BOUND_UNBOUND_UNBOUND_POS, $list27 );
    inference_modules.inference_removal_module( $kw29$REMOVAL_GAF_ARGUMENT_UNBOUND_BOUND_BOUND_POS, $list30 );
    inference_modules.inference_removal_module( $kw32$REMOVAL_GAF_ARGUMENT_UNBOUND_UNBOUND_BOUND_POS, $list33 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_gaf_components_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_gaf_components_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_gaf_components_file();
  }
  static
  {
    me = new removal_modules_gaf_components();
    $default_gaf_predicate_check_cost$ = null;
    $gaf_predicate_defining_mt$ = null;
    $gaf_predicate_code_rule$ = null;
    $default_gaf_argument_check_cost$ = null;
    $gaf_argument_defining_mt$ = null;
    $gaf_argument_code_rule$ = null;
    $const0$gafPredicate = constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) );
    $kw1$POS = makeKeyword( "POS" );
    $sym2$_GAF_PREDICATE_DEFINING_MT_ = makeSymbol( "*GAF-PREDICATE-DEFINING-MT*" );
    $const3$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $list4 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "assertedSentence" ) ), makeSymbol( "?ASENT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "operatorFormulas" ) ), makeSymbol( "?PRED" ),
            makeSymbol( "?ASENT" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), makeSymbol( "?ASENT" ), makeSymbol( "?PRED" ) ) );
    $kw5$CODE = makeKeyword( "CODE" );
    $kw6$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw7$REMOVAL_GAF_PREDICATE_PRUNE_ON_GAF_POS = makeKeyword( "REMOVAL-GAF-PREDICATE-PRUNE-ON-GAF-POS" );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ),
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "NOT" ), makeKeyword( "SENTENCE" ) ), ConsesLow
                .list( makeKeyword( "AND" ), makeKeyword( "SENTENCE" ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FIND-GAF-IN-RELEVANT-MT" ) ) ) ) ), makeKeyword(
                    "ANYTHING" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$gafPredicate <fully-bound> <anything>) \nwhere there is no existing GAF matching ARG1" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$gafPredicate (#$arity #$isa 3) #$arity)\n    (#$gafPredicate #$isa #$isa)" )
    } );
    $kw9$REMOVAL_GAF_PREDICATE_PRUNE_ON_PREDICATE_POS = makeKeyword( "REMOVAL-GAF-PREDICATE-PRUNE-ON-PREDICATE-POS" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow
            .list( makeKeyword( "BIND" ), makeSymbol( "PRED" ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list(
                makeKeyword( "VALUE" ), makeSymbol( "PRED" ) ) ) ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "COST-EXPRESSION" ), ZERO_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword(
                    "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$gafPredicate <fully-bound> <anything>) \n   where operator of formula in ARG1 doesn't match ARG2" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$gafPredicate (#$arity #$isa 2) #$isa)" )
    } );
    $kw11$REMOVAL_GAF_PREDICATE_CHECK_POS = makeKeyword( "REMOVAL-GAF-PREDICATE-CHECK-POS" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-GAF-PREDICATE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "PREDICATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "PREDICATE" ) ) ) ), makeKeyword(
                  "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "PREDICATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                      "FORMULA-HAS-OPERATOR?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "PREDICATE" ) ) ) ), makeKeyword(
                          "SUPPORT-MODULE" ), makeKeyword( "GAF" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
                              "(#$gafPredicate <fully-bound> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                  "(#$gafPredicate (#$arity #$isa 2) #$arity)\n   Estimate: 0.50; Actual: 1\n   Vijay: Should we leave it at that. Since it a check module? Should we try to match\n   Actual to estimate or vice-versa, to be accurate always." )
    } );
    $kw13$REMOVAL_GAF_PREDICATE_BOUND_UNBOUND_POS = makeKeyword( "REMOVAL-GAF-PREDICATE-BOUND-UNBOUND-POS" );
    $list14 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
            "BIND" ), makeSymbol( "FORMULA" ) ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-GAF-PREDICATE-BOUND-UNBOUND-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), ConsesLow
                    .list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ), makeKeyword(
                        "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ),
                            ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "FORMULA-ARG0" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
          "SUPPORT-MODULE" ), makeKeyword( "GAF" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$gafPredicate <sentence> <not-fully-bound>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$gafPredicate (#$arity #$isa 2) ?WHAT)\n   Estimate: 2; Actual: 1\n   @todo: We could improve count-all-gafs to be mt relevant?" )
    } );
    $kw15$REMOVAL_GAF_PREDICATE_UNBOUND_BOUND_POS = makeKeyword( "REMOVAL-GAF-PREDICATE-UNBOUND-BOUND-POS" );
    $list16 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-GAF-PREDICATE-UNBOUND-BOUND-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "gafPredicate" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "PREDICATE" ) ) ), ConsesLow.list( ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "PREDICATE" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "PREDICATE" ) ), ConsesLow.list(
                  makeKeyword( "CALL" ), makeSymbol( "GATHER-PREDICATE-EXTENT-INDEX" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "PREDICATE" ) ) ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list(
                      makeKeyword( "CALL" ), makeSymbol( "GAF-FORMULA" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                          "gafPredicate" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "PREDICATE" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "GAF" ), makeKeyword(
                              "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$gafPredicate <not-fully-bound> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                  "(#$gafPredicate ?WHAT #$defnSufficient) BaseKB KB 1174\n   Estimate: 328; Actual: 328\n   (#$gafPredicate ?WHAT #$defnSufficient) LogicalTruthImplementationMt\n   Estimate: 2; Actual: 2" )
    } );
    $const17$gafArgument = constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) );
    $sym18$_GAF_ARGUMENT_DEFINING_MT_ = makeSymbol( "*GAF-ARGUMENT-DEFINING-MT*" );
    $list19 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "assertedSentence" ) ), makeSymbol( "?ASENT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "argN" ) ), makeSymbol( "?TERM" ), makeSymbol(
            "?N" ), makeSymbol( "?ASENT" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeSymbol( "?ASENT" ), makeSymbol( "?N" ), makeSymbol( "?TERM" ) ) );
    $kw20$REMOVAL_GAF_ARGUMENT_PRUNE_POS = makeKeyword( "REMOVAL-GAF-ARGUMENT-PRUNE-POS" );
    $list21 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ),
            makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow
                .list( makeKeyword( "NOT" ), makeKeyword( "SENTENCE" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "SENTENCE" ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ),
                    makeSymbol( "FIND-GAF-IN-RELEVANT-MT" ) ) ) ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ),
                        makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "NOT" ), makeKeyword( "INTEGER" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "ANYTHING" ) ) ) ),
      makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "COST-EXPRESSION" ), ZERO_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$gafArgument <fully-bound> <anything> <anything>) \n    where there is no existing GAF matching ARG1" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$gafArgument (#$arity #$isa 3) 2 #$isa)\n    ;; Vijay: Is it possible for inference engine to try non-semantic / non-syntactic\n    ;; WFF bindings? If we are guaranteed to not encounter a case where a non-integer\n    ;; is placed in integer position, we can probably simplify the pruning.\n    (#$gafArgument (#$arity #$isa 3) #$isa #$isa)\n    (#$gafArgument #$isa 1 #$isa)" )
    } );
    $kw22$REMOVAL_GAF_ARGUMENT_CHECK_POS = makeKeyword( "REMOVAL-GAF-ARGUMENT-CHECK-POS" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "INTEGER" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-GAF-ARGUMENT-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
          "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "BIND" ),
              makeSymbol( "ARG-POS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "ARG-POS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                      makeSymbol( "FORMULA" ), makeSymbol( "ARG-POS" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "EL-FORMULA-HAS-ARG?" ), ConsesLow.list( makeKeyword( "VALUE" ),
                          makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARG-POS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ),
      makeKeyword( "GAF" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$gafArgument <sentence> <integer> <fully-bound>)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$gafArgument (#$isa #$Muffet #$Poodle) 2 #$Poodle)\n    Estimate: 0.50; Actual: 1; Its a check module. Still should we match?\n    (#$gafArgument (#$isa #$Muffet #$Dog) 2 #$Dog) - false" )
    } );
    $kw24$REMOVAL_GAF_ARGUMENT_BOUND_BOUND_UNBOUND_POS = makeKeyword( "REMOVAL-GAF-ARGUMENT-BOUND-BOUND-UNBOUND-POS" );
    $list25 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "INTEGER" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "COST" ), makeSymbol( "REMOVAL-GAF-ARGUMENT-BOUND-BOUND-UNBOUND-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
          "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "BIND" ),
              makeSymbol( "ARG-POS" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                  "ARG-POS" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "ARG-POS" ) ), ConsesLow.list( makeKeyword(
                      "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "EL-FORMULA-ARG" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ),
                          ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARG-POS" ) ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "gafArgument" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARG-POS" ) ), makeKeyword( "INPUT" ) ),
      makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "GAF" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$gafArgument <sentence> <integer> <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$gafArgument (#$isa #$Muffet #$Poodle) 2 ?WHAT) - CyclistsMt KB 1174\n    Estimate: 1; Actual: 1 \n    (#$gafArgument (#$isa #$Muffet #$Poodle) 3 ?WHAT) - CyclistMt KB 1174\n    Estimate: 0; Actual: 0\n    (#$gafArgument (#$isa #$Muffet #$Dog) 2 ?WHAT) : False" )
    } );
    $kw26$REMOVAL_GAF_ARGUMENT_BOUND_UNBOUND_UNBOUND_POS = makeKeyword( "REMOVAL-GAF-ARGUMENT-BOUND-UNBOUND-UNBOUND-POS" );
    $list27 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ),
      makeKeyword( "COST" ), makeSymbol( "REMOVAL-GAF-ARGUMENT-BOUND-UNBOUND-UNBOUND-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
          "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FORMULA" ) ), makeKeyword( "ANYTHING" ),
              makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                  makeSymbol( "TERM-ARG-POS-FOR-FORMULA" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FORMULA" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ),
                      ConsesLow.list( makeSymbol( "ARGNUM" ), makeSymbol( "TERM" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                          makeSymbol( "FORMULA" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ),
      makeKeyword( "GAF" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$gafArgument <sentence> <not-fully-bound> <not-fully-bound>)" ), makeKeyword(
          "EXAMPLE" ), makeString(
              "(#$gafArgument (#$isa #$Muffet #$Poodle) ?X ?WHAT) - InferencePSC KB 1174\n    Estimate: 3; Actual 3; \n    (#$gafArgument (#$isa #$Muffet #$Poodle) ?X ?WHAT) - UniversalVocabularyMt KB 1174\n    Estimate: 0; Actual 0;\n    Vijay: Why is the estimate zero? Where is count-all-gafs considering relevant mt? \n\n    (#$gafArgument (#$isa #$Muffet #$Dog) ?X ?WHAT) : False   \n    Use CyclistsMt so check if some code path is looking in just-mt\n    (#$gafArgument (#$isa #$Muffet #$Poodle) ?X #$Poodle) - CyclistsMt KB 1174\n    Estimate: 1; Actual: 1;\n\n    (#$gafArgument (#$isa #$Muffet #$Poodle) ?X #$Dog) - term-occurs-as.. CyclistsMt KB 1174\n    Estimate: 0; Actual: 0;  \n    (#$gafArgument (#$isa #$Muffet #$Poodle) ?X #$genls) - formula-has-operator?\n    Estimate: 0; Actual: 0;\n\n    (#$gafArgument (#$isa #$Muffet #$Dog) ?X #$Dog) : False\n   " )
    } );
    $kw28$IGNORE = makeKeyword( "IGNORE" );
    $kw29$REMOVAL_GAF_ARGUMENT_UNBOUND_BOUND_BOUND_POS = makeKeyword( "REMOVAL-GAF-ARGUMENT-UNBOUND-BOUND-BOUND-POS" );
    $list30 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword(
            "FULLY-BOUND" ), makeKeyword( "INTEGER" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-GAF-ARGUMENT-UNBOUND-UNBOUND-BOUND-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword(
                    "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                        makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                            "GET-GAFS-WITH-TERM-ARGNUM" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARGNUM" ) ) ), makeKeyword(
                                "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ),
                                    makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "GAF" ), makeKeyword( "SUPPORT-STRENGTH" ),
      makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$gafArgument <not-fully-bound> <integer> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$gafArgument ?GAF 2 #$Dog) in BiologyVocabularyMt KB: 1174\n   Estimate: 188; Actual: 183\n   (#$gafArgument ?WHAT 0 #$defnSufficient) in UniversalVocabularyMt KB: 1174\n   Estimate: 328; Actual: 328" )
    } );
    $kw31$GAF = makeKeyword( "GAF" );
    $kw32$REMOVAL_GAF_ARGUMENT_UNBOUND_UNBOUND_BOUND_POS = makeKeyword( "REMOVAL-GAF-ARGUMENT-UNBOUND-UNBOUND-BOUND-POS" );
    $list33 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword(
            "FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-GAF-ARGUMENT-UNBOUND-UNBOUND-BOUND-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ),
      ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), ConsesLow.list(
          makeKeyword( "BIND" ), makeSymbol( "TERM" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
              "CALL" ), makeSymbol( "GET-GAF-ARGNUM-TUPLE-WITH-TERM" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ),
                  ConsesLow.list( makeSymbol( "GAF" ), makeSymbol( "ARGNUM" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "gafArgument" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                      makeSymbol( "GAF" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ARGNUM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ),
      makeKeyword( "GAF" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$gafArgument <not-fully-bound> <integer> <fully-bound>)" ), makeKeyword(
          "EXAMPLE" ), makeString( "(#$gafArgument ?GAF ?X #$Dog) in BiologyVocabularyMt KB: 1174\n   Estimate: 272; Actual: 263" )
    } );
  }
}
/*
 * 
 * Total time: 274 ms
 * 
 */