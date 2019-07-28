package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.learning_reader;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.learning_reader.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_escape;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
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


public final class learning_reader extends SubLTranslatedFile {
    public static final SubLFile me = new learning_reader();

    public static final String myName = "com.cyc.cycjava.cycl.learning_reader";

    public static final String myFingerPrint = "cedad97f620ab6b5720daa6c61c4f948727c0e48706ed88bc6b7cc7d5edeb05b";

    // deflexical
    private static final SubLSymbol $learning_reader_timestamp$ = makeSymbol("*LEARNING-READER-TIMESTAMP*");

    // deflexical
    public static final SubLSymbol $l2r_ebmt_index_host$ = makeSymbol("*L2R-EBMT-INDEX-HOST*");

    // deflexical
    public static final SubLSymbol $l2r_ebmt_index_port$ = makeSymbol("*L2R-EBMT-INDEX-PORT*");

    // deflexical
    public static final SubLSymbol $l2r_ebmt_index_content$ = makeSymbol("*L2R-EBMT-INDEX-CONTENT*");

    // deflexical
    public static final SubLSymbol $l2r_ebmt_index_log$ = makeSymbol("*L2R-EBMT-INDEX-LOG*");

    // defparameter
    public static final SubLSymbol $l2r_transmit_operationsP$ = makeSymbol("*L2R-TRANSMIT-OPERATIONS?*");

    // defparameter
    public static final SubLSymbol $l2r_reader_unstable_inside_stepsP$ = makeSymbol("*L2R-READER-UNSTABLE-INSIDE-STEPS?*");

    // defconstant
    public static final SubLSymbol $dtp_l2r_paragraph_reader$ = makeSymbol("*DTP-L2R-PARAGRAPH-READER*");

    // defparameter
    private static final SubLSymbol $l2r_finalization_problem_store$ = makeSymbol("*L2R-FINALIZATION-PROBLEM-STORE*");

    // deflexical
    private static final SubLSymbol $long_inference_cutoff$ = makeSymbol("*LONG-INFERENCE-CUTOFF*");

    // defparameter
    private static final SubLSymbol $current_long_inference_info$ = makeSymbol("*CURRENT-LONG-INFERENCE-INFO*");

    // defconstant
    public static final SubLSymbol $dtp_l2r_document_reader$ = makeSymbol("*DTP-L2R-DOCUMENT-READER*");

    // deflexical
    private static final SubLSymbol $l2r_reader_image_document_reader$ = makeSymbol("*L2R-READER-IMAGE-DOCUMENT-READER*");

