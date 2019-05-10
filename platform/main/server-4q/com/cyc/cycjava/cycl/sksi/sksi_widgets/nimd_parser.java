package com.cyc.cycjava.cycl.sksi.sksi_widgets;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.abstract_lexicon;
import com.cyc.cycjava.cycl.concept_tagger;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.nl_trie_accessors;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.standard_tokenization;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nimd_parser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser";
  public static final String myFingerPrint = "5cfb38dbf1d35bd3567e3717c302cacbbd5bc1b31b6fd6c74e8e413d1669aad8";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 7113L)
  private static SubLSymbol $nimd_sentential_concept_tagging_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 7189L)
  public static SubLSymbol $nimd_filters_for_topic_of_text_string_fnP$;
  private static final SubLSymbol $sym0$NUNION;
  private static final SubLString $str1$With_all_the_words;
  private static final SubLString $str2$Query;
  private static final SubLString $str3$With_the_exact_phrase;
  private static final SubLString $str4$With_at_least_one_of_the_words;
  private static final SubLSymbol $sym5$GLASS_BOX_QUERY_REQUIRED_CONCEPTS;
  private static final SubLString $str6$Without_the_words;
  private static final SubLSymbol $sym7$GLASS_BOX_QUERY_EXCLUDED_CONCEPTS;
  private static final SubLString $str8$_;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$STRING_TOKEN_STRING;
  private static final SubLString $str12$_s;
  private static final SubLSymbol $kw13$INFIX;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$GLASS_BOX_TASK_STRING_TOPICS;
  private static final SubLObject $const16$TKBSourceSpindleCollectorMt;
  private static final SubLSymbol $kw17$LEXICON;
  private static final SubLSymbol $sym18$TERM_LEXICON;
  private static final SubLSymbol $sym19$EXCLUDE_POS;
  private static final SubLObject $const20$ClosedClassWord;
  private static final SubLObject $const21$Adjective;
  private static final SubLSymbol $sym22$ADD_CONCEPT_FILTER_SPEC;
  private static final SubLList $list23;
  private static final SubLString $str24$missing_from_parse_result___S__;
  private static final SubLSymbol $sym25$NIMD_TASK_PARSE_CONTAINS_;
  private static final SubLSymbol $kw26$TEST;
  private static final SubLSymbol $kw27$OWNER;
  private static final SubLSymbol $kw28$CLASSES;
  private static final SubLSymbol $kw29$KB;
  private static final SubLSymbol $kw30$FULL;
  private static final SubLSymbol $kw31$WORKING_;
  private static final SubLList $list32;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 969L)
  public static SubLObject glass_box_query_required_concepts(final SubLObject source_string)
  {
    if( !source_string.isString() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_set( Sequences.remove_duplicates( Sequences.creduce( Symbols.symbol_function( $sym0$NUNION ), ConsesLow.list( glass_box_concepts_int( source_string, $str1$With_all_the_words ),
        glass_box_concepts_int( source_string, $str2$Query ), glass_box_concepts_int( source_string, $str3$With_the_exact_phrase ), glass_box_concepts_int( source_string, $str4$With_at_least_one_of_the_words ) ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 1709L)
  public static SubLObject glass_box_query_excluded_concepts(final SubLObject source_string)
  {
    if( !source_string.isString() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_set( glass_box_concepts_int( source_string, $str6$Without_the_words ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 1988L)
  public static SubLObject glass_box_concepts_int(final SubLObject source_string, final SubLObject search_string)
  {
    final SubLObject query_string = glass_box_search_string( source_string, search_string );
    return nimd_search_string_denotation_mapper( query_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 2201L)
  public static SubLObject glass_box_search_string(final SubLObject source_string, final SubLObject marker_string)
  {
    SubLObject cdolist_list_var;
    final SubLObject major_parts = cdolist_list_var = string_utilities.split_string( source_string, $str8$_ );
    SubLObject part = NIL;
    part = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != string_utilities.starts_with( string_utilities.trim_whitespace( part ), marker_string ) )
      {
        return string_utilities.string_upto( string_utilities.string_after( part, Characters.CHAR_quotation ), Characters.CHAR_quotation );
      }
      cdolist_list_var = cdolist_list_var.rest();
      part = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 2490L)
  public static SubLObject nimd_search_string_denotation_mapper(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !string.isString() )
    {
      return NIL;
    }
    final SubLObject decoded_string = web_utilities.html_url_decode( string );
    final SubLObject excluded_preds = $list9;
    final SubLObject chunks = string_utilities.string_tokenize( decoded_string, $list10, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject cdolist_list_var = chunks;
        SubLObject chunk = NIL;
        chunk = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject tokenized_string = string_utilities.string_tokenize( string_utilities.trim_whitespace( chunk ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject queued_words = NIL;
          while ( NIL != list_utilities.lengthG( tokenized_string, ZERO_INTEGER, UNPROVIDED ))
          {
            thread.resetMultipleValues();
            final SubLObject dates = nimd_dates_from_string( tokenized_string, UNPROVIDED, UNPROVIDED );
            final SubLObject length = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != dates )
            {
              result = Sequences.cconcatenate( dates, result );
              SubLObject cdolist_list_var_$1 = lexicon_accessors.denotation_mapper( string_utilities.bunge( Sequences.nreverse( queued_words ), UNPROVIDED ), excluded_preds, UNPROVIDED, UNPROVIDED );
              SubLObject token = NIL;
              token = cdolist_list_var_$1.first();
              while ( NIL != cdolist_list_var_$1)
              {
                result = ConsesLow.cons( standard_tokenization.string_token_value( token ), result );
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                token = cdolist_list_var_$1.first();
              }
              queued_words = NIL;
              tokenized_string = list_utilities.first_n( length, tokenized_string );
            }
            else
            {
              queued_words = ConsesLow.cons( tokenized_string.first(), queued_words );
              tokenized_string = tokenized_string.rest();
            }
          }
          final SubLObject rest_of_string = string_utilities.bunge( ConsesLow.nconc( Sequences.nreverse( queued_words ), tokenized_string ), UNPROVIDED );
          thread.resetMultipleValues();
          final SubLObject recognized_terms = lexicon_accessors.denotation_mapper( rest_of_string, excluded_preds, UNPROVIDED, UNPROVIDED );
          final SubLObject unrecognized_terms = thread.secondMultipleValue();
          thread.resetMultipleValues();
          SubLObject cdolist_list_var_$2 = recognized_terms;
          SubLObject token2 = NIL;
          token2 = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            if( NIL == nimd_uninteresting_word( standard_tokenization.string_token_string( token2 ) ) )
            {
              result = ConsesLow.cons( standard_tokenization.string_token_value( token2 ), result );
            }
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            token2 = cdolist_list_var_$2.first();
          }
          result = Sequences.cconcatenate( result, nimd_matches_for_unrecognized_terms( Mapping.mapcar( $sym11$STRING_TOKEN_STRING, unrecognized_terms ), excluded_preds ) );
          cdolist_list_var = cdolist_list_var.rest();
          chunk = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 4410L)
  public static SubLObject nimd_uninteresting_word(final SubLObject string)
  {
    return lexicon_utilities.denots_of_string_stop_word( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 4505L)
  public static SubLObject nimd_matches_for_unrecognized_terms(final SubLObject strings, final SubLObject excluded_preds)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = strings;
    SubLObject unrecognized_string = NIL;
    unrecognized_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject unpossessivized_string = string_utilities.post_remove( unrecognized_string, $str12$_s, UNPROVIDED );
      final SubLObject unpossessivized_matches = lexicon_accessors.denotation_mapper( unpossessivized_string, excluded_preds, UNPROVIDED, UNPROVIDED );
      if( NIL != unpossessivized_matches )
      {
        SubLObject cdolist_list_var_$4 = unpossessivized_matches;
        SubLObject token = NIL;
        token = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          if( NIL == nimd_uninteresting_word( standard_tokenization.string_token_string( token ) ) )
          {
            result = ConsesLow.cons( standard_tokenization.string_token_value( token ), result );
          }
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          token = cdolist_list_var_$4.first();
        }
      }
      else
      {
        SubLObject cdolist_list_var_$5;
        final SubLObject possible_matches = cdolist_list_var_$5 = nl_trie_accessors.nl_trie_matching_phrases( unpossessivized_string, $kw13$INFIX );
        SubLObject possible_match = NIL;
        possible_match = cdolist_list_var_$5.first();
        while ( NIL != cdolist_list_var_$5)
        {
          final SubLObject item_var = nl_trie_accessors.nl_trie_index_item_term( possible_match );
          if( NIL == conses_high.member( item_var, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var, result );
          }
          cdolist_list_var_$5 = cdolist_list_var_$5.rest();
          possible_match = cdolist_list_var_$5.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      unrecognized_string = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 5322L)
  public static SubLObject nimd_dates_from_string(final SubLObject tokenized_string, SubLObject max_date_length, SubLObject min_date_length)
  {
    if( max_date_length == UNPROVIDED )
    {
      max_date_length = THREE_INTEGER;
    }
    if( min_date_length == UNPROVIDED )
    {
      min_date_length = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject dates = NIL;
    SubLObject length = Numbers.min( max_date_length, Sequences.length( tokenized_string ) );
    final SubLObject _prev_bind_0 = date_utilities.$date_patterns$.currentBinding( thread );
    try
    {
      date_utilities.$date_patterns$.bind( ConsesLow.cons( $list14, date_utilities.$date_patterns$.getDynamicValue( thread ) ), thread );
      while ( NIL != list_utilities.empty_list_p( dates ) && length.numGE( min_date_length ))
      {
        dates = date_utilities.parse_date_from_string_fast( string_utilities.bunge( Sequences.subseq( tokenized_string, ZERO_INTEGER, length ), UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        length = Numbers.subtract( length, ONE_INTEGER );
      }
    }
    finally
    {
      date_utilities.$date_patterns$.rebind( _prev_bind_0, thread );
    }
    return Values.values( dates, number_utilities.f_1X( length ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 5842L)
  public static SubLObject glass_box_task_string_topics(final SubLObject source_string)
  {
    final SubLObject unicodeP = unicode_nauts.unicode_naut_p( source_string, UNPROVIDED );
    final SubLObject string = ( NIL != unicodeP ) ? unicode_strings.unicode_display_to_html( cycl_utilities.nat_arg1( source_string, UNPROVIDED ) ) : source_string;
    if( !string.isString() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return el_utilities.make_el_set( nimd_task_string_denotation_mapper( string ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 6265L)
  public static SubLObject nimd_task_string_denotation_mapper(final SubLObject source_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_document = document.new_document( source_string, UNPROVIDED, UNPROVIDED );
    final SubLObject lexicon = get_nimd_task_string_denotation_mapper_lexicon();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const16$TKBSourceSpindleCollectorMt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      result = Sequences.remove( NIL, concept_tagger.all_tagged_concepts( v_document, ConsesLow.list( $kw17$LEXICON, lexicon ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL != result )
    {
      return Sequences.remove_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return lexicon_accessors.denots_of_string( source_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 7263L)
  public static SubLObject get_nimd_task_string_denotation_mapper_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == abstract_lexicon.abstract_lexicon_p( $nimd_sentential_concept_tagging_lexicon$.getDynamicValue( thread ) ) )
    {
      $nimd_sentential_concept_tagging_lexicon$.setDynamicValue( object.new_class_instance( $sym18$TERM_LEXICON ), thread );
      methods.funcall_instance_method_with_1_args( $nimd_sentential_concept_tagging_lexicon$.getDynamicValue( thread ), $sym19$EXCLUDE_POS, $const20$ClosedClassWord );
      methods.funcall_instance_method_with_1_args( $nimd_sentential_concept_tagging_lexicon$.getDynamicValue( thread ), $sym19$EXCLUDE_POS, $const21$Adjective );
      if( NIL != $nimd_filters_for_topic_of_text_string_fnP$.getDynamicValue( thread ) )
      {
        methods.funcall_instance_method_with_1_args( $nimd_sentential_concept_tagging_lexicon$.getDynamicValue( thread ), $sym22$ADD_CONCEPT_FILTER_SPEC, $list23 );
      }
    }
    return $nimd_sentential_concept_tagging_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 8111L)
  public static SubLObject nimd_task_parse_containsP(final SubLObject task_string, final SubLObject required_elements)
  {
    final SubLObject parse_result = nimd_task_string_denotation_mapper( task_string );
    SubLObject failP = NIL;
    if( NIL == failP )
    {
      SubLObject csome_list_var = required_elements;
      SubLObject element = NIL;
      element = csome_list_var.first();
      while ( NIL == failP && NIL != csome_list_var)
      {
        if( NIL == conses_high.member( element, cycl_utilities.hl_to_el( parse_result ), EQUAL, UNPROVIDED ) )
        {
          Errors.warn( $str24$missing_from_parse_result___S__, element );
          failP = T;
        }
        csome_list_var = csome_list_var.rest();
        element = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == failP );
  }

  public static SubLObject declare_nimd_parser_file()
  {
    SubLFiles.declareFunction( me, "glass_box_query_required_concepts", "GLASS-BOX-QUERY-REQUIRED-CONCEPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "glass_box_query_excluded_concepts", "GLASS-BOX-QUERY-EXCLUDED-CONCEPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "glass_box_concepts_int", "GLASS-BOX-CONCEPTS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "glass_box_search_string", "GLASS-BOX-SEARCH-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "nimd_search_string_denotation_mapper", "NIMD-SEARCH-STRING-DENOTATION-MAPPER", 1, 0, false );
    SubLFiles.declareFunction( me, "nimd_uninteresting_word", "NIMD-UNINTERESTING-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "nimd_matches_for_unrecognized_terms", "NIMD-MATCHES-FOR-UNRECOGNIZED-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "nimd_dates_from_string", "NIMD-DATES-FROM-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "glass_box_task_string_topics", "GLASS-BOX-TASK-STRING-TOPICS", 1, 0, false );
    SubLFiles.declareFunction( me, "nimd_task_string_denotation_mapper", "NIMD-TASK-STRING-DENOTATION-MAPPER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_nimd_task_string_denotation_mapper_lexicon", "GET-NIMD-TASK-STRING-DENOTATION-MAPPER-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "nimd_task_parse_containsP", "NIMD-TASK-PARSE-CONTAINS?", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_nimd_parser_file()
  {
    $nimd_sentential_concept_tagging_lexicon$ = SubLFiles.defparameter( "*NIMD-SENTENTIAL-CONCEPT-TAGGING-LEXICON*", NIL );
    $nimd_filters_for_topic_of_text_string_fnP$ = SubLFiles.defparameter( "*NIMD-FILTERS-FOR-TOPIC-OF-TEXT-STRING-FN?*", NIL );
    return NIL;
  }

  public static SubLObject setup_nimd_parser_file()
  {
    utilities_macros.register_kb_function( $sym5$GLASS_BOX_QUERY_REQUIRED_CONCEPTS );
    utilities_macros.register_kb_function( $sym7$GLASS_BOX_QUERY_EXCLUDED_CONCEPTS );
    utilities_macros.register_kb_function( $sym15$GLASS_BOX_TASK_STRING_TOPICS );
    generic_testing.define_test_case_table_int( $sym25$NIMD_TASK_PARSE_CONTAINS_, ConsesLow.list( new SubLObject[] { $kw26$TEST, NIL, $kw27$OWNER, NIL, $kw28$CLASSES, NIL, $kw29$KB, $kw30$FULL, $kw31$WORKING_, T
    } ), $list32 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nimd_parser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nimd_parser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nimd_parser_file();
  }
  static
  {
    me = new nimd_parser();
    $nimd_sentential_concept_tagging_lexicon$ = null;
    $nimd_filters_for_topic_of_text_string_fnP$ = null;
    $sym0$NUNION = makeSymbol( "NUNION" );
    $str1$With_all_the_words = makeString( "With_all_the_words" );
    $str2$Query = makeString( "Query" );
    $str3$With_the_exact_phrase = makeString( "With_the_exact_phrase" );
    $str4$With_at_least_one_of_the_words = makeString( "With_at_least_one_of_the_words" );
    $sym5$GLASS_BOX_QUERY_REQUIRED_CONCEPTS = makeSymbol( "GLASS-BOX-QUERY-REQUIRED-CONCEPTS" );
    $str6$Without_the_words = makeString( "Without_the_words" );
    $sym7$GLASS_BOX_QUERY_EXCLUDED_CONCEPTS = makeSymbol( "GLASS-BOX-QUERY-EXCLUDED-CONCEPTS" );
    $str8$_ = makeString( "," );
    $list9 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "givenNames" ) ), constant_handles.reader_make_constant_shell( makeString( "middleName" ) ), constant_handles
        .reader_make_constant_shell( makeString( "firstName" ) ), constant_handles.reader_make_constant_shell( makeString( "countryCodeDigraph" ) ), constant_handles.reader_make_constant_shell( makeString(
            "stockTickerSymbol" ) ), constant_handles.reader_make_constant_shell( makeString( "gospelName-Short" ) ), constant_handles.reader_make_constant_shell( makeString( "epistleAddresseeText" ) ), constant_handles
                .reader_make_constant_shell( makeString( "internetCountryCode" ) ) );
    $list10 = ConsesLow.list( Characters.CHAR_plus );
    $sym11$STRING_TOKEN_STRING = makeSymbol( "STRING-TOKEN-STRING" );
    $str12$_s = makeString( "'s" );
    $kw13$INFIX = makeKeyword( "INFIX" );
    $list14 = ConsesLow.list( makeKeyword( "YEAR" ) );
    $sym15$GLASS_BOX_TASK_STRING_TOPICS = makeSymbol( "GLASS-BOX-TASK-STRING-TOPICS" );
    $const16$TKBSourceSpindleCollectorMt = constant_handles.reader_make_constant_shell( makeString( "TKBSourceSpindleCollectorMt" ) );
    $kw17$LEXICON = makeKeyword( "LEXICON" );
    $sym18$TERM_LEXICON = makeSymbol( "TERM-LEXICON" );
    $sym19$EXCLUDE_POS = makeSymbol( "EXCLUDE-POS" );
    $const20$ClosedClassWord = constant_handles.reader_make_constant_shell( makeString( "ClosedClassWord" ) );
    $const21$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $sym22$ADD_CONCEPT_FILTER_SPEC = makeSymbol( "ADD-CONCEPT-FILTER-SPEC" );
    $list23 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "ConceptNodesForTaskTypeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "IntelligenceAnalysisTask-Allotment" ) ) ), constant_handles.reader_make_constant_shell( makeString(
            "ConceptAndInstancesFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString( "TriggerFromConceptOrInstance" ) ) );
    $str24$missing_from_parse_result___S__ = makeString( "missing from parse result: ~S~%" );
    $sym25$NIMD_TASK_PARSE_CONTAINS_ = makeSymbol( "NIMD-TASK-PARSE-CONTAINS?" );
    $kw26$TEST = makeKeyword( "TEST" );
    $kw27$OWNER = makeKeyword( "OWNER" );
    $kw28$CLASSES = makeKeyword( "CLASSES" );
    $kw29$KB = makeKeyword( "KB" );
    $kw30$FULL = makeKeyword( "FULL" );
    $kw31$WORKING_ = makeKeyword( "WORKING?" );
    $list32 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString(
        "A recent suicide bombing that apparently targeted the motorcade of Rafik \nHariri, the former Lebanese Prime Minister, resulted in the death of Hariri.\nDetermine who are the most likely suspects for the bombing. Provide information\nabout the motives of terrorist groups or nations that could have directed or\nperformed the bombing." ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Motive" ) ), constant_handles.reader_make_constant_shell( makeString( "RafikHariri" ) ) ) ), T ), ConsesLow.list( ConsesLow.list(
            makeString(
                "Recent reports indicate that there is growing\ndissent among Iranian reformers against their hardline leader, Mahmoud\nAhmadinejad. Some reformers seem to believe Ahmadinejad's hardline tactics are\nundermining their strategic goals because they are creating a climate in which\nit is increasingly challenging for Iran to pursue a nuclear program. Gather\nevidence of dissent. Develop strategies to exploit these cracks in Iranian\nsolidarity." ),
            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Iran" ) ), constant_handles.reader_make_constant_shell( makeString( "MahmoudAhmadinejad" ) ), constant_handles
                .reader_make_constant_shell( makeString( "ActOfDissent" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ResearchingAndDevelopingFn" ) ), constant_handles
                    .reader_make_constant_shell( makeString( "NuclearRelatedMaterial" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( makeString(
                        "Recent reports indicate that there is growing\ndissent among Iranian reformers against their hardline leader, Mahmoud\nAhmadinejad. Some reformers seem to believe Ahmadinejad's hardline tactics are\nundermining their strategic goals because they are creating a climate in which\nit is increasingly challenging for Iran to pursue a nuclear program. Gather\nevidence of dissent. Develop strategies to exploit these cracks in Iranian\nsolidarity." ),
                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Event" ) ) ) ), NIL ) );
  }
}
/*
 * 
 * Total time: 143 ms
 * 
 */