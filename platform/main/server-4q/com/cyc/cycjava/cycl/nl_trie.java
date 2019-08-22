package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class nl_trie extends SubLTranslatedFile {
    public static final SubLFile me = new nl_trie();

    public static final String myName = "com.cyc.cycjava.cycl.nl_trie";

    public static final String myFingerPrint = "4ea78b3ba04d03c5abb643b4dbafcdc3e81514d51590c10f1e2f6c803c2df4d4";

    // deflexical
    // Definitions
    // The default key test for the NL trie--the cache needs to know about this.
    private static final SubLSymbol $nl_trie_default_test$ = makeSymbol("*NL-TRIE-DEFAULT-TEST*");

    // deflexical
    // The window of the NL trie that will be kept in memory at the same time.
    private static final SubLSymbol $default_nl_trie_cache_strategy_size$ = makeSymbol("*DEFAULT-NL-TRIE-CACHE-STRATEGY-SIZE*");





    // defconstant
    private static final SubLSymbol $english_definite_determiner$ = makeSymbol("*ENGLISH-DEFINITE-DETERMINER*");

    // deflexical
    private static final SubLSymbol $nl_trie_word_denot_invalidity_tests$ = makeSymbol("*NL-TRIE-WORD-DENOT-INVALIDITY-TESTS*");

    // defconstant
    public static final SubLSymbol $dtp_nl_trie_word_struc$ = makeSymbol("*DTP-NL-TRIE-WORD-STRUC*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_nl_trie_word_struc$ = makeSymbol("*CFASL-OPCODE-NL-TRIE-WORD-STRUC*");

    // deflexical
    private static final SubLSymbol $nl_trie_word_semantic_support_set_test$ = makeSymbol("*NL-TRIE-WORD-SEMANTIC-SUPPORT-SET-TEST*");

    // deflexical
    private static final SubLSymbol $nl_trie_word_syntactic_support_set_test$ = makeSymbol("*NL-TRIE-WORD-SYNTACTIC-SUPPORT-SET-TEST*");

    // defparameter
    private static final SubLSymbol $call_to_nl_trie_word_syntactic_supports_licensedP$ = makeSymbol("*CALL-TO-NL-TRIE-WORD-SYNTACTIC-SUPPORTS-LICENSED?*");

    // defparameter
    private static final SubLSymbol $call_to_nl_trie_word_semantic_supports_licensedP$ = makeSymbol("*CALL-TO-NL-TRIE-WORD-SEMANTIC-SUPPORTS-LICENSED?*");



    // deflexical
    private static final SubLSymbol $nl_trie_preferred_semantic_predicates$ = makeSymbol("*NL-TRIE-PREFERRED-SEMANTIC-PREDICATES*");



















    // defparameter
    private static final SubLSymbol $nl_trie_entry_filter_stack$ = makeSymbol("*NL-TRIE-ENTRY-FILTER-STACK*");



    // defparameter
    private static final SubLSymbol $catch_nl_trie_errorsP$ = makeSymbol("*CATCH-NL-TRIE-ERRORS?*");





    // deflexical
    private static final SubLSymbol $nl_trie_pred_ok_for_posP_caching_state$ = makeSymbol("*NL-TRIE-PRED-OK-FOR-POS?-CACHING-STATE*");



    // deflexical
    public static final SubLSymbol $nl_trie_denot_set_test$ = makeSymbol("*NL-TRIE-DENOT-SET-TEST*");





    // defparameter
    private static final SubLSymbol $nl_trie_break_list$ = makeSymbol("*NL-TRIE-BREAK-LIST*");

    // defparameter
    private static final SubLSymbol $nl_trie_use_two_letter_stringsP$ = makeSymbol("*NL-TRIE-USE-TWO-LETTER-STRINGS?*");

    // defparameter
    /**
     * What level of warnings should the NL trie print out? Higher -> more warnings.
     *
     * @unknown baxter
     */
    public static final SubLSymbol $nl_trie_warning_level$ = makeSymbol("*NL-TRIE-WARNING-LEVEL*");

    // defparameter
    public static final SubLSymbol $nl_trie_break_on_errorP$ = makeSymbol("*NL-TRIE-BREAK-ON-ERROR?*");

    // defparameter
    public static final SubLSymbol $nl_trie_include_derived_formsP$ = makeSymbol("*NL-TRIE-INCLUDE-DERIVED-FORMS?*");



    private static final SubLString $str0$_Revision__142735__ = makeString("$Revision: 142735 $");

    public static final SubLSymbol $nl_trie_code_revision$ = makeSymbol("*NL-TRIE-CODE-REVISION*");

    public static final SubLList $list2 = list(new SubLObject[]{ list(makeString("1.195"), makeString("1.196")), list(makeString("1.196"), makeString("1.197")), list(makeString("1.197"), makeString("1.198")), list(makeString("1.198"), makeString("1.199")), list(makeString("1.199"), makeString("1.200")), list(makeString("1.200"), makeString("1.201")), list(makeString("1.201"), makeString("1.202")), list(makeString("1.202"), makeString("1.203")), list(makeString("1.203"), makeString("1.204")), list(makeString("1.204"), makeString("1.205")), list(makeString("1.205"), makeString("1.206")), list(makeString("1.206"), makeString("1.207")), list(makeString("1.207"), makeString("1.208")), list(makeString("1.219"), makeString("1.220")), list(makeString("1.222"), makeString("1.223")), list(makeString("1.228"), makeString("1.229")) });

    private static final SubLInteger $int$6000 = makeInteger(6000);

    public static final SubLSymbol $nl_trie_cache_strategy$ = makeSymbol("*NL-TRIE-CACHE-STRATEGY*");

    public static final SubLSymbol WITH_BACKED_MAP_CACHE_STRATEGY = makeSymbol("WITH-BACKED-MAP-CACHE-STRATEGY");

    public static final SubLList $list6 = list(makeSymbol("*NL-TRIE-CACHE-STRATEGY*"));

    public static final SubLList $list7 = list(NIL);

    public static final SubLSymbol $nl_trie_lock$ = makeSymbol("*NL-TRIE-LOCK*");

    private static final SubLString $$$NL_Trie_Lock = makeString("NL Trie Lock");

    private static final SubLList $list10 = list(list(makeSymbol("REASON")), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLSymbol WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK = makeSymbol("WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");

    private static final SubLList $list14 = list(makeSymbol("*NL-TRIE-LOCK*"));

    private static final SubLObject $$termPhrases = reader_make_constant_shell(makeString("termPhrases"));

    private static final SubLSymbol VALIDATE_NL_TRIE_ENTRY = makeSymbol("VALIDATE-NL-TRIE-ENTRY");

    private static final SubLInteger $int$200 = makeInteger(200);









    private static final SubLString $$$the = makeString("the");



    public static final SubLList $list24 = list(list(makeSymbol("NAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym25$STRIE = makeUninternedSymbol("STRIE");

    private static final SubLSymbol $sym26$KEY = makeUninternedSymbol("KEY");

    private static final SubLSymbol $sym27$ENTRIES = makeUninternedSymbol("ENTRIES");

    private static final SubLSymbol WITH_NL_TRIE_CACHE_STRATEGY = makeSymbol("WITH-NL-TRIE-CACHE-STRATEGY");



    private static final SubLList $list30 = list(list(makeSymbol("MAP-GET"), list(makeSymbol("GET-NL-TRIE")), makeString("the")));

    private static final SubLSymbol WITH_NL_TRIE_LOCK_HELD = makeSymbol("WITH-NL-TRIE-LOCK-HELD");

    private static final SubLList $list32 = list(makeString("NL Trie Names with Added The"));

    private static final SubLSymbol DO_STRIE_PROGRESS = makeSymbol("DO-STRIE-PROGRESS");

    private static final SubLList $list34 = list(makeKeyword("PROGRESS-NOTE"), makeString("Finding NL trie names with added 'the'..."));







    private static final SubLSymbol NL_TRIE_NAME_P = makeSymbol("NL-TRIE-NAME-P");



    private static final SubLSymbol $sym40$SUBSTRING_MATCH_ = makeSymbol("SUBSTRING-MATCH?");

    private static final SubLSymbol NL_TRIE_NAME_STRING = makeSymbol("NL-TRIE-NAME-STRING");

    private static final SubLList $list42 = list(makeString("the "), ZERO_INTEGER, list(makeSymbol("FUNCTION"), EQUALP));

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLObject $$EnglishLexiconMt = reader_make_constant_shell(makeString("EnglishLexiconMt"));

    private static final SubLObject $$properNounStrings = reader_make_constant_shell(makeString("properNounStrings"));

    private static final SubLSymbol $sym46$SPEC_PREDICATE_ = makeSymbol("SPEC-PREDICATE?");

    private static final SubLSymbol NL_TRIE_DONT_ADD_THE_CATEGORIES = makeSymbol("NL-TRIE-DONT-ADD-THE-CATEGORIES");

    private static final SubLSymbol $sym48$_COLLECTION = makeSymbol("?COLLECTION");

    private static final SubLList $list49 = list(reader_make_constant_shell(makeString("dontAddTheToNamesOfInstances")), makeSymbol("?COLLECTION"));

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

    private static final SubLSymbol NL_TRIE_DONT_ADD_THE_TERMS = makeSymbol("NL-TRIE-DONT-ADD-THE-TERMS");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $sym55$NL_TRIE_NAME_PRED_OK_FOR_ADDING_THE_ = makeSymbol("NL-TRIE-NAME-PRED-OK-FOR-ADDING-THE?");

    private static final SubLObject $$dontAddTheToNamesWithPred = reader_make_constant_shell(makeString("dontAddTheToNamesWithPred"));







    private static final SubLList $list60 = list(list(makeSymbol("DENOT"), makeSymbol("ENTRY")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list62 = list(T);

    private static final SubLSymbol NL_TRIE_NAME_DENOT = makeSymbol("NL-TRIE-NAME-DENOT");

    private static final SubLSymbol NL_TRIE_TERM_PHRASES_ENTRY_P = makeSymbol("NL-TRIE-TERM-PHRASES-ENTRY-P");



    private static final SubLSymbol NL_TRIE_WORD_P = makeSymbol("NL-TRIE-WORD-P");

    private static final SubLSymbol DO_NL_TRIE_WORD_DENOTS = makeSymbol("DO-NL-TRIE-WORD-DENOTS");







    private static final SubLSymbol NL_TRIE_LEX_ENTRY_GET = makeSymbol("NL-TRIE-LEX-ENTRY-GET");

    public static final SubLList $list72 = list(makeKeyword("DENOTS"));

    private static final SubLList $list73 = list(list(makeSymbol("STRING"), makeSymbol("ENTRY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol NL_TRIE_NAME_STRING_MACRO_HELPER = makeSymbol("NL-TRIE-NAME-STRING-MACRO-HELPER");

    private static final SubLSymbol GAF_ARG3 = makeSymbol("GAF-ARG3");

    private static final SubLSymbol DO_NL_TRIE_WORD_STRINGS = makeSymbol("DO-NL-TRIE-WORD-STRINGS");

    private static final SubLList $list77 = list(makeKeyword("STRING"));

    private static final SubLSymbol DO_NL_TRIE_ENTRY_STRINGS = makeSymbol("DO-NL-TRIE-ENTRY-STRINGS");

    private static final SubLList $list79 = list(list(makeSymbol("SUPPORT"), makeSymbol("WORD"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list80 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol NL_TRIE_WORD_SYNTACTIC_SUPPORT_SET = makeSymbol("NL-TRIE-WORD-SYNTACTIC-SUPPORT-SET");

    private static final SubLSymbol NL_TRIE_WORD_SEMANTIC_SUPPORT_SET = makeSymbol("NL-TRIE-WORD-SEMANTIC-SUPPORT-SET");





    private static final SubLSymbol NL_TRIE_ENTRY_P = makeSymbol("NL-TRIE-ENTRY-P");

    private static final SubLString $str89$Removing_bad_syntactic_support___ = makeString("Removing bad syntactic support: ~S~% from ~S");

    private static final SubLString $str90$Removing_bad_semantic_support___S = makeString("Removing bad semantic support: ~S~% from ~S");

    private static final SubLSymbol NL_TRIE_WORD_STRUC_VALID_P = makeSymbol("NL-TRIE-WORD-STRUC-VALID-P");

    private static final SubLSymbol $sym92$NL_TRIE_VALID_ASSERTION__MEMOIZED = makeSymbol("NL-TRIE-VALID-ASSERTION?-MEMOIZED");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLSymbol $sym94$INVALID_FORT_ = makeSymbol("INVALID-FORT?");

    private static final SubLList $list95 = cons(makeSymbol("SENTENCE"), makeSymbol("MT"));

    private static final SubLList $list96 = list(makeSymbol("PRED"), makeSymbol("WORD"), makeSymbol("STRING"));

    private static final SubLList $list97 = cons(makeSymbol("THIS-STRING"), makeSymbol("SUPPORTS"));

    private static final SubLString $str98$Removing_invalid_denot___S = makeString("Removing invalid denot: ~S");

    private static final SubLList $list99 = list(makeSymbol("NL-TRIE-DENOT-HAS-INVALID-CONSTANT?"));

    private static final SubLSymbol $sym100$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");







    private static final SubLString $str104$_S___is_not_a_valid_NL_trie_denot = makeString("~S~% is not a valid NL trie denot set. Test must be ~S.");

    private static final SubLObject $$denotation = reader_make_constant_shell(makeString("denotation"));

    private static final SubLSymbol NL_TRIE_WORD_STRUC = makeSymbol("NL-TRIE-WORD-STRUC");

    private static final SubLSymbol NL_TRIE_WORD_STRUC_P = makeSymbol("NL-TRIE-WORD-STRUC-P");

    private static final SubLInteger $int$166 = makeInteger(166);

    private static final SubLList $list109 = list(makeSymbol("SYNTACTIC-SUPPORTS"), makeSymbol("SEMANTIC-SUPPORTS"));

    private static final SubLList $list110 = list(makeKeyword("SYNTACTIC-SUPPORTS"), makeKeyword("SEMANTIC-SUPPORTS"));

    private static final SubLList $list111 = list(makeSymbol("NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS"), makeSymbol("NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS"));

    private static final SubLList $list112 = list(makeSymbol("_CSETF-NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS"), makeSymbol("_CSETF-NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS"));

    private static final SubLSymbol PPRINT_NL_TRIE_WORD_STRUC = makeSymbol("PPRINT-NL-TRIE-WORD-STRUC");

    private static final SubLSymbol NL_TRIE_WORD_STRUC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NL-TRIE-WORD-STRUC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list115 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NL-TRIE-WORD-STRUC-P"));

    private static final SubLSymbol NL_TRIE_WORD_STRUC_SYNTACTIC_SUPPORTS = makeSymbol("NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS");

    private static final SubLSymbol _CSETF_NL_TRIE_WORD_STRUC_SYNTACTIC_SUPPORTS = makeSymbol("_CSETF-NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS");

    private static final SubLSymbol NL_TRIE_WORD_STRUC_SEMANTIC_SUPPORTS = makeSymbol("NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS");

    private static final SubLSymbol _CSETF_NL_TRIE_WORD_STRUC_SEMANTIC_SUPPORTS = makeSymbol("_CSETF-NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS");





    private static final SubLString $str122$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_NL_TRIE_WORD_STRUC = makeSymbol("MAKE-NL-TRIE-WORD-STRUC");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_NL_TRIE_WORD_STRUC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NL-TRIE-WORD-STRUC-METHOD");

    private static final SubLInteger $int$509 = makeInteger(509);

    private static final SubLSymbol SXHASH_NL_TRIE_WORD_STRUC_METHOD = makeSymbol("SXHASH-NL-TRIE-WORD-STRUC-METHOD");

    private static final SubLString $str130$_NL_TRIE_WORD = makeString("<NL-TRIE-WORD");

    private static final SubLString $str131$____S = makeString("~% ~S");

    private static final SubLString $str132$_ = makeString(">");

    private static final SubLInteger $int$71 = makeInteger(71);

    private static final SubLSymbol CFASL_INPUT_NL_TRIE_WORD_STRUC = makeSymbol("CFASL-INPUT-NL-TRIE-WORD-STRUC");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_NL_TRIE_WORD_STRUC_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-NL-TRIE-WORD-STRUC-METHOD");

    private static final SubLSymbol NL_TRIE_VALID_SEMANTIC_SUPPORT_P = makeSymbol("NL-TRIE-VALID-SEMANTIC-SUPPORT-P");

    private static final SubLSymbol NL_TRIE_SYNTACTIC_SUPPORT_P = makeSymbol("NL-TRIE-SYNTACTIC-SUPPORT-P");

    private static final SubLSymbol NL_TRIE_WORD_VALID_SYNTACTIC_SUPPORT_SET_P = makeSymbol("NL-TRIE-WORD-VALID-SYNTACTIC-SUPPORT-SET-P");

    private static final SubLSymbol NL_TRIE_WORD_VALID_SEMANTIC_SUPPORT_SET_P = makeSymbol("NL-TRIE-WORD-VALID-SEMANTIC-SUPPORT-SET-P");

    private static final SubLObject $$partOfSpeech = reader_make_constant_shell(makeString("partOfSpeech"));

    private static final SubLString $str141$Couldn_t_find_valid_arbitrary_syn = makeString("Couldn't find valid arbitrary syntactic support in~% ~S~%");

    private static final SubLString $str142$Illicit_call_to_NL_TRIE_WORD_SYNT = makeString("Illicit call to NL-TRIE-WORD-SYNTACTIC-SUPPORTS.");

    private static final SubLString $str143$Illicit_call_to_NL_TRIE_WORD_SEMA = makeString("Illicit call to NL-TRIE-WORD-SEMANTIC-SUPPORTS.");

    private static final SubLString $str144$Couldn_t_find_valid_arbitrary_sem = makeString("Couldn't find valid arbitrary semantic support in~% ~S~%");









    private static final SubLSymbol NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS = makeSymbol("NL-TRIE-WORD-SEMANTIC-SUPPORT-DENOTS");

    private static final SubLString $str150$Can_t_get_arg__S_of__S = makeString("Can't get arg ~S of ~S");

    private static final SubLSymbol NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES = makeSymbol("NL-TRIE-WORD-SEMANTIC-SUPPORT-SEMTRANS-TEMPLATES");

    private static final SubLList $list152 = list(reader_make_constant_shell(makeString("wordStrings")));

    private static final SubLSymbol NL_TRIE_CLOSED_CLASS_POS_PREDS = makeSymbol("NL-TRIE-CLOSED-CLASS-POS-PREDS");







    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));





    private static final SubLString $str160$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str165$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$ClosedClassWord = reader_make_constant_shell(makeString("ClosedClassWord"));

    private static final SubLString $str168$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str169$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str170$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol $nl_trie_closed_class_pos_preds_caching_state$ = makeSymbol("*NL-TRIE-CLOSED-CLASS-POS-PREDS-CACHING-STATE*");



    private static final SubLSymbol CLEAR_NL_TRIE_CLOSED_CLASS_POS_PREDS = makeSymbol("CLEAR-NL-TRIE-CLOSED-CLASS-POS-PREDS");

    private static final SubLObject $$abbreviationForLexicalWord = reader_make_constant_shell(makeString("abbreviationForLexicalWord"));

    private static final SubLSymbol NL_TRIE_WORD_POS = makeSymbol("NL-TRIE-WORD-POS");

    private static final SubLObject $$gerund = reader_make_constant_shell(makeString("gerund"));





    private static final SubLList $list179 = list(list(makeSymbol("DENOT"), makeSymbol("ENTRY"), makeSymbol("&KEY"), makeSymbol("PREFERRED-ONLY?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list180 = list(makeKeyword("PREFERRED-ONLY?"));

    private static final SubLSymbol $kw181$PREFERRED_ONLY_ = makeKeyword("PREFERRED-ONLY?");

    private static final SubLSymbol $sym182$PRED = makeUninternedSymbol("PRED");

    private static final SubLSymbol $sym183$DENOT_ARG = makeUninternedSymbol("DENOT-ARG");

    private static final SubLSymbol $sym184$SEMANTIC_SUPPORT = makeUninternedSymbol("SEMANTIC-SUPPORT");

    private static final SubLSymbol NL_TRIE_WORD_SEM_PRED = makeSymbol("NL-TRIE-WORD-SEM-PRED");





    private static final SubLSymbol DENOTATUM_ARG_OF_PRED_CACHED = makeSymbol("DENOTATUM-ARG-OF-PRED-CACHED");





    private static final SubLSymbol $sym191$NL_TRIE_PREFERRED_SEMANTIC_SUPPORT_ = makeSymbol("NL-TRIE-PREFERRED-SEMANTIC-SUPPORT?");

    public static final SubLList $list192 = list(reader_make_constant_shell(makeString("preferredNameString")), reader_make_constant_shell(makeString("preferredTermStrings")));

    private static final SubLObject $$preferredLexification = reader_make_constant_shell(makeString("preferredLexification"));

    private static final SubLList $list194 = list(list(makeSymbol("SEMTRANS-TEMPLATE"), makeSymbol("ENTRY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym195$PRED = makeUninternedSymbol("PRED");

    private static final SubLSymbol $sym196$SEMTRANS_TEMPLATE_ARG = makeUninternedSymbol("SEMTRANS-TEMPLATE-ARG");

    private static final SubLSymbol $sym197$SEMANTIC_SUPPORT = makeUninternedSymbol("SEMANTIC-SUPPORT");

    private static final SubLSymbol $sym198$INVALID_SUPPORTS = makeUninternedSymbol("INVALID-SUPPORTS");

    private static final SubLSymbol SEMTRANS_ARG_OF_PRED_CACHED = makeSymbol("SEMTRANS-ARG-OF-PRED-CACHED");



    private static final SubLSymbol VALID_NL_TRIE_WORD_SEMANTIC_SUPPORT_P = makeSymbol("VALID-NL-TRIE-WORD-SEMANTIC-SUPPORT-P");



    private static final SubLSymbol NL_TRIE_WORD_REMOVE_SEMANTIC_SUPPORT = makeSymbol("NL-TRIE-WORD-REMOVE-SEMANTIC-SUPPORT");

    private static final SubLList $list204 = list(list(makeSymbol("STRING"), makeSymbol("WORD-ENTRY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym205$SEMANTIC_SUPPORT = makeUninternedSymbol("SEMANTIC-SUPPORT");

    private static final SubLSymbol $sym206$LEADING_STRINGS = makeUninternedSymbol("LEADING-STRINGS");

    private static final SubLSymbol $sym207$HEAD_STRING = makeUninternedSymbol("HEAD-STRING");

    private static final SubLSymbol $sym208$FOLLOWING_STRINGS = makeUninternedSymbol("FOLLOWING-STRINGS");

    private static final SubLSymbol NL_TRIE_WORD_HEAD_STRING_MACRO_HELPER = makeSymbol("NL-TRIE-WORD-HEAD-STRING-MACRO-HELPER");

    private static final SubLSymbol DO_NL_TRIE_WORD_SEMANTIC_SUPPORTS = makeSymbol("DO-NL-TRIE-WORD-SEMANTIC-SUPPORTS");

    private static final SubLSymbol NL_TRIE_WORD_LEADING_STRINGS_FROM_SUPPORT_MACRO_HELPER = makeSymbol("NL-TRIE-WORD-LEADING-STRINGS-FROM-SUPPORT-MACRO-HELPER");

    private static final SubLSymbol NL_TRIE_WORD_FOLLOWING_STRINGS_FROM_SUPPORT_MACRO_HELPER = makeSymbol("NL-TRIE-WORD-FOLLOWING-STRINGS-FROM-SUPPORT-MACRO-HELPER");

    private static final SubLSymbol NL_TRIE_ASSEMBLE_STRINGS_MACRO_HELPER = makeSymbol("NL-TRIE-ASSEMBLE-STRINGS-MACRO-HELPER");

    private static final SubLString $str214$__NL_TRIE_WORD_Word_unit______S__ = makeString("#<NL-TRIE-WORD:Word-unit:    ~S~%");

    private static final SubLString $str215$_______________POS____________S__ = makeString("               POS:          ~S~%");

    private static final SubLString $str216$_______________POS_Preds______S__ = makeString("               POS Preds:    ~S~%");

    private static final SubLString $str217$_______________Lexical_Pred___S__ = makeString("               Lexical Pred: ~S~%");

    private static final SubLString $str218$_______________Denotations____S__ = makeString("               Denotations:  ~S~%");

    private static final SubLString $str219$_______________Pragmatics_____S__ = makeString("               Pragmatics:   ~S~%");

    private static final SubLString $str220$_______________Microtheory____S__ = makeString("               Microtheory:  ~S>~%");

    private static final SubLString $str221$__NL_TRIE_NAME_Namestring_Pred___ = makeString("#<NL-TRIE-NAME:Namestring Pred: ~S~%");

    private static final SubLString $str222$_______________Denotations_______ = makeString("               Denotations:     ~S~%");

    private static final SubLString $str223$_______________Pragmatics________ = makeString("               Pragmatics:      ~S~%");

    private static final SubLString $str224$_______________Microtheory_______ = makeString("               Microtheory:     ~S>~%");

    private static final SubLString $str225$Invalid_NL_trie_name___S = makeString("Invalid NL trie name: ~S");

    private static final SubLString $str226$Invalid_NL_trie_tp_entry___S = makeString("Invalid NL trie tp-entry: ~S");

    private static final SubLSymbol NL_TRIE_RECORD_P = makeSymbol("NL-TRIE-RECORD-P");

    private static final SubLSymbol VALID_NL_TRIE_RECORD_KEY_P = makeSymbol("VALID-NL-TRIE-RECORD-KEY-P");

    private static final SubLSymbol VALID_NL_TRIE_RECORD_ENTRIES_P = makeSymbol("VALID-NL-TRIE-RECORD-ENTRIES-P");

    private static final SubLSymbol CYCL_STRING_P = makeSymbol("CYCL-STRING-P");

    private static final SubLSymbol $nl_trie_lexical_mt$ = makeSymbol("*NL-TRIE-LEXICAL-MT*");

    private static final SubLObject $$AllLexicalMicrotheoryPSC = reader_make_constant_shell(makeString("AllLexicalMicrotheoryPSC"));

    private static final SubLSymbol $nl_trie_syntactic_predicates$ = makeSymbol("*NL-TRIE-SYNTACTIC-PREDICATES*");



    private static final SubLSymbol $nl_trie_denotation_predicates$ = makeSymbol("*NL-TRIE-DENOTATION-PREDICATES*");

    private static final SubLSymbol $nl_trie_semtrans_predicates$ = makeSymbol("*NL-TRIE-SEMTRANS-PREDICATES*");

    private static final SubLSymbol $nl_trie_abbreviation_predicates$ = makeSymbol("*NL-TRIE-ABBREVIATION-PREDICATES*");

    private static final SubLSymbol $nl_trie_arg_in_reln_predicates$ = makeSymbol("*NL-TRIE-ARG-IN-RELN-PREDICATES*");

    private static final SubLSymbol $nl_trie_pragmatic_predicates$ = makeSymbol("*NL-TRIE-PRAGMATIC-PREDICATES*");

    public static final SubLList $list240 = list(list(makeSymbol("NL-TRIE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $nl_tries_being_initialized$ = makeSymbol("*NL-TRIES-BEING-INITIALIZED*");



    private static final SubLList $list243 = list(makeSymbol("*NL-TRIES-BEING-INITIALIZED*"));

    public static final SubLList $list244 = list(makeString("Initialize NL Trie"));

    private static final SubLSymbol $nl_trie$ = makeSymbol("*NL-TRIE*");



    private static final SubLList $list247 = list(list(makeSymbol("KEY"), makeSymbol("ENTRIES"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list248 = list(makeString("Do NL Trie"));

    private static final SubLSymbol DO_STRIE = makeSymbol("DO-STRIE");

    private static final SubLList $list250 = list(makeSymbol("GET-NL-TRIE"));

    private static final SubLList $list251 = list(list(makeSymbol("KEY"), makeSymbol("ENTRIES"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("PROGRESS-NOTE"), makeString("Mapping NL trie..."))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list252 = list(makeKeyword("DONE"), makeKeyword("PROGRESS-NOTE"));



    private static final SubLString $str254$Mapping_NL_trie___ = makeString("Mapping NL trie...");

    private static final SubLList $list255 = list(makeString("Do NL Trie Progress"));

    private static final SubLList $list256 = list(makeUninternedSymbol("DICT-KEY"), makeUninternedSymbol("DICT-VALUE"));



    private static final SubLString $str258$__Clearing_the_present_contents_o = makeString("~%Clearing the present contents of ~a ...~%");











    private static final SubLString $str264$Didn_t_recognize_NL_Trie_case_sen = makeString("Didn't recognize NL Trie case-sensitivity setting ~S");

    private static final SubLSymbol NL_TRIE_SEARCH_CASE_SENSITIVE = makeSymbol("NL-TRIE-SEARCH-CASE-SENSITIVE");

    private static final SubLInteger $int$48 = makeInteger(48);

    private static final SubLSymbol NL_TRIE_SEARCH_CASE_INSENSITIVE = makeSymbol("NL-TRIE-SEARCH-CASE-INSENSITIVE");

    private static final SubLSymbol NL_TRIE_SEARCH_CASE_SENSITIVE_PREFERRED = makeSymbol("NL-TRIE-SEARCH-CASE-SENSITIVE-PREFERRED");

    private static final SubLString $str269$NL_Trie_empty_ = makeString("NL Trie empty.");

    private static final SubLString $str270$NL_Trie_incompletely_built_ = makeString("NL Trie incompletely built.");

    private static final SubLString $str271$NL_trie_built_with_stale_code__ = makeString("NL trie built with stale code~%");









    private static final SubLList $list276 = list(makeSymbol("STREAM"), makeSymbol("GLOBAL"), makeSymbol("TYPE"));

    private static final SubLSymbol $sym277$TOP = makeUninternedSymbol("TOP");



    private static final SubLList $list279 = list(NIL, makeKeyword("EOF"));

    private static final SubLList $list280 = list(makeKeyword("EOF"));





    private static final SubLString $str283$___S_is_not_the_right_type_of_obj = makeString("~&~S is not the right type of object for ~S (expected a ~S).");





    private static final SubLSymbol MAP_P = makeSymbol("MAP-P");

    private static final SubLSymbol $nl_trie_completion_index$ = makeSymbol("*NL-TRIE-COMPLETION-INDEX*");

    private static final SubLString $str288$Mismatch_between_world_and_HL_cac = makeString("Mismatch between world and HL caches: no ~A and ~A to reconnect NL trie with.");

    private static final SubLString $str289$Reconnecting_to_legacy_unit_files = makeString("Reconnecting to legacy unit files w/out NL trie contents in ~A and ~A.");

    private static final SubLSymbol DUMP_SWAPPABLE_NL_TRIE_VISITOR_BEGIN_VISIT = makeSymbol("DUMP-SWAPPABLE-NL-TRIE-VISITOR-BEGIN-VISIT");

    private static final SubLSymbol DUMP_SWAPPABLE_NL_TRIE_VISITOR_BEGIN_PATH = makeSymbol("DUMP-SWAPPABLE-NL-TRIE-VISITOR-BEGIN-PATH");

    private static final SubLSymbol DUMP_SWAPPABLE_NL_TRIE_VISITOR_ACCEPT_NODE = makeSymbol("DUMP-SWAPPABLE-NL-TRIE-VISITOR-ACCEPT-NODE");

    private static final SubLSymbol DUMP_SWAPPABLE_NL_TRIE_VISITOR_END_PATH = makeSymbol("DUMP-SWAPPABLE-NL-TRIE-VISITOR-END-PATH");

    private static final SubLSymbol DUMP_SWAPPABLE_NL_TRIE_VISITOR_END_VISIT = makeSymbol("DUMP-SWAPPABLE-NL-TRIE-VISITOR-END-VISIT");

    private static final SubLString $str295$The_NL_trie_visitor_is_not_proper = makeString("The NL trie visitor is not properly setup; initial context ~A is bogus.");

    private static final SubLString $str296$The_NL_trie_visitor_did_nto_compl = makeString("The NL trie visitor did nto complete properly; final context ~A is bogus.");





    private static final SubLList $list299 = cons(makeSymbol("MAP-KEY"), makeSymbol("PAYLOAD"));





    private static final SubLString $str302$Invalid_case_sensitivity_setting_ = makeString("Invalid case-sensitivity setting ~S for trie ~S, whose test function is ~S");

    private static final SubLString $$$Validating_all_NL_trie_entries = makeString("Validating all NL trie entries");



    private static final SubLString $str305$Removing_bad_NL_trie_entry_for__S = makeString("Removing bad NL trie entry for ~S:~% ~S~% from ~S~%");

    private static final SubLString $str306$Remaining_entries_____S__ = makeString("Remaining entries:~% ~S~%");

    private static final SubLSymbol $sym307$NL_TRIE_SYNTACTIC_PRED_ = makeSymbol("NL-TRIE-SYNTACTIC-PRED?");

    private static final SubLList $list308 = list(reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("denotationRelatedTo")), reader_make_constant_shell(makeString("denotationPlaceholder")), reader_make_constant_shell(makeString("multiWordString")), reader_make_constant_shell(makeString("compoundString")), reader_make_constant_shell(makeString("multiWordString-Speculative")), reader_make_constant_shell(makeString("headMedialString")));

    private static final SubLObject $$DenotesArgInRelnPredicate = reader_make_constant_shell(makeString("DenotesArgInRelnPredicate"));

    private static final SubLObject $$SemTransPred = reader_make_constant_shell(makeString("SemTransPred"));

    private static final SubLSymbol $sym311$NL_TRIE_SEMTRANS_PRED_HAS_POS_SPECIFICATION_ = makeSymbol("NL-TRIE-SEMTRANS-PRED-HAS-POS-SPECIFICATION?");

    private static final SubLSymbol NL_TRIE_MULTI_WORD_ABBREVIATION_PREDS = makeSymbol("NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS");

    private static final SubLObject $$MultiWordForStringPred = reader_make_constant_shell(makeString("MultiWordForStringPred"));

    private static final SubLSymbol $nl_trie_multi_word_abbreviation_preds_caching_state$ = makeSymbol("*NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS-CACHING-STATE*");

    private static final SubLObject $$NLPragmaticPredicate_New = reader_make_constant_shell(makeString("NLPragmaticPredicate-New"));

    private static final SubLString $str316$__Initializing_NL_Trie_____ = makeString("~%Initializing NL Trie...~%");

    private static final SubLString $str317$__Triefying_the_syntactic_predica = makeString("~%Triefying the syntactic predicates ...~%");



    private static final SubLString $str319$__Triefying_the_semantic_predicat = makeString("~%Triefying the semantic predicates ...~%");



    private static final SubLSymbol $sym321$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLString $str322$____D__D__Triefying__S_assertions = makeString("~%[~D/~D] Triefying ~S assertions...");

    private static final SubLObject $$NLSyntacticPredicate = reader_make_constant_shell(makeString("NLSyntacticPredicate"));

    private static final SubLObject $$NLSemanticPredicate = reader_make_constant_shell(makeString("NLSemanticPredicate"));

    private static final SubLString $str325$Triefying__S = makeString("Triefying ~S");





    private static final SubLString $str328$Triefying__S_assertions___ = makeString("Triefying ~S assertions...");

    private static final SubLString $str329$Got_failure_result__S_when_triefy = makeString("Got failure result ~S when triefying~% ~S");



    private static final SubLObject $$abbreviationForMultiWordString = reader_make_constant_shell(makeString("abbreviationForMultiWordString"));

    private static final SubLObject $$abbreviationForCompoundString = reader_make_constant_shell(makeString("abbreviationForCompoundString"));

    private static final SubLString $str333$Caught_error_in_UPDATE_NL_TRIE_SY = makeString("Caught error in UPDATE-NL-TRIE-SYNTACTIC for~% ~S:~% ~S");

    private static final SubLString $str334$Trie_not_present___S = makeString("Trie not present: ~S");

    private static final SubLString $str335$Assertion_fails_OK_ASSERTION_FOR_ = makeString("Assertion fails OK-ASSERTION-FOR-NL-TRIE?~% ~S");

    private static final SubLList $list336 = list(makeSymbol("MOD-STR-LIST"), makeSymbol("CONSTRAINT"), makeSymbol("MT"));

    private static final SubLList $list337 = list(makeSymbol("SPP-PRED"), makeSymbol("WORD"), makeSymbol("STRING"));

    private static final SubLSymbol NL_TRIE_SPEC_PREDICATES = makeSymbol("NL-TRIE-SPEC-PREDICATES");

    private static final SubLSymbol $nl_trie_spec_predicates_caching_state$ = makeSymbol("*NL-TRIE-SPEC-PREDICATES-CACHING-STATE*");



    private static final SubLSymbol CLEAR_NL_TRIE_SPEC_PREDICATES = makeSymbol("CLEAR-NL-TRIE-SPEC-PREDICATES");

    private static final SubLList $list342 = list(makeSymbol("SP-PRED"), makeSymbol("WORD"), makeSymbol("STRING"));

    private static final SubLList $list343 = list(makeSymbol("SPP-PRED"), makeSymbol("WU"), makeSymbol("IRREGULAR-STRING"));

    private static final SubLList $list344 = list(makeSymbol("MOD-STR-LIST"), makeSymbol("PRED"));

    public static final SubLList $list345 = list(makeSymbol("WORD"), makeSymbol("POS"), makeSymbol("CYCL-STRING"));

    private static final SubLSymbol NL_TRIE_POS_FOR_SEMTRANS_PRED = makeSymbol("NL-TRIE-POS-FOR-SEMTRANS-PRED");

    private static final SubLSymbol $nl_trie_pos_for_semtrans_pred_caching_state$ = makeSymbol("*NL-TRIE-POS-FOR-SEMTRANS-PRED-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol $sym349$NL_TRIE_PRED_OK_FOR_POS_ = makeSymbol("NL-TRIE-PRED-OK-FOR-POS?");

    private static final SubLSymbol $sym350$GENL_POS_ = makeSymbol("GENL-POS?");

    private static final SubLSymbol $sym351$GENL_POS_PRED_ = makeSymbol("GENL-POS-PRED?");

    private static final SubLSymbol $sym352$_NL_TRIE_PRED_OK_FOR_POS__CACHING_STATE_ = makeSymbol("*NL-TRIE-PRED-OK-FOR-POS?-CACHING-STATE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol NL_TRIE_PREDS_LICENSED_BY_POS = makeSymbol("NL-TRIE-PREDS-LICENSED-BY-POS");

    private static final SubLSymbol $nl_trie_preds_licensed_by_pos_caching_state$ = makeSymbol("*NL-TRIE-PREDS-LICENSED-BY-POS-CACHING-STATE*");



    private static final SubLString $str357$Caught_error_in_NL_TRIEFY_SEMANTI = makeString("Caught error in NL-TRIEFY-SEMANTIC-ASSERTION for~% ~S:~% ~S");

    private static final SubLList $list358 = list(makeSymbol("STRING-LIST"), makeSymbol("CONSTRAINT"), makeSymbol("MT"));

    private static final SubLString $str359$Couldn_t_find_any_string_nl_trie_ = makeString("Couldn't find any string-nl-trie-word pairs for ~S with ~S from ~S");

    private static final SubLList $list360 = cons(makeSymbol("WU-STRING"), makeSymbol("SUPPORTS"));

    private static final SubLList $list361 = list(makeSymbol("EACH-STR-LIST"), makeSymbol("EACH-PRED"));

    private static final SubLList $list362 = list(makeSymbol("STRING"), makeSymbol("MT"));

    private static final SubLSymbol $sym363$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");



    private static final SubLList $list365 = list(makeSymbol("HEAD-STRINGS"), makeSymbol("CONSTRAINT"), makeSymbol("MT"));

    private static final SubLList $list366 = list(makeSymbol("ABBREV-PRED"), makeSymbol("WU"), makeSymbol("CONST"), makeSymbol("CYCL-ABBR"));



    private static final SubLList $list368 = list(makeSymbol("ABBREV-PRED"), makeSymbol("WU"), makeSymbol("CYCL-MW-STR"), makeSymbol("CONST"), makeSymbol("ABBR"));

    private static final SubLObject $$compoundString = reader_make_constant_shell(makeString("compoundString"));

    public static final SubLList $list370 = list(makeSymbol("ABBREV-PRED"), makeSymbol("CYCL-MW-STR"), makeSymbol("WU"), makeSymbol("CONST"), makeSymbol("CYCL-ABBR"));

    private static final SubLObject $$multiWordString = reader_make_constant_shell(makeString("multiWordString"));

    public static final SubLString $$$_ = makeString(" ");







    private static final SubLSymbol NL_TRIE_PREDS_OF_POS = makeSymbol("NL-TRIE-PREDS-OF-POS");

    private static final SubLObject $$speechPartPreds = reader_make_constant_shell(makeString("speechPartPreds"));

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLSymbol $nl_trie_preds_of_pos_caching_state$ = makeSymbol("*NL-TRIE-PREDS-OF-POS-CACHING-STATE*");

    private static final SubLSymbol NL_TRIE_POS_OF_PRED = makeSymbol("NL-TRIE-POS-OF-PRED");

    private static final SubLSymbol $nl_trie_pos_of_pred_caching_state$ = makeSymbol("*NL-TRIE-POS-OF-PRED-CACHING-STATE*");

    private static final SubLList $list382 = list(new SubLObject[]{ CHAR_comma, CHAR_question, CHAR_exclamation, CHAR_ampersand, CHAR_backslash, CHAR_slash, CHAR_quotation, CHAR_semicolon, CHAR_colon, CHAR_lparen, CHAR_rparen, CHAR_plus, CHAR_hyphen });

    private static final SubLSymbol NL_TRIE_BREAK_CHAR_P = makeSymbol("NL-TRIE-BREAK-CHAR-P");

    private static final SubLList $list384 = list(list(makeString("-"), makeString(""), makeString(".")), list(makeString(""), makeString(".")));

    private static final SubLList $list385 = list(list(makeString("-")), NIL);

    private static final SubLString $str386$_ = makeString("-");



    private static final SubLList $list388 = list(makeString("'"));

    private static final SubLString $str389$_a_is_not_currently_an_NL_Trie_ = makeString("~a is not currently an NL Trie.");

    private static final SubLString $str390$Couldn_t_find_any_strings_to_add_ = makeString("Couldn't find any strings to add to trie:~% ~S");

    private static final SubLString $str391$Couldn_t_find_any_strings_to_remo = makeString("Couldn't find any strings to remove from trie:~% ~S");

    private static final SubLString $$$error_ = makeString("error ");

    private static final SubLString $str393$Unable_to_determine_pragmatic_fea = makeString("Unable to determine pragmatic features for ~A");

    private static final SubLObject $$pragmaticallyAcceptable = reader_make_constant_shell(makeString("pragmaticallyAcceptable"));

    private static final SubLSymbol FIND_POS_PREDS_FOR_LEX_CONST = makeSymbol("FIND-POS-PREDS-FOR-LEX-CONST");

    private static final SubLList $list396 = cons(makeSymbol("NOW"), makeSymbol("LATER"));

    private static final SubLSymbol $sym397$SPEC_POS_PRED_ = makeSymbol("SPEC-POS-PRED?");

    private static final SubLSymbol $nl_trie_name_string_preds_set$ = makeSymbol("*NL-TRIE-NAME-STRING-PREDS-SET*");

    private static final SubLList $list399 = list(makeSymbol("PRED"), makeSymbol("VALUE"));

    private static final SubLSymbol $sym400$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol TRIEFY_NART = makeSymbol("TRIEFY-NART");

    private static final SubLSymbol NL_TRIE_P = makeSymbol("NL-TRIE-P");

    private static final SubLSymbol NL_TRIE_ITERATOR_DONE = makeSymbol("NL-TRIE-ITERATOR-DONE");

    private static final SubLSymbol NL_TRIE_ITERATOR_NEXT = makeSymbol("NL-TRIE-ITERATOR-NEXT");

    private static final SubLList $list405 = list(makeSymbol("ITERATOR"), makeSymbol("IS-CURRENT-NL-TRIE-P"));

    private static final SubLSymbol NL_TRIE_STRING_TOKENIZE = makeSymbol("NL-TRIE-STRING-TOKENIZE");







    public static final SubLList $list410 = list(makeSymbol("NL-TRIE-TEST-CASE-TABLES"));







    public static final SubLList $list414 = list(list(list(makeString("George Bush, president of the United States")), list(makeString("George"), makeString("Bush"), makeString(","), makeString("president"), makeString("of"), makeString("the"), makeString("United"), makeString("States"))), list(list(makeString("George Bush")), list(makeString("George"), makeString("Bush"))), list(list(makeString("Mr. Bush")), list(makeString("Mr"), makeString("Bush"))), list(list(makeString("I met George Bush.")), list(makeString("I"), makeString("met"), makeString("George"), makeString("Bush"))), list(list(makeString("3.6 kilos")), list(makeString("3.6"), makeString("kilos"))));

    private static final SubLSymbol TEST_SWAPPABLE_NL_TRIE_DUMP = makeSymbol("TEST-SWAPPABLE-NL-TRIE-DUMP");



    private static final SubLList $list417 = list(list(list(list(new SubLObject[]{ list(makeString("North"), makeString("Dartmouth"), makeString(","), makeString("Massachusetts")), list(makeString("North"), makeString("Vancouver")), list(makeString("North"), makeString("Anna"), makeString("nuclear"), makeString("power"), makeString("plant")), list(makeString("North"), makeString("East"), makeString("optic"), makeString("network"), makeString("("), makeString("NOPT"), makeString(")")), list(makeString("North"), makeString("central"), makeString("intercollegiate"), makeString("athletic"), makeString("conference")), list(makeString("North"), makeString("sea")), list(makeString("North"), makeString("valley"), makeString("Bancorp"), makeString("("), makeString("Nasdaq"), makeString(":"), makeString("Novb"), makeString(")")), list(makeString("North"), makeString("Sea"), makeString("Brent"), makeString("crude")), list(makeString("North"), makeString("Rolandsay")), list(makeString("North"), makeString("county"), makeString("Bancorp"), makeString("("), makeString("Nasdaq"), makeString(":"), makeString("NCBH"), makeString(")")), list(makeString("North"), makeString("GOA"), makeString("district")), list(new SubLObject[]{ makeString("North"), makeString("point"), makeString("communications"), makeString("group"), makeString(","), makeString("inc"), makeString("("), makeString("Nasdaq"), makeString(":"), makeString("NPNT"), makeString(")") }), list(makeString("North"), makeString("fork"), makeString("ranger"), makeString("district")), list(makeString("North"), makeString("Carolina"), makeString("a"), makeString("&"), makeString("t"), makeString("football"), makeString("team")) })), makeKeyword("SUCCESS")));

    private static final SubLString $$$index = makeString("index");

    private static final SubLString $$$data = makeString("data");



    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str423$_A = makeString("~A");



    public static SubLObject with_nl_trie_cache_strategy(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_BACKED_MAP_CACHE_STRATEGY, $list6, append(body, NIL));
    }

    public static SubLObject without_nl_trie_cache_strategy(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_BACKED_MAP_CACHE_STRATEGY, $list7, append(body, NIL));
    }

    public static SubLObject with_nl_trie_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject reason = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        reason = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_LOCK_HELD, list($nl_trie_lock$, $WHOSTATE, reason), listS(WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK, $list14, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list10);
        return NIL;
    }

    public static SubLObject nl_trie_entry_p(final SubLObject obj) {
        return makeBoolean((((NIL != nl_trie_name_p(obj, UNPROVIDED)) || (NIL != nl_trie_word_p(obj, UNPROVIDED))) || (NIL != nl_trie_term_phrases_entry_p(obj, UNPROVIDED))) || (NIL != nl_trie_lex_entry_p(obj, UNPROVIDED)));
    }

    public static SubLObject nl_trie_term_phrases_entry_p(final SubLObject obj, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((((NIL != assertion_handles.assertion_p(obj)) && ((NIL == robustP) || (NIL != assertion_handles.valid_assertionP(obj, UNPROVIDED)))) && (NIL != assertions_high.gaf_assertionP(obj))) && assertions_high.gaf_arg0(obj).eql($$termPhrases));
    }

    public static SubLObject valid_nl_trie_entry_p(final SubLObject obj) {
        return makeBoolean((((NIL != nl_trie_name_p(obj, T)) || (NIL != nl_trie_word_p(obj, T))) || (NIL != nl_trie_term_phrases_entry_p(obj, T))) || (NIL != nl_trie_lex_entry_p(obj, T)));
    }

    public static SubLObject validate_nl_trie_entry_internal(final SubLObject obj) {
        if (NIL != nl_trie_name_p(obj, UNPROVIDED)) {
            return validate_nl_trie_name(obj);
        }
        if (NIL != nl_trie_term_phrases_entry_p(obj, UNPROVIDED)) {
            return validate_nl_trie_term_phrases_entry(obj);
        }
        if (NIL != nl_trie_word_p(obj, UNPROVIDED)) {
            return validate_nl_trie_word(obj, T);
        }
        if (NIL != nl_trie_lex_entry_p(obj, UNPROVIDED)) {
            return validate_nl_trie_lex_entry(obj);
        }
        return NIL;
    }

    public static SubLObject validate_nl_trie_entry(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return validate_nl_trie_entry_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, VALIDATE_NL_TRIE_ENTRY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), VALIDATE_NL_TRIE_ENTRY, ONE_INTEGER, $int$200, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, VALIDATE_NL_TRIE_ENTRY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(validate_nl_trie_entry_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject nl_trie_lex_entry_p(final SubLObject obj, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return abstract_lexicon.lex_entry_p(obj);
    }

    public static SubLObject validate_nl_trie_lex_entry(final SubLObject lex_entry) {
        return lex_entry;
    }

    public static SubLObject nl_trie_lex_entry_get(final SubLObject entry, final SubLObject slot) {
        return methods.funcall_instance_method_with_1_args(entry, GET, slot);
    }

    public static SubLObject print_nl_trie_entry(final SubLObject entry, final SubLObject stream, final SubLObject depth) {
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return print_nl_trie_word(entry, stream, depth);
        }
        if (NIL != nl_trie_name_p(entry, UNPROVIDED)) {
            return print_nl_trie_name(entry, stream, depth);
        }
        print(entry, stream);
        return NIL;
    }

    public static SubLObject nl_trie_entry_type(final SubLObject entry) {
        if (NIL != nl_trie_name_p(entry, T)) {
            return $NAME;
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return $WORD;
        }
        return NIL;
    }

    public static SubLObject nl_trie_entry_string(final SubLObject entry) {
        if (NIL != nl_trie_name_p(entry, T)) {
            return nl_trie_name_string(entry);
        }
        if (NIL != nl_trie_term_phrases_entry_p(entry, T)) {
            return cycl_string.cycl_string_to_utf8_string(assertions_high.gaf_arg3(entry));
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_string(entry);
        }
        if (NIL != nl_trie_lex_entry_p(entry, UNPROVIDED)) {
            return cycl_string.cycl_string_to_utf8_string(nl_trie_lex_entry_get(entry, $STRING));
        }
        return NIL;
    }

    public static SubLObject nl_trie_entry_keys(final SubLObject entry, SubLObject consider_adding_theP) {
        if (consider_adding_theP == UNPROVIDED) {
            consider_adding_theP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_keys = nl_trie_string_tokenize_multiple(nl_trie_entry_string(entry));
        final SubLObject entry_mt = nl_trie_entry_mt(entry);
        SubLObject ans = copy_list(raw_keys);
        SubLObject cdolist_list_var = raw_keys;
        SubLObject raw_key = NIL;
        raw_key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != nl_trie_name_p(entry, T)) {
                final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                try {
                    lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($OFF, thread);
                    if (((NIL != list_utilities.lengthG(raw_key, ONE_INTEGER, UNPROVIDED)) && raw_key.first().equalp($english_definite_determiner$.getGlobalValue())) && (!second(raw_key).equalp($english_definite_determiner$.getGlobalValue()))) {
                        ans = cons(raw_key.rest(), ans);
                    } else
                        if ((NIL != consider_adding_theP) && (NIL != nl_trie_name_ok_for_adding_theP(entry, entry_mt, raw_key))) {
                            final SubLObject the_ful = cons($english_definite_determiner$.getGlobalValue(), raw_key);
                            ans = cons(the_ful, ans);
                        }

                } finally {
                    lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_key = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject do_nl_trie_names_with_added_the(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject v_strie = $sym25$STRIE;
            final SubLObject key = $sym26$KEY;
            final SubLObject entries = $sym27$ENTRIES;
            return list(WITH_NL_TRIE_CACHE_STRATEGY, list(CLET, list(bq_cons(v_strie, $list30)), list(WITH_NL_TRIE_LOCK_HELD, $list32, list(DO_STRIE_PROGRESS, listS(key, entries, v_strie, $list34), list(CDOLIST, list(name, entries), listS(PWHEN, list(CAND, list(NL_TRIE_NAME_P, name), list(CNOT, listS($sym40$SUBSTRING_MATCH_, list(NL_TRIE_NAME_STRING, name), $list42))), append(body, NIL)))))));
        }
        cdestructuring_bind_error(datum, $list24);
        return NIL;
    }

    public static SubLObject nl_trie_name_ok_for_adding_theP(final SubLObject entry, final SubLObject entry_mt, final SubLObject raw_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject add_theP = NIL;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($OFF, thread);
            add_theP = makeBoolean((((((NIL != lexicon_accessors.speech_partP($$Noun, UNPROVIDED)) && (NIL != list_utilities.lengthG(raw_key, ONE_INTEGER, UNPROVIDED))) && (NIL != string_is_non_name_nounP(list_utilities.last_one(raw_key), entry_mt))) && (NIL != lexicon_utilities.lexical_assertion_of_lexiconP($$EnglishLexiconMt, entry, entry_mt))) && (NIL != nl_trie_name_pred_ok_for_adding_theP(nl_trie_name_pred(entry), entry_mt))) && (NIL != nl_trie_name_denot_ok_for_adding_theP(nl_trie_name_denot(entry), entry_mt)));
        } finally {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
        }
        return add_theP;
    }

    public static SubLObject string_is_non_name_nounP(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject noun_preds = nth_value_step_2(nth_value_step_1(ONE_INTEGER), lexicon_accessors.words_of_stringXspeech_part(string, $$Noun, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            noun_preds = remove($$properNounStrings, noun_preds, $sym46$SPEC_PREDICATE_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.non_empty_list_p(noun_preds);
    }

    public static SubLObject nl_trie_dont_add_the_categories_internal(final SubLObject mt) {
        return ask_utilities.ask_variable($sym48$_COLLECTION, $list49, hlmt_czer.canonicalize_hlmt(make_binary_formula($$MtUnionFn, $$EnglishMt, mt)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_dont_add_the_categories(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_dont_add_the_categories_internal(mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NL_TRIE_DONT_ADD_THE_CATEGORIES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NL_TRIE_DONT_ADD_THE_CATEGORIES, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NL_TRIE_DONT_ADD_THE_CATEGORIES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_dont_add_the_categories_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject nl_trie_name_denot_ok_for_adding_theP(final SubLObject name_denot, final SubLObject mt) {
        if ((NIL != nl_trie_being_initializedP(UNPROVIDED)) && (NIL != memoization_state.memoization_state_p(memoization_state.current_memoization_state()))) {
            return makeBoolean(NIL == nl_trie_dont_add_the_term_p(name_denot, mt));
        }
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var;
            SubLObject category;
            for (csome_list_var = nl_trie_dont_add_the_categories(mt), category = NIL, category = csome_list_var.first(); (NIL == badP) && (NIL != csome_list_var); badP = isa.isa_in_any_mtP(name_denot, category) , csome_list_var = csome_list_var.rest() , category = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == badP);
    }

    public static SubLObject nl_trie_dont_add_the_term_p(final SubLObject name_denot, final SubLObject mt) {
        return makeBoolean((NIL != forts.fort_p(name_denot)) && (NIL != set.set_memberP(name_denot, nl_trie_dont_add_the_terms(mt))));
    }

    public static SubLObject nl_trie_dont_add_the_terms_internal(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms = new_nl_trie_denot_set(UNPROVIDED);
        SubLObject cdolist_list_var = nl_trie_dont_add_the_categories(mt);
        SubLObject category = NIL;
        category = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject cdolist_list_var_$1 = isa.all_fort_instances(category, UNPROVIDED, UNPROVIDED);
                SubLObject instance = NIL;
                instance = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    set.set_add(instance, terms);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    instance = cdolist_list_var_$1.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            category = cdolist_list_var.first();
        } 
        return terms;
    }

    public static SubLObject nl_trie_dont_add_the_terms(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_dont_add_the_terms_internal(mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NL_TRIE_DONT_ADD_THE_TERMS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NL_TRIE_DONT_ADD_THE_TERMS, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NL_TRIE_DONT_ADD_THE_TERMS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_dont_add_the_terms_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject nl_trie_name_pred_ok_for_adding_theP_internal(final SubLObject name_pred, final SubLObject mt) {
        return makeBoolean(NIL == cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(list($$dontAddTheToNamesWithPred, name_pred), hlmt_czer.canonicalize_hlmt(make_binary_formula($$MtUnionFn, $$EnglishMt, mt)), UNPROVIDED)));
    }

    public static SubLObject nl_trie_name_pred_ok_for_adding_theP(final SubLObject name_pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_name_pred_ok_for_adding_theP_internal(name_pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym55$NL_TRIE_NAME_PRED_OK_FOR_ADDING_THE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym55$NL_TRIE_NAME_PRED_OK_FOR_ADDING_THE_, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym55$NL_TRIE_NAME_PRED_OK_FOR_ADDING_THE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(name_pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (name_pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_name_pred_ok_for_adding_theP_internal(name_pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(name_pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject nl_trie_entry_pos(final SubLObject entry) {
        if (NIL != nl_trie_name_p(entry, T)) {
            return NIL;
        }
        if (NIL != nl_trie_term_phrases_entry_p(entry, T)) {
            final SubLObject constraint = assertions_high.gaf_arg2(entry);
            return NIL != lexicon_accessors.speech_partP(constraint, UNPROVIDED) ? constraint : NIL != lexicon_accessors.speech_part_predP(constraint, UNPROVIDED) ? lexicon_accessors.pos_of_pred(constraint) : NIL;
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_pos(entry);
        }
        if (NIL != nl_trie_lex_entry_p(entry, UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, $CYC_POS);
        }
        return NIL;
    }

    public static SubLObject nl_trie_entry_pos_preds(final SubLObject entry) {
        if (NIL != nl_trie_name_p(entry, T)) {
            return NIL;
        }
        if (NIL != nl_trie_term_phrases_entry_p(entry, T)) {
            final SubLObject constraint = assertions_high.gaf_arg2(entry);
            return NIL != lexicon_accessors.speech_part_predP(constraint, UNPROVIDED) ? list(constraint) : NIL != lexicon_accessors.speech_partP(constraint, UNPROVIDED) ? lexicon_accessors.max_preds_of_pos(constraint) : NIL;
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_pos_preds(entry);
        }
        if (NIL != nl_trie_lex_entry_p(entry, UNPROVIDED)) {
            return list(nl_trie_lex_entry_get(entry, $PREDICATE));
        }
        return NIL;
    }

    public static SubLObject nl_trie_entry_denots(final SubLObject entry) {
        if (NIL != nl_trie_name_p(entry, T)) {
            return list(nl_trie_name_denot(entry));
        }
        if (NIL != nl_trie_term_phrases_entry_p(entry, T)) {
            return list(assertions_high.gaf_arg1(entry));
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_denots(entry);
        }
        if (NIL != nl_trie_lex_entry_p(entry, UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, $DENOTS);
        }
        return NIL;
    }

    public static SubLObject nl_trie_entry_preferred_denots(final SubLObject entry) {
        if (NIL != nl_trie_name_p(entry, T)) {
            return nl_trie_name_preferred_denots(entry);
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_preferred_denots(entry);
        }
        if (NIL != nl_trie_lex_entry_p(entry, UNPROVIDED)) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject nl_trie_entry_semtrans_templates(final SubLObject entry) {
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_semtrans_templates(entry);
        }
        return NIL;
    }

    public static SubLObject do_nl_trie_entry_denots(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject denot = NIL;
        SubLObject entry = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        denot = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        entry = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PCOND, list(listS(NL_TRIE_NAME_P, entry, $list62), listS(CLET, list(list(denot, list(NL_TRIE_NAME_DENOT, entry))), append(body, NIL))), list(listS(NL_TRIE_TERM_PHRASES_ENTRY_P, entry, $list62), listS(CLET, list(list(denot, list(GAF_ARG1, entry))), append(body, NIL))), list(list(NL_TRIE_WORD_P, entry), listS(DO_NL_TRIE_WORD_DENOTS, list(denot, entry), append(body, NIL))), append((NIL != subl_promotions.memberP($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL != member($CYC_NL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) ? list(list(list(LEX_ENTRY_P, entry), listS(CDOLIST, list(denot, listS(NL_TRIE_LEX_ENTRY_GET, entry, $list72)), append(body, NIL)))) : NIL, NIL));
        }
        cdestructuring_bind_error(datum, $list60);
        return NIL;
    }

    public static SubLObject do_nl_trie_entry_strings(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list73);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject string = NIL;
        SubLObject entry = NIL;
        destructuring_bind_must_consp(current, datum, $list73);
        string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list73);
        entry = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PCOND, list(listS(NL_TRIE_NAME_P, entry, $list62), listS(CLET, list(list(string, list(NL_TRIE_NAME_STRING_MACRO_HELPER, entry))), append(body, NIL))), list(listS(NL_TRIE_TERM_PHRASES_ENTRY_P, entry, $list62), listS(CLET, list(list(string, list(GAF_ARG3, entry))), append(body, NIL))), list(list(NL_TRIE_WORD_P, entry), listS(DO_NL_TRIE_WORD_STRINGS, list(string, entry), append(body, NIL))), append((NIL != subl_promotions.memberP($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL != member($CYC_NL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) ? list(list(list(LEX_ENTRY_P, entry), listS(CLET, list(list(string, listS(NL_TRIE_LEX_ENTRY_GET, entry, $list77))), append(body, NIL)))) : NIL, NIL));
        }
        cdestructuring_bind_error(datum, $list73);
        return NIL;
    }

    public static SubLObject nl_trie_name_string_macro_helper(final SubLObject name) {
        return nl_trie_name_string(name);
    }

    public static SubLObject do_nl_trie_word_syntactic_supports(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject support = NIL;
        SubLObject word = NIL;
        destructuring_bind_must_consp(current, datum, $list79);
        support = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        word = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list79);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list79);
            if (NIL == member(current_$2, $list80, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list79);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(support, list(NL_TRIE_WORD_SYNTACTIC_SUPPORT_SET, word), $DONE, done), append(body, NIL));
    }

    public static SubLObject do_nl_trie_word_semantic_supports(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject support = NIL;
        SubLObject word = NIL;
        destructuring_bind_must_consp(current, datum, $list79);
        support = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        word = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list79);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list79);
            if (NIL == member(current_$3, $list80, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list79);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(support, list(NL_TRIE_WORD_SEMANTIC_SUPPORT_SET, word), $DONE, done), append(body, NIL));
    }

    public static SubLObject nl_trie_entry_semantic_pred(final SubLObject entry, SubLObject use_abbrev_predP) {
        if (use_abbrev_predP == UNPROVIDED) {
            use_abbrev_predP = T;
        }
        if (NIL != nl_trie_name_p(entry, T)) {
            return nl_trie_name_pred(entry);
        }
        if (NIL != nl_trie_term_phrases_entry_p(entry, T)) {
            return $$termPhrases;
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_sem_pred(entry, use_abbrev_predP);
        }
        if (NIL != nl_trie_lex_entry_p(entry, UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, $PREDICATE);
        }
        return NIL;
    }

    public static SubLObject nl_trie_entry_mt(final SubLObject entry) {
        if (NIL != assertion_handles.assertion_p(entry)) {
            return assertions_high.assertion_mt(entry);
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_syntax_mt(entry);
        }
        if (NIL != nl_trie_lex_entry_p(entry, UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, $MT);
        }
        return NIL;
    }

    public static SubLObject nl_trie_entry_semantic_mt(final SubLObject entry) {
        if (NIL != assertion_handles.assertion_p(entry)) {
            return assertions_high.assertion_mt(entry);
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_semantics_mt(entry);
        }
        if (NIL != nl_trie_lex_entry_p(entry, UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, $MT);
        }
        return NIL;
    }

    public static SubLObject nl_trie_entry_semantic_support_set(final SubLObject entry) {
        if (NIL != nl_trie_name_p(entry, UNPROVIDED)) {
            final SubLObject result_set = set.new_set(UNPROVIDED, UNPROVIDED);
            set.set_add(entry, result_set);
            return result_set;
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_semantic_support_set(entry);
        }
        return NIL;
    }

    public static SubLObject nl_trie_entry_semantic_support_list(final SubLObject entry) {
        if (NIL != nl_trie_name_p(entry, UNPROVIDED)) {
            return list(entry);
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_semantic_support_list(entry);
        }
        return NIL;
    }

    public static SubLObject nl_trie_insert_entry(final SubLObject v_nl_trie, final SubLObject key0, final SubLObject entry) {
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_insert_word(v_nl_trie, key, entry);
        }
        if (NIL != nl_trie_name_p(entry, UNPROVIDED)) {
            return nl_trie_insert_name(v_nl_trie, key, entry);
        }
        if (NIL != nl_trie_entry_p(entry)) {
            return nl_trie_insert_low(v_nl_trie, key, entry);
        }
        return NIL;
    }

    public static SubLObject nl_trie_delete_entry(final SubLObject v_nl_trie, final SubLObject key0, final SubLObject entry) {
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            nl_trie_delete_word(v_nl_trie, key, entry);
        } else
            if (NIL != nl_trie_name_p(entry, UNPROVIDED)) {
                nl_trie_delete_name(v_nl_trie, key, entry);
            } else
                if (NIL != nl_trie_entry_p(entry)) {
                    nl_trie_unassociate(key, entry, v_nl_trie);
                }


        return NIL;
    }

    public static SubLObject nl_trie_entry_pragmatics(final SubLObject entry) {
        if (NIL != nl_trie_name_p(entry, UNPROVIDED)) {
            return get_nl_trie_name_pragmatic_features(entry);
        }
        if (NIL != nl_trie_term_phrases_entry_p(entry, UNPROVIDED)) {
            return get_assertion_pragmatic_features(entry);
        }
        if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
            final SubLObject semantic_support = nl_trie_word_arbitrary_semantic_support(entry);
            return nl_trie_word_semantic_support_pragmatics(semantic_support);
        }
        if (NIL != nl_trie_lex_entry_p(entry, UNPROVIDED)) {
            return nl_trie_lex_entry_get(entry, $PRAGMATICS);
        }
        return NIL;
    }

    public static SubLObject nl_trie_word_semantic_support_pragmatics(final SubLObject semantic_support) {
        return NIL != assertions_high.gaf_assertionP(semantic_support) ? get_assertion_pragmatic_features(semantic_support) : NIL;
    }

    public static SubLObject nl_trie_entry_to_javalists(final SubLObject nl_trie_entry) {
        assert NIL != nl_trie_entry_p(nl_trie_entry) : "nl_trie.nl_trie_entry_p(nl_trie_entry) " + "CommonSymbols.NIL != nl_trie.nl_trie_entry_p(nl_trie_entry) " + nl_trie_entry;
        SubLObject javalists = NIL;
        final SubLObject string = nl_trie_entry_string(nl_trie_entry);
        SubLObject cdolist_list_var;
        final SubLObject denots = cdolist_list_var = nl_trie_entry_denots(nl_trie_entry);
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject java_item = list(list(string, list(pph_utilities.new_pph_javalist_item(string, denot, NIL, NIL, NIL, ZERO_INTEGER))), denot);
            SubLObject cdolist_list_var_$4;
            final SubLObject java_list = cdolist_list_var_$4 = list(java_item);
            SubLObject java_list_item = NIL;
            java_list_item = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                javalists = cons(java_list_item, javalists);
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                java_list_item = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        } 
        javalists = delete_duplicates(javalists, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return values(javalists, nreverse(denots));
    }

    public static SubLObject javalist_string(final SubLObject javalist) {
        return javalist.first();
    }

    public static SubLObject nl_trie_word_p(final SubLObject obj, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((NIL != nl_trie_word_struc_p(obj)) && (((NIL != lexicon_macros.assume_nl_trie_validP()) || (NIL == robustP)) || (NIL != nl_trie_word_struc_valid_p(obj))));
    }

    public static SubLObject has_bad_syntactic_support_p(final SubLObject word) {
        SubLObject badP = NIL;
        final SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == badP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            support = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                badP = makeBoolean(NIL == valid_nl_trie_word_syntactic_support_p(support));
            }
        }
        return badP;
    }

    public static SubLObject nl_trie_word_copy(final SubLObject word) {
        final SubLObject syntactic_supports = set.copy_set(nl_trie_word_syntactic_support_set(word));
        final SubLObject semantic_supports = set.copy_set(nl_trie_word_semantic_support_set(word));
        return new_nl_trie_word(syntactic_supports, semantic_supports);
    }

    public static SubLObject nl_trie_word_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) || (NIL != nl_trie_word_hl_support_p(v_object)));
    }

    public static SubLObject validate_nl_trie_word(final SubLObject word, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        SubLObject bad_syntactic_supports = NIL;
        SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject syntactic_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            syntactic_support = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, syntactic_support)) && (NIL == valid_nl_trie_word_syntactic_support_p(syntactic_support))) {
                bad_syntactic_supports = cons(syntactic_support, bad_syntactic_supports);
            }
        }
        if (NIL != bad_syntactic_supports) {
            SubLObject cdolist_list_var = bad_syntactic_supports;
            SubLObject bad_syntactic_support = NIL;
            bad_syntactic_support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                nl_trie_warn(TWO_INTEGER, $str89$Removing_bad_syntactic_support___, bad_syntactic_support, word, UNPROVIDED, UNPROVIDED);
                nl_trie_word_remove_syntactic_support(word, bad_syntactic_support);
                cdolist_list_var = cdolist_list_var.rest();
                bad_syntactic_support = cdolist_list_var.first();
            } 
        }
        if (NIL != set.set_emptyP(nl_trie_word_syntactic_support_set(word))) {
            return NIL;
        }
        SubLObject bad_semantic_supports = NIL;
        set_var = nl_trie_word_semantic_support_set(word);
        set_contents_var = set.do_set_internal(set_var);
        SubLObject semantic_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            semantic_support = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) && (NIL == validate_nl_trie_word_semantic_support(semantic_support, robustP))) {
                bad_semantic_supports = cons(semantic_support, bad_semantic_supports);
            }
        }
        if (NIL != bad_semantic_supports) {
            SubLObject cdolist_list_var = bad_semantic_supports;
            SubLObject bad_semantic_support = NIL;
            bad_semantic_support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                nl_trie_warn(TWO_INTEGER, $str90$Removing_bad_semantic_support___S, bad_semantic_support, word, UNPROVIDED, UNPROVIDED);
                nl_trie_word_remove_semantic_support(word, bad_semantic_support);
                cdolist_list_var = cdolist_list_var.rest();
                bad_semantic_support = cdolist_list_var.first();
            } 
        }
        return word;
    }

    public static SubLObject nl_trie_word_struc_valid_p_internal(final SubLObject word) {
        return makeBoolean(((NIL != nl_trie_word_struc_p(word)) && (NIL != nl_trie_word_valid_syntactic_support_set_p(nl_trie_word_syntactic_support_set(word)))) && (NIL != nl_trie_word_valid_semantic_support_set_p(nl_trie_word_semantic_support_set(word))));
    }

    public static SubLObject nl_trie_word_struc_valid_p(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_word_struc_valid_p_internal(word);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NL_TRIE_WORD_STRUC_VALID_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NL_TRIE_WORD_STRUC_VALID_P, ONE_INTEGER, $int$200, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NL_TRIE_WORD_STRUC_VALID_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, word, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_word_struc_valid_p_internal(word)));
            memoization_state.caching_state_put(caching_state, word, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject nl_trie_valid_assertionP(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) && ((NIL != lexicon_macros.assume_nl_trie_validP()) || (NIL != nl_trie_valid_assertionP_memoized(v_object, UNPROVIDED))));
    }

    public static SubLObject nl_trie_valid_assertionP_memoized_internal(final SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = T;
        }
        return assertion_handles.valid_assertionP(assertion, robustP);
    }

    public static SubLObject nl_trie_valid_assertionP_memoized(final SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_valid_assertionP_memoized_internal(assertion, robustP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym92$NL_TRIE_VALID_ASSERTION__MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym92$NL_TRIE_VALID_ASSERTION__MEMOIZED, TWO_INTEGER, $int$500, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym92$NL_TRIE_VALID_ASSERTION__MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(assertion, robustP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (assertion.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && robustP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_valid_assertionP_memoized_internal(assertion, robustP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(assertion, robustP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject valid_nl_trie_word_syntactic_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != nl_trie_valid_assertionP(v_object)) || (NIL != valid_nl_trie_word_hl_syntactic_support_p(v_object)));
    }

    public static SubLObject valid_nl_trie_word_semantic_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != nl_trie_valid_assertionP(v_object)) || (NIL != valid_nl_trie_word_hl_semantic_support_p(v_object, UNPROVIDED)));
    }

    public static SubLObject nl_trie_word_semantic_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) || (NIL != nl_trie_word_hl_semantic_support_p(v_object)));
    }

    public static SubLObject nl_trie_word_syntactic_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_handles.assertion_p(v_object)) || (NIL != nl_trie_word_hl_syntactic_support_p(v_object, UNPROVIDED)));
    }

    public static SubLObject validate_nl_trie_word_semantic_support(final SubLObject v_object, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((NIL != nl_trie_valid_assertionP(v_object)) || (NIL != validate_nl_trie_word_hl_semantic_support(v_object, robustP)));
    }

    public static SubLObject nl_trie_word_hl_support_p(final SubLObject v_object) {
        return makeBoolean((NIL != nl_trie_word_hl_syntactic_support_p(v_object, UNPROVIDED)) || (NIL != nl_trie_word_hl_semantic_support_p(v_object)));
    }

    public static SubLObject valid_nl_trie_word_hl_syntactic_support_p(final SubLObject v_object) {
        return nl_trie_word_hl_syntactic_support_p(v_object, T);
    }

    public static SubLObject nl_trie_word_hl_syntactic_support_p(final SubLObject v_object, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean(((v_object.isCons() && (NIL != el_formula_p(v_object.first()))) && ((NIL == robustP) || (NIL == list_utilities.tree_find_if($sym94$INVALID_FORT_, v_object, UNPROVIDED)))) && (NIL != hlmt.hlmt_p(v_object.rest())));
    }

    public static SubLObject nl_trie_justify_hl_syntactic_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject meta_supports = NIL;
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(support, support, $list95);
        sentence = support.first();
        final SubLObject current = mt = support.rest();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != formula_arityE(sentence, TWO_INTEGER, UNPROVIDED)) {
                SubLObject current_$6;
                final SubLObject datum_$5 = current_$6 = sentence;
                SubLObject pred = NIL;
                SubLObject word = NIL;
                SubLObject string = NIL;
                destructuring_bind_must_consp(current_$6, datum_$5, $list96);
                pred = current_$6.first();
                current_$6 = current_$6.rest();
                destructuring_bind_must_consp(current_$6, datum_$5, $list96);
                word = current_$6.first();
                current_$6 = current_$6.rest();
                destructuring_bind_must_consp(current_$6, datum_$5, $list96);
                string = current_$6.first();
                current_$6 = current_$6.rest();
                if (NIL == current_$6) {
                    if (NIL == meta_supports) {
                        SubLObject csome_list_var = lexicon_cache.inference_strings_of_wordXpred(word, pred);
                        SubLObject supported_string = NIL;
                        supported_string = csome_list_var.first();
                        while ((NIL == meta_supports) && (NIL != csome_list_var)) {
                            SubLObject current_$7;
                            final SubLObject datum_$6 = current_$7 = supported_string;
                            SubLObject this_string = NIL;
                            SubLObject supports = NIL;
                            destructuring_bind_must_consp(current_$7, datum_$6, $list97);
                            this_string = current_$7.first();
                            current_$7 = supports = current_$7.rest();
                            if (this_string.equal(string)) {
                                meta_supports = supports;
                            }
                            csome_list_var = csome_list_var.rest();
                            supported_string = csome_list_var.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum_$5, $list96);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return meta_supports;
    }

    public static SubLObject nl_trie_word_hl_semantic_support_p(final SubLObject v_object) {
        return makeBoolean(v_object.isVector() && ((NIL == aref(v_object, ONE_INTEGER)) || (NIL != hlmt.hlmt_p(aref(v_object, ONE_INTEGER)))));
    }

    public static SubLObject valid_nl_trie_word_hl_semantic_support_p(final SubLObject v_object, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((((v_object.isVector() && (NIL != set.set_p(aref(v_object, ZERO_INTEGER)))) && $nl_trie_denot_set_test$.getGlobalValue().eql(set.set_test(aref(v_object, ZERO_INTEGER)))) && ((NIL == aref(v_object, ONE_INTEGER)) || (NIL != hlmt.hlmt_p(aref(v_object, ONE_INTEGER))))) && ((NIL == robustP) || (NIL != valid_nl_trie_word_denot_set_p(aref(v_object, ZERO_INTEGER)))));
    }

    public static SubLObject valid_nl_trie_word_denot_set_p(final SubLObject v_set) {
        SubLObject badP = NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject denot;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == badP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            denot = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, denot)) {
                badP = invalid_nl_trie_word_denotP(denot);
            }
        }
        return makeBoolean(NIL == badP);
    }

    public static SubLObject validate_nl_trie_word_hl_semantic_support(final SubLObject v_object, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((((v_object.isVector() && (NIL != set.set_p(aref(v_object, ZERO_INTEGER)))) && $nl_trie_denot_set_test$.getGlobalValue().eql(set.set_test(aref(v_object, ZERO_INTEGER)))) && ((NIL == aref(v_object, ONE_INTEGER)) || (NIL != hlmt.hlmt_p(aref(v_object, ONE_INTEGER))))) && ((NIL == robustP) || (NIL != validate_nl_trie_word_denot_set(aref(v_object, ZERO_INTEGER)))));
    }

    public static SubLObject validate_nl_trie_word_denot_set(final SubLObject v_set) {
        SubLObject bad = NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject denot;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            denot = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, denot)) && (NIL != invalid_nl_trie_word_denotP(denot))) {
                nl_trie_warn(TWO_INTEGER, $str98$Removing_invalid_denot___S, denot, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                bad = cons(denot, bad);
            }
        }
        SubLObject cdolist_list_var = bad;
        SubLObject bad_one = NIL;
        bad_one = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_remove(bad_one, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            bad_one = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject invalid_nl_trie_word_denotP(final SubLObject denot) {
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var = $nl_trie_word_denot_invalidity_tests$.getGlobalValue();
            SubLObject test = NIL;
            test = csome_list_var.first();
            while ((NIL == badP) && (NIL != csome_list_var)) {
                if (NIL != funcall(test, denot)) {
                    badP = T;
                }
                csome_list_var = csome_list_var.rest();
                test = csome_list_var.first();
            } 
        }
        return badP;
    }

    public static SubLObject nl_trie_denot_has_invalid_constantP(final SubLObject denot) {
        return cycl_utilities.expression_find_if($sym100$INVALID_CONSTANT_, denot, T, UNPROVIDED);
    }

    public static SubLObject find_or_create_nl_trie_word_syn_support(final SubLObject sentence, final SubLObject mt, SubLObject string) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (string.isString()) {
            final SubLObject existing = nl_trie_find_syntactic_support(sentence, mt, string);
            if (NIL != nl_trie_word_syntactic_support_p(existing)) {
                return existing;
            }
        }
        final SubLObject as = kb_indexing.find_gaf_genl_mts(sentence, mt);
        if (NIL != assertion_handles.assertion_p(as)) {
            return as;
        }
        return make_nl_trie_word_hl_syn_support(sentence, mt);
    }

    public static SubLObject nl_trie_find_syntactic_support(final SubLObject sentence, final SubLObject mt, final SubLObject string) {
        SubLObject matching_syn_support = NIL;
        final SubLObject entries = nl_trie_search(string, UNPROVIDED, UNPROVIDED);
        if (entries.isList() && (NIL == matching_syn_support)) {
            SubLObject csome_list_var = entries;
            SubLObject entry = NIL;
            entry = csome_list_var.first();
            while ((NIL == matching_syn_support) && (NIL != csome_list_var)) {
                if ((NIL != nl_trie_word_p(entry, UNPROVIDED)) && mt.eql(nl_trie_word_syntax_mt(entry))) {
                    final SubLObject set_var = nl_trie_word_syntactic_support_set(entry);
                    final SubLObject set_contents_var = set.do_set_internal(set_var);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject syn_support;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == matching_syn_support) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                        syn_support = set_contents.do_set_contents_next(basis_object, state);
                        if ((NIL != set_contents.do_set_contents_element_validP(state, syn_support)) && sentence.equal(nl_trie_word_support_sentence(syn_support))) {
                            matching_syn_support = syn_support;
                        }
                    }
                }
                csome_list_var = csome_list_var.rest();
                entry = csome_list_var.first();
            } 
        }
        return matching_syn_support;
    }

    public static SubLObject new_nl_trie_word_hl_syn_support(final SubLObject sentence, final SubLObject mt) {
        assert NIL != el_formula_p(sentence) : "el_utilities.el_formula_p(sentence) " + "CommonSymbols.NIL != el_utilities.el_formula_p(sentence) " + sentence;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        return make_nl_trie_word_hl_syn_support(sentence, mt);
    }

    public static SubLObject make_nl_trie_word_hl_syn_support(final SubLObject sentence, final SubLObject mt) {
        return cons(sentence, mt);
    }

    public static SubLObject new_nl_trie_word_hl_sem_support(final SubLObject denots, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != set.set_p(denots) : "set.set_p(denots) " + "CommonSymbols.NIL != set.set_p(denots) " + denots;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!set.set_test(denots).eql($nl_trie_denot_set_test$.getGlobalValue()))) {
            Errors.error($str104$_S___is_not_a_valid_NL_trie_denot, $nl_trie_denot_set_test$.getGlobalValue());
        }
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        return nl_trie_semantic_support_from_denots(denots, mt);
    }

    public static SubLObject nl_trie_semantic_support_from_denots(final SubLObject denots, final SubLObject mt) {
        final SubLObject support = make_vector(TWO_INTEGER, UNPROVIDED);
        nl_trie_word_hl_semantic_support_set_denots(support, denots);
        set_aref(support, ONE_INTEGER, mt);
        return support;
    }

    public static SubLObject nl_trie_word_support_sentence(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_formula(support);
        }
        if (NIL != nl_trie_word_hl_syntactic_support_p(support, UNPROVIDED)) {
            return support.first();
        }
        if (NIL != nl_trie_word_hl_semantic_support_p(support)) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject nl_trie_word_support_mt(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_mt(support);
        }
        if (NIL != nl_trie_word_hl_syntactic_support_p(support, UNPROVIDED)) {
            return support.rest();
        }
        if (NIL != nl_trie_word_hl_semantic_support_p(support)) {
            return aref(support, ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject nl_trie_word_support_predicate(final SubLObject support) {
        if (NIL != nl_trie_word_hl_semantic_support_p(support)) {
            return $$denotation;
        }
        return cycl_utilities.atomic_sentence_predicate(nl_trie_word_support_sentence(support));
    }

    public static SubLObject nl_trie_word_struc_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_nl_trie_word_struc(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject nl_trie_word_struc_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$nl_trie_word_struc_native.class ? T : NIL;
    }

    public static SubLObject nl_trie_word_struc_syntactic_supports(final SubLObject v_object) {
        assert NIL != nl_trie_word_struc_p(v_object) : "nl_trie.nl_trie_word_struc_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject nl_trie_word_struc_semantic_supports(final SubLObject v_object) {
        assert NIL != nl_trie_word_struc_p(v_object) : "nl_trie.nl_trie_word_struc_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_nl_trie_word_struc_syntactic_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != nl_trie_word_struc_p(v_object) : "nl_trie.nl_trie_word_struc_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_nl_trie_word_struc_semantic_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != nl_trie_word_struc_p(v_object) : "nl_trie.nl_trie_word_struc_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_nl_trie_word_struc(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $nl_trie_word_struc_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SYNTACTIC_SUPPORTS)) {
                _csetf_nl_trie_word_struc_syntactic_supports(v_new, current_value);
            } else
                if (pcase_var.eql($SEMANTIC_SUPPORTS)) {
                    _csetf_nl_trie_word_struc_semantic_supports(v_new, current_value);
                } else {
                    Errors.error($str122$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_nl_trie_word_struc(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_NL_TRIE_WORD_STRUC, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SYNTACTIC_SUPPORTS, nl_trie_word_struc_syntactic_supports(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMANTIC_SUPPORTS, nl_trie_word_struc_semantic_supports(obj));
        funcall(visitor_fn, obj, $END, MAKE_NL_TRIE_WORD_STRUC, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_nl_trie_word_struc_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_nl_trie_word_struc(obj, visitor_fn);
    }

    public static SubLObject sxhash_nl_trie_word_struc_method(final SubLObject v_object) {
        return logxor(new SubLObject[]{ $int$509, Sxhash.sxhash(nl_trie_word_struc_syntactic_supports(v_object)), Sxhash.sxhash(nl_trie_word_struc_semantic_supports(v_object)) });
    }

    public static SubLObject pprint_nl_trie_word_struc(final SubLObject word, final SubLObject stream, final SubLObject depth) {
        princ($str130$_NL_TRIE_WORD, stream);
        SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            support = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                format(stream, $str131$____S, support);
            }
        }
        set_var = nl_trie_word_semantic_support_set(word);
        set_contents_var = set.do_set_internal(set_var);
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            support = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, support)) {
                format(stream, $str131$____S, support);
            }
        }
        princ($str132$_, stream);
        return word;
    }

    public static SubLObject cfasl_input_nl_trie_word_struc(final SubLObject stream) {
        SubLObject nl_trie_word_struc = NIL;
        nl_trie_word_struc = make_nl_trie_word_struc(UNPROVIDED);
        _csetf_nl_trie_word_struc_syntactic_supports(nl_trie_word_struc, cfasl_input_object(stream));
        _csetf_nl_trie_word_struc_semantic_supports(nl_trie_word_struc, cfasl_input_object(stream));
        return nl_trie_word_struc;
    }

    public static SubLObject cfasl_output_nl_trie_word_struc(final SubLObject nl_trie_word_struc, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_nl_trie_word_struc$.getGlobalValue(), stream);
        cfasl_output(nl_trie_word_struc_syntactic_supports(nl_trie_word_struc), stream);
        cfasl_output(nl_trie_word_struc_semantic_supports(nl_trie_word_struc), stream);
        return nl_trie_word_struc;
    }

    public static SubLObject cfasl_output_object_nl_trie_word_struc_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_nl_trie_word_struc(v_object, stream);
    }

    public static SubLObject nl_trie_word_valid_semantic_support_set_p(final SubLObject v_object) {
        return makeBoolean(((NIL != set.set_p(v_object)) && set.set_test(v_object).eql($nl_trie_word_semantic_support_set_test$.getGlobalValue())) && (NIL == set_utilities.set_find_if_not(NL_TRIE_VALID_SEMANTIC_SUPPORT_P, v_object, UNPROVIDED)));
    }

    public static SubLObject new_nl_trie_word_semantic_support_set(SubLObject support_list) {
        if (support_list == UNPROVIDED) {
            support_list = NIL;
        }
        return set_utilities.construct_set_from_list(support_list, $nl_trie_word_semantic_support_set_test$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject nl_trie_word_valid_syntactic_support_set_p(final SubLObject v_object) {
        return makeBoolean(((NIL != set.set_p(v_object)) && set.set_test(v_object).eql($nl_trie_word_syntactic_support_set_test$.getGlobalValue())) && (NIL == set_utilities.set_find_if_not(NL_TRIE_SYNTACTIC_SUPPORT_P, v_object, UNPROVIDED)));
    }

    public static SubLObject new_nl_trie_word_syntactic_support_set(SubLObject support_list) {
        if (support_list == UNPROVIDED) {
            support_list = NIL;
        }
        return set_utilities.construct_set_from_list(support_list, $nl_trie_word_syntactic_support_set_test$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject new_nl_trie_word_for_syntactic_support(final SubLObject support) {
        return new_nl_trie_word(set_utilities.new_singleton_set(support, $nl_trie_word_syntactic_support_set_test$.getGlobalValue()), UNPROVIDED);
    }

    public static SubLObject new_nl_trie_word(final SubLObject syntactic_supports, SubLObject semantic_supports) {
        if (semantic_supports == UNPROVIDED) {
            semantic_supports = new_nl_trie_word_semantic_support_set(UNPROVIDED);
        }
        assert NIL != nl_trie_word_valid_syntactic_support_set_p(syntactic_supports) : "nl_trie.nl_trie_word_valid_syntactic_support_set_p(syntactic_supports) " + "CommonSymbols.NIL != nl_trie.nl_trie_word_valid_syntactic_support_set_p(syntactic_supports) " + syntactic_supports;
        assert NIL != nl_trie_word_valid_semantic_support_set_p(semantic_supports) : "nl_trie.nl_trie_word_valid_semantic_support_set_p(semantic_supports) " + "CommonSymbols.NIL != nl_trie.nl_trie_word_valid_semantic_support_set_p(semantic_supports) " + semantic_supports;
        return make_nl_trie_word_struc(list($SYNTACTIC_SUPPORTS, syntactic_supports, $SEMANTIC_SUPPORTS, semantic_supports));
    }

    public static SubLObject nl_trie_word_set_syn_supports(final SubLObject word, final SubLObject syn_supports) {
        assert NIL != nl_trie_word_struc_p(word) : "nl_trie.nl_trie_word_struc_p(word) " + "CommonSymbols.NIL != nl_trie.nl_trie_word_struc_p(word) " + word;
        assert NIL != nl_trie_word_valid_syntactic_support_set_p(syn_supports) : "nl_trie.nl_trie_word_valid_syntactic_support_set_p(syn_supports) " + "CommonSymbols.NIL != nl_trie.nl_trie_word_valid_syntactic_support_set_p(syn_supports) " + syn_supports;
        _csetf_nl_trie_word_struc_syntactic_supports(word, syn_supports);
        return nl_trie_word_struc_syntactic_supports(word);
    }

    public static SubLObject nl_trie_word_set_sem_supports(final SubLObject word, final SubLObject sem_supports) {
        assert NIL != nl_trie_word_struc_p(word) : "nl_trie.nl_trie_word_struc_p(word) " + "CommonSymbols.NIL != nl_trie.nl_trie_word_struc_p(word) " + word;
        assert NIL != nl_trie_word_valid_semantic_support_set_p(sem_supports) : "nl_trie.nl_trie_word_valid_semantic_support_set_p(sem_supports) " + "CommonSymbols.NIL != nl_trie.nl_trie_word_valid_semantic_support_set_p(sem_supports) " + sem_supports;
        _csetf_nl_trie_word_struc_semantic_supports(word, sem_supports);
        return nl_trie_word_struc_semantic_supports(word);
    }

    public static SubLObject nl_trie_syntactic_support_p(final SubLObject obj) {
        return makeBoolean((NIL != nl_trie_word_support_p(obj)) && (NIL != nl_trie_valid_syntactic_support_pred_p(nl_trie_word_support_predicate(obj))));
    }

    public static SubLObject nl_trie_valid_syntactic_support_pred_p(final SubLObject obj) {
        return makeBoolean(($$partOfSpeech.eql(obj) || (NIL != lexicon_accessors.speech_part_predP(obj, UNPROVIDED))) || (NIL != nl_trie_abbreviation_pred_p(obj)));
    }

    public static SubLObject nl_trie_semantic_support_p(final SubLObject obj) {
        return makeBoolean((NIL != assertion_handles.assertion_p(obj)) || (NIL != nl_trie_word_hl_semantic_support_p(obj)));
    }

    public static SubLObject nl_trie_valid_semantic_support_p(final SubLObject obj) {
        return makeBoolean((NIL != assertion_handles.valid_assertionP(obj, NIL)) || (NIL != valid_nl_trie_word_hl_semantic_support_p(obj, UNPROVIDED)));
    }

    public static SubLObject nl_trie_word_arbitrary_syntactic_support(final SubLObject word) {
        final SubLObject all_supports = nl_trie_word_syntactic_support_set(word);
        SubLObject support = NIL;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            if (NIL != set.empty_set_p(all_supports)) {
                nl_trie_warn(THREE_INTEGER, $str141$Couldn_t_find_valid_arbitrary_syn, word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                doneP = T;
            } else
                if (NIL != valid_nl_trie_word_syntactic_support_p(support)) {
                    doneP = T;
                } else
                    if (NIL != support) {
                        nl_trie_warn(TWO_INTEGER, $str89$Removing_bad_syntactic_support___, support, word, UNPROVIDED, UNPROVIDED);
                        nl_trie_word_remove_syntactic_support(word, support);
                        support = NIL;
                    } else {
                        support = set_utilities.set_arbitrary_element(all_supports);
                    }


        } 
        return support;
    }

    public static SubLObject nl_trie_word_syntactic_support_list(final SubLObject word) {
        return set.set_element_list(nl_trie_word_syntactic_supports(word));
    }

    public static SubLObject nl_trie_word_syntactic_support_set(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $call_to_nl_trie_word_syntactic_supports_licensedP$.currentBinding(thread);
        try {
            $call_to_nl_trie_word_syntactic_supports_licensedP$.bind(T, thread);
            ans = nl_trie_word_syntactic_supports(word);
        } finally {
            $call_to_nl_trie_word_syntactic_supports_licensedP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject nl_trie_word_syntactic_supports(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $call_to_nl_trie_word_syntactic_supports_licensedP$.getDynamicValue(thread)) {
            nl_trie_error($str142$Illicit_call_to_NL_TRIE_WORD_SYNT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return nl_trie_word_struc_syntactic_supports(word);
    }

    public static SubLObject nl_trie_word_semantic_support_list(final SubLObject word) {
        return set.set_element_list(nl_trie_word_semantic_support_set(word));
    }

    public static SubLObject nl_trie_word_semantic_support_set(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $call_to_nl_trie_word_semantic_supports_licensedP$.currentBinding(thread);
        try {
            $call_to_nl_trie_word_semantic_supports_licensedP$.bind(T, thread);
            ans = nl_trie_word_semantic_supports(word);
        } finally {
            $call_to_nl_trie_word_semantic_supports_licensedP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject nl_trie_word_semantic_supports(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $call_to_nl_trie_word_semantic_supports_licensedP$.getDynamicValue(thread)) {
            nl_trie_error($str143$Illicit_call_to_NL_TRIE_WORD_SEMA, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return nl_trie_word_struc_semantic_supports(word);
    }

    public static SubLObject nl_trie_word_arbitrary_semantic_support(final SubLObject word) {
        final SubLObject all_supports = nl_trie_word_semantic_support_set(word);
        SubLObject support = NIL;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            if (NIL != set.empty_set_p(all_supports)) {
                nl_trie_warn(THREE_INTEGER, $str144$Couldn_t_find_valid_arbitrary_sem, word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                doneP = T;
            } else
                if (NIL != valid_nl_trie_word_semantic_support_p(support)) {
                    doneP = T;
                } else
                    if (NIL != support) {
                        nl_trie_warn(TWO_INTEGER, $str90$Removing_bad_semantic_support___S, support, word, UNPROVIDED, UNPROVIDED);
                        nl_trie_word_remove_semantic_support(word, support);
                        support = NIL;
                    } else {
                        support = set_utilities.set_arbitrary_element(all_supports);
                    }


        } 
        return support;
    }

    public static SubLObject nl_trie_word_has_syntactic_support_p(final SubLObject word, final SubLObject support, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = T;
        }
        final SubLObject existing = nl_trie_word_syntactic_support_set(word);
        if (NIL != strictP) {
            return set.set_memberP(support, existing);
        }
        final SubLObject support_sentence = nl_trie_word_support_sentence(support);
        final SubLObject support_mt = nl_trie_word_support_mt(support);
        SubLObject foundP = NIL;
        final SubLObject set_contents_var = set.do_set_internal(existing);
        SubLObject basis_object;
        SubLObject state;
        SubLObject existing_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            existing_support = set_contents.do_set_contents_next(basis_object, state);
            if (((NIL != set_contents.do_set_contents_element_validP(state, existing_support)) && nl_trie_word_support_sentence(existing_support).equal(support_sentence)) && nl_trie_word_support_mt(existing_support).equal(support_mt)) {
                foundP = T;
            }
        }
        return foundP;
    }

    public static SubLObject nl_trie_word_add_syntactic_support(final SubLObject word, final SubLObject support, SubLObject check_for_impliedP) {
        if (check_for_impliedP == UNPROVIDED) {
            check_for_impliedP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = nl_trie_word_syntactic_support_set(word);
        SubLObject newP = NIL;
        final SubLObject _prev_bind_0 = $call_to_nl_trie_word_syntactic_supports_licensedP$.currentBinding(thread);
        try {
            $call_to_nl_trie_word_syntactic_supports_licensedP$.bind(T, thread);
            newP = set.set_add(support, existing);
        } finally {
            $call_to_nl_trie_word_syntactic_supports_licensedP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != check_for_impliedP) {
            nl_trie_word_remove_implied_hl_syntactic_supports(word);
        }
        assert NIL != nl_trie_word_p(word, UNPROVIDED) : "nl_trie.nl_trie_word_p(word, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != nl_trie.nl_trie_word_p(word, CommonSymbols.UNPROVIDED) " + word;
        return NIL != newP ? $ADDED : $ALREADY_PRESENT;
    }

    public static SubLObject nl_trie_word_remove_implied_hl_syntactic_supports(final SubLObject word) {
        SubLObject implied_supports = NIL;
        final SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject support;
        SubLObject not_implied;
        SubLObject csome_list_var;
        SubLObject pred;
        SubLObject implied_by;
        SubLObject existing;
        SubLObject set_contents_var_$9;
        SubLObject basis_object_$10;
        SubLObject state_$11;
        SubLObject existing_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            support = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, support)) && (NIL != nl_trie_word_hl_syntactic_support_p(support, UNPROVIDED))) {
                not_implied = NIL;
                if (NIL == not_implied) {
                    csome_list_var = nl_trie_word_syntactic_support_pos_preds(support);
                    pred = NIL;
                    pred = csome_list_var.first();
                    while ((NIL == not_implied) && (NIL != csome_list_var)) {
                        implied_by = NIL;
                        existing = nl_trie_word_syntactic_support_set(word);
                        set_contents_var_$9 = set.do_set_internal(existing);
                        for (basis_object_$10 = set_contents.do_set_contents_basis_object(set_contents_var_$9), state_$11 = NIL, state_$11 = set_contents.do_set_contents_initial_state(basis_object_$10, set_contents_var_$9); (NIL == implied_by) && (NIL == set_contents.do_set_contents_doneP(basis_object_$10, state_$11)); state_$11 = set_contents.do_set_contents_update_state(state_$11)) {
                            existing_support = set_contents.do_set_contents_next(basis_object_$10, state_$11);
                            if (((NIL != set_contents.do_set_contents_element_validP(state_$11, existing_support)) && (!existing_support.eql(support))) && (NIL != lexicon_accessors.genl_pos_predP(nl_trie_word_support_predicate(existing_support), pred, UNPROVIDED))) {
                                implied_by = existing_support;
                            }
                        }
                        if (NIL == implied_by) {
                            not_implied = pred;
                        }
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    } 
                }
                if (NIL == not_implied) {
                    implied_supports = cons(support, implied_supports);
                }
            }
        }
        SubLObject cdolist_list_var = implied_supports;
        SubLObject support2 = NIL;
        support2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!ONE_INTEGER.eql(set.set_size(nl_trie_word_syntactic_support_set(word)))) {
                nl_trie_word_remove_syntactic_support(word, support2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support2 = cdolist_list_var.first();
        } 
        return implied_supports;
    }

    public static SubLObject nl_trie_word_remove_syntactic_support(final SubLObject word, final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject was_thereP = NIL;
        final SubLObject support_sentence = nl_trie_word_support_sentence(support);
        SubLObject matching_supports = NIL;
        final SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject existing_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            existing_support = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, existing_support)) && nl_trie_word_support_sentence(existing_support).equal(support_sentence)) {
                matching_supports = cons(existing_support, matching_supports);
            }
        }
        if (NIL != matching_supports) {
            was_thereP = T;
            SubLObject cdolist_list_var = matching_supports;
            SubLObject support_$12 = NIL;
            support_$12 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0 = $call_to_nl_trie_word_syntactic_supports_licensedP$.currentBinding(thread);
                try {
                    $call_to_nl_trie_word_syntactic_supports_licensedP$.bind(T, thread);
                    set.set_remove(support_$12, nl_trie_word_syntactic_supports(word));
                } finally {
                    $call_to_nl_trie_word_syntactic_supports_licensedP$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support_$12 = cdolist_list_var.first();
            } 
        }
        assert NIL != nl_trie_word_p(word, UNPROVIDED) : "nl_trie.nl_trie_word_p(word, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != nl_trie.nl_trie_word_p(word, CommonSymbols.UNPROVIDED) " + word;
        return NIL != was_thereP ? $REMOVED : $NOT_FOUND;
    }

    public static SubLObject nl_trie_word_has_semantic_support_p(final SubLObject word, final SubLObject support) {
        final SubLObject existing = nl_trie_word_semantic_support_set(word);
        return set.set_memberP(support, existing);
    }

    public static SubLObject nl_trie_word_semantic_support_equalP(final SubLObject support1, final SubLObject support2) {
        return equalp(support1, support2);
    }

    public static SubLObject nl_trie_word_add_semantic_support(final SubLObject word, final SubLObject support) {
        if (NIL != nl_trie_word_has_semantic_support_p(word, support)) {
            return $ALREADY_PRESENT;
        }
        if (NIL != nl_trie_word_spliceable_semantic_support_p(support)) {
            final SubLObject existing = nl_trie_word_semantic_support_set(word);
            SubLObject splicedP = NIL;
            final SubLObject set_contents_var = set.do_set_internal(existing);
            SubLObject basis_object;
            SubLObject state;
            SubLObject existing_support;
            SubLObject set_var;
            SubLObject set_contents_var_$13;
            SubLObject basis_object_$14;
            SubLObject state_$15;
            SubLObject denot;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == splicedP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                existing_support = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, existing_support)) && (NIL != nl_trie_word_hl_semantic_supports_unifiable_p(existing_support, support))) {
                    set_var = nl_trie_word_hl_semantic_support_denots(support);
                    set_contents_var_$13 = set.do_set_internal(set_var);
                    for (basis_object_$14 = set_contents.do_set_contents_basis_object(set_contents_var_$13), state_$15 = NIL, state_$15 = set_contents.do_set_contents_initial_state(basis_object_$14, set_contents_var_$13); NIL == set_contents.do_set_contents_doneP(basis_object_$14, state_$15); state_$15 = set_contents.do_set_contents_update_state(state_$15)) {
                        denot = set_contents.do_set_contents_next(basis_object_$14, state_$15);
                        if (NIL != set_contents.do_set_contents_element_validP(state_$15, denot)) {
                            set.set_add(denot, nl_trie_word_hl_semantic_support_denots(existing_support));
                        }
                    }
                    splicedP = T;
                }
            }
            if (NIL == splicedP) {
                do_nl_trie_word_add_semantic_support(word, support);
            }
            return word;
        }
        do_nl_trie_word_add_semantic_support(word, support);
        return word;
    }

    public static SubLObject nl_trie_word_spliceable_semantic_support_p(final SubLObject support) {
        return nl_trie_word_hl_semantic_support_p(support);
    }

    public static SubLObject do_nl_trie_word_add_semantic_support(final SubLObject word, final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $call_to_nl_trie_word_semantic_supports_licensedP$.currentBinding(thread);
        try {
            $call_to_nl_trie_word_semantic_supports_licensedP$.bind(T, thread);
            set.set_add(support, nl_trie_word_semantic_supports(word));
        } finally {
            $call_to_nl_trie_word_semantic_supports_licensedP$.rebind(_prev_bind_0, thread);
        }
        assert NIL != nl_trie_word_p(word, UNPROVIDED) : "nl_trie.nl_trie_word_p(word, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != nl_trie.nl_trie_word_p(word, CommonSymbols.UNPROVIDED) " + word;
        return word;
    }

    public static SubLObject nl_trie_word_hl_semantic_supports_unifiable_p(final SubLObject support1, final SubLObject support2) {
        return makeBoolean((NIL != nl_trie_word_hl_semantic_support_p(support1)) && nl_trie_word_support_mt(support1).eql(nl_trie_word_support_mt(support2)));
    }

    public static SubLObject nl_trie_word_hl_semantic_support_denots(final SubLObject support) {
        return aref(support, ZERO_INTEGER);
    }

    public static SubLObject nl_trie_word_hl_semantic_support_set_denots(final SubLObject support, final SubLObject denots) {
        assert NIL != set.set_p(denots) : "set.set_p(denots) " + "CommonSymbols.NIL != set.set_p(denots) " + denots;
        set_aref(support, ZERO_INTEGER, denots);
        return support;
    }

    public static SubLObject nl_trie_word_semantic_support_denots_internal(final SubLObject support, SubLObject denot_arg) {
        if (denot_arg == UNPROVIDED) {
            denot_arg = NIL;
        }
        if (NIL != nl_trie_valid_assertionP(support)) {
            if (!denot_arg.isInteger()) {
                final SubLObject pred = nl_trie_word_support_predicate(support);
                denot_arg = lexicon_utilities.denotatum_arg_of_pred_cached(pred);
            }
            if (denot_arg.isInteger()) {
                final SubLObject terms = cycl_utilities.formula_terms(nl_trie_word_support_sentence(support), UNPROVIDED);
                final SubLObject okP = list_utilities.lengthG(terms, denot_arg, UNPROVIDED);
                if (NIL == okP) {
                    nl_trie_error($str150$Can_t_get_arg__S_of__S, denot_arg, support, UNPROVIDED, UNPROVIDED);
                }
                return NIL != okP ? list(nth(denot_arg, terms)) : NIL;
            }
        } else
            if (NIL != nl_trie_word_hl_semantic_support_p(support)) {
                return set.set_element_list(nl_trie_word_hl_semantic_support_denots(support));
            }

        return NIL;
    }

    public static SubLObject nl_trie_word_semantic_support_denots(final SubLObject support, SubLObject denot_arg) {
        if (denot_arg == UNPROVIDED) {
            denot_arg = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_word_semantic_support_denots_internal(support, denot_arg);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS, TWO_INTEGER, NIL, EQUALP, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(support, denot_arg);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (support.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && denot_arg.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_word_semantic_support_denots_internal(support, denot_arg)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(support, denot_arg));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject nl_trie_word_semantic_support_semtrans_templates_internal(final SubLObject support, SubLObject semtrans_template_arg) {
        if (semtrans_template_arg == UNPROVIDED) {
            semtrans_template_arg = NIL;
        }
        if (NIL != nl_trie_valid_assertionP(support)) {
            return NIL != assertions_high.gaf_assertionP(support) ? list(lexicon_accessors.semtrans_template_from_assertion(support, semtrans_template_arg)) : NIL;
        }
        return NIL;
    }

    public static SubLObject nl_trie_word_semantic_support_semtrans_templates(final SubLObject support, SubLObject semtrans_template_arg) {
        if (semtrans_template_arg == UNPROVIDED) {
            semtrans_template_arg = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_word_semantic_support_semtrans_templates_internal(support, semtrans_template_arg);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES, TWO_INTEGER, NIL, EQUALP, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(support, semtrans_template_arg);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (support.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && semtrans_template_arg.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_word_semantic_support_semtrans_templates_internal(support, semtrans_template_arg)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(support, semtrans_template_arg));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject nl_trie_word_remove_semantic_support(final SubLObject word, final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject was_thereP = NIL;
        final SubLObject _prev_bind_0 = $call_to_nl_trie_word_semantic_supports_licensedP$.currentBinding(thread);
        try {
            $call_to_nl_trie_word_semantic_supports_licensedP$.bind(T, thread);
            was_thereP = set.set_remove(support, nl_trie_word_semantic_supports(word));
        } finally {
            $call_to_nl_trie_word_semantic_supports_licensedP$.rebind(_prev_bind_0, thread);
        }
        return NIL != was_thereP ? word : $NOT_FOUND;
    }

    public static SubLObject nl_trie_word_pos_preds(final SubLObject word) {
        SubLObject preds = NIL;
        final SubLObject set_var = nl_trie_word_syntactic_support_set(word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject syn_support;
        SubLObject cdolist_list_var;
        SubLObject pred;
        SubLObject item_var;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            syn_support = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, syn_support)) {
                cdolist_list_var = nl_trie_word_syntactic_support_pos_preds(syn_support);
                pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    item_var = pred;
                    if (NIL == member(item_var, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                        preds = cons(item_var, preds);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            }
        }
        if (NIL == preds) {
            preds = $list152;
        }
        return preds;
    }

    public static SubLObject nl_trie_word_syntactic_support_abbreviation_p(final SubLObject syn_support) {
        return nl_trie_abbreviation_pred_p(nl_trie_word_support_predicate(syn_support));
    }

    public static SubLObject nl_trie_word_syntactic_support_pos_preds(final SubLObject syn_support) {
        final SubLObject syn_support_sentence = nl_trie_word_support_sentence(syn_support);
        final SubLObject syn_arg0 = nl_trie_word_support_predicate(syn_support);
        if (NIL != nl_trie_abbreviation_pred_p(syn_arg0)) {
            SubLObject preds = NIL;
            final SubLObject const_arg = nl_trie_const_arg_of_pred(syn_arg0);
            final SubLObject v_const = cycl_utilities.atomic_sentence_arg(syn_support_sentence, const_arg, UNPROVIDED);
            SubLObject cdolist_list_var = find_pos_preds_for_lex_const(v_const);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = pred;
                if (NIL == member(item_var, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                    preds = cons(item_var, preds);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            return preds;
        }
        if ($$partOfSpeech.eql(syn_arg0)) {
            return nl_trie_closed_class_pos_preds(cycl_utilities.atomic_sentence_arg2(syn_support_sentence, UNPROVIDED), UNPROVIDED);
        }
        return list(syn_arg0);
    }

    public static SubLObject clear_nl_trie_closed_class_pos_preds() {
        final SubLObject cs = $nl_trie_closed_class_pos_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_nl_trie_closed_class_pos_preds(final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($nl_trie_closed_class_pos_preds_caching_state$.getGlobalValue(), list(pos, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_closed_class_pos_preds_internal(final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        SubLObject too_generalP = NIL;
        if (NIL == too_generalP) {
            SubLObject node_var = pos;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$16 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                        final SubLObject tv_var = $$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str160$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str160$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str160$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str165$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str160$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$21 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pos, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while ((NIL != node_var) && (NIL == too_generalP)) {
                                            final SubLObject genl_pos = node_var;
                                            if (NIL == lexicon_accessors.speech_partP(genl_pos, UNPROVIDED)) {
                                                too_generalP = T;
                                            } else
                                                if (NIL != lexicon_accessors.genl_posP(genl_pos, $$ClosedClassWord, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var = lexicon_accessors.max_preds_of_pos(genl_pos);
                                                    SubLObject pos_pred = NIL;
                                                    pos_pred = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject item_var = pos_pred;
                                                        if (NIL == member(item_var, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            preds = cons(item_var, preds);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        pos_pred = cdolist_list_var.first();
                                                    } 
                                                }

                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$20;
                                            SubLObject _prev_bind_1_$21;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$27;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$21;
                                            SubLObject iteration_state_$29;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$22;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$31;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$23;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; (NIL == too_generalP) && (NIL != rest); rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == too_generalP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$27 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$27)) {
                                                                        _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$27, thread);
                                                                            for (iteration_state_$29 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == too_generalP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$29)); iteration_state_$29 = dictionary_contents.do_dictionary_contents_next(iteration_state_$29)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$29);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == too_generalP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                if (NIL == too_generalP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while ((NIL == too_generalP) && (NIL != csome_list_var)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str168$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$22, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$29);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$21, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str169$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$31 = NIL, rest_$31 = new_list; (NIL == too_generalP) && (NIL != rest_$31); rest_$31 = rest_$31.rest()) {
                                                                generating_fn = rest_$31.first();
                                                                _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == too_generalP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            if (NIL == too_generalP) {
                                                                                csome_list_var2 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while ((NIL == too_generalP) && (NIL != csome_list_var2)) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str168$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$23, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$22, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$20, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$19, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str170$Node__a_does_not_pass_sbhl_type_t, pos, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$21, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$19, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$18, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$18, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$16, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return preds;
    }

    public static SubLObject nl_trie_closed_class_pos_preds(final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $nl_trie_closed_class_pos_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NL_TRIE_CLOSED_CLASS_POS_PREDS, $nl_trie_closed_class_pos_preds_caching_state$, $int$64, EQL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_NL_TRIE_CLOSED_CLASS_POS_PREDS);
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
                if (pos.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(nl_trie_closed_class_pos_preds_internal(pos, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pos, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject nl_trie_const_arg_of_pred(final SubLObject pred) {
        if (NIL == nl_trie_abbreviation_pred_p(pred)) {
            return NIL;
        }
        if (pred.eql($$abbreviationForLexicalWord)) {
            return TWO_INTEGER;
        }
        return THREE_INTEGER;
    }

    public static SubLObject nl_trie_word_syn_pred_string_arg(final SubLObject pred) {
        if (pred.eql($$partOfSpeech)) {
            return THREE_INTEGER;
        }
        if (NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED)) {
            return TWO_INTEGER;
        }
        if (NIL != nl_trie_abbreviation_pred_p(pred)) {
            return nl_trie_abbr_arg_of_pred(pred);
        }
        return NIL;
    }

    public static SubLObject nl_trie_abbr_arg_of_pred(final SubLObject pred) {
        if (NIL == nl_trie_abbreviation_pred_p(pred)) {
            return NIL;
        }
        if (pred.eql($$abbreviationForLexicalWord)) {
            return THREE_INTEGER;
        }
        return FOUR_INTEGER;
    }

    public static SubLObject nl_trie_word_pos_internal(final SubLObject word) {
        final SubLObject syn_support = nl_trie_word_arbitrary_syntactic_support(word);
        final SubLObject pred = nl_trie_word_support_predicate(syn_support);
        final SubLObject sem_support = (pred.eql($$gerund)) ? NIL : set_utilities.set_find_if(ASSERTION_P, nl_trie_word_semantic_support_set(word), UNPROVIDED);
        final SubLObject sem_pos = (NIL != sem_support) ? nl_trie_semantic_support_pos(sem_support) : NIL;
        if (NIL != sem_pos) {
            return sem_pos;
        }
        if (pred.eql($$partOfSpeech)) {
            return cycl_utilities.formula_arg2(nl_trie_word_support_sentence(syn_support), UNPROVIDED);
        }
        if (NIL != nl_trie_abbreviation_pred_p(pred)) {
            final SubLObject const_arg = nl_trie_const_arg_of_pred(pred);
            final SubLObject v_const = cycl_utilities.atomic_sentence_arg(nl_trie_word_support_sentence(syn_support), const_arg, UNPROVIDED);
            return find_pos_for_lex_const(v_const);
        }
        if (NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED)) {
            return lexicon_accessors.pos_of_pred(pred);
        }
        return NIL;
    }

    public static SubLObject nl_trie_word_pos(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_word_pos_internal(word);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NL_TRIE_WORD_POS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NL_TRIE_WORD_POS, ONE_INTEGER, $int$1000, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NL_TRIE_WORD_POS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, word, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_word_pos_internal(word)));
            memoization_state.caching_state_put(caching_state, word, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject nl_trie_word_word_unit(final SubLObject word, SubLObject verify_wordhoodP) {
        if (verify_wordhoodP == UNPROVIDED) {
            verify_wordhoodP = T;
        }
        final SubLObject syn_support = nl_trie_word_arbitrary_syntactic_support(word);
        final SubLObject pred = nl_trie_word_support_predicate(syn_support);
        if (NIL != nl_trie_multi_word_abbreviation_pred_p(pred)) {
            return NIL;
        }
        final SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached(pred);
        SubLObject result = NIL;
        if (wu_arg.isInteger()) {
            result = cycl_utilities.atomic_sentence_arg(nl_trie_word_support_sentence(syn_support), wu_arg, UNPROVIDED);
        }
        return (NIL == verify_wordhoodP) || (NIL != lexicon_accessors.quick_lexical_wordP(result, UNPROVIDED)) ? result : NIL;
    }

    public static SubLObject nl_trie_word_frame(final SubLObject word) {
        final SubLObject set_var = nl_trie_word_semantic_support_set(word);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject sem_support;
        SubLObject frame;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            sem_support = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, sem_support)) {
                frame = nl_trie_word_semantic_support_frame(sem_support);
                if (NIL != forts.fort_p(frame)) {
                    return frame;
                }
            }
        }
        return NIL;
    }

    public static SubLObject nl_trie_word_semantic_support_frame(final SubLObject sem_support) {
        final SubLObject pred = nl_trie_word_support_predicate(sem_support);
        final SubLObject frame_arg = lexicon_utilities.frame_arg_of_pred_cached(pred, UNPROVIDED);
        return frame_arg.isInteger() ? cycl_utilities.atomic_sentence_arg(nl_trie_word_support_sentence(sem_support), frame_arg, UNPROVIDED) : NIL;
    }

    public static SubLObject do_nl_trie_word_denots(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list179);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject denot = NIL;
        SubLObject entry = NIL;
        destructuring_bind_must_consp(current, datum, $list179);
        denot = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list179);
        entry = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$34 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list179);
            current_$34 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list179);
            if (NIL == member(current_$34, $list180, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$34 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list179);
        }
        final SubLObject preferred_onlyP_tail = property_list_member($kw181$PREFERRED_ONLY_, current);
        final SubLObject preferred_onlyP = (NIL != preferred_onlyP_tail) ? cadr(preferred_onlyP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject pred = $sym182$PRED;
        final SubLObject denot_arg = $sym183$DENOT_ARG;
        final SubLObject semantic_support = $sym184$SEMANTIC_SUPPORT;
        return list(CLET, list(list(pred, listS(NL_TRIE_WORD_SEM_PRED, entry, $list7)), list(denot_arg, list(FWHEN, list(INDEXED_TERM_P, pred), list(DENOTATUM_ARG_OF_PRED_CACHED, pred)))), list(PWHEN, list(INTEGERP, denot_arg), list(DO_SET, list(semantic_support, list(NL_TRIE_WORD_SEMANTIC_SUPPORT_SET, entry)), list(PWHEN, list(FIMPLIES, preferred_onlyP, list($sym191$NL_TRIE_PREFERRED_SEMANTIC_SUPPORT_, semantic_support)), listS(CDOLIST, list(denot, list(NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS, semantic_support, denot_arg)), append(body, NIL))))));
    }

    public static SubLObject nl_trie_preferred_semantic_supportP(final SubLObject semantic_support) {
        SubLObject preferredP = NIL;
        if (NIL != nl_trie_preferred_semantic_predicate_p(nl_trie_word_support_predicate(semantic_support))) {
            preferredP = T;
        } else
            if (NIL != nl_trie_preferred_lexical_assertionP(semantic_support)) {
                preferredP = T;
            }

        return preferredP;
    }

    public static SubLObject nl_trie_preferred_semantic_predicate_p(final SubLObject predicate) {
        return subl_promotions.memberP(predicate, $nl_trie_preferred_semantic_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_preferred_lexical_assertionP(final SubLObject semantic_support) {
        SubLObject preferredP = NIL;
        if ((NIL != assertion_handles.assertion_p(semantic_support)) && (NIL == preferredP)) {
            SubLObject csome_list_var = assertion_utilities.all_meta_assertions(semantic_support);
            SubLObject meta_assertion = NIL;
            meta_assertion = csome_list_var.first();
            while ((NIL == preferredP) && (NIL != csome_list_var)) {
                if (NIL != nl_trie_preferred_meta_assertionP(meta_assertion)) {
                    preferredP = T;
                }
                csome_list_var = csome_list_var.rest();
                meta_assertion = csome_list_var.first();
            } 
        }
        return preferredP;
    }

    public static SubLObject nl_trie_preferred_meta_assertionP(final SubLObject meta_assertion) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(meta_assertion)) && (NIL != genl_predicates.genl_predicateP(assertions_high.gaf_arg0(meta_assertion), $$preferredLexification, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject do_nl_trie_word_semtrans_templates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list194);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject semtrans_template = NIL;
        SubLObject entry = NIL;
        destructuring_bind_must_consp(current, datum, $list194);
        semtrans_template = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list194);
        entry = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject pred = $sym195$PRED;
            final SubLObject semtrans_template_arg = $sym196$SEMTRANS_TEMPLATE_ARG;
            final SubLObject semantic_support = $sym197$SEMANTIC_SUPPORT;
            final SubLObject invalid_supports = $sym198$INVALID_SUPPORTS;
            return list(CLET, list(list(pred, listS(NL_TRIE_WORD_SEM_PRED, entry, $list7)), list(semtrans_template_arg, list(FWHEN, list(INDEXED_TERM_P, pred), list(SEMTRANS_ARG_OF_PRED_CACHED, pred))), bq_cons(invalid_supports, $list7)), list(PWHEN, list(INTEGERP, semtrans_template_arg), list(DO_SET, list(semantic_support, list(NL_TRIE_WORD_SEMANTIC_SUPPORT_SET, entry)), list(PIF, list(VALID_NL_TRIE_WORD_SEMANTIC_SUPPORT_P, semantic_support), listS(CDOLIST, list(semtrans_template, list(NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES, semantic_support, semtrans_template_arg)), append(body, NIL)), list(CPUSH, semantic_support, invalid_supports))), list(CDOLIST, list(semantic_support, invalid_supports), list(NL_TRIE_WORD_REMOVE_SEMANTIC_SUPPORT, entry, semantic_support))));
        }
        cdestructuring_bind_error(datum, $list194);
        return NIL;
    }

    public static SubLObject do_nl_trie_word_strings(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list204);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject string = NIL;
        SubLObject word_entry = NIL;
        destructuring_bind_must_consp(current, datum, $list204);
        string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list204);
        word_entry = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject semantic_support = $sym205$SEMANTIC_SUPPORT;
            final SubLObject leading_strings = $sym206$LEADING_STRINGS;
            final SubLObject head_string = $sym207$HEAD_STRING;
            final SubLObject following_strings = $sym208$FOLLOWING_STRINGS;
            return list(CLET, list(list(head_string, list(NL_TRIE_WORD_HEAD_STRING_MACRO_HELPER, word_entry))), list(DO_NL_TRIE_WORD_SEMANTIC_SUPPORTS, list(semantic_support, word_entry), listS(CLET, list(list(leading_strings, list(NL_TRIE_WORD_LEADING_STRINGS_FROM_SUPPORT_MACRO_HELPER, semantic_support)), list(following_strings, list(NL_TRIE_WORD_FOLLOWING_STRINGS_FROM_SUPPORT_MACRO_HELPER, semantic_support)), list(string, list(NL_TRIE_ASSEMBLE_STRINGS_MACRO_HELPER, leading_strings, head_string, following_strings))), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list204);
        return NIL;
    }

    public static SubLObject nl_trie_word_head_string_macro_helper(final SubLObject word) {
        return nl_trie_word_head_string(word);
    }

    public static SubLObject nl_trie_word_leading_strings_from_support_macro_helper(final SubLObject support) {
        return nl_trie_word_leading_strings_from_support(support);
    }

    public static SubLObject nl_trie_word_following_strings_from_support_macro_helper(final SubLObject support) {
        return nl_trie_word_following_strings_from_support(support);
    }

    public static SubLObject nl_trie_assemble_strings_macro_helper(final SubLObject leading_strings, final SubLObject head_string, final SubLObject following_strings) {
        return nl_trie_assemble_strings(leading_strings, head_string, following_strings);
    }

    public static SubLObject nl_trie_word_string(final SubLObject word) {
        final SubLObject leading_strings = nl_trie_word_leading_strings(word);
        final SubLObject head_string = nl_trie_word_head_string(word);
        final SubLObject following_strings = nl_trie_word_following_strings(word);
        return NIL != head_string ? nl_trie_assemble_strings(leading_strings, head_string, following_strings) : NIL;
    }

    public static SubLObject nl_trie_word_head_string(final SubLObject word) {
        final SubLObject syn_support = nl_trie_word_arbitrary_syntactic_support(word);
        return nl_trie_syntactic_support_string(syn_support);
    }

    public static SubLObject nl_trie_syntactic_support_string(final SubLObject syn_support) {
        final SubLObject pred = nl_trie_word_support_predicate(syn_support);
        final SubLObject head_string_arg = nl_trie_word_syn_pred_string_arg(pred);
        return head_string_arg.isInteger() ? cycl_string.cycl_string_to_utf8_string(cycl_utilities.atomic_sentence_arg(nl_trie_word_support_sentence(syn_support), head_string_arg, UNPROVIDED)) : NIL;
    }

    public static SubLObject nl_trie_word_leading_strings(final SubLObject word) {
        final SubLObject sem_support = nl_trie_word_arbitrary_semantic_support(word);
        return nl_trie_word_leading_strings_from_support(sem_support);
    }

    public static SubLObject nl_trie_word_leading_strings_from_support(final SubLObject support) {
        return lexicon_utilities.get_leading_strings_from_formula(nl_trie_word_support_sentence(support));
    }

    public static SubLObject nl_trie_word_following_strings(final SubLObject word) {
        final SubLObject sem_support = nl_trie_word_arbitrary_semantic_support(word);
        return nl_trie_word_following_strings_from_support(sem_support);
    }

    public static SubLObject nl_trie_word_following_strings_from_support(final SubLObject support) {
        return lexicon_utilities.get_following_strings_from_formula(nl_trie_word_support_sentence(support));
    }

    public static SubLObject nl_trie_word_head_onlyP(final SubLObject word) {
        return makeBoolean((NIL == nl_trie_word_leading_strings(word)) && (NIL == nl_trie_word_following_strings(word)));
    }

    public static SubLObject nl_trie_head_locations_in_lexical_string(final SubLObject v_cycl_string) {
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
        final SubLObject entries = nl_trie_search(string, UNPROVIDED, UNPROVIDED);
        SubLObject locations = NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != nl_trie_word_p(entry, UNPROVIDED)) {
                final SubLObject head_string = nl_trie_word_head_string(entry);
                final SubLObject var;
                final SubLObject location = var = lexification_utilities.lex_find_word_in_string(head_string, string);
                if (NIL != var) {
                    locations = cons(var, locations);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return remove_duplicates(locations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_word_sem_pred(final SubLObject word, SubLObject use_abbrev_predP) {
        if (use_abbrev_predP == UNPROVIDED) {
            use_abbrev_predP = T;
        }
        final SubLObject syntactic_support = nl_trie_word_arbitrary_syntactic_support(word);
        final SubLObject syn_arg0 = nl_trie_word_support_predicate(syntactic_support);
        final SubLObject semantic_support = nl_trie_word_arbitrary_semantic_support(word);
        if ((NIL != use_abbrev_predP) && (NIL != nl_trie_abbreviation_pred_p(syn_arg0))) {
            return syn_arg0;
        }
        if (NIL != nl_trie_word_support_p(semantic_support)) {
            return nl_trie_word_support_predicate(semantic_support);
        }
        return NIL;
    }

    public static SubLObject nl_trie_word_denots(final SubLObject word) {
        SubLObject denots = NIL;
        final SubLObject pred = nl_trie_word_sem_pred(word, NIL);
        final SubLObject denot_arg = (NIL != indexed_term_p(pred)) ? lexicon_utilities.denotatum_arg_of_pred_cached(pred) : NIL;
        if (denot_arg.isInteger()) {
            final SubLObject set_var = nl_trie_word_semantic_support_set(word);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject semantic_support;
            SubLObject cdolist_list_var;
            SubLObject denot;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                semantic_support = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) {
                    cdolist_list_var = nl_trie_word_semantic_support_denots(semantic_support, denot_arg);
                    denot = NIL;
                    denot = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        denots = cons(denot, denots);
                        cdolist_list_var = cdolist_list_var.rest();
                        denot = cdolist_list_var.first();
                    } 
                }
            }
        }
        return denots;
    }

    public static SubLObject nl_trie_word_preferred_denots(final SubLObject word) {
        SubLObject denots = NIL;
        final SubLObject pred = nl_trie_word_sem_pred(word, NIL);
        final SubLObject denot_arg = (NIL != indexed_term_p(pred)) ? lexicon_utilities.denotatum_arg_of_pred_cached(pred) : NIL;
        if (denot_arg.isInteger()) {
            final SubLObject set_var = nl_trie_word_semantic_support_set(word);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject semantic_support;
            SubLObject cdolist_list_var;
            SubLObject denot;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                semantic_support = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) && (NIL != nl_trie_preferred_semantic_supportP(semantic_support))) {
                    cdolist_list_var = nl_trie_word_semantic_support_denots(semantic_support, denot_arg);
                    denot = NIL;
                    denot = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        denots = cons(denot, denots);
                        cdolist_list_var = cdolist_list_var.rest();
                        denot = cdolist_list_var.first();
                    } 
                }
            }
        }
        return denots;
    }

    public static SubLObject nl_trie_word_semtrans_templates(final SubLObject word) {
        SubLObject semtrans_templates = NIL;
        final SubLObject pred = nl_trie_word_sem_pred(word, NIL);
        final SubLObject semtrans_template_arg = (NIL != indexed_term_p(pred)) ? lexicon_utilities.semtrans_arg_of_pred_cached(pred) : NIL;
        SubLObject invalid_supports = NIL;
        if (semtrans_template_arg.isInteger()) {
            final SubLObject set_var = nl_trie_word_semantic_support_set(word);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject semantic_support;
            SubLObject cdolist_list_var;
            SubLObject semtrans_template;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                semantic_support = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, semantic_support)) {
                    if (NIL != valid_nl_trie_word_semantic_support_p(semantic_support)) {
                        cdolist_list_var = nl_trie_word_semantic_support_semtrans_templates(semantic_support, semtrans_template_arg);
                        semtrans_template = NIL;
                        semtrans_template = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            semtrans_templates = cons(semtrans_template, semtrans_templates);
                            cdolist_list_var = cdolist_list_var.rest();
                            semtrans_template = cdolist_list_var.first();
                        } 
                    } else {
                        invalid_supports = cons(semantic_support, invalid_supports);
                    }
                }
            }
            SubLObject cdolist_list_var2 = invalid_supports;
            SubLObject semantic_support2 = NIL;
            semantic_support2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                nl_trie_word_remove_semantic_support(word, semantic_support2);
                cdolist_list_var2 = cdolist_list_var2.rest();
                semantic_support2 = cdolist_list_var2.first();
            } 
        }
        return semtrans_templates;
    }

    public static SubLObject nl_trie_word_syntax_mt(final SubLObject word) {
        return nl_trie_word_support_mt(nl_trie_word_arbitrary_syntactic_support(word));
    }

    public static SubLObject nl_trie_word_semantics_mt(final SubLObject word) {
        if (NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word))) {
            return NIL;
        }
        final SubLObject syntax_mt = nl_trie_word_syntax_mt(word);
        final SubLObject semantic_support = nl_trie_word_arbitrary_semantic_support(word);
        final SubLObject semantics_mt = nl_trie_word_support_mt(semantic_support);
        return NIL != lexicon_accessors.genl_lexicon_mtP(semantics_mt, syntax_mt) ? semantics_mt : syntax_mt;
    }

    public static SubLObject print_nl_trie_word(final SubLObject word, final SubLObject stream, final SubLObject depth) {
        format(stream, $str214$__NL_TRIE_WORD_Word_unit______S__, nl_trie_word_word_unit(word, UNPROVIDED));
        format(stream, $str215$_______________POS____________S__, nl_trie_word_pos(word));
        format(stream, $str216$_______________POS_Preds______S__, nl_trie_word_pos_preds(word));
        format(stream, $str217$_______________Lexical_Pred___S__, nl_trie_entry_semantic_pred(word, UNPROVIDED));
        format(stream, $str218$_______________Denotations____S__, nl_trie_entry_denots(word));
        format(stream, $str219$_______________Pragmatics_____S__, nl_trie_entry_pragmatics(word));
        format(stream, $str220$_______________Microtheory____S__, nl_trie_entry_mt(word));
        return word;
    }

    public static SubLObject print_nl_trie_name(final SubLObject name, final SubLObject stream, final SubLObject depth) {
        format(stream, $str221$__NL_TRIE_NAME_Namestring_Pred___, nl_trie_entry_semantic_pred(name, UNPROVIDED));
        format(stream, $str222$_______________Denotations_______, nl_trie_entry_denots(name));
        format(stream, $str223$_______________Pragmatics________, nl_trie_entry_pragmatics(name));
        format(stream, $str224$_______________Microtheory_______, nl_trie_entry_mt(name));
        return name;
    }

    public static SubLObject nl_trie_name_p(final SubLObject obj, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((NIL != nart_handles.nart_p(obj)) || (((NIL != assertion_handles.assertion_p(obj)) && (NIL == nl_trie_term_phrases_entry_p(obj, NIL))) && (((NIL != lexicon_macros.assume_nl_trie_validP()) || (NIL == robustP)) || ((NIL != assertions_high.gaf_assertionP(obj)) && (NIL != nl_trie_name_string_predP(assertions_high.gaf_arg0(obj)))))));
    }

    public static SubLObject validate_nl_trie_name(final SubLObject name) {
        final SubLObject validP = makeBoolean(((NIL != lexicon_macros.assume_nl_trie_validP()) || (NIL != nart_handles.valid_nartP(name, UNPROVIDED))) || (NIL != nl_trie_valid_assertionP(name)));
        if (NIL == validP) {
            nl_trie_warn(TWO_INTEGER, $str225$Invalid_NL_trie_name___S, name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL != validP ? name : NIL;
    }

    public static SubLObject validate_nl_trie_term_phrases_entry(final SubLObject tp_entry) {
        final SubLObject validP = makeBoolean((NIL != lexicon_macros.assume_nl_trie_validP()) || (NIL != nl_trie_valid_assertionP(tp_entry)));
        if (NIL == validP) {
            nl_trie_warn(TWO_INTEGER, $str226$Invalid_NL_trie_tp_entry___S, tp_entry, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL != validP ? tp_entry : NIL;
    }

    public static SubLObject nl_trie_name_pred(final SubLObject name) {
        if (NIL != assertion_handles.assertion_p(name)) {
            return assertions_high.gaf_arg0(name);
        }
        return NIL;
    }

    public static SubLObject nl_trie_name_denot(final SubLObject name) {
        if (NIL != nart_handles.nart_p(name)) {
            return name;
        }
        if (NIL != assertion_handles.assertion_p(name)) {
            return assertions_high.gaf_arg1(name);
        }
        return NIL;
    }

    public static SubLObject nl_trie_name_preferred_denots(final SubLObject name) {
        if ((NIL != assertion_handles.assertion_p(name)) && (NIL != nl_trie_preferred_semantic_supportP(name))) {
            return list(nl_trie_name_denot(name));
        }
        return NIL;
    }

    public static SubLObject nl_trie_name_string(final SubLObject name) {
        if (NIL != assertion_handles.assertion_p(name)) {
            return cycl_string.cycl_string_to_utf8_string(assertions_high.gaf_arg2(name));
        }
        return NIL;
    }

    public static SubLObject nl_trie_record_p_internal(final SubLObject obj) {
        return makeBoolean((obj.isCons() && (NIL != valid_nl_trie_record_key_p(obj.first()))) && (NIL != valid_nl_trie_record_entries_p(obj.rest())));
    }

    public static SubLObject nl_trie_record_p(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_record_p_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NL_TRIE_RECORD_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NL_TRIE_RECORD_P, ONE_INTEGER, NIL, EQUALP, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NL_TRIE_RECORD_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_record_p_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject new_nl_trie_record(final SubLObject key, final SubLObject entries) {
        assert NIL != valid_nl_trie_record_key_p(key) : "nl_trie.valid_nl_trie_record_key_p(key) " + "CommonSymbols.NIL != nl_trie.valid_nl_trie_record_key_p(key) " + key;
        assert NIL != valid_nl_trie_record_entries_p(entries) : "nl_trie.valid_nl_trie_record_entries_p(entries) " + "CommonSymbols.NIL != nl_trie.valid_nl_trie_record_entries_p(entries) " + entries;
        return cons(unicode_nauts.convert_unicode_nauts_to_utf8_strings(key), entries);
    }

    public static SubLObject nl_trie_record_key(final SubLObject record) {
        assert NIL != nl_trie_record_p(record) : "nl_trie.nl_trie_record_p(record) " + "CommonSymbols.NIL != nl_trie.nl_trie_record_p(record) " + record;
        return record.first();
    }

    public static SubLObject nl_trie_record_entries(final SubLObject record) {
        assert NIL != nl_trie_record_p(record) : "nl_trie.nl_trie_record_p(record) " + "CommonSymbols.NIL != nl_trie.nl_trie_record_p(record) " + record;
        return record.rest();
    }

    public static SubLObject valid_nl_trie_record_key_p(final SubLObject obj) {
        return makeBoolean(obj.isList() && (NIL == list_utilities.find_if_not(CYCL_STRING_P, obj, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject valid_nl_trie_record_entries_p(final SubLObject obj) {
        return makeBoolean(obj.isList() && (NIL == list_utilities.find_if_not(NL_TRIE_ENTRY_P, obj, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject nl_trie_syntactic_predicates() {
        if (!$nl_trie_syntactic_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_syntactic_predicates();
        }
        return $nl_trie_syntactic_predicates$.getGlobalValue();
    }

    public static SubLObject nl_trie_denotation_predicates() {
        if (!$nl_trie_denotation_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_denotation_predicates();
        }
        return $nl_trie_denotation_predicates$.getGlobalValue();
    }

    public static SubLObject nl_trie_semtrans_predicates() {
        if (!$nl_trie_semtrans_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_other_predicates();
        }
        return $nl_trie_semtrans_predicates$.getGlobalValue();
    }

    public static SubLObject nl_trie_abbreviation_predicates() {
        if (!$nl_trie_abbreviation_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_other_predicates();
        }
        return $nl_trie_abbreviation_predicates$.getGlobalValue();
    }

    public static SubLObject nl_trie_arg_in_reln_predicates() {
        if (!$nl_trie_arg_in_reln_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_other_predicates();
        }
        return $nl_trie_arg_in_reln_predicates$.getGlobalValue();
    }

    public static SubLObject nl_trie_pragmatic_predicates() {
        if (!$nl_trie_pragmatic_predicates$.getGlobalValue().isList()) {
            initialize_nl_trie_pragmatic_predicates();
        }
        return $nl_trie_pragmatic_predicates$.getGlobalValue();
    }

    public static SubLObject initializing_nl_trie(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list240);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_nl_trie = NIL;
        destructuring_bind_must_consp(current, datum, $list240);
        v_nl_trie = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(list($nl_tries_being_initialized$, listS(CONS, v_nl_trie, $list243))), listS(WITH_NL_TRIE_LOCK_HELD, $list244, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list240);
        return NIL;
    }

    public static SubLObject nl_trie_being_initializedP(SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = get_nl_trie();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_nl_trie, $nl_tries_being_initialized$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_nl_trie(SubLObject test) {
        if (test == UNPROVIDED) {
            test = $nl_trie_default_test$.getGlobalValue();
        }
        return strie.new_strie(test);
    }

    public static SubLObject nl_trie_p(final SubLObject v_object, SubLObject sloppyP) {
        if (sloppyP == UNPROVIDED) {
            sloppyP = T;
        }
        return strie.strie_p(v_object, sloppyP);
    }

    public static SubLObject nl_trie_presentP(SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        return nl_trie_p(v_nl_trie, UNPROVIDED);
    }

    public static SubLObject get_nl_trie() {
        if (NIL != nl_trie_presentP(UNPROVIDED)) {
            return $nl_trie$.getGlobalValue();
        }
        return NIL;
    }

    public static SubLObject nl_trie_size(SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        if (NIL == nl_trie_presentP(v_nl_trie)) {
            nl_trie_not_present_message(v_nl_trie);
            return $ABORTED;
        }
        return strie.strie_size(v_nl_trie);
    }

    public static SubLObject nl_trie_keys(SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        if (NIL == nl_trie_presentP(v_nl_trie)) {
            nl_trie_not_present_message(v_nl_trie);
            return $ABORTED;
        }
        return strie.strie_keys(v_nl_trie);
    }

    public static SubLObject empty_nl_trieP(SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        if (NIL == nl_trie_presentP(v_nl_trie)) {
            nl_trie_not_present_message(v_nl_trie);
            return $ABORTED;
        }
        return strie.strie_empty_p(v_nl_trie);
    }

    public static SubLObject do_nl_trie(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list247);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject entries = NIL;
        destructuring_bind_must_consp(current, datum, $list247);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list247);
        entries = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$35 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list247);
            current_$35 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list247);
            if (NIL == member(current_$35, $list80, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$35 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list247);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(WITH_NL_TRIE_LOCK_HELD, $list248, list(WITH_NL_TRIE_CACHE_STRATEGY, listS(DO_STRIE, list(key, entries, $list250, $DONE, done), append(body, NIL))));
    }

    public static SubLObject do_nl_trie_progress(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list251);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject entries = NIL;
        destructuring_bind_must_consp(current, datum, $list251);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list251);
        entries = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$36 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list251);
            current_$36 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list251);
            if (NIL == member(current_$36, $list252, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$36 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list251);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject progress_note_tail = property_list_member($PROGRESS_NOTE, current);
        final SubLObject progress_note = (NIL != progress_note_tail) ? cadr(progress_note_tail) : $str254$Mapping_NL_trie___;
        final SubLObject body;
        current = body = temp;
        return list(WITH_NL_TRIE_LOCK_HELD, $list255, list(WITH_NL_TRIE_CACHE_STRATEGY, listS(DO_STRIE_PROGRESS, list(key, entries, $list250, $DONE, done, $PROGRESS_NOTE, progress_note), append(body, NIL))));
    }

    public static SubLObject nl_trie_entry_count(SubLObject string) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != string) {
            final SubLObject entries = nl_trie_search(string, UNPROVIDED, UNPROVIDED);
            return entries.isList() ? length(entries) : ZERO_INTEGER;
        }
        SubLObject count = ZERO_INTEGER;
        SubLObject release = NIL;
        try {
            release = seize_lock($nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                file_vector_utilities.$current_backed_map_cache_strategy$.bind($nl_trie_cache_strategy$.getGlobalValue(), thread);
                final SubLObject stack = stacks.create_stack();
                final SubLObject iterator = map_utilities.new_map_iterator(get_nl_trie());
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject dict_key = NIL;
                        SubLObject dict_value = NIL;
                        destructuring_bind_must_consp(current, datum, $list256);
                        dict_key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list256);
                        dict_value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != map_utilities.map_p(dict_value)) {
                                stacks.stack_push(dict_value, stack);
                            } else
                                if (dict_value.isCons()) {
                                    final SubLObject key = dict_value.first();
                                    final SubLObject entries2 = dict_value.rest();
                                    count = add(count, length(entries2));
                                }

                        } else {
                            cdestructuring_bind_error(datum, $list256);
                        }
                    }
                }
                while (NIL == stacks.stack_empty_p(stack)) {
                    final SubLObject entry = stacks.stack_pop(stack);
                    final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
                    SubLObject valid2;
                    for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                        thread.resetMultipleValues();
                        final SubLObject var2 = iteration.iteration_next(iterator2);
                        valid2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid2) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = var2;
                            SubLObject dict_key2 = NIL;
                            SubLObject dict_value2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list256);
                            dict_key2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list256);
                            dict_value2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if (NIL != map_utilities.map_p(dict_value2)) {
                                    stacks.stack_push(dict_value2, stack);
                                } else
                                    if (dict_value2.isCons()) {
                                        final SubLObject key2 = dict_value2.first();
                                        final SubLObject entries3 = dict_value2.rest();
                                        count = add(count, length(entries3));
                                    }

                            } else {
                                cdestructuring_bind_error(datum2, $list256);
                            }
                        }
                    }
                } 
            } finally {
                file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock($nl_trie_lock$.getGlobalValue());
            }
        }
        return count;
    }

    public static SubLObject copy_nl_trie(final SubLObject from_trie, final SubLObject to_trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == nl_trie_presentP(from_trie)) {
            nl_trie_not_present_message(from_trie);
            return $ABORTED;
        }
        if (NIL == nl_trie_presentP(to_trie)) {
            nl_trie_not_present_message(to_trie);
            return $ABORTED;
        }
        clear_nl_trie(to_trie);
        if (from_trie.eql($nl_trie$.getGlobalValue())) {
            SubLObject release = NIL;
            try {
                release = seize_lock($nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                    file_vector_utilities.$current_backed_map_cache_strategy$.bind($nl_trie_cache_strategy$.getGlobalValue(), thread);
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject iterator = map_utilities.new_map_iterator(from_trie);
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject dict_key = NIL;
                            SubLObject dict_value = NIL;
                            destructuring_bind_must_consp(current, datum, $list256);
                            dict_key = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list256);
                            dict_value = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != map_utilities.map_p(dict_value)) {
                                    stacks.stack_push(dict_value, stack);
                                } else
                                    if (dict_value.isCons()) {
                                        final SubLObject key = dict_value.first();
                                        SubLObject cdolist_list_var;
                                        final SubLObject values = cdolist_list_var = dict_value.rest();
                                        SubLObject value = NIL;
                                        value = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            nl_trie_insert_low(to_trie, key, value);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            value = cdolist_list_var.first();
                                        } 
                                    }

                            } else {
                                cdestructuring_bind_error(datum, $list256);
                            }
                        }
                    }
                    while (NIL == stacks.stack_empty_p(stack)) {
                        final SubLObject entry = stacks.stack_pop(stack);
                        final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
                        SubLObject valid2;
                        for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                            thread.resetMultipleValues();
                            final SubLObject var2 = iteration.iteration_next(iterator2);
                            valid2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid2) {
                                SubLObject current2;
                                final SubLObject datum2 = current2 = var2;
                                SubLObject dict_key2 = NIL;
                                SubLObject dict_value2 = NIL;
                                destructuring_bind_must_consp(current2, datum2, $list256);
                                dict_key2 = current2.first();
                                current2 = current2.rest();
                                destructuring_bind_must_consp(current2, datum2, $list256);
                                dict_value2 = current2.first();
                                current2 = current2.rest();
                                if (NIL == current2) {
                                    if (NIL != map_utilities.map_p(dict_value2)) {
                                        stacks.stack_push(dict_value2, stack);
                                    } else
                                        if (dict_value2.isCons()) {
                                            final SubLObject key2 = dict_value2.first();
                                            SubLObject cdolist_list_var2;
                                            final SubLObject values2 = cdolist_list_var2 = dict_value2.rest();
                                            SubLObject value2 = NIL;
                                            value2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                nl_trie_insert_low(to_trie, key2, value2);
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                value2 = cdolist_list_var2.first();
                                            } 
                                        }

                                } else {
                                    cdestructuring_bind_error(datum2, $list256);
                                }
                            }
                        }
                    } 
                } finally {
                    file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                }
            } finally {
                if (NIL != release) {
                    release_lock($nl_trie_lock$.getGlobalValue());
                }
            }
        } else {
            final SubLObject stack2 = stacks.create_stack();
            final SubLObject iterator3 = map_utilities.new_map_iterator(from_trie);
            SubLObject valid3;
            for (SubLObject done_var3 = NIL; NIL == done_var3; done_var3 = makeBoolean(NIL == valid3)) {
                thread.resetMultipleValues();
                final SubLObject var3 = iteration.iteration_next(iterator3);
                valid3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid3) {
                    SubLObject current3;
                    final SubLObject datum3 = current3 = var3;
                    SubLObject dict_key3 = NIL;
                    SubLObject dict_value3 = NIL;
                    destructuring_bind_must_consp(current3, datum3, $list256);
                    dict_key3 = current3.first();
                    current3 = current3.rest();
                    destructuring_bind_must_consp(current3, datum3, $list256);
                    dict_value3 = current3.first();
                    current3 = current3.rest();
                    if (NIL == current3) {
                        if (NIL != map_utilities.map_p(dict_value3)) {
                            stacks.stack_push(dict_value3, stack2);
                        } else
                            if (dict_value3.isCons()) {
                                final SubLObject key3 = dict_value3.first();
                                SubLObject cdolist_list_var3;
                                final SubLObject values3 = cdolist_list_var3 = dict_value3.rest();
                                SubLObject value3 = NIL;
                                value3 = cdolist_list_var3.first();
                                while (NIL != cdolist_list_var3) {
                                    nl_trie_insert_low(to_trie, key3, value3);
                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                    value3 = cdolist_list_var3.first();
                                } 
                            }

                    } else {
                        cdestructuring_bind_error(datum3, $list256);
                    }
                }
            }
            while (NIL == stacks.stack_empty_p(stack2)) {
                final SubLObject entry2 = stacks.stack_pop(stack2);
                final SubLObject iterator4 = map_utilities.new_map_iterator(entry2);
                SubLObject valid4;
                for (SubLObject done_var4 = NIL; NIL == done_var4; done_var4 = makeBoolean(NIL == valid4)) {
                    thread.resetMultipleValues();
                    final SubLObject var4 = iteration.iteration_next(iterator4);
                    valid4 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid4) {
                        SubLObject current4;
                        final SubLObject datum4 = current4 = var4;
                        SubLObject dict_key4 = NIL;
                        SubLObject dict_value4 = NIL;
                        destructuring_bind_must_consp(current4, datum4, $list256);
                        dict_key4 = current4.first();
                        current4 = current4.rest();
                        destructuring_bind_must_consp(current4, datum4, $list256);
                        dict_value4 = current4.first();
                        current4 = current4.rest();
                        if (NIL == current4) {
                            if (NIL != map_utilities.map_p(dict_value4)) {
                                stacks.stack_push(dict_value4, stack2);
                            } else
                                if (dict_value4.isCons()) {
                                    final SubLObject key4 = dict_value4.first();
                                    SubLObject cdolist_list_var4;
                                    final SubLObject values4 = cdolist_list_var4 = dict_value4.rest();
                                    SubLObject value4 = NIL;
                                    value4 = cdolist_list_var4.first();
                                    while (NIL != cdolist_list_var4) {
                                        nl_trie_insert_low(to_trie, key4, value4);
                                        cdolist_list_var4 = cdolist_list_var4.rest();
                                        value4 = cdolist_list_var4.first();
                                    } 
                                }

                        } else {
                            cdestructuring_bind_error(datum4, $list256);
                        }
                    }
                }
            } 
        }
        return $COPIED;
    }

    public static SubLObject clear_nl_trie(SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == nl_trie_presentP(v_nl_trie)) {
            nl_trie_not_present_message(v_nl_trie);
            return $ABORTED;
        }
        if ($nl_trie$.getGlobalValue().eql(v_nl_trie)) {
            SubLObject release = NIL;
            try {
                release = seize_lock($nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                    format(T, $str258$__Clearing_the_present_contents_o, v_nl_trie);
                    nl_trie_staleness_test.nl_trie_clear_revisions();
                    cache_utilities.cache_strategy_reset($nl_trie_cache_strategy$.getGlobalValue());
                    strie.strie_clear(v_nl_trie);
                } finally {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                }
            } finally {
                if (NIL != release) {
                    release_lock($nl_trie_lock$.getGlobalValue());
                }
            }
        } else {
            strie.strie_clear(v_nl_trie);
        }
        return $CLEARED;
    }

    public static SubLObject swap_out_all_pristine_nl_trie_entries(SubLObject v_nl_trie, SubLObject cache_strategy) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        if (cache_strategy == UNPROVIDED) {
            cache_strategy = $nl_trie_cache_strategy$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paged_out_count = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                thread.resetMultipleValues();
                final SubLObject the_trie = file_vector_utilities.swap_out_all_pristine_backed_map_objects(v_nl_trie);
                final SubLObject paged_out = thread.secondMultipleValue();
                thread.resetMultipleValues();
                paged_out_count = paged_out;
                cache_utilities.cache_strategy_reset(cache_strategy);
            } finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock($nl_trie_lock$.getGlobalValue());
            }
        }
        return paged_out_count;
    }

    public static SubLObject initialize_nl_trie(SubLObject v_nl_trie, SubLObject init_nl_trie_syntactic_predsP, SubLObject init_nl_trie_denot_predsP, SubLObject init_nl_trie_other_predsP, SubLObject init_nl_trie_pragmatic_predsP) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        if (init_nl_trie_syntactic_predsP == UNPROVIDED) {
            init_nl_trie_syntactic_predsP = T;
        }
        if (init_nl_trie_denot_predsP == UNPROVIDED) {
            init_nl_trie_denot_predsP = T;
        }
        if (init_nl_trie_other_predsP == UNPROVIDED) {
            init_nl_trie_other_predsP = T;
        }
        if (init_nl_trie_pragmatic_predsP == UNPROVIDED) {
            init_nl_trie_pragmatic_predsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nl_trie_presentP(v_nl_trie)) {
            clear_nl_trie(v_nl_trie);
            final SubLObject _prev_bind_0 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $nl_tries_being_initialized$.currentBinding(thread);
            try {
                lexicon_vars.$parse_morphologically$.bind($NEVER, thread);
                $nl_tries_being_initialized$.bind(cons(v_nl_trie, $nl_tries_being_initialized$.getDynamicValue(thread)), thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($nl_trie_lock$.getGlobalValue());
                    final SubLObject _prev_bind_0_$37 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                        if (v_nl_trie.eql(get_nl_trie())) {
                            nl_trie_completion.prepare_nl_trie_completion_index();
                        }
                        clear_nl_trie_caches();
                        if (NIL != init_nl_trie_syntactic_predsP) {
                            initialize_nl_trie_syntactic_predicates();
                        }
                        if (NIL != init_nl_trie_denot_predsP) {
                            initialize_nl_trie_denotation_predicates();
                        }
                        if (NIL != init_nl_trie_other_predsP) {
                            initialize_nl_trie_other_predicates();
                        }
                        if (NIL != init_nl_trie_pragmatic_predsP) {
                            initialize_nl_trie_pragmatic_predicates();
                        }
                        final SubLObject local_state;
                        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject _prev_bind_0_$38 = memoization_state.$memoization_state$.currentBinding(thread);
                        try {
                            memoization_state.$memoization_state$.bind(local_state, thread);
                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                            try {
                                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$39 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$40 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                    initialize_nl_trie_int(v_nl_trie);
                                } finally {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$40, thread);
                                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$39, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                }
                            }
                        } finally {
                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$38, thread);
                        }
                        clear_nl_trie_caches();
                        nl_trie_staleness_test.nl_trie_note_revisions();
                        nl_trie_staleness_test.declare_nl_trie_not_known_stale();
                    } finally {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$37, thread);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock($nl_trie_lock$.getGlobalValue());
                    }
                }
            } finally {
                $nl_tries_being_initialized$.rebind(_prev_bind_2, thread);
                lexicon_vars.$parse_morphologically$.rebind(_prev_bind_0, thread);
            }
            return $INITIALIZED;
        }
        nl_trie_not_present_message(v_nl_trie);
        return $ABORTED;
    }

    public static SubLObject nl_trie_entries_for_string(final SubLObject v_cycl_string, SubLObject case_sensitivity) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind(case_sensitivity, thread);
            final SubLObject search_result = ans = nl_trie_search(string, UNPROVIDED, UNPROVIDED);
            if (ans.isList()) {
                ans = append(ans, morphological_word_parser.derived_nl_trie_words(string));
            }
        } finally {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject nl_trie_search(final SubLObject v_cycl_string, SubLObject v_nl_trie, SubLObject case_sensitivity) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
        if (case_sensitivity.eql($OFF)) {
            return nl_trie_search_case_insensitive(string, v_nl_trie);
        }
        if (case_sensitivity.eql($ON)) {
            return nl_trie_search_case_sensitive(string, v_nl_trie);
        }
        if (case_sensitivity.eql($PREFERRED)) {
            return nl_trie_search_case_sensitive_preferred(string, v_nl_trie);
        }
        nl_trie_error($str264$Didn_t_recognize_NL_Trie_case_sen, case_sensitivity, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject nl_trie_case_sensitive_p(SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = get_nl_trie();
        }
        return eql(symbol_function(EQUAL), strie.strie_test(v_nl_trie));
    }

    public static SubLObject nl_trie_search_case_sensitive_internal(final SubLObject string, final SubLObject v_nl_trie) {
        return nl_trie_search_int(string, v_nl_trie, $ON);
    }

    public static SubLObject nl_trie_search_case_sensitive(final SubLObject string, final SubLObject v_nl_trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_search_case_sensitive_internal(string, v_nl_trie);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NL_TRIE_SEARCH_CASE_SENSITIVE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NL_TRIE_SEARCH_CASE_SENSITIVE, TWO_INTEGER, $int$48, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NL_TRIE_SEARCH_CASE_SENSITIVE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(string, v_nl_trie);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_nl_trie.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_search_case_sensitive_internal(string, v_nl_trie)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, v_nl_trie));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject nl_trie_search_case_insensitive_internal(final SubLObject string, final SubLObject v_nl_trie) {
        return nl_trie_search_int(string, v_nl_trie, $OFF);
    }

    public static SubLObject nl_trie_search_case_insensitive(final SubLObject string, final SubLObject v_nl_trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_search_case_insensitive_internal(string, v_nl_trie);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NL_TRIE_SEARCH_CASE_INSENSITIVE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NL_TRIE_SEARCH_CASE_INSENSITIVE, TWO_INTEGER, $int$48, EQUALP, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NL_TRIE_SEARCH_CASE_INSENSITIVE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(string, v_nl_trie);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (string.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_nl_trie.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_search_case_insensitive_internal(string, v_nl_trie)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, v_nl_trie));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject nl_trie_search_case_sensitive_preferred_internal(final SubLObject string, final SubLObject v_nl_trie) {
        return nl_trie_search_int(string, v_nl_trie, $PREFERRED);
    }

    public static SubLObject nl_trie_search_case_sensitive_preferred(final SubLObject string, final SubLObject v_nl_trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return nl_trie_search_case_sensitive_preferred_internal(string, v_nl_trie);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NL_TRIE_SEARCH_CASE_SENSITIVE_PREFERRED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NL_TRIE_SEARCH_CASE_SENSITIVE_PREFERRED, TWO_INTEGER, $int$48, EQUALP, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NL_TRIE_SEARCH_CASE_SENSITIVE_PREFERRED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(string, v_nl_trie);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (string.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_nl_trie.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(nl_trie_search_case_sensitive_preferred_internal(string, v_nl_trie)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, v_nl_trie));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject nl_trie_search_int(final SubLObject string, SubLObject v_nl_trie, SubLObject case_sensitivity) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                if (NIL == nl_trie_presentP(v_nl_trie)) {
                    nl_trie_not_present_message(v_nl_trie);
                    ans = $ABORTED;
                } else
                    if (NIL != empty_nl_trieP(v_nl_trie)) {
                        nl_trie_warn(ONE_INTEGER, $str269$NL_Trie_empty_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        ans = NIL;
                    } else
                        if ((v_nl_trie.eql($nl_trie$.getGlobalValue()) && (NIL != nl_trie_staleness_test.nl_trie_unfinishedP())) && (NIL == nl_trie_being_initializedP($nl_trie$.getGlobalValue()))) {
                            nl_trie_warn(ONE_INTEGER, $str270$NL_Trie_incompletely_built_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            clear_nl_trie(UNPROVIDED);
                            ans = $ABORTED;
                        } else
                            if ((v_nl_trie.eql($nl_trie$.getGlobalValue()) && (NIL == nl_trie_staleness_test.nl_trie_staleness_acceptableP())) && (NIL != nl_trie_staleness_test.nl_trie_revisions_staleP())) {
                                nl_trie_warn(ONE_INTEGER, $str271$NL_trie_built_with_stale_code__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                clear_nl_trie(v_nl_trie);
                                ans = $ABORTED;
                            } else {
                                SubLObject cdolist_list_var = nl_trie_string_tokenize_multiple(string);
                                SubLObject key = NIL;
                                key = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    ans = union(ans, NIL != key ? nl_trie_remove_invalid_entries(nl_trie_lookup(v_nl_trie, key, case_sensitivity), v_nl_trie, key) : NIL, EQUAL, UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    key = cdolist_list_var.first();
                                } 
                            }



            } finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock($nl_trie_lock$.getGlobalValue());
            }
        }
        return ans;
    }

    public static SubLObject augment_nl_trie_syntactic(final SubLObject assertion, SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == nl_trie_presentP(v_nl_trie)) {
            return NIL;
        }
        if (NIL != lexicon_vars.$initialize_nl_trie_control_varsP$.getDynamicValue(thread)) {
            initialize_nl_trie_control_vars();
        }
        if (NIL != nl_trie_syntactic_assertionP(assertion)) {
            return update_nl_trie_syntactic(assertion, v_nl_trie, NIL);
        }
        nl_trie_warn_bad_add(assertion);
        return $NOT_ADDED;
    }

    public static SubLObject prune_nl_trie_syntactic(final SubLObject assertion, SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == nl_trie_presentP(v_nl_trie)) {
            return NIL;
        }
        if (NIL != lexicon_vars.$initialize_nl_trie_control_varsP$.getDynamicValue(thread)) {
            initialize_nl_trie_control_vars();
        }
        if (NIL != nl_trie_syntactic_assertionP(assertion)) {
            return update_nl_trie_syntactic(assertion, v_nl_trie, T);
        }
        nl_trie_warn_bad_remove(assertion);
        return $NOT_REMOVED;
    }

    public static SubLObject augment_nl_trie_semantic(final SubLObject assertion, SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == nl_trie_presentP(v_nl_trie)) {
            return NIL;
        }
        if (NIL != lexicon_vars.$initialize_nl_trie_control_varsP$.getDynamicValue(thread)) {
            initialize_nl_trie_control_vars();
        }
        if (NIL != nl_trie_semantic_assertionP(assertion)) {
            return update_nl_trie_semantic(assertion, v_nl_trie, NIL, UNPROVIDED);
        }
        nl_trie_warn_bad_add(assertion);
        return values($NOT_ADDED, NIL);
    }

    public static SubLObject prune_nl_trie_semantic(final SubLObject assertion, SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == nl_trie_presentP(v_nl_trie)) {
            return NIL;
        }
        if (NIL != lexicon_vars.$initialize_nl_trie_control_varsP$.getDynamicValue(thread)) {
            initialize_nl_trie_control_vars();
        }
        if (NIL != nl_trie_semantic_assertionP(assertion)) {
            return update_nl_trie_semantic(assertion, v_nl_trie, T, UNPROVIDED);
        }
        nl_trie_warn_bad_remove(assertion);
        return values($NOT_REMOVED, NIL);
    }

    public static SubLObject retriefy_semantic_assertion(final SubLObject assertion, SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        if (NIL != nl_trie_semantic_assertionP(assertion)) {
            prune_nl_trie_semantic(assertion, v_nl_trie);
            augment_nl_trie_semantic(assertion, v_nl_trie);
            return $RETRIEFIED;
        }
        return $NOT_RETRIEFIED;
    }

    public static SubLObject nl_trie_carefully_load_global(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject stream = NIL;
        SubLObject global = NIL;
        SubLObject type = NIL;
        destructuring_bind_must_consp(current, datum, $list276);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        global = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list276);
        type = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject top = $sym277$TOP;
            return list(CLET, list(list(top, listS(CFASL_INPUT, stream, $list279))), list(PIF, list(CAND, list(CNOT, listS(EQ, top, $list280)), list(type, top)), list(CSETQ, global, top), list(WARN, $str283$___S_is_not_the_right_type_of_obj, top, list(QUOTE, global), list(QUOTE, type))));
        }
        cdestructuring_bind_error(datum, $list276);
        return NIL;
    }

    public static SubLObject load_nl_trie_from_lexicon_cache(final SubLObject stream) {
        final SubLObject top = cfasl_input(stream, NIL, $EOF);
        if ((top != $EOF) && (NIL != map_utilities.map_p(top))) {
            $nl_trie$.setGlobalValue(top);
        } else {
            Errors.warn($str283$___S_is_not_the_right_type_of_obj, top, $nl_trie$, MAP_P);
        }
        return stream;
    }

    public static SubLObject dump_nl_trie_to_lexicon_cache(final SubLObject stream) {
        cfasl_output($nl_trie$.getGlobalValue(), stream);
        return stream;
    }

    public static SubLObject load_nl_trie_completion_index(final SubLObject stream) {
        final SubLObject top = cfasl_input(stream, NIL, $EOF);
        if ((top != $EOF) && (NIL != map_utilities.map_p(top))) {
            nl_trie_completion.$nl_trie_completion_index$.setGlobalValue(top);
        } else {
            Errors.warn($str283$___S_is_not_the_right_type_of_obj, top, $nl_trie_completion_index$, MAP_P);
        }
        return stream;
    }

    public static SubLObject dump_nl_trie_completion_index(final SubLObject stream) {
        cfasl_output(nl_trie_completion.$nl_trie_completion_index$.getGlobalValue(), stream);
        return stream;
    }

    public static SubLObject reconnect_nl_trie_backing(final SubLObject directory, final SubLObject common_symbols) {
        final SubLObject data_file = lexicon_cache.get_nl_trie_contents_data_file(directory);
        final SubLObject index_file = lexicon_cache.get_nl_trie_contents_index_file(directory);
        return reconnect_nl_trie_to_file_vector_files(data_file, index_file, common_symbols);
    }

    public static SubLObject reconnect_nl_trie_to_file_vector_files(final SubLObject data_file, final SubLObject index_file, SubLObject common_symbols) {
        if (common_symbols == UNPROVIDED) {
            common_symbols = cfasl_current_common_symbols();
        }
        final SubLObject valid_files = makeBoolean((NIL != file_utilities.file_existsP(data_file)) && (NIL != file_utilities.file_existsP(index_file)));
        if (NIL != file_vector_utilities.backed_map_p($nl_trie$.getGlobalValue())) {
            if (NIL == valid_files) {
                Errors.error($str288$Mismatch_between_world_and_HL_cac, data_file, index_file);
            }
            final SubLObject fvector = file_vector.new_file_vector(data_file, index_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            file_vector_utilities.reconnect_backed_map($nl_trie$.getGlobalValue(), fvector, common_symbols);
            return file_vector_utilities.backed_map_p($nl_trie$.getGlobalValue());
        }
        if (NIL != valid_files) {
            $nl_trie$.setGlobalValue(file_vector_utilities.new_backed_map_from_files($nl_trie$.getGlobalValue(), data_file, index_file, common_symbols));
            return file_vector_utilities.backed_map_p($nl_trie$.getGlobalValue());
        }
        if (NIL != kb_control_vars.nl_kb_loaded_p()) {
            Errors.warn($str289$Reconnecting_to_legacy_unit_files, data_file, index_file);
            return NIL;
        }
        return NIL;
    }

    public static SubLObject dump_swappable_nl_trie_to_lexicon_cache(final SubLObject lexicon_cache_stream, final SubLObject fvector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = dump_swappable_nl_trie_new_context(fvector);
        final SubLObject visitor = new_swappable_nl_trie_dump_visitor(v_context);
        SubLObject future_nl_trie = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                file_vector_utilities.$current_backed_map_cache_strategy$.bind($nl_trie_cache_strategy$.getGlobalValue(), thread);
                strie.visit_strie_hierarchically($nl_trie$.getGlobalValue(), visitor);
            } finally {
                file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock($nl_trie_lock$.getGlobalValue());
            }
        }
        future_nl_trie = dump_swappable_nl_trie_get_final_result(v_context);
        cfasl_output(future_nl_trie, lexicon_cache_stream);
        return lexicon_cache_stream;
    }

    public static SubLObject new_swappable_nl_trie_dump_visitor(final SubLObject v_context) {
        return hierarchical_visitor.new_hiearchical_visitor(DUMP_SWAPPABLE_NL_TRIE_VISITOR_BEGIN_VISIT, DUMP_SWAPPABLE_NL_TRIE_VISITOR_BEGIN_PATH, DUMP_SWAPPABLE_NL_TRIE_VISITOR_ACCEPT_NODE, DUMP_SWAPPABLE_NL_TRIE_VISITOR_END_PATH, DUMP_SWAPPABLE_NL_TRIE_VISITOR_END_VISIT, v_context);
    }

    public static SubLObject dump_swappable_nl_trie_visitor_begin_visit(final SubLObject visitor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == dump_swappable_nl_trie_valid_initial_context(v_context))) {
            Errors.error($str295$The_NL_trie_visitor_is_not_proper, v_context);
        }
        return visitor;
    }

    public static SubLObject dump_swappable_nl_trie_visitor_end_visit(final SubLObject visitor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == dump_swappable_nl_trie_valid_final_context(v_context))) {
            Errors.error($str296$The_NL_trie_visitor_did_nto_compl, v_context);
        }
        return visitor;
    }

    public static SubLObject dump_swappable_nl_trie_visitor_begin_path(final SubLObject visitor, final SubLObject path) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        dump_swappable_nl_trie_push_new_current_map(v_context, path);
        return visitor;
    }

    public static SubLObject dump_swappable_nl_trie_visitor_end_path(final SubLObject visitor, final SubLObject path) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        SubLObject curr_map = dump_swappable_nl_trie_pop_current_map(v_context, path);
        final SubLObject fvector = dump_swappable_nl_trie_get_file_vector(v_context);
        final SubLObject modified_map = file_vector_utilities.convert_map_to_file_vector_backed_map(curr_map, fvector, $SWAPPED_OUT, $COMPACT);
        if (NIL == path) {
            dump_swappable_nl_trie_set_final_result(v_context, modified_map);
        } else {
            final SubLObject map_key = path.first();
            final SubLObject swappable_map = file_vector_utilities.new_future_backed_map(modified_map);
            curr_map = dump_swappable_nl_trie_get_current_map(v_context);
            map_utilities.map_put(curr_map, map_key, swappable_map);
        }
        return visitor;
    }

    public static SubLObject dump_swappable_nl_trie_visitor_accept_node(final SubLObject visitor, final SubLObject node) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject curr_map = dump_swappable_nl_trie_get_current_map(v_context);
        SubLObject map_key = NIL;
        SubLObject payload = NIL;
        destructuring_bind_must_consp(node, node, $list299);
        map_key = node.first();
        final SubLObject current = payload = node.rest();
        map_utilities.map_put(curr_map, map_key, payload);
        return visitor;
    }

    public static SubLObject dump_swappable_nl_trie_new_context(final SubLObject fvector) {
        return list_utilities.make_plist(list($FILE_VECTOR, $MAP_STACK), list(fvector, stacks.create_stack()));
    }

    public static SubLObject dump_swappable_nl_trie_valid_initial_context(final SubLObject v_context) {
        return makeBoolean(((NIL != list_utilities.property_list_p(v_context)) && (NIL != file_vector.file_vector_p(getf(v_context, $FILE_VECTOR, UNPROVIDED)))) && (NIL != stacks.stack_empty_p(getf(v_context, $MAP_STACK, UNPROVIDED))));
    }

    public static SubLObject dump_swappable_nl_trie_valid_final_context(final SubLObject v_context) {
        return makeBoolean(((NIL != list_utilities.property_list_p(v_context)) && (NIL != file_vector.file_vector_p(getf(v_context, $FILE_VECTOR, UNPROVIDED)))) && ONE_INTEGER.numE(stacks.stack_size(getf(v_context, $MAP_STACK, UNPROVIDED))));
    }

    public static SubLObject dump_swappable_nl_trie_get_current_map(final SubLObject v_context) {
        final SubLObject map_stack = getf(v_context, $MAP_STACK, UNPROVIDED);
        return stacks.stack_peek(map_stack);
    }

    public static SubLObject dump_swappable_nl_trie_get_file_vector(final SubLObject v_context) {
        return getf(v_context, $FILE_VECTOR, UNPROVIDED);
    }

    public static SubLObject dump_swappable_nl_trie_pop_current_map(final SubLObject v_context, final SubLObject path) {
        final SubLObject map_stack = getf(v_context, $MAP_STACK, UNPROVIDED);
        return stacks.stack_pop(map_stack);
    }

    public static SubLObject dump_swappable_nl_trie_push_new_current_map(final SubLObject v_context, final SubLObject path) {
        final SubLObject map_stack = getf(v_context, $MAP_STACK, UNPROVIDED);
        final SubLObject map = dictionary.new_dictionary(map_utilities.map_test(get_nl_trie()), UNPROVIDED);
        stacks.stack_push(map, map_stack);
        return map;
    }

    public static SubLObject dump_swappable_nl_trie_get_final_result(final SubLObject v_context) {
        return dump_swappable_nl_trie_get_current_map(v_context);
    }

    public static SubLObject dump_swappable_nl_trie_set_final_result(final SubLObject v_context, final SubLObject final_map) {
        final SubLObject map_stack = getf(v_context, $MAP_STACK, UNPROVIDED);
        stacks.stack_push(final_map, map_stack);
        return final_map;
    }

    public static SubLObject nl_trie_lookup(final SubLObject v_nl_trie, final SubLObject key0, SubLObject case_sensitivity) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        SubLObject raw_entries = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                if (v_nl_trie.eql(get_nl_trie())) {
                    final SubLObject _prev_bind_0_$42 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                    try {
                        file_vector_utilities.$current_backed_map_cache_strategy$.bind($nl_trie_cache_strategy$.getGlobalValue(), thread);
                        raw_entries = strie.strie_lookup(v_nl_trie, key);
                    } finally {
                        file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_0_$42, thread);
                    }
                } else {
                    raw_entries = strie.strie_lookup(v_nl_trie, key);
                }
            } finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock($nl_trie_lock$.getGlobalValue());
            }
        }
        if ((NIL != nl_trie_case_sensitive_p(v_nl_trie)) || case_sensitivity.eql($OFF)) {
            return raw_entries;
        }
        if (case_sensitivity.eql($ON)) {
            return nl_trie_filter_entries_for_case(raw_entries, key);
        }
        if (case_sensitivity == $PREFERRED) {
            final SubLObject filtered = nl_trie_filter_entries_for_case(raw_entries, key);
            return NIL != filtered ? filtered : raw_entries;
        }
        nl_trie_error($str302$Invalid_case_sensitivity_setting_, case_sensitivity, v_nl_trie, strie.strie_test(v_nl_trie), UNPROVIDED);
        return NIL;
    }

    public static SubLObject nl_trie_validate_all_entries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = $$$Validating_all_NL_trie_entries;
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
            SubLObject release = NIL;
            try {
                release = seize_lock($nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0_$43 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                final SubLObject _prev_bind_1_$44 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                    file_vector_utilities.$current_backed_map_cache_strategy$.bind($nl_trie_cache_strategy$.getGlobalValue(), thread);
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject iterator = map_utilities.new_map_iterator(get_nl_trie());
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject dict_key = NIL;
                            SubLObject dict_value = NIL;
                            destructuring_bind_must_consp(current, datum, $list256);
                            dict_key = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list256);
                            dict_value = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (NIL != map_utilities.map_p(dict_value)) {
                                    stacks.stack_push(dict_value, stack);
                                } else
                                    if (dict_value.isCons()) {
                                        final SubLObject key = dict_value.first();
                                        SubLObject cdolist_list_var;
                                        final SubLObject entries = cdolist_list_var = dict_value.rest();
                                        SubLObject entry = NIL;
                                        entry = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject validated = validate_nl_trie_entry(entry);
                                            if (NIL == validated) {
                                                nl_trie_delete_entry($nl_trie$.getGlobalValue(), key, entry);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            entry = cdolist_list_var.first();
                                        } 
                                    }

                            } else {
                                cdestructuring_bind_error(datum, $list256);
                            }
                        }
                    }
                    while (NIL == stacks.stack_empty_p(stack)) {
                        final SubLObject entry2 = stacks.stack_pop(stack);
                        final SubLObject iterator2 = map_utilities.new_map_iterator(entry2);
                        SubLObject valid2;
                        for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                            thread.resetMultipleValues();
                            final SubLObject var2 = iteration.iteration_next(iterator2);
                            valid2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid2) {
                                SubLObject current2;
                                final SubLObject datum2 = current2 = var2;
                                SubLObject dict_key2 = NIL;
                                SubLObject dict_value2 = NIL;
                                destructuring_bind_must_consp(current2, datum2, $list256);
                                dict_key2 = current2.first();
                                current2 = current2.rest();
                                destructuring_bind_must_consp(current2, datum2, $list256);
                                dict_value2 = current2.first();
                                current2 = current2.rest();
                                if (NIL == current2) {
                                    if (NIL != map_utilities.map_p(dict_value2)) {
                                        stacks.stack_push(dict_value2, stack);
                                    } else
                                        if (dict_value2.isCons()) {
                                            final SubLObject key2 = dict_value2.first();
                                            SubLObject cdolist_list_var2;
                                            final SubLObject entries2 = cdolist_list_var2 = dict_value2.rest();
                                            SubLObject entry_$45 = NIL;
                                            entry_$45 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject validated2 = validate_nl_trie_entry(entry_$45);
                                                if (NIL == validated2) {
                                                    nl_trie_delete_entry($nl_trie$.getGlobalValue(), key2, entry_$45);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                entry_$45 = cdolist_list_var2.first();
                                            } 
                                        }

                                } else {
                                    cdestructuring_bind_error(datum2, $list256);
                                }
                            }
                        }
                    } 
                } finally {
                    file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_1_$44, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$43, thread);
                }
            } finally {
                if (NIL != release) {
                    release_lock($nl_trie_lock$.getGlobalValue());
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
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return $VALIDATED;
    }

    public static SubLObject nl_trie_remove_invalid_entries(final SubLObject raw_entries, final SubLObject v_nl_trie, final SubLObject key0) {
        if (NIL != lexicon_macros.assume_nl_trie_validP()) {
            return raw_entries;
        }
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        SubLObject bad_entries = NIL;
        SubLObject cdolist_list_var = raw_entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject validP = validate_nl_trie_entry(entry);
            if (NIL == validP) {
                bad_entries = cons(entry, bad_entries);
                nl_trie_warn(TWO_INTEGER, $str305$Removing_bad_NL_trie_entry_for__S, key, entry, raw_entries, UNPROVIDED);
                nl_trie_delete_entry(v_nl_trie, key, entry);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        if (NIL != bad_entries) {
            final SubLObject good_raw_entries = nl_trie_remaining_entries(raw_entries, bad_entries);
            nl_trie_warn(TWO_INTEGER, $str306$Remaining_entries_____S__, good_raw_entries, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return good_raw_entries;
        }
        return raw_entries;
    }

    public static SubLObject nl_trie_remaining_entries(final SubLObject raw_entries, final SubLObject bad_entries) {
        return set_difference(raw_entries, bad_entries, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_filter_entries_for_case(final SubLObject raw_entries, final SubLObject key0) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        SubLObject good_entries = NIL;
        SubLObject cdolist_list_var = raw_entries;
        SubLObject raw_entry = NIL;
        raw_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(raw_entry, $nl_trie_entry_filter_stack$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                good_entries = cons(raw_entry, good_entries);
            } else {
                final SubLObject _prev_bind_0 = $nl_trie_entry_filter_stack$.currentBinding(thread);
                try {
                    $nl_trie_entry_filter_stack$.bind(cons(raw_entry, $nl_trie_entry_filter_stack$.getDynamicValue(thread)), thread);
                    if (NIL != nl_trie_entry_case_matches_keyP(raw_entry, key)) {
                        good_entries = cons(raw_entry, good_entries);
                    }
                } finally {
                    $nl_trie_entry_filter_stack$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_entry = cdolist_list_var.first();
        } 
        return good_entries;
    }

    public static SubLObject nl_trie_entry_case_matches_keyP(final SubLObject entry, final SubLObject key0) {
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        SubLObject matchP = NIL;
        final SubLObject consider_adding_theP = equalp(key.first(), $english_definite_determiner$.getGlobalValue());
        if (NIL == matchP) {
            SubLObject csome_list_var;
            SubLObject entry_key;
            for (csome_list_var = nl_trie_entry_keys(entry, consider_adding_theP), entry_key = NIL, entry_key = csome_list_var.first(); (NIL == matchP) && (NIL != csome_list_var); matchP = equal(entry_key, key) , csome_list_var = csome_list_var.rest() , entry_key = csome_list_var.first()) {
            }
        }
        return matchP;
    }

    public static SubLObject clear_nl_trie_caches() {
        clear_nl_trie_preds_of_pos();
        clear_nl_trie_multi_word_abbreviation_preds();
        clear_nl_trie_preds_licensed_by_pos();
        clear_nl_trie_name_string_preds();
        clear_nl_trie_pos_of_pred();
        clear_nl_trie_spec_predicates();
        clear_nl_trie_pred_ok_for_posP();
        clear_nl_trie_pos_for_semtrans_pred();
        clear_nl_trie_closed_class_pos_preds();
        return T;
    }

    public static SubLObject initialize_nl_trie_control_vars() {
        initialize_nl_trie_syntactic_predicates();
        initialize_nl_trie_denotation_predicates();
        initialize_nl_trie_other_predicates();
        initialize_nl_trie_pragmatic_predicates();
        return T;
    }

    public static SubLObject initialize_nl_trie_syntactic_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject raw_preds = cons($$partOfSpeech, lexicon_accessors.all_speech_part_preds($nl_trie_lexical_mt$.getGlobalValue()));
            final SubLObject filtered_preds = list_utilities.remove_if_not($sym307$NL_TRIE_SYNTACTIC_PRED_, raw_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            $nl_trie_syntactic_predicates$.setGlobalValue(filtered_preds);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static SubLObject initialize_nl_trie_denotation_predicates() {
        $nl_trie_denotation_predicates$.setGlobalValue($list308);
        return T;
    }

    public static SubLObject initialize_nl_trie_other_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            $nl_trie_abbreviation_predicates$.setGlobalValue(cons($$abbreviationForLexicalWord, nl_trie_multi_word_abbreviation_preds()));
            $nl_trie_arg_in_reln_predicates$.setGlobalValue(isa.all_fort_instances($$DenotesArgInRelnPredicate, UNPROVIDED, UNPROVIDED));
            $nl_trie_semtrans_predicates$.setGlobalValue(isa.all_fort_instances($$SemTransPred, UNPROVIDED, UNPROVIDED));
            $nl_trie_semtrans_predicates$.setGlobalValue(list_utilities.delete_if_not($sym311$NL_TRIE_SEMTRANS_PRED_HAS_POS_SPECIFICATION_, $nl_trie_semtrans_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $nl_trie_arg_in_reln_predicates$.getGlobalValue();
    }

    public static SubLObject nl_trie_semtrans_pred_has_pos_specificationP(final SubLObject pred) {
        return makeBoolean((NIL != nl_trie_pos_for_semtrans_pred(pred, UNPROVIDED)) || (NIL != lexicon_utilities.pos_arg_of_pred_cached(pred)));
    }

    public static SubLObject nl_trie_abbreviation_pred_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, nl_trie_abbreviation_predicates(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_multi_word_abbreviation_pred_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, nl_trie_multi_word_abbreviation_preds(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_nl_trie_multi_word_abbreviation_preds() {
        final SubLObject cs = $nl_trie_multi_word_abbreviation_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_nl_trie_multi_word_abbreviation_preds() {
        return memoization_state.caching_state_remove_function_results_with_args($nl_trie_multi_word_abbreviation_preds_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_multi_word_abbreviation_preds_internal() {
        return isa.all_fort_instances_in_all_mts($$MultiWordForStringPred);
    }

    public static SubLObject nl_trie_multi_word_abbreviation_preds() {
        SubLObject caching_state = $nl_trie_multi_word_abbreviation_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NL_TRIE_MULTI_WORD_ABBREVIATION_PREDS, $nl_trie_multi_word_abbreviation_preds_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(nl_trie_multi_word_abbreviation_preds_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject initialize_nl_trie_pragmatic_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            $nl_trie_pragmatic_predicates$.setGlobalValue(isa.all_fort_instances($$NLPragmaticPredicate_New, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static SubLObject nl_trie_syntactic_assertionP(final SubLObject assertion) {
        if (NIL != ok_assertion_for_nl_trieP(assertion)) {
            final SubLObject assertion_pred = assertions_high.gaf_arg0(assertion);
            return makeBoolean(((NIL != subl_promotions.memberP(assertion_pred, nl_trie_syntactic_predicates(), UNPROVIDED, UNPROVIDED)) || (NIL != member(assertion_pred, nl_trie_arg_in_reln_predicates(), UNPROVIDED, UNPROVIDED))) || (NIL != nl_trie_abbreviation_pred_p(assertion_pred)));
        }
        return NIL;
    }

    public static SubLObject nl_trie_semantic_assertionP(final SubLObject assertion) {
        if (NIL != ok_assertion_for_nl_trieP(assertion)) {
            final SubLObject assertion_pred = assertions_high.gaf_arg0(assertion);
            return makeBoolean((((assertion_pred.eql($$termPhrases) || (NIL != subl_promotions.memberP(assertion_pred, nl_trie_denotation_predicates(), UNPROVIDED, UNPROVIDED))) || (NIL != member(assertion_pred, nl_trie_semtrans_predicates(), UNPROVIDED, UNPROVIDED))) || ((NIL != nl_trie_name_string_predP(assertion_pred)) && (NIL != cycl_string.cycl_string_p(assertions_high.gaf_arg2(assertion))))) || (NIL != member(assertion_pred, nl_trie_arg_in_reln_predicates(), UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject initialize_nl_trie_int(SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        format(T, $str316$__Initializing_NL_Trie_____);
        force_output(UNPROVIDED);
        format(T, $str317$__Triefying_the_syntactic_predica);
        nl_triefy_preds($SYNTACTIC, v_nl_trie);
        format(T, $str319$__Triefying_the_semantic_predicat);
        nl_triefy_preds($SEMANTIC, v_nl_trie);
        return T;
    }

    public static SubLObject nl_triefy_preds(final SubLObject init_type, SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds_to_use = list_utilities.remove_if_not($sym321$VALID_CONSTANT_, init_type == $SYNTACTIC ? append(nl_trie_syntactic_predicates(), nl_trie_abbreviation_predicates()) : cons($$termPhrases, nl_trie_name_string_preds()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject total_preds = length(preds_to_use);
        SubLObject count_preds_done = ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = preds_to_use;
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject progress_note = format(NIL, $str322$____D__D__Triefying__S_assertions, new SubLObject[]{ number_utilities.f_1X(count_preds_done), total_preds, pred });
                    nl_triefy_pred(pred, NIL, init_type, v_nl_trie, progress_note);
                    count_preds_done = add(count_preds_done, ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static SubLObject triefy_mt(final SubLObject mt, SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        triefy_mt_int(mt, isa.all_fort_instances($$NLSyntacticPredicate, UNPROVIDED, UNPROVIDED), v_nl_trie);
        triefy_mt_int(mt, isa.all_fort_instances($$NLSemanticPredicate, UNPROVIDED, UNPROVIDED), v_nl_trie);
        return T;
    }

    public static SubLObject triefy_mt_int(final SubLObject mt, SubLObject preds_to_use, SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        preds_to_use = list_utilities.remove_if_not($sym321$VALID_CONSTANT_, preds_to_use, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject total_preds = length(preds_to_use);
        SubLObject count_preds_done = ZERO_INTEGER;
        final SubLObject progress_message = format(NIL, $str325$Triefying__S, mt);
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
                noting_percent_progress_preamble(progress_message);
                SubLObject cdolist_list_var = preds_to_use;
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject init_type = (NIL != find(pred, nl_trie_syntactic_predicates(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? $SYNTACTIC : $SEMANTIC;
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0_$47 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$48 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$49 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject pred_var = pred;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str = NIL;
                            final SubLObject _prev_bind_0_$48 = $progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$49 = $progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$50 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$53 = $progress_notification_count$.currentBinding(thread);
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
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$54 = NIL;
                                            final SubLObject token_var_$55 = NIL;
                                            while (NIL == done_var_$54) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                                final SubLObject valid_$56 = makeBoolean(!token_var_$55.eql(assertion));
                                                if (NIL != valid_$56) {
                                                    final SubLObject pcase_var = init_type;
                                                    if (pcase_var.eql($SYNTACTIC)) {
                                                        update_nl_trie_syntactic(assertion, v_nl_trie, UNPROVIDED);
                                                    } else
                                                        if (pcase_var.eql($SEMANTIC)) {
                                                            update_nl_trie_semantic(assertion, v_nl_trie, UNPROVIDED, UNPROVIDED);
                                                        }

                                                }
                                                done_var_$54 = makeBoolean(NIL == valid_$56);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
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
                                $progress_notification_count$.rebind(_prev_bind_3_$53, thread);
                                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$50, thread);
                                $progress_last_pacification_time$.rebind(_prev_bind_1_$49, thread);
                                $progress_start_time$.rebind(_prev_bind_0_$48, thread);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$49, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$48, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$47, thread);
                    }
                    count_preds_done = add(count_preds_done, ONE_INTEGER);
                    note_percent_progress(count_preds_done, total_preds);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static SubLObject nl_triefy_pred(final SubLObject pred, SubLObject clear_firstP, SubLObject init_type, SubLObject v_nl_trie, SubLObject progress_note) {
        if (clear_firstP == UNPROVIDED) {
            clear_firstP = T;
        }
        if (init_type == UNPROVIDED) {
            init_type = NIL;
        }
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        if (progress_note == UNPROVIDED) {
            progress_note = format(NIL, $str328$Triefying__S_assertions___, pred);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != clear_firstP) {
            nl_trie_clear_pred(pred);
        }
        if (NIL == init_type) {
            init_type = (NIL != find(pred, nl_trie_syntactic_predicates(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? $SYNTACTIC : $SEMANTIC;
        }
        SubLObject total = ZERO_INTEGER;
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject threshold = $int$1000;
        final SubLObject desired_result = nl_trie_return_keyword(NIL, T);
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            total = kb_indexing.relevant_num_predicate_extent_index(pred);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(progress_note);
                final SubLObject _prev_bind_0_$59 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$60 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$60 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$61 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$63 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$64 = $progress_notification_count$.currentBinding(thread);
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
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$65 = NIL;
                                        final SubLObject token_var_$66 = NIL;
                                        while (NIL == done_var_$65) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                            final SubLObject valid_$67 = makeBoolean(!token_var_$66.eql(assertion));
                                            if (NIL != valid_$67) {
                                                final SubLObject pcase_var = init_type;
                                                if (pcase_var.eql($SYNTACTIC)) {
                                                    if (NIL != nl_trie_syntactic_assertionP(assertion)) {
                                                        final SubLObject result = update_nl_trie_syntactic(assertion, v_nl_trie, UNPROVIDED);
                                                        if (!result.eql(desired_result)) {
                                                            Errors.warn($str329$Got_failure_result__S_when_triefy, result, assertion);
                                                        }
                                                    }
                                                } else
                                                    if (pcase_var.eql($SEMANTIC) && (NIL != nl_trie_semantic_assertionP(assertion))) {
                                                        final SubLObject result = update_nl_trie_semantic(assertion, v_nl_trie, UNPROVIDED, UNPROVIDED);
                                                        if (!result.eql(desired_result)) {
                                                            Errors.warn($str329$Got_failure_result__S_when_triefy, result, assertion);
                                                        }
                                                    }

                                                sofar = add(sofar, ONE_INTEGER);
                                                if (total.numGE(threshold)) {
                                                    note_percent_progress(sofar, total);
                                                }
                                            }
                                            done_var_$65 = makeBoolean(NIL == valid_$67);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
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
                            $progress_notification_count$.rebind(_prev_bind_3_$64, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$63, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$61, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$60, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$60, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$59, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static SubLObject nl_trie_clear_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                file_vector_utilities.$current_backed_map_cache_strategy$.bind($nl_trie_cache_strategy$.getGlobalValue(), thread);
                final SubLObject stack = stacks.create_stack();
                final SubLObject iterator = map_utilities.new_map_iterator($nl_trie$.getGlobalValue());
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject dict_key = NIL;
                        SubLObject dict_value = NIL;
                        destructuring_bind_must_consp(current, datum, $list256);
                        dict_key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list256);
                        dict_value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL != map_utilities.map_p(dict_value)) {
                                stacks.stack_push(dict_value, stack);
                            } else
                                if (dict_value.isCons()) {
                                    final SubLObject key = dict_value.first();
                                    final SubLObject entries = dict_value.rest();
                                    thread.resetMultipleValues();
                                    final SubLObject new_entries = nl_trie_remove_entries_wXpred(entries, pred);
                                    final SubLObject changedP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != changedP) {
                                        if (NIL != new_entries) {
                                            strie.strie_replace($nl_trie$.getGlobalValue(), key, new_entries);
                                        } else {
                                            strie.strie_remove($nl_trie$.getGlobalValue(), key);
                                        }
                                    }
                                }

                        } else {
                            cdestructuring_bind_error(datum, $list256);
                        }
                    }
                }
                while (NIL == stacks.stack_empty_p(stack)) {
                    final SubLObject entry = stacks.stack_pop(stack);
                    final SubLObject iterator2 = map_utilities.new_map_iterator(entry);
                    SubLObject valid2;
                    for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                        thread.resetMultipleValues();
                        final SubLObject var2 = iteration.iteration_next(iterator2);
                        valid2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid2) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = var2;
                            SubLObject dict_key2 = NIL;
                            SubLObject dict_value2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list256);
                            dict_key2 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list256);
                            dict_value2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                if (NIL != map_utilities.map_p(dict_value2)) {
                                    stacks.stack_push(dict_value2, stack);
                                } else
                                    if (dict_value2.isCons()) {
                                        final SubLObject key2 = dict_value2.first();
                                        final SubLObject entries2 = dict_value2.rest();
                                        thread.resetMultipleValues();
                                        final SubLObject new_entries2 = nl_trie_remove_entries_wXpred(entries2, pred);
                                        final SubLObject changedP2 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != changedP2) {
                                            if (NIL != new_entries2) {
                                                strie.strie_replace($nl_trie$.getGlobalValue(), key2, new_entries2);
                                            } else {
                                                strie.strie_remove($nl_trie$.getGlobalValue(), key2);
                                            }
                                        }
                                    }

                            } else {
                                cdestructuring_bind_error(datum2, $list256);
                            }
                        }
                    }
                } 
            } finally {
                file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock($nl_trie_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject nl_trie_remove_entries_wXpred(final SubLObject entries, final SubLObject pred) {
        SubLObject ans = NIL;
        SubLObject changedP = NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == nl_trie_entry_p(entry)) {
                changedP = T;
            } else
                if (nl_trie_entry_semantic_pred(entry, UNPROVIDED).eql(pred)) {
                    changedP = T;
                } else {
                    ans = cons(entry, ans);
                }

            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return values(ans, changedP);
    }

    public static SubLObject ok_assertion_for_nl_trieP(final SubLObject assertion) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != hlmt.hlmt_p(assertions_high.assertion_mt(assertion))));
    }

    public static SubLObject nl_trie_return_keyword(final SubLObject removeP, SubLObject successP) {
        if (successP == UNPROVIDED) {
            successP = T;
        }
        if (NIL != removeP) {
            return NIL != successP ? $REMOVED : $NOT_REMOVED;
        }
        return NIL != successP ? $ADDED : $NOT_ADDED;
    }

    public static SubLObject update_nl_trie_syntactic(final SubLObject assertion, SubLObject v_nl_trie, SubLObject removeP) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == nl_trie_ok_trie_and_assertionP(v_nl_trie, assertion)) {
            return nl_trie_return_keyword(removeP, NIL);
        }
        final SubLObject pred = assertions_high.gaf_arg0(assertion);
        final SubLObject desired_result = nl_trie_return_keyword(removeP, T);
        SubLObject error_message = NIL;
        SubLObject result = NIL;
        if (NIL != $catch_nl_trie_errorsP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        SubLObject release = NIL;
                        try {
                            release = seize_lock($nl_trie_lock$.getGlobalValue());
                            final SubLObject _prev_bind_0_$70 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                            try {
                                file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                                if (pred.eql($$partOfSpeech)) {
                                    result = nl_triefy_pos_assertion(assertion, v_nl_trie, removeP);
                                } else
                                    if (NIL != nl_trie_abbreviation_pred_p(pred)) {
                                        final SubLObject pcase_var = pred;
                                        if (pcase_var.eql($$abbreviationForLexicalWord)) {
                                            result = nl_triefy_abbr_lex_word_assertion(assertion, v_nl_trie, removeP);
                                        } else
                                            if (pcase_var.eql($$abbreviationForMultiWordString)) {
                                                result = nl_triefy_abbr_mws_assertion(assertion, v_nl_trie, removeP);
                                            } else
                                                if (pcase_var.eql($$abbreviationForCompoundString)) {
                                                    result = nl_triefy_abbr_cps_assertion(assertion, v_nl_trie, removeP);
                                                }


                                    } else {
                                        result = nl_triefy_spp_assertion(assertion, v_nl_trie, removeP);
                                    }

                            } finally {
                                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$70, thread);
                            }
                        } finally {
                            if (NIL != release) {
                                release_lock($nl_trie_lock$.getGlobalValue());
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            SubLObject release2 = NIL;
            try {
                release2 = seize_lock($nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_2 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                    if (pred.eql($$partOfSpeech)) {
                        result = nl_triefy_pos_assertion(assertion, v_nl_trie, removeP);
                    } else
                        if (NIL != nl_trie_abbreviation_pred_p(pred)) {
                            final SubLObject pcase_var2 = pred;
                            if (pcase_var2.eql($$abbreviationForLexicalWord)) {
                                result = nl_triefy_abbr_lex_word_assertion(assertion, v_nl_trie, removeP);
                            } else
                                if (pcase_var2.eql($$abbreviationForMultiWordString)) {
                                    result = nl_triefy_abbr_mws_assertion(assertion, v_nl_trie, removeP);
                                } else
                                    if (pcase_var2.eql($$abbreviationForCompoundString)) {
                                        result = nl_triefy_abbr_cps_assertion(assertion, v_nl_trie, removeP);
                                    }


                        } else {
                            result = nl_triefy_spp_assertion(assertion, v_nl_trie, removeP);
                        }

                } finally {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_2, thread);
                }
            } finally {
                if (NIL != release2) {
                    release_lock($nl_trie_lock$.getGlobalValue());
                }
            }
        }
        if (error_message.isString()) {
            nl_trie_warn(ONE_INTEGER, $str333$Caught_error_in_UPDATE_NL_TRIE_SY, assertion, error_message, UNPROVIDED, UNPROVIDED);
        }
        return nl_trie_return_keyword(removeP, eql(result, desired_result));
    }

    public static SubLObject nl_trie_ok_trie_and_assertionP(final SubLObject v_nl_trie, final SubLObject assertion) {
        if (NIL == nl_trie_presentP(v_nl_trie)) {
            nl_trie_warn(TWO_INTEGER, $str334$Trie_not_present___S, v_nl_trie, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (NIL == ok_assertion_for_nl_trieP(assertion)) {
            nl_trie_warn(TWO_INTEGER, $str335$Assertion_fails_OK_ASSERTION_FOR_, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        return T;
    }

    public static SubLObject nl_triefy_spp_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(assertions_high.gaf_arg2(assertion));
        final SubLObject wu = assertions_high.gaf_arg1(assertion);
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        final SubLObject spp_pred = assertions_high.gaf_arg0(assertion);
        final SubLObject syntactic_info = find_morphologically_derivable_strings(wu, string, spp_pred, assertion_mt);
        final SubLObject mod_list = find_mod_list(syntactic_info, assertion_mt);
        SubLObject cdolist_list_var = nl_trie_string_tokenize_multiple(string);
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject entry = new_nl_trie_word_for_syntactic_support(assertion);
            add_or_remove_nl_trie_word(v_nl_trie, key, entry, removeP);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        cdolist_list_var = mod_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = item;
            SubLObject mod_str_list = NIL;
            SubLObject constraint = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list336);
            mod_str_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list336);
            constraint = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list336);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pred = (NIL != fort_types_interface.predicate_p(constraint)) ? constraint : $$partOfSpeech;
                SubLObject cdolist_list_var_$71 = mod_str_list;
                SubLObject mod_string = NIL;
                mod_string = cdolist_list_var_$71.first();
                while (NIL != cdolist_list_var_$71) {
                    SubLObject cdolist_list_var_$72 = nl_trie_string_tokenize_multiple(mod_string);
                    SubLObject key2 = NIL;
                    key2 = cdolist_list_var_$72.first();
                    while (NIL != cdolist_list_var_$72) {
                        final SubLObject sentence = make_binary_formula(pred, wu, mod_string);
                        final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, mt, mod_string);
                        final SubLObject entry2 = new_nl_trie_word_for_syntactic_support(syntactic_support);
                        add_or_remove_nl_trie_word(v_nl_trie, key2, entry2, removeP);
                        cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                        key2 = cdolist_list_var_$72.first();
                    } 
                    cdolist_list_var_$71 = cdolist_list_var_$71.rest();
                    mod_string = cdolist_list_var_$71.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list336);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        update_nl_trie_semantic_on_wu(wu, v_nl_trie, assertion_mt, removeP, cons(list(list(string), spp_pred, assertion_mt), mod_list));
        if (NIL != unique_irregular_form_assertionP(assertion)) {
            nl_trie_clean_up_regular_forms(assertion, v_nl_trie, removeP);
        }
        return nl_trie_return_keyword(removeP, UNPROVIDED);
    }

    public static SubLObject unique_irregular_form_assertionP(final SubLObject assertion) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_formula(assertion);
        SubLObject spp_pred = NIL;
        SubLObject word = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list337);
        spp_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list337);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list337);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            return makeBoolean((NIL != lexicon_accessors.derived_predP(spp_pred, assertion_mt)) && (NIL == remove(string, nl_trie_get_irregular_forms(word, spp_pred, assertion_mt), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        cdestructuring_bind_error(datum, $list337);
        return NIL;
    }

    public static SubLObject nl_trie_get_irregular_forms(final SubLObject wu, final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forms = NIL;
        SubLObject cdolist_list_var = nl_trie_spec_predicates(pred, mt);
        SubLObject spec_pred = NIL;
        spec_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var_$73 = kb_mapping_utilities.pred_values(wu, spec_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject form = NIL;
                form = cdolist_list_var_$73.first();
                while (NIL != cdolist_list_var_$73) {
                    forms = cons(form, forms);
                    cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                    form = cdolist_list_var_$73.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_pred = cdolist_list_var.first();
        } 
        return delete_duplicates(forms, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_nl_trie_spec_predicates() {
        final SubLObject cs = $nl_trie_spec_predicates_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_nl_trie_spec_predicates(final SubLObject pred, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($nl_trie_spec_predicates_caching_state$.getGlobalValue(), list(pred, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_spec_predicates_internal(final SubLObject pred, final SubLObject mt) {
        return genl_predicates.all_spec_predicates(pred, mt, UNPROVIDED);
    }

    public static SubLObject nl_trie_spec_predicates(final SubLObject pred, final SubLObject mt) {
        SubLObject caching_state = $nl_trie_spec_predicates_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NL_TRIE_SPEC_PREDICATES, $nl_trie_spec_predicates_caching_state$, $int$256, EQL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback(CLEAR_NL_TRIE_SPEC_PREDICATES);
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
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(nl_trie_spec_predicates_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject nl_trie_clean_up_regular_forms(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_formula(assertion);
        SubLObject sp_pred = NIL;
        SubLObject word = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list342);
        sp_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list342);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list342);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            SubLObject cleaned_up_forms = NIL;
            if ((NIL != lexicon_accessors.speech_part_predP(sp_pred, UNPROVIDED)) && (NIL != lexicon_accessors.lexical_wordP(word))) {
                SubLObject cdolist_list_var = lexicon_cache.generate_regular_strings(word, sp_pred, assertion_mt);
                SubLObject regular_form = NIL;
                regular_form = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (!regular_form.equal(string)) {
                        if (NIL != removeP) {
                            if (NIL == lexicon_accessors.string_is_pred_on_wuP(regular_form, word, sp_pred, assertion_mt, UNPROVIDED)) {
                                nl_trie_clean_up_one_regular_form(regular_form, assertion, v_nl_trie, removeP);
                                cleaned_up_forms = cons(regular_form, cleaned_up_forms);
                            }
                        } else
                            if (NIL == nl_trie_asserted_word_formP(sp_pred, word, regular_form, assertion_mt)) {
                                nl_trie_clean_up_one_regular_form(regular_form, assertion, v_nl_trie, removeP);
                                cleaned_up_forms = cons(regular_form, cleaned_up_forms);
                            }

                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    regular_form = cdolist_list_var.first();
                } 
            }
            return cleaned_up_forms;
        }
        cdestructuring_bind_error(datum, $list342);
        return NIL;
    }

    public static SubLObject nl_trie_asserted_word_formP(final SubLObject sp_pred, final SubLObject word, final SubLObject word_form, final SubLObject query_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertedP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(query_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject asserted_string = NIL;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, NIL, sp_pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, NIL, sp_pred);
                SubLObject done_var = assertedP;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$74 = assertedP;
                            final SubLObject token_var_$75 = NIL;
                            while (NIL == done_var_$74) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$75);
                                final SubLObject valid_$76 = makeBoolean(!token_var_$75.eql(assertion));
                                if (NIL != valid_$76) {
                                    asserted_string = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                    if (asserted_string.equal(word_form)) {
                                        assertedP = T;
                                    }
                                }
                                done_var_$74 = makeBoolean((NIL == valid_$76) || (NIL != assertedP));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != assertedP));
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return assertedP;
    }

    public static SubLObject nl_trie_clean_up_one_regular_form(final SubLObject regular_form, final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_formula(assertion);
        SubLObject spp_pred = NIL;
        SubLObject wu = NIL;
        SubLObject irregular_string = NIL;
        destructuring_bind_must_consp(current, datum, $list343);
        spp_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list343);
        wu = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list343);
        irregular_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject remove_this_oneP = makeBoolean(NIL == removeP);
            final SubLObject regular_sentence = make_binary_formula(spp_pred, wu, regular_form);
            final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(regular_sentence, assertion_mt, regular_form);
            final SubLObject nl_trie_word = new_nl_trie_word_for_syntactic_support(syntactic_support);
            SubLObject cdolist_list_var = nl_trie_string_tokenize_multiple(regular_form);
            SubLObject key = NIL;
            key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, remove_this_oneP);
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            } 
            if (NIL == remove_this_oneP) {
                final SubLObject new_mod_list = find_mod_list(list(list(list(regular_form), spp_pred)), assertion_mt);
                update_nl_trie_semantic_on_wu(wu, v_nl_trie, assertion_mt, remove_this_oneP, new_mod_list);
            }
        } else {
            cdestructuring_bind_error(datum, $list343);
        }
        return NIL;
    }

    public static SubLObject find_mod_list(final SubLObject str_pred_list, final SubLObject assertion_mt) {
        SubLObject mod_list = NIL;
        SubLObject cdolist_list_var = str_pred_list;
        SubLObject str_pred_pair = NIL;
        str_pred_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = str_pred_pair;
            SubLObject mod_str_list = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list344);
            mod_str_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list344);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                mod_list = cons(list(mod_str_list, pred, assertion_mt), mod_list);
            } else {
                cdestructuring_bind_error(datum, $list344);
            }
            cdolist_list_var = cdolist_list_var.rest();
            str_pred_pair = cdolist_list_var.first();
        } 
        return mod_list;
    }

    public static SubLObject nl_triefy_pos_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args(assertion);
        SubLObject word = NIL;
        SubLObject pos = NIL;
        SubLObject v_cycl_string = NIL;
        destructuring_bind_must_consp(current, datum, $list345);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list345);
        pos = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list345);
        v_cycl_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject mod_list = list(list(list(string), pos, assertion_mt));
            final SubLObject nl_trie_word = new_nl_trie_word_for_syntactic_support(assertion);
            SubLObject cdolist_list_var = nl_trie_string_tokenize_multiple(string);
            SubLObject key = NIL;
            key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            } 
            update_nl_trie_semantic_on_wu(word, v_nl_trie, assertion_mt, removeP, mod_list);
        } else {
            cdestructuring_bind_error(datum, $list345);
        }
        return nl_trie_return_keyword(removeP, UNPROVIDED);
    }

    public static SubLObject update_nl_trie_semantic_on_wu(final SubLObject wu, final SubLObject v_nl_trie, final SubLObject syntactic_mt, final SubLObject removeP, SubLObject mod_list) {
        if (mod_list == UNPROVIDED) {
            mod_list = NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject semantic_preds_to_use = cdolist_list_var = remove_duplicates(append(nl_trie_arg_in_reln_predicates(), nl_trie_denotation_predicates(), nl_trie_semtrans_predicates()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            update_nl_trie_semantic_on_wu_for_pred(wu, v_nl_trie, syntactic_mt, removeP, mod_list, pred);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return nl_trie_return_keyword(removeP, UNPROVIDED);
    }

    public static SubLObject update_nl_trie_semantic_on_wu_for_pred(final SubLObject wu, final SubLObject v_nl_trie, final SubLObject syntactic_mt, final SubLObject removeP, SubLObject mod_list, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word_index = lexicon_utilities.wu_arg_of_pred_cached(pred);
        final SubLObject pos_index = lexicon_utilities.pos_arg_of_pred_cached(pred);
        final SubLObject pos = nl_trie_pos_for_semtrans_pred(pred, UNPROVIDED);
        if (NIL != lexicon_accessors.speech_partP(pos, UNPROVIDED)) {
            mod_list = filter_mod_list_for_pos(mod_list, pos);
        }
        if (NIL != mod_list) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, word_index, pred)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, word_index, pred);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$78 = NIL;
                                final SubLObject token_var_$79 = NIL;
                                while (NIL == done_var_$78) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$79);
                                    final SubLObject valid_$80 = makeBoolean(!token_var_$79.eql(assertion));
                                    if (NIL != valid_$80) {
                                        update_nl_trie_semantic_assertion(assertion, syntactic_mt, pos_index, mod_list, v_nl_trie, removeP);
                                    }
                                    done_var_$78 = makeBoolean(NIL == valid_$80);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
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
        }
        return pred;
    }

    public static SubLObject update_nl_trie_semantic_assertion(final SubLObject assertion, final SubLObject syntactic_mt, final SubLObject pos_index, final SubLObject mod_list, final SubLObject v_nl_trie, final SubLObject removeP) {
        if ((NIL != ok_assertion_for_nl_trieP(assertion)) && ((NIL != lexicon_accessors.genl_lexicon_mtP(assertions_high.assertion_mt(assertion), syntactic_mt)) || (NIL != lexicon_accessors.genl_lexicon_mtP(syntactic_mt, assertions_high.assertion_mt(assertion))))) {
            if (NIL != pos_index) {
                final SubLObject this_pos = assertions_high.gaf_arg(assertion, pos_index);
                final SubLObject new_mod_list = filter_mod_list_for_pos(mod_list, this_pos);
                if (NIL != new_mod_list) {
                    update_nl_trie_semantic(assertion, v_nl_trie, removeP, new_mod_list);
                }
            } else {
                update_nl_trie_semantic(assertion, v_nl_trie, removeP, mod_list);
            }
        }
        return assertion;
    }

    public static SubLObject clear_nl_trie_pos_for_semtrans_pred() {
        final SubLObject cs = $nl_trie_pos_for_semtrans_pred_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_nl_trie_pos_for_semtrans_pred(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $nl_trie_lexical_mt$.getGlobalValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($nl_trie_pos_for_semtrans_pred_caching_state$.getGlobalValue(), list(pred, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_pos_for_semtrans_pred_internal(final SubLObject pred, final SubLObject mt) {
        return lexicon_accessors.semtrans_pred_to_pos(pred, mt);
    }

    public static SubLObject nl_trie_pos_for_semtrans_pred(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $nl_trie_lexical_mt$.getGlobalValue();
        }
        SubLObject caching_state = $nl_trie_pos_for_semtrans_pred_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NL_TRIE_POS_FOR_SEMTRANS_PRED, $nl_trie_pos_for_semtrans_pred_caching_state$, $int$128, EQL, TWO_INTEGER, ZERO_INTEGER);
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
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(nl_trie_pos_for_semtrans_pred_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject filter_mod_list_for_pos(final SubLObject mod_list, final SubLObject pos) {
        SubLObject new_mod_list = NIL;
        SubLObject cdolist_list_var = mod_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject constraint = second(item);
            SubLObject okP = NIL;
            if (NIL != fort_types_interface.collection_p(constraint)) {
                okP = makeBoolean((NIL != lexicon_accessors.genl_posP(constraint, pos, UNPROVIDED)) || (NIL != lexicon_accessors.genl_posP(pos, constraint, UNPROVIDED)));
            } else
                if (NIL != fort_types_interface.predicate_p(constraint)) {
                    okP = nl_trie_pred_ok_for_posP(constraint, pos);
                }

            if (NIL != okP) {
                new_mod_list = cons(item, new_mod_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return new_mod_list;
    }

    public static SubLObject clear_nl_trie_pred_ok_for_posP() {
        final SubLObject cs = $nl_trie_pred_ok_for_posP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_nl_trie_pred_ok_for_posP(final SubLObject pred, final SubLObject pos) {
        return memoization_state.caching_state_remove_function_results_with_args($nl_trie_pred_ok_for_posP_caching_state$.getGlobalValue(), list(pred, pos), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_pred_ok_for_posP_internal(final SubLObject pred, final SubLObject pos) {
        return makeBoolean((pred.eql($$partOfSpeech) || (NIL != member(pos, nl_trie_pos_of_pred(pred), $sym350$GENL_POS_, UNPROVIDED))) || (NIL != member(pred, nl_trie_preds_licensed_by_pos(pos), $sym351$GENL_POS_PRED_, UNPROVIDED)));
    }

    public static SubLObject nl_trie_pred_ok_for_posP(final SubLObject pred, final SubLObject pos) {
        SubLObject caching_state = $nl_trie_pred_ok_for_posP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym349$NL_TRIE_PRED_OK_FOR_POS_, $sym352$_NL_TRIE_PRED_OK_FOR_POS__CACHING_STATE_, $int$1024, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, pos);
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
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && pos.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(nl_trie_pred_ok_for_posP_internal(pred, pos)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, pos));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_nl_trie_preds_licensed_by_pos() {
        final SubLObject cs = $nl_trie_preds_licensed_by_pos_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_nl_trie_preds_licensed_by_pos(final SubLObject pos) {
        return memoization_state.caching_state_remove_function_results_with_args($nl_trie_preds_licensed_by_pos_caching_state$.getGlobalValue(), list(pos), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_preds_licensed_by_pos_internal(final SubLObject pos) {
        return intersection(nl_trie_preds_of_pos(pos), lexicon_utilities.preds_licensed_by_pos(pos), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_preds_licensed_by_pos(final SubLObject pos) {
        SubLObject caching_state = $nl_trie_preds_licensed_by_pos_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NL_TRIE_PREDS_LICENSED_BY_POS, $nl_trie_preds_licensed_by_pos_caching_state$, $int$256, EQL, ONE_INTEGER, $int$32);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pos, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(nl_trie_preds_licensed_by_pos_internal(pos)));
            memoization_state.caching_state_put(caching_state, pos, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject update_nl_trie_semantic(final SubLObject assertion, SubLObject v_nl_trie, SubLObject removeP, SubLObject mod_list) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        if (mod_list == UNPROVIDED) {
            mod_list = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == nl_trie_ok_trie_and_assertionP(v_nl_trie, assertion)) {
            return nl_trie_return_keyword(removeP, NIL);
        }
        final SubLObject pred = assertions_high.gaf_arg0(assertion);
        final SubLObject desired_result = nl_trie_return_keyword(removeP, T);
        SubLObject result = NIL;
        SubLObject strings = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                if (pred.eql($$termPhrases)) {
                    thread.resetMultipleValues();
                    final SubLObject result_$82 = nl_triefy_term_phrases_assertion(assertion, v_nl_trie, removeP);
                    final SubLObject strings_$83 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$82;
                    strings = strings_$83;
                } else
                    if (NIL != member(pred, nl_trie_denotation_predicates(), UNPROVIDED, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject result_$83 = nl_triefy_semantic_assertion(assertion, v_nl_trie, removeP, mod_list);
                        final SubLObject strings_$84 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        result = result_$83;
                        strings = strings_$84;
                    } else
                        if (NIL != member(pred, nl_trie_semtrans_predicates(), UNPROVIDED, UNPROVIDED)) {
                            thread.resetMultipleValues();
                            final SubLObject result_$84 = nl_triefy_semantic_assertion(assertion, v_nl_trie, removeP, mod_list);
                            final SubLObject strings_$85 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            result = result_$84;
                            strings = strings_$85;
                        } else
                            if (NIL != nl_trie_name_string_predP(pred)) {
                                thread.resetMultipleValues();
                                final SubLObject result_$85 = nl_triefy_name_string(assertion, v_nl_trie, removeP);
                                final SubLObject strings_$86 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                result = result_$85;
                                strings = strings_$86;
                            } else
                                if (NIL != member(pred, nl_trie_arg_in_reln_predicates(), UNPROVIDED, UNPROVIDED)) {
                                    thread.resetMultipleValues();
                                    final SubLObject result_$86 = nl_triefy_arg_in_reln_assertion(assertion, v_nl_trie, removeP, mod_list);
                                    final SubLObject strings_$87 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    result = result_$86;
                                    strings = strings_$87;
                                }




            } finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock($nl_trie_lock$.getGlobalValue());
            }
        }
        return values(nl_trie_return_keyword(removeP, eql(result, desired_result)), strings);
    }

    public static SubLObject nl_triefy_semantic_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP, final SubLObject mod_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = assertions_high.gaf_formula(assertion);
        final SubLObject desired_result = nl_trie_return_keyword(removeP, T);
        SubLObject successP = NIL;
        SubLObject error_message = NIL;
        SubLObject entries = NIL;
        SubLObject strings = NIL;
        if (NIL != $catch_nl_trie_errorsP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        thread.resetMultipleValues();
                        final SubLObject leading_strings = nl_trie_get_morpho_syntax_from_formula(formula);
                        final SubLObject wu = thread.secondMultipleValue();
                        final SubLObject following_strings = thread.thirdMultipleValue();
                        final SubLObject pos = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != mod_list) {
                            entries = semantic_update_triggered_by_syntactic_update_new(wu, assertion, mod_list);
                        } else {
                            entries = semantic_update_triggered_by_incremental_semantic_update_new(wu, assertion, pos);
                        }
                        SubLObject cdolist_list_var = entries;
                        SubLObject entry = NIL;
                        entry = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject head_string = nl_trie_word_head_string(entry);
                            final SubLObject big_string = nl_trie_assemble_strings(leading_strings, head_string, following_strings);
                            SubLObject cdolist_list_var_$92;
                            final SubLObject keys = cdolist_list_var_$92 = nl_trie_string_tokenize_multiple(big_string);
                            SubLObject key = NIL;
                            key = cdolist_list_var_$92.first();
                            while (NIL != cdolist_list_var_$92) {
                                final SubLObject result = add_or_remove_nl_trie_word(v_nl_trie, key, entry, removeP);
                                if (desired_result.eql(result)) {
                                    final SubLObject item_var = big_string;
                                    if (NIL == member(item_var, strings, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        strings = cons(item_var, strings);
                                    }
                                    successP = T;
                                }
                                cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                key = cdolist_list_var_$92.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            entry = cdolist_list_var.first();
                        } 
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            thread.resetMultipleValues();
            final SubLObject leading_strings2 = nl_trie_get_morpho_syntax_from_formula(formula);
            final SubLObject wu2 = thread.secondMultipleValue();
            final SubLObject following_strings2 = thread.thirdMultipleValue();
            final SubLObject pos2 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            if (NIL != mod_list) {
                entries = semantic_update_triggered_by_syntactic_update_new(wu2, assertion, mod_list);
            } else {
                entries = semantic_update_triggered_by_incremental_semantic_update_new(wu2, assertion, pos2);
            }
            SubLObject cdolist_list_var2 = entries;
            SubLObject entry2 = NIL;
            entry2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject head_string2 = nl_trie_word_head_string(entry2);
                final SubLObject big_string2 = nl_trie_assemble_strings(leading_strings2, head_string2, following_strings2);
                SubLObject cdolist_list_var_$93;
                final SubLObject keys2 = cdolist_list_var_$93 = nl_trie_string_tokenize_multiple(big_string2);
                SubLObject key2 = NIL;
                key2 = cdolist_list_var_$93.first();
                while (NIL != cdolist_list_var_$93) {
                    final SubLObject result2 = add_or_remove_nl_trie_word(v_nl_trie, key2, entry2, removeP);
                    if (desired_result.eql(result2)) {
                        final SubLObject item_var2 = big_string2;
                        if (NIL == member(item_var2, strings, symbol_function(EQL), symbol_function(IDENTITY))) {
                            strings = cons(item_var2, strings);
                        }
                        successP = T;
                    }
                    cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                    key2 = cdolist_list_var_$93.first();
                } 
                cdolist_list_var2 = cdolist_list_var2.rest();
                entry2 = cdolist_list_var2.first();
            } 
        }
        if (error_message.isString()) {
            successP = NIL;
            nl_trie_warn(ONE_INTEGER, $str357$Caught_error_in_NL_TRIEFY_SEMANTI, assertion, error_message, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == successP) {
            if (NIL != removeP) {
                nl_trie_warn_bad_remove(assertion);
            } else {
                nl_trie_warn_bad_add(assertion);
            }
        }
        return values(nl_trie_return_keyword(removeP, successP), strings);
    }

    public static SubLObject nl_triefy_term_phrases_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = assertions_high.gaf_formula(assertion);
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(cycl_utilities.formula_arg3(formula, UNPROVIDED));
        final SubLObject desired_result = nl_trie_return_keyword(removeP, T);
        SubLObject successP = T;
        SubLObject error_message = NIL;
        if (NIL != $catch_nl_trie_errorsP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        SubLObject cdolist_list_var = nl_trie_string_tokenize_multiple(string);
                        SubLObject key = NIL;
                        key = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject result = add_or_remove_term_phrases_entry(v_nl_trie, key, assertion, removeP);
                            if (!desired_result.eql(result)) {
                                successP = NIL;
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            key = cdolist_list_var.first();
                        } 
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            SubLObject cdolist_list_var2 = nl_trie_string_tokenize_multiple(string);
            SubLObject key2 = NIL;
            key2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject result2 = add_or_remove_term_phrases_entry(v_nl_trie, key2, assertion, removeP);
                if (!desired_result.eql(result2)) {
                    successP = NIL;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                key2 = cdolist_list_var2.first();
            } 
        }
        if (error_message.isString()) {
            successP = NIL;
            nl_trie_warn(ONE_INTEGER, $str357$Caught_error_in_NL_TRIEFY_SEMANTI, assertion, error_message, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == successP) {
            if (NIL != removeP) {
                nl_trie_warn_bad_remove(assertion);
            } else {
                nl_trie_warn_bad_add(assertion);
            }
        }
        return values(nl_trie_return_keyword(removeP, successP), list(string));
    }

    public static SubLObject add_or_remove_term_phrases_entry(final SubLObject v_nl_trie, final SubLObject key, final SubLObject entry, final SubLObject removeP) {
        if (NIL != removeP) {
            return nl_trie_remove_term_phrases_entry(v_nl_trie, key, entry);
        }
        return nl_trie_insert_term_phrases_entry(v_nl_trie, key, entry);
    }

    public static SubLObject nl_trie_insert_term_phrases_entry(final SubLObject v_nl_trie, final SubLObject key, final SubLObject new_entry) {
        nl_trie_insert_low(v_nl_trie, key, new_entry);
        return $ADDED;
    }

    public static SubLObject nl_trie_remove_term_phrases_entry(final SubLObject v_nl_trie, final SubLObject key, final SubLObject entry) {
        nl_trie_unassociate(key, entry, v_nl_trie);
        return $ADDED;
    }

    public static SubLObject nl_trie_get_morpho_syntax_from_formula(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject leading_strings = lexicon_utilities.parse_lexical_semantic_formula(formula, UNPROVIDED);
        final SubLObject wu = thread.secondMultipleValue();
        final SubLObject following_strings = thread.thirdMultipleValue();
        SubLObject pos = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == lexicon_accessors.speech_partP(pos, UNPROVIDED)) && (NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(formula), nl_trie_semtrans_predicates(), UNPROVIDED, UNPROVIDED))) {
            pos = nl_trie_pos_for_semtrans_pred(cycl_utilities.formula_arg0(formula), UNPROVIDED);
        }
        return values(unicode_nauts.convert_unicode_nauts_to_utf8_strings(leading_strings), wu, unicode_nauts.convert_unicode_nauts_to_utf8_strings(following_strings), pos);
    }

    public static SubLObject nl_trie_semantic_support_pos(final SubLObject sem_support) {
        if (NIL != assertion_handles.assertion_p(sem_support)) {
            final SubLObject formula = uncanonicalizer.assertion_el_formula(sem_support);
            return nth_value_step_2(nth_value_step_1(THREE_INTEGER), nl_trie_get_morpho_syntax_from_formula(formula));
        }
        return NIL;
    }

    public static SubLObject semantic_update_triggered_by_syntactic_update_new(final SubLObject wu, final SubLObject semantic_as, final SubLObject mod_list) {
        SubLObject words = NIL;
        final SubLObject sem_pred = assertions_high.gaf_arg0(semantic_as);
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(sem_pred);
        final SubLObject pos = (pos_arg.isInteger()) ? assertions_high.gaf_arg(semantic_as, pos_arg) : nl_trie_pos_for_semtrans_pred(sem_pred, UNPROVIDED);
        if (NIL != lexicon_accessors.speech_partP(pos, UNPROVIDED)) {
            SubLObject cdolist_list_var = mod_list;
            SubLObject mod_tuple = NIL;
            mod_tuple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = mod_tuple;
                SubLObject string_list = NIL;
                SubLObject constraint = NIL;
                SubLObject mt = NIL;
                destructuring_bind_must_consp(current, datum, $list358);
                string_list = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list358);
                constraint = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list358);
                mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pred = (NIL != fort_types_interface.predicate_p(constraint)) ? constraint : $$partOfSpeech;
                    SubLObject cdolist_list_var_$94 = string_list;
                    SubLObject string = NIL;
                    string = cdolist_list_var_$94.first();
                    while (NIL != cdolist_list_var_$94) {
                        final SubLObject sentence = make_nl_trie_syntactic_support_sentence(pred, wu, pos, string);
                        final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, mt, string);
                        final SubLObject entry = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support, symbol_function(EQUALP)), set_utilities.new_singleton_set(semantic_as, symbol_function(EQUALP)));
                        words = cons(entry, words);
                        cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                        string = cdolist_list_var_$94.first();
                    } 
                } else {
                    cdestructuring_bind_error(datum, $list358);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mod_tuple = cdolist_list_var.first();
            } 
        }
        return words;
    }

    public static SubLObject make_nl_trie_syntactic_support_sentence(final SubLObject pred, final SubLObject wu, final SubLObject pos, final SubLObject string) {
        if (pred.eql($$partOfSpeech)) {
            return make_ternary_formula(pred, wu, pos, string);
        }
        return make_binary_formula(pred, wu, string);
    }

    public static SubLObject semantic_update_triggered_by_incremental_semantic_update_new(final SubLObject wu, final SubLObject semantic_as, final SubLObject pos) {
        final SubLObject preds = nl_trie_syntactic_preds_for_pos(pos);
        if (NIL != preds) {
            return inc_sem_from_preds_new(preds, wu, semantic_as);
        }
        return inc_sem_from_pos_new(pos, wu, semantic_as);
    }

    public static SubLObject inc_sem_from_preds_new(final SubLObject preds, final SubLObject wu, final SubLObject semantic_as) {
        SubLObject words = NIL;
        final SubLObject assertion_mt = assertions_high.assertion_mt(semantic_as);
        SubLObject cdolist_list_var;
        final SubLObject syntactic_supports = cdolist_list_var = inc_sem_from_preds_syntactic_supports(preds, wu, assertion_mt);
        SubLObject syntactic_support = NIL;
        syntactic_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject entry = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support, symbol_function(EQUALP)), set_utilities.new_singleton_set(semantic_as, symbol_function(EQUALP)));
            words = cons(entry, words);
            cdolist_list_var = cdolist_list_var.rest();
            syntactic_support = cdolist_list_var.first();
        } 
        if (NIL == words) {
            nl_trie_warn(TWO_INTEGER, $str359$Couldn_t_find_any_string_nl_trie_, wu, preds, assertion_mt, UNPROVIDED);
        }
        return words;
    }

    public static SubLObject inc_sem_from_preds_syntactic_supports(final SubLObject preds, final SubLObject wu, final SubLObject assertion_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject syntactic_supports = NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$95;
            final SubLObject supported_wu_strings = cdolist_list_var_$95 = nl_trie_strings_of_word_unit(wu, list(pred), assertion_mt, T);
            SubLObject supported_wu_string = NIL;
            supported_wu_string = cdolist_list_var_$95.first();
            while (NIL != cdolist_list_var_$95) {
                SubLObject current;
                final SubLObject datum = current = supported_wu_string;
                SubLObject wu_string = NIL;
                SubLObject supports = NIL;
                destructuring_bind_must_consp(current, datum, $list360);
                wu_string = current.first();
                current = supports = current.rest();
                SubLObject support = NIL;
                if (NIL == support) {
                    SubLObject csome_list_var = supports;
                    SubLObject this_support = NIL;
                    this_support = csome_list_var.first();
                    while ((NIL == support) && (NIL != csome_list_var)) {
                        if ((NIL != nl_trie_syntactic_support_p(this_support)) && nl_trie_syntactic_support_string(this_support).equalp(wu_string)) {
                            support = this_support;
                        }
                        csome_list_var = csome_list_var.rest();
                        this_support = csome_list_var.first();
                    } 
                }
                if (NIL == support) {
                    final SubLObject sentence = make_binary_formula(pred, wu, wu_string);
                    support = find_or_create_nl_trie_word_syn_support(sentence, assertion_mt, wu_string);
                }
                final SubLObject item_var = support;
                if (NIL == member(item_var, syntactic_supports, symbol_function(EQL), symbol_function(IDENTITY))) {
                    syntactic_supports = cons(item_var, syntactic_supports);
                }
                cdolist_list_var_$95 = cdolist_list_var_$95.rest();
                supported_wu_string = cdolist_list_var_$95.first();
            } 
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($nl_trie_lexical_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = pred;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$96 = NIL;
                                final SubLObject token_var_$97 = NIL;
                                while (NIL == done_var_$96) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$97);
                                    final SubLObject valid_$98 = makeBoolean(!token_var_$97.eql(assertion));
                                    if (NIL != valid_$98) {
                                        final SubLObject string = lexicon_utilities.spp_assertion_string(assertion);
                                        final SubLObject mt = assertions_high.assertion_mt(assertion);
                                        SubLObject str_pred_list = find_morphologically_derivable_strings(wu, string, pred, mt);
                                        if ((NIL != lexicon_accessors.genl_lexicon_mtP(mt, assertion_mt)) && (!mt.eql(assertion_mt))) {
                                            final SubLObject item_var2 = list(list(string), pred);
                                            if (NIL == member(item_var2, str_pred_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                str_pred_list = cons(item_var2, str_pred_list);
                                            }
                                            SubLObject cdolist_list_var_$96 = str_pred_list;
                                            SubLObject str_pred_pair = NIL;
                                            str_pred_pair = cdolist_list_var_$96.first();
                                            while (NIL != cdolist_list_var_$96) {
                                                SubLObject current2;
                                                final SubLObject datum2 = current2 = str_pred_pair;
                                                SubLObject each_str_list = NIL;
                                                SubLObject each_pred = NIL;
                                                destructuring_bind_must_consp(current2, datum2, $list361);
                                                each_str_list = current2.first();
                                                current2 = current2.rest();
                                                destructuring_bind_must_consp(current2, datum2, $list361);
                                                each_pred = current2.first();
                                                current2 = current2.rest();
                                                if (NIL == current2) {
                                                    SubLObject cdolist_list_var_$97 = each_str_list;
                                                    SubLObject pred_string = NIL;
                                                    pred_string = cdolist_list_var_$97.first();
                                                    while (NIL != cdolist_list_var_$97) {
                                                        final SubLObject sentence2 = make_binary_formula(each_pred, wu, pred_string);
                                                        final SubLObject item_var3;
                                                        final SubLObject support2 = item_var3 = find_or_create_nl_trie_word_syn_support(sentence2, mt, pred_string);
                                                        if (NIL == member(item_var3, syntactic_supports, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            syntactic_supports = cons(item_var3, syntactic_supports);
                                                        }
                                                        cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                                                        pred_string = cdolist_list_var_$97.first();
                                                    } 
                                                } else {
                                                    cdestructuring_bind_error(datum2, $list361);
                                                }
                                                cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                                                str_pred_pair = cdolist_list_var_$96.first();
                                            } 
                                        }
                                    }
                                    done_var_$96 = makeBoolean(NIL == valid_$98);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$101 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
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
            pred = cdolist_list_var.first();
        } 
        return syntactic_supports;
    }

    public static SubLObject inc_sem_from_pos_new(final SubLObject pos, final SubLObject wu, final SubLObject semantic_assertion) {
        final SubLObject assertion_mt = assertions_high.assertion_mt(semantic_assertion);
        SubLObject words = NIL;
        SubLObject cdolist_list_var = find_string_mt_pairs_for_closed_class_word(wu, pos, assertion_mt);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject string = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list362);
            string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list362);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject sentence = make_ternary_formula($$partOfSpeech, wu, pos, string);
                final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, mt, string);
                final SubLObject entry = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support, symbol_function(EQUALP)), set_utilities.new_singleton_set(semantic_assertion, symbol_function(EQUALP)));
                words = cons(entry, words);
            } else {
                cdestructuring_bind_error(datum, $list362);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return words;
    }

    public static SubLObject find_string_mt_pairs_for_closed_class_word(final SubLObject wu, final SubLObject pos, final SubLObject semantic_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pairs = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(wu, ONE_INTEGER, $$partOfSpeech, UNPROVIDED, UNPROVIDED);
            SubLObject pos_as = NIL;
            pos_as = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pos_mt = assertions_high.assertion_mt(pos_as);
                final SubLObject pos_pos = assertions_high.gaf_arg2(pos_as);
                final SubLObject string = assertions_high.gaf_arg3(pos_as);
                if ((NIL != lexicon_accessors.genl_posP(pos_pos, pos, UNPROVIDED)) || (NIL != lexicon_accessors.genl_posP(pos, pos_pos, UNPROVIDED))) {
                    SubLObject cdolist_list_var_$102 = genl_mts.max_floor_mts(list(pos_mt, semantic_mt), UNPROVIDED, UNPROVIDED);
                    SubLObject floor_mt = NIL;
                    floor_mt = cdolist_list_var_$102.first();
                    while (NIL != cdolist_list_var_$102) {
                        final SubLObject item_var = list(string, floor_mt);
                        if (NIL == member(item_var, pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            pairs = cons(item_var, pairs);
                        }
                        cdolist_list_var_$102 = cdolist_list_var_$102.rest();
                        floor_mt = cdolist_list_var_$102.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_as = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return pairs;
    }

    public static SubLObject nl_trie_assemble_strings(final SubLObject leading_strings, final SubLObject wu_string, final SubLObject following_strings) {
        return lexicon_utilities.assemble_denot_strings(leading_strings, wu_string, following_strings);
    }

    public static SubLObject new_nl_trie_denot_set(SubLObject denots) {
        if (denots == UNPROVIDED) {
            denots = NIL;
        }
        return set_utilities.construct_set_from_list(denots, $nl_trie_denot_set_test$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject nl_triefy_arg_in_reln_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP, SubLObject mod_list) {
        if (mod_list == UNPROVIDED) {
            mod_list = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        final SubLObject arg_in_reln_pred = assertions_high.gaf_arg0(assertion);
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        final SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached(arg_in_reln_pred);
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(arg_in_reln_pred);
        final SubLObject denotatum_arg = lexicon_utilities.denotatum_arg_of_pred_cached(arg_in_reln_pred);
        final SubLObject head_word = (NIL != wu_arg) ? assertions_high.gaf_arg(assertion, wu_arg) : NIL;
        SubLObject leading_strings = NIL;
        SubLObject following_strings = NIL;
        SubLObject full_strings = NIL;
        final SubLObject pos = (NIL != pos_arg) ? assertions_high.gaf_arg(assertion, pos_arg) : NIL;
        final SubLObject denoted_reln = (NIL != denotatum_arg) ? assertions_high.gaf_arg(assertion, denotatum_arg) : NIL;
        SubLObject successP = NIL;
        thread.resetMultipleValues();
        final SubLObject leading_strings_$103 = lexicon_utilities.get_leading_strings_and_following_strings(assertions_high.gaf_formula(assertion));
        final SubLObject following_strings_$104 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        leading_strings = leading_strings_$103;
        following_strings = following_strings_$104;
        if (((NIL != head_word) && (NIL != lexicon_accessors.speech_partP(pos, UNPROVIDED))) && (NIL != denoted_reln)) {
            final SubLObject denot_list = lexicon_accessors.relational_noun_denots(leading_strings, head_word, following_strings, pos, $UNDETERMINED, denoted_reln, assertion_mt, assertion_mt);
            final SubLObject denot_set = new_nl_trie_denot_set(denot_list);
            final SubLObject sem_support = nl_trie_semantic_support_from_denots(denot_set, assertion_mt);
            if (NIL != denot_list) {
                if (NIL != mod_list) {
                    thread.resetMultipleValues();
                    final SubLObject successP_$105 = nl_triefy_arg_in_reln_wX_mod_list(sem_support, leading_strings, head_word, following_strings, pos, v_nl_trie, removeP, mod_list);
                    final SubLObject full_strings_$106 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    successP = successP_$105;
                    full_strings = full_strings_$106;
                } else {
                    thread.resetMultipleValues();
                    final SubLObject successP_$106 = nl_triefy_arg_in_reln_wXo_mod_list(sem_support, leading_strings, head_word, following_strings, pos, v_nl_trie, removeP, assertion_mt);
                    final SubLObject full_strings_$107 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    successP = successP_$106;
                    full_strings = full_strings_$107;
                }
            }
        }
        return values(nl_trie_return_keyword(removeP, successP), full_strings);
    }

    public static SubLObject nl_triefy_arg_in_reln_wX_mod_list(final SubLObject semantic_support, final SubLObject leading_strings, final SubLObject head_word, final SubLObject following_strings, final SubLObject pos, final SubLObject v_nl_trie, final SubLObject removeP, final SubLObject mod_list) {
        SubLObject successP = NIL;
        SubLObject strings = NIL;
        SubLObject cdolist_list_var = mod_list;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject head_strings = NIL;
            SubLObject constraint = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list365);
            head_strings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list365);
            constraint = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list365);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pred = (NIL != fort_types_interface.predicate_p(constraint)) ? constraint : $$partOfSpeech;
                if (((NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED)) && pos.eql(lexicon_accessors.pos_of_pred(pred))) || constraint.eql(pos)) {
                    SubLObject cdolist_list_var_$109 = head_strings;
                    SubLObject head_string = NIL;
                    head_string = cdolist_list_var_$109.first();
                    while (NIL != cdolist_list_var_$109) {
                        final SubLObject big_string = nl_trie_assemble_strings(leading_strings, head_string, following_strings);
                        final SubLObject syn_sentence = make_binary_formula(pred, head_word, head_string);
                        final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(syn_sentence, mt, head_string);
                        final SubLObject nl_trie_word = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support, symbol_function(EQUALP)), set_utilities.new_singleton_set(semantic_support, symbol_function(EQUALP)));
                        successP = T;
                        strings = cons(big_string, strings);
                        SubLObject cdolist_list_var_$110 = nl_trie_string_tokenize_multiple(big_string);
                        SubLObject key = NIL;
                        key = cdolist_list_var_$110.first();
                        while (NIL != cdolist_list_var_$110) {
                            add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                            cdolist_list_var_$110 = cdolist_list_var_$110.rest();
                            key = cdolist_list_var_$110.first();
                        } 
                        cdolist_list_var_$109 = cdolist_list_var_$109.rest();
                        head_string = cdolist_list_var_$109.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list365);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return values(successP, strings);
    }

    public static SubLObject nl_triefy_arg_in_reln_wXo_mod_list(final SubLObject semantic_support, final SubLObject leading_strings, final SubLObject head_word, final SubLObject following_strings, final SubLObject pos, final SubLObject v_nl_trie, final SubLObject removeP, final SubLObject mt) {
        final SubLObject basic_pred = lexicon_utilities.ordered_lexification_preds_of_pos(pos).first();
        final SubLObject derived_preds = morphology.pos_preds_derivable_from_pred(basic_pred, UNPROVIDED);
        SubLObject successP = NIL;
        SubLObject strings = NIL;
        SubLObject cdolist_list_var = lexicon_cache.strings_of_wordXpred(head_word, basic_pred, UNPROVIDED);
        SubLObject basic_head_string = NIL;
        basic_head_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject big_string = nl_trie_assemble_strings(leading_strings, basic_head_string, following_strings);
            final SubLObject syn_sentence = make_binary_formula(basic_pred, head_word, basic_head_string);
            final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(syn_sentence, mt, basic_head_string);
            final SubLObject nl_trie_word = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support, $nl_trie_word_syntactic_support_set_test$.getGlobalValue()), set_utilities.new_singleton_set(semantic_support, $nl_trie_word_semantic_support_set_test$.getGlobalValue()));
            successP = T;
            strings = cons(big_string, strings);
            SubLObject cdolist_list_var_$111 = nl_trie_string_tokenize_multiple(big_string);
            SubLObject key = NIL;
            key = cdolist_list_var_$111.first();
            while (NIL != cdolist_list_var_$111) {
                add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                cdolist_list_var_$111 = cdolist_list_var_$111.rest();
                key = cdolist_list_var_$111.first();
            } 
            SubLObject cdolist_list_var_$112 = derived_preds;
            SubLObject derived_pred = NIL;
            derived_pred = cdolist_list_var_$112.first();
            while (NIL != cdolist_list_var_$112) {
                final SubLObject derived_head_string = morphology.generate_regular_string_from_form(derived_pred, basic_pred, basic_head_string, UNPROVIDED);
                final SubLObject syn_sentence2 = make_binary_formula(derived_pred, head_word, derived_head_string);
                final SubLObject syntactic_support2 = find_or_create_nl_trie_word_syn_support(syn_sentence2, mt, derived_head_string);
                final SubLObject nl_trie_word2 = new_nl_trie_word(set_utilities.new_singleton_set(syntactic_support2, symbol_function(EQUALP)), set_utilities.new_singleton_set(semantic_support, symbol_function(EQUALP)));
                final SubLObject big_string2 = nl_trie_assemble_strings(leading_strings, derived_head_string, following_strings);
                successP = T;
                strings = cons(big_string2, strings);
                SubLObject cdolist_list_var_$113 = nl_trie_string_tokenize_multiple(big_string2);
                SubLObject key2 = NIL;
                key2 = cdolist_list_var_$113.first();
                while (NIL != cdolist_list_var_$113) {
                    add_or_remove_nl_trie_word(v_nl_trie, key2, nl_trie_word2, removeP);
                    cdolist_list_var_$113 = cdolist_list_var_$113.rest();
                    key2 = cdolist_list_var_$113.first();
                } 
                cdolist_list_var_$112 = cdolist_list_var_$112.rest();
                derived_pred = cdolist_list_var_$112.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            basic_head_string = cdolist_list_var.first();
        } 
        return values(successP, strings);
    }

    public static SubLObject nl_triefy_abbr_lex_word_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_formula(assertion), UNPROVIDED);
        SubLObject abbrev_pred = NIL;
        SubLObject wu = NIL;
        SubLObject v_const = NIL;
        SubLObject cycl_abbr = NIL;
        destructuring_bind_must_consp(current, datum, $list366);
        abbrev_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list366);
        wu = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list366);
        v_const = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list366);
        cycl_abbr = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject abbr = cycl_string.cycl_string_to_utf8_string(cycl_abbr);
            final SubLObject pos = find_pos_for_lex_const(v_const);
            final SubLObject preds = find_pos_preds_for_lex_const(v_const);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject syntactic_supports = new_nl_trie_word_syntactic_support_set(UNPROVIDED);
            final SubLObject denots = get_denot_for_abbr_lex_word_assertion(wu, pos, assertion_mt);
            SubLObject successP = T;
            final SubLObject desired_result = nl_trie_return_keyword(removeP, T);
            SubLObject cdolist_list_var = preds;
            SubLObject pos_pred = NIL;
            pos_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sentence = list(abbrev_pred, wu, pos_pred, cycl_abbr);
                final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, assertion_mt, cycl_abbr);
                set.set_add(syntactic_support, syntactic_supports);
                update_nl_trie_semantic_on_wu(wu, v_nl_trie, assertion_mt, NIL, list(list(list(cycl_abbr), pos_pred, assertion_mt)));
                cdolist_list_var = cdolist_list_var.rest();
                pos_pred = cdolist_list_var.first();
            } 
            final SubLObject nl_trie_word = new_nl_trie_word(syntactic_supports, denots);
            SubLObject cdolist_list_var2 = nl_trie_string_tokenize_multiple(abbr);
            SubLObject key = NIL;
            key = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject result = add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                if (!result.eql(desired_result)) {
                    successP = NIL;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                key = cdolist_list_var2.first();
            } 
            return nl_trie_return_keyword(removeP, successP);
        }
        cdestructuring_bind_error(datum, $list366);
        return NIL;
    }

    public static SubLObject get_denot_for_abbr_lex_word_assertion(final SubLObject wu, final SubLObject apos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denots = new_nl_trie_denot_set(UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pred_relevance_macros.$pred$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EQ, thread);
            pred_relevance_macros.$pred$.bind($$denotation, thread);
            final SubLObject pred_var = NIL;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$114 = NIL;
                            final SubLObject token_var_$115 = NIL;
                            while (NIL == done_var_$114) {
                                final SubLObject denot_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$115);
                                final SubLObject valid_$116 = makeBoolean(!token_var_$115.eql(denot_assertion));
                                if (NIL != valid_$116) {
                                    final SubLObject pos = assertions_high.gaf_arg2(denot_assertion);
                                    if (pos.equal(apos)) {
                                        set.set_add(denot_assertion, denots);
                                    }
                                }
                                done_var_$114 = makeBoolean(NIL == valid_$116);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$117 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            pred_relevance_macros.$pred$.rebind(_prev_bind_5, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }

    public static SubLObject nl_triefy_abbr_cps_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_formula(assertion), UNPROVIDED);
        SubLObject abbrev_pred = NIL;
        SubLObject wu = NIL;
        SubLObject cycl_mw_str = NIL;
        SubLObject v_const = NIL;
        SubLObject abbr = NIL;
        destructuring_bind_must_consp(current, datum, $list368);
        abbrev_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        wu = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        cycl_mw_str = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        v_const = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        abbr = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject mw_str = unicode_nauts.convert_unicode_nauts_to_utf8_strings(cycl_mw_str);
            final SubLObject pos = find_pos_for_lex_const(v_const);
            final SubLObject preds = find_pos_preds_for_lex_const(v_const);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject syntactic_supports = new_nl_trie_word_syntactic_support_set(UNPROVIDED);
            final SubLObject denots = get_denot_for_abbr_cps_assertion(mw_str, wu, pos, assertion_mt);
            SubLObject successP = T;
            final SubLObject desired_result = nl_trie_return_keyword(removeP, T);
            SubLObject cdolist_list_var = preds;
            SubLObject pos_pred = NIL;
            pos_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sentence = list(abbrev_pred, wu, mw_str, pos_pred, abbr);
                final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, assertion_mt, abbr);
                set.set_add(syntactic_support, syntactic_supports);
                cdolist_list_var = cdolist_list_var.rest();
                pos_pred = cdolist_list_var.first();
            } 
            final SubLObject nl_trie_word = new_nl_trie_word(syntactic_supports, denots);
            SubLObject cdolist_list_var2 = nl_trie_string_tokenize_multiple(abbr);
            SubLObject key = NIL;
            key = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject result = add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                if (!result.eql(desired_result)) {
                    successP = NIL;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                key = cdolist_list_var2.first();
            } 
            return nl_trie_return_keyword(removeP, successP);
        }
        cdestructuring_bind_error(datum, $list368);
        return NIL;
    }

    public static SubLObject get_denot_for_abbr_cps_assertion(final SubLObject amw_str, final SubLObject word, final SubLObject apos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denots = new_nl_trie_denot_set(UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pred_relevance_macros.$pred$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EQ, thread);
            pred_relevance_macros.$pred$.bind($$compoundString, thread);
            final SubLObject pred_var = NIL;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$118 = NIL;
                            final SubLObject token_var_$119 = NIL;
                            while (NIL == done_var_$118) {
                                final SubLObject cp_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$119);
                                final SubLObject valid_$120 = makeBoolean(!token_var_$119.eql(cp_assertion));
                                if (NIL != valid_$120) {
                                    final SubLObject mw_str = assertions_high.gaf_arg2(cp_assertion);
                                    final SubLObject pos = assertions_high.gaf_arg3(cp_assertion);
                                    if (mw_str.equal(amw_str) && pos.equal(apos)) {
                                        set.set_add(cp_assertion, denots);
                                    }
                                }
                                done_var_$118 = makeBoolean(NIL == valid_$120);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$121 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$121, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            pred_relevance_macros.$pred$.rebind(_prev_bind_5, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }

    public static SubLObject nl_triefy_abbr_mws_assertion(final SubLObject assertion, final SubLObject v_nl_trie, final SubLObject removeP) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_formula(assertion), UNPROVIDED);
        SubLObject abbrev_pred = NIL;
        SubLObject cycl_mw_str = NIL;
        SubLObject wu = NIL;
        SubLObject v_const = NIL;
        SubLObject cycl_abbr = NIL;
        destructuring_bind_must_consp(current, datum, $list370);
        abbrev_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list370);
        cycl_mw_str = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list370);
        wu = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list370);
        v_const = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list370);
        cycl_abbr = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject mw_str = unicode_nauts.convert_unicode_nauts_to_utf8_strings(cycl_mw_str);
            final SubLObject abbr = cycl_string.cycl_string_to_utf8_string(cycl_abbr);
            final SubLObject pos = find_pos_for_lex_const(v_const);
            final SubLObject preds = find_pos_preds_for_lex_const(v_const);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject syntactic_supports = new_nl_trie_word_syntactic_support_set(UNPROVIDED);
            final SubLObject denots = get_denot_for_abbr_mws_assertion(mw_str, wu, pos, assertion_mt);
            SubLObject successP = T;
            final SubLObject desired_result = nl_trie_return_keyword(removeP, T);
            SubLObject cdolist_list_var = preds;
            SubLObject pos_pred = NIL;
            pos_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sentence = list(abbrev_pred, mw_str, wu, pos_pred, abbr);
                final SubLObject syntactic_support = find_or_create_nl_trie_word_syn_support(sentence, assertion_mt, abbr);
                set.set_add(syntactic_support, syntactic_supports);
                cdolist_list_var = cdolist_list_var.rest();
                pos_pred = cdolist_list_var.first();
            } 
            final SubLObject nl_trie_word = new_nl_trie_word(syntactic_supports, denots);
            SubLObject cdolist_list_var2 = nl_trie_string_tokenize_multiple(abbr);
            SubLObject key = NIL;
            key = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject result = add_or_remove_nl_trie_word(v_nl_trie, key, nl_trie_word, removeP);
                if (!result.eql(desired_result)) {
                    successP = NIL;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                key = cdolist_list_var2.first();
            } 
            return nl_trie_return_keyword(removeP, successP);
        }
        cdestructuring_bind_error(datum, $list370);
        return NIL;
    }

    public static SubLObject get_denot_for_abbr_mws_assertion(final SubLObject amw_str, final SubLObject word, final SubLObject apos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denots = new_nl_trie_denot_set(UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pred_relevance_macros.$pred$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EQ, thread);
            pred_relevance_macros.$pred$.bind($$multiWordString, thread);
            final SubLObject pred_var = NIL;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$122 = NIL;
                            final SubLObject token_var_$123 = NIL;
                            while (NIL == done_var_$122) {
                                final SubLObject mw_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$123);
                                final SubLObject valid_$124 = makeBoolean(!token_var_$123.eql(mw_assertion));
                                if (NIL != valid_$124) {
                                    final SubLObject mw_str = assertions_high.gaf_arg1(mw_assertion);
                                    final SubLObject pos = assertions_high.gaf_arg3(mw_assertion);
                                    if (mw_str.equal(amw_str) && pos.equal(apos)) {
                                        set.set_add(mw_assertion, denots);
                                    }
                                }
                                done_var_$122 = makeBoolean(NIL == valid_$124);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$125 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$125, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            pred_relevance_macros.$pred$.rebind(_prev_bind_5, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }

    public static SubLObject nl_triefy_name_string(final SubLObject content, final SubLObject v_nl_trie, final SubLObject removeP) {
        final SubLObject string = nl_trie_name_string(content);
        final SubLObject desired_result = nl_trie_return_keyword(removeP, T);
        SubLObject successP = NIL;
        if (!string.isString()) {
            if (NIL != removeP) {
                nl_trie_warn_bad_remove(content);
            } else {
                nl_trie_warn_bad_add(content);
            }
            return nl_trie_return_keyword(removeP, NIL);
        }
        final SubLObject trie_keys = nl_trie_entry_keys(content, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject entry_strings = list(string);
        SubLObject cdolist_list_var = trie_keys;
        SubLObject trie_key = NIL;
        trie_key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != nl_trie_name_ok_for_adding_theP(content, nl_trie_entry_mt(content), trie_key)) {
                final SubLObject item_var = cconcatenate($english_definite_determiner$.getGlobalValue(), new SubLObject[]{ $$$_, string });
                if (NIL == member(item_var, entry_strings, symbol_function(EQL), symbol_function(IDENTITY))) {
                    entry_strings = cons(item_var, entry_strings);
                }
            }
            result = update_nl_trie_name(v_nl_trie, trie_key, content, removeP);
            if (desired_result.eql(result)) {
                successP = T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            trie_key = cdolist_list_var.first();
        } 
        return values(nl_trie_return_keyword(removeP, successP), entry_strings);
    }

    public static SubLObject add_or_remove_nl_trie_word(final SubLObject v_nl_trie, final SubLObject key0, final SubLObject word, final SubLObject removeP) {
        final SubLObject desired_result = nl_trie_return_keyword(removeP, T);
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        final SubLObject result = (NIL != key) ? NIL != removeP ? nl_trie_delete_word(v_nl_trie, key, word) : nl_trie_insert_word(v_nl_trie, key, word) : NIL;
        nl_trie_accessors.update_nl_trie_rotation_index(list(word), removeP, UNPROVIDED);
        return nl_trie_return_keyword(removeP, eql(desired_result, result));
    }

    public static SubLObject nl_trie_insert_low(final SubLObject v_nl_trie, SubLObject key, final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (v_nl_trie.eql(get_nl_trie())) {
            nl_trie_completion.nl_trie_completion_index_add_string(nl_trie_entry_string(entry));
            SubLObject release = NIL;
            try {
                release = seize_lock($nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                    file_vector_utilities.$current_backed_map_cache_strategy$.bind($nl_trie_cache_strategy$.getGlobalValue(), thread);
                    key = nl_trie_eqify_key(key);
                    result = strie.strie_insert(v_nl_trie, key, entry);
                } finally {
                    file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                }
            } finally {
                if (NIL != release) {
                    release_lock($nl_trie_lock$.getGlobalValue());
                }
            }
        } else {
            result = strie.strie_insert(v_nl_trie, key, entry);
        }
        return result;
    }

    public static SubLObject nl_trie_eqify_key(final SubLObject key) {
        SubLObject list_var = NIL;
        SubLObject string = NIL;
        SubLObject i = NIL;
        list_var = key;
        string = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , string = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject string_to_use = nl_trie_accessors.nl_trie_string_to_use(string);
            if (!string.eql(string_to_use)) {
                list_utilities.nreplace_nth(i, string_to_use, key);
            }
        }
        return key;
    }

    public static SubLObject nl_trie_insert_word(final SubLObject v_nl_trie, final SubLObject key0, final SubLObject new_entry) {
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        final SubLObject exist_entries = nl_trie_lookup(v_nl_trie, key, $OFF);
        SubLObject csome_list_var = nl_trie_remove_invalid_entries(exist_entries, v_nl_trie, key);
        SubLObject exist_entry = NIL;
        exist_entry = csome_list_var.first();
        while (NIL != csome_list_var) {
            if ((NIL != nl_trie_word_p(exist_entry, UNPROVIDED)) && (NIL != unifiable_word_entriesP(exist_entry, new_entry, UNPROVIDED))) {
                nl_trie_augment_word(exist_entry, new_entry, T);
                return $ADDED;
            }
            csome_list_var = csome_list_var.rest();
            exist_entry = csome_list_var.first();
        } 
        nl_trie_insert_low(v_nl_trie, key, new_entry);
        return $ADDED;
    }

    public static SubLObject nl_trie_closed_lexical_class_entryP(final SubLObject entry) {
        return makeBoolean((NIL != nl_trie_word_p(entry, UNPROVIDED)) && (NIL != lexicon_accessors.closed_lexical_classP(nl_trie_word_pos(entry), UNPROVIDED)));
    }

    public static SubLObject nl_trie_entry_case_matches_stringP(final SubLObject entry, final SubLObject string) {
        return equal(nl_trie_entry_string(entry), string);
    }

    public static SubLObject nl_trie_augment_word(final SubLObject word, final SubLObject new_word, SubLObject check_for_impliedP) {
        if (check_for_impliedP == UNPROVIDED) {
            check_for_impliedP = T;
        }
        SubLObject set_var = nl_trie_word_syntactic_support_set(new_word);
        SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject syn_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            syn_support = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, syn_support)) {
                nl_trie_word_add_syntactic_support(word, syn_support, check_for_impliedP);
            }
        }
        set_var = nl_trie_word_semantic_support_set(new_word);
        set_contents_var = set.do_set_internal(set_var);
        SubLObject sem_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            sem_support = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, sem_support)) {
                nl_trie_word_add_semantic_support(word, sem_support);
            }
        }
        return $AUGMENTED;
    }

    public static SubLObject nl_trie_delete_word(final SubLObject v_nl_trie, final SubLObject key, final SubLObject del_word) {
        final SubLObject exist_entries = nl_trie_lookup(v_nl_trie, key, $OFF);
        final SubLObject syn_supports = nl_trie_word_syntactic_support_set(del_word);
        final SubLObject sem_supports = nl_trie_word_semantic_support_set(del_word);
        SubLObject foundP = NIL;
        SubLObject cdolist_list_var = exist_entries;
        SubLObject exist_entry = NIL;
        exist_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != nl_trie_word_p(exist_entry, UNPROVIDED)) {
                SubLObject unassociateP = set.set_emptyP(syn_supports);
                final SubLObject set_contents_var = set.do_set_internal(syn_supports);
                SubLObject basis_object;
                SubLObject state;
                SubLObject syn_support;
                SubLObject set_contents_var_$126;
                SubLObject basis_object_$127;
                SubLObject state_$128;
                SubLObject sem_support;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == unassociateP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                    syn_support = set_contents.do_set_contents_next(basis_object, state);
                    if ((NIL != set_contents.do_set_contents_element_validP(state, syn_support)) && (NIL != nl_trie_word_has_syntactic_support_p(exist_entry, syn_support, NIL))) {
                        if (NIL != set.set_emptyP(sem_supports)) {
                            foundP = T;
                            nl_trie_word_remove_syntactic_support(exist_entry, syn_support);
                            if (NIL != set.set_emptyP(nl_trie_word_syntactic_support_set(exist_entry))) {
                                unassociateP = T;
                            }
                        } else {
                            set_contents_var_$126 = set.do_set_internal(sem_supports);
                            for (basis_object_$127 = set_contents.do_set_contents_basis_object(set_contents_var_$126), state_$128 = NIL, state_$128 = set_contents.do_set_contents_initial_state(basis_object_$127, set_contents_var_$126); NIL == set_contents.do_set_contents_doneP(basis_object_$127, state_$128); state_$128 = set_contents.do_set_contents_update_state(state_$128)) {
                                sem_support = set_contents.do_set_contents_next(basis_object_$127, state_$128);
                                if ((NIL != set_contents.do_set_contents_element_validP(state_$128, sem_support)) && (NIL != nl_trie_word_has_semantic_support_p(exist_entry, sem_support))) {
                                    foundP = T;
                                    nl_trie_word_remove_semantic_support(exist_entry, sem_support);
                                }
                            }
                            if (NIL != nl_trie_syntactic_orphanP(exist_entry, key)) {
                                unassociateP = T;
                            }
                        }
                    }
                }
                if (NIL != unassociateP) {
                    nl_trie_unassociate(key, exist_entry, v_nl_trie);
                    foundP = T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            exist_entry = cdolist_list_var.first();
        } 
        return NIL != foundP ? $REMOVED : $NOT_FOUND;
    }

    public static SubLObject nl_trie_unassociate(final SubLObject key, final SubLObject entry, SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = get_nl_trie();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                file_vector_utilities.$current_backed_map_cache_strategy$.bind($nl_trie_cache_strategy$.getGlobalValue(), thread);
                strie.strie_unassociate(v_nl_trie, key, entry);
            } finally {
                file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock($nl_trie_lock$.getGlobalValue());
            }
        }
        if (v_nl_trie.eql(get_nl_trie()) && (NIL == nl_trie_search(nl_trie_entry_string(entry), get_nl_trie(), UNPROVIDED))) {
            nl_trie_completion.nl_trie_completion_index_remove_string(nl_trie_entry_string(entry));
        }
        return NIL;
    }

    public static SubLObject nl_trie_syntactic_orphanP(final SubLObject word, final SubLObject key) {
        return makeBoolean((NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word))) && (NIL == subl_promotions.memberP(key, nl_trie_string_tokenize_multiple(nl_trie_word_string(word)), EQUALP, UNPROVIDED)));
    }

    public static SubLObject unifiable_word_entriesP(final SubLObject word1, final SubLObject word2, SubLObject check_pragmaticsP) {
        if (check_pragmaticsP == UNPROVIDED) {
            check_pragmaticsP = T;
        }
        return makeBoolean((((NIL != nl_trie_syntax_unifiable_p(word1, word2)) && (NIL != nl_trie_semantics_unifiable_p(word1, word2))) && ((NIL == check_pragmaticsP) || (NIL != nl_trie_pragmatics_unifiable_p(word1, word2)))) && (NIL != nl_trie_words_case_identicalP(word1, word2)));
    }

    public static SubLObject nl_trie_words_case_identicalP(final SubLObject word1, final SubLObject word2) {
        return equal(nl_trie_entry_string(word1), nl_trie_entry_string(word2));
    }

    public static SubLObject nl_trie_syntax_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return makeBoolean(((NIL != nl_trie_frame_unifiable_p(word1, word2)) && (NIL != nl_trie_pos_unifiable_p(word1, word2))) && ((NIL != nl_trie_no_new_syntax_p(word1, word2)) || ((NIL != nl_trie_wu_unifiable_p(word1, word2)) && (NIL != nl_trie_syntax_mt_unifiable_p(word1, word2)))));
    }

    public static SubLObject nl_trie_semantics_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return makeBoolean((NIL != nl_trie_no_new_semantics_p(word1, word2)) || ((NIL != nl_trie_semantic_pred_unifiable_p(word1, word2)) && (NIL != nl_trie_semantics_mt_unifiable_p(word1, word2))));
    }

    public static SubLObject nl_trie_pragmatics_unifiable_p(final SubLObject word1, final SubLObject word2) {
        if (NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word1))) {
            return T;
        }
        if (NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word2))) {
            return T;
        }
        if (nl_trie_entry_pragmatics(word1).equal(nl_trie_entry_pragmatics(word2))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject nl_trie_semantic_pred_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return makeBoolean(((NIL == nl_trie_entry_semantic_pred(word1, UNPROVIDED)) || (NIL == nl_trie_entry_semantic_pred(word2, UNPROVIDED))) || nl_trie_entry_semantic_pred(word1, UNPROVIDED).equal(nl_trie_entry_semantic_pred(word2, UNPROVIDED)));
    }

    public static SubLObject nl_trie_semantics_mt_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return makeBoolean(((NIL == nl_trie_word_semantics_mt(word1)) || (NIL == nl_trie_word_semantics_mt(word2))) || nl_trie_word_semantics_mt(word1).equal(nl_trie_word_semantics_mt(word2)));
    }

    public static SubLObject nl_trie_no_new_syntax_p(final SubLObject word1, final SubLObject word2) {
        return makeBoolean(((NIL != set.set_emptyP(nl_trie_word_syntactic_support_set(word1))) || (NIL != set.set_emptyP(nl_trie_word_syntactic_support_set(word2)))) || (NIL != set_utilities.sets_coextensionalP(nl_trie_word_syntactic_support_set(word1), nl_trie_word_syntactic_support_set(word2))));
    }

    public static SubLObject nl_trie_no_new_semantics_p(final SubLObject word1, final SubLObject word2) {
        return makeBoolean(((NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word1))) || (NIL != set.set_emptyP(nl_trie_word_semantic_support_set(word2)))) || (NIL != set_utilities.sets_coextensionalP(nl_trie_word_semantic_support_set(word1), nl_trie_word_semantic_support_set(word2))));
    }

    public static SubLObject nl_trie_pos_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return equal(nl_trie_word_pos(word1), nl_trie_word_pos(word2));
    }

    public static SubLObject nl_trie_frame_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return equal(nl_trie_word_frame(word1), nl_trie_word_frame(word2));
    }

    public static SubLObject nl_trie_wu_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return equal(nl_trie_word_word_unit(word1, UNPROVIDED), nl_trie_word_word_unit(word2, UNPROVIDED));
    }

    public static SubLObject nl_trie_syntax_mt_unifiable_p(final SubLObject word1, final SubLObject word2) {
        return equal(nl_trie_word_syntax_mt(word1), nl_trie_word_syntax_mt(word2));
    }

    public static SubLObject update_nl_trie_name(final SubLObject v_nl_trie, final SubLObject key, final SubLObject name, final SubLObject removeP) {
        SubLObject success = T;
        SubLObject cdolist_list_var;
        final SubLObject keys = cdolist_list_var = (NIL != key) ? list(key) : nl_trie_string_tokenize_multiple(nl_trie_name_string(name));
        SubLObject key_$129 = NIL;
        key_$129 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject desired_result = nl_trie_return_keyword(removeP, T);
            final SubLObject result = (NIL != key_$129) ? NIL != removeP ? nl_trie_delete_name(v_nl_trie, key_$129, name) : nl_trie_insert_name(v_nl_trie, key_$129, name) : NIL;
            nl_trie_accessors.update_nl_trie_rotation_index(list(name), removeP, UNPROVIDED);
            if (!desired_result.eql(result)) {
                success = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            key_$129 = cdolist_list_var.first();
        } 
        return nl_trie_return_keyword(removeP, success);
    }

    public static SubLObject nl_trie_insert_name(final SubLObject v_nl_trie, final SubLObject key0, final SubLObject new_entry) {
        final SubLObject key = unicode_nauts.convert_unicode_nauts_to_utf8_strings(key0);
        SubLObject csome_list_var = nl_trie_lookup(v_nl_trie, key, UNPROVIDED);
        SubLObject existing_entry = NIL;
        existing_entry = csome_list_var.first();
        while (NIL != csome_list_var) {
            if (NIL != nl_trie_name_p(existing_entry, UNPROVIDED)) {
                if (NIL != nl_trie_name_redundantP(new_entry, existing_entry)) {
                    return $REDUNDANT;
                }
                if (NIL != nl_trie_name_redundantP(existing_entry, new_entry)) {
                    nl_trie_delete_name(v_nl_trie, key, existing_entry);
                }
            }
            csome_list_var = csome_list_var.rest();
            existing_entry = csome_list_var.first();
        } 
        nl_trie_insert_low(v_nl_trie, key, new_entry);
        return $ADDED;
    }

    public static SubLObject nl_trie_name_redundantP(final SubLObject focus, final SubLObject referent) {
        return makeBoolean((((((NIL != assertions_high.gaf_assertionP(referent)) && (NIL != assertions_high.gaf_assertionP(focus))) && assertions_high.gaf_arg1(referent).equal(assertions_high.gaf_arg1(focus))) && assertions_high.gaf_arg2(referent).equal(assertions_high.gaf_arg2(focus))) && nl_trie_entry_mt(focus).eql(nl_trie_entry_mt(referent))) && nl_trie_entry_semantic_pred(referent, UNPROVIDED).eql(nl_trie_entry_semantic_pred(focus, UNPROVIDED)));
    }

    public static SubLObject nl_trie_delete_name(final SubLObject v_nl_trie, final SubLObject key, final SubLObject name) {
        nl_trie_unassociate(key, name, v_nl_trie);
        return $REMOVED;
    }

    public static SubLObject nl_trie_strings_of_wuXpos(final SubLObject wu, final SubLObject pos, final SubLObject mt) {
        if (NIL != genls.genl_ofP($$ClosedClassWord, pos, mt, UNPROVIDED)) {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(wu, ONE_INTEGER, $$partOfSpeech, mt, UNPROVIDED);
            SubLObject as = NIL;
            as = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != lexicon_accessors.genl_posP(assertions_high.gaf_arg2(as), pos, UNPROVIDED)) {
                    final SubLObject item_var = assertions_high.gaf_arg3(as);
                    if (NIL == member(item_var, ans, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        ans = cons(item_var, ans);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                as = cdolist_list_var.first();
            } 
            return ans;
        }
        return lexicon_accessors.get_strings_of_type(wu, pos, $ALL, NIL, mt);
    }

    public static SubLObject clear_nl_trie_preds_of_pos() {
        final SubLObject cs = $nl_trie_preds_of_pos_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_nl_trie_preds_of_pos(final SubLObject pos) {
        return memoization_state.caching_state_remove_function_results_with_args($nl_trie_preds_of_pos_caching_state$.getGlobalValue(), list(pos), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_preds_of_pos_internal(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = list_utilities.remove_if_not($sym307$NL_TRIE_SYNTACTIC_PRED_, kb_mapping_utilities.pred_values_in_any_mt(pos, $$speechPartPreds, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != lexicon_accessors.genl_posP($$Verb, pos, UNPROVIDED)) {
                final SubLObject item_var = $$gerund;
                if (NIL == member(item_var, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                    preds = cons(item_var, preds);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }

    public static SubLObject nl_trie_preds_of_pos(final SubLObject pos) {
        SubLObject caching_state = $nl_trie_preds_of_pos_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NL_TRIE_PREDS_OF_POS, $nl_trie_preds_of_pos_caching_state$, $int$128, EQL, ONE_INTEGER, $int$32);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pos, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(nl_trie_preds_of_pos_internal(pos)));
            memoization_state.caching_state_put(caching_state, pos, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_nl_trie_pos_of_pred() {
        final SubLObject cs = $nl_trie_pos_of_pred_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_nl_trie_pos_of_pred(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($nl_trie_pos_of_pred_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_pos_of_pred_internal(final SubLObject pred) {
        return NIL != lexicon_accessors.speech_part_predP(pred, UNPROVIDED) ? kb_mapping_utilities.pred_values_in_any_mt(pred, $$speechPartPreds, TWO_INTEGER, ONE_INTEGER, UNPROVIDED) : NIL;
    }

    public static SubLObject nl_trie_pos_of_pred(final SubLObject pred) {
        SubLObject caching_state = $nl_trie_pos_of_pred_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NL_TRIE_POS_OF_PRED, $nl_trie_pos_of_pred_caching_state$, $int$128, EQL, ONE_INTEGER, $int$64);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(nl_trie_pos_of_pred_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject nl_trie_strings_of_word_unit(final SubLObject wu, final SubLObject pred_list, final SubLObject mt, SubLObject include_supportsP) {
        if (include_supportsP == UNPROVIDED) {
            include_supportsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strings = NIL;
        if (NIL != include_supportsP) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                strings = lexicon_cache.strings_of_word_unit_with_supports(wu, pred_list);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            strings = lexicon_cache.strings_of_word_unit(wu, pred_list, NIL, mt);
        }
        return strings;
    }

    public static SubLObject nl_trie_string_tokenize(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokens = (NIL != nl_trie_single_token_stringP(string)) ? list(string) : string_utilities.nl_string_tokenize(string, string_utilities.whitespace_chars(), NIL, NIL, NIL, NIL, $nl_trie_break_list$.getDynamicValue(thread));
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assume_standardized_stringsP$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assume_standardized_stringsP$.bind(NIL, thread);
            ans = nl_trie_standardize_strings(tokens).first();
        } finally {
            lexicon_macros.$nl_trie_assume_standardized_stringsP$.rebind(_prev_bind_0, thread);
        }
        return NIL != ans ? ans : list(string);
    }

    public static SubLObject nl_trie_string_tokenize_multiple(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokens = (NIL != nl_trie_single_token_stringP(string)) ? list(string) : string_utilities.nl_string_tokenize(string, string_utilities.whitespace_chars(), NIL, NIL, NIL, NIL, $nl_trie_break_list$.getDynamicValue(thread));
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assume_standardized_stringsP$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assume_standardized_stringsP$.bind(NIL, thread);
            ans = nl_trie_standardize_strings(tokens);
        } finally {
            lexicon_macros.$nl_trie_assume_standardized_stringsP$.rebind(_prev_bind_0, thread);
        }
        return NIL != ans ? ans : list(list(string));
    }

    public static SubLObject nl_trie_single_token_stringP(final SubLObject string) {
        return makeBoolean((NIL == find(CHAR_space, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find_if(NL_TRIE_BREAK_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject nl_trie_strings_keys(final SubLObject strings) {
        return nl_trie_standardize_strings(strings);
    }

    public static SubLObject nl_trie_standardize_strings(final SubLObject strings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != lexicon_macros.$nl_trie_assume_standardized_stringsP$.getDynamicValue(thread)) {
            return values(list(strings), list(NIL));
        }
        return nl_trie_standardize_strings_int(strings);
    }

    public static SubLObject nl_trie_standardize_strings_int(final SubLObject strings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject standardized_lists = NIL;
        SubLObject alterations_lists = NIL;
        SubLObject removal_list = NIL;
        SubLObject removal_list_$130 = NIL;
        SubLObject substring_removal_list = NIL;
        SubLObject substring_removal_list_$131 = NIL;
        removal_list = $list384;
        removal_list_$130 = removal_list.first();
        substring_removal_list = $list385;
        substring_removal_list_$131 = substring_removal_list.first();
        while ((NIL != substring_removal_list) || (NIL != removal_list)) {
            SubLObject stack = NIL;
            SubLObject alterations = NIL;
            SubLObject list_var = NIL;
            SubLObject string = NIL;
            SubLObject i = NIL;
            list_var = strings;
            string = list_var.first();
            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , string = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (NIL != unicode_nauts.unicode_naut_p(string, UNPROVIDED)) {
                    stack = cons(string, stack);
                } else
                    if (NIL != member(string, removal_list_$130, symbol_function(EQUAL), UNPROVIDED)) {
                        alterations = list_utilities.alist_enter(alterations, i, ZERO_INTEGER, UNPROVIDED);
                    } else
                        if (NIL != nl_trie_break_char_exception_string_p(string)) {
                            stack = cons(string, stack);
                        } else
                            if (NIL != string_utilities.ends_with(string, $str386$_, UNPROVIDED)) {
                                stack = cons(string, stack);
                            } else
                                if (NIL != find_if(DIGIT_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    stack = cons(string, stack);
                                } else {
                                    final SubLObject no_dots = remove(CHAR_period, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    final SubLObject substrings = string_utilities.string_tokenize(no_dots, substring_removal_list_$131, NIL, NIL, T, NIL, $list388);
                                    if (NIL == list_utilities.lengthE(substrings, ONE_INTEGER, UNPROVIDED)) {
                                        alterations = list_utilities.alist_enter(alterations, i, length(substrings), UNPROVIDED);
                                    }
                                    SubLObject cdolist_list_var = substrings;
                                    SubLObject substring = NIL;
                                    substring = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        stack = cons(substring, stack);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        substring = cdolist_list_var.first();
                                    } 
                                }




            }
            if (NIL != $nl_trie_use_two_letter_stringsP$.getDynamicValue(thread)) {
                SubLObject new_stack = NIL;
                SubLObject cdolist_list_var2 = stack;
                SubLObject string2 = NIL;
                string2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL != list_utilities.lengthG(string2, TWO_INTEGER, UNPROVIDED)) {
                        new_stack = cons(string_utilities.char_list_to_string(list(string_utilities.first_char(string2), string_utilities.last_char(string2))), new_stack);
                    } else {
                        new_stack = cons(string2, new_stack);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    string2 = cdolist_list_var2.first();
                } 
                stack = nreverse(new_stack);
            }
            stack = nreverse(stack);
            if (NIL == subl_promotions.memberP(stack, standardized_lists, EQUAL, UNPROVIDED)) {
                standardized_lists = cons(stack, standardized_lists);
                alterations_lists = cons(alterations, alterations_lists);
            }
            removal_list = removal_list.rest();
            removal_list_$130 = removal_list.first();
            substring_removal_list = substring_removal_list.rest();
            substring_removal_list_$131 = substring_removal_list.first();
        } 
        return values(standardized_lists, alterations_lists);
    }

    public static SubLObject nl_trie_break_char_exception_string_p(final SubLObject string) {
        SubLObject exceptionP = list_utilities.lengthL(string, TWO_INTEGER, UNPROVIDED);
        if (NIL == exceptionP) {
            SubLObject unexceptionalP = NIL;
            final SubLObject first_char_result = nl_trie_break_char_p(string_utilities.first_char(string));
            final SubLObject end_var = length(string);
            if (NIL == unexceptionalP) {
                SubLObject end_var_$132;
                SubLObject char_num;
                SubLObject v_char;
                for (end_var_$132 = end_var, char_num = NIL, char_num = ONE_INTEGER; (NIL == unexceptionalP) && (!char_num.numGE(end_var_$132)); unexceptionalP = makeBoolean(!nl_trie_break_char_p(v_char).eql(first_char_result)) , char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                }
            }
            exceptionP = makeBoolean(NIL == unexceptionalP);
        }
        return exceptionP;
    }

    public static SubLObject nl_trie_break_char_p(final SubLObject v_char) {
        return makeBoolean((((((NIL != charE(v_char, CHAR_hyphen)) || (NIL != charE(v_char, CHAR_period))) || (NIL != charE(v_char, CHAR_slash))) || (NIL != charE(v_char, CHAR_quote))) || (NIL != string_utilities.whitespace_charP(v_char))) || (NIL != string_utilities.grammatical_punctuation_charP(v_char)));
    }

    public static SubLObject nl_trie_not_present_message(final SubLObject v_nl_trie) {
        nl_trie_warn(ONE_INTEGER, $str389$_a_is_not_currently_an_NL_Trie_, v_nl_trie, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return T;
    }

    public static SubLObject nl_trie_warn_bad_add(final SubLObject assertion) {
        return nl_trie_warn(TWO_INTEGER, $str390$Couldn_t_find_any_strings_to_add_, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_warn_bad_remove(final SubLObject assertion) {
        return nl_trie_warn(TWO_INTEGER, $str391$Couldn_t_find_any_strings_to_remo, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_trie_warn(final SubLObject level, final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        return NIL;
    }

    public static SubLObject nl_trie_error(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $nl_trie_break_on_errorP$.getDynamicValue(thread)) {
            Errors.error(format_string, new SubLObject[]{ arg1, arg2, arg3, arg4 });
        } else {
            nl_trie_warn(ONE_INTEGER, cconcatenate($$$error_, format_string), arg1, arg2, arg3, arg4);
        }
        return NIL;
    }

    public static SubLObject nl_trie_syntactic_preds_for_pos(final SubLObject pos) {
        return intersection(nl_trie_preds_of_pos(pos), nl_trie_syntactic_predicates(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject find_morphologically_derivable_strings(final SubLObject wu, final SubLObject string, final SubLObject spp_pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject str_pred_list = NIL;
        if (NIL != $nl_trie_include_derived_formsP$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = morphology.pos_preds_derivable_from_pred(spp_pred, mt);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != lexicon_cache.ok_to_derive_word_form_from_predP(wu, pred, spp_pred, mt)) {
                    final SubLObject dep_str_list = morphology.generate_regular_strings_from_form(pred, spp_pred, string, mt, UNPROVIDED, UNPROVIDED);
                    if (NIL != dep_str_list) {
                        str_pred_list = cons(list(dep_str_list, pred), str_pred_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        }
        return str_pred_list;
    }

    public static SubLObject get_nl_trie_name_pragmatic_features(final SubLObject name_entry) {
        if (NIL != assertion_handles.assertion_p(name_entry)) {
            return get_assertion_pragmatic_features(name_entry);
        }
        nl_trie_warn(TWO_INTEGER, $str393$Unable_to_determine_pragmatic_fea, name_entry, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject get_assertion_pragmatic_features(final SubLObject assertion) {
        SubLObject pragmatic_features = NIL;
        SubLObject cdolist_list_var = nl_trie_pragmatic_predicates();
        SubLObject prag_pred = NIL;
        prag_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject prag_pred_feats = get_pragmatic_features(assertion, prag_pred);
            pragmatic_features = append(pragmatic_features, prag_pred_feats);
            cdolist_list_var = cdolist_list_var.rest();
            prag_pred = cdolist_list_var.first();
        } 
        return pragmatic_features;
    }

    public static SubLObject get_pragmatic_features(final SubLObject assertion, final SubLObject prag_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($nl_trie_lexical_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_5 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_EQ, thread);
                pred_relevance_macros.$pred$.bind(prag_pred, thread);
                SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(assertion, TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(assertion, TWO_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$133 = NIL;
                                final SubLObject token_var_$134 = NIL;
                                while (NIL == done_var_$133) {
                                    final SubLObject meta_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$134);
                                    final SubLObject valid_$135 = makeBoolean(!token_var_$134.eql(meta_assertion));
                                    if (NIL != valid_$135) {
                                        final SubLObject prag_req = assertions_high.gaf_arg1(meta_assertion);
                                        final SubLObject prag_feat = (cycl_utilities.formula_arg0(prag_req).eql($$pragmaticallyAcceptable)) ? cycl_utilities.formula_arg1(prag_req, UNPROVIDED) : NIL;
                                        final SubLObject prag_mt = assertions_high.assertion_mt(meta_assertion);
                                        result = cons(list(prag_feat, prag_mt), result);
                                    }
                                    done_var_$133 = makeBoolean(NIL == valid_$135);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$136 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$136, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(assertion, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(assertion, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$134 = NIL;
                                final SubLObject token_var_$135 = NIL;
                                while (NIL == done_var_$134) {
                                    final SubLObject meta_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$135);
                                    final SubLObject valid_$136 = makeBoolean(!token_var_$135.eql(meta_assertion));
                                    if (NIL != valid_$136) {
                                        final SubLObject prag_feat2 = assertions_high.gaf_arg2(meta_assertion);
                                        final SubLObject prag_mt2 = assertions_high.assertion_mt(meta_assertion);
                                        result = cons(list(prag_feat2, prag_mt2), result);
                                    }
                                    done_var_$134 = makeBoolean(NIL == valid_$136);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$137 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_5, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject find_pos_preds_for_lex_const_internal(final SubLObject v_const) {
        if (NIL != lexicon_accessors.speech_part_predP(v_const, UNPROVIDED)) {
            return list(v_const);
        }
        if (NIL != lexicon_accessors.speech_partP(v_const, UNPROVIDED)) {
            return remove_genl_pos_preds(nreverse(lexicon_utilities.preds_of_pos(v_const, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject find_pos_preds_for_lex_const(final SubLObject v_const) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return find_pos_preds_for_lex_const_internal(v_const);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FIND_POS_PREDS_FOR_LEX_CONST, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FIND_POS_PREDS_FOR_LEX_CONST, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FIND_POS_PREDS_FOR_LEX_CONST, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_const, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(find_pos_preds_for_lex_const_internal(v_const)));
            memoization_state.caching_state_put(caching_state, v_const, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject remove_genl_pos_preds(final SubLObject preds) {
        if (!preds.isList()) {
            return NIL;
        }
        SubLObject ans = NIL;
        SubLObject remain;
        SubLObject current;
        SubLObject datum;
        SubLObject now;
        SubLObject later;
        for (remain = NIL, remain = preds; NIL != remain; remain = remain.rest()) {
            datum = current = remain;
            now = NIL;
            later = NIL;
            destructuring_bind_must_consp(current, datum, $list396);
            now = current.first();
            current = later = current.rest();
            if ((NIL == subl_promotions.memberP(now, later, $sym397$SPEC_POS_PRED_, UNPROVIDED)) && (NIL == member(now, ans, $sym397$SPEC_POS_PRED_, UNPROVIDED))) {
                ans = cons(now, ans);
            }
        }
        return ans;
    }

    public static SubLObject find_pos_for_lex_const(final SubLObject v_const) {
        if (NIL != lexicon_accessors.speech_part_predP(v_const, UNPROVIDED)) {
            final SubLObject all_pos = nl_trie_pos_of_pred(v_const);
            return NIL != all_pos ? NIL != list_utilities.singletonP(all_pos) ? all_pos.first() : genls.min_ceiling_cols(all_pos, UNPROVIDED, UNPROVIDED, UNPROVIDED).first() : NIL;
        }
        if (NIL != lexicon_accessors.speech_partP(v_const, UNPROVIDED)) {
            return v_const;
        }
        return NIL;
    }

    public static SubLObject nl_trie_syntactic_predP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(fort.eql($$partOfSpeech) || ((NIL != lexicon_accessors.speech_part_predP(fort, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread))) && (NIL != has_pos_of_predP(fort))));
    }

    public static SubLObject english_lexical_mtP(final SubLObject mt) {
        return lexicon_accessors.genl_lexicon_mtP(mt, $$EnglishLexiconMt);
    }

    public static SubLObject has_pos_of_predP(final SubLObject pred) {
        return list_utilities.sublisp_boolean(nl_trie_pos_of_pred(pred));
    }

    public static SubLObject nl_trie_semantic_predP(final SubLObject fort) {
        return isa.isa_in_any_mtP(fort, $$NLSemanticPredicate);
    }

    public static SubLObject clear_nl_trie_name_string_preds() {
        if (NIL != lexicon_vars.lex_pred_set_p($nl_trie_name_string_preds_set$.getGlobalValue())) {
            lexicon_vars.clear_lex_pred_set($nl_trie_name_string_preds_set$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject initialize_nl_trie_name_string_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == lexicon_vars.lex_pred_set_p($nl_trie_name_string_preds_set$.getGlobalValue())) {
            $nl_trie_name_string_preds_set$.setGlobalValue(lexicon_vars.new_lex_pred_set());
        }
        final SubLObject rw_lock_var = locking_map.locking_map_lock($nl_trie_name_string_preds_set$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            map_utilities.map_remove_all($nl_trie_name_string_preds_set$.getGlobalValue());
            SubLObject iterator = map_utilities.new_map_iterator(lexicon_vars.name_string_preds_set(T));
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject pred = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list399);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list399);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        map_utilities.map_put($nl_trie_name_string_preds_set$.getGlobalValue(), pred, T);
                    } else {
                        cdestructuring_bind_error(datum, $list399);
                    }
                }
            }
            iterator = map_utilities.new_map_iterator(lexicon_vars.term_strings_preds_set(T));
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject pred = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list399);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list399);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        map_utilities.map_put($nl_trie_name_string_preds_set$.getGlobalValue(), pred, T);
                    } else {
                        cdestructuring_bind_error(datum, $list399);
                    }
                }
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return $nl_trie_name_string_preds_set$.getGlobalValue();
    }

    public static SubLObject nl_trie_name_string_preds() {
        if (NIL == lexicon_vars.lex_pred_set_p($nl_trie_name_string_preds_set$.getGlobalValue())) {
            $nl_trie_name_string_preds_set$.setGlobalValue(lexicon_vars.new_lex_pred_set());
        }
        final SubLObject rw_lock_var = locking_map.locking_map_lock($nl_trie_name_string_preds_set$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (NIL != lexicon_vars.lex_pred_set_uninitializedP($nl_trie_name_string_preds_set$.getGlobalValue())) {
                initialize_nl_trie_name_string_preds();
            }
            return lexicon_vars.lex_pred_set_element_list($nl_trie_name_string_preds_set$.getGlobalValue());
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }

    public static SubLObject nl_trie_name_string_predP(final SubLObject pred) {
        if (NIL == lexicon_vars.lex_pred_set_p($nl_trie_name_string_preds_set$.getGlobalValue())) {
            $nl_trie_name_string_preds_set$.setGlobalValue(lexicon_vars.new_lex_pred_set());
        }
        final SubLObject rw_lock_var = locking_map.locking_map_lock($nl_trie_name_string_preds_set$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (NIL != lexicon_vars.lex_pred_set_uninitializedP($nl_trie_name_string_preds_set$.getGlobalValue())) {
                initialize_nl_trie_name_string_preds();
            }
            return lexicon_vars.lex_pred_set_memberP(pred, $nl_trie_name_string_preds_set$.getGlobalValue());
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }

    public static SubLObject nl_trie_pragmatic_predP(final SubLObject fort) {
        return isa.isa_in_any_mtP(fort, $$NLPragmaticPredicate_New);
    }

    public static SubLObject triefy_reifiable_function_extent(final SubLObject function) {
        return Mapping.mapcar(TRIEFY_NART, function_terms.narts_of_function(function));
    }

    public static SubLObject triefy_nart(final SubLObject nart) {
        SubLObject cdolist_list_var;
        final SubLObject strings = cdolist_list_var = pph_methods_lexicon.all_phrases_for_term(nart, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$141 = nl_trie_string_tokenize_multiple(cycl_string.cycl_string_to_utf8_string(string));
            SubLObject key = NIL;
            key = cdolist_list_var_$141.first();
            while (NIL != cdolist_list_var_$141) {
                nl_trie_insert_name(get_nl_trie(), key, nart);
                cdolist_list_var_$141 = cdolist_list_var_$141.rest();
                key = cdolist_list_var_$141.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject new_nl_trie_iterator(SubLObject v_nl_trie) {
        if (v_nl_trie == UNPROVIDED) {
            v_nl_trie = $nl_trie$.getGlobalValue();
        }
        assert NIL != nl_trie_p(v_nl_trie, UNPROVIDED) : "nl_trie.nl_trie_p(v_nl_trie, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != nl_trie.nl_trie_p(v_nl_trie, CommonSymbols.UNPROVIDED) " + v_nl_trie;
        return iteration.new_iterator(make_nl_trie_iterator_state(v_nl_trie), NL_TRIE_ITERATOR_DONE, NL_TRIE_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject make_nl_trie_iterator_state(final SubLObject v_nl_trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject is_current_nl_trie_p = eq(v_nl_trie, get_nl_trie());
        SubLObject iterator = NIL;
        if (NIL != is_current_nl_trie_p) {
            SubLObject release = NIL;
            try {
                release = seize_lock($nl_trie_lock$.getGlobalValue());
                final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                    file_vector_utilities.$current_backed_map_cache_strategy$.bind($nl_trie_cache_strategy$.getGlobalValue(), thread);
                    iterator = strie.new_strie_iterator(v_nl_trie);
                } finally {
                    file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                }
            } finally {
                if (NIL != release) {
                    release_lock($nl_trie_lock$.getGlobalValue());
                }
            }
        } else {
            iterator = strie.new_strie_iterator(v_nl_trie);
        }
        return list(iterator, is_current_nl_trie_p);
    }

    public static SubLObject nl_trie_iterator_done(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject iterator = NIL;
        SubLObject is_current_nl_trie_p = NIL;
        destructuring_bind_must_consp(state, state, $list405);
        iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list405);
        is_current_nl_trie_p = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != is_current_nl_trie_p) {
                SubLObject release = NIL;
                try {
                    release = seize_lock($nl_trie_lock$.getGlobalValue());
                    final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                        file_vector_utilities.$current_backed_map_cache_strategy$.bind($nl_trie_cache_strategy$.getGlobalValue(), thread);
                        result = iteration.iteration_done(iterator);
                    } finally {
                        file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock($nl_trie_lock$.getGlobalValue());
                    }
                }
            } else {
                result = iteration.iteration_done(iterator);
            }
        } else {
            cdestructuring_bind_error(state, $list405);
        }
        return result;
    }

    public static SubLObject nl_trie_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject next = NIL;
        SubLObject valid = NIL;
        SubLObject iterator = NIL;
        SubLObject is_current_nl_trie_p = NIL;
        destructuring_bind_must_consp(state, state, $list405);
        iterator = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list405);
        is_current_nl_trie_p = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != is_current_nl_trie_p) {
                SubLObject release = NIL;
                try {
                    release = seize_lock($nl_trie_lock$.getGlobalValue());
                    final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind($nl_trie_lock$.getGlobalValue(), thread);
                        file_vector_utilities.$current_backed_map_cache_strategy$.bind($nl_trie_cache_strategy$.getGlobalValue(), thread);
                        thread.resetMultipleValues();
                        final SubLObject next_$142 = iteration.iteration_next(iterator);
                        final SubLObject valid_$143 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        next = next_$142;
                        valid = valid_$143;
                    } finally {
                        file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock($nl_trie_lock$.getGlobalValue());
                    }
                }
            } else {
                thread.resetMultipleValues();
                final SubLObject next_$143 = iteration.iteration_next(iterator);
                final SubLObject valid_$144 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                next = next_$143;
                valid = valid_$144;
            }
        } else {
            cdestructuring_bind_error(state, $list405);
        }
        if (NIL == valid) {
            return values(NIL, state, T);
        }
        return values(next, state, NIL);
    }

    public static SubLObject test_swappable_nl_trie_dump(final SubLObject key_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_strie = strie.new_strie(UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject key = NIL;
        SubLObject index = NIL;
        list_var = key_list;
        key = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , key = list_var.first() , index = add(ONE_INTEGER, index)) {
            strie.strie_insert(v_strie, key, index);
        }
        final SubLObject temp_index_file = file_utilities.make_prefixed_temp_filename($$$index, UNPROVIDED);
        final SubLObject temp_data_file = file_utilities.make_prefixed_temp_filename($$$data, UNPROVIDED);
        SubLObject errmsg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject fvector = NIL;
                    try {
                        fvector = file_vector.new_file_vector(temp_data_file, temp_index_file, $OUTPUT, file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), UNPROVIDED);
                        dumper.dump_copyright(file_vector.get_file_vector_data_stream(fvector));
                        file_vector.update_file_vector_index_linear(fvector);
                        dumper.dump_copyright(file_vector.get_file_vector_data_stream(fvector));
                        final SubLObject v_context = dump_swappable_nl_trie_new_context(fvector);
                        final SubLObject visitor = new_swappable_nl_trie_dump_visitor(v_context);
                        strie.visit_strie_hierarchically(v_strie, visitor);
                    } finally {
                        final SubLObject _prev_bind_0_$146 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != file_vector.file_vector_p(fvector)) {
                                file_vector.close_file_vector(fvector);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$146, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            errmsg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    Filesys.delete_file(temp_index_file);
                } catch (final Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_2, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    Filesys.delete_file(temp_data_file);
                } catch (final Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_2, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (errmsg.isString()) {
            Errors.error($str423$_A, errmsg);
        }
        return $SUCCESS;
    }

    public static SubLObject declare_nl_trie_file() {
        declareMacro(me, "with_nl_trie_cache_strategy", "WITH-NL-TRIE-CACHE-STRATEGY");
        declareMacro(me, "without_nl_trie_cache_strategy", "WITHOUT-NL-TRIE-CACHE-STRATEGY");
        declareMacro(me, "with_nl_trie_lock_held", "WITH-NL-TRIE-LOCK-HELD");
        declareFunction(me, "nl_trie_entry_p", "NL-TRIE-ENTRY-P", 1, 0, false);
        declareFunction(me, "nl_trie_term_phrases_entry_p", "NL-TRIE-TERM-PHRASES-ENTRY-P", 1, 1, false);
        declareFunction(me, "valid_nl_trie_entry_p", "VALID-NL-TRIE-ENTRY-P", 1, 0, false);
        declareFunction(me, "validate_nl_trie_entry_internal", "VALIDATE-NL-TRIE-ENTRY-INTERNAL", 1, 0, false);
        declareFunction(me, "validate_nl_trie_entry", "VALIDATE-NL-TRIE-ENTRY", 1, 0, false);
        declareFunction(me, "nl_trie_lex_entry_p", "NL-TRIE-LEX-ENTRY-P", 1, 1, false);
        declareFunction(me, "validate_nl_trie_lex_entry", "VALIDATE-NL-TRIE-LEX-ENTRY", 1, 0, false);
        declareFunction(me, "nl_trie_lex_entry_get", "NL-TRIE-LEX-ENTRY-GET", 2, 0, false);
        declareFunction(me, "print_nl_trie_entry", "PRINT-NL-TRIE-ENTRY", 3, 0, false);
        declareFunction(me, "nl_trie_entry_type", "NL-TRIE-ENTRY-TYPE", 1, 0, false);
        declareFunction(me, "nl_trie_entry_string", "NL-TRIE-ENTRY-STRING", 1, 0, false);
        declareFunction(me, "nl_trie_entry_keys", "NL-TRIE-ENTRY-KEYS", 1, 1, false);
        declareMacro(me, "do_nl_trie_names_with_added_the", "DO-NL-TRIE-NAMES-WITH-ADDED-THE");
        declareFunction(me, "nl_trie_name_ok_for_adding_theP", "NL-TRIE-NAME-OK-FOR-ADDING-THE?", 3, 0, false);
        declareFunction(me, "string_is_non_name_nounP", "STRING-IS-NON-NAME-NOUN?", 1, 1, false);
        declareFunction(me, "nl_trie_dont_add_the_categories_internal", "NL-TRIE-DONT-ADD-THE-CATEGORIES-INTERNAL", 1, 0, false);
        declareFunction(me, "nl_trie_dont_add_the_categories", "NL-TRIE-DONT-ADD-THE-CATEGORIES", 1, 0, false);
        declareFunction(me, "nl_trie_name_denot_ok_for_adding_theP", "NL-TRIE-NAME-DENOT-OK-FOR-ADDING-THE?", 2, 0, false);
        declareFunction(me, "nl_trie_dont_add_the_term_p", "NL-TRIE-DONT-ADD-THE-TERM-P", 2, 0, false);
        declareFunction(me, "nl_trie_dont_add_the_terms_internal", "NL-TRIE-DONT-ADD-THE-TERMS-INTERNAL", 1, 0, false);
        declareFunction(me, "nl_trie_dont_add_the_terms", "NL-TRIE-DONT-ADD-THE-TERMS", 1, 0, false);
        declareFunction(me, "nl_trie_name_pred_ok_for_adding_theP_internal", "NL-TRIE-NAME-PRED-OK-FOR-ADDING-THE?-INTERNAL", 2, 0, false);
        declareFunction(me, "nl_trie_name_pred_ok_for_adding_theP", "NL-TRIE-NAME-PRED-OK-FOR-ADDING-THE?", 2, 0, false);
        declareFunction(me, "nl_trie_entry_pos", "NL-TRIE-ENTRY-POS", 1, 0, false);
        declareFunction(me, "nl_trie_entry_pos_preds", "NL-TRIE-ENTRY-POS-PREDS", 1, 0, false);
        declareFunction(me, "nl_trie_entry_denots", "NL-TRIE-ENTRY-DENOTS", 1, 0, false);
        declareFunction(me, "nl_trie_entry_preferred_denots", "NL-TRIE-ENTRY-PREFERRED-DENOTS", 1, 0, false);
        declareFunction(me, "nl_trie_entry_semtrans_templates", "NL-TRIE-ENTRY-SEMTRANS-TEMPLATES", 1, 0, false);
        declareMacro(me, "do_nl_trie_entry_denots", "DO-NL-TRIE-ENTRY-DENOTS");
        declareMacro(me, "do_nl_trie_entry_strings", "DO-NL-TRIE-ENTRY-STRINGS");
        declareFunction(me, "nl_trie_name_string_macro_helper", "NL-TRIE-NAME-STRING-MACRO-HELPER", 1, 0, false);
        declareMacro(me, "do_nl_trie_word_syntactic_supports", "DO-NL-TRIE-WORD-SYNTACTIC-SUPPORTS");
        declareMacro(me, "do_nl_trie_word_semantic_supports", "DO-NL-TRIE-WORD-SEMANTIC-SUPPORTS");
        declareFunction(me, "nl_trie_entry_semantic_pred", "NL-TRIE-ENTRY-SEMANTIC-PRED", 1, 1, false);
        declareFunction(me, "nl_trie_entry_mt", "NL-TRIE-ENTRY-MT", 1, 0, false);
        declareFunction(me, "nl_trie_entry_semantic_mt", "NL-TRIE-ENTRY-SEMANTIC-MT", 1, 0, false);
        declareFunction(me, "nl_trie_entry_semantic_support_set", "NL-TRIE-ENTRY-SEMANTIC-SUPPORT-SET", 1, 0, false);
        declareFunction(me, "nl_trie_entry_semantic_support_list", "NL-TRIE-ENTRY-SEMANTIC-SUPPORT-LIST", 1, 0, false);
        declareFunction(me, "nl_trie_insert_entry", "NL-TRIE-INSERT-ENTRY", 3, 0, false);
        declareFunction(me, "nl_trie_delete_entry", "NL-TRIE-DELETE-ENTRY", 3, 0, false);
        declareFunction(me, "nl_trie_entry_pragmatics", "NL-TRIE-ENTRY-PRAGMATICS", 1, 0, false);
        declareFunction(me, "nl_trie_word_semantic_support_pragmatics", "NL-TRIE-WORD-SEMANTIC-SUPPORT-PRAGMATICS", 1, 0, false);
        declareFunction(me, "nl_trie_entry_to_javalists", "NL-TRIE-ENTRY-TO-JAVALISTS", 1, 0, false);
        declareFunction(me, "javalist_string", "JAVALIST-STRING", 1, 0, false);
        declareFunction(me, "nl_trie_word_p", "NL-TRIE-WORD-P", 1, 1, false);
        declareFunction(me, "has_bad_syntactic_support_p", "HAS-BAD-SYNTACTIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "nl_trie_word_copy", "NL-TRIE-WORD-COPY", 1, 0, false);
        declareFunction(me, "nl_trie_word_support_p", "NL-TRIE-WORD-SUPPORT-P", 1, 0, false);
        declareFunction(me, "validate_nl_trie_word", "VALIDATE-NL-TRIE-WORD", 1, 1, false);
        declareFunction(me, "nl_trie_word_struc_valid_p_internal", "NL-TRIE-WORD-STRUC-VALID-P-INTERNAL", 1, 0, false);
        declareFunction(me, "nl_trie_word_struc_valid_p", "NL-TRIE-WORD-STRUC-VALID-P", 1, 0, false);
        declareFunction(me, "nl_trie_valid_assertionP", "NL-TRIE-VALID-ASSERTION?", 1, 0, false);
        declareFunction(me, "nl_trie_valid_assertionP_memoized_internal", "NL-TRIE-VALID-ASSERTION?-MEMOIZED-INTERNAL", 1, 1, false);
        declareFunction(me, "nl_trie_valid_assertionP_memoized", "NL-TRIE-VALID-ASSERTION?-MEMOIZED", 1, 1, false);
        declareFunction(me, "valid_nl_trie_word_syntactic_support_p", "VALID-NL-TRIE-WORD-SYNTACTIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "valid_nl_trie_word_semantic_support_p", "VALID-NL-TRIE-WORD-SEMANTIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "nl_trie_word_semantic_support_p", "NL-TRIE-WORD-SEMANTIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "nl_trie_word_syntactic_support_p", "NL-TRIE-WORD-SYNTACTIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "validate_nl_trie_word_semantic_support", "VALIDATE-NL-TRIE-WORD-SEMANTIC-SUPPORT", 1, 1, false);
        declareFunction(me, "nl_trie_word_hl_support_p", "NL-TRIE-WORD-HL-SUPPORT-P", 1, 0, false);
        declareFunction(me, "valid_nl_trie_word_hl_syntactic_support_p", "VALID-NL-TRIE-WORD-HL-SYNTACTIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "nl_trie_word_hl_syntactic_support_p", "NL-TRIE-WORD-HL-SYNTACTIC-SUPPORT-P", 1, 1, false);
        declareFunction(me, "nl_trie_justify_hl_syntactic_support", "NL-TRIE-JUSTIFY-HL-SYNTACTIC-SUPPORT", 1, 0, false);
        declareFunction(me, "nl_trie_word_hl_semantic_support_p", "NL-TRIE-WORD-HL-SEMANTIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "valid_nl_trie_word_hl_semantic_support_p", "VALID-NL-TRIE-WORD-HL-SEMANTIC-SUPPORT-P", 1, 1, false);
        declareFunction(me, "valid_nl_trie_word_denot_set_p", "VALID-NL-TRIE-WORD-DENOT-SET-P", 1, 0, false);
        declareFunction(me, "validate_nl_trie_word_hl_semantic_support", "VALIDATE-NL-TRIE-WORD-HL-SEMANTIC-SUPPORT", 1, 1, false);
        declareFunction(me, "validate_nl_trie_word_denot_set", "VALIDATE-NL-TRIE-WORD-DENOT-SET", 1, 0, false);
        declareFunction(me, "invalid_nl_trie_word_denotP", "INVALID-NL-TRIE-WORD-DENOT?", 1, 0, false);
        declareFunction(me, "nl_trie_denot_has_invalid_constantP", "NL-TRIE-DENOT-HAS-INVALID-CONSTANT?", 1, 0, false);
        declareFunction(me, "find_or_create_nl_trie_word_syn_support", "FIND-OR-CREATE-NL-TRIE-WORD-SYN-SUPPORT", 2, 1, false);
        declareFunction(me, "nl_trie_find_syntactic_support", "NL-TRIE-FIND-SYNTACTIC-SUPPORT", 3, 0, false);
        declareFunction(me, "new_nl_trie_word_hl_syn_support", "NEW-NL-TRIE-WORD-HL-SYN-SUPPORT", 2, 0, false);
        declareFunction(me, "make_nl_trie_word_hl_syn_support", "MAKE-NL-TRIE-WORD-HL-SYN-SUPPORT", 2, 0, false);
        declareFunction(me, "new_nl_trie_word_hl_sem_support", "NEW-NL-TRIE-WORD-HL-SEM-SUPPORT", 2, 0, false);
        declareFunction(me, "nl_trie_semantic_support_from_denots", "NL-TRIE-SEMANTIC-SUPPORT-FROM-DENOTS", 2, 0, false);
        declareFunction(me, "nl_trie_word_support_sentence", "NL-TRIE-WORD-SUPPORT-SENTENCE", 1, 0, false);
        declareFunction(me, "nl_trie_word_support_mt", "NL-TRIE-WORD-SUPPORT-MT", 1, 0, false);
        declareFunction(me, "nl_trie_word_support_predicate", "NL-TRIE-WORD-SUPPORT-PREDICATE", 1, 0, false);
        declareFunction(me, "nl_trie_word_struc_print_function_trampoline", "NL-TRIE-WORD-STRUC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "nl_trie_word_struc_p", "NL-TRIE-WORD-STRUC-P", 1, 0, false);
        new nl_trie.$nl_trie_word_struc_p$UnaryFunction();
        declareFunction(me, "nl_trie_word_struc_syntactic_supports", "NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS", 1, 0, false);
        declareFunction(me, "nl_trie_word_struc_semantic_supports", "NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS", 1, 0, false);
        declareFunction(me, "_csetf_nl_trie_word_struc_syntactic_supports", "_CSETF-NL-TRIE-WORD-STRUC-SYNTACTIC-SUPPORTS", 2, 0, false);
        declareFunction(me, "_csetf_nl_trie_word_struc_semantic_supports", "_CSETF-NL-TRIE-WORD-STRUC-SEMANTIC-SUPPORTS", 2, 0, false);
        declareFunction(me, "make_nl_trie_word_struc", "MAKE-NL-TRIE-WORD-STRUC", 0, 1, false);
        declareFunction(me, "visit_defstruct_nl_trie_word_struc", "VISIT-DEFSTRUCT-NL-TRIE-WORD-STRUC", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_nl_trie_word_struc_method", "VISIT-DEFSTRUCT-OBJECT-NL-TRIE-WORD-STRUC-METHOD", 2, 0, false);
        declareFunction(me, "sxhash_nl_trie_word_struc_method", "SXHASH-NL-TRIE-WORD-STRUC-METHOD", 1, 0, false);
        new nl_trie.$sxhash_nl_trie_word_struc_method$UnaryFunction();
        declareFunction(me, "pprint_nl_trie_word_struc", "PPRINT-NL-TRIE-WORD-STRUC", 3, 0, false);
        declareFunction(me, "cfasl_input_nl_trie_word_struc", "CFASL-INPUT-NL-TRIE-WORD-STRUC", 1, 0, false);
        new nl_trie.$cfasl_input_nl_trie_word_struc$UnaryFunction();
        declareFunction(me, "cfasl_output_nl_trie_word_struc", "CFASL-OUTPUT-NL-TRIE-WORD-STRUC", 2, 0, false);
        declareFunction(me, "cfasl_output_object_nl_trie_word_struc_method", "CFASL-OUTPUT-OBJECT-NL-TRIE-WORD-STRUC-METHOD", 2, 0, false);
        declareFunction(me, "nl_trie_word_valid_semantic_support_set_p", "NL-TRIE-WORD-VALID-SEMANTIC-SUPPORT-SET-P", 1, 0, false);
        declareFunction(me, "new_nl_trie_word_semantic_support_set", "NEW-NL-TRIE-WORD-SEMANTIC-SUPPORT-SET", 0, 1, false);
        declareFunction(me, "nl_trie_word_valid_syntactic_support_set_p", "NL-TRIE-WORD-VALID-SYNTACTIC-SUPPORT-SET-P", 1, 0, false);
        declareFunction(me, "new_nl_trie_word_syntactic_support_set", "NEW-NL-TRIE-WORD-SYNTACTIC-SUPPORT-SET", 0, 1, false);
        declareFunction(me, "new_nl_trie_word_for_syntactic_support", "NEW-NL-TRIE-WORD-FOR-SYNTACTIC-SUPPORT", 1, 0, false);
        declareFunction(me, "new_nl_trie_word", "NEW-NL-TRIE-WORD", 1, 1, false);
        declareFunction(me, "nl_trie_word_set_syn_supports", "NL-TRIE-WORD-SET-SYN-SUPPORTS", 2, 0, false);
        declareFunction(me, "nl_trie_word_set_sem_supports", "NL-TRIE-WORD-SET-SEM-SUPPORTS", 2, 0, false);
        declareFunction(me, "nl_trie_syntactic_support_p", "NL-TRIE-SYNTACTIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "nl_trie_valid_syntactic_support_pred_p", "NL-TRIE-VALID-SYNTACTIC-SUPPORT-PRED-P", 1, 0, false);
        declareFunction(me, "nl_trie_semantic_support_p", "NL-TRIE-SEMANTIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "nl_trie_valid_semantic_support_p", "NL-TRIE-VALID-SEMANTIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "nl_trie_word_arbitrary_syntactic_support", "NL-TRIE-WORD-ARBITRARY-SYNTACTIC-SUPPORT", 1, 0, false);
        declareFunction(me, "nl_trie_word_syntactic_support_list", "NL-TRIE-WORD-SYNTACTIC-SUPPORT-LIST", 1, 0, false);
        declareFunction(me, "nl_trie_word_syntactic_support_set", "NL-TRIE-WORD-SYNTACTIC-SUPPORT-SET", 1, 0, false);
        declareFunction(me, "nl_trie_word_syntactic_supports", "NL-TRIE-WORD-SYNTACTIC-SUPPORTS", 1, 0, false);
        declareFunction(me, "nl_trie_word_semantic_support_list", "NL-TRIE-WORD-SEMANTIC-SUPPORT-LIST", 1, 0, false);
        declareFunction(me, "nl_trie_word_semantic_support_set", "NL-TRIE-WORD-SEMANTIC-SUPPORT-SET", 1, 0, false);
        declareFunction(me, "nl_trie_word_semantic_supports", "NL-TRIE-WORD-SEMANTIC-SUPPORTS", 1, 0, false);
        declareFunction(me, "nl_trie_word_arbitrary_semantic_support", "NL-TRIE-WORD-ARBITRARY-SEMANTIC-SUPPORT", 1, 0, false);
        declareFunction(me, "nl_trie_word_has_syntactic_support_p", "NL-TRIE-WORD-HAS-SYNTACTIC-SUPPORT-P", 2, 1, false);
        declareFunction(me, "nl_trie_word_add_syntactic_support", "NL-TRIE-WORD-ADD-SYNTACTIC-SUPPORT", 2, 1, false);
        declareFunction(me, "nl_trie_word_remove_implied_hl_syntactic_supports", "NL-TRIE-WORD-REMOVE-IMPLIED-HL-SYNTACTIC-SUPPORTS", 1, 0, false);
        declareFunction(me, "nl_trie_word_remove_syntactic_support", "NL-TRIE-WORD-REMOVE-SYNTACTIC-SUPPORT", 2, 0, false);
        declareFunction(me, "nl_trie_word_has_semantic_support_p", "NL-TRIE-WORD-HAS-SEMANTIC-SUPPORT-P", 2, 0, false);
        declareFunction(me, "nl_trie_word_semantic_support_equalP", "NL-TRIE-WORD-SEMANTIC-SUPPORT-EQUAL?", 2, 0, false);
        declareFunction(me, "nl_trie_word_add_semantic_support", "NL-TRIE-WORD-ADD-SEMANTIC-SUPPORT", 2, 0, false);
        declareFunction(me, "nl_trie_word_spliceable_semantic_support_p", "NL-TRIE-WORD-SPLICEABLE-SEMANTIC-SUPPORT-P", 1, 0, false);
        declareFunction(me, "do_nl_trie_word_add_semantic_support", "DO-NL-TRIE-WORD-ADD-SEMANTIC-SUPPORT", 2, 0, false);
        declareFunction(me, "nl_trie_word_hl_semantic_supports_unifiable_p", "NL-TRIE-WORD-HL-SEMANTIC-SUPPORTS-UNIFIABLE-P", 2, 0, false);
        declareFunction(me, "nl_trie_word_hl_semantic_support_denots", "NL-TRIE-WORD-HL-SEMANTIC-SUPPORT-DENOTS", 1, 0, false);
        declareFunction(me, "nl_trie_word_hl_semantic_support_set_denots", "NL-TRIE-WORD-HL-SEMANTIC-SUPPORT-SET-DENOTS", 2, 0, false);
        declareFunction(me, "nl_trie_word_semantic_support_denots_internal", "NL-TRIE-WORD-SEMANTIC-SUPPORT-DENOTS-INTERNAL", 1, 1, false);
        declareFunction(me, "nl_trie_word_semantic_support_denots", "NL-TRIE-WORD-SEMANTIC-SUPPORT-DENOTS", 1, 1, false);
        declareFunction(me, "nl_trie_word_semantic_support_semtrans_templates_internal", "NL-TRIE-WORD-SEMANTIC-SUPPORT-SEMTRANS-TEMPLATES-INTERNAL", 1, 1, false);
        declareFunction(me, "nl_trie_word_semantic_support_semtrans_templates", "NL-TRIE-WORD-SEMANTIC-SUPPORT-SEMTRANS-TEMPLATES", 1, 1, false);
        declareFunction(me, "nl_trie_word_remove_semantic_support", "NL-TRIE-WORD-REMOVE-SEMANTIC-SUPPORT", 2, 0, false);
        declareFunction(me, "nl_trie_word_pos_preds", "NL-TRIE-WORD-POS-PREDS", 1, 0, false);
        declareFunction(me, "nl_trie_word_syntactic_support_abbreviation_p", "NL-TRIE-WORD-SYNTACTIC-SUPPORT-ABBREVIATION-P", 1, 0, false);
        declareFunction(me, "nl_trie_word_syntactic_support_pos_preds", "NL-TRIE-WORD-SYNTACTIC-SUPPORT-POS-PREDS", 1, 0, false);
        declareFunction(me, "clear_nl_trie_closed_class_pos_preds", "CLEAR-NL-TRIE-CLOSED-CLASS-POS-PREDS", 0, 0, false);
        declareFunction(me, "remove_nl_trie_closed_class_pos_preds", "REMOVE-NL-TRIE-CLOSED-CLASS-POS-PREDS", 1, 1, false);
        declareFunction(me, "nl_trie_closed_class_pos_preds_internal", "NL-TRIE-CLOSED-CLASS-POS-PREDS-INTERNAL", 2, 0, false);
        declareFunction(me, "nl_trie_closed_class_pos_preds", "NL-TRIE-CLOSED-CLASS-POS-PREDS", 1, 1, false);
        declareFunction(me, "nl_trie_const_arg_of_pred", "NL-TRIE-CONST-ARG-OF-PRED", 1, 0, false);
        declareFunction(me, "nl_trie_word_syn_pred_string_arg", "NL-TRIE-WORD-SYN-PRED-STRING-ARG", 1, 0, false);
        declareFunction(me, "nl_trie_abbr_arg_of_pred", "NL-TRIE-ABBR-ARG-OF-PRED", 1, 0, false);
        declareFunction(me, "nl_trie_word_pos_internal", "NL-TRIE-WORD-POS-INTERNAL", 1, 0, false);
        declareFunction(me, "nl_trie_word_pos", "NL-TRIE-WORD-POS", 1, 0, false);
        declareFunction(me, "nl_trie_word_word_unit", "NL-TRIE-WORD-WORD-UNIT", 1, 1, false);
        declareFunction(me, "nl_trie_word_frame", "NL-TRIE-WORD-FRAME", 1, 0, false);
        declareFunction(me, "nl_trie_word_semantic_support_frame", "NL-TRIE-WORD-SEMANTIC-SUPPORT-FRAME", 1, 0, false);
        declareMacro(me, "do_nl_trie_word_denots", "DO-NL-TRIE-WORD-DENOTS");
        declareFunction(me, "nl_trie_preferred_semantic_supportP", "NL-TRIE-PREFERRED-SEMANTIC-SUPPORT?", 1, 0, false);
        declareFunction(me, "nl_trie_preferred_semantic_predicate_p", "NL-TRIE-PREFERRED-SEMANTIC-PREDICATE-P", 1, 0, false);
        declareFunction(me, "nl_trie_preferred_lexical_assertionP", "NL-TRIE-PREFERRED-LEXICAL-ASSERTION?", 1, 0, false);
        declareFunction(me, "nl_trie_preferred_meta_assertionP", "NL-TRIE-PREFERRED-META-ASSERTION?", 1, 0, false);
        declareMacro(me, "do_nl_trie_word_semtrans_templates", "DO-NL-TRIE-WORD-SEMTRANS-TEMPLATES");
        declareMacro(me, "do_nl_trie_word_strings", "DO-NL-TRIE-WORD-STRINGS");
        declareFunction(me, "nl_trie_word_head_string_macro_helper", "NL-TRIE-WORD-HEAD-STRING-MACRO-HELPER", 1, 0, false);
        declareFunction(me, "nl_trie_word_leading_strings_from_support_macro_helper", "NL-TRIE-WORD-LEADING-STRINGS-FROM-SUPPORT-MACRO-HELPER", 1, 0, false);
        declareFunction(me, "nl_trie_word_following_strings_from_support_macro_helper", "NL-TRIE-WORD-FOLLOWING-STRINGS-FROM-SUPPORT-MACRO-HELPER", 1, 0, false);
        declareFunction(me, "nl_trie_assemble_strings_macro_helper", "NL-TRIE-ASSEMBLE-STRINGS-MACRO-HELPER", 3, 0, false);
        declareFunction(me, "nl_trie_word_string", "NL-TRIE-WORD-STRING", 1, 0, false);
        declareFunction(me, "nl_trie_word_head_string", "NL-TRIE-WORD-HEAD-STRING", 1, 0, false);
        declareFunction(me, "nl_trie_syntactic_support_string", "NL-TRIE-SYNTACTIC-SUPPORT-STRING", 1, 0, false);
        declareFunction(me, "nl_trie_word_leading_strings", "NL-TRIE-WORD-LEADING-STRINGS", 1, 0, false);
        declareFunction(me, "nl_trie_word_leading_strings_from_support", "NL-TRIE-WORD-LEADING-STRINGS-FROM-SUPPORT", 1, 0, false);
        declareFunction(me, "nl_trie_word_following_strings", "NL-TRIE-WORD-FOLLOWING-STRINGS", 1, 0, false);
        declareFunction(me, "nl_trie_word_following_strings_from_support", "NL-TRIE-WORD-FOLLOWING-STRINGS-FROM-SUPPORT", 1, 0, false);
        declareFunction(me, "nl_trie_word_head_onlyP", "NL-TRIE-WORD-HEAD-ONLY?", 1, 0, false);
        declareFunction(me, "nl_trie_head_locations_in_lexical_string", "NL-TRIE-HEAD-LOCATIONS-IN-LEXICAL-STRING", 1, 0, false);
        declareFunction(me, "nl_trie_word_sem_pred", "NL-TRIE-WORD-SEM-PRED", 1, 1, false);
        declareFunction(me, "nl_trie_word_denots", "NL-TRIE-WORD-DENOTS", 1, 0, false);
        declareFunction(me, "nl_trie_word_preferred_denots", "NL-TRIE-WORD-PREFERRED-DENOTS", 1, 0, false);
        declareFunction(me, "nl_trie_word_semtrans_templates", "NL-TRIE-WORD-SEMTRANS-TEMPLATES", 1, 0, false);
        declareFunction(me, "nl_trie_word_syntax_mt", "NL-TRIE-WORD-SYNTAX-MT", 1, 0, false);
        declareFunction(me, "nl_trie_word_semantics_mt", "NL-TRIE-WORD-SEMANTICS-MT", 1, 0, false);
        declareFunction(me, "print_nl_trie_word", "PRINT-NL-TRIE-WORD", 3, 0, false);
        declareFunction(me, "print_nl_trie_name", "PRINT-NL-TRIE-NAME", 3, 0, false);
        declareFunction(me, "nl_trie_name_p", "NL-TRIE-NAME-P", 1, 1, false);
        declareFunction(me, "validate_nl_trie_name", "VALIDATE-NL-TRIE-NAME", 1, 0, false);
        declareFunction(me, "validate_nl_trie_term_phrases_entry", "VALIDATE-NL-TRIE-TERM-PHRASES-ENTRY", 1, 0, false);
        declareFunction(me, "nl_trie_name_pred", "NL-TRIE-NAME-PRED", 1, 0, false);
        declareFunction(me, "nl_trie_name_denot", "NL-TRIE-NAME-DENOT", 1, 0, false);
        declareFunction(me, "nl_trie_name_preferred_denots", "NL-TRIE-NAME-PREFERRED-DENOTS", 1, 0, false);
        declareFunction(me, "nl_trie_name_string", "NL-TRIE-NAME-STRING", 1, 0, false);
        declareFunction(me, "nl_trie_record_p_internal", "NL-TRIE-RECORD-P-INTERNAL", 1, 0, false);
        declareFunction(me, "nl_trie_record_p", "NL-TRIE-RECORD-P", 1, 0, false);
        declareFunction(me, "new_nl_trie_record", "NEW-NL-TRIE-RECORD", 2, 0, false);
        declareFunction(me, "nl_trie_record_key", "NL-TRIE-RECORD-KEY", 1, 0, false);
        declareFunction(me, "nl_trie_record_entries", "NL-TRIE-RECORD-ENTRIES", 1, 0, false);
        declareFunction(me, "valid_nl_trie_record_key_p", "VALID-NL-TRIE-RECORD-KEY-P", 1, 0, false);
        declareFunction(me, "valid_nl_trie_record_entries_p", "VALID-NL-TRIE-RECORD-ENTRIES-P", 1, 0, false);
        declareFunction(me, "nl_trie_syntactic_predicates", "NL-TRIE-SYNTACTIC-PREDICATES", 0, 0, false);
        declareFunction(me, "nl_trie_denotation_predicates", "NL-TRIE-DENOTATION-PREDICATES", 0, 0, false);
        declareFunction(me, "nl_trie_semtrans_predicates", "NL-TRIE-SEMTRANS-PREDICATES", 0, 0, false);
        declareFunction(me, "nl_trie_abbreviation_predicates", "NL-TRIE-ABBREVIATION-PREDICATES", 0, 0, false);
        declareFunction(me, "nl_trie_arg_in_reln_predicates", "NL-TRIE-ARG-IN-RELN-PREDICATES", 0, 0, false);
        declareFunction(me, "nl_trie_pragmatic_predicates", "NL-TRIE-PRAGMATIC-PREDICATES", 0, 0, false);
        declareMacro(me, "initializing_nl_trie", "INITIALIZING-NL-TRIE");
        declareFunction(me, "nl_trie_being_initializedP", "NL-TRIE-BEING-INITIALIZED?", 0, 1, false);
        declareFunction(me, "new_nl_trie", "NEW-NL-TRIE", 0, 1, false);
        declareFunction(me, "nl_trie_p", "NL-TRIE-P", 1, 1, false);
        declareFunction(me, "nl_trie_presentP", "NL-TRIE-PRESENT?", 0, 1, false);
        declareFunction(me, "get_nl_trie", "GET-NL-TRIE", 0, 0, false);
        declareFunction(me, "nl_trie_size", "NL-TRIE-SIZE", 0, 1, false);
        declareFunction(me, "nl_trie_keys", "NL-TRIE-KEYS", 0, 1, false);
        declareFunction(me, "empty_nl_trieP", "EMPTY-NL-TRIE?", 0, 1, false);
        declareMacro(me, "do_nl_trie", "DO-NL-TRIE");
        declareMacro(me, "do_nl_trie_progress", "DO-NL-TRIE-PROGRESS");
        declareFunction(me, "nl_trie_entry_count", "NL-TRIE-ENTRY-COUNT", 0, 1, false);
        declareFunction(me, "copy_nl_trie", "COPY-NL-TRIE", 2, 0, false);
        declareFunction(me, "clear_nl_trie", "CLEAR-NL-TRIE", 0, 1, false);
        declareFunction(me, "swap_out_all_pristine_nl_trie_entries", "SWAP-OUT-ALL-PRISTINE-NL-TRIE-ENTRIES", 0, 2, false);
        declareFunction(me, "initialize_nl_trie", "INITIALIZE-NL-TRIE", 0, 5, false);
        declareFunction(me, "nl_trie_entries_for_string", "NL-TRIE-ENTRIES-FOR-STRING", 1, 1, false);
        declareFunction(me, "nl_trie_search", "NL-TRIE-SEARCH", 1, 2, false);
        declareFunction(me, "nl_trie_case_sensitive_p", "NL-TRIE-CASE-SENSITIVE-P", 0, 1, false);
        declareFunction(me, "nl_trie_search_case_sensitive_internal", "NL-TRIE-SEARCH-CASE-SENSITIVE-INTERNAL", 2, 0, false);
        declareFunction(me, "nl_trie_search_case_sensitive", "NL-TRIE-SEARCH-CASE-SENSITIVE", 2, 0, false);
        declareFunction(me, "nl_trie_search_case_insensitive_internal", "NL-TRIE-SEARCH-CASE-INSENSITIVE-INTERNAL", 2, 0, false);
        declareFunction(me, "nl_trie_search_case_insensitive", "NL-TRIE-SEARCH-CASE-INSENSITIVE", 2, 0, false);
        declareFunction(me, "nl_trie_search_case_sensitive_preferred_internal", "NL-TRIE-SEARCH-CASE-SENSITIVE-PREFERRED-INTERNAL", 2, 0, false);
        declareFunction(me, "nl_trie_search_case_sensitive_preferred", "NL-TRIE-SEARCH-CASE-SENSITIVE-PREFERRED", 2, 0, false);
        declareFunction(me, "nl_trie_search_int", "NL-TRIE-SEARCH-INT", 1, 2, false);
        declareFunction(me, "augment_nl_trie_syntactic", "AUGMENT-NL-TRIE-SYNTACTIC", 1, 1, false);
        declareFunction(me, "prune_nl_trie_syntactic", "PRUNE-NL-TRIE-SYNTACTIC", 1, 1, false);
        declareFunction(me, "augment_nl_trie_semantic", "AUGMENT-NL-TRIE-SEMANTIC", 1, 1, false);
        declareFunction(me, "prune_nl_trie_semantic", "PRUNE-NL-TRIE-SEMANTIC", 1, 1, false);
        declareFunction(me, "retriefy_semantic_assertion", "RETRIEFY-SEMANTIC-ASSERTION", 1, 1, false);
        declareMacro(me, "nl_trie_carefully_load_global", "NL-TRIE-CAREFULLY-LOAD-GLOBAL");
        declareFunction(me, "load_nl_trie_from_lexicon_cache", "LOAD-NL-TRIE-FROM-LEXICON-CACHE", 1, 0, false);
        declareFunction(me, "dump_nl_trie_to_lexicon_cache", "DUMP-NL-TRIE-TO-LEXICON-CACHE", 1, 0, false);
        declareFunction(me, "load_nl_trie_completion_index", "LOAD-NL-TRIE-COMPLETION-INDEX", 1, 0, false);
        declareFunction(me, "dump_nl_trie_completion_index", "DUMP-NL-TRIE-COMPLETION-INDEX", 1, 0, false);
        declareFunction(me, "reconnect_nl_trie_backing", "RECONNECT-NL-TRIE-BACKING", 2, 0, false);
        declareFunction(me, "reconnect_nl_trie_to_file_vector_files", "RECONNECT-NL-TRIE-TO-FILE-VECTOR-FILES", 2, 1, false);
        declareFunction(me, "dump_swappable_nl_trie_to_lexicon_cache", "DUMP-SWAPPABLE-NL-TRIE-TO-LEXICON-CACHE", 2, 0, false);
        declareFunction(me, "new_swappable_nl_trie_dump_visitor", "NEW-SWAPPABLE-NL-TRIE-DUMP-VISITOR", 1, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_visitor_begin_visit", "DUMP-SWAPPABLE-NL-TRIE-VISITOR-BEGIN-VISIT", 1, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_visitor_end_visit", "DUMP-SWAPPABLE-NL-TRIE-VISITOR-END-VISIT", 1, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_visitor_begin_path", "DUMP-SWAPPABLE-NL-TRIE-VISITOR-BEGIN-PATH", 2, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_visitor_end_path", "DUMP-SWAPPABLE-NL-TRIE-VISITOR-END-PATH", 2, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_visitor_accept_node", "DUMP-SWAPPABLE-NL-TRIE-VISITOR-ACCEPT-NODE", 2, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_new_context", "DUMP-SWAPPABLE-NL-TRIE-NEW-CONTEXT", 1, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_valid_initial_context", "DUMP-SWAPPABLE-NL-TRIE-VALID-INITIAL-CONTEXT", 1, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_valid_final_context", "DUMP-SWAPPABLE-NL-TRIE-VALID-FINAL-CONTEXT", 1, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_get_current_map", "DUMP-SWAPPABLE-NL-TRIE-GET-CURRENT-MAP", 1, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_get_file_vector", "DUMP-SWAPPABLE-NL-TRIE-GET-FILE-VECTOR", 1, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_pop_current_map", "DUMP-SWAPPABLE-NL-TRIE-POP-CURRENT-MAP", 2, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_push_new_current_map", "DUMP-SWAPPABLE-NL-TRIE-PUSH-NEW-CURRENT-MAP", 2, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_get_final_result", "DUMP-SWAPPABLE-NL-TRIE-GET-FINAL-RESULT", 1, 0, false);
        declareFunction(me, "dump_swappable_nl_trie_set_final_result", "DUMP-SWAPPABLE-NL-TRIE-SET-FINAL-RESULT", 2, 0, false);
        declareFunction(me, "nl_trie_lookup", "NL-TRIE-LOOKUP", 2, 1, false);
        declareFunction(me, "nl_trie_validate_all_entries", "NL-TRIE-VALIDATE-ALL-ENTRIES", 0, 0, false);
        declareFunction(me, "nl_trie_remove_invalid_entries", "NL-TRIE-REMOVE-INVALID-ENTRIES", 3, 0, false);
        declareFunction(me, "nl_trie_remaining_entries", "NL-TRIE-REMAINING-ENTRIES", 2, 0, false);
        declareFunction(me, "nl_trie_filter_entries_for_case", "NL-TRIE-FILTER-ENTRIES-FOR-CASE", 2, 0, false);
        declareFunction(me, "nl_trie_entry_case_matches_keyP", "NL-TRIE-ENTRY-CASE-MATCHES-KEY?", 2, 0, false);
        declareFunction(me, "clear_nl_trie_caches", "CLEAR-NL-TRIE-CACHES", 0, 0, false);
        declareFunction(me, "initialize_nl_trie_control_vars", "INITIALIZE-NL-TRIE-CONTROL-VARS", 0, 0, false);
        declareFunction(me, "initialize_nl_trie_syntactic_predicates", "INITIALIZE-NL-TRIE-SYNTACTIC-PREDICATES", 0, 0, false);
        declareFunction(me, "initialize_nl_trie_denotation_predicates", "INITIALIZE-NL-TRIE-DENOTATION-PREDICATES", 0, 0, false);
        declareFunction(me, "initialize_nl_trie_other_predicates", "INITIALIZE-NL-TRIE-OTHER-PREDICATES", 0, 0, false);
        declareFunction(me, "nl_trie_semtrans_pred_has_pos_specificationP", "NL-TRIE-SEMTRANS-PRED-HAS-POS-SPECIFICATION?", 1, 0, false);
        new nl_trie.$nl_trie_semtrans_pred_has_pos_specificationP$UnaryFunction();
        declareFunction(me, "nl_trie_abbreviation_pred_p", "NL-TRIE-ABBREVIATION-PRED-P", 1, 0, false);
        declareFunction(me, "nl_trie_multi_word_abbreviation_pred_p", "NL-TRIE-MULTI-WORD-ABBREVIATION-PRED-P", 1, 0, false);
        declareFunction(me, "clear_nl_trie_multi_word_abbreviation_preds", "CLEAR-NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS", 0, 0, false);
        declareFunction(me, "remove_nl_trie_multi_word_abbreviation_preds", "REMOVE-NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS", 0, 0, false);
        declareFunction(me, "nl_trie_multi_word_abbreviation_preds_internal", "NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS-INTERNAL", 0, 0, false);
        declareFunction(me, "nl_trie_multi_word_abbreviation_preds", "NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS", 0, 0, false);
        declareFunction(me, "initialize_nl_trie_pragmatic_predicates", "INITIALIZE-NL-TRIE-PRAGMATIC-PREDICATES", 0, 0, false);
        declareFunction(me, "nl_trie_syntactic_assertionP", "NL-TRIE-SYNTACTIC-ASSERTION?", 1, 0, false);
        declareFunction(me, "nl_trie_semantic_assertionP", "NL-TRIE-SEMANTIC-ASSERTION?", 1, 0, false);
        declareFunction(me, "initialize_nl_trie_int", "INITIALIZE-NL-TRIE-INT", 0, 1, false);
        declareFunction(me, "nl_triefy_preds", "NL-TRIEFY-PREDS", 1, 1, false);
        declareFunction(me, "triefy_mt", "TRIEFY-MT", 1, 1, false);
        declareFunction(me, "triefy_mt_int", "TRIEFY-MT-INT", 2, 1, false);
        declareFunction(me, "nl_triefy_pred", "NL-TRIEFY-PRED", 1, 4, false);
        declareFunction(me, "nl_trie_clear_pred", "NL-TRIE-CLEAR-PRED", 1, 0, false);
        declareFunction(me, "nl_trie_remove_entries_wXpred", "NL-TRIE-REMOVE-ENTRIES-W/PRED", 2, 0, false);
        declareFunction(me, "ok_assertion_for_nl_trieP", "OK-ASSERTION-FOR-NL-TRIE?", 1, 0, false);
        declareFunction(me, "nl_trie_return_keyword", "NL-TRIE-RETURN-KEYWORD", 1, 1, false);
        declareFunction(me, "update_nl_trie_syntactic", "UPDATE-NL-TRIE-SYNTACTIC", 1, 2, false);
        declareFunction(me, "nl_trie_ok_trie_and_assertionP", "NL-TRIE-OK-TRIE-AND-ASSERTION?", 2, 0, false);
        declareFunction(me, "nl_triefy_spp_assertion", "NL-TRIEFY-SPP-ASSERTION", 3, 0, false);
        declareFunction(me, "unique_irregular_form_assertionP", "UNIQUE-IRREGULAR-FORM-ASSERTION?", 1, 0, false);
        declareFunction(me, "nl_trie_get_irregular_forms", "NL-TRIE-GET-IRREGULAR-FORMS", 3, 0, false);
        declareFunction(me, "clear_nl_trie_spec_predicates", "CLEAR-NL-TRIE-SPEC-PREDICATES", 0, 0, false);
        declareFunction(me, "remove_nl_trie_spec_predicates", "REMOVE-NL-TRIE-SPEC-PREDICATES", 2, 0, false);
        declareFunction(me, "nl_trie_spec_predicates_internal", "NL-TRIE-SPEC-PREDICATES-INTERNAL", 2, 0, false);
        declareFunction(me, "nl_trie_spec_predicates", "NL-TRIE-SPEC-PREDICATES", 2, 0, false);
        declareFunction(me, "nl_trie_clean_up_regular_forms", "NL-TRIE-CLEAN-UP-REGULAR-FORMS", 3, 0, false);
        declareFunction(me, "nl_trie_asserted_word_formP", "NL-TRIE-ASSERTED-WORD-FORM?", 4, 0, false);
        declareFunction(me, "nl_trie_clean_up_one_regular_form", "NL-TRIE-CLEAN-UP-ONE-REGULAR-FORM", 4, 0, false);
        declareFunction(me, "find_mod_list", "FIND-MOD-LIST", 2, 0, false);
        declareFunction(me, "nl_triefy_pos_assertion", "NL-TRIEFY-POS-ASSERTION", 3, 0, false);
        declareFunction(me, "update_nl_trie_semantic_on_wu", "UPDATE-NL-TRIE-SEMANTIC-ON-WU", 4, 1, false);
        declareFunction(me, "update_nl_trie_semantic_on_wu_for_pred", "UPDATE-NL-TRIE-SEMANTIC-ON-WU-FOR-PRED", 6, 0, false);
        declareFunction(me, "update_nl_trie_semantic_assertion", "UPDATE-NL-TRIE-SEMANTIC-ASSERTION", 6, 0, false);
        declareFunction(me, "clear_nl_trie_pos_for_semtrans_pred", "CLEAR-NL-TRIE-POS-FOR-SEMTRANS-PRED", 0, 0, false);
        declareFunction(me, "remove_nl_trie_pos_for_semtrans_pred", "REMOVE-NL-TRIE-POS-FOR-SEMTRANS-PRED", 1, 1, false);
        declareFunction(me, "nl_trie_pos_for_semtrans_pred_internal", "NL-TRIE-POS-FOR-SEMTRANS-PRED-INTERNAL", 2, 0, false);
        declareFunction(me, "nl_trie_pos_for_semtrans_pred", "NL-TRIE-POS-FOR-SEMTRANS-PRED", 1, 1, false);
        declareFunction(me, "filter_mod_list_for_pos", "FILTER-MOD-LIST-FOR-POS", 2, 0, false);
        declareFunction(me, "clear_nl_trie_pred_ok_for_posP", "CLEAR-NL-TRIE-PRED-OK-FOR-POS?", 0, 0, false);
        declareFunction(me, "remove_nl_trie_pred_ok_for_posP", "REMOVE-NL-TRIE-PRED-OK-FOR-POS?", 2, 0, false);
        declareFunction(me, "nl_trie_pred_ok_for_posP_internal", "NL-TRIE-PRED-OK-FOR-POS?-INTERNAL", 2, 0, false);
        declareFunction(me, "nl_trie_pred_ok_for_posP", "NL-TRIE-PRED-OK-FOR-POS?", 2, 0, false);
        declareFunction(me, "clear_nl_trie_preds_licensed_by_pos", "CLEAR-NL-TRIE-PREDS-LICENSED-BY-POS", 0, 0, false);
        declareFunction(me, "remove_nl_trie_preds_licensed_by_pos", "REMOVE-NL-TRIE-PREDS-LICENSED-BY-POS", 1, 0, false);
        declareFunction(me, "nl_trie_preds_licensed_by_pos_internal", "NL-TRIE-PREDS-LICENSED-BY-POS-INTERNAL", 1, 0, false);
        declareFunction(me, "nl_trie_preds_licensed_by_pos", "NL-TRIE-PREDS-LICENSED-BY-POS", 1, 0, false);
        declareFunction(me, "update_nl_trie_semantic", "UPDATE-NL-TRIE-SEMANTIC", 1, 3, false);
        declareFunction(me, "nl_triefy_semantic_assertion", "NL-TRIEFY-SEMANTIC-ASSERTION", 4, 0, false);
        declareFunction(me, "nl_triefy_term_phrases_assertion", "NL-TRIEFY-TERM-PHRASES-ASSERTION", 3, 0, false);
        declareFunction(me, "add_or_remove_term_phrases_entry", "ADD-OR-REMOVE-TERM-PHRASES-ENTRY", 4, 0, false);
        declareFunction(me, "nl_trie_insert_term_phrases_entry", "NL-TRIE-INSERT-TERM-PHRASES-ENTRY", 3, 0, false);
        declareFunction(me, "nl_trie_remove_term_phrases_entry", "NL-TRIE-REMOVE-TERM-PHRASES-ENTRY", 3, 0, false);
        declareFunction(me, "nl_trie_get_morpho_syntax_from_formula", "NL-TRIE-GET-MORPHO-SYNTAX-FROM-FORMULA", 1, 0, false);
        declareFunction(me, "nl_trie_semantic_support_pos", "NL-TRIE-SEMANTIC-SUPPORT-POS", 1, 0, false);
        declareFunction(me, "semantic_update_triggered_by_syntactic_update_new", "SEMANTIC-UPDATE-TRIGGERED-BY-SYNTACTIC-UPDATE-NEW", 3, 0, false);
        declareFunction(me, "make_nl_trie_syntactic_support_sentence", "MAKE-NL-TRIE-SYNTACTIC-SUPPORT-SENTENCE", 4, 0, false);
        declareFunction(me, "semantic_update_triggered_by_incremental_semantic_update_new", "SEMANTIC-UPDATE-TRIGGERED-BY-INCREMENTAL-SEMANTIC-UPDATE-NEW", 3, 0, false);
        declareFunction(me, "inc_sem_from_preds_new", "INC-SEM-FROM-PREDS-NEW", 3, 0, false);
        declareFunction(me, "inc_sem_from_preds_syntactic_supports", "INC-SEM-FROM-PREDS-SYNTACTIC-SUPPORTS", 3, 0, false);
        declareFunction(me, "inc_sem_from_pos_new", "INC-SEM-FROM-POS-NEW", 3, 0, false);
        declareFunction(me, "find_string_mt_pairs_for_closed_class_word", "FIND-STRING-MT-PAIRS-FOR-CLOSED-CLASS-WORD", 3, 0, false);
        declareFunction(me, "nl_trie_assemble_strings", "NL-TRIE-ASSEMBLE-STRINGS", 3, 0, false);
        declareFunction(me, "new_nl_trie_denot_set", "NEW-NL-TRIE-DENOT-SET", 0, 1, false);
        declareFunction(me, "nl_triefy_arg_in_reln_assertion", "NL-TRIEFY-ARG-IN-RELN-ASSERTION", 3, 1, false);
        declareFunction(me, "nl_triefy_arg_in_reln_wX_mod_list", "NL-TRIEFY-ARG-IN-RELN-W/-MOD-LIST", 8, 0, false);
        declareFunction(me, "nl_triefy_arg_in_reln_wXo_mod_list", "NL-TRIEFY-ARG-IN-RELN-W/O-MOD-LIST", 8, 0, false);
        declareFunction(me, "nl_triefy_abbr_lex_word_assertion", "NL-TRIEFY-ABBR-LEX-WORD-ASSERTION", 3, 0, false);
        declareFunction(me, "get_denot_for_abbr_lex_word_assertion", "GET-DENOT-FOR-ABBR-LEX-WORD-ASSERTION", 3, 0, false);
        declareFunction(me, "nl_triefy_abbr_cps_assertion", "NL-TRIEFY-ABBR-CPS-ASSERTION", 3, 0, false);
        declareFunction(me, "get_denot_for_abbr_cps_assertion", "GET-DENOT-FOR-ABBR-CPS-ASSERTION", 4, 0, false);
        declareFunction(me, "nl_triefy_abbr_mws_assertion", "NL-TRIEFY-ABBR-MWS-ASSERTION", 3, 0, false);
        declareFunction(me, "get_denot_for_abbr_mws_assertion", "GET-DENOT-FOR-ABBR-MWS-ASSERTION", 4, 0, false);
        declareFunction(me, "nl_triefy_name_string", "NL-TRIEFY-NAME-STRING", 3, 0, false);
        declareFunction(me, "add_or_remove_nl_trie_word", "ADD-OR-REMOVE-NL-TRIE-WORD", 4, 0, false);
        declareFunction(me, "nl_trie_insert_low", "NL-TRIE-INSERT-LOW", 3, 0, false);
        declareFunction(me, "nl_trie_eqify_key", "NL-TRIE-EQIFY-KEY", 1, 0, false);
        declareFunction(me, "nl_trie_insert_word", "NL-TRIE-INSERT-WORD", 3, 0, false);
        declareFunction(me, "nl_trie_closed_lexical_class_entryP", "NL-TRIE-CLOSED-LEXICAL-CLASS-ENTRY?", 1, 0, false);
        declareFunction(me, "nl_trie_entry_case_matches_stringP", "NL-TRIE-ENTRY-CASE-MATCHES-STRING?", 2, 0, false);
        declareFunction(me, "nl_trie_augment_word", "NL-TRIE-AUGMENT-WORD", 2, 1, false);
        declareFunction(me, "nl_trie_delete_word", "NL-TRIE-DELETE-WORD", 3, 0, false);
        declareFunction(me, "nl_trie_unassociate", "NL-TRIE-UNASSOCIATE", 2, 1, false);
        declareFunction(me, "nl_trie_syntactic_orphanP", "NL-TRIE-SYNTACTIC-ORPHAN?", 2, 0, false);
        declareFunction(me, "unifiable_word_entriesP", "UNIFIABLE-WORD-ENTRIES?", 2, 1, false);
        declareFunction(me, "nl_trie_words_case_identicalP", "NL-TRIE-WORDS-CASE-IDENTICAL?", 2, 0, false);
        declareFunction(me, "nl_trie_syntax_unifiable_p", "NL-TRIE-SYNTAX-UNIFIABLE-P", 2, 0, false);
        declareFunction(me, "nl_trie_semantics_unifiable_p", "NL-TRIE-SEMANTICS-UNIFIABLE-P", 2, 0, false);
        declareFunction(me, "nl_trie_pragmatics_unifiable_p", "NL-TRIE-PRAGMATICS-UNIFIABLE-P", 2, 0, false);
        declareFunction(me, "nl_trie_semantic_pred_unifiable_p", "NL-TRIE-SEMANTIC-PRED-UNIFIABLE-P", 2, 0, false);
        declareFunction(me, "nl_trie_semantics_mt_unifiable_p", "NL-TRIE-SEMANTICS-MT-UNIFIABLE-P", 2, 0, false);
        declareFunction(me, "nl_trie_no_new_syntax_p", "NL-TRIE-NO-NEW-SYNTAX-P", 2, 0, false);
        declareFunction(me, "nl_trie_no_new_semantics_p", "NL-TRIE-NO-NEW-SEMANTICS-P", 2, 0, false);
        declareFunction(me, "nl_trie_pos_unifiable_p", "NL-TRIE-POS-UNIFIABLE-P", 2, 0, false);
        declareFunction(me, "nl_trie_frame_unifiable_p", "NL-TRIE-FRAME-UNIFIABLE-P", 2, 0, false);
        declareFunction(me, "nl_trie_wu_unifiable_p", "NL-TRIE-WU-UNIFIABLE-P", 2, 0, false);
        declareFunction(me, "nl_trie_syntax_mt_unifiable_p", "NL-TRIE-SYNTAX-MT-UNIFIABLE-P", 2, 0, false);
        declareFunction(me, "update_nl_trie_name", "UPDATE-NL-TRIE-NAME", 4, 0, false);
        declareFunction(me, "nl_trie_insert_name", "NL-TRIE-INSERT-NAME", 3, 0, false);
        declareFunction(me, "nl_trie_name_redundantP", "NL-TRIE-NAME-REDUNDANT?", 2, 0, false);
        declareFunction(me, "nl_trie_delete_name", "NL-TRIE-DELETE-NAME", 3, 0, false);
        declareFunction(me, "nl_trie_strings_of_wuXpos", "NL-TRIE-STRINGS-OF-WU&POS", 3, 0, false);
        declareFunction(me, "clear_nl_trie_preds_of_pos", "CLEAR-NL-TRIE-PREDS-OF-POS", 0, 0, false);
        declareFunction(me, "remove_nl_trie_preds_of_pos", "REMOVE-NL-TRIE-PREDS-OF-POS", 1, 0, false);
        declareFunction(me, "nl_trie_preds_of_pos_internal", "NL-TRIE-PREDS-OF-POS-INTERNAL", 1, 0, false);
        declareFunction(me, "nl_trie_preds_of_pos", "NL-TRIE-PREDS-OF-POS", 1, 0, false);
        declareFunction(me, "clear_nl_trie_pos_of_pred", "CLEAR-NL-TRIE-POS-OF-PRED", 0, 0, false);
        declareFunction(me, "remove_nl_trie_pos_of_pred", "REMOVE-NL-TRIE-POS-OF-PRED", 1, 0, false);
        declareFunction(me, "nl_trie_pos_of_pred_internal", "NL-TRIE-POS-OF-PRED-INTERNAL", 1, 0, false);
        declareFunction(me, "nl_trie_pos_of_pred", "NL-TRIE-POS-OF-PRED", 1, 0, false);
        declareFunction(me, "nl_trie_strings_of_word_unit", "NL-TRIE-STRINGS-OF-WORD-UNIT", 3, 1, false);
        declareFunction(me, "nl_trie_string_tokenize", "NL-TRIE-STRING-TOKENIZE", 1, 0, false);
        declareFunction(me, "nl_trie_string_tokenize_multiple", "NL-TRIE-STRING-TOKENIZE-MULTIPLE", 1, 0, false);
        declareFunction(me, "nl_trie_single_token_stringP", "NL-TRIE-SINGLE-TOKEN-STRING?", 1, 0, false);
        declareFunction(me, "nl_trie_strings_keys", "NL-TRIE-STRINGS-KEYS", 1, 0, false);
        declareFunction(me, "nl_trie_standardize_strings", "NL-TRIE-STANDARDIZE-STRINGS", 1, 0, false);
        declareFunction(me, "nl_trie_standardize_strings_int", "NL-TRIE-STANDARDIZE-STRINGS-INT", 1, 0, false);
        declareFunction(me, "nl_trie_break_char_exception_string_p", "NL-TRIE-BREAK-CHAR-EXCEPTION-STRING-P", 1, 0, false);
        declareFunction(me, "nl_trie_break_char_p", "NL-TRIE-BREAK-CHAR-P", 1, 0, false);
        new nl_trie.$nl_trie_break_char_p$UnaryFunction();
        declareFunction(me, "nl_trie_not_present_message", "NL-TRIE-NOT-PRESENT-MESSAGE", 1, 0, false);
        declareFunction(me, "nl_trie_warn_bad_add", "NL-TRIE-WARN-BAD-ADD", 1, 0, false);
        declareFunction(me, "nl_trie_warn_bad_remove", "NL-TRIE-WARN-BAD-REMOVE", 1, 0, false);
        declareFunction(me, "nl_trie_warn", "NL-TRIE-WARN", 2, 4, false);
        declareFunction(me, "nl_trie_error", "NL-TRIE-ERROR", 1, 4, false);
        declareFunction(me, "nl_trie_syntactic_preds_for_pos", "NL-TRIE-SYNTACTIC-PREDS-FOR-POS", 1, 0, false);
        declareFunction(me, "find_morphologically_derivable_strings", "FIND-MORPHOLOGICALLY-DERIVABLE-STRINGS", 4, 0, false);
        declareFunction(me, "get_nl_trie_name_pragmatic_features", "GET-NL-TRIE-NAME-PRAGMATIC-FEATURES", 1, 0, false);
        declareFunction(me, "get_assertion_pragmatic_features", "GET-ASSERTION-PRAGMATIC-FEATURES", 1, 0, false);
        declareFunction(me, "get_pragmatic_features", "GET-PRAGMATIC-FEATURES", 2, 0, false);
        declareFunction(me, "find_pos_preds_for_lex_const_internal", "FIND-POS-PREDS-FOR-LEX-CONST-INTERNAL", 1, 0, false);
        declareFunction(me, "find_pos_preds_for_lex_const", "FIND-POS-PREDS-FOR-LEX-CONST", 1, 0, false);
        declareFunction(me, "remove_genl_pos_preds", "REMOVE-GENL-POS-PREDS", 1, 0, false);
        declareFunction(me, "find_pos_for_lex_const", "FIND-POS-FOR-LEX-CONST", 1, 0, false);
        declareFunction(me, "nl_trie_syntactic_predP", "NL-TRIE-SYNTACTIC-PRED?", 1, 0, false);
        new nl_trie.$nl_trie_syntactic_predP$UnaryFunction();
        declareFunction(me, "english_lexical_mtP", "ENGLISH-LEXICAL-MT?", 1, 0, false);
        declareFunction(me, "has_pos_of_predP", "HAS-POS-OF-PRED?", 1, 0, false);
        declareFunction(me, "nl_trie_semantic_predP", "NL-TRIE-SEMANTIC-PRED?", 1, 0, false);
        declareFunction(me, "clear_nl_trie_name_string_preds", "CLEAR-NL-TRIE-NAME-STRING-PREDS", 0, 0, false);
        declareFunction(me, "initialize_nl_trie_name_string_preds", "INITIALIZE-NL-TRIE-NAME-STRING-PREDS", 0, 0, false);
        declareFunction(me, "nl_trie_name_string_preds", "NL-TRIE-NAME-STRING-PREDS", 0, 0, false);
        declareFunction(me, "nl_trie_name_string_predP", "NL-TRIE-NAME-STRING-PRED?", 1, 0, false);
        new nl_trie.$nl_trie_name_string_predP$UnaryFunction();
        declareFunction(me, "nl_trie_pragmatic_predP", "NL-TRIE-PRAGMATIC-PRED?", 1, 0, false);
        declareFunction(me, "triefy_reifiable_function_extent", "TRIEFY-REIFIABLE-FUNCTION-EXTENT", 1, 0, false);
        declareFunction(me, "triefy_nart", "TRIEFY-NART", 1, 0, false);
        declareFunction(me, "new_nl_trie_iterator", "NEW-NL-TRIE-ITERATOR", 0, 1, false);
        declareFunction(me, "make_nl_trie_iterator_state", "MAKE-NL-TRIE-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "nl_trie_iterator_done", "NL-TRIE-ITERATOR-DONE", 1, 0, false);
        declareFunction(me, "nl_trie_iterator_next", "NL-TRIE-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "test_swappable_nl_trie_dump", "TEST-SWAPPABLE-NL-TRIE-DUMP", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_nl_trie_file() {
        deflexical("*NL-TRIE-DEFAULT-TEST*", symbol_function(EQUALP));
        deflexical("*DEFAULT-NL-TRIE-CACHE-STRATEGY-SIZE*", $int$6000);
        deflexical("*NL-TRIE-CACHE-STRATEGY*", SubLTrampolineFile.maybeDefault($nl_trie_cache_strategy$, $nl_trie_cache_strategy$, () -> cache_utilities.new_metered_preallocated_cache($default_nl_trie_cache_strategy_size$.getGlobalValue(), $nl_trie_default_test$.getGlobalValue())));
        deflexical("*NL-TRIE-LOCK*", SubLTrampolineFile.maybeDefault($nl_trie_lock$, $nl_trie_lock$, () -> make_lock($$$NL_Trie_Lock)));
        defconstant("*ENGLISH-DEFINITE-DETERMINER*", $$$the);
        deflexical("*NL-TRIE-WORD-DENOT-INVALIDITY-TESTS*", $list99);
        defconstant("*DTP-NL-TRIE-WORD-STRUC*", NL_TRIE_WORD_STRUC);
        defconstant("*CFASL-OPCODE-NL-TRIE-WORD-STRUC*", $int$71);
        deflexical("*NL-TRIE-WORD-SEMANTIC-SUPPORT-SET-TEST*", symbol_function(EQUALP));
        deflexical("*NL-TRIE-WORD-SYNTACTIC-SUPPORT-SET-TEST*", symbol_function(EQUALP));
        defparameter("*CALL-TO-NL-TRIE-WORD-SYNTACTIC-SUPPORTS-LICENSED?*", NIL);
        defparameter("*CALL-TO-NL-TRIE-WORD-SEMANTIC-SUPPORTS-LICENSED?*", NIL);
        deflexical("*NL-TRIE-CLOSED-CLASS-POS-PREDS-CACHING-STATE*", NIL);
        deflexical("*NL-TRIE-PREFERRED-SEMANTIC-PREDICATES*", $list192);
        deflexical("*NL-TRIE-LEXICAL-MT*", SubLTrampolineFile.maybeDefault($nl_trie_lexical_mt$, $nl_trie_lexical_mt$, $$AllLexicalMicrotheoryPSC));
        deflexical("*NL-TRIE-SYNTACTIC-PREDICATES*", SubLTrampolineFile.maybeDefault($nl_trie_syntactic_predicates$, $nl_trie_syntactic_predicates$, $UNINITIALIZED));
        deflexical("*NL-TRIE-DENOTATION-PREDICATES*", SubLTrampolineFile.maybeDefault($nl_trie_denotation_predicates$, $nl_trie_denotation_predicates$, $UNINITIALIZED));
        deflexical("*NL-TRIE-SEMTRANS-PREDICATES*", SubLTrampolineFile.maybeDefault($nl_trie_semtrans_predicates$, $nl_trie_semtrans_predicates$, $UNINITIALIZED));
        deflexical("*NL-TRIE-ABBREVIATION-PREDICATES*", SubLTrampolineFile.maybeDefault($nl_trie_abbreviation_predicates$, $nl_trie_abbreviation_predicates$, $UNINITIALIZED));
        deflexical("*NL-TRIE-ARG-IN-RELN-PREDICATES*", SubLTrampolineFile.maybeDefault($nl_trie_arg_in_reln_predicates$, $nl_trie_arg_in_reln_predicates$, $UNINITIALIZED));
        deflexical("*NL-TRIE-PRAGMATIC-PREDICATES*", SubLTrampolineFile.maybeDefault($nl_trie_pragmatic_predicates$, $nl_trie_pragmatic_predicates$, $UNINITIALIZED));
        defparameter("*NL-TRIES-BEING-INITIALIZED*", NIL);
        deflexical("*NL-TRIE*", SubLTrampolineFile.maybeDefault($nl_trie$, $nl_trie$, () -> new_nl_trie(UNPROVIDED)));
        defparameter("*NL-TRIE-ENTRY-FILTER-STACK*", NIL);
        deflexical("*NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS-CACHING-STATE*", NIL);
        defparameter("*CATCH-NL-TRIE-ERRORS?*", T);
        deflexical("*NL-TRIE-SPEC-PREDICATES-CACHING-STATE*", NIL);
        deflexical("*NL-TRIE-POS-FOR-SEMTRANS-PRED-CACHING-STATE*", NIL);
        deflexical("*NL-TRIE-PRED-OK-FOR-POS?-CACHING-STATE*", NIL);
        deflexical("*NL-TRIE-PREDS-LICENSED-BY-POS-CACHING-STATE*", NIL);
        deflexical("*NL-TRIE-DENOT-SET-TEST*", symbol_function(EQUALP));
        deflexical("*NL-TRIE-PREDS-OF-POS-CACHING-STATE*", NIL);
        deflexical("*NL-TRIE-POS-OF-PRED-CACHING-STATE*", NIL);
        defparameter("*NL-TRIE-BREAK-LIST*", $list382);
        defparameter("*NL-TRIE-USE-TWO-LETTER-STRINGS?*", NIL);
        defparameter("*NL-TRIE-WARNING-LEVEL*", ONE_INTEGER);
        defparameter("*NL-TRIE-BREAK-ON-ERROR?*", NIL);
        defparameter("*NL-TRIE-INCLUDE-DERIVED-FORMS?*", T);
        deflexical("*NL-TRIE-NAME-STRING-PREDS-SET*", SubLTrampolineFile.maybeDefault($nl_trie_name_string_preds_set$, $nl_trie_name_string_preds_set$, () -> lexicon_vars.new_lex_pred_set()));
        return NIL;
    }

    public static SubLObject setup_nl_trie_file() {
        lexicon_vars.$nl_trie_code_revision$.setGlobalValue($str0$_Revision__142735__);
        lexicon_vars.declare_noop_updates_for_lexicon_global($nl_trie_code_revision$, $list2);
        declare_defglobal($nl_trie_cache_strategy$);
        declare_defglobal($nl_trie_lock$);
        memoization_state.note_memoized_function(VALIDATE_NL_TRIE_ENTRY);
        memoization_state.note_memoized_function(NL_TRIE_DONT_ADD_THE_CATEGORIES);
        memoization_state.note_memoized_function(NL_TRIE_DONT_ADD_THE_TERMS);
        memoization_state.note_memoized_function($sym55$NL_TRIE_NAME_PRED_OK_FOR_ADDING_THE_);
        register_macro_helper(NL_TRIE_NAME_STRING_MACRO_HELPER, DO_NL_TRIE_ENTRY_STRINGS);
        memoization_state.note_memoized_function(NL_TRIE_WORD_STRUC_VALID_P);
        memoization_state.note_memoized_function($sym92$NL_TRIE_VALID_ASSERTION__MEMOIZED);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_nl_trie_word_struc$.getGlobalValue(), symbol_function(NL_TRIE_WORD_STRUC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list115);
        def_csetf(NL_TRIE_WORD_STRUC_SYNTACTIC_SUPPORTS, _CSETF_NL_TRIE_WORD_STRUC_SYNTACTIC_SUPPORTS);
        def_csetf(NL_TRIE_WORD_STRUC_SEMANTIC_SUPPORTS, _CSETF_NL_TRIE_WORD_STRUC_SEMANTIC_SUPPORTS);
        identity(NL_TRIE_WORD_STRUC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_nl_trie_word_struc$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NL_TRIE_WORD_STRUC_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_nl_trie_word_struc$.getGlobalValue(), symbol_function(SXHASH_NL_TRIE_WORD_STRUC_METHOD));
        register_cfasl_input_function($cfasl_opcode_nl_trie_word_struc$.getGlobalValue(), CFASL_INPUT_NL_TRIE_WORD_STRUC);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_nl_trie_word_struc$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_NL_TRIE_WORD_STRUC_METHOD));
        memoization_state.note_memoized_function(NL_TRIE_WORD_SEMANTIC_SUPPORT_DENOTS);
        memoization_state.note_memoized_function(NL_TRIE_WORD_SEMANTIC_SUPPORT_SEMTRANS_TEMPLATES);
        memoization_state.note_globally_cached_function(NL_TRIE_CLOSED_CLASS_POS_PREDS);
        memoization_state.note_memoized_function(NL_TRIE_WORD_POS);
        register_macro_helper($sym191$NL_TRIE_PREFERRED_SEMANTIC_SUPPORT_, DO_NL_TRIE_WORD_DENOTS);
        register_macro_helper(NL_TRIE_WORD_HEAD_STRING_MACRO_HELPER, DO_NL_TRIE_WORD_STRINGS);
        register_macro_helper(NL_TRIE_WORD_LEADING_STRINGS_FROM_SUPPORT_MACRO_HELPER, DO_NL_TRIE_WORD_STRINGS);
        register_macro_helper(NL_TRIE_WORD_FOLLOWING_STRINGS_FROM_SUPPORT_MACRO_HELPER, DO_NL_TRIE_WORD_STRINGS);
        register_macro_helper(NL_TRIE_ASSEMBLE_STRINGS_MACRO_HELPER, DO_NL_TRIE_WORD_STRINGS);
        memoization_state.note_memoized_function(NL_TRIE_RECORD_P);
        declare_defglobal($nl_trie_lexical_mt$);
        declare_defglobal($nl_trie_syntactic_predicates$);
        declare_defglobal($nl_trie_denotation_predicates$);
        declare_defglobal($nl_trie_semtrans_predicates$);
        declare_defglobal($nl_trie_abbreviation_predicates$);
        declare_defglobal($nl_trie_arg_in_reln_predicates$);
        declare_defglobal($nl_trie_pragmatic_predicates$);
        declare_defglobal($nl_trie$);
        memoization_state.note_memoized_function(NL_TRIE_SEARCH_CASE_SENSITIVE);
        memoization_state.note_memoized_function(NL_TRIE_SEARCH_CASE_INSENSITIVE);
        memoization_state.note_memoized_function(NL_TRIE_SEARCH_CASE_SENSITIVE_PREFERRED);
        memoization_state.note_globally_cached_function(NL_TRIE_MULTI_WORD_ABBREVIATION_PREDS);
        memoization_state.note_globally_cached_function(NL_TRIE_SPEC_PREDICATES);
        memoization_state.note_globally_cached_function(NL_TRIE_POS_FOR_SEMTRANS_PRED);
        memoization_state.note_globally_cached_function($sym349$NL_TRIE_PRED_OK_FOR_POS_);
        memoization_state.note_globally_cached_function(NL_TRIE_PREDS_LICENSED_BY_POS);
        memoization_state.note_globally_cached_function(NL_TRIE_PREDS_OF_POS);
        memoization_state.note_globally_cached_function(NL_TRIE_POS_OF_PRED);
        memoization_state.note_memoized_function(FIND_POS_PREDS_FOR_LEX_CONST);
        declare_defglobal($nl_trie_name_string_preds_set$);
        define_test_case_table_int(NL_TRIE_STRING_TOKENIZE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list410, $KB, $FULL, $WORKING_, T }), $list414);
        define_test_case_table_int(TEST_SWAPPABLE_NL_TRIE_DUMP, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list417);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nl_trie_file();
    }

    @Override
    public void initializeVariables() {
        init_nl_trie_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nl_trie_file();
    }

    

    public static final class $nl_trie_word_struc_native extends SubLStructNative {
        public SubLObject $syntactic_supports;

        public SubLObject $semantic_supports;

        private static final SubLStructDeclNative structDecl;

        private $nl_trie_word_struc_native() {
            this.$syntactic_supports = Lisp.NIL;
            this.$semantic_supports = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$syntactic_supports;
        }

        @Override
        public SubLObject getField3() {
            return this.$semantic_supports;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$syntactic_supports = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$semantic_supports = value;
        }

        static {
            structDecl = makeStructDeclNative($nl_trie_word_struc_native.class, NL_TRIE_WORD_STRUC, NL_TRIE_WORD_STRUC_P, $list109, $list110, new String[]{ "$syntactic_supports", "$semantic_supports" }, $list111, $list112, PPRINT_NL_TRIE_WORD_STRUC);
        }
    }

    public static final class $nl_trie_word_struc_p$UnaryFunction extends UnaryFunction {
        public $nl_trie_word_struc_p$UnaryFunction() {
            super(extractFunctionNamed("NL-TRIE-WORD-STRUC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nl_trie_word_struc_p(arg1);
        }
    }

    public static final class $sxhash_nl_trie_word_struc_method$UnaryFunction extends UnaryFunction {
        public $sxhash_nl_trie_word_struc_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-NL-TRIE-WORD-STRUC-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_nl_trie_word_struc_method(arg1);
        }
    }

    public static final class $cfasl_input_nl_trie_word_struc$UnaryFunction extends UnaryFunction {
        public $cfasl_input_nl_trie_word_struc$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-NL-TRIE-WORD-STRUC"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_nl_trie_word_struc(arg1);
        }
    }

    public static final class $nl_trie_semtrans_pred_has_pos_specificationP$UnaryFunction extends UnaryFunction {
        public $nl_trie_semtrans_pred_has_pos_specificationP$UnaryFunction() {
            super(extractFunctionNamed("NL-TRIE-SEMTRANS-PRED-HAS-POS-SPECIFICATION?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nl_trie_semtrans_pred_has_pos_specificationP(arg1);
        }
    }

    public static final class $nl_trie_break_char_p$UnaryFunction extends UnaryFunction {
        public $nl_trie_break_char_p$UnaryFunction() {
            super(extractFunctionNamed("NL-TRIE-BREAK-CHAR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nl_trie_break_char_p(arg1);
        }
    }

    public static final class $nl_trie_syntactic_predP$UnaryFunction extends UnaryFunction {
        public $nl_trie_syntactic_predP$UnaryFunction() {
            super(extractFunctionNamed("NL-TRIE-SYNTACTIC-PRED?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nl_trie_syntactic_predP(arg1);
        }
    }

    public static final class $nl_trie_name_string_predP$UnaryFunction extends UnaryFunction {
        public $nl_trie_name_string_predP$UnaryFunction() {
            super(extractFunctionNamed("NL-TRIE-NAME-STRING-PRED?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nl_trie_name_string_predP(arg1);
        }
    }
}

/**
 * Total time: 4197 ms
 */
