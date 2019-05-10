package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class np_parser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.np_parser";
  public static final String myFingerPrint = "903259e1957b9861345eb5e8abfb7d2d9229bfeb159068a13827498401001d52";
  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 1885L)
  public static SubLSymbol $clear_npp_caches_each_parseP$;
  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 1987L)
  private static SubLSymbol $npp_always_use_mwpP$;
  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 6551L)
  private static SubLSymbol $npp_denot_preds_to_exclude$;
  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 14544L)
  private static SubLSymbol $npp_canonical_pos_table_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 15307L)
  private static SubLSymbol $code_constraint_poses$;
  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 27806L)
  private static SubLSymbol $npp_specify_semtransP$;
  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 28873L)
  private static SubLSymbol $wf_col_template_comboP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 29545L)
  private static SubLSymbol $prep_semtrans_hash$;
  private static final SubLSymbol $kw0$TRIPLES;
  private static final SubLSymbol $kw1$INTERVAL;
  private static final SubLSymbol $kw2$DILIGENT;
  private static final SubLSymbol $sym3$STANDARD_STRING_TOKENIZE;
  private static final SubLSymbol $sym4$NPP_NO_DENOT_TRIPLE_;
  private static final SubLSymbol $kw5$NO_DENOT;
  private static final SubLObject $const6$abbreviationForLexicalWord;
  private static final SubLSymbol $sym7$NPP_KNOWN_STRING_;
  private static final SubLSymbol $sym8$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const9$EverythingPSC;
  private static final SubLObject $const10$DenotationPredicate_ExcludedFromN;
  private static final SubLSymbol $kw11$NONE;
  private static final SubLSymbol $sym12$NPP_VALUES_SAME_EXCEPT_FOR_DENOT_P;
  private static final SubLSymbol $sym13$INTERVAL_TOKEN_END;
  private static final SubLSymbol $sym14$INTERVAL_TOKEN_START;
  private static final SubLObject $const15$CharacterString;
  private static final SubLSymbol $kw16$ORIGINAL_STRING;
  private static final SubLSymbol $kw17$QUADS;
  private static final SubLString $str18$_S_is_not_a_valid_NPP_value_type;
  private static final SubLObject $const19$NounPhrase;
  private static final SubLString $str20$Don_t_know_how_to_make_NPP_value_;
  private static final SubLSymbol $sym21$NPP_CANONICAL_POS_TABLE;
  private static final SubLSymbol $sym22$_NPP_CANONICAL_POS_TABLE_CACHING_STATE_;
  private static final SubLSymbol $kw23$BREADTH;
  private static final SubLSymbol $kw24$QUEUE;
  private static final SubLSymbol $kw25$STACK;
  private static final SubLObject $const26$True_JustificationTruth;
  private static final SubLSymbol $sym27$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw28$ERROR;
  private static final SubLString $str29$_A_is_not_a__A;
  private static final SubLSymbol $sym30$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw31$CERROR;
  private static final SubLString $str32$continue_anyway;
  private static final SubLSymbol $kw33$WARN;
  private static final SubLString $str34$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const35$genls;
  private static final SubLObject $const36$semTransPredForPOS;
  private static final SubLString $str37$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str38$attempting_to_bind_direction_link;
  private static final SubLString $str39$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLList $list40;
  private static final SubLObject $const41$ConstituentTypeConstraintFn;
  private static final SubLSymbol $kw42$GAF;
  private static final SubLObject $const43$ProperNoun;
  private static final SubLObject $const44$nameString;
  private static final SubLObject $const45$Noun;
  private static final SubLObject $const46$partOfSpeech;
  private static final SubLSymbol $sym47$NPP_PARSE_;
  private static final SubLSymbol $sym48$NPP_PARSE_;
  private static final SubLSymbol $sym49$GET_FORTS_FOR_NP;
  private static final SubLSymbol $sym50$GET_CYCLS_FOR_NP;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$GET_BEST_CYCLS_FOR_NP;
  private static final SubLSymbol $sym53$STRINGP;
  private static final SubLSymbol $sym54$PARSE_NP;
  private static final SubLSymbol $sym55$PARSE_NBAR;
  private static final SubLList $list56;
  private static final SubLObject $const57$PossessivePronoun_Pre;
  private static final SubLList $list58;
  private static final SubLObject $const59$SubcollectionOfWithRelationFromFn;
  private static final SubLObject $const60$possessiveRelation;
  private static final SubLList $list61;
  private static final SubLObject $const62$CoordinatingConjunction;
  private static final SubLString $str63$and_;
  private static final SubLSymbol $sym64$NPP_STRING_;
  private static final SubLSymbol $kw65$UNION;
  private static final SubLObject $const66$Adjective;
  private static final SubLString $str67$_;
  private static final SubLSymbol $kw68$INTERSECTION;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLObject $const71$TheCoordinationSet;
  private static final SubLObject $const72$CollectionIntersection2Fn;
  private static final SubLObject $const73$genlPreds;
  private static final SubLObject $const74$plural;
  private static final SubLList $list75;
  private static final SubLObject $const76$termStrings;
  private static final SubLObject $const77$SomeFn;
  private static final SubLSymbol $sym78$_OBJ;
  private static final SubLObject $const79$CollectionSubsetFn;
  private static final SubLObject $const80$TheSetOf;
  private static final SubLSymbol $kw81$NOUN;
  private static final SubLObject $const82$Preposition;
  private static final SubLSymbol $sym83$NPP_TERM_;
  private static final SubLSymbol $kw84$OBJECT;
  private static final SubLObject $const85$GeneralEnglishMt;
  private static final SubLSymbol $sym86$WF_COL_TEMPLATE_COMBO_;
  private static final SubLSymbol $sym87$_WF_COL_TEMPLATE_COMBO__CACHING_STATE_;
  private static final SubLInteger $int88$1024;
  private static final SubLSymbol $sym89$_PREP_SEMTRANS_HASH_;
  private static final SubLInteger $int90$48;
  private static final SubLObject $const91$prepSemTrans;
  private static final SubLObject $const92$Post_NounPhraseModifyingFrame;
  private static final SubLString $str93$__Adding__S__S_to____S;
  private static final SubLString $str94$;
  private static final SubLList $list95;

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 1505L)
  public static SubLObject clear_npp_caches()
  {
    clear_wf_col_template_comboP();
    clear_prep_semtrans_hash();
    nl_reformulator.clear_nl_reformulator_caches();
    noun_compound_parser.clear_rbp_floors_cached();
    psp_main.clear_psp_caches();
    clear_npp_canonical_pos_table();
    noun_compound_parser.clear_rbp_rb_rules_matching_closed_specs();
    rbp_rule_bank.clear_noun_compound_constraint_string_specs();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 2141L)
  public static SubLObject npp_tokenize_strings(final SubLObject strings, SubLObject value_type, SubLObject remove_no_denot_tokensP)
  {
    if( value_type == UNPROVIDED )
    {
      value_type = $kw0$TRIPLES;
    }
    if( remove_no_denot_tokensP == UNPROVIDED )
    {
      remove_no_denot_tokensP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == strings )
    {
      return NIL;
    }
    npp_triefy_unknown_strings( strings );
    final SubLObject return_type = $kw1$INTERVAL;
    final SubLObject initial_tokenization = nl_trie_accessors.nl_trie_sentence_tokenize( strings, return_type, $kw2$DILIGENT, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject filtered_tokenization = npp_filter_tokens( initial_tokenization, strings );
    final SubLObject raw_tokens = npp_convert_interval_tokens( filtered_tokenization, value_type );
    final SubLObject filtered_tokens = ( NIL != remove_no_denot_tokensP ) ? npp_remove_no_denot_triples( raw_tokens ) : raw_tokens;
    final SubLObject final_token_list = ( NIL != parsing_vars.$npp_use_strings_for_semanticsP$.getDynamicValue( thread ) ) ? npp_add_original_string_tokens( Sequences.nreverse( filtered_tokens ), strings, value_type )
        : Sequences.reverse( filtered_tokens );
    return final_token_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 2935L)
  public static SubLObject npp_sentence_tokenize(final SubLObject string, SubLObject value_type, SubLObject string_tokenizer, SubLObject remove_no_denot_tokensP)
  {
    if( value_type == UNPROVIDED )
    {
      value_type = $kw0$TRIPLES;
    }
    if( string_tokenizer == UNPROVIDED )
    {
      string_tokenizer = $sym3$STANDARD_STRING_TOKENIZE;
    }
    if( remove_no_denot_tokensP == UNPROVIDED )
    {
      remove_no_denot_tokensP = T;
    }
    if( NIL == nl_trie.nl_trie_presentP( UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject strings = Functions.funcall( string_tokenizer, string );
    return Values.values( npp_tokenize_strings( strings, value_type, remove_no_denot_tokensP ), strings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 3504L)
  public static SubLObject npp_remove_no_denot_triples(final SubLObject tokens)
  {
    SubLObject cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      standard_tokenization.string_token_value_set( standard_tokenization.interval_token_value( token ), Sequences.remove_if( $sym4$NPP_NO_DENOT_TRIPLE_, standard_tokenization.string_token_value( standard_tokenization
          .interval_token_value( token ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 3831L)
  public static SubLObject npp_no_denot_tripleP(final SubLObject triple)
  {
    return Equality.eq( npp_value_denot( triple ), $kw5$NO_DENOT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 3929L)
  public static SubLObject npp_no_denot_quadP(final SubLObject quad)
  {
    return Equality.eq( npp_value_denot( quad ), $kw5$NO_DENOT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 4021L)
  public static SubLObject npp_filter_tokens(final SubLObject tokenization, final SubLObject strings)
  {
    SubLObject cdolist_list_var = tokenization;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject filtered = NIL;
      final SubLObject actual_string = string_utilities.bunge( Sequences.subseq( strings, standard_tokenization.interval_token_start( token ), standard_tokenization.interval_token_end( token ) ), UNPROVIDED );
      final SubLObject value = standard_tokenization.interval_token_value( token );
      SubLObject cdolist_list_var_$1;
      final SubLObject structs = cdolist_list_var_$1 = standard_tokenization.string_token_value( value );
      SubLObject struct = NIL;
      struct = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        if( NIL == npp_bad_entryP( struct, actual_string ) )
        {
          filtered = ConsesLow.cons( struct, filtered );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        struct = cdolist_list_var_$1.first();
      }
      standard_tokenization.string_token_string_set( value, actual_string );
      standard_tokenization.string_token_value_set( value, filtered );
      standard_tokenization.interval_token_value_set( token, value );
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    return tokenization;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 4649L)
  public static SubLObject npp_bad_entryP(final SubLObject entry, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = NIL;
    final SubLObject entry_semantic_mt = nl_trie.nl_trie_entry_semantic_mt( entry );
    final SubLObject mt = ( NIL != entry_semantic_mt ) ? entry_semantic_mt : nl_trie.nl_trie_entry_mt( entry );
    if( NIL != lexicon_accessors.genl_lexicon_mtP( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), mt ) )
    {
      if( NIL != nl_trie.nl_trie_name_p( entry, UNPROVIDED ) )
      {
        okP = T;
      }
      else if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) )
      {
        final SubLObject pcase_var = nl_trie.nl_trie_entry_semantic_pred( entry, UNPROVIDED );
        if( pcase_var.eql( $const6$abbreviationForLexicalWord ) )
        {
          final SubLObject wu = nl_trie.nl_trie_word_word_unit( entry, UNPROVIDED );
          if( NIL != kb_indexing_datastructures.indexed_term_p( wu ) )
          {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              if( NIL == okP )
              {
                SubLObject csome_list_var;
                SubLObject good_string;
                for( csome_list_var = kb_mapping_utilities.pred_values( wu, $const6$abbreviationForLexicalWord, ONE_INTEGER, THREE_INTEGER, UNPROVIDED ), good_string = NIL, good_string = csome_list_var
                    .first(); NIL == okP && NIL != csome_list_var; okP = Strings.stringE( good_string, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), csome_list_var = csome_list_var
                        .rest(), good_string = csome_list_var.first() )
                {
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
        }
        else
        {
          okP = T;
        }
      }
    }
    return makeBoolean( NIL == okP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 5414L)
  public static SubLObject npp_triefy_unknown_strings(final SubLObject string_list)
  {
    SubLObject cdolist_list_var;
    final SubLObject unknown_strings = cdolist_list_var = list_utilities.remove_if_not( $sym7$NPP_KNOWN_STRING_, string_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      npp_triefy_unknown_string( string );
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return unknown_strings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 5859L)
  public static SubLObject npp_triefy_unknown_string(final SubLObject string)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 5952L)
  public static SubLObject npp_known_stringP(final SubLObject string, SubLObject add_newP)
  {
    if( add_newP == UNPROVIDED )
    {
      add_newP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject values = nl_trie.nl_trie_search( string, UNPROVIDED, UNPROVIDED );
    SubLObject knownP = NIL;
    if( values.isList() && NIL == knownP )
    {
      SubLObject csome_list_var;
      SubLObject value;
      for( csome_list_var = values, value = NIL, value = csome_list_var.first(); NIL == knownP && NIL != csome_list_var; knownP = list_utilities.sublisp_boolean( nl_trie_entry_to_value_type( value,
          $kw0$TRIPLES ) ), csome_list_var = csome_list_var.rest(), value = csome_list_var.first() )
      {
      }
    }
    if( ( NIL != lexicon_vars.$use_mwpP$.getDynamicValue( thread ) && NIL == knownP ) || NIL != $npp_always_use_mwpP$.getGlobalValue() )
    {
      final SubLObject _prev_bind_0 = lexicon_vars.$mwp_triefy_resultsP$.currentBinding( thread );
      try
      {
        lexicon_vars.$mwp_triefy_resultsP$.bind( add_newP, thread );
        knownP = list_utilities.sublisp_boolean( morphological_word_parser.parse_affixes( string, UNPROVIDED ) );
      }
      finally
      {
        lexicon_vars.$mwp_triefy_resultsP$.rebind( _prev_bind_0, thread );
      }
    }
    return knownP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 6608L)
  public static SubLObject npp_init_excluded_denot_preds()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const9$EverythingPSC, thread );
      final SubLObject v_instances = isa.all_fort_instances( $const10$DenotationPredicate_ExcludedFromN, UNPROVIDED, UNPROVIDED );
      $npp_denot_preds_to_exclude$.setDynamicValue( ( NIL != v_instances ) ? v_instances : $kw11$NONE, thread );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $npp_denot_preds_to_exclude$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 6872L)
  public static SubLObject npp_excluded_denot_predP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $npp_denot_preds_to_exclude$.getDynamicValue( thread ) )
    {
      npp_init_excluded_denot_preds();
    }
    return makeBoolean( $npp_denot_preds_to_exclude$.getDynamicValue( thread ) != $kw11$NONE && NIL != Sequences.find( v_object, $npp_denot_preds_to_exclude$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 7108L)
  public static SubLObject npp_convert_chunkings(final SubLObject chunkings, final SubLObject value_type)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = chunkings;
    SubLObject chunking = NIL;
    chunking = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ans = ConsesLow.cons( npp_convert_string_tokens( chunking, value_type ), ans );
      cdolist_list_var = cdolist_list_var.rest();
      chunking = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 7391L)
  public static SubLObject npp_convert_string_tokens(final SubLObject tokens, final SubLObject value_type)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ans = ConsesLow.cons( npp_convert_string_token( token, value_type ), ans );
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 7658L)
  public static SubLObject npp_convert_interval_tokens(final SubLObject tokens, final SubLObject value_type)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject converted_token = npp_convert_interval_token( token, value_type );
      if( NIL != standard_tokenization.interval_token_value( converted_token ) )
      {
        ans = ConsesLow.cons( converted_token, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 8014L)
  public static SubLObject npp_convert_string_token(final SubLObject token, final SubLObject value_type)
  {
    final SubLObject ans = standard_tokenization.copy_string_token( token );
    SubLObject values = NIL;
    SubLObject cdolist_list_var = standard_tokenization.string_token_value( token );
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$2 = nl_trie_entry_to_value_type( entry, value_type );
      SubLObject value = NIL;
      value = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        values = ConsesLow.cons( value, values );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        value = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    standard_tokenization.string_token_value_set( ans, values );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 8399L)
  public static SubLObject npp_convert_interval_token(final SubLObject token, final SubLObject value_type)
  {
    final SubLObject input_value = standard_tokenization.interval_token_value( token );
    final SubLObject nl_trie_entries = standard_tokenization.string_token_value( input_value );
    SubLObject new_values = NIL;
    SubLObject cdolist_list_var = nl_trie_entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$3 = nl_trie_entry_to_value_type( entry, value_type );
      SubLObject value = NIL;
      value = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        final SubLObject item_var = value;
        if( NIL == conses_high.member( item_var, new_values, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
        {
          new_values = ConsesLow.cons( item_var, new_values );
        }
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        value = cdolist_list_var_$3.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    SubLObject filtered_values = NIL;
    SubLObject cdolist_list_var2 = new_values;
    SubLObject value2 = NIL;
    value2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( npp_value_denot( value2 ) != $kw5$NO_DENOT )
      {
        filtered_values = ConsesLow.cons( value2, filtered_values );
      }
      else if( NIL == conses_high.member( value2, Sequences.remove( value2, new_values, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $sym12$NPP_VALUES_SAME_EXCEPT_FOR_DENOT_P,
          UNPROVIDED ) )
      {
        filtered_values = ConsesLow.cons( value2, filtered_values );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      value2 = cdolist_list_var2.first();
    }
    standard_tokenization.string_token_value_set( input_value, filtered_values );
    standard_tokenization.interval_token_value_set( token, input_value );
    return token;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 9374L)
  public static SubLObject npp_add_original_string_tokens(SubLObject tokens, final SubLObject strings, final SubLObject value_type)
  {
    SubLObject end_var;
    SubLObject length;
    SubLObject start;
    SubLObject end_var_$4;
    SubLObject end;
    SubLObject string;
    SubLObject original_string_tuple;
    SubLObject existing_token;
    SubLObject existing_token_value;
    SubLObject existing_token_tuples;
    SubLObject new_tuples;
    SubLObject value;
    SubLObject new_token;
    for( length = ( end_var = Sequences.length( strings ) ), start = NIL, start = ZERO_INTEGER; !start.numGE( end_var ); start = number_utilities.f_1X( start ) )
    {
      for( end_var_$4 = number_utilities.f_1X( length ), end = NIL, end = number_utilities.f_1X( start ); !end.numGE( end_var_$4 ); end = number_utilities.f_1X( end ) )
      {
        string = string_utilities.bunge( Sequences.subseq( strings, start, end ), UNPROVIDED );
        original_string_tuple = npp_make_original_string_value( value_type, string );
        existing_token = Sequences.find( start, list_utilities.find_all( end, tokens, Symbols.symbol_function( EQL ), $sym13$INTERVAL_TOKEN_END ), Symbols.symbol_function( EQL ), $sym14$INTERVAL_TOKEN_START, UNPROVIDED,
            UNPROVIDED );
        if( NIL != existing_token )
        {
          existing_token_value = standard_tokenization.interval_token_value( existing_token );
          existing_token_tuples = standard_tokenization.string_token_value( existing_token_value );
          new_tuples = ConsesLow.cons( original_string_tuple, existing_token_tuples );
          standard_tokenization.string_token_value_set( existing_token_value, new_tuples );
        }
        else
        {
          value = standard_tokenization.new_string_token( string, ConsesLow.list( original_string_tuple ) );
          new_token = standard_tokenization.new_interval_token( start, end, value );
          tokens = ConsesLow.cons( new_token, tokens );
        }
      }
    }
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 10390L)
  public static SubLObject npp_make_original_string_value(final SubLObject value_type, final SubLObject original_string)
  {
    return make_npp_value_type( value_type, original_string, $const15$CharacterString, $kw16$ORIGINAL_STRING, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 10568L)
  public static SubLObject nl_trie_entry_to_value_type(final SubLObject entry, final SubLObject value_type)
  {
    if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) )
    {
      return nl_trie_word_to_value_type( entry, value_type );
    }
    if( NIL != nl_trie.nl_trie_name_p( entry, UNPROVIDED ) )
    {
      return nl_trie_name_to_value_type( entry, value_type );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 10830L)
  public static SubLObject nl_trie_word_to_value_type(final SubLObject word, final SubLObject value_type)
  {
    final SubLObject pos = npp_canonicalize_pos( nl_trie.nl_trie_word_pos( word ), UNPROVIDED );
    final SubLObject lex_pred = nl_trie.nl_trie_entry_semantic_pred( word, UNPROVIDED );
    SubLObject ans = NIL;
    final SubLObject denots = ( NIL != npp_excluded_denot_predP( lex_pred ) ) ? NIL : nl_trie.nl_trie_entry_denots( word );
    if( NIL != denots || NIL != npp_ok_with_no_denotsP( word ) )
    {
      if( value_type.eql( $kw0$TRIPLES ) )
      {
        if( NIL != denots )
        {
          SubLObject cdolist_list_var = denots;
          SubLObject denot = NIL;
          denot = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject cdolist_list_var_$5 = nl_trie.nl_trie_word_pos_preds( word );
            SubLObject pred = NIL;
            pred = cdolist_list_var_$5.first();
            while ( NIL != cdolist_list_var_$5)
            {
              ans = ConsesLow.cons( ConsesLow.list( denot, pos, pred ), ans );
              cdolist_list_var_$5 = cdolist_list_var_$5.rest();
              pred = cdolist_list_var_$5.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
          }
        }
        else
        {
          SubLObject cdolist_list_var = nl_trie.nl_trie_word_pos_preds( word );
          SubLObject pred2 = NIL;
          pred2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            ans = ConsesLow.cons( ConsesLow.list( $kw5$NO_DENOT, pos, pred2 ), ans );
            cdolist_list_var = cdolist_list_var.rest();
            pred2 = cdolist_list_var.first();
          }
        }
      }
      else if( value_type.eql( $kw17$QUADS ) )
      {
        final SubLObject wu = ( NIL != lexicon_utilities.stringlist_args_of_pred_cached( lex_pred ) ) ? NIL : nl_trie.nl_trie_word_word_unit( word, UNPROVIDED );
        if( NIL != denots )
        {
          SubLObject cdolist_list_var2 = denots;
          SubLObject denot2 = NIL;
          denot2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            SubLObject cdolist_list_var_$6 = nl_trie.nl_trie_word_pos_preds( word );
            SubLObject pred3 = NIL;
            pred3 = cdolist_list_var_$6.first();
            while ( NIL != cdolist_list_var_$6)
            {
              ans = ConsesLow.cons( ConsesLow.list( denot2, pos, pred3, wu ), ans );
              cdolist_list_var_$6 = cdolist_list_var_$6.rest();
              pred3 = cdolist_list_var_$6.first();
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            denot2 = cdolist_list_var2.first();
          }
        }
        else
        {
          SubLObject cdolist_list_var2 = nl_trie.nl_trie_word_pos_preds( word );
          SubLObject pred4 = NIL;
          pred4 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            ans = ConsesLow.cons( ConsesLow.list( $kw5$NO_DENOT, pos, pred4, wu ), ans );
            cdolist_list_var2 = cdolist_list_var2.rest();
            pred4 = cdolist_list_var2.first();
          }
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 11858L)
  public static SubLObject npp_value_denot(final SubLObject value)
  {
    return value.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 11922L)
  public static SubLObject npp_values_same_except_for_denot_p(final SubLObject value1, final SubLObject value2)
  {
    return Equality.equal( value1.rest(), value2.rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 12035L)
  public static SubLObject npp_value_typeP(final SubLObject v_object, final SubLObject value_type)
  {
    if( value_type.eql( $kw0$TRIPLES ) )
    {
      return npp_tripleP( v_object );
    }
    if( value_type.eql( $kw17$QUADS ) )
    {
      return npp_quadP( v_object );
    }
    Errors.sublisp_break( $str18$_S_is_not_a_valid_NPP_value_type, new SubLObject[] { value_type
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 12277L)
  public static SubLObject npp_values_of_typeP(final SubLObject values, final SubLObject value_type)
  {
    SubLObject badP = NIL;
    if( NIL == badP )
    {
      SubLObject csome_list_var;
      SubLObject value;
      for( csome_list_var = values, value = NIL, value = csome_list_var.first(); NIL == badP && NIL != csome_list_var; badP = makeBoolean( NIL == npp_value_typeP( value, value_type ) ), csome_list_var = csome_list_var
          .rest(), value = csome_list_var.first() )
      {
      }
    }
    return makeBoolean( NIL == badP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 12472L)
  public static SubLObject npp_tripleP(final SubLObject v_object)
  {
    return makeBoolean( NIL != npp_proper_tripleP( v_object ) || NIL != npp_original_string_triple_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 12596L)
  public static SubLObject npp_proper_tripleP(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, THREE_INTEGER, UNPROVIDED ) && NIL != npp_denot_p( v_object.first() ) && NIL != npp_posP( conses_high
        .second( v_object ) ) && NIL != npp_predP( conses_high.third( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 12806L)
  public static SubLObject npp_original_string_triple_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, THREE_INTEGER, UNPROVIDED ) && v_object.first().isString() && conses_high.second( v_object ).eql(
        $const15$CharacterString ) && conses_high.third( v_object ) == $kw16$ORIGINAL_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 13045L)
  public static SubLObject npp_quadP(final SubLObject v_object)
  {
    return npp_proper_quadP( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 13116L)
  public static SubLObject npp_proper_quadP(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, FOUR_INTEGER, UNPROVIDED ) && NIL != npp_denot_p( v_object.first() ) && NIL != npp_posP( conses_high
        .second( v_object ) ) && NIL != npp_predP( conses_high.third( v_object ) ) && NIL != npp_wuP( conses_high.fourth( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 13356L)
  public static SubLObject npp_denot_p(final SubLObject v_object)
  {
    return makeBoolean( v_object == $kw5$NO_DENOT || NIL != forts.fort_p( v_object ) || NIL != narts_high.naut_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 13466L)
  public static SubLObject npp_posP(final SubLObject v_object)
  {
    return makeBoolean( v_object.eql( $const19$NounPhrase ) || NIL != lexicon_accessors.speech_partP( v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 13569L)
  public static SubLObject npp_predP(final SubLObject v_object)
  {
    return makeBoolean( NIL != lexicon_accessors.speech_part_predP( v_object, UNPROVIDED ) || NIL != lexicon_vars.name_string_predP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 13679L)
  public static SubLObject npp_wuP(final SubLObject v_object)
  {
    return lexicon_accessors.quick_lexical_wordP( v_object, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 13751L)
  public static SubLObject make_npp_value_type(final SubLObject value_type, final SubLObject denot, final SubLObject pos, final SubLObject pred, SubLObject wu)
  {
    if( wu == UNPROVIDED )
    {
      wu = NIL;
    }
    if( value_type.eql( $kw0$TRIPLES ) )
    {
      return make_npp_triple( denot, pos, pred );
    }
    if( value_type.eql( $kw17$QUADS ) )
    {
      return make_npp_quad( denot, pos, pred, wu );
    }
    Errors.sublisp_break( $str20$Don_t_know_how_to_make_NPP_value_, new SubLObject[] { value_type
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 14053L)
  public static SubLObject make_npp_triple(final SubLObject denot, final SubLObject pos, final SubLObject pred)
  {
    return ConsesLow.list( denot, pos, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 14136L)
  public static SubLObject make_npp_quad(final SubLObject denot, final SubLObject pos, final SubLObject pred, final SubLObject wu)
  {
    return ConsesLow.list( denot, pos, pred, wu );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 14223L)
  public static SubLObject npp_canonicalize_pos(final SubLObject pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject table = npp_canonical_pos_table( mt );
    thread.resetMultipleValues();
    final SubLObject canonical_pos = dictionary.dictionary_lookup( table, pos, pos );
    final SubLObject changedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( canonical_pos, changedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 14544L)
  public static SubLObject clear_npp_canonical_pos_table()
  {
    final SubLObject cs = $npp_canonical_pos_table_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 14544L)
  public static SubLObject remove_npp_canonical_pos_table(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $npp_canonical_pos_table_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 14544L)
  public static SubLObject npp_canonical_pos_table_internal(final SubLObject mt)
  {
    final SubLObject table = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject constraint_poses = cdolist_list_var = get_constraint_poses( mt );
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$7;
      final SubLObject subsumed_poses = cdolist_list_var_$7 = get_subsumed_poses( pos, mt );
      SubLObject subsumed_pos = NIL;
      subsumed_pos = cdolist_list_var_$7.first();
      while ( NIL != cdolist_list_var_$7)
      {
        dictionary.dictionary_enter( table, subsumed_pos, pos );
        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
        subsumed_pos = cdolist_list_var_$7.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      pos = cdolist_list_var.first();
    }
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 14544L)
  public static SubLObject npp_canonical_pos_table(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $npp_canonical_pos_table_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym21$NPP_CANONICAL_POS_TABLE, $sym22$_NPP_CANONICAL_POS_TABLE_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( npp_canonical_pos_table_internal( mt ) ) );
      memoization_state.caching_state_put( caching_state, mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 14926L)
  public static SubLObject get_subsumed_poses(final SubLObject pos, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject abortP = NIL;
    SubLObject subsumed_poses = NIL;
    if( NIL == abortP )
    {
      SubLObject node_var = pos;
      final SubLObject deck_type = $kw25$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
            final SubLObject tv_var = $const26$True_JustificationTruth;
            final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym27$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw28$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str29$_A_is_not_a__A, tv_var, $sym30$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw31$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str32$continue_anyway, $str29$_A_is_not_a__A, tv_var, $sym30$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw33$WARN ) )
                {
                  Errors.warn( $str29$_A_is_not_a__A, tv_var, $sym30$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str34$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str32$continue_anyway, $str29$_A_is_not_a__A, tv_var, $sym30$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const35$genls ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const35$genls ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const35$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const35$genls ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pos, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const35$genls ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    while ( NIL != node_var && NIL == abortP)
                    {
                      final SubLObject spec = node_var;
                      if( !spec.eql( pos ) )
                      {
                        if( NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( spec, $const36$semTransPredForPOS, mt, UNPROVIDED, UNPROVIDED ) )
                        {
                          abortP = T;
                        }
                        else
                        {
                          subsumed_poses = ConsesLow.cons( spec, subsumed_poses );
                        }
                      }
                      final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const35$genls ) );
                      SubLObject rest;
                      SubLObject module_var;
                      SubLObject _prev_bind_0_$12;
                      SubLObject _prev_bind_1_$13;
                      SubLObject node;
                      SubLObject d_link;
                      SubLObject mt_links;
                      SubLObject iteration_state;
                      SubLObject mt_$19;
                      SubLObject tv_links;
                      SubLObject _prev_bind_0_$13;
                      SubLObject iteration_state_$21;
                      SubLObject tv;
                      SubLObject link_nodes;
                      SubLObject _prev_bind_0_$14;
                      SubLObject sol;
                      SubLObject set_contents_var;
                      SubLObject basis_object;
                      SubLObject state;
                      SubLObject node_vars_link_node;
                      SubLObject csome_list_var;
                      SubLObject node_vars_link_node2;
                      SubLObject new_list;
                      SubLObject rest_$23;
                      SubLObject generating_fn;
                      SubLObject _prev_bind_0_$15;
                      SubLObject sol2;
                      SubLObject link_nodes2;
                      SubLObject set_contents_var2;
                      SubLObject basis_object2;
                      SubLObject state2;
                      SubLObject node_vars_link_node3;
                      SubLObject csome_list_var2;
                      SubLObject node_vars_link_node4;
                      for( rest = NIL, rest = accessible_modules; NIL == abortP && NIL != rest; rest = rest.rest() )
                      {
                        module_var = rest.first();
                        _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          node = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == abortP && NIL == dictionary_contents
                                    .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  mt_$19 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt_$19 ) )
                                  {
                                    _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt_$19, thread );
                                      for( iteration_state_$21 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == abortP && NIL == dictionary_contents
                                          .do_dictionary_contents_doneP( iteration_state_$21 ); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next( iteration_state_$21 ) )
                                      {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$21 );
                                        link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              set_contents_var = set.do_set_internal( sol );
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == abortP && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              if( NIL == abortP )
                                              {
                                                csome_list_var = sol;
                                                node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var.first();
                                                while ( NIL == abortP && NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  node_vars_link_node2 = csome_list_var.first();
                                                }
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str37$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$14, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$21 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$13, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            for( rest_$23 = NIL, rest_$23 = new_list; NIL == abortP && NIL != rest_$23; rest_$23 = rest_$23.rest() )
                            {
                              generating_fn = rest_$23.first();
                              _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  set_contents_var2 = set.do_set_internal( sol2 );
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == abortP && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  if( NIL == abortP )
                                  {
                                    csome_list_var2 = sol2;
                                    node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var2.first();
                                    while ( NIL == abortP && NIL != csome_list_var2)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      node_vars_link_node4 = csome_list_var2.first();
                                    }
                                  }
                                }
                                else
                                {
                                  Errors.error( $str37$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$15, thread );
                              }
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$13, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$12, thread );
                        }
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$14, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$12, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$11, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str39$Node__a_does_not_pass_sbhl_type_t, pos, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                      UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$13, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$11, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$10, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$10, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$9, thread );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$8, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
      }
    }
    return ( NIL != abortP ) ? NIL : subsumed_poses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 15432L)
  public static SubLObject get_constraint_poses(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_constraint_poses = $code_constraint_poses$.getGlobalValue();
    if( NIL != kb_mapping_macros.do_function_extent_index_key_validator( $const41$ConstituentTypeConstraintFn ) )
    {
      final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec( $const41$ConstituentTypeConstraintFn );
      SubLObject final_index_iterator = NIL;
      try
      {
        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, NIL, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject tou = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( tou ) );
          if( NIL != valid )
          {
            final SubLObject nart = assertions_high.gaf_arg1( tou );
            final SubLObject constituent_type = cycl_utilities.nat_arg2( nart, UNPROVIDED );
            if( NIL != lexicon_accessors.speech_partP( constituent_type, mt ) )
            {
              all_constraint_poses = ConsesLow.cons( constituent_type, all_constraint_poses );
            }
          }
          done_var = makeBoolean( NIL == valid );
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
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      all_constraint_poses = genls.min_cols( all_constraint_poses, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_4, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
    }
    return all_constraint_poses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 15880L)
  public static SubLObject npp_ok_with_no_denotsP(final SubLObject word)
  {
    return makeBoolean( NIL == lexicon_accessors.genl_posP( nl_trie.nl_trie_word_pos( word ), $const43$ProperNoun, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 15992L)
  public static SubLObject nl_trie_name_to_value_type(final SubLObject name, final SubLObject value_type)
  {
    final SubLObject pred = nl_trie.nl_trie_entry_semantic_pred( name, UNPROVIDED );
    SubLObject ans = NIL;
    if( NIL == parsing_utilities.npp_excluded_name_predP( pred ) )
    {
      final SubLObject pos = ( NIL != lexicon_accessors.genl_pos_predP( pred, $const44$nameString, UNPROVIDED ) ) ? $const19$NounPhrase : $const45$Noun;
      SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots( name );
      SubLObject denot = NIL;
      denot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( value_type.eql( $kw0$TRIPLES ) )
        {
          ans = ConsesLow.cons( ConsesLow.list( denot, pos, pred ), ans );
        }
        else if( value_type.eql( $kw17$QUADS ) )
        {
          ans = ConsesLow.cons( ConsesLow.list( denot, pos, pred, NIL ), ans );
        }
        cdolist_list_var = cdolist_list_var.rest();
        denot = cdolist_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 16492L)
  public static SubLObject npp_stringE(final SubLObject string1, final SubLObject string2)
  {
    return Equality.equalp( string1, string2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 16615L)
  public static SubLObject npp_termE(final SubLObject term1, final SubLObject term2)
  {
    return Equality.equalp( term1, term2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 16755L)
  public static SubLObject make_npp_parse(final SubLObject denot, final SubLObject pred)
  {
    return ConsesLow.list( denot, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 16895L)
  public static SubLObject npp_parseP(final SubLObject obj)
  {
    return makeBoolean( NIL != npp_proper_parseP( obj ) || NIL != npp_original_string_parse_p( obj ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 17046L)
  public static SubLObject npp_proper_parseP(final SubLObject obj)
  {
    return makeBoolean( obj.isCons() && NIL != list_utilities.lengthE( obj, TWO_INTEGER, UNPROVIDED ) && ( NIL != lexicon_accessors.speech_part_predP( conses_high.second( obj ), UNPROVIDED ) || NIL != lexicon_vars
        .name_string_predP( conses_high.second( obj ) ) || conses_high.second( obj ).eql( $const46$partOfSpeech ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 17259L)
  public static SubLObject npp_original_string_parse_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && conses_high.second( v_object ).eql( $kw16$ORIGINAL_STRING ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 17422L)
  public static SubLObject npp_parseE(final SubLObject parse1, final SubLObject parse2)
  {
    assert NIL != npp_parseP( parse1 ) : parse1;
    assert NIL != npp_parseP( parse2 ) : parse2;
    return makeBoolean( NIL != npp_termE( npp_parse_cycl( parse1 ), npp_parse_cycl( parse2 ) ) && NIL != npp_termE( npp_parse_pred( parse1 ), npp_parse_pred( parse2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 17759L)
  public static SubLObject npp_parse_cycl(final SubLObject parse)
  {
    assert NIL != npp_parseP( parse ) : parse;
    return parse.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 17887L)
  public static SubLObject npp_parse_pred(final SubLObject parse)
  {
    assert NIL != npp_parseP( parse ) : parse;
    return conses_high.second( parse );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 18020L)
  public static SubLObject npp_combine_parse_lists(final SubLObject parses1, final SubLObject parses2)
  {
    SubLObject ans = parses2;
    SubLObject cdolist_list_var = parses1;
    SubLObject parse = NIL;
    parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = parse;
      if( NIL == conses_high.member( item_var, ans, $sym48$NPP_PARSE_, Symbols.symbol_function( IDENTITY ) ) )
      {
        ans = ConsesLow.cons( item_var, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      parse = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 18240L)
  public static SubLObject np_wff_filter(SubLObject new_level)
  {
    if( new_level == UNPROVIDED )
    {
      new_level = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( new_level.isInteger() )
    {
      final SubLObject min = ZERO_INTEGER;
      final SubLObject max = TWO_INTEGER;
      final SubLObject new_level_final = new_level.numL( min ) ? min : ( new_level.numG( max ) ? max : new_level );
      if( !parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ).eql( new_level_final ) )
      {
        parsing_vars.$np_wff_filter_level$.setDynamicValue( new_level_final, thread );
      }
    }
    return parsing_vars.$np_wff_filter_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 18802L)
  public static SubLObject get_forts_for_np(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_forts = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$np_wff_filter_level$.currentBinding( thread );
    try
    {
      parsing_vars.$np_wff_filter_level$.bind( ZERO_INTEGER, thread );
      SubLObject cdolist_list_var = get_cycls_for_np( string );
      SubLObject cycl = NIL;
      cycl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != cycl_utilities.reified_term_p( function_terms.naut_to_nart( cycl ) ) )
        {
          v_forts = ConsesLow.cons( cycl, v_forts );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cycl = cdolist_list_var.first();
      }
    }
    finally
    {
      parsing_vars.$np_wff_filter_level$.rebind( _prev_bind_0, thread );
    }
    return v_forts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 19553L)
  public static SubLObject get_cycls_for_np(final SubLObject string)
  {
    return psp_main.ps_get_cycls_for_np( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 19886L)
  public static SubLObject get_best_cycls_for_np(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject cycls = get_cycls_for_np( string );
    SubLObject ans = NIL;
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = cycls;
      SubLObject cycl = NIL;
      cycl = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        if( NIL != npp_term_complexity_L( cycls.first(), cycl ) )
        {
          doneP = T;
        }
        else
        {
          ans = ConsesLow.cons( cycl, ans );
        }
        csome_list_var = csome_list_var.rest();
        cycl = csome_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 20278L)
  public static SubLObject parse_np(final SubLObject string, SubLObject default_quant)
  {
    if( default_quant == UNPROVIDED )
    {
      default_quant = NIL;
    }
    return psp_main.ps_get_cycls_for_np( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 20734L)
  public static SubLObject parse_nbar(final SubLObject nbar)
  {
    return psp_main.ps_get_cycls_for_phrase( nbar, $list56, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 20968L)
  public static SubLObject parse_possessive_np(final SubLObject det, final SubLObject nbar)
  {
    SubLObject parses = NIL;
    final SubLObject nbar_parses = parse_nbar( nbar );
    SubLObject cdolist_list_var = lexicon_accessors.pos_of_string( det, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != rbp_wff.npp_genlP( pos, $const57$PossessivePronoun_Pre, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$26 = lexicon_accessors.denots_of_stringXspeech_part( det, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject det_denot = NIL;
        det_denot = cdolist_list_var_$26.first();
        while ( NIL != cdolist_list_var_$26)
        {
          SubLObject cdolist_list_var_$27 = nbar_parses;
          SubLObject nbar_parse = NIL;
          nbar_parse = cdolist_list_var_$27.first();
          while ( NIL != cdolist_list_var_$27)
          {
            SubLObject current;
            final SubLObject datum = current = nbar_parse;
            SubLObject nbar_denot = NIL;
            SubLObject nbar_pred = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
            nbar_denot = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
            nbar_pred = current.first();
            current = current.rest();
            if( NIL == current )
            {
              final SubLObject poss_nat = ConsesLow.list( $const59$SubcollectionOfWithRelationFromFn, nbar_denot, $const60$possessiveRelation, det_denot );
              final SubLObject item_var = make_npp_parse( nl_reformulator.nl_reformulate( poss_nat, UNPROVIDED ), nbar_pred );
              if( NIL == conses_high.member( item_var, parses, $sym48$NPP_PARSE_, Symbols.symbol_function( IDENTITY ) ) )
              {
                parses = ConsesLow.cons( item_var, parses );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
            }
            cdolist_list_var_$27 = cdolist_list_var_$27.rest();
            nbar_parse = cdolist_list_var_$27.first();
          }
          cdolist_list_var_$26 = cdolist_list_var_$26.rest();
          det_denot = cdolist_list_var_$26.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      pos = cdolist_list_var.first();
    }
    return parses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 21685L)
  public static SubLObject wrap_and_reformulate_cycl(final SubLObject wrapper, final SubLObject cycl)
  {
    return nl_reformulator.nl_reformulate( ConsesLow.list( wrapper, cycl ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 21787L)
  public static SubLObject parse_nbar_via_lookup(final SubLObject nbar)
  {
    SubLObject parses = NIL;
    final SubLObject values = nl_trie.nl_trie_search( nbar, UNPROVIDED, UNPROVIDED );
    if( values.isList() )
    {
      SubLObject cdolist_list_var = values;
      SubLObject value = NIL;
      value = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != nl_trie.nl_trie_word_p( value, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var_$28 = nl_trie_word_to_value_type( value, $kw0$TRIPLES );
          SubLObject triple = NIL;
          triple = cdolist_list_var_$28.first();
          while ( NIL != cdolist_list_var_$28)
          {
            SubLObject current;
            final SubLObject datum = current = triple;
            SubLObject denot = NIL;
            SubLObject pos = NIL;
            SubLObject pred = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
            denot = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
            pos = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
            pred = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( NIL != denot && NIL != genls.genl_in_any_mtP( pos, $const45$Noun ) )
              {
                parses = ConsesLow.cons( make_npp_parse( denot, pred ), parses );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list61 );
            }
            cdolist_list_var_$28 = cdolist_list_var_$28.rest();
            triple = cdolist_list_var_$28.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        value = cdolist_list_var.first();
      }
    }
    return parses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 22270L)
  public static SubLObject parse_nbar_with_and(final SubLObject nbar)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject parses = NIL;
    thread.resetMultipleValues();
    final SubLObject and_phrase = find_final_phrase_beginning_with_pos( nbar, $const62$CoordinatingConjunction );
    final SubLObject conj1 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != list_utilities.lengthG( and_phrase, FOUR_INTEGER, UNPROVIDED ) && NIL != string_utilities.starts_with_by_test( and_phrase, $str63$and_, $sym64$NPP_STRING_ ) )
    {
      final SubLObject conj2 = string_utilities.substring( and_phrase, FOUR_INTEGER, UNPROVIDED );
      parses = npp_combine_parse_lists( parses, parse_conjoined_nbars( conj1, conj2, $kw65$UNION ) );
      thread.resetMultipleValues();
      final SubLObject adj1 = find_initial_strings_with_pos( conj1, $const66$Adjective );
      final SubLObject mini_conj1 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != string_utilities.non_empty_stringP( adj1 ) )
      {
        if( NIL != string_utilities.non_empty_stringP( mini_conj1 ) )
        {
          final SubLObject new_conj2 = Sequences.cconcatenate( adj1, new SubLObject[] { $str67$_, conj2
          } );
          parses = npp_combine_parse_lists( parses, parse_conjoined_nbars( conj1, new_conj2, $kw65$UNION ) );
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject adj2 = find_initial_strings_with_pos( conj2, $const66$Adjective );
          final SubLObject mini_conj2 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != string_utilities.non_empty_stringP( adj2 ) && NIL != string_utilities.non_empty_stringP( mini_conj2 ) )
          {
            final SubLObject new_conj3 = Sequences.cconcatenate( adj1, new SubLObject[] { $str67$_, mini_conj2
            } );
            parses = npp_combine_parse_lists( parses, parse_conjoined_nbars( new_conj3, conj2, $kw65$UNION ) );
            parses = npp_combine_parse_lists( parses, parse_conjoined_nbars( new_conj3, conj2, $kw68$INTERSECTION ) );
          }
        }
      }
    }
    return parses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 23866L)
  public static SubLObject parse_conjoined_nbars(final SubLObject nbar1, final SubLObject nbar2, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw65$UNION;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject parses = NIL;
    SubLObject cdolist_list_var = parse_nbar( nbar1 );
    SubLObject nbar1_parse = NIL;
    nbar1_parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = nbar1_parse;
      SubLObject nbar1_cycl = NIL;
      SubLObject nbar1_pred = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
      nbar1_cycl = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
      nbar1_pred = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$29 = parse_nbar( nbar2 );
        SubLObject nbar2_parse = NIL;
        nbar2_parse = cdolist_list_var_$29.first();
        while ( NIL != cdolist_list_var_$29)
        {
          SubLObject current_$31;
          final SubLObject datum_$30 = current_$31 = nbar2_parse;
          SubLObject nbar2_cycl = NIL;
          SubLObject nbar2_pred = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$31, datum_$30, $list70 );
          nbar2_cycl = current_$31.first();
          current_$31 = current_$31.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$31, datum_$30, $list70 );
          nbar2_pred = current_$31.first();
          current_$31 = current_$31.rest();
          if( NIL == current_$31 )
          {
            if( NIL != rbp_wff.npp_collectionP( nbar1_cycl ) && NIL != rbp_wff.npp_collectionP( nbar2_cycl ) && nbar1_pred.eql( nbar2_pred ) )
            {
              final SubLObject pcase_var = type;
              if( pcase_var.eql( $kw65$UNION ) )
              {
                final SubLObject new_cycl = el_utilities.make_binary_formula( $const71$TheCoordinationSet, nbar1_cycl, nbar2_cycl );
                final SubLObject okP = rbp_wff.rbp_wf_natP( new_cycl, parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ) );
                if( NIL != okP )
                {
                  final SubLObject item_var = make_npp_parse( new_cycl, nbar1_pred );
                  if( NIL == conses_high.member( item_var, parses, $sym48$NPP_PARSE_, Symbols.symbol_function( IDENTITY ) ) )
                  {
                    parses = ConsesLow.cons( item_var, parses );
                  }
                }
              }
              else if( pcase_var.eql( $kw68$INTERSECTION ) )
              {
                final SubLObject new_cycl = nl_reformulator.nl_reformulate( ConsesLow.list( $const72$CollectionIntersection2Fn, nbar1_cycl, nbar2_cycl ), UNPROVIDED );
                final SubLObject okP = rbp_wff.rbp_wf_natP( new_cycl, parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ) );
                if( NIL != okP )
                {
                  final SubLObject item_var = make_npp_parse( new_cycl, nbar1_pred );
                  if( NIL == conses_high.member( item_var, parses, $sym48$NPP_PARSE_, Symbols.symbol_function( IDENTITY ) ) )
                  {
                    parses = ConsesLow.cons( item_var, parses );
                  }
                }
              }
            }
            else if( type == $kw65$UNION && NIL != rbp_wff.npp_individualP( nbar1_cycl ) && NIL != rbp_wff.npp_individualP( nbar2_cycl ) )
            {
              final SubLObject preds = ConsesLow.list( nbar1_pred, nbar2_pred );
              final SubLObject preds_okP = conses_high.nintersection( preds, sbhl_search_methods.sbhl_ceilings( sbhl_module_vars.get_sbhl_module( $const73$genlPreds ), preds, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
                  UNPROVIDED, UNPROVIDED );
              if( NIL != preds_okP )
              {
                final SubLObject coord_set_cycl = el_utilities.make_binary_formula( $const71$TheCoordinationSet, nbar1_cycl, nbar2_cycl );
                final SubLObject item_var = make_npp_parse( coord_set_cycl, $const74$plural );
                if( NIL == conses_high.member( item_var, parses, $sym48$NPP_PARSE_, Symbols.symbol_function( IDENTITY ) ) )
                {
                  parses = ConsesLow.cons( item_var, parses );
                }
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum_$30, $list70 );
          }
          cdolist_list_var_$29 = cdolist_list_var_$29.rest();
          nbar2_parse = cdolist_list_var_$29.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list69 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      nbar1_parse = cdolist_list_var.first();
    }
    return parses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 25445L)
  public static SubLObject parse_nbar_pp(final SubLObject nbar, final SubLObject pp)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject nbar_parses = parse_nbar( nbar );
    SubLObject parses = NIL;
    if( NIL != nbar_parses )
    {
      thread.resetMultipleValues();
      final SubLObject prep = split_and_parse_pp( pp );
      final SubLObject prep_obj_cycls = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject pp_cycls = parse_pp_in_np( prep, prep_obj_cycls );
      SubLObject cdolist_list_var = nbar_parses;
      SubLObject nbar_parse = NIL;
      nbar_parse = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = nbar_parse;
        SubLObject nbar_cycl = NIL;
        SubLObject nbar_pos_pred = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
        nbar_cycl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
        nbar_pos_pred = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL == rbp_wff.npp_genl_predP( nbar_pos_pred, $const76$termStrings ) && NIL != rbp_wff.npp_collectionP( nbar_cycl ) )
          {
            if( NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue( thread ) )
            {
              nbar_cycl = ConsesLow.list( $const77$SomeFn, nbar_cycl );
            }
            SubLObject cdolist_list_var_$32 = pp_cycls;
            SubLObject pp_cycl = NIL;
            pp_cycl = cdolist_list_var_$32.first();
            while ( NIL != cdolist_list_var_$32)
            {
              SubLObject cdolist_list_var_$33 = specify_prep_semtrans( pp_cycl, nbar_cycl, $kw81$NOUN );
              SubLObject spec_pp_cycl = NIL;
              spec_pp_cycl = cdolist_list_var_$33.first();
              while ( NIL != cdolist_list_var_$33)
              {
                final SubLObject var = czer_utilities.unique_el_var_wrt_expression( spec_pp_cycl, $sym78$_OBJ );
                final SubLObject nat = ConsesLow.list( $const79$CollectionSubsetFn, nbar_cycl, ConsesLow.list( $const80$TheSetOf, var, conses_high.subst( var, $kw81$NOUN, spec_pp_cycl, UNPROVIDED, UNPROVIDED ) ) );
                final SubLObject reformulated_nat = nl_reformulator.nl_reformulate( nat, UNPROVIDED );
                final SubLObject okP = rbp_wff.rbp_wf_natP( reformulated_nat, parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ) );
                if( NIL != okP )
                {
                  final SubLObject item_var = ConsesLow.list( reformulated_nat, nbar_pos_pred );
                  if( NIL == conses_high.member( item_var, parses, $sym48$NPP_PARSE_, Symbols.symbol_function( IDENTITY ) ) )
                  {
                    parses = ConsesLow.cons( item_var, parses );
                  }
                }
                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                spec_pp_cycl = cdolist_list_var_$33.first();
              }
              cdolist_list_var_$32 = cdolist_list_var_$32.rest();
              pp_cycl = cdolist_list_var_$32.first();
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list75 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        nbar_parse = cdolist_list_var.first();
      }
    }
    return parses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 26754L)
  public static SubLObject split_and_parse_pp(final SubLObject pp_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject np_cycls = NIL;
    thread.resetMultipleValues();
    final SubLObject prep = find_initial_strings_with_pos( pp_string, $const82$Preposition );
    final SubLObject np = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = parse_np( np, UNPROVIDED );
    SubLObject np_parse = NIL;
    np_parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = npp_parse_cycl( np_parse );
      if( NIL == conses_high.member( item_var, np_cycls, $sym83$NPP_TERM_, Symbols.symbol_function( IDENTITY ) ) )
      {
        np_cycls = ConsesLow.cons( item_var, np_cycls );
      }
      cdolist_list_var = cdolist_list_var.rest();
      np_parse = cdolist_list_var.first();
    }
    return Values.values( prep, np_cycls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 27367L)
  public static SubLObject parse_pp_in_np(final SubLObject prep, final SubLObject prep_obj_cycls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = semtrans_of_prep_string( prep );
    SubLObject semtrans = NIL;
    semtrans = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$34 = prep_obj_cycls;
      SubLObject np_cycl = NIL;
      np_cycl = cdolist_list_var_$34.first();
      while ( NIL != cdolist_list_var_$34)
      {
        if( NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue( thread ) && NIL != rbp_wff.npp_collectionP( np_cycl ) )
        {
          np_cycl = ConsesLow.list( $const77$SomeFn, np_cycl );
        }
        ans = ConsesLow.cons( conses_high.subst( np_cycl, $kw84$OBJECT, semtrans, UNPROVIDED, UNPROVIDED ), ans );
        cdolist_list_var_$34 = cdolist_list_var_$34.rest();
        np_cycl = cdolist_list_var_$34.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      semtrans = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 27920L)
  public static SubLObject specify_prep_semtrans(final SubLObject semtrans, final SubLObject obj_cycl, final SubLObject keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject clause = ( NIL != el_utilities.gafP( semtrans ) && NIL != cycl_utilities.formula_find( keyword, semtrans, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? semtrans : NIL;
    final SubLObject pred = ( NIL != clause ) ? cycl_utilities.formula_operator( clause ) : NIL;
    SubLObject ans = ( NIL != clause ) ? ( ( NIL != wf_col_template_comboP( clause, obj_cycl, keyword ) ) ? ConsesLow.list( clause ) : NIL ) : NIL;
    if( NIL != ans && NIL != $npp_specify_semtransP$.getDynamicValue( thread ) )
    {
      SubLObject cdolist_list_var = genl_predicates.spec_predicates( pred, $const85$GeneralEnglishMt, UNPROVIDED );
      SubLObject spec_pred = NIL;
      spec_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject spec_clause = ConsesLow.cons( spec_pred, cycl_utilities.formula_args( clause, UNPROVIDED ) );
        SubLObject cdolist_list_var_$35 = specify_prep_semtrans( spec_clause, obj_cycl, keyword );
        SubLObject spec_spec_clause = NIL;
        spec_spec_clause = cdolist_list_var_$35.first();
        while ( NIL != cdolist_list_var_$35)
        {
          ans = ConsesLow.cons( spec_spec_clause, ans );
          cdolist_list_var_$35 = cdolist_list_var_$35.rest();
          spec_spec_clause = cdolist_list_var_$35.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        spec_pred = cdolist_list_var.first();
      }
    }
    return Sequences.remove_duplicates( ans, $sym83$NPP_TERM_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 28873L)
  public static SubLObject clear_wf_col_template_comboP()
  {
    final SubLObject cs = $wf_col_template_comboP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 28873L)
  public static SubLObject remove_wf_col_template_comboP(final SubLObject template, final SubLObject obj_cycl, final SubLObject keyword)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wf_col_template_comboP_caching_state$.getGlobalValue(), ConsesLow.list( template, obj_cycl, keyword ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 28873L)
  public static SubLObject wf_col_template_comboP_internal(final SubLObject template, final SubLObject obj_cycl, final SubLObject keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stripped_template = parsing_utilities.strip_nl_tags( template, UNPROVIDED );
    final SubLObject stripped_obj_cycl = parsing_utilities.strip_nl_tags( obj_cycl, UNPROVIDED );
    final SubLObject keyword_bindings = ConsesLow.list( ConsesLow.cons( keyword, stripped_obj_cycl ) );
    return makeBoolean( ( !parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ).numG( ZERO_INTEGER ) || NIL != rbp_wff.rbp_wf_template_argsP( stripped_template, keyword_bindings, ONE_INTEGER ) )
        && ( !parsing_vars.$np_wff_filter_level$.getDynamicValue( thread ).numG( ONE_INTEGER ) || NIL != rbp_wff.rbp_wf_template_argsP( stripped_template, keyword_bindings, TWO_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 28873L)
  public static SubLObject wf_col_template_comboP(final SubLObject template, final SubLObject obj_cycl, final SubLObject keyword)
  {
    SubLObject caching_state = $wf_col_template_comboP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym86$WF_COL_TEMPLATE_COMBO_, $sym87$_WF_COL_TEMPLATE_COMBO__CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int88$1024 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( template, obj_cycl, keyword );
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
        if( template.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( obj_cycl.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && keyword.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wf_col_template_comboP_internal( template, obj_cycl, keyword ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( template, obj_cycl, keyword ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 29790L)
  public static SubLObject clear_prep_semtrans_hash()
  {
    if( !$prep_semtrans_hash$.getGlobalValue().isHashtable() )
    {
      $prep_semtrans_hash$.setGlobalValue( Hashtables.make_hash_table( $int90$48, Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
    }
    return Hashtables.clrhash( $prep_semtrans_hash$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 29985L)
  public static SubLObject initialize_prep_semtrans_hash()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_prep_semtrans_hash();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const9$EverythingPSC, thread );
      final SubLObject pred_var = $const91$prepSemTrans;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( $const92$Post_NounPhraseModifyingFrame, THREE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( $const92$Post_NounPhraseModifyingFrame, THREE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw42$GAF, NIL, NIL );
              SubLObject done_var_$36 = NIL;
              final SubLObject token_var_$37 = NIL;
              while ( NIL == done_var_$36)
              {
                final SubLObject as = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$37 );
                final SubLObject valid_$38 = makeBoolean( !token_var_$37.eql( as ) );
                if( NIL != valid_$38 )
                {
                  add_to_prep_semtrans_hash( as );
                }
                done_var_$36 = makeBoolean( NIL == valid_$38 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$39, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return $prep_semtrans_hash$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 30306L)
  public static SubLObject add_to_prep_semtrans_hash(final SubLObject as)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject formula = fi.assertion_fi_formula( as, UNPROVIDED );
    final SubLObject wu = cycl_utilities.formula_arg1( formula, UNPROVIDED );
    final SubLObject strings = lexicon_accessors.get_strings_of_type( wu, $const82$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject semtrans = cycl_utilities.formula_arg4( formula, UNPROVIDED );
    SubLObject cdolist_list_var = strings;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sofar = Hashtables.gethash( string, $prep_semtrans_hash$.getGlobalValue(), NIL );
      if( NIL == subl_promotions.memberP( semtrans, sofar, $sym83$NPP_TERM_, UNPROVIDED ) )
      {
        if( NIL != lexicon_vars.$print_while_building_hashP$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str93$__Adding__S__S_to____S, new SubLObject[] { string, semtrans, sofar
          } );
        }
        Hashtables.sethash( string, $prep_semtrans_hash$.getGlobalValue(), conses_high.adjoin( semtrans, sofar, UNPROVIDED, UNPROVIDED ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return $prep_semtrans_hash$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 30961L)
  public static SubLObject semtrans_of_prep_string(final SubLObject string)
  {
    if( !Hashtables.hash_table_count( $prep_semtrans_hash$.getGlobalValue() ).isPositive() )
    {
      initialize_prep_semtrans_hash();
    }
    return Hashtables.gethash( string, $prep_semtrans_hash$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 31253L)
  public static SubLObject npp_term_complexity_L(final SubLObject obj1, final SubLObject obj2)
  {
    if( obj2.isAtom() )
    {
      return NIL;
    }
    if( NIL == obj1 )
    {
      return NIL;
    }
    if( obj1.isAtom() )
    {
      return T;
    }
    final SubLObject depth1 = function_terms.term_functional_complexity( obj1 );
    final SubLObject depth2 = function_terms.term_functional_complexity( obj2 );
    if( NIL != list_utilities.lesser_length_p( obj1, obj2 ) )
    {
      return T;
    }
    if( NIL != list_utilities.greater_length_p( obj1, obj2 ) )
    {
      return NIL;
    }
    if( depth1.numL( depth2 ) )
    {
      return T;
    }
    if( depth1.numG( depth2 ) )
    {
      return NIL;
    }
    if( NIL != list_utilities.lesser_length_p( list_utilities.flatten( obj1 ), list_utilities.flatten( obj2 ) ) )
    {
      return T;
    }
    if( NIL != list_utilities.greater_length_p( list_utilities.flatten( obj1 ), list_utilities.flatten( obj2 ) ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 31913L)
  public static SubLObject split_string_at_prepositions(final SubLObject string)
  {
    SubLObject tokens = string_utilities.string_tokenize( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject initial_stack = NIL;
    SubLObject ans = NIL;
    SubLObject token = NIL;
    token = tokens.first();
    while ( NIL != tokens)
    {
      if( NIL != lexicon_accessors.string_is_posP( token, $const82$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        ans = ConsesLow.cons( ConsesLow.list( string_utilities.bunge( Sequences.reverse( initial_stack ), UNPROVIDED ), string_utilities.bunge( tokens, UNPROVIDED ) ), ans );
      }
      initial_stack = ConsesLow.cons( token, initial_stack );
      tokens = tokens.rest();
      token = tokens.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 32393L)
  public static SubLObject find_final_phrase_beginning_with_pos(final SubLObject string, final SubLObject pos)
  {
    SubLObject tokens = string_utilities.string_tokenize( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject phrase = $str94$;
    SubLObject initial_stack = NIL;
    SubLObject token = NIL;
    token = tokens.first();
    while ( NIL != tokens && NIL == string_utilities.non_empty_stringP( phrase ))
    {
      if( NIL != lexicon_accessors.string_is_posP( token, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        phrase = string_utilities.bunge( tokens, UNPROVIDED );
      }
      else
      {
        initial_stack = ConsesLow.cons( token, initial_stack );
        tokens = tokens.rest();
      }
      token = tokens.first();
    }
    return Values.values( phrase, string_utilities.bunge( Sequences.reverse( initial_stack ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 33034L)
  public static SubLObject find_initial_strings_with_pos(final SubLObject string, final SubLObject pos)
  {
    SubLObject tokens = string_utilities.string_tokenize( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject initial_stack = NIL;
    SubLObject non_initial_words = NIL;
    SubLObject token = NIL;
    token = tokens.first();
    while ( NIL != tokens && NIL == non_initial_words)
    {
      if( NIL != lexicon_accessors.string_is_posP( token, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        initial_stack = ConsesLow.cons( token, initial_stack );
        tokens = tokens.rest();
      }
      else
      {
        non_initial_words = tokens;
      }
      token = tokens.first();
    }
    return Values.values( string_utilities.bunge( Sequences.reverse( initial_stack ), UNPROVIDED ), string_utilities.bunge( non_initial_words, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 33671L)
  public static SubLObject npp_add_morph_wrappers(final SubLObject parses)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = parses;
    SubLObject parse = NIL;
    parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ans = ConsesLow.cons( npp_add_number_wrapper( parse ), ans );
      cdolist_list_var = cdolist_list_var.rest();
      parse = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/np-parser.lisp", position = 33950L)
  public static SubLObject npp_add_number_wrapper(final SubLObject parse)
  {
    SubLObject cycl = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( parse, parse, $list95 );
    cycl = parse.first();
    SubLObject current = parse.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, parse, $list95 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return make_npp_parse( parsing_utilities.add_nl_number_wrapper( cycl, pred ), pred );
    }
    cdestructuring_bind.cdestructuring_bind_error( parse, $list95 );
    return NIL;
  }

  public static SubLObject declare_np_parser_file()
  {
    SubLFiles.declareFunction( me, "clear_npp_caches", "CLEAR-NPP-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "npp_tokenize_strings", "NPP-TOKENIZE-STRINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "npp_sentence_tokenize", "NPP-SENTENCE-TOKENIZE", 1, 3, false );
    SubLFiles.declareFunction( me, "npp_remove_no_denot_triples", "NPP-REMOVE-NO-DENOT-TRIPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_no_denot_tripleP", "NPP-NO-DENOT-TRIPLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_no_denot_quadP", "NPP-NO-DENOT-QUAD?", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_filter_tokens", "NPP-FILTER-TOKENS", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_bad_entryP", "NPP-BAD-ENTRY?", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_triefy_unknown_strings", "NPP-TRIEFY-UNKNOWN-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_triefy_unknown_string", "NPP-TRIEFY-UNKNOWN-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_known_stringP", "NPP-KNOWN-STRING?", 1, 1, false );
    SubLFiles.declareFunction( me, "npp_init_excluded_denot_preds", "NPP-INIT-EXCLUDED-DENOT-PREDS", 0, 0, false );
    SubLFiles.declareFunction( me, "npp_excluded_denot_predP", "NPP-EXCLUDED-DENOT-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_convert_chunkings", "NPP-CONVERT-CHUNKINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_convert_string_tokens", "NPP-CONVERT-STRING-TOKENS", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_convert_interval_tokens", "NPP-CONVERT-INTERVAL-TOKENS", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_convert_string_token", "NPP-CONVERT-STRING-TOKEN", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_convert_interval_token", "NPP-CONVERT-INTERVAL-TOKEN", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_add_original_string_tokens", "NPP-ADD-ORIGINAL-STRING-TOKENS", 3, 0, false );
    SubLFiles.declareFunction( me, "npp_make_original_string_value", "NPP-MAKE-ORIGINAL-STRING-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_entry_to_value_type", "NL-TRIE-ENTRY-TO-VALUE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_word_to_value_type", "NL-TRIE-WORD-TO-VALUE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_value_denot", "NPP-VALUE-DENOT", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_values_same_except_for_denot_p", "NPP-VALUES-SAME-EXCEPT-FOR-DENOT-P", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_value_typeP", "NPP-VALUE-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_values_of_typeP", "NPP-VALUES-OF-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_tripleP", "NPP-TRIPLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_proper_tripleP", "NPP-PROPER-TRIPLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_original_string_triple_p", "NPP-ORIGINAL-STRING-TRIPLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_quadP", "NPP-QUAD?", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_proper_quadP", "NPP-PROPER-QUAD?", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_denot_p", "NPP-DENOT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_posP", "NPP-POS?", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_predP", "NPP-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_wuP", "NPP-WU?", 1, 0, false );
    SubLFiles.declareFunction( me, "make_npp_value_type", "MAKE-NPP-VALUE-TYPE", 4, 1, false );
    SubLFiles.declareFunction( me, "make_npp_triple", "MAKE-NPP-TRIPLE", 3, 0, false );
    SubLFiles.declareFunction( me, "make_npp_quad", "MAKE-NPP-QUAD", 4, 0, false );
    SubLFiles.declareFunction( me, "npp_canonicalize_pos", "NPP-CANONICALIZE-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_npp_canonical_pos_table", "CLEAR-NPP-CANONICAL-POS-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_npp_canonical_pos_table", "REMOVE-NPP-CANONICAL-POS-TABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "npp_canonical_pos_table_internal", "NPP-CANONICAL-POS-TABLE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_canonical_pos_table", "NPP-CANONICAL-POS-TABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "get_subsumed_poses", "GET-SUBSUMED-POSES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_constraint_poses", "GET-CONSTRAINT-POSES", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_ok_with_no_denotsP", "NPP-OK-WITH-NO-DENOTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_name_to_value_type", "NL-TRIE-NAME-TO-VALUE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_stringE", "NPP-STRING=", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_termE", "NPP-TERM=", 2, 0, false );
    SubLFiles.declareFunction( me, "make_npp_parse", "MAKE-NPP-PARSE", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_parseP", "NPP-PARSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_proper_parseP", "NPP-PROPER-PARSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_original_string_parse_p", "NPP-ORIGINAL-STRING-PARSE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_parseE", "NPP-PARSE=", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_parse_cycl", "NPP-PARSE-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_parse_pred", "NPP-PARSE-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_combine_parse_lists", "NPP-COMBINE-PARSE-LISTS", 2, 0, false );
    SubLFiles.declareFunction( me, "np_wff_filter", "NP-WFF-FILTER", 0, 1, false );
    SubLFiles.declareFunction( me, "get_forts_for_np", "GET-FORTS-FOR-NP", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cycls_for_np", "GET-CYCLS-FOR-NP", 1, 0, false );
    SubLFiles.declareFunction( me, "get_best_cycls_for_np", "GET-BEST-CYCLS-FOR-NP", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_np", "PARSE-NP", 1, 1, false );
    SubLFiles.declareFunction( me, "parse_nbar", "PARSE-NBAR", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_possessive_np", "PARSE-POSSESSIVE-NP", 2, 0, false );
    SubLFiles.declareFunction( me, "wrap_and_reformulate_cycl", "WRAP-AND-REFORMULATE-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_nbar_via_lookup", "PARSE-NBAR-VIA-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_nbar_with_and", "PARSE-NBAR-WITH-AND", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_conjoined_nbars", "PARSE-CONJOINED-NBARS", 2, 1, false );
    SubLFiles.declareFunction( me, "parse_nbar_pp", "PARSE-NBAR-PP", 2, 0, false );
    SubLFiles.declareFunction( me, "split_and_parse_pp", "SPLIT-AND-PARSE-PP", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_pp_in_np", "PARSE-PP-IN-NP", 2, 0, false );
    SubLFiles.declareFunction( me, "specify_prep_semtrans", "SPECIFY-PREP-SEMTRANS", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_wf_col_template_comboP", "CLEAR-WF-COL-TEMPLATE-COMBO?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wf_col_template_comboP", "REMOVE-WF-COL-TEMPLATE-COMBO?", 3, 0, false );
    SubLFiles.declareFunction( me, "wf_col_template_comboP_internal", "WF-COL-TEMPLATE-COMBO?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "wf_col_template_comboP", "WF-COL-TEMPLATE-COMBO?", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_prep_semtrans_hash", "CLEAR-PREP-SEMTRANS-HASH", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_prep_semtrans_hash", "INITIALIZE-PREP-SEMTRANS-HASH", 0, 0, false );
    SubLFiles.declareFunction( me, "add_to_prep_semtrans_hash", "ADD-TO-PREP-SEMTRANS-HASH", 1, 0, false );
    SubLFiles.declareFunction( me, "semtrans_of_prep_string", "SEMTRANS-OF-PREP-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_term_complexity_L", "NPP-TERM-COMPLEXITY-<", 2, 0, false );
    SubLFiles.declareFunction( me, "split_string_at_prepositions", "SPLIT-STRING-AT-PREPOSITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "find_final_phrase_beginning_with_pos", "FIND-FINAL-PHRASE-BEGINNING-WITH-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "find_initial_strings_with_pos", "FIND-INITIAL-STRINGS-WITH-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "npp_add_morph_wrappers", "NPP-ADD-MORPH-WRAPPERS", 1, 0, false );
    SubLFiles.declareFunction( me, "npp_add_number_wrapper", "NPP-ADD-NUMBER-WRAPPER", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_np_parser_file()
  {
    $clear_npp_caches_each_parseP$ = SubLFiles.defparameter( "*CLEAR-NPP-CACHES-EACH-PARSE?*", T );
    $npp_always_use_mwpP$ = SubLFiles.deflexical( "*NPP-ALWAYS-USE-MWP?*", NIL );
    $npp_denot_preds_to_exclude$ = SubLFiles.defparameter( "*NPP-DENOT-PREDS-TO-EXCLUDE*", NIL );
    $npp_canonical_pos_table_caching_state$ = SubLFiles.deflexical( "*NPP-CANONICAL-POS-TABLE-CACHING-STATE*", NIL );
    $code_constraint_poses$ = SubLFiles.deflexical( "*CODE-CONSTRAINT-POSES*", $list40 );
    $npp_specify_semtransP$ = SubLFiles.defparameter( "*NPP-SPECIFY-SEMTRANS?*", NIL );
    $wf_col_template_comboP_caching_state$ = SubLFiles.deflexical( "*WF-COL-TEMPLATE-COMBO?-CACHING-STATE*", NIL );
    $prep_semtrans_hash$ = SubLFiles.deflexical( "*PREP-SEMTRANS-HASH*", maybeDefault( $sym89$_PREP_SEMTRANS_HASH_, $prep_semtrans_hash$, () -> ( Hashtables.make_hash_table( $int90$48, Symbols.symbol_function( EQUALP ),
        UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_np_parser_file()
  {
    memoization_state.note_globally_cached_function( $sym21$NPP_CANONICAL_POS_TABLE );
    access_macros.define_obsolete_register( $sym49$GET_FORTS_FOR_NP, NIL );
    access_macros.define_obsolete_register( $sym50$GET_CYCLS_FOR_NP, $list51 );
    access_macros.define_obsolete_register( $sym52$GET_BEST_CYCLS_FOR_NP, NIL );
    access_macros.define_obsolete_register( $sym54$PARSE_NP, NIL );
    access_macros.define_obsolete_register( $sym55$PARSE_NBAR, NIL );
    memoization_state.note_globally_cached_function( $sym86$WF_COL_TEMPLATE_COMBO_ );
    subl_macro_promotions.declare_defglobal( $sym89$_PREP_SEMTRANS_HASH_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_np_parser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_np_parser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_np_parser_file();
  }
  static
  {
    me = new np_parser();
    $clear_npp_caches_each_parseP$ = null;
    $npp_always_use_mwpP$ = null;
    $npp_denot_preds_to_exclude$ = null;
    $npp_canonical_pos_table_caching_state$ = null;
    $code_constraint_poses$ = null;
    $npp_specify_semtransP$ = null;
    $wf_col_template_comboP_caching_state$ = null;
    $prep_semtrans_hash$ = null;
    $kw0$TRIPLES = makeKeyword( "TRIPLES" );
    $kw1$INTERVAL = makeKeyword( "INTERVAL" );
    $kw2$DILIGENT = makeKeyword( "DILIGENT" );
    $sym3$STANDARD_STRING_TOKENIZE = makeSymbol( "STANDARD-STRING-TOKENIZE" );
    $sym4$NPP_NO_DENOT_TRIPLE_ = makeSymbol( "NPP-NO-DENOT-TRIPLE?" );
    $kw5$NO_DENOT = makeKeyword( "NO-DENOT" );
    $const6$abbreviationForLexicalWord = constant_handles.reader_make_constant_shell( makeString( "abbreviationForLexicalWord" ) );
    $sym7$NPP_KNOWN_STRING_ = makeSymbol( "NPP-KNOWN-STRING?" );
    $sym8$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const9$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const10$DenotationPredicate_ExcludedFromN = constant_handles.reader_make_constant_shell( makeString( "DenotationPredicate-ExcludedFromNPParser" ) );
    $kw11$NONE = makeKeyword( "NONE" );
    $sym12$NPP_VALUES_SAME_EXCEPT_FOR_DENOT_P = makeSymbol( "NPP-VALUES-SAME-EXCEPT-FOR-DENOT-P" );
    $sym13$INTERVAL_TOKEN_END = makeSymbol( "INTERVAL-TOKEN-END" );
    $sym14$INTERVAL_TOKEN_START = makeSymbol( "INTERVAL-TOKEN-START" );
    $const15$CharacterString = constant_handles.reader_make_constant_shell( makeString( "CharacterString" ) );
    $kw16$ORIGINAL_STRING = makeKeyword( "ORIGINAL-STRING" );
    $kw17$QUADS = makeKeyword( "QUADS" );
    $str18$_S_is_not_a_valid_NPP_value_type = makeString( "~S is not a valid NPP value type" );
    $const19$NounPhrase = constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) );
    $str20$Don_t_know_how_to_make_NPP_value_ = makeString( "Don't know how to make NPP value type ~S" );
    $sym21$NPP_CANONICAL_POS_TABLE = makeSymbol( "NPP-CANONICAL-POS-TABLE" );
    $sym22$_NPP_CANONICAL_POS_TABLE_CACHING_STATE_ = makeSymbol( "*NPP-CANONICAL-POS-TABLE-CACHING-STATE*" );
    $kw23$BREADTH = makeKeyword( "BREADTH" );
    $kw24$QUEUE = makeKeyword( "QUEUE" );
    $kw25$STACK = makeKeyword( "STACK" );
    $const26$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $sym27$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw28$ERROR = makeKeyword( "ERROR" );
    $str29$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym30$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw31$CERROR = makeKeyword( "CERROR" );
    $str32$continue_anyway = makeString( "continue anyway" );
    $kw33$WARN = makeKeyword( "WARN" );
    $str34$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const35$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const36$semTransPredForPOS = constant_handles.reader_make_constant_shell( makeString( "semTransPredForPOS" ) );
    $str37$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str38$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str39$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $list40 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PossessivePronoun-Pre" ) ) );
    $const41$ConstituentTypeConstraintFn = constant_handles.reader_make_constant_shell( makeString( "ConstituentTypeConstraintFn" ) );
    $kw42$GAF = makeKeyword( "GAF" );
    $const43$ProperNoun = constant_handles.reader_make_constant_shell( makeString( "ProperNoun" ) );
    $const44$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $const45$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $const46$partOfSpeech = constant_handles.reader_make_constant_shell( makeString( "partOfSpeech" ) );
    $sym47$NPP_PARSE_ = makeSymbol( "NPP-PARSE?" );
    $sym48$NPP_PARSE_ = makeSymbol( "NPP-PARSE=" );
    $sym49$GET_FORTS_FOR_NP = makeSymbol( "GET-FORTS-FOR-NP" );
    $sym50$GET_CYCLS_FOR_NP = makeSymbol( "GET-CYCLS-FOR-NP" );
    $list51 = ConsesLow.list( makeSymbol( "PS-GET-CYCLS-FOR-NP" ) );
    $sym52$GET_BEST_CYCLS_FOR_NP = makeSymbol( "GET-BEST-CYCLS-FOR-NP" );
    $sym53$STRINGP = makeSymbol( "STRINGP" );
    $sym54$PARSE_NP = makeSymbol( "PARSE-NP" );
    $sym55$PARSE_NBAR = makeSymbol( "PARSE-NBAR" );
    $list56 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PhraseFn-Bar1" ) ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ) );
    $const57$PossessivePronoun_Pre = constant_handles.reader_make_constant_shell( makeString( "PossessivePronoun-Pre" ) );
    $list58 = ConsesLow.list( makeSymbol( "NBAR-DENOT" ), makeSymbol( "NBAR-PRED" ) );
    $const59$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationFromFn" ) );
    $const60$possessiveRelation = constant_handles.reader_make_constant_shell( makeString( "possessiveRelation" ) );
    $list61 = ConsesLow.list( makeSymbol( "DENOT" ), makeSymbol( "POS" ), makeSymbol( "PRED" ) );
    $const62$CoordinatingConjunction = constant_handles.reader_make_constant_shell( makeString( "CoordinatingConjunction" ) );
    $str63$and_ = makeString( "and " );
    $sym64$NPP_STRING_ = makeSymbol( "NPP-STRING=" );
    $kw65$UNION = makeKeyword( "UNION" );
    $const66$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $str67$_ = makeString( " " );
    $kw68$INTERSECTION = makeKeyword( "INTERSECTION" );
    $list69 = ConsesLow.list( makeSymbol( "NBAR1-CYCL" ), makeSymbol( "NBAR1-PRED" ) );
    $list70 = ConsesLow.list( makeSymbol( "NBAR2-CYCL" ), makeSymbol( "NBAR2-PRED" ) );
    $const71$TheCoordinationSet = constant_handles.reader_make_constant_shell( makeString( "TheCoordinationSet" ) );
    $const72$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) );
    $const73$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const74$plural = constant_handles.reader_make_constant_shell( makeString( "plural" ) );
    $list75 = ConsesLow.list( makeSymbol( "NBAR-CYCL" ), makeSymbol( "NBAR-POS-PRED" ) );
    $const76$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $const77$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $sym78$_OBJ = makeSymbol( "?OBJ" );
    $const79$CollectionSubsetFn = constant_handles.reader_make_constant_shell( makeString( "CollectionSubsetFn" ) );
    $const80$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $kw81$NOUN = makeKeyword( "NOUN" );
    $const82$Preposition = constant_handles.reader_make_constant_shell( makeString( "Preposition" ) );
    $sym83$NPP_TERM_ = makeSymbol( "NPP-TERM=" );
    $kw84$OBJECT = makeKeyword( "OBJECT" );
    $const85$GeneralEnglishMt = constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) );
    $sym86$WF_COL_TEMPLATE_COMBO_ = makeSymbol( "WF-COL-TEMPLATE-COMBO?" );
    $sym87$_WF_COL_TEMPLATE_COMBO__CACHING_STATE_ = makeSymbol( "*WF-COL-TEMPLATE-COMBO?-CACHING-STATE*" );
    $int88$1024 = makeInteger( 1024 );
    $sym89$_PREP_SEMTRANS_HASH_ = makeSymbol( "*PREP-SEMTRANS-HASH*" );
    $int90$48 = makeInteger( 48 );
    $const91$prepSemTrans = constant_handles.reader_make_constant_shell( makeString( "prepSemTrans" ) );
    $const92$Post_NounPhraseModifyingFrame = constant_handles.reader_make_constant_shell( makeString( "Post-NounPhraseModifyingFrame" ) );
    $str93$__Adding__S__S_to____S = makeString( "~%Adding ~S ~S to : ~S" );
    $str94$ = makeString( "" );
    $list95 = ConsesLow.list( makeSymbol( "CYCL" ), makeSymbol( "PRED" ) );
  }
}
/*
 * 
 * Total time: 922 ms
 * 
 */