package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class somewhere_cache
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.somewhere_cache";
  public static final String myFingerPrint = "815f59def48f7ce2189ccc304dc7fc35e0ca26168d6f5b51cb255b31bed2674b";
  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 1597L)
  public static SubLSymbol $use_somewhere_cacheP$;
  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 1765L)
  private static SubLSymbol $somewhere_cached_preds_table$;
  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 9863L)
  private static SubLSymbol $some_pred_assertion_somewhere_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 10248L)
  private static SubLSymbol $somewhere_cached_pred_argnum_dict$;
  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 14724L)
  public static SubLSymbol $somewhere_cache_gaf_after_adding_info$;
  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 17502L)
  private static SubLSymbol $inter_arg_result_isa_somewhere_cache$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLObject $list29;
  private static final SubLSymbol $sym30$_SOME_PRED_ASSERTION_SOMEWHERE_CACHE_;
  private static final SubLSymbol $kw31$UNINITIALIZED;
  private static final SubLSymbol $sym32$_SOMEWHERE_CACHED_PRED_ARGNUM_DICT_;
  private static final SubLSymbol $sym33$SOMEWHERE_CACHED_PRED_P;
  private static final SubLSymbol $sym34$VALID_SOMEWHERE_CACHE_ITEM_;
  private static final SubLSymbol $kw35$YES;
  private static final SubLSymbol $kw36$NO;
  private static final SubLSymbol $kw37$MAYBE;
  private static final SubLList $list38;
  private static final SubLString $str39$Initializing_all_somewhere_caches;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$GAF_ASSERTION_;
  private static final SubLSymbol $sym42$VALID_FORT_;
  private static final SubLSymbol $sym43$FORT_P;
  private static final SubLSymbol $sym44$_INTER_ARG_RESULT_ISA_SOMEWHERE_CACHE_;
  private static final SubLObject $const45$interArgResultIsa;
  private static final SubLString $str46$somewhere_cache_argnum_mismatch_f;
  private static final SubLSymbol $sym47$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const48$EverythingPSC;
  private static final SubLSymbol $kw49$GAF;
  private static final SubLSymbol $kw50$TRUE;

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 10447L)
  public static SubLObject some_pred_assertion_somewhereP(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP)
  {
    if( initialize_if_uninitializedP == UNPROVIDED )
    {
      initialize_if_uninitializedP = T;
    }
    assert NIL != somewhere_cached_pred_p( pred ) : pred;
    assert NIL != valid_somewhere_cache_itemP( v_term ) : v_term;
    final SubLObject pcase_var = some_pred_assertion_somewhereP_internal( pred, v_term, argnum, initialize_if_uninitializedP );
    if( pcase_var.eql( $kw35$YES ) )
    {
      return T;
    }
    if( pcase_var.eql( $kw36$NO ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw37$MAYBE ) )
    {
      check_somewhere_cache_argnum( pred, argnum, UNPROVIDED );
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 11992L)
  public static SubLObject maybe_some_pred_assertion_somewhereP(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP)
  {
    if( initialize_if_uninitializedP == UNPROVIDED )
    {
      initialize_if_uninitializedP = T;
    }
    return makeBoolean( NIL == somewhere_cached_pred_p( pred ) || $kw36$NO != some_pred_assertion_somewhereP_internal( pred, v_term, argnum, initialize_if_uninitializedP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 12744L)
  public static SubLObject possibly_initialize_all_somewhere_caches(SubLObject robustP)
  {
    if( robustP == UNPROVIDED )
    {
      robustP = T;
    }
    if( NIL != misc_utilities.uninitialized_p( $some_pred_assertion_somewhere_cache$.getGlobalValue() ) )
    {
      return initialize_all_somewhere_caches();
    }
    if( NIL != robustP )
    {
      SubLObject cdolist_list_var = $somewhere_cached_preds_table$.getGlobalValue();
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject pred = NIL;
        SubLObject argnum = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
        pred = current.first();
        current = ( argnum = current.rest() );
        if( NIL == forts.invalid_fortP( pred ) )
        {
          lookup_somewhere_set_for_pred( pred, T );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 13334L)
  public static SubLObject initialize_all_somewhere_caches()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    initialize_somewhere_cached_pred_argnum_dict();
    clear_all_somewhere_caches();
    final SubLObject total_pred_count = Sequences.length( $somewhere_cached_preds_table$.getGlobalValue() );
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( $str39$Initializing_all_somewhere_caches );
        SubLObject cdolist_list_var = $somewhere_cached_preds_table$.getGlobalValue();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = cons;
          SubLObject pred = NIL;
          SubLObject argnum = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
          pred = current.first();
          current = ( argnum = current.rest() );
          if( NIL == forts.invalid_fortP( pred ) )
          {
            count = Numbers.add( count, set.set_size( initialize_somewhere_cache( pred ) ) );
          }
          utilities_macros.note_percent_progress( count, total_pred_count );
          cdolist_list_var = cdolist_list_var.rest();
          cons = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 13979L)
  public static SubLObject clear_all_somewhere_caches()
  {
    $some_pred_assertion_somewhere_cache$.setGlobalValue( dictionary.new_dictionary( Symbols.symbol_function( EQL ), Sequences.length( $somewhere_cached_preds_table$.getGlobalValue() ) ) );
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 14147L)
  public static SubLObject possibly_initialize_somewhere_cached_pred_argnum_dict()
  {
    if( NIL != misc_utilities.uninitialized_p( $somewhere_cached_pred_argnum_dict$.getGlobalValue() ) )
    {
      return initialize_somewhere_cached_pred_argnum_dict();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 14355L)
  public static SubLObject initialize_somewhere_cached_pred_argnum_dict()
  {
    $somewhere_cached_pred_argnum_dict$.setGlobalValue( dictionary_utilities.new_dictionary_from_alist( $somewhere_cached_preds_table$.getGlobalValue(), Symbols.symbol_function( EQL ) ) );
    return dictionary.dictionary_length( $somewhere_cached_pred_argnum_dict$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 14612L)
  public static SubLObject reclassify_somewhere_cached_preds()
  {
    return initialize_somewhere_cached_pred_argnum_dict();
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 14910L)
  public static SubLObject recache_some_pred_assertion_somewhere(final SubLObject argument, final SubLObject assertion)
  {
    assert NIL != assertions_high.gaf_assertionP( assertion ) : assertion;
    final SubLObject pred = assertions_high.gaf_predicate( assertion );
    final SubLObject argnum = some_pred_assertion_somewhere_argnum( pred );
    final SubLObject arg = assertions_high.gaf_arg( assertion, argnum );
    assert NIL != somewhere_cached_pred_p( pred ) : pred;
    if( NIL != valid_somewhere_cache_itemP( arg ) )
    {
      recache_some_pred_assertion_somewhere_int( pred, arg );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 15580L)
  public static SubLObject somewhere_cached_preds()
  {
    possibly_initialize_somewhere_cached_pred_argnum_dict();
    return dictionary.dictionary_keys( $somewhere_cached_pred_argnum_dict$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 15743L)
  public static SubLObject valid_somewhere_cached_preds()
  {
    return list_utilities.remove_if_not( $sym42$VALID_FORT_, somewhere_cached_preds(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 15854L)
  public static SubLObject somewhere_cached_pred_p(final SubLObject v_object)
  {
    possibly_initialize_somewhere_cached_pred_argnum_dict();
    SubLObject result = dictionary_utilities.dictionary_has_keyP( $somewhere_cached_pred_argnum_dict$.getGlobalValue(), v_object );
    if( NIL == result && NIL != conses_high.assoc( v_object, $somewhere_cached_preds_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      initialize_somewhere_cached_pred_argnum_dict();
      result = T;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 16222L)
  public static SubLObject valid_somewhere_cached_pred_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.valid_fortP( v_object ) && NIL != somewhere_cached_pred_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 16353L)
  public static SubLObject some_pred_assertion_somewhere_argnum(final SubLObject pred)
  {
    possibly_initialize_somewhere_cached_pred_argnum_dict();
    SubLObject result = dictionary.dictionary_lookup_without_values( $somewhere_cached_pred_argnum_dict$.getGlobalValue(), pred, UNPROVIDED );
    if( NIL == result && NIL != conses_high.assoc( pred, $somewhere_cached_preds_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      initialize_somewhere_cached_pred_argnum_dict();
      result = dictionary.dictionary_lookup_without_values( $somewhere_cached_pred_argnum_dict$.getGlobalValue(), pred, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 16815L)
  public static SubLObject indexed_terms_with_some_pred_assertion_somewhere(final SubLObject pred, SubLObject initialize_if_uninitializedP)
  {
    if( initialize_if_uninitializedP == UNPROVIDED )
    {
      initialize_if_uninitializedP = T;
    }
    assert NIL != forts.fort_p( pred ) : pred;
    final SubLObject v_set = lookup_somewhere_set_for_pred( pred, initialize_if_uninitializedP );
    return set.set_element_list( v_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 17770L)
  public static SubLObject inter_arg_result_isa_somewhere_cache(final SubLObject initialize_if_uninitializedP)
  {
    if( NIL != misc_utilities.uninitialized_p( $inter_arg_result_isa_somewhere_cache$.getGlobalValue() ) )
    {
      $inter_arg_result_isa_somewhere_cache$.setGlobalValue( lookup_somewhere_set_for_pred( $const45$interArgResultIsa, initialize_if_uninitializedP ) );
    }
    return $inter_arg_result_isa_somewhere_cache$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 18102L)
  public static SubLObject inter_arg_result_isa_somewhereP(final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP)
  {
    if( initialize_if_uninitializedP == UNPROVIDED )
    {
      initialize_if_uninitializedP = T;
    }
    check_somewhere_cache_argnum( $const45$interArgResultIsa, argnum, ONE_INTEGER );
    final SubLObject v_set = inter_arg_result_isa_somewhere_cache( initialize_if_uninitializedP );
    return set.set_memberP( v_term, v_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 18388L)
  public static SubLObject use_somewhere_cacheP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $use_somewhere_cacheP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 18463L)
  public static SubLObject some_pred_assertion_somewhereP_internal(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, final SubLObject initialize_if_uninitializedP)
  {
    final SubLObject cached_argnum = some_pred_assertion_somewhere_argnum( pred );
    SubLObject ans = $kw37$MAYBE;
    if( NIL != use_somewhere_cacheP() && argnum.eql( cached_argnum ) )
    {
      final SubLObject v_set = lookup_somewhere_set_for_pred( pred, initialize_if_uninitializedP );
      ans = ( NIL != set.set_memberP( v_term, v_set ) ) ? $kw35$YES : $kw36$NO;
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 18979L)
  public static SubLObject check_somewhere_cache_argnum(final SubLObject pred, final SubLObject argnum, SubLObject cached_argnum)
  {
    if( cached_argnum == UNPROVIDED )
    {
      cached_argnum = some_pred_assertion_somewhere_argnum( pred );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !argnum.eql( cached_argnum ) )
    {
      Errors.error( $str46$somewhere_cache_argnum_mismatch_f, pred, argnum, cached_argnum );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 19236L)
  public static SubLObject lookup_somewhere_set_for_pred(final SubLObject pred, final SubLObject initialize_if_uninitializedP)
  {
    SubLObject v_set = dictionary.dictionary_lookup_without_values( $some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, NIL );
    if( NIL != initialize_if_uninitializedP && NIL == v_set )
    {
      v_set = initialize_somewhere_cache( pred );
    }
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 19640L)
  public static SubLObject initialize_somewhere_cache(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject estimated_size = kb_indexing.num_predicate_extent_index( pred, UNPROVIDED );
    final SubLObject v_set = set.new_set( Symbols.symbol_function( EQL ), estimated_size );
    if( NIL != control_vars.$bootstrapping_kbP$.getDynamicValue( thread ) || NIL != forts.valid_fortP( pred ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym47$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const48$EverythingPSC, thread );
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw49$GAF, $kw50$TRUE, NIL );
                  SubLObject done_var_$4 = NIL;
                  final SubLObject token_var_$5 = NIL;
                  while ( NIL == done_var_$4)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                    final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( gaf ) );
                    if( NIL != valid_$6 )
                    {
                      cache_some_pred_assertion_somewhere( v_set, gaf );
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
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$3, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$2, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      dictionary.dictionary_enter( $some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, v_set );
    }
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 20095L)
  public static SubLObject recache_some_pred_assertion_somewhere_int(final SubLObject pred, final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_set = lookup_somewhere_set_for_pred( pred, T );
    set.set_remove( v_term, v_set );
    SubLObject done = NIL;
    final SubLObject argnum = some_pred_assertion_somewhere_argnum( pred );
    final SubLObject _prev_bind_0 = $use_somewhere_cacheP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      $use_somewhere_cacheP$.bind( NIL, thread );
      mt_relevance_macros.$relevant_mt_function$.bind( $sym47$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const48$EverythingPSC, thread );
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, argnum, pred ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, argnum, pred );
        SubLObject done_var = done;
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw49$GAF, $kw50$TRUE, NIL );
              SubLObject done_var_$8 = done;
              final SubLObject token_var_$9 = NIL;
              while ( NIL == done_var_$8)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$9 );
                final SubLObject valid_$10 = makeBoolean( !token_var_$9.eql( gaf ) );
                if( NIL != valid_$10 )
                {
                  done = cache_some_pred_assertion_somewhere( v_set, gaf );
                }
                done_var_$8 = makeBoolean( NIL == valid_$10 || NIL != done );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != done );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      $use_somewhere_cacheP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != done )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 20617L)
  public static SubLObject cache_some_pred_assertion_somewhere(final SubLObject v_set, final SubLObject gaf)
  {
    if( NIL != kb_accessors.assertion_still_thereP( gaf, $kw50$TRUE ) )
    {
      final SubLObject mt = assertions_high.assertion_mt( gaf );
      if( NIL != hlmt.hlmt_p( mt ) )
      {
        final SubLObject pred = assertions_high.gaf_predicate( gaf );
        final SubLObject argnum = some_pred_assertion_somewhere_argnum( pred );
        final SubLObject arg = assertions_high.gaf_arg( gaf, argnum );
        if( NIL != valid_somewhere_cache_itemP( arg ) )
        {
          set.set_add( arg, v_set );
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 21228L)
  public static SubLObject valid_somewhere_cache_itemP(final SubLObject v_object)
  {
    return cycl_utilities.reified_term_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 21474L)
  public static SubLObject somewhere_cache_unbuiltP()
  {
    return makeBoolean( NIL == dictionary.dictionary_p( $some_pred_assertion_somewhere_cache$.getGlobalValue() ) || NIL != dictionary.dictionary_empty_p( $some_pred_assertion_somewhere_cache$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 21687L)
  public static SubLObject rebuild_somewhere_cache()
  {
    return initialize_all_somewhere_caches();
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 21776L)
  public static SubLObject dump_somewhere_cache_to_stream(final SubLObject stream)
  {
    cfasl.cfasl_output( $some_pred_assertion_somewhere_cache$.getGlobalValue(), stream );
    cfasl.cfasl_output( NIL, stream );
    cfasl.cfasl_output( NIL, stream );
    cfasl.cfasl_output( NIL, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 22081L)
  public static SubLObject load_somewhere_cache_from_stream(final SubLObject stream)
  {
    SubLObject dummy = NIL;
    $some_pred_assertion_somewhere_cache$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    dummy = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    dummy = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    dummy = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  public static SubLObject declare_somewhere_cache_file()
  {
    SubLFiles.declareFunction( me, "some_pred_assertion_somewhereP", "SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false );
    SubLFiles.declareFunction( me, "maybe_some_pred_assertion_somewhereP", "MAYBE-SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false );
    SubLFiles.declareFunction( me, "possibly_initialize_all_somewhere_caches", "POSSIBLY-INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 1, false );
    SubLFiles.declareFunction( me, "initialize_all_somewhere_caches", "INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_all_somewhere_caches", "CLEAR-ALL-SOMEWHERE-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_initialize_somewhere_cached_pred_argnum_dict", "POSSIBLY-INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_somewhere_cached_pred_argnum_dict", "INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT", 0, 0, false );
    SubLFiles.declareFunction( me, "reclassify_somewhere_cached_preds", "RECLASSIFY-SOMEWHERE-CACHED-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "recache_some_pred_assertion_somewhere", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false );
    SubLFiles.declareFunction( me, "somewhere_cached_preds", "SOMEWHERE-CACHED-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "valid_somewhere_cached_preds", "VALID-SOMEWHERE-CACHED-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "somewhere_cached_pred_p", "SOMEWHERE-CACHED-PRED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_somewhere_cached_pred_p", "VALID-SOMEWHERE-CACHED-PRED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "some_pred_assertion_somewhere_argnum", "SOME-PRED-ASSERTION-SOMEWHERE-ARGNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "indexed_terms_with_some_pred_assertion_somewhere", "INDEXED-TERMS-WITH-SOME-PRED-ASSERTION-SOMEWHERE", 1, 1, false );
    SubLFiles.declareFunction( me, "inter_arg_result_isa_somewhere_cache", "INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "inter_arg_result_isa_somewhereP", "INTER-ARG-RESULT-ISA-SOMEWHERE?", 2, 1, false );
    SubLFiles.declareFunction( me, "use_somewhere_cacheP", "USE-SOMEWHERE-CACHE?", 0, 0, false );
    SubLFiles.declareFunction( me, "some_pred_assertion_somewhereP_internal", "SOME-PRED-ASSERTION-SOMEWHERE?-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "check_somewhere_cache_argnum", "CHECK-SOMEWHERE-CACHE-ARGNUM", 2, 1, false );
    SubLFiles.declareFunction( me, "lookup_somewhere_set_for_pred", "LOOKUP-SOMEWHERE-SET-FOR-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "initialize_somewhere_cache", "INITIALIZE-SOMEWHERE-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "recache_some_pred_assertion_somewhere_int", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_some_pred_assertion_somewhere", "CACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_somewhere_cache_itemP", "VALID-SOMEWHERE-CACHE-ITEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "somewhere_cache_unbuiltP", "SOMEWHERE-CACHE-UNBUILT?", 0, 0, false );
    SubLFiles.declareFunction( me, "rebuild_somewhere_cache", "REBUILD-SOMEWHERE-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "dump_somewhere_cache_to_stream", "DUMP-SOMEWHERE-CACHE-TO-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "load_somewhere_cache_from_stream", "LOAD-SOMEWHERE-CACHE-FROM-STREAM", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_somewhere_cache_file()
  {
    $use_somewhere_cacheP$ = SubLFiles.defparameter( "*USE-SOMEWHERE-CACHE?*", T );
    $somewhere_cached_preds_table$ = SubLFiles.deflexical( "*SOMEWHERE-CACHED-PREDS-TABLE*", ConsesLow.listS( $list0, new SubLObject[] { $list1, $list2, $list3, $list4, $list5, $list6, $list7, $list8, $list9, $list10,
      $list11, $list12, $list13, $list14, $list15, $list16, $list17, $list18, $list19, $list20, $list21, $list22, $list23, $list24, $list25, $list26, $list27, $list28, reader.bq_cons(
          kb_control_vars.$backchain_forbidden_unless_arg_chosen$.getGlobalValue(), ONE_INTEGER ), $list29
    } ) );
    $some_pred_assertion_somewhere_cache$ = SubLFiles.deflexical( "*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*", ( maybeDefault( $sym30$_SOME_PRED_ASSERTION_SOMEWHERE_CACHE_, $some_pred_assertion_somewhere_cache$,
        $kw31$UNINITIALIZED ) ) );
    $somewhere_cached_pred_argnum_dict$ = SubLFiles.deflexical( "*SOMEWHERE-CACHED-PRED-ARGNUM-DICT*", ( maybeDefault( $sym32$_SOMEWHERE_CACHED_PRED_ARGNUM_DICT_, $somewhere_cached_pred_argnum_dict$,
        $kw31$UNINITIALIZED ) ) );
    $somewhere_cache_gaf_after_adding_info$ = SubLFiles.deflexical( "*SOMEWHERE-CACHE-GAF-AFTER-ADDING-INFO*", $list40 );
    $inter_arg_result_isa_somewhere_cache$ = SubLFiles.deflexical( "*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*", maybeDefault( $sym44$_INTER_ARG_RESULT_ISA_SOMEWHERE_CACHE_, $inter_arg_result_isa_somewhere_cache$,
        () -> ( misc_utilities.uninitialized() ) ) );
    return NIL;
  }

  public static SubLObject setup_somewhere_cache_file()
  {
    subl_macro_promotions.declare_defglobal( $sym30$_SOME_PRED_ASSERTION_SOMEWHERE_CACHE_ );
    subl_macro_promotions.declare_defglobal( $sym32$_SOMEWHERE_CACHED_PRED_ARGNUM_DICT_ );
    subl_macro_promotions.declare_defglobal( $sym44$_INTER_ARG_RESULT_ISA_SOMEWHERE_CACHE_ );
    return NIL;
  }

  private static SubLObject _constant_29_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "backchainRequired" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
        makeString( "canonicalizerDirectiveForArg" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "canonicalizerDirectiveForAllArgs" ) ), ONE_INTEGER ), ConsesLow.cons(
            constant_handles.reader_make_constant_shell( makeString( "canonicalizerDirectiveForArgAndRest" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "evaluateAtEL" ) ),
                ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "evaluateImmediately" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                    "genlPreds" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "typedGenlPreds" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                        .reader_make_constant_shell( makeString( "genlInverse" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "functionCorrespondingPredicate" ) ),
                            ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "functionCorrespondingPredicate-Canonical" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles
                                .reader_make_constant_shell( makeString( "highlyRelevantTerm" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgResultIsa" ) ),
                                    ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgResultGenl" ) ), THREE_INTEGER ), ConsesLow.cons( constant_handles
                                        .reader_make_constant_shell( makeString( "interArgGenl1-2" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgGenl2-1" ) ),
                                            ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgGenl2-4" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                                .reader_make_constant_shell( makeString( "interArgNotGenl1-2" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                    "interArgIsaGenl1-2" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgIsaGenl2-1" ) ), ONE_INTEGER ), ConsesLow
                                                        .cons( constant_handles.reader_make_constant_shell( makeString( "interArgIsaGenl2-3" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                                            .reader_make_constant_shell( makeString( "interArgIsaGenl3-2" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                                "interArgGenlIsa2-1" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgDifferent" ) ), ONE_INTEGER ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgReln" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "irrelevantTerm" ) ),
          ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "modalInArg" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
              "notAssertible" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles
                  .reader_make_constant_shell( makeString( "relationAllInstance" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "relationInstanceAll" ) ), ONE_INTEGER ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "scopingArg" ) ), ONE_INTEGER ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "skolemizeForward" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "typeLevelVersionInArg" ) ),
          ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "relationAllExistsCount" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
              "relationAllExistsMany" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "relationAllExistsMin" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles
                  .reader_make_constant_shell( makeString( "relationAllExistsUnique" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "relationAllExistsSame" ) ),
                      TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "relationAllExistsAndOnly" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                          makeString( "reflexiveOn" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "requiredActorSlots-Unique" ) ), ONE_INTEGER ), ConsesLow.cons(
                              constant_handles.reader_make_constant_shell( makeString( "collRelation" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "collRelationUnique" ) ),
                                  TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "requiredActorSlots" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                      .reader_make_constant_shell( makeString( "rolesForEventType" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "keRequirementPreds" ) ),
                                          ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "roleTypesForEventType" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                              .reader_make_constant_shell( makeString( "requiredArg1Pred" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                  "preferredSubjectRole" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "subjectRoles" ) ), ONE_INTEGER ), ConsesLow.cons(
                                                      constant_handles.reader_make_constant_shell( makeString( "preferredIndirectObjectRole" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                                          .reader_make_constant_shell( makeString( "indirectObjectRoles" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                              "preferredDirectObjectRole" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "directObjectRoles" ) ),
                                                                  ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "posForms" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                                                      .reader_make_constant_shell( makeString( "posBaseForms" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                                          "mtTimeIndex" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "genStringAssertion-Terse" ) ),
                                                                              TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "genStringAssertion-Precise" ) ), TWO_INTEGER ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "genStringAssertion" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
          "dispreferredLexification" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "predTrivialForJustificationParaphrase" ) ), ONE_INTEGER ), ConsesLow.cons(
              constant_handles.reader_make_constant_shell( makeString( "assertionTrivialForJustificationParaphrase" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                  "ruleTrivialForJustificationParaphrase" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "mtTrivialForJustificationParaphrase" ) ), ONE_INTEGER ), ConsesLow
                      .cons( constant_handles.reader_make_constant_shell( makeString( "ruleTrivialForSentenceImplicationConditions" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                          makeString( "salientTermImagePathname" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "formulaTemplateHasArgumentPositionInformation" ) ),
                              ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "except" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                  "exceptMt" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "assertiveWFFRule" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                      .reader_make_constant_shell( makeString( "forwardReificationRule" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                          "universalForwardReificationRule" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa1-2" ) ), ONE_INTEGER ), ConsesLow
                                              .cons( constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa1-3" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                                                  makeString( "interArgNotIsa1-4" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa1-5" ) ), ONE_INTEGER ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa2-1" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa2-3" ) ),
          ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa2-4" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
              "interArgNotIsa2-5" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa3-4" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                  .reader_make_constant_shell( makeString( "interArgNotIsa3-5" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "interArgNotIsa4-5" ) ), ONE_INTEGER ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "singleEntryFormatInArgs" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "wffConstraintMt" ) ),
          ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "completeExtentAsserted" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
              "completeExtentAssertedForValueInArg" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "completeExtentEnumerable" ) ), ONE_INTEGER ), ConsesLow.cons(
                  constant_handles.reader_make_constant_shell( makeString( "completeExtentEnumerableForArg" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                      "completeExtentEnumerableForValueInArg" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "completeExtentDecidable" ) ), ONE_INTEGER ), ConsesLow.cons(
                          constant_handles.reader_make_constant_shell( makeString( "completeExtentDecidableForValueInArg" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                              "transitiveViaArg" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "transitiveViaArgInverse" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                  .reader_make_constant_shell( makeString( "conservativeViaArg" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                      "conservativeViaArgInverse" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "functionalInArgs" ) ), ONE_INTEGER ), ConsesLow.cons(
                                          constant_handles.reader_make_constant_shell( makeString( "strictlyFunctionalInArgs" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                              "parsingConflateTo" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "qaConflateTo" ) ), ONE_INTEGER ), ConsesLow.cons(
                                                  constant_handles.reader_make_constant_shell( makeString( "qaConflateToCompletely" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                                                      makeString( "terseDisambiguationString" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "denotation" ) ), FOUR_INTEGER ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "headMedialString" ) ), FIVE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "compoundString" ) ),
          FOUR_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "hyphenString" ) ), FOUR_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
              "multiWordString" ) ), FOUR_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "preferredNameString" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                  .reader_make_constant_shell( makeString( "nameString" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "placeName-WithRegion" ) ), ONE_INTEGER ), ConsesLow
                      .cons( constant_handles.reader_make_constant_shell( makeString( "placeName-WithRegionAbbreviation" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                          "titleOfWork" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "movieTitleString" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                              .reader_make_constant_shell( makeString( "gospelName-Short" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "brandNameOfProductType" ) ),
                                  ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "businessName-WithTickerSymbol" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                      .reader_make_constant_shell( makeString( "organizationName-Standard" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                          "organizationName-Official" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "familyName" ) ), ONE_INTEGER ), ConsesLow.cons(
                                              constant_handles.reader_make_constant_shell( makeString( "lastName" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                  "placeName-ShortForm" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "countryName-ShortForm" ) ), ONE_INTEGER ), ConsesLow
                                                      .cons( constant_handles.reader_make_constant_shell( makeString( "placeName-Standard" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                                                          makeString( "countryName-LongForm" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "chemicalFormulaString" ) ),
                                                              ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "fullName" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                                                  .reader_make_constant_shell( makeString( "alias" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                                      "definiteDescriptions" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "acronymString" ) ),
                                                                          ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "initialismString" ) ), ONE_INTEGER ), ConsesLow.cons(
                                                                              constant_handles.reader_make_constant_shell( makeString( "initialsString" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "pseudonym" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                                                                                      makeString( "countryCodeTrigraph" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                                                          "atomicSymbol" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "codeMapping" ) ),
                                                                                              THREE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                                                                  "applicableWhenTypedOnlyWhenSpecialization" ) ), THREE_INTEGER ), ConsesLow.cons( constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "mostNotableIsa" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "mostNotableGenls" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "facetOfCollectionBasedOnBinaryPred" ) ), ONE_INTEGER ), ConsesLow
                                                                                                                  .cons( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                      "facetOfCollectionBasedOnBinaryPredInverse" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "facetOfCollectionBasedOnTypeBinaryPred" ) ),
                                                                                                                          ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                              "facetOfCollectionBasedOnTypeBinaryPredInverse" ) ), ONE_INTEGER ), ConsesLow.cons(
                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "teamSeed" ) ), TWO_INTEGER ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "denotesArgInReln" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
          "classificationSystemOf-Focally" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "genlMt-Vocabulary" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
              .reader_make_constant_shell( makeString( "marketTypeDefiningProductType" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "collectionDifference" ) ),
                  TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "characteristicActivityTypeOfPersonType-Frequently" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles
                      .reader_make_constant_shell( makeString( "medicalFindingTypeOfType" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "medicalDiagnosisTypeOfType" ) ),
                          ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "suppressFacetInstancesFromTaxonomy" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles
                              .reader_make_constant_shell( makeString( "quantifiedBinaryPredicateForPredWithMacro" ) ), THREE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                  "verbSemTransTemplate" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "evaluationTypeDirectEvalueeType" ) ), ONE_INTEGER ), ConsesLow.cons(
                                      constant_handles.reader_make_constant_shell( makeString( "allSubCollectionsAreInstancesOf" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                                          makeString( "typeDeterminesValueOfArgInReln" ) ), THREE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                              "hypothesisLevelStrategyForPredAndArgs" ) ), TWO_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                                                  "sourceFixedSemanticValueForRelationArg" ) ), THREE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "genlRules" ) ), ONE_INTEGER ),
      ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "disallowMeaningSentencesForUnboundPredicates" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
          "hypotheticalTerm" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "predNotAllowedInGeneralizedQueryForTheSetOf" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles
              .reader_make_constant_shell( makeString( "decontextualizedPredicate" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "decontextualizedCollection" ) ),
                  ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "predicateConventionMt" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                      makeString( "collectionConventionMt" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "quotedArgument" ) ), ONE_INTEGER ), ConsesLow.cons(
                          constant_handles.reader_make_constant_shell( makeString( "inverseFunctions" ) ), ONE_INTEGER ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "genlPredsWRTArgs" ) ),
                              TWO_INTEGER )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_somewhere_cache_file();
  }

  @Override
  public void initializeVariables()
  {
    init_somewhere_cache_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_somewhere_cache_file();
  }
  static
  {
    me = new somewhere_cache();
    $use_somewhere_cacheP$ = null;
    $somewhere_cached_preds_table$ = null;
    $some_pred_assertion_somewhere_cache$ = null;
    $somewhere_cached_pred_argnum_dict$ = null;
    $somewhere_cache_gaf_after_adding_info$ = null;
    $inter_arg_result_isa_somewhere_cache$ = null;
    $list0 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "argsIsa" ) ), ONE_INTEGER );
    $list1 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "argAndRestIsa" ) ), ONE_INTEGER );
    $list2 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "argAndRestGenl" ) ), ONE_INTEGER );
    $list3 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "argsQuotedIsa" ) ), ONE_INTEGER );
    $list4 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "argAndRestQuotedIsa" ) ), ONE_INTEGER );
    $list5 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg1Genl" ) ), ONE_INTEGER );
    $list6 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg2Genl" ) ), ONE_INTEGER );
    $list7 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg3Genl" ) ), ONE_INTEGER );
    $list8 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg4Genl" ) ), ONE_INTEGER );
    $list9 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg5Genl" ) ), ONE_INTEGER );
    $list10 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg6Genl" ) ), ONE_INTEGER );
    $list11 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg1NotIsa" ) ), ONE_INTEGER );
    $list12 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg2NotIsa" ) ), ONE_INTEGER );
    $list13 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg3NotIsa" ) ), ONE_INTEGER );
    $list14 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg4NotIsa" ) ), ONE_INTEGER );
    $list15 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg5NotIsa" ) ), ONE_INTEGER );
    $list16 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg6NotIsa" ) ), ONE_INTEGER );
    $list17 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg1Format" ) ), ONE_INTEGER );
    $list18 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg2Format" ) ), ONE_INTEGER );
    $list19 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg3Format" ) ), ONE_INTEGER );
    $list20 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg4Format" ) ), ONE_INTEGER );
    $list21 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg5Format" ) ), ONE_INTEGER );
    $list22 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg6Format" ) ), ONE_INTEGER );
    $list23 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg1QuotedIsa" ) ), ONE_INTEGER );
    $list24 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg2QuotedIsa" ) ), ONE_INTEGER );
    $list25 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg3QuotedIsa" ) ), ONE_INTEGER );
    $list26 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg4QuotedIsa" ) ), ONE_INTEGER );
    $list27 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg5QuotedIsa" ) ), ONE_INTEGER );
    $list28 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "arg6QuotedIsa" ) ), ONE_INTEGER );
    $list29 = _constant_29_initializer();
    $sym30$_SOME_PRED_ASSERTION_SOMEWHERE_CACHE_ = makeSymbol( "*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*" );
    $kw31$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym32$_SOMEWHERE_CACHED_PRED_ARGNUM_DICT_ = makeSymbol( "*SOMEWHERE-CACHED-PRED-ARGNUM-DICT*" );
    $sym33$SOMEWHERE_CACHED_PRED_P = makeSymbol( "SOMEWHERE-CACHED-PRED-P" );
    $sym34$VALID_SOMEWHERE_CACHE_ITEM_ = makeSymbol( "VALID-SOMEWHERE-CACHE-ITEM?" );
    $kw35$YES = makeKeyword( "YES" );
    $kw36$NO = makeKeyword( "NO" );
    $kw37$MAYBE = makeKeyword( "MAYBE" );
    $list38 = ConsesLow.cons( makeSymbol( "PRED" ), makeSymbol( "ARGNUM" ) );
    $str39$Initializing_all_somewhere_caches = makeString( "Initializing all somewhere caches" );
    $list40 = ConsesLow.cons( makeSymbol( "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE" ), constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) ) );
    $sym41$GAF_ASSERTION_ = makeSymbol( "GAF-ASSERTION?" );
    $sym42$VALID_FORT_ = makeSymbol( "VALID-FORT?" );
    $sym43$FORT_P = makeSymbol( "FORT-P" );
    $sym44$_INTER_ARG_RESULT_ISA_SOMEWHERE_CACHE_ = makeSymbol( "*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*" );
    $const45$interArgResultIsa = constant_handles.reader_make_constant_shell( makeString( "interArgResultIsa" ) );
    $str46$somewhere_cache_argnum_mismatch_f = makeString( "somewhere-cache argnum mismatch for ~s: ~s vs. ~s" );
    $sym47$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const48$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw49$GAF = makeKeyword( "GAF" );
    $kw50$TRUE = makeKeyword( "TRUE" );
  }
}
/*
 * 
 * Total time: 266 ms
 * 
 */