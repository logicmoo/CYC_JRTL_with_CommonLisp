package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
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
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class lexicon_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new lexicon_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.lexicon_utilities";

    public static final String myFingerPrint = "d190f1a27c78baecc0beba2164417f24bac7a115259053bc0cf85e867bded98a";

    // deflexical
    // Definitions
    /**
     * Predicates for noun syntactic mappings to be ignored when producing word
     * variants @see word-variants in strict mode
     */
    private static final SubLSymbol $nonstandard_nominal_preds$ = makeSymbol("*NONSTANDARD-NOMINAL-PREDS*");





    // deflexical
    private static final SubLSymbol $spp_more_basicP_cached_caching_state$ = makeSymbol("*SPP-MORE-BASIC?-CACHED-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $det_denot_is_scalar_intervalP_cached_caching_state$ = makeSymbol("*DET-DENOT-IS-SCALAR-INTERVAL?-CACHED-CACHING-STATE*");









    // deflexical
    private static final SubLSymbol $preds_to_pos_args$ = makeSymbol("*PREDS-TO-POS-ARGS*");











    // deflexical
    private static final SubLSymbol $proper_to_common_pred_map$ = makeSymbol("*PROPER-TO-COMMON-PRED-MAP*");

    // deflexical
    private static final SubLSymbol $non_categorizing_nl_pred_types$ = makeSymbol("*NON-CATEGORIZING-NL-PRED-TYPES*");

    // defconstant
    private static final SubLSymbol $lexification_pred_types$ = makeSymbol("*LEXIFICATION-PRED-TYPES*");



    // deflexical
    private static final SubLSymbol $stop_word_closed_class_exceptions$ = makeSymbol("*STOP-WORD-CLOSED-CLASS-EXCEPTIONS*");



    // deflexical
    private static final SubLSymbol $semtrans_frame_keywords$ = makeSymbol("*SEMTRANS-FRAME-KEYWORDS*");

    // deflexical
    private static final SubLSymbol $lexicons_to_languages$ = makeSymbol("*LEXICONS-TO-LANGUAGES*");







    // Internal Constants
    public static final SubLList $list0 = list(reader_make_constant_shell(makeString("agentive-Mass")), reader_make_constant_shell(makeString("agentive-Pl")), reader_make_constant_shell(makeString("agentive-Sg")), reader_make_constant_shell(makeString("gerund")));

    public static final SubLString $$$MWW = makeString("MWW");











    public static final SubLString $str7$_MWW = makeString("-MWW");

    public static final SubLString $str8$_TheWord = makeString("-TheWord");

    private static final SubLObject $$GeneralEnglishMt = reader_make_constant_shell(makeString("GeneralEnglishMt"));





    public static final SubLString $str12$ = makeString("");



    private static final SubLObject $$denotation = reader_make_constant_shell(makeString("denotation"));

    private static final SubLObject $$subcatFrame = reader_make_constant_shell(makeString("subcatFrame"));

    public static final SubLSymbol PREDS_OF_POS_CACHED = makeSymbol("PREDS-OF-POS-CACHED");

    public static final SubLSymbol $preds_of_pos_cached_caching_state$ = makeSymbol("*PREDS-OF-POS-CACHED-CACHING-STATE*");

    private static final SubLObject $$speechPartPreds = reader_make_constant_shell(makeString("speechPartPreds"));

    private static final SubLObject $$CountNoun = reader_make_constant_shell(makeString("CountNoun"));

    private static final SubLObject $$MassNoun = reader_make_constant_shell(makeString("MassNoun"));

    private static final SubLObject $$AgentiveNoun = reader_make_constant_shell(makeString("AgentiveNoun"));

    private static final SubLObject $$ProperMassNoun = reader_make_constant_shell(makeString("ProperMassNoun"));

    private static final SubLObject $$ProperCountNoun = reader_make_constant_shell(makeString("ProperCountNoun"));

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));

    private static final SubLObject $$Adverb = reader_make_constant_shell(makeString("Adverb"));

    private static final SubLSymbol PREDS_LICENSED_BY_POS_CACHED = makeSymbol("PREDS-LICENSED-BY-POS-CACHED");

    private static final SubLObject $$gerund = reader_make_constant_shell(makeString("gerund"));

    private static final SubLSymbol $sym29$SPP_MORE_BASIC_ = makeSymbol("SPP-MORE-BASIC?");

    private static final SubLSymbol $preds_licensed_by_pos_cached_caching_state$ = makeSymbol("*PREDS-LICENSED-BY-POS-CACHED-CACHING-STATE*");





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));











    private static final SubLString $str39$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str44$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLObject $$paraphraseCoercionAllowedFrom = reader_make_constant_shell(makeString("paraphraseCoercionAllowedFrom"));

    private static final SubLString $str47$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    public static final SubLString $str48$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    public static final SubLString $str49$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLObject $$regularSuffix = reader_make_constant_shell(makeString("regularSuffix"));

    public static final SubLSymbol $sym51$SPEC_POS_PRED_ = makeSymbol("SPEC-POS-PRED?");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));

    private static final SubLObject $$plural_Generic = reader_make_constant_shell(makeString("plural-Generic"));

    private static final SubLObject $$nounStrings = reader_make_constant_shell(makeString("nounStrings"));

    private static final SubLSymbol $sym56$SPP_MORE_BASIC__CACHED = makeSymbol("SPP-MORE-BASIC?-CACHED");

    private static final SubLSymbol $sym57$_SPP_MORE_BASIC__CACHED_CACHING_STATE_ = makeSymbol("*SPP-MORE-BASIC?-CACHED-CACHING-STATE*");



    private static final SubLList $list59 = list(reader_make_constant_shell(makeString("singular")), reader_make_constant_shell(makeString("infinitive")));

    private static final SubLObject $$Determiner_Definite = reader_make_constant_shell(makeString("Determiner-Definite"));

    private static final SubLObject $$Definite_NLAttr = reader_make_constant_shell(makeString("Definite-NLAttr"));

    private static final SubLObject $$PossessiveMarker = reader_make_constant_shell(makeString("PossessiveMarker"));

    private static final SubLObject $$Determiner_Indefinite = reader_make_constant_shell(makeString("Determiner-Indefinite"));

    private static final SubLObject $$Indefinite_NLAttr = reader_make_constant_shell(makeString("Indefinite-NLAttr"));

    private static final SubLObject $$BareForm_NLAttr = reader_make_constant_shell(makeString("BareForm-NLAttr"));

    private static final SubLObject $$Determiner = reader_make_constant_shell(makeString("Determiner"));

    private static final SubLObject $$NumericalQuant_NLAttrFn = reader_make_constant_shell(makeString("NumericalQuant-NLAttrFn"));

    private static final SubLSymbol $sym68$DET_DENOT_IS_SCALAR_INTERVAL__CACHED = makeSymbol("DET-DENOT-IS-SCALAR-INTERVAL?-CACHED");

    private static final SubLObject $$ScalarInterval = reader_make_constant_shell(makeString("ScalarInterval"));

    private static final SubLSymbol $sym70$_DET_DENOT_IS_SCALAR_INTERVAL__CACHED_CACHING_STATE_ = makeSymbol("*DET-DENOT-IS-SCALAR-INTERVAL?-CACHED-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol BAR_LEVEL_CACHED = makeSymbol("BAR-LEVEL-CACHED");

    private static final SubLObject $$PhraseFn_Bar1 = reader_make_constant_shell(makeString("PhraseFn-Bar1"));

    private static final SubLObject $$PhraseFn = reader_make_constant_shell(makeString("PhraseFn"));

    private static final SubLString $$$barLevelOfPhraseType = makeString("barLevelOfPhraseType");

    private static final SubLSymbol RELEVANT_PRED_IS_EVERYTHING = makeSymbol("RELEVANT-PRED-IS-EVERYTHING");

    private static final SubLSymbol $sym77$_LEVEL = makeSymbol("?LEVEL");

    private static final SubLObject $$barLevelOfPhraseType = reader_make_constant_shell(makeString("barLevelOfPhraseType"));

    private static final SubLList $list79 = list(makeSymbol("?LEVEL"));

    private static final SubLString $str80$Couldn_t_determine_bar_level_for_ = makeString("Couldn't determine bar-level for ~S in ~S. Using 1.~%");

    private static final SubLSymbol $bar_level_cached_caching_state$ = makeSymbol("*BAR-LEVEL-CACHED-CACHING-STATE*");

    private static final SubLSymbol POS_OF_CAT_CACHED = makeSymbol("POS-OF-CAT-CACHED");

    private static final SubLList $list83 = list(reader_make_constant_shell(makeString("PhraseFn-Bar1")), reader_make_constant_shell(makeString("PhraseFn")));

    private static final SubLObject $$NounPhrase = reader_make_constant_shell(makeString("NounPhrase"));

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLObject $$PrepositionalPhrase = reader_make_constant_shell(makeString("PrepositionalPhrase"));

    private static final SubLObject $$Preposition = reader_make_constant_shell(makeString("Preposition"));

    private static final SubLObject $$PossessivePhrase = reader_make_constant_shell(makeString("PossessivePhrase"));

    private static final SubLObject $$NLSentence = reader_make_constant_shell(makeString("NLSentence"));

    private static final SubLObject $$NLPhrase = reader_make_constant_shell(makeString("NLPhrase"));

    private static final SubLObject $$NLWordForm = reader_make_constant_shell(makeString("NLWordForm"));

    private static final SubLSymbol $sym92$_POS = makeSymbol("?POS");

    private static final SubLObject $$posOfPhraseType = reader_make_constant_shell(makeString("posOfPhraseType"));

    private static final SubLList $list94 = list(makeSymbol("?POS"));

    private static final SubLSymbol $pos_of_cat_cached_caching_state$ = makeSymbol("*POS-OF-CAT-CACHED-CACHING-STATE*");





    private static final SubLSymbol DENOTATUM_ARG_OF_PRED_CACHED_INT = makeSymbol("DENOTATUM-ARG-OF-PRED-CACHED-INT");

    private static final SubLObject $$denotatumArg = reader_make_constant_shell(makeString("denotatumArg"));

    private static final SubLSymbol $denotatum_arg_of_pred_cached_int_caching_state$ = makeSymbol("*DENOTATUM-ARG-OF-PRED-CACHED-INT-CACHING-STATE*");

    private static final SubLSymbol SEMTRANS_ARG_OF_PRED_CACHED_INT = makeSymbol("SEMTRANS-ARG-OF-PRED-CACHED-INT");

    private static final SubLObject $$semTransArg = reader_make_constant_shell(makeString("semTransArg"));

    private static final SubLSymbol $semtrans_arg_of_pred_cached_int_caching_state$ = makeSymbol("*SEMTRANS-ARG-OF-PRED-CACHED-INT-CACHING-STATE*");

    private static final SubLList $list104 = cons(makeSymbol("?PRED"), makeSymbol("?N"));

    private static final SubLList $list105 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?PRED"), reader_make_constant_shell(makeString("NLSemanticPredicate"))), list(reader_make_constant_shell(makeString("genlPreds")), makeSymbol("?PRED"), makeSymbol("?GENL-PRED")), list(reader_make_constant_shell(makeString("argIsa")), makeSymbol("?GENL-PRED"), makeSymbol("?N"), reader_make_constant_shell(makeString("SpeechPart"))));

    private static final SubLList $list106 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol GET_POS_ARG_OF_PRED_INT = makeSymbol("GET-POS-ARG-OF-PRED-INT");

    private static final SubLSymbol $get_pos_arg_of_pred_int_caching_state$ = makeSymbol("*GET-POS-ARG-OF-PRED-INT-CACHING-STATE*");

    private static final SubLSymbol FRAME_ARG_OF_PRED_CACHED_INT = makeSymbol("FRAME-ARG-OF-PRED-CACHED-INT");

    private static final SubLObject $$SubcategorizationFrame = reader_make_constant_shell(makeString("SubcategorizationFrame"));

    private static final SubLSymbol $sym112$SPEC_ = makeSymbol("SPEC?");

    private static final SubLSymbol $frame_arg_of_pred_cached_int_caching_state$ = makeSymbol("*FRAME-ARG-OF-PRED-CACHED-INT-CACHING-STATE*");

    private static final SubLObject $$partOfSpeech = reader_make_constant_shell(makeString("partOfSpeech"));

    private static final SubLSymbol WU_ARG_OF_PRED_CACHED_INT = makeSymbol("WU-ARG-OF-PRED-CACHED-INT");

    private static final SubLObject $$LexicalWord = reader_make_constant_shell(makeString("LexicalWord"));

    private static final SubLSymbol $wu_arg_of_pred_cached_int_caching_state$ = makeSymbol("*WU-ARG-OF-PRED-CACHED-INT-CACHING-STATE*");

    private static final SubLSymbol SENSE_ARG_OF_PRED_CACHED_INT = makeSymbol("SENSE-ARG-OF-PRED-CACHED-INT");

    private static final SubLObject $$Integer = reader_make_constant_shell(makeString("Integer"));

    private static final SubLSymbol $sense_arg_of_pred_cached_int_caching_state$ = makeSymbol("*SENSE-ARG-OF-PRED-CACHED-INT-CACHING-STATE*");

    private static final SubLSymbol STRINGLIST_ARGS_OF_PRED_CACHED_INT = makeSymbol("STRINGLIST-ARGS-OF-PRED-CACHED-INT");

    private static final SubLList $list122 = list(reader_make_constant_shell(makeString("ListOfTypeFn")), reader_make_constant_shell(makeString("SubLString")));

    private static final SubLList $list123 = list(reader_make_constant_shell(makeString("ListOfTypeFn")), reader_make_constant_shell(makeString("ControlCharacterFreeString")));

    private static final SubLList $list124 = list(makeSymbol("ARGNUM"), makeSymbol("COL"));

    private static final SubLObject $$argIsa = reader_make_constant_shell(makeString("argIsa"));

    private static final SubLList $list126 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLSymbol $sym127$_ = makeSymbol("<");

    private static final SubLSymbol $stringlist_args_of_pred_cached_int_caching_state$ = makeSymbol("*STRINGLIST-ARGS-OF-PRED-CACHED-INT-CACHING-STATE*");

    private static final SubLSymbol $sym129$_ = makeSymbol(">");

    private static final SubLSymbol DENOT_FORMULA_P = makeSymbol("DENOT-FORMULA-P");









    private static final SubLSymbol $sym135$STRING_ = makeSymbol("STRING=");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLList $list137 = list(cons(reader_make_constant_shell(makeString("pnSingular")), reader_make_constant_shell(makeString("singular"))), cons(reader_make_constant_shell(makeString("pnPlural")), reader_make_constant_shell(makeString("plural"))), cons(reader_make_constant_shell(makeString("pnMassNumber")), reader_make_constant_shell(makeString("massNumber"))), cons(reader_make_constant_shell(makeString("pnNonPlural-Generic")), reader_make_constant_shell(makeString("nonPlural-Generic"))), cons(reader_make_constant_shell(makeString("properNounStrings")), reader_make_constant_shell(makeString("commonNounStrings"))));

    private static final SubLObject $$ProperNoun = reader_make_constant_shell(makeString("ProperNoun"));

    private static final SubLObject $$CommonNoun = reader_make_constant_shell(makeString("CommonNoun"));

    private static final SubLObject $$SimpleNoun = reader_make_constant_shell(makeString("SimpleNoun"));

    private static final SubLObject $$singular = reader_make_constant_shell(makeString("singular"));

    private static final SubLObject $$plural = reader_make_constant_shell(makeString("plural"));

    private static final SubLObject $$massNumber = reader_make_constant_shell(makeString("massNumber"));

    private static final SubLObject $$pnSingular = reader_make_constant_shell(makeString("pnSingular"));

    private static final SubLObject $$pnPlural = reader_make_constant_shell(makeString("pnPlural"));

    private static final SubLObject $$pnMassNumber = reader_make_constant_shell(makeString("pnMassNumber"));

    private static final SubLObject $$agentive_Sg = reader_make_constant_shell(makeString("agentive-Sg"));

    private static final SubLObject $$agentive_Pl = reader_make_constant_shell(makeString("agentive-Pl"));

    private static final SubLObject $$agentive_Mass = reader_make_constant_shell(makeString("agentive-Mass"));

    private static final SubLObject $$infinitive = reader_make_constant_shell(makeString("infinitive"));

    private static final SubLString $str151$thirdPersonSg_Present = makeString("thirdPersonSg-Present");

    private static final SubLString $str152$thirdPersonSg_Generic = makeString("thirdPersonSg-Generic");

    private static final SubLString $str153$pastTense_Universal = makeString("pastTense-Universal");

    private static final SubLObject $$perfect = reader_make_constant_shell(makeString("perfect"));

    private static final SubLObject $$presentParticiple = reader_make_constant_shell(makeString("presentParticiple"));

    private static final SubLObject $$regularDegree = reader_make_constant_shell(makeString("regularDegree"));

    private static final SubLObject $$comparativeDegree = reader_make_constant_shell(makeString("comparativeDegree"));

    private static final SubLObject $$superlativeDegree = reader_make_constant_shell(makeString("superlativeDegree"));

    private static final SubLObject $$nonGradableAdjectiveForm = reader_make_constant_shell(makeString("nonGradableAdjectiveForm"));

    private static final SubLObject $$regularAdverb = reader_make_constant_shell(makeString("regularAdverb"));

    private static final SubLObject $$comparativeAdverb = reader_make_constant_shell(makeString("comparativeAdverb"));

    private static final SubLObject $$superlativeAdverb = reader_make_constant_shell(makeString("superlativeAdverb"));











    private static final SubLString $str168$_s_is_not_a_valid_mode_argument = makeString("~s is not a valid mode argument");



    private static final SubLString $str170$_s_is_not_a_valid_output_argument = makeString("~s is not a valid output argument");

    private static final SubLList $list171 = list(NIL);

    private static final SubLObject $$EnglishWord = reader_make_constant_shell(makeString("EnglishWord"));

    private static final SubLSymbol $sym173$DERIVED_PRED_ = makeSymbol("DERIVED-PRED?");

    private static final SubLString $str174$______NL_statistics______CycL__A_ = makeString("~%;;; NL statistics~%;;; CycL ~A, KB ~S.~D~%");



    private static final SubLString $str176$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str177$__Instances_of___EnglishWord____6 = makeString("~%Instances of #$EnglishWord : ~6,' D");

    private static final SubLString $str178$__Number_of_root_forms__________6 = makeString("~%Number of root forms       : ~6,' D~%");

    private static final SubLString $str179$____Grand_total____D____ = makeString("~%~%Grand total : ~D~%~%");

    private static final SubLString $str180$____Grand_total____D = makeString("~%~%Grand total : ~D");

    private static final SubLString $str181$Output_in__S = makeString("Output in ~S");

    private static final SubLString $str182$_cyc_departments_nl_doc_stats_kb = makeString("/cyc/departments/nl/doc/stats/kb");

    private static final SubLString $str183$_ = makeString(".");

    private static final SubLString $str184$_ = makeString("-");

    private static final SubLString $str185$_stats = makeString(".stats");

    private static final SubLObject $$NLPredicate = reader_make_constant_shell(makeString("NLPredicate"));

    public static final SubLList $list187 = list(makeSymbol("PRED-TYPE"), makeSymbol("INSTANCES"), makeSymbol("SUBTREES"));

    private static final SubLString $str188$____Instances_of__S_ = makeString("~%~%Instances of ~S:");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLString $str190$___A = makeString("~%~A");

    private static final SubLString $str191$___6___D = makeString(": ~6,' D");

    private static final SubLString $str192$__Total_for__S___D = makeString("~%Total for ~S: ~D");

    private static final SubLList $list193 = list(reader_make_constant_shell(makeString("OpenCycNLPredicate")));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLList $list197 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLSymbol NUM_PREDICATE_EXTENT_INDEX = makeSymbol("NUM-PREDICATE-EXTENT-INDEX");

    private static final SubLObject $$ProperNamePredicate_Loose = reader_make_constant_shell(makeString("ProperNamePredicate-Loose"));

    private static final SubLString $$$mapping_Cyc_FORTs = makeString("mapping Cyc FORTs");



    private static final SubLString $str202$__LOOSE___S___D_so_far___ = makeString("~&LOOSE: ~S (~D so far)~%");

    private static final SubLString $str203$__S = makeString(" ~S");





    private static final SubLString $str206$____Forts_with_real_lexification_ = makeString("~%~%Forts with real lexification:  ~6,' D~%");

    private static final SubLString $str207$____Forts_with_loose_lexification = makeString("~%~%Forts with loose lexification: ~6,' D~%");

    private static final SubLString $str208$____Forts_with_NO_lexification___ = makeString("~%~%Forts with NO lexification:    ~6,' D~%");

    private static final SubLObject $$ParseTemplatePredicate_Reln = reader_make_constant_shell(makeString("ParseTemplatePredicate-Reln"));

    private static final SubLList $list210 = list(reader_make_constant_shell(makeString("NLSemanticPredicate")), reader_make_constant_shell(makeString("NLGenerationPredicate")), reader_make_constant_shell(makeString("NLPragmaticPredicate")));



    private static final SubLSymbol CACHED_LEXIFICATIONS_FOR_TERM = makeSymbol("CACHED-LEXIFICATIONS-FOR-TERM");

    private static final SubLObject $$NLPragmaticPredicate = reader_make_constant_shell(makeString("NLPragmaticPredicate"));

    private static final SubLSymbol $cached_lexifications_for_term_caching_state$ = makeSymbol("*CACHED-LEXIFICATIONS-FOR-TERM-CACHING-STATE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol CLEAR_CACHED_LEXIFICATIONS_FOR_TERM = makeSymbol("CLEAR-CACHED-LEXIFICATIONS-FOR-TERM");

    private static final SubLObject $$genTemplate_QuerySentence = reader_make_constant_shell(makeString("genTemplate-QuerySentence"));

    private static final SubLSymbol $TOO_MANY_TO_CHECK = makeKeyword("TOO-MANY-TO-CHECK");



    private static final SubLObject $$NLSyntacticPredicate = reader_make_constant_shell(makeString("NLSyntacticPredicate"));

    private static final SubLObject $$LinguisticObjectType = reader_make_constant_shell(makeString("LinguisticObjectType"));

    private static final SubLObject $$CycLExpressionType = reader_make_constant_shell(makeString("CycLExpressionType"));



    private static final SubLString $str224$genStringAssertion_Terse = makeString("genStringAssertion-Terse");

    private static final SubLObject $$genStringAssertion = reader_make_constant_shell(makeString("genStringAssertion"));

    private static final SubLObject $$genStringAssertion_Precise = reader_make_constant_shell(makeString("genStringAssertion-Precise"));

    private static final SubLObject $$genStringAssertion_Terse = reader_make_constant_shell(makeString("genStringAssertion-Terse"));

    private static final SubLSymbol LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION = makeSymbol("LEXIFICATION-SENTENCE-FROM-PREFERRED-LEXIFICATION-ASSERTION");



    private static final SubLSymbol $sym230$PREFER_LEXICAL_ASSERTION_ = makeSymbol("PREFER-LEXICAL-ASSERTION?");

    private static final SubLSymbol $sym231$ATOMIC_SENTENCE_ = makeSymbol("ATOMIC-SENTENCE?");



    private static final SubLObject $$genStringAssertion_Constrained = reader_make_constant_shell(makeString("genStringAssertion-Constrained"));

    private static final SubLList $list234 = list(reader_make_constant_shell(makeString("preferredLexification")), reader_make_constant_shell(makeString("genStringAssertion")), reader_make_constant_shell(makeString("genStringAssertion-Constrained")));

    private static final SubLObject $$preferredNameString = reader_make_constant_shell(makeString("preferredNameString"));

    private static final SubLSymbol $sym236$PREFER_LEXIFICATION_ = makeSymbol("PREFER-LEXIFICATION?");

    private static final SubLSymbol $sym237$SPEC_POS_ = makeSymbol("SPEC-POS?");

    private static final SubLObject $$Pronoun = reader_make_constant_shell(makeString("Pronoun"));

    private static final SubLObject $$QuantifyingIndexical = reader_make_constant_shell(makeString("QuantifyingIndexical"));

    private static final SubLObject $$Complementizer = reader_make_constant_shell(makeString("Complementizer"));



    private static final SubLObject $$nameString = reader_make_constant_shell(makeString("nameString"));

    private static final SubLObject $$ProperNamePredicate_Stub = reader_make_constant_shell(makeString("ProperNamePredicate-Stub"));



    private static final SubLObject $$TheTerm = reader_make_constant_shell(makeString("TheTerm"));

    private static final SubLObject $$StubTerm = reader_make_constant_shell(makeString("StubTerm"));

    private static final SubLObject $$CycNounLearnerMt = reader_make_constant_shell(makeString("CycNounLearnerMt"));

    private static final SubLObject $$TestingConstant = reader_make_constant_shell(makeString("TestingConstant"));

    private static final SubLObject $$verbSemTrans = reader_make_constant_shell(makeString("verbSemTrans"));

    private static final SubLList $list250 = list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER);

    private static final SubLString $str251$___S_in__S__ = makeString("~&~S in ~S~%");

    private static final SubLObject $$posForms = reader_make_constant_shell(makeString("posForms"));



    private static final SubLObject $$multiWordString = reader_make_constant_shell(makeString("multiWordString"));

    private static final SubLObject $$compoundString = reader_make_constant_shell(makeString("compoundString"));

    private static final SubLString $str256$____a_has__a_denotations_in__a = makeString(";; ~a has ~a denotations in ~a");

    private static final SubLString $str257$___without_appropriate___posForms = makeString(";; without appropriate #$posForms in #$GeneralEnglishMt or elsewhere");

    private static final SubLString $str258$_ke_assert____a__a___a____a__DEFA = makeString("(ke-assert \'(~a ~a \"~a\") ~a :DEFAULT :FORWARD)");

    private static final SubLList $list259 = list(reader_make_constant_shell(makeString("CountNoun")), reader_make_constant_shell(makeString("MassNoun")), reader_make_constant_shell(makeString("ProperMassNoun")), reader_make_constant_shell(makeString("ProperCountNoun")), reader_make_constant_shell(makeString("AgentiveNoun")), reader_make_constant_shell(makeString("Verb")), reader_make_constant_shell(makeString("Adjective")), reader_make_constant_shell(makeString("Adverb")));

    private static final SubLObject $$StringIndexingSlot = reader_make_constant_shell(makeString("StringIndexingSlot"));

    private static final SubLString $str261$___S_in__S____ = makeString("~&~S in ~S~%~%");

    private static final SubLSymbol CONTROL_CHAR_P = makeSymbol("CONTROL-CHAR-P");

    private static final SubLString $str263$___S__ = makeString("~&~S~%");

    private static final SubLString $str264$__fort_type__lex_asserts__ = makeString("; fort\ttype\t#lex-asserts~%");

    private static final SubLString $str265$_s__s__s__ = makeString("~s\t~s\t~s~%");

    private static final SubLObject $$NLGenerationPredicate = reader_make_constant_shell(makeString("NLGenerationPredicate"));

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));

    private static final SubLSymbol PARSE_MORPHOLOGICALLY_OPTION_P = makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P");





    private static final SubLString $str271$Determiner_Central = makeString("Determiner-Central");



    private static final SubLObject $$WHWord = reader_make_constant_shell(makeString("WHWord"));

    private static final SubLObject $$nameSpelling = reader_make_constant_shell(makeString("nameSpelling"));

    private static final SubLSymbol $sym275$_NAME = makeSymbol("?NAME");

    private static final SubLObject $$NameLexicalMt = reader_make_constant_shell(makeString("NameLexicalMt"));

    private static final SubLObject $$commonNickname = reader_make_constant_shell(makeString("commonNickname"));

    private static final SubLSymbol HUMAN_MALE_GIVEN_NAME_P = makeSymbol("HUMAN-MALE-GIVEN-NAME-P");

    private static final SubLSymbol HUMAN_FEMALE_GIVEN_NAME_P = makeSymbol("HUMAN-FEMALE-GIVEN-NAME-P");









    private static final SubLObject $$HumanMaleGivenName = reader_make_constant_shell(makeString("HumanMaleGivenName"));

    private static final SubLObject $$HumanFemaleGivenName = reader_make_constant_shell(makeString("HumanFemaleGivenName"));





    private static final SubLObject $$WordWithPrefixFn = reader_make_constant_shell(makeString("WordWithPrefixFn"));

    private static final SubLObject $$WordWithSuffixFn = reader_make_constant_shell(makeString("WordWithSuffixFn"));

    private static final SubLObject $$AllLexicalMicrotheoryPSC = reader_make_constant_shell(makeString("AllLexicalMicrotheoryPSC"));

    private static final SubLSymbol $sym291$DERIVED_WORD_ = makeSymbol("DERIVED-WORD?");

    private static final SubLSymbol DERIVED_WORD_AFFIX_MEMOIZED = makeSymbol("DERIVED-WORD-AFFIX-MEMOIZED");

    private static final SubLSymbol $sym293$_AFFIX = makeSymbol("?AFFIX");

    private static final SubLObject $$derivedUsingAffix = reader_make_constant_shell(makeString("derivedUsingAffix"));

    private static final SubLList $list295 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLObject $$LexicalPrefix = reader_make_constant_shell(makeString("LexicalPrefix"));

    private static final SubLSymbol STOP_WORD_CLOSED_CLASS_EXCEPTION = makeSymbol("STOP-WORD-CLOSED-CLASS-EXCEPTION");

    private static final SubLSymbol $stop_word_closed_class_exception_caching_state$ = makeSymbol("*STOP-WORD-CLOSED-CLASS-EXCEPTION-CACHING-STATE*");



    public static final SubLList $list300 = list(list(reader_make_constant_shell(makeString("TransitiveNPFrame")), makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT")), list(reader_make_constant_shell(makeString("IntransitiveVerbFrame")), makeKeyword("ACTION"), makeKeyword("SUBJECT")));



    private static final SubLList $list302 = list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("TEST"), makeSymbol("KEYWORDP")), makeKeyword("FORT"));



    private static final SubLList $list304 = list(list(makeKeyword("TEST"), makeSymbol("KEYWORDP")));

    private static final SubLSymbol CYCL_REPRESENTED_TERM_P = makeSymbol("CYCL-REPRESENTED-TERM-P");



    private static final SubLSymbol CLEAR_LEXICONS_TO_LANGUAGES = makeSymbol("CLEAR-LEXICONS-TO-LANGUAGES");

    private static final SubLList $list308 = list(makeSymbol("MT"), makeSymbol("LANGUAGE"));

    private static final SubLList $list309 = list(makeSymbol("?MT"), makeSymbol("?LANGUAGE"));

    private static final SubLList $list310 = list(reader_make_constant_shell(makeString("mtLanguage")), makeSymbol("?MT"), makeSymbol("?LANGUAGE"));

    private static final SubLList $list311 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLSymbol LEXICAL_MT_FOR_LANGUAGE = makeSymbol("LEXICAL-MT-FOR-LANGUAGE");



    private static final SubLObject $$languageHasRootLexicon = reader_make_constant_shell(makeString("languageHasRootLexicon"));

    private static final SubLList $list315 = list(makeKeyword("MT"));

    private static final SubLSymbol $lexical_mt_for_language_caching_state$ = makeSymbol("*LEXICAL-MT-FOR-LANGUAGE-CACHING-STATE*");



    private static final SubLSymbol CLEAR_LEXICAL_MT_FOR_LANGUAGE = makeSymbol("CLEAR-LEXICAL-MT-FOR-LANGUAGE");

    private static final SubLSymbol GET_LANGUAGE_FOR_CODE = makeSymbol("GET-LANGUAGE-FOR-CODE");



    private static final SubLObject $$languageCodeDigraph = reader_make_constant_shell(makeString("languageCodeDigraph"));

    private static final SubLObject $$CrossLinguisticLexicalMt = reader_make_constant_shell(makeString("CrossLinguisticLexicalMt"));

    private static final SubLSymbol $get_language_for_code_caching_state$ = makeSymbol("*GET-LANGUAGE-FOR-CODE-CACHING-STATE*");

    private static final SubLSymbol GET_CODE_FOR_LANGUAGE = makeSymbol("GET-CODE-FOR-LANGUAGE");



    private static final SubLList $list326 = list(makeKeyword("CODE"));

    private static final SubLSymbol $get_code_for_language_caching_state$ = makeSymbol("*GET-CODE-FOR-LANGUAGE-CACHING-STATE*");

    public static SubLObject mwwP(final SubLObject v_object) {
        return makeBoolean(((NIL != constant_p(v_object)) && (NIL == nart_handles.nart_p(v_object))) && (NIL != string_utilities.ends_with(constants_high.constant_name(v_object), $$$MWW, UNPROVIDED)));
    }

    public static SubLObject next_available_ws(final SubLObject word_unit, final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject senses = lexicon_accessors.senses_of_wuXpos(word_unit, pos, mt);
        return lowest_not_in_list(ZERO_INTEGER, senses);
    }

    public static SubLObject unique_ws(final SubLObject wu, final SubLObject pos, SubLObject denot) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(wu) : "cycl_grammar.cycl_denotational_term_p(wu) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(wu) " + wu;
        assert NIL != forts.fort_p(pos) : "forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) " + pos;
        if ((NIL == forts.fort_p(denot)) && (NIL != possibly_naut_p(denot))) {
            denot = czer_main.cyc_find_or_create_nart(denot, UNPROVIDED);
        }
        assert NIL != forts.fort_p(denot) : "forts.fort_p(denot) " + "CommonSymbols.NIL != forts.fort_p(denot) " + denot;
        SubLObject cdolist_list_var;
        final SubLObject existing_senses = cdolist_list_var = lexicon_accessors.senses_of_wuXpos(wu, pos, UNPROVIDED);
        SubLObject sense = NIL;
        sense = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject existing_denots = Mapping.mapcar(symbol_function(CAR), lexicon_accessors.denots_of_sense_by_mt(wu, pos, sense, $ANY));
            if (NIL != subl_promotions.memberP(denot, existing_denots, UNPROVIDED, UNPROVIDED)) {
                return sense;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sense = cdolist_list_var.first();
        } 
        SubLObject sense2;
        for (sense2 = NIL, sense2 = ZERO_INTEGER; NIL != subl_promotions.memberP(sense2, existing_senses, UNPROVIDED, UNPROVIDED); sense2 = add(ONE_INTEGER, sense2)) {
        }
        return sense2;
    }

    public static SubLObject ws_availableP(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(NIL == subl_promotions.memberP(v_int, lexicon_accessors.senses_of_wuXpos(word_unit, pos, mt), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject lowest_not_in_list(final SubLObject n, final SubLObject ints) {
        if (NIL != subl_promotions.memberP(n, ints, UNPROVIDED, UNPROVIDED)) {
            return lowest_not_in_list(add(ONE_INTEGER, n), ints);
        }
        return n;
    }

    public static SubLObject suggest_word_unit(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject word_unit_root = string_utilities.make_valid_constant_name(string, T);
        final SubLObject multi_wordP = find(CHAR_space, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != multi_wordP) {
            return cconcatenate(word_unit_root, $str7$_MWW);
        }
        return cconcatenate(word_unit_root, $str8$_TheWord);
    }

    public static SubLObject word_prop(final SubLObject word_unit, final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return kb_mapping_utilities.fpred_value_in_mt(word_unit, predicate, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject set_word_prop(final SubLObject word_unit, final SubLObject predicate, final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        final SubLObject existing = word_prop(word_unit, predicate, UNPROVIDED);
        if ((NIL != existing) && ((NIL == string) || (NIL == Strings.string_equal(existing, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
            ke.ke_unassert(list(predicate, word_unit, existing), mt);
        }
        if (NIL != string) {
            misc_kb_utilities.try_assert(list(predicate, word_unit, string), mt, $MONOTONIC, UNPROVIDED);
        }
        return string;
    }

    public static SubLObject check_denot(final SubLObject word_unit, final SubLObject pos, final SubLObject sense, final SubLObject unit, SubLObject mt, SubLObject denot_type) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        final SubLObject predicate = lexicon_accessors.determine_denotation_pred(denot_type);
        final SubLObject formula = make_quaternary_formula(predicate, word_unit, pos, sense, unit);
        if (NIL == wff.el_wffP(formula, mt, UNPROVIDED)) {
            return values(NIL, wff.explanation_of_why_not_wff(formula, mt, UNPROVIDED));
        }
        return values(T, $str12$);
    }

    public static SubLObject set_denot(final SubLObject word_unit, final SubLObject pos, final SubLObject sense, final SubLObject unit, SubLObject mt, SubLObject denot_type) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        final SubLObject predicate = lexicon_accessors.determine_denotation_pred(denot_type);
        final SubLObject other_denot_type = (denot_type == $DENOT) ? $RELATED : $DENOT;
        final SubLObject other_predicate = lexicon_accessors.determine_denotation_pred(other_denot_type);
        SubLObject result = NIL;
        misc_kb_utilities.try_unassert(make_quaternary_formula(other_predicate, word_unit, pos, sense, unit), mt);
        if (NIL != kb_utilities.kbeq(predicate, $$denotation)) {
            SubLObject cdolist_list_var = lexicon_accessors.denots_of_sense(word_unit, pos, sense, UNPROVIDED);
            SubLObject existing_unit = NIL;
            existing_unit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == kb_utilities.kbeq(existing_unit, unit)) {
                    misc_kb_utilities.try_unassert(make_quaternary_formula($$denotation, word_unit, pos, sense, existing_unit), mt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                existing_unit = cdolist_list_var.first();
            } 
        }
        if (NIL != unit) {
            result = misc_kb_utilities.try_assert(make_quaternary_formula(predicate, word_unit, pos, sense, unit), mt, $MONOTONIC, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject add_frame(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, final SubLObject unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        if (NIL != forts.fort_p(unit)) {
            ke.ke_assert(list($$subcatFrame, word_unit, pos, v_int, unit), mt, $MONOTONIC, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject remove_frame(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, final SubLObject unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        if (NIL != forts.fort_p(unit)) {
            ke.ke_unassert(list($$subcatFrame, word_unit, pos, v_int, unit), mt);
        }
        return NIL;
    }

    public static SubLObject set_frames(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, final SubLObject frame_list, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        final SubLObject existing = lexicon_accessors.frames_of_sense(word_unit, pos, v_int, UNPROVIDED);
        final SubLObject to_removes = set_difference(existing, frame_list, UNPROVIDED, UNPROVIDED);
        final SubLObject to_adds = set_difference(frame_list, existing, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = to_removes;
        SubLObject to_remove = NIL;
        to_remove = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            remove_frame(word_unit, pos, v_int, to_remove, mt);
            cdolist_list_var = cdolist_list_var.rest();
            to_remove = cdolist_list_var.first();
        } 
        cdolist_list_var = to_adds;
        SubLObject to_add = NIL;
        to_add = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_frame(word_unit, pos, v_int, to_add, mt);
            cdolist_list_var = cdolist_list_var.rest();
            to_add = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject frame_lookup(final SubLObject string, final SubLObject word_unit, final SubLObject speech_part) {
        return lexicon_accessors.frames_of_wordXpos(word_unit, speech_part);
    }

    public static SubLObject preds_of_pos(final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return NIL != kb_loaded() ? copy_list(preds_of_pos_cached(pos, mt)) : NIL;
    }

    public static SubLObject clear_preds_of_pos() {
        return clear_preds_of_pos_cached();
    }

    public static SubLObject clear_preds_of_pos_cached() {
        final SubLObject cs = $preds_of_pos_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_preds_of_pos_cached(final SubLObject pos, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($preds_of_pos_cached_caching_state$.getGlobalValue(), list(pos, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject preds_of_pos_cached_internal(final SubLObject pos, final SubLObject mt) {
        return preds_of_pos_int(pos, mt, set.new_set(UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject preds_of_pos_cached(final SubLObject pos, final SubLObject mt) {
        SubLObject caching_state = $preds_of_pos_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PREDS_OF_POS_CACHED, $preds_of_pos_cached_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
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
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(preds_of_pos_cached_internal(pos, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pos, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject preds_of_pos_int(final SubLObject pos, final SubLObject mt, SubLObject done) {
        if (done == UNPROVIDED) {
            done = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        SubLObject preds = preds_of_pos_lookup(pos);
        if (NIL == preds) {
            SubLObject cdolist_list_var = genls.genls(pos, mt, UNPROVIDED);
            SubLObject genl_pos = NIL;
            genl_pos = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != lexicon_accessors.speech_partP(genl_pos, mt)) && (NIL == set.set_memberP(genl_pos, done))) {
                    set.set_add(genl_pos, done);
                    preds = append(preds, preds_of_pos_int(genl_pos, mt, done));
                }
                cdolist_list_var = cdolist_list_var.rest();
                genl_pos = cdolist_list_var.first();
            } 
        }
        return delete_duplicates(preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject preds_of_pos_lookup(final SubLObject pos) {
        return kb_mapping_utilities.pred_values_in_any_mt(pos, $$speechPartPreds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ordered_lexification_preds_of_pos(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pos.eql($$CountNoun)) {
            return lexicon_vars.$noun_predicates$.getDynamicValue(thread);
        }
        if (pos.eql($$MassNoun)) {
            return lexicon_vars.$mass_predicates$.getDynamicValue(thread);
        }
        if (pos.eql($$AgentiveNoun)) {
            return lexicon_vars.$agentive_preds$.getDynamicValue(thread);
        }
        if (pos.eql($$ProperMassNoun)) {
            return lexicon_vars.$pn_mass_predicates$.getDynamicValue(thread);
        }
        if (pos.eql($$ProperCountNoun)) {
            return lexicon_vars.$pn_count_predicates$.getDynamicValue(thread);
        }
        if (pos.eql($$Verb)) {
            return lexicon_vars.$verb_predicates$.getDynamicValue(thread);
        }
        if (pos.eql($$Adjective)) {
            return lexicon_vars.$adjective_predicates$.getDynamicValue(thread);
        }
        if (pos.eql($$Adverb)) {
            return lexicon_vars.$adverb_predicates$.getDynamicValue(thread);
        }
        return kb_mapping_utilities.pred_values_in_any_mt(pos, $$speechPartPreds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ordered_preds_of_pos(final SubLObject pos) {
        return ordered_lexification_preds_of_pos(pos);
    }

    public static SubLObject preds_licensed_by_pos(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != kb_loaded() ? copy_list(preds_licensed_by_pos_cached(pos, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread))) : NIL;
    }

    public static SubLObject clear_preds_licensed_by_pos() {
        return clear_preds_licensed_by_pos_cached();
    }

    public static SubLObject clear_preds_licensed_by_pos_cached() {
        final SubLObject cs = $preds_licensed_by_pos_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_preds_licensed_by_pos_cached(final SubLObject pos, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($preds_licensed_by_pos_cached_caching_state$.getGlobalValue(), list(pos, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject preds_licensed_by_pos_cached_internal(final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = preds_of_pos(pos, mt);
        if (NIL != lexicon_accessors.genl_posP($$Verb, pos, mt)) {
            final SubLObject item_var = $$gerund;
            if (NIL == member(item_var, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                preds = cons(item_var, preds);
            }
        } else
            if (NIL != lexicon_accessors.genl_posP($$CountNoun, pos, mt)) {
                preds = append(preds, preds_of_pos($$ProperCountNoun, mt));
            }

        SubLObject cdolist_list_var = copy_list(preds);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = preds_coercible_from_pred(pred);
            SubLObject coercible_pred = NIL;
            coercible_pred = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject item_var2 = coercible_pred;
                if (NIL == member(item_var2, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                    preds = cons(item_var2, preds);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                coercible_pred = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            preds = Sort.sort(preds, $sym29$SPP_MORE_BASIC_, UNPROVIDED);
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }

    public static SubLObject preds_licensed_by_pos_cached(final SubLObject pos, final SubLObject mt) {
        SubLObject caching_state = $preds_licensed_by_pos_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PREDS_LICENSED_BY_POS_CACHED, $preds_licensed_by_pos_cached_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$32);
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
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(preds_licensed_by_pos_cached_internal(pos, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pos, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject preds_coercible_from_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject coercible_preds = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                    for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$10 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject genl_pred = node_var_$10;
                                        final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$10)) {
                                                SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(genl_pred, $$paraphraseCoercionAllowedFrom, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                                SubLObject coercible_pred = NIL;
                                                coercible_pred = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject item_var = coercible_pred;
                                                    if (NIL == member(item_var, coercible_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        coercible_preds = cons(item_var, coercible_preds);
                                                    }
                                                    SubLObject cdolist_list_var_$12 = preds_derivable_from_pred(coercible_pred);
                                                    SubLObject derivable_pred = NIL;
                                                    derivable_pred = cdolist_list_var_$12.first();
                                                    while (NIL != cdolist_list_var_$12) {
                                                        final SubLObject item_var2 = derivable_pred;
                                                        if (NIL == member(item_var2, coercible_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            coercible_preds = cons(item_var2, coercible_preds);
                                                        }
                                                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                                        derivable_pred = cdolist_list_var_$12.first();
                                                    } 
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    coercible_pred = cdolist_list_var.first();
                                                } 
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$10);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$16;
                                                                            for (iteration_state_$16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$16); iteration_state_$16 = dictionary_contents.do_dictionary_contents_next(iteration_state_$16)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$16);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$9, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$16);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$8, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$13;
                                                            final SubLObject new_list = cdolist_list_var_$13 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$13.first();
                                                            while (NIL != cdolist_list_var_$13) {
                                                                final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$10, thread);
                                                                }
                                                                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                                                generating_fn = cdolist_list_var_$13.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$7, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var = cdolist_list_var2.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$9, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$6, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$5, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$5, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$4, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$4, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$3, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return coercible_preds;
    }

    public static SubLObject preds_derivable_from_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject derivable_preds = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0_$21 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$25 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                    for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$29 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject genl_pred = node_var_$29;
                                        final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$29)) {
                                                derivable_preds = nconc(derivable_preds, kb_mapping_utilities.pred_values(genl_pred, $$regularSuffix, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$29);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$34;
                                                                            for (iteration_state_$34 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$34); iteration_state_$34 = dictionary_contents.do_dictionary_contents_next(iteration_state_$34)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$34);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$28, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$34);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$27, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$36;
                                                            final SubLObject new_list = cdolist_list_var_$36 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$36.first();
                                                            while (NIL != cdolist_list_var_$36) {
                                                                final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$29, thread);
                                                                }
                                                                cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                                                                generating_fn = cdolist_list_var_$36.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$26, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$26, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$25, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$28, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$25, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$24, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$24, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$23, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$23, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$22, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$21, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return derivable_preds;
    }

    public static SubLObject filter_lexicon_preds(final SubLObject preds1, final SubLObject preds2, SubLObject mt, SubLObject remove_subsumed_itemsP) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (remove_subsumed_itemsP == UNPROVIDED) {
            remove_subsumed_itemsP = T;
        }
        SubLObject filtered_preds = NIL;
        SubLObject cdolist_list_var = preds1;
        SubLObject pred1 = NIL;
        pred1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$39 = preds2;
            SubLObject pred2 = NIL;
            pred2 = cdolist_list_var_$39.first();
            while (NIL != cdolist_list_var_$39) {
                SubLObject cdolist_list_var_$40 = filter_two_lexicon_preds(pred1, pred2, mt);
                SubLObject filtered = NIL;
                filtered = cdolist_list_var_$40.first();
                while (NIL != cdolist_list_var_$40) {
                    final SubLObject item_var = filtered;
                    if (NIL == member(item_var, filtered_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                        filtered_preds = cons(item_var, filtered_preds);
                    }
                    cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                    filtered = cdolist_list_var_$40.first();
                } 
                cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                pred2 = cdolist_list_var_$39.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pred1 = cdolist_list_var.first();
        } 
        if (NIL != remove_subsumed_itemsP) {
            filtered_preds = list_utilities.remove_subsumed_items(filtered_preds, $sym51$SPEC_POS_PRED_, UNPROVIDED);
        } else {
            filtered_preds = list_utilities.remove_duplicates_from_end(filtered_preds, symbol_function(KBEQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        filtered_preds = nreverse(filtered_preds);
        return filtered_preds;
    }

    public static SubLObject filter_two_lexicon_preds(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (NIL != kb_utilities.kbeq(pred1, pred2)) {
            return list(pred1);
        }
        if (NIL != kb_utilities.kbeq(pred1, $$termStrings)) {
            return list(pred2);
        }
        if (NIL != kb_utilities.kbeq(pred2, $$termStrings)) {
            return list(pred1);
        }
        if (((NIL != lexicon_vars.name_string_predP(pred1)) && (NIL == lexicon_accessors.genl_pos_predP(pred2, $$plural_Generic, UNPROVIDED))) && (NIL != lexicon_accessors.genl_pos_predP(pred2, $$nounStrings, UNPROVIDED))) {
            return list(pred1);
        }
        if (((NIL != lexicon_vars.name_string_predP(pred2)) && (NIL == lexicon_accessors.genl_pos_predP(pred1, $$plural_Generic, UNPROVIDED))) && (NIL != lexicon_accessors.genl_pos_predP(pred1, $$nounStrings, UNPROVIDED))) {
            return list(pred2);
        }
        if ((NIL != pph_utilities.pph_speech_part_predP(pred1)) && (NIL != pph_utilities.pph_speech_part_predP(pred2))) {
            return pph_utilities.pph_max_spec_speech_part_preds(list(pred1, pred2), mt, UNPROVIDED);
        }
        return genl_predicates.max_floor_predicates(list(pred1, pred2), NIL, mt, UNPROVIDED);
    }

    public static SubLObject spp_more_basicP(final SubLObject spp1, final SubLObject spp2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return NIL != kb_loaded() ? spp_more_basicP_cached(spp1, spp2, mt) : NIL;
    }

    public static SubLObject clear_spp_more_basicP_cached() {
        final SubLObject cs = $spp_more_basicP_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_spp_more_basicP_cached(final SubLObject spp1, final SubLObject spp2, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($spp_more_basicP_cached_caching_state$.getGlobalValue(), list(spp1, spp2, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject spp_more_basicP_cached_internal(final SubLObject spp1, final SubLObject spp2, final SubLObject mt) {
        if (NIL != kb_utilities.kbeq(spp1, spp2)) {
            return NIL;
        }
        if (NIL != lexicon_accessors.genl_pos_predP(spp1, spp2, mt)) {
            return T;
        }
        if (NIL != kb_utilities.kbeq(spp1, common_noun_form_of_pred(spp2))) {
            return T;
        }
        if (NIL == lexicon_accessors.derived_predP(spp1, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject spp_more_basicP_cached(final SubLObject spp1, final SubLObject spp2, final SubLObject mt) {
        SubLObject caching_state = $spp_more_basicP_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym56$SPP_MORE_BASIC__CACHED, $sym57$_SPP_MORE_BASIC__CACHED_CACHING_STATE_, NIL, EQL, THREE_INTEGER, $int$64);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(spp1, spp2, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (spp1.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (spp2.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(spp_more_basicP_cached_internal(spp1, spp2, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(spp1, spp2, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject spp_assertion_string(final SubLObject ass) {
        return cycl_string.cycl_string_to_utf8_string(assertions_high.gaf_arg2(ass));
    }

    public static SubLObject preds_for_keyword(final SubLObject pos_keyword) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = lexicon_accessors.pos_for_keyword(pos_keyword, UNPROVIDED);
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$41 = preds_of_pos(pos, UNPROVIDED);
            SubLObject pred = NIL;
            pred = cdolist_list_var_$41.first();
            while (NIL != cdolist_list_var_$41) {
                final SubLObject item_var = pred;
                if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                    result = cons(item_var, result);
                }
                cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                pred = cdolist_list_var_$41.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject ordered_lexification_preds_for_keyword(final SubLObject pos_keyword) {
        final SubLObject ordered_preds = append($list59, lexicon_vars.all_lexicon_string_predicates());
        return list_utilities.ordered_intersection(ordered_preds, preds_for_keyword(pos_keyword), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ordered_preds_for_keyword(final SubLObject pos_keyword) {
        return ordered_lexification_preds_for_keyword(pos_keyword);
    }

    public static SubLObject nl_def_attributes_for_string(final SubLObject string, SubLObject denots) {
        if (denots == UNPROVIDED) {
            denots = NIL;
        }
        SubLObject attr = NIL;
        SubLObject cdolist_list_var = lexicon_accessors.pos_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = nl_def_attributes_for_pos(pos, denots);
            if (NIL != var) {
                final SubLObject item_var = var;
                if (NIL == member(item_var, attr, symbol_function(EQL), symbol_function(IDENTITY))) {
                    attr = cons(item_var, attr);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return attr;
    }

    public static SubLObject nl_def_attributes_for_pos(final SubLObject pos, SubLObject denots) {
        if (denots == UNPROVIDED) {
            denots = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject attr = NIL;
        if (NIL != genls.genl_ofP($$Determiner_Definite, pos, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), UNPROVIDED)) {
            attr = cons($$Definite_NLAttr, attr);
        } else
            if (NIL != genls.genl_ofP($$PossessiveMarker, pos, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), UNPROVIDED)) {
                attr = nl_def_attributes_for_possessive_denots(denots);
            } else
                if (NIL != genls.genl_ofP($$Determiner_Indefinite, pos, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), UNPROVIDED)) {
                    attr = cons($$Indefinite_NLAttr, attr);
                }


        return attr;
    }

    public static SubLObject nl_def_attributes_for_possessive_denots(final SubLObject denots) {
        SubLObject attr = NIL;
        SubLObject cdolist_list_var = denots;
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cycl_utilities.expression_find($$Indefinite_NLAttr, denot, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                final SubLObject item_var = $$Indefinite_NLAttr;
                if (NIL == member(item_var, attr, symbol_function(EQL), symbol_function(IDENTITY))) {
                    attr = cons(item_var, attr);
                }
            }
            if (NIL != cycl_utilities.expression_find($$Definite_NLAttr, denot, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                final SubLObject item_var = $$Definite_NLAttr;
                if (NIL == member(item_var, attr, symbol_function(EQL), symbol_function(IDENTITY))) {
                    attr = cons(item_var, attr);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        } 
        if (NIL == attr) {
            attr = cons($$Definite_NLAttr, attr);
        }
        return attr;
    }

    public static SubLObject nl_quant_attributes_for_string(final SubLObject string, SubLObject denots) {
        if (denots == UNPROVIDED) {
            denots = NIL;
        }
        if (NIL != Strings.stringE(string, $str12$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list($$BareForm_NLAttr);
        }
        if (NIL == denots) {
            denots = lexicon_accessors.denots_of_stringXspeech_part(string, $$Determiner, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return nl_quant_attributes_for_denots(denots);
    }

    public static SubLObject nl_quant_attributes_for_denots(final SubLObject det_denots) {
        SubLObject nlqas = NIL;
        SubLObject cdolist_list_var = det_denots;
        SubLObject det_denot = NIL;
        det_denot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.nl_quant_attributeP(det_denot)) {
                nlqas = cons(det_denot, nlqas);
            } else
                if (NIL == fort_types_interface.nl_definiteness_attributeP(det_denot)) {
                    final SubLObject var = nl_numerical_quant_for_denot(det_denot);
                    if (NIL != var) {
                        nlqas = cons(var, nlqas);
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            det_denot = cdolist_list_var.first();
        } 
        return nlqas;
    }

    public static SubLObject nl_numerical_quant_for_denot(final SubLObject denot) {
        if (denot.isNumber() || (NIL != det_denot_is_scalar_intervalP(denot))) {
            return list($$NumericalQuant_NLAttrFn, denot);
        }
        return NIL;
    }

    public static SubLObject det_denot_is_scalar_intervalP(final SubLObject det_denot) {
        return NIL != kb_loaded() ? det_denot_is_scalar_intervalP_cached(det_denot) : NIL;
    }

    public static SubLObject clear_det_denot_is_scalar_intervalP_cached() {
        final SubLObject cs = $det_denot_is_scalar_intervalP_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_det_denot_is_scalar_intervalP_cached(final SubLObject det_denot) {
        return memoization_state.caching_state_remove_function_results_with_args($det_denot_is_scalar_intervalP_cached_caching_state$.getGlobalValue(), list(det_denot), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject det_denot_is_scalar_intervalP_cached_internal(final SubLObject det_denot) {
        return at_defns.quiet_has_typeP(det_denot, $$ScalarInterval, UNPROVIDED);
    }

    public static SubLObject det_denot_is_scalar_intervalP_cached(final SubLObject det_denot) {
        SubLObject caching_state = $det_denot_is_scalar_intervalP_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym68$DET_DENOT_IS_SCALAR_INTERVAL__CACHED, $sym70$_DET_DENOT_IS_SCALAR_INTERVAL__CACHED_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, $int$128);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, det_denot, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(det_denot_is_scalar_intervalP_cached_internal(det_denot)));
            memoization_state.caching_state_put(caching_state, det_denot, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject maximal_bar_level(final SubLObject cat1, final SubLObject cat2) {
        final SubLObject level1 = bar_level(cat1, UNPROVIDED);
        final SubLObject level2 = bar_level(cat2, UNPROVIDED);
        if (!level1.isInteger()) {
            return level2;
        }
        if (!level2.isInteger()) {
            return level1;
        }
        return number_utilities.maximum(list(level1, level2), UNPROVIDED);
    }

    public static SubLObject bar_level(final SubLObject cat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return NIL != kb_loaded() ? bar_level_cached(cat, mt) : NIL;
    }

    public static SubLObject clear_bar_level() {
        return clear_bar_level_cached();
    }

    public static SubLObject remove_bar_level(final SubLObject cat, final SubLObject mt) {
        return remove_bar_level_cached(cat, mt);
    }

    public static SubLObject clear_bar_level_cached() {
        final SubLObject cs = $bar_level_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_bar_level_cached(final SubLObject cat, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($bar_level_cached_caching_state$.getGlobalValue(), list(cat, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject bar_level_cached_internal(final SubLObject cat, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != lexicon_accessors.speech_partP(cat, UNPROVIDED)) {
            return ZERO_INTEGER;
        }
        if (NIL != kb_utilities.kbeq(cycl_utilities.nat_functor(cat), $$PhraseFn_Bar1)) {
            return ONE_INTEGER;
        }
        if (NIL != kb_utilities.kbeq(cycl_utilities.nat_functor(cat), $$PhraseFn)) {
            return TWO_INTEGER;
        }
        if (NIL == valid_constantP(constants_high.find_constant($$$barLevelOfPhraseType), UNPROVIDED)) {
            return NIL;
        }
        SubLObject query_result = NIL;
        final SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        try {
            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EVERYTHING, thread);
            query_result = ask_utilities.ask_variable($sym77$_LEVEL, listS($$barLevelOfPhraseType, cat, $list79), mt, ONE_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
        } finally {
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != query_result) {
            return query_result;
        }
        Errors.warn($str80$Couldn_t_determine_bar_level_for_, cat, mt);
        remove_bar_level(cat, mt);
        return ONE_INTEGER;
    }

    public static SubLObject bar_level_cached(final SubLObject cat, final SubLObject mt) {
        SubLObject caching_state = $bar_level_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(BAR_LEVEL_CACHED, $bar_level_cached_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(cat, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cat.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(bar_level_cached_internal(cat, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cat, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pos_of_cat(final SubLObject cat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return NIL != kb_loaded() ? pos_of_cat_cached(cat, mt) : NIL;
    }

    public static SubLObject clear_pos_of_cat_cached() {
        final SubLObject cs = $pos_of_cat_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_pos_of_cat_cached(final SubLObject cat, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($pos_of_cat_cached_caching_state$.getGlobalValue(), list(cat, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pos_of_cat_cached_internal(final SubLObject cat, final SubLObject mt) {
        if (NIL != lexicon_accessors.speech_partP(cat, UNPROVIDED)) {
            return cat;
        }
        if (NIL != member(cycl_utilities.nat_functor(cat), $list83, UNPROVIDED, UNPROVIDED)) {
            return cycl_utilities.nat_arg1(cat, UNPROVIDED);
        }
        if (NIL != kb_utilities.kbeq(cat, $$NounPhrase)) {
            return $$Noun;
        }
        if (NIL != kb_utilities.kbeq(cat, $$PrepositionalPhrase)) {
            return $$Preposition;
        }
        if (NIL != kb_utilities.kbeq(cat, $$PossessivePhrase)) {
            return $$Determiner;
        }
        if (NIL == cat) {
            return NIL;
        }
        if (NIL != kb_utilities.kbeq(cat, $$NLSentence)) {
            return $$Verb;
        }
        if (NIL != kb_utilities.kbeq(cat, $$NLPhrase)) {
            return $$NLWordForm;
        }
        return ask_utilities.ask_variable($sym92$_POS, listS($$posOfPhraseType, cat, $list94), mt, ONE_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject pos_of_cat_cached(final SubLObject cat, final SubLObject mt) {
        SubLObject caching_state = $pos_of_cat_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(POS_OF_CAT_CACHED, $pos_of_cat_cached_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(cat, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cat.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(pos_of_cat_cached_internal(cat, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cat, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject make_cat_with_bar_level(final SubLObject head_cat, final SubLObject bar_level) {
        if (NIL == lexicon_accessors.speech_partP(head_cat, UNPROVIDED)) {
            return head_cat;
        }
        if (bar_level.eql(ONE_INTEGER)) {
            return function_terms.naut_to_nart(make_unary_formula($$PhraseFn_Bar1, head_cat));
        }
        if (bar_level.eql(TWO_INTEGER)) {
            return function_terms.naut_to_nart(make_unary_formula($$PhraseFn, head_cat));
        }
        return head_cat;
    }

    public static SubLObject clear_cached_lexical_functions() {
        lexicon_accessors.clear_cached_lexical_access_functions();
        lexicon_vars.clear_cached_lexical_vars();
        lexicon_accessors.clear_speech_part_pred_caches();
        return clear_cached_lexical_arg_types();
    }

    public static SubLObject clear_lexical_info_caches(SubLObject v_term) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (NIL != indexed_term_p(v_term)) {
            if (NIL != forts.fort_p(v_term)) {
                nl_generation_fort_cache.nl_generation_cache_clear(v_term);
            }
            if ((NIL != fort_types_interface.functor_p(v_term)) && (NIL != kb_mapping_macros.do_function_extent_index_key_validator(v_term))) {
                final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(v_term);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject tou = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(tou));
                        if (NIL != valid) {
                            final SubLObject nart = assertions_high.gaf_arg1(tou);
                            if (NIL != nart_handles.nart_p(nart)) {
                                nl_generation_fort_cache.nl_generation_cache_clear(nart);
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                } finally {
                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        clear_cached_lexifications_for_term();
        return T;
    }

    public static SubLObject clear_cached_lexical_arg_types() {
        clear_denotatum_arg_of_pred_cached();
        clear_semtrans_arg_of_pred_cached();
        clear_pos_arg_of_pred_cached();
        clear_frame_arg_of_pred_cached();
        clear_sense_arg_of_pred_cached();
        clear_wu_arg_of_pred_cached();
        clear_stringlist_args_of_pred_cached();
        return $CLEARED;
    }

    public static SubLObject clear_denotatum_arg_of_pred_cached() {
        return clear_denotatum_arg_of_pred_cached_int();
    }

    public static SubLObject clear_stringlist_args_of_pred_cached() {
        return clear_stringlist_args_of_pred_cached_int();
    }

    public static SubLObject clear_wu_arg_of_pred_cached() {
        return clear_wu_arg_of_pred_cached_int();
    }

    public static SubLObject clear_sense_arg_of_pred_cached() {
        return clear_sense_arg_of_pred_cached_int();
    }

    public static SubLObject clear_frame_arg_of_pred_cached() {
        return clear_frame_arg_of_pred_cached_int();
    }

    public static SubLObject clear_semtrans_arg_of_pred_cached() {
        return clear_semtrans_arg_of_pred_cached_int();
    }

    public static SubLObject denotatum_arg_of_pred_cached(final SubLObject pred) {
        return NIL != kb_loaded() ? denotatum_arg_of_pred_cached_int(pred) : NIL;
    }

    public static SubLObject clear_denotatum_arg_of_pred_cached_int() {
        final SubLObject cs = $denotatum_arg_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_denotatum_arg_of_pred_cached_int(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($denotatum_arg_of_pred_cached_int_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject denotatum_arg_of_pred_cached_int_internal(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg = NIL;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$45 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$48 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject genl_pred = node_var_$48;
                                    final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$48)) {
                                            final SubLObject value = kb_mapping_utilities.fpred_value_in_any_mt(genl_pred, $$denotatumArg, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL != value) {
                                                arg = value;
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$46 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$48);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$53;
                                                                        for (iteration_state_$53 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$53); iteration_state_$53 = dictionary_contents.do_dictionary_contents_next(iteration_state_$53)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$53);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$48, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$53);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$47, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$55;
                                                        final SubLObject new_list = cdolist_list_var_$55 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$55.first();
                                                        while (NIL != cdolist_list_var_$55) {
                                                            final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$49, thread);
                                                            }
                                                            cdolist_list_var_$55 = cdolist_list_var_$55.rest();
                                                            generating_fn = cdolist_list_var_$55.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$46, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$46, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$45, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$47, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$45, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$44, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$44, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$43, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$42, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return arg;
    }

    public static SubLObject denotatum_arg_of_pred_cached_int(final SubLObject pred) {
        SubLObject caching_state = $denotatum_arg_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DENOTATUM_ARG_OF_PRED_CACHED_INT, $denotatum_arg_of_pred_cached_int_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(denotatum_arg_of_pred_cached_int_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject semtrans_arg_of_pred_cached(final SubLObject pred) {
        return NIL != kb_loaded() ? semtrans_arg_of_pred_cached_int(pred) : NIL;
    }

    public static SubLObject clear_semtrans_arg_of_pred_cached_int() {
        final SubLObject cs = $semtrans_arg_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_semtrans_arg_of_pred_cached_int(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($semtrans_arg_of_pred_cached_int_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject semtrans_arg_of_pred_cached_int_internal(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg = NIL;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$59 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$60 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$61 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$63 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$64 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject genl_pred = node_var_$64;
                                    final SubLObject _prev_bind_0_$61 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$64)) {
                                            final SubLObject value = kb_mapping_utilities.fpred_value_in_any_mt(genl_pred, $$semTransArg, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL != value) {
                                                arg = value;
                                            }
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$62 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$62 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$64);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$63 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$69;
                                                                        for (iteration_state_$69 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$69); iteration_state_$69 = dictionary_contents.do_dictionary_contents_next(iteration_state_$69)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$69);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$64, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$69);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$63, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$71;
                                                        final SubLObject new_list = cdolist_list_var_$71 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$71.first();
                                                        while (NIL != cdolist_list_var_$71) {
                                                            final SubLObject _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$65, thread);
                                                            }
                                                            cdolist_list_var_$71 = cdolist_list_var_$71.rest();
                                                            generating_fn = cdolist_list_var_$71.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$62, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$62, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$61, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$63, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$61, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$60, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$60, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$59, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$58, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return arg;
    }

    public static SubLObject semtrans_arg_of_pred_cached_int(final SubLObject pred) {
        SubLObject caching_state = $semtrans_arg_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SEMTRANS_ARG_OF_PRED_CACHED_INT, $semtrans_arg_of_pred_cached_int_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(semtrans_arg_of_pred_cached_int_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject term_from_nl_assertion(final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_arg0(assertion);
            final SubLObject denotatum_arg = denotatum_arg_of_pred_cached(pred);
            final SubLObject denot = (NIL != valid_argnum_p(denotatum_arg)) ? assertions_high.gaf_arg(assertion, denotatum_arg) : NIL;
            return denot;
        }
        return NIL;
    }

    public static SubLObject clear_pos_arg_of_pred_cached() {
        $preds_to_pos_args$.setGlobalValue(misc_utilities.uninitialized());
        return $preds_to_pos_args$.getGlobalValue();
    }

    public static SubLObject preds_to_pos_args() {
        if (NIL != misc_utilities.uninitialized_p($preds_to_pos_args$.getGlobalValue())) {
            final SubLObject template = $list104;
            final SubLObject sentence = $list105;
            final SubLObject v_properties = $list106;
            final SubLObject alist = ask_utilities.query_template(template, sentence, $$InferencePSC, v_properties);
            $preds_to_pos_args$.setGlobalValue(dictionary_utilities.new_dictionary_from_alist(alist, symbol_function(EQUAL)));
        }
        return $preds_to_pos_args$.getGlobalValue();
    }

    public static SubLObject pos_arg_of_pred_cached(final SubLObject pred) {
        return get_pos_arg_of_pred(pred);
    }

    public static SubLObject get_pos_arg_of_pred(final SubLObject pred) {
        return NIL != kb_loaded() ? get_pos_arg_of_pred_int(pred) : NIL;
    }

    public static SubLObject clear_get_pos_arg_of_pred_int() {
        final SubLObject cs = $get_pos_arg_of_pred_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_pos_arg_of_pred_int(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($get_pos_arg_of_pred_int_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_pos_arg_of_pred_int_internal(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arity = arity.arity(pred);
        SubLObject pos_arg = NIL;
        if (v_arity.isInteger() && (NIL == pos_arg)) {
            SubLObject end_var;
            SubLObject i;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject deck_type;
            SubLObject recur_deck;
            SubLObject node_and_predicate_mode;
            SubLObject _prev_bind_0_$74;
            SubLObject tv_var;
            SubLObject _prev_bind_0_$75;
            SubLObject _prev_bind_1_$76;
            SubLObject pcase_var;
            SubLObject _prev_bind_0_$76;
            SubLObject _prev_bind_1_$77;
            SubLObject _prev_bind_3;
            SubLObject _prev_bind_4;
            SubLObject _prev_bind_5;
            SubLObject _prev_bind_0_$77;
            SubLObject _prev_bind_1_$78;
            SubLObject _prev_bind_2_$81;
            SubLObject node_var_$82;
            SubLObject predicate_mode;
            SubLObject genl_pred;
            SubLObject _prev_bind_0_$78;
            SubLObject cdolist_list_var;
            SubLObject accessible_modules;
            SubLObject module_var;
            SubLObject _prev_bind_0_$79;
            SubLObject _prev_bind_1_$79;
            SubLObject node;
            SubLObject d_link;
            SubLObject mt_links;
            SubLObject iteration_state;
            SubLObject mt;
            SubLObject tv_links;
            SubLObject _prev_bind_0_$80;
            SubLObject iteration_state_$87;
            SubLObject tv;
            SubLObject link_nodes;
            SubLObject _prev_bind_0_$81;
            SubLObject sol;
            SubLObject set_contents_var;
            SubLObject basis_object;
            SubLObject state;
            SubLObject node_vars_link_node;
            SubLObject csome_list_var;
            SubLObject node_vars_link_node2;
            SubLObject cdolist_list_var_$89;
            SubLObject new_list;
            SubLObject generating_fn;
            SubLObject _prev_bind_0_$82;
            SubLObject sol2;
            SubLObject link_nodes2;
            SubLObject set_contents_var2;
            SubLObject basis_object2;
            SubLObject state2;
            SubLObject node_vars_link_node3;
            SubLObject csome_list_var2;
            SubLObject node_vars_link_node4;
            SubLObject _prev_bind_0_$83;
            SubLObject _values;
            for (end_var = number_utilities.f_1X(v_arity), i = NIL, i = ONE_INTEGER; (NIL == pos_arg) && (!i.numGE(end_var)); i = number_utilities.f_1X(i)) {
                _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    deck_type = $QUEUE;
                    recur_deck = deck.create_deck(deck_type);
                    node_and_predicate_mode = NIL;
                    _prev_bind_0_$74 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            tv_var = NIL;
                            _prev_bind_0_$75 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            _prev_bind_1_$76 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                _prev_bind_0_$76 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                _prev_bind_1_$77 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        _prev_bind_0_$77 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        _prev_bind_1_$78 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        _prev_bind_2_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                            for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                node_var_$82 = node_and_predicate_mode.first();
                                                predicate_mode = second(node_and_predicate_mode);
                                                genl_pred = node_var_$82;
                                                _prev_bind_0_$78 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$82)) && (NIL != lexicon_accessors.argn_is_speech_partP(genl_pred, i))) {
                                                        pos_arg = i;
                                                    }
                                                    accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                    module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        _prev_bind_0_$79 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$79 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(node_var_$82);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    for (iteration_state_$87 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$87); iteration_state_$87 = dictionary_contents.do_dictionary_contents_next(iteration_state_$87)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$87);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$81, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$87);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$80, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = cdolist_list_var_$89 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$89.first();
                                                                    while (NIL != cdolist_list_var_$89) {
                                                                        _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while (NIL != csome_list_var2) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$82, thread);
                                                                        }
                                                                        cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                                                                        generating_fn = cdolist_list_var_$89.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$79, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$79, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$78, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$81, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$78, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$77, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$77, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$76, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$76, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$75, thread);
                            }
                        } finally {
                            _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$74, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return pos_arg;
    }

    public static SubLObject get_pos_arg_of_pred_int(final SubLObject pred) {
        SubLObject caching_state = $get_pos_arg_of_pred_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_POS_ARG_OF_PRED_INT, $get_pos_arg_of_pred_int_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_pos_arg_of_pred_int_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject frame_arg_of_pred_cached(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return NIL != kb_loaded() ? frame_arg_of_pred_cached_int(pred, mt) : NIL;
    }

    public static SubLObject clear_frame_arg_of_pred_cached_int() {
        final SubLObject cs = $frame_arg_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_frame_arg_of_pred_cached_int(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($frame_arg_of_pred_cached_int_caching_state$.getGlobalValue(), list(pred, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject frame_arg_of_pred_cached_int_internal(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arity = arity.arity(pred);
        SubLObject pos_arg = NIL;
        if (v_arity.isInteger() && (NIL == pos_arg)) {
            SubLObject end_var;
            SubLObject i;
            SubLObject mt_var;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject _prev_bind_3;
            SubLObject deck_type;
            SubLObject recur_deck;
            SubLObject node_and_predicate_mode;
            SubLObject _prev_bind_0_$92;
            SubLObject tv_var;
            SubLObject _prev_bind_0_$93;
            SubLObject _prev_bind_1_$94;
            SubLObject pcase_var;
            SubLObject _prev_bind_0_$94;
            SubLObject _prev_bind_1_$95;
            SubLObject _prev_bind_2_$97;
            SubLObject _prev_bind_4;
            SubLObject _prev_bind_5;
            SubLObject _prev_bind_0_$95;
            SubLObject _prev_bind_1_$96;
            SubLObject _prev_bind_2_$98;
            SubLObject node_var_$101;
            SubLObject predicate_mode;
            SubLObject genl_pred;
            SubLObject _prev_bind_0_$96;
            SubLObject cdolist_list_var;
            SubLObject accessible_modules;
            SubLObject module_var;
            SubLObject _prev_bind_0_$97;
            SubLObject _prev_bind_1_$97;
            SubLObject node;
            SubLObject d_link;
            SubLObject mt_links;
            SubLObject iteration_state;
            SubLObject mt_$105;
            SubLObject tv_links;
            SubLObject _prev_bind_0_$98;
            SubLObject iteration_state_$107;
            SubLObject tv;
            SubLObject link_nodes;
            SubLObject _prev_bind_0_$99;
            SubLObject sol;
            SubLObject set_contents_var;
            SubLObject basis_object;
            SubLObject state;
            SubLObject node_vars_link_node;
            SubLObject csome_list_var;
            SubLObject node_vars_link_node2;
            SubLObject cdolist_list_var_$109;
            SubLObject new_list;
            SubLObject generating_fn;
            SubLObject _prev_bind_0_$100;
            SubLObject sol2;
            SubLObject link_nodes2;
            SubLObject set_contents_var2;
            SubLObject basis_object2;
            SubLObject state2;
            SubLObject node_vars_link_node3;
            SubLObject csome_list_var2;
            SubLObject node_vars_link_node4;
            SubLObject _prev_bind_0_$101;
            SubLObject _values;
            for (end_var = number_utilities.f_1X(v_arity), i = NIL, i = ONE_INTEGER; (NIL == pos_arg) && (!i.numGE(end_var)); i = number_utilities.f_1X(i)) {
                mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    deck_type = $QUEUE;
                    recur_deck = deck.create_deck(deck_type);
                    node_and_predicate_mode = NIL;
                    _prev_bind_0_$92 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            tv_var = NIL;
                            _prev_bind_0_$93 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            _prev_bind_1_$94 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                _prev_bind_0_$94 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                _prev_bind_1_$95 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                _prev_bind_2_$97 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        _prev_bind_0_$95 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        _prev_bind_1_$96 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        _prev_bind_2_$98 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                            for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                node_var_$101 = node_and_predicate_mode.first();
                                                predicate_mode = second(node_and_predicate_mode);
                                                genl_pred = node_var_$101;
                                                _prev_bind_0_$96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$101)) && (NIL != subl_promotions.memberP($$SubcategorizationFrame, kb_accessors.argn_isa(genl_pred, i, mt), $sym112$SPEC_, UNPROVIDED))) {
                                                        pos_arg = i;
                                                    }
                                                    accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                    module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        _prev_bind_0_$97 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$97 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(node_var_$101);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$105 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$105)) {
                                                                                _prev_bind_0_$98 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$105, thread);
                                                                                    for (iteration_state_$107 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$107); iteration_state_$107 = dictionary_contents.do_dictionary_contents_next(iteration_state_$107)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$107);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$99 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$99, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$107);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$98, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = cdolist_list_var_$109 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$109.first();
                                                                    while (NIL != cdolist_list_var_$109) {
                                                                        _prev_bind_0_$100 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while (NIL != csome_list_var2) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$100, thread);
                                                                        }
                                                                        cdolist_list_var_$109 = cdolist_list_var_$109.rest();
                                                                        generating_fn = cdolist_list_var_$109.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$97, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$97, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$96, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$98, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$96, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$95, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$97, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$95, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$94, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$94, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$93, thread);
                            }
                        } finally {
                            _prev_bind_0_$101 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$92, thread);
                    }
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return pos_arg;
    }

    public static SubLObject frame_arg_of_pred_cached_int(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $frame_arg_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FRAME_ARG_OF_PRED_CACHED_INT, $frame_arg_of_pred_cached_int_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
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
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(frame_arg_of_pred_cached_int_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject wu_arg_of_pred_cached(final SubLObject pred) {
        if (NIL != kb_utilities.kbeq(pred, $$partOfSpeech)) {
            return ONE_INTEGER;
        }
        if (NIL != kb_loaded()) {
            return wu_arg_of_pred_cached_int(pred);
        }
        return NIL;
    }

    public static SubLObject clear_wu_arg_of_pred_cached_int() {
        final SubLObject cs = $wu_arg_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wu_arg_of_pred_cached_int(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($wu_arg_of_pred_cached_int_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wu_arg_of_pred_cached_int_internal(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arity = arity.arity(pred);
        SubLObject wu_arg = NIL;
        if (v_arity.isInteger() && (NIL == wu_arg)) {
            SubLObject end_var;
            SubLObject i;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject deck_type;
            SubLObject recur_deck;
            SubLObject node_and_predicate_mode;
            SubLObject _prev_bind_0_$112;
            SubLObject tv_var;
            SubLObject _prev_bind_0_$113;
            SubLObject _prev_bind_1_$114;
            SubLObject pcase_var;
            SubLObject _prev_bind_0_$114;
            SubLObject _prev_bind_1_$115;
            SubLObject _prev_bind_3;
            SubLObject _prev_bind_4;
            SubLObject _prev_bind_5;
            SubLObject _prev_bind_0_$115;
            SubLObject _prev_bind_1_$116;
            SubLObject _prev_bind_2_$119;
            SubLObject node_var_$120;
            SubLObject predicate_mode;
            SubLObject genl_pred;
            SubLObject _prev_bind_0_$116;
            SubLObject csome_list_var;
            SubLObject fort;
            SubLObject cdolist_list_var;
            SubLObject accessible_modules;
            SubLObject module_var;
            SubLObject _prev_bind_0_$117;
            SubLObject _prev_bind_1_$117;
            SubLObject node;
            SubLObject d_link;
            SubLObject mt_links;
            SubLObject iteration_state;
            SubLObject mt;
            SubLObject tv_links;
            SubLObject _prev_bind_0_$118;
            SubLObject iteration_state_$125;
            SubLObject tv;
            SubLObject link_nodes;
            SubLObject _prev_bind_0_$119;
            SubLObject sol;
            SubLObject set_contents_var;
            SubLObject basis_object;
            SubLObject state;
            SubLObject node_vars_link_node;
            SubLObject csome_list_var2;
            SubLObject node_vars_link_node2;
            SubLObject cdolist_list_var_$127;
            SubLObject new_list;
            SubLObject generating_fn;
            SubLObject _prev_bind_0_$120;
            SubLObject sol2;
            SubLObject link_nodes2;
            SubLObject set_contents_var2;
            SubLObject basis_object2;
            SubLObject state2;
            SubLObject node_vars_link_node3;
            SubLObject csome_list_var3;
            SubLObject node_vars_link_node4;
            SubLObject _prev_bind_0_$121;
            SubLObject _values;
            for (end_var = number_utilities.f_1X(v_arity), i = NIL, i = ONE_INTEGER; (NIL == wu_arg) && (!i.numGE(end_var)); i = number_utilities.f_1X(i)) {
                _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    deck_type = $QUEUE;
                    recur_deck = deck.create_deck(deck_type);
                    node_and_predicate_mode = NIL;
                    _prev_bind_0_$112 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            tv_var = NIL;
                            _prev_bind_0_$113 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            _prev_bind_1_$114 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                _prev_bind_0_$114 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                _prev_bind_1_$115 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        _prev_bind_0_$115 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        _prev_bind_1_$116 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        _prev_bind_2_$119 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                            for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                node_var_$120 = node_and_predicate_mode.first();
                                                predicate_mode = second(node_and_predicate_mode);
                                                genl_pred = node_var_$120;
                                                _prev_bind_0_$116 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$120)) && (NIL == wu_arg)) {
                                                        csome_list_var = kb_accessors.argn_isa(genl_pred, i, UNPROVIDED);
                                                        fort = NIL;
                                                        fort = csome_list_var.first();
                                                        while ((NIL == wu_arg) && (NIL != csome_list_var)) {
                                                            if (NIL != genls.genlP(fort, $$LexicalWord, UNPROVIDED, UNPROVIDED)) {
                                                                wu_arg = i;
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            fort = csome_list_var.first();
                                                        } 
                                                    }
                                                    accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                    module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        _prev_bind_0_$117 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$117 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(node_var_$120);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                _prev_bind_0_$118 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    for (iteration_state_$125 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$125); iteration_state_$125 = dictionary_contents.do_dictionary_contents_next(iteration_state_$125)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$125);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$119 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        csome_list_var2 = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var2.first();
                                                                                                        while (NIL != csome_list_var2) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$119, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$125);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$118, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = cdolist_list_var_$127 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$127.first();
                                                                    while (NIL != cdolist_list_var_$127) {
                                                                        _prev_bind_0_$120 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    csome_list_var3 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$120, thread);
                                                                        }
                                                                        cdolist_list_var_$127 = cdolist_list_var_$127.rest();
                                                                        generating_fn = cdolist_list_var_$127.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$117, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$117, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$116, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$119, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$116, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$115, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$115, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$114, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$114, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$113, thread);
                            }
                        } finally {
                            _prev_bind_0_$121 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$121, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$112, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return wu_arg;
    }

    public static SubLObject wu_arg_of_pred_cached_int(final SubLObject pred) {
        SubLObject caching_state = $wu_arg_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WU_ARG_OF_PRED_CACHED_INT, $wu_arg_of_pred_cached_int_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wu_arg_of_pred_cached_int_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sense_arg_of_pred_cached(final SubLObject pred) {
        return NIL != kb_loaded() ? sense_arg_of_pred_cached_int(pred) : NIL;
    }

    public static SubLObject clear_sense_arg_of_pred_cached_int() {
        final SubLObject cs = $sense_arg_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sense_arg_of_pred_cached_int(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($sense_arg_of_pred_cached_int_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sense_arg_of_pred_cached_int_internal(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arity = arity.arity(pred);
        SubLObject sense_arg = NIL;
        if (v_arity.isInteger() && (NIL == sense_arg)) {
            SubLObject end_var;
            SubLObject i;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject deck_type;
            SubLObject recur_deck;
            SubLObject node_and_predicate_mode;
            SubLObject _prev_bind_0_$130;
            SubLObject tv_var;
            SubLObject _prev_bind_0_$131;
            SubLObject _prev_bind_1_$132;
            SubLObject pcase_var;
            SubLObject _prev_bind_0_$132;
            SubLObject _prev_bind_1_$133;
            SubLObject _prev_bind_3;
            SubLObject _prev_bind_4;
            SubLObject _prev_bind_5;
            SubLObject _prev_bind_0_$133;
            SubLObject _prev_bind_1_$134;
            SubLObject _prev_bind_2_$137;
            SubLObject node_var_$138;
            SubLObject predicate_mode;
            SubLObject genl_pred;
            SubLObject _prev_bind_0_$134;
            SubLObject csome_list_var;
            SubLObject fort;
            SubLObject cdolist_list_var;
            SubLObject accessible_modules;
            SubLObject module_var;
            SubLObject _prev_bind_0_$135;
            SubLObject _prev_bind_1_$135;
            SubLObject node;
            SubLObject d_link;
            SubLObject mt_links;
            SubLObject iteration_state;
            SubLObject mt;
            SubLObject tv_links;
            SubLObject _prev_bind_0_$136;
            SubLObject iteration_state_$143;
            SubLObject tv;
            SubLObject link_nodes;
            SubLObject _prev_bind_0_$137;
            SubLObject sol;
            SubLObject set_contents_var;
            SubLObject basis_object;
            SubLObject state;
            SubLObject node_vars_link_node;
            SubLObject csome_list_var2;
            SubLObject node_vars_link_node2;
            SubLObject cdolist_list_var_$145;
            SubLObject new_list;
            SubLObject generating_fn;
            SubLObject _prev_bind_0_$138;
            SubLObject sol2;
            SubLObject link_nodes2;
            SubLObject set_contents_var2;
            SubLObject basis_object2;
            SubLObject state2;
            SubLObject node_vars_link_node3;
            SubLObject csome_list_var3;
            SubLObject node_vars_link_node4;
            SubLObject _prev_bind_0_$139;
            SubLObject _values;
            for (end_var = number_utilities.f_1X(v_arity), i = NIL, i = ONE_INTEGER; (NIL == sense_arg) && (!i.numGE(end_var)); i = number_utilities.f_1X(i)) {
                _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    deck_type = $QUEUE;
                    recur_deck = deck.create_deck(deck_type);
                    node_and_predicate_mode = NIL;
                    _prev_bind_0_$130 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            tv_var = NIL;
                            _prev_bind_0_$131 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            _prev_bind_1_$132 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                _prev_bind_0_$132 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                _prev_bind_1_$133 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        _prev_bind_0_$133 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        _prev_bind_1_$134 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        _prev_bind_2_$137 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                            for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                node_var_$138 = node_and_predicate_mode.first();
                                                predicate_mode = second(node_and_predicate_mode);
                                                genl_pred = node_var_$138;
                                                _prev_bind_0_$134 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$138)) && (NIL == sense_arg)) {
                                                        csome_list_var = kb_accessors.argn_isa(genl_pred, i, UNPROVIDED);
                                                        fort = NIL;
                                                        fort = csome_list_var.first();
                                                        while ((NIL == sense_arg) && (NIL != csome_list_var)) {
                                                            if (NIL != genls.genlP(fort, $$Integer, UNPROVIDED, UNPROVIDED)) {
                                                                sense_arg = i;
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            fort = csome_list_var.first();
                                                        } 
                                                    }
                                                    accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                    module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        _prev_bind_0_$135 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$135 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(node_var_$138);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                _prev_bind_0_$136 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    for (iteration_state_$143 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$143); iteration_state_$143 = dictionary_contents.do_dictionary_contents_next(iteration_state_$143)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$143);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$137 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        csome_list_var2 = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var2.first();
                                                                                                        while (NIL != csome_list_var2) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$137, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$143);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$136, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = cdolist_list_var_$145 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$145.first();
                                                                    while (NIL != cdolist_list_var_$145) {
                                                                        _prev_bind_0_$138 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    csome_list_var3 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$138, thread);
                                                                        }
                                                                        cdolist_list_var_$145 = cdolist_list_var_$145.rest();
                                                                        generating_fn = cdolist_list_var_$145.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$135, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$135, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$134, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$137, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$134, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$133, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$133, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$132, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$132, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$131, thread);
                            }
                        } finally {
                            _prev_bind_0_$139 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$139, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$130, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return sense_arg;
    }

    public static SubLObject sense_arg_of_pred_cached_int(final SubLObject pred) {
        SubLObject caching_state = $sense_arg_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SENSE_ARG_OF_PRED_CACHED_INT, $sense_arg_of_pred_cached_int_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(sense_arg_of_pred_cached_int_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject stringlist_args_of_pred_cached(final SubLObject pred) {
        return (NIL != kb_loaded()) && (NIL != indexed_term_p(pred)) ? stringlist_args_of_pred_cached_int(pred) : NIL;
    }

    public static SubLObject clear_stringlist_args_of_pred_cached_int() {
        final SubLObject cs = $stringlist_args_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_stringlist_args_of_pred_cached_int(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($stringlist_args_of_pred_cached_int_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject stringlist_args_of_pred_cached_int_internal(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stringlist_args = NIL;
        SubLObject cdolist_list_var;
        final SubLObject list_types = cdolist_list_var = list(narts_high.find_nart($list122), narts_high.find_nart($list123));
        SubLObject list_type = NIL;
        list_type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject deck_type = $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_0_$148 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$149 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$150 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$150 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$151 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$151 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$152 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$155 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                        for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$156 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$156;
                                            final SubLObject _prev_bind_0_$152 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$156)) {
                                                    SubLObject cdolist_list_var_$158 = remove_duplicates(kb_mapping_utilities.pred_value_tuples(genl_pred, $$argIsa, ONE_INTEGER, $list126, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject pair = NIL;
                                                    pair = cdolist_list_var_$158.first();
                                                    while (NIL != cdolist_list_var_$158) {
                                                        SubLObject current;
                                                        final SubLObject datum = current = pair;
                                                        SubLObject argnum = NIL;
                                                        SubLObject col = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list124);
                                                        argnum = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list124);
                                                        col = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            if (NIL != genls.genlP(col, list_type, UNPROVIDED, UNPROVIDED)) {
                                                                final SubLObject item_var = argnum;
                                                                if (NIL == member(item_var, stringlist_args, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    stringlist_args = cons(item_var, stringlist_args);
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list124);
                                                        }
                                                        cdolist_list_var_$158 = cdolist_list_var_$158.rest();
                                                        pair = cdolist_list_var_$158.first();
                                                    } 
                                                }
                                                SubLObject cdolist_list_var_$159;
                                                final SubLObject accessible_modules = cdolist_list_var_$159 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var_$159.first();
                                                while (NIL != cdolist_list_var_$159) {
                                                    final SubLObject _prev_bind_0_$153 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$153 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$156);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$154 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$163;
                                                                                for (iteration_state_$163 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$163); iteration_state_$163 = dictionary_contents.do_dictionary_contents_next(iteration_state_$163)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$163);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$155 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                                            deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$155, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$163);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$154, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$160;
                                                                final SubLObject new_list = cdolist_list_var_$160 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$160.first();
                                                                while (NIL != cdolist_list_var_$160) {
                                                                    final SubLObject _prev_bind_0_$156 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
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
                                                                                        deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$156, thread);
                                                                    }
                                                                    cdolist_list_var_$160 = cdolist_list_var_$160.rest();
                                                                    generating_fn = cdolist_list_var_$160.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$153, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$153, thread);
                                                    }
                                                    cdolist_list_var_$159 = cdolist_list_var_$159.rest();
                                                    module_var = cdolist_list_var_$159.first();
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$152, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$155, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$152, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$151, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$151, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$150, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$150, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$149, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$157 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$157, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$148, thread);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            list_type = cdolist_list_var.first();
        } 
        return Sort.sort(stringlist_args, symbol_function($sym127$_), UNPROVIDED);
    }

    public static SubLObject stringlist_args_of_pred_cached_int(final SubLObject pred) {
        SubLObject caching_state = $stringlist_args_of_pred_cached_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(STRINGLIST_ARGS_OF_PRED_CACHED_INT, $stringlist_args_of_pred_cached_int_caching_state$, NIL, EQL, ONE_INTEGER, $int$64);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(stringlist_args_of_pred_cached_int_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_string_list_from_formula(final SubLObject formula, final SubLObject arg_pos) {
        final SubLObject string_list = unicode_nauts.convert_unicode_nauts_to_utf8_strings(cycl_utilities.formula_arg(formula, arg_pos, UNPROVIDED));
        if (NIL != el_list_p(string_list)) {
            return el_list_items(string_list);
        }
        return NIL;
    }

    public static SubLObject get_leading_strings_and_following_strings_argnums(final SubLObject formula) {
        final SubLObject pred = cycl_utilities.formula_operator(formula);
        final SubLObject wu_arg = wu_arg_of_pred_cached(pred);
        final SubLObject stringlist_args = stringlist_args_of_pred_cached(pred);
        final SubLObject leading_strings_arg = (NIL != wu_arg) ? find(wu_arg, stringlist_args, $sym129$_, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject following_strings_arg = (NIL != wu_arg) ? find(wu_arg, stringlist_args, $sym127$_, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        return values(leading_strings_arg, following_strings_arg);
    }

    public static SubLObject get_leading_strings_from_formula(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject leading_string_arg = get_leading_strings_and_following_strings_argnums(formula);
        final SubLObject following_string_arg = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != leading_string_arg) {
            return get_string_list_from_formula(formula, leading_string_arg);
        }
        return NIL;
    }

    public static SubLObject get_following_strings_from_formula(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject leading_string_arg = get_leading_strings_and_following_strings_argnums(formula);
        final SubLObject following_string_arg = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != following_string_arg) {
            return get_string_list_from_formula(formula, following_string_arg);
        }
        return NIL;
    }

    public static SubLObject get_leading_strings_and_following_strings(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject leading_strings = NIL;
        SubLObject following_strings = NIL;
        thread.resetMultipleValues();
        final SubLObject leading_string_arg = get_leading_strings_and_following_strings_argnums(formula);
        final SubLObject following_string_arg = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != leading_string_arg) {
            leading_strings = get_string_list_from_formula(formula, leading_string_arg);
        }
        if (NIL != following_string_arg) {
            following_strings = get_string_list_from_formula(formula, following_string_arg);
        }
        return values(leading_strings, following_strings);
    }

    public static SubLObject parse_denot_formula(final SubLObject formula) {
        assert NIL != denot_formula_p(formula) : "lexicon_utilities.denot_formula_p(formula) " + "CommonSymbols.NIL != lexicon_utilities.denot_formula_p(formula) " + formula;
        return parse_lexical_semantic_formula(formula, UNPROVIDED);
    }

    public static SubLObject denot_formula_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && denotatum_arg_of_pred_cached(cycl_utilities.formula_arg0(v_object)).isInteger());
    }

    public static SubLObject parse_lexical_semantic_formula(final SubLObject formula, SubLObject just_this) {
        if (just_this == UNPROVIDED) {
            just_this = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
        final SubLObject formula_terms = cycl_utilities.formula_terms(formula, UNPROVIDED);
        final SubLObject pred = nth(ZERO_INTEGER, formula_terms);
        SubLObject denot = NIL;
        SubLObject wu = NIL;
        SubLObject leading_strings = NIL;
        SubLObject following_strings = NIL;
        SubLObject pos = NIL;
        final SubLObject denot_arg = denotatum_arg_of_pred_cached(pred);
        final SubLObject pos_arg = pos_arg_of_pred_cached(pred);
        final SubLObject wu_arg = wu_arg_of_pred_cached(pred);
        if (wu_arg.isInteger()) {
            if (denot_arg.isInteger()) {
                denot = nth(denot_arg, formula_terms);
            }
            pos = (NIL != pos_arg) ? nth(pos_arg, formula_terms) : lexicon_accessors.semtrans_pred_to_pos(pred, UNPROVIDED);
            wu = nth(wu_arg, formula_terms);
            thread.resetMultipleValues();
            final SubLObject leading_strings_$168 = get_leading_strings_and_following_strings(formula);
            final SubLObject following_strings_$169 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            leading_strings = leading_strings_$168;
            following_strings = following_strings_$169;
        }
        if (just_this.eql($POS)) {
            return pos;
        }
        if (just_this.eql($DENOT)) {
            return denot;
        }
        if (just_this.eql($PRED)) {
            return pred;
        }
        if (just_this.eql($WU)) {
            return wu;
        }
        return values(leading_strings, wu, following_strings, pos, denot, pred);
    }

    public static SubLObject lexical_semantic_formula_genl_posP(final SubLObject formula, final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return lexicon_accessors.genl_posP(parse_lexical_semantic_formula(formula, $POS), pos, mt);
    }

    public static SubLObject lexical_semantic_formula_matches_head_stringXposP(final SubLObject formula, final SubLObject string, final SubLObject target_pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        thread.resetMultipleValues();
        final SubLObject lead = parse_lexical_semantic_formula(formula, UNPROVIDED);
        final SubLObject head_wu = thread.secondMultipleValue();
        final SubLObject follow = thread.thirdMultipleValue();
        final SubLObject formula_pos = thread.fourthMultipleValue();
        final SubLObject denot = thread.fifthMultipleValue();
        final SubLObject pred = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != subl_promotions.memberP(string, lexicon_cache.strings_of_word_unit(head_wu, list($$nounStrings), UNPROVIDED, UNPROVIDED), $sym135$STRING_, UNPROVIDED)) {
            ans = lexicon_accessors.genl_posP(formula_pos, target_pos, mt);
        }
        return ans;
    }

    public static SubLObject assemble_denot_strings(final SubLObject leading_strings, final SubLObject wu_string, final SubLObject following_strings) {
        if ((NIL == leading_strings) && (NIL == following_strings)) {
            return wu_string;
        }
        if (NIL == leading_strings) {
            return cconcatenate(wu_string, new SubLObject[]{ $$$_, string_utilities.bunge(following_strings, CHAR_space) });
        }
        if (NIL == following_strings) {
            return cconcatenate(string_utilities.bunge(leading_strings, CHAR_space), new SubLObject[]{ $$$_, wu_string });
        }
        return cconcatenate(string_utilities.bunge(leading_strings, UNPROVIDED), new SubLObject[]{ $$$_, wu_string, $$$_, string_utilities.bunge(following_strings, UNPROVIDED) });
    }

    public static SubLObject proper_noun_form_of_pred(final SubLObject pred) {
        return list_utilities.alist_reverse_lookup_without_values(proper_to_common_pred_map(), pred, symbol_function(EQL), pred);
    }

    public static SubLObject common_noun_form_of_pred(final SubLObject pred) {
        return list_utilities.alist_lookup_without_values(proper_to_common_pred_map(), pred, symbol_function(EQL), pred);
    }

    public static SubLObject proper_to_common_pred_map() {
        return $proper_to_common_pred_map$.getGlobalValue();
    }

    public static SubLObject common_noun_form_of_pos(final SubLObject pos) {
        if (pos.eql($$ProperNoun)) {
            return $$CommonNoun;
        }
        if (pos.eql($$ProperCountNoun)) {
            return $$SimpleNoun;
        }
        if (pos.eql($$ProperMassNoun)) {
            return $$MassNoun;
        }
        return pos;
    }

    public static SubLObject noun_form_singular(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$singular, mt);
    }

    public static SubLObject set_noun_form_singular(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$singular, string, mt);
    }

    public static SubLObject noun_form_plural(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$plural, mt);
    }

    public static SubLObject set_noun_form_plural(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$plural, string, mt);
    }

    public static SubLObject noun_form_mass(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$massNumber, mt);
    }

    public static SubLObject set_noun_form_mass(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$massNumber, string, mt);
    }

    public static SubLObject proper_noun_form_singular(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$pnSingular, mt);
    }

    public static SubLObject set_proper_noun_form_singular(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$pnSingular, string, mt);
    }

    public static SubLObject proper_noun_form_plural(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$pnPlural, mt);
    }

    public static SubLObject set_proper_noun_form_plural(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$pnPlural, string, mt);
    }

    public static SubLObject proper_noun_form_mass(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$pnMassNumber, mt);
    }

    public static SubLObject set_proper_noun_form_mass(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$pnMassNumber, string, mt);
    }

    public static SubLObject ag_noun_form_singular(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$agentive_Sg, mt);
    }

    public static SubLObject set_ag_noun_form_singular(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$agentive_Sg, string, mt);
    }

    public static SubLObject ag_noun_form_plural(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$agentive_Pl, mt);
    }

    public static SubLObject set_ag_noun_form_plural(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$agentive_Pl, string, mt);
    }

    public static SubLObject ag_noun_form_mass(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$agentive_Mass, mt);
    }

    public static SubLObject set_ag_noun_form_mass(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$agentive_Mass, string, mt);
    }

    public static SubLObject verb_form_infinitive(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$infinitive, mt);
    }

    public static SubLObject set_verb_form_infinitive(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$infinitive, string, mt);
    }

    public static SubLObject verb_form_third_sing(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, constants_high.find_constant($str151$thirdPersonSg_Present), mt);
    }

    public static SubLObject set_verb_form_third_sing(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, constants_high.find_constant($str152$thirdPersonSg_Generic), string, mt);
    }

    public static SubLObject verb_form_progressive(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$gerund, mt);
    }

    public static SubLObject set_verb_form_progressive(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$gerund, string, mt);
    }

    public static SubLObject verb_form_past(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, constants_high.find_constant($str153$pastTense_Universal), mt);
    }

    public static SubLObject set_verb_form_past(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, constants_high.find_constant($str153$pastTense_Universal), string, mt);
    }

    public static SubLObject verb_form_perfect(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$perfect, mt);
    }

    public static SubLObject set_verb_form_perfect(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$perfect, string, mt);
    }

    public static SubLObject verb_form_pres_participle(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$presentParticiple, mt);
    }

    public static SubLObject set_verb_form_pres_participle(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$presentParticiple, string, mt);
    }

    public static SubLObject adjective_form_regular(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$regularDegree, mt);
    }

    public static SubLObject set_adjective_form_regular(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$regularDegree, string, mt);
    }

    public static SubLObject adjective_form_comparative(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$comparativeDegree, mt);
    }

    public static SubLObject set_adjective_form_comparative(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$comparativeDegree, string, mt);
    }

    public static SubLObject adjective_form_superlative(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$superlativeDegree, mt);
    }

    public static SubLObject set_adjective_form_superlative(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$superlativeDegree, string, mt);
    }

    public static SubLObject adjective_form_nongradable(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$nonGradableAdjectiveForm, mt);
    }

    public static SubLObject set_adjective_form_nongradable(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$nonGradableAdjectiveForm, string, mt);
    }

    public static SubLObject adverb_form_regular(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$regularAdverb, mt);
    }

    public static SubLObject set_adverb_form_regular(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$regularAdverb, string, mt);
    }

    public static SubLObject adverb_form_comparative(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$comparativeAdverb, mt);
    }

    public static SubLObject set_adverb_form_comparative(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$comparativeAdverb, string, mt);
    }

    public static SubLObject adverb_form_superlative(final SubLObject word_unit, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        return word_prop(word_unit, $$superlativeAdverb, mt);
    }

    public static SubLObject set_adverb_form_superlative(final SubLObject word_unit, final SubLObject string, final SubLObject mt) {
        return set_word_prop(word_unit, $$superlativeAdverb, string, mt);
    }

    public static SubLObject sentence_tokenize(final SubLObject words, final SubLObject v_strie, SubLObject output, SubLObject mode, SubLObject token_data, SubLObject starting_index) {
        if (output == UNPROVIDED) {
            output = $STRING;
        }
        if (mode == UNPROVIDED) {
            mode = $GREEDY;
        }
        if (token_data == UNPROVIDED) {
            token_data = symbol_function(IDENTITY);
        }
        if (starting_index == UNPROVIDED) {
            starting_index = ZERO_INTEGER;
        }
        assert NIL != listp(words) : "Types.listp(words) " + "CommonSymbols.NIL != Types.listp(words) " + words;
        assert NIL != functionp(token_data) : "Types.functionp(token_data) " + "CommonSymbols.NIL != Types.functionp(token_data) " + token_data;
        SubLObject prefix_length = ZERO_INTEGER;
        SubLObject interval_tokens = NIL;
        SubLObject pcase_var = mode;
        if (pcase_var.eql($GREEDY)) {
            SubLObject index = NIL;
            SubLObject tokens = NIL;
            SubLObject prefix = NIL;
            index = starting_index;
            tokens = words;
            prefix = strie.strie_prefixes(v_strie, tokens).first();
            while (NIL != tokens) {
                if (NIL == prefix) {
                    prefix = cons(list(tokens.first()), NIL);
                }
                prefix_length = length(prefix.first());
                interval_tokens = cons(standard_tokenization.new_interval_token(index, add(index, prefix_length), funcall(token_data, cons(string_utilities.bunge(subseq(tokens, ZERO_INTEGER, prefix_length), UNPROVIDED), prefix.rest()))), interval_tokens);
                index = add(index, prefix_length);
                tokens = nthcdr(prefix_length, tokens);
                prefix = strie.strie_prefixes(v_strie, tokens).first();
            } 
        } else
            if (pcase_var.eql($DILIGENT)) {
                SubLObject index = NIL;
                SubLObject tokens = NIL;
                SubLObject prefixes = NIL;
                index = starting_index;
                tokens = words;
                prefixes = strie.strie_prefixes(v_strie, tokens);
                while (NIL != tokens) {
                    prefix_length = ZERO_INTEGER;
                    SubLObject cdolist_list_var = prefixes;
                    SubLObject prefix2 = NIL;
                    prefix2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        prefix_length = length(prefix2.first());
                        interval_tokens = cons(standard_tokenization.new_interval_token(index, add(index, prefix_length), funcall(token_data, cons(string_utilities.bunge(prefix2.first(), UNPROVIDED), prefix2.rest()))), interval_tokens);
                        cdolist_list_var = cdolist_list_var.rest();
                        prefix2 = cdolist_list_var.first();
                    } 
                    if (!prefix_length.numE(ONE_INTEGER)) {
                        interval_tokens = cons(standard_tokenization.new_interval_token(index, add(index, ONE_INTEGER), funcall(token_data, cons(tokens.first(), NIL))), interval_tokens);
                    }
                    index = add(index, ONE_INTEGER);
                    tokens = strie.sequence_slice(tokens, ONE_INTEGER, UNPROVIDED);
                    prefixes = strie.strie_prefixes(v_strie, tokens);
                } 
            } else {
                Errors.error($str168$_s_is_not_a_valid_mode_argument, mode);
            }

        pcase_var = output;
        if (pcase_var.eql($INTERVAL)) {
            return reverse(interval_tokens);
        }
        if (pcase_var.eql($STRING)) {
            return interval_tokens_sequentialize(reverse(interval_tokens), make_vector(add(standard_tokenization.interval_token_end(interval_tokens.first()), ONE_INTEGER), UNPROVIDED));
        }
        Errors.error($str170$_s_is_not_a_valid_output_argument, output);
        return NIL;
    }

    public static SubLObject interval_tokens_sequentialize(final SubLObject interval_tokens, final SubLObject sequence_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != endp(interval_tokens)) {
            return $list171;
        }
        if (NIL != list_utilities.singletonP(interval_tokens)) {
            return list(list(standard_tokenization.interval_token_value(interval_tokens.first())));
        }
        SubLObject continuations = NIL;
        SubLObject end_index = NIL;
        final SubLObject start = add(standard_tokenization.interval_token_start(interval_tokens.first()), ONE_INTEGER);
        SubLObject token_sequences = NIL;
        thread.resetMultipleValues();
        final SubLObject starting_tokens = interval_tokens_split(interval_tokens, start);
        final SubLObject remaining_tokens = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = starting_tokens;
        SubLObject starting_token = NIL;
        starting_token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            end_index = standard_tokenization.interval_token_end(starting_token);
            continuations = aref(sequence_cache, end_index);
            if (NIL == continuations) {
                thread.resetMultipleValues();
                final SubLObject before = interval_tokens_split(remaining_tokens, end_index);
                final SubLObject after = thread.secondMultipleValue();
                thread.resetMultipleValues();
                continuations = interval_tokens_sequentialize(after, sequence_cache);
                set_aref(sequence_cache, end_index, continuations);
            }
            SubLObject cdolist_list_var_$170 = continuations;
            SubLObject continuation = NIL;
            continuation = cdolist_list_var_$170.first();
            while (NIL != cdolist_list_var_$170) {
                token_sequences = cons(cons(standard_tokenization.interval_token_value(starting_token), continuation), token_sequences);
                cdolist_list_var_$170 = cdolist_list_var_$170.rest();
                continuation = cdolist_list_var_$170.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            starting_token = cdolist_list_var.first();
        } 
        return token_sequences;
    }

    public static SubLObject interval_tokens_split(final SubLObject interval_tokens, final SubLObject index) {
        SubLObject before = NIL;
        SubLObject itokens = interval_tokens;
        for (SubLObject interval_token = interval_tokens.first(); interval_token.isVector() && standard_tokenization.interval_token_start(interval_token).numL(index); interval_token = itokens.first()) {
            before = cons(interval_token, before);
            itokens = itokens.rest();
        }
        return values(reverse(before), itokens);
    }

    public static SubLObject word_count() {
        return length(isa.all_fort_instances_in_all_mts($$EnglishWord));
    }

    public static SubLObject full_word_count() {
        SubLObject ans = ZERO_INTEGER;
        final SubLObject root_preds = remove_if(symbol_function($sym173$DERIVED_PRED_), lexicon_vars.$root_form_speech_parts$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = cons($$partOfSpeech, root_preds);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject count = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
            ans = add(ans, count);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject denotation_count() {
        return kb_indexing.num_predicate_extent_index($$denotation, UNPROVIDED);
    }

    public static SubLObject nl_pred_count(final SubLObject predicate) {
        return kb_indexing.num_predicate_extent_index(predicate, UNPROVIDED);
    }

    public static SubLObject nl_statistics(SubLObject verboseP, SubLObject output_file) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (output_file == UNPROVIDED) {
            output_file = nl_stats_file_path();
        }
        format(T, $str174$______NL_statistics______CycL__A_, new SubLObject[]{ system_info.cyc_revision_string(), kb_loaded(), operation_communication.kb_op_number() });
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(output_file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str176$Unable_to_open__S, output_file);
            }
            final SubLObject stream_$171 = stream;
            format(stream_$171, $str174$______NL_statistics______CycL__A_, new SubLObject[]{ system_info.cyc_revision_string(), kb_loaded(), operation_communication.kb_op_number() });
            format(T, $str177$__Instances_of___EnglishWord____6, word_count());
            format(T, $str178$__Number_of_root_forms__________6, full_word_count());
            format(stream_$171, $str177$__Instances_of___EnglishWord____6, word_count());
            format(stream_$171, $str178$__Number_of_root_forms__________6, full_word_count());
            final SubLObject grand_total = count_and_print_nl_preds(stream_$171, verboseP, UNPROVIDED);
            format(T, $str179$____Grand_total____D____, grand_total);
            format(stream_$171, $str180$____Grand_total____D, grand_total);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        format(T, $str181$Output_in__S, output_file);
        return NIL;
    }

    public static SubLObject nl_stats_file_path() {
        return cconcatenate($str182$_cyc_departments_nl_doc_stats_kb, new SubLObject[]{ string_utilities.str(kb_loaded()), operation_communication.kb_op_number().isPositive() ? cconcatenate($str183$_, string_utilities.str(operation_communication.kb_op_number())) : $str12$, $str184$_, string_utilities.str(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED)), $str185$_stats });
    }

    public static SubLObject count_and_print_nl_preds(final SubLObject stream, final SubLObject verboseP, SubLObject root_category) {
        if (root_category == UNPROVIDED) {
            root_category = $$NLPredicate;
        }
        final SubLObject pred_tree = categorize_nl_preds(root_category, UNPROVIDED, UNPROVIDED);
        final SubLObject grand_total = ZERO_INTEGER;
        final SubLObject counted_preds = NIL;
        return count_and_print_nl_preds_int(stream, verboseP, pred_tree, grand_total, counted_preds);
    }

    public static SubLObject count_and_print_nl_preds_int(final SubLObject stream, final SubLObject verboseP, final SubLObject pred_tree, SubLObject grand_total, SubLObject counted_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred_type = NIL;
        SubLObject v_instances = NIL;
        SubLObject subtrees = NIL;
        destructuring_bind_must_consp(pred_tree, pred_tree, $list187);
        pred_type = pred_tree.first();
        SubLObject current = pred_tree.rest();
        destructuring_bind_must_consp(current, pred_tree, $list187);
        v_instances = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, pred_tree, $list187);
        subtrees = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != v_instances) {
                format(stream, $str188$____Instances_of__S_, pred_type);
                if (NIL != verboseP) {
                    format(T, $str188$____Instances_of__S_, pred_type);
                }
                SubLObject pred_type_total = ZERO_INTEGER;
                SubLObject cdolist_list_var = v_instances;
                SubLObject predicate = NIL;
                predicate = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == subl_promotions.memberP(predicate, counted_preds, UNPROVIDED, UNPROVIDED)) {
                        counted_preds = cons(predicate, counted_preds);
                        final SubLObject field_width = $int$40;
                        final SubLObject name = kb_paths.fort_name(predicate);
                        final SubLObject tally = nl_pred_count(predicate);
                        if (tally.isPositive()) {
                            format(stream, $str190$___A, name);
                            SubLObject cdotimes_end_var;
                            SubLObject i;
                            for (cdotimes_end_var = max(ZERO_INTEGER, subtract(field_width, length(name))), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                princ($$$_, stream);
                            }
                            format(stream, $str191$___6___D, tally);
                            if (NIL != verboseP) {
                                format(T, $str190$___A, name);
                                for (cdotimes_end_var = max(ZERO_INTEGER, subtract(field_width, length(name))), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                    princ($$$_, T);
                                }
                                format(T, $str191$___6___D, tally);
                            }
                            pred_type_total = add(pred_type_total, tally);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    predicate = cdolist_list_var.first();
                } 
                if (pred_type_total.isPositive()) {
                    format(T, $str192$__Total_for__S___D, pred_type, pred_type_total);
                    format(stream, $str192$__Total_for__S___D, pred_type, pred_type_total);
                    grand_total = add(grand_total, pred_type_total);
                }
            }
            SubLObject cdolist_list_var2 = subtrees;
            SubLObject subtree = NIL;
            subtree = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                thread.resetMultipleValues();
                final SubLObject grand_total_$172 = count_and_print_nl_preds_int(stream, verboseP, subtree, grand_total, counted_preds);
                final SubLObject counted_preds_$173 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                grand_total = grand_total_$172;
                counted_preds = counted_preds_$173;
                cdolist_list_var2 = cdolist_list_var2.rest();
                subtree = cdolist_list_var2.first();
            } 
        } else {
            cdestructuring_bind_error(pred_tree, $list187);
        }
        return values(grand_total, counted_preds);
    }

    public static SubLObject categorize_nl_preds(SubLObject root_category, SubLObject done_categories, SubLObject siblings) {
        if (root_category == UNPROVIDED) {
            root_category = $$NLPredicate;
        }
        if (done_categories == UNPROVIDED) {
            done_categories = NIL;
        }
        if (siblings == UNPROVIDED) {
            siblings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred_tree = NIL;
        if ((NIL == subl_promotions.memberP(root_category, $non_categorizing_nl_pred_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL == member(root_category, done_categories, UNPROVIDED, UNPROVIDED))) {
            done_categories = cons(root_category, done_categories);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject sub_trees = NIL;
                SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(root_category, $$genls, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                SubLObject spec = NIL;
                spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (((NIL == list_utilities.tree_find(spec, done_categories, UNPROVIDED, UNPROVIDED)) && (NIL == list_utilities.tree_find(spec, siblings, UNPROVIDED, UNPROVIDED))) && (NIL == list_utilities.tree_find(spec, sub_trees, UNPROVIDED, UNPROVIDED))) {
                        final SubLObject sub_tree = categorize_nl_preds(spec, done_categories, cons(sub_trees, siblings));
                        final SubLObject spec_instances = second(sub_tree);
                        if (NIL != list_utilities.lengthL(spec_instances, FIVE_INTEGER, UNPROVIDED)) {
                            SubLObject cdolist_list_var_$174 = third(sub_tree);
                            SubLObject sub_sub_tree = NIL;
                            sub_sub_tree = cdolist_list_var_$174.first();
                            while (NIL != cdolist_list_var_$174) {
                                sub_trees = cons(sub_sub_tree, sub_trees);
                                cdolist_list_var_$174 = cdolist_list_var_$174.rest();
                                sub_sub_tree = cdolist_list_var_$174.first();
                            } 
                        } else {
                            sub_trees = cons(sub_tree, sub_trees);
                        }
                        done_categories = cons(spec, done_categories);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    spec = cdolist_list_var.first();
                } 
                pred_tree = cons(sub_trees, pred_tree);
                SubLObject v_instances = NIL;
                final SubLObject node_var = root_category;
                final SubLObject _prev_bind_0_$175 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_1_$176 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$177 = node_var;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$176 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$177 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$177 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$178 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$178 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                            final SubLObject _prev_bind_0_$179 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$179 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$185 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$177, UNPROVIDED);
                                                while (NIL != node_var_$177) {
                                                    final SubLObject tt_node_var = node_var_$177;
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$180 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$180 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                final SubLObject _prev_bind_0_$181 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$189;
                                                                                    for (iteration_state_$189 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$189); iteration_state_$189 = dictionary_contents.do_dictionary_contents_next(iteration_state_$189)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$189);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$182 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject pred;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if ((((NIL != forts.fort_p(pred)) && (!kb_indexing.num_predicate_extent_index(pred, UNPROVIDED).isZero())) && (NIL == list_utilities.tree_find(pred, pred_tree, UNPROVIDED, UNPROVIDED))) && (NIL == list_utilities.tree_find(pred, siblings, UNPROVIDED, UNPROVIDED))) {
                                                                                                                v_instances = cons(pred, v_instances);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject pred2 = NIL;
                                                                                                        pred2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if ((((NIL != forts.fort_p(pred2)) && (!kb_indexing.num_predicate_extent_index(pred2, UNPROVIDED).isZero())) && (NIL == list_utilities.tree_find(pred2, pred_tree, UNPROVIDED, UNPROVIDED))) && (NIL == list_utilities.tree_find(pred2, siblings, UNPROVIDED, UNPROVIDED))) {
                                                                                                                    v_instances = cons(pred2, v_instances);
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            pred2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$182, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$189);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$181, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                                        destructuring_bind_must_consp(current, datum, $list197);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list197);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list197);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$183 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$184 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject pred;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if ((((NIL != forts.fort_p(pred)) && (!kb_indexing.num_predicate_extent_index(pred, UNPROVIDED).isZero())) && (NIL == list_utilities.tree_find(pred, pred_tree, UNPROVIDED, UNPROVIDED))) && (NIL == list_utilities.tree_find(pred, siblings, UNPROVIDED, UNPROVIDED))) {
                                                                                                            v_instances = cons(pred, v_instances);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$193 = sol;
                                                                                                    SubLObject pred2 = NIL;
                                                                                                    pred2 = csome_list_var_$193.first();
                                                                                                    while (NIL != csome_list_var_$193) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if ((((NIL != forts.fort_p(pred2)) && (!kb_indexing.num_predicate_extent_index(pred2, UNPROVIDED).isZero())) && (NIL == list_utilities.tree_find(pred2, pred_tree, UNPROVIDED, UNPROVIDED))) && (NIL == list_utilities.tree_find(pred2, siblings, UNPROVIDED, UNPROVIDED))) {
                                                                                                                v_instances = cons(pred2, v_instances);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$193 = csome_list_var_$193.rest();
                                                                                                        pred2 = csome_list_var_$193.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$184, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$183, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list197);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$175;
                                                                    final SubLObject new_list = cdolist_list_var_$175 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$175.first();
                                                                    while (NIL != cdolist_list_var_$175) {
                                                                        final SubLObject _prev_bind_0_$185 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject pred3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, pred3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if ((((NIL != forts.fort_p(pred3)) && (!kb_indexing.num_predicate_extent_index(pred3, UNPROVIDED).isZero())) && (NIL == list_utilities.tree_find(pred3, pred_tree, UNPROVIDED, UNPROVIDED))) && (NIL == list_utilities.tree_find(pred3, siblings, UNPROVIDED, UNPROVIDED))) {
                                                                                            v_instances = cons(pred3, v_instances);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var3 = sol2;
                                                                                    SubLObject pred4 = NIL;
                                                                                    pred4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if ((((NIL != forts.fort_p(pred4)) && (!kb_indexing.num_predicate_extent_index(pred4, UNPROVIDED).isZero())) && (NIL == list_utilities.tree_find(pred4, pred_tree, UNPROVIDED, UNPROVIDED))) && (NIL == list_utilities.tree_find(pred4, siblings, UNPROVIDED, UNPROVIDED))) {
                                                                                                v_instances = cons(pred4, v_instances);
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        pred4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$185, thread);
                                                                        }
                                                                        cdolist_list_var_$175 = cdolist_list_var_$175.rest();
                                                                        generating_fn = cdolist_list_var_$175.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$180, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$180, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var = cdolist_list_var2.first();
                                                    } 
                                                    SubLObject cdolist_list_var3;
                                                    final SubLObject accessible_modules2 = cdolist_list_var3 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject module_var2 = NIL;
                                                    module_var2 = cdolist_list_var3.first();
                                                    while (NIL != cdolist_list_var3) {
                                                        final SubLObject _prev_bind_0_$186 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$181 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$177);
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
                                                                                final SubLObject _prev_bind_0_$187 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$190;
                                                                                    for (iteration_state_$190 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$190); iteration_state_$190 = dictionary_contents.do_dictionary_contents_next(iteration_state_$190)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$190);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$188 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$188, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$190);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$187, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$176;
                                                                    final SubLObject new_list2 = cdolist_list_var_$176 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$176.first();
                                                                    while (NIL != cdolist_list_var_$176) {
                                                                        final SubLObject _prev_bind_0_$189 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$189, thread);
                                                                        }
                                                                        cdolist_list_var_$176 = cdolist_list_var_$176.rest();
                                                                        generating_fn2 = cdolist_list_var_$176.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$181, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$186, thread);
                                                        }
                                                        cdolist_list_var3 = cdolist_list_var3.rest();
                                                        module_var2 = cdolist_list_var3.first();
                                                    } 
                                                    node_var_$177 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$185, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$179, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$179, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$178, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$178, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$177, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$177, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$190 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$190, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$176, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$191 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$191, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$176, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$175, thread);
                }
                v_instances = Sort.sort(v_instances, symbol_function($sym129$_), NUM_PREDICATE_EXTENT_INDEX);
                pred_tree = cons(v_instances, pred_tree);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            if (NIL != pred_tree) {
                pred_tree = cons(root_category, pred_tree);
            }
        }
        return pred_tree;
    }

    public static SubLObject fort_lexification_extent() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject loose_preds = isa.all_fort_instances($$ProperNamePredicate_Loose, UNPROVIDED, UNPROVIDED);
        SubLObject real = ZERO_INTEGER;
        SubLObject none = NIL;
        SubLObject loose = NIL;
        final SubLObject message = $$$mapping_Cyc_FORTs;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$205 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$205, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$205);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            SubLObject lex_assertions;
                            SubLObject real_lexP;
                            SubLObject cdolist_list_var_$206;
                            SubLObject as;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                fort = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(fort)) {
                                        fort = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    lex_assertions = all_lexifications_for_term(fort);
                                    real_lexP = NIL;
                                    if (NIL != lex_assertions) {
                                        cdolist_list_var_$206 = lex_assertions;
                                        as = NIL;
                                        as = cdolist_list_var_$206.first();
                                        while (NIL != cdolist_list_var_$206) {
                                            if (NIL == subl_promotions.memberP(assertions_high.assertion_formula(as).first(), loose_preds, UNPROVIDED, UNPROVIDED)) {
                                                real_lexP = T;
                                            }
                                            cdolist_list_var_$206 = cdolist_list_var_$206.rest();
                                            as = cdolist_list_var_$206.first();
                                        } 
                                        if (NIL != real_lexP) {
                                            real = add(real, ONE_INTEGER);
                                        } else {
                                            loose = cons(fort, loose);
                                            format(T, $str202$__LOOSE___S___D_so_far___, fort, length(loose));
                                            format(T, $str203$__S, Mapping.mapcar(symbol_function(THIRD), Mapping.mapcar(symbol_function(ASSERTION_FORMULA), lex_assertions)));
                                        }
                                    } else {
                                        none = cons(fort, none);
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$206 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$206)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$206);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$206);
                            final SubLObject end_id = id_index_next_id(idx_$206);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    final SubLObject lex_assertions2 = all_lexifications_for_term(fort2);
                                    SubLObject real_lexP2 = NIL;
                                    if (NIL != lex_assertions2) {
                                        SubLObject cdolist_list_var_$207 = lex_assertions2;
                                        SubLObject as2 = NIL;
                                        as2 = cdolist_list_var_$207.first();
                                        while (NIL != cdolist_list_var_$207) {
                                            if (NIL == subl_promotions.memberP(assertions_high.assertion_formula(as2).first(), loose_preds, UNPROVIDED, UNPROVIDED)) {
                                                real_lexP2 = T;
                                            }
                                            cdolist_list_var_$207 = cdolist_list_var_$207.rest();
                                            as2 = cdolist_list_var_$207.first();
                                        } 
                                        if (NIL != real_lexP2) {
                                            real = add(real, ONE_INTEGER);
                                        } else {
                                            loose = cons(fort2, loose);
                                            format(T, $str202$__LOOSE___S___D_so_far___, fort2, length(loose));
                                            format(T, $str203$__S, Mapping.mapcar(symbol_function(THIRD), Mapping.mapcar(symbol_function(ASSERTION_FORMULA), lex_assertions2)));
                                        }
                                    } else {
                                        none = cons(fort2, none);
                                    }
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$209 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$209, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        format(T, $str206$____Forts_with_real_lexification_, real);
        format(T, $str207$____Forts_with_loose_lexification, length(loose));
        format(T, $str208$____Forts_with_NO_lexification___, length(none));
        return real;
    }

    public static SubLObject unit_with_no_nlP(final SubLObject fort, SubLObject use_termstringsP) {
        if (use_termstringsP == UNPROVIDED) {
            use_termstringsP = T;
        }
        return makeBoolean(NIL == lexifications_for_term(fort, use_termstringsP, ONE_INTEGER, UNPROVIDED));
    }

    public static SubLObject parse_templates_for_term(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject templates = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = isa.all_fort_instances($$ParseTemplatePredicate_Reln, UNPROVIDED, UNPROVIDED);
            SubLObject template_pred = NIL;
            template_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$210 = kb_mapping.gather_gaf_arg_index(fort, TWO_INTEGER, template_pred, UNPROVIDED, UNPROVIDED);
                SubLObject template = NIL;
                template = cdolist_list_var_$210.first();
                while (NIL != cdolist_list_var_$210) {
                    templates = cons(template, templates);
                    cdolist_list_var_$210 = cdolist_list_var_$210.rest();
                    template = cdolist_list_var_$210.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                template_pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return templates;
    }

    public static SubLObject all_lexifications_for_term(final SubLObject fort) {
        return lexifications_for_term(fort, T, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject proper_lexifications_for_term(final SubLObject fort) {
        return NIL != fort ? lexifications_for_term(fort, NIL, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject lexifications_for_term(final SubLObject fort, SubLObject use_termstringsP, SubLObject max_answers, SubLObject index_limit) {
        if (use_termstringsP == UNPROVIDED) {
            use_termstringsP = T;
        }
        if (max_answers == UNPROVIDED) {
            max_answers = NIL;
        }
        if (index_limit == UNPROVIDED) {
            index_limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject assertions = (NIL != kb_loaded()) ? cached_lexifications_for_term(fort, use_termstringsP, max_answers, $lexification_pred_types$.getGlobalValue(), index_limit) : NIL;
        SubLObject incompleteP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != list_utilities.find_if_not(VALID_ASSERTION, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            remove_cached_lexifications_for_term(fort, use_termstringsP, max_answers, UNPROVIDED, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject assertions_$211 = cached_lexifications_for_term(fort, use_termstringsP, max_answers, $lexification_pred_types$.getGlobalValue(), index_limit);
            final SubLObject incompleteP_$212 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            assertions = assertions_$211;
            incompleteP = incompleteP_$212;
            return values(list_utilities.remove_if_not(VALID_ASSERTION, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), incompleteP);
        }
        return values(assertions, incompleteP);
    }

    public static SubLObject clear_cached_lexifications_for_term() {
        final SubLObject cs = $cached_lexifications_for_term_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_lexifications_for_term(final SubLObject fort, SubLObject use_termstringsP, SubLObject max_answers, SubLObject pred_types, SubLObject index_limit) {
        if (use_termstringsP == UNPROVIDED) {
            use_termstringsP = T;
        }
        if (max_answers == UNPROVIDED) {
            max_answers = NIL;
        }
        if (pred_types == UNPROVIDED) {
            pred_types = $lexification_pred_types$.getGlobalValue();
        }
        if (index_limit == UNPROVIDED) {
            index_limit = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($cached_lexifications_for_term_caching_state$.getGlobalValue(), list(fort, use_termstringsP, max_answers, pred_types, index_limit), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_lexifications_for_term_internal(final SubLObject fort, final SubLObject use_termstringsP, final SubLObject max_answers, final SubLObject pred_types, final SubLObject index_limit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != common_term_in_lexificationsP(fort)) {
            return lexifications_of_common_lexification_term(fort, max_answers);
        }
        SubLObject ans = NIL;
        final SubLObject limit_numberP = numberp(max_answers);
        SubLObject enoughP = NIL;
        SubLObject incompleteP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject filter_preds = (NIL != use_termstringsP) ? NIL : isa.all_fort_instances($$ProperNamePredicate_Loose, UNPROVIDED, UNPROVIDED);
            if (NIL == enoughP) {
                SubLObject csome_list_var = pred_types;
                SubLObject pred_type = NIL;
                pred_type = csome_list_var.first();
                while ((NIL == enoughP) && (NIL != csome_list_var)) {
                    final SubLObject node_var = pred_type;
                    final SubLObject _prev_bind_0_$213 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$214 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            if (NIL == enoughP) {
                                SubLObject node_var_$215 = node_var;
                                final SubLObject deck_type = $STACK;
                                final SubLObject recur_deck = deck.create_deck(deck_type);
                                final SubLObject _prev_bind_0_$214 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject tv_var = NIL;
                                        final SubLObject _prev_bind_0_$215 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$215 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                if (pcase_var.eql($ERROR)) {
                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var.eql($CERROR)) {
                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else
                                                        if (pcase_var.eql($WARN)) {
                                                            Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                        } else {
                                                            Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                            Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                        }


                                            }
                                            final SubLObject _prev_bind_0_$216 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$216 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                                    final SubLObject _prev_bind_0_$217 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$217 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$223 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$215, UNPROVIDED);
                                                        while ((NIL != node_var_$215) && (NIL == enoughP)) {
                                                            final SubLObject tt_node_var = node_var_$215;
                                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                            SubLObject rest;
                                                            SubLObject module_var;
                                                            SubLObject _prev_bind_0_$218;
                                                            SubLObject _prev_bind_1_$218;
                                                            SubLObject node;
                                                            SubLObject d_link;
                                                            SubLObject mt_links;
                                                            SubLObject iteration_state;
                                                            SubLObject mt;
                                                            SubLObject tv_links;
                                                            SubLObject _prev_bind_0_$219;
                                                            SubLObject iteration_state_$227;
                                                            SubLObject tv;
                                                            SubLObject link_nodes;
                                                            SubLObject _prev_bind_0_$220;
                                                            SubLObject sol;
                                                            SubLObject set_contents_var;
                                                            SubLObject basis_object;
                                                            SubLObject state;
                                                            SubLObject pred_var;
                                                            SubLObject pred_var_$229;
                                                            SubLObject iterator_var;
                                                            SubLObject done_var;
                                                            SubLObject token_var;
                                                            SubLObject final_index_spec;
                                                            SubLObject valid;
                                                            SubLObject final_index_iterator;
                                                            SubLObject done_var_$230;
                                                            SubLObject token_var_$231;
                                                            SubLObject as;
                                                            SubLObject valid_$232;
                                                            SubLObject item_var;
                                                            SubLObject cdolist_list_var;
                                                            SubLObject meta;
                                                            SubLObject item_var2;
                                                            SubLObject _prev_bind_0_$221;
                                                            SubLObject _values;
                                                            SubLObject csome_list_var_$234;
                                                            SubLObject pred_var2;
                                                            SubLObject pred_var_$230;
                                                            SubLObject iterator_var2;
                                                            SubLObject done_var2;
                                                            SubLObject token_var2;
                                                            SubLObject final_index_spec2;
                                                            SubLObject valid2;
                                                            SubLObject final_index_iterator2;
                                                            SubLObject done_var_$231;
                                                            SubLObject token_var_$232;
                                                            SubLObject as2;
                                                            SubLObject valid_$233;
                                                            SubLObject item_var3;
                                                            SubLObject cdolist_list_var2;
                                                            SubLObject meta2;
                                                            SubLObject _prev_bind_0_$222;
                                                            SubLObject _values2;
                                                            SubLObject csome_list_var_$235;
                                                            SubLObject instance_tuple;
                                                            SubLObject current;
                                                            SubLObject datum;
                                                            SubLObject link_node;
                                                            SubLObject mt2;
                                                            SubLObject tv2;
                                                            SubLObject _prev_bind_0_$223;
                                                            SubLObject _prev_bind_0_$224;
                                                            SubLObject link_nodes2;
                                                            SubLObject pred_var_$231;
                                                            SubLObject done_var_$232;
                                                            SubLObject token_var_$233;
                                                            SubLObject valid_$234;
                                                            SubLObject _prev_bind_0_$225;
                                                            SubLObject _values3;
                                                            SubLObject csome_list_var_$236;
                                                            SubLObject pred_var_$232;
                                                            SubLObject done_var_$233;
                                                            SubLObject token_var_$234;
                                                            SubLObject valid_$235;
                                                            SubLObject _prev_bind_0_$226;
                                                            SubLObject _values4;
                                                            SubLObject new_list;
                                                            SubLObject rest_$254;
                                                            SubLObject generating_fn;
                                                            SubLObject _prev_bind_0_$227;
                                                            SubLObject sol2;
                                                            SubLObject link_nodes3;
                                                            SubLObject set_contents_var2;
                                                            SubLObject basis_object2;
                                                            SubLObject state2;
                                                            SubLObject pred_var3;
                                                            SubLObject pred_var_$233;
                                                            SubLObject iterator_var3;
                                                            SubLObject done_var3;
                                                            SubLObject token_var3;
                                                            SubLObject final_index_spec3;
                                                            SubLObject valid3;
                                                            SubLObject final_index_iterator3;
                                                            SubLObject done_var_$234;
                                                            SubLObject token_var_$235;
                                                            SubLObject as3;
                                                            SubLObject valid_$236;
                                                            SubLObject item_var4;
                                                            SubLObject cdolist_list_var3;
                                                            SubLObject meta3;
                                                            SubLObject item_var5;
                                                            SubLObject _prev_bind_0_$228;
                                                            SubLObject _values5;
                                                            SubLObject csome_list_var_$237;
                                                            SubLObject pred_var4;
                                                            SubLObject pred_var_$234;
                                                            SubLObject iterator_var4;
                                                            SubLObject done_var4;
                                                            SubLObject token_var4;
                                                            SubLObject final_index_spec4;
                                                            SubLObject valid4;
                                                            SubLObject final_index_iterator4;
                                                            SubLObject done_var_$235;
                                                            SubLObject token_var_$236;
                                                            SubLObject as4;
                                                            SubLObject valid_$237;
                                                            SubLObject item_var6;
                                                            SubLObject cdolist_list_var4;
                                                            SubLObject meta4;
                                                            SubLObject _prev_bind_0_$229;
                                                            SubLObject _values6;
                                                            for (rest = NIL, rest = accessible_modules; (NIL == enoughP) && (NIL != rest); rest = rest.rest()) {
                                                                module_var = rest.first();
                                                                _prev_bind_0_$218 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                _prev_bind_1_$218 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                    node = function_terms.naut_to_nart(tt_node_var);
                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != d_link) {
                                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                            if (NIL != mt_links) {
                                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == enoughP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                    tv_links = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                        _prev_bind_0_$219 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                            for (iteration_state_$227 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == enoughP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$227)); iteration_state_$227 = dictionary_contents.do_dictionary_contents_next(iteration_state_$227)) {
                                                                                                thread.resetMultipleValues();
                                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$227);
                                                                                                link_nodes = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                    _prev_bind_0_$220 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        sol = link_nodes;
                                                                                                        if (NIL != set.set_p(sol)) {
                                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == enoughP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                pred_var = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, pred_var)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred_var, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred_var, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    if (NIL != forts.fort_p(pred_var)) {
                                                                                                                        pred_var_$229 = pred_var;
                                                                                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, NIL, pred_var_$229)) {
                                                                                                                            iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, NIL, pred_var_$229);
                                                                                                                            done_var = enoughP;
                                                                                                                            token_var = NIL;
                                                                                                                            while (NIL == done_var) {
                                                                                                                                final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                                                valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                                                                                if (NIL != valid) {
                                                                                                                                    final_index_iterator = NIL;
                                                                                                                                    try {
                                                                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                                                                        done_var_$230 = enoughP;
                                                                                                                                        token_var_$231 = NIL;
                                                                                                                                        while (NIL == done_var_$230) {
                                                                                                                                            as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$231);
                                                                                                                                            valid_$232 = makeBoolean(!token_var_$231.eql(as));
                                                                                                                                            if (((NIL != valid_$232) && (NIL != subl_promotions.memberP(fort, assertions_high.gaf_args(as), UNPROVIDED, UNPROVIDED))) && (NIL == member(assertions_high.gaf_arg0(as), filter_preds, UNPROVIDED, UNPROVIDED))) {
                                                                                                                                                item_var = as;
                                                                                                                                                if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                                    ans = cons(item_var, ans);
                                                                                                                                                }
                                                                                                                                                cdolist_list_var = assertion_utilities.all_meta_assertions(as);
                                                                                                                                                meta = NIL;
                                                                                                                                                meta = cdolist_list_var.first();
                                                                                                                                                while (NIL != cdolist_list_var) {
                                                                                                                                                    if (NIL != isa.isaP(cycl_utilities.formula_arg0(meta), $$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                        item_var2 = meta;
                                                                                                                                                        if (NIL == member(item_var2, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                                            ans = cons(item_var2, ans);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    cdolist_list_var = cdolist_list_var.rest();
                                                                                                                                                    meta = cdolist_list_var.first();
                                                                                                                                                } 
                                                                                                                                                if ((NIL != limit_numberP) && (NIL != list_utilities.lengthGE(ans, max_answers, UNPROVIDED))) {
                                                                                                                                                    enoughP = T;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            done_var_$230 = makeBoolean((NIL == valid_$232) || (NIL != enoughP));
                                                                                                                                        } 
                                                                                                                                    } finally {
                                                                                                                                        _prev_bind_0_$221 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                            _values = getValuesAsVector();
                                                                                                                                            if (NIL != final_index_iterator) {
                                                                                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                                            }
                                                                                                                                            restoreValuesFromVector(_values);
                                                                                                                                        } finally {
                                                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$221, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                done_var = makeBoolean((NIL == valid) || (NIL != enoughP));
                                                                                                                            } 
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else
                                                                                                            if (sol.isList()) {
                                                                                                                if (NIL == enoughP) {
                                                                                                                    csome_list_var_$234 = sol;
                                                                                                                    pred_var2 = NIL;
                                                                                                                    pred_var2 = csome_list_var_$234.first();
                                                                                                                    while ((NIL == enoughP) && (NIL != csome_list_var_$234)) {
                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                            if (NIL != forts.fort_p(pred_var2)) {
                                                                                                                                pred_var_$230 = pred_var2;
                                                                                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, NIL, pred_var_$230)) {
                                                                                                                                    iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, NIL, pred_var_$230);
                                                                                                                                    done_var2 = enoughP;
                                                                                                                                    token_var2 = NIL;
                                                                                                                                    while (NIL == done_var2) {
                                                                                                                                        final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                                                                                                        valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                                                                                                        if (NIL != valid2) {
                                                                                                                                            final_index_iterator2 = NIL;
                                                                                                                                            try {
                                                                                                                                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                                                                                                                                done_var_$231 = enoughP;
                                                                                                                                                token_var_$232 = NIL;
                                                                                                                                                while (NIL == done_var_$231) {
                                                                                                                                                    as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$232);
                                                                                                                                                    valid_$233 = makeBoolean(!token_var_$232.eql(as2));
                                                                                                                                                    if (((NIL != valid_$233) && (NIL != subl_promotions.memberP(fort, assertions_high.gaf_args(as2), UNPROVIDED, UNPROVIDED))) && (NIL == member(assertions_high.gaf_arg0(as2), filter_preds, UNPROVIDED, UNPROVIDED))) {
                                                                                                                                                        item_var3 = as2;
                                                                                                                                                        if (NIL == member(item_var3, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                                            ans = cons(item_var3, ans);
                                                                                                                                                        }
                                                                                                                                                        cdolist_list_var2 = assertion_utilities.all_meta_assertions(as2);
                                                                                                                                                        meta2 = NIL;
                                                                                                                                                        meta2 = cdolist_list_var2.first();
                                                                                                                                                        while (NIL != cdolist_list_var2) {
                                                                                                                                                            if (NIL != isa.isaP(cycl_utilities.formula_arg0(meta2), $$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                                item_var = meta2;
                                                                                                                                                                if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                                                    ans = cons(item_var, ans);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                                                                                                                            meta2 = cdolist_list_var2.first();
                                                                                                                                                        } 
                                                                                                                                                        if ((NIL != limit_numberP) && (NIL != list_utilities.lengthGE(ans, max_answers, UNPROVIDED))) {
                                                                                                                                                            enoughP = T;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    done_var_$231 = makeBoolean((NIL == valid_$233) || (NIL != enoughP));
                                                                                                                                                } 
                                                                                                                                            } finally {
                                                                                                                                                _prev_bind_0_$222 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                    _values2 = getValuesAsVector();
                                                                                                                                                    if (NIL != final_index_iterator2) {
                                                                                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                                                                                                    }
                                                                                                                                                    restoreValuesFromVector(_values2);
                                                                                                                                                } finally {
                                                                                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$222, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        done_var2 = makeBoolean((NIL == valid2) || (NIL != enoughP));
                                                                                                                                    } 
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        csome_list_var_$234 = csome_list_var_$234.rest();
                                                                                                                        pred_var2 = csome_list_var_$234.first();
                                                                                                                    } 
                                                                                                                }
                                                                                                            } else {
                                                                                                                Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                            }

                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$220, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$227);
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$219, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        } else {
                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                        if ((NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) && (NIL == enoughP)) {
                                                                            csome_list_var_$235 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                            instance_tuple = NIL;
                                                                            instance_tuple = csome_list_var_$235.first();
                                                                            while ((NIL == enoughP) && (NIL != csome_list_var_$235)) {
                                                                                datum = current = instance_tuple;
                                                                                link_node = NIL;
                                                                                mt2 = NIL;
                                                                                tv2 = NIL;
                                                                                destructuring_bind_must_consp(current, datum, $list197);
                                                                                link_node = current.first();
                                                                                current = current.rest();
                                                                                destructuring_bind_must_consp(current, datum, $list197);
                                                                                mt2 = current.first();
                                                                                current = current.rest();
                                                                                destructuring_bind_must_consp(current, datum, $list197);
                                                                                tv2 = current.first();
                                                                                current = current.rest();
                                                                                if (NIL == current) {
                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                        _prev_bind_0_$223 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                _prev_bind_0_$224 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                    link_nodes2 = sol = list(link_node);
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == enoughP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            pred_var = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, pred_var)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred_var, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred_var, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(pred_var)) {
                                                                                                                    pred_var_$231 = pred_var;
                                                                                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, NIL, pred_var_$231)) {
                                                                                                                        iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, NIL, pred_var_$231);
                                                                                                                        done_var = enoughP;
                                                                                                                        token_var = NIL;
                                                                                                                        while (NIL == done_var) {
                                                                                                                            final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                                                            valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                                                                            if (NIL != valid) {
                                                                                                                                final_index_iterator = NIL;
                                                                                                                                try {
                                                                                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                                                                    done_var_$232 = enoughP;
                                                                                                                                    token_var_$233 = NIL;
                                                                                                                                    while (NIL == done_var_$232) {
                                                                                                                                        as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$233);
                                                                                                                                        valid_$234 = makeBoolean(!token_var_$233.eql(as));
                                                                                                                                        if (((NIL != valid_$234) && (NIL != subl_promotions.memberP(fort, assertions_high.gaf_args(as), UNPROVIDED, UNPROVIDED))) && (NIL == member(assertions_high.gaf_arg0(as), filter_preds, UNPROVIDED, UNPROVIDED))) {
                                                                                                                                            item_var = as;
                                                                                                                                            if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                                ans = cons(item_var, ans);
                                                                                                                                            }
                                                                                                                                            cdolist_list_var = assertion_utilities.all_meta_assertions(as);
                                                                                                                                            meta = NIL;
                                                                                                                                            meta = cdolist_list_var.first();
                                                                                                                                            while (NIL != cdolist_list_var) {
                                                                                                                                                if (NIL != isa.isaP(cycl_utilities.formula_arg0(meta), $$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                    item_var2 = meta;
                                                                                                                                                    if (NIL == member(item_var2, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                                        ans = cons(item_var2, ans);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                cdolist_list_var = cdolist_list_var.rest();
                                                                                                                                                meta = cdolist_list_var.first();
                                                                                                                                            } 
                                                                                                                                            if ((NIL != limit_numberP) && (NIL != list_utilities.lengthGE(ans, max_answers, UNPROVIDED))) {
                                                                                                                                                enoughP = T;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        done_var_$232 = makeBoolean((NIL == valid_$234) || (NIL != enoughP));
                                                                                                                                    } 
                                                                                                                                } finally {
                                                                                                                                    _prev_bind_0_$225 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                        _values3 = getValuesAsVector();
                                                                                                                                        if (NIL != final_index_iterator) {
                                                                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                                        }
                                                                                                                                        restoreValuesFromVector(_values3);
                                                                                                                                    } finally {
                                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$225, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            done_var = makeBoolean((NIL == valid) || (NIL != enoughP));
                                                                                                                        } 
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            if (NIL == enoughP) {
                                                                                                                csome_list_var_$236 = sol;
                                                                                                                pred_var2 = NIL;
                                                                                                                pred_var2 = csome_list_var_$236.first();
                                                                                                                while ((NIL == enoughP) && (NIL != csome_list_var_$236)) {
                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred_var2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                        if (NIL != forts.fort_p(pred_var2)) {
                                                                                                                            pred_var_$232 = pred_var2;
                                                                                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, NIL, pred_var_$232)) {
                                                                                                                                iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, NIL, pred_var_$232);
                                                                                                                                done_var2 = enoughP;
                                                                                                                                token_var2 = NIL;
                                                                                                                                while (NIL == done_var2) {
                                                                                                                                    final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                                                                                                    valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                                                                                                    if (NIL != valid2) {
                                                                                                                                        final_index_iterator2 = NIL;
                                                                                                                                        try {
                                                                                                                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                                                                                                                            done_var_$233 = enoughP;
                                                                                                                                            token_var_$234 = NIL;
                                                                                                                                            while (NIL == done_var_$233) {
                                                                                                                                                as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$234);
                                                                                                                                                valid_$235 = makeBoolean(!token_var_$234.eql(as2));
                                                                                                                                                if (((NIL != valid_$235) && (NIL != subl_promotions.memberP(fort, assertions_high.gaf_args(as2), UNPROVIDED, UNPROVIDED))) && (NIL == member(assertions_high.gaf_arg0(as2), filter_preds, UNPROVIDED, UNPROVIDED))) {
                                                                                                                                                    item_var3 = as2;
                                                                                                                                                    if (NIL == member(item_var3, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                                        ans = cons(item_var3, ans);
                                                                                                                                                    }
                                                                                                                                                    cdolist_list_var2 = assertion_utilities.all_meta_assertions(as2);
                                                                                                                                                    meta2 = NIL;
                                                                                                                                                    meta2 = cdolist_list_var2.first();
                                                                                                                                                    while (NIL != cdolist_list_var2) {
                                                                                                                                                        if (NIL != isa.isaP(cycl_utilities.formula_arg0(meta2), $$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                            item_var = meta2;
                                                                                                                                                            if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                                                ans = cons(item_var, ans);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                                                                                                                        meta2 = cdolist_list_var2.first();
                                                                                                                                                    } 
                                                                                                                                                    if ((NIL != limit_numberP) && (NIL != list_utilities.lengthGE(ans, max_answers, UNPROVIDED))) {
                                                                                                                                                        enoughP = T;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                done_var_$233 = makeBoolean((NIL == valid_$235) || (NIL != enoughP));
                                                                                                                                            } 
                                                                                                                                        } finally {
                                                                                                                                            _prev_bind_0_$226 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                _values4 = getValuesAsVector();
                                                                                                                                                if (NIL != final_index_iterator2) {
                                                                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                                                                                                }
                                                                                                                                                restoreValuesFromVector(_values4);
                                                                                                                                            } finally {
                                                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$226, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    done_var2 = makeBoolean((NIL == valid2) || (NIL != enoughP));
                                                                                                                                } 
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    csome_list_var_$236 = csome_list_var_$236.rest();
                                                                                                                    pred_var2 = csome_list_var_$236.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        } else {
                                                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$224, thread);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$223, thread);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    cdestructuring_bind_error(datum, $list197);
                                                                                }
                                                                                csome_list_var_$235 = csome_list_var_$235.rest();
                                                                                instance_tuple = csome_list_var_$235.first();
                                                                            } 
                                                                        }
                                                                    } else
                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                            for (rest_$254 = NIL, rest_$254 = new_list; (NIL == enoughP) && (NIL != rest_$254); rest_$254 = rest_$254.rest()) {
                                                                                generating_fn = rest_$254.first();
                                                                                _prev_bind_0_$227 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                    link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                                    if (NIL != set.set_p(sol2)) {
                                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == enoughP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                            pred_var3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, pred_var3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred_var3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred_var3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (NIL != forts.fort_p(pred_var3)) {
                                                                                                    pred_var_$233 = pred_var3;
                                                                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, NIL, pred_var_$233)) {
                                                                                                        iterator_var3 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, NIL, pred_var_$233);
                                                                                                        done_var3 = enoughP;
                                                                                                        token_var3 = NIL;
                                                                                                        while (NIL == done_var3) {
                                                                                                            final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                                                                                                            valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                                                                                                            if (NIL != valid3) {
                                                                                                                final_index_iterator3 = NIL;
                                                                                                                try {
                                                                                                                    final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, $GAF, NIL, NIL);
                                                                                                                    done_var_$234 = enoughP;
                                                                                                                    token_var_$235 = NIL;
                                                                                                                    while (NIL == done_var_$234) {
                                                                                                                        as3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$235);
                                                                                                                        valid_$236 = makeBoolean(!token_var_$235.eql(as3));
                                                                                                                        if (((NIL != valid_$236) && (NIL != subl_promotions.memberP(fort, assertions_high.gaf_args(as3), UNPROVIDED, UNPROVIDED))) && (NIL == member(assertions_high.gaf_arg0(as3), filter_preds, UNPROVIDED, UNPROVIDED))) {
                                                                                                                            item_var4 = as3;
                                                                                                                            if (NIL == member(item_var4, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                ans = cons(item_var4, ans);
                                                                                                                            }
                                                                                                                            cdolist_list_var3 = assertion_utilities.all_meta_assertions(as3);
                                                                                                                            meta3 = NIL;
                                                                                                                            meta3 = cdolist_list_var3.first();
                                                                                                                            while (NIL != cdolist_list_var3) {
                                                                                                                                if (NIL != isa.isaP(cycl_utilities.formula_arg0(meta3), $$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED)) {
                                                                                                                                    item_var5 = meta3;
                                                                                                                                    if (NIL == member(item_var5, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                        ans = cons(item_var5, ans);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                                                                                                meta3 = cdolist_list_var3.first();
                                                                                                                            } 
                                                                                                                            if ((NIL != limit_numberP) && (NIL != list_utilities.lengthGE(ans, max_answers, UNPROVIDED))) {
                                                                                                                                enoughP = T;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        done_var_$234 = makeBoolean((NIL == valid_$236) || (NIL != enoughP));
                                                                                                                    } 
                                                                                                                } finally {
                                                                                                                    _prev_bind_0_$228 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                        _values5 = getValuesAsVector();
                                                                                                                        if (NIL != final_index_iterator3) {
                                                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                                                                                                        }
                                                                                                                        restoreValuesFromVector(_values5);
                                                                                                                    } finally {
                                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$228, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            done_var3 = makeBoolean((NIL == valid3) || (NIL != enoughP));
                                                                                                        } 
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol2.isList()) {
                                                                                            if (NIL == enoughP) {
                                                                                                csome_list_var_$237 = sol2;
                                                                                                pred_var4 = NIL;
                                                                                                pred_var4 = csome_list_var_$237.first();
                                                                                                while ((NIL == enoughP) && (NIL != csome_list_var_$237)) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred_var4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred_var4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(pred_var4)) {
                                                                                                            pred_var_$234 = pred_var4;
                                                                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, NIL, pred_var_$234)) {
                                                                                                                iterator_var4 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, NIL, pred_var_$234);
                                                                                                                done_var4 = enoughP;
                                                                                                                token_var4 = NIL;
                                                                                                                while (NIL == done_var4) {
                                                                                                                    final_index_spec4 = iteration.iteration_next_without_values_macro_helper(iterator_var4, token_var4);
                                                                                                                    valid4 = makeBoolean(!token_var4.eql(final_index_spec4));
                                                                                                                    if (NIL != valid4) {
                                                                                                                        final_index_iterator4 = NIL;
                                                                                                                        try {
                                                                                                                            final_index_iterator4 = kb_mapping_macros.new_final_index_iterator(final_index_spec4, $GAF, NIL, NIL);
                                                                                                                            done_var_$235 = enoughP;
                                                                                                                            token_var_$236 = NIL;
                                                                                                                            while (NIL == done_var_$235) {
                                                                                                                                as4 = iteration.iteration_next_without_values_macro_helper(final_index_iterator4, token_var_$236);
                                                                                                                                valid_$237 = makeBoolean(!token_var_$236.eql(as4));
                                                                                                                                if (((NIL != valid_$237) && (NIL != subl_promotions.memberP(fort, assertions_high.gaf_args(as4), UNPROVIDED, UNPROVIDED))) && (NIL == member(assertions_high.gaf_arg0(as4), filter_preds, UNPROVIDED, UNPROVIDED))) {
                                                                                                                                    item_var6 = as4;
                                                                                                                                    if (NIL == member(item_var6, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                        ans = cons(item_var6, ans);
                                                                                                                                    }
                                                                                                                                    cdolist_list_var4 = assertion_utilities.all_meta_assertions(as4);
                                                                                                                                    meta4 = NIL;
                                                                                                                                    meta4 = cdolist_list_var4.first();
                                                                                                                                    while (NIL != cdolist_list_var4) {
                                                                                                                                        if (NIL != isa.isaP(cycl_utilities.formula_arg0(meta4), $$NLPragmaticPredicate, UNPROVIDED, UNPROVIDED)) {
                                                                                                                                            item_var4 = meta4;
                                                                                                                                            if (NIL == member(item_var4, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                                                                                ans = cons(item_var4, ans);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        cdolist_list_var4 = cdolist_list_var4.rest();
                                                                                                                                        meta4 = cdolist_list_var4.first();
                                                                                                                                    } 
                                                                                                                                    if ((NIL != limit_numberP) && (NIL != list_utilities.lengthGE(ans, max_answers, UNPROVIDED))) {
                                                                                                                                        enoughP = T;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                done_var_$235 = makeBoolean((NIL == valid_$237) || (NIL != enoughP));
                                                                                                                            } 
                                                                                                                        } finally {
                                                                                                                            _prev_bind_0_$229 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                _values6 = getValuesAsVector();
                                                                                                                                if (NIL != final_index_iterator4) {
                                                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator4);
                                                                                                                                }
                                                                                                                                restoreValuesFromVector(_values6);
                                                                                                                            } finally {
                                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$229, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    done_var4 = makeBoolean((NIL == valid4) || (NIL != enoughP));
                                                                                                                } 
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$237 = csome_list_var_$237.rest();
                                                                                                    pred_var4 = csome_list_var_$237.first();
                                                                                                } 
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$227, thread);
                                                                                }
                                                                            }
                                                                        }

                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$218, thread);
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$218, thread);
                                                                }
                                                            }
                                                            final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                            SubLObject rest2;
                                                            SubLObject module_var2;
                                                            SubLObject _prev_bind_0_$230;
                                                            SubLObject _prev_bind_1_$219;
                                                            SubLObject node2;
                                                            SubLObject d_link2;
                                                            SubLObject mt_links2;
                                                            SubLObject iteration_state2;
                                                            SubLObject mt3;
                                                            SubLObject tv_links2;
                                                            SubLObject _prev_bind_0_$231;
                                                            SubLObject iteration_state_$228;
                                                            SubLObject link_nodes4;
                                                            SubLObject _prev_bind_0_$232;
                                                            SubLObject sol3;
                                                            SubLObject set_contents_var3;
                                                            SubLObject basis_object3;
                                                            SubLObject state3;
                                                            SubLObject node_vars_link_node;
                                                            SubLObject csome_list_var_$238;
                                                            SubLObject node_vars_link_node2;
                                                            SubLObject new_list2;
                                                            SubLObject rest_$255;
                                                            SubLObject generating_fn2;
                                                            SubLObject _prev_bind_0_$233;
                                                            SubLObject sol4;
                                                            SubLObject link_nodes5;
                                                            SubLObject set_contents_var4;
                                                            SubLObject basis_object4;
                                                            SubLObject state4;
                                                            SubLObject node_vars_link_node3;
                                                            SubLObject csome_list_var_$239;
                                                            SubLObject node_vars_link_node4;
                                                            for (rest2 = NIL, rest2 = accessible_modules2; (NIL == enoughP) && (NIL != rest2); rest2 = rest2.rest()) {
                                                                module_var2 = rest2.first();
                                                                _prev_bind_0_$230 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                _prev_bind_1_$219 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                    node2 = function_terms.naut_to_nart(node_var_$215);
                                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                        d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != d_link2) {
                                                                            mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                            if (NIL != mt_links2) {
                                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); (NIL == enoughP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2)); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                                    thread.resetMultipleValues();
                                                                                    mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                                    tv_links2 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                        _prev_bind_0_$231 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                            for (iteration_state_$228 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); (NIL == enoughP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$228)); iteration_state_$228 = dictionary_contents.do_dictionary_contents_next(iteration_state_$228)) {
                                                                                                thread.resetMultipleValues();
                                                                                                tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$228);
                                                                                                link_nodes4 = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                    _prev_bind_0_$232 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                        sol3 = link_nodes4;
                                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                                            set_contents_var3 = set.do_set_internal(sol3);
                                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); (NIL == enoughP) && (NIL == set_contents.do_set_contents_doneP(basis_object3, state3)); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                }
                                                                                                            }
                                                                                                        } else
                                                                                                            if (sol3.isList()) {
                                                                                                                if (NIL == enoughP) {
                                                                                                                    csome_list_var_$238 = sol3;
                                                                                                                    node_vars_link_node2 = NIL;
                                                                                                                    node_vars_link_node2 = csome_list_var_$238.first();
                                                                                                                    while ((NIL == enoughP) && (NIL != csome_list_var_$238)) {
                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                        }
                                                                                                                        csome_list_var_$238 = csome_list_var_$238.rest();
                                                                                                                        node_vars_link_node2 = csome_list_var_$238.first();
                                                                                                                    } 
                                                                                                                }
                                                                                                            } else {
                                                                                                                Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                            }

                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$232, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$228);
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$231, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                            }
                                                                        } else {
                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                    } else
                                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                            new_list2 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                            for (rest_$255 = NIL, rest_$255 = new_list2; (NIL == enoughP) && (NIL != rest_$255); rest_$255 = rest_$255.rest()) {
                                                                                generating_fn2 = rest_$255.first();
                                                                                _prev_bind_0_$233 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                                    link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                                    if (NIL != set.set_p(sol4)) {
                                                                                        set_contents_var4 = set.do_set_internal(sol4);
                                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); (NIL == enoughP) && (NIL == set_contents.do_set_contents_doneP(basis_object4, state4)); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol4.isList()) {
                                                                                            if (NIL == enoughP) {
                                                                                                csome_list_var_$239 = sol4;
                                                                                                node_vars_link_node4 = NIL;
                                                                                                node_vars_link_node4 = csome_list_var_$239.first();
                                                                                                while ((NIL == enoughP) && (NIL != csome_list_var_$239)) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var_$239 = csome_list_var_$239.rest();
                                                                                                    node_vars_link_node4 = csome_list_var_$239.first();
                                                                                                } 
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$233, thread);
                                                                                }
                                                                            }
                                                                        }

                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$219, thread);
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$230, thread);
                                                                }
                                                            }
                                                            node_var_$215 = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$223, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$217, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$217, thread);
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$216, thread);
                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$216, thread);
                                            }
                                        } finally {
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$215, thread);
                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$215, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$234 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values7 = getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            restoreValuesFromVector(_values7);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$234, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$214, thread);
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$235 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values8 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values8);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$235, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$214, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$213, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    pred_type = csome_list_var.first();
                } 
            }
            final SubLObject gtqs = set.new_set(symbol_function(EQL), UNPROVIDED);
            incompleteP = list_utilities.sublisp_boolean(gtqs_lexifications(fort, gtqs, limit_numberP, max_answers, index_limit));
            final SubLObject set_contents_var5 = set.do_set_internal(gtqs);
            SubLObject basis_object5;
            SubLObject state5;
            SubLObject gtqs_as;
            SubLObject item_var7;
            for (basis_object5 = set_contents.do_set_contents_basis_object(set_contents_var5), state5 = NIL, state5 = set_contents.do_set_contents_initial_state(basis_object5, set_contents_var5); NIL == set_contents.do_set_contents_doneP(basis_object5, state5); state5 = set_contents.do_set_contents_update_state(state5)) {
                gtqs_as = set_contents.do_set_contents_next(basis_object5, state5);
                if (NIL != set_contents.do_set_contents_element_validP(state5, gtqs_as)) {
                    item_var7 = gtqs_as;
                    if (NIL == member(item_var7, ans, KBEQ, symbol_function(IDENTITY))) {
                        ans = cons(item_var7, ans);
                    }
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return values(ans, incompleteP);
    }

    public static SubLObject cached_lexifications_for_term(final SubLObject fort, SubLObject use_termstringsP, SubLObject max_answers, SubLObject pred_types, SubLObject index_limit) {
        if (use_termstringsP == UNPROVIDED) {
            use_termstringsP = T;
        }
        if (max_answers == UNPROVIDED) {
            max_answers = NIL;
        }
        if (pred_types == UNPROVIDED) {
            pred_types = $lexification_pred_types$.getGlobalValue();
        }
        if (index_limit == UNPROVIDED) {
            index_limit = NIL;
        }
        SubLObject caching_state = $cached_lexifications_for_term_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_LEXIFICATIONS_FOR_TERM, $cached_lexifications_for_term_caching_state$, NIL, EQL, FIVE_INTEGER, $int$1024);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CACHED_LEXIFICATIONS_FOR_TERM);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(fort, use_termstringsP, max_answers, pred_types, index_limit);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (fort.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (use_termstringsP.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (max_answers.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (pred_types.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && index_limit.eql(cached_args.first())) {
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
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_lexifications_for_term_internal(fort, use_termstringsP, max_answers, pred_types, index_limit)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(fort, use_termstringsP, max_answers, pred_types, index_limit));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject gtqs_lexifications(final SubLObject fort, final SubLObject ans, final SubLObject limit_numberP, final SubLObject max_answers, SubLObject index_limit) {
        if (index_limit == UNPROVIDED) {
            index_limit = NIL;
        }
        SubLObject enoughP = NIL;
        final SubLObject overlapping_terms = list(fort, $$genTemplate_QuerySentence);
        if (NIL == fort_types_interface.predicate_p(fort)) {
            return NIL;
        }
        if (index_limit.isNumber() && virtual_indexing.estimated_num_overlap_index(overlapping_terms, UNPROVIDED).numG(index_limit)) {
            return $TOO_MANY_TO_CHECK;
        }
        if (NIL == enoughP) {
            SubLObject csome_list_var = virtual_indexing.assertions_mentioning_terms(overlapping_terms, UNPROVIDED);
            SubLObject as = NIL;
            as = csome_list_var.first();
            while ((NIL == enoughP) && (NIL != csome_list_var)) {
                if ((NIL != kb_utilities.kbeq(cycl_utilities.formula_arg0(as), $$genTemplate_QuerySentence)) && (NIL != cycl_utilities.expression_find(fort, as, T, symbol_function(KBEQ), FORMULA_ARG0))) {
                    set.set_add(as, ans);
                    if ((NIL != limit_numberP) && set.set_size(ans).numGE(max_answers)) {
                        enoughP = T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                as = csome_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject common_term_in_lexificationsP(final SubLObject fort) {
        return makeBoolean(((NIL != isa.isa_in_any_mtP(fort, $$LexicalWord)) || (NIL != isa.isa_in_any_mtP(fort, $$NLSyntacticPredicate))) || ((NIL != isa.isa_in_any_mtP(fort, $$LinguisticObjectType)) && (NIL == isa.isa_in_any_mtP(fort, $$CycLExpressionType))));
    }

    public static SubLObject lexifications_of_common_lexification_term(final SubLObject fort, SubLObject max_answers) {
        if (max_answers == UNPROVIDED) {
            max_answers = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject enoughP = NIL;
        final SubLObject limit_numberP = max_answers;
        if (NIL == enoughP) {
            SubLObject csome_list_var = $lexification_pred_types$.getGlobalValue();
            SubLObject pred_type = NIL;
            pred_type = csome_list_var.first();
            while ((NIL == enoughP) && (NIL != csome_list_var)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL == enoughP) {
                        SubLObject csome_list_var_$278 = isa.all_fort_instances(pred_type, UNPROVIDED, UNPROVIDED);
                        SubLObject pred = NIL;
                        pred = csome_list_var_$278.first();
                        while ((NIL == enoughP) && (NIL != csome_list_var_$278)) {
                            final SubLObject denot_arg = denotatum_arg_of_pred_cached(pred);
                            if ((NIL != denot_arg) && (NIL == enoughP)) {
                                SubLObject csome_list_var_$279 = kb_mapping.gather_gaf_arg_index(fort, denot_arg, pred, UNPROVIDED, UNPROVIDED);
                                SubLObject as = NIL;
                                as = csome_list_var_$279.first();
                                while ((NIL == enoughP) && (NIL != csome_list_var_$279)) {
                                    final SubLObject item_var = as;
                                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                    if ((NIL != limit_numberP) && length(ans).numGE(max_answers)) {
                                        enoughP = T;
                                    }
                                    csome_list_var_$279 = csome_list_var_$279.rest();
                                    as = csome_list_var_$279.first();
                                } 
                            }
                            csome_list_var_$278 = csome_list_var_$278.rest();
                            pred = csome_list_var_$278.first();
                        } 
                    }
                    if (NIL != kb_mapping_macros.do_other_index_key_validator(fort, $GAF)) {
                        final SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec(fort);
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(as));
                                if ((((NIL != valid) && (NIL != kb_mapping_macros.do_other_index_assertion_match_p(as))) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg0(as), $$genTemplate_QuerySentence))) && (NIL != cycl_utilities.expression_find(fort, as, T, symbol_function(KBEQ), FORMULA_ARG0))) {
                                    final SubLObject item_var2 = as;
                                    if (NIL == member(item_var2, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var2, ans);
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
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
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                csome_list_var = csome_list_var.rest();
                pred_type = csome_list_var.first();
            } 
        }
        return ans;
    }

    public static SubLObject gen_string_assertions_for_term(final SubLObject v_term, SubLObject mt, SubLObject precise_onlyP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (precise_onlyP == UNPROVIDED) {
            precise_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == forts.fort_p(v_term)) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$281 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$282 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL == precise_onlyP) {
                    final SubLObject terse_pred = constants_high.find_constant($str224$genStringAssertion_Terse);
                    if (NIL != valid_constantP(terse_pred, UNPROVIDED)) {
                        ans = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, terse_pred, UNPROVIDED, UNPROVIDED);
                    }
                    SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, $$genStringAssertion, UNPROVIDED, UNPROVIDED);
                    SubLObject as = NIL;
                    as = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        ans = cons(as, ans);
                        cdolist_list_var = cdolist_list_var.rest();
                        as = cdolist_list_var.first();
                    } 
                }
                if ((NIL != precise_onlyP) || (NIL != pph_utilities.pph_top_level_preciseP())) {
                    SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, $$genStringAssertion_Precise, UNPROVIDED, UNPROVIDED);
                    SubLObject as = NIL;
                    as = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        ans = cons(as, ans);
                        cdolist_list_var = cdolist_list_var.rest();
                        as = cdolist_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$282, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$281, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != pph_utilities.pph_terse_mode_p()) {
            ans = nreverse(ans);
        }
        return ans;
    }

    public static SubLObject preferred_lexifications_for_term(final SubLObject v_term, SubLObject mt, SubLObject precise_onlyP, SubLObject nl_preds) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (precise_onlyP == UNPROVIDED) {
            precise_onlyP = NIL;
        }
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == forts.fort_p(v_term)) {
            return NIL;
        }
        SubLObject lexification_lists = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$283 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$284 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL == precise_onlyP) {
                    final SubLObject terse_pred = $$genStringAssertion_Terse;
                    if (NIL != valid_constantP(terse_pred, UNPROVIDED)) {
                        lexification_lists = cons(Mapping.mapcar(LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION, Sort.sort(Mapping.mapcar(GAF_ARG2, kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, terse_pred, UNPROVIDED, UNPROVIDED)), $sym230$PREFER_LEXICAL_ASSERTION_, UNPROVIDED)), lexification_lists);
                    }
                    lexification_lists = cons(get_preferred_lexifications_via_indexing(v_term, nl_preds), lexification_lists);
                }
                if ((NIL != precise_onlyP) || (NIL != pph_utilities.pph_top_level_preciseP())) {
                    final SubLObject assertions = Sort.sort(kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, $$genStringAssertion_Precise, UNPROVIDED, UNPROVIDED), $sym230$PREFER_LEXICAL_ASSERTION_, UNPROVIDED);
                    final SubLObject sentences = Mapping.mapcar(LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION, assertions);
                    lexification_lists = cons(sentences, lexification_lists);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$284, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$283, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != pph_utilities.pph_terse_mode_p()) {
            lexification_lists = nreverse(lexification_lists);
        }
        return list_utilities.delete_if_not($sym231$ATOMIC_SENTENCE_, apply(symbol_function(APPEND), lexification_lists), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_preferred_lexifications_via_indexing(final SubLObject v_term, final SubLObject nl_preds) {
        SubLObject lexification_gafs = NIL;
        SubLObject cdolist_list_var = $list234;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject constrainedP = kb_utilities.kbeq(pred, $$genStringAssertion_Constrained);
            if (NIL != valid_constantP(pred, UNPROVIDED)) {
                SubLObject cdolist_list_var_$285 = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
                SubLObject lex = NIL;
                lex = cdolist_list_var_$285.first();
                while (NIL != cdolist_list_var_$285) {
                    if ((NIL == constrainedP) || (NIL != term_phrases_constraint_implied_by_nl_predsP(assertions_high.gaf_arg2(lex), nl_preds))) {
                        lexification_gafs = cons(NIL != constrainedP ? assertions_high.gaf_arg3(lex) : assertions_high.gaf_arg2(lex), lexification_gafs);
                    }
                    cdolist_list_var_$285 = cdolist_list_var_$285.rest();
                    lex = cdolist_list_var_$285.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        final SubLObject pred_var = $$preferredNameString;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
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
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$287);
                            final SubLObject valid_$288 = makeBoolean(!token_var_$287.eql(gaf));
                            if (NIL != valid_$288) {
                                lexification_gafs = cons(gaf, lexification_gafs);
                            }
                            done_var_$286 = makeBoolean(NIL == valid_$288);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return Mapping.mapcar(LEXIFICATION_SENTENCE_FROM_PREFERRED_LEXIFICATION_ASSERTION, Sort.stable_sort(lexification_gafs, $sym236$PREFER_LEXIFICATION_, UNPROVIDED));
    }

    public static SubLObject prefer_lexificationP(final SubLObject lex1, final SubLObject lex2) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(lex1)) && (NIL != assertion_handles.assertion_p(lex2))) && (NIL != lexicon_cache.prefer_lexical_assertionP(lex1, lex2, UNPROVIDED)));
    }

    public static SubLObject smart_to_capitalizeP(final SubLObject word) {
        if (NIL != find($$Verb, lexicon_accessors.pos_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym237$SPEC_POS_), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != find($$Pronoun, lexicon_accessors.pos_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym237$SPEC_POS_), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != find($$QuantifyingIndexical, lexicon_accessors.pos_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym237$SPEC_POS_), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != lexicon_accessors.non_pronominal_closed_lexical_class_stringP(word, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != find($$Complementizer, lexicon_accessors.pos_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != find_if(UPPER_CASE_P, word, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject term_phrases_constraint_compatible_with_nl_predsP(final SubLObject constraint, final SubLObject nl_preds) {
        if ($ANY.eql(nl_preds)) {
            return T;
        }
        if (NIL != list_utilities.empty_list_p(nl_preds)) {
            return NIL;
        }
        if (NIL != lexicon_accessors.speech_partP(constraint, UNPROVIDED)) {
            return list_utilities.non_empty_list_p(pph_utilities.pph_filter_preds(nl_preds, preds_of_pos(constraint, UNPROVIDED), UNPROVIDED));
        }
        return list_utilities.non_empty_list_p(pph_utilities.pph_filter_preds(nl_preds, list(constraint), UNPROVIDED));
    }

    public static SubLObject term_phrases_constraint_implied_by_nl_predsP(final SubLObject constraint, final SubLObject nl_preds) {
        if ($ANY.eql(nl_preds)) {
            return NIL;
        }
        if (NIL != list_utilities.empty_list_p(nl_preds)) {
            return NIL;
        }
        if (NIL != lexicon_accessors.speech_partP(constraint, UNPROVIDED)) {
            return equal(nl_preds, pph_utilities.pph_filter_preds(nl_preds, preds_of_pos(constraint, UNPROVIDED), UNPROVIDED));
        }
        return equal(nl_preds, pph_utilities.pph_filter_preds(nl_preds, list(constraint), UNPROVIDED));
    }

    public static SubLObject lexification_sentence_from_preferred_lexification_assertion(final SubLObject assertion) {
        if ((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != kb_utilities.kbeq(assertions_high.gaf_arg0(assertion), $$preferredNameString))) {
            return make_el_formula($$nameString, assertions_high.gaf_args(assertion), UNPROVIDED);
        }
        if (NIL != ist_sentence_p(assertion, UNPROVIDED)) {
            return cycl_utilities.formula_arg2(assertion, UNPROVIDED);
        }
        return cycl_utilities.hl_to_el(assertion);
    }

    public static SubLObject loose_lexifications_for_term(final SubLObject fort) {
        final SubLObject lex_assertions = all_lexifications_for_term(fort);
        SubLObject ans = NIL;
        if (NIL != lex_assertions) {
            SubLObject cdolist_list_var = lex_assertions;
            SubLObject as = NIL;
            as = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != subl_promotions.memberP(assertions_high.assertion_formula(as).first(), isa.all_fort_instances($$ProperNamePredicate_Loose, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                    ans = cons(as, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                as = cdolist_list_var.first();
            } 
        }
        return ans;
    }

    public static SubLObject stub_lexifications_for_term(final SubLObject fort) {
        final SubLObject lex_assertions = all_lexifications_for_term(fort);
        SubLObject ans = NIL;
        if (NIL != lex_assertions) {
            SubLObject cdolist_list_var = lex_assertions;
            SubLObject as = NIL;
            as = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != subl_promotions.memberP(assertions_high.assertion_formula(as).first(), isa.all_fort_instances($$ProperNamePredicate_Stub, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                    ans = cons(as, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                as = cdolist_list_var.first();
            } 
        }
        return ans;
    }

    public static SubLObject first_termstring_phrase(final SubLObject v_term) {
        final SubLObject termstring_assertion = loose_lexifications_for_term(v_term).first();
        SubLObject phrase = NIL;
        if (NIL != assertions_high.gaf_assertionP(termstring_assertion)) {
            phrase = assertions_high.gaf_arg2(termstring_assertion);
        }
        return phrase;
    }

    public static SubLObject denotation_lexifications_for_term(final SubLObject fort, SubLObject use_termstringsP) {
        if (use_termstringsP == UNPROVIDED) {
            use_termstringsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            preds = remove_duplicates(Mapping.mapcar(symbol_function(GAF_ARG1), kb_mapping.gather_predicate_extent_index($$denotatumArg, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == use_termstringsP) {
                preds = set_difference(preds, isa.all_fort_instances($$ProperNamePredicate_Loose, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
            SubLObject cdolist_list_var = preds;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject arg = denotatum_arg_of_pred_cached(pred);
                if (NIL != kb_mapping_utilities.pred_values(fort, pred, arg, UNPROVIDED, UNPROVIDED)) {
                    ans = append(ans, kb_mapping.gather_gaf_arg_index(fort, arg, pred, UNPROVIDED, UNPROVIDED));
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject semtrans_lexifications_for_term(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            preds = cdolist_list_var = Mapping.mapcar(symbol_function(GAF_ARG1), kb_mapping.gather_predicate_extent_index($$semTransArg, UNPROVIDED, UNPROVIDED));
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$289;
                final SubLObject ass = cdolist_list_var_$289 = virtual_indexing.assertions_mentioning_terms(list(fort, pred), T);
                SubLObject as = NIL;
                as = cdolist_list_var_$289.first();
                while (NIL != cdolist_list_var_$289) {
                    if (NIL != kb_utilities.kbeq(cycl_utilities.formula_operator(assertions_high.assertion_formula(as)), pred)) {
                        ans = cons(as, ans);
                    }
                    cdolist_list_var_$289 = cdolist_list_var_$289.rest();
                    as = cdolist_list_var_$289.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return remove_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject units_with_no_nl(final SubLObject fort, SubLObject use_termstringsP) {
        if (use_termstringsP == UNPROVIDED) {
            use_termstringsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_forts = NIL;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_forts = union(genls.all_specs(fort, UNPROVIDED, UNPROVIDED), isa.all_fort_instances(fort, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = v_forts;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((((NIL != unit_with_no_nlP(item, use_termstringsP)) && (NIL == isa.quoted_isaP(item, $$TheTerm, UNPROVIDED, UNPROVIDED))) && (NIL == isa.quoted_isaP(item, $$StubTerm, $$CycNounLearnerMt, UNPROVIDED))) && (NIL == isa.quoted_isaP(item, $$TestingConstant, UNPROVIDED, UNPROVIDED))) {
                ans = cons(item, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject verbs_need_st() {
        SubLObject verbs = NIL;
        SubLObject ans = NIL;
        SubLObject cdolist_list_var;
        verbs = cdolist_list_var = kb_mapping_utilities.pred_values_in_mt($$Verb, $$denotation, $$GeneralEnglishMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        SubLObject verb = NIL;
        verb = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == kb_mapping_utilities.pred_values_in_mt(verb, $$verbSemTrans, $$GeneralEnglishMt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                final SubLObject item_var = verb;
                if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            verb = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject verbs_need_sf() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$denotation;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator($$Verb, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator($$Verb, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$290 = NIL;
                            final SubLObject token_var_$291 = NIL;
                            while (NIL == done_var_$290) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$291);
                                final SubLObject valid_$292 = makeBoolean(!token_var_$291.eql(as));
                                if (NIL != valid_$292) {
                                    final SubLObject wu = assertions_high.gaf_arg1(as);
                                    final SubLObject sense = assertions_high.gaf_arg3(as);
                                    final SubLObject triples = kb_mapping_utilities.pred_value_tuples_in_any_mt(wu, $$subcatFrame, ONE_INTEGER, $list250, UNPROVIDED);
                                    SubLObject found_somethingP = NIL;
                                    if (NIL == found_somethingP) {
                                        SubLObject csome_list_var = triples;
                                        SubLObject triple = NIL;
                                        triple = csome_list_var.first();
                                        while ((NIL == found_somethingP) && (NIL != csome_list_var)) {
                                            if ((NIL != kb_utilities.kbeq(second(triple), sense)) && (NIL != kb_utilities.kbeq(triple.first(), $$Verb))) {
                                                found_somethingP = T;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            triple = csome_list_var.first();
                                        } 
                                    }
                                    if (NIL == found_somethingP) {
                                        count = add(count, ONE_INTEGER);
                                        format(T, $str251$___S_in__S__, assertions_high.assertion_formula(as), assertions_high.assertion_mt(as));
                                    }
                                }
                                done_var_$290 = makeBoolean(NIL == valid_$292);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$293 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$293, thread);
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
        return count;
    }

    public static SubLObject which_words_will_my_rule_affectP(final SubLObject denot, SubLObject pos) {
        if (pos == UNPROVIDED) {
            pos = $$Verb;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject specs = NIL;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            specs = genls.all_specs(denot, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = specs;
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$294;
            final SubLObject assns = cdolist_list_var_$294 = kb_mapping.gather_gaf_arg_index(spec, FOUR_INTEGER, $$denotation, $$GeneralEnglishMt, UNPROVIDED);
            SubLObject assn = NIL;
            assn = cdolist_list_var_$294.first();
            while (NIL != cdolist_list_var_$294) {
                if (NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(assn), pos)) {
                    ans = cons(assertions_high.gaf_arg1(assn), ans);
                }
                cdolist_list_var_$294 = cdolist_list_var_$294.rest();
                assn = cdolist_list_var_$294.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject find_missing_lexicon_strings(final SubLObject pos) {
        final SubLObject words = kb_mapping_utilities.pred_values_in_mt(pos, $$denotation, $$GeneralEnglishMt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pos_assertion = kb_mapping.gather_gaf_arg_index(word, ONE_INTEGER, $$posForms, $$GeneralEnglishMt, UNPROVIDED);
            if (NIL == pos_assertion) {
                final SubLObject item_var = word;
                if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject find_missing_pos_forms(final SubLObject filename, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$GeneralEnglishMt;
        }
        if (NIL != filename) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $APPEND);
                if (!stream.isStream()) {
                    Errors.error($str176$Unable_to_open__S, filename);
                }
                final SubLObject stream_$295 = stream;
                SubLObject cdolist_list_var = $list259;
                SubLObject pos = NIL;
                pos = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject words = append(kb_mapping_utilities.pred_values_in_mt(pos, $$denotation, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values_in_mt(pos, $$multiWordString, mt, THREE_INTEGER, TWO_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values_in_mt(pos, $$compoundString, mt, THREE_INTEGER, ONE_INTEGER, UNPROVIDED));
                    SubLObject cdolist_list_var_$296 = remove_duplicates(words, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject word = NIL;
                    word = cdolist_list_var_$296.first();
                    while (NIL != cdolist_list_var_$296) {
                        if ((NIL == kb_mapping_utilities.pred_u_v_holds_in_mt($$posForms, word, pos, $$GeneralEnglishMt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((NIL != kb_utilities.kbeq(mt, $$GeneralEnglishMt)) || (NIL == kb_mapping_utilities.pred_u_v_holds_in_mt($$posForms, word, pos, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                            format(stream_$295, $str256$____a_has__a_denotations_in__a, new SubLObject[]{ word, pos, mt });
                            terpri(stream_$295);
                            princ($str257$___without_appropriate___posForms, stream_$295);
                            terpri(stream_$295);
                            terpri(stream_$295);
                            final SubLObject pred = preds_of_pos(pos, UNPROVIDED).first();
                            final SubLObject form = Strings.string_downcase(string_utilities.split_string(kb_paths.fort_name(word), $str184$_).first(), UNPROVIDED, UNPROVIDED);
                            final SubLObject assertion_mt = (NIL != kb_mapping_utilities.some_pred_value_in_mt(word, $$posForms, mt, UNPROVIDED, UNPROVIDED)) ? mt : $$GeneralEnglishMt;
                            format(stream_$295, $str258$_ke_assert____a__a___a____a__DEFA, new SubLObject[]{ pred, word, form, assertion_mt });
                            terpri(stream_$295);
                            terpri(stream_$295);
                        }
                        cdolist_list_var_$296 = cdolist_list_var_$296.rest();
                        word = cdolist_list_var_$296.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    pos = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_equalp_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject message = $$$mapping_Cyc_FORTs;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$297 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$297, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$297);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            SubLObject _prev_bind_0_$298;
                            SubLObject _prev_bind_1_$299;
                            SubLObject as_list;
                            SubLObject cdolist_list_var_$300;
                            SubLObject as;
                            SubLObject string;
                            SubLObject cdolist_list_var_$301;
                            SubLObject comp_as;
                            SubLObject comp_string;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                fort = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(fort)) {
                                        fort = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    _prev_bind_0_$298 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    _prev_bind_1_$299 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        as_list = kb_accessors.term_gafs_wrt_pred_type(fort, $$StringIndexingSlot, UNPROVIDED, UNPROVIDED);
                                        if (length(as_list).numG(ONE_INTEGER)) {
                                            cdolist_list_var_$300 = as_list;
                                            as = NIL;
                                            as = cdolist_list_var_$300.first();
                                            while (NIL != cdolist_list_var_$300) {
                                                string = assertions_high.gaf_arg2(as);
                                                cdolist_list_var_$301 = remove(as, as_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                comp_as = NIL;
                                                comp_as = cdolist_list_var_$301.first();
                                                while (NIL != cdolist_list_var_$301) {
                                                    comp_string = assertions_high.gaf_arg2(comp_as);
                                                    if (((string.isString() && comp_string.isString()) && string.equalp(comp_string)) && (NIL != Strings.stringL(string, comp_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                        format(T, $str251$___S_in__S__, assertions_high.assertion_formula(as), assertions_high.assertion_mt(as));
                                                        format(T, $str261$___S_in__S____, assertions_high.assertion_formula(comp_as), assertions_high.assertion_mt(comp_as));
                                                        ans = cons(list(as, comp_as), ans);
                                                    }
                                                    cdolist_list_var_$301 = cdolist_list_var_$301.rest();
                                                    comp_as = cdolist_list_var_$301.first();
                                                } 
                                                cdolist_list_var_$300 = cdolist_list_var_$300.rest();
                                                as = cdolist_list_var_$300.first();
                                            } 
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$299, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$298, thread);
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$298 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$298)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$298);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$298);
                            final SubLObject end_id = id_index_next_id(idx_$298);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    final SubLObject _prev_bind_0_$299 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$300 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        final SubLObject as_list2 = kb_accessors.term_gafs_wrt_pred_type(fort2, $$StringIndexingSlot, UNPROVIDED, UNPROVIDED);
                                        if (length(as_list2).numG(ONE_INTEGER)) {
                                            SubLObject cdolist_list_var_$302 = as_list2;
                                            SubLObject as2 = NIL;
                                            as2 = cdolist_list_var_$302.first();
                                            while (NIL != cdolist_list_var_$302) {
                                                final SubLObject string2 = assertions_high.gaf_arg2(as2);
                                                SubLObject cdolist_list_var_$303 = remove(as2, as_list2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                SubLObject comp_as2 = NIL;
                                                comp_as2 = cdolist_list_var_$303.first();
                                                while (NIL != cdolist_list_var_$303) {
                                                    final SubLObject comp_string2 = assertions_high.gaf_arg2(comp_as2);
                                                    if (((string2.isString() && comp_string2.isString()) && string2.equalp(comp_string2)) && (NIL != Strings.stringL(string2, comp_string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                        format(T, $str251$___S_in__S__, assertions_high.assertion_formula(as2), assertions_high.assertion_mt(as2));
                                                        format(T, $str261$___S_in__S____, assertions_high.assertion_formula(comp_as2), assertions_high.assertion_mt(comp_as2));
                                                        ans = cons(list(as2, comp_as2), ans);
                                                    }
                                                    cdolist_list_var_$303 = cdolist_list_var_$303.rest();
                                                    comp_as2 = cdolist_list_var_$303.first();
                                                } 
                                                cdolist_list_var_$302 = cdolist_list_var_$302.rest();
                                                as2 = cdolist_list_var_$302.first();
                                            } 
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$300, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$299, thread);
                                    }
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$300 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$300, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject find_control_chars_in_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject message = $$$mapping_Cyc_FORTs;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$308 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$308, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$308);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            SubLObject _prev_bind_0_$309;
                            SubLObject _prev_bind_1_$310;
                            SubLObject cdolist_list_var_$311;
                            SubLObject as_list;
                            SubLObject as;
                            SubLObject string;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                fort = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(fort)) {
                                        fort = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    _prev_bind_0_$309 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    _prev_bind_1_$310 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        as_list = cdolist_list_var_$311 = kb_accessors.term_gafs_wrt_pred_type(fort, $$StringIndexingSlot, UNPROVIDED, UNPROVIDED);
                                        as = NIL;
                                        as = cdolist_list_var_$311.first();
                                        while (NIL != cdolist_list_var_$311) {
                                            string = assertions_high.gaf_arg2(as);
                                            if (string.isString() && (NIL != find_if(symbol_function(CONTROL_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                ans = cons(as, ans);
                                                format(T, $str263$___S__, assertions_high.assertion_formula(as));
                                            }
                                            cdolist_list_var_$311 = cdolist_list_var_$311.rest();
                                            as = cdolist_list_var_$311.first();
                                        } 
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$310, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$309, thread);
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$309 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$309)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$309);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$309);
                            final SubLObject end_id = id_index_next_id(idx_$309);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    final SubLObject _prev_bind_0_$310 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$311 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        SubLObject cdolist_list_var_$312;
                                        final SubLObject as_list2 = cdolist_list_var_$312 = kb_accessors.term_gafs_wrt_pred_type(fort2, $$StringIndexingSlot, UNPROVIDED, UNPROVIDED);
                                        SubLObject as2 = NIL;
                                        as2 = cdolist_list_var_$312.first();
                                        while (NIL != cdolist_list_var_$312) {
                                            final SubLObject string2 = assertions_high.gaf_arg2(as2);
                                            if (string2.isString() && (NIL != find_if(symbol_function(CONTROL_CHAR_P), string2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                ans = cons(as2, ans);
                                                format(T, $str263$___S__, assertions_high.assertion_formula(as2));
                                            }
                                            cdolist_list_var_$312 = cdolist_list_var_$312.rest();
                                            as2 = cdolist_list_var_$312.first();
                                        } 
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$311, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$310, thread);
                                    }
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$311 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$311, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject show_terms_missing_generation_assertions(SubLObject stream, SubLObject skip_generic_forts) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (skip_generic_forts == UNPROVIDED) {
            skip_generic_forts = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(stream, $str264$__fort_type__lex_asserts__);
        final SubLObject message = $$$mapping_Cyc_FORTs;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$317 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$317, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$317);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject v_term;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                v_term = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(v_term)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(v_term)) {
                                        v_term = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    if (((NIL == skip_generic_forts) || (NIL == fort_types_interface.genericP(v_term))) && (NIL != missing_generation_assertion(v_term))) {
                                        format(stream, $str265$_s__s__s__, new SubLObject[]{ v_term, fort_types_interface.definitional_fort_type(v_term, UNPROVIDED), length(all_lexifications_for_term(v_term)) });
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$318 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$318)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$318);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$318);
                            final SubLObject end_id = id_index_next_id(idx_$318);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject v_term2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_term2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    if (((NIL == skip_generic_forts) || (NIL == fort_types_interface.genericP(v_term2))) && (NIL != missing_generation_assertion(v_term2))) {
                                        format(stream, $str265$_s__s__s__, new SubLObject[]{ v_term2, fort_types_interface.definitional_fort_type(v_term2, UNPROVIDED), length(all_lexifications_for_term(v_term2)) });
                                    }
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$319 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$319, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject missing_generation_assertion(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        final SubLObject node_var = $$NLGenerationPredicate;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                if (NIL == foundP) {
                    SubLObject node_var_$320 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$321 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = pph_vars.$pph_language_mt$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$322 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$323 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = $$True_JustificationTruth;
                                final SubLObject _prev_bind_0_$323 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$324 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$324 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$325 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$328 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$325 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$326 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$329 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$320, UNPROVIDED);
                                                while ((NIL != node_var_$320) && (NIL == foundP)) {
                                                    final SubLObject tt_node_var = node_var_$320;
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$326;
                                                    SubLObject _prev_bind_1_$327;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$327;
                                                    SubLObject iteration_state_$335;
                                                    SubLObject tv;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$328;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject genpred;
                                                    SubLObject csome_list_var;
                                                    SubLObject genpred2;
                                                    SubLObject csome_list_var2;
                                                    SubLObject instance_tuple;
                                                    SubLObject current;
                                                    SubLObject datum;
                                                    SubLObject link_node;
                                                    SubLObject mt2;
                                                    SubLObject tv2;
                                                    SubLObject _prev_bind_0_$329;
                                                    SubLObject _prev_bind_0_$330;
                                                    SubLObject link_nodes2;
                                                    SubLObject csome_list_var_$339;
                                                    SubLObject new_list;
                                                    SubLObject rest_$340;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$331;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes3;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject genpred3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject genpred4;
                                                    for (rest = NIL, rest = accessible_modules; (NIL == foundP) && (NIL != rest); rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$326 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$327 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                _prev_bind_0_$327 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    for (iteration_state_$335 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$335)); iteration_state_$335 = dictionary_contents.do_dictionary_contents_next(iteration_state_$335)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$335);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$328 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        genpred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, genpred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if ((NIL != forts.fort_p(genpred)) && (NIL != kb_mapping_utilities.pred_values_in_any_mt(v_term, genpred, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                                                                                foundP = T;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        if (NIL == foundP) {
                                                                                                            csome_list_var = sol;
                                                                                                            genpred2 = NIL;
                                                                                                            genpred2 = csome_list_var.first();
                                                                                                            while ((NIL == foundP) && (NIL != csome_list_var)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(genpred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(genpred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    if ((NIL != forts.fort_p(genpred2)) && (NIL != kb_mapping_utilities.pred_values_in_any_mt(v_term, genpred2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                                                                                        foundP = T;
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                genpred2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$328, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$335);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$327, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if ((NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) && (NIL == foundP)) {
                                                                    csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while ((NIL == foundP) && (NIL != csome_list_var2)) {
                                                                        datum = current = instance_tuple;
                                                                        link_node = NIL;
                                                                        mt2 = NIL;
                                                                        tv2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list197);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list197);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list197);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                _prev_bind_0_$329 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        _prev_bind_0_$330 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    genpred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, genpred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(genpred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if ((NIL != forts.fort_p(genpred)) && (NIL != kb_mapping_utilities.pred_values_in_any_mt(v_term, genpred, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                                                                            foundP = T;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == foundP) {
                                                                                                        csome_list_var_$339 = sol;
                                                                                                        genpred2 = NIL;
                                                                                                        genpred2 = csome_list_var_$339.first();
                                                                                                        while ((NIL == foundP) && (NIL != csome_list_var_$339)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(genpred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(genpred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if ((NIL != forts.fort_p(genpred2)) && (NIL != kb_mapping_utilities.pred_values_in_any_mt(v_term, genpred2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                                                                                    foundP = T;
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$339 = csome_list_var_$339.rest();
                                                                                                            genpred2 = csome_list_var_$339.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$330, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$329, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list197);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$340 = NIL, rest_$340 = new_list; (NIL == foundP) && (NIL != rest_$340); rest_$340 = rest_$340.rest()) {
                                                                        generating_fn = rest_$340.first();
                                                                        _prev_bind_0_$331 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    genpred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, genpred3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(genpred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(genpred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if ((NIL != forts.fort_p(genpred3)) && (NIL != kb_mapping_utilities.pred_values_in_any_mt(v_term, genpred3, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                                                            foundP = T;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    if (NIL == foundP) {
                                                                                        csome_list_var3 = sol2;
                                                                                        genpred4 = NIL;
                                                                                        genpred4 = csome_list_var3.first();
                                                                                        while ((NIL == foundP) && (NIL != csome_list_var3)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(genpred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(genpred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if ((NIL != forts.fort_p(genpred4)) && (NIL != kb_mapping_utilities.pred_values_in_any_mt(v_term, genpred4, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                                                                    foundP = T;
                                                                                                }
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            genpred4 = csome_list_var3.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$331, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$327, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$326, thread);
                                                        }
                                                    }
                                                    final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject rest2;
                                                    SubLObject module_var2;
                                                    SubLObject _prev_bind_0_$332;
                                                    SubLObject _prev_bind_1_$328;
                                                    SubLObject node2;
                                                    SubLObject d_link2;
                                                    SubLObject mt_links2;
                                                    SubLObject iteration_state2;
                                                    SubLObject mt3;
                                                    SubLObject tv_links2;
                                                    SubLObject _prev_bind_0_$333;
                                                    SubLObject iteration_state_$336;
                                                    SubLObject link_nodes4;
                                                    SubLObject _prev_bind_0_$334;
                                                    SubLObject sol3;
                                                    SubLObject set_contents_var3;
                                                    SubLObject basis_object3;
                                                    SubLObject state3;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var4;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list2;
                                                    SubLObject rest_$341;
                                                    SubLObject generating_fn2;
                                                    SubLObject _prev_bind_0_$335;
                                                    SubLObject sol4;
                                                    SubLObject link_nodes5;
                                                    SubLObject set_contents_var4;
                                                    SubLObject basis_object4;
                                                    SubLObject state4;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var5;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest2 = NIL, rest2 = accessible_modules2; (NIL == foundP) && (NIL != rest2); rest2 = rest2.rest()) {
                                                        module_var2 = rest2.first();
                                                        _prev_bind_0_$332 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$328 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node2 = function_terms.naut_to_nart(node_var_$320);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); (NIL == foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2)); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                _prev_bind_0_$333 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    for (iteration_state_$336 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); (NIL == foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$336)); iteration_state_$336 = dictionary_contents.do_dictionary_contents_next(iteration_state_$336)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$336);
                                                                                        link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            _prev_bind_0_$334 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object3, state3)); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        if (NIL == foundP) {
                                                                                                            csome_list_var4 = sol3;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                            while ((NIL == foundP) && (NIL != csome_list_var4)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$334, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$336);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$333, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    new_list2 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$341 = NIL, rest_$341 = new_list2; (NIL == foundP) && (NIL != rest_$341); rest_$341 = rest_$341.rest()) {
                                                                        generating_fn2 = rest_$341.first();
                                                                        _prev_bind_0_$335 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                set_contents_var4 = set.do_set_internal(sol4);
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object4, state4)); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    if (NIL == foundP) {
                                                                                        csome_list_var5 = sol4;
                                                                                        node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                        while ((NIL == foundP) && (NIL != csome_list_var5)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$335, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$328, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$332, thread);
                                                        }
                                                    }
                                                    node_var_$320 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$329, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$326, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$325, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$328, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$325, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$324, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$324, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$323, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$323, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$322, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$336 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$336, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$321, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$337 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$337, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        if (NIL == foundP) {
            thread.resetMultipleValues();
            final SubLObject string = pph_methods.select_string_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject pred = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((!pred.eql(NIL)) && (NIL == member(pred, isa.all_fort_instances($$ProperNamePredicate_Loose, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                foundP = T;
            }
        }
        return makeBoolean(NIL == foundP);
    }

    public static SubLObject preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        SubLObject result = nl_trie_accessors.nl_trie_preds_of_string(string, misspellingsP, lookup_mt, UNPROVIDED);
        if (NIL != lexicon_accessors.proceed_with_morphological_parsingP(result, parse_morphologically)) {
            result = delete_duplicates(append(result, morphological_word_parser.preds_of_complex_word_string(string)), symbol_function(KBEQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject namestring_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject result = nl_trie_accessors.nl_trie_namestring_preds_of_string(string, misspellingsP, lookup_mt, UNPROVIDED);
        return result;
    }

    public static SubLObject ordered_lexification_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        assert NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : "lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + "CommonSymbols.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) " + parse_morphologically;
        final SubLObject ordered_preds = append($list59, lexicon_vars.all_lexicon_string_predicates());
        return list_utilities.ordered_intersection(ordered_preds, preds_of_string(string, misspellingsP, lookup_mt, parse_morphologically), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ordered_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return ordered_lexification_preds_of_string(string, misspellingsP, lookup_mt, UNPROVIDED);
    }

    public static SubLObject word_variants(final SubLObject wordform, SubLObject pos_keyword, SubLObject strict, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = NIL;
        }
        if (strict == UNPROVIDED) {
            strict = NIL;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject preds = (NIL != pos_keyword) ? ordered_lexification_preds_for_keyword(pos_keyword) : ordered_lexification_preds_of_string(wordform, misspellingsP, lookup_mt, UNPROVIDED);
        final SubLObject word_units = (NIL != pos_keyword) ? lexicon_accessors.words_of_stringXpos(wordform, pos_keyword, misspellingsP, lookup_mt, UNPROVIDED) : lexicon_cache.words_of_string(wordform, misspellingsP, lookup_mt, UNPROVIDED);
        SubLObject variants = NIL;
        if ((NIL != strict) && (pos_keyword == $NOUN)) {
            preds = list_utilities.ordered_set_difference(preds, $nonstandard_nominal_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        }
        SubLObject cdolist_list_var = word_units;
        SubLObject word_unit = NIL;
        word_unit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$351 = lexicon_cache.ordered_strings_of_word_unit(word_unit, preds, NIL, lookup_mt);
            SubLObject variant = NIL;
            variant = cdolist_list_var_$351.first();
            while (NIL != cdolist_list_var_$351) {
                final SubLObject item_var = variant;
                if (NIL == member(item_var, variants, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    variants = cons(item_var, variants);
                }
                cdolist_list_var_$351 = cdolist_list_var_$351.rest();
                variant = cdolist_list_var_$351.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word_unit = cdolist_list_var.first();
        } 
        return variants;
    }

    public static SubLObject ordered_word_variants(final SubLObject wordform, SubLObject pos_keyword, SubLObject strict, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = NIL;
        }
        if (strict == UNPROVIDED) {
            strict = NIL;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return reverse(word_variants(wordform, pos_keyword, strict, misspellingsP, lookup_mt));
    }

    public static SubLObject find_word_root(final SubLObject wordform, SubLObject pos_keyword, SubLObject strict, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (pos_keyword == UNPROVIDED) {
            pos_keyword = NIL;
        }
        if (strict == UNPROVIDED) {
            strict = NIL;
        }
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLObject variants = ordered_word_variants(wordform, pos_keyword, strict, misspellingsP, lookup_mt);
        return NIL != variants ? variants.first() : wordform;
    }

    public static SubLObject word_has_part_of_speechP(final SubLObject wordform, final SubLObject pos_keyword, SubLObject lookup_mt) {
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        assert NIL != keywordp(pos_keyword) : "Types.keywordp(pos_keyword) " + "CommonSymbols.NIL != Types.keywordp(pos_keyword) " + pos_keyword;
        return list_utilities.sublisp_boolean(lexicon_accessors.words_of_stringXpos(wordform, pos_keyword, NIL, lookup_mt, UNPROVIDED));
    }

    public static SubLObject word_has_speech_partP(final SubLObject wordform, final SubLObject speech_part, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        return list_utilities.sublisp_boolean(lexicon_accessors.words_of_stringXspeech_part(wordform, speech_part, NIL, lookup_mt, parse_morphologically));
    }

    public static SubLObject is_determinerP(final SubLObject wordform, SubLObject lookup_mt, SubLObject all_determinersP) {
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (all_determinersP == UNPROVIDED) {
            all_determinersP = NIL;
        }
        final SubLObject determiner_central = misc_kb_utilities.resolve_constant($str271$Determiner_Central, $$Determiner);
        final SubLObject determiner_pred = (NIL != all_determinersP) ? $$Determiner : determiner_central;
        return word_has_speech_partP(wordform, determiner_pred, lookup_mt, $NEVER);
    }

    public static SubLObject strip_determiner(SubLObject phrase, SubLObject all_determiner_typesP) {
        if (all_determiner_typesP == UNPROVIDED) {
            all_determiner_typesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokens = string_utilities.string_tokenize(phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != is_determinerP(tokens.first(), lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), all_determiner_typesP)) {
            phrase = lexification_utilities.join_words(tokens.rest());
        }
        return phrase;
    }

    public static SubLObject wh_wordP(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != lexicon_accessors.closed_lexical_class_string_case_insensitiveP(string, UNPROVIDED)) && (NIL != lexicon_accessors.string_is_posP(string, $$WHWord, NIL, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), $NEVER)));
    }

    public static SubLObject first_name_p(final SubLObject string) {
        return makeBoolean((NIL != cyc_kernel.cyc_query(list($$nameSpelling, $sym275$_NAME, string), $$NameLexicalMt, UNPROVIDED)) || (NIL != cyc_kernel.cyc_query(list($$commonNickname, $sym275$_NAME, string), $$NameLexicalMt, UNPROVIDED)));
    }

    public static SubLObject first_name_gender(final SubLObject string) {
        final SubLObject names = append(ask_utilities.ask_variable($sym275$_NAME, list($$nameSpelling, $sym275$_NAME, string), $$NameLexicalMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ask_utilities.ask_variable($sym275$_NAME, list($$commonNickname, $sym275$_NAME, string), $$NameLexicalMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if (NIL == names) {
            return NIL;
        }
        if (NIL != find_if(symbol_function(HUMAN_MALE_GIVEN_NAME_P), names, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (NIL != find_if(symbol_function(HUMAN_FEMALE_GIVEN_NAME_P), names, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return $BOTH;
            }
            return $MASC;
        } else {
            if (NIL != find_if(symbol_function(HUMAN_FEMALE_GIVEN_NAME_P), names, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return $FEM;
            }
            return $UNKNOWN;
        }
    }

    public static SubLObject human_male_given_name_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $$HumanMaleGivenName);
    }

    public static SubLObject human_female_given_name_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $$HumanFemaleGivenName);
    }

    public static SubLObject construct_word_unit(final SubLObject base_word_unit, final SubLObject affix, SubLObject affix_type) {
        if (affix_type == UNPROVIDED) {
            affix_type = $UNKNOWN;
        }
        if ($UNKNOWN == affix_type) {
            affix_type = (NIL != prefix_unit_p(affix)) ? $PREFIX : $SUFFIX;
        }
        final SubLObject pcase_var = affix_type;
        if (pcase_var.eql($PREFIX)) {
            return make_binary_formula($$WordWithPrefixFn, affix, base_word_unit);
        }
        return make_binary_formula($$WordWithSuffixFn, base_word_unit, affix);
    }

    public static SubLObject derived_word_affix(final SubLObject derived_word, SubLObject query_mt) {
        if (query_mt == UNPROVIDED) {
            query_mt = $$AllLexicalMicrotheoryPSC;
        }
        assert NIL != lexicon_accessors.derived_wordP(derived_word) : "lexicon_accessors.derived_wordP(derived_word) " + "CommonSymbols.NIL != lexicon_accessors.derived_wordP(derived_word) " + derived_word;
        return derived_word_affix_memoized(derived_word, query_mt);
    }

    public static SubLObject derived_word_affix_memoized_internal(final SubLObject derived_word, final SubLObject query_mt) {
        final SubLObject var = $sym293$_AFFIX;
        final SubLObject query_sentence = make_binary_formula($$derivedUsingAffix, derived_word, var);
        final SubLObject query_properties = $list295;
        return ask_utilities.query_variable(var, query_sentence, query_mt, query_properties).first();
    }

    public static SubLObject derived_word_affix_memoized(final SubLObject derived_word, final SubLObject query_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return derived_word_affix_memoized_internal(derived_word, query_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DERIVED_WORD_AFFIX_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DERIVED_WORD_AFFIX_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, DERIVED_WORD_AFFIX_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(derived_word, query_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (derived_word.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && query_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(derived_word_affix_memoized_internal(derived_word, query_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(derived_word, query_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject prefix_unit_p(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $$LexicalPrefix);
    }

    public static SubLObject denots_of_string_stop_word(final SubLObject token) {
        return makeBoolean((NIL != lexicon_accessors.closed_lexical_class_stringP(token, UNPROVIDED)) && (NIL == stop_word_closed_class_exception(token, UNPROVIDED)));
    }

    public static SubLObject clear_stop_word_closed_class_exception() {
        final SubLObject cs = $stop_word_closed_class_exception_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_stop_word_closed_class_exception(final SubLObject token, SubLObject lexicon_lookup_mt) {
        if (lexicon_lookup_mt == UNPROVIDED) {
            lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($stop_word_closed_class_exception_caching_state$.getGlobalValue(), list(token, lexicon_lookup_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject stop_word_closed_class_exception_internal(final SubLObject token, final SubLObject lexicon_lookup_mt) {
        final SubLObject closed_class_exceptions = copy_list($stop_word_closed_class_exceptions$.getGlobalValue());
        if (NIL != numeral_parser.string_to_interval(token)) {
            return T;
        }
        SubLObject cdolist_list_var = closed_class_exceptions;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != lexicon_accessors.string_is_posP(token, pos, NIL, lexicon_lookup_mt, $NEVER)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject stop_word_closed_class_exception(final SubLObject token, SubLObject lexicon_lookup_mt) {
        if (lexicon_lookup_mt == UNPROVIDED) {
            lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $stop_word_closed_class_exception_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(STOP_WORD_CLOSED_CLASS_EXCEPTION, $stop_word_closed_class_exception_caching_state$, $int$100, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(token, lexicon_lookup_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (token.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexicon_lookup_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(stop_word_closed_class_exception_internal(token, lexicon_lookup_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(token, lexicon_lookup_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject head_keyword_for_frame(final SubLObject frame) {
        return list_utilities.alist_lookup($semtrans_frame_keywords$.getGlobalValue(), frame, symbol_function(EQL), NIL).first();
    }

    public static SubLObject argument_keywords_for_frame(final SubLObject frame) {
        return copy_list(list_utilities.alist_lookup($semtrans_frame_keywords$.getGlobalValue(), frame, symbol_function(EQL), NIL).rest());
    }

    public static SubLObject extract_head_type_and_argument_roles_from_semtrans_template(final SubLObject semtrans_template, final SubLObject frame) {
        if (NIL != el_conjunction_p(semtrans_template)) {
            final SubLObject head = head_keyword_for_frame(frame);
            SubLObject unmatched_argument_keywords = argument_keywords_for_frame(frame);
            SubLObject head_type = NIL;
            SubLObject roles = NIL;
            SubLObject head_conjunct = NIL;
            SubLObject non_matcher = NIL;
            SubLObject args = cycl_utilities.formula_args(semtrans_template, $IGNORE);
            SubLObject rest;
            SubLObject conjunct;
            for (rest = NIL, rest = args; (NIL == head_conjunct) && (NIL != rest); rest = rest.rest()) {
                conjunct = rest.first();
                if (NIL != formula_pattern_match.formula_matches_pattern(conjunct, $list302)) {
                    head_conjunct = conjunct;
                }
            }
            if (NIL != head_conjunct) {
                head_type = cycl_utilities.formula_arg2(head_conjunct, UNPROVIDED);
                args = cycl_utilities.formula_args(semtrans_template, $IGNORE);
                SubLObject this_key;
                for (rest = NIL, rest = args; (NIL == non_matcher) && (NIL != rest); rest = rest.rest()) {
                    conjunct = rest.first();
                    if (!conjunct.equal(head_conjunct)) {
                        if (NIL != formula_pattern_match.formula_matches_pattern(conjunct, listS($FORT, head, $list304))) {
                            this_key = cycl_utilities.formula_arg2(conjunct, UNPROVIDED);
                            if (NIL != subl_promotions.memberP(this_key, unmatched_argument_keywords, UNPROVIDED, UNPROVIDED)) {
                                unmatched_argument_keywords = delete(this_key, unmatched_argument_keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                roles = list_utilities.alist_enter(roles, this_key, cycl_utilities.formula_arg0(conjunct), UNPROVIDED);
                            } else {
                                non_matcher = conjunct;
                            }
                        } else {
                            non_matcher = conjunct;
                        }
                    }
                }
                if ((NIL != non_matcher) || (NIL != unmatched_argument_keywords)) {
                    head_type = NIL;
                    roles = NIL;
                }
            }
            return values(head_type, roles, non_matcher);
        }
        return NIL;
    }

    public static SubLObject construct_semtrans_template_from_head_type_and_argument_roles(final SubLObject frame, final SubLObject head_type, final SubLObject roles) {
        assert NIL != forts.fort_p(frame) : "forts.fort_p(frame) " + "CommonSymbols.NIL != forts.fort_p(frame) " + frame;
        assert NIL != cycl_grammar.cycl_represented_term_p(head_type) : "cycl_grammar.cycl_represented_term_p(head_type) " + "CommonSymbols.NIL != cycl_grammar.cycl_represented_term_p(head_type) " + head_type;
        final SubLObject head_keyword = head_keyword_for_frame(frame);
        final SubLObject argument_keywords = argument_keywords_for_frame(frame);
        SubLObject ans = NIL;
        if ((NIL != head_keyword) && (NIL != argument_keywords)) {
            final SubLObject head_conjunct = list($$isa, head_keyword, head_type);
            SubLObject conjuncts = list(head_conjunct);
            SubLObject argument_keyword = NIL;
            SubLObject argument_keyword_$352 = NIL;
            SubLObject role = NIL;
            SubLObject role_$353 = NIL;
            argument_keyword = argument_keywords;
            argument_keyword_$352 = argument_keyword.first();
            role = roles;
            role_$353 = role.first();
            while ((NIL != role) || (NIL != argument_keyword)) {
                assert NIL != cycl_grammar.cycl_represented_term_p(role_$353) : "cycl_grammar.cycl_represented_term_p(role_$353) " + "CommonSymbols.NIL != cycl_grammar.cycl_represented_term_p(role_$353) " + role_$353;
                conjuncts = cons(make_binary_formula(role_$353, head_keyword, argument_keyword_$352), conjuncts);
                argument_keyword = argument_keyword.rest();
                argument_keyword_$352 = argument_keyword.first();
                role = role.rest();
                role_$353 = role.first();
            } 
            ans = make_conjunction(nreverse(conjuncts));
        }
        return ans;
    }

    public static SubLObject language_of_lexicon(final SubLObject mt) {
        maybe_initialize_lexicons_to_languages();
        SubLObject language = dictionary.dictionary_lookup_without_values($lexicons_to_languages$.getGlobalValue(), mt, UNPROVIDED);
        if (NIL == language) {
            language = language_of_lexicon_internal(mt);
            if (NIL != language) {
                dictionary.dictionary_enter($lexicons_to_languages$.getGlobalValue(), mt, language);
            }
        }
        return language;
    }

    public static SubLObject language_of_lexicon_internal(final SubLObject mt) {
        if (!hlmt.hlmt_monad_mt(mt).equal(mt)) {
            return language_of_lexicon(hlmt.hlmt_monad_mt(mt));
        }
        if (NIL != hlmt.mt_union_naut_p(mt)) {
            final SubLObject mts = hlmt.mt_union_mts(mt);
            SubLObject first_language = NIL;
            SubLObject different_languageP = NIL;
            if (NIL == different_languageP) {
                SubLObject csome_list_var = mts;
                SubLObject component_mt = NIL;
                component_mt = csome_list_var.first();
                while ((NIL == different_languageP) && (NIL != csome_list_var)) {
                    final SubLObject this_language = language_of_lexicon(component_mt);
                    if (NIL != this_language) {
                        if (NIL == first_language) {
                            first_language = this_language;
                        } else
                            if (!this_language.equal(first_language)) {
                                different_languageP = T;
                            }

                    }
                    csome_list_var = csome_list_var.rest();
                    component_mt = csome_list_var.first();
                } 
            }
            return NIL != different_languageP ? NIL : first_language;
        }
        return NIL;
    }

    public static SubLObject clear_lexicons_to_languages() {
        if (NIL != dictionary.dictionary_p($lexicons_to_languages$.getGlobalValue())) {
            dictionary.clear_dictionary($lexicons_to_languages$.getGlobalValue());
        }
        return $lexicons_to_languages$.getGlobalValue();
    }

    public static SubLObject initialize_lexicons_to_languages() {
        if (NIL != dictionary.dictionary_p($lexicons_to_languages$.getGlobalValue())) {
            clear_lexicons_to_languages();
        } else {
            $lexicons_to_languages$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        }
        SubLObject cdolist_list_var = ask_utilities.query_template($list309, $list310, $$InferencePSC, $list311);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject mt = NIL;
            SubLObject language = NIL;
            destructuring_bind_must_consp(current, datum, $list308);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list308);
            language = current.first();
            current = current.rest();
            if (NIL == current) {
                dictionary.dictionary_enter($lexicons_to_languages$.getGlobalValue(), mt, language);
            } else {
                cdestructuring_bind_error(datum, $list308);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return $lexicons_to_languages$.getGlobalValue();
    }

    public static SubLObject maybe_initialize_lexicons_to_languages() {
        if (NIL == dictionary.dictionary_p($lexicons_to_languages$.getGlobalValue())) {
            initialize_lexicons_to_languages();
        }
        return $lexicons_to_languages$.getGlobalValue();
    }

    public static SubLObject lexical_assertion_of_lexiconP(final SubLObject lexicon, final SubLObject assertion, final SubLObject assertion_mt) {
        return lexicon_accessors.genl_lexicon_mtP(assertion_mt, lexicon);
    }

    public static SubLObject clear_lexical_mt_for_language() {
        final SubLObject cs = $lexical_mt_for_language_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_lexical_mt_for_language(final SubLObject language) {
        return memoization_state.caching_state_remove_function_results_with_args($lexical_mt_for_language_caching_state$.getGlobalValue(), list(language), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lexical_mt_for_language_internal(final SubLObject language) {
        return ask_utilities.query_variable($MT, listS($$languageHasRootLexicon, language, $list315), $$InferencePSC, UNPROVIDED).first();
    }

    public static SubLObject lexical_mt_for_language(final SubLObject language) {
        SubLObject caching_state = $lexical_mt_for_language_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(LEXICAL_MT_FOR_LANGUAGE, $lexical_mt_for_language_caching_state$, $int$256, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_LEXICAL_MT_FOR_LANGUAGE);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, language, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(lexical_mt_for_language_internal(language)));
            memoization_state.caching_state_put(caching_state, language, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_get_language_for_code() {
        final SubLObject cs = $get_language_for_code_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_language_for_code(final SubLObject code_string) {
        return memoization_state.caching_state_remove_function_results_with_args($get_language_for_code_caching_state$.getGlobalValue(), list(code_string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_language_for_code_internal(final SubLObject code_string) {
        return ask_utilities.query_variable($LANG, list($$languageCodeDigraph, $LANG, code_string), $$CrossLinguisticLexicalMt, UNPROVIDED).first();
    }

    public static SubLObject get_language_for_code(final SubLObject code_string) {
        SubLObject caching_state = $get_language_for_code_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_LANGUAGE_FOR_CODE, $get_language_for_code_caching_state$, $int$256, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, code_string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_language_for_code_internal(code_string)));
            memoization_state.caching_state_put(caching_state, code_string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_get_code_for_language() {
        final SubLObject cs = $get_code_for_language_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_code_for_language(final SubLObject language) {
        return memoization_state.caching_state_remove_function_results_with_args($get_code_for_language_caching_state$.getGlobalValue(), list(language), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_code_for_language_internal(final SubLObject language) {
        return ask_utilities.query_variable($CODE, listS($$languageCodeDigraph, language, $list326), $$CrossLinguisticLexicalMt, UNPROVIDED).first();
    }

    public static SubLObject get_code_for_language(final SubLObject language) {
        SubLObject caching_state = $get_code_for_language_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_CODE_FOR_LANGUAGE, $get_code_for_language_caching_state$, $int$256, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, language, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_code_for_language_internal(language)));
            memoization_state.caching_state_put(caching_state, language, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_lexicon_utilities_file() {
        declareFunction(me, "mwwP", "MWW?", 1, 0, false);
        declareFunction(me, "next_available_ws", "NEXT-AVAILABLE-WS", 2, 1, false);
        declareFunction(me, "unique_ws", "UNIQUE-WS", 3, 0, false);
        declareFunction(me, "ws_availableP", "WS-AVAILABLE?", 3, 1, false);
        declareFunction(me, "lowest_not_in_list", "LOWEST-NOT-IN-LIST", 2, 0, false);
        declareFunction(me, "suggest_word_unit", "SUGGEST-WORD-UNIT", 1, 0, false);
        declareFunction(me, "word_prop", "WORD-PROP", 2, 1, false);
        declareFunction(me, "set_word_prop", "SET-WORD-PROP", 3, 1, false);
        declareFunction(me, "check_denot", "CHECK-DENOT", 4, 2, false);
        declareFunction(me, "set_denot", "SET-DENOT", 4, 2, false);
        declareFunction(me, "add_frame", "ADD-FRAME", 4, 1, false);
        declareFunction(me, "remove_frame", "REMOVE-FRAME", 4, 1, false);
        declareFunction(me, "set_frames", "SET-FRAMES", 4, 1, false);
        declareFunction(me, "frame_lookup", "FRAME-LOOKUP", 3, 0, false);
        declareFunction(me, "preds_of_pos", "PREDS-OF-POS", 1, 1, false);
        declareFunction(me, "clear_preds_of_pos", "CLEAR-PREDS-OF-POS", 0, 0, false);
        declareFunction(me, "clear_preds_of_pos_cached", "CLEAR-PREDS-OF-POS-CACHED", 0, 0, false);
        declareFunction(me, "remove_preds_of_pos_cached", "REMOVE-PREDS-OF-POS-CACHED", 2, 0, false);
        declareFunction(me, "preds_of_pos_cached_internal", "PREDS-OF-POS-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "preds_of_pos_cached", "PREDS-OF-POS-CACHED", 2, 0, false);
        declareFunction(me, "preds_of_pos_int", "PREDS-OF-POS-INT", 2, 1, false);
        declareFunction(me, "preds_of_pos_lookup", "PREDS-OF-POS-LOOKUP", 1, 0, false);
        declareFunction(me, "ordered_lexification_preds_of_pos", "ORDERED-LEXIFICATION-PREDS-OF-POS", 1, 0, false);
        declareFunction(me, "ordered_preds_of_pos", "ORDERED-PREDS-OF-POS", 1, 0, false);
        declareFunction(me, "preds_licensed_by_pos", "PREDS-LICENSED-BY-POS", 1, 0, false);
        declareFunction(me, "clear_preds_licensed_by_pos", "CLEAR-PREDS-LICENSED-BY-POS", 0, 0, false);
        declareFunction(me, "clear_preds_licensed_by_pos_cached", "CLEAR-PREDS-LICENSED-BY-POS-CACHED", 0, 0, false);
        declareFunction(me, "remove_preds_licensed_by_pos_cached", "REMOVE-PREDS-LICENSED-BY-POS-CACHED", 2, 0, false);
        declareFunction(me, "preds_licensed_by_pos_cached_internal", "PREDS-LICENSED-BY-POS-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "preds_licensed_by_pos_cached", "PREDS-LICENSED-BY-POS-CACHED", 2, 0, false);
        declareFunction(me, "preds_coercible_from_pred", "PREDS-COERCIBLE-FROM-PRED", 1, 0, false);
        declareFunction(me, "preds_derivable_from_pred", "PREDS-DERIVABLE-FROM-PRED", 1, 0, false);
        declareFunction(me, "filter_lexicon_preds", "FILTER-LEXICON-PREDS", 2, 2, false);
        declareFunction(me, "filter_two_lexicon_preds", "FILTER-TWO-LEXICON-PREDS", 2, 1, false);
        declareFunction(me, "spp_more_basicP", "SPP-MORE-BASIC?", 2, 1, false);
        declareFunction(me, "clear_spp_more_basicP_cached", "CLEAR-SPP-MORE-BASIC?-CACHED", 0, 0, false);
        declareFunction(me, "remove_spp_more_basicP_cached", "REMOVE-SPP-MORE-BASIC?-CACHED", 3, 0, false);
        declareFunction(me, "spp_more_basicP_cached_internal", "SPP-MORE-BASIC?-CACHED-INTERNAL", 3, 0, false);
        declareFunction(me, "spp_more_basicP_cached", "SPP-MORE-BASIC?-CACHED", 3, 0, false);
        declareFunction(me, "spp_assertion_string", "SPP-ASSERTION-STRING", 1, 0, false);
        declareFunction(me, "preds_for_keyword", "PREDS-FOR-KEYWORD", 1, 0, false);
        declareFunction(me, "ordered_lexification_preds_for_keyword", "ORDERED-LEXIFICATION-PREDS-FOR-KEYWORD", 1, 0, false);
        declareFunction(me, "ordered_preds_for_keyword", "ORDERED-PREDS-FOR-KEYWORD", 1, 0, false);
        declareFunction(me, "nl_def_attributes_for_string", "NL-DEF-ATTRIBUTES-FOR-STRING", 1, 1, false);
        declareFunction(me, "nl_def_attributes_for_pos", "NL-DEF-ATTRIBUTES-FOR-POS", 1, 1, false);
        declareFunction(me, "nl_def_attributes_for_possessive_denots", "NL-DEF-ATTRIBUTES-FOR-POSSESSIVE-DENOTS", 1, 0, false);
        declareFunction(me, "nl_quant_attributes_for_string", "NL-QUANT-ATTRIBUTES-FOR-STRING", 1, 1, false);
        declareFunction(me, "nl_quant_attributes_for_denots", "NL-QUANT-ATTRIBUTES-FOR-DENOTS", 1, 0, false);
        declareFunction(me, "nl_numerical_quant_for_denot", "NL-NUMERICAL-QUANT-FOR-DENOT", 1, 0, false);
        declareFunction(me, "det_denot_is_scalar_intervalP", "DET-DENOT-IS-SCALAR-INTERVAL?", 1, 0, false);
        declareFunction(me, "clear_det_denot_is_scalar_intervalP_cached", "CLEAR-DET-DENOT-IS-SCALAR-INTERVAL?-CACHED", 0, 0, false);
        declareFunction(me, "remove_det_denot_is_scalar_intervalP_cached", "REMOVE-DET-DENOT-IS-SCALAR-INTERVAL?-CACHED", 1, 0, false);
        declareFunction(me, "det_denot_is_scalar_intervalP_cached_internal", "DET-DENOT-IS-SCALAR-INTERVAL?-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "det_denot_is_scalar_intervalP_cached", "DET-DENOT-IS-SCALAR-INTERVAL?-CACHED", 1, 0, false);
        declareFunction(me, "maximal_bar_level", "MAXIMAL-BAR-LEVEL", 2, 0, false);
        declareFunction(me, "bar_level", "BAR-LEVEL", 1, 1, false);
        declareFunction(me, "clear_bar_level", "CLEAR-BAR-LEVEL", 0, 0, false);
        declareFunction(me, "remove_bar_level", "REMOVE-BAR-LEVEL", 2, 0, false);
        declareFunction(me, "clear_bar_level_cached", "CLEAR-BAR-LEVEL-CACHED", 0, 0, false);
        declareFunction(me, "remove_bar_level_cached", "REMOVE-BAR-LEVEL-CACHED", 2, 0, false);
        declareFunction(me, "bar_level_cached_internal", "BAR-LEVEL-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "bar_level_cached", "BAR-LEVEL-CACHED", 2, 0, false);
        declareFunction(me, "pos_of_cat", "POS-OF-CAT", 1, 1, false);
        declareFunction(me, "clear_pos_of_cat_cached", "CLEAR-POS-OF-CAT-CACHED", 0, 0, false);
        declareFunction(me, "remove_pos_of_cat_cached", "REMOVE-POS-OF-CAT-CACHED", 2, 0, false);
        declareFunction(me, "pos_of_cat_cached_internal", "POS-OF-CAT-CACHED-INTERNAL", 2, 0, false);
        declareFunction(me, "pos_of_cat_cached", "POS-OF-CAT-CACHED", 2, 0, false);
        declareFunction(me, "make_cat_with_bar_level", "MAKE-CAT-WITH-BAR-LEVEL", 2, 0, false);
        declareFunction(me, "clear_cached_lexical_functions", "CLEAR-CACHED-LEXICAL-FUNCTIONS", 0, 0, false);
        declareFunction(me, "clear_lexical_info_caches", "CLEAR-LEXICAL-INFO-CACHES", 0, 1, false);
        declareFunction(me, "clear_cached_lexical_arg_types", "CLEAR-CACHED-LEXICAL-ARG-TYPES", 0, 0, false);
        declareFunction(me, "clear_denotatum_arg_of_pred_cached", "CLEAR-DENOTATUM-ARG-OF-PRED-CACHED", 0, 0, false);
        declareFunction(me, "clear_stringlist_args_of_pred_cached", "CLEAR-STRINGLIST-ARGS-OF-PRED-CACHED", 0, 0, false);
        declareFunction(me, "clear_wu_arg_of_pred_cached", "CLEAR-WU-ARG-OF-PRED-CACHED", 0, 0, false);
        declareFunction(me, "clear_sense_arg_of_pred_cached", "CLEAR-SENSE-ARG-OF-PRED-CACHED", 0, 0, false);
        declareFunction(me, "clear_frame_arg_of_pred_cached", "CLEAR-FRAME-ARG-OF-PRED-CACHED", 0, 0, false);
        declareFunction(me, "clear_semtrans_arg_of_pred_cached", "CLEAR-SEMTRANS-ARG-OF-PRED-CACHED", 0, 0, false);
        declareFunction(me, "denotatum_arg_of_pred_cached", "DENOTATUM-ARG-OF-PRED-CACHED", 1, 0, false);
        declareFunction(me, "clear_denotatum_arg_of_pred_cached_int", "CLEAR-DENOTATUM-ARG-OF-PRED-CACHED-INT", 0, 0, false);
        declareFunction(me, "remove_denotatum_arg_of_pred_cached_int", "REMOVE-DENOTATUM-ARG-OF-PRED-CACHED-INT", 1, 0, false);
        declareFunction(me, "denotatum_arg_of_pred_cached_int_internal", "DENOTATUM-ARG-OF-PRED-CACHED-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "denotatum_arg_of_pred_cached_int", "DENOTATUM-ARG-OF-PRED-CACHED-INT", 1, 0, false);
        declareFunction(me, "semtrans_arg_of_pred_cached", "SEMTRANS-ARG-OF-PRED-CACHED", 1, 0, false);
        declareFunction(me, "clear_semtrans_arg_of_pred_cached_int", "CLEAR-SEMTRANS-ARG-OF-PRED-CACHED-INT", 0, 0, false);
        declareFunction(me, "remove_semtrans_arg_of_pred_cached_int", "REMOVE-SEMTRANS-ARG-OF-PRED-CACHED-INT", 1, 0, false);
        declareFunction(me, "semtrans_arg_of_pred_cached_int_internal", "SEMTRANS-ARG-OF-PRED-CACHED-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "semtrans_arg_of_pred_cached_int", "SEMTRANS-ARG-OF-PRED-CACHED-INT", 1, 0, false);
        declareFunction(me, "term_from_nl_assertion", "TERM-FROM-NL-ASSERTION", 1, 0, false);
        declareFunction(me, "clear_pos_arg_of_pred_cached", "CLEAR-POS-ARG-OF-PRED-CACHED", 0, 0, false);
        declareFunction(me, "preds_to_pos_args", "PREDS-TO-POS-ARGS", 0, 0, false);
        declareFunction(me, "pos_arg_of_pred_cached", "POS-ARG-OF-PRED-CACHED", 1, 0, false);
        declareFunction(me, "get_pos_arg_of_pred", "GET-POS-ARG-OF-PRED", 1, 0, false);
        declareFunction(me, "clear_get_pos_arg_of_pred_int", "CLEAR-GET-POS-ARG-OF-PRED-INT", 0, 0, false);
        declareFunction(me, "remove_get_pos_arg_of_pred_int", "REMOVE-GET-POS-ARG-OF-PRED-INT", 1, 0, false);
        declareFunction(me, "get_pos_arg_of_pred_int_internal", "GET-POS-ARG-OF-PRED-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "get_pos_arg_of_pred_int", "GET-POS-ARG-OF-PRED-INT", 1, 0, false);
        declareFunction(me, "frame_arg_of_pred_cached", "FRAME-ARG-OF-PRED-CACHED", 1, 1, false);
        declareFunction(me, "clear_frame_arg_of_pred_cached_int", "CLEAR-FRAME-ARG-OF-PRED-CACHED-INT", 0, 0, false);
        declareFunction(me, "remove_frame_arg_of_pred_cached_int", "REMOVE-FRAME-ARG-OF-PRED-CACHED-INT", 1, 1, false);
        declareFunction(me, "frame_arg_of_pred_cached_int_internal", "FRAME-ARG-OF-PRED-CACHED-INT-INTERNAL", 2, 0, false);
        declareFunction(me, "frame_arg_of_pred_cached_int", "FRAME-ARG-OF-PRED-CACHED-INT", 1, 1, false);
        declareFunction(me, "wu_arg_of_pred_cached", "WU-ARG-OF-PRED-CACHED", 1, 0, false);
        declareFunction(me, "clear_wu_arg_of_pred_cached_int", "CLEAR-WU-ARG-OF-PRED-CACHED-INT", 0, 0, false);
        declareFunction(me, "remove_wu_arg_of_pred_cached_int", "REMOVE-WU-ARG-OF-PRED-CACHED-INT", 1, 0, false);
        declareFunction(me, "wu_arg_of_pred_cached_int_internal", "WU-ARG-OF-PRED-CACHED-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "wu_arg_of_pred_cached_int", "WU-ARG-OF-PRED-CACHED-INT", 1, 0, false);
        declareFunction(me, "sense_arg_of_pred_cached", "SENSE-ARG-OF-PRED-CACHED", 1, 0, false);
        declareFunction(me, "clear_sense_arg_of_pred_cached_int", "CLEAR-SENSE-ARG-OF-PRED-CACHED-INT", 0, 0, false);
        declareFunction(me, "remove_sense_arg_of_pred_cached_int", "REMOVE-SENSE-ARG-OF-PRED-CACHED-INT", 1, 0, false);
        declareFunction(me, "sense_arg_of_pred_cached_int_internal", "SENSE-ARG-OF-PRED-CACHED-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "sense_arg_of_pred_cached_int", "SENSE-ARG-OF-PRED-CACHED-INT", 1, 0, false);
        declareFunction(me, "stringlist_args_of_pred_cached", "STRINGLIST-ARGS-OF-PRED-CACHED", 1, 0, false);
        declareFunction(me, "clear_stringlist_args_of_pred_cached_int", "CLEAR-STRINGLIST-ARGS-OF-PRED-CACHED-INT", 0, 0, false);
        declareFunction(me, "remove_stringlist_args_of_pred_cached_int", "REMOVE-STRINGLIST-ARGS-OF-PRED-CACHED-INT", 1, 0, false);
        declareFunction(me, "stringlist_args_of_pred_cached_int_internal", "STRINGLIST-ARGS-OF-PRED-CACHED-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "stringlist_args_of_pred_cached_int", "STRINGLIST-ARGS-OF-PRED-CACHED-INT", 1, 0, false);
        declareFunction(me, "get_string_list_from_formula", "GET-STRING-LIST-FROM-FORMULA", 2, 0, false);
        declareFunction(me, "get_leading_strings_and_following_strings_argnums", "GET-LEADING-STRINGS-AND-FOLLOWING-STRINGS-ARGNUMS", 1, 0, false);
        declareFunction(me, "get_leading_strings_from_formula", "GET-LEADING-STRINGS-FROM-FORMULA", 1, 0, false);
        declareFunction(me, "get_following_strings_from_formula", "GET-FOLLOWING-STRINGS-FROM-FORMULA", 1, 0, false);
        declareFunction(me, "get_leading_strings_and_following_strings", "GET-LEADING-STRINGS-AND-FOLLOWING-STRINGS", 1, 0, false);
        declareFunction(me, "parse_denot_formula", "PARSE-DENOT-FORMULA", 1, 0, false);
        declareFunction(me, "denot_formula_p", "DENOT-FORMULA-P", 1, 0, false);
        declareFunction(me, "parse_lexical_semantic_formula", "PARSE-LEXICAL-SEMANTIC-FORMULA", 1, 1, false);
        declareFunction(me, "lexical_semantic_formula_genl_posP", "LEXICAL-SEMANTIC-FORMULA-GENL-POS?", 2, 1, false);
        declareFunction(me, "lexical_semantic_formula_matches_head_stringXposP", "LEXICAL-SEMANTIC-FORMULA-MATCHES-HEAD-STRING&POS?", 3, 1, false);
        declareFunction(me, "assemble_denot_strings", "ASSEMBLE-DENOT-STRINGS", 3, 0, false);
        declareFunction(me, "proper_noun_form_of_pred", "PROPER-NOUN-FORM-OF-PRED", 1, 0, false);
        declareFunction(me, "common_noun_form_of_pred", "COMMON-NOUN-FORM-OF-PRED", 1, 0, false);
        declareFunction(me, "proper_to_common_pred_map", "PROPER-TO-COMMON-PRED-MAP", 0, 0, false);
        declareFunction(me, "common_noun_form_of_pos", "COMMON-NOUN-FORM-OF-POS", 1, 0, false);
        declareFunction(me, "noun_form_singular", "NOUN-FORM-SINGULAR", 1, 1, false);
        declareFunction(me, "set_noun_form_singular", "SET-NOUN-FORM-SINGULAR", 3, 0, false);
        declareFunction(me, "noun_form_plural", "NOUN-FORM-PLURAL", 1, 1, false);
        declareFunction(me, "set_noun_form_plural", "SET-NOUN-FORM-PLURAL", 3, 0, false);
        declareFunction(me, "noun_form_mass", "NOUN-FORM-MASS", 1, 1, false);
        declareFunction(me, "set_noun_form_mass", "SET-NOUN-FORM-MASS", 3, 0, false);
        declareFunction(me, "proper_noun_form_singular", "PROPER-NOUN-FORM-SINGULAR", 1, 1, false);
        declareFunction(me, "set_proper_noun_form_singular", "SET-PROPER-NOUN-FORM-SINGULAR", 3, 0, false);
        declareFunction(me, "proper_noun_form_plural", "PROPER-NOUN-FORM-PLURAL", 1, 1, false);
        declareFunction(me, "set_proper_noun_form_plural", "SET-PROPER-NOUN-FORM-PLURAL", 3, 0, false);
        declareFunction(me, "proper_noun_form_mass", "PROPER-NOUN-FORM-MASS", 1, 1, false);
        declareFunction(me, "set_proper_noun_form_mass", "SET-PROPER-NOUN-FORM-MASS", 3, 0, false);
        declareFunction(me, "ag_noun_form_singular", "AG-NOUN-FORM-SINGULAR", 1, 1, false);
        declareFunction(me, "set_ag_noun_form_singular", "SET-AG-NOUN-FORM-SINGULAR", 3, 0, false);
        declareFunction(me, "ag_noun_form_plural", "AG-NOUN-FORM-PLURAL", 1, 1, false);
        declareFunction(me, "set_ag_noun_form_plural", "SET-AG-NOUN-FORM-PLURAL", 3, 0, false);
        declareFunction(me, "ag_noun_form_mass", "AG-NOUN-FORM-MASS", 1, 1, false);
        declareFunction(me, "set_ag_noun_form_mass", "SET-AG-NOUN-FORM-MASS", 3, 0, false);
        declareFunction(me, "verb_form_infinitive", "VERB-FORM-INFINITIVE", 1, 1, false);
        declareFunction(me, "set_verb_form_infinitive", "SET-VERB-FORM-INFINITIVE", 3, 0, false);
        declareFunction(me, "verb_form_third_sing", "VERB-FORM-THIRD-SING", 1, 1, false);
        declareFunction(me, "set_verb_form_third_sing", "SET-VERB-FORM-THIRD-SING", 3, 0, false);
        declareFunction(me, "verb_form_progressive", "VERB-FORM-PROGRESSIVE", 1, 1, false);
        declareFunction(me, "set_verb_form_progressive", "SET-VERB-FORM-PROGRESSIVE", 3, 0, false);
        declareFunction(me, "verb_form_past", "VERB-FORM-PAST", 1, 1, false);
        declareFunction(me, "set_verb_form_past", "SET-VERB-FORM-PAST", 3, 0, false);
        declareFunction(me, "verb_form_perfect", "VERB-FORM-PERFECT", 1, 1, false);
        declareFunction(me, "set_verb_form_perfect", "SET-VERB-FORM-PERFECT", 3, 0, false);
        declareFunction(me, "verb_form_pres_participle", "VERB-FORM-PRES-PARTICIPLE", 1, 1, false);
        declareFunction(me, "set_verb_form_pres_participle", "SET-VERB-FORM-PRES-PARTICIPLE", 3, 0, false);
        declareFunction(me, "adjective_form_regular", "ADJECTIVE-FORM-REGULAR", 1, 1, false);
        declareFunction(me, "set_adjective_form_regular", "SET-ADJECTIVE-FORM-REGULAR", 3, 0, false);
        declareFunction(me, "adjective_form_comparative", "ADJECTIVE-FORM-COMPARATIVE", 1, 1, false);
        declareFunction(me, "set_adjective_form_comparative", "SET-ADJECTIVE-FORM-COMPARATIVE", 3, 0, false);
        declareFunction(me, "adjective_form_superlative", "ADJECTIVE-FORM-SUPERLATIVE", 1, 1, false);
        declareFunction(me, "set_adjective_form_superlative", "SET-ADJECTIVE-FORM-SUPERLATIVE", 3, 0, false);
        declareFunction(me, "adjective_form_nongradable", "ADJECTIVE-FORM-NONGRADABLE", 1, 1, false);
        declareFunction(me, "set_adjective_form_nongradable", "SET-ADJECTIVE-FORM-NONGRADABLE", 3, 0, false);
        declareFunction(me, "adverb_form_regular", "ADVERB-FORM-REGULAR", 1, 1, false);
        declareFunction(me, "set_adverb_form_regular", "SET-ADVERB-FORM-REGULAR", 3, 0, false);
        declareFunction(me, "adverb_form_comparative", "ADVERB-FORM-COMPARATIVE", 1, 1, false);
        declareFunction(me, "set_adverb_form_comparative", "SET-ADVERB-FORM-COMPARATIVE", 3, 0, false);
        declareFunction(me, "adverb_form_superlative", "ADVERB-FORM-SUPERLATIVE", 1, 1, false);
        declareFunction(me, "set_adverb_form_superlative", "SET-ADVERB-FORM-SUPERLATIVE", 3, 0, false);
        declareFunction(me, "sentence_tokenize", "SENTENCE-TOKENIZE", 2, 4, false);
        declareFunction(me, "interval_tokens_sequentialize", "INTERVAL-TOKENS-SEQUENTIALIZE", 2, 0, false);
        declareFunction(me, "interval_tokens_split", "INTERVAL-TOKENS-SPLIT", 2, 0, false);
        declareFunction(me, "word_count", "WORD-COUNT", 0, 0, false);
        declareFunction(me, "full_word_count", "FULL-WORD-COUNT", 0, 0, false);
        declareFunction(me, "denotation_count", "DENOTATION-COUNT", 0, 0, false);
        declareFunction(me, "nl_pred_count", "NL-PRED-COUNT", 1, 0, false);
        declareFunction(me, "nl_statistics", "NL-STATISTICS", 0, 2, false);
        declareFunction(me, "nl_stats_file_path", "NL-STATS-FILE-PATH", 0, 0, false);
        declareFunction(me, "count_and_print_nl_preds", "COUNT-AND-PRINT-NL-PREDS", 2, 1, false);
        declareFunction(me, "count_and_print_nl_preds_int", "COUNT-AND-PRINT-NL-PREDS-INT", 5, 0, false);
        declareFunction(me, "categorize_nl_preds", "CATEGORIZE-NL-PREDS", 0, 3, false);
        declareFunction(me, "fort_lexification_extent", "FORT-LEXIFICATION-EXTENT", 0, 0, false);
        declareFunction(me, "unit_with_no_nlP", "UNIT-WITH-NO-NL?", 1, 1, false);
        declareFunction(me, "parse_templates_for_term", "PARSE-TEMPLATES-FOR-TERM", 1, 0, false);
        declareFunction(me, "all_lexifications_for_term", "ALL-LEXIFICATIONS-FOR-TERM", 1, 0, false);
        declareFunction(me, "proper_lexifications_for_term", "PROPER-LEXIFICATIONS-FOR-TERM", 1, 0, false);
        declareFunction(me, "lexifications_for_term", "LEXIFICATIONS-FOR-TERM", 1, 3, false);
        declareFunction(me, "clear_cached_lexifications_for_term", "CLEAR-CACHED-LEXIFICATIONS-FOR-TERM", 0, 0, false);
        declareFunction(me, "remove_cached_lexifications_for_term", "REMOVE-CACHED-LEXIFICATIONS-FOR-TERM", 1, 4, false);
        declareFunction(me, "cached_lexifications_for_term_internal", "CACHED-LEXIFICATIONS-FOR-TERM-INTERNAL", 5, 0, false);
        declareFunction(me, "cached_lexifications_for_term", "CACHED-LEXIFICATIONS-FOR-TERM", 1, 4, false);
        declareFunction(me, "gtqs_lexifications", "GTQS-LEXIFICATIONS", 4, 1, false);
        declareFunction(me, "common_term_in_lexificationsP", "COMMON-TERM-IN-LEXIFICATIONS?", 1, 0, false);
        declareFunction(me, "lexifications_of_common_lexification_term", "LEXIFICATIONS-OF-COMMON-LEXIFICATION-TERM", 1, 1, false);
        declareFunction(me, "gen_string_assertions_for_term", "GEN-STRING-ASSERTIONS-FOR-TERM", 1, 2, false);
        declareFunction(me, "preferred_lexifications_for_term", "PREFERRED-LEXIFICATIONS-FOR-TERM", 1, 3, false);
        declareFunction(me, "get_preferred_lexifications_via_indexing", "GET-PREFERRED-LEXIFICATIONS-VIA-INDEXING", 2, 0, false);
        declareFunction(me, "prefer_lexificationP", "PREFER-LEXIFICATION?", 2, 0, false);
        declareFunction(me, "smart_to_capitalizeP", "SMART-TO-CAPITALIZE?", 1, 0, false);
        declareFunction(me, "term_phrases_constraint_compatible_with_nl_predsP", "TERM-PHRASES-CONSTRAINT-COMPATIBLE-WITH-NL-PREDS?", 2, 0, false);
        declareFunction(me, "term_phrases_constraint_implied_by_nl_predsP", "TERM-PHRASES-CONSTRAINT-IMPLIED-BY-NL-PREDS?", 2, 0, false);
        declareFunction(me, "lexification_sentence_from_preferred_lexification_assertion", "LEXIFICATION-SENTENCE-FROM-PREFERRED-LEXIFICATION-ASSERTION", 1, 0, false);
        declareFunction(me, "loose_lexifications_for_term", "LOOSE-LEXIFICATIONS-FOR-TERM", 1, 0, false);
        declareFunction(me, "stub_lexifications_for_term", "STUB-LEXIFICATIONS-FOR-TERM", 1, 0, false);
        declareFunction(me, "first_termstring_phrase", "FIRST-TERMSTRING-PHRASE", 1, 0, false);
        declareFunction(me, "denotation_lexifications_for_term", "DENOTATION-LEXIFICATIONS-FOR-TERM", 1, 1, false);
        declareFunction(me, "semtrans_lexifications_for_term", "SEMTRANS-LEXIFICATIONS-FOR-TERM", 1, 0, false);
        declareFunction(me, "units_with_no_nl", "UNITS-WITH-NO-NL", 1, 1, false);
        declareFunction(me, "verbs_need_st", "VERBS-NEED-ST", 0, 0, false);
        declareFunction(me, "verbs_need_sf", "VERBS-NEED-SF", 0, 0, false);
        declareFunction(me, "which_words_will_my_rule_affectP", "WHICH-WORDS-WILL-MY-RULE-AFFECT?", 1, 1, false);
        declareFunction(me, "find_missing_lexicon_strings", "FIND-MISSING-LEXICON-STRINGS", 1, 0, false);
        declareFunction(me, "find_missing_pos_forms", "FIND-MISSING-POS-FORMS", 1, 1, false);
        declareFunction(me, "find_equalp_names", "FIND-EQUALP-NAMES", 0, 0, false);
        declareFunction(me, "find_control_chars_in_names", "FIND-CONTROL-CHARS-IN-NAMES", 0, 0, false);
        declareFunction(me, "show_terms_missing_generation_assertions", "SHOW-TERMS-MISSING-GENERATION-ASSERTIONS", 0, 2, false);
        declareFunction(me, "missing_generation_assertion", "MISSING-GENERATION-ASSERTION", 1, 0, false);
        declareFunction(me, "preds_of_string", "PREDS-OF-STRING", 1, 3, false);
        declareFunction(me, "namestring_preds_of_string", "NAMESTRING-PREDS-OF-STRING", 1, 2, false);
        declareFunction(me, "ordered_lexification_preds_of_string", "ORDERED-LEXIFICATION-PREDS-OF-STRING", 1, 3, false);
        declareFunction(me, "ordered_preds_of_string", "ORDERED-PREDS-OF-STRING", 1, 2, false);
        declareFunction(me, "word_variants", "WORD-VARIANTS", 1, 4, false);
        declareFunction(me, "ordered_word_variants", "ORDERED-WORD-VARIANTS", 1, 4, false);
        declareFunction(me, "find_word_root", "FIND-WORD-ROOT", 1, 4, false);
        declareFunction(me, "word_has_part_of_speechP", "WORD-HAS-PART-OF-SPEECH?", 2, 1, false);
        declareFunction(me, "word_has_speech_partP", "WORD-HAS-SPEECH-PART?", 2, 2, false);
        declareFunction(me, "is_determinerP", "IS-DETERMINER?", 1, 2, false);
        declareFunction(me, "strip_determiner", "STRIP-DETERMINER", 1, 1, false);
        declareFunction(me, "wh_wordP", "WH-WORD?", 1, 0, false);
        declareFunction(me, "first_name_p", "FIRST-NAME-P", 1, 0, false);
        declareFunction(me, "first_name_gender", "FIRST-NAME-GENDER", 1, 0, false);
        declareFunction(me, "human_male_given_name_p", "HUMAN-MALE-GIVEN-NAME-P", 1, 0, false);
        declareFunction(me, "human_female_given_name_p", "HUMAN-FEMALE-GIVEN-NAME-P", 1, 0, false);
        declareFunction(me, "construct_word_unit", "CONSTRUCT-WORD-UNIT", 2, 1, false);
        declareFunction(me, "derived_word_affix", "DERIVED-WORD-AFFIX", 1, 1, false);
        declareFunction(me, "derived_word_affix_memoized_internal", "DERIVED-WORD-AFFIX-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction(me, "derived_word_affix_memoized", "DERIVED-WORD-AFFIX-MEMOIZED", 2, 0, false);
        declareFunction(me, "prefix_unit_p", "PREFIX-UNIT-P", 1, 0, false);
        declareFunction(me, "denots_of_string_stop_word", "DENOTS-OF-STRING-STOP-WORD", 1, 0, false);
        declareFunction(me, "clear_stop_word_closed_class_exception", "CLEAR-STOP-WORD-CLOSED-CLASS-EXCEPTION", 0, 0, false);
        declareFunction(me, "remove_stop_word_closed_class_exception", "REMOVE-STOP-WORD-CLOSED-CLASS-EXCEPTION", 1, 1, false);
        declareFunction(me, "stop_word_closed_class_exception_internal", "STOP-WORD-CLOSED-CLASS-EXCEPTION-INTERNAL", 2, 0, false);
        declareFunction(me, "stop_word_closed_class_exception", "STOP-WORD-CLOSED-CLASS-EXCEPTION", 1, 1, false);
        declareFunction(me, "head_keyword_for_frame", "HEAD-KEYWORD-FOR-FRAME", 1, 0, false);
        declareFunction(me, "argument_keywords_for_frame", "ARGUMENT-KEYWORDS-FOR-FRAME", 1, 0, false);
        declareFunction(me, "extract_head_type_and_argument_roles_from_semtrans_template", "EXTRACT-HEAD-TYPE-AND-ARGUMENT-ROLES-FROM-SEMTRANS-TEMPLATE", 2, 0, false);
        declareFunction(me, "construct_semtrans_template_from_head_type_and_argument_roles", "CONSTRUCT-SEMTRANS-TEMPLATE-FROM-HEAD-TYPE-AND-ARGUMENT-ROLES", 3, 0, false);
        declareFunction(me, "language_of_lexicon", "LANGUAGE-OF-LEXICON", 1, 0, false);
        declareFunction(me, "language_of_lexicon_internal", "LANGUAGE-OF-LEXICON-INTERNAL", 1, 0, false);
        declareFunction(me, "clear_lexicons_to_languages", "CLEAR-LEXICONS-TO-LANGUAGES", 0, 0, false);
        declareFunction(me, "initialize_lexicons_to_languages", "INITIALIZE-LEXICONS-TO-LANGUAGES", 0, 0, false);
        declareFunction(me, "maybe_initialize_lexicons_to_languages", "MAYBE-INITIALIZE-LEXICONS-TO-LANGUAGES", 0, 0, false);
        declareFunction(me, "lexical_assertion_of_lexiconP", "LEXICAL-ASSERTION-OF-LEXICON?", 3, 0, false);
        declareFunction(me, "clear_lexical_mt_for_language", "CLEAR-LEXICAL-MT-FOR-LANGUAGE", 0, 0, false);
        declareFunction(me, "remove_lexical_mt_for_language", "REMOVE-LEXICAL-MT-FOR-LANGUAGE", 1, 0, false);
        declareFunction(me, "lexical_mt_for_language_internal", "LEXICAL-MT-FOR-LANGUAGE-INTERNAL", 1, 0, false);
        declareFunction(me, "lexical_mt_for_language", "LEXICAL-MT-FOR-LANGUAGE", 1, 0, false);
        declareFunction(me, "clear_get_language_for_code", "CLEAR-GET-LANGUAGE-FOR-CODE", 0, 0, false);
        declareFunction(me, "remove_get_language_for_code", "REMOVE-GET-LANGUAGE-FOR-CODE", 1, 0, false);
        declareFunction(me, "get_language_for_code_internal", "GET-LANGUAGE-FOR-CODE-INTERNAL", 1, 0, false);
        declareFunction(me, "get_language_for_code", "GET-LANGUAGE-FOR-CODE", 1, 0, false);
        declareFunction(me, "clear_get_code_for_language", "CLEAR-GET-CODE-FOR-LANGUAGE", 0, 0, false);
        declareFunction(me, "remove_get_code_for_language", "REMOVE-GET-CODE-FOR-LANGUAGE", 1, 0, false);
        declareFunction(me, "get_code_for_language_internal", "GET-CODE-FOR-LANGUAGE-INTERNAL", 1, 0, false);
        declareFunction(me, "get_code_for_language", "GET-CODE-FOR-LANGUAGE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_lexicon_utilities_file() {
        deflexical("*NONSTANDARD-NOMINAL-PREDS*", $list0);
        deflexical("*PREDS-OF-POS-CACHED-CACHING-STATE*", NIL);
        deflexical("*PREDS-LICENSED-BY-POS-CACHED-CACHING-STATE*", NIL);
        deflexical("*SPP-MORE-BASIC?-CACHED-CACHING-STATE*", NIL);
        deflexical("*DET-DENOT-IS-SCALAR-INTERVAL?-CACHED-CACHING-STATE*", NIL);
        deflexical("*BAR-LEVEL-CACHED-CACHING-STATE*", NIL);
        deflexical("*POS-OF-CAT-CACHED-CACHING-STATE*", NIL);
        deflexical("*DENOTATUM-ARG-OF-PRED-CACHED-INT-CACHING-STATE*", NIL);
        deflexical("*SEMTRANS-ARG-OF-PRED-CACHED-INT-CACHING-STATE*", NIL);
        deflexical("*PREDS-TO-POS-ARGS*", misc_utilities.uninitialized());
        deflexical("*GET-POS-ARG-OF-PRED-INT-CACHING-STATE*", NIL);
        deflexical("*FRAME-ARG-OF-PRED-CACHED-INT-CACHING-STATE*", NIL);
        deflexical("*WU-ARG-OF-PRED-CACHED-INT-CACHING-STATE*", NIL);
        deflexical("*SENSE-ARG-OF-PRED-CACHED-INT-CACHING-STATE*", NIL);
        deflexical("*STRINGLIST-ARGS-OF-PRED-CACHED-INT-CACHING-STATE*", NIL);
        deflexical("*PROPER-TO-COMMON-PRED-MAP*", $list137);
        deflexical("*NON-CATEGORIZING-NL-PRED-TYPES*", $list193);
        defconstant("*LEXIFICATION-PRED-TYPES*", $list210);
        deflexical("*CACHED-LEXIFICATIONS-FOR-TERM-CACHING-STATE*", NIL);
        deflexical("*STOP-WORD-CLOSED-CLASS-EXCEPTIONS*", NIL);
        deflexical("*STOP-WORD-CLOSED-CLASS-EXCEPTION-CACHING-STATE*", NIL);
        deflexical("*SEMTRANS-FRAME-KEYWORDS*", $list300);
        deflexical("*LEXICONS-TO-LANGUAGES*", $UNINITIALIZED);
        deflexical("*LEXICAL-MT-FOR-LANGUAGE-CACHING-STATE*", NIL);
        deflexical("*GET-LANGUAGE-FOR-CODE-CACHING-STATE*", NIL);
        deflexical("*GET-CODE-FOR-LANGUAGE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_lexicon_utilities_file() {
        memoization_state.note_globally_cached_function(PREDS_OF_POS_CACHED);
        memoization_state.note_globally_cached_function(PREDS_LICENSED_BY_POS_CACHED);
        memoization_state.note_globally_cached_function($sym56$SPP_MORE_BASIC__CACHED);
        memoization_state.note_globally_cached_function($sym68$DET_DENOT_IS_SCALAR_INTERVAL__CACHED);
        memoization_state.note_globally_cached_function(BAR_LEVEL_CACHED);
        memoization_state.note_globally_cached_function(POS_OF_CAT_CACHED);
        memoization_state.note_globally_cached_function(DENOTATUM_ARG_OF_PRED_CACHED_INT);
        memoization_state.note_globally_cached_function(SEMTRANS_ARG_OF_PRED_CACHED_INT);
        memoization_state.note_globally_cached_function(GET_POS_ARG_OF_PRED_INT);
        memoization_state.note_globally_cached_function(FRAME_ARG_OF_PRED_CACHED_INT);
        memoization_state.note_globally_cached_function(WU_ARG_OF_PRED_CACHED_INT);
        memoization_state.note_globally_cached_function(SENSE_ARG_OF_PRED_CACHED_INT);
        memoization_state.note_globally_cached_function(STRINGLIST_ARGS_OF_PRED_CACHED_INT);
        memoization_state.note_globally_cached_function(CACHED_LEXIFICATIONS_FOR_TERM);
        memoization_state.note_memoized_function(DERIVED_WORD_AFFIX_MEMOIZED);
        memoization_state.note_globally_cached_function(STOP_WORD_CLOSED_CLASS_EXCEPTION);
        note_funcall_helper_function(CLEAR_LEXICONS_TO_LANGUAGES);
        memoization_state.note_globally_cached_function(LEXICAL_MT_FOR_LANGUAGE);
        register_external_symbol(LEXICAL_MT_FOR_LANGUAGE);
        memoization_state.note_globally_cached_function(GET_LANGUAGE_FOR_CODE);
        register_external_symbol(GET_LANGUAGE_FOR_CODE);
        memoization_state.note_globally_cached_function(GET_CODE_FOR_LANGUAGE);
        register_external_symbol(GET_CODE_FOR_LANGUAGE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lexicon_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_lexicon_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexicon_utilities_file();
    }

    
}

/**
 * Total time: 10962 ms
 */
