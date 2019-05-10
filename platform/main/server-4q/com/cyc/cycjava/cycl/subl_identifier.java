package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subl_identifier
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subl_identifier";
  public static final String myFingerPrint = "6e69ced4e6ef369b0d8a5b8fbf55ab89662ad8a6453bb62dd73ee806db69106a";
  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 1799L)
  private static SubLSymbol $sublid_domain_to_forts_table$;
  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 2061L)
  private static SubLSymbol $sublid_id_to_forts_table$;
  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 2265L)
  private static SubLSymbol $sublid_fort_to_id_table$;
  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 2471L)
  private static SubLSymbol $sublid_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 2525L)
  private static SubLSymbol $sublid_uiit_pred$;
  private static final SubLSymbol $sym0$_SUBLID_DOMAIN_TO_FORTS_TABLE_;
  private static final SubLSymbol $sym1$_SUBLID_ID_TO_FORTS_TABLE_;
  private static final SubLSymbol $sym2$_SUBLID_FORT_TO_ID_TABLE_;
  private static final SubLObject $const3$subLIdentifier;
  private static final SubLObject $const4$uniquelyIdentifiedInType;
  private static final SubLString $str5$More_than_one_Cyc_entity_found_fo;
  private static final SubLSymbol $kw6$ADD;
  private static final SubLSymbol $kw7$REMOVE;
  private static final SubLSymbol $sym8$SUBLID_DOMAIN_P;
  private static final SubLSymbol $sym9$FORT_P;
  private static final SubLString $str10$Unknown_sublid_domain_to_forts_up;
  private static final SubLSymbol $sym11$SUBLID_P;
  private static final SubLObject $const12$SubLSymbolEntityFn;
  private static final SubLString $str13$Unknown_sublid_forts_update_opera;
  private static final SubLSymbol $sym14$NAT_FUNCTOR;
  private static final SubLSymbol $kw15$GAF;
  private static final SubLSymbol $kw16$TRUE;
  private static final SubLSymbol $sym17$ADD_SUBLIDENTIFIER;
  private static final SubLSymbol $sym18$REMOVE_SUBLIDENTIFIER;
  private static final SubLSymbol $sym19$ADD_UNIQUELYIDENTIFIEDINTYPE;
  private static final SubLSymbol $sym20$REMOVE_UNIQUELYIDENTIFIEDINTYPE;

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 2593L)
  public static SubLObject sublid_p(final SubLObject v_object)
  {
    return Types.symbolp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 2709L)
  public static SubLObject sublid_domain_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != fort_types_interface.collectionP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 2812L)
  public static SubLObject cyc_entity_from_sublid(final SubLObject sublid, final SubLObject domain)
  {
    final SubLObject id_candidates = Sequences.remove_duplicates( sublid_id_to_forts_lookup( sublid ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject domain_candidates = sublid_domain_to_forts_lookup( domain );
    final SubLObject result = equals.simplest_forts_wrt_rewrite( keyhash_utilities.fast_intersection( id_candidates, domain_candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED ), mt_vars.$sublid_mt$.getGlobalValue() );
    if( NIL == result )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( result ) )
    {
      return result.first();
    }
    Errors.warn( $str5$More_than_one_Cyc_entity_found_fo, sublid, domain );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 3512L)
  public static SubLObject sublid_from_cyc_entity(final SubLObject fort)
  {
    return sublid_fort_to_id_lookup( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 3641L)
  public static SubLObject sublid_add_domain_to_forts(final SubLObject domain, final SubLObject fort)
  {
    return sublid_domain_to_forts_update( domain, fort, $kw6$ADD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 3868L)
  public static SubLObject sublid_remove_domain_to_forts(final SubLObject domain, final SubLObject fort)
  {
    return sublid_domain_to_forts_update( domain, fort, $kw7$REMOVE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 3990L)
  public static SubLObject sublid_domain_to_forts_update(final SubLObject domain, final SubLObject fort, final SubLObject operation)
  {
    assert NIL != sublid_domain_p( domain ) : domain;
    assert NIL != forts.fort_p( fort ) : fort;
    final SubLObject existing = sublid_domain_to_forts_lookup( domain );
    SubLObject v_new = NIL;
    if( operation.eql( $kw6$ADD ) )
    {
      v_new = ConsesLow.cons( fort, existing );
    }
    else if( operation.eql( $kw7$REMOVE ) )
    {
      v_new = Sequences.remove( fort, existing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      Errors.error( $str10$Unknown_sublid_domain_to_forts_up, operation );
    }
    dictionary.dictionary_remove( $sublid_domain_to_forts_table$.getGlobalValue(), domain );
    if( NIL != v_new )
    {
      dictionary.dictionary_enter( $sublid_domain_to_forts_table$.getGlobalValue(), domain, v_new );
    }
    return dictionary.dictionary_lookup( $sublid_domain_to_forts_table$.getGlobalValue(), domain, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 4614L)
  public static SubLObject sublid_domain_to_forts_lookup(final SubLObject domain)
  {
    assert NIL != sublid_domain_p( domain ) : domain;
    return dictionary.dictionary_lookup( $sublid_domain_to_forts_table$.getGlobalValue(), domain, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 4866L)
  public static SubLObject sublid_add_id_to_forts(final SubLObject sublid, final SubLObject fort)
  {
    return sublid_id_to_forts_update( sublid, fort, $kw6$ADD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 5089L)
  public static SubLObject sublid_remove_id_to_forts(final SubLObject sublid, final SubLObject fort)
  {
    return sublid_id_to_forts_update( sublid, fort, $kw7$REMOVE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 5203L)
  public static SubLObject sublid_id_to_forts_update(final SubLObject sublid, final SubLObject fort, final SubLObject operation)
  {
    assert NIL != sublid_p( sublid ) : sublid;
    assert NIL != forts.fort_p( fort ) : fort;
    final SubLObject existing = sublid_id_to_forts_lookup( sublid );
    SubLObject v_new = NIL;
    if( $const12$SubLSymbolEntityFn.eql( cycl_utilities.nat_functor( v_new ) ) )
    {
      return existing;
    }
    if( NIL != list_utilities.member_eqP( v_new, existing ) )
    {
      return existing;
    }
    if( operation.eql( $kw6$ADD ) )
    {
      v_new = ConsesLow.cons( fort, existing );
    }
    else if( operation.eql( $kw7$REMOVE ) )
    {
      v_new = Sequences.remove( fort, existing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      Errors.error( $str13$Unknown_sublid_forts_update_opera, operation );
    }
    dictionary.dictionary_remove( $sublid_id_to_forts_table$.getGlobalValue(), sublid );
    if( NIL != v_new )
    {
      dictionary.dictionary_enter( $sublid_id_to_forts_table$.getGlobalValue(), sublid, v_new );
    }
    return dictionary.dictionary_lookup( $sublid_id_to_forts_table$.getGlobalValue(), sublid, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 5986L)
  public static SubLObject cleanup_sublid_id_to_forts(final SubLObject sublid)
  {
    final SubLObject existing = sublid_id_to_forts_lookup( sublid );
    SubLObject v_new = list_utilities.fast_delete_duplicates( existing, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    v_new = Sequences.remove( $const12$SubLSymbolEntityFn, v_new, EQ, $sym14$NAT_FUNCTOR, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    dictionary.dictionary_remove( $sublid_id_to_forts_table$.getGlobalValue(), sublid );
    if( NIL != v_new )
    {
      dictionary.dictionary_enter( $sublid_id_to_forts_table$.getGlobalValue(), sublid, v_new );
    }
    return dictionary.dictionary_lookup( $sublid_id_to_forts_table$.getGlobalValue(), sublid, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 6415L)
  public static SubLObject sublid_id_to_forts_lookup(final SubLObject sublid)
  {
    assert NIL != sublid_p( sublid ) : sublid;
    return dictionary.dictionary_lookup( $sublid_id_to_forts_table$.getGlobalValue(), sublid, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 6641L)
  public static SubLObject sublid_add_fort_to_id(final SubLObject fort, final SubLObject sublid)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    assert NIL != sublid_p( sublid ) : sublid;
    return dictionary.dictionary_enter( $sublid_fort_to_id_table$.getGlobalValue(), fort, sublid );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 6916L)
  public static SubLObject sublid_remove_fort_to_id(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return dictionary.dictionary_remove( $sublid_fort_to_id_table$.getGlobalValue(), fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 7052L)
  public static SubLObject sublid_fort_to_id_lookup(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return dictionary.dictionary_lookup( $sublid_fort_to_id_table$.getGlobalValue(), fort, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 7230L)
  public static SubLObject initialize_sublid_mappings()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dictionary.clear_dictionary( $sublid_domain_to_forts_table$.getGlobalValue() );
    dictionary.clear_dictionary( $sublid_id_to_forts_table$.getGlobalValue() );
    dictionary.clear_dictionary( $sublid_fort_to_id_table$.getGlobalValue() );
    if( NIL != fort_types_interface.mtP( mt_vars.$sublid_mt$.getGlobalValue() ) && NIL != fort_types_interface.predicateP( $sublid_pred$.getGlobalValue() ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt_vars.$sublid_mt$.getGlobalValue() );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        SubLObject pred_var = $sublid_pred$.getGlobalValue();
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
                  SubLObject done_var_$4 = NIL;
                  final SubLObject token_var_$5 = NIL;
                  while ( NIL == done_var_$4)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                    final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( assertion ) );
                    if( NIL != valid_$6 )
                    {
                      sublid_mappings_add( assertion );
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
        pred_var = $sublid_uiit_pred$.getGlobalValue();
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$3 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$4 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
                  SubLObject done_var_$5 = NIL;
                  final SubLObject token_var_$6 = NIL;
                  while ( NIL == done_var_$5)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                    final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( assertion ) );
                    if( NIL != valid_$7 )
                    {
                      uiit_mappings_add( assertion );
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
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
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
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$4, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$3, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$3, thread );
          }
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

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 7979L)
  public static SubLObject add_sublidentifier(final SubLObject argument, final SubLObject assertion)
  {
    return sublid_mappings_add( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 8214L)
  public static SubLObject remove_sublidentifier(final SubLObject argument, final SubLObject assertion)
  {
    return sublid_mappings_remove( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 8345L)
  public static SubLObject sublid_mappings_add(final SubLObject assertion)
  {
    final SubLObject fort = assertions_high.gaf_arg1( assertion );
    final SubLObject sublid = el_utilities.subl_escape_subl( assertions_high.gaf_arg2( assertion ) );
    sublid_add_id_to_forts( sublid, fort );
    sublid_add_fort_to_id( fort, sublid );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 8584L)
  public static SubLObject sublid_mappings_remove(final SubLObject assertion)
  {
    final SubLObject fort = assertions_high.gaf_arg1( assertion );
    final SubLObject sublid = el_utilities.subl_escape_subl( assertions_high.gaf_arg2( assertion ) );
    sublid_remove_id_to_forts( sublid, fort );
    sublid_remove_fort_to_id( fort );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 8819L)
  public static SubLObject add_uniquelyidentifiedintype(final SubLObject argument, final SubLObject assertion)
  {
    return uiit_mappings_add( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 8981L)
  public static SubLObject remove_uniquelyidentifiedintype(final SubLObject argument, final SubLObject assertion)
  {
    return uiit_mappings_remove( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 9120L)
  public static SubLObject uiit_mappings_add(final SubLObject assertion)
  {
    final SubLObject fort = assertions_high.gaf_arg1( assertion );
    final SubLObject domain = assertions_high.gaf_arg2( assertion );
    return sublid_add_domain_to_forts( domain, fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-identifier.lisp", position = 9290L)
  public static SubLObject uiit_mappings_remove(final SubLObject assertion)
  {
    final SubLObject fort = assertions_high.gaf_arg1( assertion );
    final SubLObject domain = assertions_high.gaf_arg2( assertion );
    return sublid_remove_domain_to_forts( domain, fort );
  }

  public static SubLObject declare_subl_identifier_file()
  {
    SubLFiles.declareFunction( me, "sublid_p", "SUBLID-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sublid_domain_p", "SUBLID-DOMAIN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_entity_from_sublid", "CYC-ENTITY-FROM-SUBLID", 2, 0, false );
    SubLFiles.declareFunction( me, "sublid_from_cyc_entity", "SUBLID-FROM-CYC-ENTITY", 1, 0, false );
    SubLFiles.declareFunction( me, "sublid_add_domain_to_forts", "SUBLID-ADD-DOMAIN-TO-FORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sublid_remove_domain_to_forts", "SUBLID-REMOVE-DOMAIN-TO-FORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sublid_domain_to_forts_update", "SUBLID-DOMAIN-TO-FORTS-UPDATE", 3, 0, false );
    SubLFiles.declareFunction( me, "sublid_domain_to_forts_lookup", "SUBLID-DOMAIN-TO-FORTS-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "sublid_add_id_to_forts", "SUBLID-ADD-ID-TO-FORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sublid_remove_id_to_forts", "SUBLID-REMOVE-ID-TO-FORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sublid_id_to_forts_update", "SUBLID-ID-TO-FORTS-UPDATE", 3, 0, false );
    SubLFiles.declareFunction( me, "cleanup_sublid_id_to_forts", "CLEANUP-SUBLID-ID-TO-FORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sublid_id_to_forts_lookup", "SUBLID-ID-TO-FORTS-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "sublid_add_fort_to_id", "SUBLID-ADD-FORT-TO-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "sublid_remove_fort_to_id", "SUBLID-REMOVE-FORT-TO-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sublid_fort_to_id_lookup", "SUBLID-FORT-TO-ID-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_sublid_mappings", "INITIALIZE-SUBLID-MAPPINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "add_sublidentifier", "ADD-SUBLIDENTIFIER", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_sublidentifier", "REMOVE-SUBLIDENTIFIER", 2, 0, false );
    SubLFiles.declareFunction( me, "sublid_mappings_add", "SUBLID-MAPPINGS-ADD", 1, 0, false );
    SubLFiles.declareFunction( me, "sublid_mappings_remove", "SUBLID-MAPPINGS-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_uniquelyidentifiedintype", "ADD-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_uniquelyidentifiedintype", "REMOVE-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "uiit_mappings_add", "UIIT-MAPPINGS-ADD", 1, 0, false );
    SubLFiles.declareFunction( me, "uiit_mappings_remove", "UIIT-MAPPINGS-REMOVE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_subl_identifier_file()
  {
    $sublid_domain_to_forts_table$ = SubLFiles.deflexical( "*SUBLID-DOMAIN-TO-FORTS-TABLE*", maybeDefault( $sym0$_SUBLID_DOMAIN_TO_FORTS_TABLE_, $sublid_domain_to_forts_table$, () -> ( dictionary.new_dictionary(
        UNPROVIDED, UNPROVIDED ) ) ) );
    $sublid_id_to_forts_table$ = SubLFiles.deflexical( "*SUBLID-ID-TO-FORTS-TABLE*", maybeDefault( $sym1$_SUBLID_ID_TO_FORTS_TABLE_, $sublid_id_to_forts_table$, () -> ( dictionary.new_dictionary( UNPROVIDED,
        UNPROVIDED ) ) ) );
    $sublid_fort_to_id_table$ = SubLFiles.deflexical( "*SUBLID-FORT-TO-ID-TABLE*", maybeDefault( $sym2$_SUBLID_FORT_TO_ID_TABLE_, $sublid_fort_to_id_table$, () -> ( dictionary.new_dictionary( UNPROVIDED,
        UNPROVIDED ) ) ) );
    $sublid_pred$ = SubLFiles.defconstant( "*SUBLID-PRED*", $const3$subLIdentifier );
    $sublid_uiit_pred$ = SubLFiles.defconstant( "*SUBLID-UIIT-PRED*", $const4$uniquelyIdentifiedInType );
    return NIL;
  }

  public static SubLObject setup_subl_identifier_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_SUBLID_DOMAIN_TO_FORTS_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym1$_SUBLID_ID_TO_FORTS_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym2$_SUBLID_FORT_TO_ID_TABLE_ );
    utilities_macros.register_kb_function( $sym17$ADD_SUBLIDENTIFIER );
    utilities_macros.register_kb_function( $sym18$REMOVE_SUBLIDENTIFIER );
    utilities_macros.register_kb_function( $sym19$ADD_UNIQUELYIDENTIFIEDINTYPE );
    utilities_macros.register_kb_function( $sym20$REMOVE_UNIQUELYIDENTIFIEDINTYPE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subl_identifier_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subl_identifier_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subl_identifier_file();
  }
  static
  {
    me = new subl_identifier();
    $sublid_domain_to_forts_table$ = null;
    $sublid_id_to_forts_table$ = null;
    $sublid_fort_to_id_table$ = null;
    $sublid_pred$ = null;
    $sublid_uiit_pred$ = null;
    $sym0$_SUBLID_DOMAIN_TO_FORTS_TABLE_ = makeSymbol( "*SUBLID-DOMAIN-TO-FORTS-TABLE*" );
    $sym1$_SUBLID_ID_TO_FORTS_TABLE_ = makeSymbol( "*SUBLID-ID-TO-FORTS-TABLE*" );
    $sym2$_SUBLID_FORT_TO_ID_TABLE_ = makeSymbol( "*SUBLID-FORT-TO-ID-TABLE*" );
    $const3$subLIdentifier = constant_handles.reader_make_constant_shell( makeString( "subLIdentifier" ) );
    $const4$uniquelyIdentifiedInType = constant_handles.reader_make_constant_shell( makeString( "uniquelyIdentifiedInType" ) );
    $str5$More_than_one_Cyc_entity_found_fo = makeString( "More than one Cyc entity found for ID ~A and domain ~A." );
    $kw6$ADD = makeKeyword( "ADD" );
    $kw7$REMOVE = makeKeyword( "REMOVE" );
    $sym8$SUBLID_DOMAIN_P = makeSymbol( "SUBLID-DOMAIN-P" );
    $sym9$FORT_P = makeSymbol( "FORT-P" );
    $str10$Unknown_sublid_domain_to_forts_up = makeString( "Unknown sublid-domain-to-forts-update operation ~A" );
    $sym11$SUBLID_P = makeSymbol( "SUBLID-P" );
    $const12$SubLSymbolEntityFn = constant_handles.reader_make_constant_shell( makeString( "SubLSymbolEntityFn" ) );
    $str13$Unknown_sublid_forts_update_opera = makeString( "Unknown sublid-forts-update operation ~A" );
    $sym14$NAT_FUNCTOR = makeSymbol( "NAT-FUNCTOR" );
    $kw15$GAF = makeKeyword( "GAF" );
    $kw16$TRUE = makeKeyword( "TRUE" );
    $sym17$ADD_SUBLIDENTIFIER = makeSymbol( "ADD-SUBLIDENTIFIER" );
    $sym18$REMOVE_SUBLIDENTIFIER = makeSymbol( "REMOVE-SUBLIDENTIFIER" );
    $sym19$ADD_UNIQUELYIDENTIFIEDINTYPE = makeSymbol( "ADD-UNIQUELYIDENTIFIEDINTYPE" );
    $sym20$REMOVE_UNIQUELYIDENTIFIEDINTYPE = makeSymbol( "REMOVE-UNIQUELYIDENTIFIEDINTYPE" );
  }
}
/*
 * 
 * Total time: 308 ms
 * 
 */