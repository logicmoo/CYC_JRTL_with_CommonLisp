package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.tva_inference;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_genlpreds_lookup
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup";
  public static final String myFingerPrint = "bf7e71d12730d6fde394c40fa5b4faf3b65dcac27b912d2964e9e9d3ea624b63";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 4767L)
  private static SubLSymbol $unknown_hl_variable$;
  private static final SubLSymbol $kw0$POS;
  private static final SubLSymbol $kw1$REMOVAL_GENLPREDS_LOOKUP_POS;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$NEG;
  private static final SubLSymbol $kw4$GROSSLY_INCOMPLETE;
  private static final SubLSymbol $kw5$INCOMPLETE;
  private static final SubLSymbol $kw6$REMOVAL_GENLPREDS_LOOKUP_NEG;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$GAF_ARG;
  private static final SubLSymbol $kw9$GAF;
  private static final SubLSymbol $kw10$PREDICATE_EXTENT;
  private static final SubLSymbol $kw11$OVERLAP;
  private static final SubLSymbol $sym12$_UNKNOWN_HL_VARIABLE_;
  private static final SubLList $list13;
  private static final SubLObject $const14$genlPreds;
  private static final SubLSymbol $kw15$DEPTH;
  private static final SubLSymbol $kw16$STACK;
  private static final SubLSymbol $kw17$QUEUE;
  private static final SubLSymbol $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw19$ERROR;
  private static final SubLString $str20$_A_is_not_a__A;
  private static final SubLSymbol $sym21$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw22$CERROR;
  private static final SubLString $str23$continue_anyway;
  private static final SubLSymbol $kw24$WARN;
  private static final SubLString $str25$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str26$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str27$attempting_to_bind_direction_link;
  private static final SubLString $str28$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $kw29$REMOVAL_GENLPREDS_PRED_INDEX_POS;
  private static final SubLList $list30;
  private static final SubLSymbol $kw31$REMOVAL_GENLPREDS_PRED_INDEX_NEG;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$REMOVAL_GENLINVERSE_LOOKUP_POS;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$REMOVAL_GENLINVERSE_LOOKUP_NEG;
  private static final SubLList $list36;
  private static final SubLSymbol $kw37$REMOVAL_GENLINVERSE_PRED_INDEX_POS;
  private static final SubLList $list38;
  private static final SubLSymbol $kw39$REMOVAL_GENLINVERSE_PRED_INDEX_NEG;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$INFERENCE_NEGATION_PREDICATE_;
  private static final SubLSymbol $kw42$TRUE;
  private static final SubLSymbol $kw43$REMOVAL_NEGATIONPREDS_LOOKUP;
  private static final SubLList $list44;
  private static final SubLObject $const45$negationPreds;
  private static final SubLSymbol $kw46$NEGATIONPREDS;
  private static final SubLSymbol $sym47$INFERENCE_NEGATION_INVERSE_;
  private static final SubLSymbol $kw48$REMOVAL_NEGATIONINVERSE_LOOKUP;
  private static final SubLList $list49;
  private static final SubLObject $const50$negationInverse;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 873L)
  public static SubLObject removal_genlpreds_lookup_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != variables.fully_bound_p( asent ) )
    {
      return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
    }
    return num_best_genlpreds_gaf_lookup_index( asent, $kw0$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 1649L)
  public static SubLObject removal_genlpreds_lookup_pos_iterator(final SubLObject asent)
  {
    return removal_genlpreds_lookup_iterator( asent, $kw0$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 2792L)
  public static SubLObject removal_genlpreds_lookup_neg_completeness(final SubLObject asent)
  {
    if( NIL != removal_module_utilities.negation_grossly_incompleteP( asent, $kw3$NEG ) )
    {
      return $kw4$GROSSLY_INCOMPLETE;
    }
    return $kw5$INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 2969L)
  public static SubLObject removal_genlpreds_lookup_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return num_best_genlpreds_gaf_lookup_index( asent, $kw3$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 3123L)
  public static SubLObject removal_genlpreds_lookup_neg_iterator(final SubLObject asent)
  {
    return removal_genlpreds_lookup_iterator( asent, $kw3$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 4273L)
  public static SubLObject removal_genlpreds_lookup_iterator(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject obfuscated_asent = obfuscate_predicate( asent );
    final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$inference_literal$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$inference_sense$.currentBinding( thread );
    try
    {
      pred_relevance_macros.$relevant_pred_function$.bind( pred_relevance_macros.determine_inference_genl_or_spec_pred_relevance( sense ), thread );
      control_vars.$inference_literal$.bind( asent, thread );
      control_vars.$inference_sense$.bind( sense, thread );
      final SubLObject l_index = kb_indexing.best_gaf_lookup_index( obfuscated_asent, enumeration_types.sense_truth( sense ), NIL );
      final SubLObject pcase_var;
      final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
      if( pcase_var.eql( $kw8$GAF_ARG ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
        final SubLObject argnum = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != argnum )
        {
          if( NIL != predicate )
          {
            final SubLObject pred_var = predicate;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                    SubLObject done_var_$1 = NIL;
                    final SubLObject token_var_$2 = NIL;
                    while ( NIL == done_var_$1)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                      final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( gaf ) );
                      if( NIL != valid_$3 )
                      {
                        final SubLObject var;
                        final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal( gaf );
                        if( NIL != var )
                        {
                          result = ConsesLow.cons( var, result );
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
          else
          {
            final SubLObject pred_var = NIL;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                    SubLObject done_var_$2 = NIL;
                    final SubLObject token_var_$3 = NIL;
                    while ( NIL == done_var_$2)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$3 );
                      final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( gaf ) );
                      if( NIL != valid_$4 )
                      {
                        final SubLObject var;
                        final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal( gaf );
                        if( NIL != var )
                        {
                          result = ConsesLow.cons( var, result );
                        }
                      }
                      done_var_$2 = makeBoolean( NIL == valid_$4 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
        }
        else if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                  SubLObject done_var_$3 = NIL;
                  final SubLObject token_var_$4 = NIL;
                  while ( NIL == done_var_$3)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                    final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( gaf ) );
                    if( NIL != valid_$5 )
                    {
                      final SubLObject var;
                      final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal( gaf );
                      if( NIL != var )
                      {
                        result = ConsesLow.cons( var, result );
                      }
                    }
                    done_var_$3 = makeBoolean( NIL == valid_$5 );
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
        else
        {
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                  SubLObject done_var_$4 = NIL;
                  final SubLObject token_var_$5 = NIL;
                  while ( NIL == done_var_$4)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                    final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( gaf ) );
                    if( NIL != valid_$6 )
                    {
                      final SubLObject var;
                      final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal( gaf );
                      if( NIL != var )
                      {
                        result = ConsesLow.cons( var, result );
                      }
                    }
                    done_var_$4 = makeBoolean( NIL == valid_$6 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( pcase_var.eql( $kw10$PREDICATE_EXTENT ) )
      {
        final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$8 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$18 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$19 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
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
            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
            SubLObject done_var2 = NIL;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                  SubLObject done_var_$5 = NIL;
                  final SubLObject token_var_$6 = NIL;
                  while ( NIL == done_var_$5)
                  {
                    final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$6 );
                    final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( gaf2 ) );
                    if( NIL != valid_$7 )
                    {
                      final SubLObject var2;
                      final SubLObject bindings_assertion2 = var2 = removal_genlpreds_gaf_iterator_internal( gaf2 );
                      if( NIL != var2 )
                      {
                        result = ConsesLow.cons( var2, result );
                      }
                    }
                    done_var_$5 = makeBoolean( NIL == valid_$7 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values5 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values5 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 );
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
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$19, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$18, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$8, thread );
          }
        }
      }
      else if( pcase_var.eql( $kw11$OVERLAP ) )
      {
        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
        SubLObject gaf3 = NIL;
        gaf3 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == enumeration_types.sense_truth( sense ) || NIL != assertions_high.assertion_has_truth( gaf3, enumeration_types.sense_truth( sense ) ) )
          {
            final SubLObject var3;
            final SubLObject bindings_assertion3 = var3 = removal_genlpreds_gaf_iterator_internal( gaf3 );
            if( NIL != var3 )
            {
              result = ConsesLow.cons( var3, result );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          gaf3 = cdolist_list_var.first();
        }
      }
      else
      {
        kb_mapping_macros.do_gli_method_error( l_index, method );
      }
    }
    finally
    {
      control_vars.$inference_sense$.rebind( _prev_bind_3, thread );
      control_vars.$inference_literal$.rebind( _prev_bind_2, thread );
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != result )
    {
      return iteration.new_list_iterator( result );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 4841L)
  public static SubLObject obfuscate_predicate(final SubLObject asent)
  {
    return el_utilities.replace_formula_arg( ZERO_INTEGER, $unknown_hl_variable$.getGlobalValue(), asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5065L)
  public static SubLObject best_genlpreds_gaf_lookup_index(final SubLObject asent, final SubLObject sense)
  {
    return kb_indexing.best_gaf_lookup_index( obfuscate_predicate( asent ), enumeration_types.sense_truth( sense ), $list13 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5296L)
  public static SubLObject num_best_genlpreds_gaf_lookup_index(final SubLObject asent, final SubLObject sense)
  {
    return num_best_genlpreds_or_inverse_gaf_lookup_index( asent, sense, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5437L)
  public static SubLObject num_best_genlpreds_or_inverse_gaf_lookup_index(final SubLObject asent, final SubLObject sense, final SubLObject inverse_modeP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject direction = ( sense == $kw0$POS ) ? sbhl_search_vars.get_sbhl_backward_search_direction() : sbhl_search_vars.get_sbhl_forward_search_direction();
    final SubLObject pred = cycl_utilities.sentence_arg0( asent );
    final SubLObject binary_predicate_modeP = kb_accessors.binary_predicateP( cycl_utilities.sentence_arg0( asent ) );
    final SubLObject gaf_argnum = tva_inference.determine_term_argnums( asent ).first();
    final SubLObject v_term = cycl_utilities.sentence_arg( asent, gaf_argnum, UNPROVIDED );
    SubLObject num = ZERO_INTEGER;
    final SubLObject module = sbhl_module_vars.get_sbhl_module( $const14$genlPreds );
    final SubLObject node_var = pred;
    final SubLObject deck_type = $kw17$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw19$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw22$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str23$continue_anyway, $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw24$WARN ) )
            {
              Errors.warn( $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str25$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str23$continue_anyway, $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$26 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( module, thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( module ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( module ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( module, thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$27 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( direction, thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( direction, module ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$30 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject spec_pred = node_var_$30;
                  final SubLObject _prev_bind_0_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    final SubLObject inverseP = predicate_mode;
                    if( !pred.eql( spec_pred ) && inverse_modeP.eql( inverseP ) )
                    {
                      final SubLObject spec_asent = el_utilities.replace_formula_arg( ZERO_INTEGER, spec_pred, asent );
                      num = Numbers.add( num, kb_indexing.num_best_gaf_lookup_index( spec_asent, enumeration_types.sense_truth( sense ), UNPROVIDED ) );
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( module );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$28 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var_$30 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$35;
                                    for( iteration_state_$35 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$35 ); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next( iteration_state_$35 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$35 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str26$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$30, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$35 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$29, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str27$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$37;
                          final SubLObject new_list = cdolist_list_var_$37 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$37.first();
                          while ( NIL != cdolist_list_var_$37)
                          {
                            final SubLObject _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str26$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$31, thread );
                            }
                            cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                            generating_fn = cdolist_list_var_$37.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$28, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$28, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$27, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$29, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$27, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$26, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str28$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$26, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$25, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$24, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return num;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 6246L)
  public static SubLObject removal_genlpreds_gaf_iterator_internal(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != backward_utilities.direction_is_relevant( assertion ) )
    {
      final SubLObject assertion_asent = assertions_high.gaf_formula( assertion );
      final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate( assertion_asent );
      final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate( control_vars.$inference_literal$.getDynamicValue( thread ) );
      if( !ass_pred.eql( inf_pred ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.gaf_asent_args_unify( control_vars.$inference_literal$.getDynamicValue( thread ), assertion_asent, UNPROVIDED, UNPROVIDED );
        final SubLObject gaf_asent = thread.secondMultipleValue();
        final SubLObject unify_justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != v_bindings )
        {
          return ConsesLow.list( v_bindings, assertion );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 6897L)
  public static SubLObject removal_genlpreds_lookup_supports(final SubLObject asent, final SubLObject assertion, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate( assertions_high.gaf_formula( assertion ) );
    final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject spec_pred = ( $kw0$POS == sense ) ? ass_pred : inf_pred;
    final SubLObject genl_pred = ( $kw0$POS == sense ) ? inf_pred : ass_pred;
    final SubLObject hl_support = removal_module_utilities.make_genl_preds_support( spec_pred, genl_pred );
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification_utilities.gaf_asent_args_unify( asent, assertions_high.gaf_formula( assertion ), T, T );
    final SubLObject gaf_asent = thread.secondMultipleValue();
    final SubLObject unify_justification = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.append( ConsesLow.list( assertion, hl_support ), unify_justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 7498L)
  public static SubLObject removal_genlpreds_pred_index_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != variables.fully_bound_p( asent ) )
    {
      return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
    }
    return num_best_genlpreds_gaf_lookup_index( asent, $kw0$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 8216L)
  public static SubLObject removal_genlpreds_pred_index_pos_iterator(final SubLObject asent)
  {
    return removal_genlpreds_pred_index_iterator( asent, $kw0$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 9391L)
  public static SubLObject removal_genlpreds_pred_index_neg_completeness(final SubLObject asent)
  {
    if( NIL != removal_module_utilities.negation_grossly_incompleteP( asent, $kw3$NEG ) )
    {
      return $kw4$GROSSLY_INCOMPLETE;
    }
    return $kw5$INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 9571L)
  public static SubLObject removal_genlpreds_pred_index_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject genl_preds = inference_trampolines.inference_all_genl_predicates( predicate );
    SubLObject cost = ZERO_INTEGER;
    SubLObject cdolist_list_var = genl_preds;
    SubLObject genl_pred = NIL;
    genl_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cost = Numbers.add( cost, kb_indexing.num_predicate_extent_index( genl_pred, UNPROVIDED ) );
      cdolist_list_var = cdolist_list_var.rest();
      genl_pred = cdolist_list_var.first();
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 9902L)
  public static SubLObject removal_genlpreds_pred_index_neg_iterator(final SubLObject asent)
  {
    return removal_genlpreds_pred_index_iterator( asent, $kw3$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 11157L)
  public static SubLObject removal_genlpreds_pred_index_iterator(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding( thread );
    try
    {
      control_vars.$inference_literal$.bind( asent, thread );
      SubLObject index_predicates = NIL;
      if( $kw0$POS == sense )
      {
        index_predicates = inference_trampolines.inference_all_spec_predicates( predicate );
      }
      else
      {
        index_predicates = inference_trampolines.inference_all_genl_predicates( predicate );
      }
      SubLObject cdolist_list_var = index_predicates;
      SubLObject index_predicate = NIL;
      index_predicate = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !index_predicate.eql( predicate ) )
        {
          final SubLObject index_asent = el_utilities.replace_formula_arg( ZERO_INTEGER, index_predicate, asent );
          final SubLObject l_index = kb_indexing.best_gaf_lookup_index( index_asent, enumeration_types.sense_truth( sense ), NIL );
          final SubLObject pcase_var;
          final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
          if( pcase_var.eql( $kw8$GAF_ARG ) )
          {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate_$40 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if( NIL != argnum )
            {
              if( NIL != predicate_$40 )
              {
                final SubLObject pred_var = predicate_$40;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                        SubLObject done_var_$41 = NIL;
                        final SubLObject token_var_$42 = NIL;
                        while ( NIL == done_var_$41)
                        {
                          final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$42 );
                          final SubLObject valid_$43 = makeBoolean( !token_var_$42.eql( assertion ) );
                          if( NIL != valid_$43 )
                          {
                            final SubLObject var;
                            final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal( assertion );
                            if( NIL != var )
                            {
                              result = ConsesLow.cons( var, result );
                            }
                          }
                          done_var_$41 = makeBoolean( NIL == valid_$43 );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid );
                  }
                }
              }
              else
              {
                final SubLObject pred_var = NIL;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                        SubLObject done_var_$42 = NIL;
                        final SubLObject token_var_$43 = NIL;
                        while ( NIL == done_var_$42)
                        {
                          final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$43 );
                          final SubLObject valid_$44 = makeBoolean( !token_var_$43.eql( assertion ) );
                          if( NIL != valid_$44 )
                          {
                            final SubLObject var;
                            final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal( assertion );
                            if( NIL != var )
                            {
                              result = ConsesLow.cons( var, result );
                            }
                          }
                          done_var_$42 = makeBoolean( NIL == valid_$44 );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid );
                  }
                }
              }
            }
            else if( NIL != predicate_$40 )
            {
              final SubLObject pred_var = predicate_$40;
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                      SubLObject done_var_$43 = NIL;
                      final SubLObject token_var_$44 = NIL;
                      while ( NIL == done_var_$43)
                      {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$44 );
                        final SubLObject valid_$45 = makeBoolean( !token_var_$44.eql( assertion ) );
                        if( NIL != valid_$45 )
                        {
                          final SubLObject var;
                          final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal( assertion );
                          if( NIL != var )
                          {
                            result = ConsesLow.cons( var, result );
                          }
                        }
                        done_var_$43 = makeBoolean( NIL == valid_$45 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid );
                }
              }
            }
            else
            {
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                      SubLObject done_var_$44 = NIL;
                      final SubLObject token_var_$45 = NIL;
                      while ( NIL == done_var_$44)
                      {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$45 );
                        final SubLObject valid_$46 = makeBoolean( !token_var_$45.eql( assertion ) );
                        if( NIL != valid_$46 )
                        {
                          final SubLObject var;
                          final SubLObject bindings_assertion = var = removal_genlpreds_gaf_iterator_internal( assertion );
                          if( NIL != var )
                          {
                            result = ConsesLow.cons( var, result );
                          }
                        }
                        done_var_$44 = makeBoolean( NIL == valid_$46 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values4 = Values.getValuesAsVector();
                        if( NIL != final_index_iterator )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                        }
                        Values.restoreValuesFromVector( _values4 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$47, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid );
                }
              }
            }
          }
          else if( pcase_var.eql( $kw10$PREDICATE_EXTENT ) )
          {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
            if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
            {
              final SubLObject str = NIL;
              final SubLObject _prev_bind_0_$48 = utilities_macros.$progress_start_time$.currentBinding( thread );
              final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
                final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
                SubLObject done_var2 = NIL;
                final SubLObject token_var2 = NIL;
                while ( NIL == done_var2)
                {
                  final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                  final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                  if( NIL != valid2 )
                  {
                    utilities_macros.note_progress();
                    SubLObject final_index_iterator2 = NIL;
                    try
                    {
                      final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                      SubLObject done_var_$45 = NIL;
                      final SubLObject token_var_$46 = NIL;
                      while ( NIL == done_var_$45)
                      {
                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$46 );
                        final SubLObject valid_$47 = makeBoolean( !token_var_$46.eql( assertion2 ) );
                        if( NIL != valid_$47 )
                        {
                          final SubLObject var2;
                          final SubLObject bindings_assertion2 = var2 = removal_genlpreds_gaf_iterator_internal( assertion2 );
                          if( NIL != var2 )
                          {
                            result = ConsesLow.cons( var2, result );
                          }
                        }
                        done_var_$45 = makeBoolean( NIL == valid_$47 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values5 = Values.getValuesAsVector();
                        if( NIL != final_index_iterator2 )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                        }
                        Values.restoreValuesFromVector( _values5 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
                      }
                    }
                  }
                  done_var2 = makeBoolean( NIL == valid2 );
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
                utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
                utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$48, thread );
              }
            }
          }
          else if( pcase_var.eql( $kw11$OVERLAP ) )
          {
            SubLObject cdolist_list_var_$62 = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
            SubLObject assertion3 = NIL;
            assertion3 = cdolist_list_var_$62.first();
            while ( NIL != cdolist_list_var_$62)
            {
              if( NIL == enumeration_types.sense_truth( sense ) || NIL != assertions_high.assertion_has_truth( assertion3, enumeration_types.sense_truth( sense ) ) )
              {
                final SubLObject var3;
                final SubLObject bindings_assertion3 = var3 = removal_genlpreds_gaf_iterator_internal( assertion3 );
                if( NIL != var3 )
                {
                  result = ConsesLow.cons( var3, result );
                }
              }
              cdolist_list_var_$62 = cdolist_list_var_$62.rest();
              assertion3 = cdolist_list_var_$62.first();
            }
          }
          else
          {
            kb_mapping_macros.do_gli_method_error( l_index, method );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        index_predicate = cdolist_list_var.first();
      }
    }
    finally
    {
      control_vars.$inference_literal$.rebind( _prev_bind_0, thread );
    }
    if( NIL != result )
    {
      return iteration.new_list_iterator( result );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 11988L)
  public static SubLObject removal_genlinverse_lookup_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != variables.fully_bound_p( asent ) )
    {
      return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
    }
    return num_best_genlinverse_gaf_lookup_index( asent, $kw0$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 12762L)
  public static SubLObject removal_genlinverse_lookup_pos_iterator(final SubLObject asent)
  {
    return removal_genlinverse_lookup_iterator( asent, $kw0$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 13903L)
  public static SubLObject removal_genlinverse_lookup_neg_completeness(final SubLObject asent)
  {
    if( NIL != removal_module_utilities.negation_grossly_incompleteP( asent, $kw3$NEG ) )
    {
      return $kw4$GROSSLY_INCOMPLETE;
    }
    return $kw5$INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 14081L)
  public static SubLObject removal_genlinverse_lookup_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return num_best_genlinverse_gaf_lookup_index( asent, $kw3$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 14235L)
  public static SubLObject removal_genlinverse_lookup_neg_iterator(final SubLObject asent)
  {
    return removal_genlinverse_lookup_iterator( asent, $kw3$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 15448L)
  public static SubLObject removal_genlinverse_lookup_iterator(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject obfuscated_asent = obfuscate_predicate( removal_modules_symmetry.symmetric_asent( asent ) );
    final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$inference_literal$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$inference_sense$.currentBinding( thread );
    try
    {
      pred_relevance_macros.$relevant_pred_function$.bind( pred_relevance_macros.determine_inference_genl_or_spec_inverse_relevance( sense ), thread );
      control_vars.$inference_literal$.bind( asent, thread );
      control_vars.$inference_sense$.bind( sense, thread );
      final SubLObject l_index = kb_indexing.best_gaf_lookup_index( obfuscated_asent, enumeration_types.sense_truth( sense ), NIL );
      final SubLObject pcase_var;
      final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
      if( pcase_var.eql( $kw8$GAF_ARG ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
        final SubLObject argnum = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != argnum )
        {
          if( NIL != predicate )
          {
            final SubLObject pred_var = predicate;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                    SubLObject done_var_$63 = NIL;
                    final SubLObject token_var_$64 = NIL;
                    while ( NIL == done_var_$63)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$64 );
                      final SubLObject valid_$65 = makeBoolean( !token_var_$64.eql( gaf ) );
                      if( NIL != valid_$65 )
                      {
                        final SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal( asent, gaf );
                        if( NIL != bindings_assertion )
                        {
                          result = ConsesLow.cons( bindings_assertion, result );
                        }
                      }
                      done_var_$63 = makeBoolean( NIL == valid_$65 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$66, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
          else
          {
            final SubLObject pred_var = NIL;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                    SubLObject done_var_$64 = NIL;
                    final SubLObject token_var_$65 = NIL;
                    while ( NIL == done_var_$64)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$65 );
                      final SubLObject valid_$66 = makeBoolean( !token_var_$65.eql( gaf ) );
                      if( NIL != valid_$66 )
                      {
                        final SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal( asent, gaf );
                        if( NIL != bindings_assertion )
                        {
                          result = ConsesLow.cons( bindings_assertion, result );
                        }
                      }
                      done_var_$64 = makeBoolean( NIL == valid_$66 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$67, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
        }
        else if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                  SubLObject done_var_$65 = NIL;
                  final SubLObject token_var_$66 = NIL;
                  while ( NIL == done_var_$65)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$66 );
                    final SubLObject valid_$67 = makeBoolean( !token_var_$66.eql( gaf ) );
                    if( NIL != valid_$67 )
                    {
                      final SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal( asent, gaf );
                      if( NIL != bindings_assertion )
                      {
                        result = ConsesLow.cons( bindings_assertion, result );
                      }
                    }
                    done_var_$65 = makeBoolean( NIL == valid_$67 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$68, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else
        {
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                  SubLObject done_var_$66 = NIL;
                  final SubLObject token_var_$67 = NIL;
                  while ( NIL == done_var_$66)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$67 );
                    final SubLObject valid_$68 = makeBoolean( !token_var_$67.eql( gaf ) );
                    if( NIL != valid_$68 )
                    {
                      final SubLObject bindings_assertion = removal_genlinverse_gaf_iterator_internal( asent, gaf );
                      if( NIL != bindings_assertion )
                      {
                        result = ConsesLow.cons( bindings_assertion, result );
                      }
                    }
                    done_var_$66 = makeBoolean( NIL == valid_$68 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$69, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( pcase_var.eql( $kw10$PREDICATE_EXTENT ) )
      {
        final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$70 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$80 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$81 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
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
            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
            SubLObject done_var2 = NIL;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                  SubLObject done_var_$67 = NIL;
                  final SubLObject token_var_$68 = NIL;
                  while ( NIL == done_var_$67)
                  {
                    final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$68 );
                    final SubLObject valid_$69 = makeBoolean( !token_var_$68.eql( gaf2 ) );
                    if( NIL != valid_$69 )
                    {
                      final SubLObject bindings_assertion2 = removal_genlinverse_gaf_iterator_internal( asent, gaf2 );
                      if( NIL != bindings_assertion2 )
                      {
                        result = ConsesLow.cons( bindings_assertion2, result );
                      }
                    }
                    done_var_$67 = makeBoolean( NIL == valid_$69 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values5 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values5 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$71, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 );
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
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$81, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$80, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$70, thread );
          }
        }
      }
      else if( pcase_var.eql( $kw11$OVERLAP ) )
      {
        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
        SubLObject gaf3 = NIL;
        gaf3 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == enumeration_types.sense_truth( sense ) || NIL != assertions_high.assertion_has_truth( gaf3, enumeration_types.sense_truth( sense ) ) )
          {
            final SubLObject bindings_assertion3 = removal_genlinverse_gaf_iterator_internal( asent, gaf3 );
            if( NIL != bindings_assertion3 )
            {
              result = ConsesLow.cons( bindings_assertion3, result );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          gaf3 = cdolist_list_var.first();
        }
      }
      else
      {
        kb_mapping_macros.do_gli_method_error( l_index, method );
      }
    }
    finally
    {
      control_vars.$inference_sense$.rebind( _prev_bind_3, thread );
      control_vars.$inference_literal$.rebind( _prev_bind_2, thread );
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != result )
    {
      return iteration.new_list_iterator( result );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 16000L)
  public static SubLObject best_genlinverse_gaf_lookup_index(final SubLObject asent, final SubLObject sense)
  {
    return kb_indexing.best_gaf_lookup_index( obfuscate_predicate( removal_modules_symmetry.symmetric_asent( asent ) ), enumeration_types.sense_truth( sense ), $list13 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 16241L)
  public static SubLObject num_best_genlinverse_gaf_lookup_index(final SubLObject asent, final SubLObject sense)
  {
    return num_best_genlpreds_or_inverse_gaf_lookup_index( asent, sense, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 16382L)
  public static SubLObject removal_genlinverse_gaf_iterator_internal(final SubLObject asent, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != backward_utilities.direction_is_relevant( assertion ) )
    {
      final SubLObject assertion_asent = assertions_high.gaf_formula( assertion );
      final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate( assertion_asent );
      final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate( asent );
      if( !ass_pred.eql( inf_pred ) )
      {
        final SubLObject symmetric_asent = removal_modules_symmetry.symmetric_asent( asent );
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.gaf_asent_args_unify( symmetric_asent, assertion_asent, T, T );
        final SubLObject gaf_asent = thread.secondMultipleValue();
        final SubLObject unify_justification = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != v_bindings )
        {
          return ConsesLow.list( v_bindings, assertion );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 17033L)
  public static SubLObject removal_genlinverse_lookup_supports(final SubLObject asent, final SubLObject assertion, final SubLObject sense)
  {
    final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate( assertions_high.gaf_formula( assertion ) );
    final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject spec_pred = ( $kw0$POS == sense ) ? ass_pred : inf_pred;
    final SubLObject genl_pred = ( $kw0$POS == sense ) ? inf_pred : ass_pred;
    final SubLObject hl_support = removal_module_utilities.make_genl_inverse_support( spec_pred, genl_pred );
    return ConsesLow.list( assertion, hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 17447L)
  public static SubLObject removal_genlinverse_pred_index_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != variables.fully_bound_p( asent ) )
    {
      return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
    }
    return num_best_genlinverse_gaf_lookup_index( asent, $kw0$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 18179L)
  public static SubLObject removal_genlinverse_pred_index_pos_iterator(final SubLObject asent)
  {
    return removal_genlinverse_pred_index_iterator( asent, $kw0$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 19311L)
  public static SubLObject removal_genlinverse_pred_index_neg_completeness(final SubLObject asent)
  {
    if( NIL != removal_module_utilities.negation_grossly_incompleteP( asent, $kw3$NEG ) )
    {
      return $kw4$GROSSLY_INCOMPLETE;
    }
    return $kw5$INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 19493L)
  public static SubLObject removal_genlinverse_pred_index_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != variables.fully_bound_p( asent ) )
    {
      return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
    }
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject genl_preds = inference_trampolines.inference_all_genl_inverses( predicate );
    SubLObject cost = ZERO_INTEGER;
    SubLObject cdolist_list_var = genl_preds;
    SubLObject genl_pred = NIL;
    genl_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cost = Numbers.add( cost, kb_indexing.num_predicate_extent_index( genl_pred, UNPROVIDED ) );
      cdolist_list_var = cdolist_list_var.rest();
      genl_pred = cdolist_list_var.first();
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 19914L)
  public static SubLObject removal_genlinverse_pred_index_neg_iterator(final SubLObject asent)
  {
    return removal_genlinverse_pred_index_iterator( asent, $kw3$NEG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 21113L)
  public static SubLObject removal_genlinverse_pred_index_iterator(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( asent );
    SubLObject index_predicates = NIL;
    if( $kw0$POS == sense )
    {
      index_predicates = inference_trampolines.inference_all_spec_inverses( predicate );
    }
    else
    {
      index_predicates = inference_trampolines.inference_all_genl_inverses( predicate );
    }
    SubLObject cdolist_list_var = index_predicates;
    SubLObject index_predicate = NIL;
    index_predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !index_predicate.eql( predicate ) )
      {
        final SubLObject index_asent = el_utilities.replace_formula_arg( ZERO_INTEGER, index_predicate, asent );
        final SubLObject l_index = kb_indexing.best_gaf_lookup_index( index_asent, enumeration_types.sense_truth( sense ), NIL );
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
        if( pcase_var.eql( $kw8$GAF_ARG ) )
        {
          thread.resetMultipleValues();
          final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
          final SubLObject argnum = thread.secondMultipleValue();
          final SubLObject predicate_$86 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != argnum )
          {
            if( NIL != predicate_$86 )
            {
              final SubLObject pred_var = predicate_$86;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                      SubLObject done_var_$87 = NIL;
                      final SubLObject token_var_$88 = NIL;
                      while ( NIL == done_var_$87)
                      {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$88 );
                        final SubLObject valid_$89 = makeBoolean( !token_var_$88.eql( assertion ) );
                        if( NIL != valid_$89 )
                        {
                          final SubLObject var;
                          final SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal( asent, assertion );
                          if( NIL != var )
                          {
                            result = ConsesLow.cons( var, result );
                          }
                        }
                        done_var_$87 = makeBoolean( NIL == valid_$89 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid );
                }
              }
            }
            else
            {
              final SubLObject pred_var = NIL;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                      SubLObject done_var_$88 = NIL;
                      final SubLObject token_var_$89 = NIL;
                      while ( NIL == done_var_$88)
                      {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$89 );
                        final SubLObject valid_$90 = makeBoolean( !token_var_$89.eql( assertion ) );
                        if( NIL != valid_$90 )
                        {
                          final SubLObject var;
                          final SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal( asent, assertion );
                          if( NIL != var )
                          {
                            result = ConsesLow.cons( var, result );
                          }
                        }
                        done_var_$88 = makeBoolean( NIL == valid_$90 );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid );
                }
              }
            }
          }
          else if( NIL != predicate_$86 )
          {
            final SubLObject pred_var = predicate_$86;
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                    SubLObject done_var_$89 = NIL;
                    final SubLObject token_var_$90 = NIL;
                    while ( NIL == done_var_$89)
                    {
                      final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$90 );
                      final SubLObject valid_$91 = makeBoolean( !token_var_$90.eql( assertion ) );
                      if( NIL != valid_$91 )
                      {
                        final SubLObject var;
                        final SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal( asent, assertion );
                        if( NIL != var )
                        {
                          result = ConsesLow.cons( var, result );
                        }
                      }
                      done_var_$89 = makeBoolean( NIL == valid_$91 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
          else
          {
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                    SubLObject done_var_$90 = NIL;
                    final SubLObject token_var_$91 = NIL;
                    while ( NIL == done_var_$90)
                    {
                      final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$91 );
                      final SubLObject valid_$92 = makeBoolean( !token_var_$91.eql( assertion ) );
                      if( NIL != valid_$92 )
                      {
                        final SubLObject var;
                        final SubLObject bindings_assertion = var = removal_genlinverse_gaf_iterator_internal( asent, assertion );
                        if( NIL != var )
                        {
                          result = ConsesLow.cons( var, result );
                        }
                      }
                      done_var_$90 = makeBoolean( NIL == valid_$92 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values4 = Values.getValuesAsVector();
                      if( NIL != final_index_iterator )
                      {
                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                      }
                      Values.restoreValuesFromVector( _values4 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
        }
        else if( pcase_var.eql( $kw10$PREDICATE_EXTENT ) )
        {
          final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
          if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
          {
            final SubLObject str = NIL;
            final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding( thread );
            final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
            final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
            final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding( thread );
            final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
            final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding( thread );
            final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
            final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding( thread );
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
              final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
              SubLObject done_var2 = NIL;
              final SubLObject token_var2 = NIL;
              while ( NIL == done_var2)
              {
                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
                final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
                if( NIL != valid2 )
                {
                  utilities_macros.note_progress();
                  SubLObject final_index_iterator2 = NIL;
                  try
                  {
                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw9$GAF, enumeration_types.sense_truth( sense ), NIL );
                    SubLObject done_var_$91 = NIL;
                    final SubLObject token_var_$92 = NIL;
                    while ( NIL == done_var_$91)
                    {
                      final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$92 );
                      final SubLObject valid_$93 = makeBoolean( !token_var_$92.eql( assertion2 ) );
                      if( NIL != valid_$93 )
                      {
                        final SubLObject var2;
                        final SubLObject bindings_assertion2 = var2 = removal_genlinverse_gaf_iterator_internal( asent, assertion2 );
                        if( NIL != var2 )
                        {
                          result = ConsesLow.cons( var2, result );
                        }
                      }
                      done_var_$91 = makeBoolean( NIL == valid_$93 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$102 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values5 = Values.getValuesAsVector();
                      if( NIL != final_index_iterator2 )
                      {
                        kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                      }
                      Values.restoreValuesFromVector( _values5 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$102, thread );
                    }
                  }
                }
                done_var2 = makeBoolean( NIL == valid2 );
              }
              utilities_macros.noting_progress_postamble();
            }
            finally
            {
              utilities_macros.$silent_progressP$.rebind( _prev_bind_12, thread );
              utilities_macros.$is_noting_progressP$.rebind( _prev_bind_11, thread );
              utilities_macros.$progress_count$.rebind( _prev_bind_10, thread );
              utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_9, thread );
              utilities_macros.$progress_notification_count$.rebind( _prev_bind_8, thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_7, thread );
              utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_6, thread );
              utilities_macros.$progress_start_time$.rebind( _prev_bind_5, thread );
            }
          }
        }
        else if( pcase_var.eql( $kw11$OVERLAP ) )
        {
          SubLObject cdolist_list_var_$103 = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
          SubLObject assertion3 = NIL;
          assertion3 = cdolist_list_var_$103.first();
          while ( NIL != cdolist_list_var_$103)
          {
            if( NIL == enumeration_types.sense_truth( sense ) || NIL != assertions_high.assertion_has_truth( assertion3, enumeration_types.sense_truth( sense ) ) )
            {
              final SubLObject var3;
              final SubLObject bindings_assertion3 = var3 = removal_genlinverse_gaf_iterator_internal( asent, assertion3 );
              if( NIL != var3 )
              {
                result = ConsesLow.cons( var3, result );
              }
            }
            cdolist_list_var_$103 = cdolist_list_var_$103.rest();
            assertion3 = cdolist_list_var_$103.first();
          }
        }
        else
        {
          kb_mapping_macros.do_gli_method_error( l_index, method );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      index_predicate = cdolist_list_var.first();
    }
    if( NIL != result )
    {
      return iteration.new_list_iterator( result );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 21918L)
  public static SubLObject removal_negationpreds_lookup_completeness(final SubLObject asent)
  {
    if( NIL != removal_module_utilities.negation_grossly_incompleteP( asent, $kw3$NEG ) )
    {
      return $kw4$GROSSLY_INCOMPLETE;
    }
    return $kw5$INCOMPLETE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 22314L)
  public static SubLObject removal_negationpreds_lookup_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != variables.fully_bound_p( asent ) )
    {
      return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
    }
    return Numbers.multiply( TWO_INTEGER, removal_genlpreds_lookup_neg_cost( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 22550L)
  public static SubLObject removal_negationpreds_lookup_iterator(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject obfuscated_asent = obfuscate_predicate( asent );
    final SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    try
    {
      control_vars.$inference_literal$.bind( asent, thread );
      pred_relevance_macros.$relevant_pred_function$.bind( $sym41$INFERENCE_NEGATION_PREDICATE_, thread );
      final SubLObject l_index = kb_indexing.best_gaf_lookup_index( obfuscated_asent, $kw42$TRUE, NIL );
      final SubLObject pcase_var;
      final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
      if( pcase_var.eql( $kw8$GAF_ARG ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
        final SubLObject argnum = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != argnum )
        {
          if( NIL != predicate )
          {
            final SubLObject pred_var = predicate;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, $kw42$TRUE, NIL );
                    SubLObject done_var_$104 = NIL;
                    final SubLObject token_var_$105 = NIL;
                    while ( NIL == done_var_$104)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$105 );
                      final SubLObject valid_$106 = makeBoolean( !token_var_$105.eql( gaf ) );
                      if( NIL != valid_$106 )
                      {
                        final SubLObject var;
                        final SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal( gaf );
                        if( NIL != var )
                        {
                          result = ConsesLow.cons( var, result );
                        }
                      }
                      done_var_$104 = makeBoolean( NIL == valid_$106 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$107, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
          else
          {
            final SubLObject pred_var = NIL;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, $kw42$TRUE, NIL );
                    SubLObject done_var_$105 = NIL;
                    final SubLObject token_var_$106 = NIL;
                    while ( NIL == done_var_$105)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$106 );
                      final SubLObject valid_$107 = makeBoolean( !token_var_$106.eql( gaf ) );
                      if( NIL != valid_$107 )
                      {
                        final SubLObject var;
                        final SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal( gaf );
                        if( NIL != var )
                        {
                          result = ConsesLow.cons( var, result );
                        }
                      }
                      done_var_$105 = makeBoolean( NIL == valid_$107 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$108 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$108, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
        }
        else if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, $kw42$TRUE, NIL );
                  SubLObject done_var_$106 = NIL;
                  final SubLObject token_var_$107 = NIL;
                  while ( NIL == done_var_$106)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$107 );
                    final SubLObject valid_$108 = makeBoolean( !token_var_$107.eql( gaf ) );
                    if( NIL != valid_$108 )
                    {
                      final SubLObject var;
                      final SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal( gaf );
                      if( NIL != var )
                      {
                        result = ConsesLow.cons( var, result );
                      }
                    }
                    done_var_$106 = makeBoolean( NIL == valid_$108 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$109 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$109, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else
        {
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, $kw42$TRUE, NIL );
                  SubLObject done_var_$107 = NIL;
                  final SubLObject token_var_$108 = NIL;
                  while ( NIL == done_var_$107)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$108 );
                    final SubLObject valid_$109 = makeBoolean( !token_var_$108.eql( gaf ) );
                    if( NIL != valid_$109 )
                    {
                      final SubLObject var;
                      final SubLObject bindings_assertion = var = removal_negationpreds_gaf_iterator_internal( gaf );
                      if( NIL != var )
                      {
                        result = ConsesLow.cons( var, result );
                      }
                    }
                    done_var_$107 = makeBoolean( NIL == valid_$109 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$110, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( pcase_var.eql( $kw10$PREDICATE_EXTENT ) )
      {
        final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$111 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$121 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
            SubLObject done_var2 = NIL;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw9$GAF, $kw42$TRUE, NIL );
                  SubLObject done_var_$108 = NIL;
                  final SubLObject token_var_$109 = NIL;
                  while ( NIL == done_var_$108)
                  {
                    final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$109 );
                    final SubLObject valid_$110 = makeBoolean( !token_var_$109.eql( gaf2 ) );
                    if( NIL != valid_$110 )
                    {
                      final SubLObject var2;
                      final SubLObject bindings_assertion2 = var2 = removal_negationpreds_gaf_iterator_internal( gaf2 );
                      if( NIL != var2 )
                      {
                        result = ConsesLow.cons( var2, result );
                      }
                    }
                    done_var_$108 = makeBoolean( NIL == valid_$110 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values5 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values5 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$112, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 );
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
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$121, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$111, thread );
          }
        }
      }
      else if( pcase_var.eql( $kw11$OVERLAP ) )
      {
        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
        SubLObject gaf3 = NIL;
        gaf3 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != assertions_high.assertion_has_truth( gaf3, $kw42$TRUE ) )
          {
            final SubLObject var3;
            final SubLObject bindings_assertion3 = var3 = removal_negationpreds_gaf_iterator_internal( gaf3 );
            if( NIL != var3 )
            {
              result = ConsesLow.cons( var3, result );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          gaf3 = cdolist_list_var.first();
        }
      }
      else
      {
        kb_mapping_macros.do_gli_method_error( l_index, method );
      }
    }
    finally
    {
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_2, thread );
      control_vars.$inference_literal$.rebind( _prev_bind_0, thread );
    }
    if( NIL != result )
    {
      return iteration.new_list_iterator( result );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 24080L)
  public static SubLObject removal_negationpreds_gaf_iterator_internal(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != backward_utilities.direction_is_relevant( assertion ) )
    {
      final SubLObject assertion_asent = assertions_high.gaf_formula( assertion );
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.gaf_asent_args_unify( control_vars.$inference_literal$.getDynamicValue( thread ), assertion_asent, T, T );
      final SubLObject gaf_asent = thread.secondMultipleValue();
      final SubLObject unify_justification = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        return ConsesLow.list( v_bindings, assertion );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 24532L)
  public static SubLObject removal_negationpreds_lookup_supports(final SubLObject asent, final SubLObject assertion)
  {
    final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate( assertion );
    final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject hl_formula = backward_utilities.inference_make_commutative_asent( $const45$negationPreds, ConsesLow.list( inf_pred, ass_pred ) );
    final SubLObject hl_support = arguments.make_hl_support( $kw46$NEGATIONPREDS, hl_formula, UNPROVIDED, UNPROVIDED );
    return ConsesLow.list( assertion, hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 24906L)
  public static SubLObject removal_negationinverse_lookup_iterator(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject obfuscated_asent = obfuscate_predicate( removal_modules_symmetry.symmetric_asent( asent ) );
    final SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding( thread );
    try
    {
      control_vars.$inference_literal$.bind( asent, thread );
      pred_relevance_macros.$relevant_pred_function$.bind( $sym47$INFERENCE_NEGATION_INVERSE_, thread );
      final SubLObject l_index = kb_indexing.best_gaf_lookup_index( obfuscated_asent, $kw42$TRUE, NIL );
      final SubLObject pcase_var;
      final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method( l_index );
      if( pcase_var.eql( $kw8$GAF_ARG ) )
      {
        thread.resetMultipleValues();
        final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys( l_index );
        final SubLObject argnum = thread.secondMultipleValue();
        final SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != argnum )
        {
          if( NIL != predicate )
          {
            final SubLObject pred_var = predicate;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, $kw42$TRUE, NIL );
                    SubLObject done_var_$126 = NIL;
                    final SubLObject token_var_$127 = NIL;
                    while ( NIL == done_var_$126)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$127 );
                      final SubLObject valid_$128 = makeBoolean( !token_var_$127.eql( gaf ) );
                      if( NIL != valid_$128 )
                      {
                        final SubLObject var;
                        final SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal( gaf );
                        if( NIL != var )
                        {
                          result = ConsesLow.cons( var, result );
                        }
                      }
                      done_var_$126 = makeBoolean( NIL == valid_$128 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$129 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$129, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
          else
          {
            final SubLObject pred_var = NIL;
            if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred_var ) )
            {
              final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred_var );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, $kw42$TRUE, NIL );
                    SubLObject done_var_$127 = NIL;
                    final SubLObject token_var_$128 = NIL;
                    while ( NIL == done_var_$127)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$128 );
                      final SubLObject valid_$129 = makeBoolean( !token_var_$128.eql( gaf ) );
                      if( NIL != valid_$129 )
                      {
                        final SubLObject var;
                        final SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal( gaf );
                        if( NIL != var )
                        {
                          result = ConsesLow.cons( var, result );
                        }
                      }
                      done_var_$127 = makeBoolean( NIL == valid_$129 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$130 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$130, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
          }
        }
        else if( NIL != predicate )
        {
          final SubLObject pred_var = predicate;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, $kw42$TRUE, NIL );
                  SubLObject done_var_$128 = NIL;
                  final SubLObject token_var_$129 = NIL;
                  while ( NIL == done_var_$128)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$129 );
                    final SubLObject valid_$130 = makeBoolean( !token_var_$129.eql( gaf ) );
                    if( NIL != valid_$130 )
                    {
                      final SubLObject var;
                      final SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal( gaf );
                      if( NIL != var )
                      {
                        result = ConsesLow.cons( var, result );
                      }
                    }
                    done_var_$128 = makeBoolean( NIL == valid_$130 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$131, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
        else
        {
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw9$GAF, $kw42$TRUE, NIL );
                  SubLObject done_var_$129 = NIL;
                  final SubLObject token_var_$130 = NIL;
                  while ( NIL == done_var_$129)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$130 );
                    final SubLObject valid_$131 = makeBoolean( !token_var_$130.eql( gaf ) );
                    if( NIL != valid_$131 )
                    {
                      final SubLObject var;
                      final SubLObject bindings_assertion = var = removal_negationinverse_gaf_iterator_internal( gaf );
                      if( NIL != var )
                      {
                        result = ConsesLow.cons( var, result );
                      }
                    }
                    done_var_$129 = makeBoolean( NIL == valid_$131 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$132 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$132, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
        }
      }
      else if( pcase_var.eql( $kw10$PREDICATE_EXTENT ) )
      {
        final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key( l_index );
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$133 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$143 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
            SubLObject done_var2 = NIL;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw9$GAF, $kw42$TRUE, NIL );
                  SubLObject done_var_$130 = NIL;
                  final SubLObject token_var_$131 = NIL;
                  while ( NIL == done_var_$130)
                  {
                    final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$131 );
                    final SubLObject valid_$132 = makeBoolean( !token_var_$131.eql( gaf2 ) );
                    if( NIL != valid_$132 )
                    {
                      final SubLObject var2;
                      final SubLObject bindings_assertion2 = var2 = removal_negationinverse_gaf_iterator_internal( gaf2 );
                      if( NIL != var2 )
                      {
                        result = ConsesLow.cons( var2, result );
                      }
                    }
                    done_var_$130 = makeBoolean( NIL == valid_$132 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$134 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values5 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values5 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$134, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 );
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
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$143, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$133, thread );
          }
        }
      }
      else if( pcase_var.eql( $kw11$OVERLAP ) )
      {
        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index( kb_mapping_macros.do_gli_vo_extract_key( l_index ), UNPROVIDED );
        SubLObject gaf3 = NIL;
        gaf3 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != assertions_high.assertion_has_truth( gaf3, $kw42$TRUE ) )
          {
            final SubLObject var3;
            final SubLObject bindings_assertion3 = var3 = removal_negationinverse_gaf_iterator_internal( gaf3 );
            if( NIL != var3 )
            {
              result = ConsesLow.cons( var3, result );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          gaf3 = cdolist_list_var.first();
        }
      }
      else
      {
        kb_mapping_macros.do_gli_method_error( l_index, method );
      }
    }
    finally
    {
      pred_relevance_macros.$relevant_pred_function$.rebind( _prev_bind_2, thread );
      control_vars.$inference_literal$.rebind( _prev_bind_0, thread );
    }
    if( NIL != result )
    {
      return iteration.new_list_iterator( result );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 27118L)
  public static SubLObject removal_negationinverse_gaf_iterator_internal(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != backward_utilities.direction_is_relevant( assertion ) )
    {
      final SubLObject assertion_asent = assertions_high.gaf_formula( assertion );
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.gaf_asent_inverse_args_unify( control_vars.$inference_literal$.getDynamicValue( thread ), assertion_asent, UNPROVIDED, UNPROVIDED );
      final SubLObject gaf_asent = thread.secondMultipleValue();
      final SubLObject unify_justification = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        return ConsesLow.list( v_bindings, assertion );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 27540L)
  public static SubLObject removal_negationinverse_lookup_supports(final SubLObject asent, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate( assertion );
    final SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject hl_formula = backward_utilities.inference_make_commutative_asent( $const50$negationInverse, ConsesLow.list( inf_pred, ass_pred ) );
    final SubLObject hl_support = arguments.make_hl_support( $kw46$NEGATIONPREDS, hl_formula, UNPROVIDED, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification_utilities.gaf_asent_inverse_args_unify( asent, assertions_high.gaf_formula( assertion ), T, T );
    final SubLObject gaf_asent = thread.secondMultipleValue();
    final SubLObject unify_justification = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.append( ConsesLow.list( assertion, hl_support ), unify_justification );
  }

  public static SubLObject declare_removal_modules_genlpreds_lookup_file()
  {
    SubLFiles.declareFunction( me, "removal_genlpreds_lookup_pos_cost", "REMOVAL-GENLPREDS-LOOKUP-POS-COST", 1, 1, false );
    new $removal_genlpreds_lookup_pos_cost$UnaryFunction();
    new $removal_genlpreds_lookup_pos_cost$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_genlpreds_lookup_pos_iterator", "REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR", 1, 0, false );
    new $removal_genlpreds_lookup_pos_iterator$UnaryFunction();
    SubLFiles.declareFunction( me, "removal_genlpreds_lookup_neg_completeness", "REMOVAL-GENLPREDS-LOOKUP-NEG-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_genlpreds_lookup_neg_cost", "REMOVAL-GENLPREDS-LOOKUP-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_genlpreds_lookup_neg_iterator", "REMOVAL-GENLPREDS-LOOKUP-NEG-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_genlpreds_lookup_iterator", "REMOVAL-GENLPREDS-LOOKUP-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "obfuscate_predicate", "OBFUSCATE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "best_genlpreds_gaf_lookup_index", "BEST-GENLPREDS-GAF-LOOKUP-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "num_best_genlpreds_gaf_lookup_index", "NUM-BEST-GENLPREDS-GAF-LOOKUP-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "num_best_genlpreds_or_inverse_gaf_lookup_index", "NUM-BEST-GENLPREDS-OR-INVERSE-GAF-LOOKUP-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_genlpreds_gaf_iterator_internal", "REMOVAL-GENLPREDS-GAF-ITERATOR-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_genlpreds_lookup_supports", "REMOVAL-GENLPREDS-LOOKUP-SUPPORTS", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_genlpreds_pred_index_pos_cost", "REMOVAL-GENLPREDS-PRED-INDEX-POS-COST", 1, 1, false );
    new $removal_genlpreds_pred_index_pos_cost$UnaryFunction();
    new $removal_genlpreds_pred_index_pos_cost$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_genlpreds_pred_index_pos_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-POS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_genlpreds_pred_index_neg_completeness", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_genlpreds_pred_index_neg_cost", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_genlpreds_pred_index_neg_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_genlpreds_pred_index_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_lookup_pos_cost", "REMOVAL-GENLINVERSE-LOOKUP-POS-COST", 1, 1, false );
    new $removal_genlinverse_lookup_pos_cost$UnaryFunction();
    new $removal_genlinverse_lookup_pos_cost$BinaryFunction();
    SubLFiles.declareFunction( me, "removal_genlinverse_lookup_pos_iterator", "REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR", 1, 0, false );
    new $removal_genlinverse_lookup_pos_iterator$UnaryFunction();
    SubLFiles.declareFunction( me, "removal_genlinverse_lookup_neg_completeness", "REMOVAL-GENLINVERSE-LOOKUP-NEG-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_lookup_neg_cost", "REMOVAL-GENLINVERSE-LOOKUP-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_lookup_neg_iterator", "REMOVAL-GENLINVERSE-LOOKUP-NEG-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_lookup_iterator", "REMOVAL-GENLINVERSE-LOOKUP-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "best_genlinverse_gaf_lookup_index", "BEST-GENLINVERSE-GAF-LOOKUP-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "num_best_genlinverse_gaf_lookup_index", "NUM-BEST-GENLINVERSE-GAF-LOOKUP-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_gaf_iterator_internal", "REMOVAL-GENLINVERSE-GAF-ITERATOR-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_lookup_supports", "REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_pred_index_pos_cost", "REMOVAL-GENLINVERSE-PRED-INDEX-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_pred_index_pos_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-POS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_pred_index_neg_completeness", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_pred_index_neg_cost", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_pred_index_neg_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_genlinverse_pred_index_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_negationpreds_lookup_completeness", "REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_negationpreds_lookup_cost", "REMOVAL-NEGATIONPREDS-LOOKUP-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_negationpreds_lookup_iterator", "REMOVAL-NEGATIONPREDS-LOOKUP-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_negationpreds_gaf_iterator_internal", "REMOVAL-NEGATIONPREDS-GAF-ITERATOR-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_negationpreds_lookup_supports", "REMOVAL-NEGATIONPREDS-LOOKUP-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_negationinverse_lookup_iterator", "REMOVAL-NEGATIONINVERSE-LOOKUP-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_negationinverse_gaf_iterator_internal", "REMOVAL-NEGATIONINVERSE-GAF-ITERATOR-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_negationinverse_lookup_supports", "REMOVAL-NEGATIONINVERSE-LOOKUP-SUPPORTS", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_genlpreds_lookup_file()
  {
    $unknown_hl_variable$ = SubLFiles.deflexical( "*UNKNOWN-HL-VARIABLE*", maybeDefault( $sym12$_UNKNOWN_HL_VARIABLE_, $unknown_hl_variable$, () -> ( variables.get_variable( ZERO_INTEGER ) ) ) );
    return NIL;
  }

  public static SubLObject setup_removal_modules_genlpreds_lookup_file()
  {
    inference_modules.inference_removal_module( $kw1$REMOVAL_GENLPREDS_LOOKUP_POS, $list2 );
    inference_modules.inference_removal_module( $kw6$REMOVAL_GENLPREDS_LOOKUP_NEG, $list7 );
    subl_macro_promotions.declare_defglobal( $sym12$_UNKNOWN_HL_VARIABLE_ );
    inference_modules.inference_removal_module( $kw29$REMOVAL_GENLPREDS_PRED_INDEX_POS, $list30 );
    inference_modules.inference_removal_module( $kw31$REMOVAL_GENLPREDS_PRED_INDEX_NEG, $list32 );
    inference_modules.inference_removal_module( $kw33$REMOVAL_GENLINVERSE_LOOKUP_POS, $list34 );
    inference_modules.inference_removal_module( $kw35$REMOVAL_GENLINVERSE_LOOKUP_NEG, $list36 );
    inference_modules.inference_removal_module( $kw37$REMOVAL_GENLINVERSE_PRED_INDEX_POS, $list38 );
    inference_modules.inference_removal_module( $kw39$REMOVAL_GENLINVERSE_PRED_INDEX_NEG, $list40 );
    inference_modules.inference_removal_module( $kw43$REMOVAL_NEGATIONPREDS_LOOKUP, $list44 );
    inference_modules.inference_removal_module( $kw48$REMOVAL_NEGATIONINVERSE_LOOKUP, $list49 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_genlpreds_lookup_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_genlpreds_lookup_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_genlpreds_lookup_file();
  }
  static
  {
    me = new removal_modules_genlpreds_lookup();
    $unknown_hl_variable$ = null;
    $kw0$POS = makeKeyword( "POS" );
    $kw1$REMOVAL_GENLPREDS_LOOKUP_POS = makeKeyword( "REMOVAL-GENLPREDS-LOOKUP-POS" );
    $list2 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "ASENT-HAS-INDEXED-TERM-ARG-P" ) ), ConsesLow.cons(
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-GENLPREDS-LOOKUP-POS-COST" ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ),
          ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR" ),
              makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow
                  .list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                          "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                              "REMOVAL-GENLPREDS-LOOKUP-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword(
                                  "POS" ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(<predicate> ... <indexed-term> ... )\nusing true assertions using spec-preds of <predicate>" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$geopoliticalSubdivision #$France #$CityOfParisFrance)" )
    } );
    $kw3$NEG = makeKeyword( "NEG" );
    $kw4$GROSSLY_INCOMPLETE = makeKeyword( "GROSSLY-INCOMPLETE" );
    $kw5$INCOMPLETE = makeKeyword( "INCOMPLETE" );
    $kw6$REMOVAL_GENLPREDS_LOOKUP_NEG = makeKeyword( "REMOVAL-GENLPREDS-LOOKUP-NEG" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "ASENT-HAS-INDEXED-TERM-ARG-P" ) ), ConsesLow.cons(
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-GENL-PRED-OR-INVERSE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-GENLPREDS-LOOKUP-NEG-COST" ),
      makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLPREDS-LOOKUP-NEG-COMPLETENESS" ), makeKeyword( "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow
          .list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLPREDS-LOOKUP-NEG-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
          .list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow
                      .list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLPREDS-LOOKUP-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                          "ASSERTION" ) ), makeKeyword( "NEG" ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (<predicate> ... <indexed-term> ... ))\nusing false assertions using genl-preds of <predicate>" )
    } );
    $kw8$GAF_ARG = makeKeyword( "GAF-ARG" );
    $kw9$GAF = makeKeyword( "GAF" );
    $kw10$PREDICATE_EXTENT = makeKeyword( "PREDICATE-EXTENT" );
    $kw11$OVERLAP = makeKeyword( "OVERLAP" );
    $sym12$_UNKNOWN_HL_VARIABLE_ = makeSymbol( "*UNKNOWN-HL-VARIABLE*" );
    $list13 = ConsesLow.list( makeKeyword( "PREDICATE-EXTENT" ), makeKeyword( "GAF-ARG" ) );
    $const14$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $kw15$DEPTH = makeKeyword( "DEPTH" );
    $kw16$STACK = makeKeyword( "STACK" );
    $kw17$QUEUE = makeKeyword( "QUEUE" );
    $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw19$ERROR = makeKeyword( "ERROR" );
    $str20$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym21$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw22$CERROR = makeKeyword( "CERROR" );
    $str23$continue_anyway = makeString( "continue anyway" );
    $kw24$WARN = makeKeyword( "WARN" );
    $str25$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str26$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str27$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str28$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $kw29$REMOVAL_GENLPREDS_PRED_INDEX_POS = makeKeyword( "REMOVAL-GENLPREDS-PRED-INDEX-POS" );
    $list30 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "ASENT-HAS-INDEXED-TERM-ARG-P" ) ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-GENLPREDS-PRED-INDEX-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
              "REMOVAL-GENLPREDS-PRED-INDEX-POS-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( ConsesLow.list( makeKeyword(
                  "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow
                      .list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "SUBST-BINDINGS" ), ConsesLow.list(
                          makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                              makeSymbol( "REMOVAL-GENLPREDS-LOOKUP-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ),
                              makeKeyword( "POS" ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(<predicate> <non-indexed-term> ... <non-indexed-term>)\nusing true assertions using spec-preds of <predicate>" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$spatiallyIntersects ?WHAT ?WHAT-ELSE)" )
    } );
    $kw31$REMOVAL_GENLPREDS_PRED_INDEX_NEG = makeKeyword( "REMOVAL-GENLPREDS-PRED-INDEX-NEG" );
    $list32 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "ASENT-HAS-INDEXED-TERM-ARG-P" ) ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-GENL-PRED-OR-INVERSE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-GENLPREDS-PRED-INDEX-NEG-COST" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLPREDS-PRED-INDEX-NEG-COMPLETENESS" ), makeKeyword(
          "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLPREDS-PRED-INDEX-NEG-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword(
                  "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                      makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ),
      makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword(
          "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLPREDS-LOOKUP-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "NEG" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                  "(#$not (<predicate> <non-indexed-term> ... <non-indexed-term> ))\nusing false assertions using genl-preds of <predicate>" ), makeKeyword( "EXAMPLE" ), makeString(
                      "(#$not (#$spatiallyIntersects ?WHAT ?WHAT-ELSE))" )
    } );
    $kw33$REMOVAL_GENLINVERSE_LOOKUP_POS = makeKeyword( "REMOVAL-GENLINVERSE-LOOKUP-POS" );
    $list34 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "ASENT-HAS-INDEXED-TERM-ARG-P" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-GENLINVERSE-LOOKUP-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
              "REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( ConsesLow.list( makeKeyword(
                  "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow
                      .list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "SUBST-BINDINGS" ), ConsesLow.list(
                          makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                              makeSymbol( "REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ),
                              makeKeyword( "POS" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                  "(<predicate> <indexed-term> <whatever>) and \n(<predicate> <whatever> <indexed-term>) \nusing true assertions using spec-inverses of <predicate>" )
    } );
    $kw35$REMOVAL_GENLINVERSE_LOOKUP_NEG = makeKeyword( "REMOVAL-GENLINVERSE-LOOKUP-NEG" );
    $list36 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "ASENT-HAS-INDEXED-TERM-ARG-P" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-GENL-PRED-OR-INVERSE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-GENLINVERSE-LOOKUP-NEG-COST" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLINVERSE-LOOKUP-NEG-COMPLETENESS" ), makeKeyword(
          "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLINVERSE-LOOKUP-NEG-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword(
                  "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                      makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ),
      makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword(
          "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "NEG" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                  "(#$not (<predicate> <indexed-term> <whatever>)) and \n(#$not (<predicate> <whatever> <indexed-term>))\nusing false assertions using genl-inverses of <predicate>" )
    } );
    $kw37$REMOVAL_GENLINVERSE_PRED_INDEX_POS = makeKeyword( "REMOVAL-GENLINVERSE-PRED-INDEX-POS" );
    $list38 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ),
            makeSymbol( "ASENT-HAS-INDEXED-TERM-ARG-P" ) ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword(
                "COST" ), makeSymbol( "REMOVAL-GENLINVERSE-PRED-INDEX-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                    "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow
                        .list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLINVERSE-PRED-INDEX-POS-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword(
                            "TEMPLATE" ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow
                                .list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow
                                    .list( makeKeyword( "CALL" ), makeSymbol( "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                        "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ),
                                            makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "POS" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                "(<predicate> <non-indexed-term> <non-indexed-term> )\nusing true assertions using spec-inverses of <predicate>" )
    } );
    $kw39$REMOVAL_GENLINVERSE_PRED_INDEX_NEG = makeKeyword( "REMOVAL-GENLINVERSE-PRED-INDEX-NEG" );
    $list40 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), TWO_INTEGER, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "TEST" ),
            makeSymbol( "ASENT-HAS-INDEXED-TERM-ARG-P" ) ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-GENL-PRED-OR-INVERSE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword(
                "COST" ), makeSymbol( "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COST" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                    "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COMPLETENESS" ), makeKeyword( "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ),
                        makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                            "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( ConsesLow.list(
                                makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                    "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                        "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword(
                                            "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                                "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ), makeKeyword( "NEG" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                    "(#$not (<predicate> <non-indexed-term> <non-indexed-term> ))\nusing false assertions using genl-inverses of <predicate>" )
    } );
    $sym41$INFERENCE_NEGATION_PREDICATE_ = makeSymbol( "INFERENCE-NEGATION-PREDICATE?" );
    $kw42$TRUE = makeKeyword( "TRUE" );
    $kw43$REMOVAL_NEGATIONPREDS_LOOKUP = makeKeyword( "REMOVAL-NEGATIONPREDS-LOOKUP" );
    $list44 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.cons(
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "ASENT-HAS-INDEXED-TERM-ARG-P" ) ), ConsesLow.cons(
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-NEGATIONPREDS-LOOKUP-COST" ),
      makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS" ), makeKeyword( "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow
          .list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-NEGATIONPREDS-LOOKUP-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
          .list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "SUPPORT-PATTERN" ), ConsesLow
                      .list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-NEGATIONPREDS-LOOKUP-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                          makeSymbol( "ASSERTION" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (<predicate> ... <indexed-term> ... ))\nusing true assertions using negation-preds of <predicate>" )
    } );
    $const45$negationPreds = constant_handles.reader_make_constant_shell( makeString( "negationPreds" ) );
    $kw46$NEGATIONPREDS = makeKeyword( "NEGATIONPREDS" );
    $sym47$INFERENCE_NEGATION_INVERSE_ = makeSymbol( "INFERENCE-NEGATION-INVERSE?" );
    $kw48$REMOVAL_NEGATIONINVERSE_LOOKUP = makeKeyword( "REMOVAL-NEGATIONINVERSE-LOOKUP" );
    $list49 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "ARITY" ), NIL, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list(
        makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "NON-HL-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ),
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "ASENT-HAS-INDEXED-TERM-ARG-P" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?" ) ),
            makeKeyword( "ANYTHING" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-NEGATIONPREDS-LOOKUP-COST" ), makeKeyword( "COMPLETENESS-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                "REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS" ), makeKeyword( "INPUT" ) ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                        "REMOVAL-NEGATIONINVERSE-LOOKUP-ITERATOR" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-DECODE-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( ConsesLow.list(
                            makeKeyword( "BIND" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                    "SUBST-BINDINGS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASENT" ) ) ), makeKeyword(
                                        "SUPPORT-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-NEGATIONINVERSE-LOOKUP-SUPPORTS" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                            "ASENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "ASSERTION" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                "(#$not (<predicate> ... <indexed-term> ... ))\n    using true assertions using negation-inverses of <predicate>" )
    } );
    $const50$negationInverse = constant_handles.reader_make_constant_shell( makeString( "negationInverse" ) );
  }

  public static final class $removal_genlpreds_lookup_pos_cost$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_genlpreds_lookup_pos_cost$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-GENLPREDS-LOOKUP-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_genlpreds_lookup_pos_cost( arg1, $removal_genlpreds_lookup_pos_cost$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_genlpreds_lookup_pos_cost$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_genlpreds_lookup_pos_cost$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-GENLPREDS-LOOKUP-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_genlpreds_lookup_pos_cost( arg1, arg2 );
    }
  }

  public static final class $removal_genlpreds_lookup_pos_iterator$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_genlpreds_lookup_pos_iterator$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_genlpreds_lookup_pos_iterator( arg1 );
    }
  }

  public static final class $removal_genlpreds_pred_index_pos_cost$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_genlpreds_pred_index_pos_cost$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-GENLPREDS-PRED-INDEX-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_genlpreds_pred_index_pos_cost( arg1, $removal_genlpreds_pred_index_pos_cost$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_genlpreds_pred_index_pos_cost$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_genlpreds_pred_index_pos_cost$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-GENLPREDS-PRED-INDEX-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_genlpreds_pred_index_pos_cost( arg1, arg2 );
    }
  }

  public static final class $removal_genlinverse_lookup_pos_cost$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_genlinverse_lookup_pos_cost$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-GENLINVERSE-LOOKUP-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_genlinverse_lookup_pos_cost( arg1, $removal_genlinverse_lookup_pos_cost$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $removal_genlinverse_lookup_pos_cost$BinaryFunction
      extends
        BinaryFunction
  {
    public $removal_genlinverse_lookup_pos_cost$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-GENLINVERSE-LOOKUP-POS-COST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return removal_genlinverse_lookup_pos_cost( arg1, arg2 );
    }
  }

  public static final class $removal_genlinverse_lookup_pos_iterator$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_genlinverse_lookup_pos_iterator$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_genlinverse_lookup_pos_iterator( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2502 ms
 * 
 */