    // deflexical
    private static final SubLSymbol $l2r_sentence_level_peg_creation_template_caching_state$ = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $l2r_sentence_level_peg_exemplar_caching_state$ = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-EXEMPLAR-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $l2r_sentence_level_peg_creation_template_sentences_caching_state$ = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $l2r_document_indexical_caching_state$ = makeSymbol("*L2R-DOCUMENT-INDEXICAL-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $l2r_sentence_indexical_caching_state$ = makeSymbol("*L2R-SENTENCE-INDEXICAL-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $l2r_supertext_indexical_caching_state$ = makeSymbol("*L2R-SUPERTEXT-INDEXICAL-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $l2r_sentence_string_indexical_caching_state$ = makeSymbol("*L2R-SENTENCE-STRING-INDEXICAL-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $l2r_sentence_number_indexical_caching_state$ = makeSymbol("*L2R-SENTENCE-NUMBER-INDEXICAL-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $l2r_sentence_string_number_indexical_caching_state$ = makeSymbol("*L2R-SENTENCE-STRING-NUMBER-INDEXICAL-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $l2r_document_sentence_finder_kbq_caching_state$ = makeSymbol("*L2R-DOCUMENT-SENTENCE-FINDER-KBQ-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $html_implicit_eos_tags$ = makeSymbol("*HTML-IMPLICIT-EOS-TAGS*");

    // deflexical
    private static final SubLSymbol $html_eos_open_tags$ = makeSymbol("*HTML-EOS-OPEN-TAGS*");

    // deflexical
    private static final SubLSymbol $html_eos_close_tags$ = makeSymbol("*HTML-EOS-CLOSE-TAGS*");

    // deflexical
    private static final SubLSymbol $wikipedia_meta_strings$ = makeSymbol("*WIKIPEDIA-META-STRINGS*");

    // deflexical
    /**
     * LISTP of WORD-P vectors, whose categories define candidate noun compound
     * patterns.
     */
    private static final SubLSymbol $l2r_noun_compound_patterns$ = makeSymbol("*L2R-NOUN-COMPOUND-PATTERNS*");

    // deflexical
    private static final SubLSymbol $l2r_noun_compound_category_pairs$ = makeSymbol("*L2R-NOUN-COMPOUND-CATEGORY-PAIRS");

    // deflexical
    private static final SubLSymbol $l2r_noun_compound_tagger$ = makeSymbol("*L2R-NOUN-COMPOUND-TAGGER*");

    private static final SubLObject $$Cyc = reader_make_constant_shell(makeString("Cyc"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    public static final SubLString $str2$L2R__Failed_asserting____S___in__ = makeString("L2R: Failed asserting~% ~S~% in ~S:~% ~S");

    public static final SubLString $str3$L2R_ = makeString("L2R-");

    public static final SubLString $str4$cyc8_cyc_com = makeString("cyc8.cyc.com");

    private static final SubLInteger $int$7779 = makeInteger(7779);

    public static final SubLString $str6$_cyc_projects_reading_learning_da = makeString("/cyc/projects/reading-learning/data/ebmt-index.txt");

    public static final SubLString $str7$_cyc_projects_reading_learning_da = makeString("/cyc/projects/reading-learning/data/ebmt-index.log");

    public static final SubLList $list8 = list(makeSymbol("NL-SENT"), makeSymbol("CYCL-SENT"));

    public static final SubLSymbol ADD_TEXT_LEARNER_EBMT_TRAINING_EXAMPLE = makeSymbol("ADD-TEXT-LEARNER-EBMT-TRAINING-EXAMPLE");

    public static final SubLString $str10$_A_now___ = makeString("~A now...");

    public static final SubLString $$$Halting_image = makeString("Halting image");



    public static final SubLString $str13$Finished_reading__S_ = makeString("Finished reading ~S.");

    private static final SubLObject $$PropositionalConceptualWork = reader_make_constant_shell(makeString("PropositionalConceptualWork"));

    public static final SubLString $str15$The_TextLearner_can_only_read_ins = makeString("The TextLearner can only read instances of #$PropositionalConceptualWork, which ~S does not appear to be.");

    public static final SubLString $$$Reading_ = makeString("Reading ");

    public static final SubLString $str17$Couldn_t_find_any_paragraphs_reif = makeString("Couldn't find any paragraphs reified for ~S");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLList $list19 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym20$START = makeUninternedSymbol("START");

    private static final SubLSymbol $sym21$END = makeUninternedSymbol("END");



    private static final SubLList $list23 = list(list(makeSymbol("L2R-IMAGE-ELAPSED-CPU-TIME")));





    private static final SubLSymbol $sym26$_ = makeSymbol("-");

    private static final SubLSymbol L2R_IMAGE_ELAPSED_CPU_TIME = makeSymbol("L2R-IMAGE-ELAPSED-CPU-TIME");

    private static final SubLSymbol L2R_COMPUTING_CPU_TIME = makeSymbol("L2R-COMPUTING-CPU-TIME");

    private static final SubLString $str29$Please_clear_the_local_transcript = makeString("Please clear the local transcript before running the Text Learner.");

    private static final SubLString $str30$The_Text_Learner_can_t_be_run_whi = makeString("The Text Learner can't be run while there are operations on the local queue.");



    private static final SubLSymbol L2R_PARAGRAPH_READER = makeSymbol("L2R-PARAGRAPH-READER");

    private static final SubLSymbol L2R_PARAGRAPH_READER_P = makeSymbol("L2R-PARAGRAPH-READER-P");

    public static final SubLList $list34 = list(new SubLObject[]{ makeSymbol("PARAGRAPH"), makeSymbol("DOCUMENT"), makeSymbol("PARAGRAPH-SOURCE-HTML"), makeSymbol("SENTENCE-VECTOR"), makeSymbol("SENTENCE-PEGS"), makeSymbol("SENTENCE-NON-HTML-TEXTS"), makeSymbol("SENTENCE-NUMBER"), makeSymbol("LINKAGE"), makeSymbol("LINKAGE-FORT"), makeSymbol("INITIAL-ASSERTION-COUNT"), makeSymbol("TOTAL-TIME"), makeSymbol("TOTAL-CPU-TIME"), makeSymbol("SENTENCE-TIME"), makeSymbol("SENTENCE-CPU-TIME"), makeSymbol("STATE") });

    public static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("PARAGRAPH"), makeKeyword("DOCUMENT"), makeKeyword("PARAGRAPH-SOURCE-HTML"), makeKeyword("SENTENCE-VECTOR"), makeKeyword("SENTENCE-PEGS"), makeKeyword("SENTENCE-NON-HTML-TEXTS"), makeKeyword("SENTENCE-NUMBER"), makeKeyword("LINKAGE"), makeKeyword("LINKAGE-FORT"), makeKeyword("INITIAL-ASSERTION-COUNT"), makeKeyword("TOTAL-TIME"), makeKeyword("TOTAL-CPU-TIME"), makeKeyword("SENTENCE-TIME"), makeKeyword("SENTENCE-CPU-TIME"), makeKeyword("STATE") });

    public static final SubLList $list36 = list(new SubLObject[]{ makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH"), makeSymbol("L2R-PARAGRAPH-READER-DOCUMENT"), makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-VECTOR"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-PEGS"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NUMBER"), makeSymbol("L2R-PARAGRAPH-READER-LINKAGE"), makeSymbol("L2R-PARAGRAPH-READER-LINKAGE-FORT"), makeSymbol("L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT"), makeSymbol("L2R-PARAGRAPH-READER-TOTAL-TIME"), makeSymbol("L2R-PARAGRAPH-READER-TOTAL-CPU-TIME"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-TIME"), makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME"), makeSymbol("L2R-PARAGRAPH-READER-STATE") });

    private static final SubLList $list37 = list(new SubLObject[]{ makeSymbol("_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-DOCUMENT"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-VECTOR"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-PEGS"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NUMBER"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-LINKAGE"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-LINKAGE-FORT"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-TOTAL-TIME"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-TOTAL-CPU-TIME"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-TIME"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME"), makeSymbol("_CSETF-L2R-PARAGRAPH-READER-STATE") });

    private static final SubLSymbol PRINT_L2R_PARAGRAPH_READER = makeSymbol("PRINT-L2R-PARAGRAPH-READER");

    private static final SubLSymbol L2R_PARAGRAPH_READER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("L2R-PARAGRAPH-READER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list40 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("L2R-PARAGRAPH-READER-P"));

    private static final SubLSymbol L2R_PARAGRAPH_READER_PARAGRAPH = makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_PARAGRAPH = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH");

    private static final SubLSymbol L2R_PARAGRAPH_READER_DOCUMENT = makeSymbol("L2R-PARAGRAPH-READER-DOCUMENT");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_DOCUMENT = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-DOCUMENT");

    private static final SubLSymbol L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML = makeSymbol("L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML");

    private static final SubLSymbol L2R_PARAGRAPH_READER_SENTENCE_VECTOR = makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-VECTOR");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_SENTENCE_VECTOR = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-VECTOR");

    private static final SubLSymbol L2R_PARAGRAPH_READER_SENTENCE_PEGS = makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-PEGS");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_SENTENCE_PEGS = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-PEGS");

    private static final SubLSymbol L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS = makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS");

    private static final SubLSymbol L2R_PARAGRAPH_READER_SENTENCE_NUMBER = makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-NUMBER");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_SENTENCE_NUMBER = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NUMBER");

    private static final SubLSymbol L2R_PARAGRAPH_READER_LINKAGE = makeSymbol("L2R-PARAGRAPH-READER-LINKAGE");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_LINKAGE = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-LINKAGE");

    private static final SubLSymbol L2R_PARAGRAPH_READER_LINKAGE_FORT = makeSymbol("L2R-PARAGRAPH-READER-LINKAGE-FORT");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_LINKAGE_FORT = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-LINKAGE-FORT");

    private static final SubLSymbol L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT = makeSymbol("L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT");

    private static final SubLSymbol L2R_PARAGRAPH_READER_TOTAL_TIME = makeSymbol("L2R-PARAGRAPH-READER-TOTAL-TIME");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_TOTAL_TIME = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-TOTAL-TIME");

    private static final SubLSymbol L2R_PARAGRAPH_READER_TOTAL_CPU_TIME = makeSymbol("L2R-PARAGRAPH-READER-TOTAL-CPU-TIME");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_TOTAL_CPU_TIME = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-TOTAL-CPU-TIME");

    private static final SubLSymbol L2R_PARAGRAPH_READER_SENTENCE_TIME = makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-TIME");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_SENTENCE_TIME = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-TIME");

    private static final SubLSymbol L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME = makeSymbol("L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME");

    private static final SubLSymbol L2R_PARAGRAPH_READER_STATE = makeSymbol("L2R-PARAGRAPH-READER-STATE");

    private static final SubLSymbol _CSETF_L2R_PARAGRAPH_READER_STATE = makeSymbol("_CSETF-L2R-PARAGRAPH-READER-STATE");





    private static final SubLSymbol $PARAGRAPH_SOURCE_HTML = makeKeyword("PARAGRAPH-SOURCE-HTML");





    private static final SubLSymbol $SENTENCE_NON_HTML_TEXTS = makeKeyword("SENTENCE-NON-HTML-TEXTS");







    private static final SubLSymbol $INITIAL_ASSERTION_COUNT = makeKeyword("INITIAL-ASSERTION-COUNT");



    private static final SubLSymbol $TOTAL_CPU_TIME = makeKeyword("TOTAL-CPU-TIME");



    private static final SubLSymbol $SENTENCE_CPU_TIME = makeKeyword("SENTENCE-CPU-TIME");



    private static final SubLString $str86$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_L2R_PARAGRAPH_READER = makeSymbol("MAKE-L2R-PARAGRAPH-READER");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_L2R_PARAGRAPH_READER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-L2R-PARAGRAPH-READER-METHOD");

    private static final SubLString $str92$_L2R_PARAGRAPH_READER__S__S_ = makeString("<L2R-PARAGRAPH-READER ~S ~S>");

    private static final SubLString $str93$Couldn_t_find_source_HTML_for__S = makeString("Couldn't find source HTML for ~S");





    private static final SubLSymbol $sym96$_SOURCE = makeSymbol("?SOURCE");

    private static final SubLObject $$asHtmlSourceString = reader_make_constant_shell(makeString("asHtmlSourceString"));

    private static final SubLList $list98 = list(makeSymbol("?SOURCE"));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str100$asHtmlSourceString_ProprietaryVer = makeString("asHtmlSourceString-ProprietaryVersion");

    private static final SubLString $$$L2R_Paragraph_Reader = makeString("L2R Paragraph Reader");

    private static final SubLSymbol L2R_PARAGRAPH_READER_NEXT = makeSymbol("L2R-PARAGRAPH-READER-NEXT");

    private static final SubLString $str103$___A__A_Performing_L2R_reader_act = makeString("~&~A ~A Performing L2R reader action: ~S~%");



    private static final SubLSymbol $FIND_OR_CREATE_PEGS_FOR_SENTENCE = makeKeyword("FIND-OR-CREATE-PEGS-FOR-SENTENCE");



    private static final SubLSymbol $ASSERT_PARSE_TREE_FOR_LINKAGE = makeKeyword("ASSERT-PARSE-TREE-FOR-LINKAGE");

    private static final SubLSymbol $ADD_PARSING_RESULTS = makeKeyword("ADD-PARSING-RESULTS");





    private static final SubLString $str111$L2R_reader_was_unable_to_complete = makeString("L2R reader was unable to complete its previous step. Unable to continue.");



    private static final SubLString $str113$__Next_L2R_reader_action___S__ = makeString("~&Next L2R reader action: ~S~%");

    private static final SubLSymbol $DONE_WITH_SENTENCE = makeKeyword("DONE-WITH-SENTENCE");

    private static final SubLSymbol $CREATED_OR_FOUND_SENTENCE_PEGS = makeKeyword("CREATED-OR-FOUND-SENTENCE-PEGS");



    private static final SubLSymbol $ASSERTED_PARSE_TREE_FOR_LINKAGE = makeKeyword("ASSERTED-PARSE-TREE-FOR-LINKAGE");



    private static final SubLSymbol $DONE_WITH_ALL_SENTENCES = makeKeyword("DONE-WITH-ALL-SENTENCES");

    public static final SubLList $list120 = list(list(makeSymbol("READER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym121$THIS_TIME = makeUninternedSymbol("THIS-TIME");

    private static final SubLSymbol $sym122$THIS_CPU_TIME = makeUninternedSymbol("THIS-CPU-TIME");





    private static final SubLString $str125$__This_step_took__A___A_of_CPU_ti = makeString("~&This step took ~A (~A of CPU time)~%");

    private static final SubLSymbol L2R_READABLE_TIME_STRING = makeSymbol("L2R-READABLE-TIME-STRING");

    private static final SubLList $list127 = list(TWO_INTEGER);





    private static final SubLList $list130 = list(ZERO_INTEGER);

    public static final SubLList $list131 = list(makeString("unknown amount"));





    private static final SubLString $str134$__Total_time_for_this_sentence___ = makeString("~&Total time for this sentence: ~A (~A of CPU time)~%");

    private static final SubLString $str135$__Total_time_for_this_reader___A_ = makeString("~&Total time for this reader: ~A (~A of CPU time)~%");

    public static final SubLList $list136 = list(list(makeSymbol("STATE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym137$OLD_TRANSMIT_STATE = makeUninternedSymbol("OLD-TRANSMIT-STATE");

    private static final SubLList $list138 = list(list(makeSymbol("GET-TRANSMIT-STATE")));





    private static final SubLSymbol SET_TRANSMIT_STATE = makeSymbol("SET-TRANSMIT-STATE");

    private static final SubLSymbol $sym142$OLD_RECEIVE_STATE = makeUninternedSymbol("OLD-RECEIVE-STATE");

    private static final SubLList $list143 = list(list(makeSymbol("GET-RECEIVE-STATE")));

    private static final SubLSymbol SET_RECEIVE_STATE = makeSymbol("SET-RECEIVE-STATE");

    private static final SubLString $$$transmit = makeString("transmit");

    private static final SubLString $$$store = makeString("store");

    private static final SubLString $$$ReadingEvent = makeString("ReadingEvent");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list149 = list(reader_make_constant_shell(makeString("Reading")));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLObject $$startingDate = reader_make_constant_shell(makeString("startingDate"));

    private static final SubLObject $$pcwRead = reader_make_constant_shell(makeString("pcwRead"));

    private static final SubLObject $$LearnByReadingDocumentDataMt = reader_make_constant_shell(makeString("LearnByReadingDocumentDataMt"));

    private static final SubLObject $$performedBy = reader_make_constant_shell(makeString("performedBy"));

    private static final SubLList $list155 = list(reader_make_constant_shell(makeString("Cyc")));

    private static final SubLSymbol $sym156$_READING = makeSymbol("?READING");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list158 = list(reader_make_constant_shell(makeString("unknownSentence")), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?END"), list(reader_make_constant_shell(makeString("endingDate")), makeSymbol("?READING"), makeSymbol("?END"))));

    private static final SubLList $list159 = list(list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?READING"), reader_make_constant_shell(makeString("Cyc"))));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$temporallySubsumes = reader_make_constant_shell(makeString("temporallySubsumes"));



    private static final SubLObject $$endingDate = reader_make_constant_shell(makeString("endingDate"));

    private static final SubLString $$$none = makeString("none");

    private static final SubLString $$$no = makeString("no");

    private static final SubLObject $$InterpretingDocumentMtFn = reader_make_constant_shell(makeString("InterpretingDocumentMtFn"));

    private static final SubLString $$$unknown_amount = makeString("unknown amount");

    private static final SubLObject $$contentMtOfLinkage = reader_make_constant_shell(makeString("contentMtOfLinkage"));

    private static final SubLObject $$linkageTokenization = reader_make_constant_shell(makeString("linkageTokenization"));

    private static final SubLString $str170$Couldn_t_find_linkage_for__S = makeString("Couldn't find linkage for ~S");

    private static final SubLString $str171$Couldn_t_find_linkage_FORT_for__S = makeString("Couldn't find linkage FORT for ~S");

    private static final SubLString $str172$Couldn_t_find_content_mt_for__S = makeString("Couldn't find content-mt for ~S");

    private static final SubLString $str173$Couldn_t_find_tokenization_for__S = makeString("Couldn't find tokenization for ~S");

    private static final SubLObject $$ist_Asserted = reader_make_constant_shell(makeString("ist-Asserted"));

    private static final SubLObject $$parseTreeOfTokenization = reader_make_constant_shell(makeString("parseTreeOfTokenization"));

    private static final SubLSymbol $sym176$_PARSE_TREE = makeSymbol("?PARSE-TREE");

    private static final SubLList $list177 = list(list(reader_make_constant_shell(makeString("syntacticRootOfParseTree")), makeSymbol("?PARSE-TREE"), makeSymbol("?ROOT-NODE")));

    private static final SubLObject $$LinguisticObject_NoParseAvailable = reader_make_constant_shell(makeString("LinguisticObject-NoParseAvailable"));

    private static final SubLObject $$pegInterpretationMts = reader_make_constant_shell(makeString("pegInterpretationMts"));

    private static final SubLString $str180$__Asserting_Cyclifier_results_for = makeString("~&Asserting Cyclifier results for ~S...~%");

    private static final SubLString $str181$__Read_sentence___S_in__A___A_of_ = makeString("~&Read sentence #~S in ~A (~A of CPU time)~%");

    private static final SubLString $str182$__After__S_sentences__assertion_c = makeString("~&After ~S sentences, assertion count increased ~S from ~S to ~S~%");



    private static final SubLSymbol CYC_FIND_OR_CREATE_NEW_PERMANENT = makeSymbol("CYC-FIND-OR-CREATE-NEW-PERMANENT");

    private static final SubLString $str185$Don_t_know_what_to_do_with_finali = makeString("Don't know what to do with finalization term~% ~S");

    private static final SubLString $str186$__Asserting_distillation_sentence = makeString("~%Asserting distillation sentence:~% ~S~%");

    private static final SubLObject $const187$TextLearnerQuery_WhatAreTheRequir = reader_make_constant_shell(makeString("TextLearnerQuery-WhatAreTheRequiredScenesOfFinalization"));

    private static final SubLSymbol KBQ_FROM_QUERY_RUNNING = makeSymbol("KBQ-FROM-QUERY-RUNNING");

    private static final SubLObject $const189$TextLearnerGarbageCollectionQuery = reader_make_constant_shell(makeString("TextLearnerGarbageCollectionQuerySpecification"));

    private static final SubLObject $const190$TextLearnerDisambiguationResultsD = reader_make_constant_shell(makeString("TextLearnerDisambiguationResultsDistillationQuerySpecification"));

    private static final SubLObject $$cycLQueryTypeSpecification = reader_make_constant_shell(makeString("cycLQueryTypeSpecification"));

    private static final SubLList $list192 = list(reader_make_constant_shell(makeString("TheFn")), reader_make_constant_shell(makeString("LinguisticExpressionPeg")));



    private static final SubLString $str194$__Read__S_sentences_in__A___ = makeString("~&Read ~S sentences in ~A.~%");

    private static final SubLString $$$Long_Inference_Warner = makeString("Long Inference Warner");

    private static final SubLSymbol WARN_ABOUT_LONG_INFERENCES = makeSymbol("WARN-ABOUT-LONG-INFERENCES");

    private static final SubLInteger $int$600 = makeInteger(600);

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str200$_S_finished_after__A_with__S_answ = makeString("~S finished after ~A with ~S answers.");

    private static final SubLString $str201$_S_has_taken__A_so_far____HL_quer = makeString("~S has taken ~A so far.~% HL query: ~S. Answer count: ~S");



    private static final SubLSymbol $MAX_PARSE_TIME = makeKeyword("MAX-PARSE-TIME");

    private static final SubLInteger $int$180 = makeInteger(180);

    private static final SubLString $str205$__Asserting_linkage_for__S___S___ = makeString("~&Asserting linkage for ~S (~S)...~%");

    private static final SubLObject $$L2RLinkageReificationTemplate = reader_make_constant_shell(makeString("L2RLinkageReificationTemplate"));

    private static final SubLString $$$Tokenization = makeString("Tokenization");

    private static final SubLList $list208 = list(reader_make_constant_shell(makeString("CycTokenization")));

    private static final SubLObject $$tokenizationInputString = reader_make_constant_shell(makeString("tokenizationInputString"));

    private static final SubLObject $$pegTokenizations = reader_make_constant_shell(makeString("pegTokenizations"));

    private static final SubLObject $$ContentModelForPegFn = reader_make_constant_shell(makeString("ContentModelForPegFn"));

    private static final SubLSymbol $sym212$_TOKENIZATION = makeSymbol("?TOKENIZATION");

    public static final SubLList $list213 = list(makeSymbol("?TOKENIZATION"));

    private static final SubLString $str214$Couldn_t_find_string_for__S = makeString("Couldn't find string for ~S");

    private static final SubLString $str215$Couldn_t_find_L2R_document_to_rea = makeString("Couldn't find L2R document to read.");

    private static final SubLSymbol L2R_DOCUMENT_READER = makeSymbol("L2R-DOCUMENT-READER");

    private static final SubLSymbol L2R_DOCUMENT_READER_P = makeSymbol("L2R-DOCUMENT-READER-P");

    private static final SubLList $list218 = list(makeSymbol("DOCUMENT"), makeSymbol("REMAINING-PARAGRAPHS"), makeSymbol("READ-PARAGRAPHS"), makeSymbol("PARAGRAPH-READER"), makeSymbol("READING-EVENT"));

    private static final SubLList $list219 = list(makeKeyword("DOCUMENT"), makeKeyword("REMAINING-PARAGRAPHS"), makeKeyword("READ-PARAGRAPHS"), makeKeyword("PARAGRAPH-READER"), makeKeyword("READING-EVENT"));

    private static final SubLList $list220 = list(makeSymbol("L2R-DOCUMENT-READER-DOCUMENT"), makeSymbol("L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS"), makeSymbol("L2R-DOCUMENT-READER-READ-PARAGRAPHS"), makeSymbol("L2R-DOCUMENT-READER-PARAGRAPH-READER"), makeSymbol("L2R-DOCUMENT-READER-READING-EVENT"));

    private static final SubLList $list221 = list(makeSymbol("_CSETF-L2R-DOCUMENT-READER-DOCUMENT"), makeSymbol("_CSETF-L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS"), makeSymbol("_CSETF-L2R-DOCUMENT-READER-READ-PARAGRAPHS"), makeSymbol("_CSETF-L2R-DOCUMENT-READER-PARAGRAPH-READER"), makeSymbol("_CSETF-L2R-DOCUMENT-READER-READING-EVENT"));

    private static final SubLSymbol PRINT_L2R_DOCUMENT_READER = makeSymbol("PRINT-L2R-DOCUMENT-READER");

    private static final SubLSymbol L2R_DOCUMENT_READER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("L2R-DOCUMENT-READER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list224 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("L2R-DOCUMENT-READER-P"));

    private static final SubLSymbol L2R_DOCUMENT_READER_DOCUMENT = makeSymbol("L2R-DOCUMENT-READER-DOCUMENT");

    private static final SubLSymbol _CSETF_L2R_DOCUMENT_READER_DOCUMENT = makeSymbol("_CSETF-L2R-DOCUMENT-READER-DOCUMENT");

    private static final SubLSymbol L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS = makeSymbol("L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS");

    private static final SubLSymbol _CSETF_L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS = makeSymbol("_CSETF-L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS");

    private static final SubLSymbol L2R_DOCUMENT_READER_READ_PARAGRAPHS = makeSymbol("L2R-DOCUMENT-READER-READ-PARAGRAPHS");

    private static final SubLSymbol _CSETF_L2R_DOCUMENT_READER_READ_PARAGRAPHS = makeSymbol("_CSETF-L2R-DOCUMENT-READER-READ-PARAGRAPHS");

    private static final SubLSymbol L2R_DOCUMENT_READER_PARAGRAPH_READER = makeSymbol("L2R-DOCUMENT-READER-PARAGRAPH-READER");

    private static final SubLSymbol _CSETF_L2R_DOCUMENT_READER_PARAGRAPH_READER = makeSymbol("_CSETF-L2R-DOCUMENT-READER-PARAGRAPH-READER");

    private static final SubLSymbol L2R_DOCUMENT_READER_READING_EVENT = makeSymbol("L2R-DOCUMENT-READER-READING-EVENT");

    private static final SubLSymbol _CSETF_L2R_DOCUMENT_READER_READING_EVENT = makeSymbol("_CSETF-L2R-DOCUMENT-READER-READING-EVENT");









    private static final SubLSymbol MAKE_L2R_DOCUMENT_READER = makeSymbol("MAKE-L2R-DOCUMENT-READER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_L2R_DOCUMENT_READER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-L2R-DOCUMENT-READER-METHOD");

    private static final SubLString $str241$_L2R_DOCUMENT_READER__S_ = makeString("<L2R-DOCUMENT-READER ~S>");

    private static final SubLSymbol $sym242$_L2R_READER_IMAGE_DOCUMENT_READER_ = makeSymbol("*L2R-READER-IMAGE-DOCUMENT-READER*");

    private static final SubLObject $const243$TextLearnerQuery_FindWikipediaArt = reader_make_constant_shell(makeString("TextLearnerQuery-FindWikipediaArticleToRead"));

    private static final SubLSymbol FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT = makeSymbol("FIND-UNFINISHED-L2R-READING-EVENT-FOR-DOCUMENT");

    private static final SubLSymbol $sym245$STARTS_BEFORE_STARTING_OF_ = makeSymbol("STARTS-BEFORE-STARTING-OF?");

    private static final SubLString $str246$_host_ = makeString("/host/");

    private static final SubLString $str247$_scratch_ = makeString("/scratch/");



    private static final SubLString $str249$l2r_images_ = makeString("l2r-images/");

    private static final SubLString $str250$done_ = makeString("done/");

    private static final SubLString $str251$ongoing_ = makeString("ongoing/");

    private static final SubLObject $$referenceWorkEntryTitle = reader_make_constant_shell(makeString("referenceWorkEntryTitle"));



    private static final SubLString $$$load = makeString("load");

    private static final SubLString $str255$Saved_image_file_to__S = makeString("Saved image file to ~S");

    private static final SubLSymbol $sym256$_AIS = makeSymbol("?AIS");

    private static final SubLObject $$correspondingAIS = reader_make_constant_shell(makeString("correspondingAIS"));

    private static final SubLList $list258 = list(makeSymbol("?AIS"));

    private static final SubLList $list259 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLObject $$WorldWideWebPage_PCW = reader_make_constant_shell(makeString("WorldWideWebPage-PCW"));

    private static final SubLList $list261 = list(reader_make_constant_shell(makeString("retainTerm")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("AISForFn")), makeSymbol("DOCUMENT")));

    private static final SubLObject $$AISForFn = reader_make_constant_shell(makeString("AISForFn"));

    private static final SubLString $str263$Don_t_know_how_to_read__S_ = makeString("Don't know how to read ~S.");

    private static final SubLObject $$retainTerm = reader_make_constant_shell(makeString("retainTerm"));





    private static final SubLString $str267$_S___has_already_been_downloaded_ = makeString("~S~% has already been downloaded: ~S");

    private static final SubLObject $$webPageURL = reader_make_constant_shell(makeString("webPageURL"));

    private static final SubLString $$$WebpageDownload = makeString("WebpageDownload");

    private static final SubLString $str270$_S_doesn_t_have_a___webPageURL_as = makeString("~S doesn't have a #$webPageURL assertion.");

    private static final SubLObject $$DownloadTypeOfAISFn = reader_make_constant_shell(makeString("DownloadTypeOfAISFn"));

    private static final SubLObject $$dateOfEvent = reader_make_constant_shell(makeString("dateOfEvent"));

    private static final SubLObject $$directingAgent = reader_make_constant_shell(makeString("directingAgent"));

    private static final SubLObject $$CyclistsMt = reader_make_constant_shell(makeString("CyclistsMt"));

    private static final SubLObject $$transferredAIS = reader_make_constant_shell(makeString("transferredAIS"));

    private static final SubLList $list276 = cons(makeSymbol("?PARAGRAPH"), makeSymbol("?N"));

    private static final SubLObject $const277$nthOccurrenceOfStructureTypeInStr = reader_make_constant_shell(makeString("nthOccurrenceOfStructureTypeInStructure"));

    private static final SubLSymbol $sym278$_PARAGRAPH = makeSymbol("?PARAGRAPH");

    private static final SubLSymbol $sym279$_N = makeSymbol("?N");

    private static final SubLObject $$NLParagraph = reader_make_constant_shell(makeString("NLParagraph"));

    private static final SubLList $list281 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));



    private static final SubLSymbol $sym283$_ = makeSymbol("<");

    private static final SubLString $$$Reifying_paragraphs_in_ = makeString("Reifying paragraphs in ");

    private static final SubLString $str285$___ = makeString("...");

    private static final SubLString $str286$_p_ = makeString("<p>");

    private static final SubLString $str287$_S_doesn_t_have_any_recognizable_ = makeString("~S doesn't have any recognizable paragraphs.");

    private static final SubLString $$$Identifying_paragraphs_in_ = makeString("Identifying paragraphs in ");

    private static final SubLString $str289$__p_ = makeString("</p>");

    private static final SubLString $$$script = makeString("script");

    private static final SubLString $str291$No_non_tagged_text_in__S = makeString("No non-tagged text in ~S");

    private static final SubLString $str292$No_closed_class_words_in__S = makeString("No closed-class words in ~S");

    private static final SubLObject $const293$NthOccurrenceOfStructureTypeInStr = reader_make_constant_shell(makeString("NthOccurrenceOfStructureTypeInStructureFn"));

    private static final SubLString $str294$___S___S__ = makeString("~&~S: ~S~%");

    private static final SubLString $$$SentenceLevelPeg = makeString("SentenceLevelPeg");

    private static final SubLSymbol STRING_OR_UNICODE_NAUT_P = makeSymbol("STRING-OR-UNICODE-NAUT-P");



    private static final SubLSymbol $sym298$_PEG = makeSymbol("?PEG");

    private static final SubLList $list299 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLSymbol L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE = makeSymbol("L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE");

    private static final SubLObject $const301$SentenceLevelPegCreationTemplateF = reader_make_constant_shell(makeString("SentenceLevelPegCreationTemplateForDocumentSlurper"));

    private static final SubLString $str302$Failed_to_validate___SentenceLeve = makeString("Failed to validate #$SentenceLevelPegCreationTemplateForDocumentSlurper");

    private static final SubLSymbol $sym303$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-CACHING-STATE*");

    private static final SubLSymbol L2R_SENTENCE_LEVEL_PEG_EXEMPLAR = makeSymbol("L2R-SENTENCE-LEVEL-PEG-EXEMPLAR");

    private static final SubLObject $$TheExemplarSentenceLevelPeg = reader_make_constant_shell(makeString("TheExemplarSentenceLevelPeg"));

    private static final SubLString $str306$Failed_to_validate___TheExemplarS = makeString("Failed to validate #$TheExemplarSentenceLevelPeg");

    private static final SubLSymbol $sym307$_L2R_SENTENCE_LEVEL_PEG_EXEMPLAR_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-EXEMPLAR-CACHING-STATE*");

    private static final SubLSymbol $sym308$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLString $str309$Failed_to_find_good_L2R_SENTENCE_ = makeString("Failed to find good L2R-SENTENCE-LEVEL-PEG-CREATION-RULES:~% ~S~% Must be a non-empty list of forward rules.");

    private static final SubLSymbol L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES = makeSymbol("L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES");

    private static final SubLSymbol IST_SENTENCE_P = makeSymbol("IST-SENTENCE-P");

    private static final SubLString $str312$Failed_to_initialize_L2R_SENTENCE = makeString("Failed to initialize L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES:~% ~S~% Must be a non-empty list of #$ist sentences.");

    private static final SubLSymbol $sym313$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES_CACHING_STATE = makeSymbol("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES-CACHING-STATE*");

    private static final SubLList $list314 = list(makeSymbol("IN"), makeSymbol("OUT"));

    private static final SubLSymbol L2R_DOCUMENT_INDEXICAL = makeSymbol("L2R-DOCUMENT-INDEXICAL");

    public static final SubLList $list316 = list(reader_make_constant_shell(makeString("TheFn")), reader_make_constant_shell(makeString("LearnByReadingDocument")));

    private static final SubLString $str317$Failed_to_validate_L2R_DOCUMENT_I = makeString("Failed to validate L2R-DOCUMENT-INDEXICAL: ~S");

    private static final SubLSymbol $sym318$_L2R_DOCUMENT_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-DOCUMENT-INDEXICAL-CACHING-STATE*");

    private static final SubLSymbol L2R_SENTENCE_INDEXICAL = makeSymbol("L2R-SENTENCE-INDEXICAL");

    public static final SubLList $list320 = list(reader_make_constant_shell(makeString("TheFn")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), reader_make_constant_shell(makeString("TextualPCW")), reader_make_constant_shell(makeString("infoStructureOfCW")), reader_make_constant_shell(makeString("NLSentence"))));

    private static final SubLString $str321$Failed_to_validate_L2R_SENTENCE_I = makeString("Failed to validate L2R-SENTENCE-INDEXICAL: ~S");

    private static final SubLSymbol $sym322$_L2R_SENTENCE_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-INDEXICAL-CACHING-STATE*");

    private static final SubLSymbol L2R_SUPERTEXT_INDEXICAL = makeSymbol("L2R-SUPERTEXT-INDEXICAL");

    public static final SubLList $list324 = list(reader_make_constant_shell(makeString("TheFn")), reader_make_constant_shell(makeString("GraphicalStructure")));

    private static final SubLString $str325$Failed_to_validate_L2R_SUPERTEXT_ = makeString("Failed to validate L2R-SUPERTEXT-INDEXICAL: ~S");

    private static final SubLSymbol $sym326$_L2R_SUPERTEXT_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SUPERTEXT-INDEXICAL-CACHING-STATE*");

    private static final SubLSymbol L2R_SENTENCE_STRING_INDEXICAL = makeSymbol("L2R-SENTENCE-STRING-INDEXICAL");

    public static final SubLList $list328 = list(reader_make_constant_shell(makeString("TheFn")), reader_make_constant_shell(makeString("ControlCharacterFreeString")));

    public static final SubLString $str329$Failed_to_validate_L2R_SENTENCE_S = makeString("Failed to validate L2R-SENTENCE-STRING-INDEXICAL: ~S");

    private static final SubLSymbol $sym330$_L2R_SENTENCE_STRING_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-STRING-INDEXICAL-CACHING-STATE*");

    private static final SubLSymbol L2R_SENTENCE_NUMBER_INDEXICAL = makeSymbol("L2R-SENTENCE-NUMBER-INDEXICAL");

    private static final SubLList $list332 = list(reader_make_constant_shell(makeString("TheNthFn")), reader_make_constant_shell(makeString("PositiveInteger")), TWO_INTEGER);

    private static final SubLString $str333$Failed_to_validate_L2R_SENTENCE_N = makeString("Failed to validate L2R-SENTENCE-NUMBER-INDEXICAL: ~S");

    private static final SubLSymbol $sym334$_L2R_SENTENCE_NUMBER_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-NUMBER-INDEXICAL-CACHING-STATE*");

    private static final SubLSymbol L2R_SENTENCE_STRING_NUMBER_INDEXICAL = makeSymbol("L2R-SENTENCE-STRING-NUMBER-INDEXICAL");

    private static final SubLList $list336 = list(reader_make_constant_shell(makeString("TheNthFn")), reader_make_constant_shell(makeString("PositiveInteger")), ONE_INTEGER);

    private static final SubLString $str337$Failed_to_validate_L2R_SENTENCE_S = makeString("Failed to validate L2R-SENTENCE-STRING-NUMBER-INDEXICAL: ~S");

    private static final SubLSymbol $sym338$_L2R_SENTENCE_STRING_NUMBER_INDEXICAL_CACHING_STATE_ = makeSymbol("*L2R-SENTENCE-STRING-NUMBER-INDEXICAL-CACHING-STATE*");

    private static final SubLList $list339 = list(makeSymbol("?HIGHER"), makeSymbol("?LOWER"));

    private static final SubLObject $$assertPriorToInCreationTemplate = reader_make_constant_shell(makeString("assertPriorToInCreationTemplate"));

    private static final SubLSymbol $sym341$_HIGHER = makeSymbol("?HIGHER");

    private static final SubLSymbol $sym342$_LOWER = makeSymbol("?LOWER");

    private static final SubLList $list343 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));



    private static final SubLSymbol ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");

    private static final SubLSymbol HTML_STRING_WORDIFY = makeSymbol("HTML-STRING-WORDIFY");

    private static final SubLString $str347$Couldn_t_make_UTF8_string_from__S = makeString("Couldn't make UTF8 string from ~S");

    private static final SubLSymbol NON_ASCII_CHAR_P = makeSymbol("NON-ASCII-CHAR-P");









    private static final SubLList $list353 = list(makeSymbol("HTML"), makeSymbol("THIS-HTML-OFFSET"), makeSymbol("THIS-NON-HTML-OFFSET"));

    private static final SubLObject $$SubExpressionAtOffsetFn = reader_make_constant_shell(makeString("SubExpressionAtOffsetFn"));

    private static final SubLObject $$subExpressionWithStringAtOffset = reader_make_constant_shell(makeString("subExpressionWithStringAtOffset"));





    private static final SubLString $str358$_a = makeString("<a");

    private static final SubLString $$$href = makeString("href");

    private static final SubLString $str360$__a = makeString("</a");

    private static final SubLString $str361$Bad_offset___S_at_offset__S_of__S = makeString("Bad offset: ~S at offset ~S of ~S");



    private static final SubLSymbol L2R_DOCUMENT_SENTENCE_FINDER_KBQ = makeSymbol("L2R-DOCUMENT-SENTENCE-FINDER-KBQ");

    private static final SubLObject $const364$ReifySentencePegQuery_FindSentenc = reader_make_constant_shell(makeString("ReifySentencePegQuery-FindSentences"));

    private static final SubLString $str365$Failed_to_validate___ReifySentenc = makeString("Failed to validate #$ReifySentencePegQuery-FindSentences");

    private static final SubLSymbol $sym366$_L2R_DOCUMENT_SENTENCE_FINDER_KBQ_CACHING_STATE_ = makeSymbol("*L2R-DOCUMENT-SENTENCE-FINDER-KBQ-CACHING-STATE*");

    private static final SubLSymbol $sym367$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLSymbol NON_EMPTY_STRING_P = makeSymbol("NON-EMPTY-STRING-P");

    private static final SubLString $str369$Asserting_linkages_for____ = makeString("Asserting linkages for: ~%");

    private static final SubLString $str370$_____A__ = makeString("... ~A~%");

    private static final SubLString $str371$Using_L2R_Webpage_Cyclifier_with_ = makeString("Using L2R Webpage Cyclifier with timestamp ~S.");

    private static final SubLString $str372$sentences_ = makeString("sentences/");

    private static final SubLInteger $int$511 = makeInteger(511);

    private static final SubLString $$$links = makeString("links");

    private static final SubLString $str375$__Writing__S_links_from__S_to__S_ = makeString("~&Writing ~S links from ~S to ~S~%");



    private static final SubLString $str377$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str378$http___en_wikipedia_org_ = makeString("http://en.wikipedia.org/");

    private static final SubLString $str379$ = makeString("");

    private static final SubLString $$$Following_unknown_phrase_links_in = makeString("Following unknown phrase links in");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLList $list382 = list(makeString("/"));

    private static final SubLString $str383$_ = makeString("/");



    private static final SubLList $list385 = list(makeString("<a href="), makeString(">"), makeString(" "));

    private static final SubLString $str386$_a_href___wiki_ = makeString("<a href=\"/wiki/");

    private static final SubLString $str387$a_href_ = makeString("a href=");

    private static final SubLString $str388$_img_ = makeString("<img ");

    private static final SubLSymbol PUNCTUATION_P = makeSymbol("PUNCTUATION-P");

    private static final SubLString $$$Logging_cyclifications_for_ = makeString("Logging cyclifications for ");

    private static final SubLString $str391$__ = makeString(": ");

    private static final SubLString $str392$sentence__3__0D_ = makeString("sentence-~3,'0D/");

    private static final SubLString $str393$Couldn_t_make_directory_____S = makeString("Couldn't make directory:~% ~S");

    private static final SubLString $str394$sentence_text_lisp = makeString("sentence-text.lisp");

    private static final SubLString $str395$__Cyclifying_unparsed_sentences_f = makeString("~&Cyclifying unparsed sentences from ~S~%");

    private static final SubLString $str396$sentence_ = makeString("sentence-");

    private static final SubLString $str397$sentence_parsed_lisp = makeString("sentence-parsed.lisp");

    private static final SubLString $str398$__Skipping_already_parsed__S__ = makeString("~&Skipping already-parsed ~S~%");

    private static final SubLString $str399$__Parsing__S__ = makeString("~&Parsing ~S~%");

    private static final SubLString $str400$___Logged__S_sentence_parses_to__ = makeString("~& Logged ~S sentence parses to ~S.~%");

    private static final SubLString $str401$No_sentence_to_parse_in__S = makeString("No sentence to parse in ~S");

    private static final SubLList $list402 = list(makeString("P"), makeString("H1"), makeString("H2"), makeString("H3"), makeString("H4"), makeString("TABLE"), makeString("DIV"));



    private static final SubLList $list404 = list(makeString("<"));

    private static final SubLList $list405 = list(makeString("</"));

    private static final SubLList $list406 = list(makeString(">"));

    private static final SubLList $list407 = list(new SubLObject[]{ makeString(" | "), makeString("@import"), makeString("Wikipedia"), makeString(" is a stub."), makeString("Edit this page"), makeString("For other uses, see"), makeString("Create account"), makeString("All text is available under the terms of"), makeString("You can help by expanding it."), makeString("This page was last modified"), makeString("fixalpha"), makeString("Wikimedia"), makeString("Wiktionary"), makeString("Main Article:"), makeString("Main Articles:"), makeString("Wikibooks") });

    private static final SubLString $str408$_C = makeString("~C");

    private static final SubLString $str409$_ = makeString("<");

    private static final SubLString $str410$__ = makeString("</");

    private static final SubLString $str411$_ = makeString(">");

    private static final SubLString $str412$_ul_ = makeString("<ul>");

    private static final SubLString $str413$__ul_ = makeString("</ul>");

    private static final SubLString $str414$_____start_content____ = makeString("<!-- start content -->");

    private static final SubLString $str415$_____end_content____ = makeString("<!-- end content -->");

    private static final SubLString $$$ul = makeString("ul");

    private static final SubLString $$$ol = makeString("ol");

    private static final SubLString $$$table = makeString("table");

    private static final SubLString $$$h1 = makeString("h1");

    private static final SubLString $$$h2 = makeString("h2");

    private static final SubLString $$$h3 = makeString("h3");



    private static final SubLString $str423$Couldn_t_find_paragraphs_in__S = makeString("Couldn't find paragraphs in ~S");

    private static final SubLString $str424$No_sentence_string_for__S = makeString("No sentence string for ~S");

    private static final SubLString $str425$_A_ = makeString("~A ");

    private static final SubLString $str426$href__ = makeString("href=\"");

    private static final SubLString $str427$_ = makeString("\"");

    private static final SubLString $str428$_ = makeString("&");

    private static final SubLString $str429$_u0a_ = makeString("&u0a;");

    private static final SubLString $str430$Downloading_and_sentencifying_tex = makeString("Downloading and sentencifying text of ~S");

    private static final SubLObject $$CurrentWorldDataCollectorMt = reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt"));

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLString $str433$__Cannot_open_input_stream_for__A = makeString("~%Cannot open input stream for ~A");



    private static final SubLString $str435$Non_string_in__S_____S__ = makeString("Non-string in ~S:~% ~S~%");

    private static final SubLString $$$775 = makeString("775");

    private static final SubLString $str437$_S_is_not_empty = makeString("~S is not empty");

    private static final SubLString $str438$results_dictionary_cfasl = makeString("results-dictionary.cfasl");

    private static final SubLString $str439$Parsing_and_partioning_paragraphs = makeString("Parsing and partioning paragraphs...");









    private static final SubLString $str444$Writing_results_to__S = makeString("Writing results to ~S");

    private static final SubLList $list445 = cons(makeSymbol("SENTENCE"), makeSymbol("PARTITIONED-PARSES"));

    private static final SubLList $list446 = list(makeSymbol("GOOD"), makeSymbol("MAYBE"), makeSymbol("BAD"));



    private static final SubLString $str448$_A__3__0D = makeString("~A-~3,'0D");

    private static final SubLString $str449$Known_bindings_ = makeString("Known bindings:");

    private static final SubLString $str450$Consistent_ = makeString("Consistent:");

    private static final SubLString $str451$Known_false_ = makeString("Known false:");

    private static final SubLSymbol NART_HL_FORMULA = makeSymbol("NART-HL-FORMULA");

    private static final SubLSymbol $sym453$ALPHANUMERIC_STRING_ = makeSymbol("ALPHANUMERIC-STRING?");

    private static final SubLSymbol WORD_CATEGORY = makeSymbol("WORD-CATEGORY");



    private static final SubLList $list456 = list(new SubLObject[]{ list(makeKeyword("NN"), makeKeyword("NNS")), list(makeKeyword("VBP"), makeKeyword("NN")), list(makeKeyword("VBG"), makeKeyword("NN")), list(makeKeyword("VBZ"), makeKeyword("NN")), list(makeKeyword("VBD"), makeKeyword("NN")), list(makeKeyword("VB"), makeKeyword("NN")), list(makeKeyword("JJS"), makeKeyword("NNS")), list(makeKeyword("JJR"), makeKeyword("NNS")), list(makeKeyword("JJ"), makeKeyword("NNS")), list(makeKeyword("JJS"), makeKeyword("NN")), list(makeKeyword("JJR"), makeKeyword("NN")), list(makeKeyword("JJ"), makeKeyword("NN")), list(makeKeyword("NNS"), makeKeyword("NNS")), list(makeKeyword("NN"), makeKeyword("NN")), list(makeKeyword("VBN"), makeKeyword("NN")) });





    public static SubLObject default_learning_reader_cyclist() {
        return $$Cyc;
    }

    public static SubLObject l2r_assert(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BaseKB;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
            thread.resetMultipleValues();
            final SubLObject successP = ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED);
            final SubLObject problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == successP) {
                Errors.warn($str2$L2R__Failed_asserting____S___in__, sentence, mt, problem);
            }
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return sentence;
    }

    public static SubLObject l2r_unassert_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
            ke.ke_unassert_assertion(assertion);
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject l2r_create(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_constant = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
            new_constant = ke.ke_create_now(cconcatenate($str3$L2R_, name), UNPROVIDED);
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return new_constant;
    }

    public static SubLObject add_text_learner_ebmt_training_example(final SubLObject argument, final SubLObject assertion) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args(assertion);
        SubLObject nl_sent = NIL;
        SubLObject cycl_sent = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        nl_sent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        cycl_sent = current.first();
        current = current.rest();
        if (NIL == current) {
            create_and_add_l2r_ebmt_template(nl_sent, cycl_sent);
        } else {
            cdestructuring_bind_error(datum, $list8);
        }
        return NIL;
    }

    public static SubLObject create_and_add_l2r_ebmt_template(final SubLObject nl_sent, final SubLObject cycl_sent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lucene_index.$ebmt_index_port$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lucene_index.$ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_4 = lucene_index.$ebmt_index_log$.currentBinding(thread);
        try {
            lucene_index.$ebmt_index_host$.bind($l2r_ebmt_index_host$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_port$.bind($l2r_ebmt_index_port$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_content$.bind($l2r_ebmt_index_content$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_log$.bind($l2r_ebmt_index_log$.getGlobalValue(), thread);
            ebmt_template_parser.ebmt_create_and_add_templates(nl_sent, cycl_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            lucene_index.$ebmt_index_log$.rebind(_prev_bind_4, thread);
            lucene_index.$ebmt_index_content$.rebind(_prev_bind_3, thread);
            lucene_index.$ebmt_index_port$.rebind(_prev_bind_2, thread);
            lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        return nl_sent;
    }

    public static SubLObject l2r_ebmt_parse(final SubLObject nl_sent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = NIL;
        SubLObject justifications = NIL;
        SubLObject weights = NIL;
        final SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lucene_index.$ebmt_index_port$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lucene_index.$ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_4 = lucene_index.$ebmt_index_log$.currentBinding(thread);
        try {
            lucene_index.$ebmt_index_host$.bind($l2r_ebmt_index_host$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_port$.bind($l2r_ebmt_index_port$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_content$.bind($l2r_ebmt_index_content$.getGlobalValue(), thread);
            lucene_index.$ebmt_index_log$.bind($l2r_ebmt_index_log$.getGlobalValue(), thread);
            thread.resetMultipleValues();
            final SubLObject parses_$1 = ebmt_template_parser.ebmt_parse(nl_sent, UNPROVIDED, UNPROVIDED);
            final SubLObject justifications_$2 = thread.secondMultipleValue();
            final SubLObject weights_$3 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            parses = parses_$1;
            justifications = justifications_$2;
            weights = weights_$3;
        } finally {
            lucene_index.$ebmt_index_log$.rebind(_prev_bind_4, thread);
            lucene_index.$ebmt_index_content$.rebind(_prev_bind_3, thread);
            lucene_index.$ebmt_index_port$.rebind(_prev_bind_2, thread);
            lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        return values(parses, justifications, weights);
    }

    public static SubLObject l2r_reader_image_run() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject document_reader = l2r_reader_image_find_or_create_document_reader();
        set_l2r_reader_image_document_reader(document_reader);
        final SubLObject _prev_bind_0 = $l2r_transmit_operationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $l2r_reader_unstable_inside_stepsP$.currentBinding(thread);
        try {
            $l2r_transmit_operationsP$.bind(T, thread);
            $l2r_reader_unstable_inside_stepsP$.bind(NIL, thread);
            l2r_document_reader_read_document(document_reader);
        } finally {
            $l2r_reader_unstable_inside_stepsP$.rebind(_prev_bind_2, thread);
            $l2r_transmit_operationsP$.rebind(_prev_bind_0, thread);
        }
        format(T, $str10$_A_now___, $$$Halting_image);
        operation_communication.halt_cyc_image(UNPROVIDED);
        return NIL;
    }

    public static SubLObject l2r_reader_image_read_document(final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) " + v_document;
        final SubLObject _prev_bind_0 = $l2r_transmit_operationsP$.currentBinding(thread);
        try {
            $l2r_transmit_operationsP$.bind(T, thread);
            final SubLObject document_reader = l2r_new_reader_for_document(v_document);
            set_l2r_reader_image_document_reader(document_reader);
            l2r_document_reader_read_document(document_reader);
            set_l2r_reader_image_document_reader(NIL);
        } finally {
            $l2r_transmit_operationsP$.rebind(_prev_bind_0, thread);
        }
        format(T, $str13$Finished_reading__S_, v_document);
        return NIL;
    }

    public static SubLObject l2r_read_document(final SubLObject v_document, SubLObject reading_event) {
        if (reading_event == UNPROVIDED) {
            reading_event = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) " + v_document;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == isa.isa_in_any_mtP(v_document, $$PropositionalConceptualWork))) {
            Errors.error($str15$The_TextLearner_can_only_read_ins, v_document);
        }
        final SubLObject message = cconcatenate($$$Reading_, format_nil.format_nil_s_no_copy(v_document));
        final SubLObject paragraphs = l2r_find_or_create_document_paragraphs(v_document, UNPROVIDED);
        if (NIL == list_utilities.non_empty_list_p(paragraphs)) {
            Errors.warn($str17$Couldn_t_find_any_paragraphs_reif, v_document);
        }
        if (NIL != cycl_grammar.cycl_denotational_term_p(reading_event)) {
            note_l2r_reading_event_ongoing(reading_event);
        }
        final SubLObject list_var = paragraphs;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != message ? message : $$$cdolist, thread);
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
                SubLObject paragraph = NIL;
                paragraph = csome_list_var.first();
                while (NIL != csome_list_var) {
                    operation_queues.clear_local_operation_storage_queue();
                    l2r_read_paragraph(paragraph, v_document, UNPROVIDED);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    paragraph = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
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
        if (NIL != cycl_grammar.cycl_denotational_term_p(reading_event)) {
            note_l2r_reading_event_done(reading_event);
        }
        return v_document;
    }

    public static SubLObject l2r_computing_cpu_time(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list19);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject start = $sym20$START;
        final SubLObject end = $sym21$END;
        return listS(CLET, list(bq_cons(start, $list23)), append(body, list(list(CLET, list(list(end, listS(FWHEN, start, $list23))), list(CSETQ, var, list(FWHEN, end, list($sym26$_, end, start)))))));
    }

    public static SubLObject l2r_image_elapsed_cpu_time() {
        return NIL;
    }

    public static SubLObject l2r_read_paragraph(final SubLObject paragraph, final SubLObject v_document, SubLObject reading_event) {
        if (reading_event == UNPROVIDED) {
            reading_event = NIL;
        }
        if (NIL == operation_queues.local_operation_storage_queue_empty()) {
            Errors.warn($str29$Please_clear_the_local_transcript);
            return NIL;
        }
        if (NIL == operation_queues.local_queue_empty()) {
            Errors.warn($str30$The_Text_Learner_can_t_be_run_whi);
            return NIL;
        }
        final SubLObject communication_mode = operation_communication.communication_mode();
        try {
            l2r_read_paragraph_internal(paragraph, v_document, reading_event, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                operation_communication.set_communication_mode(communication_mode);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return $DONE;
    }

    public static SubLObject l2r_paragraph_reader_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_l2r_paragraph_reader(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject l2r_paragraph_reader_p(final SubLObject v_object) {
        return v_object.getClass() == learning_reader.$l2r_paragraph_reader_native.class ? T : NIL;
    }

    public static SubLObject l2r_paragraph_reader_paragraph(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject l2r_paragraph_reader_document(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject l2r_paragraph_reader_paragraph_source_html(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject l2r_paragraph_reader_sentence_vector(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject l2r_paragraph_reader_sentence_pegs(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject l2r_paragraph_reader_sentence_non_html_texts(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject l2r_paragraph_reader_sentence_number(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject l2r_paragraph_reader_linkage(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject l2r_paragraph_reader_linkage_fort(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject l2r_paragraph_reader_initial_assertion_count(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject l2r_paragraph_reader_total_time(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject l2r_paragraph_reader_total_cpu_time(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject l2r_paragraph_reader_sentence_time(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField14();
    }

    public static SubLObject l2r_paragraph_reader_sentence_cpu_time(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField15();
    }

    public static SubLObject l2r_paragraph_reader_state(final SubLObject v_object) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.getField16();
    }

    public static SubLObject _csetf_l2r_paragraph_reader_paragraph(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_document(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_paragraph_source_html(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_vector(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_pegs(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_non_html_texts(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_linkage(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_linkage_fort(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_initial_assertion_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_total_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_total_cpu_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_sentence_cpu_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_l2r_paragraph_reader_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_paragraph_reader_p(v_object) : "learning_reader.l2r_paragraph_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_paragraph_reader_p(v_object) " + v_object;
        return v_object.setField16(value);
    }

    public static SubLObject make_l2r_paragraph_reader(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new learning_reader.$l2r_paragraph_reader_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PARAGRAPH)) {
                _csetf_l2r_paragraph_reader_paragraph(v_new, current_value);
            } else
                if (pcase_var.eql($DOCUMENT)) {
                    _csetf_l2r_paragraph_reader_document(v_new, current_value);
                } else
                    if (pcase_var.eql($PARAGRAPH_SOURCE_HTML)) {
                        _csetf_l2r_paragraph_reader_paragraph_source_html(v_new, current_value);
                    } else
                        if (pcase_var.eql($SENTENCE_VECTOR)) {
                            _csetf_l2r_paragraph_reader_sentence_vector(v_new, current_value);
                        } else
                            if (pcase_var.eql($SENTENCE_PEGS)) {
                                _csetf_l2r_paragraph_reader_sentence_pegs(v_new, current_value);
                            } else
                                if (pcase_var.eql($SENTENCE_NON_HTML_TEXTS)) {
                                    _csetf_l2r_paragraph_reader_sentence_non_html_texts(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SENTENCE_NUMBER)) {
                                        _csetf_l2r_paragraph_reader_sentence_number(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($LINKAGE)) {
                                            _csetf_l2r_paragraph_reader_linkage(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($LINKAGE_FORT)) {
                                                _csetf_l2r_paragraph_reader_linkage_fort(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($INITIAL_ASSERTION_COUNT)) {
                                                    _csetf_l2r_paragraph_reader_initial_assertion_count(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($TOTAL_TIME)) {
                                                        _csetf_l2r_paragraph_reader_total_time(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($TOTAL_CPU_TIME)) {
                                                            _csetf_l2r_paragraph_reader_total_cpu_time(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($SENTENCE_TIME)) {
                                                                _csetf_l2r_paragraph_reader_sentence_time(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($SENTENCE_CPU_TIME)) {
                                                                    _csetf_l2r_paragraph_reader_sentence_cpu_time(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($STATE)) {
                                                                        _csetf_l2r_paragraph_reader_state(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str86$Invalid_slot__S_for_construction_, current_arg);
                                                                    }














        }
        return v_new;
    }

    public static SubLObject visit_defstruct_l2r_paragraph_reader(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_L2R_PARAGRAPH_READER, FIFTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PARAGRAPH, l2r_paragraph_reader_paragraph(obj));
        funcall(visitor_fn, obj, $SLOT, $DOCUMENT, l2r_paragraph_reader_document(obj));
        funcall(visitor_fn, obj, $SLOT, $PARAGRAPH_SOURCE_HTML, l2r_paragraph_reader_paragraph_source_html(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_VECTOR, l2r_paragraph_reader_sentence_vector(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_PEGS, l2r_paragraph_reader_sentence_pegs(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_NON_HTML_TEXTS, l2r_paragraph_reader_sentence_non_html_texts(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_NUMBER, l2r_paragraph_reader_sentence_number(obj));
        funcall(visitor_fn, obj, $SLOT, $LINKAGE, l2r_paragraph_reader_linkage(obj));
        funcall(visitor_fn, obj, $SLOT, $LINKAGE_FORT, l2r_paragraph_reader_linkage_fort(obj));
        funcall(visitor_fn, obj, $SLOT, $INITIAL_ASSERTION_COUNT, l2r_paragraph_reader_initial_assertion_count(obj));
        funcall(visitor_fn, obj, $SLOT, $TOTAL_TIME, l2r_paragraph_reader_total_time(obj));
        funcall(visitor_fn, obj, $SLOT, $TOTAL_CPU_TIME, l2r_paragraph_reader_total_cpu_time(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_TIME, l2r_paragraph_reader_sentence_time(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_CPU_TIME, l2r_paragraph_reader_sentence_cpu_time(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, l2r_paragraph_reader_state(obj));
        funcall(visitor_fn, obj, $END, MAKE_L2R_PARAGRAPH_READER, FIFTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_l2r_paragraph_reader_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_l2r_paragraph_reader(obj, visitor_fn);
    }

    public static SubLObject print_l2r_paragraph_reader(final SubLObject reader, final SubLObject stream, final SubLObject depth) {
        format(stream, $str92$_L2R_PARAGRAPH_READER__S__S_, l2r_paragraph_reader_paragraph(reader), l2r_paragraph_reader_state(reader));
        return NIL;
    }

    public static SubLObject new_l2r_paragraph_reader(final SubLObject paragraph, final SubLObject v_document) {
        final SubLObject reader = make_l2r_paragraph_reader(UNPROVIDED);
        final SubLObject source_html = l2r_get_source_html(paragraph);
        if (!source_html.isString()) {
            Errors.warn($str93$Couldn_t_find_source_HTML_for__S, paragraph);
        }
        _csetf_l2r_paragraph_reader_paragraph(reader, paragraph);
        _csetf_l2r_paragraph_reader_document(reader, v_document);
        _csetf_l2r_paragraph_reader_paragraph_source_html(reader, source_html);
        if (source_html.isString()) {
            _csetf_l2r_paragraph_reader_sentence_vector(reader, sentencify_l2r_paragraph(l2r_paragraph_reader_paragraph_source_html(reader)));
        }
        _csetf_l2r_paragraph_reader_sentence_pegs(reader, NIL);
        _csetf_l2r_paragraph_reader_sentence_non_html_texts(reader, NIL);
        _csetf_l2r_paragraph_reader_sentence_number(reader, ZERO_INTEGER);
        _csetf_l2r_paragraph_reader_initial_assertion_count(reader, assertion_handles.assertion_count());
        _csetf_l2r_paragraph_reader_total_time(reader, ZERO_INTEGER);
        _csetf_l2r_paragraph_reader_total_cpu_time(reader, ZERO_INTEGER);
        reset_l2r_paragraph_reader_sentence_times(reader);
        _csetf_l2r_paragraph_reader_state(reader, source_html.isString() ? $INITIALIZED : $EXHAUSTED);
        return reader;
    }

    public static SubLObject l2r_get_source_html(final SubLObject structure) {
        return backward.removal_ask_variable($sym96$_SOURCE, listS($$asHtmlSourceString, structure, $list98), $$EverythingPSC, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject l2r_assert_source_html(final SubLObject structure, final SubLObject source_html, final SubLObject mt, SubLObject proprietaryP) {
        if (proprietaryP == UNPROVIDED) {
            proprietaryP = T;
        }
        final SubLObject proprietary_pred = constants_high.find_constant($str100$asHtmlSourceString_ProprietaryVer);
        final SubLObject pred = ((NIL != proprietaryP) && (NIL != valid_constantP(proprietary_pred, UNPROVIDED))) ? proprietary_pred : $$asHtmlSourceString;
        return l2r_assert(list(pred, structure, source_html), mt);
    }

    public static SubLObject l2r_paragraph_reader_next_in_separate_thread(final SubLObject reader) {
        return process_utilities.make_cyc_server_process_with_args($$$L2R_Paragraph_Reader, L2R_PARAGRAPH_READER_NEXT, list(reader));
    }

    public static SubLObject l2r_paragraph_reader_next(final SubLObject reader) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject state = l2r_paragraph_reader_state(reader);
        final SubLObject action = l2r_paragraph_reader_next_action(reader);
        format(T, $str103$___A__A_Performing_L2R_reader_act, new SubLObject[]{ numeric_date_utilities.datestring(UNPROVIDED), numeric_date_utilities.secondstring(UNPROVIDED), action });
        force_output(T);
        if (NIL != $l2r_reader_unstable_inside_stepsP$.getDynamicValue(thread)) {
            _csetf_l2r_paragraph_reader_state(reader, $UNSTABLE);
        }
        inference_metrics.clear_forward_inference_metrics();
        final SubLObject pcase_var = action;
        if (pcase_var.eql($FIND_OR_CREATE_PEGS_FOR_SENTENCE)) {
            l2r_paragraph_reader_find_or_create_pegs_for_sentence(reader);
        } else
            if (pcase_var.eql($ASSERT_LINKAGE)) {
                l2r_paragraph_reader_find_or_assert_linkage(reader);
            } else
                if (pcase_var.eql($ASSERT_PARSE_TREE_FOR_LINKAGE)) {
                    l2r_paragraph_reader_maybe_assert_parse_tree_for_linkage(reader);
                } else
                    if (pcase_var.eql($ADD_PARSING_RESULTS)) {
                        l2r_paragraph_reader_maybe_add_parsing_results(reader);
                    } else
                        if (pcase_var.eql($FINALIZE_SENTENCE)) {
                            l2r_paragraph_reader_finalize_sentence(reader);
                        } else
                            if (pcase_var.eql($COLLECT_GARBAGE)) {
                                l2r_paragraph_reader_collect_garbage(reader);
                            } else {
                                final SubLObject pcase_var_$5 = state;
                                if (pcase_var_$5.eql($EXHAUSTED)) {
                                    destroy_l2r_paragraph_reader(reader);
                                    return $EXHAUSTED;
                                }
                                if (pcase_var_$5.eql($UNSTABLE)) {
                                    Errors.warn($str111$L2R_reader_was_unable_to_complete);
                                    destroy_l2r_paragraph_reader(reader);
                                    return $ABORTED;
                                }
                            }





        format(T, $str113$__Next_L2R_reader_action___S__, l2r_paragraph_reader_next_action(reader));
        force_output(T);
        return l2r_paragraph_reader_state(reader);
    }

    public static SubLObject l2r_paragraph_reader_next_action(final SubLObject reader) {
        final SubLObject pcase_var;
        final SubLObject state = pcase_var = l2r_paragraph_reader_state(reader);
        if (pcase_var.eql($INITIALIZED) || pcase_var.eql($DONE_WITH_SENTENCE)) {
            return $FIND_OR_CREATE_PEGS_FOR_SENTENCE;
        }
        if (pcase_var.eql($CREATED_OR_FOUND_SENTENCE_PEGS)) {
            return $ASSERT_LINKAGE;
        }
        if (pcase_var.eql($ASSERTED_LINKAGE)) {
            return $ASSERT_PARSE_TREE_FOR_LINKAGE;
        }
        if (pcase_var.eql($ASSERTED_PARSE_TREE_FOR_LINKAGE)) {
            return $ADD_PARSING_RESULTS;
        }
        if (pcase_var.eql($PARSED)) {
            return $FINALIZE_SENTENCE;
        }
        if (pcase_var.eql($DONE_WITH_ALL_SENTENCES)) {
            return $COLLECT_GARBAGE;
        }
        return NIL;
    }

    public static SubLObject destroy_l2r_paragraph_reader(final SubLObject reader) {
        return reader;
    }

    public static SubLObject updating_l2r_paragraph_reader_times(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject reader = NIL;
        destructuring_bind_must_consp(current, datum, $list120);
        reader = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject this_time = $sym121$THIS_TIME;
            final SubLObject this_cpu_time = $sym122$THIS_CPU_TIME;
            return list(new SubLObject[]{ CLET, list(this_time, this_cpu_time), list(L2R_COMPUTING_CPU_TIME, this_cpu_time, listS(CTIME, this_time, append(body, NIL))), list(FORMAT, T, $str125$__This_step_took__A___A_of_CPU_ti, listS(L2R_READABLE_TIME_STRING, this_time, $list127), listS(FIF, list(NUMBERP, this_cpu_time), listS(L2R_READABLE_TIME_STRING, this_cpu_time, $list130), $list131)), list(CINC, list(L2R_PARAGRAPH_READER_TOTAL_TIME, reader), this_time), list(CINC, list(L2R_PARAGRAPH_READER_SENTENCE_TIME, reader), this_time), list(PWHEN, this_cpu_time, list(CINC, list(L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, reader), this_cpu_time), list(CINC, list(L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, reader), this_cpu_time)), list(FORMAT, T, $str134$__Total_time_for_this_sentence___, listS(L2R_READABLE_TIME_STRING, list(L2R_PARAGRAPH_READER_SENTENCE_TIME, reader), $list127), listS(L2R_READABLE_TIME_STRING, list(L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, reader), $list130)), list(FORMAT, T, $str135$__Total_time_for_this_reader___A_, listS(L2R_READABLE_TIME_STRING, list(L2R_PARAGRAPH_READER_TOTAL_TIME, reader), $list127), listS(L2R_READABLE_TIME_STRING, list(L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, reader), $list130)) });
        }
        cdestructuring_bind_error(datum, $list120);
        return NIL;
    }

    public static SubLObject with_temporary_transmit_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list136);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = NIL;
        destructuring_bind_must_consp(current, datum, $list136);
        state = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject old_transmit_state = $sym137$OLD_TRANSMIT_STATE;
            return list(CLET, list(bq_cons(old_transmit_state, $list138)), list(CUNWIND_PROTECT, listS(PROGN, list(SET_TRANSMIT_STATE, state), append(body, NIL)), list(SET_TRANSMIT_STATE, old_transmit_state)));
        }
        cdestructuring_bind_error(datum, $list136);
        return NIL;
    }

    public static SubLObject with_temporary_receive_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list136);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject state = NIL;
        destructuring_bind_must_consp(current, datum, $list136);
        state = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject old_receive_state = $sym142$OLD_RECEIVE_STATE;
            return list(CLET, list(bq_cons(old_receive_state, $list143)), list(CUNWIND_PROTECT, listS(PROGN, list(SET_RECEIVE_STATE, state), append(body, NIL)), list(SET_RECEIVE_STATE, old_receive_state)));
        }
        cdestructuring_bind_error(datum, $list136);
        return NIL;
    }

    public static SubLObject reset_l2r_paragraph_reader_sentence_times(final SubLObject reader) {
        _csetf_l2r_paragraph_reader_sentence_time(reader, ZERO_INTEGER);
        _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, ZERO_INTEGER);
        return reader;
    }

    public static SubLObject new_l2r_reading_event_for_document(final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reading_event = NIL;
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(NIL != $l2r_transmit_operationsP$.getDynamicValue(thread) ? $$$transmit : $$$store);
            reading_event = l2r_create($$$ReadingEvent);
            l2r_assert(listS($$isa, reading_event, $list149), $$UniversalVocabularyMt);
            l2r_assert(list($$startingDate, reading_event, date_utilities.indexical_now()), $$UniversalVocabularyMt);
            l2r_assert(list($$pcwRead, reading_event, v_document), $$LearnByReadingDocumentDataMt);
            l2r_assert(listS($$performedBy, reading_event, $list155), $$LearnByReadingDocumentDataMt);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return reading_event;
    }

    public static SubLObject find_unfinished_l2r_reading_event_for_document(final SubLObject v_document) {
        return ask_utilities.query_variable($sym156$_READING, listS($$and, $list158, list($$pcwRead, $sym156$_READING, v_document), $list159), $$InferencePSC, UNPROVIDED).first();
    }

    public static SubLObject note_l2r_reading_event_ongoing(final SubLObject reading_event) {
        final SubLObject now = date_utilities.indexical_now();
        l2r_assert(list($$temporallySubsumes, reading_event, now), $$UniversalVocabularyMt);
        final SubLObject pred_var = $$temporallySubsumes;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reading_event, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reading_event, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$6 = NIL;
                        final SubLObject token_var_$7 = NIL;
                        while (NIL == done_var_$6) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                            final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(gaf));
                            if ((NIL != valid_$8) && (!assertions_high.gaf_arg2(gaf).equal(now))) {
                                l2r_unassert_assertion(gaf);
                            }
                            done_var_$6 = makeBoolean(NIL == valid_$8);
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
        return reading_event;
    }

    public static SubLObject note_l2r_reading_event_done(final SubLObject reading_event) {
        final SubLObject now = date_utilities.indexical_now();
        l2r_assert(list($$endingDate, reading_event, now), $$UniversalVocabularyMt);
        final SubLObject pred_var = $$temporallySubsumes;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reading_event, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reading_event, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$9 = NIL;
                        final SubLObject token_var_$10 = NIL;
                        while (NIL == done_var_$9) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                            final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(gaf));
                            if (NIL != valid_$11) {
                                l2r_unassert_assertion(gaf);
                            }
                            done_var_$9 = makeBoolean(NIL == valid_$11);
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
        return reading_event;
    }

    public static SubLObject l2r_paragraph_reader_find_or_create_pegs_for_sentence(final SubLObject reader) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = aref(l2r_paragraph_reader_sentence_vector(reader), l2r_paragraph_reader_sentence_number(reader));
        _csetf_l2r_paragraph_reader_sentence_number(reader, add(l2r_paragraph_reader_sentence_number(reader), ONE_INTEGER));
        reset_l2r_paragraph_reader_sentence_times(reader);
        SubLObject this_time = NIL;
        SubLObject this_cpu_time = NIL;
        final SubLObject start = l2r_image_elapsed_cpu_time();
        final SubLObject time_var = get_internal_real_time();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state($$$none);
            final SubLObject old_receive_state = operation_communication.get_receive_state(UNPROVIDED);
            try {
                operation_communication.set_receive_state($$$no);
                final SubLObject sentence_html_text = document.sentence_string(sentence);
                final SubLObject sentence_non_html_text = evaluation_defns.cyc_remove_html_tags(sentence_html_text);
                final SubLObject sentence_string_number = number_utilities.f_1X(count(sentence_non_html_text, l2r_paragraph_reader_sentence_non_html_texts(reader), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                final SubLObject sentence_peg = l2r_find_or_reify_peg_for_sentence_string(sentence_non_html_text, l2r_paragraph_reader_document(reader), l2r_paragraph_reader_paragraph(reader), l2r_paragraph_reader_sentence_number(reader), sentence_string_number);
                final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_allowed_rules$.bind(l2r_sentence_level_peg_creation_rules(), thread);
                    l2r_assert_source_html(sentence_peg, sentence_html_text, list($$InterpretingDocumentMtFn, l2r_paragraph_reader_document(reader)), UNPROVIDED);
                    l2r_assert_subexpression_links(sentence, sentence_peg, l2r_paragraph_reader_document(reader));
                } finally {
                    kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                }
                _csetf_l2r_paragraph_reader_sentence_pegs(reader, cons(sentence_peg, l2r_paragraph_reader_sentence_pegs(reader)));
                _csetf_l2r_paragraph_reader_sentence_non_html_texts(reader, cons(sentence_non_html_text, l2r_paragraph_reader_sentence_non_html_texts(reader)));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    operation_communication.set_receive_state(old_receive_state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (NIL != start) ? l2r_image_elapsed_cpu_time() : NIL;
        this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
        format(T, $str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : $$$unknown_amount);
        _csetf_l2r_paragraph_reader_total_time(reader, add(l2r_paragraph_reader_total_time(reader), this_time));
        _csetf_l2r_paragraph_reader_sentence_time(reader, add(l2r_paragraph_reader_sentence_time(reader), this_time));
        if (NIL != this_cpu_time) {
            _csetf_l2r_paragraph_reader_total_cpu_time(reader, add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        format(T, $str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
        format(T, $str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        _csetf_l2r_paragraph_reader_state(reader, $CREATED_OR_FOUND_SENTENCE_PEGS);
        return l2r_paragraph_reader_sentence_pegs(reader).first();
    }

    public static SubLObject l2r_paragraph_reader_find_or_assert_linkage(final SubLObject reader) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_peg = l2r_paragraph_reader_sentence_pegs(reader).first();
        SubLObject linkage_or_linkage_fort = NIL;
        SubLObject content_mt = NIL;
        SubLObject this_time = NIL;
        SubLObject this_cpu_time = NIL;
        final SubLObject start = l2r_image_elapsed_cpu_time();
        final SubLObject time_var = get_internal_real_time();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state($$$none);
            thread.resetMultipleValues();
            final SubLObject linkage_or_linkage_fort_$12 = l2r_find_or_assert_linkage_for_peg(sentence_peg);
            final SubLObject content_mt_$13 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            linkage_or_linkage_fort = linkage_or_linkage_fort_$12;
            content_mt = content_mt_$13;
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (NIL != start) ? l2r_image_elapsed_cpu_time() : NIL;
        this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
        format(T, $str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : $$$unknown_amount);
        _csetf_l2r_paragraph_reader_total_time(reader, add(l2r_paragraph_reader_total_time(reader), this_time));
        _csetf_l2r_paragraph_reader_sentence_time(reader, add(l2r_paragraph_reader_sentence_time(reader), this_time));
        if (NIL != this_cpu_time) {
            _csetf_l2r_paragraph_reader_total_cpu_time(reader, add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        format(T, $str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
        format(T, $str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        if ((NIL != linkage.linkage_p(linkage_or_linkage_fort)) && (NIL != content_mt)) {
            final SubLObject linkage_fort = kb_mapping_utilities.fpred_value_in_any_mt(content_mt, $$contentMtOfLinkage, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            _csetf_l2r_paragraph_reader_linkage(reader, linkage_or_linkage_fort);
            _csetf_l2r_paragraph_reader_linkage_fort(reader, linkage_fort);
            _csetf_l2r_paragraph_reader_state(reader, $ASSERTED_LINKAGE);
        } else
            if ((NIL != forts.fort_p(linkage_or_linkage_fort)) && (NIL != content_mt)) {
                _csetf_l2r_paragraph_reader_linkage_fort(reader, linkage_or_linkage_fort);
                _csetf_l2r_paragraph_reader_state(reader, $ASSERTED_PARSE_TREE_FOR_LINKAGE);
            }

        return sentence_peg;
    }

    public static SubLObject l2r_paragraph_reader_maybe_assert_parse_tree_for_linkage(final SubLObject reader) {
        final SubLObject v_linkage = l2r_paragraph_reader_linkage(reader);
        final SubLObject linkage_fort = l2r_paragraph_reader_linkage_fort(reader);
        final SubLObject content_mt = linkage_assertion.content_mt_of_linkage(cycl_utilities.hl_to_el(linkage_fort));
        final SubLObject tokenization = kb_mapping_utilities.fpred_value_in_any_mt(linkage_fort, $$linkageTokenization, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == v_linkage) {
            Errors.warn($str170$Couldn_t_find_linkage_for__S, reader);
        } else
            if (NIL == linkage_fort) {
                Errors.warn($str171$Couldn_t_find_linkage_FORT_for__S, reader);
            } else
                if (NIL == content_mt) {
                    Errors.warn($str172$Couldn_t_find_content_mt_for__S, linkage_fort);
                } else
                    if (NIL == tokenization) {
                        Errors.warn($str173$Couldn_t_find_tokenization_for__S, linkage_fort);
                    } else
                        if (NIL != l2r_tokenization_has_parse_treeP(tokenization, content_mt)) {
                            _csetf_l2r_paragraph_reader_state(reader, $ASSERTED_PARSE_TREE_FOR_LINKAGE);
                        } else {
                            SubLObject this_time = NIL;
                            SubLObject this_cpu_time = NIL;
                            final SubLObject start = l2r_image_elapsed_cpu_time();
                            final SubLObject time_var = get_internal_real_time();
                            final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                            try {
                                operation_communication.set_transmit_state($$$none);
                                l2r_assert_parse_tree_for_linkage(v_linkage, tokenization, content_mt);
                            } finally {
                                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values = getValuesAsVector();
                                    operation_communication.set_transmit_state(old_transmit_state);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                            this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                            final SubLObject end = (NIL != start) ? l2r_image_elapsed_cpu_time() : NIL;
                            this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
                            format(T, $str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : $$$unknown_amount);
                            _csetf_l2r_paragraph_reader_total_time(reader, add(l2r_paragraph_reader_total_time(reader), this_time));
                            _csetf_l2r_paragraph_reader_sentence_time(reader, add(l2r_paragraph_reader_sentence_time(reader), this_time));
                            if (NIL != this_cpu_time) {
                                _csetf_l2r_paragraph_reader_total_cpu_time(reader, add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
                                _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
                            }
                            format(T, $str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
                            format(T, $str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
                            _csetf_l2r_paragraph_reader_state(reader, $ASSERTED_PARSE_TREE_FOR_LINKAGE);
                        }




        return NIL;
    }

    public static SubLObject l2r_tokenization_has_parse_treeP(final SubLObject tokenization, final SubLObject content_mt) {
        return list_utilities.sublisp_boolean(inference_kernel.new_cyc_query(listS($$and, list($$ist_Asserted, content_mt, list($$parseTreeOfTokenization, $sym176$_PARSE_TREE, tokenization)), $list177), $$InferencePSC, UNPROVIDED));
    }

    public static SubLObject l2r_paragraph_reader_maybe_add_parsing_results(final SubLObject reader) {
        final SubLObject sentence_peg = l2r_paragraph_reader_sentence_pegs(reader).first();
        if ((NIL == isa.isa_in_any_mtP(sentence_peg, $$LinguisticObject_NoParseAvailable)) && (NIL == kb_mapping_utilities.some_pred_value_in_any_mt(sentence_peg, $$pegInterpretationMts, ONE_INTEGER, UNPROVIDED))) {
            l2r_paragraph_reader_add_parsing_results(reader);
        }
        _csetf_l2r_paragraph_reader_state(reader, $PARSED);
        return sentence_peg;
    }

    public static SubLObject l2r_paragraph_reader_add_parsing_results(final SubLObject reader) {
        final SubLObject sentence_peg = l2r_paragraph_reader_sentence_pegs(reader).first();
        format(T, $str180$__Asserting_Cyclifier_results_for, sentence_peg);
        SubLObject this_time = NIL;
        SubLObject this_cpu_time = NIL;
        final SubLObject start = l2r_image_elapsed_cpu_time();
        final SubLObject time_var = get_internal_real_time();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state($$$none);
            parsing_utilities.get_cyclifier_interps_for_expression_peg(sentence_peg);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (NIL != start) ? l2r_image_elapsed_cpu_time() : NIL;
        this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
        format(T, $str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : $$$unknown_amount);
        _csetf_l2r_paragraph_reader_total_time(reader, add(l2r_paragraph_reader_total_time(reader), this_time));
        _csetf_l2r_paragraph_reader_sentence_time(reader, add(l2r_paragraph_reader_sentence_time(reader), this_time));
        if (NIL != this_cpu_time) {
            _csetf_l2r_paragraph_reader_total_cpu_time(reader, add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        format(T, $str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
        format(T, $str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        return sentence_peg;
    }

    public static SubLObject l2r_paragraph_reader_finalize_sentence(final SubLObject reader) {
        SubLObject this_time = NIL;
        SubLObject this_cpu_time = NIL;
        final SubLObject start = l2r_image_elapsed_cpu_time();
        final SubLObject time_var = get_internal_real_time();
        l2r_finalize_sentence_peg(l2r_paragraph_reader_sentence_pegs(reader));
        this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (NIL != start) ? l2r_image_elapsed_cpu_time() : NIL;
        this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
        format(T, $str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : $$$unknown_amount);
        _csetf_l2r_paragraph_reader_total_time(reader, add(l2r_paragraph_reader_total_time(reader), this_time));
        _csetf_l2r_paragraph_reader_sentence_time(reader, add(l2r_paragraph_reader_sentence_time(reader), this_time));
        if (NIL != this_cpu_time) {
            _csetf_l2r_paragraph_reader_total_cpu_time(reader, add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        format(T, $str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
        format(T, $str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        format(T, $str181$__Read_sentence___S_in__A___A_of_, new SubLObject[]{ l2r_paragraph_reader_sentence_number(reader), l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), UNPROVIDED), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER) });
        final SubLObject new_assertion_count = assertion_handles.assertion_count();
        format(T, $str182$__After__S_sentences__assertion_c, new SubLObject[]{ l2r_paragraph_reader_sentence_number(reader), subtract(new_assertion_count, l2r_paragraph_reader_initial_assertion_count(reader)), l2r_paragraph_reader_initial_assertion_count(reader), new_assertion_count });
        write_l2r_image_for_document(l2r_paragraph_reader_document(reader), NIL);
        _csetf_l2r_paragraph_reader_state(reader, NIL != list_utilities.lengthG(l2r_paragraph_reader_sentence_vector(reader), l2r_paragraph_reader_sentence_number(reader), UNPROVIDED) ? $DONE_WITH_SENTENCE : $DONE_WITH_ALL_SENTENCES);
        return reader;
    }

    public static SubLObject l2r_finalize_sentence_peg(final SubLObject sentence_pegs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $l2r_finalization_problem_store$.currentBinding(thread);
        try {
            $l2r_finalization_problem_store$.bind(NIL, thread);
            try {
                $l2r_finalization_problem_store$.setDynamicValue(inference_datastructures_problem_store.new_problem_store(NIL), thread);
                l2r_assert_sentence_peg_results(sentence_pegs.first());
                SubLObject cdolist_list_var = sentence_pegs.rest();
                SubLObject previous_sentence_peg = NIL;
                previous_sentence_peg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    l2r_assert_distillation_query_results(previous_sentence_peg);
                    cdolist_list_var = cdolist_list_var.rest();
                    previous_sentence_peg = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    inference_datastructures_problem_store.destroy_problem_store($l2r_finalization_problem_store$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            $l2r_finalization_problem_store$.rebind(_prev_bind_0, thread);
        }
        return sentence_pegs;
    }

    public static SubLObject l2r_paragraph_reader_collect_garbage(final SubLObject reader) {
        SubLObject this_time = NIL;
        SubLObject this_cpu_time = NIL;
        final SubLObject start = l2r_image_elapsed_cpu_time();
        final SubLObject time_var = get_internal_real_time();
        l2r_collect_garbage_for_sentence_pegs(l2r_paragraph_reader_sentence_pegs(reader));
        this_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject end = (NIL != start) ? l2r_image_elapsed_cpu_time() : NIL;
        this_cpu_time = (NIL != end) ? subtract(end, start) : NIL;
        format(T, $str125$__This_step_took__A___A_of_CPU_ti, l2r_readable_time_string(this_time, TWO_INTEGER), this_cpu_time.isNumber() ? l2r_readable_time_string(this_cpu_time, ZERO_INTEGER) : $$$unknown_amount);
        _csetf_l2r_paragraph_reader_total_time(reader, add(l2r_paragraph_reader_total_time(reader), this_time));
        _csetf_l2r_paragraph_reader_sentence_time(reader, add(l2r_paragraph_reader_sentence_time(reader), this_time));
        if (NIL != this_cpu_time) {
            _csetf_l2r_paragraph_reader_total_cpu_time(reader, add(l2r_paragraph_reader_total_cpu_time(reader), this_cpu_time));
            _csetf_l2r_paragraph_reader_sentence_cpu_time(reader, add(l2r_paragraph_reader_sentence_cpu_time(reader), this_cpu_time));
        }
        format(T, $str134$__Total_time_for_this_sentence___, l2r_readable_time_string(l2r_paragraph_reader_sentence_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_sentence_cpu_time(reader), ZERO_INTEGER));
        format(T, $str135$__Total_time_for_this_reader___A_, l2r_readable_time_string(l2r_paragraph_reader_total_time(reader), TWO_INTEGER), l2r_readable_time_string(l2r_paragraph_reader_total_cpu_time(reader), ZERO_INTEGER));
        _csetf_l2r_paragraph_reader_state(reader, $EXHAUSTED);
        return reader;
    }

    public static SubLObject l2r_collect_garbage_for_sentence_pegs(final SubLObject sentence_pegs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $l2r_finalization_problem_store$.currentBinding(thread);
        try {
            $l2r_finalization_problem_store$.bind(NIL, thread);
            try {
                $l2r_finalization_problem_store$.setDynamicValue(inference_datastructures_problem_store.new_problem_store(NIL), thread);
                final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
                try {
                    operation_communication.set_transmit_state(NIL != $l2r_transmit_operationsP$.getDynamicValue(thread) ? $$$transmit : $$$store);
                    SubLObject cdolist_list_var = sentence_pegs;
                    SubLObject sentence_peg = NIL;
                    sentence_peg = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$15 = l2r_garbage_collection_query_specs();
                        SubLObject query_spec = NIL;
                        query_spec = cdolist_list_var_$15.first();
                        while (NIL != cdolist_list_var_$15) {
                            l2r_assert_query_spec_results_for_sentence_peg(query_spec, sentence_peg);
                            cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                            query_spec = cdolist_list_var_$15.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        sentence_peg = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        operation_communication.set_transmit_state(old_transmit_state);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    inference_datastructures_problem_store.destroy_problem_store($l2r_finalization_problem_store$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        } finally {
            $l2r_finalization_problem_store$.rebind(_prev_bind_0, thread);
        }
        return sentence_pegs;
    }

    public static SubLObject l2r_read_paragraph_internal(final SubLObject paragraph, final SubLObject v_document, SubLObject reading_event, SubLObject reader) {
        if (reading_event == UNPROVIDED) {
            reading_event = NIL;
        }
        if (reader == UNPROVIDED) {
            reader = new_l2r_paragraph_reader(paragraph, v_document);
        }
        while (NIL != l2r_paragraph_reader_next_action(reader)) {
            l2r_paragraph_reader_next(reader);
            if (NIL != cycl_grammar.cycl_denotational_term_p(reading_event)) {
                note_l2r_reading_event_ongoing(reading_event);
            }
        } 
        final SubLObject pegs = nreverse(l2r_paragraph_reader_sentence_pegs(reader));
        final SubLObject texts = nreverse(l2r_paragraph_reader_sentence_non_html_texts(reader));
        return values(pegs, texts);
    }

    public static SubLObject l2r_assert_sentence_peg_results(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(NIL != $l2r_transmit_operationsP$.getDynamicValue(thread) ? $$$transmit : $$$store);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                SubLObject cdolist_list_var = l2r_finalization_query_specs();
                SubLObject query_spec = NIL;
                query_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    l2r_assert_query_spec_results_for_sentence_peg(query_spec, sentence_peg);
                    cdolist_list_var = cdolist_list_var.rest();
                    query_spec = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return sentence_peg;
    }

    public static SubLObject l2r_assert_query_spec_results_for_sentence_peg(final SubLObject query_spec, final SubLObject sentence_peg) {
        SubLObject cdolist_list_var;
        final SubLObject new_terms = cdolist_list_var = l2r_run_finalization_query_for_sentence_peg(query_spec, sentence_peg);
        SubLObject new_term = NIL;
        new_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != constant_p(new_term)) {
                fi.fi_eval(list(CYC_FIND_OR_CREATE_NEW_PERMANENT, constants_high.constant_name(new_term)));
            } else
                if (NIL != ist_sentence_p(new_term, UNPROVIDED)) {
                    l2r_assert(new_term, UNPROVIDED);
                } else {
                    Errors.warn($str185$Don_t_know_what_to_do_with_finali, new_term);
                }

            cdolist_list_var = cdolist_list_var.rest();
            new_term = cdolist_list_var.first();
        } 
        return query_spec;
    }

    public static SubLObject l2r_assert_distillation_query_results(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(NIL != $l2r_transmit_operationsP$.getDynamicValue(thread) ? $$$transmit : $$$store);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                SubLObject cdolist_list_var = l2r_distillation_query_specs();
                SubLObject query_spec = NIL;
                query_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$18;
                    final SubLObject new_terms = cdolist_list_var_$18 = l2r_run_finalization_query_for_sentence_peg(query_spec, sentence_peg);
                    SubLObject new_term = NIL;
                    new_term = cdolist_list_var_$18.first();
                    while (NIL != cdolist_list_var_$18) {
                        if (NIL != constant_p(new_term)) {
                            fi.fi_eval(list(CYC_FIND_OR_CREATE_NEW_PERMANENT, constants_high.constant_name(new_term)));
                        } else
                            if (NIL != ist_sentence_p(new_term, UNPROVIDED)) {
                                format(T, $str186$__Asserting_distillation_sentence, new_term);
                                l2r_assert(new_term, UNPROVIDED);
                            } else {
                                Errors.warn($str185$Don_t_know_what_to_do_with_finali, new_term);
                            }

                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                        new_term = cdolist_list_var_$18.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    query_spec = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return sentence_peg;
    }

    public static SubLObject l2r_finalization_query_specs() {
        final SubLObject kbq = $const187$TextLearnerQuery_WhatAreTheRequir;
        final SubLObject el_list = (NIL != valid_constantP(kbq, UNPROVIDED)) ? kb_query.new_cyc_query_from_kbq(kbq, UNPROVIDED, UNPROVIDED).first() : NIL;
        return NIL != el_list ? remove(NIL, Mapping.mapcar(KBQ_FROM_QUERY_RUNNING, el_list_items(el_list)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject l2r_garbage_collection_query_specs() {
        return isa.all_fort_instances_in_all_mts($const189$TextLearnerGarbageCollectionQuery);
    }

    public static SubLObject l2r_distillation_query_specs() {
        return isa.all_fort_instances_in_all_mts($const190$TextLearnerDisambiguationResultsD);
    }

    public static SubLObject kbq_from_query_running(final SubLObject query_running) {
        return kb_mapping_utilities.fpred_value_in_any_mt(query_running, $$cycLQueryTypeSpecification, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static SubLObject l2r_run_finalization_query_for_sentence_peg(final SubLObject query_spec, final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject indexical_sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject sentence_peg_indexical = $list192;
        final SubLObject dereferenced = cycl_utilities.expression_subst(sentence_peg, sentence_peg_indexical, indexical_sentence, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject mt = kb_query.kbq_mt(query_spec);
        final SubLObject v_properties = putf(kb_query.kbq_query_properties(query_spec), $PROBLEM_STORE, $l2r_finalization_problem_store$.getDynamicValue(thread));
        return inference_kernel.new_cyc_query(dereferenced, mt, v_properties);
    }

    public static SubLObject l2r_print_total_time(final SubLObject total_time, final SubLObject sentence_count, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        format(stream, $str194$__Read__S_sentences_in__A___, sentence_count, l2r_readable_time_string(total_time, UNPROVIDED));
        return total_time;
    }

    public static SubLObject l2r_readable_time_string(final SubLObject seconds, SubLObject decimal_precision) {
        if (decimal_precision == UNPROVIDED) {
            decimal_precision = TWO_INTEGER;
        }
        return numeric_date_utilities.readable_elapsed_time_string(seconds, decimal_precision);
    }

    public static SubLObject launch_long_inference_warner() {
        return process_utilities.make_cyc_server_process_with_args($$$Long_Inference_Warner, WARN_ABOUT_LONG_INFERENCES, UNPROVIDED);
    }

    public static SubLObject warn_about_long_inferences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (true) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject current_long_inference = $current_long_inference_info$.getDynamicValue(thread).first();
                        final SubLObject current_inference_runningP = inference_datastructures_inference.running_inference_p(current_long_inference);
                        final SubLObject inference = (NIL != current_inference_runningP) ? current_long_inference : inference_utilities.latest_inference();
                        final SubLObject elapsed_time = (NIL != inference_datastructures_inference.running_inference_p(inference)) ? inference_datastructures_inference.inference_elapsed_universal_time_since_start(inference) : ZERO_INTEGER;
                        if ((NIL != $current_long_inference_info$.getDynamicValue(thread)) && (!inference.eql($current_long_inference_info$.getDynamicValue(thread).first()))) {
                            Errors.warn($str200$_S_finished_after__A_with__S_answ, current_long_inference, l2r_readable_time_string(second($current_long_inference_info$.getDynamicValue(thread)), UNPROVIDED), third($current_long_inference_info$.getDynamicValue(thread)));
                            $current_long_inference_info$.setDynamicValue(NIL, thread);
                        }
                        if (!elapsed_time.numL($long_inference_cutoff$.getGlobalValue())) {
                            if (inference.eql($current_long_inference_info$.getDynamicValue(thread).first())) {
                                rplacd($current_long_inference_info$.getDynamicValue(thread), list(elapsed_time, inference_datastructures_inference.inference_answer_count(inference)));
                            } else {
                                Errors.warn($str201$_S_has_taken__A_so_far____HL_quer, new SubLObject[]{ inference, l2r_readable_time_string(elapsed_time, UNPROVIDED), inference_datastructures_inference.inference_hl_query(inference), inference_datastructures_inference.inference_answer_count(inference) });
                                $current_long_inference_info$.setDynamicValue(list(inference, elapsed_time, inference_datastructures_inference.inference_answer_count(inference)), thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            sleep(divide($long_inference_cutoff$.getGlobalValue(), TWO_INTEGER));
        } 
    }

    public static SubLObject l2r_read_document_sentence(final SubLObject sentence, final SubLObject v_document) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(sentence) : "cycl_grammar.cycl_denotational_term_p(sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(sentence) " + sentence;
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) " + v_document;
        final SubLObject sentence_peg = l2r_reify_peg_for_sentence(sentence, v_document);
        final SubLObject result = l2r_read_sentence_for_peg(sentence_peg);
        write_l2r_image_for_document(v_document, NIL);
        return result;
    }

    public static SubLObject l2r_read_sentence_for_peg(final SubLObject sentence_peg) {
        l2r_assert_linkage_for_peg(sentence_peg);
        format(T, $str180$__Asserting_Cyclifier_results_for, sentence_peg);
        parsing_utilities.get_cyclifier_interps_for_expression_peg(sentence_peg);
        return sentence_peg;
    }

    public static SubLObject l2r_find_or_assert_linkage_for_peg(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(sentence_peg) : "kb_indexing_datastructures.indexed_term_p(sentence_peg) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(sentence_peg) " + sentence_peg;
        thread.resetMultipleValues();
        SubLObject v_linkage = l2r_find_linkage_for_peg(sentence_peg);
        SubLObject content_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == v_linkage) || (NIL == content_mt)) {
            thread.resetMultipleValues();
            final SubLObject v_linkage_$19 = l2r_assert_linkage_for_peg(sentence_peg);
            final SubLObject content_mt_$20 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_linkage = v_linkage_$19;
            content_mt = content_mt_$20;
        }
        return values(v_linkage, content_mt);
    }

    public static SubLObject l2r_find_linkage_for_peg(final SubLObject sentence_peg) {
        assert NIL != indexed_term_p(sentence_peg) : "kb_indexing_datastructures.indexed_term_p(sentence_peg) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(sentence_peg) " + sentence_peg;
        final SubLObject tokenization = l2r_find_tokenization_for_peg(sentence_peg);
        final SubLObject linkage_fort = (NIL != indexed_term_p(tokenization)) ? kb_mapping_utilities.fpred_value_in_any_mt(tokenization, $$linkageTokenization, TWO_INTEGER, ONE_INTEGER, UNPROVIDED) : NIL;
        final SubLObject content_mt = (NIL != linkage_fort) ? linkage_assertion.content_mt_of_linkage(cycl_utilities.hl_to_el(linkage_fort)) : NIL;
        return NIL != l2r_tokenization_has_parse_treeP(tokenization, content_mt) ? values(linkage_fort, content_mt) : values(NIL, NIL);
    }

    public static SubLObject l2r_assert_linkage_for_peg(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(sentence_peg) : "kb_indexing_datastructures.indexed_term_p(sentence_peg) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(sentence_peg) " + sentence_peg;
        cb_wordnet_utilities.ensure_wn_sks_registered();
        SubLObject v_linkage = NIL;
        SubLObject content_mt = NIL;
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state($$$none);
            final SubLObject sentence_text = l2r_sentence_peg_text(sentence_peg);
            final SubLObject linkage_tokenization = l2r_new_tokenization_shell_for_peg(sentence_peg, sentence_text);
            final SubLObject _prev_bind_0 = parsing_vars.$linkage_creation_rules$.currentBinding(thread);
            try {
                parsing_vars.$linkage_creation_rules$.bind(l2r_linkage_creation_rules(), thread);
                final SubLObject link_parse_options = putf(copy_list(linkage.$link_parse_options$.getDynamicValue(thread)), $MAX_PARSE_TIME, $int$180);
                format(T, $str205$__Asserting_linkage_for__S___S___, sentence_peg, sentence_text);
                thread.resetMultipleValues();
                final SubLObject v_linkage_$21 = linkage_assertion.assert_linkage(sentence_text, NIL, NIL, linkage_tokenization, link_parse_options);
                final SubLObject content_mt_$22 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                v_linkage = v_linkage_$21;
                content_mt = content_mt_$22;
            } finally {
                parsing_vars.$linkage_creation_rules$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return values(v_linkage, content_mt);
    }

    public static SubLObject l2r_assert_parse_tree_for_linkage(final SubLObject v_linkage, final SubLObject tokenization, final SubLObject content_mt) {
        return linkage_assertion.assert_link_parse_tree(v_linkage, tokenization, content_mt);
    }

    public static SubLObject l2r_linkage_creation_rules() {
        return forward.creation_template_allowable_rules($$L2RLinkageReificationTemplate);
    }

    public static SubLObject l2r_new_tokenization_shell_for_peg(final SubLObject sentence_peg, final SubLObject sentence_text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokenization = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
            tokenization = l2r_create($$$Tokenization);
            l2r_assert(listS($$isa, tokenization, $list208), $$UniversalVocabularyMt);
            l2r_assert(list($$tokenizationInputString, tokenization, sentence_text), UNPROVIDED);
            l2r_assert(list($$pegTokenizations, sentence_peg, tokenization), list($$ContentModelForPegFn, sentence_peg));
        } finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return tokenization;
    }

    public static SubLObject l2r_find_tokenization_for_peg(final SubLObject sentence_peg) {
        return ask_utilities.query_variable($sym212$_TOKENIZATION, listS($$pegTokenizations, sentence_peg, $list213), list($$ContentModelForPegFn, sentence_peg), UNPROVIDED).first();
    }

    public static SubLObject l2r_sentence_peg_text(final SubLObject sentence_peg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject text = parsing_utilities.peg_text(sentence_peg);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == unicode_nauts.string_or_unicode_naut_p(text))) {
            Errors.error($str214$Couldn_t_find_string_for__S, sentence_peg);
        }
        return text;
    }

    public static SubLObject l2r_reader_image_find_or_create_document_reader() {
        SubLObject document_reader = get_l2r_reader_image_document_reader();
        if (NIL == l2r_document_reader_p(document_reader)) {
            final SubLObject v_document = l2r_pick_document_to_read();
            if (NIL == cycl_grammar.cycl_denotational_term_p(v_document)) {
                Errors.warn($str215$Couldn_t_find_L2R_document_to_rea);
                return NIL;
            }
            document_reader = l2r_new_reader_for_document(v_document);
        }
        return document_reader;
    }

    public static SubLObject l2r_new_reader_for_document(final SubLObject v_document) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) " + v_document;
        final SubLObject existing_reading_event = find_unfinished_l2r_reading_event_for_document(v_document);
        final SubLObject reading_event = (NIL != existing_reading_event) ? existing_reading_event : new_l2r_reading_event_for_document(v_document);
        final SubLObject document_reader = new_l2r_document_reader(v_document, reading_event);
        return document_reader;
    }

    public static SubLObject l2r_document_reader_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_l2r_document_reader(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject l2r_document_reader_p(final SubLObject v_object) {
        return v_object.getClass() == learning_reader.$l2r_document_reader_native.class ? T : NIL;
    }

    public static SubLObject l2r_document_reader_document(final SubLObject v_object) {
        assert NIL != l2r_document_reader_p(v_object) : "learning_reader.l2r_document_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_document_reader_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject l2r_document_reader_remaining_paragraphs(final SubLObject v_object) {
        assert NIL != l2r_document_reader_p(v_object) : "learning_reader.l2r_document_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_document_reader_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject l2r_document_reader_read_paragraphs(final SubLObject v_object) {
        assert NIL != l2r_document_reader_p(v_object) : "learning_reader.l2r_document_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_document_reader_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject l2r_document_reader_paragraph_reader(final SubLObject v_object) {
        assert NIL != l2r_document_reader_p(v_object) : "learning_reader.l2r_document_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_document_reader_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject l2r_document_reader_reading_event(final SubLObject v_object) {
        assert NIL != l2r_document_reader_p(v_object) : "learning_reader.l2r_document_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_document_reader_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_l2r_document_reader_document(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_document_reader_p(v_object) : "learning_reader.l2r_document_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_document_reader_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_l2r_document_reader_remaining_paragraphs(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_document_reader_p(v_object) : "learning_reader.l2r_document_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_document_reader_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_l2r_document_reader_read_paragraphs(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_document_reader_p(v_object) : "learning_reader.l2r_document_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_document_reader_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_l2r_document_reader_paragraph_reader(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_document_reader_p(v_object) : "learning_reader.l2r_document_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_document_reader_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_l2r_document_reader_reading_event(final SubLObject v_object, final SubLObject value) {
        assert NIL != l2r_document_reader_p(v_object) : "learning_reader.l2r_document_reader_p(v_object) " + "CommonSymbols.NIL != learning_reader.l2r_document_reader_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_l2r_document_reader(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new learning_reader.$l2r_document_reader_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($DOCUMENT)) {
                _csetf_l2r_document_reader_document(v_new, current_value);
            } else
                if (pcase_var.eql($REMAINING_PARAGRAPHS)) {
                    _csetf_l2r_document_reader_remaining_paragraphs(v_new, current_value);
                } else
                    if (pcase_var.eql($READ_PARAGRAPHS)) {
                        _csetf_l2r_document_reader_read_paragraphs(v_new, current_value);
                    } else
                        if (pcase_var.eql($PARAGRAPH_READER)) {
                            _csetf_l2r_document_reader_paragraph_reader(v_new, current_value);
                        } else
                            if (pcase_var.eql($READING_EVENT)) {
                                _csetf_l2r_document_reader_reading_event(v_new, current_value);
                            } else {
                                Errors.error($str86$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_l2r_document_reader(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_L2R_DOCUMENT_READER, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $DOCUMENT, l2r_document_reader_document(obj));
        funcall(visitor_fn, obj, $SLOT, $REMAINING_PARAGRAPHS, l2r_document_reader_remaining_paragraphs(obj));
        funcall(visitor_fn, obj, $SLOT, $READ_PARAGRAPHS, l2r_document_reader_read_paragraphs(obj));
        funcall(visitor_fn, obj, $SLOT, $PARAGRAPH_READER, l2r_document_reader_paragraph_reader(obj));
        funcall(visitor_fn, obj, $SLOT, $READING_EVENT, l2r_document_reader_reading_event(obj));
        funcall(visitor_fn, obj, $END, MAKE_L2R_DOCUMENT_READER, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_l2r_document_reader_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_l2r_document_reader(obj, visitor_fn);
    }

    public static SubLObject print_l2r_document_reader(final SubLObject reader, final SubLObject stream, final SubLObject depth) {
        format(stream, $str241$_L2R_DOCUMENT_READER__S_, l2r_document_reader_document(reader));
        return NIL;
    }

    public static SubLObject new_l2r_document_reader(final SubLObject v_document, final SubLObject reading_event) {
        final SubLObject reader = make_l2r_document_reader(UNPROVIDED);
        _csetf_l2r_document_reader_document(reader, v_document);
        _csetf_l2r_document_reader_reading_event(reader, reading_event);
        _csetf_l2r_document_reader_remaining_paragraphs(reader, l2r_find_or_create_document_paragraphs(v_document, UNPROVIDED));
        return reader;
    }

    public static SubLObject get_l2r_reader_image_document_reader() {
        return $l2r_reader_image_document_reader$.getGlobalValue();
    }

    public static SubLObject set_l2r_reader_image_document_reader(final SubLObject reader) {
        $l2r_reader_image_document_reader$.setGlobalValue(reader);
        return $l2r_reader_image_document_reader$.getGlobalValue();
    }

    public static SubLObject l2r_document_reader_read_document(final SubLObject document_reader) {
        SubLObject paragraph_reader = l2r_document_reader_find_or_create_paragraph_reader(document_reader);
        final SubLObject reading_event = l2r_document_reader_reading_event(document_reader);
        final SubLObject v_document = l2r_document_reader_document(document_reader);
        while (NIL != l2r_paragraph_reader_p(paragraph_reader)) {
            final SubLObject paragraph = l2r_paragraph_reader_paragraph(paragraph_reader);
            l2r_read_paragraph_internal(paragraph, v_document, reading_event, paragraph_reader);
            _csetf_l2r_document_reader_read_paragraphs(document_reader, cons(paragraph, l2r_document_reader_read_paragraphs(document_reader)));
            _csetf_l2r_document_reader_remaining_paragraphs(document_reader, l2r_document_reader_remaining_paragraphs(document_reader).rest());
            paragraph_reader = l2r_document_reader_get_new_paragraph_reader(document_reader);
        } 
        set_l2r_reader_image_document_reader(NIL);
        write_l2r_image_for_document(v_document, T);
        return document_reader;
    }

    public static SubLObject l2r_document_reader_find_or_create_paragraph_reader(final SubLObject document_reader) {
        SubLObject paragraph_reader = l2r_document_reader_paragraph_reader(document_reader);
        if (NIL == l2r_paragraph_reader_p(paragraph_reader)) {
            paragraph_reader = l2r_document_reader_get_new_paragraph_reader(document_reader);
        }
        return paragraph_reader;
    }

    public static SubLObject l2r_document_reader_get_new_paragraph_reader(final SubLObject document_reader) {
        SubLObject paragraph_reader = NIL;
        final SubLObject remaining_paragraphs = l2r_document_reader_remaining_paragraphs(document_reader);
        if (NIL == list_utilities.empty_list_p(remaining_paragraphs)) {
            final SubLObject paragraph = remaining_paragraphs.first();
            final SubLObject v_document = l2r_document_reader_document(document_reader);
            paragraph_reader = new_l2r_paragraph_reader(paragraph, v_document);
            _csetf_l2r_document_reader_paragraph_reader(document_reader, paragraph_reader);
        }
        return paragraph_reader;
    }

    public static SubLObject l2r_pick_document_to_read() {
        final SubLObject all_articles = kb_query.new_cyc_query_from_kbq($const243$TextLearnerQuery_FindWikipediaArt, UNPROVIDED, UNPROVIDED);
        final SubLObject articles_already_started = list_utilities.find_all_if(FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT, all_articles, UNPROVIDED);
        final SubLObject picked_document = (NIL != list_utilities.non_empty_list_p(articles_already_started)) ? list_utilities.extremal(articles_already_started, $sym245$STARTS_BEFORE_STARTING_OF_, FIND_UNFINISHED_L2R_READING_EVENT_FOR_DOCUMENT) : all_articles.first();
        return picked_document;
    }

    public static SubLObject starts_before_starting_ofP(final SubLObject temp_thing1, final SubLObject temp_thing2) {
        return sbhl_time_modules.starts_after_starting_ofP(temp_thing2, temp_thing1, UNPROVIDED);
    }

    public static SubLObject l2r_image_file(final SubLObject v_document, SubLObject doneP) {
        if (doneP == UNPROVIDED) {
            doneP = NIL;
        }
        final SubLObject machine_name = misc_utilities.machine_name();
        final SubLObject directory = cconcatenate($str246$_host_, new SubLObject[]{ format_nil.format_nil_a_no_copy(machine_name), $str247$_scratch_ });
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        final SubLObject parent_directory = file_utilities.relative_filename(directory, $str249$l2r_images_, UNPROVIDED);
        final SubLObject subdirectory = file_utilities.relative_filename(parent_directory, NIL != doneP ? $str250$done_ : $str251$ongoing_, UNPROVIDED);
        if (NIL == Filesys.directory_p(subdirectory)) {
            file_utilities.make_directory_recursive(subdirectory, NIL, UNPROVIDED);
        }
        if (NIL == Filesys.directory_p(subdirectory)) {
            sleep(ONE_INTEGER);
            assert NIL != Filesys.directory_p(subdirectory) : "Filesys.directory_p(subdirectory) " + "CommonSymbols.NIL != Filesys.directory_p(subdirectory) " + subdirectory;
        }
        final SubLObject document_title = kb_mapping_utilities.fpred_value_in_any_mt(v_document, $$referenceWorkEntryTitle, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject local_filename = Strings.string_downcase(document_title.isString() ? list_utilities.remove_if_not(ALPHA_CHAR_P, document_title, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL != constant_p(v_document) ? constants_high.constant_name(v_document) : list_utilities.remove_if_not(ALPHA_CHAR_P, princ_to_string(v_document), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        return file_utilities.relative_filename(subdirectory, local_filename, $$$load);
    }

    public static SubLObject write_l2r_image_for_document(final SubLObject v_document, SubLObject doneP) {
        if (doneP == UNPROVIDED) {
            doneP = NIL;
        }
        final SubLObject image_file = l2r_image_file(v_document, doneP);
        final SubLObject communication_mode = operation_communication.communication_mode();
        operation_communication.write_cyc_image(image_file, UNPROVIDED);
        operation_communication.set_communication_mode(communication_mode);
        agenda.restart_agenda(UNPROVIDED);
        format(T, $str255$Saved_image_file_to__S, image_file);
        return image_file;
    }

    public static SubLObject l2r_find_or_create_document_paragraphs(final SubLObject v_document, SubLObject download) {
        if (download == UNPROVIDED) {
            download = NIL;
        }
        SubLObject ais = ask_utilities.query_variable($sym256$_AIS, listS($$correspondingAIS, v_document, $list258), $$InferencePSC, $list259).first();
        final SubLObject webpageP = isa.isa_in_any_mtP(v_document, $$WorldWideWebPage_PCW);
        if ((NIL != webpageP) && (NIL == ais)) {
            l2r_assert($list261, UNPROVIDED);
            ais = narts_high.find_nart(list($$AISForFn, v_document));
        }
        if ((NIL != ais) && (NIL != webpageP)) {
            return l2r_find_or_create_webpage_paragraphs(v_document, ais, download);
        }
        Errors.warn($str263$Don_t_know_how_to_read__S_, v_document);
        return NIL;
    }

    public static SubLObject l2r_find_or_create_webpage_paragraphs(final SubLObject webpage_pcw, final SubLObject ais, SubLObject download) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == download) {
            download = l2r_most_recent_webpage_download(ais);
        }
        final SubLObject already_downloadedP = list_utilities.sublisp_boolean(download);
        SubLObject interpretation_mt = narts_high.nart_substitute(list($$InterpretingDocumentMtFn, webpage_pcw));
        SubLObject paragraphs = NIL;
        final SubLObject old_transmit_state = operation_communication.get_transmit_state(UNPROVIDED);
        try {
            operation_communication.set_transmit_state(NIL != $l2r_transmit_operationsP$.getDynamicValue(thread) ? $$$transmit : $$$store);
            if (NIL == nart_handles.nart_p(interpretation_mt)) {
                l2r_assert(list($$retainTerm, interpretation_mt), UNPROVIDED);
                interpretation_mt = narts_high.find_nart(interpretation_mt);
            }
            assert NIL != nart_handles.nart_p(interpretation_mt) : "nart_handles.nart_p(interpretation_mt) " + "CommonSymbols.NIL != nart_handles.nart_p(interpretation_mt) " + interpretation_mt;
            if (NIL == download) {
                download = l2r_download_webpage(ais);
            }
            paragraphs = (NIL != already_downloadedP) ? l2r_find_webpage_paragraphs(ais, download, interpretation_mt) : NIL;
            if (NIL != list_utilities.empty_list_p(paragraphs)) {
                paragraphs = l2r_reify_webpage_paragraphs(ais, download, interpretation_mt);
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                operation_communication.set_transmit_state(old_transmit_state);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return paragraphs;
    }

    public static SubLObject l2r_download_webpage(final SubLObject webpage_ais) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(webpage_ais) : "forts.fort_p(webpage_ais) " + "CommonSymbols.NIL != forts.fort_p(webpage_ais) " + webpage_ais;
        final SubLObject existing = l2r_most_recent_webpage_download(webpage_ais);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != existing)) {
            Errors.error($str267$_S___has_already_been_downloaded_, webpage_ais, existing);
        }
        final SubLObject url = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, $$webPageURL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject download_time = date_utilities.indexical_now();
        final SubLObject html_source = (NIL != url) ? evaluation_defns.cyc_url_source(url) : NIL;
        final SubLObject downloading_event = (NIL != html_source) ? l2r_create($$$WebpageDownload) : NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == url)) {
            Errors.error($str270$_S_doesn_t_have_a___webPageURL_as, webpage_ais);
        }
        if (NIL != downloading_event) {
            l2r_assert(list($$isa, downloading_event, list($$DownloadTypeOfAISFn, webpage_ais)), $$UniversalVocabularyMt);
            l2r_assert(list($$dateOfEvent, downloading_event, download_time), $$BaseKB);
            if (NIL == ke.cyclist_is_guest()) {
                l2r_assert(list($$directingAgent, downloading_event, operation_communication.the_cyclist()), $$CyclistsMt);
            }
            l2r_assert(list($$transferredAIS, downloading_event, html_source), $$BaseKB);
        }
        return downloading_event;
    }

    public static SubLObject l2r_most_recent_webpage_download(final SubLObject webpage_ais) {
        final SubLObject download_type = narts_high.find_nart(list($$DownloadTypeOfAISFn, webpage_ais));
        final SubLObject all_downloads = (NIL != download_type) ? isa.all_fort_instances_in_all_mts(download_type) : NIL;
        SubLObject most_recent_date = NIL;
        SubLObject most_recent_download = NIL;
        SubLObject cdolist_list_var = all_downloads;
        SubLObject download = NIL;
        download = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject this_download_date = kb_mapping_utilities.fpred_value_in_any_mt(download, $$dateOfEvent, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            if ((NIL == most_recent_download) || (NIL == most_recent_date)) {
                most_recent_download = download;
                most_recent_date = this_download_date;
            } else
                if ((NIL != this_download_date) && (NIL != date_utilities.dateL(most_recent_date, this_download_date))) {
                    most_recent_download = download;
                    most_recent_date = this_download_date;
                }

            cdolist_list_var = cdolist_list_var.rest();
            download = cdolist_list_var.first();
        } 
        return values(most_recent_download, most_recent_date);
    }

    public static SubLObject l2r_find_webpage_paragraphs(final SubLObject webpage_ais, SubLObject download, SubLObject mt) {
        if (download == UNPROVIDED) {
            download = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(webpage_ais) : "forts.fort_p(webpage_ais) " + "CommonSymbols.NIL != forts.fort_p(webpage_ais) " + webpage_ais;
        if (NIL == download) {
            download = l2r_most_recent_webpage_download(webpage_ais);
        }
        SubLObject paragraphs = NIL;
        if (NIL != download) {
            if (NIL == mt) {
                final SubLObject v_document = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, $$correspondingAIS, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                assert NIL != forts.fort_p(v_document) : "forts.fort_p(v_document) " + "CommonSymbols.NIL != forts.fort_p(v_document) " + v_document;
                mt = narts_high.find_nart(list($$InterpretingDocumentMtFn, v_document));
                assert NIL != nart_handles.nart_p(mt) : "nart_handles.nart_p(mt) " + "CommonSymbols.NIL != nart_handles.nart_p(mt) " + mt;
            }
            final SubLObject data = ask_utilities.query_template($list276, list($const277$nthOccurrenceOfStructureTypeInStr, $sym278$_PARAGRAPH, $sym279$_N, $$NLParagraph, webpage_ais), mt, $list281);
            paragraphs = Mapping.mapcar(symbol_function(CAR), list_utilities.sort_alist_by_values(data, symbol_function($sym283$_)));
        }
        return paragraphs;
    }

    public static SubLObject l2r_reify_webpage_paragraphs(final SubLObject webpage_ais, SubLObject download, SubLObject mt) {
        if (download == UNPROVIDED) {
            download = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(webpage_ais) : "forts.fort_p(webpage_ais) " + "CommonSymbols.NIL != forts.fort_p(webpage_ais) " + webpage_ais;
        if (NIL == download) {
            download = l2r_most_recent_webpage_download(webpage_ais);
        }
        if (NIL == download) {
            download = l2r_download_webpage(webpage_ais);
        }
        final SubLObject source_html = l2r_best_webpage_source(webpage_ais, download);
        SubLObject paragraphs = NIL;
        if (NIL != source_html) {
            final SubLObject paragraph_texts = l2r_identify_webpage_paragraphs(source_html, webpage_ais);
            if (NIL == mt) {
                final SubLObject v_document = kb_mapping_utilities.fpred_value_in_any_mt(webpage_ais, $$correspondingAIS, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                assert NIL != forts.fort_p(v_document) : "forts.fort_p(v_document) " + "CommonSymbols.NIL != forts.fort_p(v_document) " + v_document;
                mt = list($$InterpretingDocumentMtFn, v_document);
            }
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
                    noting_percent_progress_preamble(cconcatenate($$$Reifying_paragraphs_in_, new SubLObject[]{ format_nil.format_nil_s_no_copy(webpage_ais), $str285$___ }));
                    SubLObject paragraph_num = ONE_INTEGER;
                    final SubLObject paragraph_count = length(paragraph_texts);
                    SubLObject cdolist_list_var = paragraph_texts;
                    SubLObject paragraph_text = NIL;
                    paragraph_text = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject paragraph = l2r_reify_one_webpage_paragraph(paragraph_num, paragraph_text, webpage_ais, mt);
                        if (NIL != forts.fort_p(paragraph)) {
                            paragraphs = cons(paragraph, paragraphs);
                        }
                        note_percent_progress(paragraph_num, paragraph_count);
                        paragraph_num = add(paragraph_num, ONE_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        paragraph_text = cdolist_list_var.first();
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
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        return nreverse(paragraphs);
    }

    public static SubLObject l2r_identify_webpage_paragraphs(final SubLObject source_html, final SubLObject webpage_ais) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(source_html, UNPROVIDED);
        final SubLObject source_subl_string = (NIL != unicodeP) ? cycl_utilities.nat_arg1(source_html, UNPROVIDED) : source_html;
        SubLObject paragraph_texts = NIL;
        SubLObject doneP = sublisp_null(source_html);
        if (NIL == string_utilities.substringP($str286$_p_, source_subl_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            Errors.warn($str287$_S_doesn_t_have_any_recognizable_, webpage_ais);
            doneP = T;
        }
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
                noting_percent_progress_preamble(cconcatenate($$$Identifying_paragraphs_in_, new SubLObject[]{ format_nil.format_nil_s_no_copy(webpage_ais), $str285$___ }));
                SubLObject start = ZERO_INTEGER;
                final SubLObject total_length = length(source_subl_string);
                SubLObject paragraph_text = NIL;
                while (NIL == doneP) {
                    thread.resetMultipleValues();
                    final SubLObject paragraph_text_$24 = l2r_find_next_webpage_paragraph(source_subl_string, webpage_ais, unicodeP, start);
                    final SubLObject start_$25 = thread.secondMultipleValue();
                    final SubLObject doneP_$26 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    paragraph_text = paragraph_text_$24;
                    start = start_$25;
                    doneP = doneP_$26;
                    if (NIL != unicode_nauts.string_or_unicode_naut_p(paragraph_text)) {
                        paragraph_texts = cons(paragraph_text, paragraph_texts);
                    }
                    if (NIL == doneP) {
                        note_percent_progress(start, total_length);
                    }
                } 
            } finally {
                final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(paragraph_texts);
    }

    public static SubLObject l2r_find_next_webpage_paragraph(final SubLObject source_subl_string, final SubLObject webpage_ais, final SubLObject unicodeP, final SubLObject start) {
        final SubLObject start_pos = search($str286$_p_, source_subl_string, symbol_function(EQUALP), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, NIL);
        final SubLObject end_pos = (NIL != start_pos) ? search($str289$__p_, source_subl_string, symbol_function(EQUALP), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start_pos, NIL) : NIL;
        final SubLObject new_start = NIL;
        SubLObject recurseP = NIL;
        if (NIL == end_pos) {
            return values(NIL, new_start, T);
        }
        if (NIL != string_utilities.substringP($$$script, source_subl_string, symbol_function(EQUALP), start_pos, end_pos)) {
            recurseP = T;
        } else {
            final SubLObject raw_paragraph_text = string_utilities.substring(source_subl_string, add(start_pos, THREE_INTEGER), subtract(end_pos, ZERO_INTEGER));
            final SubLObject paragraph_text = (NIL != unicodeP) ? unicode_nauts.display_vector_string_to_cycl_safe_string(raw_paragraph_text) : raw_paragraph_text;
            final SubLObject tagless_text = evaluation_defns.cyc_remove_html_tags(paragraph_text);
            if (NIL != string_utilities.empty_string_p(tagless_text)) {
                Errors.warn($str291$No_non_tagged_text_in__S, paragraph_text);
                recurseP = T;
            } else {
                if (NIL != lexicon_accessors.contains_closed_lexical_class_wordP(NIL != unicode_nauts.unicode_naut_p(tagless_text, UNPROVIDED) ? cycl_utilities.nat_arg1(tagless_text, UNPROVIDED) : tagless_text)) {
                    return values(paragraph_text, end_pos, NIL);
                }
                Errors.warn($str292$No_closed_class_words_in__S, tagless_text);
                recurseP = T;
            }
        }
        if (NIL != recurseP) {
            return l2r_find_next_webpage_paragraph(source_subl_string, webpage_ais, unicodeP, end_pos);
        }
        return NIL;
    }

    public static SubLObject l2r_reify_one_webpage_paragraph(final SubLObject paragraph_num, final SubLObject paragraph_text, final SubLObject webpage_ais, final SubLObject mt) {
        final SubLObject paragraph_naut = list($const293$NthOccurrenceOfStructureTypeInStr, paragraph_num, $$NLParagraph, webpage_ais);
        l2r_assert_source_html(paragraph_naut, paragraph_text, mt, T);
        format(T, $str294$___S___S__, paragraph_num, evaluation_defns.cyc_remove_html_tags(paragraph_text));
        return narts_high.find_nart(paragraph_naut);
    }

    public static SubLObject l2r_best_webpage_source(final SubLObject webpage_ais, SubLObject download) {
        if (download == UNPROVIDED) {
            download = l2r_most_recent_webpage_download(webpage_ais);
        }
        final SubLObject download_text = (NIL != download) ? kb_mapping_utilities.fpred_value_in_any_mt(download, $$transferredAIS, ONE_INTEGER, TWO_INTEGER, UNPROVIDED) : NIL;
        final SubLObject source_html = (NIL != download_text) ? download_text : l2r_get_source_html(webpage_ais);
        return source_html;
    }

    public static SubLObject l2r_reify_sentence_level_pegs_for_document(final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentences = l2r_sentences_for_document(v_document);
        final SubLObject rules = l2r_sentence_level_peg_creation_rules();
        SubLObject sentence_pegs = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
            api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject new_peg = l2r_create($$$SentenceLevelPeg);
                SubLObject cdolist_list_var_$28 = l2r_sentence_level_peg_creation_template_sentences();
                SubLObject template_sentence = NIL;
                template_sentence = cdolist_list_var_$28.first();
                while (NIL != cdolist_list_var_$28) {
                    final SubLObject dereferenced = l2r_dereference_sentence_level_peg_assertion_sentence(new_peg, sentence, v_document, template_sentence, NIL, NIL, NIL);
                    l2r_assert(dereferenced, UNPROVIDED);
                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                    template_sentence = cdolist_list_var_$28.first();
                } 
                sentence_pegs = cons(new_peg, sentence_pegs);
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            } 
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return nreverse(sentence_pegs);
    }

    public static SubLObject l2r_reify_peg_for_sentence(final SubLObject sentence, final SubLObject v_document) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_denotational_term_p(sentence) : "cycl_grammar.cycl_denotational_term_p(sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(sentence) " + sentence;
        final SubLObject rules = l2r_sentence_level_peg_creation_rules();
        SubLObject new_peg = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
            final SubLObject _prev_bind_0_$29 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
                new_peg = l2r_create($$$SentenceLevelPeg);
            } finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0_$29, thread);
            }
            SubLObject cdolist_list_var = l2r_sentence_level_peg_creation_template_sentences();
            SubLObject template_sentence = NIL;
            template_sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject dereferenced = l2r_dereference_sentence_level_peg_assertion_sentence(new_peg, sentence, v_document, template_sentence, NIL, NIL, NIL);
                l2r_assert(dereferenced, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                template_sentence = cdolist_list_var.first();
            } 
        } finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return new_peg;
    }

    public static SubLObject l2r_find_or_reify_peg_for_sentence_string(final SubLObject sentence_string, final SubLObject v_document, final SubLObject supertext, final SubLObject sentence_number, final SubLObject sentence_string_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != unicode_nauts.string_or_unicode_naut_p(sentence_string) : "unicode_nauts.string_or_unicode_naut_p(sentence_string) " + "CommonSymbols.NIL != unicode_nauts.string_or_unicode_naut_p(sentence_string) " + sentence_string;
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) " + v_document;
        assert NIL != cycl_grammar.cycl_denotational_term_p(supertext) : "cycl_grammar.cycl_denotational_term_p(supertext) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(supertext) " + supertext;
        assert NIL != subl_promotions.positive_integer_p(sentence_number) : "subl_promotions.positive_integer_p(sentence_number) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(sentence_number) " + sentence_number;
        final SubLObject rules = l2r_sentence_level_peg_creation_rules();
        SubLObject dereferenced_sentences = NIL;
        final SubLObject peg_var = $sym298$_PEG;
        SubLObject peg = NIL;
        SubLObject cdolist_list_var = l2r_sentence_level_peg_creation_template_sentences();
        SubLObject template_sentence = NIL;
        template_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject dereferenced = l2r_dereference_sentence_level_peg_assertion_sentence(peg_var, sentence_string, v_document, supertext, sentence_number, sentence_string_number, template_sentence);
            dereferenced_sentences = cons(dereferenced, dereferenced_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            template_sentence = cdolist_list_var.first();
        } 
        peg = l2r_find_sentence_peg_from_sentences(peg_var, dereferenced_sentences);
        if (NIL == peg) {
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                final SubLObject _prev_bind_0_$30 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(default_learning_reader_cyclist(), thread);
                    peg = l2r_create($$$SentenceLevelPeg);
                } finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0_$30, thread);
                }
                SubLObject cdolist_list_var2 = nreverse(dereferenced_sentences);
                SubLObject dereferenced = NIL;
                dereferenced = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    l2r_assert(cycl_utilities.expression_subst(peg, peg_var, dereferenced, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    dereferenced = cdolist_list_var2.first();
                } 
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
            }
        }
        return peg;
    }

    public static SubLObject l2r_find_sentence_peg_from_sentences(final SubLObject peg_var, final SubLObject dereferenced_sentences) {
        return ask_utilities.query_variable(peg_var, simplifier.conjoin(dereferenced_sentences, UNPROVIDED), $$BaseKB, $list299).first();
    }

    public static SubLObject clear_l2r_sentence_level_peg_creation_template() {
        final SubLObject cs = $l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_l2r_sentence_level_peg_creation_template() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject l2r_sentence_level_peg_creation_template_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template = $const301$SentenceLevelPegCreationTemplateF;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == valid_constantP(template, T))) {
            Errors.error($str302$Failed_to_validate___SentenceLeve);
        }
        return template;
    }

    public static SubLObject l2r_sentence_level_peg_creation_template() {
        SubLObject caching_state = $l2r_sentence_level_peg_creation_template_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE, $sym303$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(l2r_sentence_level_peg_creation_template_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_l2r_sentence_level_peg_exemplar() {
        final SubLObject cs = $l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_l2r_sentence_level_peg_exemplar() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject l2r_sentence_level_peg_exemplar_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject exemplar = $$TheExemplarSentenceLevelPeg;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == valid_constantP(exemplar, T))) {
            Errors.error($str306$Failed_to_validate___TheExemplarS);
        }
        return exemplar;
    }

    public static SubLObject l2r_sentence_level_peg_exemplar() {
        SubLObject caching_state = $l2r_sentence_level_peg_exemplar_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_LEVEL_PEG_EXEMPLAR, $sym307$_L2R_SENTENCE_LEVEL_PEG_EXEMPLAR_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(l2r_sentence_level_peg_exemplar_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject l2r_sentence_level_peg_creation_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rules = forward.creation_template_allowable_rules(l2r_sentence_level_peg_creation_template());
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.non_empty_list_of_type_p($sym308$RULE_ASSERTION_, rules))) {
            Errors.error($str309$Failed_to_find_good_L2R_SENTENCE_, rules);
        }
        return rules;
    }

    public static SubLObject clear_l2r_sentence_level_peg_creation_template_sentences() {
        final SubLObject cs = $l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_l2r_sentence_level_peg_creation_template_sentences() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject l2r_sentence_level_peg_creation_template_sentences_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentences = get_l2r_sentence_level_peg_creation_template_sentences();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.non_empty_list_of_type_p(IST_SENTENCE_P, sentences))) {
            Errors.error($str312$Failed_to_initialize_L2R_SENTENCE, sentences);
        }
        return sentences;
    }

    public static SubLObject l2r_sentence_level_peg_creation_template_sentences() {
        SubLObject caching_state = $l2r_sentence_level_peg_creation_template_sentences_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES, $sym313$_L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES_CACHING_STATE, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(l2r_sentence_level_peg_creation_template_sentences_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject l2r_dereference_sentence_level_peg_assertion_sentence(final SubLObject new_peg, final SubLObject sentence_string, final SubLObject v_document, final SubLObject supertext, final SubLObject sentence_number, final SubLObject sentence_string_number, final SubLObject template_sentence) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(new_peg) : "cycl_grammar.cycl_denotational_term_p(new_peg) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(new_peg) " + new_peg;
        SubLObject ans = copy_expression(template_sentence);
        SubLObject cdolist_list_var;
        final SubLObject pairs = cdolist_list_var = list(list(new_peg, l2r_sentence_level_peg_exemplar()), list(sentence_string, l2r_sentence_string_indexical()), list(v_document, l2r_document_indexical()), list(supertext, l2r_supertext_indexical()), list(sentence_number, l2r_sentence_number_indexical()), list(sentence_string_number, l2r_sentence_string_number_indexical()));
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject in = NIL;
            SubLObject out = NIL;
            destructuring_bind_must_consp(current, datum, $list314);
            in = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list314);
            out = current.first();
            current = current.rest();
            if (NIL == current) {
                ans = cycl_utilities.expression_subst(in, out, ans, symbol_function(EQUAL), UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list314);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject clear_l2r_document_indexical() {
        final SubLObject cs = $l2r_document_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_l2r_document_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_document_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject l2r_document_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject document_naut = $list316;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(document_naut))) {
            Errors.error($str317$Failed_to_validate_L2R_DOCUMENT_I, document_naut);
        }
        return document_naut;
    }

    public static SubLObject l2r_document_indexical() {
        SubLObject caching_state = $l2r_document_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(L2R_DOCUMENT_INDEXICAL, $sym318$_L2R_DOCUMENT_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(l2r_document_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_l2r_sentence_indexical() {
        final SubLObject cs = $l2r_sentence_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_l2r_sentence_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject l2r_sentence_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_naut = $list320;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(sentence_naut))) {
            Errors.error($str321$Failed_to_validate_L2R_SENTENCE_I, sentence_naut);
        }
        return sentence_naut;
    }

    public static SubLObject l2r_sentence_indexical() {
        SubLObject caching_state = $l2r_sentence_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_INDEXICAL, $sym322$_L2R_SENTENCE_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(l2r_sentence_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_l2r_supertext_indexical() {
        final SubLObject cs = $l2r_supertext_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_l2r_supertext_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_supertext_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject l2r_supertext_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supertext_naut = $list324;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(supertext_naut))) {
            Errors.error($str325$Failed_to_validate_L2R_SUPERTEXT_, supertext_naut);
        }
        return supertext_naut;
    }

    public static SubLObject l2r_supertext_indexical() {
        SubLObject caching_state = $l2r_supertext_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(L2R_SUPERTEXT_INDEXICAL, $sym326$_L2R_SUPERTEXT_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(l2r_supertext_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_l2r_sentence_string_indexical() {
        final SubLObject cs = $l2r_sentence_string_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_l2r_sentence_string_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_string_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject l2r_sentence_string_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_naut = $list328;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(sentence_naut))) {
            Errors.error($str329$Failed_to_validate_L2R_SENTENCE_S, sentence_naut);
        }
        return sentence_naut;
    }

    public static SubLObject l2r_sentence_string_indexical() {
        SubLObject caching_state = $l2r_sentence_string_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_STRING_INDEXICAL, $sym330$_L2R_SENTENCE_STRING_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(l2r_sentence_string_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_l2r_sentence_number_indexical() {
        final SubLObject cs = $l2r_sentence_number_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_l2r_sentence_number_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_number_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject l2r_sentence_number_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject naut = $list332;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(naut))) {
            Errors.error($str333$Failed_to_validate_L2R_SENTENCE_N, naut);
        }
        return naut;
    }

    public static SubLObject l2r_sentence_number_indexical() {
        SubLObject caching_state = $l2r_sentence_number_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_NUMBER_INDEXICAL, $sym334$_L2R_SENTENCE_NUMBER_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(l2r_sentence_number_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_l2r_sentence_string_number_indexical() {
        final SubLObject cs = $l2r_sentence_string_number_indexical_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_l2r_sentence_string_number_indexical() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_sentence_string_number_indexical_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject l2r_sentence_string_number_indexical_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject naut = $list336;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == narts_high.find_nart(naut))) {
            Errors.error($str337$Failed_to_validate_L2R_SENTENCE_S, naut);
        }
        return naut;
    }

    public static SubLObject l2r_sentence_string_number_indexical() {
        SubLObject caching_state = $l2r_sentence_string_number_indexical_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(L2R_SENTENCE_STRING_NUMBER_INDEXICAL, $sym338$_L2R_SENTENCE_STRING_NUMBER_INDEXICAL_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(l2r_sentence_string_number_indexical_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_l2r_sentence_level_peg_creation_template_sentences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template = l2r_sentence_level_peg_creation_template();
        final SubLObject tuples = ask_utilities.query_template($list339, list($$assertPriorToInCreationTemplate, $sym341$_HIGHER, $sym342$_LOWER, template), $$InferencePSC, $list343);
        thread.resetMultipleValues();
        final SubLObject high_to_low = formula_templates.construct_highXlow_information_from_prioritizing_ordering(tuples);
        final SubLObject low_to_high = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Mapping.mapcar(symbol_function(HL_TO_EL), Mapping.mapcar(symbol_function(ASSERTION_IST_FORMULA), formula_templates.apply_prioritizing_ordering_to_kb_objects(high_to_low, low_to_high)));
    }

    public static SubLObject sentencify_l2r_paragraph(final SubLObject html_source) {
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(html_source, UNPROVIDED);
        final SubLObject string = (NIL != unicodeP) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(html_source, UNPROVIDED)) : html_source;
        final SubLObject vector_var;
        final SubLObject sentence_vector = vector_var = document.string_sentencify(string, HTML_STRING_WORDIFY);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            set_l2r_sentence_string(sentence, unicodeP);
        }
        return sentence_vector;
    }

    public static SubLObject set_l2r_sentence_string(final SubLObject sentence, SubLObject unicodeP) {
        if (unicodeP == UNPROVIDED) {
            unicodeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject first_wordP = T;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject whole_string = l2r_reconstruct_word_string(word, makeBoolean(NIL == first_wordP));
                princ(whole_string, stream);
                first_wordP = NIL;
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
            string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != unicodeP) {
            final SubLObject utf8_string = unicode_strings.html_escaped_to_utf8_string(string);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!utf8_string.isString())) {
                Errors.error($str347$Couldn_t_make_UTF8_string_from__S, string);
            }
            string = (NIL != find_if(NON_ASCII_CHAR_P, utf8_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? unicode_nauts.make_unicode_naut(unicode_strings.utf8_string_to_display(utf8_string)) : utf8_string;
        }
        document._csetf_sign_string(sentence, string);
        return string;
    }

    public static SubLObject l2r_reconstruct_word_string(final SubLObject word, SubLObject include_leading_whitespaceP) {
        if (include_leading_whitespaceP == UNPROVIDED) {
            include_leading_whitespaceP = NIL;
        }
        final SubLObject main_string = document.word_string(word);
        final SubLObject info = document.word_info(word);
        final SubLObject leading_tags = getf(info, $LEADING_TAGS, string_utilities.$empty_string$.getGlobalValue());
        final SubLObject following_tags = getf(info, $FOLLOWING_TAGS, string_utilities.$empty_string$.getGlobalValue());
        final SubLObject leading_whitespace = (NIL != include_leading_whitespaceP) ? getf(info, $LEADING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue()) : string_utilities.$empty_string$.getGlobalValue();
        final SubLObject following_whitespace = getf(info, $FOLLOWING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue());
        final SubLObject whole_string = cconcatenate(leading_whitespace, new SubLObject[]{ leading_tags, main_string, following_tags, following_whitespace });
        return whole_string;
    }

    public static SubLObject l2r_word_length(final SubLObject word, SubLObject include_tagsP) {
        if (include_tagsP == UNPROVIDED) {
            include_tagsP = NIL;
        }
        final SubLObject main_string = document.word_string(word);
        final SubLObject info = document.word_info(word);
        SubLObject length = length(unicode_strings.display_to_unicode_vector(unicode_strings.utf8_string_to_display(unicode_strings.html_escaped_to_utf8_string(main_string))));
        length = add(length, length(l2r_word_leading_whitespace(word)));
        if (NIL != include_tagsP) {
            length = add(length, length(getf(info, $LEADING_TAGS, string_utilities.$empty_string$.getGlobalValue())));
            length = add(length, length(getf(info, $FOLLOWING_TAGS, string_utilities.$empty_string$.getGlobalValue())));
        }
        length = add(length, length(getf(info, $FOLLOWING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue())));
        return length;
    }

    public static SubLObject l2r_word_leading_whitespace(final SubLObject word) {
        final SubLObject info = document.word_info(word);
        return getf(info, $LEADING_WHITESPACE, string_utilities.$empty_string$.getGlobalValue());
    }

    public static SubLObject l2r_assert_subexpression_links(final SubLObject sentence, final SubLObject sentence_peg, final SubLObject v_document) {
        SubLObject cdolist_list_var = l2r_extract_links_from_sentence(sentence, UNPROVIDED);
        SubLObject data = NIL;
        data = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = data;
            SubLObject html = NIL;
            SubLObject this_html_offset = NIL;
            SubLObject this_non_html_offset = NIL;
            destructuring_bind_must_consp(current, datum, $list353);
            html = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list353);
            this_html_offset = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list353);
            this_non_html_offset = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject non_html = evaluation_defns.cyc_remove_html_tags(html);
                final SubLObject subexpression = list($$SubExpressionAtOffsetFn, sentence_peg, non_html, this_non_html_offset);
                final SubLObject mt = list($$InterpretingDocumentMtFn, v_document);
                final SubLObject sentence_$31 = list($$subExpressionWithStringAtOffset, subexpression, sentence_peg, non_html, this_non_html_offset);
                l2r_assert(sentence_$31, mt);
                l2r_assert_source_html(subexpression, html, mt, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list353);
            }
            cdolist_list_var = cdolist_list_var.rest();
            data = cdolist_list_var.first();
        } 
        return sentence;
    }

    public static SubLObject l2r_extract_links_from_sentence(final SubLObject sentence, SubLObject sanity_checkP) {
        if (sanity_checkP == UNPROVIDED) {
            sanity_checkP = T;
        }
        assert NIL != document.sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        SubLObject links = NIL;
        final SubLObject leading_whitespace_length = length(l2r_word_leading_whitespace(document.sentence_get(sentence, ZERO_INTEGER)));
        SubLObject full_offset = minus(leading_whitespace_length);
        SubLObject non_html_offset = minus(leading_whitespace_length);
        SubLObject this_html_offset = $NONE;
        SubLObject this_non_html_offset = $NONE;
        final SubLObject sentence_string = document.sentence_string(sentence);
        final SubLObject full_string = (NIL != unicode_nauts.unicode_naut_p(sentence_string, UNPROVIDED)) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(sentence_string, UNPROVIDED)) : unicode_strings.unicode_display_to_html(sentence_string);
        final SubLObject non_html_string = (NIL != sanity_checkP) ? evaluation_defns.cyc_remove_html_tags(sentence_string) : NIL;
        SubLObject inside_tagP = NIL;
        SubLObject html = string_utilities.$empty_string$.getGlobalValue();
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject leading_tags = getf(document.word_info(word), $LEADING_TAGS, string_utilities.$empty_string$.getGlobalValue());
            final SubLObject first_wordP = (NIL != inside_tagP) ? NIL : makeBoolean((NIL != search($str358$_a, leading_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != search($$$href, leading_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            inside_tagP = makeBoolean((NIL != first_wordP) || (NIL != inside_tagP));
            if (NIL != first_wordP) {
                final SubLObject leading_whitespace_length_$32 = length(l2r_word_leading_whitespace(word));
                this_html_offset = add(full_offset, leading_whitespace_length_$32);
                this_non_html_offset = add(non_html_offset, leading_whitespace_length_$32);
            }
            if (NIL != inside_tagP) {
                html = cconcatenate(html, l2r_reconstruct_word_string(word, makeBoolean(NIL == first_wordP)));
                if (NIL != search($str360$__a, getf(document.word_info(word), $FOLLOWING_TAGS, string_utilities.$empty_string$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    if (NIL != sanity_checkP) {
                        l2r_sanity_check_subexpression(html, non_html_string, this_non_html_offset, sentence_string, this_html_offset);
                    }
                    links = cons(list(html, this_html_offset, this_non_html_offset), links);
                    inside_tagP = NIL;
                    html = string_utilities.$empty_string$.getGlobalValue();
                }
            }
            full_offset = add(full_offset, l2r_word_length(word, T));
            non_html_offset = add(non_html_offset, l2r_word_length(word, NIL));
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return nreverse(links);
    }

    public static SubLObject l2r_sanity_check_subexpression(final SubLObject html, final SubLObject non_html_string, final SubLObject this_non_html_offset, final SubLObject sentence_string, final SubLObject this_html_offset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject non_html = evaluation_defns.cyc_remove_html_tags(html);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!non_html.equal(evaluation_defns.cyc_substring(non_html_string, this_non_html_offset, add(this_non_html_offset, length(non_html)))))) {
            Errors.error($str361$Bad_offset___S_at_offset__S_of__S, non_html, this_non_html_offset, non_html_string);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!html.equal(evaluation_defns.cyc_substring(sentence_string, this_html_offset, add(this_html_offset, length(html)))))) {
            Errors.error($str361$Bad_offset___S_at_offset__S_of__S, html, this_html_offset, sentence_string);
        }
        return $OK;
    }

    public static SubLObject l2r_sentences_for_document(final SubLObject v_document) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) " + v_document;
        final SubLObject query_sentence = l2r_document_sentence_finder_query_sentence(v_document);
        final SubLObject kbq = l2r_document_sentence_finder_kbq();
        final SubLObject query_properties = kb_query.kbq_query_properties(kbq);
        final SubLObject mt = kb_query.kbq_mt(kbq);
        return inference_kernel.new_cyc_query(query_sentence, mt, query_properties);
    }

    public static SubLObject clear_l2r_document_sentence_finder_kbq() {
        final SubLObject cs = $l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_l2r_document_sentence_finder_kbq() {
        return memoization_state.caching_state_remove_function_results_with_args($l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject l2r_document_sentence_finder_kbq_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kbq = $const364$ReifySentencePegQuery_FindSentenc;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == valid_constantP(kbq, T))) {
            Errors.error($str365$Failed_to_validate___ReifySentenc);
        }
        return kbq;
    }

    public static SubLObject l2r_document_sentence_finder_kbq() {
        SubLObject caching_state = $l2r_document_sentence_finder_kbq_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(L2R_DOCUMENT_SENTENCE_FINDER_KBQ, $sym366$_L2R_DOCUMENT_SENTENCE_FINDER_KBQ_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(l2r_document_sentence_finder_kbq_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject l2r_document_sentence_finder_query_sentence(final SubLObject v_document) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(v_document) : "cycl_grammar.cycl_denotational_term_p(v_document) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(v_document) " + v_document;
        final SubLObject kbq = l2r_document_sentence_finder_kbq();
        final SubLObject indexical_sentence = kb_query.kbq_sentence(kbq);
        final SubLObject document_indexical = l2r_document_indexical();
        final SubLObject dereferenced_sentence = cycl_utilities.expression_subst(v_document, document_indexical, indexical_sentence, symbol_function($sym367$EQUALS_EL_), UNPROVIDED);
        return dereferenced_sentence;
    }

    public static SubLObject simple_assert_linkages_for_page(final SubLObject url, SubLObject wikipedia_pageP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = T;
        }
        assert NIL != string_utilities.non_empty_string_p(url) : "string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) " + url;
        format(T, $str369$Asserting_linkages_for____);
        SubLObject cdolist_list_var = reverse(page_to_detagged_sentence_strings(url, wikipedia_pageP, UNPROVIDED));
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != lexicon_accessors.contains_closed_lexical_class_wordP(sentence)) && ((NIL == wikipedia_pageP) || (NIL == probably_wikipedia_meta_sentence_p(sentence)))) {
                final SubLObject cycl_sentence = unicode_nauts.display_vector_string_to_cycl_safe_string(unicode_strings.html_escaped_to_display(sentence));
                format(T, $str370$_____A__, cycl_sentence);
                linkage_assertion.assert_linkage(cycl_sentence, T, NIL, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject l2r_cyclify_webpage(final SubLObject url, final SubLObject directory, SubLObject wikipedia_pageP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != string_utilities.non_empty_string_p(url) : "string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) " + url;
        format(T, $str371$Using_L2R_Webpage_Cyclifier_with_, $learning_reader_timestamp$.getGlobalValue());
        force_output(T);
        if (NIL == Filesys.directory_p(directory)) {
            file_utilities.make_directory_recursive(directory, NIL, UNPROVIDED);
        }
        final SubLObject sentences_directory = file_utilities.relative_filename(directory, $str372$sentences_, UNPROVIDED);
        final SubLObject sentences_directory_existsP = Filesys.directory_p(sentences_directory);
        if (NIL == sentences_directory_existsP) {
            Filesys.make_directory(sentences_directory, NIL, $int$511);
        }
        final SubLObject links_file = file_utilities.relative_filename(directory, $$$links, UNPROVIDED);
        final SubLObject get_linksP = makeBoolean(NIL == Filesys.probe_file(links_file));
        thread.resetMultipleValues();
        final SubLObject sentences = page_to_detagged_sentence_strings(url, wikipedia_pageP, get_linksP);
        final SubLObject links = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != links) {
            l2r_write_webpage_links(links, url, links_file);
        }
        l2r_save_new_webpage_sentences(sentences, sentences_directory, url, wikipedia_pageP);
        l2r_cyclify_unparsed_sentences(sentences_directory);
        return NIL;
    }

    public static SubLObject l2r_write_webpage_links(final SubLObject links, final SubLObject url, final SubLObject links_file) {
        format(T, $str375$__Writing__S_links_from__S_to__S_, new SubLObject[]{ length(links), url, links_file });
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(links_file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str377$Unable_to_open__S, links_file);
            }
            final SubLObject stream_$33 = stream;
            SubLObject cdolist_list_var = links;
            SubLObject link = NIL;
            link = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                princ(link, stream_$33);
                terpri(stream_$33);
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
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
        return links_file;
    }

    public static SubLObject l2r_cyclify_wikipedia_pages_for_unknown_phrases(final SubLObject links_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unknown_phrase_links = l2r_get_unknown_phrase_wikipedia_links_from_file(links_file);
        if (NIL != list_utilities.non_empty_list_p(unknown_phrase_links)) {
            final SubLObject path = file_utilities.deconstruct_path(links_file);
            final SubLObject base_uri_string = $str378$http___en_wikipedia_org_;
            final SubLObject directory = file_utilities.reconstruct_path(butlast(path, UNPROVIDED), $str379$, UNPROVIDED);
            final SubLObject message = cconcatenate($$$Following_unknown_phrase_links_in, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), $$$_, format_nil.format_nil_s_no_copy(links_file) });
            SubLObject done = ZERO_INTEGER;
            final SubLObject total = length(unknown_phrase_links);
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
                    SubLObject cdolist_list_var = unknown_phrase_links;
                    SubLObject link = NIL;
                    link = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject link_relative_url = extract_link_relative_url(link);
                        final SubLObject subdirectory_name = cconcatenate(list_utilities.last_one(string_utilities.string_tokenize(link_relative_url, $list382, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), $str383$_);
                        final SubLObject new_directory = file_utilities.relative_filename(directory, subdirectory_name, UNPROVIDED);
                        final SubLObject link_url = web_utilities.absolute_url_from_relative_url_and_base(link_relative_url, base_uri_string);
                        if (link_url.isString()) {
                            l2r_cyclify_webpage(link_url, new_directory, T);
                        }
                        done = add(done, ONE_INTEGER);
                        note_percent_progress(done, total);
                        cdolist_list_var = cdolist_list_var.rest();
                        link = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        return unknown_phrase_links;
    }

    public static SubLObject l2r_get_unknown_phrase_wikipedia_links_from_file(final SubLObject links_file) {
        SubLObject unknown_phrase_links = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(links_file, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str377$Unable_to_open__S, links_file);
            }
            for (SubLObject stream_$35 = stream, line = read_line(stream_$35, UNPROVIDED, UNPROVIDED, UNPROVIDED); line.isString(); line = read_line(stream_$35, NIL, NIL, UNPROVIDED)) {
                if (NIL != unknown_phrase_wikipedia_linkP(line)) {
                    unknown_phrase_links = cons(line, unknown_phrase_links);
                }
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
        return nreverse(unknown_phrase_links);
    }

    public static SubLObject extract_link_relative_url(final SubLObject link) {
        final SubLObject quoted = string_utilities.string_tokenize(link, $list385, NIL, NIL, T, UNPROVIDED, UNPROVIDED).first();
        return quoted.isString() ? read_from_string(quoted, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject unknown_phrase_wikipedia_linkP(final SubLObject v_object) {
        return makeBoolean((NIL != unknown_phrase_linkP(v_object)) && (NIL != string_utilities.starts_with(v_object, $str386$_a_href___wiki_)));
    }

    public static SubLObject unknown_phrase_linkP(final SubLObject v_object) {
        SubLObject ans = NIL;
        if (((NIL != string_utilities.non_empty_string_p(v_object)) && (NIL != search($str387$a_href_, v_object, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == search($str388$_img_, v_object, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            final SubLObject stripped = evaluation_defns.cyc_remove_html_tags(v_object);
            ans = makeBoolean((((NIL == lexicon_accessors.denots_of_string(stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find_if(PUNCTUATION_P, stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != find(CHAR_space, stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == psp_main.ps_get_cycls_for_phrase(stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return ans;
    }

    public static SubLObject l2r_save_new_webpage_sentences(final SubLObject sentences, final SubLObject sentences_directory, final SubLObject url, final SubLObject wikipedia_pageP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence_num = ZERO_INTEGER;
        SubLObject sentence_directories = NIL;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != cconcatenate($$$Logging_cyclifications_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(url), $str391$__, format_nil.$format_nil_percent$.getGlobalValue() }) ? cconcatenate($$$Logging_cyclifications_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(url), $str391$__, format_nil.$format_nil_percent$.getGlobalValue() }) : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(sentences), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = sentences;
                SubLObject cycl_sentence = NIL;
                cycl_sentence = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject subl_sentence = (NIL != unicode_nauts.unicode_naut_p(cycl_sentence, UNPROVIDED)) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(cycl_sentence, UNPROVIDED)) : cycl_sentence;
                    if ((NIL != lexicon_accessors.contains_closed_lexical_class_wordP(subl_sentence)) && ((NIL == wikipedia_pageP) || (NIL == probably_wikipedia_meta_sentence_p(subl_sentence)))) {
                        final SubLObject sentence_directory_name = format(NIL, $str392$sentence__3__0D_, sentence_num);
                        final SubLObject sentence_directory = file_utilities.relative_filename(sentences_directory, sentence_directory_name, UNPROVIDED);
                        if (NIL == Filesys.directory_p(sentence_directory)) {
                            Filesys.make_directory(sentence_directory, NIL, $int$511);
                            if (NIL == Filesys.directory_p(sentence_directory)) {
                                sleep(ONE_INTEGER);
                                if (NIL == Filesys.directory_p(sentence_directory)) {
                                    Errors.error($str393$Couldn_t_make_directory_____S, sentence_directory);
                                }
                            }
                        }
                        final SubLObject output_file = file_utilities.relative_filename(sentence_directory, $str394$sentence_text_lisp, UNPROVIDED);
                        if (NIL == Filesys.probe_file(output_file)) {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(output_file, $OUTPUT);
                                if (!stream.isStream()) {
                                    Errors.error($str377$Unable_to_open__S, output_file);
                                }
                                final SubLObject stream_$36 = stream;
                                print(cycl_sentence, stream_$36);
                                force_output(stream_$36);
                            } finally {
                                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                }
                            }
                        }
                        sentence_directories = cons(sentence_directory, sentence_directories);
                        sentence_num = add(sentence_num, ONE_INTEGER);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    cycl_sentence = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
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
        return sentence_directories;
    }

    public static SubLObject l2r_cyclify_unparsed_sentences(final SubLObject sentences_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str395$__Cyclifying_unparsed_sentences_f, sentences_directory);
        assert NIL != Filesys.directory_p(sentences_directory) : "Filesys.directory_p(sentences_directory) " + "CommonSymbols.NIL != Filesys.directory_p(sentences_directory) " + sentences_directory;
        SubLObject directory_contents_var = Filesys.directory(sentences_directory, T);
        final SubLObject progress_message_var = NIL;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$39 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
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
                    SubLObject sentence_directory = NIL;
                    sentence_directory = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if ((NIL != Filesys.directory_p(sentence_directory)) && (NIL != string_utilities.starts_with(nth_value_step_2(nth_value_step_1(ONE_INTEGER), file_utilities.deconstruct_path(sentence_directory)), $str396$sentence_))) {
                            if (NIL == string_utilities.ends_with(sentence_directory, $str383$_, UNPROVIDED)) {
                                sentence_directory = cconcatenate(sentence_directory, $str383$_);
                            }
                            l2r_log_cyclifications_for_unparsed_sentences(sentence_directory);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        sentence_directory = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
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
                $progress_note$.rebind(_prev_bind_0_$39, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return sentences_directory;
    }

    public static SubLObject l2r_log_cyclifications_for_unparsed_sentences(final SubLObject sentence_directory) {
        final SubLObject sentence_file = file_utilities.relative_filename(sentence_directory, $str394$sentence_text_lisp, UNPROVIDED);
        final SubLObject parsed_sentence_file = file_utilities.relative_filename(sentence_directory, $str397$sentence_parsed_lisp, UNPROVIDED);
        final SubLObject parses = NIL;
        SubLObject cycl_sentence = NIL;
        if (NIL != Filesys.probe_file(parsed_sentence_file)) {
            format(T, $str398$__Skipping_already_parsed__S__, parsed_sentence_file);
        } else
            if (NIL != Filesys.probe_file(sentence_file)) {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(sentence_file, $INPUT);
                    if (!stream.isStream()) {
                        Errors.error($str377$Unable_to_open__S, sentence_file);
                    }
                    final SubLObject stream_$41 = stream;
                    cycl_sentence = read(stream_$41, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                format(T, $str399$__Parsing__S__, cycl_sentence);
                stream = NIL;
                try {
                    stream = compatibility.open_text(sentence_file, $OUTPUT);
                    if (!stream.isStream()) {
                        Errors.error($str377$Unable_to_open__S, sentence_file);
                    }
                    final SubLObject stream_$42 = stream;
                    print(cycl_sentence, stream_$42);
                    force_output(stream_$42);
                    print(Mapping.mapcar(HL_TO_EL, parses), stream_$42);
                } finally {
                    final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values2 = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                    }
                }
                file_utilities.move_file(sentence_file, parsed_sentence_file);
                format(T, $str400$___Logged__S_sentence_parses_to__, length(parses), parsed_sentence_file);
            } else {
                Errors.error($str401$No_sentence_to_parse_in__S, sentence_directory);
            }

        return parses;
    }

    public static SubLObject html_eos_open_tags() {
        if (NIL != $html_eos_open_tags$.getGlobalValue()) {
            return $html_eos_open_tags$.getGlobalValue();
        }
        $html_eos_open_tags$.setGlobalValue(list_utilities.mapcar_product(symbol_function(CCONCATENATE), $list404, union(string_utilities.string_list_upcase($html_implicit_eos_tags$.getGlobalValue()), string_utilities.string_list_downcase($html_implicit_eos_tags$.getGlobalValue()), UNPROVIDED, UNPROVIDED)));
        return $html_eos_open_tags$.getGlobalValue();
    }

    public static SubLObject html_eos_close_tags() {
        if (NIL != $html_eos_close_tags$.getGlobalValue()) {
            return $html_eos_close_tags$.getGlobalValue();
        }
        $html_eos_close_tags$.setGlobalValue(list_utilities.mapcar_product(symbol_function(CCONCATENATE), list_utilities.mapcar_product(symbol_function(CCONCATENATE), $list405, union(string_utilities.string_list_upcase($html_implicit_eos_tags$.getGlobalValue()), string_utilities.string_list_downcase($html_implicit_eos_tags$.getGlobalValue()), UNPROVIDED, UNPROVIDED)), $list406));
        return $html_eos_close_tags$.getGlobalValue();
    }

    public static SubLObject wikipedia_meta_strings() {
        return $wikipedia_meta_strings$.getGlobalValue();
    }

    public static SubLObject replace_separator_tags_with_eos(final SubLObject list_of_token_strings) {
        SubLObject retlist = NIL;
        SubLObject cdolist_list_var = list_of_token_strings;
        SubLObject tok = NIL;
        tok = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != string_utilities.ends_with_one_of(tok, html_eos_close_tags())) || (NIL != string_utilities.starts_with_one_of(tok, html_eos_open_tags()))) {
                retlist = cons(format(NIL, $str408$_C, CHAR_escape), retlist);
            } else {
                retlist = cons(tok, retlist);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tok = cdolist_list_var.first();
        } 
        return nreverse(retlist);
    }

    public static SubLObject strip_text_between_tags_of_type(final SubLObject string, final SubLObject tag) {
        SubLObject otag;
        SubLObject ctag;
        SubLObject retstr;
        for (otag = cconcatenate($str409$_, tag), ctag = cconcatenate($str410$__, new SubLObject[]{ tag, $str411$_ }), retstr = string_utilities.string_substitute(otag, otag, string, symbol_function(EQUALP)), retstr = string_utilities.string_substitute(ctag, ctag, retstr, symbol_function(EQUALP)); NIL != string_utilities.get_substring_between_tags(retstr, otag, ctag, UNPROVIDED, UNPROVIDED); retstr = string_utilities.replace_substring_once(retstr, cconcatenate(otag, new SubLObject[]{ string_utilities.get_substring_between_tags(retstr, otag, ctag, UNPROVIDED, UNPROVIDED), ctag }), $str379$, UNPROVIDED)) {
        }
        return retstr;
    }

    public static SubLObject strip_wikipedia_page(final SubLObject pagetext) {
        assert NIL != string_utilities.non_empty_string_p(pagetext) : "string_utilities.non_empty_string_p(pagetext) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(pagetext) " + pagetext;
        SubLObject returned_text = string_utilities.string_subst($str412$_ul_, $str412$_ul_, pagetext, symbol_function(EQUALP));
        returned_text = string_utilities.string_subst($str413$__ul_, $str413$__ul_, returned_text, symbol_function(EQUALP));
        if (NIL != string_utilities.substringP($str414$_____start_content____, returned_text, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            returned_text = string_utilities.get_substring_between_tags(returned_text, $str414$_____start_content____, $str415$_____end_content____, UNPROVIDED, UNPROVIDED);
        }
        returned_text = strip_text_between_tags_of_type(returned_text, $$$ul);
        returned_text = strip_text_between_tags_of_type(returned_text, $$$ol);
        returned_text = strip_text_between_tags_of_type(returned_text, $$$table);
        returned_text = strip_text_between_tags_of_type(returned_text, $$$h1);
        returned_text = strip_text_between_tags_of_type(returned_text, $$$h2);
        returned_text = strip_text_between_tags_of_type(returned_text, $$$h3);
        return returned_text;
    }

    public static SubLObject probably_wikipedia_meta_sentence_p(final SubLObject sentence) {
        assert NIL != string_utilities.non_empty_string_p(sentence) : "string_utilities.non_empty_string_p(sentence) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(sentence) " + sentence;
        if ((NIL != string_utilities.some_are_substringsP(wikipedia_meta_strings(), sentence, UNPROVIDED)) || THREE_INTEGER.numG(string_utilities.number_of_words(sentence))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject detagged_page_as_string(final SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = NIL;
        }
        if (return_linksP == UNPROVIDED) {
            return_linksP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != string_utilities.non_empty_string_p(url) : "string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) " + url;
        final SubLObject links = (NIL != return_linksP) ? set.new_set(symbol_function(EQUAL), UNPROVIDED) : NIL;
        SubLObject retstr = $str379$;
        SubLObject html_source = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    html_source = evaluation_defns.cyc_url_source(url);
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
        if (NIL != error_message) {
            Errors.warn(error_message);
            return retstr;
        }
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(html_source, UNPROVIDED);
        final SubLObject orig_pagetext = (NIL != unicodeP) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(html_source, UNPROVIDED)) : html_source;
        final SubLObject pagetext = (NIL != wikipedia_pageP) ? strip_wikipedia_page(orig_pagetext) : orig_pagetext;
        SubLObject dirtyP = NIL;
        SubLObject paragraph_text = NIL;
        SubLObject start_pos = ZERO_INTEGER;
        SubLObject output_string_stream = NIL;
        try {
            output_string_stream = make_private_string_output_stream();
            while ((NIL == dirtyP) || (NIL != paragraph_text)) {
                thread.resetMultipleValues();
                final SubLObject paragraph_text_$43 = string_utilities.get_substring_between_tags(pagetext, $str286$_p_, $str289$__p_, start_pos, UNPROVIDED);
                final SubLObject start_pos_$44 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                paragraph_text = paragraph_text_$43;
                start_pos = start_pos_$44;
                if (paragraph_text.isString() && (NIL != find_if(ALPHA_CHAR_P, evaluation_defns.cyc_remove_html_tags(paragraph_text), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    dirtyP = T;
                    l2r_stringify_one_paragraph(paragraph_text, output_string_stream, links, unicodeP);
                }
            } 
            if (NIL == dirtyP) {
                Errors.warn($str423$Couldn_t_find_paragraphs_in__S, url);
                l2r_stringify_one_paragraph(pagetext, output_string_stream, links, unicodeP);
            }
            retstr = get_output_stream_string(output_string_stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(output_string_stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return values(string_utilities.remove_last_char(retstr, UNPROVIDED), NIL != links ? set.set_element_list(links) : NIL);
    }

    public static SubLObject l2r_stringify_one_paragraph(final SubLObject paragraph_text, final SubLObject output_string_stream, final SubLObject links, final SubLObject unicodeP) {
        final SubLObject cycl_text = (NIL != unicodeP) ? unicode_nauts.make_unicode_naut(unicode_strings.html_escaped_to_display(paragraph_text)) : paragraph_text;
        final SubLObject vector_var;
        final SubLObject sentence_vector = vector_var = sentencify_l2r_paragraph(cycl_text);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject link_info;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            if (NIL == document.sentence_string(sentence)) {
                Errors.error($str424$No_sentence_string_for__S, sentence);
            }
            l2r_stringify_one_sentence(sentence, output_string_stream);
            if (NIL != set.set_p(links)) {
                cdolist_list_var = l2r_extract_links_from_sentence(sentence, NIL);
                link_info = NIL;
                link_info = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    set.set_add(link_info.first(), links);
                    cdolist_list_var = cdolist_list_var.rest();
                    link_info = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject l2r_stringify_one_sentence(final SubLObject sentence, final SubLObject output_string_stream) {
        final SubLObject stripped = evaluation_defns.cyc_remove_html_tags(document.sentence_string(sentence));
        format(output_string_stream, $str425$_A_, stripped);
        return NIL;
    }

    public static SubLObject detagged_page_as_string_old(final SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = NIL;
        }
        if (return_linksP == UNPROVIDED) {
            return_linksP = NIL;
        }
        assert NIL != string_utilities.non_empty_string_p(url) : "string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) " + url;
        SubLObject retlist = NIL;
        SubLObject links = NIL;
        SubLObject retstr = $str379$;
        final SubLObject html_source = evaluation_defns.cyc_url_source(url);
        final SubLObject orig_pagetext = (NIL != unicode_nauts.unicode_naut_p(html_source, UNPROVIDED)) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(html_source, UNPROVIDED)) : html_source;
        final SubLObject pagetext = (NIL != wikipedia_pageP) ? strip_wikipedia_page(orig_pagetext) : orig_pagetext;
        SubLObject cdolist_list_var;
        final SubLObject xml_tokens = cdolist_list_var = replace_separator_tags_with_eos(xml_parsing_utilities.xml_string_tokenize(pagetext, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != xml_parsing_utilities.xml_token_starts_with(token, $str409$_)) {
                if ((NIL != return_linksP) && (NIL != search($str358$_a, token, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    final SubLObject prefix_string = $str426$href__;
                    final SubLObject prefix_start_pos = search(prefix_string, token, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject start_pos = (NIL != prefix_start_pos) ? add(prefix_start_pos, length(prefix_string)) : NIL;
                    final SubLObject end_pos = (NIL != start_pos) ? search($str427$_, token, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start_pos, UNPROVIDED) : NIL;
                    final SubLObject relative_url = (NIL != end_pos) ? string_utilities.substring(token, start_pos, end_pos) : NIL;
                    if (relative_url.isString()) {
                        links = cons(relative_url, links);
                    }
                }
            } else
                if (NIL == xml_parsing_utilities.xml_token_starts_with(token, $str428$_)) {
                    if (NIL == string_utilities.empty_stringP(string_utilities.trim_whitespace(token))) {
                        retlist = cons(token, retlist);
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject cdolist_list_var2 = nreverse(retlist);
            SubLObject token2 = NIL;
            token2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                princ(token2, stream);
                princ($$$_, stream);
                cdolist_list_var2 = cdolist_list_var2.rest();
                token2 = cdolist_list_var2.first();
            } 
            retstr = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        retstr = string_utilities.remove_last_char(string_utilities.string_subst($$$_, $str429$_u0a_, retstr, UNPROVIDED), UNPROVIDED);
        return values(retstr, links);
    }

    public static SubLObject page_to_detagged_sentence_strings(final SubLObject url, SubLObject wikipedia_pageP, SubLObject return_linksP) {
        if (wikipedia_pageP == UNPROVIDED) {
            wikipedia_pageP = NIL;
        }
        if (return_linksP == UNPROVIDED) {
            return_linksP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != string_utilities.non_empty_string_p(url) : "string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) " + url;
        Errors.warn($str430$Downloading_and_sentencifying_tex, url);
        thread.resetMultipleValues();
        final SubLObject page_text = detagged_page_as_string(url, wikipedia_pageP, return_linksP);
        final SubLObject links = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(document.sentencify_string(page_text), links);
    }

    public static SubLObject parse_and_partition_document_file(final SubLObject file, final SubLObject results_directory, SubLObject domain_mt, SubLObject max_parses, SubLObject max_time) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $$CurrentWorldDataCollectorMt;
        }
        if (max_parses == UNPROVIDED) {
            max_parses = NIL;
        }
        if (max_time == UNPROVIDED) {
            max_time = $int$30;
        }
        final SubLObject paragraph_texts = read_topic_struct_paragraphs_from_file(file);
        return parse_and_partition_paragraph_texts(paragraph_texts, results_directory, domain_mt, max_parses, max_time);
    }

    public static SubLObject read_topic_struct_paragraphs_from_file(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paragraph_texts = NIL;
        SubLObject doneP = NIL;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(file, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str377$Unable_to_open__S, file);
            }
            final SubLObject in = stream;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!in.isStream())) {
                Errors.error($str433$__Cannot_open_input_stream_for__A, file);
            }
            while (NIL == doneP) {
                final SubLObject next = read_ignoring_errors(in, NIL, $EOF);
                if (next == $EOF) {
                    doneP = T;
                } else
                    if (NIL != unicode_nauts.string_or_unicode_naut_p(next)) {
                        paragraph_texts = cons(next, paragraph_texts);
                    } else {
                        Errors.warn($str435$Non_string_in__S_____S__, file, next);
                    }

            } 
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return nreverse(paragraph_texts);
    }

    public static SubLObject parse_and_partition_paragraph_texts(final SubLObject paragraph_texts, final SubLObject results_directory, SubLObject domain_mt, SubLObject max_parses, SubLObject max_time) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $$CurrentWorldDataCollectorMt;
        }
        if (max_parses == UNPROVIDED) {
            max_parses = NIL;
        }
        if (max_time == UNPROVIDED) {
            max_time = $int$30;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Filesys.directory_p(results_directory)) {
            file_utilities.make_directory_recursive(results_directory, NIL, $$$775);
        } else
            if (NIL != Filesys.directory(results_directory, UNPROVIDED)) {
                Errors.error($str437$_S_is_not_empty, results_directory);
            }

        final SubLObject results_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject results_dictionary_file = file_utilities.relative_filename(results_directory, $str438$results_dictionary_cfasl, UNPROVIDED);
        SubLObject paragraph_num = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str439$Parsing_and_partioning_paragraphs, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(paragraph_texts), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = paragraph_texts;
                SubLObject paragraph_text = NIL;
                paragraph_text = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject subl_paragraph_text = (NIL != unicode_nauts.unicode_naut_p(paragraph_text, UNPROVIDED)) ? unicode_strings.display_to_subl_string(cycl_utilities.nat_arg1(paragraph_text, UNPROVIDED), UNPROVIDED, UNPROVIDED) : paragraph_text;
                    SubLObject results = NIL;
                    SubLObject list_var_$45 = NIL;
                    SubLObject sentence = NIL;
                    SubLObject sentence_num = NIL;
                    list_var_$45 = document.sentencify_string(subl_paragraph_text);
                    sentence = list_var_$45.first();
                    for (sentence_num = ZERO_INTEGER; NIL != list_var_$45; list_var_$45 = list_var_$45.rest() , sentence = list_var_$45.first() , sentence_num = add(ONE_INTEGER, sentence_num)) {
                        final SubLObject good = NIL;
                        final SubLObject maybe = NIL;
                        final SubLObject bad = NIL;
                        if (((NIL != good) || (NIL != maybe)) || (NIL != bad)) {
                            results = list_utilities.alist_enter(results, sentence, list(good, maybe, bad), UNPROVIDED);
                            dictionary.dictionary_enter(results_dictionary, list(paragraph_num, sentence_num), list($SENTENCE, sentence, $GOOD, good, $BAD, bad, $MAYBE, maybe));
                            cfasl_utilities.cfasl_save_externalized(results_dictionary, results_dictionary_file);
                        }
                    }
                    if (NIL != results) {
                        final SubLObject results_file = file_utilities.relative_filename(results_directory, partioned_parse_results_file_name(subl_paragraph_text, results_directory), UNPROVIDED);
                        Errors.warn($str444$Writing_results_to__S, results_file);
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(results_file, $OUTPUT);
                            if (!stream.isStream()) {
                                Errors.error($str377$Unable_to_open__S, results_file);
                            }
                            final SubLObject results_stream = stream;
                            SubLObject cdolist_list_var = results;
                            SubLObject cons = NIL;
                            cons = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = cons;
                                SubLObject sentence2 = NIL;
                                SubLObject partitioned_parses = NIL;
                                destructuring_bind_must_consp(current, datum, $list445);
                                sentence2 = current.first();
                                current = partitioned_parses = current.rest();
                                SubLObject current_$47;
                                final SubLObject datum_$46 = current_$47 = partitioned_parses;
                                SubLObject good2 = NIL;
                                SubLObject maybe2 = NIL;
                                SubLObject bad2 = NIL;
                                destructuring_bind_must_consp(current_$47, datum_$46, $list446);
                                good2 = current_$47.first();
                                current_$47 = current_$47.rest();
                                destructuring_bind_must_consp(current_$47, datum_$46, $list446);
                                maybe2 = current_$47.first();
                                current_$47 = current_$47.rest();
                                destructuring_bind_must_consp(current_$47, datum_$46, $list446);
                                bad2 = current_$47.first();
                                current_$47 = current_$47.rest();
                                if (NIL == current_$47) {
                                    write_partioned_parse_results(results_stream, sentence2, good2, maybe2, bad2);
                                } else {
                                    cdestructuring_bind_error(datum_$46, $list446);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                cons = cdolist_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                            }
                        }
                    }
                    paragraph_num = add(paragraph_num, ONE_INTEGER);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    paragraph_text = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
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
        return results_directory;
    }

    public static SubLObject partioned_parse_results_file_name(final SubLObject subl_paragraph_text, final SubLObject directory) {
        final SubLObject length = TEN_INTEGER;
        final SubLObject base;
        SubLObject name = base = list_utilities.remove_if_not(ALPHANUMERICP, string_utilities.substring(subl_paragraph_text, ZERO_INTEGER, length), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject ext = NIL;
            ext = ONE_INTEGER;
            while (NIL == doneP) {
                name = format(NIL, $str448$_A__3__0D, base, ext);
                if (NIL == Filesys.probe_file(file_utilities.relative_filename(directory, name, UNPROVIDED))) {
                    doneP = T;
                }
                ext = number_utilities.f_1X(ext);
            } 
        }
        return name;
    }

    public static SubLObject write_partioned_parse_results(final SubLObject results_stream, final SubLObject sentence, final SubLObject good, final SubLObject maybe, final SubLObject bad) {
        if (((NIL != good) || (NIL != bad)) || (NIL != maybe)) {
            print(sentence, results_stream);
            terpri(results_stream);
        }
        if (NIL != good) {
            princ($str449$Known_bindings_, results_stream);
            SubLObject cdolist_list_var = good;
            SubLObject good_one = NIL;
            good_one = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                write_partioned_parse_result(good_one, results_stream);
                cdolist_list_var = cdolist_list_var.rest();
                good_one = cdolist_list_var.first();
            } 
            terpri(results_stream);
        }
        if (NIL != maybe) {
            princ($str450$Consistent_, results_stream);
            SubLObject cdolist_list_var = maybe;
            SubLObject parse = NIL;
            parse = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                write_partioned_parse_result(parse, results_stream);
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            } 
            terpri(results_stream);
        }
        if (NIL != bad) {
            princ($str451$Known_false_, results_stream);
            SubLObject cdolist_list_var = bad;
            SubLObject parse = NIL;
            parse = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                write_partioned_parse_result(parse, results_stream);
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            } 
        }
        return results_stream;
    }

    public static SubLObject write_partioned_parse_result(final SubLObject parse, final SubLObject results_stream) {
        print(cycl_utilities.expression_transform(parse, NART_P, NART_HL_FORMULA, UNPROVIDED, UNPROVIDED), results_stream);
        return results_stream;
    }

    public static SubLObject l2r_paragraph_candidate_noun_compounds(final SubLObject paragraph) {
        assert NIL != forts.fort_p(paragraph) : "forts.fort_p(paragraph) " + "CommonSymbols.NIL != forts.fort_p(paragraph) " + paragraph;
        SubLObject candidate_noun_compounds = NIL;
        final SubLObject html_source = l2r_get_source_html(paragraph);
        final SubLObject vector_var;
        final SubLObject sentence_vector = vector_var = sentencify_l2r_paragraph(html_source);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject candidate_noun_compound;
        SubLObject item_var;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            cdolist_list_var = l2r_sentence_candidate_noun_compounds(sentence);
            candidate_noun_compound = NIL;
            candidate_noun_compound = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                item_var = candidate_noun_compound;
                if (NIL == member(item_var, candidate_noun_compounds, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    candidate_noun_compounds = cons(item_var, candidate_noun_compounds);
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate_noun_compound = cdolist_list_var.first();
            } 
        }
        return candidate_noun_compounds;
    }

    public static SubLObject l2r_sentence_candidate_noun_compounds(final SubLObject sentence) {
        assert NIL != document.sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        pos_tagger.tagger_tag_sentence(l2r_noun_compound_tagger(), sentence);
        final SubLObject words = document.sentence_constituents(sentence);
        SubLObject candidate_noun_compounds = NIL;
        SubLObject cdolist_list_var = l2r_noun_compound_patterns();
        SubLObject pattern = NIL;
        pattern = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$50 = string_utilities.search_all(pattern, words, symbol_function(EQL), symbol_function(WORD_CATEGORY));
            SubLObject start_pos = NIL;
            start_pos = cdolist_list_var_$50.first();
            while (NIL != cdolist_list_var_$50) {
                SubLObject strings = NIL;
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = length(pattern), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    strings = cons(document.word_string(aref(words, add(i, start_pos))), strings);
                }
                if (NIL == list_utilities.find_if_not($sym453$ALPHANUMERIC_STRING_, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject item_var;
                    final SubLObject candidate_noun_compound = item_var = string_utilities.bunge(nreverse(strings), UNPROVIDED);
                    if (NIL == member(item_var, candidate_noun_compounds, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        candidate_noun_compounds = cons(item_var, candidate_noun_compounds);
                    }
                }
                cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                start_pos = cdolist_list_var_$50.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pattern = cdolist_list_var.first();
        } 
        return candidate_noun_compounds;
    }

    public static SubLObject initialize_l2r_noun_compound_patterns() {
        SubLObject patterns = NIL;
        SubLObject cdolist_list_var = $l2r_noun_compound_category_pairs$.getGlobalValue();
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pattern = make_vector(length(pair), UNPROVIDED);
            SubLObject list_var = NIL;
            SubLObject tag = NIL;
            SubLObject n = NIL;
            list_var = pair;
            tag = list_var.first();
            for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tag = list_var.first() , n = add(ONE_INTEGER, n)) {
                set_aref(pattern, n, document.new_word(list($STRING, $str379$, $CATEGORY, tag)));
            }
            patterns = cons(pattern, patterns);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        $l2r_noun_compound_patterns$.setGlobalValue(patterns);
        return $l2r_noun_compound_patterns$.getGlobalValue();
    }

    public static SubLObject l2r_noun_compound_patterns() {
        if (!$l2r_noun_compound_patterns$.getGlobalValue().isList()) {
            initialize_l2r_noun_compound_patterns();
        }
        return $l2r_noun_compound_patterns$.getGlobalValue();
    }

    public static SubLObject initialize_l2r_noun_compound_tagger() {
        $l2r_noun_compound_tagger$.setGlobalValue(pos_tagger.new_tagger(UNPROVIDED));
        return $l2r_noun_compound_tagger$.getGlobalValue();
    }

    public static SubLObject l2r_noun_compound_tagger() {
        if (NIL == pos_tagger.tagger_p($l2r_noun_compound_tagger$.getGlobalValue())) {
            initialize_l2r_noun_compound_tagger();
        }
        return $l2r_noun_compound_tagger$.getGlobalValue();
    }

    public static SubLObject declare_learning_reader_file() {
        declareFunction(me, "default_learning_reader_cyclist", "DEFAULT-LEARNING-READER-CYCLIST", 0, 0, false);
        declareFunction(me, "l2r_assert", "L2R-ASSERT", 1, 1, false);
        declareFunction(me, "l2r_unassert_assertion", "L2R-UNASSERT-ASSERTION", 1, 0, false);
        declareFunction(me, "l2r_create", "L2R-CREATE", 1, 0, false);
        declareFunction(me, "add_text_learner_ebmt_training_example", "ADD-TEXT-LEARNER-EBMT-TRAINING-EXAMPLE", 2, 0, false);
        declareFunction(me, "create_and_add_l2r_ebmt_template", "CREATE-AND-ADD-L2R-EBMT-TEMPLATE", 2, 0, false);
        declareFunction(me, "l2r_ebmt_parse", "L2R-EBMT-PARSE", 1, 0, false);
        declareFunction(me, "l2r_reader_image_run", "L2R-READER-IMAGE-RUN", 0, 0, false);
        declareFunction(me, "l2r_reader_image_read_document", "L2R-READER-IMAGE-READ-DOCUMENT", 1, 0, false);
        declareFunction(me, "l2r_read_document", "L2R-READ-DOCUMENT", 1, 1, false);
        declareMacro(me, "l2r_computing_cpu_time", "L2R-COMPUTING-CPU-TIME");
        declareFunction(me, "l2r_image_elapsed_cpu_time", "L2R-IMAGE-ELAPSED-CPU-TIME", 0, 0, false);
        declareFunction(me, "l2r_read_paragraph", "L2R-READ-PARAGRAPH", 2, 1, false);
        declareFunction(me, "l2r_paragraph_reader_print_function_trampoline", "L2R-PARAGRAPH-READER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "l2r_paragraph_reader_p", "L2R-PARAGRAPH-READER-P", 1, 0, false);
        new learning_reader.$l2r_paragraph_reader_p$UnaryFunction();
        declareFunction(me, "l2r_paragraph_reader_paragraph", "L2R-PARAGRAPH-READER-PARAGRAPH", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_document", "L2R-PARAGRAPH-READER-DOCUMENT", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_paragraph_source_html", "L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_sentence_vector", "L2R-PARAGRAPH-READER-SENTENCE-VECTOR", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_sentence_pegs", "L2R-PARAGRAPH-READER-SENTENCE-PEGS", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_sentence_non_html_texts", "L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_sentence_number", "L2R-PARAGRAPH-READER-SENTENCE-NUMBER", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_linkage", "L2R-PARAGRAPH-READER-LINKAGE", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_linkage_fort", "L2R-PARAGRAPH-READER-LINKAGE-FORT", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_initial_assertion_count", "L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_total_time", "L2R-PARAGRAPH-READER-TOTAL-TIME", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_total_cpu_time", "L2R-PARAGRAPH-READER-TOTAL-CPU-TIME", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_sentence_time", "L2R-PARAGRAPH-READER-SENTENCE-TIME", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_sentence_cpu_time", "L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_state", "L2R-PARAGRAPH-READER-STATE", 1, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_paragraph", "_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_document", "_CSETF-L2R-PARAGRAPH-READER-DOCUMENT", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_paragraph_source_html", "_CSETF-L2R-PARAGRAPH-READER-PARAGRAPH-SOURCE-HTML", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_sentence_vector", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-VECTOR", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_sentence_pegs", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-PEGS", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_sentence_non_html_texts", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NON-HTML-TEXTS", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_sentence_number", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-NUMBER", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_linkage", "_CSETF-L2R-PARAGRAPH-READER-LINKAGE", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_linkage_fort", "_CSETF-L2R-PARAGRAPH-READER-LINKAGE-FORT", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_initial_assertion_count", "_CSETF-L2R-PARAGRAPH-READER-INITIAL-ASSERTION-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_total_time", "_CSETF-L2R-PARAGRAPH-READER-TOTAL-TIME", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_total_cpu_time", "_CSETF-L2R-PARAGRAPH-READER-TOTAL-CPU-TIME", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_sentence_time", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-TIME", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_sentence_cpu_time", "_CSETF-L2R-PARAGRAPH-READER-SENTENCE-CPU-TIME", 2, 0, false);
        declareFunction(me, "_csetf_l2r_paragraph_reader_state", "_CSETF-L2R-PARAGRAPH-READER-STATE", 2, 0, false);
        declareFunction(me, "make_l2r_paragraph_reader", "MAKE-L2R-PARAGRAPH-READER", 0, 1, false);
        declareFunction(me, "visit_defstruct_l2r_paragraph_reader", "VISIT-DEFSTRUCT-L2R-PARAGRAPH-READER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_l2r_paragraph_reader_method", "VISIT-DEFSTRUCT-OBJECT-L2R-PARAGRAPH-READER-METHOD", 2, 0, false);
        declareFunction(me, "print_l2r_paragraph_reader", "PRINT-L2R-PARAGRAPH-READER", 3, 0, false);
        declareFunction(me, "new_l2r_paragraph_reader", "NEW-L2R-PARAGRAPH-READER", 2, 0, false);
        declareFunction(me, "l2r_get_source_html", "L2R-GET-SOURCE-HTML", 1, 0, false);
        declareFunction(me, "l2r_assert_source_html", "L2R-ASSERT-SOURCE-HTML", 3, 1, false);
        declareFunction(me, "l2r_paragraph_reader_next_in_separate_thread", "L2R-PARAGRAPH-READER-NEXT-IN-SEPARATE-THREAD", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_next", "L2R-PARAGRAPH-READER-NEXT", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_next_action", "L2R-PARAGRAPH-READER-NEXT-ACTION", 1, 0, false);
        declareFunction(me, "destroy_l2r_paragraph_reader", "DESTROY-L2R-PARAGRAPH-READER", 1, 0, false);
        declareMacro(me, "updating_l2r_paragraph_reader_times", "UPDATING-L2R-PARAGRAPH-READER-TIMES");
        declareMacro(me, "with_temporary_transmit_state", "WITH-TEMPORARY-TRANSMIT-STATE");
        declareMacro(me, "with_temporary_receive_state", "WITH-TEMPORARY-RECEIVE-STATE");
        declareFunction(me, "reset_l2r_paragraph_reader_sentence_times", "RESET-L2R-PARAGRAPH-READER-SENTENCE-TIMES", 1, 0, false);
        declareFunction(me, "new_l2r_reading_event_for_document", "NEW-L2R-READING-EVENT-FOR-DOCUMENT", 1, 0, false);
        declareFunction(me, "find_unfinished_l2r_reading_event_for_document", "FIND-UNFINISHED-L2R-READING-EVENT-FOR-DOCUMENT", 1, 0, false);
        declareFunction(me, "note_l2r_reading_event_ongoing", "NOTE-L2R-READING-EVENT-ONGOING", 1, 0, false);
        declareFunction(me, "note_l2r_reading_event_done", "NOTE-L2R-READING-EVENT-DONE", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_find_or_create_pegs_for_sentence", "L2R-PARAGRAPH-READER-FIND-OR-CREATE-PEGS-FOR-SENTENCE", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_find_or_assert_linkage", "L2R-PARAGRAPH-READER-FIND-OR-ASSERT-LINKAGE", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_maybe_assert_parse_tree_for_linkage", "L2R-PARAGRAPH-READER-MAYBE-ASSERT-PARSE-TREE-FOR-LINKAGE", 1, 0, false);
        declareFunction(me, "l2r_tokenization_has_parse_treeP", "L2R-TOKENIZATION-HAS-PARSE-TREE?", 2, 0, false);
        declareFunction(me, "l2r_paragraph_reader_maybe_add_parsing_results", "L2R-PARAGRAPH-READER-MAYBE-ADD-PARSING-RESULTS", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_add_parsing_results", "L2R-PARAGRAPH-READER-ADD-PARSING-RESULTS", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_finalize_sentence", "L2R-PARAGRAPH-READER-FINALIZE-SENTENCE", 1, 0, false);
        declareFunction(me, "l2r_finalize_sentence_peg", "L2R-FINALIZE-SENTENCE-PEG", 1, 0, false);
        declareFunction(me, "l2r_paragraph_reader_collect_garbage", "L2R-PARAGRAPH-READER-COLLECT-GARBAGE", 1, 0, false);
        declareFunction(me, "l2r_collect_garbage_for_sentence_pegs", "L2R-COLLECT-GARBAGE-FOR-SENTENCE-PEGS", 1, 0, false);
        declareFunction(me, "l2r_read_paragraph_internal", "L2R-READ-PARAGRAPH-INTERNAL", 2, 2, false);
        declareFunction(me, "l2r_assert_sentence_peg_results", "L2R-ASSERT-SENTENCE-PEG-RESULTS", 1, 0, false);
        declareFunction(me, "l2r_assert_query_spec_results_for_sentence_peg", "L2R-ASSERT-QUERY-SPEC-RESULTS-FOR-SENTENCE-PEG", 2, 0, false);
        declareFunction(me, "l2r_assert_distillation_query_results", "L2R-ASSERT-DISTILLATION-QUERY-RESULTS", 1, 0, false);
        declareFunction(me, "l2r_finalization_query_specs", "L2R-FINALIZATION-QUERY-SPECS", 0, 0, false);
        declareFunction(me, "l2r_garbage_collection_query_specs", "L2R-GARBAGE-COLLECTION-QUERY-SPECS", 0, 0, false);
        declareFunction(me, "l2r_distillation_query_specs", "L2R-DISTILLATION-QUERY-SPECS", 0, 0, false);
        declareFunction(me, "kbq_from_query_running", "KBQ-FROM-QUERY-RUNNING", 1, 0, false);
        declareFunction(me, "l2r_run_finalization_query_for_sentence_peg", "L2R-RUN-FINALIZATION-QUERY-FOR-SENTENCE-PEG", 2, 0, false);
        declareFunction(me, "l2r_print_total_time", "L2R-PRINT-TOTAL-TIME", 2, 1, false);
        declareFunction(me, "l2r_readable_time_string", "L2R-READABLE-TIME-STRING", 1, 1, false);
        declareFunction(me, "launch_long_inference_warner", "LAUNCH-LONG-INFERENCE-WARNER", 0, 0, false);
        declareFunction(me, "warn_about_long_inferences", "WARN-ABOUT-LONG-INFERENCES", 0, 0, false);
        declareFunction(me, "l2r_read_document_sentence", "L2R-READ-DOCUMENT-SENTENCE", 2, 0, false);
        declareFunction(me, "l2r_read_sentence_for_peg", "L2R-READ-SENTENCE-FOR-PEG", 1, 0, false);
        declareFunction(me, "l2r_find_or_assert_linkage_for_peg", "L2R-FIND-OR-ASSERT-LINKAGE-FOR-PEG", 1, 0, false);
        declareFunction(me, "l2r_find_linkage_for_peg", "L2R-FIND-LINKAGE-FOR-PEG", 1, 0, false);
        declareFunction(me, "l2r_assert_linkage_for_peg", "L2R-ASSERT-LINKAGE-FOR-PEG", 1, 0, false);
        declareFunction(me, "l2r_assert_parse_tree_for_linkage", "L2R-ASSERT-PARSE-TREE-FOR-LINKAGE", 3, 0, false);
        declareFunction(me, "l2r_linkage_creation_rules", "L2R-LINKAGE-CREATION-RULES", 0, 0, false);
        declareFunction(me, "l2r_new_tokenization_shell_for_peg", "L2R-NEW-TOKENIZATION-SHELL-FOR-PEG", 2, 0, false);
        declareFunction(me, "l2r_find_tokenization_for_peg", "L2R-FIND-TOKENIZATION-FOR-PEG", 1, 0, false);
        declareFunction(me, "l2r_sentence_peg_text", "L2R-SENTENCE-PEG-TEXT", 1, 0, false);
        declareFunction(me, "l2r_reader_image_find_or_create_document_reader", "L2R-READER-IMAGE-FIND-OR-CREATE-DOCUMENT-READER", 0, 0, false);
        declareFunction(me, "l2r_new_reader_for_document", "L2R-NEW-READER-FOR-DOCUMENT", 1, 0, false);
        declareFunction(me, "l2r_document_reader_print_function_trampoline", "L2R-DOCUMENT-READER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "l2r_document_reader_p", "L2R-DOCUMENT-READER-P", 1, 0, false);
        new learning_reader.$l2r_document_reader_p$UnaryFunction();
        declareFunction(me, "l2r_document_reader_document", "L2R-DOCUMENT-READER-DOCUMENT", 1, 0, false);
        declareFunction(me, "l2r_document_reader_remaining_paragraphs", "L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS", 1, 0, false);
        declareFunction(me, "l2r_document_reader_read_paragraphs", "L2R-DOCUMENT-READER-READ-PARAGRAPHS", 1, 0, false);
        declareFunction(me, "l2r_document_reader_paragraph_reader", "L2R-DOCUMENT-READER-PARAGRAPH-READER", 1, 0, false);
        declareFunction(me, "l2r_document_reader_reading_event", "L2R-DOCUMENT-READER-READING-EVENT", 1, 0, false);
        declareFunction(me, "_csetf_l2r_document_reader_document", "_CSETF-L2R-DOCUMENT-READER-DOCUMENT", 2, 0, false);
        declareFunction(me, "_csetf_l2r_document_reader_remaining_paragraphs", "_CSETF-L2R-DOCUMENT-READER-REMAINING-PARAGRAPHS", 2, 0, false);
        declareFunction(me, "_csetf_l2r_document_reader_read_paragraphs", "_CSETF-L2R-DOCUMENT-READER-READ-PARAGRAPHS", 2, 0, false);
        declareFunction(me, "_csetf_l2r_document_reader_paragraph_reader", "_CSETF-L2R-DOCUMENT-READER-PARAGRAPH-READER", 2, 0, false);
        declareFunction(me, "_csetf_l2r_document_reader_reading_event", "_CSETF-L2R-DOCUMENT-READER-READING-EVENT", 2, 0, false);
        declareFunction(me, "make_l2r_document_reader", "MAKE-L2R-DOCUMENT-READER", 0, 1, false);
        declareFunction(me, "visit_defstruct_l2r_document_reader", "VISIT-DEFSTRUCT-L2R-DOCUMENT-READER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_l2r_document_reader_method", "VISIT-DEFSTRUCT-OBJECT-L2R-DOCUMENT-READER-METHOD", 2, 0, false);
        declareFunction(me, "print_l2r_document_reader", "PRINT-L2R-DOCUMENT-READER", 3, 0, false);
        declareFunction(me, "new_l2r_document_reader", "NEW-L2R-DOCUMENT-READER", 2, 0, false);
        declareFunction(me, "get_l2r_reader_image_document_reader", "GET-L2R-READER-IMAGE-DOCUMENT-READER", 0, 0, false);
        declareFunction(me, "set_l2r_reader_image_document_reader", "SET-L2R-READER-IMAGE-DOCUMENT-READER", 1, 0, false);
        declareFunction(me, "l2r_document_reader_read_document", "L2R-DOCUMENT-READER-READ-DOCUMENT", 1, 0, false);
        declareFunction(me, "l2r_document_reader_find_or_create_paragraph_reader", "L2R-DOCUMENT-READER-FIND-OR-CREATE-PARAGRAPH-READER", 1, 0, false);
        declareFunction(me, "l2r_document_reader_get_new_paragraph_reader", "L2R-DOCUMENT-READER-GET-NEW-PARAGRAPH-READER", 1, 0, false);
        declareFunction(me, "l2r_pick_document_to_read", "L2R-PICK-DOCUMENT-TO-READ", 0, 0, false);
        declareFunction(me, "starts_before_starting_ofP", "STARTS-BEFORE-STARTING-OF?", 2, 0, false);
        declareFunction(me, "l2r_image_file", "L2R-IMAGE-FILE", 1, 1, false);
        declareFunction(me, "write_l2r_image_for_document", "WRITE-L2R-IMAGE-FOR-DOCUMENT", 1, 1, false);
        declareFunction(me, "l2r_find_or_create_document_paragraphs", "L2R-FIND-OR-CREATE-DOCUMENT-PARAGRAPHS", 1, 1, false);
        declareFunction(me, "l2r_find_or_create_webpage_paragraphs", "L2R-FIND-OR-CREATE-WEBPAGE-PARAGRAPHS", 3, 0, false);
        declareFunction(me, "l2r_download_webpage", "L2R-DOWNLOAD-WEBPAGE", 1, 0, false);
        declareFunction(me, "l2r_most_recent_webpage_download", "L2R-MOST-RECENT-WEBPAGE-DOWNLOAD", 1, 0, false);
        declareFunction(me, "l2r_find_webpage_paragraphs", "L2R-FIND-WEBPAGE-PARAGRAPHS", 1, 2, false);
        declareFunction(me, "l2r_reify_webpage_paragraphs", "L2R-REIFY-WEBPAGE-PARAGRAPHS", 1, 2, false);
        declareFunction(me, "l2r_identify_webpage_paragraphs", "L2R-IDENTIFY-WEBPAGE-PARAGRAPHS", 2, 0, false);
        declareFunction(me, "l2r_find_next_webpage_paragraph", "L2R-FIND-NEXT-WEBPAGE-PARAGRAPH", 4, 0, false);
        declareFunction(me, "l2r_reify_one_webpage_paragraph", "L2R-REIFY-ONE-WEBPAGE-PARAGRAPH", 4, 0, false);
        declareFunction(me, "l2r_best_webpage_source", "L2R-BEST-WEBPAGE-SOURCE", 1, 1, false);
        declareFunction(me, "l2r_reify_sentence_level_pegs_for_document", "L2R-REIFY-SENTENCE-LEVEL-PEGS-FOR-DOCUMENT", 1, 0, false);
        declareFunction(me, "l2r_reify_peg_for_sentence", "L2R-REIFY-PEG-FOR-SENTENCE", 2, 0, false);
        declareFunction(me, "l2r_find_or_reify_peg_for_sentence_string", "L2R-FIND-OR-REIFY-PEG-FOR-SENTENCE-STRING", 5, 0, false);
        declareFunction(me, "l2r_find_sentence_peg_from_sentences", "L2R-FIND-SENTENCE-PEG-FROM-SENTENCES", 2, 0, false);
        declareFunction(me, "clear_l2r_sentence_level_peg_creation_template", "CLEAR-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE", 0, 0, false);
        declareFunction(me, "remove_l2r_sentence_level_peg_creation_template", "REMOVE-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE", 0, 0, false);
        declareFunction(me, "l2r_sentence_level_peg_creation_template_internal", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-INTERNAL", 0, 0, false);
        declareFunction(me, "l2r_sentence_level_peg_creation_template", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE", 0, 0, false);
        declareFunction(me, "clear_l2r_sentence_level_peg_exemplar", "CLEAR-L2R-SENTENCE-LEVEL-PEG-EXEMPLAR", 0, 0, false);
        declareFunction(me, "remove_l2r_sentence_level_peg_exemplar", "REMOVE-L2R-SENTENCE-LEVEL-PEG-EXEMPLAR", 0, 0, false);
        declareFunction(me, "l2r_sentence_level_peg_exemplar_internal", "L2R-SENTENCE-LEVEL-PEG-EXEMPLAR-INTERNAL", 0, 0, false);
        declareFunction(me, "l2r_sentence_level_peg_exemplar", "L2R-SENTENCE-LEVEL-PEG-EXEMPLAR", 0, 0, false);
        declareFunction(me, "l2r_sentence_level_peg_creation_rules", "L2R-SENTENCE-LEVEL-PEG-CREATION-RULES", 0, 0, false);
        declareFunction(me, "clear_l2r_sentence_level_peg_creation_template_sentences", "CLEAR-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        declareFunction(me, "remove_l2r_sentence_level_peg_creation_template_sentences", "REMOVE-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        declareFunction(me, "l2r_sentence_level_peg_creation_template_sentences_internal", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES-INTERNAL", 0, 0, false);
        declareFunction(me, "l2r_sentence_level_peg_creation_template_sentences", "L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        declareFunction(me, "l2r_dereference_sentence_level_peg_assertion_sentence", "L2R-DEREFERENCE-SENTENCE-LEVEL-PEG-ASSERTION-SENTENCE", 7, 0, false);
        declareFunction(me, "clear_l2r_document_indexical", "CLEAR-L2R-DOCUMENT-INDEXICAL", 0, 0, false);
        declareFunction(me, "remove_l2r_document_indexical", "REMOVE-L2R-DOCUMENT-INDEXICAL", 0, 0, false);
        declareFunction(me, "l2r_document_indexical_internal", "L2R-DOCUMENT-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction(me, "l2r_document_indexical", "L2R-DOCUMENT-INDEXICAL", 0, 0, false);
        declareFunction(me, "clear_l2r_sentence_indexical", "CLEAR-L2R-SENTENCE-INDEXICAL", 0, 0, false);
        declareFunction(me, "remove_l2r_sentence_indexical", "REMOVE-L2R-SENTENCE-INDEXICAL", 0, 0, false);
        declareFunction(me, "l2r_sentence_indexical_internal", "L2R-SENTENCE-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction(me, "l2r_sentence_indexical", "L2R-SENTENCE-INDEXICAL", 0, 0, false);
        declareFunction(me, "clear_l2r_supertext_indexical", "CLEAR-L2R-SUPERTEXT-INDEXICAL", 0, 0, false);
        declareFunction(me, "remove_l2r_supertext_indexical", "REMOVE-L2R-SUPERTEXT-INDEXICAL", 0, 0, false);
        declareFunction(me, "l2r_supertext_indexical_internal", "L2R-SUPERTEXT-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction(me, "l2r_supertext_indexical", "L2R-SUPERTEXT-INDEXICAL", 0, 0, false);
        declareFunction(me, "clear_l2r_sentence_string_indexical", "CLEAR-L2R-SENTENCE-STRING-INDEXICAL", 0, 0, false);
        declareFunction(me, "remove_l2r_sentence_string_indexical", "REMOVE-L2R-SENTENCE-STRING-INDEXICAL", 0, 0, false);
        declareFunction(me, "l2r_sentence_string_indexical_internal", "L2R-SENTENCE-STRING-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction(me, "l2r_sentence_string_indexical", "L2R-SENTENCE-STRING-INDEXICAL", 0, 0, false);
        declareFunction(me, "clear_l2r_sentence_number_indexical", "CLEAR-L2R-SENTENCE-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction(me, "remove_l2r_sentence_number_indexical", "REMOVE-L2R-SENTENCE-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction(me, "l2r_sentence_number_indexical_internal", "L2R-SENTENCE-NUMBER-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction(me, "l2r_sentence_number_indexical", "L2R-SENTENCE-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction(me, "clear_l2r_sentence_string_number_indexical", "CLEAR-L2R-SENTENCE-STRING-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction(me, "remove_l2r_sentence_string_number_indexical", "REMOVE-L2R-SENTENCE-STRING-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction(me, "l2r_sentence_string_number_indexical_internal", "L2R-SENTENCE-STRING-NUMBER-INDEXICAL-INTERNAL", 0, 0, false);
        declareFunction(me, "l2r_sentence_string_number_indexical", "L2R-SENTENCE-STRING-NUMBER-INDEXICAL", 0, 0, false);
        declareFunction(me, "get_l2r_sentence_level_peg_creation_template_sentences", "GET-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES", 0, 0, false);
        declareFunction(me, "sentencify_l2r_paragraph", "SENTENCIFY-L2R-PARAGRAPH", 1, 0, false);
        declareFunction(me, "set_l2r_sentence_string", "SET-L2R-SENTENCE-STRING", 1, 1, false);
        declareFunction(me, "l2r_reconstruct_word_string", "L2R-RECONSTRUCT-WORD-STRING", 1, 1, false);
        declareFunction(me, "l2r_word_length", "L2R-WORD-LENGTH", 1, 1, false);
        declareFunction(me, "l2r_word_leading_whitespace", "L2R-WORD-LEADING-WHITESPACE", 1, 0, false);
        declareFunction(me, "l2r_assert_subexpression_links", "L2R-ASSERT-SUBEXPRESSION-LINKS", 3, 0, false);
        declareFunction(me, "l2r_extract_links_from_sentence", "L2R-EXTRACT-LINKS-FROM-SENTENCE", 1, 1, false);
        declareFunction(me, "l2r_sanity_check_subexpression", "L2R-SANITY-CHECK-SUBEXPRESSION", 5, 0, false);
        declareFunction(me, "l2r_sentences_for_document", "L2R-SENTENCES-FOR-DOCUMENT", 1, 0, false);
        declareFunction(me, "clear_l2r_document_sentence_finder_kbq", "CLEAR-L2R-DOCUMENT-SENTENCE-FINDER-KBQ", 0, 0, false);
        declareFunction(me, "remove_l2r_document_sentence_finder_kbq", "REMOVE-L2R-DOCUMENT-SENTENCE-FINDER-KBQ", 0, 0, false);
        declareFunction(me, "l2r_document_sentence_finder_kbq_internal", "L2R-DOCUMENT-SENTENCE-FINDER-KBQ-INTERNAL", 0, 0, false);
        declareFunction(me, "l2r_document_sentence_finder_kbq", "L2R-DOCUMENT-SENTENCE-FINDER-KBQ", 0, 0, false);
        declareFunction(me, "l2r_document_sentence_finder_query_sentence", "L2R-DOCUMENT-SENTENCE-FINDER-QUERY-SENTENCE", 1, 0, false);
        declareFunction(me, "simple_assert_linkages_for_page", "SIMPLE-ASSERT-LINKAGES-FOR-PAGE", 1, 1, false);
        declareFunction(me, "l2r_cyclify_webpage", "L2R-CYCLIFY-WEBPAGE", 2, 1, false);
        declareFunction(me, "l2r_write_webpage_links", "L2R-WRITE-WEBPAGE-LINKS", 3, 0, false);
        declareFunction(me, "l2r_cyclify_wikipedia_pages_for_unknown_phrases", "L2R-CYCLIFY-WIKIPEDIA-PAGES-FOR-UNKNOWN-PHRASES", 1, 0, false);
        declareFunction(me, "l2r_get_unknown_phrase_wikipedia_links_from_file", "L2R-GET-UNKNOWN-PHRASE-WIKIPEDIA-LINKS-FROM-FILE", 1, 0, false);
        declareFunction(me, "extract_link_relative_url", "EXTRACT-LINK-RELATIVE-URL", 1, 0, false);
        declareFunction(me, "unknown_phrase_wikipedia_linkP", "UNKNOWN-PHRASE-WIKIPEDIA-LINK?", 1, 0, false);
        declareFunction(me, "unknown_phrase_linkP", "UNKNOWN-PHRASE-LINK?", 1, 0, false);
        declareFunction(me, "l2r_save_new_webpage_sentences", "L2R-SAVE-NEW-WEBPAGE-SENTENCES", 4, 0, false);
        declareFunction(me, "l2r_cyclify_unparsed_sentences", "L2R-CYCLIFY-UNPARSED-SENTENCES", 1, 0, false);
        declareFunction(me, "l2r_log_cyclifications_for_unparsed_sentences", "L2R-LOG-CYCLIFICATIONS-FOR-UNPARSED-SENTENCES", 1, 0, false);
        declareFunction(me, "html_eos_open_tags", "HTML-EOS-OPEN-TAGS", 0, 0, false);
        declareFunction(me, "html_eos_close_tags", "HTML-EOS-CLOSE-TAGS", 0, 0, false);
        declareFunction(me, "wikipedia_meta_strings", "WIKIPEDIA-META-STRINGS", 0, 0, false);
        declareFunction(me, "replace_separator_tags_with_eos", "REPLACE-SEPARATOR-TAGS-WITH-EOS", 1, 0, false);
        declareFunction(me, "strip_text_between_tags_of_type", "STRIP-TEXT-BETWEEN-TAGS-OF-TYPE", 2, 0, false);
        declareFunction(me, "strip_wikipedia_page", "STRIP-WIKIPEDIA-PAGE", 1, 0, false);
        declareFunction(me, "probably_wikipedia_meta_sentence_p", "PROBABLY-WIKIPEDIA-META-SENTENCE-P", 1, 0, false);
        declareFunction(me, "detagged_page_as_string", "DETAGGED-PAGE-AS-STRING", 1, 2, false);
        declareFunction(me, "l2r_stringify_one_paragraph", "L2R-STRINGIFY-ONE-PARAGRAPH", 4, 0, false);
        declareFunction(me, "l2r_stringify_one_sentence", "L2R-STRINGIFY-ONE-SENTENCE", 2, 0, false);
        declareFunction(me, "detagged_page_as_string_old", "DETAGGED-PAGE-AS-STRING-OLD", 1, 2, false);
        declareFunction(me, "page_to_detagged_sentence_strings", "PAGE-TO-DETAGGED-SENTENCE-STRINGS", 1, 2, false);
        declareFunction(me, "parse_and_partition_document_file", "PARSE-AND-PARTITION-DOCUMENT-FILE", 2, 3, false);
        declareFunction(me, "read_topic_struct_paragraphs_from_file", "READ-TOPIC-STRUCT-PARAGRAPHS-FROM-FILE", 1, 0, false);
        declareFunction(me, "parse_and_partition_paragraph_texts", "PARSE-AND-PARTITION-PARAGRAPH-TEXTS", 2, 3, false);
        declareFunction(me, "partioned_parse_results_file_name", "PARTIONED-PARSE-RESULTS-FILE-NAME", 2, 0, false);
        declareFunction(me, "write_partioned_parse_results", "WRITE-PARTIONED-PARSE-RESULTS", 5, 0, false);
        declareFunction(me, "write_partioned_parse_result", "WRITE-PARTIONED-PARSE-RESULT", 2, 0, false);
        declareFunction(me, "l2r_paragraph_candidate_noun_compounds", "L2R-PARAGRAPH-CANDIDATE-NOUN-COMPOUNDS", 1, 0, false);
        declareFunction(me, "l2r_sentence_candidate_noun_compounds", "L2R-SENTENCE-CANDIDATE-NOUN-COMPOUNDS", 1, 0, false);
        declareFunction(me, "initialize_l2r_noun_compound_patterns", "INITIALIZE-L2R-NOUN-COMPOUND-PATTERNS", 0, 0, false);
        declareFunction(me, "l2r_noun_compound_patterns", "L2R-NOUN-COMPOUND-PATTERNS", 0, 0, false);
        declareFunction(me, "initialize_l2r_noun_compound_tagger", "INITIALIZE-L2R-NOUN-COMPOUND-TAGGER", 0, 0, false);
        declareFunction(me, "l2r_noun_compound_tagger", "L2R-NOUN-COMPOUND-TAGGER", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_learning_reader_file() {
        deflexical("*LEARNING-READER-TIMESTAMP*", numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED));
        deflexical("*L2R-EBMT-INDEX-HOST*", $str4$cyc8_cyc_com);
        deflexical("*L2R-EBMT-INDEX-PORT*", $int$7779);
        deflexical("*L2R-EBMT-INDEX-CONTENT*", $str6$_cyc_projects_reading_learning_da);
        deflexical("*L2R-EBMT-INDEX-LOG*", $str7$_cyc_projects_reading_learning_da);
        defparameter("*L2R-TRANSMIT-OPERATIONS?*", NIL);
        defparameter("*L2R-READER-UNSTABLE-INSIDE-STEPS?*", T);
        defconstant("*DTP-L2R-PARAGRAPH-READER*", L2R_PARAGRAPH_READER);
        defparameter("*L2R-FINALIZATION-PROBLEM-STORE*", NIL);
        deflexical("*LONG-INFERENCE-CUTOFF*", $int$600);
        defparameter("*CURRENT-LONG-INFERENCE-INFO*", NIL);
        defconstant("*DTP-L2R-DOCUMENT-READER*", L2R_DOCUMENT_READER);
        deflexical("*L2R-READER-IMAGE-DOCUMENT-READER*", SubLTrampolineFile.maybeDefault($sym242$_L2R_READER_IMAGE_DOCUMENT_READER_, $l2r_reader_image_document_reader$, NIL));
        deflexical("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-CACHING-STATE*", NIL);
        deflexical("*L2R-SENTENCE-LEVEL-PEG-EXEMPLAR-CACHING-STATE*", NIL);
        deflexical("*L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES-CACHING-STATE*", NIL);
        deflexical("*L2R-DOCUMENT-INDEXICAL-CACHING-STATE*", NIL);
        deflexical("*L2R-SENTENCE-INDEXICAL-CACHING-STATE*", NIL);
        deflexical("*L2R-SUPERTEXT-INDEXICAL-CACHING-STATE*", NIL);
        deflexical("*L2R-SENTENCE-STRING-INDEXICAL-CACHING-STATE*", NIL);
        deflexical("*L2R-SENTENCE-NUMBER-INDEXICAL-CACHING-STATE*", NIL);
        deflexical("*L2R-SENTENCE-STRING-NUMBER-INDEXICAL-CACHING-STATE*", NIL);
        deflexical("*L2R-DOCUMENT-SENTENCE-FINDER-KBQ-CACHING-STATE*", NIL);
        deflexical("*HTML-IMPLICIT-EOS-TAGS*", $list402);
        deflexical("*HTML-EOS-OPEN-TAGS*", NIL);
        deflexical("*HTML-EOS-CLOSE-TAGS*", NIL);
        deflexical("*WIKIPEDIA-META-STRINGS*", $list407);
        deflexical("*L2R-NOUN-COMPOUND-PATTERNS*", $UNINITIALIZED);
        deflexical("*L2R-NOUN-COMPOUND-CATEGORY-PAIRS", $list456);
        deflexical("*L2R-NOUN-COMPOUND-TAGGER*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_learning_reader_file() {
        register_kb_function(ADD_TEXT_LEARNER_EBMT_TRAINING_EXAMPLE);
        register_macro_helper(L2R_IMAGE_ELAPSED_CPU_TIME, L2R_COMPUTING_CPU_TIME);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_l2r_paragraph_reader$.getGlobalValue(), symbol_function(L2R_PARAGRAPH_READER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list40);
        def_csetf(L2R_PARAGRAPH_READER_PARAGRAPH, _CSETF_L2R_PARAGRAPH_READER_PARAGRAPH);
        def_csetf(L2R_PARAGRAPH_READER_DOCUMENT, _CSETF_L2R_PARAGRAPH_READER_DOCUMENT);
        def_csetf(L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML, _CSETF_L2R_PARAGRAPH_READER_PARAGRAPH_SOURCE_HTML);
        def_csetf(L2R_PARAGRAPH_READER_SENTENCE_VECTOR, _CSETF_L2R_PARAGRAPH_READER_SENTENCE_VECTOR);
        def_csetf(L2R_PARAGRAPH_READER_SENTENCE_PEGS, _CSETF_L2R_PARAGRAPH_READER_SENTENCE_PEGS);
        def_csetf(L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS, _CSETF_L2R_PARAGRAPH_READER_SENTENCE_NON_HTML_TEXTS);
        def_csetf(L2R_PARAGRAPH_READER_SENTENCE_NUMBER, _CSETF_L2R_PARAGRAPH_READER_SENTENCE_NUMBER);
        def_csetf(L2R_PARAGRAPH_READER_LINKAGE, _CSETF_L2R_PARAGRAPH_READER_LINKAGE);
        def_csetf(L2R_PARAGRAPH_READER_LINKAGE_FORT, _CSETF_L2R_PARAGRAPH_READER_LINKAGE_FORT);
        def_csetf(L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT, _CSETF_L2R_PARAGRAPH_READER_INITIAL_ASSERTION_COUNT);
        def_csetf(L2R_PARAGRAPH_READER_TOTAL_TIME, _CSETF_L2R_PARAGRAPH_READER_TOTAL_TIME);
        def_csetf(L2R_PARAGRAPH_READER_TOTAL_CPU_TIME, _CSETF_L2R_PARAGRAPH_READER_TOTAL_CPU_TIME);
        def_csetf(L2R_PARAGRAPH_READER_SENTENCE_TIME, _CSETF_L2R_PARAGRAPH_READER_SENTENCE_TIME);
        def_csetf(L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME, _CSETF_L2R_PARAGRAPH_READER_SENTENCE_CPU_TIME);
        def_csetf(L2R_PARAGRAPH_READER_STATE, _CSETF_L2R_PARAGRAPH_READER_STATE);
        identity(L2R_PARAGRAPH_READER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_l2r_paragraph_reader$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_L2R_PARAGRAPH_READER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_l2r_document_reader$.getGlobalValue(), symbol_function(L2R_DOCUMENT_READER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list224);
        def_csetf(L2R_DOCUMENT_READER_DOCUMENT, _CSETF_L2R_DOCUMENT_READER_DOCUMENT);
        def_csetf(L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS, _CSETF_L2R_DOCUMENT_READER_REMAINING_PARAGRAPHS);
        def_csetf(L2R_DOCUMENT_READER_READ_PARAGRAPHS, _CSETF_L2R_DOCUMENT_READER_READ_PARAGRAPHS);
        def_csetf(L2R_DOCUMENT_READER_PARAGRAPH_READER, _CSETF_L2R_DOCUMENT_READER_PARAGRAPH_READER);
        def_csetf(L2R_DOCUMENT_READER_READING_EVENT, _CSETF_L2R_DOCUMENT_READER_READING_EVENT);
        identity(L2R_DOCUMENT_READER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_l2r_document_reader$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_L2R_DOCUMENT_READER_METHOD));
        declare_defglobal($sym242$_L2R_READER_IMAGE_DOCUMENT_READER_);
        memoization_state.note_globally_cached_function(L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE);
        memoization_state.note_globally_cached_function(L2R_SENTENCE_LEVEL_PEG_EXEMPLAR);
        memoization_state.note_globally_cached_function(L2R_SENTENCE_LEVEL_PEG_CREATION_TEMPLATE_SENTENCES);
        memoization_state.note_globally_cached_function(L2R_DOCUMENT_INDEXICAL);
        memoization_state.note_globally_cached_function(L2R_SENTENCE_INDEXICAL);
        memoization_state.note_globally_cached_function(L2R_SUPERTEXT_INDEXICAL);
        memoization_state.note_globally_cached_function(L2R_SENTENCE_STRING_INDEXICAL);
        memoization_state.note_globally_cached_function(L2R_SENTENCE_NUMBER_INDEXICAL);
        memoization_state.note_globally_cached_function(L2R_SENTENCE_STRING_NUMBER_INDEXICAL);
        memoization_state.note_globally_cached_function(L2R_DOCUMENT_SENTENCE_FINDER_KBQ);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_learning_reader_file();
    }

    @Override
    public void initializeVariables() {
        init_learning_reader_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_learning_reader_file();
    }

    static {










































































































































































































































































































































































































































































































    }

    public static final class $l2r_paragraph_reader_native extends SubLStructNative {
        public SubLObject $paragraph;

        public SubLObject $document;

        public SubLObject $paragraph_source_html;

        public SubLObject $sentence_vector;

        public SubLObject $sentence_pegs;

        public SubLObject $sentence_non_html_texts;

        public SubLObject $sentence_number;

        public SubLObject $linkage;

        public SubLObject $linkage_fort;

        public SubLObject $initial_assertion_count;

        public SubLObject $total_time;

        public SubLObject $total_cpu_time;

        public SubLObject $sentence_time;

        public SubLObject $sentence_cpu_time;

        public SubLObject $state;

        private static final SubLStructDeclNative structDecl;

        public $l2r_paragraph_reader_native() {
            this.$paragraph = Lisp.NIL;
            this.$document = Lisp.NIL;
            this.$paragraph_source_html = Lisp.NIL;
            this.$sentence_vector = Lisp.NIL;
            this.$sentence_pegs = Lisp.NIL;
            this.$sentence_non_html_texts = Lisp.NIL;
            this.$sentence_number = Lisp.NIL;
            this.$linkage = Lisp.NIL;
            this.$linkage_fort = Lisp.NIL;
            this.$initial_assertion_count = Lisp.NIL;
            this.$total_time = Lisp.NIL;
            this.$total_cpu_time = Lisp.NIL;
            this.$sentence_time = Lisp.NIL;
            this.$sentence_cpu_time = Lisp.NIL;
            this.$state = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$paragraph;
        }

        @Override
        public SubLObject getField3() {
            return this.$document;
        }

        @Override
        public SubLObject getField4() {
            return this.$paragraph_source_html;
        }

        @Override
        public SubLObject getField5() {
            return this.$sentence_vector;
        }

        @Override
        public SubLObject getField6() {
            return this.$sentence_pegs;
        }

        @Override
        public SubLObject getField7() {
            return this.$sentence_non_html_texts;
        }

        @Override
        public SubLObject getField8() {
            return this.$sentence_number;
        }

        @Override
        public SubLObject getField9() {
            return this.$linkage;
        }

        @Override
        public SubLObject getField10() {
            return this.$linkage_fort;
        }

        @Override
        public SubLObject getField11() {
            return this.$initial_assertion_count;
        }

        @Override
        public SubLObject getField12() {
            return this.$total_time;
        }

        @Override
        public SubLObject getField13() {
            return this.$total_cpu_time;
        }

        @Override
        public SubLObject getField14() {
            return this.$sentence_time;
        }

        @Override
        public SubLObject getField15() {
            return this.$sentence_cpu_time;
        }

        @Override
        public SubLObject getField16() {
            return this.$state;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$paragraph = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$document = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$paragraph_source_html = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$sentence_vector = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$sentence_pegs = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$sentence_non_html_texts = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$sentence_number = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$linkage = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$linkage_fort = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$initial_assertion_count = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$total_time = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$total_cpu_time = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$sentence_time = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return this.$sentence_cpu_time = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return this.$state = value;
        }

        static {
            structDecl = makeStructDeclNative(learning_reader.$l2r_paragraph_reader_native.class, L2R_PARAGRAPH_READER, L2R_PARAGRAPH_READER_P, $list34, $list35, new String[]{ "$paragraph", "$document", "$paragraph_source_html", "$sentence_vector", "$sentence_pegs", "$sentence_non_html_texts", "$sentence_number", "$linkage", "$linkage_fort", "$initial_assertion_count", "$total_time", "$total_cpu_time", "$sentence_time", "$sentence_cpu_time", "$state" }, $list36, $list37, PRINT_L2R_PARAGRAPH_READER);
        }
    }

    public static final class $l2r_paragraph_reader_p$UnaryFunction extends UnaryFunction {
        public $l2r_paragraph_reader_p$UnaryFunction() {
            super(extractFunctionNamed("L2R-PARAGRAPH-READER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return l2r_paragraph_reader_p(arg1);
        }
    }

    public static final class $l2r_document_reader_native extends SubLStructNative {
        public SubLObject $document;

        public SubLObject $remaining_paragraphs;

        public SubLObject $read_paragraphs;

        public SubLObject $paragraph_reader;

        public SubLObject $reading_event;

        private static final SubLStructDeclNative structDecl;

        public $l2r_document_reader_native() {
            this.$document = Lisp.NIL;
            this.$remaining_paragraphs = Lisp.NIL;
            this.$read_paragraphs = Lisp.NIL;
            this.$paragraph_reader = Lisp.NIL;
            this.$reading_event = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$document;
        }

        @Override
        public SubLObject getField3() {
            return this.$remaining_paragraphs;
        }

        @Override
        public SubLObject getField4() {
            return this.$read_paragraphs;
        }

        @Override
        public SubLObject getField5() {
            return this.$paragraph_reader;
        }

        @Override
        public SubLObject getField6() {
            return this.$reading_event;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$document = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$remaining_paragraphs = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$read_paragraphs = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$paragraph_reader = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$reading_event = value;
        }

        static {
            structDecl = makeStructDeclNative(learning_reader.$l2r_document_reader_native.class, L2R_DOCUMENT_READER, L2R_DOCUMENT_READER_P, $list218, $list219, new String[]{ "$document", "$remaining_paragraphs", "$read_paragraphs", "$paragraph_reader", "$reading_event" }, $list220, $list221, PRINT_L2R_DOCUMENT_READER);
        }
    }

    public static final class $l2r_document_reader_p$UnaryFunction extends UnaryFunction {
        public $l2r_document_reader_p$UnaryFunction() {
            super(extractFunctionNamed("L2R-DOCUMENT-READER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return l2r_document_reader_p(arg1);
        }
    }
}

/**
 * Total time: 2097 ms
 */
