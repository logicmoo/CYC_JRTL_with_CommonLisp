package com.cyc.cycjava.cycl.wordnet_import;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_E;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_I;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_O;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_U;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.lexification_utilities;
import com.cyc.cycjava.cycl.lexification_wizard;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class wordnet_import extends SubLTranslatedFile {
    public static final SubLFile me = new wordnet_import();

    public static final String myName = "com.cyc.cycjava.cycl.wordnet_import";

    public static final String myFingerPrint = "8d907c3f50ddc87d6066cc092bc4fd0bb1dc1ed33d74303d4aa696023482c40c";

    // deflexical
    private static final SubLSymbol $wordnet_import_core_constants$ = makeSymbol("*WORDNET-IMPORT-CORE-CONSTANTS*");

    // defconstant
    // Definitions
    // Names for speech parts
    public static final SubLSymbol $wni_pos_map$ = makeSymbol("*WNI-POS-MAP*");

    // defconstant
    // WordNet abbreviations for speech parts
    public static final SubLSymbol $wni_1_char_pos_map$ = makeSymbol("*WNI-1-CHAR-POS-MAP*");



    // deflexical
    private static final SubLSymbol $wni_synsets_for_english_word_stringXpos_caching_state$ = makeSymbol("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*");



    // deflexical
    private static final SubLSymbol $wni_synset_collectionP_caching_state$ = makeSymbol("*WNI-SYNSET-COLLECTION?-CACHING-STATE*");





    // defconstant
    /**
     * An assocation list of each frequent verb frame and its relative generality
     * with respect to naming a new term.
     */
    private static final SubLSymbol $wni_verb_frame_generalities$ = makeSymbol("*WNI-VERB-FRAME-GENERALITIES*");

    // defconstant
    // A generality score for all of the less frequent verb frames.
    private static final SubLSymbol $wni_least_general_frame_generality_score$ = makeSymbol("*WNI-LEAST-GENERAL-FRAME-GENERALITY-SCORE*");























    // deflexical
    private static final SubLSymbol $wni_synset_wXo_links_helper_caching_state$ = makeSymbol("*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*");







    // defparameter
    public static final SubLSymbol $wni_problem_store$ = makeSymbol("*WNI-PROBLEM-STORE*");

    // deflexical
    private static final SubLSymbol $wni_term_has_verb_semtrans_helperP_caching_state$ = makeSymbol("*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*");

    // defconstant
    // the maximum number of terms to gather for matching
    private static final SubLSymbol $wni_maximum_nbr_of_terms_to_gather_for_matching$ = makeSymbol("*WNI-MAXIMUM-NBR-OF-TERMS-TO-GATHER-FOR-MATCHING*");

    // defparameter
    // When T, indicates that exact term match diagnostics should be displayed.
    public static final SubLSymbol $wni_very_verbose_exact_synset_term_matches$ = makeSymbol("*WNI-VERY-VERBOSE-EXACT-SYNSET-TERM-MATCHES*");

    // defparameter
    // When T, indicates that exact term matches should be displayed.
    public static final SubLSymbol $wni_verbose_exact_synset_term_matches$ = makeSymbol("*WNI-VERBOSE-EXACT-SYNSET-TERM-MATCHES*");

    // defconstant
    // the WordNet synset for person, individual
    public static final SubLSymbol $person_synset$ = makeSymbol("*PERSON-SYNSET*");

    // defconstant
    // the WordNet synset for organism, being
    public static final SubLSymbol $organism_being_synset$ = makeSymbol("*ORGANISM-BEING-SYNSET*");

    // defconstant
    // the WordNet synset for chemical compound
    public static final SubLSymbol $chemical_compound_synset$ = makeSymbol("*CHEMICAL-COMPOUND-SYNSET*");

    // defconstant
    // the WordNet synset for country, state, land
    public static final SubLSymbol $country_synset$ = makeSymbol("*COUNTRY-SYNSET*");

    // defconstant
    // the WordNet synset for urban area, populated area
    public static final SubLSymbol $urban_area_synset$ = makeSymbol("*URBAN-AREA-SYNSET*");

    // defconstant
    /**
     * the WordNet synset for geographical area, geographic area, geographical
     * region, geographic region
     */
    public static final SubLSymbol $geographical_area_synset$ = makeSymbol("*GEOGRAPHICAL-AREA-SYNSET*");

    // defconstant
    public static final SubLSymbol $dtp_wni_role_info$ = makeSymbol("*DTP-WNI-ROLE-INFO*");

    // deflexical
    // the wordnet import knowledge source access path
    private static final SubLSymbol $wordnet_import_access_path$ = makeSymbol("*WORDNET-IMPORT-ACCESS-PATH*");

    // Internal Constants
    public static final SubLList $list0 = list(new SubLObject[]{ reader_make_constant_shell(makeString("Noun")), reader_make_constant_shell(makeString("Verb")), reader_make_constant_shell(makeString("Adjective")), reader_make_constant_shell(makeString("wnSynsetMemberWord")), reader_make_constant_shell(makeString("WordNetEnglishWordFn")), reader_make_constant_shell(makeString("WordNetWorkflowCollectorMt")), reader_make_constant_shell(makeString("WordNet2_0-KS")), reader_make_constant_shell(makeString("WordNetSynsetImportStatus-DeterminedIndividual")), reader_make_constant_shell(makeString("Adverb")), reader_make_constant_shell(makeString("WordNetSynsetFn")), reader_make_constant_shell(makeString("WordNetWorkflowDataStatusMt")), reader_make_constant_shell(makeString("Situation")), reader_make_constant_shell(makeString("Relation")), reader_make_constant_shell(makeString("WordNetSynsetImportStatus-Skip")), reader_make_constant_shell(makeString("thereExists")), reader_make_constant_shell(makeString("wnSynsetWord")), reader_make_constant_shell(makeString("WordNetWordSenseFn")), reader_make_constant_shell(makeString("wnSynsetExamplePhraseWithPosition")), reader_make_constant_shell(makeString("WNVerbFrame-8")), reader_make_constant_shell(makeString("WNVerbFrame-1")), reader_make_constant_shell(makeString("WNVerbFrame-9")), reader_make_constant_shell(makeString("WNVerbFrame-11")), reader_make_constant_shell(makeString("WNVerbFrame-22")), reader_make_constant_shell(makeString("WNVerbFrame-4")), reader_make_constant_shell(makeString("WNVerbFrame-2")), reader_make_constant_shell(makeString("wnSynsetVerbFrame")), reader_make_constant_shell(makeString("wnHypernym")), reader_make_constant_shell(makeString("wnSynsetGloss")), reader_make_constant_shell(makeString("wnSynsetSpeechPart")), reader_make_constant_shell(makeString("WordNetSynsetReifiedFn")), reader_make_constant_shell(makeString("wnWorkflowSynsetLock")) });

    private static final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLList $list2 = list(cons(reader_make_constant_shell(makeString("Noun")), makeString("Noun")), cons(reader_make_constant_shell(makeString("Verb")), makeString("Verb")), cons(reader_make_constant_shell(makeString("Adjective")), makeString("Adjective")), cons(reader_make_constant_shell(makeString("Adverb")), makeString("Adverb")));

    private static final SubLList $list3 = list(cons(reader_make_constant_shell(makeString("Noun")), makeString("N")), cons(reader_make_constant_shell(makeString("Verb")), makeString("V")), cons(reader_make_constant_shell(makeString("Adjective")), makeString("A")), cons(reader_make_constant_shell(makeString("Adverb")), makeString("R")));

    private static final SubLSymbol WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING = makeSymbol("WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING");



    private static final SubLObject $$wnSynsetMemberWord = reader_make_constant_shell(makeString("wnSynsetMemberWord"));

    private static final SubLSymbol $sym7$_SYNSET = makeSymbol("?SYNSET");

    private static final SubLObject $$WordNetEnglishWordFn = reader_make_constant_shell(makeString("WordNetEnglishWordFn"));

    private static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    private static final SubLObject $$WordNetWorkflowCollectorMt = reader_make_constant_shell(makeString("WordNetWorkflowCollectorMt"));





    private static final SubLSymbol $wni_unranked_synsets_for_english_word_string_caching_state$ = makeSymbol("*WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*");

    private static final SubLSymbol $sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS = makeSymbol("WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS");

    private static final SubLString $str15$select_synset_id_from_WordSense_w = makeString("select synset_id from WordSense where word = '");

    private static final SubLString $str16$__and_pos____ = makeString("' and pos = '");

    private static final SubLString $str17$__order_by_word_sense = makeString("' order by word_sense");











    private static final SubLObject $$WordNetSynsetFn = reader_make_constant_shell(makeString("WordNetSynsetFn"));

    private static final SubLSymbol $sym24$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS_CACHING_STATE_ = makeSymbol("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSETS_FOR_ENGLISH_WORD_STRING = makeSymbol("WNI-SYNSETS-FOR-ENGLISH-WORD-STRING");

    private static final SubLObject $const26$WordNet2_0_KS = reader_make_constant_shell(makeString("WordNet2_0-KS"));

    private static final SubLString $str27$__order_by_pos__word_sense = makeString("' order by pos, word_sense");

    private static final SubLSymbol $wni_synsets_for_english_word_string_caching_state$ = makeSymbol("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*");

    private static final SubLSymbol $sym29$WNI_SYNSET_COLLECTION_ = makeSymbol("WNI-SYNSET-COLLECTION?");

    private static final SubLObject $const30$WordNetSynsetImportStatus_Determi = reader_make_constant_shell(makeString("WordNetSynsetImportStatus-DeterminedIndividual"));

    private static final SubLObject $$WordNetWorkflowDataStatusMt = reader_make_constant_shell(makeString("WordNetWorkflowDataStatusMt"));

    private static final SubLSymbol $sym32$_WNI_SYNSET_COLLECTION__CACHING_STATE_ = makeSymbol("*WNI-SYNSET-COLLECTION?-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSET_INDIVIDUALS = makeSymbol("WNI-SYNSET-INDIVIDUALS");

    private static final SubLSymbol WNI_UNREIFIED_SYNSET = makeSymbol("WNI-UNREIFIED-SYNSET");

    private static final SubLSymbol WNI_EXCLUDE_SITUATIONS = makeSymbol("WNI-EXCLUDE-SITUATIONS");

    private static final SubLString $str36$excluding_specs_of___Situation = makeString("excluding specs of #$Situation");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLObject $$Situation = reader_make_constant_shell(makeString("Situation"));

    private static final SubLSymbol WNI_EXCLUDE_RELATIONS = makeSymbol("WNI-EXCLUDE-RELATIONS");

    private static final SubLString $str40$excluding_specs_of___Relation = makeString("excluding specs of #$Relation");

    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

    private static final SubLSymbol WNI_EXCLUDE_SKIPPED = makeSymbol("WNI-EXCLUDE-SKIPPED");

    private static final SubLString $$$excluding_skipped_synsets = makeString("excluding skipped synsets");

    private static final SubLObject $$WordNetSynsetImportStatus_Skip = reader_make_constant_shell(makeString("WordNetSynsetImportStatus-Skip"));

    private static final SubLSymbol WNI_SYNSET_ID = makeSymbol("WNI-SYNSET-ID");

    private static final SubLSymbol POSSIBLY_NAUT_P = makeSymbol("POSSIBLY-NAUT-P");



    private static final SubLSymbol WNI_SYNSET_WORDS = makeSymbol("WNI-SYNSET-WORDS");

    private static final SubLSymbol WNI_SYNSETS_EQUAL = makeSymbol("WNI-SYNSETS-EQUAL");

    private static final SubLSymbol WNI_SYNSET_WORDS_HELPER = makeSymbol("WNI-SYNSET-WORDS-HELPER");

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym52$_POS = makeSymbol("?POS");

    private static final SubLSymbol $sym53$_SENSE = makeSymbol("?SENSE");

    private static final SubLObject $$wnSynsetWord = reader_make_constant_shell(makeString("wnSynsetWord"));

    private static final SubLList $list55 = list(list(reader_make_constant_shell(makeString("WordNetWordSenseFn")), list(reader_make_constant_shell(makeString("WordNetEnglishWordFn")), makeSymbol("?STRING")), makeSymbol("?POS"), makeSymbol("?SENSE")), makeSymbol("?WORD-INDEX"));

    private static final SubLSymbol $sym56$_ = makeSymbol("<");



    private static final SubLSymbol $wni_synset_words_helper_caching_state$ = makeSymbol("*WNI-SYNSET-WORDS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSET_EXAMPLE_PHRASES = makeSymbol("WNI-SYNSET-EXAMPLE-PHRASES");

    private static final SubLSymbol WNI_SYNSET_EXAMPLE_PHRASES_HELPER = makeSymbol("WNI-SYNSET-EXAMPLE-PHRASES-HELPER");

    private static final SubLObject $$wnSynsetExamplePhraseWithPosition = reader_make_constant_shell(makeString("wnSynsetExamplePhraseWithPosition"));

    private static final SubLList $list62 = list(makeSymbol("?EXAMPLE-PHRASE"), makeSymbol("?INDEX"));



    private static final SubLSymbol $wni_synset_example_phrases_helper_caching_state$ = makeSymbol("*WNI-SYNSET-EXAMPLE-PHRASES-HELPER-CACHING-STATE*");

    private static final SubLList $list65 = list(cons(reader_make_constant_shell(makeString("WNVerbFrame-8")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("WNVerbFrame-2")), FIVE_INTEGER), cons(reader_make_constant_shell(makeString("WNVerbFrame-1")), FOUR_INTEGER), cons(reader_make_constant_shell(makeString("WNVerbFrame-9")), THREE_INTEGER), cons(reader_make_constant_shell(makeString("WNVerbFrame-11")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("WNVerbFrame-22")), FIVE_INTEGER), cons(reader_make_constant_shell(makeString("WNVerbFrame-4")), FOUR_INTEGER));

    private static final SubLSymbol WNI_MOST_GENERAL_SYNSET_VERB_FRAME = makeSymbol("WNI-MOST-GENERAL-SYNSET-VERB-FRAME");



    private static final SubLSymbol WNI_SYNSET_VERB_FRAMES = makeSymbol("WNI-SYNSET-VERB-FRAMES");

    private static final SubLSymbol WNI_SYNSET_VERB_FRAMES_HELPER = makeSymbol("WNI-SYNSET-VERB-FRAMES-HELPER");

    private static final SubLObject $$wnSynsetVerbFrame = reader_make_constant_shell(makeString("wnSynsetVerbFrame"));

    private static final SubLList $list71 = list(makeSymbol("?VERB-FRAME"));

    private static final SubLList $list72 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?VERB-FRAME")), makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    private static final SubLSymbol $wni_synset_verb_frames_helper_caching_state$ = makeSymbol("*WNI-SYNSET-VERB-FRAMES-HELPER-CACHING-STATE*");



    private static final SubLSymbol WNI_VERB_FRAMES_FOR_WORD = makeSymbol("WNI-VERB-FRAMES-FOR-WORD");

    private static final SubLSymbol $wni_verb_frames_for_word_caching_state$ = makeSymbol("*WNI-VERB-FRAMES-FOR-WORD-CACHING-STATE*");

    private static final SubLSymbol WNI_HYPERNYMS = makeSymbol("WNI-HYPERNYMS");

    private static final SubLSymbol WNI_HYPERNYMS_HELPER = makeSymbol("WNI-HYPERNYMS-HELPER");

    private static final SubLObject $$wnHypernym = reader_make_constant_shell(makeString("wnHypernym"));

    private static final SubLList $list80 = list(makeSymbol("?HYPERNYM-SYNSET"));

    private static final SubLSymbol $wni_hypernyms_helper_caching_state$ = makeSymbol("*WNI-HYPERNYMS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_ALL_HYPERNYMS = makeSymbol("WNI-ALL-HYPERNYMS");

    private static final SubLSymbol WNI_ALL_HYPERNYMS_HELPER = makeSymbol("WNI-ALL-HYPERNYMS-HELPER");

    private static final SubLSymbol $wni_all_hypernyms_helper_caching_state$ = makeSymbol("*WNI-ALL-HYPERNYMS-HELPER-CACHING-STATE*");

    private static final SubLSymbol $sym85$WNI_ALL_HYPERNYM_ = makeSymbol("WNI-ALL-HYPERNYM?");

    private static final SubLSymbol WNI_HYPONYMS = makeSymbol("WNI-HYPONYMS");

    private static final SubLSymbol WNI_HYPONYMS_HELPER = makeSymbol("WNI-HYPONYMS-HELPER");

    private static final SubLSymbol $sym88$_HYPONYM_SYNSET = makeSymbol("?HYPONYM-SYNSET");

    private static final SubLSymbol $wni_hyponyms_helper_caching_state$ = makeSymbol("*WNI-HYPONYMS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_ALL_HYPONYMS = makeSymbol("WNI-ALL-HYPONYMS");

    private static final SubLSymbol WNI_ALL_HYPONYMS_HELPER = makeSymbol("WNI-ALL-HYPONYMS-HELPER");

    private static final SubLSymbol $wni_all_hyponyms_helper_caching_state$ = makeSymbol("*WNI-ALL-HYPONYMS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_ANY_HYPONYM_AN_INDIVIDUAL = makeSymbol("WNI-ANY-HYPONYM-AN-INDIVIDUAL");

    private static final SubLSymbol $sym94$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_ = makeSymbol("WNI-VERB-IS-DERIVED-FROM-SITUATION-NOUN?");

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLSymbol WNI_DERIVED_FORMS = makeSymbol("WNI-DERIVED-FORMS");

    private static final SubLSymbol WNI_DERIVED_FORMS_HELPER = makeSymbol("WNI-DERIVED-FORMS-HELPER");

    private static final SubLString $str98$SELECT_DISTINCT_synsetpointer_syn = makeString("SELECT DISTINCT synsetpointer.synset_id \n               FROM synsetpointer \n               WHERE \n                 synsetpointer.target_synset_id = ");

    private static final SubLString $str99$_AND____________________synsetpoi = makeString(" AND \n                 (synsetpointer.source_pos = \'n\' OR\n                  synsetpointer.source_pos = \'a\' OR\n                  synsetpointer.source_pos = \'r\') AND \n                 synsetpointer.pointer_type = \'+\'");

    private static final SubLSymbol $wni_derived_forms_helper_caching_state$ = makeSymbol("*WNI-DERIVED-FORMS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSET_GLOSS = makeSymbol("WNI-SYNSET-GLOSS");

    private static final SubLSymbol WNI_SYNSET_GLOSS_HELPER = makeSymbol("WNI-SYNSET-GLOSS-HELPER");

    private static final SubLObject $$wnSynsetGloss = reader_make_constant_shell(makeString("wnSynsetGloss"));

    private static final SubLList $list104 = list(makeSymbol("?GLOSS"));

    private static final SubLList $list105 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?GLOSS")), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    private static final SubLSymbol $wni_synset_gloss_helper_caching_state$ = makeSymbol("*WNI-SYNSET-GLOSS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSET_POS = makeSymbol("WNI-SYNSET-POS");

    private static final SubLSymbol WNI_SYNSET_POS_HELPER = makeSymbol("WNI-SYNSET-POS-HELPER");

    private static final SubLObject $$wnSynsetSpeechPart = reader_make_constant_shell(makeString("wnSynsetSpeechPart"));

    private static final SubLList $list110 = list(makeSymbol("?POS"));

    private static final SubLList $list111 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?POS")), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    private static final SubLSymbol $wni_synset_pos_helper_caching_state$ = makeSymbol("*WNI-SYNSET-POS-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_SYNSET_SPEECH_PART_OFFSET = makeSymbol("WNI-SYNSET-SPEECH-PART-OFFSET");

    private static final SubLSymbol WNI_SYNSET_SPEECH_PART_OFFSET_HELPER = makeSymbol("WNI-SYNSET-SPEECH-PART-OFFSET-HELPER");



    private static final SubLObject $$wnSynsetSpeechPartOffset = reader_make_constant_shell(makeString("wnSynsetSpeechPartOffset"));

    private static final SubLList $list117 = list(makeSymbol("?SPEECH-PART-OFFSET"));

    private static final SubLList $list118 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?SPEECH-PART-OFFSET")), makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    private static final SubLSymbol $wni_synset_speech_part_offset_helper_caching_state$ = makeSymbol("*WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-CACHING-STATE*");



    private static final SubLSymbol WNI_HYPERNYM_TERMS = makeSymbol("WNI-HYPERNYM-TERMS");

    private static final SubLSymbol $sym122$WNI_HYPERNYM_MAPPED_ = makeSymbol("WNI-HYPERNYM-MAPPED?");

    private static final SubLSymbol WNI_SYNSET_TERM = makeSymbol("WNI-SYNSET-TERM");

    private static final SubLSymbol WNI_SYNSET_TERM_HELPER = makeSymbol("WNI-SYNSET-TERM-HELPER");



    private static final SubLObject $$synonymousExternalConcept = reader_make_constant_shell(makeString("synonymousExternalConcept"));

    private static final SubLSymbol $sym127$_TERM = makeSymbol("?TERM");

    private static final SubLObject $const128$WordNet_Version2_0 = reader_make_constant_shell(makeString("WordNet-Version2_0"));

    private static final SubLList $list129 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(0.95), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?TERM")), makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000) });

    private static final SubLSymbol $wni_synset_term_helper_caching_state$ = makeSymbol("*WNI-SYNSET-TERM-HELPER-CACHING-STATE*");

    private static final SubLSymbol WNI_UNMAPPED_HYPERNYM_CHAIN = makeSymbol("WNI-UNMAPPED-HYPERNYM-CHAIN");

    private static final SubLSymbol $sym132$WNI_SYNSET_W_O_LINKS = makeSymbol("WNI-SYNSET-W/O-LINKS");

    private static final SubLSymbol $sym133$WNI_SYNSET_W_O_LINKS_HELPER = makeSymbol("WNI-SYNSET-W/O-LINKS-HELPER");

    public static final SubLString $str134$_ = makeString("(");

    private static final SubLString $str135$___ = makeString(" | ");

    private static final SubLString $str136$_ = makeString(")");

    private static final SubLSymbol $sym137$_WNI_SYNSET_W_O_LINKS_HELPER_CACHING_STATE_ = makeSymbol("*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*");



    private static final SubLSymbol $sym139$WNI_SYNSET_IS_CAUSER_ = makeSymbol("WNI-SYNSET-IS-CAUSER?");

    private static final SubLSymbol WNI_SYNSETS_CAUSED_BY = makeSymbol("WNI-SYNSETS-CAUSED-BY");

    private static final SubLSymbol WNI_SYNSETS_CAUSED_BY_HELPER = makeSymbol("WNI-SYNSETS-CAUSED-BY-HELPER");

    private static final SubLObject $$wnCause = reader_make_constant_shell(makeString("wnCause"));

    private static final SubLList $list143 = list(makeSymbol("?CAUSED-SYNSET"));

    private static final SubLSymbol $wni_synsets_caused_by_helper_caching_state$ = makeSymbol("*WNI-SYNSETS-CAUSED-BY-HELPER-CACHING-STATE*");

    private static final SubLSymbol $sym145$WNI_SYNSET_IS_CAUSED_BY_ = makeSymbol("WNI-SYNSET-IS-CAUSED-BY?");

    private static final SubLSymbol WNI_SYNSETS_CAUSING = makeSymbol("WNI-SYNSETS-CAUSING");

    private static final SubLSymbol WNI_SYNSETS_CAUSING_HELPER = makeSymbol("WNI-SYNSETS-CAUSING-HELPER");

    private static final SubLSymbol $sym148$_CAUSING_SYNSET = makeSymbol("?CAUSING-SYNSET");

    private static final SubLSymbol $wni_synsets_causing_helper_caching_state$ = makeSymbol("*WNI-SYNSETS-CAUSING-HELPER-CACHING-STATE*");

    private static final SubLString $$$ancient = makeString("ancient");

    private static final SubLString $$$Greek = makeString("Greek");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$Atlantic = makeString("Atlantic");

    private static final SubLString $$$Pacific = makeString("Pacific");

    private static final SubLString $$$Crown_Colony = makeString("Crown Colony");

    private static final SubLString $$$Caribbean = makeString("Caribbean");

    private static final SubLString $$$State = makeString("State");

    private static final SubLString $$$Lake_Erie = makeString("Lake Erie");

    private static final SubLString $$$Asia_Minor = makeString("Asia Minor");

    private static final SubLString $$$Elbo_River = makeString("Elbo River");

    private static final SubLString $$$Asian = makeString("Asian");

    private static final SubLString $$$Yourba = makeString("Yourba");

    private static final SubLString $$$Japanese = makeString("Japanese");

    private static final SubLString $$$Nile = makeString("Nile");

    private static final SubLString $$$River_Thames = makeString("River Thames");

    private static final SubLString $$$River_Aire = makeString("River Aire");

    private static final SubLString $str167$_s = makeString("'s");

    private static final SubLObject $$GeopoliticalEntity = reader_make_constant_shell(makeString("GeopoliticalEntity"));

    private static final SubLObject $$City = reader_make_constant_shell(makeString("City"));

    private static final SubLSymbol WNI_SYNSETS_HAVING_POS = makeSymbol("WNI-SYNSETS-HAVING-POS");

    private static final SubLSymbol WNI_TERMS_SYNSETS = makeSymbol("WNI-TERMS-SYNSETS");

    private static final SubLList $list172 = list(reader_make_constant_shell(makeString("WordNet-Version2_0")), makeSymbol("?SPEECH-PART-OFFSET"));

    private static final SubLList $list173 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), NIL, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(0.95), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000) });

    private static final SubLSymbol $sym174$_SPEECH_PART_OFFSET = makeSymbol("?SPEECH-PART-OFFSET");

    private static final SubLSymbol WNI_BROADER_TERMS = makeSymbol("WNI-BROADER-TERMS");

    private static final SubLObject $$CycKBSubsetCollection = reader_make_constant_shell(makeString("CycKBSubsetCollection"));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $wni_broader_terms_caching_state$ = makeSymbol("*WNI-BROADER-TERMS-CACHING-STATE*");

    private static final SubLSymbol WNI_MAPPED_TERMS_AND_SYNSETS = makeSymbol("WNI-MAPPED-TERMS-AND-SYNSETS");

    private static final SubLString $str180$finding_synsets_for_speech_part_o = makeString("finding synsets for speech-part-offsets");



    private static final SubLSymbol $sym182$WNI_SYNSET_HYPERNYMS_MAPPED_ = makeSymbol("WNI-SYNSET-HYPERNYMS-MAPPED?");

    private static final SubLSymbol WNI_MAPPED_TERMS = makeSymbol("WNI-MAPPED-TERMS");

    private static final SubLList $list184 = list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SPEECH-PART-OFFSET"), list(reader_make_constant_shell(makeString("synonymousExternalConcept")), makeSymbol("?TERM"), reader_make_constant_shell(makeString("WordNet-Version2_0")), makeSymbol("?SPEECH-PART-OFFSET")));

    private static final SubLObject $$WordNetMappingMt = reader_make_constant_shell(makeString("WordNetMappingMt"));

    private static final SubLSymbol WNI_MAPPED_TERMS_AND_POS_OFFSETS = makeSymbol("WNI-MAPPED-TERMS-AND-POS-OFFSETS");

    public static final SubLList $list187 = list(reader_make_constant_shell(makeString("synonymousExternalConcept")), makeSymbol("?TERM"), reader_make_constant_shell(makeString("WordNet-Version2_0")), makeSymbol("?SPEECH-PART-OFFSET"));

    private static final SubLSymbol WNI_SPEECH_PART_OFFSET_TO_SYNSET = makeSymbol("WNI-SPEECH-PART-OFFSET-TO-SYNSET");

    public static final SubLList $list189 = list(new SubLObject[]{ makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("BLOCK?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    private static final SubLSymbol WNI_UPDATE_SYNSET_WITH_TERM = makeSymbol("WNI-UPDATE-SYNSET-WITH-TERM");

    private static final SubLList $list191 = list(makeKeyword("TIMEOUT"), THREE_INTEGER);

    private static final SubLString $str192$update_Synset_set_cyc_term_____A_ = makeString("update Synset set cyc_term = '~A' where synset_id = ~S");

    private static final SubLSymbol WNI_INSERT_CONCEPT_MATCH_HTML = makeSymbol("WNI-INSERT-CONCEPT-MATCH-HTML");

    private static final SubLString $str194$delete_from_ConceptMatchHTML_wher = makeString("delete from ConceptMatchHTML where synset_id = ~A and cyc_image_id ='~A'");

    private static final SubLString $str195$insert_into_ConceptMatchHTML_valu = makeString("insert into ConceptMatchHTML values(~A, '~A', '~A')");

    private static final SubLString $str196$__ = makeString("''");

    private static final SubLString $str197$_ = makeString("'");

    private static final SubLSymbol WNI_SELECT_CONCEPT_MATCH_HTML = makeSymbol("WNI-SELECT-CONCEPT-MATCH-HTML");

    private static final SubLString $str199$select_html_from_ConceptMatchHTML = makeString("select html from ConceptMatchHTML where synset_id = ~A and cyc_image_id ='~A'");

    private static final SubLSymbol WNI_DELETE_CONCEPT_MATCH_HTML = makeSymbol("WNI-DELETE-CONCEPT-MATCH-HTML");

    private static final SubLSymbol WNI_DELETE_ALL_CONCEPT_MATCH_HTML = makeSymbol("WNI-DELETE-ALL-CONCEPT-MATCH-HTML");

    private static final SubLString $str202$delete_from_ConceptMatchHTML_wher = makeString("delete from ConceptMatchHTML where cyc_image_id ='~A'");

    private static final SubLSymbol WNI_UNMAPPED_SYNSETS_HAVING_MAPPED_HYPERNYM = makeSymbol("WNI-UNMAPPED-SYNSETS-HAVING-MAPPED-HYPERNYM");

    private static final SubLString $str204$select_Synset_synset_id__________ = makeString("select Synset.synset_id\n                 from \n                   Synset, \n                   Synset as target_synset, \n                   SynsetPointer\n                 where\n                   Synset.pos = \'");

    private static final SubLString $str205$__and____________________Synset_c = makeString("\' and\n                   Synset.cyc_term is null and\n                   pointer_type = \'@\' and\n                   SynsetPointer.synset_id = Synset.synset_id and\n                   SynsetPointer.target_synset_id = target_synset.synset_id and\n                   target_synset.cyc_term is not null\n                 order by Synset.synset_id");









    private static final SubLString $str210$Destroying_invalid_WordNet_Import = makeString("Destroying invalid WordNet Import problem store...");

    private static final SubLFloat $float$0_9 = makeDouble(0.9);

    private static final SubLString $str212$Destroying_90___full_WordNet_Impo = makeString("Destroying 90%+ full WordNet Import problem store...");

    private static final SubLList $list213 = list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("NONE"), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("NEW-TERMS-ALLOWED?"), NIL);



    private static final SubLSymbol WNI_REIFIABLE_SYNSET = makeSymbol("WNI-REIFIABLE-SYNSET");

    private static final SubLObject $$WordNetSynsetReifiedFn = reader_make_constant_shell(makeString("WordNetSynsetReifiedFn"));

    private static final SubLSymbol WNI_REIFIABLE_SYNSET_FROM_STRING = makeSymbol("WNI-REIFIABLE-SYNSET-FROM-STRING");

    private static final SubLSymbol WNI_SYNSET_FROM_ID_STRING = makeSymbol("WNI-SYNSET-FROM-ID-STRING");

    private static final SubLSymbol $sym219$DIGIT_STRING_ = makeSymbol("DIGIT-STRING?");

    private static final SubLSymbol WNI_ENSURE_NAUT = makeSymbol("WNI-ENSURE-NAUT");

    private static final SubLSymbol WNI_NEXT_SYNSET_WITH_STATUS = makeSymbol("WNI-NEXT-SYNSET-WITH-STATUS");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $sym224$_REIFIED_SYNSET = makeSymbol("?REIFIED-SYNSET");

    private static final SubLList $list225 = list(list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?CYCLIST"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?DATE"), list(reader_make_constant_shell(makeString("wnWorkflowSynsetLock")), makeSymbol("?REIFIED-SYNSET"), makeSymbol("?CYCLIST"), makeSymbol("?DATE"))))));

    private static final SubLSymbol WNI_UNLOCKED_SYNSETS_WITH_STATUS = makeSymbol("WNI-UNLOCKED-SYNSETS-WITH-STATUS");

    private static final SubLSymbol $sym227$WNI_TERM_HAS_VERB_SEMTRANS_ = makeSymbol("WNI-TERM-HAS-VERB-SEMTRANS?");

    private static final SubLSymbol $sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_ = makeSymbol("WNI-TERM-HAS-VERB-SEMTRANS-HELPER?");

    private static final SubLSymbol $sym229$_WORD_UNIT = makeSymbol("?WORD-UNIT");

    private static final SubLSymbol $sym230$_SENSE_NBR = makeSymbol("?SENSE-NBR");

    private static final SubLObject $$denotation = reader_make_constant_shell(makeString("denotation"));

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLSymbol $sym234$_FRAME = makeSymbol("?FRAME");

    private static final SubLSymbol $sym235$_TRANS = makeSymbol("?TRANS");

    private static final SubLObject $$verbSemTrans_Canonical = reader_make_constant_shell(makeString("verbSemTrans-Canonical"));

    public static final SubLList $list237 = list(makeSymbol("?TRANS"));

    private static final SubLList $list238 = list(list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?FRAME"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TRANS"), list(reader_make_constant_shell(makeString("verbSemTrans")), makeSymbol("?WORD-UNIT"), makeSymbol("?SENSE-NBR"), makeSymbol("?FRAME"), makeSymbol("?TRANS"))))));

    private static final SubLList $list239 = list(NIL);

    private static final SubLSymbol $sym240$_WNI_TERM_HAS_VERB_SEMTRANS_HELPER__CACHING_STATE_ = makeSymbol("*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*");

    private static final SubLSymbol WNI_GATHER_TERMS_FOR_MATCHING = makeSymbol("WNI-GATHER-TERMS-FOR-MATCHING");

    private static final SubLSymbol WNI_EXACT_SYNSET_TERM_MATCHES = makeSymbol("WNI-EXACT-SYNSET-TERM-MATCHES");

    private static final SubLString $str243$___A_mapped_hypernyms__A___A__ = makeString("~%~A mapped-hypernyms ~A~%~A~%");

    private static final SubLString $str244$__considering_word____a__ = makeString("  considering word - ~a~%");

    private static final SubLString $str245$____possible_lexical_matches__A__ = makeString("    possible lexical matches ~A~%");

    private static final SubLString $str246$____considering_term____a___const = makeString("    considering term - ~a - constrained by mapped broader terms ~A~%");

    private static final SubLString $str247$___A_____A__structure___ = makeString("~%~A  = ~A (structure)~%");

    private static final SubLString $str248$___A____A__lexicon___ = makeString("~%~A = ~A (lexicon)~%");

    private static final SubLSymbol WNI_STRONG_SYNSET_TERM_MATCHES = makeSymbol("WNI-STRONG-SYNSET-TERM-MATCHES");





    private static final SubLSymbol $ALL_NOUN_FORMS = makeKeyword("ALL-NOUN-FORMS");



    private static final SubLSymbol $sym254$SET_OR_COLLECTION_ = makeSymbol("SET-OR-COLLECTION?");

    private static final SubLSymbol $sym255$INDIVIDUAL_ = makeSymbol("INDIVIDUAL?");

    private static final SubLSymbol WNI_WEAK_SYNSET_TERM_MATCHES = makeSymbol("WNI-WEAK-SYNSET-TERM-MATCHES");

    private static final SubLSymbol WNI_CREATE_NOW = makeSymbol("WNI-CREATE-NOW");



    private static final SubLSymbol WNI_ASSERT_WFF = makeSymbol("WNI-ASSERT-WFF");







    private static final SubLSymbol WNI_UNASSERT_IMPORT_STATUSES = makeSymbol("WNI-UNASSERT-IMPORT-STATUSES");

    private static final SubLSymbol WNI_UNASSERT_IMPORT_STATUS = makeSymbol("WNI-UNASSERT-IMPORT-STATUS");

    private static final SubLSymbol WNI_ASSERT_IMPORT_STATUSES = makeSymbol("WNI-ASSERT-IMPORT-STATUSES");

    private static final SubLSymbol WNI_ASSERT_IMPORT_STATUS = makeSymbol("WNI-ASSERT-IMPORT-STATUS");





    private static final SubLSymbol WNI_ASSERT_SYNSET_MAPPING = makeSymbol("WNI-ASSERT-SYNSET-MAPPING");

    private static final SubLSymbol WNI_ASSERT_LIKELY_SYNSET_MAPPING = makeSymbol("WNI-ASSERT-LIKELY-SYNSET-MAPPING");

    private static final SubLObject $$wnLikelySynsetMapping = reader_make_constant_shell(makeString("wnLikelySynsetMapping"));

    private static final SubLSymbol WNI_ASSERT_QUOTED_ISA_WORKFLOW_CONSTANT = makeSymbol("WNI-ASSERT-QUOTED-ISA-WORKFLOW-CONSTANT");

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLList $list274 = list(reader_make_constant_shell(makeString("WordNetWorkflowConstant-NotFullyReviewed")));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLSymbol WNI_ASSERT_ISA_COLLECTION = makeSymbol("WNI-ASSERT-ISA-COLLECTION");

    private static final SubLList $list277 = list(reader_make_constant_shell(makeString("Collection")));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLSymbol WNI_ASSERT_GENLS = makeSymbol("WNI-ASSERT-GENLS");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLSymbol WNI_UNASSERT_GENLS = makeSymbol("WNI-UNASSERT-GENLS");

    private static final SubLSymbol WNI_ASSERT_ISA = makeSymbol("WNI-ASSERT-ISA");

    private static final SubLObject $$WordNetIndividualMappingMt = reader_make_constant_shell(makeString("WordNetIndividualMappingMt"));

    private static final SubLSymbol WNI_ASSERT_ISA_INDIVIDUAL = makeSymbol("WNI-ASSERT-ISA-INDIVIDUAL");

    private static final SubLList $list285 = list(reader_make_constant_shell(makeString("Individual")));

    private static final SubLSymbol WNI_ASSERT_ISA_AGENT_GENERIC = makeSymbol("WNI-ASSERT-ISA-AGENT-GENERIC");

    private static final SubLObject $$Agent_Generic = reader_make_constant_shell(makeString("Agent-Generic"));

    private static final SubLList $list288 = list(reader_make_constant_shell(makeString("Agent-Generic")));

    private static final SubLSymbol WNI_ASSERT_REIFIED_USING = makeSymbol("WNI-ASSERT-REIFIED-USING");

    private static final SubLObject $$reifiedUsingTool = reader_make_constant_shell(makeString("reifiedUsingTool"));

    private static final SubLList $list291 = list(reader_make_constant_shell(makeString("CycWordNetImportTool")));

    private static final SubLSymbol WNI_SYNSET_NOTE = makeSymbol("WNI-SYNSET-NOTE");

    private static final SubLObject $$wnSynsetNote = reader_make_constant_shell(makeString("wnSynsetNote"));

    private static final SubLList $list294 = list(makeSymbol("?NOTE"));

    private static final SubLString $str295$ = makeString("");

    private static final SubLSymbol WNI_ASSERT_SYNSET_NOTE = makeSymbol("WNI-ASSERT-SYNSET-NOTE");

    private static final SubLSymbol WNI_UNASSERT_SYNSET_NOTE = makeSymbol("WNI-UNASSERT-SYNSET-NOTE");

    private static final SubLSymbol WNI_ASSERT_COMMENT = makeSymbol("WNI-ASSERT-COMMENT");

    private static final SubLObject $$comment = reader_make_constant_shell(makeString("comment"));

    private static final SubLSymbol WNI_ASSERT_TERM_OF_UNIT = makeSymbol("WNI-ASSERT-TERM-OF-UNIT");

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol WNI_LOCK_SYNSET = makeSymbol("WNI-LOCK-SYNSET");

    private static final SubLObject $$wnWorkflowSynsetLock = reader_make_constant_shell(makeString("wnWorkflowSynsetLock"));

    private static final SubLSymbol WNI_UNLOCK_SYNSET = makeSymbol("WNI-UNLOCK-SYNSET");

    private static final SubLList $list306 = list(makeSymbol("?DATE"));

    private static final SubLSymbol WNI_ASSERT_HEURISTIC_LEXICON = makeSymbol("WNI-ASSERT-HEURISTIC-LEXICON");



    public static final SubLList $list309 = list(reader_make_constant_shell(makeString("WordNetSynsetFn")), makeInteger(114834));

    private static final SubLList $list310 = list(reader_make_constant_shell(makeString("WordNetSynsetFn")), makeInteger(114709));

    public static final SubLList $list311 = list(reader_make_constant_shell(makeString("WordNetSynsetFn")), makeInteger(567092));

    private static final SubLString $str312$_included = makeString("-included");

    public static final SubLList $list313 = list(reader_make_constant_shell(makeString("WordNetSynsetFn")), makeInteger(377912));

    private static final SubLList $list314 = list(reader_make_constant_shell(makeString("WordNetSynsetFn")), makeInteger(382049));

    private static final SubLList $list315 = list(reader_make_constant_shell(makeString("WordNetSynsetFn")), makeInteger(378797));

    private static final SubLString $str316$WordNet_individual_synset__A_must = makeString("WordNet individual synset ~A must be a #$Noun");

    private static final SubLObject $$BiologicalSpecies = reader_make_constant_shell(makeString("BiologicalSpecies"));

    private static final SubLObject $$scientificName = reader_make_constant_shell(makeString("scientificName"));

    private static final SubLObject $$NewLatinLexicalMt = reader_make_constant_shell(makeString("NewLatinLexicalMt"));

    private static final SubLList $list320 = list(CHAR_space, CHAR_semicolon, CHAR_comma);

    public static final SubLList $list321 = list(CHAR_hyphen);

    private static final SubLObject $$TheList = reader_make_constant_shell(makeString("TheList"));

    private static final SubLObject $$GeneralEnglishMt = reader_make_constant_shell(makeString("GeneralEnglishMt"));

    private static final SubLObject $$hyphenString = reader_make_constant_shell(makeString("hyphenString"));

    private static final SubLObject $const325$TemporaryLexicalAssertions_WordNe = reader_make_constant_shell(makeString("TemporaryLexicalAssertions-WordNetImportMt"));

    private static final SubLString $str326$_count_noun = makeString("-count-noun");

    private static final SubLString $str327$headword_is_first = makeString("headword-is-first");

    private static final SubLObject $$multiWordString = reader_make_constant_shell(makeString("multiWordString"));

    private static final SubLObject $$compoundString = reader_make_constant_shell(makeString("compoundString"));

    private static final SubLString $str330$must_have_an_existing_word_unit_f = makeString("must have an existing word unit for ~A which has speech-part ~A");

    private static final SubLSymbol $sym331$_WORD_SENSE = makeSymbol("?WORD-SENSE");

    private static final SubLString $str332$must_have_an_existing_word_sense_ = makeString("must have an existing word sense for ~A which has speech-part ~A");

    private static final SubLObject $$politenessOfWS = reader_make_constant_shell(makeString("politenessOfWS"));

    private static final SubLObject $$formalityOfWS = reader_make_constant_shell(makeString("formalityOfWS"));

    private static final SubLObject $$rhetoricalDeviceOfPhrase = reader_make_constant_shell(makeString("rhetoricalDeviceOfPhrase"));

    private static final SubLString $str336$_politeness = makeString("-politeness");

    private static final SubLString $$$polite = makeString("polite");

    private static final SubLObject $$PoliteSpeech = reader_make_constant_shell(makeString("PoliteSpeech"));

    private static final SubLString $$$rude = makeString("rude");

    private static final SubLObject $$RudeSpeech = reader_make_constant_shell(makeString("RudeSpeech"));

    private static final SubLString $$$vulgar = makeString("vulgar");

    private static final SubLObject $$VulgarSpeech = reader_make_constant_shell(makeString("VulgarSpeech"));

    private static final SubLString $str343$_formality = makeString("-formality");

    private static final SubLString $$$archaic = makeString("archaic");

    private static final SubLObject $$ArchaicSpeech = reader_make_constant_shell(makeString("ArchaicSpeech"));

    private static final SubLString $$$slang = makeString("slang");

    private static final SubLObject $$SlangSpeech = reader_make_constant_shell(makeString("SlangSpeech"));

    private static final SubLString $$$formal = makeString("formal");

    private static final SubLObject $$FormalSpeech = reader_make_constant_shell(makeString("FormalSpeech"));

    private static final SubLString $$$informal = makeString("informal");

    private static final SubLObject $$InformalSpeech = reader_make_constant_shell(makeString("InformalSpeech"));

    private static final SubLString $$$baby_talk = makeString("baby talk");

    private static final SubLObject $$BabyTalk = reader_make_constant_shell(makeString("BabyTalk"));

    private static final SubLString $$$technical_jargon = makeString("technical jargon");

    private static final SubLObject $$Jargon = reader_make_constant_shell(makeString("Jargon"));

    private static final SubLString $str356$_rhetorical_device = makeString("-rhetorical-device");

    private static final SubLString $$$metaphor = makeString("metaphor");

    private static final SubLObject $$MetaphoricalSpeech = reader_make_constant_shell(makeString("MetaphoricalSpeech"));

    private static final SubLString $$$simile = makeString("simile");

    private static final SubLObject $$Simile_FigureOfSpeech = reader_make_constant_shell(makeString("Simile-FigureOfSpeech"));

    private static final SubLString $$$euphemism = makeString("euphemism");

    private static final SubLObject $$EuphemisticSpeech = reader_make_constant_shell(makeString("EuphemisticSpeech"));

    private static final SubLObject $$nameString = reader_make_constant_shell(makeString("nameString"));

    private static final SubLObject $$familyName = reader_make_constant_shell(makeString("familyName"));

    private static final SubLString $str365$Mrs_ = makeString("Mrs.");

    private static final SubLString $$$Sir_ = makeString("Sir ");

    private static final SubLString $str367$_Jr_ = makeString(" Jr.");

    private static final SubLString $$$President_ = makeString("President ");

    private static final SubLObject $$givenNames = reader_make_constant_shell(makeString("givenNames"));

    private static final SubLObject $$middleName = reader_make_constant_shell(makeString("middleName"));

    private static final SubLObject $$pseudonym = reader_make_constant_shell(makeString("pseudonym"));

    private static final SubLObject $$placeName_Standard = reader_make_constant_shell(makeString("placeName-Standard"));

    private static final SubLObject $$placeName_ShortForm = reader_make_constant_shell(makeString("placeName-ShortForm"));

    private static final SubLObject $$acronymString = reader_make_constant_shell(makeString("acronymString"));

    private static final SubLObject $$initialismString = reader_make_constant_shell(makeString("initialismString"));

    private static final SubLString $$$ing = makeString("ing");

    private static final SubLObject $$GerundiveNoun = reader_make_constant_shell(makeString("GerundiveNoun"));

    private static final SubLString $$$t = makeString("t");

    private static final SubLObject $$ProperCountNoun = reader_make_constant_shell(makeString("ProperCountNoun"));

    private static final SubLObject $$ProperMassNoun = reader_make_constant_shell(makeString("ProperMassNoun"));

    private static final SubLObject $$CountNoun = reader_make_constant_shell(makeString("CountNoun"));

    private static final SubLObject $$MassNoun = reader_make_constant_shell(makeString("MassNoun"));

    private static final SubLSymbol WNI_NUMBER_OF_WORKFLOW_MAPPED_TERMS = makeSymbol("WNI-NUMBER-OF-WORKFLOW-MAPPED-TERMS");

    private static final SubLString $$$Counting_recent_WordNet_mappings = makeString("Counting recent WordNet mappings");

    private static final SubLInteger $int$20050101 = makeInteger(20050101);

    private static final SubLSymbol WNI_NUMBER_OF_NEW_CONCEPTS_IMPORTED_FROM_WORDNET = makeSymbol("WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET");

    private static final SubLObject $const387$WordNetWorkflowConstant_NotFullyR = reader_make_constant_shell(makeString("WordNetWorkflowConstant-NotFullyReviewed"));

    private static final SubLString $str388$Counting_terms_imported_from_Word = makeString("Counting terms imported from WordNet");

    private static final SubLObject $$SteveReed = reader_make_constant_shell(makeString("SteveReed"));

    private static final SubLObject $$CycWordNetImportTool = reader_make_constant_shell(makeString("CycWordNetImportTool"));

    private static final SubLSymbol WNI_NUMBER_OF_NEW_DENOTATIONS_IMPORTED_FROM_WORDET = makeSymbol("WNI-NUMBER-OF-NEW-DENOTATIONS-IMPORTED-FROM-WORDET");

    private static final SubLString $str392$Counting_recent_denotations_impor = makeString("Counting recent denotations imported from WordNet");

    private static final SubLSymbol WNI_ROLE_INFO = makeSymbol("WNI-ROLE-INFO");

    private static final SubLSymbol WNI_ROLE_INFO_P = makeSymbol("WNI-ROLE-INFO-P");

    public static final SubLList $list395 = list(makeSymbol("ROLE"), makeSymbol("FILLER"), makeSymbol("DEFINING-COL"), makeSymbol("DEFINING-PRED"), makeSymbol("SUBSUMPTION-STATUS"));

    public static final SubLList $list396 = list(makeKeyword("ROLE"), makeKeyword("FILLER"), makeKeyword("DEFINING-COL"), makeKeyword("DEFINING-PRED"), makeKeyword("SUBSUMPTION-STATUS"));

    public static final SubLList $list397 = list(makeSymbol("WNI-ROLE"), makeSymbol("WNI-FILLER"), makeSymbol("WNI-DEFINING-COL"), makeSymbol("WNI-DEFINING-PRED"), makeSymbol("WNI-SUBSUMPTION-STATUS"));

    private static final SubLList $list398 = list(makeSymbol("_CSETF-WNI-ROLE"), makeSymbol("_CSETF-WNI-FILLER"), makeSymbol("_CSETF-WNI-DEFINING-COL"), makeSymbol("_CSETF-WNI-DEFINING-PRED"), makeSymbol("_CSETF-WNI-SUBSUMPTION-STATUS"));

    private static final SubLSymbol WNI_PRINT_ROLE_INFO = makeSymbol("WNI-PRINT-ROLE-INFO");

    private static final SubLSymbol WNI_ROLE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("WNI-ROLE-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list401 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("WNI-ROLE-INFO-P"));

    private static final SubLSymbol WNI_ROLE = makeSymbol("WNI-ROLE");

    private static final SubLSymbol _CSETF_WNI_ROLE = makeSymbol("_CSETF-WNI-ROLE");

    private static final SubLSymbol WNI_FILLER = makeSymbol("WNI-FILLER");

    private static final SubLSymbol _CSETF_WNI_FILLER = makeSymbol("_CSETF-WNI-FILLER");

    private static final SubLSymbol WNI_DEFINING_COL = makeSymbol("WNI-DEFINING-COL");

    private static final SubLSymbol _CSETF_WNI_DEFINING_COL = makeSymbol("_CSETF-WNI-DEFINING-COL");

    private static final SubLSymbol WNI_DEFINING_PRED = makeSymbol("WNI-DEFINING-PRED");

    private static final SubLSymbol _CSETF_WNI_DEFINING_PRED = makeSymbol("_CSETF-WNI-DEFINING-PRED");

    private static final SubLSymbol WNI_SUBSUMPTION_STATUS = makeSymbol("WNI-SUBSUMPTION-STATUS");

    private static final SubLSymbol _CSETF_WNI_SUBSUMPTION_STATUS = makeSymbol("_CSETF-WNI-SUBSUMPTION-STATUS");











    private static final SubLString $str417$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_WNI_ROLE_INFO = makeSymbol("MAKE-WNI-ROLE-INFO");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_WNI_ROLE_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-WNI-ROLE-INFO-METHOD");



    private static final SubLString $str424$_ROLE_INFO___s__s__s__s__s_ = makeString("<ROLE-INFO: ~s ~s ~s ~s ~s>");

    private static final SubLSymbol WNI_GATHER_ROLES_AND_TRAITS = makeSymbol("WNI-GATHER-ROLES-AND-TRAITS");

    private static final SubLSymbol $sym426$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    private static final SubLSymbol WNI_FIND_COMPATIBLE_ROLES = makeSymbol("WNI-FIND-COMPATIBLE-ROLES");

    private static final SubLObject $$genlPredsWRTTypes = reader_make_constant_shell(makeString("genlPredsWRTTypes"));

    private static final SubLList $list429 = list(makeSymbol("?ROLE"), makeSymbol("?FILLER"), makeSymbol("?DEFINING-COLL"), makeSymbol("?DEFINING-PRED"));

    public static final SubLList $list430 = list(makeSymbol("?DEFINING-COLL"));

    private static final SubLList $list431 = list(reader_make_constant_shell(makeString("genls")), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell(makeString("Situation")));

    public static final SubLList $list432 = list(reader_make_constant_shell(makeString("genlPreds")), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell(makeString("keRelevantPreds")));

    public static final SubLList $list433 = list(reader_make_constant_shell(makeString("assertedSentence")), list(makeSymbol("?DEFINING-PRED"), makeSymbol("?DEFINING-COLL"), makeSymbol("?ROLE")));

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$interArgIsa1_2 = reader_make_constant_shell(makeString("interArgIsa1-2"));

    private static final SubLSymbol $sym436$_ROLE = makeSymbol("?ROLE");

    private static final SubLList $list437 = list(makeSymbol("?FILLER"));

    private static final SubLSymbol $sym438$_FILLER_2 = makeSymbol("?FILLER-2");

    private static final SubLList $list439 = list(makeSymbol("?FILLER-2"));

    private static final SubLList $list440 = list(list(reader_make_constant_shell(makeString("different")), makeSymbol("?FILLER-2"), makeSymbol("?FILLER")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?FILLER-2"), makeSymbol("?FILLER")));

    private static final SubLList $list441 = list(list(reader_make_constant_shell(makeString("arg2Isa")), makeSymbol("?ROLE"), makeSymbol("?FILLER")));

    private static final SubLSymbol $sym442$_COLL = makeSymbol("?COLL");

    public static final SubLList $list443 = list(list(reader_make_constant_shell(makeString("genls")), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell(makeString("Situation"))), list(reader_make_constant_shell(makeString("assertedSentence")), list(reader_make_constant_shell(makeString("relationAllExists")), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?COLL"))), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?FILLER"), makeSymbol("?COLL")), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell(makeString("relationAllExists"))), list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("quotedIsa")), makeSymbol("?ROLE"), reader_make_constant_shell(makeString("FormulaTemplateConstant-FactEntryTool")))));

    private static final SubLSymbol $sym444$_THING = makeSymbol("?THING");

    public static final SubLList $list445 = list(list(reader_make_constant_shell(makeString("genls")), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell(makeString("Situation"))), list(reader_make_constant_shell(makeString("assertedSentence")), list(reader_make_constant_shell(makeString("relationAllInstance")), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?THING"))), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?FILLER"), makeSymbol("?THING")), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell(makeString("relationAllInstance"))), list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("quotedIsa")), makeSymbol("?ROLE"), reader_make_constant_shell(makeString("FormulaTemplateConstant-FactEntryTool")))));

    private static final SubLSymbol $sym446$_ROLE2 = makeSymbol("?ROLE2");

    private static final SubLObject $$assertedSentence = reader_make_constant_shell(makeString("assertedSentence"));

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLSymbol $sym449$_DEFINING_COLL = makeSymbol("?DEFINING-COLL");

    private static final SubLList $list450 = list(list(reader_make_constant_shell(makeString("equals")), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell(makeString("genlPredsWRTTypes"))));

    private static final SubLList $list451 = list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell(makeString("Situation"))));

    private static final SubLList $list452 = list(list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell(makeString("Situation")))), list(reader_make_constant_shell(makeString("assertedSentence")), list(reader_make_constant_shell(makeString("relationAllExists")), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?COLL"))), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?FILLER"), makeSymbol("?COLL")), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell(makeString("relationAllExists"))), list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("quotedIsa")), makeSymbol("?ROLE"), reader_make_constant_shell(makeString("FormulaTemplateConstant-FactEntryTool")))));

    private static final SubLList $list453 = list(list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("genls")), makeSymbol("?DEFINING-COLL"), reader_make_constant_shell(makeString("Situation")))), list(reader_make_constant_shell(makeString("assertedSentence")), list(reader_make_constant_shell(makeString("relationAllInstance")), makeSymbol("?ROLE"), makeSymbol("?DEFINING-COLL"), makeSymbol("?THING"))), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?FILLER"), makeSymbol("?THING")), list(reader_make_constant_shell(makeString("equals")), makeSymbol("?DEFINING-PRED"), reader_make_constant_shell(makeString("relationAllInstance"))), list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("quotedIsa")), makeSymbol("?ROLE"), reader_make_constant_shell(makeString("FormulaTemplateConstant-FactEntryTool")))));

    private static final SubLString $str454$_A = makeString("~A");



    private static final SubLSymbol WNI_SORT_KEY_1 = makeSymbol("WNI-SORT-KEY-1");

    private static final SubLSymbol WNI_CLEAR_FUNCTION_CACHES = makeSymbol("WNI-CLEAR-FUNCTION-CACHES");

    private static final SubLString $str458$in_workflow_ = makeString("in-workflow?");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLString $str460$unmapped_hypernym_chain = makeString("unmapped-hypernym-chain");

    public static SubLObject initialize_wordnet_import_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $wordnet_import_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_wordnet_import_kb_loaded();
        } else {
            kb_control_vars.unset_wordnet_import_kb_loaded();
        }
        return kb_control_vars.wordnet_import_kb_loaded_p();
    }

    public static SubLObject clear_wni_unranked_synsets_for_english_word_string() {
        final SubLObject cs = $wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_unranked_synsets_for_english_word_string(final SubLObject word_string) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue(), list(word_string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_unranked_synsets_for_english_word_string_internal(final SubLObject word_string) {
        assert NIL != stringp(word_string) : "Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) " + word_string;
        SubLObject synsets = NIL;
        final SubLObject sentence = list($$wnSynsetMemberWord, $sym7$_SYNSET, list($$WordNetEnglishWordFn, word_string));
        final SubLObject query_properties = $list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            synsets = cons(result.first().rest(), synsets);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return synsets;
    }

    public static SubLObject wni_unranked_synsets_for_english_word_string(final SubLObject word_string) {
        SubLObject caching_state = $wni_unranked_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING, $wni_unranked_synsets_for_english_word_string_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, word_string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_unranked_synsets_for_english_word_string_internal(word_string)));
            memoization_state.caching_state_put(caching_state, word_string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_wni_synsets_for_english_word_stringXpos() {
        final SubLObject cs = $wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synsets_for_english_word_stringXpos(final SubLObject word_string, final SubLObject speech_part) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue(), list(word_string, speech_part), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synsets_for_english_word_stringXpos_internal(final SubLObject word_string, final SubLObject speech_part) {
        assert NIL != stringp(word_string) : "Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) " + word_string;
        SubLObject synsets = NIL;
        final SubLObject pos = Strings.string_downcase(list_utilities.alist_lookup_without_values($wni_1_char_pos_map$.getGlobalValue(), speech_part, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject sql_query = cconcatenate($str15$select_synset_id_from_WordSense_w, new SubLObject[]{ word_string, $str16$__and_pos____, pos, $str17$__order_by_word_sense });
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, wni_access_path_server(), $PORT, wni_access_path_proxy_port(), $SUBPROTOCOL, wni_access_path_subprotocol(), $PROXY_SERVER, wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, sql_query, UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    synsets = cons(list($$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var;
        synsets = list_var = nreverse(synsets);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return synsets;
    }

    public static SubLObject wni_synsets_for_english_word_stringXpos(final SubLObject word_string, final SubLObject speech_part) {
        SubLObject caching_state = $wni_synsets_for_english_word_stringXpos_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS, $sym24$_WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS_CACHING_STATE_, TEN_INTEGER, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(word_string, speech_part);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (word_string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && speech_part.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(wni_synsets_for_english_word_stringXpos_internal(word_string, speech_part)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(word_string, speech_part));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_wni_synsets_for_english_word_string() {
        final SubLObject cs = $wni_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synsets_for_english_word_string(final SubLObject word_string) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synsets_for_english_word_string_caching_state$.getGlobalValue(), list(word_string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synsets_for_english_word_string_internal(final SubLObject word_string) {
        assert NIL != stringp(word_string) : "Types.stringp(word_string) " + "CommonSymbols.NIL != Types.stringp(word_string) " + word_string;
        if (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const26$WordNet2_0_KS, UNPROVIDED)) {
            return NIL;
        }
        SubLObject synsets = NIL;
        final SubLObject sql_query = cconcatenate($str15$select_synset_id_from_WordSense_w, new SubLObject[]{ word_string, $str27$__order_by_pos__word_sense });
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, wni_access_path_server(), $PORT, wni_access_path_proxy_port(), $SUBPROTOCOL, wni_access_path_subprotocol(), $PROXY_SERVER, wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, sql_query, UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    synsets = cons(list($$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var;
        synsets = list_var = nreverse(synsets);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return synsets;
    }

    public static SubLObject wni_synsets_for_english_word_string(final SubLObject word_string) {
        SubLObject caching_state = $wni_synsets_for_english_word_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSETS_FOR_ENGLISH_WORD_STRING, $wni_synsets_for_english_word_string_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, word_string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_synsets_for_english_word_string_internal(word_string)));
            memoization_state.caching_state_put(caching_state, word_string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_wni_synset_collectionP() {
        final SubLObject cs = $wni_synset_collectionP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synset_collectionP(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_collectionP_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synset_collectionP_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        final SubLObject v_term = wni_synset_term(synset);
        if (NIL != v_term) {
            return fort_types_interface.collectionP(v_term);
        }
        final SubLObject reified_synset = czer_main.canonicalize_term(wni_reifiable_synset(synset), UNPROVIDED);
        if (NIL != nart_handles.nart_p(reified_synset)) {
            return makeBoolean(NIL == isa.isaP(reified_synset, $const30$WordNetSynsetImportStatus_Determi, $$WordNetWorkflowDataStatusMt, UNPROVIDED));
        }
        return T;
    }

    public static SubLObject wni_synset_collectionP(final SubLObject synset) {
        SubLObject caching_state = $wni_synset_collectionP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym29$WNI_SYNSET_COLLECTION_, $sym32$_WNI_SYNSET_COLLECTION__CACHING_STATE_, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_synset_collectionP_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_synset_individuals() {
        final SubLObject list_var;
        final SubLObject individual_synsets = list_var = Mapping.mapcar(WNI_UNREIFIED_SYNSET, isa.instances($const30$WordNetSynsetImportStatus_Determi, $$WordNetWorkflowDataStatusMt, UNPROVIDED));
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return individual_synsets;
    }

    public static SubLObject wni_exclude_situations(final SubLObject synsets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(synsets) : "list_utilities.non_dotted_list_p(synsets) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synsets) " + synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject non_situation_synsets = NIL;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str36$excluding_specs_of___Situation, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(synsets), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = synsets;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL == genls.any_specP($$Situation, wni_hypernym_terms(synset), UNPROVIDED, UNPROVIDED)) {
                        non_situation_synsets = cons(synset, non_situation_synsets);
                    }
                    force_output(UNPROVIDED);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        final SubLObject list_var_$2;
        non_situation_synsets = list_var_$2 = nreverse(non_situation_synsets);
        assert NIL != list_utilities.non_dotted_list_p(list_var_$2) : "list_utilities.non_dotted_list_p(list_var_$2) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var_$2) " + list_var_$2;
        SubLObject cdolist_list_var2 = list_var_$2;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem2) : "narts_high.naut_p(elem2) " + "CommonSymbols.NIL != narts_high.naut_p(elem2) " + elem2;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem2 = cdolist_list_var2.first();
        } 
        return non_situation_synsets;
    }

    public static SubLObject wni_exclude_relations(final SubLObject synsets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(synsets) : "list_utilities.non_dotted_list_p(synsets) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synsets) " + synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject non_relation_synsets = NIL;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str40$excluding_specs_of___Relation, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(synsets), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = synsets;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL == genls.any_specP($$Relation, wni_hypernym_terms(synset), UNPROVIDED, UNPROVIDED)) {
                        non_relation_synsets = cons(synset, non_relation_synsets);
                    }
                    force_output(UNPROVIDED);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        final SubLObject list_var_$4;
        non_relation_synsets = list_var_$4 = nreverse(non_relation_synsets);
        assert NIL != list_utilities.non_dotted_list_p(list_var_$4) : "list_utilities.non_dotted_list_p(list_var_$4) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var_$4) " + list_var_$4;
        SubLObject cdolist_list_var2 = list_var_$4;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem2) : "narts_high.naut_p(elem2) " + "CommonSymbols.NIL != narts_high.naut_p(elem2) " + elem2;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem2 = cdolist_list_var2.first();
        } 
        return non_relation_synsets;
    }

    public static SubLObject wni_exclude_skipped(final SubLObject synsets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.non_dotted_list_p(synsets) : "list_utilities.non_dotted_list_p(synsets) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synsets) " + synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject non_skipped_synsets = NIL;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$excluding_skipped_synsets, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(synsets), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = synsets;
                SubLObject synset = NIL;
                synset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL == isa.isaP(wni_reifiable_synset(synset), $$WordNetSynsetImportStatus_Skip, $$WordNetWorkflowCollectorMt, UNPROVIDED)) {
                        non_skipped_synsets = cons(synset, non_skipped_synsets);
                    }
                    force_output(UNPROVIDED);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    synset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        final SubLObject list_var_$6;
        non_skipped_synsets = list_var_$6 = nreverse(non_skipped_synsets);
        assert NIL != list_utilities.non_dotted_list_p(list_var_$6) : "list_utilities.non_dotted_list_p(list_var_$6) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var_$6) " + list_var_$6;
        SubLObject cdolist_list_var2 = list_var_$6;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem2) : "narts_high.naut_p(elem2) " + "CommonSymbols.NIL != narts_high.naut_p(elem2) " + elem2;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem2 = cdolist_list_var2.first();
        } 
        return non_skipped_synsets;
    }

    public static SubLObject wni_synset_id(final SubLObject synset) {
        assert NIL != possibly_naut_p(synset) : "el_utilities.possibly_naut_p(synset) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(synset) " + synset;
        final SubLObject synset_id = second(synset);
        assert NIL != integerp(synset_id) : "Types.integerp(synset_id) " + "CommonSymbols.NIL != Types.integerp(synset_id) " + synset_id;
        return synset_id;
    }

    public static SubLObject wni_synset_words(final SubLObject synset) {
        return wni_synset_words_helper(wni_ensure_naut(synset));
    }

    public static SubLObject wni_synsets_equal(final SubLObject synset_1, final SubLObject synset_2) {
        return equal(wni_ensure_naut(synset_1), wni_ensure_naut(synset_2));
    }

    public static SubLObject clear_wni_synset_words_helper() {
        final SubLObject cs = $wni_synset_words_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synset_words_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_words_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synset_words_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject words_and_indices = NIL;
        SubLObject words = NIL;
        final SubLObject sentence = list($$thereExists, $sym52$_POS, list($$thereExists, $sym53$_SENSE, listS($$wnSynsetWord, synset, $list55)));
        final SubLObject query_properties = $list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            words_and_indices = cons(list(result.first().rest(), second(result).rest()), words_and_indices);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        cdolist_list_var = Sort.sort(words_and_indices, symbol_function($sym56$_), symbol_function(SECOND));
        SubLObject word_and_index = NIL;
        word_and_index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            words = cons(word_and_index.first(), words);
            cdolist_list_var = cdolist_list_var.rest();
            word_and_index = cdolist_list_var.first();
        } 
        final SubLObject list_var;
        words = list_var = nreverse(words);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return words;
    }

    public static SubLObject wni_synset_words_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_synset_words_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_WORDS_HELPER, $wni_synset_words_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_synset_words_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_synset_example_phrases(final SubLObject synset) {
        return wni_synset_example_phrases_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_synset_example_phrases_helper() {
        final SubLObject cs = $wni_synset_example_phrases_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synset_example_phrases_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_example_phrases_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synset_example_phrases_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject example_phrases_and_indices = NIL;
        SubLObject example_phrases = NIL;
        final SubLObject sentence = listS($$wnSynsetExamplePhraseWithPosition, synset, $list62);
        final SubLObject query_properties = $list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            example_phrases_and_indices = cons(list(result.first().rest(), second(result).rest()), example_phrases_and_indices);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        cdolist_list_var = Sort.sort(example_phrases_and_indices, symbol_function($sym56$_), symbol_function(FIRST));
        SubLObject example_phrase_and_index = NIL;
        example_phrase_and_index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            example_phrases = cons(second(example_phrase_and_index), example_phrases);
            cdolist_list_var = cdolist_list_var.rest();
            example_phrase_and_index = cdolist_list_var.first();
        } 
        final SubLObject list_var;
        example_phrases = list_var = nreverse(example_phrases);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return example_phrases;
    }

    public static SubLObject wni_synset_example_phrases_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_synset_example_phrases_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_EXAMPLE_PHRASES_HELPER, $wni_synset_example_phrases_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_synset_example_phrases_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_most_general_synset_verb_frame(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        final SubLObject verb_frames = wni_synset_verb_frames(synset);
        SubLObject most_general_verb_frame_score = NIL;
        SubLObject most_general_verb_frame = NIL;
        if (NIL == verb_frames) {
            return NIL;
        }
        SubLObject cdolist_list_var = verb_frames;
        SubLObject verb_frame = NIL;
        verb_frame = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject verb_frame_score = list_utilities.alist_lookup_without_values($wni_verb_frame_generalities$.getGlobalValue(), verb_frame, symbol_function(EQL), $wni_least_general_frame_generality_score$.getGlobalValue());
            if ((NIL == most_general_verb_frame) || verb_frame_score.numL(most_general_verb_frame_score)) {
                most_general_verb_frame = verb_frame;
                most_general_verb_frame_score = verb_frame_score;
            }
            cdolist_list_var = cdolist_list_var.rest();
            verb_frame = cdolist_list_var.first();
        } 
        if (((NIL != most_general_verb_frame) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(most_general_verb_frame))) {
            throw new AssertionError(most_general_verb_frame);
        }
        return most_general_verb_frame;
    }

    public static SubLObject wni_synset_verb_frames(final SubLObject synset) {
        return wni_synset_verb_frames_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_synset_verb_frames_helper() {
        final SubLObject cs = $wni_synset_verb_frames_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synset_verb_frames_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_verb_frames_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synset_verb_frames_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        final SubLObject sentence = listS($$wnSynsetVerbFrame, synset, $list71);
        final SubLObject query_properties = $list72;
        final SubLObject query_result = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject verb_frames = NIL;
        SubLObject cdolist_list_var = query_result;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != forts.fort_p(binding)) {
                verb_frames = cons(binding, verb_frames);
            } else
                if (NIL != possibly_naut_p(binding)) {
                    SubLObject cdolist_list_var_$7 = sksi_kb_accessors.cyc_terms_for_sksi_external_term_naut(binding);
                    SubLObject v_term = NIL;
                    v_term = cdolist_list_var_$7.first();
                    while (NIL != cdolist_list_var_$7) {
                        if (NIL != forts.fort_p(v_term)) {
                            verb_frames = cons(v_term, verb_frames);
                        }
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        v_term = cdolist_list_var_$7.first();
                    } 
                }

            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        final SubLObject list_var = verb_frames;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return verb_frames;
    }

    public static SubLObject wni_synset_verb_frames_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_synset_verb_frames_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_VERB_FRAMES_HELPER, $wni_synset_verb_frames_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_synset_verb_frames_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_wni_verb_frames_for_word() {
        final SubLObject cs = $wni_verb_frames_for_word_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_verb_frames_for_word(final SubLObject verb) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_verb_frames_for_word_caching_state$.getGlobalValue(), list(verb), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_verb_frames_for_word_internal(final SubLObject verb) {
        assert NIL != stringp(verb) : "Types.stringp(verb) " + "CommonSymbols.NIL != Types.stringp(verb) " + verb;
        SubLObject verb_frames = NIL;
        final SubLObject sentence = listS($$wnSynsetVerbFrame, list($$WordNetEnglishWordFn, verb), $list71);
        final SubLObject query_properties = $list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            verb_frames = cons(result.first().rest(), verb_frames);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = verb_frames;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return verb_frames;
    }

    public static SubLObject wni_verb_frames_for_word(final SubLObject verb) {
        SubLObject caching_state = $wni_verb_frames_for_word_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_VERB_FRAMES_FOR_WORD, $wni_verb_frames_for_word_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, verb, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_verb_frames_for_word_internal(verb)));
            memoization_state.caching_state_put(caching_state, verb, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_hypernyms(final SubLObject synset) {
        return wni_hypernyms_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_hypernyms_helper() {
        final SubLObject cs = $wni_hypernyms_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_hypernyms_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_hypernyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_hypernyms_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject hypernyms = NIL;
        final SubLObject sentence = listS($$wnHypernym, synset, $list80);
        final SubLObject query_properties = $list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hypernyms = cons(wni_ensure_naut(result.first().rest()), hypernyms);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = hypernyms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return hypernyms;
    }

    public static SubLObject wni_hypernyms_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_hypernyms_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_HYPERNYMS_HELPER, $wni_hypernyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_hypernyms_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_all_hypernyms(final SubLObject synset) {
        return wni_all_hypernyms_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_all_hypernyms_helper() {
        final SubLObject cs = $wni_all_hypernyms_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_all_hypernyms_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_all_hypernyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_all_hypernyms_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject all_hypernyms = NIL;
        for (SubLObject hypernym = NIL, synsets_stack = wni_hypernyms(synset); NIL != synsets_stack; synsets_stack = append(synsets_stack, wni_hypernyms(hypernym))) {
            hypernym = synsets_stack.first();
            synsets_stack = synsets_stack.rest();
            final SubLObject item_var = hypernym;
            if (NIL == member(item_var, all_hypernyms, symbol_function(EQL), symbol_function(IDENTITY))) {
                all_hypernyms = cons(item_var, all_hypernyms);
            }
        }
        final SubLObject list_var = all_hypernyms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return all_hypernyms;
    }

    public static SubLObject wni_all_hypernyms_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_all_hypernyms_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_ALL_HYPERNYMS_HELPER, $wni_all_hypernyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_all_hypernyms_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_all_hypernymP(final SubLObject synset, final SubLObject hypernym) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != narts_high.naut_p(hypernym) : "narts_high.naut_p(hypernym) " + "CommonSymbols.NIL != narts_high.naut_p(hypernym) " + hypernym;
        for (SubLObject temp_hypernym = NIL, synsets_stack = wni_hypernyms(synset); NIL != synsets_stack; synsets_stack = append(synsets_stack, wni_hypernyms(temp_hypernym))) {
            temp_hypernym = synsets_stack.first();
            synsets_stack = synsets_stack.rest();
            if (wni_ensure_naut(temp_hypernym).equal(wni_ensure_naut(hypernym))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject wni_hyponyms(final SubLObject synset) {
        return wni_hyponyms_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_hyponyms_helper() {
        final SubLObject cs = $wni_hyponyms_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_hyponyms_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_hyponyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_hyponyms_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject hyponyms = NIL;
        final SubLObject sentence = list($$wnHypernym, $sym88$_HYPONYM_SYNSET, synset);
        final SubLObject query_properties = $list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hyponyms = cons(wni_ensure_naut(result.first().rest()), hyponyms);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = hyponyms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return hyponyms;
    }

    public static SubLObject wni_hyponyms_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_hyponyms_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_HYPONYMS_HELPER, $wni_hyponyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_hyponyms_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_all_hyponyms(final SubLObject synset) {
        return wni_all_hyponyms_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_all_hyponyms_helper() {
        final SubLObject cs = $wni_all_hyponyms_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_all_hyponyms_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_all_hyponyms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_all_hyponyms_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject all_hyponyms = NIL;
        for (SubLObject hyponym = NIL, synsets_stack = wni_hyponyms(synset); NIL != synsets_stack; synsets_stack = append(synsets_stack, wni_hyponyms(hyponym))) {
            hyponym = synsets_stack.first();
            synsets_stack = synsets_stack.rest();
            final SubLObject item_var = hyponym;
            if (NIL == member(item_var, all_hyponyms, symbol_function(EQL), symbol_function(IDENTITY))) {
                all_hyponyms = cons(item_var, all_hyponyms);
            }
        }
        final SubLObject list_var = all_hyponyms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return all_hyponyms;
    }

    public static SubLObject wni_all_hyponyms_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_all_hyponyms_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_ALL_HYPONYMS_HELPER, $wni_all_hyponyms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_all_hyponyms_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_any_hyponym_an_individual(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject cdolist_list_var;
        final SubLObject hyponyms = cdolist_list_var = wni_hyponyms(synset);
        SubLObject hyponym = NIL;
        hyponym = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == wni_synset_collectionP(hyponym)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            hyponym = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject wni_verb_is_derived_from_situation_nounP(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject cdolist_list_var;
        final SubLObject derived_forms = cdolist_list_var = wni_derived_forms(synset);
        SubLObject derived_form = NIL;
        derived_form = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($$Noun.eql(wni_synset_pos(derived_form)) && (NIL != genls.any_specP($$Situation, wni_hypernym_terms(derived_form), UNPROVIDED, UNPROVIDED))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            derived_form = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject wni_derived_forms(final SubLObject synset) {
        return wni_derived_forms_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_derived_forms_helper() {
        final SubLObject cs = $wni_derived_forms_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_derived_forms_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_derived_forms_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_derived_forms_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        final SubLObject sql_query = cconcatenate($str98$SELECT_DISTINCT_synsetpointer_syn, new SubLObject[]{ string_utilities.to_string(wni_synset_id(synset)), $str99$_AND____________________synsetpoi });
        SubLObject synsets = NIL;
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, wni_access_path_server(), $PORT, wni_access_path_proxy_port(), $SUBPROTOCOL, wni_access_path_subprotocol(), $PROXY_SERVER, wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, sql_query, UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    synsets = cons(list($$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return synsets;
    }

    public static SubLObject wni_derived_forms_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_derived_forms_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_DERIVED_FORMS_HELPER, $wni_derived_forms_helper_caching_state$, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_derived_forms_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_synset_gloss(final SubLObject synset) {
        return wni_synset_gloss_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_synset_gloss_helper() {
        final SubLObject cs = $wni_synset_gloss_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synset_gloss_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_gloss_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synset_gloss_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject gloss = NIL;
        final SubLObject sentence = listS($$wnSynsetGloss, synset, $list104);
        final SubLObject query_properties = $list105;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        gloss = results.first();
        if (((NIL != gloss) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(gloss))) {
            throw new AssertionError(gloss);
        }
        return gloss;
    }

    public static SubLObject wni_synset_gloss_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_synset_gloss_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_GLOSS_HELPER, $wni_synset_gloss_helper_caching_state$, TEN_INTEGER, EQUALP, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_synset_gloss_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_synset_pos(final SubLObject synset) {
        return wni_synset_pos_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_synset_pos_helper() {
        final SubLObject cs = $wni_synset_pos_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synset_pos_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_pos_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synset_pos_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject pos = NIL;
        final SubLObject sentence = listS($$wnSynsetSpeechPart, synset, $list110);
        final SubLObject query_properties = $list111;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        pos = results.first();
        if (((NIL != pos) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(pos))) {
            throw new AssertionError(pos);
        }
        return pos;
    }

    public static SubLObject wni_synset_pos_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_synset_pos_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_POS_HELPER, $wni_synset_pos_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_synset_pos_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_synset_speech_part_offset(final SubLObject synset) {
        return wni_synset_speech_part_offset_helper(cycl_utilities.nat_functor(synset), wni_synset_id(synset));
    }

    public static SubLObject clear_wni_synset_speech_part_offset_helper() {
        final SubLObject cs = $wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synset_speech_part_offset_helper(final SubLObject functor, final SubLObject synset_id) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue(), list(functor, synset_id), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synset_speech_part_offset_helper_internal(final SubLObject functor, final SubLObject synset_id) {
        assert NIL != forts.fort_p(functor) : "forts.fort_p(functor) " + "CommonSymbols.NIL != forts.fort_p(functor) " + functor;
        assert NIL != subl_promotions.positive_integer_p(synset_id) : "subl_promotions.positive_integer_p(synset_id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(synset_id) " + synset_id;
        final SubLObject synset = make_unary_formula(functor, synset_id);
        final SubLObject sentence = listS($$wnSynsetSpeechPartOffset, synset, $list117);
        final SubLObject query_properties = $list118;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject speech_part_offset = NIL;
        speech_part_offset = results.first();
        if ((NIL == speech_part_offset) && (NIL == inference_datastructures_problem_store.problem_store_p(wni_problem_store()))) {
            sleep(FIVE_INTEGER);
            speech_part_offset = wni_synset_speech_part_offset(synset);
        }
        assert NIL != stringp(speech_part_offset) : "Types.stringp(speech_part_offset) " + "CommonSymbols.NIL != Types.stringp(speech_part_offset) " + speech_part_offset;
        return speech_part_offset;
    }

    public static SubLObject wni_synset_speech_part_offset_helper(final SubLObject functor, final SubLObject synset_id) {
        SubLObject caching_state = $wni_synset_speech_part_offset_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_SPEECH_PART_OFFSET_HELPER, $wni_synset_speech_part_offset_helper_caching_state$, $int$256, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(functor, synset_id);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (functor.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && synset_id.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(wni_synset_speech_part_offset_helper_internal(functor, synset_id)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(functor, synset_id));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject wni_hypernym_terms(final SubLObject synset) {
        assert NIL != possibly_naut_p(synset) : "el_utilities.possibly_naut_p(synset) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(synset) " + synset;
        SubLObject hypernym_terms = NIL;
        SubLObject hypernym_term = NIL;
        SubLObject cdolist_list_var;
        final SubLObject hypernyms = cdolist_list_var = wni_hypernyms(synset);
        SubLObject hypernym = NIL;
        hypernym = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hypernym_term = wni_synset_term(hypernym);
            if ((NIL != hypernym_term) && (NIL != fort_types_interface.collectionP(hypernym_term))) {
                hypernym_terms = cons(hypernym_term, hypernym_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hypernym = cdolist_list_var.first();
        } 
        final SubLObject list_var = hypernym_terms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return hypernym_terms;
    }

    public static SubLObject wni_hypernym_mappedP(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        return list_utilities.sublisp_boolean(wni_hypernym_terms(synset));
    }

    public static SubLObject wni_synset_term(final SubLObject synset) {
        return wni_synset_term_helper(cycl_utilities.nat_functor(synset), wni_synset_id(synset));
    }

    public static SubLObject clear_wni_synset_term_helper() {
        final SubLObject cs = $wni_synset_term_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synset_term_helper(final SubLObject functor, final SubLObject id) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_term_helper_caching_state$.getGlobalValue(), list(functor, id), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synset_term_helper_internal(final SubLObject functor, final SubLObject id) {
        assert NIL != indexed_term_p(functor) : "kb_indexing_datastructures.indexed_term_p(functor) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(functor) " + functor;
        assert NIL != subl_promotions.positive_integer_p(id) : "subl_promotions.positive_integer_p(id) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(id) " + id;
        final SubLObject speech_part_offset = wni_synset_speech_part_offset_helper(functor, id);
        final SubLObject sentence = list($$synonymousExternalConcept, $sym127$_TERM, $const128$WordNet_Version2_0, speech_part_offset);
        final SubLObject query_properties = $list129;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject v_term = results.first();
        if (NIL == forts.fort_p(v_term)) {
            v_term = NIL;
        }
        if (((NIL != v_term) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(v_term))) {
            throw new AssertionError(v_term);
        }
        return v_term;
    }

    public static SubLObject wni_synset_term_helper(final SubLObject functor, final SubLObject id) {
        SubLObject caching_state = $wni_synset_term_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSET_TERM_HELPER, $wni_synset_term_helper_caching_state$, $int$1000, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(functor, id);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (functor.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && id.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(wni_synset_term_helper_internal(functor, id)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(functor, id));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject wni_unmapped_hypernym_chain(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject unmapped_hypernym_chain = list(synset);
        SubLObject hypernym = wni_ensure_naut(synset);
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            hypernym = wni_hypernyms(hypernym).first();
            if (NIL != hypernym) {
                if (NIL != wni_synset_term(hypernym)) {
                    doneP = T;
                } else {
                    unmapped_hypernym_chain = cons(hypernym, unmapped_hypernym_chain);
                }
            } else {
                doneP = T;
            }
        } 
        final SubLObject list_var = unmapped_hypernym_chain;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return unmapped_hypernym_chain;
    }

    public static SubLObject wni_synset_wXo_links(final SubLObject synset) {
        return wni_synset_wXo_links_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_synset_wXo_links_helper() {
        final SubLObject cs = $wni_synset_wXo_links_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synset_wXo_links_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synset_wXo_links_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synset_wXo_links_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        final SubLObject words = wni_synset_words(synset);
        SubLObject first_wordP = T;
        SubLObject string = NIL;
        string = $str134$_;
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != first_wordP) {
                first_wordP = NIL;
            } else {
                string = cconcatenate(string, $str135$___);
            }
            string = cconcatenate(string, word);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        string = cconcatenate(string, $str136$_);
        return string;
    }

    public static SubLObject wni_synset_wXo_links_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_synset_wXo_links_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym133$WNI_SYNSET_W_O_LINKS_HELPER, $sym137$_WNI_SYNSET_W_O_LINKS_HELPER_CACHING_STATE_, $int$100, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_synset_wXo_links_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_synset_is_causerP(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        return list_utilities.sublisp_boolean(wni_synsets_caused_by(synset));
    }

    public static SubLObject wni_synsets_caused_by(final SubLObject synset) {
        return wni_synsets_caused_by_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_synsets_caused_by_helper() {
        final SubLObject cs = $wni_synsets_caused_by_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synsets_caused_by_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synsets_caused_by_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synsets_caused_by_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject caused_synsets = NIL;
        SubLObject caused_synset = NIL;
        final SubLObject sentence = listS($$wnCause, synset, $list143);
        final SubLObject query_properties = $list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            caused_synset = result.first().rest();
            if (!caused_synset.equal(synset)) {
                caused_synsets = cons(caused_synset, caused_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = caused_synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return caused_synsets;
    }

    public static SubLObject wni_synsets_caused_by_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_synsets_caused_by_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSETS_CAUSED_BY_HELPER, $wni_synsets_caused_by_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_synsets_caused_by_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_synset_is_caused_byP(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        return list_utilities.sublisp_boolean(wni_synsets_caused_by(synset));
    }

    public static SubLObject wni_synsets_causing(final SubLObject synset) {
        return wni_synsets_causing_helper(wni_ensure_naut(synset));
    }

    public static SubLObject clear_wni_synsets_causing_helper() {
        final SubLObject cs = $wni_synsets_causing_helper_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_synsets_causing_helper(final SubLObject synset) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_synsets_causing_helper_caching_state$.getGlobalValue(), list(synset), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_synsets_causing_helper_internal(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject causing_synsets = NIL;
        SubLObject causing_synset = NIL;
        final SubLObject sentence = list($$wnCause, $sym148$_CAUSING_SYNSET, synset);
        final SubLObject query_properties = $list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            causing_synset = result.first().rest();
            if (!causing_synset.equal(synset)) {
                causing_synsets = cons(causing_synset, causing_synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = causing_synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return causing_synsets;
    }

    public static SubLObject wni_synsets_causing_helper(final SubLObject synset) {
        SubLObject caching_state = $wni_synsets_causing_helper_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_SYNSETS_CAUSING_HELPER, $wni_synsets_causing_helper_caching_state$, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, synset, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_synsets_causing_helper_internal(synset)));
            memoization_state.caching_state_put(caching_state, synset, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_urban_area_geographical_entity(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject gloss_words = string_utilities.split_string(wni_synset_gloss(synset), UNPROVIDED);
        SubLObject gloss_word = NIL;
        SubLObject ancientP = NIL;
        SubLObject doneP = NIL;
        SubLObject place_name_words = NIL;
        SubLObject place_name = NIL;
        SubLObject place_name_denotations = NIL;
        SubLObject place_name_denotation = NIL;
        while (NIL == doneP) {
            if (NIL == gloss_words) {
                return NIL;
            }
            gloss_word = gloss_words.first();
            gloss_words = gloss_words.rest();
            if (NIL != Strings.stringE(gloss_word, $$$ancient, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                ancientP = T;
            } else
                if ((NIL != ancientP) && (NIL != Strings.stringE(gloss_word, $$$Greek, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    ancientP = NIL;
                } else {
                    ancientP = NIL;
                    if (NIL != upper_case_p(string_utilities.first_char(gloss_word))) {
                        place_name_words = cons(gloss_word, place_name_words);
                    } else {
                        if (NIL == place_name_words) {
                            continue;
                        }
                        place_name = string_utilities.join_strings(reverse(place_name_words), $$$_);
                        if ((((((((((((((NIL != string_utilities.starts_with(place_name, $$$Atlantic)) || (NIL != string_utilities.starts_with(place_name, $$$Pacific))) || (NIL != string_utilities.starts_with(place_name, $$$Crown_Colony))) || (NIL != string_utilities.starts_with(place_name, $$$Caribbean))) || (NIL != string_utilities.starts_with(place_name, $$$State))) || (NIL != string_utilities.starts_with(place_name, $$$Lake_Erie))) || (NIL != string_utilities.starts_with(place_name, $$$Asia_Minor))) || (NIL != string_utilities.starts_with(place_name, $$$Elbo_River))) || (NIL != string_utilities.starts_with(place_name, $$$Asian))) || (NIL != string_utilities.starts_with(place_name, $$$Yourba))) || (NIL != string_utilities.starts_with(place_name, $$$Japanese))) || (NIL != string_utilities.starts_with(place_name, $$$Nile))) || (NIL != string_utilities.starts_with(place_name, $$$River_Thames))) || (NIL != string_utilities.starts_with(place_name, $$$River_Aire))) {
                            place_name_words = NIL;
                        } else {
                            doneP = T;
                        }
                    }
                }

        } 
        if (NIL == place_name) {
            return NIL;
        }
        place_name = string_utilities.remove_substring(place_name, $str167$_s);
        place_name_denotations = lexicon_accessors.denots_of_string(place_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        while (NIL != place_name_denotations) {
            place_name_denotation = place_name_denotations.first();
            place_name_denotations = place_name_denotations.rest();
            if ((NIL != isa.isa_in_any_mtP(place_name_denotation, $$GeopoliticalEntity)) && (NIL == isa.isa_in_any_mtP(place_name_denotation, $$City))) {
                return place_name_denotation;
            }
        } 
        return NIL;
    }

    public static SubLObject wni_synsets_having_pos(final SubLObject pos) {
        assert NIL != forts.fort_p(pos) : "forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) " + pos;
        SubLObject synsets = NIL;
        final SubLObject sentence = list($$wnSynsetSpeechPart, $sym7$_SYNSET, pos);
        final SubLObject query_properties = $list9;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject result = NIL;
            result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                synsets = cons(result.first().rest(), synsets);
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            } 
        }
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return synsets;
    }

    public static SubLObject wni_terms_synsets(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        SubLObject speech_part_offsets = NIL;
        SubLObject synset = NIL;
        SubLObject synsets = NIL;
        final SubLObject sentence = listS($$synonymousExternalConcept, v_term, $list172);
        final SubLObject query_properties = $list173;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            SubLObject cdolist_list_var = results;
            SubLObject v_bindings = NIL;
            v_bindings = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                speech_part_offsets = cons(bindings.variable_lookup($sym174$_SPEECH_PART_OFFSET, v_bindings), speech_part_offsets);
                cdolist_list_var = cdolist_list_var.rest();
                v_bindings = cdolist_list_var.first();
            } 
        }
        SubLObject cdolist_list_var = speech_part_offsets;
        SubLObject speech_part_offset = NIL;
        speech_part_offset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            synset = wni_speech_part_offset_to_synset(speech_part_offset);
            if (NIL != synset) {
                synsets = cons(synset, synsets);
            }
            cdolist_list_var = cdolist_list_var.rest();
            speech_part_offset = cdolist_list_var.first();
        } 
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return synsets;
    }

    public static SubLObject clear_wni_broader_terms() {
        final SubLObject cs = $wni_broader_terms_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_broader_terms(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_broader_terms_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_broader_terms_internal(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        SubLObject broader_terms = NIL;
        SubLObject cdolist_list_var = (NIL != fort_types_interface.collectionP(v_term)) ? genls.genls(v_term, $$EverythingPSC, UNPROVIDED) : isa.isa(v_term, $$EverythingPSC, UNPROVIDED);
        SubLObject broader_term = NIL;
        broader_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == isa.isa_in_any_mtP(broader_term, $$CycKBSubsetCollection)) && (NIL != forts.fort_p(broader_term))) {
                broader_terms = cons(broader_term, broader_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            broader_term = cdolist_list_var.first();
        } 
        final SubLObject list_var;
        broader_terms = list_var = genls.min_cols(broader_terms, UNPROVIDED, UNPROVIDED);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return broader_terms;
    }

    public static SubLObject wni_broader_terms(final SubLObject v_term) {
        SubLObject caching_state = $wni_broader_terms_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WNI_BROADER_TERMS, $wni_broader_terms_caching_state$, TEN_INTEGER, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_broader_terms_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_mapped_terms_and_synsets(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(pos) : "forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) " + pos;
        final SubLObject pos_first_char = list_utilities.alist_lookup($wni_1_char_pos_map$.getGlobalValue(), $$Noun, UNPROVIDED, UNPROVIDED);
        SubLObject mapped_terms_and_synsets = NIL;
        final SubLObject list_var;
        final SubLObject mapped_terms_and_pos_offsets = list_var = wni_mapped_terms_and_pos_offsets();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str180$finding_synsets_for_speech_part_o, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject mapped_term_and_pos_offset = NIL;
                mapped_term_and_pos_offset = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject mapped_term = mapped_term_and_pos_offset.first();
                    final SubLObject pos_offset = second(mapped_term_and_pos_offset);
                    if (pos_first_char.equal(string_utilities.first_of_string(pos_offset))) {
                        mapped_terms_and_synsets = cons(list(mapped_term, wni_speech_part_offset_to_synset(pos_offset)), mapped_terms_and_synsets);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    mapped_term_and_pos_offset = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        final SubLObject list_var_$9 = mapped_terms_and_synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var_$9) : "list_utilities.non_dotted_list_p(list_var_$9) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var_$9) " + list_var_$9;
        SubLObject cdolist_list_var = list_var_$9;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != listp(elem) : "Types.listp(elem) " + "CommonSymbols.NIL != Types.listp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return mapped_terms_and_synsets;
    }

    public static SubLObject wni_synset_hypernyms_mappedP(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        final SubLObject hypernyms = wni_hypernyms(synset);
        SubLObject v_term = NIL;
        if (NIL != hypernyms) {
            SubLObject cdolist_list_var = hypernyms;
            SubLObject hypernym = NIL;
            hypernym = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                v_term = wni_synset_term(hypernym);
                if ((NIL == v_term) || (NIL != fort_types_interface.predicateP(v_term))) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                hypernym = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static SubLObject wni_mapped_terms() {
        SubLObject mapped_terms = NIL;
        SubLObject mapped_term = NIL;
        final SubLObject sentence = $list184;
        final SubLObject query_properties = $list173;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, $$WordNetMappingMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mapped_term = result.first().rest();
            if (NIL != forts.fort_p(mapped_term)) {
                mapped_terms = cons(mapped_term, mapped_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = mapped_terms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return mapped_terms;
    }

    public static SubLObject wni_mapped_terms_and_pos_offsets() {
        SubLObject value_pairs = NIL;
        final SubLObject sentence = $list187;
        final SubLObject query_properties = $list173;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, $$WordNetMappingMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            value_pairs = cons(list(result.first().rest(), second(result).rest()), value_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = value_pairs;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != listp(elem) : "Types.listp(elem) " + "CommonSymbols.NIL != Types.listp(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return value_pairs;
    }

    public static SubLObject wni_speech_part_offset_to_synset(final SubLObject pos_offset) {
        assert NIL != stringp(pos_offset) : "Types.stringp(pos_offset) " + "CommonSymbols.NIL != Types.stringp(pos_offset) " + pos_offset;
        SubLObject synset = NIL;
        final SubLObject sentence = list($$wnSynsetSpeechPartOffset, $sym7$_SYNSET, pos_offset);
        final SubLObject query_properties = $list189;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            synset = results.first().first().rest();
        }
        if (((NIL != synset) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == narts_high.naut_p(synset))) {
            throw new AssertionError(synset);
        }
        return synset;
    }

    public static SubLObject wni_update_synset_with_term(final SubLObject synset, final SubLObject v_term) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        final SubLObject sql_connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ wni_access_path_server(), $PORT, wni_access_path_proxy_port(), $SUBPROTOCOL, wni_access_path_subprotocol(), $PROXY_SERVER, wni_access_path_proxy_server(), $list191 }));
        final SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
        final SubLObject sql_update = format(NIL, $str192$update_Synset_set_cyc_term_____A_, v_term, wni_synset_id(synset));
        sdbc.sqls_execute_update(sql_statement, sql_update);
        sdbc.sqls_close(sql_statement);
        sdbc.sqlc_close(sql_connection);
        return NIL;
    }

    public static SubLObject wni_insert_concept_match_html(final SubLObject synset, final SubLObject html_string) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != stringp(html_string) : "Types.stringp(html_string) " + "CommonSymbols.NIL != Types.stringp(html_string) " + html_string;
        final SubLObject cyc_image_id = cyc_image_id();
        final SubLObject sql_connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ wni_access_path_server(), $PORT, wni_access_path_proxy_port(), $SUBPROTOCOL, wni_access_path_subprotocol(), $PROXY_SERVER, wni_access_path_proxy_server(), $list191 }));
        final SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
        final SubLObject sql_delete = format(NIL, $str194$delete_from_ConceptMatchHTML_wher, wni_synset_id(synset), cyc_image_id);
        final SubLObject sql_insert = format(NIL, $str195$insert_into_ConceptMatchHTML_valu, new SubLObject[]{ wni_synset_id(synset), string_utilities.string_substitute($str196$__, $str197$_, html_string, UNPROVIDED), cyc_image_id });
        sdbc.sqls_execute_update(sql_statement, sql_delete);
        sdbc.sqls_execute_update(sql_statement, sql_insert);
        sdbc.sqls_close(sql_statement);
        sdbc.sqlc_close(sql_connection);
        return NIL;
    }

    public static SubLObject wni_select_concept_match_html(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        final SubLObject sql_connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ wni_access_path_server(), $PORT, wni_access_path_proxy_port(), $SUBPROTOCOL, wni_access_path_subprotocol(), $PROXY_SERVER, wni_access_path_proxy_server(), $list191 }));
        final SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
        final SubLObject sql_query = format(NIL, $str199$select_html_from_ConceptMatchHTML, wni_synset_id(synset), cyc_image_id());
        final SubLObject sql_result_set = sdbc.sqls_execute_query(sql_statement, sql_query, UNPROVIDED);
        SubLObject html_string = NIL;
        if (NIL != sdbc.sqlrs_emptyP(sql_result_set)) {
            sdbc.sqls_close(sql_statement);
            sdbc.sqlc_close(sql_connection);
            return NIL;
        }
        sdbc.sqlrs_next(sql_result_set);
        html_string = sdbc.sqlrs_get_object(sql_result_set, ONE_INTEGER);
        sdbc.sqls_close(sql_statement);
        sdbc.sqlc_close(sql_connection);
        assert NIL != stringp(html_string) : "Types.stringp(html_string) " + "CommonSymbols.NIL != Types.stringp(html_string) " + html_string;
        return html_string;
    }

    public static SubLObject wni_delete_concept_match_html(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        final SubLObject sql_connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ wni_access_path_server(), $PORT, wni_access_path_proxy_port(), $SUBPROTOCOL, wni_access_path_subprotocol(), $PROXY_SERVER, wni_access_path_proxy_server(), $list191 }));
        final SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
        final SubLObject sql_delete = format(NIL, $str194$delete_from_ConceptMatchHTML_wher, wni_synset_id(synset), cyc_image_id());
        sdbc.sqls_execute_update(sql_statement, sql_delete);
        sdbc.sqls_close(sql_statement);
        sdbc.sqlc_close(sql_connection);
        return NIL;
    }

    public static SubLObject wni_delete_all_concept_match_html() {
        final SubLObject sql_connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), listS($DBMS_SERVER, new SubLObject[]{ wni_access_path_server(), $PORT, wni_access_path_proxy_port(), $SUBPROTOCOL, wni_access_path_subprotocol(), $PROXY_SERVER, wni_access_path_proxy_server(), $list191 }));
        final SubLObject sql_statement = sdbc.sqlc_create_statement(sql_connection);
        final SubLObject sql_delete = format(NIL, $str202$delete_from_ConceptMatchHTML_wher, cyc_image_id());
        sdbc.sqls_execute_update(sql_statement, sql_delete);
        sdbc.sqls_close(sql_statement);
        sdbc.sqlc_close(sql_connection);
        return NIL;
    }

    public static SubLObject wni_unmapped_synsets_having_mapped_hypernym(final SubLObject speech_part) {
        assert NIL != forts.fort_p(speech_part) : "forts.fort_p(speech_part) " + "CommonSymbols.NIL != forts.fort_p(speech_part) " + speech_part;
        SubLObject synsets = NIL;
        final SubLObject pos = Strings.string_downcase(list_utilities.alist_lookup_without_values($wni_1_char_pos_map$.getGlobalValue(), speech_part, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject sql_query = cconcatenate($str204$select_Synset_synset_id__________, new SubLObject[]{ pos, $str205$__and____________________Synset_c });
        SubLObject rs = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = sdbc.new_sql_connection(wni_access_path_db(), wni_access_path_user(), wni_access_path_password(), list(new SubLObject[]{ $DBMS_SERVER, wni_access_path_server(), $PORT, wni_access_path_proxy_port(), $SUBPROTOCOL, wni_access_path_subprotocol(), $PROXY_SERVER, wni_access_path_proxy_server(), $TIMEOUT, THREE_INTEGER }));
            if (NIL != sdbc.sql_open_connection_p(connection)) {
                statement = sdbc.sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sdbc.sql_open_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, sql_query, UNPROVIDED);
            } else {
                rs = statement;
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                while (NIL != sdbc.sqlrs_next(rs)) {
                    synsets = cons(list($$WordNetSynsetFn, sdbc.sqlrs_get_object(rs, ONE_INTEGER)), synsets);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return synsets;
    }

    public static SubLObject wni_trace_new_cyc_query(final SubLObject sentence, final SubLObject mt, SubLObject query_properties) {
        assert NIL != listp(sentence) : "Types.listp(sentence) " + "CommonSymbols.NIL != Types.listp(sentence) " + sentence;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmt_p(mt))) {
            throw new AssertionError(mt);
        }
        final SubLObject plist_var = query_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        if ((NIL != inference_datastructures_problem_store.valid_problem_store_p(wni_problem_store())) && (NIL == list_utilities.plist_has_keyP(query_properties, $PROBLEM_STORE))) {
            query_properties = putf(copy_list(query_properties), $PROBLEM_STORE, wni_problem_store());
        }
        SubLObject results = NIL;
        results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        assert NIL != listp(results) : "Types.listp(results) " + "CommonSymbols.NIL != Types.listp(results) " + results;
        return results;
    }

    public static SubLObject wni_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_problem_store.problem_store_p($wni_problem_store$.getDynamicValue(thread))) {
            if (NIL == inference_datastructures_problem_store.valid_problem_store_p($wni_problem_store$.getDynamicValue(thread))) {
                Errors.warn($str210$Destroying_invalid_WordNet_Import);
                inference_datastructures_problem_store.destroy_problem_store($wni_problem_store$.getDynamicValue(thread));
                $wni_problem_store$.setDynamicValue(new_wni_problem_store(), thread);
            } else
                if (inference_datastructures_problem_store.problem_store_problem_count($wni_problem_store$.getDynamicValue(thread)).numG(multiply($float$0_9, inference_datastructures_problem_store.problem_store_max_problem_count($wni_problem_store$.getDynamicValue(thread))))) {
                    Errors.warn($str212$Destroying_90___full_WordNet_Impo);
                    inference_datastructures_problem_store.destroy_problem_store($wni_problem_store$.getDynamicValue(thread));
                    $wni_problem_store$.setDynamicValue(new_wni_problem_store(), thread);
                }

        }
        return $wni_problem_store$.getDynamicValue(thread);
    }

    public static SubLObject new_wni_problem_store() {
        return inference_datastructures_problem_store.new_problem_store(wni_problem_store_properties());
    }

    public static SubLObject wni_problem_store_properties() {
        return $list213;
    }

    public static SubLObject wni_unreified_synset(final SubLObject reified_synset) {
        assert NIL != nart_handles.nart_p(reified_synset) : "nart_handles.nart_p(reified_synset) " + "CommonSymbols.NIL != nart_handles.nart_p(reified_synset) " + reified_synset;
        final SubLObject synset = list($$WordNetSynsetFn, cycl_utilities.nat_arg1(reified_synset, UNPROVIDED));
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        return synset;
    }

    public static SubLObject wni_reifiable_synset(final SubLObject synset) {
        assert NIL != possibly_naut_p(synset) : "el_utilities.possibly_naut_p(synset) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(synset) " + synset;
        final SubLObject reifiable_synset = make_unary_formula($$WordNetSynsetReifiedFn, second(synset));
        assert NIL != possibly_naut_p(reifiable_synset) : "el_utilities.possibly_naut_p(reifiable_synset) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(reifiable_synset) " + reifiable_synset;
        return reifiable_synset;
    }

    public static SubLObject wni_reifiable_synset_from_string(final SubLObject synset_id_string) {
        assert NIL != stringp(synset_id_string) : "Types.stringp(synset_id_string) " + "CommonSymbols.NIL != Types.stringp(synset_id_string) " + synset_id_string;
        final SubLObject reifiable_synset = list($$WordNetSynsetReifiedFn, string_utilities.string_to_integer(synset_id_string));
        assert NIL != possibly_naut_p(reifiable_synset) : "el_utilities.possibly_naut_p(reifiable_synset) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(reifiable_synset) " + reifiable_synset;
        return reifiable_synset;
    }

    public static SubLObject wni_synset_from_id_string(final SubLObject synset_id_string) {
        assert NIL != string_utilities.digit_stringP(synset_id_string) : "string_utilities.digit_stringP(synset_id_string) " + "CommonSymbols.NIL != string_utilities.digit_stringP(synset_id_string) " + synset_id_string;
        final SubLObject id = string_utilities.string_to_integer(synset_id_string);
        final SubLObject synset = make_unary_formula($$WordNetSynsetFn, id);
        return synset;
    }

    public static SubLObject wni_ensure_naut(final SubLObject synset) {
        SubLObject synset_consp = synset;
        if ((NIL != nart_handles.nart_p(synset)) || cycl_utilities.nat_functor(synset).eql($$WordNetSynsetReifiedFn)) {
            synset_consp = make_unary_formula($$WordNetSynsetFn, cycl_utilities.nat_arg1(synset, UNPROVIDED));
        }
        assert NIL != possibly_naut_p(synset_consp) : "el_utilities.possibly_naut_p(synset_consp) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(synset_consp) " + synset_consp;
        return synset_consp;
    }

    public static SubLObject wni_next_synset_with_status(final SubLObject status) {
        assert NIL != forts.fort_p(status) : "forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) " + status;
        SubLObject synset = NIL;
        final SubLObject sentence = listS($$and, list($$isa, $sym224$_REIFIED_SYNSET, status), $list225);
        final SubLObject query_properties = $list189;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            synset = wni_unreified_synset(results.first().first().rest());
        }
        if (((NIL != synset) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == narts_high.naut_p(synset))) {
            throw new AssertionError(synset);
        }
        return synset;
    }

    public static SubLObject wni_unlocked_synsets_with_status(final SubLObject status) {
        assert NIL != forts.fort_p(status) : "forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) " + status;
        SubLObject synsets = NIL;
        final SubLObject sentence = listS($$and, list($$isa, $sym224$_REIFIED_SYNSET, status), $list225);
        final SubLObject query_properties = $list9;
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            synsets = cons(wni_unreified_synset(result.first().rest()), synsets);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        final SubLObject list_var = synsets;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return synsets;
    }

    public static SubLObject wni_term_has_verb_semtransP(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        return wni_term_has_verb_semtrans_helperP(v_term);
    }

    public static SubLObject clear_wni_term_has_verb_semtrans_helperP() {
        final SubLObject cs = $wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_wni_term_has_verb_semtrans_helperP(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wni_term_has_verb_semtrans_helperP_internal(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        final SubLObject sentence = list($$thereExists, $sym229$_WORD_UNIT, list($$thereExists, $sym230$_SENSE_NBR, listS($$and, list($$denotation, $sym229$_WORD_UNIT, $$Verb, $sym230$_SENSE_NBR, v_term), list($$unknownSentence, list($$thereExists, $sym234$_FRAME, list($$thereExists, $sym235$_TRANS, listS($$verbSemTrans_Canonical, $sym229$_WORD_UNIT, $sym230$_SENSE_NBR, $sym234$_FRAME, v_term, $list237)))), $list238)));
        final SubLObject query_properties = $list9;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$EverythingPSC, query_properties);
        return makeBoolean(!results.equal($list239));
    }

    public static SubLObject wni_term_has_verb_semtrans_helperP(final SubLObject v_term) {
        SubLObject caching_state = $wni_term_has_verb_semtrans_helperP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_, $sym240$_WNI_TERM_HAS_VERB_SEMTRANS_HELPER__CACHING_STATE_, $int$1000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(wni_term_has_verb_semtrans_helperP_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject wni_gather_terms_for_matching(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject terms = NIL;
        final SubLObject collectionP = wni_synset_collectionP(synset);
        terms = wni_exact_synset_term_matches(synset);
        if (NIL == terms) {
            terms = wni_strong_synset_term_matches(synset, collectionP);
        }
        if (NIL == terms) {
            terms = wni_weak_synset_term_matches(synset, collectionP, UNPROVIDED);
        }
        if (length(terms).numL($wni_maximum_nbr_of_terms_to_gather_for_matching$.getGlobalValue())) {
            SubLObject cdolist_list_var = cb_wordnet_utilities.wni_string_synset_term_matches(synset, collectionP);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (length(terms).numL($wni_maximum_nbr_of_terms_to_gather_for_matching$.getGlobalValue())) {
                    final SubLObject item_var = v_term;
                    if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                        terms = cons(item_var, terms);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        terms = nreverse(terms);
        if (wni_synset_pos(synset).eql($$Verb)) {
            SubLObject situation_terms = NIL;
            SubLObject cdolist_list_var2 = terms;
            SubLObject v_term2 = NIL;
            v_term2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if ((NIL != fort_types_interface.collectionP(v_term2)) && (NIL != genls.genlsP(v_term2, $$Situation, UNPROVIDED, UNPROVIDED))) {
                    situation_terms = cons(v_term2, situation_terms);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                v_term2 = cdolist_list_var2.first();
            } 
            terms = nreverse(situation_terms);
        }
        final SubLObject list_var = terms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return terms;
    }

    public static SubLObject wni_exact_synset_term_matches(final SubLObject synset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject terms = NIL;
        final SubLObject pos = wni_synset_pos(synset);
        final SubLObject synset_collectionP = wni_synset_collectionP(synset);
        final SubLObject synset_words = wni_synset_words(synset);
        final SubLObject hypernym_terms = wni_hypernym_terms(synset);
        if (NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
            format(T, $str243$___A_mapped_hypernyms__A___A__, new SubLObject[]{ synset, hypernym_terms, wni_synset_gloss(synset) });
            force_output(UNPROVIDED);
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject synset_word = NIL;
        synset_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                format(T, $str244$__considering_word____a__, synset_word);
                force_output(UNPROVIDED);
            }
            SubLObject possible_matches = lexicon_accessors.denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (pos.eql($$Verb)) {
                SubLObject possible_situation_matches = NIL;
                SubLObject cdolist_list_var_$10 = possible_matches;
                SubLObject possible_match = NIL;
                possible_match = cdolist_list_var_$10.first();
                while (NIL != cdolist_list_var_$10) {
                    if ((NIL != forts.fort_p(possible_match)) && (NIL != genls.genlsP(possible_match, $$Situation, UNPROVIDED, UNPROVIDED))) {
                        possible_situation_matches = cons(possible_match, possible_situation_matches);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    possible_match = cdolist_list_var_$10.first();
                } 
                possible_matches = possible_situation_matches;
            }
            if (NIL != possible_matches) {
                if (NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                    format(T, $str245$____possible_lexical_matches__A__, possible_matches);
                    force_output(UNPROVIDED);
                }
                SubLObject cdolist_list_var_$11 = possible_matches;
                SubLObject possible_match2 = NIL;
                possible_match2 = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    SubLObject mapped_broader_terms = NIL;
                    final SubLObject generated_phrase = pph_main.generate_phrase(possible_match2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var_$12 = (NIL != synset_collectionP) ? genls.genls(possible_match2, $$EverythingPSC, UNPROVIDED) : isa.isa(possible_match2, $$EverythingPSC, UNPROVIDED);
                    SubLObject mapped_broader_term = NIL;
                    mapped_broader_term = cdolist_list_var_$12.first();
                    while (NIL != cdolist_list_var_$12) {
                        if (NIL == isa.isa_in_any_mtP(mapped_broader_term, $$CycKBSubsetCollection)) {
                            mapped_broader_terms = cons(mapped_broader_term, mapped_broader_terms);
                        }
                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                        mapped_broader_term = cdolist_list_var_$12.first();
                    } 
                    if (NIL != $wni_very_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                        format(T, $str246$____considering_term____a___const, possible_match2, mapped_broader_terms);
                        force_output(UNPROVIDED);
                    }
                    if ((NIL != forts.fort_p(possible_match2)) && fort_types_interface.collectionP(possible_match2).eql(synset_collectionP)) {
                        if (NIL != intersection(hypernym_terms, mapped_broader_terms, UNPROVIDED, UNPROVIDED)) {
                            if (NIL != $wni_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                                format(T, $str247$___A_____A__structure___, synset_word, possible_match2);
                                force_output(UNPROVIDED);
                            }
                            final SubLObject item_var = possible_match2;
                            if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                terms = cons(item_var, terms);
                            }
                        } else
                            if ((NIL != Strings.stringE(generated_phrase, synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == disjoint_with.any_disjoint_with_anyP(hypernym_terms, mapped_broader_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                if (NIL != $wni_verbose_exact_synset_term_matches$.getDynamicValue(thread)) {
                                    format(T, $str248$___A____A__lexicon___, synset_word, possible_match2);
                                    force_output(UNPROVIDED);
                                }
                                final SubLObject item_var = possible_match2;
                                if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    terms = cons(item_var, terms);
                                }
                            }

                    }
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    possible_match2 = cdolist_list_var_$11.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word = cdolist_list_var.first();
        } 
        if (pos.eql($$Verb)) {
            cdolist_list_var = wni_derived_forms(synset);
            SubLObject derivationally_related_synset = NIL;
            derivationally_related_synset = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$Noun.eql(wni_synset_pos(derivationally_related_synset))) {
                    SubLObject v_term = NIL;
                    v_term = wni_synset_term(derivationally_related_synset);
                    if ((((NIL != v_term) && (NIL != forts.fort_p(v_term))) && (NIL != genls.genlP(v_term, $$Situation, UNPROVIDED, UNPROVIDED))) && (NIL == subl_promotions.memberP(v_term, terms, UNPROVIDED, UNPROVIDED))) {
                        terms = list_utilities.add_to_end(v_term, terms);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                derivationally_related_synset = cdolist_list_var.first();
            } 
        }
        final SubLObject list_var = terms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return terms;
    }

    public static SubLObject wni_strong_synset_term_matches(final SubLObject synset, final SubLObject collectionP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != booleanp(collectionP) : "Types.booleanp(collectionP) " + "CommonSymbols.NIL != Types.booleanp(collectionP) " + collectionP;
        final SubLObject all_hypernyms = wni_all_hypernyms(synset);
        final SubLObject synset_words = wni_synset_words(synset);
        SubLObject pos = lexification_utilities.keyword_for_pos(wni_synset_pos(synset), UNPROVIDED);
        SubLObject ans = NIL;
        if (pos == $NOUN) {
            pos = $ALL_NOUN_FORMS;
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject possibilities = lexicon_accessors.denots_of_stringXpos(word, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != possibilities) {
                SubLObject cdolist_list_var_$13 = all_hypernyms;
                SubLObject hypernym = NIL;
                hypernym = cdolist_list_var_$13.first();
                while (NIL != cdolist_list_var_$13) {
                    final SubLObject hypernym_term = wni_synset_term(hypernym);
                    if (NIL != hypernym_term) {
                        SubLObject cdolist_list_var_$14 = possibilities;
                        SubLObject possibility = NIL;
                        possibility = cdolist_list_var_$14.first();
                        while (NIL != cdolist_list_var_$14) {
                            if ((NIL != forts.fort_p(possibility)) && (NIL == subl_promotions.memberP(possibility, ans, UNPROVIDED, UNPROVIDED))) {
                                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    if ((NIL != genls.genlP(possibility, hypernym_term, UNPROVIDED, UNPROVIDED)) || (NIL != isa.isaP(possibility, hypernym_term, UNPROVIDED, UNPROVIDED))) {
                                        final SubLObject item_var = possibility;
                                        if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            ans = cons(item_var, ans);
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                            possibility = cdolist_list_var_$14.first();
                        } 
                    }
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    hypernym = cdolist_list_var_$13.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        final SubLObject list_var;
        ans = list_var = (NIL != collectionP) ? list_utilities.find_all_if(symbol_function($sym254$SET_OR_COLLECTION_), ans, UNPROVIDED) : list_utilities.find_all_if(symbol_function($sym255$INDIVIDUAL_), ans, UNPROVIDED);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return ans;
    }

    public static SubLObject wni_weak_synset_term_matches(final SubLObject synset, final SubLObject collectionP, SubLObject check_posP) {
        if (check_posP == UNPROVIDED) {
            check_posP = NIL;
        }
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != booleanp(collectionP) : "Types.booleanp(collectionP) " + "CommonSymbols.NIL != Types.booleanp(collectionP) " + collectionP;
        final SubLObject synset_words = wni_synset_words(synset);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = synset_words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject possibilities = NIL;
            SubLObject cdolist_list_var_$15;
            possibilities = cdolist_list_var_$15 = (NIL != check_posP) ? lexicon_accessors.denots_of_stringXpos(word, lexification_utilities.keyword_for_pos(wni_synset_pos(synset), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : lexicon_accessors.denots_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject possibility = NIL;
            possibility = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                if (NIL != forts.fort_p(possibility)) {
                    final SubLObject item_var = possibility;
                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                        ans = cons(item_var, ans);
                    }
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                possibility = cdolist_list_var_$15.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        ans = nreverse(ans);
        final SubLObject list_var;
        ans = list_var = (NIL != collectionP) ? list_utilities.find_all_if(symbol_function($sym254$SET_OR_COLLECTION_), ans, UNPROVIDED) : list_utilities.find_all_if(symbol_function($sym255$INDIVIDUAL_), ans, UNPROVIDED);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return ans;
    }

    public static SubLObject wni_create_now(final SubLObject name) {
        SubLObject constant = constants_high.find_constant(name);
        if (NIL == valid_constantP(constant, UNPROVIDED)) {
            assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
            ke.ke_create_now(name, UNPROVIDED);
            constant = constants_high.find_constant(name);
        }
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        return constant;
    }

    public static SubLObject wni_assert_wff(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != consp(sentence) : "Types.consp(sentence) " + "CommonSymbols.NIL != Types.consp(sentence) " + sentence;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        assert NIL != enumeration_types.direction_p(direction) : "enumeration_types.direction_p(direction) " + "CommonSymbols.NIL != enumeration_types.direction_p(direction) " + direction;
        assert NIL != enumeration_types.el_strength_p(strength) : "enumeration_types.el_strength_p(strength) " + "CommonSymbols.NIL != enumeration_types.el_strength_p(strength) " + strength;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL != nowP) {
            ke.ke_assert_wff_now(sentence, mt, strength, direction);
        } else {
            ke.ke_assert(sentence, mt, strength, direction);
        }
        return NIL;
    }

    public static SubLObject wni_unassert_import_statuses(final SubLObject status, final SubLObject synsets, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(status) : "forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) " + status;
        assert NIL != list_utilities.non_dotted_list_p(synsets) : "list_utilities.non_dotted_list_p(synsets) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synsets) " + synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        SubLObject cdolist_list_var2 = synsets;
        SubLObject synset = NIL;
        synset = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            wni_unassert_import_status(status, synset, nowP);
            cdolist_list_var2 = cdolist_list_var2.rest();
            synset = cdolist_list_var2.first();
        } 
        return NIL;
    }

    public static SubLObject wni_unassert_import_status(final SubLObject status, final SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(status) : "forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) " + status;
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL != nowP) {
            ke.ke_unassert_now(list($$isa, wni_reifiable_synset(synset), status), $$WordNetWorkflowDataStatusMt);
        } else {
            ke.ke_unassert(list($$isa, wni_reifiable_synset(synset), status), $$WordNetWorkflowDataStatusMt);
        }
        return NIL;
    }

    public static SubLObject wni_assert_import_statuses(final SubLObject status, final SubLObject synsets, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(status) : "forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) " + status;
        assert NIL != list_utilities.non_dotted_list_p(synsets) : "list_utilities.non_dotted_list_p(synsets) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synsets) " + synsets;
        SubLObject cdolist_list_var = synsets;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        SubLObject cdolist_list_var2 = synsets;
        SubLObject synset = NIL;
        synset = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            wni_assert_import_status(status, synset, nowP);
            cdolist_list_var2 = cdolist_list_var2.rest();
            synset = cdolist_list_var2.first();
        } 
        return NIL;
    }

    public static SubLObject wni_assert_import_status(final SubLObject status, final SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(status) : "forts.fort_p(status) " + "CommonSymbols.NIL != forts.fort_p(status) " + status;
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL != nowP) {
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                ke.ke_assert_wff_now(list($$isa, wni_reifiable_synset(synset), status), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
            } finally {
                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
            }
        } else {
            ke.ke_assert(list($$isa, wni_reifiable_synset(synset), status), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    public static SubLObject wni_assert_synset_mapping(final SubLObject v_term, final SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        clear_wni_synset_term_helper();
        if (NIL != nowP) {
            ke.ke_assert_wff_now(list($$synonymousExternalConcept, v_term, $const128$WordNet_Version2_0, wni_synset_speech_part_offset(synset)), $$WordNetMappingMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(list($$synonymousExternalConcept, v_term, $const128$WordNet_Version2_0, wni_synset_speech_part_offset(synset)), $$WordNetMappingMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    public static SubLObject wni_assert_likely_synset_mapping(final SubLObject v_term, final SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL != nowP) {
            ke.ke_assert_wff_now(list($$wnLikelySynsetMapping, wni_reifiable_synset(synset), v_term), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(list($$wnLikelySynsetMapping, wni_synset_speech_part_offset(synset), v_term), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    public static SubLObject wni_assert_quoted_isa_workflow_constant(final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL != nowP) {
            ke.ke_assert_wff_now(listS($$quotedIsa, v_term, $list274), $$BookkeepingMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(listS($$quotedIsa, v_term, $list274), $$BookkeepingMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    public static SubLObject wni_assert_isa_collection(final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        ke.ke_assert_wff_now(listS($$isa, v_term, $list277), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        return NIL;
    }

    public static SubLObject wni_assert_genls(final SubLObject v_term, final SubLObject genl_terms, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) " + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        SubLObject cdolist_list_var2 = genl_terms;
        SubLObject genl_term = NIL;
        genl_term = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == genls.genl_in_any_mtP(v_term, genl_term)) {
                if (NIL != nowP) {
                    ke.ke_assert_wff_now(list($$genls, v_term, genl_term), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
                } else {
                    ke.ke_assert(list($$genls, v_term, genl_term), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            genl_term = cdolist_list_var2.first();
        } 
        return NIL;
    }

    public static SubLObject wni_unassert_genls(final SubLObject v_term, final SubLObject genl_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != forts.fort_p(genl_term) : "forts.fort_p(genl_term) " + "CommonSymbols.NIL != forts.fort_p(genl_term) " + genl_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL != nowP) {
            ke.ke_unassert_now(list($$genls, v_term, genl_term), $$UniversalVocabularyMt);
        } else {
            ke.ke_unassert(list($$isa, v_term, genl_term), $$UniversalVocabularyMt);
        }
        return NIL;
    }

    public static SubLObject wni_assert_isa(final SubLObject v_term, final SubLObject genl_terms, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) " + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        SubLObject cdolist_list_var2 = genl_terms;
        SubLObject genl_term = NIL;
        genl_term = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == isa.isa_in_any_mtP(v_term, genl_term)) {
                if (NIL != nowP) {
                    ke.ke_assert_wff_now(list($$isa, v_term, genl_term), $$WordNetIndividualMappingMt, $MONOTONIC, $FORWARD);
                } else {
                    ke.ke_assert(list($$isa, v_term, genl_term), $$WordNetIndividualMappingMt, $MONOTONIC, $FORWARD);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            genl_term = cdolist_list_var2.first();
        } 
        return NIL;
    }

    public static SubLObject wni_assert_isa_individual(final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL != nowP) {
            ke.ke_assert_wff_now(listS($$isa, v_term, $list285), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(listS($$isa, v_term, $list285), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    public static SubLObject wni_assert_isa_agent_generic(final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL == isa.isaP(v_term, $$Agent_Generic, UNPROVIDED, UNPROVIDED)) {
            if (NIL != nowP) {
                ke.ke_assert_wff_now(listS($$isa, v_term, $list288), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
            } else {
                ke.ke_assert(listS($$isa, v_term, $list288), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
            }
        }
        return NIL;
    }

    public static SubLObject wni_assert_reified_using(final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL != nowP) {
            ke.ke_assert_wff_now(listS($$reifiedUsingTool, v_term, $list291), $$WordNetMappingMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(listS($$reifiedUsingTool, v_term, $list291), $$WordNetMappingMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    public static SubLObject wni_synset_note(final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        SubLObject note = NIL;
        final SubLObject sentence = listS($$wnSynsetNote, wni_reifiable_synset(synset), $list294);
        final SubLObject query_properties = $list9;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            note = results.first().first().rest();
        }
        if (NIL == note) {
            note = $str295$;
        }
        assert NIL != stringp(note) : "Types.stringp(note) " + "CommonSymbols.NIL != Types.stringp(note) " + note;
        return note;
    }

    public static SubLObject wni_assert_synset_note(final SubLObject synset, final SubLObject note) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != stringp(note) : "Types.stringp(note) " + "CommonSymbols.NIL != Types.stringp(note) " + note;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            ke.ke_assert_wff_now(list($$wnSynsetNote, wni_reifiable_synset(synset), note), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        } finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject wni_unassert_synset_note(final SubLObject synset, final SubLObject note) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != stringp(note) : "Types.stringp(note) " + "CommonSymbols.NIL != Types.stringp(note) " + note;
        ke.ke_unassert_now(list($$wnSynsetNote, wni_reifiable_synset(synset), note), $$WordNetWorkflowDataStatusMt);
        return NIL;
    }

    public static SubLObject wni_assert_comment(final SubLObject v_term, final SubLObject comment, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != stringp(comment) : "Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) " + comment;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL != nowP) {
            ke.ke_assert_wff_now(list($$comment, v_term, comment), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        } else {
            ke.ke_assert(list($$comment, v_term, comment), $$UniversalVocabularyMt, $MONOTONIC, $FORWARD);
        }
        return NIL;
    }

    public static SubLObject wni_assert_term_of_unit(final SubLObject nat) {
        assert NIL != consp(nat) : "Types.consp(nat) " + "CommonSymbols.NIL != Types.consp(nat) " + nat;
        ke.ke_assert_now(list($$termOfUnit, nat, nat), $$BaseKB, $MONOTONIC, $FORWARD);
        return NIL;
    }

    public static SubLObject wni_lock_synset(final SubLObject synset) {
        ke.ke_assert_wff_now(list($$wnWorkflowSynsetLock, wni_reifiable_synset(synset), operation_communication.the_cyclist(), date_utilities.indexical_now()), $$WordNetWorkflowDataStatusMt, $MONOTONIC, $FORWARD);
        return NIL;
    }

    public static SubLObject wni_unlock_synset(final SubLObject synset, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        SubLObject date = NIL;
        final SubLObject reifiable_synset = wni_reifiable_synset(synset);
        final SubLObject sentence = listS($$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), $list306);
        final SubLObject query_properties = $list189;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$WordNetWorkflowCollectorMt, query_properties);
        if (NIL != results) {
            date = results.first().first().rest();
            if (NIL != nowP) {
                ke.ke_unassert_now(list($$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), date), $$WordNetWorkflowDataStatusMt);
            } else {
                ke.ke_unassert(list($$wnWorkflowSynsetLock, reifiable_synset, operation_communication.the_cyclist(), date), $$WordNetWorkflowDataStatusMt);
            }
        }
        return NIL;
    }

    public static SubLObject wni_assert_heuristic_lexicon(final SubLObject synset, final SubLObject workflow_alist, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL != wni_synset_collectionP(synset)) {
            wni_assert_heuristic_lexicon_for_collection(synset, workflow_alist, v_term, nowP);
        } else {
            wni_assert_heuristic_lexicon_for_individual(synset, v_term, workflow_alist, nowP);
        }
        return NIL;
    }

    public static SubLObject wni_assert_heuristic_lexicon_for_collection(final SubLObject synset, final SubLObject workflow_alist, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if ((NIL != wni_all_hypernymP(synset, $organism_being_synset$.getGlobalValue())) && (NIL == wni_all_hypernymP(synset, $person_synset$.getGlobalValue()))) {
            wni_assert_heuristic_lexicon_for_organism(synset, v_term, workflow_alist, nowP);
            return NIL;
        }
        if (NIL != wni_all_hypernymP(synset, $chemical_compound_synset$.getGlobalValue())) {
            wni_assert_heuristic_lexicon_for_chemical(synset, v_term, nowP);
        }
        final SubLObject synset_words = wni_synset_words(synset);
        wni_assert_heuristic_lexicon_for_collection_common(synset, synset_words, v_term, workflow_alist, nowP);
        return NIL;
    }

    public static SubLObject wni_assert_heuristic_lexicon_for_collection_common(final SubLObject synset, final SubLObject synset_words, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != list_utilities.non_dotted_list_p(synset_words) : "list_utilities.non_dotted_list_p(synset_words) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(synset_words) " + synset_words;
        SubLObject cdolist_list_var = synset_words;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        SubLObject cdolist_list_var2 = synset_words;
        SubLObject synset_word = NIL;
        synset_word = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != list_utilities.alist_lookup(workflow_alist, cconcatenate(synset_word, $str312$_included), EQUAL, UNPROVIDED)) {
                final SubLObject pos = wni_heuristic_pos(synset, synset_word, workflow_alist);
                if (NIL != string_utilities.contains_charP(synset_word, CHAR_hyphen)) {
                    wni_assert_lexicon_for_hyphen_string(synset_word, v_term, workflow_alist, pos, nowP);
                } else
                    if (NIL != string_utilities.contains_charP(synset_word, CHAR_space)) {
                        wni_assert_lexicon_for_phrase(synset_word, v_term, workflow_alist, pos, nowP);
                    } else {
                        wni_assert_lexicon_for_denotation(synset_word, v_term, workflow_alist, pos, nowP);
                    }

            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            synset_word = cdolist_list_var2.first();
        } 
        return NIL;
    }

    public static SubLObject wni_assert_heuristic_lexicon_for_individual(final SubLObject synset, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$$Noun.equal(wni_synset_pos(synset)))) {
            Errors.error($str316$WordNet_individual_synset__A_must, synset);
        }
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL != wni_all_hypernymP(synset, $person_synset$.getGlobalValue())) {
            wni_assert_lexicon_for_person(synset, v_term, nowP);
            return NIL;
        }
        if (NIL != wni_all_hypernymP(synset, $country_synset$.getGlobalValue())) {
            return NIL;
        }
        if (NIL != wni_all_hypernymP(synset, $urban_area_synset$.getGlobalValue())) {
            wni_assert_lexicon_for_urban_area(synset, v_term, nowP);
            return NIL;
        }
        if (NIL != wni_all_hypernymP(synset, $geographical_area_synset$.getGlobalValue())) {
            wni_assert_lexicon_for_geographical_area(synset, v_term, nowP);
            return NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject synset_words = cdolist_list_var = wni_synset_words(synset);
        SubLObject synset_word = NIL;
        synset_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != list_utilities.alist_lookup(workflow_alist, cconcatenate(synset_word, $str312$_included), EQUAL, UNPROVIDED)) && (NIL == subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                if (NIL != Strings.stringE(synset_word, Strings.string_upcase(synset_word, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    if (((((NIL != string_utilities.contains_charP(synset_word, CHAR_A)) || (NIL != string_utilities.contains_charP(synset_word, CHAR_E))) || (NIL != string_utilities.contains_charP(synset_word, CHAR_I))) || (NIL != string_utilities.contains_charP(synset_word, CHAR_O))) || (NIL != string_utilities.contains_charP(synset_word, CHAR_U))) {
                        wni_assert_acronym(synset_word, v_term, nowP);
                    } else {
                        wni_assert_initialism(synset_word, v_term, nowP);
                    }
                } else {
                    wni_assert_name_string(synset_word, v_term, nowP);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject wni_assert_heuristic_lexicon_for_organism(final SubLObject synset, final SubLObject v_term, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        SubLObject synset_words = wni_synset_words(synset);
        final SubLObject last_synset_word = list_utilities.last_one(synset_words);
        if (NIL != upper_case_p(string_utilities.first_char(last_synset_word))) {
            wni_assert_isa(v_term, list($$BiologicalSpecies), nowP);
            wni_assert_wff(list($$scientificName, v_term, last_synset_word), $$NewLatinLexicalMt, $MONOTONIC, $FORWARD, nowP);
            synset_words = list_utilities.remove_last(synset_words);
        }
        wni_assert_heuristic_lexicon_for_collection_common(synset, synset_words, v_term, workflow_alist, nowP);
        return NIL;
    }

    public static SubLObject wni_assert_heuristic_lexicon_for_chemical(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        SubLObject cdolist_list_var;
        final SubLObject gloss_words = cdolist_list_var = string_utilities.split_string(wni_synset_gloss(synset), $list320);
        SubLObject gloss_word = NIL;
        gloss_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != string_utilities.starts_with(gloss_word, $str134$_)) && (NIL != string_utilities.ends_with(gloss_word, $str136$_, UNPROVIDED))) {
                gloss_word = subseq(gloss_word, ONE_INTEGER, subtract(length(gloss_word), ONE_INTEGER));
            }
            cdolist_list_var = cdolist_list_var.rest();
            gloss_word = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject wni_assert_lexicon_for_hyphen_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != forts.fort_p(pos) : "forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) " + pos;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        final SubLObject hyphenated_words = string_utilities.split_string(synset_word, $list321);
        final SubLObject all_but_last_words = append(list($$TheList), list_utilities.remove_last(hyphenated_words));
        final SubLObject last_word = list_utilities.last_one(hyphenated_words);
        SubLObject last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
        SubLObject sentence = NIL;
        if (NIL == last_word_unit) {
            lexification_wizard.add_lexical_mapping(last_word, pos, $$GeneralEnglishMt, UNPROVIDED);
            last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
        }
        if (NIL != last_word_unit) {
            sentence = list($$hyphenString, all_but_last_words, last_word_unit, pos, v_term);
            wni_assert_wff(sentence, $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
        }
        return NIL;
    }

    public static SubLObject wni_assert_lexicon_for_phrase(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != forts.fort_p(pos) : "forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) " + pos;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        final SubLObject key = cconcatenate(synset_word, $str326$_count_noun);
        final SubLObject value = list_utilities.alist_lookup(workflow_alist, key, EQUAL, UNPROVIDED);
        if (NIL != Strings.stringE(value, $str327$headword_is_first, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            wni_assert_lexicon_for_compound_string(synset_word, v_term, workflow_alist, pos, nowP);
        } else {
            wni_assert_lexicon_for_multi_word_string(synset_word, v_term, workflow_alist, pos, nowP);
        }
        return NIL;
    }

    public static SubLObject wni_assert_lexicon_for_multi_word_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != forts.fort_p(pos) : "forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) " + pos;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        final SubLObject multi_words = string_utilities.split_string(synset_word, UNPROVIDED);
        final SubLObject all_but_last_words = append(list($$TheList), list_utilities.remove_last(multi_words));
        final SubLObject last_word = list_utilities.last_one(multi_words);
        SubLObject last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
        SubLObject sentence = NIL;
        if (NIL == last_word_unit) {
            lexification_wizard.add_lexical_mapping(last_word, pos, $$GeneralEnglishMt, UNPROVIDED);
            last_word_unit = lexicon_accessors.best_wu_for_string(last_word, pos);
        }
        if (NIL != last_word_unit) {
            sentence = list($$multiWordString, all_but_last_words, last_word_unit, pos, v_term);
            wni_assert_wff(sentence, $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
        }
        return NIL;
    }

    public static SubLObject wni_assert_lexicon_for_compound_string(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != forts.fort_p(pos) : "forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) " + pos;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        final SubLObject multi_words = string_utilities.split_string(synset_word, UNPROVIDED);
        final SubLObject all_but_first_words = append(list($$TheList), multi_words.rest());
        final SubLObject first_word = multi_words.first();
        SubLObject first_word_unit = lexicon_accessors.best_wu_for_string(first_word, pos);
        SubLObject sentence = NIL;
        if (NIL == first_word_unit) {
            lexification_wizard.add_lexical_mapping(first_word, pos, $$GeneralEnglishMt, UNPROVIDED);
            first_word_unit = lexicon_accessors.best_wu_for_string(first_word, pos);
        }
        if (NIL != first_word_unit) {
            sentence = list($$compoundString, first_word_unit, all_but_first_words, pos, v_term);
            wni_assert_wff(sentence, $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            wni_assert_lexical_annotations(sentence, synset_word, workflow_alist, nowP);
        }
        return NIL;
    }

    public static SubLObject wni_assert_lexicon_for_denotation(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != forts.fort_p(pos) : "forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) " + pos;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        SubLObject word_unit = lexicon_accessors.best_wu_for_string(synset_word, pos);
        SubLObject word_sense = NIL;
        SubLObject denotation_sentence = NIL;
        if (NIL == word_unit) {
            lexification_wizard.add_lexical_mapping(synset_word, pos, $$GeneralEnglishMt, UNPROVIDED);
            word_unit = lexicon_accessors.best_wu_for_string(synset_word, pos);
        }
        if (NIL != word_unit) {
            if (NIL != subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                wni_assert_lexicon_for_existing_denotation(synset_word, v_term, workflow_alist, pos, nowP);
                return NIL;
            }
            word_sense = lexicon_utilities.unique_ws(word_unit, pos, v_term);
            denotation_sentence = list($$denotation, word_unit, pos, word_sense, v_term);
            wni_assert_wff(denotation_sentence, $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            wni_assert_lexical_annotations(denotation_sentence, synset_word, workflow_alist, nowP);
        }
        return NIL;
    }

    public static SubLObject wni_assert_lexicon_for_existing_denotation(final SubLObject synset_word, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject pos, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != forts.fort_p(pos) : "forts.fort_p(pos) " + "CommonSymbols.NIL != forts.fort_p(pos) " + pos;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        final SubLObject word_unit = lexicon_accessors.best_wu_for_string(synset_word, pos);
        SubLObject actual_pos = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == word_unit)) {
            Errors.error($str330$must_have_an_existing_word_unit_f, synset_word, pos);
        }
        SubLObject word_sense = NIL;
        SubLObject denotation_sentence = NIL;
        final SubLObject query = list($$denotation, word_unit, $sym52$_POS, $sym331$_WORD_SENSE, v_term);
        final SubLObject query_properties = $list9;
        final SubLObject results = wni_trace_new_cyc_query(query, $$GeneralEnglishMt, query_properties);
        if (NIL != results) {
            actual_pos = bindings.variable_lookup($sym52$_POS, results.first());
            word_sense = bindings.variable_lookup($sym331$_WORD_SENSE, results.first());
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == word_sense)) {
            Errors.error($str332$must_have_an_existing_word_sense_, word_unit, pos);
        }
        denotation_sentence = list($$denotation, word_unit, actual_pos, word_sense, v_term);
        wni_assert_lexical_annotations(denotation_sentence, synset_word, workflow_alist, nowP);
        return NIL;
    }

    public static SubLObject wni_assert_lexical_annotations(final SubLObject denotation_sentence, final SubLObject synset_word, final SubLObject workflow_alist, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != consp(denotation_sentence) : "Types.consp(denotation_sentence) " + "CommonSymbols.NIL != Types.consp(denotation_sentence) " + denotation_sentence;
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        final SubLObject politeness = wni_politeness(synset_word, workflow_alist);
        final SubLObject formality = wni_formality(synset_word, workflow_alist);
        final SubLObject rhetorical_device = wni_rhetorical_device(synset_word, workflow_alist);
        if (NIL != politeness) {
            wni_assert_wff(list($$politenessOfWS, denotation_sentence, politeness), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        if (NIL != formality) {
            wni_assert_wff(list($$formalityOfWS, denotation_sentence, formality), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        if (NIL != rhetorical_device) {
            wni_assert_wff(list($$rhetoricalDeviceOfPhrase, denotation_sentence, rhetorical_device), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        return NIL;
    }

    public static SubLObject wni_politeness(final SubLObject synset_word, final SubLObject workflow_alist) {
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        SubLObject politeness = NIL;
        final SubLObject politeness_value = list_utilities.alist_lookup(workflow_alist, cconcatenate(synset_word, $str336$_politeness), EQUAL, UNPROVIDED);
        if (NIL != Strings.stringE(politeness_value, $$$polite, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            politeness = $$PoliteSpeech;
        } else
            if (NIL != Strings.stringE(politeness_value, $$$rude, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                politeness = $$RudeSpeech;
            } else
                if (NIL != Strings.stringE(politeness_value, $$$vulgar, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    politeness = $$VulgarSpeech;
                }


        if (((NIL != politeness) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(politeness))) {
            throw new AssertionError(politeness);
        }
        return politeness;
    }

    public static SubLObject wni_formality(final SubLObject synset_word, final SubLObject workflow_alist) {
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        SubLObject formality = NIL;
        final SubLObject formality_value = list_utilities.alist_lookup(workflow_alist, cconcatenate(synset_word, $str343$_formality), EQUAL, UNPROVIDED);
        if (NIL != Strings.stringE(formality_value, $$$archaic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            formality = $$ArchaicSpeech;
        } else
            if (NIL != Strings.stringE(formality_value, $$$slang, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                formality = $$SlangSpeech;
            } else
                if (NIL != Strings.stringE(formality_value, $$$formal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    formality = $$FormalSpeech;
                } else
                    if (NIL != Strings.stringE(formality_value, $$$informal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        formality = $$InformalSpeech;
                    } else
                        if (NIL != Strings.stringE(formality_value, $$$baby_talk, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            formality = $$BabyTalk;
                        } else
                            if (NIL != Strings.stringE(formality_value, $$$technical_jargon, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                formality = $$Jargon;
                            }





        if (((NIL != formality) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(formality))) {
            throw new AssertionError(formality);
        }
        return formality;
    }

    public static SubLObject wni_rhetorical_device(final SubLObject synset_word, final SubLObject workflow_alist) {
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        SubLObject rhetorical_device = NIL;
        final SubLObject rhetorical_device_value = list_utilities.alist_lookup(workflow_alist, cconcatenate(synset_word, $str356$_rhetorical_device), EQUAL, UNPROVIDED);
        if (NIL != Strings.stringE(rhetorical_device_value, $$$metaphor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            rhetorical_device = $$MetaphoricalSpeech;
        } else
            if (NIL != Strings.stringE(rhetorical_device_value, $$$simile, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                rhetorical_device = $$Simile_FigureOfSpeech;
            } else
                if (NIL != Strings.stringE(rhetorical_device_value, $$$euphemism, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    rhetorical_device = $$EuphemisticSpeech;
                }


        if (((NIL != rhetorical_device) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(rhetorical_device))) {
            throw new AssertionError(rhetorical_device);
        }
        return rhetorical_device;
    }

    public static SubLObject wni_assert_lexicon_for_person(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        if (NIL == isa.isaP(v_term, $$Agent_Generic, UNPROVIDED, UNPROVIDED)) {
            wni_assert_isa_agent_generic(v_term, nowP);
        }
        SubLObject synset_words = wni_synset_words(synset);
        SubLObject synset_word = NIL;
        SubLObject last_name = NIL;
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if (NIL != string_utilities.contains_charP(synset_word, CHAR_period)) {
            wni_assert_wff(list($$nameString, v_term, synset_word), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            return NIL;
        }
        last_name = synset_word;
        wni_assert_wff(list($$familyName, v_term, last_name), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        if (NIL == synset_words) {
            return NIL;
        }
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if ((((NIL != string_utilities.starts_with(synset_word, $str365$Mrs_)) || (NIL != string_utilities.starts_with(synset_word, $$$Sir_))) || (NIL != string_utilities.ends_with(synset_word, $str367$_Jr_, UNPROVIDED))) || (NIL != string_utilities.contains_charP(synset_word, CHAR_period))) {
            wni_assert_wff(list($$nameString, v_term, synset_word), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            if (NIL == synset_words) {
                return NIL;
            }
            synset_word = synset_words.first();
            synset_words = synset_words.rest();
        }
        if (NIL == string_utilities.starts_with(synset_word, $str365$Mrs_)) {
            if (NIL != string_utilities.starts_with(synset_word, $$$President_)) {
                synset_word = string_utilities.remove_substring(synset_word, $$$President_);
            }
            if (NIL != string_utilities.starts_with(synset_word, $$$Sir_)) {
                synset_word = string_utilities.remove_substring(synset_word, $$$Sir_);
            }
            if (NIL != string_utilities.ends_with(synset_word, $str367$_Jr_, UNPROVIDED)) {
                synset_word = string_utilities.remove_substring(synset_word, $str367$_Jr_);
            }
            final SubLObject given_names = string_utilities.split_string(synset_word, UNPROVIDED).first();
            if (NIL == string_utilities.contains_charP(given_names, CHAR_period)) {
                wni_assert_wff(list($$givenNames, v_term, given_names), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
        }
        if (NIL == synset_words) {
            synset_words = cons(synset_word, synset_words);
        }
        final SubLObject last_synset_word = list_utilities.last_one(synset_words);
        SubLObject middle_names = string_utilities.split_string(last_synset_word, UNPROVIDED);
        SubLObject middle_names_string = NIL;
        if (NIL != Strings.stringE(last_name, list_utilities.last_one(middle_names), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            middle_names = middle_names.rest();
            middle_names = list_utilities.remove_last(middle_names);
            if (NIL != middle_names) {
                middle_names_string = string_utilities.join_strings(middle_names, $$$_);
                wni_assert_wff(list($$middleName, v_term, middle_names_string), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
        } else {
            wni_assert_wff(list($$pseudonym, v_term, last_synset_word), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        return NIL;
    }

    public static SubLObject wni_assert_lexicon_for_urban_area(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        SubLObject synset_words = wni_synset_words(synset);
        SubLObject synset_word = NIL;
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if (NIL == subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            wni_assert_wff(list($$placeName_Standard, v_term, synset_word), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject synset_word_$16 = NIL;
        synset_word_$16 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word_$16, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                wni_assert_wff(list($$nameString, v_term, synset_word_$16), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word_$16 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject wni_assert_lexicon_for_geographical_area(final SubLObject synset, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        SubLObject synset_words = wni_synset_words(synset);
        SubLObject synset_word = NIL;
        synset_word = synset_words.first();
        synset_words = synset_words.rest();
        if (NIL == subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
            wni_assert_wff(list($$placeName_ShortForm, v_term, synset_word), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        }
        SubLObject cdolist_list_var = synset_words;
        SubLObject synset_word_$17 = NIL;
        synset_word_$17 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(v_term, lexicon_accessors.denots_of_string(synset_word_$17, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                wni_assert_wff(list($$nameString, v_term, synset_word_$17), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word_$17 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject wni_assert_name_string(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        wni_assert_wff(list($$nameString, v_term, synset_word), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        return NIL;
    }

    public static SubLObject wni_assert_acronym(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        wni_assert_wff(list($$acronymString, v_term, synset_word), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        return NIL;
    }

    public static SubLObject wni_assert_initialism(final SubLObject synset_word, final SubLObject v_term, SubLObject nowP) {
        if (nowP == UNPROVIDED) {
            nowP = T;
        }
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        wni_assert_wff(list($$initialismString, v_term, synset_word), $const325$TemporaryLexicalAssertions_WordNe, $MONOTONIC, $FORWARD, nowP);
        return NIL;
    }

    public static SubLObject wni_heuristic_pos(final SubLObject synset, final SubLObject synset_word, final SubLObject workflow_alist) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        final SubLObject pos = wni_synset_pos(synset);
        if (!pos.eql($$Noun)) {
            return pos;
        }
        if (length(synset_word).numG(FOUR_INTEGER) && (NIL != string_utilities.ends_with(synset_word, $$$ing, UNPROVIDED))) {
            final SubLObject prefix = string_utilities.string_first_n(subtract(length(synset_word), THREE_INTEGER), synset_word);
            if (NIL != genls.any_specP($$Noun, lexicon_accessors.pos_of_string(prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                return $$GerundiveNoun;
            }
        }
        final SubLObject key = cconcatenate(synset_word, $str326$_count_noun);
        final SubLObject value = list_utilities.alist_lookup(workflow_alist, key, EQUAL, UNPROVIDED);
        final SubLObject count_nounP = makeBoolean((NIL != Strings.stringE(value, $$$t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != Strings.stringE(value, $str327$headword_is_first, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        if ((NIL != lexification_utilities.initial_capitalizedP(synset_word)) && (NIL == wni_synset_collectionP(synset))) {
            if (NIL != count_nounP) {
                return $$ProperCountNoun;
            }
            return $$ProperMassNoun;
        } else {
            if (NIL != count_nounP) {
                return $$CountNoun;
            }
            return $$MassNoun;
        }
    }

    public static SubLObject wni_number_of_workflow_mapped_terms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_mt($const128$WordNet_Version2_0, $$synonymousExternalConcept, $$WordNetMappingMt, TWO_INTEGER, UNPROVIDED);
        SubLObject when_asserted = NIL;
        final SubLObject list_var = gafs;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Counting_recent_WordNet_mappings, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject gaf = NIL;
                gaf = csome_list_var.first();
                while (NIL != csome_list_var) {
                    when_asserted = assertions_high.asserted_when(gaf);
                    if (when_asserted.isNumber() && when_asserted.numG($int$20050101)) {
                        count = add(count, ONE_INTEGER);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    gaf = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject wni_number_of_new_concepts_imported_from_wordnet() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject terms = isa.quoted_instances($const387$WordNetWorkflowConstant_NotFullyR, $$BookkeepingMt, UNPROVIDED);
        SubLObject creator = NIL;
        final SubLObject list_var = terms;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str388$Counting_terms_imported_from_Word, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject v_term = NIL;
                v_term = csome_list_var.first();
                while (NIL != csome_list_var) {
                    creator = bookkeeping_store.creator(v_term, UNPROVIDED);
                    if (creator.eql($$SteveReed) || (NIL != kb_mapping_utilities.pred_u_v_holds_in_mt($$reifiedUsingTool, v_term, $$CycWordNetImportTool, $$WordNetMappingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        count = add(count, ONE_INTEGER);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    v_term = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject wni_number_of_new_denotations_imported_from_wordet() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject gafs = kb_mapping_utilities.pred_value_gafs_in_mt($const128$WordNet_Version2_0, $$synonymousExternalConcept, $$WordNetMappingMt, TWO_INTEGER, UNPROVIDED);
        SubLObject when_asserted = NIL;
        SubLObject v_term = NIL;
        SubLObject denotation_gafs = NIL;
        final SubLObject list_var = gafs;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str392$Counting_recent_denotations_impor, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject gaf = NIL;
                gaf = csome_list_var.first();
                while (NIL != csome_list_var) {
                    when_asserted = assertions_high.asserted_when(gaf);
                    if (when_asserted.isNumber() && when_asserted.numG($int$20050101)) {
                        v_term = assertions_high.gaf_arg1(gaf);
                        final SubLObject _prev_bind_0_$20 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$21 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            denotation_gafs = kb_mapping_utilities.pred_value_gafs(v_term, $$denotation, FOUR_INTEGER, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$21, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$20, thread);
                        }
                        SubLObject cdolist_list_var = denotation_gafs;
                        SubLObject denotation_gaf = NIL;
                        denotation_gaf = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject when_asserted_$22 = assertions_high.asserted_when(denotation_gaf);
                            if (when_asserted_$22.isNumber() && when_asserted_$22.numG($int$20050101)) {
                                count = add(count, ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            denotation_gaf = cdolist_list_var.first();
                        } 
                        final SubLObject _prev_bind_0_$21 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$22 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            denotation_gafs = kb_mapping_utilities.pred_value_gafs(v_term, $$compoundString, FOUR_INTEGER, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$22, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$21, thread);
                        }
                        cdolist_list_var = denotation_gafs;
                        denotation_gaf = NIL;
                        denotation_gaf = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject when_asserted_$23 = assertions_high.asserted_when(denotation_gaf);
                            if (when_asserted_$23.isNumber() && when_asserted_$23.numG($int$20050101)) {
                                count = add(count, ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            denotation_gaf = cdolist_list_var.first();
                        } 
                        final SubLObject _prev_bind_0_$22 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$23 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            denotation_gafs = kb_mapping_utilities.pred_value_gafs(v_term, $$multiWordString, FOUR_INTEGER, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$23, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$22, thread);
                        }
                        cdolist_list_var = denotation_gafs;
                        denotation_gaf = NIL;
                        denotation_gaf = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject when_asserted_$24 = assertions_high.asserted_when(denotation_gaf);
                            if (when_asserted_$24.isNumber() && when_asserted_$24.numG($int$20050101)) {
                                count = add(count, ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            denotation_gaf = cdolist_list_var.first();
                        } 
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    gaf = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject wni_role_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        wni_print_role_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject wni_role_info_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$wni_role_info_native.class ? T : NIL;
    }

    public static SubLObject wni_role(final SubLObject v_object) {
        assert NIL != wni_role_info_p(v_object) : "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject wni_filler(final SubLObject v_object) {
        assert NIL != wni_role_info_p(v_object) : "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject wni_defining_col(final SubLObject v_object) {
        assert NIL != wni_role_info_p(v_object) : "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject wni_defining_pred(final SubLObject v_object) {
        assert NIL != wni_role_info_p(v_object) : "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject wni_subsumption_status(final SubLObject v_object) {
        assert NIL != wni_role_info_p(v_object) : "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_wni_role(final SubLObject v_object, final SubLObject value) {
        assert NIL != wni_role_info_p(v_object) : "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_wni_filler(final SubLObject v_object, final SubLObject value) {
        assert NIL != wni_role_info_p(v_object) : "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_wni_defining_col(final SubLObject v_object, final SubLObject value) {
        assert NIL != wni_role_info_p(v_object) : "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_wni_defining_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != wni_role_info_p(v_object) : "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_wni_subsumption_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != wni_role_info_p(v_object) : "wordnet_import.wni_role_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_wni_role_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $wni_role_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ROLE)) {
                _csetf_wni_role(v_new, current_value);
            } else
                if (pcase_var.eql($FILLER)) {
                    _csetf_wni_filler(v_new, current_value);
                } else
                    if (pcase_var.eql($DEFINING_COL)) {
                        _csetf_wni_defining_col(v_new, current_value);
                    } else
                        if (pcase_var.eql($DEFINING_PRED)) {
                            _csetf_wni_defining_pred(v_new, current_value);
                        } else
                            if (pcase_var.eql($SUBSUMPTION_STATUS)) {
                                _csetf_wni_subsumption_status(v_new, current_value);
                            } else {
                                Errors.error($str417$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_wni_role_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_WNI_ROLE_INFO, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ROLE, wni_role(obj));
        funcall(visitor_fn, obj, $SLOT, $FILLER, wni_filler(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFINING_COL, wni_defining_col(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFINING_PRED, wni_defining_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBSUMPTION_STATUS, wni_subsumption_status(obj));
        funcall(visitor_fn, obj, $END, MAKE_WNI_ROLE_INFO, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_wni_role_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_wni_role_info(obj, visitor_fn);
    }

    public static SubLObject wni_print_role_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        assert NIL != wni_role_info_p(v_object) : "wordnet_import.wni_role_info_p error :" + v_object;
        assert NIL != streamp(stream) : "Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) " + stream;
        format(stream, $str424$_ROLE_INFO___s__s__s__s__s_, new SubLObject[]{ wni_role(v_object), wni_filler(v_object), wni_defining_col(v_object), wni_defining_pred(v_object), wni_subsumption_status(v_object) });
        return NIL;
    }

    public static SubLObject wni_gather_roles_and_traits(final SubLObject event_col) {
        assert NIL != forts.fort_p(event_col) : "forts.fort_p(event_col) " + "CommonSymbols.NIL != forts.fort_p(event_col) " + event_col;
        SubLObject role_infos = Sort.sort(wni_gather_roles(event_col), symbol_function($sym426$GENERALITY_ESTIMATE_), symbol_function(WNI_DEFINING_COL));
        SubLObject role_info = NIL;
        SubLObject doneP = NIL;
        SubLObject j = NIL;
        SubLObject genl_predsP = NIL;
        role_infos = append(role_infos, Sort.sort(wni_gather_traits(event_col), symbol_function($sym426$GENERALITY_ESTIMATE_), symbol_function(WNI_DEFINING_COL)));
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(role_infos), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            role_info = elt(role_infos, i);
            j = ZERO_INTEGER;
            genl_predsP = NIL;
            doneP = NIL;
            while (NIL == doneP) {
                if (j.numGE(i)) {
                    doneP = T;
                } else {
                    genl_predsP = wni_genl_preds_helper(elt(role_infos, j), role_info);
                    if (NIL != genl_predsP) {
                        doneP = T;
                    } else {
                        j = add(j, ONE_INTEGER);
                    }
                }
            } 
            _csetf_wni_subsumption_status(role_info, genl_predsP);
        }
        final SubLObject list_var = role_infos;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != wni_role_info_p(elem) : "wordnet_import.wni_role_info_p(elem) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return role_infos;
    }

    public static SubLObject wni_find_compatible_roles(final SubLObject selected_role_info, final SubLObject role_infos) {
        assert NIL != wni_role_info_p(selected_role_info) : "wordnet_import.wni_role_info_p(selected_role_info) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(selected_role_info) " + selected_role_info;
        assert NIL != listp(role_infos) : "Types.listp(role_infos) " + "CommonSymbols.NIL != Types.listp(role_infos) " + role_infos;
        SubLObject compatible_role_infos = NIL;
        SubLObject cdolist_list_var = role_infos;
        SubLObject role_info = NIL;
        role_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!role_info.equal(selected_role_info)) && (NIL != genls.max_floor_cols(list(wni_filler(selected_role_info), wni_filler(role_info)), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                compatible_role_infos = cons(role_info, compatible_role_infos);
            }
            cdolist_list_var = cdolist_list_var.rest();
            role_info = cdolist_list_var.first();
        } 
        final SubLObject list_var;
        compatible_role_infos = list_var = nreverse(compatible_role_infos);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != wni_role_info_p(elem) : "wordnet_import.wni_role_info_p(elem) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return compatible_role_infos;
    }

    public static SubLObject wni_genl_preds_helper(final SubLObject compare_role_info, final SubLObject role_info) {
        assert NIL != wni_role_info_p(compare_role_info) : "wordnet_import.wni_role_info_p(compare_role_info) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(compare_role_info) " + compare_role_info;
        assert NIL != wni_role_info_p(role_info) : "wordnet_import.wni_role_info_p(role_info) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(role_info) " + role_info;
        final SubLObject compare_role = wni_role(compare_role_info);
        final SubLObject role = wni_role(role_info);
        if (compare_role.eql(role)) {
            return T;
        }
        if (NIL != genl_predicates.genl_predicateP(compare_role, role, UNPROVIDED, UNPROVIDED)) {
            return compare_role;
        }
        final SubLObject sentence = list($$genlPredsWRTTypes, compare_role, role, wni_defining_col(compare_role_info), wni_filler(role_info));
        final SubLObject query_properties = $list9;
        final SubLObject results = wni_trace_new_cyc_query(sentence, $$EverythingPSC, query_properties);
        if (results.equal($list239)) {
            return compare_role;
        }
        return NIL;
    }

    public static SubLObject wni_gather_roles(final SubLObject event_col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(event_col) : "forts.fort_p(event_col) " + "CommonSymbols.NIL != forts.fort_p(event_col) " + event_col;
        final SubLObject template = $list429;
        SubLObject sentence = NIL;
        final SubLObject query_properties = $list9;
        SubLObject v_bindings = NIL;
        SubLObject fillers = NIL;
        sentence = list($$and, listS($$genls, event_col, $list430), $list431, $list432, $list433, list($$or, list($$and, listS($$interArgIsa1_2, $sym436$_ROLE, event_col, $list437), list($$unknownSentence, list($$thereExists, $sym438$_FILLER_2, listS($$and, listS($$interArgIsa1_2, $sym436$_ROLE, event_col, $list439), $list440)))), listS($$and, list($$unknownSentence, list($$thereExists, $sym438$_FILLER_2, listS($$interArgIsa1_2, $sym436$_ROLE, event_col, $list439))), $list441)));
        thread.resetMultipleValues();
        SubLObject values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
        SubLObject results = thread.secondMultipleValue();
        SubLObject halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        v_bindings = values;
        sentence = list($$thereExists, $sym442$_COLL, listS($$and, listS($$genls, event_col, $list430), $list443));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        sentence = list($$thereExists, $sym444$_THING, listS($$and, listS($$genls, event_col, $list430), $list445));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        sentence = list($$thereExists, $sym446$_ROLE2, listS($$and, list($$assertedSentence, listS($$genlPredsWRTTypes, $sym436$_ROLE, $sym446$_ROLE2, event_col, $list437)), list($$equals, $sym449$_DEFINING_COLL, event_col), $list450));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        sentence = list($$thereExists, $sym446$_ROLE2, listS($$and, list($$assertedSentence, listS($$genlPredsWRTTypes, $sym446$_ROLE2, $sym436$_ROLE, event_col, $list437)), list($$equals, $sym449$_DEFINING_COLL, event_col), $list450));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        final SubLObject list_var;
        fillers = list_var = wni_most_specific_fillers(wni_bindings_to_role_infos(v_bindings));
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return fillers;
    }

    public static SubLObject wni_gather_traits(final SubLObject event_col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(event_col) : "forts.fort_p(event_col) " + "CommonSymbols.NIL != forts.fort_p(event_col) " + event_col;
        final SubLObject template = $list429;
        SubLObject sentence = NIL;
        final SubLObject query_properties = $list9;
        SubLObject v_bindings = NIL;
        SubLObject fillers = NIL;
        sentence = list($$and, listS($$genls, event_col, $list430), $list451, $list432, $list433, list($$or, list($$and, listS($$interArgIsa1_2, $sym436$_ROLE, event_col, $list437), list($$unknownSentence, list($$thereExists, $sym438$_FILLER_2, listS($$and, listS($$interArgIsa1_2, $sym436$_ROLE, event_col, $list439), $list440)))), listS($$and, list($$unknownSentence, list($$thereExists, $sym438$_FILLER_2, listS($$interArgIsa1_2, $sym436$_ROLE, event_col, $list439))), $list441)));
        thread.resetMultipleValues();
        SubLObject values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
        SubLObject results = thread.secondMultipleValue();
        SubLObject halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        v_bindings = values;
        sentence = list($$thereExists, $sym442$_COLL, listS($$and, listS($$genls, event_col, $list430), $list452));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        sentence = list($$thereExists, $sym444$_THING, listS($$and, listS($$genls, event_col, $list430), $list453));
        thread.resetMultipleValues();
        values = ask_utilities.query_template(template, sentence, $$EverythingPSC, query_properties);
        results = thread.secondMultipleValue();
        halt_reason = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        nconc(v_bindings, values);
        final SubLObject list_var;
        fillers = list_var = wni_most_specific_fillers(wni_bindings_to_role_infos(v_bindings));
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return fillers;
    }

    public static SubLObject wni_bindings_to_role_infos(final SubLObject v_bindings) {
        assert NIL != list_utilities.non_dotted_list_p(v_bindings) : "list_utilities.non_dotted_list_p(v_bindings) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(v_bindings) " + v_bindings;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != listp(elem) : "Types.listp(elem) " + "CommonSymbols.NIL != Types.listp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject wni_role_info = NIL;
        SubLObject wni_role_infos = NIL;
        SubLObject cdolist_list_var2 = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            wni_role_info = make_wni_role_info(UNPROVIDED);
            _csetf_wni_role(wni_role_info, binding.first());
            _csetf_wni_filler(wni_role_info, second(binding));
            _csetf_wni_defining_col(wni_role_info, third(binding));
            _csetf_wni_defining_pred(wni_role_info, fourth(binding));
            wni_role_infos = cons(wni_role_info, wni_role_infos);
            cdolist_list_var2 = cdolist_list_var2.rest();
            binding = cdolist_list_var2.first();
        } 
        final SubLObject list_var = wni_role_infos;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var3 = list_var;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var3.first();
        while (NIL != cdolist_list_var3) {
            assert NIL != wni_role_info_p(elem2) : "wordnet_import.wni_role_info_p(elem2) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(elem2) " + elem2;
            cdolist_list_var3 = cdolist_list_var3.rest();
            elem2 = cdolist_list_var3.first();
        } 
        return wni_role_infos;
    }

    public static SubLObject wni_sort_key_1(final SubLObject wni_role_info) {
        assert NIL != wni_role_info_p(wni_role_info) : "wordnet_import.wni_role_info_p(wni_role_info) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(wni_role_info) " + wni_role_info;
        final SubLObject key = cconcatenate(format(NIL, $str454$_A, wni_defining_col(wni_role_info)), new SubLObject[]{ $$$_, format(NIL, $str454$_A, wni_role(wni_role_info)) });
        assert NIL != stringp(key) : "Types.stringp(key) " + "CommonSymbols.NIL != Types.stringp(key) " + key;
        return key;
    }

    public static SubLObject wni_most_specific_fillers(final SubLObject wni_role_infos) {
        assert NIL != list_utilities.non_dotted_list_p(wni_role_infos) : "list_utilities.non_dotted_list_p(wni_role_infos) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(wni_role_infos) " + wni_role_infos;
        SubLObject cdolist_list_var = wni_role_infos;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != wni_role_info_p(elem) : "wordnet_import.wni_role_info_p(elem) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject sorted_role_infos = NIL;
        SubLObject result_role_infos = NIL;
        SubLObject best_role_info = NIL;
        SubLObject cdolist_list_var2;
        sorted_role_infos = cdolist_list_var2 = Sort.sort(wni_role_infos, symbol_function(STRING_LESSP), symbol_function(WNI_SORT_KEY_1));
        SubLObject role_info = NIL;
        role_info = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != best_role_info) {
                if ((!wni_role(role_info).eql(wni_role(best_role_info))) || (wni_role(role_info).eql(wni_role(best_role_info)) && (!wni_defining_col(role_info).eql(wni_defining_col(best_role_info))))) {
                    result_role_infos = cons(best_role_info, result_role_infos);
                    best_role_info = role_info;
                } else
                    if (NIL != genls.genlsP(wni_filler(role_info), wni_filler(best_role_info), UNPROVIDED, UNPROVIDED)) {
                        best_role_info = role_info;
                    }

            } else {
                best_role_info = role_info;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            role_info = cdolist_list_var2.first();
        } 
        result_role_infos = cons(best_role_info, result_role_infos);
        final SubLObject list_var;
        result_role_infos = list_var = nreverse(result_role_infos);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var3 = list_var;
        SubLObject elem2 = NIL;
        elem2 = cdolist_list_var3.first();
        while (NIL != cdolist_list_var3) {
            assert NIL != wni_role_info_p(elem2) : "wordnet_import.wni_role_info_p(elem2) " + "CommonSymbols.NIL != wordnet_import.wni_role_info_p(elem2) " + elem2;
            cdolist_list_var3 = cdolist_list_var3.rest();
            elem2 = cdolist_list_var3.first();
        } 
        return result_role_infos;
    }

    public static SubLObject wni_clear_function_caches() {
        clear_wni_synsets_for_english_word_string();
        clear_wni_synsets_for_english_word_stringXpos();
        clear_wni_synset_collectionP();
        clear_wni_synset_words_helper();
        clear_wni_synset_example_phrases_helper();
        clear_wni_synset_verb_frames_helper();
        clear_wni_verb_frames_for_word();
        clear_wni_hypernyms_helper();
        clear_wni_all_hypernyms_helper();
        clear_wni_derived_forms_helper();
        clear_wni_synset_gloss_helper();
        clear_wni_synset_pos_helper();
        clear_wni_synset_speech_part_offset_helper();
        clear_wni_synset_term_helper();
        clear_wni_synset_wXo_links_helper();
        clear_wni_synsets_caused_by_helper();
        clear_wni_synsets_causing_helper();
        clear_wni_broader_terms();
        final SubLObject problem_store = wni_problem_store();
        if (NIL != inference_datastructures_problem_store.problem_store_p(problem_store)) {
            inference_datastructures_problem_store.destroy_problem_store(problem_store);
        }
        return NIL;
    }

    public static SubLObject wni_create_workflow_alist_with_unmapped_hypernym_chain(final SubLObject unmapped_hypernym_chain, final SubLObject in_workflowP) {
        assert NIL != listp(unmapped_hypernym_chain) : "Types.listp(unmapped_hypernym_chain) " + "CommonSymbols.NIL != Types.listp(unmapped_hypernym_chain) " + unmapped_hypernym_chain;
        assert NIL != booleanp(in_workflowP) : "Types.booleanp(in_workflowP) " + "CommonSymbols.NIL != Types.booleanp(in_workflowP) " + in_workflowP;
        SubLObject workflow_alist = NIL;
        workflow_alist = cons(cons($str458$in_workflow_, NIL != in_workflowP ? $$$t : $$$nil), workflow_alist);
        workflow_alist = cons(cons($str460$unmapped_hypernym_chain, unmapped_hypernym_chain), workflow_alist);
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        return workflow_alist;
    }

    public static SubLObject wni_access_path_server() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_server($wordnet_import_access_path$.getGlobalValue());
    }

    public static SubLObject wni_access_path_port() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_port($wordnet_import_access_path$.getGlobalValue());
    }

    public static SubLObject wni_access_path_proxy_server() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_proxy_server($wordnet_import_access_path$.getGlobalValue());
    }

    public static SubLObject wni_access_path_proxy_port() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_proxy_port($wordnet_import_access_path$.getGlobalValue());
    }

    public static SubLObject wni_access_path_timeout() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_timeout($wordnet_import_access_path$.getGlobalValue());
    }

    public static SubLObject wni_access_path_db() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_db($wordnet_import_access_path$.getGlobalValue());
    }

    public static SubLObject wni_access_path_user() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_user($wordnet_import_access_path$.getGlobalValue());
    }

    public static SubLObject wni_access_path_password() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_password($wordnet_import_access_path$.getGlobalValue());
    }

    public static SubLObject wni_access_path_subprotocol() {
        if (NIL == $wordnet_import_access_path$.getGlobalValue()) {
            $wordnet_import_access_path$.setGlobalValue(sksi_access_path.external_source_access_path($const26$WordNet2_0_KS, UNPROVIDED, UNPROVIDED));
        }
        return sksi_access_path.access_path_subprotocol($wordnet_import_access_path$.getGlobalValue());
    }

    public static SubLObject declare_wordnet_import_file() {
        declareFunction(me, "initialize_wordnet_import_kb_feature", "INITIALIZE-WORDNET-IMPORT-KB-FEATURE", 0, 0, false);
        declareFunction(me, "clear_wni_unranked_synsets_for_english_word_string", "CLEAR-WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 0, 0, false);
        declareFunction(me, "remove_wni_unranked_synsets_for_english_word_string", "REMOVE-WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        declareFunction(me, "wni_unranked_synsets_for_english_word_string_internal", "WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_unranked_synsets_for_english_word_string", "WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        declareFunction(me, "clear_wni_synsets_for_english_word_stringXpos", "CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 0, 0, false);
        declareFunction(me, "remove_wni_synsets_for_english_word_stringXpos", "REMOVE-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 2, 0, false);
        declareFunction(me, "wni_synsets_for_english_word_stringXpos_internal", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-INTERNAL", 2, 0, false);
        declareFunction(me, "wni_synsets_for_english_word_stringXpos", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS", 2, 0, false);
        declareFunction(me, "clear_wni_synsets_for_english_word_string", "CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 0, 0, false);
        declareFunction(me, "remove_wni_synsets_for_english_word_string", "REMOVE-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        declareFunction(me, "wni_synsets_for_english_word_string_internal", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_synsets_for_english_word_string", "WNI-SYNSETS-FOR-ENGLISH-WORD-STRING", 1, 0, false);
        declareFunction(me, "clear_wni_synset_collectionP", "CLEAR-WNI-SYNSET-COLLECTION?", 0, 0, false);
        declareFunction(me, "remove_wni_synset_collectionP", "REMOVE-WNI-SYNSET-COLLECTION?", 1, 0, false);
        declareFunction(me, "wni_synset_collectionP_internal", "WNI-SYNSET-COLLECTION?-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_synset_collectionP", "WNI-SYNSET-COLLECTION?", 1, 0, false);
        declareFunction(me, "wni_synset_individuals", "WNI-SYNSET-INDIVIDUALS", 0, 0, false);
        declareFunction(me, "wni_exclude_situations", "WNI-EXCLUDE-SITUATIONS", 1, 0, false);
        declareFunction(me, "wni_exclude_relations", "WNI-EXCLUDE-RELATIONS", 1, 0, false);
        declareFunction(me, "wni_exclude_skipped", "WNI-EXCLUDE-SKIPPED", 1, 0, false);
        declareFunction(me, "wni_synset_id", "WNI-SYNSET-ID", 1, 0, false);
        declareFunction(me, "wni_synset_words", "WNI-SYNSET-WORDS", 1, 0, false);
        declareFunction(me, "wni_synsets_equal", "WNI-SYNSETS-EQUAL", 2, 0, false);
        declareFunction(me, "clear_wni_synset_words_helper", "CLEAR-WNI-SYNSET-WORDS-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_synset_words_helper", "REMOVE-WNI-SYNSET-WORDS-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_words_helper_internal", "WNI-SYNSET-WORDS-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_synset_words_helper", "WNI-SYNSET-WORDS-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_example_phrases", "WNI-SYNSET-EXAMPLE-PHRASES", 1, 0, false);
        declareFunction(me, "clear_wni_synset_example_phrases_helper", "CLEAR-WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_synset_example_phrases_helper", "REMOVE-WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_example_phrases_helper_internal", "WNI-SYNSET-EXAMPLE-PHRASES-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_synset_example_phrases_helper", "WNI-SYNSET-EXAMPLE-PHRASES-HELPER", 1, 0, false);
        declareFunction(me, "wni_most_general_synset_verb_frame", "WNI-MOST-GENERAL-SYNSET-VERB-FRAME", 1, 0, false);
        declareFunction(me, "wni_synset_verb_frames", "WNI-SYNSET-VERB-FRAMES", 1, 0, false);
        declareFunction(me, "clear_wni_synset_verb_frames_helper", "CLEAR-WNI-SYNSET-VERB-FRAMES-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_synset_verb_frames_helper", "REMOVE-WNI-SYNSET-VERB-FRAMES-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_verb_frames_helper_internal", "WNI-SYNSET-VERB-FRAMES-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_synset_verb_frames_helper", "WNI-SYNSET-VERB-FRAMES-HELPER", 1, 0, false);
        declareFunction(me, "clear_wni_verb_frames_for_word", "CLEAR-WNI-VERB-FRAMES-FOR-WORD", 0, 0, false);
        declareFunction(me, "remove_wni_verb_frames_for_word", "REMOVE-WNI-VERB-FRAMES-FOR-WORD", 1, 0, false);
        declareFunction(me, "wni_verb_frames_for_word_internal", "WNI-VERB-FRAMES-FOR-WORD-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_verb_frames_for_word", "WNI-VERB-FRAMES-FOR-WORD", 1, 0, false);
        declareFunction(me, "wni_hypernyms", "WNI-HYPERNYMS", 1, 0, false);
        declareFunction(me, "clear_wni_hypernyms_helper", "CLEAR-WNI-HYPERNYMS-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_hypernyms_helper", "REMOVE-WNI-HYPERNYMS-HELPER", 1, 0, false);
        declareFunction(me, "wni_hypernyms_helper_internal", "WNI-HYPERNYMS-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_hypernyms_helper", "WNI-HYPERNYMS-HELPER", 1, 0, false);
        declareFunction(me, "wni_all_hypernyms", "WNI-ALL-HYPERNYMS", 1, 0, false);
        declareFunction(me, "clear_wni_all_hypernyms_helper", "CLEAR-WNI-ALL-HYPERNYMS-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_all_hypernyms_helper", "REMOVE-WNI-ALL-HYPERNYMS-HELPER", 1, 0, false);
        declareFunction(me, "wni_all_hypernyms_helper_internal", "WNI-ALL-HYPERNYMS-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_all_hypernyms_helper", "WNI-ALL-HYPERNYMS-HELPER", 1, 0, false);
        declareFunction(me, "wni_all_hypernymP", "WNI-ALL-HYPERNYM?", 2, 0, false);
        declareFunction(me, "wni_hyponyms", "WNI-HYPONYMS", 1, 0, false);
        declareFunction(me, "clear_wni_hyponyms_helper", "CLEAR-WNI-HYPONYMS-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_hyponyms_helper", "REMOVE-WNI-HYPONYMS-HELPER", 1, 0, false);
        declareFunction(me, "wni_hyponyms_helper_internal", "WNI-HYPONYMS-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_hyponyms_helper", "WNI-HYPONYMS-HELPER", 1, 0, false);
        declareFunction(me, "wni_all_hyponyms", "WNI-ALL-HYPONYMS", 1, 0, false);
        declareFunction(me, "clear_wni_all_hyponyms_helper", "CLEAR-WNI-ALL-HYPONYMS-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_all_hyponyms_helper", "REMOVE-WNI-ALL-HYPONYMS-HELPER", 1, 0, false);
        declareFunction(me, "wni_all_hyponyms_helper_internal", "WNI-ALL-HYPONYMS-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_all_hyponyms_helper", "WNI-ALL-HYPONYMS-HELPER", 1, 0, false);
        declareFunction(me, "wni_any_hyponym_an_individual", "WNI-ANY-HYPONYM-AN-INDIVIDUAL", 1, 0, false);
        declareFunction(me, "wni_verb_is_derived_from_situation_nounP", "WNI-VERB-IS-DERIVED-FROM-SITUATION-NOUN?", 1, 0, false);
        declareFunction(me, "wni_derived_forms", "WNI-DERIVED-FORMS", 1, 0, false);
        declareFunction(me, "clear_wni_derived_forms_helper", "CLEAR-WNI-DERIVED-FORMS-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_derived_forms_helper", "REMOVE-WNI-DERIVED-FORMS-HELPER", 1, 0, false);
        declareFunction(me, "wni_derived_forms_helper_internal", "WNI-DERIVED-FORMS-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_derived_forms_helper", "WNI-DERIVED-FORMS-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_gloss", "WNI-SYNSET-GLOSS", 1, 0, false);
        declareFunction(me, "clear_wni_synset_gloss_helper", "CLEAR-WNI-SYNSET-GLOSS-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_synset_gloss_helper", "REMOVE-WNI-SYNSET-GLOSS-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_gloss_helper_internal", "WNI-SYNSET-GLOSS-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_synset_gloss_helper", "WNI-SYNSET-GLOSS-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_pos", "WNI-SYNSET-POS", 1, 0, false);
        declareFunction(me, "clear_wni_synset_pos_helper", "CLEAR-WNI-SYNSET-POS-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_synset_pos_helper", "REMOVE-WNI-SYNSET-POS-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_pos_helper_internal", "WNI-SYNSET-POS-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_synset_pos_helper", "WNI-SYNSET-POS-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_speech_part_offset", "WNI-SYNSET-SPEECH-PART-OFFSET", 1, 0, false);
        declareFunction(me, "clear_wni_synset_speech_part_offset_helper", "CLEAR-WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_synset_speech_part_offset_helper", "REMOVE-WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 2, 0, false);
        declareFunction(me, "wni_synset_speech_part_offset_helper_internal", "WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-INTERNAL", 2, 0, false);
        declareFunction(me, "wni_synset_speech_part_offset_helper", "WNI-SYNSET-SPEECH-PART-OFFSET-HELPER", 2, 0, false);
        declareFunction(me, "wni_hypernym_terms", "WNI-HYPERNYM-TERMS", 1, 0, false);
        declareFunction(me, "wni_hypernym_mappedP", "WNI-HYPERNYM-MAPPED?", 1, 0, false);
        declareFunction(me, "wni_synset_term", "WNI-SYNSET-TERM", 1, 0, false);
        declareFunction(me, "clear_wni_synset_term_helper", "CLEAR-WNI-SYNSET-TERM-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_synset_term_helper", "REMOVE-WNI-SYNSET-TERM-HELPER", 2, 0, false);
        declareFunction(me, "wni_synset_term_helper_internal", "WNI-SYNSET-TERM-HELPER-INTERNAL", 2, 0, false);
        declareFunction(me, "wni_synset_term_helper", "WNI-SYNSET-TERM-HELPER", 2, 0, false);
        declareFunction(me, "wni_unmapped_hypernym_chain", "WNI-UNMAPPED-HYPERNYM-CHAIN", 1, 0, false);
        declareFunction(me, "wni_synset_wXo_links", "WNI-SYNSET-W/O-LINKS", 1, 0, false);
        declareFunction(me, "clear_wni_synset_wXo_links_helper", "CLEAR-WNI-SYNSET-W/O-LINKS-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_synset_wXo_links_helper", "REMOVE-WNI-SYNSET-W/O-LINKS-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_wXo_links_helper_internal", "WNI-SYNSET-W/O-LINKS-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_synset_wXo_links_helper", "WNI-SYNSET-W/O-LINKS-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_is_causerP", "WNI-SYNSET-IS-CAUSER?", 1, 0, false);
        declareFunction(me, "wni_synsets_caused_by", "WNI-SYNSETS-CAUSED-BY", 1, 0, false);
        declareFunction(me, "clear_wni_synsets_caused_by_helper", "CLEAR-WNI-SYNSETS-CAUSED-BY-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_synsets_caused_by_helper", "REMOVE-WNI-SYNSETS-CAUSED-BY-HELPER", 1, 0, false);
        declareFunction(me, "wni_synsets_caused_by_helper_internal", "WNI-SYNSETS-CAUSED-BY-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_synsets_caused_by_helper", "WNI-SYNSETS-CAUSED-BY-HELPER", 1, 0, false);
        declareFunction(me, "wni_synset_is_caused_byP", "WNI-SYNSET-IS-CAUSED-BY?", 1, 0, false);
        declareFunction(me, "wni_synsets_causing", "WNI-SYNSETS-CAUSING", 1, 0, false);
        declareFunction(me, "clear_wni_synsets_causing_helper", "CLEAR-WNI-SYNSETS-CAUSING-HELPER", 0, 0, false);
        declareFunction(me, "remove_wni_synsets_causing_helper", "REMOVE-WNI-SYNSETS-CAUSING-HELPER", 1, 0, false);
        declareFunction(me, "wni_synsets_causing_helper_internal", "WNI-SYNSETS-CAUSING-HELPER-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_synsets_causing_helper", "WNI-SYNSETS-CAUSING-HELPER", 1, 0, false);
        declareFunction(me, "wni_urban_area_geographical_entity", "WNI-URBAN-AREA-GEOGRAPHICAL-ENTITY", 1, 0, false);
        declareFunction(me, "wni_synsets_having_pos", "WNI-SYNSETS-HAVING-POS", 1, 0, false);
        declareFunction(me, "wni_terms_synsets", "WNI-TERMS-SYNSETS", 1, 0, false);
        declareFunction(me, "clear_wni_broader_terms", "CLEAR-WNI-BROADER-TERMS", 0, 0, false);
        declareFunction(me, "remove_wni_broader_terms", "REMOVE-WNI-BROADER-TERMS", 1, 0, false);
        declareFunction(me, "wni_broader_terms_internal", "WNI-BROADER-TERMS-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_broader_terms", "WNI-BROADER-TERMS", 1, 0, false);
        declareFunction(me, "wni_mapped_terms_and_synsets", "WNI-MAPPED-TERMS-AND-SYNSETS", 1, 0, false);
        declareFunction(me, "wni_synset_hypernyms_mappedP", "WNI-SYNSET-HYPERNYMS-MAPPED?", 1, 0, false);
        declareFunction(me, "wni_mapped_terms", "WNI-MAPPED-TERMS", 0, 0, false);
        declareFunction(me, "wni_mapped_terms_and_pos_offsets", "WNI-MAPPED-TERMS-AND-POS-OFFSETS", 0, 0, false);
        declareFunction(me, "wni_speech_part_offset_to_synset", "WNI-SPEECH-PART-OFFSET-TO-SYNSET", 1, 0, false);
        declareFunction(me, "wni_update_synset_with_term", "WNI-UPDATE-SYNSET-WITH-TERM", 2, 0, false);
        declareFunction(me, "wni_insert_concept_match_html", "WNI-INSERT-CONCEPT-MATCH-HTML", 2, 0, false);
        declareFunction(me, "wni_select_concept_match_html", "WNI-SELECT-CONCEPT-MATCH-HTML", 1, 0, false);
        declareFunction(me, "wni_delete_concept_match_html", "WNI-DELETE-CONCEPT-MATCH-HTML", 1, 0, false);
        declareFunction(me, "wni_delete_all_concept_match_html", "WNI-DELETE-ALL-CONCEPT-MATCH-HTML", 0, 0, false);
        declareFunction(me, "wni_unmapped_synsets_having_mapped_hypernym", "WNI-UNMAPPED-SYNSETS-HAVING-MAPPED-HYPERNYM", 1, 0, false);
        declareFunction(me, "wni_trace_new_cyc_query", "WNI-TRACE-NEW-CYC-QUERY", 3, 0, false);
        declareFunction(me, "wni_problem_store", "WNI-PROBLEM-STORE", 0, 0, false);
        declareFunction(me, "new_wni_problem_store", "NEW-WNI-PROBLEM-STORE", 0, 0, false);
        declareFunction(me, "wni_problem_store_properties", "WNI-PROBLEM-STORE-PROPERTIES", 0, 0, false);
        declareFunction(me, "wni_unreified_synset", "WNI-UNREIFIED-SYNSET", 1, 0, false);
        declareFunction(me, "wni_reifiable_synset", "WNI-REIFIABLE-SYNSET", 1, 0, false);
        declareFunction(me, "wni_reifiable_synset_from_string", "WNI-REIFIABLE-SYNSET-FROM-STRING", 1, 0, false);
        declareFunction(me, "wni_synset_from_id_string", "WNI-SYNSET-FROM-ID-STRING", 1, 0, false);
        declareFunction(me, "wni_ensure_naut", "WNI-ENSURE-NAUT", 1, 0, false);
        declareFunction(me, "wni_next_synset_with_status", "WNI-NEXT-SYNSET-WITH-STATUS", 1, 0, false);
        declareFunction(me, "wni_unlocked_synsets_with_status", "WNI-UNLOCKED-SYNSETS-WITH-STATUS", 1, 0, false);
        declareFunction(me, "wni_term_has_verb_semtransP", "WNI-TERM-HAS-VERB-SEMTRANS?", 1, 0, false);
        declareFunction(me, "clear_wni_term_has_verb_semtrans_helperP", "CLEAR-WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 0, 0, false);
        declareFunction(me, "remove_wni_term_has_verb_semtrans_helperP", "REMOVE-WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 1, 0, false);
        declareFunction(me, "wni_term_has_verb_semtrans_helperP_internal", "WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_term_has_verb_semtrans_helperP", "WNI-TERM-HAS-VERB-SEMTRANS-HELPER?", 1, 0, false);
        declareFunction(me, "wni_gather_terms_for_matching", "WNI-GATHER-TERMS-FOR-MATCHING", 1, 0, false);
        declareFunction(me, "wni_exact_synset_term_matches", "WNI-EXACT-SYNSET-TERM-MATCHES", 1, 0, false);
        declareFunction(me, "wni_strong_synset_term_matches", "WNI-STRONG-SYNSET-TERM-MATCHES", 2, 0, false);
        declareFunction(me, "wni_weak_synset_term_matches", "WNI-WEAK-SYNSET-TERM-MATCHES", 2, 1, false);
        declareFunction(me, "wni_create_now", "WNI-CREATE-NOW", 1, 0, false);
        declareFunction(me, "wni_assert_wff", "WNI-ASSERT-WFF", 4, 1, false);
        declareFunction(me, "wni_unassert_import_statuses", "WNI-UNASSERT-IMPORT-STATUSES", 2, 1, false);
        declareFunction(me, "wni_unassert_import_status", "WNI-UNASSERT-IMPORT-STATUS", 2, 1, false);
        declareFunction(me, "wni_assert_import_statuses", "WNI-ASSERT-IMPORT-STATUSES", 2, 1, false);
        declareFunction(me, "wni_assert_import_status", "WNI-ASSERT-IMPORT-STATUS", 2, 1, false);
        declareFunction(me, "wni_assert_synset_mapping", "WNI-ASSERT-SYNSET-MAPPING", 2, 1, false);
        declareFunction(me, "wni_assert_likely_synset_mapping", "WNI-ASSERT-LIKELY-SYNSET-MAPPING", 2, 1, false);
        declareFunction(me, "wni_assert_quoted_isa_workflow_constant", "WNI-ASSERT-QUOTED-ISA-WORKFLOW-CONSTANT", 1, 1, false);
        declareFunction(me, "wni_assert_isa_collection", "WNI-ASSERT-ISA-COLLECTION", 1, 1, false);
        declareFunction(me, "wni_assert_genls", "WNI-ASSERT-GENLS", 2, 1, false);
        declareFunction(me, "wni_unassert_genls", "WNI-UNASSERT-GENLS", 2, 1, false);
        declareFunction(me, "wni_assert_isa", "WNI-ASSERT-ISA", 2, 1, false);
        declareFunction(me, "wni_assert_isa_individual", "WNI-ASSERT-ISA-INDIVIDUAL", 1, 1, false);
        declareFunction(me, "wni_assert_isa_agent_generic", "WNI-ASSERT-ISA-AGENT-GENERIC", 1, 1, false);
        declareFunction(me, "wni_assert_reified_using", "WNI-ASSERT-REIFIED-USING", 1, 1, false);
        declareFunction(me, "wni_synset_note", "WNI-SYNSET-NOTE", 1, 0, false);
        declareFunction(me, "wni_assert_synset_note", "WNI-ASSERT-SYNSET-NOTE", 2, 0, false);
        declareFunction(me, "wni_unassert_synset_note", "WNI-UNASSERT-SYNSET-NOTE", 2, 0, false);
        declareFunction(me, "wni_assert_comment", "WNI-ASSERT-COMMENT", 2, 1, false);
        declareFunction(me, "wni_assert_term_of_unit", "WNI-ASSERT-TERM-OF-UNIT", 1, 0, false);
        declareFunction(me, "wni_lock_synset", "WNI-LOCK-SYNSET", 1, 0, false);
        declareFunction(me, "wni_unlock_synset", "WNI-UNLOCK-SYNSET", 1, 1, false);
        declareFunction(me, "wni_assert_heuristic_lexicon", "WNI-ASSERT-HEURISTIC-LEXICON", 3, 1, false);
        declareFunction(me, "wni_assert_heuristic_lexicon_for_collection", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-COLLECTION", 3, 1, false);
        declareFunction(me, "wni_assert_heuristic_lexicon_for_collection_common", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-COLLECTION-COMMON", 4, 1, false);
        declareFunction(me, "wni_assert_heuristic_lexicon_for_individual", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-INDIVIDUAL", 3, 1, false);
        declareFunction(me, "wni_assert_heuristic_lexicon_for_organism", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-ORGANISM", 3, 1, false);
        declareFunction(me, "wni_assert_heuristic_lexicon_for_chemical", "WNI-ASSERT-HEURISTIC-LEXICON-FOR-CHEMICAL", 2, 1, false);
        declareFunction(me, "wni_assert_lexicon_for_hyphen_string", "WNI-ASSERT-LEXICON-FOR-HYPHEN-STRING", 4, 1, false);
        declareFunction(me, "wni_assert_lexicon_for_phrase", "WNI-ASSERT-LEXICON-FOR-PHRASE", 4, 1, false);
        declareFunction(me, "wni_assert_lexicon_for_multi_word_string", "WNI-ASSERT-LEXICON-FOR-MULTI-WORD-STRING", 4, 1, false);
        declareFunction(me, "wni_assert_lexicon_for_compound_string", "WNI-ASSERT-LEXICON-FOR-COMPOUND-STRING", 4, 1, false);
        declareFunction(me, "wni_assert_lexicon_for_denotation", "WNI-ASSERT-LEXICON-FOR-DENOTATION", 4, 1, false);
        declareFunction(me, "wni_assert_lexicon_for_existing_denotation", "WNI-ASSERT-LEXICON-FOR-EXISTING-DENOTATION", 4, 1, false);
        declareFunction(me, "wni_assert_lexical_annotations", "WNI-ASSERT-LEXICAL-ANNOTATIONS", 3, 1, false);
        declareFunction(me, "wni_politeness", "WNI-POLITENESS", 2, 0, false);
        declareFunction(me, "wni_formality", "WNI-FORMALITY", 2, 0, false);
        declareFunction(me, "wni_rhetorical_device", "WNI-RHETORICAL-DEVICE", 2, 0, false);
        declareFunction(me, "wni_assert_lexicon_for_person", "WNI-ASSERT-LEXICON-FOR-PERSON", 2, 1, false);
        declareFunction(me, "wni_assert_lexicon_for_urban_area", "WNI-ASSERT-LEXICON-FOR-URBAN-AREA", 2, 1, false);
        declareFunction(me, "wni_assert_lexicon_for_geographical_area", "WNI-ASSERT-LEXICON-FOR-GEOGRAPHICAL-AREA", 2, 1, false);
        declareFunction(me, "wni_assert_name_string", "WNI-ASSERT-NAME-STRING", 2, 1, false);
        declareFunction(me, "wni_assert_acronym", "WNI-ASSERT-ACRONYM", 2, 1, false);
        declareFunction(me, "wni_assert_initialism", "WNI-ASSERT-INITIALISM", 2, 1, false);
        declareFunction(me, "wni_heuristic_pos", "WNI-HEURISTIC-POS", 3, 0, false);
        declareFunction(me, "wni_number_of_workflow_mapped_terms", "WNI-NUMBER-OF-WORKFLOW-MAPPED-TERMS", 0, 0, false);
        declareFunction(me, "wni_number_of_new_concepts_imported_from_wordnet", "WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET", 0, 0, false);
        declareFunction(me, "wni_number_of_new_denotations_imported_from_wordet", "WNI-NUMBER-OF-NEW-DENOTATIONS-IMPORTED-FROM-WORDET", 0, 0, false);
        declareFunction(me, "wni_role_info_print_function_trampoline", "WNI-ROLE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "wni_role_info_p", "WNI-ROLE-INFO-P", 1, 0, false);
        new wordnet_import.$wni_role_info_p$UnaryFunction();
        declareFunction(me, "wni_role", "WNI-ROLE", 1, 0, false);
        declareFunction(me, "wni_filler", "WNI-FILLER", 1, 0, false);
        declareFunction(me, "wni_defining_col", "WNI-DEFINING-COL", 1, 0, false);
        declareFunction(me, "wni_defining_pred", "WNI-DEFINING-PRED", 1, 0, false);
        declareFunction(me, "wni_subsumption_status", "WNI-SUBSUMPTION-STATUS", 1, 0, false);
        declareFunction(me, "_csetf_wni_role", "_CSETF-WNI-ROLE", 2, 0, false);
        declareFunction(me, "_csetf_wni_filler", "_CSETF-WNI-FILLER", 2, 0, false);
        declareFunction(me, "_csetf_wni_defining_col", "_CSETF-WNI-DEFINING-COL", 2, 0, false);
        declareFunction(me, "_csetf_wni_defining_pred", "_CSETF-WNI-DEFINING-PRED", 2, 0, false);
        declareFunction(me, "_csetf_wni_subsumption_status", "_CSETF-WNI-SUBSUMPTION-STATUS", 2, 0, false);
        declareFunction(me, "make_wni_role_info", "MAKE-WNI-ROLE-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_wni_role_info", "VISIT-DEFSTRUCT-WNI-ROLE-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_wni_role_info_method", "VISIT-DEFSTRUCT-OBJECT-WNI-ROLE-INFO-METHOD", 2, 0, false);
        declareFunction(me, "wni_print_role_info", "WNI-PRINT-ROLE-INFO", 3, 0, false);
        declareFunction(me, "wni_gather_roles_and_traits", "WNI-GATHER-ROLES-AND-TRAITS", 1, 0, false);
        declareFunction(me, "wni_find_compatible_roles", "WNI-FIND-COMPATIBLE-ROLES", 2, 0, false);
        declareFunction(me, "wni_genl_preds_helper", "WNI-GENL-PREDS-HELPER", 2, 0, false);
        declareFunction(me, "wni_gather_roles", "WNI-GATHER-ROLES", 1, 0, false);
        declareFunction(me, "wni_gather_traits", "WNI-GATHER-TRAITS", 1, 0, false);
        declareFunction(me, "wni_bindings_to_role_infos", "WNI-BINDINGS-TO-ROLE-INFOS", 1, 0, false);
        declareFunction(me, "wni_sort_key_1", "WNI-SORT-KEY-1", 1, 0, false);
        declareFunction(me, "wni_most_specific_fillers", "WNI-MOST-SPECIFIC-FILLERS", 1, 0, false);
        declareFunction(me, "wni_clear_function_caches", "WNI-CLEAR-FUNCTION-CACHES", 0, 0, false);
        declareFunction(me, "wni_create_workflow_alist_with_unmapped_hypernym_chain", "WNI-CREATE-WORKFLOW-ALIST-WITH-UNMAPPED-HYPERNYM-CHAIN", 2, 0, false);
        declareFunction(me, "wni_access_path_server", "WNI-ACCESS-PATH-SERVER", 0, 0, false);
        declareFunction(me, "wni_access_path_port", "WNI-ACCESS-PATH-PORT", 0, 0, false);
        declareFunction(me, "wni_access_path_proxy_server", "WNI-ACCESS-PATH-PROXY-SERVER", 0, 0, false);
        declareFunction(me, "wni_access_path_proxy_port", "WNI-ACCESS-PATH-PROXY-PORT", 0, 0, false);
        declareFunction(me, "wni_access_path_timeout", "WNI-ACCESS-PATH-TIMEOUT", 0, 0, false);
        declareFunction(me, "wni_access_path_db", "WNI-ACCESS-PATH-DB", 0, 0, false);
        declareFunction(me, "wni_access_path_user", "WNI-ACCESS-PATH-USER", 0, 0, false);
        declareFunction(me, "wni_access_path_password", "WNI-ACCESS-PATH-PASSWORD", 0, 0, false);
        declareFunction(me, "wni_access_path_subprotocol", "WNI-ACCESS-PATH-SUBPROTOCOL", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_wordnet_import_file() {
        deflexical("*WORDNET-IMPORT-CORE-CONSTANTS*", $list0);
        defconstant("*WNI-POS-MAP*", $list2);
        defconstant("*WNI-1-CHAR-POS-MAP*", $list3);
        deflexical("*WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-FOR-ENGLISH-WORD-STRING-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-COLLECTION?-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-WORDS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-EXAMPLE-PHRASES-HELPER-CACHING-STATE*", NIL);
        defconstant("*WNI-VERB-FRAME-GENERALITIES*", $list65);
        defconstant("*WNI-LEAST-GENERAL-FRAME-GENERALITY-SCORE*", SIX_INTEGER);
        deflexical("*WNI-SYNSET-VERB-FRAMES-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-VERB-FRAMES-FOR-WORD-CACHING-STATE*", NIL);
        deflexical("*WNI-HYPERNYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-ALL-HYPERNYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-HYPONYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-ALL-HYPONYMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-DERIVED-FORMS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-GLOSS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-POS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-SPEECH-PART-OFFSET-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-TERM-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSET-W/O-LINKS-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-CAUSED-BY-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-SYNSETS-CAUSING-HELPER-CACHING-STATE*", NIL);
        deflexical("*WNI-BROADER-TERMS-CACHING-STATE*", NIL);
        defparameter("*WNI-PROBLEM-STORE*", NIL);
        deflexical("*WNI-TERM-HAS-VERB-SEMTRANS-HELPER?-CACHING-STATE*", NIL);
        defconstant("*WNI-MAXIMUM-NBR-OF-TERMS-TO-GATHER-FOR-MATCHING*", TWENTY_INTEGER);
        defparameter("*WNI-VERY-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", NIL);
        defparameter("*WNI-VERBOSE-EXACT-SYNSET-TERM-MATCHES*", NIL);
        defconstant("*PERSON-SYNSET*", $list309);
        defconstant("*ORGANISM-BEING-SYNSET*", $list310);
        defconstant("*CHEMICAL-COMPOUND-SYNSET*", $list311);
        defconstant("*COUNTRY-SYNSET*", $list313);
        defconstant("*URBAN-AREA-SYNSET*", $list314);
        defconstant("*GEOGRAPHICAL-AREA-SYNSET*", $list315);
        defconstant("*DTP-WNI-ROLE-INFO*", WNI_ROLE_INFO);
        deflexical("*WORDNET-IMPORT-ACCESS-PATH*", NIL);
        return NIL;
    }

    public static SubLObject setup_wordnet_import_file() {
        memoization_state.note_globally_cached_function(WNI_UNRANKED_SYNSETS_FOR_ENGLISH_WORD_STRING);
        memoization_state.note_globally_cached_function($sym14$WNI_SYNSETS_FOR_ENGLISH_WORD_STRING_POS);
        memoization_state.note_globally_cached_function(WNI_SYNSETS_FOR_ENGLISH_WORD_STRING);
        memoization_state.note_globally_cached_function($sym29$WNI_SYNSET_COLLECTION_);
        register_external_symbol(WNI_SYNSET_INDIVIDUALS);
        register_external_symbol(WNI_EXCLUDE_SITUATIONS);
        register_external_symbol(WNI_EXCLUDE_RELATIONS);
        register_external_symbol(WNI_EXCLUDE_SKIPPED);
        register_external_symbol(WNI_SYNSET_ID);
        register_external_symbol(WNI_SYNSET_WORDS);
        register_external_symbol(WNI_SYNSETS_EQUAL);
        memoization_state.note_globally_cached_function(WNI_SYNSET_WORDS_HELPER);
        register_external_symbol(WNI_SYNSET_EXAMPLE_PHRASES);
        memoization_state.note_globally_cached_function(WNI_SYNSET_EXAMPLE_PHRASES_HELPER);
        register_external_symbol(WNI_MOST_GENERAL_SYNSET_VERB_FRAME);
        register_external_symbol(WNI_SYNSET_VERB_FRAMES);
        memoization_state.note_globally_cached_function(WNI_SYNSET_VERB_FRAMES_HELPER);
        memoization_state.note_globally_cached_function(WNI_VERB_FRAMES_FOR_WORD);
        register_external_symbol(WNI_HYPERNYMS);
        memoization_state.note_globally_cached_function(WNI_HYPERNYMS_HELPER);
        register_external_symbol(WNI_ALL_HYPERNYMS);
        memoization_state.note_globally_cached_function(WNI_ALL_HYPERNYMS_HELPER);
        register_external_symbol($sym85$WNI_ALL_HYPERNYM_);
        register_external_symbol(WNI_HYPONYMS);
        memoization_state.note_globally_cached_function(WNI_HYPONYMS_HELPER);
        register_external_symbol(WNI_ALL_HYPONYMS);
        memoization_state.note_globally_cached_function(WNI_ALL_HYPONYMS_HELPER);
        register_external_symbol(WNI_ANY_HYPONYM_AN_INDIVIDUAL);
        register_external_symbol($sym94$WNI_VERB_IS_DERIVED_FROM_SITUATION_NOUN_);
        register_external_symbol(WNI_DERIVED_FORMS);
        memoization_state.note_globally_cached_function(WNI_DERIVED_FORMS_HELPER);
        register_external_symbol(WNI_SYNSET_GLOSS);
        memoization_state.note_globally_cached_function(WNI_SYNSET_GLOSS_HELPER);
        register_external_symbol(WNI_SYNSET_POS);
        memoization_state.note_globally_cached_function(WNI_SYNSET_POS_HELPER);
        register_external_symbol(WNI_SYNSET_SPEECH_PART_OFFSET);
        memoization_state.note_globally_cached_function(WNI_SYNSET_SPEECH_PART_OFFSET_HELPER);
        register_external_symbol(WNI_HYPERNYM_TERMS);
        register_external_symbol($sym122$WNI_HYPERNYM_MAPPED_);
        register_external_symbol(WNI_SYNSET_TERM);
        memoization_state.note_globally_cached_function(WNI_SYNSET_TERM_HELPER);
        register_external_symbol(WNI_UNMAPPED_HYPERNYM_CHAIN);
        register_external_symbol($sym132$WNI_SYNSET_W_O_LINKS);
        memoization_state.note_globally_cached_function($sym133$WNI_SYNSET_W_O_LINKS_HELPER);
        register_external_symbol($sym139$WNI_SYNSET_IS_CAUSER_);
        register_external_symbol(WNI_SYNSETS_CAUSED_BY);
        memoization_state.note_globally_cached_function(WNI_SYNSETS_CAUSED_BY_HELPER);
        register_external_symbol($sym145$WNI_SYNSET_IS_CAUSED_BY_);
        register_external_symbol(WNI_SYNSETS_CAUSING);
        memoization_state.note_globally_cached_function(WNI_SYNSETS_CAUSING_HELPER);
        register_external_symbol(WNI_SYNSETS_HAVING_POS);
        register_external_symbol(WNI_TERMS_SYNSETS);
        memoization_state.note_globally_cached_function(WNI_BROADER_TERMS);
        register_external_symbol(WNI_MAPPED_TERMS_AND_SYNSETS);
        register_external_symbol($sym182$WNI_SYNSET_HYPERNYMS_MAPPED_);
        register_external_symbol(WNI_MAPPED_TERMS);
        register_external_symbol(WNI_MAPPED_TERMS_AND_POS_OFFSETS);
        register_external_symbol(WNI_SPEECH_PART_OFFSET_TO_SYNSET);
        register_external_symbol(WNI_UPDATE_SYNSET_WITH_TERM);
        register_external_symbol(WNI_INSERT_CONCEPT_MATCH_HTML);
        register_external_symbol(WNI_SELECT_CONCEPT_MATCH_HTML);
        register_external_symbol(WNI_DELETE_CONCEPT_MATCH_HTML);
        register_external_symbol(WNI_DELETE_ALL_CONCEPT_MATCH_HTML);
        register_external_symbol(WNI_UNMAPPED_SYNSETS_HAVING_MAPPED_HYPERNYM);
        register_external_symbol(WNI_UNREIFIED_SYNSET);
        register_external_symbol(WNI_REIFIABLE_SYNSET);
        register_external_symbol(WNI_REIFIABLE_SYNSET_FROM_STRING);
        register_external_symbol(WNI_SYNSET_FROM_ID_STRING);
        register_external_symbol(WNI_ENSURE_NAUT);
        register_external_symbol(WNI_NEXT_SYNSET_WITH_STATUS);
        register_external_symbol(WNI_UNLOCKED_SYNSETS_WITH_STATUS);
        register_external_symbol($sym227$WNI_TERM_HAS_VERB_SEMTRANS_);
        memoization_state.note_globally_cached_function($sym228$WNI_TERM_HAS_VERB_SEMTRANS_HELPER_);
        register_external_symbol(WNI_GATHER_TERMS_FOR_MATCHING);
        register_external_symbol(WNI_EXACT_SYNSET_TERM_MATCHES);
        register_external_symbol(WNI_STRONG_SYNSET_TERM_MATCHES);
        register_external_symbol(WNI_WEAK_SYNSET_TERM_MATCHES);
        register_external_symbol(WNI_CREATE_NOW);
        register_external_symbol(WNI_ASSERT_WFF);
        register_external_symbol(WNI_UNASSERT_IMPORT_STATUSES);
        register_external_symbol(WNI_UNASSERT_IMPORT_STATUS);
        register_external_symbol(WNI_ASSERT_IMPORT_STATUSES);
        register_external_symbol(WNI_ASSERT_IMPORT_STATUS);
        register_external_symbol(WNI_ASSERT_SYNSET_MAPPING);
        register_external_symbol(WNI_ASSERT_LIKELY_SYNSET_MAPPING);
        register_external_symbol(WNI_ASSERT_QUOTED_ISA_WORKFLOW_CONSTANT);
        register_external_symbol(WNI_ASSERT_ISA_COLLECTION);
        register_external_symbol(WNI_ASSERT_GENLS);
        register_external_symbol(WNI_UNASSERT_GENLS);
        register_external_symbol(WNI_ASSERT_ISA);
        register_external_symbol(WNI_ASSERT_ISA_INDIVIDUAL);
        register_external_symbol(WNI_ASSERT_ISA_AGENT_GENERIC);
        register_external_symbol(WNI_ASSERT_REIFIED_USING);
        register_external_symbol(WNI_SYNSET_NOTE);
        register_external_symbol(WNI_ASSERT_SYNSET_NOTE);
        register_external_symbol(WNI_UNASSERT_SYNSET_NOTE);
        register_external_symbol(WNI_ASSERT_COMMENT);
        register_external_symbol(WNI_ASSERT_TERM_OF_UNIT);
        register_external_symbol(WNI_LOCK_SYNSET);
        register_external_symbol(WNI_UNLOCK_SYNSET);
        register_external_symbol(WNI_ASSERT_HEURISTIC_LEXICON);
        register_external_symbol(WNI_NUMBER_OF_WORKFLOW_MAPPED_TERMS);
        register_external_symbol(WNI_NUMBER_OF_NEW_CONCEPTS_IMPORTED_FROM_WORDNET);
        register_external_symbol(WNI_NUMBER_OF_NEW_DENOTATIONS_IMPORTED_FROM_WORDET);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_wni_role_info$.getGlobalValue(), symbol_function(WNI_ROLE_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list401);
        def_csetf(WNI_ROLE, _CSETF_WNI_ROLE);
        def_csetf(WNI_FILLER, _CSETF_WNI_FILLER);
        def_csetf(WNI_DEFINING_COL, _CSETF_WNI_DEFINING_COL);
        def_csetf(WNI_DEFINING_PRED, _CSETF_WNI_DEFINING_PRED);
        def_csetf(WNI_SUBSUMPTION_STATUS, _CSETF_WNI_SUBSUMPTION_STATUS);
        identity(WNI_ROLE_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_wni_role_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_WNI_ROLE_INFO_METHOD));
        register_external_symbol(WNI_GATHER_ROLES_AND_TRAITS);
        register_external_symbol(WNI_FIND_COMPATIBLE_ROLES);
        register_external_symbol(WNI_CLEAR_FUNCTION_CACHES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_wordnet_import_file();
    }

    @Override
    public void initializeVariables() {
        init_wordnet_import_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_wordnet_import_file();
    }

    

    public static final class $wni_role_info_native extends SubLStructNative {
        public SubLObject $role;

        public SubLObject $filler;

        public SubLObject $defining_col;

        public SubLObject $defining_pred;

        public SubLObject $subsumption_status;

        private static final SubLStructDeclNative structDecl;

        private $wni_role_info_native() {
            this.$role = Lisp.NIL;
            this.$filler = Lisp.NIL;
            this.$defining_col = Lisp.NIL;
            this.$defining_pred = Lisp.NIL;
            this.$subsumption_status = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$role;
        }

        @Override
        public SubLObject getField3() {
            return this.$filler;
        }

        @Override
        public SubLObject getField4() {
            return this.$defining_col;
        }

        @Override
        public SubLObject getField5() {
            return this.$defining_pred;
        }

        @Override
        public SubLObject getField6() {
            return this.$subsumption_status;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$role = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$filler = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$defining_col = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$defining_pred = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$subsumption_status = value;
        }

        static {
            structDecl = makeStructDeclNative($wni_role_info_native.class, WNI_ROLE_INFO, WNI_ROLE_INFO_P, $list395, $list396, new String[]{ "$role", "$filler", "$defining_col", "$defining_pred", "$subsumption_status" }, $list397, $list398, WNI_PRINT_ROLE_INFO);
        }
    }

    public static final class $wni_role_info_p$UnaryFunction extends UnaryFunction {
        public $wni_role_info_p$UnaryFunction() {
            super(extractFunctionNamed("WNI-ROLE-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return wni_role_info_p(arg1);
        }
    }
}

/**
 * Total time: 2268 ms synthetic
 */
