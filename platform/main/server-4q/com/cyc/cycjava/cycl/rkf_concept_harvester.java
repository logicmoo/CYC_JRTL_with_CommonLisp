package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_concept_harvester
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_concept_harvester";
  public static final String myFingerPrint = "dae104ea522351f368fd51258e11e85754168376c98ea0c9cb4871f6260335b6";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3905L)
  private static SubLSymbol $rkf_ch_string_tokenize_internal_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 7572L)
  private static SubLSymbol $rkf_all_concept_harvester_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 7876L)
  private static SubLSymbol $rkf_active_concept_harvester_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 16190L)
  public static SubLSymbol $rkf_ch_template_parses_method$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 16653L)
  private static SubLSymbol $rkf_ch_template_parse_cache$;
  private static final SubLSymbol $sym0$STRINGP;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$TERM__;
  private static final SubLSymbol $sym3$CAAR;
  private static final SubLSymbol $sym4$_;
  private static final SubLSymbol $sym5$FIRST_LENGTH;
  private static final SubLSymbol $sym6$FORT_P;
  private static final SubLSymbol $sym7$ATOM;
  private static final SubLSymbol $sym8$CONSP;
  private static final SubLSymbol $sym9$NUM_INDEX;
  private static final SubLSymbol $sym10$RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED;
  private static final SubLSymbol $sym11$_RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED_CACHING_STATE_;
  private static final SubLInteger $int12$1000;
  private static final SubLInteger $int13$100;
  private static final SubLObject $const14$TheResultOfParsing;
  private static final SubLSymbol $sym15$RKF_CH_PARSING_SURROGATE_P;
  private static final SubLSymbol $sym16$RKF_CH_ASSEMBLE_PHRASE_P;
  private static final SubLSymbol $sym17$RKF_CH_SIMPLIFY_ONE_ASSEMBLE_PHRASE;
  private static final SubLObject $const18$AssemblePhraseFn;
  private static final SubLList $list19;
  private static final SubLString $str20$;
  private static final SubLString $str21$_;
  private static final SubLSymbol $sym22$CCONCATENATE;
  private static final SubLSymbol $sym23$FIRST;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$RKF_CH_INCLUDES_INVALID_SURROGATE;
  private static final SubLSymbol $sym26$SECOND;
  private static final SubLSymbol $sym27$RKF_CH_INCLUDES_INVALID_SURROGATE_INTERNAL;
  private static final SubLSymbol $sym28$_RKF_ALL_CONCEPT_HARVESTER_METHODS_;
  private static final SubLSymbol $sym29$_RKF_ACTIVE_CONCEPT_HARVESTER_METHODS_;
  private static final SubLSymbol $sym30$SYMBOLP;
  private static final SubLSymbol $sym31$RKF_CH_CYC_CONSTANTS;
  private static final SubLString $str32$Explicit_Cyc_constant_references_;
  private static final SubLSymbol $sym33$RKF_CH_INTEGERS;
  private static final SubLString $str34$Numbers_in_the_text___Examples___;
  private static final SubLSymbol $sym35$RKF_CH_DENOTS_OF_STRING;
  private static final SubLString $str36$Denotations_of_individual_words_i;
  private static final SubLSymbol $sym37$RKF_CH_MULTI_WORD_DENOTATION;
  private static final SubLString $str38$Denotations_for_the_entire_text_i;
  private static final SubLSymbol $sym39$RKF_CH_NOUN_COMPOUND_PHRASES;
  private static final SubLString $str40$Multi_word_phrases_from_the_lexic;
  private static final SubLSymbol $sym41$RKF_CH_NOUN_PHRASE_PARSES;
  private static final SubLString $str42$Noun_phrases_identified_using_a_n;
  private static final SubLSymbol $sym43$RKF_CH_TEMPLATE_PARSES;
  private static final SubLString $str44$Phrases_interpreted_by_a_Template;
  private static final SubLSymbol $sym45$ITP_SEQUEL;
  private static final SubLSymbol $sym46$_RKF_CH_TEMPLATE_PARSE_CACHE_;
  private static final SubLSymbol $kw47$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym48$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $kw49$INPUT;
  private static final SubLString $str50$Unable_to_open__S;
  private static final SubLSymbol $kw51$EOF;
  private static final SubLList $list52;
  private static final SubLList $list53;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 1016L)
  public static SubLObject rkf_concept_harvester(final SubLObject text)
  {
    assert NIL != Types.stringp( text ) : text;
    final SubLObject v_methods = rkf_active_concept_harvester_methods();
    SubLObject harvests = NIL;
    SubLObject cdolist_list_var = v_methods;
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( method.isSymbol() && NIL != Symbols.fboundp( method ) )
      {
        harvests = ConsesLow.cons( Functions.funcall( method, text ), harvests );
      }
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    harvests = Sequences.nreverse( harvests );
    SubLObject harvest = rkf_ch_unify_harvests( harvests );
    harvest = rkf_ch_filter_invalid_surrogates( harvest );
    return harvest;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 1636L)
  public static SubLObject rkf_ch_unify_harvests(final SubLObject harvests)
  {
    final SubLObject token_table = Hashtables.make_hash_table( TWENTY_INTEGER, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = harvests;
    SubLObject harvest = NIL;
    harvest = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = harvest;
      SubLObject harvest_item = NIL;
      harvest_item = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        SubLObject current;
        final SubLObject datum = current = harvest_item;
        SubLObject token_list = NIL;
        SubLObject cycl_list = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
        token_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
        cycl_list = current.first();
        current = current.rest();
        if( NIL == current )
        {
          SubLObject existing = Hashtables.gethash( token_list, token_table, UNPROVIDED );
          SubLObject cdolist_list_var_$2 = cycl_list;
          SubLObject cycl = NIL;
          cycl = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            final SubLObject item_var;
            cycl = ( item_var = narts_high.nart_expand( cycl ) );
            if( NIL == conses_high.member( item_var, existing, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              existing = ConsesLow.cons( item_var, existing );
            }
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            cycl = cdolist_list_var_$2.first();
          }
          Hashtables.sethash( token_list, token_table, existing );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        harvest_item = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      harvest = cdolist_list_var.first();
    }
    SubLObject unified_harvest = NIL;
    SubLObject token_list2 = NIL;
    SubLObject cycl_list2 = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( token_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        token_list2 = Hashtables.getEntryKey( cdohash_entry );
        cycl_list2 = Hashtables.getEntryValue( cdohash_entry );
        cycl_list2 = rkf_ch_sort_cycl_terms( cycl_list2 );
        unified_harvest = ConsesLow.cons( ConsesLow.list( token_list2, cycl_list2 ), unified_harvest );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    unified_harvest = Sort.sort( unified_harvest, Symbols.symbol_function( $sym2$TERM__ ), Symbols.symbol_function( $sym3$CAAR ) );
    unified_harvest = Sort.stable_sort( unified_harvest, Symbols.symbol_function( $sym4$_ ), Symbols.symbol_function( $sym5$FIRST_LENGTH ) );
    return unified_harvest;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 2513L)
  public static SubLObject first_length(final SubLObject v_object)
  {
    return Sequences.length( v_object.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 2599L)
  public static SubLObject rkf_ch_sort_cycl_terms(final SubLObject terms)
  {
    SubLObject v_forts = list_utilities.remove_if_not( Symbols.symbol_function( $sym6$FORT_P ), terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject non_forts = Sequences.remove_if( Symbols.symbol_function( $sym6$FORT_P ), terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject conses = Sequences.remove_if( Symbols.symbol_function( $sym7$ATOM ), non_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject atoms = Sequences.remove_if( Symbols.symbol_function( $sym8$CONSP ), non_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    atoms = Sort.sort( atoms, Symbols.symbol_function( $sym2$TERM__ ), UNPROVIDED );
    v_forts = Sort.sort( v_forts, Symbols.symbol_function( $sym4$_ ), Symbols.symbol_function( $sym9$NUM_INDEX ) );
    conses = Sort.sort( conses, Symbols.symbol_function( $sym2$TERM__ ), UNPROVIDED );
    return ConsesLow.nconc( atoms, v_forts, conses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 2988L)
  public static SubLObject rkf_ch_string_tokenize(final SubLObject string)
  {
    return rkf_ch_string_tokenize_internal_cached( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3489L)
  public static SubLObject rkf_ch_raw_tokenization(final SubLObject string)
  {
    return standard_tokenization.standard_raw_tokenization( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3652L)
  public static SubLObject rkf_ch_token_chunker(final SubLObject raw_tokenization)
  {
    return standard_tokenization.standard_token_chunker( raw_tokenization );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3905L)
  public static SubLObject clear_rkf_ch_string_tokenize_internal_cached()
  {
    final SubLObject cs = $rkf_ch_string_tokenize_internal_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3905L)
  public static SubLObject remove_rkf_ch_string_tokenize_internal_cached(final SubLObject string)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rkf_ch_string_tokenize_internal_cached_caching_state$.getGlobalValue(), ConsesLow.list( string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3905L)
  public static SubLObject rkf_ch_string_tokenize_internal_cached_internal(final SubLObject string)
  {
    return rkf_ch_string_tokenize_internal( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3905L)
  public static SubLObject rkf_ch_string_tokenize_internal_cached(final SubLObject string)
  {
    SubLObject caching_state = $rkf_ch_string_tokenize_internal_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym10$RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED, $sym11$_RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED_CACHING_STATE_, $int12$1000, EQUAL, ONE_INTEGER,
          $int13$100 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rkf_ch_string_tokenize_internal_cached_internal( string ) ) );
      memoization_state.caching_state_put( caching_state, string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4063L)
  public static SubLObject rkf_ch_string_tokenize_internal(final SubLObject string)
  {
    final SubLObject raw_tokenization = rkf_ch_raw_tokenization( string );
    final SubLObject chunked_tokenization = rkf_ch_token_chunker( raw_tokenization );
    return chunked_tokenization;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4281L)
  public static SubLObject rkf_ch_parsing_surrogate_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && $const14$TheResultOfParsing.eql( v_object.first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4478L)
  public static SubLObject rkf_ch_gather_parsing_surrogates(final SubLObject v_object)
  {
    return list_utilities.tree_gather( v_object, Symbols.symbol_function( $sym15$RKF_CH_PARSING_SURROGATE_P ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4603L)
  public static SubLObject rkf_ch_parsing_surrogate_token_index_list(final SubLObject surrogate)
  {
    return cycl_utilities.formula_args( cycl_utilities.formula_arg2( surrogate, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4722L)
  public static SubLObject rkf_ch_simplify_assemble_phrases(final SubLObject v_object)
  {
    return Values.values( transform_list_utilities.transform( v_object, Symbols.symbol_function( $sym16$RKF_CH_ASSEMBLE_PHRASE_P ), Symbols.symbol_function( $sym17$RKF_CH_SIMPLIFY_ONE_ASSEMBLE_PHRASE ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4959L)
  public static SubLObject rkf_ch_assemble_phrase_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && $const18$AssemblePhraseFn.eql( v_object.first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 5107L)
  public static SubLObject rkf_ch_simplify_one_assemble_phrase(final SubLObject v_object)
  {
    SubLObject assemble_phrase_fn = NIL;
    SubLObject string_parts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( v_object, v_object, $list19 );
    assemble_phrase_fn = v_object.first();
    final SubLObject current = string_parts = v_object.rest();
    if( NIL == string_parts )
    {
      return $str20$;
    }
    if( NIL != list_utilities.singletonP( string_parts ) )
    {
      return string_parts.first();
    }
    SubLObject new_string_parts = NIL;
    SubLObject cdolist_list_var = string_parts;
    SubLObject string_part = NIL;
    string_part = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !string_part.eql( string_parts.first() ) )
      {
        new_string_parts = ConsesLow.cons( $str21$_, new_string_parts );
      }
      new_string_parts = ConsesLow.cons( string_part, new_string_parts );
      cdolist_list_var = cdolist_list_var.rest();
      string_part = cdolist_list_var.first();
    }
    new_string_parts = Sequences.nreverse( new_string_parts );
    return Functions.apply( Symbols.symbol_function( $sym22$CCONCATENATE ), new_string_parts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 5700L)
  public static SubLObject rkf_ch_filter_invalid_surrogates(SubLObject harvest)
  {
    for( SubLObject invalid_surrogates = rkf_ch_gather_invalid_surrogates( harvest ); NIL != invalid_surrogates; invalid_surrogates = rkf_ch_gather_invalid_surrogates( harvest ) )
    {
      harvest = rkf_ch_delete_invalid_surrogates( harvest, invalid_surrogates );
    }
    return harvest;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 6228L)
  public static SubLObject rkf_ch_gather_invalid_surrogates(final SubLObject harvest)
  {
    final SubLObject valid_harvest_token_index_lists = Mapping.mapcar( Symbols.symbol_function( $sym23$FIRST ), harvest );
    SubLObject invalid_surrogates = NIL;
    SubLObject cdolist_list_var = harvest;
    SubLObject harvest_item = NIL;
    harvest_item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = harvest_item;
      SubLObject index_list = NIL;
      SubLObject cycl_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      index_list = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
      cycl_list = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$3 = cycl_list;
        SubLObject cycl = NIL;
        cycl = cdolist_list_var_$3.first();
        while ( NIL != cdolist_list_var_$3)
        {
          SubLObject cdolist_list_var_$4;
          final SubLObject surrogates = cdolist_list_var_$4 = rkf_ch_gather_parsing_surrogates( cycl );
          SubLObject surrogate = NIL;
          surrogate = cdolist_list_var_$4.first();
          while ( NIL != cdolist_list_var_$4)
          {
            final SubLObject token_index_list = rkf_ch_parsing_surrogate_token_index_list( surrogate );
            if( NIL == subl_promotions.memberP( token_index_list, valid_harvest_token_index_lists, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
            {
              final SubLObject item_var = surrogate;
              if( NIL == conses_high.member( item_var, invalid_surrogates, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                invalid_surrogates = ConsesLow.cons( item_var, invalid_surrogates );
              }
            }
            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
            surrogate = cdolist_list_var_$4.first();
          }
          cdolist_list_var_$3 = cdolist_list_var_$3.rest();
          cycl = cdolist_list_var_$3.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      harvest_item = cdolist_list_var.first();
    }
    return Sequences.nreverse( invalid_surrogates );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 6899L)
  public static SubLObject rkf_ch_delete_invalid_surrogates(SubLObject harvest, final SubLObject invalid_surrogates)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding( thread );
    try
    {
      control_vars.$mapping_target$.bind( invalid_surrogates, thread );
      SubLObject cdolist_list_var = harvest;
      SubLObject harvest_item = NIL;
      harvest_item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = harvest_item;
        SubLObject index_list = NIL;
        SubLObject cycl_list = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        index_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        cycl_list = current.first();
        current = current.rest();
        if( NIL == current )
        {
          ConsesLow.set_nth( ONE_INTEGER, harvest_item, Sequences.delete_if( Symbols.symbol_function( $sym25$RKF_CH_INCLUDES_INVALID_SURROGATE ), cycl_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        harvest_item = cdolist_list_var.first();
      }
    }
    finally
    {
      control_vars.$mapping_target$.rebind( _prev_bind_0, thread );
    }
    harvest = Sequences.delete( NIL, harvest, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym26$SECOND ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return harvest;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 7316L)
  public static SubLObject rkf_ch_includes_invalid_surrogate(final SubLObject v_object)
  {
    return list_utilities.tree_find_if( Symbols.symbol_function( $sym27$RKF_CH_INCLUDES_INVALID_SURROGATE_INTERNAL ), v_object, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 7452L)
  public static SubLObject rkf_ch_includes_invalid_surrogate_internal(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( v_object, control_vars.$mapping_target$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 8000L)
  public static SubLObject rkf_all_concept_harvester_methods()
  {
    return Sequences.nreverse( Mapping.mapcar( Symbols.symbol_function( $sym23$FIRST ), $rkf_all_concept_harvester_methods$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 8126L)
  public static SubLObject rkf_register_concept_harvester_method(final SubLObject symbol, final SubLObject description)
  {
    assert NIL != Types.symbolp( symbol ) : symbol;
    assert NIL != Types.stringp( description ) : description;
    rkf_deregister_concept_harvester_method( symbol );
    $rkf_all_concept_harvester_methods$.setGlobalValue( ConsesLow.cons( ConsesLow.list( symbol, description ), $rkf_all_concept_harvester_methods$.getGlobalValue() ) );
    return symbol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 8446L)
  public static SubLObject rkf_deregister_concept_harvester_method(final SubLObject symbol)
  {
    assert NIL != Types.symbolp( symbol ) : symbol;
    $rkf_all_concept_harvester_methods$.setGlobalValue( Sequences.delete( symbol, $rkf_all_concept_harvester_methods$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym23$FIRST ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) );
    return symbol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 8671L)
  public static SubLObject rkf_concept_harvester_method_description(final SubLObject symbol)
  {
    assert NIL != Types.symbolp( symbol ) : symbol;
    return conses_high.second( conses_high.assoc( symbol, $rkf_all_concept_harvester_methods$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 8836L)
  public static SubLObject rkf_active_concept_harvester_methods()
  {
    return Sequences.nreverse( Sequences.remove_duplicates( conses_high.copy_list( $rkf_active_concept_harvester_methods$.getGlobalValue() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 9095L)
  public static SubLObject rkf_note_active_concept_harvester_method(final SubLObject method)
  {
    if( NIL != Sequences.find( method, $rkf_all_concept_harvester_methods$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym23$FIRST ), UNPROVIDED, UNPROVIDED ) )
    {
      $rkf_active_concept_harvester_methods$.setGlobalValue( ConsesLow.cons( method, $rkf_active_concept_harvester_methods$.getGlobalValue() ) );
    }
    return method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 9309L)
  public static SubLObject rkf_set_active_concept_harvester_methods(final SubLObject v_methods)
  {
    $rkf_active_concept_harvester_methods$.setGlobalValue( NIL );
    SubLObject cdolist_list_var = v_methods;
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      rkf_note_active_concept_harvester_method( method );
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    return Sequences.length( $rkf_active_concept_harvester_methods$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 10024L)
  public static SubLObject rkf_ch_cyc_constants(final SubLObject text)
  {
    assert NIL != Types.stringp( text ) : text;
    SubLObject harvest = NIL;
    final SubLObject tokens = rkf_ch_string_tokenize( text );
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != string_utilities.string_starts_with_constant_reader_prefix_p( token ) )
      {
        final SubLObject constant = constant_completion_high.constant_complete_exact( token, TWO_INTEGER, UNPROVIDED );
        if( NIL != constant_handles.valid_constantP( constant, UNPROVIDED ) )
        {
          harvest = ConsesLow.cons( ConsesLow.list( ConsesLow.list( index ), ConsesLow.list( constant ) ), harvest );
        }
      }
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    return Sequences.nreverse( harvest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 10769L)
  public static SubLObject rkf_ch_integers(final SubLObject text)
  {
    assert NIL != Types.stringp( text ) : text;
    SubLObject harvest = NIL;
    final SubLObject tokens = rkf_ch_string_tokenize( text );
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject number = number_utilities.number_string_value( token );
      if( number.isNumber() )
      {
        harvest = ConsesLow.cons( ConsesLow.list( ConsesLow.list( index ), ConsesLow.list( number ) ), harvest );
      }
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    return Sequences.nreverse( harvest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 11455L)
  public static SubLObject rkf_ch_denots_of_string(final SubLObject text, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return rkf_ch_denotations_for_string( text, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 11567L)
  public static SubLObject rkf_ch_denotations_for_string(final SubLObject text, SubLObject mt, SubLObject pos)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( pos == UNPROVIDED )
    {
      pos = NIL;
    }
    assert NIL != Types.stringp( text ) : text;
    SubLObject harvest = NIL;
    final SubLObject tokens = rkf_ch_string_tokenize( text );
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject possible_cycl = rkf_ch_denots_of_string_internal( token, mt, pos );
      if( NIL != possible_cycl )
      {
        final SubLObject item_var = ConsesLow.list( ConsesLow.list( index ), possible_cycl );
        if( NIL == conses_high.member( item_var, harvest, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          harvest = ConsesLow.cons( item_var, harvest );
        }
      }
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    return Sequences.nreverse( harvest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 12027L)
  public static SubLObject rkf_ch_denots_of_string_internal(final SubLObject token, final SubLObject mt, final SubLObject pos)
  {
    if( NIL == rkf_ch_denots_of_string_stop_word( token ) )
    {
      SubLObject result = NIL;
      if( !Sequences.length( token ).numL( TWO_INTEGER ) )
      {
        if( NIL == mt )
        {
          result = lexicon_accessors.all_parsing_denots_of_string( token, T, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          result = lexicon_accessors.all_parsing_denots_of_string( token, T, mt, UNPROVIDED );
        }
      }
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 12606L)
  public static SubLObject rkf_ch_denots_of_string_stop_word(final SubLObject token)
  {
    return lexicon_utilities.denots_of_string_stop_word( token );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 13075L)
  public static SubLObject rkf_ch_multi_word_denotation(final SubLObject text)
  {
    return rkf_ch_denotations_from_multi_word_string( text, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 13186L)
  public static SubLObject rkf_ch_denotations_from_multi_word_string(final SubLObject text, SubLObject mt, SubLObject pos)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( pos == UNPROVIDED )
    {
      pos = NIL;
    }
    assert NIL != Types.stringp( text ) : text;
    SubLObject harvest = NIL;
    final SubLObject tokens = rkf_ch_string_tokenize( text );
    if( NIL == list_utilities.singletonP( tokens ) )
    {
      final SubLObject complete_denotations = rkf_ch_denotations_int( text, mt );
      if( NIL != complete_denotations )
      {
        final SubLObject token_list = parsing_utilities.token_list_from_span( ZERO_INTEGER, Sequences.length( tokens ) );
        harvest = ConsesLow.list( ConsesLow.list( token_list, complete_denotations ) );
      }
    }
    return harvest;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 13700L)
  public static SubLObject rkf_ch_denotations_int(final SubLObject text, final SubLObject mt)
  {
    SubLObject denotations = NIL;
    if( NIL == mt )
    {
      denotations = lexicon_accessors.all_parsing_denots_of_string( text, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      denotations = lexicon_accessors.all_parsing_denots_of_string( text, T, mt, UNPROVIDED );
    }
    return denotations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 14322L)
  public static SubLObject rkf_ch_noun_compound_phrases(final SubLObject text, SubLObject mt, SubLObject pos)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( pos == UNPROVIDED )
    {
      pos = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( text ) : text;
    SubLObject harvest = NIL;
    if( NIL == mt )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread );
    }
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject interval_tokens = cdolist_list_var = ( NIL != nl_trie.nl_trie_presentP( UNPROVIDED ) ) ? np_parser.npp_sentence_tokenize( text, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
      SubLObject interval_token = NIL;
      interval_token = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject parse = standard_tokenization.interval_token_value( interval_token );
        final SubLObject denots = Sequences.remove_duplicates( Mapping.mapcar( Symbols.symbol_function( $sym23$FIRST ), standard_tokenization.string_token_value( parse ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED );
        if( NIL != denots )
        {
          final SubLObject start_index = standard_tokenization.interval_token_start( interval_token );
          final SubLObject end_index = standard_tokenization.interval_token_end( interval_token );
          final SubLObject span_length = Numbers.subtract( end_index, start_index );
          if( !span_length.numL( TWO_INTEGER ) )
          {
            final SubLObject index_list = parsing_utilities.token_list_from_span( start_index, end_index );
            harvest = ConsesLow.cons( ConsesLow.list( index_list, denots ), harvest );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        interval_token = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( harvest );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 15276L)
  public static SubLObject rkf_ch_noun_compound_phrase_parser(final SubLObject text, final SubLObject mt, SubLObject pos)
  {
    if( pos == UNPROVIDED )
    {
      pos = NIL;
    }
    return rkf_ch_noun_compound_phrases( text, mt, pos );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 15691L)
  public static SubLObject rkf_ch_noun_phrase_parses(final SubLObject text)
  {
    assert NIL != Types.stringp( text ) : text;
    SubLObject harvest = NIL;
    harvest = psp_main.ps_harvest_nps( text, T, UNPROVIDED );
    return harvest;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 16403L)
  public static SubLObject rkf_ch_template_parses(final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( text ) : text;
    SubLObject harvest = NIL;
    if( $rkf_ch_template_parses_method$.getDynamicValue( thread ).isFunctionSpec() )
    {
      harvest = Functions.funcall( $rkf_ch_template_parses_method$.getDynamicValue( thread ), text );
    }
    return harvest;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 16826L)
  public static SubLObject rkf_ch_template_parse_cache_lookup(final SubLObject text)
  {
    assert NIL != Types.stringp( text ) : text;
    if( NIL != $rkf_ch_template_parse_cache$.getGlobalValue() )
    {
      final SubLObject tokens = rkf_ch_string_tokenize( text );
      final SubLObject harvest = Hashtables.gethash( tokens, $rkf_ch_template_parse_cache$.getGlobalValue(), NIL );
      return conses_high.copy_tree( harvest );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 17103L)
  public static SubLObject rkf_ch_initialize_template_parse_cache(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( filename ) : filename;
    if( NIL != Filesys.probe_file( filename ) )
    {
      SubLObject cache_items = NIL;
      SubLObject cache_item = NIL;
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw47$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym48$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            SubLObject stream = NIL;
            try
            {
              stream = compatibility.open_text( filename, $kw49$INPUT );
              if( !stream.isStream() )
              {
                Errors.error( $str50$Unable_to_open__S, filename );
              }
              final SubLObject stream_$5 = stream;
              while ( $kw51$EOF != cache_item)
              {
                cache_item = reader.read( stream_$5, NIL, $kw51$EOF, UNPROVIDED );
                if( $kw51$EOF != cache_item )
                {
                  cache_items = ConsesLow.cons( cache_item, cache_items );
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
              }
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw47$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != cache_items )
      {
        final SubLObject v_cache = Hashtables.make_hash_table( Sequences.length( cache_items ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
        SubLObject cdolist_list_var = cache_items;
        SubLObject cache_item_$7 = NIL;
        cache_item_$7 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = cache_item_$7;
          SubLObject sentence = NIL;
          SubLObject harvest_specs = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
          sentence = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
          harvest_specs = current.first();
          current = current.rest();
          if( NIL == current )
          {
            SubLObject harvest = NIL;
            final SubLObject tokens = rkf_ch_string_tokenize( sentence );
            SubLObject cdolist_list_var_$8 = harvest_specs;
            SubLObject harvest_spec = NIL;
            harvest_spec = cdolist_list_var_$8.first();
            while ( NIL != cdolist_list_var_$8)
            {
              SubLObject current_$10;
              final SubLObject datum_$9 = current_$10 = harvest_spec;
              SubLObject index_list = NIL;
              SubLObject cycl = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$10, datum_$9, $list53 );
              index_list = current_$10.first();
              current_$10 = current_$10.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$10, datum_$9, $list53 );
              cycl = current_$10.first();
              current_$10 = current_$10.rest();
              if( NIL == current_$10 )
              {
                harvest = ConsesLow.cons( ConsesLow.list( index_list, ConsesLow.list( cycl ) ), harvest );
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$9, $list53 );
              }
              cdolist_list_var_$8 = cdolist_list_var_$8.rest();
              harvest_spec = cdolist_list_var_$8.first();
            }
            harvest = Sequences.nreverse( harvest );
            Hashtables.sethash( tokens, v_cache, harvest );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list52 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          cache_item_$7 = cdolist_list_var.first();
        }
        $rkf_ch_template_parse_cache$.setGlobalValue( v_cache );
        return T;
      }
    }
    return NIL;
  }

  public static SubLObject declare_rkf_concept_harvester_file()
  {
    SubLFiles.declareFunction( me, "rkf_concept_harvester", "RKF-CONCEPT-HARVESTER", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_unify_harvests", "RKF-CH-UNIFY-HARVESTS", 1, 0, false );
    SubLFiles.declareFunction( me, "first_length", "FIRST-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_sort_cycl_terms", "RKF-CH-SORT-CYCL-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_string_tokenize", "RKF-CH-STRING-TOKENIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_raw_tokenization", "RKF-CH-RAW-TOKENIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_token_chunker", "RKF-CH-TOKEN-CHUNKER", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_rkf_ch_string_tokenize_internal_cached", "CLEAR-RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rkf_ch_string_tokenize_internal_cached", "REMOVE-RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_string_tokenize_internal_cached_internal", "RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_string_tokenize_internal_cached", "RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_string_tokenize_internal", "RKF-CH-STRING-TOKENIZE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_parsing_surrogate_p", "RKF-CH-PARSING-SURROGATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_gather_parsing_surrogates", "RKF-CH-GATHER-PARSING-SURROGATES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_parsing_surrogate_token_index_list", "RKF-CH-PARSING-SURROGATE-TOKEN-INDEX-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_simplify_assemble_phrases", "RKF-CH-SIMPLIFY-ASSEMBLE-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_assemble_phrase_p", "RKF-CH-ASSEMBLE-PHRASE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_simplify_one_assemble_phrase", "RKF-CH-SIMPLIFY-ONE-ASSEMBLE-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_filter_invalid_surrogates", "RKF-CH-FILTER-INVALID-SURROGATES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_gather_invalid_surrogates", "RKF-CH-GATHER-INVALID-SURROGATES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_delete_invalid_surrogates", "RKF-CH-DELETE-INVALID-SURROGATES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_includes_invalid_surrogate", "RKF-CH-INCLUDES-INVALID-SURROGATE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_includes_invalid_surrogate_internal", "RKF-CH-INCLUDES-INVALID-SURROGATE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_all_concept_harvester_methods", "RKF-ALL-CONCEPT-HARVESTER-METHODS", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_register_concept_harvester_method", "RKF-REGISTER-CONCEPT-HARVESTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_deregister_concept_harvester_method", "RKF-DEREGISTER-CONCEPT-HARVESTER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_concept_harvester_method_description", "RKF-CONCEPT-HARVESTER-METHOD-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_active_concept_harvester_methods", "RKF-ACTIVE-CONCEPT-HARVESTER-METHODS", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_note_active_concept_harvester_method", "RKF-NOTE-ACTIVE-CONCEPT-HARVESTER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_set_active_concept_harvester_methods", "RKF-SET-ACTIVE-CONCEPT-HARVESTER-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_cyc_constants", "RKF-CH-CYC-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_integers", "RKF-CH-INTEGERS", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_denots_of_string", "RKF-CH-DENOTS-OF-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_ch_denotations_for_string", "RKF-CH-DENOTATIONS-FOR-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "rkf_ch_denots_of_string_internal", "RKF-CH-DENOTS-OF-STRING-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_denots_of_string_stop_word", "RKF-CH-DENOTS-OF-STRING-STOP-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_multi_word_denotation", "RKF-CH-MULTI-WORD-DENOTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_denotations_from_multi_word_string", "RKF-CH-DENOTATIONS-FROM-MULTI-WORD-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "rkf_ch_denotations_int", "RKF-CH-DENOTATIONS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_noun_compound_phrases", "RKF-CH-NOUN-COMPOUND-PHRASES", 1, 2, false );
    SubLFiles.declareFunction( me, "rkf_ch_noun_compound_phrase_parser", "RKF-CH-NOUN-COMPOUND-PHRASE-PARSER", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_ch_noun_phrase_parses", "RKF-CH-NOUN-PHRASE-PARSES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_template_parses", "RKF-CH-TEMPLATE-PARSES", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_template_parse_cache_lookup", "RKF-CH-TEMPLATE-PARSE-CACHE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_ch_initialize_template_parse_cache", "RKF-CH-INITIALIZE-TEMPLATE-PARSE-CACHE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_concept_harvester_file()
  {
    $rkf_ch_string_tokenize_internal_cached_caching_state$ = SubLFiles.deflexical( "*RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED-CACHING-STATE*", NIL );
    $rkf_all_concept_harvester_methods$ = SubLFiles.deflexical( "*RKF-ALL-CONCEPT-HARVESTER-METHODS*", ( maybeDefault( $sym28$_RKF_ALL_CONCEPT_HARVESTER_METHODS_, $rkf_all_concept_harvester_methods$, NIL ) ) );
    $rkf_active_concept_harvester_methods$ = SubLFiles.deflexical( "*RKF-ACTIVE-CONCEPT-HARVESTER-METHODS*", ( maybeDefault( $sym29$_RKF_ACTIVE_CONCEPT_HARVESTER_METHODS_, $rkf_active_concept_harvester_methods$,
        NIL ) ) );
    $rkf_ch_template_parses_method$ = SubLFiles.defparameter( "*RKF-CH-TEMPLATE-PARSES-METHOD*", $sym45$ITP_SEQUEL );
    $rkf_ch_template_parse_cache$ = SubLFiles.deflexical( "*RKF-CH-TEMPLATE-PARSE-CACHE*", ( maybeDefault( $sym46$_RKF_CH_TEMPLATE_PARSE_CACHE_, $rkf_ch_template_parse_cache$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_rkf_concept_harvester_file()
  {
    memoization_state.note_globally_cached_function( $sym10$RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED );
    subl_macro_promotions.declare_defglobal( $sym28$_RKF_ALL_CONCEPT_HARVESTER_METHODS_ );
    subl_macro_promotions.declare_defglobal( $sym29$_RKF_ACTIVE_CONCEPT_HARVESTER_METHODS_ );
    rkf_register_concept_harvester_method( $sym31$RKF_CH_CYC_CONSTANTS, $str32$Explicit_Cyc_constant_references_ );
    rkf_note_active_concept_harvester_method( $sym31$RKF_CH_CYC_CONSTANTS );
    rkf_register_concept_harvester_method( $sym33$RKF_CH_INTEGERS, $str34$Numbers_in_the_text___Examples___ );
    rkf_note_active_concept_harvester_method( $sym33$RKF_CH_INTEGERS );
    rkf_register_concept_harvester_method( $sym35$RKF_CH_DENOTS_OF_STRING, $str36$Denotations_of_individual_words_i );
    rkf_note_active_concept_harvester_method( $sym35$RKF_CH_DENOTS_OF_STRING );
    rkf_register_concept_harvester_method( $sym37$RKF_CH_MULTI_WORD_DENOTATION, $str38$Denotations_for_the_entire_text_i );
    rkf_note_active_concept_harvester_method( $sym37$RKF_CH_MULTI_WORD_DENOTATION );
    rkf_register_concept_harvester_method( $sym39$RKF_CH_NOUN_COMPOUND_PHRASES, $str40$Multi_word_phrases_from_the_lexic );
    rkf_note_active_concept_harvester_method( $sym39$RKF_CH_NOUN_COMPOUND_PHRASES );
    rkf_register_concept_harvester_method( $sym41$RKF_CH_NOUN_PHRASE_PARSES, $str42$Noun_phrases_identified_using_a_n );
    rkf_note_active_concept_harvester_method( $sym41$RKF_CH_NOUN_PHRASE_PARSES );
    rkf_register_concept_harvester_method( $sym43$RKF_CH_TEMPLATE_PARSES, $str44$Phrases_interpreted_by_a_Template );
    rkf_note_active_concept_harvester_method( $sym43$RKF_CH_TEMPLATE_PARSES );
    subl_macro_promotions.declare_defglobal( $sym46$_RKF_CH_TEMPLATE_PARSE_CACHE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_concept_harvester_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_concept_harvester_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_concept_harvester_file();
  }
  static
  {
    me = new rkf_concept_harvester();
    $rkf_ch_string_tokenize_internal_cached_caching_state$ = null;
    $rkf_all_concept_harvester_methods$ = null;
    $rkf_active_concept_harvester_methods$ = null;
    $rkf_ch_template_parses_method$ = null;
    $rkf_ch_template_parse_cache$ = null;
    $sym0$STRINGP = makeSymbol( "STRINGP" );
    $list1 = ConsesLow.list( makeSymbol( "TOKEN-LIST" ), makeSymbol( "CYCL-LIST" ) );
    $sym2$TERM__ = makeSymbol( "TERM-<" );
    $sym3$CAAR = makeSymbol( "CAAR" );
    $sym4$_ = makeSymbol( ">" );
    $sym5$FIRST_LENGTH = makeSymbol( "FIRST-LENGTH" );
    $sym6$FORT_P = makeSymbol( "FORT-P" );
    $sym7$ATOM = makeSymbol( "ATOM" );
    $sym8$CONSP = makeSymbol( "CONSP" );
    $sym9$NUM_INDEX = makeSymbol( "NUM-INDEX" );
    $sym10$RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED = makeSymbol( "RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED" );
    $sym11$_RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED_CACHING_STATE_ = makeSymbol( "*RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED-CACHING-STATE*" );
    $int12$1000 = makeInteger( 1000 );
    $int13$100 = makeInteger( 100 );
    $const14$TheResultOfParsing = constant_handles.reader_make_constant_shell( makeString( "TheResultOfParsing" ) );
    $sym15$RKF_CH_PARSING_SURROGATE_P = makeSymbol( "RKF-CH-PARSING-SURROGATE-P" );
    $sym16$RKF_CH_ASSEMBLE_PHRASE_P = makeSymbol( "RKF-CH-ASSEMBLE-PHRASE-P" );
    $sym17$RKF_CH_SIMPLIFY_ONE_ASSEMBLE_PHRASE = makeSymbol( "RKF-CH-SIMPLIFY-ONE-ASSEMBLE-PHRASE" );
    $const18$AssemblePhraseFn = constant_handles.reader_make_constant_shell( makeString( "AssemblePhraseFn" ) );
    $list19 = ConsesLow.cons( makeSymbol( "ASSEMBLE-PHRASE-FN" ), makeSymbol( "STRING-PARTS" ) );
    $str20$ = makeString( "" );
    $str21$_ = makeString( " " );
    $sym22$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym23$FIRST = makeSymbol( "FIRST" );
    $list24 = ConsesLow.list( makeSymbol( "INDEX-LIST" ), makeSymbol( "CYCL-LIST" ) );
    $sym25$RKF_CH_INCLUDES_INVALID_SURROGATE = makeSymbol( "RKF-CH-INCLUDES-INVALID-SURROGATE" );
    $sym26$SECOND = makeSymbol( "SECOND" );
    $sym27$RKF_CH_INCLUDES_INVALID_SURROGATE_INTERNAL = makeSymbol( "RKF-CH-INCLUDES-INVALID-SURROGATE-INTERNAL" );
    $sym28$_RKF_ALL_CONCEPT_HARVESTER_METHODS_ = makeSymbol( "*RKF-ALL-CONCEPT-HARVESTER-METHODS*" );
    $sym29$_RKF_ACTIVE_CONCEPT_HARVESTER_METHODS_ = makeSymbol( "*RKF-ACTIVE-CONCEPT-HARVESTER-METHODS*" );
    $sym30$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym31$RKF_CH_CYC_CONSTANTS = makeSymbol( "RKF-CH-CYC-CONSTANTS" );
    $str32$Explicit_Cyc_constant_references_ = makeString( "Explicit Cyc constant references like #$Dog.  Useful for pseudo-CycL and testing." );
    $sym33$RKF_CH_INTEGERS = makeSymbol( "RKF-CH-INTEGERS" );
    $str34$Numbers_in_the_text___Examples___ = makeString( "Numbers in the text.  Examples :  7,  -1, 0, 42, 1776 3.14 etc." );
    $sym35$RKF_CH_DENOTS_OF_STRING = makeSymbol( "RKF-CH-DENOTS-OF-STRING" );
    $str36$Denotations_of_individual_words_i = makeString( "Denotations of individual words in the text." );
    $sym37$RKF_CH_MULTI_WORD_DENOTATION = makeSymbol( "RKF-CH-MULTI-WORD-DENOTATION" );
    $str38$Denotations_for_the_entire_text_i = makeString( "Denotations for the entire text if it is a multi-word phrase.  Best for clarifications." );
    $sym39$RKF_CH_NOUN_COMPOUND_PHRASES = makeSymbol( "RKF-CH-NOUN-COMPOUND-PHRASES" );
    $str40$Multi_word_phrases_from_the_lexic = makeString( "Multi-word phrases from the lexicon." );
    $sym41$RKF_CH_NOUN_PHRASE_PARSES = makeSymbol( "RKF-CH-NOUN-PHRASE-PARSES" );
    $str42$Noun_phrases_identified_using_a_n = makeString( "Noun phrases identified using a noun-phrase parser" );
    $sym43$RKF_CH_TEMPLATE_PARSES = makeSymbol( "RKF-CH-TEMPLATE-PARSES" );
    $str44$Phrases_interpreted_by_a_Template = makeString( "Phrases interpreted by a Template Parser" );
    $sym45$ITP_SEQUEL = makeSymbol( "ITP-SEQUEL" );
    $sym46$_RKF_CH_TEMPLATE_PARSE_CACHE_ = makeSymbol( "*RKF-CH-TEMPLATE-PARSE-CACHE*" );
    $kw47$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym48$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw49$INPUT = makeKeyword( "INPUT" );
    $str50$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw51$EOF = makeKeyword( "EOF" );
    $list52 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "HARVEST-SPECS" ) );
    $list53 = ConsesLow.list( makeSymbol( "INDEX-LIST" ), makeSymbol( "CYCL" ) );
  }
}
/*
 * 
 * Total time: 233 ms
 * 
 */