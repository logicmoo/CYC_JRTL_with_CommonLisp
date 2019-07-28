package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.pos_tagger.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_caret;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class pos_tagger extends SubLTranslatedFile {
    public static final SubLFile me = new pos_tagger();

    public static final String myName = "com.cyc.cycjava.cycl.pos_tagger";

    public static final String myFingerPrint = "d8038c5ea89358ced6c1867bfd7724c821416c62d5452c15fce87ded9336632b";

    // defparameter
    private static final SubLSymbol $tagger_data_path$ = makeSymbol("*TAGGER-DATA-PATH*");

    // defparameter
    private static final SubLSymbol $exclude_from_normalization$ = makeSymbol("*EXCLUDE-FROM-NORMALIZATION*");

    // defconstant
    // the relative location of the initial state file
    private static final SubLSymbol $initial_state_resource$ = makeSymbol("*INITIAL-STATE-RESOURCE*");

    // defconstant
    // the relative location of the word emission data file
    private static final SubLSymbol $state_resource$ = makeSymbol("*STATE-RESOURCE*");

    // defconstant
    // the relative location of the transition data file
    private static final SubLSymbol $transition_resource$ = makeSymbol("*TRANSITION-RESOURCE*");

    // defconstant
    // the relative location of the open states data file
    private static final SubLSymbol $open_states_resource$ = makeSymbol("*OPEN-STATES-RESOURCE*");

    // defconstant
    // the relative location of the suffix data file
    private static final SubLSymbol $suffixes_resource$ = makeSymbol("*SUFFIXES-RESOURCE*");

    // defconstant
    // the relative location of the unknown word data
    private static final SubLSymbol $unknown_word_resource$ = makeSymbol("*UNKNOWN-WORD-RESOURCE*");

    // defconstant
    // the relative location of the suffix word data
    private static final SubLSymbol $suffix_resource$ = makeSymbol("*SUFFIX-RESOURCE*");

    // defconstant
    // the relative location of the hyphen word data
    private static final SubLSymbol $hyphen_resource$ = makeSymbol("*HYPHEN-RESOURCE*");

    // defconstant
    // the relative location of the number word data
    private static final SubLSymbol $number_resource$ = makeSymbol("*NUMBER-RESOURCE*");

    // defconstant
    // the relative location of the capitalization word data
    private static final SubLSymbol $capitalization_resource$ = makeSymbol("*CAPITALIZATION-RESOURCE*");

    // defconstant
    // the relative location of the mapping from HMM states to Penn pos tags
    private static final SubLSymbol $state_interpretation_resource$ = makeSymbol("*STATE-INTERPRETATION-RESOURCE*");

    // defconstant
    /**
     * the delimiter for conditioned, conditioning and probability string in a data
     * file
     */
    private static final SubLSymbol $token_delimiters$ = makeSymbol("*TOKEN-DELIMITERS*");

    // deflexical
    // probabilistic impossibility
    public static final SubLSymbol $impossibility$ = makeSymbol("*IMPOSSIBILITY*");

    // deflexical
    // probabilistic certainty
    public static final SubLSymbol $certainty$ = makeSymbol("*CERTAINTY*");

    // deflexical
    // a low probability, randomly chosen
    public static final SubLSymbol $low_probability$ = makeSymbol("*LOW-PROBABILITY*");

    // defparameter
    // The size of the memory cache of the tagger's state set
    private static final SubLSymbol $state_set_cache_capacity$ = makeSymbol("*STATE-SET-CACHE-CAPACITY*");

    // deflexical
    // the standard part-of-speech tagger
    public static final SubLSymbol $pos_tagger$ = makeSymbol("*POS-TAGGER*");

    // defconstant
    public static final SubLSymbol $dtp_tagger$ = makeSymbol("*DTP-TAGGER*");

    // defparameter
    private static final SubLSymbol $word_tag_patches$ = makeSymbol("*WORD-TAG-PATCHES*");

    // defconstant
    public static final SubLSymbol $dtp_hmm$ = makeSymbol("*DTP-HMM*");

    // defconstant
    public static final SubLSymbol $dtp_state_set$ = makeSymbol("*DTP-STATE-SET*");

    // defconstant
    public static final SubLSymbol $dtp_transition_set$ = makeSymbol("*DTP-TRANSITION-SET*");

    // defconstant
    public static final SubLSymbol $dtp_emission_probability_estimator$ = makeSymbol("*DTP-EMISSION-PROBABILITY-ESTIMATOR*");

    // Internal Constants
    public static final SubLString $$$data = makeString("data");

    public static final SubLString $str1$pos_tagging = makeString("pos-tagging");

    public static final SubLList $list2 = list(makeString("WWII"));

    public static final SubLString $str3$initial_state = makeString("initial-state");

    public static final SubLString $$$states = makeString("states");

    public static final SubLString $$$transitions = makeString("transitions");

    public static final SubLString $str6$open_states = makeString("open-states");

    public static final SubLString $$$suffixes = makeString("suffixes");

    public static final SubLString $$$unknown = makeString("unknown");

    public static final SubLString $$$suffix = makeString("suffix");

    public static final SubLString $$$hyphen = makeString("hyphen");

    public static final SubLString $$$number = makeString("number");

    public static final SubLString $$$capitalization = makeString("capitalization");

    public static final SubLString $str13$index_to_state = makeString("index-to-state");

    public static final SubLList $list14 = list(CHAR_caret);

    private static final SubLFloat $float$_3_4028232e38 = makeDouble(-3.4028232E38);

    private static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLInteger $int$_20 = makeInteger(-20);

    private static final SubLInteger $int$2000 = makeInteger(2000);



    public static final SubLString $str20$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLList $list21 = list(makeSymbol("CONDITIONED"), makeSymbol("CONDITIONING"), makeSymbol("PROBABILITY"));

    public static final SubLList $list22 = list(makeSymbol("CPA"), makeSymbol("CONDITIONED"), makeSymbol("CONDITIONING"));





    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    public static final SubLString $str26$Unable_to_initialize_file_hashtab = makeString("Unable to initialize file hashtable. ");

    public static final SubLString $str27$Building_conditional_probability_ = makeString("Building conditional probability file...");

    public static final SubLList $list28 = list(makeSymbol("PROBABILITY"), makeSymbol("SOURCE"));



    public static final SubLList $list30 = list(makeSymbol("ENTRY"));





    public static final SubLList $list33 = list(makeSymbol("ENTRY"), makeSymbol("PROBABILITY"), makeSymbol("SOURCE"));





    public static final SubLList $list36 = list(makeSymbol("TRELLIS"));



    public static final SubLList $list38 = list(makeSymbol("TRELLIS"), makeSymbol("KEY"));



    public static final SubLSymbol TRELLIS_CURRENT_COLUMN = makeSymbol("TRELLIS-CURRENT-COLUMN");

    public static final SubLList $list41 = list(list(makeSymbol("FUNCTION"), EQL));

    public static final SubLList $list42 = list(makeSymbol("TRELLIS"), makeSymbol("KEY"), makeSymbol("VALUE"));



    public static final SubLSymbol ACONS = makeSymbol("ACONS");





    public static final SubLSymbol TAGGER_P = makeSymbol("TAGGER-P");

    public static final SubLList $list48 = list(makeSymbol("HMM"), makeSymbol("STATE-INTERPRETATION"));

    public static final SubLList $list49 = list(makeKeyword("HMM"), makeKeyword("STATE-INTERPRETATION"));

    public static final SubLList $list50 = list(makeSymbol("TAGGER-HMM"), makeSymbol("TAGGER-STATE-INTERPRETATION"));

    public static final SubLList $list51 = list(makeSymbol("_CSETF-TAGGER-HMM"), makeSymbol("_CSETF-TAGGER-STATE-INTERPRETATION"));



    public static final SubLSymbol TAGGER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TAGGER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list54 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TAGGER-P"));

    private static final SubLSymbol TAGGER_HMM = makeSymbol("TAGGER-HMM");

    private static final SubLSymbol _CSETF_TAGGER_HMM = makeSymbol("_CSETF-TAGGER-HMM");

    private static final SubLSymbol TAGGER_STATE_INTERPRETATION = makeSymbol("TAGGER-STATE-INTERPRETATION");

    private static final SubLSymbol _CSETF_TAGGER_STATE_INTERPRETATION = makeSymbol("_CSETF-TAGGER-STATE-INTERPRETATION");





    private static final SubLString $str61$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_TAGGER = makeSymbol("MAKE-TAGGER");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TAGGER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TAGGER-METHOD");



    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol DOCUMENT_P = makeSymbol("DOCUMENT-P");







    private static final SubLList $list73 = list(cons(cons(makeString("German"), EIGHTEEN_INTEGER), FIVE_INTEGER), cons(cons(makeString("Germans"), makeInteger(38)), makeInteger(25)), cons(cons(makeString("French"), EIGHTEEN_INTEGER), FIVE_INTEGER), cons(cons(makeString("French"), makeInteger(38)), makeInteger(25)));



    public static final SubLList $list75 = list(makeKeyword("STRING"), makeString("."));

    private static final SubLString $$$txt = makeString("txt");

    private static final SubLString $str77$Unable_to_initialize_pos_tagger_s = makeString("Unable to initialize pos tagger state interpretation from ~a");

    private static final SubLSymbol HMM = makeSymbol("HMM");

    private static final SubLSymbol HMM_P = makeSymbol("HMM-P");

    private static final SubLList $list80 = list(makeSymbol("INITIAL-STATE"), makeSymbol("STATES"), makeSymbol("TRANSITIONS"));

    private static final SubLList $list81 = list(makeKeyword("INITIAL-STATE"), makeKeyword("STATES"), makeKeyword("TRANSITIONS"));

    private static final SubLList $list82 = list(makeSymbol("HMM-INITIAL-STATE"), makeSymbol("HMM-STATES"), makeSymbol("HMM-TRANSITIONS"));

    private static final SubLList $list83 = list(makeSymbol("_CSETF-HMM-INITIAL-STATE"), makeSymbol("_CSETF-HMM-STATES"), makeSymbol("_CSETF-HMM-TRANSITIONS"));

    private static final SubLSymbol HMM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HMM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list85 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HMM-P"));

    private static final SubLSymbol HMM_INITIAL_STATE = makeSymbol("HMM-INITIAL-STATE");

    private static final SubLSymbol _CSETF_HMM_INITIAL_STATE = makeSymbol("_CSETF-HMM-INITIAL-STATE");

    private static final SubLSymbol HMM_STATES = makeSymbol("HMM-STATES");

    private static final SubLSymbol _CSETF_HMM_STATES = makeSymbol("_CSETF-HMM-STATES");

    private static final SubLSymbol HMM_TRANSITIONS = makeSymbol("HMM-TRANSITIONS");

    private static final SubLSymbol _CSETF_HMM_TRANSITIONS = makeSymbol("_CSETF-HMM-TRANSITIONS");







    private static final SubLSymbol MAKE_HMM = makeSymbol("MAKE-HMM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HMM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HMM-METHOD");

    private static final SubLString $str97$Unable_to_initialize_pos_tagger_H = makeString("Unable to initialize pos tagger HMM initial state from ~a");

    private static final SubLSymbol STATE_SET = makeSymbol("STATE-SET");

    private static final SubLSymbol STATE_SET_P = makeSymbol("STATE-SET-P");

    private static final SubLList $list100 = list(makeSymbol("STORE"), makeSymbol("ESTIMATOR"), makeSymbol("CACHE"));

    private static final SubLList $list101 = list(makeKeyword("STORE"), makeKeyword("ESTIMATOR"), makeKeyword("CACHE"));

    private static final SubLList $list102 = list(makeSymbol("STATE-SET-STORE"), makeSymbol("STATE-SET-ESTIMATOR"), makeSymbol("STATE-SET-CACHE"));

    private static final SubLList $list103 = list(makeSymbol("_CSETF-STATE-SET-STORE"), makeSymbol("_CSETF-STATE-SET-ESTIMATOR"), makeSymbol("_CSETF-STATE-SET-CACHE"));

    private static final SubLSymbol STATE_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STATE-SET-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list105 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("STATE-SET-P"));

    private static final SubLSymbol STATE_SET_STORE = makeSymbol("STATE-SET-STORE");

    private static final SubLSymbol _CSETF_STATE_SET_STORE = makeSymbol("_CSETF-STATE-SET-STORE");

    private static final SubLSymbol STATE_SET_ESTIMATOR = makeSymbol("STATE-SET-ESTIMATOR");

    private static final SubLSymbol _CSETF_STATE_SET_ESTIMATOR = makeSymbol("_CSETF-STATE-SET-ESTIMATOR");

    private static final SubLSymbol STATE_SET_CACHE = makeSymbol("STATE-SET-CACHE");

    private static final SubLSymbol _CSETF_STATE_SET_CACHE = makeSymbol("_CSETF-STATE-SET-CACHE");







    private static final SubLSymbol MAKE_STATE_SET = makeSymbol("MAKE-STATE-SET");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_STATE_SET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-STATE-SET-METHOD");

    private static final SubLString $$$fht = makeString("fht");

    private static final SubLString $str118$Unable_to_initialize_pos_tagger_s = makeString("Unable to initialize pos tagger state set from ~a");

    private static final SubLSymbol TRANSITION_SET = makeSymbol("TRANSITION-SET");

    private static final SubLSymbol TRANSITION_SET_P = makeSymbol("TRANSITION-SET-P");

    private static final SubLList $list121 = list(makeSymbol("KNOWN-PROBABILITIES"), makeSymbol("ESTIMATED-PROBABILITIES"));

    private static final SubLList $list122 = list(makeKeyword("KNOWN-PROBABILITIES"), makeKeyword("ESTIMATED-PROBABILITIES"));

    private static final SubLList $list123 = list(makeSymbol("TRANSITION-SET-KNOWN-PROBABILITIES"), makeSymbol("TRANSITION-SET-ESTIMATED-PROBABILITIES"));

    public static final SubLList $list124 = list(makeSymbol("_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES"), makeSymbol("_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES"));

    private static final SubLSymbol TRANSITION_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANSITION-SET-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list126 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TRANSITION-SET-P"));

    private static final SubLSymbol TRANSITION_SET_KNOWN_PROBABILITIES = makeSymbol("TRANSITION-SET-KNOWN-PROBABILITIES");

    private static final SubLSymbol _CSETF_TRANSITION_SET_KNOWN_PROBABILITIES = makeSymbol("_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES");

    private static final SubLSymbol TRANSITION_SET_ESTIMATED_PROBABILITIES = makeSymbol("TRANSITION-SET-ESTIMATED-PROBABILITIES");

    private static final SubLSymbol _CSETF_TRANSITION_SET_ESTIMATED_PROBABILITIES = makeSymbol("_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES");





    private static final SubLSymbol MAKE_TRANSITION_SET = makeSymbol("MAKE-TRANSITION-SET");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TRANSITION_SET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRANSITION-SET-METHOD");



    private static final SubLString $str136$Unable_to_initialize_pos_tagger_H = makeString("Unable to initialize pos tagger HMM transition set from ~a");

    private static final SubLSymbol EMISSION_PROBABILITY_ESTIMATOR = makeSymbol("EMISSION-PROBABILITY-ESTIMATOR");

    private static final SubLSymbol EMISSION_PROBABILITY_ESTIMATOR_P = makeSymbol("EMISSION-PROBABILITY-ESTIMATOR-P");

    private static final SubLList $list139 = list(makeSymbol("OPEN-STATES"), makeSymbol("SUFFIXES"), makeSymbol("UNKNOWN-WORD"), makeSymbol("SUFFIX"), makeSymbol("HYPHEN"), makeSymbol("NUMBER"), makeSymbol("CAPITALIZATION"));

    private static final SubLList $list140 = list(makeKeyword("OPEN-STATES"), makeKeyword("SUFFIXES"), makeKeyword("UNKNOWN-WORD"), makeKeyword("SUFFIX"), makeKeyword("HYPHEN"), makeKeyword("NUMBER"), makeKeyword("CAPITALIZATION"));

    private static final SubLList $list141 = list(makeSymbol("EPE-OPEN-STATES"), makeSymbol("EPE-SUFFIXES"), makeSymbol("EPE-UNKNOWN-WORD"), makeSymbol("EPE-SUFFIX"), makeSymbol("EPE-HYPHEN"), makeSymbol("EPE-NUMBER"), makeSymbol("EPE-CAPITALIZATION"));

    private static final SubLList $list142 = list(makeSymbol("_CSETF-EPE-OPEN-STATES"), makeSymbol("_CSETF-EPE-SUFFIXES"), makeSymbol("_CSETF-EPE-UNKNOWN-WORD"), makeSymbol("_CSETF-EPE-SUFFIX"), makeSymbol("_CSETF-EPE-HYPHEN"), makeSymbol("_CSETF-EPE-NUMBER"), makeSymbol("_CSETF-EPE-CAPITALIZATION"));

    private static final SubLSymbol EMISSION_PROBABILITY_ESTIMATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EMISSION-PROBABILITY-ESTIMATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list144 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EMISSION-PROBABILITY-ESTIMATOR-P"));

    private static final SubLSymbol EPE_OPEN_STATES = makeSymbol("EPE-OPEN-STATES");

    private static final SubLSymbol _CSETF_EPE_OPEN_STATES = makeSymbol("_CSETF-EPE-OPEN-STATES");

    private static final SubLSymbol EPE_SUFFIXES = makeSymbol("EPE-SUFFIXES");

    private static final SubLSymbol _CSETF_EPE_SUFFIXES = makeSymbol("_CSETF-EPE-SUFFIXES");

    private static final SubLSymbol EPE_UNKNOWN_WORD = makeSymbol("EPE-UNKNOWN-WORD");

    private static final SubLSymbol _CSETF_EPE_UNKNOWN_WORD = makeSymbol("_CSETF-EPE-UNKNOWN-WORD");

    private static final SubLSymbol EPE_SUFFIX = makeSymbol("EPE-SUFFIX");

    private static final SubLSymbol _CSETF_EPE_SUFFIX = makeSymbol("_CSETF-EPE-SUFFIX");

    private static final SubLSymbol EPE_HYPHEN = makeSymbol("EPE-HYPHEN");

    private static final SubLSymbol _CSETF_EPE_HYPHEN = makeSymbol("_CSETF-EPE-HYPHEN");

    private static final SubLSymbol EPE_NUMBER = makeSymbol("EPE-NUMBER");

    private static final SubLSymbol _CSETF_EPE_NUMBER = makeSymbol("_CSETF-EPE-NUMBER");

    private static final SubLSymbol EPE_CAPITALIZATION = makeSymbol("EPE-CAPITALIZATION");

    private static final SubLSymbol _CSETF_EPE_CAPITALIZATION = makeSymbol("_CSETF-EPE-CAPITALIZATION");















    private static final SubLSymbol MAKE_EMISSION_PROBABILITY_ESTIMATOR = makeSymbol("MAKE-EMISSION-PROBABILITY-ESTIMATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EMISSION_PROBABILITY_ESTIMATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EMISSION-PROBABILITY-ESTIMATOR-METHOD");

    private static final SubLString $str168$Unable_to_initialize_pos_tagger_p = makeString("Unable to initialize pos tagger pos estimator from ~a");

    private static final SubLString $str169$_UNKNOWN = makeString(":UNKNOWN");

    private static final SubLString $str170$_NOSUFF = makeString(":NOSUFF");

    private static final SubLString $str171$_CAP = makeString(":CAP");

    private static final SubLString $str172$_NOCAP = makeString(":NOCAP");

    private static final SubLString $str173$_HYP = makeString(":HYP");

    private static final SubLString $str174$_NOHYP = makeString(":NOHYP");

    private static final SubLString $str175$_DIGIT = makeString(":DIGIT");

    private static final SubLString $str176$_NODIGIT = makeString(":NODIGIT");



    private static final SubLString $str178$Unable_to_load_file__ = makeString("Unable to load file. ");

    public static SubLObject new_cpm(final SubLObject size, SubLObject source_path, SubLObject testfn) {
        if (source_path == UNPROVIDED) {
            source_path = NIL;
        }
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cpm = make_hash_table(size, testfn, UNPROVIDED);
        if (NIL != source_path) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(source_path, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str20$Unable_to_open__S, source_path);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    SubLObject current;
                    SubLObject datum;
                    SubLObject conditioned;
                    SubLObject conditioning;
                    SubLObject probability;
                    for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                        datum = current = string_utilities.split_string(line, $token_delimiters$.getGlobalValue());
                        conditioned = NIL;
                        conditioning = NIL;
                        probability = NIL;
                        destructuring_bind_must_consp(current, datum, $list21);
                        conditioned = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list21);
                        conditioning = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list21);
                        probability = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            cpm_set(cpm, conditioned, parse_integer(conditioning, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), sublisp_float(read_from_string(probability, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED));
                        } else {
                            cdestructuring_bind_error(datum, $list21);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return cpm;
    }

    public static SubLObject cpm_get_distribution(final SubLObject cpm, final SubLObject conditioned) {
        return gethash_without_values(conditioned, cpm, NIL);
    }

    public static SubLObject cpm_get(final SubLObject cpm, final SubLObject conditioned, final SubLObject conditioning, SubLObject testfn, SubLObject v_default) {
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQL);
        }
        if (v_default == UNPROVIDED) {
            v_default = $impossibility$.getGlobalValue();
        }
        final SubLObject probability = assoc(conditioning, cpm_get_distribution(cpm, conditioned), testfn, UNPROVIDED).rest();
        return NIL != probability ? probability : v_default;
    }

    public static SubLObject cpm_set(final SubLObject cpm, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        SubLObject distribution = cpm_get_distribution(cpm, conditioned);
        distribution = cons(cons(conditioning, probability), distribution);
        sethash(conditioned, cpm, distribution);
        return cpm;
    }

    public static SubLObject new_cpa(final SubLObject x_dimension, final SubLObject y_dimension, SubLObject source_path, SubLObject parsefn) {
        if (source_path == UNPROVIDED) {
            source_path = NIL;
        }
        if (parsefn == UNPROVIDED) {
            parsefn = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cpa = make_vector(x_dimension, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(x_dimension); i = add(i, ONE_INTEGER)) {
            set_aref(cpa, i, make_vector(y_dimension, $low_probability$.getGlobalValue()));
        }
        if (NIL != source_path) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(source_path, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str20$Unable_to_open__S, source_path);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    SubLObject current;
                    SubLObject datum;
                    SubLObject conditioned;
                    SubLObject conditioning;
                    SubLObject probability;
                    for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                        datum = current = string_utilities.split_string(line, $token_delimiters$.getGlobalValue());
                        conditioned = NIL;
                        conditioning = NIL;
                        probability = NIL;
                        destructuring_bind_must_consp(current, datum, $list21);
                        conditioned = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list21);
                        conditioning = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list21);
                        probability = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            cpa_set(cpa, read_from_string(conditioned, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), read_from_string(conditioning, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), funcall(parsefn, probability));
                        } else {
                            cdestructuring_bind_error(datum, $list21);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return cpa;
    }

    public static SubLObject cpa_get(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cpa = NIL;
        SubLObject conditioned = NIL;
        SubLObject conditioning = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        cpa = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        conditioned = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        conditioning = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(AREF, list(AREF, cpa, conditioned), conditioning);
        }
        cdestructuring_bind_error(datum, $list22);
        return NIL;
    }

    public static SubLObject cpa_set(final SubLObject cpa, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        set_aref(aref(cpa, conditioned), conditioning, probability);
        return cpa;
    }

    public static SubLObject create_cpf(final SubLObject filename, final SubLObject size, SubLObject testfn, SubLObject avg_size) {
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQUAL);
        }
        if (avg_size == UNPROVIDED) {
            avg_size = $int$256;
        }
        return file_hash_table.create_file_hash_table(filename, size, avg_size, testfn, UNPROVIDED);
    }

    public static SubLObject new_cpf(final SubLObject source_path, SubLObject testfn) {
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQUAL);
        }
        return file_hash_table.open_file_hash_table_read_only(source_path, testfn, $IMAGE_INDEPENDENT_CFASL);
    }

    public static SubLObject finalize_cpf(final SubLObject cpf) {
        return file_hash_table.finalize_file_hash_table(cpf);
    }

    public static SubLObject cpf_get_distribution(final SubLObject cpf, final SubLObject conditioned) {
        return file_hash_table.get_file_hash_table(conditioned, cpf, UNPROVIDED);
    }

    public static SubLObject cpf_get(final SubLObject cpf, final SubLObject conditioned, final SubLObject conditioning, SubLObject testfn, SubLObject v_default) {
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQL);
        }
        if (v_default == UNPROVIDED) {
            v_default = $impossibility$.getGlobalValue();
        }
        final SubLObject probability = assoc(conditioning, cpf_get_distribution(cpf, conditioned), testfn, UNPROVIDED).rest();
        return NIL != probability ? probability : v_default;
    }

    public static SubLObject cpf_set(final SubLObject cpf, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        SubLObject distribution = cpf_get_distribution(cpf, conditioned);
        distribution = cons(cons(conditioning, probability), distribution);
        file_hash_table.put_file_hash_table(conditioned, cpf, distribution);
        return cpf;
    }

    public static SubLObject cpf_finalize(final SubLObject cpf) {
        file_hash_table.finalize_file_hash_table(cpf);
        return cpf;
    }

    public static SubLObject cpf_create_backing_store(final SubLObject source_path, final SubLObject backing_store, final SubLObject size, SubLObject avg_size) {
        if (avg_size == UNPROVIDED) {
            avg_size = $int$256;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Filesys.probe_file(source_path)) {
            Errors.error(cconcatenate($str26$Unable_to_initialize_file_hashtab, file_utilities.why_not_probe_fileP(source_path)));
        }
        final SubLObject cpf = create_cpf(backing_store, size, EQUAL, avg_size);
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
                noting_percent_progress_preamble($str27$Building_conditional_probability_);
                SubLObject stream = NIL;
                try {
                    final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream = compatibility.open_text(source_path, $INPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$1, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error($str20$Unable_to_open__S, source_path);
                    }
                    final SubLObject stream_var = stream;
                    if (stream_var.isStream()) {
                        final SubLObject length_var = file_length(stream_var);
                        final SubLObject stream_var_$2 = stream_var;
                        SubLObject line_number_var = NIL;
                        SubLObject line = NIL;
                        line_number_var = ZERO_INTEGER;
                        for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$2); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$2)) {
                            SubLObject current;
                            final SubLObject datum = current = string_utilities.split_string(line, $token_delimiters$.getGlobalValue());
                            SubLObject conditioned = NIL;
                            SubLObject conditioning = NIL;
                            SubLObject probability = NIL;
                            destructuring_bind_must_consp(current, datum, $list21);
                            conditioned = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list21);
                            conditioning = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list21);
                            probability = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                cpf_set(cpf, conditioned, parse_integer(conditioning, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), sublisp_float(read_from_string(probability, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED));
                            } else {
                                cdestructuring_bind_error(datum, $list21);
                            }
                            note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
                            line_number_var = number_utilities.f_1X(line_number_var);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return cpf_finalize(cpf);
    }

    public static SubLObject new_trellis_entry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject probability = NIL;
        SubLObject source = NIL;
        destructuring_bind_must_consp(current, datum, $list28);
        probability = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        source = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CONS, probability, source);
        }
        cdestructuring_bind_error(datum, $list28);
        return NIL;
    }

    public static SubLObject trellis_entry_probability(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject entry = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        entry = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CAR, entry);
        }
        cdestructuring_bind_error(datum, $list30);
        return NIL;
    }

    public static SubLObject trellis_entry_source(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject entry = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        entry = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CDR, entry);
        }
        cdestructuring_bind_error(datum, $list30);
        return NIL;
    }

    public static SubLObject trellis_entry_update(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject entry = NIL;
        SubLObject probability = NIL;
        SubLObject source = NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        entry = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        probability = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        source = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(CSETF, list(CAR, entry), probability), list(CSETF, list(CDR, entry), source));
        }
        cdestructuring_bind_error(datum, $list33);
        return NIL;
    }

    public static SubLObject new_trellis() {
        return list(NIL);
    }

    public static SubLObject trellis_new_column(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trellis = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        trellis = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CPUSH, NIL, trellis);
        }
        cdestructuring_bind_error(datum, $list36);
        return NIL;
    }

    public static SubLObject trellis_current_column(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trellis = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        trellis = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CAR, trellis);
        }
        cdestructuring_bind_error(datum, $list36);
        return NIL;
    }

    public static SubLObject trellis_get(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trellis = NIL;
        SubLObject key = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        trellis = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        key = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CDR, listS(ASSOC, key, list(TRELLIS_CURRENT_COLUMN, trellis), $list41));
        }
        cdestructuring_bind_error(datum, $list38);
        return NIL;
    }

    public static SubLObject trellis_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trellis = NIL;
        SubLObject key = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list42);
        trellis = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(RPLACA, trellis, list(ACONS, key, value, list(CAR, trellis)));
        }
        cdestructuring_bind_error(datum, $list42);
        return NIL;
    }

    public static SubLObject trellis_finalize_column(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trellis = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        trellis = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CPOP, trellis);
        }
        cdestructuring_bind_error(datum, $list36);
        return NIL;
    }

    public static SubLObject trellis_get_max_entry(final SubLObject trellis) {
        SubLObject max_probability = $impossibility$.getGlobalValue();
        SubLObject result = NIL;
        SubLObject probability = NIL;
        SubLObject cdolist_list_var = trellis.first();
        SubLObject stateXentry = NIL;
        stateXentry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            probability = stateXentry.rest().first();
            if (probability.numGE(max_probability)) {
                result = stateXentry;
                max_probability = probability;
            }
            cdolist_list_var = cdolist_list_var.rest();
            stateXentry = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject tagger_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tagger_p(final SubLObject v_object) {
        return v_object.getClass() == pos_tagger.$tagger_native.class ? T : NIL;
    }

    public static SubLObject tagger_hmm(final SubLObject v_object) {
        assert NIL != tagger_p(v_object) : "pos_tagger.tagger_p(v_object) " + "CommonSymbols.NIL != pos_tagger.tagger_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject tagger_state_interpretation(final SubLObject v_object) {
        assert NIL != tagger_p(v_object) : "pos_tagger.tagger_p(v_object) " + "CommonSymbols.NIL != pos_tagger.tagger_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_tagger_hmm(final SubLObject v_object, final SubLObject value) {
        assert NIL != tagger_p(v_object) : "pos_tagger.tagger_p(v_object) " + "CommonSymbols.NIL != pos_tagger.tagger_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tagger_state_interpretation(final SubLObject v_object, final SubLObject value) {
        assert NIL != tagger_p(v_object) : "pos_tagger.tagger_p(v_object) " + "CommonSymbols.NIL != pos_tagger.tagger_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_tagger(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new pos_tagger.$tagger_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HMM)) {
                _csetf_tagger_hmm(v_new, current_value);
            } else
                if (pcase_var.eql($STATE_INTERPRETATION)) {
                    _csetf_tagger_state_interpretation(v_new, current_value);
                } else {
                    Errors.error($str61$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_tagger(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TAGGER, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HMM, tagger_hmm(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE_INTERPRETATION, tagger_state_interpretation(obj));
        funcall(visitor_fn, obj, $END, MAKE_TAGGER, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_tagger_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tagger(obj, visitor_fn);
    }

    public static SubLObject new_tagger(SubLObject source_path) {
        if (source_path == UNPROVIDED) {
            source_path = $tagger_data_path$.getDynamicValue();
        }
        assert NIL != listp(source_path) : "Types.listp(source_path) " + "CommonSymbols.NIL != Types.listp(source_path) " + source_path;
        final SubLObject tagger = make_tagger(UNPROVIDED);
        _csetf_tagger_hmm(tagger, new_hmm(source_path));
        _csetf_tagger_state_interpretation(tagger, new_state_interpretation($int$50, source_path));
        return tagger;
    }

    public static SubLObject finalize_tagger(final SubLObject tagger) {
        assert NIL != tagger_p(tagger) : "pos_tagger.tagger_p(tagger) " + "CommonSymbols.NIL != pos_tagger.tagger_p(tagger) " + tagger;
        return finalize_hmm(tagger_hmm(tagger));
    }

    public static SubLObject tagger_tag_document(final SubLObject tagger, final SubLObject v_document) {
        assert NIL != tagger_p(tagger) : "pos_tagger.tagger_p(tagger) " + "CommonSymbols.NIL != pos_tagger.tagger_p(tagger) " + tagger;
        assert NIL != document.document_p(v_document) : "document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) " + v_document;
        final SubLObject vector_var = document.document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$5;
        SubLObject backwardP_var_$6;
        SubLObject length_$7;
        SubLObject v_iteration_$8;
        SubLObject element_num_$9;
        SubLObject sentence;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$5 = document.paragraph_sentences(paragraph);
            backwardP_var_$6 = NIL;
            for (length_$7 = length(vector_var_$5), v_iteration_$8 = NIL, v_iteration_$8 = ZERO_INTEGER; v_iteration_$8.numL(length_$7); v_iteration_$8 = add(v_iteration_$8, ONE_INTEGER)) {
                element_num_$9 = (NIL != backwardP_var_$6) ? subtract(length_$7, v_iteration_$8, ONE_INTEGER) : v_iteration_$8;
                sentence = aref(vector_var_$5, element_num_$9);
                tagger_tag_sentence(tagger, sentence);
            }
        }
        return v_document;
    }

    public static SubLObject tagger_tag_sentence(final SubLObject tagger, final SubLObject sentence) {
        assert NIL != tagger_p(tagger) : "pos_tagger.tagger_p(tagger) " + "CommonSymbols.NIL != pos_tagger.tagger_p(tagger) " + tagger;
        assert NIL != document.sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        final SubLObject words = document.sentence_yield(sentence);
        if (length(words).isPositive()) {
            final SubLObject initial_spelling = document.word_string(aref(words, ZERO_INTEGER));
            tagger_normalize_initial_capitalization(tagger, words);
            hmm_most_likely_path_probability(tagger_hmm(tagger), words);
            document.word_update(aref(words, ZERO_INTEGER), list($STRING, initial_spelling));
            SubLObject word = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = length(words), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                word = aref(words, i);
                patch_word_tag(word);
                document.word_update(word, list($CATEGORY, state_interpretation_get(tagger_state_interpretation(tagger), document.word_category(word))));
            }
        }
        return sentence;
    }

    public static SubLObject patch_word_tag(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_integer = assoc(cons(document.word_string(word), document.word_category(word)), $word_tag_patches$.getDynamicValue(thread), EQUAL, UNPROVIDED).rest();
        return NIL != new_integer ? document.word_update(word, list($CATEGORY, new_integer)) : NIL;
    }

    public static SubLObject tagger_normalize_initial_capitalization(final SubLObject tagger, final SubLObject words) {
        assert NIL != tagger_p(tagger) : "pos_tagger.tagger_p(tagger) " + "CommonSymbols.NIL != pos_tagger.tagger_p(tagger) " + tagger;
        assert NIL != vectorp(words) : "Types.vectorp(words) " + "CommonSymbols.NIL != Types.vectorp(words) " + words;
        if (NIL == exclude_from_normalizationP(document.word_string(aref(words, ZERO_INTEGER)))) {
            final SubLObject orig_first = document.new_word(list($STRING, document.word_string(aref(words, ZERO_INTEGER))));
            final SubLObject second_word = (length(words).numG(ONE_INTEGER)) ? document.new_word(list($STRING, document.word_string(aref(words, ONE_INTEGER)))) : document.new_word($list75);
            final SubLObject downcase_first = document.new_word(list($STRING, Strings.string_downcase(document.word_string(orig_first), UNPROVIDED, UNPROVIDED)));
            SubLObject orig_prob = $impossibility$.getGlobalValue();
            SubLObject downcase_prob = $impossibility$.getGlobalValue();
            final SubLObject orig_sentence = vector(new SubLObject[]{ orig_first, second_word });
            final SubLObject downcase_sentence = vector(new SubLObject[]{ downcase_first, second_word });
            final SubLObject hmm = tagger_hmm(tagger);
            if (NIL != state_set_known_word(hmm_states(hmm), orig_first)) {
                orig_prob = hmm_most_likely_path_probability(hmm, orig_sentence);
            }
            if (NIL != state_set_known_word(hmm_states(hmm), downcase_first)) {
                downcase_prob = hmm_most_likely_path_probability(hmm, downcase_sentence);
            }
            if (downcase_prob.numG(orig_prob)) {
                document.word_update(aref(words, ZERO_INTEGER), list($STRING, document.word_string(downcase_first)));
            }
        }
        return words;
    }

    public static SubLObject exclude_from_normalizationP(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return member(string, $exclude_from_normalization$.getDynamicValue(thread), EQUAL, UNPROVIDED);
    }

    public static SubLObject new_state_interpretation(final SubLObject size, final SubLObject source_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state_interpretation = make_vector(size, UNPROVIDED);
        final SubLObject state_interpretation_path = file_utilities.cyc_home_filename(source_path, $state_interpretation_resource$.getGlobalValue(), $$$txt);
        SubLObject tokens = NIL;
        SubLObject state = NIL;
        SubLObject interpretation = NIL;
        if (NIL != Filesys.probe_file(state_interpretation_path)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(state_interpretation_path, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str20$Unable_to_open__S, state_interpretation_path);
                }
                final SubLObject infile = stream;
                if (infile.isStream()) {
                    SubLObject line;
                    for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                        tokens = string_utilities.split_string(line, $token_delimiters$.getGlobalValue());
                        state = parse_integer(tokens.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        interpretation = (length(tokens.rest()).numG(ONE_INTEGER)) ? tokens.rest() : second(tokens);
                        set_aref(state_interpretation, state, make_keyword(interpretation));
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } else {
            Errors.error($str77$Unable_to_initialize_pos_tagger_s, state_interpretation_path);
        }
        return state_interpretation;
    }

    public static SubLObject state_interpretation_get(final SubLObject si, final SubLObject state) {
        return aref(si, state);
    }

    public static SubLObject hmm_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject hmm_p(final SubLObject v_object) {
        return v_object.getClass() == pos_tagger.$hmm_native.class ? T : NIL;
    }

    public static SubLObject hmm_initial_state(final SubLObject v_object) {
        assert NIL != hmm_p(v_object) : "pos_tagger.hmm_p(v_object) " + "CommonSymbols.NIL != pos_tagger.hmm_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject hmm_states(final SubLObject v_object) {
        assert NIL != hmm_p(v_object) : "pos_tagger.hmm_p(v_object) " + "CommonSymbols.NIL != pos_tagger.hmm_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject hmm_transitions(final SubLObject v_object) {
        assert NIL != hmm_p(v_object) : "pos_tagger.hmm_p(v_object) " + "CommonSymbols.NIL != pos_tagger.hmm_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_hmm_initial_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != hmm_p(v_object) : "pos_tagger.hmm_p(v_object) " + "CommonSymbols.NIL != pos_tagger.hmm_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_hmm_states(final SubLObject v_object, final SubLObject value) {
        assert NIL != hmm_p(v_object) : "pos_tagger.hmm_p(v_object) " + "CommonSymbols.NIL != pos_tagger.hmm_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_hmm_transitions(final SubLObject v_object, final SubLObject value) {
        assert NIL != hmm_p(v_object) : "pos_tagger.hmm_p(v_object) " + "CommonSymbols.NIL != pos_tagger.hmm_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_hmm(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new pos_tagger.$hmm_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INITIAL_STATE)) {
                _csetf_hmm_initial_state(v_new, current_value);
            } else
                if (pcase_var.eql($STATES)) {
                    _csetf_hmm_states(v_new, current_value);
                } else
                    if (pcase_var.eql($TRANSITIONS)) {
                        _csetf_hmm_transitions(v_new, current_value);
                    } else {
                        Errors.error($str61$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_hmm(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HMM, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INITIAL_STATE, hmm_initial_state(obj));
        funcall(visitor_fn, obj, $SLOT, $STATES, hmm_states(obj));
        funcall(visitor_fn, obj, $SLOT, $TRANSITIONS, hmm_transitions(obj));
        funcall(visitor_fn, obj, $END, MAKE_HMM, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_hmm_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_hmm(obj, visitor_fn);
    }

    public static SubLObject new_hmm(final SubLObject source_path) {
        final SubLObject path = file_utilities.cyc_home_filename(source_path, $initial_state_resource$.getGlobalValue(), $$$txt);
        final SubLObject hmm = make_hmm(UNPROVIDED);
        if (NIL != Filesys.probe_file(path)) {
            _csetf_hmm_initial_state(hmm, parse_integer(load_list(path).first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } else {
            Errors.error($str97$Unable_to_initialize_pos_tagger_H, path);
        }
        _csetf_hmm_states(hmm, new_state_set(source_path, UNPROVIDED));
        _csetf_hmm_transitions(hmm, new_transition_set(source_path));
        return hmm;
    }

    public static SubLObject finalize_hmm(final SubLObject hmm) {
        return finalize_state_set(hmm_states(hmm));
    }

    public static SubLObject hmm_most_likely_path_probability(final SubLObject hmm, final SubLObject words) {
        SubLObject trellis = new_trellis();
        final SubLObject states = hmm_states(hmm);
        final SubLObject transitions = hmm_transitions(hmm);
        SubLObject word_cond_state_prob = NIL;
        SubLObject state = NIL;
        SubLObject probability = NIL;
        SubLObject max_entry = NIL;
        SubLObject prev_column = NIL;
        SubLObject prev_state = NIL;
        SubLObject transition_distribution = NIL;
        SubLObject word = NIL;
        rplaca(trellis, acons(hmm_initial_state(hmm), cons($certainty$.getGlobalValue(), NIL), trellis.first()));
        SubLObject cdotimes_end_var;
        SubLObject j;
        SubLObject cdolist_list_var;
        SubLObject stateXprob;
        SubLObject cdolist_list_var_$10;
        SubLObject prev_stateXtrellis_entry;
        for (cdotimes_end_var = length(words), j = NIL, j = ZERO_INTEGER; j.numL(cdotimes_end_var); j = add(j, ONE_INTEGER)) {
            word = aref(words, j);
            prev_column = trellis.first();
            trellis = cons(NIL, trellis);
            cdolist_list_var = state_set_get_distribution(states, word);
            stateXprob = NIL;
            stateXprob = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                state = stateXprob.first();
                word_cond_state_prob = stateXprob.rest();
                max_entry = cons($impossibility$.getGlobalValue(), ZERO_INTEGER);
                transition_distribution = transition_set_get_distribution(transitions, state);
                cdolist_list_var_$10 = prev_column;
                prev_stateXtrellis_entry = NIL;
                prev_stateXtrellis_entry = cdolist_list_var_$10.first();
                while (NIL != cdolist_list_var_$10) {
                    prev_state = prev_stateXtrellis_entry.first();
                    probability = add(prev_stateXtrellis_entry.rest().first(), aref(transition_distribution, prev_state), word_cond_state_prob);
                    if (probability.numG(max_entry.first())) {
                        rplaca(max_entry, probability);
                        rplacd(max_entry, prev_state);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    prev_stateXtrellis_entry = cdolist_list_var_$10.first();
                } 
                rplaca(trellis, acons(state, max_entry, trellis.first()));
                cdolist_list_var = cdolist_list_var.rest();
                stateXprob = cdolist_list_var.first();
            } 
        }
        SubLObject word_index = subtract(length(words), ONE_INTEGER);
        final SubLObject maxstateXentry = trellis_get_max_entry(trellis);
        SubLObject max_state = maxstateXentry.first();
        while (!word_index.isNegative()) {
            document.word_update(aref(words, word_index), list($CATEGORY, max_state));
            max_state = assoc(max_state, trellis.first(), symbol_function(EQL), UNPROVIDED).rest().rest();
            word_index = subtract(word_index, ONE_INTEGER);
            trellis = trellis.rest();
        } 
        return maxstateXentry.rest().first();
    }

    public static SubLObject state_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject state_set_p(final SubLObject v_object) {
        return v_object.getClass() == pos_tagger.$state_set_native.class ? T : NIL;
    }

    public static SubLObject state_set_store(final SubLObject v_object) {
        assert NIL != state_set_p(v_object) : "pos_tagger.state_set_p(v_object) " + "CommonSymbols.NIL != pos_tagger.state_set_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject state_set_estimator(final SubLObject v_object) {
        assert NIL != state_set_p(v_object) : "pos_tagger.state_set_p(v_object) " + "CommonSymbols.NIL != pos_tagger.state_set_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject state_set_cache(final SubLObject v_object) {
        assert NIL != state_set_p(v_object) : "pos_tagger.state_set_p(v_object) " + "CommonSymbols.NIL != pos_tagger.state_set_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_state_set_store(final SubLObject v_object, final SubLObject value) {
        assert NIL != state_set_p(v_object) : "pos_tagger.state_set_p(v_object) " + "CommonSymbols.NIL != pos_tagger.state_set_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_state_set_estimator(final SubLObject v_object, final SubLObject value) {
        assert NIL != state_set_p(v_object) : "pos_tagger.state_set_p(v_object) " + "CommonSymbols.NIL != pos_tagger.state_set_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_state_set_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != state_set_p(v_object) : "pos_tagger.state_set_p(v_object) " + "CommonSymbols.NIL != pos_tagger.state_set_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_state_set(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new pos_tagger.$state_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STORE)) {
                _csetf_state_set_store(v_new, current_value);
            } else
                if (pcase_var.eql($ESTIMATOR)) {
                    _csetf_state_set_estimator(v_new, current_value);
                } else
                    if (pcase_var.eql($CACHE)) {
                        _csetf_state_set_cache(v_new, current_value);
                    } else {
                        Errors.error($str61$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_state_set(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_STATE_SET, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STORE, state_set_store(obj));
        funcall(visitor_fn, obj, $SLOT, $ESTIMATOR, state_set_estimator(obj));
        funcall(visitor_fn, obj, $SLOT, $CACHE, state_set_cache(obj));
        funcall(visitor_fn, obj, $END, MAKE_STATE_SET, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_state_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_state_set(obj, visitor_fn);
    }

    public static SubLObject new_state_set(final SubLObject source_path, SubLObject cache_capacity) {
        if (cache_capacity == UNPROVIDED) {
            cache_capacity = $state_set_cache_capacity$.getDynamicValue();
        }
        final SubLObject path = file_utilities.cyc_home_filename(source_path, $state_resource$.getGlobalValue(), $$$fht);
        final SubLObject state_set = make_state_set(UNPROVIDED);
        if (NIL != Filesys.probe_file(path)) {
            _csetf_state_set_store(state_set, new_cpf(path, symbol_function(EQUAL)));
        } else {
            Errors.error($str118$Unable_to_initialize_pos_tagger_s, path);
        }
        _csetf_state_set_estimator(state_set, new_emission_probability_estimator(source_path));
        _csetf_state_set_cache(state_set, cache.new_cache(cache_capacity, symbol_function(EQUAL)));
        return state_set;
    }

    public static SubLObject finalize_state_set(final SubLObject state_set) {
        return finalize_cpf(state_set_store(state_set));
    }

    public static SubLObject state_set_get_distribution(final SubLObject state_set, final SubLObject word) {
        final SubLObject string = document.word_string(word);
        SubLObject distribution = cache.cache_get(state_set_cache(state_set), string);
        if (NIL == distribution) {
            distribution = cpf_get_distribution(state_set_store(state_set), string);
            if (NIL == distribution) {
                distribution = epe_get_distribution(state_set_estimator(state_set), string);
            }
            cache.cache_set(state_set_cache(state_set), string, distribution);
        }
        return distribution;
    }

    public static SubLObject state_set_known_word(final SubLObject states, final SubLObject word) {
        final SubLObject distribution = cache.cache_get(state_set_cache(states), document.word_string(word));
        return NIL != distribution ? distribution : cpf_get_distribution(state_set_store(states), document.word_string(word));
    }

    public static SubLObject transition_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject transition_set_p(final SubLObject v_object) {
        return v_object.getClass() == pos_tagger.$transition_set_native.class ? T : NIL;
    }

    public static SubLObject transition_set_known_probabilities(final SubLObject v_object) {
        assert NIL != transition_set_p(v_object) : "pos_tagger.transition_set_p(v_object) " + "CommonSymbols.NIL != pos_tagger.transition_set_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject transition_set_estimated_probabilities(final SubLObject v_object) {
        assert NIL != transition_set_p(v_object) : "pos_tagger.transition_set_p(v_object) " + "CommonSymbols.NIL != pos_tagger.transition_set_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_transition_set_known_probabilities(final SubLObject v_object, final SubLObject value) {
        assert NIL != transition_set_p(v_object) : "pos_tagger.transition_set_p(v_object) " + "CommonSymbols.NIL != pos_tagger.transition_set_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_transition_set_estimated_probabilities(final SubLObject v_object, final SubLObject value) {
        assert NIL != transition_set_p(v_object) : "pos_tagger.transition_set_p(v_object) " + "CommonSymbols.NIL != pos_tagger.transition_set_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_transition_set(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new pos_tagger.$transition_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($KNOWN_PROBABILITIES)) {
                _csetf_transition_set_known_probabilities(v_new, current_value);
            } else
                if (pcase_var.eql($ESTIMATED_PROBABILITIES)) {
                    _csetf_transition_set_estimated_probabilities(v_new, current_value);
                } else {
                    Errors.error($str61$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_transition_set(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TRANSITION_SET, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $KNOWN_PROBABILITIES, transition_set_known_probabilities(obj));
        funcall(visitor_fn, obj, $SLOT, $ESTIMATED_PROBABILITIES, transition_set_estimated_probabilities(obj));
        funcall(visitor_fn, obj, $END, MAKE_TRANSITION_SET, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_transition_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_transition_set(obj, visitor_fn);
    }

    public static SubLObject new_transition_set(final SubLObject source_path) {
        final SubLObject transition_set = make_transition_set(UNPROVIDED);
        final SubLObject transition_path = file_utilities.cyc_home_filename(source_path, $transition_resource$.getGlobalValue(), $$$txt);
        if (NIL != Filesys.probe_file(transition_path)) {
            _csetf_transition_set_known_probabilities(transition_set, new_cpa($int$50, $int$50, transition_path, symbol_function(READ_FROM_STRING)));
        } else {
            Errors.error($str136$Unable_to_initialize_pos_tagger_H, transition_path);
        }
        _csetf_transition_set_estimated_probabilities(transition_set, NIL);
        return transition_set;
    }

    public static SubLObject transition_set_get(final SubLObject transition_set, final SubLObject conditioned, final SubLObject conditioning) {
        return aref(aref(transition_set_known_probabilities(transition_set), conditioned), conditioning);
    }

    public static SubLObject transition_set_get_distribution(final SubLObject transition_set, final SubLObject conditioned) {
        return aref(transition_set_known_probabilities(transition_set), conditioned);
    }

    public static SubLObject transition_set_set(final SubLObject transition_set, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        cpa_set(transition_set_known_probabilities(transition_set), conditioned, conditioning, probability);
        return transition_set;
    }

    public static SubLObject emission_probability_estimator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject emission_probability_estimator_p(final SubLObject v_object) {
        return v_object.getClass() == pos_tagger.$emission_probability_estimator_native.class ? T : NIL;
    }

    public static SubLObject epe_open_states(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject epe_suffixes(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject epe_unknown_word(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject epe_suffix(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject epe_hyphen(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject epe_number(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject epe_capitalization(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_epe_open_states(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_epe_suffixes(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_epe_unknown_word(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_epe_suffix(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_epe_hyphen(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_epe_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_epe_capitalization(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "pos_tagger.emission_probability_estimator_p(v_object) " + "CommonSymbols.NIL != pos_tagger.emission_probability_estimator_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_emission_probability_estimator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new pos_tagger.$emission_probability_estimator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($OPEN_STATES)) {
                _csetf_epe_open_states(v_new, current_value);
            } else
                if (pcase_var.eql($SUFFIXES)) {
                    _csetf_epe_suffixes(v_new, current_value);
                } else
                    if (pcase_var.eql($UNKNOWN_WORD)) {
                        _csetf_epe_unknown_word(v_new, current_value);
                    } else
                        if (pcase_var.eql($SUFFIX)) {
                            _csetf_epe_suffix(v_new, current_value);
                        } else
                            if (pcase_var.eql($HYPHEN)) {
                                _csetf_epe_hyphen(v_new, current_value);
                            } else
                                if (pcase_var.eql($NUMBER)) {
                                    _csetf_epe_number(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CAPITALIZATION)) {
                                        _csetf_epe_capitalization(v_new, current_value);
                                    } else {
                                        Errors.error($str61$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_emission_probability_estimator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EMISSION_PROBABILITY_ESTIMATOR, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $OPEN_STATES, epe_open_states(obj));
        funcall(visitor_fn, obj, $SLOT, $SUFFIXES, epe_suffixes(obj));
        funcall(visitor_fn, obj, $SLOT, $UNKNOWN_WORD, epe_unknown_word(obj));
        funcall(visitor_fn, obj, $SLOT, $SUFFIX, epe_suffix(obj));
        funcall(visitor_fn, obj, $SLOT, $HYPHEN, epe_hyphen(obj));
        funcall(visitor_fn, obj, $SLOT, $NUMBER, epe_number(obj));
        funcall(visitor_fn, obj, $SLOT, $CAPITALIZATION, epe_capitalization(obj));
        funcall(visitor_fn, obj, $END, MAKE_EMISSION_PROBABILITY_ESTIMATOR, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_emission_probability_estimator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_emission_probability_estimator(obj, visitor_fn);
    }

    public static SubLObject new_emission_probability_estimator(final SubLObject source_path) {
        final SubLObject open_states_path = file_utilities.cyc_home_filename(source_path, $open_states_resource$.getGlobalValue(), $$$txt);
        final SubLObject suffixes_path = file_utilities.cyc_home_filename(source_path, $suffixes_resource$.getGlobalValue(), $$$txt);
        final SubLObject unknown_word_path = file_utilities.cyc_home_filename(source_path, $unknown_word_resource$.getGlobalValue(), $$$txt);
        final SubLObject suffix_path = file_utilities.cyc_home_filename(source_path, $suffix_resource$.getGlobalValue(), $$$txt);
        final SubLObject hyphen_path = file_utilities.cyc_home_filename(source_path, $hyphen_resource$.getGlobalValue(), $$$txt);
        final SubLObject number_path = file_utilities.cyc_home_filename(source_path, $number_resource$.getGlobalValue(), $$$txt);
        final SubLObject capitalization_path = file_utilities.cyc_home_filename(source_path, $capitalization_resource$.getGlobalValue(), $$$txt);
        final SubLObject estimator = make_emission_probability_estimator(UNPROVIDED);
        final SubLObject suffix_trie = strie.new_strie(symbol_function(EQL));
        if (NIL != Filesys.probe_file(open_states_path)) {
            SubLObject cdolist_list_var = load_list(open_states_path);
            SubLObject state = NIL;
            state = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                _csetf_epe_open_states(estimator, cons(parse_integer(state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), epe_open_states(estimator)));
                cdolist_list_var = cdolist_list_var.rest();
                state = cdolist_list_var.first();
            } 
        } else {
            Errors.error($str168$Unable_to_initialize_pos_tagger_p, open_states_path);
        }
        if (NIL != Filesys.probe_file(suffixes_path)) {
            SubLObject cdolist_list_var = load_list(suffixes_path);
            SubLObject suffix = NIL;
            suffix = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                strie.strie_insert(suffix_trie, reverse(suffix), suffix);
                cdolist_list_var = cdolist_list_var.rest();
                suffix = cdolist_list_var.first();
            } 
        } else {
            Errors.error($str168$Unable_to_initialize_pos_tagger_p, suffixes_path);
        }
        _csetf_epe_suffixes(estimator, suffix_trie);
        if (NIL != Filesys.probe_file(unknown_word_path)) {
            _csetf_epe_unknown_word(estimator, new_cpm(TWO_INTEGER, unknown_word_path, UNPROVIDED));
        } else {
            Errors.error($str168$Unable_to_initialize_pos_tagger_p, unknown_word_path);
        }
        if (NIL != Filesys.probe_file(suffix_path)) {
            _csetf_epe_suffix(estimator, new_cpm(TWO_INTEGER, suffix_path, UNPROVIDED));
        } else {
            Errors.error($str168$Unable_to_initialize_pos_tagger_p, suffix_path);
        }
        if (NIL != Filesys.probe_file(hyphen_path)) {
            _csetf_epe_hyphen(estimator, new_cpm(TWO_INTEGER, hyphen_path, UNPROVIDED));
        } else {
            Errors.error($str168$Unable_to_initialize_pos_tagger_p, hyphen_path);
        }
        if (NIL != Filesys.probe_file(number_path)) {
            _csetf_epe_number(estimator, new_cpm(TWO_INTEGER, number_path, UNPROVIDED));
        } else {
            Errors.error($str168$Unable_to_initialize_pos_tagger_p, number_path);
        }
        if (NIL != Filesys.probe_file(capitalization_path)) {
            _csetf_epe_capitalization(estimator, new_cpm(TWO_INTEGER, capitalization_path, UNPROVIDED));
        } else {
            Errors.error($str168$Unable_to_initialize_pos_tagger_p, capitalization_path);
        }
        return estimator;
    }

    public static SubLObject epe_get_distribution(final SubLObject epe, final SubLObject word) {
        final SubLObject suffix = suffix(epe, word);
        final SubLObject hyphen = hyphen(word);
        final SubLObject number = number(word);
        final SubLObject capitalization = capitalization(word);
        SubLObject distribution = NIL;
        SubLObject cdolist_list_var = epe_open_states(epe);
        SubLObject open_state = NIL;
        open_state = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            distribution = cons(cons(open_state, add(new SubLObject[]{ cpm_get(epe_unknown_word(epe), $str169$_UNKNOWN, open_state, symbol_function(EQL), UNPROVIDED), cpm_get(epe_suffix(epe), suffix, open_state, symbol_function(EQL), UNPROVIDED), cpm_get(epe_hyphen(epe), hyphen, open_state, symbol_function(EQL), UNPROVIDED), cpm_get(epe_capitalization(epe), capitalization, open_state, symbol_function(EQL), UNPROVIDED), cpm_get(epe_number(epe), number, open_state, symbol_function(EQL), UNPROVIDED) })), distribution);
            cdolist_list_var = cdolist_list_var.rest();
            open_state = cdolist_list_var.first();
        } 
        return distribution;
    }

    public static SubLObject suffix(final SubLObject epe, final SubLObject word) {
        if (NIL != string_utilities.char_position(strie.$strie_null_key$.getGlobalValue(), word, UNPROVIDED)) {
            return $str170$_NOSUFF;
        }
        final SubLObject suffixes = strie.strie_prefixes(epe_suffixes(epe), reverse(word));
        return NIL != suffixes ? suffixes.first().rest().first() : $str170$_NOSUFF;
    }

    public static SubLObject capitalization(final SubLObject word) {
        return NIL != upper_case_p(Strings.sublisp_char(word, ZERO_INTEGER)) ? $str171$_CAP : $str172$_NOCAP;
    }

    public static SubLObject hyphen(final SubLObject word) {
        return NIL != string_utilities.contains_charP(word, CHAR_hyphen) ? $str173$_HYP : $str174$_NOHYP;
    }

    public static SubLObject number(final SubLObject word) {
        return NIL != digit_char_p(Strings.sublisp_char(word, ZERO_INTEGER), UNPROVIDED) ? $str175$_DIGIT : $str176$_NODIGIT;
    }

    public static SubLObject load_list(final SubLObject source_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(source_path) : "Types.stringp(source_path) " + "CommonSymbols.NIL != Types.stringp(source_path) " + source_path;
        if (NIL == Filesys.probe_file(source_path)) {
            Errors.error(cconcatenate($str178$Unable_to_load_file__, file_utilities.why_not_probe_fileP(source_path)));
        }
        SubLObject strings = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(source_path, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str20$Unable_to_open__S, source_path);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    strings = cons(line, strings);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return strings;
    }

    public static SubLObject get_tagger() {
        if (NIL == $pos_tagger$.getGlobalValue()) {
            $pos_tagger$.setGlobalValue(new_tagger(UNPROVIDED));
        }
        return $pos_tagger$.getGlobalValue();
    }

    public static SubLObject declare_pos_tagger_file() {
        declareFunction(me, "new_cpm", "NEW-CPM", 1, 2, false);
        declareFunction(me, "cpm_get_distribution", "CPM-GET-DISTRIBUTION", 2, 0, false);
        declareFunction(me, "cpm_get", "CPM-GET", 3, 2, false);
        declareFunction(me, "cpm_set", "CPM-SET", 4, 0, false);
        declareFunction(me, "new_cpa", "NEW-CPA", 2, 2, false);
        declareMacro(me, "cpa_get", "CPA-GET");
        declareFunction(me, "cpa_set", "CPA-SET", 4, 0, false);
        declareFunction(me, "create_cpf", "CREATE-CPF", 2, 2, false);
        declareFunction(me, "new_cpf", "NEW-CPF", 1, 1, false);
        declareFunction(me, "finalize_cpf", "FINALIZE-CPF", 1, 0, false);
        declareFunction(me, "cpf_get_distribution", "CPF-GET-DISTRIBUTION", 2, 0, false);
        declareFunction(me, "cpf_get", "CPF-GET", 3, 2, false);
        declareFunction(me, "cpf_set", "CPF-SET", 4, 0, false);
        declareFunction(me, "cpf_finalize", "CPF-FINALIZE", 1, 0, false);
        declareFunction(me, "cpf_create_backing_store", "CPF-CREATE-BACKING-STORE", 3, 1, false);
        declareMacro(me, "new_trellis_entry", "NEW-TRELLIS-ENTRY");
        declareMacro(me, "trellis_entry_probability", "TRELLIS-ENTRY-PROBABILITY");
        declareMacro(me, "trellis_entry_source", "TRELLIS-ENTRY-SOURCE");
        declareMacro(me, "trellis_entry_update", "TRELLIS-ENTRY-UPDATE");
        declareFunction(me, "new_trellis", "NEW-TRELLIS", 0, 0, false);
        declareMacro(me, "trellis_new_column", "TRELLIS-NEW-COLUMN");
        declareMacro(me, "trellis_current_column", "TRELLIS-CURRENT-COLUMN");
        declareMacro(me, "trellis_get", "TRELLIS-GET");
        declareMacro(me, "trellis_set", "TRELLIS-SET");
        declareMacro(me, "trellis_finalize_column", "TRELLIS-FINALIZE-COLUMN");
        declareFunction(me, "trellis_get_max_entry", "TRELLIS-GET-MAX-ENTRY", 1, 0, false);
        declareFunction(me, "tagger_print_function_trampoline", "TAGGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "tagger_p", "TAGGER-P", 1, 0, false);
        new pos_tagger.$tagger_p$UnaryFunction();
        declareFunction(me, "tagger_hmm", "TAGGER-HMM", 1, 0, false);
        declareFunction(me, "tagger_state_interpretation", "TAGGER-STATE-INTERPRETATION", 1, 0, false);
        declareFunction(me, "_csetf_tagger_hmm", "_CSETF-TAGGER-HMM", 2, 0, false);
        declareFunction(me, "_csetf_tagger_state_interpretation", "_CSETF-TAGGER-STATE-INTERPRETATION", 2, 0, false);
        declareFunction(me, "make_tagger", "MAKE-TAGGER", 0, 1, false);
        declareFunction(me, "visit_defstruct_tagger", "VISIT-DEFSTRUCT-TAGGER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_tagger_method", "VISIT-DEFSTRUCT-OBJECT-TAGGER-METHOD", 2, 0, false);
        declareFunction(me, "new_tagger", "NEW-TAGGER", 0, 1, false);
        declareFunction(me, "finalize_tagger", "FINALIZE-TAGGER", 1, 0, false);
        declareFunction(me, "tagger_tag_document", "TAGGER-TAG-DOCUMENT", 2, 0, false);
        declareFunction(me, "tagger_tag_sentence", "TAGGER-TAG-SENTENCE", 2, 0, false);
        declareFunction(me, "patch_word_tag", "PATCH-WORD-TAG", 1, 0, false);
        declareFunction(me, "tagger_normalize_initial_capitalization", "TAGGER-NORMALIZE-INITIAL-CAPITALIZATION", 2, 0, false);
        declareFunction(me, "exclude_from_normalizationP", "EXCLUDE-FROM-NORMALIZATION?", 1, 0, false);
        declareFunction(me, "new_state_interpretation", "NEW-STATE-INTERPRETATION", 2, 0, false);
        declareFunction(me, "state_interpretation_get", "STATE-INTERPRETATION-GET", 2, 0, false);
        declareFunction(me, "hmm_print_function_trampoline", "HMM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "hmm_p", "HMM-P", 1, 0, false);
        new pos_tagger.$hmm_p$UnaryFunction();
        declareFunction(me, "hmm_initial_state", "HMM-INITIAL-STATE", 1, 0, false);
        declareFunction(me, "hmm_states", "HMM-STATES", 1, 0, false);
        declareFunction(me, "hmm_transitions", "HMM-TRANSITIONS", 1, 0, false);
        declareFunction(me, "_csetf_hmm_initial_state", "_CSETF-HMM-INITIAL-STATE", 2, 0, false);
        declareFunction(me, "_csetf_hmm_states", "_CSETF-HMM-STATES", 2, 0, false);
        declareFunction(me, "_csetf_hmm_transitions", "_CSETF-HMM-TRANSITIONS", 2, 0, false);
        declareFunction(me, "make_hmm", "MAKE-HMM", 0, 1, false);
        declareFunction(me, "visit_defstruct_hmm", "VISIT-DEFSTRUCT-HMM", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_hmm_method", "VISIT-DEFSTRUCT-OBJECT-HMM-METHOD", 2, 0, false);
        declareFunction(me, "new_hmm", "NEW-HMM", 1, 0, false);
        declareFunction(me, "finalize_hmm", "FINALIZE-HMM", 1, 0, false);
        declareFunction(me, "hmm_most_likely_path_probability", "HMM-MOST-LIKELY-PATH-PROBABILITY", 2, 0, false);
        declareFunction(me, "state_set_print_function_trampoline", "STATE-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "state_set_p", "STATE-SET-P", 1, 0, false);
        new pos_tagger.$state_set_p$UnaryFunction();
        declareFunction(me, "state_set_store", "STATE-SET-STORE", 1, 0, false);
        declareFunction(me, "state_set_estimator", "STATE-SET-ESTIMATOR", 1, 0, false);
        declareFunction(me, "state_set_cache", "STATE-SET-CACHE", 1, 0, false);
        declareFunction(me, "_csetf_state_set_store", "_CSETF-STATE-SET-STORE", 2, 0, false);
        declareFunction(me, "_csetf_state_set_estimator", "_CSETF-STATE-SET-ESTIMATOR", 2, 0, false);
        declareFunction(me, "_csetf_state_set_cache", "_CSETF-STATE-SET-CACHE", 2, 0, false);
        declareFunction(me, "make_state_set", "MAKE-STATE-SET", 0, 1, false);
        declareFunction(me, "visit_defstruct_state_set", "VISIT-DEFSTRUCT-STATE-SET", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_state_set_method", "VISIT-DEFSTRUCT-OBJECT-STATE-SET-METHOD", 2, 0, false);
        declareFunction(me, "new_state_set", "NEW-STATE-SET", 1, 1, false);
        declareFunction(me, "finalize_state_set", "FINALIZE-STATE-SET", 1, 0, false);
        declareFunction(me, "state_set_get_distribution", "STATE-SET-GET-DISTRIBUTION", 2, 0, false);
        declareFunction(me, "state_set_known_word", "STATE-SET-KNOWN-WORD", 2, 0, false);
        declareFunction(me, "transition_set_print_function_trampoline", "TRANSITION-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "transition_set_p", "TRANSITION-SET-P", 1, 0, false);
        new pos_tagger.$transition_set_p$UnaryFunction();
        declareFunction(me, "transition_set_known_probabilities", "TRANSITION-SET-KNOWN-PROBABILITIES", 1, 0, false);
        declareFunction(me, "transition_set_estimated_probabilities", "TRANSITION-SET-ESTIMATED-PROBABILITIES", 1, 0, false);
        declareFunction(me, "_csetf_transition_set_known_probabilities", "_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES", 2, 0, false);
        declareFunction(me, "_csetf_transition_set_estimated_probabilities", "_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES", 2, 0, false);
        declareFunction(me, "make_transition_set", "MAKE-TRANSITION-SET", 0, 1, false);
        declareFunction(me, "visit_defstruct_transition_set", "VISIT-DEFSTRUCT-TRANSITION-SET", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_transition_set_method", "VISIT-DEFSTRUCT-OBJECT-TRANSITION-SET-METHOD", 2, 0, false);
        declareFunction(me, "new_transition_set", "NEW-TRANSITION-SET", 1, 0, false);
        declareFunction(me, "transition_set_get", "TRANSITION-SET-GET", 3, 0, false);
        declareFunction(me, "transition_set_get_distribution", "TRANSITION-SET-GET-DISTRIBUTION", 2, 0, false);
        declareFunction(me, "transition_set_set", "TRANSITION-SET-SET", 4, 0, false);
        declareFunction(me, "emission_probability_estimator_print_function_trampoline", "EMISSION-PROBABILITY-ESTIMATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "emission_probability_estimator_p", "EMISSION-PROBABILITY-ESTIMATOR-P", 1, 0, false);
        new pos_tagger.$emission_probability_estimator_p$UnaryFunction();
        declareFunction(me, "epe_open_states", "EPE-OPEN-STATES", 1, 0, false);
        declareFunction(me, "epe_suffixes", "EPE-SUFFIXES", 1, 0, false);
        declareFunction(me, "epe_unknown_word", "EPE-UNKNOWN-WORD", 1, 0, false);
        declareFunction(me, "epe_suffix", "EPE-SUFFIX", 1, 0, false);
        declareFunction(me, "epe_hyphen", "EPE-HYPHEN", 1, 0, false);
        declareFunction(me, "epe_number", "EPE-NUMBER", 1, 0, false);
        declareFunction(me, "epe_capitalization", "EPE-CAPITALIZATION", 1, 0, false);
        declareFunction(me, "_csetf_epe_open_states", "_CSETF-EPE-OPEN-STATES", 2, 0, false);
        declareFunction(me, "_csetf_epe_suffixes", "_CSETF-EPE-SUFFIXES", 2, 0, false);
        declareFunction(me, "_csetf_epe_unknown_word", "_CSETF-EPE-UNKNOWN-WORD", 2, 0, false);
        declareFunction(me, "_csetf_epe_suffix", "_CSETF-EPE-SUFFIX", 2, 0, false);
        declareFunction(me, "_csetf_epe_hyphen", "_CSETF-EPE-HYPHEN", 2, 0, false);
        declareFunction(me, "_csetf_epe_number", "_CSETF-EPE-NUMBER", 2, 0, false);
        declareFunction(me, "_csetf_epe_capitalization", "_CSETF-EPE-CAPITALIZATION", 2, 0, false);
        declareFunction(me, "make_emission_probability_estimator", "MAKE-EMISSION-PROBABILITY-ESTIMATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_emission_probability_estimator", "VISIT-DEFSTRUCT-EMISSION-PROBABILITY-ESTIMATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_emission_probability_estimator_method", "VISIT-DEFSTRUCT-OBJECT-EMISSION-PROBABILITY-ESTIMATOR-METHOD", 2, 0, false);
        declareFunction(me, "new_emission_probability_estimator", "NEW-EMISSION-PROBABILITY-ESTIMATOR", 1, 0, false);
        declareFunction(me, "epe_get_distribution", "EPE-GET-DISTRIBUTION", 2, 0, false);
        declareFunction(me, "suffix", "SUFFIX", 2, 0, false);
        declareFunction(me, "capitalization", "CAPITALIZATION", 1, 0, false);
        declareFunction(me, "hyphen", "HYPHEN", 1, 0, false);
        declareFunction(me, "number", "NUMBER", 1, 0, false);
        declareFunction(me, "load_list", "LOAD-LIST", 1, 0, false);
        declareFunction(me, "get_tagger", "GET-TAGGER", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_pos_tagger_file() {
        defparameter("*TAGGER-DATA-PATH*", list($$$data, $str1$pos_tagging));
        defparameter("*EXCLUDE-FROM-NORMALIZATION*", $list2);
        defconstant("*INITIAL-STATE-RESOURCE*", $str3$initial_state);
        defconstant("*STATE-RESOURCE*", $$$states);
        defconstant("*TRANSITION-RESOURCE*", $$$transitions);
        defconstant("*OPEN-STATES-RESOURCE*", $str6$open_states);
        defconstant("*SUFFIXES-RESOURCE*", $$$suffixes);
        defconstant("*UNKNOWN-WORD-RESOURCE*", $$$unknown);
        defconstant("*SUFFIX-RESOURCE*", $$$suffix);
        defconstant("*HYPHEN-RESOURCE*", $$$hyphen);
        defconstant("*NUMBER-RESOURCE*", $$$number);
        defconstant("*CAPITALIZATION-RESOURCE*", $$$capitalization);
        defconstant("*STATE-INTERPRETATION-RESOURCE*", $str13$index_to_state);
        defconstant("*TOKEN-DELIMITERS*", $list14);
        deflexical("*IMPOSSIBILITY*", $float$_3_4028232e38);
        deflexical("*CERTAINTY*", $float$0_0);
        deflexical("*LOW-PROBABILITY*", $int$_20);
        defparameter("*STATE-SET-CACHE-CAPACITY*", $int$2000);
        deflexical("*POS-TAGGER*", NIL);
        defconstant("*DTP-TAGGER*", TAGGER);
        defparameter("*WORD-TAG-PATCHES*", $list73);
        defconstant("*DTP-HMM*", HMM);
        defconstant("*DTP-STATE-SET*", STATE_SET);
        defconstant("*DTP-TRANSITION-SET*", TRANSITION_SET);
        defconstant("*DTP-EMISSION-PROBABILITY-ESTIMATOR*", EMISSION_PROBABILITY_ESTIMATOR);
        return NIL;
    }

    public static SubLObject setup_pos_tagger_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tagger$.getGlobalValue(), symbol_function(TAGGER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list54);
        def_csetf(TAGGER_HMM, _CSETF_TAGGER_HMM);
        def_csetf(TAGGER_STATE_INTERPRETATION, _CSETF_TAGGER_STATE_INTERPRETATION);
        identity(TAGGER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tagger$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TAGGER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_hmm$.getGlobalValue(), symbol_function(HMM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list85);
        def_csetf(HMM_INITIAL_STATE, _CSETF_HMM_INITIAL_STATE);
        def_csetf(HMM_STATES, _CSETF_HMM_STATES);
        def_csetf(HMM_TRANSITIONS, _CSETF_HMM_TRANSITIONS);
        identity(HMM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_hmm$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HMM_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_state_set$.getGlobalValue(), symbol_function(STATE_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list105);
        def_csetf(STATE_SET_STORE, _CSETF_STATE_SET_STORE);
        def_csetf(STATE_SET_ESTIMATOR, _CSETF_STATE_SET_ESTIMATOR);
        def_csetf(STATE_SET_CACHE, _CSETF_STATE_SET_CACHE);
        identity(STATE_SET);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_state_set$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_STATE_SET_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_transition_set$.getGlobalValue(), symbol_function(TRANSITION_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list126);
        def_csetf(TRANSITION_SET_KNOWN_PROBABILITIES, _CSETF_TRANSITION_SET_KNOWN_PROBABILITIES);
        def_csetf(TRANSITION_SET_ESTIMATED_PROBABILITIES, _CSETF_TRANSITION_SET_ESTIMATED_PROBABILITIES);
        identity(TRANSITION_SET);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_transition_set$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TRANSITION_SET_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_emission_probability_estimator$.getGlobalValue(), symbol_function(EMISSION_PROBABILITY_ESTIMATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list144);
        def_csetf(EPE_OPEN_STATES, _CSETF_EPE_OPEN_STATES);
        def_csetf(EPE_SUFFIXES, _CSETF_EPE_SUFFIXES);
        def_csetf(EPE_UNKNOWN_WORD, _CSETF_EPE_UNKNOWN_WORD);
        def_csetf(EPE_SUFFIX, _CSETF_EPE_SUFFIX);
        def_csetf(EPE_HYPHEN, _CSETF_EPE_HYPHEN);
        def_csetf(EPE_NUMBER, _CSETF_EPE_NUMBER);
        def_csetf(EPE_CAPITALIZATION, _CSETF_EPE_CAPITALIZATION);
        identity(EMISSION_PROBABILITY_ESTIMATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_emission_probability_estimator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EMISSION_PROBABILITY_ESTIMATOR_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pos_tagger_file();
    }

    @Override
    public void initializeVariables() {
        init_pos_tagger_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pos_tagger_file();
    }

    static {













































































































































































































    }

    public static final class $tagger_native extends SubLStructNative {
        public SubLObject $hmm;

        public SubLObject $state_interpretation;

        private static final SubLStructDeclNative structDecl;

        public $tagger_native() {
            this.$hmm = Lisp.NIL;
            this.$state_interpretation = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$hmm;
        }

        @Override
        public SubLObject getField3() {
            return this.$state_interpretation;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$hmm = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$state_interpretation = value;
        }

        static {
            structDecl = makeStructDeclNative(pos_tagger.$tagger_native.class, TAGGER, TAGGER_P, $list48, $list49, new String[]{ "$hmm", "$state_interpretation" }, $list50, $list51, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $tagger_p$UnaryFunction extends UnaryFunction {
        public $tagger_p$UnaryFunction() {
            super(extractFunctionNamed("TAGGER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return tagger_p(arg1);
        }
    }

    public static final class $hmm_native extends SubLStructNative {
        public SubLObject $initial_state;

        public SubLObject $states;

        public SubLObject $transitions;

        private static final SubLStructDeclNative structDecl;

        public $hmm_native() {
            this.$initial_state = Lisp.NIL;
            this.$states = Lisp.NIL;
            this.$transitions = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$initial_state;
        }

        @Override
        public SubLObject getField3() {
            return this.$states;
        }

        @Override
        public SubLObject getField4() {
            return this.$transitions;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$initial_state = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$states = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$transitions = value;
        }

        static {
            structDecl = makeStructDeclNative(pos_tagger.$hmm_native.class, HMM, HMM_P, $list80, $list81, new String[]{ "$initial_state", "$states", "$transitions" }, $list82, $list83, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $hmm_p$UnaryFunction extends UnaryFunction {
        public $hmm_p$UnaryFunction() {
            super(extractFunctionNamed("HMM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hmm_p(arg1);
        }
    }

    public static final class $state_set_native extends SubLStructNative {
        public SubLObject $store;

        public SubLObject $estimator;

        public SubLObject $cache;

        private static final SubLStructDeclNative structDecl;

        public $state_set_native() {
            this.$store = Lisp.NIL;
            this.$estimator = Lisp.NIL;
            this.$cache = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$store;
        }

        @Override
        public SubLObject getField3() {
            return this.$estimator;
        }

        @Override
        public SubLObject getField4() {
            return this.$cache;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$store = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$estimator = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$cache = value;
        }

        static {
            structDecl = makeStructDeclNative(pos_tagger.$state_set_native.class, STATE_SET, STATE_SET_P, $list100, $list101, new String[]{ "$store", "$estimator", "$cache" }, $list102, $list103, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $state_set_p$UnaryFunction extends UnaryFunction {
        public $state_set_p$UnaryFunction() {
            super(extractFunctionNamed("STATE-SET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return state_set_p(arg1);
        }
    }

    public static final class $transition_set_native extends SubLStructNative {
        public SubLObject $known_probabilities;

        public SubLObject $estimated_probabilities;

        private static final SubLStructDeclNative structDecl;

        public $transition_set_native() {
            this.$known_probabilities = Lisp.NIL;
            this.$estimated_probabilities = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$known_probabilities;
        }

        @Override
        public SubLObject getField3() {
            return this.$estimated_probabilities;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$known_probabilities = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$estimated_probabilities = value;
        }

        static {
            structDecl = makeStructDeclNative(pos_tagger.$transition_set_native.class, TRANSITION_SET, TRANSITION_SET_P, $list121, $list122, new String[]{ "$known_probabilities", "$estimated_probabilities" }, $list123, $list124, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $transition_set_p$UnaryFunction extends UnaryFunction {
        public $transition_set_p$UnaryFunction() {
            super(extractFunctionNamed("TRANSITION-SET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return transition_set_p(arg1);
        }
    }

    public static final class $emission_probability_estimator_native extends SubLStructNative {
        public SubLObject $open_states;

        public SubLObject $suffixes;

        public SubLObject $unknown_word;

        public SubLObject $suffix;

        public SubLObject $hyphen;

        public SubLObject $number;

        public SubLObject $capitalization;

        private static final SubLStructDeclNative structDecl;

        public $emission_probability_estimator_native() {
            this.$open_states = Lisp.NIL;
            this.$suffixes = Lisp.NIL;
            this.$unknown_word = Lisp.NIL;
            this.$suffix = Lisp.NIL;
            this.$hyphen = Lisp.NIL;
            this.$number = Lisp.NIL;
            this.$capitalization = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$open_states;
        }

        @Override
        public SubLObject getField3() {
            return this.$suffixes;
        }

        @Override
        public SubLObject getField4() {
            return this.$unknown_word;
        }

        @Override
        public SubLObject getField5() {
            return this.$suffix;
        }

        @Override
        public SubLObject getField6() {
            return this.$hyphen;
        }

        @Override
        public SubLObject getField7() {
            return this.$number;
        }

        @Override
        public SubLObject getField8() {
            return this.$capitalization;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$open_states = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$suffixes = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$unknown_word = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$suffix = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$hyphen = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$number = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$capitalization = value;
        }

        static {
            structDecl = makeStructDeclNative(pos_tagger.$emission_probability_estimator_native.class, EMISSION_PROBABILITY_ESTIMATOR, EMISSION_PROBABILITY_ESTIMATOR_P, $list139, $list140, new String[]{ "$open_states", "$suffixes", "$unknown_word", "$suffix", "$hyphen", "$number", "$capitalization" }, $list141, $list142, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $emission_probability_estimator_p$UnaryFunction extends UnaryFunction {
        public $emission_probability_estimator_p$UnaryFunction() {
            super(extractFunctionNamed("EMISSION-PROBABILITY-ESTIMATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return emission_probability_estimator_p(arg1);
        }
    }
}

/**
 * Total time: 636 ms
 */
