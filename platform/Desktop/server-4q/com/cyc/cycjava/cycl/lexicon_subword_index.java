package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_subword_index
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.lexicon_subword_index";
  public static final String myFingerPrint = "2dcd69240b83a4a66d8b51bc0d02e6d6abdad7c06450c4ba15d6f86915cbcb9f";
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 909L)
  private static SubLSymbol $nl_trie_subword_fht_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 1089L)
  private static SubLSymbol $nl_trie_subword_fht_name$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 1188L)
  private static SubLSymbol $nl_trie_subword_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 1383L)
  private static SubLSymbol $nl_trie_subword_index$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 1978L)
  private static SubLSymbol $nl_trie_subword_cache_initialization_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 6882L)
  private static SubLSymbol $pivot_location_break_chars$;
  private static final SubLString $str0$nl_trie_subword_fht_lock;
  private static final SubLSymbol $sym1$_NL_TRIE_SUBWORD_INDEX_;
  private static final SubLSymbol $sym2$CYCL_STRING_P;
  private static final SubLSymbol $sym3$_NL_TRIE_SUBWORD_CACHE_INITIALIZATION_LOCK_;
  private static final SubLString $str4$_nl_trie_subword_cache_initializa;
  private static final SubLString $str5$_S_is_not_an_ASCII_string_;
  private static final SubLSymbol $kw6$ON;
  private static final SubLSymbol $kw7$OFF;
  private static final SubLSymbol $kw8$PREFERRED;
  private static final SubLSymbol $sym9$SUBWORD_INDEX_RAW_SEARCH_SET;
  private static final SubLSymbol $sym10$STRINGP;
  private static final SubLSymbol $sym11$SUBWORD_INDEX_BREAK_CHAR_P;
  private static final SubLSymbol $kw12$NOT_FOUND;
  private static final SubLSymbol $sym13$SET_P;
  private static final SubLString $str14$Unexpected_result__S_from_SUBWORD;
  private static final SubLSymbol $sym15$_EXIT;
  private static final SubLInteger $int16$1024;
  private static final SubLSymbol $kw17$DENOT;
  private static final SubLSymbol $sym18$SUBWORDS;
  private static final SubLSymbol $sym19$LEXICON_SUBWORD_INDEX_STOP_WORD_;
  private static final SubLInteger $int20$1000;
  private static final SubLSymbol $kw21$UNINITIALIZED;
  private static final SubLSymbol $sym22$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const23$EverythingPSC;
  private static final SubLString $str24$Indexing_arg_;
  private static final SubLString $str25$_of_;
  private static final SubLSymbol $kw26$GAF;
  private static final SubLSymbol $kw27$ADDED;
  private static final SubLString $str28$Un_indexing_arg_;
  private static final SubLSymbol $sym29$NON_TRIE_SUBWORD_PREDS;
  private static final SubLObject $const30$indexSubWordsForArg;
  private static final SubLSymbol $sym31$STRING_IN_TRIE_;
  private static final SubLInteger $int32$100;
  private static final SubLSymbol $kw33$IMAGE_INDEPENDENT_CFASL;
  private static final SubLString $str34$Lexicon_not_yet_initialized;
  private static final SubLString $str35$building_in_memory_NL_trie_subwor;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $kw38$INDEXED;
  private static final SubLString $str39$nl_trie_subwords;
  private static final SubLString $str40$The_in_memory_NL_Trie_Subword_Ind;
  private static final SubLSymbol $sym41$SET_EMPTY_;
  private static final SubLString $str42$Dumping_NL_Trie_Subword_Index_Cac;
  private static final SubLString $str43$__Added__A_new_entries_to_the_NL_;
  private static final SubLString $str44$__Deleted__A_entries_from_the_NL_;
  private static final SubLString $str45$__Modified__A_existing_entries_in;
  private static final SubLString $str46$Temp_directory__;
  private static final SubLString $str47$__unavailable;
  private static final SubLString $str48$Writing_nl_trie_subword_index_to_;
  private static final SubLSymbol $kw49$USE_FIRST;
  private static final SubLSymbol $sym50$UTF8_STRING_TO_CYCL_SAFE_STRING;
  private static final SubLSymbol $sym51$1_;
  private static final SubLSymbol $sym52$TEST_SUBWORD_INDEX;
  private static final SubLSymbol $kw53$TEST;
  private static final SubLSymbol $kw54$OWNER;
  private static final SubLSymbol $kw55$CLASSES;
  private static final SubLSymbol $kw56$KB;
  private static final SubLSymbol $kw57$FULL;
  private static final SubLSymbol $kw58$WORKING_;
  private static final SubLList $list59;

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 1533L)
  public static SubLObject nl_trie_subword_index_search(final SubLObject string, SubLObject case_sensitivity)
  {
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_subword_index_default_case_sensitivity$.getDynamicValue();
    }
    assert NIL != cycl_string.cycl_string_p( string ) : string;
    final SubLObject v_set = nl_trie_subword_index_search_set( string, case_sensitivity );
    if( NIL == set.set_p( v_set ) )
    {
      return NIL;
    }
    return set.set_element_list( v_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 2101L)
  public static SubLObject get_nl_trie_subword_cache()
  {
    maybe_initialize_nl_trie_subword_cache();
    return $nl_trie_subword_cache$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 2223L)
  public static SubLObject nl_trie_subword_index_existsP()
  {
    return file_backed_cache.file_backed_cache_p( get_nl_trie_subword_cache() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 2331L)
  public static SubLObject maybe_initialize_nl_trie_subword_cache()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $nl_trie_subword_cache_initialization_lock$.getGlobalValue() );
      if( NIL == file_backed_cache.file_backed_cache_p( $nl_trie_subword_cache$.getGlobalValue() ) )
      {
        initialize_nl_trie_subword_caches();
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $nl_trie_subword_cache_initialization_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 2570L)
  public static SubLObject nl_trie_subword_index_search_set(SubLObject string, SubLObject case_sensitivity)
  {
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_subword_index_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_string.cycl_string_p( string ) : string;
    if( NIL != unicode_strings.non_ascii_string_p( string ) )
    {
      string = unicode_nauts.utf8_string_to_cycl_safe_string( string );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && string.isString() && NIL == unicode_strings.ascii_string_p( string ) )
    {
      Errors.error( $str5$_S_is_not_an_ASCII_string_, string );
    }
    thread.resetMultipleValues();
    final SubLObject ans = nl_trie_subword_index_search_set_low( string, case_sensitivity );
    final SubLObject new_setP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return ( NIL != new_setP || NIL == set.set_p( ans ) ) ? ans : set.copy_set( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 3255L)
  public static SubLObject nl_trie_subword_index_search_set_low(final SubLObject v_cycl_string, SubLObject case_sensitivity)
  {
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_subword_index_default_case_sensitivity$.getDynamicValue();
    }
    final SubLObject string = cycl_string.cycl_string_to_utf8_string( v_cycl_string );
    final SubLObject raw_answer = subword_index_raw_search_set( string_utilities.trim_whitespace( string ) );
    if( NIL == set.set_p( raw_answer ) )
    {
      return raw_answer;
    }
    final SubLObject pcase_var = case_sensitivity;
    if( pcase_var.eql( $kw6$ON ) || pcase_var.eql( $kw7$OFF ) )
    {
      final SubLObject ans = set.new_set( set.set_test( raw_answer ), UNPROVIDED );
      final SubLObject test = ( case_sensitivity == $kw6$ON ) ? Symbols.symbol_function( EQUAL ) : Symbols.symbol_function( EQUALP );
      final SubLObject set_contents_var = set.do_set_internal( raw_answer );
      SubLObject basis_object;
      SubLObject state;
      SubLObject str;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        str = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, str ) && NIL != Sequences.search( string, str, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          set.set_add( unicode_nauts.utf8_string_to_cycl_safe_string( str ), ans );
        }
      }
      return ans;
    }
    if( !pcase_var.eql( $kw8$PREFERRED ) )
    {
      return NIL;
    }
    SubLObject case_sensitive_matches = NIL;
    SubLObject case_insensitive_matches = NIL;
    final SubLObject set_contents_var = set.do_set_internal( raw_answer );
    SubLObject basis_object;
    SubLObject state;
    SubLObject str;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      str = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, str ) )
      {
        if( NIL != Sequences.search( string, str, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          case_sensitive_matches = ConsesLow.cons( unicode_nauts.utf8_string_to_cycl_safe_string( str ), case_sensitive_matches );
        }
        else if( NIL != Sequences.search( string, str, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          case_insensitive_matches = ConsesLow.cons( unicode_nauts.utf8_string_to_cycl_safe_string( str ), case_insensitive_matches );
        }
      }
    }
    if( NIL != case_sensitive_matches )
    {
      return set_utilities.construct_set_from_list( case_sensitive_matches, set.set_test( raw_answer ), UNPROVIDED );
    }
    return set_utilities.construct_set_from_list( case_insensitive_matches, set.set_test( raw_answer ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 4473L)
  public static SubLObject subword_index_raw_search_set_internal(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    if( NIL != Sequences.find_if( $sym11$SUBWORD_INDEX_BREAK_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject subword_results = Mapping.mapcar( $sym9$SUBWORD_INDEX_RAW_SEARCH_SET, subwords( string ) );
      if( NIL != Sequences.find( $kw12$NOT_FOUND, subword_results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return $kw12$NOT_FOUND;
      }
      if( NIL != list_utilities.find_if_not( $sym13$SET_P, subword_results, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        Errors.error( $str14$Unexpected_result__S_from_SUBWORD, list_utilities.find_if_not( $sym13$SET_P, subword_results, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
      else
      {
        if( NIL != list_utilities.empty_list_p( subword_results ) )
        {
          return $kw12$NOT_FOUND;
        }
        final SubLObject results = set_utilities.set_intersection( subword_results, UNPROVIDED );
        return ( NIL != set.set_emptyP( results ) ) ? $kw12$NOT_FOUND : results;
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
      try
      {
        cfasl.$cfasl_common_symbols$.bind( NIL, thread );
        cfasl.cfasl_set_common_symbols_simple( misc_utilities.get_hl_store_caches_shared_symbols_simple() );
        return file_backed_cache.file_backed_cache_lookup( string, get_nl_trie_subword_cache(), UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 4473L)
  public static SubLObject subword_index_raw_search_set(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return subword_index_raw_search_set_internal( string );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym9$SUBWORD_INDEX_RAW_SEARCH_SET, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym9$SUBWORD_INDEX_RAW_SEARCH_SET, ONE_INTEGER, $int16$1024, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym9$SUBWORD_INDEX_RAW_SEARCH_SET, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( subword_index_raw_search_set_internal( string ) ) );
      memoization_state.caching_state_put( caching_state, string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 5309L)
  public static SubLObject denots_of_nl_trie_subword_index_search(final SubLObject string, SubLObject limit, SubLObject case_sensitivity)
  {
    if( limit == UNPROVIDED )
    {
      limit = NIL;
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_subword_index_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_set = nl_trie_subword_index_search_set( string, case_sensitivity );
    SubLObject denots = NIL;
    SubLObject current_denot_count = ZERO_INTEGER;
    SubLObject limit_exceeded = NIL;
    if( NIL == set.set_p( v_set ) )
    {
      return NIL;
    }
    final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding( thread );
    try
    {
      lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind( case_sensitivity, thread );
      final SubLObject denot_lexicon = denots_of_string_lexicon.lexicon_for_denots_of_string( NIL, $kw17$DENOT, T, NIL, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), case_sensitivity );
      final SubLObject set_contents_var = set.do_set_internal( v_set );
      SubLObject basis_object;
      SubLObject state;
      SubLObject elt;
      SubLObject csome_list_var;
      SubLObject denot;
      SubLObject item_var;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == limit_exceeded
          && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        elt = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, elt ) && NIL == limit_exceeded )
        {
          csome_list_var = lexicon_accessors.denots_of_string( elt, NIL, $kw17$DENOT, T, NIL, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), lexicon_vars.$parse_morphologically$.getDynamicValue( thread ),
              NIL, denot_lexicon );
          denot = NIL;
          denot = csome_list_var.first();
          while ( NIL == limit_exceeded && NIL != csome_list_var)
          {
            item_var = denot;
            if( NIL == conses_high.member( item_var, denots, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              denots = ConsesLow.cons( item_var, denots );
            }
            current_denot_count = Numbers.add( current_denot_count, ONE_INTEGER );
            if( limit.eql( current_denot_count ) )
            {
              limit_exceeded = T;
            }
            csome_list_var = csome_list_var.rest();
            denot = csome_list_var.first();
          }
        }
      }
    }
    finally
    {
      lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denots, ( NIL != limit_exceeded ) ? set.set_size( v_set ) : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 6505L)
  public static SubLObject subwords_internal(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return Sequences.delete_if( $sym19$LEXICON_SUBWORD_INDEX_STOP_WORD_, string_utilities.string_tokenize( string, pivot_location_break_chars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 6505L)
  public static SubLObject subwords(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return subwords_internal( string );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym18$SUBWORDS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym18$SUBWORDS, ONE_INTEGER, $int20$1000, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym18$SUBWORDS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( subwords_internal( string ) ) );
      memoization_state.caching_state_put( caching_state, string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 6759L)
  public static SubLObject lexicon_subword_index_stop_wordP(final SubLObject string)
  {
    return lexicon_accessors.closed_lexical_class_string_case_insensitiveP( string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 6948L)
  public static SubLObject pivot_location_break_chars()
  {
    if( $pivot_location_break_chars$.getGlobalValue() == $kw21$UNINITIALIZED )
    {
      $pivot_location_break_chars$.setGlobalValue( Sequences.cconcatenate( string_utilities.grammatical_punctuation_chars(), string_utilities.whitespace_chars() ) );
    }
    return $pivot_location_break_chars$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 7294L)
  public static SubLObject subword_index_break_char_p(final SubLObject v_char)
  {
    return conses_high.member( v_char, pivot_location_break_chars(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 7397L)
  public static SubLObject add_non_trie_predicate_to_sub_word_index(final SubLObject pred, final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym22$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const23$EverythingPSC, thread );
      final SubLObject total = kb_indexing.num_predicate_extent_index( pred, UNPROVIDED );
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject message = Sequences.cconcatenate( $str24$Indexing_arg_, new SubLObject[] { format_nil.format_nil_d_no_copy( n ), $str25$_of_, format_nil.format_nil_s_no_copy( pred )
      } );
      final SubLObject _prev_bind_0_$1 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message );
          if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
          {
            final SubLObject str = NIL;
            final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding( thread );
            final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
            final SubLObject _prev_bind_2_$5 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
            final SubLObject _prev_bind_3_$6 = utilities_macros.$progress_notification_count$.currentBinding( thread );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw26$GAF, NIL, NIL );
                    SubLObject done_var_$7 = NIL;
                    final SubLObject token_var_$8 = NIL;
                    while ( NIL == done_var_$7)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$8 );
                      final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( gaf ) );
                      if( NIL != valid_$9 )
                      {
                        final SubLObject string = assertions_high.gaf_arg( gaf, n );
                        if( string.isString() )
                        {
                          reset_nl_trie_subword_index_for_string( string, NIL );
                        }
                        sofar = Numbers.add( sofar, ONE_INTEGER );
                        utilities_macros.note_percent_progress( sofar, total );
                      }
                      done_var_$7 = makeBoolean( NIL == valid_$9 );
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
              utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$6, thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$5, thread );
              utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$3, thread );
              utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$2, thread );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
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
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $kw27$ADDED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 7892L)
  public static SubLObject remove_non_trie_predicate_from_sub_word_index(final SubLObject pred, final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym22$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const23$EverythingPSC, thread );
      final SubLObject total = kb_indexing.num_predicate_extent_index( pred, UNPROVIDED );
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject message = Sequences.cconcatenate( $str28$Un_indexing_arg_, new SubLObject[] { format_nil.format_nil_d_no_copy( n ), $str25$_of_, format_nil.format_nil_s_no_copy( pred )
      } );
      final SubLObject _prev_bind_0_$12 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$13 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message );
          if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
          {
            final SubLObject str = NIL;
            final SubLObject _prev_bind_0_$13 = utilities_macros.$progress_start_time$.currentBinding( thread );
            final SubLObject _prev_bind_1_$14 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
            final SubLObject _prev_bind_2_$16 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
            final SubLObject _prev_bind_3_$17 = utilities_macros.$progress_notification_count$.currentBinding( thread );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw26$GAF, NIL, NIL );
                    SubLObject done_var_$18 = NIL;
                    final SubLObject token_var_$19 = NIL;
                    while ( NIL == done_var_$18)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$19 );
                      final SubLObject valid_$20 = makeBoolean( !token_var_$19.eql( gaf ) );
                      if( NIL != valid_$20 )
                      {
                        final SubLObject string = assertions_high.gaf_arg( gaf, n );
                        if( string.isString() )
                        {
                          reset_nl_trie_subword_index_for_string( string, T );
                        }
                        sofar = Numbers.add( sofar, ONE_INTEGER );
                        utilities_macros.note_percent_progress( sofar, total );
                      }
                      done_var_$18 = makeBoolean( NIL == valid_$20 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
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
              utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$17, thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$16, thread );
              utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$14, thread );
              utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$13, thread );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
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
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$13, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$12, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $kw27$ADDED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 8393L)
  public static SubLObject reset_nl_trie_subword_index_for_string(final SubLObject v_cycl_string, final SubLObject removedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_string.cycl_string_p( v_cycl_string ) : v_cycl_string;
    final SubLObject string = cycl_string.cycl_string_to_utf8_string( v_cycl_string );
    final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
    try
    {
      cfasl.$cfasl_common_symbols$.bind( NIL, thread );
      cfasl.cfasl_set_common_symbols_simple( misc_utilities.get_hl_store_caches_shared_symbols_simple() );
      if( NIL == removedP )
      {
        SubLObject cdolist_list_var = subwords( string );
        SubLObject subword = NIL;
        subword = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject subword_super_strings = subword_index_raw_search_set( subword );
          if( NIL == set.set_p( subword_super_strings ) )
          {
            subword_super_strings = set.new_set( EQUAL, UNPROVIDED );
          }
          set.set_add( string, subword_super_strings );
          file_backed_cache.file_backed_cache_enter( subword, subword_super_strings, get_nl_trie_subword_cache() );
          cdolist_list_var = cdolist_list_var.rest();
          subword = cdolist_list_var.first();
        }
      }
      else if( NIL == string_in_trieP( string, UNPROVIDED ) )
      {
        if( NIL == string_asserted_on_non_trie_subword_pred_arg_comboP( string ) )
        {
          SubLObject cdolist_list_var = subwords( string );
          SubLObject subword = NIL;
          subword = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject subword_super_strings = subword_index_raw_search_set( subword );
            if( NIL != set.set_p( subword_super_strings ) )
            {
              set.set_remove( string, subword_super_strings );
              file_backed_cache.file_backed_cache_enter( subword, subword_super_strings, get_nl_trie_subword_cache() );
            }
            cdolist_list_var = cdolist_list_var.rest();
            subword = cdolist_list_var.first();
          }
        }
      }
    }
    finally
    {
      cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 10234L)
  public static SubLObject non_trie_subword_preds_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preds = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym22$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const23$EverythingPSC, thread );
      final SubLObject pred_var = $const30$indexSubWordsForArg;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$23 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$24 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw26$GAF, NIL, NIL );
                SubLObject done_var_$25 = NIL;
                final SubLObject token_var_$26 = NIL;
                while ( NIL == done_var_$25)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$26 );
                  final SubLObject valid_$27 = makeBoolean( !token_var_$26.eql( gaf ) );
                  if( NIL != valid_$27 )
                  {
                    final SubLObject item_var = assertions_high.gaf_arg1( gaf );
                    if( NIL == conses_high.member( item_var, preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      preds = ConsesLow.cons( item_var, preds );
                    }
                  }
                  done_var_$25 = makeBoolean( NIL == valid_$27 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
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
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$24, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$23, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 10234L)
  public static SubLObject non_trie_subword_preds()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return non_trie_subword_preds_internal();
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym29$NON_TRIE_SUBWORD_PREDS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym29$NON_TRIE_SUBWORD_PREDS, ZERO_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym29$NON_TRIE_SUBWORD_PREDS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( non_trie_subword_preds_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 10494L)
  public static SubLObject non_trie_subword_pred_args(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym22$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const23$EverythingPSC, thread );
      return conses_high.copy_list( kb_mapping_utilities.pred_values( pred, $const30$indexSubWordsForArg, ONE_INTEGER, TWO_INTEGER, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 10633L)
  public static SubLObject string_asserted_on_non_trie_subword_pred_arg_comboP(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertedP = NIL;
    final SubLObject v_cycl_string = unicode_nauts.utf8_string_to_cycl_safe_string( string );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym22$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const23$EverythingPSC, thread );
      if( NIL == assertedP )
      {
        SubLObject csome_list_var = non_trie_subword_preds();
        SubLObject pred = NIL;
        pred = csome_list_var.first();
        while ( NIL == assertedP && NIL != csome_list_var)
        {
          if( NIL == assertedP )
          {
            SubLObject csome_list_var_$29 = non_trie_subword_pred_args( pred );
            SubLObject arg = NIL;
            arg = csome_list_var_$29.first();
            while ( NIL == assertedP && NIL != csome_list_var_$29)
            {
              if( kb_indexing.num_gaf_arg_index( v_cycl_string, arg, pred, UNPROVIDED ).isPositive() )
              {
                assertedP = T;
              }
              csome_list_var_$29 = csome_list_var_$29.rest();
              arg = csome_list_var_$29.first();
            }
          }
          csome_list_var = csome_list_var.rest();
          pred = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return assertedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 11034L)
  public static SubLObject string_in_trieP_internal(final SubLObject string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    final SubLObject v_cycl_string = unicode_nauts.utf8_string_to_cycl_safe_string( string );
    final SubLObject utf8_string = cycl_string.cycl_string_to_utf8_string( v_cycl_string );
    SubLObject cdolist_list_var;
    final SubLObject entries = cdolist_list_var = nl_trie.nl_trie_search( v_cycl_string, UNPROVIDED, UNPROVIDED );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Functions.funcall( test, utf8_string, nl_trie.nl_trie_entry_string( entry ) ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 11034L)
  public static SubLObject string_in_trieP(final SubLObject string, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return string_in_trieP_internal( string, test );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym31$STRING_IN_TRIE_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym31$STRING_IN_TRIE_, TWO_INTEGER, $int32$100, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym31$STRING_IN_TRIE_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( string, test );
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
        if( string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && test.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( string_in_trieP_internal( string, test ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, test ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 11436L)
  public static SubLObject initialize_nl_trie_subword_caches()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject path = get_default_nl_trie_subword_cache_file_path( UNPROVIDED );
    if( NIL != Filesys.probe_file( path ) )
    {
      $nl_trie_subword_cache$.setGlobalValue( file_backed_cache.file_backed_cache_create( path, NIL, NIL, file_hash_table.$fht_cache_percentage$.getDynamicValue( thread ), EQUALP, $kw33$IMAGE_INDEPENDENT_CFASL ) );
    }
    return $nl_trie_subword_cache$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 11783L)
  public static SubLObject reset_nl_trie_subword_caches()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $nl_trie_subword_fht_lock$.getGlobalValue() );
      if( NIL != $nl_trie_subword_cache$.getGlobalValue() )
      {
        $nl_trie_subword_fht_name$.setGlobalValue( NIL );
        file_backed_cache.file_backed_cache_reset( $nl_trie_subword_cache$.getGlobalValue(), UNPROVIDED );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $nl_trie_subword_fht_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 12162L)
  public static SubLObject build_nl_trie_subword_index()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == control_vars.lexicon_initialized_p() )
    {
      Errors.error( $str34$Lexicon_not_yet_initialized );
    }
    $nl_trie_subword_index$.setGlobalValue( dictionary.new_dictionary( EQUALP, UNPROVIDED ) );
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$30 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          SubLObject release = NIL;
          try
          {
            release = Locks.seize_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
            final SubLObject _prev_bind_0_$31 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
            final SubLObject _prev_bind_1_$32 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding( thread );
            try
            {
              file_vector_utilities.$file_vector_backed_map_read_lock$.bind( nl_trie.$nl_trie_lock$.getGlobalValue(), thread );
              file_vector_utilities.$current_backed_map_cache_strategy$.bind( nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread );
              final SubLObject stack = stacks.create_stack();
              final SubLObject the_map = nl_trie.get_nl_trie();
              final SubLObject mess = $str35$building_in_memory_NL_trie_subwor;
              SubLObject sofar = ZERO_INTEGER;
              final SubLObject total = map_utilities.map_size( the_map );
              assert NIL != Types.stringp( mess ) : mess;
              final SubLObject _prev_bind_0_$32 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
              final SubLObject _prev_bind_1_$33 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$35 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
              final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
              try
              {
                utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                try
                {
                  utilities_macros.noting_percent_progress_preamble( mess );
                  final SubLObject iterator = map_utilities.new_map_iterator( the_map );
                  SubLObject valid;
                  for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next( iterator );
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != valid )
                    {
                      SubLObject current;
                      final SubLObject datum = current = var;
                      SubLObject strie_dict_key = NIL;
                      SubLObject strie_dict_value = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
                      strie_dict_key = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list36 );
                      strie_dict_value = current.first();
                      current = current.rest();
                      if( NIL == current )
                      {
                        utilities_macros.note_percent_progress( sofar, total );
                        sofar = Numbers.add( sofar, ONE_INTEGER );
                        if( NIL != map_utilities.map_p( strie_dict_value ) )
                        {
                          stacks.stack_push( strie_dict_value, stack );
                          while ( NIL == stacks.stack_empty_p( stack ))
                          {
                            final SubLObject entry = stacks.stack_pop( stack );
                            final SubLObject iterator_$36 = map_utilities.new_map_iterator( entry );
                            SubLObject valid_$39;
                            for( SubLObject done_var_$37 = NIL; NIL == done_var_$37; done_var_$37 = makeBoolean( NIL == valid_$39 ) )
                            {
                              thread.resetMultipleValues();
                              final SubLObject var_$38 = iteration.iteration_next( iterator_$36 );
                              valid_$39 = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              if( NIL != valid_$39 )
                              {
                                SubLObject current_$41;
                                final SubLObject datum_$40 = current_$41 = var_$38;
                                SubLObject dict_key = NIL;
                                SubLObject dict_value = NIL;
                                cdestructuring_bind.destructuring_bind_must_consp( current_$41, datum_$40, $list37 );
                                dict_key = current_$41.first();
                                current_$41 = current_$41.rest();
                                cdestructuring_bind.destructuring_bind_must_consp( current_$41, datum_$40, $list37 );
                                dict_value = current_$41.first();
                                current_$41 = current_$41.rest();
                                if( NIL == current_$41 )
                                {
                                  if( NIL != map_utilities.map_p( dict_value ) )
                                  {
                                    stacks.stack_push( dict_value, stack );
                                  }
                                  else if( dict_value.isCons() )
                                  {
                                    final SubLObject key = dict_value.first();
                                    final SubLObject entries = dict_value.rest();
                                    SubLObject cdolist_list_var = nl_trie_entries_strings( entries );
                                    SubLObject entry_string = NIL;
                                    entry_string = cdolist_list_var.first();
                                    while ( NIL != cdolist_list_var)
                                    {
                                      if( NIL != entry_string )
                                      {
                                        index_sub_words( entry_string );
                                      }
                                      cdolist_list_var = cdolist_list_var.rest();
                                      entry_string = cdolist_list_var.first();
                                    }
                                  }
                                }
                                else
                                {
                                  cdestructuring_bind.cdestructuring_bind_error( datum_$40, $list37 );
                                }
                              }
                            }
                          }
                        }
                        else if( strie_dict_value.isCons() )
                        {
                          final SubLObject key2 = strie_dict_value.first();
                          final SubLObject entries2 = strie_dict_value.rest();
                          SubLObject cdolist_list_var2 = nl_trie_entries_strings( entries2 );
                          SubLObject entry_string2 = NIL;
                          entry_string2 = cdolist_list_var2.first();
                          while ( NIL != cdolist_list_var2)
                          {
                            if( NIL != entry_string2 )
                            {
                              index_sub_words( entry_string2 );
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            entry_string2 = cdolist_list_var2.first();
                          }
                        }
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum, $list36 );
                      }
                    }
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
                  }
                }
              }
              finally
              {
                utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
                utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$35, thread );
                utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$33, thread );
                utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$32, thread );
              }
            }
            finally
            {
              file_vector_utilities.$current_backed_map_cache_strategy$.rebind( _prev_bind_1_$32, thread );
              file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0_$31, thread );
            }
          }
          finally
          {
            if( NIL != release )
            {
              Locks.release_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
            }
          }
          SubLObject cdolist_list_var3 = non_trie_subword_preds();
          SubLObject pred = NIL;
          pred = cdolist_list_var3.first();
          while ( NIL != cdolist_list_var3)
          {
            SubLObject cdolist_list_var_$43 = non_trie_subword_pred_args( pred );
            SubLObject arg = NIL;
            arg = cdolist_list_var_$43.first();
            while ( NIL != cdolist_list_var_$43)
            {
              index_sub_words_for_pred_and_arg( pred, arg );
              cdolist_list_var_$43 = cdolist_list_var_$43.rest();
              arg = cdolist_list_var_$43.first();
            }
            cdolist_list_var3 = cdolist_list_var3.rest();
            pred = cdolist_list_var3.first();
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$30, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return $nl_trie_subword_index$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 12838L)
  public static SubLObject index_sub_words(final SubLObject v_cycl_string)
  {
    final SubLObject string = cycl_string.cycl_string_to_utf8_string( v_cycl_string );
    SubLObject cdolist_list_var = subwords( string );
    SubLObject subword = NIL;
    subword = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject v_set = dictionary.dictionary_lookup( $nl_trie_subword_index$.getGlobalValue(), subword, UNPROVIDED );
      if( NIL == set.set_p( v_set ) )
      {
        v_set = set.new_set( EQUAL, UNPROVIDED );
        dictionary.dictionary_enter( $nl_trie_subword_index$.getGlobalValue(), subword, v_set );
      }
      set.set_add( string, v_set );
      cdolist_list_var = cdolist_list_var.rest();
      subword = cdolist_list_var.first();
    }
    return $kw38$INDEXED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 13224L)
  public static SubLObject index_sub_words_for_pred_and_arg(final SubLObject pred, final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym22$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const23$EverythingPSC, thread );
      final SubLObject total = kb_indexing.num_predicate_extent_index( pred, UNPROVIDED );
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject message = Sequences.cconcatenate( $str24$Indexing_arg_, new SubLObject[] { format_nil.format_nil_d_no_copy( n ), $str25$_of_, format_nil.format_nil_s_no_copy( pred )
      } );
      final SubLObject _prev_bind_0_$45 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$46 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( message );
          if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
          {
            final SubLObject str = NIL;
            final SubLObject _prev_bind_0_$46 = utilities_macros.$progress_start_time$.currentBinding( thread );
            final SubLObject _prev_bind_1_$47 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
            final SubLObject _prev_bind_2_$49 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
            final SubLObject _prev_bind_3_$50 = utilities_macros.$progress_notification_count$.currentBinding( thread );
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw26$GAF, NIL, NIL );
                    SubLObject done_var_$51 = NIL;
                    final SubLObject token_var_$52 = NIL;
                    while ( NIL == done_var_$51)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$52 );
                      final SubLObject valid_$53 = makeBoolean( !token_var_$52.eql( gaf ) );
                      if( NIL != valid_$53 )
                      {
                        final SubLObject string = assertions_high.gaf_arg( gaf, n );
                        if( string.isString() )
                        {
                          index_sub_words( string );
                        }
                        sofar = Numbers.add( sofar, ONE_INTEGER );
                        utilities_macros.note_percent_progress( sofar, total );
                      }
                      done_var_$51 = makeBoolean( NIL == valid_$53 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$47, thread );
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
              utilities_macros.$progress_notification_count$.rebind( _prev_bind_3_$50, thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_2_$49, thread );
              utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$47, thread );
              utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$46, thread );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$48, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$46, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$45, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $kw38$INDEXED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 13681L)
  public static SubLObject nl_trie_entries_strings(final SubLObject entries)
  {
    SubLObject strings = NIL;
    SubLObject cdolist_list_var = entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = nl_trie.nl_trie_entry_string( entry );
      if( NIL == conses_high.member( item_var, strings, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
      {
        strings = ConsesLow.cons( item_var, strings );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return strings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 13863L)
  public static SubLObject dump_nl_trie_subword_index(final SubLObject dump_directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file = dumper.kb_dump_product_file( $str39$nl_trie_subwords, dump_directory, UNPROVIDED );
    if( NIL != dictionary.dictionary_p( $nl_trie_subword_index$.getGlobalValue() ) )
    {
      return dump_nl_trie_subword_index_int( $nl_trie_subword_index$.getGlobalValue(), file, UNPROVIDED );
    }
    if( NIL == file_backed_cache.file_backed_cache_p( $nl_trie_subword_cache$.getGlobalValue() ) )
    {
      return Errors.warn( $str40$The_in_memory_NL_Trie_Subword_Ind );
    }
    final SubLObject source_common_symbols = misc_utilities.get_hl_store_caches_shared_symbols_simple();
    final SubLObject target_common_symbols = cfasl.cfasl_current_common_symbols();
    thread.resetMultipleValues();
    final SubLObject the_file = file_backed_cache.replicate_file_backed_cache( $nl_trie_subword_cache$.getGlobalValue(), file, $sym41$SET_EMPTY_, source_common_symbols, target_common_symbols, file_utilities
        .temp_directory(), $str42$Dumping_NL_Trie_Subword_Index_Cac );
    final SubLObject updates = thread.secondMultipleValue();
    final SubLObject additions = thread.thirdMultipleValue();
    final SubLObject deletions = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( additions.isPositive() )
    {
      PrintLow.format( T, $str43$__Added__A_new_entries_to_the_NL_, additions );
    }
    if( deletions.isPositive() )
    {
      PrintLow.format( T, $str44$__Deleted__A_entries_from_the_NL_, deletions );
    }
    if( updates.isPositive() )
    {
      PrintLow.format( T, $str45$__Modified__A_existing_entries_in, updates );
    }
    return file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 15280L)
  public static SubLObject dump_nl_trie_subword_index_int(SubLObject index, SubLObject filename, SubLObject tmp_dir)
  {
    if( index == UNPROVIDED )
    {
      index = $nl_trie_subword_index$.getGlobalValue();
    }
    if( filename == UNPROVIDED )
    {
      filename = get_default_nl_trie_subword_cache_file_path( UNPROVIDED );
    }
    if( tmp_dir == UNPROVIDED )
    {
      tmp_dir = file_utilities.temp_directory();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Filesys.probe_file( tmp_dir ) )
    {
      Errors.error( Sequences.cconcatenate( $str46$Temp_directory__, new SubLObject[] { format_nil.format_nil_a_no_copy( tmp_dir ), $str47$__unavailable
      } ) );
    }
    final SubLObject fht = file_hash_table.fast_create_file_hash_table( filename, tmp_dir, Symbols.symbol_function( EQUALP ), $kw33$IMAGE_INDEPENDENT_CFASL );
    final SubLObject progress_message = Sequences.cconcatenate( $str48$Writing_nl_trie_subword_index_to_, format_nil.format_nil_s_no_copy( filename ) );
    SubLObject so_far = ZERO_INTEGER;
    final SubLObject total = dictionary.dictionary_length( index );
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
        utilities_macros.noting_percent_progress_preamble( progress_message );
        SubLObject iteration_state;
        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( index ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
            iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject subword = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject super_word_set = thread.secondMultipleValue();
          thread.resetMultipleValues();
          file_hash_table.fast_put_file_hash_table( subword, fht, super_word_set );
          so_far = Numbers.add( so_far, ONE_INTEGER );
          utilities_macros.note_percent_progress( so_far, total );
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      }
      finally
      {
        final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$56, thread );
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
    file_hash_table.finalize_fast_create_file_hash_table( fht, NIL, $kw49$USE_FIRST );
    return fht;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 15972L)
  public static SubLObject get_default_nl_trie_subword_cache_file_path(SubLObject kb)
  {
    if( kb == UNPROVIDED )
    {
      kb = control_vars.kb_loaded();
    }
    if( NIL != subl_promotions.positive_integer_p( kb ) && ( !$nl_trie_subword_fht_name$.getGlobalValue().isString() || NIL == Filesys.probe_file( $nl_trie_subword_fht_name$.getGlobalValue() ) ) )
    {
      $nl_trie_subword_fht_name$.setGlobalValue( dumper.kb_dump_product_file( $str39$nl_trie_subwords, misc_utilities.generic_caches_directory(), UNPROVIDED ) );
    }
    return $nl_trie_subword_fht_name$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-subword-index.lisp", position = 16359L)
  public static SubLObject test_subword_index(final SubLObject v_cycl_string)
  {
    final SubLObject utf8_string = cycl_string.cycl_string_to_utf8_string( v_cycl_string );
    SubLObject failed_subwords = NIL;
    reset_nl_trie_subword_index_for_string( v_cycl_string, NIL );
    SubLObject cdolist_list_var = Mapping.mapcar( $sym50$UTF8_STRING_TO_CYCL_SAFE_STRING, subwords( utf8_string ) );
    SubLObject subword = NIL;
    subword = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( subword.isString() && NIL == lexicon_subword_index_stop_wordP( subword ) && NIL == set_utilities.set_find( v_cycl_string, nl_trie_subword_index_search_set( subword, UNPROVIDED ), Symbols.symbol_function(
          EQUAL ), UNPROVIDED ) )
      {
        failed_subwords = ConsesLow.cons( subword, failed_subwords );
      }
      cdolist_list_var = cdolist_list_var.rest();
      subword = cdolist_list_var.first();
    }
    final SubLObject space_positions = list_utilities.all_positions( Characters.CHAR_space, utf8_string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject start_indices = ConsesLow.cons( ZERO_INTEGER, Mapping.mapcar( $sym51$1_, conses_high.butlast( space_positions, UNPROVIDED ) ) );
    SubLObject end_indices = list_utilities.add_to_end( NIL, space_positions.rest() );
    SubLObject cdolist_list_var2 = start_indices;
    SubLObject i = NIL;
    i = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject cdolist_list_var_$57 = end_indices;
      SubLObject j = NIL;
      j = cdolist_list_var_$57.first();
      while ( NIL != cdolist_list_var_$57)
      {
        final SubLObject subphrase = Sequences.subseq( utf8_string, i, j );
        final SubLObject cycl_subphrase = unicode_nauts.utf8_string_to_cycl_safe_string( subphrase );
        if( NIL == list_utilities.empty_list_p( subwords( subphrase ) ) && NIL == set_utilities.set_find( v_cycl_string, nl_trie_subword_index_search_set( cycl_subphrase, UNPROVIDED ), Symbols.symbol_function( EQUAL ),
            UNPROVIDED ) )
        {
          failed_subwords = ConsesLow.cons( cycl_subphrase, failed_subwords );
        }
        cdolist_list_var_$57 = cdolist_list_var_$57.rest();
        j = cdolist_list_var_$57.first();
      }
      end_indices = end_indices.rest();
      cdolist_list_var2 = cdolist_list_var2.rest();
      i = cdolist_list_var2.first();
    }
    reset_nl_trie_subword_index_for_string( v_cycl_string, T );
    return failed_subwords;
  }

  public static SubLObject declare_lexicon_subword_index_file()
  {
    SubLFiles.declareFunction( me, "nl_trie_subword_index_search", "NL-TRIE-SUBWORD-INDEX-SEARCH", 1, 1, false );
    SubLFiles.declareFunction( me, "get_nl_trie_subword_cache", "GET-NL-TRIE-SUBWORD-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_subword_index_existsP", "NL-TRIE-SUBWORD-INDEX-EXISTS?", 0, 0, false );
    SubLFiles.declareFunction( me, "maybe_initialize_nl_trie_subword_cache", "MAYBE-INITIALIZE-NL-TRIE-SUBWORD-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_subword_index_search_set", "NL-TRIE-SUBWORD-INDEX-SEARCH-SET", 1, 1, false );
    SubLFiles.declareFunction( me, "nl_trie_subword_index_search_set_low", "NL-TRIE-SUBWORD-INDEX-SEARCH-SET-LOW", 1, 1, false );
    SubLFiles.declareFunction( me, "subword_index_raw_search_set_internal", "SUBWORD-INDEX-RAW-SEARCH-SET-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "subword_index_raw_search_set", "SUBWORD-INDEX-RAW-SEARCH-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "denots_of_nl_trie_subword_index_search", "DENOTS-OF-NL-TRIE-SUBWORD-INDEX-SEARCH", 1, 2, false );
    SubLFiles.declareFunction( me, "subwords_internal", "SUBWORDS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "subwords", "SUBWORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "lexicon_subword_index_stop_wordP", "LEXICON-SUBWORD-INDEX-STOP-WORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "pivot_location_break_chars", "PIVOT-LOCATION-BREAK-CHARS", 0, 0, false );
    SubLFiles.declareFunction( me, "subword_index_break_char_p", "SUBWORD-INDEX-BREAK-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "add_non_trie_predicate_to_sub_word_index", "ADD-NON-TRIE-PREDICATE-TO-SUB-WORD-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_non_trie_predicate_from_sub_word_index", "REMOVE-NON-TRIE-PREDICATE-FROM-SUB-WORD-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_nl_trie_subword_index_for_string", "RESET-NL-TRIE-SUBWORD-INDEX-FOR-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "non_trie_subword_preds_internal", "NON-TRIE-SUBWORD-PREDS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "non_trie_subword_preds", "NON-TRIE-SUBWORD-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "non_trie_subword_pred_args", "NON-TRIE-SUBWORD-PRED-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "string_asserted_on_non_trie_subword_pred_arg_comboP", "STRING-ASSERTED-ON-NON-TRIE-SUBWORD-PRED-ARG-COMBO?", 1, 0, false );
    SubLFiles.declareFunction( me, "string_in_trieP_internal", "STRING-IN-TRIE?-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "string_in_trieP", "STRING-IN-TRIE?", 1, 1, false );
    SubLFiles.declareFunction( me, "initialize_nl_trie_subword_caches", "INITIALIZE-NL-TRIE-SUBWORD-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_nl_trie_subword_caches", "RESET-NL-TRIE-SUBWORD-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "build_nl_trie_subword_index", "BUILD-NL-TRIE-SUBWORD-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "index_sub_words", "INDEX-SUB-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "index_sub_words_for_pred_and_arg", "INDEX-SUB-WORDS-FOR-PRED-AND-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_entries_strings", "NL-TRIE-ENTRIES-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_nl_trie_subword_index", "DUMP-NL-TRIE-SUBWORD-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_nl_trie_subword_index_int", "DUMP-NL-TRIE-SUBWORD-INDEX-INT", 0, 3, false );
    SubLFiles.declareFunction( me, "get_default_nl_trie_subword_cache_file_path", "GET-DEFAULT-NL-TRIE-SUBWORD-CACHE-FILE-PATH", 0, 1, false );
    SubLFiles.declareFunction( me, "test_subword_index", "TEST-SUBWORD-INDEX", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_lexicon_subword_index_file()
  {
    $nl_trie_subword_fht_lock$ = SubLFiles.deflexical( "*NL-TRIE-SUBWORD-FHT-LOCK*", Locks.make_lock( $str0$nl_trie_subword_fht_lock ) );
    $nl_trie_subword_fht_name$ = SubLFiles.deflexical( "*NL-TRIE-SUBWORD-FHT-NAME*", NIL );
    $nl_trie_subword_cache$ = SubLFiles.deflexical( "*NL-TRIE-SUBWORD-CACHE*", NIL );
    $nl_trie_subword_index$ = SubLFiles.deflexical( "*NL-TRIE-SUBWORD-INDEX*", ( maybeDefault( $sym1$_NL_TRIE_SUBWORD_INDEX_, $nl_trie_subword_index$, NIL ) ) );
    $nl_trie_subword_cache_initialization_lock$ = SubLFiles.deflexical( "*NL-TRIE-SUBWORD-CACHE-INITIALIZATION-LOCK*", maybeDefault( $sym3$_NL_TRIE_SUBWORD_CACHE_INITIALIZATION_LOCK_,
        $nl_trie_subword_cache_initialization_lock$, () -> ( Locks.make_lock( $str4$_nl_trie_subword_cache_initializa ) ) ) );
    $pivot_location_break_chars$ = SubLFiles.deflexical( "*PIVOT-LOCATION-BREAK-CHARS*", $kw21$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_lexicon_subword_index_file()
  {
    subl_macro_promotions.declare_defglobal( $sym1$_NL_TRIE_SUBWORD_INDEX_ );
    subl_macro_promotions.declare_defglobal( $sym3$_NL_TRIE_SUBWORD_CACHE_INITIALIZATION_LOCK_ );
    memoization_state.note_memoized_function( $sym9$SUBWORD_INDEX_RAW_SEARCH_SET );
    memoization_state.note_memoized_function( $sym18$SUBWORDS );
    memoization_state.note_memoized_function( $sym29$NON_TRIE_SUBWORD_PREDS );
    memoization_state.note_memoized_function( $sym31$STRING_IN_TRIE_ );
    generic_testing.define_test_case_table_int( $sym52$TEST_SUBWORD_INDEX, ConsesLow.list( new SubLObject[] { $kw53$TEST, NIL, $kw54$OWNER, NIL, $kw55$CLASSES, NIL, $kw56$KB, $kw57$FULL, $kw58$WORKING_, T
    } ), $list59 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lexicon_subword_index_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lexicon_subword_index_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lexicon_subword_index_file();
  }
  static
  {
    me = new lexicon_subword_index();
    $nl_trie_subword_fht_lock$ = null;
    $nl_trie_subword_fht_name$ = null;
    $nl_trie_subword_cache$ = null;
    $nl_trie_subword_index$ = null;
    $nl_trie_subword_cache_initialization_lock$ = null;
    $pivot_location_break_chars$ = null;
    $str0$nl_trie_subword_fht_lock = makeString( "nl-trie-subword-fht-lock" );
    $sym1$_NL_TRIE_SUBWORD_INDEX_ = makeSymbol( "*NL-TRIE-SUBWORD-INDEX*" );
    $sym2$CYCL_STRING_P = makeSymbol( "CYCL-STRING-P" );
    $sym3$_NL_TRIE_SUBWORD_CACHE_INITIALIZATION_LOCK_ = makeSymbol( "*NL-TRIE-SUBWORD-CACHE-INITIALIZATION-LOCK*" );
    $str4$_nl_trie_subword_cache_initializa = makeString( "*nl-trie-subword-cache-initialization-lock*" );
    $str5$_S_is_not_an_ASCII_string_ = makeString( "~S is not an ASCII string." );
    $kw6$ON = makeKeyword( "ON" );
    $kw7$OFF = makeKeyword( "OFF" );
    $kw8$PREFERRED = makeKeyword( "PREFERRED" );
    $sym9$SUBWORD_INDEX_RAW_SEARCH_SET = makeSymbol( "SUBWORD-INDEX-RAW-SEARCH-SET" );
    $sym10$STRINGP = makeSymbol( "STRINGP" );
    $sym11$SUBWORD_INDEX_BREAK_CHAR_P = makeSymbol( "SUBWORD-INDEX-BREAK-CHAR-P" );
    $kw12$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $sym13$SET_P = makeSymbol( "SET-P" );
    $str14$Unexpected_result__S_from_SUBWORD = makeString( "Unexpected result ~S from SUBWORD-INDEX-RAW-SEARCH-SET" );
    $sym15$_EXIT = makeSymbol( "%EXIT" );
    $int16$1024 = makeInteger( 1024 );
    $kw17$DENOT = makeKeyword( "DENOT" );
    $sym18$SUBWORDS = makeSymbol( "SUBWORDS" );
    $sym19$LEXICON_SUBWORD_INDEX_STOP_WORD_ = makeSymbol( "LEXICON-SUBWORD-INDEX-STOP-WORD?" );
    $int20$1000 = makeInteger( 1000 );
    $kw21$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym22$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const23$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str24$Indexing_arg_ = makeString( "Indexing arg " );
    $str25$_of_ = makeString( " of " );
    $kw26$GAF = makeKeyword( "GAF" );
    $kw27$ADDED = makeKeyword( "ADDED" );
    $str28$Un_indexing_arg_ = makeString( "Un-indexing arg " );
    $sym29$NON_TRIE_SUBWORD_PREDS = makeSymbol( "NON-TRIE-SUBWORD-PREDS" );
    $const30$indexSubWordsForArg = constant_handles.reader_make_constant_shell( makeString( "indexSubWordsForArg" ) );
    $sym31$STRING_IN_TRIE_ = makeSymbol( "STRING-IN-TRIE?" );
    $int32$100 = makeInteger( 100 );
    $kw33$IMAGE_INDEPENDENT_CFASL = makeKeyword( "IMAGE-INDEPENDENT-CFASL" );
    $str34$Lexicon_not_yet_initialized = makeString( "Lexicon not yet initialized" );
    $str35$building_in_memory_NL_trie_subwor = makeString( "building in-memory NL trie subword index" );
    $list36 = ConsesLow.list( makeUninternedSymbol( "STRIE-DICT-KEY" ), makeUninternedSymbol( "STRIE-DICT-VALUE" ) );
    $list37 = ConsesLow.list( makeUninternedSymbol( "DICT-KEY" ), makeUninternedSymbol( "DICT-VALUE" ) );
    $kw38$INDEXED = makeKeyword( "INDEXED" );
    $str39$nl_trie_subwords = makeString( "nl-trie-subwords" );
    $str40$The_in_memory_NL_Trie_Subword_Ind = makeString( "The in-memory NL Trie Subword Index is not initialized and no cache attached--it will not be dumped!" );
    $sym41$SET_EMPTY_ = makeSymbol( "SET-EMPTY?" );
    $str42$Dumping_NL_Trie_Subword_Index_Cac = makeString( "Dumping NL Trie Subword Index Cache" );
    $str43$__Added__A_new_entries_to_the_NL_ = makeString( "~&Added ~A new entries to the NL trie subword index.~%" );
    $str44$__Deleted__A_entries_from_the_NL_ = makeString( "~&Deleted ~A entries from the NL trie subword index.~%" );
    $str45$__Modified__A_existing_entries_in = makeString( "~&Modified ~A existing entries in the NL trie subword index.~%" );
    $str46$Temp_directory__ = makeString( "Temp directory '" );
    $str47$__unavailable = makeString( "' unavailable" );
    $str48$Writing_nl_trie_subword_index_to_ = makeString( "Writing nl-trie-subword-index to file: " );
    $kw49$USE_FIRST = makeKeyword( "USE-FIRST" );
    $sym50$UTF8_STRING_TO_CYCL_SAFE_STRING = makeSymbol( "UTF8-STRING-TO-CYCL-SAFE-STRING" );
    $sym51$1_ = makeSymbol( "1+" );
    $sym52$TEST_SUBWORD_INDEX = makeSymbol( "TEST-SUBWORD-INDEX" );
    $kw53$TEST = makeKeyword( "TEST" );
    $kw54$OWNER = makeKeyword( "OWNER" );
    $kw55$CLASSES = makeKeyword( "CLASSES" );
    $kw56$KB = makeKeyword( "KB" );
    $kw57$FULL = makeKeyword( "FULL" );
    $kw58$WORKING_ = makeKeyword( "WORKING?" );
    $list59 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "The emu is a noble beast." ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "UnicodeStringFn" ) ), makeString( "foo &u41D;&u435;&u440;&u43E;&u43D; bar bam" ) ) ), NIL ) );
  }
}
/*
 * 
 * Total time: 631 ms
 * 
 */