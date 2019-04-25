package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mwp_affix_matcher
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.mwp_affix_matcher";
  public static final String myFingerPrint = "884b0d80457a3328a8597f90d14269614ced153eff550671d150328937afb340";
  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 1400L)
  private static SubLSymbol $mwp_suffix_matcher_deriv$;
  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 1574L)
  private static SubLSymbol $mwp_suffix_matcher_infl$;
  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 1696L)
  private static SubLSymbol $mwp_prefix_matcher_deriv$;
  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 1811L)
  private static SubLSymbol $mwp_prefix_matcher_infl$;
  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 4168L)
  public static SubLSymbol $use_suffix_variantsP$;
  private static final SubLSymbol $sym0$_MWP_SUFFIX_MATCHER_DERIV_;
  private static final SubLSymbol $sym1$_MWP_SUFFIX_MATCHER_INFL_;
  private static final SubLSymbol $sym2$_MWP_PREFIX_MATCHER_DERIV_;
  private static final SubLSymbol $sym3$_MWP_PREFIX_MATCHER_INFL_;
  private static final SubLSymbol $kw4$DERIV;
  private static final SubLSymbol $kw5$INFL;
  private static final SubLObject $const6$DerivationalSuffix;
  private static final SubLString $str7$Finding_derivational_suffix_strin;
  private static final SubLObject $const8$UnproductiveLexicalAffix;
  private static final SubLObject $const9$suffixString;
  private static final SubLSymbol $kw10$GAF;
  private static final SubLSymbol $kw11$TRUE;
  private static final SubLObject $const12$phoneticVariantOfSuffix;
  private static final SubLObject $const13$regularSuffix;
  private static final SubLObject $const14$DerivationalPrefix;
  private static final SubLString $str15$Finding_derivational_prefix_strin;
  private static final SubLObject $const16$prefixString;
  private static final SubLList $list17;
  private static final SubLList $list18;

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 974L)
  public static SubLObject mwp_suffix_matcher_p(final SubLObject obj)
  {
    return strie.strie_p( obj, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 1187L)
  public static SubLObject new_mwp_suffix_matcher()
  {
    return strie.new_strie( Symbols.symbol_function( EQUALP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 1260L)
  public static SubLObject mwp_prefix_matcher_p(final SubLObject obj)
  {
    return strie.strie_p( obj, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 1327L)
  public static SubLObject new_mwp_prefix_matcher()
  {
    return strie.new_strie( Symbols.symbol_function( EQUALP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 1926L)
  public static SubLObject mwp_suffix_matcher(final SubLObject type)
  {
    if( type.eql( $kw4$DERIV ) )
    {
      return $mwp_suffix_matcher_deriv$.getGlobalValue();
    }
    if( type.eql( $kw5$INFL ) )
    {
      return $mwp_suffix_matcher_infl$.getGlobalValue();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 2214L)
  public static SubLObject mwp_prefix_matcher(final SubLObject type)
  {
    if( type.eql( $kw4$DERIV ) )
    {
      return $mwp_prefix_matcher_deriv$.getGlobalValue();
    }
    if( type.eql( $kw5$INFL ) )
    {
      return $mwp_prefix_matcher_infl$.getGlobalValue();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 2490L)
  public static SubLObject mwp_suffix_matcher_find_matches(final SubLObject suffix_matcher, final SubLObject word_string)
  {
    SubLObject ans = NIL;
    if( NIL == string_utilities.empty_string_p( word_string ) && NIL == Sequences.find( Characters.CHAR_vertical, word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject tokens = cdolist_list_var = strie.strie_prefixes( suffix_matcher, Sequences.reverse( word_string ) );
      SubLObject token = NIL;
      token = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject suffix = Sequences.reverse( standard_tokenization.string_token_string( token ) );
        final SubLObject rules = standard_tokenization.string_token_value( token );
        ans = ConsesLow.cons( standard_tokenization.new_string_token( suffix, rules ), ans );
        cdolist_list_var = cdolist_list_var.rest();
        token = cdolist_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 3020L)
  public static SubLObject mwp_prefix_matcher_find_matches(final SubLObject prefix_matcher, final SubLObject word_string)
  {
    SubLObject ans = NIL;
    if( NIL == string_utilities.empty_string_p( word_string ) && NIL == Sequences.find( Characters.CHAR_vertical, word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject tokens = cdolist_list_var = strie.strie_prefixes( prefix_matcher, word_string );
      SubLObject token = NIL;
      token = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject prefix = standard_tokenization.string_token_string( token );
        final SubLObject rules = standard_tokenization.string_token_value( token );
        ans = ConsesLow.cons( standard_tokenization.new_string_token( prefix, rules ), ans );
        cdolist_list_var = cdolist_list_var.rest();
        token = cdolist_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 3530L)
  public static SubLObject mwp_suffix_matcher_init()
  {
    SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      do_mwp_suffix_matcher_init( type );
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 3698L)
  public static SubLObject mwp_prefix_matcher_init()
  {
    SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      do_mwp_prefix_matcher_init( type );
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 3866L)
  public static SubLObject mwp_suffix_count(final SubLObject type)
  {
    return strie.strie_size( mwp_suffix_matcher( type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 4017L)
  public static SubLObject mwp_prefix_count(final SubLObject type)
  {
    return strie.strie_size( mwp_prefix_matcher( type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 4290L)
  public static SubLObject mwp_suffixes(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( type.eql( $kw4$DERIV ) )
    {
      SubLObject suffixes = NIL;
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject reified_affixes = isa.all_fort_instances( $const6$DerivationalSuffix, UNPROVIDED, UNPROVIDED );
        final SubLObject total = Sequences.length( reified_affixes );
        SubLObject so_far = ZERO_INTEGER;
        final SubLObject _prev_bind_0_$1 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_1_$2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_2_$3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( $str7$Finding_derivational_suffix_strin );
            SubLObject cdolist_list_var = reified_affixes;
            SubLObject reified_suffix = NIL;
            reified_suffix = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == isa.isaP( reified_suffix, $const8$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED ) )
              {
                SubLObject pred_var = $const9$suffixString;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( reified_suffix, NIL, pred_var ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( reified_suffix, NIL, pred_var );
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw10$GAF, $kw11$TRUE, NIL );
                        SubLObject done_var_$4 = NIL;
                        final SubLObject token_var_$5 = NIL;
                        while ( NIL == done_var_$4)
                        {
                          final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                          final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( as ) );
                          if( NIL != valid_$6 )
                          {
                            final SubLObject rule = mwp_rule.mwp_rule_from_constant( reified_suffix );
                            final SubLObject suffix_string = cycl_string.cycl_string_to_utf8_string( assertions_high.gaf_arg2( as ) );
                            suffixes = ConsesLow.cons( ConsesLow.list( suffix_string, rule ), suffixes );
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
                }
                if( NIL != $use_suffix_variantsP$.getDynamicValue( thread ) )
                {
                  pred_var = $const12$phoneticVariantOfSuffix;
                  if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( reified_suffix, NIL, pred_var ) )
                  {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( reified_suffix, NIL, pred_var );
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw10$GAF, $kw11$TRUE, NIL );
                          SubLObject done_var_$5 = NIL;
                          final SubLObject token_var_$6 = NIL;
                          while ( NIL == done_var_$5)
                          {
                            final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                            final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( as ) );
                            if( NIL != valid_$7 )
                            {
                              final SubLObject rule = mwp_rule.mwp_rule_from_constant( reified_suffix );
                              final SubLObject suffix_string = cycl_string.cycl_string_to_utf8_string( assertions_high.gaf_arg2( as ) );
                              suffixes = ConsesLow.cons( ConsesLow.list( suffix_string, rule ), suffixes );
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
                            if( NIL != final_index_iterator )
                            {
                              kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                            }
                            Values.restoreValuesFromVector( _values2 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
                          }
                        }
                      }
                      done_var = makeBoolean( NIL == valid );
                    }
                  }
                }
              }
              so_far = Numbers.add( so_far, ONE_INTEGER );
              utilities_macros.note_percent_progress( so_far, total );
              cdolist_list_var = cdolist_list_var.rest();
              reified_suffix = cdolist_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values3 );
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
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$3, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$2, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      return suffixes;
    }
    if( type.eql( $kw5$INFL ) )
    {
      SubLObject suffixes = NIL;
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject pred_var2 = $const13$regularSuffix;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var2 ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$5 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$4 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
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
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var2 );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw10$GAF, NIL, NIL );
                  SubLObject done_var_$6 = NIL;
                  final SubLObject token_var_$7 = NIL;
                  while ( NIL == done_var_$6)
                  {
                    final SubLObject rule_as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$7 );
                    final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( rule_as ) );
                    if( NIL != valid_$8 )
                    {
                      final SubLObject rule = mwp_rule.mwp_rule_from_constant( assertions_high.gaf_arg1( rule_as ) );
                      final SubLObject suffix = assertions_high.gaf_arg3( rule_as );
                      suffixes = ConsesLow.cons( ConsesLow.list( suffix, rule ), suffixes );
                    }
                    done_var_$6 = makeBoolean( NIL == valid_$8 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$4, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$3, thread );
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
      return suffixes;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 5633L)
  public static SubLObject mwp_prefixes(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( type.eql( $kw4$DERIV ) )
    {
      SubLObject prefixes = NIL;
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( lexicon_vars.$mwp_rule_lookup_mt$.getDynamicValue( thread ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject reified_affixes = isa.all_fort_instances( $const14$DerivationalPrefix, UNPROVIDED, UNPROVIDED );
        final SubLObject total = Sequences.length( reified_affixes );
        SubLObject so_far = ZERO_INTEGER;
        final SubLObject _prev_bind_0_$20 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_1_$21 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_2_$22 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( $str15$Finding_derivational_prefix_strin );
            SubLObject cdolist_list_var = reified_affixes;
            SubLObject reified_prefix = NIL;
            reified_prefix = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == isa.isaP( reified_prefix, $const8$UnproductiveLexicalAffix, UNPROVIDED, UNPROVIDED ) )
              {
                final SubLObject pred_var = $const16$prefixString;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( reified_prefix, NIL, pred_var ) )
                {
                  final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( reified_prefix, NIL, pred_var );
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw10$GAF, $kw11$TRUE, NIL );
                        SubLObject done_var_$23 = NIL;
                        final SubLObject token_var_$24 = NIL;
                        while ( NIL == done_var_$23)
                        {
                          final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$24 );
                          final SubLObject valid_$25 = makeBoolean( !token_var_$24.eql( as ) );
                          if( NIL != valid_$25 )
                          {
                            final SubLObject rule = mwp_rule.mwp_rule_from_constant( reified_prefix );
                            final SubLObject prefix_string = cycl_string.cycl_string_to_utf8_string( assertions_high.gaf_arg2( as ) );
                            prefixes = ConsesLow.cons( ConsesLow.list( prefix_string, rule ), prefixes );
                          }
                          done_var_$23 = makeBoolean( NIL == valid_$25 );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid );
                  }
                }
              }
              so_far = Numbers.add( so_far, ONE_INTEGER );
              utilities_macros.note_percent_progress( so_far, total );
              cdolist_list_var = cdolist_list_var.rest();
              reified_prefix = cdolist_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$22, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$21, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$20, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      return prefixes;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 6400L)
  public static SubLObject mwp_suffix_matcher_insert(final SubLObject type, final SubLObject suffix, final SubLObject value)
  {
    return strie.strie_insert( mwp_suffix_matcher( type ), Sequences.reverse( suffix ), value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 6536L)
  public static SubLObject mwp_prefix_matcher_insert(final SubLObject type, final SubLObject prefix, final SubLObject value)
  {
    return strie.strie_insert( mwp_prefix_matcher( type ), prefix, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 6662L)
  public static SubLObject do_mwp_suffix_matcher_init(final SubLObject type)
  {
    strie.strie_clear( mwp_suffix_matcher( type ) );
    SubLObject cdolist_list_var = mwp_suffixes( type );
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject suffix = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
      suffix = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
      value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        mwp_suffix_matcher_insert( type, suffix, value );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return mwp_suffix_matcher( type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mwp-affix-matcher.lisp", position = 6927L)
  public static SubLObject do_mwp_prefix_matcher_init(final SubLObject type)
  {
    strie.strie_clear( mwp_prefix_matcher( type ) );
    SubLObject cdolist_list_var = mwp_prefixes( type );
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject prefix = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
      prefix = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
      value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        mwp_prefix_matcher_insert( type, prefix, value );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return mwp_prefix_matcher( type );
  }

  public static SubLObject declare_mwp_affix_matcher_file()
  {
    SubLFiles.declareFunction( me, "mwp_suffix_matcher_p", "MWP-SUFFIX-MATCHER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_mwp_suffix_matcher", "NEW-MWP-SUFFIX-MATCHER", 0, 0, false );
    SubLFiles.declareFunction( me, "mwp_prefix_matcher_p", "MWP-PREFIX-MATCHER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_mwp_prefix_matcher", "NEW-MWP-PREFIX-MATCHER", 0, 0, false );
    SubLFiles.declareFunction( me, "mwp_suffix_matcher", "MWP-SUFFIX-MATCHER", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_prefix_matcher", "MWP-PREFIX-MATCHER", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_suffix_matcher_find_matches", "MWP-SUFFIX-MATCHER-FIND-MATCHES", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_prefix_matcher_find_matches", "MWP-PREFIX-MATCHER-FIND-MATCHES", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_suffix_matcher_init", "MWP-SUFFIX-MATCHER-INIT", 0, 0, false );
    SubLFiles.declareFunction( me, "mwp_prefix_matcher_init", "MWP-PREFIX-MATCHER-INIT", 0, 0, false );
    SubLFiles.declareFunction( me, "mwp_suffix_count", "MWP-SUFFIX-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_prefix_count", "MWP-PREFIX-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_suffixes", "MWP-SUFFIXES", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_prefixes", "MWP-PREFIXES", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_suffix_matcher_insert", "MWP-SUFFIX-MATCHER-INSERT", 3, 0, false );
    SubLFiles.declareFunction( me, "mwp_prefix_matcher_insert", "MWP-PREFIX-MATCHER-INSERT", 3, 0, false );
    SubLFiles.declareFunction( me, "do_mwp_suffix_matcher_init", "DO-MWP-SUFFIX-MATCHER-INIT", 1, 0, false );
    SubLFiles.declareFunction( me, "do_mwp_prefix_matcher_init", "DO-MWP-PREFIX-MATCHER-INIT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_mwp_affix_matcher_file()
  {
    $mwp_suffix_matcher_deriv$ = SubLFiles.deflexical( "*MWP-SUFFIX-MATCHER-DERIV*", maybeDefault( $sym0$_MWP_SUFFIX_MATCHER_DERIV_, $mwp_suffix_matcher_deriv$, () -> ( new_mwp_suffix_matcher() ) ) );
    $mwp_suffix_matcher_infl$ = SubLFiles.deflexical( "*MWP-SUFFIX-MATCHER-INFL*", maybeDefault( $sym1$_MWP_SUFFIX_MATCHER_INFL_, $mwp_suffix_matcher_infl$, () -> ( new_mwp_suffix_matcher() ) ) );
    $mwp_prefix_matcher_deriv$ = SubLFiles.deflexical( "*MWP-PREFIX-MATCHER-DERIV*", maybeDefault( $sym2$_MWP_PREFIX_MATCHER_DERIV_, $mwp_prefix_matcher_deriv$, () -> ( new_mwp_prefix_matcher() ) ) );
    $mwp_prefix_matcher_infl$ = SubLFiles.deflexical( "*MWP-PREFIX-MATCHER-INFL*", maybeDefault( $sym3$_MWP_PREFIX_MATCHER_INFL_, $mwp_prefix_matcher_infl$, () -> ( new_mwp_prefix_matcher() ) ) );
    $use_suffix_variantsP$ = SubLFiles.defparameter( "*USE-SUFFIX-VARIANTS?*", NIL );
    return NIL;
  }

  public static SubLObject setup_mwp_affix_matcher_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_MWP_SUFFIX_MATCHER_DERIV_ );
    subl_macro_promotions.declare_defglobal( $sym1$_MWP_SUFFIX_MATCHER_INFL_ );
    subl_macro_promotions.declare_defglobal( $sym2$_MWP_PREFIX_MATCHER_DERIV_ );
    subl_macro_promotions.declare_defglobal( $sym3$_MWP_PREFIX_MATCHER_INFL_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_mwp_affix_matcher_file();
  }

  @Override
  public void initializeVariables()
  {
    init_mwp_affix_matcher_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_mwp_affix_matcher_file();
  }
  static
  {
    me = new mwp_affix_matcher();
    $mwp_suffix_matcher_deriv$ = null;
    $mwp_suffix_matcher_infl$ = null;
    $mwp_prefix_matcher_deriv$ = null;
    $mwp_prefix_matcher_infl$ = null;
    $use_suffix_variantsP$ = null;
    $sym0$_MWP_SUFFIX_MATCHER_DERIV_ = makeSymbol( "*MWP-SUFFIX-MATCHER-DERIV*" );
    $sym1$_MWP_SUFFIX_MATCHER_INFL_ = makeSymbol( "*MWP-SUFFIX-MATCHER-INFL*" );
    $sym2$_MWP_PREFIX_MATCHER_DERIV_ = makeSymbol( "*MWP-PREFIX-MATCHER-DERIV*" );
    $sym3$_MWP_PREFIX_MATCHER_INFL_ = makeSymbol( "*MWP-PREFIX-MATCHER-INFL*" );
    $kw4$DERIV = makeKeyword( "DERIV" );
    $kw5$INFL = makeKeyword( "INFL" );
    $const6$DerivationalSuffix = constant_handles.reader_make_constant_shell( makeString( "DerivationalSuffix" ) );
    $str7$Finding_derivational_suffix_strin = makeString( "Finding derivational suffix strings..." );
    $const8$UnproductiveLexicalAffix = constant_handles.reader_make_constant_shell( makeString( "UnproductiveLexicalAffix" ) );
    $const9$suffixString = constant_handles.reader_make_constant_shell( makeString( "suffixString" ) );
    $kw10$GAF = makeKeyword( "GAF" );
    $kw11$TRUE = makeKeyword( "TRUE" );
    $const12$phoneticVariantOfSuffix = constant_handles.reader_make_constant_shell( makeString( "phoneticVariantOfSuffix" ) );
    $const13$regularSuffix = constant_handles.reader_make_constant_shell( makeString( "regularSuffix" ) );
    $const14$DerivationalPrefix = constant_handles.reader_make_constant_shell( makeString( "DerivationalPrefix" ) );
    $str15$Finding_derivational_prefix_strin = makeString( "Finding derivational prefix strings..." );
    $const16$prefixString = constant_handles.reader_make_constant_shell( makeString( "prefixString" ) );
    $list17 = ConsesLow.list( makeSymbol( "SUFFIX" ), makeSymbol( "VALUE" ) );
    $list18 = ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "VALUE" ) );
  }
}
/*
 * 
 * Total time: 382 ms
 * 
 */