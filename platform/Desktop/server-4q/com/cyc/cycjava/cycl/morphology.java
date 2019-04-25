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

public final class morphology extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.morphology";
    public static final String myFingerPrint = "388bed68dba4fbc990140b17dcc6f495c145f52a01295515826346d4d6f561b3";
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 1961L)
    private static SubLSymbol $vowels$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 2079L)
    private static SubLSymbol $bigraph_vowels$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 2284L)
    private static SubLSymbol $sibilant_endings$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 2356L)
    private static SubLSymbol $consonants$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 2413L)
    private static SubLSymbol $doublers$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 2463L)
    private static SubLSymbol $unstressed_latin_pfxs$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 2550L)
    private static SubLSymbol $special_ate_cases$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 2736L)
    private static SubLSymbol $liquids$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 2822L)
    private static SubLSymbol $vowelsX_plus_y$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 9404L)
    private static SubLSymbol $pos_preds_derivable_from_pred_int_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 17547L)
    private static SubLSymbol $aes_do_orthographic_change_fns$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 24731L)
    private static SubLSymbol $comparative_syllable_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 25240L)
    private static SubLSymbol $more_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 25285L)
    private static SubLSymbol $most_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 30954L)
    private static SubLSymbol $english_possessive_pronouns$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 39460L)
    private static SubLSymbol $find_stem_memoized_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 45414L)
    public static SubLSymbol $preserve_case_in_singular_regP$;
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 52934L)
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
    
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 2889L)
    public static SubLObject get_vowel_positions(final SubLObject string) {
        SubLObject position_list = (SubLObject)morphology.NIL;
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject i;
        SubLObject curr;
        for (end_var = (end_var_$1 = Sequences.length(string)), i = (SubLObject)morphology.NIL, i = (SubLObject)morphology.ZERO_INTEGER; !i.numGE(end_var_$1); i = number_utilities.f_1X(i)) {
            curr = Strings.sublisp_char(string, i);
            if ((morphology.NIL != vowel_charP(curr, (SubLObject)morphology.UNPROVIDED) && (i.isZero() || !curr.equalp((SubLObject)Characters.CHAR_u) || !Strings.sublisp_char(string, number_utilities.f_1_(i)).equalp((SubLObject)Characters.CHAR_q))) || (curr.equalp((SubLObject)Characters.CHAR_y) && morphology.NIL == vowel_charP(string_utilities.char_at(string, number_utilities.f_1_(i)), (SubLObject)morphology.UNPROVIDED) && morphology.NIL == vowel_charP(string_utilities.char_at(string, number_utilities.f_1X(i)), (SubLObject)morphology.UNPROVIDED))) {
                position_list = (SubLObject)ConsesLow.cons(i, position_list);
            }
        }
        return Sequences.nreverse(position_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 3722L)
    public static SubLObject estimated_syllable_count(final SubLObject string) {
        final SubLObject vowel_positions = get_vowel_positions(string);
        SubLObject count = (SubLObject)morphology.ZERO_INTEGER;
        SubLObject cdolist_list_var = vowel_positions;
        SubLObject pos = (SubLObject)morphology.NIL;
        pos = cdolist_list_var.first();
        while (morphology.NIL != cdolist_list_var) {
            if ((morphology.NIL == subl_promotions.memberP(number_utilities.f_1_(pos), vowel_positions, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED) || morphology.NIL == conses_high.member(string_utilities.substring(string, number_utilities.f_1_(pos), number_utilities.f_1X(pos)), morphology.$bigraph_vowels$.getGlobalValue(), Symbols.symbol_function((SubLObject)morphology.EQUAL), (SubLObject)morphology.UNPROVIDED)) && (!Strings.sublisp_char(string, pos).equalp((SubLObject)Characters.CHAR_e) || (morphology.NIL == list_utilities.lengthE(string, number_utilities.f_1X(pos), (SubLObject)morphology.UNPROVIDED) && morphology.NIL == string_utilities.whitespacep(Strings.sublisp_char(string, number_utilities.f_1X(pos))) && !string_utilities.substring(string, number_utilities.f_1X(pos), (SubLObject)morphology.UNPROVIDED).equalp((SubLObject)morphology.$str12$ly)))) {
                count = Numbers.add(count, (SubLObject)morphology.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 4583L)
    public static SubLObject monosyllabicP(final SubLObject string) {
        return Equality.equal(estimated_syllable_count(string), (SubLObject)morphology.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 4760L)
    public static SubLObject polysyllabicP(final SubLObject string, SubLObject min_syllable_count) {
        if (min_syllable_count == morphology.UNPROVIDED) {
            min_syllable_count = (SubLObject)morphology.TWO_INTEGER;
        }
        return Numbers.numGE(estimated_syllable_count(string), min_syllable_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 5003L)
    public static SubLObject vowel_charP(final SubLObject v_char, SubLObject include_yP) {
        if (include_yP == morphology.UNPROVIDED) {
            include_yP = (SubLObject)morphology.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != Sequences.find(v_char, morphology.$vowels$.getGlobalValue(), Symbols.symbol_function((SubLObject)morphology.EQUALP), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED) || (morphology.NIL != include_yP && v_char.equalp((SubLObject)Characters.CHAR_y)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 5304L)
    public static SubLObject consonant_charP(final SubLObject v_char) {
        return list_utilities.sublisp_boolean(Sequences.find(v_char, morphology.$consonants$.getGlobalValue(), Symbols.symbol_function((SubLObject)morphology.EQUALP), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 5451L)
    public static SubLObject get_consonant_positions(final SubLObject string) {
        SubLObject position_list = (SubLObject)morphology.NIL;
        SubLObject end_var_$2;
        SubLObject end_var;
        SubLObject i;
        SubLObject curr;
        SubLObject item_var;
        for (end_var = (end_var_$2 = Sequences.length(string)), i = (SubLObject)morphology.NIL, i = (SubLObject)morphology.ZERO_INTEGER; !i.numGE(end_var_$2); i = number_utilities.f_1X(i)) {
            curr = Strings.sublisp_char(string, i);
            if (morphology.NIL != consonant_charP(curr)) {
                item_var = i;
                if (morphology.NIL == conses_high.member(item_var, position_list, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                    position_list = (SubLObject)ConsesLow.cons(item_var, position_list);
                }
            }
        }
        return Sequences.nreverse(position_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 5779L)
    public static SubLObject ends_with_vowelP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != list_utilities.lengthG(string, (SubLObject)morphology.ZERO_INTEGER, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != vowel_charP(string_utilities.last_char(string), (SubLObject)morphology.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 5951L)
    public static SubLObject starts_with_vowelP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != list_utilities.lengthG(string, (SubLObject)morphology.ZERO_INTEGER, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != vowel_charP(Strings.sublisp_char(string, (SubLObject)morphology.ZERO_INTEGER), (SubLObject)morphology.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 6122L)
    public static SubLObject ends_with_consonantP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != list_utilities.lengthG(string, (SubLObject)morphology.ZERO_INTEGER, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != consonant_charP(string_utilities.last_char(string)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 6304L)
    public static SubLObject starts_with_consonantP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != list_utilities.lengthG(string, (SubLObject)morphology.ZERO_INTEGER, (SubLObject)morphology.UNPROVIDED) && (morphology.NIL != consonant_charP(Strings.sublisp_char(string, (SubLObject)morphology.ZERO_INTEGER)) || morphology.NIL != Sequences.find(Strings.sublisp_char(string, (SubLObject)morphology.ZERO_INTEGER), (SubLObject)morphology.$str13$qw, Symbols.symbol_function((SubLObject)morphology.EQUALP), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED) || (morphology.NIL != list_utilities.lengthG(string, (SubLObject)morphology.ONE_INTEGER, (SubLObject)morphology.UNPROVIDED) && Strings.sublisp_char(string, (SubLObject)morphology.ZERO_INTEGER).equalp((SubLObject)Characters.CHAR_y) && morphology.NIL != vowel_charP(Strings.sublisp_char(string, (SubLObject)morphology.ONE_INTEGER), (SubLObject)morphology.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 6623L)
    public static SubLObject single_c_codaP(final SubLObject string) {
        SubLObject ans = (SubLObject)morphology.NIL;
        final SubLObject rev = Sequences.reverse(string);
        ans = (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != list_utilities.lengthG(string, (SubLObject)morphology.ONE_INTEGER, (SubLObject)morphology.UNPROVIDED) && morphology.NIL == vowel_charP(Strings.sublisp_char(rev, (SubLObject)morphology.ZERO_INTEGER), (SubLObject)morphology.UNPROVIDED) && morphology.NIL != vowel_charP(Strings.sublisp_char(rev, (SubLObject)morphology.ONE_INTEGER), (SubLObject)morphology.T));
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 6906L)
    public static SubLObject ends_with_doublerP(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != list_utilities.lengthG(string, (SubLObject)morphology.ZERO_INTEGER, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != Sequences.find(string_utilities.last_char(string), morphology.$doublers$.getGlobalValue(), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 7031L)
    public static SubLObject starts_with_unstressed_pfxP(final SubLObject string) {
        SubLObject csome_list_var = morphology.$unstressed_latin_pfxs$.getGlobalValue();
        SubLObject pre = (SubLObject)morphology.NIL;
        pre = csome_list_var.first();
        while (morphology.NIL != csome_list_var) {
            if (morphology.NIL != string_utilities.starts_with(string, pre)) {
                return (SubLObject)morphology.T;
            }
            csome_list_var = csome_list_var.rest();
            pre = csome_list_var.first();
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 7253L)
    public static SubLObject ends_in_cvcP(final SubLObject string) {
        SubLObject ans = (SubLObject)morphology.NIL;
        final SubLObject rev = Sequences.reverse(string);
        ans = (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != list_utilities.lengthG(string, (SubLObject)morphology.TWO_INTEGER, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != consonant_charP(Strings.sublisp_char(rev, (SubLObject)morphology.ZERO_INTEGER)) && morphology.NIL != vowel_charP(Strings.sublisp_char(rev, (SubLObject)morphology.ONE_INTEGER), (SubLObject)morphology.UNPROVIDED) && morphology.NIL == vowel_charP(Strings.sublisp_char(rev, (SubLObject)morphology.TWO_INTEGER), (SubLObject)morphology.UNPROVIDED));
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 7588L)
    public static SubLObject ends_in_quvcP(final SubLObject string) {
        SubLObject ans = (SubLObject)morphology.NIL;
        final SubLObject rev = Sequences.reverse(string);
        ans = (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != list_utilities.lengthG(string, (SubLObject)morphology.THREE_INTEGER, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != Sequences.find(Strings.sublisp_char(rev, (SubLObject)morphology.THREE_INTEGER), (SubLObject)morphology.$str14$q, Symbols.symbol_function((SubLObject)morphology.EQUALP), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != Sequences.find(Strings.sublisp_char(rev, (SubLObject)morphology.TWO_INTEGER), (SubLObject)morphology.$str15$u, Symbols.symbol_function((SubLObject)morphology.EQUALP), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != consonant_charP(Strings.sublisp_char(rev, (SubLObject)morphology.ZERO_INTEGER)) && morphology.NIL != vowel_charP(Strings.sublisp_char(rev, (SubLObject)morphology.ONE_INTEGER), (SubLObject)morphology.UNPROVIDED));
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 7954L)
    public static SubLObject make_geminate(final SubLObject string, final SubLObject n) {
        if (morphology.NIL != list_utilities.lengthG(string, n, (SubLObject)morphology.UNPROVIDED)) {
            return string_utilities.infix(string_utilities.substring(string, n, number_utilities.f_1X(n)), string, n);
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 8158L)
    public static SubLObject geminate_last(final SubLObject string) {
        return make_geminate(string, number_utilities.f_1_(Sequences.length(string)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 8292L)
    public static SubLObject correct_capitalization(final SubLObject correct, final SubLObject word) {
        if (morphology.NIL != string_utilities.lower_case_string_p(correct)) {
            return Strings.string_downcase(word, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
        }
        if (morphology.NIL != string_utilities.upper_case_string_p(correct)) {
            return Strings.string_upcase(word, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
        }
        if (morphology.NIL != string_utilities.capitalized_string_p(correct)) {
            return Strings.string_capitalize(word, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
        }
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 8611L)
    public static SubLObject regular_string_function(final SubLObject pred) {
        if (pred.eql(morphology.$const16$comparativeDegree)) {
            return Symbols.symbol_function((SubLObject)morphology.$sym17$COMPARATIVE_REG);
        }
        if (pred.eql(morphology.$const18$superlativeDegree)) {
            return Symbols.symbol_function((SubLObject)morphology.$sym19$SUPERLATIVE_REG);
        }
        if (pred.eql(morphology.$const20$comparativeAdverb)) {
            return Symbols.symbol_function((SubLObject)morphology.$sym21$COMPARATIVE_ADVERB_REG);
        }
        if (pred.eql(morphology.$const22$superlativeAdverb)) {
            return Symbols.symbol_function((SubLObject)morphology.$sym23$SUPERLATIVE_ADVERB_REG);
        }
        return Symbols.symbol_function((SubLObject)morphology.IDENTITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 9054L)
    public static SubLObject pos_preds_derivable_from_pred(final SubLObject pred, SubLObject mt) {
        if (mt == morphology.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        assert morphology.NIL != forts.fort_p(pred) : pred;
        return (SubLObject)((morphology.NIL != lexicon_accessors.speech_part_predP(pred, mt)) ? pos_preds_derivable_from_pred_int(pred, mt, (SubLObject)morphology.UNPROVIDED) : morphology.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 9404L)
    public static SubLObject clear_pos_preds_derivable_from_pred_int() {
        final SubLObject cs = morphology.$pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue();
        if (morphology.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 9404L)
    public static SubLObject remove_pos_preds_derivable_from_pred_int(final SubLObject pred, final SubLObject mt, SubLObject preds) {
        if (preds == morphology.UNPROVIDED) {
            preds = (SubLObject)morphology.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(morphology.$pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred, mt, preds), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 9404L)
    public static SubLObject pos_preds_derivable_from_pred_int_internal(final SubLObject pred, final SubLObject mt, SubLObject preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)morphology.$sym26$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(pred, morphology.$const27$regularSuffix, (SubLObject)morphology.TWO_INTEGER, (SubLObject)morphology.ONE_INTEGER, (SubLObject)morphology.UNPROVIDED);
            SubLObject der_pred = (SubLObject)morphology.NIL;
            der_pred = cdolist_list_var.first();
            while (morphology.NIL != cdolist_list_var) {
                if (morphology.NIL == subl_promotions.memberP(der_pred, preds, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
                    preds = (SubLObject)ConsesLow.cons(der_pred, preds);
                    SubLObject cdolist_list_var_$3 = pos_preds_derivable_from_pred_int(der_pred, mt, preds);
                    SubLObject new_pred = (SubLObject)morphology.NIL;
                    new_pred = cdolist_list_var_$3.first();
                    while (morphology.NIL != cdolist_list_var_$3) {
                        final SubLObject item_var = new_pred;
                        if (morphology.NIL == conses_high.member(item_var, preds, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                            preds = (SubLObject)ConsesLow.cons(item_var, preds);
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        new_pred = cdolist_list_var_$3.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                der_pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 9404L)
    public static SubLObject pos_preds_derivable_from_pred_int(final SubLObject pred, final SubLObject mt, SubLObject preds) {
        if (preds == morphology.UNPROVIDED) {
            preds = (SubLObject)morphology.NIL;
        }
        SubLObject caching_state = morphology.$pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue();
        if (morphology.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)morphology.$sym25$POS_PREDS_DERIVABLE_FROM_PRED_INT, (SubLObject)morphology.$sym28$_POS_PREDS_DERIVABLE_FROM_PRED_INT_CACHING_STATE_, (SubLObject)morphology.NIL, (SubLObject)morphology.EQL, (SubLObject)morphology.THREE_INTEGER, (SubLObject)morphology.$int29$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, mt, preds);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)morphology.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)morphology.NIL;
            collision = cdolist_list_var.first();
            while (morphology.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (morphology.NIL != cached_args && morphology.NIL == cached_args.rest() && preds.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pos_preds_derivable_from_pred_int_internal(pred, mt, preds)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt, preds));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 9893L)
    public static SubLObject singular_form_for_pred(final SubLObject pred) {
        if (morphology.NIL == plural_predP(pred, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.NIL;
        }
        SubLObject ans = (SubLObject)morphology.NIL;
        final SubLObject pos = lexicon_accessors.pos_of_pred(pred);
        final SubLObject other_preds = lexicon_utilities.preds_of_pos(pos, (SubLObject)morphology.UNPROVIDED);
        if (morphology.NIL == ans) {
            SubLObject csome_list_var = other_preds;
            SubLObject other_pred = (SubLObject)morphology.NIL;
            other_pred = csome_list_var.first();
            while (morphology.NIL == ans && morphology.NIL != csome_list_var) {
                if (morphology.NIL != singular_predP(other_pred, (SubLObject)morphology.UNPROVIDED)) {
                    ans = other_pred;
                }
                csome_list_var = csome_list_var.rest();
                other_pred = csome_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 10287L)
    public static SubLObject plural_predP(final SubLObject pred, SubLObject mt) {
        if (mt == morphology.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)morphology.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            ans = (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != forts.fort_p(pred) && morphology.NIL != genl_predicates.genl_predP(pred, morphology.$const30$plural_Generic, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 10501L)
    public static SubLObject singular_predP(final SubLObject pred, SubLObject mt) {
        if (mt == morphology.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)morphology.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            ans = (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != forts.fort_p(pred) && morphology.NIL != genl_predicates.genl_predP(pred, morphology.$const31$singular_Generic, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 10719L)
    public static SubLObject generate_z_form(final SubLObject wu, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)morphology.NIL;
        if (morphology.NIL != Sequences.find(pred, (SubLObject)morphology.$list32, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)morphology.$sym26$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
                final SubLObject singular_pred = singular_form_for_pred(pred);
                final SubLObject root = (SubLObject)((morphology.NIL != singular_pred) ? kb_mapping_utilities.fpred_value(wu, singular_pred, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED) : morphology.NIL);
                if (morphology.NIL != root) {
                    ans = Sequences.cconcatenate(root, (SubLObject)morphology.$str33$z);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 11252L)
    public static SubLObject suffix_rules_for_pred(final SubLObject pred) {
        return kb_mapping.gather_gaf_arg_index_with_predicate(pred, (SubLObject)morphology.ONE_INTEGER, morphology.$const27$regularSuffix, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 11428L)
    public static SubLObject generate_regular_string_from_form(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, SubLObject mt_info) {
        if (mt_info == morphology.UNPROVIDED) {
            mt_info = morphology.$const34$EnglishLexiconMt;
        }
        return generate_regular_strings_from_form(target_pred, base_pred, base_form, mt_info, (SubLObject)morphology.T, (SubLObject)morphology.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 11973L)
    public static SubLObject generate_regular_strings_from_form(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, SubLObject mt_info, SubLObject best_onlyP, SubLObject tried_preds) {
        if (mt_info == morphology.UNPROVIDED) {
            mt_info = morphology.$const34$EnglishLexiconMt;
        }
        if (best_onlyP == morphology.UNPROVIDED) {
            best_onlyP = (SubLObject)morphology.NIL;
        }
        if (tried_preds == morphology.UNPROVIDED) {
            tried_preds = (SubLObject)morphology.NIL;
        }
        if (morphology.NIL != subl_promotions.memberP(base_pred, (SubLObject)morphology.$list35, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != conses_high.member(target_pred, (SubLObject)morphology.$list36, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
            final SubLObject inflection_function = regular_string_function(target_pred);
            final SubLObject form = Functions.funcall(inflection_function, base_form);
            return (SubLObject)ConsesLow.list(form);
        }
        return generate_regular_strings_from_form_int(target_pred, base_pred, base_form, mt_info, best_onlyP, tried_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 13117L)
    public static SubLObject generate_regular_strings_from_form_int(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, final SubLObject mt_info, final SubLObject best_onlyP, final SubLObject tried_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject target_forms = (SubLObject)morphology.NIL;
        SubLObject doneP = (SubLObject)morphology.NIL;
        if (morphology.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)morphology.$sym37$RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)morphology.$sym37$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(morphology.$const38$EverythingPSC, thread);
                if (morphology.NIL == doneP) {
                    SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                    SubLObject rule = (SubLObject)morphology.NIL;
                    rule = csome_list_var.first();
                    while (morphology.NIL == doneP && morphology.NIL != csome_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                        SubLObject rule_base_pred = (SubLObject)morphology.NIL;
                        SubLObject suffix = (SubLObject)morphology.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)morphology.$list39);
                        rule_base_pred = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)morphology.$list39);
                        suffix = current.first();
                        current = current.rest();
                        if (morphology.NIL == current) {
                            if (rule_base_pred.eql(base_pred)) {
                                final SubLObject item_var = add_english_suffix(base_form, suffix);
                                if (morphology.NIL == conses_high.member(item_var, target_forms, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                                    target_forms = (SubLObject)ConsesLow.cons(item_var, target_forms);
                                }
                                doneP = best_onlyP;
                            }
                            else if (morphology.NIL == subl_promotions.memberP((SubLObject)ConsesLow.list(rule_base_pred, base_pred), tried_preds, Symbols.symbol_function((SubLObject)morphology.EQUAL), (SubLObject)morphology.UNPROVIDED)) {
                                final SubLObject new_tried_preds = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule_base_pred, base_pred), tried_preds);
                                final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, (SubLObject)morphology.NIL, new_tried_preds);
                                if (morphology.NIL == doneP) {
                                    SubLObject csome_list_var_$4 = derived_base_forms;
                                    SubLObject derived_base_form = (SubLObject)morphology.NIL;
                                    derived_base_form = csome_list_var_$4.first();
                                    while (morphology.NIL == doneP && morphology.NIL != csome_list_var_$4) {
                                        final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                        if (morphology.NIL == conses_high.member(item_var2, target_forms, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                                            target_forms = (SubLObject)ConsesLow.cons(item_var2, target_forms);
                                        }
                                        doneP = best_onlyP;
                                        csome_list_var_$4 = csome_list_var_$4.rest();
                                        derived_base_form = csome_list_var_$4.first();
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphology.$list39);
                        }
                        csome_list_var = csome_list_var.rest();
                        rule = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (morphology.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)morphology.$sym40$RELEVANT_MT_IS_ANY_MT)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)morphology.$sym40$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(morphology.$const41$InferencePSC, thread);
                if (morphology.NIL == doneP) {
                    SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                    SubLObject rule = (SubLObject)morphology.NIL;
                    rule = csome_list_var.first();
                    while (morphology.NIL == doneP && morphology.NIL != csome_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                        SubLObject rule_base_pred = (SubLObject)morphology.NIL;
                        SubLObject suffix = (SubLObject)morphology.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)morphology.$list39);
                        rule_base_pred = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)morphology.$list39);
                        suffix = current.first();
                        current = current.rest();
                        if (morphology.NIL == current) {
                            if (rule_base_pred.eql(base_pred)) {
                                final SubLObject item_var = add_english_suffix(base_form, suffix);
                                if (morphology.NIL == conses_high.member(item_var, target_forms, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                                    target_forms = (SubLObject)ConsesLow.cons(item_var, target_forms);
                                }
                                doneP = best_onlyP;
                            }
                            else if (morphology.NIL == subl_promotions.memberP((SubLObject)ConsesLow.list(rule_base_pred, base_pred), tried_preds, Symbols.symbol_function((SubLObject)morphology.EQUAL), (SubLObject)morphology.UNPROVIDED)) {
                                final SubLObject new_tried_preds = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule_base_pred, base_pred), tried_preds);
                                final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, (SubLObject)morphology.NIL, new_tried_preds);
                                if (morphology.NIL == doneP) {
                                    SubLObject csome_list_var_$5 = derived_base_forms;
                                    SubLObject derived_base_form = (SubLObject)morphology.NIL;
                                    derived_base_form = csome_list_var_$5.first();
                                    while (morphology.NIL == doneP && morphology.NIL != csome_list_var_$5) {
                                        final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                        if (morphology.NIL == conses_high.member(item_var2, target_forms, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                                            target_forms = (SubLObject)ConsesLow.cons(item_var2, target_forms);
                                        }
                                        doneP = best_onlyP;
                                        csome_list_var_$5 = csome_list_var_$5.rest();
                                        derived_base_form = csome_list_var_$5.first();
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphology.$list39);
                        }
                        csome_list_var = csome_list_var.rest();
                        rule = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (morphology.NIL != hlmt.mt_union_naut_p(mt_info)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)morphology.$sym42$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                if (morphology.NIL == doneP) {
                    SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                    SubLObject rule = (SubLObject)morphology.NIL;
                    rule = csome_list_var.first();
                    while (morphology.NIL == doneP && morphology.NIL != csome_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                        SubLObject rule_base_pred = (SubLObject)morphology.NIL;
                        SubLObject suffix = (SubLObject)morphology.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)morphology.$list39);
                        rule_base_pred = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)morphology.$list39);
                        suffix = current.first();
                        current = current.rest();
                        if (morphology.NIL == current) {
                            if (rule_base_pred.eql(base_pred)) {
                                final SubLObject item_var = add_english_suffix(base_form, suffix);
                                if (morphology.NIL == conses_high.member(item_var, target_forms, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                                    target_forms = (SubLObject)ConsesLow.cons(item_var, target_forms);
                                }
                                doneP = best_onlyP;
                            }
                            else if (morphology.NIL == subl_promotions.memberP((SubLObject)ConsesLow.list(rule_base_pred, base_pred), tried_preds, Symbols.symbol_function((SubLObject)morphology.EQUAL), (SubLObject)morphology.UNPROVIDED)) {
                                final SubLObject new_tried_preds = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule_base_pred, base_pred), tried_preds);
                                final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, (SubLObject)morphology.NIL, new_tried_preds);
                                if (morphology.NIL == doneP) {
                                    SubLObject csome_list_var_$6 = derived_base_forms;
                                    SubLObject derived_base_form = (SubLObject)morphology.NIL;
                                    derived_base_form = csome_list_var_$6.first();
                                    while (morphology.NIL == doneP && morphology.NIL != csome_list_var_$6) {
                                        final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                        if (morphology.NIL == conses_high.member(item_var2, target_forms, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                                            target_forms = (SubLObject)ConsesLow.cons(item_var2, target_forms);
                                        }
                                        doneP = best_onlyP;
                                        csome_list_var_$6 = csome_list_var_$6.rest();
                                        derived_base_form = csome_list_var_$6.first();
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphology.$list39);
                        }
                        csome_list_var = csome_list_var.rest();
                        rule = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)morphology.$sym26$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_info, thread);
                if (morphology.NIL == doneP) {
                    SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                    SubLObject rule = (SubLObject)morphology.NIL;
                    rule = csome_list_var.first();
                    while (morphology.NIL == doneP && morphology.NIL != csome_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                        SubLObject rule_base_pred = (SubLObject)morphology.NIL;
                        SubLObject suffix = (SubLObject)morphology.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)morphology.$list39);
                        rule_base_pred = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)morphology.$list39);
                        suffix = current.first();
                        current = current.rest();
                        if (morphology.NIL == current) {
                            if (rule_base_pred.eql(base_pred)) {
                                final SubLObject item_var = add_english_suffix(base_form, suffix);
                                if (morphology.NIL == conses_high.member(item_var, target_forms, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                                    target_forms = (SubLObject)ConsesLow.cons(item_var, target_forms);
                                }
                                doneP = best_onlyP;
                            }
                            else if (morphology.NIL == subl_promotions.memberP((SubLObject)ConsesLow.list(rule_base_pred, base_pred), tried_preds, Symbols.symbol_function((SubLObject)morphology.EQUAL), (SubLObject)morphology.UNPROVIDED)) {
                                final SubLObject new_tried_preds = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule_base_pred, base_pred), tried_preds);
                                final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, (SubLObject)morphology.NIL, new_tried_preds);
                                if (morphology.NIL == doneP) {
                                    SubLObject csome_list_var_$7 = derived_base_forms;
                                    SubLObject derived_base_form = (SubLObject)morphology.NIL;
                                    derived_base_form = csome_list_var_$7.first();
                                    while (morphology.NIL == doneP && morphology.NIL != csome_list_var_$7) {
                                        final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                        if (morphology.NIL == conses_high.member(item_var2, target_forms, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                                            target_forms = (SubLObject)ConsesLow.cons(item_var2, target_forms);
                                        }
                                        doneP = best_onlyP;
                                        csome_list_var_$7 = csome_list_var_$7.rest();
                                        derived_base_form = csome_list_var_$7.first();
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)morphology.$list39);
                        }
                        csome_list_var = csome_list_var.rest();
                        rule = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return target_forms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 14217L)
    public static SubLObject add_english_suffix(SubLObject base, SubLObject suffix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert morphology.NIL != cycl_string.cycl_string_p(base) : base;
        assert morphology.NIL != cycl_string.cycl_string_p(suffix) : suffix;
        if (suffix.equal((SubLObject)morphology.$str44$)) {
            return base;
        }
        thread.resetMultipleValues();
        final SubLObject base_$8 = aes_do_orthographic_changes(base, suffix);
        final SubLObject suffix_$9 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        base = base_$8;
        suffix = suffix_$9;
        return string_utilities.post_fix(base, suffix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 16883L)
    public static SubLObject aes_do_orthographic_changes(final SubLObject base, final SubLObject suffix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_suffix = suffix;
        SubLObject current_base = base;
        SubLObject changers = (SubLObject)morphology.NIL;
        SubLObject cdolist_list_var = aes_do_orthographic_change_fns();
        SubLObject cons = (SubLObject)morphology.NIL;
        cons = cdolist_list_var.first();
        while (morphology.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject change_fn = (SubLObject)morphology.NIL;
            SubLObject type = (SubLObject)morphology.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)morphology.$list45);
            change_fn = current.first();
            current = (type = current.rest());
            thread.resetMultipleValues();
            final SubLObject new_base = aes_do_orthographic_change(current_base, current_suffix, change_fn, type);
            final SubLObject new_suffix = thread.secondMultipleValue();
            final SubLObject changedP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (morphology.NIL != changedP) {
                changers = (SubLObject)ConsesLow.cons(change_fn, changers);
                current_base = new_base;
                current_suffix = new_suffix;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return Values.values(current_base, current_suffix, changers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 18208L)
    public static SubLObject aes_do_orthographic_change_fns() {
        return morphology.$aes_do_orthographic_change_fns$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 18301L)
    public static SubLObject aes_do_orthographic_change(final SubLObject base, final SubLObject suffix, final SubLObject change_fn, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_suffix = suffix;
        SubLObject new_base = base;
        final SubLObject base_changerP = conses_high.member(type, (SubLObject)morphology.$list47, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
        final SubLObject suffix_changerP = conses_high.member(type, (SubLObject)morphology.$list48, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
        if (morphology.NIL != base_changerP && morphology.NIL != suffix_changerP) {
            thread.resetMultipleValues();
            final SubLObject new_base_$10 = Functions.funcall(change_fn, base, suffix);
            final SubLObject new_suffix_$11 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_base = new_base_$10;
            new_suffix = new_suffix_$11;
        }
        else if (morphology.NIL != base_changerP) {
            new_base = Functions.funcall(change_fn, base, suffix);
        }
        else if (morphology.NIL != suffix_changerP) {
            new_suffix = Functions.funcall(change_fn, base, suffix);
        }
        final SubLObject changedP = (SubLObject)SubLObjectFactory.makeBoolean(!base.equal(new_base) || !suffix.equal(new_suffix));
        return Values.values(new_base, new_suffix, changedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 19041L)
    public static SubLObject ends_with_sibilantP(final SubLObject string) {
        return string_utilities.ends_with_one_of(string, morphology.$sibilant_endings$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 19143L)
    public static SubLObject aes_add_e_before_s(final SubLObject base, SubLObject suffix) {
        if (morphology.NIL != ends_with_sibilantP(base) && morphology.NIL != string_utilities.starts_with(suffix, (SubLObject)morphology.$str49$s)) {
            suffix = Sequences.cconcatenate((SubLObject)morphology.$str50$e, suffix);
        }
        return suffix;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 19338L)
    public static SubLObject aes_ion_to_ation(final SubLObject base, SubLObject suffix) {
        if (suffix.equal((SubLObject)morphology.$str51$ion) && morphology.NIL != string_utilities.ends_with_one_of(base, (SubLObject)morphology.$list52)) {
            suffix = (SubLObject)morphology.$str53$ation;
        }
        return suffix;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 19594L)
    public static SubLObject aes_change_y_to_i(SubLObject base, SubLObject suffix) {
        if (morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str11$y, (SubLObject)morphology.UNPROVIDED) && morphology.NIL == string_utilities.starts_with(suffix, (SubLObject)morphology.$str54$i) && morphology.NIL == ends_with_vowelP(string_utilities.strip_final(base, (SubLObject)morphology.UNPROVIDED))) {
            base = Sequences.cconcatenate(string_utilities.strip_final(base, (SubLObject)morphology.UNPROVIDED), (SubLObject)morphology.$str54$i);
            if (morphology.NIL != list_utilities.lengthE(suffix, (SubLObject)morphology.ONE_INTEGER, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != starts_with_consonantP(suffix)) {
                suffix = Sequences.cconcatenate((SubLObject)morphology.$str50$e, suffix);
            }
        }
        return Values.values(base, suffix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 20004L)
    public static SubLObject aes_ble_to_bil_before_ity(SubLObject base, final SubLObject suffix) {
        if (suffix.equalp((SubLObject)morphology.$str55$ity) && morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str56$ble, (SubLObject)morphology.UNPROVIDED)) {
            base = Sequences.cconcatenate(string_utilities.strip_final(base, (SubLObject)morphology.TWO_INTEGER), (SubLObject)morphology.$str57$il);
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 20203L)
    public static SubLObject aes_change_aic_to_ac(SubLObject base, final SubLObject suffix) {
        if (morphology.NIL != string_utilities.starts_with(suffix, (SubLObject)morphology.$str58$at) && morphology.NIL != string_utilities.ends_with(string_utilities.strip_final(base, (SubLObject)morphology.UNPROVIDED), (SubLObject)morphology.$str59$ai, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != ends_with_consonantP(base)) {
            base = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(string_utilities.strip_final(base, (SubLObject)morphology.TWO_INTEGER)), format_nil.format_nil_a_no_copy(string_utilities.last_char(base)));
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 20496L)
    public static SubLObject aes_strip_final_e(SubLObject base, final SubLObject suffix) {
        if (morphology.NIL != list_utilities.lengthG(base, (SubLObject)morphology.ONE_INTEGER, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str50$e, (SubLObject)morphology.UNPROVIDED) && (morphology.NIL != string_utilities.starts_with(suffix, (SubLObject)morphology.$str50$e) || ((morphology.NIL != string_utilities.ends_with(string_utilities.strip_final(base, (SubLObject)morphology.UNPROVIDED), (SubLObject)morphology.$str15$u, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != ends_with_consonantP(string_utilities.strip_final(base, (SubLObject)morphology.UNPROVIDED))) && morphology.NIL != starts_with_vowelP(suffix)))) {
            base = string_utilities.strip_final(base, (SubLObject)morphology.UNPROVIDED);
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 20828L)
    public static SubLObject aes_strip_final_vowels_before_ic(SubLObject base, final SubLObject suffix) {
        if (morphology.NIL != string_utilities.starts_with(suffix, (SubLObject)morphology.$str54$i) && !suffix.equalp((SubLObject)morphology.$str60$ing) && morphology.NIL != list_utilities.lengthG(suffix, (SubLObject)morphology.ONE_INTEGER, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != polysyllabicP(base, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != starts_with_consonantP(string_utilities.substring(suffix, (SubLObject)morphology.ONE_INTEGER, (SubLObject)morphology.UNPROVIDED))) {
            while (morphology.NIL != ends_with_vowelP(base)) {
                base = string_utilities.strip_final(base, (SubLObject)morphology.UNPROVIDED);
            }
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 21201L)
    public static SubLObject aes_change_ie_to_y(SubLObject base, final SubLObject suffix) {
        if (morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str61$ie, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != string_utilities.starts_with(suffix, (SubLObject)morphology.$str54$i)) {
            base = Sequences.cconcatenate(string_utilities.strip_final(base, (SubLObject)morphology.TWO_INTEGER), (SubLObject)morphology.$str11$y);
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 21392L)
    public static SubLObject aes_change_ism_to_ist(SubLObject base, final SubLObject suffix) {
        if (morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str62$ism, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != Strings.string_equal(suffix, (SubLObject)morphology.$str63$ist, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
            base = string_utilities.remove_substring(base, (SubLObject)morphology.$str62$ism);
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 21676L)
    public static SubLObject aes_change_ceive_to_cept(SubLObject base, final SubLObject suffix) {
        if (morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str64$ceive, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != Strings.string_equal(suffix, (SubLObject)morphology.$str51$ion, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
            base = Sequences.cconcatenate(string_utilities.remove_substring(base, (SubLObject)morphology.$str65$ive), (SubLObject)morphology.$str66$pt);
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 21940L)
    public static SubLObject aes_change_vert_to_vers(SubLObject base, final SubLObject suffix) {
        if (morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str67$vert, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != Strings.string_equal(suffix, (SubLObject)morphology.$str51$ion, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
            base = Sequences.cconcatenate(string_utilities.post_remove(base, (SubLObject)morphology.$str67$vert, (SubLObject)morphology.UNPROVIDED), (SubLObject)morphology.$str68$vers);
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 22199L)
    public static SubLObject aes_change_duce_to_duct(SubLObject base, final SubLObject suffix) {
        if (morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str69$duce, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != Strings.string_equal(suffix, (SubLObject)morphology.$str51$ion, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
            base = Sequences.cconcatenate(string_utilities.post_remove(base, (SubLObject)morphology.$str50$e, (SubLObject)morphology.UNPROVIDED), (SubLObject)morphology.$str70$t);
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 22450L)
    public static SubLObject aes_remove_able_le_before_ly(SubLObject base, final SubLObject suffix) {
        if ((morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str71$able, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str72$ible, (SubLObject)morphology.UNPROVIDED)) && morphology.NIL != Strings.string_equal(suffix, (SubLObject)morphology.$str12$ly, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
            base = string_utilities.remove_substring(base, (SubLObject)morphology.$str73$le);
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 22682L)
    public static SubLObject aes_de_to_se(SubLObject base, final SubLObject suffix) {
        if (morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str74$de, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != string_utilities.starts_with(suffix, (SubLObject)morphology.$str54$i) && morphology.NIL == string_utilities.starts_with(suffix, (SubLObject)morphology.$str75$is) && morphology.NIL == subl_promotions.memberP(suffix, (SubLObject)morphology.$list76, Symbols.symbol_function((SubLObject)morphology.EQUAL), (SubLObject)morphology.UNPROVIDED)) {
            base = Sequences.cconcatenate(string_utilities.post_remove(base, (SubLObject)morphology.$str74$de, (SubLObject)morphology.UNPROVIDED), (SubLObject)morphology.$str77$se);
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 23010L)
    public static SubLObject aes_geminate_last(SubLObject base, final SubLObject suffix) {
        if ((morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str33$z, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != starts_with_vowelP(suffix) || suffix.equalp((SubLObject)morphology.$str11$y)) && morphology.NIL != ends_with_doublerP(base) && morphology.NIL == dont_geminate_beforeP(suffix) && (morphology.NIL != ends_in_cvcP(base) || morphology.NIL != ends_in_quvcP(base)) && ((!suffix.equalp((SubLObject)morphology.$str78$ize) && !suffix.equalp((SubLObject)morphology.$str79$ise)) || morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str80$al, (SubLObject)morphology.UNPROVIDED)) && ((morphology.NIL == string_utilities.ends_with(base, (SubLObject)morphology.$str81$er, (SubLObject)morphology.UNPROVIDED) && morphology.NIL == string_utilities.ends_with(base, (SubLObject)morphology.$str82$or, (SubLObject)morphology.UNPROVIDED)) || (morphology.NIL != string_utilities.ends_with(base, (SubLObject)morphology.$str83$fer, (SubLObject)morphology.UNPROVIDED) && morphology.NIL == string_utilities.ends_with(base, (SubLObject)morphology.$str84$ffer, (SubLObject)morphology.UNPROVIDED))) && (morphology.NIL == string_utilities.ends_with(base, (SubLObject)morphology.$str85$id, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != monosyllabicP(base)) && (morphology.NIL == string_utilities.ends_with_one_of(base, (SubLObject)morphology.$list86) || morphology.NIL != monosyllabicP(base))) {
            base = geminate_last(base);
        }
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 23879L)
    public static SubLObject dont_geminate_beforeP(final SubLObject suffix) {
        return (SubLObject)SubLObjectFactory.makeBoolean(suffix.equalp((SubLObject)morphology.$str71$able) || suffix.equalp((SubLObject)morphology.$str55$ity) || suffix.equalp((SubLObject)morphology.$str87$alicious));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 24024L)
    public static SubLObject aes_able_to_ate(SubLObject base, final SubLObject suffix) {
        if (morphology.NIL == string_utilities.ends_with(base, (SubLObject)morphology.$str88$ate, (SubLObject)morphology.UNPROVIDED) || morphology.NIL == Strings.string_equal(suffix, (SubLObject)morphology.$str71$able, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
            return base;
        }
        if (estimated_syllable_count(base).numLE((SubLObject)morphology.TWO_INTEGER)) {
            base = string_utilities.post_remove(base, (SubLObject)morphology.$str50$e, (SubLObject)morphology.UNPROVIDED);
            return base;
        }
        if (morphology.NIL != subl_promotions.memberP(base, morphology.$special_ate_cases$.getGlobalValue(), (SubLObject)morphology.EQUALP, (SubLObject)morphology.UNPROVIDED)) {
            base = string_utilities.remove_substring(base, (SubLObject)morphology.$str88$ate);
            return base;
        }
        base = string_utilities.post_remove(base, (SubLObject)morphology.$str50$e, (SubLObject)morphology.UNPROVIDED);
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 24873L)
    public static SubLObject try_regular_adj_morphologyP(final SubLObject base_form) {
        final SubLObject cutoff = morphology.$comparative_syllable_cutoff$.getGlobalValue();
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL == string_utilities.ends_with(base_form, (SubLObject)morphology.$str89$ed, (SubLObject)morphology.UNPROVIDED) && estimated_syllable_count(base_form).numLE(cutoff));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 25329L)
    public static SubLObject most_form(final SubLObject string) {
        return Sequences.cconcatenate(morphology.$most_prefix$.getGlobalValue(), string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 25410L)
    public static SubLObject more_form(final SubLObject string) {
        return Sequences.cconcatenate(morphology.$more_prefix$.getGlobalValue(), string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 25491L)
    public static SubLObject most_form_p(final SubLObject string) {
        return string_utilities.starts_with(string, morphology.$most_prefix$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 25573L)
    public static SubLObject more_form_p(final SubLObject string) {
        return string_utilities.starts_with(string, morphology.$more_prefix$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 25655L)
    public static SubLObject more_or_most_form(final SubLObject string, final SubLObject pred) {
        if (morphology.NIL != lexicon_cache.comparative_formP(pred)) {
            return more_form(string);
        }
        if (morphology.NIL != lexicon_cache.superlative_formP(pred)) {
            return most_form(string);
        }
        return more_form(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 26169L)
    public static SubLObject more_or_most_form_p(final SubLObject string, final SubLObject pred) {
        if (morphology.NIL != lexicon_cache.comparative_formP(pred)) {
            return more_form_p(string);
        }
        if (morphology.NIL != lexicon_cache.superlative_formP(pred)) {
            return most_form_p(string);
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 26616L)
    public static SubLObject comparative_reg(final SubLObject string) {
        if (morphology.NIL != try_regular_adj_morphologyP(string)) {
            return add_english_suffix(string, (SubLObject)morphology.$str81$er);
        }
        return more_form(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 27048L)
    public static SubLObject comparative_adverb_reg(final SubLObject string) {
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str12$ly, (SubLObject)morphology.UNPROVIDED)) {
            return more_form(string);
        }
        return comparative_reg(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 27377L)
    public static SubLObject superlative_reg(final SubLObject string) {
        if (morphology.NIL != try_regular_adj_morphologyP(string)) {
            return add_english_suffix(string, (SubLObject)morphology.$str92$est);
        }
        return most_form(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 27725L)
    public static SubLObject superlative_adverb_reg(final SubLObject string) {
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str12$ly, (SubLObject)morphology.UNPROVIDED)) {
            return most_form(string);
        }
        return superlative_reg(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 28054L)
    public static SubLObject past_tense_reg(final SubLObject string) {
        return generate_regular_string_from_form(morphology.$const93$pastTense_Universal, morphology.$const94$infinitive, string, (SubLObject)morphology.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 28656L)
    public static SubLObject gerund_reg(final SubLObject string) {
        return generate_regular_string_from_form(morphology.$const95$gerund, morphology.$const94$infinitive, string, (SubLObject)morphology.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 28890L)
    public static SubLObject third_sg_reg(final SubLObject string) {
        return generate_regular_string_from_form(morphology.$const96$thirdPersonSg_Present, morphology.$const94$infinitive, string, (SubLObject)morphology.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 29127L)
    public static SubLObject plural_reg(final SubLObject string) {
        return correct_capitalization(string, generate_regular_string_from_form(morphology.$const97$plural, morphology.$const98$singular, string, (SubLObject)morphology.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 29362L)
    public static SubLObject pn_plural_reg(final SubLObject string) {
        return string_utilities.string_proper(pluralize_string(string, (SubLObject)morphology.UNPROVIDED), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 29606L)
    public static SubLObject infinitive_to_third_sing(final SubLObject string) {
        final SubLObject words = lexicon_accessors.words_of_stringXpred(string, morphology.$const94$infinitive, (SubLObject)morphology.T, morphology.$const99$EnglishMt, (SubLObject)morphology.UNPROVIDED);
        if (morphology.NIL != words) {
            final SubLObject word_to_use = words.first();
            final SubLObject irreg_stored_form = lexicon_utilities.verb_form_third_sing(word_to_use, (SubLObject)morphology.UNPROVIDED);
            if (morphology.NIL != irreg_stored_form) {
                return irreg_stored_form;
            }
        }
        return generate_regular_string_from_form(morphology.$const96$thirdPersonSg_Present, morphology.$const94$infinitive, string, (SubLObject)morphology.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 30275L)
    public static SubLObject infinitive_to_pres_participle(final SubLObject string) {
        final SubLObject words = lexicon_accessors.words_of_stringXpred(string, morphology.$const94$infinitive, (SubLObject)morphology.T, morphology.$const99$EnglishMt, (SubLObject)morphology.UNPROVIDED);
        if (morphology.NIL != words) {
            final SubLObject word_to_use = words.first();
            final SubLObject irreg_stored_form = lexicon_utilities.verb_form_pres_participle(word_to_use, (SubLObject)morphology.UNPROVIDED);
            if (morphology.NIL != irreg_stored_form) {
                return irreg_stored_form;
            }
        }
        return generate_regular_string_from_form(morphology.$const100$presentParticiple, morphology.$const94$infinitive, string, (SubLObject)morphology.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 31415L)
    public static SubLObject possessivize_string(final SubLObject string, SubLObject pos_pred) {
        if (pos_pred == morphology.UNPROVIDED) {
            pos_pred = (SubLObject)morphology.NIL;
        }
        if (!string.isString()) {
            return string;
        }
        final SubLObject lexical_possessive = english_lexical_possessive_version_of_string(string);
        if (lexical_possessive.isString()) {
            return lexical_possessive;
        }
        return Sequences.cconcatenate(string, english_possessive_suffix_for_string(string, pos_pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 31975L)
    public static SubLObject english_lexical_possessive_version_of_string(final SubLObject string) {
        final SubLObject pronominal_possessive = list_utilities.alist_lookup(morphology.$english_possessive_pronouns$.getGlobalValue(), string, Symbols.symbol_function((SubLObject)morphology.EQUALP), (SubLObject)morphology.$kw102$NOT_FOUND);
        if (pronominal_possessive.isString()) {
            return pronominal_possessive;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 32334L)
    public static SubLObject english_possessive_suffix_for_string(final SubLObject string, SubLObject pos_pred) {
        if (pos_pred == morphology.UNPROVIDED) {
            pos_pred = (SubLObject)morphology.NIL;
        }
        SubLObject suffix = (SubLObject)morphology.NIL;
        if (morphology.NIL == pos_pred && morphology.NIL != plural_nounP(string)) {
            pos_pred = morphology.$const30$plural_Generic;
        }
        if (morphology.NIL != forts.fort_p(pos_pred) && morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str49$s, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != lexicon_accessors.genl_pos_predP(pos_pred, morphology.$const30$plural_Generic, (SubLObject)morphology.UNPROVIDED)) {
            suffix = (SubLObject)morphology.$str103$_;
        }
        if (!suffix.isString()) {
            suffix = (SubLObject)morphology.$str104$_s;
        }
        return suffix;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 32867L)
    public static SubLObject locativize_string(final SubLObject string, final SubLObject denot) {
        if (morphology.NIL != not_locativizable_english_stringP(string)) {
            return string;
        }
        return Sequences.cconcatenate(english_locative_preposition_for_denot(denot), new SubLObject[] { morphology.$str105$_, string });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 33180L)
    public static SubLObject not_locativizable_english_stringP(final SubLObject v_object) {
        if (!v_object.isString()) {
            return (SubLObject)morphology.T;
        }
        SubLObject ans = (SubLObject)morphology.NIL;
        if (morphology.NIL != subl_promotions.memberP(morphology.$const106$QuantifyingIndexical, lexicon_accessors.pos_of_string(v_object, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
            ans = (SubLObject)morphology.T;
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 33560L)
    public static SubLObject english_locative_preposition_for_denot(final SubLObject denot) {
        if (morphology.NIL != isa.isa_in_any_mtP(denot, morphology.$const107$GeographicalRegion)) {
            return (SubLObject)morphology.$str108$in;
        }
        if (morphology.NIL != isa.isa_in_any_mtP(denot, morphology.$const109$SurfaceRegion_Underspecified)) {
            return (SubLObject)morphology.$str110$on;
        }
        return (SubLObject)morphology.$str108$in;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 33793L)
    public static SubLObject pluralize_string(final SubLObject string, SubLObject mt) {
        if (mt == morphology.UNPROVIDED) {
            mt = morphology.$const99$EnglishMt;
        }
        SubLObject ans = (SubLObject)morphology.NIL;
        ans = pluralize_string_wXlexicon(string, mt);
        if (morphology.NIL == ans) {
            final SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
            final SubLObject last_token = conses_high.last(tokens, (SubLObject)morphology.UNPROVIDED).first();
            if (morphology.NIL != list_utilities.lengthG(tokens, (SubLObject)morphology.ONE_INTEGER, (SubLObject)morphology.UNPROVIDED)) {
                final SubLObject plural_last_token = pluralize_string_wXlexicon(last_token, mt);
                if (morphology.NIL != plural_last_token) {
                    ans = Sequences.cconcatenate(Sequences.subseq(string, (SubLObject)morphology.ZERO_INTEGER, Numbers.subtract(Sequences.length(string), Sequences.length(last_token))), plural_last_token);
                }
            }
        }
        if (morphology.NIL == ans) {
            ans = plural_reg(string);
        }
        return correct_capitalization(string, ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 34735L)
    public static SubLObject pluralize_string_wXlexicon(final SubLObject string, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)morphology.NIL;
        if (morphology.NIL != control_vars.lexicon_initialized_p()) {
            final SubLObject words = lexicon_accessors.words_of_stringXpred(string, morphology.$const31$singular_Generic, (SubLObject)morphology.T, mt, (SubLObject)morphology.UNPROVIDED);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                if (morphology.NIL == ans) {
                    SubLObject csome_list_var = words;
                    SubLObject word = (SubLObject)morphology.NIL;
                    word = csome_list_var.first();
                    while (morphology.NIL == ans && morphology.NIL != csome_list_var) {
                        if (morphology.NIL == ans) {
                            SubLObject csome_list_var_$12 = lexicon_accessors.preds_of_stringXword(string, word, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
                            SubLObject singular_pred = (SubLObject)morphology.NIL;
                            singular_pred = csome_list_var_$12.first();
                            while (morphology.NIL == ans && morphology.NIL != csome_list_var_$12) {
                                final SubLObject plural_pred = lexicon_accessors.plural_pred(lexicon_accessors.pos_of_pred(singular_pred));
                                if (morphology.NIL != plural_pred) {
                                    ans = lexicon_cache.first_string_of_wordXpred(word, plural_pred, mt);
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
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)((morphology.NIL != ans) ? correct_capitalization(string, ans) : morphology.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 35458L)
    public static SubLObject singularize_string(final SubLObject string, SubLObject mt) {
        if (mt == morphology.UNPROVIDED) {
            mt = morphology.$const99$EnglishMt;
        }
        SubLObject ans = (SubLObject)morphology.NIL;
        ans = singularize_string_wXlexicon(string, mt);
        if (morphology.NIL == ans) {
            final SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
            final SubLObject last_token = conses_high.last(tokens, (SubLObject)morphology.UNPROVIDED).first();
            if (morphology.NIL != list_utilities.lengthG(tokens, (SubLObject)morphology.ONE_INTEGER, (SubLObject)morphology.UNPROVIDED)) {
                final SubLObject singular_last_token = singularize_string_wXlexicon(last_token, mt);
                if (morphology.NIL != singular_last_token) {
                    ans = Sequences.cconcatenate(Sequences.subseq(string, (SubLObject)morphology.ZERO_INTEGER, Numbers.subtract(Sequences.length(string), Sequences.length(last_token))), singular_last_token);
                }
            }
        }
        if (morphology.NIL == ans) {
            ans = singular_reg(string);
        }
        return correct_capitalization(string, ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 36821L)
    public static SubLObject singularize_string_wXlexicon(final SubLObject string, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)morphology.NIL;
        if (morphology.NIL != control_vars.lexicon_initialized_p()) {
            final SubLObject words = lexicon_accessors.words_of_stringXpred(string, morphology.$const30$plural_Generic, (SubLObject)morphology.T, mt, (SubLObject)morphology.UNPROVIDED);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                if (morphology.NIL == ans) {
                    SubLObject csome_list_var = words;
                    SubLObject word = (SubLObject)morphology.NIL;
                    word = csome_list_var.first();
                    while (morphology.NIL == ans && morphology.NIL != csome_list_var) {
                        if (morphology.NIL == ans) {
                            SubLObject csome_list_var_$13 = lexicon_accessors.preds_of_stringXword(string, word, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
                            SubLObject plural_pred = (SubLObject)morphology.NIL;
                            plural_pred = csome_list_var_$13.first();
                            while (morphology.NIL == ans && morphology.NIL != csome_list_var_$13) {
                                final SubLObject singular_pred = lexicon_accessors.singular_pred(lexicon_accessors.pos_of_pred(plural_pred));
                                if (morphology.NIL != singular_pred) {
                                    ans = lexicon_cache.first_string_of_wordXpred(word, singular_pred, (SubLObject)morphology.UNPROVIDED);
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
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)((morphology.NIL != ans) ? correct_capitalization(string, ans) : morphology.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 37545L)
    public static SubLObject has_word_for_string_and_pos(final SubLObject string, final SubLObject pos_keyword) {
        SubLObject word_units = (SubLObject)morphology.NIL;
        if (morphology.NIL == string_utilities.non_empty_string_p(string)) {
            return (SubLObject)morphology.NIL;
        }
        if (morphology.NIL == word_units) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = lexification_utilities.basic_preds_for_part_of_speech(pos_keyword), pred = (SubLObject)morphology.NIL, pred = csome_list_var.first(); morphology.NIL == word_units && morphology.NIL != csome_list_var; word_units = lexicon_accessors.words_of_stringXpred(string, pred, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED), csome_list_var = csome_list_var.rest(), pred = csome_list_var.first()) {}
        }
        return word_units;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 38083L)
    public static SubLObject has_word_for_string_and_pos_list(final SubLObject string, final SubLObject pos_keyword_list) {
        SubLObject has_mapping = (SubLObject)morphology.NIL;
        if (morphology.NIL == has_mapping) {
            SubLObject csome_list_var;
            SubLObject pos;
            for (csome_list_var = pos_keyword_list, pos = (SubLObject)morphology.NIL, pos = csome_list_var.first(); morphology.NIL == has_mapping && morphology.NIL != csome_list_var; has_mapping = has_word_for_string_and_pos(string, pos), csome_list_var = csome_list_var.rest(), pos = csome_list_var.first()) {}
        }
        return has_mapping;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 38446L)
    public static SubLObject is_word(final SubLObject string) {
        return lexicon_cache.words_of_string(string, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 38629L)
    public static SubLObject is_noun(final SubLObject string) {
        return has_word_for_string_and_pos_list(string, (SubLObject)morphology.$list111);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 38928L)
    public static SubLObject is_verb(final SubLObject string) {
        return has_word_for_string_and_pos(string, (SubLObject)morphology.$kw112$VERB);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 39206L)
    public static SubLObject is_noun_or_verb(final SubLObject string) {
        return has_word_for_string_and_pos_list(string, (SubLObject)morphology.$list113);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 39460L)
    public static SubLObject clear_find_stem_memoized() {
        final SubLObject cs = morphology.$find_stem_memoized_caching_state$.getGlobalValue();
        if (morphology.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 39460L)
    public static SubLObject remove_find_stem_memoized(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == morphology.UNPROVIDED) {
            pos_keyword = (SubLObject)morphology.$kw114$ANY;
        }
        return memoization_state.caching_state_remove_function_results_with_args(morphology.$find_stem_memoized_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(word, pos_keyword), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 39460L)
    public static SubLObject find_stem_memoized_internal(final SubLObject word, final SubLObject pos_keyword) {
        return find_stem(word, pos_keyword);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 39460L)
    public static SubLObject find_stem_memoized(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == morphology.UNPROVIDED) {
            pos_keyword = (SubLObject)morphology.$kw114$ANY;
        }
        SubLObject caching_state = morphology.$find_stem_memoized_caching_state$.getGlobalValue();
        if (morphology.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)morphology.$sym115$FIND_STEM_MEMOIZED, (SubLObject)morphology.$sym116$_FIND_STEM_MEMOIZED_CACHING_STATE_, (SubLObject)morphology.$int117$16384, (SubLObject)morphology.EQUAL, (SubLObject)morphology.TWO_INTEGER, (SubLObject)morphology.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)morphology.$sym118$CLEAR_FIND_STEM_MEMOIZED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word, pos_keyword);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)morphology.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)morphology.NIL;
            collision = cdolist_list_var.first();
            while (morphology.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (word.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (morphology.NIL != cached_args && morphology.NIL == cached_args.rest() && pos_keyword.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(find_stem_memoized_internal(word, pos_keyword)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(word, pos_keyword));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 39657L)
    public static SubLObject find_stem(final SubLObject string, SubLObject pos_keyword) {
        if (pos_keyword == morphology.UNPROVIDED) {
            pos_keyword = (SubLObject)morphology.$kw114$ANY;
        }
        SubLObject stem = (SubLObject)morphology.NIL;
        if (morphology.NIL == lexicon_accessors.closed_lexical_class_stringP(string, (SubLObject)morphology.UNPROVIDED)) {
            if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str119$ies, (SubLObject)morphology.UNPROVIDED)) {
                final SubLObject y_stem = string_utilities.post_fix(string_utilities.strip_trailer(string, (SubLObject)morphology.$str119$ies), (SubLObject)morphology.$str11$y);
                final SubLObject minus_s = string_utilities.strip_final(string, (SubLObject)morphology.UNPROVIDED);
                if (morphology.NIL != is_noun_or_verb(minus_s)) {
                    stem = minus_s;
                }
                else {
                    stem = y_stem;
                }
            }
            else if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str49$s, (SubLObject)morphology.UNPROVIDED)) {
                if (morphology.NIL == string_utilities.ends_with(string, (SubLObject)morphology.$str120$ss, (SubLObject)morphology.UNPROVIDED)) {
                    final SubLObject minus_s2 = string_utilities.strip_final(string, (SubLObject)morphology.UNPROVIDED);
                    final SubLObject minus_es = (SubLObject)((morphology.NIL != string_utilities.ends_with(minus_s2, (SubLObject)morphology.$str50$e, (SubLObject)morphology.UNPROVIDED)) ? string_utilities.strip_final(minus_s2, (SubLObject)morphology.UNPROVIDED) : morphology.NIL);
                    if (morphology.NIL != is_noun_or_verb(minus_s2)) {
                        stem = minus_s2;
                    }
                    else if (morphology.NIL != minus_es && morphology.NIL != is_noun_or_verb(minus_es)) {
                        stem = minus_es;
                    }
                    else if (morphology.NIL != minus_es) {
                        if (morphology.NIL == stem) {
                            SubLObject csome_list_var = (SubLObject)morphology.$list121;
                            SubLObject ending = (SubLObject)morphology.NIL;
                            ending = csome_list_var.first();
                            while (morphology.NIL == stem && morphology.NIL != csome_list_var) {
                                if (morphology.NIL != string_utilities.ends_with(minus_es, ending, (SubLObject)morphology.UNPROVIDED)) {
                                    stem = minus_es;
                                }
                                csome_list_var = csome_list_var.rest();
                                ending = csome_list_var.first();
                            }
                        }
                        if (morphology.NIL != string_utilities.ends_with(minus_es, (SubLObject)morphology.$str33$z, (SubLObject)morphology.UNPROVIDED)) {
                            final SubLObject minus_zes = string_utilities.strip_final(minus_es, (SubLObject)morphology.UNPROVIDED);
                            if (morphology.NIL != string_utilities.ends_with(minus_zes, (SubLObject)morphology.$str33$z, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != is_noun_or_verb(minus_zes)) {
                                stem = minus_zes;
                            }
                        }
                        if (morphology.NIL == stem) {
                            stem = minus_s2;
                        }
                    }
                }
            }
            else if ((pos_keyword == morphology.$kw114$ANY || pos_keyword == morphology.$kw112$VERB) && morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str60$ing, (SubLObject)morphology.UNPROVIDED)) {
                final SubLObject minus_ing = string_utilities.strip_trailer(string, (SubLObject)morphology.$str60$ing);
                final SubLObject minus_4 = string_utilities.strip_final(minus_ing, (SubLObject)morphology.UNPROVIDED);
                final SubLObject plus_e = string_utilities.post_fix(minus_ing, (SubLObject)morphology.$str50$e);
                SubLObject ordered_tests = (SubLObject)ConsesLow.list(minus_ing, plus_e);
                if (morphology.NIL != ends_with_doublerP(minus_ing)) {
                    if (morphology.NIL != string_utilities.ends_in_geminateP(minus_ing)) {
                        ordered_tests = (SubLObject)ConsesLow.cons(minus_4, ordered_tests);
                        ordered_tests = (SubLObject)ConsesLow.cons(minus_ing, ordered_tests);
                    }
                    if (morphology.NIL != ends_in_cvcP(minus_ing)) {
                        ordered_tests = (SubLObject)ConsesLow.cons(plus_e, ordered_tests);
                    }
                }
                if (morphology.NIL == stem) {
                    SubLObject csome_list_var2 = ordered_tests;
                    SubLObject verb_form = (SubLObject)morphology.NIL;
                    verb_form = csome_list_var2.first();
                    while (morphology.NIL == stem && morphology.NIL != csome_list_var2) {
                        if (morphology.NIL != is_verb(verb_form)) {
                            stem = verb_form;
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        verb_form = csome_list_var2.first();
                    }
                }
            }
            else if ((pos_keyword == morphology.$kw114$ANY || pos_keyword == morphology.$kw112$VERB) && morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str89$ed, (SubLObject)morphology.UNPROVIDED)) {
                final SubLObject minus_d = string_utilities.strip_final(string, (SubLObject)morphology.UNPROVIDED);
                final SubLObject minus_ed = string_utilities.strip_trailer(string, (SubLObject)morphology.$str89$ed);
                final SubLObject minus_5 = string_utilities.strip_final(minus_ed, (SubLObject)morphology.UNPROVIDED);
                if (morphology.NIL != is_verb(minus_d)) {
                    stem = minus_d;
                }
                if (morphology.NIL == stem && morphology.NIL != is_verb(minus_ed)) {
                    stem = minus_ed;
                }
                if (morphology.NIL == stem && morphology.NIL != is_word(string)) {
                    stem = string;
                }
                if (morphology.NIL == stem) {
                    if (morphology.NIL != ends_with_doublerP(minus_ed) && morphology.NIL != string_utilities.ends_in_geminateP(minus_ed)) {
                        stem = minus_5;
                    }
                    else {
                        stem = minus_d;
                    }
                }
            }
            else if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str33$z, (SubLObject)morphology.UNPROVIDED) && (morphology.NIL != is_noun(string_utilities.strip_trailer(string, (SubLObject)morphology.$str33$z)) || morphology.NIL != lexicon_accessors.denots_of_acronym_string(string_utilities.strip_trailer(string, (SubLObject)morphology.$str33$z), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED))) {
                stem = string_utilities.strip_trailer(string, (SubLObject)morphology.$str33$z);
            }
        }
        if (morphology.NIL == stem) {
            stem = string;
        }
        return stem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 42919L)
    public static SubLObject inflected_verb_to_infinitive(SubLObject string) {
        SubLObject stem = (SubLObject)morphology.NIL;
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str122$ied, (SubLObject)morphology.UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, (SubLObject)morphology.$str122$ied);
            string = string_utilities.post_fix(stem, (SubLObject)morphology.$str11$y);
            return string;
        }
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str119$ies, (SubLObject)morphology.UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, (SubLObject)morphology.$str119$ies);
            string = string_utilities.post_fix(stem, (SubLObject)morphology.$str11$y);
            return string;
        }
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str89$ed, (SubLObject)morphology.UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, (SubLObject)morphology.$str89$ed);
            if (morphology.NIL != string_utilities.ends_with(stem, (SubLObject)morphology.$str11$y, (SubLObject)morphology.UNPROVIDED)) {
                return stem;
            }
            if (morphology.NIL == string_utilities.ends_in_geminateP(stem)) {
                return stem;
            }
            if (morphology.NIL != string_utilities.ends_with(stem, (SubLObject)morphology.$str123$l, (SubLObject)morphology.UNPROVIDED)) {
                return stem;
            }
            return string_utilities.strip_final(stem, (SubLObject)morphology.UNPROVIDED);
        }
        else {
            if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str124$d, (SubLObject)morphology.UNPROVIDED)) {
                string = string_utilities.strip_trailer(string, (SubLObject)morphology.$str124$d);
            }
            if (morphology.NIL == string_utilities.ends_with(string, (SubLObject)morphology.$str60$ing, (SubLObject)morphology.UNPROVIDED)) {
                if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str49$s, (SubLObject)morphology.UNPROVIDED)) {
                    string = third_sg_verb_to_infinitive(string);
                }
                return string;
            }
            stem = string_utilities.strip_trailer(string, (SubLObject)morphology.$str60$ing);
            if (morphology.NIL != string_utilities.ends_in_geminateP(stem) && morphology.NIL == string_utilities.ends_with(stem, (SubLObject)morphology.$str123$l, (SubLObject)morphology.UNPROVIDED)) {
                return string_utilities.strip_final(stem, (SubLObject)morphology.UNPROVIDED);
            }
            return stem;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 44161L)
    public static SubLObject agentive_to_infinitive(final SubLObject string) {
        SubLObject stem = (SubLObject)morphology.NIL;
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str82$or, (SubLObject)morphology.UNPROVIDED)) {
            return string_utilities.strip_trailer(string, (SubLObject)morphology.$str82$or);
        }
        if (morphology.NIL == string_utilities.ends_with(string, (SubLObject)morphology.$str81$er, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.NIL;
        }
        stem = string_utilities.strip_trailer(string, (SubLObject)morphology.$str81$er);
        if (morphology.NIL != nl_trie_accessors.nl_trie_words_of_stringXpred(stem, morphology.$const94$infinitive, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
            return stem;
        }
        return string_utilities.strip_trailer(string, (SubLObject)morphology.$str125$r);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 44647L)
    public static SubLObject third_sg_verb_to_infinitive(final SubLObject string) {
        SubLObject stem = (SubLObject)morphology.NIL;
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str119$ies, (SubLObject)morphology.UNPROVIDED)) {
            stem = string_utilities.post_fix(string_utilities.strip_trailer(string, (SubLObject)morphology.$str119$ies), (SubLObject)morphology.$str11$y);
            return stem;
        }
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str126$es, (SubLObject)morphology.UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, (SubLObject)morphology.$str126$es);
            SubLObject cdolist_list_var = morphology.$sibilant_endings$.getGlobalValue();
            SubLObject ending = (SubLObject)morphology.NIL;
            ending = cdolist_list_var.first();
            while (morphology.NIL != cdolist_list_var) {
                if (morphology.NIL != string_utilities.ends_with(stem, ending, (SubLObject)morphology.UNPROVIDED)) {
                    return stem;
                }
                cdolist_list_var = cdolist_list_var.rest();
                ending = cdolist_list_var.first();
            }
        }
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str49$s, (SubLObject)morphology.UNPROVIDED) && morphology.NIL == string_utilities.ends_with(string, (SubLObject)morphology.$str120$ss, (SubLObject)morphology.UNPROVIDED)) {
            return string_utilities.strip_trailer(string, (SubLObject)morphology.$str49$s);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 45302L)
    public static SubLObject plural_noun_to_sg(final SubLObject string, SubLObject mt) {
        if (mt == morphology.UNPROVIDED) {
            mt = morphology.$const99$EnglishMt;
        }
        return singularize_string(string, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 45595L)
    public static SubLObject singular_reg(SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (morphology.NIL == morphology.$preserve_case_in_singular_regP$.getDynamicValue(thread)) {
            string = Strings.string_downcase(string, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
        }
        SubLObject stem = (SubLObject)morphology.NIL;
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str119$ies, (SubLObject)morphology.UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, (SubLObject)morphology.$str119$ies);
            string = string_utilities.post_fix(stem, (SubLObject)morphology.$str11$y);
            return string;
        }
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str126$es, (SubLObject)morphology.UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, (SubLObject)morphology.$str126$es);
            SubLObject cdolist_list_var = morphology.$sibilant_endings$.getGlobalValue();
            SubLObject ending = (SubLObject)morphology.NIL;
            ending = cdolist_list_var.first();
            while (morphology.NIL != cdolist_list_var) {
                if (morphology.NIL != string_utilities.ends_with(stem, ending, (SubLObject)morphology.UNPROVIDED)) {
                    string = stem;
                    return string;
                }
                cdolist_list_var = cdolist_list_var.rest();
                ending = cdolist_list_var.first();
            }
        }
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str128$us, (SubLObject)morphology.UNPROVIDED)) {
            if (string.equal((SubLObject)morphology.$str128$us)) {
                return string;
            }
            final SubLObject preceding_char = string_utilities.last_char(string_utilities.strip_trailer(string, (SubLObject)morphology.$str128$us));
            if (morphology.NIL != subl_promotions.memberP(preceding_char, (SubLObject)morphology.$list129, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED)) {
                return string;
            }
        }
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str49$s, (SubLObject)morphology.UNPROVIDED) && morphology.NIL == string_utilities.ends_with(string, (SubLObject)morphology.$str120$ss, (SubLObject)morphology.UNPROVIDED)) {
            string = string_utilities.strip_trailer(string, (SubLObject)morphology.$str49$s);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 46464L)
    public static SubLObject plural_nounP(final SubLObject string) {
        if (morphology.NIL == string_utilities.ends_with(string, (SubLObject)morphology.$str49$s, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.NIL;
        }
        final SubLObject stem = string_utilities.strip_final(string, (SubLObject)morphology.UNPROVIDED);
        if (morphology.NIL != string_utilities.ends_with(stem, (SubLObject)morphology.$str49$s, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.NIL;
        }
        if (morphology.NIL != string_utilities.ends_with(stem, (SubLObject)morphology.$str50$e, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.T;
        }
        SubLObject ends_with_sibilant = (SubLObject)morphology.NIL;
        if (morphology.NIL == ends_with_sibilant) {
            SubLObject csome_list_var;
            SubLObject ending;
            for (csome_list_var = (SubLObject)morphology.$list130, ending = (SubLObject)morphology.NIL, ending = csome_list_var.first(); morphology.NIL == ends_with_sibilant && morphology.NIL != csome_list_var; ends_with_sibilant = string_utilities.ends_with(stem, ending, (SubLObject)morphology.UNPROVIDED), csome_list_var = csome_list_var.rest(), ending = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL == ends_with_sibilant);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 47017L)
    public static SubLObject infinitive_verbP(final SubLObject string) {
        if (string.eql(inflected_verb_to_infinitive(string))) {
            return (SubLObject)morphology.T;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 47159L)
    public static SubLObject progressive_stringP(final SubLObject string) {
        if (morphology.NIL == string_utilities.ends_with(string, (SubLObject)morphology.$str60$ing, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.NIL;
        }
        final SubLObject root = find_stem(string, (SubLObject)morphology.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL == Strings.string_equal(root, string, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != lexicon_accessors.string_is_posP(root, morphology.$const131$Verb, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 47426L)
    public static SubLObject perfect_stringP(final SubLObject string) {
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str89$ed, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str132$en, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.T;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 47586L)
    public static SubLObject f_3sg_stringP(final SubLObject string) {
        return plural_nounP(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 47689L)
    public static SubLObject numberspp(final SubLObject string) {
        if (reader.read_from_string_ignoring_errors(string, (SubLObject)morphology.NIL, (SubLObject)morphology.NIL, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED).isNumber()) {
            return (SubLObject)morphology.T;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 47841L)
    public static SubLObject comparative_degreeP(final SubLObject string) {
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str81$er, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.T;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 47926L)
    public static SubLObject superlative_degreeP(final SubLObject string) {
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str92$est, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.T;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 48012L)
    public static SubLObject irregularP(final SubLObject wu, final SubLObject stem) {
        SubLObject cdolist_list_var;
        final SubLObject pos = cdolist_list_var = lexicon_accessors.pos_of_stringXword(stem, wu, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED);
        SubLObject pt = (SubLObject)morphology.NIL;
        pt = cdolist_list_var.first();
        while (morphology.NIL != cdolist_list_var) {
            if (pt.eql(morphology.$const133$CountNoun)) {
                return irregular_snP(wu);
            }
            if (pt.eql(morphology.$const131$Verb)) {
                return irregular_verbP(wu);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pt = cdolist_list_var.first();
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 48367L)
    public static SubLObject irregular_snP(final SubLObject wu) {
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != lexicon_utilities.noun_form_singular(wu, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != lexicon_utilities.noun_form_plural(wu, (SubLObject)morphology.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 48528L)
    public static SubLObject irregular_anP(final SubLObject wu) {
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != lexicon_utilities.ag_noun_form_singular(wu, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != lexicon_utilities.ag_noun_form_plural(wu, (SubLObject)morphology.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 48704L)
    public static SubLObject irregular_verbP(final SubLObject wu) {
        return (SubLObject)SubLObjectFactory.makeBoolean(morphology.NIL != lexicon_utilities.verb_form_infinitive(wu, (SubLObject)morphology.UNPROVIDED) && morphology.NIL != lexicon_utilities.verb_form_perfect(wu, (SubLObject)morphology.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 48870L)
    public static SubLObject pos_of_unknown_word(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject speech_parts = (SubLObject)morphology.NIL;
        if (morphology.NIL != numberspp(string)) {
            final SubLObject item_var = morphology.$const134$Number_SP;
            if (morphology.NIL == conses_high.member(item_var, speech_parts, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                speech_parts = (SubLObject)ConsesLow.cons(item_var, speech_parts);
            }
        }
        if (morphology.NIL != control_vars.$use_wn_linksP$.getGlobalValue()) {
            SubLObject cdolist_list_var;
            final SubLObject pos_keywords = cdolist_list_var = wordnet.pos_according_to_wn(string);
            SubLObject key = (SubLObject)morphology.NIL;
            key = cdolist_list_var.first();
            while (morphology.NIL != cdolist_list_var) {
                speech_parts = (SubLObject)ConsesLow.cons(conses_high.assoc(key, lexicon_vars.$wn_pos_cyc_pos_map$.getDynamicValue(thread), (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED).rest(), speech_parts);
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            }
        }
        if (morphology.NIL == speech_parts) {
            if (morphology.NIL != proper_nounp(string)) {
                final SubLObject item_var = morphology.$const135$ProperCountNoun;
                if (morphology.NIL == conses_high.member(item_var, speech_parts, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                    speech_parts = (SubLObject)ConsesLow.cons(item_var, speech_parts);
                }
            }
            if (morphology.NIL != nounp(string)) {
                final SubLObject item_var = morphology.$const133$CountNoun;
                if (morphology.NIL == conses_high.member(item_var, speech_parts, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                    speech_parts = (SubLObject)ConsesLow.cons(item_var, speech_parts);
                }
            }
            if (morphology.NIL != adjectivep(string)) {
                final SubLObject item_var = morphology.$const136$Adjective;
                if (morphology.NIL == conses_high.member(item_var, speech_parts, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                    speech_parts = (SubLObject)ConsesLow.cons(item_var, speech_parts);
                }
            }
            if (morphology.NIL != verbp(string)) {
                final SubLObject item_var = morphology.$const131$Verb;
                if (morphology.NIL == conses_high.member(item_var, speech_parts, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                    speech_parts = (SubLObject)ConsesLow.cons(item_var, speech_parts);
                }
            }
            if (morphology.NIL != adverbp(string)) {
                final SubLObject item_var = morphology.$const137$Adverb;
                if (morphology.NIL == conses_high.member(item_var, speech_parts, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                    speech_parts = (SubLObject)ConsesLow.cons(item_var, speech_parts);
                }
            }
            if (morphology.NIL == speech_parts) {
                SubLObject item_var = morphology.$const131$Verb;
                if (morphology.NIL == conses_high.member(item_var, speech_parts, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                    speech_parts = (SubLObject)ConsesLow.cons(item_var, speech_parts);
                }
                item_var = morphology.$const136$Adjective;
                if (morphology.NIL == conses_high.member(item_var, speech_parts, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                    speech_parts = (SubLObject)ConsesLow.cons(item_var, speech_parts);
                }
                item_var = morphology.$const133$CountNoun;
                if (morphology.NIL == conses_high.member(item_var, speech_parts, Symbols.symbol_function((SubLObject)morphology.EQL), Symbols.symbol_function((SubLObject)morphology.IDENTITY))) {
                    speech_parts = (SubLObject)ConsesLow.cons(item_var, speech_parts);
                }
            }
        }
        return speech_parts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 50048L)
    public static SubLObject proper_nounp(final SubLObject string) {
        if (Sequences.length(string).numG((SubLObject)morphology.ZERO_INTEGER) && morphology.NIL != Characters.upper_case_p(Strings.sublisp_char(string, (SubLObject)morphology.ZERO_INTEGER))) {
            return (SubLObject)morphology.T;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 50199L)
    public static SubLObject verbp(final SubLObject string) {
        SubLObject string_1 = (SubLObject)morphology.NIL;
        string_1 = inflected_verb_to_infinitive(string);
        if (morphology.NIL != string_utilities.ends_with(string_1, (SubLObject)morphology.$str88$ate, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string_1, (SubLObject)morphology.$str78$ize, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string_1, (SubLObject)morphology.$str138$yze, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string_1, (SubLObject)morphology.$str139$ify, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string_1, (SubLObject)morphology.$str132$en, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str60$ing, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str89$ed, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.T;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 50552L)
    public static SubLObject nounp(SubLObject string) {
        string = plural_noun_to_sg(string, (SubLObject)morphology.UNPROVIDED);
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str140$logy, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str141$ette, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str142$ess, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str143$eer, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str55$ity, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str144$omy, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str51$ion, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str63$ist, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str145$ics, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str146$geny, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str147$ium, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str148$cracy, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str62$ism, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str149$itis, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str150$oma, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str151$lysis, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str152$hood, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str153$ship, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str154$lty, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str155$meter, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str156$morph, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str157$morphy, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str158$osis, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str159$stery, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str160$ence, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str161$tude, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str162$ance, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str163$graphy, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str164$ment, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str165$age, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str166$dom, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str167$ery, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str168$ite, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str143$eer, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str169$let, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str170$ling, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str171$ster, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str172$ant, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str173$ee, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str55$ity, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str174$ese, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str175$an, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.T;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 52035L)
    public static SubLObject adjectivep(final SubLObject string) {
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str176$ical, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str177$ous, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str178$less, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str179$ier, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str92$est, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str65$ive, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str180$nant, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str181$thic, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str72$ible, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str71$able, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str182$etic, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str183$itic, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str184$ful, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str185$ish, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str186$like, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str11$y, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str187$ial, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str188$esque, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str189$ic, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.T;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 52730L)
    public static SubLObject adverbp(final SubLObject string) {
        if (morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str12$ly, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str190$wise, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str191$ward, (SubLObject)morphology.UNPROVIDED) || morphology.NIL != string_utilities.ends_with(string, (SubLObject)morphology.$str192$wards, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.T;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 53098L)
    public static SubLObject pos_keyword_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.member(v_object, morphology.$pos_keywords$.getDynamicValue(thread), (SubLObject)morphology.EQL, (SubLObject)morphology.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 53259L)
    public static SubLObject root_predicate(final SubLObject pos) {
        if (pos.eql((SubLObject)morphology.$kw194$PROPER_NOUN)) {
            return morphology.$const195$pnSingular;
        }
        if (pos.eql((SubLObject)morphology.$kw196$NOUN)) {
            return morphology.$const98$singular;
        }
        if (pos.eql((SubLObject)morphology.$kw112$VERB)) {
            return morphology.$const94$infinitive;
        }
        if (pos.eql((SubLObject)morphology.$kw197$ADJECTIVE)) {
            return morphology.$const198$regularDegree;
        }
        if (pos.eql((SubLObject)morphology.$kw199$ADVERB)) {
            return morphology.$const200$regularAdverb;
        }
        if (pos.eql((SubLObject)morphology.$kw201$PREPOSITION)) {
            return morphology.$const202$prepositionStrings;
        }
        return (SubLObject)morphology.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 53635L)
    public static SubLObject get_root_of_head(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == morphology.UNPROVIDED) {
            pos_keyword = (SubLObject)morphology.NIL;
        }
        if (morphology.NIL != Strings.string_equal(word, (SubLObject)morphology.$str104$_s, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED) && (morphology.NIL == pos_keyword || pos_keyword.eql((SubLObject)morphology.$kw112$VERB))) {
            return (SubLObject)morphology.$str203$be;
        }
        return get_root(word, pos_keyword);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 54302L)
    public static SubLObject get_root(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == morphology.UNPROVIDED) {
            pos_keyword = (SubLObject)morphology.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert morphology.NIL != Types.stringp(word) : word;
        if (morphology.NIL != pos_keyword && !morphology.assertionsDisabledInClass && morphology.NIL == pos_keyword_p(pos_keyword)) {
            throw new AssertionError(pos_keyword);
        }
        final SubLObject pos_keywords = (SubLObject)((morphology.NIL != pos_keyword) ? ConsesLow.list(pos_keyword) : morphology.$pos_keywords$.getDynamicValue(thread));
        SubLObject wu = (SubLObject)morphology.NIL;
        SubLObject assertion = (SubLObject)morphology.NIL;
        if (morphology.NIL == wu) {
            SubLObject csome_list_var;
            SubLObject pos;
            SubLObject expanded_wu;
            for (csome_list_var = pos_keywords, pos = (SubLObject)morphology.NIL, pos = csome_list_var.first(); morphology.NIL == wu && morphology.NIL != csome_list_var; wu = lexicon_accessors.words_of_stringXpos(word, pos, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED, (SubLObject)morphology.UNPROVIDED).first(), expanded_wu = expand_contracted_root(wu), wu = ((morphology.NIL != expanded_wu) ? expanded_wu : wu), assertion = (SubLObject)((morphology.NIL != wu) ? kb_mapping.gather_gaf_arg_index(wu, (SubLObject)morphology.ONE_INTEGER, root_predicate(pos), morphology.$const206$GeneralEnglishMt, (SubLObject)morphology.UNPROVIDED).first() : morphology.NIL), csome_list_var = csome_list_var.rest(), pos = csome_list_var.first()) {}
        }
        if (morphology.NIL != assertion) {
            return assertions_high.gaf_arg2(assertion);
        }
        SubLObject root = (SubLObject)morphology.NIL;
        if (morphology.NIL == root) {
            SubLObject csome_list_var2;
            SubLObject pos2;
            for (csome_list_var2 = pos_keywords, pos2 = (SubLObject)morphology.NIL, pos2 = csome_list_var2.first(); morphology.NIL == root && morphology.NIL != csome_list_var2; root = find_stem(word, pos2), csome_list_var2 = csome_list_var2.rest(), pos2 = csome_list_var2.first()) {}
        }
        return root;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/morphology.lisp", position = 55349L)
    public static SubLObject expand_contracted_root(final SubLObject wu) {
        if (morphology.NIL == lexicon_accessors.quick_lexical_wordP(wu, (SubLObject)morphology.UNPROVIDED)) {
            return (SubLObject)morphology.NIL;
        }
        if (wu.eql(morphology.$const207$Be_Contracted)) {
            return morphology.$const208$Be_TheWord;
        }
        if (wu.eql(morphology.$const209$Will_Contracted)) {
            return morphology.$const210$Will_TheModal;
        }
        if (wu.eql(morphology.$const211$Have_Contracted)) {
            return morphology.$const212$Have_TheWord;
        }
        if (wu.eql(morphology.$const213$Would_Contracted)) {
            return morphology.$const214$Would_TheWord;
        }
        return (SubLObject)morphology.NIL;
    }
    
    public static SubLObject declare_morphology_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "get_vowel_positions", "GET-VOWEL-POSITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "estimated_syllable_count", "ESTIMATED-SYLLABLE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "monosyllabicP", "MONOSYLLABIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "polysyllabicP", "POLYSYLLABIC?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "vowel_charP", "VOWEL-CHAR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "consonant_charP", "CONSONANT-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "get_consonant_positions", "GET-CONSONANT-POSITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "ends_with_vowelP", "ENDS-WITH-VOWEL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "starts_with_vowelP", "STARTS-WITH-VOWEL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "ends_with_consonantP", "ENDS-WITH-CONSONANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "starts_with_consonantP", "STARTS-WITH-CONSONANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "single_c_codaP", "SINGLE-C-CODA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "ends_with_doublerP", "ENDS-WITH-DOUBLER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "starts_with_unstressed_pfxP", "STARTS-WITH-UNSTRESSED-PFX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "ends_in_cvcP", "ENDS-IN-CVC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "ends_in_quvcP", "ENDS-IN-QUVC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "make_geminate", "MAKE-GEMINATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "geminate_last", "GEMINATE-LAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "correct_capitalization", "CORRECT-CAPITALIZATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "regular_string_function", "REGULAR-STRING-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "pos_preds_derivable_from_pred", "POS-PREDS-DERIVABLE-FROM-PRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "clear_pos_preds_derivable_from_pred_int", "CLEAR-POS-PREDS-DERIVABLE-FROM-PRED-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "remove_pos_preds_derivable_from_pred_int", "REMOVE-POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "pos_preds_derivable_from_pred_int_internal", "POS-PREDS-DERIVABLE-FROM-PRED-INT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "pos_preds_derivable_from_pred_int", "POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "singular_form_for_pred", "SINGULAR-FORM-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "plural_predP", "PLURAL-PRED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "singular_predP", "SINGULAR-PRED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "generate_z_form", "GENERATE-Z-FORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "suffix_rules_for_pred", "SUFFIX-RULES-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "generate_regular_string_from_form", "GENERATE-REGULAR-STRING-FROM-FORM", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "generate_regular_strings_from_form", "GENERATE-REGULAR-STRINGS-FROM-FORM", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "generate_regular_strings_from_form_int", "GENERATE-REGULAR-STRINGS-FROM-FORM-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "add_english_suffix", "ADD-ENGLISH-SUFFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_do_orthographic_changes", "AES-DO-ORTHOGRAPHIC-CHANGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_do_orthographic_change_fns", "AES-DO-ORTHOGRAPHIC-CHANGE-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_do_orthographic_change", "AES-DO-ORTHOGRAPHIC-CHANGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "ends_with_sibilantP", "ENDS-WITH-SIBILANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_add_e_before_s", "AES-ADD-E-BEFORE-S", 2, 0, false);
        new $aes_add_e_before_s$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_ion_to_ation", "AES-ION-TO-ATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_change_y_to_i", "AES-CHANGE-Y-TO-I", 2, 0, false);
        new $aes_change_y_to_i$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_ble_to_bil_before_ity", "AES-BLE-TO-BIL-BEFORE-ITY", 2, 0, false);
        new $aes_ble_to_bil_before_ity$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_change_aic_to_ac", "AES-CHANGE-AIC-TO-AC", 2, 0, false);
        new $aes_change_aic_to_ac$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_strip_final_e", "AES-STRIP-FINAL-E", 2, 0, false);
        new $aes_strip_final_e$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_strip_final_vowels_before_ic", "AES-STRIP-FINAL-VOWELS-BEFORE-IC", 2, 0, false);
        new $aes_strip_final_vowels_before_ic$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_change_ie_to_y", "AES-CHANGE-IE-TO-Y", 2, 0, false);
        new $aes_change_ie_to_y$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_change_ism_to_ist", "AES-CHANGE-ISM-TO-IST", 2, 0, false);
        new $aes_change_ism_to_ist$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_change_ceive_to_cept", "AES-CHANGE-CEIVE-TO-CEPT", 2, 0, false);
        new $aes_change_ceive_to_cept$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_change_vert_to_vers", "AES-CHANGE-VERT-TO-VERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_change_duce_to_duct", "AES-CHANGE-DUCE-TO-DUCT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_remove_able_le_before_ly", "AES-REMOVE-ABLE-LE-BEFORE-LY", 2, 0, false);
        new $aes_remove_able_le_before_ly$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_de_to_se", "AES-DE-TO-SE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_geminate_last", "AES-GEMINATE-LAST", 2, 0, false);
        new $aes_geminate_last$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "dont_geminate_beforeP", "DONT-GEMINATE-BEFORE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "aes_able_to_ate", "AES-ABLE-TO-ATE", 2, 0, false);
        new $aes_able_to_ate$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "try_regular_adj_morphologyP", "TRY-REGULAR-ADJ-MORPHOLOGY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "most_form", "MOST-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "more_form", "MORE-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "most_form_p", "MOST-FORM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "more_form_p", "MORE-FORM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "more_or_most_form", "MORE-OR-MOST-FORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "more_or_most_form_p", "MORE-OR-MOST-FORM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "comparative_reg", "COMPARATIVE-REG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "comparative_adverb_reg", "COMPARATIVE-ADVERB-REG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "superlative_reg", "SUPERLATIVE-REG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "superlative_adverb_reg", "SUPERLATIVE-ADVERB-REG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "past_tense_reg", "PAST-TENSE-REG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "gerund_reg", "GERUND-REG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "third_sg_reg", "THIRD-SG-REG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "plural_reg", "PLURAL-REG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "pn_plural_reg", "PN-PLURAL-REG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "infinitive_to_third_sing", "INFINITIVE-TO-THIRD-SING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "infinitive_to_pres_participle", "INFINITIVE-TO-PRES-PARTICIPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "possessivize_string", "POSSESSIVIZE-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "english_lexical_possessive_version_of_string", "ENGLISH-LEXICAL-POSSESSIVE-VERSION-OF-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "english_possessive_suffix_for_string", "ENGLISH-POSSESSIVE-SUFFIX-FOR-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "locativize_string", "LOCATIVIZE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "not_locativizable_english_stringP", "NOT-LOCATIVIZABLE-ENGLISH-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "english_locative_preposition_for_denot", "ENGLISH-LOCATIVE-PREPOSITION-FOR-DENOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "pluralize_string", "PLURALIZE-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "pluralize_string_wXlexicon", "PLURALIZE-STRING-W/LEXICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "singularize_string", "SINGULARIZE-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "singularize_string_wXlexicon", "SINGULARIZE-STRING-W/LEXICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "has_word_for_string_and_pos", "HAS-WORD-FOR-STRING-AND-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "has_word_for_string_and_pos_list", "HAS-WORD-FOR-STRING-AND-POS-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "is_word", "IS-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "is_noun", "IS-NOUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "is_verb", "IS-VERB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "is_noun_or_verb", "IS-NOUN-OR-VERB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "clear_find_stem_memoized", "CLEAR-FIND-STEM-MEMOIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "remove_find_stem_memoized", "REMOVE-FIND-STEM-MEMOIZED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "find_stem_memoized_internal", "FIND-STEM-MEMOIZED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "find_stem_memoized", "FIND-STEM-MEMOIZED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "find_stem", "FIND-STEM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "inflected_verb_to_infinitive", "INFLECTED-VERB-TO-INFINITIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "agentive_to_infinitive", "AGENTIVE-TO-INFINITIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "third_sg_verb_to_infinitive", "THIRD-SG-VERB-TO-INFINITIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "plural_noun_to_sg", "PLURAL-NOUN-TO-SG", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "singular_reg", "SINGULAR-REG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "plural_nounP", "PLURAL-NOUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "infinitive_verbP", "INFINITIVE-VERB?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "progressive_stringP", "PROGRESSIVE-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "perfect_stringP", "PERFECT-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "f_3sg_stringP", "3SG-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "numberspp", "NUMBERSPP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "comparative_degreeP", "COMPARATIVE-DEGREE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "superlative_degreeP", "SUPERLATIVE-DEGREE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "irregularP", "IRREGULAR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "irregular_snP", "IRREGULAR-SN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "irregular_anP", "IRREGULAR-AN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "irregular_verbP", "IRREGULAR-VERB?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "pos_of_unknown_word", "POS-OF-UNKNOWN-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "proper_nounp", "PROPER-NOUNP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "verbp", "VERBP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "nounp", "NOUNP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "adjectivep", "ADJECTIVEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "adverbp", "ADVERBP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "pos_keyword_p", "POS-KEYWORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "root_predicate", "ROOT-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "get_root_of_head", "GET-ROOT-OF-HEAD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "get_root", "GET-ROOT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.morphology", "expand_contracted_root", "EXPAND-CONTRACTED-ROOT", 1, 0, false);
        return (SubLObject)morphology.NIL;
    }
    
    public static SubLObject init_morphology_file() {
        morphology.$vowels$ = SubLFiles.defconstant("*VOWELS*", (SubLObject)morphology.$str3$aeiou);
        morphology.$bigraph_vowels$ = SubLFiles.defconstant("*BIGRAPH-VOWELS*", (SubLObject)morphology.$list4);
        morphology.$sibilant_endings$ = SubLFiles.defconstant("*SIBILANT-ENDINGS*", (SubLObject)morphology.$list5);
        morphology.$consonants$ = SubLFiles.defconstant("*CONSONANTS*", (SubLObject)morphology.$str6$bcdfghjklmnprstvxz);
        morphology.$doublers$ = SubLFiles.defconstant("*DOUBLERS*", (SubLObject)morphology.$str7$bdfgklmnprtvz);
        morphology.$unstressed_latin_pfxs$ = SubLFiles.defconstant("*UNSTRESSED-LATIN-PFXS*", (SubLObject)morphology.$list8);
        morphology.$special_ate_cases$ = SubLFiles.defconstant("*SPECIAL-ATE-CASES*", (SubLObject)morphology.$list9);
        morphology.$liquids$ = SubLFiles.defconstant("*LIQUIDS*", (SubLObject)morphology.$list10);
        morphology.$vowelsX_plus_y$ = SubLFiles.defconstant("*VOWELS*-PLUS-Y*", Sequences.cconcatenate(morphology.$vowels$.getGlobalValue(), (SubLObject)morphology.$str11$y));
        morphology.$pos_preds_derivable_from_pred_int_caching_state$ = SubLFiles.deflexical("*POS-PREDS-DERIVABLE-FROM-PRED-INT-CACHING-STATE*", (SubLObject)morphology.NIL);
        morphology.$aes_do_orthographic_change_fns$ = SubLFiles.deflexical("*AES-DO-ORTHOGRAPHIC-CHANGE-FNS*", (SubLObject)morphology.$list46);
        morphology.$comparative_syllable_cutoff$ = SubLFiles.deflexical("*COMPARATIVE-SYLLABLE-CUTOFF*", (SubLObject)morphology.TWO_INTEGER);
        morphology.$more_prefix$ = SubLFiles.defconstant("*MORE-PREFIX*", (SubLObject)morphology.$str90$more_);
        morphology.$most_prefix$ = SubLFiles.defconstant("*MOST-PREFIX*", (SubLObject)morphology.$str91$most_);
        morphology.$english_possessive_pronouns$ = SubLFiles.defconstant("*ENGLISH-POSSESSIVE-PRONOUNS*", (SubLObject)morphology.$list101);
        morphology.$find_stem_memoized_caching_state$ = SubLFiles.deflexical("*FIND-STEM-MEMOIZED-CACHING-STATE*", (SubLObject)morphology.NIL);
        morphology.$preserve_case_in_singular_regP$ = SubLFiles.defparameter("*PRESERVE-CASE-IN-SINGULAR-REG?*", (SubLObject)morphology.NIL);
        morphology.$pos_keywords$ = SubLFiles.defparameter("*POS-KEYWORDS*", (SubLObject)morphology.$list193);
        return (SubLObject)morphology.NIL;
    }
    
    public static SubLObject setup_morphology_file() {
        lexicon_vars.$morphology_code_revision$.setGlobalValue((SubLObject)morphology.$str0$_Revision__149757__);
        lexicon_vars.declare_noop_updates_for_lexicon_global((SubLObject)morphology.$sym1$_MORPHOLOGY_CODE_REVISION_, (SubLObject)morphology.$list2);
        memoization_state.note_globally_cached_function((SubLObject)morphology.$sym25$POS_PREDS_DERIVABLE_FROM_PRED_INT);
        memoization_state.note_globally_cached_function((SubLObject)morphology.$sym115$FIND_STEM_MEMOIZED);
        access_macros.register_external_symbol((SubLObject)morphology.$sym127$PLURAL_NOUN_TO_SG);
        return (SubLObject)morphology.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_morphology_file();
    }
    
    @Override
	public void initializeVariables() {
        init_morphology_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_morphology_file();
    }
    
    static {
        me = (SubLFile)new morphology();
        morphology.$vowels$ = null;
        morphology.$bigraph_vowels$ = null;
        morphology.$sibilant_endings$ = null;
        morphology.$consonants$ = null;
        morphology.$doublers$ = null;
        morphology.$unstressed_latin_pfxs$ = null;
        morphology.$special_ate_cases$ = null;
        morphology.$liquids$ = null;
        morphology.$vowelsX_plus_y$ = null;
        morphology.$pos_preds_derivable_from_pred_int_caching_state$ = null;
        morphology.$aes_do_orthographic_change_fns$ = null;
        morphology.$comparative_syllable_cutoff$ = null;
        morphology.$more_prefix$ = null;
        morphology.$most_prefix$ = null;
        morphology.$english_possessive_pronouns$ = null;
        morphology.$find_stem_memoized_caching_state$ = null;
        morphology.$preserve_case_in_singular_regP$ = null;
        morphology.$pos_keywords$ = null;
        $str0$_Revision__149757__ = SubLObjectFactory.makeString("$Revision: 149757 $");
        $sym1$_MORPHOLOGY_CODE_REVISION_ = SubLObjectFactory.makeSymbol("*MORPHOLOGY-CODE-REVISION*");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.137"), (SubLObject)SubLObjectFactory.makeString("1.138")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.138"), (SubLObject)SubLObjectFactory.makeString("1.139")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.139"), (SubLObject)SubLObjectFactory.makeString("1.140")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.140"), (SubLObject)SubLObjectFactory.makeString("1.141")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.141"), (SubLObject)SubLObjectFactory.makeString("1.142")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.142"), (SubLObject)SubLObjectFactory.makeString("1.143")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.143"), (SubLObject)SubLObjectFactory.makeString("1.144")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.145"), (SubLObject)SubLObjectFactory.makeString("1.146")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.146"), (SubLObject)SubLObjectFactory.makeString("1.147")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.147"), (SubLObject)SubLObjectFactory.makeString("1.148")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.148"), (SubLObject)SubLObjectFactory.makeString("1.149")), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.149"), (SubLObject)SubLObjectFactory.makeString("1.150")) });
        $str3$aeiou = SubLObjectFactory.makeString("aeiou");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("ai"), SubLObjectFactory.makeString("au"), SubLObjectFactory.makeString("ay"), SubLObjectFactory.makeString("ea"), SubLObjectFactory.makeString("ee"), SubLObjectFactory.makeString("ei"), SubLObjectFactory.makeString("eu"), SubLObjectFactory.makeString("ie"), SubLObjectFactory.makeString("io"), SubLObjectFactory.makeString("oa"), SubLObjectFactory.makeString("oi"), SubLObjectFactory.makeString("oo"), SubLObjectFactory.makeString("ou"), SubLObjectFactory.makeString("ow"), SubLObjectFactory.makeString("oy"), SubLObjectFactory.makeString("ui") });
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ss"), (SubLObject)SubLObjectFactory.makeString("x"), (SubLObject)SubLObjectFactory.makeString("sh"), (SubLObject)SubLObjectFactory.makeString("ch"), (SubLObject)SubLObjectFactory.makeString("z"), (SubLObject)SubLObjectFactory.makeString("s"));
        $str6$bcdfghjklmnprstvxz = SubLObjectFactory.makeString("bcdfghjklmnprstvxz");
        $str7$bdfgklmnprtvz = SubLObjectFactory.makeString("bdfgklmnprtvz");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("re"), (SubLObject)SubLObjectFactory.makeString("de"), (SubLObject)SubLObjectFactory.makeString("dis"), (SubLObject)SubLObjectFactory.makeString("mis"), (SubLObject)SubLObjectFactory.makeString("un"), (SubLObject)SubLObjectFactory.makeString("in"), (SubLObject)SubLObjectFactory.makeString("ex"));
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("evaporate"), SubLObjectFactory.makeString("appreciate"), SubLObjectFactory.makeString("associate"), SubLObjectFactory.makeString("accommodate"), SubLObjectFactory.makeString("affiliate"), SubLObjectFactory.makeString("applicate"), SubLObjectFactory.makeString("navigate"), SubLObjectFactory.makeString("calculate"), SubLObjectFactory.makeString("abdicate"), SubLObjectFactory.makeString("estimate"), SubLObjectFactory.makeString("emulate"), SubLObjectFactory.makeString("educate") });
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("l"), (SubLObject)SubLObjectFactory.makeString("r"));
        $str11$y = SubLObjectFactory.makeString("y");
        $str12$ly = SubLObjectFactory.makeString("ly");
        $str13$qw = SubLObjectFactory.makeString("qw");
        $str14$q = SubLObjectFactory.makeString("q");
        $str15$u = SubLObjectFactory.makeString("u");
        $const16$comparativeDegree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeDegree"));
        $sym17$COMPARATIVE_REG = SubLObjectFactory.makeSymbol("COMPARATIVE-REG");
        $const18$superlativeDegree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeDegree"));
        $sym19$SUPERLATIVE_REG = SubLObjectFactory.makeSymbol("SUPERLATIVE-REG");
        $const20$comparativeAdverb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeAdverb"));
        $sym21$COMPARATIVE_ADVERB_REG = SubLObjectFactory.makeSymbol("COMPARATIVE-ADVERB-REG");
        $const22$superlativeAdverb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeAdverb"));
        $sym23$SUPERLATIVE_ADVERB_REG = SubLObjectFactory.makeSymbol("SUPERLATIVE-ADVERB-REG");
        $sym24$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym25$POS_PREDS_DERIVABLE_FROM_PRED_INT = SubLObjectFactory.makeSymbol("POS-PREDS-DERIVABLE-FROM-PRED-INT");
        $sym26$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $const27$regularSuffix = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularSuffix"));
        $sym28$_POS_PREDS_DERIVABLE_FROM_PRED_INT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*POS-PREDS-DERIVABLE-FROM-PRED-INT-CACHING-STATE*");
        $int29$256 = SubLObjectFactory.makeInteger(256);
        $const30$plural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $const31$singular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $list32 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnPlural")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Pl")));
        $str33$z = SubLObjectFactory.makeString("z");
        $const34$EnglishLexiconMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishLexiconMt"));
        $list35 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularDegree")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularAdverb")));
        $list36 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeDegree")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeDegree")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeAdverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeAdverb")));
        $sym37$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const38$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-BASE-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SUFFIX"));
        $sym40$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const41$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym42$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
        $sym43$CYCL_STRING_P = SubLObjectFactory.makeSymbol("CYCL-STRING-P");
        $str44$ = SubLObjectFactory.makeString("");
        $list45 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CHANGE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $list46 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-CHANGE-Y-TO-I"), (SubLObject)SubLObjectFactory.makeKeyword("BOTH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-ABLE-TO-ATE"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-GEMINATE-LAST"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-DE-TO-SE"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-BLE-TO-BIL-BEFORE-ITY"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-CHANGE-CEIVE-TO-CEPT"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-CHANGE-VERT-TO-VERS"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-CHANGE-DUCE-TO-DUCT"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-CHANGE-AIC-TO-AC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-ION-TO-ATION"), (SubLObject)SubLObjectFactory.makeKeyword("SUFFIX")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-STRIP-FINAL-E"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-STRIP-FINAL-VOWELS-BEFORE-IC"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-CHANGE-IE-TO-Y"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-CHANGE-ISM-TO-IST"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-REMOVE-ABLE-LE-BEFORE-LY"), (SubLObject)SubLObjectFactory.makeKeyword("BASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AES-ADD-E-BEFORE-S"), (SubLObject)SubLObjectFactory.makeKeyword("SUFFIX")) });
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOTH"), (SubLObject)SubLObjectFactory.makeKeyword("BASE"));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOTH"), (SubLObject)SubLObjectFactory.makeKeyword("SUFFIX"));
        $str49$s = SubLObjectFactory.makeString("s");
        $str50$e = SubLObjectFactory.makeString("e");
        $str51$ion = SubLObjectFactory.makeString("ion");
        $list52 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("port"), SubLObjectFactory.makeString("apt"), SubLObjectFactory.makeString("cit"), SubLObjectFactory.makeString("cite"), SubLObjectFactory.makeString("est"), SubLObjectFactory.makeString("ant"), SubLObjectFactory.makeString("ment"), SubLObjectFactory.makeString("ient"), SubLObjectFactory.makeString("ont"), SubLObjectFactory.makeString("pute"), SubLObjectFactory.makeString("esent"), SubLObjectFactory.makeString("note"), SubLObjectFactory.makeString("mute"), SubLObjectFactory.makeString("et") });
        $str53$ation = SubLObjectFactory.makeString("ation");
        $str54$i = SubLObjectFactory.makeString("i");
        $str55$ity = SubLObjectFactory.makeString("ity");
        $str56$ble = SubLObjectFactory.makeString("ble");
        $str57$il = SubLObjectFactory.makeString("il");
        $str58$at = SubLObjectFactory.makeString("at");
        $str59$ai = SubLObjectFactory.makeString("ai");
        $str60$ing = SubLObjectFactory.makeString("ing");
        $str61$ie = SubLObjectFactory.makeString("ie");
        $str62$ism = SubLObjectFactory.makeString("ism");
        $str63$ist = SubLObjectFactory.makeString("ist");
        $str64$ceive = SubLObjectFactory.makeString("ceive");
        $str65$ive = SubLObjectFactory.makeString("ive");
        $str66$pt = SubLObjectFactory.makeString("pt");
        $str67$vert = SubLObjectFactory.makeString("vert");
        $str68$vers = SubLObjectFactory.makeString("vers");
        $str69$duce = SubLObjectFactory.makeString("duce");
        $str70$t = SubLObjectFactory.makeString("t");
        $str71$able = SubLObjectFactory.makeString("able");
        $str72$ible = SubLObjectFactory.makeString("ible");
        $str73$le = SubLObjectFactory.makeString("le");
        $str74$de = SubLObjectFactory.makeString("de");
        $str75$is = SubLObjectFactory.makeString("is");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ing"), (SubLObject)SubLObjectFactory.makeString("ity"));
        $str77$se = SubLObjectFactory.makeString("se");
        $str78$ize = SubLObjectFactory.makeString("ize");
        $str79$ise = SubLObjectFactory.makeString("ise");
        $str80$al = SubLObjectFactory.makeString("al");
        $str81$er = SubLObjectFactory.makeString("er");
        $str82$or = SubLObjectFactory.makeString("or");
        $str83$fer = SubLObjectFactory.makeString("fer");
        $str84$ffer = SubLObjectFactory.makeString("ffer");
        $str85$id = SubLObjectFactory.makeString("id");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("n"), (SubLObject)SubLObjectFactory.makeString("l"), (SubLObject)SubLObjectFactory.makeString("t"));
        $str87$alicious = SubLObjectFactory.makeString("alicious");
        $str88$ate = SubLObjectFactory.makeString("ate");
        $str89$ed = SubLObjectFactory.makeString("ed");
        $str90$more_ = SubLObjectFactory.makeString("more ");
        $str91$most_ = SubLObjectFactory.makeString("most ");
        $str92$est = SubLObjectFactory.makeString("est");
        $const93$pastTense_Universal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pastTense-Universal"));
        $const94$infinitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive"));
        $const95$gerund = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund"));
        $const96$thirdPersonSg_Present = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present"));
        $const97$plural = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural"));
        $const98$singular = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"));
        $const99$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $const100$presentParticiple = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentParticiple"));
        $list101 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("I"), (SubLObject)SubLObjectFactory.makeString("my")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("me"), (SubLObject)SubLObjectFactory.makeString("my")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("you"), (SubLObject)SubLObjectFactory.makeString("your")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("he"), (SubLObject)SubLObjectFactory.makeString("his")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("him"), (SubLObject)SubLObjectFactory.makeString("his")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("him or her"), (SubLObject)SubLObjectFactory.makeString("his or her")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("he or she"), (SubLObject)SubLObjectFactory.makeString("his or her")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("she"), (SubLObject)SubLObjectFactory.makeString("her")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("her"), (SubLObject)SubLObjectFactory.makeString("her")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("it"), (SubLObject)SubLObjectFactory.makeString("its")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("we"), (SubLObject)SubLObjectFactory.makeString("our")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("us"), (SubLObject)SubLObjectFactory.makeString("our")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("they"), (SubLObject)SubLObjectFactory.makeString("their")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("them"), (SubLObject)SubLObjectFactory.makeString("their")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("there"), (SubLObject)SubLObjectFactory.makeString("that place's")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("here"), (SubLObject)SubLObjectFactory.makeString("this place's")) });
        $kw102$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $str103$_ = SubLObjectFactory.makeString("'");
        $str104$_s = SubLObjectFactory.makeString("'s");
        $str105$_ = SubLObjectFactory.makeString(" ");
        $const106$QuantifyingIndexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantifyingIndexical"));
        $const107$GeographicalRegion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeographicalRegion"));
        $str108$in = SubLObjectFactory.makeString("in");
        $const109$SurfaceRegion_Underspecified = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurfaceRegion-Underspecified"));
        $str110$on = SubLObjectFactory.makeString("on");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROPER-NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"));
        $kw112$VERB = SubLObjectFactory.makeKeyword("VERB");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("PROPER-NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("VERB"));
        $kw114$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym115$FIND_STEM_MEMOIZED = SubLObjectFactory.makeSymbol("FIND-STEM-MEMOIZED");
        $sym116$_FIND_STEM_MEMOIZED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FIND-STEM-MEMOIZED-CACHING-STATE*");
        $int117$16384 = SubLObjectFactory.makeInteger(16384);
        $sym118$CLEAR_FIND_STEM_MEMOIZED = SubLObjectFactory.makeSymbol("CLEAR-FIND-STEM-MEMOIZED");
        $str119$ies = SubLObjectFactory.makeString("ies");
        $str120$ss = SubLObjectFactory.makeString("ss");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("o"), (SubLObject)SubLObjectFactory.makeString("ch"), (SubLObject)SubLObjectFactory.makeString("x"), (SubLObject)SubLObjectFactory.makeString("sh"), (SubLObject)SubLObjectFactory.makeString("z"), (SubLObject)SubLObjectFactory.makeString("s"));
        $str122$ied = SubLObjectFactory.makeString("ied");
        $str123$l = SubLObjectFactory.makeString("l");
        $str124$d = SubLObjectFactory.makeString("d");
        $str125$r = SubLObjectFactory.makeString("r");
        $str126$es = SubLObjectFactory.makeString("es");
        $sym127$PLURAL_NOUN_TO_SG = SubLObjectFactory.makeSymbol("PLURAL-NOUN-TO-SG");
        $str128$us = SubLObjectFactory.makeString("us");
        $list129 = ConsesLow.list((SubLObject)Characters.CHAR_r, (SubLObject)Characters.CHAR_h, (SubLObject)Characters.CHAR_t, (SubLObject)Characters.CHAR_n);
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ch"), (SubLObject)SubLObjectFactory.makeString("sh"), (SubLObject)SubLObjectFactory.makeString("x"), (SubLObject)SubLObjectFactory.makeString("z"));
        $const131$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $str132$en = SubLObjectFactory.makeString("en");
        $const133$CountNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"));
        $const134$Number_SP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Number-SP"));
        $const135$ProperCountNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperCountNoun"));
        $const136$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $const137$Adverb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb"));
        $str138$yze = SubLObjectFactory.makeString("yze");
        $str139$ify = SubLObjectFactory.makeString("ify");
        $str140$logy = SubLObjectFactory.makeString("logy");
        $str141$ette = SubLObjectFactory.makeString("ette");
        $str142$ess = SubLObjectFactory.makeString("ess");
        $str143$eer = SubLObjectFactory.makeString("eer");
        $str144$omy = SubLObjectFactory.makeString("omy");
        $str145$ics = SubLObjectFactory.makeString("ics");
        $str146$geny = SubLObjectFactory.makeString("geny");
        $str147$ium = SubLObjectFactory.makeString("ium");
        $str148$cracy = SubLObjectFactory.makeString("cracy");
        $str149$itis = SubLObjectFactory.makeString("itis");
        $str150$oma = SubLObjectFactory.makeString("oma");
        $str151$lysis = SubLObjectFactory.makeString("lysis");
        $str152$hood = SubLObjectFactory.makeString("hood");
        $str153$ship = SubLObjectFactory.makeString("ship");
        $str154$lty = SubLObjectFactory.makeString("lty");
        $str155$meter = SubLObjectFactory.makeString("meter");
        $str156$morph = SubLObjectFactory.makeString("morph");
        $str157$morphy = SubLObjectFactory.makeString("morphy");
        $str158$osis = SubLObjectFactory.makeString("osis");
        $str159$stery = SubLObjectFactory.makeString("stery");
        $str160$ence = SubLObjectFactory.makeString("ence");
        $str161$tude = SubLObjectFactory.makeString("tude");
        $str162$ance = SubLObjectFactory.makeString("ance");
        $str163$graphy = SubLObjectFactory.makeString("graphy");
        $str164$ment = SubLObjectFactory.makeString("ment");
        $str165$age = SubLObjectFactory.makeString("age");
        $str166$dom = SubLObjectFactory.makeString("dom");
        $str167$ery = SubLObjectFactory.makeString("ery");
        $str168$ite = SubLObjectFactory.makeString("ite");
        $str169$let = SubLObjectFactory.makeString("let");
        $str170$ling = SubLObjectFactory.makeString("ling");
        $str171$ster = SubLObjectFactory.makeString("ster");
        $str172$ant = SubLObjectFactory.makeString("ant");
        $str173$ee = SubLObjectFactory.makeString("ee");
        $str174$ese = SubLObjectFactory.makeString("ese");
        $str175$an = SubLObjectFactory.makeString("an");
        $str176$ical = SubLObjectFactory.makeString("ical");
        $str177$ous = SubLObjectFactory.makeString("ous");
        $str178$less = SubLObjectFactory.makeString("less");
        $str179$ier = SubLObjectFactory.makeString("ier");
        $str180$nant = SubLObjectFactory.makeString("nant");
        $str181$thic = SubLObjectFactory.makeString("thic");
        $str182$etic = SubLObjectFactory.makeString("etic");
        $str183$itic = SubLObjectFactory.makeString("itic");
        $str184$ful = SubLObjectFactory.makeString("ful");
        $str185$ish = SubLObjectFactory.makeString("ish");
        $str186$like = SubLObjectFactory.makeString("like");
        $str187$ial = SubLObjectFactory.makeString("ial");
        $str188$esque = SubLObjectFactory.makeString("esque");
        $str189$ic = SubLObjectFactory.makeString("ic");
        $str190$wise = SubLObjectFactory.makeString("wise");
        $str191$ward = SubLObjectFactory.makeString("ward");
        $str192$wards = SubLObjectFactory.makeString("wards");
        $list193 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("PROPER-NOUN"), (SubLObject)SubLObjectFactory.makeKeyword("VERB"), (SubLObject)SubLObjectFactory.makeKeyword("ADJECTIVE"), (SubLObject)SubLObjectFactory.makeKeyword("ADVERB"), (SubLObject)SubLObjectFactory.makeKeyword("PREPOSITION"));
        $kw194$PROPER_NOUN = SubLObjectFactory.makeKeyword("PROPER-NOUN");
        $const195$pnSingular = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnSingular"));
        $kw196$NOUN = SubLObjectFactory.makeKeyword("NOUN");
        $kw197$ADJECTIVE = SubLObjectFactory.makeKeyword("ADJECTIVE");
        $const198$regularDegree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularDegree"));
        $kw199$ADVERB = SubLObjectFactory.makeKeyword("ADVERB");
        $const200$regularAdverb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularAdverb"));
        $kw201$PREPOSITION = SubLObjectFactory.makeKeyword("PREPOSITION");
        $const202$prepositionStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prepositionStrings"));
        $str203$be = SubLObjectFactory.makeString("be");
        $sym204$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym205$POS_KEYWORD_P = SubLObjectFactory.makeSymbol("POS-KEYWORD-P");
        $const206$GeneralEnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $const207$Be_Contracted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Be-Contracted"));
        $const208$Be_TheWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Be-TheWord"));
        $const209$Will_Contracted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Will-Contracted"));
        $const210$Will_TheModal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Will-TheModal"));
        $const211$Have_Contracted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Have-Contracted"));
        $const212$Have_TheWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Have-TheWord"));
        $const213$Would_Contracted = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Would-Contracted"));
        $const214$Would_TheWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Would-TheWord"));
    }
    
    public static final class $aes_add_e_before_s$BinaryFunction extends BinaryFunction
    {
        public $aes_add_e_before_s$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-ADD-E-BEFORE-S"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_add_e_before_s(arg1, arg2);
        }
    }
    
    public static final class $aes_change_y_to_i$BinaryFunction extends BinaryFunction
    {
        public $aes_change_y_to_i$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-CHANGE-Y-TO-I"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_change_y_to_i(arg1, arg2);
        }
    }
    
    public static final class $aes_ble_to_bil_before_ity$BinaryFunction extends BinaryFunction
    {
        public $aes_ble_to_bil_before_ity$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-BLE-TO-BIL-BEFORE-ITY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_ble_to_bil_before_ity(arg1, arg2);
        }
    }
    
    public static final class $aes_change_aic_to_ac$BinaryFunction extends BinaryFunction
    {
        public $aes_change_aic_to_ac$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-CHANGE-AIC-TO-AC"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_change_aic_to_ac(arg1, arg2);
        }
    }
    
    public static final class $aes_strip_final_e$BinaryFunction extends BinaryFunction
    {
        public $aes_strip_final_e$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-STRIP-FINAL-E"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_strip_final_e(arg1, arg2);
        }
    }
    
    public static final class $aes_strip_final_vowels_before_ic$BinaryFunction extends BinaryFunction
    {
        public $aes_strip_final_vowels_before_ic$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-STRIP-FINAL-VOWELS-BEFORE-IC"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_strip_final_vowels_before_ic(arg1, arg2);
        }
    }
    
    public static final class $aes_change_ie_to_y$BinaryFunction extends BinaryFunction
    {
        public $aes_change_ie_to_y$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-CHANGE-IE-TO-Y"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_change_ie_to_y(arg1, arg2);
        }
    }
    
    public static final class $aes_change_ism_to_ist$BinaryFunction extends BinaryFunction
    {
        public $aes_change_ism_to_ist$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-CHANGE-ISM-TO-IST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_change_ism_to_ist(arg1, arg2);
        }
    }
    
    public static final class $aes_change_ceive_to_cept$BinaryFunction extends BinaryFunction
    {
        public $aes_change_ceive_to_cept$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-CHANGE-CEIVE-TO-CEPT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_change_ceive_to_cept(arg1, arg2);
        }
    }
    
    public static final class $aes_remove_able_le_before_ly$BinaryFunction extends BinaryFunction
    {
        public $aes_remove_able_le_before_ly$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-REMOVE-ABLE-LE-BEFORE-LY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_remove_able_le_before_ly(arg1, arg2);
        }
    }
    
    public static final class $aes_geminate_last$BinaryFunction extends BinaryFunction
    {
        public $aes_geminate_last$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-GEMINATE-LAST"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_geminate_last(arg1, arg2);
        }
    }
    
    public static final class $aes_able_to_ate$BinaryFunction extends BinaryFunction
    {
        public $aes_able_to_ate$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("AES-ABLE-TO-ATE"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return morphology.aes_able_to_ate(arg1, arg2);
        }
    }
}

/*

	Total time: 672 ms
	 synthetic 
*/