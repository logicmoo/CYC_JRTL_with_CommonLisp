package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.$cfasl_input_to_static_area$;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.control_vars.note_lexicon_initialized;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class lexicon_cache extends SubLTranslatedFile {
    public static final SubLFile me = new lexicon_cache();

    public static final String myName = "com.cyc.cycjava.cycl.lexicon_cache";

    public static final String myFingerPrint = "1a499bb47e0dd301bc6654473d50f8e59e6380196802d6175887e2c853dca7fc";

    // deflexical
    // Definitions
    // To handle rename of #$perfect-Generic -> #$perfectAspect-Generic
    private static final SubLSymbol $perfect_aspect_pred$ = makeSymbol("*PERFECT-ASPECT-PRED*");

    // deflexical
    // The string equality test used by STRINGS-OF-WORD-UNIT etc.
    private static final SubLSymbol $sowu_eq_test$ = makeSymbol("*SOWU-EQ-TEST*");

    // defparameter
    // BOOLEAN; Do we want a single best-guess answer, or a list of answers?
    private static final SubLSymbol $sowu_first_onlyP$ = makeSymbol("*SOWU-FIRST-ONLY?*");

    // defparameter
    // BOOLEAN; Do we use morphology to generate regular forms?
    private static final SubLSymbol $sowu_use_morphologyP$ = makeSymbol("*SOWU-USE-MORPHOLOGY?*");

    // defparameter
    // BOOLEAN; Do we include support assertions for strings?
    private static final SubLSymbol $sowu_include_supportsP$ = makeSymbol("*SOWU-INCLUDE-SUPPORTS?*");

    // defparameter
    // BOOLEAN; Do we assume that answer lists are ordered?
    private static final SubLSymbol $sowu_respect_orderP$ = makeSymbol("*SOWU-RESPECT-ORDER?*");

    // defparameter
    private static final SubLSymbol $within_regular_generation_internalsP$ = makeSymbol("*WITHIN-REGULAR-GENERATION-INTERNALS?*");



    // defparameter
    /**
     * This variable is used to keep a set of arg-lists used by @xref
     * STRING-OR-STRING-OF-WORD&PRED. Since the generation process is recursive, we
     * want to keep it from getting carried away and repeating itself.
     */
    private static final SubLSymbol $sosowp_done_args$ = makeSymbol("*SOSOWP-DONE-ARGS*");

    // defparameter
    private static final SubLSymbol $sosowp_repeated_argsP$ = makeSymbol("*SOSOWP-REPEATED-ARGS?*");

    // defparameter
    /**
     * This variable is used to keep a set of arg-lists used in regular-form
     * generation. Since the generation process is recursive, we want to keep it
     * from getting carried away and repeating itself.
     */
    private static final SubLSymbol $grsos_done_args$ = makeSymbol("*GRSOS-DONE-ARGS*");

    // defparameter
    private static final SubLSymbol $grsos_repeated_argsP$ = makeSymbol("*GRSOS-REPEATED-ARGS?*");

    // deflexical
    /**
     * A representative sample of the KB constants that lexical lookup depends on.
     */
    private static final SubLSymbol $lexicon_core_constants$ = makeSymbol("*LEXICON-CORE-CONSTANTS*");

    // defparameter
    private static final SubLSymbol $allow_nl_trie_rotation_initializationP$ = makeSymbol("*ALLOW-NL-TRIE-ROTATION-INITIALIZATION?*");

    // deflexical
    // Switched off, since we have a swapped NL trie.
    private static final SubLSymbol $must_use_static_memory_for_nl_trieP$ = makeSymbol("*MUST-USE-STATIC-MEMORY-FOR-NL-TRIE?*");

    private static final SubLString $str0$_Revision__146268__ = makeString("$Revision: 146268 $");

    public static final SubLSymbol $lexicon_cache_code_revision$ = makeSymbol("*LEXICON-CACHE-CODE-REVISION*");

    public static final SubLList $list2 = list(list(makeString("1.193"), makeString("1.194")), list(makeString("1.194"), makeString("1.195")), list(makeString("1.195"), makeString("1.196")), list(makeString("1.197"), makeString("1.198")), list(makeString("1.198"), makeString("1.199")), list(makeString("1.199"), makeString("1.200")));

    public static final SubLString $str3$d2c1a460_aa6e_11d8_8d3f_0002b3a84 = makeString("d2c1a460-aa6e-11d8-8d3f-0002b3a84f94");



    public static final SubLSymbol PARSE_MORPHOLOGICALLY_OPTION_P = makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P");

    public static final SubLSymbol WORDS_OF_STRING = makeSymbol("WORDS-OF-STRING");

    public static final SubLList $list7 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("MISSPELLINGS?"), makeSymbol("*MISSPELLINGS?*")), list(makeSymbol("LOOKUP-MT"), makeSymbol("*LEXICON-LOOKUP-MT*")), list(makeSymbol("PARSE-MORPHOLOGICALLY"), makeSymbol("*PARSE-MORPHOLOGICALLY*")));

    public static final SubLString $str8$_return_LISTP__of_word_units_asso = makeString("@return LISTP; of word units associated with STRING.\n@param STRING stringp\n@param MISSPELLINGS? boolean; Should we include misspellings?\n@param LOOKUP-MT hlmt-p; Which mt should we look from?\n@param PARSE-MORPHOLOGICALLY: :ALWAYS or :NEVER or :AS-FALLBACK;\n                               Do we attempt to parse STRING as a complex (multi-morpheme) word?");

    public static final SubLList $list9 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("PARSE-MORPHOLOGICALLY"), makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P")));

    public static final SubLList $list10 = list(makeSymbol("LISTP"));



    public static final SubLSymbol $sym12$LEXICAL_WORD_ = makeSymbol("LEXICAL-WORD?");

    public static final SubLSymbol $sym13$SPEECH_PART_PRED_ = makeSymbol("SPEECH-PART-PRED?");







    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));





    private static final SubLString $str20$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str25$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLString $str27$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    public static final SubLString $str28$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    public static final SubLString $str29$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLObject $$regularSuffix = reader_make_constant_shell(makeString("regularSuffix"));



    public static final SubLSymbol $sym32$PREFER_POS_PRED_ = makeSymbol("PREFER-POS-PRED?");

    public static final SubLSymbol REGULAR_GENERATION_ANSWER_STRING = makeSymbol("REGULAR-GENERATION-ANSWER-STRING");

    public static final SubLSymbol SOSOWP_DO_FILTER_EXCEPTIONS = makeSymbol("SOSOWP-DO-FILTER-EXCEPTIONS");



    public static final SubLSymbol ALL_SPEC_PREDICATES = makeSymbol("ALL-SPEC-PREDICATES");

    public static final SubLSymbol $sosowp_do_filter_exceptions_caching_state$ = makeSymbol("*SOSOWP-DO-FILTER-EXCEPTIONS-CACHING-STATE*");

    private static final SubLSymbol $sym38$GENL_PRED_ = makeSymbol("GENL-PRED?");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));



    private static final SubLSymbol ALL_GENL_LEXICON_PREDS = makeSymbol("ALL-GENL-LEXICON-PREDS");

    private static final SubLSymbol $sym45$_ = makeSymbol(">");

    private static final SubLSymbol NUM_PREDICATE_EXTENT_INDEX = makeSymbol("NUM-PREDICATE-EXTENT-INDEX");



    private static final SubLList $list48 = list(makeSymbol("ARGS"), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLSymbol $sym51$NEW_ARGS_ = makeSymbol("NEW-ARGS?");



    private static final SubLList $list53 = list(makeSymbol("*SOSOWP-DONE-ARGS*"));

    public static final SubLList $list54 = list(list(makeSymbol("*SOSOWP-REPEATED-ARGS?*"), list(makeSymbol("COR"), makeSymbol("*SOSOWP-REPEATED-ARGS?*"), list(makeSymbol("CNOT"), makeSymbol("NEW-ARGS?")))));





    private static final SubLSymbol SET_REMOVE = makeSymbol("SET-REMOVE");

    private static final SubLSymbol $sym58$STRING_OR_STRINGS_OF_WORD_PRED = makeSymbol("STRING-OR-STRINGS-OF-WORD&PRED");

    private static final SubLSymbol RELEVANT_PRED_IS_EVERYTHING = makeSymbol("RELEVANT-PRED-IS-EVERYTHING");



    private static final SubLList $list61 = listS(makeSymbol("STRING"), makeSymbol("PRED"), makeSymbol("SUPPORTS"));

    private static final SubLSymbol REGULAR_GENERATION_ANSWER_STRING_PLUS_SUPPORTS = makeSymbol("REGULAR-GENERATION-ANSWER-STRING-PLUS-SUPPORTS");

    private static final SubLSymbol SOSOWP_INT_ANSWER_TO_UTF8 = makeSymbol("SOSOWP-INT-ANSWER-TO-UTF8");

    public static final SubLSymbol $sym64$_STRING = makeSymbol("?STRING");

    public static final SubLSymbol $sym65$_PRED = makeSymbol("?PRED");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");



    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");





    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");



    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));



    public static final SubLSymbol SOSOWP_INT_SPEC_PREDS = makeSymbol("SOSOWP-INT-SPEC-PREDS");

    private static final SubLInteger $int$200 = makeInteger(200);

    public static final SubLSymbol $sym77$PREFER_LEXICAL_ASSERTION_ = makeSymbol("PREFER-LEXICAL-ASSERTION?");

    private static final SubLObject $$simpleFuture_Generic = reader_make_constant_shell(makeString("simpleFuture-Generic"));

    private static final SubLObject $$futureTense_Generic = reader_make_constant_shell(makeString("futureTense-Generic"));

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

    private static final SubLObject $$EnglishHeadlineParaphraseMt = reader_make_constant_shell(makeString("EnglishHeadlineParaphraseMt"));

    private static final SubLString $$$to_ = makeString("to ");

    private static final SubLString $$$will_ = makeString("will ");

    private static final SubLObject $$infinitive = reader_make_constant_shell(makeString("infinitive"));

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLObject $$perfect = reader_make_constant_shell(makeString("perfect"));

    private static final SubLObject $$abbreviationForLexicalWord = reader_make_constant_shell(makeString("abbreviationForLexicalWord"));





    private static final SubLObject $$futurePerfect_Universal = reader_make_constant_shell(makeString("futurePerfect-Universal"));

    private static final SubLString $$$will_have = makeString("will have");

    private static final SubLObject $$pastPerfect_Universal = reader_make_constant_shell(makeString("pastPerfect-Universal"));

    private static final SubLString $$$had = makeString("had");

    private static final SubLObject $$firstPersonSg_PresentPerfect = reader_make_constant_shell(makeString("firstPersonSg-PresentPerfect"));

    private static final SubLObject $$secondPersonSg_PresentPerfect = reader_make_constant_shell(makeString("secondPersonSg-PresentPerfect"));

    private static final SubLObject $$pluralVerb_PresentPerfect = reader_make_constant_shell(makeString("pluralVerb-PresentPerfect"));

    private static final SubLString $$$have = makeString("have");

    private static final SubLObject $$thirdPersonSg_PresentPerfect = reader_make_constant_shell(makeString("thirdPersonSg-PresentPerfect"));

    private static final SubLString $$$has = makeString("has");

    private static final SubLObject $$dispreferredLexification = reader_make_constant_shell(makeString("dispreferredLexification"));







    private static final SubLObject $$genStringAssertion_Terse = reader_make_constant_shell(makeString("genStringAssertion-Terse"));



    private static final SubLObject $$genStringAssertion_Precise = reader_make_constant_shell(makeString("genStringAssertion-Precise"));

    private static final SubLObject $$genStringAssertion = reader_make_constant_shell(makeString("genStringAssertion"));



    private static final SubLObject $$verbStrings = reader_make_constant_shell(makeString("verbStrings"));

    private static final SubLObject $$simpleNounStrings = reader_make_constant_shell(makeString("simpleNounStrings"));

    private static final SubLObject $$plural_Generic = reader_make_constant_shell(makeString("plural-Generic"));

    private static final SubLObject $$singular_Generic = reader_make_constant_shell(makeString("singular-Generic"));

    private static final SubLObject $$ProperNoun = reader_make_constant_shell(makeString("ProperNoun"));

    private static final SubLObject $$CountNoun_Generic = reader_make_constant_shell(makeString("CountNoun-Generic"));

    private static final SubLObject $$MassNoun_Generic = reader_make_constant_shell(makeString("MassNoun-Generic"));

    private static final SubLInteger $int$400 = makeInteger(400);

    private static final SubLObject $$tensed = reader_make_constant_shell(makeString("tensed"));

    private static final SubLObject $$presentTense_Generic = reader_make_constant_shell(makeString("presentTense-Generic"));

    private static final SubLList $list119 = list(makeSymbol("*GRSOS-DONE-ARGS*"));

    private static final SubLList $list120 = list(list(makeSymbol("*WITHIN-REGULAR-GENERATION-INTERNALS?*"), T), list(makeSymbol("*GRSOS-REPEATED-ARGS?*"), list(makeSymbol("COR"), makeSymbol("*GRSOS-REPEATED-ARGS?*"), list(makeSymbol("CNOT"), makeSymbol("NEW-ARGS?")))));

    private static final SubLObject $$adverbStrings = reader_make_constant_shell(makeString("adverbStrings"));

    private static final SubLObject $$adjStrings = reader_make_constant_shell(makeString("adjStrings"));

    private static final SubLObject $$regularDegree = reader_make_constant_shell(makeString("regularDegree"));

    private static final SubLObject $$regularAdverb = reader_make_constant_shell(makeString("regularAdverb"));

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLObject $$comparativeDegree = reader_make_constant_shell(makeString("comparativeDegree"));

    private static final SubLObject $$comparativeAdverb = reader_make_constant_shell(makeString("comparativeAdverb"));

    private static final SubLObject $$superlativeDegree = reader_make_constant_shell(makeString("superlativeDegree"));

    private static final SubLObject $$superlativeAdverb = reader_make_constant_shell(makeString("superlativeAdverb"));

    private static final SubLString $$$est = makeString("est");

    private static final SubLString $$$er = makeString("er");

    public static final SubLList $list132 = list(reader_make_constant_shell(makeString("LexicalWord")), reader_make_constant_shell(makeString("nameString")), reader_make_constant_shell(makeString("termStrings")), reader_make_constant_shell(makeString("GeneralLexiconMt")), reader_make_constant_shell(makeString("AllLexicalMicrotheoryPSC")));

    private static final SubLSymbol $sym133$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLObject $$AnytimePSC = reader_make_constant_shell(makeString("AnytimePSC"));

    private static final SubLList $list135 = list(makeString("AllEnglishValidatedLexicalMicrotheoryPSC"), makeString("AllEnglishLexicalMicrotheoryPSC"), makeString("EnglishMt"), makeString("BaseKB"));

    private static final SubLString $str136$Merely_validating_NL_trie_as_it_a = makeString("Merely validating NL trie as it appears to be non-empty and non-stale.");

    private static final SubLString $str137$Skipping_initialization_of_NL_tri = makeString("Skipping initialization of NL trie rotation index and it appears to not be ~A.");

    private static final SubLString $$$needed = makeString("needed");

    private static final SubLString $$$allowed = makeString("allowed");

    private static final SubLString $str140$lexicon_cache = makeString("lexicon-cache");

    private static final SubLString $$$cfasl = makeString("cfasl");



    private static final SubLString $str143$Dumping_lexicon_cache___ = makeString("Dumping lexicon cache...");

    private static final SubLString $str144$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str145$CFASL_file__s_not_found = makeString("CFASL file ~s not found");

    private static final SubLString $str146$Loading_lexicon_cache___ = makeString("Loading lexicon cache...");



    private static final SubLString $str148$nl_trie_contents = makeString("nl-trie-contents");

    private static final SubLString $str149$nl_trie_contents_index = makeString("nl-trie-contents-index");

    private static final SubLSymbol $sym150$_MUST_USE_STATIC_MEMORY_FOR_NL_TRIE__ = makeSymbol("*MUST-USE-STATIC-MEMORY-FOR-NL-TRIE?*");

    private static final SubLSymbol MUST_USE_STATIC_MEMORY_FOR_NL_TRIE = makeSymbol("MUST-USE-STATIC-MEMORY-FOR-NL-TRIE");

    private static final SubLString $str152$Instruct_the_loader_to_use_static = makeString("Instruct the loader to use static memory when loading the NL trie.");

    private static final SubLList $list153 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol MAY_USE_DYNAMIC_MEMORY_FOR_NL_TRIE = makeSymbol("MAY-USE-DYNAMIC-MEMORY-FOR-NL-TRIE");

    private static final SubLString $str155$Instruct_the_loader_to_leave_it_u = makeString("Instruct the loader to leave it up to the implementation whether to\n   use dynamic or static memory when loading the NL trie");













    private static final SubLList $list162 = list(list(list(reader_make_constant_shell(makeString("thirdPersonSg-Past")), reader_make_constant_shell(makeString("thirdPersonSg-Present"))), NIL), list(list(reader_make_constant_shell(makeString("thirdPersonSg-Present")), reader_make_constant_shell(makeString("thirdPersonSg-Past"))), T), list(list(reader_make_constant_shell(makeString("pastPerfect-Universal")), reader_make_constant_shell(makeString("thirdPersonSg-Past"))), NIL), list(list(reader_make_constant_shell(makeString("thirdPersonSg-Past")), reader_make_constant_shell(makeString("pastPerfect-Universal"))), T));

    public static SubLObject perfect_aspect_pred() {
        if (NIL == $perfect_aspect_pred$.getGlobalValue()) {
            $perfect_aspect_pred$.setGlobalValue(constants_high.find_constant_by_guid(Guids.string_to_guid($str3$d2c1a460_aa6e_11d8_8d3f_0002b3a84)));
        }
        return $perfect_aspect_pred$.getGlobalValue();
    }

    public static SubLObject words_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        SubLTrampolineFile.enforceType(string, STRINGP);
        SubLTrampolineFile.enforceType(parse_morphologically, PARSE_MORPHOLOGICALLY_OPTION_P);
        SubLObject words = nl_trie_accessors.nl_trie_words_of_string(string, misspellingsP, lookup_mt, UNPROVIDED);
        if (NIL != lexicon_accessors.proceed_with_morphological_parsingP(words, parse_morphologically)) {
            words = czer_utilities.delete_el_duplicates(append(words, morphological_word_parser.words_of_complex_word_string(string)));
        }
        return words;
    }

    public static SubLObject strings_of_word_unit(final SubLObject word, SubLObject include, SubLObject exceptions, SubLObject mt) {
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
        assert NIL != lexicon_accessors.lexical_wordP(word) : "lexicon_accessors.lexical_wordP(word) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word) " + word;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $sowu_first_onlyP$.currentBinding(thread);
        try {
            $sowu_first_onlyP$.bind(NIL, thread);
            ans = string_or_strings_of_word_unit(word, include, exceptions, mt, UNPROVIDED);
        } finally {
            $sowu_first_onlyP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject first_string_of_word_unit(final SubLObject word, SubLObject include, SubLObject exceptions, SubLObject mt) {
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
        assert NIL != lexicon_accessors.lexical_wordP(word) : "lexicon_accessors.lexical_wordP(word) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word) " + word;
        SubLObject string = NIL;
        SubLObject pred = NIL;
        final SubLObject _prev_bind_0 = $sowu_first_onlyP$.currentBinding(thread);
        try {
            $sowu_first_onlyP$.bind(T, thread);
            thread.resetMultipleValues();
            final SubLObject string_$1 = string_or_strings_of_word_unit(word, include, exceptions, mt, UNPROVIDED);
            final SubLObject pred_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            string = string_$1;
            pred = pred_$2;
        } finally {
            $sowu_first_onlyP$.rebind(_prev_bind_0, thread);
        }
        return values(string, pred);
    }

    public static SubLObject strings_of_wordXpred(final SubLObject word, final SubLObject pred, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != lexicon_accessors.lexical_wordP(word) : "lexicon_accessors.lexical_wordP(word) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word) " + word;
        assert NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED) : "lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + pred;
        SubLObject ans_strings = NIL;
        SubLObject ans_preds = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$3 = $sowu_first_onlyP$.currentBinding(thread);
                try {
                    $sowu_first_onlyP$.bind(NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject ans_strings_$4 = string_or_strings_of_wordXpred(word, pred, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject ans_preds_$5 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    ans_strings = ans_strings_$4;
                    ans_preds = ans_preds_$5;
                } finally {
                    $sowu_first_onlyP$.rebind(_prev_bind_0_$3, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(ans_strings, ans_preds);
    }

    public static SubLObject inference_strings_of_wordXpred(final SubLObject word, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $sowu_include_supportsP$.currentBinding(thread);
        try {
            $sowu_include_supportsP$.bind(T, thread);
            ans = strings_of_wordXpred(word, pred, mt_relevance_macros.mt_info(UNPROVIDED));
        } finally {
            $sowu_include_supportsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject first_string_of_wordXpred(final SubLObject word, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != lexicon_accessors.lexical_wordP(word) : "lexicon_accessors.lexical_wordP(word) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(word) " + word;
        assert NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED) : "lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + pred;
        SubLObject ans_string = NIL;
        SubLObject ans_pred = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$7 = $sowu_first_onlyP$.currentBinding(thread);
                try {
                    $sowu_first_onlyP$.bind(T, thread);
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        thread.resetMultipleValues();
                        final SubLObject ans_string_$9 = string_or_strings_of_wordXpred(word, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject ans_pred_$10 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        ans_string = ans_string_$9;
                        ans_pred = ans_pred_$10;
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$8, thread);
                    }
                } finally {
                    $sowu_first_onlyP$.rebind(_prev_bind_0_$7, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return values(ans_string, ans_pred);
    }

    public static SubLObject ok_to_derive_word_form_from_predP(final SubLObject wu, final SubLObject derived_pred, final SubLObject basic_pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLObject cleared_preds = set_utilities.new_singleton_set(basic_pred, UNPROVIDED);
        return ok_to_derive_word_form_for_predP(wu, derived_pred, mt, cleared_preds);
    }

    public static SubLObject ok_to_derive_word_form_for_predP(final SubLObject wu, final SubLObject pred, final SubLObject mt, final SubLObject cleared_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = NIL;
        SubLObject irregularP = NIL;
        if ((NIL != lexicon_accessors.derived_predP(pred, mt)) && (NIL == irregularP)) {
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                        final SubLObject tv_var = $$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str20$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str20$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str20$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str25$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str20$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$16 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                        for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == irregularP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$21 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$21;
                                            final SubLObject _prev_bind_0_$16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$21)) {
                                                    irregularP = word_form_assertedP(wu, spec_pred, mt);
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$17;
                                                SubLObject _prev_bind_1_$17;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt_$25;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$18;
                                                SubLObject iteration_state_$27;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$19;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$29;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$20;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = NIL, rest = accessible_modules; (NIL == irregularP) && (NIL != rest); rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$17 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var_$21);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == irregularP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt_$25 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$25)) {
                                                                            _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$25, thread);
                                                                                for (iteration_state_$27 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == irregularP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$27)); iteration_state_$27 = dictionary_contents.do_dictionary_contents_next(iteration_state_$27)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$27);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == irregularP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == irregularP) {
                                                                                                        csome_list_var = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while ((NIL == irregularP) && (NIL != csome_list_var)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str27$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$19, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$27);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$18, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str28$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                for (rest_$29 = NIL, rest_$29 = new_list; (NIL == irregularP) && (NIL != rest_$29); rest_$29 = rest_$29.rest()) {
                                                                    generating_fn = rest_$29.first();
                                                                    _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == irregularP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                if (NIL == irregularP) {
                                                                                    csome_list_var2 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while ((NIL == irregularP) && (NIL != csome_list_var2)) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str27$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$20, thread);
                                                                    }
                                                                }
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$17, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$17, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$16, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$18, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$16, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$15, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str29$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$17, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$15, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$14, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$14, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$13, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$12, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == irregularP) {
            set.set_add(pred, cleared_preds);
            if (NIL == okP) {
                SubLObject csome_list_var3 = kb_mapping_utilities.pred_values_in_relevant_mts(pred, $$regularSuffix, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject more_basic_pred = NIL;
                more_basic_pred = csome_list_var3.first();
                while ((NIL == okP) && (NIL != csome_list_var3)) {
                    okP = makeBoolean(((NIL == lexicon_accessors.derived_predP(more_basic_pred, UNPROVIDED)) || (NIL != set.set_memberP(more_basic_pred, cleared_preds))) || (NIL != ok_to_derive_word_form_for_predP(wu, more_basic_pred, mt, cleared_preds)));
                    set.set_add(more_basic_pred, cleared_preds);
                    csome_list_var3 = csome_list_var3.rest();
                    more_basic_pred = csome_list_var3.first();
                } 
            }
        }
        return okP;
    }

    public static SubLObject word_form_assertedP(final SubLObject wu, final SubLObject pred, final SubLObject mt) {
        return kb_mapping_utilities.some_pred_value_in_relevant_mts(wu, pred, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_regular_string(final SubLObject wu, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != lexicon_accessors.lexical_wordP(wu) : "lexicon_accessors.lexical_wordP(wu) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(wu) " + wu;
        assert NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED) : "lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + pred;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $sowu_first_onlyP$.currentBinding(thread);
        try {
            $sowu_first_onlyP$.bind(T, thread);
            ans = generate_regular_string_or_strings(wu, pred, mt);
        } finally {
            $sowu_first_onlyP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject generate_regular_strings(final SubLObject wu, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != lexicon_accessors.lexical_wordP(wu) : "lexicon_accessors.lexical_wordP(wu) " + "CommonSymbols.NIL != lexicon_accessors.lexical_wordP(wu) " + wu;
        assert NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED) : "lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != lexicon_accessors.speech_part_predP(pred, CommonSymbols.UNPROVIDED) " + pred;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $sowu_first_onlyP$.currentBinding(thread);
        try {
            $sowu_first_onlyP$.bind(NIL, thread);
            ans = generate_regular_string_or_strings(wu, pred, mt);
        } finally {
            $sowu_first_onlyP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject strings_of_word_unit_with_supports(final SubLObject word, final SubLObject include) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(include) : "Types.listp(include) " + "CommonSymbols.NIL != Types.listp(include) " + include;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $sowu_include_supportsP$.currentBinding(thread);
        try {
            $sowu_include_supportsP$.bind(T, thread);
            ans = strings_of_word_unit(word, include, NIL, NIL);
        } finally {
            $sowu_include_supportsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject ordered_strings_of_word_unit(final SubLObject word, SubLObject include, SubLObject exceptions, SubLObject lookup_mt) {
        if (include == UNPROVIDED) {
            include = $ALL;
        }
        if (exceptions == UNPROVIDED) {
            exceptions = NIL;
        }
        if (lookup_mt == UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject respect_orderP = T;
        final SubLObject _prev_bind_0 = $sowu_first_onlyP$.currentBinding(thread);
        try {
            $sowu_first_onlyP$.bind(NIL, thread);
            ans = string_or_strings_of_word_unit(word, include, exceptions, lookup_mt, respect_orderP);
        } finally {
            $sowu_first_onlyP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject string_or_strings_of_word_unit(SubLObject word, final SubLObject include, final SubLObject exceptions, SubLObject mt, SubLObject respect_orderP) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (respect_orderP == UNPROVIDED) {
            respect_orderP = $sowu_respect_orderP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != possibly_naut_p(word)) {
            final SubLObject nart = narts_high.find_nart(word);
            word = (NIL != nart) ? nart : word;
        }
        if ((NIL != forts.fort_p(word)) && (NIL == lexicon_accessors.quick_lexical_wordP(word, UNPROVIDED))) {
            return NIL;
        }
        final SubLObject preds0 = (include == $ALL) ? lexicon_accessors.top_level_nl_preds() : include;
        final SubLObject preds2 = ((NIL != respect_orderP) || (NIL == $sowu_first_onlyP$.getDynamicValue(thread))) ? preds0 : Sort.sort(sosowp_filter_exceptions(copy_list(preds0), exceptions), $sym32$PREFER_POS_PRED_, UNPROVIDED);
        SubLObject answers = NIL;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = $within_regular_generation_internalsP$.currentBinding(thread);
        try {
            $within_regular_generation_internalsP$.bind(T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$32 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = preds2;
                            SubLObject pred = NIL;
                            pred = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                if (NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED)) {
                                    final SubLObject new_answers = string_or_strings_of_wordXpred(word, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (NIL != new_answers) {
                                        answers = append(answers, new_answers);
                                        doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                pred = csome_list_var.first();
                            } 
                        }
                        if (((include == $ALL) && (NIL == doneP)) && (NIL == doneP)) {
                            SubLObject csome_list_var = lexicon_accessors.other_strings_of_wu(word, lexicon_vars.$misspellingsP$.getDynamicValue(thread), mt);
                            SubLObject other_string = NIL;
                            other_string = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                if (NIL == subl_promotions.memberP(other_string, answers, $sowu_eq_test$.getGlobalValue(), REGULAR_GENERATION_ANSWER_STRING)) {
                                    answers = cons(list(other_string, lexicon_vars.$top_level_nl_pred$.getGlobalValue()), answers);
                                    doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                }
                                csome_list_var = csome_list_var.rest();
                                other_string = csome_list_var.first();
                            } 
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$33, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$32, thread);
            }
        } finally {
            $within_regular_generation_internalsP$.rebind(_prev_bind_0, thread);
        }
        return extract_regular_generation_answer_type(answers, $sowu_first_onlyP$.getDynamicValue(thread), $sowu_include_supportsP$.getDynamicValue(thread), $within_regular_generation_internalsP$.getDynamicValue(thread), respect_orderP);
    }

    public static SubLObject sosowp_filter_exceptions(final SubLObject include, final SubLObject exceptions) {
        if (NIL == include) {
            return NIL;
        }
        if (NIL == exceptions) {
            return include;
        }
        return sosowp_do_filter_exceptions(include, exceptions);
    }

    public static SubLObject clear_sosowp_do_filter_exceptions() {
        final SubLObject cs = $sosowp_do_filter_exceptions_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sosowp_do_filter_exceptions(final SubLObject include, final SubLObject exceptions) {
        return memoization_state.caching_state_remove_function_results_with_args($sosowp_do_filter_exceptions_caching_state$.getGlobalValue(), list(include, exceptions), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sosowp_do_filter_exceptions_internal(final SubLObject include, final SubLObject exceptions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
            final SubLObject all_include = delete_duplicates(list_utilities.flatten(Mapping.mapcar(ALL_SPEC_PREDICATES, include)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject filtered_include = NIL;
            SubLObject cdolist_list_var = all_include;
            SubLObject include_pred = NIL;
            include_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == lexicon_accessors.speech_part_pred_max_floors(cons(include_pred, exceptions), UNPROVIDED)) {
                    final SubLObject item_var = include_pred;
                    if (NIL == member(item_var, filtered_include, symbol_function(EQL), symbol_function(IDENTITY))) {
                        filtered_include = cons(item_var, filtered_include);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                include_pred = cdolist_list_var.first();
            } 
            ans = sosowp_remove_spec_preds(filtered_include, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject sosowp_do_filter_exceptions(final SubLObject include, final SubLObject exceptions) {
        SubLObject caching_state = $sosowp_do_filter_exceptions_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SOSOWP_DO_FILTER_EXCEPTIONS, $sosowp_do_filter_exceptions_caching_state$, NIL, EQUAL, TWO_INTEGER, SIXTEEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(include, exceptions);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (include.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && exceptions.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(sosowp_do_filter_exceptions_internal(include, exceptions)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(include, exceptions));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject sosowp_remove_spec_preds(final SubLObject preds, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (!preds.isList()) {
            return NIL;
        }
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject others = remove(pred, preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == subl_promotions.memberP(funcall(key, pred), others, $sym38$GENL_PRED_, key)) {
                ans = cons(pred, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject sosowp_repeated_argsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sosowp_repeated_argsP$.getDynamicValue(thread);
    }

    public static SubLObject sosowp_top_levelP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numLE(set.set_size($sosowp_done_args$.getDynamicValue(thread)), ONE_INTEGER);
    }

    public static SubLObject higher_asserted_entry_for_wuP(final SubLObject pred, final SubLObject wu, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != indexed_term_p(wu)) {
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL == ans) {
                        SubLObject csome_list_var = all_genl_lexicon_preds(pred, mt_info);
                        SubLObject genl_pred = NIL;
                        genl_pred = csome_list_var.first();
                        while ((NIL == ans) && (NIL != csome_list_var)) {
                            if (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(wu, genl_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                ans = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            genl_pred = csome_list_var.first();
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
                        if (NIL == ans) {
                            SubLObject csome_list_var = all_genl_lexicon_preds(pred, mt_info);
                            SubLObject genl_pred = NIL;
                            genl_pred = csome_list_var.first();
                            while ((NIL == ans) && (NIL != csome_list_var)) {
                                if (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(wu, genl_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    ans = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                genl_pred = csome_list_var.first();
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
                            if (NIL == ans) {
                                SubLObject csome_list_var = all_genl_lexicon_preds(pred, mt_info);
                                SubLObject genl_pred = NIL;
                                genl_pred = csome_list_var.first();
                                while ((NIL == ans) && (NIL != csome_list_var)) {
                                    if (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(wu, genl_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        ans = T;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    genl_pred = csome_list_var.first();
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
                            if (NIL == ans) {
                                SubLObject csome_list_var = all_genl_lexicon_preds(pred, mt_info);
                                SubLObject genl_pred = NIL;
                                genl_pred = csome_list_var.first();
                                while ((NIL == ans) && (NIL != csome_list_var)) {
                                    if (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(wu, genl_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        ans = T;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    genl_pred = csome_list_var.first();
                                } 
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }


        }
        return ans;
    }

    public static SubLObject all_genl_lexicon_preds_internal(final SubLObject pred, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                ans = Sort.sort(genl_predicates.all_genl_preds(pred, UNPROVIDED, UNPROVIDED), symbol_function($sym45$_), NUM_PREDICATE_EXTENT_INDEX);
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
                    ans = Sort.sort(genl_predicates.all_genl_preds(pred, UNPROVIDED, UNPROVIDED), symbol_function($sym45$_), NUM_PREDICATE_EXTENT_INDEX);
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
                        ans = Sort.sort(genl_predicates.all_genl_preds(pred, UNPROVIDED, UNPROVIDED), symbol_function($sym45$_), NUM_PREDICATE_EXTENT_INDEX);
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
                        ans = Sort.sort(genl_predicates.all_genl_preds(pred, UNPROVIDED, UNPROVIDED), symbol_function($sym45$_), NUM_PREDICATE_EXTENT_INDEX);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return ans;
    }

    public static SubLObject all_genl_lexicon_preds(final SubLObject pred, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return all_genl_lexicon_preds_internal(pred, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_GENL_LEXICON_PREDS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_GENL_LEXICON_PREDS, TWO_INTEGER, $int$64, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ALL_GENL_LEXICON_PREDS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt_info);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(all_genl_lexicon_preds_internal(pred, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject with_sosowp_context(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list48);
        args = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(CLET, bq_cons(list($sym51$NEW_ARGS_, listS(SET_ADD, args, $list53)), $list54), bq_cons(CUNWIND_PROTECT, append(body, list(list(PWHEN, $sym51$NEW_ARGS_, listS(SET_REMOVE, args, $list53)))))));
    }

    public static SubLObject string_or_strings_of_wordXpred_internal(SubLObject word, final SubLObject pred, SubLObject mt_info, SubLObject first_onlyP, SubLObject include_supportsP, SubLObject within_regular_generation_internalsP, SubLObject respect_orderP) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        if (first_onlyP == UNPROVIDED) {
            first_onlyP = $sowu_first_onlyP$.getDynamicValue();
        }
        if (include_supportsP == UNPROVIDED) {
            include_supportsP = $sowu_include_supportsP$.getDynamicValue();
        }
        if (within_regular_generation_internalsP == UNPROVIDED) {
            within_regular_generation_internalsP = $within_regular_generation_internalsP$.getDynamicValue();
        }
        if (respect_orderP == UNPROVIDED) {
            respect_orderP = $sowu_respect_orderP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != possibly_naut_p(word)) {
            final SubLObject nart = narts_high.find_nart(word);
            word = (NIL != nart) ? nart : word;
        }
        SubLObject answers = NIL;
        final SubLObject _prev_bind_0 = $within_regular_generation_internalsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        try {
            $within_regular_generation_internalsP$.bind(T, thread);
            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EVERYTHING, thread);
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                final SubLObject _prev_bind_0_$35 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$36 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    answers = sosowp_int(word, pred, mt_info, first_onlyP, include_supportsP, $sowu_use_morphologyP$.getDynamicValue(thread), $sowu_eq_test$.getGlobalValue());
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$36, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$35, thread);
                }
            } else
                if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                    final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$37 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        answers = sosowp_int(word, pred, mt_info, first_onlyP, include_supportsP, $sowu_use_morphologyP$.getDynamicValue(thread), $sowu_eq_test$.getGlobalValue());
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$37, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$36, thread);
                    }
                } else
                    if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                        final SubLObject _prev_bind_0_$37 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$38 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                            mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                            answers = sosowp_int(word, pred, mt_info, first_onlyP, include_supportsP, $sowu_use_morphologyP$.getDynamicValue(thread), $sowu_eq_test$.getGlobalValue());
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$38, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$37, thread);
                        }
                    } else {
                        final SubLObject _prev_bind_0_$38 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$39 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind(mt_info, thread);
                            answers = sosowp_int(word, pred, mt_info, first_onlyP, include_supportsP, $sowu_use_morphologyP$.getDynamicValue(thread), $sowu_eq_test$.getGlobalValue());
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$39, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$38, thread);
                        }
                    }


        } finally {
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
            $within_regular_generation_internalsP$.rebind(_prev_bind_0, thread);
        }
        return extract_regular_generation_answer_type(answers, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP);
    }

    public static SubLObject string_or_strings_of_wordXpred(final SubLObject word, final SubLObject pred, SubLObject mt_info, SubLObject first_onlyP, SubLObject include_supportsP, SubLObject within_regular_generation_internalsP, SubLObject respect_orderP) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        if (first_onlyP == UNPROVIDED) {
            first_onlyP = $sowu_first_onlyP$.getDynamicValue();
        }
        if (include_supportsP == UNPROVIDED) {
            include_supportsP = $sowu_include_supportsP$.getDynamicValue();
        }
        if (within_regular_generation_internalsP == UNPROVIDED) {
            within_regular_generation_internalsP = $within_regular_generation_internalsP$.getDynamicValue();
        }
        if (respect_orderP == UNPROVIDED) {
            respect_orderP = $sowu_respect_orderP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return string_or_strings_of_wordXpred_internal(word, pred, mt_info, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym58$STRING_OR_STRINGS_OF_WORD_PRED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym58$STRING_OR_STRINGS_OF_WORD_PRED, SEVEN_INTEGER, $int$1000, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym58$STRING_OR_STRINGS_OF_WORD_PRED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(word, pred, mt_info, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP);
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
                    if (pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt_info.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (first_onlyP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (include_supportsP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (within_regular_generation_internalsP.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && respect_orderP.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(string_or_strings_of_wordXpred_internal(word, pred, mt_info, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word, pred, mt_info, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject make_regular_generation_answer(final SubLObject string, SubLObject pred, SubLObject supports) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (supports == UNPROVIDED) {
            supports = NIL;
        }
        return append(list(string, pred), supports);
    }

    public static SubLObject regular_generation_answer_string(final SubLObject v_answer) {
        return v_answer.first();
    }

    public static SubLObject regular_generation_answer_pred(final SubLObject v_answer) {
        return second(v_answer);
    }

    public static SubLObject regular_generation_answer_supports(final SubLObject v_answer) {
        return v_answer.rest().rest();
    }

    public static SubLObject regular_generation_answer_string_plus_supports(final SubLObject v_answer) {
        SubLObject string = NIL;
        SubLObject pred = NIL;
        SubLObject supports = NIL;
        destructuring_bind_must_consp(v_answer, v_answer, $list61);
        string = v_answer.first();
        SubLObject current = v_answer.rest();
        destructuring_bind_must_consp(current, v_answer, $list61);
        pred = current.first();
        current = supports = current.rest();
        return cons(string, supports);
    }

    public static SubLObject extract_regular_generation_answer_type(final SubLObject answers, SubLObject first_onlyP, SubLObject include_supportsP, SubLObject within_regular_generation_internalsP, SubLObject respect_orderP) {
        if (first_onlyP == UNPROVIDED) {
            first_onlyP = $sowu_first_onlyP$.getDynamicValue();
        }
        if (include_supportsP == UNPROVIDED) {
            include_supportsP = $sowu_include_supportsP$.getDynamicValue();
        }
        if (within_regular_generation_internalsP == UNPROVIDED) {
            within_regular_generation_internalsP = $within_regular_generation_internalsP$.getDynamicValue();
        }
        if (respect_orderP == UNPROVIDED) {
            respect_orderP = NIL;
        }
        if (NIL != within_regular_generation_internalsP) {
            return answers;
        }
        if (NIL != first_onlyP) {
            final SubLObject first_answer = answers.first();
            return values(regular_generation_answer_string(first_answer), regular_generation_answer_pred(first_answer));
        }
        if (NIL != include_supportsP) {
            return Mapping.mapcar(REGULAR_GENERATION_ANSWER_STRING_PLUS_SUPPORTS, answers);
        }
        SubLObject strings = NIL;
        SubLObject preds = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject answer_string = regular_generation_answer_string(v_answer);
            if (NIL == subl_promotions.memberP(answer_string, strings, symbol_function(EQUAL), UNPROVIDED)) {
                strings = cons(answer_string, strings);
                preds = cons(regular_generation_answer_pred(v_answer), preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return NIL != respect_orderP ? values(nreverse(strings), nreverse(preds)) : values(strings, preds);
    }

    public static SubLObject sosowp_int(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        final SubLObject new_argsP = set.set_add(list(word, pred, mt_info), $sosowp_done_args$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = $sosowp_repeated_argsP$.currentBinding(thread);
        try {
            $sosowp_repeated_argsP$.bind(makeBoolean((NIL != $sosowp_repeated_argsP$.getDynamicValue(thread)) || (NIL == new_argsP)), thread);
            try {
                answers = (NIL != indexed_term_p(word)) ? sosowp_int_via_index_surfing(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test) : NIL;
            } finally {
                final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != new_argsP) {
                        set.set_remove(list(word, pred, mt_info), $sosowp_done_args$.getDynamicValue(thread));
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                }
            }
        } finally {
            $sosowp_repeated_argsP$.rebind(_prev_bind_0, thread);
        }
        answers = Mapping.mapcar(SOSOWP_INT_ANSWER_TO_UTF8, answers);
        if (NIL == first_onlyP) {
            answers = delete_duplicates(answers, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            answers = sosowp_sort_answers(answers);
            answers = sosowp_remove_duplicate_strings(answers, test);
        }
        return answers;
    }

    public static SubLObject sosowp_int_answer_to_utf8(final SubLObject v_answer) {
        return rplaca(v_answer, cycl_string.cycl_string_to_utf8_string(v_answer.first()));
    }

    public static SubLObject sosowp_int_via_inference(final SubLObject word, final SubLObject pred, final SubLObject mt, final SubLObject first_onlyP, final SubLObject include_supportsP) {
        final SubLObject string_var = $sym64$_STRING;
        final SubLObject pred_var = $sym65$_PRED;
        final SubLObject exhaustiveP = NIL;
        final SubLObject query_properties = list($MAX_TRANSFORMATION_DEPTH, THREE_INTEGER, $MAX_NUMBER, (NIL != first_onlyP) || (NIL == exhaustiveP) ? ONE_INTEGER : NIL, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $NONE, $RETURN, NIL != include_supportsP ? $BINDINGS_AND_SUPPORTS : $BINDINGS);
        final SubLObject query_sentence = list($$and, list(pred_var, word, string_var), list($$genlPreds, pred_var, pred));
        final SubLObject query_results = inference_kernel.new_cyc_query(query_sentence, mt, query_properties);
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = query_results;
        SubLObject query_result = NIL;
        query_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = (NIL != include_supportsP) ? query_result.first() : query_result;
            final SubLObject supports = (NIL != include_supportsP) ? second(query_result) : NIL;
            final SubLObject result_string = bindings.variable_lookup(string_var, v_bindings);
            final SubLObject result_pred = bindings.variable_lookup(pred_var, v_bindings);
            if (result_string.isString() && (NIL != result_pred)) {
                answers = cons(make_regular_generation_answer(result_string, result_pred, supports), answers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_result = cdolist_list_var.first();
        } 
        return answers;
    }

    public static SubLObject sosowp_int_via_index_surfing(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject answers = sosowp_int_this_pred(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP);
        SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        doneP = makeBoolean((NIL != doneP) || (NIL != sosowp_repeated_argsP()));
        if (NIL == doneP) {
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject spec_pred_answers = sosowp_int_spec_preds(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                    answers = append(answers, spec_pred_answers);
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
                        final SubLObject spec_pred_answers = sosowp_int_spec_preds(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                        answers = append(answers, spec_pred_answers);
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
                            final SubLObject spec_pred_answers = sosowp_int_spec_preds(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                            answers = append(answers, spec_pred_answers);
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
                            final SubLObject spec_pred_answers = sosowp_int_spec_preds(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                            answers = append(answers, spec_pred_answers);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }


        }
        return answers;
    }

    public static SubLObject sosowp_remove_duplicate_strings(final SubLObject answers, final SubLObject test) {
        return list_utilities.remove_duplicates_from_end(answers, test, symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sosowp_int_spec_preds_internal(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        SubLObject doneP = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word(pred, word);
                if (NIL == doneP) {
                    SubLObject csome_list_var = spec_preds;
                    SubLObject spec_pred = NIL;
                    spec_pred = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        if (NIL != lexicon_accessors.speech_part_predP(spec_pred, UNPROVIDED)) {
                            SubLObject spec_pred_answers = sosowp_int(word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                            if (NIL != spec_pred_answers) {
                                if ((NIL != $sowu_include_supportsP$.getDynamicValue(thread)) && (NIL != sosowp_top_levelP())) {
                                    SubLObject enhanced_answers = NIL;
                                    SubLObject cdolist_list_var = spec_pred_answers;
                                    SubLObject v_answer = NIL;
                                    v_answer = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        enhanced_answers = cons(make_regular_generation_answer(regular_generation_answer_string(v_answer), regular_generation_answer_pred(v_answer), cons(removal_module_utilities.make_genl_preds_support(regular_generation_answer_pred(v_answer), pred), regular_generation_answer_supports(v_answer))), enhanced_answers);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        v_answer = cdolist_list_var.first();
                                    } 
                                    spec_pred_answers = nreverse(enhanced_answers);
                                }
                                if (NIL != first_onlyP) {
                                    answers = spec_pred_answers;
                                    doneP = T;
                                } else {
                                    answers = append(answers, spec_pred_answers);
                                }
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        spec_pred = csome_list_var.first();
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
                    final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word(pred, word);
                    if (NIL == doneP) {
                        SubLObject csome_list_var = spec_preds;
                        SubLObject spec_pred = NIL;
                        spec_pred = csome_list_var.first();
                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                            if (NIL != lexicon_accessors.speech_part_predP(spec_pred, UNPROVIDED)) {
                                SubLObject spec_pred_answers = sosowp_int(word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                                if (NIL != spec_pred_answers) {
                                    if ((NIL != $sowu_include_supportsP$.getDynamicValue(thread)) && (NIL != sosowp_top_levelP())) {
                                        SubLObject enhanced_answers = NIL;
                                        SubLObject cdolist_list_var = spec_pred_answers;
                                        SubLObject v_answer = NIL;
                                        v_answer = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            enhanced_answers = cons(make_regular_generation_answer(regular_generation_answer_string(v_answer), regular_generation_answer_pred(v_answer), cons(removal_module_utilities.make_genl_preds_support(regular_generation_answer_pred(v_answer), pred), regular_generation_answer_supports(v_answer))), enhanced_answers);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            v_answer = cdolist_list_var.first();
                                        } 
                                        spec_pred_answers = nreverse(enhanced_answers);
                                    }
                                    if (NIL != first_onlyP) {
                                        answers = spec_pred_answers;
                                        doneP = T;
                                    } else {
                                        answers = append(answers, spec_pred_answers);
                                    }
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            spec_pred = csome_list_var.first();
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
                        final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word(pred, word);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = spec_preds;
                            SubLObject spec_pred = NIL;
                            spec_pred = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                if (NIL != lexicon_accessors.speech_part_predP(spec_pred, UNPROVIDED)) {
                                    SubLObject spec_pred_answers = sosowp_int(word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                                    if (NIL != spec_pred_answers) {
                                        if ((NIL != $sowu_include_supportsP$.getDynamicValue(thread)) && (NIL != sosowp_top_levelP())) {
                                            SubLObject enhanced_answers = NIL;
                                            SubLObject cdolist_list_var = spec_pred_answers;
                                            SubLObject v_answer = NIL;
                                            v_answer = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                enhanced_answers = cons(make_regular_generation_answer(regular_generation_answer_string(v_answer), regular_generation_answer_pred(v_answer), cons(removal_module_utilities.make_genl_preds_support(regular_generation_answer_pred(v_answer), pred), regular_generation_answer_supports(v_answer))), enhanced_answers);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                v_answer = cdolist_list_var.first();
                                            } 
                                            spec_pred_answers = nreverse(enhanced_answers);
                                        }
                                        if (NIL != first_onlyP) {
                                            answers = spec_pred_answers;
                                            doneP = T;
                                        } else {
                                            answers = append(answers, spec_pred_answers);
                                        }
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                spec_pred = csome_list_var.first();
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
                        final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word(pred, word);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = spec_preds;
                            SubLObject spec_pred = NIL;
                            spec_pred = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                if (NIL != lexicon_accessors.speech_part_predP(spec_pred, UNPROVIDED)) {
                                    SubLObject spec_pred_answers = sosowp_int(word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                                    if (NIL != spec_pred_answers) {
                                        if ((NIL != $sowu_include_supportsP$.getDynamicValue(thread)) && (NIL != sosowp_top_levelP())) {
                                            SubLObject enhanced_answers = NIL;
                                            SubLObject cdolist_list_var = spec_pred_answers;
                                            SubLObject v_answer = NIL;
                                            v_answer = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                enhanced_answers = cons(make_regular_generation_answer(regular_generation_answer_string(v_answer), regular_generation_answer_pred(v_answer), cons(removal_module_utilities.make_genl_preds_support(regular_generation_answer_pred(v_answer), pred), regular_generation_answer_supports(v_answer))), enhanced_answers);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                v_answer = cdolist_list_var.first();
                                            } 
                                            spec_pred_answers = nreverse(enhanced_answers);
                                        }
                                        if (NIL != first_onlyP) {
                                            answers = spec_pred_answers;
                                            doneP = T;
                                        } else {
                                            answers = append(answers, spec_pred_answers);
                                        }
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                spec_pred = csome_list_var.first();
                            } 
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return answers;
    }

    public static SubLObject sosowp_int_spec_preds(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sosowp_int_spec_preds_internal(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SOSOWP_INT_SPEC_PREDS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SOSOWP_INT_SPEC_PREDS, SEVEN_INTEGER, $int$200, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SOSOWP_INT_SPEC_PREDS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
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
                    if (pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt_info.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (first_onlyP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (include_supportsP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (use_morphologyP.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && test.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sosowp_int_spec_preds_internal(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject sosowp_int_this_pred(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        SubLObject doneP = NIL;
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index(word, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
                lookup_gafs = Sort.sort(lookup_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED);
                if (NIL == doneP) {
                    SubLObject csome_list_var = lookup_gafs;
                    SubLObject gaf = NIL;
                    gaf = csome_list_var.first();
                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                        final SubLObject string = assertions_high.gaf_arg2(gaf);
                        final SubLObject v_answer = (NIL != include_supportsP) ? list(string, pred, gaf) : list(string, pred);
                        answers = cons(v_answer, answers);
                        if (NIL != first_onlyP) {
                            doneP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        gaf = csome_list_var.first();
                    } 
                }
                answers = nreverse(answers);
                if (NIL == doneP) {
                    if ((NIL == lookup_gafs) && (NIL != use_morphologyP)) {
                        if (NIL == higher_asserted_entry_for_wuP(pred, word, mt_info)) {
                            if ((NIL != (NIL != valid_constantP($$simpleFuture_Generic, UNPROVIDED) ? lexicon_accessors.genl_pos_predP(pred, $$simpleFuture_Generic, UNPROVIDED) : makeBoolean((NIL != valid_constantP($$futureTense_Generic, UNPROVIDED)) && (NIL != lexicon_accessors.genl_pos_predP(pred, $$futureTense_Generic, UNPROVIDED))))) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishMt))) {
                                if (NIL == doneP) {
                                    SubLObject csome_list_var = string_or_strings_of_wordXpred(word, $$infinitive, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED);
                                    SubLObject future_answer = NIL;
                                    future_answer = csome_list_var.first();
                                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                                        if (NIL != future_answer) {
                                            final SubLObject infinitive = regular_generation_answer_string(future_answer);
                                            final SubLObject helper = ((NIL != valid_constantP($$EnglishHeadlineParaphraseMt, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishHeadlineParaphraseMt))) ? $$$to_ : $$$will_;
                                            final SubLObject future_string = cconcatenate(helper, infinitive);
                                            answers = cons(list(future_string, pred), answers);
                                            doneP = first_onlyP;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        future_answer = csome_list_var.first();
                                    } 
                                }
                            } else
                                if (((NIL != valid_constantP(perfect_aspect_pred(), UNPROVIDED)) && (NIL != lexicon_accessors.genl_pos_predP(pred, perfect_aspect_pred(), UNPROVIDED))) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishMt))) {
                                    final SubLObject have_aux = perfect_english_have_aux_for_pred(pred);
                                    if (have_aux.isString() && (NIL == doneP)) {
                                        SubLObject csome_list_var2 = string_or_strings_of_wordXpred(word, $$perfect, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED);
                                        SubLObject perfect_answer = NIL;
                                        perfect_answer = csome_list_var2.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                            if (NIL != perfect_answer) {
                                                final SubLObject perfect_form = regular_generation_answer_string(perfect_answer);
                                                final SubLObject perfect_string = cconcatenate(have_aux, new SubLObject[]{ $$$_, perfect_form });
                                                answers = cons(list(perfect_string, pred), answers);
                                                doneP = first_onlyP;
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            perfect_answer = csome_list_var2.first();
                                        } 
                                    }
                                } else
                                    if ((NIL != lexicon_accessors.derived_predP(pred, UNPROVIDED)) && (NIL == doneP)) {
                                        SubLObject csome_list_var = generate_regular_string_or_strings(word, pred, mt_info);
                                        SubLObject derived_answer = NIL;
                                        derived_answer = csome_list_var.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                                            if (NIL != derived_answer) {
                                                answers = cons(derived_answer, answers);
                                                doneP = first_onlyP;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            derived_answer = csome_list_var.first();
                                        } 
                                    }


                        }
                    }
                }
                if ((NIL == doneP) && (NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue(thread))) {
                    SubLObject abbrev_gafs = NIL;
                    final SubLObject pred_var = $$abbreviationForLexicalWord;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$44 = NIL;
                                    final SubLObject token_var_$45 = NIL;
                                    while (NIL == done_var_$44) {
                                        final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$45);
                                        final SubLObject valid_$46 = makeBoolean(!token_var_$45.eql(abbrev_gaf));
                                        if (NIL != valid_$46) {
                                            final SubLObject term_phrases_constraint = assertions_high.gaf_arg2(abbrev_gaf);
                                            if (term_phrases_constraint.eql(pred) || term_phrases_constraint.eql(lexicon_accessors.pos_of_pred(pred))) {
                                                abbrev_gafs = cons(abbrev_gaf, abbrev_gafs);
                                            }
                                        }
                                        done_var_$44 = makeBoolean(NIL == valid_$46);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                    abbrev_gafs = Sort.sort(abbrev_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED);
                    if (NIL == doneP) {
                        SubLObject csome_list_var3 = abbrev_gafs;
                        SubLObject gaf2 = NIL;
                        gaf2 = csome_list_var3.first();
                        while ((NIL == doneP) && (NIL != csome_list_var3)) {
                            final SubLObject string_arg = THREE_INTEGER;
                            final SubLObject string2 = assertions_high.gaf_arg(gaf2, string_arg);
                            SubLObject v_answer2 = list(string2, pred);
                            if (NIL != include_supportsP) {
                                v_answer2 = append(v_answer2, list(gaf2));
                            }
                            answers = cons(v_answer2, answers);
                            if (NIL != first_onlyP) {
                                doneP = T;
                            }
                            csome_list_var3 = csome_list_var3.rest();
                            gaf2 = csome_list_var3.first();
                        } 
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
                    SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index(word, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
                    lookup_gafs = Sort.sort(lookup_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED);
                    if (NIL == doneP) {
                        SubLObject csome_list_var = lookup_gafs;
                        SubLObject gaf = NIL;
                        gaf = csome_list_var.first();
                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                            final SubLObject string = assertions_high.gaf_arg2(gaf);
                            final SubLObject v_answer = (NIL != include_supportsP) ? list(string, pred, gaf) : list(string, pred);
                            answers = cons(v_answer, answers);
                            if (NIL != first_onlyP) {
                                doneP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            gaf = csome_list_var.first();
                        } 
                    }
                    answers = nreverse(answers);
                    if (NIL == doneP) {
                        if ((NIL == lookup_gafs) && (NIL != use_morphologyP)) {
                            if (NIL == higher_asserted_entry_for_wuP(pred, word, mt_info)) {
                                if ((NIL != (NIL != valid_constantP($$simpleFuture_Generic, UNPROVIDED) ? lexicon_accessors.genl_pos_predP(pred, $$simpleFuture_Generic, UNPROVIDED) : makeBoolean((NIL != valid_constantP($$futureTense_Generic, UNPROVIDED)) && (NIL != lexicon_accessors.genl_pos_predP(pred, $$futureTense_Generic, UNPROVIDED))))) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishMt))) {
                                    if (NIL == doneP) {
                                        SubLObject csome_list_var = string_or_strings_of_wordXpred(word, $$infinitive, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED);
                                        SubLObject future_answer = NIL;
                                        future_answer = csome_list_var.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                                            if (NIL != future_answer) {
                                                final SubLObject infinitive = regular_generation_answer_string(future_answer);
                                                final SubLObject helper = ((NIL != valid_constantP($$EnglishHeadlineParaphraseMt, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishHeadlineParaphraseMt))) ? $$$to_ : $$$will_;
                                                final SubLObject future_string = cconcatenate(helper, infinitive);
                                                answers = cons(list(future_string, pred), answers);
                                                doneP = first_onlyP;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            future_answer = csome_list_var.first();
                                        } 
                                    }
                                } else
                                    if (((NIL != valid_constantP(perfect_aspect_pred(), UNPROVIDED)) && (NIL != lexicon_accessors.genl_pos_predP(pred, perfect_aspect_pred(), UNPROVIDED))) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishMt))) {
                                        final SubLObject have_aux = perfect_english_have_aux_for_pred(pred);
                                        if (have_aux.isString() && (NIL == doneP)) {
                                            SubLObject csome_list_var2 = string_or_strings_of_wordXpred(word, $$perfect, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED);
                                            SubLObject perfect_answer = NIL;
                                            perfect_answer = csome_list_var2.first();
                                            while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                                if (NIL != perfect_answer) {
                                                    final SubLObject perfect_form = regular_generation_answer_string(perfect_answer);
                                                    final SubLObject perfect_string = cconcatenate(have_aux, new SubLObject[]{ $$$_, perfect_form });
                                                    answers = cons(list(perfect_string, pred), answers);
                                                    doneP = first_onlyP;
                                                }
                                                csome_list_var2 = csome_list_var2.rest();
                                                perfect_answer = csome_list_var2.first();
                                            } 
                                        }
                                    } else
                                        if ((NIL != lexicon_accessors.derived_predP(pred, UNPROVIDED)) && (NIL == doneP)) {
                                            SubLObject csome_list_var = generate_regular_string_or_strings(word, pred, mt_info);
                                            SubLObject derived_answer = NIL;
                                            derived_answer = csome_list_var.first();
                                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                                if (NIL != derived_answer) {
                                                    answers = cons(derived_answer, answers);
                                                    doneP = first_onlyP;
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                derived_answer = csome_list_var.first();
                                            } 
                                        }


                            }
                        }
                    }
                    if ((NIL == doneP) && (NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue(thread))) {
                        SubLObject abbrev_gafs = NIL;
                        final SubLObject pred_var = $$abbreviationForLexicalWord;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, NIL, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, NIL, pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$45 = NIL;
                                        final SubLObject token_var_$46 = NIL;
                                        while (NIL == done_var_$45) {
                                            final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                            final SubLObject valid_$47 = makeBoolean(!token_var_$46.eql(abbrev_gaf));
                                            if (NIL != valid_$47) {
                                                final SubLObject term_phrases_constraint = assertions_high.gaf_arg2(abbrev_gaf);
                                                if (term_phrases_constraint.eql(pred) || term_phrases_constraint.eql(lexicon_accessors.pos_of_pred(pred))) {
                                                    abbrev_gafs = cons(abbrev_gaf, abbrev_gafs);
                                                }
                                            }
                                            done_var_$45 = makeBoolean(NIL == valid_$47);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                        abbrev_gafs = Sort.sort(abbrev_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED);
                        if (NIL == doneP) {
                            SubLObject csome_list_var3 = abbrev_gafs;
                            SubLObject gaf2 = NIL;
                            gaf2 = csome_list_var3.first();
                            while ((NIL == doneP) && (NIL != csome_list_var3)) {
                                final SubLObject string_arg = THREE_INTEGER;
                                final SubLObject string2 = assertions_high.gaf_arg(gaf2, string_arg);
                                SubLObject v_answer2 = list(string2, pred);
                                if (NIL != include_supportsP) {
                                    v_answer2 = append(v_answer2, list(gaf2));
                                }
                                answers = cons(v_answer2, answers);
                                if (NIL != first_onlyP) {
                                    doneP = T;
                                }
                                csome_list_var3 = csome_list_var3.rest();
                                gaf2 = csome_list_var3.first();
                            } 
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
                        SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index(word, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
                        lookup_gafs = Sort.sort(lookup_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = lookup_gafs;
                            SubLObject gaf = NIL;
                            gaf = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                final SubLObject string = assertions_high.gaf_arg2(gaf);
                                final SubLObject v_answer = (NIL != include_supportsP) ? list(string, pred, gaf) : list(string, pred);
                                answers = cons(v_answer, answers);
                                if (NIL != first_onlyP) {
                                    doneP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                gaf = csome_list_var.first();
                            } 
                        }
                        answers = nreverse(answers);
                        if (NIL == doneP) {
                            if ((NIL == lookup_gafs) && (NIL != use_morphologyP)) {
                                if (NIL == higher_asserted_entry_for_wuP(pred, word, mt_info)) {
                                    if ((NIL != (NIL != valid_constantP($$simpleFuture_Generic, UNPROVIDED) ? lexicon_accessors.genl_pos_predP(pred, $$simpleFuture_Generic, UNPROVIDED) : makeBoolean((NIL != valid_constantP($$futureTense_Generic, UNPROVIDED)) && (NIL != lexicon_accessors.genl_pos_predP(pred, $$futureTense_Generic, UNPROVIDED))))) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishMt))) {
                                        if (NIL == doneP) {
                                            SubLObject csome_list_var = string_or_strings_of_wordXpred(word, $$infinitive, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED);
                                            SubLObject future_answer = NIL;
                                            future_answer = csome_list_var.first();
                                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                                if (NIL != future_answer) {
                                                    final SubLObject infinitive = regular_generation_answer_string(future_answer);
                                                    final SubLObject helper = ((NIL != valid_constantP($$EnglishHeadlineParaphraseMt, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishHeadlineParaphraseMt))) ? $$$to_ : $$$will_;
                                                    final SubLObject future_string = cconcatenate(helper, infinitive);
                                                    answers = cons(list(future_string, pred), answers);
                                                    doneP = first_onlyP;
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                future_answer = csome_list_var.first();
                                            } 
                                        }
                                    } else
                                        if (((NIL != valid_constantP(perfect_aspect_pred(), UNPROVIDED)) && (NIL != lexicon_accessors.genl_pos_predP(pred, perfect_aspect_pred(), UNPROVIDED))) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishMt))) {
                                            final SubLObject have_aux = perfect_english_have_aux_for_pred(pred);
                                            if (have_aux.isString() && (NIL == doneP)) {
                                                SubLObject csome_list_var2 = string_or_strings_of_wordXpred(word, $$perfect, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED);
                                                SubLObject perfect_answer = NIL;
                                                perfect_answer = csome_list_var2.first();
                                                while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                                    if (NIL != perfect_answer) {
                                                        final SubLObject perfect_form = regular_generation_answer_string(perfect_answer);
                                                        final SubLObject perfect_string = cconcatenate(have_aux, new SubLObject[]{ $$$_, perfect_form });
                                                        answers = cons(list(perfect_string, pred), answers);
                                                        doneP = first_onlyP;
                                                    }
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    perfect_answer = csome_list_var2.first();
                                                } 
                                            }
                                        } else
                                            if ((NIL != lexicon_accessors.derived_predP(pred, UNPROVIDED)) && (NIL == doneP)) {
                                                SubLObject csome_list_var = generate_regular_string_or_strings(word, pred, mt_info);
                                                SubLObject derived_answer = NIL;
                                                derived_answer = csome_list_var.first();
                                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                                    if (NIL != derived_answer) {
                                                        answers = cons(derived_answer, answers);
                                                        doneP = first_onlyP;
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    derived_answer = csome_list_var.first();
                                                } 
                                            }


                                }
                            }
                        }
                        if ((NIL == doneP) && (NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue(thread))) {
                            SubLObject abbrev_gafs = NIL;
                            final SubLObject pred_var = $$abbreviationForLexicalWord;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, NIL, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, NIL, pred_var);
                                SubLObject done_var = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$46 = NIL;
                                            final SubLObject token_var_$47 = NIL;
                                            while (NIL == done_var_$46) {
                                                final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                                                final SubLObject valid_$48 = makeBoolean(!token_var_$47.eql(abbrev_gaf));
                                                if (NIL != valid_$48) {
                                                    final SubLObject term_phrases_constraint = assertions_high.gaf_arg2(abbrev_gaf);
                                                    if (term_phrases_constraint.eql(pred) || term_phrases_constraint.eql(lexicon_accessors.pos_of_pred(pred))) {
                                                        abbrev_gafs = cons(abbrev_gaf, abbrev_gafs);
                                                    }
                                                }
                                                done_var_$46 = makeBoolean(NIL == valid_$48);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values3 = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values3);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                } 
                            }
                            abbrev_gafs = Sort.sort(abbrev_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED);
                            if (NIL == doneP) {
                                SubLObject csome_list_var3 = abbrev_gafs;
                                SubLObject gaf2 = NIL;
                                gaf2 = csome_list_var3.first();
                                while ((NIL == doneP) && (NIL != csome_list_var3)) {
                                    final SubLObject string_arg = THREE_INTEGER;
                                    final SubLObject string2 = assertions_high.gaf_arg(gaf2, string_arg);
                                    SubLObject v_answer2 = list(string2, pred);
                                    if (NIL != include_supportsP) {
                                        v_answer2 = append(v_answer2, list(gaf2));
                                    }
                                    answers = cons(v_answer2, answers);
                                    if (NIL != first_onlyP) {
                                        doneP = T;
                                    }
                                    csome_list_var3 = csome_list_var3.rest();
                                    gaf2 = csome_list_var3.first();
                                } 
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
                        SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index(word, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
                        lookup_gafs = Sort.sort(lookup_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = lookup_gafs;
                            SubLObject gaf = NIL;
                            gaf = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                final SubLObject string = assertions_high.gaf_arg2(gaf);
                                final SubLObject v_answer = (NIL != include_supportsP) ? list(string, pred, gaf) : list(string, pred);
                                answers = cons(v_answer, answers);
                                if (NIL != first_onlyP) {
                                    doneP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                gaf = csome_list_var.first();
                            } 
                        }
                        answers = nreverse(answers);
                        if (NIL == doneP) {
                            if ((NIL == lookup_gafs) && (NIL != use_morphologyP)) {
                                if (NIL == higher_asserted_entry_for_wuP(pred, word, mt_info)) {
                                    if ((NIL != (NIL != valid_constantP($$simpleFuture_Generic, UNPROVIDED) ? lexicon_accessors.genl_pos_predP(pred, $$simpleFuture_Generic, UNPROVIDED) : makeBoolean((NIL != valid_constantP($$futureTense_Generic, UNPROVIDED)) && (NIL != lexicon_accessors.genl_pos_predP(pred, $$futureTense_Generic, UNPROVIDED))))) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishMt))) {
                                        if (NIL == doneP) {
                                            SubLObject csome_list_var = string_or_strings_of_wordXpred(word, $$infinitive, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED);
                                            SubLObject future_answer = NIL;
                                            future_answer = csome_list_var.first();
                                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                                if (NIL != future_answer) {
                                                    final SubLObject infinitive = regular_generation_answer_string(future_answer);
                                                    final SubLObject helper = ((NIL != valid_constantP($$EnglishHeadlineParaphraseMt, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishHeadlineParaphraseMt))) ? $$$to_ : $$$will_;
                                                    final SubLObject future_string = cconcatenate(helper, infinitive);
                                                    answers = cons(list(future_string, pred), answers);
                                                    doneP = first_onlyP;
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                future_answer = csome_list_var.first();
                                            } 
                                        }
                                    } else
                                        if (((NIL != valid_constantP(perfect_aspect_pred(), UNPROVIDED)) && (NIL != lexicon_accessors.genl_pos_predP(pred, perfect_aspect_pred(), UNPROVIDED))) && (NIL != mt_relevance_macros.relevant_mtP($$EnglishMt))) {
                                            final SubLObject have_aux = perfect_english_have_aux_for_pred(pred);
                                            if (have_aux.isString() && (NIL == doneP)) {
                                                SubLObject csome_list_var2 = string_or_strings_of_wordXpred(word, $$perfect, mt_info, first_onlyP, include_supportsP, UNPROVIDED, UNPROVIDED);
                                                SubLObject perfect_answer = NIL;
                                                perfect_answer = csome_list_var2.first();
                                                while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                                    if (NIL != perfect_answer) {
                                                        final SubLObject perfect_form = regular_generation_answer_string(perfect_answer);
                                                        final SubLObject perfect_string = cconcatenate(have_aux, new SubLObject[]{ $$$_, perfect_form });
                                                        answers = cons(list(perfect_string, pred), answers);
                                                        doneP = first_onlyP;
                                                    }
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    perfect_answer = csome_list_var2.first();
                                                } 
                                            }
                                        } else
                                            if ((NIL != lexicon_accessors.derived_predP(pred, UNPROVIDED)) && (NIL == doneP)) {
                                                SubLObject csome_list_var = generate_regular_string_or_strings(word, pred, mt_info);
                                                SubLObject derived_answer = NIL;
                                                derived_answer = csome_list_var.first();
                                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                                    if (NIL != derived_answer) {
                                                        answers = cons(derived_answer, answers);
                                                        doneP = first_onlyP;
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    derived_answer = csome_list_var.first();
                                                } 
                                            }


                                }
                            }
                        }
                        if ((NIL == doneP) && (NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue(thread))) {
                            SubLObject abbrev_gafs = NIL;
                            final SubLObject pred_var = $$abbreviationForLexicalWord;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, NIL, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, NIL, pred_var);
                                SubLObject done_var = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$47 = NIL;
                                            final SubLObject token_var_$48 = NIL;
                                            while (NIL == done_var_$47) {
                                                final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$48);
                                                final SubLObject valid_$49 = makeBoolean(!token_var_$48.eql(abbrev_gaf));
                                                if (NIL != valid_$49) {
                                                    final SubLObject term_phrases_constraint = assertions_high.gaf_arg2(abbrev_gaf);
                                                    if (term_phrases_constraint.eql(pred) || term_phrases_constraint.eql(lexicon_accessors.pos_of_pred(pred))) {
                                                        abbrev_gafs = cons(abbrev_gaf, abbrev_gafs);
                                                    }
                                                }
                                                done_var_$47 = makeBoolean(NIL == valid_$49);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values4 = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values4);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                } 
                            }
                            abbrev_gafs = Sort.sort(abbrev_gafs, $sym77$PREFER_LEXICAL_ASSERTION_, UNPROVIDED);
                            if (NIL == doneP) {
                                SubLObject csome_list_var3 = abbrev_gafs;
                                SubLObject gaf2 = NIL;
                                gaf2 = csome_list_var3.first();
                                while ((NIL == doneP) && (NIL != csome_list_var3)) {
                                    final SubLObject string_arg = THREE_INTEGER;
                                    final SubLObject string2 = assertions_high.gaf_arg(gaf2, string_arg);
                                    SubLObject v_answer2 = list(string2, pred);
                                    if (NIL != include_supportsP) {
                                        v_answer2 = append(v_answer2, list(gaf2));
                                    }
                                    answers = cons(v_answer2, answers);
                                    if (NIL != first_onlyP) {
                                        doneP = T;
                                    }
                                    csome_list_var3 = csome_list_var3.rest();
                                    gaf2 = csome_list_var3.first();
                                } 
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        return values(answers, doneP);
    }

    public static SubLObject perfect_english_have_aux_for_pred(final SubLObject pred) {
        if (pred.eql($$futurePerfect_Universal)) {
            return $$$will_have;
        }
        if (pred.eql($$pastPerfect_Universal)) {
            return $$$had;
        }
        if ((pred.eql($$firstPersonSg_PresentPerfect) || pred.eql($$secondPersonSg_PresentPerfect)) || pred.eql($$pluralVerb_PresentPerfect)) {
            return $$$have;
        }
        if (pred.eql($$thirdPersonSg_PresentPerfect)) {
            return $$$has;
        }
        return NIL;
    }

    public static SubLObject prefer_lexical_assertionP(final SubLObject as1, final SubLObject as2, SubLObject terseness) {
        if (terseness == UNPROVIDED) {
            terseness = NIL;
        }
        final SubLObject gsa_pred = gen_string_assertion_pred_for_terseness(terseness);
        if (NIL == assertion_handles.assertion_p(as1)) {
            return NIL;
        }
        if (NIL == assertion_handles.assertion_p(as2)) {
            return T;
        }
        if ((NIL != somewhere_cache.some_pred_assertion_somewhereP(gsa_pred, as1, TWO_INTEGER, UNPROVIDED)) && (NIL == somewhere_cache.some_pred_assertion_somewhereP(gsa_pred, as2, TWO_INTEGER, UNPROVIDED))) {
            return T;
        }
        if ((NIL != somewhere_cache.some_pred_assertion_somewhereP(gsa_pred, as2, TWO_INTEGER, UNPROVIDED)) && (NIL == somewhere_cache.some_pred_assertion_somewhereP(gsa_pred, as1, TWO_INTEGER, UNPROVIDED))) {
            return NIL;
        }
        if ((NIL != somewhere_cache.some_pred_assertion_somewhereP($$dispreferredLexification, as1, TWO_INTEGER, UNPROVIDED)) && (NIL == somewhere_cache.some_pred_assertion_somewhereP($$dispreferredLexification, as2, TWO_INTEGER, UNPROVIDED))) {
            return NIL;
        }
        if ((NIL != somewhere_cache.some_pred_assertion_somewhereP($$dispreferredLexification, as2, TWO_INTEGER, UNPROVIDED)) && (NIL == somewhere_cache.some_pred_assertion_somewhereP($$dispreferredLexification, as1, TWO_INTEGER, UNPROVIDED))) {
            return T;
        }
        if ((NIL != terseness) && (NIL != prefer_lexical_assertionP(as1, as2, NIL))) {
            return T;
        }
        if ((NIL != terseness) && (NIL != prefer_lexical_assertionP(as2, as1, NIL))) {
            return NIL;
        }
        return prefer_lexical_assertion_sans_asserted_preferenceP(as1, as2);
    }

    public static SubLObject prefer_lexical_assertion_sans_asserted_preferenceP(final SubLObject as1, final SubLObject as2) {
        if ((NIL != abbreviation_assertion_p(as2)) && (NIL == abbreviation_assertion_p(as1))) {
            return T;
        }
        if ((NIL != abbreviation_assertion_p(as1)) && (NIL == abbreviation_assertion_p(as2))) {
            return NIL;
        }
        if (($MONOTONIC == assertions_high.assertion_strength(as1)) && ($DEFAULT == assertions_high.assertion_strength(as2))) {
            return T;
        }
        if (($MONOTONIC == assertions_high.assertion_strength(as2)) && ($DEFAULT == assertions_high.assertion_strength(as1))) {
            return NIL;
        }
        if (NIL != cardinality_estimates.generality_estimateL(assertions_high.assertion_mt(as1), assertions_high.assertion_mt(as2))) {
            return T;
        }
        if (NIL != cardinality_estimates.generality_estimateG(assertions_high.assertion_mt(as1), assertions_high.assertion_mt(as2))) {
            return NIL;
        }
        if ((NIL != assertions_high.asserted_assertionP(as1)) && (NIL == assertions_high.asserted_assertionP(as2))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject abbreviation_assertion_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) && cycl_utilities.formula_arg0(v_object).eql($$abbreviationForLexicalWord));
    }

    public static SubLObject gen_string_assertion_pred_for_terseness(final SubLObject terseness) {
        if (terseness.eql($TERSE)) {
            return $$genStringAssertion_Terse;
        }
        if (terseness.eql($PRECISE)) {
            return $$genStringAssertion_Precise;
        }
        return $$genStringAssertion;
    }

    public static SubLObject sosowp_sort_answers(final SubLObject answers) {
        return Sort.sort(answers, $sym32$PREFER_POS_PRED_, symbol_function(SECOND));
    }

    public static SubLObject sosowp_immediate_spec_preds_for_word(final SubLObject pred, final SubLObject word) {
        final SubLObject ans;
        final SubLObject all_immediate_spec_preds = ans = kb_mapping_utilities.pred_values_in_any_mt(pred, $$genlPreds, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        return Sort.sort(list_utilities.remove_if_not($sym13$SPEECH_PART_PRED_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym32$PREFER_POS_PRED_, UNPROVIDED);
    }

    public static SubLObject prefer_pos_predP_internal(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
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
            if ((NIL != lexicon_accessors.genl_pos_predP(pred1, $$verbStrings, UNPROVIDED)) && (NIL != lexicon_accessors.genl_pos_predP(pred2, $$verbStrings, UNPROVIDED))) {
                ans = prefer_verbal_pos_predP(pred1, pred2, mt);
            } else
                if ((NIL != lexicon_accessors.derived_predP(pred2, UNPROVIDED)) && (NIL == lexicon_accessors.derived_predP(pred1, UNPROVIDED))) {
                    ans = T;
                } else
                    if ((NIL != lexicon_accessors.genl_pos_predP(pred1, $$simpleNounStrings, UNPROVIDED)) && (NIL == lexicon_accessors.genl_pos_predP(pred2, $$simpleNounStrings, UNPROVIDED))) {
                        ans = T;
                    } else
                        if ((NIL != lexicon_accessors.genl_pos_predP(pred2, $$plural_Generic, UNPROVIDED)) && (NIL == lexicon_accessors.genl_pos_predP(pred1, $$plural_Generic, UNPROVIDED))) {
                            ans = T;
                        } else
                            if ((NIL != lexicon_accessors.genl_pos_predP(pred1, $$singular_Generic, UNPROVIDED)) && (NIL == lexicon_accessors.genl_pos_predP(pred2, $$singular_Generic, UNPROVIDED))) {
                                ans = T;
                            } else
                                if ((NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred2), $$ProperNoun, UNPROVIDED)) && (NIL == lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred1), $$ProperNoun, UNPROVIDED))) {
                                    ans = T;
                                } else
                                    if ((NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred1), $$CountNoun_Generic, UNPROVIDED)) && (NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred2), $$MassNoun_Generic, UNPROVIDED))) {
                                        ans = T;
                                    }






        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject prefer_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return prefer_pos_predP_internal(pred1, pred2, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym32$PREFER_POS_PRED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym32$PREFER_POS_PRED_, THREE_INTEGER, $int$400, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym32$PREFER_POS_PRED_, caching_state);
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(prefer_pos_predP_internal(pred1, pred2, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred1, pred2, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject prefer_verbal_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
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
            final SubLObject pred1_tensedP = lexicon_accessors.genl_pos_predP(pred1, $$tensed, UNPROVIDED);
            final SubLObject pred2_tensedP = lexicon_accessors.genl_pos_predP(pred2, $$tensed, UNPROVIDED);
            ans = (NIL != pred1_tensedP) ? NIL != pred2_tensedP ? prefer_tensed_pos_predP(pred1, pred2, mt) : NIL : NIL != pred2_tensedP ? T : prefer_non_tensed_pos_predP(pred1, pred2, mt);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject prefer_tensed_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
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
            final SubLObject pred1_presentP = lexicon_accessors.genl_pos_predP(pred1, $$presentTense_Generic, UNPROVIDED);
            final SubLObject pred2_presentP = lexicon_accessors.genl_pos_predP(pred2, $$presentTense_Generic, UNPROVIDED);
            if ((NIL != pred1_presentP) && (NIL == pred2_presentP)) {
                ans = T;
            } else
                if ((NIL != pred2_presentP) && (NIL == pred1_presentP)) {
                    ans = NIL;
                } else {
                    final SubLObject pred1_perfectP = lexicon_accessors.genl_pos_predP(pred1, perfect_aspect_pred(), UNPROVIDED);
                    final SubLObject pred2_perfectP = lexicon_accessors.genl_pos_predP(pred2, perfect_aspect_pred(), UNPROVIDED);
                    if ((NIL != pred1_perfectP) && (NIL == pred2_perfectP)) {
                        ans = NIL;
                    } else
                        if ((NIL != pred2_perfectP) && (NIL == pred1_perfectP)) {
                            ans = T;
                        }

                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject prefer_non_tensed_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return NIL;
    }

    public static SubLObject grsos_repeated_argsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $grsos_repeated_argsP$.getDynamicValue(thread);
    }

    public static SubLObject with_grsos_context(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list48);
        args = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CLET, bq_cons(list($sym51$NEW_ARGS_, listS(SET_ADD, args, $list119)), $list120), append(body, list(list(PWHEN, $sym51$NEW_ARGS_, listS(SET_REMOVE, args, $list119))))));
    }

    public static SubLObject generate_regular_string_or_strings(final SubLObject wu, final SubLObject pred, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        SubLObject doneP = NIL;
        SubLObject stop_recursionP = NIL;
        final SubLObject new_argsP = set.set_add(list(wu, pred, mt_info), $grsos_done_args$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = $within_regular_generation_internalsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $grsos_repeated_argsP$.currentBinding(thread);
        try {
            $within_regular_generation_internalsP$.bind(T, thread);
            $grsos_repeated_argsP$.bind(makeBoolean((NIL != $grsos_repeated_argsP$.getDynamicValue(thread)) || (NIL == new_argsP)), thread);
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                final SubLObject _prev_bind_0_$60 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$61 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred), $$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                        final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred(pred);
                        final SubLObject base_string_answers = (NIL != kb_utilities.kbeq(base_form, pred)) ? NIL : string_or_strings_of_wordXpred(wu, base_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = base_string_answers;
                            SubLObject base_answer = NIL;
                            base_answer = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                final SubLObject base_string = regular_generation_answer_string(base_answer);
                                final SubLObject upcased_string = string_utilities.string_proper(base_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                final SubLObject upcased_answer = make_regular_generation_answer(upcased_string, pred, regular_generation_answer_supports(base_answer));
                                answers = cons(upcased_answer, answers);
                                doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                csome_list_var = csome_list_var.rest();
                                base_answer = csome_list_var.first();
                            } 
                        }
                    }
                    if (NIL != derived_modifier_predP(pred)) {
                        final SubLObject result = generate_regular_modifier_string_or_strings(wu, pred, mt_info);
                        if (NIL != result) {
                            answers = append(answers, result);
                            doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                        }
                    } else
                        if (NIL != lexicon_accessors.speech_part_predP(pred, NIL != hlmt.hlmt_p(mt_info) ? mt_info : $$InferencePSC)) {
                            if (NIL != grsos_repeated_argsP()) {
                                stop_recursionP = T;
                            }
                            if (NIL == doneP) {
                                SubLObject csome_list_var2 = morphology.suffix_rules_for_pred(pred);
                                SubLObject rule = NIL;
                                rule = csome_list_var2.first();
                                while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                    final SubLObject base_form2 = assertions_high.gaf_arg2(rule);
                                    final SubLObject suffix = assertions_high.gaf_arg3(rule);
                                    final SubLObject _prev_bind_0_$61 = $sowu_use_morphologyP$.currentBinding(thread);
                                    try {
                                        $sowu_use_morphologyP$.bind(makeBoolean((NIL != $sowu_use_morphologyP$.getDynamicValue(thread)) && (NIL == stop_recursionP)), thread);
                                        if (NIL == doneP) {
                                            SubLObject csome_list_var_$63 = string_or_strings_of_wordXpred(wu, base_form2, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            SubLObject base_answer2 = NIL;
                                            base_answer2 = csome_list_var_$63.first();
                                            while ((NIL == doneP) && (NIL != csome_list_var_$63)) {
                                                final SubLObject base_string2 = regular_generation_answer_string(base_answer2);
                                                final SubLObject base_supports = regular_generation_answer_supports(base_answer2);
                                                final SubLObject derived_string = morphology.add_english_suffix(base_string2, suffix);
                                                final SubLObject supports = (NIL != arguments.support_p(rule)) ? cons(rule, base_supports) : base_supports;
                                                final SubLObject derived_answer = make_regular_generation_answer(derived_string, pred, supports);
                                                answers = cons(derived_answer, answers);
                                                doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                                csome_list_var_$63 = csome_list_var_$63.rest();
                                                base_answer2 = csome_list_var_$63.first();
                                            } 
                                        }
                                    } finally {
                                        $sowu_use_morphologyP$.rebind(_prev_bind_0_$61, thread);
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    rule = csome_list_var2.first();
                                } 
                            }
                        }

                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$61, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$60, thread);
                }
            } else
                if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                    final SubLObject _prev_bind_0_$62 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$62 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                        if (NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred), $$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                            final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred(pred);
                            final SubLObject base_string_answers = (NIL != kb_utilities.kbeq(base_form, pred)) ? NIL : string_or_strings_of_wordXpred(wu, base_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL == doneP) {
                                SubLObject csome_list_var = base_string_answers;
                                SubLObject base_answer = NIL;
                                base_answer = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject base_string = regular_generation_answer_string(base_answer);
                                    final SubLObject upcased_string = string_utilities.string_proper(base_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    final SubLObject upcased_answer = make_regular_generation_answer(upcased_string, pred, regular_generation_answer_supports(base_answer));
                                    answers = cons(upcased_answer, answers);
                                    doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                    csome_list_var = csome_list_var.rest();
                                    base_answer = csome_list_var.first();
                                } 
                            }
                        }
                        if (NIL != derived_modifier_predP(pred)) {
                            final SubLObject result = generate_regular_modifier_string_or_strings(wu, pred, mt_info);
                            if (NIL != result) {
                                answers = append(answers, result);
                                doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                            }
                        } else
                            if (NIL != lexicon_accessors.speech_part_predP(pred, NIL != hlmt.hlmt_p(mt_info) ? mt_info : $$InferencePSC)) {
                                if (NIL != grsos_repeated_argsP()) {
                                    stop_recursionP = T;
                                }
                                if (NIL == doneP) {
                                    SubLObject csome_list_var2 = morphology.suffix_rules_for_pred(pred);
                                    SubLObject rule = NIL;
                                    rule = csome_list_var2.first();
                                    while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                        final SubLObject base_form2 = assertions_high.gaf_arg2(rule);
                                        final SubLObject suffix = assertions_high.gaf_arg3(rule);
                                        final SubLObject _prev_bind_0_$63 = $sowu_use_morphologyP$.currentBinding(thread);
                                        try {
                                            $sowu_use_morphologyP$.bind(makeBoolean((NIL != $sowu_use_morphologyP$.getDynamicValue(thread)) && (NIL == stop_recursionP)), thread);
                                            if (NIL == doneP) {
                                                SubLObject csome_list_var_$64 = string_or_strings_of_wordXpred(wu, base_form2, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                SubLObject base_answer2 = NIL;
                                                base_answer2 = csome_list_var_$64.first();
                                                while ((NIL == doneP) && (NIL != csome_list_var_$64)) {
                                                    final SubLObject base_string2 = regular_generation_answer_string(base_answer2);
                                                    final SubLObject base_supports = regular_generation_answer_supports(base_answer2);
                                                    final SubLObject derived_string = morphology.add_english_suffix(base_string2, suffix);
                                                    final SubLObject supports = (NIL != arguments.support_p(rule)) ? cons(rule, base_supports) : base_supports;
                                                    final SubLObject derived_answer = make_regular_generation_answer(derived_string, pred, supports);
                                                    answers = cons(derived_answer, answers);
                                                    doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                                    csome_list_var_$64 = csome_list_var_$64.rest();
                                                    base_answer2 = csome_list_var_$64.first();
                                                } 
                                            }
                                        } finally {
                                            $sowu_use_morphologyP$.rebind(_prev_bind_0_$63, thread);
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        rule = csome_list_var2.first();
                                    } 
                                }
                            }

                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$62, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$62, thread);
                    }
                } else
                    if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                        final SubLObject _prev_bind_0_$64 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$63 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                            mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                            if (NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred), $$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                                final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred(pred);
                                final SubLObject base_string_answers = (NIL != kb_utilities.kbeq(base_form, pred)) ? NIL : string_or_strings_of_wordXpred(wu, base_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL == doneP) {
                                    SubLObject csome_list_var = base_string_answers;
                                    SubLObject base_answer = NIL;
                                    base_answer = csome_list_var.first();
                                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                                        final SubLObject base_string = regular_generation_answer_string(base_answer);
                                        final SubLObject upcased_string = string_utilities.string_proper(base_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        final SubLObject upcased_answer = make_regular_generation_answer(upcased_string, pred, regular_generation_answer_supports(base_answer));
                                        answers = cons(upcased_answer, answers);
                                        doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                        csome_list_var = csome_list_var.rest();
                                        base_answer = csome_list_var.first();
                                    } 
                                }
                            }
                            if (NIL != derived_modifier_predP(pred)) {
                                final SubLObject result = generate_regular_modifier_string_or_strings(wu, pred, mt_info);
                                if (NIL != result) {
                                    answers = append(answers, result);
                                    doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                }
                            } else
                                if (NIL != lexicon_accessors.speech_part_predP(pred, NIL != hlmt.hlmt_p(mt_info) ? mt_info : $$InferencePSC)) {
                                    if (NIL != grsos_repeated_argsP()) {
                                        stop_recursionP = T;
                                    }
                                    if (NIL == doneP) {
                                        SubLObject csome_list_var2 = morphology.suffix_rules_for_pred(pred);
                                        SubLObject rule = NIL;
                                        rule = csome_list_var2.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                            final SubLObject base_form2 = assertions_high.gaf_arg2(rule);
                                            final SubLObject suffix = assertions_high.gaf_arg3(rule);
                                            final SubLObject _prev_bind_0_$65 = $sowu_use_morphologyP$.currentBinding(thread);
                                            try {
                                                $sowu_use_morphologyP$.bind(makeBoolean((NIL != $sowu_use_morphologyP$.getDynamicValue(thread)) && (NIL == stop_recursionP)), thread);
                                                if (NIL == doneP) {
                                                    SubLObject csome_list_var_$65 = string_or_strings_of_wordXpred(wu, base_form2, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject base_answer2 = NIL;
                                                    base_answer2 = csome_list_var_$65.first();
                                                    while ((NIL == doneP) && (NIL != csome_list_var_$65)) {
                                                        final SubLObject base_string2 = regular_generation_answer_string(base_answer2);
                                                        final SubLObject base_supports = regular_generation_answer_supports(base_answer2);
                                                        final SubLObject derived_string = morphology.add_english_suffix(base_string2, suffix);
                                                        final SubLObject supports = (NIL != arguments.support_p(rule)) ? cons(rule, base_supports) : base_supports;
                                                        final SubLObject derived_answer = make_regular_generation_answer(derived_string, pred, supports);
                                                        answers = cons(derived_answer, answers);
                                                        doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                                        csome_list_var_$65 = csome_list_var_$65.rest();
                                                        base_answer2 = csome_list_var_$65.first();
                                                    } 
                                                }
                                            } finally {
                                                $sowu_use_morphologyP$.rebind(_prev_bind_0_$65, thread);
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            rule = csome_list_var2.first();
                                        } 
                                    }
                                }

                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$63, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$64, thread);
                        }
                    } else {
                        final SubLObject _prev_bind_0_$66 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$64 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind(mt_info, thread);
                            if (NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred), $$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                                final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred(pred);
                                final SubLObject base_string_answers = (NIL != kb_utilities.kbeq(base_form, pred)) ? NIL : string_or_strings_of_wordXpred(wu, base_form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL == doneP) {
                                    SubLObject csome_list_var = base_string_answers;
                                    SubLObject base_answer = NIL;
                                    base_answer = csome_list_var.first();
                                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                                        final SubLObject base_string = regular_generation_answer_string(base_answer);
                                        final SubLObject upcased_string = string_utilities.string_proper(base_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        final SubLObject upcased_answer = make_regular_generation_answer(upcased_string, pred, regular_generation_answer_supports(base_answer));
                                        answers = cons(upcased_answer, answers);
                                        doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                        csome_list_var = csome_list_var.rest();
                                        base_answer = csome_list_var.first();
                                    } 
                                }
                            }
                            if (NIL != derived_modifier_predP(pred)) {
                                final SubLObject result = generate_regular_modifier_string_or_strings(wu, pred, mt_info);
                                if (NIL != result) {
                                    answers = append(answers, result);
                                    doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                }
                            } else
                                if (NIL != lexicon_accessors.speech_part_predP(pred, NIL != hlmt.hlmt_p(mt_info) ? mt_info : $$InferencePSC)) {
                                    if (NIL != grsos_repeated_argsP()) {
                                        stop_recursionP = T;
                                    }
                                    if (NIL == doneP) {
                                        SubLObject csome_list_var2 = morphology.suffix_rules_for_pred(pred);
                                        SubLObject rule = NIL;
                                        rule = csome_list_var2.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                            final SubLObject base_form2 = assertions_high.gaf_arg2(rule);
                                            final SubLObject suffix = assertions_high.gaf_arg3(rule);
                                            final SubLObject _prev_bind_0_$67 = $sowu_use_morphologyP$.currentBinding(thread);
                                            try {
                                                $sowu_use_morphologyP$.bind(makeBoolean((NIL != $sowu_use_morphologyP$.getDynamicValue(thread)) && (NIL == stop_recursionP)), thread);
                                                if (NIL == doneP) {
                                                    SubLObject csome_list_var_$66 = string_or_strings_of_wordXpred(wu, base_form2, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject base_answer2 = NIL;
                                                    base_answer2 = csome_list_var_$66.first();
                                                    while ((NIL == doneP) && (NIL != csome_list_var_$66)) {
                                                        final SubLObject base_string2 = regular_generation_answer_string(base_answer2);
                                                        final SubLObject base_supports = regular_generation_answer_supports(base_answer2);
                                                        final SubLObject derived_string = morphology.add_english_suffix(base_string2, suffix);
                                                        final SubLObject supports = (NIL != arguments.support_p(rule)) ? cons(rule, base_supports) : base_supports;
                                                        final SubLObject derived_answer = make_regular_generation_answer(derived_string, pred, supports);
                                                        answers = cons(derived_answer, answers);
                                                        doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                                                        csome_list_var_$66 = csome_list_var_$66.rest();
                                                        base_answer2 = csome_list_var_$66.first();
                                                    } 
                                                }
                                            } finally {
                                                $sowu_use_morphologyP$.rebind(_prev_bind_0_$67, thread);
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            rule = csome_list_var2.first();
                                        } 
                                    }
                                }

                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$64, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$66, thread);
                        }
                    }


            if (NIL != new_argsP) {
                set.set_remove(list(wu, pred, mt_info), $grsos_done_args$.getDynamicValue(thread));
            }
        } finally {
            $grsos_repeated_argsP$.rebind(_prev_bind_2, thread);
            $within_regular_generation_internalsP$.rebind(_prev_bind_0, thread);
        }
        return extract_regular_generation_answer_type(answers, $sowu_first_onlyP$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_regular_modifier_string_or_strings(final SubLObject wu, final SubLObject pred, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        SubLObject doneP = NIL;
        final SubLObject base_pred = base_pred_for_derived_modifier_pred(pred);
        final SubLObject base_string_answers = string_or_strings_of_wordXpred(wu, base_pred, mt_info, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == doneP) {
            SubLObject csome_list_var = base_string_answers;
            SubLObject base_answer = NIL;
            base_answer = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                final SubLObject base_string = regular_generation_answer_string(base_answer);
                final SubLObject inflected_string = morphology.generate_regular_string_from_form(pred, base_pred, base_string, mt_info);
                final SubLObject inflected_answer = append(list(inflected_string, pred), regular_generation_answer_supports(base_answer));
                answers = cons(inflected_answer, answers);
                doneP = $sowu_first_onlyP$.getDynamicValue(thread);
                csome_list_var = csome_list_var.rest();
                base_answer = csome_list_var.first();
            } 
        }
        return answers;
    }

    public static SubLObject derived_modifier_predP(final SubLObject pred) {
        return makeBoolean((NIL != lexicon_accessors.derived_predP(pred, UNPROVIDED)) && ((NIL != lexicon_accessors.genl_pos_predP(pred, $$adverbStrings, UNPROVIDED)) || (NIL != lexicon_accessors.genl_pos_predP(pred, $$adjStrings, UNPROVIDED))));
    }

    public static SubLObject base_pred_for_derived_modifier_pred(final SubLObject derived_pred) {
        if (NIL != lexicon_accessors.genl_pos_predP(derived_pred, $$adjStrings, UNPROVIDED)) {
            return $$regularDegree;
        }
        if (NIL != lexicon_accessors.genl_pos_predP(derived_pred, $$adverbStrings, UNPROVIDED)) {
            return $$regularAdverb;
        }
        return NIL;
    }

    public static SubLObject modifier_form_blockedP(final SubLObject string, final SubLObject pred) {
        return makeBoolean((NIL != modifier_form_has_noun_denotP(string)) || ((NIL != superlative_formP(pred)) && (NIL != superlative_form_lacks_corresponding_comparativeP(string, pred))));
    }

    public static SubLObject modifier_form_has_noun_denotP(final SubLObject string) {
        return list_utilities.sublisp_boolean(lexicon_accessors.denots_of_stringXspeech_part(string, $$Noun, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject comparative_formP(final SubLObject pred) {
        return makeBoolean((NIL != lexicon_accessors.genl_pos_predP(pred, $$comparativeDegree, UNPROVIDED)) || (NIL != lexicon_accessors.genl_pos_predP(pred, $$comparativeAdverb, UNPROVIDED)));
    }

    public static SubLObject superlative_formP(final SubLObject pred) {
        return makeBoolean((NIL != lexicon_accessors.genl_pos_predP(pred, $$superlativeDegree, UNPROVIDED)) || (NIL != lexicon_accessors.genl_pos_predP(pred, $$superlativeAdverb, UNPROVIDED)));
    }

    public static SubLObject superlative_form_lacks_corresponding_comparativeP(final SubLObject string, final SubLObject pred) {
        SubLObject blockedP = NIL;
        if (NIL != kb_utilities.kbeq(pred, $$superlativeAdverb)) {
            blockedP = sublisp_null(lexicon_accessors.words_of_stringXpred(morphology.add_english_suffix(string_utilities.post_remove(string, $$$est, UNPROVIDED), $$$er), $$comparativeAdverb, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } else
            if (NIL != kb_utilities.kbeq(pred, $$superlativeDegree)) {
                blockedP = sublisp_null(lexicon_accessors.words_of_stringXpred(morphology.add_english_suffix(string_utilities.post_remove(string, $$$est, UNPROVIDED), $$$er), $$comparativeDegree, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }

        return blockedP;
    }

    public static SubLObject initialize_lexicon_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym133$VALID_CONSTANT_, $lexicon_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_lexicon_kb_loaded();
        } else {
            kb_control_vars.unset_lexicon_kb_loaded();
        }
        return kb_control_vars.lexicon_kb_loaded_p();
    }

    public static SubLObject initialize_lexicon_modules() {
        initialize_lexicon();
        sme_lexification_wizard_accessors.init_sme_lexwiz();
        return T;
    }

    public static SubLObject initialize_lexicon() {
        lexicon_accessors.clear_cached_lexical_access_functions();
        initialize_lexicon_lookup_mt();
        lexicon_vars.initialize_multi_word_preds();
        lexicon_vars.initialize_all_speech_part_preds();
        return NIL;
    }

    public static SubLObject initialize_lexicon_lookup_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_loaded()) {
            lexicon_vars.$lexicon_lookup_mt$.setDynamicValue(NIL, thread);
            if (NIL == lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread)) {
                SubLObject csome_list_var = $list135;
                SubLObject mt_name = NIL;
                mt_name = csome_list_var.first();
                while ((NIL == lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                    final SubLObject mt = constants_high.find_constant(mt_name);
                    if (NIL != valid_constantP(mt, UNPROVIDED)) {
                        final SubLObject anytime = hlmt_czer.canonicalize_hlmt(hlmt.new_hlmt(list(mt, $$AnytimePSC)));
                        lexicon_vars.$lexicon_lookup_mt$.setDynamicValue(NIL != hlmt.valid_hlmt_p(anytime, UNPROVIDED) ? anytime : mt, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    mt_name = csome_list_var.first();
                } 
            }
        }
        return lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread);
    }

    public static SubLObject initialize_lexicon_from_kb() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        lexicon_vars.initialize_all_speech_part_preds();
        final SubLObject nl_trie_rebuild_flag = makeBoolean(((NIL != nl_trie.empty_nl_trieP(UNPROVIDED)) || (NIL != nl_trie_staleness_test.nl_trie_known_stale_p())) || (NIL != nl_trie_staleness_test.nl_trie_revisions_staleP()));
        if (NIL != nl_trie_rebuild_flag) {
            nl_trie.initialize_nl_trie(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            format(T, $str136$Merely_validating_NL_trie_as_it_a);
            nl_trie.nl_trie_validate_all_entries();
        }
        if ((NIL != $allow_nl_trie_rotation_initializationP$.getDynamicValue(thread)) && ((NIL != nl_trie_rebuild_flag) || (NIL == nl_trie_accessors.nl_trie_rotation_index_initializedP()))) {
            nl_trie_accessors.force_nl_trie_rotation_index_initialization(UNPROVIDED);
        } else {
            format(T, $str137$Skipping_initialization_of_NL_tri, NIL != $allow_nl_trie_rotation_initializationP$.getDynamicValue(thread) ? $$$needed : $$$allowed);
        }
        note_lexicon_initialized();
        return NIL;
    }

    public static SubLObject lexicon_cache_filename(final SubLObject directory_path) {
        return file_utilities.relative_filename(directory_path, $str140$lexicon_cache, $$$cfasl);
    }

    public static SubLObject rebuild_lexicon_cache() {
        nl_trie.initialize_nl_trie(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        note_lexicon_initialized();
        return NIL;
    }

    public static SubLObject lexicon_cache_builtP() {
        return makeBoolean((((((NIL != lexicon_vars.$nl_trie_code_revision$.getGlobalValue()) && (NIL != lexicon_vars.$morphology_code_revision$.getGlobalValue())) && (NIL != lexicon_vars.$lexicon_cache_code_revision$.getGlobalValue())) && (NIL != nl_trie.get_nl_trie())) && (NIL == nl_trie.empty_nl_trieP(nl_trie.get_nl_trie()))) && (NIL != nl_trie_completion.$nl_trie_completion_index$.getGlobalValue()));
    }

    public static SubLObject dump_lexicon_cache(final SubLObject directory_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cfasl_file = lexicon_cache_filename(directory_path);
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            final SubLObject data_file = get_nl_trie_contents_data_file(directory_path);
            final SubLObject index_file = get_nl_trie_contents_index_file(directory_path);
            SubLObject fvector = NIL;
            try {
                fvector = file_vector.new_file_vector(data_file, index_file, $OUTPUT, file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), UNPROVIDED);
                dumper.kb_dump_stamp_file_vector_for_references(fvector);
                final SubLObject str = $str143$Dumping_lexicon_cache___;
                final SubLObject _prev_bind_0_$76 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$77 = $progress_last_pacification_time$.currentBinding(thread);
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
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_binary(cfasl_file, $OUTPUT);
                        if (!stream.isStream()) {
                            Errors.error($str144$Unable_to_open__S, cfasl_file);
                        }
                        final SubLObject stream_$78 = stream;
                        nl_trie_staleness_test.dump_nl_trie_revisions(stream_$78);
                        nl_trie.dump_swappable_nl_trie_to_lexicon_cache(stream_$78, fvector);
                        nl_trie.dump_nl_trie_completion_index(stream_$78);
                    } finally {
                        final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                        }
                    }
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$77, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$76, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$78 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (NIL != file_vector.file_vector_p(fvector)) {
                        file_vector.close_file_vector(fvector);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$78, thread);
                }
            }
            dumper.discard_dump_filename(index_file);
            dumper.discard_dump_filename(data_file);
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject load_lexicon_cache(SubLObject directory_path) {
        if (directory_path == UNPROVIDED) {
            directory_path = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == directory_path) {
            directory_path = dumper.kb_dump_directory(UNPROVIDED, UNPROVIDED);
        }
        final SubLObject cfasl_file = lexicon_cache_filename(directory_path);
        if (NIL == Filesys.probe_file(cfasl_file)) {
            Errors.warn($str145$CFASL_file__s_not_found, cfasl_file);
        } else {
            final SubLObject str = $str146$Loading_lexicon_cache___;
            final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$81 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
                final SubLObject _prev_bind_1_$82 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
                try {
                    StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
                    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_binary(cfasl_file, $INPUT);
                        if (!stream.isStream()) {
                            Errors.error($str144$Unable_to_open__S, cfasl_file);
                        }
                        final SubLObject stream_$83 = stream;
                        nl_trie_staleness_test.load_nl_trie_revisions(stream_$83);
                        final SubLObject _prev_bind_0_$82 = $cfasl_input_to_static_area$.currentBinding(thread);
                        try {
                            $cfasl_input_to_static_area$.bind(load_nl_trie_into_static_areaP(), thread);
                            nl_trie.load_nl_trie_from_lexicon_cache(stream_$83);
                            final SubLObject data_file = get_nl_trie_contents_data_file(directory_path);
                            final SubLObject index_file = get_nl_trie_contents_index_file(directory_path);
                            if ((NIL != file_utilities.file_existsP(data_file)) && (NIL != file_utilities.file_existsP(index_file))) {
                                nl_trie.reconnect_nl_trie_to_file_vector_files(data_file, index_file, UNPROVIDED);
                            }
                            dumper.discard_dump_filename(index_file);
                            dumper.discard_dump_filename(data_file);
                            nl_trie.load_nl_trie_completion_index(stream_$83);
                        } finally {
                            $cfasl_input_to_static_area$.rebind(_prev_bind_0_$82, thread);
                        }
                        if (NIL != $allow_nl_trie_rotation_initializationP$.getDynamicValue(thread)) {
                            nl_trie_accessors.initialize_nl_trie_rotation_index(UNPROVIDED);
                        }
                        note_lexicon_initialized();
                    } finally {
                        final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                        }
                    }
                } finally {
                    StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_1_$82, thread);
                    StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0_$81, thread);
                }
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                $progress_start_time$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject get_nl_trie_contents_data_file(SubLObject directory_path) {
        if (directory_path == UNPROVIDED) {
            directory_path = NIL;
        }
        return dumper.kb_dump_file($str148$nl_trie_contents, directory_path, UNPROVIDED);
    }

    public static SubLObject get_nl_trie_contents_index_file(SubLObject directory_path) {
        if (directory_path == UNPROVIDED) {
            directory_path = NIL;
        }
        return dumper.kb_dump_file($str149$nl_trie_contents_index, directory_path, UNPROVIDED);
    }

    public static SubLObject redump_lexicon_cache(SubLObject directory_path) {
        if (directory_path == UNPROVIDED) {
            directory_path = NIL;
        }
        if (NIL == directory_path) {
            directory_path = dumper.kb_dump_directory(UNPROVIDED, UNPROVIDED);
        }
        return dump_lexicon_cache(directory_path);
    }

    public static SubLObject must_use_static_memory_for_nl_trie() {
        $must_use_static_memory_for_nl_trieP$.setGlobalValue(T);
        return list_utilities.sublisp_boolean($must_use_static_memory_for_nl_trieP$.getGlobalValue());
    }

    public static SubLObject may_use_dynamic_memory_for_nl_trie() {
        $must_use_static_memory_for_nl_trieP$.setGlobalValue(NIL);
        return list_utilities.sublisp_boolean($must_use_static_memory_for_nl_trieP$.getGlobalValue());
    }

    public static SubLObject load_nl_trie_into_static_areaP() {
        if (NIL == $must_use_static_memory_for_nl_trieP$.getGlobalValue()) {
            return T;
        }
        return T;
    }

    public static SubLObject declare_lexicon_cache_file() {
        declareFunction(me, "perfect_aspect_pred", "PERFECT-ASPECT-PRED", 0, 0, false);
        declareFunction(me, "words_of_string", "WORDS-OF-STRING", 1, 3, false);
        declareFunction(me, "strings_of_word_unit", "STRINGS-OF-WORD-UNIT", 1, 3, false);
        declareFunction(me, "first_string_of_word_unit", "FIRST-STRING-OF-WORD-UNIT", 1, 3, false);
        declareFunction(me, "strings_of_wordXpred", "STRINGS-OF-WORD&PRED", 2, 1, false);
        declareFunction(me, "inference_strings_of_wordXpred", "INFERENCE-STRINGS-OF-WORD&PRED", 2, 0, false);
        declareFunction(me, "first_string_of_wordXpred", "FIRST-STRING-OF-WORD&PRED", 2, 1, false);
        declareFunction(me, "ok_to_derive_word_form_from_predP", "OK-TO-DERIVE-WORD-FORM-FROM-PRED?", 3, 1, false);
        declareFunction(me, "ok_to_derive_word_form_for_predP", "OK-TO-DERIVE-WORD-FORM-FOR-PRED?", 4, 0, false);
        declareFunction(me, "word_form_assertedP", "WORD-FORM-ASSERTED?", 3, 0, false);
        declareFunction(me, "generate_regular_string", "GENERATE-REGULAR-STRING", 2, 1, false);
        declareFunction(me, "generate_regular_strings", "GENERATE-REGULAR-STRINGS", 2, 1, false);
        declareFunction(me, "strings_of_word_unit_with_supports", "STRINGS-OF-WORD-UNIT-WITH-SUPPORTS", 2, 0, false);
        declareFunction(me, "ordered_strings_of_word_unit", "ORDERED-STRINGS-OF-WORD-UNIT", 1, 3, false);
        declareFunction(me, "string_or_strings_of_word_unit", "STRING-OR-STRINGS-OF-WORD-UNIT", 3, 2, false);
        declareFunction(me, "sosowp_filter_exceptions", "SOSOWP-FILTER-EXCEPTIONS", 2, 0, false);
        declareFunction(me, "clear_sosowp_do_filter_exceptions", "CLEAR-SOSOWP-DO-FILTER-EXCEPTIONS", 0, 0, false);
        declareFunction(me, "remove_sosowp_do_filter_exceptions", "REMOVE-SOSOWP-DO-FILTER-EXCEPTIONS", 2, 0, false);
        declareFunction(me, "sosowp_do_filter_exceptions_internal", "SOSOWP-DO-FILTER-EXCEPTIONS-INTERNAL", 2, 0, false);
        declareFunction(me, "sosowp_do_filter_exceptions", "SOSOWP-DO-FILTER-EXCEPTIONS", 2, 0, false);
        declareFunction(me, "sosowp_remove_spec_preds", "SOSOWP-REMOVE-SPEC-PREDS", 1, 1, false);
        declareFunction(me, "sosowp_repeated_argsP", "SOSOWP-REPEATED-ARGS?", 0, 0, false);
        declareFunction(me, "sosowp_top_levelP", "SOSOWP-TOP-LEVEL?", 0, 0, false);
        declareFunction(me, "higher_asserted_entry_for_wuP", "HIGHER-ASSERTED-ENTRY-FOR-WU?", 2, 1, false);
        declareFunction(me, "all_genl_lexicon_preds_internal", "ALL-GENL-LEXICON-PREDS-INTERNAL", 1, 1, false);
        declareFunction(me, "all_genl_lexicon_preds", "ALL-GENL-LEXICON-PREDS", 1, 1, false);
        declareMacro(me, "with_sosowp_context", "WITH-SOSOWP-CONTEXT");
        declareFunction(me, "string_or_strings_of_wordXpred_internal", "STRING-OR-STRINGS-OF-WORD&PRED-INTERNAL", 2, 5, false);
        declareFunction(me, "string_or_strings_of_wordXpred", "STRING-OR-STRINGS-OF-WORD&PRED", 2, 5, false);
        declareFunction(me, "make_regular_generation_answer", "MAKE-REGULAR-GENERATION-ANSWER", 1, 2, false);
        declareFunction(me, "regular_generation_answer_string", "REGULAR-GENERATION-ANSWER-STRING", 1, 0, false);
        declareFunction(me, "regular_generation_answer_pred", "REGULAR-GENERATION-ANSWER-PRED", 1, 0, false);
        declareFunction(me, "regular_generation_answer_supports", "REGULAR-GENERATION-ANSWER-SUPPORTS", 1, 0, false);
        declareFunction(me, "regular_generation_answer_string_plus_supports", "REGULAR-GENERATION-ANSWER-STRING-PLUS-SUPPORTS", 1, 0, false);
        new lexicon_cache.$regular_generation_answer_string_plus_supports$UnaryFunction();
        declareFunction(me, "extract_regular_generation_answer_type", "EXTRACT-REGULAR-GENERATION-ANSWER-TYPE", 1, 4, false);
        declareFunction(me, "sosowp_int", "SOSOWP-INT", 7, 0, false);
        declareFunction(me, "sosowp_int_answer_to_utf8", "SOSOWP-INT-ANSWER-TO-UTF8", 1, 0, false);
        declareFunction(me, "sosowp_int_via_inference", "SOSOWP-INT-VIA-INFERENCE", 5, 0, false);
        declareFunction(me, "sosowp_int_via_index_surfing", "SOSOWP-INT-VIA-INDEX-SURFING", 7, 0, false);
        declareFunction(me, "sosowp_remove_duplicate_strings", "SOSOWP-REMOVE-DUPLICATE-STRINGS", 2, 0, false);
        declareFunction(me, "sosowp_int_spec_preds_internal", "SOSOWP-INT-SPEC-PREDS-INTERNAL", 7, 0, false);
        declareFunction(me, "sosowp_int_spec_preds", "SOSOWP-INT-SPEC-PREDS", 7, 0, false);
        declareFunction(me, "sosowp_int_this_pred", "SOSOWP-INT-THIS-PRED", 6, 0, false);
        declareFunction(me, "perfect_english_have_aux_for_pred", "PERFECT-ENGLISH-HAVE-AUX-FOR-PRED", 1, 0, false);
        declareFunction(me, "prefer_lexical_assertionP", "PREFER-LEXICAL-ASSERTION?", 2, 1, false);
        declareFunction(me, "prefer_lexical_assertion_sans_asserted_preferenceP", "PREFER-LEXICAL-ASSERTION-SANS-ASSERTED-PREFERENCE?", 2, 0, false);
        declareFunction(me, "abbreviation_assertion_p", "ABBREVIATION-ASSERTION-P", 1, 0, false);
        declareFunction(me, "gen_string_assertion_pred_for_terseness", "GEN-STRING-ASSERTION-PRED-FOR-TERSENESS", 1, 0, false);
        declareFunction(me, "sosowp_sort_answers", "SOSOWP-SORT-ANSWERS", 1, 0, false);
        declareFunction(me, "sosowp_immediate_spec_preds_for_word", "SOSOWP-IMMEDIATE-SPEC-PREDS-FOR-WORD", 2, 0, false);
        declareFunction(me, "prefer_pos_predP_internal", "PREFER-POS-PRED?-INTERNAL", 2, 1, false);
        declareFunction(me, "prefer_pos_predP", "PREFER-POS-PRED?", 2, 1, false);
        new lexicon_cache.$prefer_pos_predP$BinaryFunction();
        declareFunction(me, "prefer_verbal_pos_predP", "PREFER-VERBAL-POS-PRED?", 2, 1, false);
        declareFunction(me, "prefer_tensed_pos_predP", "PREFER-TENSED-POS-PRED?", 2, 1, false);
        declareFunction(me, "prefer_non_tensed_pos_predP", "PREFER-NON-TENSED-POS-PRED?", 2, 1, false);
        declareFunction(me, "grsos_repeated_argsP", "GRSOS-REPEATED-ARGS?", 0, 0, false);
        declareMacro(me, "with_grsos_context", "WITH-GRSOS-CONTEXT");
        declareFunction(me, "generate_regular_string_or_strings", "GENERATE-REGULAR-STRING-OR-STRINGS", 2, 1, false);
        declareFunction(me, "generate_regular_modifier_string_or_strings", "GENERATE-REGULAR-MODIFIER-STRING-OR-STRINGS", 3, 0, false);
        declareFunction(me, "derived_modifier_predP", "DERIVED-MODIFIER-PRED?", 1, 0, false);
        declareFunction(me, "base_pred_for_derived_modifier_pred", "BASE-PRED-FOR-DERIVED-MODIFIER-PRED", 1, 0, false);
        declareFunction(me, "modifier_form_blockedP", "MODIFIER-FORM-BLOCKED?", 2, 0, false);
        declareFunction(me, "modifier_form_has_noun_denotP", "MODIFIER-FORM-HAS-NOUN-DENOT?", 1, 0, false);
        declareFunction(me, "comparative_formP", "COMPARATIVE-FORM?", 1, 0, false);
        declareFunction(me, "superlative_formP", "SUPERLATIVE-FORM?", 1, 0, false);
        declareFunction(me, "superlative_form_lacks_corresponding_comparativeP", "SUPERLATIVE-FORM-LACKS-CORRESPONDING-COMPARATIVE?", 2, 0, false);
        declareFunction(me, "initialize_lexicon_kb_feature", "INITIALIZE-LEXICON-KB-FEATURE", 0, 0, false);
        declareFunction(me, "initialize_lexicon_modules", "INITIALIZE-LEXICON-MODULES", 0, 0, false);
        declareFunction(me, "initialize_lexicon", "INITIALIZE-LEXICON", 0, 0, false);
        declareFunction(me, "initialize_lexicon_lookup_mt", "INITIALIZE-LEXICON-LOOKUP-MT", 0, 0, false);
        declareFunction(me, "initialize_lexicon_from_kb", "INITIALIZE-LEXICON-FROM-KB", 0, 0, false);
        declareFunction(me, "lexicon_cache_filename", "LEXICON-CACHE-FILENAME", 1, 0, false);
        declareFunction(me, "rebuild_lexicon_cache", "REBUILD-LEXICON-CACHE", 0, 0, false);
        declareFunction(me, "lexicon_cache_builtP", "LEXICON-CACHE-BUILT?", 0, 0, false);
        declareFunction(me, "dump_lexicon_cache", "DUMP-LEXICON-CACHE", 1, 0, false);
        declareFunction(me, "load_lexicon_cache", "LOAD-LEXICON-CACHE", 0, 1, false);
        declareFunction(me, "get_nl_trie_contents_data_file", "GET-NL-TRIE-CONTENTS-DATA-FILE", 0, 1, false);
        declareFunction(me, "get_nl_trie_contents_index_file", "GET-NL-TRIE-CONTENTS-INDEX-FILE", 0, 1, false);
        declareFunction(me, "redump_lexicon_cache", "REDUMP-LEXICON-CACHE", 0, 1, false);
        declareFunction(me, "must_use_static_memory_for_nl_trie", "MUST-USE-STATIC-MEMORY-FOR-NL-TRIE", 0, 0, false);
        declareFunction(me, "may_use_dynamic_memory_for_nl_trie", "MAY-USE-DYNAMIC-MEMORY-FOR-NL-TRIE", 0, 0, false);
        declareFunction(me, "load_nl_trie_into_static_areaP", "LOAD-NL-TRIE-INTO-STATIC-AREA?", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_lexicon_cache_file() {
        deflexical("*PERFECT-ASPECT-PRED*", NIL);
        deflexical("*SOWU-EQ-TEST*", symbol_function(EQUAL));
        defparameter("*SOWU-FIRST-ONLY?*", NIL);
        defparameter("*SOWU-USE-MORPHOLOGY?*", T);
        defparameter("*SOWU-INCLUDE-SUPPORTS?*", NIL);
        defparameter("*SOWU-RESPECT-ORDER?*", T);
        defparameter("*WITHIN-REGULAR-GENERATION-INTERNALS?*", NIL);
        deflexical("*SOSOWP-DO-FILTER-EXCEPTIONS-CACHING-STATE*", NIL);
        defparameter("*SOSOWP-DONE-ARGS*", set.new_set(EQUAL, UNPROVIDED));
        defparameter("*SOSOWP-REPEATED-ARGS?*", NIL);
        defparameter("*GRSOS-DONE-ARGS*", set.new_set(EQUAL, UNPROVIDED));
        defparameter("*GRSOS-REPEATED-ARGS?*", NIL);
        deflexical("*LEXICON-CORE-CONSTANTS*", $list132);
        defparameter("*ALLOW-NL-TRIE-ROTATION-INITIALIZATION?*", NIL);
        deflexical("*MUST-USE-STATIC-MEMORY-FOR-NL-TRIE?*", SubLTrampolineFile.maybeDefault($sym150$_MUST_USE_STATIC_MEMORY_FOR_NL_TRIE__, $must_use_static_memory_for_nl_trieP$, NIL));
        return NIL;
    }

    public static SubLObject setup_lexicon_cache_file() {
        lexicon_vars.$lexicon_cache_code_revision$.setGlobalValue($str0$_Revision__146268__);
        lexicon_vars.declare_noop_updates_for_lexicon_global($lexicon_cache_code_revision$, $list2);
        register_cyc_api_function(WORDS_OF_STRING, $list7, $str8$_return_LISTP__of_word_units_asso, $list9, $list10);
        memoization_state.note_globally_cached_function(SOSOWP_DO_FILTER_EXCEPTIONS);
        memoization_state.note_memoized_function(ALL_GENL_LEXICON_PREDS);
        memoization_state.note_memoized_function($sym58$STRING_OR_STRINGS_OF_WORD_PRED);
        memoization_state.note_memoized_function(SOSOWP_INT_SPEC_PREDS);
        memoization_state.note_memoized_function($sym32$PREFER_POS_PRED_);
        declare_defglobal($sym150$_MUST_USE_STATIC_MEMORY_FOR_NL_TRIE__);
        register_cyc_api_function(MUST_USE_STATIC_MEMORY_FOR_NL_TRIE, NIL, $str152$Instruct_the_loader_to_use_static, NIL, $list153);
        register_cyc_api_function(MAY_USE_DYNAMIC_MEMORY_FOR_NL_TRIE, NIL, $str155$Instruct_the_loader_to_leave_it_u, NIL, $list153);
        define_test_case_table_int($sym32$PREFER_POS_PRED_, list(new SubLObject[]{ $TEST, symbol_function(EQL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list162);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lexicon_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_lexicon_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexicon_cache_file();
    }

    

    public static final class $regular_generation_answer_string_plus_supports$UnaryFunction extends UnaryFunction {
        public $regular_generation_answer_string_plus_supports$UnaryFunction() {
            super(extractFunctionNamed("REGULAR-GENERATION-ANSWER-STRING-PLUS-SUPPORTS"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return regular_generation_answer_string_plus_supports(arg1);
        }
    }

    public static final class $prefer_pos_predP$BinaryFunction extends BinaryFunction {
        public $prefer_pos_predP$BinaryFunction() {
            super(extractFunctionNamed("PREFER-POS-PRED?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return prefer_pos_predP(arg1, arg2, lexicon_cache.$prefer_pos_predP$BinaryFunction.UNPROVIDED);
        }
    }
}

/**
 * Total time: 2118 ms
 */
