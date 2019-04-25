package com.cyc.cycjava.cycl.wordnet_import;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wordnet_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.wordnet_utilities";
  public static final String myFingerPrint = "46a702fbef14eec12756061c3b5799c8b521461d75e24c8c36e97c868eb768ca";
  private static final SubLObject $const0$WordNet2_0_KS;
  private static final SubLSymbol $kw1$WN_SKS_REGISTERED;
  private static final SubLString $str2$__WordNet2_0_KS_is_not_registered;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$CYCL_REPRESENTED_TERM_P;
  private static final SubLSymbol $kw5$WEAK;
  private static final SubLSymbol $kw6$ALL;
  private static final SubLSymbol $kw7$EXACT;
  private static final SubLSymbol $sym8$WNI_EXACT_SYNSET_TERM_MATCHES;
  private static final SubLSymbol $kw9$STRONG;
  private static final SubLSymbol $sym10$WNI_STRONG_SYNSET_TERM_MATCHES;
  private static final SubLSymbol $sym11$WN_WEAK_SYNSET_TERM_MATCHES_WITH_POS_CHECK;
  private static final SubLString $str12$Wrong_MATCH_TYPE_input___S__;
  private static final SubLSymbol $kw13$COLLECTIONS;
  private static final SubLSymbol $kw14$INDIVIDUALS;

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 1261L)
  public static SubLObject wn_check_sks_registered()
  {
    if( NIL != sksi_infrastructure_utilities.sk_source_registeredP( $const0$WordNet2_0_KS, UNPROVIDED ) )
    {
      return $kw1$WN_SKS_REGISTERED;
    }
    return Errors.error( $str2$__WordNet2_0_KS_is_not_registered );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 1552L)
  public static SubLObject wn_string_for_word_unitXpos(final SubLObject word_unit, final SubLObject pos)
  {
    return lexicon_accessors.get_strings_of_type( word_unit, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 1784L)
  public static SubLObject wn_allowed_pos(final SubLObject pos)
  {
    final SubLObject allowed_pos = $list3;
    if( NIL != subl_promotions.memberP( pos, allowed_pos, EQ, UNPROVIDED ) )
    {
      return pos;
    }
    return conses_high.intersection( genls.all_genls( pos, UNPROVIDED, UNPROVIDED ), allowed_pos, EQ, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 2229L)
  public static SubLObject wn_ranked_synonyms_for_word_unitXpos(final SubLObject word_unit, SubLObject pos)
  {
    assert NIL != cycl_grammar.cycl_represented_term_p( word_unit ) : word_unit;
    assert NIL != cycl_grammar.cycl_represented_term_p( pos ) : pos;
    wn_check_sks_registered();
    final SubLObject word_string = wn_string_for_word_unitXpos( word_unit, pos );
    SubLObject synonyms = NIL;
    pos = wn_allowed_pos( pos );
    SubLObject cdolist_list_var = wordnet_import.wni_synsets_for_english_word_stringXpos( word_string, pos );
    SubLObject synset = NIL;
    synset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      synonyms = ConsesLow.cons( wordnet_import.wni_synset_words( synset ), synonyms );
      cdolist_list_var = cdolist_list_var.rest();
      synset = cdolist_list_var.first();
    }
    return Sequences.nreverse( synonyms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 2804L)
  public static SubLObject wn_all_synonyms_for_word_unitXpos(final SubLObject word_unit, SubLObject pos)
  {
    assert NIL != cycl_grammar.cycl_represented_term_p( word_unit ) : word_unit;
    assert NIL != cycl_grammar.cycl_represented_term_p( pos ) : pos;
    wn_check_sks_registered();
    final SubLObject word_string = wn_string_for_word_unitXpos( word_unit, pos );
    SubLObject synonyms = NIL;
    pos = wn_allowed_pos( pos );
    SubLObject cdolist_list_var = wordnet_import.wni_synsets_for_english_word_stringXpos( word_string, pos );
    SubLObject synset = NIL;
    synset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      synonyms = conses_high.union( synonyms, wordnet_import.wni_synset_words( synset ), EQUAL, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      synset = cdolist_list_var.first();
    }
    return synonyms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 3339L)
  public static SubLObject wn_glosses_for_word_unitXpos(final SubLObject word_unit, SubLObject pos)
  {
    assert NIL != cycl_grammar.cycl_represented_term_p( word_unit ) : word_unit;
    assert NIL != cycl_grammar.cycl_represented_term_p( pos ) : pos;
    wn_check_sks_registered();
    final SubLObject word_string = wn_string_for_word_unitXpos( word_unit, pos );
    SubLObject glosses = NIL;
    pos = wn_allowed_pos( pos );
    SubLObject cdolist_list_var = wordnet_import.wni_synsets_for_english_word_stringXpos( word_string, pos );
    SubLObject synset = NIL;
    synset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gloss = wordnet_import.wni_synset_gloss( synset );
      if( NIL != gloss )
      {
        glosses = ConsesLow.cons( gloss, glosses );
      }
      cdolist_list_var = cdolist_list_var.rest();
      synset = cdolist_list_var.first();
    }
    return Sequences.nreverse( glosses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 3902L)
  public static SubLObject wn_ranked_example_phrases_for_word_unitXpos(final SubLObject word_unit, SubLObject pos)
  {
    assert NIL != cycl_grammar.cycl_represented_term_p( word_unit ) : word_unit;
    assert NIL != cycl_grammar.cycl_represented_term_p( pos ) : pos;
    wn_check_sks_registered();
    final SubLObject word_string = wn_string_for_word_unitXpos( word_unit, pos );
    SubLObject example_phrases = NIL;
    pos = wn_allowed_pos( pos );
    SubLObject cdolist_list_var = wordnet_import.wni_synsets_for_english_word_stringXpos( word_string, pos );
    SubLObject synset = NIL;
    synset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject example_phrase = wordnet_import.wni_synset_example_phrases( synset );
      if( NIL != example_phrase )
      {
        example_phrases = ConsesLow.cons( example_phrase, example_phrases );
      }
      cdolist_list_var = cdolist_list_var.rest();
      synset = cdolist_list_var.first();
    }
    return Sequences.nreverse( example_phrases );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 4591L)
  public static SubLObject wn_all_example_phrases_for_word_unitXpos(final SubLObject word_unit, SubLObject pos)
  {
    assert NIL != cycl_grammar.cycl_represented_term_p( word_unit ) : word_unit;
    assert NIL != cycl_grammar.cycl_represented_term_p( pos ) : pos;
    wn_check_sks_registered();
    final SubLObject word_string = wn_string_for_word_unitXpos( word_unit, pos );
    SubLObject example_phrases = NIL;
    pos = wn_allowed_pos( pos );
    SubLObject cdolist_list_var = wordnet_import.wni_synsets_for_english_word_stringXpos( word_string, pos );
    SubLObject synset = NIL;
    synset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      example_phrases = conses_high.union( example_phrases, wordnet_import.wni_synset_example_phrases( synset ), UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      synset = cdolist_list_var.first();
    }
    return example_phrases;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 5182L)
  public static SubLObject wn_ranked_hypernyms_for_word_unitXpos(final SubLObject word_unit, SubLObject pos)
  {
    assert NIL != cycl_grammar.cycl_represented_term_p( word_unit ) : word_unit;
    assert NIL != cycl_grammar.cycl_represented_term_p( pos ) : pos;
    wn_check_sks_registered();
    final SubLObject word_string = wn_string_for_word_unitXpos( word_unit, pos );
    SubLObject hypernyms = NIL;
    pos = wn_allowed_pos( pos );
    SubLObject cdolist_list_var = wordnet_import.wni_synsets_for_english_word_stringXpos( word_string, pos );
    SubLObject synset = NIL;
    synset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_hypernyms = NIL;
      SubLObject cdolist_list_var_$1 = wordnet_import.wni_hypernyms( synset );
      SubLObject hypernym_synset = NIL;
      hypernym_synset = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        current_hypernyms = conses_high.union( wordnet_import.wni_synset_words( hypernym_synset ), current_hypernyms, EQUAL, UNPROVIDED );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        hypernym_synset = cdolist_list_var_$1.first();
      }
      if( NIL != current_hypernyms )
      {
        hypernyms = ConsesLow.cons( current_hypernyms, hypernyms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      synset = cdolist_list_var.first();
    }
    return Sequences.nreverse( hypernyms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 5969L)
  public static SubLObject wn_all_hypernyms_for_word_unitXpos(final SubLObject word_unit, SubLObject pos)
  {
    assert NIL != cycl_grammar.cycl_represented_term_p( word_unit ) : word_unit;
    assert NIL != cycl_grammar.cycl_represented_term_p( pos ) : pos;
    wn_check_sks_registered();
    final SubLObject word_string = wn_string_for_word_unitXpos( word_unit, pos );
    SubLObject hypernyms = NIL;
    pos = wn_allowed_pos( pos );
    SubLObject cdolist_list_var = wordnet_import.wni_synsets_for_english_word_stringXpos( word_string, pos );
    SubLObject synset = NIL;
    synset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$2 = wordnet_import.wni_hypernyms( synset );
      SubLObject hypernym_synset = NIL;
      hypernym_synset = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        hypernyms = conses_high.union( wordnet_import.wni_synset_words( hypernym_synset ), hypernyms, EQUAL, UNPROVIDED );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        hypernym_synset = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      synset = cdolist_list_var.first();
    }
    return hypernyms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 6576L)
  public static SubLObject wn_weak_synset_term_matches_with_pos_check(final SubLObject synset, final SubLObject collectionP)
  {
    return wordnet_import.wni_weak_synset_term_matches( synset, collectionP, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 6718L)
  public static SubLObject wn_ranked_candidate_cycls_for_word_unitXpos(final SubLObject word_unit, SubLObject pos, SubLObject match_type, SubLObject term_type, SubLObject lexicon_mt)
  {
    if( match_type == UNPROVIDED )
    {
      match_type = $kw5$WEAK;
    }
    if( term_type == UNPROVIDED )
    {
      term_type = $kw6$ALL;
    }
    if( lexicon_mt == UNPROVIDED )
    {
      lexicon_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_grammar.cycl_represented_term_p( word_unit ) : word_unit;
    assert NIL != cycl_grammar.cycl_represented_term_p( pos ) : pos;
    wn_check_sks_registered();
    final SubLObject word_string = wn_string_for_word_unitXpos( word_unit, pos );
    SubLObject match_function = NIL;
    SubLObject cycls = NIL;
    final SubLObject pcase_var = match_type;
    if( pcase_var.eql( $kw7$EXACT ) )
    {
      match_function = $sym8$WNI_EXACT_SYNSET_TERM_MATCHES;
    }
    else if( pcase_var.eql( $kw9$STRONG ) )
    {
      match_function = $sym10$WNI_STRONG_SYNSET_TERM_MATCHES;
    }
    else if( pcase_var.eql( $kw5$WEAK ) )
    {
      match_function = $sym11$WN_WEAK_SYNSET_TERM_MATCHES_WITH_POS_CHECK;
    }
    else
    {
      Errors.error( $str12$Wrong_MATCH_TYPE_input___S__, match_type );
    }
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lexicon_mt, thread );
      pos = wn_allowed_pos( pos );
      SubLObject cdolist_list_var = wordnet_import.wni_synsets_for_english_word_stringXpos( word_string, pos );
      SubLObject synset = NIL;
      synset = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( match_type == $kw7$EXACT )
        {
          cycls = ConsesLow.cons( Functions.funcall( match_function, synset ), cycls );
        }
        else
        {
          final SubLObject pcase_var2 = term_type;
          if( pcase_var2.eql( $kw6$ALL ) )
          {
            cycls = ConsesLow.cons( conses_high.union( Functions.funcall( match_function, synset, T ), Functions.funcall( match_function, synset, NIL ), UNPROVIDED, UNPROVIDED ), cycls );
          }
          else if( pcase_var2.eql( $kw13$COLLECTIONS ) )
          {
            cycls = ConsesLow.cons( Functions.funcall( match_function, synset, T ), cycls );
          }
          else if( pcase_var2.eql( $kw14$INDIVIDUALS ) )
          {
            cycls = ConsesLow.cons( Functions.funcall( match_function, synset, NIL ), cycls );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        synset = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Sequences.remove( NIL, Sequences.nreverse( cycls ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/wordnet-utilities.lisp", position = 8285L)
  public static SubLObject wn_all_candidate_cycls_for_word_unitXpos(final SubLObject word_unit, SubLObject pos, SubLObject match_type, SubLObject term_type, SubLObject lexicon_mt)
  {
    if( match_type == UNPROVIDED )
    {
      match_type = $kw5$WEAK;
    }
    if( term_type == UNPROVIDED )
    {
      term_type = $kw6$ALL;
    }
    if( lexicon_mt == UNPROVIDED )
    {
      lexicon_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_grammar.cycl_represented_term_p( word_unit ) : word_unit;
    assert NIL != cycl_grammar.cycl_represented_term_p( pos ) : pos;
    wn_check_sks_registered();
    final SubLObject word_string = wn_string_for_word_unitXpos( word_unit, pos );
    SubLObject match_function = NIL;
    SubLObject cycls = NIL;
    final SubLObject pcase_var = match_type;
    if( pcase_var.eql( $kw7$EXACT ) )
    {
      match_function = $sym8$WNI_EXACT_SYNSET_TERM_MATCHES;
    }
    else if( pcase_var.eql( $kw9$STRONG ) )
    {
      match_function = $sym10$WNI_STRONG_SYNSET_TERM_MATCHES;
    }
    else if( pcase_var.eql( $kw5$WEAK ) )
    {
      match_function = $sym11$WN_WEAK_SYNSET_TERM_MATCHES_WITH_POS_CHECK;
    }
    else
    {
      Errors.error( $str12$Wrong_MATCH_TYPE_input___S__, match_type );
    }
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lexicon_mt, thread );
      pos = wn_allowed_pos( pos );
      SubLObject cdolist_list_var = wordnet_import.wni_synsets_for_english_word_stringXpos( word_string, pos );
      SubLObject synset = NIL;
      synset = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( match_type == $kw7$EXACT )
        {
          cycls = conses_high.union( cycls, Functions.funcall( match_function, synset ), UNPROVIDED, UNPROVIDED );
        }
        else
        {
          final SubLObject pcase_var2 = term_type;
          if( pcase_var2.eql( $kw6$ALL ) )
          {
            cycls = conses_high.union( cycls, Functions.funcall( match_function, synset, T ), UNPROVIDED, UNPROVIDED );
            cycls = conses_high.union( cycls, Functions.funcall( match_function, synset, NIL ), UNPROVIDED, UNPROVIDED );
          }
          else if( pcase_var2.eql( $kw13$COLLECTIONS ) )
          {
            cycls = conses_high.union( cycls, Functions.funcall( match_function, synset, T ), UNPROVIDED, UNPROVIDED );
          }
          else if( pcase_var2.eql( $kw14$INDIVIDUALS ) )
          {
            cycls = conses_high.union( cycls, Functions.funcall( match_function, synset, NIL ), UNPROVIDED, UNPROVIDED );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        synset = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return cycls;
  }

  public static SubLObject declare_wordnet_utilities_file()
  {
    SubLFiles.declareFunction( me, "wn_check_sks_registered", "WN-CHECK-SKS-REGISTERED", 0, 0, false );
    SubLFiles.declareFunction( me, "wn_string_for_word_unitXpos", "WN-STRING-FOR-WORD-UNIT&POS", 2, 0, false );
    SubLFiles.declareFunction( me, "wn_allowed_pos", "WN-ALLOWED-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "wn_ranked_synonyms_for_word_unitXpos", "WN-RANKED-SYNONYMS-FOR-WORD-UNIT&POS", 2, 0, false );
    SubLFiles.declareFunction( me, "wn_all_synonyms_for_word_unitXpos", "WN-ALL-SYNONYMS-FOR-WORD-UNIT&POS", 2, 0, false );
    SubLFiles.declareFunction( me, "wn_glosses_for_word_unitXpos", "WN-GLOSSES-FOR-WORD-UNIT&POS", 2, 0, false );
    SubLFiles.declareFunction( me, "wn_ranked_example_phrases_for_word_unitXpos", "WN-RANKED-EXAMPLE-PHRASES-FOR-WORD-UNIT&POS", 2, 0, false );
    SubLFiles.declareFunction( me, "wn_all_example_phrases_for_word_unitXpos", "WN-ALL-EXAMPLE-PHRASES-FOR-WORD-UNIT&POS", 2, 0, false );
    SubLFiles.declareFunction( me, "wn_ranked_hypernyms_for_word_unitXpos", "WN-RANKED-HYPERNYMS-FOR-WORD-UNIT&POS", 2, 0, false );
    SubLFiles.declareFunction( me, "wn_all_hypernyms_for_word_unitXpos", "WN-ALL-HYPERNYMS-FOR-WORD-UNIT&POS", 2, 0, false );
    SubLFiles.declareFunction( me, "wn_weak_synset_term_matches_with_pos_check", "WN-WEAK-SYNSET-TERM-MATCHES-WITH-POS-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "wn_ranked_candidate_cycls_for_word_unitXpos", "WN-RANKED-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS", 2, 3, false );
    SubLFiles.declareFunction( me, "wn_all_candidate_cycls_for_word_unitXpos", "WN-ALL-CANDIDATE-CYCLS-FOR-WORD-UNIT&POS", 2, 3, false );
    return NIL;
  }

  public static SubLObject init_wordnet_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_wordnet_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_wordnet_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_wordnet_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_wordnet_utilities_file();
  }
  static
  {
    me = new wordnet_utilities();
    $const0$WordNet2_0_KS = constant_handles.reader_make_constant_shell( makeString( "WordNet2_0-KS" ) );
    $kw1$WN_SKS_REGISTERED = makeKeyword( "WN-SKS-REGISTERED" );
    $str2$__WordNet2_0_KS_is_not_registered = makeString( "#$WordNet2_0-KS is not registered" );
    $list3 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Noun" ) ), constant_handles.reader_make_constant_shell( makeString( "Verb" ) ), constant_handles.reader_make_constant_shell(
        makeString( "Adjective" ) ), constant_handles.reader_make_constant_shell( makeString( "Adverb" ) ) );
    $sym4$CYCL_REPRESENTED_TERM_P = makeSymbol( "CYCL-REPRESENTED-TERM-P" );
    $kw5$WEAK = makeKeyword( "WEAK" );
    $kw6$ALL = makeKeyword( "ALL" );
    $kw7$EXACT = makeKeyword( "EXACT" );
    $sym8$WNI_EXACT_SYNSET_TERM_MATCHES = makeSymbol( "WNI-EXACT-SYNSET-TERM-MATCHES" );
    $kw9$STRONG = makeKeyword( "STRONG" );
    $sym10$WNI_STRONG_SYNSET_TERM_MATCHES = makeSymbol( "WNI-STRONG-SYNSET-TERM-MATCHES" );
    $sym11$WN_WEAK_SYNSET_TERM_MATCHES_WITH_POS_CHECK = makeSymbol( "WN-WEAK-SYNSET-TERM-MATCHES-WITH-POS-CHECK" );
    $str12$Wrong_MATCH_TYPE_input___S__ = makeString( "Wrong MATCH-TYPE input: ~S~%" );
    $kw13$COLLECTIONS = makeKeyword( "COLLECTIONS" );
    $kw14$INDIVIDUALS = makeKeyword( "INDIVIDUALS" );
  }
}
/*
 * 
 * Total time: 87 ms
 * 
 */