package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.morphology.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_e;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_h;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_n;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_q;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_r;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_t;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_u;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_y;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class morphology extends SubLTranslatedFile {
    public static final SubLFile me = new morphology();

    public static final String myName = "com.cyc.cycjava.cycl.morphology";

    public static final String myFingerPrint = "388bed68dba4fbc990140b17dcc6f495c145f52a01295515826346d4d6f561b3";

    // defconstant
    private static final SubLSymbol $vowels$ = makeSymbol("*VOWELS*");

    // defconstant
    private static final SubLSymbol $bigraph_vowels$ = makeSymbol("*BIGRAPH-VOWELS*");

    // defconstant
    private static final SubLSymbol $sibilant_endings$ = makeSymbol("*SIBILANT-ENDINGS*");

    // defconstant
    private static final SubLSymbol $consonants$ = makeSymbol("*CONSONANTS*");

    // defconstant
    private static final SubLSymbol $doublers$ = makeSymbol("*DOUBLERS*");

    // defconstant
    private static final SubLSymbol $unstressed_latin_pfxs$ = makeSymbol("*UNSTRESSED-LATIN-PFXS*");

    // defconstant
    private static final SubLSymbol $special_ate_cases$ = makeSymbol("*SPECIAL-ATE-CASES*");

    // defconstant
    private static final SubLSymbol $liquids$ = makeSymbol("*LIQUIDS*");

    // defconstant
    private static final SubLSymbol $vowelsX_plus_y$ = makeSymbol("*VOWELS*-PLUS-Y*");



    // deflexical
    private static final SubLSymbol $aes_do_orthographic_change_fns$ = makeSymbol("*AES-DO-ORTHOGRAPHIC-CHANGE-FNS*");

    // deflexical
    /**
     * Maximum number of syllables for comparative and superlative adjectives that
     * use -er
     */
    private static final SubLSymbol $comparative_syllable_cutoff$ = makeSymbol("*COMPARATIVE-SYLLABLE-CUTOFF*");

    // defconstant
    private static final SubLSymbol $more_prefix$ = makeSymbol("*MORE-PREFIX*");

    // defconstant
    private static final SubLSymbol $most_prefix$ = makeSymbol("*MOST-PREFIX*");

    // defconstant
    private static final SubLSymbol $english_possessive_pronouns$ = makeSymbol("*ENGLISH-POSSESSIVE-PRONOUNS*");



    // defparameter
    public static final SubLSymbol $preserve_case_in_singular_regP$ = makeSymbol("*PRESERVE-CASE-IN-SINGULAR-REG?*");

    // defparameter
    // part-of-speech keywords currently supported
    private static final SubLSymbol $pos_keywords$ = makeSymbol("*POS-KEYWORDS*");

    private static final SubLString $str0$_Revision__149757__ = makeString("$Revision: 149757 $");

    public static final SubLSymbol $morphology_code_revision$ = makeSymbol("*MORPHOLOGY-CODE-REVISION*");

    public static final SubLList $list2 = list(new SubLObject[]{ list(makeString("1.137"), makeString("1.138")), list(makeString("1.138"), makeString("1.139")), list(makeString("1.139"), makeString("1.140")), list(makeString("1.140"), makeString("1.141")), list(makeString("1.141"), makeString("1.142")), list(makeString("1.142"), makeString("1.143")), list(makeString("1.143"), makeString("1.144")), list(makeString("1.145"), makeString("1.146")), list(makeString("1.146"), makeString("1.147")), list(makeString("1.147"), makeString("1.148")), list(makeString("1.148"), makeString("1.149")), list(makeString("1.149"), makeString("1.150")) });

    public static final SubLString $$$aeiou = makeString("aeiou");

    public static final SubLList $list4 = list(new SubLObject[]{ makeString("ai"), makeString("au"), makeString("ay"), makeString("ea"), makeString("ee"), makeString("ei"), makeString("eu"), makeString("ie"), makeString("io"), makeString("oa"), makeString("oi"), makeString("oo"), makeString("ou"), makeString("ow"), makeString("oy"), makeString("ui") });

    public static final SubLList $list5 = list(makeString("ss"), makeString("x"), makeString("sh"), makeString("ch"), makeString("z"), makeString("s"));

    public static final SubLString $$$bcdfghjklmnprstvxz = makeString("bcdfghjklmnprstvxz");

    public static final SubLString $$$bdfgklmnprtvz = makeString("bdfgklmnprtvz");

    public static final SubLList $list8 = list(makeString("re"), makeString("de"), makeString("dis"), makeString("mis"), makeString("un"), makeString("in"), makeString("ex"));

    public static final SubLList $list9 = list(new SubLObject[]{ makeString("evaporate"), makeString("appreciate"), makeString("associate"), makeString("accommodate"), makeString("affiliate"), makeString("applicate"), makeString("navigate"), makeString("calculate"), makeString("abdicate"), makeString("estimate"), makeString("emulate"), makeString("educate") });

    public static final SubLList $list10 = list(makeString("l"), makeString("r"));

    public static final SubLString $$$y = makeString("y");

    public static final SubLString $$$ly = makeString("ly");

    public static final SubLString $$$qw = makeString("qw");

    public static final SubLString $$$q = makeString("q");

    public static final SubLString $$$u = makeString("u");

    private static final SubLObject $$comparativeDegree = reader_make_constant_shell(makeString("comparativeDegree"));

    public static final SubLSymbol COMPARATIVE_REG = makeSymbol("COMPARATIVE-REG");

    private static final SubLObject $$superlativeDegree = reader_make_constant_shell(makeString("superlativeDegree"));

    public static final SubLSymbol SUPERLATIVE_REG = makeSymbol("SUPERLATIVE-REG");

    private static final SubLObject $$comparativeAdverb = reader_make_constant_shell(makeString("comparativeAdverb"));

    public static final SubLSymbol COMPARATIVE_ADVERB_REG = makeSymbol("COMPARATIVE-ADVERB-REG");

    private static final SubLObject $$superlativeAdverb = reader_make_constant_shell(makeString("superlativeAdverb"));

    public static final SubLSymbol SUPERLATIVE_ADVERB_REG = makeSymbol("SUPERLATIVE-ADVERB-REG");



    public static final SubLSymbol POS_PREDS_DERIVABLE_FROM_PRED_INT = makeSymbol("POS-PREDS-DERIVABLE-FROM-PRED-INT");



    private static final SubLObject $$regularSuffix = reader_make_constant_shell(makeString("regularSuffix"));

    public static final SubLSymbol $pos_preds_derivable_from_pred_int_caching_state$ = makeSymbol("*POS-PREDS-DERIVABLE-FROM-PRED-INT-CACHING-STATE*");



    private static final SubLObject $$plural_Generic = reader_make_constant_shell(makeString("plural-Generic"));

    private static final SubLObject $$singular_Generic = reader_make_constant_shell(makeString("singular-Generic"));

    private static final SubLList $list32 = list(reader_make_constant_shell(makeString("plural")), reader_make_constant_shell(makeString("pnPlural")), reader_make_constant_shell(makeString("agentive-Pl")));

    private static final SubLString $$$z = makeString("z");

    private static final SubLObject $$EnglishLexiconMt = reader_make_constant_shell(makeString("EnglishLexiconMt"));

    private static final SubLList $list35 = list(reader_make_constant_shell(makeString("regularDegree")), reader_make_constant_shell(makeString("regularAdverb")));

    public static final SubLList $list36 = list(reader_make_constant_shell(makeString("comparativeDegree")), reader_make_constant_shell(makeString("superlativeDegree")), reader_make_constant_shell(makeString("comparativeAdverb")), reader_make_constant_shell(makeString("superlativeAdverb")));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLList $list39 = list(makeSymbol("RULE-BASE-PRED"), makeSymbol("SUFFIX"));



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));



    private static final SubLSymbol CYCL_STRING_P = makeSymbol("CYCL-STRING-P");

    private static final SubLString $str44$ = makeString("");

    private static final SubLList $list45 = cons(makeSymbol("CHANGE-FN"), makeSymbol("TYPE"));

    private static final SubLList $list46 = list(new SubLObject[]{ cons(makeSymbol("AES-CHANGE-Y-TO-I"), makeKeyword("BOTH")), cons(makeSymbol("AES-ABLE-TO-ATE"), makeKeyword("BASE")), cons(makeSymbol("AES-GEMINATE-LAST"), makeKeyword("BASE")), cons(makeSymbol("AES-DE-TO-SE"), makeKeyword("BASE")), cons(makeSymbol("AES-BLE-TO-BIL-BEFORE-ITY"), makeKeyword("BASE")), cons(makeSymbol("AES-CHANGE-CEIVE-TO-CEPT"), makeKeyword("BASE")), cons(makeSymbol("AES-CHANGE-VERT-TO-VERS"), makeKeyword("BASE")), cons(makeSymbol("AES-CHANGE-DUCE-TO-DUCT"), makeKeyword("BASE")), cons(makeSymbol("AES-CHANGE-AIC-TO-AC"), makeKeyword("BASE")), cons(makeSymbol("AES-ION-TO-ATION"), makeKeyword("SUFFIX")), cons(makeSymbol("AES-STRIP-FINAL-E"), makeKeyword("BASE")), cons(makeSymbol("AES-STRIP-FINAL-VOWELS-BEFORE-IC"), makeKeyword("BASE")), cons(makeSymbol("AES-CHANGE-IE-TO-Y"), makeKeyword("BASE")), cons(makeSymbol("AES-CHANGE-ISM-TO-IST"), makeKeyword("BASE")), cons(makeSymbol("AES-REMOVE-ABLE-LE-BEFORE-LY"), makeKeyword("BASE")), cons(makeSymbol("AES-ADD-E-BEFORE-S"), makeKeyword("SUFFIX")) });

    private static final SubLList $list47 = list(makeKeyword("BOTH"), makeKeyword("BASE"));

    private static final SubLList $list48 = list(makeKeyword("BOTH"), makeKeyword("SUFFIX"));

    private static final SubLString $$$s = makeString("s");

    private static final SubLString $$$e = makeString("e");

    private static final SubLString $$$ion = makeString("ion");

    private static final SubLList $list52 = list(new SubLObject[]{ makeString("port"), makeString("apt"), makeString("cit"), makeString("cite"), makeString("est"), makeString("ant"), makeString("ment"), makeString("ient"), makeString("ont"), makeString("pute"), makeString("esent"), makeString("note"), makeString("mute"), makeString("et") });

    private static final SubLString $$$ation = makeString("ation");

    private static final SubLString $$$i = makeString("i");

    private static final SubLString $$$ity = makeString("ity");

    private static final SubLString $$$ble = makeString("ble");

    private static final SubLString $$$il = makeString("il");

    private static final SubLString $$$at = makeString("at");

    private static final SubLString $$$ai = makeString("ai");

    private static final SubLString $$$ing = makeString("ing");

    private static final SubLString $$$ie = makeString("ie");

    private static final SubLString $$$ism = makeString("ism");

    private static final SubLString $$$ist = makeString("ist");

    private static final SubLString $$$ceive = makeString("ceive");

    private static final SubLString $$$ive = makeString("ive");

    private static final SubLString $$$pt = makeString("pt");

    private static final SubLString $$$vert = makeString("vert");

    private static final SubLString $$$vers = makeString("vers");

    private static final SubLString $$$duce = makeString("duce");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $$$able = makeString("able");

    private static final SubLString $$$ible = makeString("ible");

    private static final SubLString $$$le = makeString("le");

    private static final SubLString $$$de = makeString("de");

    private static final SubLString $$$is = makeString("is");

    private static final SubLList $list76 = list(makeString("ing"), makeString("ity"));

    private static final SubLString $$$se = makeString("se");

    private static final SubLString $$$ize = makeString("ize");

    private static final SubLString $$$ise = makeString("ise");

    private static final SubLString $$$al = makeString("al");

    private static final SubLString $$$er = makeString("er");

    private static final SubLString $$$or = makeString("or");

    private static final SubLString $$$fer = makeString("fer");

    private static final SubLString $$$ffer = makeString("ffer");

    private static final SubLString $$$id = makeString("id");

    private static final SubLList $list86 = list(makeString("n"), makeString("l"), makeString("t"));

    private static final SubLString $$$alicious = makeString("alicious");

    private static final SubLString $$$ate = makeString("ate");

    private static final SubLString $$$ed = makeString("ed");

    private static final SubLString $$$more_ = makeString("more ");

    private static final SubLString $$$most_ = makeString("most ");

    private static final SubLString $$$est = makeString("est");

    private static final SubLObject $$pastTense_Universal = reader_make_constant_shell(makeString("pastTense-Universal"));

    private static final SubLObject $$infinitive = reader_make_constant_shell(makeString("infinitive"));

    private static final SubLObject $$gerund = reader_make_constant_shell(makeString("gerund"));

    private static final SubLObject $$thirdPersonSg_Present = reader_make_constant_shell(makeString("thirdPersonSg-Present"));

    private static final SubLObject $$plural = reader_make_constant_shell(makeString("plural"));

    private static final SubLObject $$singular = reader_make_constant_shell(makeString("singular"));

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

    private static final SubLObject $$presentParticiple = reader_make_constant_shell(makeString("presentParticiple"));

    private static final SubLList $list101 = list(new SubLObject[]{ cons(makeString("I"), makeString("my")), cons(makeString("me"), makeString("my")), cons(makeString("you"), makeString("your")), cons(makeString("he"), makeString("his")), cons(makeString("him"), makeString("his")), cons(makeString("him or her"), makeString("his or her")), cons(makeString("he or she"), makeString("his or her")), cons(makeString("she"), makeString("her")), cons(makeString("her"), makeString("her")), cons(makeString("it"), makeString("its")), cons(makeString("we"), makeString("our")), cons(makeString("us"), makeString("our")), cons(makeString("they"), makeString("their")), cons(makeString("them"), makeString("their")), cons(makeString("there"), makeString("that place's")), cons(makeString("here"), makeString("this place's")) });



    private static final SubLString $str103$_ = makeString("'");

    private static final SubLString $str104$_s = makeString("'s");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLObject $$QuantifyingIndexical = reader_make_constant_shell(makeString("QuantifyingIndexical"));

    private static final SubLObject $$GeographicalRegion = reader_make_constant_shell(makeString("GeographicalRegion"));

    private static final SubLString $$$in = makeString("in");

    private static final SubLObject $$SurfaceRegion_Underspecified = reader_make_constant_shell(makeString("SurfaceRegion-Underspecified"));

    private static final SubLString $$$on = makeString("on");

    private static final SubLList $list111 = list(makeKeyword("PROPER-NOUN"), makeKeyword("NOUN"));



    private static final SubLList $list113 = list(makeKeyword("NOUN"), makeKeyword("PROPER-NOUN"), makeKeyword("VERB"));



    private static final SubLSymbol FIND_STEM_MEMOIZED = makeSymbol("FIND-STEM-MEMOIZED");

    private static final SubLSymbol $find_stem_memoized_caching_state$ = makeSymbol("*FIND-STEM-MEMOIZED-CACHING-STATE*");

    private static final SubLInteger $int$16384 = makeInteger(16384);

    private static final SubLSymbol CLEAR_FIND_STEM_MEMOIZED = makeSymbol("CLEAR-FIND-STEM-MEMOIZED");

    private static final SubLString $$$ies = makeString("ies");

    private static final SubLString $$$ss = makeString("ss");

    private static final SubLList $list121 = list(makeString("o"), makeString("ch"), makeString("x"), makeString("sh"), makeString("z"), makeString("s"));

    private static final SubLString $$$ied = makeString("ied");

    private static final SubLString $$$l = makeString("l");

    private static final SubLString $$$d = makeString("d");

    private static final SubLString $$$r = makeString("r");

    private static final SubLString $$$es = makeString("es");

    private static final SubLSymbol PLURAL_NOUN_TO_SG = makeSymbol("PLURAL-NOUN-TO-SG");

    private static final SubLString $$$us = makeString("us");

    private static final SubLList $list129 = list(CHAR_r, CHAR_h, CHAR_t, CHAR_n);

    private static final SubLList $list130 = list(makeString("ch"), makeString("sh"), makeString("x"), makeString("z"));

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLString $$$en = makeString("en");

    private static final SubLObject $$CountNoun = reader_make_constant_shell(makeString("CountNoun"));

    private static final SubLObject $$Number_SP = reader_make_constant_shell(makeString("Number-SP"));

    private static final SubLObject $$ProperCountNoun = reader_make_constant_shell(makeString("ProperCountNoun"));

    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));

    private static final SubLObject $$Adverb = reader_make_constant_shell(makeString("Adverb"));

    private static final SubLString $$$yze = makeString("yze");

    private static final SubLString $$$ify = makeString("ify");

    private static final SubLString $$$logy = makeString("logy");

    private static final SubLString $$$ette = makeString("ette");

    private static final SubLString $$$ess = makeString("ess");

    private static final SubLString $$$eer = makeString("eer");

    private static final SubLString $$$omy = makeString("omy");

    private static final SubLString $$$ics = makeString("ics");

    private static final SubLString $$$geny = makeString("geny");

    private static final SubLString $$$ium = makeString("ium");

    private static final SubLString $$$cracy = makeString("cracy");

    private static final SubLString $$$itis = makeString("itis");

    private static final SubLString $$$oma = makeString("oma");

    private static final SubLString $$$lysis = makeString("lysis");

    private static final SubLString $$$hood = makeString("hood");

    private static final SubLString $$$ship = makeString("ship");

    private static final SubLString $$$lty = makeString("lty");

    private static final SubLString $$$meter = makeString("meter");

    private static final SubLString $$$morph = makeString("morph");

    private static final SubLString $$$morphy = makeString("morphy");

    private static final SubLString $$$osis = makeString("osis");

    private static final SubLString $$$stery = makeString("stery");

    private static final SubLString $$$ence = makeString("ence");

    private static final SubLString $$$tude = makeString("tude");

    private static final SubLString $$$ance = makeString("ance");

    private static final SubLString $$$graphy = makeString("graphy");

    private static final SubLString $$$ment = makeString("ment");

    private static final SubLString $$$age = makeString("age");

    private static final SubLString $$$dom = makeString("dom");

    private static final SubLString $$$ery = makeString("ery");

    private static final SubLString $$$ite = makeString("ite");

    private static final SubLString $$$let = makeString("let");

    private static final SubLString $$$ling = makeString("ling");

    private static final SubLString $$$ster = makeString("ster");

    private static final SubLString $$$ant = makeString("ant");

    private static final SubLString $$$ee = makeString("ee");

    private static final SubLString $$$ese = makeString("ese");

    private static final SubLString $$$an = makeString("an");

    private static final SubLString $$$ical = makeString("ical");

    private static final SubLString $$$ous = makeString("ous");

    private static final SubLString $$$less = makeString("less");

    private static final SubLString $$$ier = makeString("ier");

    private static final SubLString $$$nant = makeString("nant");

    private static final SubLString $$$thic = makeString("thic");

    private static final SubLString $$$etic = makeString("etic");

    private static final SubLString $$$itic = makeString("itic");

    private static final SubLString $$$ful = makeString("ful");

    private static final SubLString $$$ish = makeString("ish");

    private static final SubLString $$$like = makeString("like");

    private static final SubLString $$$ial = makeString("ial");

    private static final SubLString $$$esque = makeString("esque");

    private static final SubLString $$$ic = makeString("ic");

    private static final SubLString $$$wise = makeString("wise");

    private static final SubLString $$$ward = makeString("ward");

    private static final SubLString $$$wards = makeString("wards");

    private static final SubLList $list193 = list(makeKeyword("NOUN"), makeKeyword("PROPER-NOUN"), makeKeyword("VERB"), makeKeyword("ADJECTIVE"), makeKeyword("ADVERB"), makeKeyword("PREPOSITION"));



    private static final SubLObject $$pnSingular = reader_make_constant_shell(makeString("pnSingular"));





    private static final SubLObject $$regularDegree = reader_make_constant_shell(makeString("regularDegree"));



    private static final SubLObject $$regularAdverb = reader_make_constant_shell(makeString("regularAdverb"));



    private static final SubLObject $$prepositionStrings = reader_make_constant_shell(makeString("prepositionStrings"));

    private static final SubLString $$$be = makeString("be");



    private static final SubLSymbol POS_KEYWORD_P = makeSymbol("POS-KEYWORD-P");

    private static final SubLObject $$GeneralEnglishMt = reader_make_constant_shell(makeString("GeneralEnglishMt"));

    private static final SubLObject $$Be_Contracted = reader_make_constant_shell(makeString("Be-Contracted"));

    private static final SubLObject $$Be_TheWord = reader_make_constant_shell(makeString("Be-TheWord"));

    private static final SubLObject $$Will_Contracted = reader_make_constant_shell(makeString("Will-Contracted"));

    private static final SubLObject $$Will_TheModal = reader_make_constant_shell(makeString("Will-TheModal"));

    private static final SubLObject $$Have_Contracted = reader_make_constant_shell(makeString("Have-Contracted"));

    private static final SubLObject $$Have_TheWord = reader_make_constant_shell(makeString("Have-TheWord"));

    private static final SubLObject $$Would_Contracted = reader_make_constant_shell(makeString("Would-Contracted"));

    private static final SubLObject $$Would_TheWord = reader_make_constant_shell(makeString("Would-TheWord"));

    public static SubLObject get_vowel_positions(final SubLObject string) {
        SubLObject position_list = NIL;
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject i;
        SubLObject curr;
        for (end_var = end_var_$1 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$1); i = number_utilities.f_1X(i)) {
            curr = Strings.sublisp_char(string, i);
            if (((NIL != vowel_charP(curr, UNPROVIDED)) && ((i.isZero() || (!curr.equalp(CHAR_u))) || (!Strings.sublisp_char(string, number_utilities.f_1_(i)).equalp(CHAR_q)))) || ((curr.equalp(CHAR_y) && (NIL == vowel_charP(string_utilities.char_at(string, number_utilities.f_1_(i)), UNPROVIDED))) && (NIL == vowel_charP(string_utilities.char_at(string, number_utilities.f_1X(i)), UNPROVIDED)))) {
                position_list = cons(i, position_list);
            }
        }
        return nreverse(position_list);
    }

    public static SubLObject estimated_syllable_count(final SubLObject string) {
        final SubLObject vowel_positions = get_vowel_positions(string);
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = vowel_positions;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL == subl_promotions.memberP(number_utilities.f_1_(pos), vowel_positions, UNPROVIDED, UNPROVIDED)) || (NIL == member(string_utilities.substring(string, number_utilities.f_1_(pos), number_utilities.f_1X(pos)), $bigraph_vowels$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED))) && ((!Strings.sublisp_char(string, pos).equalp(CHAR_e)) || (((NIL == list_utilities.lengthE(string, number_utilities.f_1X(pos), UNPROVIDED)) && (NIL == string_utilities.whitespacep(Strings.sublisp_char(string, number_utilities.f_1X(pos))))) && (!string_utilities.substring(string, number_utilities.f_1X(pos), UNPROVIDED).equalp($$$ly))))) {
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject monosyllabicP(final SubLObject string) {
        return equal(estimated_syllable_count(string), ONE_INTEGER);
    }

    public static SubLObject polysyllabicP(final SubLObject string, SubLObject min_syllable_count) {
        if (min_syllable_count == UNPROVIDED) {
            min_syllable_count = TWO_INTEGER;
        }
        return numGE(estimated_syllable_count(string), min_syllable_count);
    }

    public static SubLObject vowel_charP(final SubLObject v_char, SubLObject include_yP) {
        if (include_yP == UNPROVIDED) {
            include_yP = NIL;
        }
        return makeBoolean((NIL != find(v_char, $vowels$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) || ((NIL != include_yP) && v_char.equalp(CHAR_y)));
    }

    public static SubLObject consonant_charP(final SubLObject v_char) {
        return list_utilities.sublisp_boolean(find(v_char, $consonants$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject get_consonant_positions(final SubLObject string) {
        SubLObject position_list = NIL;
        SubLObject end_var_$2;
        SubLObject end_var;
        SubLObject i;
        SubLObject curr;
        SubLObject item_var;
        for (end_var = end_var_$2 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$2); i = number_utilities.f_1X(i)) {
            curr = Strings.sublisp_char(string, i);
            if (NIL != consonant_charP(curr)) {
                item_var = i;
                if (NIL == member(item_var, position_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                    position_list = cons(item_var, position_list);
                }
            }
        }
        return nreverse(position_list);
    }

    public static SubLObject ends_with_vowelP(final SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != vowel_charP(string_utilities.last_char(string), T)));
    }

    public static SubLObject starts_with_vowelP(final SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != vowel_charP(Strings.sublisp_char(string, ZERO_INTEGER), UNPROVIDED)));
    }

    public static SubLObject ends_with_consonantP(final SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != consonant_charP(string_utilities.last_char(string))));
    }

    public static SubLObject starts_with_consonantP(final SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (((NIL != consonant_charP(Strings.sublisp_char(string, ZERO_INTEGER))) || (NIL != find(Strings.sublisp_char(string, ZERO_INTEGER), $$$qw, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (((NIL != list_utilities.lengthG(string, ONE_INTEGER, UNPROVIDED)) && Strings.sublisp_char(string, ZERO_INTEGER).equalp(CHAR_y)) && (NIL != vowel_charP(Strings.sublisp_char(string, ONE_INTEGER), UNPROVIDED)))));
    }

    public static SubLObject single_c_codaP(final SubLObject string) {
        SubLObject ans = NIL;
        final SubLObject rev = reverse(string);
        ans = makeBoolean(((NIL != list_utilities.lengthG(string, ONE_INTEGER, UNPROVIDED)) && (NIL == vowel_charP(Strings.sublisp_char(rev, ZERO_INTEGER), UNPROVIDED))) && (NIL != vowel_charP(Strings.sublisp_char(rev, ONE_INTEGER), T)));
        return ans;
    }

    public static SubLObject ends_with_doublerP(final SubLObject string) {
        return makeBoolean((NIL != list_utilities.lengthG(string, ZERO_INTEGER, UNPROVIDED)) && (NIL != find(string_utilities.last_char(string), $doublers$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject starts_with_unstressed_pfxP(final SubLObject string) {
        SubLObject csome_list_var = $unstressed_latin_pfxs$.getGlobalValue();
        SubLObject pre = NIL;
        pre = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != string_utilities.starts_with(string, pre)) {
                return T;
            }
            csome_list_var = csome_list_var.rest();
            pre = csome_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject ends_in_cvcP(final SubLObject string) {
        SubLObject ans = NIL;
        final SubLObject rev = reverse(string);
        ans = makeBoolean((((NIL != list_utilities.lengthG(string, TWO_INTEGER, UNPROVIDED)) && (NIL != consonant_charP(Strings.sublisp_char(rev, ZERO_INTEGER)))) && (NIL != vowel_charP(Strings.sublisp_char(rev, ONE_INTEGER), UNPROVIDED))) && (NIL == vowel_charP(Strings.sublisp_char(rev, TWO_INTEGER), UNPROVIDED)));
        return ans;
    }

    public static SubLObject ends_in_quvcP(final SubLObject string) {
        SubLObject ans = NIL;
        final SubLObject rev = reverse(string);
        ans = makeBoolean(((((NIL != list_utilities.lengthG(string, THREE_INTEGER, UNPROVIDED)) && (NIL != find(Strings.sublisp_char(rev, THREE_INTEGER), $$$q, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != find(Strings.sublisp_char(rev, TWO_INTEGER), $$$u, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != consonant_charP(Strings.sublisp_char(rev, ZERO_INTEGER)))) && (NIL != vowel_charP(Strings.sublisp_char(rev, ONE_INTEGER), UNPROVIDED)));
        return ans;
    }

    public static SubLObject make_geminate(final SubLObject string, final SubLObject n) {
        if (NIL != list_utilities.lengthG(string, n, UNPROVIDED)) {
            return string_utilities.infix(string_utilities.substring(string, n, number_utilities.f_1X(n)), string, n);
        }
        return NIL;
    }

    public static SubLObject geminate_last(final SubLObject string) {
        return make_geminate(string, number_utilities.f_1_(length(string)));
    }

    public static SubLObject correct_capitalization(final SubLObject correct, final SubLObject word) {
        if (NIL != string_utilities.lower_case_string_p(correct)) {
            return Strings.string_downcase(word, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != string_utilities.upper_case_string_p(correct)) {
            return Strings.string_upcase(word, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != string_utilities.capitalized_string_p(correct)) {
            return Strings.string_capitalize(word, UNPROVIDED, UNPROVIDED);
        }
        return word;
    }

    public static SubLObject regular_string_function(final SubLObject pred) {
        if (pred.eql($$comparativeDegree)) {
            return symbol_function(COMPARATIVE_REG);
        }
        if (pred.eql($$superlativeDegree)) {
            return symbol_function(SUPERLATIVE_REG);
        }
        if (pred.eql($$comparativeAdverb)) {
            return symbol_function(COMPARATIVE_ADVERB_REG);
        }
        if (pred.eql($$superlativeAdverb)) {
            return symbol_function(SUPERLATIVE_ADVERB_REG);
        }
        return symbol_function(IDENTITY);
    }

    public static SubLObject pos_preds_derivable_from_pred(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        return NIL != lexicon_accessors.speech_part_predP(pred, mt) ? pos_preds_derivable_from_pred_int(pred, mt, UNPROVIDED) : NIL;
    }

    public static SubLObject clear_pos_preds_derivable_from_pred_int() {
        final SubLObject cs = $pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pos_preds_derivable_from_pred_int(final SubLObject pred, final SubLObject mt, SubLObject preds) {
        if (preds == UNPROVIDED) {
            preds = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue(), list(pred, mt, preds), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pos_preds_derivable_from_pred_int_internal(final SubLObject pred, final SubLObject mt, SubLObject preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(pred, $$regularSuffix, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject der_pred = NIL;
            der_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == subl_promotions.memberP(der_pred, preds, UNPROVIDED, UNPROVIDED)) {
                    preds = cons(der_pred, preds);
                    SubLObject cdolist_list_var_$3 = pos_preds_derivable_from_pred_int(der_pred, mt, preds);
                    SubLObject new_pred = NIL;
                    new_pred = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        final SubLObject item_var = new_pred;
                        if (NIL == member(item_var, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                            preds = cons(item_var, preds);
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        new_pred = cdolist_list_var_$3.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                der_pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }

    public static SubLObject pos_preds_derivable_from_pred_int(final SubLObject pred, final SubLObject mt, SubLObject preds) {
        if (preds == UNPROVIDED) {
            preds = NIL;
        }
        SubLObject caching_state = $pos_preds_derivable_from_pred_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(POS_PREDS_DERIVABLE_FROM_PRED_INT, $pos_preds_derivable_from_pred_int_caching_state$, NIL, EQL, THREE_INTEGER, $int$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, mt, preds);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && preds.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pos_preds_derivable_from_pred_int_internal(pred, mt, preds)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt, preds));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject singular_form_for_pred(final SubLObject pred) {
        if (NIL == plural_predP(pred, UNPROVIDED)) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject pos = lexicon_accessors.pos_of_pred(pred);
        final SubLObject other_preds = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
        if (NIL == ans) {
            SubLObject csome_list_var = other_preds;
            SubLObject other_pred = NIL;
            other_pred = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                if (NIL != singular_predP(other_pred, UNPROVIDED)) {
                    ans = other_pred;
                }
                csome_list_var = csome_list_var.rest();
                other_pred = csome_list_var.first();
            } 
        }
        return ans;
    }

    public static SubLObject plural_predP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            ans = makeBoolean((NIL != forts.fort_p(pred)) && (NIL != genl_predicates.genl_predP(pred, $$plural_Generic, UNPROVIDED, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject singular_predP(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            ans = makeBoolean((NIL != forts.fort_p(pred)) && (NIL != genl_predicates.genl_predP(pred, $$singular_Generic, UNPROVIDED, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject generate_z_form(final SubLObject wu, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != find(pred, $list32, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
                final SubLObject singular_pred = singular_form_for_pred(pred);
                final SubLObject root = (NIL != singular_pred) ? kb_mapping_utilities.fpred_value(wu, singular_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                if (NIL != root) {
                    ans = cconcatenate(root, $$$z);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject suffix_rules_for_pred(final SubLObject pred) {
        return kb_mapping.gather_gaf_arg_index_with_predicate(pred, ONE_INTEGER, $$regularSuffix, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_regular_string_from_form(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = $$EnglishLexiconMt;
        }
        return generate_regular_strings_from_form(target_pred, base_pred, base_form, mt_info, T, UNPROVIDED).first();
    }

    public static SubLObject generate_regular_strings_from_form(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, SubLObject mt_info, SubLObject best_onlyP, SubLObject tried_preds) {
        if (mt_info == UNPROVIDED) {
            mt_info = $$EnglishLexiconMt;
        }
        if (best_onlyP == UNPROVIDED) {
            best_onlyP = NIL;
        }
        if (tried_preds == UNPROVIDED) {
            tried_preds = NIL;
        }
        if ((NIL != subl_promotions.memberP(base_pred, $list35, UNPROVIDED, UNPROVIDED)) && (NIL != member(target_pred, $list36, UNPROVIDED, UNPROVIDED))) {
            final SubLObject inflection_function = regular_string_function(target_pred);
            final SubLObject form = funcall(inflection_function, base_form);
            return list(form);
        }
        return generate_regular_strings_from_form_int(target_pred, base_pred, base_form, mt_info, best_onlyP, tried_preds);
    }

    public static SubLObject generate_regular_strings_from_form_int(final SubLObject target_pred, final SubLObject base_pred, final SubLObject base_form, final SubLObject mt_info, final SubLObject best_onlyP, final SubLObject tried_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject target_forms = NIL;
        SubLObject doneP = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (NIL == doneP) {
                    SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                    SubLObject rule = NIL;
                    rule = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        SubLObject current;
                        final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                        SubLObject rule_base_pred = NIL;
                        SubLObject suffix = NIL;
                        destructuring_bind_must_consp(current, datum, $list39);
                        rule_base_pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list39);
                        suffix = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (rule_base_pred.eql(base_pred)) {
                                final SubLObject item_var = add_english_suffix(base_form, suffix);
                                if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    target_forms = cons(item_var, target_forms);
                                }
                                doneP = best_onlyP;
                            } else
                                if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                    final SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                    final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                    if (NIL == doneP) {
                                        SubLObject csome_list_var_$4 = derived_base_forms;
                                        SubLObject derived_base_form = NIL;
                                        derived_base_form = csome_list_var_$4.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var_$4)) {
                                            final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                            if (NIL == member(item_var2, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                target_forms = cons(item_var2, target_forms);
                                            }
                                            doneP = best_onlyP;
                                            csome_list_var_$4 = csome_list_var_$4.rest();
                                            derived_base_form = csome_list_var_$4.first();
                                        } 
                                    }
                                }

                        } else {
                            cdestructuring_bind_error(datum, $list39);
                        }
                        csome_list_var = csome_list_var.rest();
                        rule = csome_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                    if (NIL == doneP) {
                        SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                        SubLObject rule = NIL;
                        rule = csome_list_var.first();
                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                            SubLObject current;
                            final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                            SubLObject rule_base_pred = NIL;
                            SubLObject suffix = NIL;
                            destructuring_bind_must_consp(current, datum, $list39);
                            rule_base_pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list39);
                            suffix = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (rule_base_pred.eql(base_pred)) {
                                    final SubLObject item_var = add_english_suffix(base_form, suffix);
                                    if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        target_forms = cons(item_var, target_forms);
                                    }
                                    doneP = best_onlyP;
                                } else
                                    if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                        final SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                        final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                        if (NIL == doneP) {
                                            SubLObject csome_list_var_$5 = derived_base_forms;
                                            SubLObject derived_base_form = NIL;
                                            derived_base_form = csome_list_var_$5.first();
                                            while ((NIL == doneP) && (NIL != csome_list_var_$5)) {
                                                final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                                if (NIL == member(item_var2, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    target_forms = cons(item_var2, target_forms);
                                                }
                                                doneP = best_onlyP;
                                                csome_list_var_$5 = csome_list_var_$5.rest();
                                                derived_base_form = csome_list_var_$5.first();
                                            } 
                                        }
                                    }

                            } else {
                                cdestructuring_bind_error(datum, $list39);
                            }
                            csome_list_var = csome_list_var.rest();
                            rule = csome_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                            SubLObject rule = NIL;
                            rule = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                                SubLObject rule_base_pred = NIL;
                                SubLObject suffix = NIL;
                                destructuring_bind_must_consp(current, datum, $list39);
                                rule_base_pred = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list39);
                                suffix = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (rule_base_pred.eql(base_pred)) {
                                        final SubLObject item_var = add_english_suffix(base_form, suffix);
                                        if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            target_forms = cons(item_var, target_forms);
                                        }
                                        doneP = best_onlyP;
                                    } else
                                        if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                            final SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                            final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                            if (NIL == doneP) {
                                                SubLObject csome_list_var_$6 = derived_base_forms;
                                                SubLObject derived_base_form = NIL;
                                                derived_base_form = csome_list_var_$6.first();
                                                while ((NIL == doneP) && (NIL != csome_list_var_$6)) {
                                                    final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                                    if (NIL == member(item_var2, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        target_forms = cons(item_var2, target_forms);
                                                    }
                                                    doneP = best_onlyP;
                                                    csome_list_var_$6 = csome_list_var_$6.rest();
                                                    derived_base_form = csome_list_var_$6.first();
                                                } 
                                            }
                                        }

                                } else {
                                    cdestructuring_bind_error(datum, $list39);
                                }
                                csome_list_var = csome_list_var.rest();
                                rule = csome_list_var.first();
                            } 
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_info, thread);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = suffix_rules_for_pred(target_pred);
                            SubLObject rule = NIL;
                            rule = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject current;
                                final SubLObject datum = current = assertions_high.gaf_args(rule).rest();
                                SubLObject rule_base_pred = NIL;
                                SubLObject suffix = NIL;
                                destructuring_bind_must_consp(current, datum, $list39);
                                rule_base_pred = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list39);
                                suffix = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (rule_base_pred.eql(base_pred)) {
                                        final SubLObject item_var = add_english_suffix(base_form, suffix);
                                        if (NIL == member(item_var, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            target_forms = cons(item_var, target_forms);
                                        }
                                        doneP = best_onlyP;
                                    } else
                                        if (NIL == subl_promotions.memberP(list(rule_base_pred, base_pred), tried_preds, symbol_function(EQUAL), UNPROVIDED)) {
                                            final SubLObject new_tried_preds = cons(list(rule_base_pred, base_pred), tried_preds);
                                            final SubLObject derived_base_forms = generate_regular_strings_from_form(rule_base_pred, base_pred, base_form, mt_info, NIL, new_tried_preds);
                                            if (NIL == doneP) {
                                                SubLObject csome_list_var_$7 = derived_base_forms;
                                                SubLObject derived_base_form = NIL;
                                                derived_base_form = csome_list_var_$7.first();
                                                while ((NIL == doneP) && (NIL != csome_list_var_$7)) {
                                                    final SubLObject item_var2 = add_english_suffix(derived_base_form, suffix);
                                                    if (NIL == member(item_var2, target_forms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        target_forms = cons(item_var2, target_forms);
                                                    }
                                                    doneP = best_onlyP;
                                                    csome_list_var_$7 = csome_list_var_$7.rest();
                                                    derived_base_form = csome_list_var_$7.first();
                                                } 
                                            }
                                        }

                                } else {
                                    cdestructuring_bind_error(datum, $list39);
                                }
                                csome_list_var = csome_list_var.rest();
                                rule = csome_list_var.first();
                            } 
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return target_forms;
    }

    public static SubLObject add_english_suffix(SubLObject base, SubLObject suffix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_string.cycl_string_p(base) : "cycl_string.cycl_string_p(base) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(base) " + base;
        assert NIL != cycl_string.cycl_string_p(suffix) : "cycl_string.cycl_string_p(suffix) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(suffix) " + suffix;
        if (suffix.equal($str44$)) {
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

    public static SubLObject aes_do_orthographic_changes(final SubLObject base, final SubLObject suffix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_suffix = suffix;
        SubLObject current_base = base;
        SubLObject changers = NIL;
        SubLObject cdolist_list_var = aes_do_orthographic_change_fns();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject change_fn = NIL;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list45);
            change_fn = current.first();
            current = type = current.rest();
            thread.resetMultipleValues();
            final SubLObject new_base = aes_do_orthographic_change(current_base, current_suffix, change_fn, type);
            final SubLObject new_suffix = thread.secondMultipleValue();
            final SubLObject changedP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != changedP) {
                changers = cons(change_fn, changers);
                current_base = new_base;
                current_suffix = new_suffix;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return values(current_base, current_suffix, changers);
    }

    public static SubLObject aes_do_orthographic_change_fns() {
        return $aes_do_orthographic_change_fns$.getGlobalValue();
    }

    public static SubLObject aes_do_orthographic_change(final SubLObject base, final SubLObject suffix, final SubLObject change_fn, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_suffix = suffix;
        SubLObject new_base = base;
        final SubLObject base_changerP = member(type, $list47, UNPROVIDED, UNPROVIDED);
        final SubLObject suffix_changerP = member(type, $list48, UNPROVIDED, UNPROVIDED);
        if ((NIL != base_changerP) && (NIL != suffix_changerP)) {
            thread.resetMultipleValues();
            final SubLObject new_base_$10 = funcall(change_fn, base, suffix);
            final SubLObject new_suffix_$11 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_base = new_base_$10;
            new_suffix = new_suffix_$11;
        } else
            if (NIL != base_changerP) {
                new_base = funcall(change_fn, base, suffix);
            } else
                if (NIL != suffix_changerP) {
                    new_suffix = funcall(change_fn, base, suffix);
                }


        final SubLObject changedP = makeBoolean((!base.equal(new_base)) || (!suffix.equal(new_suffix)));
        return values(new_base, new_suffix, changedP);
    }

    public static SubLObject ends_with_sibilantP(final SubLObject string) {
        return string_utilities.ends_with_one_of(string, $sibilant_endings$.getGlobalValue());
    }

    public static SubLObject aes_add_e_before_s(final SubLObject base, SubLObject suffix) {
        if ((NIL != ends_with_sibilantP(base)) && (NIL != string_utilities.starts_with(suffix, $$$s))) {
            suffix = cconcatenate($$$e, suffix);
        }
        return suffix;
    }

    public static SubLObject aes_ion_to_ation(final SubLObject base, SubLObject suffix) {
        if (suffix.equal($$$ion) && (NIL != string_utilities.ends_with_one_of(base, $list52))) {
            suffix = $$$ation;
        }
        return suffix;
    }

    public static SubLObject aes_change_y_to_i(SubLObject base, SubLObject suffix) {
        if (((NIL != string_utilities.ends_with(base, $$$y, UNPROVIDED)) && (NIL == string_utilities.starts_with(suffix, $$$i))) && (NIL == ends_with_vowelP(string_utilities.strip_final(base, UNPROVIDED)))) {
            base = cconcatenate(string_utilities.strip_final(base, UNPROVIDED), $$$i);
            if ((NIL != list_utilities.lengthE(suffix, ONE_INTEGER, UNPROVIDED)) && (NIL != starts_with_consonantP(suffix))) {
                suffix = cconcatenate($$$e, suffix);
            }
        }
        return values(base, suffix);
    }

    public static SubLObject aes_ble_to_bil_before_ity(SubLObject base, final SubLObject suffix) {
        if (suffix.equalp($$$ity) && (NIL != string_utilities.ends_with(base, $$$ble, UNPROVIDED))) {
            base = cconcatenate(string_utilities.strip_final(base, TWO_INTEGER), $$$il);
        }
        return base;
    }

    public static SubLObject aes_change_aic_to_ac(SubLObject base, final SubLObject suffix) {
        if (((NIL != string_utilities.starts_with(suffix, $$$at)) && (NIL != string_utilities.ends_with(string_utilities.strip_final(base, UNPROVIDED), $$$ai, UNPROVIDED))) && (NIL != ends_with_consonantP(base))) {
            base = cconcatenate(format_nil.format_nil_a_no_copy(string_utilities.strip_final(base, TWO_INTEGER)), format_nil.format_nil_a_no_copy(string_utilities.last_char(base)));
        }
        return base;
    }

    public static SubLObject aes_strip_final_e(SubLObject base, final SubLObject suffix) {
        if (((NIL != list_utilities.lengthG(base, ONE_INTEGER, UNPROVIDED)) && (NIL != string_utilities.ends_with(base, $$$e, UNPROVIDED))) && ((NIL != string_utilities.starts_with(suffix, $$$e)) || (((NIL != string_utilities.ends_with(string_utilities.strip_final(base, UNPROVIDED), $$$u, UNPROVIDED)) || (NIL != ends_with_consonantP(string_utilities.strip_final(base, UNPROVIDED)))) && (NIL != starts_with_vowelP(suffix))))) {
            base = string_utilities.strip_final(base, UNPROVIDED);
        }
        return base;
    }

    public static SubLObject aes_strip_final_vowels_before_ic(SubLObject base, final SubLObject suffix) {
        if (((((NIL != string_utilities.starts_with(suffix, $$$i)) && (!suffix.equalp($$$ing))) && (NIL != list_utilities.lengthG(suffix, ONE_INTEGER, UNPROVIDED))) && (NIL != polysyllabicP(base, UNPROVIDED))) && (NIL != starts_with_consonantP(string_utilities.substring(suffix, ONE_INTEGER, UNPROVIDED)))) {
            while (NIL != ends_with_vowelP(base)) {
                base = string_utilities.strip_final(base, UNPROVIDED);
            } 
        }
        return base;
    }

    public static SubLObject aes_change_ie_to_y(SubLObject base, final SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$ie, UNPROVIDED)) && (NIL != string_utilities.starts_with(suffix, $$$i))) {
            base = cconcatenate(string_utilities.strip_final(base, TWO_INTEGER), $$$y);
        }
        return base;
    }

    public static SubLObject aes_change_ism_to_ist(SubLObject base, final SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$ism, UNPROVIDED)) && (NIL != Strings.string_equal(suffix, $$$ist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = string_utilities.remove_substring(base, $$$ism);
        }
        return base;
    }

    public static SubLObject aes_change_ceive_to_cept(SubLObject base, final SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$ceive, UNPROVIDED)) && (NIL != Strings.string_equal(suffix, $$$ion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = cconcatenate(string_utilities.remove_substring(base, $$$ive), $$$pt);
        }
        return base;
    }

    public static SubLObject aes_change_vert_to_vers(SubLObject base, final SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$vert, UNPROVIDED)) && (NIL != Strings.string_equal(suffix, $$$ion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = cconcatenate(string_utilities.post_remove(base, $$$vert, UNPROVIDED), $$$vers);
        }
        return base;
    }

    public static SubLObject aes_change_duce_to_duct(SubLObject base, final SubLObject suffix) {
        if ((NIL != string_utilities.ends_with(base, $$$duce, UNPROVIDED)) && (NIL != Strings.string_equal(suffix, $$$ion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = cconcatenate(string_utilities.post_remove(base, $$$e, UNPROVIDED), $$$t);
        }
        return base;
    }

    public static SubLObject aes_remove_able_le_before_ly(SubLObject base, final SubLObject suffix) {
        if (((NIL != string_utilities.ends_with(base, $$$able, UNPROVIDED)) || (NIL != string_utilities.ends_with(base, $$$ible, UNPROVIDED))) && (NIL != Strings.string_equal(suffix, $$$ly, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            base = string_utilities.remove_substring(base, $$$le);
        }
        return base;
    }

    public static SubLObject aes_de_to_se(SubLObject base, final SubLObject suffix) {
        if ((((NIL != string_utilities.ends_with(base, $$$de, UNPROVIDED)) && (NIL != string_utilities.starts_with(suffix, $$$i))) && (NIL == string_utilities.starts_with(suffix, $$$is))) && (NIL == subl_promotions.memberP(suffix, $list76, symbol_function(EQUAL), UNPROVIDED))) {
            base = cconcatenate(string_utilities.post_remove(base, $$$de, UNPROVIDED), $$$se);
        }
        return base;
    }

    public static SubLObject aes_geminate_last(SubLObject base, final SubLObject suffix) {
        if ((((((((((NIL != string_utilities.ends_with(base, $$$z, UNPROVIDED)) || (NIL != starts_with_vowelP(suffix))) || suffix.equalp($$$y)) && (NIL != ends_with_doublerP(base))) && (NIL == dont_geminate_beforeP(suffix))) && ((NIL != ends_in_cvcP(base)) || (NIL != ends_in_quvcP(base)))) && (((!suffix.equalp($$$ize)) && (!suffix.equalp($$$ise))) || (NIL != string_utilities.ends_with(base, $$$al, UNPROVIDED)))) && (((NIL == string_utilities.ends_with(base, $$$er, UNPROVIDED)) && (NIL == string_utilities.ends_with(base, $$$or, UNPROVIDED))) || ((NIL != string_utilities.ends_with(base, $$$fer, UNPROVIDED)) && (NIL == string_utilities.ends_with(base, $$$ffer, UNPROVIDED))))) && ((NIL == string_utilities.ends_with(base, $$$id, UNPROVIDED)) || (NIL != monosyllabicP(base)))) && ((NIL == string_utilities.ends_with_one_of(base, $list86)) || (NIL != monosyllabicP(base)))) {
            base = geminate_last(base);
        }
        return base;
    }

    public static SubLObject dont_geminate_beforeP(final SubLObject suffix) {
        return makeBoolean((suffix.equalp($$$able) || suffix.equalp($$$ity)) || suffix.equalp($$$alicious));
    }

    public static SubLObject aes_able_to_ate(SubLObject base, final SubLObject suffix) {
        if ((NIL == string_utilities.ends_with(base, $$$ate, UNPROVIDED)) || (NIL == Strings.string_equal(suffix, $$$able, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return base;
        }
        if (estimated_syllable_count(base).numLE(TWO_INTEGER)) {
            base = string_utilities.post_remove(base, $$$e, UNPROVIDED);
            return base;
        }
        if (NIL != subl_promotions.memberP(base, $special_ate_cases$.getGlobalValue(), EQUALP, UNPROVIDED)) {
            base = string_utilities.remove_substring(base, $$$ate);
            return base;
        }
        base = string_utilities.post_remove(base, $$$e, UNPROVIDED);
        return base;
    }

    public static SubLObject try_regular_adj_morphologyP(final SubLObject base_form) {
        final SubLObject cutoff = $comparative_syllable_cutoff$.getGlobalValue();
        return makeBoolean((NIL == string_utilities.ends_with(base_form, $$$ed, UNPROVIDED)) && estimated_syllable_count(base_form).numLE(cutoff));
    }

    public static SubLObject most_form(final SubLObject string) {
        return cconcatenate($most_prefix$.getGlobalValue(), string);
    }

    public static SubLObject more_form(final SubLObject string) {
        return cconcatenate($more_prefix$.getGlobalValue(), string);
    }

    public static SubLObject most_form_p(final SubLObject string) {
        return string_utilities.starts_with(string, $most_prefix$.getGlobalValue());
    }

    public static SubLObject more_form_p(final SubLObject string) {
        return string_utilities.starts_with(string, $more_prefix$.getGlobalValue());
    }

    public static SubLObject more_or_most_form(final SubLObject string, final SubLObject pred) {
        if (NIL != lexicon_cache.comparative_formP(pred)) {
            return more_form(string);
        }
        if (NIL != lexicon_cache.superlative_formP(pred)) {
            return most_form(string);
        }
        return more_form(string);
    }

    public static SubLObject more_or_most_form_p(final SubLObject string, final SubLObject pred) {
        if (NIL != lexicon_cache.comparative_formP(pred)) {
            return more_form_p(string);
        }
        if (NIL != lexicon_cache.superlative_formP(pred)) {
            return most_form_p(string);
        }
        return NIL;
    }

    public static SubLObject comparative_reg(final SubLObject string) {
        if (NIL != try_regular_adj_morphologyP(string)) {
            return add_english_suffix(string, $$$er);
        }
        return more_form(string);
    }

    public static SubLObject comparative_adverb_reg(final SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$ly, UNPROVIDED)) {
            return more_form(string);
        }
        return comparative_reg(string);
    }

    public static SubLObject superlative_reg(final SubLObject string) {
        if (NIL != try_regular_adj_morphologyP(string)) {
            return add_english_suffix(string, $$$est);
        }
        return most_form(string);
    }

    public static SubLObject superlative_adverb_reg(final SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$ly, UNPROVIDED)) {
            return most_form(string);
        }
        return superlative_reg(string);
    }

    public static SubLObject past_tense_reg(final SubLObject string) {
        return generate_regular_string_from_form($$pastTense_Universal, $$infinitive, string, UNPROVIDED);
    }

    public static SubLObject gerund_reg(final SubLObject string) {
        return generate_regular_string_from_form($$gerund, $$infinitive, string, UNPROVIDED);
    }

    public static SubLObject third_sg_reg(final SubLObject string) {
        return generate_regular_string_from_form($$thirdPersonSg_Present, $$infinitive, string, UNPROVIDED);
    }

    public static SubLObject plural_reg(final SubLObject string) {
        return correct_capitalization(string, generate_regular_string_from_form($$plural, $$singular, string, UNPROVIDED));
    }

    public static SubLObject pn_plural_reg(final SubLObject string) {
        return string_utilities.string_proper(pluralize_string(string, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject infinitive_to_third_sing(final SubLObject string) {
        final SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$infinitive, T, $$EnglishMt, UNPROVIDED);
        if (NIL != words) {
            final SubLObject word_to_use = words.first();
            final SubLObject irreg_stored_form = lexicon_utilities.verb_form_third_sing(word_to_use, UNPROVIDED);
            if (NIL != irreg_stored_form) {
                return irreg_stored_form;
            }
        }
        return generate_regular_string_from_form($$thirdPersonSg_Present, $$infinitive, string, UNPROVIDED);
    }

    public static SubLObject infinitive_to_pres_participle(final SubLObject string) {
        final SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$infinitive, T, $$EnglishMt, UNPROVIDED);
        if (NIL != words) {
            final SubLObject word_to_use = words.first();
            final SubLObject irreg_stored_form = lexicon_utilities.verb_form_pres_participle(word_to_use, UNPROVIDED);
            if (NIL != irreg_stored_form) {
                return irreg_stored_form;
            }
        }
        return generate_regular_string_from_form($$presentParticiple, $$infinitive, string, UNPROVIDED);
    }

    public static SubLObject possessivize_string(final SubLObject string, SubLObject pos_pred) {
        if (pos_pred == UNPROVIDED) {
            pos_pred = NIL;
        }
        if (!string.isString()) {
            return string;
        }
        final SubLObject lexical_possessive = english_lexical_possessive_version_of_string(string);
        if (lexical_possessive.isString()) {
            return lexical_possessive;
        }
        return cconcatenate(string, english_possessive_suffix_for_string(string, pos_pred));
    }

    public static SubLObject english_lexical_possessive_version_of_string(final SubLObject string) {
        final SubLObject pronominal_possessive = list_utilities.alist_lookup($english_possessive_pronouns$.getGlobalValue(), string, symbol_function(EQUALP), $NOT_FOUND);
        if (pronominal_possessive.isString()) {
            return pronominal_possessive;
        }
        return NIL;
    }

    public static SubLObject english_possessive_suffix_for_string(final SubLObject string, SubLObject pos_pred) {
        if (pos_pred == UNPROVIDED) {
            pos_pred = NIL;
        }
        SubLObject suffix = NIL;
        if ((NIL == pos_pred) && (NIL != plural_nounP(string))) {
            pos_pred = $$plural_Generic;
        }
        if (((NIL != forts.fort_p(pos_pred)) && (NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED))) && (NIL != lexicon_accessors.genl_pos_predP(pos_pred, $$plural_Generic, UNPROVIDED))) {
            suffix = $str103$_;
        }
        if (!suffix.isString()) {
            suffix = $str104$_s;
        }
        return suffix;
    }

    public static SubLObject locativize_string(final SubLObject string, final SubLObject denot) {
        if (NIL != not_locativizable_english_stringP(string)) {
            return string;
        }
        return cconcatenate(english_locative_preposition_for_denot(denot), new SubLObject[]{ $$$_, string });
    }

    public static SubLObject not_locativizable_english_stringP(final SubLObject v_object) {
        if (!v_object.isString()) {
            return T;
        }
        SubLObject ans = NIL;
        if (NIL != subl_promotions.memberP($$QuantifyingIndexical, lexicon_accessors.pos_of_string(v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            ans = T;
        }
        return ans;
    }

    public static SubLObject english_locative_preposition_for_denot(final SubLObject denot) {
        if (NIL != isa.isa_in_any_mtP(denot, $$GeographicalRegion)) {
            return $$$in;
        }
        if (NIL != isa.isa_in_any_mtP(denot, $$SurfaceRegion_Underspecified)) {
            return $$$on;
        }
        return $$$in;
    }

    public static SubLObject pluralize_string(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        SubLObject ans = NIL;
        ans = pluralize_string_wXlexicon(string, mt);
        if (NIL == ans) {
            final SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
            final SubLObject last_token = last(tokens, UNPROVIDED).first();
            if (NIL != list_utilities.lengthG(tokens, ONE_INTEGER, UNPROVIDED)) {
                final SubLObject plural_last_token = pluralize_string_wXlexicon(last_token, mt);
                if (NIL != plural_last_token) {
                    ans = cconcatenate(subseq(string, ZERO_INTEGER, subtract(length(string), length(last_token))), plural_last_token);
                }
            }
        }
        if (NIL == ans) {
            ans = plural_reg(string);
        }
        return correct_capitalization(string, ans);
    }

    public static SubLObject pluralize_string_wXlexicon(final SubLObject string, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != lexicon_initialized_p()) {
            final SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$singular_Generic, T, mt, UNPROVIDED);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                if (NIL == ans) {
                    SubLObject csome_list_var = words;
                    SubLObject word = NIL;
                    word = csome_list_var.first();
                    while ((NIL == ans) && (NIL != csome_list_var)) {
                        if (NIL == ans) {
                            SubLObject csome_list_var_$12 = lexicon_accessors.preds_of_stringXword(string, word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject singular_pred = NIL;
                            singular_pred = csome_list_var_$12.first();
                            while ((NIL == ans) && (NIL != csome_list_var_$12)) {
                                final SubLObject plural_pred = lexicon_accessors.plural_pred(lexicon_accessors.pos_of_pred(singular_pred));
                                if (NIL != plural_pred) {
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
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL != ans ? correct_capitalization(string, ans) : NIL;
    }

    public static SubLObject singularize_string(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        SubLObject ans = NIL;
        ans = singularize_string_wXlexicon(string, mt);
        if (NIL == ans) {
            final SubLObject tokens = nl_trie.nl_trie_string_tokenize(string);
            final SubLObject last_token = last(tokens, UNPROVIDED).first();
            if (NIL != list_utilities.lengthG(tokens, ONE_INTEGER, UNPROVIDED)) {
                final SubLObject singular_last_token = singularize_string_wXlexicon(last_token, mt);
                if (NIL != singular_last_token) {
                    ans = cconcatenate(subseq(string, ZERO_INTEGER, subtract(length(string), length(last_token))), singular_last_token);
                }
            }
        }
        if (NIL == ans) {
            ans = singular_reg(string);
        }
        return correct_capitalization(string, ans);
    }

    public static SubLObject singularize_string_wXlexicon(final SubLObject string, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != lexicon_initialized_p()) {
            final SubLObject words = lexicon_accessors.words_of_stringXpred(string, $$plural_Generic, T, mt, UNPROVIDED);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                if (NIL == ans) {
                    SubLObject csome_list_var = words;
                    SubLObject word = NIL;
                    word = csome_list_var.first();
                    while ((NIL == ans) && (NIL != csome_list_var)) {
                        if (NIL == ans) {
                            SubLObject csome_list_var_$13 = lexicon_accessors.preds_of_stringXword(string, word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject plural_pred = NIL;
                            plural_pred = csome_list_var_$13.first();
                            while ((NIL == ans) && (NIL != csome_list_var_$13)) {
                                final SubLObject singular_pred = lexicon_accessors.singular_pred(lexicon_accessors.pos_of_pred(plural_pred));
                                if (NIL != singular_pred) {
                                    ans = lexicon_cache.first_string_of_wordXpred(word, singular_pred, UNPROVIDED);
                                }
                                csome_list_var_$13 = csome_list_var_$13.rest();
                                plural_pred = csome_list_var_$13.first();
                            } 
                        }
                        csome_list_var = csome_list_var.rest();
                        word = csome_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL != ans ? correct_capitalization(string, ans) : NIL;
    }

    public static SubLObject has_word_for_string_and_pos(final SubLObject string, final SubLObject pos_keyword) {
        SubLObject word_units = NIL;
        if (NIL == string_utilities.non_empty_string_p(string)) {
            return NIL;
        }
        if (NIL == word_units) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = lexification_utilities.basic_preds_for_part_of_speech(pos_keyword), pred = NIL, pred = csome_list_var.first(); (NIL == word_units) && (NIL != csome_list_var); word_units = lexicon_accessors.words_of_stringXpred(string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
            }
        }
        return word_units;
    }

    public static SubLObject has_word_for_string_and_pos_list(final SubLObject string, final SubLObject pos_keyword_list) {
        SubLObject has_mapping = NIL;
        if (NIL == has_mapping) {
            SubLObject csome_list_var;
            SubLObject pos;
            for (csome_list_var = pos_keyword_list, pos = NIL, pos = csome_list_var.first(); (NIL == has_mapping) && (NIL != csome_list_var); has_mapping = has_word_for_string_and_pos(string, pos) , csome_list_var = csome_list_var.rest() , pos = csome_list_var.first()) {
            }
        }
        return has_mapping;
    }

    public static SubLObject is_word(final SubLObject string) {
        return lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject is_noun(final SubLObject string) {
        return has_word_for_string_and_pos_list(string, $list111);
    }

    public static SubLObject is_verb(final SubLObject string) {
        return has_word_for_string_and_pos(string, $VERB);
    }

    public static SubLObject is_noun_or_verb(final SubLObject string) {
        return has_word_for_string_and_pos_list(string, $list113);
    }

    public static SubLObject clear_find_stem_memoized() {
        final SubLObject cs = $find_stem_memoized_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_find_stem_memoized(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = $ANY;
        }
        return memoization_state.caching_state_remove_function_results_with_args($find_stem_memoized_caching_state$.getGlobalValue(), list(word, pos_keyword), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject find_stem_memoized_internal(final SubLObject word, final SubLObject pos_keyword) {
        return find_stem(word, pos_keyword);
    }

    public static SubLObject find_stem_memoized(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = $ANY;
        }
        SubLObject caching_state = $find_stem_memoized_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FIND_STEM_MEMOIZED, $find_stem_memoized_caching_state$, $int$16384, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_FIND_STEM_MEMOIZED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word, pos_keyword);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && pos_keyword.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(find_stem_memoized_internal(word, pos_keyword)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word, pos_keyword));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject find_stem(final SubLObject string, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = $ANY;
        }
        SubLObject stem = NIL;
        if (NIL == lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED)) {
            if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
                final SubLObject y_stem = string_utilities.post_fix(string_utilities.strip_trailer(string, $$$ies), $$$y);
                final SubLObject minus_s = string_utilities.strip_final(string, UNPROVIDED);
                if (NIL != is_noun_or_verb(minus_s)) {
                    stem = minus_s;
                } else {
                    stem = y_stem;
                }
            } else
                if (NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) {
                    if (NIL == string_utilities.ends_with(string, $$$ss, UNPROVIDED)) {
                        final SubLObject minus_s2 = string_utilities.strip_final(string, UNPROVIDED);
                        final SubLObject minus_es = (NIL != string_utilities.ends_with(minus_s2, $$$e, UNPROVIDED)) ? string_utilities.strip_final(minus_s2, UNPROVIDED) : NIL;
                        if (NIL != is_noun_or_verb(minus_s2)) {
                            stem = minus_s2;
                        } else
                            if ((NIL != minus_es) && (NIL != is_noun_or_verb(minus_es))) {
                                stem = minus_es;
                            } else
                                if (NIL != minus_es) {
                                    if (NIL == stem) {
                                        SubLObject csome_list_var = $list121;
                                        SubLObject ending = NIL;
                                        ending = csome_list_var.first();
                                        while ((NIL == stem) && (NIL != csome_list_var)) {
                                            if (NIL != string_utilities.ends_with(minus_es, ending, UNPROVIDED)) {
                                                stem = minus_es;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            ending = csome_list_var.first();
                                        } 
                                    }
                                    if (NIL != string_utilities.ends_with(minus_es, $$$z, UNPROVIDED)) {
                                        final SubLObject minus_zes = string_utilities.strip_final(minus_es, UNPROVIDED);
                                        if ((NIL != string_utilities.ends_with(minus_zes, $$$z, UNPROVIDED)) && (NIL != is_noun_or_verb(minus_zes))) {
                                            stem = minus_zes;
                                        }
                                    }
                                    if (NIL == stem) {
                                        stem = minus_s2;
                                    }
                                }


                    }
                } else
                    if (((pos_keyword == $ANY) || (pos_keyword == $VERB)) && (NIL != string_utilities.ends_with(string, $$$ing, UNPROVIDED))) {
                        final SubLObject minus_ing = string_utilities.strip_trailer(string, $$$ing);
                        final SubLObject minus_4 = string_utilities.strip_final(minus_ing, UNPROVIDED);
                        final SubLObject plus_e = string_utilities.post_fix(minus_ing, $$$e);
                        SubLObject ordered_tests = list(minus_ing, plus_e);
                        if (NIL != ends_with_doublerP(minus_ing)) {
                            if (NIL != string_utilities.ends_in_geminateP(minus_ing)) {
                                ordered_tests = cons(minus_4, ordered_tests);
                                ordered_tests = cons(minus_ing, ordered_tests);
                            }
                            if (NIL != ends_in_cvcP(minus_ing)) {
                                ordered_tests = cons(plus_e, ordered_tests);
                            }
                        }
                        if (NIL == stem) {
                            SubLObject csome_list_var2 = ordered_tests;
                            SubLObject verb_form = NIL;
                            verb_form = csome_list_var2.first();
                            while ((NIL == stem) && (NIL != csome_list_var2)) {
                                if (NIL != is_verb(verb_form)) {
                                    stem = verb_form;
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                verb_form = csome_list_var2.first();
                            } 
                        }
                    } else
                        if (((pos_keyword == $ANY) || (pos_keyword == $VERB)) && (NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED))) {
                            final SubLObject minus_d = string_utilities.strip_final(string, UNPROVIDED);
                            final SubLObject minus_ed = string_utilities.strip_trailer(string, $$$ed);
                            final SubLObject minus_5 = string_utilities.strip_final(minus_ed, UNPROVIDED);
                            if (NIL != is_verb(minus_d)) {
                                stem = minus_d;
                            }
                            if ((NIL == stem) && (NIL != is_verb(minus_ed))) {
                                stem = minus_ed;
                            }
                            if ((NIL == stem) && (NIL != is_word(string))) {
                                stem = string;
                            }
                            if (NIL == stem) {
                                if ((NIL != ends_with_doublerP(minus_ed)) && (NIL != string_utilities.ends_in_geminateP(minus_ed))) {
                                    stem = minus_5;
                                } else {
                                    stem = minus_d;
                                }
                            }
                        } else
                            if ((NIL != string_utilities.ends_with(string, $$$z, UNPROVIDED)) && ((NIL != is_noun(string_utilities.strip_trailer(string, $$$z))) || (NIL != lexicon_accessors.denots_of_acronym_string(string_utilities.strip_trailer(string, $$$z), UNPROVIDED, UNPROVIDED)))) {
                                stem = string_utilities.strip_trailer(string, $$$z);
                            }




        }
        if (NIL == stem) {
            stem = string;
        }
        return stem;
    }

    public static SubLObject inflected_verb_to_infinitive(SubLObject string) {
        SubLObject stem = NIL;
        if (NIL != string_utilities.ends_with(string, $$$ied, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$ied);
            string = string_utilities.post_fix(stem, $$$y);
            return string;
        }
        if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$ies);
            string = string_utilities.post_fix(stem, $$$y);
            return string;
        }
        if (NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$ed);
            if (NIL != string_utilities.ends_with(stem, $$$y, UNPROVIDED)) {
                return stem;
            }
            if (NIL == string_utilities.ends_in_geminateP(stem)) {
                return stem;
            }
            if (NIL != string_utilities.ends_with(stem, $$$l, UNPROVIDED)) {
                return stem;
            }
            return string_utilities.strip_final(stem, UNPROVIDED);
        } else {
            if (NIL != string_utilities.ends_with(string, $$$d, UNPROVIDED)) {
                string = string_utilities.strip_trailer(string, $$$d);
            }
            if (NIL == string_utilities.ends_with(string, $$$ing, UNPROVIDED)) {
                if (NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) {
                    string = third_sg_verb_to_infinitive(string);
                }
                return string;
            }
            stem = string_utilities.strip_trailer(string, $$$ing);
            if ((NIL != string_utilities.ends_in_geminateP(stem)) && (NIL == string_utilities.ends_with(stem, $$$l, UNPROVIDED))) {
                return string_utilities.strip_final(stem, UNPROVIDED);
            }
            return stem;
        }
    }

    public static SubLObject agentive_to_infinitive(final SubLObject string) {
        SubLObject stem = NIL;
        if (NIL != string_utilities.ends_with(string, $$$or, UNPROVIDED)) {
            return string_utilities.strip_trailer(string, $$$or);
        }
        if (NIL == string_utilities.ends_with(string, $$$er, UNPROVIDED)) {
            return NIL;
        }
        stem = string_utilities.strip_trailer(string, $$$er);
        if (NIL != nl_trie_accessors.nl_trie_words_of_stringXpred(stem, $$infinitive, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return stem;
        }
        return string_utilities.strip_trailer(string, $$$r);
    }

    public static SubLObject third_sg_verb_to_infinitive(final SubLObject string) {
        SubLObject stem = NIL;
        if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
            stem = string_utilities.post_fix(string_utilities.strip_trailer(string, $$$ies), $$$y);
            return stem;
        }
        if (NIL != string_utilities.ends_with(string, $$$es, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$es);
            SubLObject cdolist_list_var = $sibilant_endings$.getGlobalValue();
            SubLObject ending = NIL;
            ending = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != string_utilities.ends_with(stem, ending, UNPROVIDED)) {
                    return stem;
                }
                cdolist_list_var = cdolist_list_var.rest();
                ending = cdolist_list_var.first();
            } 
        }
        if ((NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) && (NIL == string_utilities.ends_with(string, $$$ss, UNPROVIDED))) {
            return string_utilities.strip_trailer(string, $$$s);
        }
        return string;
    }

    public static SubLObject plural_noun_to_sg(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        return singularize_string(string, mt);
    }

    public static SubLObject singular_reg(SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $preserve_case_in_singular_regP$.getDynamicValue(thread)) {
            string = Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
        }
        SubLObject stem = NIL;
        if (NIL != string_utilities.ends_with(string, $$$ies, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$ies);
            string = string_utilities.post_fix(stem, $$$y);
            return string;
        }
        if (NIL != string_utilities.ends_with(string, $$$es, UNPROVIDED)) {
            stem = string_utilities.strip_trailer(string, $$$es);
            SubLObject cdolist_list_var = $sibilant_endings$.getGlobalValue();
            SubLObject ending = NIL;
            ending = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != string_utilities.ends_with(stem, ending, UNPROVIDED)) {
                    string = stem;
                    return string;
                }
                cdolist_list_var = cdolist_list_var.rest();
                ending = cdolist_list_var.first();
            } 
        }
        if (NIL != string_utilities.ends_with(string, $$$us, UNPROVIDED)) {
            if (string.equal($$$us)) {
                return string;
            }
            final SubLObject preceding_char = string_utilities.last_char(string_utilities.strip_trailer(string, $$$us));
            if (NIL != subl_promotions.memberP(preceding_char, $list129, UNPROVIDED, UNPROVIDED)) {
                return string;
            }
        }
        if ((NIL != string_utilities.ends_with(string, $$$s, UNPROVIDED)) && (NIL == string_utilities.ends_with(string, $$$ss, UNPROVIDED))) {
            string = string_utilities.strip_trailer(string, $$$s);
        }
        return string;
    }

    public static SubLObject plural_nounP(final SubLObject string) {
        if (NIL == string_utilities.ends_with(string, $$$s, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject stem = string_utilities.strip_final(string, UNPROVIDED);
        if (NIL != string_utilities.ends_with(stem, $$$s, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(stem, $$$e, UNPROVIDED)) {
            return T;
        }
        SubLObject ends_with_sibilant = NIL;
        if (NIL == ends_with_sibilant) {
            SubLObject csome_list_var;
            SubLObject ending;
            for (csome_list_var = $list130, ending = NIL, ending = csome_list_var.first(); (NIL == ends_with_sibilant) && (NIL != csome_list_var); ends_with_sibilant = string_utilities.ends_with(stem, ending, UNPROVIDED) , csome_list_var = csome_list_var.rest() , ending = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == ends_with_sibilant);
    }

    public static SubLObject infinitive_verbP(final SubLObject string) {
        if (string.eql(inflected_verb_to_infinitive(string))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject progressive_stringP(final SubLObject string) {
        if (NIL == string_utilities.ends_with(string, $$$ing, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject root = find_stem(string, UNPROVIDED);
        return makeBoolean((NIL == Strings.string_equal(root, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != lexicon_accessors.string_is_posP(root, $$Verb, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject perfect_stringP(final SubLObject string) {
        if ((NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$en, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject f_3sg_stringP(final SubLObject string) {
        return plural_nounP(string);
    }

    public static SubLObject numberspp(final SubLObject string) {
        if (read_from_string_ignoring_errors(string, NIL, NIL, UNPROVIDED, UNPROVIDED).isNumber()) {
            return T;
        }
        return NIL;
    }

    public static SubLObject comparative_degreeP(final SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$er, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject superlative_degreeP(final SubLObject string) {
        if (NIL != string_utilities.ends_with(string, $$$est, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject irregularP(final SubLObject wu, final SubLObject stem) {
        SubLObject cdolist_list_var;
        final SubLObject pos = cdolist_list_var = lexicon_accessors.pos_of_stringXword(stem, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pt = NIL;
        pt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (pt.eql($$CountNoun)) {
                return irregular_snP(wu);
            }
            if (pt.eql($$Verb)) {
                return irregular_verbP(wu);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pt = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject irregular_snP(final SubLObject wu) {
        return makeBoolean((NIL != lexicon_utilities.noun_form_singular(wu, UNPROVIDED)) && (NIL != lexicon_utilities.noun_form_plural(wu, UNPROVIDED)));
    }

    public static SubLObject irregular_anP(final SubLObject wu) {
        return makeBoolean((NIL != lexicon_utilities.ag_noun_form_singular(wu, UNPROVIDED)) && (NIL != lexicon_utilities.ag_noun_form_plural(wu, UNPROVIDED)));
    }

    public static SubLObject irregular_verbP(final SubLObject wu) {
        return makeBoolean((NIL != lexicon_utilities.verb_form_infinitive(wu, UNPROVIDED)) && (NIL != lexicon_utilities.verb_form_perfect(wu, UNPROVIDED)));
    }

    public static SubLObject pos_of_unknown_word(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject speech_parts = NIL;
        if (NIL != numberspp(string)) {
            final SubLObject item_var = $$Number_SP;
            if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                speech_parts = cons(item_var, speech_parts);
            }
        }
        if (NIL != $use_wn_linksP$.getGlobalValue()) {
            SubLObject cdolist_list_var;
            final SubLObject pos_keywords = cdolist_list_var = wordnet.pos_according_to_wn(string);
            SubLObject key = NIL;
            key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                speech_parts = cons(assoc(key, lexicon_vars.$wn_pos_cyc_pos_map$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest(), speech_parts);
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            } 
        }
        if (NIL == speech_parts) {
            if (NIL != proper_nounp(string)) {
                final SubLObject item_var = $$ProperCountNoun;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
            if (NIL != nounp(string)) {
                final SubLObject item_var = $$CountNoun;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
            if (NIL != adjectivep(string)) {
                final SubLObject item_var = $$Adjective;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
            if (NIL != verbp(string)) {
                final SubLObject item_var = $$Verb;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
            if (NIL != adverbp(string)) {
                final SubLObject item_var = $$Adverb;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
            if (NIL == speech_parts) {
                SubLObject item_var = $$Verb;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
                item_var = $$Adjective;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
                item_var = $$CountNoun;
                if (NIL == member(item_var, speech_parts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    speech_parts = cons(item_var, speech_parts);
                }
            }
        }
        return speech_parts;
    }

    public static SubLObject proper_nounp(final SubLObject string) {
        if (length(string).numG(ZERO_INTEGER) && (NIL != upper_case_p(Strings.sublisp_char(string, ZERO_INTEGER)))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject verbp(final SubLObject string) {
        SubLObject string_1 = NIL;
        string_1 = inflected_verb_to_infinitive(string);
        if (((((((NIL != string_utilities.ends_with(string_1, $$$ate, UNPROVIDED)) || (NIL != string_utilities.ends_with(string_1, $$$ize, UNPROVIDED))) || (NIL != string_utilities.ends_with(string_1, $$$yze, UNPROVIDED))) || (NIL != string_utilities.ends_with(string_1, $$$ify, UNPROVIDED))) || (NIL != string_utilities.ends_with(string_1, $$$en, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ing, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ed, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject nounp(SubLObject string) {
        string = plural_noun_to_sg(string, UNPROVIDED);
        if ((((((((((((((((((((((((((((((((((((((((((NIL != string_utilities.ends_with(string, $$$logy, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$ette, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ess, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$eer, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ity, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$omy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ion, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ist, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ics, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$geny, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ium, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$cracy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ism, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$itis, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$oma, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$lysis, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$hood, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ship, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$lty, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$meter, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$morph, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$morphy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$osis, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$stery, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ence, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$tude, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ance, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$graphy, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ment, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$age, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$dom, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ery, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ite, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$eer, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$let, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ling, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ster, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ant, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ee, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ity, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ese, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$an, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject adjectivep(final SubLObject string) {
        if (((((((((((((((((((NIL != string_utilities.ends_with(string, $$$ical, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$ous, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$less, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ier, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$est, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ive, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$nant, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$thic, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ible, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$able, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$etic, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$itic, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ful, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ish, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$like, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$y, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ial, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$esque, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ic, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject adverbp(final SubLObject string) {
        if ((((NIL != string_utilities.ends_with(string, $$$ly, UNPROVIDED)) || (NIL != string_utilities.ends_with(string, $$$wise, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$ward, UNPROVIDED))) || (NIL != string_utilities.ends_with(string, $$$wards, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pos_keyword_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return member(v_object, $pos_keywords$.getDynamicValue(thread), EQL, UNPROVIDED);
    }

    public static SubLObject root_predicate(final SubLObject pos) {
        if (pos.eql($PROPER_NOUN)) {
            return $$pnSingular;
        }
        if (pos.eql($NOUN)) {
            return $$singular;
        }
        if (pos.eql($VERB)) {
            return $$infinitive;
        }
        if (pos.eql($ADJECTIVE)) {
            return $$regularDegree;
        }
        if (pos.eql($ADVERB)) {
            return $$regularAdverb;
        }
        if (pos.eql($PREPOSITION)) {
            return $$prepositionStrings;
        }
        return NIL;
    }

    public static SubLObject get_root_of_head(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = NIL;
        }
        if ((NIL != Strings.string_equal(word, $str104$_s, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((NIL == pos_keyword) || pos_keyword.eql($VERB))) {
            return $$$be;
        }
        return get_root(word, pos_keyword);
    }

    public static SubLObject get_root(final SubLObject word, SubLObject pos_keyword) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(word) : "Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) " + word;
        if (((NIL != pos_keyword) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == pos_keyword_p(pos_keyword))) {
            throw new AssertionError(pos_keyword);
        }
        final SubLObject pos_keywords = (NIL != pos_keyword) ? list(pos_keyword) : $pos_keywords$.getDynamicValue(thread);
        SubLObject wu = NIL;
        SubLObject assertion = NIL;
        if (NIL == wu) {
            SubLObject csome_list_var;
            SubLObject pos;
            SubLObject expanded_wu;
            for (csome_list_var = pos_keywords, pos = NIL, pos = csome_list_var.first(); (NIL == wu) && (NIL != csome_list_var); wu = lexicon_accessors.words_of_stringXpos(word, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED).first() , expanded_wu = expand_contracted_root(wu) , wu = (NIL != expanded_wu) ? expanded_wu : wu , assertion = (NIL != wu) ? kb_mapping.gather_gaf_arg_index(wu, ONE_INTEGER, root_predicate(pos), $$GeneralEnglishMt, UNPROVIDED).first() : NIL , csome_list_var = csome_list_var.rest() , pos = csome_list_var.first()) {
            }
        }
        if (NIL != assertion) {
            return assertions_high.gaf_arg2(assertion);
        }
        SubLObject root = NIL;
        if (NIL == root) {
            SubLObject csome_list_var2;
            SubLObject pos2;
            for (csome_list_var2 = pos_keywords, pos2 = NIL, pos2 = csome_list_var2.first(); (NIL == root) && (NIL != csome_list_var2); root = find_stem(word, pos2) , csome_list_var2 = csome_list_var2.rest() , pos2 = csome_list_var2.first()) {
            }
        }
        return root;
    }

    public static SubLObject expand_contracted_root(final SubLObject wu) {
        if (NIL == lexicon_accessors.quick_lexical_wordP(wu, UNPROVIDED)) {
            return NIL;
        }
        if (wu.eql($$Be_Contracted)) {
            return $$Be_TheWord;
        }
        if (wu.eql($$Will_Contracted)) {
            return $$Will_TheModal;
        }
        if (wu.eql($$Have_Contracted)) {
            return $$Have_TheWord;
        }
        if (wu.eql($$Would_Contracted)) {
            return $$Would_TheWord;
        }
        return NIL;
    }

    public static SubLObject declare_morphology_file() {
        declareFunction(me, "get_vowel_positions", "GET-VOWEL-POSITIONS", 1, 0, false);
        declareFunction(me, "estimated_syllable_count", "ESTIMATED-SYLLABLE-COUNT", 1, 0, false);
        declareFunction(me, "monosyllabicP", "MONOSYLLABIC?", 1, 0, false);
        declareFunction(me, "polysyllabicP", "POLYSYLLABIC?", 1, 1, false);
        declareFunction(me, "vowel_charP", "VOWEL-CHAR?", 1, 1, false);
        declareFunction(me, "consonant_charP", "CONSONANT-CHAR?", 1, 0, false);
        declareFunction(me, "get_consonant_positions", "GET-CONSONANT-POSITIONS", 1, 0, false);
        declareFunction(me, "ends_with_vowelP", "ENDS-WITH-VOWEL?", 1, 0, false);
        declareFunction(me, "starts_with_vowelP", "STARTS-WITH-VOWEL?", 1, 0, false);
        declareFunction(me, "ends_with_consonantP", "ENDS-WITH-CONSONANT?", 1, 0, false);
        declareFunction(me, "starts_with_consonantP", "STARTS-WITH-CONSONANT?", 1, 0, false);
        declareFunction(me, "single_c_codaP", "SINGLE-C-CODA?", 1, 0, false);
        declareFunction(me, "ends_with_doublerP", "ENDS-WITH-DOUBLER?", 1, 0, false);
        declareFunction(me, "starts_with_unstressed_pfxP", "STARTS-WITH-UNSTRESSED-PFX?", 1, 0, false);
        declareFunction(me, "ends_in_cvcP", "ENDS-IN-CVC?", 1, 0, false);
        declareFunction(me, "ends_in_quvcP", "ENDS-IN-QUVC?", 1, 0, false);
        declareFunction(me, "make_geminate", "MAKE-GEMINATE", 2, 0, false);
        declareFunction(me, "geminate_last", "GEMINATE-LAST", 1, 0, false);
        declareFunction(me, "correct_capitalization", "CORRECT-CAPITALIZATION", 2, 0, false);
        declareFunction(me, "regular_string_function", "REGULAR-STRING-FUNCTION", 1, 0, false);
        declareFunction(me, "pos_preds_derivable_from_pred", "POS-PREDS-DERIVABLE-FROM-PRED", 1, 1, false);
        declareFunction(me, "clear_pos_preds_derivable_from_pred_int", "CLEAR-POS-PREDS-DERIVABLE-FROM-PRED-INT", 0, 0, false);
        declareFunction(me, "remove_pos_preds_derivable_from_pred_int", "REMOVE-POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false);
        declareFunction(me, "pos_preds_derivable_from_pred_int_internal", "POS-PREDS-DERIVABLE-FROM-PRED-INT-INTERNAL", 3, 0, false);
        declareFunction(me, "pos_preds_derivable_from_pred_int", "POS-PREDS-DERIVABLE-FROM-PRED-INT", 2, 1, false);
        declareFunction(me, "singular_form_for_pred", "SINGULAR-FORM-FOR-PRED", 1, 0, false);
        declareFunction(me, "plural_predP", "PLURAL-PRED?", 1, 1, false);
        declareFunction(me, "singular_predP", "SINGULAR-PRED?", 1, 1, false);
        declareFunction(me, "generate_z_form", "GENERATE-Z-FORM", 2, 0, false);
        declareFunction(me, "suffix_rules_for_pred", "SUFFIX-RULES-FOR-PRED", 1, 0, false);
        declareFunction(me, "generate_regular_string_from_form", "GENERATE-REGULAR-STRING-FROM-FORM", 3, 1, false);
        declareFunction(me, "generate_regular_strings_from_form", "GENERATE-REGULAR-STRINGS-FROM-FORM", 3, 3, false);
        declareFunction(me, "generate_regular_strings_from_form_int", "GENERATE-REGULAR-STRINGS-FROM-FORM-INT", 6, 0, false);
        declareFunction(me, "add_english_suffix", "ADD-ENGLISH-SUFFIX", 2, 0, false);
        declareFunction(me, "aes_do_orthographic_changes", "AES-DO-ORTHOGRAPHIC-CHANGES", 2, 0, false);
        declareFunction(me, "aes_do_orthographic_change_fns", "AES-DO-ORTHOGRAPHIC-CHANGE-FNS", 0, 0, false);
        declareFunction(me, "aes_do_orthographic_change", "AES-DO-ORTHOGRAPHIC-CHANGE", 4, 0, false);
        declareFunction(me, "ends_with_sibilantP", "ENDS-WITH-SIBILANT?", 1, 0, false);
        declareFunction(me, "aes_add_e_before_s", "AES-ADD-E-BEFORE-S", 2, 0, false);
        new morphology.$aes_add_e_before_s$BinaryFunction();
        declareFunction(me, "aes_ion_to_ation", "AES-ION-TO-ATION", 2, 0, false);
        declareFunction(me, "aes_change_y_to_i", "AES-CHANGE-Y-TO-I", 2, 0, false);
        new morphology.$aes_change_y_to_i$BinaryFunction();
        declareFunction(me, "aes_ble_to_bil_before_ity", "AES-BLE-TO-BIL-BEFORE-ITY", 2, 0, false);
        new morphology.$aes_ble_to_bil_before_ity$BinaryFunction();
        declareFunction(me, "aes_change_aic_to_ac", "AES-CHANGE-AIC-TO-AC", 2, 0, false);
        new morphology.$aes_change_aic_to_ac$BinaryFunction();
        declareFunction(me, "aes_strip_final_e", "AES-STRIP-FINAL-E", 2, 0, false);
        new morphology.$aes_strip_final_e$BinaryFunction();
        declareFunction(me, "aes_strip_final_vowels_before_ic", "AES-STRIP-FINAL-VOWELS-BEFORE-IC", 2, 0, false);
        new morphology.$aes_strip_final_vowels_before_ic$BinaryFunction();
        declareFunction(me, "aes_change_ie_to_y", "AES-CHANGE-IE-TO-Y", 2, 0, false);
        new morphology.$aes_change_ie_to_y$BinaryFunction();
        declareFunction(me, "aes_change_ism_to_ist", "AES-CHANGE-ISM-TO-IST", 2, 0, false);
        new morphology.$aes_change_ism_to_ist$BinaryFunction();
        declareFunction(me, "aes_change_ceive_to_cept", "AES-CHANGE-CEIVE-TO-CEPT", 2, 0, false);
        new morphology.$aes_change_ceive_to_cept$BinaryFunction();
        declareFunction(me, "aes_change_vert_to_vers", "AES-CHANGE-VERT-TO-VERS", 2, 0, false);
        declareFunction(me, "aes_change_duce_to_duct", "AES-CHANGE-DUCE-TO-DUCT", 2, 0, false);
        declareFunction(me, "aes_remove_able_le_before_ly", "AES-REMOVE-ABLE-LE-BEFORE-LY", 2, 0, false);
        new morphology.$aes_remove_able_le_before_ly$BinaryFunction();
        declareFunction(me, "aes_de_to_se", "AES-DE-TO-SE", 2, 0, false);
        declareFunction(me, "aes_geminate_last", "AES-GEMINATE-LAST", 2, 0, false);
        new morphology.$aes_geminate_last$BinaryFunction();
        declareFunction(me, "dont_geminate_beforeP", "DONT-GEMINATE-BEFORE?", 1, 0, false);
        declareFunction(me, "aes_able_to_ate", "AES-ABLE-TO-ATE", 2, 0, false);
        new morphology.$aes_able_to_ate$BinaryFunction();
        declareFunction(me, "try_regular_adj_morphologyP", "TRY-REGULAR-ADJ-MORPHOLOGY?", 1, 0, false);
        declareFunction(me, "most_form", "MOST-FORM", 1, 0, false);
        declareFunction(me, "more_form", "MORE-FORM", 1, 0, false);
        declareFunction(me, "most_form_p", "MOST-FORM-P", 1, 0, false);
        declareFunction(me, "more_form_p", "MORE-FORM-P", 1, 0, false);
        declareFunction(me, "more_or_most_form", "MORE-OR-MOST-FORM", 2, 0, false);
        declareFunction(me, "more_or_most_form_p", "MORE-OR-MOST-FORM-P", 2, 0, false);
        declareFunction(me, "comparative_reg", "COMPARATIVE-REG", 1, 0, false);
        declareFunction(me, "comparative_adverb_reg", "COMPARATIVE-ADVERB-REG", 1, 0, false);
        declareFunction(me, "superlative_reg", "SUPERLATIVE-REG", 1, 0, false);
        declareFunction(me, "superlative_adverb_reg", "SUPERLATIVE-ADVERB-REG", 1, 0, false);
        declareFunction(me, "past_tense_reg", "PAST-TENSE-REG", 1, 0, false);
        declareFunction(me, "gerund_reg", "GERUND-REG", 1, 0, false);
        declareFunction(me, "third_sg_reg", "THIRD-SG-REG", 1, 0, false);
        declareFunction(me, "plural_reg", "PLURAL-REG", 1, 0, false);
        declareFunction(me, "pn_plural_reg", "PN-PLURAL-REG", 1, 0, false);
        declareFunction(me, "infinitive_to_third_sing", "INFINITIVE-TO-THIRD-SING", 1, 0, false);
        declareFunction(me, "infinitive_to_pres_participle", "INFINITIVE-TO-PRES-PARTICIPLE", 1, 0, false);
        declareFunction(me, "possessivize_string", "POSSESSIVIZE-STRING", 1, 1, false);
        declareFunction(me, "english_lexical_possessive_version_of_string", "ENGLISH-LEXICAL-POSSESSIVE-VERSION-OF-STRING", 1, 0, false);
        declareFunction(me, "english_possessive_suffix_for_string", "ENGLISH-POSSESSIVE-SUFFIX-FOR-STRING", 1, 1, false);
        declareFunction(me, "locativize_string", "LOCATIVIZE-STRING", 2, 0, false);
        declareFunction(me, "not_locativizable_english_stringP", "NOT-LOCATIVIZABLE-ENGLISH-STRING?", 1, 0, false);
        declareFunction(me, "english_locative_preposition_for_denot", "ENGLISH-LOCATIVE-PREPOSITION-FOR-DENOT", 1, 0, false);
        declareFunction(me, "pluralize_string", "PLURALIZE-STRING", 1, 1, false);
        declareFunction(me, "pluralize_string_wXlexicon", "PLURALIZE-STRING-W/LEXICON", 2, 0, false);
        declareFunction(me, "singularize_string", "SINGULARIZE-STRING", 1, 1, false);
        declareFunction(me, "singularize_string_wXlexicon", "SINGULARIZE-STRING-W/LEXICON", 2, 0, false);
        declareFunction(me, "has_word_for_string_and_pos", "HAS-WORD-FOR-STRING-AND-POS", 2, 0, false);
        declareFunction(me, "has_word_for_string_and_pos_list", "HAS-WORD-FOR-STRING-AND-POS-LIST", 2, 0, false);
        declareFunction(me, "is_word", "IS-WORD", 1, 0, false);
        declareFunction(me, "is_noun", "IS-NOUN", 1, 0, false);
        declareFunction(me, "is_verb", "IS-VERB", 1, 0, false);
        declareFunction(me, "is_noun_or_verb", "IS-NOUN-OR-VERB", 1, 0, false);
        declareFunction(me, "clear_find_stem_memoized", "CLEAR-FIND-STEM-MEMOIZED", 0, 0, false);
        declareFunction(me, "remove_find_stem_memoized", "REMOVE-FIND-STEM-MEMOIZED", 1, 1, false);
        declareFunction(me, "find_stem_memoized_internal", "FIND-STEM-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction(me, "find_stem_memoized", "FIND-STEM-MEMOIZED", 1, 1, false);
        declareFunction(me, "find_stem", "FIND-STEM", 1, 1, false);
        declareFunction(me, "inflected_verb_to_infinitive", "INFLECTED-VERB-TO-INFINITIVE", 1, 0, false);
        declareFunction(me, "agentive_to_infinitive", "AGENTIVE-TO-INFINITIVE", 1, 0, false);
        declareFunction(me, "third_sg_verb_to_infinitive", "THIRD-SG-VERB-TO-INFINITIVE", 1, 0, false);
        declareFunction(me, "plural_noun_to_sg", "PLURAL-NOUN-TO-SG", 1, 1, false);
        declareFunction(me, "singular_reg", "SINGULAR-REG", 1, 0, false);
        declareFunction(me, "plural_nounP", "PLURAL-NOUN?", 1, 0, false);
        declareFunction(me, "infinitive_verbP", "INFINITIVE-VERB?", 1, 0, false);
        declareFunction(me, "progressive_stringP", "PROGRESSIVE-STRING?", 1, 0, false);
        declareFunction(me, "perfect_stringP", "PERFECT-STRING?", 1, 0, false);
        declareFunction(me, "f_3sg_stringP", "3SG-STRING?", 1, 0, false);
        declareFunction(me, "numberspp", "NUMBERSPP", 1, 0, false);
        declareFunction(me, "comparative_degreeP", "COMPARATIVE-DEGREE?", 1, 0, false);
        declareFunction(me, "superlative_degreeP", "SUPERLATIVE-DEGREE?", 1, 0, false);
        declareFunction(me, "irregularP", "IRREGULAR?", 2, 0, false);
        declareFunction(me, "irregular_snP", "IRREGULAR-SN?", 1, 0, false);
        declareFunction(me, "irregular_anP", "IRREGULAR-AN?", 1, 0, false);
        declareFunction(me, "irregular_verbP", "IRREGULAR-VERB?", 1, 0, false);
        declareFunction(me, "pos_of_unknown_word", "POS-OF-UNKNOWN-WORD", 1, 0, false);
        declareFunction(me, "proper_nounp", "PROPER-NOUNP", 1, 0, false);
        declareFunction(me, "verbp", "VERBP", 1, 0, false);
        declareFunction(me, "nounp", "NOUNP", 1, 0, false);
        declareFunction(me, "adjectivep", "ADJECTIVEP", 1, 0, false);
        declareFunction(me, "adverbp", "ADVERBP", 1, 0, false);
        declareFunction(me, "pos_keyword_p", "POS-KEYWORD-P", 1, 0, false);
        declareFunction(me, "root_predicate", "ROOT-PREDICATE", 1, 0, false);
        declareFunction(me, "get_root_of_head", "GET-ROOT-OF-HEAD", 1, 1, false);
        declareFunction(me, "get_root", "GET-ROOT", 1, 1, false);
        declareFunction(me, "expand_contracted_root", "EXPAND-CONTRACTED-ROOT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_morphology_file() {
        defconstant("*VOWELS*", $$$aeiou);
        defconstant("*BIGRAPH-VOWELS*", $list4);
        defconstant("*SIBILANT-ENDINGS*", $list5);
        defconstant("*CONSONANTS*", $$$bcdfghjklmnprstvxz);
        defconstant("*DOUBLERS*", $$$bdfgklmnprtvz);
        defconstant("*UNSTRESSED-LATIN-PFXS*", $list8);
        defconstant("*SPECIAL-ATE-CASES*", $list9);
        defconstant("*LIQUIDS*", $list10);
        defconstant("*VOWELS*-PLUS-Y*", cconcatenate($vowels$.getGlobalValue(), $$$y));
        deflexical("*POS-PREDS-DERIVABLE-FROM-PRED-INT-CACHING-STATE*", NIL);
        deflexical("*AES-DO-ORTHOGRAPHIC-CHANGE-FNS*", $list46);
        deflexical("*COMPARATIVE-SYLLABLE-CUTOFF*", TWO_INTEGER);
        defconstant("*MORE-PREFIX*", $$$more_);
        defconstant("*MOST-PREFIX*", $$$most_);
        defconstant("*ENGLISH-POSSESSIVE-PRONOUNS*", $list101);
        deflexical("*FIND-STEM-MEMOIZED-CACHING-STATE*", NIL);
        defparameter("*PRESERVE-CASE-IN-SINGULAR-REG?*", NIL);
        defparameter("*POS-KEYWORDS*", $list193);
        return NIL;
    }

    public static SubLObject setup_morphology_file() {
        lexicon_vars.$morphology_code_revision$.setGlobalValue($str0$_Revision__149757__);
        lexicon_vars.declare_noop_updates_for_lexicon_global($morphology_code_revision$, $list2);
        memoization_state.note_globally_cached_function(POS_PREDS_DERIVABLE_FROM_PRED_INT);
        memoization_state.note_globally_cached_function(FIND_STEM_MEMOIZED);
        register_external_symbol(PLURAL_NOUN_TO_SG);
        return NIL;
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










































































































































































































































    }

    public static final class $aes_add_e_before_s$BinaryFunction extends BinaryFunction {
        public $aes_add_e_before_s$BinaryFunction() {
            super(extractFunctionNamed("AES-ADD-E-BEFORE-S"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_add_e_before_s(arg1, arg2);
        }
    }

    public static final class $aes_change_y_to_i$BinaryFunction extends BinaryFunction {
        public $aes_change_y_to_i$BinaryFunction() {
            super(extractFunctionNamed("AES-CHANGE-Y-TO-I"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_change_y_to_i(arg1, arg2);
        }
    }

    public static final class $aes_ble_to_bil_before_ity$BinaryFunction extends BinaryFunction {
        public $aes_ble_to_bil_before_ity$BinaryFunction() {
            super(extractFunctionNamed("AES-BLE-TO-BIL-BEFORE-ITY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_ble_to_bil_before_ity(arg1, arg2);
        }
    }

    public static final class $aes_change_aic_to_ac$BinaryFunction extends BinaryFunction {
        public $aes_change_aic_to_ac$BinaryFunction() {
            super(extractFunctionNamed("AES-CHANGE-AIC-TO-AC"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_change_aic_to_ac(arg1, arg2);
        }
    }

    public static final class $aes_strip_final_e$BinaryFunction extends BinaryFunction {
        public $aes_strip_final_e$BinaryFunction() {
            super(extractFunctionNamed("AES-STRIP-FINAL-E"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_strip_final_e(arg1, arg2);
        }
    }

    public static final class $aes_strip_final_vowels_before_ic$BinaryFunction extends BinaryFunction {
        public $aes_strip_final_vowels_before_ic$BinaryFunction() {
            super(extractFunctionNamed("AES-STRIP-FINAL-VOWELS-BEFORE-IC"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_strip_final_vowels_before_ic(arg1, arg2);
        }
    }

    public static final class $aes_change_ie_to_y$BinaryFunction extends BinaryFunction {
        public $aes_change_ie_to_y$BinaryFunction() {
            super(extractFunctionNamed("AES-CHANGE-IE-TO-Y"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_change_ie_to_y(arg1, arg2);
        }
    }

    public static final class $aes_change_ism_to_ist$BinaryFunction extends BinaryFunction {
        public $aes_change_ism_to_ist$BinaryFunction() {
            super(extractFunctionNamed("AES-CHANGE-ISM-TO-IST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_change_ism_to_ist(arg1, arg2);
        }
    }

    public static final class $aes_change_ceive_to_cept$BinaryFunction extends BinaryFunction {
        public $aes_change_ceive_to_cept$BinaryFunction() {
            super(extractFunctionNamed("AES-CHANGE-CEIVE-TO-CEPT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_change_ceive_to_cept(arg1, arg2);
        }
    }

    public static final class $aes_remove_able_le_before_ly$BinaryFunction extends BinaryFunction {
        public $aes_remove_able_le_before_ly$BinaryFunction() {
            super(extractFunctionNamed("AES-REMOVE-ABLE-LE-BEFORE-LY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_remove_able_le_before_ly(arg1, arg2);
        }
    }

    public static final class $aes_geminate_last$BinaryFunction extends BinaryFunction {
        public $aes_geminate_last$BinaryFunction() {
            super(extractFunctionNamed("AES-GEMINATE-LAST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_geminate_last(arg1, arg2);
        }
    }

    public static final class $aes_able_to_ate$BinaryFunction extends BinaryFunction {
        public $aes_able_to_ate$BinaryFunction() {
            super(extractFunctionNamed("AES-ABLE-TO-ATE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return aes_able_to_ate(arg1, arg2);
        }
    }
}

/**
 * Total time: 672 ms synthetic
 */
