/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.file_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      POS-TAGGER
 * source file: /cyc/top/cycl/pos-tagger.lisp
 * created:     2019/07/03 17:38:25
 */
public final class pos_tagger extends SubLTranslatedFile implements V12 {
    public static final class $tagger_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.pos_tagger.$tagger_native.this.$hmm;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.pos_tagger.$tagger_native.this.$state_interpretation;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$tagger_native.this.$hmm = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$tagger_native.this.$state_interpretation = value;
        }

        public SubLObject $hmm = Lisp.NIL;

        public SubLObject $state_interpretation = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.pos_tagger.$tagger_native.class, TAGGER, TAGGER_P, $list_alt48, $list_alt49, new String[]{ "$hmm", "$state_interpretation" }, $list_alt50, $list_alt51, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $hmm_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.pos_tagger.$hmm_native.this.$initial_state;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.pos_tagger.$hmm_native.this.$states;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.pos_tagger.$hmm_native.this.$transitions;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$hmm_native.this.$initial_state = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$hmm_native.this.$states = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$hmm_native.this.$transitions = value;
        }

        public SubLObject $initial_state = Lisp.NIL;

        public SubLObject $states = Lisp.NIL;

        public SubLObject $transitions = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.pos_tagger.$hmm_native.class, HMM, HMM_P, $list_alt74, $list_alt75, new String[]{ "$initial_state", "$states", "$transitions" }, $list_alt76, $list_alt77, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $emission_probability_estimator_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$open_states;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$suffixes;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$unknown_word;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$suffix;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$hyphen;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$number;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$capitalization;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$open_states = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$suffixes = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$unknown_word = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$suffix = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$hyphen = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$number = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.this.$capitalization = value;
        }

        public SubLObject $open_states = Lisp.NIL;

        public SubLObject $suffixes = Lisp.NIL;

        public SubLObject $unknown_word = Lisp.NIL;

        public SubLObject $suffix = Lisp.NIL;

        public SubLObject $hyphen = Lisp.NIL;

        public SubLObject $number = Lisp.NIL;

        public SubLObject $capitalization = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.class, EMISSION_PROBABILITY_ESTIMATOR, EMISSION_PROBABILITY_ESTIMATOR_P, $list_alt124, $list_alt125, new String[]{ "$open_states", "$suffixes", "$unknown_word", "$suffix", "$hyphen", "$number", "$capitalization" }, $list_alt126, $list_alt127, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new pos_tagger();

 public static final String myName = "com.cyc.cycjava.cycl.pos_tagger";


    // defparameter
    @LispMethod(comment = "the location of all pos tagging data, relative to the cyc home\ndefparameter")
    private static final SubLSymbol $tagger_data_path$ = makeSymbol("*TAGGER-DATA-PATH*");

    // defparameter
    @LispMethod(comment = "a list of words not to be subjected to sentence-initial capitalization normalization\ndefparameter")
    private static final SubLSymbol $exclude_from_normalization$ = makeSymbol("*EXCLUDE-FROM-NORMALIZATION*");

    // defconstant
    // the relative location of the initial state file
    /**
     * the relative location of the initial state file
     */
    @LispMethod(comment = "the relative location of the initial state file\ndefconstant")
    private static final SubLSymbol $initial_state_resource$ = makeSymbol("*INITIAL-STATE-RESOURCE*");

    // defconstant
    // the relative location of the word emission data file
    /**
     * the relative location of the word emission data file
     */
    @LispMethod(comment = "the relative location of the word emission data file\ndefconstant")
    private static final SubLSymbol $state_resource$ = makeSymbol("*STATE-RESOURCE*");

    // defconstant
    // the relative location of the transition data file
    /**
     * the relative location of the transition data file
     */
    @LispMethod(comment = "the relative location of the transition data file\ndefconstant")
    private static final SubLSymbol $transition_resource$ = makeSymbol("*TRANSITION-RESOURCE*");

    // defconstant
    // the relative location of the open states data file
    /**
     * the relative location of the open states data file
     */
    @LispMethod(comment = "the relative location of the open states data file\ndefconstant")
    private static final SubLSymbol $open_states_resource$ = makeSymbol("*OPEN-STATES-RESOURCE*");

    // defconstant
    // the relative location of the suffix data file
    /**
     * the relative location of the suffix data file
     */
    @LispMethod(comment = "the relative location of the suffix data file\ndefconstant")
    private static final SubLSymbol $suffixes_resource$ = makeSymbol("*SUFFIXES-RESOURCE*");

    // defconstant
    // the relative location of the unknown word data
    /**
     * the relative location of the unknown word data
     */
    @LispMethod(comment = "the relative location of the unknown word data\ndefconstant")
    private static final SubLSymbol $unknown_word_resource$ = makeSymbol("*UNKNOWN-WORD-RESOURCE*");

    // defconstant
    // the relative location of the suffix word data
    /**
     * the relative location of the suffix word data
     */
    @LispMethod(comment = "the relative location of the suffix word data\ndefconstant")
    private static final SubLSymbol $suffix_resource$ = makeSymbol("*SUFFIX-RESOURCE*");

    // defconstant
    // the relative location of the hyphen word data
    /**
     * the relative location of the hyphen word data
     */
    @LispMethod(comment = "the relative location of the hyphen word data\ndefconstant")
    private static final SubLSymbol $hyphen_resource$ = makeSymbol("*HYPHEN-RESOURCE*");

    // defconstant
    // the relative location of the number word data
    /**
     * the relative location of the number word data
     */
    @LispMethod(comment = "the relative location of the number word data\ndefconstant")
    private static final SubLSymbol $number_resource$ = makeSymbol("*NUMBER-RESOURCE*");

    // defconstant
    // the relative location of the capitalization word data
    /**
     * the relative location of the capitalization word data
     */
    @LispMethod(comment = "the relative location of the capitalization word data\ndefconstant")
    private static final SubLSymbol $capitalization_resource$ = makeSymbol("*CAPITALIZATION-RESOURCE*");

    // defconstant
    // the relative location of the mapping from HMM states to Penn pos tags
    /**
     * the relative location of the mapping from HMM states to Penn pos tags
     */
    @LispMethod(comment = "the relative location of the mapping from HMM states to Penn pos tags\ndefconstant")
    private static final SubLSymbol $state_interpretation_resource$ = makeSymbol("*STATE-INTERPRETATION-RESOURCE*");

    // defconstant
    /**
     * the delimiter for conditioned, conditioning and probability string in a data
     * file
     */
    @LispMethod(comment = "the delimiter for conditioned, conditioning and probability string in a data\r\nfile\ndefconstant\nthe delimiter for conditioned, conditioning and probability string in a data\nfile")
    private static final SubLSymbol $token_delimiters$ = makeSymbol("*TOKEN-DELIMITERS*");

    // deflexical
    // probabilistic impossibility
    /**
     * probabilistic impossibility
     */
    @LispMethod(comment = "probabilistic impossibility\ndeflexical")
    public static final SubLSymbol $impossibility$ = makeSymbol("*IMPOSSIBILITY*");

    // deflexical
    // probabilistic certainty
    /**
     * probabilistic certainty
     */
    @LispMethod(comment = "probabilistic certainty\ndeflexical")
    public static final SubLSymbol $certainty$ = makeSymbol("*CERTAINTY*");

    // deflexical
    // a low probability, randomly chosen
    /**
     * a low probability, randomly chosen
     */
    @LispMethod(comment = "a low probability, randomly chosen\ndeflexical")
    public static final SubLSymbol $low_probability$ = makeSymbol("*LOW-PROBABILITY*");

    // defparameter
    // The size of the memory cache of the tagger's state set
    /**
     * The size of the memory cache of the tagger's state set
     */
    @LispMethod(comment = "The size of the memory cache of the tagger\'s state set\ndefparameter")
    private static final SubLSymbol $state_set_cache_capacity$ = makeSymbol("*STATE-SET-CACHE-CAPACITY*");

    // deflexical
    // the standard part-of-speech tagger
    /**
     * the standard part-of-speech tagger
     */
    @LispMethod(comment = "the standard part-of-speech tagger\ndeflexical")
    public static final SubLSymbol $pos_tagger$ = makeSymbol("*POS-TAGGER*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_tagger$ = makeSymbol("*DTP-TAGGER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $word_tag_patches$ = makeSymbol("*WORD-TAG-PATCHES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_hmm$ = makeSymbol("*DTP-HMM*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_state_set$ = makeSymbol("*DTP-STATE-SET*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_transition_set$ = makeSymbol("*DTP-TRANSITION-SET*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_emission_probability_estimator$ = makeSymbol("*DTP-EMISSION-PROBABILITY-ESTIMATOR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$data = makeString("data");

    static private final SubLString $str1$pos_tagging = makeString("pos-tagging");

    static private final SubLList $list2 = list(makeString("WWII"));

    static private final SubLString $str3$initial_state = makeString("initial-state");

    static private final SubLString $$$states = makeString("states");

    static private final SubLString $$$transitions = makeString("transitions");

    static private final SubLString $str6$open_states = makeString("open-states");

    static private final SubLString $$$suffixes = makeString("suffixes");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $$$suffix = makeString("suffix");

    static private final SubLString $$$hyphen = makeString("hyphen");

    static private final SubLString $$$number = makeString("number");

    static private final SubLString $$$capitalization = makeString("capitalization");

    static private final SubLString $str13$index_to_state = makeString("index-to-state");

    static private final SubLList $list14 = list(CHAR_caret);

    private static final SubLFloat $float$_3_4028232e38 = makeDouble(-3.4028232E38);

    private static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLInteger $int$_20 = makeInteger(-20);

    private static final SubLInteger $int$2000 = makeInteger(2000);

    static private final SubLString $str20$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list21 = list(makeSymbol("CONDITIONED"), makeSymbol("CONDITIONING"), makeSymbol("PROBABILITY"));

    static private final SubLList $list22 = list(makeSymbol("CPA"), makeSymbol("CONDITIONED"), makeSymbol("CONDITIONING"));

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    static private final SubLString $str26$Unable_to_initialize_file_hashtab = makeString("Unable to initialize file hashtable. ");

    static private final SubLString $str27$Building_conditional_probability_ = makeString("Building conditional probability file...");

    static private final SubLList $list28 = list(makeSymbol("PROBABILITY"), makeSymbol("SOURCE"));

    static private final SubLList $list30 = list(makeSymbol("ENTRY"));

    static private final SubLList $list33 = list(makeSymbol("ENTRY"), makeSymbol("PROBABILITY"), makeSymbol("SOURCE"));

    static private final SubLList $list36 = list(makeSymbol("TRELLIS"));

    static private final SubLList $list38 = list(makeSymbol("TRELLIS"), makeSymbol("KEY"));

    private static final SubLSymbol TRELLIS_CURRENT_COLUMN = makeSymbol("TRELLIS-CURRENT-COLUMN");

    static private final SubLList $list41 = list(list(makeSymbol("FUNCTION"), EQL));

    static private final SubLList $list42 = list(makeSymbol("TRELLIS"), makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLSymbol ACONS = makeSymbol("ACONS");

    private static final SubLSymbol TAGGER_P = makeSymbol("TAGGER-P");

    static private final SubLList $list48 = list(makeSymbol("HMM"), makeSymbol("STATE-INTERPRETATION"));

    static private final SubLList $list49 = list(makeKeyword("HMM"), makeKeyword("STATE-INTERPRETATION"));

    static private final SubLList $list50 = list(makeSymbol("TAGGER-HMM"), makeSymbol("TAGGER-STATE-INTERPRETATION"));

    static private final SubLList $list51 = list(makeSymbol("_CSETF-TAGGER-HMM"), makeSymbol("_CSETF-TAGGER-STATE-INTERPRETATION"));

    private static final SubLSymbol TAGGER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TAGGER-PRINT-FUNCTION-TRAMPOLINE");

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

    static private final SubLList $list75 = list(makeKeyword("STRING"), makeString("."));

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

    static private final SubLList $list124 = list(makeSymbol("_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES"), makeSymbol("_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES"));

    private static final SubLSymbol TRANSITION_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANSITION-SET-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLList $list126 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TRANSITION-SET-P"));

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

    /**
     *
     *
     * @param SIZE
     * 		integerp; the original size of this cpm
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this cpm
     * @param TESTFN
     * 		functionp; the equality predicate of this cpm
     * @return hashtable; a new cpm hashtable initialized with size SIZE, the probability
    data in SOURCE-PATH, and test function TESTFN
     */
    @LispMethod(comment = "@param SIZE\r\n\t\tintegerp; the original size of this cpm\r\n@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this cpm\r\n@param TESTFN\r\n\t\tfunctionp; the equality predicate of this cpm\r\n@return hashtable; a new cpm hashtable initialized with size SIZE, the probability\r\ndata in SOURCE-PATH, and test function TESTFN")
    public static final SubLObject new_cpm_alt(SubLObject size, SubLObject source_path, SubLObject testfn) {
        if (source_path == UNPROVIDED) {
            source_path = NIL;
        }
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQUAL);
        }
        {
            SubLObject cpm = make_hash_table(size, testfn, UNPROVIDED);
            if (NIL != source_path) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(source_path, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt20$Unable_to_open__S, source_path);
                        }
                        {
                            SubLObject infile = stream;
                            if (infile.isStream()) {
                                {
                                    SubLObject line = NIL;
                                    for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                        {
                                            SubLObject datum = string_utilities.split_string(line, $token_delimiters$.getGlobalValue());
                                            SubLObject current = datum;
                                            SubLObject conditioned = NIL;
                                            SubLObject conditioning = NIL;
                                            SubLObject probability = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt21);
                                            conditioned = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt21);
                                            conditioning = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt21);
                                            probability = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                cpm_set(cpm, conditioned, parse_integer(conditioning, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), sublisp_float(read_from_string(probability, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED));
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt21);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            return cpm;
        }
    }

    /**
     *
     *
     * @param SIZE
     * 		integerp; the original size of this cpm
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this cpm
     * @param TESTFN
     * 		functionp; the equality predicate of this cpm
     * @return hashtable; a new cpm hashtable initialized with size SIZE, the probability
    data in SOURCE-PATH, and test function TESTFN
     */
    @LispMethod(comment = "@param SIZE\r\n\t\tintegerp; the original size of this cpm\r\n@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this cpm\r\n@param TESTFN\r\n\t\tfunctionp; the equality predicate of this cpm\r\n@return hashtable; a new cpm hashtable initialized with size SIZE, the probability\r\ndata in SOURCE-PATH, and test function TESTFN")
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

    /**
     *
     *
     * @param CPM
    hashtable
     * 		
     * @param CONDITIONED
    object
     * 		
     * @return a-list; a list of conditioning-probability pairs, where each pair expresses the
    fact that p(CONDITIONED}CONDITIONIN) = PROBABILITY, according to CPM
     */
    @LispMethod(comment = "@param CPM\nhashtable\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@return a-list; a list of conditioning-probability pairs, where each pair expresses the\r\nfact that p(CONDITIONED}CONDITIONIN) = PROBABILITY, according to CPM")
    public static final SubLObject cpm_get_distribution_alt(SubLObject cpm, SubLObject conditioned) {
        return gethash_without_values(conditioned, cpm, NIL);
    }

    /**
     *
     *
     * @param CPM
    hashtable
     * 		
     * @param CONDITIONED
    object
     * 		
     * @return a-list; a list of conditioning-probability pairs, where each pair expresses the
    fact that p(CONDITIONED}CONDITIONIN) = PROBABILITY, according to CPM
     */
    @LispMethod(comment = "@param CPM\nhashtable\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@return a-list; a list of conditioning-probability pairs, where each pair expresses the\r\nfact that p(CONDITIONED}CONDITIONIN) = PROBABILITY, according to CPM")
    public static SubLObject cpm_get_distribution(final SubLObject cpm, final SubLObject conditioned) {
        return gethash_without_values(conditioned, cpm, NIL);
    }

    /**
     *
     *
     * @param CPM
    hashtable
     * 		
     * @param CONDITIONED
    object
     * 		
     * @param CONDITIONING
    object
     * 		
     * @return float; the probability for p(CONDITIONED|CONDITIONING) according to CPM
     */
    @LispMethod(comment = "@param CPM\nhashtable\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@param CONDITIONING\nobject\r\n\t\t\r\n@return float; the probability for p(CONDITIONED|CONDITIONING) according to CPM")
    public static final SubLObject cpm_get_alt(SubLObject cpm, SubLObject conditioned, SubLObject conditioning, SubLObject testfn, SubLObject v_default) {
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQL);
        }
        if (v_default == UNPROVIDED) {
            v_default = $impossibility$.getGlobalValue();
        }
        {
            SubLObject probability = assoc(conditioning, cpm_get_distribution(cpm, conditioned), testfn, UNPROVIDED).rest();
            return NIL != probability ? ((SubLObject) (probability)) : v_default;
        }
    }

    /**
     *
     *
     * @param CPM
    hashtable
     * 		
     * @param CONDITIONED
    object
     * 		
     * @param CONDITIONING
    object
     * 		
     * @return float; the probability for p(CONDITIONED|CONDITIONING) according to CPM
     */
    @LispMethod(comment = "@param CPM\nhashtable\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@param CONDITIONING\nobject\r\n\t\t\r\n@return float; the probability for p(CONDITIONED|CONDITIONING) according to CPM")
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

    /**
     *
     *
     * @param CPM
    hashtable
     * 		
     * @param CONDITIONED
    object
     * 		
     * @param CONDITIONING
    object
     * 		
     * @param PROBABILITY
    float
     * 		
     * @return hashtable; a version of CPM that has been destructively updated with the fact
    p(CONDITIONED|CONDITIONING) = PROBABILITY
     * @unknown CPM is destructively modified
     */
    @LispMethod(comment = "@param CPM\nhashtable\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@param CONDITIONING\nobject\r\n\t\t\r\n@param PROBABILITY\nfloat\r\n\t\t\r\n@return hashtable; a version of CPM that has been destructively updated with the fact\r\np(CONDITIONED|CONDITIONING) = PROBABILITY\r\n@unknown CPM is destructively modified")
    public static final SubLObject cpm_set_alt(SubLObject cpm, SubLObject conditioned, SubLObject conditioning, SubLObject probability) {
        {
            SubLObject distribution = cpm_get_distribution(cpm, conditioned);
            distribution = cons(cons(conditioning, probability), distribution);
            sethash(conditioned, cpm, distribution);
            return cpm;
        }
    }

    /**
     *
     *
     * @param CPM
    hashtable
     * 		
     * @param CONDITIONED
    object
     * 		
     * @param CONDITIONING
    object
     * 		
     * @param PROBABILITY
    float
     * 		
     * @return hashtable; a version of CPM that has been destructively updated with the fact
    p(CONDITIONED|CONDITIONING) = PROBABILITY
     * @unknown CPM is destructively modified
     */
    @LispMethod(comment = "@param CPM\nhashtable\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@param CONDITIONING\nobject\r\n\t\t\r\n@param PROBABILITY\nfloat\r\n\t\t\r\n@return hashtable; a version of CPM that has been destructively updated with the fact\r\np(CONDITIONED|CONDITIONING) = PROBABILITY\r\n@unknown CPM is destructively modified")
    public static SubLObject cpm_set(final SubLObject cpm, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        SubLObject distribution = cpm_get_distribution(cpm, conditioned);
        distribution = cons(cons(conditioning, probability), distribution);
        sethash(conditioned, cpm, distribution);
        return cpm;
    }

    /**
     *
     *
     * @param X-DIMENSION
     * 		integer; the size of the x-dimension of this cpa
     * @param Y-DIMENSION
     * 		integer; the size of the y-dimension of this cpa
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this cpa
     * @return vector; a new two-dimensional vector of with dimensions X-DIMENSION X Y-DIMENSION,
    and the probability data in SOURCE-PATH
     */
    @LispMethod(comment = "@param X-DIMENSION\r\n\t\tinteger; the size of the x-dimension of this cpa\r\n@param Y-DIMENSION\r\n\t\tinteger; the size of the y-dimension of this cpa\r\n@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this cpa\r\n@return vector; a new two-dimensional vector of with dimensions X-DIMENSION X Y-DIMENSION,\r\nand the probability data in SOURCE-PATH")
    public static final SubLObject new_cpa_alt(SubLObject x_dimension, SubLObject y_dimension, SubLObject source_path, SubLObject parsefn) {
        if (source_path == UNPROVIDED) {
            source_path = NIL;
        }
        if (parsefn == UNPROVIDED) {
            parsefn = symbol_function(IDENTITY);
        }
        {
            SubLObject cpa = make_vector(x_dimension, UNPROVIDED);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(x_dimension); i = add(i, ONE_INTEGER)) {
                set_aref(cpa, i, make_vector(y_dimension, $low_probability$.getGlobalValue()));
            }
            if (NIL != source_path) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(source_path, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt20$Unable_to_open__S, source_path);
                        }
                        {
                            SubLObject infile = stream;
                            if (infile.isStream()) {
                                {
                                    SubLObject line = NIL;
                                    for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                        {
                                            SubLObject datum = string_utilities.split_string(line, $token_delimiters$.getGlobalValue());
                                            SubLObject current = datum;
                                            SubLObject conditioned = NIL;
                                            SubLObject conditioning = NIL;
                                            SubLObject probability = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt21);
                                            conditioned = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt21);
                                            conditioning = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt21);
                                            probability = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                cpa_set(cpa, read_from_string(conditioned, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), read_from_string(conditioning, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), funcall(parsefn, probability));
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt21);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            return cpa;
        }
    }

    /**
     *
     *
     * @param X-DIMENSION
     * 		integer; the size of the x-dimension of this cpa
     * @param Y-DIMENSION
     * 		integer; the size of the y-dimension of this cpa
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this cpa
     * @return vector; a new two-dimensional vector of with dimensions X-DIMENSION X Y-DIMENSION,
    and the probability data in SOURCE-PATH
     */
    @LispMethod(comment = "@param X-DIMENSION\r\n\t\tinteger; the size of the x-dimension of this cpa\r\n@param Y-DIMENSION\r\n\t\tinteger; the size of the y-dimension of this cpa\r\n@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this cpa\r\n@return vector; a new two-dimensional vector of with dimensions X-DIMENSION X Y-DIMENSION,\r\nand the probability data in SOURCE-PATH")
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

    /**
     *
     *
     * @param CPA
    vector
     * 		
     * @param CONDITIONED
    integer
     * 		
     * @param CONDITIONING
    integer
     * 		
     * @return float; the probability for p(CONDITIONED|CONDITIONING) according to CPA
     */
    @LispMethod(comment = "@param CPA\nvector\r\n\t\t\r\n@param CONDITIONED\ninteger\r\n\t\t\r\n@param CONDITIONING\ninteger\r\n\t\t\r\n@return float; the probability for p(CONDITIONED|CONDITIONING) according to CPA")
    public static final SubLObject cpa_get_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject cpa = NIL;
            SubLObject conditioned = NIL;
            SubLObject conditioning = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            cpa = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt22);
            conditioned = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt22);
            conditioning = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(AREF, list(AREF, cpa, conditioned), conditioning);
            } else {
                cdestructuring_bind_error(datum, $list_alt22);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param CPA
    vector
     * 		
     * @param CONDITIONED
    integer
     * 		
     * @param CONDITIONING
    integer
     * 		
     * @return float; the probability for p(CONDITIONED|CONDITIONING) according to CPA
     */
    @LispMethod(comment = "@param CPA\nvector\r\n\t\t\r\n@param CONDITIONED\ninteger\r\n\t\t\r\n@param CONDITIONING\ninteger\r\n\t\t\r\n@return float; the probability for p(CONDITIONED|CONDITIONING) according to CPA")
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

    /**
     *
     *
     * @param CPA
    vector
     * 		
     * @param CONDITIONED
    integer
     * 		
     * @param CONDITIONING
    integer
     * 		
     * @param PROBABILITY
    float
     * 		
     * @return vector; a version of CPA that has been destructively updated with the fact
    p(CONDITIONED|CONDITIONING) = PROBABILITY
     * @unknown CPA is destructively modified
     */
    @LispMethod(comment = "@param CPA\nvector\r\n\t\t\r\n@param CONDITIONED\ninteger\r\n\t\t\r\n@param CONDITIONING\ninteger\r\n\t\t\r\n@param PROBABILITY\nfloat\r\n\t\t\r\n@return vector; a version of CPA that has been destructively updated with the fact\r\np(CONDITIONED|CONDITIONING) = PROBABILITY\r\n@unknown CPA is destructively modified")
    public static final SubLObject cpa_set_alt(SubLObject cpa, SubLObject conditioned, SubLObject conditioning, SubLObject probability) {
        set_aref(aref(cpa, conditioned), conditioning, probability);
        return cpa;
    }

    /**
     *
     *
     * @param CPA
    vector
     * 		
     * @param CONDITIONED
    integer
     * 		
     * @param CONDITIONING
    integer
     * 		
     * @param PROBABILITY
    float
     * 		
     * @return vector; a version of CPA that has been destructively updated with the fact
    p(CONDITIONED|CONDITIONING) = PROBABILITY
     * @unknown CPA is destructively modified
     */
    @LispMethod(comment = "@param CPA\nvector\r\n\t\t\r\n@param CONDITIONED\ninteger\r\n\t\t\r\n@param CONDITIONING\ninteger\r\n\t\t\r\n@param PROBABILITY\nfloat\r\n\t\t\r\n@return vector; a version of CPA that has been destructively updated with the fact\r\np(CONDITIONED|CONDITIONING) = PROBABILITY\r\n@unknown CPA is destructively modified")
    public static SubLObject cpa_set(final SubLObject cpa, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        set_aref(aref(cpa, conditioned), conditioning, probability);
        return cpa;
    }

    /**
     *
     *
     * @param FILENAME
     * 		string; the backing store of this cpf
     * @param SIZE
     * 		integer; the estimated number of entries that the backing store should hold
     * @param AVG-SIZE;
     * 		the estimated size of the entries of the backing-store as returned
     * 		by @see cfasl-object-size
     * @param TESTFN
     * 		function; the equality predicate of this cpf
     * @return cpf; a new cpf constructed from the parameters and pointing to the backing
    store FILENAME
     */
    @LispMethod(comment = "@param FILENAME\r\n\t\tstring; the backing store of this cpf\r\n@param SIZE\r\n\t\tinteger; the estimated number of entries that the backing store should hold\r\n@param AVG-SIZE;\r\n\t\tthe estimated size of the entries of the backing-store as returned\r\n\t\tby @see cfasl-object-size\r\n@param TESTFN\r\n\t\tfunction; the equality predicate of this cpf\r\n@return cpf; a new cpf constructed from the parameters and pointing to the backing\r\nstore FILENAME")
    public static final SubLObject create_cpf_alt(SubLObject filename, SubLObject size, SubLObject testfn, SubLObject avg_size) {
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQUAL);
        }
        if (avg_size == UNPROVIDED) {
            avg_size = $int$256;
        }
        return file_hash_table.create_file_hash_table(filename, size, avg_size, testfn, UNPROVIDED);
    }

    /**
     *
     *
     * @param FILENAME
     * 		string; the backing store of this cpf
     * @param SIZE
     * 		integer; the estimated number of entries that the backing store should hold
     * @param AVG-SIZE;
     * 		the estimated size of the entries of the backing-store as returned
     * 		by @see cfasl-object-size
     * @param TESTFN
     * 		function; the equality predicate of this cpf
     * @return cpf; a new cpf constructed from the parameters and pointing to the backing
    store FILENAME
     */
    @LispMethod(comment = "@param FILENAME\r\n\t\tstring; the backing store of this cpf\r\n@param SIZE\r\n\t\tinteger; the estimated number of entries that the backing store should hold\r\n@param AVG-SIZE;\r\n\t\tthe estimated size of the entries of the backing-store as returned\r\n\t\tby @see cfasl-object-size\r\n@param TESTFN\r\n\t\tfunction; the equality predicate of this cpf\r\n@return cpf; a new cpf constructed from the parameters and pointing to the backing\r\nstore FILENAME")
    public static SubLObject create_cpf(final SubLObject filename, final SubLObject size, SubLObject testfn, SubLObject avg_size) {
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQUAL);
        }
        if (avg_size == UNPROVIDED) {
            avg_size = $int$256;
        }
        return file_hash_table.create_file_hash_table(filename, size, avg_size, testfn, UNPROVIDED);
    }

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the backing store for this cpf
     * @param TESTFN
     * 		function; the equality predicate of this cpf
     * @return cpf; a new cpf backed by SOURCE-PATH holding at most CACHE-CAPACITY entries
    in memory and equality predicate TESTFN
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the backing store for this cpf\r\n@param TESTFN\r\n\t\tfunction; the equality predicate of this cpf\r\n@return cpf; a new cpf backed by SOURCE-PATH holding at most CACHE-CAPACITY entries\r\nin memory and equality predicate TESTFN")
    public static final SubLObject new_cpf_alt(SubLObject source_path, SubLObject testfn) {
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQUAL);
        }
        return file_hash_table.open_file_hash_table_read_only(source_path, testfn, $IMAGE_INDEPENDENT_CFASL);
    }

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the backing store for this cpf
     * @param TESTFN
     * 		function; the equality predicate of this cpf
     * @return cpf; a new cpf backed by SOURCE-PATH holding at most CACHE-CAPACITY entries
    in memory and equality predicate TESTFN
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the backing store for this cpf\r\n@param TESTFN\r\n\t\tfunction; the equality predicate of this cpf\r\n@return cpf; a new cpf backed by SOURCE-PATH holding at most CACHE-CAPACITY entries\r\nin memory and equality predicate TESTFN")
    public static SubLObject new_cpf(final SubLObject source_path, SubLObject testfn) {
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQUAL);
        }
        return file_hash_table.open_file_hash_table_read_only(source_path, testfn, $IMAGE_INDEPENDENT_CFASL);
    }

    /**
     * Finalizes CPF
     */
    @LispMethod(comment = "Finalizes CPF")
    public static final SubLObject finalize_cpf_alt(SubLObject cpf) {
        return file_hash_table.finalize_file_hash_table(cpf);
    }

    /**
     * Finalizes CPF
     */
    @LispMethod(comment = "Finalizes CPF")
    public static SubLObject finalize_cpf(final SubLObject cpf) {
        return file_hash_table.finalize_file_hash_table(cpf);
    }

    /**
     *
     *
     * @param CPF
    conditional-probability-file
     * 		
     * @param CONDITIONED
    object
     * 		
     * @return a-list; a list of conditioning-probability pairs, where each pair expresses the
    fact that p(CONDITIONED|CONDITIONING) = PROBABILITY, according to CPM
     */
    @LispMethod(comment = "@param CPF\nconditional-probability-file\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@return a-list; a list of conditioning-probability pairs, where each pair expresses the\r\nfact that p(CONDITIONED|CONDITIONING) = PROBABILITY, according to CPM")
    public static final SubLObject cpf_get_distribution_alt(SubLObject cpf, SubLObject conditioned) {
        return file_hash_table.get_file_hash_table(conditioned, cpf, UNPROVIDED);
    }

    /**
     *
     *
     * @param CPF
    conditional-probability-file
     * 		
     * @param CONDITIONED
    object
     * 		
     * @return a-list; a list of conditioning-probability pairs, where each pair expresses the
    fact that p(CONDITIONED|CONDITIONING) = PROBABILITY, according to CPM
     */
    @LispMethod(comment = "@param CPF\nconditional-probability-file\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@return a-list; a list of conditioning-probability pairs, where each pair expresses the\r\nfact that p(CONDITIONED|CONDITIONING) = PROBABILITY, according to CPM")
    public static SubLObject cpf_get_distribution(final SubLObject cpf, final SubLObject conditioned) {
        return file_hash_table.get_file_hash_table(conditioned, cpf, UNPROVIDED);
    }

    /**
     *
     *
     * @param CPM
    conditional-probability-file
     * 		
     * @param CONDITIONED
    object
     * 		
     * @param CONDITIONING
    object
     * 		
     * @return float; the probability for p(CONDITIONED|CONDITIONING) according to CPF
     */
    @LispMethod(comment = "@param CPM\nconditional-probability-file\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@param CONDITIONING\nobject\r\n\t\t\r\n@return float; the probability for p(CONDITIONED|CONDITIONING) according to CPF")
    public static final SubLObject cpf_get_alt(SubLObject cpf, SubLObject conditioned, SubLObject conditioning, SubLObject testfn, SubLObject v_default) {
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQL);
        }
        if (v_default == UNPROVIDED) {
            v_default = $impossibility$.getGlobalValue();
        }
        {
            SubLObject probability = assoc(conditioning, cpf_get_distribution(cpf, conditioned), testfn, UNPROVIDED).rest();
            return NIL != probability ? ((SubLObject) (probability)) : v_default;
        }
    }

    /**
     *
     *
     * @param CPM
    conditional-probability-file
     * 		
     * @param CONDITIONED
    object
     * 		
     * @param CONDITIONING
    object
     * 		
     * @return float; the probability for p(CONDITIONED|CONDITIONING) according to CPF
     */
    @LispMethod(comment = "@param CPM\nconditional-probability-file\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@param CONDITIONING\nobject\r\n\t\t\r\n@return float; the probability for p(CONDITIONED|CONDITIONING) according to CPF")
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

    /**
     *
     *
     * @param CPF
    conditional-probability-file
     * 		
     * @param CONDITIONED
    object
     * 		
     * @param CONDITIONING
    object
     * 		
     * @param PROBABILITY
    float
     * 		
     * @return conditional-probability-file; a version of CPF that has destructively been
    updated with the fact p(CONDITIONED|CONDITIONING) = PROBABILITY
     * @unknown CPM is destructively modified
     */
    @LispMethod(comment = "@param CPF\nconditional-probability-file\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@param CONDITIONING\nobject\r\n\t\t\r\n@param PROBABILITY\nfloat\r\n\t\t\r\n@return conditional-probability-file; a version of CPF that has destructively been\r\nupdated with the fact p(CONDITIONED|CONDITIONING) = PROBABILITY\r\n@unknown CPM is destructively modified")
    public static final SubLObject cpf_set_alt(SubLObject cpf, SubLObject conditioned, SubLObject conditioning, SubLObject probability) {
        {
            SubLObject distribution = cpf_get_distribution(cpf, conditioned);
            distribution = cons(cons(conditioning, probability), distribution);
            file_hash_table.put_file_hash_table(conditioned, cpf, distribution);
            return cpf;
        }
    }

    /**
     *
     *
     * @param CPF
    conditional-probability-file
     * 		
     * @param CONDITIONED
    object
     * 		
     * @param CONDITIONING
    object
     * 		
     * @param PROBABILITY
    float
     * 		
     * @return conditional-probability-file; a version of CPF that has destructively been
    updated with the fact p(CONDITIONED|CONDITIONING) = PROBABILITY
     * @unknown CPM is destructively modified
     */
    @LispMethod(comment = "@param CPF\nconditional-probability-file\r\n\t\t\r\n@param CONDITIONED\nobject\r\n\t\t\r\n@param CONDITIONING\nobject\r\n\t\t\r\n@param PROBABILITY\nfloat\r\n\t\t\r\n@return conditional-probability-file; a version of CPF that has destructively been\r\nupdated with the fact p(CONDITIONED|CONDITIONING) = PROBABILITY\r\n@unknown CPM is destructively modified")
    public static SubLObject cpf_set(final SubLObject cpf, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        SubLObject distribution = cpf_get_distribution(cpf, conditioned);
        distribution = cons(cons(conditioning, probability), distribution);
        file_hash_table.put_file_hash_table(conditioned, cpf, distribution);
        return cpf;
    }

    /**
     *
     *
     * @param CPF
    conditional-probability-file
     * 		
     * @return cpf; CPF destructively modified to close the connection to the underlying
    database and free its cache
     */
    @LispMethod(comment = "@param CPF\nconditional-probability-file\r\n\t\t\r\n@return cpf; CPF destructively modified to close the connection to the underlying\r\ndatabase and free its cache")
    public static final SubLObject cpf_finalize_alt(SubLObject cpf) {
        file_hash_table.finalize_file_hash_table(cpf);
        return cpf;
    }

    /**
     *
     *
     * @param CPF
    conditional-probability-file
     * 		
     * @return cpf; CPF destructively modified to close the connection to the underlying
    database and free its cache
     */
    @LispMethod(comment = "@param CPF\nconditional-probability-file\r\n\t\t\r\n@return cpf; CPF destructively modified to close the connection to the underlying\r\ndatabase and free its cache")
    public static SubLObject cpf_finalize(final SubLObject cpf) {
        file_hash_table.finalize_file_hash_table(cpf);
        return cpf;
    }

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the textual probability data to be converted
     * 		into a file-hash-table backing store
     * @param BACKING-STORE
     * 		string; the name of the backing store file
     * @param SIZE
     * 		integer; the estimated number of entries that the backing store should hold
     * @param AVG-SIZE;
     * 		the estimated size of the entries of the backing-store as returned
     * 		by @see cfasl-object-size
     * @return keyword; the keyword :incomplete
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the textual probability data to be converted\r\n\t\tinto a file-hash-table backing store\r\n@param BACKING-STORE\r\n\t\tstring; the name of the backing store file\r\n@param SIZE\r\n\t\tinteger; the estimated number of entries that the backing store should hold\r\n@param AVG-SIZE;\r\n\t\tthe estimated size of the entries of the backing-store as returned\r\n\t\tby @see cfasl-object-size\r\n@return keyword; the keyword :incomplete")
    public static final SubLObject cpf_create_backing_store_alt(SubLObject source_path, SubLObject backing_store, SubLObject size, SubLObject avg_size) {
        if (avg_size == UNPROVIDED) {
            avg_size = $int$256;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Filesys.probe_file(source_path)) {
                Errors.error(cconcatenate($str_alt26$Unable_to_initialize_file_hashtab, why_not_probe_fileP(source_path)));
            }
            {
                SubLObject cpf = create_cpf(backing_store, size, EQUAL, avg_size);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($str_alt27$Building_conditional_probability_);
                        {
                            SubLObject file_var = source_path;
                            SubLObject stream = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_1 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_text(file_var, $INPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str_alt20$Unable_to_open__S, file_var);
                                }
                                {
                                    SubLObject stream_var = stream;
                                    if (stream_var.isStream()) {
                                        {
                                            SubLObject length_var = file_length(stream_var);
                                            SubLObject stream_var_2 = stream_var;
                                            SubLObject line_number_var = NIL;
                                            SubLObject line = NIL;
                                            for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_2, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_2, NIL, NIL, UNPROVIDED)) {
                                                {
                                                    SubLObject datum = string_utilities.split_string(line, $token_delimiters$.getGlobalValue());
                                                    SubLObject current = datum;
                                                    SubLObject conditioned = NIL;
                                                    SubLObject conditioning = NIL;
                                                    SubLObject probability = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt21);
                                                    conditioned = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt21);
                                                    conditioning = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt21);
                                                    probability = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        cpf_set(cpf, conditioned, parse_integer(conditioning, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), sublisp_float(read_from_string(probability, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED));
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt21);
                                                    }
                                                }
                                                note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return cpf_finalize(cpf);
            }
        }
    }

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the textual probability data to be converted
     * 		into a file-hash-table backing store
     * @param BACKING-STORE
     * 		string; the name of the backing store file
     * @param SIZE
     * 		integer; the estimated number of entries that the backing store should hold
     * @param AVG-SIZE;
     * 		the estimated size of the entries of the backing-store as returned
     * 		by @see cfasl-object-size
     * @return keyword; the keyword :incomplete
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the textual probability data to be converted\r\n\t\tinto a file-hash-table backing store\r\n@param BACKING-STORE\r\n\t\tstring; the name of the backing store file\r\n@param SIZE\r\n\t\tinteger; the estimated number of entries that the backing store should hold\r\n@param AVG-SIZE;\r\n\t\tthe estimated size of the entries of the backing-store as returned\r\n\t\tby @see cfasl-object-size\r\n@return keyword; the keyword :incomplete")
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

    /**
     *
     *
     * @param PROBABILITY
    float
     * 		
     * @param SOURCE
    integer
     * 		
     * @return trellis-entry; a new trellis entry with probability PROBABILITY
    and source SOURCE
     */
    @LispMethod(comment = "@param PROBABILITY\nfloat\r\n\t\t\r\n@param SOURCE\ninteger\r\n\t\t\r\n@return trellis-entry; a new trellis entry with probability PROBABILITY\r\nand source SOURCE")
    public static final SubLObject new_trellis_entry_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject probability = NIL;
            SubLObject source = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            probability = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt28);
            source = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CONS, probability, source);
            } else {
                cdestructuring_bind_error(datum, $list_alt28);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param PROBABILITY
    float
     * 		
     * @param SOURCE
    integer
     * 		
     * @return trellis-entry; a new trellis entry with probability PROBABILITY
    and source SOURCE
     */
    @LispMethod(comment = "@param PROBABILITY\nfloat\r\n\t\t\r\n@param SOURCE\ninteger\r\n\t\t\r\n@return trellis-entry; a new trellis entry with probability PROBABILITY\r\nand source SOURCE")
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

    /**
     *
     *
     * @param ENTRY
    cons
     * 		
     * @return float; the probability of ENTRY
     */
    @LispMethod(comment = "@param ENTRY\ncons\r\n\t\t\r\n@return float; the probability of ENTRY")
    public static final SubLObject trellis_entry_probability_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject entry = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            entry = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CAR, entry);
            } else {
                cdestructuring_bind_error(datum, $list_alt30);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param ENTRY
    cons
     * 		
     * @return float; the probability of ENTRY
     */
    @LispMethod(comment = "@param ENTRY\ncons\r\n\t\t\r\n@return float; the probability of ENTRY")
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

    /**
     *
     *
     * @param ENTRY
    cons
     * 		
     * @return float; the source of ENTRY
     */
    @LispMethod(comment = "@param ENTRY\ncons\r\n\t\t\r\n@return float; the source of ENTRY")
    public static final SubLObject trellis_entry_source_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject entry = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            entry = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CDR, entry);
            } else {
                cdestructuring_bind_error(datum, $list_alt30);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param ENTRY
    cons
     * 		
     * @return float; the source of ENTRY
     */
    @LispMethod(comment = "@param ENTRY\ncons\r\n\t\t\r\n@return float; the source of ENTRY")
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

    /**
     * Destructively modify ENTRY to have probability PROBABILITY and source SOURCE
     *
     * @param ENTRY
    cons
     * 		
     * @param PROBABILITY
    float
     * 		
     * @param SOURCE
    integer
     * 		
     * @unknown ENTRY is destructively modified
     */
    @LispMethod(comment = "Destructively modify ENTRY to have probability PROBABILITY and source SOURCE\r\n\r\n@param ENTRY\ncons\r\n\t\t\r\n@param PROBABILITY\nfloat\r\n\t\t\r\n@param SOURCE\ninteger\r\n\t\t\r\n@unknown ENTRY is destructively modified")
    public static final SubLObject trellis_entry_update_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject entry = NIL;
            SubLObject probability = NIL;
            SubLObject source = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt33);
            entry = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt33);
            probability = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt33);
            source = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PROGN, list(CSETF, list(CAR, entry), probability), list(CSETF, list(CDR, entry), source));
            } else {
                cdestructuring_bind_error(datum, $list_alt33);
            }
        }
        return NIL;
    }

    /**
     * Destructively modify ENTRY to have probability PROBABILITY and source SOURCE
     *
     * @param ENTRY
    		cons
     * 		
     * @param PROBABILITY
    		float
     * 		
     * @param SOURCE
    		integer
     * 		
     * @unknown ENTRY is destructively modified
     */
    @LispMethod(comment = "Destructively modify ENTRY to have probability PROBABILITY and source SOURCE\r\n\r\n@param ENTRY\n\t\tcons\r\n\t\t\r\n@param PROBABILITY\n\t\tfloat\r\n\t\t\r\n@param SOURCE\n\t\tinteger\r\n\t\t\r\n@unknown ENTRY is destructively modified")
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

    public static final SubLObject new_trellis_alt() {
        return list(NIL);
    }

    public static SubLObject new_trellis() {
        return list(NIL);
    }

    /**
     * Create and move to a new column
     */
    @LispMethod(comment = "Create and move to a new column")
    public static final SubLObject trellis_new_column_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject trellis = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            trellis = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CPUSH, NIL, trellis);
            } else {
                cdestructuring_bind_error(datum, $list_alt36);
            }
        }
        return NIL;
    }

    /**
     * Create and move to a new column
     */
    @LispMethod(comment = "Create and move to a new column")
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

    /**
     * Return the current column
     */
    @LispMethod(comment = "Return the current column")
    public static final SubLObject trellis_current_column_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject trellis = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            trellis = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CAR, trellis);
            } else {
                cdestructuring_bind_error(datum, $list_alt36);
            }
        }
        return NIL;
    }

    /**
     * Return the current column
     */
    @LispMethod(comment = "Return the current column")
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

    /**
     * Return the value associated with KEY from the current column of TRELLIS
     */
    @LispMethod(comment = "Return the value associated with KEY from the current column of TRELLIS")
    public static final SubLObject trellis_get_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject trellis = NIL;
            SubLObject key = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt38);
            trellis = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt38);
            key = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CDR, listS(ASSOC, key, list(TRELLIS_CURRENT_COLUMN, trellis), $list_alt41));
            } else {
                cdestructuring_bind_error(datum, $list_alt38);
            }
        }
        return NIL;
    }

    /**
     * Return the value associated with KEY from the current column of TRELLIS
     */
    @LispMethod(comment = "Return the value associated with KEY from the current column of TRELLIS")
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

    /**
     * Associate KEY with VALUE in the TRELLIS' current column
     */
    @LispMethod(comment = "Associate KEY with VALUE in the TRELLIS\' current column")
    public static final SubLObject trellis_set_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject trellis = NIL;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            trellis = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(RPLACA, trellis, list(ACONS, key, value, list(CAR, trellis)));
            } else {
                cdestructuring_bind_error(datum, $list_alt42);
            }
        }
        return NIL;
    }

    /**
     * Associate KEY with VALUE in the TRELLIS' current column
     */
    @LispMethod(comment = "Associate KEY with VALUE in the TRELLIS\' current column")
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

    /**
     * Finalize the current column and move back to the previous column
     */
    @LispMethod(comment = "Finalize the current column and move back to the previous column")
    public static final SubLObject trellis_finalize_column_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject trellis = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            trellis = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CPOP, trellis);
            } else {
                cdestructuring_bind_error(datum, $list_alt36);
            }
        }
        return NIL;
    }

    /**
     * Finalize the current column and move back to the previous column
     */
    @LispMethod(comment = "Finalize the current column and move back to the previous column")
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

    /**
     *
     *
     * @param TRELLIS
    trellis
     * 		
     * @param CLOCK
    integer
     * 		
     * @return trellis-entry; the entry in TRELLIS at position CLOCK with the maximum probability
    compared to all other entries at position CLOCK
     */
    @LispMethod(comment = "@param TRELLIS\ntrellis\r\n\t\t\r\n@param CLOCK\ninteger\r\n\t\t\r\n@return trellis-entry; the entry in TRELLIS at position CLOCK with the maximum probability\r\ncompared to all other entries at position CLOCK")
    public static final SubLObject trellis_get_max_entry_alt(SubLObject trellis) {
        {
            SubLObject max_probability = $impossibility$.getGlobalValue();
            SubLObject result = NIL;
            SubLObject probability = NIL;
            SubLObject cdolist_list_var = trellis.first();
            SubLObject stateXentry = NIL;
            for (stateXentry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , stateXentry = cdolist_list_var.first()) {
                probability = stateXentry.rest().first();
                if (probability.numGE(max_probability)) {
                    result = stateXentry;
                    max_probability = probability;
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @param TRELLIS
    trellis
     * 		
     * @param CLOCK
    integer
     * 		
     * @return trellis-entry; the entry in TRELLIS at position CLOCK with the maximum probability
    compared to all other entries at position CLOCK
     */
    @LispMethod(comment = "@param TRELLIS\ntrellis\r\n\t\t\r\n@param CLOCK\ninteger\r\n\t\t\r\n@return trellis-entry; the entry in TRELLIS at position CLOCK with the maximum probability\r\ncompared to all other entries at position CLOCK")
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

    public static final SubLObject tagger_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tagger_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject tagger_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pos_tagger.$tagger_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject tagger_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pos_tagger.$tagger_native.class ? T : NIL;
    }

    public static final SubLObject tagger_hmm_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAGGER_P);
        return v_object.getField2();
    }

    public static SubLObject tagger_hmm(final SubLObject v_object) {
        assert NIL != tagger_p(v_object) : "! pos_tagger.tagger_p(v_object) " + "pos_tagger.tagger_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject tagger_state_interpretation_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAGGER_P);
        return v_object.getField3();
    }

    public static SubLObject tagger_state_interpretation(final SubLObject v_object) {
        assert NIL != tagger_p(v_object) : "! pos_tagger.tagger_p(v_object) " + "pos_tagger.tagger_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_tagger_hmm_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAGGER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tagger_hmm(final SubLObject v_object, final SubLObject value) {
        assert NIL != tagger_p(v_object) : "! pos_tagger.tagger_p(v_object) " + "pos_tagger.tagger_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tagger_state_interpretation_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAGGER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tagger_state_interpretation(final SubLObject v_object, final SubLObject value) {
        assert NIL != tagger_p(v_object) : "! pos_tagger.tagger_p(v_object) " + "pos_tagger.tagger_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_tagger_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.pos_tagger.$tagger_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($HMM)) {
                        _csetf_tagger_hmm(v_new, current_value);
                    } else {
                        if (pcase_var.eql($STATE_INTERPRETATION)) {
                            _csetf_tagger_state_interpretation(v_new, current_value);
                        } else {
                            Errors.error($str_alt60$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_tagger(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.pos_tagger.$tagger_native();
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

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of this tagger's initialization data
     * @return tagger; a new tagger initialized with the data in SOURCE-PATH
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of this tagger\'s initialization data\r\n@return tagger; a new tagger initialized with the data in SOURCE-PATH")
    public static final SubLObject new_tagger_alt(SubLObject source_path) {
        if (source_path == UNPROVIDED) {
            source_path = $tagger_data_path$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(source_path, LISTP);
        {
            SubLObject tagger = make_tagger(UNPROVIDED);
            _csetf_tagger_hmm(tagger, new_hmm(source_path));
            _csetf_tagger_state_interpretation(tagger, new_state_interpretation($int$50, source_path));
            return tagger;
        }
    }

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of this tagger's initialization data
     * @return tagger; a new tagger initialized with the data in SOURCE-PATH
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of this tagger\'s initialization data\r\n@return tagger; a new tagger initialized with the data in SOURCE-PATH")
    public static SubLObject new_tagger(SubLObject source_path) {
        if (source_path == UNPROVIDED) {
            source_path = $tagger_data_path$.getDynamicValue();
        }
        assert NIL != listp(source_path) : "! listp(source_path) " + ("Types.listp(source_path) " + "CommonSymbols.NIL != Types.listp(source_path) ") + source_path;
        final SubLObject tagger = make_tagger(UNPROVIDED);
        _csetf_tagger_hmm(tagger, new_hmm(source_path));
        _csetf_tagger_state_interpretation(tagger, new_state_interpretation($int$50, source_path));
        return tagger;
    }

    /**
     *
     *
     * @param TAGGER
     * 		taggerp;
     * 		Finalizes TAGGER
     */
    @LispMethod(comment = "@param TAGGER\r\n\t\ttaggerp;\r\n\t\tFinalizes TAGGER")
    public static final SubLObject finalize_tagger_alt(SubLObject tagger) {
        SubLTrampolineFile.checkType(tagger, TAGGER_P);
        return finalize_hmm(tagger_hmm(tagger));
    }

    /**
     *
     *
     * @param TAGGER
     * 		taggerp;
     * 		Finalizes TAGGER
     */
    @LispMethod(comment = "@param TAGGER\r\n\t\ttaggerp;\r\n\t\tFinalizes TAGGER")
    public static SubLObject finalize_tagger(final SubLObject tagger) {
        assert NIL != tagger_p(tagger) : "! pos_tagger.tagger_p(tagger) " + ("pos_tagger.tagger_p(tagger) " + "CommonSymbols.NIL != pos_tagger.tagger_p(tagger) ") + tagger;
        return finalize_hmm(tagger_hmm(tagger));
    }

    /**
     *
     *
     * @param TAGGER
    tagger
     * 		
     * @param DOCUMENT
     * 		document; the document to be tagged
     * @return document; a destructively modified DOCUMENT such that the parts-of-speech
    slot of each word in DOCUMENT has been assigned one or more part-of-speech tags
     * @unknown destructively modifies the parts-of-speech slot of each word in
    DOCUMENT
     */
    @LispMethod(comment = "@param TAGGER\ntagger\r\n\t\t\r\n@param DOCUMENT\r\n\t\tdocument; the document to be tagged\r\n@return document; a destructively modified DOCUMENT such that the parts-of-speech\r\nslot of each word in DOCUMENT has been assigned one or more part-of-speech tags\r\n@unknown destructively modifies the parts-of-speech slot of each word in\r\nDOCUMENT")
    public static final SubLObject tagger_tag_document_alt(SubLObject tagger, SubLObject v_document) {
        SubLTrampolineFile.checkType(tagger, TAGGER_P);
        SubLTrampolineFile.checkType(v_document, DOCUMENT_P);
        {
            SubLObject vector_var = document.document_paragraphs(v_document);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject paragraph = aref(vector_var, element_num);
                    SubLObject vector_var_4 = document.paragraph_sentences(paragraph);
                    SubLObject backwardP_var_5 = NIL;
                    SubLObject length_6 = length(vector_var_4);
                    SubLObject v_iteration_7 = NIL;
                    for (v_iteration_7 = ZERO_INTEGER; v_iteration_7.numL(length_6); v_iteration_7 = add(v_iteration_7, ONE_INTEGER)) {
                        {
                            SubLObject element_num_8 = (NIL != backwardP_var_5) ? ((SubLObject) (subtract(length_6, v_iteration_7, ONE_INTEGER))) : v_iteration_7;
                            SubLObject sentence = aref(vector_var_4, element_num_8);
                            tagger_tag_sentence(tagger, sentence);
                        }
                    }
                }
            }
        }
        return v_document;
    }

    /**
     *
     *
     * @param TAGGER
    tagger
     * 		
     * @param DOCUMENT
     * 		document; the document to be tagged
     * @return document; a destructively modified DOCUMENT such that the parts-of-speech
    slot of each word in DOCUMENT has been assigned one or more part-of-speech tags
     * @unknown destructively modifies the parts-of-speech slot of each word in
    DOCUMENT
     */
    @LispMethod(comment = "@param TAGGER\ntagger\r\n\t\t\r\n@param DOCUMENT\r\n\t\tdocument; the document to be tagged\r\n@return document; a destructively modified DOCUMENT such that the parts-of-speech\r\nslot of each word in DOCUMENT has been assigned one or more part-of-speech tags\r\n@unknown destructively modifies the parts-of-speech slot of each word in\r\nDOCUMENT")
    public static SubLObject tagger_tag_document(final SubLObject tagger, final SubLObject v_document) {
        assert NIL != tagger_p(tagger) : "! pos_tagger.tagger_p(tagger) " + ("pos_tagger.tagger_p(tagger) " + "CommonSymbols.NIL != pos_tagger.tagger_p(tagger) ") + tagger;
        assert NIL != document.document_p(v_document) : "! document.document_p(v_document) " + ("document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) ") + v_document;
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

    /**
     *
     *
     * @param TAGGER
    tagger
     * 		
     * @param SENTENCE
     * 		sentence; the sentence to be tagged by TAGGER
     * @return sentence; a destructively modified SENTENCE such that the parts-of-speech
    slot of each word in SENTENCE has been assigned one or more part-of-speech tags
     * @unknown destructively modifies the parts-of-speech slot of each word in
    SENTENCE
     */
    @LispMethod(comment = "@param TAGGER\ntagger\r\n\t\t\r\n@param SENTENCE\r\n\t\tsentence; the sentence to be tagged by TAGGER\r\n@return sentence; a destructively modified SENTENCE such that the parts-of-speech\r\nslot of each word in SENTENCE has been assigned one or more part-of-speech tags\r\n@unknown destructively modifies the parts-of-speech slot of each word in\r\nSENTENCE")
    public static final SubLObject tagger_tag_sentence_alt(SubLObject tagger, SubLObject sentence) {
        SubLTrampolineFile.checkType(tagger, TAGGER_P);
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        {
            SubLObject words = document.sentence_yield(sentence);
            if (length(words).isPositive()) {
                {
                    SubLObject initial_spelling = document.word_string(aref(words, ZERO_INTEGER));
                    tagger_normalize_initial_capitalization(tagger, words);
                    hmm_most_likely_path_probability(tagger_hmm(tagger), words);
                    document.word_update(aref(words, ZERO_INTEGER), list($STRING, initial_spelling));
                    {
                        SubLObject word = NIL;
                        SubLObject cdotimes_end_var = length(words);
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                            word = aref(words, i);
                            patch_word_tag(word);
                            document.word_update(word, list($CATEGORY, state_interpretation_get(tagger_state_interpretation(tagger), document.word_category(word))));
                        }
                    }
                }
            }
        }
        return sentence;
    }

    /**
     *
     *
     * @param TAGGER
    tagger
     * 		
     * @param SENTENCE
     * 		sentence; the sentence to be tagged by TAGGER
     * @return sentence; a destructively modified SENTENCE such that the parts-of-speech
    slot of each word in SENTENCE has been assigned one or more part-of-speech tags
     * @unknown destructively modifies the parts-of-speech slot of each word in
    SENTENCE
     */
    @LispMethod(comment = "@param TAGGER\ntagger\r\n\t\t\r\n@param SENTENCE\r\n\t\tsentence; the sentence to be tagged by TAGGER\r\n@return sentence; a destructively modified SENTENCE such that the parts-of-speech\r\nslot of each word in SENTENCE has been assigned one or more part-of-speech tags\r\n@unknown destructively modifies the parts-of-speech slot of each word in\r\nSENTENCE")
    public static SubLObject tagger_tag_sentence(final SubLObject tagger, final SubLObject sentence) {
        assert NIL != tagger_p(tagger) : "! pos_tagger.tagger_p(tagger) " + ("pos_tagger.tagger_p(tagger) " + "CommonSymbols.NIL != pos_tagger.tagger_p(tagger) ") + tagger;
        assert NIL != document.sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
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

    /**
     * correct the number-tag assigned to WORD if you know better than the tagger does
     */
    @LispMethod(comment = "correct the number-tag assigned to WORD if you know better than the tagger does")
    public static final SubLObject patch_word_tag_alt(SubLObject word) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_integer = assoc(cons(document.word_string(word), document.word_category(word)), $word_tag_patches$.getDynamicValue(thread), EQUAL, UNPROVIDED).rest();
                return NIL != new_integer ? ((SubLObject) (document.word_update(word, list($CATEGORY, new_integer)))) : NIL;
            }
        }
    }

    @LispMethod(comment = "correct the number-tag assigned to WORD if you know better than the tagger does")
    public static SubLObject patch_word_tag(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_integer = assoc(cons(document.word_string(word), document.word_category(word)), $word_tag_patches$.getDynamicValue(thread), EQUAL, UNPROVIDED).rest();
        return NIL != new_integer ? document.word_update(word, list($CATEGORY, new_integer)) : NIL;
    }

    /**
     *
     *
     * @param TAGGER
    tagger
     * 		
     * @param WORDS
     * 		vector; the sentence whose initial word's capitalization is
     * 		to be normalized
     * @return sentence; a version of SENTENCE that has possibly been destructively
    modified to a most likely capitalization of the first word
     * @unknown may destructively modify SENTENCE's first word
     */
    @LispMethod(comment = "@param TAGGER\ntagger\r\n\t\t\r\n@param WORDS\r\n\t\tvector; the sentence whose initial word\'s capitalization is\r\n\t\tto be normalized\r\n@return sentence; a version of SENTENCE that has possibly been destructively\r\nmodified to a most likely capitalization of the first word\r\n@unknown may destructively modify SENTENCE\'s first word")
    public static final SubLObject tagger_normalize_initial_capitalization_alt(SubLObject tagger, SubLObject words) {
        SubLTrampolineFile.checkType(tagger, TAGGER_P);
        SubLTrampolineFile.checkType(words, VECTORP);
        if (NIL == exclude_from_normalizationP(document.word_string(aref(words, ZERO_INTEGER)))) {
            {
                SubLObject orig_first = document.new_word(list($STRING, document.word_string(aref(words, ZERO_INTEGER))));
                SubLObject second_word = (length(words).numG(ONE_INTEGER)) ? ((SubLObject) (document.new_word(list($STRING, document.word_string(aref(words, ONE_INTEGER)))))) : document.new_word($list_alt69);
                SubLObject downcase_first = document.new_word(list($STRING, Strings.string_downcase(document.word_string(orig_first), UNPROVIDED, UNPROVIDED)));
                SubLObject orig_prob = $impossibility$.getGlobalValue();
                SubLObject downcase_prob = $impossibility$.getGlobalValue();
                SubLObject orig_sentence = vector(new SubLObject[]{ orig_first, second_word });
                SubLObject downcase_sentence = vector(new SubLObject[]{ downcase_first, second_word });
                SubLObject hmm = tagger_hmm(tagger);
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
        }
        return words;
    }

    /**
     *
     *
     * @param TAGGER
    tagger
     * 		
     * @param WORDS
     * 		vector; the sentence whose initial word's capitalization is
     * 		to be normalized
     * @return sentence; a version of SENTENCE that has possibly been destructively
    modified to a most likely capitalization of the first word
     * @unknown may destructively modify SENTENCE's first word
     */
    @LispMethod(comment = "@param TAGGER\ntagger\r\n\t\t\r\n@param WORDS\r\n\t\tvector; the sentence whose initial word\'s capitalization is\r\n\t\tto be normalized\r\n@return sentence; a version of SENTENCE that has possibly been destructively\r\nmodified to a most likely capitalization of the first word\r\n@unknown may destructively modify SENTENCE\'s first word")
    public static SubLObject tagger_normalize_initial_capitalization(final SubLObject tagger, final SubLObject words) {
        assert NIL != tagger_p(tagger) : "! pos_tagger.tagger_p(tagger) " + ("pos_tagger.tagger_p(tagger) " + "CommonSymbols.NIL != pos_tagger.tagger_p(tagger) ") + tagger;
        assert NIL != vectorp(words) : "! vectorp(words) " + ("Types.vectorp(words) " + "CommonSymbols.NIL != Types.vectorp(words) ") + words;
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

    /**
     *
     *
     * @return boolean; t if STRING's spelling should not be normalized when occurring
    sentence-initially, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if STRING\'s spelling should not be normalized when occurring\r\nsentence-initially, nil otherwise")
    public static final SubLObject exclude_from_normalizationP_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return member(string, $exclude_from_normalization$.getDynamicValue(thread), EQUAL, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return boolean; t if STRING's spelling should not be normalized when occurring
    sentence-initially, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if STRING\'s spelling should not be normalized when occurring\r\nsentence-initially, nil otherwise")
    public static SubLObject exclude_from_normalizationP(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return member(string, $exclude_from_normalization$.getDynamicValue(thread), EQUAL, UNPROVIDED);
    }

    /**
     *
     *
     * @param SOURCE-PATH
    string
     * 		
     * @return vector; a new vector initialized with the mapping in SOURCE-PATH that maps
    hmm states (integers) to something else (usually Cyc part-of-speech tags)
     */
    @LispMethod(comment = "@param SOURCE-PATH\nstring\r\n\t\t\r\n@return vector; a new vector initialized with the mapping in SOURCE-PATH that maps\r\nhmm states (integers) to something else (usually Cyc part-of-speech tags)")
    public static final SubLObject new_state_interpretation_alt(SubLObject size, SubLObject source_path) {
        {
            SubLObject state_interpretation = make_vector(size, UNPROVIDED);
            SubLObject state_interpretation_path = cyc_home_filename(source_path, $state_interpretation_resource$.getGlobalValue(), $$$txt);
            SubLObject tokens = NIL;
            SubLObject state = NIL;
            SubLObject interpretation = NIL;
            if (NIL != Filesys.probe_file(state_interpretation_path)) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(state_interpretation_path, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt20$Unable_to_open__S, state_interpretation_path);
                        }
                        {
                            SubLObject infile = stream;
                            if (infile.isStream()) {
                                {
                                    SubLObject line = NIL;
                                    for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                        tokens = string_utilities.split_string(line, $token_delimiters$.getGlobalValue());
                                        state = parse_integer(tokens.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        interpretation = (length(tokens.rest()).numG(ONE_INTEGER)) ? ((SubLObject) (tokens.rest())) : second(tokens);
                                        set_aref(state_interpretation, state, make_keyword(interpretation));
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            } else {
                Errors.error($str_alt71$Unable_to_initialize_pos_tagger_s, state_interpretation_path);
            }
            return state_interpretation;
        }
    }

    /**
     *
     *
     * @param SOURCE-PATH
    string
     * 		
     * @return vector; a new vector initialized with the mapping in SOURCE-PATH that maps
    hmm states (integers) to something else (usually Cyc part-of-speech tags)
     */
    @LispMethod(comment = "@param SOURCE-PATH\nstring\r\n\t\t\r\n@return vector; a new vector initialized with the mapping in SOURCE-PATH that maps\r\nhmm states (integers) to something else (usually Cyc part-of-speech tags)")
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

    /**
     *
     *
     * @param SI
    vector
     * 		
     * @param state
    integer
     * 		
     * @return the value associated with STATE in SI
     */
    @LispMethod(comment = "@param SI\nvector\r\n\t\t\r\n@param state\ninteger\r\n\t\t\r\n@return the value associated with STATE in SI")
    public static final SubLObject state_interpretation_get_alt(SubLObject si, SubLObject state) {
        return aref(si, state);
    }

    /**
     *
     *
     * @param SI
    vector
     * 		
     * @param state
    integer
     * 		
     * @return the value associated with STATE in SI
     */
    @LispMethod(comment = "@param SI\nvector\r\n\t\t\r\n@param state\ninteger\r\n\t\t\r\n@return the value associated with STATE in SI")
    public static SubLObject state_interpretation_get(final SubLObject si, final SubLObject state) {
        return aref(si, state);
    }

    public static final SubLObject hmm_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject hmm_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject hmm_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pos_tagger.$hmm_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject hmm_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pos_tagger.$hmm_native.class ? T : NIL;
    }

    public static final SubLObject hmm_initial_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HMM_P);
        return v_object.getField2();
    }

    public static SubLObject hmm_initial_state(final SubLObject v_object) {
        assert NIL != hmm_p(v_object) : "! pos_tagger.hmm_p(v_object) " + "pos_tagger.hmm_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject hmm_states_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HMM_P);
        return v_object.getField3();
    }

    public static SubLObject hmm_states(final SubLObject v_object) {
        assert NIL != hmm_p(v_object) : "! pos_tagger.hmm_p(v_object) " + "pos_tagger.hmm_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject hmm_transitions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HMM_P);
        return v_object.getField4();
    }

    public static SubLObject hmm_transitions(final SubLObject v_object) {
        assert NIL != hmm_p(v_object) : "! pos_tagger.hmm_p(v_object) " + "pos_tagger.hmm_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_hmm_initial_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HMM_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_hmm_initial_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != hmm_p(v_object) : "! pos_tagger.hmm_p(v_object) " + "pos_tagger.hmm_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_hmm_states_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HMM_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_hmm_states(final SubLObject v_object, final SubLObject value) {
        assert NIL != hmm_p(v_object) : "! pos_tagger.hmm_p(v_object) " + "pos_tagger.hmm_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_hmm_transitions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HMM_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_hmm_transitions(final SubLObject v_object, final SubLObject value) {
        assert NIL != hmm_p(v_object) : "! pos_tagger.hmm_p(v_object) " + "pos_tagger.hmm_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_hmm_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.pos_tagger.$hmm_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($INITIAL_STATE)) {
                        _csetf_hmm_initial_state(v_new, current_value);
                    } else {
                        if (pcase_var.eql($STATES)) {
                            _csetf_hmm_states(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TRANSITIONS)) {
                                _csetf_hmm_transitions(v_new, current_value);
                            } else {
                                Errors.error($str_alt60$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_hmm(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.pos_tagger.$hmm_native();
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

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this hmm
     * @return hmm; a new hmm initialized with the data in SOURCE-PATH
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this hmm\r\n@return hmm; a new hmm initialized with the data in SOURCE-PATH")
    public static final SubLObject new_hmm_alt(SubLObject source_path) {
        {
            SubLObject path = cyc_home_filename(source_path, $initial_state_resource$.getGlobalValue(), $$$txt);
            SubLObject hmm = make_hmm(UNPROVIDED);
            if (NIL != Filesys.probe_file(path)) {
                _csetf_hmm_initial_state(hmm, parse_integer(load_list(path).first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else {
                Errors.error($str_alt88$Unable_to_initialize_pos_tagger_H, path);
            }
            _csetf_hmm_states(hmm, new_state_set(source_path, UNPROVIDED));
            _csetf_hmm_transitions(hmm, new_transition_set(source_path));
            return hmm;
        }
    }

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this hmm
     * @return hmm; a new hmm initialized with the data in SOURCE-PATH
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this hmm\r\n@return hmm; a new hmm initialized with the data in SOURCE-PATH")
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

    /**
     * Finalizes HMM
     */
    @LispMethod(comment = "Finalizes HMM")
    public static final SubLObject finalize_hmm_alt(SubLObject hmm) {
        return finalize_state_set(hmm_states(hmm));
    }

    @LispMethod(comment = "Finalizes HMM")
    public static SubLObject finalize_hmm(final SubLObject hmm) {
        return finalize_state_set(hmm_states(hmm));
    }

    /**
     *
     *
     * @param HMM
    hmm
     * 		
     * @param SENTENCE
    sentence;
     * 		
     * @return float; the probability of the most likely path that HMM will take to generate
    SENTENCE
     * @unknown the parts-of-speech slot of each word in SENTENCE will be destructively
    modified to reflect the most likely path that HMM will take to generate SENTENCE
     */
    @LispMethod(comment = "@param HMM\nhmm\r\n\t\t\r\n@param SENTENCE\nsentence;\r\n\t\t\r\n@return float; the probability of the most likely path that HMM will take to generate\r\nSENTENCE\r\n@unknown the parts-of-speech slot of each word in SENTENCE will be destructively\r\nmodified to reflect the most likely path that HMM will take to generate SENTENCE")
    public static final SubLObject hmm_most_likely_path_probability_alt(SubLObject hmm, SubLObject words) {
        {
            SubLObject trellis = new_trellis();
            SubLObject states = hmm_states(hmm);
            SubLObject transitions = hmm_transitions(hmm);
            SubLObject word_cond_state_prob = NIL;
            SubLObject state = NIL;
            SubLObject probability = NIL;
            SubLObject max_entry = NIL;
            SubLObject prev_column = NIL;
            SubLObject prev_state = NIL;
            SubLObject transition_distribution = NIL;
            SubLObject word = NIL;
            rplaca(trellis, acons(hmm_initial_state(hmm), cons($certainty$.getGlobalValue(), NIL), trellis.first()));
            {
                SubLObject cdotimes_end_var = length(words);
                SubLObject j = NIL;
                for (j = ZERO_INTEGER; j.numL(cdotimes_end_var); j = add(j, ONE_INTEGER)) {
                    word = aref(words, j);
                    prev_column = trellis.first();
                    trellis = cons(NIL, trellis);
                    {
                        SubLObject cdolist_list_var = state_set_get_distribution(states, word);
                        SubLObject stateXprob = NIL;
                        for (stateXprob = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , stateXprob = cdolist_list_var.first()) {
                            state = stateXprob.first();
                            word_cond_state_prob = stateXprob.rest();
                            max_entry = cons($impossibility$.getGlobalValue(), ZERO_INTEGER);
                            transition_distribution = transition_set_get_distribution(transitions, state);
                            {
                                SubLObject cdolist_list_var_9 = prev_column;
                                SubLObject prev_stateXtrellis_entry = NIL;
                                for (prev_stateXtrellis_entry = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , prev_stateXtrellis_entry = cdolist_list_var_9.first()) {
                                    prev_state = prev_stateXtrellis_entry.first();
                                    probability = add(prev_stateXtrellis_entry.rest().first(), aref(transition_distribution, prev_state), word_cond_state_prob);
                                    if (probability.numG(max_entry.first())) {
                                        rplaca(max_entry, probability);
                                        rplacd(max_entry, prev_state);
                                    }
                                }
                            }
                            rplaca(trellis, acons(state, max_entry, trellis.first()));
                        }
                    }
                }
            }
            {
                SubLObject word_index = subtract(length(words), ONE_INTEGER);
                SubLObject maxstateXentry = trellis_get_max_entry(trellis);
                SubLObject max_state = maxstateXentry.first();
                while (!word_index.isNegative()) {
                    document.word_update(aref(words, word_index), list($CATEGORY, max_state));
                    max_state = assoc(max_state, trellis.first(), symbol_function(EQL), UNPROVIDED).rest().rest();
                    word_index = subtract(word_index, ONE_INTEGER);
                    trellis = trellis.rest();
                } 
                return maxstateXentry.rest().first();
            }
        }
    }

    /**
     *
     *
     * @param HMM
    hmm
     * 		
     * @param SENTENCE
    sentence;
     * 		
     * @return float; the probability of the most likely path that HMM will take to generate
    SENTENCE
     * @unknown the parts-of-speech slot of each word in SENTENCE will be destructively
    modified to reflect the most likely path that HMM will take to generate SENTENCE
     */
    @LispMethod(comment = "@param HMM\nhmm\r\n\t\t\r\n@param SENTENCE\nsentence;\r\n\t\t\r\n@return float; the probability of the most likely path that HMM will take to generate\r\nSENTENCE\r\n@unknown the parts-of-speech slot of each word in SENTENCE will be destructively\r\nmodified to reflect the most likely path that HMM will take to generate SENTENCE")
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

    public static final SubLObject state_set_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject state_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject state_set_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pos_tagger.$state_set_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject state_set_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pos_tagger.$state_set_native.class ? T : NIL;
    }

    public static final SubLObject state_set_store_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STATE_SET_P);
        return v_object.getField2();
    }

    public static SubLObject state_set_store(final SubLObject v_object) {
        assert NIL != state_set_p(v_object) : "! pos_tagger.state_set_p(v_object) " + "pos_tagger.state_set_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject state_set_estimator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STATE_SET_P);
        return v_object.getField3();
    }

    public static SubLObject state_set_estimator(final SubLObject v_object) {
        assert NIL != state_set_p(v_object) : "! pos_tagger.state_set_p(v_object) " + "pos_tagger.state_set_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject state_set_cache_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, STATE_SET_P);
        return v_object.getField4();
    }

    public static SubLObject state_set_cache(final SubLObject v_object) {
        assert NIL != state_set_p(v_object) : "! pos_tagger.state_set_p(v_object) " + "pos_tagger.state_set_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_state_set_store_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STATE_SET_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_state_set_store(final SubLObject v_object, final SubLObject value) {
        assert NIL != state_set_p(v_object) : "! pos_tagger.state_set_p(v_object) " + "pos_tagger.state_set_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_state_set_estimator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STATE_SET_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_state_set_estimator(final SubLObject v_object, final SubLObject value) {
        assert NIL != state_set_p(v_object) : "! pos_tagger.state_set_p(v_object) " + "pos_tagger.state_set_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_state_set_cache_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, STATE_SET_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_state_set_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != state_set_p(v_object) : "! pos_tagger.state_set_p(v_object) " + "pos_tagger.state_set_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_state_set_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.pos_tagger.$state_set_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STORE)) {
                        _csetf_state_set_store(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ESTIMATOR)) {
                            _csetf_state_set_estimator(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CACHE)) {
                                _csetf_state_set_cache(v_new, current_value);
                            } else {
                                Errors.error($str_alt60$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_state_set(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.pos_tagger.$state_set_native();
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

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this state set
     * @return a new state set initialized with the data in SOURCE-PATH
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this state set\r\n@return a new state set initialized with the data in SOURCE-PATH")
    public static final SubLObject new_state_set_alt(SubLObject source_path, SubLObject cache_capacity) {
        if (cache_capacity == UNPROVIDED) {
            cache_capacity = $state_set_cache_capacity$.getDynamicValue();
        }
        {
            SubLObject path = cyc_home_filename(source_path, $state_resource$.getGlobalValue(), $$$fht);
            SubLObject state_set = make_state_set(UNPROVIDED);
            if (NIL != Filesys.probe_file(path)) {
                _csetf_state_set_store(state_set, new_cpf(path, symbol_function(EQUAL)));
            } else {
                Errors.error($str_alt106$Unable_to_initialize_pos_tagger_s, path);
            }
            _csetf_state_set_estimator(state_set, new_emission_probability_estimator(source_path));
            _csetf_state_set_cache(state_set, cache.new_cache(cache_capacity, symbol_function(EQUAL)));
            return state_set;
        }
    }

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this state set
     * @return a new state set initialized with the data in SOURCE-PATH
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this state set\r\n@return a new state set initialized with the data in SOURCE-PATH")
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

    /**
     * Finalizes STATE-SET
     */
    @LispMethod(comment = "Finalizes STATE-SET")
    public static final SubLObject finalize_state_set_alt(SubLObject state_set) {
        return finalize_cpf(state_set_store(state_set));
    }

    @LispMethod(comment = "Finalizes STATE-SET")
    public static SubLObject finalize_state_set(final SubLObject state_set) {
        return finalize_cpf(state_set_store(state_set));
    }

    /**
     *
     *
     * @param STATE-SET
    state-set
     * 		
     * @param WORD
    word
     * 		
     * @return a-list; a list of conditioning-probability pairs, where each pair expresses the
    fact that p(WORD|CONDITIONING) = PROBABILITY
     */
    @LispMethod(comment = "@param STATE-SET\nstate-set\r\n\t\t\r\n@param WORD\nword\r\n\t\t\r\n@return a-list; a list of conditioning-probability pairs, where each pair expresses the\r\nfact that p(WORD|CONDITIONING) = PROBABILITY")
    public static final SubLObject state_set_get_distribution_alt(SubLObject state_set, SubLObject word) {
        {
            SubLObject string = document.word_string(word);
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
    }

    /**
     *
     *
     * @param STATE-SET
    state-set
     * 		
     * @param WORD
    word
     * 		
     * @return a-list; a list of conditioning-probability pairs, where each pair expresses the
    fact that p(WORD|CONDITIONING) = PROBABILITY
     */
    @LispMethod(comment = "@param STATE-SET\nstate-set\r\n\t\t\r\n@param WORD\nword\r\n\t\t\r\n@return a-list; a list of conditioning-probability pairs, where each pair expresses the\r\nfact that p(WORD|CONDITIONING) = PROBABILITY")
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

    /**
     *
     *
     * @param STATES
    state-set-p;
     * 		
     * @param WORD
    word;
     * 		
     * @return boolean; non-nil if WORD is known to STATES, nil otherwise
     */
    @LispMethod(comment = "@param STATES\nstate-set-p;\r\n\t\t\r\n@param WORD\nword;\r\n\t\t\r\n@return boolean; non-nil if WORD is known to STATES, nil otherwise")
    public static final SubLObject state_set_known_word_alt(SubLObject states, SubLObject word) {
        {
            SubLObject distribution = cache.cache_get(state_set_cache(states), document.word_string(word));
            return NIL != distribution ? ((SubLObject) (distribution)) : cpf_get_distribution(state_set_store(states), document.word_string(word));
        }
    }

    /**
     *
     *
     * @param STATES
    state-set-p;
     * 		
     * @param WORD
    word;
     * 		
     * @return boolean; non-nil if WORD is known to STATES, nil otherwise
     */
    @LispMethod(comment = "@param STATES\nstate-set-p;\r\n\t\t\r\n@param WORD\nword;\r\n\t\t\r\n@return boolean; non-nil if WORD is known to STATES, nil otherwise")
    public static SubLObject state_set_known_word(final SubLObject states, final SubLObject word) {
        final SubLObject distribution = cache.cache_get(state_set_cache(states), document.word_string(word));
        return NIL != distribution ? distribution : cpf_get_distribution(state_set_store(states), document.word_string(word));
    }

    public static final SubLObject transition_set_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject transition_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject transition_set_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pos_tagger.$transition_set_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject transition_set_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pos_tagger.$transition_set_native.class ? T : NIL;
    }

    public static final SubLObject transition_set_known_probabilities_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANSITION_SET_P);
        return v_object.getField2();
    }

    public static SubLObject transition_set_known_probabilities(final SubLObject v_object) {
        assert NIL != transition_set_p(v_object) : "! pos_tagger.transition_set_p(v_object) " + "pos_tagger.transition_set_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject transition_set_estimated_probabilities_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRANSITION_SET_P);
        return v_object.getField3();
    }

    public static SubLObject transition_set_estimated_probabilities(final SubLObject v_object) {
        assert NIL != transition_set_p(v_object) : "! pos_tagger.transition_set_p(v_object) " + "pos_tagger.transition_set_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_transition_set_known_probabilities_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANSITION_SET_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_transition_set_known_probabilities(final SubLObject v_object, final SubLObject value) {
        assert NIL != transition_set_p(v_object) : "! pos_tagger.transition_set_p(v_object) " + "pos_tagger.transition_set_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_transition_set_estimated_probabilities_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRANSITION_SET_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_transition_set_estimated_probabilities(final SubLObject v_object, final SubLObject value) {
        assert NIL != transition_set_p(v_object) : "! pos_tagger.transition_set_p(v_object) " + "pos_tagger.transition_set_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_transition_set_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.pos_tagger.$transition_set_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($KNOWN_PROBABILITIES)) {
                        _csetf_transition_set_known_probabilities(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ESTIMATED_PROBABILITIES)) {
                            _csetf_transition_set_estimated_probabilities(v_new, current_value);
                        } else {
                            Errors.error($str_alt60$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_transition_set(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.pos_tagger.$transition_set_native();
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

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this transition set
     * @return transition-set; a new transition set initialized with the data in SOURCE-PATH
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this transition set\r\n@return transition-set; a new transition set initialized with the data in SOURCE-PATH")
    public static final SubLObject new_transition_set_alt(SubLObject source_path) {
        {
            SubLObject transition_set = make_transition_set(UNPROVIDED);
            SubLObject transition_path = cyc_home_filename(source_path, $transition_resource$.getGlobalValue(), $$$txt);
            if (NIL != Filesys.probe_file(transition_path)) {
                _csetf_transition_set_known_probabilities(transition_set, new_cpa($int$50, $int$50, transition_path, symbol_function(READ_FROM_STRING)));
            } else {
                Errors.error($str_alt121$Unable_to_initialize_pos_tagger_H, transition_path);
            }
            _csetf_transition_set_estimated_probabilities(transition_set, NIL);
            return transition_set;
        }
    }

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this transition set
     * @return transition-set; a new transition set initialized with the data in SOURCE-PATH
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this transition set\r\n@return transition-set; a new transition set initialized with the data in SOURCE-PATH")
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

    /**
     *
     *
     * @param TRANSITION-SET
    transition-set
     * 		
     * @param CONDITIONED
     * 		integer; an HMM state
     * @param CONDITIONING
     * 		integer; an HMM state
     * @return floatp; the probability p(STATE2|STATE1) according to TRANSITION-SET
     */
    @LispMethod(comment = "@param TRANSITION-SET\ntransition-set\r\n\t\t\r\n@param CONDITIONED\r\n\t\tinteger; an HMM state\r\n@param CONDITIONING\r\n\t\tinteger; an HMM state\r\n@return floatp; the probability p(STATE2|STATE1) according to TRANSITION-SET")
    public static final SubLObject transition_set_get_alt(SubLObject transition_set, SubLObject conditioned, SubLObject conditioning) {
        return aref(aref(transition_set_known_probabilities(transition_set), conditioned), conditioning);
    }

    /**
     *
     *
     * @param TRANSITION-SET
    transition-set
     * 		
     * @param CONDITIONED
     * 		integer; an HMM state
     * @param CONDITIONING
     * 		integer; an HMM state
     * @return floatp; the probability p(STATE2|STATE1) according to TRANSITION-SET
     */
    @LispMethod(comment = "@param TRANSITION-SET\ntransition-set\r\n\t\t\r\n@param CONDITIONED\r\n\t\tinteger; an HMM state\r\n@param CONDITIONING\r\n\t\tinteger; an HMM state\r\n@return floatp; the probability p(STATE2|STATE1) according to TRANSITION-SET")
    public static SubLObject transition_set_get(final SubLObject transition_set, final SubLObject conditioned, final SubLObject conditioning) {
        return aref(aref(transition_set_known_probabilities(transition_set), conditioned), conditioning);
    }

    public static final SubLObject transition_set_get_distribution_alt(SubLObject transition_set, SubLObject conditioned) {
        return aref(transition_set_known_probabilities(transition_set), conditioned);
    }

    public static SubLObject transition_set_get_distribution(final SubLObject transition_set, final SubLObject conditioned) {
        return aref(transition_set_known_probabilities(transition_set), conditioned);
    }

    /**
     *
     *
     * @param TRANSITION-SET
    transition-set
     * 		
     * @param CONDITIONED
     * 		object; an HMM state
     * @param CONDITIONING
     * 		object an HMM state
     * @param PROBABILITY
    floatp;
     * 		
     * @return transition-set; a version of TRANSITION-SET that hav been destructively updated
    with the fact  (pCONDITINED|CONDITIONING) = PROBABILITY
     * @unknown TRANSITION-SET is destructively modified
     */
    @LispMethod(comment = "@param TRANSITION-SET\ntransition-set\r\n\t\t\r\n@param CONDITIONED\r\n\t\tobject; an HMM state\r\n@param CONDITIONING\r\n\t\tobject an HMM state\r\n@param PROBABILITY\nfloatp;\r\n\t\t\r\n@return transition-set; a version of TRANSITION-SET that hav been destructively updated\r\nwith the fact  (pCONDITINED|CONDITIONING) = PROBABILITY\r\n@unknown TRANSITION-SET is destructively modified")
    public static final SubLObject transition_set_set_alt(SubLObject transition_set, SubLObject conditioned, SubLObject conditioning, SubLObject probability) {
        cpa_set(transition_set_known_probabilities(transition_set), conditioned, conditioning, probability);
        return transition_set;
    }

    /**
     *
     *
     * @param TRANSITION-SET
    transition-set
     * 		
     * @param CONDITIONED
     * 		object; an HMM state
     * @param CONDITIONING
     * 		object an HMM state
     * @param PROBABILITY
    floatp;
     * 		
     * @return transition-set; a version of TRANSITION-SET that hav been destructively updated
    with the fact  (pCONDITINED|CONDITIONING) = PROBABILITY
     * @unknown TRANSITION-SET is destructively modified
     */
    @LispMethod(comment = "@param TRANSITION-SET\ntransition-set\r\n\t\t\r\n@param CONDITIONED\r\n\t\tobject; an HMM state\r\n@param CONDITIONING\r\n\t\tobject an HMM state\r\n@param PROBABILITY\nfloatp;\r\n\t\t\r\n@return transition-set; a version of TRANSITION-SET that hav been destructively updated\r\nwith the fact  (pCONDITINED|CONDITIONING) = PROBABILITY\r\n@unknown TRANSITION-SET is destructively modified")
    public static SubLObject transition_set_set(final SubLObject transition_set, final SubLObject conditioned, final SubLObject conditioning, final SubLObject probability) {
        cpa_set(transition_set_known_probabilities(transition_set), conditioned, conditioning, probability);
        return transition_set;
    }

    public static final SubLObject emission_probability_estimator_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject emission_probability_estimator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject emission_probability_estimator_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject emission_probability_estimator_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native.class ? T : NIL;
    }

    public static final SubLObject epe_open_states_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.getField2();
    }

    public static SubLObject epe_open_states(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject epe_suffixes_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.getField3();
    }

    public static SubLObject epe_suffixes(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject epe_unknown_word_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.getField4();
    }

    public static SubLObject epe_unknown_word(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject epe_suffix_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.getField5();
    }

    public static SubLObject epe_suffix(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject epe_hyphen_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.getField6();
    }

    public static SubLObject epe_hyphen(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject epe_number_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.getField7();
    }

    public static SubLObject epe_number(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject epe_capitalization_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.getField8();
    }

    public static SubLObject epe_capitalization(final SubLObject v_object) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_epe_open_states_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_epe_open_states(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_epe_suffixes_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_epe_suffixes(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_epe_unknown_word_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_epe_unknown_word(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_epe_suffix_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_epe_suffix(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_epe_hyphen_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_epe_hyphen(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_epe_number_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_epe_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_epe_capitalization_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EMISSION_PROBABILITY_ESTIMATOR_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_epe_capitalization(final SubLObject v_object, final SubLObject value) {
        assert NIL != emission_probability_estimator_p(v_object) : "! pos_tagger.emission_probability_estimator_p(v_object) " + "pos_tagger.emission_probability_estimator_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_emission_probability_estimator_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($OPEN_STATES)) {
                        _csetf_epe_open_states(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SUFFIXES)) {
                            _csetf_epe_suffixes(v_new, current_value);
                        } else {
                            if (pcase_var.eql($UNKNOWN_WORD)) {
                                _csetf_epe_unknown_word(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SUFFIX)) {
                                    _csetf_epe_suffix(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($HYPHEN)) {
                                        _csetf_epe_hyphen(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($NUMBER)) {
                                            _csetf_epe_number(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($CAPITALIZATION)) {
                                                _csetf_epe_capitalization(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt60$Invalid_slot__S_for_construction_, current_arg);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_emission_probability_estimator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.pos_tagger.$emission_probability_estimator_native();
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

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this
     * 		emission-probability-estimator
     * @return emission-probability-estimator; a new emission-probability-estimator initialized
    with the data in SOURCE-PATH
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this\r\n\t\temission-probability-estimator\r\n@return emission-probability-estimator; a new emission-probability-estimator initialized\r\nwith the data in SOURCE-PATH")
    public static final SubLObject new_emission_probability_estimator_alt(SubLObject source_path) {
        {
            SubLObject open_states_path = cyc_home_filename(source_path, $open_states_resource$.getGlobalValue(), $$$txt);
            SubLObject suffixes_path = cyc_home_filename(source_path, $suffixes_resource$.getGlobalValue(), $$$txt);
            SubLObject unknown_word_path = cyc_home_filename(source_path, $unknown_word_resource$.getGlobalValue(), $$$txt);
            SubLObject suffix_path = cyc_home_filename(source_path, $suffix_resource$.getGlobalValue(), $$$txt);
            SubLObject hyphen_path = cyc_home_filename(source_path, $hyphen_resource$.getGlobalValue(), $$$txt);
            SubLObject number_path = cyc_home_filename(source_path, $number_resource$.getGlobalValue(), $$$txt);
            SubLObject capitalization_path = cyc_home_filename(source_path, $capitalization_resource$.getGlobalValue(), $$$txt);
            SubLObject estimator = make_emission_probability_estimator(UNPROVIDED);
            SubLObject suffix_trie = strie.new_strie(symbol_function(EQL));
            if (NIL != Filesys.probe_file(open_states_path)) {
                {
                    SubLObject cdolist_list_var = load_list(open_states_path);
                    SubLObject state = NIL;
                    for (state = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , state = cdolist_list_var.first()) {
                        _csetf_epe_open_states(estimator, cons(parse_integer(state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), epe_open_states(estimator)));
                    }
                }
            } else {
                Errors.error($str_alt150$Unable_to_initialize_pos_tagger_p, open_states_path);
            }
            if (NIL != Filesys.probe_file(suffixes_path)) {
                {
                    SubLObject cdolist_list_var = load_list(suffixes_path);
                    SubLObject suffix = NIL;
                    for (suffix = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suffix = cdolist_list_var.first()) {
                        strie.strie_insert(suffix_trie, reverse(suffix), suffix);
                    }
                }
            } else {
                Errors.error($str_alt150$Unable_to_initialize_pos_tagger_p, suffixes_path);
            }
            _csetf_epe_suffixes(estimator, suffix_trie);
            if (NIL != Filesys.probe_file(unknown_word_path)) {
                _csetf_epe_unknown_word(estimator, new_cpm(TWO_INTEGER, unknown_word_path, UNPROVIDED));
            } else {
                Errors.error($str_alt150$Unable_to_initialize_pos_tagger_p, unknown_word_path);
            }
            if (NIL != Filesys.probe_file(suffix_path)) {
                _csetf_epe_suffix(estimator, new_cpm(TWO_INTEGER, suffix_path, UNPROVIDED));
            } else {
                Errors.error($str_alt150$Unable_to_initialize_pos_tagger_p, suffix_path);
            }
            if (NIL != Filesys.probe_file(hyphen_path)) {
                _csetf_epe_hyphen(estimator, new_cpm(TWO_INTEGER, hyphen_path, UNPROVIDED));
            } else {
                Errors.error($str_alt150$Unable_to_initialize_pos_tagger_p, hyphen_path);
            }
            if (NIL != Filesys.probe_file(number_path)) {
                _csetf_epe_number(estimator, new_cpm(TWO_INTEGER, number_path, UNPROVIDED));
            } else {
                Errors.error($str_alt150$Unable_to_initialize_pos_tagger_p, number_path);
            }
            if (NIL != Filesys.probe_file(capitalization_path)) {
                _csetf_epe_capitalization(estimator, new_cpm(TWO_INTEGER, capitalization_path, UNPROVIDED));
            } else {
                Errors.error($str_alt150$Unable_to_initialize_pos_tagger_p, capitalization_path);
            }
            return estimator;
        }
    }

    /**
     *
     *
     * @param SOURCE-PATH
     * 		string; the location of the initialization data for this
     * 		emission-probability-estimator
     * @return emission-probability-estimator; a new emission-probability-estimator initialized
    with the data in SOURCE-PATH
     */
    @LispMethod(comment = "@param SOURCE-PATH\r\n\t\tstring; the location of the initialization data for this\r\n\t\temission-probability-estimator\r\n@return emission-probability-estimator; a new emission-probability-estimator initialized\r\nwith the data in SOURCE-PATH")
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

    /**
     *
     *
     * @param EPE
    emission-probability-estimator
     * 		
     * @param WORD
    string
     * 		
     * @return a-list; a list of state-probability pairs, where each pair expresses the
    fact that p(WORD|STATE) = PROBABILITY
     */
    @LispMethod(comment = "@param EPE\nemission-probability-estimator\r\n\t\t\r\n@param WORD\nstring\r\n\t\t\r\n@return a-list; a list of state-probability pairs, where each pair expresses the\r\nfact that p(WORD|STATE) = PROBABILITY")
    public static final SubLObject epe_get_distribution_alt(SubLObject epe, SubLObject word) {
        {
            SubLObject suffix = suffix(epe, word);
            SubLObject hyphen = hyphen(word);
            SubLObject number = number(word);
            SubLObject capitalization = capitalization(word);
            SubLObject distribution = NIL;
            SubLObject cdolist_list_var = epe_open_states(epe);
            SubLObject open_state = NIL;
            for (open_state = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , open_state = cdolist_list_var.first()) {
                distribution = cons(cons(open_state, add(new SubLObject[]{ cpm_get(epe_unknown_word(epe), $str_alt151$_UNKNOWN, open_state, symbol_function(EQL), UNPROVIDED), cpm_get(epe_suffix(epe), suffix, open_state, symbol_function(EQL), UNPROVIDED), cpm_get(epe_hyphen(epe), hyphen, open_state, symbol_function(EQL), UNPROVIDED), cpm_get(epe_capitalization(epe), capitalization, open_state, symbol_function(EQL), UNPROVIDED), cpm_get(epe_number(epe), number, open_state, symbol_function(EQL), UNPROVIDED) })), distribution);
            }
            return distribution;
        }
    }

    /**
     *
     *
     * @param EPE
    emission-probability-estimator
     * 		
     * @param WORD
    string
     * 		
     * @return a-list; a list of state-probability pairs, where each pair expresses the
    fact that p(WORD|STATE) = PROBABILITY
     */
    @LispMethod(comment = "@param EPE\nemission-probability-estimator\r\n\t\t\r\n@param WORD\nstring\r\n\t\t\r\n@return a-list; a list of state-probability pairs, where each pair expresses the\r\nfact that p(WORD|STATE) = PROBABILITY")
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

    /**
     *
     *
     * @param ESTIMATOR
    emission-probability-estimator
     * 		
     * @param WORD
    string
     * 		
     * @return the suffix of WORD from a list of predetermined suffixes, :NOSUFF if none can be found
     */
    @LispMethod(comment = "@param ESTIMATOR\nemission-probability-estimator\r\n\t\t\r\n@param WORD\nstring\r\n\t\t\r\n@return the suffix of WORD from a list of predetermined suffixes, :NOSUFF if none can be found")
    public static final SubLObject suffix_alt(SubLObject epe, SubLObject word) {
        if (NIL != string_utilities.char_position(strie.$strie_null_key$.getGlobalValue(), word, UNPROVIDED)) {
            return $str_alt152$_NOSUFF;
        }
        {
            SubLObject suffixes = strie.strie_prefixes(epe_suffixes(epe), reverse(word));
            return NIL != suffixes ? ((SubLObject) (suffixes.first().rest().first())) : $str_alt152$_NOSUFF;
        }
    }

    /**
     *
     *
     * @param ESTIMATOR
    emission-probability-estimator
     * 		
     * @param WORD
    string
     * 		
     * @return the suffix of WORD from a list of predetermined suffixes, :NOSUFF if none can be found
     */
    @LispMethod(comment = "@param ESTIMATOR\nemission-probability-estimator\r\n\t\t\r\n@param WORD\nstring\r\n\t\t\r\n@return the suffix of WORD from a list of predetermined suffixes, :NOSUFF if none can be found")
    public static SubLObject suffix(final SubLObject epe, final SubLObject word) {
        if (NIL != string_utilities.char_position(strie.$strie_null_key$.getGlobalValue(), word, UNPROVIDED)) {
            return $str170$_NOSUFF;
        }
        final SubLObject suffixes = strie.strie_prefixes(epe_suffixes(epe), reverse(word));
        return NIL != suffixes ? suffixes.first().rest().first() : $str170$_NOSUFF;
    }

    /**
     *
     *
     * @param WORD
    string
     * 		
     * @return string; :CAP if WORD is capitalized, :NOCAP otherwise
     */
    @LispMethod(comment = "@param WORD\nstring\r\n\t\t\r\n@return string; :CAP if WORD is capitalized, :NOCAP otherwise")
    public static final SubLObject capitalization_alt(SubLObject word) {
        return NIL != upper_case_p(Strings.sublisp_char(word, ZERO_INTEGER)) ? ((SubLObject) ($str_alt153$_CAP)) : $str_alt154$_NOCAP;
    }

    /**
     *
     *
     * @param WORD
    string
     * 		
     * @return string; :CAP if WORD is capitalized, :NOCAP otherwise
     */
    @LispMethod(comment = "@param WORD\nstring\r\n\t\t\r\n@return string; :CAP if WORD is capitalized, :NOCAP otherwise")
    public static SubLObject capitalization(final SubLObject word) {
        return NIL != upper_case_p(Strings.sublisp_char(word, ZERO_INTEGER)) ? $str171$_CAP : $str172$_NOCAP;
    }

    /**
     *
     *
     * @param WORD
    string
     * 		
     * @return string; :HYPif WORD is hyphenated, :NOHYP otherwise
     */
    @LispMethod(comment = "@param WORD\nstring\r\n\t\t\r\n@return string; :HYPif WORD is hyphenated, :NOHYP otherwise")
    public static final SubLObject hyphen_alt(SubLObject word) {
        return NIL != string_utilities.contains_charP(word, CHAR_hyphen) ? ((SubLObject) ($str_alt155$_HYP)) : $str_alt156$_NOHYP;
    }

    /**
     *
     *
     * @param WORD
    string
     * 		
     * @return string; :HYPif WORD is hyphenated, :NOHYP otherwise
     */
    @LispMethod(comment = "@param WORD\nstring\r\n\t\t\r\n@return string; :HYPif WORD is hyphenated, :NOHYP otherwise")
    public static SubLObject hyphen(final SubLObject word) {
        return NIL != string_utilities.contains_charP(word, CHAR_hyphen) ? $str173$_HYP : $str174$_NOHYP;
    }

    /**
     *
     *
     * @param WORD
    string
     * 		
     * @return string; :NUMBER if WORD is a number, :NONUM otherwise
     */
    @LispMethod(comment = "@param WORD\nstring\r\n\t\t\r\n@return string; :NUMBER if WORD is a number, :NONUM otherwise")
    public static final SubLObject number_alt(SubLObject word) {
        return NIL != digit_char_p(Strings.sublisp_char(word, ZERO_INTEGER), UNPROVIDED) ? ((SubLObject) ($str_alt157$_DIGIT)) : $str_alt158$_NODIGIT;
    }

    /**
     *
     *
     * @param WORD
    string
     * 		
     * @return string; :NUMBER if WORD is a number, :NONUM otherwise
     */
    @LispMethod(comment = "@param WORD\nstring\r\n\t\t\r\n@return string; :NUMBER if WORD is a number, :NONUM otherwise")
    public static SubLObject number(final SubLObject word) {
        return NIL != digit_char_p(Strings.sublisp_char(word, ZERO_INTEGER), UNPROVIDED) ? $str175$_DIGIT : $str176$_NODIGIT;
    }

    /**
     *
     *
     * @param SOURCE-PATH
    string
     * 		
     * @return list; a list of all items in the file SOURCE-PATH, with the assumption that
    each list element is on a separate line
     */
    @LispMethod(comment = "@param SOURCE-PATH\nstring\r\n\t\t\r\n@return list; a list of all items in the file SOURCE-PATH, with the assumption that\r\neach list element is on a separate line")
    public static final SubLObject load_list_alt(SubLObject source_path) {
        SubLTrampolineFile.checkType(source_path, STRINGP);
        if (NIL == Filesys.probe_file(source_path)) {
            Errors.error(cconcatenate($str_alt160$Unable_to_load_file__, why_not_probe_fileP(source_path)));
        }
        {
            SubLObject strings = NIL;
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(source_path, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt20$Unable_to_open__S, source_path);
                }
                {
                    SubLObject infile = stream;
                    if (infile.isStream()) {
                        {
                            SubLObject line = NIL;
                            for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                strings = cons(line, strings);
                            }
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return strings;
        }
    }

    /**
     *
     *
     * @param SOURCE-PATH
    string
     * 		
     * @return list; a list of all items in the file SOURCE-PATH, with the assumption that
    each list element is on a separate line
     */
    @LispMethod(comment = "@param SOURCE-PATH\nstring\r\n\t\t\r\n@return list; a list of all items in the file SOURCE-PATH, with the assumption that\r\neach list element is on a separate line")
    public static SubLObject load_list(final SubLObject source_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(source_path) : "! stringp(source_path) " + ("Types.stringp(source_path) " + "CommonSymbols.NIL != Types.stringp(source_path) ") + source_path;
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

    /**
     *
     *
     * @return pos-tagger-p; the standard part-of-speech tagger
     */
    @LispMethod(comment = "@return pos-tagger-p; the standard part-of-speech tagger")
    public static final SubLObject get_tagger_alt() {
        if (NIL == $pos_tagger$.getGlobalValue()) {
            $pos_tagger$.setGlobalValue(new_tagger(UNPROVIDED));
        }
        return $pos_tagger$.getGlobalValue();
    }

    /**
     *
     *
     * @return pos-tagger-p; the standard part-of-speech tagger
     */
    @LispMethod(comment = "@return pos-tagger-p; the standard part-of-speech tagger")
    public static SubLObject get_tagger() {
        if (NIL == $pos_tagger$.getGlobalValue()) {
            $pos_tagger$.setGlobalValue(new_tagger(UNPROVIDED));
        }
        return $pos_tagger$.getGlobalValue();
    }

    public static SubLObject declare_pos_tagger_file() {
        declareFunction("new_cpm", "NEW-CPM", 1, 2, false);
        declareFunction("cpm_get_distribution", "CPM-GET-DISTRIBUTION", 2, 0, false);
        declareFunction("cpm_get", "CPM-GET", 3, 2, false);
        declareFunction("cpm_set", "CPM-SET", 4, 0, false);
        declareFunction("new_cpa", "NEW-CPA", 2, 2, false);
        declareMacro("cpa_get", "CPA-GET");
        declareFunction("cpa_set", "CPA-SET", 4, 0, false);
        declareFunction("create_cpf", "CREATE-CPF", 2, 2, false);
        declareFunction("new_cpf", "NEW-CPF", 1, 1, false);
        declareFunction("finalize_cpf", "FINALIZE-CPF", 1, 0, false);
        declareFunction("cpf_get_distribution", "CPF-GET-DISTRIBUTION", 2, 0, false);
        declareFunction("cpf_get", "CPF-GET", 3, 2, false);
        declareFunction("cpf_set", "CPF-SET", 4, 0, false);
        declareFunction("cpf_finalize", "CPF-FINALIZE", 1, 0, false);
        declareFunction("cpf_create_backing_store", "CPF-CREATE-BACKING-STORE", 3, 1, false);
        declareMacro("new_trellis_entry", "NEW-TRELLIS-ENTRY");
        declareMacro("trellis_entry_probability", "TRELLIS-ENTRY-PROBABILITY");
        declareMacro("trellis_entry_source", "TRELLIS-ENTRY-SOURCE");
        declareMacro("trellis_entry_update", "TRELLIS-ENTRY-UPDATE");
        declareFunction("new_trellis", "NEW-TRELLIS", 0, 0, false);
        declareMacro("trellis_new_column", "TRELLIS-NEW-COLUMN");
        declareMacro("trellis_current_column", "TRELLIS-CURRENT-COLUMN");
        declareMacro("trellis_get", "TRELLIS-GET");
        declareMacro("trellis_set", "TRELLIS-SET");
        declareMacro("trellis_finalize_column", "TRELLIS-FINALIZE-COLUMN");
        declareFunction("trellis_get_max_entry", "TRELLIS-GET-MAX-ENTRY", 1, 0, false);
        declareFunction("tagger_print_function_trampoline", "TAGGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("tagger_p", "TAGGER-P", 1, 0, false);
        new pos_tagger.$tagger_p$UnaryFunction();
        declareFunction("tagger_hmm", "TAGGER-HMM", 1, 0, false);
        declareFunction("tagger_state_interpretation", "TAGGER-STATE-INTERPRETATION", 1, 0, false);
        declareFunction("_csetf_tagger_hmm", "_CSETF-TAGGER-HMM", 2, 0, false);
        declareFunction("_csetf_tagger_state_interpretation", "_CSETF-TAGGER-STATE-INTERPRETATION", 2, 0, false);
        declareFunction("make_tagger", "MAKE-TAGGER", 0, 1, false);
        declareFunction("visit_defstruct_tagger", "VISIT-DEFSTRUCT-TAGGER", 2, 0, false);
        declareFunction("visit_defstruct_object_tagger_method", "VISIT-DEFSTRUCT-OBJECT-TAGGER-METHOD", 2, 0, false);
        declareFunction("new_tagger", "NEW-TAGGER", 0, 1, false);
        declareFunction("finalize_tagger", "FINALIZE-TAGGER", 1, 0, false);
        declareFunction("tagger_tag_document", "TAGGER-TAG-DOCUMENT", 2, 0, false);
        declareFunction("tagger_tag_sentence", "TAGGER-TAG-SENTENCE", 2, 0, false);
        declareFunction("patch_word_tag", "PATCH-WORD-TAG", 1, 0, false);
        declareFunction("tagger_normalize_initial_capitalization", "TAGGER-NORMALIZE-INITIAL-CAPITALIZATION", 2, 0, false);
        declareFunction("exclude_from_normalizationP", "EXCLUDE-FROM-NORMALIZATION?", 1, 0, false);
        declareFunction("new_state_interpretation", "NEW-STATE-INTERPRETATION", 2, 0, false);
        declareFunction("state_interpretation_get", "STATE-INTERPRETATION-GET", 2, 0, false);
        declareFunction("hmm_print_function_trampoline", "HMM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("hmm_p", "HMM-P", 1, 0, false);
        new pos_tagger.$hmm_p$UnaryFunction();
        declareFunction("hmm_initial_state", "HMM-INITIAL-STATE", 1, 0, false);
        declareFunction("hmm_states", "HMM-STATES", 1, 0, false);
        declareFunction("hmm_transitions", "HMM-TRANSITIONS", 1, 0, false);
        declareFunction("_csetf_hmm_initial_state", "_CSETF-HMM-INITIAL-STATE", 2, 0, false);
        declareFunction("_csetf_hmm_states", "_CSETF-HMM-STATES", 2, 0, false);
        declareFunction("_csetf_hmm_transitions", "_CSETF-HMM-TRANSITIONS", 2, 0, false);
        declareFunction("make_hmm", "MAKE-HMM", 0, 1, false);
        declareFunction("visit_defstruct_hmm", "VISIT-DEFSTRUCT-HMM", 2, 0, false);
        declareFunction("visit_defstruct_object_hmm_method", "VISIT-DEFSTRUCT-OBJECT-HMM-METHOD", 2, 0, false);
        declareFunction("new_hmm", "NEW-HMM", 1, 0, false);
        declareFunction("finalize_hmm", "FINALIZE-HMM", 1, 0, false);
        declareFunction("hmm_most_likely_path_probability", "HMM-MOST-LIKELY-PATH-PROBABILITY", 2, 0, false);
        declareFunction("state_set_print_function_trampoline", "STATE-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("state_set_p", "STATE-SET-P", 1, 0, false);
        new pos_tagger.$state_set_p$UnaryFunction();
        declareFunction("state_set_store", "STATE-SET-STORE", 1, 0, false);
        declareFunction("state_set_estimator", "STATE-SET-ESTIMATOR", 1, 0, false);
        declareFunction("state_set_cache", "STATE-SET-CACHE", 1, 0, false);
        declareFunction("_csetf_state_set_store", "_CSETF-STATE-SET-STORE", 2, 0, false);
        declareFunction("_csetf_state_set_estimator", "_CSETF-STATE-SET-ESTIMATOR", 2, 0, false);
        declareFunction("_csetf_state_set_cache", "_CSETF-STATE-SET-CACHE", 2, 0, false);
        declareFunction("make_state_set", "MAKE-STATE-SET", 0, 1, false);
        declareFunction("visit_defstruct_state_set", "VISIT-DEFSTRUCT-STATE-SET", 2, 0, false);
        declareFunction("visit_defstruct_object_state_set_method", "VISIT-DEFSTRUCT-OBJECT-STATE-SET-METHOD", 2, 0, false);
        declareFunction("new_state_set", "NEW-STATE-SET", 1, 1, false);
        declareFunction("finalize_state_set", "FINALIZE-STATE-SET", 1, 0, false);
        declareFunction("state_set_get_distribution", "STATE-SET-GET-DISTRIBUTION", 2, 0, false);
        declareFunction("state_set_known_word", "STATE-SET-KNOWN-WORD", 2, 0, false);
        declareFunction("transition_set_print_function_trampoline", "TRANSITION-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("transition_set_p", "TRANSITION-SET-P", 1, 0, false);
        new pos_tagger.$transition_set_p$UnaryFunction();
        declareFunction("transition_set_known_probabilities", "TRANSITION-SET-KNOWN-PROBABILITIES", 1, 0, false);
        declareFunction("transition_set_estimated_probabilities", "TRANSITION-SET-ESTIMATED-PROBABILITIES", 1, 0, false);
        declareFunction("_csetf_transition_set_known_probabilities", "_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES", 2, 0, false);
        declareFunction("_csetf_transition_set_estimated_probabilities", "_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES", 2, 0, false);
        declareFunction("make_transition_set", "MAKE-TRANSITION-SET", 0, 1, false);
        declareFunction("visit_defstruct_transition_set", "VISIT-DEFSTRUCT-TRANSITION-SET", 2, 0, false);
        declareFunction("visit_defstruct_object_transition_set_method", "VISIT-DEFSTRUCT-OBJECT-TRANSITION-SET-METHOD", 2, 0, false);
        declareFunction("new_transition_set", "NEW-TRANSITION-SET", 1, 0, false);
        declareFunction("transition_set_get", "TRANSITION-SET-GET", 3, 0, false);
        declareFunction("transition_set_get_distribution", "TRANSITION-SET-GET-DISTRIBUTION", 2, 0, false);
        declareFunction("transition_set_set", "TRANSITION-SET-SET", 4, 0, false);
        declareFunction("emission_probability_estimator_print_function_trampoline", "EMISSION-PROBABILITY-ESTIMATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("emission_probability_estimator_p", "EMISSION-PROBABILITY-ESTIMATOR-P", 1, 0, false);
        new pos_tagger.$emission_probability_estimator_p$UnaryFunction();
        declareFunction("epe_open_states", "EPE-OPEN-STATES", 1, 0, false);
        declareFunction("epe_suffixes", "EPE-SUFFIXES", 1, 0, false);
        declareFunction("epe_unknown_word", "EPE-UNKNOWN-WORD", 1, 0, false);
        declareFunction("epe_suffix", "EPE-SUFFIX", 1, 0, false);
        declareFunction("epe_hyphen", "EPE-HYPHEN", 1, 0, false);
        declareFunction("epe_number", "EPE-NUMBER", 1, 0, false);
        declareFunction("epe_capitalization", "EPE-CAPITALIZATION", 1, 0, false);
        declareFunction("_csetf_epe_open_states", "_CSETF-EPE-OPEN-STATES", 2, 0, false);
        declareFunction("_csetf_epe_suffixes", "_CSETF-EPE-SUFFIXES", 2, 0, false);
        declareFunction("_csetf_epe_unknown_word", "_CSETF-EPE-UNKNOWN-WORD", 2, 0, false);
        declareFunction("_csetf_epe_suffix", "_CSETF-EPE-SUFFIX", 2, 0, false);
        declareFunction("_csetf_epe_hyphen", "_CSETF-EPE-HYPHEN", 2, 0, false);
        declareFunction("_csetf_epe_number", "_CSETF-EPE-NUMBER", 2, 0, false);
        declareFunction("_csetf_epe_capitalization", "_CSETF-EPE-CAPITALIZATION", 2, 0, false);
        declareFunction("make_emission_probability_estimator", "MAKE-EMISSION-PROBABILITY-ESTIMATOR", 0, 1, false);
        declareFunction("visit_defstruct_emission_probability_estimator", "VISIT-DEFSTRUCT-EMISSION-PROBABILITY-ESTIMATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_emission_probability_estimator_method", "VISIT-DEFSTRUCT-OBJECT-EMISSION-PROBABILITY-ESTIMATOR-METHOD", 2, 0, false);
        declareFunction("new_emission_probability_estimator", "NEW-EMISSION-PROBABILITY-ESTIMATOR", 1, 0, false);
        declareFunction("epe_get_distribution", "EPE-GET-DISTRIBUTION", 2, 0, false);
        declareFunction("suffix", "SUFFIX", 2, 0, false);
        declareFunction("capitalization", "CAPITALIZATION", 1, 0, false);
        declareFunction("hyphen", "HYPHEN", 1, 0, false);
        declareFunction("number", "NUMBER", 1, 0, false);
        declareFunction("load_list", "LOAD-LIST", 1, 0, false);
        declareFunction("get_tagger", "GET-TAGGER", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_pos_tagger_file_alt() {
        defparameter("*TAGGER-DATA-PATH*", list($$$data, $str_alt1$pos_tagging));
        defparameter("*EXCLUDE-FROM-NORMALIZATION*", $list_alt2);
        defconstant("*INITIAL-STATE-RESOURCE*", $str_alt3$initial_state);
        defconstant("*STATE-RESOURCE*", $$$states);
        defconstant("*TRANSITION-RESOURCE*", $$$transitions);
        defconstant("*OPEN-STATES-RESOURCE*", $str_alt6$open_states);
        defconstant("*SUFFIXES-RESOURCE*", $$$suffixes);
        defconstant("*UNKNOWN-WORD-RESOURCE*", $$$unknown);
        defconstant("*SUFFIX-RESOURCE*", $$$suffix);
        defconstant("*HYPHEN-RESOURCE*", $$$hyphen);
        defconstant("*NUMBER-RESOURCE*", $$$number);
        defconstant("*CAPITALIZATION-RESOURCE*", $$$capitalization);
        defconstant("*STATE-INTERPRETATION-RESOURCE*", $str_alt13$index_to_state);
        defconstant("*TOKEN-DELIMITERS*", $list_alt14);
        deflexical("*IMPOSSIBILITY*", $float$_3_4028232e_38);
        deflexical("*CERTAINTY*", $float$0_0);
        deflexical("*LOW-PROBABILITY*", $int$_20);
        defparameter("*STATE-SET-CACHE-CAPACITY*", $int$2000);
        deflexical("*POS-TAGGER*", NIL);
        defconstant("*DTP-TAGGER*", TAGGER);
        defparameter("*WORD-TAG-PATCHES*", $list_alt67);
        defconstant("*DTP-HMM*", HMM);
        defconstant("*DTP-STATE-SET*", STATE_SET);
        defconstant("*DTP-TRANSITION-SET*", TRANSITION_SET);
        defconstant("*DTP-EMISSION-PROBABILITY-ESTIMATOR*", EMISSION_PROBABILITY_ESTIMATOR);
        return NIL;
    }

    public static SubLObject init_pos_tagger_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            deflexical("*IMPOSSIBILITY*", $float$_3_4028232e_38);
            defparameter("*WORD-TAG-PATCHES*", $list_alt67);
        }
        return NIL;
    }

    public static SubLObject init_pos_tagger_file_Previous() {
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

    public static final class $tagger_p$UnaryFunction extends UnaryFunction {
        public $tagger_p$UnaryFunction() {
            super(extractFunctionNamed("TAGGER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return tagger_p(arg1);
        }
    }

    static private final SubLString $str_alt1$pos_tagging = makeString("pos-tagging");

    static private final SubLList $list_alt2 = list(makeString("WWII"));

    static private final SubLString $str_alt3$initial_state = makeString("initial-state");

    static private final SubLString $str_alt6$open_states = makeString("open-states");

    static private final SubLString $str_alt13$index_to_state = makeString("index-to-state");

    static private final SubLList $list_alt14 = list(CHAR_caret);

    public static final class $hmm_p$UnaryFunction extends UnaryFunction {
        public $hmm_p$UnaryFunction() {
            super(extractFunctionNamed("HMM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hmm_p(arg1);
        }
    }

    public static final SubLFloat $float$_3_4028232e_38 = makeDouble(-3.4028232E38);

    static private final SubLString $str_alt20$Unable_to_open__S = makeString("Unable to open ~S");

    public static final class $state_set_native extends SubLStructNative {
        public SubLObject $store;

        public SubLObject $estimator;

        public SubLObject $cache;

        private static final SubLStructDeclNative structDecl;

        public $state_set_native() {
            pos_tagger.$state_set_native.this.$store = Lisp.NIL;
            pos_tagger.$state_set_native.this.$estimator = Lisp.NIL;
            pos_tagger.$state_set_native.this.$cache = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return pos_tagger.$state_set_native.this.$store;
        }

        @Override
        public SubLObject getField3() {
            return pos_tagger.$state_set_native.this.$estimator;
        }

        @Override
        public SubLObject getField4() {
            return pos_tagger.$state_set_native.this.$cache;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return pos_tagger.$state_set_native.this.$store = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return pos_tagger.$state_set_native.this.$estimator = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return pos_tagger.$state_set_native.this.$cache = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.pos_tagger.$state_set_native.class, STATE_SET, STATE_SET_P, $list100, $list101, new String[]{ "$store", "$estimator", "$cache" }, $list102, $list103, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLList $list_alt21 = list(makeSymbol("CONDITIONED"), makeSymbol("CONDITIONING"), makeSymbol("PROBABILITY"));

    static private final SubLList $list_alt22 = list(makeSymbol("CPA"), makeSymbol("CONDITIONED"), makeSymbol("CONDITIONING"));

    static private final SubLString $str_alt26$Unable_to_initialize_file_hashtab = makeString("Unable to initialize file hashtable. ");

    static private final SubLString $str_alt27$Building_conditional_probability_ = makeString("Building conditional probability file...");

    static private final SubLList $list_alt28 = list(makeSymbol("PROBABILITY"), makeSymbol("SOURCE"));

    static private final SubLList $list_alt30 = list(makeSymbol("ENTRY"));

    static private final SubLList $list_alt33 = list(makeSymbol("ENTRY"), makeSymbol("PROBABILITY"), makeSymbol("SOURCE"));

    static private final SubLList $list_alt36 = list(makeSymbol("TRELLIS"));

    static private final SubLList $list_alt38 = list(makeSymbol("TRELLIS"), makeSymbol("KEY"));

    static private final SubLList $list_alt41 = list(list(makeSymbol("FUNCTION"), EQL));

    static private final SubLList $list_alt42 = list(makeSymbol("TRELLIS"), makeSymbol("KEY"), makeSymbol("VALUE"));

    public static final class $state_set_p$UnaryFunction extends UnaryFunction {
        public $state_set_p$UnaryFunction() {
            super(extractFunctionNamed("STATE-SET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return state_set_p(arg1);
        }
    }

    static private final SubLList $list_alt48 = list(makeSymbol("HMM"), makeSymbol("STATE-INTERPRETATION"));

    static private final SubLList $list_alt49 = list(makeKeyword("HMM"), makeKeyword("STATE-INTERPRETATION"));

    public static final class $transition_set_native extends SubLStructNative {
        public SubLObject $known_probabilities;

        public SubLObject $estimated_probabilities;

        private static final SubLStructDeclNative structDecl;

        public $transition_set_native() {
            pos_tagger.$transition_set_native.this.$known_probabilities = Lisp.NIL;
            pos_tagger.$transition_set_native.this.$estimated_probabilities = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return pos_tagger.$transition_set_native.this.$known_probabilities;
        }

        @Override
        public SubLObject getField3() {
            return pos_tagger.$transition_set_native.this.$estimated_probabilities;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return pos_tagger.$transition_set_native.this.$known_probabilities = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return pos_tagger.$transition_set_native.this.$estimated_probabilities = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.pos_tagger.$transition_set_native.class, TRANSITION_SET, TRANSITION_SET_P, $list121, $list122, new String[]{ "$known_probabilities", "$estimated_probabilities" }, $list123, $list124, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLList $list_alt50 = list(makeSymbol("TAGGER-HMM"), makeSymbol("TAGGER-STATE-INTERPRETATION"));

    static private final SubLList $list_alt51 = list(makeSymbol("_CSETF-TAGGER-HMM"), makeSymbol("_CSETF-TAGGER-STATE-INTERPRETATION"));

    static private final SubLString $str_alt60$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt67 = list(cons(cons(makeString("German"), EIGHTEEN_INTEGER), FIVE_INTEGER), cons(cons(makeString("Germans"), makeInteger(38)), makeInteger(25)), cons(cons(makeString("French"), EIGHTEEN_INTEGER), FIVE_INTEGER), cons(cons(makeString("French"), makeInteger(38)), makeInteger(25)));

    public static final class $transition_set_p$UnaryFunction extends UnaryFunction {
        public $transition_set_p$UnaryFunction() {
            super(extractFunctionNamed("TRANSITION-SET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return transition_set_p(arg1);
        }
    }

    static private final SubLList $list_alt69 = list(makeKeyword("STRING"), makeString("."));

    static private final SubLString $str_alt71$Unable_to_initialize_pos_tagger_s = makeString("Unable to initialize pos tagger state interpretation from ~a");

    static private final SubLList $list_alt74 = list(makeSymbol("INITIAL-STATE"), makeSymbol("STATES"), makeSymbol("TRANSITIONS"));

    static private final SubLList $list_alt75 = list(makeKeyword("INITIAL-STATE"), makeKeyword("STATES"), makeKeyword("TRANSITIONS"));

    static private final SubLList $list_alt76 = list(makeSymbol("HMM-INITIAL-STATE"), makeSymbol("HMM-STATES"), makeSymbol("HMM-TRANSITIONS"));

    static private final SubLList $list_alt77 = list(makeSymbol("_CSETF-HMM-INITIAL-STATE"), makeSymbol("_CSETF-HMM-STATES"), makeSymbol("_CSETF-HMM-TRANSITIONS"));

    static private final SubLString $str_alt88$Unable_to_initialize_pos_tagger_H = makeString("Unable to initialize pos tagger HMM initial state from ~a");

    static private final SubLList $list_alt91 = list(makeSymbol("STORE"), makeSymbol("ESTIMATOR"), makeSymbol("CACHE"));

    static private final SubLList $list_alt92 = list(makeKeyword("STORE"), makeKeyword("ESTIMATOR"), makeKeyword("CACHE"));

    static private final SubLList $list_alt93 = list(makeSymbol("STATE-SET-STORE"), makeSymbol("STATE-SET-ESTIMATOR"), makeSymbol("STATE-SET-CACHE"));

    static private final SubLList $list_alt94 = list(makeSymbol("_CSETF-STATE-SET-STORE"), makeSymbol("_CSETF-STATE-SET-ESTIMATOR"), makeSymbol("_CSETF-STATE-SET-CACHE"));

    public static final class $emission_probability_estimator_p$UnaryFunction extends UnaryFunction {
        public $emission_probability_estimator_p$UnaryFunction() {
            super(extractFunctionNamed("EMISSION-PROBABILITY-ESTIMATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return emission_probability_estimator_p(arg1);
        }
    }

    static private final SubLString $str_alt106$Unable_to_initialize_pos_tagger_s = makeString("Unable to initialize pos tagger state set from ~a");

    static private final SubLList $list_alt109 = list(makeSymbol("KNOWN-PROBABILITIES"), makeSymbol("ESTIMATED-PROBABILITIES"));

    static private final SubLList $list_alt110 = list(makeKeyword("KNOWN-PROBABILITIES"), makeKeyword("ESTIMATED-PROBABILITIES"));

    static private final SubLList $list_alt111 = list(makeSymbol("TRANSITION-SET-KNOWN-PROBABILITIES"), makeSymbol("TRANSITION-SET-ESTIMATED-PROBABILITIES"));

    static private final SubLList $list_alt112 = list(makeSymbol("_CSETF-TRANSITION-SET-KNOWN-PROBABILITIES"), makeSymbol("_CSETF-TRANSITION-SET-ESTIMATED-PROBABILITIES"));

    static private final SubLString $str_alt121$Unable_to_initialize_pos_tagger_H = makeString("Unable to initialize pos tagger HMM transition set from ~a");

    static private final SubLList $list_alt124 = list(makeSymbol("OPEN-STATES"), makeSymbol("SUFFIXES"), makeSymbol("UNKNOWN-WORD"), makeSymbol("SUFFIX"), makeSymbol("HYPHEN"), makeSymbol("NUMBER"), makeSymbol("CAPITALIZATION"));

    static private final SubLList $list_alt125 = list(makeKeyword("OPEN-STATES"), makeKeyword("SUFFIXES"), makeKeyword("UNKNOWN-WORD"), makeKeyword("SUFFIX"), makeKeyword("HYPHEN"), makeKeyword("NUMBER"), makeKeyword("CAPITALIZATION"));

    static private final SubLList $list_alt126 = list(makeSymbol("EPE-OPEN-STATES"), makeSymbol("EPE-SUFFIXES"), makeSymbol("EPE-UNKNOWN-WORD"), makeSymbol("EPE-SUFFIX"), makeSymbol("EPE-HYPHEN"), makeSymbol("EPE-NUMBER"), makeSymbol("EPE-CAPITALIZATION"));

    static private final SubLList $list_alt127 = list(makeSymbol("_CSETF-EPE-OPEN-STATES"), makeSymbol("_CSETF-EPE-SUFFIXES"), makeSymbol("_CSETF-EPE-UNKNOWN-WORD"), makeSymbol("_CSETF-EPE-SUFFIX"), makeSymbol("_CSETF-EPE-HYPHEN"), makeSymbol("_CSETF-EPE-NUMBER"), makeSymbol("_CSETF-EPE-CAPITALIZATION"));

    static private final SubLString $str_alt150$Unable_to_initialize_pos_tagger_p = makeString("Unable to initialize pos tagger pos estimator from ~a");

    static private final SubLString $str_alt151$_UNKNOWN = makeString(":UNKNOWN");

    static private final SubLString $str_alt152$_NOSUFF = makeString(":NOSUFF");

    static private final SubLString $str_alt153$_CAP = makeString(":CAP");

    static private final SubLString $str_alt154$_NOCAP = makeString(":NOCAP");

    static private final SubLString $str_alt155$_HYP = makeString(":HYP");

    static private final SubLString $str_alt156$_NOHYP = makeString(":NOHYP");

    static private final SubLString $str_alt157$_DIGIT = makeString(":DIGIT");

    static private final SubLString $str_alt158$_NODIGIT = makeString(":NODIGIT");

    static private final SubLString $str_alt160$Unable_to_load_file__ = makeString("Unable to load file. ");
}

/**
 * Total time: 636 ms
 */
