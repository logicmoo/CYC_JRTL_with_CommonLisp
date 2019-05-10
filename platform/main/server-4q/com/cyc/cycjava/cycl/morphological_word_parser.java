package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class morphological_word_parser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.morphological_word_parser";
  public static final String myFingerPrint = "1dc8aae2bf501da3d488932018cc5cf77796841e70e9f0e19b8627090a2f33a8";
  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14854L)
  private static SubLSymbol $complex_word_string_is_speech_partP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 15703L)
  private static SubLSymbol $parse_complex_word_string_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 16550L)
  private static SubLSymbol $mwp_initializedP$;
  private static final SubLSymbol $sym0$STRINGP;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw4$WORD_DENOT;
  private static final SubLSymbol $kw5$WORD_POS_PRED;
  private static final SubLSymbol $kw6$WORD_UNIT;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$BASE;
  private static final SubLSymbol $kw10$AFFIX;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$SEM_PRED;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$SPEECH_PART_;
  private static final SubLSymbol $sym17$KEYWORDP;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$FIRST;
  private static final SubLSymbol $sym25$SECOND;
  private static final SubLSymbol $sym26$THIRD;
  private static final SubLSymbol $sym27$SPEECH_PART_PRED_;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$LEXICAL_WORD_;
  private static final SubLSymbol $sym31$POS_OF_PRED;
  private static final SubLSymbol $sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_;
  private static final SubLSymbol $sym33$_COMPLEX_WORD_STRING_IS_SPEECH_PART__CACHING_STATE_;
  private static final SubLInteger $int34$200;
  private static final SubLSymbol $sym35$PARSE_COMPLEX_WORD_STRING;
  private static final SubLSymbol $sym36$_PARSE_COMPLEX_WORD_STRING_CACHING_STATE_;
  private static final SubLInteger $int37$1000;
  private static final SubLSymbol $sym38$CLEAR_PARSE_COMPLEX_WORD_STRING;
  private static final SubLSymbol $sym39$_MWP_INITIALIZED__;
  private static final SubLSymbol $sym40$MWP_PSEUDO_FUNCTION_P;
  private static final SubLSymbol $kw41$APPLY_AFFIX;
  private static final SubLSymbol $kw42$DENOT_OF;
  private static final SubLString $str43$Morphological_Word_Parser;
  private static final SubLString $str44$Morphological_Word_Parser_Test_Su;
  private static final SubLList $list45;

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 928L)
  public static SubLObject parse_affixes(final SubLObject word_string, SubLObject suppress_fake_denotsP)
  {
    if( suppress_fake_denotsP == UNPROVIDED )
    {
      suppress_fake_denotsP = T;
    }
    assert NIL != Types.stringp( word_string ) : word_string;
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject ans = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$1;
    SubLObject word_denot_tail;
    SubLObject word_denot;
    SubLObject word_pos_pred_tail;
    SubLObject word_pos_pred;
    SubLObject word_unit_tail;
    SubLObject word_unit;
    SubLObject item_var;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$1 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
          current_$1 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
          if( NIL == conses_high.member( current_$1, $list2, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$1 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
        }
        word_denot_tail = cdestructuring_bind.property_list_member( $kw4$WORD_DENOT, current );
        word_denot = ( NIL != word_denot_tail ) ? conses_high.cadr( word_denot_tail ) : NIL;
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw5$WORD_POS_PRED, current );
        word_pos_pred = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL;
        word_unit_tail = cdestructuring_bind.property_list_member( $kw6$WORD_UNIT, current );
        word_unit = ( NIL != word_unit_tail ) ? conses_high.cadr( word_unit_tail ) : NIL;
        if( ( NIL != word_denot || NIL != word_pos_pred || NIL != word_unit ) && NIL != denot_acceptableP( word_denot, suppress_fake_denotsP ) )
        {
          item_var = ConsesLow.list( word_denot, word_pos_pred, word_unit );
          if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            ans = ConsesLow.cons( item_var, ans );
          }
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 1830L)
  public static SubLObject derived_nl_trie_words(final SubLObject word_string)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    mwp_check_initializations();
    return morph_word.derived_nl_trie_words_int( word_string, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 2199L)
  public static SubLObject mwp_find_stems(final SubLObject word_string)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject ans = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$2;
    SubLObject base_tail;
    SubLObject base;
    SubLObject affix_tail;
    SubLObject affix;
    SubLObject word_pos_pred_tail;
    SubLObject word_pos_pred;
    SubLObject item_var;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$2 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list7 );
          current_$2 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list7 );
          if( NIL == conses_high.member( current_$2, $list8, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$2 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
        }
        base_tail = cdestructuring_bind.property_list_member( $kw9$BASE, current );
        base = ( NIL != base_tail ) ? conses_high.cadr( base_tail ) : NIL;
        affix_tail = cdestructuring_bind.property_list_member( $kw10$AFFIX, current );
        affix = ( NIL != affix_tail ) ? conses_high.cadr( affix_tail ) : NIL;
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw5$WORD_POS_PRED, current );
        word_pos_pred = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL;
        item_var = ConsesLow.list( base, affix, word_pos_pred );
        if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          ans = ConsesLow.cons( item_var, ans );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 2715L)
  public static SubLObject denots_of_complex_word_string(final SubLObject word_string, SubLObject suppress_fake_denotsP)
  {
    if( suppress_fake_denotsP == UNPROVIDED )
    {
      suppress_fake_denotsP = T;
    }
    assert NIL != Types.stringp( word_string ) : word_string;
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject denots = NIL;
    SubLObject sem_pred_lists = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$3;
    SubLObject word_denot_tail;
    SubLObject word_denot;
    SubLObject sem_pred_tail;
    SubLObject sem_pred;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$3 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list11 );
          current_$3 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list11 );
          if( NIL == conses_high.member( current_$3, $list12, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$3 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
        }
        word_denot_tail = cdestructuring_bind.property_list_member( $kw4$WORD_DENOT, current );
        word_denot = ( NIL != word_denot_tail ) ? conses_high.cadr( word_denot_tail ) : NIL;
        sem_pred_tail = cdestructuring_bind.property_list_member( $kw13$SEM_PRED, current );
        sem_pred = ( NIL != sem_pred_tail ) ? conses_high.cadr( sem_pred_tail ) : NIL;
        if( NIL != word_denot && NIL != denot_acceptableP( word_denot, suppress_fake_denotsP ) && NIL == subl_promotions.memberP( word_denot, denots, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          denots = ConsesLow.cons( word_denot, denots );
          sem_pred_lists = ConsesLow.cons( ConsesLow.list( sem_pred ), sem_pred_lists );
        }
      }
    }
    return Values.values( denots, sem_pred_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 3799L)
  public static SubLObject denots_of_complex_word_stringXpos_pred(final SubLObject word_string, final SubLObject pos_pred, SubLObject mt, SubLObject suppress_fake_denotsP)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( suppress_fake_denotsP == UNPROVIDED )
    {
      suppress_fake_denotsP = T;
    }
    assert NIL != Types.stringp( word_string ) : word_string;
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject denots = NIL;
    SubLObject sem_pred_lists = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$4;
    SubLObject word_denot_tail;
    SubLObject word_denot;
    SubLObject word_pos_pred_tail;
    SubLObject word_pos_pred;
    SubLObject sem_pred_tail;
    SubLObject sem_pred;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$4 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list14 );
          current_$4 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list14 );
          if( NIL == conses_high.member( current_$4, $list15, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$4 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
        }
        word_denot_tail = cdestructuring_bind.property_list_member( $kw4$WORD_DENOT, current );
        word_denot = ( NIL != word_denot_tail ) ? conses_high.cadr( word_denot_tail ) : NIL;
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw5$WORD_POS_PRED, current );
        word_pos_pred = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL;
        sem_pred_tail = cdestructuring_bind.property_list_member( $kw13$SEM_PRED, current );
        sem_pred = ( NIL != sem_pred_tail ) ? conses_high.cadr( sem_pred_tail ) : NIL;
        if( NIL != lexicon_accessors.genl_pos_predP( word_pos_pred, pos_pred, mt ) && NIL != denot_acceptableP( word_denot, suppress_fake_denotsP ) && NIL == subl_promotions.memberP( word_denot, denots, Symbols
            .symbol_function( EQUAL ), UNPROVIDED ) )
        {
          denots = ConsesLow.cons( word_denot, denots );
          sem_pred_lists = ConsesLow.cons( ConsesLow.list( sem_pred ), sem_pred_lists );
        }
      }
    }
    return Values.values( denots, sem_pred_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 5185L)
  public static SubLObject denots_of_complex_word_stringXspeech_part(final SubLObject word_string, final SubLObject speech_part, SubLObject suppress_fake_denotsP)
  {
    if( suppress_fake_denotsP == UNPROVIDED )
    {
      suppress_fake_denotsP = T;
    }
    assert NIL != Types.stringp( word_string ) : word_string;
    assert NIL != lexicon_accessors.speech_partP( speech_part, UNPROVIDED ) : speech_part;
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject denots = NIL;
    SubLObject sem_pred_lists = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$5;
    SubLObject word_denot_tail;
    SubLObject word_denot;
    SubLObject word_pos_pred_tail;
    SubLObject word_pos_pred;
    SubLObject sem_pred_tail;
    SubLObject sem_pred;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$5 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list14 );
          current_$5 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list14 );
          if( NIL == conses_high.member( current_$5, $list15, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$5 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
        }
        word_denot_tail = cdestructuring_bind.property_list_member( $kw4$WORD_DENOT, current );
        word_denot = ( NIL != word_denot_tail ) ? conses_high.cadr( word_denot_tail ) : NIL;
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw5$WORD_POS_PRED, current );
        word_pos_pred = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL;
        sem_pred_tail = cdestructuring_bind.property_list_member( $kw13$SEM_PRED, current );
        sem_pred = ( NIL != sem_pred_tail ) ? conses_high.cadr( sem_pred_tail ) : NIL;
        if( NIL != lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( word_pos_pred ), speech_part, UNPROVIDED ) && NIL != denot_acceptableP( word_denot, suppress_fake_denotsP ) && NIL == subl_promotions
            .memberP( word_denot, denots, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          denots = ConsesLow.cons( word_denot, denots );
          sem_pred_lists = ConsesLow.cons( ConsesLow.list( sem_pred ), sem_pred_lists );
        }
      }
    }
    return Values.values( denots, sem_pred_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 6556L)
  public static SubLObject denots_of_complex_word_stringXpos(final SubLObject word_string, final SubLObject pos_keyword, SubLObject mt, SubLObject suppress_fake_denotsP)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( suppress_fake_denotsP == UNPROVIDED )
    {
      suppress_fake_denotsP = T;
    }
    assert NIL != Types.stringp( word_string ) : word_string;
    assert NIL != Types.keywordp( pos_keyword ) : pos_keyword;
    final SubLObject speech_part_list = lexicon_accessors.pos_for_keyword( pos_keyword, mt );
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject denots = NIL;
    SubLObject sem_pred_lists = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$6;
    SubLObject word_denot_tail;
    SubLObject word_denot;
    SubLObject word_pos_pred_tail;
    SubLObject word_pos_pred;
    SubLObject sem_pred_tail;
    SubLObject sem_pred;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$6 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list14 );
          current_$6 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list14 );
          if( NIL == conses_high.member( current_$6, $list15, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$6 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
        }
        word_denot_tail = cdestructuring_bind.property_list_member( $kw4$WORD_DENOT, current );
        word_denot = ( NIL != word_denot_tail ) ? conses_high.cadr( word_denot_tail ) : NIL;
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw5$WORD_POS_PRED, current );
        word_pos_pred = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL;
        sem_pred_tail = cdestructuring_bind.property_list_member( $kw13$SEM_PRED, current );
        sem_pred = ( NIL != sem_pred_tail ) ? conses_high.cadr( sem_pred_tail ) : NIL;
        if( NIL != subl_promotions.memberP( lexicon_accessors.pos_of_pred( word_pos_pred ), speech_part_list, Symbols.symbol_function( EQL ), UNPROVIDED ) && NIL != denot_acceptableP( word_denot, suppress_fake_denotsP )
            && NIL == subl_promotions.memberP( word_denot, denots, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          denots = ConsesLow.cons( word_denot, denots );
          sem_pred_lists = ConsesLow.cons( ConsesLow.list( sem_pred ), sem_pred_lists );
        }
      }
    }
    return Values.values( denots, sem_pred_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 8024L)
  public static SubLObject words_of_complex_word_string(final SubLObject word_string)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject ans = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$7;
    SubLObject word_unit_tail;
    SubLObject item_var;
    SubLObject word_unit;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$7 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list18 );
          current_$7 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list18 );
          if( NIL == conses_high.member( current_$7, $list19, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$7 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
        }
        word_unit_tail = cdestructuring_bind.property_list_member( $kw6$WORD_UNIT, current );
        word_unit = ( item_var = ( NIL != word_unit_tail ) ? conses_high.cadr( word_unit_tail ) : NIL );
        if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          ans = ConsesLow.cons( item_var, ans );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 8657L)
  public static SubLObject words_of_complex_word_stringXspeech_part(final SubLObject word_string, final SubLObject speech_part)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    assert NIL != lexicon_accessors.speech_partP( speech_part, UNPROVIDED ) : speech_part;
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject words_to_preds = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$8;
    SubLObject word_unit_tail;
    SubLObject word_unit;
    SubLObject word_pos_pred_tail;
    SubLObject word_pos_pred;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) && NIL != morph_word.mwp_parse_complex_p( parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$8 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list20 );
          current_$8 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list20 );
          if( NIL == conses_high.member( current_$8, $list21, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$8 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
        }
        word_unit_tail = cdestructuring_bind.property_list_member( $kw6$WORD_UNIT, current );
        word_unit = ( NIL != word_unit_tail ) ? conses_high.cadr( word_unit_tail ) : NIL;
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw5$WORD_POS_PRED, current );
        word_pos_pred = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL;
        if( NIL != lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( word_pos_pred ), speech_part, UNPROVIDED ) )
        {
          words_to_preds = list_utilities.alist_pushnew( words_to_preds, word_unit, word_pos_pred, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( EQUAL ) );
        }
      }
    }
    return Values.values( list_utilities.alist_keys( words_to_preds ), list_utilities.alist_values( words_to_preds ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 9737L)
  public static SubLObject words_of_complex_word_stringXpos(final SubLObject word_string, final SubLObject pos_keyword, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    assert NIL != Types.stringp( word_string ) : word_string;
    assert NIL != Types.keywordp( pos_keyword ) : pos_keyword;
    final SubLObject speech_part_list = lexicon_accessors.pos_for_keyword( pos_keyword, mt );
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject triples = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$9;
    SubLObject word_unit_tail;
    SubLObject word_unit;
    SubLObject word_pos_pred_tail;
    SubLObject word_pos_pred;
    SubLObject sem_pred_tail;
    SubLObject sem_pred;
    SubLObject item_var;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) && NIL != morph_word.mwp_parse_complex_p( parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$9 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
          current_$9 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list22 );
          if( NIL == conses_high.member( current_$9, $list23, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$9 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
        }
        word_unit_tail = cdestructuring_bind.property_list_member( $kw6$WORD_UNIT, current );
        word_unit = ( NIL != word_unit_tail ) ? conses_high.cadr( word_unit_tail ) : NIL;
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw5$WORD_POS_PRED, current );
        word_pos_pred = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL;
        sem_pred_tail = cdestructuring_bind.property_list_member( $kw13$SEM_PRED, current );
        sem_pred = ( NIL != sem_pred_tail ) ? conses_high.cadr( sem_pred_tail ) : NIL;
        if( NIL != subl_promotions.memberP( lexicon_accessors.pos_of_pred( word_pos_pred ), speech_part_list, Symbols.symbol_function( EQL ), UNPROVIDED ) )
        {
          item_var = ConsesLow.list( word_unit, word_pos_pred, sem_pred );
          if( NIL == conses_high.member( item_var, triples, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            triples = ConsesLow.cons( item_var, triples );
          }
        }
      }
    }
    return Values.values( Mapping.mapcar( Symbols.symbol_function( $sym24$FIRST ), triples ), Mapping.mapcar( Symbols.symbol_function( $sym25$SECOND ), triples ), Mapping.mapcar( Symbols.symbol_function( $sym26$THIRD ),
        triples ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 11011L)
  public static SubLObject words_of_complex_word_stringXpred(final SubLObject word_string, final SubLObject pred)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    assert NIL != lexicon_accessors.speech_part_predP( pred, UNPROVIDED ) : pred;
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject ans = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$10;
    SubLObject word_unit_tail;
    SubLObject word_unit;
    SubLObject word_pos_pred_tail;
    SubLObject word_pos_pred;
    SubLObject item_var;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) && NIL != morph_word.mwp_parse_complex_p( parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$10 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list20 );
          current_$10 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list20 );
          if( NIL == conses_high.member( current_$10, $list21, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$10 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
        }
        word_unit_tail = cdestructuring_bind.property_list_member( $kw6$WORD_UNIT, current );
        word_unit = ( NIL != word_unit_tail ) ? conses_high.cadr( word_unit_tail ) : NIL;
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw5$WORD_POS_PRED, current );
        word_pos_pred = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL;
        if( NIL != lexicon_accessors.genl_pos_predP( word_pos_pred, pred, UNPROVIDED ) )
        {
          item_var = word_unit;
          if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            ans = ConsesLow.cons( item_var, ans );
          }
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 11911L)
  public static SubLObject preds_of_complex_word_string(final SubLObject word_string)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject ans = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$11;
    SubLObject word_pos_pred_tail;
    SubLObject item_var;
    SubLObject word_pos_pred;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) && NIL != morph_word.mwp_parse_complex_p( parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$11 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list28 );
          current_$11 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list28 );
          if( NIL == conses_high.member( current_$11, $list29, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$11 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list28 );
        }
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw5$WORD_POS_PRED, current );
        word_pos_pred = ( item_var = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL );
        if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          ans = ConsesLow.cons( item_var, ans );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 12592L)
  public static SubLObject preds_of_complex_word_stringXword(final SubLObject word_string, final SubLObject word)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    assert NIL != lexicon_accessors.lexical_wordP( word ) : word;
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    SubLObject ans = NIL;
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$12;
    SubLObject word_unit_tail;
    SubLObject word_unit;
    SubLObject word_pos_pred_tail;
    SubLObject word_pos_pred;
    SubLObject item_var;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) && NIL != morph_word.mwp_parse_complex_p( parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$12 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list20 );
          current_$12 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list20 );
          if( NIL == conses_high.member( current_$12, $list21, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$12 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
        }
        word_unit_tail = cdestructuring_bind.property_list_member( $kw6$WORD_UNIT, current );
        word_unit = ( NIL != word_unit_tail ) ? conses_high.cadr( word_unit_tail ) : NIL;
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw5$WORD_POS_PRED, current );
        word_pos_pred = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL;
        if( NIL != czer_utilities.equals_elP( word_unit, word, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          item_var = word_pos_pred;
          if( NIL == conses_high.member( item_var, ans, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            ans = ConsesLow.cons( item_var, ans );
          }
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 13541L)
  public static SubLObject pos_of_complex_word_string(final SubLObject word_string)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    final SubLObject word_pos_preds = preds_of_complex_word_string( word_string );
    return list_utilities.mapcar_unique( Symbols.symbol_function( $sym31$POS_OF_PRED ), word_pos_preds, Symbols.symbol_function( EQL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14085L)
  public static SubLObject pos_of_complex_word_stringXword(final SubLObject word_string, final SubLObject word)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    assert NIL != lexicon_accessors.lexical_wordP( word ) : word;
    final SubLObject word_pos_preds = preds_of_complex_word_stringXword( word_string, word );
    return list_utilities.mapcar_unique( Symbols.symbol_function( $sym31$POS_OF_PRED ), word_pos_preds, Symbols.symbol_function( EQL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14854L)
  public static SubLObject clear_complex_word_string_is_speech_partP()
  {
    final SubLObject cs = $complex_word_string_is_speech_partP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14854L)
  public static SubLObject remove_complex_word_string_is_speech_partP(final SubLObject word_string, final SubLObject speech_part)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $complex_word_string_is_speech_partP_caching_state$.getGlobalValue(), ConsesLow.list( word_string, speech_part ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14854L)
  public static SubLObject complex_word_string_is_speech_partP_internal(final SubLObject word_string, final SubLObject speech_part)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    assert NIL != lexicon_accessors.speech_partP( speech_part, UNPROVIDED ) : speech_part;
    final SubLObject v_morph_word = parse_complex_word_string( word_string, UNPROVIDED );
    final SubLObject set_var = morph_word.morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$13;
    SubLObject word_pos_pred_tail;
    SubLObject word_pos_pred;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$13 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list28 );
          current_$13 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list28 );
          if( NIL == conses_high.member( current_$13, $list29, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$13 == $kw3$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list28 );
        }
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw5$WORD_POS_PRED, current );
        word_pos_pred = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL;
        if( NIL != lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( word_pos_pred ), speech_part, UNPROVIDED ) )
        {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 14854L)
  public static SubLObject complex_word_string_is_speech_partP(final SubLObject word_string, final SubLObject speech_part)
  {
    SubLObject caching_state = $complex_word_string_is_speech_partP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_, $sym33$_COMPLEX_WORD_STRING_IS_SPEECH_PART__CACHING_STATE_, $int34$200, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( word_string, speech_part );
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
        if( word_string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && speech_part.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( complex_word_string_is_speech_partP_internal( word_string, speech_part ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word_string, speech_part ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 15703L)
  public static SubLObject clear_parse_complex_word_string()
  {
    final SubLObject cs = $parse_complex_word_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 15703L)
  public static SubLObject remove_parse_complex_word_string(final SubLObject word_string, SubLObject wff_filter_level)
  {
    if( wff_filter_level == UNPROVIDED )
    {
      wff_filter_level = lexicon_vars.$mwp_wff_filter_level$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $parse_complex_word_string_caching_state$.getGlobalValue(), ConsesLow.list( word_string, wff_filter_level ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 15703L)
  public static SubLObject parse_complex_word_string_internal(final SubLObject word_string, final SubLObject wff_filter_level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( word_string ) : word_string;
    mwp_check_initializations();
    final SubLObject word = morph_word.new_morph_word( word_string );
    final SubLObject _prev_bind_0 = lexicon_vars.$mwp_wff_filter_level$.currentBinding( thread );
    try
    {
      lexicon_vars.$mwp_wff_filter_level$.bind( wff_filter_level, thread );
      morph_word.morph_word_parse_affixes( word, UNPROVIDED );
    }
    finally
    {
      lexicon_vars.$mwp_wff_filter_level$.rebind( _prev_bind_0, thread );
    }
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 15703L)
  public static SubLObject parse_complex_word_string(final SubLObject word_string, SubLObject wff_filter_level)
  {
    if( wff_filter_level == UNPROVIDED )
    {
      wff_filter_level = lexicon_vars.$mwp_wff_filter_level$.getDynamicValue();
    }
    SubLObject caching_state = $parse_complex_word_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym35$PARSE_COMPLEX_WORD_STRING, $sym36$_PARSE_COMPLEX_WORD_STRING_CACHING_STATE_, $int37$1000, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym38$CLEAR_PARSE_COMPLEX_WORD_STRING );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( word_string, wff_filter_level );
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
        if( word_string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && wff_filter_level.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( parse_complex_word_string_internal( word_string, wff_filter_level ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word_string, wff_filter_level ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 16386L)
  public static SubLObject mwp_check_initializations()
  {
    if( NIL == mwp_initializedP() )
    {
      initialize_mwp();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 16594L)
  public static SubLObject mwp_initializedP()
  {
    return $mwp_initializedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 16658L)
  public static SubLObject initialize_mwp()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( T, thread );
      mwp_affix_matcher.mwp_suffix_matcher_init();
      mwp_affix_matcher.mwp_prefix_matcher_init();
      mwp_rule.mwp_rule_constraint_table_init();
      mwp_rule.mwp_rule_spec_table_init();
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    $mwp_initializedP$.setGlobalValue( T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 16965L)
  public static SubLObject note_mwp_needs_reinitialization()
  {
    $mwp_initializedP$.setGlobalValue( NIL );
    clear_complex_word_string_is_speech_partP();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 17186L)
  public static SubLObject denot_acceptableP(final SubLObject denot, final SubLObject suppress_fake_denotsP)
  {
    return makeBoolean( NIL == suppress_fake_denotsP || NIL == fake_derived_denotation_p( denot ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 17417L)
  public static SubLObject fake_derived_denotation_p(final SubLObject v_object)
  {
    return cycl_utilities.expression_find_if( Symbols.symbol_function( $sym40$MWP_PSEUDO_FUNCTION_P ), v_object, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morphological-word-parser.lisp", position = 17677L)
  public static SubLObject mwp_pseudo_function_p(final SubLObject v_object)
  {
    return makeBoolean( v_object == $kw41$APPLY_AFFIX || v_object == $kw42$DENOT_OF );
  }

  public static SubLObject declare_morphological_word_parser_file()
  {
    SubLFiles.declareFunction( me, "parse_affixes", "PARSE-AFFIXES", 1, 1, false );
    SubLFiles.declareFunction( me, "derived_nl_trie_words", "DERIVED-NL-TRIE-WORDS", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_find_stems", "MWP-FIND-STEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "denots_of_complex_word_string", "DENOTS-OF-COMPLEX-WORD-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "denots_of_complex_word_stringXpos_pred", "DENOTS-OF-COMPLEX-WORD-STRING&POS-PRED", 2, 2, false );
    SubLFiles.declareFunction( me, "denots_of_complex_word_stringXspeech_part", "DENOTS-OF-COMPLEX-WORD-STRING&SPEECH-PART", 2, 1, false );
    SubLFiles.declareFunction( me, "denots_of_complex_word_stringXpos", "DENOTS-OF-COMPLEX-WORD-STRING&POS", 2, 2, false );
    SubLFiles.declareFunction( me, "words_of_complex_word_string", "WORDS-OF-COMPLEX-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "words_of_complex_word_stringXspeech_part", "WORDS-OF-COMPLEX-WORD-STRING&SPEECH-PART", 2, 0, false );
    SubLFiles.declareFunction( me, "words_of_complex_word_stringXpos", "WORDS-OF-COMPLEX-WORD-STRING&POS", 2, 1, false );
    SubLFiles.declareFunction( me, "words_of_complex_word_stringXpred", "WORDS-OF-COMPLEX-WORD-STRING&PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "preds_of_complex_word_string", "PREDS-OF-COMPLEX-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "preds_of_complex_word_stringXword", "PREDS-OF-COMPLEX-WORD-STRING&WORD", 2, 0, false );
    SubLFiles.declareFunction( me, "pos_of_complex_word_string", "POS-OF-COMPLEX-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "pos_of_complex_word_stringXword", "POS-OF-COMPLEX-WORD-STRING&WORD", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_complex_word_string_is_speech_partP", "CLEAR-COMPLEX-WORD-STRING-IS-SPEECH-PART?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_complex_word_string_is_speech_partP", "REMOVE-COMPLEX-WORD-STRING-IS-SPEECH-PART?", 2, 0, false );
    SubLFiles.declareFunction( me, "complex_word_string_is_speech_partP_internal", "COMPLEX-WORD-STRING-IS-SPEECH-PART?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "complex_word_string_is_speech_partP", "COMPLEX-WORD-STRING-IS-SPEECH-PART?", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_parse_complex_word_string", "CLEAR-PARSE-COMPLEX-WORD-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_parse_complex_word_string", "REMOVE-PARSE-COMPLEX-WORD-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "parse_complex_word_string_internal", "PARSE-COMPLEX-WORD-STRING-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_complex_word_string", "PARSE-COMPLEX-WORD-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "mwp_check_initializations", "MWP-CHECK-INITIALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "mwp_initializedP", "MWP-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_mwp", "INITIALIZE-MWP", 0, 0, false );
    SubLFiles.declareFunction( me, "note_mwp_needs_reinitialization", "NOTE-MWP-NEEDS-REINITIALIZATION", 0, 0, false );
    SubLFiles.declareFunction( me, "denot_acceptableP", "DENOT-ACCEPTABLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "fake_derived_denotation_p", "FAKE-DERIVED-DENOTATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_pseudo_function_p", "MWP-PSEUDO-FUNCTION-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_morphological_word_parser_file()
  {
    $complex_word_string_is_speech_partP_caching_state$ = SubLFiles.deflexical( "*COMPLEX-WORD-STRING-IS-SPEECH-PART?-CACHING-STATE*", NIL );
    $parse_complex_word_string_caching_state$ = SubLFiles.deflexical( "*PARSE-COMPLEX-WORD-STRING-CACHING-STATE*", NIL );
    $mwp_initializedP$ = SubLFiles.deflexical( "*MWP-INITIALIZED?*", ( maybeDefault( $sym39$_MWP_INITIALIZED__, $mwp_initializedP$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_morphological_word_parser_file()
  {
    memoization_state.note_globally_cached_function( $sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_ );
    memoization_state.note_globally_cached_function( $sym35$PARSE_COMPLEX_WORD_STRING );
    subl_macro_promotions.declare_defglobal( $sym39$_MWP_INITIALIZED__ );
    sunit_external.define_test_category( $str43$Morphological_Word_Parser, UNPROVIDED );
    sunit_external.define_test_suite( $str44$Morphological_Word_Parser_Test_Su, $list45, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_morphological_word_parser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_morphological_word_parser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_morphological_word_parser_file();
  }
  static
  {
    me = new morphological_word_parser();
    $complex_word_string_is_speech_partP_caching_state$ = null;
    $parse_complex_word_string_caching_state$ = null;
    $mwp_initializedP$ = null;
    $sym0$STRINGP = makeSymbol( "STRINGP" );
    $list1 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "WORD-DENOT" ), makeSymbol( "WORD-POS-PRED" ), makeSymbol( "WORD-UNIT" ) );
    $list2 = ConsesLow.list( makeKeyword( "WORD-DENOT" ), makeKeyword( "WORD-POS-PRED" ), makeKeyword( "WORD-UNIT" ) );
    $kw3$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw4$WORD_DENOT = makeKeyword( "WORD-DENOT" );
    $kw5$WORD_POS_PRED = makeKeyword( "WORD-POS-PRED" );
    $kw6$WORD_UNIT = makeKeyword( "WORD-UNIT" );
    $list7 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "BASE" ), makeSymbol( "AFFIX" ), makeSymbol( "WORD-POS-PRED" ) );
    $list8 = ConsesLow.list( makeKeyword( "BASE" ), makeKeyword( "AFFIX" ), makeKeyword( "WORD-POS-PRED" ) );
    $kw9$BASE = makeKeyword( "BASE" );
    $kw10$AFFIX = makeKeyword( "AFFIX" );
    $list11 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "WORD-DENOT" ), makeSymbol( "SEM-PRED" ) );
    $list12 = ConsesLow.list( makeKeyword( "WORD-DENOT" ), makeKeyword( "SEM-PRED" ) );
    $kw13$SEM_PRED = makeKeyword( "SEM-PRED" );
    $list14 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "WORD-DENOT" ), makeSymbol( "WORD-POS-PRED" ), makeSymbol( "SEM-PRED" ) );
    $list15 = ConsesLow.list( makeKeyword( "WORD-DENOT" ), makeKeyword( "WORD-POS-PRED" ), makeKeyword( "SEM-PRED" ) );
    $sym16$SPEECH_PART_ = makeSymbol( "SPEECH-PART?" );
    $sym17$KEYWORDP = makeSymbol( "KEYWORDP" );
    $list18 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "WORD-UNIT" ) );
    $list19 = ConsesLow.list( makeKeyword( "WORD-UNIT" ) );
    $list20 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "WORD-UNIT" ), makeSymbol( "WORD-POS-PRED" ) );
    $list21 = ConsesLow.list( makeKeyword( "WORD-UNIT" ), makeKeyword( "WORD-POS-PRED" ) );
    $list22 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "WORD-UNIT" ), makeSymbol( "WORD-POS-PRED" ), makeSymbol( "SEM-PRED" ) );
    $list23 = ConsesLow.list( makeKeyword( "WORD-UNIT" ), makeKeyword( "WORD-POS-PRED" ), makeKeyword( "SEM-PRED" ) );
    $sym24$FIRST = makeSymbol( "FIRST" );
    $sym25$SECOND = makeSymbol( "SECOND" );
    $sym26$THIRD = makeSymbol( "THIRD" );
    $sym27$SPEECH_PART_PRED_ = makeSymbol( "SPEECH-PART-PRED?" );
    $list28 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "WORD-POS-PRED" ) );
    $list29 = ConsesLow.list( makeKeyword( "WORD-POS-PRED" ) );
    $sym30$LEXICAL_WORD_ = makeSymbol( "LEXICAL-WORD?" );
    $sym31$POS_OF_PRED = makeSymbol( "POS-OF-PRED" );
    $sym32$COMPLEX_WORD_STRING_IS_SPEECH_PART_ = makeSymbol( "COMPLEX-WORD-STRING-IS-SPEECH-PART?" );
    $sym33$_COMPLEX_WORD_STRING_IS_SPEECH_PART__CACHING_STATE_ = makeSymbol( "*COMPLEX-WORD-STRING-IS-SPEECH-PART?-CACHING-STATE*" );
    $int34$200 = makeInteger( 200 );
    $sym35$PARSE_COMPLEX_WORD_STRING = makeSymbol( "PARSE-COMPLEX-WORD-STRING" );
    $sym36$_PARSE_COMPLEX_WORD_STRING_CACHING_STATE_ = makeSymbol( "*PARSE-COMPLEX-WORD-STRING-CACHING-STATE*" );
    $int37$1000 = makeInteger( 1000 );
    $sym38$CLEAR_PARSE_COMPLEX_WORD_STRING = makeSymbol( "CLEAR-PARSE-COMPLEX-WORD-STRING" );
    $sym39$_MWP_INITIALIZED__ = makeSymbol( "*MWP-INITIALIZED?*" );
    $sym40$MWP_PSEUDO_FUNCTION_P = makeSymbol( "MWP-PSEUDO-FUNCTION-P" );
    $kw41$APPLY_AFFIX = makeKeyword( "APPLY-AFFIX" );
    $kw42$DENOT_OF = makeKeyword( "DENOT-OF" );
    $str43$Morphological_Word_Parser = makeString( "Morphological Word Parser" );
    $str44$Morphological_Word_Parser_Test_Su = makeString( "Morphological Word Parser Test Suite" );
    $list45 = ConsesLow.list( makeString( "Morphological Word Parser" ) );
  }
}
/*
 * 
 * Total time: 268 ms
 * 
 */