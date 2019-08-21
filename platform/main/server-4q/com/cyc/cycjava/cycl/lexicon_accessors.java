package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.lexicon_accessors.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_asterisk;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class lexicon_accessors extends SubLTranslatedFile {
    public static final SubLFile me = new lexicon_accessors();

    public static final String myName = "com.cyc.cycjava.cycl.lexicon_accessors";

    public static final String myFingerPrint = "cff6f0e453e2d62571677ec198f0293d2be78f7bbaf5f1ef400f1c1af4356775";

    // deflexical
    private static final SubLSymbol $genl_lexicon_mtP_cached_caching_state$ = makeSymbol("*GENL-LEXICON-MT?-CACHED-CACHING-STATE*");

















    // deflexical
    private static final SubLSymbol $genl_pos_predP_caching_state$ = makeSymbol("*GENL-POS-PRED?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $genl_pos_pred_from_mt_infoP_caching_state$ = makeSymbol("*GENL-POS-PRED-FROM-MT-INFO?-CACHING-STATE*");





    // deflexical
    private static final SubLSymbol $preds_of_stringXword_cached_caching_state$ = makeSymbol("*PREDS-OF-STRING&WORD-CACHED-CACHING-STATE*");









    // defparameter
    private static final SubLSymbol $preposition_strings$ = makeSymbol("*PREPOSITION-STRINGS*");

    // deflexical
    private static final SubLSymbol $pos_forms_spec_preds$ = makeSymbol("*POS-FORMS-SPEC-PREDS*");



    // deflexical
    private static final SubLSymbol $verb_only_stringP_caching_state$ = makeSymbol("*VERB-ONLY-STRING?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $indirect_lexical_assertionP_caching_state$ = makeSymbol("*INDIRECT-LEXICAL-ASSERTION?-CACHING-STATE*");









    // deflexical
    private static final SubLSymbol $genl_posP_caching_state$ = makeSymbol("*GENL-POS?-CACHING-STATE*");

    // deflexical
    public static final SubLSymbol $most_general_speech_part$ = makeSymbol("*MOST-GENERAL-SPEECH-PART*");



    // deflexical
    private static final SubLSymbol $relational_noun_denot_templates$ = makeSymbol("*RELATIONAL-NOUN-DENOT-TEMPLATES*");

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol $sym2$GENL_LEXICON_MT__CACHED = makeSymbol("GENL-LEXICON-MT?-CACHED");

    private static final SubLSymbol $sym3$_GENL_LEXICON_MT__CACHED_CACHING_STATE_ = makeSymbol("*GENL-LEXICON-MT?-CACHED-CACHING-STATE*");



    private static final SubLSymbol $sym5$CLEAR_GENL_LEXICON_MT__CACHED = makeSymbol("CLEAR-GENL-LEXICON-MT?-CACHED");



    private static final SubLSymbol $sym7$SPEECH_PART_ = makeSymbol("SPEECH-PART?");





    private static final SubLSymbol MAX_PREDS_MATCHING_POS_CACHED = makeSymbol("MAX-PREDS-MATCHING-POS-CACHED");

    private static final SubLSymbol $max_preds_matching_pos_cached_caching_state$ = makeSymbol("*MAX-PREDS-MATCHING-POS-CACHED-CACHING-STATE*");



    private static final SubLSymbol MAX_PREDS_OF_POS = makeSymbol("MAX-PREDS-OF-POS");

    private static final SubLSymbol $max_preds_of_pos_caching_state$ = makeSymbol("*MAX-PREDS-OF-POS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_MAX_PREDS_OF_POS = makeSymbol("CLEAR-MAX-PREDS-OF-POS");

    private static final SubLSymbol MAX_PREDS_LICENSED_BY_POS = makeSymbol("MAX-PREDS-LICENSED-BY-POS");

    private static final SubLSymbol $max_preds_licensed_by_pos_caching_state$ = makeSymbol("*MAX-PREDS-LICENSED-BY-POS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_MAX_PREDS_LICENSED_BY_POS = makeSymbol("CLEAR-MAX-PREDS-LICENSED-BY-POS");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLList $list21 = cons(makeSymbol("NOW"), makeSymbol("LATER"));

    private static final SubLSymbol LEX_REMOVE_SPEC_PREDS_HELPER = makeSymbol("LEX-REMOVE-SPEC-PREDS-HELPER");

    private static final SubLSymbol SPEECH_PART_PRED_MIN_CEILINGS_INT = makeSymbol("SPEECH-PART-PRED-MIN-CEILINGS-INT");

    private static final SubLSymbol $speech_part_pred_min_ceilings_int_caching_state$ = makeSymbol("*SPEECH-PART-PRED-MIN-CEILINGS-INT-CACHING-STATE*");



    private static final SubLSymbol CLEAR_SPEECH_PART_PRED_MIN_CEILINGS_INT = makeSymbol("CLEAR-SPEECH-PART-PRED-MIN-CEILINGS-INT");

    private static final SubLSymbol SPEECH_PART_PRED_MAX_FLOORS_INT = makeSymbol("SPEECH-PART-PRED-MAX-FLOORS-INT");

    private static final SubLSymbol $speech_part_pred_max_floors_int_caching_state$ = makeSymbol("*SPEECH-PART-PRED-MAX-FLOORS-INT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_SPEECH_PART_PRED_MAX_FLOORS_INT = makeSymbol("CLEAR-SPEECH-PART-PRED-MAX-FLOORS-INT");

    private static final SubLSymbol POS_OF_PRED = makeSymbol("POS-OF-PRED");

    private static final SubLSymbol $sym31$SPEECH_PART_PRED_ = makeSymbol("SPEECH-PART-PRED?");

    private static final SubLObject $$speechPartPreds = reader_make_constant_shell(makeString("speechPartPreds"));

    private static final SubLSymbol $sym33$SPEC_POS_ = makeSymbol("SPEC-POS?");

    private static final SubLSymbol $pos_of_pred_caching_state$ = makeSymbol("*POS-OF-PRED-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLObject $$singular_Generic = reader_make_constant_shell(makeString("singular-Generic"));

    private static final SubLObject $$plural_Generic = reader_make_constant_shell(makeString("plural-Generic"));

    private static final SubLSymbol $derived_preds$ = makeSymbol("*DERIVED-PREDS*");



    private static final SubLObject $$regularSuffix = reader_make_constant_shell(makeString("regularSuffix"));



    private static final SubLObject $$ProperNoun = reader_make_constant_shell(makeString("ProperNoun"));











    private static final SubLString $str49$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str54$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));



    private static final SubLString $str57$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str58$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str59$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

    private static final SubLSymbol $speech_part_preds$ = makeSymbol("*SPEECH-PART-PREDS*");

    private static final SubLList $list62 = list(list(makeSymbol("PRED"), makeSymbol("&KEY"), list(makeSymbol("MT"), reader_make_constant_shell(makeString("InferencePSC"))), list(makeSymbol("DONE"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list63 = list(makeKeyword("MT"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol $sym67$DEFINING_MT = makeUninternedSymbol("DEFINING-MT");



    private static final SubLList $list69 = list(makeSymbol("ENSURE-SPEECH-PART-PREDS-INITIALIZED"));







    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLList $list74 = list(reader_make_constant_shell(makeString("InferencePSC")));

    private static final SubLSymbol $sym75$GENL_LEXICON_MT_ = makeSymbol("GENL-LEXICON-MT?");

    private static final SubLObject $$SpeechPartPredicate = reader_make_constant_shell(makeString("SpeechPartPredicate"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $sym78$GENL_POS_PRED_ = makeSymbol("GENL-POS-PRED?");

    private static final SubLSymbol $sym79$_GENL_POS_PRED__CACHING_STATE_ = makeSymbol("*GENL-POS-PRED?-CACHING-STATE*");

    private static final SubLSymbol $sym80$CLEAR_GENL_POS_PRED_ = makeSymbol("CLEAR-GENL-POS-PRED?");

    private static final SubLSymbol $sym81$GENL_POS_PRED_FROM_MT_INFO_ = makeSymbol("GENL-POS-PRED-FROM-MT-INFO?");







    private static final SubLSymbol $sym85$_GENL_POS_PRED_FROM_MT_INFO__CACHING_STATE_ = makeSymbol("*GENL-POS-PRED-FROM-MT-INFO?-CACHING-STATE*");

    private static final SubLSymbol $sym86$CLEAR_GENL_POS_PRED_FROM_MT_INFO_ = makeSymbol("CLEAR-GENL-POS-PRED-FROM-MT-INFO?");



    private static final SubLSymbol $sym88$STRING_ = makeSymbol("STRING=");

    private static final SubLObject $$ClosedClassWord = reader_make_constant_shell(makeString("ClosedClassWord"));

    private static final SubLObject $$partOfSpeech = reader_make_constant_shell(makeString("partOfSpeech"));

    private static final SubLSymbol GET_STRINGS_OF_TYPE_CACHED = makeSymbol("GET-STRINGS-OF-TYPE-CACHED");

    private static final SubLSymbol $get_strings_of_type_cached_caching_state$ = makeSymbol("*GET-STRINGS-OF-TYPE-CACHED-CACHING-STATE*");

    private static final SubLSymbol $sym93$STRING_IS_POS_ON_WU_ = makeSymbol("STRING-IS-POS-ON-WU?");



    private static final SubLSymbol $sym95$LEXICAL_WORD_ = makeSymbol("LEXICAL-WORD?");

    private static final SubLSymbol PARSE_MORPHOLOGICALLY_OPTION_P = makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P");



    private static final SubLSymbol $sym98$EQUALS_EL_ = makeSymbol("EQUALS-EL?");



    private static final SubLSymbol $sym100$SPEC_ = makeSymbol("SPEC?");

    private static final SubLObject $$EnglishLexiconMt = reader_make_constant_shell(makeString("EnglishLexiconMt"));

    private static final SubLSymbol POS_FOR_KEYWORD = makeSymbol("POS-FOR-KEYWORD");



    private static final SubLSymbol $ALL_NOUN_FORMS = makeKeyword("ALL-NOUN-FORMS");



    private static final SubLList $list106 = list(reader_make_constant_shell(makeString("CountNoun")), reader_make_constant_shell(makeString("AgentiveNoun")), reader_make_constant_shell(makeString("MassNoun")), reader_make_constant_shell(makeString("GerundiveNoun")));



    private static final SubLList $list108 = list(reader_make_constant_shell(makeString("MassNoun")));



    private static final SubLObject $$CountNoun = reader_make_constant_shell(makeString("CountNoun"));



    private static final SubLObject $$DeVerbalNoun = reader_make_constant_shell(makeString("DeVerbalNoun"));



    private static final SubLObject $$AgentiveNoun = reader_make_constant_shell(makeString("AgentiveNoun"));



    private static final SubLObject $$GerundiveNoun = reader_make_constant_shell(makeString("GerundiveNoun"));





    private static final SubLList $list119 = list(reader_make_constant_shell(makeString("Verb")));



    private static final SubLObject $$AuxVerb = reader_make_constant_shell(makeString("AuxVerb"));



    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));



    private static final SubLObject $$Adverb = reader_make_constant_shell(makeString("Adverb"));



    private static final SubLObject $$Preposition = reader_make_constant_shell(makeString("Preposition"));



    private static final SubLObject $$Determiner = reader_make_constant_shell(makeString("Determiner"));



    private static final SubLObject $$Conjunction = reader_make_constant_shell(makeString("Conjunction"));



    private static final SubLSymbol $pos_for_keyword_caching_state$ = makeSymbol("*POS-FOR-KEYWORD-CACHING-STATE*");



    private static final SubLList $list135 = list(reader_make_constant_shell(makeString("abbreviationForLexicalWord")));

    private static final SubLSymbol PROPER_NOUN_FORM_OF_PRED = makeSymbol("PROPER-NOUN-FORM-OF-PRED");

    private static final SubLSymbol $sym137$PREDS_OF_STRING_WORD_CACHED = makeSymbol("PREDS-OF-STRING&WORD-CACHED");

    private static final SubLSymbol $sym138$_PREDS_OF_STRING_WORD_CACHED_CACHING_STATE_ = makeSymbol("*PREDS-OF-STRING&WORD-CACHED-CACHING-STATE*");

    private static final SubLSymbol $sym139$_STRING = makeSymbol("?STRING");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $sym141$_POS = makeSymbol("?POS");

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLObject $$GeneralEnglishMt = reader_make_constant_shell(makeString("GeneralEnglishMt"));

    private static final SubLObject $$FrameForAdverbs = reader_make_constant_shell(makeString("FrameForAdverbs"));

    private static final SubLObject $$ProperCountNoun = reader_make_constant_shell(makeString("ProperCountNoun"));

    private static final SubLList $list146 = list(reader_make_constant_shell(makeString("DefiniteDeterminerFrame")));

    private static final SubLObject $$ProperMassNoun = reader_make_constant_shell(makeString("ProperMassNoun"));

    private static final SubLObject $$FrameForNouns = reader_make_constant_shell(makeString("FrameForNouns"));

    private static final SubLObject $$MassNoun = reader_make_constant_shell(makeString("MassNoun"));

    private static final SubLObject $$ZeroArticleFrame = reader_make_constant_shell(makeString("ZeroArticleFrame"));

    private static final SubLObject $$FrameForAdjectives = reader_make_constant_shell(makeString("FrameForAdjectives"));

    private static final SubLSymbol $closed_lexical_class_strings$ = makeSymbol("*CLOSED-LEXICAL-CLASS-STRINGS*");

    private static final SubLSymbol $closed_lexical_class_strings_case_insensitive$ = makeSymbol("*CLOSED-LEXICAL-CLASS-STRINGS-CASE-INSENSITIVE*");

    private static final SubLObject $$Pronoun = reader_make_constant_shell(makeString("Pronoun"));

    private static final SubLSymbol NOT_TEST_CHAR = makeSymbol("NOT-TEST-CHAR");

    private static final SubLSymbol CLOSED_LEXICAL_CLASS_STRINGS = makeSymbol("CLOSED-LEXICAL-CLASS-STRINGS");

    private static final SubLSymbol $closed_lexical_class_strings_caching_state$ = makeSymbol("*CLOSED-LEXICAL-CLASS-STRINGS-CACHING-STATE*");

    private static final SubLSymbol CLOSED_LEXICAL_CLASSES = makeSymbol("CLOSED-LEXICAL-CLASSES");

    private static final SubLSymbol $closed_lexical_classes_caching_state$ = makeSymbol("*CLOSED-LEXICAL-CLASSES-CACHING-STATE*");

    private static final SubLList $list160 = list(reader_make_constant_shell(makeString("posForms")), reader_make_constant_shell(makeString("posBaseForms")));

    private static final SubLList $list161 = cons(list(makeKeyword("OR"), reader_make_constant_shell(makeString("WordWithPrefixFn")), reader_make_constant_shell(makeString("WordWithSuffixFn")), reader_make_constant_shell(makeString("CompoundWordFn")), reader_make_constant_shell(makeString("WordFn")), reader_make_constant_shell(makeString("CompoundWordFn-HeadMedial")), reader_make_constant_shell(makeString("CompoundWordFn-HeadInitial"))), makeKeyword("ANYTHING"));

    private static final SubLObject $$LexicalWord = reader_make_constant_shell(makeString("LexicalWord"));



    private static final SubLSymbol $sym164$DERIVED_WORD_ = makeSymbol("DERIVED-WORD?");

    private static final SubLObject $$DerivedWord = reader_make_constant_shell(makeString("DerivedWord"));

    private static final SubLSymbol $vulgar_words$ = makeSymbol("*VULGAR-WORDS*");

    private static final SubLObject $$InherentlyVulgarWord = reader_make_constant_shell(makeString("InherentlyVulgarWord"));

    private static final SubLList $list168 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str169$The_word_unit__S_is_neither_a_FOR = makeString("The word-unit ~S is neither a FORT nor a NAUT.");

    private static final SubLSymbol $sym170$VERB_ONLY_STRING_ = makeSymbol("VERB-ONLY-STRING?");

    private static final SubLSymbol $sym171$_VERB_ONLY_STRING__CACHING_STATE_ = makeSymbol("*VERB-ONLY-STRING?-CACHING-STATE*");









    private static final SubLSymbol $sym176$HLMT_ = makeSymbol("HLMT?");



    private static final SubLSymbol TYPED_DENOTS_OF_STRING = makeSymbol("TYPED-DENOTS-OF-STRING");

    private static final SubLList $list179 = list(new SubLObject[]{ makeSymbol("STRING"), makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("ABBREV-TYPES"), NIL), list(makeSymbol("DENOT-TYPE"), makeKeyword("DENOT")), list(makeSymbol("MISSPELLINGS?"), T), list(makeSymbol("SKIP-NAMESTRINGS?"), NIL), list(makeSymbol("LOOKUP-MT"), makeSymbol("*LEXICON-LOOKUP-MT*")), list(makeSymbol("SEMANTIC-MT"), reader_make_constant_shell(makeString("InferencePSC"))), list(makeSymbol("PARSE-MORPHOLOGICALLY"), makeSymbol("*PARSE-MORPHOLOGICALLY*")), list(makeSymbol("EXCLUDED-PREDICATES"), makeSymbol("*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*")) });

    private static final SubLString $str180$_param_STRING_string_____param_TY = makeString("@param STRING string\n   @param TYPE collection\n   @param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @return list; a list of denotata for STRING that are instances of TYPE\n   note that this function does some parsing, if the type sent in is appropriate");

    private static final SubLList $list181 = list(new SubLObject[]{ list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("TYPE"), makeSymbol("EL-FORT-P")), list(makeSymbol("ABBREV-TYPES"), makeSymbol("LISTP")), list(makeSymbol("DENOT-TYPE"), makeSymbol("KEYWORDP")), list(makeSymbol("MISSPELLINGS?"), makeSymbol("BOOLEANP")), list(makeSymbol("SKIP-NAMESTRINGS?"), makeSymbol("BOOLEANP")), list(makeSymbol("LOOKUP-MT"), makeSymbol("HLMT?")), list(makeSymbol("SEMANTIC-MT"), makeSymbol("HLMT?")), list(makeSymbol("PARSE-MORPHOLOGICALLY"), makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P")), list(makeSymbol("EXCLUDED-PREDICATES"), makeSymbol("SET-P")) });

    private static final SubLList $list182 = list(makeSymbol("LISTP"));

    private static final SubLSymbol $sym183$DENOT_HAS_TYPE_ = makeSymbol("DENOT-HAS-TYPE?");

    private static final SubLSymbol $sym184$DENOT_MIGHT_HAVE_TYPE_ = makeSymbol("DENOT-MIGHT-HAVE-TYPE?");



    private static final SubLObject $$City = reader_make_constant_shell(makeString("City"));

    private static final SubLObject $$GeopoliticalEntity = reader_make_constant_shell(makeString("GeopoliticalEntity"));

    private static final SubLObject $$CityNamedFn = reader_make_constant_shell(makeString("CityNamedFn"));

    private static final SubLObject $$InstanceNamedFn = reader_make_constant_shell(makeString("InstanceNamedFn"));

    private static final SubLObject $$SubcollectionOfWithRelationToFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn"));

    private static final SubLObject $$inRegion = reader_make_constant_shell(makeString("inRegion"));

    private static final SubLObject $$GeographicalRegion = reader_make_constant_shell(makeString("GeographicalRegion"));

    private static final SubLObject $$geopoliticalSubdivision = reader_make_constant_shell(makeString("geopoliticalSubdivision"));

    private static final SubLObject $$geographicalSubRegions = reader_make_constant_shell(makeString("geographicalSubRegions"));

    private static final SubLObject $$territoryOf = reader_make_constant_shell(makeString("territoryOf"));

    private static final SubLString $str196$_ = makeString("*");

    private static final SubLList $list197 = list(CHAR_asterisk);

    private static final SubLList $list198 = list(makeString("*"));



    private static final SubLString $str200$ = makeString("");

    private static final SubLString $str201$I_should_never_be_called___ = makeString("I should never be called...");



    private static final SubLSymbol LIST_OF_PREDICATES_P = makeSymbol("LIST-OF-PREDICATES-P");

    private static final SubLSymbol DENOTATION_MAPPER = makeSymbol("DENOTATION-MAPPER");

    public static final SubLList $list205 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), makeSymbol("EXCLUDED-PREDS"), list(makeSymbol("MODE"), makeKeyword("GREEDY")), list(makeSymbol("PARSE-MORPHOLOGICALLY"), makeSymbol("*PARSE-MORPHOLOGICALLY*")));

    private static final SubLString $str206$_param_STRING_string__the_string_ = makeString("@param STRING string; the string to map to its denotations\n   @param EXCLUDED-PREDS list; a list of semantic predicates which should be ignored when computing mappings \n   @param MODE keyword; :greedy or :diligent\n   @param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @return 0 LISTP; a list of STRING-TOKENs, each of which contains as its STRING-TOKEN-STRING some substring \n                    of STRING and as its STRING-TOKEN-VALUE a denotatum for that string\n   @return 1 LISTP; a list of STRING-TOKENS for which no denotatum could be found");

    private static final SubLList $list207 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("EXCLUDED-PREDS"), makeSymbol("LIST-OF-PREDICATES-P")), list(makeSymbol("MODE"), makeSymbol("KEYWORDP")), list(makeSymbol("PARSE-MORPHOLOGICALLY"), makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P")));

    public static final SubLList $list208 = list(list(makeSymbol("LIST"), makeSymbol("STRING-TOKEN-P")), list(makeSymbol("LIST"), makeSymbol("STRING-TOKEN-P")));

    private static final SubLList $list209 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));



    private static final SubLSymbol CYCL_STRING_P = makeSymbol("CYCL-STRING-P");

    private static final SubLSymbol $sym212$VALID_DENOTS_OF_STRING_LOOKUP_MT_SPECIFICATION_ = makeSymbol("VALID-DENOTS-OF-STRING-LOOKUP-MT-SPECIFICATION?");

    private static final SubLList $list213 = list(reader_make_constant_shell(makeString("termStrings")));

    private static final SubLSymbol DENOTS_OF_STRING = makeSymbol("DENOTS-OF-STRING");

    private static final SubLList $list215 = list(new SubLObject[]{ makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("ABBREV-TYPES"), NIL), list(makeSymbol("DENOT-TYPE"), makeKeyword("DENOT")), list(makeSymbol("MISSPELLINGS?"), T), list(makeSymbol("SKIP-NAMESTRINGS?"), NIL), list(makeSymbol("LOOKUP-MT"), makeSymbol("*LEXICON-LOOKUP-MT*")), list(makeSymbol("PARSE-MORPHOLOGICALLY"), makeSymbol("*PARSE-MORPHOLOGICALLY*")), list(makeSymbol("PARSE-DATES-AND-NUMBERS?"), T), list(makeSymbol("LEXICON"), NIL) });

    private static final SubLString $str216$_param_PARSE_MORPHOLOGICALLY__PAR = makeString("@param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @param abbrev-types; listp: if it includes :abbrevs, include abbreviations;\n                               if it includes :acronyms, include acronyms\n   @param denot-type; keywordp: \n      :denot =  #$denotation assertions  (parsing)\n      :related = #$denotation and #$denotationRelatedTo (generation)\n      :any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\n   @param LOOKUP-MT: Lexical microtheory or ISO language code such as \'en\'.\n   @param PARSE-DATES-AND-NUMBERS? booleanp; if set to NIL, DENOTS-OF-STRING will only perform lexical lookup, and \n      not try to parse any dates or numbers\n   @param LEXICON term-lexicon-p; if present, LOOKUP-MT will be ignored and LEXICON will be used instead.\n   @return 0. LISTP ; CycL denotational terms serving as denotations for the phrase\n   @return 1. LISTP ; list of predicate lists for each denotation");

    private static final SubLList $list217 = list(list(makeSymbol("STRING"), makeSymbol("CYCL-STRING-P")), list(makeSymbol("ABBREV-TYPES"), makeSymbol("LISTP")), list(makeSymbol("DENOT-TYPE"), makeSymbol("KEYWORDP")), list(makeSymbol("MISSPELLINGS?"), makeSymbol("BOOLEANP")), list(makeSymbol("SKIP-NAMESTRINGS?"), makeSymbol("BOOLEANP")), list(makeSymbol("LOOKUP-MT"), makeSymbol("VALID-DENOTS-OF-STRING-LOOKUP-MT-SPECIFICATION?")), list(makeSymbol("PARSE-MORPHOLOGICALLY"), makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P")));

    private static final SubLSymbol DENOTS_MT_FOR_LANGUAGE = makeSymbol("DENOTS-MT-FOR-LANGUAGE");

    private static final SubLObject $$validatedLexicalPSCForLanguage = reader_make_constant_shell(makeString("validatedLexicalPSCForLanguage"));

    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    private static final SubLObject $$AnytimePSC = reader_make_constant_shell(makeString("AnytimePSC"));

    private static final SubLString $str222$_S_passes_neither_SPEECH_PART_PRE = makeString("~S passes neither SPEECH-PART-PRED? nor NAME-STRING-PRED?");

    private static final SubLSymbol $sym223$NAME_STRING_PRED_ = makeSymbol("NAME-STRING-PRED?");





    private static final SubLObject $$ProperNamePredicate_Strict = reader_make_constant_shell(makeString("ProperNamePredicate-Strict"));



    private static final SubLList $list228 = list(reader_make_constant_shell(makeString("denotationRelatedTo")));



    private static final SubLList $list230 = list(reader_make_constant_shell(makeString("denotationPlaceholder")));

    private static final SubLList $list231 = list(reader_make_constant_shell(makeString("denotationRelatedTo")), reader_make_constant_shell(makeString("denotation")));

    private static final SubLList $list232 = list(reader_make_constant_shell(makeString("denotationPlaceholder")), reader_make_constant_shell(makeString("denotationRelatedTo")), reader_make_constant_shell(makeString("denotation")));

    private static final SubLList $list233 = list(reader_make_constant_shell(makeString("denotation")));

    private static final SubLObject $$denotation = reader_make_constant_shell(makeString("denotation"));



    private static final SubLObject $$denotationPlaceholder = reader_make_constant_shell(makeString("denotationPlaceholder"));

    private static final SubLObject $$denotationRelatedTo = reader_make_constant_shell(makeString("denotationRelatedTo"));

    private static final SubLObject $$subcatFrame = reader_make_constant_shell(makeString("subcatFrame"));

    private static final SubLSymbol $sym239$_ = makeSymbol("<");



    private static final SubLObject $$subcatFrameArity = reader_make_constant_shell(makeString("subcatFrameArity"));

    private static final SubLObject $$politenessOfWS = reader_make_constant_shell(makeString("politenessOfWS"));

    private static final SubLObject $$formalityOfWS = reader_make_constant_shell(makeString("formalityOfWS"));

    private static final SubLSymbol $sym244$_LEVEL = makeSymbol("?LEVEL");

    private static final SubLList $list245 = list(makeSymbol("?LEVEL"));

    private static final SubLList $list246 = list(reader_make_constant_shell(makeString("RudeSpeech")), reader_make_constant_shell(makeString("VulgarSpeech")), reader_make_constant_shell(makeString("ObjectionableSpeech")));

    private static final SubLSymbol $sym247$POTENTIALLY_OFFENSIVE_POLITENESS_LEVEL_ = makeSymbol("POTENTIALLY-OFFENSIVE-POLITENESS-LEVEL?");

    private static final SubLObject $$SlangSpeech = reader_make_constant_shell(makeString("SlangSpeech"));

    private static final SubLObject $$ArchaicSpeech = reader_make_constant_shell(makeString("ArchaicSpeech"));

    private static final SubLSymbol $sym250$INDIRECT_LEXICAL_ASSERTION_ = makeSymbol("INDIRECT-LEXICAL-ASSERTION?");

    private static final SubLObject $const251$DenotationPredicate_ExcludedFromN = reader_make_constant_shell(makeString("DenotationPredicate-ExcludedFromNPParser"));

    private static final SubLSymbol $sym252$_INDIRECT_LEXICAL_ASSERTION__CACHING_STATE_ = makeSymbol("*INDIRECT-LEXICAL-ASSERTION?-CACHING-STATE*");

    private static final SubLSymbol $sym253$CLEAR_INDIRECT_LEXICAL_ASSERTION_ = makeSymbol("CLEAR-INDIRECT-LEXICAL-ASSERTION?");



    private static final SubLSymbol $sym255$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));





    private static final SubLObject $$TransitivePPFrameType = reader_make_constant_shell(makeString("TransitivePPFrameType"));

    private static final SubLObject $$DitransitivePPFrameType = reader_make_constant_shell(makeString("DitransitivePPFrameType"));

    private static final SubLSymbol AGR_OF_DET_STRING = makeSymbol("AGR-OF-DET-STRING");

    private static final SubLList $list262 = list(reader_make_constant_shell(makeString("nonSingular-Generic")));

    private static final SubLSymbol $agr_of_det_string_caching_state$ = makeSymbol("*AGR-OF-DET-STRING-CACHING-STATE*");

    private static final SubLObject $$determinerAgreement = reader_make_constant_shell(makeString("determinerAgreement"));

    private static final SubLSymbol POS_TO_SEMTRANS_PRED_CACHED = makeSymbol("POS-TO-SEMTRANS-PRED-CACHED");

    private static final SubLObject $$semTransPredForPOS = reader_make_constant_shell(makeString("semTransPredForPOS"));

    private static final SubLSymbol $pos_to_semtrans_pred_cached_caching_state$ = makeSymbol("*POS-TO-SEMTRANS-PRED-CACHED-CACHING-STATE*");

    private static final SubLSymbol CLEAR_POS_TO_SEMTRANS_PRED_CACHED = makeSymbol("CLEAR-POS-TO-SEMTRANS-PRED-CACHED");

    private static final SubLSymbol SEMTRANS_PRED_TO_POS = makeSymbol("SEMTRANS-PRED-TO-POS");

    private static final SubLSymbol $semtrans_pred_to_pos_caching_state$ = makeSymbol("*SEMTRANS-PRED-TO-POS-CACHING-STATE*");

    private static final SubLObject $$commonNickname = reader_make_constant_shell(makeString("commonNickname"));

    private static final SubLObject $$nameSpelling = reader_make_constant_shell(makeString("nameSpelling"));

    private static final SubLObject $$SpeechPart = reader_make_constant_shell(makeString("SpeechPart"));

    private static final SubLSymbol $speech_parts$ = makeSymbol("*SPEECH-PARTS*");

    private static final SubLSymbol $sym275$GENL_POS_ = makeSymbol("GENL-POS?");

    private static final SubLSymbol $sym276$_GENL_POS__CACHING_STATE_ = makeSymbol("*GENL-POS?-CACHING-STATE*");

    private static final SubLObject $$NLWordForm = reader_make_constant_shell(makeString("NLWordForm"));

    private static final SubLList $list278 = list(reader_make_constant_shell(makeString("PhraseFn")), reader_make_constant_shell(makeString("Adjective")));

    private static final SubLObject $$PhraseFn_Bar1 = reader_make_constant_shell(makeString("PhraseFn-Bar1"));

    private static final SubLSymbol COMPOSITIONAL_POS_NART = makeSymbol("COMPOSITIONAL-POS-NART");

    private static final SubLSymbol $compositional_pos_nart_caching_state$ = makeSymbol("*COMPOSITIONAL-POS-NART-CACHING-STATE*");

    private static final SubLList $list282 = list(list(reader_make_constant_shell(makeString("PhraseFn")), reader_make_constant_shell(makeString("Noun"))), reader_make_constant_shell(makeString("NounPhrase")));

    public static final SubLList $list283 = list(list(reader_make_constant_shell(makeString("PhraseFn")), reader_make_constant_shell(makeString("Preposition"))), reader_make_constant_shell(makeString("PrepositionalPhrase")));











    private static final SubLList $list289 = list(list(T, list(ONE_INTEGER, reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), makeKeyword("POSSESSED-TYPE"), makeKeyword("DENOTED-PRED"), makeKeyword("POSSESSOR-TYPE")), list(TWO_INTEGER, reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn")), makeKeyword("POSSESSED-TYPE"), makeKeyword("DENOTED-PRED"), makeKeyword("POSSESSOR-TYPE"))), list(NIL, list(ONE_INTEGER, reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), makeKeyword("POSSESSED-TYPE"), makeKeyword("DENOTED-PRED"), makeKeyword("POSSESSOR")), list(TWO_INTEGER, reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), makeKeyword("POSSESSED-TYPE"), makeKeyword("DENOTED-PRED"), makeKeyword("POSSESSOR"))));

    private static final SubLObject $$headMedialStringDenotesArgInReln = reader_make_constant_shell(makeString("headMedialStringDenotesArgInReln"));

    private static final SubLObject $$multiWordStringDenotesArgInReln = reader_make_constant_shell(makeString("multiWordStringDenotesArgInReln"));

    private static final SubLObject $$compoundStringDenotesArgInReln = reader_make_constant_shell(makeString("compoundStringDenotesArgInReln"));

    private static final SubLObject $$denotesArgInReln = reader_make_constant_shell(makeString("denotesArgInReln"));

    private static final SubLList $list294 = list(ONE_INTEGER);

    private static final SubLSymbol $sym295$_PRED = makeSymbol("?PRED");

    private static final SubLList $list296 = list(makeSymbol("?PRED"), makeSymbol("?ARGNUM"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));



    private static final SubLSymbol $sym299$SETS_EQUAL_EQUAL_ = makeSymbol("SETS-EQUAL-EQUAL?");











    private static final SubLList $list305 = list(list(list(makeString("ABEDA"), list(makeSymbol("ABBREV-TYPES"), makeKeyword("ACRONYMS"))), list(reader_make_constant_shell(makeString("ArabBankForEconomicDevelopmentInAfrica"))), list(list(reader_make_constant_shell(makeString("acronymString"))))), list(list(makeString("platform")), list(reader_make_constant_shell(makeString("Platform-Military")), reader_make_constant_shell(makeString("ComputerProcessor")), reader_make_constant_shell(makeString("PoliticalBeliefSystem")), reader_make_constant_shell(makeString("Platform"))), list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("singular"))))), list(list(makeString("chemical engineering")), list(reader_make_constant_shell(makeString("ChemicalEngineering"))), list(list(reader_make_constant_shell(makeString("massNumber"))))), list(list(makeString("heart attack")), list(reader_make_constant_shell(makeString("HeartAttack"))), list(list(reader_make_constant_shell(makeString("singular"))))), list(list(list(reader_make_constant_shell(makeString("UnicodeStringFn")), makeString("&u99ac;")), NIL, makeKeyword("DENOT"), NIL, NIL, reader_make_constant_shell(makeString("ChineseLexicalMt"))), list(reader_make_constant_shell(makeString("Horse")), reader_make_constant_shell(makeString("YoYoMa-Cellist"))), list(list(reader_make_constant_shell(makeString("singular"))), list(reader_make_constant_shell(makeString("familyName"))))));

    private static final SubLString $str306$missing___S = makeString("missing: ~S");

    private static final SubLSymbol HL_TERM_WITH_EL_COUNTERPART_P = makeSymbol("HL-TERM-WITH-EL-COUNTERPART-P");

    private static final SubLSymbol HL_TERM_TO_EL_TERM = makeSymbol("HL-TERM-TO-EL-TERM");

    public static SubLObject genl_lexicon_mtP(final SubLObject spec_mt, final SubLObject genl_mt) {
        if ((spec_mt.equal(genl_mt) || (NIL != kb_utilities.kbeq(genl_mt, $$UniversalVocabularyMt))) || (NIL != kb_utilities.kbeq(spec_mt, $$InferencePSC))) {
            return T;
        }
        return genl_lexicon_mtP_cached(spec_mt, genl_mt);
    }

    public static SubLObject clear_genl_lexicon_mtP_cached() {
        final SubLObject cs = $genl_lexicon_mtP_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_genl_lexicon_mtP_cached(final SubLObject spec_mt, final SubLObject genl_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($genl_lexicon_mtP_cached_caching_state$.getGlobalValue(), list(spec_mt, genl_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject genl_lexicon_mtP_cached_internal(final SubLObject spec_mt, final SubLObject genl_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(spec_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = mt_relevance_macros.relevant_mtP(genl_mt);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject genl_lexicon_mtP_cached(final SubLObject spec_mt, final SubLObject genl_mt) {
        SubLObject caching_state = $genl_lexicon_mtP_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym2$GENL_LEXICON_MT__CACHED, $sym3$_GENL_LEXICON_MT__CACHED_CACHING_STATE_, $int$4096, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback($sym5$CLEAR_GENL_LEXICON_MT__CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(spec_mt, genl_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (spec_mt.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && genl_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(genl_lexicon_mtP_cached_internal(spec_mt, genl_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(spec_mt, genl_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject initialize_speech_part_caches() {
        clear_speech_part_pred_caches();
        initialize_derived_preds();
        initialize_closed_lexical_class_strings();
        initialize_speech_parts();
        initialize_speech_part_preds();
        return $INITIALIZED;
    }

    public static SubLObject preds_matching_pos(SubLObject nl_pred_list, final SubLObject pos, SubLObject include_specsP) {
        if (include_specsP == UNPROVIDED) {
            include_specsP = NIL;
        }
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        if (nl_pred_list == $ALL) {
            nl_pred_list = top_level_nl_preds();
        }
        final SubLObject preds = (NIL != include_specsP) ? all_preds_of_pos(pos) : max_preds_of_pos(pos);
        return (NIL != nl_pred_list) && (NIL != preds) ? lexicon_utilities.filter_lexicon_preds(nl_pred_list, preds, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject top_level_nl_preds() {
        return list(lexicon_vars.$top_level_nl_pred$.getGlobalValue());
    }

    public static SubLObject clear_speech_part_pred_caches() {
        clear_max_preds_matching_pos_cached();
        clear_max_preds_of_pos();
        clear_max_preds_licensed_by_pos();
        lexicon_utilities.clear_preds_licensed_by_pos();
        clear_speech_part_pred_min_ceilings_int();
        clear_speech_part_pred_max_floors_int();
        clear_derived_preds();
        clear_speech_part_preds();
        return $CLEARED;
    }

    public static SubLObject max_preds_matching_pos(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, SubLObject include_specsP) {
        if (include_specsP == UNPROVIDED) {
            include_specsP = NIL;
        }
        return NIL != kb_loaded() ? copy_list(max_preds_matching_pos_cached(nl_pred_list, pos, mt, include_specsP)) : NIL;
    }

    public static SubLObject clear_max_preds_matching_pos_cached() {
        final SubLObject cs = $max_preds_matching_pos_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_max_preds_matching_pos_cached(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, final SubLObject include_specsP) {
        return memoization_state.caching_state_remove_function_results_with_args($max_preds_matching_pos_cached_caching_state$.getGlobalValue(), list(nl_pred_list, pos, mt, include_specsP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject max_preds_matching_pos_cached_internal(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, final SubLObject include_specsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds = preds_matching_pos(nl_pred_list, pos, include_specsP);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            final SubLObject nearest_common_genl_preds = speech_part_pred_min_ceilings(preds, UNPROVIDED);
            result = (NIL != nearest_common_genl_preds) ? nearest_common_genl_preds : preds;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject max_preds_matching_pos_cached(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, final SubLObject include_specsP) {
        SubLObject caching_state = $max_preds_matching_pos_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAX_PREDS_MATCHING_POS_CACHED, $max_preds_matching_pos_cached_caching_state$, NIL, EQUAL, FOUR_INTEGER, $int$32);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(nl_pred_list, pos, mt, include_specsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (nl_pred_list.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && include_specsP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(max_preds_matching_pos_cached_internal(nl_pred_list, pos, mt, include_specsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(nl_pred_list, pos, mt, include_specsP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject all_preds_of_pos(final SubLObject pos) {
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = genls.all_specs(pos, UNPROVIDED, UNPROVIDED);
        SubLObject spec_pos = NIL;
        spec_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = lexicon_utilities.preds_of_pos(spec_pos, UNPROVIDED);
            SubLObject pred = NIL;
            pred = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject item_var = pred;
                if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                pred = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            spec_pos = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject clear_max_preds_of_pos() {
        final SubLObject cs = $max_preds_of_pos_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_max_preds_of_pos(final SubLObject pos) {
        return memoization_state.caching_state_remove_function_results_with_args($max_preds_of_pos_caching_state$.getGlobalValue(), list(pos), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject max_preds_of_pos_internal(final SubLObject pos) {
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        return lex_remove_spec_preds(lexicon_utilities.preds_of_pos(pos, UNPROVIDED));
    }

    public static SubLObject max_preds_of_pos(final SubLObject pos) {
        SubLObject caching_state = $max_preds_of_pos_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAX_PREDS_OF_POS, $max_preds_of_pos_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_MAX_PREDS_OF_POS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pos, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(max_preds_of_pos_internal(pos)));
            memoization_state.caching_state_put(caching_state, pos, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_max_preds_licensed_by_pos() {
        final SubLObject cs = $max_preds_licensed_by_pos_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_max_preds_licensed_by_pos(final SubLObject pos) {
        return memoization_state.caching_state_remove_function_results_with_args($max_preds_licensed_by_pos_caching_state$.getGlobalValue(), list(pos), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject max_preds_licensed_by_pos_internal(final SubLObject pos) {
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        return lex_remove_spec_preds(lexicon_utilities.preds_licensed_by_pos(pos));
    }

    public static SubLObject max_preds_licensed_by_pos(final SubLObject pos) {
        SubLObject caching_state = $max_preds_licensed_by_pos_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAX_PREDS_LICENSED_BY_POS, $max_preds_licensed_by_pos_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_MAX_PREDS_LICENSED_BY_POS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pos, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(max_preds_licensed_by_pos_internal(pos)));
            memoization_state.caching_state_put(caching_state, pos, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject lex_remove_spec_preds(final SubLObject pos_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    SubLObject remain;
                    SubLObject current;
                    SubLObject datum;
                    SubLObject now;
                    SubLObject later;
                    SubLObject removeP;
                    SubLObject csome_list_var;
                    SubLObject other;
                    for (remain = NIL, remain = pos_preds; NIL != remain; remain = remain.rest()) {
                        datum = current = remain;
                        now = NIL;
                        later = NIL;
                        destructuring_bind_must_consp(current, datum, $list21);
                        now = current.first();
                        current = later = current.rest();
                        removeP = NIL;
                        if (NIL == removeP) {
                            csome_list_var = later;
                            other = NIL;
                            other = csome_list_var.first();
                            while ((NIL == removeP) && (NIL != csome_list_var)) {
                                if (NIL != subl_promotions.memberP(now, lex_remove_spec_preds_helper(other), UNPROVIDED, UNPROVIDED)) {
                                    removeP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                other = csome_list_var.first();
                            } 
                        }
                        if (NIL == removeP) {
                            csome_list_var = ans;
                            other = NIL;
                            other = csome_list_var.first();
                            while ((NIL == removeP) && (NIL != csome_list_var)) {
                                if (NIL != subl_promotions.memberP(now, lex_remove_spec_preds_helper(other), UNPROVIDED, UNPROVIDED)) {
                                    removeP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                other = csome_list_var.first();
                            } 
                        }
                        if (NIL == removeP) {
                            ans = cons(now, ans);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject lex_remove_spec_preds_helper_internal(final SubLObject v_term) {
        return genl_predicates.all_spec_preds(v_term, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lex_remove_spec_preds_helper(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return lex_remove_spec_preds_helper_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, LEX_REMOVE_SPEC_PREDS_HELPER, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), LEX_REMOVE_SPEC_PREDS_HELPER, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, LEX_REMOVE_SPEC_PREDS_HELPER, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(lex_remove_spec_preds_helper_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject speech_part_pred_min_ceilings(final SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return copy_list(speech_part_pred_min_ceilings_int(preds, mt));
    }

    public static SubLObject clear_speech_part_pred_min_ceilings_int() {
        final SubLObject cs = $speech_part_pred_min_ceilings_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_speech_part_pred_min_ceilings_int(final SubLObject preds, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($speech_part_pred_min_ceilings_int_caching_state$.getGlobalValue(), list(preds, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject speech_part_pred_min_ceilings_int_internal(final SubLObject preds, final SubLObject mt) {
        return genl_predicates.min_ceiling_predicates(preds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject speech_part_pred_min_ceilings_int(final SubLObject preds, final SubLObject mt) {
        SubLObject caching_state = $speech_part_pred_min_ceilings_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SPEECH_PART_PRED_MIN_CEILINGS_INT, $speech_part_pred_min_ceilings_int_caching_state$, $int$512, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_SPEECH_PART_PRED_MIN_CEILINGS_INT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(preds, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (preds.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(speech_part_pred_min_ceilings_int_internal(preds, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(preds, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject speech_part_pred_max_floors(final SubLObject preds, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLObject ans = speech_part_pred_max_floors_int(preds, mt);
        return copy_list(ans);
    }

    public static SubLObject clear_speech_part_pred_max_floors_int() {
        final SubLObject cs = $speech_part_pred_max_floors_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_speech_part_pred_max_floors_int(final SubLObject preds, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($speech_part_pred_max_floors_int_caching_state$.getGlobalValue(), list(preds, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject speech_part_pred_max_floors_int_internal(final SubLObject preds, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = genl_predicates.max_floor_predicates(preds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject speech_part_pred_max_floors_int(final SubLObject preds, final SubLObject mt) {
        SubLObject caching_state = $speech_part_pred_max_floors_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SPEECH_PART_PRED_MAX_FLOORS_INT, $speech_part_pred_max_floors_int_caching_state$, $int$512, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_SPEECH_PART_PRED_MAX_FLOORS_INT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(preds, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (preds.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(speech_part_pred_max_floors_int_internal(preds, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(preds, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_pos_of_pred() {
        final SubLObject cs = $pos_of_pred_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pos_of_pred(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($pos_of_pred_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pos_of_pred_internal(final SubLObject pred) {
        assert NIL != speech_part_predP(pred, UNPROVIDED) : "lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + pred;
        return (NIL != indexed_term_p(pred)) && (NIL != valid_constantP($$speechPartPreds, UNPROVIDED)) ? Sort.sort(kb_mapping_utilities.pred_values_in_any_mt(pred, $$speechPartPreds, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), $sym33$SPEC_POS_, UNPROVIDED).first() : NIL;
    }

    public static SubLObject pos_of_pred(final SubLObject pred) {
        SubLObject caching_state = $pos_of_pred_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(POS_OF_PRED, $pos_of_pred_caching_state$, $int$128, EQL, ONE_INTEGER, $int$32);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(pos_of_pred_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject singular_pred(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        if ((NIL == valid_constantP($$Noun, UNPROVIDED)) || (NIL == genls.genl_in_any_mtP(pos, $$Noun))) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if ((NIL != valid_constantP($$singular_Generic, UNPROVIDED)) && (NIL == ans)) {
                SubLObject csome_list_var = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
                SubLObject pred = NIL;
                pred = csome_list_var.first();
                while ((NIL == ans) && (NIL != csome_list_var)) {
                    if (NIL != genl_predicates.genl_predP(pred, $$singular_Generic, UNPROVIDED, UNPROVIDED)) {
                        ans = pred;
                    }
                    csome_list_var = csome_list_var.rest();
                    pred = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject plural_pred(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        if ((NIL == valid_constantP($$Noun, UNPROVIDED)) || (NIL == genls.genl_in_any_mtP(pos, $$Noun))) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if ((NIL != valid_constantP($$plural_Generic, UNPROVIDED)) && (NIL == ans)) {
                SubLObject csome_list_var = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
                SubLObject pred = NIL;
                pred = csome_list_var.first();
                while ((NIL == ans) && (NIL != csome_list_var)) {
                    if (NIL != genl_predicates.genl_predP(pred, $$plural_Generic, UNPROVIDED, UNPROVIDED)) {
                        ans = pred;
                    }
                    csome_list_var = csome_list_var.rest();
                    pred = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject derived_preds() {
        return $derived_preds$.getGlobalValue();
    }

    public static SubLObject clear_derived_preds() {
        morphology.clear_pos_preds_derivable_from_pred_int();
        return clrhash($derived_preds$.getGlobalValue());
    }

    public static SubLObject initialize_derived_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_derived_preds();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != valid_constantP($$regularSuffix, UNPROVIDED)) {
                final SubLObject pred_var = $$regularSuffix;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$4 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$5 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$6 = NIL;
                                    final SubLObject token_var_$7 = NIL;
                                    while (NIL == done_var_$6) {
                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                        final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(as));
                                        if (NIL != valid_$8) {
                                            final SubLObject derived_pred = assertions_high.gaf_arg1(as);
                                            final SubLObject mt = assertions_high.assertion_mt(as);
                                            hash_table_utilities.pushnew_hash(derived_pred, mt, $derived_preds$.getGlobalValue(), UNPROVIDED);
                                        }
                                        done_var_$6 = makeBoolean(NIL == valid_$8);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$5, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            }
            if ((NIL != valid_constantP($$ProperNoun, UNPROVIDED)) && (NIL != valid_constantP($$speechPartPreds, UNPROVIDED))) {
                SubLObject node_var = $$ProperNoun;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_11 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$ProperNoun, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject pos = node_var;
                                            final SubLObject pred_var2 = $$speechPartPreds;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pos, NIL, pred_var2)) {
                                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pos, NIL, pred_var2);
                                                SubLObject done_var2 = NIL;
                                                final SubLObject token_var2 = NIL;
                                                while (NIL == done_var2) {
                                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                    if (NIL != valid2) {
                                                        SubLObject final_index_iterator2 = NIL;
                                                        try {
                                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                                            SubLObject done_var_$7 = NIL;
                                                            final SubLObject token_var_$8 = NIL;
                                                            while (NIL == done_var_$7) {
                                                                final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$8);
                                                                final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(as2));
                                                                if (NIL != valid_$9) {
                                                                    final SubLObject spp = assertions_high.gaf_arg2(as2);
                                                                    final SubLObject mt2 = assertions_high.assertion_mt(as2);
                                                                    hash_table_utilities.pushnew_hash(spp, mt2, $derived_preds$.getGlobalValue(), UNPROVIDED);
                                                                }
                                                                done_var_$7 = makeBoolean(NIL == valid_$9);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values2 = getValuesAsVector();
                                                                if (NIL != final_index_iterator2) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                }
                                                                restoreValuesFromVector(_values2);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var2 = makeBoolean(NIL == valid2);
                                                } 
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$11 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$25;
                                                                            for (iteration_state_$25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$25); iteration_state_$25 = dictionary_contents.do_dictionary_contents_next(iteration_state_$25)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$25);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$13, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$25);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$12, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$27;
                                                            final SubLObject new_list = cdolist_list_var_$27 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$27.first();
                                                            while (NIL != cdolist_list_var_$27) {
                                                                final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$14, thread);
                                                                }
                                                                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                                                generating_fn = cdolist_list_var_$27.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$9, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$11, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$17, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$8, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$9, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, $$ProperNoun, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_11, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_10, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_9, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$7, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$8, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$6, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$7, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $derived_preds$.getGlobalValue();
    }

    public static SubLObject derived_predP(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (!hash_table_count($derived_preds$.getGlobalValue()).isPositive()) {
            initialize_derived_preds();
        }
        final SubLObject mts = gethash(obj, $derived_preds$.getGlobalValue(), UNPROVIDED);
        SubLObject mt_okP = kb_utilities.kbeq(mt, $$InferencePSC);
        if (NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = mts, ok_mt = NIL, ok_mt = csome_list_var.first(); (NIL == mt_okP) && (NIL != csome_list_var); mt_okP = genl_lexicon_mtP(mt, ok_mt) , csome_list_var = csome_list_var.rest() , ok_mt = csome_list_var.first()) {
            }
        }
        return makeBoolean((NIL != mts) && (NIL != mt_okP));
    }

    public static SubLObject base_preds_of_pred(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject base_preds = NIL;
        if (NIL != derived_predP(pred, mt)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = $$regularSuffix;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$30 = NIL;
                                final SubLObject token_var_$31 = NIL;
                                while (NIL == done_var_$30) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$31);
                                    final SubLObject valid_$32 = makeBoolean(!token_var_$31.eql(gaf));
                                    if (NIL != valid_$32) {
                                        final SubLObject more_basic_pred = assertions_high.gaf_arg2(gaf);
                                        base_preds = union(base_preds, base_preds_of_pred(more_basic_pred, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                    }
                                    done_var_$30 = makeBoolean(NIL == valid_$32);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL != base_preds ? base_preds : list(pred);
    }

    public static SubLObject do_speech_part_preds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list62);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$34 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list62);
            current_$34 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list62);
            if (NIL == member(current_$34, $list63, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$34 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list62);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : $$InferencePSC;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject defining_mt = $sym67$DEFINING_MT;
        return list(PROGN, $list69, list(DO_DICTIONARY, list(pred, defining_mt, $speech_part_preds$, done), listS(PWHEN, list(COR, listS(KBEQ, mt, $list74), list($sym75$GENL_LEXICON_MT_, mt, defining_mt)), append(body, NIL))));
    }

    public static SubLObject speech_part_preds_initializedP() {
        return makeBoolean((NIL != dictionary.dictionary_p($speech_part_preds$.getGlobalValue())) && (NIL == dictionary.dictionary_empty_p($speech_part_preds$.getGlobalValue())));
    }

    public static SubLObject clear_speech_part_preds() {
        if (NIL == dictionary.dictionary_p($speech_part_preds$.getGlobalValue())) {
            $speech_part_preds$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), $int$256));
        }
        return dictionary.clear_dictionary($speech_part_preds$.getGlobalValue());
    }

    public static SubLObject initialize_speech_part_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_speech_part_preds();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != valid_constantP($$SpeechPartPredicate, UNPROVIDED)) {
                SubLObject node_var = $$SpeechPartPredicate;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$37 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$SpeechPartPredicate, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$39 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject sp_type = node_var;
                                            final SubLObject pred_var = $$isa;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sp_type, TWO_INTEGER, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sp_type, TWO_INTEGER, pred_var);
                                                SubLObject done_var = NIL;
                                                final SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            SubLObject done_var_$43 = NIL;
                                                            final SubLObject token_var_$44 = NIL;
                                                            while (NIL == done_var_$43) {
                                                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                                                                final SubLObject valid_$45 = makeBoolean(!token_var_$44.eql(as));
                                                                if (NIL != valid_$45) {
                                                                    final SubLObject spp = assertions_high.gaf_arg1(as);
                                                                    final SubLObject mt = assertions_high.assertion_mt(as);
                                                                    dictionary_utilities.dictionary_push($speech_part_preds$.getGlobalValue(), spp, mt);
                                                                    removal_modules_lexicon.set_up_removal_support_for_speech_part_predicate(spp);
                                                                }
                                                                done_var_$43 = makeBoolean(NIL == valid_$45);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                } 
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$40 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            SubLObject iteration_state_$50;
                                                                            for (iteration_state_$50 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$50); iteration_state_$50 = dictionary_contents.do_dictionary_contents_next(iteration_state_$50)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$50);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$42, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$50);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$41, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$52;
                                                            final SubLObject new_list = cdolist_list_var_$52 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$52.first();
                                                            while (NIL != cdolist_list_var_$52) {
                                                                final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$43, thread);
                                                                }
                                                                cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                                                                generating_fn = cdolist_list_var_$52.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$40, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$40, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$42, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$39, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$38, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, $$SpeechPartPredicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$38, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$37, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$37, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$36, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$35, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $speech_part_preds$.getGlobalValue();
    }

    public static SubLObject ensure_speech_part_preds_initialized() {
        if (NIL == speech_part_preds_initializedP()) {
            initialize_speech_part_preds();
        }
        return $INITIALIZED;
    }

    public static SubLObject speech_part_predP(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        ensure_speech_part_preds_initialized();
        final SubLObject mts = dictionary.dictionary_lookup_without_values($speech_part_preds$.getGlobalValue(), obj, UNPROVIDED);
        SubLObject mt_okP = kb_utilities.kbeq(mt, $$InferencePSC);
        if (NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = mts, ok_mt = NIL, ok_mt = csome_list_var.first(); (NIL == mt_okP) && (NIL != csome_list_var); mt_okP = genl_lexicon_mtP(mt, ok_mt) , csome_list_var = csome_list_var.rest() , ok_mt = csome_list_var.first()) {
            }
        }
        return makeBoolean((NIL != mts) && (NIL != mt_okP));
    }

    public static SubLObject all_speech_part_preds(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        ensure_speech_part_preds_initialized();
        if (NIL != kb_utilities.kbeq(mt, $$InferencePSC)) {
            return dictionary.dictionary_keys($speech_part_preds$.getGlobalValue());
        }
        SubLObject ans = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($speech_part_preds$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sp = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject sp_mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject mt_okP = NIL;
            if (NIL == mt_okP) {
                SubLObject csome_list_var;
                SubLObject sp_mt;
                for (csome_list_var = sp_mts, sp_mt = NIL, sp_mt = csome_list_var.first(); (NIL == mt_okP) && (NIL != csome_list_var); mt_okP = genl_lexicon_mtP(mt, sp_mt) , csome_list_var = csome_list_var.rest() , sp_mt = csome_list_var.first()) {
                }
            }
            if (NIL != mt_okP) {
                ans = cons(sp, ans);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return ans;
    }

    public static SubLObject spec_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return genl_pos_predP(pred2, pred1, mt);
    }

    public static SubLObject clear_genl_pos_predP() {
        final SubLObject cs = $genl_pos_predP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_genl_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($genl_pos_predP_caching_state$.getGlobalValue(), list(pred1, pred2, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject genl_pos_predP_internal(final SubLObject pred1, final SubLObject pred2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pred1.equal(pred2)) {
            return T;
        }
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = makeBoolean((NIL != forts.fort_p(pred1)) && (NIL != genl_predicates.genl_predP(pred1, pred2, UNPROVIDED, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject genl_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $genl_pos_predP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym78$GENL_POS_PRED_, $sym79$_GENL_POS_PRED__CACHING_STATE_, $int$4096, EQUAL, THREE_INTEGER, $int$128);
            memoization_state.register_genl_preds_dependent_cache_clear_callback($sym80$CLEAR_GENL_POS_PRED_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred1, pred2, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(genl_pos_predP_internal(pred1, pred2, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred1, pred2, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_genl_pos_pred_from_mt_infoP() {
        final SubLObject cs = $genl_pos_pred_from_mt_infoP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_genl_pos_pred_from_mt_infoP(final SubLObject pred1, final SubLObject pred2, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        return memoization_state.caching_state_remove_function_results_with_args($genl_pos_pred_from_mt_infoP_caching_state$.getGlobalValue(), list(pred1, pred2, mt_info), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject genl_pos_pred_from_mt_infoP_internal(final SubLObject pred1, final SubLObject pred2, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                ans = makeBoolean((NIL != forts.fort_p(pred1)) && (NIL != genl_predicates.genl_predP(pred1, pred2, UNPROVIDED, UNPROVIDED)));
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
                    ans = makeBoolean((NIL != forts.fort_p(pred1)) && (NIL != genl_predicates.genl_predP(pred1, pred2, UNPROVIDED, UNPROVIDED)));
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
                        ans = makeBoolean((NIL != forts.fort_p(pred1)) && (NIL != genl_predicates.genl_predP(pred1, pred2, UNPROVIDED, UNPROVIDED)));
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
                        ans = makeBoolean((NIL != forts.fort_p(pred1)) && (NIL != genl_predicates.genl_predP(pred1, pred2, UNPROVIDED, UNPROVIDED)));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return ans;
    }

    public static SubLObject genl_pos_pred_from_mt_infoP(final SubLObject pred1, final SubLObject pred2, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        SubLObject caching_state = $genl_pos_pred_from_mt_infoP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym81$GENL_POS_PRED_FROM_MT_INFO_, $sym85$_GENL_POS_PRED_FROM_MT_INFO__CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int$128);
            memoization_state.register_genl_preds_dependent_cache_clear_callback($sym86$CLEAR_GENL_POS_PRED_FROM_MT_INFO_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred1, pred2, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(genl_pos_pred_from_mt_infoP_internal(pred1, pred2, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred1, pred2, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject word_form_predictableP(final SubLObject word, final SubLObject string, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != speech_part_predP(pred, UNPROVIDED) : "lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + pred;
        return subl_promotions.memberP(string, lexicon_cache.generate_regular_strings(word, pred, mt), $sym88$STRING_, UNPROVIDED);
    }

    public static SubLObject get_strings_of_type(final SubLObject word_unit, final SubLObject pos, SubLObject include, SubLObject exceptions, SubLObject mt) {
        if (include == UNPROVIDED) {
            include = $ALL;
        }
        if (exceptions == UNPROVIDED) {
            exceptions = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        final SubLObject preds = max_preds_matching_pos(include, pos, mt, NIL);
        SubLObject ans = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL != preds) {
                ans = lexicon_cache.strings_of_word_unit(word_unit, preds, exceptions, UNPROVIDED);
            }
            if (((NIL != valid_constantP($$ClosedClassWord, UNPROVIDED)) && (NIL != valid_constantP($$partOfSpeech, UNPROVIDED))) && (NIL != closed_lexical_classP(pos, UNPROVIDED))) {
                SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(word_unit, ONE_INTEGER, $$partOfSpeech, UNPROVIDED, UNPROVIDED);
                SubLObject as = NIL;
                as = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != genl_posP(assertions_high.gaf_arg2(as), pos, UNPROVIDED)) {
                        final SubLObject item_var = assertions_high.gaf_arg3(as);
                        if (NIL == member(item_var, ans, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                            ans = cons(item_var, ans);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    as = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject clear_get_strings_of_type_cached() {
        final SubLObject cs = $get_strings_of_type_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_strings_of_type_cached(final SubLObject word_unit, final SubLObject pos, SubLObject include, SubLObject exceptions, SubLObject mt) {
        if (include == UNPROVIDED) {
            include = $ALL;
        }
        if (exceptions == UNPROVIDED) {
            exceptions = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_strings_of_type_cached_caching_state$.getGlobalValue(), list(word_unit, pos, include, exceptions, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_strings_of_type_cached_internal(final SubLObject word_unit, final SubLObject pos, final SubLObject include, final SubLObject exceptions, final SubLObject mt) {
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        return get_strings_of_type(word_unit, pos, include, exceptions, mt);
    }

    public static SubLObject get_strings_of_type_cached(final SubLObject word_unit, final SubLObject pos, SubLObject include, SubLObject exceptions, SubLObject mt) {
        if (include == UNPROVIDED) {
            include = $ALL;
        }
        if (exceptions == UNPROVIDED) {
            exceptions = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $get_strings_of_type_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_STRINGS_OF_TYPE_CACHED, $get_strings_of_type_cached_caching_state$, $int$512, EQL, FIVE_INTEGER, $int$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(word_unit, pos, include, exceptions, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word_unit.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pos.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (include.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (exceptions.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_strings_of_type_cached_internal(word_unit, pos, include, exceptions, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word_unit, pos, include, exceptions, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject string_is_pos_on_wuP_internal(final SubLObject string, final SubLObject word_unit, final SubLObject pos, SubLObject mt, SubLObject string_lookup_function, SubLObject parse_morphologically) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (string_lookup_function == UNPROVIDED) {
            string_lookup_function = GET_STRINGS_OF_TYPE;
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != lexical_wordP(word_unit) : "lexicon_accessors.lexical_wordP(word_unit) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word_unit) " + word_unit;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        if (NIL == word_has_posP(word_unit, pos, UNPROVIDED)) {
            return NIL;
        }
        if ((NIL == skip_to_morphological_parsingP(parse_morphologically)) && (NIL != string_is_pos_on_wuP_asserted(string, word_unit, pos, mt))) {
            return T;
        }
        SubLObject strings = NIL;
        if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
            final SubLObject pcase_var = string_lookup_function;
            if (pcase_var.eql(GET_STRINGS_OF_TYPE)) {
                strings = get_strings_of_type(word_unit, pos, $ALL, NIL, mt);
            } else
                if (pcase_var.eql(GET_STRINGS_OF_TYPE_CACHED)) {
                    strings = get_strings_of_type_cached(word_unit, pos, $ALL, NIL, mt);
                } else {
                    strings = funcall(string_lookup_function, word_unit, pos, $ALL, NIL, mt);
                }

        }
        if (NIL != subl_promotions.memberP(string, strings, symbol_function(EQUALP), UNPROVIDED)) {
            return T;
        }
        if (parse_morphologically == $NEVER) {
            return NIL;
        }
        final SubLObject words = morphological_word_parser.words_of_complex_word_stringXspeech_part(string, pos);
        return subl_promotions.memberP(word_unit, words, symbol_function($sym98$EQUALS_EL_), UNPROVIDED);
    }

    public static SubLObject string_is_pos_on_wuP(final SubLObject string, final SubLObject word_unit, final SubLObject pos, SubLObject mt, SubLObject string_lookup_function, SubLObject parse_morphologically) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (string_lookup_function == UNPROVIDED) {
            string_lookup_function = GET_STRINGS_OF_TYPE;
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return string_is_pos_on_wuP_internal(string, word_unit, pos, mt, string_lookup_function, parse_morphologically);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym93$STRING_IS_POS_ON_WU_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym93$STRING_IS_POS_ON_WU_, SIX_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym93$STRING_IS_POS_ON_WU_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(string, word_unit, pos, mt, string_lookup_function, parse_morphologically);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (word_unit.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pos.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (string_lookup_function.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && parse_morphologically.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(string_is_pos_on_wuP_internal(string, word_unit, pos, mt, string_lookup_function, parse_morphologically)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, word_unit, pos, mt, string_lookup_function, parse_morphologically));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject string_is_pos_on_wuP_asserted(final SubLObject string, final SubLObject word_unit, final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$55 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$56 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                        ensure_speech_part_preds_initialized();
                        SubLObject iteration_state;
                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($speech_part_preds$.getGlobalValue())); (NIL == ans) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                            thread.resetMultipleValues();
                            final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            final SubLObject defining_mt = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ((NIL != kb_utilities.kbeq($$InferencePSC, $$InferencePSC)) || (NIL != genl_lexicon_mtP($$InferencePSC, defining_mt))) {
                                final SubLObject pred_var = pred;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, ONE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, ONE_INTEGER, pred_var);
                                    SubLObject done_var = ans;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                SubLObject done_var_$57 = ans;
                                                final SubLObject token_var_$58 = NIL;
                                                while (NIL == done_var_$57) {
                                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$58);
                                                    final SubLObject valid_$59 = makeBoolean(!token_var_$58.eql(as));
                                                    if ((NIL != valid_$59) && assertions_high.gaf_arg2(as).equalp(string)) {
                                                        final SubLObject curr_pos = pos_of_pred(pred);
                                                        final SubLObject okP = (NIL != pos) ? genl_posP(curr_pos, pos, UNPROVIDED) : NIL;
                                                        if (NIL != okP) {
                                                            ans = T;
                                                        }
                                                    }
                                                    done_var_$57 = makeBoolean((NIL == valid_$59) || (NIL != ans));
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean((NIL == valid) || (NIL != ans));
                                    } 
                                }
                            }
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$56, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$55, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject string_is_pred_on_wuP(final SubLObject string, final SubLObject word_unit, final SubLObject pred, SubLObject mt, SubLObject parse_morphologically) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != lexical_wordP(word_unit) : "lexicon_accessors.lexical_wordP(word_unit) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word_unit) " + word_unit;
        assert NIL != speech_part_predP(pred, UNPROVIDED) : "lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + pred;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject successP = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$62 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        final SubLObject string_preds = preds_of_stringXword(string, word_unit, lexicon_vars.$misspellingsP$.getDynamicValue(thread), mt, $NEVER);
                        if (NIL == successP) {
                            SubLObject csome_list_var = string_preds;
                            SubLObject string_pred = NIL;
                            string_pred = csome_list_var.first();
                            while ((NIL == successP) && (NIL != csome_list_var)) {
                                if (NIL != genl_pos_predP(string_pred, pred, mt)) {
                                    successP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                string_pred = csome_list_var.first();
                            } 
                        }
                    }
                    if ((NIL == successP) && (parse_morphologically != $NEVER)) {
                        final SubLObject morph_string_preds = morphological_word_parser.preds_of_complex_word_stringXword(string, word_unit);
                        if (NIL == successP) {
                            SubLObject csome_list_var = morph_string_preds;
                            SubLObject string_pred = NIL;
                            string_pred = csome_list_var.first();
                            while ((NIL == successP) && (NIL != csome_list_var)) {
                                if (NIL != genl_pos_predP(string_pred, pred, mt)) {
                                    successP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                string_pred = csome_list_var.first();
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$62, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    public static SubLObject best_wu_for_string(final SubLObject string, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject words = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
        try {
            lexicon_vars.$parse_morphologically$.bind($AS_FALLBACK, thread);
            words = words_of_stringXspeech_part(string, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            lexicon_vars.$parse_morphologically$.rebind(_prev_bind_0, thread);
        }
        return words.first();
    }

    public static SubLObject best_pos_for_stringXwuXpos(final SubLObject string, final SubLObject wu, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject poses = pos_of_stringXword(string, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = find(pos, poses, $sym100$SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject words_of_stringXpred(final SubLObject string, final SubLObject pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != speech_part_predP(pred, UNPROVIDED) : "lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + pred;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject result = NIL;
        if (NIL != string_utilities.non_empty_string_p(string)) {
            final SubLObject current_state = memoization_state.current_memoization_state();
            final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
            try {
                lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
                final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$64 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                            result = nl_trie_accessors.nl_trie_words_of_stringXpred(string, pred, misspellingsP, lookup_mt, UNPROVIDED);
                        }
                        if (NIL != proceed_with_morphological_parsingP(result, parse_morphologically)) {
                            result = delete_duplicates(append(result, morphological_word_parser.words_of_complex_word_stringXpred(string, pred)), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if ((NIL != upper_case_p(string_utilities.first_char(string))) && (NIL != genl_posP(pos_of_pred(pred), $$ProperNoun, lookup_mt))) {
                            result = delete_duplicates(append(result, words_of_stringXpred(Strings.string_downcase(string, UNPROVIDED, UNPROVIDED), lexicon_utilities.common_noun_form_of_pred(pred), UNPROVIDED, UNPROVIDED, UNPROVIDED)), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$64, thread);
                }
            } finally {
                lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject clear_pos_for_keyword() {
        final SubLObject cs = $pos_for_keyword_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pos_for_keyword(final SubLObject pos_keyword, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishLexiconMt;
        }
        return memoization_state.caching_state_remove_function_results_with_args($pos_for_keyword_caching_state$.getGlobalValue(), list(pos_keyword, lexical_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pos_for_keyword_internal(final SubLObject pos_keyword, final SubLObject lexical_mt) {
        assert NIL != keywordp(pos_keyword) : "Types.keywordp(pos_keyword) " + "CommonSymbols.NIL != Types.keywordp(pos_keyword) " + pos_keyword;
        SubLObject real_pos = NIL;
        if (pos_keyword.eql($ALL_NOUN_FORMS)) {
            real_pos = genls.all_specs($$Noun, lexical_mt, UNPROVIDED);
        } else
            if (pos_keyword.eql($NOUN)) {
                real_pos = $list106;
            } else
                if (pos_keyword.eql($MASS_NOUN)) {
                    real_pos = $list108;
                } else
                    if (pos_keyword.eql($SIMPLE_NOUN)) {
                        real_pos = genls.all_specs($$CountNoun, lexical_mt, UNPROVIDED);
                    } else
                        if (pos_keyword.eql($DEVERBAL_NOUN)) {
                            real_pos = genls.all_specs($$DeVerbalNoun, lexical_mt, UNPROVIDED);
                        } else
                            if (pos_keyword.eql($AGENTIVE_NOUN)) {
                                real_pos = genls.all_specs($$AgentiveNoun, lexical_mt, UNPROVIDED);
                            } else
                                if (pos_keyword.eql($GERUNDIVE_NOUN)) {
                                    real_pos = genls.all_specs($$GerundiveNoun, lexical_mt, UNPROVIDED);
                                } else
                                    if (pos_keyword.eql($PROPER_NOUN)) {
                                        real_pos = genls.all_specs($$ProperNoun, lexical_mt, UNPROVIDED);
                                    } else
                                        if (pos_keyword.eql($VERB)) {
                                            real_pos = $list119;
                                        } else
                                            if (pos_keyword.eql($AUX)) {
                                                real_pos = genls.all_specs($$AuxVerb, lexical_mt, UNPROVIDED);
                                            } else
                                                if (pos_keyword.eql($ADJECTIVE)) {
                                                    real_pos = genls.all_specs($$Adjective, lexical_mt, UNPROVIDED);
                                                } else
                                                    if (pos_keyword.eql($ADVERB)) {
                                                        real_pos = genls.all_specs($$Adverb, lexical_mt, UNPROVIDED);
                                                    } else
                                                        if (pos_keyword.eql($PREP)) {
                                                            real_pos = genls.all_specs($$Preposition, lexical_mt, UNPROVIDED);
                                                        } else
                                                            if (pos_keyword.eql($DET)) {
                                                                real_pos = genls.all_specs($$Determiner, lexical_mt, UNPROVIDED);
                                                            } else
                                                                if (pos_keyword.eql($CONJ)) {
                                                                    real_pos = genls.all_specs($$Conjunction, lexical_mt, UNPROVIDED);
                                                                } else
                                                                    if (pos_keyword.eql($ANY)) {
                                                                        real_pos = all_speech_parts(lexical_mt);
                                                                    }















        return real_pos;
    }

    public static SubLObject pos_for_keyword(final SubLObject pos_keyword, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $$EnglishLexiconMt;
        }
        SubLObject caching_state = $pos_for_keyword_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(POS_FOR_KEYWORD, $pos_for_keyword_caching_state$, $int$64, EQL, TWO_INTEGER, TWELVE_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pos_keyword, lexical_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pos_keyword.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexical_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pos_for_keyword_internal(pos_keyword, lexical_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pos_keyword, lexical_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject words_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != keywordp(pos_keyword) : "Types.keywordp(pos_keyword) " + "CommonSymbols.NIL != Types.keywordp(pos_keyword) " + pos_keyword;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject word_units = NIL;
        SubLObject preds = NIL;
        SubLObject lex_preds = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$66 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject word_units_$67 = nl_trie_accessors.nl_trie_words_of_stringXpos(string, pos_keyword, misspellingsP, lookup_mt, UNPROVIDED);
                        final SubLObject preds_$68 = thread.secondMultipleValue();
                        final SubLObject lex_preds_$69 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        word_units = word_units_$67;
                        preds = preds_$68;
                        lex_preds = lex_preds_$69;
                        if (remove_duplicates(lex_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).equal($list135)) {
                            word_units = NIL;
                            preds = NIL;
                            lex_preds = NIL;
                        }
                    }
                    if (NIL != proceed_with_morphological_parsingP(word_units, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_word_units = morphological_word_parser.words_of_complex_word_stringXpos(string, pos_keyword, lookup_mt);
                        final SubLObject morph_preds = thread.secondMultipleValue();
                        final SubLObject morph_lex_preds = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        word_units = append(word_units, morph_word_units);
                        preds = append(preds, morph_preds);
                        lex_preds = append(lex_preds, morph_lex_preds);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$66, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(word_units, preds, lex_preds);
    }

    public static SubLObject words_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject word_units = NIL;
        SubLObject preds = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$71 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject word_units_$72 = nl_trie_accessors.nl_trie_words_of_stringXspeech_part(string, pos, misspellingsP, lookup_mt, UNPROVIDED);
                        final SubLObject preds_$73 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        word_units = word_units_$72;
                        preds = preds_$73;
                    }
                    if (NIL != proceed_with_morphological_parsingP(word_units, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_word_units = morphological_word_parser.words_of_complex_word_stringXspeech_part(string, pos);
                        final SubLObject morph_preds = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        word_units = append(word_units, morph_word_units);
                        preds = append(preds, Mapping.mapcan(IDENTITY, morph_preds, EMPTY_SUBL_OBJECT_ARRAY));
                    }
                    if ((NIL != upper_case_p(string_utilities.first_char(string))) && (NIL != genl_posP(pos, $$ProperNoun, lookup_mt))) {
                        thread.resetMultipleValues();
                        final SubLObject proper_word_units = words_of_stringXspeech_part(Strings.string_downcase(string, UNPROVIDED, UNPROVIDED), lexicon_utilities.common_noun_form_of_pos(pos), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject proper_preds = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        word_units = append(word_units, proper_word_units);
                        preds = append(preds, Mapping.mapcar(PROPER_NOUN_FORM_OF_PRED, proper_preds));
                    }
                } finally {
                    final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$71, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(word_units, preds);
    }

    public static SubLObject preds_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        return NIL != kb_loaded() ? copy_list(preds_of_stringXword_cached(string, word, misspellingsP, lookup_mt, parse_morphologically)) : NIL;
    }

    public static SubLObject clear_preds_of_stringXword() {
        return clear_preds_of_stringXword_cached();
    }

    public static SubLObject clear_preds_of_stringXword_cached() {
        final SubLObject cs = $preds_of_stringXword_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_preds_of_stringXword_cached(final SubLObject string, final SubLObject word, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject parse_morphologically) {
        return memoization_state.caching_state_remove_function_results_with_args($preds_of_stringXword_cached_caching_state$.getGlobalValue(), list(string, word, misspellingsP, lookup_mt, parse_morphologically), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject preds_of_stringXword_cached_internal(final SubLObject string, final SubLObject word, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject parse_morphologically) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != lexical_wordP(word) : "lexicon_accessors.lexical_wordP(word) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word) " + word;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject result = NIL;
        if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
            result = nl_trie_accessors.nl_trie_preds_of_stringXword(string, word, misspellingsP, lookup_mt, UNPROVIDED);
        }
        if (NIL != proceed_with_morphological_parsingP(result, parse_morphologically)) {
            result = delete_duplicates(append(result, morphological_word_parser.preds_of_complex_word_stringXword(string, word)), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject preds_of_stringXword_cached(final SubLObject string, final SubLObject word, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject parse_morphologically) {
        SubLObject caching_state = $preds_of_stringXword_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym137$PREDS_OF_STRING_WORD_CACHED, $sym138$_PREDS_OF_STRING_WORD_CACHED_CACHING_STATE_, $int$256, EQUAL, FIVE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(string, word, misspellingsP, lookup_mt, parse_morphologically);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (word.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (misspellingsP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (lookup_mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && parse_morphologically.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(preds_of_stringXword_cached_internal(string, word, misspellingsP, lookup_mt, parse_morphologically)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, word, misspellingsP, lookup_mt, parse_morphologically));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject other_strings_of_wu(final SubLObject word_unit, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != lexical_wordP(word_unit) : "lexicon_accessors.lexical_wordP(word_unit) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word_unit) " + word_unit;
        SubLObject strings = NIL;
        final SubLObject string_var = $sym139$_STRING;
        final SubLObject v_properties = list($MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER);
        final SubLObject _prev_bind_0 = lexicon_vars.$misspellingsP$.currentBinding(thread);
        try {
            lexicon_vars.$misspellingsP$.bind(misspellingsP, thread);
            if (NIL != valid_constantP($$partOfSpeech, UNPROVIDED)) {
                strings = ask_utilities.query_variable(string_var, list($$partOfSpeech, word_unit, $sym141$_POS, string_var), lookup_mt, v_properties);
            }
        } finally {
            lexicon_vars.$misspellingsP$.rebind(_prev_bind_0, thread);
        }
        return remove_duplicates(strings, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject right_frames_for_pos(final SubLObject pos) {
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        if (pos.eql($$Verb)) {
            return lexicon_vars.verb_frames($$GeneralEnglishMt);
        }
        if (pos.eql($$Adverb)) {
            return isa.all_fort_instances($$FrameForAdverbs, $$GeneralEnglishMt, UNPROVIDED);
        }
        if (pos.eql($$ProperCountNoun)) {
            return $list146;
        }
        if (pos.eql($$ProperMassNoun)) {
            return $list146;
        }
        if (pos.eql($$CountNoun)) {
            return isa.all_fort_instances($$FrameForNouns, $$GeneralEnglishMt, UNPROVIDED);
        }
        if (pos.eql($$MassNoun)) {
            return delete($$ZeroArticleFrame, isa.all_fort_instances($$FrameForNouns, $$GeneralEnglishMt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (pos.eql($$Adjective)) {
            return delete($$FrameForAdjectives, isa.all_fort_instances($$FrameForAdjectives, $$GeneralEnglishMt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject pos_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject result = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$75 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        result = nl_trie_accessors.nl_trie_pos_of_string(string, misspellingsP, lookup_mt, UNPROVIDED);
                    }
                    if (NIL != proceed_with_morphological_parsingP(result, parse_morphologically)) {
                        result = delete_duplicates(append(result, morphological_word_parser.pos_of_complex_word_string(string)), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$75, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject string_is_posP(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject result = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$77 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    result = nl_trie_accessors.nl_trie_string_is_posP(string, pos, misspellingsP, lookup_mt);
                    if ((NIL == result) && (parse_morphologically != $NEVER)) {
                        result = morphological_word_parser.complex_word_string_is_speech_partP(string, pos);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$78 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$78, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$77, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject string_is_form_of_aux_verbP(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return string_is_posP(string, $$AuxVerb, misspellingsP, lookup_mt, UNPROVIDED);
    }

    public static SubLObject clear_closed_lexical_class_hash() {
        clrhash($closed_lexical_class_strings$.getGlobalValue());
        clrhash($closed_lexical_class_strings_case_insensitive$.getGlobalValue());
        return $closed_lexical_class_strings$.getGlobalValue();
    }

    public static SubLObject initialize_closed_lexical_class_strings() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_closed_lexical_class_hash();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != valid_constantP($$ClosedClassWord, UNPROVIDED)) {
                SubLObject node_var = $$ClosedClassWord;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$79 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$81 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$ClosedClassWord, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$82 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$83 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$86 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject pos = node_var;
                                            final SubLObject pred_var = $$partOfSpeech;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pos, TWO_INTEGER, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pos, TWO_INTEGER, pred_var);
                                                SubLObject done_var = NIL;
                                                final SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            SubLObject done_var_$87 = NIL;
                                                            final SubLObject token_var_$88 = NIL;
                                                            while (NIL == done_var_$87) {
                                                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$88);
                                                                final SubLObject valid_$89 = makeBoolean(!token_var_$88.eql(as));
                                                                if (NIL != valid_$89) {
                                                                    final SubLObject string = assertions_high.gaf_arg3(as);
                                                                    final SubLObject mt = assertions_high.assertion_mt(as);
                                                                    hash_table_utilities.pushnew_hash(string, mt, $closed_lexical_class_strings$.getGlobalValue(), UNPROVIDED);
                                                                    hash_table_utilities.pushnew_hash(string, mt, $closed_lexical_class_strings_case_insensitive$.getGlobalValue(), UNPROVIDED);
                                                                }
                                                                done_var_$87 = makeBoolean(NIL == valid_$89);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                } 
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$84 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$84 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$85 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            SubLObject iteration_state_$94;
                                                                            for (iteration_state_$94 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$94); iteration_state_$94 = dictionary_contents.do_dictionary_contents_next(iteration_state_$94)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$94);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$86 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$86, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$94);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$85, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$96;
                                                            final SubLObject new_list = cdolist_list_var_$96 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$96.first();
                                                            while (NIL != cdolist_list_var_$96) {
                                                                final SubLObject _prev_bind_0_$87 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$87, thread);
                                                                }
                                                                cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                                                                generating_fn = cdolist_list_var_$96.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$84, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$84, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$86, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$83, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$82, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, $$ClosedClassWord, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$82, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$81, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$81, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$80, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$88 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$79, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $closed_lexical_class_strings$.getGlobalValue();
    }

    public static SubLObject closed_lexical_class_string_intP(final SubLObject string, final SubLObject mt, final SubLObject case_sensitiveP) {
        if (!string.isString()) {
            return NIL;
        }
        if (!hash_table_count($closed_lexical_class_strings$.getGlobalValue()).isPositive()) {
            initialize_closed_lexical_class_strings();
        }
        final SubLObject hash = (NIL != case_sensitiveP) ? $closed_lexical_class_strings$.getGlobalValue() : $closed_lexical_class_strings_case_insensitive$.getGlobalValue();
        final SubLObject ok_mts = gethash(string, hash, UNPROVIDED);
        SubLObject mt_okP = kb_utilities.kbeq(mt, $$InferencePSC);
        if (NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = ok_mts, ok_mt = NIL, ok_mt = csome_list_var.first(); (NIL == mt_okP) && (NIL != csome_list_var); mt_okP = genl_lexicon_mtP(mt, ok_mt) , csome_list_var = csome_list_var.rest() , ok_mt = csome_list_var.first()) {
            }
        }
        return makeBoolean((NIL != ok_mts) && (NIL != mt_okP));
    }

    public static SubLObject closed_lexical_class_stringP(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return closed_lexical_class_string_intP(string, mt, T);
    }

    public static SubLObject closed_lexical_class_string_case_insensitiveP(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return closed_lexical_class_string_intP(string, mt, NIL);
    }

    public static SubLObject non_pronominal_closed_lexical_class_stringP(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        return makeBoolean((NIL != closed_lexical_class_stringP(string, mt)) && (NIL == string_is_posP(string, $$Pronoun, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject contains_closed_lexical_class_wordP(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject class_member_found = NIL;
        final SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding(thread);
        try {
            string_utilities.$test_char$.bind(string_utilities.$space_char$.getGlobalValue(), thread);
            SubLObject cdolist_list_var;
            final SubLObject word_list_var = cdolist_list_var = string_utilities.break_words(string, NOT_TEST_CHAR, UNPROVIDED);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != closed_lexical_class_stringP(word, UNPROVIDED)) {
                    class_member_found = T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        } finally {
            string_utilities.$test_char$.rebind(_prev_bind_0, thread);
        }
        return class_member_found;
    }

    public static SubLObject clear_closed_lexical_class_strings() {
        final SubLObject cs = $closed_lexical_class_strings_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_closed_lexical_class_strings(SubLObject lookup_mt) {
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($closed_lexical_class_strings_caching_state$.getGlobalValue(), list(lookup_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject closed_lexical_class_strings_internal(final SubLObject lookup_mt) {
        SubLObject open_class_strings = NIL;
        SubLObject open_class_string = NIL;
        SubLObject mts = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($closed_lexical_class_strings$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                open_class_string = getEntryKey(cdohash_entry);
                mts = getEntryValue(cdohash_entry);
                SubLObject mt_okP = kb_utilities.kbeq(lookup_mt, $$InferencePSC);
                if (NIL == mt_okP) {
                    SubLObject csome_list_var;
                    SubLObject mt;
                    for (csome_list_var = mts, mt = NIL, mt = csome_list_var.first(); (NIL == mt_okP) && (NIL != csome_list_var); mt_okP = genl_lexicon_mtP(lookup_mt, mt) , csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                    }
                }
                if (NIL != mt_okP) {
                    open_class_strings = cons(open_class_string, open_class_strings);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return open_class_strings;
    }

    public static SubLObject closed_lexical_class_strings(SubLObject lookup_mt) {
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $closed_lexical_class_strings_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CLOSED_LEXICAL_CLASS_STRINGS, $closed_lexical_class_strings_caching_state$, $int$32, EQL, ONE_INTEGER, FOUR_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, lookup_mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(closed_lexical_class_strings_internal(lookup_mt)));
            memoization_state.caching_state_put(caching_state, lookup_mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject closed_lexical_classP(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return subl_promotions.memberP(obj, closed_lexical_classes(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_closed_lexical_classes() {
        final SubLObject cs = $closed_lexical_classes_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_closed_lexical_classes(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($closed_lexical_classes_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject closed_lexical_classes_internal(final SubLObject mt) {
        return genls.all_specs($$ClosedClassWord, mt, UNPROVIDED);
    }

    public static SubLObject closed_lexical_classes(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $closed_lexical_classes_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CLOSED_LEXICAL_CLASSES, $closed_lexical_classes_caching_state$, NIL, EQL, ONE_INTEGER, EIGHT_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(closed_lexical_classes_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject maybe_initialize_prep_strings() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!hash_table_count($preposition_strings$.getDynamicValue(thread)).isPositive()) {
            if (NIL != valid_constantP($$Preposition, UNPROVIDED)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    SubLObject node_var = $$Preposition;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$99 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$100 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$101 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$101 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$102 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$Preposition, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$102 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$103 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                            while (NIL != node_var) {
                                                final SubLObject pos = node_var;
                                                final SubLObject pred_var = $$partOfSpeech;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pos, TWO_INTEGER, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pos, TWO_INTEGER, pred_var);
                                                    SubLObject done_var = NIL;
                                                    final SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                        if (NIL != valid) {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                SubLObject done_var_$107 = NIL;
                                                                final SubLObject token_var_$108 = NIL;
                                                                while (NIL == done_var_$107) {
                                                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$108);
                                                                    final SubLObject valid_$109 = makeBoolean(!token_var_$108.eql(as));
                                                                    if (NIL != valid_$109) {
                                                                        final SubLObject string = assertions_high.gaf_arg3(as);
                                                                        final SubLObject mt = assertions_high.assertion_mt(as);
                                                                        hash_table_utilities.pushnew_hash(string, mt, $preposition_strings$.getDynamicValue(thread), UNPROVIDED);
                                                                    }
                                                                    done_var_$107 = makeBoolean(NIL == valid_$109);
                                                                } 
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$103 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values = getValuesAsVector();
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    restoreValuesFromVector(_values);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    } 
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$104 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$104 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$105 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                SubLObject iteration_state_$114;
                                                                                for (iteration_state_$114 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$114); iteration_state_$114 = dictionary_contents.do_dictionary_contents_next(iteration_state_$114)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$114);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$106, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$114);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$105, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$116;
                                                                final SubLObject new_list = cdolist_list_var_$116 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$116.first();
                                                                while (NIL != cdolist_list_var_$116) {
                                                                    final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var2 = sol2;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (NIL != csome_list_var2) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$107, thread);
                                                                    }
                                                                    cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                                                                    generating_fn = cdolist_list_var_$116.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$104, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$104, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                node_var = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$106, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$103, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$102, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, $$Preposition, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$102, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$101, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$101, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$100, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$108 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$108, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$99, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return $preposition_strings$.getDynamicValue(thread);
        }
        return NIL;
    }

    public static SubLObject preposition_stringP(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        maybe_initialize_prep_strings();
        final SubLObject ok_mts = gethash(string, $preposition_strings$.getDynamicValue(thread), UNPROVIDED);
        SubLObject mt_okP = kb_utilities.kbeq(mt, $$InferencePSC);
        if (NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = ok_mts, ok_mt = NIL, ok_mt = csome_list_var.first(); (NIL == mt_okP) && (NIL != csome_list_var); mt_okP = genl_lexicon_mtP(mt, ok_mt) , csome_list_var = csome_list_var.rest() , ok_mt = csome_list_var.first()) {
            }
        }
        return makeBoolean((NIL != ok_mts) && (NIL != mt_okP));
    }

    public static SubLObject quick_lexical_wordP(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return quick_lexical_wordP_int(obj, mt);
    }

    public static SubLObject quick_lexical_wordP_int(final SubLObject obj, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wordP = NIL;
        if (NIL != forts.fort_p(obj)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                if (NIL == wordP) {
                    SubLObject csome_list_var;
                    SubLObject pred;
                    for (csome_list_var = $pos_forms_spec_preds$.getGlobalValue(), pred = NIL, pred = csome_list_var.first(); (NIL == wordP) && (NIL != csome_list_var); wordP = makeBoolean((NIL != somewhere_cache.maybe_some_pred_assertion_somewhereP(pred, obj, ONE_INTEGER, UNPROVIDED)) && (NIL != kb_mapping_utilities.some_pred_value(obj, pred, ONE_INTEGER, UNPROVIDED))) , csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else
            if (!obj.isAtom()) {
                wordP = quick_word_nautP(obj);
            }

        return wordP;
    }

    public static SubLObject quick_word_nautP(final SubLObject obj) {
        return formula_pattern_match.formula_matches_pattern(obj, $list161);
    }

    public static SubLObject lexical_wordP_internal(final SubLObject obj) {
        return isa.isa_in_any_mtP(obj, $$LexicalWord);
    }

    public static SubLObject lexical_wordP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return lexical_wordP_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym95$LEXICAL_WORD_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym95$LEXICAL_WORD_, ONE_INTEGER, $int$1000, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym95$LEXICAL_WORD_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(lexical_wordP_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject derived_wordP_internal(final SubLObject obj) {
        return isa.isa_in_any_mtP(obj, $$DerivedWord);
    }

    public static SubLObject derived_wordP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return derived_wordP_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym164$DERIVED_WORD_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym164$DERIVED_WORD_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym164$DERIVED_WORD_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(derived_wordP_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject initialize_vulgar_words() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        set.clear_set($vulgar_words$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != valid_constantP($$InherentlyVulgarWord, UNPROVIDED)) {
                final SubLObject node_var = $$InherentlyVulgarWord;
                final SubLObject _prev_bind_0_$119 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_1_$120 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$121 = node_var;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$120 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$121 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$121 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$122 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$122 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$123 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$123 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$129 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$121, UNPROVIDED);
                                                while (NIL != node_var_$121) {
                                                    final SubLObject tt_node_var = node_var_$121;
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$124 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$124 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$125 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$133;
                                                                                    for (iteration_state_$133 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$133); iteration_state_$133 = dictionary_contents.do_dictionary_contents_next(iteration_state_$133)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$133);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$126 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject word;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        word = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, word)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(word, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(word)) {
                                                                                                                set.set_add(word, $vulgar_words$.getGlobalValue());
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject word2 = NIL;
                                                                                                        word2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(word2)) {
                                                                                                                    set.set_add(word2, $vulgar_words$.getGlobalValue());
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            word2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$126, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$133);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$125, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = NIL;
                                                                        SubLObject mt2 = NIL;
                                                                        SubLObject tv2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list168);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list168);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list168);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$127 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$128 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject word;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    word = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, word)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(word, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(word)) {
                                                                                                            set.set_add(word, $vulgar_words$.getGlobalValue());
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$137 = sol;
                                                                                                    SubLObject word2 = NIL;
                                                                                                    word2 = csome_list_var_$137.first();
                                                                                                    while (NIL != csome_list_var_$137) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(word2)) {
                                                                                                                set.set_add(word2, $vulgar_words$.getGlobalValue());
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$137 = csome_list_var_$137.rest();
                                                                                                        word2 = csome_list_var_$137.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$128, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$127, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list168);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$138;
                                                                    final SubLObject new_list = cdolist_list_var_$138 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$138.first();
                                                                    while (NIL != cdolist_list_var_$138) {
                                                                        final SubLObject _prev_bind_0_$129 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject word3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    word3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, word3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(word3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(word3)) {
                                                                                            set.set_add(word3, $vulgar_words$.getGlobalValue());
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var3 = sol2;
                                                                                    SubLObject word4 = NIL;
                                                                                    word4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(word4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (NIL != forts.fort_p(word4)) {
                                                                                                set.set_add(word4, $vulgar_words$.getGlobalValue());
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        word4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$129, thread);
                                                                        }
                                                                        cdolist_list_var_$138 = cdolist_list_var_$138.rest();
                                                                        generating_fn = cdolist_list_var_$138.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$124, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$124, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject module_var2 = NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$130 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$125 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$121);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$131 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$134;
                                                                                    for (iteration_state_$134 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$134); iteration_state_$134 = dictionary_contents.do_dictionary_contents_next(iteration_state_$134)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$134);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$132 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        SubLObject csome_list_var4 = sol3;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                        while (NIL != csome_list_var4) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$132, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$134);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$131, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$139;
                                                                    final SubLObject new_list2 = cdolist_list_var_$139 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$139.first();
                                                                    while (NIL != cdolist_list_var_$139) {
                                                                        final SubLObject _prev_bind_0_$133 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            final SubLObject sol4;
                                                                            final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                SubLObject basis_object4;
                                                                                SubLObject state4;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    SubLObject csome_list_var5 = sol4;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                    while (NIL != csome_list_var5) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$133, thread);
                                                                        }
                                                                        cdolist_list_var_$139 = cdolist_list_var_$139.rest();
                                                                        generating_fn2 = cdolist_list_var_$139.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$125, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$130, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    } 
                                                    node_var_$121 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$129, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$123, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$123, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$122, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$122, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$121, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$121, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$134 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$134, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$120, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$135 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$135, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$120, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$119, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $INITIALIZED;
    }

    public static SubLObject vulgar_wordP(final SubLObject obj) {
        if (NIL != set.set_emptyP($vulgar_words$.getGlobalValue())) {
            initialize_vulgar_words();
        }
        return set.set_memberP(obj, $vulgar_words$.getGlobalValue());
    }

    public static SubLObject pos_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != lexical_wordP(word) : "lexicon_accessors.lexical_wordP(word) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word) " + word;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject result = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$149 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        result = nl_trie_accessors.nl_trie_pos_of_stringXword(string, word, misspellingsP, lookup_mt, UNPROVIDED);
                    }
                    if (NIL != proceed_with_morphological_parsingP(result, parse_morphologically)) {
                        result = delete_duplicates(append(result, morphological_word_parser.pos_of_complex_word_stringXword(string, word)), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$150 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$149, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject clear_nl_caches() {
        clear_cached_lexical_access_functions();
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        clear_nl_parsing_caches();
        return NIL;
    }

    public static SubLObject clear_nl_parsing_caches() {
        psp_main.clear_psp_caches();
        clear_cached_lexical_access_functions();
        return NIL;
    }

    public static SubLObject clear_cached_lexical_access_functions() {
        lexicon_vars.clear_cached_lexical_vars();
        clear_agr_of_det_string();
        lexicon_utilities.clear_preds_licensed_by_pos_cached();
        clear_genl_pos_pred_from_mt_infoP();
        clear_pos_of_pred();
        lexicon_utilities.clear_preds_of_pos_cached();
        clear_closed_lexical_classes();
        rkf_string_weeders.clear_all_rkf_stringP_caches();
        clear_verb_only_stringP();
        lexicon_utilities.clear_bar_level_cached();
        lexicon_utilities.clear_pos_of_cat_cached();
        clear_genl_posP();
        clear_preds_of_stringXword_cached();
        nl_trie.clear_nl_trie_caches();
        return NIL;
    }

    public static SubLObject pos_of_word(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != lexical_wordP(word_unit) : "lexicon_accessors.lexical_wordP(word_unit) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word_unit) " + word_unit;
        SubLObject result = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$151 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL != forts.fort_p(word_unit)) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_0_$152 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            SubLObject cdolist_list_var = $pos_forms_spec_preds$.getGlobalValue();
                            SubLObject pred = NIL;
                            pred = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                if (NIL != indexed_term_p(pred)) {
                                    result = append(result, kb_mapping_utilities.pred_values(word_unit, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                pred = cdolist_list_var.first();
                            } 
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$152, thread);
                        }
                    } else
                        if (NIL != narts_high.naut_p(word_unit)) {
                            final SubLObject affix = lexicon_utilities.derived_word_affix(word_unit, UNPROVIDED);
                            result = mwp_rule.mwp_result_poses_for_reified_affix(affix, UNPROVIDED);
                        } else {
                            Errors.warn($str169$The_word_unit__S_is_neither_a_FOR, word_unit);
                            result = NIL;
                        }

                } finally {
                    final SubLObject _prev_bind_0_$153 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$153, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$151, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject word_has_posP(final SubLObject word_unit, final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != lexical_wordP(word_unit) : "lexicon_accessors.lexical_wordP(word_unit) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word_unit) " + word_unit;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        SubLObject ans = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL == ans) {
                SubLObject csome_list_var;
                SubLObject word_pos;
                for (csome_list_var = pos_of_word(word_unit, mt), word_pos = NIL, word_pos = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = (NIL != mt) ? genl_posP(word_pos, pos, mt) : genl_posP(word_pos, pos, mt_relevance_macros.$mt$.getDynamicValue(thread)) , csome_list_var = csome_list_var.rest() , word_pos = csome_list_var.first()) {
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject clear_verb_only_stringP() {
        final SubLObject cs = $verb_only_stringP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_verb_only_stringP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args($verb_only_stringP_caching_state$.getGlobalValue(), list(string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject verb_only_stringP_internal(final SubLObject string) {
        final SubLObject poses = pos_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == poses) {
            return NIL;
        }
        SubLObject cdolist_list_var = poses;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == genl_posP(pos, $$Verb, UNPROVIDED)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject verb_only_stringP(final SubLObject string) {
        SubLObject caching_state = $verb_only_stringP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym170$VERB_ONLY_STRING_, $sym171$_VERB_ONLY_STRING__CACHING_STATE_, $int$512, EQUAL, ONE_INTEGER, $int$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(verb_only_stringP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject typed_denots_of_string(final SubLObject string, final SubLObject type, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject semantic_mt, SubLObject parse_morphologically, SubLObject excluded_predicates) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = $$InferencePSC;
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        if (excluded_predicates == UNPROVIDED) {
            excluded_predicates = lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(string, STRINGP);
        SubLTrampolineFile.enforceType(type, EL_FORT_P);
        SubLTrampolineFile.enforceType(abbrev_types, LISTP);
        SubLTrampolineFile.enforceType(denot_type, KEYWORDP);
        SubLTrampolineFile.enforceType(misspellingsP, BOOLEANP);
        SubLTrampolineFile.enforceType(skip_namestringsP, BOOLEANP);
        SubLTrampolineFile.enforceType(lookup_mt, $sym176$HLMT_);
        SubLTrampolineFile.enforceType(semantic_mt, $sym176$HLMT_);
        SubLTrampolineFile.enforceType(parse_morphologically, PARSE_MORPHOLOGICALLY_OPTION_P);
        SubLTrampolineFile.enforceType(excluded_predicates, SET_P);
        SubLObject result = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$154 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots = denots_of_string(string, abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, parse_morphologically, UNPROVIDED, UNPROVIDED);
                    final SubLObject pred_lists = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject denot = NIL;
                    SubLObject denot_$155 = NIL;
                    SubLObject preds = NIL;
                    SubLObject preds_$156 = NIL;
                    denot = denots;
                    denot_$155 = denot.first();
                    preds = pred_lists;
                    preds_$156 = preds.first();
                    while ((NIL != preds) || (NIL != denot)) {
                        if (NIL != typed_denots_of_string_preds_okP(preds_$156, excluded_predicates)) {
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(semantic_mt);
                            final SubLObject _prev_bind_0_$155 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (NIL != denot_has_typeP(denot_$155, type, UNPROVIDED)) {
                                    final SubLObject item_var = denot_$155;
                                    if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        result = cons(item_var, result);
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$155, thread);
                            }
                        }
                        denot = denot.rest();
                        denot_$155 = denot.first();
                        preds = preds.rest();
                        preds_$156 = preds.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$156 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$156, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$154, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject typed_denots_of_string_preds_okP(final SubLObject preds, final SubLObject excluded_predicates) {
        SubLObject okP = NIL;
        if (NIL == okP) {
            SubLObject csome_list_var = preds;
            SubLObject pred = NIL;
            pred = csome_list_var.first();
            while ((NIL == okP) && (NIL != csome_list_var)) {
                if (NIL == set.set_memberP(pred, excluded_predicates)) {
                    okP = T;
                }
                csome_list_var = csome_list_var.rest();
                pred = csome_list_var.first();
            } 
        }
        return okP;
    }

    public static SubLObject denot_has_typeP_internal(final SubLObject denot, final SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != at_defns.quick_quiet_has_typeP(denot, type, mt)) {
                ans = T;
            } else
                if ((NIL != forts.fort_p(denot)) && (NIL != isa.instantiationP(denot, type, UNPROVIDED))) {
                    ans = T;
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject denot_has_typeP(final SubLObject denot, final SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return denot_has_typeP_internal(denot, type, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym183$DENOT_HAS_TYPE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym183$DENOT_HAS_TYPE_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym183$DENOT_HAS_TYPE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(denot, type, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (denot.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(denot_has_typeP_internal(denot, type, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(denot, type, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject denot_might_have_typeP_internal(final SubLObject denot, final SubLObject type) {
        if (NIL != denot_has_typeP(denot, type, UNPROVIDED)) {
            return T;
        }
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var;
            SubLObject v_isa;
            for (csome_list_var = isa.isa(denot, UNPROVIDED, UNPROVIDED), v_isa = NIL, v_isa = csome_list_var.first(); (NIL == badP) && (NIL != csome_list_var); badP = disjoint_with.disjoint_withP(v_isa, type, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , v_isa = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == badP);
    }

    public static SubLObject denot_might_have_typeP(final SubLObject denot, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return denot_might_have_typeP_internal(denot, type);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym184$DENOT_MIGHT_HAVE_TYPE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym184$DENOT_MIGHT_HAVE_TYPE_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym184$DENOT_MIGHT_HAVE_TYPE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(denot, type);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (denot.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && type.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(denot_might_have_typeP_internal(denot, type)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(denot, type));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject multi_typed_denots_of_string(final SubLObject string, final SubLObject pos_types, final SubLObject neg_types, SubLObject include_genlP, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject semantic_mt, SubLObject excluded_predicates) {
        if (include_genlP == UNPROVIDED) {
            include_genlP = NIL;
        }
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = $$InferencePSC;
        }
        if (excluded_predicates == UNPROVIDED) {
            excluded_predicates = lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$159 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots = denots_of_string(string, abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject pred_lists = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject denot = NIL;
                    SubLObject denot_$160 = NIL;
                    SubLObject preds = NIL;
                    SubLObject preds_$161 = NIL;
                    denot = denots;
                    denot_$160 = denot.first();
                    preds = pred_lists;
                    preds_$161 = preds.first();
                    while ((NIL != preds) || (NIL != denot)) {
                        if (NIL != typed_denots_of_string_preds_okP(preds_$161, excluded_predicates)) {
                            final SubLObject fn = (NIL != include_genlP) ? symbol_function(MORE_SPECIFIC_P) : symbol_function($sym183$DENOT_HAS_TYPE_);
                            SubLObject fail_pos = NIL;
                            SubLObject fail_neg = NIL;
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(semantic_mt);
                            final SubLObject _prev_bind_0_$160 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (NIL == fail_pos) {
                                    SubLObject csome_list_var = pos_types;
                                    SubLObject pos_type = NIL;
                                    pos_type = csome_list_var.first();
                                    while ((NIL == fail_pos) && (NIL != csome_list_var)) {
                                        if (NIL == funcall(fn, denot_$160, pos_type)) {
                                            fail_pos = T;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        pos_type = csome_list_var.first();
                                    } 
                                }
                                if ((NIL == fail_pos) && (NIL == fail_neg)) {
                                    SubLObject csome_list_var = neg_types;
                                    SubLObject neg_type = NIL;
                                    neg_type = csome_list_var.first();
                                    while ((NIL == fail_neg) && (NIL != csome_list_var)) {
                                        if (NIL != funcall(fn, denot_$160, neg_type)) {
                                            fail_neg = T;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        neg_type = csome_list_var.first();
                                    } 
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$160, thread);
                            }
                            if ((NIL == fail_pos) && (NIL == fail_neg)) {
                                result = cons(denot_$160, result);
                            }
                        }
                        denot = denot.rest();
                        denot_$160 = denot.first();
                        preds = preds.rest();
                        preds_$161 = preds.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$161 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$161, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$159, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject typed_denots_of_string_at_place(final SubLObject string, final SubLObject type, final SubLObject place, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject semantic_mt) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (semantic_mt == UNPROVIDED) {
            semantic_mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$164 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject cdolist_list_var;
                    final SubLObject typed_denots = cdolist_list_var = typed_denots_of_string(string, type, abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, semantic_mt, UNPROVIDED, UNPROVIDED);
                    SubLObject denot = NIL;
                    denot = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != in_region_p(denot, place, semantic_mt)) {
                            result = cons(denot, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        denot = cdolist_list_var.first();
                    } 
                    if (((NIL == result) && type.equal($$City)) && (NIL != genls.genlsP(type, $$GeopoliticalEntity, semantic_mt, UNPROVIDED))) {
                        result = cons(list($$CityNamedFn, string, place), result);
                    }
                    if (NIL == result) {
                        result = cons(list($$InstanceNamedFn, string, list($$SubcollectionOfWithRelationToFn, type, $$inRegion, place)), result);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$165 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$165, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$164, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject in_region_p(final SubLObject place, final SubLObject region, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            final SubLObject is_place_a_gpeP = isa.isaP(place, $$GeopoliticalEntity, UNPROVIDED, UNPROVIDED);
            final SubLObject is_region_a_gpeP = isa.isaP(region, $$GeopoliticalEntity, UNPROVIDED, UNPROVIDED);
            final SubLObject is_place_a_geo_regionP = isa.isaP(place, $$GeographicalRegion, UNPROVIDED, UNPROVIDED);
            final SubLObject is_region_a_geo_regionP = isa.isaP(region, $$GeographicalRegion, UNPROVIDED, UNPROVIDED);
            if (((NIL != is_region_a_gpeP) && (NIL != is_place_a_gpeP)) && (NIL != geopolitical_subdivisionP(region, place, mt))) {
                result = T;
            } else
                if (((NIL != is_place_a_geo_regionP) && (NIL != is_region_a_geo_regionP)) && (NIL != geographical_subregionP(region, place, mt))) {
                    result = T;
                } else {
                    if ((NIL != is_region_a_gpeP) && (NIL != is_place_a_geo_regionP)) {
                        if (NIL == result) {
                            SubLObject csome_list_var;
                            SubLObject region_territory;
                            for (csome_list_var = territories_for_gpe(region), region_territory = NIL, region_territory = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = geographical_subregionP(region_territory, place, mt) , csome_list_var = csome_list_var.rest() , region_territory = csome_list_var.first()) {
                            }
                        }
                        if ((NIL == result) && (NIL == result)) {
                            SubLObject csome_list_var;
                            SubLObject place_gpe;
                            for (csome_list_var = gpe_for_territory(place), place_gpe = NIL, place_gpe = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = geopolitical_subdivisionP(region, place_gpe, mt) , csome_list_var = csome_list_var.rest() , place_gpe = csome_list_var.first()) {
                            }
                        }
                    }
                    if (((NIL != is_region_a_geo_regionP) && (NIL != is_place_a_gpeP)) && (NIL == result)) {
                        if (NIL == result) {
                            SubLObject csome_list_var;
                            SubLObject region_territory;
                            for (csome_list_var = gpe_for_territory(region), region_territory = NIL, region_territory = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = geographical_subregionP(region_territory, place, mt) , csome_list_var = csome_list_var.rest() , region_territory = csome_list_var.first()) {
                            }
                        }
                        if ((NIL == result) && (NIL == result)) {
                            SubLObject csome_list_var;
                            SubLObject region_gpe;
                            for (csome_list_var = gpe_for_territory(region), region_gpe = NIL, region_gpe = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = geopolitical_subdivisionP(region_gpe, place, mt) , csome_list_var = csome_list_var.rest() , region_gpe = csome_list_var.first()) {
                            }
                        }
                    }
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject geopolitical_subdivisionP(final SubLObject big_place, final SubLObject small_place, final SubLObject mt) {
        return cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$geopoliticalSubdivision, big_place, small_place), mt, UNPROVIDED));
    }

    public static SubLObject geographical_subregionP(final SubLObject big_place, final SubLObject small_place, final SubLObject mt) {
        return cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$geographicalSubRegions, big_place, small_place), mt, UNPROVIDED));
    }

    public static SubLObject territories_for_gpe(final SubLObject region) {
        return kb_mapping_utilities.pred_values(region, $$territoryOf, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gpe_for_territory(final SubLObject territory) {
        return kb_mapping_utilities.pred_values(narts_high.nart_substitute(territory), $$territoryOf, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject denots_of_partial_string(SubLObject string, SubLObject lookup_mt, SubLObject permissiveP, SubLObject test) {
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (permissiveP == UNPROVIDED) {
            permissiveP = T;
        }
        if (test == UNPROVIDED) {
            test = EQUALP;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != permissiveP) && (!string_utilities.string_last_n(ONE_INTEGER, string).equal($str196$_))) {
            string = cconcatenate(string, $str196$_);
        }
        SubLObject result = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$166 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject cleaned_string = Strings.string_left_trim($list197, string);
                    SubLObject tokenized_string = string_utilities.string_tokenize(cleaned_string, $list198, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject initial_matches = nl_trie_accessors.nl_trie_matching_phrases(tokenized_string.first(), $INFIX);
                    final SubLObject first_token = tokenized_string.first();
                    final SubLObject first_token_length = length(tokenized_string.first());
                    SubLObject token_count = NIL;
                    tokenized_string = tokenized_string.rest();
                    if (list_utilities.last_one(tokenized_string).equal($str200$)) {
                        tokenized_string = butlast(tokenized_string, UNPROVIDED);
                    }
                    token_count = length(tokenized_string);
                    SubLObject cdolist_list_var = initial_matches;
                    SubLObject item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject phrase = nl_trie_accessors.nl_trie_index_item_phrase(item);
                        final SubLObject v_term = nl_trie_accessors.nl_trie_index_item_term(item);
                        final SubLObject first_token_location = search(first_token, phrase, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject current_token_number = ZERO_INTEGER;
                        SubLObject string_offset = NIL;
                        SubLObject next_token = NIL;
                        SubLObject fail = NIL;
                        if (NIL != first_token_location) {
                            string_offset = add(first_token_location, first_token_length);
                        } else {
                            fail = T;
                        }
                        while (current_token_number.numL(token_count) && (NIL == fail)) {
                            next_token = nth(current_token_number, tokenized_string);
                            if (next_token.equal($str200$)) {
                                current_token_number = add(current_token_number, ONE_INTEGER);
                            } else
                                if ((NIL != next_token) && (!next_token.equal($str196$_))) {
                                    final SubLObject location = search(next_token, phrase, test, IDENTITY, ZERO_INTEGER, NIL, string_offset, UNPROVIDED);
                                    if (NIL == location) {
                                        continue;
                                    }
                                    string_offset = add(location, length(next_token));
                                    current_token_number = add(current_token_number, ONE_INTEGER);
                                } else
                                    if (next_token.equal($str196$_)) {
                                        current_token_number = add(current_token_number, ONE_INTEGER);
                                        next_token = nth(current_token_number, tokenized_string);
                                        if (NIL == next_token) {
                                            result = cons(v_term, result);
                                        } else {
                                            final SubLObject location = search(next_token, phrase, test, IDENTITY, ZERO_INTEGER, NIL, string_offset, UNPROVIDED);
                                            if (NIL != location) {
                                                string_offset = add(location, length(next_token));
                                                current_token_number = add(current_token_number, ONE_INTEGER);
                                            } else {
                                                fail = T;
                                            }
                                        }
                                    } else {
                                        if (string_offset.eql(length(phrase))) {
                                            continue;
                                        }
                                        fail = T;
                                        Errors.warn($str201$I_should_never_be_called___);
                                    }


                        } 
                        if (token_count.eql(current_token_number) && string_offset.eql(length(phrase))) {
                            result = cons(v_term, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$167 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$167, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$166, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject denotation_mapper(final SubLObject string, SubLObject excluded_preds, SubLObject mode, SubLObject parse_morphologically) {
        if (excluded_preds == UNPROVIDED) {
            excluded_preds = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $GREEDY;
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(string, STRINGP);
        SubLTrampolineFile.enforceType(excluded_preds, LIST_OF_PREDICATES_P);
        SubLTrampolineFile.enforceType(mode, KEYWORDP);
        SubLTrampolineFile.enforceType(parse_morphologically, PARSE_MORPHOLOGICALLY_OPTION_P);
        SubLObject result = NIL;
        SubLObject failures = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$168 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject cdolist_list_var;
                    final SubLObject raw_mapping = cdolist_list_var = nl_trie_accessors.nl_trie_denotation_mapper(string, excluded_preds, mode, parse_morphologically);
                    SubLObject token = NIL;
                    token = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != standard_tokenization.string_token_value(token)) {
                            result = cons(token, result);
                        } else {
                            final SubLObject number = string_utilities.string_to_number(standard_tokenization.string_token_string(token));
                            if (NIL != number) {
                                result = cons(standard_tokenization.new_string_token(standard_tokenization.string_token_string(token), number), result);
                            } else {
                                failures = cons(token, failures);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        token = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$169 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$169, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$168, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(nreverse(result), nreverse(failures));
    }

    public static SubLObject all_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject denots = NIL;
        SubLObject predicate_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$170 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots_$171 = nl_trie_accessors.nl_trie_all_denots_of_string(string, misspellingsP, lookup_mt, UNPROVIDED);
                        final SubLObject predicate_lists_$172 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = denots_$171;
                        predicate_lists = predicate_lists_$172;
                    }
                    if (NIL != proceed_with_morphological_parsingP(denots, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string(string, UNPROVIDED);
                        final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = append(denots, morph_denots);
                        predicate_lists = append(predicate_lists, morph_predicate_lists);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$171 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$171, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$170, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(denots, predicate_lists);
    }

    public static SubLObject most_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject denots = NIL;
        SubLObject predicate_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$174 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots_$175 = nl_trie_accessors.nl_trie_denots_of_string(string, $list209, $RELATED, misspellingsP, NIL, lookup_mt, UNPROVIDED);
                        final SubLObject predicate_lists_$176 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = denots_$175;
                        predicate_lists = predicate_lists_$176;
                    }
                    if (NIL != proceed_with_morphological_parsingP(denots, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string(string, UNPROVIDED);
                        final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = append(denots, morph_denots);
                        predicate_lists = append(predicate_lists, morph_predicate_lists);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$175 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$175, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$174, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(denots, predicate_lists);
    }

    public static SubLObject all_parsing_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject ans = NIL;
        final SubLObject skip_namesP = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$178 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots = nl_trie_accessors.nl_trie_denots_of_string(string, $list209, $DENOT, misspellingsP, skip_namesP, lookup_mt, UNPROVIDED);
                        final SubLObject pred_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject denot = NIL;
                        SubLObject denot_$179 = NIL;
                        SubLObject pred_list = NIL;
                        SubLObject pred_list_$180 = NIL;
                        denot = denots;
                        denot_$179 = denot.first();
                        pred_list = pred_lists;
                        pred_list_$180 = pred_list.first();
                        while ((NIL != pred_list) || (NIL != denot)) {
                            SubLObject okP = NIL;
                            if (NIL == okP) {
                                SubLObject csome_list_var = pred_list_$180;
                                SubLObject pred = NIL;
                                pred = csome_list_var.first();
                                while ((NIL == okP) && (NIL != csome_list_var)) {
                                    if (NIL == parsing_utilities.npp_excluded_name_predP(pred)) {
                                        okP = T;
                                        ans = cons(denot_$179, ans);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    pred = csome_list_var.first();
                                } 
                            }
                            denot = denot.rest();
                            denot_$179 = denot.first();
                            pred_list = pred_list.rest();
                            pred_list_$180 = pred_list.first();
                        } 
                        final SubLObject result = read_from_string_ignoring_errors(string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != collection_defns.cyc_real_number(result)) {
                            ans = cons(result, ans);
                        }
                    }
                    if (NIL != proceed_with_morphological_parsingP(ans, parse_morphologically)) {
                        ans = czer_utilities.delete_el_duplicates(append(ans, morphological_word_parser.denots_of_complex_word_string(string, UNPROVIDED)));
                    }
                } finally {
                    final SubLObject _prev_bind_0_$179 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$178, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject denots_of_string(final SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject parse_morphologically, SubLObject parse_dates_and_numbersP, SubLObject lexicon) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (skip_namestringsP == UNPROVIDED) {
            skip_namestringsP = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        if (parse_dates_and_numbersP == UNPROVIDED) {
            parse_dates_and_numbersP = T;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(string, CYCL_STRING_P);
        SubLTrampolineFile.enforceType(abbrev_types, LISTP);
        SubLTrampolineFile.enforceType(denot_type, KEYWORDP);
        SubLTrampolineFile.enforceType(misspellingsP, BOOLEANP);
        SubLTrampolineFile.enforceType(skip_namestringsP, BOOLEANP);
        SubLTrampolineFile.enforceType(lookup_mt, $sym212$VALID_DENOTS_OF_STRING_LOOKUP_MT_SPECIFICATION_);
        SubLTrampolineFile.enforceType(parse_morphologically, PARSE_MORPHOLOGICALLY_OPTION_P);
        SubLObject denots = NIL;
        SubLObject predicate_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$182 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lookup_mt.isString()) {
                        lookup_mt = denots_mt_for_language(lexicon_utilities.get_language_for_code(lookup_mt));
                    }
                    final SubLObject _prev_bind_0_$183 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                            if (NIL == lexicon) {
                                lexicon = denots_of_string_lexicon.lexicon_for_denots_of_string(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread));
                            }
                            thread.resetMultipleValues();
                            final SubLObject denots_$184 = denots_of_string_lexicon.lexicon_denots_of_string(string, lexicon);
                            final SubLObject predicate_lists_$185 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            denots = denots_$184;
                            predicate_lists = predicate_lists_$185;
                            if ((NIL != parse_dates_and_numbersP) && string.isString()) {
                                final SubLObject date_and_number_denots = date_and_number_denots_of_string(string);
                                thread.resetMultipleValues();
                                final SubLObject denots_$185 = add_denots_of_string_results(denots, predicate_lists, date_and_number_denots, make_list(length(date_and_number_denots), $list213));
                                final SubLObject predicate_lists_$186 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                denots = denots_$185;
                                predicate_lists = predicate_lists_$186;
                            }
                        }
                        if (string.isString() && (NIL != proceed_with_morphological_parsingP(denots, parse_morphologically))) {
                            thread.resetMultipleValues();
                            final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string(string, UNPROVIDED);
                            final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            thread.resetMultipleValues();
                            final SubLObject denots_$186 = add_denots_of_string_results(denots, predicate_lists, morph_denots, morph_predicate_lists);
                            final SubLObject predicate_lists_$187 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            denots = denots_$186;
                            predicate_lists = predicate_lists_$187;
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$183, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$184 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$184, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$182, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(denots, predicate_lists);
    }

    public static SubLObject valid_denots_of_string_lookup_mt_specificationP(final SubLObject obj) {
        return makeBoolean((NIL != hlmt.hlmt_p(obj)) || (obj.isString() && (NIL != lexicon_utilities.get_language_for_code(obj))));
    }

    public static SubLObject denots_mt_for_language(final SubLObject language) {
        final SubLObject validated_psc = kb_mapping_utilities.fpred_value_in_any_mt(language, $$validatedLexicalPSCForLanguage, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject monad = (NIL != validated_psc) ? validated_psc : lexicon_utilities.lexical_mt_for_language(language);
        return hlmt_czer.canonicalize_hlmt(make_binary_formula($$MtSpace, monad, $$AnytimePSC));
    }

    public static SubLObject add_denots_of_string_results(final SubLObject denots, final SubLObject predicate_lists, final SubLObject new_denots, final SubLObject new_predicate_lists) {
        SubLObject all_denots = denots;
        SubLObject all_predicate_lists = predicate_lists;
        SubLObject denot = NIL;
        SubLObject denot_$191 = NIL;
        SubLObject predicate_list = NIL;
        SubLObject predicate_list_$192 = NIL;
        denot = new_denots;
        denot_$191 = denot.first();
        predicate_list = new_predicate_lists;
        predicate_list_$192 = predicate_list.first();
        while ((NIL != predicate_list) || (NIL != denot)) {
            final SubLObject position = position(denot_$191, all_denots, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == position) {
                all_denots = list_utilities.add_to_end(denot_$191, all_denots);
                all_predicate_lists = list_utilities.add_to_end(predicate_list_$192, all_predicate_lists);
            } else {
                set_nth(position, all_predicate_lists, union(nth(position, all_predicate_lists), predicate_list_$192, symbol_function(EQUAL), UNPROVIDED));
            }
            denot = denot.rest();
            denot_$191 = denot.first();
            predicate_list = predicate_list.rest();
            predicate_list_$192 = predicate_list.first();
        } 
        return values(all_denots, all_predicate_lists);
    }

    public static SubLObject date_and_number_denots_of_string(final SubLObject string) {
        final SubLObject date_parses = date_utilities.parse_date_from_string_fast(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject number_parse = numeral_parser.string_to_interval(string);
        return list_utilities.cons_if(number_parse, date_parses);
    }

    public static SubLObject denots_of_stringXpred(final SubLObject string, final SubLObject pred, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP, SubLObject parse_morphologically) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (precise_with_theP == UNPROVIDED) {
            precise_with_theP = NIL;
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        if (NIL != speech_part_predP(pred, UNPROVIDED)) {
            return denots_of_stringXpos_pred(string, pred, abbrev_types, denot_type, misspellingsP, lookup_mt, parse_morphologically);
        }
        if (NIL != lexicon_vars.name_string_predP(pred)) {
            return denots_of_stringXnamestring_pred(string, pred, misspellingsP, lookup_mt, precise_with_theP);
        }
        Errors.error($str222$_S_passes_neither_SPEECH_PART_PRE, pred);
        return NIL;
    }

    public static SubLObject denots_of_stringXnamestring_pred(final SubLObject string, final SubLObject namestring_pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (precise_with_theP == UNPROVIDED) {
            precise_with_theP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != lexicon_vars.name_string_predP(namestring_pred) : "lexicon_vars.name_string_predP(namestring_pred) " + "CommonSymbols.NIL != lexicon_vars.name_string_predP(namestring_pred) " + namestring_pred;
        SubLObject result_denots = NIL;
        SubLObject result_preds = NIL;
        thread.resetMultipleValues();
        final SubLObject denots = denots_of_name_string(string, misspellingsP, lookup_mt, precise_with_theP);
        final SubLObject preds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject denot = NIL;
        SubLObject denot_$193 = NIL;
        SubLObject pred_list = NIL;
        SubLObject pred_list_$194 = NIL;
        denot = denots;
        denot_$193 = denot.first();
        pred_list = preds;
        pred_list_$194 = pred_list.first();
        while ((NIL != pred_list) || (NIL != denot)) {
            SubLObject cdolist_list_var = pred_list_$194;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject result_pred_list = NIL;
                if (NIL != genl_pos_predP(pred, namestring_pred, UNPROVIDED)) {
                    result_pred_list = cons(pred, result_pred_list);
                }
                if (NIL != result_pred_list) {
                    result_preds = cons(result_pred_list, result_preds);
                    result_denots = cons(denot_$193, result_denots);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            denot = denot.rest();
            denot_$193 = denot.first();
            pred_list = pred_list.rest();
            pred_list_$194 = pred_list.first();
        } 
        return values(nreverse(result_denots), nreverse(result_preds));
    }

    public static SubLObject denots_of_stringXpos_pred(final SubLObject string, final SubLObject pos_pred, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != speech_part_predP(pos_pred, UNPROVIDED) : "lexicon_accessors.speech_part_predP(pos_pred, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_part_predP(pos_pred, CommonSymbols.UNPROVIDED) " + pos_pred;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject denots = NIL;
        SubLObject predicate_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$195 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots_$196 = nl_trie_accessors.nl_trie_denots_of_stringXpred(string, pos_pred, abbrev_types, denot_type, misspellingsP, lookup_mt, UNPROVIDED);
                        final SubLObject predicate_lists_$197 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = denots_$196;
                        predicate_lists = predicate_lists_$197;
                    }
                    if (NIL != proceed_with_morphological_parsingP(denots, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_stringXpos_pred(string, pos_pred, lookup_mt, UNPROVIDED);
                        final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = append(denots, morph_denots);
                        predicate_lists = append(predicate_lists, morph_predicate_lists);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$196 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$196, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$195, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(denots, predicate_lists);
    }

    public static SubLObject denots_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject denots = NIL;
        SubLObject predicate_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$199 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots_$200 = nl_trie_accessors.nl_trie_denots_of_stringXspeech_part(string, pos, abbrev_types, denot_type, misspellingsP, lookup_mt, UNPROVIDED);
                        final SubLObject predicate_lists_$201 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = denots_$200;
                        predicate_lists = predicate_lists_$201;
                    }
                    if (NIL != proceed_with_morphological_parsingP(denots, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_stringXspeech_part(string, pos, UNPROVIDED);
                        final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = append(denots, morph_denots);
                        predicate_lists = append(predicate_lists, morph_predicate_lists);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$200 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$200, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$199, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(denots, predicate_lists);
    }

    public static SubLObject denots_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject denot_type, SubLObject misspellingsP, SubLObject abbrev_types, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = T;
        }
        if (abbrev_types == UNPROVIDED) {
            abbrev_types = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != keywordp(pos_keyword) : "Types.keywordp(pos_keyword) " + "CommonSymbols.NIL != Types.keywordp(pos_keyword) " + pos_keyword;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject denots = NIL;
        SubLObject predicate_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$203 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots_$204 = nl_trie_accessors.nl_trie_denots_of_stringXpos(string, pos_keyword, abbrev_types, denot_type, misspellingsP, lookup_mt, UNPROVIDED);
                        final SubLObject predicate_lists_$205 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = denots_$204;
                        predicate_lists = predicate_lists_$205;
                    }
                    if (NIL != proceed_with_morphological_parsingP(denots, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_stringXpos(string, pos_keyword, lookup_mt, UNPROVIDED);
                        final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = append(denots, morph_denots);
                        predicate_lists = append(predicate_lists, morph_predicate_lists);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$204 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$204, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$203, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(denots, predicate_lists);
    }

    public static SubLObject denots_of_name_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (precise_with_theP == UNPROVIDED) {
            precise_with_theP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = NIL;
        SubLObject pred_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$207 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$208 = nl_trie_accessors.nl_trie_denots_of_name_string(string, misspellingsP, lookup_mt, precise_with_theP, UNPROVIDED);
                    final SubLObject pred_lists_$209 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$208;
                    pred_lists = pred_lists_$209;
                } finally {
                    final SubLObject _prev_bind_0_$208 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$208, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$207, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(denots, pred_lists);
    }

    public static SubLObject denots_of_name_string_precise(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return denots_of_name_string(string, misspellingsP, lookup_mt, T);
    }

    public static SubLObject denots_of_wu(final SubLObject wu, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denotations = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject denot_preds = cdolist_list_var = nl_trie.nl_trie_denotation_predicates();
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == lexicon_utilities.stringlist_args_of_pred_cached(pred)) {
                    final SubLObject word_index = lexicon_utilities.wu_arg_of_pred_cached(pred);
                    final SubLObject denot_index = lexicon_utilities.denotatum_arg_of_pred_cached(pred);
                    SubLObject cdolist_list_var_$211 = kb_mapping.gather_gaf_arg_index(wu, word_index, pred, UNPROVIDED, UNPROVIDED);
                    SubLObject v_assert = NIL;
                    v_assert = cdolist_list_var_$211.first();
                    while (NIL != cdolist_list_var_$211) {
                        denotations = cons(cycl_utilities.formula_arg(v_assert, denot_index, UNPROVIDED), denotations);
                        cdolist_list_var_$211 = cdolist_list_var_$211.rest();
                        v_assert = cdolist_list_var_$211.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return denotations;
    }

    public static SubLObject proceed_with_morphological_parsingP(final SubLObject results_so_far, final SubLObject parse_morphologically_option) {
        if (parse_morphologically_option.eql($ONLY) || parse_morphologically_option.eql($ALWAYS)) {
            return T;
        }
        if (parse_morphologically_option.eql($AS_FALLBACK)) {
            return sublisp_null(results_so_far);
        }
        return NIL;
    }

    public static SubLObject skip_to_morphological_parsingP(final SubLObject parse_morphologically_option) {
        return eq(parse_morphologically_option, $ONLY);
    }

    public static SubLObject denots_of_acronym_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = NIL;
        SubLObject pred_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$212 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$213 = nl_trie_accessors.nl_trie_denots_of_acronym_string(string, misspellingsP, lookup_mt, UNPROVIDED);
                    final SubLObject pred_lists_$214 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$213;
                    pred_lists = pred_lists_$214;
                } finally {
                    final SubLObject _prev_bind_0_$213 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$213, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$212, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(denots, pred_lists);
    }

    public static SubLObject names_from_spelling(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = NIL;
        SubLObject pred_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$216 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$217 = nl_trie_accessors.nl_trie_names_from_spelling(string, misspellingsP, lookup_mt, UNPROVIDED);
                    final SubLObject pred_lists_$218 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$217;
                    pred_lists = pred_lists_$218;
                } finally {
                    final SubLObject _prev_bind_0_$217 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$217, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$216, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(denots, pred_lists);
    }

    public static SubLObject names_from_nickname(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = NIL;
        SubLObject pred_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$220 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$221 = nl_trie_accessors.nl_trie_names_from_nickname(string, misspellingsP, lookup_mt, UNPROVIDED);
                    final SubLObject pred_lists_$222 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$221;
                    pred_lists = pred_lists_$222;
                } finally {
                    final SubLObject _prev_bind_0_$221 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$221, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$220, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(denots, pred_lists);
    }

    public static SubLObject denots_of_abbreviation_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = NIL;
        SubLObject pred_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$224 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$225 = nl_trie_accessors.nl_trie_denots_of_abbreviation_string(string, misspellingsP, lookup_mt, UNPROVIDED);
                    final SubLObject pred_lists_$226 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$225;
                    pred_lists = pred_lists_$226;
                } finally {
                    final SubLObject _prev_bind_0_$225 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$225, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$224, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(denots, pred_lists);
    }

    public static SubLObject known_proper_noun_phraseP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(phrase) : "Types.stringp(phrase) " + "CommonSymbols.NIL != Types.stringp(phrase) " + phrase;
        final SubLObject proper_name_preds = isa.all_fort_instances($$ProperNamePredicate_Strict, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject denots = NIL;
        SubLObject predicates = NIL;
        SubLObject predicate_lists = NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind(NIL != current_state ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$228 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$229 = denots_of_string(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject predicate_lists_$230 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$229;
                    predicate_lists = predicate_lists_$230;
                    predicates = list_utilities.flatten(predicate_lists);
                    if ((NIL != denots) && (NIL == set_difference(predicates, proper_name_preds, UNPROVIDED, UNPROVIDED))) {
                        result = T;
                    }
                } finally {
                    final SubLObject _prev_bind_0_$229 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$229, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$228, thread);
            }
        } finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject determine_denotation_preds(final SubLObject denot_type) {
        if (denot_type.eql($JUST_RELATED)) {
            return $list228;
        }
        if (denot_type.eql($JUST_PLACEHOLDER)) {
            return $list230;
        }
        if (denot_type.eql($RELATED)) {
            return $list231;
        }
        if (denot_type.eql($ANY)) {
            return $list232;
        }
        return $list233;
    }

    public static SubLObject determine_denotation_pred(final SubLObject denot_type) {
        if (denot_type.eql($DENOT)) {
            return $$denotation;
        }
        if (denot_type.eql($PLACEHOLDER)) {
            return $$denotationPlaceholder;
        }
        if (denot_type.eql($RELATED)) {
            return $$denotationRelatedTo;
        }
        return NIL;
    }

    public static SubLObject meanings_of_sense(final SubLObject denot_type, final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denot_preds = determine_denotation_preds(denot_type);
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = denot_preds;
            SubLObject denot_pred = NIL;
            denot_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred_var = denot_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, NIL, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$232 = NIL;
                                final SubLObject token_var_$233 = NIL;
                                while (NIL == done_var_$232) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$233);
                                    final SubLObject valid_$234 = makeBoolean(!token_var_$233.eql(gaf));
                                    if (((NIL != valid_$234) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(gaf), pos))) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg3(gaf), v_int))) {
                                        final SubLObject item_var = assertions_high.gaf_arg4(gaf);
                                        if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                    }
                                    done_var_$232 = makeBoolean(NIL == valid_$234);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$235 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$235, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                denot_pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject meaning_has_senseP(final SubLObject meaning, final SubLObject denot_type, final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denot_preds = determine_denotation_preds(denot_type);
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL == ans) {
                SubLObject csome_list_var = denot_preds;
                SubLObject denot_pred = NIL;
                denot_pred = csome_list_var.first();
                while ((NIL == ans) && (NIL != csome_list_var)) {
                    final SubLObject pred_var = denot_pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, NIL, pred_var);
                        SubLObject done_var = ans;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$236 = ans;
                                    final SubLObject token_var_$237 = NIL;
                                    while (NIL == done_var_$236) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$237);
                                        final SubLObject valid_$238 = makeBoolean(!token_var_$237.eql(gaf));
                                        if ((((NIL != valid_$238) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(gaf), pos))) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg3(gaf), v_int))) && assertions_high.gaf_arg4(gaf).equal(meaning)) {
                                            ans = T;
                                        }
                                        done_var_$236 = makeBoolean((NIL == valid_$238) || (NIL != ans));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$239 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$239, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != ans));
                        } 
                    }
                    csome_list_var = csome_list_var.rest();
                    denot_pred = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject denot_has_senseP(final SubLObject denot, final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return meaning_has_senseP(denot, $DENOT, word_unit, pos, v_int, mt);
    }

    public static SubLObject denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return meanings_of_sense($DENOT, word_unit, pos, v_int, mt);
    }

    public static SubLObject proper_denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return denots_of_sense(word_unit, pos, v_int, mt);
    }

    public static SubLObject related_denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return meanings_of_sense($JUST_RELATED, word_unit, pos, v_int, mt);
    }

    public static SubLObject placeholder_denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return meanings_of_sense($JUST_PLACEHOLDER, word_unit, pos, v_int, mt);
    }

    public static SubLObject denots_of_sense_by_mt(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject denot_type) {
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denot_preds = determine_denotation_preds(denot_type);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = denot_preds;
        SubLObject denot_pred = NIL;
        denot_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject pred_var = denot_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, NIL, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$240 = NIL;
                                final SubLObject token_var_$241 = NIL;
                                while (NIL == done_var_$240) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$241);
                                    final SubLObject valid_$242 = makeBoolean(!token_var_$241.eql(as));
                                    if (((NIL != valid_$242) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(as), pos))) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg3(as), v_int))) {
                                        final SubLObject item_var = cons(assertions_high.gaf_arg4(as), assertions_high.assertion_mt(as));
                                        if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                    }
                                    done_var_$240 = makeBoolean(NIL == valid_$242);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$243 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$243, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot_pred = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject senses_of_wuXpos(final SubLObject word_unit, final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = cons($$subcatFrame, determine_denotation_preds($ANY));
            SubLObject predicate = NIL;
            predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred_var = predicate;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, NIL, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$244 = NIL;
                                final SubLObject token_var_$245 = NIL;
                                while (NIL == done_var_$244) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$245);
                                    final SubLObject valid_$246 = makeBoolean(!token_var_$245.eql(as));
                                    if (((NIL != valid_$246) && ((NIL == mt) || (NIL != genl_lexicon_mtP(mt, assertions_high.assertion_mt(as))))) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(as), pos))) {
                                        final SubLObject item_var = assertions_high.gaf_arg3(as);
                                        if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                    }
                                    done_var_$244 = makeBoolean(NIL == valid_$246);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$247 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$247, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                predicate = cdolist_list_var.first();
            } 
            final SubLObject semtrans_pred = pos_to_semtrans_pred(pos, UNPROVIDED);
            if (NIL != semtrans_pred) {
                final SubLObject pred_var2 = semtrans_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, NIL, pred_var2)) {
                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, NIL, pred_var2);
                    SubLObject done_var2 = NIL;
                    final SubLObject token_var2 = NIL;
                    while (NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                        if (NIL != valid2) {
                            SubLObject final_index_iterator2 = NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                SubLObject done_var_$245 = NIL;
                                final SubLObject token_var_$246 = NIL;
                                while (NIL == done_var_$245) {
                                    final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$246);
                                    final SubLObject valid_$247 = makeBoolean(!token_var_$246.eql(as2));
                                    if ((NIL != valid_$247) && ((NIL == mt) || (NIL != genl_lexicon_mtP(mt, assertions_high.assertion_mt(as2))))) {
                                        final SubLObject item_var2 = assertions_high.gaf_arg2(as2);
                                        if (NIL == member(item_var2, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var2, ans);
                                        }
                                    }
                                    done_var_$245 = makeBoolean(NIL == valid_$247);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$248 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$248, thread);
                                }
                            }
                        }
                        done_var2 = makeBoolean(NIL == valid2);
                    } 
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(ans, $sym239$_, UNPROVIDED);
    }

    public static SubLObject subcat_frame_arity(final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(frame) : "forts.fort_p(frame) " + "CommonSymbols.NIL != forts.fort_p(frame) " + frame;
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.fpred_value(frame, $$subcatFrameArity, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject frames_of_word(final SubLObject word_unit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(word_unit) : "forts.fort_p(word_unit) " + "CommonSymbols.NIL != forts.fort_p(word_unit) " + word_unit;
        SubLObject ans = NIL;
        if (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(word_unit, $$subcatFrame, UNPROVIDED, UNPROVIDED)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = kb_mapping_utilities.pred_values(word_unit, $$subcatFrame, ONE_INTEGER, FOUR_INTEGER, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject frames_of_wordXpos(final SubLObject word_unit, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(word_unit) : "forts.fort_p(word_unit) " + "CommonSymbols.NIL != forts.fort_p(word_unit) " + word_unit;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        SubLObject ans = NIL;
        if (NIL != frames_of_word(word_unit)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = $$subcatFrame;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$252 = NIL;
                                final SubLObject token_var_$253 = NIL;
                                while (NIL == done_var_$252) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$253);
                                    final SubLObject valid_$254 = makeBoolean(!token_var_$253.eql(as));
                                    if ((NIL != valid_$254) && assertions_high.gaf_arg2(as).equal(pos)) {
                                        final SubLObject item_var = assertions_high.gaf_arg4(as);
                                        if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                    }
                                    done_var_$252 = makeBoolean(NIL == valid_$254);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$255 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$255, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                final SubLObject semtrans_pred = pos_to_semtrans_pred(pos, UNPROVIDED);
                if (NIL != semtrans_pred) {
                    final SubLObject pred_var2 = semtrans_pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, ONE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, ONE_INTEGER, pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$253 = NIL;
                                    final SubLObject token_var_$254 = NIL;
                                    while (NIL == done_var_$253) {
                                        final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$254);
                                        final SubLObject valid_$255 = makeBoolean(!token_var_$254.eql(as2));
                                        if (NIL != valid_$255) {
                                            final SubLObject item_var2 = assertions_high.gaf_arg3(as2);
                                            if (NIL == member(item_var2, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                ans = cons(item_var2, ans);
                                            }
                                        }
                                        done_var_$253 = makeBoolean(NIL == valid_$255);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$256 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$256, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject frames_of_word_posXdenot(final SubLObject word_unit, final SubLObject pos, final SubLObject denot) {
        assert NIL != forts.fort_p(word_unit) : "forts.fort_p(word_unit) " + "CommonSymbols.NIL != forts.fort_p(word_unit) " + word_unit;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        SubLObject ans = NIL;
        if (NIL != frames_of_word(word_unit)) {
            SubLObject cdolist_list_var = senses_of_wuXpos(word_unit, pos, UNPROVIDED);
            SubLObject sense = NIL;
            sense = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != denot_has_senseP(denot, word_unit, pos, sense, UNPROVIDED)) {
                    SubLObject cdolist_list_var_$260 = frames_of_sense(word_unit, pos, sense, UNPROVIDED);
                    SubLObject frame = NIL;
                    frame = cdolist_list_var_$260.first();
                    while (NIL != cdolist_list_var_$260) {
                        final SubLObject item_var = frame;
                        if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                            ans = cons(item_var, ans);
                        }
                        cdolist_list_var_$260 = cdolist_list_var_$260.rest();
                        frame = cdolist_list_var_$260.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense = cdolist_list_var.first();
            } 
        }
        return ans;
    }

    public static SubLObject frames_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(word_unit) : "forts.fort_p(word_unit) " + "CommonSymbols.NIL != forts.fort_p(word_unit) " + word_unit;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = $$subcatFrame;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$261 = NIL;
                            final SubLObject token_var_$262 = NIL;
                            while (NIL == done_var_$261) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$262);
                                final SubLObject valid_$263 = makeBoolean(!token_var_$262.eql(as));
                                if (((NIL != valid_$263) && assertions_high.gaf_arg2(as).equal(pos)) && assertions_high.gaf_arg3(as).equal(v_int)) {
                                    final SubLObject item_var = assertions_high.gaf_arg4(as);
                                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                                done_var_$261 = makeBoolean(NIL == valid_$263);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$264 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$264, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject frames_of_sense_by_mt(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = $$subcatFrame;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$265 = NIL;
                            final SubLObject token_var_$266 = NIL;
                            while (NIL == done_var_$265) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$266);
                                final SubLObject valid_$267 = makeBoolean(!token_var_$266.eql(as));
                                if (((NIL != valid_$267) && assertions_high.gaf_arg2(as).equal(pos)) && assertions_high.gaf_arg3(as).equal(v_int)) {
                                    final SubLObject item_var = cons(assertions_high.gaf_arg4(as), assertions_high.assertion_mt(as));
                                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                                done_var_$265 = makeBoolean(NIL == valid_$267);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$268 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$268, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject politeness_of_ws_pred() {
        return $$politenessOfWS;
    }

    public static SubLObject formality_of_ws_pred() {
        return $$formalityOfWS;
    }

    public static SubLObject politeness_levels_of_assertion(final SubLObject assertion, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        return NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion) ? backward.removal_ask_variable($sym244$_LEVEL, listS(politeness_of_ws_pred(), assertion, $list245), mt, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject formality_levels_of_assertion(final SubLObject assertion, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        return NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion) ? backward.removal_ask_variable($sym244$_LEVEL, listS(formality_of_ws_pred(), assertion, $list245), mt, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject potentially_offensive_politeness_levelP(final SubLObject level) {
        return subl_promotions.memberP(level, $list246, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject includes_potentially_offensive_politeness_levelP(final SubLObject politeness_levels) {
        return list_utilities.sublisp_boolean(find_if($sym247$POTENTIALLY_OFFENSIVE_POLITENESS_LEVEL_, politeness_levels, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject potentially_offensive_lexical_assertionP(final SubLObject assertion) {
        final SubLObject politeness_levels = politeness_levels_of_assertion(assertion, UNPROVIDED);
        return includes_potentially_offensive_politeness_levelP(politeness_levels);
    }

    public static SubLObject slang_lexical_assertionP(final SubLObject assertion) {
        return subl_promotions.memberP($$SlangSpeech, formality_levels_of_assertion(assertion, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject archaic_lexical_assertionP(final SubLObject assertion) {
        return subl_promotions.memberP($$ArchaicSpeech, formality_levels_of_assertion(assertion, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_indirect_lexical_assertionP() {
        final SubLObject cs = $indirect_lexical_assertionP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_indirect_lexical_assertionP(final SubLObject assertion) {
        return memoization_state.caching_state_remove_function_results_with_args($indirect_lexical_assertionP_caching_state$.getGlobalValue(), list(assertion), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject indirect_lexical_assertionP_internal(final SubLObject assertion) {
        return isa.isaP(cycl_utilities.formula_arg0(assertion), $const251$DenotationPredicate_ExcludedFromN, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject indirect_lexical_assertionP(final SubLObject assertion) {
        SubLObject caching_state = $indirect_lexical_assertionP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym250$INDIRECT_LEXICAL_ASSERTION_, $sym252$_INDIRECT_LEXICAL_ASSERTION__CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym253$CLEAR_INDIRECT_LEXICAL_ASSERTION_);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(indirect_lexical_assertionP_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject inappropriate_lexical_assertionP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != lexicon_vars.$exclude_vulgaritiesP$.getDynamicValue(thread)) && (NIL != potentially_offensive_lexical_assertionP(assertion))) {
            return T;
        }
        if ((NIL != lexicon_vars.$exclude_slangP$.getDynamicValue(thread)) && (NIL != slang_lexical_assertionP(assertion))) {
            return T;
        }
        if ((NIL != lexicon_vars.$exclude_archaic_speechP$.getDynamicValue(thread)) && (NIL != archaic_lexical_assertionP(assertion))) {
            return T;
        }
        if ((NIL != lexicon_vars.$exclude_indirect_relationsP$.getDynamicValue(thread)) && (NIL != indirect_lexical_assertionP(assertion))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject gather_denotation_assertions(final SubLObject word, final SubLObject speech_part, final SubLObject sense_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = determine_denotation_preds($ANY);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$269 = kb_mapping.gather_gaf_arg_index(word, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
                SubLObject assertion = NIL;
                assertion = cdolist_list_var_$269.first();
                while (NIL != cdolist_list_var_$269) {
                    if (((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != kb_utilities.kbeq(assertion_pos(assertion), speech_part))) && (NIL != kb_utilities.kbeq(assertion_sense_num(assertion), sense_num))) {
                        denot_assertions = cons(assertion, denot_assertions);
                    }
                    cdolist_list_var_$269 = cdolist_list_var_$269.rest();
                    assertion = cdolist_list_var_$269.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return denot_assertions;
    }

    public static SubLObject potentially_offensive_senseP(final SubLObject word, final SubLObject speech_part, final SubLObject sense) {
        assert NIL != forts.fort_p(word) : "forts.fort_p(word) " + "CommonSymbols.NIL != forts.fort_p(word) " + word;
        assert NIL != speech_partP(speech_part, UNPROVIDED) : "lexicon_accessors.speech_partP(speech_part, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(speech_part, CommonSymbols.UNPROVIDED) " + speech_part;
        assert NIL != integerp(sense) : "Types.integerp(sense) " + "CommonSymbols.NIL != Types.integerp(sense) " + sense;
        SubLObject offensiveP = NIL;
        if (NIL == offensiveP) {
            SubLObject csome_list_var;
            SubLObject assertion;
            for (csome_list_var = gather_denotation_assertions(word, speech_part, sense), assertion = NIL, assertion = csome_list_var.first(); (NIL == offensiveP) && (NIL != csome_list_var); offensiveP = potentially_offensive_lexical_assertionP(assertion) , csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
            }
        }
        return offensiveP;
    }

    public static SubLObject inappropriate_senseP(final SubLObject word, final SubLObject speech_part, final SubLObject sense) {
        assert NIL != forts.fort_p(word) : "forts.fort_p(word) " + "CommonSymbols.NIL != forts.fort_p(word) " + word;
        assert NIL != speech_partP(speech_part, UNPROVIDED) : "lexicon_accessors.speech_partP(speech_part, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(speech_part, CommonSymbols.UNPROVIDED) " + speech_part;
        assert NIL != integerp(sense) : "Types.integerp(sense) " + "CommonSymbols.NIL != Types.integerp(sense) " + sense;
        if (NIL == lexicon_vars.lexicon_filters()) {
            return NIL;
        }
        SubLObject inappropriateP = NIL;
        if (NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject assertion;
            for (csome_list_var = gather_denotation_assertions(word, speech_part, sense), assertion = NIL, assertion = csome_list_var.first(); (NIL == inappropriateP) && (NIL != csome_list_var); inappropriateP = inappropriate_lexical_assertionP(assertion) , csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
            }
        }
        return inappropriateP;
    }

    public static SubLObject semtrans_of_ws(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int) {
        assert NIL != forts.fort_p(word_unit) : "forts.fort_p(word_unit) " + "CommonSymbols.NIL != forts.fort_p(word_unit) " + word_unit;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        assert NIL != integerp(v_int) : "Types.integerp(v_int) " + "CommonSymbols.NIL != Types.integerp(v_int) " + v_int;
        return semtrans_lookup_int(word_unit, pos, v_int, UNPROVIDED);
    }

    public static SubLObject semtrans_of_wuXpos(final SubLObject word_unit, final SubLObject pos, SubLObject frame) {
        if (frame == UNPROVIDED) {
            frame = NIL;
        }
        assert NIL != forts.fort_p(word_unit) : "forts.fort_p(word_unit) " + "CommonSymbols.NIL != forts.fort_p(word_unit) " + word_unit;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        return semtrans_lookup_int(word_unit, pos, NIL, frame);
    }

    public static SubLObject semtrans_lookup_int(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject frame) {
        if (frame == UNPROVIDED) {
            frame = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = pos_to_semtrans_pred(pos, UNPROVIDED);
        SubLObject ans = NIL;
        if (NIL != pred) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, NIL, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$270 = NIL;
                                final SubLObject token_var_$271 = NIL;
                                while (NIL == done_var_$270) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$271);
                                    final SubLObject valid_$272 = makeBoolean(!token_var_$271.eql(as));
                                    if (NIL != valid_$272) {
                                        final SubLObject as_sense = assertions_high.gaf_arg2(as);
                                        final SubLObject as_frame = assertions_high.gaf_arg3(as);
                                        if (((((NIL == v_int) || (NIL != kb_utilities.kbeq(as_sense, v_int))) && ((NIL == frame) || (NIL != kb_utilities.kbeq(as_frame, frame)))) && (NIL == inappropriate_lexical_assertionP(as))) && (NIL == inappropriate_senseP(word_unit, pos, as_sense))) {
                                            final SubLObject semtransarg = lexicon_utilities.semtrans_arg_of_pred_cached(pred);
                                            final SubLObject template = semtrans_template_from_assertion(as, semtransarg);
                                            final SubLObject item_var = narts_high.nart_substitute(template);
                                            if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                ans = cons(item_var, ans);
                                            }
                                        }
                                    }
                                    done_var_$270 = makeBoolean(NIL == valid_$272);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$273 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$273, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject semtrans_template_from_assertion(final SubLObject as, SubLObject semtrans_arg) {
        if (semtrans_arg == UNPROVIDED) {
            semtrans_arg = NIL;
        }
        assert NIL != assertions_high.gaf_assertionP(as) : "assertions_high.gaf_assertionP(as) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(as) " + as;
        if (NIL == semtrans_arg) {
            final SubLObject pred = assertions_high.gaf_arg0(as);
            semtrans_arg = lexicon_utilities.semtrans_arg_of_pred_cached(pred);
        }
        final SubLObject raw_template = assertions_high.gaf_arg(as, semtrans_arg);
        return NIL != el_formula_with_operator_p(raw_template, $$Quote) ? cycl_utilities.formula_arg1(raw_template, UNPROVIDED) : raw_template;
    }

    public static SubLObject semtrans_sentence_infer(final SubLObject word_unit, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject templates = NIL;
        final SubLObject semtrans_pred = pos_to_semtrans_pred(pos, UNPROVIDED);
        if ((NIL != indexed_term_p(semtrans_pred)) && (NIL == semtrans_assertion_lookup(word_unit, pos, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject denots = denots_of_word(word_unit, pos);
            final SubLObject senses = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject denot = NIL;
            SubLObject denot_$274 = NIL;
            SubLObject sense = NIL;
            SubLObject sense_$275 = NIL;
            denot = denots;
            denot_$274 = denot.first();
            sense = senses;
            sense_$275 = sense.first();
            while ((NIL != sense) || (NIL != denot)) {
                SubLObject cdolist_list_var = frames_of_sense(word_unit, pos, sense_$275, UNPROVIDED);
                SubLObject frame = NIL;
                frame = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$276 = psp_semantics.psp_devise_word_templates(word_unit, pos, list(denot_$274), list(frame));
                    SubLObject template = NIL;
                    template = cdolist_list_var_$276.first();
                    while (NIL != cdolist_list_var_$276) {
                        final SubLObject args = list(word_unit, sense_$275, frame, template);
                        final SubLObject item_var;
                        final SubLObject semtrans_sentence = item_var = make_el_formula(semtrans_pred, args, UNPROVIDED);
                        if (NIL == member(item_var, templates, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            templates = cons(item_var, templates);
                        }
                        cdolist_list_var_$276 = cdolist_list_var_$276.rest();
                        template = cdolist_list_var_$276.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    frame = cdolist_list_var.first();
                } 
                denot = denot.rest();
                denot_$274 = denot.first();
                sense = sense.rest();
                sense_$275 = sense.first();
            } 
        }
        return templates;
    }

    public static SubLObject denots_of_word(final SubLObject word_unit, SubLObject pos) {
        if (pos == UNPROVIDED) {
            pos = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = $$denotation;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, NIL, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$277 = NIL;
                            final SubLObject token_var_$278 = NIL;
                            while (NIL == done_var_$277) {
                                final SubLObject denot_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$278);
                                final SubLObject valid_$279 = makeBoolean(!token_var_$278.eql(denot_as));
                                if ((NIL != valid_$279) && ((NIL == pos) || (NIL != genl_posP(assertions_high.gaf_arg2(denot_as), pos, UNPROVIDED)))) {
                                    final SubLObject item_var = cons(assertions_high.gaf_arg4(denot_as), assertions_high.gaf_arg3(denot_as));
                                    if (NIL == member(item_var, denots, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        denots = cons(item_var, denots);
                                    }
                                }
                                done_var_$277 = makeBoolean(NIL == valid_$279);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$280 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$280, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(Mapping.mapcar(symbol_function(CAR), denots), Mapping.mapcar(symbol_function(CDR), denots));
    }

    public static SubLObject semtrans_assertion_lookup(final SubLObject word_unit, final SubLObject pos, SubLObject v_int) {
        if (v_int == UNPROVIDED) {
            v_int = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != lexical_wordP(word_unit) : "lexicon_accessors.lexical_wordP(word_unit) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word_unit) " + word_unit;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        final SubLObject pred = pos_to_semtrans_pred(pos, UNPROVIDED);
        SubLObject ans = NIL;
        if ((NIL != pred) && (NIL != indexed_term_p(word_unit))) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, NIL, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$281 = NIL;
                                final SubLObject token_var_$282 = NIL;
                                while (NIL == done_var_$281) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$282);
                                    final SubLObject valid_$283 = makeBoolean(!token_var_$282.eql(as));
                                    if (NIL != valid_$283) {
                                        final SubLObject as_sense = assertions_high.gaf_arg2(as);
                                        if ((((NIL == v_int) || (NIL != kb_utilities.kbeq(as_sense, v_int))) && (NIL == inappropriate_lexical_assertionP(as))) && (NIL == inappropriate_senseP(word_unit, pos, as_sense))) {
                                            final SubLObject item_var = as;
                                            if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                ans = cons(item_var, ans);
                                            }
                                        }
                                    }
                                    done_var_$281 = makeBoolean(NIL == valid_$283);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$284 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$284, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject all_semtrans_assertions(final SubLObject word_unit, final SubLObject pos, SubLObject v_int) {
        if (v_int == UNPROVIDED) {
            v_int = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(word_unit) : "forts.fort_p(word_unit) " + "CommonSymbols.NIL != forts.fort_p(word_unit) " + word_unit;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
        try {
            lexicon_vars.$exclude_vulgaritiesP$.bind(NIL, thread);
            lexicon_vars.$exclude_slangP$.bind(NIL, thread);
            assertions = semtrans_assertion_lookup(word_unit, pos, v_int);
        } finally {
            lexicon_vars.$exclude_slangP$.rebind(_prev_bind_2, thread);
            lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    public static SubLObject preposition_of_frame(final SubLObject prep_frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = ((NIL != isa.isaP(prep_frame, $$TransitivePPFrameType, UNPROVIDED, UNPROVIDED)) || (NIL != isa.isaP(prep_frame, $$DitransitivePPFrameType, UNPROVIDED, UNPROVIDED))) ? lexicon_cache.words_of_string(string_utilities.string_after(constants_high.constant_name(prep_frame), CHAR_hyphen), UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject assertion_denotation(final SubLObject as) {
        final SubLObject pred = assertions_high.gaf_arg0(as);
        final SubLObject denot_arg = lexicon_utilities.denotatum_arg_of_pred_cached(pred);
        return NIL != denot_arg ? assertions_high.gaf_arg(as, denot_arg) : NIL;
    }

    public static SubLObject assertion_pos(final SubLObject as) {
        final SubLObject pred = assertions_high.gaf_arg0(as);
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(pred);
        return NIL != pos_arg ? assertions_high.gaf_arg(as, pos_arg) : NIL;
    }

    public static SubLObject assertion_sense_num(final SubLObject assertion) {
        final SubLObject pred = assertions_high.gaf_arg0(assertion);
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(pred);
        final SubLObject sense_arg = (NIL != pos_arg) ? number_utilities.f_1X(pos_arg) : NIL;
        final SubLObject sense_num = (NIL != sense_arg) ? assertions_high.gaf_arg(assertion, sense_arg) : NIL;
        return sense_num.isInteger() ? sense_num : NIL;
    }

    public static SubLObject clear_agr_of_det_string() {
        final SubLObject cs = $agr_of_det_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_agr_of_det_string(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args($agr_of_det_string_caching_state$.getGlobalValue(), list(string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject agr_of_det_string_internal(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (string.equal($str200$)) {
            return $list262;
        }
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$285 = agreement_lookup(word);
            SubLObject pos_pred = NIL;
            pos_pred = cdolist_list_var_$285.first();
            while (NIL != cdolist_list_var_$285) {
                ans = cons(pos_pred, ans);
                cdolist_list_var_$285 = cdolist_list_var_$285.rest();
                pos_pred = cdolist_list_var_$285.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject nearest_common_genl_preds = speech_part_pred_min_ceilings(ans, UNPROVIDED);
            ans = (NIL != nearest_common_genl_preds) ? nearest_common_genl_preds : ans;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject agr_of_det_string(final SubLObject string) {
        SubLObject caching_state = $agr_of_det_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(AGR_OF_DET_STRING, $agr_of_det_string_caching_state$, $int$64, EQUALP, ONE_INTEGER, SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(agr_of_det_string_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject agreement_lookup(final SubLObject word_unit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != indexed_term_p(word_unit)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = kb_mapping_utilities.pred_values(word_unit, $$determinerAgreement, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }

    public static SubLObject denot_ws_lookup(final SubLObject word_unit, final SubLObject speech_part, SubLObject denot_type) {
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denot_preds = determine_denotation_preds(denot_type);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = denot_preds;
        SubLObject denot_pred = NIL;
        denot_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = denot_pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, NIL, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$286 = NIL;
                                final SubLObject token_var_$287 = NIL;
                                while (NIL == done_var_$286) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$287);
                                    final SubLObject valid_$288 = makeBoolean(!token_var_$287.eql(ass));
                                    if ((NIL != valid_$288) && (NIL != kb_utilities.kbeq(speech_part, assertions_high.gaf_arg2(ass)))) {
                                        final SubLObject item_var = assertions_high.gaf_arg3(ass);
                                        if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                    }
                                    done_var_$286 = makeBoolean(NIL == valid_$288);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$289 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$289, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot_pred = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject pos_to_semtrans_pred(final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (NIL == speech_partP(pos, UNPROVIDED)) {
            return NIL;
        }
        return pos_to_semtrans_pred_cached(pos, mt);
    }

    public static SubLObject clear_pos_to_semtrans_pred_cached() {
        final SubLObject cs = $pos_to_semtrans_pred_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pos_to_semtrans_pred_cached(final SubLObject pos, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($pos_to_semtrans_pred_cached_caching_state$.getGlobalValue(), list(pos, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pos_to_semtrans_pred_cached_internal(final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.fpred_value(pos, $$semTransPredForPOS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == ans) {
                SubLObject csome_list_var;
                SubLObject genl_pos;
                for (csome_list_var = kb_mapping_utilities.pred_values(pos, $$genls, UNPROVIDED, UNPROVIDED, UNPROVIDED), genl_pos = NIL, genl_pos = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = pos_to_semtrans_pred(genl_pos, mt) , csome_list_var = csome_list_var.rest() , genl_pos = csome_list_var.first()) {
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pos_to_semtrans_pred_cached(final SubLObject pos, final SubLObject mt) {
        SubLObject caching_state = $pos_to_semtrans_pred_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(POS_TO_SEMTRANS_PRED_CACHED, $pos_to_semtrans_pred_cached_caching_state$, $int$64, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_POS_TO_SEMTRANS_PRED_CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pos, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pos.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pos_to_semtrans_pred_cached_internal(pos, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pos, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_semtrans_pred_to_pos() {
        final SubLObject cs = $semtrans_pred_to_pos_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_semtrans_pred_to_pos(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($semtrans_pred_to_pos_caching_state$.getGlobalValue(), list(pred, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject semtrans_pred_to_pos_internal(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = Sort.sort(kb_mapping_utilities.pred_values(pred, $$semTransPredForPOS, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), symbol_function($sym100$SPEC_), UNPROVIDED).first();
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject semtrans_pred_to_pos(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $semtrans_pred_to_pos_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SEMTRANS_PRED_TO_POS, $semtrans_pred_to_pos_caching_state$, $int$128, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(semtrans_pred_to_pos_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject nicknames_of_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.pred_values(name, $$commonNickname, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject spellings_of_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.pred_values(name, $$nameSpelling, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject argn_is_speech_partP(final SubLObject reln, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = subl_promotions.memberP($$SpeechPart, kb_accessors.argn_isa(reln, n, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject speech_parts_initializedP() {
        return makeBoolean((NIL != dictionary.dictionary_p($speech_parts$.getGlobalValue())) && (NIL == dictionary.dictionary_empty_p($speech_parts$.getGlobalValue())));
    }

    public static SubLObject clear_speech_parts() {
        if (NIL == dictionary.dictionary_p($speech_parts$.getGlobalValue())) {
            $speech_parts$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), $int$256));
        }
        clear_cached_lexical_access_functions();
        return dictionary.clear_dictionary($speech_parts$.getGlobalValue());
    }

    public static SubLObject initialize_speech_parts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_speech_parts();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != valid_constantP($$SpeechPart, UNPROVIDED)) {
                SubLObject node_var = $$SpeechPart;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$290 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$291 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$292 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$292 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$293 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$SpeechPart, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$293 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$294 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$297 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject sp_type = node_var;
                                            final SubLObject pred_var = $$isa;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sp_type, TWO_INTEGER, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sp_type, TWO_INTEGER, pred_var);
                                                SubLObject done_var = NIL;
                                                final SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            SubLObject done_var_$298 = NIL;
                                                            final SubLObject token_var_$299 = NIL;
                                                            while (NIL == done_var_$298) {
                                                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$299);
                                                                final SubLObject valid_$300 = makeBoolean(!token_var_$299.eql(as));
                                                                if (NIL != valid_$300) {
                                                                    final SubLObject sp = assertions_high.gaf_arg1(as);
                                                                    final SubLObject mt = assertions_high.assertion_mt(as);
                                                                    dictionary_utilities.dictionary_push($speech_parts$.getGlobalValue(), sp, mt);
                                                                }
                                                                done_var_$298 = makeBoolean(NIL == valid_$300);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$294 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$294, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                } 
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$295 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$295 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$296 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            SubLObject iteration_state_$305;
                                                                            for (iteration_state_$305 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$305); iteration_state_$305 = dictionary_contents.do_dictionary_contents_next(iteration_state_$305)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$305);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$297 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$297, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$305);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$296, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str58$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$307;
                                                            final SubLObject new_list = cdolist_list_var_$307 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$307.first();
                                                            while (NIL != cdolist_list_var_$307) {
                                                                final SubLObject _prev_bind_0_$298 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$298, thread);
                                                                }
                                                                cdolist_list_var_$307 = cdolist_list_var_$307.rest();
                                                                generating_fn = cdolist_list_var_$307.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$295, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$295, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$297, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$294, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$293, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str59$Node__a_does_not_pass_sbhl_type_t, $$SpeechPart, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$293, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$292, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$292, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$291, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$299 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$299, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$290, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $speech_parts$.getGlobalValue();
    }

    public static SubLObject speech_partP(final SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        ensure_speech_parts_initialized();
        final SubLObject mts = dictionary.dictionary_lookup_without_values($speech_parts$.getGlobalValue(), obj, UNPROVIDED);
        SubLObject mt_okP = kb_utilities.kbeq(mt, $$InferencePSC);
        if (NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = mts, ok_mt = NIL, ok_mt = csome_list_var.first(); (NIL == mt_okP) && (NIL != csome_list_var); mt_okP = genl_lexicon_mtP(mt, ok_mt) , csome_list_var = csome_list_var.rest() , ok_mt = csome_list_var.first()) {
            }
        }
        return makeBoolean((NIL != mts) && (NIL != mt_okP));
    }

    public static SubLObject ensure_speech_parts_initialized() {
        if (NIL == speech_parts_initializedP()) {
            initialize_speech_parts();
        }
        return $INITIALIZED;
    }

    public static SubLObject all_speech_parts(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        ensure_speech_parts_initialized();
        if (NIL != kb_utilities.kbeq(mt, $$InferencePSC)) {
            return dictionary.dictionary_keys($speech_parts$.getGlobalValue());
        }
        SubLObject ans = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($speech_parts$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sp = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject sp_mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject mt_okP = NIL;
            if (NIL == mt_okP) {
                SubLObject csome_list_var;
                SubLObject sp_mt;
                for (csome_list_var = sp_mts, sp_mt = NIL, sp_mt = csome_list_var.first(); (NIL == mt_okP) && (NIL != csome_list_var); mt_okP = genl_lexicon_mtP(mt, sp_mt) , csome_list_var = csome_list_var.rest() , sp_mt = csome_list_var.first()) {
                }
            }
            if (NIL != mt_okP) {
                ans = cons(sp, ans);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return ans;
    }

    public static SubLObject clear_genl_posP() {
        final SubLObject cs = $genl_posP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_genl_posP(final SubLObject spec_pos, final SubLObject genl_pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($genl_posP_caching_state$.getGlobalValue(), list(spec_pos, genl_pos, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject genl_posP_internal(final SubLObject spec_pos, final SubLObject genl_pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != mt) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                result = genls.genl_ofP(genl_pos, spec_pos, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                result = genls.genl_ofP(genl_pos, spec_pos, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
            }
        }
        return result;
    }

    public static SubLObject genl_posP(final SubLObject spec_pos, final SubLObject genl_pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject caching_state = $genl_posP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym275$GENL_POS_, $sym276$_GENL_POS__CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(spec_pos, genl_pos, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (spec_pos.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl_pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(genl_posP_internal(spec_pos, genl_pos, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(spec_pos, genl_pos, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject genl_pos_memberP(final SubLObject spec_pos, final SubLObject pos_list) {
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = pos_list;
            SubLObject pos = NIL;
            pos = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != genl_posP(spec_pos, pos, UNPROVIDED)) {
                    doneP = T;
                }
                csome_list_var = csome_list_var.rest();
                pos = csome_list_var.first();
            } 
        }
        return doneP;
    }

    public static SubLObject spec_posP(final SubLObject pos1, final SubLObject pos2) {
        return genl_posP(pos2, pos1, UNPROVIDED);
    }

    public static SubLObject adjpP(final SubLObject pos) {
        return equalp(safe_nart_hl_formula(pos), $list278);
    }

    public static SubLObject vbarP(final SubLObject pos) {
        return object_is_compositional_pos_termP(pos, $$PhraseFn_Bar1, $$Verb);
    }

    public static SubLObject nbarP(final SubLObject pos) {
        return object_is_compositional_pos_termP(pos, $$PhraseFn_Bar1, $$Noun);
    }

    public static SubLObject object_is_compositional_pos_termP(final SubLObject v_object, final SubLObject phrase_fn, final SubLObject genl_pos) {
        if (NIL != narts_high.naut_p(v_object)) {
            return makeBoolean((NIL != kb_utilities.kbeq(cycl_utilities.nat_functor(v_object), phrase_fn)) && (NIL != genl_posP(cycl_utilities.nat_arg1(v_object, UNPROVIDED), genl_pos, UNPROVIDED)));
        }
        if (NIL != forts.fort_p(v_object)) {
            final SubLObject nart = compositional_pos_nart(phrase_fn, genl_pos);
            return makeBoolean((NIL != nart) && (NIL != genl_posP(v_object, nart, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject clear_compositional_pos_nart() {
        final SubLObject cs = $compositional_pos_nart_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_compositional_pos_nart(final SubLObject phrase_fn, final SubLObject genl_pos) {
        return memoization_state.caching_state_remove_function_results_with_args($compositional_pos_nart_caching_state$.getGlobalValue(), list(phrase_fn, genl_pos), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject compositional_pos_nart_internal(final SubLObject phrase_fn, final SubLObject genl_pos) {
        return narts_high.find_nart(make_unary_formula(phrase_fn, genl_pos));
    }

    public static SubLObject compositional_pos_nart(final SubLObject phrase_fn, final SubLObject genl_pos) {
        SubLObject caching_state = $compositional_pos_nart_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(COMPOSITIONAL_POS_NART, $compositional_pos_nart_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(phrase_fn, genl_pos);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (phrase_fn.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && genl_pos.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(compositional_pos_nart_internal(phrase_fn, genl_pos)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(phrase_fn, genl_pos));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject npP(final SubLObject pos) {
        return subl_promotions.memberP(safe_nart_hl_formula(pos), $list282, symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject ppP(final SubLObject pos) {
        return subl_promotions.memberP(safe_nart_hl_formula(pos), $list283, symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject safe_nart_hl_formula(final SubLObject obj) {
        return NIL != nart_handles.nart_p(obj) ? narts_high.nart_hl_formula(obj) : obj;
    }

    public static SubLObject relational_noun_denots(final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pos, SubLObject possessor, SubLObject pred, SubLObject lexical_mt, SubLObject domain_mt) {
        if (possessor == UNPROVIDED) {
            possessor = $UNDETERMINED;
        }
        if (pred == UNPROVIDED) {
            pred = $ANY;
        }
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        assert NIL != listp(leading_strings) : "Types.listp(leading_strings) " + "CommonSymbols.NIL != Types.listp(leading_strings) " + leading_strings;
        assert NIL != forts.fort_p(wu) : "forts.fort_p(wu) " + "CommonSymbols.NIL != forts.fort_p(wu) " + wu;
        assert NIL != listp(following_strings) : "Types.listp(following_strings) " + "CommonSymbols.NIL != Types.listp(following_strings) " + following_strings;
        assert NIL != speech_partP(pos, UNPROVIDED) : "lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_partP(pos, CommonSymbols.UNPROVIDED) " + pos;
        final SubLObject preds = (pred == $ANY) ? relational_noun_preds(leading_strings, wu, following_strings, pos, lexical_mt) : list(pred);
        SubLObject denots = NIL;
        if (NIL != genl_posP(pos, $$Noun, UNPROVIDED)) {
            SubLObject cdolist_list_var = preds;
            SubLObject denoted_pred = NIL;
            denoted_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != kb_accessors.binary_predicateP(denoted_pred)) {
                    SubLObject cdolist_list_var_$310;
                    final SubLObject possessed_argnums = cdolist_list_var_$310 = relational_noun_possessed_argnums(leading_strings, wu, following_strings, pos, denoted_pred, lexical_mt);
                    SubLObject possessed_argnum = NIL;
                    possessed_argnum = cdolist_list_var_$310.first();
                    while (NIL != cdolist_list_var_$310) {
                        SubLObject template = NIL;
                        final SubLObject possessed_type = relational_noun_possessed_type(denoted_pred, possessed_argnum, domain_mt);
                        final SubLObject possessor_argnum = subtract(THREE_INTEGER, possessed_argnum);
                        final SubLObject possessor_type = (possessor == $UNDETERMINED) ? relational_noun_possessor_type(denoted_pred, possessor_argnum, domain_mt) : NIL;
                        if (NIL != possessed_type) {
                            if (possessor != $UNDETERMINED) {
                                template = relational_noun_denot_template_lookup(NIL, possessed_argnum);
                            } else
                                if (NIL != possessor_type) {
                                    template = relational_noun_denot_template_lookup(T, possessed_argnum);
                                }

                        }
                        if (NIL != template) {
                            final SubLObject swap_alist = list(bq_cons($POSSESSED_TYPE, possessed_type), bq_cons($DENOTED_PRED, denoted_pred), bq_cons($POSSESSOR, possessor), bq_cons($POSSESSOR_TYPE, possessor_type));
                            final SubLObject result = cycl_utilities.expression_sublis(swap_alist, template, UNPROVIDED, UNPROVIDED);
                            denots = cons(result, denots);
                        }
                        cdolist_list_var_$310 = cdolist_list_var_$310.rest();
                        possessed_argnum = cdolist_list_var_$310.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                denoted_pred = cdolist_list_var.first();
            } 
            return denots;
        }
        return NIL;
    }

    public static SubLObject relational_noun_denot_template_lookup(final SubLObject type_levelP, final SubLObject possessed_argnum) {
        return list_utilities.alist_lookup(list_utilities.alist_lookup($relational_noun_denot_templates$.getGlobalValue(), type_levelP, UNPROVIDED, UNPROVIDED), possessed_argnum, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject relational_noun_possessed_argnums(final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pos, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != leading_strings) && (NIL != following_strings)) {
                final SubLObject dair_pred = $$headMedialStringDenotesArgInReln;
                if (kb_indexing.num_gaf_arg_index(wu, TWO_INTEGER, dair_pred, UNPROVIDED).isPositive()) {
                    final SubLObject pred_var = dair_pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, FIVE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, FIVE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$311 = NIL;
                                    final SubLObject token_var_$312 = NIL;
                                    while (NIL == done_var_$311) {
                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$312);
                                        final SubLObject valid_$313 = makeBoolean(!token_var_$312.eql(as));
                                        if (NIL != valid_$313) {
                                            thread.resetMultipleValues();
                                            final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula(assertions_high.gaf_formula(as), UNPROVIDED);
                                            final SubLObject as_wu = thread.secondMultipleValue();
                                            final SubLObject as_following_strings = thread.thirdMultipleValue();
                                            final SubLObject as_pos = thread.fourthMultipleValue();
                                            thread.resetMultipleValues();
                                            if (((as_pos.eql(pos) && as_wu.eql(wu)) && as_leading_strings.equal(leading_strings)) && as_following_strings.equal(following_strings)) {
                                                ans = cons(assertions_high.gaf_arg(as, SIX_INTEGER), ans);
                                            }
                                        }
                                        done_var_$311 = makeBoolean(NIL == valid_$313);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$314 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$314, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != leading_strings) {
                    final SubLObject dair_pred = $$multiWordStringDenotesArgInReln;
                    if (kb_indexing.num_gaf_arg_index(wu, TWO_INTEGER, dair_pred, UNPROVIDED).isPositive()) {
                        final SubLObject pred_var = dair_pred;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, FOUR_INTEGER, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, FOUR_INTEGER, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$312 = NIL;
                                        final SubLObject token_var_$313 = NIL;
                                        while (NIL == done_var_$312) {
                                            final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$313);
                                            final SubLObject valid_$314 = makeBoolean(!token_var_$313.eql(as));
                                            if (NIL != valid_$314) {
                                                thread.resetMultipleValues();
                                                final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula(assertions_high.gaf_formula(as), UNPROVIDED);
                                                final SubLObject as_wu = thread.secondMultipleValue();
                                                final SubLObject as_following_strings = thread.thirdMultipleValue();
                                                final SubLObject as_pos = thread.fourthMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((as_pos.eql(pos) && as_wu.eql(wu)) && as_leading_strings.equal(leading_strings)) {
                                                    ans = cons(assertions_high.gaf_arg5(as), ans);
                                                }
                                            }
                                            done_var_$312 = makeBoolean(NIL == valid_$314);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$315 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$315, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    }
                } else
                    if (NIL != following_strings) {
                        final SubLObject dair_pred = $$compoundStringDenotesArgInReln;
                        if (kb_indexing.num_gaf_arg_index(wu, ONE_INTEGER, dair_pred, UNPROVIDED).isPositive()) {
                            final SubLObject pred_var = dair_pred;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, FOUR_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, FOUR_INTEGER, pred_var);
                                SubLObject done_var = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$313 = NIL;
                                            final SubLObject token_var_$314 = NIL;
                                            while (NIL == done_var_$313) {
                                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$314);
                                                final SubLObject valid_$315 = makeBoolean(!token_var_$314.eql(as));
                                                if (NIL != valid_$315) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula(assertions_high.gaf_formula(as), UNPROVIDED);
                                                    final SubLObject as_wu = thread.secondMultipleValue();
                                                    final SubLObject as_following_strings = thread.thirdMultipleValue();
                                                    final SubLObject as_pos = thread.fourthMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if ((as_pos.eql(pos) && as_wu.eql(wu)) && as_following_strings.equal(following_strings)) {
                                                        ans = cons(assertions_high.gaf_arg5(as), ans);
                                                    }
                                                }
                                                done_var_$313 = makeBoolean(NIL == valid_$315);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$316 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values3 = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values3);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$316, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                } 
                            }
                        }
                    } else {
                        final SubLObject dair_pred = $$denotesArgInReln;
                        if (kb_indexing.num_gaf_arg_index(wu, ONE_INTEGER, dair_pred, UNPROVIDED).isPositive()) {
                            final SubLObject pred_var = dair_pred;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, NIL, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, NIL, pred_var);
                                SubLObject done_var = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$314 = NIL;
                                            final SubLObject token_var_$315 = NIL;
                                            while (NIL == done_var_$314) {
                                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$315);
                                                final SubLObject valid_$316 = makeBoolean(!token_var_$315.eql(as));
                                                if (NIL != valid_$316) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula(assertions_high.gaf_formula(as), UNPROVIDED);
                                                    final SubLObject as_wu = thread.secondMultipleValue();
                                                    final SubLObject as_following_strings = thread.thirdMultipleValue();
                                                    final SubLObject as_pos = thread.fourthMultipleValue();
                                                    final SubLObject as_denot = thread.fifthMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if ((as_pos.eql(pos) && as_denot.equal(pred)) && as_wu.eql(wu)) {
                                                        ans = cons(assertions_high.gaf_arg4(as), ans);
                                                    }
                                                }
                                                done_var_$314 = makeBoolean(NIL == valid_$316);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$317 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values4 = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values4);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$317, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                } 
                            }
                        }
                    }


        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (((NIL != list_utilities.non_empty_list_p(ans)) && (NIL != forts.fort_p(pred))) && (NIL != fort_types_interface.symmetric_binary_predicate_p(pred))) {
            ans = $list294;
        }
        return ans;
    }

    public static SubLObject relational_noun_preds(final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if ((NIL != leading_strings) && (NIL != following_strings)) {
            return ask_utilities.ask_variable($sym295$_PRED, listS($$headMedialStringDenotesArgInReln, leading_strings, wu, following_strings, pos, $list296), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != leading_strings) {
            return ask_utilities.ask_variable($sym295$_PRED, listS($$multiWordStringDenotesArgInReln, leading_strings, wu, pos, $list296), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != following_strings) {
            return ask_utilities.ask_variable($sym295$_PRED, listS($$compoundStringDenotesArgInReln, wu, following_strings, pos, $list296), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return ask_utilities.ask_variable($sym295$_PRED, listS($$denotesArgInReln, wu, pos, $list296), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject relational_noun_possessed_type(final SubLObject pred, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLObject tightest_constraint = kb_accessors.min_argn_isa(pred, argnum, mt).first();
        return NIL != tightest_constraint ? tightest_constraint : $$Thing;
    }

    public static SubLObject relational_noun_possessor_type(final SubLObject pred, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLObject tightest_constraint = kb_accessors.min_argn_isa(pred, argnum, mt).first();
        return NIL != tightest_constraint ? tightest_constraint : $$Thing;
    }

    public static SubLObject la_test_func(final SubLObject thing1, final SubLObject thing2) {
        SubLObject cdolist_list_var = thing2;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(narts_high.nart_substitute(item), narts_high.nart_substitute(thing1), EQUAL, UNPROVIDED)) {
                Errors.warn($str306$missing___S, item);
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject denotation_mapper_test(final SubLObject string, SubLObject excluded_preds, SubLObject mode, SubLObject parse_morphologically) {
        if (excluded_preds == UNPROVIDED) {
            excluded_preds = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $GREEDY;
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result = denotation_mapper(string, excluded_preds, mode, parse_morphologically);
        final SubLObject failure = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = transform_list_utilities.transform(result, HL_TERM_WITH_EL_COUNTERPART_P, HL_TERM_TO_EL_TERM, UNPROVIDED);
        return values(result, failure);
    }

    public static SubLObject declare_lexicon_accessors_file() {
        declareFunction(me, "genl_lexicon_mtP", "GENL-LEXICON-MT?", 2, 0, false);
        declareFunction(me, "clear_genl_lexicon_mtP_cached", "CLEAR-GENL-LEXICON-MT?-CACHED", 0, 0, false);
        declareFunction(me, "remove_genl_lexicon_mtP_cached", "REMOVE-GENL-LEXICON-MT?-CACHED", 2, 0, false);
        declareFunction(me, "genl_lexicon_mtP_cached_internal", "GENL-LEXICON-MT?-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "genl_lexicon_mtP_cached", "GENL-LEXICON-MT?-CACHED", 2, 0, false);
        declareFunction(me, "initialize_speech_part_caches", "INITIALIZE-SPEECH-PART-CACHES", 0, 0, false);
        declareFunction(me, "preds_matching_pos", "PREDS-MATCHING-POS", 2, 1, false);
        declareFunction(me, "top_level_nl_preds", "TOP-LEVEL-NL-PREDS", 0, 0, false);
        declareFunction(me, "clear_speech_part_pred_caches", "CLEAR-SPEECH-PART-PRED-CACHES", 0, 0, false);
        declareFunction(me, "max_preds_matching_pos", "MAX-PREDS-MATCHING-POS", 3, 1, false);
        declareFunction(me, "clear_max_preds_matching_pos_cached", "CLEAR-MAX-PREDS-MATCHING-POS-CACHED", 0, 0, false);
        declareFunction(me, "remove_max_preds_matching_pos_cached", "REMOVE-MAX-PREDS-MATCHING-POS-CACHED", 4, 0, false);
        declareFunction(me, "max_preds_matching_pos_cached_internal", "MAX-PREDS-MATCHING-POS-CACHED-INTERNAL", 4, 0, false);
        declareFunction(me, "max_preds_matching_pos_cached", "MAX-PREDS-MATCHING-POS-CACHED", 4, 0, false);
        declareFunction(me, "all_preds_of_pos", "ALL-PREDS-OF-POS", 1, 0, false);
        declareFunction(me, "clear_max_preds_of_pos", "CLEAR-MAX-PREDS-OF-POS", 0, 0, false);
        declareFunction(me, "remove_max_preds_of_pos", "REMOVE-MAX-PREDS-OF-POS", 1, 0, false);
        declareFunction(me, "max_preds_of_pos_internal", "MAX-PREDS-OF-POS-INTERNAL", 1, 0, false);
        declareFunction(me, "max_preds_of_pos", "MAX-PREDS-OF-POS", 1, 0, false);
        declareFunction(me, "clear_max_preds_licensed_by_pos", "CLEAR-MAX-PREDS-LICENSED-BY-POS", 0, 0, false);
        declareFunction(me, "remove_max_preds_licensed_by_pos", "REMOVE-MAX-PREDS-LICENSED-BY-POS", 1, 0, false);
        declareFunction(me, "max_preds_licensed_by_pos_internal", "MAX-PREDS-LICENSED-BY-POS-INTERNAL", 1, 0, false);
        declareFunction(me, "max_preds_licensed_by_pos", "MAX-PREDS-LICENSED-BY-POS", 1, 0, false);
        declareFunction(me, "lex_remove_spec_preds", "LEX-REMOVE-SPEC-PREDS", 1, 0, false);
        declareFunction(me, "lex_remove_spec_preds_helper_internal", "LEX-REMOVE-SPEC-PREDS-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "lex_remove_spec_preds_helper", "LEX-REMOVE-SPEC-PREDS-HELPER", 1, 0, false);
        declareFunction(me, "speech_part_pred_min_ceilings", "SPEECH-PART-PRED-MIN-CEILINGS", 1, 1, false);
        declareFunction(me, "clear_speech_part_pred_min_ceilings_int", "CLEAR-SPEECH-PART-PRED-MIN-CEILINGS-INT", 0, 0, false);
        declareFunction(me, "remove_speech_part_pred_min_ceilings_int", "REMOVE-SPEECH-PART-PRED-MIN-CEILINGS-INT", 2, 0, false);
        declareFunction(me, "speech_part_pred_min_ceilings_int_internal", "SPEECH-PART-PRED-MIN-CEILINGS-INT-INTERNAL", 2, 0, false);
        declareFunction(me, "speech_part_pred_min_ceilings_int", "SPEECH-PART-PRED-MIN-CEILINGS-INT", 2, 0, false);
        declareFunction(me, "speech_part_pred_max_floors", "SPEECH-PART-PRED-MAX-FLOORS", 1, 1, false);
        declareFunction(me, "clear_speech_part_pred_max_floors_int", "CLEAR-SPEECH-PART-PRED-MAX-FLOORS-INT", 0, 0, false);
        declareFunction(me, "remove_speech_part_pred_max_floors_int", "REMOVE-SPEECH-PART-PRED-MAX-FLOORS-INT", 2, 0, false);
        declareFunction(me, "speech_part_pred_max_floors_int_internal", "SPEECH-PART-PRED-MAX-FLOORS-INT-INTERNAL", 2, 0, false);
        declareFunction(me, "speech_part_pred_max_floors_int", "SPEECH-PART-PRED-MAX-FLOORS-INT", 2, 0, false);
        declareFunction(me, "clear_pos_of_pred", "CLEAR-POS-OF-PRED", 0, 0, false);
        declareFunction(me, "remove_pos_of_pred", "REMOVE-POS-OF-PRED", 1, 0, false);
        declareFunction(me, "pos_of_pred_internal", "POS-OF-PRED-INTERNAL", 1, 0, false);
        declareFunction(me, "pos_of_pred", "POS-OF-PRED", 1, 0, false);
        declareFunction(me, "singular_pred", "SINGULAR-PRED", 1, 0, false);
        declareFunction(me, "plural_pred", "PLURAL-PRED", 1, 0, false);
        declareFunction(me, "derived_preds", "DERIVED-PREDS", 0, 0, false);
        declareFunction(me, "clear_derived_preds", "CLEAR-DERIVED-PREDS", 0, 0, false);
        declareFunction(me, "initialize_derived_preds", "INITIALIZE-DERIVED-PREDS", 0, 0, false);
        declareFunction(me, "derived_predP", "DERIVED-PRED?", 1, 1, false);
        declareFunction(me, "base_preds_of_pred", "BASE-PREDS-OF-PRED", 1, 1, false);
        declareMacro(me, "do_speech_part_preds", "DO-SPEECH-PART-PREDS");
        declareFunction(me, "speech_part_preds_initializedP", "SPEECH-PART-PREDS-INITIALIZED?", 0, 0, false);
        declareFunction(me, "clear_speech_part_preds", "CLEAR-SPEECH-PART-PREDS", 0, 0, false);
        declareFunction(me, "initialize_speech_part_preds", "INITIALIZE-SPEECH-PART-PREDS", 0, 0, false);
        declareFunction(me, "ensure_speech_part_preds_initialized", "ENSURE-SPEECH-PART-PREDS-INITIALIZED", 0, 0, false);
        declareFunction(me, "speech_part_predP", "SPEECH-PART-PRED?", 1, 1, false);
        new lexicon_accessors.$speech_part_predP$UnaryFunction();
        new lexicon_accessors.$speech_part_predP$BinaryFunction();
        declareFunction(me, "all_speech_part_preds", "ALL-SPEECH-PART-PREDS", 0, 1, false);
        declareFunction(me, "spec_pos_predP", "SPEC-POS-PRED?", 2, 1, false);
        declareFunction(me, "clear_genl_pos_predP", "CLEAR-GENL-POS-PRED?", 0, 0, false);
        declareFunction(me, "remove_genl_pos_predP", "REMOVE-GENL-POS-PRED?", 2, 1, false);
        declareFunction(me, "genl_pos_predP_internal", "GENL-POS-PRED?-INTERNAL", 3, 0, false);
        declareFunction(me, "genl_pos_predP", "GENL-POS-PRED?", 2, 1, false);
        new lexicon_accessors.$genl_pos_predP$BinaryFunction();
        declareFunction(me, "clear_genl_pos_pred_from_mt_infoP", "CLEAR-GENL-POS-PRED-FROM-MT-INFO?", 0, 0, false);
        declareFunction(me, "remove_genl_pos_pred_from_mt_infoP", "REMOVE-GENL-POS-PRED-FROM-MT-INFO?", 2, 1, false);
        declareFunction(me, "genl_pos_pred_from_mt_infoP_internal", "GENL-POS-PRED-FROM-MT-INFO?-INTERNAL", 3, 0, false);
        declareFunction(me, "genl_pos_pred_from_mt_infoP", "GENL-POS-PRED-FROM-MT-INFO?", 2, 1, false);
        declareFunction(me, "word_form_predictableP", "WORD-FORM-PREDICTABLE?", 3, 1, false);
        declareFunction(me, "get_strings_of_type", "GET-STRINGS-OF-TYPE", 2, 3, false);
        declareFunction(me, "clear_get_strings_of_type_cached", "CLEAR-GET-STRINGS-OF-TYPE-CACHED", 0, 0, false);
        declareFunction(me, "remove_get_strings_of_type_cached", "REMOVE-GET-STRINGS-OF-TYPE-CACHED", 2, 3, false);
        declareFunction(me, "get_strings_of_type_cached_internal", "GET-STRINGS-OF-TYPE-CACHED-INTERNAL", 5, 0, false);
        declareFunction(me, "get_strings_of_type_cached", "GET-STRINGS-OF-TYPE-CACHED", 2, 3, false);
        declareFunction(me, "string_is_pos_on_wuP_internal", "STRING-IS-POS-ON-WU?-INTERNAL", 3, 3, false);
        declareFunction(me, "string_is_pos_on_wuP", "STRING-IS-POS-ON-WU?", 3, 3, false);
        declareFunction(me, "string_is_pos_on_wuP_asserted", "STRING-IS-POS-ON-WU?-ASSERTED", 4, 0, false);
        declareFunction(me, "string_is_pred_on_wuP", "STRING-IS-PRED-ON-WU?", 3, 2, false);
        declareFunction(me, "best_wu_for_string", "BEST-WU-FOR-STRING", 2, 0, false);
        declareFunction(me, "best_pos_for_stringXwuXpos", "BEST-POS-FOR-STRING&WU&POS", 3, 0, false);
        declareFunction(me, "words_of_stringXpred", "WORDS-OF-STRING&PRED", 2, 3, false);
        declareFunction(me, "clear_pos_for_keyword", "CLEAR-POS-FOR-KEYWORD", 0, 0, false);
        declareFunction(me, "remove_pos_for_keyword", "REMOVE-POS-FOR-KEYWORD", 1, 1, false);
        declareFunction(me, "pos_for_keyword_internal", "POS-FOR-KEYWORD-INTERNAL", 2, 0, false);
        declareFunction(me, "pos_for_keyword", "POS-FOR-KEYWORD", 1, 1, false);
        declareFunction(me, "words_of_stringXpos", "WORDS-OF-STRING&POS", 2, 3, false);
        declareFunction(me, "words_of_stringXspeech_part", "WORDS-OF-STRING&SPEECH-PART", 2, 3, false);
        declareFunction(me, "preds_of_stringXword", "PREDS-OF-STRING&WORD", 2, 3, false);
        declareFunction(me, "clear_preds_of_stringXword", "CLEAR-PREDS-OF-STRING&WORD", 0, 0, false);
        declareFunction(me, "clear_preds_of_stringXword_cached", "CLEAR-PREDS-OF-STRING&WORD-CACHED", 0, 0, false);
        declareFunction(me, "remove_preds_of_stringXword_cached", "REMOVE-PREDS-OF-STRING&WORD-CACHED", 5, 0, false);
        declareFunction(me, "preds_of_stringXword_cached_internal", "PREDS-OF-STRING&WORD-CACHED-INTERNAL", 5, 0, false);
        declareFunction(me, "preds_of_stringXword_cached", "PREDS-OF-STRING&WORD-CACHED", 5, 0, false);
        declareFunction(me, "other_strings_of_wu", "OTHER-STRINGS-OF-WU", 1, 2, false);
        declareFunction(me, "right_frames_for_pos", "RIGHT-FRAMES-FOR-POS", 1, 0, false);
        declareFunction(me, "pos_of_string", "POS-OF-STRING", 1, 3, false);
        declareFunction(me, "string_is_posP", "STRING-IS-POS?", 2, 3, false);
        declareFunction(me, "string_is_form_of_aux_verbP", "STRING-IS-FORM-OF-AUX-VERB?", 1, 2, false);
        declareFunction(me, "clear_closed_lexical_class_hash", "CLEAR-CLOSED-LEXICAL-CLASS-HASH", 0, 0, false);
        declareFunction(me, "initialize_closed_lexical_class_strings", "INITIALIZE-CLOSED-LEXICAL-CLASS-STRINGS", 0, 0, false);
        declareFunction(me, "closed_lexical_class_string_intP", "CLOSED-LEXICAL-CLASS-STRING-INT?", 3, 0, false);
        declareFunction(me, "closed_lexical_class_stringP", "CLOSED-LEXICAL-CLASS-STRING?", 1, 1, false);
        declareFunction(me, "closed_lexical_class_string_case_insensitiveP", "CLOSED-LEXICAL-CLASS-STRING-CASE-INSENSITIVE?", 1, 1, false);
        declareFunction(me, "non_pronominal_closed_lexical_class_stringP", "NON-PRONOMINAL-CLOSED-LEXICAL-CLASS-STRING?", 1, 1, false);
        declareFunction(me, "contains_closed_lexical_class_wordP", "CONTAINS-CLOSED-LEXICAL-CLASS-WORD?", 1, 0, false);
        declareFunction(me, "clear_closed_lexical_class_strings", "CLEAR-CLOSED-LEXICAL-CLASS-STRINGS", 0, 0, false);
        declareFunction(me, "remove_closed_lexical_class_strings", "REMOVE-CLOSED-LEXICAL-CLASS-STRINGS", 0, 1, false);
        declareFunction(me, "closed_lexical_class_strings_internal", "CLOSED-LEXICAL-CLASS-STRINGS-INTERNAL", 1, 0, false);
        declareFunction(me, "closed_lexical_class_strings", "CLOSED-LEXICAL-CLASS-STRINGS", 0, 1, false);
        declareFunction(me, "closed_lexical_classP", "CLOSED-LEXICAL-CLASS?", 1, 1, false);
        declareFunction(me, "clear_closed_lexical_classes", "CLEAR-CLOSED-LEXICAL-CLASSES", 0, 0, false);
        declareFunction(me, "remove_closed_lexical_classes", "REMOVE-CLOSED-LEXICAL-CLASSES", 0, 1, false);
        declareFunction(me, "closed_lexical_classes_internal", "CLOSED-LEXICAL-CLASSES-INTERNAL", 1, 0, false);
        declareFunction(me, "closed_lexical_classes", "CLOSED-LEXICAL-CLASSES", 0, 1, false);
        declareFunction(me, "maybe_initialize_prep_strings", "MAYBE-INITIALIZE-PREP-STRINGS", 0, 0, false);
        declareFunction(me, "preposition_stringP", "PREPOSITION-STRING?", 1, 1, false);
        declareFunction(me, "quick_lexical_wordP", "QUICK-LEXICAL-WORD?", 1, 1, false);
        declareFunction(me, "quick_lexical_wordP_int", "QUICK-LEXICAL-WORD?-INT", 2, 0, false);
        declareFunction(me, "quick_word_nautP", "QUICK-WORD-NAUT?", 1, 0, false);
        declareFunction(me, "lexical_wordP_internal", "LEXICAL-WORD?-INTERNAL", 1, 0, false);
        declareFunction(me, "lexical_wordP", "LEXICAL-WORD?", 1, 0, false);
        declareFunction(me, "derived_wordP_internal", "DERIVED-WORD?-INTERNAL", 1, 0, false);
        declareFunction(me, "derived_wordP", "DERIVED-WORD?", 1, 0, false);
        declareFunction(me, "initialize_vulgar_words", "INITIALIZE-VULGAR-WORDS", 0, 0, false);
        declareFunction(me, "vulgar_wordP", "VULGAR-WORD?", 1, 0, false);
        declareFunction(me, "pos_of_stringXword", "POS-OF-STRING&WORD", 2, 3, false);
        declareFunction(me, "clear_nl_caches", "CLEAR-NL-CACHES", 0, 0, false);
        declareFunction(me, "clear_nl_parsing_caches", "CLEAR-NL-PARSING-CACHES", 0, 0, false);
        declareFunction(me, "clear_cached_lexical_access_functions", "CLEAR-CACHED-LEXICAL-ACCESS-FUNCTIONS", 0, 0, false);
        declareFunction(me, "pos_of_word", "POS-OF-WORD", 1, 1, false);
        declareFunction(me, "word_has_posP", "WORD-HAS-POS?", 2, 1, false);
        declareFunction(me, "clear_verb_only_stringP", "CLEAR-VERB-ONLY-STRING?", 0, 0, false);
        declareFunction(me, "remove_verb_only_stringP", "REMOVE-VERB-ONLY-STRING?", 1, 0, false);
        declareFunction(me, "verb_only_stringP_internal", "VERB-ONLY-STRING?-INTERNAL", 1, 0, false);
        declareFunction(me, "verb_only_stringP", "VERB-ONLY-STRING?", 1, 0, false);
        declareFunction(me, "typed_denots_of_string", "TYPED-DENOTS-OF-STRING", 2, 8, false);
        declareFunction(me, "typed_denots_of_string_preds_okP", "TYPED-DENOTS-OF-STRING-PREDS-OK?", 2, 0, false);
        declareFunction(me, "denot_has_typeP_internal", "DENOT-HAS-TYPE?-INTERNAL", 2, 1, false);
        declareFunction(me, "denot_has_typeP", "DENOT-HAS-TYPE?", 2, 1, false);
        declareFunction(me, "denot_might_have_typeP_internal", "DENOT-MIGHT-HAVE-TYPE?-INTERNAL", 2, 0, false);
        declareFunction(me, "denot_might_have_typeP", "DENOT-MIGHT-HAVE-TYPE?", 2, 0, false);
        declareFunction(me, "multi_typed_denots_of_string", "MULTI-TYPED-DENOTS-OF-STRING", 3, 8, false);
        declareFunction(me, "typed_denots_of_string_at_place", "TYPED-DENOTS-OF-STRING-AT-PLACE", 3, 6, false);
        declareFunction(me, "in_region_p", "IN-REGION-P", 3, 0, false);
        declareFunction(me, "geopolitical_subdivisionP", "GEOPOLITICAL-SUBDIVISION?", 3, 0, false);
        declareFunction(me, "geographical_subregionP", "GEOGRAPHICAL-SUBREGION?", 3, 0, false);
        declareFunction(me, "territories_for_gpe", "TERRITORIES-FOR-GPE", 1, 0, false);
        declareFunction(me, "gpe_for_territory", "GPE-FOR-TERRITORY", 1, 0, false);
        declareFunction(me, "denots_of_partial_string", "DENOTS-OF-PARTIAL-STRING", 1, 3, false);
        declareFunction(me, "denotation_mapper", "DENOTATION-MAPPER", 1, 3, false);
        declareFunction(me, "all_denots_of_string", "ALL-DENOTS-OF-STRING", 1, 3, false);
        declareFunction(me, "most_denots_of_string", "MOST-DENOTS-OF-STRING", 1, 3, false);
        declareFunction(me, "all_parsing_denots_of_string", "ALL-PARSING-DENOTS-OF-STRING", 1, 3, false);
        declareFunction(me, "denots_of_string", "DENOTS-OF-STRING", 1, 8, false);
        declareFunction(me, "valid_denots_of_string_lookup_mt_specificationP", "VALID-DENOTS-OF-STRING-LOOKUP-MT-SPECIFICATION?", 1, 0, false);
        declareFunction(me, "denots_mt_for_language", "DENOTS-MT-FOR-LANGUAGE", 1, 0, false);
        declareFunction(me, "add_denots_of_string_results", "ADD-DENOTS-OF-STRING-RESULTS", 4, 0, false);
        declareFunction(me, "date_and_number_denots_of_string", "DATE-AND-NUMBER-DENOTS-OF-STRING", 1, 0, false);
        declareFunction(me, "denots_of_stringXpred", "DENOTS-OF-STRING&PRED", 2, 6, false);
        declareFunction(me, "denots_of_stringXnamestring_pred", "DENOTS-OF-STRING&NAMESTRING-PRED", 2, 3, false);
        declareFunction(me, "denots_of_stringXpos_pred", "DENOTS-OF-STRING&POS-PRED", 2, 5, false);
        declareFunction(me, "denots_of_stringXspeech_part", "DENOTS-OF-STRING&SPEECH-PART", 2, 5, false);
        declareFunction(me, "denots_of_stringXpos", "DENOTS-OF-STRING&POS", 2, 5, false);
        declareFunction(me, "denots_of_name_string", "DENOTS-OF-NAME-STRING", 1, 3, false);
        declareFunction(me, "denots_of_name_string_precise", "DENOTS-OF-NAME-STRING-PRECISE", 1, 2, false);
        declareFunction(me, "denots_of_wu", "DENOTS-OF-WU", 1, 1, false);
        declareFunction(me, "proceed_with_morphological_parsingP", "PROCEED-WITH-MORPHOLOGICAL-PARSING?", 2, 0, false);
        declareFunction(me, "skip_to_morphological_parsingP", "SKIP-TO-MORPHOLOGICAL-PARSING?", 1, 0, false);
        declareFunction(me, "denots_of_acronym_string", "DENOTS-OF-ACRONYM-STRING", 1, 2, false);
        declareFunction(me, "names_from_spelling", "NAMES-FROM-SPELLING", 1, 2, false);
        declareFunction(me, "names_from_nickname", "NAMES-FROM-NICKNAME", 1, 2, false);
        declareFunction(me, "denots_of_abbreviation_string", "DENOTS-OF-ABBREVIATION-STRING", 1, 2, false);
        declareFunction(me, "known_proper_noun_phraseP", "KNOWN-PROPER-NOUN-PHRASE?", 1, 0, false);
        declareFunction(me, "determine_denotation_preds", "DETERMINE-DENOTATION-PREDS", 1, 0, false);
        declareFunction(me, "determine_denotation_pred", "DETERMINE-DENOTATION-PRED", 1, 0, false);
        declareFunction(me, "meanings_of_sense", "MEANINGS-OF-SENSE", 4, 1, false);
        declareFunction(me, "meaning_has_senseP", "MEANING-HAS-SENSE?", 5, 1, false);
        declareFunction(me, "denot_has_senseP", "DENOT-HAS-SENSE?", 4, 1, false);
        declareFunction(me, "denots_of_sense", "DENOTS-OF-SENSE", 3, 1, false);
        declareFunction(me, "proper_denots_of_sense", "PROPER-DENOTS-OF-SENSE", 3, 1, false);
        declareFunction(me, "related_denots_of_sense", "RELATED-DENOTS-OF-SENSE", 3, 1, false);
        declareFunction(me, "placeholder_denots_of_sense", "PLACEHOLDER-DENOTS-OF-SENSE", 3, 1, false);
        declareFunction(me, "denots_of_sense_by_mt", "DENOTS-OF-SENSE-BY-MT", 3, 1, false);
        declareFunction(me, "senses_of_wuXpos", "SENSES-OF-WU&POS", 2, 1, false);
        declareFunction(me, "subcat_frame_arity", "SUBCAT-FRAME-ARITY", 1, 0, false);
        declareFunction(me, "frames_of_word", "FRAMES-OF-WORD", 1, 0, false);
        declareFunction(me, "frames_of_wordXpos", "FRAMES-OF-WORD&POS", 2, 0, false);
        declareFunction(me, "frames_of_word_posXdenot", "FRAMES-OF-WORD-POS&DENOT", 3, 0, false);
        declareFunction(me, "frames_of_sense", "FRAMES-OF-SENSE", 3, 1, false);
        declareFunction(me, "frames_of_sense_by_mt", "FRAMES-OF-SENSE-BY-MT", 3, 0, false);
        declareFunction(me, "politeness_of_ws_pred", "POLITENESS-OF-WS-PRED", 0, 0, false);
        declareFunction(me, "formality_of_ws_pred", "FORMALITY-OF-WS-PRED", 0, 0, false);
        declareFunction(me, "politeness_levels_of_assertion", "POLITENESS-LEVELS-OF-ASSERTION", 1, 1, false);
        declareFunction(me, "formality_levels_of_assertion", "FORMALITY-LEVELS-OF-ASSERTION", 1, 1, false);
        declareFunction(me, "potentially_offensive_politeness_levelP", "POTENTIALLY-OFFENSIVE-POLITENESS-LEVEL?", 1, 0, false);
        declareFunction(me, "includes_potentially_offensive_politeness_levelP", "INCLUDES-POTENTIALLY-OFFENSIVE-POLITENESS-LEVEL?", 1, 0, false);
        declareFunction(me, "potentially_offensive_lexical_assertionP", "POTENTIALLY-OFFENSIVE-LEXICAL-ASSERTION?", 1, 0, false);
        declareFunction(me, "slang_lexical_assertionP", "SLANG-LEXICAL-ASSERTION?", 1, 0, false);
        declareFunction(me, "archaic_lexical_assertionP", "ARCHAIC-LEXICAL-ASSERTION?", 1, 0, false);
        declareFunction(me, "clear_indirect_lexical_assertionP", "CLEAR-INDIRECT-LEXICAL-ASSERTION?", 0, 0, false);
        declareFunction(me, "remove_indirect_lexical_assertionP", "REMOVE-INDIRECT-LEXICAL-ASSERTION?", 1, 0, false);
        declareFunction(me, "indirect_lexical_assertionP_internal", "INDIRECT-LEXICAL-ASSERTION?-INTERNAL", 1, 0, false);
        declareFunction(me, "indirect_lexical_assertionP", "INDIRECT-LEXICAL-ASSERTION?", 1, 0, false);
        declareFunction(me, "inappropriate_lexical_assertionP", "INAPPROPRIATE-LEXICAL-ASSERTION?", 1, 0, false);
        declareFunction(me, "gather_denotation_assertions", "GATHER-DENOTATION-ASSERTIONS", 3, 0, false);
        declareFunction(me, "potentially_offensive_senseP", "POTENTIALLY-OFFENSIVE-SENSE?", 3, 0, false);
        declareFunction(me, "inappropriate_senseP", "INAPPROPRIATE-SENSE?", 3, 0, false);
        declareFunction(me, "semtrans_of_ws", "SEMTRANS-OF-WS", 3, 0, false);
        declareFunction(me, "semtrans_of_wuXpos", "SEMTRANS-OF-WU&POS", 2, 1, false);
        declareFunction(me, "semtrans_lookup_int", "SEMTRANS-LOOKUP-INT", 3, 1, false);
        declareFunction(me, "semtrans_template_from_assertion", "SEMTRANS-TEMPLATE-FROM-ASSERTION", 1, 1, false);
        declareFunction(me, "semtrans_sentence_infer", "SEMTRANS-SENTENCE-INFER", 2, 0, false);
        declareFunction(me, "denots_of_word", "DENOTS-OF-WORD", 1, 1, false);
        declareFunction(me, "semtrans_assertion_lookup", "SEMTRANS-ASSERTION-LOOKUP", 2, 1, false);
        declareFunction(me, "all_semtrans_assertions", "ALL-SEMTRANS-ASSERTIONS", 2, 1, false);
        declareFunction(me, "preposition_of_frame", "PREPOSITION-OF-FRAME", 1, 0, false);
        declareFunction(me, "assertion_denotation", "ASSERTION-DENOTATION", 1, 0, false);
        declareFunction(me, "assertion_pos", "ASSERTION-POS", 1, 0, false);
        declareFunction(me, "assertion_sense_num", "ASSERTION-SENSE-NUM", 1, 0, false);
        declareFunction(me, "clear_agr_of_det_string", "CLEAR-AGR-OF-DET-STRING", 0, 0, false);
        declareFunction(me, "remove_agr_of_det_string", "REMOVE-AGR-OF-DET-STRING", 1, 0, false);
        declareFunction(me, "agr_of_det_string_internal", "AGR-OF-DET-STRING-INTERNAL", 1, 0, false);
        declareFunction(me, "agr_of_det_string", "AGR-OF-DET-STRING", 1, 0, false);
        declareFunction(me, "agreement_lookup", "AGREEMENT-LOOKUP", 1, 0, false);
        declareFunction(me, "denot_ws_lookup", "DENOT-WS-LOOKUP", 2, 1, false);
        declareFunction(me, "pos_to_semtrans_pred", "POS-TO-SEMTRANS-PRED", 1, 1, false);
        declareFunction(me, "clear_pos_to_semtrans_pred_cached", "CLEAR-POS-TO-SEMTRANS-PRED-CACHED", 0, 0, false);
        new lexicon_accessors.$clear_pos_to_semtrans_pred_cached$ZeroArityFunction();
        declareFunction(me, "remove_pos_to_semtrans_pred_cached", "REMOVE-POS-TO-SEMTRANS-PRED-CACHED", 2, 0, false);
        declareFunction(me, "pos_to_semtrans_pred_cached_internal", "POS-TO-SEMTRANS-PRED-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "pos_to_semtrans_pred_cached", "POS-TO-SEMTRANS-PRED-CACHED", 2, 0, false);
        declareFunction(me, "clear_semtrans_pred_to_pos", "CLEAR-SEMTRANS-PRED-TO-POS", 0, 0, false);
        declareFunction(me, "remove_semtrans_pred_to_pos", "REMOVE-SEMTRANS-PRED-TO-POS", 1, 1, false);
        declareFunction(me, "semtrans_pred_to_pos_internal", "SEMTRANS-PRED-TO-POS-INTERNAL", 2, 0, false);
        declareFunction(me, "semtrans_pred_to_pos", "SEMTRANS-PRED-TO-POS", 1, 1, false);
        declareFunction(me, "nicknames_of_name", "NICKNAMES-OF-NAME", 1, 0, false);
        declareFunction(me, "spellings_of_name", "SPELLINGS-OF-NAME", 1, 0, false);
        declareFunction(me, "argn_is_speech_partP", "ARGN-IS-SPEECH-PART?", 2, 0, false);
        declareFunction(me, "speech_parts_initializedP", "SPEECH-PARTS-INITIALIZED?", 0, 0, false);
        declareFunction(me, "clear_speech_parts", "CLEAR-SPEECH-PARTS", 0, 0, false);
        declareFunction(me, "initialize_speech_parts", "INITIALIZE-SPEECH-PARTS", 0, 0, false);
        declareFunction(me, "speech_partP", "SPEECH-PART?", 1, 1, false);
        declareFunction(me, "ensure_speech_parts_initialized", "ENSURE-SPEECH-PARTS-INITIALIZED", 0, 0, false);
        declareFunction(me, "all_speech_parts", "ALL-SPEECH-PARTS", 0, 1, false);
        declareFunction(me, "clear_genl_posP", "CLEAR-GENL-POS?", 0, 0, false);
        declareFunction(me, "remove_genl_posP", "REMOVE-GENL-POS?", 2, 1, false);
        declareFunction(me, "genl_posP_internal", "GENL-POS?-INTERNAL", 3, 0, false);
        declareFunction(me, "genl_posP", "GENL-POS?", 2, 1, false);
        declareFunction(me, "genl_pos_memberP", "GENL-POS-MEMBER?", 2, 0, false);
        declareFunction(me, "spec_posP", "SPEC-POS?", 2, 0, false);
        declareFunction(me, "adjpP", "ADJP?", 1, 0, false);
        declareFunction(me, "vbarP", "VBAR?", 1, 0, false);
        declareFunction(me, "nbarP", "NBAR?", 1, 0, false);
        declareFunction(me, "object_is_compositional_pos_termP", "OBJECT-IS-COMPOSITIONAL-POS-TERM?", 3, 0, false);
        declareFunction(me, "clear_compositional_pos_nart", "CLEAR-COMPOSITIONAL-POS-NART", 0, 0, false);
        declareFunction(me, "remove_compositional_pos_nart", "REMOVE-COMPOSITIONAL-POS-NART", 2, 0, false);
        declareFunction(me, "compositional_pos_nart_internal", "COMPOSITIONAL-POS-NART-INTERNAL", 2, 0, false);
        declareFunction(me, "compositional_pos_nart", "COMPOSITIONAL-POS-NART", 2, 0, false);
        declareFunction(me, "npP", "NP?", 1, 0, false);
        declareFunction(me, "ppP", "PP?", 1, 0, false);
        declareFunction(me, "safe_nart_hl_formula", "SAFE-NART-HL-FORMULA", 1, 0, false);
        declareFunction(me, "relational_noun_denots", "RELATIONAL-NOUN-DENOTS", 4, 4, false);
        declareFunction(me, "relational_noun_denot_template_lookup", "RELATIONAL-NOUN-DENOT-TEMPLATE-LOOKUP", 2, 0, false);
        declareFunction(me, "relational_noun_possessed_argnums", "RELATIONAL-NOUN-POSSESSED-ARGNUMS", 5, 1, false);
        declareFunction(me, "relational_noun_preds", "RELATIONAL-NOUN-PREDS", 4, 1, false);
        declareFunction(me, "relational_noun_possessed_type", "RELATIONAL-NOUN-POSSESSED-TYPE", 2, 1, false);
        declareFunction(me, "relational_noun_possessor_type", "RELATIONAL-NOUN-POSSESSOR-TYPE", 2, 1, false);
        declareFunction(me, "la_test_func", "LA-TEST-FUNC", 2, 0, false);
        declareFunction(me, "denotation_mapper_test", "DENOTATION-MAPPER-TEST", 1, 3, false);
        return NIL;
    }

    public static SubLObject init_lexicon_accessors_file() {
        deflexical("*GENL-LEXICON-MT?-CACHED-CACHING-STATE*", NIL);
        deflexical("*MAX-PREDS-MATCHING-POS-CACHED-CACHING-STATE*", NIL);
        deflexical("*MAX-PREDS-OF-POS-CACHING-STATE*", NIL);
        deflexical("*MAX-PREDS-LICENSED-BY-POS-CACHING-STATE*", NIL);
        deflexical("*SPEECH-PART-PRED-MIN-CEILINGS-INT-CACHING-STATE*", NIL);
        deflexical("*SPEECH-PART-PRED-MAX-FLOORS-INT-CACHING-STATE*", NIL);
        deflexical("*POS-OF-PRED-CACHING-STATE*", NIL);
        deflexical("*DERIVED-PREDS*", SubLTrampolineFile.maybeDefault($derived_preds$, $derived_preds$, () -> make_hash_table($int$256, UNPROVIDED, UNPROVIDED)));
        deflexical("*SPEECH-PART-PREDS*", SubLTrampolineFile.maybeDefault($speech_part_preds$, $speech_part_preds$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$256)));
        deflexical("*GENL-POS-PRED?-CACHING-STATE*", NIL);
        deflexical("*GENL-POS-PRED-FROM-MT-INFO?-CACHING-STATE*", NIL);
        deflexical("*GET-STRINGS-OF-TYPE-CACHED-CACHING-STATE*", NIL);
        deflexical("*POS-FOR-KEYWORD-CACHING-STATE*", NIL);
        deflexical("*PREDS-OF-STRING&WORD-CACHED-CACHING-STATE*", NIL);
        deflexical("*CLOSED-LEXICAL-CLASS-STRINGS*", SubLTrampolineFile.maybeDefault($closed_lexical_class_strings$, $closed_lexical_class_strings$, () -> make_hash_table($int$512, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*CLOSED-LEXICAL-CLASS-STRINGS-CASE-INSENSITIVE*", SubLTrampolineFile.maybeDefault($closed_lexical_class_strings_case_insensitive$, $closed_lexical_class_strings_case_insensitive$, () -> make_hash_table($int$512, symbol_function(EQUALP), UNPROVIDED)));
        deflexical("*CLOSED-LEXICAL-CLASS-STRINGS-CACHING-STATE*", NIL);
        deflexical("*CLOSED-LEXICAL-CLASSES-CACHING-STATE*", NIL);
        defparameter("*PREPOSITION-STRINGS*", make_hash_table($int$64, symbol_function(EQUALP), UNPROVIDED));
        deflexical("*POS-FORMS-SPEC-PREDS*", $list160);
        deflexical("*VULGAR-WORDS*", SubLTrampolineFile.maybeDefault($vulgar_words$, $vulgar_words$, () -> set.new_set(UNPROVIDED, UNPROVIDED)));
        deflexical("*VERB-ONLY-STRING?-CACHING-STATE*", NIL);
        deflexical("*INDIRECT-LEXICAL-ASSERTION?-CACHING-STATE*", NIL);
        deflexical("*AGR-OF-DET-STRING-CACHING-STATE*", NIL);
        deflexical("*POS-TO-SEMTRANS-PRED-CACHED-CACHING-STATE*", NIL);
        deflexical("*SEMTRANS-PRED-TO-POS-CACHING-STATE*", NIL);
        deflexical("*SPEECH-PARTS*", SubLTrampolineFile.maybeDefault($speech_parts$, $speech_parts$, () -> dictionary.new_dictionary(symbol_function(EQL), $int$256)));
        deflexical("*GENL-POS?-CACHING-STATE*", NIL);
        deflexical("*MOST-GENERAL-SPEECH-PART*", $$NLWordForm);
        deflexical("*COMPOSITIONAL-POS-NART-CACHING-STATE*", NIL);
        deflexical("*RELATIONAL-NOUN-DENOT-TEMPLATES*", $list289);
        return NIL;
    }

    public static SubLObject setup_lexicon_accessors_file() {
        memoization_state.note_globally_cached_function($sym2$GENL_LEXICON_MT__CACHED);
        memoization_state.note_globally_cached_function(MAX_PREDS_MATCHING_POS_CACHED);
        memoization_state.note_globally_cached_function(MAX_PREDS_OF_POS);
        memoization_state.note_globally_cached_function(MAX_PREDS_LICENSED_BY_POS);
        memoization_state.note_memoized_function(LEX_REMOVE_SPEC_PREDS_HELPER);
        memoization_state.note_globally_cached_function(SPEECH_PART_PRED_MIN_CEILINGS_INT);
        memoization_state.note_globally_cached_function(SPEECH_PART_PRED_MAX_FLOORS_INT);
        memoization_state.note_globally_cached_function(POS_OF_PRED);
        declare_defglobal($derived_preds$);
        declare_defglobal($speech_part_preds$);
        memoization_state.note_globally_cached_function($sym78$GENL_POS_PRED_);
        memoization_state.note_globally_cached_function($sym81$GENL_POS_PRED_FROM_MT_INFO_);
        memoization_state.note_globally_cached_function(GET_STRINGS_OF_TYPE_CACHED);
        memoization_state.note_memoized_function($sym93$STRING_IS_POS_ON_WU_);
        memoization_state.note_globally_cached_function(POS_FOR_KEYWORD);
        memoization_state.note_globally_cached_function($sym137$PREDS_OF_STRING_WORD_CACHED);
        declare_defglobal($closed_lexical_class_strings$);
        declare_defglobal($closed_lexical_class_strings_case_insensitive$);
        memoization_state.note_globally_cached_function(CLOSED_LEXICAL_CLASS_STRINGS);
        memoization_state.note_globally_cached_function(CLOSED_LEXICAL_CLASSES);
        memoization_state.note_memoized_function($sym95$LEXICAL_WORD_);
        memoization_state.note_memoized_function($sym164$DERIVED_WORD_);
        declare_defglobal($vulgar_words$);
        memoization_state.note_globally_cached_function($sym170$VERB_ONLY_STRING_);
        register_cyc_api_function(TYPED_DENOTS_OF_STRING, $list179, $str180$_param_STRING_string_____param_TY, $list181, $list182);
        memoization_state.note_memoized_function($sym183$DENOT_HAS_TYPE_);
        memoization_state.note_memoized_function($sym184$DENOT_MIGHT_HAVE_TYPE_);
        register_cyc_api_function(DENOTATION_MAPPER, $list205, $str206$_param_STRING_string__the_string_, $list207, $list208);
        register_cyc_api_function(DENOTS_OF_STRING, $list215, $str216$_param_PARSE_MORPHOLOGICALLY__PAR, $list217, NIL);
        register_external_symbol(DENOTS_MT_FOR_LANGUAGE);
        memoization_state.note_globally_cached_function($sym250$INDIRECT_LEXICAL_ASSERTION_);
        memoization_state.note_globally_cached_function(AGR_OF_DET_STRING);
        memoization_state.note_globally_cached_function(POS_TO_SEMTRANS_PRED_CACHED);
        memoization_state.note_globally_cached_function(SEMTRANS_PRED_TO_POS);
        declare_defglobal($speech_parts$);
        memoization_state.note_globally_cached_function($sym275$GENL_POS_);
        memoization_state.note_globally_cached_function(COMPOSITIONAL_POS_NART);
        define_test_case_table_int(DENOTS_OF_STRING, list(new SubLObject[]{ $TEST, $sym299$SETS_EQUAL_EQUAL_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list305);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lexicon_accessors_file();
    }

    @Override
    public void initializeVariables() {
        init_lexicon_accessors_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexicon_accessors_file();
    }

    static {





















































































































































































































































































































































    }

    public static final class $speech_part_predP$UnaryFunction extends UnaryFunction {
        public $speech_part_predP$UnaryFunction() {
            super(extractFunctionNamed("SPEECH-PART-PRED?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return speech_part_predP(arg1, lexicon_accessors.$speech_part_predP$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $speech_part_predP$BinaryFunction extends BinaryFunction {
        public $speech_part_predP$BinaryFunction() {
            super(extractFunctionNamed("SPEECH-PART-PRED?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return speech_part_predP(arg1, arg2);
        }
    }

    public static final class $genl_pos_predP$BinaryFunction extends BinaryFunction {
        public $genl_pos_predP$BinaryFunction() {
            super(extractFunctionNamed("GENL-POS-PRED?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return genl_pos_predP(arg1, arg2, lexicon_accessors.$genl_pos_predP$BinaryFunction.UNPROVIDED);
        }
    }

    public static final class $clear_pos_to_semtrans_pred_cached$ZeroArityFunction extends ZeroArityFunction {
        public $clear_pos_to_semtrans_pred_cached$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-POS-TO-SEMTRANS-PRED-CACHED"));
        }

        @Override
        public SubLObject processItem() {
            return clear_pos_to_semtrans_pred_cached();
        }
    }
}

/**
 * Total time: 5747 ms
 */
