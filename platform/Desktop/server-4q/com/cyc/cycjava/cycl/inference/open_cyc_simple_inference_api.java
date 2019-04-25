package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.semtrans_lexicon;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.builder_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.concept_tagger;
import com.cyc.cycjava.cycl.document;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.api_widgets;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.parsing_macros;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.verbosifier;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class open_cyc_simple_inference_api
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api";
  public static final String myFingerPrint = "146335e13ec352d6dde2420b329a049e5d8e0c91bbff5e1ae6c9ffa2deef250f";
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 980L)
  private static SubLSymbol $simple_query_default_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1170L)
  private static SubLSymbol $simple_query_default_nl_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1245L)
  private static SubLSymbol $simple_boolean_default_time$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1301L)
  private static SubLSymbol $simple_boolean_nl_default_time$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  private static SubLSymbol $nl_query_denots_of_string_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  private static SubLSymbol $first_order_collectionP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  private static SubLSymbol $variable_order_collectionP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  private static SubLSymbol $get_simple_inference_semtrans_lexicon$;
  private static final SubLList $list0;
  private static final SubLObject $const1$RelationParaphraseMt;
  private static final SubLSymbol $sym2$SIMPLE_BOOLEAN_QUERY_EXTERNAL_ID;
  private static final SubLSymbol $sym3$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING;
  private static final SubLSymbol $sym4$SIMPLE_BOOLEAN_QUERY_CYCL;
  private static final SubLSymbol $kw5$ERROR;
  private static final SubLString $str6$The_sentence_contains_an_open_var;
  private static final SubLString $str7$The_sentence_;
  private static final SubLString $str8$_is_not_a_valid_CycL_sentence_;
  private static final SubLSymbol $kw9$FALSE;
  private static final SubLString $str10$_is_not_semantically_well_formed;
  private static final SubLSymbol $kw11$MAX_TIME;
  private static final SubLSymbol $kw12$PROBLEM_STORE;
  private static final SubLList $list13;
  private static final SubLString $str14$Timed_out;
  private static final SubLSymbol $kw15$TRUE;
  private static final SubLObject $const16$not;
  private static final SubLSymbol $kw17$UNKNOWN;
  private static final SubLSymbol $sym18$SIMPLE_BOOLEAN_QUERY_NL;
  private static final SubLObject $const19$is_Underspecified;
  private static final SubLSymbol $sym20$PREDICATE_P;
  private static final SubLSymbol $sym21$NL_QUERY_DENOTS_OF_STRING;
  private static final SubLList $list22;
  private static final SubLSymbol $kw23$WFF;
  private static final SubLString $str24$Timed_out_before_completion;
  private static final SubLSymbol $sym25$SECOND;
  private static final SubLObject $const26$Thing;
  private static final SubLObject $const27$CurrentWorldDataCollectorMt_NonHo;
  private static final SubLSymbol $sym28$BAD_FOR_TAGGING_;
  private static final SubLSymbol $kw29$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym30$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str31$_cyc_projects_doc_annotation_comp;
  private static final SubLSymbol $kw32$APPEND;
  private static final SubLString $str33$Unable_to_open__S;
  private static final SubLString $str34$_S_A_S_A_S__;
  private static final SubLSymbol $sym35$_NL_QUERY_DENOTS_OF_STRING_CACHING_STATE_;
  private static final SubLInteger $int36$128000;
  private static final SubLObject $const37$relationExistsInstance;
  private static final SubLObject $const38$relationInstanceExists;
  private static final SubLObject $const39$relationExistsExists;
  private static final SubLSymbol $kw40$VARIABLE;
  private static final SubLSymbol $sym41$FIRST_ORDER_COLLECTION_;
  private static final SubLObject $const42$FirstOrderCollection;
  private static final SubLSymbol $sym43$_FIRST_ORDER_COLLECTION__CACHING_STATE_;
  private static final SubLSymbol $sym44$VARIABLE_ORDER_COLLECTION_;
  private static final SubLObject $const45$VariedOrderCollection;
  private static final SubLSymbol $sym46$_VARIABLE_ORDER_COLLECTION__CACHING_STATE_;
  private static final SubLSymbol $sym47$GET;
  private static final SubLSymbol $kw48$SEMTRANS;
  private static final SubLSymbol $kw49$CYC_POS;
  private static final SubLSymbol $kw50$FRAME;
  private static final SubLObject $const51$Verb;
  private static final SubLObject $const52$TransitiveNPFrame;
  private static final SubLSymbol $kw53$ACTION;
  private static final SubLObject $const54$thereExists;
  private static final SubLSymbol $sym55$_EVENT;
  private static final SubLSymbol $sym56$KEYWORDP;
  private static final SubLSymbol $kw57$SUBJECT;
  private static final SubLSymbol $kw58$OBJECT;
  private static final SubLSymbol $sym59$_SUBJ;
  private static final SubLObject $const60$and;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$_FIRST_ORDER_SUBJ;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$_OBJ;
  private static final SubLList $list66;
  private static final SubLObject $const67$genls;
  private static final SubLObject $const68$isa;
  private static final SubLSymbol $kw69$UNINITIALIZED;
  private static final SubLString $str70$Unable_to_initialize__A__;
  private static final SubLSymbol $sym71$IGNORE_CACHE;
  private static final SubLSymbol $sym72$COMPACT_HL_EXTERNAL_ID_STRING;
  private static final SubLSymbol $sym73$SIMPLE_BOOLEAN_QUERY_TEST;
  private static final SubLSymbol $kw74$TEST;
  private static final SubLSymbol $kw75$OWNER;
  private static final SubLSymbol $kw76$CLASSES;
  private static final SubLSymbol $kw77$KB;
  private static final SubLSymbol $kw78$FULL;
  private static final SubLSymbol $kw79$WORKING_;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$SIMPLE_BOOLEAN_QUERY_NL_TEST;
  private static final SubLList $list82;

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1360L)
  public static SubLObject get_simple_query_default_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $simple_query_default_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1442L)
  public static SubLObject get_simple_query_default_nl_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $simple_query_default_nl_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1530L)
  public static SubLObject simple_boolean_query_external_id(final SubLObject pred_id, final SubLObject arg_ids, SubLObject max_time_sec, SubLObject mt_id)
  {
    if( max_time_sec == UNPROVIDED )
    {
      max_time_sec = ONE_INTEGER;
    }
    if( mt_id == UNPROVIDED )
    {
      mt_id = NIL;
    }
    final SubLObject pred = kb_utilities.find_object_by_compact_hl_external_id_string( pred_id );
    final SubLObject args = Mapping.mapcar( $sym3$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING, arg_ids );
    final SubLObject mt = ( NIL != mt_id ) ? kb_utilities.find_object_by_compact_hl_external_id_string( mt_id ) : get_simple_query_default_mt();
    return simple_boolean_query_cycl( pred, args, max_time_sec, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 2555L)
  public static SubLObject simple_boolean_query_cycl(final SubLObject pred, final SubLObject args, SubLObject max_time_sec, SubLObject mt)
  {
    if( max_time_sec == UNPROVIDED )
    {
      max_time_sec = $simple_boolean_default_time$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = get_simple_query_default_mt();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject result2 = NIL;
    final SubLObject sentence = ConsesLow.cons( pred, args );
    if( NIL == el_utilities.closedP( sentence, UNPROVIDED ) )
    {
      result = $kw5$ERROR;
      result2 = $str6$The_sentence_contains_an_open_var;
    }
    if( NIL == collection_defns.cycl_sentenceP( sentence ) )
    {
      result = $kw5$ERROR;
      result2 = Sequences.cconcatenate( $str7$The_sentence_, new SubLObject[] { format_nil.format_nil_s_no_copy( sentence ), $str8$_is_not_a_valid_CycL_sentence_
      } );
    }
    if( NIL == result && NIL == wff.el_wffP( verbosifier.el_expansion( sentence, mt ), mt, UNPROVIDED ) )
    {
      result = $kw9$FALSE;
      result2 = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( sentence ), $str10$_is_not_semantically_well_formed );
    }
    if( NIL == result )
    {
      final SubLObject problem_store = inference_datastructures_problem_store.new_problem_store( UNPROVIDED );
      final SubLObject positive_query_max_time = Numbers.divide( max_time_sec, TWO_INTEGER );
      final SubLObject inference_props = ConsesLow.listS( $kw11$MAX_TIME, positive_query_max_time, $kw12$PROBLEM_STORE, problem_store, $list13 );
      thread.resetMultipleValues();
      SubLObject temp_result = inference_kernel.new_cyc_query( sentence, mt, inference_props );
      final SubLObject halt_reason = thread.secondMultipleValue();
      final SubLObject inference = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( halt_reason == $kw11$MAX_TIME )
      {
        result = $kw5$ERROR;
        result2 = Sequences.copy_seq( $str14$Timed_out );
      }
      if( NIL != cyc_kernel.closed_query_success_token_p( temp_result ) )
      {
        result = $kw15$TRUE;
      }
      if( NIL == result )
      {
        final SubLObject negative_query_max_time = Numbers.subtract( max_time_sec, inference_datastructures_inference.inference_cumulative_time_so_far( inference, NIL ) );
        final SubLObject negative_query = ConsesLow.list( $const16$not, sentence );
        final SubLObject inference_props_$1 = ConsesLow.list( $kw11$MAX_TIME, negative_query_max_time, $kw12$PROBLEM_STORE, problem_store );
        inference_datastructures_inference.destroy_inference( inference );
        temp_result = inference_kernel.new_cyc_query( negative_query, mt, inference_props_$1 );
        if( NIL != cyc_kernel.closed_query_success_token_p( temp_result ) )
        {
          result = $kw9$FALSE;
        }
      }
      inference_datastructures_problem_store.destroy_problem_store( problem_store );
    }
    if( NIL == result )
    {
      result = $kw17$UNKNOWN;
    }
    return ConsesLow.list( result, result2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject simple_boolean_query_nl(final SubLObject pred_string, final SubLObject arg_strings, SubLObject max_time_sec, SubLObject mt, SubLObject language_mt)
  {
    if( max_time_sec == UNPROVIDED )
    {
      max_time_sec = $simple_boolean_nl_default_time$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = get_simple_query_default_mt();
    }
    if( language_mt == UNPROVIDED )
    {
      language_mt = get_simple_query_default_nl_mt();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    SubLObject timed_out = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding( thread );
    final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_time$.currentBinding( thread );
    final SubLObject _prev_bind_4 = parsing_macros.$parsing_timeout_reachedP$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( language_mt, thread );
      parsing_macros.$parsing_timeout_time_check_count$.bind( ZERO_INTEGER, thread );
      parsing_macros.$parsing_timeout_time$.bind( parsing_macros.parsing_compute_timeout_time( max_time_sec ), thread );
      parsing_macros.$parsing_timeout_reachedP$.bind( parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ), thread );
      parsing_macros.$parsing_timeout_reachedP$.setDynamicValue( parsing_macros.parsing_timeout_time_reachedP(), thread );
      if( NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ) )
      {
        final SubLObject pred_interps = Sequences.remove( $const19$is_Underspecified, list_utilities.remove_if_not( $sym20$PREDICATE_P, lexicon_accessors.denots_of_string( pred_string, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject args_interps = Mapping.mapcar( $sym21$NL_QUERY_DENOTS_OF_STRING, arg_strings );
        final SubLObject all_raw_semtrans_sentences = get_semtrans_sentences( pred_string, args_interps );
        final SubLObject all_raw_pred_sentences = list_utilities.cartesian_product( ConsesLow.cons( pred_interps, args_interps ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject all_pred_sentences = add_quantifiers_if_needed( all_raw_pred_sentences, mt );
        final SubLObject all_sentences = Sequences.cconcatenate( all_raw_semtrans_sentences, all_pred_sentences );
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try
        {
          thread.throwStack.push( tag );
          final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$within_with_timeout$.bind( T, thread );
            SubLObject timer = NIL;
            try
            {
              final SubLObject _prev_bind_0_$3 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
              try
              {
                subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                timer = subl_macro_promotions.with_timeout_start_timer( max_time_sec, tag );
                SubLObject cdolist_list_var = all_sentences;
                SubLObject query_sentence = NIL;
                query_sentence = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  SubLObject current;
                  final SubLObject datum = current = simple_boolean_query_cycl( query_sentence.first(), query_sentence.rest(), max_time_sec, mt );
                  SubLObject result = NIL;
                  SubLObject error_msg = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
                  result = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
                  error_msg = current.first();
                  current = current.rest();
                  if( NIL == current )
                  {
                    final SubLObject pcase_var = result;
                    if( pcase_var.eql( $kw5$ERROR ) )
                    {
                      result = $kw17$UNKNOWN;
                    }
                    else if( pcase_var.eql( $kw17$UNKNOWN ) )
                    {
                      result = $kw23$WFF;
                    }
                    results = ConsesLow.cons( ConsesLow.list( query_sentence, result, error_msg ), results );
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  query_sentence = cdolist_list_var.first();
                }
              }
              finally
              {
                subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$3, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                subl_macro_promotions.with_timeout_stop_timer( timer );
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
            subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$2, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          timed_out = Errors.handleThrowable( ccatch_env_var, tag );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      timed_out = parsing_macros.parsing_timeout_time_reachedP();
    }
    finally
    {
      parsing_macros.$parsing_timeout_reachedP$.rebind( _prev_bind_4, thread );
      parsing_macros.$parsing_timeout_time$.rebind( _prev_bind_3, thread );
      parsing_macros.$parsing_timeout_time_check_count$.rebind( _prev_bind_2, thread );
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL != timed_out )
    {
      results = ConsesLow.cons( ConsesLow.list( NIL, $kw17$UNKNOWN, $str24$Timed_out_before_completion ), results );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject clear_nl_query_denots_of_string()
  {
    final SubLObject cs = $nl_query_denots_of_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject remove_nl_query_denots_of_string(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $nl_query_denots_of_string_caching_state$.getGlobalValue(), ConsesLow.list( string, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject nl_query_denots_of_string_internal(final SubLObject string, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject determiner_free = lexicon_utilities.strip_determiner( string, UNPROVIDED );
    final SubLObject possible_denots = Mapping.mapcar( $sym25$SECOND, api_widgets.get_constrained_cycl_for_string( determiner_free, $const26$Thing, $const27$CurrentWorldDataCollectorMt_NonHo, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject usable_denots = Sequences.remove_if( $sym28$BAD_FOR_TAGGING_, possible_denots, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw29$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym30$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject compound_file = $str31$_cyc_projects_doc_annotation_comp;
          final SubLObject non_lexical = conses_high.set_difference( usable_denots, concept_tagger.all_tagged_concepts( document.new_document( string, UNPROVIDED, UNPROVIDED ), UNPROVIDED ), UNPROVIDED, UNPROVIDED );
          final SubLObject _prev_bind_0_$5 = print_high.$print_pretty$.currentBinding( thread );
          try
          {
            print_high.$print_pretty$.bind( NIL, thread );
            if( NIL != non_lexical )
            {
              SubLObject stream = NIL;
              try
              {
                final SubLObject _prev_bind_0_$6 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_text( compound_file, $kw32$APPEND );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$6, thread );
                }
                if( !stream.isStream() )
                {
                  Errors.error( $str33$Unable_to_open__S, compound_file );
                }
                final SubLObject s = stream;
                PrintLow.format( s, $str34$_S_A_S_A_S__, new SubLObject[] { string, Characters.CHAR_tab, non_lexical, Characters.CHAR_tab, kb_utilities.compact_hl_external_id_string( non_lexical )
                } );
              }
              finally
              {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                }
              }
            }
          }
          finally
          {
            print_high.$print_pretty$.rebind( _prev_bind_0_$5, thread );
          }
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw29$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return usable_denots;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject nl_query_denots_of_string(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject caching_state = $nl_query_denots_of_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym21$NL_QUERY_DENOTS_OF_STRING, $sym35$_NL_QUERY_DENOTS_OF_STRING_CACHING_STATE_, $int36$128000, EQUALP, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( string, mt );
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
        if( string.equalp( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equalp( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( nl_query_denots_of_string_internal( string, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject add_quantifiers_if_needed(final SubLObject sentences, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_sentences = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = sentences;
      SubLObject sentence = NIL;
      sentence = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject pred = cycl_utilities.formula_arg0( sentence );
        if( NIL != kb_accessors.binary_predicateP( pred ) )
        {
          final SubLObject arg1_predicted_order = pred_arg_expected_order( pred, ONE_INTEGER );
          final SubLObject arg2_predicted_order = pred_arg_expected_order( pred, TWO_INTEGER );
          final SubLObject arg1_order = term_order_integer( cycl_utilities.formula_arg1( sentence, UNPROVIDED ) );
          final SubLObject arg2_order = term_order_integer( cycl_utilities.formula_arg2( sentence, UNPROVIDED ) );
          if( arg1_predicted_order.eql( arg1_order ) && arg2_predicted_order.eql( arg2_order ) )
          {
            all_sentences = ConsesLow.cons( sentence, all_sentences );
          }
          else if( arg1_predicted_order.numL( arg1_order ) && arg2_predicted_order.eql( arg2_order ) )
          {
            all_sentences = ConsesLow.cons( ConsesLow.cons( $const37$relationExistsInstance, sentence ), all_sentences );
          }
          else if( arg2_predicted_order.numL( arg2_order ) && arg1_predicted_order.eql( arg1_order ) )
          {
            all_sentences = ConsesLow.cons( ConsesLow.cons( $const38$relationInstanceExists, sentence ), all_sentences );
          }
          else if( arg2_predicted_order.numL( arg2_order ) && arg2_predicted_order.numL( arg2_order ) )
          {
            all_sentences = ConsesLow.cons( ConsesLow.cons( $const39$relationExistsExists, sentence ), all_sentences );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        sentence = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return all_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject term_order_integer(final SubLObject v_term)
  {
    final SubLObject canon_term = czer_main.canonicalize_term( v_term, UNPROVIDED );
    if( NIL != kb_accessors.individualP( canon_term ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL != first_order_collectionP( canon_term, UNPROVIDED ) )
    {
      return ONE_INTEGER;
    }
    if( NIL != builder_utilities.higher_order_collectionP( canon_term ) )
    {
      return TWO_INTEGER;
    }
    if( NIL != variable_order_collectionP( canon_term, UNPROVIDED ) )
    {
      return $kw40$VARIABLE;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject clear_first_order_collectionP()
  {
    final SubLObject cs = $first_order_collectionP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject remove_first_order_collectionP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $first_order_collectionP_caching_state$.getGlobalValue(), ConsesLow.list( v_term, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject first_order_collectionP_internal(final SubLObject v_term, final SubLObject mt)
  {
    return isa.isaP( v_term, $const42$FirstOrderCollection, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject first_order_collectionP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject caching_state = $first_order_collectionP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym41$FIRST_ORDER_COLLECTION_, $sym43$_FIRST_ORDER_COLLECTION__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
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
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( first_order_collectionP_internal( v_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject clear_variable_order_collectionP()
  {
    final SubLObject cs = $variable_order_collectionP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject remove_variable_order_collectionP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $variable_order_collectionP_caching_state$.getGlobalValue(), ConsesLow.list( v_term, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject variable_order_collectionP_internal(final SubLObject v_term, final SubLObject mt)
  {
    return isa.isaP( v_term, $const45$VariedOrderCollection, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject variable_order_collectionP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject caching_state = $variable_order_collectionP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym44$VARIABLE_ORDER_COLLECTION_, $sym46$_VARIABLE_ORDER_COLLECTION__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
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
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( variable_order_collectionP_internal( v_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject pred_arg_expected_order(final SubLObject pred, final SubLObject argnum)
  {
    SubLObject cdolist_list_var = kb_accessors.argn_isa( pred, argnum, UNPROVIDED );
    SubLObject arg_isa_constraint = NIL;
    arg_isa_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != builder_utilities.higher_order_collectionP( arg_isa_constraint ) )
      {
        return ONE_INTEGER;
      }
      if( NIL != fort_types_interface.collectionP( arg_isa_constraint ) )
      {
        return ZERO_INTEGER;
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_isa_constraint = cdolist_list_var.first();
    }
    cdolist_list_var = kb_accessors.argn_genl( pred, argnum, UNPROVIDED );
    SubLObject arg_genl_constraint = NIL;
    arg_genl_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != builder_utilities.higher_order_collectionP( arg_genl_constraint ) )
      {
        return TWO_INTEGER;
      }
      if( NIL != fort_types_interface.collectionP( arg_genl_constraint ) )
      {
        return ONE_INTEGER;
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_genl_constraint = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject get_semtrans_sentences(final SubLObject pred_string, final SubLObject arg_cycls)
  {
    final SubLObject lex = get_simple_inference_semtrans_lexicon();
    final SubLObject lex_entries = methods.funcall_instance_method_with_1_args( lex, $sym47$GET, pred_string );
    SubLObject semtrans_sentences = NIL;
    SubLObject cdolist_list_var = lex_entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject semtrans = methods.funcall_instance_method_with_1_args( entry, $sym47$GET, $kw48$SEMTRANS );
      final SubLObject pos = methods.funcall_instance_method_with_1_args( entry, $sym47$GET, $kw49$CYC_POS );
      final SubLObject frame = methods.funcall_instance_method_with_1_args( entry, $sym47$GET, $kw50$FRAME );
      if( NIL != lexicon_accessors.genl_posP( pos, $const51$Verb, UNPROVIDED ) && frame.eql( $const52$TransitiveNPFrame ) )
      {
        SubLObject cdolist_list_var_$8 = arg_cycls.first();
        SubLObject arg1 = NIL;
        arg1 = cdolist_list_var_$8.first();
        while ( NIL != cdolist_list_var_$8)
        {
          SubLObject cdolist_list_var_$9 = conses_high.second( arg_cycls );
          SubLObject arg2 = NIL;
          arg2 = cdolist_list_var_$9.first();
          while ( NIL != cdolist_list_var_$9)
          {
            SubLObject cdolist_list_var_$10 = add_quantifiers_to_semtrans_if_needed( semtrans, arg1, arg2, UNPROVIDED );
            SubLObject quantified = NIL;
            quantified = cdolist_list_var_$10.first();
            while ( NIL != cdolist_list_var_$10)
            {
              final SubLObject verb_substituted = ( NIL != cycl_utilities.expression_find( $kw53$ACTION, quantified, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? el_utilities.make_formula( $const54$thereExists, ConsesLow
                  .list( $sym55$_EVENT, cycl_utilities.expression_subst( $sym55$_EVENT, $kw53$ACTION, quantified, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED ) : quantified;
              if( NIL == cycl_utilities.expression_find_if( $sym56$KEYWORDP, verb_substituted, UNPROVIDED, UNPROVIDED ) )
              {
                semtrans_sentences = ConsesLow.cons( verb_substituted, semtrans_sentences );
              }
              cdolist_list_var_$10 = cdolist_list_var_$10.rest();
              quantified = cdolist_list_var_$10.first();
            }
            cdolist_list_var_$9 = cdolist_list_var_$9.rest();
            arg2 = cdolist_list_var_$9.first();
          }
          cdolist_list_var_$8 = cdolist_list_var_$8.rest();
          arg1 = cdolist_list_var_$8.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return semtrans_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject add_quantifiers_to_semtrans_if_needed(final SubLObject semtrans_template, final SubLObject subj, final SubLObject obj, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject quantified = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject constraints = at_var_types.inter_formula_variables_arg_constraints( semtrans_template, mt, $sym56$KEYWORDP );
      final SubLObject subj_predicted_order = arg_expected_order_from_constraints( constraints, $kw57$SUBJECT );
      final SubLObject obj_predicted_order = arg_expected_order_from_constraints( constraints, $kw58$OBJECT );
      final SubLObject subj_order = term_order_integer( subj );
      final SubLObject obj_order = term_order_integer( obj );
      if( NIL == subj_order )
      {
        quantified = ConsesLow.cons( semtrans_template, quantified );
      }
      else if( subj_predicted_order == $kw40$VARIABLE )
      {
        quantified = ConsesLow.cons( ConsesLow.list( $const54$thereExists, $sym59$_SUBJ, ConsesLow.list( $const60$and, $list61, cycl_utilities.expression_subst( $sym59$_SUBJ, $kw57$SUBJECT, semtrans_template, UNPROVIDED,
            UNPROVIDED ) ) ), quantified );
        quantified = ConsesLow.cons( semtrans_template, quantified );
      }
      else if( number_utilities.f_1X( subj_predicted_order ).numE( subj_order ) )
      {
        quantified = ConsesLow.cons( ConsesLow.list( $const54$thereExists, $sym59$_SUBJ, ConsesLow.list( $const60$and, $list61, cycl_utilities.expression_subst( $sym59$_SUBJ, $kw57$SUBJECT, semtrans_template, UNPROVIDED,
            UNPROVIDED ) ) ), quantified );
      }
      else if( Numbers.add( TWO_INTEGER, subj_predicted_order ).numE( subj_order ) )
      {
        quantified = ConsesLow.cons( ConsesLow.list( $const54$thereExists, $sym59$_SUBJ, ConsesLow.list( $const60$and, $list61, cycl_utilities.expression_subst( $sym59$_SUBJ, $kw57$SUBJECT, semtrans_template, UNPROVIDED,
            UNPROVIDED ) ) ), quantified );
        quantified = ConsesLow.cons( ConsesLow.list( $const54$thereExists, $sym62$_FIRST_ORDER_SUBJ, ConsesLow.list( $const60$and, $list63, ConsesLow.list( $const54$thereExists, $sym59$_SUBJ, ConsesLow.list(
            $const60$and, $list64, cycl_utilities.expression_subst( $sym59$_SUBJ, $kw57$SUBJECT, semtrans_template, UNPROVIDED, UNPROVIDED ) ) ) ) ), quantified );
      }
      else
      {
        quantified = ConsesLow.cons( semtrans_template, quantified );
      }
      SubLObject obj_quantified = NIL;
      SubLObject cdolist_list_var = quantified;
      SubLObject curr_quantified = NIL;
      curr_quantified = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == obj_order )
        {
          obj_quantified = ConsesLow.cons( curr_quantified, obj_quantified );
        }
        else if( obj_predicted_order == $kw40$VARIABLE )
        {
          obj_quantified = ConsesLow.cons( ConsesLow.list( $const54$thereExists, $sym65$_OBJ, ConsesLow.list( $const60$and, $list66, cycl_utilities.expression_subst( $sym65$_OBJ, $kw58$OBJECT, curr_quantified,
              UNPROVIDED, UNPROVIDED ) ) ), obj_quantified );
          obj_quantified = ConsesLow.cons( curr_quantified, obj_quantified );
        }
        else if( obj_predicted_order.numL( obj_order ) )
        {
          obj_quantified = ConsesLow.cons( ConsesLow.list( $const54$thereExists, $sym65$_OBJ, ConsesLow.list( $const60$and, $list66, cycl_utilities.expression_subst( $sym65$_OBJ, $kw58$OBJECT, curr_quantified,
              UNPROVIDED, UNPROVIDED ) ) ), obj_quantified );
        }
        else
        {
          obj_quantified = ConsesLow.cons( curr_quantified, obj_quantified );
        }
        cdolist_list_var = cdolist_list_var.rest();
        curr_quantified = cdolist_list_var.first();
      }
      quantified = obj_quantified;
      SubLObject substituted = NIL;
      cdolist_list_var = quantified;
      SubLObject sent = NIL;
      sent = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        sent = cycl_utilities.expression_subst( subj, $kw57$SUBJECT, sent, UNPROVIDED, UNPROVIDED );
        substituted = ConsesLow.cons( cycl_utilities.expression_subst( obj, $kw58$OBJECT, sent, UNPROVIDED, UNPROVIDED ), substituted );
        cdolist_list_var = cdolist_list_var.rest();
        sent = cdolist_list_var.first();
      }
      quantified = substituted;
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return quantified;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject arg_expected_order_from_constraints(final SubLObject constraints, final SubLObject v_term)
  {
    SubLObject cdolist_list_var;
    final SubLObject term_arg_poses = cdolist_list_var = cycl_utilities.arg_positions_bfs( v_term, constraints, UNPROVIDED );
    SubLObject term_arg_pos = NIL;
    term_arg_pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject constraint = cycl_utilities.formula_arg_position( constraints, conses_high.butlast( term_arg_pos, UNPROVIDED ), UNPROVIDED );
      final SubLObject constraint_order = term_order_integer( cycl_utilities.formula_arg2( constraint, UNPROVIDED ) );
      if( constraint_order.isKeyword() )
      {
        return constraint_order;
      }
      if( cycl_utilities.formula_arg0( constraint ).eql( $const67$genls ) )
      {
        return constraint_order;
      }
      if( cycl_utilities.formula_arg0( constraint ).eql( $const68$isa ) )
      {
        return constraint_order.isNumber() ? Numbers.subtract( constraint_order, ONE_INTEGER ) : constraint_order;
      }
      cdolist_list_var = cdolist_list_var.rest();
      term_arg_pos = cdolist_list_var.first();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject get_simple_inference_semtrans_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $get_simple_inference_semtrans_lexicon$.getDynamicValue( thread ) == $kw69$UNINITIALIZED )
    {
      final SubLObject init_value = make_simple_inference_semtrans_lexicon();
      if( init_value == $kw69$UNINITIALIZED )
      {
        Errors.error( $str70$Unable_to_initialize__A__, $get_simple_inference_semtrans_lexicon$.getDynamicValue( thread ) );
      }
      $get_simple_inference_semtrans_lexicon$.setDynamicValue( init_value, thread );
    }
    return $get_simple_inference_semtrans_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
  public static SubLObject make_simple_inference_semtrans_lexicon()
  {
    final SubLObject lex = semtrans_lexicon.new_semtrans_lexicon();
    methods.funcall_instance_method_with_0_args( lex, $sym71$IGNORE_CACHE );
    return lex;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 15400L)
  public static SubLObject simple_boolean_query_test(final SubLObject pred, final SubLObject args, SubLObject time, SubLObject mt)
  {
    if( time == UNPROVIDED )
    {
      time = ONE_INTEGER;
    }
    if( mt == UNPROVIDED )
    {
      mt = get_simple_query_default_mt();
    }
    return simple_boolean_query_external_id( kb_utilities.compact_hl_external_id_string( pred ), Mapping.mapcar( $sym72$COMPACT_HL_EXTERNAL_ID_STRING, args ), time, kb_utilities.compact_hl_external_id_string( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 15400L)
  public static SubLObject simple_boolean_query_nl_test(final SubLObject expected, final SubLObject actual)
  {
    return cycl_utilities.expression_find( actual, expected, EQUAL, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_open_cyc_simple_inference_api_file()
  {
    SubLFiles.declareFunction( me, "get_simple_query_default_mt", "GET-SIMPLE-QUERY-DEFAULT-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "get_simple_query_default_nl_mt", "GET-SIMPLE-QUERY-DEFAULT-NL-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "simple_boolean_query_external_id", "SIMPLE-BOOLEAN-QUERY-EXTERNAL-ID", 2, 2, false );
    SubLFiles.declareFunction( me, "simple_boolean_query_cycl", "SIMPLE-BOOLEAN-QUERY-CYCL", 2, 2, false );
    SubLFiles.declareFunction( me, "simple_boolean_query_nl", "SIMPLE-BOOLEAN-QUERY-NL", 2, 3, false );
    SubLFiles.declareFunction( me, "clear_nl_query_denots_of_string", "CLEAR-NL-QUERY-DENOTS-OF-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_nl_query_denots_of_string", "REMOVE-NL-QUERY-DENOTS-OF-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "nl_query_denots_of_string_internal", "NL-QUERY-DENOTS-OF-STRING-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_query_denots_of_string", "NL-QUERY-DENOTS-OF-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "add_quantifiers_if_needed", "ADD-QUANTIFIERS-IF-NEEDED", 2, 0, false );
    SubLFiles.declareFunction( me, "term_order_integer", "TERM-ORDER-INTEGER", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_first_order_collectionP", "CLEAR-FIRST-ORDER-COLLECTION?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_first_order_collectionP", "REMOVE-FIRST-ORDER-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "first_order_collectionP_internal", "FIRST-ORDER-COLLECTION?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "first_order_collectionP", "FIRST-ORDER-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_variable_order_collectionP", "CLEAR-VARIABLE-ORDER-COLLECTION?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_variable_order_collectionP", "REMOVE-VARIABLE-ORDER-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "variable_order_collectionP_internal", "VARIABLE-ORDER-COLLECTION?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "variable_order_collectionP", "VARIABLE-ORDER-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "pred_arg_expected_order", "PRED-ARG-EXPECTED-ORDER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_semtrans_sentences", "GET-SEMTRANS-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "add_quantifiers_to_semtrans_if_needed", "ADD-QUANTIFIERS-TO-SEMTRANS-IF-NEEDED", 3, 1, false );
    SubLFiles.declareFunction( me, "arg_expected_order_from_constraints", "ARG-EXPECTED-ORDER-FROM-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_simple_inference_semtrans_lexicon", "GET-SIMPLE-INFERENCE-SEMTRANS-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "make_simple_inference_semtrans_lexicon", "MAKE-SIMPLE-INFERENCE-SEMTRANS-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "simple_boolean_query_test", "SIMPLE-BOOLEAN-QUERY-TEST", 2, 2, false );
    SubLFiles.declareFunction( me, "simple_boolean_query_nl_test", "SIMPLE-BOOLEAN-QUERY-NL-TEST", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_open_cyc_simple_inference_api_file()
  {
    $simple_query_default_mt$ = SubLFiles.defparameter( "*SIMPLE-QUERY-DEFAULT-MT*", $list0 );
    $simple_query_default_nl_mt$ = SubLFiles.defparameter( "*SIMPLE-QUERY-DEFAULT-NL-MT*", $const1$RelationParaphraseMt );
    $simple_boolean_default_time$ = SubLFiles.defparameter( "*SIMPLE-BOOLEAN-DEFAULT-TIME*", ONE_INTEGER );
    $simple_boolean_nl_default_time$ = SubLFiles.defparameter( "*SIMPLE-BOOLEAN-NL-DEFAULT-TIME*", TWENTY_INTEGER );
    $nl_query_denots_of_string_caching_state$ = SubLFiles.deflexical( "*NL-QUERY-DENOTS-OF-STRING-CACHING-STATE*", NIL );
    $first_order_collectionP_caching_state$ = SubLFiles.deflexical( "*FIRST-ORDER-COLLECTION?-CACHING-STATE*", NIL );
    $variable_order_collectionP_caching_state$ = SubLFiles.deflexical( "*VARIABLE-ORDER-COLLECTION?-CACHING-STATE*", NIL );
    $get_simple_inference_semtrans_lexicon$ = SubLFiles.defparameter( "*GET-SIMPLE-INFERENCE-SEMTRANS-LEXICON*", $kw69$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_open_cyc_simple_inference_api_file()
  {
    access_macros.register_external_symbol( $sym2$SIMPLE_BOOLEAN_QUERY_EXTERNAL_ID );
    access_macros.register_external_symbol( $sym4$SIMPLE_BOOLEAN_QUERY_CYCL );
    access_macros.register_external_symbol( $sym18$SIMPLE_BOOLEAN_QUERY_NL );
    memoization_state.note_globally_cached_function( $sym21$NL_QUERY_DENOTS_OF_STRING );
    memoization_state.note_globally_cached_function( $sym41$FIRST_ORDER_COLLECTION_ );
    memoization_state.note_globally_cached_function( $sym44$VARIABLE_ORDER_COLLECTION_ );
    generic_testing.define_test_case_table_int( $sym73$SIMPLE_BOOLEAN_QUERY_TEST, ConsesLow.list( new SubLObject[] { $kw74$TEST, EQUALP, $kw75$OWNER, NIL, $kw76$CLASSES, NIL, $kw77$KB, $kw78$FULL, $kw79$WORKING_, T
    } ), $list80 );
    generic_testing.define_test_case_table_int( $sym18$SIMPLE_BOOLEAN_QUERY_NL, ConsesLow.list( new SubLObject[] { $kw74$TEST, $sym81$SIMPLE_BOOLEAN_QUERY_NL_TEST, $kw75$OWNER, NIL, $kw76$CLASSES, NIL, $kw77$KB,
      $kw78$FULL, $kw79$WORKING_, NIL
    } ), $list82 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_open_cyc_simple_inference_api_file();
  }

  @Override
  public void initializeVariables()
  {
    init_open_cyc_simple_inference_api_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_open_cyc_simple_inference_api_file();
  }
  static
  {
    me = new open_cyc_simple_inference_api();
    $simple_query_default_mt$ = null;
    $simple_query_default_nl_mt$ = null;
    $simple_boolean_default_time$ = null;
    $simple_boolean_nl_default_time$ = null;
    $nl_query_denots_of_string_caching_state$ = null;
    $first_order_collectionP_caching_state$ = null;
    $variable_order_collectionP_caching_state$ = null;
    $get_simple_inference_semtrans_lexicon$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Now" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) ), constant_handles.reader_make_constant_shell( makeString(
            "AssistedReaderSourceSpindleCollectorMt" ) ), constant_handles.reader_make_constant_shell( makeString( "AllGeneralEnglishValidatedLexicalMicrotheoryPSC" ) ) ) );
    $const1$RelationParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "RelationParaphraseMt" ) );
    $sym2$SIMPLE_BOOLEAN_QUERY_EXTERNAL_ID = makeSymbol( "SIMPLE-BOOLEAN-QUERY-EXTERNAL-ID" );
    $sym3$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol( "FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING" );
    $sym4$SIMPLE_BOOLEAN_QUERY_CYCL = makeSymbol( "SIMPLE-BOOLEAN-QUERY-CYCL" );
    $kw5$ERROR = makeKeyword( "ERROR" );
    $str6$The_sentence_contains_an_open_var = makeString( "The sentence contains an open variable." );
    $str7$The_sentence_ = makeString( "The sentence " );
    $str8$_is_not_a_valid_CycL_sentence_ = makeString( " is not a valid CycL sentence." );
    $kw9$FALSE = makeKeyword( "FALSE" );
    $str10$_is_not_semantically_well_formed = makeString( " is not semantically well-formed" );
    $kw11$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw12$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $list13 = ConsesLow.list( makeKeyword( "BROWSABLE?" ), T );
    $str14$Timed_out = makeString( "Timed out" );
    $kw15$TRUE = makeKeyword( "TRUE" );
    $const16$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $kw17$UNKNOWN = makeKeyword( "UNKNOWN" );
    $sym18$SIMPLE_BOOLEAN_QUERY_NL = makeSymbol( "SIMPLE-BOOLEAN-QUERY-NL" );
    $const19$is_Underspecified = constant_handles.reader_make_constant_shell( makeString( "is-Underspecified" ) );
    $sym20$PREDICATE_P = makeSymbol( "PREDICATE-P" );
    $sym21$NL_QUERY_DENOTS_OF_STRING = makeSymbol( "NL-QUERY-DENOTS-OF-STRING" );
    $list22 = ConsesLow.list( makeSymbol( "RESULT" ), makeSymbol( "ERROR-MSG" ) );
    $kw23$WFF = makeKeyword( "WFF" );
    $str24$Timed_out_before_completion = makeString( "Timed out before completion" );
    $sym25$SECOND = makeSymbol( "SECOND" );
    $const26$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const27$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) );
    $sym28$BAD_FOR_TAGGING_ = makeSymbol( "BAD-FOR-TAGGING?" );
    $kw29$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym30$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str31$_cyc_projects_doc_annotation_comp = makeString( "/cyc/projects/doc-annotation/compounds.txt" );
    $kw32$APPEND = makeKeyword( "APPEND" );
    $str33$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str34$_S_A_S_A_S__ = makeString( "~S~A~S~A~S~%" );
    $sym35$_NL_QUERY_DENOTS_OF_STRING_CACHING_STATE_ = makeSymbol( "*NL-QUERY-DENOTS-OF-STRING-CACHING-STATE*" );
    $int36$128000 = makeInteger( 128000 );
    $const37$relationExistsInstance = constant_handles.reader_make_constant_shell( makeString( "relationExistsInstance" ) );
    $const38$relationInstanceExists = constant_handles.reader_make_constant_shell( makeString( "relationInstanceExists" ) );
    $const39$relationExistsExists = constant_handles.reader_make_constant_shell( makeString( "relationExistsExists" ) );
    $kw40$VARIABLE = makeKeyword( "VARIABLE" );
    $sym41$FIRST_ORDER_COLLECTION_ = makeSymbol( "FIRST-ORDER-COLLECTION?" );
    $const42$FirstOrderCollection = constant_handles.reader_make_constant_shell( makeString( "FirstOrderCollection" ) );
    $sym43$_FIRST_ORDER_COLLECTION__CACHING_STATE_ = makeSymbol( "*FIRST-ORDER-COLLECTION?-CACHING-STATE*" );
    $sym44$VARIABLE_ORDER_COLLECTION_ = makeSymbol( "VARIABLE-ORDER-COLLECTION?" );
    $const45$VariedOrderCollection = constant_handles.reader_make_constant_shell( makeString( "VariedOrderCollection" ) );
    $sym46$_VARIABLE_ORDER_COLLECTION__CACHING_STATE_ = makeSymbol( "*VARIABLE-ORDER-COLLECTION?-CACHING-STATE*" );
    $sym47$GET = makeSymbol( "GET" );
    $kw48$SEMTRANS = makeKeyword( "SEMTRANS" );
    $kw49$CYC_POS = makeKeyword( "CYC-POS" );
    $kw50$FRAME = makeKeyword( "FRAME" );
    $const51$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const52$TransitiveNPFrame = constant_handles.reader_make_constant_shell( makeString( "TransitiveNPFrame" ) );
    $kw53$ACTION = makeKeyword( "ACTION" );
    $const54$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym55$_EVENT = makeSymbol( "?EVENT" );
    $sym56$KEYWORDP = makeSymbol( "KEYWORDP" );
    $kw57$SUBJECT = makeKeyword( "SUBJECT" );
    $kw58$OBJECT = makeKeyword( "OBJECT" );
    $sym59$_SUBJ = makeSymbol( "?SUBJ" );
    $const60$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list61 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?SUBJ" ), makeKeyword( "SUBJECT" ) );
    $sym62$_FIRST_ORDER_SUBJ = makeSymbol( "?FIRST-ORDER-SUBJ" );
    $list63 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?FIRST-ORDER-SUBJ" ), makeKeyword( "SUBJECT" ) );
    $list64 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?SUBJ" ), makeSymbol( "?FIRST-ORDER-SUBJ" ) );
    $sym65$_OBJ = makeSymbol( "?OBJ" );
    $list66 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?OBJ" ), makeKeyword( "OBJECT" ) );
    $const67$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const68$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw69$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str70$Unable_to_initialize__A__ = makeString( "Unable to initialize ~A~%" );
    $sym71$IGNORE_CACHE = makeSymbol( "IGNORE-CACHE" );
    $sym72$COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol( "COMPACT-HL-EXTERNAL-ID-STRING" );
    $sym73$SIMPLE_BOOLEAN_QUERY_TEST = makeSymbol( "SIMPLE-BOOLEAN-QUERY-TEST" );
    $kw74$TEST = makeKeyword( "TEST" );
    $kw75$OWNER = makeKeyword( "OWNER" );
    $kw76$CLASSES = makeKeyword( "CLASSES" );
    $kw77$KB = makeKeyword( "KB" );
    $kw78$FULL = makeKeyword( "FULL" );
    $kw79$WORKING_ = makeKeyword( "WORKING?" );
    $list80 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "EnglishMt" ) ), constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ) ) ), ConsesLow.list( makeKeyword( "TRUE" ), NIL ) ), ConsesLow.list( ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ), constant_handles.reader_make_constant_shell( makeString(
                "Microtheory" ) ) ), makeInteger( 1000 ) ), ConsesLow.list( makeKeyword( "TRUE" ), NIL ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow
                    .list( constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ) ) ), ConsesLow.list( makeKeyword( "FALSE" ),
                        makeString( "(#$isa #$Microtheory #$EnglishMt) is not semantically well-formed" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "likesAsFriend" ) ),
                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ) ) ), ConsesLow.list(
                                makeKeyword( "FALSE" ), makeString( "(#$likesAsFriend #$Microtheory #$EnglishMt) is not semantically well-formed" ) ) ), ConsesLow.list( ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ), makeSymbol( "?X" ) ) ), ConsesLow.list(
                                        makeKeyword( "ERROR" ), makeString( "The sentence contains an open variable." ) ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                            "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RichardNixon" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                "Plumber" ) ) ) ), ConsesLow.list( makeKeyword( "FALSE" ), NIL ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BradPitt" ) ), constant_handles.reader_make_constant_shell( makeString( "Plumber" ) ) ) ),
                                                    ConsesLow.list( makeKeyword( "UNKNOWN" ), NIL ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list(
                                                        constant_handles.reader_make_constant_shell( makeString( "BarackObama" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                            "UnitedStatesPresident" ) ) ) ), ConsesLow.list( makeKeyword( "TRUE" ), NIL ) ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                makeString( "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "RichardNixon" ) ), constant_handles
                                                                    .reader_make_constant_shell( makeString( "UnitedStatesPresident" ) ) ), ONE_INTEGER, constant_handles.reader_make_constant_shell( makeString(
                                                                        "BaseKB" ) ) ), ConsesLow.list( makeKeyword( "FALSE" ), NIL ) )
    } );
    $sym81$SIMPLE_BOOLEAN_QUERY_NL_TEST = makeSymbol( "SIMPLE-BOOLEAN-QUERY-NL-TEST" );
    $list82 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "is" ), ConsesLow.list( makeString( "Tony Brusseau" ), makeString( "person" ) ) ), makeKeyword( "TRUE" ) ), ConsesLow.list( ConsesLow.list(
        makeString( "employs" ), ConsesLow.list( makeString( "Cycorp" ), makeString( "computer scientist" ) ), makeInteger( 1000 ) ), makeKeyword( "TRUE" ) ), ConsesLow.list( ConsesLow.list( makeString( "is" ), ConsesLow
            .list( makeString( "Richard Nixon" ), makeString( "plumber" ) ) ), makeKeyword( "FALSE" ) ), ConsesLow.list( ConsesLow.list( makeString( "is" ), ConsesLow.list( makeString( "Brad Pitt" ), makeString(
                "plumber" ) ) ), makeKeyword( "WFF" ) ), ConsesLow.list( ConsesLow.list( makeString( "is" ), ConsesLow.list( makeString( "Barack Obama" ), makeString( "US President" ) ) ), makeKeyword( "TRUE" ) ),
        ConsesLow.list( ConsesLow.list( makeString( "hates" ), ConsesLow.list( makeString( "Richard Nixon" ), makeString( "World War II" ) ), ONE_INTEGER, constant_handles.reader_make_constant_shell( makeString(
            "BaseKB" ) ) ), makeKeyword( "FALSE" ) ), ConsesLow.list( ConsesLow.list( makeString( "hates" ), ConsesLow.list( makeString( "Richard Nixon" ), makeString( "World War II" ) ), ONE_INTEGER, constant_handles
                .reader_make_constant_shell( makeString( "InferencePSC" ) ) ), makeKeyword( "WFF" ) ) );
  }
}
/*
 *
 * Total time: 310 ms
 *
 */