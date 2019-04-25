package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class morphology
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.morphology";
  public static final String myFingerPrint = "388bed68dba4fbc990140b17dcc6f495c145f52a01295515826346d4d6f561b3";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1961L)
  private static SubLSymbol $vowels$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2079L)
  private static SubLSymbol $bigraph_vowels$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2284L)
  private static SubLSymbol $sibilant_endings$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2356L)
  private static SubLSymbol $consonants$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2413L)
  private static SubLSymbol $doublers$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2463L)
  private static SubLSymbol $unstressed_latin_pfxs$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2550L)
  private static SubLSymbol $special_ate_cases$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2736L)
  private static SubLSymbol $liquids$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2822L)
  private static SubLSymbol $vowelsX_plus_y$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9404L)
  private static SubLSymbol $pos_preds_derivable_from_pred_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17547L)
  private static SubLSymbol $aes_do_orthographic_change_fns$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24731L)
  private static SubLSymbol $comparative_syllable_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25240L)
  private static SubLSymbol $more_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25285L)
  private static SubLSymbol $most_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30954L)
  private static SubLSymbol $english_possessive_pronouns$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39460L)
  private static SubLSymbol $find_stem_memoized_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45414L)
  public static SubLSymbol $preserve_case_in_singular_regP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52934L)
  private static SubLSymbol $pos_keywords$;
  private static final SubLString $str0$_Revision__149757__;
  private static final SubLSymbol $sym1$_MORPHOLOGY_CODE_REVISION_;
  private static final SubLList $list2;
  private static final SubLString $str3$aeiou;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLString $str6$bcdfghjklmnprstvxz;
  private static final SubLString $str7$bdfgklmnprtvz;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLString $str11$y;
  private static final SubLString $str12$ly;
  private static final SubLString $str13$qw;
  private static final SubLString $str14$q;
  private static final SubLString $str15$u;
  private static final SubLObject $const16$comparativeDegree;
  private static final SubLSymbol $sym17$COMPARATIVE_REG;
  private static final SubLObject $const18$superlativeDegree;
  private static final SubLSymbol $sym19$SUPERLATIVE_REG;
  private static final SubLObject $const20$comparativeAdverb;
  private static final SubLSymbol $sym21$COMPARATIVE_ADVERB_REG;
  private static final SubLObject $const22$superlativeAdverb;
  private static final SubLSymbol $sym23$SUPERLATIVE_ADVERB_REG;
  private static final SubLSymbol $sym24$FORT_P;
  private static final SubLSymbol $sym25$POS_PREDS_DERIVABLE_FROM_PRED_INT;
  private static final SubLSymbol $sym26$RELEVANT_MT_IS_GENL_MT;
  private static final SubLObject $const27$regularSuffix;
  private static final SubLSymbol $sym28$_POS_PREDS_DERIVABLE_FROM_PRED_INT_CACHING_STATE_;
  private static final SubLInteger $int29$256;
  private static final SubLObject $const30$plural_Generic;
  private static final SubLObject $const31$singular_Generic;
  private static final SubLList $list32;
  private static final SubLString $str33$z;
  private static final SubLObject $const34$EnglishLexiconMt;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const38$EverythingPSC;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$RELEVANT_MT_IS_ANY_MT;
  private static final SubLObject $const41$InferencePSC;
  private static final SubLSymbol $sym42$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
  private static final SubLSymbol $sym43$CYCL_STRING_P;
  private static final SubLString $str44$;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLString $str49$s;
  private static final SubLString $str50$e;
  private static final SubLString $str51$ion;
  private static final SubLList $list52;
  private static final SubLString $str53$ation;
  private static final SubLString $str54$i;
  private static final SubLString $str55$ity;
  private static final SubLString $str56$ble;
  private static final SubLString $str57$il;
  private static final SubLString $str58$at;
  private static final SubLString $str59$ai;
  private static final SubLString $str60$ing;
  private static final SubLString $str61$ie;
  private static final SubLString $str62$ism;
  private static final SubLString $str63$ist;
  private static final SubLString $str64$ceive;
  private static final SubLString $str65$ive;
  private static final SubLString $str66$pt;
  private static final SubLString $str67$vert;
  private static final SubLString $str68$vers;
  private static final SubLString $str69$duce;
  private static final SubLString $str70$t;
  private static final SubLString $str71$able;
  private static final SubLString $str72$ible;
  private static final SubLString $str73$le;
  private static final SubLString $str74$de;
  private static final SubLString $str75$is;
  private static final SubLList $list76;
  private static final SubLString $str77$se;
  private static final SubLString $str78$ize;
  private static final SubLString $str79$ise;
  private static final SubLString $str80$al;
  private static final SubLString $str81$er;
  private static final SubLString $str82$or;
  private static final SubLString $str83$fer;
  private static final SubLString $str84$ffer;
  private static final SubLString $str85$id;
  private static final SubLList $list86;
  private static final SubLString $str87$alicious;
  private static final SubLString $str88$ate;
  private static final SubLString $str89$ed;
  private static final SubLString $str90$more_;
  private static final SubLString $str91$most_;
  private static final SubLString $str92$est;
  private static final SubLObject $const93$pastTense_Universal;
  private static final SubLObject $const94$infinitive;
  private static final SubLObject $const95$gerund;
  private static final SubLObject $const96$thirdPersonSg_Present;
  private static final SubLObject $const97$plural;
  private static final SubLObject $const98$singular;
  private static final SubLObject $const99$EnglishMt;
  private static final SubLObject $const100$presentParticiple;
  private static final SubLList $list101;
  private static final SubLSymbol $kw102$NOT_FOUND;
  private static final SubLString $str103$_;
  private static final SubLString $str104$_s;
  private static final SubLString $str105$_;
  private static final SubLObject $const106$QuantifyingIndexical;
  private static final SubLObject $const107$GeographicalRegion;
  private static final SubLString $str108$in;
  private static final SubLObject $const109$SurfaceRegion_Underspecified;
  private static final SubLString $str110$on;
  private static final SubLList $list111;
  private static final SubLSymbol $kw112$VERB;
  private static final SubLList $list113;
  private static final SubLSymbol $kw114$ANY;
  private static final SubLSymbol $sym115$FIND_STEM_MEMOIZED;
  private static final SubLSymbol $sym116$_FIND_STEM_MEMOIZED_CACHING_STATE_;
  private static final SubLInteger $int117$16384;
  private static final SubLSymbol $sym118$CLEAR_FIND_STEM_MEMOIZED;
  private static final SubLString $str119$ies;
  private static final SubLString $str120$ss;
  private static final SubLList $list121;
  private static final SubLString $str122$ied;
  private static final SubLString $str123$l;
  private static final SubLString $str124$d;
  private static final SubLString $str125$r;
  private static final SubLString $str126$es;
  private static final SubLSymbol $sym127$PLURAL_NOUN_TO_SG;
  private static final SubLString $str128$us;
  private static final SubLList $list129;
  private static final SubLList $list130;
  private static final SubLObject $const131$Verb;
  private static final SubLString $str132$en;
  private static final SubLObject $const133$CountNoun;
  private static final SubLObject $const134$Number_SP;
  private static final SubLObject $const135$ProperCountNoun;
  private static final SubLObject $const136$Adjective;
  private static final SubLObject $const137$Adverb;
  private static final SubLString $str138$yze;
  private static final SubLString $str139$ify;
  private static final SubLString $str140$logy;
  private static final SubLString $str141$ette;
  private static final SubLString $str142$ess;
  private static final SubLString $str143$eer;
  private static final SubLString $str144$omy;
  private static final SubLString $str145$ics;
  private static final SubLString $str146$geny;
  private static final SubLString $str147$ium;
  private static final SubLString $str148$cracy;
  private static final SubLString $str149$itis;
  private static final SubLString $str150$oma;
  private static final SubLString $str151$lysis;
  private static final SubLString $str152$hood;
  private static final SubLString $str153$ship;
  private static final SubLString $str154$lty;
  private static final SubLString $str155$meter;
  private static final SubLString $str156$morph;
  private static final SubLString $str157$morphy;
  private static final SubLString $str158$osis;
  private static final SubLString $str159$stery;
  private static final SubLString $str160$ence;
  private static final SubLString $str161$tude;
  private static final SubLString $str162$ance;
  private static final SubLString $str163$graphy;
  private static final SubLString $str164$ment;
  private static final SubLString $str165$age;
  private static final SubLString $str166$dom;
  private static final SubLString $str167$ery;
  private static final SubLString $str168$ite;
  private static final SubLString $str169$let;
  private static final SubLString $str170$ling;
  private static final SubLString $str171$ster;
  private static final SubLString $str172$ant;
  private static final SubLString $str173$ee;
  private static final SubLString $str174$ese;
  private static final SubLString $str175$an;
  private static final SubLString $str176$ical;
  private static final SubLString $str177$ous;
  private static final SubLString $str178$less;
  private static final SubLString $str179$ier;
  private static final SubLString $str180$nant;
  private static final SubLString $str181$thic;
  private static final SubLString $str182$etic;
  private static final SubLString $str183$itic;
  private static final SubLString $str184$ful;
  private static final SubLString $str185$ish;
  private static final SubLString $str186$like;
  private static final SubLString $str187$ial;
  private static final SubLString $str188$esque;
  private static final SubLString $str189$ic;
  private static final SubLString $str190$wise;
  private static final SubLString $str191$ward;
  private static final SubLString $str192$wards;
  private static final SubLList $list193;
  private static final SubLSymbol $kw194$PROPER_NOUN;
  private static final SubLObject $const195$pnSingular;
  private static final SubLSymbol $kw196$NOUN;
  private static final SubLSymbol $kw197$ADJECTIVE;
  private static final SubLObject $const198$regularDegree;
  private static final SubLSymbol $kw199$ADVERB;
  private static final SubLObject $const200$regularAdverb;
  private static final SubLSymbol $kw201$PREPOSITION;
  private static final SubLObject $const202$prepositionStrings;
  private static final SubLString $str203$be;
  private static final SubLSymbol $sym204$STRINGP;
  private static final SubLSymbol $sym205$POS_KEYWORD_P;
  private static final SubLObject $const206$GeneralEnglishMt;
  private static final SubLObject $const207$Be_Contracted;
  private static final SubLObject $const208$Be_TheWord;
  private static final SubLObject $const209$Will_Contracted;
  private static final SubLObject $const210$Will_TheModal;
  private static final SubLObject $const211$Have_Contracted;
  private static final SubLObject $const212$Have_TheWord;
  private static final SubLObject $const213$Would_Contracted;
  private static final SubLObject $const214$Would_TheWord;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2889L)
  public static SubLObject get_vowel_positions(final SubLObject string)
  {
    SubLObject position_list = NIL;
    SubLObject end_var_$1;
    SubLObject end_var;
    SubLObject i;
    SubLObject curr;
    for( end_var = ( end_var_$1 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$1 ); i = number_utilities.f_1X( i ) )
    {
      curr = Strings.sublisp_char( string, i );
      if( ( NIL != vowel_charP( curr, UNPROVIDED ) && ( i.isZero() || !curr.equalp( Characters.CHAR_u ) || !Strings.sublisp_char( string, number_utilities.f_1_( i ) ).equalp( Characters.CHAR_q ) ) ) || ( curr.equalp(
          Characters.CHAR_y ) && NIL == vowel_charP( string_utilities.char_at( string, number_utilities.f_1_( i ) ), UNPROVIDED ) && NIL == vowel_charP( string_utilities.char_at( string, number_utilities.f_1X( i ) ),
              UNPROVIDED ) ) )
      {
        position_list = ConsesLow.cons( i, position_list );
      }
    }
    return Sequences.nreverse( position_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3722L)
  public static SubLObject estimated_syllable_count(final SubLObject string)
  {
    final SubLObject vowel_positions = get_vowel_positions( string );
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = vowel_positions;
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( ( NIL == subl_promotions.memberP( number_utilities.f_1_( pos ), vowel_positions, UNPROVIDED, UNPROVIDED ) || NIL == conses_high.member( string_utilities.substring( string, number_utilities.f_1_( pos ),
          number_utilities.f_1X( pos ) ), $bigraph_vowels$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) && ( !Strings.sublisp_char( string, pos ).equalp( Characters.CHAR_e )
              || ( NIL == list_utilities.lengthE( string, number_utilities.f_1X( pos ), UNPROVIDED ) && NIL == string_utilities.whitespacep( Strings.sublisp_char( string, number_utilities.f_1X( pos ) ) )
                  && !string_utilities.substring( string, number_utilities.f_1X( pos ), UNPROVIDED ).equalp( $str12$ly ) ) ) )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pos = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4583L)
  public static SubLObject monosyllabicP(final SubLObject string)
  {
    return Equality.equal( estimated_syllable_count( string ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4760L)
  public static SubLObject polysyllabicP(final SubLObject string, SubLObject min_syllable_count)
  {
    if( min_syllable_count == UNPROVIDED )
    {
      min_syllable_count = TWO_INTEGER;
    }
    return Numbers.numGE( estimated_syllable_count( string ), min_syllable_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5003L)
  public static SubLObject vowel_charP(final SubLObject v_char, SubLObject include_yP)
  {
    if( include_yP == UNPROVIDED )
    {
      include_yP = NIL;
    }
    return makeBoolean( NIL != Sequences.find( v_char, $vowels$.getGlobalValue(), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) || ( NIL != include_yP && v_char.equalp( Characters.CHAR_y ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5304L)
  public static SubLObject consonant_charP(final SubLObject v_char)
  {
    return list_utilities.sublisp_boolean( Sequences.find( v_char, $consonants$.getGlobalValue(), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5451L)
  public static SubLObject get_consonant_positions(final SubLObject string)
  {
    SubLObject position_list = NIL;
    SubLObject end_var_$2;
    SubLObject end_var;
    SubLObject i;
    SubLObject curr;
    SubLObject item_var;
    for( end_var = ( end_var_$2 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$2 ); i = number_utilities.f_1X( i ) )
    {
      curr = Strings.sublisp_char( string, i );
      if( NIL != consonant_charP( curr ) )
      {
        item_var = i;
        if( NIL == conses_high.member( item_var, position_list, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          position_list = ConsesLow.cons( item_var, position_list );
        }
      }
    }
    return Sequences.nreverse( position_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5779L)
  public static SubLObject ends_with_vowelP(final SubLObject string)
  {
    return makeBoolean( NIL != list_utilities.lengthG( string, ZERO_INTEGER, UNPROVIDED ) && NIL != vowel_charP( string_utilities.last_char( string ), T ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5951L)
  public static SubLObject starts_with_vowelP(final SubLObject string)
  {
    return makeBoolean( NIL != list_utilities.lengthG( string, ZERO_INTEGER, UNPROVIDED ) && NIL != vowel_charP( Strings.sublisp_char( string, ZERO_INTEGER ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6122L)
  public static SubLObject ends_with_consonantP(final SubLObject string)
  {
    return makeBoolean( NIL != list_utilities.lengthG( string, ZERO_INTEGER, UNPROVIDED ) && NIL != consonant_charP( string_utilities.last_char( string ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6304L)
  public static SubLObject starts_with_consonantP(final SubLObject string)
  {
    return makeBoolean( NIL != list_utilities.lengthG( string, ZERO_INTEGER, UNPROVIDED ) && ( NIL != consonant_charP( Strings.sublisp_char( string, ZERO_INTEGER ) ) || NIL != Sequences.find( Strings.sublisp_char(
        string, ZERO_INTEGER ), $str13$qw, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) || ( NIL != list_utilities.lengthG( string, ONE_INTEGER, UNPROVIDED ) && Strings.sublisp_char( string,
            ZERO_INTEGER ).equalp( Characters.CHAR_y ) && NIL != vowel_charP( Strings.sublisp_char( string, ONE_INTEGER ), UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6623L)
  public static SubLObject single_c_codaP(final SubLObject string)
  {
    SubLObject ans = NIL;
    final SubLObject rev = Sequences.reverse( string );
    ans = makeBoolean( NIL != list_utilities.lengthG( string, ONE_INTEGER, UNPROVIDED ) && NIL == vowel_charP( Strings.sublisp_char( rev, ZERO_INTEGER ), UNPROVIDED ) && NIL != vowel_charP( Strings.sublisp_char( rev,
        ONE_INTEGER ), T ) );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6906L)
  public static SubLObject ends_with_doublerP(final SubLObject string)
  {
    return makeBoolean( NIL != list_utilities.lengthG( string, ZERO_INTEGER, UNPROVIDED ) && NIL != Sequences.find( string_utilities.last_char( string ), $doublers$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7031L)
  public static SubLObject starts_with_unstressed_pfxP(final SubLObject string)
  {
    SubLObject csome_list_var = $unstressed_latin_pfxs$.getGlobalValue();
    SubLObject pre = NIL;
    pre = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      if( NIL != string_utilities.starts_with( string, pre ) )
      {
        return T;
      }
      csome_list_var = csome_list_var.rest();
      pre = csome_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7253L)
  public static SubLObject ends_in_cvcP(final SubLObject string)
  {
    SubLObject ans = NIL;
    final SubLObject rev = Sequences.reverse( string );
    ans = makeBoolean( NIL != list_utilities.lengthG( string, TWO_INTEGER, UNPROVIDED ) && NIL != consonant_charP( Strings.sublisp_char( rev, ZERO_INTEGER ) ) && NIL != vowel_charP( Strings.sublisp_char( rev,
        ONE_INTEGER ), UNPROVIDED ) && NIL == vowel_charP( Strings.sublisp_char( rev, TWO_INTEGER ), UNPROVIDED ) );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7588L)
  public static SubLObject ends_in_quvcP(final SubLObject string)
  {
    SubLObject ans = NIL;
    final SubLObject rev = Sequences.reverse( string );
    ans = makeBoolean( NIL != list_utilities.lengthG( string, THREE_INTEGER, UNPROVIDED ) && NIL != Sequences.find( Strings.sublisp_char( rev, THREE_INTEGER ), $str14$q, Symbols.symbol_function( EQUALP ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) && NIL != Sequences.find( Strings.sublisp_char( rev, TWO_INTEGER ), $str15$u, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != consonant_charP( Strings
            .sublisp_char( rev, ZERO_INTEGER ) ) && NIL != vowel_charP( Strings.sublisp_char( rev, ONE_INTEGER ), UNPROVIDED ) );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7954L)
  public static SubLObject make_geminate(final SubLObject string, final SubLObject n)
  {
    if( NIL != list_utilities.lengthG( string, n, UNPROVIDED ) )
    {
      return string_utilities.infix( string_utilities.substring( string, n, number_utilities.f_1X( n ) ), string, n );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8158L)
  public static SubLObject geminate_last(final SubLObject string)
  {
    return make_geminate( string, number_utilities.f_1_( Sequences.length( string ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8292L)
  public static SubLObject correct_capitalization(final SubLObject correct, final SubLObject word)
  {
    if( NIL != string_utilities.lower_case_string_p( correct ) )
    {
      return Strings.string_downcase( word, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != string_utilities.upper_case_string_p( correct ) )
    {
      return Strings.string_upcase( word, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != string_utilities.capitalized_string_p( correct ) )
    {
      return Strings.string_capitalize( word, UNPROVIDED, UNPROVIDED );
    }
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8611L)
  public static SubLObject regular_string_function(final SubLObject pred)
  {
    if( pred.eql( $const16$comparativeDegree ) )
    {
      return Symbols.symbol_function( $sym17$COMPARATIVE_REG );
    }
    if( pred.eql( $const18$superlativeDegree ) )
    {
      return Symbols.symbol_function( $sym19$SUPERLATIVE_REG );
    }
    if( pred.eql( $const20$comparativeAdverb ) )
    {
      return Symbols.symbol_function( $sym21$COMPARATIVE_ADVERB_REG );
    }
    if( pred.eql( $const22$superlativeAdverb ) )
    {
      return Symbols.symbol_function( $sym23$SUPERLATIVE_ADVERB_REG );
    }
    return Symbols.symbol_function( IDENTITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9054L)
  public static SubLObject pos_preds_derivable_from_pred(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    assert NIL != forts.fort_p( pred ) : pred;
    return ( NIL != lexicon_accessors.speech_part_predP( pred, mt ) ) ? pos_preds_derivable_from_pred_int( pred, mt, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9404L)
  public static SubLObject clear_pos_preds_derivable_from_pred_int()
  {
    final SubLObject cs = $pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9404L)
  public static SubLObject remove_pos_preds_derivable_from_pred_int(final SubLObject pred, final SubLObject mt, SubLObject preds)
  {
    if( preds == UNPROVIDED )
    {
      preds = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue(), ConsesLow.list( pred, mt, preds ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9404L)
  public static SubLObject pos_preds_derivable_from_pred_int_internal(final SubLObject pred, final SubLObject mt, SubLObject preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym26$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( pred, $const27$regularSuffix, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
      SubLObject der_pred = NIL;
      der_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == subl_promotions.memberP( der_pred, preds, UNPROVIDED, UNPROVIDED ) )
        {
          preds = ConsesLow.cons( der_pred, preds );
          SubLObject cdolist_list_var_$3 = pos_preds_derivable_from_pred_int( der_pred, mt, preds );
          SubLObject new_pred = NIL;
          new_pred = cdolist_list_var_$3.first();
          while ( NIL != cdolist_list_var_$3)
          {
            final SubLObject item_var = new_pred;
            if( NIL == conses_high.member( item_var, preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              preds = ConsesLow.cons( item_var, preds );
            }
            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
            new_pred = cdolist_list_var_$3.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        der_pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9404L)
  public static SubLObject pos_preds_derivable_from_pred_int(final SubLObject pred, final SubLObject mt, SubLObject preds)
  {
    if( preds == UNPROVIDED )
    {
      preds = NIL;
    }
    SubLObject caching_state = $pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym25$POS_PREDS_DERIVABLE_FROM_PRED_INT, $sym28$_POS_PREDS_DERIVABLE_FROM_PRED_INT_CACHING_STATE_, NIL, EQL, THREE_INTEGER, $int29$256 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( pred, mt, preds );
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
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && preds.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( pos_preds_derivable_from_pred_int_internal( pred, mt, preds ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, mt, preds ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9893L)
  public static SubLObject singular_form_for_pred(final SubLObject pred)
  {
    if( NIL == plural_predP( pred, UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject pos = lexicon_accessors.pos_of_pred( pred );
    final SubLObject other_preds = lexicon_utilities.preds_of_pos( pos, UNPROVIDED );
    if( NIL == ans )
    {
      SubLObject csome_list_var = other_preds;
      SubLObject other_pred = NIL;
      other_pred = csome_list_var.first();
      while ( NIL == ans && NIL != csome_list_var)
      {
        if( NIL != singular_predP( other_pred, UNPROVIDED ) )
        {
          ans = other_pred;
        }
        csome_list_var = csome_list_var.rest();
        other_pred = csome_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10287L)
  public static SubLObject plural_predP(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      ans = makeBoolean( NIL != forts.fort_p( pred ) && NIL != genl_predicates.genl_predP( pred, $const30$plural_Generic, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10501L)
  public static SubLObject singular_predP(final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      ans = makeBoolean( NIL != forts.fort_p( pred ) && NIL != genl_predicates.genl_predP( pred, $const31$singular_Generic, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10719L)
  public static SubLObject generate_z_form(final SubLObject wu, final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != Sequences.find( pred, $list32, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym26$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), thread );
        final SubLObject singular_pred = singular_form_for_pred( pred );
        final SubLObject root = ( NIL != singular_pred ) ? kb_mapping_utilities.fpred_value( wu, singular_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
        if( NIL != root )
        {
          ans = Sequences.cconcatenate( root, $str33$z );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11252L)
  public static SubLObject suffix_rules_for_pred(final SubLObject pred)
  {
    return kb_mapping.gather_gaf_arg_index_with_predicate( pred, ONE_INTEGER, $const27$regularSuffix, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11428L)
  public static SubLObject generate_regular_string_from_form(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = $const34$EnglishLexiconMt;
    }
    return generate_regular_strings_from_form( target_pred, base_pred, base_form, mt_info, T, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11973L)
  public static SubLObject generate_regular_strings_from_form(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, SubLObject mt_info, SubLObject best_onlyP, SubLObject tried_preds)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = $const34$EnglishLexiconMt;
    }
    if( best_onlyP == UNPROVIDED )
    {
      best_onlyP = NIL;
    }
    if( tried_preds == UNPROVIDED )
    {
      tried_preds = NIL;
    }
    if( NIL != subl_promotions.memberP( base_pred, $list35, UNPROVIDED, UNPROVIDED ) && NIL != conses_high.member( target_pred, $list36, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject inflection_function = regular_string_function( target_pred );
      final SubLObject form = Functions.funcall( inflection_function, base_form );
      return ConsesLow.list( form );
    }
    return generate_regular_strings_from_form_int( target_pred, base_pred, base_form, mt_info, best_onlyP, tried_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13117L)
  public static SubLObject generate_regular_strings_from_form_int(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, final SubLObject mt_info, final SubLObject best_onlyP,
      final SubLObject tried_preds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject target_forms = NIL;
    SubLObject doneP = NIL;
    if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym37$RELEVANT_MT_IS_EVERYTHING ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym37$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const38$EverythingPSC, thread );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = suffix_rules_for_pred( target_pred );
          SubLObject rule = NIL;
          rule = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = assertions_high.gaf_args( rule ).rest();
            SubLObject rule_base_pred = NIL;
            SubLObject suffix = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
            rule_base_pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
            suffix = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( rule_base_pred.eql( base_pred ) )
              {
                final SubLObject item_var = add_english_suffix( base_form, suffix );
                if( NIL == conses_high.member( item_var, target_forms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  target_forms = ConsesLow.cons( item_var, target_forms );
                }
                doneP = best_onlyP;
              }
              else if( NIL == subl_promotions.memberP( ConsesLow.list( rule_base_pred, base_pred ), tried_preds, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
              {
                final SubLObject new_tried_preds = ConsesLow.cons( ConsesLow.list( rule_base_pred, base_pred ), tried_preds );
                final SubLObject derived_base_forms = generate_regular_strings_from_form( rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds );
                if( NIL == doneP )
                {
                  SubLObject csome_list_var_$4 = derived_base_forms;
                  SubLObject derived_base_form = NIL;
                  derived_base_form = csome_list_var_$4.first();
                  while ( NIL == doneP && NIL != csome_list_var_$4)
                  {
                    final SubLObject item_var2 = add_english_suffix( derived_base_form, suffix );
                    if( NIL == conses_high.member( item_var2, target_forms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      target_forms = ConsesLow.cons( item_var2, target_forms );
                    }
                    doneP = best_onlyP;
                    csome_list_var_$4 = csome_list_var_$4.rest();
                    derived_base_form = csome_list_var_$4.first();
                  }
                }
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
            }
            csome_list_var = csome_list_var.rest();
            rule = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym40$RELEVANT_MT_IS_ANY_MT ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym40$RELEVANT_MT_IS_ANY_MT, thread );
        mt_relevance_macros.$mt$.bind( $const41$InferencePSC, thread );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = suffix_rules_for_pred( target_pred );
          SubLObject rule = NIL;
          rule = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = assertions_high.gaf_args( rule ).rest();
            SubLObject rule_base_pred = NIL;
            SubLObject suffix = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
            rule_base_pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
            suffix = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( rule_base_pred.eql( base_pred ) )
              {
                final SubLObject item_var = add_english_suffix( base_form, suffix );
                if( NIL == conses_high.member( item_var, target_forms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  target_forms = ConsesLow.cons( item_var, target_forms );
                }
                doneP = best_onlyP;
              }
              else if( NIL == subl_promotions.memberP( ConsesLow.list( rule_base_pred, base_pred ), tried_preds, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
              {
                final SubLObject new_tried_preds = ConsesLow.cons( ConsesLow.list( rule_base_pred, base_pred ), tried_preds );
                final SubLObject derived_base_forms = generate_regular_strings_from_form( rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds );
                if( NIL == doneP )
                {
                  SubLObject csome_list_var_$5 = derived_base_forms;
                  SubLObject derived_base_form = NIL;
                  derived_base_form = csome_list_var_$5.first();
                  while ( NIL == doneP && NIL != csome_list_var_$5)
                  {
                    final SubLObject item_var2 = add_english_suffix( derived_base_form, suffix );
                    if( NIL == conses_high.member( item_var2, target_forms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      target_forms = ConsesLow.cons( item_var2, target_forms );
                    }
                    doneP = best_onlyP;
                    csome_list_var_$5 = csome_list_var_$5.rest();
                    derived_base_form = csome_list_var_$5.first();
                  }
                }
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
            }
            csome_list_var = csome_list_var.rest();
            rule = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym42$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
        mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = suffix_rules_for_pred( target_pred );
          SubLObject rule = NIL;
          rule = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = assertions_high.gaf_args( rule ).rest();
            SubLObject rule_base_pred = NIL;
            SubLObject suffix = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
            rule_base_pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
            suffix = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( rule_base_pred.eql( base_pred ) )
              {
                final SubLObject item_var = add_english_suffix( base_form, suffix );
                if( NIL == conses_high.member( item_var, target_forms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  target_forms = ConsesLow.cons( item_var, target_forms );
                }
                doneP = best_onlyP;
              }
              else if( NIL == subl_promotions.memberP( ConsesLow.list( rule_base_pred, base_pred ), tried_preds, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
              {
                final SubLObject new_tried_preds = ConsesLow.cons( ConsesLow.list( rule_base_pred, base_pred ), tried_preds );
                final SubLObject derived_base_forms = generate_regular_strings_from_form( rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds );
                if( NIL == doneP )
                {
                  SubLObject csome_list_var_$6 = derived_base_forms;
                  SubLObject derived_base_form = NIL;
                  derived_base_form = csome_list_var_$6.first();
                  while ( NIL == doneP && NIL != csome_list_var_$6)
                  {
                    final SubLObject item_var2 = add_english_suffix( derived_base_form, suffix );
                    if( NIL == conses_high.member( item_var2, target_forms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      target_forms = ConsesLow.cons( item_var2, target_forms );
                    }
                    doneP = best_onlyP;
                    csome_list_var_$6 = csome_list_var_$6.rest();
                    derived_base_form = csome_list_var_$6.first();
                  }
                }
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
            }
            csome_list_var = csome_list_var.rest();
            rule = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym26$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( mt_info, thread );
        if( NIL == doneP )
        {
          SubLObject csome_list_var = suffix_rules_for_pred( target_pred );
          SubLObject rule = NIL;
          rule = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = assertions_high.gaf_args( rule ).rest();
            SubLObject rule_base_pred = NIL;
            SubLObject suffix = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
            rule_base_pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
            suffix = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( rule_base_pred.eql( base_pred ) )
              {
                final SubLObject item_var = add_english_suffix( base_form, suffix );
                if( NIL == conses_high.member( item_var, target_forms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  target_forms = ConsesLow.cons( item_var, target_forms );
                }
                doneP = best_onlyP;
              }
              else if( NIL == subl_promotions.memberP( ConsesLow.list( rule_base_pred, base_pred ), tried_preds, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
              {
                final SubLObject new_tried_preds = ConsesLow.cons( ConsesLow.list( rule_base_pred, base_pred ), tried_preds );
                final SubLObject derived_base_forms = generate_regular_strings_from_form( rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds );
                if( NIL == doneP )
                {
                  SubLObject csome_list_var_$7 = derived_base_forms;
                  SubLObject derived_base_form = NIL;
                  derived_base_form = csome_list_var_$7.first();
                  while ( NIL == doneP && NIL != csome_list_var_$7)
                  {
                    final SubLObject item_var2 = add_english_suffix( derived_base_form, suffix );
                    if( NIL == conses_high.member( item_var2, target_forms, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      target_forms = ConsesLow.cons( item_var2, target_forms );
                    }
                    doneP = best_onlyP;
                    csome_list_var_$7 = csome_list_var_$7.rest();
                    derived_base_form = csome_list_var_$7.first();
                  }
                }
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
            }
            csome_list_var = csome_list_var.rest();
            rule = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return target_forms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14217L)
  public static SubLObject add_english_suffix(SubLObject base, SubLObject suffix)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_string.cycl_string_p( base ) : base;
    assert NIL != cycl_string.cycl_string_p( suffix ) : suffix;
    if( suffix.equal( $str44$ ) )
    {
      return base;
    }
    thread.resetMultipleValues();
    final SubLObject base_$8 = aes_do_orthographic_changes( base, suffix );
    final SubLObject suffix_$9 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    base = base_$8;
    suffix = suffix_$9;
    return string_utilities.post_fix( base, suffix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16883L)
  public static SubLObject aes_do_orthographic_changes(final SubLObject base, final SubLObject suffix)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_suffix = suffix;
    SubLObject current_base = base;
    SubLObject changers = NIL;
    SubLObject cdolist_list_var = aes_do_orthographic_change_fns();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject change_fn = NIL;
      SubLObject type = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
      change_fn = current.first();
      current = ( type = current.rest() );
      thread.resetMultipleValues();
      final SubLObject new_base = aes_do_orthographic_change( current_base, current_suffix, change_fn, type );
      final SubLObject new_suffix = thread.secondMultipleValue();
      final SubLObject changedP = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != changedP )
      {
        changers = ConsesLow.cons( change_fn, changers );
        current_base = new_base;
        current_suffix = new_suffix;
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return Values.values( current_base, current_suffix, changers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18208L)
  public static SubLObject aes_do_orthographic_change_fns()
  {
    return $aes_do_orthographic_change_fns$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18301L)
  public static SubLObject aes_do_orthographic_change(final SubLObject base, final SubLObject suffix, final SubLObject change_fn, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_suffix = suffix;
    SubLObject new_base = base;
    final SubLObject base_changerP = conses_high.member( type, $list47, UNPROVIDED, UNPROVIDED );
    final SubLObject suffix_changerP = conses_high.member( type, $list48, UNPROVIDED, UNPROVIDED );
    if( NIL != base_changerP && NIL != suffix_changerP )
    {
      thread.resetMultipleValues();
      final SubLObject new_base_$10 = Functions.funcall( change_fn, base, suffix );
      final SubLObject new_suffix_$11 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      new_base = new_base_$10;
      new_suffix = new_suffix_$11;
    }
    else if( NIL != base_changerP )
    {
      new_base = Functions.funcall( change_fn, base, suffix );
    }
    else if( NIL != suffix_changerP )
    {
      new_suffix = Functions.funcall( change_fn, base, suffix );
    }
    final SubLObject changedP = makeBoolean( !base.equal( new_base ) || !suffix.equal( new_suffix ) );
    return Values.values( new_base, new_suffix, changedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19041L)
  public static SubLObject ends_with_sibilantP(final SubLObject string)
  {
    return string_utilities.ends_with_one_of( string, $sibilant_endings$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19143L)
  public static SubLObject aes_add_e_before_s(final SubLObject base, SubLObject suffix)
  {
    if( NIL != ends_with_sibilantP( base ) && NIL != string_utilities.starts_with( suffix, $str49$s ) )
    {
      suffix = Sequences.cconcatenate( $str50$e, suffix );
    }
    return suffix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19338L)
  public static SubLObject aes_ion_to_ation(final SubLObject base, SubLObject suffix)
  {
    if( suffix.equal( $str51$ion ) && NIL != string_utilities.ends_with_one_of( base, $list52 ) )
    {
      suffix = $str53$ation;
    }
    return suffix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19594L)
  public static SubLObject aes_change_y_to_i(SubLObject base, SubLObject suffix)
  {
    if( NIL != string_utilities.ends_with( base, $str11$y, UNPROVIDED ) && NIL == string_utilities.starts_with( suffix, $str54$i ) && NIL == ends_with_vowelP( string_utilities.strip_final( base, UNPROVIDED ) ) )
    {
      base = Sequences.cconcatenate( string_utilities.strip_final( base, UNPROVIDED ), $str54$i );
      if( NIL != list_utilities.lengthE( suffix, ONE_INTEGER, UNPROVIDED ) && NIL != starts_with_consonantP( suffix ) )
      {
        suffix = Sequences.cconcatenate( $str50$e, suffix );
      }
    }
    return Values.values( base, suffix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20004L)
  public static SubLObject aes_ble_to_bil_before_ity(SubLObject base, final SubLObject suffix)
  {
    if( suffix.equalp( $str55$ity ) && NIL != string_utilities.ends_with( base, $str56$ble, UNPROVIDED ) )
    {
      base = Sequences.cconcatenate( string_utilities.strip_final( base, TWO_INTEGER ), $str57$il );
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20203L)
  public static SubLObject aes_change_aic_to_ac(SubLObject base, final SubLObject suffix)
  {
    if( NIL != string_utilities.starts_with( suffix, $str58$at ) && NIL != string_utilities.ends_with( string_utilities.strip_final( base, UNPROVIDED ), $str59$ai, UNPROVIDED ) && NIL != ends_with_consonantP( base ) )
    {
      base = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( string_utilities.strip_final( base, TWO_INTEGER ) ), format_nil.format_nil_a_no_copy( string_utilities.last_char( base ) ) );
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20496L)
  public static SubLObject aes_strip_final_e(SubLObject base, final SubLObject suffix)
  {
    if( NIL != list_utilities.lengthG( base, ONE_INTEGER, UNPROVIDED ) && NIL != string_utilities.ends_with( base, $str50$e, UNPROVIDED ) && ( NIL != string_utilities.starts_with( suffix, $str50$e )
        || ( ( NIL != string_utilities.ends_with( string_utilities.strip_final( base, UNPROVIDED ), $str15$u, UNPROVIDED ) || NIL != ends_with_consonantP( string_utilities.strip_final( base, UNPROVIDED ) ) )
            && NIL != starts_with_vowelP( suffix ) ) ) )
    {
      base = string_utilities.strip_final( base, UNPROVIDED );
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20828L)
  public static SubLObject aes_strip_final_vowels_before_ic(SubLObject base, final SubLObject suffix)
  {
    if( NIL != string_utilities.starts_with( suffix, $str54$i ) && !suffix.equalp( $str60$ing ) && NIL != list_utilities.lengthG( suffix, ONE_INTEGER, UNPROVIDED ) && NIL != polysyllabicP( base, UNPROVIDED )
        && NIL != starts_with_consonantP( string_utilities.substring( suffix, ONE_INTEGER, UNPROVIDED ) ) )
    {
      while ( NIL != ends_with_vowelP( base ))
      {
        base = string_utilities.strip_final( base, UNPROVIDED );
      }
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21201L)
  public static SubLObject aes_change_ie_to_y(SubLObject base, final SubLObject suffix)
  {
    if( NIL != string_utilities.ends_with( base, $str61$ie, UNPROVIDED ) && NIL != string_utilities.starts_with( suffix, $str54$i ) )
    {
      base = Sequences.cconcatenate( string_utilities.strip_final( base, TWO_INTEGER ), $str11$y );
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21392L)
  public static SubLObject aes_change_ism_to_ist(SubLObject base, final SubLObject suffix)
  {
    if( NIL != string_utilities.ends_with( base, $str62$ism, UNPROVIDED ) && NIL != Strings.string_equal( suffix, $str63$ist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      base = string_utilities.remove_substring( base, $str62$ism );
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21676L)
  public static SubLObject aes_change_ceive_to_cept(SubLObject base, final SubLObject suffix)
  {
    if( NIL != string_utilities.ends_with( base, $str64$ceive, UNPROVIDED ) && NIL != Strings.string_equal( suffix, $str51$ion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      base = Sequences.cconcatenate( string_utilities.remove_substring( base, $str65$ive ), $str66$pt );
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21940L)
  public static SubLObject aes_change_vert_to_vers(SubLObject base, final SubLObject suffix)
  {
    if( NIL != string_utilities.ends_with( base, $str67$vert, UNPROVIDED ) && NIL != Strings.string_equal( suffix, $str51$ion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      base = Sequences.cconcatenate( string_utilities.post_remove( base, $str67$vert, UNPROVIDED ), $str68$vers );
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22199L)
  public static SubLObject aes_change_duce_to_duct(SubLObject base, final SubLObject suffix)
  {
    if( NIL != string_utilities.ends_with( base, $str69$duce, UNPROVIDED ) && NIL != Strings.string_equal( suffix, $str51$ion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      base = Sequences.cconcatenate( string_utilities.post_remove( base, $str50$e, UNPROVIDED ), $str70$t );
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22450L)
  public static SubLObject aes_remove_able_le_before_ly(SubLObject base, final SubLObject suffix)
  {
    if( ( NIL != string_utilities.ends_with( base, $str71$able, UNPROVIDED ) || NIL != string_utilities.ends_with( base, $str72$ible, UNPROVIDED ) ) && NIL != Strings.string_equal( suffix, $str12$ly, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      base = string_utilities.remove_substring( base, $str73$le );
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22682L)
  public static SubLObject aes_de_to_se(SubLObject base, final SubLObject suffix)
  {
    if( NIL != string_utilities.ends_with( base, $str74$de, UNPROVIDED ) && NIL != string_utilities.starts_with( suffix, $str54$i ) && NIL == string_utilities.starts_with( suffix, $str75$is ) && NIL == subl_promotions
        .memberP( suffix, $list76, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      base = Sequences.cconcatenate( string_utilities.post_remove( base, $str74$de, UNPROVIDED ), $str77$se );
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23010L)
  public static SubLObject aes_geminate_last(SubLObject base, final SubLObject suffix)
  {
    if( ( NIL != string_utilities.ends_with( base, $str33$z, UNPROVIDED ) || NIL != starts_with_vowelP( suffix ) || suffix.equalp( $str11$y ) ) && NIL != ends_with_doublerP( base ) && NIL == dont_geminate_beforeP(
        suffix ) && ( NIL != ends_in_cvcP( base ) || NIL != ends_in_quvcP( base ) ) && ( ( !suffix.equalp( $str78$ize ) && !suffix.equalp( $str79$ise ) ) || NIL != string_utilities.ends_with( base, $str80$al,
            UNPROVIDED ) ) && ( ( NIL == string_utilities.ends_with( base, $str81$er, UNPROVIDED ) && NIL == string_utilities.ends_with( base, $str82$or, UNPROVIDED ) ) || ( NIL != string_utilities.ends_with( base,
                $str83$fer, UNPROVIDED ) && NIL == string_utilities.ends_with( base, $str84$ffer, UNPROVIDED ) ) ) && ( NIL == string_utilities.ends_with( base, $str85$id, UNPROVIDED ) || NIL != monosyllabicP( base ) )
        && ( NIL == string_utilities.ends_with_one_of( base, $list86 ) || NIL != monosyllabicP( base ) ) )
    {
      base = geminate_last( base );
    }
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23879L)
  public static SubLObject dont_geminate_beforeP(final SubLObject suffix)
  {
    return makeBoolean( suffix.equalp( $str71$able ) || suffix.equalp( $str55$ity ) || suffix.equalp( $str87$alicious ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24024L)
  public static SubLObject aes_able_to_ate(SubLObject base, final SubLObject suffix)
  {
    if( NIL == string_utilities.ends_with( base, $str88$ate, UNPROVIDED ) || NIL == Strings.string_equal( suffix, $str71$able, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return base;
    }
    if( estimated_syllable_count( base ).numLE( TWO_INTEGER ) )
    {
      base = string_utilities.post_remove( base, $str50$e, UNPROVIDED );
      return base;
    }
    if( NIL != subl_promotions.memberP( base, $special_ate_cases$.getGlobalValue(), EQUALP, UNPROVIDED ) )
    {
      base = string_utilities.remove_substring( base, $str88$ate );
      return base;
    }
    base = string_utilities.post_remove( base, $str50$e, UNPROVIDED );
    return base;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24873L)
  public static SubLObject try_regular_adj_morphologyP(final SubLObject base_form)
  {
    final SubLObject cutoff = $comparative_syllable_cutoff$.getGlobalValue();
    return makeBoolean( NIL == string_utilities.ends_with( base_form, $str89$ed, UNPROVIDED ) && estimated_syllable_count( base_form ).numLE( cutoff ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25329L)
  public static SubLObject most_form(final SubLObject string)
  {
    return Sequences.cconcatenate( $most_prefix$.getGlobalValue(), string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25410L)
  public static SubLObject more_form(final SubLObject string)
  {
    return Sequences.cconcatenate( $more_prefix$.getGlobalValue(), string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25491L)
  public static SubLObject most_form_p(final SubLObject string)
  {
    return string_utilities.starts_with( string, $most_prefix$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25573L)
  public static SubLObject more_form_p(final SubLObject string)
  {
    return string_utilities.starts_with( string, $more_prefix$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25655L)
  public static SubLObject more_or_most_form(final SubLObject string, final SubLObject pred)
  {
    if( NIL != lexicon_cache.comparative_formP( pred ) )
    {
      return more_form( string );
    }
    if( NIL != lexicon_cache.superlative_formP( pred ) )
    {
      return most_form( string );
    }
    return more_form( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26169L)
  public static SubLObject more_or_most_form_p(final SubLObject string, final SubLObject pred)
  {
    if( NIL != lexicon_cache.comparative_formP( pred ) )
    {
      return more_form_p( string );
    }
    if( NIL != lexicon_cache.superlative_formP( pred ) )
    {
      return most_form_p( string );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26616L)
  public static SubLObject comparative_reg(final SubLObject string)
  {
    if( NIL != try_regular_adj_morphologyP( string ) )
    {
      return add_english_suffix( string, $str81$er );
    }
    return more_form( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27048L)
  public static SubLObject comparative_adverb_reg(final SubLObject string)
  {
    if( NIL != string_utilities.ends_with( string, $str12$ly, UNPROVIDED ) )
    {
      return more_form( string );
    }
    return comparative_reg( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27377L)
  public static SubLObject superlative_reg(final SubLObject string)
  {
    if( NIL != try_regular_adj_morphologyP( string ) )
    {
      return add_english_suffix( string, $str92$est );
    }
    return most_form( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27725L)
  public static SubLObject superlative_adverb_reg(final SubLObject string)
  {
    if( NIL != string_utilities.ends_with( string, $str12$ly, UNPROVIDED ) )
    {
      return most_form( string );
    }
    return superlative_reg( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28054L)
  public static SubLObject past_tense_reg(final SubLObject string)
  {
    return generate_regular_string_from_form( $const93$pastTense_Universal, $const94$infinitive, string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28656L)
  public static SubLObject gerund_reg(final SubLObject string)
  {
    return generate_regular_string_from_form( $const95$gerund, $const94$infinitive, string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28890L)
  public static SubLObject third_sg_reg(final SubLObject string)
  {
    return generate_regular_string_from_form( $const96$thirdPersonSg_Present, $const94$infinitive, string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29127L)
  public static SubLObject plural_reg(final SubLObject string)
  {
    return correct_capitalization( string, generate_regular_string_from_form( $const97$plural, $const98$singular, string, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29362L)
  public static SubLObject pn_plural_reg(final SubLObject string)
  {
    return string_utilities.string_proper( pluralize_string( string, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29606L)
  public static SubLObject infinitive_to_third_sing(final SubLObject string)
  {
    final SubLObject words = lexicon_accessors.words_of_stringXpred( string, $const94$infinitive, T, $const99$EnglishMt, UNPROVIDED );
    if( NIL != words )
    {
      final SubLObject word_to_use = words.first();
      final SubLObject irreg_stored_form = lexicon_utilities.verb_form_third_sing( word_to_use, UNPROVIDED );
      if( NIL != irreg_stored_form )
      {
        return irreg_stored_form;
      }
    }
    return generate_regular_string_from_form( $const96$thirdPersonSg_Present, $const94$infinitive, string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30275L)
  public static SubLObject infinitive_to_pres_participle(final SubLObject string)
  {
    final SubLObject words = lexicon_accessors.words_of_stringXpred( string, $const94$infinitive, T, $const99$EnglishMt, UNPROVIDED );
    if( NIL != words )
    {
      final SubLObject word_to_use = words.first();
      final SubLObject irreg_stored_form = lexicon_utilities.verb_form_pres_participle( word_to_use, UNPROVIDED );
      if( NIL != irreg_stored_form )
      {
        return irreg_stored_form;
      }
    }
    return generate_regular_string_from_form( $const100$presentParticiple, $const94$infinitive, string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31415L)
  public static SubLObject possessivize_string(final SubLObject string, SubLObject pos_pred)
  {
    if( pos_pred == UNPROVIDED )
    {
      pos_pred = NIL;
    }
    if( !string.isString() )
    {
      return string;
    }
    final SubLObject lexical_possessive = english_lexical_possessive_version_of_string( string );
    if( lexical_possessive.isString() )
    {
      return lexical_possessive;
    }
    return Sequences.cconcatenate( string, english_possessive_suffix_for_string( string, pos_pred ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31975L)
  public static SubLObject english_lexical_possessive_version_of_string(final SubLObject string)
  {
    final SubLObject pronominal_possessive = list_utilities.alist_lookup( $english_possessive_pronouns$.getGlobalValue(), string, Symbols.symbol_function( EQUALP ), $kw102$NOT_FOUND );
    if( pronominal_possessive.isString() )
    {
      return pronominal_possessive;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32334L)
  public static SubLObject english_possessive_suffix_for_string(final SubLObject string, SubLObject pos_pred)
  {
    if( pos_pred == UNPROVIDED )
    {
      pos_pred = NIL;
    }
    SubLObject suffix = NIL;
    if( NIL == pos_pred && NIL != plural_nounP( string ) )
    {
      pos_pred = $const30$plural_Generic;
    }
    if( NIL != forts.fort_p( pos_pred ) && NIL != string_utilities.ends_with( string, $str49$s, UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( pos_pred, $const30$plural_Generic, UNPROVIDED ) )
    {
      suffix = $str103$_;
    }
    if( !suffix.isString() )
    {
      suffix = $str104$_s;
    }
    return suffix;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32867L)
  public static SubLObject locativize_string(final SubLObject string, final SubLObject denot)
  {
    if( NIL != not_locativizable_english_stringP( string ) )
    {
      return string;
    }
    return Sequences.cconcatenate( english_locative_preposition_for_denot( denot ), new SubLObject[] { $str105$_, string
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33180L)
  public static SubLObject not_locativizable_english_stringP(final SubLObject v_object)
  {
    if( !v_object.isString() )
    {
      return T;
    }
    SubLObject ans = NIL;
    if( NIL != subl_promotions.memberP( $const106$QuantifyingIndexical, lexicon_accessors.pos_of_string( v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) )
    {
      ans = T;
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33560L)
  public static SubLObject english_locative_preposition_for_denot(final SubLObject denot)
  {
    if( NIL != isa.isa_in_any_mtP( denot, $const107$GeographicalRegion ) )
    {
      return $str108$in;
    }
    if( NIL != isa.isa_in_any_mtP( denot, $const109$SurfaceRegion_Underspecified ) )
    {
      return $str110$on;
    }
    return $str108$in;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33793L)
  public static SubLObject pluralize_string(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const99$EnglishMt;
    }
    SubLObject ans = NIL;
    ans = pluralize_string_wXlexicon( string, mt );
    if( NIL == ans )
    {
      final SubLObject tokens = nl_trie.nl_trie_string_tokenize( string );
      final SubLObject last_token = conses_high.last( tokens, UNPROVIDED ).first();
      if( NIL != list_utilities.lengthG( tokens, ONE_INTEGER, UNPROVIDED ) )
      {
        final SubLObject plural_last_token = pluralize_string_wXlexicon( last_token, mt );
        if( NIL != plural_last_token )
        {
          ans = Sequences.cconcatenate( Sequences.subseq( string, ZERO_INTEGER, Numbers.subtract( Sequences.length( string ), Sequences.length( last_token ) ) ), plural_last_token );
        }
      }
    }
    if( NIL == ans )
    {
      ans = plural_reg( string );
    }
    return correct_capitalization( string, ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34735L)
  public static SubLObject pluralize_string_wXlexicon(final SubLObject string, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != control_vars.lexicon_initialized_p() )
    {
      final SubLObject words = lexicon_accessors.words_of_stringXpred( string, $const31$singular_Generic, T, mt, UNPROVIDED );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
        if( NIL == ans )
        {
          SubLObject csome_list_var = words;
          SubLObject word = NIL;
          word = csome_list_var.first();
          while ( NIL == ans && NIL != csome_list_var)
          {
            if( NIL == ans )
            {
              SubLObject csome_list_var_$12 = lexicon_accessors.preds_of_stringXword( string, word, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              SubLObject singular_pred = NIL;
              singular_pred = csome_list_var_$12.first();
              while ( NIL == ans && NIL != csome_list_var_$12)
              {
                final SubLObject plural_pred = lexicon_accessors.plural_pred( lexicon_accessors.pos_of_pred( singular_pred ) );
                if( NIL != plural_pred )
                {
                  ans = lexicon_cache.first_string_of_wordXpred( word, plural_pred, mt );
                }
                csome_list_var_$12 = csome_list_var_$12.rest();
                singular_pred = csome_list_var_$12.first();
              }
            }
            csome_list_var = csome_list_var.rest();
            word = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return ( NIL != ans ) ? correct_capitalization( string, ans ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35458L)
  public static SubLObject singularize_string(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const99$EnglishMt;
    }
    SubLObject ans = NIL;
    ans = singularize_string_wXlexicon( string, mt );
    if( NIL == ans )
    {
      final SubLObject tokens = nl_trie.nl_trie_string_tokenize( string );
      final SubLObject last_token = conses_high.last( tokens, UNPROVIDED ).first();
      if( NIL != list_utilities.lengthG( tokens, ONE_INTEGER, UNPROVIDED ) )
      {
        final SubLObject singular_last_token = singularize_string_wXlexicon( last_token, mt );
        if( NIL != singular_last_token )
        {
          ans = Sequences.cconcatenate( Sequences.subseq( string, ZERO_INTEGER, Numbers.subtract( Sequences.length( string ), Sequences.length( last_token ) ) ), singular_last_token );
        }
      }
    }
    if( NIL == ans )
    {
      ans = singular_reg( string );
    }
    return correct_capitalization( string, ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36821L)
  public static SubLObject singularize_string_wXlexicon(final SubLObject string, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != control_vars.lexicon_initialized_p() )
    {
      final SubLObject words = lexicon_accessors.words_of_stringXpred( string, $const30$plural_Generic, T, mt, UNPROVIDED );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt ), thread );
        if( NIL == ans )
        {
          SubLObject csome_list_var = words;
          SubLObject word = NIL;
          word = csome_list_var.first();
          while ( NIL == ans && NIL != csome_list_var)
          {
            if( NIL == ans )
            {
              SubLObject csome_list_var_$13 = lexicon_accessors.preds_of_stringXword( string, word, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              SubLObject plural_pred = NIL;
              plural_pred = csome_list_var_$13.first();
              while ( NIL == ans && NIL != csome_list_var_$13)
              {
                final SubLObject singular_pred = lexicon_accessors.singular_pred( lexicon_accessors.pos_of_pred( plural_pred ) );
                if( NIL != singular_pred )
                {
                  ans = lexicon_cache.first_string_of_wordXpred( word, singular_pred, UNPROVIDED );
                }
                csome_list_var_$13 = csome_list_var_$13.rest();
                plural_pred = csome_list_var_$13.first();
              }
            }
            csome_list_var = csome_list_var.rest();
            word = csome_list_var.first();
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return ( NIL != ans ) ? correct_capitalization( string, ans ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37545L)
  public static SubLObject has_word_for_string_and_pos(final SubLObject string, final SubLObject pos_keyword)
  {
    SubLObject word_units = NIL;
    if( NIL == string_utilities.non_empty_string_p( string ) )
    {
      return NIL;
    }
    if( NIL == word_units )
    {
      SubLObject csome_list_var;
      SubLObject pred;
      for( csome_list_var = lexification_utilities.basic_preds_for_part_of_speech( pos_keyword ), pred = NIL, pred = csome_list_var.first(); NIL == word_units && NIL != csome_list_var; word_units = lexicon_accessors
          .words_of_stringXpred( string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED ), csome_list_var = csome_list_var.rest(), pred = csome_list_var.first() )
      {
      }
    }
    return word_units;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38083L)
  public static SubLObject has_word_for_string_and_pos_list(final SubLObject string, final SubLObject pos_keyword_list)
  {
    SubLObject has_mapping = NIL;
    if( NIL == has_mapping )
    {
      SubLObject csome_list_var;
      SubLObject pos;
      for( csome_list_var = pos_keyword_list, pos = NIL, pos = csome_list_var.first(); NIL == has_mapping && NIL != csome_list_var; has_mapping = has_word_for_string_and_pos( string,
          pos ), csome_list_var = csome_list_var.rest(), pos = csome_list_var.first() )
      {
      }
    }
    return has_mapping;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38446L)
  public static SubLObject is_word(final SubLObject string)
  {
    return lexicon_cache.words_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38629L)
  public static SubLObject is_noun(final SubLObject string)
  {
    return has_word_for_string_and_pos_list( string, $list111 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38928L)
  public static SubLObject is_verb(final SubLObject string)
  {
    return has_word_for_string_and_pos( string, $kw112$VERB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39206L)
  public static SubLObject is_noun_or_verb(final SubLObject string)
  {
    return has_word_for_string_and_pos_list( string, $list113 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39460L)
  public static SubLObject clear_find_stem_memoized()
  {
    final SubLObject cs = $find_stem_memoized_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39460L)
  public static SubLObject remove_find_stem_memoized(final SubLObject word, SubLObject pos_keyword)
  {
    if( pos_keyword == UNPROVIDED )
    {
      pos_keyword = $kw114$ANY;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $find_stem_memoized_caching_state$.getGlobalValue(), ConsesLow.list( word, pos_keyword ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39460L)
  public static SubLObject find_stem_memoized_internal(final SubLObject word, final SubLObject pos_keyword)
  {
    return find_stem( word, pos_keyword );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39460L)
  public static SubLObject find_stem_memoized(final SubLObject word, SubLObject pos_keyword)
  {
    if( pos_keyword == UNPROVIDED )
    {
      pos_keyword = $kw114$ANY;
    }
    SubLObject caching_state = $find_stem_memoized_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym115$FIND_STEM_MEMOIZED, $sym116$_FIND_STEM_MEMOIZED_CACHING_STATE_, $int117$16384, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym118$CLEAR_FIND_STEM_MEMOIZED );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( word, pos_keyword );
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
        if( word.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && pos_keyword.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( find_stem_memoized_internal( word, pos_keyword ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word, pos_keyword ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39657L)
  public static SubLObject find_stem(final SubLObject string, SubLObject pos_keyword)
  {
    if( pos_keyword == UNPROVIDED )
    {
      pos_keyword = $kw114$ANY;
    }
    SubLObject stem = NIL;
    if( NIL == lexicon_accessors.closed_lexical_class_stringP( string, UNPROVIDED ) )
    {
      if( NIL != string_utilities.ends_with( string, $str119$ies, UNPROVIDED ) )
      {
        final SubLObject y_stem = string_utilities.post_fix( string_utilities.strip_trailer( string, $str119$ies ), $str11$y );
        final SubLObject minus_s = string_utilities.strip_final( string, UNPROVIDED );
        if( NIL != is_noun_or_verb( minus_s ) )
        {
          stem = minus_s;
        }
        else
        {
          stem = y_stem;
        }
      }
      else if( NIL != string_utilities.ends_with( string, $str49$s, UNPROVIDED ) )
      {
        if( NIL == string_utilities.ends_with( string, $str120$ss, UNPROVIDED ) )
        {
          final SubLObject minus_s2 = string_utilities.strip_final( string, UNPROVIDED );
          final SubLObject minus_es = ( NIL != string_utilities.ends_with( minus_s2, $str50$e, UNPROVIDED ) ) ? string_utilities.strip_final( minus_s2, UNPROVIDED ) : NIL;
          if( NIL != is_noun_or_verb( minus_s2 ) )
          {
            stem = minus_s2;
          }
          else if( NIL != minus_es && NIL != is_noun_or_verb( minus_es ) )
          {
            stem = minus_es;
          }
          else if( NIL != minus_es )
          {
            if( NIL == stem )
            {
              SubLObject csome_list_var = $list121;
              SubLObject ending = NIL;
              ending = csome_list_var.first();
              while ( NIL == stem && NIL != csome_list_var)
              {
                if( NIL != string_utilities.ends_with( minus_es, ending, UNPROVIDED ) )
                {
                  stem = minus_es;
                }
                csome_list_var = csome_list_var.rest();
                ending = csome_list_var.first();
              }
            }
            if( NIL != string_utilities.ends_with( minus_es, $str33$z, UNPROVIDED ) )
            {
              final SubLObject minus_zes = string_utilities.strip_final( minus_es, UNPROVIDED );
              if( NIL != string_utilities.ends_with( minus_zes, $str33$z, UNPROVIDED ) && NIL != is_noun_or_verb( minus_zes ) )
              {
                stem = minus_zes;
              }
            }
            if( NIL == stem )
            {
              stem = minus_s2;
            }
          }
        }
      }
      else if( ( pos_keyword == $kw114$ANY || pos_keyword == $kw112$VERB ) && NIL != string_utilities.ends_with( string, $str60$ing, UNPROVIDED ) )
      {
        final SubLObject minus_ing = string_utilities.strip_trailer( string, $str60$ing );
        final SubLObject minus_4 = string_utilities.strip_final( minus_ing, UNPROVIDED );
        final SubLObject plus_e = string_utilities.post_fix( minus_ing, $str50$e );
        SubLObject ordered_tests = ConsesLow.list( minus_ing, plus_e );
        if( NIL != ends_with_doublerP( minus_ing ) )
        {
          if( NIL != string_utilities.ends_in_geminateP( minus_ing ) )
          {
            ordered_tests = ConsesLow.cons( minus_4, ordered_tests );
            ordered_tests = ConsesLow.cons( minus_ing, ordered_tests );
          }
          if( NIL != ends_in_cvcP( minus_ing ) )
          {
            ordered_tests = ConsesLow.cons( plus_e, ordered_tests );
          }
        }
        if( NIL == stem )
        {
          SubLObject csome_list_var2 = ordered_tests;
          SubLObject verb_form = NIL;
          verb_form = csome_list_var2.first();
          while ( NIL == stem && NIL != csome_list_var2)
          {
            if( NIL != is_verb( verb_form ) )
            {
              stem = verb_form;
            }
            csome_list_var2 = csome_list_var2.rest();
            verb_form = csome_list_var2.first();
          }
        }
      }
      else if( ( pos_keyword == $kw114$ANY || pos_keyword == $kw112$VERB ) && NIL != string_utilities.ends_with( string, $str89$ed, UNPROVIDED ) )
      {
        final SubLObject minus_d = string_utilities.strip_final( string, UNPROVIDED );
        final SubLObject minus_ed = string_utilities.strip_trailer( string, $str89$ed );
        final SubLObject minus_5 = string_utilities.strip_final( minus_ed, UNPROVIDED );
        if( NIL != is_verb( minus_d ) )
        {
          stem = minus_d;
        }
        if( NIL == stem && NIL != is_verb( minus_ed ) )
        {
          stem = minus_ed;
        }
        if( NIL == stem && NIL != is_word( string ) )
        {
          stem = string;
        }
        if( NIL == stem )
        {
          if( NIL != ends_with_doublerP( minus_ed ) && NIL != string_utilities.ends_in_geminateP( minus_ed ) )
          {
            stem = minus_5;
          }
          else
          {
            stem = minus_d;
          }
        }
      }
      else if( NIL != string_utilities.ends_with( string, $str33$z, UNPROVIDED ) && ( NIL != is_noun( string_utilities.strip_trailer( string, $str33$z ) ) || NIL != lexicon_accessors.denots_of_acronym_string(
          string_utilities.strip_trailer( string, $str33$z ), UNPROVIDED, UNPROVIDED ) ) )
      {
        stem = string_utilities.strip_trailer( string, $str33$z );
      }
    }
    if( NIL == stem )
    {
      stem = string;
    }
    return stem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42919L)
  public static SubLObject inflected_verb_to_infinitive(SubLObject string)
  {
    SubLObject stem = NIL;
    if( NIL != string_utilities.ends_with( string, $str122$ied, UNPROVIDED ) )
    {
      stem = string_utilities.strip_trailer( string, $str122$ied );
      string = string_utilities.post_fix( stem, $str11$y );
      return string;
    }
    if( NIL != string_utilities.ends_with( string, $str119$ies, UNPROVIDED ) )
    {
      stem = string_utilities.strip_trailer( string, $str119$ies );
      string = string_utilities.post_fix( stem, $str11$y );
      return string;
    }
    if( NIL != string_utilities.ends_with( string, $str89$ed, UNPROVIDED ) )
    {
      stem = string_utilities.strip_trailer( string, $str89$ed );
      if( NIL != string_utilities.ends_with( stem, $str11$y, UNPROVIDED ) )
      {
        return stem;
      }
      if( NIL == string_utilities.ends_in_geminateP( stem ) )
      {
        return stem;
      }
      if( NIL != string_utilities.ends_with( stem, $str123$l, UNPROVIDED ) )
      {
        return stem;
      }
      return string_utilities.strip_final( stem, UNPROVIDED );
    }
    else
    {
      if( NIL != string_utilities.ends_with( string, $str124$d, UNPROVIDED ) )
      {
        string = string_utilities.strip_trailer( string, $str124$d );
      }
      if( NIL == string_utilities.ends_with( string, $str60$ing, UNPROVIDED ) )
      {
        if( NIL != string_utilities.ends_with( string, $str49$s, UNPROVIDED ) )
        {
          string = third_sg_verb_to_infinitive( string );
        }
        return string;
      }
      stem = string_utilities.strip_trailer( string, $str60$ing );
      if( NIL != string_utilities.ends_in_geminateP( stem ) && NIL == string_utilities.ends_with( stem, $str123$l, UNPROVIDED ) )
      {
        return string_utilities.strip_final( stem, UNPROVIDED );
      }
      return stem;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44161L)
  public static SubLObject agentive_to_infinitive(final SubLObject string)
  {
    SubLObject stem = NIL;
    if( NIL != string_utilities.ends_with( string, $str82$or, UNPROVIDED ) )
    {
      return string_utilities.strip_trailer( string, $str82$or );
    }
    if( NIL == string_utilities.ends_with( string, $str81$er, UNPROVIDED ) )
    {
      return NIL;
    }
    stem = string_utilities.strip_trailer( string, $str81$er );
    if( NIL != nl_trie_accessors.nl_trie_words_of_stringXpred( stem, $const94$infinitive, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return stem;
    }
    return string_utilities.strip_trailer( string, $str125$r );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44647L)
  public static SubLObject third_sg_verb_to_infinitive(final SubLObject string)
  {
    SubLObject stem = NIL;
    if( NIL != string_utilities.ends_with( string, $str119$ies, UNPROVIDED ) )
    {
      stem = string_utilities.post_fix( string_utilities.strip_trailer( string, $str119$ies ), $str11$y );
      return stem;
    }
    if( NIL != string_utilities.ends_with( string, $str126$es, UNPROVIDED ) )
    {
      stem = string_utilities.strip_trailer( string, $str126$es );
      SubLObject cdolist_list_var = $sibilant_endings$.getGlobalValue();
      SubLObject ending = NIL;
      ending = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != string_utilities.ends_with( stem, ending, UNPROVIDED ) )
        {
          return stem;
        }
        cdolist_list_var = cdolist_list_var.rest();
        ending = cdolist_list_var.first();
      }
    }
    if( NIL != string_utilities.ends_with( string, $str49$s, UNPROVIDED ) && NIL == string_utilities.ends_with( string, $str120$ss, UNPROVIDED ) )
    {
      return string_utilities.strip_trailer( string, $str49$s );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45302L)
  public static SubLObject plural_noun_to_sg(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const99$EnglishMt;
    }
    return singularize_string( string, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45595L)
  public static SubLObject singular_reg(SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $preserve_case_in_singular_regP$.getDynamicValue( thread ) )
    {
      string = Strings.string_downcase( string, UNPROVIDED, UNPROVIDED );
    }
    SubLObject stem = NIL;
    if( NIL != string_utilities.ends_with( string, $str119$ies, UNPROVIDED ) )
    {
      stem = string_utilities.strip_trailer( string, $str119$ies );
      string = string_utilities.post_fix( stem, $str11$y );
      return string;
    }
    if( NIL != string_utilities.ends_with( string, $str126$es, UNPROVIDED ) )
    {
      stem = string_utilities.strip_trailer( string, $str126$es );
      SubLObject cdolist_list_var = $sibilant_endings$.getGlobalValue();
      SubLObject ending = NIL;
      ending = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != string_utilities.ends_with( stem, ending, UNPROVIDED ) )
        {
          string = stem;
          return string;
        }
        cdolist_list_var = cdolist_list_var.rest();
        ending = cdolist_list_var.first();
      }
    }
    if( NIL != string_utilities.ends_with( string, $str128$us, UNPROVIDED ) )
    {
      if( string.equal( $str128$us ) )
      {
        return string;
      }
      final SubLObject preceding_char = string_utilities.last_char( string_utilities.strip_trailer( string, $str128$us ) );
      if( NIL != subl_promotions.memberP( preceding_char, $list129, UNPROVIDED, UNPROVIDED ) )
      {
        return string;
      }
    }
    if( NIL != string_utilities.ends_with( string, $str49$s, UNPROVIDED ) && NIL == string_utilities.ends_with( string, $str120$ss, UNPROVIDED ) )
    {
      string = string_utilities.strip_trailer( string, $str49$s );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46464L)
  public static SubLObject plural_nounP(final SubLObject string)
  {
    if( NIL == string_utilities.ends_with( string, $str49$s, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject stem = string_utilities.strip_final( string, UNPROVIDED );
    if( NIL != string_utilities.ends_with( stem, $str49$s, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != string_utilities.ends_with( stem, $str50$e, UNPROVIDED ) )
    {
      return T;
    }
    SubLObject ends_with_sibilant = NIL;
    if( NIL == ends_with_sibilant )
    {
      SubLObject csome_list_var;
      SubLObject ending;
      for( csome_list_var = $list130, ending = NIL, ending = csome_list_var.first(); NIL == ends_with_sibilant && NIL != csome_list_var; ends_with_sibilant = string_utilities.ends_with( stem, ending,
          UNPROVIDED ), csome_list_var = csome_list_var.rest(), ending = csome_list_var.first() )
      {
      }
    }
    return makeBoolean( NIL == ends_with_sibilant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47017L)
  public static SubLObject infinitive_verbP(final SubLObject string)
  {
    if( string.eql( inflected_verb_to_infinitive( string ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47159L)
  public static SubLObject progressive_stringP(final SubLObject string)
  {
    if( NIL == string_utilities.ends_with( string, $str60$ing, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject root = find_stem( string, UNPROVIDED );
    return makeBoolean( NIL == Strings.string_equal( root, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != lexicon_accessors.string_is_posP( root, $const131$Verb, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47426L)
  public static SubLObject perfect_stringP(final SubLObject string)
  {
    if( NIL != string_utilities.ends_with( string, $str89$ed, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str132$en, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47586L)
  public static SubLObject f_3sg_stringP(final SubLObject string)
  {
    return plural_nounP( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47689L)
  public static SubLObject numberspp(final SubLObject string)
  {
    if( reader.read_from_string_ignoring_errors( string, NIL, NIL, UNPROVIDED, UNPROVIDED ).isNumber() )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47841L)
  public static SubLObject comparative_degreeP(final SubLObject string)
  {
    if( NIL != string_utilities.ends_with( string, $str81$er, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47926L)
  public static SubLObject superlative_degreeP(final SubLObject string)
  {
    if( NIL != string_utilities.ends_with( string, $str92$est, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48012L)
  public static SubLObject irregularP(final SubLObject wu, final SubLObject stem)
  {
    SubLObject cdolist_list_var;
    final SubLObject pos = cdolist_list_var = lexicon_accessors.pos_of_stringXword( stem, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject pt = NIL;
    pt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( pt.eql( $const133$CountNoun ) )
      {
        return irregular_snP( wu );
      }
      if( pt.eql( $const131$Verb ) )
      {
        return irregular_verbP( wu );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pt = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48367L)
  public static SubLObject irregular_snP(final SubLObject wu)
  {
    return makeBoolean( NIL != lexicon_utilities.noun_form_singular( wu, UNPROVIDED ) && NIL != lexicon_utilities.noun_form_plural( wu, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48528L)
  public static SubLObject irregular_anP(final SubLObject wu)
  {
    return makeBoolean( NIL != lexicon_utilities.ag_noun_form_singular( wu, UNPROVIDED ) && NIL != lexicon_utilities.ag_noun_form_plural( wu, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48704L)
  public static SubLObject irregular_verbP(final SubLObject wu)
  {
    return makeBoolean( NIL != lexicon_utilities.verb_form_infinitive( wu, UNPROVIDED ) && NIL != lexicon_utilities.verb_form_perfect( wu, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48870L)
  public static SubLObject pos_of_unknown_word(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject speech_parts = NIL;
    if( NIL != numberspp( string ) )
    {
      final SubLObject item_var = $const134$Number_SP;
      if( NIL == conses_high.member( item_var, speech_parts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        speech_parts = ConsesLow.cons( item_var, speech_parts );
      }
    }
    if( NIL != control_vars.$use_wn_linksP$.getGlobalValue() )
    {
      SubLObject cdolist_list_var;
      final SubLObject pos_keywords = cdolist_list_var = wordnet.pos_according_to_wn( string );
      SubLObject key = NIL;
      key = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        speech_parts = ConsesLow.cons( conses_high.assoc( key, lexicon_vars.$wn_pos_cyc_pos_map$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ).rest(), speech_parts );
        cdolist_list_var = cdolist_list_var.rest();
        key = cdolist_list_var.first();
      }
    }
    if( NIL == speech_parts )
    {
      if( NIL != proper_nounp( string ) )
      {
        final SubLObject item_var = $const135$ProperCountNoun;
        if( NIL == conses_high.member( item_var, speech_parts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          speech_parts = ConsesLow.cons( item_var, speech_parts );
        }
      }
      if( NIL != nounp( string ) )
      {
        final SubLObject item_var = $const133$CountNoun;
        if( NIL == conses_high.member( item_var, speech_parts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          speech_parts = ConsesLow.cons( item_var, speech_parts );
        }
      }
      if( NIL != adjectivep( string ) )
      {
        final SubLObject item_var = $const136$Adjective;
        if( NIL == conses_high.member( item_var, speech_parts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          speech_parts = ConsesLow.cons( item_var, speech_parts );
        }
      }
      if( NIL != verbp( string ) )
      {
        final SubLObject item_var = $const131$Verb;
        if( NIL == conses_high.member( item_var, speech_parts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          speech_parts = ConsesLow.cons( item_var, speech_parts );
        }
      }
      if( NIL != adverbp( string ) )
      {
        final SubLObject item_var = $const137$Adverb;
        if( NIL == conses_high.member( item_var, speech_parts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          speech_parts = ConsesLow.cons( item_var, speech_parts );
        }
      }
      if( NIL == speech_parts )
      {
        SubLObject item_var = $const131$Verb;
        if( NIL == conses_high.member( item_var, speech_parts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          speech_parts = ConsesLow.cons( item_var, speech_parts );
        }
        item_var = $const136$Adjective;
        if( NIL == conses_high.member( item_var, speech_parts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          speech_parts = ConsesLow.cons( item_var, speech_parts );
        }
        item_var = $const133$CountNoun;
        if( NIL == conses_high.member( item_var, speech_parts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          speech_parts = ConsesLow.cons( item_var, speech_parts );
        }
      }
    }
    return speech_parts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50048L)
  public static SubLObject proper_nounp(final SubLObject string)
  {
    if( Sequences.length( string ).numG( ZERO_INTEGER ) && NIL != Characters.upper_case_p( Strings.sublisp_char( string, ZERO_INTEGER ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50199L)
  public static SubLObject verbp(final SubLObject string)
  {
    SubLObject string_1 = NIL;
    string_1 = inflected_verb_to_infinitive( string );
    if( NIL != string_utilities.ends_with( string_1, $str88$ate, UNPROVIDED ) || NIL != string_utilities.ends_with( string_1, $str78$ize, UNPROVIDED ) || NIL != string_utilities.ends_with( string_1, $str138$yze,
        UNPROVIDED ) || NIL != string_utilities.ends_with( string_1, $str139$ify, UNPROVIDED ) || NIL != string_utilities.ends_with( string_1, $str132$en, UNPROVIDED ) || NIL != string_utilities.ends_with( string,
            $str60$ing, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str89$ed, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50552L)
  public static SubLObject nounp(SubLObject string)
  {
    string = plural_noun_to_sg( string, UNPROVIDED );
    if( NIL != string_utilities.ends_with( string, $str140$logy, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str141$ette, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str142$ess,
        UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str143$eer, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str55$ity, UNPROVIDED ) || NIL != string_utilities.ends_with( string,
            $str144$omy, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str51$ion, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str63$ist, UNPROVIDED ) || NIL != string_utilities.ends_with(
                string, $str145$ics, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str146$geny, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str147$ium, UNPROVIDED )
        || NIL != string_utilities.ends_with( string, $str148$cracy, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str62$ism, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str149$itis,
            UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str150$oma, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str151$lysis, UNPROVIDED ) || NIL != string_utilities.ends_with( string,
                $str152$hood, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str153$ship, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str154$lty, UNPROVIDED ) || NIL != string_utilities
                    .ends_with( string, $str155$meter, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str156$morph, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str157$morphy, UNPROVIDED )
        || NIL != string_utilities.ends_with( string, $str158$osis, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str159$stery, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str160$ence,
            UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str161$tude, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str162$ance, UNPROVIDED ) || NIL != string_utilities.ends_with( string,
                $str163$graphy, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str164$ment, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str165$age, UNPROVIDED ) || NIL != string_utilities
                    .ends_with( string, $str166$dom, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str167$ery, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str168$ite, UNPROVIDED )
        || NIL != string_utilities.ends_with( string, $str143$eer, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str169$let, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str170$ling,
            UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str171$ster, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str172$ant, UNPROVIDED ) || NIL != string_utilities.ends_with( string,
                $str173$ee, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str55$ity, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str174$ese, UNPROVIDED ) || NIL != string_utilities
                    .ends_with( string, $str175$an, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52035L)
  public static SubLObject adjectivep(final SubLObject string)
  {
    if( NIL != string_utilities.ends_with( string, $str176$ical, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str177$ous, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str178$less,
        UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str179$ier, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str92$est, UNPROVIDED ) || NIL != string_utilities.ends_with( string,
            $str65$ive, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str180$nant, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str181$thic, UNPROVIDED ) || NIL != string_utilities.ends_with(
                string, $str72$ible, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str71$able, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str182$etic, UNPROVIDED )
        || NIL != string_utilities.ends_with( string, $str183$itic, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str184$ful, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str185$ish,
            UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str186$like, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str11$y, UNPROVIDED ) || NIL != string_utilities.ends_with( string,
                $str187$ial, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str188$esque, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str189$ic, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52730L)
  public static SubLObject adverbp(final SubLObject string)
  {
    if( NIL != string_utilities.ends_with( string, $str12$ly, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str190$wise, UNPROVIDED ) || NIL != string_utilities.ends_with( string, $str191$ward, UNPROVIDED )
        || NIL != string_utilities.ends_with( string, $str192$wards, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53098L)
  public static SubLObject pos_keyword_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.member( v_object, $pos_keywords$.getDynamicValue( thread ), EQL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53259L)
  public static SubLObject root_predicate(final SubLObject pos)
  {
    if( pos.eql( $kw194$PROPER_NOUN ) )
    {
      return $const195$pnSingular;
    }
    if( pos.eql( $kw196$NOUN ) )
    {
      return $const98$singular;
    }
    if( pos.eql( $kw112$VERB ) )
    {
      return $const94$infinitive;
    }
    if( pos.eql( $kw197$ADJECTIVE ) )
    {
      return $const198$regularDegree;
    }
    if( pos.eql( $kw199$ADVERB ) )
    {
      return $const200$regularAdverb;
    }
    if( pos.eql( $kw201$PREPOSITION ) )
    {
      return $const202$prepositionStrings;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53635L)
  public static SubLObject get_root_of_head(final SubLObject word, SubLObject pos_keyword)
  {
    if( pos_keyword == UNPROVIDED )
    {
      pos_keyword = NIL;
    }
    if( NIL != Strings.string_equal( word, $str104$_s, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && ( NIL == pos_keyword || pos_keyword.eql( $kw112$VERB ) ) )
    {
      return $str203$be;
    }
    return get_root( word, pos_keyword );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54302L)
  public static SubLObject get_root(final SubLObject word, SubLObject pos_keyword)
  {
    if( pos_keyword == UNPROVIDED )
    {
      pos_keyword = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( word ) : word;
    if( NIL != pos_keyword && !assertionsDisabledInClass && NIL == pos_keyword_p( pos_keyword ) )
    {
      throw new AssertionError( pos_keyword );
    }
    final SubLObject pos_keywords = ( NIL != pos_keyword ) ? ConsesLow.list( pos_keyword ) : $pos_keywords$.getDynamicValue( thread );
    SubLObject wu = NIL;
    SubLObject assertion = NIL;
    if( NIL == wu )
    {
      SubLObject csome_list_var;
      SubLObject pos;
      SubLObject expanded_wu;
      for( csome_list_var = pos_keywords, pos = NIL, pos = csome_list_var.first(); NIL == wu && NIL != csome_list_var; wu = lexicon_accessors.words_of_stringXpos( word, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED )
          .first(), expanded_wu = expand_contracted_root( wu ), wu = ( ( NIL != expanded_wu ) ? expanded_wu : wu ), assertion = ( NIL != wu ) ? kb_mapping.gather_gaf_arg_index( wu, ONE_INTEGER, root_predicate( pos ),
              $const206$GeneralEnglishMt, UNPROVIDED ).first() : NIL, csome_list_var = csome_list_var.rest(), pos = csome_list_var.first() )
      {
      }
    }
    if( NIL != assertion )
    {
      return assertions_high.gaf_arg2( assertion );
    }
    SubLObject root = NIL;
    if( NIL == root )
    {
      SubLObject csome_list_var2;
      SubLObject pos2;
      for( csome_list_var2 = pos_keywords, pos2 = NIL, pos2 = csome_list_var2.first(); NIL == root && NIL != csome_list_var2; root = find_stem( word, pos2 ), csome_list_var2 = csome_list_var2
          .rest(), pos2 = csome_list_var2.first() )
      {
      }
    }
    return root;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55349L)
  public static SubLObject expand_contracted_root(final SubLObject wu)
  {
    if( NIL == lexicon_accessors.quick_lexical_wordP( wu, UNPROVIDED ) )
    {
      return NIL;
    }
    if( wu.eql( $const207$Be_Contracted ) )
    {
      return $const208$Be_TheWord;
    }
    if( wu.eql( $const209$Will_Contracted ) )
    {
      return $const210$Will_TheModal;
    }
    if( wu.eql( $const211$Have_Contracted ) )
    {
      return $const212$Have_TheWord;
    }
    if( wu.eql( $const213$Would_Contracted ) )
    {
      return $const214$Would_TheWord;
    }
    return NIL;
  }

  public static SubLObject declare_morphology_file()
  {
    SubLFiles.declareFunction( me, "get_vowel_positions", "GET-VOWEL-POSITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "estimated_syllable_count", "ESTIMATED-SYLLABLE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "monosyllabicP", "MONOSYLLABIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "polysyllabicP", "POLYSYLLABIC?", 1, 1, false );
    SubLFiles.declareFunction( me, "vowel_charP", "VOWEL-CHAR?", 1, 1, false );
    SubLFiles.declareFunction( me, "consonant_charP", "CONSONANT-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_consonant_positions", "GET-CONSONANT-POSITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "ends_with_vowelP", "ENDS-WITH-VOWEL?", 1, 0, false );
    SubLFiles.declareFunction( me, "starts_with_vowelP", "STARTS-WITH-VOWEL?", 1, 0, false );
    SubLFiles.declareFunction( me, "ends_with_consonantP", "ENDS-WITH-CONSONANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "starts_with_consonantP", "STARTS-WITH-CONSONANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "single_c_codaP", "SINGLE-C-CODA?", 1, 0, false );
    SubLFiles.declareFunction( me, "ends_with_doublerP", "ENDS-WITH-DOUBLER?", 1, 0, false );
    SubLFiles.declareFunction( me, "starts_with_unstressed_pfxP", "STARTS-WITH-UNSTRESSED-PFX?", 1, 0, false );
    SubLFiles.declareFunction( me, "ends_in_cvcP", "ENDS-IN-CVC?", 1, 0, false );
    SubLFiles.declareFunction( me, "ends_in_quvcP", "ENDS-IN-QUVC?", 1, 0, false );
    SubLFiles.declareFunction( me, "make_geminate", "MAKE-GEMINATE", 2, 0, false );
    SubLFiles.declareFunction( me, "geminate_last", "GEMINATE-LAST", 1, 0, false );
    SubLFiles.declareFunction( me, "correct_capitalization", "CORRECT-CAPITALIZATION", 2, 0, false );
    SubLFiles.declareFunction( me, "regular_string_function", "REGULAR-STRING-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "pos_preds_derivable_from_pred", "POS-PREDS-DERIVABLE-FROM-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_pos_preds_derivable_from_pred_int", "CLEAR-POS-PREDS-DERIVABLE-FROM-PRED-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_pos_preds_derivable_from_pred_int", "REMOVE-POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "pos_preds_derivable_from_pred_int_internal", "POS-PREDS-DERIVABLE-FROM-PRED-INT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "pos_preds_derivable_from_pred_int", "POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "singular_form_for_pred", "SINGULAR-FORM-FOR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "plural_predP", "PLURAL-PRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "singular_predP", "SINGULAR-PRED?", 1, 1, false );
    SubLFiles.declareFunction( me, "generate_z_form", "GENERATE-Z-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "suffix_rules_for_pred", "SUFFIX-RULES-FOR-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_regular_string_from_form", "GENERATE-REGULAR-STRING-FROM-FORM", 3, 1, false );
    SubLFiles.declareFunction( me, "generate_regular_strings_from_form", "GENERATE-REGULAR-STRINGS-FROM-FORM", 3, 3, false );
    SubLFiles.declareFunction( me, "generate_regular_strings_from_form_int", "GENERATE-REGULAR-STRINGS-FROM-FORM-INT", 6, 0, false );
    SubLFiles.declareFunction( me, "add_english_suffix", "ADD-ENGLISH-SUFFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "aes_do_orthographic_changes", "AES-DO-ORTHOGRAPHIC-CHANGES", 2, 0, false );
    SubLFiles.declareFunction( me, "aes_do_orthographic_change_fns", "AES-DO-ORTHOGRAPHIC-CHANGE-FNS", 0, 0, false );
    SubLFiles.declareFunction( me, "aes_do_orthographic_change", "AES-DO-ORTHOGRAPHIC-CHANGE", 4, 0, false );
    SubLFiles.declareFunction( me, "ends_with_sibilantP", "ENDS-WITH-SIBILANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "aes_add_e_before_s", "AES-ADD-E-BEFORE-S", 2, 0, false );
    new $aes_add_e_before_s$BinaryFunction();
    SubLFiles.declareFunction( me, "aes_ion_to_ation", "AES-ION-TO-ATION", 2, 0, false );
    SubLFiles.declareFunction( me, "aes_change_y_to_i", "AES-CHANGE-Y-TO-I", 2, 0, false );
    new $aes_change_y_to_i$BinaryFunction();
    SubLFiles.declareFunction( me, "aes_ble_to_bil_before_ity", "AES-BLE-TO-BIL-BEFORE-ITY", 2, 0, false );
    new $aes_ble_to_bil_before_ity$BinaryFunction();
    SubLFiles.declareFunction( me, "aes_change_aic_to_ac", "AES-CHANGE-AIC-TO-AC", 2, 0, false );
    new $aes_change_aic_to_ac$BinaryFunction();
    SubLFiles.declareFunction( me, "aes_strip_final_e", "AES-STRIP-FINAL-E", 2, 0, false );
    new $aes_strip_final_e$BinaryFunction();
    SubLFiles.declareFunction( me, "aes_strip_final_vowels_before_ic", "AES-STRIP-FINAL-VOWELS-BEFORE-IC", 2, 0, false );
    new $aes_strip_final_vowels_before_ic$BinaryFunction();
    SubLFiles.declareFunction( me, "aes_change_ie_to_y", "AES-CHANGE-IE-TO-Y", 2, 0, false );
    new $aes_change_ie_to_y$BinaryFunction();
    SubLFiles.declareFunction( me, "aes_change_ism_to_ist", "AES-CHANGE-ISM-TO-IST", 2, 0, false );
    new $aes_change_ism_to_ist$BinaryFunction();
    SubLFiles.declareFunction( me, "aes_change_ceive_to_cept", "AES-CHANGE-CEIVE-TO-CEPT", 2, 0, false );
    new $aes_change_ceive_to_cept$BinaryFunction();
    SubLFiles.declareFunction( me, "aes_change_vert_to_vers", "AES-CHANGE-VERT-TO-VERS", 2, 0, false );
    SubLFiles.declareFunction( me, "aes_change_duce_to_duct", "AES-CHANGE-DUCE-TO-DUCT", 2, 0, false );
    SubLFiles.declareFunction( me, "aes_remove_able_le_before_ly", "AES-REMOVE-ABLE-LE-BEFORE-LY", 2, 0, false );
    new $aes_remove_able_le_before_ly$BinaryFunction();
    SubLFiles.declareFunction( me, "aes_de_to_se", "AES-DE-TO-SE", 2, 0, false );
    SubLFiles.declareFunction( me, "aes_geminate_last", "AES-GEMINATE-LAST", 2, 0, false );
    new $aes_geminate_last$BinaryFunction();
    SubLFiles.declareFunction( me, "dont_geminate_beforeP", "DONT-GEMINATE-BEFORE?", 1, 0, false );
    SubLFiles.declareFunction( me, "aes_able_to_ate", "AES-ABLE-TO-ATE", 2, 0, false );
    new $aes_able_to_ate$BinaryFunction();
    SubLFiles.declareFunction( me, "try_regular_adj_morphologyP", "TRY-REGULAR-ADJ-MORPHOLOGY?", 1, 0, false );
    SubLFiles.declareFunction( me, "most_form", "MOST-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "more_form", "MORE-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "most_form_p", "MOST-FORM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "more_form_p", "MORE-FORM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "more_or_most_form", "MORE-OR-MOST-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "more_or_most_form_p", "MORE-OR-MOST-FORM-P", 2, 0, false );
    SubLFiles.declareFunction( me, "comparative_reg", "COMPARATIVE-REG", 1, 0, false );
    SubLFiles.declareFunction( me, "comparative_adverb_reg", "COMPARATIVE-ADVERB-REG", 1, 0, false );
    SubLFiles.declareFunction( me, "superlative_reg", "SUPERLATIVE-REG", 1, 0, false );
    SubLFiles.declareFunction( me, "superlative_adverb_reg", "SUPERLATIVE-ADVERB-REG", 1, 0, false );
    SubLFiles.declareFunction( me, "past_tense_reg", "PAST-TENSE-REG", 1, 0, false );
    SubLFiles.declareFunction( me, "gerund_reg", "GERUND-REG", 1, 0, false );
    SubLFiles.declareFunction( me, "third_sg_reg", "THIRD-SG-REG", 1, 0, false );
    SubLFiles.declareFunction( me, "plural_reg", "PLURAL-REG", 1, 0, false );
    SubLFiles.declareFunction( me, "pn_plural_reg", "PN-PLURAL-REG", 1, 0, false );
    SubLFiles.declareFunction( me, "infinitive_to_third_sing", "INFINITIVE-TO-THIRD-SING", 1, 0, false );
    SubLFiles.declareFunction( me, "infinitive_to_pres_participle", "INFINITIVE-TO-PRES-PARTICIPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "possessivize_string", "POSSESSIVIZE-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "english_lexical_possessive_version_of_string", "ENGLISH-LEXICAL-POSSESSIVE-VERSION-OF-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "english_possessive_suffix_for_string", "ENGLISH-POSSESSIVE-SUFFIX-FOR-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "locativize_string", "LOCATIVIZE-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "not_locativizable_english_stringP", "NOT-LOCATIVIZABLE-ENGLISH-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "english_locative_preposition_for_denot", "ENGLISH-LOCATIVE-PREPOSITION-FOR-DENOT", 1, 0, false );
    SubLFiles.declareFunction( me, "pluralize_string", "PLURALIZE-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "pluralize_string_wXlexicon", "PLURALIZE-STRING-W/LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "singularize_string", "SINGULARIZE-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "singularize_string_wXlexicon", "SINGULARIZE-STRING-W/LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "has_word_for_string_and_pos", "HAS-WORD-FOR-STRING-AND-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "has_word_for_string_and_pos_list", "HAS-WORD-FOR-STRING-AND-POS-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "is_word", "IS-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "is_noun", "IS-NOUN", 1, 0, false );
    SubLFiles.declareFunction( me, "is_verb", "IS-VERB", 1, 0, false );
    SubLFiles.declareFunction( me, "is_noun_or_verb", "IS-NOUN-OR-VERB", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_find_stem_memoized", "CLEAR-FIND-STEM-MEMOIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_find_stem_memoized", "REMOVE-FIND-STEM-MEMOIZED", 1, 1, false );
    SubLFiles.declareFunction( me, "find_stem_memoized_internal", "FIND-STEM-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "find_stem_memoized", "FIND-STEM-MEMOIZED", 1, 1, false );
    SubLFiles.declareFunction( me, "find_stem", "FIND-STEM", 1, 1, false );
    SubLFiles.declareFunction( me, "inflected_verb_to_infinitive", "INFLECTED-VERB-TO-INFINITIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "agentive_to_infinitive", "AGENTIVE-TO-INFINITIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "third_sg_verb_to_infinitive", "THIRD-SG-VERB-TO-INFINITIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "plural_noun_to_sg", "PLURAL-NOUN-TO-SG", 1, 1, false );
    SubLFiles.declareFunction( me, "singular_reg", "SINGULAR-REG", 1, 0, false );
    SubLFiles.declareFunction( me, "plural_nounP", "PLURAL-NOUN?", 1, 0, false );
    SubLFiles.declareFunction( me, "infinitive_verbP", "INFINITIVE-VERB?", 1, 0, false );
    SubLFiles.declareFunction( me, "progressive_stringP", "PROGRESSIVE-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "perfect_stringP", "PERFECT-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "f_3sg_stringP", "3SG-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "numberspp", "NUMBERSPP", 1, 0, false );
    SubLFiles.declareFunction( me, "comparative_degreeP", "COMPARATIVE-DEGREE?", 1, 0, false );
    SubLFiles.declareFunction( me, "superlative_degreeP", "SUPERLATIVE-DEGREE?", 1, 0, false );
    SubLFiles.declareFunction( me, "irregularP", "IRREGULAR?", 2, 0, false );
    SubLFiles.declareFunction( me, "irregular_snP", "IRREGULAR-SN?", 1, 0, false );
    SubLFiles.declareFunction( me, "irregular_anP", "IRREGULAR-AN?", 1, 0, false );
    SubLFiles.declareFunction( me, "irregular_verbP", "IRREGULAR-VERB?", 1, 0, false );
    SubLFiles.declareFunction( me, "pos_of_unknown_word", "POS-OF-UNKNOWN-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "proper_nounp", "PROPER-NOUNP", 1, 0, false );
    SubLFiles.declareFunction( me, "verbp", "VERBP", 1, 0, false );
    SubLFiles.declareFunction( me, "nounp", "NOUNP", 1, 0, false );
    SubLFiles.declareFunction( me, "adjectivep", "ADJECTIVEP", 1, 0, false );
    SubLFiles.declareFunction( me, "adverbp", "ADVERBP", 1, 0, false );
    SubLFiles.declareFunction( me, "pos_keyword_p", "POS-KEYWORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "root_predicate", "ROOT-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_root_of_head", "GET-ROOT-OF-HEAD", 1, 1, false );
    SubLFiles.declareFunction( me, "get_root", "GET-ROOT", 1, 1, false );
    SubLFiles.declareFunction( me, "expand_contracted_root", "EXPAND-CONTRACTED-ROOT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_morphology_file()
  {
    $vowels$ = SubLFiles.defconstant( "*VOWELS*", $str3$aeiou );
    $bigraph_vowels$ = SubLFiles.defconstant( "*BIGRAPH-VOWELS*", $list4 );
    $sibilant_endings$ = SubLFiles.defconstant( "*SIBILANT-ENDINGS*", $list5 );
    $consonants$ = SubLFiles.defconstant( "*CONSONANTS*", $str6$bcdfghjklmnprstvxz );
    $doublers$ = SubLFiles.defconstant( "*DOUBLERS*", $str7$bdfgklmnprtvz );
    $unstressed_latin_pfxs$ = SubLFiles.defconstant( "*UNSTRESSED-LATIN-PFXS*", $list8 );
    $special_ate_cases$ = SubLFiles.defconstant( "*SPECIAL-ATE-CASES*", $list9 );
    $liquids$ = SubLFiles.defconstant( "*LIQUIDS*", $list10 );
    $vowelsX_plus_y$ = SubLFiles.defconstant( "*VOWELS*-PLUS-Y*", Sequences.cconcatenate( $vowels$.getGlobalValue(), $str11$y ) );
    $pos_preds_derivable_from_pred_int_caching_state$ = SubLFiles.deflexical( "*POS-PREDS-DERIVABLE-FROM-PRED-INT-CACHING-STATE*", NIL );
    $aes_do_orthographic_change_fns$ = SubLFiles.deflexical( "*AES-DO-ORTHOGRAPHIC-CHANGE-FNS*", $list46 );
    $comparative_syllable_cutoff$ = SubLFiles.deflexical( "*COMPARATIVE-SYLLABLE-CUTOFF*", TWO_INTEGER );
    $more_prefix$ = SubLFiles.defconstant( "*MORE-PREFIX*", $str90$more_ );
    $most_prefix$ = SubLFiles.defconstant( "*MOST-PREFIX*", $str91$most_ );
    $english_possessive_pronouns$ = SubLFiles.defconstant( "*ENGLISH-POSSESSIVE-PRONOUNS*", $list101 );
    $find_stem_memoized_caching_state$ = SubLFiles.deflexical( "*FIND-STEM-MEMOIZED-CACHING-STATE*", NIL );
    $preserve_case_in_singular_regP$ = SubLFiles.defparameter( "*PRESERVE-CASE-IN-SINGULAR-REG?*", NIL );
    $pos_keywords$ = SubLFiles.defparameter( "*POS-KEYWORDS*", $list193 );
    return NIL;
  }

  public static SubLObject setup_morphology_file()
  {
    lexicon_vars.$morphology_code_revision$.setGlobalValue( $str0$_Revision__149757__ );
    lexicon_vars.declare_noop_updates_for_lexicon_global( $sym1$_MORPHOLOGY_CODE_REVISION_, $list2 );
    memoization_state.note_globally_cached_function( $sym25$POS_PREDS_DERIVABLE_FROM_PRED_INT );
    memoization_state.note_globally_cached_function( $sym115$FIND_STEM_MEMOIZED );
    access_macros.register_external_symbol( $sym127$PLURAL_NOUN_TO_SG );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_morphology_file();
  }

  @Override
  public void initializeVariables()
  {
    init_morphology_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_morphology_file();
  }
  static
  {
    me = new morphology();
    $vowels$ = null;
    $bigraph_vowels$ = null;
    $sibilant_endings$ = null;
    $consonants$ = null;
    $doublers$ = null;
    $unstressed_latin_pfxs$ = null;
    $special_ate_cases$ = null;
    $liquids$ = null;
    $vowelsX_plus_y$ = null;
    $pos_preds_derivable_from_pred_int_caching_state$ = null;
    $aes_do_orthographic_change_fns$ = null;
    $comparative_syllable_cutoff$ = null;
    $more_prefix$ = null;
    $most_prefix$ = null;
    $english_possessive_pronouns$ = null;
    $find_stem_memoized_caching_state$ = null;
    $preserve_case_in_singular_regP$ = null;
    $pos_keywords$ = null;
    $str0$_Revision__149757__ = makeString( "$Revision: 149757 $" );
    $sym1$_MORPHOLOGY_CODE_REVISION_ = makeSymbol( "*MORPHOLOGY-CODE-REVISION*" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeString( "1.137" ), makeString( "1.138" ) ), ConsesLow.list( makeString( "1.138" ), makeString( "1.139" ) ), ConsesLow.list( makeString( "1.139" ),
        makeString( "1.140" ) ), ConsesLow.list( makeString( "1.140" ), makeString( "1.141" ) ), ConsesLow.list( makeString( "1.141" ), makeString( "1.142" ) ), ConsesLow.list( makeString( "1.142" ), makeString(
            "1.143" ) ), ConsesLow.list( makeString( "1.143" ), makeString( "1.144" ) ), ConsesLow.list( makeString( "1.145" ), makeString( "1.146" ) ), ConsesLow.list( makeString( "1.146" ), makeString( "1.147" ) ),
      ConsesLow.list( makeString( "1.147" ), makeString( "1.148" ) ), ConsesLow.list( makeString( "1.148" ), makeString( "1.149" ) ), ConsesLow.list( makeString( "1.149" ), makeString( "1.150" ) )
    } );
    $str3$aeiou = makeString( "aeiou" );
    $list4 = ConsesLow.list( new SubLObject[] { makeString( "ai" ), makeString( "au" ), makeString( "ay" ), makeString( "ea" ), makeString( "ee" ), makeString( "ei" ), makeString( "eu" ), makeString( "ie" ), makeString(
        "io" ), makeString( "oa" ), makeString( "oi" ), makeString( "oo" ), makeString( "ou" ), makeString( "ow" ), makeString( "oy" ), makeString( "ui" )
    } );
    $list5 = ConsesLow.list( makeString( "ss" ), makeString( "x" ), makeString( "sh" ), makeString( "ch" ), makeString( "z" ), makeString( "s" ) );
    $str6$bcdfghjklmnprstvxz = makeString( "bcdfghjklmnprstvxz" );
    $str7$bdfgklmnprtvz = makeString( "bdfgklmnprtvz" );
    $list8 = ConsesLow.list( makeString( "re" ), makeString( "de" ), makeString( "dis" ), makeString( "mis" ), makeString( "un" ), makeString( "in" ), makeString( "ex" ) );
    $list9 = ConsesLow.list( new SubLObject[] { makeString( "evaporate" ), makeString( "appreciate" ), makeString( "associate" ), makeString( "accommodate" ), makeString( "affiliate" ), makeString( "applicate" ),
      makeString( "navigate" ), makeString( "calculate" ), makeString( "abdicate" ), makeString( "estimate" ), makeString( "emulate" ), makeString( "educate" )
    } );
    $list10 = ConsesLow.list( makeString( "l" ), makeString( "r" ) );
    $str11$y = makeString( "y" );
    $str12$ly = makeString( "ly" );
    $str13$qw = makeString( "qw" );
    $str14$q = makeString( "q" );
    $str15$u = makeString( "u" );
    $const16$comparativeDegree = constant_handles.reader_make_constant_shell( makeString( "comparativeDegree" ) );
    $sym17$COMPARATIVE_REG = makeSymbol( "COMPARATIVE-REG" );
    $const18$superlativeDegree = constant_handles.reader_make_constant_shell( makeString( "superlativeDegree" ) );
    $sym19$SUPERLATIVE_REG = makeSymbol( "SUPERLATIVE-REG" );
    $const20$comparativeAdverb = constant_handles.reader_make_constant_shell( makeString( "comparativeAdverb" ) );
    $sym21$COMPARATIVE_ADVERB_REG = makeSymbol( "COMPARATIVE-ADVERB-REG" );
    $const22$superlativeAdverb = constant_handles.reader_make_constant_shell( makeString( "superlativeAdverb" ) );
    $sym23$SUPERLATIVE_ADVERB_REG = makeSymbol( "SUPERLATIVE-ADVERB-REG" );
    $sym24$FORT_P = makeSymbol( "FORT-P" );
    $sym25$POS_PREDS_DERIVABLE_FROM_PRED_INT = makeSymbol( "POS-PREDS-DERIVABLE-FROM-PRED-INT" );
    $sym26$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $const27$regularSuffix = constant_handles.reader_make_constant_shell( makeString( "regularSuffix" ) );
    $sym28$_POS_PREDS_DERIVABLE_FROM_PRED_INT_CACHING_STATE_ = makeSymbol( "*POS-PREDS-DERIVABLE-FROM-PRED-INT-CACHING-STATE*" );
    $int29$256 = makeInteger( 256 );
    $const30$plural_Generic = constant_handles.reader_make_constant_shell( makeString( "plural-Generic" ) );
    $const31$singular_Generic = constant_handles.reader_make_constant_shell( makeString( "singular-Generic" ) );
    $list32 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "plural" ) ), constant_handles.reader_make_constant_shell( makeString( "pnPlural" ) ), constant_handles.reader_make_constant_shell(
        makeString( "agentive-Pl" ) ) );
    $str33$z = makeString( "z" );
    $const34$EnglishLexiconMt = constant_handles.reader_make_constant_shell( makeString( "EnglishLexiconMt" ) );
    $list35 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regularDegree" ) ), constant_handles.reader_make_constant_shell( makeString( "regularAdverb" ) ) );
    $list36 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "comparativeDegree" ) ), constant_handles.reader_make_constant_shell( makeString( "superlativeDegree" ) ), constant_handles
        .reader_make_constant_shell( makeString( "comparativeAdverb" ) ), constant_handles.reader_make_constant_shell( makeString( "superlativeAdverb" ) ) );
    $sym37$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const38$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $list39 = ConsesLow.list( makeSymbol( "RULE-BASE-PRED" ), makeSymbol( "SUFFIX" ) );
    $sym40$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $const41$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym42$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" );
    $sym43$CYCL_STRING_P = makeSymbol( "CYCL-STRING-P" );
    $str44$ = makeString( "" );
    $list45 = ConsesLow.cons( makeSymbol( "CHANGE-FN" ), makeSymbol( "TYPE" ) );
    $list46 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeSymbol( "AES-CHANGE-Y-TO-I" ), makeKeyword( "BOTH" ) ), ConsesLow.cons( makeSymbol( "AES-ABLE-TO-ATE" ), makeKeyword( "BASE" ) ), ConsesLow.cons(
        makeSymbol( "AES-GEMINATE-LAST" ), makeKeyword( "BASE" ) ), ConsesLow.cons( makeSymbol( "AES-DE-TO-SE" ), makeKeyword( "BASE" ) ), ConsesLow.cons( makeSymbol( "AES-BLE-TO-BIL-BEFORE-ITY" ), makeKeyword(
            "BASE" ) ), ConsesLow.cons( makeSymbol( "AES-CHANGE-CEIVE-TO-CEPT" ), makeKeyword( "BASE" ) ), ConsesLow.cons( makeSymbol( "AES-CHANGE-VERT-TO-VERS" ), makeKeyword( "BASE" ) ), ConsesLow.cons( makeSymbol(
                "AES-CHANGE-DUCE-TO-DUCT" ), makeKeyword( "BASE" ) ), ConsesLow.cons( makeSymbol( "AES-CHANGE-AIC-TO-AC" ), makeKeyword( "BASE" ) ), ConsesLow.cons( makeSymbol( "AES-ION-TO-ATION" ), makeKeyword(
                    "SUFFIX" ) ), ConsesLow.cons( makeSymbol( "AES-STRIP-FINAL-E" ), makeKeyword( "BASE" ) ), ConsesLow.cons( makeSymbol( "AES-STRIP-FINAL-VOWELS-BEFORE-IC" ), makeKeyword( "BASE" ) ), ConsesLow.cons(
                        makeSymbol( "AES-CHANGE-IE-TO-Y" ), makeKeyword( "BASE" ) ), ConsesLow.cons( makeSymbol( "AES-CHANGE-ISM-TO-IST" ), makeKeyword( "BASE" ) ), ConsesLow.cons( makeSymbol(
                            "AES-REMOVE-ABLE-LE-BEFORE-LY" ), makeKeyword( "BASE" ) ), ConsesLow.cons( makeSymbol( "AES-ADD-E-BEFORE-S" ), makeKeyword( "SUFFIX" ) )
    } );
    $list47 = ConsesLow.list( makeKeyword( "BOTH" ), makeKeyword( "BASE" ) );
    $list48 = ConsesLow.list( makeKeyword( "BOTH" ), makeKeyword( "SUFFIX" ) );
    $str49$s = makeString( "s" );
    $str50$e = makeString( "e" );
    $str51$ion = makeString( "ion" );
    $list52 = ConsesLow.list( new SubLObject[] { makeString( "port" ), makeString( "apt" ), makeString( "cit" ), makeString( "cite" ), makeString( "est" ), makeString( "ant" ), makeString( "ment" ), makeString( "ient" ),
      makeString( "ont" ), makeString( "pute" ), makeString( "esent" ), makeString( "note" ), makeString( "mute" ), makeString( "et" )
    } );
    $str53$ation = makeString( "ation" );
    $str54$i = makeString( "i" );
    $str55$ity = makeString( "ity" );
    $str56$ble = makeString( "ble" );
    $str57$il = makeString( "il" );
    $str58$at = makeString( "at" );
    $str59$ai = makeString( "ai" );
    $str60$ing = makeString( "ing" );
    $str61$ie = makeString( "ie" );
    $str62$ism = makeString( "ism" );
    $str63$ist = makeString( "ist" );
    $str64$ceive = makeString( "ceive" );
    $str65$ive = makeString( "ive" );
    $str66$pt = makeString( "pt" );
    $str67$vert = makeString( "vert" );
    $str68$vers = makeString( "vers" );
    $str69$duce = makeString( "duce" );
    $str70$t = makeString( "t" );
    $str71$able = makeString( "able" );
    $str72$ible = makeString( "ible" );
    $str73$le = makeString( "le" );
    $str74$de = makeString( "de" );
    $str75$is = makeString( "is" );
    $list76 = ConsesLow.list( makeString( "ing" ), makeString( "ity" ) );
    $str77$se = makeString( "se" );
    $str78$ize = makeString( "ize" );
    $str79$ise = makeString( "ise" );
    $str80$al = makeString( "al" );
    $str81$er = makeString( "er" );
    $str82$or = makeString( "or" );
    $str83$fer = makeString( "fer" );
    $str84$ffer = makeString( "ffer" );
    $str85$id = makeString( "id" );
    $list86 = ConsesLow.list( makeString( "n" ), makeString( "l" ), makeString( "t" ) );
    $str87$alicious = makeString( "alicious" );
    $str88$ate = makeString( "ate" );
    $str89$ed = makeString( "ed" );
    $str90$more_ = makeString( "more " );
    $str91$most_ = makeString( "most " );
    $str92$est = makeString( "est" );
    $const93$pastTense_Universal = constant_handles.reader_make_constant_shell( makeString( "pastTense-Universal" ) );
    $const94$infinitive = constant_handles.reader_make_constant_shell( makeString( "infinitive" ) );
    $const95$gerund = constant_handles.reader_make_constant_shell( makeString( "gerund" ) );
    $const96$thirdPersonSg_Present = constant_handles.reader_make_constant_shell( makeString( "thirdPersonSg-Present" ) );
    $const97$plural = constant_handles.reader_make_constant_shell( makeString( "plural" ) );
    $const98$singular = constant_handles.reader_make_constant_shell( makeString( "singular" ) );
    $const99$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $const100$presentParticiple = constant_handles.reader_make_constant_shell( makeString( "presentParticiple" ) );
    $list101 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeString( "I" ), makeString( "my" ) ), ConsesLow.cons( makeString( "me" ), makeString( "my" ) ), ConsesLow.cons( makeString( "you" ), makeString(
        "your" ) ), ConsesLow.cons( makeString( "he" ), makeString( "his" ) ), ConsesLow.cons( makeString( "him" ), makeString( "his" ) ), ConsesLow.cons( makeString( "him or her" ), makeString( "his or her" ) ),
      ConsesLow.cons( makeString( "he or she" ), makeString( "his or her" ) ), ConsesLow.cons( makeString( "she" ), makeString( "her" ) ), ConsesLow.cons( makeString( "her" ), makeString( "her" ) ), ConsesLow.cons(
          makeString( "it" ), makeString( "its" ) ), ConsesLow.cons( makeString( "we" ), makeString( "our" ) ), ConsesLow.cons( makeString( "us" ), makeString( "our" ) ), ConsesLow.cons( makeString( "they" ), makeString(
              "their" ) ), ConsesLow.cons( makeString( "them" ), makeString( "their" ) ), ConsesLow.cons( makeString( "there" ), makeString( "that place's" ) ), ConsesLow.cons( makeString( "here" ), makeString(
                  "this place's" ) )
    } );
    $kw102$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $str103$_ = makeString( "'" );
    $str104$_s = makeString( "'s" );
    $str105$_ = makeString( " " );
    $const106$QuantifyingIndexical = constant_handles.reader_make_constant_shell( makeString( "QuantifyingIndexical" ) );
    $const107$GeographicalRegion = constant_handles.reader_make_constant_shell( makeString( "GeographicalRegion" ) );
    $str108$in = makeString( "in" );
    $const109$SurfaceRegion_Underspecified = constant_handles.reader_make_constant_shell( makeString( "SurfaceRegion-Underspecified" ) );
    $str110$on = makeString( "on" );
    $list111 = ConsesLow.list( makeKeyword( "PROPER-NOUN" ), makeKeyword( "NOUN" ) );
    $kw112$VERB = makeKeyword( "VERB" );
    $list113 = ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "PROPER-NOUN" ), makeKeyword( "VERB" ) );
    $kw114$ANY = makeKeyword( "ANY" );
    $sym115$FIND_STEM_MEMOIZED = makeSymbol( "FIND-STEM-MEMOIZED" );
    $sym116$_FIND_STEM_MEMOIZED_CACHING_STATE_ = makeSymbol( "*FIND-STEM-MEMOIZED-CACHING-STATE*" );
    $int117$16384 = makeInteger( 16384 );
    $sym118$CLEAR_FIND_STEM_MEMOIZED = makeSymbol( "CLEAR-FIND-STEM-MEMOIZED" );
    $str119$ies = makeString( "ies" );
    $str120$ss = makeString( "ss" );
    $list121 = ConsesLow.list( makeString( "o" ), makeString( "ch" ), makeString( "x" ), makeString( "sh" ), makeString( "z" ), makeString( "s" ) );
    $str122$ied = makeString( "ied" );
    $str123$l = makeString( "l" );
    $str124$d = makeString( "d" );
    $str125$r = makeString( "r" );
    $str126$es = makeString( "es" );
    $sym127$PLURAL_NOUN_TO_SG = makeSymbol( "PLURAL-NOUN-TO-SG" );
    $str128$us = makeString( "us" );
    $list129 = ConsesLow.list( Characters.CHAR_r, Characters.CHAR_h, Characters.CHAR_t, Characters.CHAR_n );
    $list130 = ConsesLow.list( makeString( "ch" ), makeString( "sh" ), makeString( "x" ), makeString( "z" ) );
    $const131$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $str132$en = makeString( "en" );
    $const133$CountNoun = constant_handles.reader_make_constant_shell( makeString( "CountNoun" ) );
    $const134$Number_SP = constant_handles.reader_make_constant_shell( makeString( "Number-SP" ) );
    $const135$ProperCountNoun = constant_handles.reader_make_constant_shell( makeString( "ProperCountNoun" ) );
    $const136$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $const137$Adverb = constant_handles.reader_make_constant_shell( makeString( "Adverb" ) );
    $str138$yze = makeString( "yze" );
    $str139$ify = makeString( "ify" );
    $str140$logy = makeString( "logy" );
    $str141$ette = makeString( "ette" );
    $str142$ess = makeString( "ess" );
    $str143$eer = makeString( "eer" );
    $str144$omy = makeString( "omy" );
    $str145$ics = makeString( "ics" );
    $str146$geny = makeString( "geny" );
    $str147$ium = makeString( "ium" );
    $str148$cracy = makeString( "cracy" );
    $str149$itis = makeString( "itis" );
    $str150$oma = makeString( "oma" );
    $str151$lysis = makeString( "lysis" );
    $str152$hood = makeString( "hood" );
    $str153$ship = makeString( "ship" );
    $str154$lty = makeString( "lty" );
    $str155$meter = makeString( "meter" );
    $str156$morph = makeString( "morph" );
    $str157$morphy = makeString( "morphy" );
    $str158$osis = makeString( "osis" );
    $str159$stery = makeString( "stery" );
    $str160$ence = makeString( "ence" );
    $str161$tude = makeString( "tude" );
    $str162$ance = makeString( "ance" );
    $str163$graphy = makeString( "graphy" );
    $str164$ment = makeString( "ment" );
    $str165$age = makeString( "age" );
    $str166$dom = makeString( "dom" );
    $str167$ery = makeString( "ery" );
    $str168$ite = makeString( "ite" );
    $str169$let = makeString( "let" );
    $str170$ling = makeString( "ling" );
    $str171$ster = makeString( "ster" );
    $str172$ant = makeString( "ant" );
    $str173$ee = makeString( "ee" );
    $str174$ese = makeString( "ese" );
    $str175$an = makeString( "an" );
    $str176$ical = makeString( "ical" );
    $str177$ous = makeString( "ous" );
    $str178$less = makeString( "less" );
    $str179$ier = makeString( "ier" );
    $str180$nant = makeString( "nant" );
    $str181$thic = makeString( "thic" );
    $str182$etic = makeString( "etic" );
    $str183$itic = makeString( "itic" );
    $str184$ful = makeString( "ful" );
    $str185$ish = makeString( "ish" );
    $str186$like = makeString( "like" );
    $str187$ial = makeString( "ial" );
    $str188$esque = makeString( "esque" );
    $str189$ic = makeString( "ic" );
    $str190$wise = makeString( "wise" );
    $str191$ward = makeString( "ward" );
    $str192$wards = makeString( "wards" );
    $list193 = ConsesLow.list( makeKeyword( "NOUN" ), makeKeyword( "PROPER-NOUN" ), makeKeyword( "VERB" ), makeKeyword( "ADJECTIVE" ), makeKeyword( "ADVERB" ), makeKeyword( "PREPOSITION" ) );
    $kw194$PROPER_NOUN = makeKeyword( "PROPER-NOUN" );
    $const195$pnSingular = constant_handles.reader_make_constant_shell( makeString( "pnSingular" ) );
    $kw196$NOUN = makeKeyword( "NOUN" );
    $kw197$ADJECTIVE = makeKeyword( "ADJECTIVE" );
    $const198$regularDegree = constant_handles.reader_make_constant_shell( makeString( "regularDegree" ) );
    $kw199$ADVERB = makeKeyword( "ADVERB" );
    $const200$regularAdverb = constant_handles.reader_make_constant_shell( makeString( "regularAdverb" ) );
    $kw201$PREPOSITION = makeKeyword( "PREPOSITION" );
    $const202$prepositionStrings = constant_handles.reader_make_constant_shell( makeString( "prepositionStrings" ) );
    $str203$be = makeString( "be" );
    $sym204$STRINGP = makeSymbol( "STRINGP" );
    $sym205$POS_KEYWORD_P = makeSymbol( "POS-KEYWORD-P" );
    $const206$GeneralEnglishMt = constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) );
    $const207$Be_Contracted = constant_handles.reader_make_constant_shell( makeString( "Be-Contracted" ) );
    $const208$Be_TheWord = constant_handles.reader_make_constant_shell( makeString( "Be-TheWord" ) );
    $const209$Will_Contracted = constant_handles.reader_make_constant_shell( makeString( "Will-Contracted" ) );
    $const210$Will_TheModal = constant_handles.reader_make_constant_shell( makeString( "Will-TheModal" ) );
    $const211$Have_Contracted = constant_handles.reader_make_constant_shell( makeString( "Have-Contracted" ) );
    $const212$Have_TheWord = constant_handles.reader_make_constant_shell( makeString( "Have-TheWord" ) );
    $const213$Would_Contracted = constant_handles.reader_make_constant_shell( makeString( "Would-Contracted" ) );
    $const214$Would_TheWord = constant_handles.reader_make_constant_shell( makeString( "Would-TheWord" ) );
  }

  public static final class $aes_add_e_before_s$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_add_e_before_s$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-ADD-E-BEFORE-S" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_add_e_before_s( arg1, arg2 );
    }
  }

  public static final class $aes_change_y_to_i$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_change_y_to_i$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-CHANGE-Y-TO-I" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_change_y_to_i( arg1, arg2 );
    }
  }

  public static final class $aes_ble_to_bil_before_ity$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_ble_to_bil_before_ity$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-BLE-TO-BIL-BEFORE-ITY" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_ble_to_bil_before_ity( arg1, arg2 );
    }
  }

  public static final class $aes_change_aic_to_ac$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_change_aic_to_ac$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-CHANGE-AIC-TO-AC" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_change_aic_to_ac( arg1, arg2 );
    }
  }

  public static final class $aes_strip_final_e$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_strip_final_e$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-STRIP-FINAL-E" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_strip_final_e( arg1, arg2 );
    }
  }

  public static final class $aes_strip_final_vowels_before_ic$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_strip_final_vowels_before_ic$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-STRIP-FINAL-VOWELS-BEFORE-IC" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_strip_final_vowels_before_ic( arg1, arg2 );
    }
  }

  public static final class $aes_change_ie_to_y$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_change_ie_to_y$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-CHANGE-IE-TO-Y" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_change_ie_to_y( arg1, arg2 );
    }
  }

  public static final class $aes_change_ism_to_ist$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_change_ism_to_ist$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-CHANGE-ISM-TO-IST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_change_ism_to_ist( arg1, arg2 );
    }
  }

  public static final class $aes_change_ceive_to_cept$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_change_ceive_to_cept$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-CHANGE-CEIVE-TO-CEPT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_change_ceive_to_cept( arg1, arg2 );
    }
  }

  public static final class $aes_remove_able_le_before_ly$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_remove_able_le_before_ly$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-REMOVE-ABLE-LE-BEFORE-LY" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_remove_able_le_before_ly( arg1, arg2 );
    }
  }

  public static final class $aes_geminate_last$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_geminate_last$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-GEMINATE-LAST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_geminate_last( arg1, arg2 );
    }
  }

  public static final class $aes_able_to_ate$BinaryFunction
      extends
        BinaryFunction
  {
    public $aes_able_to_ate$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AES-ABLE-TO-ATE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return aes_able_to_ate( arg1, arg2 );
    }
  }
}
/*
 * 
 * Total time: 672 ms synthetic
 */